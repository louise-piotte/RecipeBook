# WP03 Section F — brown rice `riz complet` Québec alias review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** integrated on 2026-10-12. This proposal retains its pre-integration package and picker snapshot; the accepted change is recorded in `docs/catalog/batches/wp03-section-f-brown-rice-complet-alias-integration-20261012/README.md`.
- **Scope:** one remaining brown-rice terminology boundary from the active Section F checkpoint: whether plain-grain French `riz complet` should be searchable on the existing `brown rice / riz brun` identity. The plan integrates that identity but explicitly leaves other variants inactive pending regional review ([plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L1970)).
- **Overlap check:** this is not the prior brown-rice-flakes review of `flocons de riz complet` as a product phrase, nor the red-rice review of qualified `riz complet rouge`. It does not reopen the held `sticky rice` / glutinous-rice decision or rye-berry wording review.
- **Recommendation:** add exactly the French alias **`riz complet`** to existing `ingredient-ref-brown-rice`. Keep `brown rice / riz brun` as the display, keep its current English alias and `riz cargo` alias, and add no other aliases or numeric behavior.

## Current package snapshot

Read-only snapshot taken during this review. Counts cover the live package and all manifest-listed recipe files.

| Artifact | Count |
|---|---:|
| Active ingredient references | 1,270 |
| Ingredient forms | 94 |
| Legacy import candidates | 65 |
| Research-ledger records | 1,578 |
| Manifest-listed recipes | 114 |
| Ingredient rows in those recipes | 1,123 |

SHA-256 values below use raw file bytes. The recipe-corpus hash is computed in manifest order over each relative recipe path encoded as UTF-8, a NUL byte, the recipe file's raw bytes, and another NUL byte.

| Snapshot input | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `783b4c4e55d1f638283f11582c7c56743aade73664f8af3241a23d151f003802` |
| `ingredient-forms.v1.json` | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `docs/catalog/legacy-import-identities.v1.json` | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `docs/catalog/research-ledger.v1.json` | `36af8936e353e2640df8be8ce9df29b9cd91b582dfe05ac7cf83469f59600664` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `manifest-listed recipe corpus (aggregate)` | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Identity and Québec terminology boundary

TERMIUM Plus lists `riz brun` as the correct French term for *brown rice* and also lists `riz complet` and `riz intégral` under the same milling-and-cereal record. Its definition is rice with the outer hull removed while the bran remains. A current Québec retailer, La Moisson, describes its plain long brown rice as **« aussi appelé riz complet »**. Canadian rice manufacturer Dainty likewise describes brown basmati as **« un riz complet à grains entiers »** whose hull alone has been removed. Together, the terminology record and local market usage support `riz complet` as a useful search alias for the existing brown-rice milling distinction.

This is an alias recommendation, not a Québec preferred-term ruling. Keep the current display `brown rice / riz brun`; OQLF's GDT entry prefers `riz cargo` and pairs it with English `hulled rice`, which remain the existing aliases. Do not add `riz intégral`: although TERMIUM lists it, this bounded review found no corresponding Québec-market product wording. Keep `cargo rice`, `riz décortiqué`, and `riz non usiné` inactive as well.

Keep color and product qualifiers intact. The candidate `riz complet rouge` remains out of scope under the separate red-rice terminology review; this proposal does not strip `rouge` or map a qualified red-rice query to brown rice. Likewise, `flocons de riz complet` remains a flake-product wording question, not an alias for an intact grain. Do not add generic `whole grain rice` / `wholegrain rice` or a grain-length × milling × cooked-state identity matrix.

| Field | Proposed state |
|---|---|
| ID | Existing `ingredient-ref-brown-rice`; no new reference |
| English display | `brown rice` (unchanged) |
| French display | `riz brun` (unchanged) |
| English aliases | `hulled rice` (unchanged) |
| French aliases | Keep `riz cargo`; add only `riz complet` |
| Category | `GRAIN_AND_CEREAL` (unchanged) |

## Exact active, form, legacy, and ledger ownership

The exact-key audit compared normalized display names and aliases, form labels and match terms, all legacy candidate names and aliases, and ledger record IDs. Search phrase results are assessed separately below.

| Phrase or identity | Exact active/form owner | Legacy / ledger ownership |
|---|---|---|
| `brown rice` / `riz brun` | `ingredient-ref-brown-rice` owns both display keys. It currently owns aliases `hulled rice` / `riz cargo`; it has no forms, density, or unit mappings. | No exact legacy candidate. Its ledger record is verified; measurement and substitution research are `not_yet_researched`. |
| `riz complet` | No exact active display/alias, form label/match term, or legacy candidate owner. | No record ID is allocated to this phrase. The brown-rice decision text mentions it only as a withheld regional variant. The separate flakes record mentions the longer product phrase `flocons de riz complet`; neither phrase has a separate ledger identity record. |
| `riz intégral`, `riz décortiqué`, `riz non usiné`, `cargo rice`, `whole grain rice`, `wholegrain rice` | No exact active or form owner; no exact legacy candidate. | No standalone identity record. `riz intégral` appears in the existing TERMIUM evidence/withheld decision; this review does not broaden it into an alias. |
| `brown rice flakes` / `flocons de riz brun` | Separate active `ingredient-ref-brown-rice-flakes`; no form on the base brown-rice identity. | Separate reviewed ledger record. Its prior review holds `flocons de riz complet` as product-specific wording; this proposal does not change that disposition. |
| `brown rice flour` / `farine de riz brun` | Separate active `ingredient-ref-brown-rice-flour`. | Separate ledger identity; not a grain alias or form. |
| `brown rice syrup` / `sirop de riz brun` | Separate active `ingredient-ref-brown-rice-syrup`. | Separate ledger identity; not a grain alias or form. |
| `red rice` / `riz rouge` | Separate active red-rice identity. No exact active owner for qualified `riz complet rouge`. | Separate Québec review keeps the qualifier intact; not reopened here. |

## Picker phrase behavior (pre-integration snapshot)

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, returns complete word-phrase matches first, and falls back to substring matches only when no phrase match exists. This is a static assessment of current code, not live picker QA. The results below were reproduced from that matching rule using the active references and forms.

| Query | Current results | With proposed alias |
|---|---|---|
| `riz complet` | No result | Only `ingredient-ref-brown-rice` |
| `riz cargo`, `hulled rice` | `ingredient-ref-brown-rice` | Unchanged |
| `riz brun`, `brown rice` | Brown rice, brown rice flakes, brown rice flour, and brown rice syrup (4 qualified rows) | Unchanged |
| `riz complet rouge`, `flocons de riz complet`, `riz intégral` | No result | No result; the longer qualifier is not covered by the proposed shorter alias, and the other variants remain inactive |

The four results for `brown rice` / `riz brun` reflect the same phrase inside separate qualified product names; they do not make flakes, flour, or syrup aliases/forms of intact brown rice.

## Recipe-corpus demand audit

All 114 recipe paths listed in `manifest.v1.json` and all 1,123 ingredient rows were scanned. The check covered serialized recipe text, each ingredient row's original text/name/preparation/notes/reference and form IDs, and exact links to `ingredient-ref-brown-rice`. Phrases included `brown rice`, `riz brun`, `riz complet`, `riz cargo`, `hulled rice`, `riz intégral`, `riz décortiqué`, `riz non usiné`, `cargo rice`, `whole grain rice`, `wholegrain rice`, `riz complet rouge`, and `flocons de riz complet`.

| Result | Count |
|---|---:|
| Full recipe files with any candidate-phrase hit | 0 / 114 |
| Ingredient rows with any candidate-phrase hit | 0 / 1,123 |
| Ingredient rows linked to `ingredient-ref-brown-rice` | 0 |

No recipe link or recipe-specific measure is supported.

## Forms and numeric behavior — separate disposition

- **Forms:** none. Keep this identity without dry, cooked, rinsed, or other forms.
- **Density:** `defaultDensity` remains `null`; no density value is supported.
- **Unit mappings:** remain empty (`[]`).
- **Measurements:** no general cup, spoon, serving, or mass amount is supported. Dainty gives a `1 rice : 2 water` preparation ratio for its named brown-basmati product; this is manufacturer cooking guidance, not a catalog measurement or conversion.
- **Conversions and yields:** none. No dry-to-cooked yield, mass-volume conversion, or grain-length/milling conversion was found.
- **Substitutions:** none. No global form conversion or contextual ingredient substitution is established.
- **Recipe links:** none. The bundled recipe corpus has no candidate wording or row linked to this identity.

## Source register

At proposal finalization, the proposal-local source IDs below were absent from the ledger. Coordinator integration added these two entries to the existing brown-rice record, reusing `WP03-S115` and `WP03-S118` without duplicating them.

| Source ID | Source and locator | Supports / limits |
|---|---|---|
| `WP03-S115` | Government of Canada, [TERMIUM Plus: brown rice / riz brun](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frt&lang=eng&srchtxt=RIZ+INTEGRAL), *Milling and Cereal Industries*, record dated 2010-06-18. | Lists `riz brun` as correct and `riz complet` / `riz intégral` as French terms for the brown-rice definition. Supports the synonym candidate and milling boundary, but does not establish a Québec-preferred display. |
| `WP03-BRCA-20261012-S01` | La Moisson (Québec retailer), [Riz brun long biologique](https://lamoisson.com/collections/abenakis-gourmet/products/riz-brun-long-biologique), current product description. | Explicitly calls plain long brown rice **« aussi appelé riz complet »** and describes it as whole rice retaining the bran layer. This is local retail wording for one product class, not a legal definition or official language ruling. |
| `WP03-BRCA-20261012-S02` | Dainty (Canadian rice manufacturer), [Basmati brun](https://dainty.ca/fr/produits/riz-basmati-brun/), French product description, especially “Qu'est-ce que c'est”. | Calls brown basmati **« un riz complet à grains entiers »** and says only the hull is removed while bran and germ remain. The page lists availability in Québec; evidence is manufacturer usage for a named variety, not a generic conversion rule. Its cooking ratio is product-specific. |
| `WP03-S118` | Office québécois de la langue française, [GDT: riz cargo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432771/riz-cargo), definition, note, and English term. | Defines `riz cargo`, identifies it as brown rice, and pairs it with `hulled rice`; the entry's preferred French term is `riz cargo`. Retain the existing alias and display policy. The entry was last updated in 1982 and does not designate `riz complet` as preferred. |

The two sources that motivate this narrow follow-up are current Québec retailer usage and current Canadian manufacturer usage. Neither justifies expanding the alias set to every term listed in TERMIUM or replacing the established `riz brun` display.


## Coordinator integration

Added only `riz complet` as a French alias on the existing `ingredient-ref-brown-rice` row. The brown-rice display, English alias, OQLF-backed `riz cargo` alias, forms, numeric fields, recipe data, and research states remain unchanged. No app or emulator tests were run because the integration only adds database JSON data under `AGENTS.md`; see the integration record linked above.
