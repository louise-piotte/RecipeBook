# WP02 Section A7 — Malted Spelt Flour Name and Boundary Review (R24)

- **Reviewed:** 2026-10-13
- **Status:** Proposal only. Recommend an identity-only cereal-specific flour row, subject to independent Québec French review before integration. No catalog, ledger, plan, roadmap, recipe, generated, or code file was changed.
- **Scope:** The dry bakery ingredient named *malted spelt flour* or *spelt malt flour*. This review does not reopen the held *spelt meal* candidate, generic wheat meal (R22), or buckwheat meal (R23). It does not treat plain spelt flour, generic malt flour, malt extract, toasted spelt flour, or composite flour mixes as the same ingredient.
- **Proposal-local source IDs:** `WP02-A7-SPELT-MALT-FLOUR-20261013-R24-S01` through `S06`. These IDs belong to this proposal and are not research-ledger records.

## Recommendation

| Field | R24 proposal |
|---|---|
| Disposition | **Recommend one identity-only `FLOUR_AND_STARCH` reference, conditional on independent Québec French review.** A current Canadian malt supplier provides a bilingual product description, but its French label is not an OQLF ruling or a Québec-market product label. |
| ID | `ingredient-ref-malted-spelt-flour` (unused in the current package). |
| English display | `malted spelt flour` |
| English alias | `spelt malt flour`, as used in the Canadian IREKS product description. |
| Proposed fr-CA display | `farine d'épeautre malté`, from IREKS North America's French Canada product listing. Retain the source's masculine `malté`, which modifies `épeautre`; do not change it to `maltée` or to the existing generic term `farine maltée`. |
| French aliases | None. In particular, do not add `farine maltée` or invent `farine de malt d'épeautre`. |
| Identity scope | Flour made from malted spelt for bakery use. The reviewed products include both a slightly roasted aromatic product and an enzyme-active grade; those source-specific properties do not define the general identity. |
| Category and behavior | `FLOUR_AND_STARCH`; no forms, measures, density, unit mappings, conversions, yields, recipe links, or substitutions. |

The exact compound French display remains provisional until a Québec reviewer confirms the wording. OQLF establishes `épeautre` as the Québec French term for *spelt*, while the compound product wording found here is Canadian French from an Ontario supplier. The proposal records that wording as a review candidate and does not claim OQLF approval.

## Why this is a new A7 gap

The open A7 checklist continues work on other malted or toasted flour identities at [the active plan's grain-meal and malted/toasted review item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1435). The prior [A7 residual grain-meal follow-up](wp02-a7-residual-grain-meals-followup-20261011.md) reviewed *spelt meal* among several meal/farina names, but did not review a cereal-specific malted spelt flour. The current catalog has general spelt flour, generic malt flour, and separate malted barley, wheat, and rye flour identities, but no spelt malt-flour row.

The [2026-10-10 held-candidate recheck](wp02-a7-held-candidate-recheck-20261010.md) mentions spelt as one cereal from which generic malt flour can be made, based on a technical compendium. That review accepted only the generic `malt flour / farine maltée` row and its `malted cereal flour` alias; it did not review a current Canadian spelt-specific product label, a bilingual spelt-malt name, or the picker boundary for a separate cereal-specific row. R24 uses a newer product-level bilingual source and does not reopen that generic decision.

This is a distinct flour-name review. It does not reconsider the R22 unqualified wheat-meal hold or the R23 buckwheat-meal hold documented in the [R22 batch README](../batches/wp02-wp03-wp04-round22-gap-review-integration-20261013/README.md) and [R23 batch README](../batches/wp02-wp03-wp04-round23-gap-review-integration-20261013/README.md).

## Product and French naming evidence

IREKS North America's English product page calls `IREKS AROMA SPELT MALT K` a “slightly roasted spelt malt flour.” Its French Canada product listing describes the same item as `farine d'épeautre malté légèrement grillée`. The Canadian company page identifies IREKS North America in Brampton, Ontario. This is a current Canadian bilingual product-name bridge for a bakery flour. It is not a Québec manufacturer listing, and the product page does not say whether the malt itself or the flour is roasted, or disclose the product's enzyme activity [S01–S02].

EDME's 2025 diastatic-malt booklet separately lists `malted spelt flour` as an enzyme-active flour and gives a product-specific diastatic-power range. This corroborates that *malted spelt flour* is an industry ingredient name, but does not make EDME's grade equivalent to IREKS's slightly roasted product or establish one universal malt activity [S03]. Deer Creek Malthouse also names `Malted Spelt Flour` as an ingredient in a consumer pizza mix; the listing supports ingredient wording and bakery use, not a stand-alone specification or a flour measure [S04].

For Québec terminology, OQLF pairs the preferred French term `épeautre` with English `spelt` [S05]. OQLF's separate entry for `farine maltée` defines flour with malt extract or ground malt added to it. That entry does not define this exact spelt product, so do not make `farine maltée` a French alias or treat it as a direct substitute for `farine d'épeautre malté` [S06]. No Québec product label or OQLF entry for the full phrase was found in this review. The French display should therefore be checked independently before the proposed row is integrated.

## Current catalog, ledger, forms, and picker audit

The current split seed package contains **1,350 ingredient references** and **98 forms**; the research ledger contains **1,668 records**. The manifest lists **114 recipes**. These counts match the recent R23 batch snapshot.

| Surface | Current state |
|---|---|
| Exact reference ownership | No active reference owns `malted spelt flour`, `spelt malt flour`, or `farine d'épeautre malté`. The proposed ID `ingredient-ref-malted-spelt-flour` is unused. |
| Ingredient forms | No current form label or match term owns the candidate names. The spelt-flour, generic malt-flour, and cereal-specific malt-flour rows have no related forms. |
| Legacy-import identities | No exact candidate name or proposed ID is present. |
| Research ledger | No malted-spelt-flour record or exact proposed display decision exists. Existing generic malt-flour and spelt-flour records concern their own identities. |
| Nearby active references | `ingredient-ref-spelt-flour` is `spelt flour / farine d'épeautre`; `ingredient-ref-malt-flour` is `malt flour / farine maltée` with English alias `malted cereal flour`; separate rows cover malted barley, wheat, and rye flour, plus roasted wheat malt flour. |

Picker projections use the current `IngredientReferenceSearchIndex` behavior: complete normalized word phrases match first, followed by substring fallback if no phrase matches. The table shows the current result and the projected result if this proposal is integrated with its proposed English alias.

| Query | Current result | Projected result | Boundary |
|---|---|---|---|
| `malted spelt flour` | None | `ingredient-ref-malted-spelt-flour` | Exact proposed English display. |
| `spelt malt flour` | None | `ingredient-ref-malted-spelt-flour` | Exact source-attested English alias. |
| `farine d'épeautre malté` | None | `ingredient-ref-malted-spelt-flour` | Exact proposed French display; accent-folded input behaves the same. |
| `spelt flour` | `ingredient-ref-spelt-flour` | `ingredient-ref-spelt-flour`; `ingredient-ref-malted-spelt-flour` | A broad base-flour query should show both plain and malted spelt products. |
| `farine d'épeautre` | `ingredient-ref-spelt-flour` | `ingredient-ref-spelt-flour`; `ingredient-ref-malted-spelt-flour` | Same broad French name overlap. |
| `malt flour` | `ingredient-ref-malt-flour`; `ingredient-ref-roasted-wheat-malt-flour` | Those two rows plus `ingredient-ref-malted-spelt-flour` | The new English alias contains the phrase `malt flour`; keep the broad query multi-result rather than routing it to one cereal. |
| `farine maltée` | `ingredient-ref-malt-flour` | `ingredient-ref-malt-flour` | Do not add the generic French name to the spelt row. |
| `malted cereal flour` | `ingredient-ref-malt-flour` | `ingredient-ref-malt-flour` | Retain the generic row's existing alias. |
| `malted barley flour`; `malted wheat flour`; `malted rye flour` | Their respective cereal-specific rows | Unchanged | Keep each cereal identity distinct. |

These are static projections from the current names and aliases, not live emulator QA. No picker code change is proposed.

## Bundled-recipe demand

I scanned every manifest-listed recipe file and all **1,123 ingredient rows**, including the serialized recipe content. The scan found **zero occurrences** of `spelt`, `épeautre`, `malted spelt flour`, `spelt malt flour`, `farine d'épeautre malté`, or related malt-flour wording. There is no bundled-recipe demand for a row, alias, or recipe link. This corpus result does not mean the ingredient is unused outside the current bundled library.

## Numeric, form, and substitution limits

- IREKS lists a **25 kg bag** and a **1–5% dosage based on flour** for its commercial product. These are product/package and bakery dosage details, not a household measure, transferable ratio, density, unit mapping, yield, or default recipe amount [S01–S02].
- EDME's diastatic-power range belongs to its enzyme-active product. IREKS's roast descriptor is also product-specific. Do not create diastatic/non-diastatic or roast-state forms, and do not transfer EDME's range to the IREKS product or to this identity [S03].
- The sources do not give a transferable mass-volume conversion, cooking yield, or density. Leave `defaultDensity` null and `unitMappings` empty; add no package-yield row or measurement observation.
- Bakery-performance statements and inclusion guidance do not identify a source ingredient to replace or establish a contextual substitution ratio. Add no substitution finding, rule, or recipe-line link.

## Exact disposition

1. Recommend the identity-only row `ingredient-ref-malted-spelt-flour`, displayed as `malted spelt flour / farine d'épeautre malté`, with `spelt malt flour` as its only English alias and no French aliases, **after independent Québec French review**.
2. Keep it separate from plain spelt flour, generic malt flour, malted barley/wheat/rye flour, roasted wheat malt flour, malt extract, and composite mixes. Do not broaden it to a general roasted-spelt-flour identity.
3. Add no forms, measurements, density, unit mappings, conversions, package yields, recipe links, or substitutions.
4. Keep the existing *spelt meal* disposition from the prior A7 residual review unchanged.

No tests or emulator checks were run because this is a proposal-only document review; no application or database data changed.

## Proposal-local source register

Sources were checked on 2026-10-13. These IDs are local to this proposal and are not entered in the shared research ledger.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP02-A7-SPELT-MALT-FLOUR-20261013-R24-S01` | IREKS North America, [IREKS AROMA SPELT MALT K — English product page](https://www.ireksnorthamerica.com/products/product-search/detail/ireks-aroma-spelt-malt-k). | Names a slightly roasted spelt malt flour; lists a 25 kg bag and 1–5% commercial dosage based on flour. This is one bakery product, not a universal composition or household measure. |
| `WP02-A7-SPELT-MALT-FLOUR-20261013-R24-S02` | IREKS North America, [French Canada product listing](https://www.ireksnorthamerica.com/fr/produits/recherche-de-produits?cHash=b216dd7f734a6dff5e98ca234832a40d&tx_ireksproduct_product%5Baction%5D=detail&tx_ireksproduct_product%5Bcontroller%5D=Product&tx_ireksproduct_product%5Bproduct%5D=100378). | Lists the matching `IREKS AROMA SPELT MALT K` with `farine d'épeautre malté légèrement grillée`, 25 kg bag, and 1–5% dosage. IREKS North America is based in Brampton, Ontario; this is Canadian French wording, not a Québec product label or an OQLF ruling. |
| `WP02-A7-SPELT-MALT-FLOUR-20261013-R24-S03` | EDME, [Diastatic Malt Flour booklet (2025)](https://www.edme.com/wp-content/uploads/2025/05/Diastatic-malt-flour-booklet-fv.pdf), p. 11. | Names malted spelt flour as an enzyme-active flour and gives an EDME product-specific diastatic-power range. Does not establish that EDME's grade matches the lightly roasted IREKS product. No activity value is adopted. |
| `WP02-A7-SPELT-MALT-FLOUR-20261013-R24-S04` | Deer Creek Malthouse, [Pizza Mix](https://www.deercreekmalt.com/product/pizza-mix/). | Names malted spelt flour as an ingredient in a consumer pizza mix. The mix's recipe directions and quantities do not measure the spelt-malt component. |
| `WP02-A7-SPELT-MALT-FLOUR-20261013-R24-S05` | OQLF, [épeautre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre). | Gives the preferred Québec French term `épeautre` and English `spelt`. It does not define the malted-flour compound. |
| `WP02-A7-SPELT-MALT-FLOUR-20261013-R24-S06` | OQLF, [farine maltée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432785/farine-maltee). | Gives `farine maltée / malted flour` but defines flour with malt extract or ground malt added. It does not establish this spelt product's French name or make `farine maltée` an alias for it. |
## Coordinator integration decision (2026-10-13)

Accepted after independent review of the Canadian French IREKS product listing and OQLF entries. Integrated identity-only `ingredient-ref-malted-spelt-flour` with `malted spelt flour / farine d'épeautre malté` and `spelt malt flour` as its only English alias. The compound French display is source-attested Canadian wording, not an OQLF ruling. No forms, measures, density, mappings, recipe links, conversions, yields, or substitutions were added. See the [R24 integration record](../batches/wp02-wp03-wp04-round24-gap-review-integration-20261013/README.md).
