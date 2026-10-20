# WP06 African next regional review — garden egg fruit — R505

**Status:** Integrated on 2026-10-17. The catalog reference and research record are in the shared package; no recipe link or active numeric behavior was added. See the [R504–R506 integration README](../batches/wp03-wp04-wp06-r504-r506-gap-review-integration-20261017/README.md).

**Review date:** 2026-10-17

**Candidate:** West African garden egg fruit, *Solanum aethiopicum* L.

## Recommendation

Add one identity-only produce reference for the fruit food product called garden egg in West African use:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-garden-egg` |
| English display | `garden egg` |
| French display | `aubergine écarlate` (provisional for fr-CA; federally attested, no OQLF entry located) |
| Category | `VEGETABLE_AND_AROMATIC` |
| English aliases | `garden eggs`; `scarlet eggplant` |
| French aliases | None |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| Forms, recipe links, conversions, yields, active substitutions | None |

The identity is limited to the edible fruit product of *S. aethiopicum*, especially the immature fruits used as a vegetable in West African cooking. Use the specific common name and species alias to keep this row separate from *S. macrocarpon* gboma leaves and generic *S. melongena* eggplant. The French display comes from Health Canada’s French crop table, which distinguishes *S. aethiopicum* “aubergine écarlate” from *S. macrocarpon* “aubergine d’Afrique.” That is Canadian regulatory terminology, not a Québec consumer-language ruling; the Montréal-facing market source uses the English name “Garden Egg” in French copy. Keep the French display provisional pending Québec terminology review.

Do not include *S. aethiopicum* leaves, shoots, seeds, powders, prepared dishes, or other cultivar/plant-part products in this record. PROTA reports that West African uses and local names vary by zone and cultivar group; in particular, `djakattou`/`jakatu` and `nakati` do not describe this fruit-only picker identity consistently.

## Why this is a distinct unresolved gap

Kew accepts *Solanum aethiopicum* and places its cultivated origin in NE tropical Africa. PROTA describes it as a major tropical African vegetable and says that in humid West Africa it is grown mainly for immature fruit. A primary Benin ethnobotanical study records edible-fruit use across 680 households and 92 villages. A Ghana study identifies the Gilo group as what is popularly called “garden eggs” and notes use of the fruit in soups and stews. Together these sources support a real, regionally grounded fruit identity rather than a mere alias for common eggplant.

The closest current row is generic `ingredient-ref-eggplant` (*S. melongena*); separate Chinese, Indian, and Thai eggplant rows also remain. `ingredient-ref-gboma-leaves` is a leaf identity for *S. macrocarpon*, a different species. The Ghana paper explicitly warns that “African eggplant” has been used for both *S. aethiopicum* and *S. macrocarpon*. The R499 review therefore correctly kept `garden egg` off the gboma-leaves row and cited a Nigerian study that uses the name for *S. aethiopicum*. R505 follows that boundary and proposes the currently missing fruit identity, not an alias or extension of R499.

Recent WP06 integrations were checked and are distinct: R478 kuka powder, R481 dried Gnetum leaves, R484 grains of Selim, R487 ugu leaves, R490 shiro powder, R493 calabash nutmeg, R496 African basil leaves, R499 gboma leaves, and R502 waterleaf. Waterleaf is *Talinum fruticosum* leaves; none of these is the garden egg fruit product. See the [R499 review](wp06-african-next-regional-review-r499-20261017.md), [R502 review](wp06-african-next-regional-review-r502-20261017.md), and [R500–R502 integration record](../batches/wp03-wp04-wp06-r500-r502-gap-review-integration-20261017/README.md).

## Live ownership and archive audit

Read-only checks covered the [active reference JSON](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms JSON](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identity candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), search implementation, and prior WP06 proposals, batches, and workflow entries. Snapshot fingerprints:

| Surface | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| Ingredient references | 1,783 rows | 581,970 | `239c64b203cb049a3e1182f9b713cdd7231c083a3f5a5ca1e4ef77783c8199bd` |
| Ingredient forms | 143 rows | 113,370 | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| Legacy candidates | 56 rows | 13,351 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| Research ledger | 2,140 records; 9,808 source entries | 10,016,916 | `2b8b6527045f0c3468cb604bc2b5c0741934a45a3e5a3b8090678a963ceb9950` |
| Manifest | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

At the proposal's pre-integration snapshot, case-, accent-, and punctuation-normalized exact/phrase checks across active reference names and aliases, form labels and match terms, and all legacy names and aliases found no owner for `garden egg`, `garden eggs`, `garden egg plant`, `scarlet eggplant`, `aubergine écarlate`, *Solanum aethiopicum*, `African eggplant`, `aubergine africaine`, `bitter tomato`, `tomate amère`, `djakattou`, `jakatu`, `nakati`, or `jiló`. The proposed reference ID and new source-ID prefix `WP06-AFRICA-GARDEN-EGG-R505-20261017-S` were also unowned before integration.

The phrase “garden egg” is present in the ledger and archive only as R499 boundary evidence: existing `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S06` points to a Nigerian paper whose title identifies *S. aethiopicum* as garden egg plant. The archive name search returns only the [R499 proposal](wp06-african-next-regional-review-r499-20261017.md) and its [R497/R499 integration README](../batches/wp03-wp04-wp06-r497-r499-gap-review-integration-20261017/README.md); neither proposes a garden-egg reference. R499 explicitly declines garden egg as a gboma alias. No separate focused garden-egg proposal or integration was found.

The current ledger has 8,303 distinct source IDs and 7,013 distinct URLs. Its global source-ID→URL audit found zero IDs attached to multiple URLs. New R505 IDs S01–S08 below each own one previously unregistered URL. Reuse the existing `WP03-FENUGREEK-FORMS-R350-20261016-S01` for Health Canada’s already-registered URL, and reuse `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S06` for the already-registered FUNAAB paper. Do not create duplicate URL records. Both reused IDs retain their existing one-URL ownership.

## Bilingual naming and alias boundary

| Phrase | Treatment | Evidence and boundary |
|---|---|---|
| `garden egg` | English display | PROTA and Ghana’s primary study use it for the West African fruit product; Montréal Public Markets also names “Garden Egg” in French-language market copy. |
| `garden eggs` | English alias | Ghana study uses the plural for the Gilo group. The singular display remains the canonical name. |
| `scarlet eggplant` | English alias | PROTA and the Benin study use it for *S. aethiopicum*. |
| *Solanum aethiopicum* | Evidence only; keep in the research ledger | Accepted taxon in Kew. The catalog plan and workflow reserve scientific names for research artifacts unless the schema is extended. |
| `aubergine écarlate` | French display, provisional | Listed by Health Canada beside *S. aethiopicum*. No OQLF entry for this product term was located in targeted searches. Keep the distinction between federal regulatory terminology and Québec culinary preference explicit. |
| `African eggplant` / `aubergine africaine` | Evidence only; do not alias | The Ghana study says “African eggplant” can refer to both *S. aethiopicum* and *S. macrocarpon*. A broad query could pull this fruit identity and the existing gboma-leaves record together without preserving the plant-part distinction. |
| `bitter tomato` / `tomate amère` | Evidence only; do not alias | PROTA lists these names, but the wording is less useful for Québec ingredient search and is not needed for the species-qualified identity. Avoid a misleading tomato query. |
| `djakattou`, `jakatu`, `nakati` | Do not alias | PROTA associates these names with other zones, cultivar groups, and/or leaf uses. This proposal covers the West African garden-egg fruit product only. |
| `jiló` | Do not alias | PROTA lists this Brazilian product name; it is outside the West African/Québec alias scope. |
| `eggplant` / `aubergine` | Do not add as aliases | Generic forms already resolve to their current eggplant rows. The French display naturally remains discoverable for the broad `aubergine` query; the projection below records the extra result. |
| `garden egg plant` | Do not alias | The Nigerian study’s title names the plant. The food display and plural alias cover the fruit ingredient without storing a plant-level phrase. |

Do not make `garden egg` an alias of generic eggplant, gboma leaves, or waterleaf. Keep the English common name and French regulatory term as separate localized displays; the names remain bilingual-searchable under the shared search implementation.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): case/accent/ligature folding, punctuation normalization, complete phrase matches before partial fallback. Scientific names remain in research artifacts rather than alias arrays, consistent with the catalog plan and workflow. These are static results from the live references and proposed terms, not a runtime UI test.

| Query | Current results | With proposal |
|---|---:|---:|
| `garden egg`, `garden eggs`, `scarlet eggplant`, `aubergine écarlate` | 0 | 1: proposed garden-egg row |
| *Solanum aethiopicum* | 0 | 0; scientific-name search stays in research artifacts |
| `African eggplant`, `aubergine africaine` | 0 | 0; intentionally unassigned |
| `eggplant` | 5, including generic, Chinese, Indian, Thai, and gboma leaves | 6, plus garden egg |
| `aubergine` | 4, including generic, Chinese, Indian, and Thai eggplant | 5, plus garden egg through its French display |
| `eggplant leaves` | 1: gboma leaves | 1: gboma leaves |

The supported garden-egg name queries return only the proposed row, while the scientific-binomial query remains unassigned in the picker. Broad `eggplant` and `aubergine` queries gain one expected, distinct result. `eggplant leaves` stays scoped to gboma leaves.

## Recipe corpus audit

The complete manifest-listed corpus contains 114 files and 1,123 ingredient rows, totaling 753,988 recipe-file bytes. Its SHA-256 fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`, computed in manifest order by hashing each relative recipe path, a NUL byte, its exact file bytes, and a NUL byte.

All recipe files and ingredient-row strings were scanned for the candidate and boundary terms listed above, including *Solanum aethiopicum*, the accepted and rejected common names, and the West African leaf-name boundaries. The scan found zero candidate-related full-file hits and zero ingredient-row hits. No current recipe demand, recipe link, quantity, or relink is proposed. This result applies to this bundled manifest snapshot only.

## Measurement and substitution findings

The only located direct density result was a 2020 study reporting `1.05 g/mL` for raw garden egg material collected at Mojere market in Ado-Ekiti, Nigeria. The paper says a 10 g sample was measured by displacement in distilled water in a volumetric cylinder, in triplicate, but does not identify cultivar group or fruit maturity. An indexed page for the same title presents conflicting journal metadata; treat the pages as one paper, not independent confirmation. Preserve the reported value only as a source-specific research observation; do not set `defaultDensity`, a portion weight, count weight, cup/spoon mapping, or any general conversion from it. No reviewed source provides a recipe-grade volume measure or representative count weight. Proposed ledger measurement state: `blocked_pending_evidence`; active reference fields remain `defaultDensity: null` and `unitMappings: []`.

PROTA says that African eggplant fruits may be replaced with common eggplant in dishes. This is a qualitative statement without named dishes, cultivar, preparation state, quantity/ratio, role, or expected result. Record at most a `blocked_pending_evidence` source finding; do not activate a global or contextual substitution rule, replacement link, warning, or quantity adjustment. No form conversion, package yield, or recipe-line link is supported. Proposed ledger substitution state: `blocked_pending_evidence`.

## Source register and URL ownership

New source IDs S01–S08 are recorded in the ledger, and each maps to exactly one URL. The existing Health Canada and FUNAAB IDs are reused as shown.

| Source ID | Source and claim used | Limit / ownership |
|---|---|---|
| `WP06-AFRICA-GARDEN-EGG-R505-20261017-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Solanum aethiopicum*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:818158-1/general-information). Accepted name and cultivated origin in NE tropical Africa. | Taxonomy/range only, not culinary or Québec naming evidence. Added to the ledger under R505. |
| `WP06-AFRICA-GARDEN-EGG-R505-20261017-S02` | PROTA / Pl@ntUse, [French *Solanum aethiopicum* account](https://plantuse.plantnet.org/fr/Solanum_aethiopicum_%28PROTA%29). Lists `aubergine écarlate`, describes West African immature-fruit use, and documents differences in fruit/leaf uses and local names by zone. | Regional agricultural reference; not a Québec terminology ruling. Added to the ledger under R505. |
| `WP06-AFRICA-GARDEN-EGG-R505-20261017-S03` | PROTA / Pl@ntUse, [English *Solanum aethiopicum* account](https://plantuse.plantnet.org/en/Solanum_aethiopicum_%28PROTA%29). Supports `garden egg`, `scarlet eggplant`, edible fruit use, and the qualitative note that African eggplant fruit can be replaced by common eggplant in dishes. | The substitute statement lacks dish/form/ratio scope; no runtime rule follows. Separate language-page URL, therefore separate source ID. Added to the ledger under R505. |
| `WP06-AFRICA-GARDEN-EGG-R505-20261017-S04` | Aguessy et al., “Ethnobotanical characterization of scarlet eggplant (*Solanum aethiopicum* L.) varieties cultivated in Benin (West Africa),” *Journal of Agriculture and Food Research* 5 (2021), [DOI](https://doi.org/10.1016/j.jafr.2021.100173). Abstract describes edible fruits, 680 households across 92 villages, and 60 local cultivars. | Primary field research supports food identity and regional importance; medicinal statements and survey percentages are outside this review. Added to the ledger under R505. |
| `WP06-AFRICA-GARDEN-EGG-R505-20261017-S05` | Nkansah, “Some physiological features of the African eggplant, *Solanum aethiopicum* group ‘Gilo’,” *Scientia Horticulturae* 90 (2001), 181–186, [DOI](https://doi.org/10.1016/S0304-4238(00)00254-5). Identifies the Gilo group as “garden eggs” in Ghana, notes soup/stew fruit use, and explicitly says “African eggplant” has been applied to both *S. aethiopicum* and *S. macrocarpon*. | Primary Ghana study; fruit-use/name context and ambiguity only, not preparation ratios or modern market survey. Added to the ledger under R505. |
| `WP06-AFRICA-GARDEN-EGG-R505-20261017-S06` | Marchés publics de Montréal, [“Les légumes du marché qui évoluent”](https://www.marchespublics-mtl.com/fr/nouvelles/les-legumes-du-marche-qui-evoluent), 16 June 2025. French-language local market article names “la Garden Egg” among small African aubergines in West African/Caribbean cooking. | Québec market context for the borrowed English term; it does not identify the species or establish a French equivalent. Added to the ledger under R505. |
| `WP06-AFRICA-GARDEN-EGG-R505-20261017-S07` | Adekeye et al., “Osmotic Dehydration of Garden Egg (*Solanum aethiopicum*): The Shrinkage and Mass Transfer Phenomena,” *Journal of Analytical Techniques and Research* 2(1) (2020), [DOI](https://doi.org/10.26502/jatri.009). Reports 1.05 g/mL and a market-sample displacement method performed in triplicate. | Research-only market sample with cultivar/maturity unreported; not a default density. Added to the ledger under R505. |
| `WP06-AFRICA-GARDEN-EGG-R505-20261017-S08` | Walsh Medical Media, [indexed copy of the garden-egg dehydration article](https://www.walshmedicalmedia.com/open-access/osmotic-dehydration-of-garden-egg-solanum-aethiopicum-the-shrinkage-and-mass-transfer-phenomena-47553.html). Reviewed only to check bibliographic consistency with S07. | The page labels the same title under a different journal heading. It is not independent confirmation and is not used to set any catalog value. Added to the ledger under R505. |
| `WP03-FENUGREEK-FORMS-R350-20261016-S01` (reuse existing) | Health Canada, [French residue-chemistry crop groups](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html), crop group 8-09 and subgroup 8-09B. Lists *S. aethiopicum* as `aubergine écarlate`, separately from *S. macrocarpon* `aubergine d’Afrique` and *S. melongena* `aubergine`. | Regulatory crop terminology, not OQLF or Québec consumer preference. URL already has ledger owners; use the existing R350 source ID and do not allocate a new one. |
| `WP06-AFRICA-GBOMA-LEAVES-R499-20261017-S06` (reuse existing) | Oyedoyin et al., [Nigerian garden-egg accession study](https://www.journal.funaab.edu.ng/index.php/JAgSE/article/view/2105?articlesBySimilarityPage=7). Its title attaches “garden egg plant” to *S. aethiopicum*. | Reuse as boundary evidence only. This exact URL and source ID already belong to R499; do not register a duplicate. |

## Integrated ledger fields and boundary

The integration added only the reference identity and its evidence record:

- Reference: ID/name/category/aliases exactly as in the recommendation; do not put the scientific name into an alias; `defaultDensity: null`; `unitMappings: []`.
- Ledger identity: `recordType: ingredient_reference`, `identityState: verified`, `measurementState: blocked_pending_evidence`, `substitutionResearchState: blocked_pending_evidence`.
- Measurement note: the ledger retains one study-specific `mass_density` observation for the 1.05 g/mL local-market sample, including the displacement method and sample/cultivar limits under S07. It is not copied into the active reference density or a unit mapping. S08 is a metadata-audit source, not corroboration.
- Substitution note: one blocked finding retains PROTA’s unscoped fruit-to-common-eggplant statement under S03 with no replacements or runtime rule.
- Add no forms, recipe links, count weights, package yields, conversions, quantity adjustments, or active substitutions.

The [catalog workflow](../ingredient-catalog-workflow.md), [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), and roadmap now record the integration. The bundled recipe files and recipe links did not change.

## Integration validation

- Source IDs S01–S08 each map to one URL; the Health Canada and FUNAAB URL owners are reused as listed above. The full ledger source-ID-to-URL audit has no multi-URL conflicts.
- Static duplicate checks covered references, forms, legacy candidates, and ledger record IDs. Archive checks covered prior proposals, batches, and workflow entries.
- The full 114-recipe scan and picker projection found no candidate-specific recipe demand; no recipe link or active numeric behavior was added.
- UTF-8 decoding succeeded without a BOM; no mojibake markers or trailing whitespace were found, and local Markdown links resolve.
- No software tests, build, emulator, or deployment were run because the changes add database JSON data under `AGENTS.md`; the generated ingredient index was refreshed from the canonical package.
