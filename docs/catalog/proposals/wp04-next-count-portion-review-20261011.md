# WP04 proposal: recipe-source mismatch in carrot count evidence

**Review date:** 2026-10-11
**Status:** Proposal-only audit. No numeric portion is proposed for the bundled recipe line, and no canonical file is changed.

## Disposition

Keep recipe `105#6` unsupported for count-to-mass. The bundled line asks for **4 small carrots, diced**. Its linked publisher page instead lists **2 medium carrots, scrubbed and diced**. The page is a source for a related recipe version, but it does not establish that the bundled quantity or size is an authorized adaptation of that version.

Health Canada's CNF 2026 source-specific portion already recorded in the ledger is 1 small carrot **14 cm long** = **50 g**, with 11% refuse. That is a valid published portion for the precisely described CNF item; it is not a measured mass for four unspecified small carrots. The existing ledger also retains CNF 2015's 1 medium carrot = 61 g. Those portions describe different size classes. Do not use either to reconcile the source-page line with the bundled line, derive a recipe total, or activate a generic count mapping.

The source-page recipe's 2 medium carrots and the CNF 2015 61 g medium portion would describe 122 g edible portion for that source-page version only. This is a comparison aid, not a proposed observation for bundled recipe `105#6`.

## Exact bundled demand and source mismatch

| Recipe line | Bundled record | Linked publisher page | Result |
| --- | --- | --- | --- |
| `105#6`; recipe UUID `e152b749-db75-4a7c-9bbf-3b94f721451d`; ingredient UUID `e152b749-db75-4a7c-9bbf-3b94f721451d-ingredient-6` | `4 small carrots, diced`; quantity `4`; unit `count`; reference `ingredient-ref-carrot`. The instructions add carrots before a 1 h 30 min simmer. | Bryanna Clark Grogan's *Homemade Habitant Pea Soup (Soupe aux Pois), Vegan-Style* lists `2 medium carrots, scrubbed and diced`; the post says it serves 6–8 and is adapted from a cookbook recipe, then simmers for 2 h. | The source page does not match the bundled count or size class. Keep the bundled line's mass unresolved. |

The wider ingredient lists also differ: the bundled recipe has one sweet potato and four garlic cloves, while the publisher page has no sweet potato and lists two garlic cloves plus chopped parsley. This supports treating the page as related-source context, not silently applying its carrot amount to the bundle. The exact provenance of the bundled adaptation remains unknown.

This carrot line appeared in the earlier 44-row produce-count inventory. The new finding is the linked-source comparison that exposes a recipe-version conflict; this proposal does not repeat or promote the already-recorded 14 cm CNF portion.

## Supported and unsupported data

### Supported source-specific portions

- **CNF 2026:** raw carrot / *Carotte, crue*, Food Code 2380, USDA NDB 11124; Measure Code 1244 is `1 small (14cm long)` / `1 petit (14cm long)` = **50 g**. The separate refuse row is 11% (including crown, tops, and scrapings). This is already recorded as `ingredient-ref-carrot-raw-count-weight-cnf-2026-1244`, source `WP04-WP12-CNF-2026-PRODUCE-20261011-CARROT`.
- **CNF 2015:** raw carrot, Food Code 2380; `1 medium` = **61 g**, and `1 small (14 cm long)` = **50 g**; total refuse 11%. This is existing source evidence `WP04-WP12-PRODUCE-20261010-S03`.
- **USDA 1986 codebook:** raw carrots, code 731-0101; `1 small (5-1/2 in long)` = **50 g**, `1 medium` = **61 g**. This independent historical government record corroborates that the published small portion carries an explicit size description. It does not identify the actual size of the four carrots in the bundled line.

### Unsupported for bundled `105#6`

- The local line supplies no length, diameter, measured mass, or statement that its four “small” carrots are 14 cm each.
- The linked publisher page supplies a different amount and size class: two medium carrots. It does not document the bundled version's four-small-carrot adaptation.
- No source reviewed establishes a conversion between two medium carrots and four small carrots, or a mass for the bundled four-carrot amount.
- Dicing and simmering describe recipe preparation; they do not supply a raw count portion. Keep the CNF refuse percentage as a source qualifier and do not add refuse mass to the edible portion.

## Proposed ledger-only delta

- Add **no** `count_weight` or `published_portion` observation for four small carrots, and do not duplicate the existing CNF 2026 one-small-at-14-cm observation.
- If the ledger maintainer wants this audit represented, add only a source-scoped unresolved decision on `ingredient-ref-carrot`, citing `WP04-NEXT-COUNT-PORTION-20261011-S01` and the existing CNF source IDs. The decision should state that the linked page's two-medium line does not match bundled `105#6`.
- Keep `defaultDensity: null`, `unitMappings: []`, and the recipe's four-count line unchanged. Do not associate the source-page 122 g comparison with the bundled line.

## Source register

Accessed 2026-10-11 unless otherwise stated. Existing ledger source IDs are reused without renaming.

| Source ID | Source and locator | Claim and limit |
| --- | --- | --- |
| `WP04-NEXT-COUNT-PORTION-20261011-S01` | Bryanna Clark Grogan, [Homemade Habitant Pea Soup (Soupe aux Pois), Vegan-Style](https://veganfeastkitchen.blogspot.com/2013/02/homemade-habitant-pea-soup-soupe-aux.html), dated 2013-02-18; recipe heading, yield, ingredient list, and method. | The source page serves 6–8 and lists two medium raw carrots, scrubbed and diced. The recipe is identified as adapted from a cookbook. It is not the same ingredient list or carrot amount as bundled recipe 105. |
| `WP04-WP12-CNF-2026-PRODUCE-20261011-CARROT` | Health Canada, [Canadian Nutrient File 2026 dataset](https://open.canada.ca/data/en/dataset/1b6139bd-7ed7-4043-bc28-ff00e10f3109), `food_name.csv`, `measure_name.csv`, `measure_type.csv`, `measure_weight_conversion.csv`; Food Code 2380, Measure Code 1244, Measure Type 6. | Already joined in the shared ledger: raw carrot; one small carrot 14 cm long = 50 g; separate total-refuse measure = 11%. Supports that exact published portion only, not unspecified-size carrots in `105#6`. |
| `WP04-WP12-PRODUCE-20261010-S03` | Health Canada, [Carrot, raw / Carotte, crue, CNF 2015, Food Code 2380](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=2380), serving-size and refuse tables. | The interim 2015 page lists small (14 cm) = 50 g and medium = 61 g, with 11% refuse. It does not establish that bundled `105#6` is medium, nor reconcile its source mismatch. |
| `WP04-NEXT-COUNT-PORTION-20261011-S02` | USDA Agricultural Research Service, [Manual of Food Codes for Individual Intake, October 1986](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/8586/csfii85_4days_codebook.pdf), printed p. 644 / PDF page 652, raw carrots code 731-0101. | Lists small (5-1/2 in long) = 50 g and medium = 61 g in the common-measure/edible-serving table. Historical corroboration only; not a size measurement for the bundled carrots or a current retail-size distribution. |
| `WP04-WP12-FDC-ALT-20261010-S06` | USDA ARS, [Standard Reference Release 28, Food Group 11](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf#page=449), NDB 11124, *Carrots, raw*, p. 449. | The record's checked common measures are volume portions, not a small-carrot count. It supplies no independent size match for `105#6`. |

## Acceptance checks

1. Preserve the existing CNF 2026 50 g / one small carrot 14 cm observation, its source ID, and 11% refuse qualifier unchanged.
2. Keep `105#6` at four small carrots, with count-to-mass unresolved; do not assign 200 g by multiplying the CNF portion.
3. Do not assign the source-page comparison of 122 g to bundled recipe 105. A future resolution requires confirmation of the bundled recipe's intended source/version or a direct measure of its four carrots with size and edible-basis details.
4. Do not add a default density, unit mapping, conversion, yield, substitution, or recipe edit.
5. Record this review as proposal-only; no shared ledger, catalog, plan, checklist, roadmap, package, generated file, or test is changed by this proposal.

## Validation

The proposal is UTF-8 without a byte-order mark. Whitespace and encoding checks apply to this file only. No tests were run.
