# WP04 Section O farmed quail meat identity review — 2026-10-16

- **Packet type:** proposal-only identity and product-boundary research.
- **Open checklist item:** Section O's meat/poultry/game line includes quail; no quail-meat review or active meat identity was found.
- **Scope:** commercially produced quail meat sold for human consumption. Quail eggs, hunted wild game, other farmed birds, and processed quail products remain separate.
- **Recommendation:** accept a distinct identity-only candidate, quail meat / viande de caille, in PROTEIN, with no aliases or attached forms. Keep the existing quail-egg identity separate.
- **Recipe demand:** none in the bundled corpus.
- **Audit snapshot:** 1,595 active references; 122 forms; 61 legacy candidates; 1,940 research-ledger records; 114 manifest-listed recipe files and 1,123 ingredient rows.
- **Source IDs:** WP04-SECTION-O-QUAIL-MEAT-20261016-S01 through S05 are proposal-local. The ID prefix and proposed identity ID were checked for collision before writing.

## Why this candidate

The open Section O checklist names quail among food animals and poultry. The plan's existing quail-egg decision covers whole eggs only; it explicitly defers other animal-product coverage. The guinea-fowl identity review likewise names quail as a separate bird. Neither packet decides quail meat.

Current Québec government information identifies caille as a farm-raised bird, says meat from farmed birds is commercialized in the Québec market, and describes caille products in the local market. Canadian inspection and labelling sources also name quail meat and explain where the species name must be used. This supports a bounded common-meat identity without assigning a scientific species, age class, cut, or recipe behavior.

## Current catalog, collision, and source ownership audit

The live references, forms, legacy candidates, and ledger were checked for exact normalized candidate names and identifiers. The relevant adjacent identity is:

| Key or record | Current owner | Evidence and consequence |
| --- | --- | --- |
| quail meat; viande de caille; ingredient-ref-quail-meat | No exact owner in active references, forms, legacy candidates, or ledger records. The proposed ID is not allocated or reserved. | No existing meat identity or form to reuse. |
| quail; caille | No exact display or alias owner. | These are broad search phrases, not proposed aliases. They currently return the species-specific quail-egg reference through its longer name. |
| quail egg; œuf de caille | Active ingredient-ref-quail-egg, category EGG, with plural aliases quail eggs and œufs de caille. Its ledger identity is verified. | The existing quail-egg row is a separate product identity. Its source-specific egg measurement and substitution research do not apply to quail meat. |
| caille du Québec | No exact active reference or form owner. Current Québec distributor Distrobec uses this wording for an Imperial whole item and a boneless item. | A product heading from one distributor, not a general alias for all quail meat or a cut/form standard. |
| volaille fine; volaille de spécialité; gibier à plumes | No exact active owner identified for this candidate. | MAPAQ uses these as broad terms for a group of different farm birds. Do not alias this group language to quail. |

The related [duck- and quail-egg proposal](wp04-duck-quail-eggs-identity-review-20261009.md) and [guinea-fowl identity review](wp04-section-o-guinea-fowl-identity-review-20261013-round26.md) were read in full. The first concerns eggs and no meat; the second explicitly keeps pintade distinct from quail and does not establish a quail-meat identity. No focused quail-meat proposal or prior source-ID use was found.

The existing picker behavior creates an expected broad-query overlap: quail and caille can match both the egg and proposed meat display phrases. The full phrases quail egg and œuf de caille remain scoped to the egg identity; quail meat and viande de caille identify the proposed meat identity. This is why the proposal uses qualified display names and adds neither bare quail nor bare caille as aliases.

## Recipe audit

The manifest lists 114 recipes. Every manifest-listed recipe JSON and all 1,123 ingredient rows were scanned for quail, quails, caille, cailles, quail meat, viande de caille, farmed quail, and the proposed identifier. Accent folding and whole-phrase matching were used.

**Result: zero matching recipe files and zero matching ingredient rows.** The bundle contains no quail-meat request and no recipe link to ingredient-ref-quail-egg. No recipe relink or recipe-specific behavior is proposed. The absence of recipe demand is recorded as a limitation; the identity recommendation rests on checklist coverage and source-backed Canadian and Québec commercial-product usage.

## Boundary and disposition

| Candidate | Evidence | Disposition |
| --- | --- | --- |
| Farmed quail meat | CFIA includes young and mature quail carcasses and parts in its fresh/frozen poultry re-examination scope. Its retail cut-nomenclature guide says the species name must appear in the product description in place of the general word poultry for the species listed there. CFIA's export commodity table classifies quail under farmed game bird meat products. MAPAQ reports farm-raised quail and market availability of meat from farmed birds in Québec; Distrobec currently lists Caille du Québec products. | **Accept as a distinct identity-only candidate:** ingredient-ref-quail-meat, quail meat / viande de caille, PROTEIN. These are descriptive displays, not a claim that OQLF has ruled on a preferred meat term. Keep wild/hunted quail and processed products outside this broad farmed-meat identity. |
| Quail egg | Existing active egg identity with OQLF terminology source WP04-EGG-S03 and verified ledger record. | **Retain as a distinct egg identity.** Do not alias egg terms to meat or meat terms to egg. |
| Caille du Québec | One current distributor's regional product heading, with whole and boneless product listings. | **Hold as a product-specific wording and origin description.** Do not add as a general alias or encode the supplier's listings as reusable forms, quantities, or cuts. |
| Whole, boneless, young, mature, fresh, or frozen quail | CFIA and distributor sources mention these within specific carcass, inspection, or product-listing contexts. The recipe corpus requests none of them. | **No form or age-class identity proposed.** These are product states or source-scoped classes, not interchangeable recipe behavior. |
| Bare quail / caille, game bird, specialty poultry | These broad terms can denote the egg/meat family or multiple bird species. | **Do not add as aliases.** Keep the species and product-type words in the bilingual display names. |

## Proposed data shape

| Field | Proposal |
| --- | --- |
| ID | ingredient-ref-quail-meat |
| English display | quail meat |
| Québec French display | viande de caille |
| Category | PROTEIN |
| English aliases | none |
| French aliases | none |
| Density and unit mappings | none |
| Forms, measures, conversions, yields, and substitutions | none |
| Recipe links | none |

The French display is a transparent descriptive phrase based on current Québec usage of caille for the food bird and MAPAQ's description of marketed meat from farm-raised birds. The targeted OQLF search did not locate a meat-specific caille GDT entry; do not describe viande de caille as an OQLF-preferred term. Distrobec's caille du Québec heading is useful evidence of local product wording, but it does not support that phrase as a global alias.

## Evidence limits

- The CFIA meat-cut guide and re-examination program use different scopes and wording. One names species for retail cut descriptions; the other includes quail among poultry carcasses and parts inspected fresh or frozen. They support explicit quail naming and meat-product coverage but do not create a universal product specification or a catalog synonym.
- MAPAQ's current birds-farmed page describes a regional market category and reports aggregate figures for farmed birds; it does not give a quail-specific production total or identify a quail binomial.
- CFIA's commodity table classifies quail under farmed game bird for export documentation. This is a classification aid, not a retail package label or a claim that all quail meat is farmed.
- Distrobec's current page shows local product names but does not provide a species binomial, complete label, or recipe-use specification. Its whole/boneless wording does not establish universal ingredient forms.
- No source establishes a conversion, portion, density, edible yield, cooking state, safe-handling rule, or substitution for quail meat. No such behavior is inferred.

## Source register

All online sources were checked on 2026-10-16. These source IDs are local to this proposal and are not shared-ledger records.

| Source ID | Source and supported scope |
| --- | --- |
| WP04-SECTION-O-QUAIL-MEAT-20261016-S01 | Canadian Food Inspection Agency, [Poultry – Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/poultry). Its retail meat-cut nomenclature defines the generic term poultry for listed species and says the bird species name must appear in the product description instead of poultry. This is scoped nomenclature guidance, not a universal quail product standard. |
| WP04-SECTION-O-QUAIL-MEAT-20261016-S02 | Canadian Food Inspection Agency, [Poultry re-examination program](https://inspection.canada.ca/en/food-guidance-commodity/meat-products-and-food-animals/poultry-re-examination-program). Applies to fresh or frozen carcasses and parts, including young and mature quail, and says product names follow common Canadian usage and the poultry-parts labelling guide. Inspection scope only; no age-class catalog identities or preparation behavior are inferred. |
| WP04-SECTION-O-QUAIL-MEAT-20261016-S03 | Gouvernement du Québec / MAPAQ, [Élevage d’oiseaux fermiers](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/elevage-oiseaux-fermiers), last updated 2026-03-05. Names caille among farm-raised birds; says meat and eggs from farmed birds are marketed in Québec and that products made from caille, faisan, and pintade may be sold as whole carcasses, pieces, fondue meats, pâtés, charcuteries, or prepared dishes. Regional product-family evidence, not proof that those presentations are equivalent. |
| WP04-SECTION-O-QUAIL-MEAT-20261016-S04 | Canadian Food Inspection Agency, [Commodity table: categorized listing of food products for export](https://inspection.canada.ca/en/exporting-food-plants-animals/food-exports/certification/certificate-free-sale/commodity-table). Places quail under farmed game bird in meat-product commodity categories. Export-compliance categorization, not an ingredient synonym or market-specific retail name. |
| WP04-SECTION-O-QUAIL-MEAT-20261016-S05 | Distrobec, [Nos produits](https://distrobec.com/produits/). Current Québec distributor listing shows a Caille du Québec heading and Imperial whole and boneless products. Supports one local commercial wording and presentation only; no general alias, species determination, size class, or recipe measure is inferred. |

## Final disposition

Advance quail meat / viande de caille as a distinct, identity-only PROTEIN candidate scoped to farmed quail meat sold for food. Preserve the existing quail-egg identity as a separate EGG product. Keep aliases empty and do not add forms, numeric behavior, recipe links, or substitutions. The proposal is standalone; no catalog, ledger, plan, or roadmap changes were made, and no tests or emulator checks were run.
