# WP06 Section 05 — Southern Brazil pinhão seed identity follow-up (R390)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review changes no shared catalog data, forms, research ledger, recipe files, plan, roadmap, or generated files.
- **Scope:** One source-backed pantry identity: the edible whole seed called *pinhão* in Southern Brazil, from *Araucaria angustifolia*.
- **Source-ID prefix:** `WP06-SOUTH-BRAZIL-PINHAO-SEEDS-R390-20261017`. New source IDs in this proposal are unique and proposal-local.

## Recommendation

**Add one identity-only reference for `pinhão seeds / graines de pinhão` in `NUT_SEED_AND_DRIED_FRUIT`.** Keep both displays source-specific. Mark the French wording provisional for Québec because no OQLF or Québec product-name attestation was located in this review. Leave both alias arrays empty, add no form, measure, density, unit mapping, conversion, substitution, or recipe link.

Brazilian agricultural research identifies *pinhão* as the edible seed of *Araucaria angustifolia* and documents its traditional food use in Southern Brazil, including cooked or roasted preparations. The original WP06 sweep explicitly left Southern and other Brazilian regional products as a coverage gap. This review addresses one whole-seed identity from that gap; it does not treat any single dish or source as representative of the region. [S01–S02]

Keep this whole seed distinct from:

- `ingredient-ref-pine-nuts` (`pine nuts / noix de pin`), the existing Pinus seed row;
- `ingredient-ref-bunya-nuts` (`bunya nuts / noix de bunya`), the *Araucaria bidwillii* seed row; and
- `ingredient-ref-pinhao-flour` (`Brazilian pinhão flour / farine de graines du pin du Paraná`), the existing flour made from *A. angustifolia* seed.

Do not attach `pinhão`, `Brazilian pine nut`, `pine nut`, `pine seed`, `pignon`, `pigne`, `noix de pin`, or genus-wide `Araucaria` aliases to any of these rows. The sources establish a source-named whole seed; they do not support treating its common name as a synonym for Pinus pine nuts or the seed-derived flour. [S01–S02; existing OQLF evidence WP03-NUTS-20261009-S08]

## Evidence and boundaries

| Source | What it supports | Limit |
|---|---|---|
| **S01 — Embrapa Florestas**, Rossana Catie Bueno de Godoy et al., “Valor nutricional e processamento do pinhão,” ch. 16 in *Araucária: pesquisa e desenvolvimento no Brasil* (2021), [chapter PDF](https://ainfo.cnptia.embrapa.br/digital/bitstream/item/229178/1/EmbrapaFlorestas-2021-LV-AraucariaEmbrapa-cap16.pdf), introduction and seed-processing sections (printed pp. 323–325). | Explicitly identifies the seed of *A. angustifolia* as *pinhão*, describes it as traditional food of Southern Brazil, distinguishes the edible part from its hard coat, and documents cooked or roasted food use. | Its reported seed dimensions, mean single-seed weight, processing settings, and composition are source-specific observations, not kitchen measures, bulk density, or general consumer specifications. Its food-use account is not a complete regional culinary survey. |
| **S02 — Embrapa Clima Temperado**, Ernestino de Souza Gomes Guarino et al., *Produção de Pinhão (Araucaria angustifolia) em uma Floresta no Extremo Sul do Brasil*, Boletim de Pesquisa e Desenvolvimento 353 (2021), [bulletin PDF](https://www.infoteca.cnptia.embrapa.br/infoteca/bitstream/doc/1136927/1/Boletim-353-1.pdf), introduction (printed p. 7). | Defines pinhões as the commonly named araucaria seeds and describes their place in Southern Brazilian traditional cooking, including cooked, roasted, and baked preparations. | The research measures one forest population in Rio Grande do Sul. Its ecological yield and location data do not stand for all southern states, and no one preparation is made representative. |

The OQLF’s existing GDT entry for [*pignon*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon) (already recorded as `WP03-NUTS-20261009-S08`) defines the food term for seeds from certain pines, lists *Pinus pinea*, and supplies the Québec French/English terms used by the current pine-nut row. It does not name *Araucaria angustifolia* or establish a Québec French name for *pinhão*. Reuse this source by reference; do not assign it a new source ID. Preserve `graines de pinhão` as a descriptive, provisional display rather than claiming OQLF approval. [existing OQLF source]

The source evidence is sufficient for the whole-seed identity, but not for an alias to pine nuts, a French market synonym, or any transferable cooking, yield, or nutrition value. The fact that the whole seed is commonly softened before eating does not require adding a universal `cooked` form in the absence of recipe demand.

## Proposed catalog row

If accepted for integration, add only this row:

```json
{
  "id": "ingredient-ref-pinhao-seeds",
  "nameFr": "graines de pinhão",
  "nameEn": "pinhão seeds",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "NUT_SEED_AND_DRIED_FRUIT"
}
```

`pinhão` is the source-native Portuguese ingredient name. The English descriptor `seeds` and the French descriptive phrase `graines de pinhão` clarify the food part while retaining the regional name. No alias is needed to make either display searchable. Do not add common-name translations such as `Brazilian pine nut(s)` or `noix de pin`, whose existing catalog owner is the distinct Pinus product.

## Live ownership and collision audit

Read-only snapshot taken on 2026-10-17:

| Surface | Live count | Finding for this candidate |
|---|---:|---|
| Active ingredient references | 1,700 | No `ingredient-ref-pinhao-seeds` row or exact whole-seed identity. Related rows are listed below. |
| Ingredient forms | 141 | No form label, match term, or ID for pinhão / *A. angustifolia*. |
| Legacy import candidates | 56 | No exact proposed ID or whole-seed display/alias owner. Legacy names remain inactive and are not promoted. |
| Research-ledger records | 2,056 records; 9,269 source entries; 7,844 distinct source IDs | `ingredient-ref-pinhao-flour` has the R84 flour evidence; no whole-seed record exists. The proposed R390 IDs are not present. |
| Bundled recipes | 114 files; 1,123 ingredient rows | No source-name or species-specific recipe demand; see the complete scan below. |

Related active references:

| Active owner | Current scope | Decision here |
|---|---|---|
| `ingredient-ref-pine-nuts` | `pine nuts / noix de pin`; French alias `pignons de pin`; `NUT_SEED_AND_DRIED_FRUIT`. | Preserve for the established Pinus pine-nut wording. Do not add pinhão aliases. |
| `ingredient-ref-pine-nut-butter` | `pine nut butter / beurre de pignon de pin`; `FAT_AND_OIL`. | Keep its butter identity and singular `pignon` search ownership unchanged. |
| `ingredient-ref-bunya-nuts` | `bunya nuts / noix de bunya`, English alias `bunya nut`; edible seed of *A. bidwillii*. | Keep the separate species and source name unchanged. |
| `ingredient-ref-pinhao-flour` | `Brazilian pinhão flour / farine de graines du pin du Paraná`; `FLOUR_AND_STARCH`. | Keep as the existing flour made from *A. angustifolia* seed. It is not the whole-seed row. |

The archive contains the adjacent decisions, but no review or integration of the whole *A. angustifolia* seed as a catalog identity:

- WP06’s [2026-10-09 South America sweep](wp06-south-american-cuisine-gap-sweep-20261009.md) calls for more South, Southeast, and Northeast Brazilian regional sources and product coverage; it does not list pinhão.
- WP02’s [R84 pinhão flour proposal](wp02-b2-brazilian-pinhao-flour-identity-review-r84-20261013.md) and its integration establish the flour row only.
- WP02’s [R86 Bunya flour boundary review](wp02-b2-bunya-nut-flour-picker-boundary-hold-r86-20261013.md) and [R102 Bunya seed starch review](wp02-b3-bunya-seed-starch-identity-review-r102-20261014.md) mention pinhão only to preserve species/product boundaries; neither allocates a whole-seed identity.
- WP03’s pine-nut reviews distinguish Pinus pine nuts, their butter, and the OQLF singular/plural query boundary. They do not review the South Brazilian Araucaria seed.

No exact `R390` or `WP06-SOUTH-BRAZIL-PINHAO-SEEDS-R390-20261017` source-prefix collision was found in proposals, batches, or the live ledger.

## Exact query projection

The live picker normalizes accents and punctuation and prefers whole-word phrase matches. Its current results for relevant queries were checked against active references and forms. With the proposed two display names and empty aliases, the projection is:

| Query | Current result | With proposed row | Reason |
|---|---|---|---|
| `pinhão` / `pinhao` | `ingredient-ref-pinhao-flour` | Whole-seed row plus `ingredient-ref-pinhao-flour` | The broad source-native word names both the whole seed and its existing flour product; the two source-specific displays distinguish them. |
| `pinhão seeds` | No result | `ingredient-ref-pinhao-seeds` only | Exact English whole-seed display. |
| `graines de pinhão` | No result | `ingredient-ref-pinhao-seeds` only | Exact provisional French display. |
| `pinhão flour` / `Brazilian pinhão flour` | `ingredient-ref-pinhao-flour` | `ingredient-ref-pinhao-flour` only | Existing flour identity remains the exact product match. |
| `pine nuts` / `noix de pin` / `pignons de pin` | `ingredient-ref-pine-nuts` | `ingredient-ref-pine-nuts` only | No cross-species alias is introduced. |
| `pignon` | `ingredient-ref-pine-nut-butter` | `ingredient-ref-pine-nut-butter` only | Do not add the singular OQLF term to the proposed row. |
| `bunya nuts` / `noix de bunya` | `ingredient-ref-bunya-nuts` | `ingredient-ref-bunya-nuts` only | *A. bidwillii* remains separate. |
| `Brazilian pine seed`, `Brazilian pine nut`, or `Araucaria` | No exact active result | No result | These broad English/genus queries are intentionally left unassigned. |

The broad `pinhão` result returning both the whole seed and flour is a visible product distinction, not an accidental duplicate. Users can select the whole seed with `pinhão seeds` and the flour with `pinhão flour`.

## Complete recipe scan

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned. The pass searched the full ingredient objects, including `originalText`, `ingredientName`, `ingredientRefId`, and `ingredientFormId`, using case-folded, accent-folded whole-word matching for `pinhão`, `pinhao`, pinhão seed(s), Brazilian/Paraná pine seed wording, *Araucaria*, *Araucaria angustifolia*, `semente de pinhão`, and `graines de pinhão`. It found **zero candidate matches**.

One adjacent Pinus line is present and remains untouched: recipe 102, `saucissons-de-chocolat-chocolate-sausage`, ingredient 8 says “2 tbsp pine nuts” and links to `ingredient-ref-pine-nuts`. That line supports only the existing pine-nut reference; it is not evidence for pinhão, a seed amount, or a substitution.

## Numeric, form, and substitution boundaries

- Embrapa’s reported mean single-seed mass and dimensions are botanical/source-sample observations, not a serving, household measure, or volume conversion. Add no density or unit mapping.
- Regional sources describe softening the edible seed by cooking or roasting. Add no catalog form or universal cooking instruction from these broad descriptions.
- No package yield, storage life, flour/starch ratio, cross-species conversion, or source-supported global/contextual substitution is proposed.
- The empty recipe scan means there is no recipe link to migrate or retarget.

## Source register

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-SOUTH-BRAZIL-PINHAO-SEEDS-R390-20261017-S01` | Embrapa Florestas, Rossana Catie Bueno de Godoy et al., “Valor nutricional e processamento do pinhão,” ch. 16 in *Araucária: pesquisa e desenvolvimento no Brasil* (2021), [PDF](https://ainfo.cnptia.embrapa.br/digital/bitstream/item/229178/1/EmbrapaFlorestas-2021-LV-AraucariaEmbrapa-cap16.pdf), accessed 2026-10-17; introduction and food-processing section. | Identifies *A. angustifolia* seed as pinhão, its Southern Brazilian food context, edible part, and processing. Does not supply a household measure or represent all regional cuisines. |
| `WP06-SOUTH-BRAZIL-PINHAO-SEEDS-R390-20261017-S02` | Embrapa Clima Temperado, Ernestino de Souza Gomes Guarino et al., *Produção de Pinhão (Araucaria angustifolia) em uma Floresta no Extremo Sul do Brasil*, Boletim de Pesquisa e Desenvolvimento 353 (2021), [PDF](https://www.infoteca.cnptia.embrapa.br/infoteca/bitstream/doc/1136927/1/Boletim-353-1.pdf), accessed 2026-10-17; introduction, printed p. 7. | Defines pinhões as araucaria seeds and describes Southern Brazilian culinary use. Production findings are from one forest population and are not generalized. |
| Existing source reused by reference: `WP03-NUTS-20261009-S08` | OQLF, [*pignon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon), accessed in the earlier pine-nut review. | Supports current Pinus pine-nut terminology and its existing owner only; it does not name *Araucaria angustifolia* or provide a Québec French term for pinhão. |
