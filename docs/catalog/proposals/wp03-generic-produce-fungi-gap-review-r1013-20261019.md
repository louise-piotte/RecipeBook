# WP03 Section N proposal — aonori / green-laver identity review (R1013)

- **Reviewed:** 2026-10-19
- **Status:** Proposal only. This subtask writes this file alone. No catalog JSON, ledger, legacy data, recipes, plan, roadmap, batch README, or code is changed. No tests or builds are run.
- **Scope:** One generic culinary identity for the named dried green-laver food class `aonori`. This is not a taxon roster or commercial-product roster.
- **Plan anchor:** Section N, the open item at [“Nori, kombu, wakame, dulse, kelp, arame, sea lettuce, aonori, sea grapes, and regional sea vegetables”](../../RecipeBook-global-ingredient-catalog-plan.txt#L7163).

## Recommendation

Accept one identity-only `aonori / aonori` reference for the named, dried green-laver culinary product class, with `green laver` as its sole English alias. Treat it as a product class that can contain green algae from more than one genus, not as a scientific taxon. The FAO food chapter explicitly uses “Aonori or green laver” for *Monostroma* and *Enteromorpha* products and notes that *Ulva* sea lettuce can also be included. MEXT independently has a dried-aonori food-composition item identified as *Enteromorpha* spp. The Québec supplier directory already uses the French-facing name `aonori` for an *Enteromorpha* sp. item. [S01–S03, existing WP03-SEA-VEGETABLES-20261009-S10–S12]

This resolves the old candidate by narrowing its meaning: accept `aonori` as a generic named food product class, without assigning it to one species or treating every green seaweed as aonori. Keep `aosa` / `aosa-nori`, the separate `sea lettuce / laitue de mer` identity, and red-algal `nori / laitue pourpre` distinct. No recipe demand, reusable measurement, form conversion, or substitution is established here.

The French display uses the same borrowed name as the English display. The Québec supplier directory supports that local wording, but the OQLF search did not surface a dedicated aonori entry; this is provisional Québec market wording, not an OQLF ruling.

## Exact plan anchor and prior decision

The Section N anchor at line 7163 remains unchecked for other listed identities and regional sea vegetables. Its follow-up says nori and the other named core sea vegetables are integrated while `aonori` remains held. The earlier coordinator review recommended a separate aonori product identity if terminology and product scope could be resolved; it explicitly rejected merging aonori into nori or generic powdered seaweed. This proposal resolves only the aonori identity question and leaves the parent checklist open for other work.

The current research ledger contains candidate record `ingredient-ref-aonori` with `identityState: needs_clarification`. Its decision holds `aonori/aosa` together because sources use those names across more than one green-alga group and because neither nori nor sea lettuce is a safe target. This review keeps the useful caution but separates the two names: the evidence now supports a named aonori product-class row without asserting that `aosa` is its synonym.

## Current package and ownership audit

Read-only snapshot on 2026-10-19:

| Area | Current state | Consequence |
|---|---|---|
| Active references | 2,025. No aonori or green-laver reference exists. `ingredient-ref-sea-lettuce` is `sea lettuce / laitue de mer`; `ingredient-ref-nori` is `nori / nori`, with `purple laver / laitue pourpre`. | Add no duplicate sea-lettuce or red-nori identity. The proposed aonori row is a named green-laver product class. |
| Normalized exact ownership | No active reference or form owns `aonori`, `green laver`, `aosa`, `aosa nori`, `aonori seaweed`, `green seaweed`, or `algue verte`. Existing exact owners for `sea lettuce / laitue de mer` and `nori / purple laver / laitue pourpre` are the two rows above. | Use `aonori` as the bilingual display and `green laver` as the single English alias. Do not alias broader green-seaweed terms or existing identities. |
| Forms | 205 forms overall; no exact aonori/green-laver/aosa form term and no form under the current seaweed reference rows. | Add no form. The named aonori identity represents the dry processed food class; sheet, powdered, and other presentations are not promoted to general forms here. |
| Research ledger | 2,431 records. `ingredient-ref-aonori` is the existing unresolved candidate; the held generic kelp and sea-grapes candidates remain separate. | If integrated, revise the existing aonori candidate record in place; do not create a second candidate or reuse product-only claims. Preserve the kelp and sea-grapes holds. |
| Legacy identities | 55 candidates; no normalized aonori, green-laver, or aosa candidate/name/alias match. | No legacy promotion or cleanup is proposed. |
| Bundled recipes | 114 manifest-listed recipes and 1,123 ingredient rows. No ingredient text or linked row contains `aonori`, `green laver`, `aosa`, `aosa nori`, `green seaweed`, or `algue verte`. | No bundled recipe demand, line relink, or recipe edit. This finding is limited to the bundled corpus. |

The English search phrase `kelp` currently finds the separate winged-kelp identity through its qualified alias. This does not support a generic kelp identity or an aonori alias. The OQLF `nori` entry includes rare `amanori` terminology for the red-algal nori product; do not treat `amanori` as `aonori` or add it to this row.

## Proposed reference

If accepted, add only the following source-bounded reference:

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-aonori` (reuse the unresolved ledger candidate ID) |
| `nameEn` | `aonori` |
| `nameFr` | `aonori` |
| `aliasesEn` | `green laver` |
| `aliasesFr` | none |
| `category` | `VEGETABLE_AND_AROMATIC` |
| `defaultDensity` | `null` |
| `unitMappings` | empty |

Keep `aonori` and `green laver` as food-class names. The row does not claim a single species or species list, a particular plant part beyond the edible green-algal thallus, a universal formulation, or a current Québec availability level. Do not add *Ulva*, *Monostroma*, *Enteromorpha*, `sea lettuce`, `aosa`, `aosa-nori`, `aonori powder`, `aonori flakes`, `aonori sheet`, `aonori seaweed`, generic `seaweed`, or `algue verte` as aliases. The scientific names and source-specific presentations belong in evidence notes, not picker aliases.

If integrated, the existing candidate record should become an accepted ingredient-reference record with its unresolved decision replaced by the narrower decision above and the new proposal sources appended. Keep its prior source records and their narrower meanings intact. Suggested evidence states are `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; this proposal does not complete measurement or substitute research.

## Identity, name, and preparation boundaries

| Term or presentation | Treatment |
|---|---|
| `aonori / green laver` | One generic named food-product class for dried green-laver ingredients. It is explicitly multi-taxon/product-based in FAO, rather than a taxonomic identity. |
| `aosa / aosa-nori` | Keep unassigned here. MAFF's Mie entry describes `aosa` / `aosa-nori` as the dried product of `hitoegusa` (*Monostroma*), in regional usage. Shared genus-level evidence does not make these names universal synonyms for `aonori`. |
| `sea lettuce / laitue de mer` | Preserve the existing identity. FAO identifies sea lettuce with *Ulva* and says it may be included in some aonori; that ingredient overlap does not make the names synonyms. |
| `nori / purple laver / laitue pourpre` | Preserve the existing red-algal *Porphyra* food identity. Do not merge it with green laver. |
| `ita aonori` | Keep as a product-specific preparation outside the generic aliases. MAFF describes a Chiba product made by shaping *Enteromorpha prolifera* into a sheet and drying it. This source does not define every aonori product. |
| Dried, toasted, powdered, crushed, or sheet presentations | FAO and MAFF describe different preparations. No form rows or reconstitution behavior are proposed; the bundled recipes have no aonori demand to select a reusable form boundary. Do not encode a generic measure, density, hydration ratio, yield, or conversion. |
| Green seaweed, seaweed, kelp, wakame, arame, or sea grapes | Keep distinct. A broad green-alga, kelp, or seaweed term is not a demonstrated synonym for aonori. The existing kelp and sea-grapes holds remain unchanged. |

## Measurement and substitution limits

No recipe or manufacturer quantity in the reviewed sources provides a transferable cooking measure. MEXT's food-composition item is specifically “aonori, dried” (*Enteromorpha* spp.; food number 09002); its edible-portion composition data are not a household volume, density, or mass conversion. The FAO chapter's descriptions of *Monostroma latissimum*, *Enteromorpha* cultivation, drying, and powdered or crushed use remain tied to the species or process described there.

MAFF's traditional Mie `aosa` page says its traditional sun-drying takes about two days and reports a 60% share for that regional aosa production. Those figures describe Mie aosa, not generic aonori, and neither is carried to the proposed identity. The Exploramer directory's “dried year-round” listing is limited to the named supplier and the 2022 directory; it does not establish current market availability.

No source reviewed establishes that aonori can replace nori, sea lettuce, or another sea vegetable in recipes. Add no global or contextual substitution, unit mapping, package yield, density, form conversion, or recipe link. A full substitution review remains uncompleted.

## Cross-category scope disposition

This review pursues one generic culinary product identity. It does not research brands, product lines, flavour families, SKUs, retailer variants, or commercial-product rosters. Commercial-product counts do not add ingredient diversity. The Exploramer supplier directory is cited only for its single generic `aonori` naming example and its 2022 scope, not as a roster to expand. Preserve every existing branded entry and its product-specific evidence unchanged; no product-specific amount or claim is transferred.

## Source register and limits

Sources were accessed on 2026-10-19. IDs below are local to this proposal and have not been added to the research ledger. Existing source IDs `WP03-SEA-VEGETABLES-20261009-S10–S12` remain the sources already attached to the aonori candidate; they are not duplicated here.

| ID | Source | Supports and limits |
|---|---|---|
| **WP03-AONORI-GENERIC-ID-R1013-20261019-S01** | Japan Ministry of Education, Culture, Sports, Science and Technology (MEXT), [Standard Tables of Food Composition in Japan — algae / aonori / dried](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=9_09002_7), food number 09002. | Official table names “ALGAE/green laver, dried” and identifies this table item as *Enteromorpha* spp. It supports one documented dried-aonori class instance, not every product called aonori. The food-item composition is not used as a kitchen measure or generic nutrition claim. |
| **WP03-AONORI-GENERIC-ID-R1013-20261019-S02** | Japan Ministry of Agriculture, Forestry and Fisheries (MAFF), [Seaweed products — “Ita aonori”](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kaisou-seihin.html). | Describes one Chiba regional product made from *Enteromorpha prolifera*, shaped into a sheet and dried, and used in zōni. Its taxon, sheet shape, drying, and regional dish stay source-specific; it does not define all aonori or provide a reusable amount. |
| **WP03-AONORI-GENERIC-ID-R1013-20261019-S03** | MAFF, [Mie Aosa Nori / 青さのり（あおさのり）](https://www.maff.go.jp/j/keikaku/syokubunka/traditional-foods/menu/aosanori.html). | Describes the regional Mie `aosa` product as hitoegusa (*Monostroma*) and documents drying and culinary uses. Its approximately two-day traditional sun-drying and 60% production-share claim apply to that regional aosa context only. This source supports keeping `aosa` unaliased; it does not make aosa universally equivalent to aonori. |
| **WP03-AONORI-GENERIC-ID-R1013-20261019-S04** | Office québécois de la langue française, [GDT — nori](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503226/nori). | Defines nori as a pressed, dried red-algal *Porphyra* product and lists `purple laver` / `laitue pourpre`. It is used only to preserve the red/green laver boundary. Its rare `amanori` synonym belongs to nori, not to aonori. Exact site searches for `aonori`, `aosa`, and `green laver` did not surface a separate OQLF entry; that negative result does not establish that the borrowed name is unacceptable. |
| **Existing WP03-SEA-VEGETABLES-20261009-S10** | Exploramer / Fourchette bleue, [Laitue de mer](https://fourchettebleue.ca/produits/laitue-de-mer/). | Existing ledger source identifies *Ulva lactuca* as sea lettuce and notes regional aonori/aosa usage. It does not resolve worldwide aonori scope; preserve the sea-lettuce identity separately. |
| **Existing WP03-SEA-VEGETABLES-20261009-S11** | Exploramer / Fourchette bleue, [Répertoire des fournisseurs 2022](https://exploramer.qc.ca/wp-content/uploads/2022/05/22.05.04-Repertoire-des-fournisseurs-2022.pdf), “Entéromorphe sp. (aonori), sea grass, *Enteromorpha* sp.” | Quebec French-facing source uses `aonori` for one genus-level product. It lists one supplier as dried/year-round in that 2022 directory; this is not a current availability check or a source-neutral product specification. |
| **Existing WP03-SEA-VEGETABLES-20261009-S12** | Food and Agriculture Organization of the United Nations (FAO), [A guide to the seaweed industry — “Seaweeds used as human food”](https://www.fao.org/4/y4765e/y4765e0b.htm), Section 8.3. | Calls the class “Aonori or green laver” and describes *Monostroma* and *Enteromorpha* species; it says *Ulva* sea lettuce can be added to some aonori and describes drying, powdering, or crushing for use. The older taxonomy and class-level examples do not define every current product formulation or justify species aliases. |

## Proposal-only decision delta

Recommend an identity-only `aonori / aonori` row with one English alias, `green laver`, and no French aliases. Reuse the existing unresolved `ingredient-ref-aonori` candidate ID if integrated; keep the identity product-based and multi-taxon, leave `aosa` and `sea lettuce` distinct, and add no forms, measures, recipe links, conversions, yields, densities, or substitutions. Section N remains open for its other sea-vegetable and fungus gaps.
