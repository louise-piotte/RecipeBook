# WP04 Section P — water-packed canned tuna form review (R790)

- **Review and source-access date:** 2026-10-19.
- **Open checklist gap:** [Section P preservation checklist, line 8373](../../RecipeBook-global-ingredient-catalog-plan.txt#L8391): “Smoked, salt-cured, dried, canned, oil-packed, water-packed, and fermented fish/seafood forms.” This proposal advances only the water-packed canned-tuna form slice; the checklist is not edited here.
- **Recommendation:** Integrate one water-packed form under the existing `ingredient-ref-canned-tuna`. Keep the product’s species, colour class, cut/presentation, salt, can size, and drained state source-specific.
- **Scope:** The existing commercial canned-tuna group, `canned tuna / thon en conserve`, from R168. This is a form-qualified picker choice, not a tuna species or a new identity.
- **Status:** Integrated on 2026-10-19. Root added the proposed canned-tuna water form and form-level ledger record; see the [R788–R790 integration README](../batches/wp02-wp03-wp04-r788-r790-gap-review-integration-20261019/README.md).
- **Proposal-local IDs:** New source IDs `WP04-SECTIONP-CANNED-TUNA-WATER-FORM-R790-20261019-S01` through `-S06`; observation IDs shown below; audit ID `WP04-SECTIONP-CANNED-TUNA-WATER-FORM-R790-20261019-R01`. These remain unallocated pending integration.

## Why this is a distinct open form

R168 added `ingredient-ref-canned-tuna` as the product-group identity `canned tuna / thon en conserve`, with empty aliases and no forms. That was deliberately separate from raw or unspecified `tuna / thon` and the tuna species rows. R168 recorded product medium, cut, and species as product-specific and did not add a water-packed form. The current Section P preservation line remains open for packing-medium forms, so this review evaluates just the source-backed “in water” slice without changing R168’s parent identity or broadening its aliases. See the [R168 proposal](wp04-section-p-canned-tuna-product-boundary-review-r168-20261016.md) and [R168 integration README](../batches/wp02-wp03-wp04-r168-gap-review-integration-20261016/README.md).

The live review snapshot has **1,873 ingredient references, 195 forms, and 2,277 research-ledger records**. `ingredient-ref-canned-tuna` is active as `canned tuna / thon en conserve`, category `PROTEIN`, with no aliases, null density, empty unit mappings, and no attached forms. Its ledger row is `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`; it has no measurement observations or substitution findings. The proposed form ID and bilingual phrase pair are absent from active references, forms, legacy candidates, and ledger record IDs.

## Product and species boundary

The FAO/WHO Codex Standard for Canned Tuna and Bonito (CXS 70-1981) defines a canned product made from several listed tuna and bonito species, distinguishes presentations such as solid, chunks, and flakes, and states that the packing medium forms part of the food name. This supports treating the packing-medium wording as a meaningful product qualifier. Codex does not establish a RecipeBook label, Canadian legal status, or a common species, cut, recipe measure, or formulation for all water-packed tuna. The recommendation below is limited to tuna products explicitly marketed as “in water”; it does not add canned bonito or reinterpret the raw tuna identities. [S01]

Québec-facing Metro lists product `059749935012` in paired English and French routes as “Solid Light Tuna in Water” / “Thon pâle entier dans l'eau,” 142 g, with skipjack tuna and water in the ingredient list. This is one SKU and supports only its own species, colour/presentation wording, ingredients, and package amount. Clover Leaf’s current manufacturer pages separately identify albacore chunk, skipjack flakes, and yellowfin chunk products in water. The pages show that the named medium occurs with multiple taxa and presentations; they do not establish a shared product formula or weight. The manufacturer’s current English and French family catalogs, already owned by the R168 parent record, also list distinct water and broth/oil products and a pouch. Those R168 source IDs and owners remain unchanged and are reused only as family context. [S02–S06; reused R168 S01–S02]

Use only `canned tuna in water / thon en conserve dans l’eau` as the bilingual form label. The French display is a transparent descriptive phrase formed from the active parent wording and the retailer’s `dans l'eau` qualifier; it is not presented as an OQLF-standardized product term. Add no aliases or form match terms. Keep species names, `white`/`light`, solid/chunk/flaked presentation, broth/oil packing, pouch products, reduced-sodium/seasoned variants, and “no-drain” claims out of this generic form. “In water” does not say whether a recipe should drain the can. Some reviewed ingredient lists also name salt; do not imply a universal formulation or salt level.

Keep this form separate from fresh/frozen tuna and tuna steaks, canned tuna in oil or broth, canned bonito, canned sardines/salmon/mackerel, tuna salad or ready meals, and species-specific tuna rows. Do not add `canned`, `in water`, bare `tuna`, bare `thon`, or product-specific species/cut terms to the parent aliases.

## Exact-key, active-data, and source-ownership audit

The active-catalog check followed the phrase-first and partial-match behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It compared active bilingual names/aliases, form labels/match terms, form IDs, legacy candidates, and ledger record IDs. The exact water-packed form ID and proposed bilingual labels have no current active owner. The historical R168 proposal mentions `canned tuna in water` while documenting that it did not add a form; that archive mention is not an active key.

| Key or owner | Live result | Disposition |
|---|---|---|
| `ingredient-ref-canned-tuna` | Active `canned tuna / thon en conserve`; `PROTEIN`; no aliases or forms; null density and no mappings. | Keep as the sole canned-tuna product-group identity. |
| `ingredient-ref-tuna` and species-specific tuna references | Separate raw/unspecified and species identities. Broad `tuna` / `thon` searches currently return nine results each. | Leave names, aliases, recipe links, and species boundaries unchanged. |
| `ingredient-form-canned-tuna-in-water`; `canned tuna in water`; `thon en conserve dans l’eau` | No exact active form or phrase owner. | Proposed once as a form under the canned-tuna parent; no alias is added. |
| R790 source IDs and S01–S06 exact URLs | No exact source-ID or URL owner was found in the active ledger or catalog proposal/batch archive. | Keep proposal-local until root integration. |
| R168 Clover Leaf family sources `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S01` and `-S02` | Existing English/French catalog sources owned by `ingredient-ref-canned-tuna`. | Reuse as context only; do not duplicate their URLs or move their owner. |
| R790 proposal path and proposed observation IDs | No prior path or ID owner found. | Unique proposal and observation IDs. |

## Proposed picker projection

The projection adds only the proposed form label pair, with empty `matchTermsFr` and `matchTermsEn`. A full form-label match returns the existing parent and allows the picker to attach the water-packed form hint. Partial phrases can find the parent without asserting that the user selected that form.

| Query | Current | With proposed form | Effect |
|---|---:|---:|---|
| `canned tuna in water` | 0 | 1: `ingredient-ref-canned-tuna` | Exact form phrase; selects the water-packed form hint. |
| `thon en conserve dans l’eau` | 0 | 1: `ingredient-ref-canned-tuna` | Exact descriptive French form phrase; selects the form hint. |
| `tuna in water` | 0 | 1: `ingredient-ref-canned-tuna` | Finds the parent through the contained phrase; no form hint because this is not a full label or match term. |
| `canned tuna`; `thon en conserve` | 1 each | 1 each | Existing parent-name searches stay unchanged and do not select a form. |
| `tuna`; `thon` | 9 each | 9 each | Broad fish searches stay multi-result; no species or identity is added. |
| `water`; `eau` | 13; 16 | 14; 17 | The canned-tuna parent joins each broad water query; neither becomes a single result. |
| `en conserve` | 18 | 18 | The parent already matches this phrase; result count stays unchanged. |
| `canned` | 1 (`ingredient-ref-chickpeas`) | 1 (`ingredient-ref-chickpeas`) | Existing exact-form search priority stays unchanged; no generic one-word match term is added. |

## Measurement and substitution evidence

Codex and retailer listings establish a product/form boundary, not a culinary conversion. Metro’s `142 g` value is a package fact for item `059749935012`. Clover Leaf labels each of three different products with a serving of `1/2 can drained (55 g)`: albacore chunk, skipjack flakes, and yellowfin chunk. Record those only as three source-scoped manufacturer-label observations if integrating the new form ledger row. The identical displayed portions are not independent evidence for a standard can size or universal half-can amount; the pages do not state a common net can size. Do not create a can-to-mass mapping, drained yield, cup measure, density, or reusable portion.

| Proposed observation ID | Named product and source statement | Record only as |
|---|---|---|
| `canned-tuna-water-form-cloverleaf-albacore-chunk-half-can-drained-r790-20261019` | Chunk White Tuna, Albacore in Water; `1/2 can drained (55 g)`. | Product-specific manufacturer-label `portion_weight`; source quantity 0.5 can, observed mass 55 g. |
| `canned-tuna-water-form-cloverleaf-skipjack-flaked-half-can-drained-r790-20261019` | Flaked Light Tuna, Skipjack in Water; `1/2 can drained (55 g)`. | Product-specific manufacturer-label `portion_weight`; source quantity 0.5 can, observed mass 55 g. |
| `canned-tuna-water-form-cloverleaf-yellowfin-chunk-half-can-drained-r790-20261019` | Chunk Light Tuna, Yellowfin in Water; `1/2 can drained (55 g)`. | Product-specific manufacturer-label `portion_weight`; source quantity 0.5 can, observed mass 55 g. |

The product pages do not establish that drained tuna from these products is equivalent by mass, volume, cut, moisture, salt, or recipe function. No reviewed source supports replacing water-packed tuna with tuna in oil/broth, another species or cut, raw tuna, or another seafood in a general or dish-specific ratio. Add no substitution findings or rules. If accepted, the new form-level ledger record should use `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`; list the three observations above with their individual S04–S06 source IDs, and no density or unit mapping. Keep the parent ledger row unchanged.

## Bundled recipe demand

The manifest snapshot contains **114 recipe files and 1,123 structured ingredient rows**. I scanned all manifest-listed recipe JSON strings and ingredient rows for the water-packed bilingual phrases and the canned-tuna reference. There are **no water-packed canned-tuna mentions and no canned-tuna rows**. The only tuna ingredient row is recipe [111, `Sous-vide tuna`](../../../app/src/main/assets/seed/bundled-library/recipes/111-thon-sous-vide-sous-vide-tuna-b699f193-4545-4e7a-98ad-ce092a1e38e4.v1.json), row 1: `1 tuna steak`, linked to `ingredient-ref-tuna` as `1 count`. It is not canned and remains unchanged. The manifest-ordered corpus digest is `6c6d3b839606d81440c2b3cbfda0d2f14fd8a4c33dac836a7ec1b91a1316f362`.

The bundled corpus therefore gives no recipe-line demand, amount, method, or substitution context for this form. Do not add a recipe link or recipe-specific behavior.

## Integrated active-data delta

Root added exactly one form under `ingredient-ref-canned-tuna`:

```json
{
  "id": "ingredient-form-canned-tuna-in-water",
  "ingredientRefId": "ingredient-ref-canned-tuna",
  "formCode": "canned_in_water",
  "labelFr": "thon en conserve dans l’eau",
  "labelEn": "canned tuna in water",
  "prepState": "canned_in_water",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Forme de thon en conserve explicitement commercialisé dans l’eau. Les sources couvrent des espèces et présentations précises; elles n’établissent pas une espèce, une couleur, une coupe, une formule, un format de boîte ou un état égoutté communs. Certaines listes d’ingrédients indiquent aussi du sel. Aucune mesure générique, densité, conversion, relation de rendement ou substitution n’est établie.",
  "notesEn": "Canned-tuna form explicitly marketed in water. Sources cover named species and presentations only; they do not establish a shared species, colour class, cut, formula, can size, or drained state. Some ingredient lists also name salt. No generic measure, density, conversion, yield relationship, or substitution is established.",
  "updatedAt": "2026-10-19T00:00:00Z"
}
```

Root added one corresponding form-level ledger record with the state values above, sources S01–S06, the three source-specific observations, and no substitution findings. The parent reference and ledger row remain unchanged. No alias, form match term, measurement mapping, package yield, form conversion, substitution rule, recipe link, recipe edit, or new identity was added. Cited SKU facts remain outside the active form labels and notes except for the explicitly bounded evidence rationale.

## Source register

The following pages were checked on **2026-10-19**. New source IDs and URLs remain proposal-local. Metro’s live product results returned current bilingual details for the same item number; direct page opening through the browser tool returned 403, so this is recorded as a limitation rather than a general availability claim. Clover Leaf pages opened directly during this review.

| Source ID | Primary source and locator | Evidence used and limits |
|---|---|---|
| **WP04-SECTIONP-CANNED-TUNA-WATER-FORM-R790-20261019-S01** | FAO/WHO Codex Alimentarius, [Standard for Canned Tuna and Bonito, CXS 70-1981](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B70-1981%252FCXS_070e.pdf), §§2 and 6.1. | Defines canned tuna/bonito across multiple listed taxa, distinguishes presentations, and identifies packing medium as part of the food name. International standard; not Canadian law, product-specific proof, or measurement evidence. |
| **WP04-SECTIONP-CANNED-TUNA-WATER-FORM-R790-20261019-S02** | Metro, [Solid Light Tuna in Water](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/fish-seafood/solid-light-tuna-in-water/p/059749935012), item `059749935012`. | Current result identifies the 142 g product, skipjack and water ingredients, and English item title. Same SKU as S03, not independent corroboration or a general size/portion. |
| **WP04-SECTIONP-CANNED-TUNA-WATER-FORM-R790-20261019-S03** | Metro Québec, [Thon pâle entier dans l'eau](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-pale-entier-dans-l-eau/p/059749935012), item `059749935012`. | French route for the same Metro SKU as S02; supports the Québec product qualifier `dans l'eau` and its own listing, not an independent product or generic serving. |
| **WP04-SECTIONP-CANNED-TUNA-WATER-FORM-R790-20261019-S04** | Clover Leaf, [Chunk White Tuna, Albacore in Water](https://www.cloverleaf.ca/en/products/chunk-white-tuna-albacore-in-water/), nutrition and ingredients sections. | Current maker page names *Thunnus alalunga*, water and sea salt, and its own `1/2 can drained (55 g)` nutrition serving. The species, chunk presentation, ingredients, and serving are product-specific. |
| **WP04-SECTIONP-CANNED-TUNA-WATER-FORM-R790-20261019-S05** | Clover Leaf, [Flaked Light Tuna, Skipjack in Water](https://www.cloverleaf.ca/en/products/flaked-light-tuna-skipjack-in-water/), nutrition and ingredients sections. | Current maker page names *Katsuwonus pelamis*, water and sea salt, and its own `1/2 can drained (55 g)` nutrition serving. The species, flakes, ingredients, and serving are product-specific. |
| **WP04-SECTIONP-CANNED-TUNA-WATER-FORM-R790-20261019-S06** | Clover Leaf, [Chunk Light Tuna, Yellowfin in Water](https://www.cloverleaf.ca/en/products/chunk-light-tuna-yellowfin-in-water/), nutrition and ingredients sections. | Current maker page names *Thunnus albacares*, water and sea salt, and its own `1/2 can drained (55 g)` nutrition serving. The species, chunk presentation, ingredients, and serving are product-specific. |
| **Reused `WP04-SECTIONP-CANNED-TUNA-R168-20261016-S01` and `-S02`** | Clover Leaf, [Tuna product catalog (English)](https://www.cloverleaf.ca/en/product/tuna/) and [Thon product catalog (French)](https://www.cloverleaf.ca/fr/produit/thon/), current family listings. | Existing R168 parent-owned source IDs. Rechecked only as family context for multiple water, broth/oil, cut, species, and pouch products; do not duplicate their URLs or move their existing owner. |
| **WP04-SECTIONP-CANNED-TUNA-WATER-FORM-R790-20261019-R01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L8391), R168 proposal/integration record, active references/forms, [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), every manifest-listed recipe file, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Proposal-local audit only. Supports active ID/name and source ownership checks, picker projection, product/form boundaries, and recipe-corpus review; it is not a ledger source entry. |

## Final disposition

**Integrated `ingredient-form-canned-tuna-in-water` under `ingredient-ref-canned-tuna`**, with the bilingual labels and empty match terms shown above. Species, colour, presentation, salt, package amount, and drained status stay at their individual source boundary. The three Clover Leaf nutrition portions are separate source-scoped observations only; no reusable measure or substitution was added. The generic canned-tuna identity, its names and aliases, the raw/species tuna rows, and recipe 111 remain unchanged. The wider Section P preservation checklist remains open.
