Add-Type -AssemblyName System.Web

function Decode-Html([string]$value) {
    [System.Web.HttpUtility]::HtmlDecode($value)
}

function Normalize-Key([string]$value) {
    if ([string]::IsNullOrWhiteSpace($value)) { return '' }
    return (($value.ToLowerInvariant() -replace '&', 'and') -replace '[^a-z0-9]+', ' ').Trim()
}

function Extract-CatalogIndex([string]$catalogPath) {
    $lines = Get-Content $catalogPath
    $index = @{}
    $currentName = $null
    foreach ($line in $lines) {
        $trim = $line.Trim()
        if ($trim -match '^nameEn = "([^"]+)"') {
            $currentName = $Matches[1]
            $key = Normalize-Key $currentName
            if ($key) { $index[$key] = $currentName }
            continue
        }
        if ($trim -match '^nameFr = "([^"]+)"' -and $currentName) {
            $key = Normalize-Key $Matches[1]
            if ($key -and -not $index.ContainsKey($key)) { $index[$key] = $currentName }
            continue
        }
        if ($trim -match '^aliases(?:En|Fr) = listOf\((.+)\)' -and $currentName) {
            foreach ($alias in [regex]::Matches($Matches[1], '"([^"]+)"')) {
                $key = Normalize-Key $alias.Groups[1].Value
                if ($key -and -not $index.ContainsKey($key)) { $index[$key] = $currentName }
            }
        }
    }
    return $index
}

$directCanonicalization = @{
    'all purpose flour' = 'all-purpose flour'
    'unbleached all-purpose flour' = 'all-purpose flour'
    'flour' = 'all-purpose flour'
    'pure vanilla extract' = 'vanilla extract'
    'vanilla' = 'vanilla extract'
    'whole milk' = 'milk'
    'cold milk' = 'milk'
    'heavy whipping cream' = 'heavy cream'
    'whipping cream' = 'heavy cream'
    'cold heavy cream' = 'heavy cream'
    'cold heavy whipping cream' = 'heavy cream'
    'cream 33' = 'heavy cream'
    '35 cream' = 'heavy cream'
    'powdered sugar' = 'icing sugar'
    'confectioners sugar' = 'icing sugar'
    'light brown sugar' = 'brown sugar'
    'packed light brown sugar' = 'brown sugar'
    'old fashion rolled oats' = 'rolled oats'
    'old fashioned rolled oats' = 'rolled oats'
    'rolled oat' = 'rolled oats'
    'semi sweet chocolate' = 'semisweet chocolate'
    'unsweetened chocolate' = 'unsweetened chocolate'
    'garbanzo beans' = 'chickpeas'
    'black beans drained' = 'black beans'
    'garbanzo beans drained' = 'chickpeas'
    'yellow onion' = 'onion'
    'chopped yellow onion' = 'onion'
    'garlic cloves' = 'garlic'
    'minced garlic' = 'garlic'
    'fresh garlic' = 'garlic'
    'egg whites' = 'egg white'
    'egg yolks' = 'egg yolk'
    'plain greek yogurt' = 'plain yogurt'
    'greek yogurt' = 'plain yogurt'
    'full fat sour cream' = 'sour cream'
    'flaked coconut' = 'shredded coconut'
    'coconut flakes' = 'shredded coconut'
    'smoked paprika' = 'smoked paprika'
    'hot water' = 'water'
    'boiling water' = 'water'
    'ice water' = 'water'
    'cold water' = 'water'
    'cold buttermilk' = 'buttermilk'
    'pistachio nuts' = 'pistachios'
    'plus 2 tablespoons water' = 'water'
    'salt and pepper' = 'salt and pepper'
    'cooking oil' = 'vegetable oil'
    'corn starch' = 'cornstarch'
    'cup flour' = 'all-purpose flour'
    'cups all-purpose flour' = 'all-purpose flour'
    'all-purpose flour 240g' = 'all-purpose flour'
    'clove garlic' = 'garlic'
    'coarse salt' = 'salt'
    'creamy peanut butter' = 'natural peanut butter'
    'canned unsweetened coconut milk' = 'coconut milk'
    'bbq sauce' = 'BBQ sauce'
    'cardamom' = 'ground cardamom'
    'bread crumbs' = 'bread crumbs'
    'baby spinach' = 'baby spinach'
    'broccoli' = 'broccoli'
    'bunch asparagus' = 'asparagus'
    'asparagus' = 'asparagus'
    'chili powder' = 'chili powder'
    'cloves' = 'ground cloves'
    'cream cheese' = 'cream cheese'
    'sprinkles' = 'sprinkles'
    'all spice' = 'allspice'
    'cilantro' = 'cilantro'
    'cream of tartar' = 'cream of tartar'
    'box of cranberries' = 'cranberries'
    'cranberries' = 'cranberries'
    'custard powder' = 'custard powder'
    'curry paste' = 'curry paste'
    'curry powder' = 'curry powder'
    'chipotle in adobo' = 'chipotle in adobo'
    'dijon mustard' = 'Dijon mustard'
    'distilled white vinegar' = 'white vinegar'
    'white vinegar' = 'white vinegar'
    'bananas' = 'banana'
    'homemade almond paste' = 'almond paste'
}
$leadingDescriptors = @('finely chopped','coarsely chopped','pitted and chopped','lightly beaten','at room temperature','room temperature','spooned and leveled','old-fashion','old-fashioned','over-ripe','full fat','packed','fresh','cold','hot','boiling','ice','unbleached','chopped','minced','softened','melted','sifted','crushed','diced','toasted','cubed','chilled','lukewarm','large','small','medium')
$ignoreCandidates = @('optional','divided','to taste','softened','chopped','minced','melted','room temperature','at room temperature','finely chopped','coarsely chopped','lightly beaten','sifted','crushed','diced','vegetable','whole','extra','more','needed','filling','fresh','frozen','bars')

function Strip-QuantityPrefix([string]$value) {
    $pattern = '^(?:about\s+)?(?:[0-9¼½¾??????/.,\s-]+|one|two|three|four|five|six|seven|eight|nine|ten)+(?:and\s+[0-9¼½¾??????/.,\s-]+)?\s*(?:oz|ounce|ounces|g|kg|ml|l|lb|lbs|cup|cups|tbsp|tablespoon|tablespoons|tsp|teaspoon|teaspoons|large|small|medium|clove|cloves|slice|slices|stick|sticks|can|cans|jar|jars|package|packages)?\s+'
    $result = $value.Trim()
    for ($i = 0; $i -lt 3; $i++) {
        $updated = [regex]::Replace($result, $pattern, '', 'IgnoreCase')
        if ($updated -eq $result) { break }
        $result = $updated.Trim()
    }
    return $result
}

function Normalize-Candidate([string]$raw) {
    $value = $raw.Trim()
    if (-not $value) { return $null }
    $value = [regex]::Replace($value, '\([^)]*\)', ' ')
    $value = [regex]::Replace($value, '(?i)^[a-z ]+ideas\s*', '')
    $value = [regex]::Replace($value, '(?i)^any\s+', '')
    $value = [regex]::Replace($value, '(?i)^extra\s+', '')
    $value = [regex]::Replace($value, '(?i)^raw\s+', '')
    $value = [regex]::Replace($value, '(?i)^of\s+', '')
    $value = [regex]::Replace($value, '(?i)^de\s+', '')
    $value = Strip-QuantityPrefix $value
    $value = $value.Split(',')[0].Trim()
    $value = $value.Split(';')[0].Trim()
    $value = [regex]::Replace($value, '(?i)\s+for .*$', '')
    $value = [regex]::Replace($value, '(?i)\s+plus .*$', '')
    $value = [regex]::Replace($value, '(?i)\s+as needed.*$', '')
    $value = [regex]::Replace($value, '(?i)\s+if needed.*$', '')
    $value = [regex]::Replace($value, '(?i)\s+to taste.*$', '')
    $value = [regex]::Replace($value, '(?i)\s+on top.*$', '')
    foreach ($descriptor in $leadingDescriptors) {
        $value = [regex]::Replace($value, ('(?i)^' + [regex]::Escape($descriptor) + '\s+'), '')
    }
    $value = [regex]::Replace($value, '(?i)\bdrained\b', '')
    $value = [regex]::Replace($value, '(?i)\boptional\b', '')
    $value = [regex]::Replace($value, '(?i)\bdivided\b', '')
    $value = [regex]::Replace($value, '(?i)\bfreshly ground\b', '')
    $value = [regex]::Replace($value, '(?i)\bground\s+black\s+pepper\b', 'black pepper')
    $value = [regex]::Replace($value, '(?i)\bunsweetened natural\b', 'unsweetened natural cocoa powder')
    $value = [regex]::Replace($value, '\s+', ' ')
    $value = $value.Trim(' ','.',':','*').ToLowerInvariant()
    foreach ($prefix in @('of ','de ','du ','des ','the ','a ','an ')) {
        if ($value.StartsWith($prefix)) { $value = $value.Substring($prefix.Length) }
    }
    $value = $value.Trim()
    if (-not $value -or $ignoreCandidates -contains $value) { return $null }
    $key = Normalize-Key $value
    if ($directCanonicalization.ContainsKey($key)) { return $directCanonicalization[$key] }
    return $value
}

function Extract-Candidates([string]$line) {
    $decoded = (Decode-Html $line).Trim()
    if (-not $decoded) { return @() }
    $englishSide = if ($decoded.Contains(' - ')) { ($decoded -split ' - ', 2)[1].Trim() } else { $decoded }
    foreach ($phrase in @('Optional Sweetness:','Flavor Ideas:','Mix-in Ideas:','Facultatif :','Facultatif:','Optional:')) {
        if ($englishSide.StartsWith($phrase, [System.StringComparison]::OrdinalIgnoreCase)) {
            $englishSide = $englishSide.Substring($phrase.Length).Trim()
            break
        }
    }
    $splitPattern = if ($decoded.Contains(':')) { '\s+or\s+|\s*,\s*' } else { '\s+or\s+' }
    $results = New-Object System.Collections.Generic.List[string]
    foreach ($segment in ($englishSide -split $splitPattern)) {
        $candidate = Normalize-Candidate $segment
        if (-not $candidate) { continue }
        $expanded = if ($candidate -eq 'salt and pepper') { @('salt', 'black pepper') } else { @($candidate) }
        foreach ($item in $expanded) {
            if (-not $results.Contains($item)) { $results.Add($item) }
        }
    }
    return $results
}

$catalogIndex = Extract-CatalogIndex 'app\src\main\java\app\recipebook\data\local\recipes\BundledIngredientCatalog.kt'
$html = Get-Content 'docs\exported-recipe-lists\RecipeKeeper_20260320_143058\recipes.html' -Raw
$titles = [regex]::Matches($html, '<h2 itemprop="name">([\s\S]*?)</h2>') | ForEach-Object { Decode-Html($_.Groups[1].Value).Trim() }
$blocks = [regex]::Matches($html, '<div class="recipe-ingredients" itemprop="recipeIngredients">([\s\S]*?)</div>')
$matched = @{}
$unmatched = @{}
for ($i = 0; $i -lt [Math]::Min($titles.Count, $blocks.Count); $i++) {
    $title = $titles[$i]
    $lines = [regex]::Matches($blocks[$i].Groups[1].Value, '<p>([\s\S]*?)</p>') | ForEach-Object { Decode-Html($_.Groups[1].Value).Trim() }
    foreach ($line in $lines) {
        foreach ($candidate in (Extract-Candidates $line)) {
            $key = Normalize-Key $candidate
            if ($catalogIndex.ContainsKey($key)) {
                $name = $catalogIndex[$key]
                if (-not $matched.ContainsKey($name)) { $matched[$name] = [ordered]@{ Count = 0; Samples = New-Object System.Collections.Generic.List[string] } }
                $matched[$name].Count++
                if (-not $matched[$name].Samples.Contains($line) -and $matched[$name].Samples.Count -lt 3) { $matched[$name].Samples.Add($line) }
            } else {
                if (-not $unmatched.ContainsKey($candidate)) { $unmatched[$candidate] = [ordered]@{ Count = 0; Samples = New-Object System.Collections.Generic.List[string] } }
                $unmatched[$candidate].Count++
                if (-not $unmatched[$candidate].Samples.Contains($line) -and $unmatched[$candidate].Samples.Count -lt 3) { $unmatched[$candidate].Samples.Add($line) }
            }
        }
    }
}

$matchedRows = $matched.GetEnumerator() | Sort-Object { -$_.Value.Count }, Name | Select-Object -First 80
$unmatchedRows = $unmatched.GetEnumerator() | Sort-Object { -$_.Value.Count }, Name | Select-Object -First 120

$report = New-Object System.Collections.Generic.List[string]
$report.Add('# RecipeKeeper Ingredient Audit')
$report.Add('')
$report.Add('Source: `docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes.html`')
$report.Add('')
$report.Add("Recipes parsed: $($titles.Count)")
$report.Add("Matched catalog ingredients: $($matched.Count)")
$report.Add("Unmatched candidate ingredients: $($unmatched.Count)")
$report.Add('')
$report.Add('## Top Matched Catalog Ingredients')
$report.Add('')
$report.Add('| Ingredient | Count | Sample lines |')
$report.Add('| --- | ---: | --- |')
foreach ($row in $matchedRows) {
    $samples = ($row.Value.Samples | ForEach-Object { $_ -replace '\|', '/' }) -join ' <br> '
    $report.Add("| $($row.Name) | $($row.Value.Count) | $samples |")
}
$report.Add('')
$report.Add('## Unmatched Candidate Ingredients')
$report.Add('')
$report.Add('| Candidate | Count | Sample lines |')
$report.Add('| --- | ---: | --- |')
foreach ($row in $unmatchedRows) {
    $samples = ($row.Value.Samples | ForEach-Object { $_ -replace '\|', '/' }) -join ' <br> '
    $report.Add("| $($row.Name) | $($row.Value.Count) | $samples |")
}
Set-Content 'docs\exported-recipe-lists\recipekeeper-ingredient-audit.md' $report



