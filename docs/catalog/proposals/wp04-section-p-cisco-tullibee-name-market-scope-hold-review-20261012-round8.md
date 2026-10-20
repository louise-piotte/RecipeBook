# WP04 Section P — cisco / tullibee naming and market-scope hold

- **Review and source-access date:** 2026-10-12.
- **Packet type:** Proposal-only fish identity, Québec naming, picker-scope, regional product, and recipe-demand review.
- **Disposition:** Hold `ingredient-ref-cisco-artedi` unallocated. CFIA supports a species-specific *Coregonus artedi* name pair, but the current picker would also return that one species for bare `cisco`; OQLF uses `cisco` / `corégone` for multiple *Coregonus* species. A current Manitoba listing for smoked tullibee does not state a taxon or French name. Do not add a reference, alias, form, recipe link, measurement, conversion, yield, or substitution.
- **Worktree scope:** This proposal file only. Shared catalog JSON, ledger, plan, roadmap, recipes, generated files, and application code were read only.

## Candidate and boundary

The Section P checklist keeps regional fish coverage open after the recent lake-whitefish integration. The unresolved candidate here is lake herring / cisco de l’Est, *Coregonus artedi*. Lake whitefish / grand corégone (*C. clupeaformis*) remains a separate identity. Arctic cisco (*C. autumnalis*) is another separate species and is not part of this candidate.

The CFIA Fish List assigns **Lake Herring / Cisco de l’Est**, **Cisco / Cisco**, and **Tullibee** (no French name in that row) to *C. artedi*. It separately lists Arctic Cisco / Cisco Arctique for *C. autumnalis*, and applies a Cisco French name to other *Coregonus* rows as well. The OQLF GDT describes cisco / corégone as a group covering diverse *Coregonus* species, including *C. artedi*, lists English `lake herring`, `cisco`, and `tullibee` as translations of *Coregonus* sp., and says `hareng de lac` and `poisson blanc` were not retained for Québec commercial fish-product labelling. The sources therefore support a distinct taxon but leave the bare English/French names broad enough to make a species-only picker result risky.

| Unallocated candidate ID | Category | CFIA species-specific name pair, if later approved | Taxon | Aliases proposed |
|---|---|---|---|---|
| `ingredient-ref-cisco-artedi` | `PROTEIN` | `lake herring` / `cisco de l’Est` | *Coregonus artedi* | None |

This is a provisional name pair for review, not an active catalog recommendation. In particular, do not add bare `cisco`, `corégone`, `tullibee`, `lake herring` as an alias to a different display, `hareng de lac`, `poisson blanc`, or the taxon name as aliases. A picker change that preserves the distinction between a generic/group query and a species-qualified choice, or a product/recipe source that explicitly names the taxon and intended name, would allow the candidate to be reconsidered.

## Prior work and current ownership

The current plan leaves the broader Section P fish-powder, fish-ball, surimi, and regional-seafood review open. The lake-whitefish identity review names cisco species as separate from *C. clupeaformis*; that boundary mention does not allocate cisco. A search of the Section P proposal and batch archive found no focused *C. artedi*, cisco, lake-herring, or tullibee allocation or hold. The recent cisco mentions in the lake-whitefish decision and goldeye review are boundary references only.

The exact-key check followed `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase; Unicode NFKD; fold `œ`, `æ`, `ß`, and `&`; remove combining marks; convert punctuation to spaces; and collapse whitespace. It checked active-reference IDs, displays, and aliases; form IDs, labels, and match terms; legacy-candidate IDs, names, and aliases; and ledger record IDs. Source text was also searched for focused prior work.

| Phrase or key | Exact active reference / form / legacy / ledger-record owner | Finding |
|---|---|---|
| `cisco`; `cisco de l’Est`; `cisco de l'Est`; `cisco de lac`; `lake herring`; `hareng de lac`; `tullibee`; `smoked tullibee` | None | No exact stored owner. |
| *Coregonus artedi*; *Coregonus autumnalis*; `Arctic cisco`; `Cisco Arctique` | None | Taxa and Arctic-cisco names are source evidence only; no catalog identity is allocated. |
| `ingredient-ref-cisco-artedi` | None | Proposed ID is unused in references, forms, legacy candidates, and ledger record IDs. |
| `corégone` | No exact stored field owner | The phrase-first picker returns `ingredient-ref-lake-whitefish` because its French display is `grand corégone`; this is an embedded display phrase, not a cisco allocation. |
| `poisson blanc` | None | No exact owner or current picker result; keep this broad culinary/market wording out of the candidate. |

The only ledger decision that names cisco is the lake-whitefish decision, which explicitly keeps cisco species separate. The active catalog contains adjacent but distinct lake whitefish / grand corégone, Atlantic herring, Pacific herring, goldeye, fish balls, and Bonga dried fish powder rows. None owns the candidate names or taxon. No form is attached to a cisco candidate. The source prefix `WP04-CISCO-TULLIBEE-SCOPE-20261012-R8-S` and each source ID below were absent from the live ledger and existing proposal/batch files before assignment.

### Live snapshot

Counts and exact-byte SHA-256 hashes below were read from the shared worktree on 2026-10-12. The recipe corpus digest follows the manifest’s stored `recipeFiles` order and hashes each relative path, a NUL byte, exact recipe bytes, and another NUL byte.

| Artifact | Count / exact byte size | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,317 references; 421,694 bytes | `6427dd4cf5c2f5e94292b843255aec2b2cfe3517af1f3ef9aa99f407663c464f` |
| `ingredient-forms.v1.json` | 98 forms; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,625 records; 5,963 source entries; 4,980 distinct source IDs; 5,914,722 bytes | `4b06543735ef656679d3025939b535eb918d965a0190b67daddd412c4b7170bd` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Picker behavior and identity decision

The current `IngredientReferenceSearchIndex` searches reference displays and aliases together with attached form labels and match terms. It returns complete normalized word-phrase matches before substring fallback; therefore a phrase contained within a displayed name can be selected by itself.

| Query | Current picker | If the provisional pair were added | Decision |
|---|---|---|---|
| `cisco` | None | `ingredient-ref-cisco-artedi` via the `cisco` phrase inside `cisco de l’Est` | Hold: OQLF and CFIA use cisco across multiple *Coregonus* species, so one species-only result would over-narrow the query. |
| `cisco de l’Est` / `lake herring` | None | `ingredient-ref-cisco-artedi` | CFIA pairs these names with *C. artedi*, but OQLF also maps bare `lake herring` to *Coregonus* sp.; a one-species result would over-narrow that query. The French species pair is not an OQLF-specific entry in the sources reviewed. |
| `tullibee` / `smoked tullibee` | None | No result unless `tullibee` is added as an alias or form term | Do not add the regional term as a bare alias or create a smoked form from one local listing. |
| `Arctic cisco` / `Cisco Arctique` | None | None | Preserve *C. autumnalis* as a distinct, unreviewed species. |
| `corégone` | `ingredient-ref-lake-whitefish` | The proposed row would not resolve the generic term by itself | Existing picker result demonstrates that phrase matching can expose a single species for a broader query. |
| `poisson blanc` | None | None | Do not use broad pale-fleshed-fish wording to select a species. |

Do not use the candidate to resolve an unqualified recipe or import line containing only `cisco`, `tullibee`, `lake herring`, or generic `fish`. Keep *C. artedi* separate from lake whitefish, Arctic cisco, other cisco-named *Coregonus* taxa, Atlantic/Pacific herring, goldeye, fish balls, fish powder, and surimi.

## Full recipe-corpus demand and linked-reference audit

All 114 recipe paths in the current manifest were read in manifest order. The audit inspected all 1,123 ingredient rows and every parsed string in each complete recipe file for `cisco`, `cisco de l’Est`, `lake herring`, `hareng de lac`, `tullibee`, `smoked tullibee`, *C. artedi*, *C. autumnalis*, Arctic-cisco names, `corégone`, and `poisson blanc`.

**Result: zero matching ingredient rows and zero matching recipe files.** No recipe line links to a candidate reference or form, asks for this species or smoked tullibee, or supplies an amount, preparation, cooking method, or serving context. Nearby seafood demand is not interchangeable evidence: recipe 019#8 asks for jumbo-lump crab meat; 077#10 asks for salmon fillets; 093#4 has the unlinked phrase “Cooked meat or seafood, to taste”; 093#6 and 095#5 use fish sauce; and 111#1 asks for tuna steak.

## Regional product, measures, forms, and substitutions

- **Market scope:** CFIA Fish List naming establishes acceptable Canadian fish-label names, not a sales inventory. DFO’s 2023 report covers a Yellowknife River *C. artedi* fishery using data through 2020; it is local fishery evidence, not evidence of current Canadian retail distribution. Smith’s Fish Ltd. currently lists **Smoked Tullibee** at its Gimli, Manitoba shop and says its products are harvested from Lake Winnipeg waters and processed on site. That one regional listing does not state a scientific taxon, French product name, package specification, or fresh product identity. It supports only a local smoked-fish product, not a national market or universal `smoked` form.
- **Measures:** Health Canada Table 8 has generic entries `Cisco (lake herring, tullibee), raw` at a 90 g table measure and `Cisco (lake herring, tullibee), baked or broiled` at 75 g. The table does not identify a *C. artedi* taxon or a particular retail product. Retain these as generic food-table observations only; do not attach them to the unallocated species, treat them as recipe quantities, or infer a raw-to-cooked conversion. DFO’s 10.0–139.6 g round-weight observations are biological measurements from one population, not edible portions or count conversions. Smith’s price per pound is not a package amount or serving size.
- **Forms and numeric behavior:** Add no whole, fresh, fillet, cooked, or smoked form; density; unit mapping; edible yield; cooking yield; or conversion. A single smoked product listing does not define a catalog-wide state for *C. artedi*.
- **Substitutions:** The live global and contextual substitution-rule files each contain zero rules. No recipe requests the candidate, and none of the reviewed sources gives a dish-, method-, direction-, and quantity-adjusted substitution. Do not infer a substitute from lake whitefish, herring, Arctic cisco, goldeye, or other fish.

The current Canadian Nutrient File page states that its accessible food-search interface contains the 2015 CNF and is not being updated while Health Canada works toward user-friendly access to CNF 2026. The current 2026 file-level lookup was not completed through the available browser, so this review makes no claim about whether it contains a more specific *C. artedi* food or measure.

## Recommended disposition

Keep `ingredient-ref-cisco-artedi` unallocated. The species-specific CFIA names are supported, but the app would make bare `cisco` return that single species through the proposed French display, while CFIA and OQLF show that the broader word spans additional species. The local smoked-tullibee listing does not cure that identity ambiguity or establish a Québec French product name. Revisit if the picker can preserve broad/group and species-specific choices, or if a recipe/product source supplies an unambiguous species-qualified request and label. Add no reference, alias, form, ledger candidate, recipe link, measure, conversion, yield, or substitution from this review.

## Sources

Source IDs are proposal-local, unique within the live ledger and proposal/batch archive, and are not ledger additions. Sources were checked on 2026-10-12.

| Source ID | Primary or regional source | Evidence and limits |
|---|---|---|
| `WP04-CISCO-TULLIBEE-SCOPE-20261012-R8-S01` | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | The available Fish List result (last modified 2023-09-18) lists *C. artedi* as Lake Herring / Cisco de l’Est, Cisco / Cisco, and Tullibee; lists Arctic Cisco / Cisco Arctique for *C. autumnalis* and Cisco for several other *Coregonus* taxa. The overview says the names are acceptable common names for Canadian fish labelling. The list is nomenclature, not proof of product availability or recipe demand. The lookup result was available in official browser search output; direct opening of the query endpoint did not render. |
| `WP04-CISCO-TULLIBEE-SCOPE-20261012-R8-S02` | OQLF, [GDT: cisco](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198956/cisco) | In zoology/ichthyology and edible-fish domains, describes cisco/corégone as covering diverse *Coregonus* species including *C. artedi* but excluding lake whitefish. It prefers `cisco` and `corégone`; says `hareng de lac` and `poisson blanc` were not retained for Québec fish-product marketing because the label term should correspond to a specific species. Terminology entry last updated 2011; no current retail evidence. |
| `WP04-CISCO-TULLIBEE-SCOPE-20261012-R8-S03` | Health Canada, [Nutrient Value of Some Common Foods, Table 8: Fish and Shellfish](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-8-fish-shellfish-nutrient-value-some-common-foods-2008.html) | Shows generic cisco raw at 90 g and baked/broiled at 75 g under `Cisco (lake herring, tullibee)`. It gives no species binomial or source product; these values are not proposed as candidate portions or a conversion. |
| `WP04-CISCO-TULLIBEE-SCOPE-20261012-R8-S04` | Fisheries and Oceans Canada, [Yellowknife River Cisco report, 1999–2020](https://publications.gc.ca/site/eng/9.926346/publication.html) | Identifies *C. artedi* and reports one local commercial fishery through 2020. The report’s length and round-weight data describe fish biology; they are not household measures, current retail evidence, or recipe substitutions. |
| `WP04-CISCO-TULLIBEE-SCOPE-20261012-R8-S05` | Smith’s Fish Ltd., [current product listing](https://www.smithsfish.com/) | Lists `Smoked Tullibee` and says products are harvested from Lake Winnipeg and processed locally in Gimli. This is one current seller listing with no taxon, French name, package amount, or recipe measure. |
| `WP04-CISCO-TULLIBEE-SCOPE-20261012-R8-S06` | Health Canada, [Canadian Nutrient File search page](https://food-nutrition.canada.ca/cnf-fce/newSearch) | States that the accessible search contains the 2015 CNF and is not being updated while user-friendly access to the CNF 2026 dataset is being developed. This documents the current-file retrieval limit; it does not establish the contents of CNF 2026. |

No tests or emulator checks were run for this proposal-only review. Static checks covered exact normalized ownership, candidate/source-ID uniqueness, phrase-first picker behavior in the current code, all 114 manifest-listed recipe files and 1,123 ingredient rows, active forms and substitution files, current catalog/ledger counts and exact-byte hashes, and UTF-8/no-BOM safety of this proposal.
