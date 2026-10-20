# WP03 Section L R625 — generic bell-pepper identity review — 2026-10-18

- **Status:** proposal only. No shared catalog, ledger, package, checklist, roadmap, or generated file was changed.
- **Disposition:** promote the existing legacy candidate as one identity-only row: **bell pepper / poivron**. Use the OQLF-attested search terms `bell peppers`, `sweet pepper`, `poivrons`, and `piment doux`; keep color-qualified terms and neighboring named pepper identities separate.
- **Plan fit:** the generic bell-pepper gap is part of the open WP03 Section L item, “Bell peppers and fresh chiles,” at [the plant-food plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6119). The roadmap’s [R621 entry](../../../roadmap.md#L46) is the separate Section F quick-oats access hold and does not overlap this produce review. This proposal does not close the wider Section L or pepper checklist.
- **Stable ID:** reuse `ingredient-ref-bell-pepper` from the legacy-import candidate; do not create a second ID.
- **Proposal-local source-ID prefix:** `WP03-L-BELL-PEPPER-R625-20261018-S`. These IDs are not ledger writes until the integration owner accepts the proposal.

## Decision and boundaries

Promote one bilingual `VEGETABLE_AND_AROMATIC` identity for the generic fresh-market bell pepper. The existing legacy row already supplies the intended ID and bilingual labels. This matches [Requirements FR-7](../../../Requirements.md#L375), which calls for ingredient references searchable in English and French with aliases. The Office québécois de la langue française (OQLF) GDT entry for **poivron** gives `poivron` and `piment doux` as preferred French terms and `bell pepper` and `sweet pepper` as English terms. It describes the food as used as a vegetable, cooked or raw, and recognizes several colors and shapes. This supports the source identity and names without requiring a cultivar, lobe-count, or species assertion. [S01]

Use the two preferred displays and source-attested terms only. The current picker does not singularize or pluralize, so include the common display plurals. Do not add `pepper`, `peppers`, `piment`, `piments`, `red pepper`, `green pepper`, or `poivron rouge/vert` as aliases. `pepper` and `piment` are family-level terms in the active catalog; red and green are color/maturity descriptions, not evidence for extra identities or forms here. Do not add `piments doux`: a query for its first word, `piments`, would otherwise resolve to this one row and create a misleading singleton.

Keep the existing `Cubanelle pepper / piment doux Cubanelle` identity distinct. It remains one of the results for the broader French queries `poivron` and `piment doux`; the new generic row makes those queries show the generic pepper alongside the named variety. Keep all other named chiles and sweet- or mild-pepper varieties separate. No cultivar or botanical name is added: the OQLF entry lists multiple Latin taxa and says shapes and colors vary. [S01]

Do not add green, red, yellow, orange, purple, raw, cooked, roasted, or peeled forms in this pass. OQLF describes colors and maturity, and current Québec retail material shows color-qualified product wording, but the bundled recipes do not request a bell-pepper form. The general fresh pepper identity, its recipe behavior, and any processing boundary can be reviewed when recipe or product evidence calls for them. [S01–S03]

## Exact proposed reference JSON delta

Append this row to `ingredient-references.v1.json`, reusing the legacy ID and its existing category:

```json
{
  "id": "ingredient-ref-bell-pepper",
  "nameFr": "poivron",
  "nameEn": "bell pepper",
  "aliasesFr": ["piment doux", "poivrons"],
  "aliasesEn": ["bell peppers", "sweet pepper"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

No form, unit mapping, density, count weight, package yield, conversion, substitution, or recipe link is proposed. Keep measurement and substitution research at `not_yet_researched`; do not derive values from the retailer examples or from plant-composition data.

## Current ownership and duplicate audit

The read-only 2026-10-18 snapshot has **1,825 active references**, **156 forms**, **56 legacy candidates**, and **2,197 ledger records / 10,223 source entries**.

| Surface | Current finding | R625 action |
|---|---|---|
| Active reference | No active row or alias owns the exact display `bell pepper`. The only active `poivron` phrase owner is `ingredient-ref-cubanelle-pepper`, through `poivron Cubanelle`. | Promote the generic identity under the existing stable legacy ID. Keep the Cubanelle row intact. |
| Legacy candidate | `ingredient-ref-bell-pepper` already has `nameEn: bell pepper`, `nameFr: poivron`, category `VEGETABLE_AND_AROMATIC`, and empty alias arrays in [the legacy candidate list](../legacy-import-identities.v1.json). | Reuse its ID and display names; do not add an alias-only duplicate. |
| Forms and numeric data | No bell-pepper form, density, or unit mapping is active. | No form or numeric behavior proposed. |
| Research ledger | The [ledger record `ingredient-ref-bell-pepper`](../research-ledger.v1.json#L31365) is an unsourced `candidate` with an unresolved legacy-catalog decision. | Update that same record to an accepted, verified `ingredient_reference` only if the integration lead accepts this proposal; retain measurement and substitution states as `not_yet_researched`. |
| Prior reviews | WP03 R136–R146 and WP06 R449 address named pepper identities and deliberately keep generic terms off those rows. R449 specifically notes that no generic bell-pepper owner was active at its review snapshot. No focused general bell-pepper decision was found. | This is the missing generic owner those adjacent reviews left unassigned, not a reopening of their cultivar, dried-product, or peppercorn boundaries. |

No active row has the exact display or alias `bell pepper`, `bell peppers`, `sweet pepper`, or `piment doux`. The phrase search for `piment doux` currently returns only Cubanelle because its display is `piment doux Cubanelle`. No other active row has the proposed `ingredient-ref-bell-pepper` ID. The existing Cubanelle phrase is intentional and remains separately searchable.

## Primary source register and source ownership

Sources were checked on 2026-10-18. The OQLF page is directly accessible; the current Metro pages were available as indexed first-party excerpts, but direct opening returned HTTP 403 through the browser tool. The Metro material is used only as local-market corroboration, not as the terminology authority or as a source for reusable quantity data.

| Proposal-local source ID | Source | What it supports and limits |
|---|---|---|
| `WP03-L-BELL-PEPPER-R625-20261018-S01` | OQLF, [GDT: poivron](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082786/poivron), last updated 1991; accessed 2026-10-18. | Directly pairs the preferred French `poivron` and `piment doux` with English `bell pepper` and `sweet pepper`. Defines the culinary use and describes color and shape variation. The entry’s Latin taxa are not promoted as a modern species claim for the catalog row. |
| `WP03-L-BELL-PEPPER-R625-20261018-S02` | CFIA, [D-10-01: General phytosanitary requirements for fresh pepper and tomato fruit imported from the world](https://inspection.canada.ca/en/plant-health/invasive-pests-and-plants/directives/horticulture/10-01), effective 2022-10-19, third revision; accessed 2026-10-18. | Current federal guidance treats imported fresh pepper fruit as a food/plant commodity and uses `Capsicum spp.` in its scope. It is corroboration for the fresh commodity context only; it does not define bell-pepper names or a retail cultivar. |
| `WP03-L-BELL-PEPPER-R625-20261018-S03` | Metro, [Poivrons](https://www.metro.ca/produits-a-decouvrir/fruits-et-legumes/nos-fruits-legumes-et-fines-herbes/poivrons-verts) and [Poivron vert, product 4065](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/poivron-vert/p/4065), current Québec grocery material; indexed excerpts accessed 2026-10-18. | Uses the market category `poivrons` and `poivron vert`, and describes color-qualified produce. The browser tool could not open the pages directly (403); do not use their item estimate, recipe suggestions, or other listing details as generic weights or forms. |

The three exact source URLs above are not owned by any current ledger source entry. Before this proposal was created, the R625 source-ID prefix and all three IDs had no ledger or proposal/archive owner. The existing candidate record is the only ledger record proposed for update; do not create a second bell-pepper record. The prefix is proposal-local until the coordinator assigns ledger ownership.

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): case/diacritic folding, exact word-phrase matches before substring fallback, and no plural stemming. It does not modify or test the application.

| Query | Current results | With proposed row | Effect |
|---|---:|---:|---|
| `bell pepper` / `bell peppers` | 0 / 0 | 1 / 1 | Exact English display and plural alias resolve to the generic row. |
| `poivron` / `poivrons` | 1 / 0 | 2 / 1 | `poivron` now returns generic bell pepper and Cubanelle; the plural resolves to the generic row. |
| `sweet pepper` / `piment doux` | 0 / 1 | 1 / 2 | The OQLF terms resolve to the generic row; `piment doux` continues to include the qualified Cubanelle result. |
| `pepper` / `peppers` | 34 / 11 | 35 / 12 | Both remain broad multi-result searches; no generic `pepper` alias is introduced. |
| `piment` / `piments` | 27 / 0 | 28 / 0 | The singular `piment` query remains broad; no plural family alias is added. |
| `poivron rouge` / `poivron vert` | 0 / 0 | 0 / 0 | Color-qualified queries remain unresolved; no color form is inferred. |

The `poivron` increase is intentional: the current single result is a named Cubanelle type, while the OQLF-backed generic identity is missing. No generic alias is added to any variety row.

## Recipe demand and exact non-actions

All **114 manifest-listed recipes / 1,123 ingredient rows** were scanned in manifest order for `bell pepper`, plural and hyphen variants, `sweet pepper`, `poivron(s)`, and `piment(s) doux`. There are **zero candidate ingredient-row hits**. The full manifest-ordered corpus is 753,988 bytes with SHA-256 `9ce6aacaa49652e31b908b3f05df752b58763fef274588ebc1eee4ea11722857`.

Pepper-related rows in the bundle name black pepper, cayenne, jalapeño, or serrano. Recipe `097#6` has the text `Pepper, to taste` and is already linked to `ingredient-ref-black-pepper`; it is not evidence for a bell-pepper link. Preserve all recipe text, references, and quantities. Do not add a form, infer color, or add any pepper substitution.

## Static review checks

- [x] Confirmed the open WP03 Section L bell-pepper checklist item and the related R136–R146/R449 boundaries.
- [x] Inspected the existing legacy candidate, active reference and form sets, and the unsourced ledger candidate record.
- [x] Checked source URL ownership and the proposed R625 ID prefix; no current owner or collision was found.
- [x] Scanned the manifest-listed 114-recipe / 1,123-row corpus for the candidate naming family; found no bell-pepper ingredient row.
- [x] Projected phrase-first picker effects with the current bilingual names and aliases, including the existing Cubanelle match.
- [x] Verified the source review against the OQLF and CFIA primary pages and first-party Metro indexed excerpts; recorded the direct-open 403 limitation for Metro.
- [x] No shared catalog, ledger, seed package, plan, roadmap, or generated file was changed. No software tests, build, emulator run, or deployment was needed for this proposal-only review.
