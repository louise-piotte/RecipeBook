# WP02 A4 whole barley flour grade-boundary review

**Reviewed:** 2026-10-11
**Status:** Integrated on 2026-10-11 as an identity-only reference. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the canonical row and verification.

## Recommendation

**Accept one identity-only source-grain grade:** `whole barley flour / farine d'orge entière`, category `FLOUR_AND_STARCH`. This is a narrowly scoped follow-up to the A4 checklist item for remaining barley flour grades. La Milanaise currently names and sells a bilingual organic whole-barley flour product, and Health Canada defines whole grains as retaining bran, endosperm, and germ. OQLF provides the Québec French base term `farine d'orge`. [S01–S04]

Integrated ID: `ingredient-ref-whole-barley-flour`. Use no aliases; keep `defaultDensity` null and `unitMappings` empty. Add no forms, conversions, yields, recipe links, or substitutions.

The proposed row is for flour explicitly identified as whole barley flour. It does not reclassify the unqualified `barley flour` family or assert that every barley-flour product retains the whole kernel.

## Evidence and boundary

La Milanaise’s current product pages give the English display `Organic Whole Barley Flour` and the French product title `Farine d’orge entière biologique`. Both pages also show the product-specific statement `Equivalent: T150`. The product pages support the named whole-barley grade and bilingual wording; they do not define a universal barley milling specification or what the T150 comparison means for barley. [S01–S02]

Health Canada lists barley among cereal grains and describes whole grains as containing all three kernel parts: bran, endosperm, and germ. This gives the general meaning of the grade term, but does not independently verify the composition of this specific SKU. OQLF pairs `farine d'orge` with `barley flour`; the more specific `farine d'orge entière` is attested directly by the Québec mill’s product name, not as a separate OQLF headword. [S03–S04]

| Neighbor or qualifier | Decision boundary |
|---|---|
| `barley flour / farine d'orge` | Keep the active unqualified family identity. Do not add the whole-grain grade as an alias on this row. |
| `malted barley flour / farine d'orge maltée` | Keep separate; malting is a distinct cereal treatment and already has its own active identity. |
| `roasted barley flour / farine d'orge torréfiée` | Keep separate; roasting is a distinct product process and already has its own active identity. |
| Barley meal / `whole grain barley meal` | Keep separate. The A7 held-candidate review listed “coarse/whole barley flour” among barley-meal search phrases but did not establish a flour-grade identity or endorse a meal alias. Flour and meal remain separate. [S05] |
| `T150` / `French type 150 flour` | Do not add as an alias or grade crosswalk. La Milanaise’s wording is a product-specific “equivalent” statement, while the active `T150` identity is French soft-wheat flour. The sources do not establish a barley type-150 class. |
| `organic` / `biologique` | Do not store as aliases. These are certification/product qualifiers in the source SKU, not synonyms for the whole-barley grade. |

Do not add `whole-grain barley flour`, `whole barley meal`, `barley meal`, `barley flour T150`, `T150 barley flour`, `farine d'orge T150`, or a brand/product name as aliases. The exact bilingual displays are supported; these other terms either change the grain product or extend one product label beyond its evidence.

## Numeric, form, and recipe disposition

- **Numeric data:** The mill page lists protein `10% ± 2`, `Equivalent: T150`, and a 1 kg retail format. Do not import these product-level statements as catalog measurements, universal composition, milling equivalence, density, or yield. A package mass is not a volume mapping.
- **Forms and conversions:** Add no `IngredientForm`, form-specific density, unit mapping, or conversion. The whole-kernel grade is an ingredient identity distinction, not a cooking preparation state.
- **Substitution:** Add no global or contextual rule. The source pages recommend combining this product with wheat flour for best results but give no ratio or validated replacement direction.
- **Recipes:** The current 114-file manifest corpus contains 1,123 ingredient rows. Searching every row’s `originalText`, `ingredientName`, and `ingredientRefId` for barley/orge and the target phrases found **zero barley-family ingredient lines**. No recipe link, relink, or recipe-specific measure is supported.

## Live package and collision audit

Snapshot read on 2026-10-11. File hashes cover exact bytes. The recipe-corpus digest hashes each manifest-ordered relative path, a NUL byte, exact recipe bytes, and a NUL byte.

| Artifact | Current state | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 901 references | `37af57605a9998d37cd5533e93fdd27bb81308566e8ab0c320c725925265a8d2` |
| `ingredient-forms.v1.json` | 48 forms | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `docs/catalog/research-ledger.v1.json` | 1,153 records | `647c65deef7a9f03ae7a46e44b097666ae2477b243c760e2ad4c243a26f2199e` |
| `docs/catalog/legacy-import-identities.v1.json` | 77 candidates | `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `6b0df96f2f4c672f88ec6670857c493f7f1cbb1c441432d1c9365e14a6145c14` |

| Surface | Finding |
|---|---|
| Active references | No exact normalized `whole barley flour`, `farine d'orge entière`, or proposed ID exists. Active neighboring barley rows are `ingredient-ref-barley-flour`, `ingredient-ref-malted-barley-flour`, and `ingredient-ref-roasted-barley-flour`. The active `ingredient-ref-french-type-150-flour` owns the exact English alias `T150` and French alias `farine T150`; do not reuse either for barley. |
| Forms | No barley flour form, whole-barley label, or related match term is present in the 48-form file. |
| Research ledger | No `ingredient-ref-whole-barley-flour` identity record or separate whole-barley-grade decision exists. The verified general barley-flour record cites La Milanaise’s bilingual product pages but explicitly says whole-grain, organic, and milling-class details were not imported into that generic identity. This proposal reviews that excluded A4 grade separately; it does not duplicate or rewrite the existing ledger record. |
| Legacy candidates | No whole-barley-flour candidate or matching alias exists among the 77 legacy rows. |
| Prior proposals | No dedicated whole-barley-flour proposal was found. The A7 held review’s “coarse/whole barley flour” phrase is part of a barley-meal candidate query, not a whole-flour grade decision. The A4 general-barley batch similarly leaves the product-specific grade outside its active row. [S05–S06] |
| Proposed keys | `ingredient-ref-whole-barley-flour`, source prefix `WP02-A4-WBF-20261011-S`, and this filename were checked and unused before drafting. Recheck against the then-current package before any integration. |

## Evidence limits

The bilingual manufacturer pages establish a current named Québec product and its displays, but the product page does not specify kernel fractions or a milling process. Health Canada supplies the general whole-grain definition, not a certification assessment of this flour. The mill’s `T150` “equivalent” statement remains product-scoped and unexplained; it is not enough to create a barley grade crosswalk, alias, or equivalence to the active French type-150 wheat-flour row. No general measurement, baking ratio, or recipe demand was found.

The evidence therefore supports the narrowly named, identity-only whole-barley-flour row, with no product-class expansion beyond sources that identify the flour as whole barley flour.

## Source register

Online sources were checked on 2026-10-11; S05–S06 are local audit references. IDs are local to this proposal, and no ledger entries are requested.

| ID | Source | Direct support and limits |
|---|---|---|
| **WP02-A4-WBF-20261011-S01** | La Milanaise, [Organic Whole Barley Flour](https://lamilanaise.com/en/produits/organic-whole-barley-flour/), current manufacturer page. | Names the product `Organic Whole Barley Flour`, places it under organic specialty flour, and says `Equivalent: T150`. Also lists protein and formats, which remain product-specific and are not copied into catalog numeric fields. |
| **WP02-A4-WBF-20261011-S02** | La Milanaise, [Farine d’orge entière biologique](https://lamilanaise.com/produits/farine-orge-entiere-biologique/), current manufacturer page. | Gives the exact Québec French product name and repeats `Équivalent: T150`. It supports this product display, not an OQLF ruling or standardized barley type-150 grade. |
| **WP02-A4-WBF-20261011-S03** | Health Canada, [Whole Grains—Get the Facts](https://www.canada.ca/en/health-canada/services/canada-food-guide/resources/healthy-eating-recommendations/eat-a-variety/whole-grain/get-facts.html), page dated 2019 and checked 2026-10-11. | Includes barley among cereal grains and defines whole grains as containing bran, endosperm, and germ. General definition only; it does not validate the La Milanaise SKU’s composition. |
| **WP02-A4-WBF-20261011-S04** | OQLF, [farine d’orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge), last updated 1982. | Pairs Québec French `farine d'orge` with English `barley flour`. It does not have a whole-barley-flour headword; no old technical or baking-performance notes are imported. |
| **WP02-A4-WBF-20261011-S05** | [A7 held-candidate review](wp02-a7-held-candidate-recheck-20261010.md), barley-meal section. | Prior review treated `coarse/whole barley flour` only as an adjacent phrase in a held barley-meal query family. It does not accept a flour identity, French display, or synonymy with meal. |
| **WP02-A4-WBF-20261011-S06** | [A4 batch note](../batches/baking-flours-starches.md), barley-flour identity section; source IDs `WP02A4-BF-S01–S04`. | Existing A4 integration accepted generic `barley flour / farine d'orge`, while explicitly keeping product-specific whole-grain and milling-class details out of that row. This follow-up resolves only the named whole-barley grade. |
