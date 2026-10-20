# WP02 Section D — baking inclusions and decorations boundary review

- **Reviewed:** 2026-10-10
- **Status:** reviewed and integrated in part; the accepted identities and three scoped recipe links are recorded in `docs/catalog/batches/catalog-residual-boundaries-integration-20261010/README.md`; held candidates remain open
- **Scope:** butterscotch chips, caramel bits, toffee bits, marshmallows and marshmallow crème, nougat, candied ginger/citrus, glacé cherries, sugar pearls, sprinkles, and the boundary for edible baking decorations
- **Inputs:** AGENTS.md; Requirements.md; Section 04 D/E of docs/RecipeBook-global-ingredient-catalog-plan.txt; the 2026-10-09 coordinator and chocolate-boundary packets; live bundled references/forms; legacy candidates; research ledger; and every manifest-listed recipe
- **No implementation or QA:** this packet makes no seed, recipe, ledger, index, checklist, or roadmap changes; no tests or emulator work

## Recommendation

Promote the existing butterscotch-chip legacy candidate under its stable ID; retain the two marshmallow identities; correct the broad sprinkles display to the OQLF Québec term; and add identity-only candidates for nougat, candied ginger, separate candied orange and lemon peel, glacé cherries, and sugar pearls. Keep caramel bits, generic toffee bits, and generic edible decorations held. If accepted, link the Fraisier sugar-pearl line to its proposed identity and link the two unlinked chocolate-shavings rows to the existing ingredient-ref-chocolate-shavings identity.

The only measured recipe amounts in this scope are 7 oz marshmallow crème and 1/2 cup diced marshmallows; recipe 068 also records a count of 1 with the unit “for garnish.” Preserve all authored values. Manufacturer servings reviewed for branded items are product labels, not generic conversion evidence. No forms, densities, unit mappings, package yields, or substitutions are proposed.

## Scope and source requirements

The open Section 04 D rows at lines 1269–1276 of the catalog plan separate this batch from the next row for fruit purées, powders, freeze-dried fruit, pastes, jams, curds, fillings, dulce de leche, and caramel sauces. Requirements.md FR-3 and FR-7 require bilingual searchable reference names and aliases and linkable recipe lines. They do not support turning a use category such as “edible decorations” into one ingredient identity.

This is an identity and terminology review. A proposed add does not imply that a recipe uses it, that a product has a universal composition, or that it has a conversion or substitution relationship.

## Live snapshot and audit method

The snapshot below is the package baseline read during research on 2026-10-10, before concurrent shared-worktree integration edits. Counts and digests describe that reviewed baseline only; re-read the shared files before integration.

| Artifact | Count/state | Bytes | SHA-256 |
| --- | ---: | ---: | --- |
| manifest.v1.json | 114 recipe paths | 12,011 | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| ingredient-references.v1.json | 853 references | 268,252 | 70d0e37da498e5889ef97ff96fdaa4183b86e6ed4dfdc59e45addb816524aba9 |
| ingredient-forms.v1.json | 47 forms; no scoped-product form | 32,455 | 7676316bf4e3b0ba6972b6c0759f0a86156428f03a2e86730ff6b986756ff3ce |
| substitution-rules.v1.json | 0 rules | 3 | 37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570 |
| contextual-substitution-rules.v1.json | 0 rules | 3 | 37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570 |
| research-ledger.v1.json | 1,099 records; 2,613 source entries | 2,766,160 | acb5f6ed7b993f04c870e6c32e094e5671b368560e854dec137eef25fff0fc6b |
| legacy-import-identities.v1.json | 78 candidates | 18,736 | f998916c08bf8f095be6d4ff252d647eb2c44945638a24c70db688f8dd3b6abf |
| manifest-listed recipes | 114 files; 1,123 ingredient rows | 750,769 | 8cc0078c5d0e0f7c238700a4f65b060d061c61dfddd4549ede400cc4a1bff841 |

The recipe digest is SHA-256 over sorted recipe basenames, each followed by NUL, exact file bytes, and NUL. All 114 listed paths were present. Search normalization followed normalizeIngredientSearchKey in IngredientSearch.kt: lowercase, Unicode NFKD, fold œ/æ/ß and ampersands, remove combining marks, replace punctuation with spaces, and collapse whitespace. I checked exact normalized keys across all reference names/aliases, form labels/match terms, and legacy names/aliases; I also searched ingredient rows and full recipe text for English and French candidate phrases.

The source prefix WP02-BAKE-INC-DEC-20261010-S is absent from the current ledger and all pre-existing proposal files. The source IDs below are unique to this packet and are not ledger edits.

## Exact bundled-recipe demand

The scoped inclusion/decorations phrase search found four ingredient rows. A follow-up exact `ingredientName` audit also found two unlinked chocolate-shavings garnish rows within the broader decorations boundary. Six rows are assessed below.

| Recipe and exact line | Current link and context | Proposed handling |
| --- | --- | --- |
| 045 Fraisier, b8cf19ee-618b-495a-9ecb-9a90e88a9dac-ingredient-17: “Sugar pearls, to taste” | Unlinked; no quantity; Decoration group; notes say “pour décoration” / “For decoration.” English instructions also name sugar pearls; French instructions say “billes de sucre.” | If accepted, link only this row to ingredient-ref-sugar-pearls. Keep its text and absent quantity. |
| 054 Gâteau biscuit / Cookie Cake, ad2f1317-aa4d-4d1e-9aec-0d70a72228af-ingredient-15: “Sprinkles” | Linked to ingredient-ref-sprinkles; optional; no quantity; Decoration group. Recipe instructions say sprinkles in English and vermicelles in French. | Keep the existing ID. Update its French display to bonbons décoratifs; do not change the recipe line or prose. |
| 092 Fudge Red Velvet / Red Velvet Fudge, 80ae1de5-0430-4ea0-8109-94b0dcc8453e-ingredient-5: “7 oz marshmallow creme” | Linked to ingredient-ref-marshmallow-creme. Instructions repeat the product. | Keep the ID and authored 7 oz value. No volume conversion. |
| 102 Saucissons de chocolat / Chocolate Sausage, bd3f9152-5ea3-44c3-ad79-8f4d7624f07d-ingredient-6: “1/2 cup white marshmallows, diced” | Linked to ingredient-ref-marshmallows; preparation is en dés / diced. | Keep the ID and authored quantity/preparation. No mass conversion. |
| 057 Gâteau quadruple chocolat / Chocolate Truffle Cake, f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-28: “Bittersweet and white chocolate shavings, for garnish” | Unlinked; `ingredientName` is “chocolate shavings”; optional Garnish row; no quantity. French notes preserve “chocolat mi-amer et chocolat blanc, pour garnir”; English notes preserve the chocolate types. | Link to existing ingredient-ref-chocolate-shavings. Keep this as one row because the source line combines two chocolate types without separate amounts. Preserve its original text and notes; do not choose either type-specific base reference, split the row, add an alias to those bases, or create a shavings form. |
| 068 Mousse au chocolat / Chocolate Mousse, 2d53895b-8bd0-4225-bf63-766d29418eac-ingredient-11: “Chocolate shavings” | Unlinked; `ingredientName` exactly matches the active ingredient-ref-chocolate-shavings; quantity 1, unit “for garnish”; optional For serving row. | Link to existing ingredient-ref-chocolate-shavings. Preserve its authored quantity and garnish unit; no preparation form or conversion is supported. |

Recipe 013 Biscuits tourbillon / Pinwheel Cookies has a note-only suggestion to roll the log in colorful sprinkles; it has no ingredient row. No ingredient row or full-text match requests butterscotch chips, caramel bits, toffee bits, nougat, candied ginger, candied citrus, glacé cherries, or generic edible decorations.

The shavings reference is an existing exact identity: ingredient-ref-chocolate-shavings (`chocolate shavings` / `copeaux de chocolat`). The current forms file has no shavings form or shavings match term. The rows are therefore exact-reference link gaps, not evidence for another ingredient or a preparation-form record. Valrhona documents that shavings may be made from dark, white, or milk chocolate and may be made or purchased ready-to-use; this supports preserving the type qualifiers on recipe 057 while keeping its generic shavings owner. The OQLF GDT page for `grain de chocolat` notes that `brisure` can refer to chocolate shavings in some contexts; that does not justify adding shavings as an alias to a type-specific chocolate or chip reference, given the existing exact shavings identity and the distinct authored wording. Keep both recipe rows intact and link each to ingredient-ref-chocolate-shavings.

The five neighboring cherry ingredient lines are not glacé cherries:

| Recipe line | Exact ingredient text | Current owner |
| --- | --- | --- |
| 028 #5 | “1 tbsp maraschino cherry juice” | ingredient-ref-jus-du-pot-de-cerises-au-marasquin |
| 028 #7 | “16 maraschino cherries, drained and chopped” | ingredient-ref-cerises-au-marasquin |
| 029 #1 | “460 g pitted cherries, fresh or frozen” | ingredient-ref-cherries |
| 067 #6 | “2 tbsp maraschino cherry juice” | ingredient-ref-jus-du-pot-de-cerises-au-marasquin |
| 067 #8 | “18 maraschino cherries” | ingredient-ref-cerises-au-marasquin |

Recipe 067’s “Cherry Blossom” title is not an ingredient request for glacé cherries. Keep the legacy singular candidate ingredient-ref-cherry out of this decision; its reconciliation against active ingredient-ref-cherries is separate.

### Neighboring fruit-processing boundary

The separate Section 04 D line is not pulled into this packet. Relevant adjacent demand already has its own scope and owners: recipe 010 #10 uses 120 ml raspberry jam linked to ingredient-ref-raspberry-jam; 062 #1 uses freeze-dried strawberries linked to ingredient-ref-freeze-dried-strawberries; 112 #3–4 use freeze-dried raspberries linked to ingredient-ref-freeze-dried-raspberries; 003 #1 uses almond paste linked to ingredient-ref-almond-paste; and 056 #7 and #16 use pistachio paste linked to ingredient-ref-pistachio-paste. Recipe 051 #12 says “1/2 cup reduced strawberry puree” with no reference ID. These are not evidence for a generic candy/decorations identity. Keep the separate fruit-products checklist open and do not relink these lines here.

## Current identities, collisions, and proposed dispositions

The matching active rows have no density or unit mappings. Current source-empty, unreviewed ledger identities include ingredient-ref-marshmallows, ingredient-ref-marshmallow-creme, ingredient-ref-sprinkles, and ingredient-ref-chocolate-shavings (the latter is also `not_yet_researched` for measurement and substitution). The legacy butterscotch candidate is also source-empty and unresolved. ingredient-ref-cherries already has a verified ledger decision. No proposed new ID below is present in the active references, forms, legacy candidates, or ledger.

| Candidate | Disposition and merge-ready bilingual record | Alias and boundary decision |
| --- | --- | --- |
| Butterscotch chips | **Promote existing legacy ID ingredient-ref-butterscotch-chips.** EN butterscotch chips; fr-CA brisures de caramel écossais; CHOCOLATE_AND_CANDY. | No aliases. OQLF prefers caramel écossais for butterscotch and discourages caramel au beurre as a generic term; the full “brisures” phrase is a transparent format name, not an exact OQLF entry. Do not merge with caramel bits, toffee bits, or chocolate chips. No recipe link. |
| Caramel bits | **Hold; no active row.** The supported search phrase is EN caramel bits; fr-CA display remains unresolved. If added after a Québec product-name check, category would be CHOCOLATE_AND_CANDY. | No aliases to butterscotch chips, toffee bits, caramel sauce, or wrapped caramels. Kraft’s US product is a particular unwrapped, soft, meltable candy; it does not establish a generic formula or Québec label. No recipe link. |
| Toffee bits | **Hold a generic row.** EN toffee bits is attested as a Canadian manufacturer product name; no fr-CA canonical name is accepted. If revisited, caramel anglais is the OQLF base confection term, but “brisures de caramel anglais” is only a descriptive candidate for bits. | No aliases to SKOR/HEATH bars or candy pieces, caramel bits, or butterscotch chips. The manufacturer page supports one SKOR product but not a universal formula or French product name. No recipe link. |
| Marshmallows | **Retain ingredient-ref-marshmallows.** EN marshmallows; fr-CA guimauves; CHOCOLATE_AND_CANDY. | No aliases or forms. OQLF identifies guimauve as the usual Québec name. “White” is recipe-line wording, not a new identity. Keep the 1/2 cup diced amount as authored. |
| Marshmallow crème | **Retain ingredient-ref-marshmallow-creme separately.** EN marshmallow creme; fr-CA crème de guimauve; CHOCOLATE_AND_CANDY. | No aliases or forms. Kraft Canada labels this as a spread with a creamy texture; it is not a synonym or form of whole marshmallows. Keep the recipe’s 7 oz. |
| Nougat | **Add ingredient-ref-nougat.** EN nougat; fr-CA nougat; CHOCOLATE_AND_CANDY. | No aliases. OQLF gives the same term in both languages and defines the confection class. Keep distinct from marzipan, almond paste, praline, and candy bars. No recipe link. |
| Candied ginger | **Add ingredient-ref-candied-ginger.** EN candied ginger; fr-CA gingembre confit; BAKING_AND_SPICE. | Add only source-attested aliases EN crystallized ginger and FR gingembre cristallisé. A Québec retailer applies both French terms to the same Ginger People product; a Canadian seller describes the dry sugar-coated product and distinguishes it from wet stem ginger in syrup. Do not add preserved ginger, ginger candy, glazed ginger, or aliases to fresh/ground/pickled ginger, ginger-garlic paste, or beni shoga. No recipe link. |
| Candied citrus | **Hold one generic row; add two bounded peel identities.** Add ingredient-ref-candied-orange-peel (EN candied orange peel; fr-CA écorce d’orange confite) and ingredient-ref-candied-lemon-peel (EN candied lemon peel; fr-CA écorce de citron confite), both FRUIT. | No aliases between orange, lemon, fresh peel, zest, or generic fruit confit. OQLF terms specify peel and source fruit; “candied citrus” does not specify species, cut, or whether the whole fruit is used. No recipe links. |
| Glacé cherries | **Add ingredient-ref-glace-cherries.** EN glacé cherries; fr-CA cerises confites; FRUIT. | No aliases to cherries, maraschino cherries/juice, dried cherries, or cherry candies. OQLF’s fruit-confit definition and Canadian English/French product listings support a sugar-preserved fruit identity. The red listing is product-specific, not a red-only generic identity. No recipe link. |
| Sprinkles | **Retain ingredient-ref-sprinkles; amend its French display.** EN sprinkles; fr-CA bonbons décoratifs; CHOCOLATE_AND_CANDY. | No aliases. OQLF’s generic term includes small sugar decorations and names vermicelles, nonpareilles, and perles de sucre as types. The current vermicelles décoratifs display is narrower than the linked generic English row; do not carry it forward as a broad alias. Keep vermicelles in the recipe’s French instructions. |
| Sugar pearls | **Add ingredient-ref-sugar-pearls.** EN sugar pearls; fr-CA perles de sucre; CHOCOLATE_AND_CANDY. | No aliases to generic sprinkles, nonpareilles, or pearl sugar / sucre perlé. OQLF calls perles de sucre a type of bonbon décoratif; Wilton sells sugar pearls as a specific edible cake decoration that may be used separately or mixed with other sprinkles. Link only Fraisier 045 #17 if accepted. |
| Edible baking decorations | **Hold the generic parent; no active row.** | This is a use class, not a single ingredient. Do not alias sprinkles to edible glitter, dust, toppers, nonpareilles, vermicelles, sugar pearls, or non-edible display decorations. Require the named product and evidence that it is an edible food ingredient before a future identity decision. |
| Chocolate shavings (line-link review only) | **Retain ingredient-ref-chocolate-shavings.** EN chocolate shavings; fr-CA copeaux de chocolat; CHOCOLATE_AND_CANDY. Existing exact identity; do not create a duplicate. | No aliases, new form, or measurement/substitution mapping. Add the OQLF/Valrhona evidence to this existing source-empty ledger record and accept the existing identity. Link the two unlinked recipe rows as detailed above; preserve bittersweet and white qualifiers in recipe 057 without splitting its combined line. |

### Exact-key owners checked

Normalization mirrors normalizeIngredientSearchKey. The proposed new names/aliases and exact hold phrases were checked against all active names/aliases and form terms plus legacy names/aliases.

| Checked phrase | Current exact owner |
| --- | --- |
| butterscotch chips; brisures de caramel écossais | Legacy only: ingredient-ref-butterscotch-chips |
| caramel bits; toffee bits; brisures de caramel anglais | None |
| marshmallows; guimauves | ingredient-ref-marshmallows |
| marshmallow creme; crème de guimauve | ingredient-ref-marshmallow-creme |
| nougat; candied ginger; gingembre confit; crystallized ginger; gingembre cristallisé | None; broader ginger results belong to ingredient-ref-ginger, ingredient-ref-ground-ginger, ingredient-ref-ginger-garlic-paste, and ingredient-ref-beni-shoga |
| candied orange peel; écorce d’orange confite; candied lemon peel; écorce de citron confite | None; lemon zest belongs to ingredient-ref-lemon-zest and is not an alias |
| glacé cherries; cerises confites | None; cherry-related current rows are ingredient-ref-cherries, ingredient-ref-cerises-au-marasquin, ingredient-ref-jus-du-pot-de-cerises-au-marasquin, ingredient-ref-dried-sweet-cherries, ingredient-ref-dried-tart-cherries, and the legacy singular ingredient-ref-cherry |
| sprinkles; vermicelles décoratifs | ingredient-ref-sprinkles; proposed bonbons décoratifs has no current exact owner |
| chocolate shavings; copeaux de chocolat | ingredient-ref-chocolate-shavings; exact active owner in both languages |
| sugar pearls; perles de sucre; pearl sugar; sucre perlé; nonpareilles | None |

Exact phrase matching is distinct from short-query overlap: searching “ginger,” “cherry,” “caramel,” “sprinkle,” or “decorative” can return broader neighbors and is not a reason to merge these products. The proposed IDs ingredient-ref-nougat, ingredient-ref-candied-ginger, ingredient-ref-candied-orange-peel, ingredient-ref-candied-lemon-peel, ingredient-ref-glace-cherries, and ingredient-ref-sugar-pearls are unused.

## Measurements and substitutions

No new density, unit mapping, yield, ingredient form, or substitution is supported by this evidence.

- Preserve sugar pearls “to taste,” the optional sprinkles row with no amount, 7 oz marshmallow crème, 1/2 cup diced white marshmallows, and the chocolate-shavings garnish count/unit as authored.
- Recipe 057’s bittersweet-and-white shavings row and recipe 068’s generic shavings row have no quantity conversion to infer. Preserve the combined qualifier and the existing “for garnish” wording; no form is needed to link either to the shavings reference.
- Kraft publishes 1 tablespoon (12 g) as a serving for its US caramel bits and 2/3 cup (30 g) as a serving for its Canadian marshmallow crème. These are branded serving declarations, not generic cup-to-mass mappings. Neither justifies adding a mapping to a generic reference or converting the unrelated recipe line.
- Hershey’s Canadian SKOR recipe uses a product-specific 1 1/3 cups; the page supplies no universal mass measure. Do not convert it.
- No evidence supports swapping butterscotch chips, caramel bits, toffee bits, or nougat for one another; whole marshmallows and marshmallow crème are distinct products; sugar pearls and generic sprinkles are different catalog scopes. Add no substitution rules.

## Sources and limits

Sources were accessed 2026-10-10. OQLF is the primary Québec terminology authority. Manufacturer pages establish only the named product and its label/use. Retailer listings are product-label evidence, not universal composition standards. None of the branded serving declarations below is adopted as catalog measurement data.

| Source ID | Source and claim supported | Limit |
| --- | --- | --- |
| WP02-BAKE-INC-DEC-20261010-S01 | Office québécois de la langue française, [bonbons décoratifs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532746/bonbons-decoratifs). Preferred Québec French for sprinkles; defines small sugar decorations and identifies vermicelles, nonpareilles, and perles de sucre as types. | Does not make those specific types synonyms for every sprinkle. |
| WP02-BAKE-INC-DEC-20261010-S02 | OQLF, [caramel écossais (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298425/caramel-ecossais). Preferred French term for butterscotch; discourages caramel au beurre as a general term because industrial products may lack butter. | Does not give an exact “butterscotch chips” entry. |
| WP02-BAKE-INC-DEC-20261010-S03 | Hershey Canada, [CHIPITS Butterscotch Chips](https://www.hersheyland.ca/en_ca/products/hersheys-chipits-butterscotch-chips-270-g-bag.html). Confirms a Canadian manufacturer’s baking-chip product and use. | Product page does not establish a generic formula or French name. |
| WP02-BAKE-INC-DEC-20261010-S04 | OQLF, [caramel anglais (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351198/caramel-anglais). Preferred French term for toffee; definition describes hard caramel confection, often sold as a bar. | Supports the base confection term, not a generic baking-bits formula or exact French label. |
| WP02-BAKE-INC-DEC-20261010-S05 | Hershey Canada, [CHIPITS SKOR Toffee Bits](https://www.hersheyland.ca/en_ca/products/hersheys-chipits-skor-toffee-bits-200-g-bag.html) and [manufacturer recipe using SKOR bits](https://www.hersheyland.ca/en_ca/recipes/chipits-skor-toffee-bits-cookies-recipe.html). Confirms the Canadian branded product and baking use. | The product page does not expose a full composition or Québec French product name. |
| WP02-BAKE-INC-DEC-20261010-S06 | Kraft Heinz, [KRAFT Baking Caramel Bits](https://www.kraftheinz.com/kraft-caramels/products/00070346000026-america-s-classic-unwrapped-candy-caramel-bits-for-easy-melting). Describes its US product as unwrapped, soft caramel pieces made for melting and baking; lists a brand serving. | One US formula and serving; no generic cross-brand or Québec French naming evidence. |
| WP02-BAKE-INC-DEC-20261010-S07 | OQLF, [guimauve (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351183/guimauve). Identifies guimauve as the usual Québec name for marshmallow candy. | Does not cover marshmallow crème. |
| WP02-BAKE-INC-DEC-20261010-S08 | Kraft Heinz Canada, [Crème de guimauve](https://www.kraftheinz.com/fr-CA/kraft-jetpuffed/produits/00600699361422-creme-de-guimauve). Uses the Québec French and English product names and describes a creamy marshmallow spread; lists a branded serving and ingredients. | One product formulation/serving, not an equivalence or conversion for whole marshmallows. |
| WP02-BAKE-INC-DEC-20261010-S09 | OQLF, [nougat (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432184/nougat). Gives nougat as the French preferred term and English equivalent and defines the confection class. | No bundled-recipe or measurement evidence. |
| WP02-BAKE-INC-DEC-20261010-S10 | Avril, [Gingembre cristallisé biologique](https://avril.ca/fr/gingembre-gingembre-confit-biologique.html). Uses gingembre cristallisé as the SKU title and gingembre confit in its description for the same product. | Retailer wording, not an OQLF ruling. |
| WP02-BAKE-INC-DEC-20261010-S10B | Ameen Foods, [Crystallized Ginger](https://ameenfoods.ca/products/crystallized-ginger). Distinguishes dry sugar-coated crystallized ginger from wet stem ginger in syrup and identifies candied ginger as a product name. | Do not take the seller’s wider “also known as” list as global aliases, especially preserved ginger or ginger candy. |
| WP02-BAKE-INC-DEC-20261010-S11 | OQLF, [fruit confit (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889576/fruit-confit). Supports the sugar/syrup-confited fruit boundary. | Does not establish one generic candied-citrus identity. |
| WP02-BAKE-INC-DEC-20261010-S11B | OQLF, [écorce d’orange confite (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889577/ecorce-dorange-confite). Supports the exact orange-peel term; the entry describes use in cakes and puddings. | Does not support merging orange peel with lemon peel, fresh peel, or zest. |
| WP02-BAKE-INC-DEC-20261010-S11C | OQLF, [écorce de citron confite (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432972/ecorce-de-citron-confite). Supports the exact lemon-peel term. | Does not support merging lemon peel with orange peel, fresh peel, or zest. |
| WP02-BAKE-INC-DEC-20261010-S12 | The Source Bulk Foods, [Glacé Cherries](https://www.thesourcebulkfoods.ca/shop/cooking/glace-cherries/). Confirms a Canadian sugar-preserved cherry product. | No equivalence to maraschino cherries or generic fresh cherries. |
| WP02-BAKE-INC-DEC-20261010-S12B | Bulk Barn, [Cerises confites rouges entières et en morceaux](https://www.bulkbarn.ca/fr/Products/All/Red-Glace-Cherries-Whole-and-Broken-1751). Supports a Québec French product-label pair. | The red colour and cut are product qualifiers, not generic identity scope. |
| WP02-BAKE-INC-DEC-20261010-S13 | Wilton, [White Sugar Pearl Sprinkles](https://wilton.com/white-sugar-pearl-sprinkles-5-oz/191011625/). Calls sugar pearls an edible cake decoration and describes using them alone or mixing with other sprinkles. | A manufacturer’s product example; it does not establish a generic measure or synonym relation. |
| WP02-BAKE-INC-DEC-20261010-S14 | Valrhona, [Chocolate shavings](https://www.valrhona.com/en/l-ecole-valrhona/discover-l-ecole-valrhona/chocolate-terminology/chocolate-shavings). Documents shavings made from dark, white, or milk chocolate, including ready-to-use shavings. | Supports the type qualifier boundary only; no form, measure, or substitution is proposed. |
| WP02-BAKE-INC-DEC-20261010-S14B | OQLF, [grain de chocolat (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9898216/grain-de-chocolat). Uses `copeaux de chocolat` in its note about `brisure de chocolat`. | Does not justify merging the shavings identity with chocolate-type or chip references or adding aliases to them. |

## Evidence gaps

- No exact ingredient-line demand for butterscotch chips, caramel bits, toffee bits, nougat, candied ginger, candied orange/lemon peel, or glacé cherries.
- A Québec French product label for generic caramel bits and generic toffee bits remains unresolved. The exact formula and meaning of “toffee bits” need a product-breadth check before adding a generic row.
- Ginger wording is supported by current Canadian retailer listings, not an OQLF entry. If exact catalog governance requires an authority term rather than product labeling, hold the ginger add for a Québec terminology review.
- The “candied citrus” checklist phrase does not specify peel. This proposal’s orange/lemon peel candidates are bounded to the exact OQLF peel terms; other candied citrus cuts/species remain unresolved.
- No recipe or product evidence supports quantities, densities, unit mappings, yields, or substitutions for the new candidates.

## Merge-ready outline

1. Recompute the package and recipe snapshot at integration time; preserve stable IDs for ingredient-ref-marshmallows, ingredient-ref-marshmallow-creme, ingredient-ref-sprinkles, and ingredient-ref-chocolate-shavings.
2. Promote legacy ingredient-ref-butterscotch-chips to the active references under the same ID and record the source-backed butterscotch / caramel écossais boundary. Do not introduce any chips form.
3. Retain the two marshmallow identities, record OQLF and Kraft Canada sources, and keep whole marshmallows distinct from crème.
4. Amend only the sprinkles French display to bonbons décoratifs. Add no type aliases.
5. Add ingredient-ref-nougat, ingredient-ref-candied-ginger, ingredient-ref-candied-orange-peel, ingredient-ref-candied-lemon-peel, ingredient-ref-glace-cherries, and ingredient-ref-sugar-pearls with the bilingual names and exact aliases above. Give each an identity-only ledger decision with its own source IDs.
6. Add source S14 and an identity decision to the existing `ingredient-ref-chocolate-shavings` ledger record; add no alias, form, measure, or substitution. Link Fraisier row b8cf19ee-618b-495a-9ecb-9a90e88a9dac-ingredient-17 to ingredient-ref-sugar-pearls. Preserve “Sugar pearls, to taste,” the Decoration group, and the missing quantity. Link 057 row f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-28 and 068 row 2d53895b-8bd0-4225-bf63-766d29418eac-ingredient-11 to ingredient-ref-chocolate-shavings. Preserve each row’s original text, notes, and garnish context; create no form and do not split the mixed 057 line. Keep the existing 054, 092, and 102 links unchanged.
7. Add no forms, mappings, densities, package yields, or substitution rules. Preserve every scoped row’s authored quantity or omission, including the `1` / `for garnish` shavings row in recipe 068.
8. Keep caramel bits, generic toffee bits, generic edible decorations, the legacy singular cherry candidate, and the sibling fruit-processing checklist out of this integration. Do not mark Section 04 D or E complete.
