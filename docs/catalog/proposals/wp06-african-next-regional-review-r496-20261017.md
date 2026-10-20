# WP06 African regional gap review R496 — African basil leaves (scent leaf)

- **Date:** 2026-10-17.
- **Status:** Proposal only. This review writes only this file; no shared catalog, form, ledger, recipe, plan, roadmap, manifest, workflow, generated file, or code was changed.
- **Scope:** One *Ocimum gratissimum* leafy-herb identity, with active-owner, archive, picker, and full bundled-recipe checks.
- **Source-ID prefix:** `WP06-AFRICA-SCENT-LEAF-R496-20261017-S`. The prefix and proposed reference ID were checked against the live ledger and proposal/batch archive before drafting.
- **Recommendation:** Add identity-only `African basil leaves / feuilles de basilic africain` as `ingredient-ref-african-basil-leaves` in `HERB`, with English aliases `scent leaf` and `scent leaves`. Keep the French display provisional pending a Québec-specific terminology source. Keep it distinct from common basil (*O. basilicum*), holy basil, Thai basil, and other *Ocimum* species. Add no forms, measurements, density, mappings, conversions, yields, recipe links, or substitution evidence/rules. Keep local-language names and botanical names outside the unscoped picker aliases.

## Why this is an open regional gap

Section 05 of the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9583) still leaves North, West, Central, Horn, East, and Southern African coverage open. Recent R478, R481, R484, R487, R490, and R493 work covered baobab-leaf powder, dried *Gnetum*, grains of Selim, ugu leaves, shiro powder, and calabash nutmeg. None covers *Ocimum gratissimum*. This is one culinary leaf identity evidenced in Benin and Nigeria, not a claim of complete West African or African ingredient coverage. Section Z's separate sauces, pastes, fermented seasonings, palm preparations, groundnut products, and condiments review remains open.

The evidence supports a named edible leaf identity: a University of Abomey-Calavi field study calls *O. gratissimum* `basilic africain`, describes its leaves as a green leafy vegetable used in Benin and West Africa, identifies `tchayo` as the Fon name in Benin, and explicitly distinguishes the plant from ordinary *O. basilicum*. A University of Benin repository study title and abstract use `scent leaves` / `scent leaf` for *O. gratissimum* in a Nigerian food context. Health Canada's French crop-group table separately lists fresh and dried African basil leaves (*O. gratissimum*) and ordinary basil leaves (*O. basilicum*). Together these sources support one species-bounded herb reference and clear product separation. They do not establish a Canadian retail grade, regional prevalence, a universal local-name set, culinary measurements, or an interchangeable replacement for common basil. [S01–S03; existing S05]

## Live package snapshot and ownership audit

Counts and hashes were refreshed from the shared worktree on 2026-10-17. The manifest-ordered recipe fingerprint hashes each UTF-8 relative path, a NUL byte, the exact recipe bytes, and another NUL byte.

| Artifact | Live count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,772 references | `7f958e6acce3abd06d08f1c44d32e019d9ed7ed5874f228a6eb50c8f519add9a` |
| `ingredient-forms.v1.json` | 143 forms | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| `legacy-import-identities.v1.json` | 56 candidates | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,130 records; 9,745 source entries; 8,254 distinct source IDs; 6,967 distinct URLs | `d13ff4f46133680c0c7bab58599bfde2c160a314e95257a009dffbbde04a391c` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,988 aggregate bytes | `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

The target path, `ingredient-ref-african-basil-leaves`, and the R496 source-ID prefix were absent before this draft. Exact phrase checks across active references, forms, legacy candidates, and ledger found no owner for `African basil leaves`, `African basil`, `scent leaf/leaves`, *Ocimum gratissimum*, `basilic africain`, `feuilles de basilic africain`, or the locally scoped `tchayo`, `efinrin`, `efirin`, `nchanwu`, `nchuanwu`, and `nunum` terms. No focused African-basil or scent-leaf proposal was found in the proposal/batch archive. Earlier regional reviews mention other *Ocimum* products or ordinary basil only as separate examples; they do not assign this species.

The nearest active references are:

| Existing owner | Current display and aliases | Boundary |
|---|---|---|
| `ingredient-ref-basil` | `basil / basilic`; EN `basil leaves`; FR `feuilles de basilic frais` | Ordinary basil. OQLF's GDT pairs `basilic` with `sweet basil` and *O. basilicum* [S04]. |
| `ingredient-ref-dried-basil` | `dried basil / basilic séché` | Dried ordinary basil. |
| `ingredient-ref-holy-basil` | `holy basil / basilic sacré`; EN `sacred basil`, `tulsi`, `kra prao`; FR `tulsi` | Separate species and regional names. |
| `ingredient-ref-thai-basil` | `Thai basil / basilic thaï` | Separate species/product identity. |
| `ingredient-ref-pesto` | `pesto / pesto`; EN `basil pesto`; FR `pesto au basilic` | Prepared sauce, not a leafy herb. |

No basil-related ingredient forms were found. The current `ingredient-ref-basil` ledger row is unreviewed with no source entries; it does not resolve the more specific species identity. The exact Health Canada French URL below is already owned in the ledger by the reusable source ID `WP03-FENUGREEK-FORMS-R350-20261016-S01`, including on both fresh- and dried-fenugreek-leaf form records. Other catalog records also reuse that URL. Reuse that existing ID and URL if integrated; do not create a duplicate source entry or source ID. The four other source URLs below had no exact URL owner in the live ledger at the time of review.

## Proposed identity and regional/product boundaries

| Proposed reference ID | English display | French display | Category | Aliases |
|---|---|---|---|---|
| `ingredient-ref-african-basil-leaves` | `African basil leaves` | `feuilles de basilic africain` (provisional) | `HERB` | EN: `scent leaf`, `scent leaves`; FR: none |

The identity is the edible leaves of accepted species *O. gratissimum*. The French name `basilic africain` is attested by the Benin field study and the Health Canada commodity table; the proposed phrase `feuilles de basilic africain` makes the ingredient part explicit. The OQLF GDT entry reviewed for this packet only supports unqualified `basilic` for *O. basilicum*, not a Québec-preferred name for *O. gratissimum*. Keep the French display provisional rather than presenting it as an OQLF term. [S02, S04, existing S05]

| Term or product | Disposition | Boundary |
|---|---|---|
| African basil leaves / *Ocimum gratissimum* | Add one identity-only `HERB` reference. | Scope to the culinary leaf part. Kew accepts the species; the Benin field study and Canadian crop table attach the food name to its leaves. This does not make every use of the whole plant a recipe ingredient. [S01–S02; existing S05] |
| `scent leaf` / `scent leaves` | Add as English search aliases. | The University of Benin repository's primary-study title and abstract use these phrases for *O. gratissimum* in a Nigerian food context. The source supports the name and edible-product context, not any microbial-safety claim. [S03] |
| `basilic africain` / `feuilles de basilic africain` | Use a provisional French display only. | The descriptive name is source-attested in Benin and in Health Canada's official French crop classification, but no product-specific OQLF or Québec retail term was located. [S02, S04; existing S05] |
| Ordinary basil / `basilic`, *O. basilicum* | Keep on `ingredient-ref-basil`; do not merge. | OQLF pairs `basilic` with *O. basilicum*. Health Canada lists basil leaves from this species separately from African basil leaves. [S04; existing S05] |
| Holy basil, Thai basil, lemon basil, American basil, and other *Ocimum* species | Keep on their own current identities or outside this proposal. | A genus match does not establish one culinary identity. Health Canada itself lists several *Ocimum* leaf commodities separately. [existing S05] |
| Fresh and dried *O. gratissimum* leaves | Do not add forms in this proposal. | Health Canada's pesticide crop-group table distinguishes fresh and dried leaf commodities. That regulatory classification does not establish retail SKU forms, recipe behavior, a fresh-to-dried ratio, or a conversion. [existing S05] |
| `tchayo` | Do not activate as a global alias. | The Benin source identifies it specifically as a Fon name in Benin; this packet does not establish its reach outside that language/region or a Québec display. [S02] |
| `efinrin`, `efirin`, `nchanwu`, `nchuanwu`, `nunum`, botanical names, flowers, seeds, essential oil, and prepared products | Do not add as aliases, forms, or separate rows here. | The reviewed sources do not verify these terms as globally scoped aliases for this leaf ingredient or define the other plant parts and processed products as the same product. Review each name or product separately before activation. |

If accepted, the reference row would be:

```json
{
  "id": "ingredient-ref-african-basil-leaves",
  "nameFr": "feuilles de basilic africain",
  "nameEn": "African basil leaves",
  "aliasesFr": [],
  "aliasesEn": ["scent leaf", "scent leaves"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "HERB"
}
```

## Live phrase-first picker projection

The projection follows `IngredientReferenceSearchIndex`: normalize case, accents, punctuation, and spacing; first return all references where the full query appears as a contiguous word phrase within a name or alias; only if there are no phrase matches does search fall back to substring matching. The proposed fields were added only for this read-only projection.

| Query | Current result | With proposed row |
|---|---|---|
| `African basil leaves` | No result | `ingredient-ref-african-basil-leaves` |
| `African basil` | No result | `ingredient-ref-african-basil-leaves` |
| `scent leaf` | No result | `ingredient-ref-african-basil-leaves` |
| `scent leaves` | No result | `ingredient-ref-african-basil-leaves` |
| `feuilles de basilic africain` | No result | `ingredient-ref-african-basil-leaves` |
| `basilic africain` | No result | `ingredient-ref-african-basil-leaves` |
| `basil leaves` | `ingredient-ref-basil` | `ingredient-ref-basil`, `ingredient-ref-african-basil-leaves` |
| `basil` | `ingredient-ref-basil`, `ingredient-ref-dried-basil`, `ingredient-ref-holy-basil`, `ingredient-ref-pesto`, `ingredient-ref-thai-basil` | Those five plus `ingredient-ref-african-basil-leaves` |
| `basilic` | `ingredient-ref-basil`, `ingredient-ref-dried-basil`, `ingredient-ref-holy-basil`, `ingredient-ref-pesto`, `ingredient-ref-thai-basil` | Those five plus `ingredient-ref-african-basil-leaves` |
| `Ocimum gratissimum` | No result | No result |
| `tchayo` or `efinrin` | No result | No result |

Specific names improve discovery while broad `basil`/`basilic` queries become six-result lists. `basil leaves` becomes a two-result query because both ordinary and African basil leaf phrases genuinely match it; the proposed display keeps the species qualifier visible. Botanical and local-language names remain unsearchable until there is evidence and an editorial decision to add them as aliases.

## Bundled recipe demand

The full manifest-listed corpus was parsed: **114 recipe files and 1,123 ingredient rows**. Candidate-specific scans of serialized recipe content and ingredient rows found zero hits for `African basil`, `African basil leaves`, `scent leaf/leaves`, `Ocimum gratissimum`, `basilic africain`, `feuilles de basilic africain`, `tchayo`, `efinrin`, `efirin`, `nchanwu`, `nchuanwu`, and `nunum`. No recipe link, relink, or candidate-specific recipe demand is proposed.

The broader basil search found four ordinary-basil ingredient rows across three recipes:

| Recipe | Ingredient line | Current reference | Disposition |
|---|---|---|---|
| 043, Italian seasoning | `2 tbsp dried basil` | `ingredient-ref-dried-basil` | Keep linked; no *O. gratissimum* identity is named. |
| 074, Meatloaf | `1 tsp dried basil` | `ingredient-ref-dried-basil` | Keep linked; no *O. gratissimum* identity is named. |
| 096, Pizza sauce | `1 tsp dried basil` | `ingredient-ref-dried-basil` | Keep linked; no *O. gratissimum* identity is named. |
| 096, Pizza sauce | `10 fresh basil leaves` | `ingredient-ref-basil` | Keep linked to ordinary basil; neither the recipe nor its link identifies African basil. |

The scan establishes no current bundled demand; it is not a general measure of market or regional demand.

## Evidence states and data limits

If integrated, create a verified identity ledger record with sources S01–S04 and the reused Health Canada source ID. Leave `measurementState` and `substitutionResearchState` as `not_yet_researched`: the consulted sources do not provide a kitchen measure, density, conversion, edible-portion yield, or a culinary substitution study, and this packet did not conduct a separate measure or substitution review. Add no measurement observations, substitution findings, forms, mappings, or active rules.

Proposed ledger record (reuse the existing Health Canada source ID rather than defining a new one):

```json
{
  "recordId": "ingredient-ref-african-basil-leaves",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP06-AFRICA-SCENT-LEAF-R496-20261017-S01",
      "url": "https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:452969-1/general-information",
      "title": "Royal Botanic Gardens, Kew, Plants of the World Online: Ocimum gratissimum L.",
      "accessedOn": "2026-10-17",
      "locator": "Accepted-name record; general-information entry.",
      "supports": "Confirms the accepted species identity and reports food use generally. It is taxonomic and does not establish a regional food name or culinary amount.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP06-AFRICA-SCENT-LEAF-R496-20261017-S02",
      "url": "https://bec.uac.bj/uploads/publication/78c3ec8553ae1eef9384039bd895b2a1.pdf",
      "title": "GBESSO et al., Production et commercialisation du basilic africain (Ocimum gratissimum L.) dans l’arrondissement de Ouèdo, commune d’Abomey-Calavi, Revue scientifique MIRD, 2023.",
      "accessedOn": "2026-10-17",
      "locator": "Sections 3.1 and 3.3.1; PDF pp. 9–10 and 12 (printed pages 16–17 and 19).",
      "supports": "Identifies O. gratissimum as basilic africain, describes its leaves as a leafy vegetable used in Benin and West Africa, names tchayo specifically as Fon in Benin, distinguishes O. basilicum, and describes local use in sauce. This local study does not define a continent-wide term or a standard measure.",
      "sourceKind": "other",
      "versionOrDate": "Field study in Ouèdo, 2020–2021; published 2023."
    },
    {
      "sourceId": "WP06-AFRICA-SCENT-LEAF-R496-20261017-S03",
      "url": "https://repository.uniben.edu/evaluation-microbial-quality-fresh-scent-leaves-ocimum-gratissimum-obtained-three-markets-benin",
      "title": "University of Benin Repository, An Evaluation of the Microbial Quality of Fresh Scent Leaves (Ocimum gratissimum) Obtained from Three Markets in Benin-City Nigeria.",
      "accessedOn": "2026-10-17",
      "locator": "Repository record title, keywords, and abstract.",
      "supports": "Uses scent leaf/leaves for O. gratissimum and describes scent leaf as a common vegetable and spice in Nigerian diets. The study’s microbial-quality and safety claims are not used.",
      "sourceKind": "other",
      "versionOrDate": "Undergraduate project, 2021."
    },
    {
      "sourceId": "WP06-AFRICA-SCENT-LEAF-R496-20261017-S04",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095284/basilic",
      "title": "Office québécois de la langue française, GDT: basilic.",
      "accessedOn": "2026-10-17",
      "locator": "Preferred term, English equivalent, and Latin equivalent.",
      "supports": "Pairs preferred Québec French basilic with sweet basil and O. basilicum. It supports keeping unqualified basil/basilic separate; it does not attest a Québec term for O. gratissimum.",
      "sourceKind": "regional_authority",
      "versionOrDate": "Last updated 1982."
    },
    {
      "sourceId": "WP03-FENUGREEK-FORMS-R350-20261016-S01",
      "url": "https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html",
      "title": "Santé Canada, Groupes de cultures et propriétés chimiques de leurs résidus.",
      "accessedOn": "2026-10-17",
      "locator": "Group 25, fine-herb commodity list: basilic africain, fresh and dried leaves, O. gratissimum; separate basil leaves, O. basilicum.",
      "supports": "Provides a Canadian French crop classification for fresh and dried African basil leaves and distinguishes them by species from ordinary basil. This regulatory table is not a culinary retail, conversion, or Québec terminology standard.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "The accepted species, leaf-food use, and a distinct regional name are independently supported; keep the identity limited to O. gratissimum leaves and the proposed French wording provisional.",
      "sourceIds": [
        "WP06-AFRICA-SCENT-LEAF-R496-20261017-S01",
        "WP06-AFRICA-SCENT-LEAF-R496-20261017-S02",
        "WP06-AFRICA-SCENT-LEAF-R496-20261017-S03",
        "WP06-AFRICA-SCENT-LEAF-R496-20261017-S04",
        "WP03-FENUGREEK-FORMS-R350-20261016-S01"
      ]
    }
  ]
}
```

No Health Canada measures, farm-production amounts, or microbial-study values are transferable to a recipe ingredient. The Health Canada fresh/dried crop classes do not justify forms or a conversion. No general, contextual, or recipe-line substitution rule is proposed.

## Sources and limits

Sources were accessed on 2026-10-17. S01–S04 are proposal-local; the Health Canada URL and source ID are reused from the active ledger as explained above.

| ID | Source and claim used | Limits |
|---|---|---|
| **WP06-AFRICA-SCENT-LEAF-R496-20261017-S01** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Ocimum gratissimum*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:452969-1/general-information). Accepts the species and reports food use generally. | Taxonomic/food-use context only; it does not establish the specific common name or a culinary amount. |
| **WP06-AFRICA-SCENT-LEAF-R496-20261017-S02** | GBESSO, F. K. et al., [Production et commercialisation du basilic africain (*Ocimum gratissimum* L.) dans l’arrondissement de Ouèdo, commune d’Abomey-Calavi](https://bec.uac.bj/uploads/publication/78c3ec8553ae1eef9384039bd895b2a1.pdf), University of Abomey-Calavi / MIRD, 2023. | Field study in one Benin arrondissement. Sections 3.1 and 3.3.1 support the species, leaf-food, and local naming statements. `Tchayo` is explicitly localized to Fon in Benin; it is not proposed as an unscoped alias. Local production or market amounts are not recipe quantities. |
| **WP06-AFRICA-SCENT-LEAF-R496-20261017-S03** | Ubawuike, Hope Chizoba, [An Evaluation of the Microbial Quality of Fresh Scent Leaves (*Ocimum gratissimum*) Obtained from Three Markets in Benin-City Nigeria](https://repository.uniben.edu/evaluation-microbial-quality-fresh-scent-leaves-ocimum-gratissimum-obtained-three-markets-benin), University of Benin Repository, 2021. | Undergraduate research project. Used only for its species-linked `scent leaf/leaves` name and food context, not its microbial results or safety framing. |
| **WP06-AFRICA-SCENT-LEAF-R496-20261017-S04** | Office québécois de la langue française, [GDT: basilic](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095284/basilic). | Pairs `basilic` with *O. basilicum*; it supplies no preferred Québec term for *O. gratissimum*. |
| **WP03-FENUGREEK-FORMS-R350-20261016-S01** (existing; reuse) | Santé Canada, [Groupes de cultures et propriétés chimiques de leurs résidus](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html). | Under fine-herb group 25, separately lists fresh/dried leaves of African basil (*O. gratissimum*) and basil (*O. basilicum*). This crop-residue classification is not a retail, recipe-measure, or terminology ruling. Do not add a duplicate source ID for this URL. |

## Root-review recommendation

Accept one identity-only `African basil leaves / feuilles de basilic africain` reference in `HERB`, with only the English aliases `scent leaf` and `scent leaves`; keep the French display provisional pending Québec-specific product terminology. Keep *O. gratissimum* leaves separate from ordinary *O. basilicum* basil, holy/Thai basil, other species, and non-leaf products. Reuse the existing Health Canada source ID and URL; add no new forms, measures, conversions, yields, recipe links, or substitution findings/rules. The exact picker phrases become discoverable, while broad `basil` and `basilic` results grow from five to six and `basil leaves` grows from one to two. The bundled corpus has no candidate-specific demand. Keep WP06 Section 05 and Section Z open for broader regional and condiment coverage.

This proposal changed only this Markdown file. No software tests, builds, emulator checks, or deployment were run.
