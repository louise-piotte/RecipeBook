# WP03 Section I — tree-nut and peanut checklist review

- **Reviewed:** 2026-10-09
- **Status:** proposal only; no shared catalog, ledger, recipe, plan, checklist, generated file, or test was changed.
- **Scope:** the first Section I checklist item: almond, walnut, pecan, hazelnut, pistachio, cashew, macadamia, pine nut, chestnut, and peanut.
- **Plan state:** Section I remains open. This review covers one checklist row and does not close the section.
- **Recommendation:** source-verify and retain the seven existing kernel identities; add identity-only rows for cashew, macadamia, and sweet chestnut. Keep every product boundary, numeric mapping, form, and substitution conservative as described below.

## Dispositions

The checklist row is a culinary grouping, not a botanical or allergen class. CFIA identifies peanuts separately from tree nuts and says peanuts are legumes; its Canadian priority tree-nut list does not include chestnuts. Keep the catalog’s broad `NUT_SEED_AND_DRIED_FRUIT` category as a catalog category only; it must not be interpreted as an allergen statement or a botanical classification.

| Checklist identity | Live state and recipe demand | Coordinator disposition |
|---|---|---|
| Almond | Existing `ingredient-ref-almonds`, `almonds` / `amandes`; 9 whole-almond rows. | Keep the ID and names; attach OQLF identity evidence. Do not merge with almond flour, paste, butter, or extract. |
| Walnut | Existing `ingredient-ref-walnuts`, `walnuts` / `noix de Grenoble`; 2 rows. | Keep the ID and names; attach OQLF evidence. Do not add bare `noix` as a walnut alias. |
| Pecan | Existing `ingredient-ref-pecans`, `pecans` / `pacanes`; 6 rows. | Keep the ID and names; attach OQLF evidence. Add only the directly supported French terms `pacane` and `noix de pacane` as optional search aliases. Existing shape aliases do not create forms or conversions. |
| Hazelnut | Existing `ingredient-ref-hazelnuts`, `hazelnuts` / `noisettes`; 2 rows. | Keep the ID and names; attach OQLF evidence. `Filbert(s)` is a source-attested English synonym (CFIA), but no bundled line uses it; add only if search coverage is wanted. |
| Pistachio | Existing `ingredient-ref-pistachios`, `pistachios` / `pistaches`; 4 whole-kernel rows. | Keep the ID and names; attach OQLF evidence. Keep pistachio paste separate. Review the current long French alias for salted/unsalted pistachio crumbs separately; this audit did not validate it and no recipe line depends on it. |
| Cashew | No active kernel identity, no exact recipe row, and no relevant legacy candidate. | Add identity-only `ingredient-ref-cashews`: `cashews` / `noix de cajou`, category `NUT_SEED_AND_DRIED_FRUIT`. OQLF supports the bilingual pair. Keep optional names such as `cajou`, `noix d’acajou`, and `anacarde` out of the initial alias set; retain the source-defined kernel/shell distinction in research notes. |
| Macadamia | No active identity, no exact recipe row, and no relevant legacy candidate. | Add identity-only `ingredient-ref-macadamia-nuts`: `macadamia nuts` / `noix de macadamia`, category `NUT_SEED_AND_DRIED_FRUIT`. Use the direct OQLF pair; do not add geographic or plant-name variants as global aliases. |
| Pine nut | Existing `ingredient-ref-pine-nuts`, `pine nuts` / `noix de pin`; 1 row. | Keep the ID and names; attach OQLF evidence. `Pignon` is an OQLF food term, but is also a common non-food term; add it only if the picker needs the synonym. |
| Chestnut | No sweet-chestnut identity or recipe row. Existing `ingredient-ref-water-chestnut` is a distinct Chinese-sedge food. | Add identity-only `ingredient-ref-sweet-chestnuts`: `sweet chestnuts` / `marrons`, category `NUT_SEED_AND_DRIED_FRUIT`. OQLF identifies *marron* as the edible sweet chestnut and lists *châtaigne* for some contexts. Do not alias bare `chestnut` or `châtaigne`; each can retrieve the existing water-chestnut identity under the app’s phrase search. |
| Peanut | Existing `ingredient-ref-peanuts`, `peanuts` / `arachides`; 2 kernel rows. | Keep the ID and names; attach OQLF and Health Canada evidence. OQLF supports `cacahuète` and `cacahouète`; these can be added as French aliases. Keep peanuts distinct from tree nuts and from peanut butter/oil. |

The three proposed additions are identity-only. Their lack of bundled recipe demand is recorded, but it does not block the expressly requested global checklist identities. Add no botanical Latin names as ordinary search aliases. Source IDs in this proposal are proposal-local and have not been written to the research ledger.

## Current catalog, form, ledger, and legacy boundaries

The active seed already has the seven whole-kernel references above, plus separate product identities for almond butter, almond extract, almond flour, almond paste, hazelnut butter, hazelnut spread with cocoa, pistachio paste, peanut butter, generic `nuts`, and water chestnut. These remain separate products. In particular, `ground almonds` is already an alias of almond flour; it is not an alias of the whole-almond reference. The recipe corpus has no need to turn chopped, sliced, blanched, ground, roasted, or salted words into global forms: the listed lines preserve those as line-level preparation text.

There are no active ingredient forms whose labels or match terms name any target kernel. All seven live kernel references have `defaultDensity: null` and empty `unitMappings`; no package yield or rule is being proposed. The ledger has 689 records and 1,110 source entries. Whole almond, walnut, pecan, and peanut references currently have unresolved/source-less identity or measurement placeholders; hazelnut, pistachio, and pine-nut identity records have no source entries. The proposed additions therefore need fresh, bounded identity records; do not treat the existing placeholder measurement state as a verified measure.

Four related legacy candidates are present among 97 total candidates: `ingredient-ref-almond-milk`, `ingredient-ref-natural-peanut-butter`, `ingredient-ref-peanut-butter-chips`, and `ingredient-ref-peanut-oil`. Keep almond milk, peanut-butter chips, and peanut oil as distinct processed products if separately reviewed. The natural-peanut-butter candidate duplicates the active `natural peanut butter` alias on `ingredient-ref-peanut-butter`; do not create a second identity for it. No recipe line in this audit requires activating the other three legacy candidates.

## Recipe demand and link implications

All 114 manifest-listed recipes and their 1,123 ingredient rows were audited. The table gives the active reference, whole-kernel line count, and traceable recipe prefix plus 1-based ingredient-array index. These existing species lines are already linked to the right identity and require no relinking.

| Existing reference | Rows | Bundled recipe positions |
|---|---:|---|
| `ingredient-ref-almonds` | 9 | `003#6`, `006#7`, `031#10`, `052#10`, `070#15`, `079#1`, `081#4`, `081#8`, `110#16` |
| `ingredient-ref-walnuts` | 2 | `055#10`, `058#11` |
| `ingredient-ref-pecans` | 6 | `025#10`, `026#6`, `053#13`, `067#4`, `109#2`, `114#20` |
| `ingredient-ref-hazelnuts` | 2 | `021#24`, `031#8` |
| `ingredient-ref-pistachios` | 4 | `017#1`, `056#29`, `081#3`, `081#7` |
| `ingredient-ref-pine-nuts` | 1 | `102#8` |
| `ingredient-ref-peanuts` | 2 | `031#6`, `085#9` |
| `ingredient-ref-peanut-butter` | 7 | `001#9`, `020#10`, `022#1`, `031#5`, `067#3`, `090#2`, `095#11` |

Other exact product demand is already separately linked: almond butter (3 rows), almond extract (10), almond flour (2), almond paste (2), hazelnut butter (1), and pistachio paste (2). There are no cashew, macadamia, sweet-chestnut, or water-chestnut recipe lines. Two optional generic lines are unlinked: `crushed nuts, for topping` (`031#4`) and `Nuts, to taste` (`065#7`). The coordinator may link those only to existing generic `ingredient-ref-nuts` if it is intended to represent unspecified nuts; do not infer a species or a mixed-nut formula.

Recipe 114 contains the single authored paired pecan quantity `1 cup (125 g) chopped pecans`. Preserve that recipe-specific quantity as written, but do not promote it to a catalog cup-to-gram mapping or density. The other quantity-bearing rows do not establish universal densities, count weights, shelling yields, or conversions. This review did not establish a contextual substitution between any kernel, butter, paste, or flour; activate none.

## Search and collision audit

The exact-key audit mirrors `normalizeIngredientSearchKey` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase with `Locale.ROOT`; NFKD; fold `œ`→`oe`, `æ`→`ae`, `ß`→`ss`; expand `&` to `and`; remove Unicode combining marks; replace non-ASCII alphanumeric runs with spaces; trim and collapse spaces. I compared exact normalized name/alias keys and whole-word phrase matches across all reference names and aliases, form labels and match terms, and legacy candidate names and aliases. Search behavior distinguishes an exact form key, complete word-phrase matches, and its final substring fallback.

| Search phrase | Current exact owner or phrase-level collision | Treatment |
|---|---|---|
| `noix` | Exact generic owner `ingredient-ref-nuts`; phrase occurs in noix de Grenoble, noix de pin, noix du Brésil, and coconut-related names. | Keep `noix` as the generic reference. Preserve the qualified `noix de Grenoble`, `noix de pin`, etc.; do not assign bare `noix` to walnut or any one species. |
| `ground almonds` | Exact alias of `ingredient-ref-almond-flour`. | Preserve as the flour identity’s existing alias, not a new whole-almond alias. No bundled line uses this phrase. |
| `hazelnut`, `noisette` | Phrase-level results include hazelnut butter and/or cocoa hazelnut spread; plural `noisettes` also finds the whole-kernel row. | Keep the product-qualified references separate. A broad search may correctly return several related products. |
| `pistachio`, `pistache` | Current phrase owner is pistachio paste; the whole-kernel display is plural `pistachios` / `pistaches`. | Keep paste separate. If singular aliases are added, retain both results; do not redirect paste recipe lines to kernels. |
| `peanut`, `arachide` | Current phrase owner includes peanut butter; plural `peanuts` / `arachides` exactly names the kernel reference. | Keep whole peanut and butter IDs distinct; do not add a bare singular alias that erases the distinction. |
| `chestnut`, `châtaigne` | Current phrase owner is `ingredient-ref-water-chestnut` / `châtaigne d’eau`. | Use qualified `sweet chestnuts` / `marrons` for the proposed edible *Castanea* identity. Do not add the ambiguous bare aliases. |
| `nuts` | Exact generic reference owner `ingredient-ref-nuts`; phrase matches include pine nuts, the source-backed fox-nut/makhana reference, and form `ingredient-form-makhana-roasted-popped` through match term `roasted fox nuts`. | Keep generic `nuts` generic. Avoid `nuts` as an alias for a particular species; keep fox nut/makhana distinct from tree nuts. |

Other target display keys are already owned by the corresponding active IDs. No form has an exact target-name key; the generic `nuts` query can still retrieve the separate fox-nut/makhana form noted above. None of the proposed names `cashews`, `noix de cajou`, `macadamia nuts`, `noix de macadamia`, `sweet chestnuts`, or `marrons` has an active or legacy exact owner at this snapshot. Check aliases again before integration because whole-phrase or substring search can surface related products even when IDs are distinct.

## Evidence map and limits

The sources below were accessed 2026-10-09. Proposal-local source identifiers are not ledger IDs.

| ID | Source | Supports and limits |
|---|---|---|
| **WP03-NUTS-20261009-S01** | OQLF, [amande](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360849/amande) | Bilingual almond identity/English `almond kernel`; botanical-food definition. Does not define almond flour, paste, butter, extract, or their measurement equivalence. |
| **WP03-NUTS-20261009-S02** | OQLF, [noix de Grenoble](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361125/noix-de-grenoble) | `Walnut` ↔ `noix de Grenoble`; says both `noix de Grenoble` and `noix` can refer to the walnut, while OQLF separately documents generic plural `noix`. Supports the qualified current label; not a reason to use bare `noix` as a global alias. |
| **WP03-NUTS-20261009-S03** | OQLF, [noix de pacane](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083802/noix-de-pacane) | Preferred Québec/Canada terms `noix de pacane` and `pacane`, English `pecan nut`/`pecan`; distinguishes European `noix de pécan`. Supports current fr-CA `pacanes` and proposed singular/qualified aliases. No density or product-form mapping. |
| **WP03-NUTS-20261009-S04** | OQLF, [noisette](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083830/noisette) | Bilingual `hazelnut`/`noisette`; notes market forms include in-husk/without husk and ground powder. Descriptions support identity only, not recipe forms or conversion values. |
| **WP03-NUTS-20261009-S05** | OQLF, [pistache](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297124/pistache) | `Pistachio nut`/`pistachio` ↔ `pistache`; identifies *Pistacia vera*. Does not equate whole kernels with pistachio paste. |
| **WP03-NUTS-20261009-S06** | OQLF, [noix de cajou](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869307/noix-de-cajou) | `Cashew nut` / `cashew` and Québec French `noix de cajou`; lists other terms but distinguishes the edible amande de cajou from the nut-plus-shell sense. Use the direct pair, not every listed alternative as a global alias. |
| **WP03-NUTS-20261009-S07** | OQLF, [noix de macadamia](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2078342/noix-de-macadamia) | Direct fr-CA/English macadamia nut naming and *Macadamia* plant context. Its older description and alternative regional names do not support broad aliases or measures. |
| **WP03-NUTS-20261009-S08** | OQLF, [pignon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon) | Food sense `pignon`/`noix de pin`, English `pine seed`/`pine nut`/`pignoli`; also documents the word’s non-food context. Supports current name and an optional scoped synonym, not a specific pine species or measure. |
| **WP03-NUTS-20261009-S09** | OQLF, [marron](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2295692/marron) | `Marron` is the usual name for the edible fruit of the cultivated chestnut tree; lists English `sweet chestnut`/`chestnut` and *châtaigne* for some contexts, with *Castanea sativa*. Supports proposed bilingual name and the sweet-chestnut boundary. |
| **WP03-NUTS-20261009-S10** | OQLF, [arachide](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360056/arachide) | `Peanut` ↔ `arachide`, with `cacahouète` and `cacahuète` listed; identifies *Arachis hypogaea*. Terminology/identity source only. |
| **WP03-NUTS-20261009-S11** | OQLF, [noix](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9483322/noix) | Documents `noix`/`noix variées` as a generic group of edible kernels and maps it to English `nuts`/`mixed nuts`; supports keeping generic recipe wording separate from a named nut. |
| **WP03-NUTS-20261009-S12** | OQLF, [châtaigne d’eau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434646/chataigne-deau) and current ledger source **WP03J-S18** | Identifies the distinct Chinese-sedge tuber sold as water chestnut. This entry, together with S09, is sufficient to keep sweet chestnut and water chestnut distinct; no claim is made about all regional meanings of “water chestnut.” |
| **WP03-NUTS-20261009-S13** | CFIA, [food allergies and labelling](https://inspection.canada.ca/en/food-labels/labelling/consumers/food-allergies?wbdisable=true) | Lists Canada’s regulated priority tree-nut names and peanut separately. Regulatory allergen grouping, not a complete botanical or culinary taxonomy; chestnut is not on its cited tree-nut list. |
| **WP03-NUTS-20261009-S14** | Health Canada, [Peanuts — a priority food allergen](https://www.canada.ca/en/health-canada/services/food-nutrition/reports-publications/food-safety/peanuts-priority-food-allergen.html) | Explicitly says peanut is in the legume family and is not a tree nut. Allergen guidance does not supply a catalog substitution or a blanket cross-reaction claim. |

OQLF entries are strong Québec terminology sources, but several are older and define terms rather than current retail formulations. CFIA and Health Canada sources are used only for their stated Canadian regulatory/botanical distinction. None of these sources supports a general gram-per-cup density, count weight, shelling yield, cross-species conversion, or culinary substitution.

## Exact snapshot and verification

Snapshot date: **2026-10-09**. Counts and hashes pin the inspected working-tree content; rerun the audit at integration if the shared package changes.

| Inspected file or corpus | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 509 references | `074c4381a10e397cbb289cb732b989496eb826e377a494f1451b7546e9777083` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 32 forms; 0 target-named forms | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| `docs/catalog/legacy-import-identities.v1.json` | 97 candidates | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |
| `docs/catalog/research-ledger.v1.json` | 689 records; 1,119 source entries | `e7f3afcaa8ac751c594e1cdf264cea6e4d8c10ea5b4e41f66050977d7bdccd9a` |
| Manifest-ordered recipe corpus (each relative path, NUL, exact bytes, NUL) | 114 recipes; 1,123 ingredient rows | `31139675c0a2f37863a57e2e45e8df203b0255b11e12cf54f1df944cdd426890` |

**Tests:** not run; this is a proposal-only research task. File checks after writing: UTF-8 without BOM and no trailing whitespace. No test status is implied by these documentation checks.

## Coordinator follow-up

1. At integration, repeat the hash/count snapshot and rerun the exact-key and recipe-line scan on the then-live package, including any proposals merged since this review.
2. Preserve the seven existing kernel IDs and their current recipe links. Add ledger identity evidence from this source map; keep measurement and substitution research unresolved/not yet researched where appropriate.
3. Add only the three absent identity rows under the recommended stable IDs and direct bilingual names. Keep name aliases narrow; preserve the qualified walnut, pine-nut, and sweet-chestnut boundaries.
4. Decide whether the two generic optional recipe lines should point to existing `ingredient-ref-nuts`; no species-specific relink is supported by their text.
5. Keep every density, unit mapping, package yield, conversion, structured preparation form, and substitution absent. The single recipe-authored pecan mass/volume pair is not a universal mapping.
6. Leave the remaining Section I identities and forms open. This proposal does not declare Section I complete.
