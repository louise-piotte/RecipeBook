# WP03 Section U — tarragon / estragon identity review (R341, 2026-10-16)

- **Status:** Accepted and integrated by root on 2026-10-16; see the [R341 integration README](../batches/wp03-section-u-tarragon-identity-integration-r341-20261016/README.md). The proposal records the source review and bounded scope.
- **Plan anchor:** Section U, “Fresh herbs botanical aromatics and regional flavorings,” line 7665 of `docs/RecipeBook-global-ingredient-catalog-plan.txt`. The open common-herb checklist names tarragon.
- **Candidate:** Culinary tarragon, source-named as *Artemisia dracunculus* L.
- **Coordination:** This review does not reopen the integrated marjoram (R338), perilla leaves (R335), Chios mastic (R327), mahlab (R330), lemon verbena (R332), lemon balm (R324), or lovage (R296) work. The recently integrated WP04 seafood work has no Section U overlap. The only older archive hit is an incidental external fish-recipe mention, not a tarragon identity decision.
- **Disposition:** Advance the existing unreviewed legacy candidate as one identity-only HERB reference, `tarragon / estragon`. Add no aliases, forms, or numeric behavior.

## Recommendation

Accept one culinary tarragon identity scoped to *Artemisia dracunculus* L. The OQLF’s GDT gives the Québec French term `estragon`, its English equivalent `tarragon`, and the Latin name; its definition says the aromatic stem and leaves are used as a condiment. Kew accepts *A. dracunculus* as a species and records food use. UQAC identifies an `estragon français` plant with this species and describes culinary use of its leaves fresh or dried. A current Mayrand fresh-herb listing also uses `Estragon` for a Québec-market product. [S01–S04]

| Field | Proposed value |
|---|---|
| Proposed ID | **ingredient-ref-tarragon** (reuse the existing legacy candidate ID; not present in active references) |
| Category | HERB |
| English display | tarragon |
| Québec French display | estragon |
| English aliases | None |
| French aliases | None |
| Scope | Culinary tarragon identified as *Artemisia dracunculus* L.; no cultivar assignment |
| Forms | None |
| Recipe links | None |
| Density, unit mappings, measures, yields, conversions, active substitutions | None |

OQLF provides the exact Québec display and maps it to English `tarragon`. The local UQAC article is explicitly about `estragon français`, so that longer cultivar-style name is retained as source context but is not proposed as a generic alias for every tarragon product. No unqualified `armoise` alias is proposed: OQLF’s entry calls tarragon a type of armoise and supplies the species name, while other plants in that group have distinct identities. [S01, S03]

## Identity and product boundary

| Term or product | Disposition | Evidence boundary |
|---|---|---|
| Culinary tarragon, *Artemisia dracunculus* | Proposed identity | OQLF directly associates the Québec term `estragon`, English `tarragon`, and the species name, and describes its aromatic stems and leaves as condiment material. Kew accepts the species and records food use. [S01–S02] |
| `tarragon` / `estragon` | Proposed displays only | These are the exact English and French terms in OQLF’s species entry. No additional locale aliases are needed for the verified bilingual label pair. [S01] |
| `estragon français` / `French tarragon` | Do not add as generic aliases | UQAC uses `estragon français` for its *A. dracunculus* gardening/culinary profile. This supports that source’s product wording, not equivalence across cultivars or a requirement that every product named `tarragon` be the same cultivar. [S03] |
| Russian tarragon, Mexican tarragon, and other qualified names | Keep unassigned | This review does not infer cultivar, variety, or non-*A. dracunculus* product scope from a qualified common name. No such qualifier is activated as an alias or form. |
| Fresh and dried leaves | Keep as source-described presentations; add no forms | UQAC describes culinary use of leaves fresh or dried, and Mayrand lists fresh estragon products. These sources do not establish a recipe need, measure, mass-volume basis, or fresh-to-dried conversion. [S03–S04] |
| Whole or ground dried tarragon spice | Leave outside this identity-only proposal | An archived Canadian draft compositional standard describes a dried leaf/flowering-top product, but it is a draft source and supplies no bundled-recipe need. No dried or ground form is proposed from it. [S05] |
| Wormwood, mugwort, and other *Artemisia* species | Keep separate | A shared genus does not establish a shared culinary identity. Do not add `wormwood`, `mugwort`, `armoise`, or botanical genus names as aliases. [S01–S02] |
| Tarragon oil, extracts, vinegar, mustard, and other compound products | Keep separate | The identity covers the herb itself. Aromatic extracts and products made with tarragon do not become herb forms or aliases through shared flavor wording. No blend or compound product is represented here. |

## Catalog, ownership, and demand audit

The pre-R341 manifest-listed package and catalog snapshot was scanned on 2026-10-16. Exact phrase ownership follows `IngredientReferenceSearchIndex`’s normalization of case, accents, and punctuation.

| Artifact | Findings |
|---|---|
| Section U plan | The common-herb checklist remains open and names tarragon at line 7665. This review does not duplicate any recently integrated aromatic or prior Section U proposal. |
| Active references | Before R341, `ingredient-references.v1.json` contained 1,686 rows; SHA-256 `e95392a7a74c702660d5e639d141fc0942588f9be5408aa7f7ceec72a46723c2`. No exact owner for `tarragon`, `estragon`, `Artemisia dracunculus`, `French tarragon`, or `estragon français`; no active `ingredient-ref-tarragon`. |
| Forms | Before R341, `ingredient-forms.v1.json` contained 129 rows; SHA-256 `78563e9c449a665f5d0490c0e2b9751681d78cfc1d039dbb03cee8c13d1540a1`. No tarragon form or match term. |
| Legacy candidates | Before R341, `legacy-import-identities.v1.json` contained 57 candidates; SHA-256 `c5fcfaf0e347a09e33dfdcc85a7b85d18f5f82542725568eab4ef41ae254f7a4`. It contained `ingredient-ref-tarragon` with `nameEn: tarragon`, `nameFr: estragon`, category `HERB`, empty alias arrays, and `reviewState: unreviewed`. R341 promotes this candidate and removes it from the legacy list. |
| Research ledger | Before R341, 2,033 records / 9,095 source entries; SHA-256 `4cfc7875cb057fb6b339e1923fa2f35422c5dfccec1db7c315f9e3bb29205274`. The tarragon candidate record was `unreviewed`, had no sources, and only said it needed identity and alias review after being found in the legacy RecipeKeeper catalog. |
| Proposals and batches | Before R341, no standalone tarragon review, hold, integration, or source-ID allocation existed. The only prior tarragon hit outside the plan and candidate record was a 2026-10-09 WP04 fish coordinator’s citation to an external halibut recipe containing tarragon; it did not create a bundled line or adjudicate the herb identity. [S06] |
| Bundled recipe corpus | All 114 manifest-listed recipes and 1,123 ingredient rows were scanned for `tarragon`, `estragon`, *Artemisia dracunculus*, `French tarragon`, `estragon français`, `Russian tarragon`, and `Mexican tarragon`. There were zero full-file hits and zero ingredient-row hits. No catalog recipe link or recipe-specific measure/substitution is warranted. |

The zero recipe-hit result describes only the bundled seed corpus. Mayrand and UQAC provide external Québec product/culinary evidence, but those sources do not establish demand from a RecipeBook recipe line.

## Exact picker projection

`IngredientReferenceSearchIndex` normalizes case, accents, and punctuation, prefers complete normalized word-phrase matches in names and aliases, and falls back to substring matching only if there are no complete phrase matches. Forms contribute search terms, but none is proposed. With only the bilingual displays above:

| Query | Projected result |
|---|---|
| `tarragon` | `ingredient-ref-tarragon` only |
| `estragon` | `ingredient-ref-tarragon` only |
| `French tarragon` / `estragon français` | No result; cultivar-style wording is not a generic alias |
| `Russian tarragon` / `Mexican tarragon` | No result; no qualified identity is assigned |
| `tarragon leaves` / `feuilles d’estragon` | No result; no part-qualified alias or form is proposed |
| *Artemisia dracunculus* / `Artemisia` | No result; botanical names are not picker aliases |
| `armoise` / `wormwood` / `mugwort` | No result from this row; no genus-level aliases are added |

The exact display terms return the one proposed row. Queries that include a cultivar qualifier, plant part, or botanical name remain unassigned until the catalog has separate evidence for those terms.

## Measures and substitutions

No bundled tarragon line exists. UQAC documents fresh and dried culinary use but provides no recipe quantity or transferable measurement basis; Mayrand’s `1 kg` is a product-listing/package designation, not a recipe measure. Do not infer a leaf count, mass-per-volume value, density, fresh-to-dried conversion, or unit mapping. No source supports substituting tarragon for another herb; no substitution, yield, conversion, or recipe link is proposed.

## Source register

Sources were accessed on 2026-10-16. Claims below are paraphrased. Sources S01–S05 are recorded under the R341 prefix in the shared ledger; S06 and S07 remain repository-only audit references.

| ID | Source | Support and limits |
|---|---|---|
| **WP03-SECTIONU-TARRAGON-R341-20261016-S01** | Office québécois de la langue française, [GDT: estragon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095269/estragon). | OQLF-authored 1982 record identifies the preferred French term `estragon`, English `tarragon`, and Latin *Artemisia dracunculus* L.; defines the aromatic stems and leaves as used as a condiment. Supports Québec wording and culinary plant identity, not current product availability, measures, or forms. |
| **WP03-SECTIONU-TARRAGON-R341-20261016-S02** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Artemisia dracunculus* L.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:307848-2/general-information). | Accepts *A. dracunculus* as a species and states that it is used for food. Supports taxonomy and food use; it does not settle cultivar distinctions or Québec naming. |
| **WP03-SECTIONU-TARRAGON-R341-20261016-S03** | Université du Québec à Chicoutimi, [Estragon français, *Artemisia dracunculus*](https://www.uqac.ca/foretnourriciere/fines-herbes-epices-et-aromates/estragon/). | Identifies its local profile as French tarragon, states the leaves are consumed fresh or dried, and describes culinary uses. Supports Québec culinary context for leaves; the source’s cultivar-style title is not generalized into aliases, measures, or substitution behavior. |
| **WP03-SECTIONU-TARRAGON-R341-20261016-S04** | Mayrand, [Herbes fraîches](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/fines-herbes-et-vinaigrette/herbes-fraiches). | Current Québec fresh-herb catalogue lists `Estragon` and `Estragon vrac 1 kg`. Supports local French product wording and fresh-herb category only; pack size and listing do not establish a recipe measure, botanical test, or guaranteed stock. |
| **WP03-SECTIONU-TARRAGON-R341-20261016-S05** | Canadian Food Inspection Agency, [Archived draft Canadian Food Compositional Standards, tarragon entry](https://inspection.canada.ca/en/about-cfia/transparency/consultations-and-engagement/canadian-food-compositional-standards). | The archived draft defines whole or ground tarragon as dried leaves and flowering tops of *A. dracunculus*. It is recorded only as historical product-boundary evidence; its draft status and compositional limits are not adopted as a current standard, form, measure, density, or quality rule. |
| **WP03-SECTIONU-TARRAGON-R341-20261016-S06** | WP04, [Finfish identity coordinator review](wp04-finfish-identity-coordinator-review-20261009.md). | An archived fish proposal cites an external halibut recipe that includes tarragon. It is not a tarragon identity review, does not link a bundled recipe line, and is not used for a tarragon measure or substitution. |
| **WP03-SECTIONU-TARRAGON-R341-20261016-S07** | Repository audit of active references/forms, legacy candidates, research ledger, manifest-listed recipes, proposal/batch archive, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Records exact ownership, legacy-candidate state, corpus demand, archive hits, and phrase-first picker projection. Project evidence only; not an external botanical or language source. |

## Remaining limits

This proposal resolves one open Section U herb identity. It does not select French versus Russian cultivars, extend the name to other *Artemisia* species, add fresh or dried forms, attach a recipe, or establish quantities, conversions, yields, or substitutions. Qualified names and product presentations remain open until they have distinct catalog demand and supporting evidence.
