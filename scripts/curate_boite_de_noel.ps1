param(
    [string]$InputPath = 'docs/recipes/boite-de-noel.converted.library.v1.json',
    [string]$AssetOutputPath = 'app/src/main/assets/seed/boite-de-noel.converted.library.v1.json'
)

function New-IngredientList([string]$recipeId, [string[]]$items) {
    $result = @()
    for ($i = 0; $i -lt $items.Count; $i++) {
        $line = $items[$i]
        $result += [ordered]@{
            id = "$recipeId-ingredient-$($i + 1)"
            originalText = $line
            ingredientName = $line
        }
    }
    return $result
}

function Set-Recipe {
    param(
        [object]$Recipe,
        [string]$Id,
        [string]$TitleFr,
        [string]$TitleEn,
        [string]$DescriptionFr,
        [string]$DescriptionEn,
        [string[]]$Ingredients,
        [string[]]$InstructionsFr,
        [string[]]$InstructionsEn,
        [string[]]$NotesFr,
        [string[]]$NotesEn,
        [double]$ServingsAmount,
        [string]$ServingsUnit,
        [Nullable[int]]$PrepMinutes,
        [Nullable[int]]$CookMinutes,
        [Nullable[int]]$TotalMinutes,
        [string]$SourceName,
        [string]$SourceUrl
    )

    $Recipe.id = $Id
    $Recipe.createdAt = '2026-03-13T19:00:00Z'
    $Recipe.updatedAt = '2026-03-13T19:00:00Z'
    $Recipe.source = if ($SourceName) {
        [ordered]@{
            sourceName = $SourceName
            sourceUrl = $SourceUrl
        }
    } else {
        $null
    }
    $Recipe.languages.fr.title = $TitleFr
    $Recipe.languages.en.title = $TitleEn
    $Recipe.languages.fr.description = $DescriptionFr
    $Recipe.languages.en.description = $DescriptionEn
    $Recipe.languages.fr.instructions = ($InstructionsFr -join "`n")
    $Recipe.languages.en.instructions = ($InstructionsEn -join "`n")
    $Recipe.languages.fr.notesSystem = ($NotesFr -join "`n")
    $Recipe.languages.en.notesSystem = ($NotesEn -join "`n")
    $Recipe.userNotes = $null
    $Recipe.ingredients = @(New-IngredientList -recipeId $Id -items $Ingredients)
    $Recipe.servings = [ordered]@{ amount = $ServingsAmount; unit = $ServingsUnit }
    $Recipe.times = [ordered]@{
        prepTimeMinutes = $PrepMinutes
        cookTimeMinutes = $CookMinutes
        totalTimeMinutes = $TotalMinutes
    }
    $Recipe.tags = @('tag-dessert')
    $Recipe.collections = @('collection-boite-de-noel')
    $Recipe.ratings = $null
    $Recipe.photos = @()
    $Recipe.attachments = @()
    $Recipe.importMetadata = [ordered]@{
        sourceType = 'pdf'
        parserVersion = 'boite-de-noel-curated-v1'
        originalUnits = 'mixed'
    }
    $Recipe.deletedAt = $null
}

$payload = Get-Content -Path $InputPath -Raw | ConvertFrom-Json
$recipes = $payload.library.recipes

Set-Recipe -Recipe $recipes[0] -Id 'recipe-boite-noel-nanaimo-bars' -TitleFr 'Barres Nanaimo' -TitleEn 'Nanaimo Bars' `
    -DescriptionFr 'Barres etagees au chocolat, a la noix de coco et a la creme, converties depuis la Boite de Noel.' `
    -DescriptionEn 'Layered chocolate, coconut, and custard bars converted from the Christmas Box PDF.' `
    -Ingredients @(
        '1 cup butter, divided',
        '5 tablespoons unsweetened cocoa powder',
        '1/4 cup sugar',
        '1 egg, beaten',
        '1 3/4 cups graham cracker crumbs',
        '1 cup flaked coconut',
        '1/2 cup finely chopped almonds',
        '3 tablespoons heavy cream',
        '3 tablespoons custard powder',
        '2 cups confectioners sugar',
        '5 ounces semisweet baking chocolate',
        '2 1/2 tablespoons butter'
    ) `
    -InstructionsFr @(
        'Faire fondre 1/2 tasse de beurre avec le cacao et le sucre au bain-marie jusqu a consistance lisse, puis incorporer l oeuf et cuire en remuant jusqu a ce que le melange epaississe.',
        'Retirer du feu, ajouter la chapelure Graham, la noix de coco et les amandes, puis presser le melange dans un moule de 8 x 8 pouces chemise.',
        'Battre le reste du beurre avec la creme et la poudre a creme anglaise, puis incorporer le sucre a glacer et etendre cette couche sur la base. Refrigerer.',
        'Faire fondre le chocolat avec le beurre restant et etendre rapidement sur la couche du milieu froide.',
        'Laisser figer avant de couper en carres.'
    ) `
    -InstructionsEn @(
        'Melt 1/2 cup butter with the cocoa and sugar over a double boiler until smooth, then beat in the egg and cook until the mixture thickens.',
        'Remove from the heat, stir in the graham crumbs, coconut, and almonds, then press into a lined 8 x 8-inch pan.',
        'Beat the remaining butter with the cream and custard powder, mix in the confectioners sugar, and spread over the base. Chill until firm.',
        'Melt the semisweet chocolate with the remaining butter and spread it quickly over the chilled middle layer.',
        'Let the topping set before cutting into squares.'
    ) `
    -NotesFr @('Temperez l oeuf en retirant le chocolat du feu avant de l ajouter.', 'N attendez pas trop avant d etendre la couche de chocolat, sinon elle figera trop vite.') `
    -NotesEn @('Temper the egg by taking the chocolate off the heat before adding it.', 'Do not wait too long before spreading the chocolate topping or it will set too quickly.') `
    -ServingsAmount 16 -ServingsUnit 'squares' -PrepMinutes 30 -CookMinutes $null -TotalMinutes 30 -SourceName 'Allrecipes' -SourceUrl 'https://www.allrecipes.com'

Set-Recipe -Recipe $recipes[1] -Id 'recipe-boite-noel-pinwheel-cookies' -TitleFr 'Biscuits tourbillon' -TitleEn 'Pinwheel Cookies' `
    -DescriptionFr 'Biscuits vanille et chocolat roules en spirale, avec une traduction et un nettoyage leger du texte source.' `
    -DescriptionEn 'Vanilla and chocolate spiral cookies, lightly cleaned up and translated from the source PDF.' `
    -Ingredients @(
        '3 cups all-purpose flour', '1 1/2 teaspoons baking powder', '1/2 teaspoon kosher salt', '1 cup unsalted butter, room temperature',
        '1 cup sugar', '2 large eggs', '1 1/2 teaspoons vanilla extract', '2 ounces unsweetened chocolate, chopped'
    ) `
    -InstructionsFr @(
        'Faire fondre le chocolat au bain-marie puis le laisser tiedir legerement.',
        'Fouetter la farine, la poudre a pate et le sel.',
        'Cremer le beurre et le sucre, ajouter les oeufs un a la fois puis la vanille, et incorporer les ingredients secs.',
        'Diviser la pate en deux et melanger le chocolat fondu dans une moitie.',
        'Abaisser les deux pates en rectangles, les superposer, rouler en buche et refrigerer jusqu a fermete.',
        'Trancher la buche et cuire les biscuits a 375 F jusqu a ce que les bords commencent a dorer.'
    ) `
    -InstructionsEn @(
        'Melt the chocolate over a double boiler and let it cool slightly.',
        'Whisk together the flour, baking powder, and salt.',
        'Cream the butter and sugar, beat in the eggs one at a time and the vanilla, then add the dry ingredients.',
        'Divide the dough in half and mix the melted chocolate into one portion.',
        'Roll both doughs into rectangles, stack them, roll into a log, and chill until firm.',
        'Slice the log and bake the cookies at 375 F until the edges just start to brown.'
    ) `
    -NotesFr @('La pate doit etre bien refroidie avant le roulage pour garder une belle spirale.', 'La buche se conserve jusqu a 3 mois au congelateur.') `
    -NotesEn @('The dough needs to be chilled before rolling so the spiral keeps its shape.', 'The cookie log keeps for up to 3 months in the freezer.') `
    -ServingsAmount 48 -ServingsUnit 'cookies' -PrepMinutes 15 -CookMinutes 8 -TotalMinutes 23 -SourceName 'Preppy Kitchen' -SourceUrl 'https://preppykitchen.com'

Set-Recipe -Recipe $recipes[2] -Id 'recipe-boite-noel-pistachio-drop-cookies' -TitleFr 'Boules de neige aux pistaches' -TitleEn 'Pistachio Drop Cookies' `
    -DescriptionFr 'Petits biscuits sables a la pistache avec une touche d amande et de vanille.' `
    -DescriptionEn 'Tender pistachio cookies with almond and vanilla flavor.' `
    -Ingredients @(
        '3/4 cup pistachio crumbs', '1 cup unsalted butter, softened', '3/4 cup confectioners sugar', '1 teaspoon vanilla extract',
        '1 teaspoon almond extract', '2 1/4 cups all-purpose flour', 'Optional: 1 to 2 drops green gel food coloring'
    ) `
    -InstructionsFr @(
        'Battre le beurre jusqu a ce qu il soit lisse, puis ajouter le sucre a glacer, la vanille et l extrait d amande.',
        'Ajouter la farine, les miettes de pistaches et le colorant si desire, puis melanger jusqu a l obtention d une pate epaisse.',
        'Couvrir la pate et refrigerer au moins 30 minutes.',
        'Former des boules d environ 1 cuilleree a soupe et les disposer sur des plaques chemisees.',
        'Cuire a 350 F jusqu a ce que les biscuits soient legerement dores sur les bords, puis laisser refroidir avant de servir ou de tremper dans le chocolat blanc.'
    ) `
    -InstructionsEn @(
        'Beat the butter until smooth, then add the confectioners sugar, vanilla, and almond extract.',
        'Mix in the flour, pistachio crumbs, and food coloring if using until a thick dough forms.',
        'Cover and chill the dough for at least 30 minutes.',
        'Roll into 1-tablespoon balls and place them on lined baking sheets.',
        'Bake at 350 F until lightly golden on the edges, then cool before serving or dipping in white chocolate.'
    ) `
    -NotesFr @('Tres jolis lorsqu ils sont trempes dans le chocolat blanc.') -NotesEn @('These are especially pretty dipped in white chocolate.') `
    -ServingsAmount 36 -ServingsUnit 'cookies' -PrepMinutes 45 -CookMinutes 15 -TotalMinutes 60 -SourceName 'Sally''s Baking Addiction' -SourceUrl 'https://sallysbakingaddiction.com'

Set-Recipe -Recipe $recipes[3] -Id 'recipe-boite-noel-maple-pecan-cranberry-squares' -TitleFr 'Carres erable, pacanes et canneberges' -TitleEn 'Maple Pecan Cranberry Squares' `
    -DescriptionFr 'Carres fondants a l erable avec pacanes et canneberges sechees.' `
    -DescriptionEn 'Rich maple squares loaded with pecans and dried cranberries.' `
    -Ingredients @(
        '1 1/4 cups all-purpose flour', '1/4 cup sugar', '1/4 teaspoon salt', '1/2 cup cold unsalted butter, cut into pieces', '1/2 cup unsalted butter',
        '1/2 cup maple syrup', '3 tablespoons brown sugar', '1/2 cup heavy cream', '1/4 cup dried cranberries, chopped', '1 1/2 cups pecans, chopped'
    ) `
    -InstructionsFr @(
        'Prechauffer le four a 350 F et chemiser un moule carre de 8 x 8 pouces.',
        'Au robot culinaire, pulser la farine, le sucre, le sel et le beurre froid jusqu a obtenir une texture sablee, puis presser dans le moule et cuire 15 a 17 minutes.',
        'Dans une casserole, chauffer le beurre, le sirop d erable et la cassonade jusqu a dissolution puis faire bouillir environ 2 minutes.',
        'Hors du feu, incorporer la creme, les pacanes et les canneberges, puis verser sur la croute precuite.',
        'Remettre au four jusqu a ce que la garniture bouillonne et prenne une couleur caramel, puis laisser refroidir completement avant de couper.'
    ) `
    -InstructionsEn @(
        'Preheat the oven to 350 F and line an 8 x 8-inch square pan.',
        'Pulse the flour, sugar, salt, and cold butter in a food processor until crumbly, press into the pan, and bake for 15 to 17 minutes.',
        'In a saucepan, heat the butter, maple syrup, and brown sugar until dissolved, then boil for about 2 minutes.',
        'Remove from the heat, stir in the cream, pecans, and cranberries, and pour over the baked crust.',
        'Bake again until the filling bubbles and turns caramel colored, then cool completely before slicing.'
    ) `
    -NotesFr @('Ces carres se congelent bien jusqu a 3 mois.') -NotesEn @('These squares freeze well for up to 3 months.') `
    -ServingsAmount 16 -ServingsUnit 'squares' -PrepMinutes 20 -CookMinutes 40 -TotalMinutes 60 -SourceName 'The Hungary Soul' -SourceUrl 'https://thehungarysoul.com'
Set-Recipe -Recipe $recipes[4] -Id 'recipe-boite-noel-cherry-almond-shortbread-cookies' -TitleFr 'Biscuits sablees aux cerises et aux amandes' -TitleEn 'Cherry Almond Shortbread Cookies' `
    -DescriptionFr 'Biscuits sables garnis de cerises au marasquin et d un filet de chocolat blanc.' `
    -DescriptionEn 'Buttery shortbread cookies with maraschino cherries and a white chocolate drizzle.' `
    -Ingredients @(
        '3/4 cup unsalted butter, softened', '2/3 cup granulated sugar', '1 teaspoon vanilla extract', '1/2 teaspoon almond extract',
        '1 tablespoon maraschino cherry juice', '2 cups all-purpose flour', '16 maraschino cherries, drained and chopped', 'Optional: 4 ounces white chocolate'
    ) `
    -InstructionsFr @(
        'Battre le beurre jusqu a consistance cremeuse, puis ajouter le sucre, la vanille, l extrait d amande et le jus de cerises.',
        'Incorporer la farine puis les cerises hachees pour obtenir une pate tres souple.',
        'Compacter la pate, l envelopper et refrigerer au moins 4 heures.',
        'Former des boules, les deposer sur des plaques chemisees et cuire a 350 F jusqu a ce que les bords soient a peine dores.',
        'Laisser refroidir puis arroser de chocolat blanc fondu si desire.'
    ) `
    -InstructionsEn @(
        'Beat the butter until creamy, then add the sugar, vanilla, almond extract, and cherry juice.',
        'Mix in the flour, then fold in the chopped cherries to make a very soft dough.',
        'Press the dough together, wrap it tightly, and chill for at least 4 hours.',
        'Roll into balls, place on lined baking sheets, and bake at 350 F until the edges are just lightly browned.',
        'Cool completely, then drizzle with melted white chocolate if desired.'
    ) `
    -NotesFr @() -NotesEn @() -ServingsAmount 24 -ServingsUnit 'cookies' -PrepMinutes 255 -CookMinutes 11 -TotalMinutes 266 -SourceName 'Sally''s Baking Addiction' -SourceUrl 'https://sallysbakingaddiction.com'

Set-Recipe -Recipe $recipes[5] -Id 'recipe-boite-noel-chocolate-dates' -TitleFr 'Dattes au chocolat (3 saveurs)' -TitleEn 'Chocolate Dates (3 Flavors)' `
    -DescriptionFr 'Dattes Medjool farcies au beurre de noix et enrobees de chocolat.' `
    -DescriptionEn 'Medjool dates stuffed with nut butter and coated in chocolate.' `
    -Ingredients @(
        '20 Medjool dates', '1/2 cup natural nut butter', '20 nuts for the centers', '100 g dark chocolate', 'Flaky sea salt',
        'Crushed nuts for topping', 'Suggested combinations: peanut butter and peanuts, hazelnut butter and hazelnuts, almond butter and almonds'
    ) `
    -InstructionsFr @(
        'Faire fondre le chocolat au bain-marie ou au micro-ondes.',
        'Fendre chaque datte sur la longueur et retirer le noyau sans la separer completement.',
        'Farcir chaque datte d un peu de beurre de noix et d une noix entiere au centre.',
        'Refermer les dattes, les tremper dans le chocolat fondu et laisser egoutter l excedent.',
        'Parsemer de noix concassees et de sel en flocons, puis congeler 20 a 30 minutes pour faire prendre.'
    ) `
    -InstructionsEn @(
        'Melt the chocolate using either a double boiler or the microwave.',
        'Slice each date lengthwise and remove the pit without cutting all the way through.',
        'Fill each date with nut butter and press a whole nut into the center.',
        'Close the dates, dip them in the melted chocolate, and let the excess drip off.',
        'Top with crushed nuts and flaky salt, then freeze for 20 to 30 minutes to set.'
    ) `
    -NotesFr @() -NotesEn @() -ServingsAmount 20 -ServingsUnit 'dates' -PrepMinutes 20 -CookMinutes $null -TotalMinutes 20 -SourceName 'Cooking With Ayeh' -SourceUrl 'https://cookingwithayeh.com'

Set-Recipe -Recipe $recipes[6] -Id 'recipe-boite-noel-coconut-macaroons' -TitleFr 'Congolais' -TitleEn 'Coconut Macaroons' `
    -DescriptionFr 'Macarons a la noix de coco avec base trempee dans le chocolat.' `
    -DescriptionEn 'Coconut macaroons finished with a chocolate-dipped base.' `
    -Ingredients @(
        '1 bag sweetened shredded coconut (396 g)', '1 cup sweetened condensed milk', '1 teaspoon vanilla extract',
        '1/2 teaspoon salt', '2 large egg whites, room temperature', '6 ounces semisweet chocolate'
    ) `
    -InstructionsFr @(
        'Prechauffer le four a 325 F et chemiser deux plaques de papier parchemin.',
        'Melanger la noix de coco, le lait concentre sucre, la vanille et le sel.',
        'Monter les blancs d oeufs en pics fermes puis les incorporer delicatement au melange de noix de coco.',
        'Former les macarons sur les plaques et cuire jusqu a ce qu ils soient dores sur le dessus et dessous.',
        'Faire fondre le chocolat, tremper la base des macarons encore tiedes et laisser figer a temperature ambiante.'
    ) `
    -InstructionsEn @(
        'Preheat the oven to 325 F and line two baking sheets with parchment paper.',
        'Stir together the coconut, sweetened condensed milk, vanilla, and salt.',
        'Whip the egg whites to stiff peaks and gently fold them into the coconut mixture.',
        'Scoop the macaroons onto the prepared sheets and bake until golden on the tops and bottoms.',
        'Melt the chocolate, dip the bottoms of the still-warm macaroons, and let them set at room temperature.'
    ) `
    -NotesFr @('Les blancs se separent plus facilement a froid, mais ils montent mieux a temperature ambiante.', 'On peut aussi simplement arroser le chocolat sur le dessus.') `
    -NotesEn @('Egg whites separate more easily when cold, but they whip better closer to room temperature.', 'You can drizzle the chocolate on top instead of dipping the bottoms.') `
    -ServingsAmount 24 -ServingsUnit 'cookies' -PrepMinutes 20 -CookMinutes 20 -TotalMinutes 40 -SourceName 'Preppy Kitchen' -SourceUrl 'https://preppykitchen.com'

Set-Recipe -Recipe $recipes[7] -Id 'recipe-boite-noel-red-velvet-fudge' -TitleFr 'Fudge rouge velours' -TitleEn 'Red Velvet Fudge' `
    -DescriptionFr 'Fudge marbre rouge et blanc, riche en chocolat blanc, guimauve et cacao.' `
    -DescriptionEn 'Red and white swirled fudge with white chocolate, marshmallow creme, and cocoa.' `
    -Ingredients @(
        '3 cups sugar', '3/4 cup butter', '1 cup half-and-half', '12 ounces white chocolate',
        '1 jar marshmallow creme (7 ounces)', '1 teaspoon vanilla', '1 cup semisweet chocolate chips', '3 tablespoons red food coloring'
    ) `
    -InstructionsFr @(
        'Chemiser un moule de 9 x 9 pouces et reserver.',
        'Mettre les pepites de chocolat mi-sucre et le colorant rouge dans un bol resistant a la chaleur.',
        'Cuire le sucre, le beurre et le moitie-moitie jusqu a environ 234 F, puis ajouter immediatement le chocolat blanc, la creme de guimauve et la vanille.',
        'Verser la moitie du melange blanc sur les pepites de chocolat mi-sucre pour obtenir la portion rouge.',
        'Deposer des cuillerees alternees de fudge rouge et blanc dans le moule, marbrer avec un couteau et laisser refroidir avant de couper.'
    ) `
    -InstructionsEn @(
        'Line a 9 x 9-inch pan and set it aside.',
        'Place the semisweet chocolate chips and red food coloring in a heat-safe bowl.',
        'Cook the sugar, butter, and half-and-half to about 234 F, then immediately stir in the white chocolate, marshmallow creme, and vanilla.',
        'Pour half of the white fudge into the bowl with the semisweet chocolate to make the red portion.',
        'Drop alternating spoonfuls of red and white fudge into the pan, swirl with a knife, and cool before slicing.'
    ) `
    -NotesFr @() -NotesEn @() -ServingsAmount 81 -ServingsUnit 'pieces' -PrepMinutes 15 -CookMinutes 30 -TotalMinutes 45 -SourceName 'That Skinny Chick Can Bake' -SourceUrl 'https://www.thatskinnychickcanbake.com'
Set-Recipe -Recipe $recipes[8] -Id 'recipe-boite-noel-brownie-cookie-sandwiches' -TitleFr 'Sandwichs de biscuits brownies' -TitleEn 'Brownie Cookie Sandwiches' `
    -DescriptionFr 'Biscuits brownies moelleux garnis d une creme au beurre de type pate a biscuits.' `
    -DescriptionEn 'Soft brownie cookies sandwiched with a cookie-dough-style buttercream.' `
    -Ingredients @(
        '1/2 cup unsalted butter', '9 ounces bittersweet chocolate', '3/4 cup plus 2 tablespoons granulated sugar', '1/2 cup light brown sugar',
        '3 large eggs', '1 teaspoon vanilla', '1 cup all-purpose flour', '3/4 cup bread flour', '1/4 cup Dutch-process cocoa powder',
        '1 teaspoon baking powder', '1 teaspoon baking soda', '3/4 teaspoon salt', '3/4 cup unsalted butter, room temperature',
        '1/2 cup brown sugar', '2 1/2 cups confectioners sugar', '1/2 cup all-purpose flour', '1 teaspoon vanilla',
        '1/4 teaspoon salt', '3 to 4 tablespoons heavy cream'
    ) `
    -InstructionsFr @(
        'Faire fondre le chocolat avec le beurre et laisser tiedir.',
        'Fouetter ensemble les farines, le cacao, la poudre a pate, le bicarbonate et le sel.',
        'Ajouter au melange chocolat les oeufs, les sucres et la vanille, puis incorporer les ingredients secs. Refrigerer 30 minutes.',
        'Former de petites boules de pate, les cuire a 350 F jusqu a ce que les bords soient pris et laisser refroidir completement.',
        'Pour la garniture, cremer le beurre et la cassonade, puis ajouter le sucre a glacer, la farine, la vanille, le sel et assez de creme pour obtenir une creme au beurre ferme.',
        'Pocher ou etaler la creme sur un biscuit et refermer avec un deuxieme biscuit.'
    ) `
    -InstructionsEn @(
        'Melt the chocolate with the butter and let it cool slightly.',
        'Whisk together the flours, cocoa powder, baking powder, baking soda, and salt.',
        'Add the eggs, sugars, and vanilla to the chocolate mixture, then mix in the dry ingredients. Chill for 30 minutes.',
        'Scoop small portions of dough, bake at 350 F until the edges are set, and cool completely.',
        'For the filling, cream the butter and brown sugar, then beat in the confectioners sugar, flour, vanilla, salt, and enough cream to make a firm buttercream.',
        'Pipe or spread the filling onto one cookie and top with a second cookie.'
    ) `
    -NotesFr @() -NotesEn @() -ServingsAmount 18 -ServingsUnit 'sandwiches' -PrepMinutes 90 -CookMinutes 10 -TotalMinutes 100 -SourceName 'Browned Butter Blondie' -SourceUrl 'https://brownedbutterblondie.com'

Set-Recipe -Recipe $recipes[9] -Id 'recipe-boite-noel-chocolate-sausage' -TitleFr 'Saucisson au chocolat' -TitleEn 'Chocolate Sausage' `
    -DescriptionFr 'Dessert sans cuisson au chocolat noir, biscuits, guimauves et fruits secs.' `
    -DescriptionEn 'No-bake chocolate dessert with cookies, marshmallows, and dried fruit.' `
    -Ingredients @(
        '225 g 70% dark chocolate, chopped', '1/2 cup unsalted butter, softened', '1 cup icing sugar', '1 egg',
        '1 cup butter cookies, broken into small pieces', '1/2 cup white marshmallows, diced', '2 tablespoons raisins',
        '2 tablespoons pine nuts', 'Extra icing sugar for rolling'
    ) `
    -InstructionsFr @(
        'Faire fondre le chocolat avec le beurre au bain-marie.',
        'Fouetter le sucre a glacer et l oeuf dans le melange de chocolat, puis incorporer les biscuits, les guimauves, les raisins et les noix de pin.',
        'Deposer la preparation sur une grande feuille de papier d aluminium ou de pellicule plastique et faconner un cylindre bien compact.',
        'Refermer et refrigerer environ 2 heures, jusqu a fermete.',
        'Retirer l emballage, rouler dans le sucre a glacer et servir en tranches.'
    ) `
    -InstructionsEn @(
        'Melt the chocolate with the butter over a double boiler.',
        'Whisk the icing sugar and egg into the chocolate mixture, then fold in the cookies, marshmallows, raisins, and pine nuts.',
        'Spoon the mixture onto a large sheet of foil or plastic wrap and shape it into a tightly packed log.',
        'Wrap it well and refrigerate for about 2 hours, until firm.',
        'Unwrap, roll in icing sugar, and slice to serve.'
    ) `
    -NotesFr @('Compacter le rouleau dans une pellicule plastique donne un meilleur resultat qu un moule.') `
    -NotesEn @('Rolling the mixture tightly in plastic wrap works better than pressing it into a mold.') `
    -ServingsAmount 32 -ServingsUnit 'slices' -PrepMinutes 20 -CookMinutes 5 -TotalMinutes 25 -SourceName 'Ricardo Cuisine' -SourceUrl 'https://www.ricardocuisine.com'

Set-Recipe -Recipe $recipes[10] -Id 'recipe-boite-noel-frangipane-mini-tarts' -TitleFr 'Mini-tartelettes frangipane aux amandes' -TitleEn 'Frangipane Mini Tarts' `
    -DescriptionFr 'Petites tartelettes aux amandes avec pate sucree et garniture frangipane.' `
    -DescriptionEn 'Mini almond tarts with a sweet crust and frangipane filling.' `
    -Ingredients @(
        '213 g all-purpose flour', '85 g powdered sugar', '1/4 teaspoon fine salt', '1 large egg yolk', '2 tablespoons heavy cream',
        '1/2 teaspoon vanilla extract', '10 tablespoons unsalted butter, very cold', '113 g almond flour', '100 g granulated sugar',
        '1 egg', '1 egg white', '1/2 teaspoon almond extract', '1/2 teaspoon vanilla extract', '6 tablespoons unsalted butter, room temperature',
        '1/2 cup sliced almonds'
    ) `
    -InstructionsFr @(
        'Pour la pate, fouetter la farine, le sucre et le sel, puis ajouter le jaune d oeuf, la creme, la vanille et le beurre froid jusqu a l obtention d une pate grossiere. Former un disque et refrigerer au moins 1 heure.',
        'Pour la frangipane, melanger la farine d amande, le sucre et le sel, puis ajouter l oeuf, le blanc d oeuf, les extraits et le beurre jusqu a consistance lisse.',
        'Abaisser la pate, foncer 12 cavites d un moule a muffins et refrigerer 30 minutes.',
        'Ajouter une grosse cuilleree de frangipane dans chaque fond et garnir d amandes tranchees.',
        'Cuire a 350 F pendant 20 a 25 minutes et laisser tiedir avant de demouler.'
    ) `
    -InstructionsEn @(
        'For the crust, whisk together the flour, sugar, and salt, then add the yolk, cream, vanilla, and cold butter until a rough dough forms. Shape into a disk and chill for at least 1 hour.',
        'For the frangipane, combine the almond flour, sugar, and salt, then process in the egg, egg white, extracts, and butter until smooth.',
        'Roll out the dough, press it into 12 muffin cups, and chill for 30 minutes.',
        'Spoon a heaping tablespoon of frangipane into each shell and top with sliced almonds.',
        'Bake at 350 F for 20 to 25 minutes and cool briefly before unmolding.'
    ) `
    -NotesFr @() -NotesEn @() -ServingsAmount 12 -ServingsUnit 'tarts' -PrepMinutes 60 -CookMinutes 25 -TotalMinutes 85 -SourceName 'Tablespoon' -SourceUrl 'https://www.tablespoon.com'

Set-Recipe -Recipe $recipes[11] -Id 'recipe-boite-noel-cherry-blossom-version' -TitleFr 'Ma version des Cherry Blossom' -TitleEn 'My Cherry Blossom Version' `
    -DescriptionFr 'Chocolats fourres aux cerises au marasquin, beurre d arachide, noix et noix de coco.' `
    -DescriptionEn 'Homemade cherry chocolates with peanut butter, nuts, and coconut.' `
    -Ingredients @(
        '1 cup dark chocolate chips', '1 cup milk chocolate chips', '1/2 cup natural peanut butter', '1 cup finely chopped pecans, almonds, or walnuts',
        '1/2 cup unsweetened shredded coconut', '2 tablespoons maraschino cherry juice', '3/4 cup icing sugar', '18 maraschino cherries'
    ) `
    -InstructionsFr @(
        'Chemiser un carton d oeufs de 18 cavites avec une pellicule plastique en epousant bien les formes.',
        'Faire fondre les chocolats au micro-ondes en remuant toutes les 30 secondes, puis incorporer le beurre d arachide, les noix et la noix de coco.',
        'Deposer environ 1 cuilleree a soupe de chocolat dans chaque cavite et remonter le melange sur les parois. Refrigerer.',
        'Fouetter le jus de cerises avec le sucre a glacer pour obtenir une sauce epaisse.',
        'Ajouter une cerise dans chaque cavite, napper d un peu de sauce, couvrir du reste du chocolat et refrigerer jusqu a ce que tout soit bien fige.'
    ) `
    -InstructionsEn @(
        'Line an 18-cup egg carton with plastic wrap, pressing it into the cavities.',
        'Melt both chocolates in the microwave, stirring every 30 seconds, then mix in the peanut butter, nuts, and coconut.',
        'Spoon about 1 tablespoon of chocolate into each cavity and push some up the sides to form shells. Chill.',
        'Whisk the cherry juice with the icing sugar to make a thick syrup.',
        'Place one cherry in each shell, add a little syrup, cover with the remaining chocolate mixture, and chill until firm.'
    ) `
    -NotesFr @('Conserver les chocolats au refrigerateur, base vers le haut, pour limiter les fuites si un bonbon est mal scelle.') `
    -NotesEn @('Store the chocolates upside down in the refrigerator so the filling is less likely to leak if one is not fully sealed.') `
    -ServingsAmount 18 -ServingsUnit 'candies' -PrepMinutes 30 -CookMinutes $null -TotalMinutes 30 -SourceName '' -SourceUrl ''
$payload.library.metadata.libraryId = 'library-boite-de-noel-converted'
$payload.library.metadata.createdAt = '2026-03-13T19:00:00Z'
$payload.library.metadata.updatedAt = '2026-03-13T19:00:00Z'
$payload.library.metadata.exportedAt = '2026-03-13T19:00:00Z'
$payload.library.metadata.appVersion = '1.0'
$payload.library.metadata.deviceId = 'recipebook-workspace'
$payload.library.ingredientReferences = @()
$payload.library.ingredientForms = @()
$payload.library.substitutionRules = @()
$payload.library.contextualSubstitutionRules = @()
$payload.library.units = @(
    [ordered]@{ unitId = 'g'; symbol = 'g'; nameFr = 'gramme'; nameEn = 'gram'; type = 'mass'; baseUnitId = 'g'; toBaseFactor = 1.0 },
    [ordered]@{ unitId = 'ml'; symbol = 'ml'; nameFr = 'millilitre'; nameEn = 'milliliter'; type = 'volume'; baseUnitId = 'ml'; toBaseFactor = 1.0 },
    [ordered]@{ unitId = 'cup'; symbol = 'cup'; nameFr = 'tasse'; nameEn = 'cup'; type = 'volume'; baseUnitId = $null; toBaseFactor = 1.0 },
    [ordered]@{ unitId = 'count'; symbol = 'x'; nameFr = 'unite'; nameEn = 'count'; type = 'count'; baseUnitId = 'count'; toBaseFactor = 1.0 }
)
$payload.library.tags = @(
    [ordered]@{ id = 'tag-dessert'; nameFr = 'Dessert'; nameEn = 'Dessert'; slug = 'dessert' }
)
$payload.library.collections = @(
    [ordered]@{
        id = 'collection-boite-de-noel'
        nameFr = 'Boite de Noel'
        nameEn = 'Christmas Box'
        descriptionFr = 'Conversion bilingue du PDF de recettes preferees.'
        descriptionEn = 'Bilingual conversion of the favorite recipes PDF.'
        recipeIds = @($payload.library.recipes.id)
        sortOrder = 'title_asc'
    }
)
$payload.library.settings = [ordered]@{
    language = 'en'
    driveSyncEnabled = $false
    driveFileName = $null
    driveFolderId = $null
    openSourceInAppBrowser = $true
}

$json = $payload | ConvertTo-Json -Depth 20
$json | Set-Content -Path $InputPath -Encoding UTF8
$assetDirectory = Split-Path -Path $AssetOutputPath -Parent
if ($assetDirectory) {
    New-Item -ItemType Directory -Force -Path $assetDirectory | Out-Null
}
$json | Set-Content -Path $AssetOutputPath -Encoding UTF8
Write-Output "Curated $($payload.library.recipes.Count) recipes"


