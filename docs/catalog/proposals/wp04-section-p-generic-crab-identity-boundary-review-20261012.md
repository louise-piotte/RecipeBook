# WP04 Section P — generic crab / crabe identity boundary review

- **Review and source access date:** 2026-10-12.
- **Scope:** the still-open generic crab identity beyond the active crab-meat identity and Jumbo Lump form; current ledger state; exact-key ownership; current Canadian and Québec species/product naming; recipe 019; and all manifest-listed recipes.
- **Recommendation:** hold a separate whole-crab or unqualified `crab / crabe` ingredient identity. Keep the accepted, species-unspecified edible-product identity `ingredient-ref-crab` (`crab meat / chair de crabe`) and its recipe-linked Jumbo Lump grade form unchanged.
- **Proposal status:** Reviewed and reconciled on 2026-10-12; root accepts the hold. No shared catalog, ledger, recipe, or generated file was changed. No tests were run because this was a review and documentation update only.

## Recommendation

Do not create a second generic `crab / crabe` reference or add bare `crab` / `crabe` aliases to the crab-meat reference. The current ledger does not contain a separate held generic-crab candidate: it contains a verified `ingredient-ref-crab` for **crab meat / chair de crabe**, with no bare crab/crabe aliases, and a verified `ingredient-form-crab-jumbo-lump` under that reference. Recipe 019#8 explicitly requests `1 lb jumbo lump crab meat` and already links to both records.

Québec terminology and Canadian product evidence support the words `crab / crabe`, but not one product scope for an additional consumer ingredient row. OQLF defines `crabe` across numerous decapod families. The CFIA Fish List returns the common pair `Crab / Crabe` for many different taxa and also lists species-specific names. A Canadian seafood guide groups snow crab and Dungeness crab under a broad crab category, while current Québec sellers distinguish named species and shell-on, cooked, frozen, section, and picked-meat products. These sources establish the broad category, but recipe 019 does not request an unspecified whole crab or a species-free crab product.

The exact normalized key `crab` is not owned by an exact reference/form/legacy phrase. However, current ingredient search treats it as a complete word inside `crab meat`, so a bare `crab` query already returns `ingredient-ref-crab`. The same word-phrase behavior applies to `crabe` within `chair de crabe`. A second bare-name row would make these queries resolve to both the existing meat product and a new generic row without clarifying which product a recipe needs. Keep whole/live/cooked crab, crab meat, species-named crab, imitation crab/surimi, and prepared crab balls/croquettes distinct.

Reopen only when a recipe or requested product establishes a use for an unqualified whole-crab ingredient and gives enough consumer context to choose a stable bilingual display. This hold adds no species, alias, form, recipe link, measurement, density, conversion, yield, or substitution behavior.

## Existing catalog and ledger state

| Record | Current state | Boundary retained |
|---|---|---|
| `ingredient-ref-crab` | Active reference; ledger `identityState: verified`; four source entries; measurement and substitution research `not_yet_researched`. | Display names are `crab meat / chair de crabe`; no aliases, species, density, or unit mappings. This is the broad edible crab-meat product, not a whole-crab identity. |
| `ingredient-form-crab-jumbo-lump` | Active form under `ingredient-ref-crab`; ledger `identityState: verified`; two source entries. | Represents the explicit Jumbo Lump commercial grade. No grade conversion, measure, density, yield, or substitution is established. |
| Separate generic `crab / crabe` ledger candidate | None. | The older Section P checklist called generic crab held; after the crab-meat integration there is no distinct `candidate-crab` record to promote or duplicate. |
| `candidate-surimi-product-boundary` | Held with `identityState: needs_clarification`; eight source entries. | Keep surimi paste and finished imitation-seafood products distinct. OQLF’s `similicrabe` entry remains evidence for the imitation boundary, not a crab alias. |
| `ingredient-ref-fish-balls` | Active identity, separate from crab meat. | A formed fish product; neither the recipe title `Crab Balls` nor the crab ingredient row makes this fish-ball identity applicable. |

## Species and market naming boundary

| Scope | Current evidence | Decision for this review |
|---|---|---|
| **Unqualified `crab / crabe`** | OQLF's food-crustacean entry covers many decapods in Cancridae, Portunidae, Majidae, Xanthidae, and other families. The CFIA Fish List search for `crab` returns many taxa with `Crab` and/or `Crabe`, including *Cancer borealis*, *Cancer irroratus*, *Metacarcinus magister*, several *Chionoecetes* species, and multiple king-crab taxa. | The broad term is linguistically valid, but it does not select a species or a recipe-stable product. Keep it unallocated as a separate ingredient identity. [reused `WP04-MOLLUSKS-20261009-S01`; S01; reused `WP04-FINFISH-ID-20261009-S06`] |
| **Snow crab / crabe des neiges** | OQLF scopes `crabe des neiges` to *Chionoecetes opilio* and says `crabe araignée` was not retained for Québec commercial fish labels to avoid confusion; a current Montréal retailer labels its 2026 collection by species. | Keep as species-specific naming, not an alias or a species assignment for generic crab. [S03, S05] |
| **Dungeness crab / crabe dormeur** | The Canadian seafood guide presents Dungeness and snow crab as two principal commercially harvested varieties; DFO's 2026–27 Pacific crab-by-trap plan lists Dungeness, Red Rock, red king, and golden king crab species in its regional fishery. | Keep named species and their market terms separate. The source scopes differ (Canadian consumer guide vs. Pacific fishery), and neither turns `crab` into a single species. [S02, S04] |
| **Québec rock crab / crabe commun** | Les Fruits de mer Madeleine sells locally caught *Cancer irroratus* as `crabe commun` and describes the product as little known among Québec consumers; its page specifies picked leg meat. | Keep the named local species and product distinct. It does not establish `crabe commun` as a synonym for every crab or as recipe 019's species. [S06] |
| **Crab meat / chair de crabe** | OQLF pairs the Québec food-product term with English `crab meat`; its trade note names several species. The current active reference already represents this broad edible product class without selecting a species. | Keep the accepted `ingredient-ref-crab` intact; do not broaden it with whole-crab aliases. [reused `WP04-CRAB-MEAT-20261011-S01`] |
| **Jumbo Lump** | The grade is a form under the active crab-meat reference and is explicitly requested in recipe 019#8. | Keep the recipe-specific form attached to crab meat; do not turn it into generic crab or a species identity. [reused `WP04-CRAB-MEAT-20261011-S04`–`S05`] |
| **Crab balls / croquettes** | Recipe 019 is titled `Boulettes de crabe / Crab Balls`, but its crab ingredient is only `jumbo lump crab meat`. OQLF defines a crab croquette as a prepared mixture of crab pieces, breadcrumbs, egg, and aromatics. | Treat the title as the prepared dish, not a separate crab-ball ingredient request. Do not add a crab-balls identity or link its title to a generic crab row. [S07; recipe 019] |
| **Imitation crab / similicrabe / surimi** | OQLF defines `similicrabe` as an imitation product. The separate ledger candidate `candidate-surimi-product-boundary` remains unresolved because terminology and retail labels distinguish paste inputs from finished imitation products. | Keep imitation crab and surimi separate from actual crab meat and any future whole-crab identity. Add no alias or substitution. [reused `WP04-CRAB-MEAT-20261011-S03`; current `candidate-surimi-product-boundary`] |
| **Live, cooked, frozen, section, and picked products** | La Mer's current 2026 snow-crab listing separately names live crab, fresh cooked sections, frozen sections, and frozen leg meat. | Treat these as product-specific market distinctions. This review does not promote them to global forms or infer preparation, yield, measure, or conversion behavior. [S05] |

The CFIA common-name guidance is commercial labeling guidance tied to the named species in the Fish List; it does not determine what an unqualified recipe ingredient means. The OQLF, CFIA, DFO, consumer-guide, and retailer evidence here supports category and naming boundaries only.

## Exact-key ownership and search behavior

The exact-key audit followed `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase; NFKD; fold `œ`, `æ`, `ß`, and `&`; remove combining marks; replace punctuation with spaces; and collapse whitespace. Exact ownership was checked across active ingredient-reference names/aliases, form labels/match terms, and legacy-import candidate names/aliases. Partial phrase and substring behavior was recorded separately.

| Normalized exact key | Active exact owner / state in this proposal snapshot |
|---|---|
| `crab`, `crabs`, `crabe`, `crabes`, `whole crab`, `live crab`, `cooked crab`, `crab meat`, `chair de crabe`, `jumbo lump crab meat`, `snow crab`, `crabe des neiges`, `dungeness crab`, `crabe dormeur`, `rock crab`, `crabe commun`, `king crab`, `crabe royal`, `imitation crab`, `similicrabe`, `crab balls`, `boulette de crabe`, `crab croquette`, `croquette de crabe`, and `surimi` | Exact active reference/form/legacy owner exists only for `crab meat` and `chair de crabe` → `ingredient-ref-crab`, and `jumbo lump crab meat` → `ingredient-form-crab-jumbo-lump`. No other listed phrase has an exact active reference, form, or legacy-candidate owner. `candidate-surimi-product-boundary` is a ledger hold, not an active key owner. |
| Bare `crab` query | No exact normalized field named `crab`; current search returns `ingredient-ref-crab` because `crab` is a complete word in the phrase `crab meat`. | This is search phrase matching, not an alias or an exact-key ownership claim. A new `crab` label would overlap the current crab-meat search result. |
| Bare `crabe` query | No exact normalized field named `crabe`; current search returns `ingredient-ref-crab` because `crabe` is a complete word in `chair de crabe`. | This is search phrase matching, not an alias or an exact-key ownership claim. A new `crabe` label would overlap the current crab-meat search result. |
| Recipe 019 title `Crab Balls` | No exact active ingredient reference/form/legacy owner for `crab balls` or `boulettes de crabe`. | The title is a prepared-dish name. Ingredient row 019#8 is already linked to the explicit crab-meat grade request. |

## Recipe demand audit

| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

| Recipe / row | Source text | Current link and interpretation |
|---|---|---|
| 019#8, `Boulettes de crabe / Crab Balls` | `1 lb jumbo lump crab meat` | `ingredient-ref-crab` + `ingredient-form-crab-jumbo-lump`. This is explicit crab meat of a named grade; it does not request bare crab, a shell-on crab, or a species. |

Recipe 019's other rows are binders, seasonings, and sauce ingredients. The recipe title and ingredient group `Crab balls` describe the prepared dish; neither is an ingredient row. No other manifest recipe contains a crab, crab-meat, crab-species, imitation-crab, crab-ball, or surimi ingredient request. No recipe link or relink is proposed.

## Refreshed package, ledger, generated-catalog, and corpus snapshot

Proposal-review snapshot read from the live worktree on **2026-10-12**. File hashes cover exact bytes. The recipe-corpus digest sorts manifest-listed recipe basenames and hashes each basename, a NUL byte, exact recipe-file bytes, and another NUL byte.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,221 references | `dbbbae79b74064e4989ab0057e304598595895fa7ab14735a07720517dd055c0` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,522 records; 5,156 source entries; 4,219 distinct source IDs | `a44a10bc8ec6c16f0fa0a47d0def0101025d59f89ca7af0faf687039c17e84f0` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `b70a826e18497a37ce343f6c98cafa143d573dd59704ea6022bb034b2640e5a2` |
| `BundledIngredientCatalog.kt` | 1,221 generated reference entries | `f555aa8491addb6d95be3e6256c21a3b90d50d30af2561c8d242d6189e38bcff` |

## Sources

All new sources below were accessed on 2026-10-12. Their proposal-local source IDs were checked for absence from the shared ledger and existing catalog proposal/batch files before use.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-GENERIC-CRAB-20261012-S01** | CFIA, [Fish List lookup for “crab”](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab) | The search returns 80 entries (Fish List modified 2023-09-18). `Crab` and `Crabe` are listed for multiple species, including *Cancer borealis*, *Cancer irroratus*, *Metacarcinus magister*, *Chionoecetes* species, and king-crab taxa. It is species-label evidence, not a recipe taxonomy. |
| **WP04-GENERIC-CRAB-20261012-S02** | Fisheries and Oceans Canada, [Pacific crab-by-trap fishery plan, 2026–2027](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/crab-crabe-ifmp-pgip-sm-eng.html) | Current Pacific fishery scope includes Dungeness (*Metacarcinus magister*), Red Rock (*Cancer productus*), red king (*Paralithodes camtschaticus*), and golden king crab (*Lithodes aequispinus*). The page says almost all crab caught on the BC coast are Dungeness. This is a regional fishery source, not a nationwide ingredient or market label. |
| **WP04-GENERIC-CRAB-20261012-S03** | OQLF, [crabe des neiges (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198901/crabe-des-neiges) | Scopes the normalized Québec commercial term `crabe des neiges` to *Chionoecetes opilio* and records that `crabe araignée` was not retained for Québec commercial fish-product labeling. This is species-specific terminology, not a generic-crab translation. |
| **WP04-GENERIC-CRAB-20261012-S04** | Choose Canadian Seafood, [Crabe](https://www.chooseseafood.ca/fr/seafood-guide/crab) | Current Canadian consumer guide presents snow crab and Dungeness as two principal commercially harvested varieties, with different regional habitats and product descriptions. The list is illustrative, not exhaustive or a regulatory taxonomy. |
| **WP04-GENERIC-CRAB-20261012-S05** | Poissonnerie La Mer (Montréal), [2026 snow-crab collection](https://www.lamer.ca/collections/crabe-des-neiges) | Current Québec listing uses the species name and separately offers live crab, fresh-cooked and frozen sections, and frozen leg meat. Availability changes; this retailer page does not establish universal forms or measures. |
| **WP04-GENERIC-CRAB-20261012-S06** | Les Fruits de mer Madeleine, [Chair de pattes de crabe commun](https://www.fruitsdemermadeleine.com/nos-produits/nos-crabes/crabe-commun/chair-de-crabe-commun) | Current Québec seller identifies its local `crabe commun` product as *Cancer irroratus* and says this crab is little known among Québec consumers. This is one named local species and picked-leg product, not evidence for a universal display. |
| **WP04-GENERIC-CRAB-20261012-S07** | OQLF, [croquette de crabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503150/croquette-de-crabe) | Defines a prepared dish made from crab pieces, breadcrumbs, egg, and seasonings. It supports keeping a crab-ball/croquette dish separate from its crab ingredient; it is not a catalog alias or recipe-line source. |

Reused ledger sources: `WP04-MOLLUSKS-20261009-S01` (OQLF, [crabe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488189/crabe)); `WP04-CRAB-MEAT-20261011-S01` (OQLF, [chair de crabe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488141/chair-de-crabe)); `WP04-CRAB-MEAT-20261011-S03` (OQLF, [similicrabe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199054/similicrabe)); `WP04-FINFISH-ID-20261009-S06` (CFIA, [Canadian common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names)); and `WP04-CRAB-MEAT-20261011-S04`–`S05` for the Jumbo Lump grade. These existing IDs are reused, not reissued as new proposal-local sources.

## Remaining Section P gaps

This review resolves no shared data and addresses only the open generic-crab boundary. Section P still has separate reviews for lobster, crayfish, langoustine, held clam, generic mussel beyond blue mussel, fresh oyster, generic/fresh scallop, unqualified cockle/coque and eel, and generic hake/pollock/bare `goberge`. Roe, fish powders, fish balls/surimi, regional aquatic foods, preserved-seafood product states, and measurement/substitution research remain separate. The accepted squid/calamari, cuttlefish/seiche, octopus/pieuvre, and crab-meat/Jumbo Lump decisions are not reopened here.

## Root review and reconciliation status

Root independently checked the live crab reference, Jumbo Lump form, ledger records, exact normalized owners, search behavior, recipe 019#8 linkage, and all 114 manifest-listed recipes. The boundary is supported: the existing crab-meat identity already answers bare `crab` and `crabe` searches through complete-word phrase matching, while the recipe asks for `jumbo lump crab meat`. A second generic row would add overlapping search results without a distinct recipe request. Root reviewed the current CFIA, OQLF, DFO, Canadian seafood-guide, Québec retailer, and OQLF croquette sources. No catalog or ledger data changed. See the [integration README](../batches/wp04-section-p-generic-crab-hold-integration-20261012/README.md) for current counts, hashes, and checks.
