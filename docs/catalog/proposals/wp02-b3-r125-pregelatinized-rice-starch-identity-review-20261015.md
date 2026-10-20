# WP02 Section 04 B3 R125 — pregelatinized rice starch identity boundary

- **Reviewed:** 2026-10-15.
- **Status:** Integrated on 2026-10-15 as an identity-only reference and ledger record. See the [integration README](../batches/wp02-b3-pregelatinized-rice-starch-identity-integration-r125-20261015/README.md).
- **Open checklist:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section 04 B3, line 2209: “Water-chestnut flour and other documented regional starches.”
- **Scope:** A source-qualified pregelatinized rice-starch grade, distinct from ordinary rice starch and modified rice starch.
- **Proposal-local source-ID prefix:** `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015`; checked against the active ledger and proposal/batch archive with no collision found.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for **pregelatinized rice starch / amidon de riz prégélatinisé**, proposed as `ingredient-ref-pregelatinized-rice-starch`. Use the source-qualified English spelling aliases `pre-gelatinized rice starch` and `pregelatinised rice starch`, formed from spelling variants OQLF lists for pregelatinized starch. Leave French aliases empty because the proposed display uses OQLF's preferred French term and the Canadian French product listing supplies the rice-specific wording. Keep `defaultDensity` null and `unitMappings` empty; add no form, conversion, recipe link, yield, or active substitution.

The Canadian distributor Quadra lists the food-grade product REMYLINE AX-FG-P (Beneo code F01336) as rice starch, available in Canada and sold as powder; its description identifies it as finely milled pregelatinized rice starch made from waxy polished broken rice. Quadra's fr-CA listing names the ingredient `amidon de riz` and describes the product as a finely milled pregelatinized rice-starch powder. This is a current commercial ingredient listing, not evidence of a consumer package or Québec retail inventory. [S04–S05]

Keep this grade distinct from `ingredient-ref-rice-starch` and `ingredient-ref-modified-rice-starch`. CFIA's common-name table distinguishes generic starch (plant name plus “starch”) from modified starch (“modified” plus plant name plus “starch”); it does not say that pregelatinized rice starch is chemically modified or prescribe the app's more specific picker label. Quadra's product page calls its ingredient “Rice Starch.” BENEO describes instant native rice starch as pre-cooked or pregelatinized with functionality similar to modified starches. That functional comparison does not establish chemical identity or a substitution ratio. [S01–S02, S04, S06–S07]

Do not alias `instant rice starch`, `instant native rice starch`, `native rice starch`, `precooked rice starch`, `modified rice starch`, or product/brand names. OQLF lists some of these terms as generic English translations for pregelatinized starch, but that entry is source-neutral; Quadra's REMYLINE product and BENEO's separately described Remypure instant-native product are not shown to be the same grade. Keep the alias set limited to the spelling variants of the proposed English display. [S03–S07]

### Proposed reference delta

```json
{
  "id": "ingredient-ref-pregelatinized-rice-starch",
  "nameEn": "pregelatinized rice starch",
  "nameFr": "amidon de riz prégélatinisé",
  "aliasesEn": ["pre-gelatinized rice starch", "pregelatinised rice starch"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

## Existing identity and picker projection

The live package snapshot contains **1,471 ingredient references**, **105 forms**, and **1,812 research-ledger records** with **7,492 source entries** and **6,370 distinct source IDs**. It already has separate ordinary and modified rice-starch rows, each without aliases, forms, density, or unit mappings. No pregelatinized-rice reference, matching ledger record, or form exists. The prior modified-rice review explicitly kept pregelatinized and instant rice grades out of the ordinary/modified aliases and left a later source-backed grade review possible. [S08]

The picker normalizes accents and punctuation, prefers complete word-phrase matches, and uses substring matching only when no phrase match exists. Projection against the live reference and form data, adding the proposed row and the two English spelling aliases, gives:

| Query | Current result | With proposal |
|---|---|---|
| `pregelatinized rice starch` | None | Pregelatinized rice starch |
| `pre-gelatinized rice starch` | None | Pregelatinized rice starch |
| `pregelatinised rice starch` | None | Pregelatinized rice starch |
| `amidon de riz prégélatinisé` | None | Pregelatinized rice starch |
| `rice starch` | Modified rice starch; rice starch | Modified rice starch; rice starch; pregelatinized rice starch |
| `amidon de riz` | Modified rice starch; rice starch | Modified rice starch; rice starch; pregelatinized rice starch |
| `instant native rice starch` / `instant rice starch` / `native rice starch` | None | None; intentionally not aliased |
| `modified rice starch` / `amidon de riz modifié` | Modified rice starch | Modified rice starch |

The qualified English and French queries gain one dedicated result. The broad rice-starch queries gain a third, source-qualified choice; the existing modified-rice query remains specific to its current row. No source supports resolving an unqualified “instant” or “native” query to this particular Canadian product.

## Canadian and Québec evidence

CFIA's English and French incorporated common-name tables were last amended on 2026-02-11. They prescribe plant-qualified names for starch and a separate “modified” pattern for modified starch. These tables support keeping the existing modified-rice identity distinct, but do not define pregelatinized starch as a separate regulatory ingredient class. This proposal uses a precise catalog display for picker disambiguation, not as a claim about mandatory label wording. [S01–S02]

OQLF's Grand dictionnaire terminologique entry lists `amidon prégélatinisé` as a preferred Québec French term and `amidon gélatinisé` as a second preferred term. Its definition describes starch treated by drying to make it soluble in cold water; the entry was last updated in 2004 and is general to starch, not rice-specific. The proposed `amidon de riz prégélatinisé` combines that preferred term with the rice source shown on Quadra's Canadian product listing. [S03–S05]

Quadra's English product page gives the commercial product code, supplier, Canada regional availability, ingredient name, physical form, and pregelatinized-rice-starch description. Its French-Canadian storefront provides the corresponding French ingredient name and pregelatinized powder wording. These listings support a Canadian market example and bilingual terminology, but do not show Québec-specific stock, consumer package size, or an at-home use direction. [S04–S05]

BENEO's current Remypure page and product sheet describe instant native rice starch as pre-cooked or pregelatinized and compare its technical functionality to modified starch. These are manufacturer statements about the named Remypure family, including cold-preparation applications; they do not prove that every pregelatinized rice starch is native, that REMYLINE AX-FG-P is a Remypure SKU, or that the products exchange one-for-one. [S06–S07]

## Recipe demand, numeric data, and substitutions

The bundled manifest lists **114 recipes** containing **1,123 ingredient rows**. A scan of all manifest-listed recipe files found no occurrences of `pregelatinized rice starch`, its reviewed spelling variants, `amidon de riz prégélatinisé`, `instant native rice starch`, `instant rice starch`, `rice starch`, or `amidon de riz`. There is no bundled recipe demand, recipe link, or reason to relink another ingredient.

- **Numeric implications:** Quadra identifies a powder but reports no household measure, mass-per-volume value, or kitchen conversion. Powder form alone does not support a density. BENEO's technical use cases and performance claims are not household quantities. Keep density null and unit mappings empty. [S04–S07]
- **Forms:** Add no `IngredientForm`. The evidence identifies a commercially processed grade with cold-water functionality, not a validated reversible household preparation state or a conversion path from ordinary rice starch. A separate searchable reference preserves the stated grade without implying a preparation conversion. [S03–S07]
- **Substitution:** Add no same-ingredient form conversion or contextual substitution. Similar performance to some modified starches is not a mass-for-mass cooking rule; the available source materials provide no general ratio, yield, or tested home-recipe interchangeability with ordinary or modified rice starch. [S04–S07]

## Source register

| Source ID | Source and locator | Scope and limits |
|---|---|---|
| `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S01` | Canadian Food Inspection Agency, [*Common Names for Ingredients and Components*](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components), last amended 2026-02-11, Table 1 items 20–21. | Primary federal incorporated common-name rule for starch and modified starch; does not define pregelatinized starch as a separate regulatory identity. |
| `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S02` | Agence canadienne d'inspection des aliments, [*Noms usuels d’ingrédients et de constituants*](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants), Table 1 items 20–21, last amended 2026-02-11. | Official French counterpart: `amidon de` plus plant name for starch; `amidon de` plus plant name and `modifié/modifiée` for modified starch. It does not provide a specific rice pregelatinized name. |
| `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S03` | Office québécois de la langue française, [*amidon prégélatinisé* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357585/amidon-pregelatinise), last updated 2004. | Québec terminology and definition for pregelatinized starch; lists `amidon gélatinisé` and English translations including `pre-gelatinized starch` and `pregelatinised starch`. General to starch, not rice-specific. |
| `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S04` | Quadra, [*REMYLINE AX-FG-P*](https://www.quadragroup.store/products/remyline-ax-fg-p), accessed 2026-10-15. | Canadian commercial ingredient listing for Beneo code F01336: Canada availability, ingredient name Rice Starch, powder form, and pregelatinized rice-starch description. It is not a Québec consumer-retail or stock listing. |
| `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S05` | Quadra fr-CA storefront, [*Produits*](https://www.quadragroup.store/fr-CA/products?filters=certifications-compliance-belgian-law-and-codex-alimentarius-standards), accessed 2026-10-15; REMYLINE AX-FG-P, product code F01336. | French-Canadian listing names `Amidon de riz`, Canada availability, `Poudre`, and a finely milled pregelatinized rice-starch powder. This is supplier wording, not evidence of Québec-specific local inventory. |
| `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S06` | BENEO, [*Remypure*](https://www.beneo.com/human-nutrition/human-nutrition-products/specialty-rice-ingredients/rice-starches/remypure), accessed 2026-10-15. | Manufacturer page says instant native rice starch is pre-cooked or pregelatinized and has functionality similar to modified starches; product-family evidence, not proof about every rice-starch grade or a cooking ratio. |
| `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S07` | BENEO, [*Instant native rice starch* product sheet](https://www.beneo.com/wp-content/uploads/2020/10/beneo-productsheet-remypure-web.pdf), 2020. | Manufacturer technical description of one Remypure instant-native product family and cold-preparation uses; does not establish a household conversion or direct equivalence to Quadra's REMYLINE SKU. |
| `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S08` | Project history: [modified rice-starch review](wp02-next-b3-regional-starch-gap-review-20261014-r1.md), [R123 integration](../batches/wp02-b3-high-amylose-corn-starch-identity-integration-r123-20261015/README.md), and [R124 integration](../batches/wp02-b3-raw-unmodified-potato-starch-identity-integration-r124-20261015/README.md). | Establishes prior alias boundaries and recent B3 sequence; internal project history, not independent market or technical evidence. |

## Static review checks

- Read `AGENTS.md`, the live Section 04 B3 plan item, the modified-rice review, the R123 and R124 proposals and integration records, the active reference and form JSON, the research ledger, the manifest, and the picker search implementation.
- Parsed the current package and ledger snapshot; confirmed the proposed reference ID is unused and the R125 source-ID prefix is absent from the active ledger and proposal/batch archive.
- Mirrored the picker's accent/punctuation normalization, complete-phrase-first matching, and substring fallback to calculate the query projection above.
- Scanned the 114 manifest-listed recipe files / 1,123 ingredient rows for the candidate and neighboring rice-starch terms; no matches were found.
- This is proposal-only documentation. No app, Gradle, instrumentation, emulator, or deployment tests were run; the project rule also waives testing for JSON-only database-data additions.


## Integration disposition

Accepted and integrated as identity-only ingredient-ref-pregelatinized-rice-starch. The active row uses the proposed bilingual displays and two English spelling aliases, with no French aliases, form, density, unit mapping, measure, recipe link, conversion, yield, or active substitution. External sources S01–S07 are attached to the ledger; internal project-history source S08 remains proposal-only. At integration, the generated catalog contained 1,473 references. No tests were run because the change only adds database JSON data under AGENTS.md.
