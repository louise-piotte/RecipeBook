# WP05 barbecue-sauce alias and everyday-condiment boundary review — 2026-10-10

- **Packet type:** proposal only; no canonical catalog, ledger, recipe, plan, roadmap, or test files changed.
- **Scope:** one English search alias for the existing BBQ sauce identity, checked against the adjacent high-overlap everyday condiment checklist and bundled recipe demand.
- **Status:** the broad WP05 everyday-sauce checklist remains open. This packet recommends a narrow alias addition, not completion of the checklist.
- **Prepared and source-access date:** 2026-10-10.

## Recommendation

Add English alias **`barbecue sauce`** to existing `ingredient-ref-bbq-sauce`. Keep its current displays `BBQ sauce` / `sauce barbecue` and its existing French alias `sauce bbq`. Do not create another identity for the same generic commercial BBQ sauce label. Do not add a French alias in this packet.

The exact phrase `barbecue sauce` is absent from current reference names and aliases, while `BBQ sauce`, `barbecue`, and `sauce bbq` each already find the one existing BBQ row. Kraft Heinz Canada uses `Original BBQ Sauce` as the English product title, describes that same product as a “barbecue sauce,” and its French product page titles it `Sauce BBQ Originale` while describing it as `sauce barbecue` [S01–S02]. This is direct bilingual product-label evidence for the proposed English synonym on the existing product family. It is product-label evidence, not a universal recipe or regulatory definition.

The alias improves exact ingredient search for two bundled recipe lines that already point to this same reference. No recipe relinking, new identity, form, measurement, conversion, or substitution is proposed.

## Current reference and adjacent checklist audit

The broad checklist at `docs/RecipeBook-global-ingredient-catalog-plan.txt` (WP05 pantry/compound section, around lines 2100–2101) remains unchecked. The live catalog already contains these exact common entries:

| Candidate from the checklist | Current canonical state | Recipe/collision note |
|---|---|---|
| Ketchup | `ingredient-ref-ketchup`, `ketchup` / `ketchup` | Three recipe lines use it. The WP06 North American review treats fruit ketchup as a separate regional compound; do not add `fruit ketchup` as a generic ketchup alias. |
| Yellow mustard and Dijon mustard | `ingredient-ref-yellow-mustard` and `ingredient-ref-dijon-mustard` | Yellow and Dijon are separate exact identities; one recipe line names each. Mustard seeds, mustard oil, and mustard greens are also separate references. |
| Generic prepared mustard | No active identity; legacy candidate `ingredient-ref-mustard` remains unreviewed | Bare `mustard` and `moutarde` each return five current identities: Dijon, yellow mustard, mustard seeds, mustard oil, and mustard greens. Do not promote the bare legacy candidate or add it as an alias to either prepared mustard. The separate legacy `ingredient-ref-mustard-powder` is a dry spice candidate, not prepared mustard. |
| Mayonnaise | `ingredient-ref-mayo`, `mayonnaise` / `mayonnaise`, aliases `mayo` in both languages | Three recipe lines use it; one exact mayonnaise line in recipe 019 is currently unlinked (see the recipe audit). This is a separate straightforward row-link finding, not part of the BBQ alias recommendation. |
| Aioli, tartar sauce, remoulade, horseradish sauce | No active matching identity | No exact ingredient-line demand in the 114 bundled recipes. Do not equate aioli with mayonnaise. The Toum integration record also explicitly keeps generic garlic sauce, aioli, and mayonnaise separate. |
| Worcestershire sauce | `ingredient-ref-worcestershire-sauce`, `worcestershire sauce` / `sauce worcestershire` | Two exact recipe lines use the existing identity. No alias or new row is needed for this packet. |
| Barbecue/BBQ sauce | `ingredient-ref-bbq-sauce`, `BBQ sauce` / `sauce barbecue`, French alias `sauce bbq` | Two exact recipe lines already link to this ID. Add only the missing English phrase `barbecue sauce`. |
| Brown sauce, steak sauce | No active matching identity | No exact ingredient-line demand in the bundled recipes. Keep as future separate review candidates rather than aliases of Worcestershire or BBQ sauce. |

The related WP05 East Asian proposal names Lee Kum Kee `Char Siu Sauce` and calls it a Chinese barbecue sauce; the WP05 Chinese-sauce review says not to alias hoisin to generic Chinese barbecue sauce. Treat Chinese/char-siu barbecue sauce as a distinct named compound if later promoted. Do not add `Chinese barbecue sauce`, `char siu sauce`, `grilling sauce`, or `sauce pour grillades` as aliases of the current North American-style commercial BBQ reference. OQLF’s Chinese-cuisine entry specifically explains that Chinese barbecue sauce differs from North American barbecue sauce and that `sauce BBQ` is used as an abbreviation in that Chinese-sauce context [S03].

OQLF’s older general `sauce barbecue` entry (1984) reserves that term for a particular thin hot accompaniment and says thick sauces used to baste meat for outdoor grilling are more accurately `sauces pour grillades` [S04]. This is a real Québec terminology caveat, not evidence for a global synonym rule. The current Canadian Kraft French page explicitly uses both `sauce BBQ` and `sauce barbecue` for the same commercial SKU [S02]; retain the existing display/alias pending independent Québec terminology review, and do not add the broader `sauce pour grillades` phrase.

## Live picker overlap and source-ID audit

Search behavior was checked against `IngredientReferenceSearchIndex` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: normalized complete word phrases are preferred, then partial matching is used only when no complete phrase matches.

| Query | Current active reference result |
|---|---|
| `barbecue sauce` | none |
| `barbecue`, `BBQ sauce`, `sauce bbq` | only `ingredient-ref-bbq-sauce` |
| `mustard`, `moutarde` | five each: Dijon, yellow, mustard seeds, mustard oil, and mustard greens |
| `ketchup` | only `ingredient-ref-ketchup` |
| `mayonnaise`, `mayo` | only `ingredient-ref-mayo` |
| `Worcestershire` | only `ingredient-ref-worcestershire-sauce` |
| `aioli`, `brown sauce`, `steak sauce`, `Chinese barbecue sauce` | none |

With the proposed English alias, exact `barbecue sauce` should resolve to only the existing `ingredient-ref-bbq-sauce` row in the current snapshot. The English query `barbecue` already resolves through the French display `sauce barbecue`; it remains the same single result. The mustard overlap is the notable broad-query collision and is why no bare mustard row or alias is advanced here.

The packet source IDs `WP05-BBQ-S01` through `WP05-BBQ-S04` were checked against all source IDs in the live evidence ledger and with `rg` across existing proposal and batch files before assignment. The current ledger has 1,945 source entries and 1,576 unique source IDs. No collision was found; this packet is the first file to introduce these four IDs.

## Recipe demand and exact-line audit

The 114 bundled recipe files contain 1,123 ingredient lines. A whole-phrase scan of `originalText` and `ingredientName` for ketchup, mustard, mayonnaise/aioli, Worcestershire, brown/steak sauce, and barbecue/BBQ terms found 13 relevant ingredient lines across eight recipes:

| Recipe | Relevant lines | Current reference mapping |
|---|---|---|
| 019 `Boulettes de crabe / Crab Balls` | Dijon mustard; mayonnaise | Dijon line maps to `ingredient-ref-dijon-mustard`; mayonnaise line `135813a6-75e2-4596-8c71-ffd450fab0ca-ingredient-13` is unlinked. |
| 034 `Chili classique au bœuf / Classic Beef Chili` | ketchup | Maps to `ingredient-ref-ketchup`. |
| 036 `Côtes levées sous vide / Sous-Vide Ribs` | barbecue sauce | Maps to `ingredient-ref-bbq-sauce`. |
| 074 `Pain de viande / Meatloaf` | Worcestershire sauce; ketchup; BBQ sauce | All three map to their current canonical references, including BBQ sauce to `ingredient-ref-bbq-sauce`. |
| 078 `Pâté chinois / Shepherd’s Pie` | Worcestershire sauce | Maps to `ingredient-ref-worcestershire-sauce`. |
| 082 `Porc effiloché / Pulled Pork` | ground yellow mustard seeds | Maps to the distinct `ingredient-ref-mustard-seeds`. |
| 083 `Poudre de cari / Curry Powder` | ground mustard seeds | Maps to the distinct `ingredient-ref-mustard-seeds`. |
| 101 `Sauce Big Mac / Big Mac Sauce` | mayonnaise; ketchup; yellow mustard | All three map to their current canonical references. |

Both recipe lines whose ingredient wording is `barbecue sauce` or `BBQ sauce` already have the same BBQ reference ID. The alias therefore addresses picker/query coverage without changing recipe data. The unlinked mayonnaise line is recorded here for coordinator triage; it is not a reason to create another mayonnaise identity.

## Numeric and substitution status

The existing BBQ reference has null `defaultDensity`, an empty `unitMappings` list, and no ingredient form. The ledger row `ingredient-ref-bbq-sauce` currently has no sources, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: not_yet_researched`. Leave these fields unchanged: the Kraft product page’s 30 mL serving size and a recipe’s 1/2- or 1/3-cup amount do not provide product mass, generic density, or a cross-product conversion [S01–S02]. No substitution is supported or proposed.

## Recommended integration checks

1. Add only English alias `barbecue sauce` to `ingredient-ref-bbq-sauce`; keep current English/French displays and French alias.
2. Record S01–S04 against the existing ledger reference as terminology/product-label evidence. Preserve null density, empty unit mappings, no forms, and no substitution rule.
3. Confirm exact picker query `barbecue sauce` returns one result, `ingredient-ref-bbq-sauce`, and that the existing queries `BBQ sauce`, `sauce barbecue`, and `sauce bbq` still resolve to the same row.
4. Keep the broad WP05 everyday-sauce checklist open. Do not promote bare generic mustard, equate mayonnaise with aioli, or merge North American BBQ sauce with Chinese/char-siu sauce, fruit ketchup, steak sauce, or Worcestershire.
5. Decide separately whether recipe 019 ingredient 13 should be linked to `ingredient-ref-mayo`; do not alter it as part of this alias-only proposal unless the coordinator intentionally extends the batch.

## Snapshot and collision details

Counts and hashes were collected from the live workspace while writing this proposal on 2026-10-10. SHA-256 values are over exact file bytes. The recipe digest is SHA-256 over recipe basenames sorted lexically, each followed by NUL, the exact recipe file bytes, then NUL.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 753 references | `9b84507e9c7bf13f70a6389fa13b7f7d0cf035c5569c5eef13c77688a02e48e6` |
| `ingredient-forms.v1.json` | 36 forms; no matching BBQ form | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| `research-ledger.v1.json` | 958 records; 1,945 source entries; 1,576 unique source IDs | `efccb44cd5ede7f5b8eea9ad7e0bce604ee0302b3544e75adcab0a28ec16ee92` |
| `legacy-import-identities.v1.json` | 82 candidates | `60d389975134f8d31c57c66caa6375b4466c4c9614d399617a64365878d6aa5f` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Bundled recipe JSON set | 114 files; 1,123 ingredient lines | `ac5c74c214e63e69f92b6e824a90ffa191281a37ad01812934ad2d59a269d0ff` |

The proposed English alias `barbecue sauce` has no normalized exact-key collision in current active references, forms, or legacy candidates. Current exact normalized matches are `BBQ sauce` and `sauce bbq` for the existing BBQ row; `barbecue` also returns that row through French display `sauce barbecue`.

## Sources accessed 2026-10-10

| ID | Source and locator | Claim and limits |
|---|---|---|
| **WP05-BBQ-S01** | Kraft Heinz Canada, [Original BBQ Sauce](https://www.kraftheinz.com/en-CA/kraft-bbq-sauce/products/00068100078527-original-bbq-sauce), page title, product description, serving-size and ingredient sections. | The SKU title is `Original BBQ Sauce`; its English product description calls it a “barbecue sauce.” Supports the proposed alias for this common commercial product label. The 455 mL package and 30 mL serving are product-specific, not density or conversion evidence. |
| **WP05-BBQ-S02** | Kraft Heinz Canada, [Sauce BBQ Originale](https://www.kraftheinz.com/fr-CA/kraft-bbq-sauce/produits/00068100078527-sauce-bbq-originale), same product identifier, title and description. | The French title is `Sauce BBQ Originale`; description calls it `sauce barbecue`. Direct evidence that the paired forms occur for the same Canada SKU. It is a manufacturer’s product label, not an OQLF terminology ruling. |
| **WP05-BBQ-S03** | OQLF, Grand dictionnaire terminologique, [sauce barbecue chinoise](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9472801/sauce-barbecue-chinoise), domain and note, updated 1996. | States Chinese BBQ sauce differs from North American sauce and identifies `sauce BBQ` / English `BBQ sauce` as abbreviations in the Chinese barbecue context. Used as a boundary warning, not to define the proposed generic commercial identity. |
| **WP05-BBQ-S04** | OQLF, Grand dictionnaire terminologique, [sauce barbecue](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2092031/sauce-barbecue), definition and note, updated 1984. | Preferred term maps `sauce barbecue` to English `barbecue sauce`, but the note restricts its definition and cautions against using it for thick grilling sauces. This older narrow entry is reported as a terminology caveat; the current Canadian manufacturer’s bilingual label is the direct evidence for this specific product phrasing. |
