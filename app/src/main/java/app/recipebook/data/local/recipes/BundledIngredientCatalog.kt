package app.recipebook.data.local.recipes

import app.recipebook.domain.model.IngredientCategory
import app.recipebook.domain.model.IngredientReference
import app.recipebook.domain.model.IngredientUnitMapping
import app.recipebook.domain.model.Recipe

internal object BundledIngredientCatalog {

    val references: List<IngredientReference> = listOf(
        ingredient(
            id = "ingredient-ref-all-purpose-flour",
            nameFr = "farine tout usage",
            nameEn = "all-purpose flour",
            aliasesFr = listOf("farine blanche", "farine ordinaire"),
            aliasesEn = listOf("plain flour", "AP flour"),
            defaultDensity = 0.53,
            unitMappings = listOf(mapping("cup", "g", 120.0), mapping("tbsp", "g", 7.5), mapping("tsp", "g", 2.5))
        ),
        ingredient(
            id = "ingredient-ref-bread-flour",
            nameFr = "farine à pain",
            nameEn = "bread flour",
            aliasesFr = listOf("farine pour pain"),
            defaultDensity = 0.54,
            unitMappings = listOf(mapping("cup", "g", 127.0), mapping("tbsp", "g", 7.9))
        ),
        ingredient(
            id = "ingredient-ref-whole-wheat-flour",
            nameFr = "farine de blé entier",
            nameEn = "whole wheat flour",
            aliasesFr = listOf("farine de blé complet"),
            aliasesEn = listOf("wholemeal flour"),
            defaultDensity = 0.55,
            unitMappings = listOf(mapping("cup", "g", 120.0), mapping("tbsp", "g", 7.5))
        ),
        ingredient(
            id = "ingredient-ref-cake-flour",
            nameFr = "farine à gâteau",
            nameEn = "cake flour",
            aliasesFr = listOf("farine à pâtisserie"),
            defaultDensity = 0.45,
            unitMappings = listOf(mapping("cup", "g", 113.0), mapping("tbsp", "g", 7.1))
        ),
        ingredient(
            id = "ingredient-ref-almond-flour",
            nameFr = "farine d'amande",
            nameEn = "almond flour",
            aliasesFr = listOf("poudre d'amande"),
            aliasesEn = listOf("ground almonds"),
            defaultDensity = 0.40,
            unitMappings = listOf(mapping("cup", "g", 96.0), mapping("tbsp", "g", 6.0))
        ),
        ingredient(
            id = "ingredient-ref-cornstarch",
            nameFr = "fécule de maïs",
            nameEn = "cornstarch",
            aliasesFr = listOf("amidon de maïs"),
            aliasesEn = listOf("corn flour"),
            defaultDensity = 0.54,
            unitMappings = listOf(mapping("cup", "g", 128.0), mapping("tbsp", "g", 8.0), mapping("tsp", "g", 2.7))
        ),
        ingredient(
            id = "ingredient-ref-rolled-oats",
            nameFr = "flocons d'avoine",
            nameEn = "rolled oats",
            aliasesFr = listOf("gros flocons d'avoine"),
            aliasesEn = listOf("old-fashioned oats"),
            defaultDensity = 0.34,
            unitMappings = listOf(mapping("cup", "g", 80.0), mapping("tbsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-quick-oats",
            nameFr = "flocons d'avoine rapides",
            nameEn = "quick oats",
            aliasesEn = listOf("instant oats"),
            defaultDensity = 0.36,
            unitMappings = listOf(mapping("cup", "g", 85.0), mapping("tbsp", "g", 5.3))
        ),
        ingredient(
            id = "ingredient-ref-rice",
            nameFr = "riz blanc",
            nameEn = "white rice",
            aliasesFr = listOf("riz long grain"),
            aliasesEn = listOf("long-grain rice"),
            defaultDensity = 0.85,
            unitMappings = listOf(mapping("cup", "g", 185.0), mapping("tbsp", "g", 11.6))
        ),
        ingredient(
            id = "ingredient-ref-arborio-rice",
            nameFr = "riz arborio",
            nameEn = "arborio rice",
            defaultDensity = 0.79,
            unitMappings = listOf(mapping("cup", "g", 190.0), mapping("tbsp", "g", 11.9))
        ),
        ingredient(
            id = "ingredient-ref-sugar",
            nameFr = "sucre",
            nameEn = "sugar",
            aliasesFr = listOf("sucre blanc"),
            aliasesEn = listOf("white sugar"),
            defaultDensity = 0.85,
            unitMappings = listOf(mapping("cup", "g", 200.0), mapping("tbsp", "g", 12.5), mapping("tsp", "g", 4.2))
        ),
        ingredient(
            id = "ingredient-ref-granulated-sugar",
            nameFr = "sucre granulé",
            nameEn = "granulated sugar",
            aliasesFr = listOf("sucre blanc granulé"),
            aliasesEn = listOf("white sugar", "table sugar"),
            defaultDensity = 0.85,
            unitMappings = listOf(mapping("cup", "g", 200.0), mapping("tbsp", "g", 12.5), mapping("tsp", "g", 4.2))
        ),
        ingredient(
            id = "ingredient-ref-brown-sugar",
            nameFr = "cassonade",
            nameEn = "brown sugar",
            aliasesFr = listOf("sucre brun tassé", "cassonade claire", "sucre brun clair"),
            aliasesEn = listOf("dark brown sugar", "packed brown sugar", "light brown sugar", "light packed brown sugar"),
            defaultDensity = 0.72,
            unitMappings = listOf(mapping("cup", "g", 220.0), mapping("tbsp", "g", 13.8), mapping("tsp", "g", 4.6))
        ),

        ingredient(
            id = "ingredient-ref-icing-sugar",
            nameFr = "sucre à glacer",
            nameEn = "icing sugar",
            aliasesFr = listOf("sucre en poudre"),
            aliasesEn = listOf("powdered sugar", "confectioners' sugar", "confectionery sugar"),
            defaultDensity = 0.48,
            unitMappings = listOf(mapping("cup", "g", 120.0), mapping("tbsp", "g", 7.5), mapping("tsp", "g", 2.5))
        ),
        ingredient(
            id = "ingredient-ref-honey",
            nameFr = "miel",
            nameEn = "honey",
            defaultDensity = 1.42,
            unitMappings = listOf(mapping("cup", "g", 340.0), mapping("tbsp", "g", 21.0), mapping("tsp", "g", 7.0))
        ),
        ingredient(
            id = "ingredient-ref-maple-syrup",
            nameFr = "sirop d'érable",
            nameEn = "maple syrup",
            defaultDensity = 1.33,
            unitMappings = listOf(mapping("cup", "g", 315.0), mapping("tbsp", "g", 19.7), mapping("tsp", "g", 6.6))
        ),
        ingredient(
            id = "ingredient-ref-molasses",
            nameFr = "mélasse",
            nameEn = "molasses",
            aliasesEn = listOf("blackstrap molasses"),
            defaultDensity = 1.45,
            unitMappings = listOf(mapping("cup", "g", 340.0), mapping("tbsp", "g", 21.3), mapping("tsp", "g", 7.1))
        ),
        ingredient(
            id = "ingredient-ref-corn-syrup",
            nameFr = "sirop de mais",
            nameEn = "corn syrup",
            aliasesEn = listOf("glucose syrup"),
            defaultDensity = 1.48,
            unitMappings = listOf(mapping("cup", "g", 328.0), mapping("tbsp", "g", 20.5), mapping("tsp", "g", 6.8))
        ),
        ingredient(
            id = "ingredient-ref-baking-powder",
            nameFr = "poudre à pâte",
            nameEn = "baking powder",
            defaultDensity = 0.96,
            unitMappings = listOf(mapping("tbsp", "g", 14.0), mapping("tsp", "g", 4.6))
        ),
        ingredient(
            id = "ingredient-ref-baking-soda",
            nameFr = "bicarbonate de soude",
            nameEn = "baking soda",
            aliasesFr = listOf("petite vache"),
            aliasesEn = listOf("bicarbonate of soda"),
            defaultDensity = 1.04,
            unitMappings = listOf(mapping("tbsp", "g", 13.8), mapping("tsp", "g", 4.6))
        ),


        ingredient(
            id = "ingredient-ref-salt",
            nameFr = "sel",
            nameEn = "salt",
            aliasesFr = listOf("sel fin", "sel kasher"),
            aliasesEn = listOf("table salt", "fine salt", "kosher salt", "pinch of salt"),
            defaultDensity = 1.22,
            unitMappings = listOf(mapping("tbsp", "g", 18.0), mapping("tsp", "g", 6.0))
        ),
        ingredient(
            id = "ingredient-ref-cinnamon",
            nameFr = "cannelle moulue",
            nameEn = "ground cinnamon",
            aliasesFr = listOf("cannelle"),
            aliasesEn = listOf("cinnamon"),
            defaultDensity = 0.53,
            unitMappings = listOf(mapping("tbsp", "g", 7.8), mapping("tsp", "g", 2.6))
        ),
        ingredient(
            id = "ingredient-ref-vanilla-extract",
            nameFr = "extrait de vanille",
            nameEn = "vanilla extract",
            aliasesFr = listOf("vanille liquide"),
            defaultDensity = 0.95,
            unitMappings = listOf(mapping("tbsp", "g", 13.0), mapping("tsp", "g", 4.3))
        ),
        ingredient(
            id = "ingredient-ref-almond-extract",
            nameFr = "extrait d amande",
            nameEn = "almond extract",
            defaultDensity = 0.93,
            unitMappings = listOf(mapping("tbsp", "g", 12.5), mapping("tsp", "g", 4.2))
        ),
        ingredient(
            id = "ingredient-ref-unsweetened-cocoa-powder",
            nameFr = "cacao non sucré",
            nameEn = "unsweetened cocoa powder",
            aliasesFr = listOf("poudre de cacao non sucrée"),
            aliasesEn = listOf("natural cocoa powder", "unsweetened natural cocoa powder", "cocoa powder"),
            defaultDensity = 0.42,
            unitMappings = listOf(mapping("cup", "g", 85.0), mapping("tbsp", "g", 5.3), mapping("tsp", "g", 1.8))
        ),
        ingredient(
            id = "ingredient-ref-dutch-process-cocoa-powder",
            nameFr = "cacao traité à la hollandaise",
            nameEn = "Dutch-process cocoa powder",
            aliasesFr = listOf("cacao hollandais"),
            defaultDensity = 0.42,
            unitMappings = listOf(mapping("cup", "g", 85.0), mapping("tbsp", "g", 5.3), mapping("tsp", "g", 1.8))
        ),

        ingredient(
            id = "ingredient-ref-unsalted-butter",
            nameFr = "beurre non salé",
            nameEn = "unsalted butter",
            aliasesFr = listOf("beurre", "beurre doux", "beurre non salé froid", "beurre salé"),
            aliasesEn = listOf("butter", "cold unsalted butter", "chilled unsalted butter", "salted butter"),
            defaultDensity = 0.96,
            unitMappings = listOf(mapping("cup", "g", 227.0), mapping("tbsp", "g", 14.2), mapping("tsp", "g", 4.7))
        ),

        ingredient(
            id = "ingredient-ref-shortening",
            nameFr = "shortening végétal",
            nameEn = "vegetable shortening",
            aliasesEn = listOf("shortening"),
            defaultDensity = 0.91,
            unitMappings = listOf(mapping("cup", "g", 191.0), mapping("tbsp", "g", 11.9), mapping("tsp", "g", 4.0))
        ),
        ingredient(
            id = "ingredient-ref-olive-oil",
            nameFr = "huile d'olive",
            nameEn = "olive oil",
            aliasesEn = listOf("extra-virgin olive oil"),
            defaultDensity = 0.91,
            unitMappings = listOf(mapping("cup", "g", 216.0), mapping("tbsp", "g", 13.5), mapping("tsp", "g", 4.5))
        ),
        ingredient(
            id = "ingredient-ref-vegetable-oil",
            nameFr = "huile végétale",
            nameEn = "vegetable oil",
            aliasesEn = listOf("canola oil", "neutral oil", "oil", "canola"),
            defaultDensity = 0.92,
            unitMappings = listOf(mapping("cup", "g", 218.0), mapping("tbsp", "g", 13.6), mapping("tsp", "g", 4.5))
        ),
        ingredient(
            id = "ingredient-ref-natural-peanut-butter",
            nameFr = "beurre d'arachide naturel",
            nameEn = "natural peanut butter",
            aliasesFr = listOf("beurre d'arachide"),
            aliasesEn = listOf("peanut butter"),
            defaultDensity = 1.00,
            unitMappings = listOf(mapping("cup", "g", 256.0), mapping("tbsp", "g", 16.0), mapping("tsp", "g", 5.3))
        ),
        ingredient(
            id = "ingredient-ref-water",
            nameFr = "eau",
            nameEn = "water",
            defaultDensity = 1.0,
            unitMappings = listOf(mapping("cup", "g", 236.6), mapping("tbsp", "g", 14.8), mapping("tsp", "g", 4.9), mapping("fl oz", "ml", 29.57))
        ),
        ingredient(
            id = "ingredient-ref-milk",
            nameFr = "lait",
            nameEn = "milk",
            aliasesFr = listOf("lait 2%"),
            aliasesEn = listOf("whole milk"),
            defaultDensity = 1.03,
            unitMappings = listOf(mapping("cup", "g", 244.0), mapping("tbsp", "g", 15.3), mapping("tsp", "g", 5.1), mapping("fl oz", "ml", 29.57))
        ),
        ingredient(
            id = "ingredient-ref-heavy-cream",
            nameFr = "crème 35 %",
            nameEn = "heavy cream",
            aliasesFr = listOf("crème à fouetter"),
            aliasesEn = listOf("whipping cream", "heavy whipping cream"),
            defaultDensity = 0.99,
            unitMappings = listOf(mapping("cup", "g", 238.0), mapping("tbsp", "g", 14.9), mapping("tsp", "g", 5.0), mapping("fl oz", "ml", 29.57))
        ),
        ingredient(
            id = "ingredient-ref-half-and-half",
            nameFr = "demi-crème",
            nameEn = "half-and-half",
            aliasesEn = listOf("coffee cream"),
            defaultDensity = 1.02,
            unitMappings = listOf(mapping("cup", "g", 242.0), mapping("tbsp", "g", 15.1), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-buttermilk",
            nameFr = "babeurre",
            nameEn = "buttermilk",
            aliasesFr = listOf("lait de beurre"),
            defaultDensity = 1.03,
            unitMappings = listOf(mapping("cup", "g", 243.0), mapping("tbsp", "g", 15.2), mapping("tsp", "g", 5.1))
        ),
        ingredient(
            id = "ingredient-ref-sour-cream",
            nameFr = "crème sûre",
            nameEn = "sour cream",
            defaultDensity = 0.99,
            unitMappings = listOf(mapping("cup", "g", 230.0), mapping("tbsp", "g", 14.4), mapping("tsp", "g", 4.8))
        ),
        ingredient(
            id = "ingredient-ref-plain-yogurt",
            nameFr = "yogourt nature",
            nameEn = "plain yogurt",
            aliasesEn = listOf("plain yoghurt"),
            defaultDensity = 1.04,
            unitMappings = listOf(mapping("cup", "g", 245.0), mapping("tbsp", "g", 15.3), mapping("tsp", "g", 5.1))
        ),
        ingredient(
            id = "ingredient-ref-sweetened-condensed-milk",
            nameFr = "lait condensé sucré",
            nameEn = "sweetened condensed milk",
            defaultDensity = 1.28,
            unitMappings = listOf(mapping("cup", "g", 306.0), mapping("tbsp", "g", 19.1), mapping("tsp", "g", 6.4))
        ),
        ingredient(
            id = "ingredient-ref-evaporated-milk",
            nameFr = "lait évaporé",
            nameEn = "evaporated milk",
            defaultDensity = 1.06,
            unitMappings = listOf(mapping("cup", "g", 252.0), mapping("tbsp", "g", 15.8), mapping("tsp", "g", 5.3))
        ),
        ingredient(
            id = "ingredient-ref-egg",
            nameFr = "œuf",
            nameEn = "egg",
            aliasesEn = listOf("eggs"),
            unitMappings = listOf(mapping("large egg", "g", 50.0))
        ),
        ingredient(
            id = "ingredient-ref-egg-white",
            nameFr = "blanc d œuf",
            nameEn = "egg white",
            aliasesEn = listOf("egg whites"),
            unitMappings = listOf(mapping("large egg white", "g", 30.0))
        ),
        ingredient(
            id = "ingredient-ref-egg-yolk",
            nameFr = "jaune d œuf",
            nameEn = "egg yolk",
            aliasesEn = listOf("egg yolks"),
            unitMappings = listOf(mapping("large egg yolk", "g", 18.0))
        ),
        ingredient(
            id = "ingredient-ref-cheddar-cheese",
            nameFr = "fromage cheddar",
            nameEn = "cheddar cheese",
            aliasesFr = listOf("fromage cheddar râpé"),
            aliasesEn = listOf("shredded cheddar cheese", "grated cheddar cheese"),
            defaultDensity = 0.47,
            unitMappings = listOf(mapping("cup", "g", 113.0), mapping("tbsp", "g", 7.0))
        ),
        ingredient(
            id = "ingredient-ref-parmesan-cheese",
            nameFr = "fromage parmesan",
            nameEn = "parmesan cheese",
            aliasesFr = listOf("parmesan râpé"),
            aliasesEn = listOf("grated parmesan cheese"),
            defaultDensity = 0.42,
            unitMappings = listOf(mapping("cup", "g", 100.0), mapping("tbsp", "g", 6.0), mapping("tsp", "g", 2.0))
        ),
        ingredient(
            id = "ingredient-ref-graham-cracker-crumbs",
            nameFr = "chapelure de biscuits graham",
            nameEn = "graham cracker crumbs",
            defaultDensity = 0.51,
            unitMappings = listOf(mapping("cup", "g", 120.0), mapping("tbsp", "g", 7.5))
        ),
        ingredient(
            id = "ingredient-ref-shredded-coconut",
            nameFr = "noix de coco râpée",
            nameEn = "shredded coconut",
            aliasesEn = listOf("desiccated coconut"),
            defaultDensity = 0.37,
            unitMappings = listOf(mapping("cup", "g", 80.0), mapping("tbsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-almonds",
            nameFr = "amandes",
            nameEn = "almonds",
            aliasesEn = listOf("whole almonds", "sliced almonds"),
            defaultDensity = 0.60,
            unitMappings = listOf(mapping("cup", "g", 143.0), mapping("tbsp", "g", 9.0))
        ),
        ingredient(
            id = "ingredient-ref-pecans",
            nameFr = "pacanes",
            nameEn = "pecans",
            aliasesEn = listOf("pecan halves"),
            defaultDensity = 0.52,
            unitMappings = listOf(mapping("cup", "g", 110.0), mapping("tbsp", "g", 6.9))
        ),
        ingredient(
            id = "ingredient-ref-walnuts",
            nameFr = "noix de grenoble",
            nameEn = "walnuts",
            aliasesEn = listOf("chopped walnuts"),
            defaultDensity = 0.53,
            unitMappings = listOf(mapping("cup", "g", 115.0), mapping("tbsp", "g", 7.2))
        ),
        ingredient(
            id = "ingredient-ref-raisins",
            nameFr = "raisins secs",
            nameEn = "raisins",
            defaultDensity = 0.68,
            unitMappings = listOf(mapping("cup", "g", 145.0), mapping("tbsp", "g", 9.0))
        ),
        ingredient(
            id = "ingredient-ref-dried-cranberries",
            nameFr = "canneberges séchées",
            nameEn = "dried cranberries",
            aliasesEn = listOf("sweetened dried cranberries"),
            defaultDensity = 0.58,
            unitMappings = listOf(mapping("cup", "g", 120.0), mapping("tbsp", "g", 7.5))
        ),
        ingredient(
            id = "ingredient-ref-medjool-dates",
            nameFr = "dattes medjool",
            nameEn = "Medjool dates",
            aliasesEn = listOf("dates"),
            unitMappings = listOf(mapping("date", "g", 24.0))
        ),
        ingredient(
            id = "ingredient-ref-semisweet-chocolate",
            nameFr = "chocolat mi-sucré",
            nameEn = "semisweet chocolate",
            aliasesEn = listOf("semi-sweet chocolate"),
            defaultDensity = 0.55,
            unitMappings = listOf(mapping("cup", "g", 170.0), mapping("tbsp", "g", 10.6))
        ),
        ingredient(
            id = "ingredient-ref-dark-chocolate",
            nameFr = "chocolat noir",
            nameEn = "dark chocolate",
            defaultDensity = 0.55,
            unitMappings = listOf(mapping("cup", "g", 170.0), mapping("tbsp", "g", 10.6))
        ),
        ingredient(
            id = "ingredient-ref-bittersweet-chocolate",
            nameFr = "chocolat mi-amer",
            nameEn = "bittersweet chocolate",
            defaultDensity = 0.55,
            unitMappings = listOf(mapping("cup", "g", 170.0), mapping("tbsp", "g", 10.6))
        ),
        ingredient(
            id = "ingredient-ref-white-chocolate",
            nameFr = "chocolat blanc",
            nameEn = "white chocolate",
            defaultDensity = 0.55,
            unitMappings = listOf(mapping("cup", "g", 170.0), mapping("tbsp", "g", 10.6))
        ),
        ingredient(
            id = "ingredient-ref-milk-chocolate",
            nameFr = "chocolat au lait",
            nameEn = "milk chocolate",
            defaultDensity = 0.55,
            unitMappings = listOf(mapping("cup", "g", 170.0), mapping("tbsp", "g", 10.6))
        ),
        ingredient(
            id = "ingredient-ref-unsweetened-chocolate",
            nameFr = "chocolat non sucré",
            nameEn = "unsweetened chocolate",
            defaultDensity = 0.55,
            unitMappings = listOf(mapping("cup", "g", 170.0), mapping("tbsp", "g", 10.6))
        ),
        ingredient(
            id = "ingredient-ref-onion",
            nameFr = "oignon",
            nameEn = "onion",
            aliasesEn = listOf("yellow onion"),
            defaultDensity = 0.64,
            unitMappings = listOf(mapping("cup", "g", 150.0), mapping("tbsp", "g", 9.4))
        ),
        ingredient(
            id = "ingredient-ref-garlic",
            nameFr = "ail",
            nameEn = "garlic",
            aliasesEn = listOf("garlic cloves"),
            unitMappings = listOf(mapping("clove", "g", 3.0), mapping("tbsp", "g", 8.5), mapping("tsp", "g", 2.8))
        ),
        ingredient(
            id = "ingredient-ref-carrot",
            nameFr = "carotte",
            nameEn = "carrot",
            aliasesEn = listOf("grated carrot", "chopped carrots"),
            defaultDensity = 0.54,
            unitMappings = listOf(mapping("cup", "g", 128.0), mapping("tbsp", "g", 8.0))
        ),
        ingredient(
            id = "ingredient-ref-celery",
            nameFr = "céleri",
            nameEn = "celery",
            aliasesEn = listOf("chopped celery"),
            defaultDensity = 0.43,
            unitMappings = listOf(mapping("cup", "g", 101.0), mapping("tbsp", "g", 6.3))
        ),
        ingredient(
            id = "ingredient-ref-potato",
            nameFr = "pomme de terre",
            nameEn = "potato",
            aliasesEn = listOf("russet potato"),
            defaultDensity = 0.76,
            unitMappings = listOf(mapping("cup", "g", 173.0), mapping("tbsp", "g", 10.8))
        ),
        ingredient(
            id = "ingredient-ref-tomato-paste",
            nameFr = "pâte de tomates",
            nameEn = "tomato paste",
            defaultDensity = 1.18,
            unitMappings = listOf(mapping("cup", "g", 265.0), mapping("tbsp", "g", 16.6), mapping("tsp", "g", 5.5))
        ),
        ingredient(
            id = "ingredient-ref-diced-tomatoes",
            nameFr = "tomates en dés",
            nameEn = "diced tomatoes",
            aliasesEn = listOf("canned diced tomatoes"),
            defaultDensity = 1.0,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0))
        ),
        ingredient(
            id = "ingredient-ref-tomatoes",
            nameFr = "tomates",
            nameEn = "tomatoes",
            defaultDensity = 0.95,
            unitMappings = listOf(mapping("cup", "g", 180.0), mapping("tbsp", "g", 11.3))
        ),
        ingredient(
            id = "ingredient-ref-lemon-juice",
            nameFr = "jus de citron",
            nameEn = "lemon juice",
            aliasesEn = listOf("fresh lemon juice"),
            defaultDensity = 1.03,
            unitMappings = listOf(mapping("cup", "g", 244.0), mapping("tbsp", "g", 15.3), mapping("tsp", "g", 5.1), mapping("fl oz", "ml", 29.57))
        ),
        ingredient(
            id = "ingredient-ref-lime-juice",
            nameFr = "jus de lime",
            nameEn = "lime juice",
            defaultDensity = 1.03,
            unitMappings = listOf(mapping("cup", "g", 244.0), mapping("tbsp", "g", 15.3), mapping("tsp", "g", 5.1), mapping("fl oz", "ml", 29.57))
        ),
        ingredient(
            id = "ingredient-ref-chicken-stock",
            nameFr = "bouillon de poulet",
            nameEn = "chicken stock",
            aliasesEn = listOf("chicken broth"),
            defaultDensity = 1.01,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0), mapping("fl oz", "ml", 29.57))
        ),
        ingredient(
            id = "ingredient-ref-vegetable-stock",
            nameFr = "bouillon de légumes",
            nameEn = "vegetable stock",
            aliasesEn = listOf("vegetable broth"),
            defaultDensity = 1.01,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0), mapping("fl oz", "ml", 29.57))
        ),
        ingredient(
            id = "ingredient-ref-black-beans",
            nameFr = "haricots noirs",
            nameEn = "black beans",
            aliasesFr = listOf("haricots noirs en conserve"),
            aliasesEn = listOf("canned black beans", "black beans, drained"),
            defaultDensity = 0.74,
            unitMappings = listOf(mapping("cup", "g", 172.0), mapping("tbsp", "g", 10.8))
        ),
        ingredient(
            id = "ingredient-ref-chickpeas",
            nameFr = "pois chiches",
            nameEn = "chickpeas",
            aliasesFr = listOf("pois chiches en conserve"),
            aliasesEn = listOf("canned chickpeas", "garbanzo beans", "garbanzo beans, drained"),
            defaultDensity = 0.72,
            unitMappings = listOf(mapping("cup", "g", 164.0), mapping("tbsp", "g", 10.3))
        ),
        ingredient(
            id = "ingredient-ref-black-pepper",
            nameFr = "poivre noir",
            nameEn = "black pepper",
            aliasesEn = listOf("pepper", "ground black pepper")
        ),
        ingredient(
            id = "ingredient-ref-garlic-powder",
            nameFr = "poudre d'ail",
            nameEn = "garlic powder",
            aliasesFr = listOf("ail en poudre")
        ),
        ingredient(
            id = "ingredient-ref-dried-oregano",
            nameFr = "origan séché",
            nameEn = "dried oregano",
            aliasesEn = listOf("oregano")
        ),
        ingredient(
            id = "ingredient-ref-margarine",
            nameFr = "margarine",
            nameEn = "margarine",
            defaultDensity = 0.96,
            unitMappings = listOf(mapping("cup", "g", 227.0), mapping("tbsp", "g", 14.2), mapping("tsp", "g", 4.7))
        ),
        ingredient(
            id = "ingredient-ref-paprika",
            nameFr = "paprika",
            nameEn = "paprika"
        ),
        ingredient(
            id = "ingredient-ref-smoked-paprika",
            nameFr = "paprika fumé",
            nameEn = "smoked paprika"
        ),
        ingredient(
            id = "ingredient-ref-almond-butter",
            nameFr = "beurre d amande",
            nameEn = "almond butter",
            defaultDensity = 1.0,
            unitMappings = listOf(mapping("cup", "g", 256.0), mapping("tbsp", "g", 16.0), mapping("tsp", "g", 5.3))
        ),
        ingredient(
            id = "ingredient-ref-beef-stock",
            nameFr = "bouillon de bœuf",
            nameEn = "beef stock",
            aliasesEn = listOf("beef broth"),
            defaultDensity = 1.01,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0), mapping("fl oz", "ml", 29.57))
        ),
        ingredient(
            id = "ingredient-ref-ground-cumin",
            nameFr = "cumin moulu",
            nameEn = "ground cumin",
            aliasesEn = listOf("cumin")
        ),
        ingredient(
            id = "ingredient-ref-gelatin",
            nameFr = "gélatine",
            nameEn = "gelatin"
        ),
        ingredient(
            id = "ingredient-ref-lemon-zest",
            nameFr = "zeste de citron",
            nameEn = "lemon zest"
        ),
        ingredient(
            id = "ingredient-ref-arrowroot",
            nameFr = "arrow-root",
            nameEn = "arrowroot"
        ),
        ingredient(
            id = "ingredient-ref-blueberries",
            nameFr = "bleuets",
            nameEn = "blueberries",
            aliasesEn = listOf("fresh blueberries", "frozen blueberries")
        ),
        ingredient(
            id = "ingredient-ref-coconut-milk",
            nameFr = "lait de coco",
            nameEn = "coconut milk",
            aliasesEn = listOf("canned coconut milk"),
            defaultDensity = 0.97,
            unitMappings = listOf(mapping("cup", "g", 230.0), mapping("tbsp", "g", 14.4), mapping("tsp", "g", 4.8))
        ),
        ingredient(
            id = "ingredient-ref-cayenne-pepper",
            nameFr = "poivre de cayenne",
            nameEn = "cayenne pepper"
        ),
        ingredient(
            id = "ingredient-ref-dried-basil",
            nameFr = "basilic seche",
            nameEn = "dried basil"
        ),
        ingredient(
            id = "ingredient-ref-dried-thyme",
            nameFr = "thym seche",
            nameEn = "dried thyme"
        ),
        ingredient(
            id = "ingredient-ref-fish-sauce",
            nameFr = "sauce de poisson",
            nameEn = "fish sauce",
            defaultDensity = 1.18,
            unitMappings = listOf(mapping("tbsp", "g", 18.0), mapping("tsp", "g", 6.0))
        ),
        ingredient(
            id = "ingredient-ref-ketchup",
            nameFr = "ketchup",
            nameEn = "ketchup",
            defaultDensity = 1.15,
            unitMappings = listOf(mapping("cup", "g", 272.0), mapping("tbsp", "g", 17.0), mapping("tsp", "g", 5.7))
        ),
        ingredient(
            id = "ingredient-ref-leek",
            nameFr = "poireau",
            nameEn = "leek"
        ),
        ingredient(
            id = "ingredient-ref-nutmeg",
            nameFr = "muscade",
            nameEn = "nutmeg",
            aliasesEn = listOf("ground nutmeg")
        ),
        ingredient(
            id = "ingredient-ref-onion-powder",
            nameFr = "poudre d'oignon",
            nameEn = "onion powder"
        ),
        ingredient(
            id = "ingredient-ref-sesame-seeds",
            nameFr = "graines de sésame",
            nameEn = "sesame seeds"
        ),
        ingredient(
            id = "ingredient-ref-soy-sauce",
            nameFr = "sauce soya",
            nameEn = "soy sauce",
            aliasesEn = listOf("tamari"),
            defaultDensity = 1.2,
            unitMappings = listOf(mapping("tbsp", "g", 18.0), mapping("tsp", "g", 6.0))
        ),
        ingredient(
            id = "ingredient-ref-worcestershire-sauce",
            nameFr = "sauce worcestershire",
            nameEn = "Worcestershire sauce",
            defaultDensity = 1.17,
            unitMappings = listOf(mapping("tbsp", "g", 17.5), mapping("tsp", "g", 5.8))
        ),
        ingredient(
            id = "ingredient-ref-semisweet-chocolate-chips",
            nameFr = "pepites de chocolat mi-sucré",
            nameEn = "semisweet chocolate chips",
            aliasesEn = listOf("semi-sweet chocolate chips")
        ),
        ingredient(
            id = "ingredient-ref-white-chocolate-chips",
            nameFr = "pepites de chocolat blanc",
            nameEn = "white chocolate chips"
        ),
        ingredient(
            id = "ingredient-ref-almond-milk",
            nameFr = "lait d'amande",
            nameEn = "almond milk",
            defaultDensity = 1.01,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0), mapping("fl oz", "ml", 29.57))
        ),
        ingredient(
            id = "ingredient-ref-oat-milk",
            nameFr = "lait d'avoine",
            nameEn = "oat milk",
            defaultDensity = 1.03,
            unitMappings = listOf(mapping("cup", "g", 244.0), mapping("tbsp", "g", 15.3), mapping("tsp", "g", 5.1), mapping("fl oz", "ml", 29.57))
        ),
        ingredient(
            id = "ingredient-ref-banana",
            nameFr = "banane",
            nameEn = "banana",
            aliasesEn = listOf("over-ripe banana", "banana slices")
        ),
        ingredient(
            id = "ingredient-ref-chocolate-chips",
            nameFr = "pepites de chocolat",
            nameEn = "chocolate chips"
        ),
        ingredient(
            id = "ingredient-ref-coconut-oil",
            nameFr = "huile de coco",
            nameEn = "coconut oil",
            defaultDensity = 0.92,
            unitMappings = listOf(mapping("cup", "g", 218.0), mapping("tbsp", "g", 13.6), mapping("tsp", "g", 4.5))
        ),
        ingredient(
            id = "ingredient-ref-vinegar",
            nameFr = "vinaigre",
            nameEn = "vinegar",
            defaultDensity = 1.01,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-hazelnuts",
            nameFr = "noisettes",
            nameEn = "hazelnuts"
        ),
        ingredient(
            id = "ingredient-ref-pistachios",
            nameFr = "pistaches",
            nameEn = "pistachios"
        ),
        ingredient(
            id = "ingredient-ref-pistachio-paste",
            nameFr = "pâte de pistache",
            nameEn = "pistachio paste"
        ),
        ingredient(
            id = "ingredient-ref-ground-ginger",
            nameFr = "gingembre moulu",
            nameEn = "ground ginger"
        ),
        ingredient(
            id = "ingredient-ref-coriander",
            nameFr = "coriandre moulue",
            nameEn = "coriander"
        ),
        ingredient(
            id = "ingredient-ref-strawberries",
            nameFr = "fraises",
            nameEn = "strawberries",
            aliasesEn = listOf("fresh strawberries")
        ),
        ingredient(
            id = "ingredient-ref-chicken-breast",
            nameFr = "poitrine de poulet",
            nameEn = "chicken breast",
            aliasesEn = listOf("boneless skinless chicken breast", "chicken breasts")
        ),
        ingredient(
            id = "ingredient-ref-ground-beef",
            nameFr = "bœuf hache",
            nameEn = "ground beef",
            aliasesEn = listOf("minced beef")
        ),
        ingredient(
            id = "ingredient-ref-baby-spinach",
            nameFr = "jeunes épinards",
            nameEn = "baby spinach",
            aliasesEn = listOf("spinach")
        ),
        ingredient(
            id = "ingredient-ref-broccoli",
            nameFr = "brocoli",
            nameEn = "broccoli"
        ),
        ingredient(
            id = "ingredient-ref-asparagus",
            nameFr = "asperges",
            nameEn = "asparagus"
        ),
        ingredient(
            id = "ingredient-ref-bread-crumbs",
            nameFr = "chapelure",
            nameEn = "bread crumbs"
        ),
        ingredient(
            id = "ingredient-ref-cardamom",
            nameFr = "cardamome moulue",
            nameEn = "ground cardamom",
            aliasesEn = listOf("cardamom")
        ),
        ingredient(
            id = "ingredient-ref-chili-powder",
            nameFr = "poudre de chili",
            nameEn = "chili powder"
        ),
        ingredient(
            id = "ingredient-ref-cloves",
            nameFr = "girofle moulue",
            nameEn = "ground cloves",
            aliasesEn = listOf("cloves")
        ),
        ingredient(
            id = "ingredient-ref-bbq-sauce",
            nameFr = "sauce bbq",
            nameEn = "BBQ sauce",
            defaultDensity = 1.1,
            unitMappings = listOf(mapping("cup", "g", 260.0), mapping("tbsp", "g", 16.3), mapping("tsp", "g", 5.4))
        ),
        ingredient(
            id = "ingredient-ref-sprinkles",
            nameFr = "vermicelles décoratifs",
            nameEn = "sprinkles"
        ),
        ingredient(
            id = "ingredient-ref-cream-cheese",
            nameFr = "fromage à la crème",
            nameEn = "cream cheese",
            defaultDensity = 0.96,
            unitMappings = listOf(mapping("cup", "g", 225.0), mapping("tbsp", "g", 14.0), mapping("tsp", "g", 4.7))
        ),
        ingredient(
            id = "ingredient-ref-allspice",
            nameFr = "quatre-épices",
            nameEn = "allspice"
        ),
        ingredient(
            id = "ingredient-ref-cilantro",
            nameFr = "coriandre fraîche",
            nameEn = "cilantro"
        ),
        ingredient(
            id = "ingredient-ref-cream-of-tartar",
            nameFr = "creme de tartre",
            nameEn = "cream of tartar"
        ),
        ingredient(
            id = "ingredient-ref-cranberries",
            nameFr = "canneberges",
            nameEn = "cranberries",
            aliasesEn = listOf("fresh cranberries")
        ),
        ingredient(
            id = "ingredient-ref-custard-powder",
            nameFr = "poudre à crème pâtissière",
            nameEn = "custard powder"
        ),
        ingredient(
            id = "ingredient-ref-curry-paste",
            nameFr = "pâte de cari",
            nameEn = "curry paste"
        ),
        ingredient(
            id = "ingredient-ref-curry-powder",
            nameFr = "poudre de cari",
            nameEn = "curry powder"
        ),
        ingredient(
            id = "ingredient-ref-chipotle-in-adobo",
            nameFr = "chipotle en adobo",
            nameEn = "chipotle in adobo"
        ),
        ingredient(
            id = "ingredient-ref-dijon-mustard",
            nameFr = "moutarde de Dijon",
            nameEn = "Dijon mustard",
            defaultDensity = 1.0,
            unitMappings = listOf(mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-white-vinegar",
            nameFr = "vinaigre blanc",
            nameEn = "white vinegar",
            aliasesEn = listOf("distilled white vinegar"),
            defaultDensity = 1.01,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-chili-flakes",
            nameFr = "flocons de piment",
            nameEn = "chili flakes"
        ),
        ingredient(
            id = "ingredient-ref-turmeric",
            nameFr = "curcuma",
            nameEn = "turmeric"
        ),
        ingredient(
            id = "ingredient-ref-ground-coriander",
            nameFr = "coriandre moulue",
            nameEn = "ground coriander"
        ),
        ingredient(
            id = "ingredient-ref-cumin-seeds",
            nameFr = "graines de cumin",
            nameEn = "cumin seeds"
        ),
        ingredient(
            id = "ingredient-ref-mustard-powder",
            nameFr = "moutarde en poudre",
            nameEn = "mustard powder"
        ),
        ingredient(
            id = "ingredient-ref-fennel-seeds",
            nameFr = "graines de fenouil",
            nameEn = "fennel seeds"
        ),
        ingredient(
            id = "ingredient-ref-caraway-seeds",
            nameFr = "graines de carvi",
            nameEn = "caraway seeds"
        ),
        ingredient(
            id = "ingredient-ref-hot-paprika",
            nameFr = "paprika fort",
            nameEn = "hot paprika"
        ),
        ingredient(
            id = "ingredient-ref-saffron",
            nameFr = "safran",
            nameEn = "saffron"
        ),
        ingredient(
            id = "ingredient-ref-sumac",
            nameFr = "sumac",
            nameEn = "sumac"
        ),
        ingredient(
            id = "ingredient-ref-zaatar",
            nameFr = "za'atar",
            nameEn = "za'atar"
        ),
        ingredient(
            id = "ingredient-ref-garam-masala",
            nameFr = "garam masala",
            nameEn = "garam masala"
        ),
        ingredient(
            id = "ingredient-ref-five-spice-powder",
            nameFr = "cinq-épices",
            nameEn = "five-spice powder"
        ),
        ingredient(
            id = "ingredient-ref-curry-leaves",
            nameFr = "feuilles de cari",
            nameEn = "curry leaves"
        ),
        ingredient(
            id = "ingredient-ref-bay-leaves",
            nameFr = "feuilles de laurier",
            nameEn = "bay leaves"
        ),
        ingredient(
            id = "ingredient-ref-parsley",
            nameFr = "persil",
            nameEn = "parsley"
        ),
        ingredient(
            id = "ingredient-ref-dried-parsley",
            nameFr = "persil séché",
            nameEn = "dried parsley",
            aliasesEn = listOf("dried parsley leaves")
        ),
        ingredient(
            id = "ingredient-ref-basil",
            nameFr = "basilic",
            nameEn = "basil",
            aliasesEn = listOf("basil leaves")
        ),
        ingredient(
            id = "ingredient-ref-dried-rosemary",
            nameFr = "romarin séché",
            nameEn = "dried rosemary",
            aliasesEn = listOf("dried rosemary leaves")
        ),
        ingredient(
            id = "ingredient-ref-rosemary",
            nameFr = "romarin",
            nameEn = "rosemary"
        ),
        ingredient(
            id = "ingredient-ref-thyme",
            nameFr = "thym",
            nameEn = "thyme"
        ),
        ingredient(
            id = "ingredient-ref-sage",
            nameFr = "sauge",
            nameEn = "sage"
        ),
        ingredient(
            id = "ingredient-ref-dill",
            nameFr = "aneth",
            nameEn = "dill"
        ),
        ingredient(
            id = "ingredient-ref-mint",
            nameFr = "menthe",
            nameEn = "mint"
        ),
        ingredient(
            id = "ingredient-ref-fresh-oregano",
            nameFr = "origan frais",
            nameEn = "fresh oregano"
        ),
        ingredient(
            id = "ingredient-ref-chives",
            nameFr = "ciboulette",
            nameEn = "chives"
        ),
        ingredient(
            id = "ingredient-ref-tarragon",
            nameFr = "estragon",
            nameEn = "tarragon"
        ),
        ingredient(
            id = "ingredient-ref-marjoram",
            nameFr = "marjolaine",
            nameEn = "marjoram"
        ),
        ingredient(
            id = "ingredient-ref-apple",
            nameFr = "pomme",
            nameEn = "apple"
        ),
        ingredient(
            id = "ingredient-ref-pear",
            nameFr = "poire",
            nameEn = "pear"
        ),
        ingredient(
            id = "ingredient-ref-peach",
            nameFr = "pêche",
            nameEn = "peach"
        ),
        ingredient(
            id = "ingredient-ref-raspberry",
            nameFr = "framboise",
            nameEn = "raspberry"
        ),
        ingredient(
            id = "ingredient-ref-blackberry",
            nameFr = "mûre",
            nameEn = "blackberry"
        ),
        ingredient(
            id = "ingredient-ref-cherry",
            nameFr = "cerise",
            nameEn = "cherry"
        ),
        ingredient(
            id = "ingredient-ref-lemon",
            nameFr = "citron",
            nameEn = "lemon"
        ),
        ingredient(
            id = "ingredient-ref-lime",
            nameFr = "lime",
            nameEn = "lime"
        ),
        ingredient(
            id = "ingredient-ref-orange",
            nameFr = "orange",
            nameEn = "orange"
        ),
        ingredient(
            id = "ingredient-ref-grapefruit",
            nameFr = "pamplemousse",
            nameEn = "grapefruit"
        ),
        ingredient(
            id = "ingredient-ref-pineapple",
            nameFr = "ananas",
            nameEn = "pineapple"
        ),
        ingredient(
            id = "ingredient-ref-mango",
            nameFr = "mangue",
            nameEn = "mango"
        ),
        ingredient(
            id = "ingredient-ref-avocado",
            nameFr = "avocat",
            nameEn = "avocado"
        ),
        ingredient(
            id = "ingredient-ref-coconut",
            nameFr = "noix de coco",
            nameEn = "coconut"
        ),
        ingredient(
            id = "ingredient-ref-pomegranate-seeds",
            nameFr = "graines de grenade",
            nameEn = "pomegranate seeds"
        ),
        ingredient(
            id = "ingredient-ref-dried-apricot",
            nameFr = "abricot séché",
            nameEn = "dried apricot"
        ),
        ingredient(
            id = "ingredient-ref-prune",
            nameFr = "pruneau",
            nameEn = "prune"
        ),
        ingredient(
            id = "ingredient-ref-bell-pepper",
            nameFr = "poivron",
            nameEn = "bell pepper"
        ),
        ingredient(
            id = "ingredient-ref-jalapeno",
            nameFr = "jalapeño",
            nameEn = "jalapeño"
        ),
        ingredient(
            id = "ingredient-ref-chili-pepper",
            nameFr = "piment",
            nameEn = "chili pepper"
        ),
        ingredient(
            id = "ingredient-ref-shallot",
            nameFr = "échalote",
            nameEn = "shallot"
        ),
        ingredient(
            id = "ingredient-ref-green-onions",
            nameFr = "oignons verts",
            nameEn = "green onions",
            aliasesEn = listOf("scallions")
        ),
        ingredient(
            id = "ingredient-ref-ginger",
            nameFr = "gingembre",
            nameEn = "ginger"
        ),
        ingredient(
            id = "ingredient-ref-mushrooms",
            nameFr = "champignons",
            nameEn = "mushrooms"
        ),
        ingredient(
            id = "ingredient-ref-zucchini",
            nameFr = "zucchini",
            nameEn = "zucchini"
        ),
        ingredient(
            id = "ingredient-ref-cucumber",
            nameFr = "concombre",
            nameEn = "cucumber"
        ),
        ingredient(
            id = "ingredient-ref-lettuce",
            nameFr = "laitue",
            nameEn = "lettuce"
        ),
        ingredient(
            id = "ingredient-ref-cabbage",
            nameFr = "chou",
            nameEn = "cabbage"
        ),
        ingredient(
            id = "ingredient-ref-red-cabbage",
            nameFr = "chou rouge",
            nameEn = "red cabbage"
        ),
        ingredient(
            id = "ingredient-ref-cauliflower",
            nameFr = "chou-fleur",
            nameEn = "cauliflower"
        ),
        ingredient(
            id = "ingredient-ref-sweet-potato",
            nameFr = "patate douce",
            nameEn = "sweet potato"
        ),
        ingredient(
            id = "ingredient-ref-butternut-squash",
            nameFr = "courge musquée",
            nameEn = "butternut squash"
        ),
        ingredient(
            id = "ingredient-ref-pumpkin-puree",
            nameFr = "purée de citrouille",
            nameEn = "pumpkin puree"
        ),
        ingredient(
            id = "ingredient-ref-corn",
            nameFr = "mais",
            nameEn = "corn"
        ),
        ingredient(
            id = "ingredient-ref-peas",
            nameFr = "pois",
            nameEn = "peas"
        ),
        ingredient(
            id = "ingredient-ref-green-beans",
            nameFr = "haricots verts",
            nameEn = "green beans"
        ),
        ingredient(
            id = "ingredient-ref-spinach",
            nameFr = "épinards",
            nameEn = "spinach"
        ),
        ingredient(
            id = "ingredient-ref-kale",
            nameFr = "chou kale",
            nameEn = "kale"
        ),
        ingredient(
            id = "ingredient-ref-lentils",
            nameFr = "lentilles",
            nameEn = "lentils"
        ),
        ingredient(
            id = "ingredient-ref-dried-chickpeas",
            nameFr = "pois chiches séchés",
            nameEn = "dried chickpeas"
        ),
        ingredient(
            id = "ingredient-ref-white-beans",
            nameFr = "haricots blancs",
            nameEn = "white beans"
        ),
        ingredient(
            id = "ingredient-ref-cannellini-beans",
            nameFr = "haricots cannellini",
            nameEn = "cannellini beans"
        ),
        ingredient(
            id = "ingredient-ref-kidney-beans",
            nameFr = "haricots rouges",
            nameEn = "kidney beans"
        ),
        ingredient(
            id = "ingredient-ref-navy-beans",
            nameFr = "haricots navy",
            nameEn = "navy beans"
        ),
        ingredient(
            id = "ingredient-ref-pinto-beans",
            nameFr = "haricots pinto",
            nameEn = "pinto beans"
        ),
        ingredient(
            id = "ingredient-ref-split-peas",
            nameFr = "pois casses",
            nameEn = "split peas"
        ),
        ingredient(
            id = "ingredient-ref-black-eyed-peas",
            nameFr = "pois à œil noir",
            nameEn = "black-eyed peas"
        ),
        ingredient(
            id = "ingredient-ref-mozzarella",
            nameFr = "mozzarella",
            nameEn = "mozzarella"
        ),
        ingredient(
            id = "ingredient-ref-gruyere",
            nameFr = "gruyère",
            nameEn = "Gruyère"
        ),
        ingredient(
            id = "ingredient-ref-cream",
            nameFr = "crème",
            nameEn = "cream",
            defaultDensity = 0.99,
            unitMappings = listOf(mapping("cup", "g", 238.0), mapping("tbsp", "g", 14.9), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-creme-fraiche",
            nameFr = "crème fraîche",
            nameEn = "crème fraîche",
            defaultDensity = 0.98,
            unitMappings = listOf(mapping("cup", "g", 230.0), mapping("tbsp", "g", 14.4), mapping("tsp", "g", 4.8))
        ),
        ingredient(
            id = "ingredient-ref-ricotta",
            nameFr = "ricotta",
            nameEn = "ricotta"
        ),
        ingredient(
            id = "ingredient-ref-cottage-cheese",
            nameFr = "fromage cottage",
            nameEn = "cottage cheese"
        ),
        ingredient(
            id = "ingredient-ref-feta",
            nameFr = "feta",
            nameEn = "feta"
        ),
        ingredient(
            id = "ingredient-ref-goat-cheese",
            nameFr = "fromage de chèvre",
            nameEn = "goat cheese"
        ),
        ingredient(
            id = "ingredient-ref-mascarpone",
            nameFr = "mascarpone",
            nameEn = "mascarpone"
        ),
        ingredient(
            id = "ingredient-ref-provolone",
            nameFr = "provolone",
            nameEn = "provolone"
        ),
        ingredient(
            id = "ingredient-ref-monterey-jack",
            nameFr = "monterey jack",
            nameEn = "Monterey Jack"
        ),
        ingredient(
            id = "ingredient-ref-swiss-cheese",
            nameFr = "fromage suisse",
            nameEn = "Swiss cheese"
        ),
        ingredient(
            id = "ingredient-ref-yogurt",
            nameFr = "yogourt",
            nameEn = "yogurt"
        ),
        ingredient(
            id = "ingredient-ref-greek-yogurt",
            nameFr = "yogourt grec",
            nameEn = "Greek yogurt"
        ),
        ingredient(
            id = "ingredient-ref-salted-butter",
            nameFr = "beurre salé",
            nameEn = "salted butter",
            defaultDensity = 0.96,
            unitMappings = listOf(mapping("cup", "g", 227.0), mapping("tbsp", "g", 14.2), mapping("tsp", "g", 4.7))
        ),
        ingredient(
            id = "ingredient-ref-egg-substitute",
            nameFr = "substitut d œuf",
            nameEn = "egg substitute"
        ),
        ingredient(
            id = "ingredient-ref-flour-tortillas",
            nameFr = "tortillas de farine",
            nameEn = "flour tortillas"
        ),
        ingredient(
            id = "ingredient-ref-breadcrumbs",
            nameFr = "chapelure",
            nameEn = "breadcrumbs",
            aliasesEn = listOf("dried bread crumbs")
        ),
        ingredient(
            id = "ingredient-ref-yeast",
            nameFr = "levure",
            nameEn = "yeast",
            aliasesEn = listOf("dried yeast")
        ),
        ingredient(
            id = "ingredient-ref-marshmallow-creme",
            nameFr = "crème de guimauve",
            nameEn = "marshmallow creme"
        ),
        ingredient(
            id = "ingredient-ref-peanut-oil",
            nameFr = "huile d'arachide",
            nameEn = "peanut oil",
            defaultDensity = 0.92,
            unitMappings = listOf(mapping("cup", "g", 218.0), mapping("tbsp", "g", 13.6), mapping("tsp", "g", 4.5))
        ),
        ingredient(
            id = "ingredient-ref-toasted-sesame-oil",
            nameFr = "huile de sésame grillée",
            nameEn = "toasted sesame oil",
            defaultDensity = 0.92,
            unitMappings = listOf(mapping("cup", "g", 218.0), mapping("tbsp", "g", 13.6), mapping("tsp", "g", 4.5))
        ),
        ingredient(
            id = "ingredient-ref-avocado-oil",
            nameFr = "huile d'avocat",
            nameEn = "avocado oil",
            defaultDensity = 0.92,
            unitMappings = listOf(mapping("cup", "g", 218.0), mapping("tbsp", "g", 13.6), mapping("tsp", "g", 4.5))
        ),
        ingredient(
            id = "ingredient-ref-mayo",
            nameFr = "mayonnaise",
            nameEn = "mayo",
            defaultDensity = 0.95,
            unitMappings = listOf(mapping("cup", "g", 220.0), mapping("tbsp", "g", 13.8), mapping("tsp", "g", 4.6))
        ),
        ingredient(
            id = "ingredient-ref-mustard",
            nameFr = "moutarde",
            nameEn = "mustard",
            defaultDensity = 1.0,
            unitMappings = listOf(mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-tomato-sauce",
            nameFr = "sauce tomate",
            nameEn = "tomato sauce",
            defaultDensity = 1.05,
            unitMappings = listOf(mapping("cup", "g", 250.0), mapping("tbsp", "g", 15.6), mapping("tsp", "g", 5.2))
        ),
        ingredient(
            id = "ingredient-ref-crushed-tomatoes",
            nameFr = "tomates broyées",
            nameEn = "crushed tomatoes",
            defaultDensity = 1.0,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0))
        ),
        ingredient(
            id = "ingredient-ref-whole-tomatoes",
            nameFr = "tomates entières",
            nameEn = "whole tomatoes"
        ),
        ingredient(
            id = "ingredient-ref-salsa",
            nameFr = "salsa",
            nameEn = "salsa"
        ),
        ingredient(
            id = "ingredient-ref-tahini",
            nameFr = "tahini",
            nameEn = "tahini",
            defaultDensity = 1.0,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-miso",
            nameFr = "miso",
            nameEn = "miso"
        ),
        ingredient(
            id = "ingredient-ref-hoisin-sauce",
            nameFr = "sauce hoisin",
            nameEn = "hoisin sauce",
            defaultDensity = 1.2,
            unitMappings = listOf(mapping("tbsp", "g", 18.0), mapping("tsp", "g", 6.0))
        ),
        ingredient(
            id = "ingredient-ref-oyster-sauce",
            nameFr = "sauce aux huitres",
            nameEn = "oyster sauce",
            defaultDensity = 1.2,
            unitMappings = listOf(mapping("tbsp", "g", 18.0), mapping("tsp", "g", 6.0))
        ),
        ingredient(
            id = "ingredient-ref-rice-vinegar",
            nameFr = "vinaigre de riz",
            nameEn = "rice vinegar",
            defaultDensity = 1.01,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-apple-cider-vinegar",
            nameFr = "vinaigre de cidre",
            nameEn = "apple cider vinegar",
            defaultDensity = 1.01,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-balsamic-vinegar",
            nameFr = "vinaigre balsamique",
            nameEn = "balsamic vinegar",
            defaultDensity = 1.05,
            unitMappings = listOf(mapping("cup", "g", 250.0), mapping("tbsp", "g", 15.6), mapping("tsp", "g", 5.2))
        ),
        ingredient(
            id = "ingredient-ref-red-wine-vinegar",
            nameFr = "vinaigre de vin rouge",
            nameEn = "red wine vinegar",
            defaultDensity = 1.01,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-white-wine-vinegar",
            nameFr = "vinaigre de vin blanc",
            nameEn = "white wine vinegar",
            defaultDensity = 1.01,
            unitMappings = listOf(mapping("cup", "g", 240.0), mapping("tbsp", "g", 15.0), mapping("tsp", "g", 5.0))
        ),
        ingredient(
            id = "ingredient-ref-maple-sugar",
            nameFr = "sucre d'érable",
            nameEn = "maple sugar"
        ),
        ingredient(
            id = "ingredient-ref-brown-rice-syrup",
            nameFr = "sirop de riz brun",
            nameEn = "brown rice syrup"
        ),
        ingredient(
            id = "ingredient-ref-jam",
            nameFr = "confiture",
            nameEn = "jam"
        ),
        ingredient(
            id = "ingredient-ref-apricot-jam",
            nameFr = "confiture d'abricot",
            nameEn = "apricot jam"
        ),
        ingredient(
            id = "ingredient-ref-strawberry-jam",
            nameFr = "confiture de fraise",
            nameEn = "strawberry jam"
        ),
        ingredient(
            id = "ingredient-ref-peanut-butter-chips",
            nameFr = "brisures de beurre d'arachide",
            nameEn = "peanut butter chips"
        ),
        ingredient(
            id = "ingredient-ref-butterscotch-chips",
            nameFr = "brisures de caramel écossais",
            nameEn = "butterscotch chips"
        ),
        ingredient(
            id = "ingredient-ref-broth-concentrate",
            nameFr = "concentré de bouillon",
            nameEn = "broth concentrate"
        ),
        ingredient(
            id = "ingredient-ref-bacon",
            nameFr = "bacon",
            nameEn = "bacon",
            aliasesFr = listOf("lard fumé"),
            unitMappings = listOf(mapping("slice", "g", 8.0))
        )
    )
}

private val canonicalIngredientReferenceIds = mapOf(
    "ingredient-ref-light-brown-sugar" to "ingredient-ref-brown-sugar",
    "ingredient-ref-fine-salt" to "ingredient-ref-salt",
    "ingredient-ref-kosher-salt" to "ingredient-ref-salt",
    "ingredient-ref-butter" to "ingredient-ref-unsalted-butter",
    "ingredient-ref-cold-unsalted-butter" to "ingredient-ref-unsalted-butter",
    "ingredient-ref-cheddar-cheese-shredded" to "ingredient-ref-cheddar-cheese",
    "ingredient-ref-parmesan-cheese-grated" to "ingredient-ref-parmesan-cheese",
    "ingredient-ref-canned-black-beans" to "ingredient-ref-black-beans",
    "ingredient-ref-canned-chickpeas" to "ingredient-ref-chickpeas"
)

internal fun normalizeBundledRecipes(recipes: List<Recipe>): List<Recipe> = recipes.map { recipe ->
    recipe.copy(
        ingredients = recipe.ingredients.map { ingredient ->
            ingredient.copy(ingredientRefId = canonicalIngredientReferenceIds[ingredient.ingredientRefId] ?: ingredient.ingredientRefId)
        }
    )
}

internal fun mergeBundledIngredientReferences(
    bundledReferences: List<IngredientReference>,
    curatedReferences: List<IngredientReference> = BundledIngredientCatalog.references
): List<IngredientReference> {
    val merged = linkedMapOf<String, IngredientReference>()
    bundledReferences
        .filterNot { canonicalIngredientReferenceIds.containsKey(it.id) }
        .forEach { merged[it.id] = it }
    curatedReferences.forEach { merged[it.id] = it }
    return merged.values.toList()
}

private fun categoryForIngredientId(id: String): IngredientCategory = when (id) {
    in setOf(
        "ingredient-ref-all-purpose-flour",
        "ingredient-ref-bread-flour",
        "ingredient-ref-whole-wheat-flour",
        "ingredient-ref-cake-flour",
        "ingredient-ref-almond-flour",
        "ingredient-ref-cornstarch",
        "ingredient-ref-arrowroot",
        "ingredient-ref-custard-powder"
    ) -> IngredientCategory.FLOUR_AND_STARCH
    in setOf(
        "ingredient-ref-rolled-oats",
        "ingredient-ref-quick-oats",
        "ingredient-ref-rice",
        "ingredient-ref-arborio-rice"
    ) -> IngredientCategory.GRAIN_AND_CEREAL
    in setOf(
        "ingredient-ref-sugar",
        "ingredient-ref-granulated-sugar",
        "ingredient-ref-brown-sugar",
        "ingredient-ref-icing-sugar",
        "ingredient-ref-honey",
        "ingredient-ref-maple-syrup",
        "ingredient-ref-molasses",
        "ingredient-ref-corn-syrup",
        "ingredient-ref-maple-sugar",
        "ingredient-ref-brown-rice-syrup"
    ) -> IngredientCategory.SUGAR_AND_SWEETENER
    in setOf(
        "ingredient-ref-baking-powder",
        "ingredient-ref-baking-soda",
        "ingredient-ref-salt",
        "ingredient-ref-black-pepper",
        "ingredient-ref-cinnamon",
        "ingredient-ref-vanilla-extract",
        "ingredient-ref-almond-extract",
        "ingredient-ref-paprika",
        "ingredient-ref-smoked-paprika",
        "ingredient-ref-hot-paprika",
        "ingredient-ref-cayenne-pepper",
        "ingredient-ref-chili-powder",
        "ingredient-ref-chili-flakes",
        "ingredient-ref-garlic-powder",
        "ingredient-ref-onion-powder",
        "ingredient-ref-ground-cumin",
        "ingredient-ref-cumin-seeds",
        "ingredient-ref-coriander",
        "ingredient-ref-ground-coriander",
        "ingredient-ref-cardamom",
        "ingredient-ref-cloves",
        "ingredient-ref-allspice",
        "ingredient-ref-cream-of-tartar",
        "ingredient-ref-ground-ginger",
        "ingredient-ref-turmeric",
        "ingredient-ref-mustard-powder",
        "ingredient-ref-fennel-seeds",
        "ingredient-ref-caraway-seeds",
        "ingredient-ref-saffron",
        "ingredient-ref-sumac",
        "ingredient-ref-zaatar",
        "ingredient-ref-garam-masala",
        "ingredient-ref-five-spice-powder",
        "ingredient-ref-bay-leaves",
        "ingredient-ref-curry-leaves",
        "ingredient-ref-curry-powder",
        "ingredient-ref-nutmeg"
    ) -> IngredientCategory.BAKING_AND_SPICE
    in setOf(
        "ingredient-ref-basil",
        "ingredient-ref-dried-basil",
        "ingredient-ref-thyme",
        "ingredient-ref-dried-thyme",
        "ingredient-ref-rosemary",
        "ingredient-ref-dried-rosemary",
        "ingredient-ref-parsley",
        "ingredient-ref-dried-parsley",
        "ingredient-ref-sage",
        "ingredient-ref-dill",
        "ingredient-ref-mint",
        "ingredient-ref-fresh-oregano",
        "ingredient-ref-dried-oregano",
        "ingredient-ref-chives",
        "ingredient-ref-tarragon",
        "ingredient-ref-marjoram",
        "ingredient-ref-cilantro"
    ) -> IngredientCategory.HERB
    in setOf(
        "ingredient-ref-unsweetened-cocoa-powder",
        "ingredient-ref-dutch-process-cocoa-powder",
        "ingredient-ref-semisweet-chocolate",
        "ingredient-ref-dark-chocolate",
        "ingredient-ref-bittersweet-chocolate",
        "ingredient-ref-white-chocolate",
        "ingredient-ref-milk-chocolate",
        "ingredient-ref-unsweetened-chocolate",
        "ingredient-ref-semisweet-chocolate-chips",
        "ingredient-ref-white-chocolate-chips",
        "ingredient-ref-chocolate-chips",
        "ingredient-ref-sprinkles",
        "ingredient-ref-marshmallow-creme",
        "ingredient-ref-peanut-butter-chips",
        "ingredient-ref-butterscotch-chips"
    ) -> IngredientCategory.CHOCOLATE_AND_CANDY
    in setOf(
        "ingredient-ref-unsalted-butter",
        "ingredient-ref-salted-butter",
        "ingredient-ref-margarine",
        "ingredient-ref-shortening",
        "ingredient-ref-olive-oil",
        "ingredient-ref-vegetable-oil",
        "ingredient-ref-coconut-oil",
        "ingredient-ref-avocado-oil",
        "ingredient-ref-peanut-oil",
        "ingredient-ref-toasted-sesame-oil",
        "ingredient-ref-natural-peanut-butter",
        "ingredient-ref-almond-butter",
        "ingredient-ref-tahini"
    ) -> IngredientCategory.FAT_AND_OIL
    in setOf(
        "ingredient-ref-milk",
        "ingredient-ref-half-and-half",
        "ingredient-ref-buttermilk",
        "ingredient-ref-heavy-cream",
        "ingredient-ref-sour-cream",
        "ingredient-ref-plain-yogurt",
        "ingredient-ref-yogurt",
        "ingredient-ref-greek-yogurt",
        "ingredient-ref-sweetened-condensed-milk",
        "ingredient-ref-evaporated-milk",
        "ingredient-ref-coconut-milk",
        "ingredient-ref-almond-milk",
        "ingredient-ref-oat-milk",
        "ingredient-ref-cream",
        "ingredient-ref-creme-fraiche"
    ) -> IngredientCategory.DAIRY_AND_ALTERNATIVE
    in setOf(
        "ingredient-ref-egg",
        "ingredient-ref-egg-white",
        "ingredient-ref-egg-yolk",
        "ingredient-ref-egg-substitute"
    ) -> IngredientCategory.EGG
    in setOf(
        "ingredient-ref-cheddar-cheese",
        "ingredient-ref-parmesan-cheese",
        "ingredient-ref-cream-cheese",
        "ingredient-ref-cottage-cheese",
        "ingredient-ref-feta",
        "ingredient-ref-goat-cheese",
        "ingredient-ref-gruyere",
        "ingredient-ref-mascarpone",
        "ingredient-ref-monterey-jack",
        "ingredient-ref-mozzarella",
        "ingredient-ref-provolone",
        "ingredient-ref-ricotta",
        "ingredient-ref-swiss-cheese"
    ) -> IngredientCategory.CHEESE
    in setOf(
        "ingredient-ref-graham-cracker-crumbs",
        "ingredient-ref-bread-crumbs",
        "ingredient-ref-breadcrumbs",
        "ingredient-ref-shredded-coconut",
        "ingredient-ref-gelatin",
        "ingredient-ref-flour-tortillas",
        "ingredient-ref-yeast"
    ) -> IngredientCategory.BAKING_MIXIN_AND_PANTRY
    in setOf(
        "ingredient-ref-almonds",
        "ingredient-ref-pecans",
        "ingredient-ref-walnuts",
        "ingredient-ref-hazelnuts",
        "ingredient-ref-pistachios",
        "ingredient-ref-sesame-seeds",
        "ingredient-ref-raisins",
        "ingredient-ref-dried-cranberries",
        "ingredient-ref-dried-apricot",
        "ingredient-ref-prune",
        "ingredient-ref-medjool-dates",
        "ingredient-ref-pistachio-paste"
    ) -> IngredientCategory.NUT_SEED_AND_DRIED_FRUIT
    in setOf(
        "ingredient-ref-apple",
        "ingredient-ref-banana",
        "ingredient-ref-blueberries",
        "ingredient-ref-strawberries",
        "ingredient-ref-pear",
        "ingredient-ref-peach",
        "ingredient-ref-raspberry",
        "ingredient-ref-blackberry",
        "ingredient-ref-cherry",
        "ingredient-ref-lemon",
        "ingredient-ref-lime",
        "ingredient-ref-orange",
        "ingredient-ref-grapefruit",
        "ingredient-ref-pineapple",
        "ingredient-ref-mango",
        "ingredient-ref-avocado",
        "ingredient-ref-coconut",
        "ingredient-ref-pomegranate-seeds",
        "ingredient-ref-cranberries"
    ) -> IngredientCategory.FRUIT
    in setOf(
        "ingredient-ref-onion",
        "ingredient-ref-garlic",
        "ingredient-ref-carrot",
        "ingredient-ref-celery",
        "ingredient-ref-potato",
        "ingredient-ref-leek",
        "ingredient-ref-tomatoes",
        "ingredient-ref-diced-tomatoes",
        "ingredient-ref-crushed-tomatoes",
        "ingredient-ref-whole-tomatoes",
        "ingredient-ref-tomato-paste",
        "ingredient-ref-tomato-sauce",
        "ingredient-ref-baby-spinach",
        "ingredient-ref-broccoli",
        "ingredient-ref-asparagus",
        "ingredient-ref-bell-pepper",
        "ingredient-ref-jalapeno",
        "ingredient-ref-chili-pepper",
        "ingredient-ref-green-onions",
        "ingredient-ref-shallot",
        "ingredient-ref-ginger",
        "ingredient-ref-mushrooms",
        "ingredient-ref-zucchini",
        "ingredient-ref-cucumber",
        "ingredient-ref-lettuce",
        "ingredient-ref-cabbage",
        "ingredient-ref-red-cabbage",
        "ingredient-ref-cauliflower",
        "ingredient-ref-sweet-potato",
        "ingredient-ref-butternut-squash",
        "ingredient-ref-pumpkin-puree",
        "ingredient-ref-corn",
        "ingredient-ref-peas",
        "ingredient-ref-green-beans",
        "ingredient-ref-spinach",
        "ingredient-ref-kale"
    ) -> IngredientCategory.VEGETABLE_AND_AROMATIC
    in setOf(
        "ingredient-ref-black-beans",
        "ingredient-ref-chickpeas",
        "ingredient-ref-lentils",
        "ingredient-ref-dried-chickpeas",
        "ingredient-ref-white-beans",
        "ingredient-ref-cannellini-beans",
        "ingredient-ref-kidney-beans",
        "ingredient-ref-navy-beans",
        "ingredient-ref-pinto-beans",
        "ingredient-ref-split-peas",
        "ingredient-ref-black-eyed-peas"
    ) -> IngredientCategory.LEGUME_AND_PULSE
    in setOf(
        "ingredient-ref-chicken-stock",
        "ingredient-ref-beef-stock",
        "ingredient-ref-vegetable-stock",
        "ingredient-ref-broth-concentrate"
    ) -> IngredientCategory.STOCK_AND_BROTH
    in setOf(
        "ingredient-ref-water",
        "ingredient-ref-lemon-juice",
        "ingredient-ref-lime-juice",
        "ingredient-ref-lemon-zest",
        "ingredient-ref-fish-sauce",
        "ingredient-ref-ketchup",
        "ingredient-ref-soy-sauce",
        "ingredient-ref-worcestershire-sauce",
        "ingredient-ref-vinegar",
        "ingredient-ref-white-vinegar",
        "ingredient-ref-rice-vinegar",
        "ingredient-ref-apple-cider-vinegar",
        "ingredient-ref-balsamic-vinegar",
        "ingredient-ref-red-wine-vinegar",
        "ingredient-ref-white-wine-vinegar",
        "ingredient-ref-bbq-sauce",
        "ingredient-ref-dijon-mustard",
        "ingredient-ref-mustard",
        "ingredient-ref-salsa",
        "ingredient-ref-miso",
        "ingredient-ref-hoisin-sauce",
        "ingredient-ref-oyster-sauce",
        "ingredient-ref-curry-paste",
        "ingredient-ref-chipotle-in-adobo",
        "ingredient-ref-mayo",
        "ingredient-ref-jam",
        "ingredient-ref-apricot-jam",
        "ingredient-ref-strawberry-jam"
    ) -> IngredientCategory.SAUCE_AND_CONDIMENT
    in setOf(
        "ingredient-ref-chicken-breast",
        "ingredient-ref-ground-beef",
        "ingredient-ref-bacon"
    ) -> IngredientCategory.PROTEIN
    else -> IngredientCategory.OTHER
}
private fun ingredient(
    id: String,
    nameFr: String,
    nameEn: String,
    category: IngredientCategory = categoryForIngredientId(id),
    aliasesFr: List<String> = emptyList(),
    aliasesEn: List<String> = emptyList(),
    defaultDensity: Double? = null,
    unitMappings: List<IngredientUnitMapping> = emptyList()
): IngredientReference = IngredientReference(
    id = id,
    nameFr = nameFr,
    nameEn = nameEn,
    category = category,
    aliasesFr = aliasesFr,
    aliasesEn = aliasesEn,
    defaultDensity = defaultDensity,
    unitMappings = unitMappings,
    updatedAt = "2026-03-20T00:00:00Z"
)

private fun mapping(fromUnit: String, toUnit: String, factor: Double): IngredientUnitMapping = IngredientUnitMapping(
    fromUnit = fromUnit,
    toUnit = toUnit,
    factor = factor
)












