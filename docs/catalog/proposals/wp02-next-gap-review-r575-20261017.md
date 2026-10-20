# WP02 Section A R575: sprouted whole-grain oat flour form boundary

- **Reviewed:** 2026-10-17.
- **Status:** Integrated as one sprouted form and form-level research record. The generic oat-flour row, whole-grain parent aliases, measures, density, mappings, recipes, and active substitution rules remain unchanged. See the [R575–R576 integration README](../batches/wp02-wp03-r575-r576-gap-review-integration-20261017/README.md).
- **Scope:** Decide how to catalog the Canadian One Degree Organic Sprouted Oat Flour product, whose ingredient declaration identifies sprouted whole oats. This is one bounded oat flour process item under the open Section A4 cereal-flour parent. It does not reopen generic or whole-grain oat-flour identity, R287 measurement/substitution research, malted naked oat flour, toasted hulled oat flour, roasted oat malt flour, or the separate oat-grain identities.
- **Checklist anchor:** [WP02 Section A4, open cereal-flour parent](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658): “Resolve … oat … source-grain grades.” The whole-grain oat-flour identity and generic oat-flour measurement/substitution child items are checked; this review isolates the unmodeled sprouted whole-grain form. The broader A7 identity review also remains open at [L11191](../../RecipeBook-global-ingredient-catalog-plan.txt#L11254).
- **Proposal-local source IDs:** `WP02-A4-SPROUTED-OAT-FLOUR-R575-20261017-S01` through `S07`. They were absent from the live ledger and proposal/batch archive at review time. The already integrated R287 study source is reused under its existing ID.

## Recommendation

**Add one `sprouted` form to the existing `ingredient-ref-whole-grain-oat-flour`; do not create another flour identity or add sprouted wording to the base reference aliases.** One Degree currently markets `Organic Sprouted Oat Flour`; its product article says the flour is made from its organic sprouted oats, and the Québec-facing La Moisson listing identifies the ingredient as organic sprouted whole oats. The listing's product-image text supplies the French phrase `Farine d'avoine germée`. This supports a source-named form on the whole-grain row. It does not establish a standard sprouting, drying, or milling specification for oat flour generally, nor an OQLF-approved technical compound. [S01–S02, S04]

If root accepts this delta, add only the form row and a corresponding form-level ledger decision. Keep the parent reference's current bilingual display and aliases, `defaultDensity: null`, `unitMappings: []`, and existing research states unchanged. Record the form with no density, reusable measure, unit mapping, conversion, yield, recipe link, or active substitution. The wider A4/A7 review remains open.

## Current ownership and collision audit

The review snapshot uses the live split package: **1,805 ingredient references**, **153 forms**, **56 legacy-import candidates**, **2,174 research-ledger records**, and **114 manifest-listed recipes**.

| Surface | Current owner/state | Proposed boundary |
|---|---|---|
| `ingredient-ref-oat-flour` | `oat flour / farine d'avoine`, `FLOUR_AND_STARCH`; no aliases, forms, density, or mappings. Its ledger row is identity-verified and has completed generic measurement and substitution research. | Do not attach this whole-grain product's process to the broad generic row. Keep the generic row unchanged. |
| `ingredient-ref-whole-grain-oat-flour` | `whole grain oat flour / farine d'avoine entière`, with existing aliases `whole oat flour`, `oat flour, whole-grain`, and `farine d'avoine, grains entiers`; no forms, density, or mappings. The ledger records CNF 6275's 20 g serving only as a food-code-specific observation; measurement research is complete, while substitution research remains `not_yet_researched`. | Attach the proposed form here because this One Degree product is made from sprouted whole oats. Do not transfer the CNF serving or generic oat-flour findings to the form. |
| `ingredient-ref-sprouted-rolled-oats` and related oat-grain references | Sprouted rolled oats are an active grain identity; oat groats, rolled oats, quick oats, steel-cut oats, and oat bran are separate identities. | Do not alias flour to a sprouted grain, flake, or cooked-oat identity. |
| `ingredient-ref-roasted-oat-malt-flour` | Active `roasted oat malt flour / farine de malt d'avoine torréfiée`, the Castle Oat 80 product. | Keep it separate. The proposed source uses “sprouted,” not malted or roasted-malt wording. |
| `candidate-malted-naked-oat-flour`; `candidate-oat-flour-thermal-grade` | Ledger-only holds for the Hodmedod malted-naked-oat wording and the Moulins pregelatinized/roasted naming conflict. | Do not resolve either hold or add their terms as aliases to this form. |
| Oat flour forms | The live form catalog has no form attached to either oat-flour reference. Existing `ingredient-form-brown-rice-flour-sprouted` shows that `sprouted` is already a supported process code for a source-named flour form; it remains attached to brown rice flour. Oat-bran dry/cooked forms are unrelated. | Proposed ID `ingredient-form-whole-grain-oat-flour-sprouted` is unused. Reuse the form code only; do not transfer brown-rice measurements, process, or substitution findings. |
| Legacy-import candidates | None of the 56 candidates owns `sprouted oat flour`, `farine d'avoine germée`, `germinated oat flour`, or the proposed form ID. | No candidate promotion. |
| Substitution catalog | No global or contextual substitution rule references either oat-flour row or the proposed form wording. | No rule, recipe-line link, alternative, or replacement warning is proposed. |

The exact new source URLs and proposal-local source IDs below were absent from the ledger and archived catalog proposals/batches. The R287 study URL is an intentional reuse: it is already owned by `ingredient-ref-oat-flour` as `WP02-A4-OATF-R287-20261016-S02`. The existing OQLF entry for `farine d'avoine` is also reused under `DOAM-20261011-S06`; neither source is duplicated.

## Bilingual naming and picker projection

Keep the base display `whole grain oat flour / farine d'avoine entière`. Add no reference aliases. For the form, use the product wording **`sprouted oat flour / farine d'avoine germée`**. The English phrase is the manufacturer's product name; the French phrase appears on a Québec retailer's product image/listing. The French wording is product-list evidence, not an OQLF ruling. OQLF's existing `farine d'avoine` entry supports the base French head term but does not standardize this full process compound. [S01, S04; reused `DOAM-20261011-S06`]

Do not add `organic`, `gluten-free`, `complete`/`whole-grain`, or brand terms as aliases on the form. Whole-grain scope is carried by its parent reference; organic and gluten-free are product attributes. Do not add `germinated oat flour` as a picker term merely because R287's study describes experimental flour made from germinated oat grain. Also leave `sprouted oats`, `sprouted rolled oats`, `malted naked oat flour`, `toasted oat flour`, and `roasted oat malt flour` on their existing distinct owners or holds.

The projection below follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases match first, substring fallback second; a form hint is returned only when the query equals a complete form label or match term.

| Query | Current result | With proposed form | Effect |
|---|---|---|---|
| `sprouted oat flour` | No result | `ingredient-ref-whole-grain-oat-flour`, with its sprouted form hint | Adds one qualified picker route; no separate identity. |
| `farine d'avoine germée` | No result | `ingredient-ref-whole-grain-oat-flour`, with its sprouted form hint | Adds one French form route under the whole-grain parent. |
| `oat flour`; `farine d'avoine` | Generic and whole-grain oat flour | Same two references | Broad-family results do not change. |
| `roasted oat malt flour` | `ingredient-ref-roasted-oat-malt-flour` | Same | Malted/roasted-oat identity remains distinct. |
| `germinated oat flour` | No result | No result | Do not convert experimental-paper wording into a reusable product alias. |

This is a static projection based on the checked-in search code and live data; it is not an Android picker test.

## Bundled-recipe demand

Scanned every **114 manifest-listed recipe file** and **1,123 structured ingredient rows**, checking normalized full-recipe text, ingredient-row text, and direct reference IDs for `oat flour`, `whole grain oat flour`, `sprouted oat flour`, `farine d'avoine`, `farine d'avoine germée`, `germinated oat flour`, `sprouted whole oats`, and both existing oat-flour reference IDs. The scan found **0 recipe-file hits, 0 matching ingredient rows, and 0 direct links** to either oat-flour reference. The bundle provides no request, form use, package amount, or dish context for this form.

Outside the bundle, One Degree publishes a pie-crust recipe using **190 g** of its sprouted oat flour and a pancake recipe using **1½ cups**. These are source-specific recipe lines in separate formulas, not a paired mass/volume observation or a general cooking measure. They demonstrate product use, not bundled demand or an integration need. [S06–S07]

## Measurement, conversion, and substitution limits

- La Moisson lists a **510 g** product package. Package net mass is not a kitchen measure. One Degree's pie recipe uses 190 g in one formula; its pancake recipe uses 1½ cups in another. The sources do not equate these quantities, specify a cup-fill convention, or provide a product density. Record neither as a reusable measure or conversion. [S04, S06–S07]
- Keep `densityGPerMl: null`, the parent `defaultDensity: null`, and the parent's `unitMappings: []`. Do not add a package-yield relation, mass-to-volume mapping, or cooking yield.
- R287's Cuisine Soleil `1/4 cup (30 g)` declaration belongs to a different, unsprouted product SKU whose whole-grain status is not stated. CNF code 6275's 20 g serving belongs to its separately named whole-grain oat-flour food code, not a sprouted product label. Neither value is transferred to this form. [R287 S01; reused `WP02-S32`]
- One Degree's marketing article says oat flour can substitute for all-purpose flour, but supplies no tested form-specific exchange amount. The previously recorded R287 study tested 10% (w/w) replacement in one wheat-bread formula using laboratory oat-flour samples, including flour from germinated oat grain; it does not identify this One Degree SKU or validate a reusable home-baking rule. Keep those claims and results as source-context evidence only. Add no global or contextual substitution, amount, hydration adjustment, confidence, or warning. [S02; reused `WP02-A4-OATF-R287-20261016-S02`]
- The product page says this One Degree flour is not intended for raw consumption. Do not use the process form to imply that the flour is ready to eat or transfer this product-specific warning to all sprouted oat flours. [S01]

## Proposed integration delta

If accepted, add a single form entry:

| Field | Proposed value | Limit |
|---|---|---|
| `id` | `ingredient-form-whole-grain-oat-flour-sprouted` | New form ID; not a reference ID. |
| `ingredientRefId` | `ingredient-ref-whole-grain-oat-flour` | The specific product is made from sprouted whole oats. |
| `formCode` / `prepState` | `sprouted` / `sprouted` | Records the source-named process only. |
| `labelEn` / `labelFr` | `sprouted oat flour` / `farine d'avoine germée` | Product-specific bilingual naming; French phrase is not represented as an OQLF standard. |
| `matchTermsEn` / `matchTermsFr` | `[]` / `[]` | The two exact form labels provide the picker phrases. Do not add generic, brand, organic, gluten-free, or experimental “germinated” wording. |
| `densityGPerMl` | `null` | No supported density. |
| Form notes | State that this form is sourced from sprouted whole oats, but the public source does not publish a flour-specific standard sprouting/drying/milling specification or a reusable measure/conversion/substitution. | Do not imply universal processing or use claims. |

Add an `ingredient_form` ledger record for this ID with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`; attach S01–S06 and reuse the R287 study source under its existing ID. Keep `ingredient-ref-whole-grain-oat-flour`'s present substitution state unchanged because this review is form-scoped. Add one checked A4 child referencing R575 only if root integrates the delta. Add no reference alias, new ingredient reference, recipe link, substitution finding with an active rule, or other data.

## Source register

The new sources were accessed on **2026-10-17**. Proposal-local IDs are not ledger records yet.

| Source ID | Source and locator | Claim supported and exact limits |
|---|---|---|
| `WP02-A4-SPROUTED-OAT-FLOUR-R575-20261017-S01` | One Degree Organic Foods, [Organic Sprouted Oat Flour](https://onedegreeorganics.com/products/organic-sprouted-oat-flour/), current product page, title and use warning. | Names the manufacturer's marketed flour and says it is not intended for raw consumption. The page does not give a flour-specific sprouting/drying/milling protocol, kitchen serving, or density. |
| `WP02-A4-SPROUTED-OAT-FLOUR-R575-20261017-S02` | One Degree Organic Foods, [Sprouted Oat Flour: The Best Gluten-Free Alternative](https://onedegreeorganics.com/oat-flour-the-best-gluten-free-alternative/), “How We Make Sprouted Oat Flour” section. | Says its raw oats undergo a sprouting process and that its flour is made from organic sprouted oats and ground finely. This is manufacturer process/marketing language; it does not publish a flour-specific standard process or independently validate gluten-free, nutrition, digestion, or replacement claims. |
| `WP02-A4-SPROUTED-OAT-FLOUR-R575-20261017-S03` | One Degree Organic Foods, [How We Make Our Sprouted Oats](https://onedegreeorganics.com/how-sprouted-oats-are-made/), steps 4–8. | The manufacturer describes its proprietary oat sprouting, hull removal, and drying, but the page's mechanical-processing detail applies to rolled, steel-cut, and quick oats and does not specify the flour line. This is not a universal or flour-specific protocol. |
| `WP02-A4-SPROUTED-OAT-FLOUR-R575-20261017-S04` | La Moisson, [Sprouted oat flour](https://lamoisson.com/en/products/farine-davoine-germee), product title, image alt text, ingredients, and 510 g format. | The Québec-facing listing gives image text `Farine d'avoine germée`, lists `Gluten-free organic sprouted whole oats`, says made in Canada, and shows 510 g. The retailer page is not an OQLF ruling or a universal product standard. |
| `WP02-A4-SPROUTED-OAT-FLOUR-R575-20261017-S05` | Well.ca, [One Degree Organics Farine d'avoine germée](https://well.ca/fr/produits/one-degree-gluten-free-organic_313461.html), French product listing and ingredient statement. | Search-indexed listing reports 510 g, the exact French product title, and organic sprouted whole oats as ingredients. The page showed a notify-me state and direct retrieval was blocked; use it as wording corroboration only, not evidence of current inventory. |
| `WP02-A4-SPROUTED-OAT-FLOUR-R575-20261017-S06` | One Degree Organic Foods, [Easy Vegan Oat Flour Pie Crust](https://onedegreeorganics.com/recipe/easy-vegan-oat-flour-pie-crust-flaky-gluten-free/), ingredient line. | Uses 190 g of One Degree Sprouted Oat Flour in this pie-crust formula. It is one recipe amount, not a package serving or transferable conversion. |
| `WP02-A4-SPROUTED-OAT-FLOUR-R575-20261017-S07` | One Degree Organic Foods, [Fluffy Oat Flour Pancakes](https://onedegreeorganics.com/recipe/fluffy-oat-flour-pancakes/), ingredient line and method. | Uses 1½ cups of One Degree Sprouted Oat Flour in one pancake formula. The recipe does not supply the mass, cup convention, or a relationship to S06. |
| Reused `WP02-A4-OATF-R287-20261016-S02` | He et al., [“Effect on bread properties of partial substitution of wheat flour with oat flour and flour from oat grain germinated in the light or dark”](https://academic.oup.com/ijfst/article/58/4/1979/7807321), *International Journal of Food Science and Technology* 58(4), 2023, 1979–1986. | Already owned by the generic oat-flour ledger record. Reuse only the 10% (w/w), single bread-formula observation and its limits; do not duplicate the source URL or identify the experimental flour with One Degree's product. |
| Reused `DOAM-20261011-S06` | OQLF, [farine d'avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497598/farine-davoine). | Supports the Québec base term `farine d'avoine`; it does not establish a standardized sprouted-flour compound, conversion, or substitution ratio. |

## Verification record

The proposal is documentation-only. No app tests, build, emulator, deployment, or software tests were run. The integrated form and ledger record are covered by the static checks listed in the [integration README](../batches/wp02-wp03-r575-r576-gap-review-integration-20261017/README.md). No app tests, build, emulator run, or deployment were run for this database-JSON-only addition under `AGENTS.md`.
