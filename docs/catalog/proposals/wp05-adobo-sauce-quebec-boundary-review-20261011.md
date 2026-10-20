# WP05 Section Z: Mexican adobo sauce identity and Québec boundary review

## Scope and status

- **Review and source-access date:** 2026-10-11.
- **Scope:** Review the open WP05 “adobo sauces” item for a narrow Mexican chile-based sauce identity. This is a proposal only; no seed, ledger, plan, roadmap, recipe, code, test, batch, or README file is changed.
- **Exclusions set by the task:** chipotle in adobo as a packaged pepper-and-sauce product; achiote paste; dry adobo seasoning; a marinade or recipe-defined mixture without a separately identified sauce product; and prepared adobo dishes.
- **Proposal-local source IDs:** `WP05-ADOBO-SAUCE-QC-20261011-S01` through `S13`. These IDs are local to this document, not research-ledger IDs. They were checked against the live ledger and proposal/batch files before assignment.

## Recommendation

**Accept an identity-only, Mexican adobo sauce candidate, with a provisional French display and a narrow scope.** Current dictionary, government, manufacturer, and Canadian retail evidence distinguishes a Mexican chile-based sauce from dry seasoning, a paste-state product, chipotles packed in adobo, and Filipino adobo products. Current Canadian sources include a standalone product sold as **Adobo Sauce** and a manufacturer’s **Adobo Rico** Mexican-style braising sauce. They do not establish one canonical recipe or a Québec French name for that standalone sauce family. [S01–S05]

| Field | Recommendation |
|---|---|
| Candidate ID | `ingredient-ref-mexican-adobo-sauce` (not present in the inspected seed, ledger, proposals, or batches) |
| Category | `SAUCE_AND_CONDIMENT` |
| English display | `Mexican adobo sauce` |
| Québec French display | `sauce adobo mexicaine` — provisional wording only; no standalone Québec French product label or OQLF definition for this product state was found |
| Aliases | None proposed |
| Forms, measurements, mappings, recipe links, conversions, yields, and substitutions | None |

The candidate covers a separately identified, prepared Mexican-style chile sauce sold or named as adobo sauce. It is a product identity, not a universal formulation: the sources include both a roasted pasilla/ancho chile, garlic, vinegar, and oil sauce and a richer retail sauce that also uses stock, wine, tomato, and several chiles. [S02–S05]

The name must retain the regional qualifier. The OQLF entry privileges **adobo** but defines it as a spicy marinade and notes a Filipino dish sense; it does not establish a Mexican sauce product term. The dictionary of El Colegio de México separately records a Mexican sauce sense and a meat dish cooked in that sauce. Therefore bare `adobo` is not proposed as an alias, and `sauce adobo mexicaine` is not presented as settled Québec terminology. [S01–S02]

## Live catalog, ledger, plan, and recipe audit

- The WP05 Section Z checklist at `docs/RecipeBook-global-ingredient-catalog-plan.txt` still leaves “adobo sauces” open beside mole pastes, achiote paste, chipotles in adobo, and other regional condiments. A separate spice checklist also leaves generic dry `adobo` seasoning open; this proposal does not resolve that spice item.
- The live seed contains 967 ingredient references. It has no standalone adobo-sauce, adobo-paste, achiote, or annatto reference. Relevant existing IDs are `ingredient-ref-chipotle-in-adobo` (`chipotle in adobo` / `chipotle en adobo`) and `ingredient-ref-mole-paste` (`mole paste` / `mole en pâte`); both have empty alias lists and neither has density or unit mappings.
- The [ledger record](../research-ledger.v1.json) for `ingredient-ref-chipotle-in-adobo` marks identity verified and measurement blocked pending evidence. Its cited product source (`WP04-CHIPOTLE-COUNT-20261010-S02`) describes dried, smoked jalapeño peppers packed in sauce; the [WP04 count follow-up](wp04-count-portion-next-candidate-review-20261010.md) leaves the one-pepper line unchanged and does not establish a pepper mass or pepper-to-sauce amount. Do not split off or relink the sauce portion from that compound product. [S06] The accepted `ingredient-ref-mole-paste` record and current Doña María product page place **Mole Adobo** among mole-paste products, so that name is not an adobo-sauce alias; see the [WP05 mole-paste review](wp05-mole-paste-quebec-boundary-review-20261011.md) and its manufacturer source (`WP05-MOLE-PASTE-IDENTITY-20261011-S05`). [S10]
- The prior [WP06 Mexico/Central America sweep](wp06-mexico-central-america-gap-sweep-20261009.md) retains chipotle in adobo as an existing compound identity and does not propose a generic adobo-sauce identity. This proposal preserves that boundary.
- I scanned all 114 manifest-listed recipe files and 1,123 ingredient rows. Exactly one ingredient row matches `adobo`, `achiote`, `annatto`, or `recado`: recipe `007-haricots-pinto-refrits-refried-pinto-beans-4392bc3d-9785-43ac-b98e-496f96c1d628.v1.json`, ingredient ID `4392bc3d-9785-43ac-b98e-496f96c1d628-ingredient-3`, original text `1 chipotle in adobo, minced`, mapped to `ingredient-ref-chipotle-in-adobo`. There is no standalone adobo-sauce line. Mentions in the recipe’s description and instructions refer to the same compound product; they are not additional demand or a reason to relink it.

## Product-state and collision boundaries

| Evidence or neighbor | Boundary decision |
|---|---|
| Mexican chile-based adobo sauce | Include only a separately identified wet sauce/condiment in the Mexican adobo sense. COLMEX defines the sauce with diverse chiles, oil, vinegar, herbs, and spices; current product pages show the category can have differing formulas. Do not infer a single recipe, heat level, ingredient list, or interchangeability. [S02–S05] |
| `chipotle in adobo` / `chipotle en adobo` — `ingredient-ref-chipotle-in-adobo` | Keep the canned or otherwise packaged chipotle-pepper-in-adobo product together under its existing identity. A recipe line explicitly naming that compound item remains there, even if its preparation mentions mincing or if a source describes the liquid sauce separately. Do not alias the pepper-in-sauce product to this standalone sauce candidate. [S06, S11, S13] |
| La Costeña `Chipotles adobados` | The Mexican manufacturer places this product under peppers and describes its chipotles in adobo. It is not evidence of a separate sauce-only SKU. [S06] |
| La Costeña `Adobo Paste` / retailer `Pâte d’adobo` | Keep paste-state product listings distinct from a sauce-state identity. The Canadian La Costeña product page lists `Adobo Paste` and the Québec Maxi listing uses `Pâte d’adobo`; those exact names establish a paste product state, not equivalence with the sauce candidate. No conversion or alias is proposed. [S07–S08] |
| Doña María `Mole Adobo` | Keep under the existing mole-paste scope. The manufacturer lists it in the mole-paste group separately from ready-to-serve mole. Do not use `Mole Adobo` as an alias for adobo sauce. [S10] |
| Filipino adobo cooking sauce or Filipino adobo dish | Exclude from the Mexican candidate. The current Québec retailer product is explicitly titled `Sauce de cuisson adobo philippin`; it is a distinct cooking product. OQLF also notes a Filipino dish sense. [S01, S09] |
| Dry adobo seasoning | Exclude. The current Québec retailer term `Assaisonnement Adobo avec poivre` is a dry seasoning product and belongs to the separate spice review. [S12] |
| Achiote paste, recado, marinades, and prepared dishes | Exclude. Shared use with meat or chile ingredients does not make them adobo-sauce aliases. The Mexican dictionary separately distinguishes the sauce and a meat dish cooked in it; this proposal is limited to the sauce product. [S02] |

The fact that a sauce is suitable for marinating or braising does not change its sold product state. The manufacturer source calls Adobo Rico a sauce and identifies its Mexican-style chile base; the Canadian retail source sells a standalone sauce. A dry seasoning, a marinade-only formula, or meat prepared in adobo remains outside the proposed identity. [S04–S05]

## Québec and Canadian naming findings

The exact French terms found on current Québec retailer pages identify neighboring products, not a standalone Mexican adobo sauce:

- **`Sauce de cuisson adobo philippin`** — current le Choix du Président listing at Provigo, with Longueuil stock shown on the page. It explicitly scopes the item to Filipino cooking.
- **`La Costeña Chipotles dans une Sauce Adobo`** — current Provigo product listing; the head product is chipotles packed in sauce. [S13]
- **`Pâte d’adobo`** — current Maxi listing for a La Costeña paste-state item.
- **`Assaisonnement Adobo avec poivre`** — current Provigo listing for Goya dry seasoning.

These exact retailer names are useful collision evidence; none validates `sauce adobo mexicaine` as the established French display for a separate wet Mexican sauce. The OQLF’s preferred headword is `adobo`, but its entry defines a marinade, not a packaged Mexican sauce. A French Metro recipe uses `sauce adobo` while referring to the sauce in a chipotle preparation; that is recipe usage, not a standalone product label. Use the proposed French display only as a provisional localized name if integration requires one, and keep its alias list empty. [S01, S09, S11–S12]

## Recipe demand and numeric behavior

The 114-recipe corpus has **zero** standalone adobo-sauce ingredient lines. Its only matching line is `007#3`, the already covered counted chipotle-in-adobo ingredient above. There is no recipe demand to link to this candidate now. The identity proposal therefore adds no recipe links, product amount, count, edible portion, mass, volume, density, unit conversion, substitution, or preparation ratio. Those values cannot be inferred from package size, from the existence of a sauce in a mixed product, or from a manufacturer’s recipe direction.

## Sources

All online sources below were accessed on **2026-10-11**. Retail availability and inventory may vary by postal code; the linked pages are evidence for the names/product states they display, not a national stock guarantee.

| ID | Source and locator | Evidence and limits |
|---|---|---|
| S01 | [Office québécois de la langue française, GDT: adobo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26561587/adobo) | 2023 entry privileges the masculine noun `adobo`, defines it as a spicy marinade of vinegar, garlic, and dried chiles, and notes a Filipino dish sense. It does not define a Mexican sauce product state. |
| S02 | [El Colegio de México, Diccionario del español de México: adobo](https://dem.colmex.mx/ver/adobo) | Defines a Mexican sense as a thick reddish-brown sauce made with diverse chiles, oil, vinegar, herbs, and spices, used to season foods; separately defines meat stewed in that sauce. This is a dictionary definition, not a package standard. |
| S03 | [Mexico, SIAP/SADER: “Ahumado y deshidratado, el chipotle sigue siendo apreciado”](https://www.gob.mx/agricultura/dgsiap/es/articulos/ahumado-y-deshidratado-el-chipotle-sigue-siendo-apreciado?idiom=es) | Describes one adobo preparation with soaked ancho and pasilla, tomato, garlic, herbs, vinegar, and other seasonings, with chipotles later simmered in it. It is an illustrative preparation in a chipotle article, not a universal formula or standalone product label. |
| S04 | [Chile Crunch, Products](https://chilecrunch.com/pages/products) | Current manufacturer sales page identifies `Adobo Rico` as a Mexican-style sauce for braising or marinating and describes roasted pasilla/ancho chiles, garlic, vinegar, and sunflower oil. This establishes one distinct product example; it does not establish Québec French usage or a universal recipe. |
| S05 | [Williams Sonoma Canada, Adobo Sauce](https://www.williams-sonoma.ca/products/williams-sonoma-grilling-sauce-adobo-sauce/) | Current Canadian retailer page lists a standalone `Adobo Sauce` and describes it as Mexico’s red chile adobo. Its own formula includes stock, wine, tomato, and multiple chiles, including chipotle; it is a sauce product, not chipotles packed in sauce. Delivery availability depends on postal code. One branded product does not define all adobo sauces. |
| S06 | [La Costeña Mexico, Chipotles adobados](https://www.lacostena.com.mx/es/productos/chipotles-adobados/) | Current manufacturer page places the item under chiles and calls the product `Chipotles adobados`; it supports the compound-pepper product boundary, not a separate sauce-only item. |
| S07 | [La Costeña Canada, product overview](https://www.lacostena.ca/) | Current Canadian brand page lists `Adobo Paste` and describes it as a paste for Mexican marinades. The listing is not a French label or detailed formulation and is not used to broaden the sauce identity. |
| S08 | [Maxi Québec, `Pâte d’adobo`](https://www.maxi.ca/fr/p-te-d-adobo/p/21563671_EA?source=nspt) | Current product listing uses the exact French title `Pâte d’adobo`. This supports paste-state naming only; it does not establish a sauce label. |
| S09 | [Provigo Québec, le Choix du Président Sauce de cuisson adobo philippin](https://www.provigo.ca/fr/sauce-de-cuisson-adobo-philippin/p/21048551_EA?source=nspt) | Current listing uses this exact French product name, identifies Filipino adobo, and showed stock at a Longueuil store when reviewed. It is a same-word regional collision, not Mexican adobo sauce evidence. |
| S10 | [Doña María, Products](https://www.salsas.com/dona-maria/products/) | Current manufacturer catalog groups `Mole Adobo` under mole paste, apart from ready-to-serve mole. This aligns with the existing `ingredient-ref-mole-paste` ledger record and excludes the name from this proposal. |
| S11 | [Metro Québec, Chilaquiles poêlées](https://www.metro.ca/recettes-et-occasions/recettes/chilaquiles-poelees) | French recipe wording `piment chipotle finement haché dans une sauce adobo` refers to chipotle in adobo in the recipe, not to a separately named sauce product. Recipe-source phrasing is not an ingredient identity or Québec retail label. |
| S12 | [Provigo Québec, spices and seasonings](https://www.provigo.ca/fr/alimentation/garde-manger/pices-et-assaisonnements/c/28188?page=5) | Current listing uses `Assaisonnement Adobo avec poivre` for Goya dry seasoning. It is outside the wet sauce scope. |
| S13 | [Provigo Québec, Latin American foods](https://www.provigo.ca/fr/alimentation/aliments-internationaux/aliments-d-am-rique-latine/c/58680) | Current listing uses `La Costeña Chipotles dans une Sauce Adobo` for the packaged pepper product. This exact French name supports the existing compound identity’s boundary, not a standalone adobo sauce. |

## Evidence limits and integration note

This evidence supports an identity-only Mexican adobo sauce candidate because a Mexican dictionary sense and two current, separately sold Mexican-style sauce examples align on a chile-based sauce product state. The source set does not support a single formula, regional completeness, or a synonym that safely spans dry seasoning, paste, Filipino products, and chipotle-in-adobo. It also does not establish a Québec French standalone product name. If adopted, keep `sauce adobo mexicaine` provisional, aliases empty, recipe links empty, and all numerical/conversion/substitution behavior unset. The separate dry adobo seasoning checklist item remains open.
