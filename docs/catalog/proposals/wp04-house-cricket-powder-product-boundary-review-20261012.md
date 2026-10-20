# WP04 Section P proposal — house-cricket powder and flour product boundary — 2026-10-12

**Scope:** human-food powder made from whole house crickets (*Acheta domesticus*), current Canadian product availability, and search separation from the active banded-cricket-powder reference (*Gryllodes sigillatus*). This is a proposal-only review; it makes no canonical data change.

## Disposition

**Retain the existing identity-only house-cricket-powder reference. Do not add a second house-cricket row or promote “house cricket flour” as a general alias yet.** The current reference already represents the narrowly supported human-food powder product. Current Canadian supplier evidence supports that product’s continued inclusion; no recipe demand, measurement, conversion, or substitution behavior is established.

The current catalog display remains **house cricket powder / poudre de grillon domestique**. Keep both alias arrays empty. The English supplier term “cricket flour” is used for one *A. domesticus* whole-cricket product, but the French and Canadian evidence does not establish a category-wide flour/powder equivalence. Health Canada separately lists *G. sigillatus* banded-cricket flour, so generic “cricket flour” cannot be assigned to the house-cricket row or the existing banded-cricket-powder row.

This review confirms an already-integrated identity; it does not ask for a duplicate row. If a later integration batch needs to record this review, it should update the existing house-cricket ledger record rather than create a parallel candidate or source owner.

## Current repository and demand audit

Read-only audit of the live package and supporting records on 2026-10-12:

- `ingredient-references.v1.json` contains **1,288 references**. The only current cricket references are:
  - `ingredient-ref-house-cricket-powder` — `house cricket powder` / `poudre de grillon domestique`, category `PROTEIN`.
  - `ingredient-ref-banded-cricket-powder` — `banded cricket powder` / `poudre de grillon à bandes`, category `PROTEIN`.
- Both references have empty English and French alias arrays, `null` default density, and no unit mappings. The **98** live ingredient forms contain no cricket-specific form.
- `legacy-import-identities.v1.json` has **64** candidates. None matches cricket, *Acheta*, *Gryllodes*, insect, or the English/French powder/flour terms.
- `research-ledger.v1.json` has **1,596** records. It already has a verified `ingredient-ref-house-cricket-powder` record with 7 source entries and a verified `ingredient-ref-banded-cricket-powder` record with 14 source entries. The held mealworm candidate has 23 sources and remains a separate insect identity review; it is not a cricket alias owner.
- The manifest lists **114 recipe files** and the files contain **1,123 ingredient rows**. A case-insensitive scan of all manifest-listed recipe JSON text found no matches for cricket, house cricket, banded cricket, *Acheta*, *Gryllodes*, insect, grillon, or the cricket powder/flour phrases. No recipe link or recipe phrase resolves the generic searches.
- Reviewed the existing house-cricket identity proposal, banded-cricket identity and Québec display proposals, and both mealworm food-boundary proposals. These already establish the species split and mealworm hold. This packet adds a current product-availability check and a fresh search-ownership decision; it does not replace those reviews.

## Current Canadian human-food product evidence

C-fu Foods’ current product and FAQ pages identify its cricket flour/powder as a human-food ingredient made from whole *A. domesticus* crickets roasted and ground. The FAQ says its insects come from food-grade farms raised specifically for human consumption, identifies bulk supply, and says the company’s ingredients are currently available in Canada and the United States. This is direct current supplier evidence for Canadian **bulk/B2B** availability of a house-cricket whole-powder product. It does not verify a consumer retail pouch, a specific Canadian package label, the compliance of every lot, or a regulatory determination for all products using the words “cricket flour.”

Fit Cricket’s Canadian food-bar page gives a separate consumer-food example: its ingredient declaration names “Cricket Flour (*Acheta domesticus*)” in bars described as made in Canada. The reviewed page marked the sample pack **out of stock**. It supports the use of that phrase for a Canadian human-food product, but it does not establish current retail availability of the bars or a standalone powder, nor does it describe the powder’s process. It therefore does not change the alias decision.

Do not transfer C-fu’s approximate protein percentage, shelf-life, processing details, availability, or product uses to other manufacturers or to a catalog-wide cricket-flour specification. In particular, the FAQ distinguishes C-fu’s whole-cricket flour/powder from its water-soluble insect protein concentrate and textured insect protein. Those are separate product states.

## Canadian food and animal-product scope

Health Canada’s 2016-07-18 list contains the entry **“Cricket (*Acheta domesticus*) powder”**, described as a powder made from whole crickets. The French list gives **“Poudre de grillon (*Acheta domesticus*)”** with the same whole-cricket description. This supports the narrowly scoped identity’s non-novel status for food as described. Health Canada says the listed items did not receive a food-use safety assessment, must still comply with other applicable food rules, and are covered only for their listed novelty scope. The same list separately describes a C-fu product made by extracting and restructuring proteins from multiple insect species; that separate entry does not extend the whole-cricket-powder determination to extracts, concentrates, or every product from the named species.

CFIA describes whole, dried, powdered, and flour edible-insect products as foods sold in Canada and says they must meet the requirements applicable to food; the Safe Food for Canadians Regulations apply to import, export, and interprovincial trade. This is general food-policy context, not clearance or label approval for a particular supplier, lot, or process.

Keep intended animal use outside this human-food identity. CFIA’s current livestock-feed guidance places livestock feeds under the Feeds Act and Feeds Regulations, 2024, with its own approval and registration rules; the outcome depends on intended use and product classification. CFIA separately says pet food is not regulated as comprehensively as food for human consumption or livestock feed and describes its role as limited to applicable animal-product import/export requirements. A feeder-insect, livestock-feed, or pet-food listing is therefore not evidence of a human-food ingredient or a substitute for the food-specific scope above. These separate regimes do not establish the status of any particular animal product.

## Québec French naming and search ownership

OQLF’s 2025 GDT entry pairs **grillon domestique** (also **grillon comestible**) with English **house cricket** and *Acheta domesticus*. Its note says the house cricket is sometimes powdered and incorporated into foods for consumption. This supports the species term, not a prescribed French name for a cricket-powder package. Health Canada’s French list supplies the product phrase **poudre de grillon** for its *A. domesticus* whole-powder entry. Combining that powder wording with OQLF’s species term yields the current display **poudre de grillon domestique**. Treat the compound as a Québec-oriented editorial catalog display, not an OQLF ruling, a CFIA-approved label name, or a phrase quoted verbatim from one source.

CFIA’s common-name guidance requires common names in English and French for consumer-prepackaged food and, where no prescribed name applies, calls for a generally known name or a specific, accurate, non-generic description. It supports using a species-qualified descriptive display, but does not approve this particular wording.

Search ownership should remain exact and species-qualified:

| Search scope | Owner / treatment |
|---|---|
| `house cricket powder` | Existing house-cricket reference; *A. domesticus*, whole-cricket human-food powder. |
| `poudre de grillon domestique` | Existing house-cricket reference; species-qualified French display. |
| `banded cricket powder` | Existing banded-cricket reference; *G. sigillatus*, human-food powder from whole crickets. |
| `poudre de grillon à bandes` | Existing banded-cricket reference; Québec-oriented species-qualified display from its separate terminology review. |
| `house cricket flour` / `farine de grillon domestique` | Hold as aliases for now. C-fu uses “flour” and “powder” for its own roasted, ground whole-*Acheta* product, while the official *Acheta* determination says “powder”; no second current Canadian standalone *Acheta* flour specification establishes the broader equivalence. |
| `cricket powder`, `cricket flour`, `poudre de grillon`, `farine de grillon`, `cricket`, `grillon`, `insect powder`, `poudre d’insectes` | No unique owner and no global aliases. They are generic, shared, or product-state-ambiguous. In particular, Health Canada separately lists *G. sigillatus* cricket powder and banded-cricket flour. |
| *Acheta domesticus*, *Gryllodes sigillatus* | Keep as identity evidence, not ingredient aliases. Use the species-qualified displays to select the active reference. |

The picker may still return both active references for partial generic text that appears inside their displays. Empty alias lists keep ownership explicit; they do not make generic partial queries uniquely resolvable. If a recipe later says only “cricket powder/flour,” retain the source wording or seek species/product context rather than auto-linking it.

## Proposed catalog boundary

| Field | Disposition |
|---|---|
| Active reference | Retain `ingredient-ref-house-cricket-powder`; do not add a duplicate. |
| English / French display | Retain `house cricket powder` / `poudre de grillon domestique`. |
| Identity | Whole-cricket human-food powder from *Acheta domesticus*. |
| Category | Retain `PROTEIN`. |
| Aliases | Keep empty; hold flour aliases and all generic cricket/insect phrases. |
| Forms, density, measures, mappings, conversions, yields | None. |
| Recipe links or substitutions | None; the bundled corpus has no matching demand or supported substitution. |
| Separate banded-cricket product | Retain `ingredient-ref-banded-cricket-powder` as *Gryllodes sigillatus*, with its current displays and empty aliases. Do not merge the species or assign generic flour/powder wording to it. |

## Source register

Sources checked 2026-10-12. Supplier statements are identified as such; official sources are not broadened beyond their stated scope.

| ID | Source | Evidence used and limit |
|---|---|---|
| `WP04-HOUSE-BOUNDARY-20261012-S01` | Health Canada, [List of non-novel determinations for food and food ingredients](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html) | 2016-07-18 *A. domesticus* whole-cricket powder entry; same date also has a separate C-fu extracted/restructured protein product entry. The list says determinations concern novelty only, were not food-use safety assessments, and remain subject to other food rules. |
| `WP04-HOUSE-BOUNDARY-20261012-S02` | Health Canada, [French list of non-novel determinations](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html) | Exact *A. domesticus* wording “Poudre de grillon” and whole-cricket description; also lists distinct *G. sigillatus* powder and flour entries. This is status-list wording, not a label approval or general species/process authorization. |
| `WP04-HOUSE-BOUNDARY-20261012-S03` | CFIA, [Edible insects: what to know before biting into bugs](https://inspection.canada.ca/en/inspect-and-protect/food-safety/edible-insects) | General statement that edible insects, including powdered and flour products, are foods subject to applicable food requirements; SFCR applies to imports, exports, and interprovincial trade. It is not an *Acheta*-specific determination. |
| `WP04-HOUSE-BOUNDARY-20261012-S04` | C-fu Foods, [Products](https://cfufoods.com/products) and [FAQs](https://cfufoods.com/faq) | Current supplier pages identify *A. domesticus* cricket flour/powder and the whole-cricket roast/grind process; FAQ says food-grade farms raise the insects for human consumption, the ingredients are available in Canada and the U.S., and flour is supplied in bulk. Product and availability statements are specific to C-fu; not a universal process, composition, retail-package proof, or regulatory decision. |
| `WP04-HOUSE-BOUNDARY-20261012-S05` | Fit Cricket, [Sample Pack, 6 Pack](https://fitcricket.com/product/sample-pack-6-pack/) | Canadian bar page uses “Cricket Flour (*Acheta domesticus*)” and describes the bar as made in Canada. The page showed the sample pack out of stock when reviewed; it does not prove current retail availability or a standalone powder specification. |
| `WP04-HOUSE-BOUNDARY-20261012-S06` | Office québécois de la langue française, [GDT: grillon domestique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26579641/grillon-domestique), updated 2025 | Pairs `grillon domestique` / `grillon comestible` with English `house cricket` and *Acheta domesticus*; notes food use including powder. Terminology and species evidence only; not a powder label decision. |
| `WP04-HOUSE-BOUNDARY-20261012-S07` | CFIA, [Common name on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/common-name) | General requirements for bilingual consumer-prepackaged common names and for a specific, accurate descriptive name when no prescribed name applies. Does not approve this proposed catalog display. |
| `WP04-HOUSE-BOUNDARY-20261012-S08` | CFIA, [RG-1: Feed Registration Procedures and Labelling Standards](https://inspection.canada.ca/en/animal-health/livestock-feeds/regulatory-guidance/rg-1) | Current guidance identifies the Feeds Act and Feeds Regulations, 2024 as the livestock-feed regime and distinguishes livestock feed from products for pets or wild animals. Classification depends on intended use; this is not a human-food determination. |
| `WP04-HOUSE-BOUNDARY-20261012-S09` | CFIA, [Regulatory oversight of pet food, treats and chews in Canada](https://inspection.canada.ca/en/animal-health/terrestrial-animals/exports/pet-food/pet-food-treats-and-chews) | Describes pet-food oversight as less comprehensive than human food or livestock feed and limited to specified import/export requirements. It does not establish the status of a particular pet product. |

## Verification note

Proposal only. The sole file created for this task is this proposal. No canonical JSON, generated file, ledger, plan, roadmap, recipe, test, or code file was changed. No tests were run.
