# WP03 Section I — coconut product boundary review

- **Reviewed:** 2026-10-09
- **Status:** proposal only. No shared catalog, ledger, recipe, plan, checklist, generated file, or test was changed.
- **Scope:** Section I checklist line 1347: fresh coconut; dried/desiccated, shredded/flaked, toasted, sweetened/unsweetened coconut; and coconut butter.
- **Plan state:** Section I remains open. This review covers one checklist line and does not close the section.
- **Recommendation:** retain the two active coconut identities, make the exact cut and sweetening states searchable as forms where recipe text supports them, remove three overbroad aliases from the shredded reference, and add an identity-only coconut-butter reference. Defer a generic dried-coconut form and any fresh-only distinction until recipe text requires them.

## Dispositions

| Checklist product | Live state and exact demand | Coordinator disposition |
|---|---|---|
| Fresh coconut / coconut flesh | Existing ingredient-ref-coconut, coconut / noix de coco, with French alias chair de noix de coco. No row explicitly says fresh coconut or coconut meat. | Keep the current identity and alias. Do not create a separate fresh-coconut identity or form: the checklist is describing the same coconut fruit/flesh, and no fresh-only line distinguishes it. OQLF defines noix de coco as the fruit; the Canadian food specification separately describes edible pulp/flesh. The existing alias already signals the culinary flesh sense. |
| Generic dried/desiccated coconut | No ingredient row asks for generic dried/desiccated coconut without a cut. The shredded reference currently owns desiccated coconut and noix de coco séchée. | Defer a generic dried form. Those terms refer to a dried product family that includes more than shredded cut; do not attach them to the narrower shredded reference. Remove the two aliases from ingredient-ref-shredded-coconut pending a recipe that names the generic dried product. |
| Shredded coconut | Existing ingredient-ref-shredded-coconut, shredded coconut / noix de coco râpée; four rows, split between sweetened and unsweetened products. | Keep this reference and its direct bilingual display names. Add sweetened and unsweetened forms under this reference, using the full product phrases as match terms. Do not add coco râpé as a generic alias: the OQLF entry is specifically a dried grated product to which sugar is added. |
| Flaked coconut | Three recipe rows are linked to ingredient-ref-coconut and carry flaked in the preparation. | Keep the coconut identity and represent flaked as a form of it, not as a second coconut identity. Use flaked coconut / noix de coco en flocons. Remove noix de coco en flocons from the shredded reference and assign that exact French phrase to the flaked form. The Canadian specification describes flakes as larger, coarser pieces than shredded coconut. |
| Toasted coconut | One row says toasted coconut without naming a cut or sweetener. | Add a toasted form under ingredient-ref-coconut with the source-backed pair toasted coconut / noix de coco grillée. Link only the explicit toasted row. Do not infer that it is shredded, flaked, or unsweetened. |
| Toasted coconut flakes | Two rows explicitly say toasted coconut flakes and retain toasted in preparation, with flakes in notes. | Use the flaked form and keep toasted in the existing preparation field. Add toasted coconut flakes as an English match term so the explicit product is found in search. The line has two independent qualifiers; preserve them separately instead of inventing a new identity. |
| Sweetened/unsweetened shredded coconut | Two sweetened and two unsweetened rows already link to ingredient-ref-shredded-coconut. | Add one form for each state: shredded coconut, sweetened / noix de coco râpée sucrée; and shredded coconut, unsweetened / noix de coco râpée non sucrée. Keep the recipe wording and originalText. DND describes both states as available; Codex excludes sugared products from its desiccated-coconut standard, so do not use generic desiccated aliases for them. |
| Coconut butter | No active reference, form, legacy candidate, or recipe line. | Add identity-only ingredient-ref-coconut-butter, coconut butter / beurre de noix de coco, category FAT_AND_OIL to follow the existing nut-butter grouping. A Québec retailer labels an Artisana product beurre de coco and describes it as purée de noix de coco entière; Health Canada also uses beurre de noix de coco. Keep beurre de coco as the only proposed French alias, scoped to the culinary spread. Do not merge it with coconut oil, coconut milk, cream of coconut, or the separate coconut-cream checklist item. |

The proposed coconut-butter identity is limited to edible coconut flesh ground into a spread. The manufacturer evidence below supports that product boundary for the documented product; it does not show that every product marketed as coconut butter has the same ingredients. Do not alias coconut manna, coconut cream, cream of coconut, or coconut oil without separate product evidence.

Proposed form records, if accepted:

| Proposed form ID | Parent reference | English / French label | Exact line demand |
|---|---|---|---|
| ingredient-form-coconut-flaked | ingredient-ref-coconut | flaked coconut / noix de coco en flocons | 006#6, 026#5, 058#12, 081#2, 081#6 |
| ingredient-form-coconut-toasted | ingredient-ref-coconut | toasted coconut / noix de coco grillée | 058#16 |
| ingredient-form-shredded-coconut-sweetened | ingredient-ref-shredded-coconut | sweetened shredded coconut / noix de coco râpée sucrée | 035#1, 114#19 |
| ingredient-form-shredded-coconut-unsweetened | ingredient-ref-shredded-coconut | unsweetened shredded coconut / noix de coco râpée non sucrée | 067#5, 070#11 |

For the flaked form, include toasted coconut flakes as an additional English match term. Keep toasted in preparation for 081#2 and 081#6. No form is proposed for generic dried coconut or fresh coconut.

## Live catalog, form, ledger, and legacy audit

The active catalog has five coconut-named references:

| ID | Current English / French names | Existing aliases and state |
|---|---|---|
| ingredient-ref-coconut | coconut / noix de coco | French alias chair de noix de coco; density null; no unit mappings; category FRUIT |
| ingredient-ref-shredded-coconut | shredded coconut / noix de coco râpée | English alias desiccated coconut; French aliases noix de coco en flocons and noix de coco séchée; density null; no unit mappings; category BAKING_MIXIN_AND_PANTRY |
| ingredient-ref-coconut-milk | coconut milk / lait de coco | Separate exact identity; canned-product aliases; density null; no unit mappings |
| ingredient-ref-coconut-oil | coconut oil / huile de coco | Separate exact identity; density null; no unit mappings |
| ingredient-ref-cream-of-coconut | cream of coconut / crème de noix de coco | Separate sweetened product identity; no coconut-butter equivalence |

There are no coconut-named forms among the 32 current forms and no coconut-related candidate among the 97 legacy candidates. There is no coconut-butter identity or form. The current ledger has source-free, unreviewed records for coconut, shredded coconut, coconut milk, coconut oil, and cream of coconut. The shredded-coconut measurement state is blocked pending evidence; coconut and cream of coconut are not yet researched. No source entries currently support these coconut records. The proposed sources in this report have not been added to the shared ledger.

The existing coconut milk, coconut oil, and cream-of-coconut IDs remain outside this row’s proposed edits. OQLF defines culinary coconut milk as a mixture made from coconut flesh and water; that is a distinct liquid product. A recipe line for cream of coconut is also not evidence for coconut butter or for unsweetened coconut cream. The separate plan item about coconut cream versus cream of coconut remains open.

## Exact recipe demand and link implications

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were audited. Search covered each row’s originalText, ingredientName, preparation, notes, and ingredientRefId. Ten rows use the products in this checklist line:

| Recipe position | Exact line | Current reference | Proposed link treatment |
|---|---|---|---|
| 006#6 | 120 g flaked coconut | ingredient-ref-coconut | Keep reference; add flaked form. |
| 026#5 | 1 1/3 cups flaked coconut | ingredient-ref-coconut | Keep reference; add flaked form. |
| 035#1 | 396 g sweetened shredded coconut | ingredient-ref-shredded-coconut | Keep reference; add sweetened form. |
| 058#12 | 1 cup flaked coconut | ingredient-ref-coconut | Keep reference; add flaked form. |
| 058#16 | 1/2 cup toasted coconut | ingredient-ref-coconut | Keep reference; add toasted form; do not infer cut or sweetener. |
| 067#5 | 1/2 cup unsweetened shredded coconut | ingredient-ref-shredded-coconut | Keep reference; add unsweetened form. |
| 070#11 | 1/2 cup unsweetened shredded coconut | ingredient-ref-shredded-coconut | Keep reference; add unsweetened form. |
| 081#2 | 1 cup toasted coconut flakes | ingredient-ref-coconut | Keep reference; add flaked form and retain toasted preparation. |
| 081#6 | 1 cup toasted coconut flakes | ingredient-ref-coconut | Keep reference; add flaked form and retain toasted preparation. |
| 114#19 | 2 cups sweetened shredded coconut | ingredient-ref-shredded-coconut | Keep reference; add sweetened form; retain its note. |

This proposal does not require changing the current ingredientRefId values. If forms are accepted, populate only the single ingredientFormId on each listed line; retain originalText and existing preparation/notes. The flaked form’s match terms should include flaked coconut, coconut flakes, noix de coco en flocons, and the exact toasted coconut flakes phrase. The toasted qualifier for recipes 081#2 and 081#6 stays in preparation; the form field cannot replace that second qualifier.

Five other coconut-product rows were found but are already linked to separate product references: coconut oil at 022#6; canned coconut milk at 070#10, 086#13, and 095#2; and cream of coconut at 081#12. Keep those rows out of any coconut flesh, flakes, or butter relink. No row asks for generic dried coconut, fresh coconut, coconut butter, coconut meat, or unsweetened/sweetened coconut without the shredded qualifier.

## Search normalization and phrase collisions

The exact-key audit mirrors IngredientSearch.kt: lowercase with Locale.ROOT; apply Unicode NFKD; fold œ to oe, æ to ae, and ß to ss; expand ampersand to “and”; remove Unicode combining marks; replace runs outside ASCII a–z and 0–9 with spaces; trim and collapse spaces. The search index first returns exact form-term owners, then complete normalized word-phrase matches, then substring matches if no complete phrase is found. I compared reference names and aliases, form labels and match terms, and legacy names and aliases.

| Query | Current exact owner / phrase-level result | Recommended handling |
|---|---|---|
| coconut | Exact owner ingredient-ref-coconut. Phrase results also include coconut milk, coconut oil, cream of coconut, and shredded coconut. | Keep the base identity; broad search is expected to return several coconut products. |
| noix de coco | Exact owner ingredient-ref-coconut. Phrase results include the base identity, shredded coconut, and cream of coconut. | Keep the qualified product labels separate; this phrase is broad. |
| shredded coconut / noix de coco râpée | Exact owner ingredient-ref-shredded-coconut. | Retain the canonical product names. Add only cut- and sweetener-specific form terms. |
| desiccated coconut / noix de coco séchée | Exact owner ingredient-ref-shredded-coconut through its current aliases. | Remove these aliases from the narrower shredded identity. The sources use them for dried coconut as a family, not a synonym uniquely naming shredded cut. |
| noix de coco en flocons | Exact owner ingredient-ref-shredded-coconut through its current alias. | Remove from shredded coconut and use as the French match term for the flaked form. |
| flaked coconut / coconut flakes / toasted coconut / toasted coconut flakes | No exact current reference or form owner. | Add only the proposed forms and match terms backed by recipe wording and the Canadian specification. |
| sweetened shredded coconut / unsweetened shredded coconut | No exact or complete phrase owner in the current catalog. | Add explicit sweetened and unsweetened forms; do not make them separate ingredient identities or broad aliases. |
| dried coconut / noix de coco déshydratée | No exact current reference or form owner. | Defer these broad drying terms until an unqualified recipe line requires them. |
| fresh coconut / coconut meat / chair de noix de coco | The first two have no exact owner; chair de noix de coco is an exact alias of ingredient-ref-coconut. | Keep the current French alias; do not add a fresh-only identity without recipe demand. |
| coconut butter / beurre de coco / beurre de noix de coco | No exact current reference, form, or legacy owner. | Add only the proposed culinary coconut-butter identity and supported French alias. |
| coconut milk / coconut oil / cream of coconut | Each has its own exact active reference. | Preserve the separate product identities. |
| coconut cream | No exact active owner; cream of coconut is a separate exact owner. | Leave this phrase to the separate plan item; do not add it as a coconut-butter alias. |

The whole-phrase search and fallback can return related products for short queries such as coconut. That is a search result relationship only; it does not justify an alias, form, conversion, or product substitution. No exact coconut-related legacy candidate or form collision exists at this snapshot.

## Measurement and substitution limits

The recipe lines contain product-specific quantities, not a reusable measure table. The 396 g sweetened-shredded line is in a different recipe from the 2 cups sweetened-shredded line; the 120 g flaked line is separate from the cup-measured flaked lines and does not identify the same brand, cut, filling method, or source basis. Do not derive a shared grams-per-cup value from recipes. The other coconut lines are volume or package measures without a paired mass observation.

Do not add a default density, cup-to-gram mapping, tablespoon measure, count weight, package yield, fresh-to-dried yield, flaked-to-shredded conversion, toasting or sweetening ratio, or coconut-butter conversion. Codex sieve specifications describe particle-size grading, not kitchen volume. Health Canada’s 15 g coconut-butter reference amount is for nutrition-label serving rules, not a recipe conversion. The existing forms carry no density. Do not create global form conversions or ingredient substitutions among fresh flesh, dried products, coconut oil, coconut milk, cream of coconut, coconut cream, and coconut butter. The products differ in water, fat, cut, and added-sugar state; no source reviewed here establishes an interchangeable cooking role or ratio.

## Evidence map and limits

Sources were accessed 2026-10-09. Proposal-local IDs below are not shared-ledger source IDs.

| ID | Source | What it supports and limits |
|---|---|---|
| WP03-COCO-20261009-S01 | Department of National Defence, [Food Quality Specifications, French edition, paragraphs 47–48](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-20-2018-fra.pdf) | Direct Canadian French product vocabulary: noix de coco déshydratée may be râpée or en flocons; râpée is thin strands, can be fine or medium, and is sold sweetened or unsweetened; flakes are larger/coarser pieces; unsweetened shredded coconut is also available toasted. The source is a 2018 procurement specification. It supports product terminology and distinctions, not universal retail composition or kitchen measurements. |
| WP03-COCO-20261009-S02 | FAO/WHO Codex, [CXS 177-1991, Standard for Desiccated Coconut](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS%2B177-1991%2FCXS_177e.pdf); [Codex current standards list](https://www.fao.org/fao-who-codexalimentarius/codex-texts/list-standards/tr/) | Defines desiccated coconut from white coconut kernel and permits different sizes, including flakes, chips, and shreds. The standard excludes salted, sugared, flavoured, or roasted products. Codex lists this standard as amended/modified in 2023. It supports the broad dried-product and cut boundary, not a consumer alias rule or culinary conversion. |
| WP03-COCO-20261009-S03 | OQLF, [noix de coco](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084073/noix-de-coco) | Pairs noix de coco and coconut and defines the French term as the fruit of the coconut palm; entry dated 1990. It is botanical vocabulary, not a description of recipe-ready cut or freshness. |
| WP03-COCO-20261009-S04 | OQLF, [noix de coco séchée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497851/noix-de-coco-sechee) | Pairs noix de coco séchée with desiccated coconut; entry updated 1984. It supports a broad dried-product term and not an alias unique to shredded cut. |
| WP03-COCO-20261009-S05 | OQLF, [coco râpé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17021264/coco-rape) | Pairs coco râpé with coconut rasps and defines it as dried grated kernel to which sugar is added; entry updated 1991. Because it is sugar-qualified, do not use it as a universal alias for sweetened and unsweetened shredded coconut. |
| WP03-COCO-20261009-S06 | OQLF, [noix de coco grillée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18075624/noix-de-coco-grillee) | Pairs noix de coco grillée and toasted coconut; entry dated 1982. Supports the bilingual toasted-state label, but does not specify cut, sweetness, or a standard process. |
| WP03-COCO-20261009-S07 | OQLF, [lait de coco](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26523378/lait-de-coco) | Describes culinary coconut milk as a mixture involving coconut flesh and water and separates it from coconut beverage and coconut water. Supports keeping the existing milk product distinct; not a recipe measurement. |
| WP03-COCO-20261009-S08 | Health Canada, [Reference amounts for food](https://www.canada.ca/content/dam/hc-sc/healthy-canadians/migration/eating-nutrition/label-etiquetage/regulatory-guidance-directives-reglementaires/reference-amounts-food-quantites-reference-aliments/alt/reference-amounts-food-quantites-reference-aliments-fra.pdf) | Uses beurre de noix de coco in a nutrition-labelling category for nut butters and substitutes and gives a 15 g reference amount. This supports Canadian French product-category wording only. The reference amount is not a density, recipe serving recommendation, or tablespoon-to-gram conversion. |
| WP03-COCO-20261009-S09 | Marché Tau, Québec retailer, [Artisana organic raw coconut butter listing](https://marchestau.com/beurre-de-coco-cru-bio-397gr) | The product listing uses beurre de coco cru bio and purée de noix de coco entière. This is local retail wording for one named product, not an OQLF ruling or proof that every “coconut butter” product has one composition. |
| WP03-COCO-20261009-S10 | Mahalo Brands, [coconut butter product description](https://www.mahalobrands.com/) | Manufacturer describes its coconut butter as whole coconut meat ground into a creamy spread and distinguishes it from extracted coconut oil. This supports the identity boundary for the manufacturer’s products; the page also discusses flavored products, so it does not establish one universal ingredient list or measurements. |

I did not locate an OQLF coconut-butter entry in the targeted search. The proposed French display therefore relies on Health Canada’s wording, with beurre de coco retained only as a Québec retailer-attested alias. The local label is useful product evidence but is not a preferred-term ruling.

## Exact snapshot and verification

Snapshot date: **2026-10-09**. Hashes pin the inspected working-tree state; repeat the audit before integration if shared files change.

| Inspected item | Count | SHA-256 |
|---|---:|---|
| app/src/main/assets/seed/bundled-library/manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 509 references | 074c4381a10e397cbb289cb732b989496eb826e377a494f1451b7546e9777083 |
| app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 32 forms; 0 coconut forms | 02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca |
| docs/catalog/legacy-import-identities.v1.json | 97 candidates; 0 coconut candidates | 0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80 |
| docs/catalog/research-ledger.v1.json | 689 records; 1,119 source entries | e7f3afcaa8ac751c594e1cdf264cea6e4d8c10ea5b4e41f66050977d7bdccd9a |
| Manifest-ordered recipe corpus; each relative path, NUL, exact bytes, NUL | 114 recipes; 1,123 ingredient rows | 31139675c0a2f37863a57e2e45e8df203b0255b11e12cf54f1df944cdd426890 |
| docs/RecipeBook-global-ingredient-catalog-plan.txt | Plan line 1347 reviewed | a6c452d589b757ee4e51a66053785f9b9a3583351ad55c5c33bf9d2247870157 |

**Tests:** not run; this was proposal-only research. The assigned Markdown file was checked for UTF-8 without BOM and trailing whitespace after writing. No test status is implied by those document checks.

## Coordinator follow-up

1. Repeat the file-hash and recipe-line audit at integration; the shared package may change between this review and catalog edits.
2. Keep the active coconut and shredded-coconut IDs. Remove desiccated coconut, noix de coco séchée, and noix de coco en flocons from the shredded-reference aliases.
3. If the coordinator accepts forms, add only the flaked, toasted, sweetened-shredded, and unsweetened-shredded forms described above. Link the ten explicit product rows through their ingredientFormId while preserving all reference IDs and the line-level preparation/notes. Keep toast and cut as separate qualifiers when both are present.
4. Add ingredient-ref-coconut-butter as an identity-only row with the bounded bilingual names and category described above. Add no density, unit mapping, form, package yield, or substitution.
5. Keep generic dried coconut, fresh-only product naming, coconut cream, and other Section I identities open for their separate plan reviews. This proposal is one bounded row review; Section I remains incomplete.
