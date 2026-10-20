# WP03 Section U — Mahleb / mahlab identity and product-boundary review (R330, 2026-10-16)

- **Status:** proposal only. This review creates this proposal file only; it does not change the shared catalog, ledger, checklist, roadmap, recipes, generated files, or application code.
- **Plan anchor:** Section U, “Fresh herbs botanical aromatics and regional flavorings,” at line 7639 of `docs/RecipeBook-global-ingredient-catalog-plan.txt`. Its unchecked regional-aromatics item explicitly names “mahleb.”
- **Candidate:** culinary mahlab, also spelled mahleb, from the seed kernel inside the stone of *Prunus mahaleb*.
- **Coordination:** Chios mastic is already integrated. The R327 mastic proposal mentions mahlab only as a hypothetical substitute and explicitly found no evidence to support it as one; that mention did not review mahlab identity. This review makes no substitution recommendation.
- **Disposition:** advance one bounded spice identity, with two source-backed dry retail forms: whole kernels sold as “Mahlab seeds” / “Mahlab en grains,” and ground kernels sold as “Mahlab powder” / “Mahlab en poudre.” Keep the botanical tree, fruit, wood, and extracts outside the ingredient identity.

## Recommendation

Add one picker identity for the aromatic culinary spice made from the seed kernel of *Prunus mahaleb*. Use **mahlab** in both English and Québec French. Two Montréal retailers use this source-language name in French product contexts, and a Canadian spice retailer uses “Mahlab” as its English product name. Do not translate it to “cherry,” “Sainte-Lucie,” or a botanical common name.

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-mahlab` (proposed; not reserved) |
| Category | `BAKING_AND_SPICE` |
| English display | `mahlab` |
| Québec French display | `mahlab` |
| English spelling aliases | `mahleb`; `mahaleb`; `mahlepi` |
| French aliases | None beyond the French display `mahlab` |
| Whole form | English `Mahlab seeds`; French `Mahlab en grains`; dry, whole kernel |
| Ground form | English `Mahlab powder`; French `Mahlab en poudre`; dry, ground kernel; French match term `mahlab moulu` |
| Recipe links | None; the current bundled recipe corpus contains no matching ingredient row |
| Density, unit mappings, whole-to-ground conversion, yield, active substitutions | None |

The alternate spellings are supported as spice-name variants by the Canadian product page in S04. Keep them as searchable names for the culinary spice, not as new botanical names. Do not add “cherry kernel spice”: that wording is generic and could retrieve kernels from other cherry species.

## Identity and product boundary

Kew accepts *Prunus mahaleb* as a species. The University of Reading Herbarium describes mahlab as spice made by crushing the seeds from its cherries to a fine powder and records its culinary use in Eastern Mediterranean and Middle Eastern confectionery, breads, and festive pastries. The Montréal retailer labels two market presentations “Mahlab en grains” and “Mahlab en poudre.” A Canadian retailer states that its whole mahlab seeds are the kernels found inside the St. Lucie cherry stone and identifies the botanical name as *Prunus mahaleb*. Together these sources support the plant part and the two retail forms without treating them as interchangeable for measurement.

Keep the identity bounded to the aromatic culinary kernel from *P. mahaleb*. Exclude the tree, its fruit or flesh, the intact stone, leaves, wood, extracted oil, essential oil, and non-food or medicinal products. The OQLF GDT entry for “mahaleb” defines the tree in arboriculture and gives “bois de Sainte-Lucie” and “cerisier mahaleb” as French tree terms; it is not an entry for the spice. Do not add those tree names, “Sainte Lucie cherry,” or *Prunus mahaleb* as picker aliases.

“Whole” refers to the culinary kernel sold as a seed, not the intact cherry stone or fruit. “Ground” refers to the spice powder. The sources establish both retail forms but provide no reliable whole-to-ground kitchen equivalence; preserve that unknown.

## Ownership and demand audit

I checked the current bundled reference and form packages, legacy import candidates, research ledger, focused proposal and batch archives, and all manifest-listed recipe ingredient rows for mahlab, mahleb, mahaleb, mahlepi, and close botanical/product phrases.

| Surface | Current snapshot / result |
|---|---|
| Active ingredient references | 1,679; no mahlab / mahleb identity or alias owner |
| Active ingredient forms | 127; no mahlab / mahleb form |
| Legacy import candidates | 58; no matching candidate |
| Research ledger | 2,025 records; no matching name, observation, decision, or source URL |
| Proposal and batch archives | No prior mahlab identity decision or focused review. The only archive mention found is R327’s unsupported hypothetical substitution example, explicitly not an identity review or a recommended replacement. |
| Recipe corpus | All 114 manifest-listed files and 1,123 ingredient rows searched; no matching mahlab, spelling variant, botanical phrase, or ma’amoul / mamoul recipe row |

The absence of a recipe hit is a demand finding for this bundled snapshot, not evidence against the documented culinary use. No recipe link is warranted now.

## Exact picker projection

The current picker returns no result for the proposed spellings or product phrases. In `IngredientSearch.kt`, searches fold accents, ligatures, and punctuation; complete normalized word phrases across reference and form terms take priority over substring fallback. An exact form phrase narrows the results to its owning reference, and a unique exact form phrase can supply the form hint.

If the recommendation is adopted, the phrases below should return only `ingredient-ref-mahlab`. Base-name and spelling-variant queries return the identity without a form hint. Each whole or ground product phrase returns the same identity and its unique form hint:

| Exact query | Expected picker projection |
|---|---|
| `mahlab`, `mahleb`, `mahaleb`, `mahlepi` | `ingredient-ref-mahlab`; no form hint |
| `Mahlab seeds`, `Mahlab en grains` | `ingredient-ref-mahlab`; whole-kernel form hint |
| `Mahlab powder`, `Mahlab en poudre`, `mahlab moulu` | `ingredient-ref-mahlab`; ground-kernel form hint |

Do not add “Sainte-Lucie cherry,” “bois de Sainte-Lucie,” or “cerisier mahaleb” to the identity or form terms. Those phrases can denote the tree, while the local spice source already supplies a searchable French product label.

## Measures and substitutions

S04 gives a vendor-use suggestion of about ½ teaspoon freshly ground mahlab per 500 g of flour. This is seller guidance for a particular baking context, not a recipe formula, measured portion, whole-to-ground conversion, density, or universal dose. If retained during a later integration, keep it as source-specific guidance only; do not derive a mass, default measure, or unit mapping from it. No evidence supports a density, package yield, or numeric relationship between whole and ground forms.

No reviewed source establishes a transferable ingredient substitution. R327’s mention of mahlab as one possible mastic replacement is not evidence for that pairing. Add no active substitution rule and do not substitute mahlab for mastic, vanilla, or another aromatic globally.

## Source register

Sources were accessed 2026-10-16. Source IDs are local to this proposal, not research-ledger records.

| ID | Source | Support and limits |
|---|---|---|
| **WP03-SECTIONU-MAHLEB-R330-20261016-S01** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Prunus mahaleb* L.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:729931-1/general-information) | Accepts *P. mahaleb* as a species and records its botanical range. Taxonomic evidence does not by itself establish culinary use or a food label. |
| **WP03-SECTIONU-MAHLEB-R330-20261016-S02** | University of Reading Herbarium, [“Mahleb, *Prunus mahaleb* L.”](https://research.reading.ac.uk/herbarium/2020/12/04/adventbotany-day-4-mahleb-prunus-mahaleb-l/) | Describes seed crushing to make mahlab spice and its Eastern Mediterranean / Middle Eastern use in confectionery, festive desserts, breads, and pastries. This is an institutional herbarium blog, not a standardized culinary specification; it supplies no conversion or general measure. |
| **WP03-SECTIONU-MAHLEB-R330-20261016-S03** | Épices Anatol, Montréal, [Mahlab en grains](https://www.epicesanatol.com/fr/epices/mahlab-grains/), [Mahlab en poudre](https://www.epicesanatol.com/fr/epices/mahlab-poudre/), [Mahlab powder](https://www.epicesanatol.com/en/spices/mahlab-powder/), and [Épice à shish taouk](https://www.epicesanatol.com/fr/epices/epice-shish-taouk/) | Québec-market French product labels and descriptions identify the spice as mahlab, distinguish grain and powder presentations, and use “mahlab moulu” in a spice-blend ingredient list. The English page labels mahlab powder. These are retailer product contexts, not OQLF terminology decisions; the French copy contains minor typographical errors. |
| **WP03-SECTIONU-MAHLEB-R330-20261016-S04** | Ameen Foods, [Mahlab Seeds](https://ameenfoods.ca/products/mahlab-seeds-100g) | Canadian retailer identifies its product as kernels inside the stone of *Prunus mahaleb*, labels whole seeds, lists “Mahleb,” “Mahaleb,” and “Mahlepi” as alternate names, and gives the approximate ½ teaspoon / 500 g flour usage suggestion. Retailer naming is not a botanical or Québec French authority; the amount is guidance, not a standardized portion. |
| **WP03-SECTIONU-MAHLEB-R330-20261016-S05** | Office québécois de la langue française, [GDT: mahaleb](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17033249/mahaleb) | Defines “mahaleb” as a wild cherry tree in arboriculture and gives “bois de Sainte-Lucie” and “cerisier mahaleb” as French tree terms. The entry was last updated in 1989 and does not name the culinary spice; it is cited to define the exclusion boundary, not to prescribe the spice label. |

## Remaining limits

This proposal resolves only the identity and retail-form boundary for mahlab. It does not survey every regional spice, establish Québec terminology beyond the cited local product labels, quantify ingredient measures, assess medicinal or safety uses, or create recipe demand. Keep those questions open for their respective reviews.
