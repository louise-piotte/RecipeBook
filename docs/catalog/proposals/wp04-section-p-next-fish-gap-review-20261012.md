# WP04 Section P — lake trout / touladi identity review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** proposal-only species identity, Québec naming, package/ledger collision, and recipe-demand review.
- **Disposition:** Recommend an identity-only `PROTEIN` reference for lake trout / touladi (*Salvelinus namaycush*), with `lake charr` as the only English alias. Do not add bare `trout`, `truite`, `char`, or `omble` aliases. The 114-recipe corpus has no matching request; this is a bounded coverage addition, not a recipe link.
- **Worktree scope:** This proposal file only. No bundled catalog JSON, ledger, recipe, roadmap, checklist, generated file, or test was changed. No tests or emulator checks were run.

## Bounded recommendation

Add one species-scoped identity:

| Candidate ID | Category | English display | fr-CA display | English aliases | French aliases | Taxon |
|---|---|---|---|---|---|---|
| `ingredient-ref-lake-trout` | `PROTEIN` | **lake trout** | **touladi** | `lake charr` | None | *Salvelinus namaycush* |

OQLF's edible-fish entry directly pairs normalized Québec `touladi` with `lake trout` and *S. namaycush*. It also lists `lake charr` as an English term for the same species. DFO's current English and French profiles independently use `Lake Trout` / `Touladi` with the same taxon. CFIA lists *S. namaycush* under `Lake Trout`, `Char / Touladi`, `Grey Trout`, and unqualified `Trout` rows. The paired display follows OQLF and DFO; only the OQLF-supported species-qualified English variant is proposed as an alias.

This is a naming identity only. It does not imply that lake trout is currently offered by a Québec retailer, is available from a particular fishery, or may be harvested or sold in a given place. OQLF says the species has commercial potential in Québec but that the commercial exception there is incidental capture in commercial fisheries. DFO describes commercial, recreational, and subsistence fisheries elsewhere in its Canada-wide profile. Follow applicable sourcing rules; the catalog row would not be sourcing guidance.

## Name scope and boundaries

- Keep the identity limited to *Salvelinus namaycush*. Use `lake trout / touladi` as the bilingual display pair and `lake charr` only as a species-qualified English search alias.
- Do not add bare `trout` or `truite`. OQLF distinguishes four Québec salmonids called truites, while CFIA's Fish List applies unqualified `Trout` to multiple taxa. A bare query may retrieve the species-qualified displays, but that does not make the short word a safe stored alias.
- Do not add bare `char`, `charr`, or `omble`. The active Arctic char row is *Salvelinus alpinus* / `omble chevalier`; other char and trout names in CFIA refer to separate species.
- Do not add `grey trout` or `truite grise`. CFIA has an English `Grey Trout` row for *S. namaycush*, but OQLF says `truite grise` was not retained for Québec fish-product marketing, preferring a normalized name that avoids consumer-label confusion. These terms are unnecessary beside the selected pair.
- Keep brook trout (*Salvelinus fontinalis*), brown trout (*Salmo trutta*), rainbow trout (*Oncorhynchus mykiss*), and Arctic char (*S. alpinus*) distinct. The name evidence does not establish a common identity, recipe interchangeability, or a substitution among them.
- Keep the existing salmon-fillets and tuna product/ingredient references, American shad, and all Section P shellfish and cephalopod decisions unchanged. In particular, this finfish identity does not overlap the integrated American shad or octopus rows or the reviewed generic-clam hold.

## Prior work and open checklist fit

The global plan keeps the Section P finfish line open for species and regional-fish coverage. The finfish coordinator review expressly listed touladi among distinct Québec trout species and warned against a generic trout/truite identity; it did not propose a lake-trout row. The later rainbow-trout review integrated only *O. mykiss* / `truite arc-en-ciel`. Freshwater-finfish work added walleye, northern pike, and yellow perch, while the latest Section P checkpoints added Pacific cod, lake whitefish, and American shad. No existing packet allocates `ingredient-ref-lake-trout`, proposes `lake trout / touladi`, or resolves *S. namaycush* as a catalog identity.

This candidate is separate from the active Arctic char and rainbow trout references, and from all reviewed Section P shellfish, cephalopods, preserved products, and generic clam boundaries. It does not revise the broad salmon/tuna species-scope review or infer a species for an existing recipe.

## Live package, exact-key, and source-ID audit

Snapshot read from the live worktree on 2026-10-12. File hashes cover exact bytes. The corpus digest iterates `manifest.v1.json`'s `recipeFiles` in stored order and hashes each relative path, a NUL byte, exact recipe bytes, and a NUL byte.

| Artifact | Current count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,243 references | `9be692678b8bd18ea4e64ef478e27a2c6824a0738a21097192c378a4fa2ad0e9` |
| `ingredient-forms.v1.json` | 91 forms | `a8f7634add93654cf144d4d8ed5ef9346b0acc73ddbba1b3f455bac8adc6aad7` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,546 records; 5,359 source entries; 4,399 distinct source IDs | `883c30b801c58ab7abd3cedde317ffc25c7bc191d39e12ed2dab5bb5d513e5ae` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,543 recipe-file bytes | `cf9185da118727a2f0584352af4cfa4625090be2ae5792fd1be253d48b70d23a` |

The exact-key audit mirrors `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase, NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. It checked exact normalized keys across active reference names and aliases, form labels and match terms, legacy-candidate names and aliases, and ledger record IDs.

| Candidate or boundary key | Exact current owner | Decision |
|---|---|---|
| `lake trout`, `touladi`, `lake charr`, *Salvelinus namaycush* | None | Proposed display, alias, French display, and taxon are unowned. |
| `ingredient-ref-lake-trout`, `candidate-lake-trout` | Neither ID exists among reference, form, legacy-candidate, or ledger-record IDs. | Proposed reference ID is available; there is no existing candidate record to promote. |
| `trout`, `truite`, `char`, `charr`, `omble`, `grey trout`, `truite grise` | No exact stored-name owner for these keys. | Do not add them as aliases. A query may still match a word within an active species display, including the existing rainbow-trout and Arctic-char rows. |

The proposal-local IDs `WP04-NEXT-FISH-GAP-20261012-S01` through `S04` were checked against every source ID in the live ledger and existing catalog proposal/batch Markdown files before drafting; none was already assigned. Reused project decisions are linked by file and are not reissued as source IDs.

## Full recipe-demand audit

All 114 manifest-listed recipe files and all 1,123 ingredient rows were read. The scan checked each row's ingredient name, original text, reference/form identifiers, every parsed string in each recipe JSON file, and the complete file text. Whole-word normalized phrases included `lake trout`, `touladi`, `lake charr`, *Salvelinus namaycush*, `grey trout`, `truite grise`, and the broad terms `trout` and `truite`.

**Result: zero matching ingredient rows and zero matching recipe files.** The bundle therefore supplies no exact lake-trout ingredient demand, recipe link, form, portion, product state, measurement, or recipe-scoped substitution. The identity recommendation is limited to Section P species coverage; it does not relink an unqualified salmon, tuna, or generic fish line.

## Measurements and substitutions

OQLF and the DFO profiles establish a name, taxon, and fisheries context. Their biological descriptions, catch context, and conservation discussion do not establish culinary amounts. This review found no source-backed recipe measure or substitution basis for *S. namaycush*. If accepted, keep `defaultDensity` null and `unitMappings` empty; add no form, measure observation, edible yield, conversion, recipe link, or global/contextual substitution.

## Recommended integration delta

1. Add `ingredient-ref-lake-trout` in `PROTEIN` with English display `lake trout`, fr-CA display `touladi`, English alias `lake charr`, and no French aliases.
2. Add a verified identity ledger record with the four source entries below. Keep sourcing and Québec commercial-availability caveats in the evidence; do not encode them as a general legal or availability claim.
3. Record that this is identity-only and that the bundled corpus has no matching recipe request. Do not attach a recipe link, form, measure, density, unit mapping, conversion, yield, or substitution.
4. Keep bare trout/char terms and the other trout/char species rows separate. Leave all other Section P work open.

## Sources

Sources were accessed on 2026-10-12. IDs below are proposal-local and are not live ledger additions.

| Source ID | Primary Québec / Canadian source | Evidence and limits |
|---|---|---|
| **WP04-NEXT-FISH-GAP-20261012-S01** | OQLF, [touladi, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198855/touladi) | In the edible-fish domain, pairs normalized Québec `touladi` with English `lake trout` and *S. namaycush*. Lists `lake charr` as another English term; says `truite grise` and `omble` were not retained for Québec fish-product marketing. Also describes limited Québec commercial exceptions. Terminology and local market-scope evidence, not a sourcing authorization. |
| **WP04-NEXT-FISH-GAP-20261012-S02** | Fisheries and Oceans Canada, [Lake Trout (*Salvelinus namaycush*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/lake-trout-touladi-eng.html) | Current English species profile confirms the English name and taxon and describes Canadian distribution and commercial, recreational, and subsistence fisheries. It reports population pressures; it provides no recipe measure, edible yield, or culinary substitute. |
| **WP04-NEXT-FISH-GAP-20261012-S03** | Pêches et Océans Canada, [Touladi (*Salvelinus namaycush*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/lake-trout-touladi-fra.html) | Current French profile confirms the Québec-facing name and same taxon and provides the French counterpart to DFO's Canadian species/fishery profile. Biological size and fishery information are not recipe measurement evidence. |
| **WP04-NEXT-FISH-GAP-20261012-S04** | CFIA, [Fish List: Lake Trout query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Lake%20Trout&wbdisable=true) | Lists *S. namaycush* under separate `Lake Trout`, `Char / Touladi`, `Grey Trout`, and `Trout` name rows. Supports the taxon and illustrates why the chosen species-qualified pair is safer than adding bare `trout`/`truite` or `truite grise` aliases. The Fish List is Canadian fish-label naming evidence, not a recipe equivalence standard. |

Prior-work context: [finfish identity coordinator review](wp04-finfish-identity-coordinator-review-20261009.md), [freshwater-finfish gaps review](wp04-freshwater-finfish-gaps-20261010.md), and the current [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt). Those packets are not reissued as lake-trout sources.
