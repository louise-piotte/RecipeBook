# WP03 Section L R140 — Shishito pepper identity and fresh-form review — 2026-10-15

- **Status:** proposal only. No shared catalog JSON, ledger, plan, roadmap, generated index, or batch file was changed.
- **Disposition:** add the fresh-market identity **Shishito pepper / piment Shishito**, with one explicit `fresh` form. Add only the English plural alias `Shishito peppers`; leave French aliases empty.
- **Evidence boundary:** current Canadian and Québec product sources use Shishito as a named fresh pepper. This proposal does not infer a species or general cultivar claim, a fixed heat level, a red/green subtype, or equivalence to pepperoncini, Padrón, Japanese pepper, or generic peppers.
- **Numeric and recipe boundary:** pack sizes, CFIA sample totals, one farm’s plant/fruit details, and a single external recipe quantity are source-scoped only. No reusable weight, portion, density, conversion, yield, recipe link, or substitution is proposed.

## Checklist, ownership, and archive audit

The active [WP03 Section L fresh pepper checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4475) still lists shishito. R136 integrated Poblano, R137 Habanero, R138 Anaheim, and R139 held the unresolved `Hatch-type` wording; this review advances only Shishito.

Read-only snapshot on 2026-10-15:

- The live package contains **1,494 ingredient references and 113 forms**. Neither file has a Shishito-named owner or form.
- `legacy-import-identities.v1.json` has **61 candidates** and no Shishito candidate.
- The research ledger has **1,839 records** and no Shishito-specific record or source entry.
- Prior proposal/archive search found no focused Shishito decision. R138 mentions Shishito only as one of the terms in a broader bundled-recipe scan; it did not assign the identity or its terms. The proposed reference ID `ingredient-ref-shishito-pepper`, form ID `ingredient-form-shishito-pepper-fresh`, ledger record ID, and R140 source-ID prefix are unused.
- The current manifest lists **114 recipes / 1,123 ingredient rows**. A scan of every manifest-listed recipe file found **zero** occurrences of `Shishito`, `shishitos`, `piment Shishito`, `poivron(s) shishito`, or `Japanese pepper`.
- The [roadmap](../../../roadmap.md) records R139 as integrated and says Section L remains open; it has no separate Shishito disposition.

The existing generic and subtype pepper identities remain separate. In particular, the current `Cubanelle pepper / piment doux Cubanelle` row is the only result for the singular query `poivron`; the proposal does not attach Shishito to that row or to any existing chile identity.

## Names and market boundary

Use **`piment Shishito` / `Shishito pepper`** as the canonical bilingual display. The exact French phrase appears in the Canadian Food Inspection Agency's fresh-whole-pepper table and in a current Aliments du Québec producer listing. The latter classifies the item under fresh produce, names Collectif Giroflée / Ferme Giroflée, and lists Québec retailers. A current Metro product is indexed bilingually as `Piment Shishito Fort` / `Hot Shishito Pepper`; its product page returned HTTP 403 on direct opening. The English Real Canadian Superstore listing uses `Shishito Peppers`. This is current Canadian/Québec market wording, not an OQLF or TERMIUM preferred-term claim.

Walmart Canada's French page gives another retailer wording: its title and category use `Poivrons shishito`, while the details also say `Piments frais shishito`. The page opened, but it showed the item out of stock at the selected Mississauga location and its title says 8 oz while the description says 14 oz. It therefore supports a retailer-specific wording variant only; neither package amount nor stock state is used as general evidence. Targeted OQLF GDT and TERMIUM searches for `Shishito` and `piment Shishito` did not surface a relevant term record in this pass. That is a bounded search result, not proof that no terminology record exists.

The Québec farm page uses the title `Piment Shishito`, says its crop is consumed green, notes that fruit can also be harvested red, and describes its locally grown Shishito as similar to pepperoncini. These are that farm’s product and harvest statements. They do not establish that Shishito is a pepperoncini synonym, that every Shishito is green or mildly hot, or that all Shishito peppers share the farm’s dimensions or Scoville range. No species-level claim is needed for the market identity proposed here.

### Aliases and picker projection

Propose only the English alias **`Shishito peppers`**, matching the current Canadian retailer title. Keep `aliasesFr` empty. The Québec and CFIA sources support the singular canonical `piment Shishito`; a one-word `Shishito` query also finds that canonical name through the picker’s partial-match fallback.

Do not add `piments shishitos`: Aliments du Québec uses that plural in its product description, but indexing it would make a bare `piments` query return this single new row when the live picker currently returns none. Do not add Walmart’s `poivrons shishito`, because a bare `poivrons` query would likewise become a singleton. Do not import Metro’s `Piment Shishito Fort` / `Hot Shishito Pepper` as aliases: `Fort` / `Hot` is a product-title qualifier and would add this identity to generic `fort` / `hot` queries; it is not a fixed heat classification for the market identity. Do not add `pepperoncini`, `Padrón`, `Japanese pepper`, or generic `pepper(s)`, `piment(s)`, `poivron(s)`, `chile`, or `chili` aliases.

The static projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized full word-phrase matching precedes substring fallback, and a form hint is returned only for a full exact form-term query.

| Query | Current | Proposed | Picker effect |
|---|---:|---:|---|
| `Shishito`, `Shishito pepper`, `Shishito peppers`, `piment Shishito` | 0 | 1 | One named result; the plural English form is the sole proposed alias. |
| `fresh Shishito pepper`, `piment Shishito frais` | 0 | 1 | The same reference with its fresh-form hint. |
| `pepper`, `peppers`, `piment` | 24 / 4 / 19 | 25 / 5 / 20 | All remain multi-result searches. |
| `piments`, `poivrons` | 0 / 0 | 0 / 0 | No French plural alias turns either broad query into a single result. |
| `poivron`, `piment fort` | 1 / 2 | 1 / 2 | No change to the existing Cubanelle match or generic hot-pepper phrase. |
| `piments shishitos`, `poivrons shishito`, `Piment Shishito Fort`, `Hot Shishito Pepper`, `Japanese pepper` | 0 | 0 | Retailer-specific plural/qualifier wording and unverified broad terms remain outside the alias set. |

This is a static projection of current code and data, not a run of a modified package or an app test.

## Fresh form, quantities, demand, and substitutions

Add one `fresh` form. CFIA's study explicitly covers whole fresh hot peppers and lists 20 Shishito samples; Aliments du Québec places this product in fresh fruits and vegetables; and current retail pages list it as fresh produce. Do not create separate raw, green, red, grilled, roasted, blistered, or cooked forms: the reviewed evidence treats those as consumption/maturity states or preparation methods, not separately named catalog products. No dried Shishito product was established in this review.

No reusable measure is supported:

- CFIA reports 20 Shishito samples, but a sample could contain one or more retail sales units and had a minimum total sample mass of 250 g. Neither the sample count nor sample mass is a single-pepper weight.
- Aliments du Québec lists a 150 g package. Metro and Real Canadian Superstore list 227 g packages of their respective products. Those are package amounts, not a per-pepper average or count mapping.
- Walmart's opened product page conflicts between 8 oz in the title and 14 oz in the detail text; discard those amounts for measurement purposes.
- The Québec farm reports dimensions and a Scoville range for its own crop. Those are not general market measurements or fixed identity attributes.
- RICARDO's external recipe lists **225 g whole Shishito peppers** and yields **four appetizer servings**. That amount belongs to one named dish and is not a per-pepper mass, general serving recommendation, or unit conversion.

RICARDO's page is a public advertorial format rather than editorial content; it still gives an external example of Shishito use as a sesame-soy appetizer. No Shishito phrase appears in the bundled recipe corpus, so do not create a bundled recipe link or treat the external recipe as bundled demand. Its note about replacing fresh Cayenne with bird's-eye pepper or Sriracha applies to the separate Cayenne ingredient in the mayonnaise, not to Shishito.

The farm's statement that Shishito “s'apparente au pepperoncini” is a qualitative comparison, with no replacement instruction, dish role, method, or amount. Product descriptions recommend grilling or blistering Shishito but do not name a substitute. Add no pepperoncini/Padrón alias or global/contextual substitution. Do not infer a conversion from fresh to cooked or from one maturity state to another.

## Source register

Sources were rechecked on 2026-10-15. Retail stock, marketing heat descriptions, and product/package quantities are recorded only as source-specific evidence.

| Source ID | Source and access | Evidence used and limits |
|---|---|---|
| `WP03-L-SHISHITO-20261015-R140-S01` | CFIA, [Pathogenic bacteria and indicator organisms in fresh whole hot peppers — French final report](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf), opened directly. | The report covers whole fresh retail peppers sampled 2022-04-01 through 2025-03-31 in Canadian cities including Québec and Montréal. Table 5 labels a product class `Piment Shishito` and lists 20 samples. Each sample was one or more retail units totaling at least 250 g; this is not a per-pepper measure. |
| `WP03-L-SHISHITO-20261015-R140-S02` | Aliments du Québec, [Piment Shishito](https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/piment-shishito), current producer listing opened directly. | Title `Piment Shishito`, fresh-produce classification, producer, Québec retailer channels, and product description `Piments shishitos`. The listed 150 g is a package format only. |
| `WP03-L-SHISHITO-20261015-R140-S03` | Metro Québec, [Piment Shishito Fort](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piment-shishito-fort/p/057836000513) / [Hot Shishito Pepper](https://www.metro.ca/en/online-grocery/aisles/fruits-vegetables/vegetables/peppers-zucchini-eggplant/hot-shishito-pepper/p/057836000513), same product 057836000513, current search-indexed bilingual listing. | Indexed current wording is `Piment Shishito Fort` / `Hot Shishito Pepper` and shows a 227 g product. Direct opening of both product pages returned HTTP 403. Treat the bilingual title and package amount as listing-specific; do not generalize `Fort` / `Hot` or the package quantity. |
| `WP03-L-SHISHITO-20261015-R140-S04` | Real Canadian Superstore, [Shishito Peppers — 227 g](https://www.realcanadiansuperstore.ca/en/shishito-peppers/p/21111986001_EA), directly opened. | Current English retail title `Shishito Peppers`, product number 21111986001_EA, and 227 g package. The page describes its product as mildly sweet with occasional subtle heat and suggests blistering or grilling; these descriptions and the package size are not generalized. |
| `WP03-L-SHISHITO-20261015-R140-S05` | Walmart Canada, [Poivrons shishito Shazam SUNSET](https://www.walmart.ca/fr/ip/poivrons-shishito-shazam-sunset/6000199291236), French page directly opened. | Title/category use `Poivrons shishito`; product details also say `Piments frais shishito`. At the selected Mississauga location it was out of stock. The title says 8 oz while the product details say 14 oz, so no amount or availability claim is adopted. |
| `WP03-L-SHISHITO-20261015-R140-S06` | Ferme Les Carottés, [Piment Shishito](https://www.fermelescarottes.com/product-page/piment-shishito), Québec farm page opened directly. | Uses the French name `Piment Shishito`, describes green use and possible red maturity, and says this farm's crop resembles pepperoncini. Its size, heat ratio, cultivar, and Scoville range are farm-specific; resemblance is not a synonym or substitution rule. |
| `WP03-L-SHISHITO-20261015-R140-S07` | RICARDO, [Piments shishito au sésame et au soya](https://www.ricardocuisine.com/recettes/9917-piments-shishito-au-sesame-et-au-soya), directly opened. | Public advertorial recipe page yields four appetizer servings and lists 225 g whole Shishito peppers. This is one dish-specific amount outside the bundled corpus, not a general measure. Its Cayenne replacement note refers to Cayenne in the mayonnaise. |
| `WP03-L-SHISHITO-20261015-R140-S08` | OQLF, [Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/), targeted search for `Shishito` and `piment Shishito`, reviewed 2026-10-15. | No relevant terminology record surfaced in the targeted search. This does not establish that no preferred term exists. |
| `WP03-L-SHISHITO-20261015-R140-S09` | Government of Canada, [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/), targeted search for `Shishito` and `piment Shishito`, reviewed 2026-10-15. | No relevant terminology record surfaced in the targeted search. This does not establish that no preferred term exists. |

## Exact proposed JSON delta

These are additive objects only. French accents in the exact database JSON are escaped as required by AGENTS.md. The ledger contains no `measurementObservations` because the reviewed numbers are study sample quantities, package quantities, or one recipe's ingredient amount; none establishes a reusable Shishito measure.

### Addition to `ingredient-references.v1.json`

```json
{
  "id": "ingredient-ref-shishito-pepper",
  "nameFr": "piment Shishito",
  "nameEn": "Shishito pepper",
  "aliasesFr": [],
  "aliasesEn": ["Shishito peppers"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

### Addition to `ingredient-forms.v1.json`

```json
{
  "id": "ingredient-form-shishito-pepper-fresh",
  "ingredientRefId": "ingredient-ref-shishito-pepper",
  "formCode": "fresh",
  "labelFr": "piment Shishito frais",
  "labelEn": "fresh Shishito pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Le rapport de l'ACIA porte sur des piments entiers \u00e0 l'\u00e9tat frais; Aliments du Qu\u00e9bec classe ce produit parmi les fruits et l\u00e9gumes frais. Aucune mesure g\u00e9n\u00e9rique n'est \u00e9tablie.",
  "notesEn": "The CFIA report covers whole fresh peppers; Aliments du Qu\u00e9bec lists this product as fresh produce. No generic measure is established.",
  "updatedAt": "2026-10-15T00:00:00Z"
}
```

### Addition to `research-ledger.v1.json` `records`

```json
{
  "recordId": "ingredient-ref-shishito-pepper",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-L-SHISHITO-20261015-R140-S01",
      "url": "https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf",
      "title": "Agence canadienne d'inspection des aliments, Bact\u00e9ries pathog\u00e8nes et organismes indicateurs dans des piments forts entiers \u00e0 l'\u00e9tat frais",
      "versionOrDate": "Final report (cover: December 2025; copyright 2026); sampling 2022-04-01 to 2025-03-31",
      "accessedOn": "2026-10-15",
      "locator": "Sampling design and Table 5 product-type row Piment Shishito.",
      "supports": "Supports the French product-type wording Piment Shishito in the whole fresh retail-pepper category; 20 is the number of study samples, not a culinary quantity or per-pepper weight.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-SHISHITO-20261015-R140-S02",
      "url": "https://alimentsduquebec.com/aliments-dici/fruits-et-legumes/piment-shishito",
      "title": "Aliments du Qu\u00e9bec, Piment Shishito",
      "versionOrDate": "Current producer listing, directly opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Product title, fresh-produce classification, product description, retail channels, and package format.",
      "supports": "Supports the French name Piment Shishito and local fresh-produce product identity. The 150 g amount is a package size, not a per-pepper measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SHISHITO-20261015-R140-S03",
      "url": "https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piment-shishito-fort/p/057836000513",
      "title": "Metro Qu\u00e9bec, Piment Shishito Fort / Hot Shishito Pepper, product 057836000513",
      "versionOrDate": "Current bilingual product listing, indexed 2026-10-15; direct opening returned HTTP 403",
      "accessedOn": "2026-10-15",
      "locator": "French and English indexed product titles and displayed 227 g package for the same product number.",
      "supports": "Supports current Qu\u00e9bec retailer wording in French and English. The title qualifier Fort/Hot is not generalized as a fixed heat level; 227 g is listing-specific package quantity, not a single-pepper weight.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SHISHITO-20261015-R140-S04",
      "url": "https://www.realcanadiansuperstore.ca/en/shishito-peppers/p/21111986001_EA",
      "title": "Real Canadian Superstore, Shishito Peppers, product 21111986001_EA",
      "versionOrDate": "Current Canadian retail listing, directly opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Product title, fresh-produce listing, displayed 227 g package, and product description.",
      "supports": "Supports the Canadian English plural market wording Shishito Peppers. The 227 g is a package amount; the retailer's occasional-heat description is source-specific and not adopted as a fixed identity property.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SHISHITO-20261015-R140-S05",
      "url": "https://www.walmart.ca/fr/ip/poivrons-shishito-shazam-sunset/6000199291236",
      "title": "Walmart Canada, Poivrons shishito Shazam SUNSET",
      "versionOrDate": "French product page directly opened 2026-10-15; out of stock at selected Mississauga location",
      "accessedOn": "2026-10-15",
      "locator": "Product title/category and details phrase Piments frais shishito; page title says 8 oz while body says 14 oz.",
      "supports": "Supports retailer-specific French wording Poivrons shishito / Piments frais shishito. Conflicting package amounts and selected-location stock status are not used as generic evidence.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SHISHITO-20261015-R140-S06",
      "url": "https://www.fermelescarottes.com/product-page/piment-shishito",
      "title": "Ferme Les Carott\u00e9s, Piment Shishito",
      "versionOrDate": "Qu\u00e9bec farm product page, directly opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Page title and descriptions of green use, red maturity, pepperoncini resemblance, farm crop size, and Scoville range.",
      "supports": "Supports local French product wording and a fresh farm crop. The pepperoncini comparison, maturity, dimensions, heat ratio, cultivar, and Scoville range are farm-specific; resemblance is not a synonym or substitution instruction.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-L-SHISHITO-20261015-R140-S07",
      "url": "https://www.ricardocuisine.com/recettes/9917-piments-shishito-au-sesame-et-au-soya",
      "title": "RICARDO, Piments shishito au s\u00e9same et au soya",
      "versionOrDate": "Public advertorial recipe page, directly opened 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Four-appetizer yield and ingredient line 225 g (1/2 lb) whole Shishito peppers; page note about replacing fresh Cayenne in the mayonnaise.",
      "supports": "Supports one external dish-specific use and amount only. The 225 g recipe quantity is not a per-pepper measure or reusable serving conversion. The Cayenne replacement note does not concern Shishito.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP03-L-SHISHITO-20261015-R140-S08",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, targeted GDT search",
      "versionOrDate": "Search for Shishito and piment Shishito; reviewed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Targeted search; no relevant food terminology record surfaced.",
      "supports": "No OQLF preferred-term record was found in this bounded search. Non-discovery is not proof that a record does not exist.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-L-SHISHITO-20261015-R140-S09",
      "url": "https://www.btb.termiumplus.gc.ca/",
      "title": "Government of Canada, TERMIUM Plus targeted search",
      "versionOrDate": "Search for Shishito and piment Shishito; reviewed 2026-10-15",
      "accessedOn": "2026-10-15",
      "locator": "Targeted search; no relevant food terminology record surfaced.",
      "supports": "No TERMIUM Plus preferred-term record was found in this bounded search. Non-discovery is not proof that a record does not exist.",
      "sourceKind": "regional_authority"
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "wp03-l-shishito-r140-general-substitution-review",
      "researchState": "researched_no_supported_substitute",
      "fromIngredientRefId": "ingredient-ref-shishito-pepper",
      "context": "General substitution review for fresh Shishito pepper / piment Shishito.",
      "basis": "The Qu\u00e9bec farm describes its Shishito as resembling pepperoncini, but gives no replacement instruction, dish role, method, or quantity. The RICARDO recipe specifies Shishito and its substitution note applies to fresh Cayenne in a separate mayonnaise ingredient.",
      "limitations": [
        "Do not add pepperoncini or Padr\u00f3n as aliases or global substitutes based on qualitative resemblance.",
        "Do not generalize the RICARDO Cayenne-to-bird's-eye/Sriracha note to Shishito.",
        "No active global or contextual substitution, form conversion, or ratio is supported."
      ],
      "sourceIds": [
        "WP03-L-SHISHITO-20261015-R140-S06",
        "WP03-L-SHISHITO-20261015-R140-S07"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add the named fresh-market Shishito pepper / piment Shishito reference. Keep only the qualified English plural alias Shishito peppers; do not add French plurals or retail qualifiers that would alter broad picker queries.",
      "sourceIds": [
        "WP03-L-SHISHITO-20261015-R140-S01",
        "WP03-L-SHISHITO-20261015-R140-S02",
        "WP03-L-SHISHITO-20261015-R140-S03",
        "WP03-L-SHISHITO-20261015-R140-S04"
      ]
    },
    {
      "outcome": "accepted",
      "reason": "Add one explicit fresh form supported by the Canadian whole-fresh-pepper study and current Qu\u00e9bec/Canadian fresh-produce listings. Keep color and cooking methods out of separate forms.",
      "sourceIds": [
        "WP03-L-SHISHITO-20261015-R140-S01",
        "WP03-L-SHISHITO-20261015-R140-S02",
        "WP03-L-SHISHITO-20261015-R140-S03",
        "WP03-L-SHISHITO-20261015-R140-S04"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "Do not add a reusable measure. CFIA sample masses, retail package quantities, the farm's crop measurements, and one external recipe quantity do not establish a generic Shishito weight or portion conversion.",
      "sourceIds": [
        "WP03-L-SHISHITO-20261015-R140-S01",
        "WP03-L-SHISHITO-20261015-R140-S02",
        "WP03-L-SHISHITO-20261015-R140-S03",
        "WP03-L-SHISHITO-20261015-R140-S04",
        "WP03-L-SHISHITO-20261015-R140-S05",
        "WP03-L-SHISHITO-20261015-R140-S06",
        "WP03-L-SHISHITO-20261015-R140-S07"
      ]
    },
    {
      "outcome": "unresolved",
      "reason": "No Shishito substitute is supported. Keep the farm's pepperoncini comparison and RICARDO's separate Cayenne replacement note source-scoped; add no alias or substitution rule.",
      "sourceIds": [
        "WP03-L-SHISHITO-20261015-R140-S06",
        "WP03-L-SHISHITO-20261015-R140-S07"
      ]
    }
  ]
}
```

No app, Gradle, unit, instrumentation, emulator, deployment, or other tests were run. This is a proposal-only documentation file; the user's AGENTS.md rule also exempts database-JSON-only additions from testing.
