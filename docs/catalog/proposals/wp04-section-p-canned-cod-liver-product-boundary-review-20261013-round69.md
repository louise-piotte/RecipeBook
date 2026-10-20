# WP04 Section P — canned cod-liver product boundary review

- **Review date:** 2026-10-13.
- **Candidate:** Tousain `Cod Liver in Own Oil / Foie de morue dans son huile`, Mayrand item 19904, 115 g.
- **Disposition:** Hold as an inactive product candidate. Do not add a reference, alias, form, recipe link, measure, density, conversion, yield, or substitution.
- **Scope:** Proposal only. No shared catalog JSON, ledger, plan, roadmap, checklist, or code was changed. No tests or emulator checks were run.

## Recommendation

There is current Québec retail evidence for this particular canned product and a Québec terminology record for `foie de morue`. The bundled recipes do not request it, however, and introducing the exact bilingual product name would make the broad searches `liver` and `foie` each select this one specialized fish-organ product. The exact name would also join the existing multi-result `cod` and `morue` searches. Keep the candidate out of the active picker until a recipe or explicit product request establishes a need and intended preparation.

This is a distinct product review under the still-open Section P plan item for smoked, salted, dried, canned, oil-packed, water-packed, and fermented fish forms. It does not duplicate the generic preserved-fish boundary review: that review keeps universal states inactive without a specific request, while this proposal checks a named cod-liver SKU and its picker effects. The archived review and its batch remain relevant background, not a prior decision on cod liver.

## Product and Québec naming evidence

Mayrand lists the Tousain product in English as `Cod Liver in Own Oil 115 g` and in French as `Foie de morue dans son huile 115 g`. Both pages show item 19904, unit UPC 060897022851, a 115 g unit and a 12 × 115 g case; the French page showed it in stock at four Québec stores when checked. This supports a current Québec market listing and the bilingual display wording. The retail pages do not provide an ingredient declaration, species or binomial, drained edible weight, or a view of the package's principal display panel. Store availability is transient and does not establish broad availability or regulatory compliance of the specific package.

The OQLF GDT record places `foie de morue` in the food/fish-product domain, identifies it as the preferred Québec term and pairs it with English `cod liver`. Its note says cod livers may be salted and canned, with or without sauces or spices, and distinguishes the organ from oil rendered from it. The record was last updated in 1983, so it supports terminology and the organ/oil distinction, not current product availability, species assignment, or measurements.

CFIA guidance defines fish for this labelling page to include marine animals and their parts and by-products. It describes common-name, true-nature and packing-medium labelling requirements, including oil-packed presentations. This establishes relevant Canadian labelling context; it is not a product-specific approval or a finding that the retail page proves the package complies.

The CFIA Fish List search results for `cod` show `Cod / Morue` for *Gadus macrocephalus* and *Gadus morhua*, and a separate `Arctic Cod / Morue Polaire` entry for *Boreogadus saida*. The Mayrand listing does not name a species. Treat `cod` as the product's market wording and do not assign the product to Atlantic cod, Pacific cod, or another taxon based on that listing alone.

## Archive, live ownership, and picker audit

The snapshot contains 1,390 active references, 100 forms, 63 legacy candidates, and 1,723 research-ledger records. I searched proposal and batch archives, active references and forms, legacy identities, and ledger strings for normalized exact ownership of `cod liver`, `canned cod liver`, `cod liver in own oil`, `foie de morue`, `foie de morue en conserve`, `foie de morue dans son huile`, `cod liver oil`, `huile de foie de morue`, `fish liver oil`, and `huile de foie de poisson`. None has an exact owner in those datasets. No prior proposal or batch is a focused cod-liver review. The related archive is `wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md` and its state-boundary batch.

The audit followed `IngredientSearch.kt`: normalize case, accents and punctuation (including the `œ`/`oe` fold), return complete word-phrase matches first, and use substring matches only if no phrase match exists. The hypothetical product display was projected without adding it to the catalog:

| Query | Current picker result | If exact bilingual product display were activated |
|---|---|---|
| `cod` | Five rows: Arctic cod, Atlantic cod, Pacific cod, sablefish (`black cod`), and salt cod. | Six rows; the proposed product would be one additional result. |
| `morue` | Five rows: Arctic cod, Atlantic cod, Pacific cod, sablefish, and salt cod. | Six rows; the proposed French display would be one additional result. |
| `liver` / `foie` | No result. | One result: this canned cod-liver product. This is the main picker concern. |
| `cod liver oil` / `huile de foie de morue` | No result. | Still no result: those phrases are not contiguous in `cod liver in own oil / foie de morue dans son huile`, and neither oil phrase would be added as an alias. Keep extracted cod-liver oil separate. |
| `fish` / `poisson` | Four / seven rows, respectively. | Unchanged; neither word is in the proposed display. |
| `roe` | Falls back to Greenland halibut because `roe` is a substring of normalized `Groenland`; no roe phrase is present in that row's name. | Unchanged; neither proposed display contains `roe`. |

The exact `cod`/`morue` phrases therefore remain multi-result queries. The exact product phrase itself has no owner today. Do not add `cod`, `morue`, `liver`, `foie`, `roe`, or any oil term as an alias to another row.

The five current cod-query references have no attached ingredient forms, default densities, or unit mappings. The bundled `substitution-rules.v1.json` and `contextual-substitution-rules.v1.json` files each currently contain zero rules; there is no cod-liver or fish-liver substitution to extend.

## Recipe demand, numeric evidence, and substitutions

I scanned every manifest-listed recipe file and every ingredient row: **114 recipes and 1,123 ingredient rows**. The scan included exact and broad terms `cod liver`, `canned cod liver`, `cod liver in own oil`, `foie de morue`, `foie de morue en conserve`, `foie de morue dans son huile`, `cod liver oil`, `huile de foie de morue`, `fish liver oil`, `huile de foie de poisson`, `cod`, `morue`, `liver`, `foie`, and `roe`. There were no matching recipe files or ingredient rows. No recipe link or relinking is supported.

The retailer's 115 g figure is a package quantity; the listing does not establish the amount of drained liver versus packing oil. Health Canada's CNF serving record 457 is explicitly `Fish oil, cod liver / Huile de poisson, foie de morue`; its 5 ml = 4.6 g, 15 ml = 13.8 g, and 100 ml = 92.1 g observations belong to oil, not canned liver. Do not reuse them for this product. The checked record does not prove that Health Canada's full current dataset lacks a canned-liver record, so this is not a claim of comprehensive database absence.

No source or recipe establishes a density, cup/spoon conversion, drained yield, edible-portion weight, or package conversion for canned cod liver. No substitution is supported between this organ and cod flesh, other fish liver, animal liver, roe, cod-liver oil, fish-liver meal, or another canned fish. Keep all such conversions and substitutions absent.

## Integration sketch if later requested

Keep the candidate inactive now. If a future recipe or user request names this product, review the exact product state and whether it merits a narrow product reference or a form under an appropriate fish-liver identity. Preserve the Québec display `foie de morue dans son huile`; leave the species unresolved unless the product label identifies it. Do not map it to Atlantic cod flesh, generic canned fish, cod-liver oil, roe, or fish-liver meal. Add no numeric or substitution behavior without direct product-specific evidence.

## Sources and limits

Accessed 2026-10-13 unless a page's update date is stated. Source labels are local to this proposal; no shared-ledger records were created.

| Source | Evidence used | Limit |
|---|---|---|
| Office québécois de la langue française, [GDT: `foie de morue`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488144/foie-de-morue) (last updated 1983). | Preferred Québec term; English `cod liver`; fish-product domain; note distinguishes salted/canned organ from extracted oil. | Old terminology record; not current availability, a species determination, or a measurement source. |
| Mayrand, [English product listing](https://mayrand.ca/en/our-products/grocery/canned-fish-and-meat/canned-fish/foie-de-morue-dans-son-huile-tousain-19904) and [French product listing](https://mayrand.ca/fr/nos-produits/epicerie/poisson-et-viande-en-conserve/poisson-en-conserve/foie-de-morue-dans-son-huile-tousain-19904). | Current bilingual Tousain product name, retailer item 19904, UPC, pack size, canned-fish category and Québec store availability. | Retailer listings rather than a full package label; no declared ingredients, species, drained weight, or independently verified compliance. Availability can change. |
| Ilios Foods, [bilingual product catalog PDF](https://fr.iliosfoods.ca/_files/ugd/7a4ac1_5fbfe6e609ab4310b481cac160c57337.pdf), p. 33. | A separate commercial product is listed `FOIE DE MORUE / COD LIVER`, 11 × 121 g, imported from Norway. | Manufacturer catalog evidence only; does not name species or provide serving, drained-weight, or conversion data. |
| CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). | Fish includes parts/by-products; common-name and true-nature guidance separates cut, packing medium, and condition descriptors. | General guidance; not a product-specific classification or compliance finding. |
| CFIA, [Fish List search](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) (lookup term `cod`) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | The lookup associates `Cod / Morue` with *G. macrocephalus* and *G. morhua*, and lists Arctic cod separately; the overview explains that the list gives English/French common names and scientific names. | Common-name evidence does not identify the species used in the Mayrand SKU. |
| Health Canada, [CNF serving record 457](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=457&lang=eng&wbdisable=true) (page modified 2019-03-01). | Values for `Fish oil, cod liver`, explicitly an oil record. | Oil measures cannot be transferred to canned liver; this page is not evidence that the wider CNF has no canned-liver entry. |

**Final disposition: hold.** The plan's broad preserved-fish item remains open. No active catalog, recipe, numeric, or substitution changes are recommended by this review.

## Root integration outcome

Accepted the hold on 2026-10-13. Keep the Tousain canned cod liver candidate inactive because no bundled recipe requests it and its only exact broad organ searches, `liver` and `foie`, would each become a singleton picker result. Leave the SKU's cod species unresolved. No active reference, form, alias, or research-ledger record was added. See the [integration record](../batches/wp04-section-p-canned-cod-liver-boundary-hold-integration-20261013/README.md). No tests or emulator checks were run for this documentation-only decision.
