# WP02 B4 — Ripe banana flour versus powder product-boundary review (R278)

- **Reviewed:** 2026-10-16.
- **Status:** Accepted; integrated as a documentation-only hold. No active catalog, ledger, recipe, or generated data changed.
- **Scope:** Decide whether research-named *ripe banana flour* warrants a distinct active ingredient identity, and whether the current Canada-locale `Ripe Banana Powder` listing establishes a flour product. Keep the review limited to banana flour versus banana powder. Do not reopen green banana flour, green plantain flour, instant or pregelatinized products, isolated starch, ripe plantain flour, or mashed fresh banana.
- **Active plan anchor:** WP02 Section 04 B4, `Green-banana, plantain, breadfruit, tigernut, yam, taro, and other established regional root/fruit flours`, at [`docs/RecipeBook-global-ingredient-catalog-plan.txt#L2949`](../../RecipeBook-global-ingredient-catalog-plan.txt#L2955). This parent remains open.
- **Proposed integration README path:** `docs/catalog/batches/wp02-b4-ripe-banana-flour-product-boundary-hold-integration-r278-20261016/README.md` (path reserved for the root integrator; not created here).
- **Repository basis:** Read-only review of the current active seed package, legacy import identities, research ledger, WP02 proposals and B4 plan history, picker implementation, and all 114 manifest-listed bundled recipes. Proposal-only scope; no software tests, build, or emulator checks were run.

## Recommendation

**Hold `ripe banana flour` outside active references, aliases, forms, and the research ledger for now. Do not classify the Canada-locale retailer's `Ripe Banana Powder` product as flour.**

Primary research establishes that ripe fruit can be processed into a material called banana flour. One study prepared ripe-banana flour after different ripening periods and tested it in specific gluten-free bread formulations. That is evidence for a research material and a possible product boundary, but it does not establish a current Canadian/Québec retail flour product, a standardized ripe stage, or Québec French product wording. [S01–S02]

The current Canada-locale ZeeHERBS listing is titled and described as **Ripe Banana Powder**. Its indexed “Common Names” field also includes “Ripe Banana Flour,” but the page copy continues to describe a fully ripe fruit powder. The direct page fetch returned a cache-miss error. This listing therefore does **not** clearly name a flour product and is not evidence for a flour identity or alias. [S04]

Keep the present boundary explicit: the EAC standard covers **green/unripe banana and plantain flour**, and the FAO processing chapter distinguishes fully ripe banana-pulp powder from flour produced from green fruit. Retain separate green-banana and green-plantain identities; do not use either one for ripe banana wording, and do not extend the banana conclusion to plantain. [S03, S05; prior B4 reviews]

If a future current food-grade product page or package clearly identifies **ripe banana flour**, review it as a possible separate `FLOUR_AND_STARCH` identity, not as an alias or form of green-banana flour, green-plantain flour, fresh banana, or ripe banana powder. Require matching Québec French product wording before assigning a French display or alias. Until then, keep `ripe banana flour`, `farine de banane mûre`, `ripe banana powder`, and `banana powder` unallocated in the catalog. Keep generic `banana flour` unassigned as an alias; the picker currently resolves that query to the existing green-banana-flour row.

## Why this is a distinct next gap

R275 reviewed a separate Section A milling gap: French type-170 rye flour. The B4 parent at the anchor above remains open after prior work on green banana/plantain identity, Québec display, plantain aliases, and flour process qualifiers. The earlier B4 packet noted ripe banana powder as separate from green-banana flour, but did not adjudicate whether research-named ripe banana flour is a current commercial flour product. The B9 instant-flour review and the pregelatinized green-banana review concern process-qualified green flour, while the WP03 mashed-ripe-banana review concerns a fresh-fruit preparation. This proposal resolves only the ripe-banana flour-versus-powder question.

Related reviewed work:

- [B4 green banana and plantain flour review](wp02-b4-banana-plantain-flour-review-20261010.md)
- [B4 independent Québec display review](wp02-regional-root-flours-quebec-display-review-20261011.md)
- [Green plantain flour alias review](wp02-plantain-flour-boundary-review-20261011.md)
- [B9 instant banana flour boundary review](wp02-b9-instant-banana-flour-boundary-review-20261012.md)
- [Pregelatinized green-banana flour review](wp02-section-b-pregelatinized-green-banana-flour-process-form-review-20261012.md)
- [Mashed ripe banana form review](wp03-section-m-fruit-products-mashed-ripe-banana-form-review-20261011.md)

## Evidence and identity boundary

| Phrase or material | Recommendation | Evidence boundary |
|---|---|---|
| `ripe banana flour` | Keep unallocated; treat as a research-attested candidate phrase only. | Hosokawa et al. prepared ripe-banana flour for a specific gluten-free bread experiment. The paper does not identify a current Canadian/Québec product, retail name, or transferable formula. [S01] |
| `ripe banana powder` | Do not relabel as flour or attach to another row. | FAO describes powder made from fully ripe banana pulp by paste preparation and spray- or drum-drying. ZeeHERBS likewise titles and describes its current Canada-locale listing as powder. Those sources do not establish equivalence to flour. [S03–S04] |
| `green banana flour / farine de banane verte` | Retain the existing identity and its maturity-qualified displays. | EAS 1106:2023 scopes banana flour to green/unripe banana and plantain; a current Canadian French listing explicitly describes peeled, unripe bananas that are dried and milled. Do not broaden this row to ripe fruit. [S05–S06] |
| `green plantain flour / farine de banane plantain verte` | Retain the separate existing identity and its current aliases. | B4 source review and Canadian product evidence treat plantain as a separate source from dessert banana; the shared EAS scope does not declare the two names synonyms. Do not transfer this banana-only review to ripe plantain. [S05; prior B4 and plantain reviews] |
| `farine de banane` | Keep unassigned as a new alias. | OQLF's 1982 GDT record pairs it with *banana meal* and discusses fruit of more than one maturity. It does not establish a current Québec label for ripe banana flour or a modern powder/flour equivalence. [S07] |
| `mashed ripe bananas / purée de bananes mûres` | Retain only as the existing preparation form under fresh banana. | This is the recipe-linked mashed-fruit form; it is not flour, powder, or a commercial purée identity. See the separate WP03 review. |

This recommendation does not infer that ripe banana flour is physically impossible, or that every market uses *flour* and *powder* consistently. It limits catalog ownership to products whose source and product wording are clear enough to distinguish the existing green-flour row from ripe-fruit powder.

## Current ownership, history, and archive audit

| Surface | Current state | Decision for this review |
|---|---|---|
| Active `ingredient-ref-banana` | `banana / banane`, category `FRUIT`; French alias `bananes`; no density or unit mappings. | Keep as fresh fruit. Do not add flour or powder aliases. |
| Active `ingredient-ref-green-banana-flour` | `green banana flour / farine de banane verte`, category `FLOUR_AND_STARCH`; no aliases, density is null, unit mappings are empty. | Keep maturity explicit; do not attach ripe terms. |
| Active `ingredient-ref-green-plantain-flour` | `green plantain flour / farine de banane plantain verte`, category `FLOUR_AND_STARCH`; current aliases `plantain flour` and `farine de plantain`; no density or unit mappings. | Preserve the separate plantain identity and aliases. Do not expand them to banana. |
| Active `ingredient-ref-plantain` | `plantain banana / banane plantain`, category `FRUIT`; no flour aliases, density, or mappings. | Keep separate from banana and both flour rows. |
| Active `ingredient-ref-resistant-green-banana-starch` | `resistant green banana starch / amidon résistant de bananes vertes`, category `FLOUR_AND_STARCH`; no aliases, density, or mappings. | Keep isolated starch separate from flour and powder. |
| Forms | The only relevant form is `ingredient-form-banana-mashed-ripe`, attached to fresh banana and linked to recipe 073#10. Neither green-flour row has a form. | Add no ripe-flour form to fruit or green flour. |
| Research ledger | Green banana and green plantain flour are verified identity records; their measurement and substitution states remain `not_yet_researched`. The ripe-mashed-banana form is a separate verified record. No ripe-banana-flour or ripe-banana-powder candidate/decision is present. | Create no record or source entry from this review. |
| Legacy import identities | No candidate name or alias owns `ripe banana flour`, `ripe banana powder`, `banana flour`, `banana powder`, or `farine de banane mûre`. | Keep all reviewed ripe terms unassigned. |
| Related WP02 archive | B4 covers green banana/plantain flour and flags ripe powder as a separate boundary; the plantain alias review, instant-flour review, and pregelatinized-flour review address different questions. No prior proposal specifically adjudicates ripe banana flour as a commercial identity versus powder. | This packet is a new narrow review, not a re-review of green/plantain or instant flour. |

No catalog row, alias, form, legacy candidate, or ledger decision is proposed. Source IDs below use the new proposal-local prefix `WP02-B4-RIPE-BANANA-FLOUR-R278-20261016`; a repository search found no prior occurrence. They are not ledger IDs and are not to be copied into the ledger by this proposal.

## Picker audit

The ingredient picker searches bilingual reference names and aliases, plus forms, using complete normalized word phrases before substring fallback (`IngredientSearch.kt`). These results are a static replay of the current implementation against the live references and forms; no app test or emulator run was performed.

| Query | Current result | Recommendation |
|---|---|---|
| `ripe banana flour` | No result. | Keep unallocated. |
| `farine de banane mûre` | No result. | Do not invent a Québec alias. |
| `ripe banana powder` | No result. | Do not add a powder alias under a flour or fruit row. |
| `banana powder` | No result. | Leave unresolved. |
| `banana flour` | `ingredient-ref-green-banana-flour` | Preserve current behavior; do not broaden ownership. |
| `green banana flour` / `farine de banane verte` | `ingredient-ref-green-banana-flour` | Retain. |
| `green plantain flour` / `plantain flour` / `farine de banane plantain verte` | `ingredient-ref-green-plantain-flour` | Retain; keep plantain distinct. |
| `mashed ripe bananas` | `ingredient-ref-banana` via its form | Retain as a fresh-fruit preparation only. |

If a new `ripe banana flour` row were added now, the broad query `banana flour` would match both that display and `green banana flour`. A new alias on the green-flour row would instead make ripe flour resolve to a product whose current identity is explicitly green/unripe. Neither assignment is supported by the evidence reviewed here.

## Bundled recipe demand

The manifest lists 114 recipes with 1,123 ingredient rows. All ingredient rows were checked for direct phrase and reference-ID demand; a search of the recipe files found no full-text matches for ripe banana flour, banana flour, green banana flour, green plantain flour, ripe banana powder, banana powder, or their reviewed French phrases.

- Candidate ripe banana flour or powder: **0 ingredient rows**.
- Green banana flour, green plantain flour, or resistant green banana starch: **0 linked ingredient rows**.
- Fresh banana: **3 direct lines across 2 recipes**: one over-ripe banana, one optional banana-slice topping, and three bananas mashed in recipe 073. The last line links to `ingredient-form-banana-mashed-ripe`.
- Fresh plantain: **0 direct lines**.

These fruit lines do not establish demand for ripe flour or powder, a maturity threshold for flour, or a conversion from mashed banana. Add no recipe link, relink, or text change.

## Forms, measurements, conversions, and substitutions

- **Forms:** No form belongs to either active green-banana or green-plantain flour. The mashed-ripe-banana form is attached to fresh fruit and already states that it establishes no measure, density, conversion, yield, or substitution. Add no form for ripe flour or powder.
- **Measurements and yields:** The two active flour rows have `defaultDensity: null` and empty `unitMappings`; no ripe flour or powder measurement record exists. `large banana` is a fruit count unit, not a flour measure. The current package-yield file contains no banana or plantain entry. Hosokawa's 10% flour use and study water levels belong to its specific experimental bread formulas; they are not reusable measures, yields, or general product specifications. Record no numeric values.
- **Conversions:** No current mapping converts green flour, ripe flour, powder, mashed banana, or starch. Do not create a flour-to-powder conversion, fruit-to-flour yield, or green-to-ripe conversion from the cited material.
- **Substitutions:** Neither global nor contextual substitution packages contain a banana/plantain rule. Hosokawa's recipe-specific gluten-free trial does not authorize a general wheat-flour or green-banana-flour substitution. Add no global rule, dish-scoped rule, or recipe-line substitution link.

## Proposed delta and reopening condition

**Current proposed delta: none.** Keep active references, aliases, forms, picker behavior, recipe links, measurements, conversions, substitutions, ledger, legacy candidates, and generated files unchanged. Keep the B4 checklist open.

Reopen only when a current food-grade manufacturer, package, or Canadian/Québec retail listing clearly identifies **ripe banana flour** as the product, rather than a powder listing with “ripe banana flour” only in a common-name field. Confirm its source fruit and product composition, then obtain product-matched Québec French wording. If those conditions are met, assess a separate identity and re-audit the `banana flour` picker collision before integration. Keep any ripe plantain decision separate.

## Proposal-local source register

Sources were accessed on 2026-10-16. These IDs are unique to this proposal and were not written to the research ledger.

| ID | Source and evidence | Limits |
|---|---|---|
| **S01 — `WP02-B4-RIPE-BANANA-FLOUR-R278-20261016-S01`** | Hosokawa, Ohishi, Ikeda, and Inagaki, [“Properties of ripe banana flour and application to gluten-free breadmaking”](https://onlinelibrary.wiley.com/doi/abs/10.1111/jfpp.14789), *Journal of Food Processing and Preservation* 44 (2020), e14789. The abstract says ripe-banana flour was prepared after different ripening periods and tested in specific starch/cereal bread formulations. | Primary research material and formulation-specific results; not a Canadian retail product, market taxonomy, Québec name, general substitution, or household measure. |
| **S02 — `WP02-B4-RIPE-BANANA-FLOUR-R278-20261016-S02`** | Campuzano, Rosell, and Cornejo, [“Physicochemical and nutritional characteristics of banana flour during ripening”](https://www.sciencedirect.com/science/article/pii/S0308814618303510), *Food Chemistry* 256 (2018), 11–17. The paper studies flour properties across ripening stages. | Research on prepared experimental material; direct page access returned 403 in this review. It does not establish a retail product or standardized ripe-flour class. |
| **S03 — `WP02-B4-RIPE-BANANA-FLOUR-R278-20261016-S03`** | FAO, [*Fruit and Vegetable Processing*, Chapter 8](https://www.fao.org/4/V5030E/V5030E0O.HTM), §§8.8.2.2.4–8.8.2.2.5. It describes banana powder made from fully ripe pulp and separately describes flour made from green fruit. | Older technical processing chapter; supports the process boundary stated there, not a current Canadian product label or the full diversity of current market terminology. |
| **S04 — `WP02-B4-RIPE-BANANA-FLOUR-R278-20261016-S04`** | ZeeHERBS, [“Ripe Banana Powder”](https://www.zeeherbs.com/en-ca/products/ripe-banana-powder), Canada-locale listing. The indexed page names the item and product throughout as ripe banana powder, describes fully ripened bananas, and lists “Ripe Banana Flour” only under “Common Names.” | Direct page fetch returned a cache-miss error; the indexed product metadata and copy are available. The alternate common-name field does not clearly name a flour product and is not used to support flour identity. |
| **S05 — `WP02-B4-RIPE-BANANA-FLOUR-R278-20261016-S05`** | East African Community, [EAS 1106:2023 entry in the 2025 Standards Catalogue](https://www.eac.int/documents?controller=download&file=177480db-3520-4d76-b686-1a6e0438a997&name=EAC+STANDARDS+CATALOGUE+2025.pdf&task=download.file). The entry scopes the standard to green/unripe banana and plantain flour. | Regional standard scope; it does not define ripe banana flour, Canadian requirements, or synonymy between banana and plantain. |
| **S06 — `WP02-B4-RIPE-BANANA-FLOUR-R278-20261016-S06`** | OnlineOrganics Canada, [*Farine de bananes vertes biologique*](https://onlineorganics.ca/fr/products/farine-de-bananes-vertes-biologique). The current Canadian French listing describes flour made from peeled, unripe bananas that are dried and milled. | Supports the existing green-banana-flour boundary and wording only; it is not ripe-banana-flour evidence. |
| **S07 — `WP02-B4-RIPE-BANANA-FLOUR-R278-20261016-S07`** | Office québécois de la langue française, [*farine de banane* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489070/farine-de-banane), last updated 1982. It pairs the term with *banana meal* and notes flour made from somewhat riper fruit. | Historical terminology and description; does not establish a contemporary Québec product label, a ripe/green threshold, or equivalence to the current retail powder. |
