# WP02 B3 pea starch identity review

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as identity-only `ingredient-ref-pea-starch`; see the batch README for root disposition and post-integration validation.
- **Scope:** One distinct starch candidate under the still-open WP02 B3 starch sweep. This is not a repeat of the yellow-pea-flour integration or the green-pea-flour search hold.
- **Recommendation:** **Accept identity-only `pea starch / amidon de pois`; keep the French display provisional pending independent Québec terminology review.**

## Proposed identity

| Field | Proposed value | Boundary |
|---|---|---|
| ID | `ingredient-ref-pea-starch` | No active reference, form, ledger record, or legacy candidate uses this ID. |
| English display | `pea starch` | Current Canadian food-grade supplier wording and Canadian food-market evidence support the name. |
| Québec French display | `amidon de pois` | Attested in a current Montréal retailer's French ingredient declaration and current federal French market material. No exact OQLF terminology entry was found, so retain as provisional. |
| English aliases | `native pea starch` | One current Canadian-origin food-grade supplier uses this exact label for its pea-starch product. Keep `unmodified vegetable starch` inactive because it omits the botanical source. |
| French aliases | None | Do not translate `native` into an unattested alias or add `fécule de pois`. |
| Category | `FLOUR_AND_STARCH` | Starch is a separate ingredient identity from whole peas, pea flour, pea protein, and pea fibre. |

This row represents pea-derived starch as an ingredient. The reviewed Canadian reference defines a native field-pea starch from *Pisum sativum*, while a current supplier identifies its product as food-grade and Canadian-origin. These sources support the identity and names; they do not prove that every cultivar, extraction process, or modified pea starch product is equivalent. [S02–S04]

## Live ownership and search audit

The read-only snapshot of the live split seed package and research files was:

| Surface | Current state | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,246 rows | `671ad9402b46a64eb72a66be86844add1043895f14ca6724bd003160a1eb2e62` |
| Ingredient forms | 94 rows | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Research ledger | 1,553 records; 5,391 source entries; 4,429 distinct source IDs | `6680d8cf5f96a8e648e38c33cebbba8081ad5d1b79aef25ddc204744624cbbac` |
| Legacy candidates | 66 rows | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |

Exact normalized phrase ownership was checked across active reference names and aliases, form labels and match terms, legacy candidates, and ledger record IDs:

| Phrase or ID | Current owner | Proposed treatment |
|---|---|---|
| `pea starch` | None | English display. |
| `amidon de pois` | None as an active name or alias | Provisional Québec French display. Existing ledger and proposal mentions describe it only as a vermicelli ingredient, not as an owned identity. |
| `native pea starch` | None | English alias, supported as a product label by S02. |
| `unmodified vegetable starch` | None | Do not activate; it is botanically broad. |
| `ingredient-ref-pea-starch` | None in references, forms, ledger record IDs, or legacy candidates | Proposed stable ID. |
| `fécule de pois` | None | Leave unassigned; no reviewed Québec source supported this wording. |
| `pea flour` | No exact stored term; the search phrase is contained in `yellow pea flour` | Do not add as an alias. Preserve the source-qualified yellow-pea flour identity. |
| `farine de pois` | No exact stored term; phrase search returns chickpea flour, chana sattu, and yellow-pea flour | Do not add as an alias. |

Related active identities remain separately owned: `ingredient-ref-peas` is green peas / petits pois; `ingredient-ref-dried-whole-peas` is dried whole peas / pois secs entiers; `ingredient-ref-yellow-peas` is dried yellow peas / pois jaunes séchés; `ingredient-ref-green-split-peas` and `ingredient-ref-yellow-split-peas` are split-pulse identities; and `ingredient-ref-yellow-pea-flour` is yellow pea flour / farine de pois jaune. Green pea flour remains unallocated under its separate search-boundary hold. Do not merge pea starch into any of these rows or infer a flour-to-starch relationship. [S06–S07]

### Picker phrase behavior

The audit read `IngredientSearch.kt` and mirrored its normalized complete-word-phrase-first behavior, including form terms and substring fallback only when no complete phrase matches. The pre-integration baseline and post-integration results are:

| Query | Before addition | After integration | Effect |
|---|---|---|---|
| `pea starch` | 0 | New pea-starch row only | Exact English phrase is unambiguous. |
| `amidon de pois` | 0 | New pea-starch row only | Exact French phrase is unambiguous. |
| `native pea starch` | 0 | New pea-starch row only | Exact source-backed English alias. |
| `pea` | 6 rows | 7 rows, adding pea starch | Broad query gains one item; existing rows remain in results. |
| `peas` | 8 rows | Same 8 rows | Singular `pea starch` does not match this plural query. |
| `green pea` / `green peas` | Green-pea row | Same green-pea row | No whole-green-pea result is displaced. |
| `yellow pea` / `yellow peas` | Yellow-pea flour / whole yellow peas, respectively | Unchanged | Neither specific result is displaced. |
| `pois` | 18 rows | 19 rows, adding pea starch | Broad French family query gains one item; all existing rows remain. |
| `pois jaunes` | Dried yellow peas and yellow split peas | Same 2 rows | Both existing yellow-pulse results remain visible. |
| `petits pois` | Frozen peas and carrots, and green peas | Same 2 rows | Both existing matches remain visible. |
| `farine de pois` | 3 flour rows | Same 3 rows | The starch row does not enter a flour query. |

The picker does not stem singular and plural English terms. Broad `pea`, `pois`, and `amidon` queries already return multiple identities, so the new row increases discovery without taking an existing whole-pulse match away. This does not resolve the separate generic pea-flour naming boundary.

## Recipe demand

All 114 manifest-listed recipe JSON files and 1,123 ingredient rows were scanned. There are **zero exact `pea starch` or `amidon de pois` recipe-line or full-recipe text hits**, and zero rows linked to the proposed ID. Recipe 105#1 uses dried yellow whole peas; it is not starch demand and should not be relinked. No recipe link, measurement observation, or substitution is supported by this corpus.

## Numeric, form, and substitution limits

- Keep `defaultDensity: null` and `unitMappings: []`. No cup weight, mass-volume conversion, serving quantity, yield, or cooking conversion is established.
- Add no `IngredientForm`, package form, conversion edge, or recipe link. `native pea starch` is a source-backed label alias, not a separately measured form.
- Add no global or contextual substitution, including for corn, potato, tapioca, rice, mung-bean, arrowroot, or other starches, and no substitution for pea flour, whole peas, pea protein, or pea fibre. Supplier application claims are not evidence of recipe interchangeability.
- CFIA's 65% minimum starch value is part of a livestock-feed definition only; it is not a human-food composition specification or a usable density. Phlex's product page contains an `80%` protein-content field alongside a nutrition table reporting `0.3 g` protein with no clear serving basis. Neither number is used. AAFC's product-launch counts are market data, not ingredient quantities. [S01–S03]
- Measurement and substitution research remain unverified. Do not convert any of these source values into a numeric catalog property.

## Source register and source-ID audit

All sources below were accessed or rechecked on 2026-10-12. The five source IDs use prefix `WP02-B3-PEA-STARCH-IDENTITY-20261012`; the prefix and IDs were checked for collisions before the accepted sources were added to the ledger.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B3-PEA-STARCH-IDENTITY-20261012-S01** | Agriculture and Agri-Food Canada, [Ingrédients à base d’amidon de pois dans les boissons et les produits alimentaires emballés au Canada et aux États-Unis](https://agriculture.canada.ca/fr/commerce-international/rapports-guides/service-rapport-personnalise-analyse-lancements-produits-ingredients-base-damidon-pois-boissons). The current French-language report uses `amidon de pois` and reports Canadian product launches containing it during 2019–2023, with a 2024 interim count. It identifies food and beverage market use. | Launch data come from Mintel GNPD; counts do not identify every product, supplier, Québec label, or currently available SKU. Not a standalone ingredient specification. |
| **WP02-B3-PEA-STARCH-IDENTITY-20261012-S02** | Phlex Proteins, [Pea Starch](https://phlexproteins.com/product/pea-starch). Current product page describes food-grade native vegetable starch, lists `Pea Starch` and `Native Pea Starch` as label wording, and gives Canada as country of origin. | Supplier product evidence. The page's protein and nutrition figures are internally unclear and are excluded. It does not establish that all pea-starch products share its grade or source. |
| **WP02-B3-PEA-STARCH-IDENTITY-20261012-S03** | Canadian Food Inspection Agency, [Tableau canadien des ingrédients des aliments du bétail](https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail), entry 1-207-017 `Amidon de pois`. Defines a native starch obtained mechanically from dry-milled, dehulled field peas (*Pisum sativum*). | The definition and 65% dry-basis minimum are for the livestock-feed ingredient category. They do not establish human-food approval, a human-food specification, or a transferable numeric property. |
| **WP02-B3-PEA-STARCH-IDENTITY-20261012-S04** | SUE Foods, Montréal, [Vermicelles aux haricots (lungkow), Pagoda Brand](https://suefoods.com/products/pagoda-brand-vermicelles-aux-haricots-lungkow). Current French listing declares `amidon de pois, amidon de haricot mungo vert, eau` for a finished human-food vermicelli. | Local French label wording for one mixed finished product, not a standalone starch package, general formulation, or starch quantity. |
| **WP02-B3-PEA-STARCH-IDENTITY-20261012-S05** | Kinnikinnick, [2020 Canadian French catalogue](https://www.kinnikinnick.com/uploads/files/Images/Catalogues/2020%20CDN%20French%20Catalogue.pdf). Multiple gluten-free food ingredient declarations use `Amidon de pois`. | Archived product catalogue; corroborates Canadian food-label wording but not current availability or a standalone ingredient SKU. |

## Checks and remaining work

- The active plan leaves the B3 “water-chestnut flour and other documented regional starches” sweep open. This pea-starch identity is a distinct candidate from the integrated yellow pea flour and held green pea flour.
- The current catalog, forms, legacy list, ledger IDs, and recent proposal queue contain no focused pea-starch identity review. Earlier mentions in the mung-bean-starch and glass-noodle reviews are incidental finished-noodle ingredient evidence, not identity ownership.
- Root accepted the identity-only row with the source-backed English alias `native pea starch`; the French display remains provisional because no exact OQLF entry was found. The picker audit showed exact English/French phrases resolve to the new row, while broad `pea` and `pois` queries gain one result without displacing the existing pulse identities.
- Integration added one reference and one research-ledger record; no forms, recipe links, measurements, yields, conversions, or substitutions were added. The post-integration package has 1,247 references / 94 forms / 114 recipes / 1,123 ingredient rows; the ledger has 1,554 records / 5,396 source entries / 4,434 distinct source IDs. Static package, reference, generated-index, and ledger validation passed. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
- **Follow-up:** The independent Québec terminology review confirmed the existing display `amidon de pois` and rejected `fécule de pois` as an alias. The English `native pea starch` alias, chemically modified pea-starch boundary, and all measurement, yield, and substitution evidence remain open. See the [terminology follow-up](wp02-b3-pea-starch-quebec-term-adjudication-20261012.md) and its [integration record](../batches/wp02-b3-pea-starch-quebec-terminology-integration-20261012/README.md). Broader WP02 B2/B3 work remains open.
