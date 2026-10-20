# WP03 Section I: `magaz` / `magaj` and melon-kernel product boundary

- **Reviewed:** 2026-10-11
- **Status:** research complete for this narrow review; identity and form disposition held.
- **Scope:** South Asian culinary spellings `magaz` and `magaj`, related `char magaz` blend wording, current catalog boundaries for egusi, dried watermelon seed kernels, and pumpkin/squash seeds, plus current Canadian retail evidence.
- **Not in scope:** adding catalog rows, aliases, forms, numeric behavior, recipe links, substitutions, or shared ledger records. No shared seed/catalog file was changed.

## Snapshot and disposition

The rechecked bundled package snapshot has **973 ingredient references, 61 ingredient forms, 0 general substitution rules, 0 contextual substitution rules, 114 manifest-listed recipes, and 1,123 ingredient rows**. The legacy-import file contains **75 candidates**. The research ledger contains **1,248 records, 3,936 source entries, and 3,228 distinct source IDs**. Counts were read from the live manifest and package files after the same-day integrations; the recipe-line total is the sum of `ingredients[]` across only the 114 files named by that manifest.

**Recommended disposition: hold `magaz` / `magaj` as a catalog identity, alias, or general seed form.** The sources document genuine edible kernels in particular crops, but they do not give the unqualified market term one stable crop or product boundary. They also use *char magaz* for a multi-seed preparation, while Canadian retail listings attach the name to a seed blend, vague dried melon seeds, or pumpkin seeds. The package has no matching recipe demand to resolve those variants.

The evidence is best described as three overlapping usages, kept distinct:

| Usage evidenced | What the source supports | Boundary for this catalog |
| --- | --- | --- |
| **Crop-specific kernels called magaj** | An ICAR–Central Arid Zone Research Institute bulletin uses *Magaj* for the kernel obtained after removing the coat from seed-purpose watermelon (*Citrullus lanatus*) in the Indian arid-zone context. Kew’s Medicinal Plant Names Services separately maps the phrase `magaj kharbuja` to *Cucumis melo* seed. | `Magaj` can describe a seed-kernel product or processing state, but the crop must be explicit. It cannot be a universal alias for either crop. The Kew record is a medicinal-plant name mapping, not a standardized food-label definition. |
| **Muskmelon / melon seed product** | Culinary reference material and some merchants use `magaz` for muskmelon or dried melon seed. Some sources say seed, some kernel, and some do not settle whether the seed coat remains. | Potential future crop-specific identity/form only if demand and a precise product definition are established. Do not choose `muskmelon`, `melon`, `kernel`, or `dehulled` as a global meaning from this word alone. |
| **Char magaz** | A university cooking text and multiple current product listings describe a four-seed preparation, usually naming watermelon, pumpkin, cucumber, and melon/cantaloupe seeds. Other listings omit the composition or call a pumpkin-seed product `Charmagaz`. | Treat as a product blend when a recipe or a complete ingredient label requires it. It is not a form of one seed identity, and the reviewed sources do not establish a globally fixed blend formula. |

So the term is **not a distinct botanical identity on present evidence**, and it is **not a universal processing form** that can be attached to one current reference. As a free-standing import/search term it is an **ambiguous market term**. If a later recipe specifically requests a named blend, review that blend as its own product identity with source-specific composition; if it specifies a single crop kernel, review that crop and shell state directly.

## English and fr-CA naming and aliases

No English or Québec French display is recommended for a new row now. The English market labels vary among `magaz`, `magaj`, `melon seeds`, `dried melon seeds`, `muskmelon seeds`, `watermelon kernels`, and `char magaz`. The available French-language Canadian retail label `graines de melon` is attached to a listing whose product details describe a multi-seed mixture, and the listing metadata itself is inconsistent. It cannot establish a Québec French name for a single-species kernel.

OQLF supports **melon d’eau** as the Québec term for the watermelon plant/fruit (*Citrullus lanatus*). That supports the `melon d’eau` component already used by the narrow watermelon-kernel reference, but OQLF does not define a melon-seed product or `magaz` / `magaj`. Do not treat `graines de melon` as an OQLF-approved name or alias for a seed product. A borrowed French display such as `graines de magaj` is also not recommended without independent Québec usage evidence.

Keep these expressions inactive as global aliases for a new or existing item:

- `magaz`, `magaj`, and `maghaz`;
- `char magaz`, `chaar magaz`, `char maghaz`, and `mixed melon seeds`;
- generic `melon seeds`, `melon kernels`, `dried melon seeds`, `graines de melon`, and `graines de courge`;
- `magaj kharbuja` except as source-scoped evidence for the Kew record’s *Cucumis melo* name;
- any unqualified mapping to `egusi`, `dried watermelon seed kernels`, or `pumpkin seeds`.

The spelling `maghaz` needs particular care: the reviewed South Asian recipe source uses `maghaz` for beef brain in *maghaz nihari*. Do not merge that spelling with seed search aliases. This is a lexical disambiguation note, not a claim that every transliteration is standardized.

## Identity, category, forms, quantities, and substitutions

The live catalog already has three separate seed identities relevant to this boundary:

| Current reference | Current names / aliases | Current category and evidence boundary |
| --- | --- | --- |
| `ingredient-ref-egusi-seeds` | `egusi seeds` / `graines d’egusi`; `egusi` alias in both locales | `NUT_SEED_AND_DRIED_FRUIT`. The National Academies describes egusi as a West African culinary seed category occurring across more than one cucurbit taxon. Shared cucurbit taxonomy with watermelon does not make the South Asian term `magaz` an egusi alias. |
| `ingredient-ref-watermelon-seed-kernels-dried` | `dried watermelon seed kernels` / `graines de melon d’eau séchées`; no aliases | `NUT_SEED_AND_DRIED_FRUIT`. This is the narrowly named USDA SR28 item NDB 12174 for *Citrullus lanatus*. Its source-specific `63% Hard seed coat` refuse note means the database title must not be generalized into a universal dehulled-kernel definition. |
| `ingredient-ref-pumpkin-squash-seeds` | `pumpkin seeds` / `graines de citrouille`; singular French alias only | `NUT_SEED_AND_DRIED_FRUIT`. The identity is species-unspecified pumpkin/squash seed-family wording. `Char magaz` blend listings that include pumpkin seed do not make the blend or other seed kernels aliases of this row. |

No new category should be selected while the referent is held. If later evidence supports a single edible seed/kernel product, `NUT_SEED_AND_DRIED_FRUIT` is the category to review; a blend would need an explicit product-level decision. Do not change the existing `egusi` or `watermelon` records to absorb this term.

No active form is recommended. `Dried`, `dehulled`, `roasted`, `ground`, `paste`, and `blend` describe materially different states or products in the sources. In particular, a kernel obtained by removing a shell may be a form of a known crop’s seed, while a four-seed blend is a composite product. Neither is a universal `magaz` form.

No household measure, density, conversion, yield, or substitution is supported for unqualified `magaz` / `magaj` or the variable blend. USDA’s 1 cup = 108 g and 1 oz = 28.35 g observations belong only to SR28 NDB 12174; the existing ledger retains them as source-specific evidence, while the current reference still has `defaultDensity: null` and `unitMappings: []`. Do not transfer those observations to muskmelon kernels, a blend, egusi, or pumpkin seeds. Pack sizes in retailer listings are package weights, not recipe conversions. No reviewed source supports a general replacement ratio among these products.

## Exact audits against the current repository

### Package keys, forms, legacy candidates, and ledger

The exact-key scan used `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` across every current reference display and alias, form label and match term, and legacy-candidate display and alias. It folds case, accents, ligatures, punctuation, and whitespace. **No exact normalized owner** was found for `magaz`, `magaj`, `maghaz`, `chaar magaz`, `char magaz`, `char maghaz`, `magaj kharbuja`, `magaz kharbuja`, `melon seeds`, `dried melon seeds`, `melon seed kernels`, `muskmelon seeds`, `musk melon seeds`, `muskmelon seed kernels`, `melon kernels`, `dried melon seed kernels`, `watermelon seeds`, `watermelon seed kernels`, `graines de melon`, `graines de melon d’eau`, or `graines de pastèque` in current references, forms, or the 75 legacy candidates.

Exact existing owners are `dried watermelon seed kernels` on `ingredient-ref-watermelon-seed-kernels-dried` and `graines de citrouille` on `ingredient-ref-pumpkin-squash-seeds`. Those are not proposed aliases for `magaz` / `magaj`.

Exact-key absence does not mean all broad searches are safe. Following the app’s `IngredientReferenceSearchIndex` phrase-then-substring behavior:

- `magaz`, `magaj`, and `char magaz` currently return no active reference;
- `melon seed` falls back to a substring hit on `ingredient-ref-watermelon-seed-kernels-dried`;
- French `graines de melon` matches the displayed phrase inside that same watermelon-kernel reference, `graines de melon d’eau séchées`;
- `egusi` returns both `ingredient-ref-egusi-seeds` and `ingredient-ref-ogiri-egusi` because both display/search text contains that phrase;
- `pumpkin seeds` returns the distinct `ingredient-ref-pumpkin-squash-seeds` row.

The 61 current forms contain no matching magaz/melon-kernel form. The 75 legacy candidates contain none of the reviewed spellings as an exact key. The ledger has no separate magaz/magaj identity record; literal hits are context-only: `magaz` appears in the unrelated title `Smithsonian Magazine`, `maghaz` appears in source material for `maghaz nihari` / brain and unrelated recipe-spice records, and melon-seed language occurs in the established egusi, ogiri-egusi, and dried-watermelon-kernel records. No new ledger entry or source ID is proposed.

### Manifest recipe demand

All **114 manifest-listed recipe JSON files** and **1,123 ingredient rows** were scanned. A broad bilingual full-file and ingredient-line search for `magaz`, `magaj`, `maghaz`, `char magaz` / `chaar magaz`, melon/muskmelon/watermelon seed or kernel wording, and the French `graines de melon`, `graines de citrouille`, `graines de courge`, and `graines de pastèque` variants found **0 full-recipe text hits and 0 ingredient-line hits**. There is no exact product demand to settle the identity in this bundled corpus, and no recipe link or form is proposed.

## Source-to-claim map

All URLs were accessed **2026-10-11**. Retailer claims are treated as evidence about the named listing only; they do not establish a botanical identity or a universal recipe term.

| Source | URL | Supports / limits |
| --- | --- | --- |
| Mahla, Singh & Roy, ICAR–Central Arid Zone Research Institute, *Seed Purpose Watermelon in Arid Zone* (2014) | [CAZRI bulletin PDF](https://cazri.res.in/publications/HRMahla.pdf) | Identifies seed-purpose watermelon as *Citrullus lanatus* in the Indian arid-zone setting; describes roasted whole seeds separately from the kernel after coat removal, locally called `Magaj`, and describes kernel use in sweets, cooling drinks, and as a thickener. Supports a crop- and region-specific kernel use, not a global synonym. |
| Royal Botanic Gardens, Kew, Medicinal Plant Names Services, `magaj kharbuja` | [Kew MPNS record](https://mpns.science.kew.org/mpns-portal/drugDetail?drugName=magaj+kharbuja) | Maps this specific non-scientific name to accepted *Cucumis melo* and plant part “fruit (seed)” in a medicinal-plant source. It does not define a standardized culinary product or settle shell state. |
| CSIR–NIScPR repository, *Most favourite traditional cucurbitaceous vegetables and their utilization pattern in Thar desert of the western Rajasthan, India* (2016), *Indian Journal of Traditional Knowledge* 15(3), 385–394 | [Journal record and PDF](https://nopr.niscpr.res.in/handle/123456789/34274) | Reports Thar crops including snap melon, watermelon, round melon, and kachari, and identifies `magaj` among value-added products described as seed kernels. Supports regional/multiple-crop context; does not prescribe one universal mix or species. |
| NDTV Food, “Melon Seeds” (2014; secondary culinary reference) | [NDTV ingredient entry](https://food.ndtv.com/ingredient/melon-seeds-701109) | Calls magaz a Hindi name for muskmelon seeds and says commercial seeds may be peeled or intact; useful corroboration of crop and shell-state variation, not a standards source. |
| Yashwantrao Chavan Maharashtra Open University, HTS401 *Introduction to Indian Cooking*, “Char magaz paste” | [Course PDF](https://ycmou.ac.in/media/publication/ycmou_book/RVV_YB_087.pdf) | Describes char magaz paste as a four-seed combination of squash, melon, cucumber, and pumpkin seeds, soaked and ground. Supports treatment as a composite preparation, not one seed form. |
| National Academies Press, *Lost Crops of Africa: Volume II: Vegetables*, chapter 8, “Egusi” (2006) | [Egusi chapter](https://www.nationalacademies.org/read/11763/chapter/10) | Describes egusi as a generic West African seed name and notes that market seeds can come from multiple species. Supports keeping the existing egusi culinary identity distinct from an unrelated regional market word even when crop species overlap. |
| USDA Agricultural Research Service, Standard Reference Release 28, Food Group 12, NDB 12174 | [USDA SR28 PDF](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg12.pdf) | Names `Seeds, watermelon seed kernels, dried`, *Citrullus lanatus*; lists the `63% Hard seed coat` refuse note and 1 cup = 108 g / 1 oz = 28.35 g. Numeric data belong to this record only and do not establish a conversion for magaz or a blend. |
| Office québécois de la langue française, GDT, `melon d’eau` (updated 2021) | [OQLF GDT entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26559125/melon-deau) | Supports `melon d’eau` / accepted `pastèque` for the *Citrullus lanatus* plant/fruit, not for a seed product or `magaz`. |
| Walmart Canada, Global Choice Char Magaz, 400 g | [English listing](https://www.walmart.ca/en/ip/Global-Choice-Char-Magaz-Melon-Seeds-400g-Watermelon-Pumpkin-Muskmelon-Cucumber-Seeds-for-Cooking-Healthy-Snacking/2ADP69YKPAKO?classType=REGULAR) | Current product listing names a blend of watermelon, pumpkin, muskmelon, and cucumber seeds. The listing is marketplace product text, not independent botanical verification. |
| Walmart Canada, PTI “GRAINES DE MELON” | [French-language listing](https://www.walmart.ca/fr/ip/GRAINES-DE-MELON/6000188764669) | Uses a broad French-facing title for a Char-magaz listing whose product text identifies multiple seed ingredients; its metadata says “graines de courge,” and the ingredients/details are not fully consistent. The page showed pickup in Mississauga, Ontario, so it is not proof of Québec retail availability or Québec terminology. |
| Kohinoor Foods, `Char Magaz` | [Canadian retailer listing](https://kohinoorfoods.ca/products/char-magaz) | Calls the item `Char Magaz` / “Dried Melon Seeds,” describes North Indian beverage, sweet, and curry uses, and offers pack sizes; the page does not disclose a precise seed composition and showed the product on backorder when checked. |
| Zaika Foods, `Charmagaz` | [Retail listing](https://zaikafoods.ca/products/charmagaz) | A Canadian retail listing describes the item as shelled pumpkin seeds. Used only as evidence that the market label is inconsistent; it does not validate the identification. |
| Ameen Foods, `Char Maghaz` / mixed melon seeds | [Canadian listing](https://ameenfoods.ca/products/char-maghaz-200g) | Describes a four-kernel mix of watermelon, pumpkin, cucumber, and cantaloupe. Product listing evidence only. |
| Food Fusion, “Maghaz Nihari” | [Recipe page](https://foodfusion.com/recipe/maghaz-nihari/) | Uses `maghaz` for beef brain in the recipe title and ingredient/method, which is a spelling-based false-match risk. It is not evidence about melon kernels. |

No reviewed product page established a current Québec-local stock location for a single-species melon kernel. The French-language Walmart result is Canadian but showed an Ontario pickup location; other reviewed Canadian listings also varied in composition or did not disclose it. This leaves Québec display and alias review open.

## Review conclusion

Keep the WP03 Section I open item **“additional melon-seed products and regional culinary kernels”** open. Do not add a standalone `magaz` / `magaj` identity, attach either spelling as a form or alias, map `char magaz` to one seed, or connect it to a bundled recipe. Reopen only with exact recipe or packaging evidence that identifies whether the request is (a) one named crop’s seed/kernel and shell state or (b) a multi-seed blend with disclosed composition. Reassess bilingual display and Québec usage separately at that point.

## Encoding and file checks

After saving, the proposal was decoded as UTF-8, checked for a BOM and final newline, and scanned for known mojibake patterns and damaged French text. The checks passed: no BOM, a final newline is present, and no mojibake or damaged French text was found. No shared file is part of this proposal change.
