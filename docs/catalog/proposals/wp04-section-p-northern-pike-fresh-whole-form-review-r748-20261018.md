# WP04 Section P R748 — fresh whole Northern pike form review

- **Review date:** 2026-10-18.
- **Status:** Integrated on 2026-10-18. Added the qualified fresh-whole presentation under the existing Northern-pike reference and one supporting form-level ledger record.
- **Checklist fit:** The Section P finfish and regional-fish parent remains open at the [active plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L6869). The earlier freshwater-finfish work completed Northern pike as an identity-only *Esox lucius* reference and explicitly added no form. This review considers one supplier-supported presentation under that existing identity.
- **Candidate:** One `fresh_whole` form under `ingredient-ref-northern-pike`.
- **Recommendation:** Add the qualified bilingual form **fresh whole northern pike / grand brochet frais entier**. The Fish Shop’s current “Local Fresh Fish” page places Northern Pike in its “Whole Fish and Fillets” current-market-pricing list. That page context supports the fresh-plus-whole category for this supplier. It does not establish a particular SKU, current stock, Québec availability, a binomial on the supplier listing, or a cleaning/head state.

## Pre-integration catalog state and allocation

The active reference is `ingredient-ref-northern-pike`, displayed as `northern pike / grand brochet`, category `PROTEIN`, with no aliases, density, or unit mappings. Its identity ledger row is verified and owned by existing sources `WP04-FRESHWATER-FINFISH-20261010-S03` and `WP04-FRESHWATER-FINFISH-20261010-S04`. The reference has **no attached forms**. There is no existing form, ledger form record, legacy-import candidate, or earlier dedicated Northern-pike form review for the proposed `ingredient-form-northern-pike-fresh-whole`.

At proposal time, the snapshot had **1,848 references, 178 forms, and 2,235 ledger records** with **10,493 source entries, 8,857 distinct source IDs, and 7,504 distinct URLs**. The form ID, R748 source ID, and The Fish Shop URL were unallocated before integration; the form and source are now recorded in the bundled catalog and ledger.

## Evidence and source ownership

| Source / owner | What it supports | Limits and R748 use |
|---|---|---|
| **Integrated source ID** `WP04-SECTIONP-NORTHERN-PIKE-FRESH-WHOLE-R748-20261018-S01` — The Fish Shop, [Local Fresh Fish](https://www.thefishshop.ca/the-fish-shop/local-fresh-fish/), accessed 2026-10-18. It was unallocated before this integration. | The page is headed “Local Fresh Fish.” It asks customers to contact the shop for current market pricing on “Whole Fish and Fillets” and lists “Northern Pike” in that product list. In the same page context, the source explicitly associates Northern Pike with fresh local fish and a whole-fish option. | This is one Ontario supplier’s category listing, not a dated inventory feed or product SKU. The page also says its fish is available “dressed or in fillets,” but does not say whether the whole-pike option is dressed, gutted, scaled, or head-on. It does not print a binomial, French product title, package amount, or Québec availability. Do not infer any of those attributes. |
| Existing parent source `WP04-FRESHWATER-FINFISH-20261010-S03` — OQLF GDT, [grand brochet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8872759/grand-brochet), owned by `ingredient-ref-northern-pike`. | The Québec preferred term, English `northern pike`, Latin taxon *Esox lucius*, and food-fish domain. Reuse this existing source ID and URL for the identity boundary. | Terminology and identity evidence; it does not establish the supplier’s product form or current supply. Do not duplicate its source object. |
| Existing parent source `WP04-FRESHWATER-FINFISH-20261010-S04` — Gouvernement du Québec, [Grand brochet](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/grand-brochet), owned by `ingredient-ref-northern-pike`. | Bilingual species identity, *Esox lucius*, and distinction from neighboring fish. Reuse only as identity context. | Biological species profile, not product-form or availability evidence. Do not duplicate its source object. |
| Considered, not used to prove the intersection: SeaCore Seafood, [Pike](https://www.seacoreseafood.com/product/Pike), accessed 2026-10-18. No exact URL owner was found. | Names Pike as *Esox lucius* and separately lists “Available as whole or fillet” and “Fresh and Frozen.” | The source lists form and temperature as separate characteristics. It does **not** expressly pair fresh with whole, so R748 does not rely on it to establish a `fresh_whole` form and proposes no R748 source ID for it. |

The current CFIA Fish List search also returned *Esox lucius* with `Northern Pike / Brochet du Nord` and `Pike / Grand Brochet`; its result endpoint is shared across many ledger owners. R748 uses the already-owned OQLF and Québec government identity evidence rather than adding another record against that shared dynamic URL. Fisheries and Oceans Canada’s [Northern Pike profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/northernpike-grandbrochet-eng.html) was checked as a current taxon cross-check; it names *Esox lucius* and describes the species as a commercial freshwater fish, but supplies no form evidence used here. No exact DFO URL owner was found in the live ledger or archive, so R748 assigns it no new source ID.

The French form label is compositional: it keeps the accepted Québec identity `grand brochet` and adds grammatically agreeing `frais` and `entier`. It is not represented as wording printed by The Fish Shop.

## Integrated delta

The integration added only this form to the existing Northern-pike reference and created one form-level research record owned by the form ID. It reuses the parent identity sources above and adds the single supplier source S01. No aliases or match terms were added.

```json
{
  "id": "ingredient-form-northern-pike-fresh-whole",
  "ingredientRefId": "ingredient-ref-northern-pike",
  "formCode": "fresh_whole",
  "labelFr": "grand brochet frais entier",
  "labelEn": "fresh whole northern pike",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Présentation de grand brochet frais offerte dans la catégorie de poissons entiers d’un fournisseur ontarien. La page indique aussi une présentation parée ou en filets, mais ne précise pas l’état de préparation du poisson entier. Aucune mesure, densité, conversion, relation de rendement ou substitution n’est établie.",
  "notesEn": "Fresh whole-pike presentation listed by an Ontario supplier. The page also says fish is available dressed or in fillets but does not specify the preparation state of its whole-pike option. No measure, density, conversion, yield relationship, or substitution is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

Do not add a cleaned, dressed, head-on, head-off, gutted, scaled, skin-on, frozen, live, or frozen-thawed state. The evidence does not establish those attributes for the listed whole option. Add no amount, household measure, density, unit mapping, package yield, edible yield, cooking yield, recipe-line link, form conversion, or substitution. Commercial fish status, similar white-fish descriptions, and shared habitat do not establish a recipe substitution.

## Picker projection

The projection follows the current [phrase-first, substring-fallback picker](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including accent folding and form hints only when the query exactly matches a complete form label. Adding only the proposed labels produces these results:

| Query | Pre-integration results | With form | Effect |
|---|---:|---:|---|
| `fresh whole northern pike` | 0 | 1 | Exact English label selects Northern pike and supplies the fresh-whole form hint. |
| `grand brochet frais entier` | 0 | 1 | Exact French label selects the same parent and supplies the form hint. |
| `northern pike`; `grand brochet` | 1; 1 | 1; 1 | Existing identity queries are unchanged. |
| `pike` | 2 | 2 | Northern pike and pike-perch remain the two choices. |
| `brochet` | 1 | 1 | Existing Northern-pike result is unchanged. |
| `whole northern pike` | 0 | 1 | Phrase matching finds the parent; the shorter phrase does not get an exact full-label form hint. |
| `whole pike`; `pike whole` | 0; 0 | 0; 0 | No aliases or alternate word-order terms are added. |
| `fresh whole`; `frais entier` | 5; 3 | 6; 4 | Both broad queries gain Northern pike and remain multi-result. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Generic whole-fish queries still return only Whole tilapia. |
| `whole`; `entier`; `fresh`; `frais` | 46; 20; 36; 28 | 47; 21; 37; 29 | Broad state queries gain one result apiece and remain multi-result. |

No bare `pike`, `brochet`, `whole fish`, or generic French whole-fish alias is introduced. The full bilingual form survives picker projection without taking ownership of the ambiguous pike query.

## Recipe corpus and numeric evidence

Scanned all **114 manifest-listed recipe files** and their **1,123 structured ingredient rows**, checking full JSON text and ingredient-row names, original text, reference IDs, and form IDs. The candidate-specific phrases `northern pike`, `grand brochet`, *Esox lucius*, both proposed labels, `whole pike`, and `pike whole` produced **zero matching recipe files and zero ingredient rows**. No recipe quantity, method, role, form, or line link supports an amount, yield, measure, conversion, or substitution.

## Static review and scope

- Re-read the current `AGENTS.md`, the open Section P plan item, the current roadmap entry, and the latest R737–R745 workflow / integration checkpoints. The R740–R742 checkpoint integrated Pacific cod; R743–R745 leaves Section P open and contains no Northern-pike form review.
- Inspected current Northern-pike references, forms, parent ledger row, source ownership, legacy candidates, proposal/batch archive, and the current form/picker implementation. Verified the form and source IDs were unallocated before integration.
- Verified the fresh-plus-whole evidence from The Fish Shop’s page context; treated SeaCore’s separate whole/fillet and fresh/frozen lists as insufficient by themselves to prove that combination.
- Completed the 114-file / 1,123-row corpus scan and picker projection above. Confirmed every local relative link resolves, the saved Markdown is UTF-8 without BOM, and the new-file whitespace check is clean.
- No software tests, build, emulator, or deployment were run. The accepted change adds database JSON data only; application code did not change.

This review covers one fresh-whole product presentation under the existing Northern-pike identity. The wider Section P finfish and regional-fish checklist remains open. See the [R746–R748 integration README](../batches/wp02-wp03-wp04-r746-r748-gap-review-integration-20261018/README.md).
