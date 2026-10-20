# WP02 Section A — soft white wheat flour identity review (R225, 2026-10-16)

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Submitted proposal accepted and integrated on 2026-10-16. The handoff changed no shared catalog data; see the R219–R225 gap-review integration README. No app tests or emulator checks were run because the integrated additions are database JSON data and documentation under `AGENTS.md`.
- **Scope:** One unowned, Canadian-market soft-white-wheat flour identity under the open Section A item, “Add the remaining functionally distinct regional wheat-flour identities.”
- **Prior-work boundary:** R216 covers soft red winter wheat flour; R219 covers hard red winter wheat flour; and R222 covers hard red spring wheat flour. Those are excluded. WP03 R154 and R157 cover soft-white wheat as intact whole kernels, not flour. The accepted white whole-wheat, whole-wheat pastry, generic pastry, and national flour-grade rows are different milling or culinary identities. No prior proposal, acceptance, or hold for soft white wheat flour was found.
- **Proposed source-ID namespace:** `WP02-A-SWWF-R225-20261016-S01` through `S03`. The prefix and each proposed source ID were checked against the active ledger and the proposal/batch archive and were unused. The three new source IDs are now allocated on the accepted ledger record; registered OQLF and CGC sources are reused.

## Decision

**Add one identity-only reference: soft white wheat flour / farine de blé tendre blanc**, category **`FLOUR_AND_STARCH`**.

Current Canadian mill listings name soft white wheat flour as a food product. Peace Country Milling & Grains in Alberta lists an organic flour made from local Peace Country wheat, and Living Sky Farms in Saskatchewan lists soft-white whole-grain and sifted flour products. Their pages show that soft-white wheat is sold as flour, while leaving the milling state and seasonal class variable by product. The proposed identity records the market source-grain phrase; it does not assign the sellers’ wheat to a Canadian Grain Commission class, a season, a variety, or one extraction grade.

Use **`farine de blé tendre blanc`** as the proposed Québec French display. OQLF recognizes `farine de blé tendre` for soft-wheat flour and `blé tendre` for soft wheat. The Canadian Grain Commission’s French class material uses `blé tendre blanc de printemps` for one official class, and current French-language Canadian flour-market content uses `blé tendre blanc` while discussing soft-white wheat separately from hard wheat. The full proposed phrase is a transparent construction from those sources; it is not an OQLF entry or a verified Québec product title. Keep independent Québec wording review open and add no French alias.

Keep this source-qualified flour identity separate from generic soft-wheat flour, pastry flour, whole-wheat pastry flour, all-purpose flour, bread flour, whole-wheat flour, white whole-wheat flour, and soft-white wheat berries. A wheat-source class is not a general synonym for one culinary or extraction grade. In particular, do not add the broad aliases `soft wheat flour` or `farine de blé tendre`; either would erase the white qualifier and could overlap red soft-wheat flour. Do not infer the sellers’ specific whole-grain or sifted state as a universal form.

### Proposed reference fields

| Field | Proposal |
|---|---|
| ID | `ingredient-ref-soft-white-wheat-flour` |
| English display | **soft white wheat flour** |
| Québec French display | **farine de blé tendre blanc** — provisional construction; independent Québec review remains open |
| English aliases | None |
| French aliases | None |
| Category | `FLOUR_AND_STARCH` |
| Forms, density, unit mappings, conversions, yields, recipe links | None |

## Current ownership and prior decisions

The read-only active snapshot contains **1,614 ingredient references, 122 forms, 61 legacy-import candidates, and 1,959 research-ledger records**.

Exact-name and ID checks found no owner for `soft white wheat flour`, `farine de blé tendre blanc`, `ingredient-ref-soft-white-wheat-flour`, or the corresponding `candidate-soft-white-wheat-flour` key in active references, forms, legacy identities, or the ledger. No form is attached to the current soft-white-wheat berry reference. A search of the proposal and batch archive found no soft-white-wheat-flour proposal or hold. The R225 namespace and proposal filename were also unused when checked.

| Existing identity or decision | Boundary to preserve |
|---|---|
| `ingredient-ref-soft-white-wheat-berries` | WP03 R154’s season-unspecified whole-kernel food identity. It is not flour and receives no flour alias. |
| `ingredient-ref-soft-white-winter-wheat-berries` | WP03 R157’s whole-kernel product explicitly qualified as winter; the flour sellers reviewed here do not establish a season. |
| `ingredient-ref-white-whole-wheat-flour` | Existing white whole-wheat identity, including `hard white whole wheat flour` as an English alias. Keep the soft-white source term distinct; do not infer that every soft-white flour is whole-grain or that every white whole-wheat flour uses soft wheat. |
| `ingredient-ref-pastry-flour` and `ingredient-ref-whole-wheat-pastry-flour` | Culinary and whole-grain pastry identities. Soft-white wheat is used in pastry, but the source class does not establish a universal pastry-grade or extraction crosswalk. |
| Generic all-purpose and bread flour rows | Keep functional classes separate. Peace Country’s source-specific replacement advice does not make soft-white flour a general all-purpose substitute. |
| R216, R219, and R222 wheat-flour proposals | Separate red-wheat source-class candidates explicitly excluded here. R216 was integrated; R219 and R222 remain proposal-only at this review snapshot. |
| WP02 white-whole-wheat terminology review | Treats French `farine de blé blanc` and whole-grain wording as different claims. Its reviewed Québec product made from red hard wheat is not evidence for soft-white wheat flour. |

WP03 R154 and R157 resolve adjacent whole-kernel wheat products only. The Québec white-whole-wheat review covers a separate milling identity and warns against treating “white flour” as white whole-wheat flour. Neither review accepts or holds the proposed soft-white flour product. The current A-section open item and that surrounding work leave a source-qualified flour boundary available for review.

## Picker projection

These counts reflect reference names and aliases in the current catalog before and after the proposed row; no alias is added.

| Query | Current | Proposed | Effect |
|---|---|---|---|
| `soft white wheat flour` | 0 | 1 | Finds the flour by its exact English display. |
| `farine de blé tendre blanc` | 0 | 1 | Finds the flour by its proposed French display. |
| `soft white wheat` | 1: `ingredient-ref-soft-white-wheat-berries` | 2: berries plus flour | Preserves the whole-kernel choice and adds the distinct milling product. |
| `blé tendre blanc` | 2: season-unspecified and winter wheat-berry rows | 3: both berry rows plus flour | Keeps the existing whole-kernel products and adds a flour choice. |
| `pastry flour` | 2: pastry flour and whole-wheat pastry flour | Unchanged | No pastry alias or grade crosswalk is introduced. |

## Canadian and Québec product boundary

Peace Country Milling & Grains currently titles an Alberta-made product **“Organic Soft White Wheat Flour”**, places it in its whole-grain-flour category, and says it is ground from wheat grown in the Peace Country [S01]. Living Sky Farms currently lists **Soft White Wheat Sifted Flour** and **Soft White Wheat Whole Grain Flour** as separate variants under its soft-white wheat product page, and says the farm grows and mills its grain in Saskatchewan [S02]. The product page’s sold-out status is volatile and is not used as identity evidence. These direct Canadian pages support the English market phrase and show why the catalog identity should not assume a single whole-grain, sifted, seasonal, or flour-grade state.

The Commission’s current Canadian classes page explains that classes group varieties by functional characteristics and growing region. It distinguishes western Canada’s soft-white-spring class, CWSWS, from eastern Canada’s white-winter class, CEWW, and lists low-protein end uses for the relevant soft-white classes [reused S06–S07]. The Peace Country and Living Sky product pages do not name a season, cultivar, designated class, or formal grain grade. Do not map either seller’s product to CWSWS or CEWW from location or the words `soft white` alone.

For French, OQLF’s preferred term `farine de blé tendre` denotes flour from soft wheat and separately identifies `blé tendre` as soft wheat [reused S04–S05]. The Commission supplies the official French white-soft-wheat class component `blé tendre blanc de printemps`, while the current French-language Canadian flour-market page uses `blé tendre blanc` and explains that both spring and winter soft-white cultivars exist [S03; reused S06]. This supports the proposed display’s components and omission of a season. It does not establish an official full-grade phrase or a Québec retail title for this exact flour. The proposed French display is provisional, with no alias proposed.

The French-language market page’s own product listing is an all-purpose white flour made from hard red wheat; its discussion of `blé tendre blanc` is terminology and class context, not a soft-white product label [S03]. Do not use it to map the proposed identity to that page’s flour or to the existing all-purpose row.

## Measurements and substitutions

- **Household measurement:** Peace Country lists 4.5 kg and 10 kg packages; Living Sky offers 5 lb, 10 lb, 20 lb, and 50 lb package options across its grain and flour variants. These are package quantities, not household measures. Neither reviewed page gives a transferable cup-to-mass amount, flour density, or recipe unit mapping. The Canadian Grain Commission’s grain grades and class descriptions are not kitchen conversion evidence. Keep `defaultDensity` null and `unitMappings` empty.
- **Product-specific substitution advice:** Peace Country says its own whole-grain soft-white flour can be used in the same amount as all-purpose flour in a recipe. The page does not define whether “amount” is by mass or volume, provide a tested recipe or method, or establish the same result across recipes and milling states [S01]. Record that wording only as product-specific guidance if needed; do not activate a global or contextual substitution rule for soft-white wheat flour.
- **Other performance claims:** Peace Country’s page describes pastry and cake uses and suggests sifting bran for fine pastries. Living Sky reports its own product’s 9–10% protein and recommends tender baked goods. Those are seller-specific product claims; do not transfer them as catalog-wide specifications or make a pastry-flour equivalence.
- **If accepted:** Set measurement research to `researched_no_supported_value` and transferable substitution research to `researched_no_supported_substitute`. Keep any source-specific amount recommendation out of active substitution rules, and add no form, conversion, yield, recipe link, or density.

## Bundled recipe demand

The current manifest lists **114 recipe files and 1,123 structured ingredient rows**. Accent-, case-, and punctuation-normalized scans of all manifest-listed recipe files and ingredient rows found **zero** hits for `soft white wheat flour`, `soft white flour`, `farine de blé tendre blanc`, `farine de blé blanc tendre`, `soft white wheat`, `soft white`, or the proposed reference ID. No bundled recipe row links to the existing `ingredient-ref-soft-white-wheat-berries` identity. No recipe link, relink, or substitution link is proposed; the gap is supported by current Canadian flour products and the open WP02 Section A checklist, not by bundled recipe demand.

## Source register

New S01–S03 sources were accessed on 2026-10-16. Their proposed IDs were checked against the ledger and archive. Previously registered terminology/class sources are reused under their existing IDs.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A-SWWF-R225-20261016-S01` | Peace Country Milling & Grains, [Organic Soft White Wheat Flour](https://peacecountrymillingandgrains.ca/product/organic-soft-white-wheat-flour/), current product title, description, and package sizes. | Names a Canadian flour product, identifies wheat grown in Alberta’s Peace Country, categorizes it under whole-grain flour, and gives pastry/cake uses and same-amount all-purpose advice. The package choices and advice apply to this seller’s product; neither is a reusable household measure or general substitution rule. The page does not state season, cultivar, or formal CGC class. |
| `WP02-A-SWWF-R225-20261016-S02` | Living Sky Farms, [Soft White Wheat](https://livingskyfarms.ca/products/soft-white-wheat), current product page, flour variants, milling description, and soft-white product uses. | Lists whole-grain and sifted flour variants from the Saskatchewan farm’s wheat. Its process distinctions and reported protein value are product-specific. It does not state a season, cultivar, formal CGC class, household measure, or substitution ratio. The page showed sold-out status at review; no availability claim is made. |
| `WP02-A-SWWF-R225-20261016-S03` | OnlineOrganics, [Farine de blé blanche “Tout-usage” biologique (Milanaise)](https://onlineorganics.ca/fr/collections/farine/products/farine-de-ble-blanche-tout-usage-biologique-milanaise?variant=37499458027681), current French-language product page, soft-white wheat discussion. | Its French explanatory text uses `blé tendre blanc`, distinguishes soft from hard wheat, notes that winter and spring cultivars exist, and discusses soft-white uses. The listed flour itself is an all-purpose product made from hard red wheat, so this is terminology and boundary context only, not direct product evidence for the proposed identity. |
| **Reused: `WP02A3-20261010-S05`** | Office québécois de la langue française, [farine de blé tendre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357375/farine-de-ble-tendre). | Already registered in the ledger. Defines `farine de blé tendre` and gives `soft wheat flour` as the English equivalent. Supports the Québec French base term, not the full soft-white compound. |
| **Reused: `WP03-SOFTWHITE-R154-20261015-S01`** | Office québécois de la langue française, [blé tendre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357378/ble-tendre). | Already registered in the ledger for the whole-kernel soft-white wheat review. Supports `blé tendre / soft wheat`; the definition says wheat grain may be white or red. It does not name soft-white wheat flour. |
| **Reused: `WP03-SOFTWHITE-R154-20261015-S02`** | Canadian Grain Commission, [Blé : classes et variétés](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/04-ble/classes-varietes.html). | Already registered in the ledger. Uses official French soft-white class wording and distinguishes the seasonal/region-qualified classes. It does not assign either reviewed seller product to one of those classes. |
| **Reused: `WP03-SOFTWHITE-R154-20261015-S03`** | Canadian Grain Commission, [Canadian wheat classes](https://grainscanada.gc.ca/en/grain-quality/grain-grading/wheat-classes.html). | Already registered in the ledger. Describes Canadian wheat classes as functional and region-based, and lists soft-white class uses. This is class context, not a flour specification, household measure, or seller-product class assignment. |

## Local evidence references

- Active checklist: [WP02 Section A open regional flour item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1424).
- Adjacent whole-kernel decisions: [WP03 R154 soft white wheat berries](wp03-section-f-next-grain-gap-review-r154-20261015.md) and [WP03 R157 soft white winter wheat berries](wp03-section-f-soft-white-winter-wheat-berries-identity-review-r157-20261016.md).
- Recent sibling flour reviews: [R216 soft red winter](wp02-a6-or-section-a-gap-review-r216-20261016.md), [R219 hard red winter](wp02-a-or-a6-hard-red-winter-wheat-flour-review-r219-20261016.md), and [R222 hard red spring](wp02-a-or-a6-hard-red-spring-wheat-flour-review-r222-20261016.md).
- Existing terminology boundary: [Québec white-whole-wheat terminology review](wp02-quebec-white-whole-wheat-terminology-review-20261010.md).
- Read-only ownership and demand checks used the active [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), and manifest-ordered recipe corpus.
