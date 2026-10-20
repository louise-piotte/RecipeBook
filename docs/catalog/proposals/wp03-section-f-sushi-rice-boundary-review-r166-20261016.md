# WP03 Section F — sushi rice dry-product boundary review (R166, 2026-10-16)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog JSON, research ledger, generated code, plan, roadmap, recipe, or batch README was changed.
- **Question:** Can the existing ledger-only `ingredient-ref-sushi-rice` candidate be bounded as the plain, uncooked retail product sold under the labels `sushi rice / riz à sushi`, while preserving the distinct rice varieties, grain-length classes, and prepared seasoned rice boundary?
- **Prior packet check:** The [2026-10-10 initial review](wp03-section-f-sushi-rice-boundary-review-20261010.md), [2026-10-11 independent review](wp03-section-f-sushi-rice-independent-review-20261011.md), [Québec terminology review](wp03-section-f-sushi-rice-quebec-terminology-review-20261011.md), and [their integration README](../batches/wp02-wp03-wp04-quebec-flour-sushi-rice-serrano-portion-integration-20261011/README.md) were read before this refresh. Those reviews correctly held the generic phrase while its dry-product scope was unsettled. The current plan after R165 still names generic sushi rice as an open Section F item ([plan, lines 519–520](../../RecipeBook-global-ingredient-catalog-plan.txt#L519); [R165 gap-review README](../batches/wp02-wp03-wp04-r165-gap-review-integration-20261016/README.md)). This review reopens only the dry retail label boundary; it does not reopen any prior identity decisions.

## Recommendation

**Integrate one identity-only, label-defined market category:** `sushi rice / riz à sushi`, scoped to plain, uncooked rice that is explicitly sold or marketed for sushi preparation under those labels.

The evidence supports a retail-use category rather than a shared rice variety or grain-length class. Current Québec and Canadian listings apply `riz à sushi / sushi rice` to both medium-grain Calrose and short-grain Koshihikari products. Manitoba's food-safety guidance uses `riz à sushi` for cooked short-grain rice mixed with vinegar and other ingredients, so the prepared seasoned state must stay outside this dry-product identity. A current KitchenAid cooker guide also shows a dry-rice `Sushi Rice / Riz à sushi` program separately from short-grain white rice. That program is evidence of consumer-facing cooking terminology; a cooker program does not establish a general rice variety, a compositional standard, or a universal boundary for the grain.

The catalog decision is therefore an explicit editorial boundary: retain a product category when the retail label itself says `sushi rice / riz à sushi`, and do not infer the category from suitability, stickiness, cuisine, or a cooker setting alone. This is not a claim that OQLF or a food standard defines dry sushi rice. It is a source-backed market label with a scoped catalog meaning. The absence of recipe demand is recorded below; it does not prevent adding a supported selectable ingredient identity.

## Proposed identity boundary

Include only **plain, uncooked rice sold or marketed with the product label `sushi rice` or `riz à sushi` for sushi preparation**. The label defines the category. A product may name a separate variety or class; keep that information on its existing identity when it is the ingredient being searched or selected.

Keep these boundaries explicit:

- **Calrose:** Dainty and MITO apply the sushi label to medium-grain Calrose. Preserve `ingredient-ref-calrose-rice` as `calrose rice / riz Calrose`; do not make Calrose an alias, form, or default type of the new identity.
- **Koshihikari and short grain:** Walmart's French listing and RiceSelect identify sushi-marketed products as short-grain Koshihikari/Japonica or Koshihikari/Calihikari. Preserve `ingredient-ref-short-grain-rice` and do not make Koshihikari, short-grain rice, or Japonica aliases of the new identity.
- **Medium-grain class:** Preserve `ingredient-ref-medium-grain-rice`; it remains independent of sushi use and the new category.
- **Prepared and seasoned rice:** Cooked rice mixed with vinegar, sugar, salt, or other seasoning, including ready-to-eat sushi rice and sushi dishes, is outside the identity. Do not create a cooked-seasoned form here.
- **Other rice products:** Rice that could be used for sushi but is not sold or marketed under the sushi-rice label is outside the identity. Also exclude glutinous rice, sticky-texture rice, Japanese rice as a broad class, instant or ready-to-heat seasoned rice, sushi kits, and prepared sushi.
- **Cooker programs:** A manufacturer cooking program alone does not qualify a product for the identity and does not prove that a general rice variety exists. The KitchenAid program supports only current dry-rice consumer wording and a device-specific program choice.

## Exact proposed catalog delta

If accepted, add this one row to `ingredient-references.v1.json` using the existing candidate key. The key is currently ledger-only and remains unallocated in the active reference catalog until approval.

```json
{
  "id": "ingredient-ref-sushi-rice",
  "nameFr": "riz à sushi",
  "nameEn": "sushi rice",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Add no form, legacy-import mapping, recipe link, package yield, conversion, density, unit mapping, measurement observation, global substitution, or contextual substitution. Do not change any of the current rice reference or form rows.

If accepted, promote the matching ledger candidate to an `ingredient_reference` record with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Reuse the existing source IDs listed below and add only the two proposal-local sources for Manitoba Health and KitchenAid. Record the category as explicitly limited to plain, uncooked, labeled retail rice. Keep measurement observations and substitution findings empty; product-specific preparation ratios are not reusable catalog measures.

Retain the existing candidate's source and decision history for auditability. Append one accepted decision with this scoped reason and the supporting source IDs:

```json
{
  "outcome": "accepted",
  "reason": "Add identity-only sushi rice / riz à sushi for plain, uncooked retail rice explicitly marketed for sushi preparation. This is a label-defined market category, not a general rice variety or grain-length class. Keep Calrose, Koshihikari, short-grain rice, medium-grain rice, glutinous rice, and cooked vinegar-seasoned rice distinct. Add no aliases, forms, measures, density, unit mappings, conversions, cooking yield, recipe links, or substitutions.",
  "sourceIds": [
    "WP03-S135",
    "WP03-S136",
    "WP03-SUSHI-QC-20261011-S05",
    "WP03-SUSHI-QC-20261011-S06",
    "WP03-S73",
    "WP03-S110",
    "WP03-SUSHI-R166-20261016-S01",
    "WP03-SUSHI-R166-20261016-S02"
  ]
}
```

## Exact ownership and current rice neighbors

The split seed package currently has **1,541 active references**, **119 forms**, and **114 manifest-listed recipes / 1,123 ingredient rows**. The active sushi-rice search key is absent from references and forms. `ingredient-ref-sushi-rice` occurs once as a `recordType: candidate` in `research-ledger.v1.json`, with `identityState: needs_clarification`; there is no corresponding legacy-import candidate. No other active row or form owns `sushi rice`, accent-folded `riz à sushi`, `riz sushi`, or `riz à sushis`.

| Current owner | Current normalized names / forms | Ownership preserved by this proposal |
|---|---|---|
| `ingredient-ref-rice` | `rice / riz`; English aliases include `chawal`, `uruchi rice`, and `uruchimai`; forms `dry rice / riz sec` and `cooked rice / riz cuit` | Keep `uruchimai` and generic rice forms here. These forms do not mean cooked, vinegar-seasoned sushi rice. |
| `ingredient-ref-white-rice` | `white rice / riz blanchi`; French alias `riz blanc`; dry and cooked white-rice forms | Keep unchanged. |
| `ingredient-ref-calrose-rice` | `calrose rice / riz Calrose` | Keep as named Calrose market type; do not add sushi wording. |
| `ingredient-ref-short-grain-rice` | `short-grain rice / riz à grain court`; French alias `riz à grains courts` | Keep as the grain-length class; do not alias it to sushi rice. |
| `ingredient-ref-medium-grain-rice` | `medium-grain rice / riz à grain moyen`; French alias `riz à grains moyens` | Keep as a separate grain-length class. |
| `ingredient-ref-glutinous-rice` | `glutinous rice / riz gluant`; aliases include `sweet rice`, `waxy rice`, `mochigome`, `riz doux`, and `riz glutineux` | Keep separate. Sticky cooked texture and sushi use do not establish glutinous-rice identity. |

The six active rows above retain `defaultDensity: null` and empty `unitMappings`. The four existing generic/white rice forms retain null density and explicitly have no established density, conversion, or cooking yield. The active catalog and forms have no sushi-rice row or form. The legacy identity file has no sushi-rice candidate.

### Source ID and URL ownership

Source IDs below already exist in the ledger and are reused as-is; this proposal does not mint replacement IDs for their URLs. New IDs are proposal-local and unallocated. A ledger-wide exact URL check found the Manitoba and KitchenAid URLs below currently unowned; the existing product and terminology URLs remain attached to their listed IDs.

| Source ID | Exact current URL | Ownership status and proposed use |
|---|---|---|
| `WP03-S135` | [Dainty French Sushi Rice product](https://dainty.ca/fr/produits/riz-sushi-calrose/) | Existing source on the sushi-rice candidate. Reuse for the labeled medium-grain Calrose example and its product-specific 1:1.5 rice-to-water ratio. |
| `WP03-S136` | [RiceSelect Sushi Rice](https://www.riceselect.com/products/riceselect-sushi-rice) | Existing source on the candidate. Reuse for the manufacturer-labeled short-grain Koshihikari/Calihikari example and product-specific cooking instructions. |
| `WP03-SUSHI-QC-20261011-S05` | [MITO Riz à sushi Calrose](https://mito.ca/produit/riz-calrose-450-g/) | Existing source on the candidate. Reuse for the exact Québec French retail title, Calrose ingredient, dry-storage instruction, and medium-grain note. |
| `WP03-SUSHI-QC-20261011-S06` | [Walmart Canada Hakuro Riz à sushi de qualité supérieure](https://www.walmart.ca/fr/ip/Hakuro-Riz-sushi-de-qualit-sup-rieure/3U478VX51H55?classType=REGULAR) | Existing source on the candidate. Reuse for a French retail title identifying Koshihikari short-grain Japonica; retain Walmart's vendor-information disclaimer. |
| `WP03-SUSHI-QC-20261011-S09` | [RiceSelect, How to Make Sticky Rice](https://www.riceselect.com/blog/how-to-prepare-the-best-sticky-rice) | Existing source on the candidate. Reuse only for the product-specific distinction between sticky texture and glutinous rice. |
| `WP03-S73` | [OQLF, sushi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359752/sushi) | Existing ledger source. Reuse for the prepared dish definition; it does not define dry sushi rice or endorse `riz à sushi` as a grain name. |
| `WP03-S110` | [OQLF, riz à grain court](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354929/riz-a-grain-court) | Existing ledger source. Reuse for the independent short-grain class and its French terms. |
| **WP03-SUSHI-R166-20261016-S01** | [Manitoba Health, Lignes directrices en matière de salubrité des aliments pour la préparation des sushis (PDF)](https://www.gov.mb.ca/health/publichealth/environmentalhealth/protection/docs/sushi.fr.pdf) | New proposal-local ID. Accessed 2026-10-16. Government food-safety guidance defines `riz à sushi` as cooked short-grain rice mixed with vinegar and other ingredients, and separately lists uncooked rice as shelf-stable. This directly supports excluding the prepared state; it is not retail nomenclature. |
| **WP03-SUSHI-R166-20261016-S02** | [KitchenAid Canada, Quick Start Guide W11797722, bilingual PDF](https://www.kitchenaid.ca/content/dam/global/documents/202602/quick-start-guide-w11797722-revb.pdf) | New proposal-local ID. Accessed 2026-10-16. The 2026 English and French capacity tables show a `Sushi Rice / Riz à sushi` dry-rice cooking program separate from short-grain white rice. This supports current consumer-facing dry-program wording only; a cooker program does not define a rice variety, general grain class, or universal cooking behavior. |

No new source ID is needed for the exact product or OQLF URLs already owned above. These proposal-local source IDs are not registered in the ledger until a root integration decision accepts them.

## Bilingual terminology limits

Use the exact current retail labels **`sushi rice / riz à sushi`** as the two display names. Dainty, MITO, and Walmart use the French phrase for dry retail products; the current KitchenAid guide also uses it in French for a dry-rice cooker program. Describe this French display as source-attested retail wording, not an OQLF-preferred or standardized dry-rice term. OQLF defines `sushi` as a prepared vinegared-rice dish and separately defines the short-grain class; it does not define a dry ingredient called `riz à sushi`.

Keep both alias arrays empty. In particular, do not add:

- `riz sushi`, `riz à sushis`, `riz à sushi sec`, or `riz sec pour sushi`;
- `sushi-meshi`, `sushimeshi`, `Japanese rice`, `uruchimai`, `short-grain rice`, or `medium-grain rice`;
- `sticky rice`, `riz collant`, or any glutinous-rice wording.

The first two French alternatives are not established by the reviewed product labels. `Japanese rice` and `uruchimai` are broader terms; `uruchimai` already belongs to generic `rice`. Grain-length, named variety, sticky texture, and glutinous rice remain separate concepts. The pair of display names itself provides the exact English and French search terms; aliases would broaden ownership without source-backed value.

## Picker projection

The projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): the picker folds accents and punctuation, searches names, aliases, and attached form terms, prefers complete normalized word phrases, then falls back to substring matching. A row's scope note is not surfaced by the current picker, so the proposal deliberately keeps both names exact and adds no broader aliases.

| Query | Current → proposed results | Effect |
|---|---:|---|
| `sushi rice` | 0 → 1 | New row only. |
| `riz à sushi` | 0 → 1 | New row only; accent-folded for matching, with the display preserving the accent. |
| `riz sushi`, `riz à sushis` | 0 → 0 | No unsupported alternate French spellings are created. |
| `sushi` | 0 → 1 | Returns the new labeled dry-rice row because it is a phrase within the English and French display terms. |
| `Calrose` | 1 → 1 | Remains on the Calrose row; no alias added to the proposed row. |
| `Koshihikari` | 0 → 0 | No variety alias is added. |
| `short-grain rice`, `riz à grain court` | 1 → 1 each | Remain on the short-grain class. |
| `medium-grain rice`, `riz à grain moyen` | 1 → 1 each | Remain on the medium-grain class. |
| `glutinous rice`, `riz gluant` | 6 → 6 each | Existing glutinous rice and longer glutinous-rice phrase matches remain unchanged. |
| `sticky rice`, `riz collant` | 0 → 0 each | No texture equivalence is introduced. |
| `rice` | 65 → 66 | Adds the new English display term to the broad rice query. |
| `riz` | 60 → 61 | Adds the new French display term to the broad rice query. |

The exact term `sushi` will now find this one dry retail ingredient in the ingredient picker. Because the picker does not show an ingredient scope description, this is a known projection effect; the row is still the only dry ingredient explicitly named by that label in the current catalog. The proposal does not add a cooked seasoned identity, a short/medium class alias, or an unqualified `sushi` alias.

## Bundled recipe demand

The manifest was read and every one of its **114 recipe files** and **1,123 structured ingredient rows** was scanned for exact and related normalized wording: `sushi rice`, `riz à sushi`, `riz sushi`, `riz à sushis`, `sushimeshi`, `sushi meshi`, `uruchimai`, `Japanese rice`, short-/medium-grain rice, Calrose, glutinous rice, sticky rice, and their French variants. The scan found **zero whole-file hits and zero ingredient-row hits** for those candidate terms. No recipe currently links the proposed key.

Four recipe rows are currently linked to generic or white rice: cooked white rice for serving, cooked rice in butter chicken, cooked rice in African peanut stew, and generic rice in fried rice. None names sushi, a variety, a grain-length class, or seasoned sushi rice. Keep those references and recipe rows unchanged; no recipe relink or ingredient-text edit is recommended.

## Forms, numeric evidence, and substitutions

- **Forms:** Generic `rice` has separate dry and cooked forms; white rice has separate dry and cooked forms. Their density values are null, and their notes state that no density, conversion, or cooking-yield relation is established. Calrose, short-grain, medium-grain, glutinous, and the proposed sushi-rice category have no forms. Add no dry/cooked or seasoned form to the proposed reference.
- **Product-specific cooking instructions:** Dainty's Calrose product gives a 1 rice : 1.5 water ratio. RiceSelect gives 1 cup rice plus 1.5 cups water, then separately mixes vinegar, sugar, and salt into cooked rice. The shared ratio is supported only for those product instructions; it is not a generic conversion, density, portion, or cooking-yield relation. KitchenAid lists 0.75 cup (142.5 g) minimum dry capacity, 3.6 cups (685 g) maximum dry capacity, and 4.0 cups (750 g) maximum rinsed capacity for its Sushi Rice program. It lists the same capacities for its separate short-grain white-rice program. These are device-specific load limits; they do not establish a density, variety, or general rice-class equivalence.
- **Reusable values:** Keep `defaultDensity: null`, `unitMappings: []`, and the measurement-observation list empty. No product label or appliance table establishes a general cup-to-mass value or dry-to-cooked yield for this category. The bundle's package-yield data contains no rice yield.
- **Substitution:** No reviewed source supports a general substitution among labeled sushi rice, Calrose, Koshihikari, short-grain rice, medium-grain rice, glutinous rice, or cooked seasoned rice. Cuisine use, texture, or shared water instructions do not establish interchangeability. The current global and contextual substitution-rule files have no rules; add none. If a future recipe names another rice, assess it in that recipe's cooking context rather than turning it into a global rule.

## Source register and evidence limits

Source IDs are either existing ledger IDs or proposal-local as marked above. The links below support only the wording, product, or state described; retail and manufacturer evidence does not create a compositional standard.

| Source | Evidence and limit |
|---|---|
| [Dainty, Le meilleur riz à sushi pour les recettes japonaises](https://dainty.ca/fr/produits/riz-sushi-calrose/) — existing `WP03-S135` | Current Québec French manufacturer wording for a sushi-labeled medium-grain Calrose product. Its 1:1.5 cooking ratio is product-specific. |
| [MITO, Riz à sushi Calrose – 450 g](https://mito.ca/produit/riz-calrose-450-g/) — existing `WP03-SUSHI-QC-20261011-S05` | Product title uses `Riz à sushi Calrose`; lists Calrose rice, says to keep cool and dry, and calls Calrose medium-grain. This is direct Québec product evidence, not a universal class definition. |
| [Walmart Canada, Hakuro Riz à sushi de qualité supérieure](https://www.walmart.ca/fr/ip/Hakuro-Riz-sushi-de-qualit-sup-rieure/3U478VX51H55?classType=REGULAR) — existing `WP03-SUSHI-QC-20261011-S06` | French product title plus listed Koshihikari short-grain Japonica supports the contrasting short-grain example. Walmart says supplier and third-party product details are not independently verified, so treat it as retailer listing evidence. |
| [RiceSelect, Sushi Rice](https://www.riceselect.com/products/riceselect-sushi-rice) — existing `WP03-S136` | Manufacturer labels a product sushi rice, names Koshihikari and Calihikari, and describes it as short-grain. Its cooking instructions include product-specific water and post-cooking seasoning. It is not a general standard for sushi rice. |
| [Manitoba Health, sushi preparation guidelines (French PDF)](https://www.gov.mb.ca/health/publichealth/environmentalhealth/protection/docs/sushi.fr.pdf) — proposal-local S01 | Defines `riz à sushi` as cooked short-grain rice mixed with vinegar and other ingredients; separately classifies uncooked rice as shelf-stable. This is strong evidence for the prepared/dry state boundary, not retail naming. |
| [KitchenAid Canada, Quick Start Guide W11797722 (2026 bilingual PDF)](https://www.kitchenaid.ca/content/dam/global/documents/202602/quick-start-guide-w11797722-revb.pdf) — proposal-local S02 | Lists English `Sushi Rice` and French `Riz à sushi` dry-rice programs beside separate white short-grain and long-grain programs. Appliance-specific consumer-use evidence only; it does not identify the general rice variety or prove a universal rice classification. |
| [OQLF, sushi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359752/sushi) — existing `WP03-S73` | Defines sushi as a prepared Japanese dish made with vinegared rice and possible fillings. It does not define a dry sushi-rice ingredient or standardize `riz à sushi` as a grain name. |
| [OQLF, riz à grain court](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354929/riz-a-grain-court) — existing `WP03-S110` | Defines the short-grain class and lists preferred French terms including `riz à grain court` and `riz à grains courts`. It does not make that class synonymous with sushi rice. |
| [RiceSelect, How to Make Sticky Rice](https://www.riceselect.com/blog/how-to-prepare-the-best-sticky-rice) — existing `WP03-SUSHI-QC-20261011-S09` | Product-specific terminology distinguishes sticky texture from glutinous rice. It does not support a universal sticky-texture identity or substitution. |

## Review checks

- Read the current Section F plan through R165, prior sushi-rice proposals and the R165 batch README before selecting this open candidate.
- Audited exact normalized active names, aliases, forms, legacy candidates, ledger candidate ownership, current source IDs, and exact source URLs. The proposed identity key is ledger-only; the two new source IDs remain unallocated.
- Read the picker projection code and calculated current/proposed result counts from all references and attached form terms using its accent-folding, phrase-first matching behavior.
- Parsed every manifest-listed recipe and every structured ingredient row; found zero candidate-term demand.
- Rechecked primary government, Québec terminology, manufacturer, retailer, and appliance sources on 2026-10-16. Product-specific quantity guidance was assessed and kept out of reusable numeric catalog fields.
- This is a proposal-only Markdown change. No app, unit, instrumentation, emulator, deployment, or build tests were run.
