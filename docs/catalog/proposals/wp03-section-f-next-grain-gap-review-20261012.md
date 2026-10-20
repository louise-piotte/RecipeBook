# WP03 Section F next grain gap review: rye-berries Québec French display (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** proposal only; no catalog, ledger, recipe, plan, roadmap, generated-code, or test file changed.
- **Scope:** close one explicit terminology follow-up for the already integrated `rye berries / grains de seigle` identity: whether `grains de seigle` is a defensible Québec French picker display for the marketed intact-kernel product.
- **Recommendation:** retain `grains de seigle` as the fr-CA display, with its status described as Québec-market-attested wording rather than an OQLF-preferred compound. Do not add French aliases or change the existing English alias. This is a terminology decision only; it does not reopen rye-berries identity, measurement, substitution, or recipe-link decisions.
- **Why this is unfinished:** the 2026-10-10 [rye-berries identity review](wp03-section-f-rye-berries-evidence-recheck-20261010.md) explicitly left an independent Québec terminology review open. The current Section F checklist still calls the French display provisional ([plan lines 1876–1900](../../RecipeBook-global-ingredient-catalog-plan.txt#L1969)); later [rye-flakes](wp03-section-f-rye-flakes-identity-review-20261011.md) and [puffed-rye](wp03-section-f-puffed-rye-quebec-name-hold-review-20261011.md) packets treat rye berries as neighboring identities and do not resolve this display. The roadmap keeps WP03/Section F work open but has no separate rye-berries terminology decision.

## Read-only package snapshot

The snapshot was read from the active split seed package and shared research ledger before drafting. Hashes are SHA-256 over exact file bytes. The recipe fingerprint hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Snapshot | SHA-256 or fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,264 references; 121 `GRAIN_AND_CEREAL` | `c373d1cf4f192b0cfdaf8f8095b8642a5bd6d55cd50be822ef81ed3060914d39` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,573 records; 5,526 source entries; 4,562 distinct source IDs | `f0caa10408e515af8bc74cf7a158d73f7f3b5ad8873d1f5c9d0622664bd14965` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe-file bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Terminology decision

Retain **`grains de seigle`** as the French display for `rye berries`. The display has direct, current Québec food-market support, while OQLF's authoritative entry establishes the base term `seigle` and explicitly says it names both the plant and the grain. Neither source calls the compound an OQLF-preferred term, so the catalog note should preserve that distinction.

The Québec producer association Grains du Québec describes rye as a food cereal and says grocery products are sold as `grains, flocons, farine, etc.`. A current Québec-facing listing for a Coaticook rye product uses the title **Grains de seigle Bio**, lists **Grains de seigle biologique** as its ingredient, and describes whole rye kernels for cooking, milling, and sprouting. La Milanaise's consumer product page independently calls its product **grains de seigle biologiques**. These are strong local product-language examples for the existing display, not terminology rulings.

OQLF's `grain entier` entry defines a whole grain by its bran, endosperm, and germ, and says a whole grain can be intact, cracked, flaked, ground, or milled. Therefore `entier` expresses whole-grain composition and does not, by itself, identify intact kernels. Keep the exact product phrase `grains de seigle` as the display; do not replace it with a constructed `seigle entier` or claim that `grains de seigle` is a standardized technical term for all intact rye kernels.

| Phrase | Decision | Reason |
|---|---|---|
| `rye berries` / `grains de seigle` | Retain the active English/French display pair. | Exact current Québec product wording and food-use context support the French display. Treat it as market-attested, not OQLF-preferred. |
| `rye kernels` | Retain as the sole active English alias. | A Québec retailer's English product description explicitly equates its intact rye kernels with rye berries; this was already accepted in the existing identity review. |
| `seigle` / `rye` | Keep on the broad `ingredient-ref-rye-grain` identity only. | OQLF says `seigle` names both plant and grain. Bare queries also retrieve rye flour, meal, flakes, and intact-kernel products. |
| `grain de seigle`, `seigle en grains`, `seigle entier` | Do not add French aliases. | No extra alias is needed for the supported display. The product page's descriptive singular phrase is not a distinct Québec terminology recommendation; `entier` does not mean intact presentation in OQLF's whole-grain definition. |
| `seigle criblé` / `seigle criblé bio` | Keep out of aliases. | This is a Québec retailer's product-title wording. The available evidence does not establish it as a general rye-berries name or a preferred culinary term. |
| `grains de seigle biologiques` | Keep as source wording, not an alias. | `Bio`/`biologiques` is a product claim, not part of the general identity. The canonical phrase already retrieves the identity without a brand or organic qualifier. |

## Active, form, legacy, and ledger ownership

The application normalizes accents and punctuation, prefers complete normalized word-phrase matches, and falls back to substring matching ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L21)). The audit used the repository's normalized search-key behavior on live references, forms, legacy candidates, and the manifest-listed recipes.

| Surface | Current owner/state |
|---|---|
| `ingredient-ref-rye-berries` | Active `GRAIN_AND_CEREAL` reference: `rye berries / grains de seigle`; EN alias `rye kernels`; FR aliases `[]`; `defaultDensity: null`; `unitMappings: []`. The stable ID is already active and is not reserved or proposed anew. |
| `ingredient-ref-rye-grain` | Separate broad `GRAIN_AND_CEREAL` reference: `rye / seigle`; no aliases, density, or mappings. Keep unchanged. |
| Other active rye references | Rye flakes, flour, meal, light/medium flour, malted flour, and whole rye flour remain separate. No row is to be merged, renamed, or relinked. |
| Ingredient forms | None belongs to `ingredient-ref-rye-berries`; no form label or match term owns `rye berries`, `rye kernels`, or `grains de seigle`. The 94-form file contains no rye-berries state form. |
| Legacy import identities | No rye-berries legacy candidate or exact phrase owner. |
| Research ledger | Existing `ingredient-ref-rye-berries` record is `verified`, `researched_no_supported_value`, and `blocked_pending_evidence`; it has five source entries, no measurement observations or conversions, and one blocked substitution finding. The broad `ingredient-ref-rye-grain` ledger record separately holds the historical USDA 1-cup/169-g observation. Do not transfer that value. |

Exact normalized active ownership is unique for `rye berries`, `rye kernels`, and `grains de seigle`: all resolve to `ingredient-ref-rye-berries`. `rye` and `seigle` resolve to the separate broad rye identity. The proposed source IDs `WP03-RYE-NAME-QC-20261012-S01` through `S03` were absent from the ledger at review time; earlier OQLF, La Milanaise, and Silo EST evidence is reused under its existing ledger source IDs rather than duplicated.

## Picker-query behavior

These results follow the current `IngredientReferenceSearchIndex` phrase-first and substring-fallback behavior. They are static results from the current data snapshot, not emulator screenshots.

| Query | Current behavior |
|---|---|
| `grains de seigle`, `rye berries`, `rye kernels` | Each returns only `ingredient-ref-rye-berries` on the complete-phrase pass. |
| `seigle` or `rye` | Each returns nine rye-related references on the complete-phrase pass, including broad rye, rye berries, flakes, meal, and flours. These are broad family queries, not unique product selection. |
| `grain de seigle` | No current result; the singular form does not exactly match the plural display. No alias is proposed. |
| `seigle criblé` | No current result; keep it that way until a general product-name basis exists. |
| `seigle entier` | Substring fallback currently returns whole rye flour because its French alias is `farine de seigle entière`. Do not add `seigle entier` to rye berries; that would increase an existing misleading partial-query result. |

The broad `seigle` and `rye` result sets are already inherent in the active names for related products. This review finds no new picker collision from retaining the existing full display pair and aliases.

## Complete 114-recipe demand audit

All 114 recipe files in `manifest.v1.json` were parsed, and all 1,123 ingredient rows were inspected. Full recipe text and serialized ingredient objects were checked for `rye berries`, singular `rye berry`, `rye kernels`, `whole rye`, `rye grain(s)`, `rye flakes`, `rye meal`, `grains de seigle`, `grain de seigle`, `seigle en grains`, `seigle entier`, `seigle criblé`, and the broad word `seigle`. The scan found **zero matching recipe files and zero matching ingredient rows**. There is no recipe link, amount, state, or substitution to attach.

## Aliases, numeric data, forms, conversions, substitutions, and links

| Concern | Recommendation |
|---|---|
| English aliases | Keep the existing `rye kernels` alias only. Add none. |
| French aliases | Keep `aliasesFr: []`. Do not add the singular, `entier`, `en grains`, organic, or `criblé` phrases. |
| Default density / unit mappings | Keep `defaultDensity: null` and `unitMappings: []`. No generic rye-berries density or volume-to-mass source exists. |
| Measurements | Add no catalog measurement. The current Comptoir Saint-Vrac page gives 5 kg and 20 kg package formats, which are SKU package sizes, plus a product-specific 1-cup-grain to 3-cup-water cooking direction and an approximate 3-cup cooked yield. The package sizes are not household measures; the recipe-style ratio and yield are source-specific, not a generic measure, density, or dry-to-cooked conversion. |
| Ingredient forms | Add none. The identity is for the intact-kernel food product; do not add `whole`, `intact`, `dry`, `soaked`, or `cooked` as forms from these product descriptions. |
| Conversions and yields | Add no mapping, conversion, or yield. The single product page's water ratio and approximate cooked yield remain source-specific evidence and are not transferable. The USDA 169-g cup observation remains on the broad rye-grain ledger record only. |
| Substitutions | Add no active rule. La Milanaise suggests its rye grains in place of rice in soups or salads without an amount or preparation crosswalk. The existing candidate-specific finding remains `blocked_pending_evidence`; no global or contextual rule is supported. |
| Recipe links | Add none. No bundled recipe line names rye berries, rye kernels, or grains of rye. |

## Proposal-local source register

Sources reviewed on 2026-10-12. The three new proposal-local IDs below were checked against all 4,562 current ledger source IDs and were absent. Existing source IDs are reused as marked.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-RYE-NAME-QC-20261012-S01` | OQLF, [GDT: grain entier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544101/grain-entier), definition and note. | Defines whole grain by its bran, endosperm, and germ; says whole grains may be intact, cracked, flaked, ground, or milled. Supports keeping `entier` separate from an intact-kernel presentation; does not name rye berries. |
| `WP03-RYE-NAME-QC-20261012-S02` | Grains du Québec, [Seigle du Québec](https://grainsduquebec.ca/nos-grains/seigle), food-use section. | Current Québec producer-association page calls rye a cereal used for human food and says grocery products include `grains`, flakes, and flour. Supports local food-market category wording and product distinction, not the exact rye-berries term. |
| `WP03-RYE-NAME-QC-20261012-S03` | Comptoir Saint-Vrac / Coop Agrobio, [Grains de seigle Bio](https://comptoirstvrac.com/product/2087), Québec product title, ingredient line, and description. | The current Québec-facing catalog page names `Grains de seigle Bio`, lists `Grains de seigle biologique`, identifies the source product as *Secale cereale*, and describes whole kernels for cooking, milling, and sprouting. It also publishes package formats and one product-specific cooking ratio/yield; none is generalized here. The retailer page is product-use evidence, not an OQLF terminology decision. |
| Existing `WP03-RYE-RECHECK-20261010-S01` | OQLF, [GDT: seigle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432764/seigle). | Reused from the live rye-berries ledger record. The preferred base term is `seigle`; the note says it names both plant and grain. It does not standardize the compound `grains de seigle`. |
| Existing `WP03-RYE-RECHECK-20261010-S02` | La Milanaise, [Seigle biologique](https://lamilanaise.com/produits/seigle-biologique/), consumer product description. | Reused from the live ledger. Québec mill wording `grains de seigle biologiques` corroborates the proposed display; its recipe suggestions and 8–24-hour soak direction remain product-specific and provide no numeric conversion or recipe link. |
| Existing `WP03-RYE-RECHECK-20261010-S03` | Silo EST, [Seigle Criblé Bio](https://catalogue.lesilo.co/en/T-seigle-crible-bio), English product description. | Reused from the live ledger. The retailer identifies its intact rye kernels as rye berries, supporting the existing English alias. Its French product title is not adopted as a general alias. |

## Review disposition

Accept the current Québec-market display **`rye berries / grains de seigle`** for the active identity, with no change to the catalog row. If this terminology review is accepted for shared research tracking, add the new sources and a terminology-only accepted decision to the existing `ingredient-ref-rye-berries` ledger record, then replace the plan's “French display remains provisional” note with the narrower wording that the display is product-market-attested and not OQLF-preferred. Keep aliases, density, mappings, measurements, forms, conversions, yields, substitutions, and recipe links exactly as specified above. This closes only the independent display review; the broader WP03 Section F checklist remains open.
