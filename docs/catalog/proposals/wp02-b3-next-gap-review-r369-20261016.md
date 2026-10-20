# WP02 Section 04 B3 — R369 pregelatinized waxy maize starch review

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. This file is the only change proposed by this review; no shared catalog or ledger JSON, generated index, plan, roadmap, batch README, recipe, code, or test was edited.
- **Bounded question:** Does current product and technical evidence support the exact `pregelatinized waxy maize starch` phrase left open by R366, and how should native and explicitly modified grades appear in the picker?
- **Recommendation:** Add an identity-only `pregelatinized waxy maize starch / amidon de maïs cireux prégélatinisé` reference. Keep explicit `modified pre-gelatinized waxy corn starch` searchable on the existing modified-corn-starch reference. Do not describe the new identity as chemically unmodified or universally native.
- **Plan fit:** The open B3 item is `[ ] Preserve whole-root flour versus extracted starch and raw versus pregelatinized/precooked product distinctions.` R366 integrated the general pregelatinized-corn-starch row and explicitly left the exact waxy-maize phrase unassigned. This review addresses that remaining phrase only; it does not reopen integrated rice, wheat, potato, or general corn pregelatinized rows, or R363's held tapioca review.
- **Proposed reference ID:** `ingredient-ref-pregelatinized-waxy-maize-starch`.
- **Proposed new source-ID prefix:** `WP02-B3-PREGEL-WAXY-MAIZE-R369-20261016`.

## Decision

Add `pregelatinized waxy maize starch / amidon de maïs cireux prégélatinisé` as an identity-only `FLOUR_AND_STARCH` reference. Quadra currently lists a Canadian-available Tate & Lyle product as “a pregelatinized waxy maize starch,” with “Waxy Maize Starch” as its ingredient name and powder as its physical form. Cargill separately describes its Gel-Instant™ native starch as physically modified (pregelatinized) common or waxy maize starch. Ingredion documents standard waxy-corn pregelatinized starch in snack manufacturing and directly names both “native pre-gelatinized waxy corn starch” and “modified pre-gelatinized waxy corn starch” prototypes. Together these sources establish the product phrase and the native/modified distinction without defining every commercial grade as one or the other.

The proposed identity names the documented ingredient and process descriptors; it does not claim that all pregelatinized waxy maize starch is chemically unmodified, nor that `native` means raw or untreated. Preserve the explicitly modified wording on the existing `ingredient-ref-modified-corn-starch` reference with the source-attested waxy-corn alias variants below. A search for the shared unqualified phrase can return both the new row and the modified row; that overlap reflects documented product naming and leaves the user-visible “modified” qualifier intact.

Proposed reference row:

```json
{
  "id": "ingredient-ref-pregelatinized-waxy-maize-starch",
  "nameEn": "pregelatinized waxy maize starch",
  "nameFr": "amidon de maïs cireux prégélatinisé",
  "aliasesEn": [
    "pre-gelatinized waxy maize starch",
    "pregelatinised waxy maize starch",
    "pre-gelatinized waxy corn starch",
    "pregelatinized waxy corn starch",
    "native pre-gelatinized waxy corn starch",
    "native pregelatinized waxy corn starch"
  ],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The English spellings follow the reviewed product wording and OQLF's generic `pre-gelatinized`, `pregelatinized`, and `pregelatinised` variants. `Native pre-gelatinized waxy corn starch` is an Ingredion-described prototype, not a synonym for raw native waxy maize starch. Add the following aliases to the existing `ingredient-ref-modified-corn-starch` reference, without creating a separate modified-waxy row:

```json
[
  "modified pre-gelatinized waxy corn starch",
  "modified pregelatinized waxy corn starch"
]
```

The French display combines OQLF's source-qualified `amidon de maïs cireux` wording with its preferred generic `amidon prégélatinisé`. No reviewed source gives this exact complete French product name, so keep the display provisional and add no French alias.

## Source evidence

| ID | Source and direct URL | Evidence and limit |
|---|---|---|
| S01 — new | Cargill, [Native Starches](https://www.cargill.com/food-bev/na/native-starches) | Cargill describes Gel-Instant™ “native starch” as physically modified (pregelatinized) common or waxy maize starch, providing instant viscosity without cooking. This supports a pregelatinized waxy-maize product description and shows that “native” in this supplier's product family can coexist with physical pregelatinization. The portfolio page does not establish a Canadian retail SKU, Québec package wording, household measure, or a universal grade specification. |
| S02 — new | Ingredion, [Reduce breakage and improve the eating experience in brittle snacks](https://www.ingredion.com/na/en-us/solving-a-challenge/resource-library/reduce-breakage-and-improve-the-eating-experience) | The manufacturer describes waxy-corn-based pregelatinized starch as common in sheeted snack applications and lists both “modified pre-gelatinized waxy corn starch” and “native pre-gelatinized waxy corn starch” in a manufacturing comparison. This directly supports keeping explicit modified wording on the existing modified-corn row while making the native phrase searchable on the proposed row. The page discusses a fabricated snack product and commercial processing, not household use or Canadian retail availability. |
| Reused — Quadra, [MERIGEL 300 NG Starch](https://www.quadragroup.store/products/merigel-300-ng-starch), existing source ID `WP02-B3-PREGEL-CORN-R366-20261016-S02` | The current Canadian listing names MERIGEL 300 NG as a pregelatinized waxy maize starch, supplied by Tate & Lyle, code F06983, with Canada as a regional availability, ingredient name “Waxy Maize Starch,” and powder form. It establishes a concrete product context. It does not state the treatment's chemical modification status or provide a Québec consumer label. Reuse the existing source registration; do not add a duplicate ID or URL. |
| Reused — OQLF, [amidon de grains cireux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2085948/amidon-de-grains-cireux), existing source ID `WP02-SECTION-04-B3-NATIVE-WAXY-RICE-STARCH-R189-20261016-S03` | Defines waxy starch as an amylopectin-rich cereal starch, permits the source-qualified French wording `amidon de maïs cireux`, and notes English `waxy maize starch`. It is general terminology, not a product label. |
| Reused — OQLF, [amidon prégélatinisé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357585/amidon-pregelatinise), existing source ID `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S03` | Prefers `amidon prégélatinisé`, defines the starch as treated by drying to make it soluble in cold water, and lists `pre-gelatinized`, `pregelatinized`, and `pregelatinised` among its English terms. It is generic terminology, not a waxy-maize-specific product name. |

The new Cargill and Ingredion source IDs are proposed as `WP02-B3-PREGEL-WAXY-MAIZE-R369-20261016-S01` and `WP02-B3-PREGEL-WAXY-MAIZE-R369-20261016-S02`. At the pre-proposal snapshot, both IDs and both URLs were absent from the live ledger and proposal/batch archive. Each new ID maps to one unique URL. The reused Quadra and OQLF IDs retain their existing URL mappings.

## Identity boundary and current ownership

| Current identity | Keep its scope |
|---|---|
| `ingredient-ref-cornstarch` — cornstarch / fécule de maïs; alias `corn starch / amidon de maïs` | Ordinary corn starch; do not use it to erase the pregelatinized process descriptor. |
| `ingredient-ref-modified-corn-starch` — modified corn starch / amidon de maïs modifié; current alias `modified pregelatinized corn starch` | Explicitly modified products. Add only the two waxy-corn phrase variants above, based on Ingredion's named modified prototype and the OQLF spelling variants. |
| `ingredient-ref-high-amylose-corn-starch` | High-amylose composition-qualified starch; keep distinct from ordinary and process-qualified grades. |
| `ingredient-ref-native-waxy-maize-starch` — native waxy maize starch / amidon de maïs cireux natif; alias `waxy corn starch` | The existing native waxy-maize identity. The new pregelatinized phrase must not be added as an alias here. |
| `ingredient-ref-pregelatinized-corn-starch` — pregelatinized corn starch / amidon de maïs prégélatinisé | General pregelatinized corn starch. Its current name does not contain the intervening `waxy` qualifier, so the exact waxy-specific phrase remains separately searchable. |
| Corn flour, whole-kernel flour, cornmeal, masa and precooked corn flour identities | Whole-grain or prepared flour products, not extracted starch. |

The exact English product phrase `pregelatinized waxy maize starch` already appears in the Quadra source note attached to R366's general pregelatinized-corn-starch ledger record. R366 explicitly left that phrase unassigned; the source note is evidence, not a current reference/alias or a competing ledger identity. Static exact-term checks found no owner for the proposed reference ID or the proposed display and aliases in active reference names/aliases, form labels/match terms, or legacy-import names/aliases. No form or legacy candidate has the proposed ID. The source ID/URL checks above distinguish reused evidence from new registrations.

## Picker impact

`IngredientSearch.kt` normalizes accents and punctuation, prefers complete contiguous word-phrase matches in names and aliases, and falls back to substring matching only when there are no phrase matches. This is a static projection of current names/aliases plus the proposed new row and modified-row aliases; it is not a runtime picker test.

| Query | Current result | Projected result |
|---|---|---|
| `pregelatinized waxy maize starch` | None | Pregelatinized waxy maize starch. |
| `pre-gelatinized waxy corn starch` / `pregelatinized waxy corn starch` | None | Pregelatinized waxy maize starch and modified corn starch. The explicit modified prototype remains visible. |
| `native pregelatinized waxy corn starch` | None | Pregelatinized waxy maize starch only. |
| `modified pregelatinized waxy corn starch` | None | Modified corn starch only. |
| `waxy maize starch` | Native waxy maize starch | Native waxy maize starch and pregelatinized waxy maize starch. |
| `waxy corn starch` | Native waxy maize starch | Native waxy maize starch, modified corn starch, and pregelatinized waxy maize starch. This broad query sees all relevant product descriptors. |
| `corn starch` / `amidon de maïs` | Cornstarch, high-amylose corn starch, modified corn starch, native waxy maize starch, and pregelatinized corn starch | Those five plus pregelatinized waxy maize starch. |
| `amidon de maïs cireux` | Native waxy maize starch | Native waxy maize starch and pregelatinized waxy maize starch. |
| `native waxy maize starch` | Native waxy maize starch | Remains on native waxy maize starch only. |
| `pregelatinized corn starch` | Pregelatinized corn starch and modified corn starch | Remains on those two; the added `waxy` word prevents a false waxy-row match. |

The exact process-and-composition wording gains a dedicated choice; broad corn- and waxy-starch searches gain one or more relevant results. Explicit `native` and `modified` waxy-pre-gel phrases direct to their corresponding row descriptions.

## Recipe corpus, numeric limits, and substitutions

A manifest-ordered static scan covered all **114 recipe files and 1,123 ingredient rows**. It found **9 ordinary cornstarch lines across 8 recipes**, and no row with pregelatinized-starch or waxy-maize-starch wording. The current bundle has no direct recipe demand for this identity. Leave all nine ordinary-cornstarch links and their quantities unchanged; they do not support relinking or a pregelatinized-starch substitution.

Cargill's “instant viscosity without cooking” claim and Ingredion's industrial sheeted-snack study establish use and functional differences, not a reusable kitchen measure. Ingredion's 23.07% pregelatinized-starch fraction is part of one fabricated commercial potato-chip dough formulation processed on manufacturing equipment; it is not a household amount, starch density, yield, or general replacement ratio. The sources also report product-dependent expansion, hardness, and breakage differences, so they do not support a general swap with ordinary corn starch, native waxy maize starch, or another starch. Add no forms, measurements, density, unit mappings, conversions, yields, recipe links, or global/contextual substitutions.

## Static ownership and validation record

At the read-only review snapshot the live bundle contained **1,695 ingredient references**, **140 forms**, and **114 manifest-listed recipes / 1,123 ingredient rows**. The legacy file contained **56 candidates**. The research ledger contained **2,051 records**, **9,222 source entries**, **7,803 distinct source IDs**, and **6,526 distinct URLs**. The proposed reference ID and exact proposed display/alias terms were absent from active references, forms, and legacy candidates. The phrase `pregelatinized waxy maize starch` is present only in the already-registered R366/Quadra evidence context and was explicitly deferred there. Proposed R369 source IDs and product URLs were unused in the ledger/archive; the two OQLF sources and Quadra page are reused under their existing IDs and exact URLs.

This is a documentation-only proposal. No software tests, build, emulator run, deployment, or shared catalog/ledger integration was performed.
