# WP04 Section P R568 — Pacific halibut steak form review

- **Review date:** 2026-10-17.
- **Plan anchor:** [WP04 Section P finfish item, lines 6352–6353](../../RecipeBook-global-ingredient-catalog-plan.txt#L6361). The broad parent remains open.
- **Scope:** One cut form under the existing `ingredient-ref-pacific-halibut`; no parent identity or alias change.
- **Status:** Integrated. See the [R568 integration README](../batches/wp04-r568-pacific-halibut-steak-integration-20261017/README.md). No recipe or code file was changed.
- **Disposition:** Added `Pacific halibut steak / darne de flétan du Pacifique` with no match terms, measurements, conversion, yield, recipe link, or substitution. The form fills a species-specific product gap and changes `halibut steak` and `darne de flétan` from Atlantic-halibut-only results to both currently represented halibut cut species. The French display is composed from established Québec cut terminology and DFO’s species name; no paired French route for either Metro SKU was verified.

## Prior-work and ownership check

The open finfish parent names halibut among the remaining Section P identities and product work. This review selects the discrete Pacific-halibut steak form, not a broader halibut or generic fish-steak project.

- R545 integrated `Atlantic halibut steak / darne de flétan de l’Atlantique` under `ingredient-ref-atlantic-halibut`. Its OQLF cut sources are reused below rather than registered again.
- R557 held swordfish steak because `fish steak` would become an unsafe singleton. R568 adds no `fish steak` synonym or match term; the exact query remains empty in the projection.
- R551’s Atlantic-halibut-cheek hold and R565’s Atlantic-cod centre-cut hold concern different species/cuts. Neither is reopened.
- R560’s paired cod loins are separate species and product SKUs.

Before integration, read-only ownership checks found no existing Pacific-halibut steak form, legacy candidate, focused earlier proposal/batch, form ledger record, or allocation of `ingredient-form-pacific-halibut-steak`. The new Metro sources `WP04-SECTIONP-PACIFIC-HALIBUT-STEAK-R568-20261017-S01` and `S02` are now on the Pacific steak-form record. Supermarché PA's species-unspecified listing remains proposal-local. Reuse the existing source IDs for parent identity and generic cut terminology instead of duplicating those URLs.

The pre-integration snapshot had **1,805 active references, 150 active forms, and 2,171 ledger records / 10,054 source entries**. The Pacific parent has no aliases, null default density, and empty unit mappings; its parent-level ledger research states remain `not_yet_researched`. The Atlantic parent retains its French alias `flétan` and R545 steak form; Greenland halibut remains a separate identity. The integrated form record changes none of the parent identities or aliases.

## Product and Québec terminology evidence

Product observations are separate SKU records. Do not merge their state, availability, count, or amount:

| Proposal-local source ID | Product evidence | Exact scope and limit |
|---|---|---|
| `WP04-SECTIONP-PACIFIC-HALIBUT-STEAK-R568-20261017-S01` | Metro, [Pacific Halibut Steak, product 235792](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/pacific-halibut-steak/p/235792). The indexed page title says `Pacific Halibut Steak`, shows `1 per tray`, product number **235792**, and identifies *Hippoglossus stenolepis*, Northeast Pacific / Canada, wild, longline. | One Metro product number. The route is under Metro’s `/fresh-fish/` aisle, but the title itself does not say `fresh`. Its selected-store view showed out of stock. The page gives no cut mass, package mass, standard thickness, skin/bone state, or amount-per-tray weight. The index was available during review; direct page opening returned HTTP 403. |
| `WP04-SECTIONP-PACIFIC-HALIBUT-STEAK-R568-20261017-S02` | Metro, [Fresh Pacific Halibut Steak, product 208135](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/fresh-pacific-halibut-steak/p/208135). The distinct title explicitly says `Fresh Pacific Halibut Steak`; the indexed page identifies *H. stenolepis*, Northeast Pacific / Canada, wild, bottom longline. | A separate Metro product number from 235792, not a second language route or amount for that SKU. Its selected-store view showed out of stock, and no package or cut weight was provided. The index was available during review; direct page opening returned HTTP 403. |
| `WP04-SECTIONP-PACIFIC-HALIBUT-STEAK-R568-20261017-S03` | Supermarché PA, [French fish-department listing](https://www.supermarchepa.com/collections/all/fish-department?page=3&view=fr), entry `Darne de fletan`, shown as approximately **350 g per unit** in the page snapshot. | Québec retail wording for an unqualified halibut-steak product; the page does not identify Atlantic, Pacific, or Greenland halibut. The approximate quantity belongs to that listing only, is not a Pacific-halibut weight or standard portion, and is excluded from active measures. It does not pair a French label to either Metro SKU. |

For the French display, reuse the already ledger-owned sources `WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S01` and `S02`. OQLF’s current `darne` entry defines the transverse raw fish cut and prefers `darne` to `steak de poisson`; its `darne de flétan` entry pairs the species-neutral term with English `halibut steak`. These entries do not distinguish halibut species. Reuse DFO identity sources `WP04-FINFISH-GAPS-20261010-S06` and `S07`, which pair *Hippoglossus stenolepis* with `Pacific halibut / flétan du Pacifique`. The proposed French form label joins those source-supported terms but is not a verbatim Metro French product title. A French Metro route for 235792 or 208135 was not located; do not invent one or claim the pages are paired.

Metro’s pages support product-name and taxon evidence for two distinct English listings, not current broad availability: both indexed store views were out of stock and their search-crawl dates predate this review. The Pacific species is independently and bilingually identified by DFO. These sources do not prove a universal market form, current stock, a particular cut thickness, skin or bone condition, or a French product label for either SKU.

## Integrated catalog delta

The integration adds only this cut form under the existing Pacific-halibut identity. Its name is fully species-qualified and both match-term arrays are empty:

```json
{
  "id": "ingredient-form-pacific-halibut-steak",
  "ingredientRefId": "ingredient-ref-pacific-halibut",
  "formCode": "steak_cut",
  "labelEn": "Pacific halibut steak",
  "labelFr": "darne de flétan du Pacifique",
  "prepState": "steak_cut",
  "matchTermsEn": [],
  "matchTermsFr": [],
  "densityGPerMl": null,
  "notesEn": "Species-qualified fish-cut form supported by Metro Pacific halibut steak listings and Québec terminology for darne. The French form label combines the established cut term with DFO’s species name; no paired French Metro SKU page was verified. The listings establish no reusable cut mass, standard thickness, package measure, edible yield, or skin/bone condition. No conversion or substitution is established.",
  "notesFr": "Forme de coupe de poisson qualifiée par espèce, appuyée par les fiches Metro de darnes de flétan du Pacifique et par la terminologie québécoise de la darne. Le libellé français combine le terme de coupe établi et le nom d’espèce du MPO; aucune fiche française Metro appariée à un même produit n’a été vérifiée. Les fiches n’établissent aucune masse réutilisable par darne, épaisseur standard, mesure d’emballage, rendement comestible ni présence de peau ou d’arêtes. Aucune conversion ni substitution n’est établie.",
  "updatedAt": "2026-10-17T00:00:00Z"
}
```

This is a cut-only `steak_cut` form. Do not encode `fresh` from SKU 235792’s aisle path, and do not infer freezing or freshness for the identity from the separate 208135 title. Keep Metro’s `1 per tray` count, Supermarché PA’s approximate 350 g, and all stock information proposal-local and SKU/listing-specific. The PA quantity does not apply to Pacific halibut.

## Picker projection

The source-code projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes terms, returns complete word-phrase matches first, then uses substring matching only if no complete phrase matched. Form labels participate in reference results; an exact complete form label can return a form hint. This is a static projection, not live picker QA.

| Query | Current results | With integrated form | Form hint after |
|---|---|---|---|
| `Pacific halibut steak` | None | Pacific halibut | Yes |
| `darne de flétan du Pacifique` | None | Pacific halibut | Yes |
| `halibut steak` | Atlantic halibut | Atlantic + Pacific halibut | No; query is shorter than either full label |
| `darne de flétan` | Atlantic halibut | Atlantic + Pacific halibut | No; query is shorter than either full label |
| `darne` | Atlantic halibut | Atlantic + Pacific halibut | No |
| `steak` | Atlantic halibut, Montreal steak spice, steak sauce | Those three plus Pacific halibut | No |
| `halibut` / `flétan` | Atlantic, Greenland, Pacific, and smoked Greenland halibut | Same four references | No |
| `fish steak` | None | None | No |

The proposed labels make the exact species-qualified query unique while preventing `halibut steak` and `darne de flétan` from resolving to the Atlantic species alone. The bare `darne` query would show the two halibut steak forms currently present; that projection is not a claim that the catalog exhaustively represents every fish sold as a darne. No generic term is added to `matchTerms`, and no alias is added to the Pacific parent. In particular, R557’s `fish steak` boundary remains unchanged.

## Bundled demand, measurements, and substitutions

The read-only scan followed all **114 recipe paths in `manifest.v1.json`**, totaling **1,123 structured ingredient rows**. No file or ingredient-row text matched `halibut`, `flétan`, `darne`, or `Pacific halibut`. Corpus fingerprint: `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`. No recipe link or imported line requests this form.

The Metro 235792 `1 per tray` is a count for that SKU only; neither Metro record provides a gram amount. Supermarché PA’s approximate 350 g per unit refers to its species-unspecified listing and is not reusable for either Metro product or a general halibut steak. No kitchen volume, mass-per-cut conversion, density, package yield, cooking yield, or edible yield is established. DFO’s species-size description is biological context, not a culinary measure.

No bundled recipe or source supports substituting Pacific-halibut steak for Atlantic or Greenland halibut, another fish steak, a fillet, or a cod cut in any recipe role or method. Add no same-ingredient form conversion, contextual substitution, warning, or recipe-line substitution. If a form ledger row is created during integration, scope its measurement finding to `researched_no_supported_value` and substitution finding to `researched_no_supported_substitute`; leave the Pacific parent’s broader research states unchanged.

## Bounded integration recommendation

The integration adds `ingredient-form-pacific-halibut-steak` beneath `ingredient-ref-pacific-halibut`, using the species-qualified English and composed Québec French labels above, `steak_cut` for form/preparation code, empty match-term arrays, and null density. Its form ledger record uses the two Metro SKU sources plus reused OQLF cut IDs and DFO identity IDs. Keep S03 proposal-local as Québec wording and measurement-boundary context: it does not identify Pacific halibut and is not attached to the Pacific form record. Add no alias, amount, measure, mapping, density, conversion, yield, recipe link, or active substitution. Keep the broad WP04 Section P finfish parent open.

No app tests, build, emulator run, or deployment were run for this database-JSON-only addition under `AGENTS.md`.

## Sources and audit limits

External sources were reviewed on 2026-10-17. R568 Metro S01 and S02 are now owned by the Pacific steak-form ledger record; R568 S03 remains proposal-local. The R545 OQLF and earlier DFO IDs are reused from their existing owners.

| Source ID | Source | Evidence and limit |
|---|---|---|
| `WP04-SECTIONP-PACIFIC-HALIBUT-STEAK-R568-20261017-S01` | Metro, [Pacific Halibut Steak, product 235792](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/pacific-halibut-steak/p/235792). | English name, one-per-tray count, product number, *H. stenolepis*, Northeast Pacific / Canada, wild longline. Route is under the fresh-fish aisle but title does not say fresh. Indexed page showed out of stock; one SKU only; direct opening returned HTTP 403. |
| `WP04-SECTIONP-PACIFIC-HALIBUT-STEAK-R568-20261017-S02` | Metro, [Fresh Pacific Halibut Steak, product 208135](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/fresh-pacific-halibut-steak/p/208135). | Separate English SKU with explicit `Fresh` in title and the same binomial/origin; selected-store page showed out of stock. No quantity or package specification. Not paired to S01. |
| `WP04-SECTIONP-PACIFIC-HALIBUT-STEAK-R568-20261017-S03` | Supermarché PA, [French fish-department listing](https://www.supermarchepa.com/collections/all/fish-department?page=3&view=fr), `Darne de fletan`. | Québec French retail phrase and listing-specific approximately 350 g per unit. No species, SKU, Atlantic/Pacific qualifier, or connection to Metro products. Do not reuse the amount. |
| Reuse `WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S01` and `S02` | OQLF, [darne (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358741/darne) and [darne de flétan (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298298/darne-de-fletan). | Already owned by the R545 Atlantic-halibut steak form record. Supports generic Québec cut terminology; neither entry qualifies the Pacific species. `darne` was last updated 2025; the halibut entry dates to 1984. |
| Reuse `WP04-FINFISH-GAPS-20261010-S06` and `S07` | Fisheries and Oceans Canada, [Pacific Halibut](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-halibut-fletan-pac-eng.html) / [Flétan du Pacifique](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/pac-halibut-fletan-pac-fra.html). | Existing Pacific-halibut identity sources, pairing *Hippoglossus stenolepis* with both language names. They identify the fish, not the steak product or the composed French cut label. |
| R01 — repository audit, not a ledger source | Active references/forms, legacy candidates, research ledger and source URLs, relevant Section P plan/proposal/batch files, `IngredientSearch.kt`, and all manifest recipe files. | Proposal-time workspace snapshot on 2026-10-17. Confirms pre-integration ownership, the picker projection, and 114-file/1,123-row recipe scan. It is not external product or terminology evidence. |
