# WP03 Section L generic tomato-preparation review — tomato pulp — R865

**Status:** Accepted and integrated as `ingredient-ref-tomato-pulp`; see the [R864–R866 integration README](../batches/wp02-wp03-wp04-r864-r866-generic-identity-integration-20261019/README.md).

**Reviewed:** 2026-10-19
**Plan anchors:** [Section L fruiting vegetables, gourds, peppers, and tomatoes](../../RecipeBook-global-ingredient-catalog-plan.txt#L6611), especially the [open tomato-preparation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6613) and the [Section L follow-up](../../RecipeBook-global-ingredient-catalog-plan.txt#L13595) that resolved tomato purée while keeping pulp separate.

## Recommendation

Add one identity-only generic processed-tomato reference for **tomato pulp / pulpe de tomates**. Canadian standards and the OQLF distinguish this named product class from tomato purée, paste, and canned tomato cuts. It is a generic ingredient identity, not a brand, product line, flavor, or retailer-only product.

Tomato purée and passata already have active reference rows (`ingredient-ref-tomato-puree` and `ingredient-ref-passata`), so this proposal does not reopen or duplicate either identity. The tomato-purée review explicitly kept pulp separate; that distinct identity is still absent from active data.

## Why this is an open gap

The current package has 1,895 ingredient references and 201 forms. Reference, alias, form, ledger, legacy-candidate, and generated Kotlin catalog searches found no `ingredient-ref-tomato-pulp` owner or active `tomato pulp` / `pulpe de tomates` search term. The ledger does not have a tomato-pulp record. The 56-row legacy archive has only the unrelated diced-tomatoes candidate, which is already represented by the canned-diced form.

The open Section L parent asks for tomato-preparation coverage. Its historical wording says purée and passata decisions are pending, but those have since been integrated; the parent checklist remains open for other gaps. R130 also says to keep pulp separate from purée, passata, paste, sauce, and canned cuts. The latest recorded Section L work is R675's whole dried Ancho form; earlier tomato updates added the [fresh form (R667)](wp03-section-l-tomato-product-form-review-r667-20261018.md), [sun-dried form (R648)](wp03-section-l-sun-dried-tomato-form-review-r648-20261018.md), and [oil-packed form (R651)](wp03-section-l-oil-packed-tomato-form-review-r651-20261018.md). Recent generic WP03 work includes R862 common purslane, while Section L remains open. See the [R130 purée review](wp03-section-l-tomato-puree-identity-review-20261015-r130.md), [R675 Ancho review](wp03-section-l-next-produce-pepper-review-r675-20261018.md), [R862 generic produce review](wp03-generic-produce-herb-diversity-review-r862-20261019.md), and [current workflow progress](../ingredient-catalog-workflow.md#L3335).

The Canadian standards establish a specific tomato-pulp product class, while the OQLF gives an exact Québec French and English term pair. This supports a generic identity without relying on recipe frequency or brand-specific evidence.

## Exact proposed data

### Active reference

```json
{
  "id": "ingredient-ref-tomato-pulp",
  "nameFr": "pulpe de tomates",
  "nameEn": "tomato pulp",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

Use the OQLF preferred French and English terms as the displays. Add no aliases: the exact source terms are already the display names, and no additional search wording is needed to establish this identity.

### Identity and data limits

- The proposed scope is the named processed-tomato product in CFIA Volume 4 section 35 / Volume 10 section 10.2.7: tomato pulp made from sound, whole ripe tomatoes or sound tomato trimmings and concentrated to the standard. Volume 4 specifies at least 12% tomato solids; Volume 10 specifies a minimum specific gravity of 1.050 at 20°C and permits salt.
- Keep it separate from tomato purée (Volume 10 section 10.2.8 uses whole ripe tomatoes with skins and seeds removed), tomato paste, concentrated tomato paste, tomato sauce, tomato juice, tomato chili sauce, passata, fresh tomatoes, and whole/diced/crushed canned tomato presentations. Do not treat a generic crushed-tomato product as tomato pulp; CFIA does not define the commercial crushed cut as this standard.
- Do not add forms, recipe links, measures, density, unit mappings, conversions, yields, or substitutions. The regulatory specific-gravity minimum is a product-class criterion, not a generic kitchen mass/volume conversion or default density.
- Add an `ingredient_reference` ledger record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`. Record no measurement observations or substitution findings. The identity research found no supported kitchen measure; broader substitution research remains open.

### Proposed research record

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP03-L-TOMATO-PULP-R865-20261019-S01** *(new; unassigned in the current ledger)* | Office québécois de la langue française, [GDT: pulpe de tomates](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059866/pulpe-de-tomates) | Lists preferred `pulpe de tomates` and the English `tomato pulp`, and defines the processed product. The entry was last updated in 1979, so CFIA's current standards are also used for the present product boundary. `sourceKind: regional_authority`. |
| **WP03-TC-20261009-S04** *(reused; current owner: R130 `ingredient-ref-tomato-puree`)* | CFIA, [Normes d’identité canadiennes, Volume 4](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4) | Sections 31 and 34–37 distinguish canned tomato cuts, purée, pulp, paste, and concentrated paste. Section 35 names `pulpe de tomates` and requires at least 12% tomato solids. Reuse only this product-class evidence; do not transfer purée measurements or product claims. `sourceKind: regional_authority`. |
| **WP03-TC-20261009-S05** *(reused; current owner: R130 `ingredient-ref-tomato-puree`)* | CFIA, [Canadian Food Compositional Standards, Volume 10](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Section 10.2.7 defines tomato pulp separately from tomato purée in section 10.2.8. Its specific-gravity threshold is a regulatory standard, not a reusable density or recipe measure. Rechecked 2026-10-19. `sourceKind: regional_authority`. |

Reuse the existing CFIA source IDs only for the standard provisions that expressly cover tomato pulp. Do not reuse the R130 Saputo product package details, Metro recipe amount, or Mutti passata wording as generic pulp evidence. The new R865 source ID was unassigned in the ledger, prior proposals, batches, and legacy archive before this proposal was drafted.

## Ownership, picker, and recipe checks

- Current active neighbors are `ingredient-ref-tomatoes` (with fresh, canned whole/diced/crushed, sun-dried, and oil-packed forms), `ingredient-ref-tomato-puree`, `ingredient-ref-passata`, `ingredient-ref-tomato-paste`, `ingredient-ref-tomato-sauce`, and `ingredient-ref-tomato-juice`. Their IDs and evidence remain unchanged.
- Current exact-name/alias searches return no result for `tomato pulp` or `pulpe de tomates`. `tomato purée` / `purée de tomates` resolve to the existing purée row; `passata` resolves to its existing row. With the proposed reference, the two pulp display terms would resolve to the new standalone identity without a form hint.
- The existing branded entries and their product-scoped evidence remain untouched. No measurement, name, or claim is transferred from a brand or product line. The 2026-10-19 [generic ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md) found no open checklist task solely for another brand/product roster; no tomato-pulp brand-specific child task was found. Any product-line, flavor-family, or retailer-only expansion would remain out of scope because this proposal addresses generic ingredient diversity.
- All 114 manifest-listed recipes / 1,123 ingredient rows were scanned. There is no tomato-pulp, purée, or passata ingredient line. The five tomato-related ingredient rows are `034#8` canned diced tomatoes, `078#12` tomato paste, `086#12` tomato paste, `090#1` tomato sauce, and `096#1` fresh tomatoes; each retains its current identity/form link. Add no recipe link.

## Unresolved risks

- OQLF's terminology entry is old (1979), although CFIA's current bilingual standards separately identify tomato pulp and confirm the product class.
- Culinary usage may apply “tomato pulp” more loosely than the Canadian standardized class. This row should remain limited to the named standard product; do not extend it to `polpa`, passata, purée, or crushed tomatoes without separate transferable evidence.
- The CFIA specific-gravity minimum is not a kitchen measure. No reusable mass/volume value, yield, conversion, or safe substitution was established here; substitution research remains open.
- No bundled recipe uses the ingredient, and no culinary measure or replacement context is available from the checked corpus.

No software tests, build, emulator, or deployment were run. The active change only adds database JSON under the exception in `AGENTS.md`; static validation is recorded in the integration README.
