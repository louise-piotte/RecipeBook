# WP03 Section N — gem-studded puffball identity review (R1009)

- **Reviewed:** 2026-10-19
- **Status:** Integrated into the bundled ingredient reference catalog and research ledger, with the review recorded in the R1008–R1010 integration README. No forms or recipe rows were changed.
- **Scope:** One generic culinary fungus identity, bounded to *Lycoperdon perlatum*. No brand, SKU, product-line, flavour-family, or retailer-variant work is in scope.
- **Plan anchor:** Section N, “Huitlacoche and other documented culinary fungi,” and its open species-sensitive identity work.
- **Recommendation:** Add one identity-only reference for **gem-studded puffball / vesse-de-loup perlée**. Keep it separate from giant puffball and generic mushroom. Add no forms, recipe links, measurements, density, mappings, yields, conversions, or substitutions.

## Why this is a distinct generic ingredient gap

Section N already has distinct rows for generic mushroom and giant puffball, alongside other named fungi. This review checked the current open Section N work and recent proposals for this exact taxon. R931 covers *Calvatia gigantea* only; it explicitly leaves wider puffball names unassigned. No active row or earlier proposal covers *Lycoperdon perlatum*. This proposal adds the separately documented culinary species without treating a commercial product roster as ingredient diversity.

The OQLF GDT pairs English **gem-studded puff-ball** with French **vesse-de-loup gemmée**, **vesse-de-loup à pierreries**, and **vesse-de-loup perlée**; its Latin terms include both *Lycoperdon gemmatum* and *L. perlatum*. The contemporary Québec MycoQuébec species card uses *L. perlatum* and **vesse-de-loup perlée**. Together, these support the proposed bilingual display for the current species name. The 1992 OQLF record’s *L. gemmatum* term is retained as terminology evidence, not as a proposed catalog alias. [S01, S02]

Biogenus also pairs *L. perlatum* with **vesse-de-loup perlée** and describes its culinary use cooked in an omelet or sautéed in butter. Agriculture and Agri-Food Canada’s species account classifies *L. perlatum* as edible and distinguishes it from the similarly named pear-shaped puffball. These sources support a culinary identity for the named species; their descriptions do not establish a reusable amount, household measure, density, form conversion, or substitution. [S03, S04]

## Proposed reference row

If accepted, use these identity-only values:

| Field | Proposed value |
|---|---|
| id | ingredient-ref-gem-studded-puffball |
| nameEn | gem-studded puffball |
| nameFr | vesse-de-loup perlée |
| aliasesEn | Lycoperdon perlatum |
| aliasesFr | vesse-de-loup gemmée; vesse-de-loup à pierreries; Lycoperdon perlatum |
| defaultDensity | null |
| unitMappings | empty |
| category | VEGETABLE_AND_AROMATIC |
| updatedAt | 2026-10-19T00:00:00Z if integrated with this review |

Do not add bare **puffball**, **puffball mushroom**, **vesse-de-loup**, **common puffball**, or **boviste** as aliases; these can refer to a broader group. OQLF’s hyphenated English spelling **gem-studded puff-ball** is punctuation-equivalent to the proposed display, so no duplicate spelling alias is needed. Do not add the historical *Lycoperdon gemmatum* synonym as a second taxon alias.

## Current package and collision audit

Counts below describe the working tree read for this proposal on 2026-10-19.

| Area | Current finding | Proposal effect |
|---|---|---|
| Active references | 2,021 references. No proposed ID, *L. perlatum*, **gem-studded puffball**, or **vesse-de-loup perlée** row exists. The only current reference matching the broader word “puffball” is ingredient-ref-giant-puffball-mushroom for *Calvatia gigantea*. Generic mushroom is also active. | Add a separate *L. perlatum* identity. Keep *Calvatia gigantea* and generic mushroom unchanged. Do not assign the unqualified group name to either row. |
| Taxon and name boundary | MycoQuébec distinguishes *L. perlatum* from *Apioperdon pyriforme*, formerly often called *Lycoperdon pyriforme*. R931 bounds giant puffball to *Calvatia gigantea*. | Do not add *Apioperdon pyriforme*, *Calvatia gigantea*, or genus-level puffball terms as synonyms or aliases. |
| Active forms | 205 forms. No form names the proposed species or its display names. The generic mushroom has a separate dried form. | Add no species form and do not attach the generic dried form. |
| Legacy candidates | 55 candidates. No candidate contains *L. perlatum*, *L. gemmatum*, gem-studded puffball, or vesse-de-loup perlée. | Do not promote or remove a legacy candidate. |
| Research ledger | 2,427 records. No *L. perlatum* or proposed-name record exists. The broad “puffball” match is the R931 *Calvatia gigantea* record. | If later integrated, add a separate source-backed identity record; preserve the R931 record and its evidence. |
| Recipe corpus | All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned. No ingredient, title, description, or instruction mentions the proposed names, *L. perlatum*, *L. gemmatum*, or puffball. | Add no recipe link or relink. |
| Related recipe lines | Recipe 037 has generic white mushrooms and extra sautéed mushrooms; recipe 089 asks for half a box of generic mushrooms; recipe 100 uses ground dried candy cap mushrooms. None names this species. | Preserve all existing lines and links. They do not establish gem-studded-puffball demand or interchangeability. |
| Substitutions and package yields | The global and contextual substitution-rule files have zero entries. The package-yield file has no matching species or name. | Add no substitution or yield data. |

The qualified display shares the word **puffball** with the existing giant-puffball identity. That lexical overlap does not make the taxa or ingredient identities equivalent. Keep the species qualifier in the display and avoid a broad alias. Do not merge the proposed row into generic mushroom or transfer any evidence from giant puffball.

## Measurement, form, and substitution limits

The sources reviewed here provide taxonomy, terminology, regional occurrence, and culinary-use context. Biological descriptions such as fruit-body dimensions are not ingredient measures. This identity-only proposal did not perform a separate household-measure, density, package-yield, or substitution study.

If accepted, keep density null, unit mappings empty, and package yields absent. Add no fresh, dried, powdered, canned, reconstituted, or soaking-liquid form. The existing dried-mushroom form remains attached only to generic mushroom. Culinary examples in S03 are source-specific uses, not reusable recipe instructions or measured conversions.

The sources do not establish a directional, recipe-context replacement rule. Add no global or contextual substitution. If a ledger record is later added, use identityState **verified** for the supported species/name pairing and leave measurementState and substitutionResearchState **not_yet_researched** beyond the limited identity evidence reviewed here.

## Evidence boundaries

| Item | Treatment |
|---|---|
| *Lycoperdon perlatum* | Proposed culinary identity, using the current name in the Québec species card. |
| *Lycoperdon gemmatum* | Older Latin terminology recorded by OQLF. Do not add as an alias or imply a second current species. |
| *Calvatia gigantea* / giant puffball | Preserve the separate R931 identity and its scoped evidence. |
| Generic mushroom and dried mushroom form | Preserve both; generic recipe wording and form evidence do not transfer to this species. |
| *Apioperdon pyriforme* | Preserve as a distinct comparison taxon in source notes; do not add it as an alias. |
| Foraging or identification advice | Not part of this proposal. No field-identification or consumption guidance is proposed for app users. |
| Commercial variants | No brand, SKU, product-line, flavour-family, or retailer variant was researched. Such product counts do not add ingredient diversity; existing branded identities and product-specific evidence remain intact. |

## Source register

Sources accessed 2026-10-19. IDs are proposal-local; no research-ledger records were edited.

| ID | Source | Supports and limits |
|---|---|---|
| **WP03-SECTIONN-GEM-PUFFBALL-R1009-20261019-S01** | OQLF, [vesse-de-loup gemmée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18942420/vesse-de-loup-gemmee), updated 1992. | Pairs **gem-studded puff-ball** with French **vesse-de-loup gemmée**, **vesse-de-loup à pierreries**, and **vesse-de-loup perlée**; lists *Lycoperdon gemmatum* and *L. perlatum*. Terminology evidence, not a current taxonomic treatment. |
| **WP03-SECTIONN-GEM-PUFFBALL-R1009-20261019-S02** | MycoQuébec, [*Lycoperdon perlatum* species card](https://www.mycoquebec.org/bas.php?iumq=1511&tag=Lycoperdon+perlatum). | Uses *L. perlatum* and **vesse-de-loup perlée** for a Québec species, and distinguishes it from *Apioperdon pyriforme*. Supports local name/taxon boundary; biological observations are not recipe measurements. |
| **WP03-SECTIONN-GEM-PUFFBALL-R1009-20261019-S03** | Biogenus, [Vesse-de-loup perlée](https://biogenus.ca/champignons/vesse-de-loup-perlee/). | Pairs *L. perlatum* with **vesse-de-loup perlée**, describes cooked culinary uses, and treats those uses as examples. Its organism dimensions and maturity notes are not household measures or app foraging guidance. |
| **WP03-SECTIONN-GEM-PUFFBALL-R1009-20261019-S04** | Agriculture and Agri-Food Canada, [Edible and Poisonous Mushrooms of Canada](https://publications.gc.ca/collections/collection_2013/aac-aafc/agrhist/A43-1112-1979-eng.pdf), 1979. | Names *Lycoperdon perlatum* and classifies that species as edible; distinguishes it from other puffball taxa. The old field guide is species-level identity evidence, not a source for current taxonomy, household measures, recipe amounts, or general mushroom safety guidance. |

## Disposition

Recommend one identity-only **gem-studded puffball / vesse-de-loup perlée** reference for *Lycoperdon perlatum*. Preserve giant puffball, generic mushroom, all existing forms, recipe links, and evidence. The bundled corpus has no candidate-specific demand. Add no measurements, forms, conversions, yields, recipe links, or substitutions. Section N remains open.
