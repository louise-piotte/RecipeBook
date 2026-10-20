# WP03 Section F — Hausa Koko flour identity review (2026-10-13)

## Packet record

- **Reviewed:** 2026-10-13.
- **Status:** proposal only; no shared catalog, ledger, recipe, plan, or roadmap data changed.
- **Open checklist:** [Section F, regional cereal mixes and preprocessed grains](../../RecipeBook-global-ingredient-catalog-plan.txt#L2470).
- **Scope:** the dry Ghanaian retail product sold as Hausa Koko flour, a grain-and-spice mix used to make Hausa koko porridge. This does not allocate the prepared porridge, wet fermented millet dough, generic millet flour, maize-based regional variants, or another branded breakfast mix.
- **Source-ID prefix:** `WP03-HAUSA-KOKO-FLOUR-IDENTITY-20261013-`. Scoped searches across the plan, roadmap, proposal/batch archive, ledger, active catalog, forms, legacy candidates, and bundled recipes found no prior use of the candidate terms or this prefix. The proposed ID `ingredient-ref-hausa-koko-flour` and this proposal path are unused.
- **Decision:** keep the candidate unallocated and outside the active picker. Although current sources establish a distinct dry flour product, the picker would make the single-word query `koko` select this flour because `koko` appears inside its bilingual display. That could lead a user to link a prepared-porridge recipe line to the dry mix. Do not add an active row, alias, form, measurement, recipe link, conversion, yield, or substitution; do not add a ledger record from this proposal alone.
- **Candidate ID:** `ingredient-ref-hausa-koko-flour` (proposed only, not allocated).

## Prior coverage and ownership

The live Section F item remains open. Its nearby decisions already cover or separately hold barley couscous, ragi rava, misugaru, Sankhal, arraw, thiakry, sprouted brown rice, quick-cooking rice, bran products, and other named cereal products. The archive also contains the integrated hot-cereal, grain-flake, and cereal-blend identities and separately reviewed farro, sushi-rice, pearled-hominy, and pozole-corn boundaries. The recent [Tom Brown family-level hold](wp03-section-f-tom-brown-cereal-mix-boundary-hold-20261013.md) covers a different cereal-mix name and does not allocate or review Hausa Koko flour. Searches across the plan, roadmap, proposal and batch archives, ledger, active catalog, forms, legacy candidates, and bundled recipes found no Hausa Koko flour review or decision.

The live package snapshot contains **1,362 references, 100 forms, 64 legacy candidates, and 114 manifest-listed recipes**. Normalized phrase-first and substring-fallback audits found no exact owner for `Hausa koko flour`, `Hausa koko`, `Hausa`, `koko`, `farine Hausa Koko`, or `farine de koko haoussa` in references, form labels/match terms, or legacy names/aliases. The research ledger has no matching candidate or decision, and the proposed ID has no collision. The active `millet`, `millet flour`, `sorghum flour`, and ginger references remain component identities; none owns the source-named prepared grain-and-spice flour. No form is attached to an exact Hausa Koko owner.

## Product boundary and labels

Ghanaian vendor research identifies Hausa koko as a distinct prepared cereal food: 94% of surveyed vendors used millet as the principal ingredient, with varied spices; preparation included soaking, milling, slurry making, fermentation, and cooking. The same study reports variation in spice choices and quantities and does not establish a single commercial dry-mix formula. Retail listings separately sell a dry flour product under the name **Hausa Koko Flour** and describe it as intended for the porridge. One Canadian listing specifies millet, sorghum, and ginger, so that formula is evidence for that product listing only.

If a later picker review resolves the broad-token issue, the bounded reference should name the **dry, packaged mix** only. It remains separate from plain millet flour and sorghum flour, from fresh wet dough, and from cooked Hausa koko. Do not turn the preparation name `Hausa koko` alone into a global alias: regional sources also use it for the prepared porridge, and the grain base can vary. The source-attested labels below are candidate wording only and are not active:

| Field | Proposed value | Limit |
| --- | --- | --- |
| ID | `ingredient-ref-hausa-koko-flour` | Not allocated yet. |
| Candidate category | `GRAIN_AND_CEREAL` | Only if a later picker review supports activation. |
| English display | `Hausa koko flour` | Retail product wording; no claim that every maker uses the same grain blend. |
| French display | `farine de koko haoussa` | Canadian French-language product-category wording; retail wording only, not a terminology ruling. |
| English aliases | None | If later activated, do not add `millet flour`, `spiced millet flour`, `koko`, `pap`, `kunu`, or `Garin Kunu`. |
| French alias candidate | `farine Hausa Koko` | Phrase appears in a Montréal grocery flyer. If later activated, do not generalize to `farine de mil`, `bouillie de mil`, or a constructed translation. |
| Forms | None | The proposed reference itself is the named dry mix; wet dough and cooked porridge are outside scope. |

## Search and recipe demand

The picker uses normalized complete-word phrases first and falls back to substring matching only when no complete phrase matches. A read-only simulation with the candidate bilingual display and French retail wording shows:

| Query | Current | With proposed row | Effect |
| --- | --- | --- | --- |
| `Hausa koko flour`, `farine de koko haoussa`, `farine Hausa Koko` | 0 | 1 exact result | The full product name selects the candidate. |
| `koko`, `Hausa koko` | 0 | 1 exact result | **Problem:** a short query for the prepared food would select the dry flour. |
| `Hausa` | 0 | 1 exact result | Adds one broad-name result. |
| `farine` | 123 references | 124 | Adds one general flour result. |
| `flour` | 122 references | 123 | Adds one general flour result. |
| `millet flour` | 6 exact phrase results | 6 | Unchanged because the candidate does not alias itself to plain millet flour. |
| `millet` | 18 exact phrase results | 18 | Unchanged; formulation ingredients are not search aliases. |

The audit scanned the serialized contents of all **114 recipe files / 1,123 ingredient rows** for Hausa Koko spellings, Hausa Koko flour, French display candidates, and spiced-millet-flour wording. It found **zero bundled recipe hits** and no existing reference links. No recipe link or relink is proposed. Regional research and retailer preparation descriptions establish culinary use, but not bundled-recipe demand.

## Measurement and substitution limits

No exact candidate form, default density, or unit mapping exists. Keep `defaultDensity` null, `unitMappings` empty, and active forms absent. The 400 g, 0.95 lb, and 1 kg values shown on different listings are product/package observations, not transferable household measures. The research study's reported ingredient percentages describe surveyed vendor-prepared porridge, not a validated flour ratio or mass-volume relation. Retail listings give no common cup, spoon, water ratio, or yield. Add no serving, density, conversion, or cooking-yield data.

The bundled global and contextual substitution-rule arrays currently contain zero rows. Add no substitutions: Hausa Koko flour contains a grain-and-spice formulation and has a preparation process distinct from plain millet or sorghum flour; the sources do not establish a safe general replacement direction or ratio. Do not infer a substitution from a shared porridge use.

## Evidence register

| ID | Source | What it supports and its limits |
| --- | --- | --- |
| `WP03-HAUSA-KOKO-FLOUR-IDENTITY-20261013-S01` | Francisca Korley et al., [“Hausa Koko: Consumer Knowledge and Preparation Methods,” *Journal of Science and Technology (Ghana)* 42(3), 40–53 (2024)](https://www.ajol.info/index.php/just/article/view/281353), DOI [10.4314/just.v42i3.4](https://doi.org/10.4314/just.v42i3.4). | Primary vendor/consumer research. Reports millet as the principal ingredient for most sampled vendors, varying spices, and traditional soaking/fermentation/cooking steps. Surveyed prepared porridge, not a universal retail flour formulation or household conversion. |
| `WP03-HAUSA-KOKO-FLOUR-IDENTITY-20261013-S02` | Ghana News Agency, [“Hausa Koko is an essential food in Ramadan”](https://gna.org.gh/2024/03/hausa-koko-is-an-essential-food-in-ramadan/), 2024-03-26. | Reports a Ghanaian millet-and-spice porridge and a soaking, milling, fermentation, and cooking process. News reporting and local vendor accounts; not a technical standard or packaged-product specification. |
| `WP03-HAUSA-KOKO-FLOUR-IDENTITY-20261013-S03` | Best Bargain / BB African Foods, [Home Fresh Hausa Koko Flour](https://bbafricanfoods.com/products/home-freah-hausa-koko-flour), Canadian retailer product listing. | States that its Ghana-produced product contains millet, sorghum, and ginger and is used for porridge. Retail description only; it does not provide proportions or a complete standardized formula. |
| `WP03-HAUSA-KOKO-FLOUR-IDENTITY-20261013-S04` | Kazi Foods / Mile 12 African Store, [Hausa Koko Flour](https://mile12african.ca/products/hausa-koko-flour) and [French-language category listing](https://mile12african.ca/fr/collections/yam-and-sweet-potatoes), checked 2026-10-13. | Uses the English dry-product title and says it is for Hausa porridge; the French listing supports `farine de koko haoussa`. The seller is in Mississauga, Ontario, and the English item page was marked sold out; this is Canadian retailer wording, not Québec regulatory terminology or a composition statement. |
| `WP03-HAUSA-KOKO-FLOUR-IDENTITY-20261013-S05` | Prixli, [Marché Salaberry flyer, 2026-08-27 to 2026-09-09](https://prixli.ca/fr/flyers/marche-salaberry/CA%3AH2X1Y4%3A8111501); [Montréal store listing](https://www.pagesjaunes.ca/bus/Quebec/Montreal/Salaberry-Marche/2394067.html). | Lists `Precious Farine Hausa Koko` for a Montréal retailer. The flyer period has expired; use it only as recent Québec retail-name evidence, not as proof of current stock or ingredients. |

## Next action

Keep this candidate on hold until picker behavior can distinguish the full dry-product name from bare `koko`/`Hausa koko` queries. Then repeat the search projection before deciding whether to add the bilingual identity. If later accepted, keep it separate from plain grain/flour references and the cooked porridge, with no unsupported numeric behavior. Leave the broader Section F checklist open.
