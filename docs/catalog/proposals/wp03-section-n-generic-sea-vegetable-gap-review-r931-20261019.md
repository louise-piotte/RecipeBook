# WP03 Section N — giant puffball identity review (R931)

- **Reviewed:** 2026-10-19
- **Status:** proposal only. This review creates this file alone. No catalog JSON, ledger, recipe, checklist, roadmap, workflow, or batch file was changed. No software tests were run.
- **Scope:** one generic culinary fungus identity, giant puffball / vesse-de-loup géante, bounded to *Calvatia gigantea*. No brand, product line, flavour, SKU, retailer variant, or commercial-product roster was researched.
- **Recommendation:** add one identity-only reference for *Calvatia gigantea*, with English display **giant puffball**, French display **vesse-de-loup géante**, and *Calvatia gigantea* as an exact search alias in both languages. Do not add an unqualified puffball identity, forms, recipe links, measurements, density, conversion, or substitution.

## Open Section N anchor

This proposal fits the unchecked plan item:

> [ ] Huitlacoche and other documented culinary fungi.

Huitlacoche, white matsutake, and black trumpet have separate completed identity reviews. The remaining Section N work also keeps species-sensitive mushroom names and substitutions open. The giant puffball is a distinct documented culinary fungus with a Québec-standardized name and a source-backed species boundary. This proposal resolves only that identity; it does not mark the wider checklist item complete or revisit held button mushroom, shimeji, porcini, kelp, aonori, or sea grapes.

The generic mushroom reference and the dried mushroom form are already active. They do not make this large, named fungus a synonym or prove that mushroom identities are interchangeable.

## Recommendation and identity boundary

OQLF’s GDT gives the preferred Québec French term **vesse-de-loup géante**, English **giant puffball**, and Latin *Calvatia gigantea*. Its note identifies the species as edible and describes the organism’s appearance; the source limits consumption to specimens whose flesh is white. [S01]

Agriculture and Agri-Food Canada’s field guide separately names *Calvatia gigantea* as giant puffball, describes it as edible, and recommends it for its flavour. The guide distinguishes this species from the wider puffball group, which includes multiple fungi. Its culinary description supports an ingredient identity for the named species, not a universal “puffball” identity. [S02]

La Filière Mauricie’s Québec mushroom profile pairs **vesse-de-loup géante** with *Calvatia gigantea* and describes it as a good edible mushroom found across Québec. This provides regional corroboration; it is not a recipe, measure, or preparation source. [S03]

Scope the proposed row to the named species. Do not alias bare **puffball**, **puffball mushroom**, **vesse-de-loup**, or **boviste** to it: those names can refer to a broader group. The AAFC guide explicitly distinguishes the giant puffball from other species called puffballs. Preserve the existing generic mushroom and all species-specific references; do not merge this row into the generic mushroom reference or use its evidence to relink generic mushroom recipe lines.

If integrated, use:

| Field | Proposed value |
|---|---|
| id | **ingredient-ref-giant-puffball-mushroom** |
| nameEn | **giant puffball** |
| nameFr | **vesse-de-loup géante** |
| aliasesEn | **Calvatia gigantea** |
| aliasesFr | **Calvatia gigantea** |
| defaultDensity | **null** |
| unitMappings | **empty** |
| category | **VEGETABLE_AND_AROMATIC** |

OQLF also lists the English hyphenated spelling **giant puff-ball**. The picker’s punctuation normalization folds that to the same key as **giant puffball**, so no duplicate alias is needed. Do not add the unqualified group names as aliases.

## Current catalog and search audit

I checked active references and forms, legacy candidates, ledger records, prior proposals, and every manifest-listed recipe. The current package contains 1,948 active references, 204 forms, 55 legacy candidates, 2,352 ledger records, and 114 recipes with 1,123 ingredient lines.

| Area | Current finding | Proposal effect |
|---|---|---|
| Active references | No proposed display, alias, taxon, or reference ID is active. The generic mushroom and other named fungi remain separate. | Propose one new species-scoped identity; preserve every current reference. |
| Active forms | No giant puffball reference or form exists. The generic mushroom has a separate dried form. | Add no species form and do not automatically attach the generic dried form. |
| Legacy candidates | None of the 55 candidates contains giant puffball, vesse-de-loup géante, *Calvatia gigantea*, or the proposed ID. | Do not reactivate or merge a legacy candidate. |
| Research ledger | None of the 2,352 records contains the proposed name, taxon, or ID. | If accepted, create a new identity record without rewriting generic mushroom evidence. |
| Prior proposals | The prior Section N reviews cover other fungal identities and the unresolved seaweed boundaries; no earlier proposal or integration record covers giant puffball or *C. gigantea*. | This is distinct from the black trumpet, Irish moss, and sea-grape reviews. |
| Recipe corpus | No recipe string or ingredient line in the 114 recipes and 1,123 ingredient lines matched the target names or taxon. | No recipe link or relink is supported. |

The picker currently has no result for **giant puffball**, **vesse-de-loup géante**, or **Calvatia gigantea**. If integrated, the full English and French names and the binomial alias each resolve to the proposed identity. A bare **puffball** or **vesse-de-loup** query will also match a word phrase in the qualified display under the current search behavior. That partial match must not be treated as a generic puffball owner: the catalog will contain only the *C. gigantea* identity proposed here, and the display remains qualified as **giant** / **géante**.

## Recipe demand

The corpus has no giant puffball or *Calvatia gigantea* line. The existing generic mushroom lines remain generic: recipe 037 specifies white mushrooms and sauteed mushrooms, and recipe 089 specifies half a box of mushrooms. Recipe 100 separately names ground dried candy cap mushrooms. None supports relinking to giant puffball, adding a species-specific form, or treating all mushrooms as interchangeable.

External Québec and federal sources establish that giant puffball is a culinary species. That evidence supports identity-only catalog coverage despite the absence of bundled recipe demand; it does not supply a recipe link or quantity.

## Forms, measurement, and density

No bundled line calls for a fresh, dried, powdered, canned, reconstituted, or soaking-liquid giant puffball form. The current generic dried mushroom form remains under the generic mushroom reference; do not attach it to *C. gigantea* without species-specific need and a transferability review.

OQLF’s organism description gives a specimen diameter range and notes large size; AAFC also gives an organism-size range. These are biological descriptions, not ingredient portions, package yields, or cup-to-mass observations. No source reviewed provides a transferable culinary measure, density, unit mapping, or preparation yield. Do not use a specimen’s reported size or weight to create recipe conversions. If a ledger record is later added, set **measurementState** to **researched_no_supported_value**.

## Substitution evidence

None of the sources reviewed recommends replacing giant puffball with generic mushrooms, another named fungus, or any other ingredient in a recipe. A shared broad classification as mushrooms does not establish culinary interchangeability. Add no global or contextual substitution rule. If a ledger record is later added, set **substitutionResearchState** to **researched_no_supported_substitute** for the evidence reviewed here.

## Sources

| Source | Evidence and limit |
|---|---|
| **S01 — OQLF, [vesse-de-loup géante (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17018856/vesse-de-loup-geante)** | Preferred Québec French term, English **giant puffball**, and taxon *Calvatia gigantea*. The biological note describes the species and restricts its edibility statement to white flesh. Size details are organism descriptions, not ingredient measurements. |
| **S02 — Agriculture and Agri-Food Canada, [Mushroom collecting for beginners](https://publications.gc.ca/collections/collection_2015/aac-aafc/A43-861-1980-eng.pdf)** | Names giant puffball as *Calvatia gigantea*, reports it edible and recommends it for flavour. It also distinguishes the species from the broader puffball group. The guide’s field observations and frying note do not establish a recipe quantity, density, or substitution. |
| **S03 — La Filière Mauricie / MycoMauricie, [Vesse-de-loup géante](https://mycomauricie.com/en/champignon/vesse-de-loup-geante/)** | Québec regional profile pairs **vesse-de-loup géante** with *Calvatia gigantea* and describes it as an edible mushroom found in Québec. Its locality and size information are not recipe measures. |

## Disposition summary

Recommend one identity-only **giant puffball / vesse-de-loup géante** reference, scoped to *Calvatia gigantea*. Preserve the generic mushroom and other fungal entries. Do not alias unqualified puffball names or transfer the generic dried mushroom form. The recipe corpus supplies no demand, and the reviewed evidence supports no transferable measurement, density, form conversion, or substitution.
