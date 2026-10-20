# WP04 Section P R545 — Atlantic halibut steak form review

- **Review and source-access date:** 2026-10-17.
- **Packet:** Fish-cut form, picker-scope, ownership, recipe-demand, measurement, and substitution review.
- **Status:** Integrated on 2026-10-17. See the [R543–R545 integration README](../batches/wp02-wp03-wp04-r543-r545-gap-review-integration-20261017/README.md).
- **Candidate:** `Atlantic halibut steak / darne de flétan de l’Atlantique` under the existing `ingredient-ref-atlantic-halibut` identity.
- **Disposition:** **Recommend adding one cut form** with only those fully qualified bilingual labels. Metro Québec’s English and French pages use the same SKU and identify *Hippoglossus hippoglossus*; OQLF supports `darne` as the Québec fish-cut term and lists `darne de flétan / halibut steak`. Keep all unqualified cut synonyms out of form match terms. No recipe demand or reusable amount is supported.
- **Scope:** At proposal review, this proposed change had not yet been integrated into the shared catalog, ledger, plan, roadmap, recipe, or code. It is distinct from the R542 *Trichiurus lepturus* naming hold.

## Open boundary and prior-work check

The Section P parent in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) still includes halibut and broader fish-product coverage. R542 holds *Trichiurus lepturus* because its Canadian common names do not resolve to one taxon; this review concerns a cut under the already allocated Atlantic halibut identity. R536’s frozen Pangasius fillet form and R539’s frozen squid-tube form are separate product groups.

The existing Atlantic halibut reference already owns `Atlantic halibut / flétan de l’Atlantique`, with `flétan` as its French alias. No active form is attached to it. The prior fish identity review explicitly added no form. Exact searches of the current active forms, legacy identities, ledger record IDs, proposals, batches, and plan found no allocation or focused decision for SKU 235791, `Atlantic halibut steak`, or `darne de flétan de l’Atlantique`. The proposed form ID is unallocated. The earlier OQLF source for the parent identity remains owned by `WP04-FINFISH-ID-20261009-S04`; this proposal reuses it rather than duplicating that identity evidence.

## Product and Québec terminology evidence

Metro’s current English page names SKU **235791** `Atlantic Halibut Steak`; the paired French page names the same SKU `Darne de flétan d’Atlantique`. Both pages identify the fish as *Hippoglossus hippoglossus*, sourced from the Northwest Atlantic in Canada and wild-caught by longline. Metro places the listing in its fresh-fish section. The selected-store view was out of stock when checked. The English and French pages are two language views of one SKU, not independent product examples.

OQLF’s current `darne` entry defines a thick fish cut made raw across the fish and identifies `darne` as the preferred Québec term corresponding to English `fish steak`. Its `darne de flétan` entry pairs the French cut name with English `halibut steak`, but does not qualify an Atlantic species. Metro’s SKU supplies that missing species qualifier. Do not use `steak de poisson`, which OQLF discourages, or treat generic `darne de flétan` as an Atlantic-halibut alias.

Metro’s product pages were visible in current indexed content on 2026-10-17, but direct page opening through the research browser returned HTTP 403. The listing supports the product wording and SKU-specific identity; it does not prove present availability outside the selected-store view, a wider market roster, or a generally available cut. It does not specify a package mass, standard steak thickness, skin/bone condition, or count-to-weight relationship.

## Conditional catalog shape

If accepted, add only this form under the existing Atlantic halibut reference; do not create another ingredient identity or expand the parent aliases:

```json
{
  "id": "ingredient-form-atlantic-halibut-steak",
  "ingredientRefId": "ingredient-ref-atlantic-halibut",
  "formCode": "steak_cut",
  "labelEn": "Atlantic halibut steak",
  "labelFr": "darne de flétan de l’Atlantique",
  "matchTermsEn": [],
  "matchTermsFr": [],
  "densityGPerMl": null,
  "notesEn": "Species-qualified fish-cut form supported by Metro SKU 235791 and Québec terminology for darne. The retailer listing does not establish a reusable quantity, standard thickness, package mass, edible yield, or skin/bone condition. No conversion or substitution is established.",
  "notesFr": "Forme de coupe de poisson qualifiée par espèce, appuyée par le produit Metro 235791 et la terminologie québécoise de la darne. La fiche du détaillant n’établit aucune quantité réutilisable, épaisseur standard, masse d’emballage, rendement comestible ou présence de peau ou d’arêtes. Aucune conversion ni substitution n’est établie.",
  "updatedAt": "2026-10-17T00:00:00Z"
}
```

The form is cut-only. The retailer’s aisle placement is SKU evidence and is not promoted to a general freshness or preparation-state rule. No extra match terms are recommended: unqualified `halibut steak` and `darne de flétan` do not identify the Atlantic species by themselves.

## Ownership and picker projection

Read-only snapshot on 2026-10-17: **1,805 active references**, **146 forms**, **56 legacy candidates**, **2,164 ledger records / 9,957 source entries**, and **114 manifest recipes / 1,123 ingredient rows**. The four active halibut-related identities relevant to search are Atlantic, Greenland, Pacific, and smoked Greenland halibut. Exact bilingual product keys and the proposed form ID have no current form, reference, or legacy owner. The Metro URLs and the two OQLF cut URLs below have no existing ledger URL owner; this proposal leaves all source records proposal-local.

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which searches complete phrases in both reference and form terms, then falls back to substring matching. A form hint is returned only for a complete form label. Existing parent names and aliases are unchanged.

| Query | Current picker | With proposed form | Form hint with proposed form |
|---|---|---|---|
| `Atlantic halibut steak` | None | Atlantic halibut | Yes |
| `darne de flétan de l’Atlantique` | None | Atlantic halibut | Yes |
| `halibut steak` | None | Atlantic halibut | No; the form label is qualified with `Atlantic` |
| `darne de flétan` | None | Atlantic halibut | No; the form label is species-qualified |
| `darne` | None | Atlantic halibut only | No; this is a broad cut query |
| `flétan` / `halibut` | Atlantic, Greenland, Pacific, smoked Greenland halibut | Same four results | No |
| `steak` | Montreal steak spice; steak sauce | Those two plus Atlantic halibut | No |

The short `darne` query would newly return one species because only this species has a supported steak form in the active catalog. The result’s displayed identity remains explicitly Atlantic, and exact product queries are fully qualified. Keep the generic cut phrases out of aliases and form match terms so this single product does not claim to own all halibut steaks.

## Recipe demand, measurements, and substitutions

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for the parent identity, the product names, SKU number, scientific name, and generic `halibut steak` / `darne` phrases. No matching recipe file or ingredient row was found. No line can be linked to this cut, and no amount, form preference, role, or method is present.

The Metro product title and cart quantity do not supply a physical mass or household measure. OQLF’s cut definition supplies terminology and shape only. Do not create a default portion, density, unit mapping, conversion, package yield, edible yield, or cooking-yield claim. No reviewed source or recipe provides a directed substitution from this cut to Greenland or Pacific halibut, cod, sablefish, salmon, or another fish; add no global or contextual rule. Do not infer cooking, storage, curing, or raw-consumption equivalence from the shared cut name.

## Bounded recommendation

**Recommend adding only `ingredient-form-atlantic-halibut-steak`** beneath `ingredient-ref-atlantic-halibut`, with the exact labels `Atlantic halibut steak / darne de flétan de l’Atlantique`, no match terms, null active density, and no numeric or substitution behavior. Keep the parent aliases unchanged and preserve the existing multi-result `halibut / flétan` scope. The generic `darne` query will return the Atlantic row alone until other supported fish-cut forms are represented; the row and exact form label remain species-qualified. No recipe relink follows from the absent corpus demand.

## Sources and limits

Sources were accessed on **2026-10-17**. Source IDs below were proposal-local before root integration.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S01** | Office québécois de la langue française, [darne (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358741/darne) | Current entry, last updated 2025; defines `darne` as a thick fish cut made transversely while raw and prefers the term over `steak de poisson`. Terminology does not identify the Metro SKU or a species. |
| **WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S02** | Office québécois de la langue française, [darne de flétan (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298298/darne-de-fletan) | Gives `darne de flétan / halibut steak` and says a thick transverse cut of halibut is called a darne. The entry does not distinguish Atlantic, Pacific, or Greenland halibut. |
| **WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S03** | Metro, [Atlantic Halibut Steak, product 235791](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/atlantic-halibut-steak/p/235791) | Current indexed page names the same product number and identifies *H. hippoglossus*, Northwest Atlantic / Canada origin, and wild longline fishing. The selected-store view showed out of stock; direct page opening returned HTTP 403. One SKU only; no package mass, recipe portion, or general availability claim. |
| **WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S04** | Metro, [Darne de flétan d’Atlantique, product 235791](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-blancs/darne-de-fletan-d-atlantique/p/235791) | French route for the same Metro SKU; pairs the French product wording with the binomial, Northwest Atlantic / Canada origin, and wild longline method. The selected-store view showed out of stock; direct page opening returned HTTP 403. Not independent product evidence from S03. |
| **Reused `WP04-FINFISH-ID-20261009-S04`** | OQLF, [flétan de l’Atlantique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198639/fletan-de-latlantique) | Existing ledger-owned identity source pairs Atlantic halibut, `flétan de l’Atlantique`, and *Hippoglossus hippoglossus*. Reuse the existing source ID; the identity source alone does not establish this cut. |
| **R01 — repository audit** | Active references/forms, legacy identities, research ledger, Section P plan and proposal/batch archive, current picker code, and complete manifest recipe corpus | Snapshot read from the workspace on 2026-10-17, before integration. No shared catalog, ledger, plan, roadmap, recipe, application code, or tests were changed during proposal review. |

No software tests, build, emulator check, or deployment were run for this proposal-only documentation review.

## Integration

Integrated on 2026-10-17: added `ingredient-form-atlantic-halibut-steak` under the existing `ingredient-ref-atlantic-halibut`, with labels `Atlantic halibut steak / darne de flétan de l’Atlantique`, `formCode` and `prepState` `steak_cut`, empty match-term arrays, and null density. Added a form-ledger record with the OQLF terminology, Metro SKU, and reused Atlantic-halibut identity evidence. No generic cut match terms, active numeric behavior, recipe link, or substitution was added. See the [R543–R545 integration README](../batches/wp02-wp03-wp04-r543-r545-gap-review-integration-20261017/README.md).
