# WP03 Section L R143 — banana pepper identity review — 2026-10-15

- **Status:** proposal only. No shared catalog JSON, ledger, plan, roadmap, generated index, or batch file was changed.
- **Disposition:** add one unqualified fresh-market identity **banana pepper / piment banane** with one `fresh` form. Add only the English plural alias `banana peppers`; keep French aliases empty. Hold a separate **hot banana pepper / piment banane fort** identity and do not make either hot-qualified phrase an alias.
- **Scope:** keep the unqualified market name distinct from banana fruit, Sweet Hungarian, and Hungarian Wax. Do not assert one cultivar, species, colour stage, origin, or fixed heat level. Reviewed sources use banana-pepper wording for both sweet seed products and hot or mildly hot fresh retail products. The hot-qualified French phrase appears beyond TERMIUM in Québec retail listings, but only for preserved products; that does not verify it as a fresh-market name.
- **Numeric and substitution boundary:** add no density, unit mapping, per-pepper weight, yield, conversion, or active substitution rule. One external Hungarian chicken paprikash recipe offers banana peppers or wax peppers for that dish only; it does not establish a general substitution.
- **Testing:** none. This is proposal-only; the project instructions exempt database-JSON-only changes from testing.

## Ownership and corpus audit

The active [WP03 Section L checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4488) leaves banana pepper open after the integrated Hungarian Wax item. The live bundled package has **1,499 ingredient references and 116 forms**. It has the separate banana-fruit reference `ingredient-ref-banana`, but no reference, alias, or form for `banana pepper`, `banana peppers`, `piment banane`, or the proposed IDs `ingredient-ref-banana-pepper` and `ingredient-form-banana-pepper-fresh`. The banana-fruit row remains unmodified. The 61-entry [legacy identity archive](../legacy-import-identities.v1.json) contains no banana-pepper candidate. No earlier focused banana-pepper proposal or ledger record was found; R142 mentions the phrase only in the Hungarian Wax review and its paprikash finding.

The current manifest lists **114 recipe files and 1,123 ingredient rows**. A full scan of every manifest-listed JSON recipe and every ingredient row found **zero hits** for `banana pepper(s)`, `piment banane`, `poivron long`, `sweet banana`, `Sweet Hungarian`, `Hungarian banana pepper`, `Hungarian wax`, `piment hongrois`, and `piment fort hongrois`. There is no bundled recipe row to link.

## Identity and terminology boundary

The fresh-market identity is supported by a current Walmart Canada product page titled **“Peppers, Hot Banana”**, whose detail text calls the item fresh and mildly hot and whose ingredient label says `Banana peppers`. The federal CFIA report covers whole fresh hot peppers sold at Canadian retail, including stores in Montréal and Québec City; its French product-type table includes `Piment banane`. Together these sources support a fresh-market banana-pepper identity, but not a single heat class or cultivar.

The French canonical `piment banane` is supported by TERMIUM Plus, the Québec grower’s `Piment Banane` seed listing, and the CFIA report’s fresh-retail table. Those sources do not agree on heat scope: TERMIUM’s 1990 `banana pepper` record also lists `poivron long`, while its related sweet/yellow record groups `piment banane` with sweet banana and `sweet Hungarian pepper`; CFIA uses `Piment banane` within a fresh-hot-pepper survey; and Walmart Canada sells a fresh, mildly hot `Hot Banana` product. The Québec seed listing describes its own product as sweet. The evidence supports the unqualified crop-qualified market name, but not one cultivar or heat class.

The 1976 TERMIUM record gives the exact pair `hot banana pepper / piment banane fort`. Québec retailers Mayrand and Metro also use `Piment banane fort` in current listings, beyond the terminology record, but both are **preserved whole products** (4 L and 750 mL respectively). They do not verify a fresh French product label. Norseco’s 2025 production catalogue separately labels cultivar Sicalis F1 “Extra large hot banana pepper” and Hungarian Wax “moderately hot taste”; this is seed/production-catalog evidence that the named types differ, not proof that the hot phrase is a separate generic fresh-food identity. Norseco and the Québec seed seller also list sweet banana types. The source distinction is real, but a second row would make bare `banana pepper` and `piment banane` queries return both rows, while the bundled corpus has no banana-pepper demand. Hold that hot-specific row until a fresh-market bilingual distinction or concrete recipe demand justifies the extra picker choice.

Keep `Sweet Hungarian`, `sweet banana pepper`, `yellow banana pepper`, `Hungarian banana pepper`, `hot banana pepper`, `piment banane fort`, `Hungarian wax pepper`, `banana wax pepper`, `Hongrois jaune`, `jaune hongrois`, and generic `poivron long` out of aliases. TERMIUM documents overlaps, but the wording does not establish safe synonymy across sweet and hot products. The active Hungarian Wax reference remains a separate row; the paprikash either/or is recipe-scoped evidence, not synonymy. Do not merge this reference with banana fruit. The exact multiword terms `banana pepper` and `piment banane` distinguish the proposed row; bare `banana` and `banane` remain broad multi-result searches.

Metro’s French `Piments bananes sucrés entiers Lakeside` is a **750 mL preserved sweet product**. It supports that plural wording in that product context, but I do not add `piments bananes`: the alias would make the bare query `piments` return a single row. French aliases remain empty. Mayrand’s 4 L and Metro’s 750 mL preserved hot listings are likewise evidence for their source-specific product names, not a fresh or generic preserved form in this proposal.

## Picker projection

Static projection used the live `IngredientReferenceSearchIndex` search semantics against 1,499 current references and 116 forms, then added the proposed reference and fresh form. Counts are matching ingredient references; this is a search projection, not a test run.

| Query | Current → projected | Effect |
|---|---:|---|
| `banana pepper` | 0 → 1 | Resolves to the proposed identity. |
| `banana peppers` | 0 → 1 | English plural alias resolves to the proposed identity. |
| `piment banane` | 0 → 1 | French canonical resolves to the proposed identity. |
| `fresh banana pepper` | 0 → 1 | Exact fresh-form label resolves to the proposed identity. |
| `piment banane frais` | 0 → 1 | Exact fresh-form label resolves to the proposed identity. |
| `banana` | 7 → 8 | Banana fruit and related products remain a multi-result search; banana pepper does not become the sole match. |
| `banane` | 6 → 7 | French banana fruit and related products remain a multi-result search. |
| `pepper` / `peppers` | 27 / 7 → 28 / 8 | Generic English searches remain multi-result. |
| `piment` / `piments` | 22 / 0 → 23 / 0 | The generic French plural remains empty; no plural alias creates a false singleton. |
| `poivron` / `poivrons` | 1 / 0 → 1 / 0 | No broad `poivron` term is added. |
| `Sweet Hungarian` / `sweet banana pepper` / `piment hongrois` | 0 / 0 / 0 → 0 / 0 / 0 | Keep the sweet/Hungarian naming separate and unresolved. |
| `Hungarian wax` / `piment fort hongrois` | 1 / 1 → 1 / 1 | Existing Hungarian Wax remains independently searchable. |
| `piments bananes` / `poivron long` | 0 / 0 → 0 / 0 | No French plural or shape-only alias is added. |
| `hot banana pepper` / `hot banana peppers` / `piment banane fort` | 0 / 0 / 0 → 0 / 0 / 0 | Keep the heat-qualified phrases unresolved rather than routing them to a heat-unspecified row or Hungarian Wax. |
| `fresh hot banana pepper` / `piment banane fort frais` | 0 / 0 → 0 / 0 | No separate fresh hot form or qualified French fresh label is activated. |

No generic `pepper(s)`, `piment(s)`, `poivron(s)`, or `banana`/`banane` alias is proposed. The display names and the one English plural alias are sufficient to cover the exact crop-qualified picker terms without crossing the fruit, Sweet Hungarian, or Hungarian Wax boundaries.

**Rejected two-row projection:** adding `hot banana pepper / piment banane fort` as another reference, with a fresh form, would project `banana pepper`, `banana peppers`, and `piment banane` from 0 to **2** matches each because the picker finds the broad phrase inside the hot-qualified display names. Qualified `hot banana pepper` and `piment banane fort` would each return one result. Although heat may be a useful choice, the exact French hot wording is verified only on preserved Québec retail SKUs, the fresh hot evidence is English or scoped to CFIA’s hot-pepper surveillance table, and the bundled corpus has no demand. Keep one unqualified identity until a fresh bilingual label or recipe-specific need supports the additional choice. Do not merge the hot phrase into aliases to avoid a second result; that would erase the heat distinction.

## Forms, numeric evidence, and substitutions

Add one explicit `fresh` form because the CFIA study’s product scope is whole fresh peppers and its product-type list includes `Piment banane`; Walmart Canada separately classifies its Banana product as fresh. Do not add a preserved/pickled form from Mayrand or Metro: their sweet and hot whole products show different source-qualified names and package presentations, not one generic form under a single heat-unspecified identity. Do not add cooked, dried, or ground forms.

The proposed French form label `piment banane frais` combines the supported French crop name with the independently supported fresh state; none of the reviewed retail pages uses that exact full string as its title.

There is no reusable quantity evidence. Walmart’s **225 g** is a package size with no pepper count; Mayrand’s **4 L** and Metro’s **750 mL** are preserved-product package volumes, not fresh-pepper measures. CFIA’s `6 (0.7%)` is a surveillance sample count, not a measure; each sample may contain one or more retail units and weigh at least 250 g. The Québec seed seller’s `10–15 cm` and `0–500 SHU`, and Norseco’s cultivar-specific dimensions and Scoville values, are not generic food measures or fixed banana-pepper properties. Norseco lists Sicalis F1 at 20 × 4 cm and 1,200–1,500 SHU, and Hungarian Wax separately at 14 × 4 cm and 5,000–10,000 SHU; these production-catalog claims help distinguish the named product types but do not support reusable measures. Seed-pack counts and seed mass are not edible produce measures. Keep density and `unitMappings` empty.

The existing R142 ledger finding `wp03-l-hungarian-wax-r142-ap-paprikash-banana-pepper-option` points to an AP/Milk Street **Hungarian Chicken Paprikash** recipe for 4–6 servings. Its ingredient line says `2 banana peppers or wax peppers`, making the two names an explicit either/or for that dish. At integration, update that existing finding—not add a second finding—with the proposed counterpart and existing R142 AP source ID. Recommended finding fields are:

```json
{
  "researchState": "researched_supported",
  "fromIngredientRefId": "ingredient-ref-hungarian-wax-pepper",
  "replacements": [
    { "ingredientRefId": "ingredient-ref-banana-pepper" }
  ],
  "context": "AP/Milk Street Hungarian Chicken Paprikash recipe, yield 4-6.",
  "sourceIds": ["WP03-L-HUNGARIAN-WAX-20261015-R142-S08"]
}
```

Retain a limitation that the either/or applies only to this named dish; do not add a general substitution rule, alias, count conversion, or reusable measure. The scoped ledger finding is source evidence, not an active runtime substitution or recipe-line link: the AP recipe is external to the bundled manifest, and the corpus scan found no matching bundled row.

## Source register

| Source ID | Source and retrieval | Evidence and limits |
|---|---|---|
| `WP03-L-BANANA-20261015-R143-S01` | CFIA, [Bactéries pathogènes et organismes indicateurs dans des piments forts entiers à l’état frais](https://publications.gc.ca/collections/collection_2026/acia-cfia/A104-701-2026-fra.pdf), final report 2026; directly opened 2026-10-15. | French report scope is whole fresh hot peppers retailed in Canada; sampling includes Montréal and Québec City. Table 5 lists `Piment banane`, six samples (0.7%). This is a product-type label in a surveillance table, not a botanical/cultivar definition or a per-item measure. A sample may be one or more retail units weighing at least 250 g. |
| `WP03-L-BANANA-20261015-R143-S02` | Walmart Canada, [Peppers, Hot Banana, Your Fresh Market, 225 g](https://www.walmart.ca/en/ip/peppers-hot-banana-your-fresh-market/6000207536650), current listing directly opened 2026-10-15; SKU `6000207536650`. | Exact current Canadian English retail name; page says fresh hot peppers, mild heat, and lists `Banana peppers` as ingredient. Supports fresh-market scope and the English plural alias. `225 g` is package-level and no item count is given; retailer product copy is not a standard heat specification. |
| `WP03-L-BANANA-20261015-R143-S03` | Government of Canada, TERMIUM Plus, [BANANA PEPPER record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=23&i=&index=frr&lang=fra&sg_kp_wet=10017094&srchtxt=BANANE), records dated 1990-12-10; indexed records reviewed 2026-10-15. | The `banana pepper` record lists French `poivron long` and `piment banane`; the related sweet/yellow record links `piment banane` with `sweet banana pepper` and `sweet Hungarian pepper`. Dynamic page direct-open returned a cache miss; indexed record text was reviewed. Used for French naming and to flag/exclude ambiguous subtype aliases, not to assign sweetness or cultivar to the proposed fresh-market entry. |
| `WP03-L-BANANA-20261015-R143-S04` | Government of Canada, TERMIUM Plus, [BANANE search result with hot banana pepper record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=73&i=&index=frr&lang=fra&sg_kp_wet=1282803&srchtxt=BANANE), record dated 1976-06-19; indexed record reviewed 2026-10-15. | Lists `hot banana pepper / piment banane fort`. Dynamic page direct-open returned a cache miss. It is terminology evidence only; the current Québec retailer listings below show the phrase on preserved products, not a fresh SKU. |
| `WP03-L-BANANA-20261015-R143-S05` | Les Semis de la Seigneurie, [Piment Banane — Semences Québec](https://www.semisseigneurie.ca/products/semences-piment-banane), Québec seed listing directly opened 2026-10-15. | Local French crop name; the page is explicitly for seeds. It describes its seller-specific product as sweet, 10–15 cm, and 0–500 SHU, and lists `Banana Pepper` as a common name. These product/cultivar claims are not generalized to all banana peppers or used as a food measure. |
| `WP03-L-BANANA-20261015-R143-S06` | Norseco, [Piment doux - Banane](https://www.norseco.com/p/norseco-1/maraicher-1169/legumes-4540/piment-doux-poivron-4600/banane-4673/piment-doux-19903/), current Québec supplier seed/production page directly opened 2026-10-15. | French product-page wording for a sweet banana-type seed product (4796 F1). Its fruit colour, dimensions, and maturity describe that source-listed cultivar only; the page does not establish a fresh retail SKU or a general measure. |
| `WP03-L-BANANA-20261015-R143-S07` | Norseco, [2025 Vegetable Production Catalogue](https://www.norseco.com/pdf/maraicher-2025-en-web.pdf), indexed table reviewed 2026-10-15; direct PDF open exceeded retrieval size. | Page 54 lists Sicalis F1 as an “Extra large hot banana pepper” and Hungarian Wax separately as “moderately hot taste,” with different source-specific size and Scoville descriptions. This supports a production-catalog distinction between named types, not generic heat/measure claims or a fresh retail label. |
| `WP03-L-BANANA-20261015-R143-S08` | Mayrand Québec, [Piment banane fort entier 4 L](https://www.mayrand.ca/fr/nos-produits/epicerie/marinade/piment/piment-banane-fort-entier-putters-44452/), current page directly opened 2026-10-15. | Exact Québec French product phrase beyond TERMIUM. The listing places it under marinades/epicerie and labels a preserved whole 4 L product; it does not establish a fresh-produce name or pepper weight. |
| `WP03-L-BANANA-20261015-R143-S09` | Metro, [Piment banane fort entier Lakeside, 750 mL](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/poivrons-zucchini-et-aubergines/piment-banane-fort-entier/p/057366020753), current indexed listing reviewed 2026-10-15; direct open returned a cache miss. | Exact Québec French phrase beyond TERMIUM, but this is a preserved 750 mL product. It supports the product wording only in that state, not a fresh hot banana-pepper row or reusable quantity. |
| `WP03-L-BANANA-20261015-R143-S10` | Metro, [Piments bananes sucrés entiers Lakeside](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/piments-bananes-sucres-entiers/p/057366030752), indexed current result reviewed 2026-10-15. | Québec French plural wording, but this is a preserved 750 mL pantry product and explicitly sweet. Direct page open returned a cache miss. Used to mark the fresh/preserved boundary and reject a plural alias that would make bare `piments` a single picker result. |
| `WP03-L-HUNGARIAN-WAX-20261015-R142-S08` (existing ledger source reused) | AP / Milk Street, [Use two types of paprika for the best Hungarian chicken paprikash](https://apnews.com/article/hungarian-chicken-paprikash-recipe-milk-street-898250ed32ad7dbe341b13eaf15e406f), directly opened 2026-10-15. | Recipe for 4–6 lists `2 banana peppers or wax peppers`. This supports only the named paprikash option; it does not establish global synonymy, a general substitution, or a reusable pepper count. |

## Proposed JSON delta

Add the following reference and form only if approved. This proposal does not modify the live files.

```json
{
  "addIngredientReferences": [
    {
      "id": "ingredient-ref-banana-pepper",
      "nameFr": "piment banane",
      "nameEn": "banana pepper",
      "aliasesFr": [],
      "aliasesEn": ["banana peppers"],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-15T00:00:00Z",
      "category": "VEGETABLE_AND_AROMATIC"
    }
  ],
  "addIngredientForms": [
    {
      "id": "ingredient-form-banana-pepper-fresh",
      "ingredientRefId": "ingredient-ref-banana-pepper",
      "formCode": "fresh",
      "labelFr": "piment banane frais",
      "labelEn": "fresh banana pepper",
      "prepState": "fresh",
      "matchTermsFr": [],
      "matchTermsEn": [],
      "densityGPerMl": null,
      "notesFr": "Le rapport de l'ACIA et une fiche canadienne de vente au d\u00e9tail classent le piment banane parmi les produits frais. Aucune masse par piment n'est \u00e9tablie.",
      "notesEn": "The CFIA report and a Canadian retail listing classify banana pepper as fresh produce. No per-pepper mass is established.",
      "updatedAt": "2026-10-15T00:00:00Z"
    }
  ]
}
```

No substitution rule, package yield, unit mapping, or other form is included. The R142 paprikash evidence remains dish-scoped and should not become an active global conversion.
