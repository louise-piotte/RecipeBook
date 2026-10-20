# WP02 Section 04 B3 — R366 pregelatinized corn starch identity review

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. This file is the only change proposed by this review; no live catalog or ledger JSON, generated index, plan, roadmap, batch README, recipe, or code was edited.
- **Bounded question:** Does current food-product evidence support a pregelatinized corn-starch picker identity alongside ordinary, modified, high-amylose, and native waxy maize starch?
- **Recommendation:** Integrate an identity-only pregelatinized corn-starch reference. Keep explicitly modified pregelatinized corn starch searchable on the existing modified-corn-starch reference. A broad pregelatinized-corn query will therefore return both relevant identities.
- **Plan fit:** The open B3 item is `[ ] Preserve whole-root flour versus extracted starch and raw versus pregelatinized/precooked product distinctions.` Its checked note requires exact product/source context before adding a source-neutral row. The reviewed products provide that context. This review does not reopen the integrated pregelatinized rice, wheat, or potato rows, the native waxy-maize row, or R363's separate tapioca-starch hold; the parent B3 item remains open.
- **Proposed reference ID:** `ingredient-ref-pregelatinized-corn-starch`.
- **Proposed source-ID prefix:** `WP02-B3-PREGEL-CORN-R366-20261016`.

## Decision

Add `pregelatinized corn starch / amidon de maïs prégélatinisé` as an identity-only `FLOUR_AND_STARCH` reference. AGRANA documents food-grade pregelatinized corn starches produced without chemical modification; Roquette separately names a label-friendly food product “Pregelatinized corn starch.” These are adequate exact product contexts for the process-specific identity. They do not show that every product sold as pregelatinized corn starch is chemically unmodified.

Roquette also names a product “Modified pregelatinized corn starch (E1412).” Keep that explicit modified grade under the existing `ingredient-ref-modified-corn-starch` row by adding the source-attested English alias `modified pregelatinized corn starch` there. The common phrase `pregelatinized corn starch` will match both rows, so users can choose according to the package qualifier. Do not classify modified grades as unmodified or use `native` as a synonym.

Proposed reference row:

```json
{
  "id": "ingredient-ref-pregelatinized-corn-starch",
  "nameEn": "pregelatinized corn starch",
  "nameFr": "amidon de maïs prégélatinisé",
  "aliasesEn": ["pre-gelatinized corn starch", "pregelatinised corn starch"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The French display combines OQLF's preferred generic `amidon prégélatinisé` with its preferred corn-starch term `amidon de maïs`; no reviewed source gives the complete corn-specific French phrase. Treat the display as terminology-based and provisional, and add no French aliases. Keep generic `instant`, `precooked`, `cold-water-soluble`, `cold-water-swelling`, and `native` terms out of the alias list: the OQLF entry lists some as generic translations, but it does not establish that they name the same corn-starch product class in recipe use.

## Source evidence

| ID | Source and direct URL | Evidence and limit |
|---|---|---|
| S01 | AGRANA, [QUEMLITE for Food & Beverages](https://www.agrana.com/products-and-solutions/product/quemlite-for-food-beverages) | Describes a family of pregelatinized corn starches for food applications and explicitly says it is produced without chemical modification or extended heating. The page describes industrial applications and global packaging options; availability varies by market and it is not a Canadian stock listing. It supports a real pregelatinized corn-starch product class, not a universal equivalence or household measure. |
| S02 | Quadra, [MERIGEL 300 NG Starch](https://www.quadragroup.store/products/merigel-300-ng-starch) | A current Canadian supplier listing names a pregelatinized waxy maize starch, supplied by Tate & Lyle, with “Waxy Maize Starch” as the ingredient name, powder form, and Canada as a regional availability. This supports a Canadian food-grade pregelatinized maize product. It does not say whether the grade is chemically modified and does not establish a Québec French label. Do not alias its waxy-specific phrase to the proposed general row or to the existing native waxy row. |
| S03 | Roquette, [PREGEFLO MM](https://www.roquette.com/food-nutrition/product-catalog/pregeflo-mm) | The food and nutrition product page calls it “Pregelatinized corn starch,” describes it as label-friendly, and lists bakery and snack uses. Its functional and commercial claims are product-specific and do not establish a kitchen measure or Canada-specific retail availability. |
| S04 | Roquette, [PREGEFLO MI 20 A](https://www.roquette.com/food-nutrition/product-catalog/pregeflo-mi-20-a) | The page calls this product “Modified pregelatinized corn starch (E1412).” This is direct evidence that the pregelatinized process descriptor can coexist with a modified-corn-starch identity. The exact phrase should resolve to the existing modified row, not be treated as unmodified pregelatinized corn starch. |
| Reused | OQLF, [amidon prégélatinisé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357585/amidon-pregelatinise), existing source ID `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S03` | Prefers `amidon prégélatinisé`, defines it as starch treated by drying to become cold-water soluble, and lists English spelling variants `pre-gelatinized`, `pregelatinized`, and `pregelatinised`. It is generic terminology, not a corn-specific label or a basis for adding every listed generic translation as an alias. |
| Reused | OQLF, [amidon de maïs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357607/amidon-de-mais), existing source ID `WP02-B3-MODIFIED-CORN-STARCH-20261014-R92-S03` | Supports `amidon de maïs` and `fécule de maïs` for corn starch. It does not attest the full proposed French compound. |

S01–S04 are proposed under the new R366 prefix. Static ledger and archive checks found no existing use of that prefix or any of the four IDs, and no existing registration of the four product-page URLs. Each proposed source ID maps to one unique URL. The two OQLF entries reuse their current B3 source IDs at the exact registered URLs; no duplicate source registration is proposed.

## Identity boundary and current ownership

The live catalog currently has these distinct corn-starch references:

| Current identity | Keep its scope |
|---|---|
| `ingredient-ref-cornstarch` — `cornstarch / fécule de maïs`, aliases `corn starch / amidon de maïs` | Ordinary corn starch. Its `defaultDensity` is null and `unitMappings` are empty. |
| `ingredient-ref-modified-corn-starch` — `modified corn starch / amidon de maïs modifié` | Explicitly modified products. Add only the source-attested English alias `modified pregelatinized corn starch` from S04. |
| `ingredient-ref-high-amylose-corn-starch` — `high amylose corn starch / amidon de maïs à haute teneur en amylose` | Composition-qualified starch; do not attach pregelatinized or generic resistant wording. |
| `ingredient-ref-native-waxy-maize-starch` — `native waxy maize starch / amidon de maïs cireux natif`, alias `waxy corn starch` | Native waxy maize composition/state. Keep `native` and `waxy` off the proposed pregelatinized row. |
| Corn flour, cornmeal, whole-kernel corn flour, and precooked corn flour references | Whole-grain or flour products, not extracted starch. Keep them separate. |

The candidate is a process-qualified, extracted starch product, not whole-root/whole-kernel flour, meal, masa harina, or precooked corn flour. It is also distinct from the native waxy-maize row: Quadra's waxy product is explicitly pregelatinized, while the existing row names a native grade. The exact phrase `pregelatinized waxy maize starch` remains unassigned because collapsing that product into either broad row would hide one of its qualifiers; a dedicated waxy-pregel identity would require its own bounded review.

At the current snapshot, no active reference, form, legacy candidate, or ledger record owns the proposed ID or the exact phrases `pregelatinized corn starch`, `pre-gelatinized corn starch`, `pregelatinised corn starch`, `amidon de maïs prégélatinisé`, or `modified pregelatinized corn starch`. Before this file was drafted, no focused pregelatinized-corn review or R366 prefix appeared in the proposal/batch archive. Relevant nearby decisions are R92 modified corn, R123 high-amylose corn, R192 native waxy maize, and the process-specific rice (R125), wheat (R187), and potato (R266) integrations. R363 is the separate held tapioca candidate and is not changed here.

## Picker impact

`IngredientSearch.kt` folds accents and punctuation, checks complete normalized word phrases first, and falls back to substring matching. The following is a static projection against current reference names/aliases and the proposed row plus the S04 alias on the existing modified row; it is not a runtime picker test.

| Query | Current result | Projected result |
|---|---|---|
| `pregelatinized corn starch` | None | Pregelatinized corn starch and modified corn starch. The broad phrase legitimately matches both process/product descriptors. |
| `pre-gelatinized corn starch` | None | Pregelatinized corn starch. |
| `pregelatinised corn starch` | None | Pregelatinized corn starch. |
| `amidon de maïs prégélatinisé` | None | Pregelatinized corn starch. |
| `modified pregelatinized corn starch` | None | Modified corn starch only. |
| `corn starch` | Cornstarch, high-amylose corn starch, modified corn starch, and native waxy maize starch | The same four plus pregelatinized corn starch. |
| `amidon de maïs` | The same four corn-starch identities | The same four plus pregelatinized corn starch. |
| `modified corn starch` / `high amylose corn starch` | Their respective single rows | Remain on their respective single rows. |
| `waxy corn starch` | Native waxy maize starch | Remains native waxy maize starch only. |
| `pregelatinized waxy maize starch` | None | None; the source-specific waxy qualifier is not aliased to the general row. |

This adds one option to broad corn-starch searches. Search terms with explicit `modified` remain on the modified row; the generic pregel phrase exposes the documented overlap so the picker does not silently assign a modified product to a non-modified-specific display.

## Recipe corpus, numeric limits, and substitutions

A manifest-ordered static scan covered all **114 recipe files and 1,123 ingredient rows**. It found **9 ordinary cornstarch lines across 8 recipes** and no pregelatinized-corn wording or linked pregelatinized-corn reference. The existing lines remain linked to ordinary cornstarch; they show ordinary recipe use only and do not support relinking or a pregelatinized-corn substitution.

The live ordinary-cornstarch row has no density or unit mappings. The bundled recipe quantities are not paired mass/volume observations. The product sources describe powder presentation and industrial food functionality, but publish no reusable household volume, kitchen density, or yield. They provide no general mass-for-mass replacement ratio for ordinary cornstarch or other starches. Add no density, mappings, forms, measurements, conversions, package yields, recipe links, or global/contextual substitutions.

## Static ownership and validation record

At the read-only review snapshot the live package contained **1,694 ingredient references**, **139 forms**, and **114 manifest-listed recipes / 1,123 ingredient rows**; the legacy file contained **56 candidates** and the ledger contained **2,050 records / 9,210 source entries / 7,794 distinct source IDs / 6,517 distinct URLs**. The proposed reference ID and exact phrases were absent from active refs, forms, legacy candidates, and ledger records. The new source prefix, IDs, and product URLs were unused in the ledger/archive; reused OQLF source IDs retain their current URL mappings.

This is a documentation-only proposal. No software tests, build, emulator run, deployment, or shared catalog/ledger integration was performed.
