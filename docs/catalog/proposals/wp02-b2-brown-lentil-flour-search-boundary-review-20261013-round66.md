# WP02 B2 — Brown lentil flour search and product-boundary review (round 66)

- **Reviewed:** 2026-10-13
- **Status:** Proposal only; no shared catalog, ledger, roadmap, checklist, recipe, or code file changed.
- **Scope:** One open B2 flour boundary: whether a color-qualified brown lentil flour should become a separate catalog identity. This does not reopen the prior whole-lentil brown/yellow decision or the green-, red-, and yellow-lentil flour reviews.
- **Recommendation:** **Hold brown lentil flour outside the active catalog.** Research establishes brown lentil flour as an experimental ingredient, but current Canadian mill evidence does not settle a brown-specific flour product or its whole/dehulled scope. The proposed Québec French phrase is descriptive rather than a verified brown-flour product label. Adding it alone would also make a currently unmatched bare `brown lentil` / `lentilles brunes` query return a flour as its only result.

## Candidate naming and product boundary

The English research term is **brown lentil flour**. Hajas et al. classify lentils by coat colour and prepare a brown-lentil flour in the laboratory from Canadian-origin lentils. A later study separately names whole brown lentil flour and dehulled brown lentil flour and reports differences between those preparations. These studies establish a research ingredient, not one common Canadian retail product specification.

For Québec French, **farine de lentilles brunes** is a transparent descriptive construction, not a verified local brown-flour product label. Aliments du Québec lists a Québec-milled **farine de lentilles vertes**; Metro lists **lentilles brunes** as a whole dry product; and OQLF supports the generic food term **lentille**. Together these support the wording pattern, but none attests the exact brown-flour phrase as a Québec product name. Keep it provisional and do not assign it as an active display or alias.

The unresolved product boundary is substantive. The 2022 research uses whole-seed brown flour. Pontoni et al. later compare whole and dehulled brown lentil flours, with measurable differences in functional and nutritional properties. Current Canadian mill pages reviewed here list other lentil-flour scopes: Avena lists whole green, decorticated yellow, whole red, and decorticated red; Diefenbaker describes its generic lentil flour as made from dehulled green or red lentils. Diefenbaker also uses “brown lentil” for whole red lentils with a brown exterior and red interior. These pages are product-specific evidence, not a census of every Canadian flour supplier.

## Archive, ownership, and recipe checks

The B2 alternative-flour umbrella remains open. The plan already accepts green lentil flour and contains separate red- and yellow-lentil-flour picker holds ([red review](wp02-b2-red-lentil-flour-search-boundary-review-20261012.md), [yellow review](wp02-b2-yellow-lentil-flour-search-boundary-review-20261012.md)). An archive search found no brown-lentil-flour proposal, batch, candidate, or allocated identity. The nearby [WP03-H whole-lentil brown/yellow review](wp03-h-brown-yellow-lentil-identity-review-20261011.md) and [lentil-types batch](../batches/wp03-lentil-types-integration-20261011/README.md) concern only broad whole-lentil names; they keep those labels unassigned because sources mix seed-coat descriptions, cotyledon classes, and supplier usage. This proposal relies on that existing boundary without changing or reopening it.

Current live catalog snapshot: 1,389 ingredient references, 100 forms, and 114 manifest-listed recipes. The lentil family has generic `lentils / lentilles`, green, French green, red, and black Beluga identities, plus the existing `green lentil flour / farine de lentilles vertes` row. There is no brown whole-lentil row. No form label or match term contains `lentil` / `lentille`. The green-flour and whole-lentil rows have `defaultDensity: null` and empty `unitMappings`; their ledger measurement and substitution research fields remain `not_yet_researched`. No lentil form, unit-conversion record, package yield, or substitution rule is present.

Exact normalized ownership audit:

| Surface | Result for `brown lentil flour` / `farine de lentilles brunes` |
|---|---|
| Active reference names and aliases | No exact owner; no brown lentil flour row or aliases |
| Ingredient forms and form match terms | No exact owner; no lentil forms |
| Legacy-import identities | No exact owner or brown-flour candidate |
| Research ledger | No brown-flour record or candidate ID. The existing `ingredient-ref-lentils` record preserves the whole-pulse brown/yellow hold; `ingredient-ref-green-lentil-flour` is the only color-specific flour record. |
| Proposals and batches | No dedicated brown-lentil-flour review or integration. Existing green/red/yellow flour reviews are distinct. |

The current picker in `IngredientSearch.kt` normalizes with NFKD, folds accents, then returns complete word-phrase matches before falling back to substring matching. The following projection applies that behavior to the current reference/form rows and to a hypothetical identity-only bilingual row with the proposed names and no aliases:

| Query | Current picker | With hypothetical brown-flour row |
|---|---|---|
| `brown lentil flour` | No result | Brown lentil flour only |
| `farine de lentilles brunes` | No result | Brown lentil flour only |
| `brown lentil` | No result | Brown lentil flour only |
| `lentilles brunes` | No result | Brown lentil flour only |
| `lentil flour` | Green lentil flour | Green and brown lentil flour |
| `farine de lentilles` | Green lentil flour | Green and brown lentil flour |

The last two queries would broaden as expected. The risk is that the first two bare pulse phrases would become new flour-only results even though no whole brown-lentil identity exists. This does not displace an existing brown-lentil result: those bare queries currently return nothing. It would, however, give an ambiguous whole-pulse query a misleading product result. Do not add broader aliases to the generic lentil or green-flour rows as a workaround.

The manifest-driven corpus scan covered 114 recipe files and 1,123 ingredient rows. Accent-folded searches for brown lentil flour, brown lentils flour, `farine de lentilles brunes`, the bare brown-lentil names, `lentil flour`, and `farine de lentilles` found zero matching recipe rows. There is no recipe demand to justify a new identity, recipe link, or measurement.

## Numeric and substitution evidence

- Hajas et al. use 100 g of lentil flour in a controlled cookie formulation, with 100 g rice flour in the reference recipe. This is one experimental product formula, not a general substitution ratio. The study reports no cup measure or bulk density for the flour.
- Pontoni et al. report laboratory water absorption for whole and dehulled brown flour (2.35 and 2.30 g water per g dry matter, respectively). Water absorption is not bulk density or a household mass-volume conversion. The paper reports no reusable cup weight.
- No source reviewed establishes a general substitution between brown flour and wheat, rice, green lentil, or red lentil flour. Industrial application descriptions and a single laboratory formula do not define a reusable rule.
- If reconsidered later, keep density null and unit mappings empty unless a product-matched loose/packed density or repeatable household measure is sourced. Add no form, conversion, package yield, recipe link, or global/contextual substitution based on this review.

## Integration sketch if reopened

Do not reserve a candidate ID or change shared data now. Reopen only after a current Canadian product source establishes a brown-specific flour and whether it is whole-seed or dehulled, a Québec-facing source validates the French product wording, and search behavior can keep bare whole-pulse queries from resolving to flour alone. If those conditions are met, review a new `FLOUR_AND_STARCH` identity tentatively named `brown lentil flour / farine de lentilles brunes`, with no aliases unless directly attested. Keep the chosen process scope explicit; do not merge whole and dehulled brown flour by default.

## Sources and limits

Sources were checked online on 2026-10-13. Product titles establish only their stated local or supplier wording; experimental papers establish research samples and methods, not retail availability.

| Source | Evidence used | Limit |
|---|---|---|
| Hajas et al., *Foods* 2022, [publisher DOI](https://doi.org/10.3390/foods11142028), [open full text PDF](https://real.mtak.hu/147754/1/foods-11-02028.pdf) | Names brown lentil flour; identifies brown as a coat-colour type, reports Canadian origin for the brown seed, and describes laboratory milling of 250 g batches followed by sieving at 500 µm. Its cookie formula uses 100 g lentil flour against a rice-flour control. | Lab-milled material purchased in Budapest; not a Canadian brown-flour SKU, Québec display ruling, bulk density, household measure, or general substitution recommendation. |
| Pontoni et al., *Sustainable Food Proteins* 2025, [article](https://doi.org/10.1002/sfp2.70027) | Directly distinguishes whole brown lentil flour from dehulled brown lentil flour and compares their composition and functional properties. | Samples and preparation are study-specific; the results do not establish a Québec product label or household conversion. |
| Diefenbaker Spice & Pulse, [Special Crop Products](https://www.dspdirect.ca/special-crop-products.php) | Canadian processor calls whole red lentils “brown lentil” and says its generic lentil flour is made from dehulled Canadian green or red lentils. | Supplier-specific nomenclature and product description; not a universal synonym rule or an exhaustive market survey. |
| Avena Foods, [Pulse Flour Ingredients](https://www.avenafoods.com/products/pulses-and-pulse-ingredients/flours/) | Current Canadian mill line lists whole green, decorticated yellow, whole red, and decorticated red lentil flours. The page describes its wider pulse-flour line as dry-milled from whole, split, and decorticated pulses. | The listed line does not prove that no other Canadian mill offers brown flour. It does not define a brown flour identity. |
| Canadian Grain Commission, [Lentils: classes, types and varieties](https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/18-lentils/classes-types-varieties.html) | Official Canadian class distinction is based on cotyledon colour; seed-coat colour and cotyledon colour can combine in different ways. | Grain grading taxonomy, not a consumer-facing “brown lentil” or brown-flour naming rule. |
| OQLF, [lentille (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082779/lentille) | Québec terminology source supports generic `lentille` for *Lens culinaris*. | Entry was last updated in 1991 and does not establish a colour-qualified flour display. |
| Aliments du Québec, [Farine de lentilles vertes biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-de-lentilles-vertes-biologique) | Québec mill product listing attests the local French construction `farine de lentilles vertes`. | Green lentil product only; it does not attest `farine de lentilles brunes`. |
| Metro, [Mieux-Être Lentilles brunes](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/feves-sechees/lentilles-brunes/p/059072053988) | Québec retailer title attests `lentilles brunes` for a whole dry lentil product. | The page does not establish cultivar, cotyledon colour, milling process, or a flour product name; the item was shown out of stock when checked. |

## Review limits

This proposal records a catalog hold only. It does not allocate an identity, resolve whole brown lentils, or update the research ledger. No tests or emulator checks were run because the only proposed change is this documentation file.

## Root integration outcome

Accepted the hold on 2026-10-13. Brown lentil flour remains unallocated because product processing scope and Québec French naming are unsettled, and a lone flour row would make bare brown-lentil searches misleading. No catalog or research-ledger data changed. See the [integration record](../batches/wp02-b2-brown-lentil-flour-search-boundary-hold-integration-20261013/README.md). No tests were needed for this documentation-only decision.
