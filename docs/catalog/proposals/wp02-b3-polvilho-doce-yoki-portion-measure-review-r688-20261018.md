# WP02 B3 R688 — Yoki polvilho doce labeled portion

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Integrated as a product-specific ledger observation; no reference, form, or active conversion changed.
- **Open plan anchor:** The WP02 B3 cassava, tapioca, polvilho, potato, and other starch group remains open at [the catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3186).
- **Scope:** One manufacturer-labeled serving for the existing `ingredient-ref-brazil-polvilho-doce`. This review does not revise the source-named identity or French display, and does not establish a generic starch measure or substitution.
- **Prior-work boundary:** R598 records a Da Terrinha package-mass observation for the separate `ingredient-ref-brazil-polvilho-azedo`. It does not cover a Doce serving measure. The older identity review explicitly left measurements and substitutions empty.

## Recommendation

**Integrate one product-specific `portion_weight` observation** from Yoki’s official product page: **20 g per one `colher de sopa`** for Yoki Polvilho Doce. The page identifies the product and reports this serving on its nutrition panel. Store it as a published manufacturer-label portion on the existing sweet-polvilho record. Set `measurementState` to `researched_supported` for this source-specific observation; retain `defaultDensity: null` and `unitMappings: []` because one brand label does not support a transferable conversion. Keep `substitutionResearchState: not_yet_researched`; substitution is outside this measurement review.

Do not convert `colher de sopa` to a Canadian tablespoon volume or imply a level-fill method: the manufacturer gives neither spoon volume nor a filling protocol. Do not transfer the 20 g to another brand, `polvilho azedo`, generic tapioca/cassava starch, or an active mapping. The Québec Marché Brésil listing uses the Yoki product name but was out of stock when checked; it supports local product naming and a Québec retail listing, not current availability or the serving value of a local package.

### Proposed ledger observation

```json
{
  "observationId": "polvilho-doce-yoki-portion-1-colher-de-sopa-20g-r688-20261018",
  "relationship": "portion_weight",
  "value": 20,
  "valueUnit": "g",
  "foodDescription": "Yoki Polvilho Doce; the manufacturer lists 500 g and 1 kg packages.",
  "foodState": "Dry product as sold.",
  "measurementMethod": "Yoki's manufacturer nutrition panel declares a 20 g serving as one colher de sopa.",
  "quantityBasis": "One product-specific label portion. The source does not state spoon volume, fill or leveling method, or an equivalent for a standardized Canadian tablespoon.",
  "sourceQuantity": { "amount": 1, "unit": "colher de sopa (as printed)" },
  "observedMassG": 20,
  "evidenceKind": "manufacturer_label",
  "sourceIds": ["WP02-B3-POLVILHO-DOCE-MEASURE-R688-20261018-S01"]
}
```

## Ownership, Québec wording, and picker effect

The active reference is `ingredient-ref-brazil-polvilho-doce`, displayed as `sweet cassava starch (polvilho doce)` / `polvilho doce`, category `FLOUR_AND_STARCH`. Its aliases are empty, density is null, mappings are empty, and the ledger currently has `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, no observations, and no substitution findings. No form, active substitution rule, or package-yield entry refers to this identity. Keep the separate sour polvilho, generic tapioca starch, and whole-root cassava flour references unchanged.

The Québec-facing Marché Brésil page uses **Yoki Polvilho Doce 1 kg** as the product title, but provides no French translation of the source-named product and currently marks it out of stock. Retain the existing provisional display `polvilho doce`; this review does not add `fécule douce de manioc`, `farine de polvilho doce`, or another French alias. Reuse the existing MAPA and Grupo PQ source IDs already on the sweet-polvilho ledger record for the product-family boundary and source-specific English wording.

No catalog terms change, so picker behavior is unchanged. Static phrase-first projection against the current references gives:

| Query | Current result |
|---|---|
| `polvilho doce` | `ingredient-ref-brazil-polvilho-doce` |
| `sweet cassava starch` | `ingredient-ref-brazil-polvilho-doce` |
| `polvilho` | `ingredient-ref-brazil-polvilho-azedo`; `ingredient-ref-brazil-polvilho-doce` |
| `cassava starch` | `ingredient-ref-brazil-polvilho-azedo`; `ingredient-ref-brazil-polvilho-doce`; `ingredient-ref-native-waxy-tapioca-starch` |
| `sweet tapioca starch` | No result |
| `farine de polvilho doce` | No result |
| `fécule de manioc` | `ingredient-ref-tapioca-starch` |

Adding ledger evidence only changes none of these results. In particular, the single Yoki portion must not create a new alias, merge the two polvilho products, or change the generic cassava/tapioca starch query.

## Recipe demand and numeric boundary

A manifest-ordered scan of all **114 recipe files** and **1,123 structured ingredient rows** searched serialized recipe content and ingredient rows for `polvilho doce`, `polvilho azedo`, `polvilho`, `sweet cassava starch`, `sour cassava starch`, `sweet tapioca starch`, `sour tapioca starch`, `cassava starch`, `tapioca starch`, `farine de polvilho doce`, `farine de polvilho azedo`, `fécule de manioc`, `fécule de tapioca`, `manioc starch`, Yoki, Amafil, Da Terrinha, and pão de queijo variants. It found zero matching files, rows, or direct links to either Brazilian polvilho reference. The bundle provides no recipe demand or context for a substitution or recipe link.

The 20 g value is only the manufacturer’s labeled serving for Yoki’s named product. It is not an independently measured tablespoon, a cup-weight chart, a density, or a class-wide standard. Add no form, conversion, active unit mapping, default density, package yield, recipe link, substitution finding, or active substitution rule. The substitution state remains `not_yet_researched` rather than treating the absence of a replacement statement on this product page as a completed substitution survey.

## Source register and collision audit

The R688 source prefix, two new source IDs, observation ID, and proposal path were checked against the current ledger, proposal/batch archive, plan, and roadmap. They are free. The Yoki manufacturer URL and Marché Brésil URL below have no prior source owner; use new IDs. Reuse existing owners for the prior source URLs rather than registering duplicates.

| Source ID | Source and evidence | Scope and limit |
|---|---|---|
| **WP02-B3-POLVILHO-DOCE-MEASURE-R688-20261018-S01** | Yoki, [Polvilho Doce 500 g](https://www.yoki.com.br/produtos/polvilho-doce-500-g), accessed 2026-10-18. The manufacturer page lists 500 g and 1 kg sizes, identifies the ingredient as Polvilho Doce, and reports `Porção de 20 g (1 colher de sopa)`. | Primary product-page serving evidence for Yoki only. The page directs customers to check the package and does not provide spoon volume or fill method. |
| **WP02-B3-POLVILHO-DOCE-MEASURE-R688-20261018-S02** | Marché Brésil, [Yoki Polvilho Doce 1 kg](https://www.marchebresil.com/products/yoki-polvilho-doce-1kg), accessed 2026-10-18. French-language listing identifies the Chambly, Québec retailer and the product by its Portuguese name. | The listing is currently out of stock with pickup unavailable; it gives no serving size or translated French product term. It supports a Québec-facing listing, not current availability. |
| **Reuse `WP02-POLVILHO-LABELS-20261010-S01`** | Brazil MAPA, [Ofício-Circular 1/2022 polvilho guidance](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/arquivos/orientacao_tecnica_oficio_circular_nr_01_2022-polvilhos/%40%40download/file). | Already owned on the target ledger record; supports keeping Doce and Azedo as separate source-named products, not a shared measure or replacement ratio. |
| **Reuse `WP02-POLVILHO-LABELS-20261010-S05-DOCE`** | Grupo PQ Alimentos, [Polvilho Doce](https://www.grupopq.com.br/produto/polvilho-doce/). | Already owned on the target record; supports its source-specific English descriptor and product family only. |
| **Reuse `WP02-B3-POLVILHO-AZEDO-PACKAGE-R598-20261017-S01`** | Da Terrinha Alimentos, [Farináceos](https://www.daterrinhaalimentos.com/pt/farinaceos). | Existing URL owner; the current lineup lists separate 500 g Doce and Azedo products. No measure is provided. |
| **Reuse `WP02-B3-POLVILHO-AZEDO-PACKAGE-R598-20261017-S03`** | Brazilian Market, [Polvilho 500 g (Da Terrinha)](https://brazilianmarket.ca/products/polvilho-da-terrinha). | Existing URL owner; the Canadian retailer page lists Doce and Azedo variants. Its page-level stock status is not treated as Doce-specific stock or as Québec French wording. |

## Review checks

- [x] Checked the open WP02 B2/B3 plan, prior polvilho reviews, active reference, ledger, forms, legacy identities, rules, and package-yield data; R598 covers only Azedo package mass.
- [x] Verified the current manufacturer serving statement and Québec retail listing online; checked exact URL/source-ID ownership and reused existing owners where URLs were already recorded.
- [x] Projected current picker results for the source names and nearby broad queries; ledger-only evidence creates no picker effect.
- [x] Scanned all 114 manifest recipes / 1,123 ingredient rows; found no matching demand or direct reference links.
- [x] Integrated the observation, two new sources, and an accepted decision on the existing polvilho doce ledger record. No application code or generated index changed; no software tests, build, or emulator run were performed for this database-JSON-only evidence update.
