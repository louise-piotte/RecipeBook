# WP02 B3 — Resistant green-banana starch identity review (R80)

- **Status:** Proposal review. This review changed only this proposal file. Root integrated the recommended reference and evidence record after the pre-integration snapshot; no shared catalog, ledger, plan, checklist, roadmap, generated file, recipe, or application file was changed by this review.
- **Reviewed checklist line:** `[ ] Water-chestnut flour and other documented regional starches.` in Section 04. The parent line remains open.
- **Candidate:** The nonchemically modified starch fraction isolated from raw, unripe green-banana pulp.
- **Recommendation:** **Integrate one identity-only reference** with the source-backed bilingual names `resistant green banana starch / amidon résistant de bananes vertes`. Health Canada defines this source as starch or flour from raw unripe banana pulp processed by conventional physical procedures without chemical modification; its current bilingual accepted-fibre list provides the exact English and French wording. A primary study separately isolates raw starch from green Songkibab and Cavendish bananas, and a Canadian bilingual product sheet names resistant starch from green bananas in a food blend. These sources establish a real starch ingredient and a Canadian French term, rather than a starch claim alone or a flour synonym. The Canadian label is for a blend, not a standalone banana-starch package; the research studies do not establish a retail grade. Keep the row narrow, alias-free, and free of forms or active numeric/substitution data. [S01–S03, S05–S07]
- **Source-ID prefix:** `WP02-B3-GREEN-BANANA-STARCH-R80-20261013`. At the pre-integration snapshot, this prefix had not appeared in the ledger, proposal archive, or batch archive.

## Identity and product boundary

The row would represent the named **starch fraction physically separated from raw, unripe green-banana pulp**, not banana flour. Health Canada describes the accepted fibre source as either resistant green-banana starch or green-banana flour and gives one conventional, nonchemically modified raw-pulp process scope for those listed sources. That shared fibre entry does not make the two ingredient identities synonyms. Kim and Lee isolate banana starch from green Songkibab and Cavendish bananas by filtering and centrifuging the pulp mixture, then drying the starch sediment. Their paper discusses green-banana starch as a food-industry ingredient and thickener. [S01–S03]

The proposed English and French display names follow Health Canada’s exact bilingual accepted-fibre wording: `resistant green banana starch` and `amidon résistant de bananes vertes`. ZinoBiotic+’s Canadian bilingual product sheet independently uses `resistant starch from corn, green banana and potatoes` / `amidon résistant provenant du maïs, de bananes vertes et de pommes de terre` in its blend ingredient statement. This confirms Canadian French product-language use, but not a standalone package or the amount of banana-derived starch in the blend. OQLF prefers `amidon` for starch and reserves `fécule` for more specific use with underground organs; banana is a fruit, so the direct Canadian compound with `amidon` is appropriate. [S01–S02, S05–S07]

Keep these distinctions:

| Product or phrase | Decision |
|---|---|
| `resistant green banana starch / amidon résistant de bananes vertes` | Add as one source-bounded identity. It names an isolated starch product from unripe green-banana pulp. `Resistant` follows the Canadian terminology; it is not a claim that every starch from every banana cultivar has a fixed resistant-starch percentage. |
| `green banana flour / farine de banane verte` | Keep on `ingredient-ref-green-banana-flour`. Drying and milling whole pulp is not the starch-isolation process. Health Canada’s “or” joins two accepted fibre sources; it does not equate starch and flour. |
| `green plantain flour / farine de banane plantain verte` and `plantain flour / farine de plantain` | Keep on the existing green-plantain-flour identity and its exact aliases. They remain separate from this starch row. |
| `plantain starch` | Keep the existing `candidate-plantain-starch` hold unchanged. Do not alias this candidate to that hold or add a plantain term to the new row. The 2025 primary cultivar comparison treats dessert-banana and plantain starches as separate cultivar groups. [S09] |
| `banana starch` | Do not add an alias. The query will nevertheless match the contiguous phrase inside `resistant green banana starch` and return this one visibly qualified row. That broader lookup is acceptable for finding a source-qualified banana-starch ingredient; it does not make the row a generic identity or assign plantain starch to it. If the user intended the held plantain product or another banana-starch product, this row's full display keeps the green/resistant scope visible and does not resolve those separate identities. The 2024 noodle study uses starch it calls green-banana starch but identifies its raw material as *Musa paradisiaca*. Because that taxon is also used for plantain cultivars, use the study only as a narrow food-formulation observation; do not use it to broaden this row or resolve the separate plantain hold. [S04, S09] |
| `resistant starch` without a source | Do not attach as an alias. Other resistant starches, including corn and potato, remain separate identities. |
| Modified, autoclaved, acid-treated, or otherwise processed resistant-starch powders | Do not add as forms or aliases. Those are process-specific materials and are outside the source-bounded, nonchemically modified identity proposed here. |

The product evidence is sufficient for identity activation but does not establish one cultivar, a standalone Canadian retail SKU, or uniform starch functionality. The Songkibab/Cavendish study reports cultivar-specific properties. A different 2024 study reports extracted starch from *Musa paradisiaca* in instant noodles; since the plantain boundary is unresolved in the product label, that formulation is recorded as an adjacent research result only, not as a product definition or reusable rule. [S03–S04, S09]

## Pre-integration ownership, archive, and picker boundary

The ownership and query projection below describe the pre-integration state captured on 2026-10-13. Root integrated this proposal’s R80 row and evidence record after that snapshot; the pre-integration counts and hashes are preserved in the static-review section below so the review’s before/after projection remains clear.

| Pre-integration owner | Pre-integration wording and state | Boundary |
|---|---|---|
| `ingredient-ref-banana` | `banana / banane`; French alias `bananes`; category `FRUIT`. | Fresh banana identity only. The existing mashed-ripe-banana form is attached here and does not describe starch. |
| `ingredient-ref-green-banana-flour` | `green banana flour / farine de banane verte`; no aliases; `FLOUR_AND_STARCH`; `defaultDensity: null`; `unitMappings: []`. | Retain as flour; no starch term currently belongs to it. |
| `ingredient-ref-green-plantain-flour` | `green plantain flour / farine de banane plantain verte`; aliases `plantain flour / farine de plantain`; `FLOUR_AND_STARCH`. | Retain source and flour scope. Do not move its aliases. |
| `ingredient-ref-plantain` | `plantain banana / banane plantain`; category `FRUIT`. | Fresh plantain identity only. |
| `candidate-plantain-starch` | Existing unresolved ledger candidate. | Keep separate and unresolved; this proposal does not amend or supersede its Québec naming hold. |
| Proposed owner | `ingredient-ref-resistant-green-banana-starch` | No exact active reference, legacy-catalog entry, form, or ledger record owned this ID or the complete source phrase at the snapshot. No aliases are proposed. |

The proposals and batch archive have no prior focused decision on a green-banana-starch identity. The B4 green-banana/plantain flour review explicitly leaves isolated banana starch for a future product-source review. The B9 pregelatinized-green-banana-flour review keeps starch outside its flour-form scope. The existing plantain-starch hold explicitly preserves banana starch as a separate research concept. R77 Tacca/pia, R78 breadfruit, and R79 watermelon-seed reviews cover other materials. This proposal is the first to evaluate the green-banana-starch identity and its Canadian French source wording. [S09]

The picker uses phrase-first matching over canonical names and aliases, then partial matching. The following table compares the pre-integration results with the results after adding the exact proposed row and no aliases:

| Query | Pre-integration result | After R80 row | Boundary |
|---|---|---|---|
| `resistant green banana starch` | No result | New row only | Exact source-qualified product phrase. |
| `green banana starch` | No result | New row only | Phrase is contiguous in the proposed English display; no alias is needed. |
| `amidon résistant de bananes vertes` | No result | New row only | Exact Canadian French display. |
| `green banana` | `ingredient-ref-green-banana-flour` | Green-banana flour + new starch | A short source phrase returns both products. |
| `green banana flour` / `farine de banane verte` | Green-banana flour | Green-banana flour only | Existing flour identity remains exact and distinct. |
| `banana` | Five existing references: banana, banana blossom, banana ketchup, green-banana flour, and plantain banana | Those five plus the new starch row | Expected broad fruit-word query expansion; no fruit alias is added. |
| `banana starch` | No result | New row only | Contiguous phrase in the canonical name. The result remains visibly qualified as resistant and green-banana starch; this is a broad search hit, not a broad alias or equivalence claim. |
| `resistant starch` | No result | No result | Not contiguous in the canonical name; no generic resistant-starch alias. |
| `plantain starch` | No result; separate ledger hold is not searchable | No result | The new identity does not acquire the plantain name. |

The English query `banana starch` matches the proposed canonical name because those two words occur together. This is an acceptable phrase-first lookup for the source-qualified product; the picker result must continue to display the complete `resistant green banana starch` name. No `banana starch` alias is added, and the result does not stand in for the separate held plantain-starch candidate or every possible banana-starch material. The exact Canadian French phrase includes `résistant`; the shorter constructed query `amidon de bananes vertes` is not an alias and remains unmatched. Do not add it without separate source review. The generic query `amidon` remains a broad starch search.

## Pre-integration recipe demand

The pre-integration corpus scan covered all 114 manifest-listed recipe files and all 1,123 ingredient rows. Case-, accent-, punctuation-, and spacing-normalized searches found **zero full-recipe hits and zero ingredient-row hits** for `resistant green banana starch`, `green banana starch`, `banana starch`, `resistant starch`, `amidon résistant de bananes vertes`, `amidon résistant`, `amidon de bananes vertes`, and `plantain starch`.

There are three ordinary banana fruit ingredient rows linked to `ingredient-ref-banana` across two recipes: two lines in Air Fryer Baked Oats and one mashed-banana line in Chocolate Banana Bread. These lines do not create flour or starch demand. The corpus therefore supplies no candidate recipe link, measure, or recipe-specific substitution need.

## Forms, measurement, yield, and substitution evidence

- **Forms:** Add none. Extracted starch is a distinct product identity, not a form of the fresh-banana row or the whole-pulp flour row. No consumer form taxonomy is established for native, modified, pregelatinized, instant, or cooked starch products. [S01–S04]
- **Density and household measure:** No reviewed source supplies a reusable bulk density, grams per cup/spoon, or package-specific portion for standalone banana starch. The Canadian 180 g product sheet is for an eight-fibre blend; its per-scoop ingredient table does not state the green-banana-starch mass. Do not infer the amount from the blend total or scoop directions. [S05]
- **Extraction yield:** Thanyapanich et al. report 16.88% for Hom Khieo (*Musa acuminata*, AAA) and 22.73% for Namwa (*Musa sapientum*, ABB), based on peeled unripe fruit in their research extraction. These cultivar- and method-specific laboratory yields are not kitchen, edible-portion, package, or cooking yields. Do not add either number to the catalog or a generic yield conversion. [S08]
- **Resistant-starch assay:** Kim and Lee report in-vitro resistant-starch fractions for two raw research samples (Songkibab 83.6% and Cavendish 75.2%) and cooked samples (1.2% and 3.2%). Those assay results are cultivar-, method-, and cooking-state-specific; they are not a default composition value, measure, or guarantee that a recipe retains the same fibre properties. [S03]
- **Food-use formulation:** Islam et al. use alkali-steeped starch reported from raw green banana (*Musa paradisiaca*) in instant noodles. Their Table 1 lists 10, 15, or 20 g starch alongside 90, 85, or 80 g wheat flour, compared with a 100 g wheat-flour control. The table gives 5.88%, 8.82%, and 11.75% of the 170.2 g total raw formula; its note also says “20%” for the last level, which describes the percentage of the original 100 g wheat-flour amount replaced, not the total-formula percentage. This is one laboratory noodle formulation and is not a baking ratio, density, conversion, or general substitute rule. Because the article identifies *M. paradisiaca*, do not use it to collapse the product boundary with plantain starch. [S04, S09]
- **Heat and fibre wording:** Health Canada’s recommended no-high-temperature statement applies to maintaining the listed dietary-fibre properties. It is not a general recipe instruction for every starch product. The research sample assays also show that cooked and raw resistant-starch fractions differ substantially. Do not activate a cooking restriction or promise a resistant-starch amount. [S01–S03]
- **Substitutions and conversions:** Add no active form conversion, unit mapping, or contextual substitution rule. The single noodle experiment is source-specific, the source flour is not a fully specified catalog row, the taxon is ambiguous at the plantain boundary, and the bundle has no relevant recipe demand. Keep the study as a bounded research observation only; do not generalize its quantities to baking, thickening, or another starch. [S04, S09]

## Exact future JSON delta

Append this single object to `ingredient-references.v1.json`. This proposal does not apply it. The display strings use explicit Unicode escapes as required for bundled database JSON.

```json
{
  "id": "ingredient-ref-resistant-green-banana-starch",
  "nameFr": "amidon r\u00e9sistant de bananes vertes",
  "nameEn": "resistant green banana starch",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Add the following evidence record to `research-ledger.v1.json`. It records the verified identity and the absence of a reusable measurement. The formula in S04 is described in this proposal but is not stored as a reusable substitution finding because its cultivar boundary overlaps the separate plantain hold and its study wheat flour is not a precisely identified catalog ingredient.

```json
{
  "recordId": "ingredient-ref-resistant-green-banana-starch",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S01",
      "url": "https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-reviewed-accepted-dietary-fibres.html",
      "title": "Health Canada, List of Dietary Fibres Reviewed and Accepted by Health Canada's Food Directorate",
      "versionOrDate": "Updated June 2021",
      "accessedOn": "2026-10-13",
      "locator": "Table 1, Resistant starches: resistant green banana starch or green banana flour",
      "supports": "Names the English ingredient and defines the accepted source as raw unripe banana pulp processed by conventional physical procedures without chemical modification. The adjacent word 'or' does not make starch and flour synonyms.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S02",
      "url": "https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html",
      "title": "Santé Canada, Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments",
      "versionOrDate": "Mise à jour : juin 2021",
      "accessedOn": "2026-10-13",
      "locator": "Tableau 1, Amidons résistants: amidon résistant de bananes vertes ou farine de bananes vertes",
      "supports": "Provides the exact Canadian French ingredient wording and the same raw-unripe-pulp, conventional-physical-process scope. The recommended heat wording concerns retention of listed fibre properties.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S03",
      "url": "https://pmc.ncbi.nlm.nih.gov/articles/PMC10766918/",
      "title": "Kim and Lee, Characterization of green banana starch from 'Songkibab' species cultivated in the southern part of Korea",
      "versionOrDate": "2023; collection date 2024",
      "accessedOn": "2026-10-13",
      "locator": "Abstract; sections 2.2 and 3.4–3.5",
      "supports": "Primary study physically isolates starch from raw green Songkibab and Cavendish bananas and characterizes the isolated starch as a food-industry ingredient/thickener. Its cultivar-specific in-vitro resistant-starch assays are not a default composition value, measure, or substitution rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S04",
      "url": "https://cdn.most.gov.bd/image/678890c6e9641",
      "title": "Islam et al., Quality assessment and sensory evaluation of green banana starch enriched instant noodles",
      "versionOrDate": "Applied Food Research 4 (2024), 100431",
      "accessedOn": "2026-10-13",
      "locator": "Materials and methods 2.1–2.2; Table 1",
      "supports": "Reports alkali-steeped starch from raw green banana identified as Musa paradisiaca and uses it in one instant-noodle formulation. This is adjacent, taxonomically ambiguous food-use evidence; it does not define a dessert-banana-only identity or support a general substitution rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S05",
      "url": "https://zinzinowebstorage.blob.core.windows.net/product-sheets/ZinoBiotic-plus-en-fr-CAN.pdf",
      "title": "Zinzino, ZinoBiotic+ Canadian bilingual product sheet",
      "versionOrDate": "en-CA, 2022-09-08",
      "accessedOn": "2026-10-13",
      "locator": "Pages 1–2, ingredient statements in English and French",
      "supports": "A Canadian bilingual food-product sheet names resistant starch from green banana / amidon résistant provenant ... de bananes vertes in an eight-fibre blend. It is not a standalone banana-starch package and does not disclose the banana-specific mass.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S06",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon",
      "title": "Office québécois de la langue française, amidon (GDT)",
      "versionOrDate": "Updated 2026",
      "accessedOn": "2026-10-13",
      "locator": "Preferred term and note on fécule",
      "supports": "Supports amidon as the preferred general French term for starch and explains that fécule is more specifically used for starch contained in tubers or underground organs. It does not supply the compound name; the proposed compound is copied from Health Canada's French source.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S07",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297102/banane",
      "title": "Office québécois de la langue française, banane (GDT)",
      "versionOrDate": "Updated 1990",
      "accessedOn": "2026-10-13",
      "locator": "Preferred term and Latin-name pair",
      "supports": "Supports the Québec French plant/food term banane and pairs it with Musa spp.; it does not define a starch product or resolve cultivar distinctions.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S08",
      "url": "https://doi.org/10.3390/molecules26123637",
      "title": "Thanyapanich et al., Functional Properties of Banana Starch (Musa spp.) and Its Utilization in Cosmetics",
      "versionOrDate": "Molecules 26(12), 3637 (2021)",
      "accessedOn": "2026-10-13",
      "locator": "Abstract and extraction-yield results",
      "supports": "Reports research extraction yields of 16.88% for Hom Khieo and 22.73% for Namwa based on peeled unripe fruit. Cultivar/method-specific extraction yields do not support a kitchen, package, or cooking yield.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S09",
      "url": "https://doi.org/10.3390/horticulturae11101214",
      "title": "de Jesus Assis et al., Banana and Plantain Starches: Exploring Differences and Potential Applications",
      "versionOrDate": "Horticulturae 11(10), 1214 (2025)",
      "accessedOn": "2026-10-13",
      "locator": "Abstract and cultivar scope; Embrapa institutional record",
      "supports": "Compares isolated starches from four dessert-banana cultivars with three plantain cultivars and reports differences. It supports retaining the source boundary and not adding a plantain alias; it does not establish a retail grade or Québec product display.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add the identity-only resistant green-banana-starch reference with the exact bilingual Canadian wording. Keep it separate from green-banana flour and plantain starch. Add no aliases, forms, default density, unit mappings, recipe links, conversions, yields, or active substitutions. The Canadian blend confirms product-language use but does not disclose banana-specific mass; the research extraction yields and noodle formula remain sample-specific.",
      "sourceIds": [
        "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S01",
        "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S02",
        "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S03",
        "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S05",
        "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S06",
        "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S07",
        "WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S09"
      ]
    }
  ]
}
```

## Sources

Sources were checked online on 2026-10-13. These IDs were proposal-local when drafted; root included them in the live ledger during the later R80 integration.

| ID | Source and evidence | Limits |
|---|---|---|
| **S01 — `WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S01`** | Health Canada, [List of Dietary Fibres Reviewed and Accepted by Health Canada’s Food Directorate](https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-reviewed-accepted-dietary-fibres.html), Table 1, “Resistant starches.” | Exact English term and raw-unripe-pulp, conventional-physical-process scope. The list is a fibre-source reference, not a standalone retail specification. |
| **S02 — `WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S02`** | Santé Canada, [Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html), Tableau 1. | Exact Canadian French phrase `amidon résistant de bananes vertes`; the heat statement concerns fibre properties and is not a general recipe direction. |
| **S03 — `WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S03`** | Hyung-Min Kim and Byung-Hoo Lee, [“Characterization of green banana starch from ‘Songkibab’ species cultivated in the southern part of Korea”](https://pmc.ncbi.nlm.nih.gov/articles/PMC10766918/), 2023. | Primary raw-starch isolation from green Songkibab and Cavendish bananas; supports a distinct starch material and ingredient potential. Assays are research-sample-specific, not measures, density, or substitution ratios. |
| **S04 — `WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S04`** | Md. Faridul Islam et al., [“Quality assessment and sensory evaluation of green banana starch enriched instant noodles”](https://cdn.most.gov.bd/image/678890c6e9641), *Applied Food Research* 4 (2024), 100431. | Primary food formulation using extracted starch; reports *Musa paradisiaca*, so it is adjacent use evidence and does not set the identity’s taxonomic boundary. Table 1 formulation weights are not a general replacement ratio. |
| **S05 — `WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S05`** | Zinzino, [ZinoBiotic+ Canadian bilingual product sheet](https://zinzinowebstorage.blob.core.windows.net/product-sheets/ZinoBiotic-plus-en-fr-CAN.pdf), en-CA label dated 2022-09-08. | Names resistant starch from green banana in a marketed fibre blend and supplies a Canadian French statement. No standalone starch package or banana-specific quantity is shown. |
| **S06 — `WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S06`** | Office québécois de la langue française, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. | Supports general Québec French `amidon` and distinguishes the more specific `fécule` usage; it does not attest the compound. |
| **S07 — `WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S07`** | Office québécois de la langue française, [banane (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297102/banane), updated 1990. | Supports `banane` and *Musa* spp.; it does not name starch or separate cultivars. |
| **S08 — `WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S08`** | Norramon Thanyapanich, Ampa Jimtaisong, and Saroat Rawdkuen, [“Functional Properties of Banana Starch (*Musa* spp.) and Its Utilization in Cosmetics”](https://doi.org/10.3390/molecules26123637), *Molecules* 26(12), 3637 (2021). | Reports 16.88% and 22.73% research extraction yields for two named unripe cultivars on peeled-fruit basis. It is not a kitchen-yield or package-yield source. |
| **S09 — `WP02-B3-GREEN-BANANA-STARCH-R80-20261013-S09`** | Jaciene Lopes de Jesus Assis et al., [“Banana and Plantain Starches: Exploring Differences and Potential Applications”](https://doi.org/10.3390/horticulturae11101214), *Horticulturae* 11(10), 1214 (2025); see also the [Embrapa institutional record](https://www.embrapa.br/en/busca-de-publicacoes/-/publicacao/1179755/banana-and-plantain-starches-exploring-differences-and-potential-applications). | Primary comparison separates four dessert cultivars and three plantain cultivars; its abstract reports cultivar-related differences. It does not define a commercial grade or local label. |

## Static review record

- Read current `AGENTS.md`, the exact open WP02 Section B3 checklist line, live ingredient references/forms, the research ledger, the Kotlin legacy catalog, and prior WP02 B2/B3 proposals and batches before selecting this candidate.
- Pre-integration read-only snapshot: 1,405 active references; 104 forms; 1,744 research-ledger records; 114 manifest-listed recipes; 1,123 ingredient rows. At that snapshot, the selected phrase and source-ID prefix had no active, legacy, form, ledger, proposal, or batch owner.
- Pre-integration snapshot SHA-256: references `cfbaad9a2fef475df2540ab60fc85b876e5585ad6fca7073cc5b297f5c7fa4b5`; forms `4190dc88d9dc7914b3ef5a497d9c4f50def881ade9c0348d37faec3f02a63798`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; ledger `df5b4aa2c8a65aced56d2a072e76432e7b9f8ba1c5f142765cb29cfd6c021b20`; ordered recipe-corpus fingerprint `81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552`.
- Browsed Health Canada’s English/French fibre lists, OQLF `amidon` and `banane`, the primary Songkibab/Cavendish starch-isolation study, the 2024 noodle study, the Canadian bilingual product sheet, Thanyapanich et al.’s extraction-yield study, and the 2025 banana/plantain cultivar comparison. The 2024 noodle paper’s *Musa paradisiaca* source is explicitly treated as a taxonomic limitation, not a plantain alias or row-definition source.
- Static checks after drafting: strict UTF-8 decode, no BOM, final newline, no trailing whitespace or mojibake markers; all Markdown source links are direct HTTPS URLs; each cited source ID maps to one source-table entry and the proposed ledger record; both fenced JSON snippets parse; the ledger record validates against `docs/catalog/research-ledger.schema.json`; the prefix had no collision in the proposal/batch archive at the pre-integration snapshot. Root subsequently integrated the R80 reference and ledger evidence; the live catalog and ledger now contain this identity.
- No tests or emulator were run for this proposal correction. Root's subsequent integration added the database JSON row/evidence and refreshed the generated ingredient index; under the current `AGENTS.md` rule, this data-only catalog integration requires no tests.
