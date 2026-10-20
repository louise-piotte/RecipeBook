# WP02 A6 proposal: sprouted buckwheat flour identity — 2026-10-12

## Review record

- **Reviewed and sources accessed:** 2026-10-12.
- **Status:** Integrated by the root coordinator on 2026-10-12. The accepted JSON and tracking changes are recorded in the batch README.
- **Owner:** WP02 A6 parallel catalog review. Shared catalog integration remains with the root coordinator.
- **Exact open checklist item:** The parent item at [global catalog plan line 1259](../../RecipeBook-global-ingredient-catalog-plan.txt#L1259): “[ ] Continue the A6 review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and other regional grain flours; keep grain-level teff naming separate from the flour identity.”
- **Scope:** Review one process-qualified flour identity—sprouted buckwheat flour—and keep it distinct from plain buckwheat flour and whole sprouted buckwheat.
- **Archive sweep:** Searched the current proposal and batch archive for sprouted buckwheat flour, germinated buckwheat flour, and farine de sarrasin germé. No earlier proposal or batch evaluates this flour identity. The related [WP03 whole-grain sprouted-buckwheat proposal](wp03-section-f-next-gap-review-20261012-round9.md) and [integration README](../batches/wp03-section-f-sprouted-buckwheat-identity-integration-20261012/README.md) explicitly leave flour separate; they cover whole dried groats only. The [WP02 kuttu review](wp02-a6-kuttu-buckwheat-flour-alias-review-20261012.md) adds regional names to plain buckwheat flour and does not review sprouting.
- **Proposal-local sources:** IDs WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S01 through S10 are unique in the live ledger and the proposal/batch archive at the snapshot below.
- **A6 status:** Keep the broad regional-flour checklist open.

## Recommendation

Add a separate identity-only reference:

- **ID:** ingredient-ref-sprouted-buckwheat-flour
- **English display:** sprouted buckwheat flour
- **Québec French display:** farine de sarrasin germé
- **Category:** FLOUR_AND_STARCH
- **English alias:** germinated buckwheat flour
- **French aliases:** none

The product sources distinguish flour made from germinated buckwheat from the unsprouted flour, and a separate whole-grain sprouted-buckwheat row is already active. The flour is marketed in Canada, and Québec French sources support both the product boundary and the wording farine de sarrasin germé [S01–S06]. The 2025 study calls its flour germinated buckwheat flour, supporting the proposed English alias [S07]. Keep the process qualifier in the display and alias; do not merge these terms into plain buckwheat flour.

This proposal creates no form or recipe link. It recommends leaving defaultDensity null and unitMappings empty. If the scoped research is added during integration, use measurementState researched_supported to record the specific laboratory bulk-density observation and retailer-labeled serving below, without activating either as a general density or household mapping. For substitution, record the study’s bun-specific trial as source-scoped evidence only; set substitutionResearchState to blocked_pending_evidence for any catalog rule and add no global or contextual substitution rule.

| Candidate or field | Disposition | Boundary |
|---|---|---|
| Sprouted buckwheat flour | **Integrate as a separate identity.** | Manufacturer and retail products identify flour made from sprouted buckwheat; Québec French sources independently use the sprouted-grain and flour terms together. [S01–S06] |
| Germinated buckwheat flour | **Add as one English alias.** | The 2025 paper uses this exact phrase for its germinated buckwheat flour sample. It names the same sprouting process, not a different grain or flour base. [S07] |
| Farine de sarrasin germé | **Use as the French display; add no French aliases.** | Exact Québec French product-category wording is used by Aliments Trigone. Farinart separately states that buckwheat is sold germinated and can be ground as flour. [S03–S05] |
| Plain buckwheat flour / farine de sarrasin | Retain as its existing separate identity. | Sprouting is a material processing qualifier. Do not add sprouted wording to the plain-flour aliases. |
| Sprouted buckwheat, dried / sarrasin germé séché | Retain as its whole-grain identity. | This row covers whole edible dried groats, not flour. The flour is produced after sprouting and milling. |
| Sprouted whole grain light buckwheat flour; organic sprouted buckwheat flour | Do not add as aliases. | These include a maker’s light/whole-grain and organic product qualifiers. Preserve those source distinctions rather than assigning them to the generic process identity. [S01–S02] |
| Forms, recipe links, density default, unit mappings, conversions, yields | Do not add. | No form transition or transferable household measure is supported. Research measurements remain source-specific. |
| Global or contextual substitution | Do not add. | One bun study reports formula-specific replacement trials; it does not establish a general home-recipe ratio or a validated rule. [S09] |

## Naming and product boundary

Nature’s Path / Anita’s Organic Mill currently names a Canadian-made product “Sprouted Whole Grain Light Buckwheat Flour”; its ingredient statement is organic sprouted buckwheat, and its product description says the sprouted grain is dehydrated and milled [S01]. The product page showed the multipack sold out and described it as coming back soon when checked. This is evidence for the product identity and its maker-specific process, not current stock or a universal sprouting specification.

Second Spring separately lists “Sprouted Buckwheat Flour” in Canada and describes flour made from whole sprouted buckwheat groats [S08]. Its retailer listing was out of stock at access. The two marketed products support a distinct product class while leaving producer-specific grinding, organic status, and other package claims out of the catalog identity.

Québec French naming is supported by more than a literal translation. Aliments Trigone uses the exact phrase “Farine de sarrasin germé biologique” as a French flour/recipe category on its Québec-facing germinated-buckwheat page; the page’s featured 400 g item itself is whole sprouted buckwheat, so it is wording evidence rather than proof of a flour SKU [S05]. Québec processor Farinart says its buckwheat is available plain, roasted, or germinated and whole, cracked, or ground as flour. Its sprouted-grains page states that its germinated grains, including sarrasin, may be milled into whole-grain flour [S03–S04]. Nature Santé’s Québec French-facing listing for Anita’s includes “sarrasin germé biologique” in the ingredient declaration and describes flour from sprouted grain; its product title has duplicated keyword wording, so the proposal uses the clean phrase attested by Trigone rather than copying that title [S02].

OQLF identifies sarrasin as the preferred Québec French term and notes that the seed is ground for flour, supporting the base noun in the display [S06]. The OQLF entry does not standardize a sprouted-flour phrase. The exact compound is grounded in current Québec maker and product-category usage, not presented as an OQLF term.

Do not extend this identity to buckwheat sprouts eaten fresh, sprouting seed, malted buckwheat, nixtamalized flour, prepared cereal, flakes, groats, or a mixed flour. No reviewed source supports adding those products or states as aliases.

## Live catalog, exact ownership, and picker behavior

Snapshot read from the shared working tree on 2026-10-12. Hashes cover exact file bytes. The manifest-ordered corpus fingerprint hashes each relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte.

| Surface | Live snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,327 rows; 425,002 bytes | 63fa2719dabf943f2e25c9228123a93c59655a83c8bddccb22d3921b0887e225 |
| Ingredient forms | 98 rows; 73,589 bytes | b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c |
| Legacy import candidates | 64 rows; 15,264 bytes | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| Research ledger | 1,635 records; 6,065 source entries; 5,081 distinct source IDs; 8 unit conversions; 6,025,719 bytes | 3ee094d992a4e33f69d89516cb455fab3cf8e593960912f26bc8b1c84adab835 |
| Seed manifest | 114 recipe paths; 12,011 bytes | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |
| Generated catalog | BundledIngredientCatalog.kt; 1,327 reference entries; 581,706 bytes | 9c0db1e6b92d632bd9305f5c0620ad482547e75687c82ba2106ecdc99250ccff |
| Active catalog plan | 904,112 bytes | c5039e0f497859e0a43e2618ba592280a7a9b343e9b8af28da675dab941d8bd4 |

Exact normalized ownership was checked using the picker’s case-, accent-, punctuation-, and whitespace-normalization behavior. Candidate terms were checked against active reference display names/aliases, form labels/match terms, legacy names/aliases, and research-ledger record IDs. The proposed ID was also checked against active reference IDs, form IDs, legacy IDs, and ledger record IDs.

| Exact normalized key | Active owner | Form owner | Legacy owner | Ledger record-ID owner |
|---|---|---|---|---|
| sprouted buckwheat flour | none | none | none | none |
| germinated buckwheat flour | none | none | none | none |
| farine de sarrasin germé | none | none | none | none |
| sprouted buckwheat | none as an exact key | none | none | none |
| sarrasin germé | none as an exact key | none | none | none |
| ingredient-ref-sprouted-buckwheat-flour | none | none | none | none |

The existing exact display keys buckwheat flour and farine de sarrasin belong only to ingredient-ref-buckwheat-flour. The existing grain display keys sprouted buckwheat, dried and sarrasin germé séché belong only to ingredient-ref-sprouted-buckwheat. No form has a buckwheat/sarrasin search term. The proposed identity ID is not allocated in any of the four ID namespaces, and source prefix WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012 is absent from the ledger and the reviewed proposal/batch archive.

Picker behavior was simulated against IngredientSearch.kt’s phrase-first matching and substring fallback using the proposed display and alias:

| Query | Current picker results | Results after proposed row |
|---|---|---|
| sprouted buckwheat flour | none | ingredient-ref-sprouted-buckwheat-flour |
| germinated buckwheat flour | none | ingredient-ref-sprouted-buckwheat-flour |
| farine de sarrasin germé | none | ingredient-ref-sprouted-buckwheat-flour |
| sprouted buckwheat | ingredient-ref-sprouted-buckwheat | whole-grain row and proposed flour row |
| sarrasin germé | ingredient-ref-sprouted-buckwheat | whole-grain row and proposed flour row |
| buckwheat flour | ingredient-ref-buckwheat-flour | plain-flour row and proposed flour row |
| farine de sarrasin | ingredient-ref-buckwheat-flour | plain-flour row and proposed flour row |

The shorter queries are expected to return both the generic and process-qualified products; the full proposed names distinguish flour from whole grain and sprouted from plain flour. Broad buckwheat/sarrasin searches return the broader family of references. These are phrase matches, not exact-key collisions.

## Bundled recipe demand

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned across string fields. Normalized phrase checks included sprouted buckwheat flour, germinated buckwheat flour, sprouted whole grain buckwheat flour, farine de sarrasin germé, sarrasin germé, buckwheat, and sarrasin.

- Recipe files with a candidate phrase: **0**.
- Ingredient rows with a candidate phrase: **0**.
- Direct ingredient links to ingredient-ref-buckwheat-flour or ingredient-ref-sprouted-buckwheat: **0**.

The proposal is supported by product identity and terminology evidence, not current bundled recipe demand. Add no recipe link or ingredient line.

## Measures, density, and substitution

The 2025 study by Olatoye et al. reports bulk density of 0.80 ± 0.00 g/mL for its germinated buckwheat flour sample (GBW), compared with 0.85 ± 0.04 g/mL for its whole-buckwheat control. The study used 10 kg of market-sourced buckwheat, soaked it 12 hours, germinated it for 72 hours at 30 ± 2 °C, dried it at 65 ± 2 °C for 5–6 hours, milled it, and sieved it through 0.25 mm mesh. Each treatment was tested in triplicate [S07]. This is a supported laboratory observation for that sample and method, not a portable default for Canadian commercial flour.

A Canadian retailer’s Second Spring product listing shows a serving size of 1/4 cup (40 g) for its sprouted buckwheat flour and was out of stock when checked [S08]. Keep it as a product- and retailer-specific label observation only. It does not define the volume of Anita’s flour or other sprouted buckwheat products. Do not derive a general density or unit conversion from that listing. Health Canada lists a 30 g reference amount for flour in nutrition labelling; this regulatory serving basis is not a measured volume-to-mass conversion for sprouted buckwheat flour [S10].

If this evidence is recorded in the ledger during integration, use measurementState researched_supported because a numeric observation is supported; preserve its source, sample state, processing method, reported precision, and locator. Keep defaultDensity null, unitMappings empty, and add no measure mapping, conversion, yield, or package yield.

Sturza et al. tested wheat buns with buckwheat and sprouted-buckwheat flours added at 10%, 20%, and 30% of the wheat-flour mixture. The formulation included water, salt, yeast, and either 0.2% guar gum or 0.2% Magimix bread improver; the sprouted flour was made from germinated and dried buckwheat achenes and milled to 0.6 mm. In the sensory results, a 10% sprouted-flour bun with guar gum was among the most appreciated trials [S09]. This supports a study-specific bun formulation, not an automatic replacement ratio for arbitrary recipes. If integration records this research, use substitutionResearchState blocked_pending_evidence for a reusable catalog rule, keep the study finding scoped to its tested formula, and add no global or contextual rule absent a validated recipe context.

## Proposed integration delta

If accepted:

1. Add ingredient-ref-sprouted-buckwheat-flour in FLOUR_AND_STARCH with display pair sprouted buckwheat flour / farine de sarrasin germé.
2. Add only germinated buckwheat flour as an English alias. Keep French aliases empty. Do not add the maker-specific whole-grain/light or organic phrases as aliases.
3. Keep ingredient-ref-buckwheat-flour and ingredient-ref-sprouted-buckwheat unchanged; do not model sprouting as a form of plain buckwheat flour or as a form of the whole-grain row.
4. Add source-scoped identity, measurement, and substitution research to the new ledger record if integrated. Use measurementState researched_supported for the source-specific numeric observations and substitutionResearchState blocked_pending_evidence for general rule work. Keep defaultDensity null, unitMappings empty, and add no recipe links, forms, conversions, yields, or substitution rules.
5. Leave the broad WP02 A6 checklist open.

## Source register

Sources were checked on 2026-10-12. Current product pages are cited for their wording and product scope only. Product stock, nutritional, health, dietary, and recipe claims are not treated as catalog behavior.

| ID | Source and locator | Support and limits |
|---|---|---|
| **WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S01** | Nature’s Path / Anita’s Organic Mill, [Sprouted Whole Grain Light Buckwheat Flour](https://naturespath.com/en-ca/products/sprouted-whole-grain-light-buckwheat-flour-aom-ca), Canadian manufacturer page, product description and ingredient list. | Names a Canadian-made flour from organic sprouted buckwheat; says the sprouted grain is dehydrated and milled at low temperature. Supports a product identity and this maker’s process only. Page showed a multipack sold out / coming back soon at access. |
| **WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S02** | Nature Santé, [Anita’s sprouted buckwheat flour listing](https://naturesante.ca/fr/products/62363699550), Québec French-facing retailer page, description and ingredient declaration. | Describes flour based on sprouted grain and lists organic sprouted buckwheat. Supports French-facing Canadian market wording for Anita’s product; retailer title duplicates “germe / germé” and is not copied as the display name. |
| **WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S03** | Farinart, [Sarrasin](https://farinart.ca/fr/grains/sarrasin/), Québec grain processor, product characteristics. | Says buckwheat is offered plain, roasted, or germinated and whole, cracked, or milled as flour. Supports the Québec product-state boundary and milling relationship, but does not show a SKU-specific sprouted-flour nutrition panel. |
| **WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S04** | Farinart, [Nos grains germés et maltés](https://farinart.ca/fr/our-sprouted-grains/), Québec grain processor, product-process description. | Says germinated grains, including buckwheat, can be crushed, flaked, or milled into whole-grain flour. This is producer process evidence, not a specific retail label or a universal protocol. |
| **WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S05** | Aliments Trigone / Horizon Nature, [Sarrasin Germé Biologique](https://alimentstrigone.com/pages/sarrasin-germe-biologique), Québec French-facing product page, flour category and linked recipes. | Uses the exact category phrase “Farine de sarrasin germé biologique.” The featured 400 g product on this page is whole sprouted buckwheat, so this supports local French wording, not a claim that the page’s featured item is flour. |
| **WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S06** | Office québécois de la langue française, [sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889520/sarrasin), GDT entry updated 1982. | Lists sarrasin as the preferred Québec French term and notes the seed is ground for flour. It does not standardize the sprouted-flour compound. |
| **WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S07** | Olatoye et al., [Enhancing Quality Characteristics of Buckwheat Flour: Effects of Germination and Nixtamalisation Processes](https://pmc.ncbi.nlm.nih.gov/articles/PMC12782338/), Scientifica, 2025, Table 8, §2.3, §2.7.8. | Gives germinated buckwheat flour bulk density as 0.80 ± 0.00 g/mL, n=3, with a source-specific soak/germinate/dry/mill/sieve process. It is one lab sample, not a default density or household measure. |
| **WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S08** | Healthy Planet Canada, [Second Spring Organic Sprouted Buckwheat Flour 500 g](https://www.healthyplanetcanada.com/en/grocery/gluten-free/second-spring-organic-sprouted-buckwheat-flour-500g.html), retailer product listing and nutrition panel. | Uses the exact English product phrase and lists serving size 1/4 cup (40 g). The listing was out of stock and is retailer-provided; preserve only as SKU-specific label evidence, not a general conversion. |
| **WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S09** | Sturza et al., [Influence of Buckwheat and Buckwheat Sprouts Flours on the Nutritional and Textural Parameters of Wheat Buns](https://www.mdpi.com/2076-3417/10/22/7969), Applied Sciences 10(22), 7969 (2020), methods and conclusion. | Tests 10%, 20%, and 30% flour additions in one bun formula; the 10% sprouted-flour trial with guar gum was highly rated. The recipe, grind, improver, and fermentation are study-specific; no general replacement rule follows. |
| **WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012-S10** | Health Canada, [Table of Reference Amounts for Food](https://www.canada.ca/en/health-canada/services/technical-documents-labelling-requirements/nutrition-labelling-table-reference-amounts-food.html), category C.6. | Lists 30 g as the nutrition-labelling reference amount for flour, including buckwheat flour. It is not a household volume mapping or a sprouted-flour measurement. |

## Static review and proposal checks

- Exact candidate phrase and proposed-ID ownership checked across references, forms, legacy candidates, and ledger record IDs.
- Picker query behavior checked against the current IngredientSearch.kt implementation, including expected broad-result changes.
- All manifest-listed recipe files and ingredient lines scanned; candidate phrase and direct-link counts are recorded above.
- Proposal filename and source prefix were unused at the pre-write snapshot.
- No app, unit, instrumentation, or emulator tests were run. This is a proposal-only review and changed no database JSON or application code.
- UTF-8/no-BOM and mojibake checks are recorded after saving this proposal.

## Disposition

**Integrated** the separate sprouted-buckwheat-flour identity and the one evidence-backed English synonym. The existing plain-flour and whole-grain identities remain separate, numeric and substitution evidence stays source-scoped, no runtime density/mapping or substitution rule was added, and the broader WP02 A6 item remains open.
