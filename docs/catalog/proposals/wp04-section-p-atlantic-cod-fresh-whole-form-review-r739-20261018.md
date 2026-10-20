# WP04 Section P R739 — fresh whole Atlantic cod form review

- **Review and source-access date:** 2026-10-18.
- **Status:** Integrated in the WP02/WP03/WP04 R737–R739 batch. The qualified fresh-whole form and its form-level evidence record are active; no recipe, measure, yield, conversion, or substitution was added.
- **Checklist:** The open Section P finfish item covers salmon, cod, pollock, halibut, and regional fish ([global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6840)). R739 selects one distinct product-form gap under the existing Atlantic-cod identity.
- **Target:** One fresh-whole presentation under `ingredient-ref-atlantic-cod` for *Gadus morhua*.
- **Recommendation:** Add one `fresh_whole` form labeled **fresh whole Atlantic cod / morue de l’Atlantique fraîche entière**. The current Canadian product evidence describes a whole cod sold fresh, specifically head-off and gutted. Do not generalize that SKU preparation to all Atlantic cod, infer an intact head or an uncleaned fish, or add measures, yield, recipe links, conversions, or substitutions.

## Evidence and form boundary

The current Salties listing is the direct product evidence. It is titled “Fresh Cod, Whole, gutted”; the detail row specifies “4,000g+, heads off, gutted”; it says the product is available year-round; and it lists Atlantic Cod as an alternate name and *Gadus morhua* as the Latin name. Its product copy calls the item a whole cod and says it arrives fresh. This establishes a current Canadian example of fresh whole Atlantic cod as sold by this supplier. It also makes clear that “whole” here does not mean head-on or un-gutted. The proposed form covers that whole-fish presentation class; the source’s head-off/gutted details remain source-specific and are not implicit defaults for every product in the form.

The paired Seafood from Canada species pages show why the form note needs this limit. Both identify *Gadus morhua* and show an image alt label “Whole, raw Atlantic Cod,” but the current product-form tables list fresh HOG (eviscerated with head) and H&G (eviscerated without head), followed by fillets and other forms; they do not list an unqualified fresh-whole category. Their French table likewise lists `Frais : HOG (éviscéré avec tête), H&G (éviscéré sans tête)` and does not list `entier` separately. This is not evidence against the specific Salties product; it means the proposal must not imply that every Canadian fresh Atlantic-cod offer has the same form or preparation.

Fisheries and Oceans Canada’s 1998–1999 trade table uses the exact bilingual category “Cod, Atlantic, fresh, whole, dressed / Morue de l’Atlantique, fraîche, entière, habillée.” This corroborates historical bilingual trade wording, but it is not current retail inventory or a kitchen-preparation standard. The proposed French display composes the existing Québec identity with gender-agreeing form adjectives; it does not claim Salties uses this French label. Salties’ own French synonym line says `Cabillaud`; do not add that term to the Québec catalog.

## Bilingual identity, ownership, and prior work

The current parent is `Atlantic cod / morue de l’Atlantique`, with the English alias `scrod cod`, no French aliases, null default density, and no unit mappings. Its OQLF evidence pairs `Atlantic Cod`, `morue de l’Atlantique`, and *Gadus morhua*. The proposed label follows that Québec identity; `fraîche` and `entière` agree grammatically with `morue`. Keep bare `cod`, `morue`, `whole cod`, `morue entière`, `cabillaud`, `schrod`, and scientific names out of new aliases or match terms.

The active parent has only `ingredient-form-atlantic-cod-loin`; there is no fresh-whole form. The form ID `ingredient-form-atlantic-cod-fresh-whole`, the bilingual labels, and the full-label phrases have no exact active form or legacy-candidate owner. No recipe row currently targets the parent or a cod form.

R712 added only the qualified English `scrod cod` alias. Its existing ledger source `WP04-SECTIONP-SCROD-BOUNDARY-R712-20261018-P06` already owns the Salties URL; reuse that source and do not create a duplicate ledger source row for it. R683’s Atlantic-cod fillet hold and R565’s centre-cut hold remain unchanged. R560’s Atlantic-cod loin form is a distinct cut. R709, R733, and R736 cover other fish identities; their forms and evidence are not transferred to Atlantic cod.

Read-only package snapshot: **1,848 references / 176 forms / 56 legacy candidates; 2,233 ledger records / 10,476 source entries / 8,845 distinct source IDs / 7,492 distinct URLs; 114 manifest-listed recipes / 1,123 structured ingredient rows.** The Atlantic-cod parent ledger row retains `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`.

## Sources and exact ownership

| Evidence | Finding | Limit and ownership |
|---|---|---|
| Existing source `WP04-SECTIONP-SCROD-BOUNDARY-R712-20261018-P06`, Salties, [Fresh Cod, Whole, gutted](https://www.salties.ca/products/fresh-cod-whole-gutted), accessed 2026-10-18 | Current Canadian listing: whole cod sold fresh; details say 4,000 g+, heads off, gutted, and year-round availability; the page also names Atlantic Cod and *Gadus morhua*. | This is a single seller’s offer, not Québec stock or a standardized preparation rule. `4,000g+`, the 25 kg minimum order, and nutrition data are product-specific context, not recipe measures. The URL is already ledger-owned by the Atlantic-cod parent under this source ID; reuse it, do not allocate another ID or duplicate the URL. |
| Proposal-local source `WP04-SECTIONP-ATLANTIC-COD-FRESH-WHOLE-R739-20261018-S01`, Seafood from Canada, [Cod, Atlantic](https://seafoodfromcanada.ca/seafood/cod-atlantic/), accessed 2026-10-18 | Identifies *Gadus morhua*, gives the image alt label “Whole, raw Atlantic Cod,” and lists fresh HOG and H&G forms. | Seafood-sector profile, not a specific retailer SKU. Its form list does not list unqualified fresh whole. The exact URL has no live ledger owner and no earlier archive occurrence found. The image phrase alone is not treated as a fresh retail form. |
| Proposal-local source `WP04-SECTIONP-ATLANTIC-COD-FRESH-WHOLE-R739-20261018-S02`, Seafood from Canada, [Morue, atlantique](https://seafoodfromcanada.ca/fr/seafood/morue-atlantique/), accessed 2026-10-18 | Identifies *Gadus morhua* and lists current fresh HOG/H&G forms, not a separate `entier` form. | Paired French sector profile; same species reference, not a second independent product. The URL is absent from the live ledger but was cited proposal-locally as `WP04-SECTIONP-COD-CHEEKS-20261013-R65-S03` in R65. That archived identifier is not a live ledger owner; keep the R739 source ID proposal-local and recheck exact URL ownership at integration. |
| Proposal-local source `WP04-SECTIONP-ATLANTIC-COD-FRESH-WHOLE-R739-20261018-S03`, Fisheries and Oceans Canada, [Canadian Fisheries Annual Statistical Review 1998–1999 (PDF)](https://waves-vagues.dfo-mpo.gc.ca/Library/358158.pdf), table 67, accessed 2026-10-18 | The 1998–1999 table lists `Cod, Atlantic, fresh, whole, dressed / Morue de l’Atlantique, fraîche, entière, habillée`. | Historical commercial/trade classification. It corroborates bilingual wording only; it does not establish current consumer inventory, cleaning standards, or a recipe measure. The exact URL has no live ledger owner and no earlier proposal/batch occurrence found. |
| Existing source `WP04-FINFISH-ID-20261009-S02`, OQLF, [morue de l’Atlantique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26573546/morue-de-latlantique) | Pairs the Québec French name with Atlantic cod and *Gadus morhua*. | Parent identity evidence only. Reuse the existing source ID; do not duplicate or reassign it. |

At review time the R739 source-ID prefix and proposed form ID were absent from the live ledger and prior R739 files. Integration allocated the form ID and one form-level ledger row, added the three distinct Seafood from Canada/DFO source URLs once, and reused the existing Salties and OQLF source IDs. The resulting ledger passed source ownership and schema/semantic validation.

## Integrated data

The following single form is active under the existing Atlantic-cod reference. Its labels are searchable; it has no aliases or additional match terms.

```json
{
  "id": "ingredient-form-atlantic-cod-fresh-whole",
  "ingredientRefId": "ingredient-ref-atlantic-cod",
  "formCode": "fresh_whole",
  "labelFr": "morue de l’Atlantique fraîche entière",
  "labelEn": "fresh whole Atlantic cod",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Présentation de morue de l’Atlantique fraîche vendue entière. Une fiche de fournisseur décrit un produit sans tête et éviscéré; cet état propre au produit n’est pas une règle générale pour toutes les morues entières. Aucune mesure, conversion, relation de rendement ou substitution n’est établie.",
  "notesEn": "Fresh Atlantic cod sold as a whole-fish presentation. One supplier listing describes its product as head-off and gutted; that product-specific state is not a general rule for all whole cod. No measure, conversion, yield relationship, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

The integrated form-level ledger record uses `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It links the existing R712 Salties source and OQLF parent source with the three new source records. No measurement observation or substitution finding was added. `4,000g+`, the minimum order, nutrition-per-100-g data, and historical export quantities remain outside recipe data.

## Picker projection

The projection mirrors phrase-first, accent-folded matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical form uses only its bilingual labels; it adds no broad whole-fish or generic cod terms.

| Query | Current results | With candidate form | Effect |
|---|---:|---:|---|
| `fresh whole Atlantic cod`; `whole Atlantic cod`; `morue de l’Atlantique fraîche entière` | 0 each | 1 each | Selects the existing Atlantic-cod parent with an exact form label. |
| `cod`; `morue` | 7 each | 7 each | Existing multi-identity results remain unchanged. |
| `Atlantic cod`; `morue de l’Atlantique` | 1 each | 1 each | The same parent remains the result. |
| `whole fish`; `poisson entier` | 1 each | 1 each | Existing whole-tilapia result only; no generic term is added. |
| `whole cod`; `morue entière` | 0 each | 0 each | The candidate does not introduce unqualified phrases. |
| `fresh`; `frais`; `fraîche` | 34; 28; 6 | 35; 28; 7 | English and feminine French freshness queries remain broad; masculine `frais` is unchanged. |
| `whole`; `entier`; `entière` | 44; 20; 10 | 45; 20; 11 | Broad whole-state searches remain multi-result; the French feminine form is preserved. |
| `fillet`; `filet` | 7; 2 | 7; 2 | Existing generic cut results remain unchanged. |

Thus the qualified form survives the picker projection: it is discoverable through the full English/French names without changing generic `whole fish`, bare `cod`/`morue`, or fillet searches.

## Recipe-corpus scan and quantitative scope

Scanned all **114 manifest-listed recipe JSON files**, **1,123 structured ingredient rows**, and **754,048 bytes** in manifest order. The manifest SHA-256 is `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; concatenated manifest-order recipe-content SHA-256 is `e87bd15cd3705924b176c6a70b55d99497a4830f9e65132917958717f54bc108`. A normalized full-file scan found zero hits for Atlantic cod, *Gadus morhua*, the proposed English/French form labels, and related full phrases; there are zero ingredient-row links to `ingredient-ref-atlantic-cod`. The bundle therefore provides no cod-specific recipe amount, method, or substitution demand.

The supplier’s 4,000 g+ size and 25 kg minimum order, nutrition panel’s per-100-g basis, and DFO’s historical export weights do not support a household measure, density, unit mapping, edible yield, or cooking yield. No source establishes a directed substitution. Add none and leave substitution research unreviewed.

## Static checks and test scope

- Rechecked the active Section P item, R734–R736 progress, current references/forms/legacy candidates, the Atlantic-cod ledger rows, prior cod cut reviews, and the exact source-ID/URL ownership described above.
- Parsed the active reference, form, ledger, manifest, and all manifest-listed recipe JSON files as UTF-8 JSON; reproduced current and hypothetical picker phrase counts using the live catalog terms and `IngredientSearch.kt` rules.
- Verified Markdown relative links, UTF-8 without BOM, absence of mojibake markers, a final newline, and whitespace after adding this file.
- No software tests, build, emulator, or deployment were run; this proposal changes no application code or shared JSON.

## Bounded recommendation

Add exactly one `fresh_whole` form under `ingredient-ref-atlantic-cod` using the bilingual labels above. The evidence supports one current Canadian supplier’s fresh whole *Gadus morhua* product, described as head-off and gutted; preserve that SKU-specific limit in notes. The French display uses the existing OQLF Québec identity plus historical bilingual trade wording, while the current profile pages show fresh HOG/H&G categories rather than a separate whole category. Do not imply current Québec stock, an intact-head product, a universal cleaning state, or a generic `whole cod` identity. Add no aliases, measurements, conversions, yields, recipe links, or substitutions. Keep the wider Section P finfish checklist open.
