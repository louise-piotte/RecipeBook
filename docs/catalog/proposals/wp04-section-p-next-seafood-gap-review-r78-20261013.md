# WP04 Section P — soft-shell crab product and species boundary review (R78)

- **Review date:** 2026-10-13.
- **Status:** Proposal only. No shared catalog, ledger, checklist, roadmap, batch, recipe, generated file, or application code was edited.
- **Checklist target:** [Shrimp/prawn by meaningful preparation; crab and crayfish](../../RecipeBook-global-ingredient-catalog-plan.txt#L4389).
- **Candidate:** Québec-listed soft-shell crab, potentially a soft-shell form of blue crab.
- **Recommendation:** Hold active allocation. The Québec fishmonger connects its soft-shell product to Atlantic blue crab, but does not state a taxonomic name; meanwhile DFO uses “soft shell crab / crabe mou” for snow-crab fishery condition. There is no bundled recipe demand, and the unqualified product phrases would each become singleton blue-crab picker results.
- **Exact proposed JSON delta:** None. Add zero ingredient references, zero forms, zero aliases, and zero ledger records in this review.
- **Source IDs:** `WP04-SECTION-P-SOFT-SHELL-CRAB-BOUNDARY-R78-20261013-S01` through `S07`; proposal-local only, not ledger entries.

## Scope and prior-review boundary

The active Section P line remains open for shrimp/prawn preparations, crab, and crayfish. This review considers only the soft-shell crab product and whether it can safely attach to the existing blue-crab identity. It does not reopen the R77 rock-crab / `crabe commun` picker hold, the snow-crab hold, Jonah crab, Dungeness crab, blue crab identity, generic crab-meat/Jumbo Lump form, crab-flavoured pollock flakes, or prior fish-ball/surimi decisions.

A targeted search of the active plan, proposal and batch archive, live references and forms, legacy candidates, and ledger found no prior soft-shell-crab or `crabe mou` crab decision. The few ledger hits for soft-shell wording concern soft-shell clams or unrelated grain text, not crab. The exact candidate therefore remains distinct from the reviewed crab identities and seafood preparations above.

## Québec product wording and species scope

OQLF’s GDT assigns preferred Québec French **crabe bleu**, English **blue crab**, and *Callinectes sapidus* to one edible-crab species [S01]. That is the current species owner in the catalog. The entry was last updated in 1998; it establishes terminology and taxonomic scope, not present-day market availability.

Québec fishmonger Poissonnerie La Mer currently lists a live **Soft Shell Crab** product. Its page says that the Atlantic blue crab molts and that the resulting delicacy can be eaten whole; the product page’s French image alternative text is `Crabe mou` [S03]. This is useful local product evidence and suggests a blue-crab soft-shell item, but the page does not name *C. sapidus*, provide a French product description in its visible text, or identify a package mass. A Montréal menu uses `crabe mou en tempura`, and a Brossard menu uses `crabe à carapace molle` for soft-shell crab dishes [S04, S05]. Those menus show Québec culinary wording, not the species or exact retail product behind each dish.

Targeted searches of the OQLF GDT during this review did not return a crab-specific entry for `crabe mou` or `crabe à carapace molle`; do not present either phrase as an OQLF-preferred taxonomic name. The local product page and menus support descriptive Québec use, but not one species-wide French alias.

The species ambiguity is concrete in Canadian fisheries usage. DFO’s Québec Region 2026 Area 12F plan is explicitly a snow-crab plan and includes a soft-shell-crab protocol [S06]. A DFO French stock report names *Chionoecetes opilio* as crabe des neiges, describes its post-moult soft-carapace stage as **crabe mou**, and gives a fisheries hardness boundary [S07]. Therefore, bare `crabe mou` can refer to a snow-crab condition in Québec fisheries context as well as to the blue-crab culinary product on La Mer’s listing. CFIA’s crab list separately maps *C. sapidus* to blue-crab names and *C. opilio* to snow-crab names; its broad crab results span many taxa [S02]. CFIA’s list is a Canadian fish-name/taxon source, not a source for culinary form equivalence.

## Current catalog ownership and archive audit

The live snapshot contains **1,402** ingredient references, **104** forms, **63** legacy-import candidates, **1,740** research-ledger records, and **8** unit conversions. The manifest lists **114** recipes.

| Current owner | Current scope and aliases | Boundary for this review |
|---|---|---|
| `ingredient-ref-blue-crab` (`PROTEIN`) | `blue crab / crabe bleu`; no aliases, no density, and no unit mappings. | Existing OQLF-scoped owner for *C. sapidus*. No soft-shell form is attached. |
| `ingredient-ref-crab` (`PROTEIN`) | `crab meat / chair de crabe`; no aliases, no density, and no unit mappings. | Generic edible meat, not a whole live crab or a species owner. |
| `ingredient-form-crab-jumbo-lump` | `jumbo lump crab meat / chair de crabe en gros morceaux (jumbo lump)`, attached to `ingredient-ref-crab`; no match terms or density. | Commercial meat grade; not a soft-shell form. |
| `ingredient-ref-crab-flavoured-pollock-flakes` (`PROTEIN`) | `crab-flavoured pollock flakes / goberge en flocons à saveur de crabe`; aliases `flake style crab flavoured pollock` and `flocons de goberge à saveur de crabe`. | Pollock product, not crab or soft-shell crab. |
| `ingredient-ref-dungeness-crab` (`PROTEIN`) | `Dungeness crab / crabe dormeur`; French aliases `crabe Dungeness` and `crabe de Dungeness`; no density or unit mappings. | Keep separate. |
| `ingredient-ref-jonah-crab` (`PROTEIN`) | `Jonah crab / crabe nordique`; no aliases, no density, and no unit mappings. | Keep separate. |
| Prospective soft-shell product/form | No active reference, form, legacy candidate, or soft-shell-crab ledger record. | No ID is allocated. Do not create a separate generic `soft-shell crab` ingredient identity. |

The live files are [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), and the [research ledger](../research-ledger.v1.json). The archive search also checked the R77 rock-crab packet and earlier generic-crab, snow-crab, and product-boundary decisions.

## Picker projection

The current phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) indexes reference names, aliases, and attached form labels. A complete word phrase returns its matches before partial matching.

| Query | Current result | If an unqualified `soft-shell crab / crabe mou` form were attached to blue crab | Boundary |
|---|---|---|---|
| `soft shell crab`, `soft-shell crab` | No result | `ingredient-ref-blue-crab` alone | The Québec listing suggests blue crab, but generic soft-shell crab is not a species-qualified query. |
| `crabe mou` | No result | `ingredient-ref-blue-crab` alone | DFO uses this phrase for soft-shell *C. opilio* in a Québec snow-crab fishery context. |
| `crabe à carapace molle` | No result | It would match blue crab alone if used as the French form label. | Local menus use the wording, but do not identify a taxon. |
| `blue crab`, `crabe bleu` | `ingredient-ref-blue-crab` | Same result | Existing species-qualified owner remains stable. |
| `crab`, `crabe` | Blue crab; crab meat; crab-flavoured pollock flakes; Dungeness crab; Jonah crab | Same five results | Broad searches remain multi-choice; this does not resolve the misleading singleton qualified-form queries. |
| `crab meat`, `chair de crabe` | `ingredient-ref-crab` | Same result | Keep meat and whole-crab product boundaries separate. |

The displayed product’s common English phrase and the Québec `crabe mou` wording are insufficient as global match terms. A future species-qualified form would need its own exact evidence and a label that does not silently make these unqualified phrases resolve to *C. sapidus*.

## Bundled recipe demand

The scan covered all **114** manifest-listed recipe files and **1,123** ingredient rows for soft-shell crab, `crabe mou`, `crabe à carapace molle`, blue crab, *Callinectes sapidus*, snow crab, and *Chionoecetes opilio*. It found **zero matching files and zero matching rows** for the candidate or the two species.

The only bundled crab-meat line is recipe [019, `Boulettes de crabe / Crab Balls`](../../../app/src/main/assets/seed/bundled-library/recipes/019-boulettes-de-crabe-crab-balls-135813a6-75e2-4596-8c71-ffd450fab0ca.v1.json), ingredient 8: `1 lb jumbo lump crab meat`, linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. This is a generic meat-grade request and does not support soft-shell crab, a species assignment, or a whole-crab yield. Restaurant menu use is product-context evidence, not bundled recipe demand.

## Identity, product, numeric evidence, and substitution limits

- **Identity:** The existing `ingredient-ref-blue-crab` owns OQLF’s *C. sapidus* name pair. La Mer describes its soft-shell product as Atlantic blue crab, but gives no binomial. The evidence suggests a blue-crab product without conclusively identifying the live product’s taxon; no separate generic soft-shell-crab identity is warranted.
- **Product/form:** The seller describes a live soft-shell crab that can be eaten whole. That is a product state, not a separate species. Do not attach an unqualified `soft_shell` form to `ingredient-ref-blue-crab` while its search terms would turn broad soft-shell phrases into blue-crab-only results.
- **Measurements:** La Mer shows a **$13.99** listing, but gives no unit, item mass, count basis, or serving basis; the listing is marked sold out at review. Price is not ingredient quantity. The one bundled **1 lb** measure belongs to crab meat/Jumbo Lump in recipe 019, not a soft-shell whole crab.
- **Numeric fisheries evidence:** DFO’s French report defines soft-shell snow crab using a carapace-hardness threshold of a **durometer reading below 68** [S07]. DFO’s current Québec plan also gives a **95 mm** legal carapace-width minimum for retained snow crab, while allowing relevant soft/white crab to be discarded [S06]. These are fishery/biological classifications for snow crab, not recipe measurements, edible-mass data, or thresholds for a culinary *C. sapidus* form.
- **Conversions and yield:** No whole-crab-to-meat, shell-on edible-yield, raw-to-cooked, frozen-to-thawed, piece-to-mass, or soft-shell-to-hard-shell conversion is supported. Do not infer yield from the word “whole” or from DFO shell-hardness rules.
- **Substitutions:** No global or contextual substitution is supported among soft-shell and hard-shell blue crab, snow crab, generic crab meat/Jumbo Lump, Dungeness crab, Jonah crab, or crab-flavoured pollock flakes. No recipe context or quantity ratio establishes interchangeability.

## Recommendation and exact integration delta

**Hold** the soft-shell crab product outside active references and forms for now. The local listing makes it a meaningful Québec product candidate and points toward blue crab, but its species statement is not taxonomically explicit, its French product wording is not uniquely scoped, the same `crabe mou` wording is used for snow crab, and the bundled corpus has no demand.

The exact current delta is **zero**: no new row in `ingredient-references.v1.json`, no form in `ingredient-forms.v1.json`, no alias, no candidate or source entry in the ledger, no recipe link, no measurement, no conversion, no yield, and no substitution. Keep `soft-shell crab`, `crabe mou`, and `crabe à carapace molle` unowned by the picker. Reopen if a recipe or product label identifies the intended species/product and the picker can preserve the common-name ambiguity; if evidence then points to *C. sapidus*, model it as a species-qualified form under `ingredient-ref-blue-crab`, not as a new species or generic identity.

## Source register

Sources were reviewed on 2026-10-13. IDs are local to this proposal and were not entered into the shared ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTION-P-SOFT-SHELL-CRAB-BOUNDARY-R78-20261013-S01** | Office québécois de la langue française, [GDT: crabe bleu](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198912/crabe-bleu). | Gives preferred `crabe bleu`, English `blue crab`, and *Callinectes sapidus*. Last updated 1998; supports naming/taxon, not current product availability. |
| **WP04-SECTION-P-SOFT-SHELL-CRAB-BOUNDARY-R78-20261013-S02** | Canadian Food Inspection Agency, [Fish List query for crab](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab). | Lists *C. sapidus* with blue-crab names and *C. opilio* with snow-crab names; broad crab names span many taxa. This is not a culinary-form or substitution source. |
| **WP04-SECTION-P-SOFT-SHELL-CRAB-BOUNDARY-R78-20261013-S03** | Poissonnerie La Mer, [Soft Shell Crab](https://www.lamer.ca/en/products/crabe-mou). | Current Québec fishmonger listing says the live item is soft-shell crab and describes the Atlantic blue crab’s moult; image alternative text is `Crabe mou`. No Latin name, net mass, count basis, or visible French product description is provided; item marked sold out at review. |
| **WP04-SECTION-P-SOFT-SHELL-CRAB-BOUNDARY-R78-20261013-S04** | Yama, [Menu souper](https://www.yamaresto.com/menu-souper). | Montréal menu uses `crabe mou en tempura`; the dish name does not identify crab species or a raw retail product. |
| **WP04-SECTION-P-SOFT-SHELL-CRAB-BOUNDARY-R78-20261013-S05** | Sushi Kampai (Brossard), [menu listing](https://www.fantuanorder.com/store/sushi-kampai/ca-1440976160). | Bilingual listing uses `Crabe à carapace molle / Soft-shell Crab`. This establishes local descriptive menu wording, not a species, product label, quantity, or recipe substitution. |
| **WP04-SECTION-P-SOFT-SHELL-CRAB-BOUNDARY-R78-20261013-S06** | Fisheries and Oceans Canada, Québec Region, [Snow Crab — Area 12F Season 2026](https://www.qc.dfo-mpo.gc.ca/en/snow-crab-area-12f-season-2026). | In a snow-crab-specific 2026 plan, states a soft-shell crab protocol and a 95 mm legal carapace-width rule. Fisheries management evidence, not a food form or household measure. |
| **WP04-SECTION-P-SOFT-SHELL-CRAB-BOUNDARY-R78-20261013-S07** | Fisheries and Oceans Canada, [Crabes des neiges du sud du golfe (PDF, French)](https://www.publications.gc.ca/collections/collection_2016/mpo-dfo/Fs76-1-C3-01-1997-fra.pdf), pp. 1–2. | Identifies *Chionoecetes opilio*, describes the soft-carapace post-moult state as `crabe mou`, and defines a fishery hardness boundary below a 68 durometer reading. Older stock report; not a current culinary product or recipe-measure source. |

## Static review record

- Re-read current `AGENTS.md`, the exact open Section P checklist line, live references/forms, legacy candidates, ledger, recipe manifest, and crab/product archive.
- Confirmed the R78 proposal path was unused and that no earlier crab soft-shell proposal or ledger record already owned the candidate.
- Recounted the live files: 1,402 references, 104 forms, 63 legacy candidates, 1,740 ledger records, 8 unit conversions, 114 manifest recipes, and 1,123 ingredient rows.
- Scanned all manifest-listed recipe ingredient rows for the candidate, French wording, and neighboring species; found no matching demand.
- Projected the current and counterfactual queries against the phrase-first behavior in `IngredientSearch.kt`; this is static analysis, not an emulator or runtime test.
- Checked current Québec/OQLF naming, CFIA fish-name scope, the local product page, local menu usage, and DFO snow-crab usage. The DFO numeric observations were kept separate from recipe measurements.
- No tests or emulator were run. This is proposal-only research; no integration or application changes were made.
- After writing, checked UTF-8 without BOM, final newline, trailing whitespace, mojibake markers, local Markdown links, and the changed-file path. No file other than this proposal is part of this R78 change.
