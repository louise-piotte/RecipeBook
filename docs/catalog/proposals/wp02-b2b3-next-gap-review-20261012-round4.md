# WP02 B2 next gap review — chia flour process boundary

- **Reviewed:** 2026-10-12.
- **Status:** Integrated as a documentation-only process-boundary hold. No catalog, ledger, recipe, or generated file changed. See the [integration README](../batches/wp02-b2b3-chia-flour-process-boundary-hold-integration-20261012/README.md).
- **Scope:** One still-open B2 seed-derived flour candidate: chia flour. This review is separate from the accepted chia-seed identity and does not reopen its aliases or recipe link.
- **Source-ID prefix:** `WP02-B2-CHIA-FLOUR-PROCESS-20261012`; checked against the current ledger and proposal/batch archive before drafting; no collision found.

## Recommendation

**Keep unqualified `chia flour` and `farine de chia` unassigned until the intended processing scope is identified.** Current manufacturer and Québec retail pages use these exact phrases for a flour ingredient, but do not say whether it is milled whole chia seed or oil-press residue. Primary food-science sources distinguish whole chia flour, made by grinding whole seeds, from partially defatted chia flour made from the oil-extraction cake. The processes change ingredient composition and behavior in formulations, so the market phrase alone does not safely identify one catalog product. [S03–S07]

The exact French phrase `farine de chia` is observed in a Québec retailer's French ingredient listing. OQLF's entry for `chia` defines the plant *Salvia hispanica*, not a flour product or a flour-specific Québec term. Record the retailer phrase as local product wording, not as an OQLF ruling or proof of a process-matched Québec display. [S02, S04–S05]

Do not create or reserve `ingredient-ref-chia-flour` in this packet. Do not assign flour terms to `ingredient-ref-chia-seeds`, and do not add a candidate, alias, form, measurement, density, unit mapping, recipe link, conversion, yield, or substitution. Keep the broader WP02 B2/B3 checklist open.

## Product and naming boundary

| Phrase or material | Disposition | Evidence and limit |
|---|---|---|
| `chia flour` | Real ingredient wording; keep unassigned. | Queen St. Bakery names `Chia flour` as an ingredient in its Supergrain Chia Bread. Its public ingredient listing does not identify the flour's milling or oil-removal process. It is a formulated bread ingredient, not a flour package specification. [S03] |
| `farine de chia` | Record as observed Québec-facing wording; keep unassigned. | La Moisson, a Québec retailer, uses this phrase in the French ingredient list for the same bread product. Its listing does not publish a flour process specification or a flour-specific terminology ruling. [S04–S05] |
| Whole chia flour | Keep as a documented process candidate, not an active row. | A primary study makes whole chia flour by mechanically grinding whole seeds. This is distinct from the study's partially defatted commercial flour. The market listings above do not confirm that their ingredient is this material. [S06] |
| Partially defatted / defatted chia flour | Keep separate from whole-ground chia; no active row proposed. | Primary studies describe chia flour produced from the seed-oil press cake, with further processing varying by study. This is not an alias or conversion of whole chia flour. [S06–S07] |
| `chia seed flour`, `chia powder`, `ground chia`, `milled chia`, or `chia meal` | Leave unassigned. | The reviewed sources do not establish these as stable, process-neutral aliases for one flour grade. A ground-seed flour, oil-extraction meal, and powder listing should not be collapsed by wording alone. |
| Existing `ingredient-ref-chia-seeds` | Keep unchanged. | The active identity is `chia seeds / graines de chia`, with aliases `chia seed` and `graine de chia`. The prior seed review explicitly kept flour, powder, meal, and other processing terms outside its alias scope. [S01] |

## Current catalog, ledger, and recipe audit

Read-only snapshot from the shared worktree on 2026-10-12:

| Surface | Snapshot |
|---|---|
| Active ingredient references | 1,308; SHA-256 `3023a940cc0cbebed7c57daffc4c544bd37ed7646b3e0cfc000bc0bda82b49e6` |
| Ingredient forms | 98; SHA-256 `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64; SHA-256 `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research-ledger records | 1,616; SHA-256 `4f85c73a2c862afe85d727a030880cc3650318326d168cce7a2ccdbb6529bdbc` |
| Manifest-listed recipes / ingredient rows | 114 / 1,123; recipe-file bytes 753,792; manifest-order fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The normalized exact-key audit across active reference names and aliases, form labels and match terms, and legacy candidate names and aliases found no exact owner for `chia flour`, `chia seed flour`, `whole chia flour`, `whole chia seed flour`, `partially defatted chia flour`, `semi-defatted chia flour`, `defatted chia flour`, `chia powder`, `ground chia`, `milled chia`, `farine de chia`, `farine de graines de chia`, or the reviewed French defatted variants. The only active reference with chia wording is `ingredient-ref-chia-seeds`; no chia-flour form or flour candidate record exists in the catalog, forms, legacy file, or ledger.

The 2026-10-11 WP03 chia-seed identity review is the only focused chia product review found. It verifies the seed row and explicitly excludes chia flour, powder, and meal from that seed identity's aliases; it does not decide a flour identity. A repository search found no prior focused chia-flour proposal or matching source-ID prefix.

All 114 manifest-listed recipe JSON files and 1,123 ingredient rows were scanned for the flour and process-qualified English and French phrases above, along with `chia powder`, `ground chia`, and `milled chia`. There were **zero direct flour/powder phrase hits and zero recipe-row hits**. The bundle has one chia row, recipe 065's `1/8 part chia seeds`, already linked to `ingredient-ref-chia-seeds`. That row is whole-seed demand and provides no flour measure or recipe link. [S01]

## Measurement and substitution boundaries

- Health Canada's Canadian Nutrient File lists volume-to-mass portions for **dried chia seeds** (including 15 mL = 10.8 g and 60 mL = 43.2 g). These observations describe the seed food code, not flour; do not copy them to whole-ground or defatted chia flour. The flour listings and studies reviewed here provide no transferable household cup weight or app-ready density. [S08]
- The primary digestion study reports composition and particle-size observations for its own whole and partially defatted flour samples. Those lab results do not establish a general g/mL conversion or kitchen scoop measure. [S06]
- Bread studies test chia seed, whole flour, and defatted flour in particular formulas at selected flour-basis levels. One study adjusts vital gluten alongside whole chia flour; another compares multiple chia material states in bread. These formulation trials do not establish a universal wheat-flour replacement ratio, volume-for-volume replacement, or substitution for other flours and recipes. Add no global or contextual substitution rule. [S07]

## Recommended outcome

Keep the chia-flour candidate open. Before integration, obtain a current Canadian/Québec product specification that says whether the intended flour is whole-seed milled or oil-press residue, then confirm the French display for that same process. Keep measurements and substitutions separate from identity: the current sources support neither a reusable household measure nor a transferable replacement ratio. Add no active row, alias, form, numeric behavior, or recipe association from this proposal.

## Integrated outcome

Root independently rechecked the OQLF botanical entry, Queen St. Bakery's ingredient list, La Moisson's Québec French listing and store address, the two primary flour-processing studies, and Health Canada's chia-seed portions on 2026-10-12. The sources support the process distinction and the observed retail wording, but do not identify the bread's chia-flour process or establish a Québec French name for either process-defined flour. The hold is recorded in the integration README, plan, and roadmap. Catalog, ledger, recipe, and generated files remain unchanged.

## Source register

All live pages and documents were accessed on 2026-10-12. Source IDs are local to this proposal and are not ledger records.

| ID | Source | Supports | Limits |
|---|---|---|---|
| **WP02-B2-CHIA-FLOUR-PROCESS-20261012-S01** | Prior repository review: [WP03 chia-seed identity review](wp03-chia-seed-identity-review-20261011.md). | Records the verified seed identity and explicitly excludes chia flour, powder, and meal from its seed aliases. | Does not review or name a chia-flour identity. |
| **WP02-B2-CHIA-FLOUR-PROCESS-20261012-S02** | Office québécois de la langue française, [*chia* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26505019/chia), last updated 2013. | Gives Québec French `chia`, English `chia`, and Latin *Salvia hispanica*; defines the plant as producing edible seeds. | Botanical entry only; no flour product definition or flour-specific French display. |
| **WP02-B2-CHIA-FLOUR-PROCESS-20261012-S03** | Queen St. Bakery, [*Supergrain Chia Bread*](https://queenstreetbakery.com/en-us/products/chia-classic-box), current manufacturer product page. | Lists `Chia flour` among the bread ingredients and gives a 480 g loaf/package description. | Composite bread listing; no standalone flour package, source/process specification, flour measure, or density. |
| **WP02-B2-CHIA-FLOUR-PROCESS-20261012-S04** | La Moisson, [*Pain classique au chia*](https://lamoisson.com/products/pain-au-chia-supergrain), current French retail listing. | Lists `farine de chia` as an ingredient in the Supergrain Chia Bread; exact French phrase observed in Québec retail context. | Ingredient-list wording only; no flour-specific process specification or terminology ruling. |
| **WP02-B2-CHIA-FLOUR-PROCESS-20261012-S05** | La Moisson, [store information](https://lamoisson.com/pages/contact) and [about page](https://lamoisson.com/pages/a-propos-about-us). | Identifies its store at Sainte-Thérèse, Québec, and describes its Québec grocery business; establishes the local context for S04. | Establishes the retailer's location, not the bread's manufacture or the flour's process. |
| **WP02-B2-CHIA-FLOUR-PROCESS-20261012-S06** | Calvo-Lerma et al., [“Impact of Processing and Intestinal Conditions on in Vitro Digestion of Chia (*Salvia hispanica*) Seeds and Derivatives,” *Foods* 9(3), 290 (2020)](https://doi.org/10.3390/foods9030290). | Primary study grinds whole chia seeds into whole flour and distinguishes it from commercially purchased partially defatted flour produced as a by-product of chia-oil pressing. Its sample composition differs by processing state. | Study materials and measurements are source-specific; no Canadian product naming, household measure, catalog density, or general substitution. |
| **WP02-B2-CHIA-FLOUR-PROCESS-20261012-S07** | Miranda-Ramos, Millán-Linares, and Haros, [“Effect of Chia as Breadmaking Ingredient on Nutritional Quality, Mineral Availability, and Glycemic Index of Bread,” *Foods* (2020)](https://pubmed.ncbi.nlm.nih.gov/32443838/). | Primary bread study compares chia seeds, whole chia flour, semi-defatted flour, and low-fat flour in specified bread formulations at selected flour-basis levels. | Formula-specific trial; does not establish a transferable replacement ratio or a cross-recipe substitution. |
| **WP02-B2-CHIA-FLOUR-PROCESS-20261012-S08** | Health Canada, [Canadian Nutrient File: *Seeds, chia seeds, dried* (food code 2511)](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2511). | Gives bilingual seed-food naming and seed-specific portions, including 15 mL = 10.8 g and 60 mL = 43.2 g. | The measures apply to dried chia seeds, not chia flour or press-cake meal. |

## Static checks

Static checks performed: current catalog/form/legacy/ledger counts and hashes captured; exact-name ownership checked across references, forms, and legacy candidates; prior chia reviews/holds and source-ID prefix searched; all manifest-listed recipe files and ingredient rows scanned for candidate phrases; proposal encoding and source-register checks recorded after drafting. No tests or emulator checks were run because this documentation-only hold changes no database JSON or application code.
