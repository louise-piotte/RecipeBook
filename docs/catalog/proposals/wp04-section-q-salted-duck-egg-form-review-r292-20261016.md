# WP04 Section Q proposal: salted duck egg form — R292 — 2026-10-16

- **Reviewed:** 2026-10-16
- **Status:** Integrated on 2026-10-16. Added the salted form under the existing duck-egg reference and a research-ledger record; no new reference, recipe link, measurement, conversion, yield, or substitution rule was added.
- **Target anchor:** [WP04 Section Q, culinary egg checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7090).
- **Recommendation:** Add one **salted** form under the existing whole duck-egg reference. Use the bilingual labels **salted duck egg / œuf de canard salé** with narrow plural and cooked-salted search terms. Do not add a second ingredient reference, measures, conversions, yields, recipe links, or substitutions.
- **Candidate form ID:** ingredient-form-duck-egg-salted.

## Why this is a distinct open WP04 gap

Section Q still lists salted and preserved eggs. The integrated duck-egg reference covers whole duck eggs without processed-product coverage; the R249 dried-white and dried-yolk forms cover other egg components and do not allocate a salted whole-egg form. Current catalog files contain 1,663 references and 126 forms. No active reference, form, or legacy-import candidate has an exact owner for salted duck egg(s), salted egg, œuf de canard salé, or œufs de canard salés. The existing duck-egg reference owns the unqualified duck-egg terms.

The proposal/archive scan found no salted-duck-egg proposal, integration, or hold. The older WP06 cuisine sweep mentions salted egg yolk as a mooncake filling only; it does not allocate a whole salted duck-egg identity or form. R290 concerns white rice flour and the now-integrated R291 concerns crispy rice cereal; both are unrelated WP02/WP03 work. R283 goat milk, R286 sheep milk, and R289 water buffalo milk remain unrelated and are not reopened.

## Proposed form and identity boundary

| Field | Proposal |
| --- | --- |
| Form ID | ingredient-form-duck-egg-salted |
| Parent reference | ingredient-ref-duck-egg |
| Form code / preparation state | salted / salted |
| English label | salted duck egg |
| Québec French label | œuf de canard salé |
| English matching terms | salted duck eggs; salted cooked duck egg; salted cooked duck eggs; cooked salted duck egg; cooked salted duck eggs |
| French matching terms | œufs de canard salés; œuf de canard salé cuit; œufs de canard salés cuits |
| Density | null |

Treat this as the salt-preserved whole duck-egg state only. T&T’s French product listing uses **Œufs de Canard Salés**; Walmart Canada’s French listing uses the singular **l'œuf de canard salé cuit** and identifies the item as a whole, cooked duck egg. These product-backed phrases support the candidate display without an OQLF-backed terminology claim; the targeted OQLF search returned no dedicated salted-duck-egg entry. The French wording follows transparent Québec French product wording, not a claim that it is a prescribed term.

Keep fresh whole duck egg on its existing base row. Keep salted duck-egg yolk, preserved duck egg / century egg / pidan, chicken eggs, quail eggs, generic salted egg, and formulated egg products separate. Do not add “salted egg” or “salted duck egg yolk” as form terms. The retailer category lists whole salted, cooked salted, preserved, and salted-yolk products separately, so do not use those product names as synonyms.

The proposed form captures salting only. Salted products are sold both with and without a cooked descriptor; retain cooking as a recipe-line preparation or exact source text rather than implying that every salted duck egg is cooked. The R249 dry egg forms are a useful precedent for keeping a source-specific product state under its matching egg reference, while not treating a product-state name as a conversion.

## Picker projection

Counts below use the current IngredientSearch normalization and phrase-first matching over reference and form terms. The proposed form attaches search terms to the existing duck-egg row, so it introduces no duplicate ingredient row. A matching form hint is shown only when the query exactly matches a form label or matching term; a filtered row still requires the user to select it.

| Query | Current results | Proposed results |
| --- | --- | --- |
| salted duck egg / salted duck eggs | 0 | 1 — duck egg row, salted form hint |
| œuf de canard salé / œufs de canard salés | 0 | 1 — duck egg row, salted form hint |
| cooked salted or salted cooked duck egg(s) | 0 | 1 — duck egg row, salted form hint |
| œuf de canard salé cuit / œufs de canard salés cuits | 0 | 1 — duck egg row, salted form hint |
| duck egg(s) / œuf(s) de canard | 1 — duck egg | 1 — same duck-egg row |
| salted egg | 0 | 0 |
| salted duck egg yolk | 0 | 0 |
| preserved duck egg / century egg | 0 | 0 |
| egg / eggs | 8 / 3 | 8 / 3 |
| œuf / œufs | 5 / 9 | 5 / 9 |
| egg white / egg yolk / quail egg | 1 / 1 / 1 | unchanged |

Do not create a separate salted-duck-egg reference row or broaden the base duck-egg aliases. This keeps the species identity and preparation state visible without making plain duck-egg queries return duplicate rows.

## Recipe demand, measures, and substitutions

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for salted duck egg(s), salted egg, salted duck-egg yolk, preserved duck egg, century egg, pidan, and pei dan, in English and French where applicable. The scan found zero phrase hits in recipe documents and zero hits in ingredient rows. The corpus provides no recipe link or recipe-specific amount.

- **Measures and density:** Add none. T&T’s 375 g package and Walmart’s 350 g package are SKU-specific package quantities, not count weights, portions, or reusable kitchen measures. The products are whole solid eggs; no source supports a volume conversion or density.
- **Conversions and yields:** Add none. Salted/cooked egg is not a measured state conversion from fresh duck egg. No source gives paired quantities, preparation yield, or a general raw-to-salted relationship.
- **Substitutions:** Add no salted-to-fresh duck egg, chicken egg, quail egg, egg-white, or egg-yolk rule. The sources establish product naming and sale, not a role-specific replacement ratio or recipe behavior. The retailer’s use suggestions are not substitution evidence.
- **Recipe links:** None. The bundled corpus has no matching demand.

## Source ID and URL ownership

The three new source IDs for the T&T French product page, T&T egg category page, and Walmart French product page were absent from the ledger, and their exact URLs had no existing owner. The CFIA URL already had two owners; the form ledger reuses `WP04-EGG-S01`, leaving both existing ownership mappings intact. No duplicate source ID or URL was added.

| Source ID / URL | Source and supported claim | Limit and ownership |
| --- | --- | --- |
| WP04-SALTED-DUCK-EGG-R292-20261016-S01 | T&T Supermarket, [China Maid Œufs de Canard Salés](https://www.tntsupermarket.com/fr/74792601-cm-preserved-duck-eggs.html). French-facing product title, 375 g SKU, and suggested congee, salad, and pastry uses. | The URL slug says “preserved,” but the French product title says “salted”; do not treat the slug as evidence that salted and preserved eggs are synonyms. Retailer details and package size are SKU-specific. The search-indexed page was current in the last week; a direct open returned an internal error, so no ingredient declaration is claimed. Exact URL had no existing owner in the reviewed archive. |
| WP04-SALTED-DUCK-EGG-R292-20261016-S02 | T&T Supermarket, [Eggs product category](https://www.tntsupermarket.com/eng/product-categories/tt-dairy-frozen/tt-eggs.html). Current indexed listings distinguish salted duck eggs, salted cooked duck eggs, preserved duck eggs, and salted duck-egg yolk. | Product names support the picker boundary, not composition, culinary conversion, or stable availability. The live category shell requires JavaScript; the indexed product list was crawled recently. Exact URL had no existing owner in the reviewed archive. |
| WP04-SALTED-DUCK-EGG-R292-20261016-S03 | Walmart Canada, [Six Fortune Cooked Salted Duck Eggs](https://www.walmart.ca/fr/ip/Six-Fortune-Cuits-ufs-Sal-s-Du-Canard/6000196478522). The French page identifies duck egg, whole, cooked, salted, refrigerated; its ingredient declaration is duck eggs, salt, and water. It lists a 350 g package. | Retailer/SKU-specific; the selected Mississauga location showed out of stock. Product and availability details can change; package weight is not a reusable measure. Exact URL had no existing owner in the reviewed archive. |
| Reused `WP04-EGG-S01` | CFIA, [What to consider before applying for a Safe Food for Canadians licence](https://inspection.canada.ca/en/food-licences/obtain-licence?wbdisable=true), egg commodity section. Includes duck among egg species and lists processed eggs as whole or separated, cooked or uncooked, with or without other ingredients. | This broad licensing category is context only, not a standard of identity or salted-egg product definition. The form ledger reuses the existing source ID; the existing mappings to the duck/quail-egg and mealworm records are unchanged. |

## Recommendation

Accept one salted form under ingredient-ref-duck-egg, labeled **salted duck egg / œuf de canard salé**, with the exact English and French plural and cooked-salted phrase match terms above. Do not create a new reference row or fold salted duck egg into preserved duck egg, salted yolk, or generic egg. Add no density, measure, conversion, yield, recipe link, or substitution. Section Q’s other egg forms, other species, and dairy gaps remain open.

## Verification performed

- Read the current AGENTS.md, the relevant Requirements.md ingredient-reference and conversion sections, the Section Q plan, roadmap, and proposal archive, including the integrated R283, R286, and R289 items and R290.
- Checked active references, forms, legacy candidates, and research-ledger ownership for exact candidate names, form ID, proposed source IDs, and exact URLs. Confirmed the CFIA URL’s existing owners and reviewed the R291 WP03 archive update when it appeared during this review.
- Checked the current T&T French listing, T&T egg-category listings, Walmart Canada French product details, and CFIA licensing guidance online. The T&T product page returned an internal error on direct open; its indexed listing was reviewed, and the limitation is recorded above.
- Reproduced the picker projection from IngredientSearch and scanned the manifest-listed recipe corpus.
- Verified this proposal file as UTF-8 without a BOM and checked its Markdown whitespace. No software tests, build, or emulator checks were run; the integrated change only adds database JSON data, which the project’s `AGENTS.md` exempts from software testing.

## Integration record

- Added `ingredient-form-duck-egg-salted` under `ingredient-ref-duck-egg` with the proposed bilingual labels and narrow species-qualified plural and cooked-salted search terms. The form captures salting without requiring the egg to be cooked; French wording is product-attested and explicitly not claimed as OQLF-standardized.
- Added one form ledger record with the T&T and Walmart evidence plus reused `WP04-EGG-S01`. Recorded no supported reusable measure and no supported substitution. No measurement observations, recipe links, conversions, yields, or active substitutions were added.
- Updated the Section Q egg checklist and roadmap. The broader checklist remains open.
- Final catalog totals: 1,663 references, 127 forms, 2,013 ledger records, 8,872 source entries, 7,512 distinct source IDs, and 6,273 distinct URLs. The bundle still contains 114 recipes and 1,123 ingredient rows.
- Static data/package validation passed. No software tests, builds, or emulator checks were run because this change only adds database JSON data.
