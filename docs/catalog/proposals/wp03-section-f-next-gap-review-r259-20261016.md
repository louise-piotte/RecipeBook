# WP03 Section F — Puffed-rice Québec terminology recheck (R259, 2026-10-16)

## Review record

- **Scope:** Resolve the open French terminology question for the existing identity `puffed rice / riz soufflé`. This review does not reopen the puffed-rice identity, the R11 `muri` / `murmura` aliases, the crispy-rice-cereal identity, or puffed-grain candidates made from other cereals.
- **Checklist context:** The Section F parent remains open. The 2026-10-07 puffed-rice checkpoint records `puffed rice / riz soufflé` and leaves independent Québec review open ([active checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L9790), [identity batch](../batches/instant-oats-puffed-rice-identities.md#L36)). The later R11 alias integration added only `muri` and `murmura` and noted a possible conflict in its reading of Usito ([R11 proposal](wp03-section-f-next-cereal-gap-review-20261013-round11-puffed-rice-regional-aliases.md#L39)).
- **Archive separation:** This is separate from the completed Sona Masoori review R255 and the recent precooked-durum R247 and Vector-family R251 reviews. None decides the French display for plain puffed rice.
- **Recommendation:** **Retain `puffed rice / riz soufflé` as the current identity display.** Usito distinguishes the North American puffed-rice sense from the French-European breakfast-cereal sense of the same phrase, and current Québec retail and Canadian manufacturer use attest `riz soufflé` for the plain puffed-rice product. Keep the crispy-rice-cereal row separate and keep `riz croustillant` off the puffed-rice row.
- **Proposed catalog effect:** None. Keep `ingredient-ref-puffed-rice` in `GRAIN_AND_CEREAL`, with its existing English aliases `muri` and `murmura`, no French aliases, no forms, null density, and empty unit mappings.
- **Snapshot:** 1,649 ingredient references, 125 forms, 114 manifest-listed recipes, and 1,123 structured ingredient rows at review time. Counts describe this read-only snapshot, not later concurrent updates.
- **Source IDs:** `WP03-PUFFED-RICE-QC-NAME-R259-20261016-S01` through `S03` are proposal-local and unallocated. Existing ledger source IDs reused below are named explicitly; this review writes no source records to the ledger.

## Terminology decision

Usito's current `riz` entry includes two senses that the R11 note had treated as a single geographic label. In the North American sense, `riz soufflé` means rice grains expanded by heat and used for cereals and cakes. The entry separately records a French-European sense of `riz soufflé` for puffed and toasted grains eaten as breakfast cereal. Its Québec/Canadian term `riz croustillant` belongs to the Rice Krispies product usage [WP03-S102]. The R11 note is therefore too broad when it calls `riz soufflé` a French-European-only term.

This distinction matches current Canadian product language. Maxi Québec lists Nature's Path's plain, one-ingredient puffed-rice cereal as **Céréales biologiques Riz soufflé** and describes whole brown-rice grains popped with air [WP03-PUFFED-RICE-QC-NAME-R259-20261016-S02]. Nature's Path's Canadian French recipe also requests `Riz soufflé` for a pressed cereal treat [WP03-PUFFED-RICE-QC-NAME-R259-20261016-S01]. Both usages are consistent with Usito's North American definition.

Keep the existing distinction from crispy rice cereal. OQLF's `riz croustillant` entry gives Rice Krispies as its English equivalent, rather than naming plain puffed rice [WP03-S90]. The bundled recipe 040 calls for `crispy rice cereal`; the existing catalog row for that product is `crispy rice cereal / céréales de riz croustillantes`. Do not add `riz croustillant`, `puffed rice cereal`, `rice cereal`, or Rice Krispies terms to the plain puffed-rice identity.

The historic Canadian General Standards Board specification also uses `riz soufflé` for whole rice grains expanded by a puffing process. It was withdrawn in 2020, so it is corroborating history rather than a current requirement [WP03-S104]. The current display recommendation stands on Usito and present Canadian use without depending on the withdrawn standard.

## Existing ownership and boundary audit

Normalized exact-key checks covered active reference displays and aliases, ingredient-form labels and match terms, and the recent puffed-rice proposal and its research-ledger entry. Search normalization follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Phrase or scope | Current owner | Disposition |
|---|---|---|
| `puffed rice` / `riz soufflé` | `ingredient-ref-puffed-rice`, category `GRAIN_AND_CEREAL`; aliases `muri`, `murmura`; no attached forms. | Retain the bilingual display and existing aliases. Add no French alias. |
| `crispy rice cereal` / `céréales de riz croustillantes` | `ingredient-ref-rice-cereal`, category `GRAIN_AND_CEREAL`; no aliases or forms. | Keep as the separate ready-to-eat crispy cereal identity. |
| `riz croustillant` | No exact normalized display, alias, or form-term owner. It matches the crispy-rice-cereal row through substring fallback because its French display contains `riz croustillantes`. | Preserve the current picker result; do not attach the Rice Krispies term to puffed rice. |
| `muri`, `murmura` | `ingredient-ref-puffed-rice`, through the accepted R11 English aliases. | Retain; do not add regional terms as French aliases based on this terminology review. |
| `rice puffs`, `puffed rice cereal`, `rice cereal` | No exact owner for the first two phrases; `rice cereal` has more than one current result. | Add none. Product wording and the broad query do not justify a generic alias. |

The nearby `ingredient-ref-rice` row remains the generic rice identity with its existing dry and cooked forms. Puffed rice stays distinct from raw rice, flattened rice (poha), and the crispy rice cereal in recipe 040. The readable source register records the prior R11 Usito source as `WP03-S102`, and OQLF's Rice Krispies term as `WP03-S90`; neither source ID is reassigned here.

## Picker projection

This is a static projection of the current phrase-first, substring-fallback behavior; it is not live Android picker QA.

| Query | Current result | Interpretation |
|---|---|---|
| `puffed rice` | `ingredient-ref-puffed-rice` only | English display resolves to the plain puffed-grain identity. |
| `riz soufflé` / `riz souffle` | `ingredient-ref-puffed-rice` only | Accent-folded French display resolves to the same row. |
| `muri` / `murmura` | `ingredient-ref-puffed-rice` only | Existing R11 aliases remain unique. |
| `céréales de riz croustillantes` / `crispy rice cereal` | `ingredient-ref-rice-cereal` only | Existing generic crispy-cereal display stays separate. |
| `riz croustillant` | `ingredient-ref-rice-cereal` only, through substring fallback | Matches the adjacent cereal identity; no alias is required on puffed rice. |
| `puffed rice cereal` | No result | Keep this unqualified phrase out of both identities. |
| `rice cereal` | `ingredient-ref-baby-rice-cereal` and `ingredient-ref-rice-cereal` | Existing broad query remains a multi-result query. |
| `riz` | 63 references | Broad rice search remains unchanged. |

No query projection changes are proposed. In particular, the clarification prevents the R11 source note from becoming a reason to rename the active French display or to merge it with the crispy-rice-cereal row.

## Bundled recipe audit

All 114 manifest-listed recipe files and their 1,123 structured ingredient rows were scanned in full for `puffed rice`, `riz soufflé`, `muri`, `murmura`, `rice puffs`, and the adjacent crispy-rice-cereal terms. The current corpus has **no direct recipe demand or `ingredient-ref-puffed-rice` links**. One neighboring hit is recipe 040, whose ingredient row requests `6 cups crispy rice cereal` and links to `ingredient-ref-rice-cereal`; this is not a puffed-rice request. No recipe text or ingredient link is proposed.

## Forms, measurements, and substitutions

- **Category:** Keep `GRAIN_AND_CEREAL`. The row already represents a processed edible cereal-grain product.
- **Forms:** Add none. The North American lexical definition describes the product state, not an additional state of raw rice.
- **Measurements and mappings:** Keep `defaultDensity` null, `unitMappings` empty, and no default measure or conversion. Nature's Path's French recipe lists 4 cups for that particular pressed-treat formula [WP03-PUFFED-RICE-QC-NAME-R259-20261016-S01]; the amount is recipe-specific and supplies no mass or generic puffed-rice measure. Maxi's 170 g package is SKU-specific, not a kitchen measure [WP03-PUFFED-RICE-QC-NAME-R259-20261016-S02].
- **Cooking yields:** Add none. The sources do not give a general puffed-to-unpuffed yield or a preparation conversion.
- **Substitutions:** Add no global or contextual substitution. No reviewed source provides a tested, scoped replacement rule for puffed rice.

## Unresolved follow-up

The source-backed French display question is resolved in favor of the existing `riz soufflé`. Independent human Québec-language sign-off remains a separate project workflow if required; this documentation-only recheck cannot claim that a human reviewer has signed off. Do not change the active row or the broader Section F checklist from this proposal alone.

## Source register

Sources checked online on **2026-10-16**. Existing research-ledger IDs are noted as reused; proposal-local IDs remain unallocated.

| ID | Source | Evidence and limits |
|---|---|---|
| Reuse `WP03-S102` | Usito, [riz](https://usito.usherbrooke.ca/d%C3%A9finitions/riz); readable lexical view [riz, lexies](https://examen-francais-quebec.usito.usherbrooke.ca/d%C3%A9finitions/riz/lexies). | The entry defines the North American `riz soufflé` sense as heat-expanded rice grains used for cereals and cakes, and separately records a French-European breakfast-cereal sense with the same spelling. `Riz croustillant` is separately identified with Rice Krispies. Lexical view shows content updated 2026-01-13; this review checked it 2026-10-16. The source supports terminology and product scope, not numeric catalog behavior. |
| Reuse `WP03-S90` | Office québécois de la langue française, [riz croustillant (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18940757/riz-croustillant), last updated 1994. | Gives `riz croustillant` as its preferred term and `Rice Krispies` as its English equivalent. It does not assign this name to generic plain puffed rice. |
| `WP03-PUFFED-RICE-QC-NAME-R259-20261016-S01` | Nature's Path Canada, [Bouchées au beurre d'arachide crémeux](https://naturespath.com/fr-ca/blogs/recettes/bouchees-au-beurre-darachide-cremeux), French-Canadian manufacturer recipe, checked 2026-10-16. | Requests 4 cups of `Riz soufflé` in a pressed cereal-treat recipe and mixes it with other ingredients. Supports current Canadian manufacturer use of the name, not a generic measure or a product formula for the catalog. No publication date is shown. |
| `WP03-PUFFED-RICE-QC-NAME-R259-20261016-S02` | Maxi Québec, [Nature's Path Céréales biologiques Riz soufflé, 170 g](https://www.maxi.ca/fr/c-r-ales-biologiques-riz-souffl/p/20103512002_EA). | Current Québec retailer product listing identifies the English-market product as Nature's Path puffed rice cereal, titles it `Céréales biologiques Riz soufflé`, and describes one ingredient: air-puffed whole brown-rice grains. Search-indexed page text was available; direct retrieval returned a cache miss. Package weight and stock are source/SKU/store-specific and are not generalized. |
| `WP03-PUFFED-RICE-QC-NAME-R259-20261016-S03` | Nature's Path Canada, [Organic Rice Puffs Cereal](https://naturespath.com/en-ca/products/puffed-rice-cold-cereal-np-ca), current manufacturer product page, checked 2026-10-16. | Names the English product as Organic Rice Puffs Cereal and describes air-popped brown-rice kernels as a single-ingredient cereal. This ties the English product class to Maxi's French title; it does not establish a generic measure. |
| Reuse `WP03-S104` | Canadian General Standards Board, [Cereals, breakfast, prepared, ready-to-eat (CAN/CGSB-32.13-88)](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-013-1988.pdf), historical standard withdrawn in 2020. | The historical bilingual specification uses `puffed rice / riz soufflé` for expanded whole rice grains. Retain only as historical corroboration; it is not a current requirement. |

## Disposition

**Retain `ingredient-ref-puffed-rice` as `puffed rice / riz soufflé` in `GRAIN_AND_CEREAL` with its current English aliases and empty forms/numeric behavior.** Keep the distinct `crispy rice cereal / céréales de riz croustillantes` row and the OQLF Rice Krispies term boundary unchanged. No catalog, ledger, recipe, plan, roadmap, or generated-file edits are proposed; Section F remains open.
