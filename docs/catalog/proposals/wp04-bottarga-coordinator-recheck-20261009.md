# WP04 Section P — Bottarga coordinator recheck

- **Review date:** 2026-10-09.
- **Packet type:** independent coordinator recheck; research only.
- **Scope:** bottarga identity, English and Québec French naming, competing roe products and aliases, current catalog collisions, and bundled recipe demand.
- **Write scope:** this separate report only. It changes no shared catalog, ledger, plan, roadmap, workflow, recipe, code, or test.

## Recommendation

**Defer catalog integration now.** Section P leaves the item open as “Roe, tobiko, masago, salmon roe, bottarga, and caviar where recipes call for them.” The live bundle contains no bottarga or other roe ingredient line. The bundled recipe condition is not met, and the recent workflow note already defers the tobiko/masago proposal for the same reason. Keep Section P open; this recheck does not mark it complete.

The identity evidence is strong enough to retain a future candidate. If a bundled recipe later calls for this product, review one distinct `PROTEIN` identity with an English display based on `bottarga` and a Québec French display based on `poutargue`. Preserve species qualifiers in the recipe text. The sources do not support an active density, unit mapping, form conversion, package yield, or general substitution. The NOAA option to use another bottarga is limited to one vinaigrette recipe context.

The recommendation defers the catalog row and recipe linking; it does not reject the identity finding. If the coordinator changes the recipe-demand gate, the alias table below gives the supported and excluded terms for that later decision.

## Name and boundary dispositions

| Term or candidate | Recheck disposition | Evidence and limit |
|---|---|---|
| Bottarga / poutargue | Future identity candidate; do not integrate until recipe demand | OQLF defines `poutargue` as roe from mullet, tuna, or other species that is lightly salted, strongly pressed, then dried, and gives English `bottarga`. The Sardinian regional guide describes mullet and tuna bottarga as members of the family, with distinct sensory and cultural profiles. Neither source implies a single species [OQLF; Sardegna Agricoltura]. |
| Suggested future displays | EN `bottarga (salted, pressed, dried fish roe)`; fr-CA `poutargue (œufs de poisson salés, pressés et séchés)` | `Bottarga` and `poutargue` are directly supported. The parenthetical descriptions explain the product; they are not aliases. OQLF lists both `poutargue` and `boutargue` as preferred French terms [OQLF]. |
| `boutargue` | Candidate French search alias if a row is later approved | OQLF lists it as a preferred term. It is a variant of the same named cured product [OQLF]. |
| `botargo` | Source-attested regional variant; defer global alias promotion | OQLF says the product is called `botargo` in North Africa. The current alias schema has no region field, so a later reviewer should decide whether the regional term belongs in the global French alias list or only in research notes [OQLF]. |
| `Italian caviar` / `caviar italien`; `dried caviar` | Reject as global aliases | OQLF lists `Italian caviar` / `caviar italien` as terms for the product, and NOAA uses “dried caviar” parenthetically in one recipe. However, the live search matches a complete word phrase within an alias: adding `Italian caviar` would cause a query for the single word `caviar` to return bottarga. Section P names caviar separately. Keep these descriptive or source-listed terms in evidence, not catalog aliases [OQLF; NOAA]. |
| `bottarga di muggine`, `bottarga di tonno`, `bottarga di cefalo` | Preserve as source or recipe qualifiers; do not add as global aliases in this pass | Sardinian material covers both mullet and tuna bottarga; the Tuscan Orbetello record is specifically from female *Mugil cephalus* and lists `bottarga di muggine` as a synonym for that regional product. A generic row cannot preserve species-specific identity by itself. If future recipes rely on the distinction, review it then [Sardegna Agricoltura; Regione Toscana]. |
| Raw or loose `mullet roe`, `tuna roe`, `fish roe`, `fish eggs`, `roe` | Keep separate; reject as bottarga aliases | OQLF’s definition includes salting, pressing, and drying; uncured roe names do not establish that processed product. Source tissue alone is not an identity match [OQLF]. |
| `karasumi` | Keep separate; reject as an alias | Japan’s MAFF identifies karasumi as salted-and-dried mullet roe, and also records a regional rice-flour confection with that name. Similar source and processing do not establish a global synonym relationship [MAFF]. |
| Tobiko, masago, salmon roe / ikura, caviar, sea-urchin roe / uni | Keep separate; no aliases or substitutions | The existing roe-boundary proposal treats these as distinct neighbors; neither it nor the live corpus supports merging them into bottarga. `Caviar` is especially unsuitable as a bottarga alias given the Section P scope and search behavior. Whole fish also remain separate from their roe. |
| Whole baffe, sliced bottarga, grated bottarga | Product presentations; no form row or conversion proposed | The Sardinian source describes whole `baffe` and grated presentation, and the Tuscan record describes sliced and ground uses. These descriptions do not establish a density, volume measure, or conversion between presentations [Sardegna Agricoltura; Regione Toscana]. |

## Measurement and substitution disposition

- Leave density, count weight, default unit mappings, package yield, and mass/volume conversions unset. The bundle contains no recipe quantity for bottarga. The Tuscan 150–400 g packages are specific to the Orbetello product, not a general bottarga pack size.
- Do not add a form or form-to-form conversion for whole, sliced, or grated bottarga. The sources describe presentations but provide no validated conversion basis.
- Do not add a global substitution rule. NOAA’s skipjack ceviche vinaigrette calls for 1 oz tuna bottarga and says another bottarga may be used. That supports only the recipe’s stated choice within that vinaigrette; it does not cover other roe, caviar, raw roe, or all dishes. Keep it as a source-specific observation if a future recipe context makes it useful [NOAA].

## Current snapshot and audit

Re-read from the live worktree on 2026-10-09. SHA-256 values cover exact file bytes. The recipe corpus digest sorts manifest-listed recipe basenames lexically and hashes each basename, NUL, exact recipe-file bytes, NUL.

| Artifact | Current count | SHA-256 / digest |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 509 active references | `235871639394f42e344bf86159d463600a7e58f5d65645b38b6f7a21f475e644` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 32 forms | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| `docs/catalog/legacy-import-identities.v1.json` | 97 candidates | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |
| `docs/catalog/research-ledger.v1.json` | 689 records / 1,107 source entries | `f6ee45b415357f2bde780eb791dcd1b88ecc4d53420ffdacbb72c6316c2a88c8` |
| Manifest-listed recipe files | 114 files / 1,123 ingredient rows | `b390c94636cd524eb80e557fc871b74f610b6fc0d0b8d47c1bd634a41964d804` |

These live values supersede the earlier proposal’s snapshot (495 references, 27 forms, 671 ledger records / 1,030 source entries, 99 legacy candidates, and corpus digest `b4723f4a0dc4a19008c9f866307696235320845eaa8c0cfb21b8327d055f5194`). The manifest still lists 114 recipes and the audit still finds 1,123 ingredient rows; other package parts have changed since that earlier snapshot.

The normalized-key audit mirrored `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ` to `oe`, `æ` to `ae`, and `ß` to `ss`, replace `&` with `and`, remove combining marks, replace characters outside ASCII letters and digits with spaces, then trim and collapse whitespace. Current active names and aliases, form labels and match terms, and legacy candidate names and aliases were checked. Search queries first match whole normalized word phrases within terms and then fall back to substring matching.

- No exact normalized-key collision was found for `bottarga`, `poutargue`, `boutargue`, `botargo`, species-qualified bottarga phrases, raw or generic roe terms, `Italian caviar` / `caviar italien`, `caviar`, `karasumi`, tobiko, masago, ikura, salmon roe, uni, sea-urchin roe, `baffe`, or grated/dried-fish-roe descriptions across active references, forms, or legacy candidates. None of those queries currently resolves to an active picker result.
- The existing active `tuna` / `thon` identity is `ingredient-ref-tuna` (`PROTEIN`). It is a whole-fish identity, not a bottarga alias. No mullet, bottarga, roe, or caviar form exists in the 32 active forms.
- The recipe scan checked both `originalText` and `ingredientName` for all 1,123 ingredient rows using the same normalized word-phrase rule. It found zero bottarga, poutargue, botargo, generic roe, caviar, karasumi, tobiko, masago, ikura, salmon-roe, or uni rows. The sole adjacent source-species hit was recipe 111’s `1 tuna steak` (`ingredient-ref-tuna`); it is not a roe use and creates no recipe relink.
- Japanese terms such as `からすみ`, `カラスミ`, `とびこ`, `トビコ`, `いくら`, `筋子`, and `キャビア` normalize to an empty key under the app’s Latin-character rule. They were also checked literally in active reference/form/legacy text and recipe ingredient fields; no literal hit was found.
- The original bottarga proposal’s local source labels are not live ledger source IDs. This recheck allocates no source IDs and changes no ledger record.

## Source map and limits

| Source | Claim used | Limit |
|---|---|---|
| Office québécois de la langue française, Grand dictionnaire terminologique, [poutargue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428124/poutargue) | Directly supports the Québec French term `poutargue`, variant `boutargue`, English `bottarga`, the salted/pressed/dried roe definition, the regional North African term `botargo`, and the listed caviar-based synonyms. | The terminology record is dated 1983. It supports Québec wording and a product definition, not a current regulatory standard or one species/process specification for every bottarga. |
| Sardegna Agricoltura, [Sardinian food specialties brochure](https://www.sardegnaagricoltura.it/documenti/14_43_20121109134441.pdf), p. 27 | Names bottarga as dried tuna or mullet roe; describes distinct sensory qualities/cultural origins and Sardinian processing and presentations. | Regional source and practice; not a universal process, alias, species-equivalence, or conversion standard. |
| Regione Toscana, [Bottarga di cefalo di Orbetello](https://prodtrad.regione.toscana.it/LIB_ProdTrad/Prodotto.php?ID=8) | Identifies a specific Orbetello product, its *Mugil cephalus* source, `bottarga di muggine` synonym, processing, 150–400 g package range, and sliced/ground uses. | One regional product record; its species, package range, and process cannot be generalized to all bottarga. |
| Japan Ministry of Agriculture, Forestry and Fisheries, [Dried foods — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kanbutu.html) and [Karasumi — Our Regional Cuisines](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/1888/index.html) | Supports the karasumi product boundary as salted-and-dried fish roe and documents a same-name regional rice-flour confection. | Japan-specific terms and traditions; evidence for a boundary, not an equivalence or a universal bottarga definition. |
| NOAA Fisheries, [Skipjack Tuna Recipes](https://www.fisheries.noaa.gov/insight/skipjack-tuna-recipes) | One vinaigrette line calls for 1 oz tuna bottarga and allows another bottarga. | A specific recipe statement, not a unit conversion, general measure, or substitution rule. |
| RecipeBook local evidence, [tobiko/masago boundary proposal](wp04-tobiko-masago-roe-boundary-review-20261009.md), [Section P plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L1470) and [workflow note](../ingredient-catalog-workflow.md#L1069) | Confirms the neighboring roe proposal stays separate and was deferred because the bundle has no roe use; Section P’s roe line remains open and recipe-conditioned. | Local project decisions and checklist context; not independent product-identity authority. |

## Coordinator follow-up

1. Defer catalog merge and recipe relinking now; the current bundle has no bottarga/roe demand, and Section P remains open.
2. Retain a future single `PROTEIN` candidate named `bottarga` / `poutargue`, with `boutargue` as the OQLF-supported French variant. Revisit whether `botargo` belongs in global aliases because its documented use is regional and alias scope is not encoded.
3. Keep `Italian caviar` / `caviar italien`, raw roe terms, species-qualified bottarga names, karasumi, tobiko, masago, ikura/salmon roe, caviar, uni, and whole fish out of the global alias set. Preserve any recipe’s product and species wording.
4. Keep all density, unit, package-yield, form, conversion, and general substitution fields empty. If the NOAA context is useful later, record its “another bottarga” option only against that vinaigrette use.
