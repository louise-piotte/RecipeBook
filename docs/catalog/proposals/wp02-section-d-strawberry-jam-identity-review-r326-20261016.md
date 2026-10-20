# WP02 Section D — strawberry jam identity review (R326, 2026-10-16)

- **Status:** proposal only; no shared catalog or checklist files changed.
- **Target anchor:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section D, open fruit-product coverage.
- **Scope:** review the existing legacy candidate `ingredient-ref-strawberry-jam` as one distinct baking fruit product. This does not reopen raspberry jam, strawberry purée, jelly, generic fruit spread, or the broader Section D sweep.
- **Proposal source IDs:** `WP02-D-STRAWBERRY-JAM-R326-20261016-S01` through `S10`; source ID `S10` was added during independent integration review to document the OQLF fruit-spread boundary. Reuse existing source IDs where noted below.

## Recommendation

Promote the existing legacy candidate as a separate, identity-only reference:

| Field | Proposed value |
|---|---|
| Stable ID | `ingredient-ref-strawberry-jam` |
| English display | `strawberry jam` |
| Québec French display | `confiture de fraises` |
| English aliases | none |
| French aliases | `confiture de fraise` |
| Category | `SAUCE_AND_CONDIMENT`, matching active `ingredient-ref-raspberry-jam` |
| Default density | `null` |
| Unit mappings | `[]` |

Keep the legacy singular French phrase as an alias because a Montréal pâtisserie uses `confiture de fraise` on its current product page. Use the plural in the display name because the OQLF says the fruit complement is generally plural and gives `confiture de fraises` as an example. The existing legacy category matches the active raspberry-jam row and should be retained.

Do not alias this identity to fresh strawberries, strawberry purée, raspberry jam, jelly, or reduced-sugar fruit spread. Do not add forms, recipe links, a reusable measure, density, package yield, conversion, or an active global substitution rule. The current bundled recipe list has no strawberry-jam ingredient line. A primary recipe source does explicitly offer strawberry jam as an alternative for one Linzer-cookie filling; record that evidence as confined to that formula and do not change the bundled line or make a cross-recipe rule.

## Current catalog and corpus audit

The live shared-worktree snapshot contains 1,677 active references, 127 forms, 2,024 research-ledger records, and 114 bundled recipes / 1,123 ingredient rows.

- Active `ingredient-ref-raspberry-jam` is `raspberry jam / confiture de framboises`, with no aliases or numeric data, in `SAUCE_AND_CONDIMENT`.
- Active `ingredient-ref-strawberries` and `ingredient-ref-strawberry-puree` represent separate products and are not jam aliases.
- `ingredient-ref-strawberry-jam` is absent from active references, present once in `docs/catalog/legacy-import-identities.v1.json` as `strawberry jam / confiture de fraise`, with no aliases and `reviewState: unreviewed`. Its research-ledger record is an unreviewed `candidate` with no sources.
- Exact normalized queries `strawberry jam`, `confiture de fraises`, and `confiture de fraise` have no active reference or form owner. Only the legacy candidate owns the two currently recorded phrases. `strawberry preserves`, `fruit spread`, `tartinade de fraises`, `strawberry jelly`, and `gelée de fraises` have no exact active owner and remain outside this identity.

The manifest recipe scan found no bundled ingredient line containing `strawberry jam`, `confiture de fraises`, `confiture de fraise`, or the legacy ID. Recipe 010, Linzer Cookies, currently contains only `120 ml raspberry jam`, linked to `ingredient-ref-raspberry-jam`; preserve that bundled line, text, quantity, and link.

The underlying [Preppy Kitchen Linzer Cookies recipe](https://preppykitchen.com/linzer-cookies/) is additional source-specific evidence: its ingredient card says `1/2 cup raspberry jam or strawberry jam, strained (120 mL)`. The author’s guidance says seedless jam needs 6 tablespoons, while seeded jam is strained and has its seeds discarded. This supports a named alternate in that particular Linzer filling and an adjusted amount for seedless jam. The imported bundle retained only raspberry jam, so this review does not add strawberry jam to its ingredient line or substitute another recipe line.

The earlier [R326-independent Section D fruit sweep](wp02-section-d-confectionery-fruit-gap-sweep-20261012.md) and [R320 strawberry-purée review](wp02-section-d-fruit-product-boundary-review-20261010.md) do not review this candidate. They identify strawberry jam as a legacy-only identity and leave its ledger record unreviewed. This packet closes only that candidate’s identity and source-evidence review; the parent fruit-product checklist remains open.

## Identity and alias boundaries

The OQLF GDT defines `confiture` as a spread made from whole or cut fruit cooked with sugar and gives English `jam`. Its grammatical note says the fruit complement is generally plural, with `confiture de fraises` as an example. A current Montréal product page uses the singular phrase `Confiture de fraise`, so retain that exact attested spelling only as a French alias while using the plural as the main display. Smucker’s French food-service catalog also uses the plural `Confiture de fraises` for a strawberry jam product. [Reuse `WP05-KAYA-QC-20261011-S04`; S03–S04]

Keep broader and related names out of the alias lists:

- **`preserves` / `conserves`:** the OQLF notes that English `preserves` is more generic and can cover fruit preparations cooked in sugar. It is not a precise synonym for this reference.
- **`fruit spread` / `tartinade de fruits`:** OQLF defines fruit spread as a preparation similar to jam but lower in sugar; it is a different product class. Do not collapse it into jam.
- **`jelly` / `gelée`:** CFIA lists jam and jelly under separate standards. The common fruit does not make them aliases.
- **`strawberries` / `fraises`:** preserve the fresh fruit as a separate identity.
- **`strawberry purée` / `purée de fraises`:** preserve the separate fruit-purée reference and its cooked-reduced recipe-specific preparation.

The legacy candidate’s `confiture de fraise` spelling is therefore preserved as a specific, source-attested French alias, while the preferred display becomes `confiture de fraises`.

## Measurements, density, and package evidence

Keep `defaultDensity: null` and `unitMappings: []`. The author’s `1/2 cup = 120 mL` is the recipe’s volume amount; there is no corresponding mass. It does not establish mass per volume.

The reviewed sources do not supply a current, strawberry-jam-specific mass/volume portion:

- A Québec Directory product sheet for Pied-Mont Dora strawberry jam with pectin gives a 500 mL package and a 15 mL serving, but no serving mass. The record says the product data comes from GS1 and disclaims MAPAQ responsibility for its accuracy. [S06]
- A Smucker’s food-service page lists 200-count portion packs of 10 mL and 16 mL, without mass. These are product-specific volume packs, not a generic measure. [S04]
- Health Canada’s online 2015 CNF gives the separate `Jam type spread, Double Fruit` entry as 15 mL = 18.7 g. That is a named, reduced-sugar spread and is not strawberry jam. [S08]
- Health Canada’s 2008 `Nutrient Value of Some Common Foods` gives the broad `Jams and preserves` entry as 15 mL = 20 g. This historical, non-fruit-specific row is not a strawberry-jam density or a transferable current conversion. [S09]
- Health Canada now identifies CNF 2026 as the current downloadable relational dataset and says the online CNF 2015 is retained as an interim access method. The 2026 download page returned 403 in this review, and I could not verify a strawberry-jam row or its portion measures. Keep the measurement state `blocked_pending_evidence`; do not treat CNF 2015 or the 2008 booklet as current candidate-specific evidence. [Reuse `WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S04`]

Do not average or transfer those unlike rows. Do not infer jam mass from the 240 mL Première Moisson retail package, the 500 mL Dora package, the 10/16 mL Smucker portion packs, or the 36-cookie recipe yield. They remain product or recipe observations only.

## Substitution finding and scope

The Preppy Kitchen source explicitly allows raspberry **or strawberry** jam in its Linzer-cookie filling at the same 1/2 cup (120 mL) amount, strained. It also says seedless jam uses 6 tablespoons. This supports one formula-specific alternate between named jam flavors. If integrated, record one supported contextual finding with the exact context `Linzer-cookie sandwich filling, recipe 010 source formula, jam strained to remove seeds`; keep the seedless amount adjustment attached to the source. The finding does not support a universal strawberry-to-raspberry substitution, replacement of fresh fruit or purée, or use in arbitrary fillings. [S07]

Keep the recipe line unchanged and do not create an identity-wide rule. If a runtime rule is later represented, it must be scoped to that recipe line and preparation, and it must preserve the different seedless amount. No substitution evidence was found for jam ↔ jelly, jam ↔ fruit spread, or jam ↔ purée.

## Source register

Pages were checked on 2026-10-16. Existing source IDs are explicitly marked for reuse; the other IDs in this table are proposal-local and were checked for collision.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP02-D-STRAWBERRY-JAM-R326-20261016-S01` | CFIA, [Labelling requirements for processed fruit or vegetable products](https://inspection.canada.ca/en/food-labels/labelling/industry/processed-fruit-vegetable-products), “Common name” example. | CFIA says “Strawberry Jam” is the common name under the generic standard for jam. Establishes the English common name and product-class context, not a Québec translation or a mass measure. |
| **Reuse `WP05-KAYA-QC-20261011-S04`** | OQLF, [confiture (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059918/confiture), definition, English term, grammatical note. | Supports French `confiture`, English `jam`, and the usual plural fruit complement `confiture de fraises`. The existing ledger source entry is generic and does not identify a strawberry product. |
| `WP02-D-STRAWBERRY-JAM-R326-20261016-S02` | CFIA, [Normes d’identité canadiennes : Volume 4 – Produits de fruits ou de légumes transformés](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), §§74–78. | Defines `confiture de (nom du fruit)` separately from `gelée de (nom du fruit)`; jam with pectin is also identified. The URL is already referenced elsewhere in the ledger, but this new source ID has a distinct jam/jelly locator. No product measurement follows. |
| `WP02-D-STRAWBERRY-JAM-R326-20261016-S03` | Pâtisserie Madeleine, Montréal, [Confiture de fraise](https://patisseriemadeleine.ca/products/confiture-de-fraise-250ml), product title, ingredients, 250 mL format. | A current Montréal pâtisserie labels one strawberry product with the singular French phrase and says it is made from Québec strawberries and sugar. Supports retaining the exact singular phrase as a search alias only; it does not override the OQLF’s generally plural display convention or define all strawberry jams. |
| `WP02-D-STRAWBERRY-JAM-R326-20261016-S04` | Smucker Away From Home Canada, [Confiture de fraises pure Smucker’s](https://www.smuckerawayfromhome.ca/fr-ca/products/confiture-de-fraises-pure-smuckers/), product title, ingredients, and portion-pack formats. | Manufacturer product page uses the plural French name and lists strawberries, glucose-fructose, sugar, citric acid, and pectin. It offers 200 × 10 mL and 200 × 16 mL packs. The recipe and pack sizes are product-specific; no mass/volume conversion is supplied. |
| `WP02-D-STRAWBERRY-JAM-R326-20261016-S05` | Aliments du Québec, Première Moisson, [Confiture de fraises](https://alimentsduquebec.com/aliments-dici/confiseries-et-produits-sucres/confiture-de-fraises-5), product title and 240 mL format. | Current Québec food listing confirms the plural display in local commerce. The page is a product listing, not a composition standard or measure source. |
| `WP02-D-STRAWBERRY-JAM-R326-20261016-S06` | Gouvernement du Québec, Répertoire des aliments québécois, [Strawberry jam with pectin Dora](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201531), name, package, and serving fields. | Lists one 500 mL strawberry jam-with-pectin SKU and a 15 mL serving; it gives no gram weight and identifies its product data as GS1-sourced, with a MAPAQ accuracy disclaimer. Product-specific only. |
| `WP02-D-STRAWBERRY-JAM-R326-20261016-S07` | John Kanell / Preppy Kitchen, [Linzer Cookies](https://preppykitchen.com/linzer-cookies/), ingredient card and seedless-jam guidance. | Lists 1/2 cup (120 mL) raspberry or strawberry jam, strained; separately says seedless jam uses 6 tablespoons. Direct formula-specific alternate only. It does not establish a general substitution rule or mass. |
| `WP02-D-STRAWBERRY-JAM-R326-20261016-S08` | Health Canada, [Jam type spread, Double Fruit (CNF 2015 online, food code 6281)](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=6281), serving-size table. | Reports 5 mL = 6.2 g and 15 mL = 18.7 g for this named jam-type spread. It is not strawberry jam and cannot supply the candidate’s conversion. |
| **Reuse `WP03-SECTION-U-THYME-MEASURE-SUBSTITUTION-R322-20261016-S04`** | Health Canada, [Canadian Nutrient File overview](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), CNF 2026 download and 2015 online note. | Confirms CNF 2026 is the current downloadable dataset and CNF 2015 online is an interim access method. No candidate-specific record or measure is claimed from this page. |
| `WP02-D-STRAWBERRY-JAM-R326-20261016-S09` | Health Canada, [Nutrient Value of Some Common Foods (2008)](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/nutrient-value-some-common-foods-2008.html), Sweets and Sugars, preserves section. | The generic `Jams and preserves` row gives 15 mL = 20 g. Historical and not raspberry- or strawberry-specific. The same URL is already in the ledger for an unrelated cooked-quinoa locator; this new source ID is specific to the jam row. |
| `WP02-D-STRAWBERRY-JAM-R326-20261016-S10` | OQLF, [tartinade de fruits (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26520715/tartinade-de-fruits), definition and Canadian/Québec terminology notes. | Defines fruit spread / tartinade de fruits as similar to jam but lower in sugar, and distinguishes it from confiture under Canadian regulation. Supports keeping fruit spread outside the strawberry-jam identity. |

## Evidence gaps and integration boundary

- The exact current CNF 2026 strawberry-jam row and serving measures remain unchecked because the dataset page is inaccessible in this review. Leave measurement `blocked_pending_evidence` until the row can be verified.
- No other current product mass paired with a volume was found. Keep active density, unit mappings, conversions, and recipe mass equivalents empty.
- The source supports one formula-specific strawberry-jam alternate in Linzer cookies. Keep that scope explicit and do not generalize it to other baked goods or preserve types.
- No bundled line currently needs a strawberry-jam link. Promote the existing legacy ID only if accepted; preserve the recipe package unchanged.
- No software tests, builds, emulator checks, or shared database edits were performed. This is a proposal-only documentation change; database JSON-only additions require no software tests under `AGENTS.md`.
