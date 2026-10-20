# WP03 Section L R146 — Thai fresh-pepper identity review — 2026-10-15

- **Disposition:** Add a narrowly named `Thai chili pepper / piment thaï` market identity and one `fresh` form.
- **Scope:** This models the fresh-food label used by Canadian and Québec retailers. It does not identify a cultivar or species, and `Thaïlande` in the CFIA product-type label does not establish growing origin. Keep bird’s-eye / `piment oiseau`, dried chiles, and prepared pastes outside this row.
- **Catalog delta:** One reference plus one fresh form; no density, unit mapping, conversion, package yield, recipe link, or substitution rule.
- **Testing:** None. This is proposal-only; no database files changed. The project instruction exempts database-JSON-only additions from tests.

## Checklist, ownership, and corpus audit

The [active WP03 Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4509) still lists `Thai` as an open fresh-pepper candidate. The neighboring R145 review holds bird’s-eye separately and explicitly leaves Thai open; this proposal does not reopen or reverse that hold. No focused Thai fresh-pepper proposal was found in the proposal archive.

The read-only catalog snapshot has **1,501 ingredient references and 118 forms**. It has no fresh Thai pepper/chili/chile reference or form. The sole directly matching active reference is prepared `ingredient-ref-nam-prik-pao` (`Thai chili paste (nam prik pao)`), which remains distinct. The research ledger has no dedicated Thai fresh-pepper record; the legacy identity archive has no such candidate. The proposed ID `ingredient-ref-thai-pepper` is unused.

The bundled [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists **114 recipes and 1,123 ingredient rows**. A static scan of every manifest-listed ingredient row found **zero** matches for Thai pepper/chili/chile, `piment thaï`, `piment de Thaïlande`, bird’s-eye, or `piment oiseau`. There is no bundled line to link or substitute.

## Product name and identity boundary

Current Canadian and Québec sources support a fresh Thai-labelled pepper identity:

- Metro’s English page places **`Thai Chili`** in its fruit-and-vegetable / vegetable aisle and identifies `Thai Chilli` in the product details. The page was directly opened. The English page is product 4010; its 60 g quantity selector and price basis are listing-specific and do not establish an individual-pepper weight. [S02]
- Metro’s indexed Québec French page labels a fresh-produce listing **`Piment thaï`**. It shows product number 059559000214 and a 75 g package. The product page itself returned **403 Forbidden** in this pass, so the French wording and package details are limited to the current indexed page extract. It is not asserted to be the same SKU as the English product 4010. [S03]
- Provigo’s current French **fresh tomatoes-and-peppers aisle** lists both **`le Choix du Président Piments forts thaïs verts, 75 g`** and **`Piments forts thaïs rouges, 75 g`**. Its category page opened directly; both linked product pages returned a cache miss. The product names support local red/green wording, not distinct identities or per-pepper measures. [S04]
- CFIA’s 2026 report covers 854 samples of whole fresh hot peppers sold at Canadian retail from 2022 through 2025, with samples collected in Montréal and Québec among 11 cities. Its product-type table records 163 samples as **`Piment de Thaïlande`**. That is a retail product-type classification, not a botanical variety or origin statement: the report’s footnotes say some products classified as `Piment de Thaïlande` were imported from Vietnam and the Dominican Republic. The sample count is not a measure. [S05]

The canonical French label follows Metro’s current `Piment thaï`; the English display uses the market phrase `Thai chili pepper`, with the exact retailer title `Thai Chili` retained as an alias. `Piment de Thaïlande` is a source-qualified French alias for CFIA’s product-type wording. No qualifying OQLF or TERMIUM entry for this fresh product name was found in this pass; the bilingual market pages and CFIA classification supply the Québec/Canadian wording evidence.

The University of Florida IFAS guide says Thai pepper is also called bird’s-eye chili and notes confusion with some other pepper cultivars. This technical naming source is used only to document overlap. Canadian fresh listings reviewed by R145 likewise combine or equate Thai and bird’s-eye. Accordingly, do **not** put `bird’s eye`, `bird’s-eye`, `bird’s eye chili`, or `piment oiseau` in this Thai row’s aliases. R145’s bird’s-eye hold remains in force: the relevant exact query stays unresolved until the bird’s-eye fresh-market boundary is independently established. Do not assign species, cultivar, growing origin, color, or fixed heat to this Thai market identity. [S06; see also the R145 proposal’s current Canadian listing audit.]

The aliases intentionally omit color-specific Provigo wording (`piments forts thaïs verts/rouges`). A phrase such as `green chili` or generic plural `piments` should not return this single row just because one package variant carries those words. The English spelling alias `Thai chilli` is also omitted: although Metro uses that spelling in its ingredient details, adding it would make the otherwise-unmatched generic query `chilli` return this Thai-specific row alone. No standalone `Thai` alias is added.

## Form, measurements, and substitutions

One `fresh` form is supported by the fresh-produce aisle placement, CFIA’s whole-fresh sampling, and the product pages. Metro’s description says Thai chiles may be used fresh or dried, but that usage sentence does not establish a dried retail form, a fresh-to-dried conversion, or a yield; no dried form is proposed.

No reusable measurement is supported:

- Metro’s 60 g selector / 15 g pricing increment, Metro’s indexed 75 g package, and Provigo’s 75 g red and green packages are purchase or package quantities, not unit counts or average pepper weights. CFIA’s 163 samples are counts of samples, not individual peppers or weights. [S02–S05]
- A Québec RICARDO recipe for gnudis and rougaille lists **35 g (1/3 cup), about 18 green Thai peppers**, seeded and finely chopped, for an optional condiment. This is one recipe’s approximate amount for a specified preparation; it does not establish a standard pepper mass, cup conversion, or reusable yield. [S07]
- A separate RICARDO sambal recipe lists **250 ml (1 cup) fresh red Thai peppers** and no mass. The page identifies this as advertising content, not editorial content; it is still recipe-specific usage, not a common measure. [S08]

Neither recipe proposes a substitute. No reviewed source supports a global replacement with bird’s-eye, serrano, jalapeño, dried pepper, flakes, or paste. Add no active or recipe-scoped substitution from this review. The external recipes are not in the bundled manifest, so no recipe link or bundle demand is proposed.

## Exact proposed JSON delta

Add these entries to the existing reference and form arrays. No other catalog fields change.

```json
{
  "ingredientReference": {
    "id": "ingredient-ref-thai-pepper",
    "nameFr": "piment tha\u00ef",
    "nameEn": "Thai chili pepper",
    "aliasesFr": [
      "piment de Tha\u00eflande"
    ],
    "aliasesEn": [
      "Thai pepper",
      "Thai peppers",
      "Thai chili peppers"
    ],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-15T00:00:00Z",
    "category": "VEGETABLE_AND_AROMATIC"
  },
  "ingredientForm": {
    "id": "ingredient-form-thai-pepper-fresh",
    "ingredientRefId": "ingredient-ref-thai-pepper",
    "formCode": "fresh",
    "labelFr": "piment tha\u00ef frais",
    "labelEn": "fresh Thai chili pepper",
    "prepState": "fresh",
    "matchTermsFr": [],
    "matchTermsEn": [
      "fresh Thai pepper"
    ],
    "densityGPerMl": null,
    "notesFr": "Les sources appuient la pr\u00e9sentation fra\u00eeche. Aucune mesure, densit\u00e9, conversion ou relation de rendement n'est \u00e9tablie.",
    "notesEn": "Sources support the fresh presentation. No measure, density, conversion, or yield relationship is established.",
    "updatedAt": "2026-10-15T00:00:00Z"
  }
}
```

The aliases support the exact English market wording and a common Thai-pepper plural. No green/red, British-spelling `chilli`, bird’s-eye, origin, or general Thai-cuisine aliases are proposed. The French singular `piment thaï` and exact CFIA phrase cover the verified French terms without making bare `piments` a singleton.

## Picker projection

Counts are a static projection of the current `IngredientReferenceSearchIndex` normalization and phrase-first word-boundary matching over the **1,501-reference / 118-form** baseline. The projection adds the one reference and its form; form matches still return the owning ingredient row.

| Query | Current | Proposed | Projected effect |
|---|---:|---:|---|
| `Thai pepper` / `Thai peppers` | 0 | 1 | Fresh Thai row. |
| `Thai chili` | 1 | 2 | Existing nam prik pao paste plus fresh Thai pepper; the phrase intentionally shows both product states. |
| `Thai chili paste` | 1 | 1 | Exact phrase remains the prepared nam prik pao row only. |
| `Thai chili pepper`, `Thai chili peppers`, `Thai peppers` | 0 | 1 | Fresh Thai row. |
| `Thai chilli` / `chilli` | 0 / 0 | 0 / 0 | British spelling is present in one product description but not activated because the generic spelling would become a singleton. |
| `piment thaï` / `piment de Thaïlande` | 0 | 1 | Fresh Thai row. |
| `fresh Thai pepper` / `fresh Thai chili` | 0 | 1 | Fresh form attached to the same row. |
| `piment oiseau`, `bird’s eye`, `bird's eye` | 0 | 0 | R145 hold remains unresolved; no synonym mapping. |
| `piments`, `piments forts thaïs verts/rouges`, `Thai green chili peppers` | 0 | 0 | Deliberately not aliased, to avoid broad or color-specific singleton matches. |
| `pepper` / `peppers` | 29 / 9 | 30 / 10 | Broad English searches stay multi-result. |
| `piment` / `chili` / `Thai` | 24 / 9 / 6 | 25 / 10 / 7 | Broad searches remain multi-result. |

## Source register

| Source ID | Source and access | What it supports and limits |
|---|---|---|
| `WP03-L-THAI-PEPPER-20261015-R146-S01` | Internal: [WP03 Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4509), live reference/form catalogs, [research ledger](../research-ledger.v1.json), [legacy identity archive](../legacy-import-identities.v1.json), prior [R145 bird’s-eye review](wp03-section-l-birds-eye-fresh-pepper-boundary-review-r145-20261015.md). Read-only audit, 2026-10-15. | Thai remains open after R145; no active Thai fresh identity, no focused prior Thai fresh review, and no dedicated Thai fresh-pepper ledger or legacy candidate. Current Thai paste remains separate. |
| `WP03-L-THAI-PEPPER-20261015-R146-S02` | Metro, [Thai Chili, product 4010](https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/tomatoes-cucumber/thai-chili/p/4010), directly opened 2026-10-15. | Current English product title and ingredient wording, fruit-and-vegetable/vegetable aisle, and source-specific 60 g selector / 15 g pricing basis. It is not a per-pepper mass or a bilingual match to Metro’s other product number. |
| `WP03-L-THAI-PEPPER-20261015-R146-S03` | Metro, [Piment thaï, product 059559000214](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piment-thai/p/059559000214), current indexed page; direct open returned **403 Forbidden**. | Indexed French title `Piment thaï` and 75 g package. Exact French product wording is captured from the live index; direct page access was blocked. |
| `WP03-L-THAI-PEPPER-20261015-R146-S04` | Provigo, [fresh tomatoes and peppers category](https://www.provigo.ca/fr/alimentation/fruits-et-l-gumes/l-gumes-frais/tomates-et-poivrons/poivrons/c/34501), directly opened 2026-10-15; product links [green](https://www.provigo.ca/fr/piments-forts-tha-s-verts/p/21454049001_EA?source=nspt) and [red](https://www.provigo.ca/fr/piments-forts-tha-s-rouges/p/21454495001_EA?source=nspt) returned cache misses. | Current Québec-facing product names `Piments forts thaïs verts/rouges`, each 75 g. Retail package wording only; no unit count or per-pepper mass. |
| `WP03-L-THAI-PEPPER-20261015-R146-S05` | CFIA, [Bactéries pathogènes et organismes indicateurs dans des piments forts entiers à l’état frais](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf), 2026 report, directly opened 2026-10-15, table 5 and footnotes. | Whole-fresh Canadian retail sample scope and product-type label `Piment de Thaïlande` (163/854); footnotes demonstrate the label is not necessarily country of origin. Sample count is not a quantity measure or botanical identity. |
| `WP03-L-THAI-PEPPER-20261015-R146-S06` | University of Florida IFAS Extension, [Pepper Production in Miami-Dade County](https://ask.ifas.ufl.edu/publication/tr010), Thai Pepper section; also summarized in the R145 source audit. | Records the Thai pepper / bird’s-eye naming overlap. Technical naming context only; no species or cultivar is assigned, and bird’s-eye is not added as an alias. |
| `WP03-L-THAI-PEPPER-20261015-R146-S07` | RICARDO, [Gnudis et rougaille saucisses de Magie Marier](https://www.ricardocuisine.com/recettes/11098-gnudis-et-rougaille-saucisses-de-magie-marier), directly opened 2026-10-15, condiment ingredient line. | Gives one optional recipe’s 35 g / 1/3 cup / about 18 green Thai chiles, seeded and finely chopped. Approximate recipe-specific quantity only; no global measure or substitution. |
| `WP03-L-THAI-PEPPER-20261015-R146-S08` | RICARDO, [Sambal oelek d’Ethné de Vienne](https://www.ricardocuisine.com/recettes/4388-sambal-oelek-d-ethne-de-vienne), directly opened 2026-10-15, ingredient list and page notice. | Lists 250 ml (1 cup) fresh red Thai peppers without a mass. The page identifies the content as advertising, not editorial; no reusable measure or substitution is inferred. |
| `WP03-L-THAI-PEPPER-20261015-R146-S09` | Swadesh Supermarket, [Chillies (Thai) per lb](https://www.swadesh.ca/products/chillies-thai-per-lb), directly opened in the R145 review. | Canadian produce description uses plural `Thai chillies` while equating them with bird’s-eye. It corroborates a spelling variant but also documents why neither that term nor bird’s-eye is added to the Thai aliases: the broad query `chillies` would otherwise become a Thai-only result. The per-pound sale basis is not a per-pepper measure. |

Reconsider the omitted French color phrases only if the picker gains a plural strategy that keeps generic `piments` broad. Revisit bird’s-eye aliases only with independent evidence that establishes a distinct fresh-market identity and exact Québec French product wording; keep species, origin, and heat unspecified unless separately supported.
