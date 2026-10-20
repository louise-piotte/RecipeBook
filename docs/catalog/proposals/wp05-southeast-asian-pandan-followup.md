# WP05 Section X pandan follow-up — leaf, extract, powder, and paste boundaries

Owner: WP05 regional product review. Reviewer: integration owner. Status: raw culinary leaves integrated on 2026-10-09; independent Québec French display review completed in R345 on 2026-10-16; prepared-product boundaries remain open. Sources accessed: 2026-10-08 and 2026-10-09 unless dated in linked follow-ups. Scope: pandan-related candidates named in Section X, with cross-checks against Sections K and E. Only the narrow leaf identity and source-backed powdered-leaf form are integrated; other prepared pandan products remain outside those records.

## Input revision and inspected state

Repository: /home/louise/RecipeBook. HEAD: `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`. The worktree was already extensively modified; those pre-existing edits were preserved. This packet's target file was absent at inspection.

| Live input | SHA-256 | Inspected state |
| --- | --- | --- |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | `03f3c65621101db4d139d03c817c78dd73cc2a01a66314f8bbaeb3fc10f2a3c2` | 394 references; no pandan, Pandanus, screwpine, or kewra match |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` | 16 forms; no pandan form |
| `docs/catalog/research-ledger.v1.json` | `f8084b6cec397ce111cc5a34001af57916147c9b31f58ad6341d121b5f414c95` | no pandan/Pandanus/screwpine/kewra candidate |
| `docs/catalog/ingredient-catalog-workflow.md` | `865cf212c5d8da5a4f549bfc8190a60f3daa1cbacd652202e126d4310287c601` | identity/form/alias/compound and packet contract reviewed |
| `docs/RecipeBook-global-ingredient-catalog-plan.txt` | `69232c6cb52ace08a1584fe64f294975cb4b317ab9891a93edc40fb99c2f8e73` | Section X and cross-section mentions reviewed |

Existing WP05 pandan discussion leaves prepared extracts/essences/pastes unresolved; it does not contain the direct product-formulation evidence below. The live seed, forms, legacy-candidate file, and ledger contain no pandan entry. I audited all 114 bundled recipe JSON files: none contains a pandan, Pandanus, screwpine, kewra, or keora ingredient-line/text match.

**Cross-section overlap:** the plan lists “pandan leaves” under Section K and “pandan extract” under Section E, as well as “pandan preparations” under this Section X. WP05 owns the single raw-leaf identity; Sections K and U cross-reference that row. Section E extract and Section X prepared-product work remain open. No duplicate rows were created.

## Candidate disposition and proposed record

The botanical reference and current Canadian bilingual supplier pages support a narrow leaf identity. Prepared forms remain separate or unresolved according to their exact product evidence.

| Candidate | Disposition | Proposed EN / fr-CA names or status | Identity and form boundary |
| --- | --- | --- | --- |
| Culinary pandan leaves | **Integrated identity.** Stable ID: `ingredient-ref-pandan-leaves`. Category: `HERB`. | **pandan leaves / feuilles de pandan** | The government botanical record identifies *Pandanus amaryllifolius* and its culinary leaf use; La Plantation Canada uses “Pandan Leaves” and “feuilles de pandan,” and identifies one tea SKU as 100% dehydrated leaves. No aliases or form row were added in this identity integration. R345 independently reviewed and retained the French display. |
| Fresh, frozen, or dried whole leaves as recipe forms | **No form proposal.** | Unassigned | Current product evidence specifically documents dehydrated leaves in a tea SKU; the botanical source describes culinary leaves and their use. No bundled recipe requests pandan, so fresh/frozen/dried state modeling is not needed by a recipe line. Do not create generic forms without a reviewed use case and product-state rule. |
| Pandan leaf juice | **Unresolved as a separate catalog ingredient/form.** | Unassigned | NParks says juice extracted from leaves is used to fragrance tea and desserts. That supports a cooking extraction operation, not a packaged juice/extract identity, composition, or universal equivalence to products labelled “extract” or “essence.” |
| Pandan leaf powder | **Unresolved as same-identity form.** | Canadian product wording exists: “Pandan Leaves Powder” / “Poudre de feuilles de pandan”; no catalog row proposed. | The Canada storefront pages name a powder and its cooking uses but provide no ingredient declaration. Do not infer that it is pure ground leaf, leaf extract powder, or a compound flavouring. |
| Pandan leaf extract / extract powder | **Do not add a generic identity or alias.** | Generic “pandan extract” and “pandan leaf extract powder” remain unresolved as catalog-wide names. | A Malaysian manufacturer documents one specific B2B leaf-extract powder made from *P. amaryllifolius* leaves. This establishes that a processed leaf extract can be a materially distinct ingredient, but it does not establish that every retail product called “pandan extract” or “pandan flavour” has the same composition or concentration. Do not map it to whole leaves or treat its product specifications as kitchen conversions. |
| Pandan essence / flavouring | **Unresolved.** | No proposed name or alias. | No sufficiently specific Canadian bilingual label or authoritative formulation was verified for a generic essence. “Essence,” “extract,” and “flavour” must not be assumed synonymous or leaf-derived from name alone. |
| Pandan paste / Apito Pandan Paste | **Keep exact products as compounds; no generic identity proposed.** | No generic name or alias proposed. | Bakels Thailand describes its named Apito product as providing pandan flavour and colour, and lists water, solvent E1520, permitted flavouring, permitted colourings, and thickeners. This is evidence that this named paste is a compound flavour/colour preparation, not whole leaves or a generic leaf-extract alias. Do not generalize this formula to all pandan pastes. |
| Pandan-infused kaya | **Keep within the kaya compound identity/style, not a pandan alias or leaf form.** | Existing kaya proposal only. | A finished coconut-and-egg spread with pandan infusion remains a compound product. Its pandan use does not make kaya a synonym or form of pandan. |
| Kewra water | **Keep separate; no pandan alias.** | Existing South/Central Asia–MENA proposal only. | Kewra is a flower-derived aromatic preparation, not the culinary leaf product documented here. The shared genus name is insufficient to merge a different plant part and preparation. |

### Accepted changed-record payload (identity-only)

- New reference candidate: `ingredient-ref-pandan-leaves`
- `nameEn`: `pandan leaves`
- `nameFr`: `feuilles de pandan`
- `category`: `HERB`
- `aliasesEn`: `[]`
- `aliasesFr`: `[]`
- `defaultDensity`: `null`; `unitMappings`: `[]`
- No ingredient-form row proposed.

NParks lists “pandan,” “screwpine,” “Pandan Wangi,” and “Daun Pandan” among common names for the botanical species. They are not activated here as ingredient aliases: the botanical record does not establish each as an unambiguous recipe-line term for the leaf product, and “pandan” alone could refer to leaf, extract, powder, paste, or flavouring. The Canadian supplier terms above directly qualify the plant part.

The French display is supported by a Canadian French product page, not an OQLF terminology entry or a verified bilingual package photograph. The supplier’s displayed botanical spelling on the dried-leaf SKU differs from the authoritative taxon spelling; use the government botanical record for *Pandanus amaryllifolius* and do not copy the supplier typo into catalog fields.

## Measurement and substitution proposal

None. No density, unit mapping, mass/volume conversion, package yield, or substitution ratio is proposed for any pandan candidate. The manufacturer's extract specification is product-specific and is not a culinary conversion. No source located supports leaf-to-extract, leaf-to-powder, essence-to-leaf, or paste-to-leaf equivalence. Keep numeric and substitution data unavailable.

## Direct source evidence

All sources below were accessed on 2026-10-08.

1. Singapore National Parks Board, **“Pandanus amaryllifolius Roxb.”**, Flora & Fauna Web. It lists common names and classifies the plant as a herb or spice; it says leaf juice is used to fragrance tea and desserts and that leaves are removed before serving. This supports the taxon, plant part, and culinary role—not equivalence between packaged preparations. https://www.nparks.gov.sg/florafaunaweb/flora/2/2/2299
2. La Plantation Canada, **“Pandan Leaves Tea - 50g”** (English product page). Canada is the selected storefront; the page says the product ingredients are 100% dehydrated pandan leaves. The SKU was sold out when accessed. Its botanical name is misspelled on the supplier page; the correct taxon is supplied by NParks. https://laplantation.ca/products/pandan-leaves-infusion-50g
3. La Plantation Canada, **“Thé aux feuilles de pandan - 50 g”** (French product page). The Canadian French page says “100 % feuilles de pandan déshydratées” and gives the same ingredient declaration. It supports the fr-CA display wording, but the page is an online listing, not a verified photograph of a bilingual retail package. https://laplantation.ca/fr/products/pandan-leaves-infusion-50g
4. La Plantation Canada, **“Pandan Leaves Powder 50g”** and **“Poudre de feuilles de pandan 50 g.”** The EN/FR Canadian pages name pandan-leaf powder and describe cooking use but expose no ingredient statement. This is why purity and identity/form assignment remain unresolved. https://laplantation.ca/products/pandan-leaves-powder-50g ; https://laplantation.ca/fr/products/pandan-leaves-powder-50g
5. Bakels Thailand, **“Apito Pandan Paste.”** The manufacturer identifies the product’s use as pandan flavour and colour for baked goods and classifies it under Flavours & Colours. Its product ingredient list is water, solvent (E1520), permitted flavouring, permitted colouring (E102, E133), and thickeners (E466, E415). This formulation applies only to the named product. https://www.bakels.co.th/en/products/apito-pandan-paste/
6. Bionutricia Extract, **“Pandan Leaf Extract Powder (*Pandanus amaryllifolius*) — Bulk B2B Supplier.”** Manufacturer specification identifies leaf source and a spray-dried extract product; it is a Malaysian bulk B2B ingredient, not a Canadian consumer label. It shows one source-defined extract distinct from whole leaves; it does not define a generic retail “pandan extract” category. https://bionutriciaextract.com/pandan-leaf-extract-powder-bulk/

## Checks and remaining work

- [x] Re-read the live references, forms, ledger, and overlapping proposals; confirm the ID and bilingual names have no normalized collision.
- [x] Assign one row owner and cross-reference Sections K/U rather than duplicating the leaf identity.
- [ ] Obtain independent Québec French review. The Canadian French listing and Télé-Québec recipe support the display wording, but this is not represented as an OQLF-approved term.
- [x] Integrate only the leaf identity, without aliases, forms, numeric conversions, or active substitutions; re-run package and catalog checks.
- [ ] Review any future prepared-product row against an exact product/formulation and its own bilingual naming evidence.

## Coordinator integration result

Accepted `ingredient-ref-pandan-leaves`, `pandan leaves / feuilles de pandan`, category `HERB`, with no aliases. WP05 owns the only canonical row; Sections K and U cross-reference it. The package pages and Télé-Québec recipe support the names and leaf use. No forms, density, unit mappings, package/preparation yields, conversions, or active substitutions were added in the identity integration. Exact-key and all-114-recipe audits were clear at merge time. The Section E extract and Section X juice, powder, extract, essence, paste, and infused-product boundaries remain open. R345 independently reviewed and retained the French displays. See [`../batches/wp05-pandan-leaves.md`](../batches/wp05-pandan-leaves.md), the [R345 terminology review](wp05-pandan-quebec-french-terminology-review-r345-20261016.md), and the [original product-boundary review](wp05-pandan-product-boundary-review-20261009.md).
