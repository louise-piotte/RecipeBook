# WP03 Section F R744 — prepared kasha identity and picker boundary

- **Reviewed:** 2026-10-18.
- **Disposition:** Hold the existing `ingredient-ref-kasha` candidate outside active references. Keep the current roasted-dry-buckwheat-groats row unchanged.
- **Bounded question:** Can the OQLF-defined prepared buckwheat gruel be assigned the global picker terms `kacha / kasha` when a current Québec product listing uses *kasha* for the dry roasted kernels already represented by a separate active row?
- **Checklist fit:** The current Section F packet explicitly keeps prepared *kacha / kasha* separate from the dry-groats identity, while its candidate remains `needs_clarification` in the ledger ([packet unresolved gaps](../batches/plant-grains-cereals.md#L540), [plan checkpoint](../../RecipeBook-global-ingredient-catalog-plan.txt#L12659)). Section F remains open at the latest integrated R740–R742 checkpoint ([workflow](../ingredient-catalog-workflow.md#L3048), [roadmap](../../../roadmap.md#L1493)). This review does not revisit the R741 cooked-millet CNF join or the R738 cereal-family hold.
- **Snapshot:** 1,848 active ingredient references, 178 forms, 2,235 ledger records, and 114 manifest-listed recipes / 1,123 ingredient rows.

## Primary-source evidence and limits

| Existing source owner | Current source finding | Limit |
|---|---|---|
| `WP03-S56`, OQLF, [kacha / kasha](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506505/kacha), already owned by the `ingredient-ref-kasha` candidate and referenced on the roasted-groats record. | The OQLF page identifies French preferred terms `kacha` and `kasha`, gives English `kasha`, and defines it as a gruel made from roasted buckwheat. The record says the entry was last updated in 2010; I rechecked the current page on 2026-10-18. | This is authoritative Québec terminology for the prepared dish. It does not establish that the same unqualified English and French keys distinguish the dish from dry kernels in current Québec retail usage. |
| `WP03-BW-GROATS-QC-20261011-S03`, Comptoir Saint-Vrac, [Graine de sarrasin rôtie Kasha Bio](https://comptoirstvrac.com/product/1144), already owned by `ingredient-ref-roasted-buckwheat-groats-dry`. | The current Québec listing names dry roasted buckwheat as `Graine de sarrasin rôtie Kasha Bio`, offers 450 g, 10 kg, and 20 kg packages, and describes *kasha* as whole buckwheat grains roasted before cooking. It separately suggests cooked kasha dishes and porridge. The page identifies the Québec producer Les Moissonneries du Pays and crop provenance in Saint-François-de-la-Rivière-du-Sud. | Retail product wording establishes local use of *Kasha* for a dry ingredient and its later cooked use. The package sizes are not household portions, measurements, density, or yield. |
| `WP03-S15`, Health Canada, [CNF Food Code 4412](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4412), owned on the dry-groats record. | The legacy CNF page names `buckwheat groats, roasted, dry / gruau de sarrasin, rôti, sec`. It supports the identity of the existing dry product. | Its old serving data do not define *kasha* as a separate prepared identity and are outside this review's measurement scope. |

These existing source IDs and URLs are cited in their present scope; this proposal allocates no source ID, observation ID, candidate ID, or catalog ID. Do not duplicate or transfer the Comptoir Saint-Vrac source from the dry-groats record. The candidate already owns the OQLF source `WP03-S56`; do not register a second copy of its URL.

## Current catalog and ledger ownership

| Record | Live state | R744 disposition |
|---|---|---|
| `ingredient-ref-roasted-buckwheat-groats-dry` | Active `GRAIN_AND_CEREAL` row, English `buckwheat groats, roasted, dry`, French `grains de sarrasin rôtis et secs`, no aliases, no forms. | Leave unchanged. Do not add `kasha`/`kacha` as aliases or reinterpret this row as the prepared gruel. |
| `ingredient-ref-kasha` | Ledger-only `candidate`, `identityState: needs_clarification`; its existing sources are Health Canada `WP03-S15` and OQLF `WP03-S56`. Measurement and substitution research are `not_yet_researched`. | Preserve as a candidate. Do not promote it to an active reference or treat the OQLF entry as proof that the shared picker keys have one safe product scope. |
| `ingredient-ref-fingerroot` | Active `fingerroot / krachai`, with French alias `kachai`. | Leave unchanged. Its alias causes the current substring-only result for query `kacha`; do not remove or alter it as a side effect of the kasha review. |

The active ingredient reference file has no `kasha` or `kacha` exact owner. The only near-term `kacha` match is the existing `kachai` alias on fingerroot. The ledger has no prepared-kasha measurement observation, form, recipe link, or substitution finding. No new ownership is appropriate while the product meaning of the exact picker terms remains ambiguous.

## Bilingual identity and picker projection

The OQLF pair `kacha / kasha` applies to the prepared gruel in its terminology record. The current Québec retailer also uses *Kasha* for the dry roasted kernels, then uses the same word for cooked dishes made from them. This supports keeping a boundary question open; it does not support a globally unique English or French alias.

The live picker uses complete word-phrase matches before substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Static projection against active reference names and aliases gives:

| Query | Current result | Risk if prepared *kacha / kasha* were activated under those terms |
|---|---|---|
| `kasha` | No result. | A one-result prepared-gruel answer would intercept a current Québec grocery use for dry roasted kernels. The active dry-groats row would remain hidden because it does not own the word. |
| `kacha` | `fingerroot / krachai`, by substring fallback through `kachai`. | A complete `kacha` term on the proposed row would take phrase-first precedence and suppress the current fallback result. That would be a distinct change to an existing search, not proof that the dish candidate is ready for global allocation. |
| `buckwheat kasha`, `buckwheat porridge`, `buckwheat gruel` | No result. | Any future scoped names should be evaluated against current English/Québec product use and exact-query ownership before integration. |
| `sarrasin` | 15 active buckwheat-related results. | Adding another broadly qualified sarrasin row would expand an already broad query; no broad alias or shortened French name is proposed. |

These are static data projections, not device picker QA. R744 proposes no term change, so current results remain as shown.

## Recipe-corpus scan

I parsed all 114 recipe paths from the bundled-library manifest and scanned all serialized recipe text plus all 1,123 ingredient rows for `kasha`, `kacha`, `buckwheat kasha`, `buckwheat porridge`, `buckwheat gruel`, `gruau de sarrasin`, `sarrasin rôti`, and the candidate ID `ingredient-ref-kasha`.

- Matching recipe files: **0**.
- Matching ingredient rows: **0**.
- Direct links to `ingredient-ref-kasha`: **0**.

There is no bundled recipe demand, quantity, or preparation instruction to distinguish a dry-kernel ingredient from a cooked gruel. The retailer's retail package weights are not recipe portions.

## Exact hold

1. Keep `ingredient-ref-kasha` as the current ledger candidate with its existing `needs_clarification` state.
2. Keep the active dry roasted buckwheat row and its bilingual display unchanged; retain empty alias arrays.
3. Add no new reference, alias, form, measurement, density, unit mapping, conversion, yield, recipe link, or substitution.
4. Reopen only when a source-supported English/French name or explicit picker rule can distinguish the prepared gruel from dry roasted kernels for both locales. If a future product is ingredient-only, review it against the dry-groats row; if it is a prepared dish, keep that scope explicit and rerun exact `kasha` / `kacha` picker ownership checks.

This is an integrated documentation-only hold. Root updated the plan, roadmap, workflow, and batch integration README. No shared JSON or generated file changed. Under the current [`AGENTS.md`](../../../AGENTS.md) rule, database-JSON-only additions need no software tests; none were run for this hold.

## Review checks

- [x] Re-read the current `AGENTS.md`, the live Section F packet/checklist, and the R740–R742 checkpoint; selected the separate prepared-kasha candidate and avoided the recently reviewed Oatmeal Crisp and cooked-millet items.
- [x] Rechecked the current OQLF source and current Québec retailer product page; preserved their different prepared-gruel versus dry-kernel scopes.
- [x] Audited active reference/form ownership and the two existing source URL owners. No shared source ID, observation ID, candidate ID, or catalog ID is allocated.
- [x] Projected current exact and substring picker behavior for `kasha` and `kacha`; documented the hypothetical phrase-first conflict without changing picker data.
- [x] Scanned all 114 manifest-listed recipes / 1,123 rows; found no candidate phrases or direct links.
- [x] Checked relative links, UTF-8 without BOM, and scoped whitespace after writing.
- **No software tests, build, emulator run, or deployment were performed.** This packet proposes no shared-data change.
