# WP05 Section Z — Fruit Mostarda Identity Review (R720)

- **Packet type:** proposal-only catalog review; no shared catalog, ledger, recipe, checklist, roadmap, workflow, or integration file changed.
- **Research date:** 2026-10-18.
- **Selected open plan item:** Section Z, “Sauerkraut, pickled cucumbers, capers/caperberries, olives, pickled onions, chutneys, relishes, piccalilli, giardiniera, and mustard-fruit preparations.” This review covers only the Italian fruit-based *mostarda* family.
- **Recent progress context:** the plan and roadmap leave Section Z open after the 2026-10-18 R682 brown-sauce hold; the workflow tail records R716–R718 in WP02/WP03/WP04. This item does not reopen any of those decisions.
- **Prior-decision boundary:** the [preserved-condiment demand review](wp05-preserved-condiments-exact-recipe-demand-review-20261010.md) explicitly scoped mustard-fruit preparations out; [piccalilli](wp05-z-piccalilli-identity-review-20261012-round2.md) and [giardiniera](wp05-section-z-giardiniera-identity-review-20261012.md) have separate completed reviews. The [whole-grain mustard review](wp05-section-z-whole-grain-mustard-quebec-identity-boundary-review-20261012.md) covers another mustard condiment, not fruit preserves. [R682](wp05-section-z-brown-sauce-identity-boundary-review-r682-20261018.md) covers Québec `sauce brune` and is not reopened.
- **Requirements context:** `Requirements.md` FR-7 calls for searchable bilingual ingredient references; its conversion rules require ingredient-specific evidence before weight-volume conversion. This review therefore evaluates naming/search only and does not infer numeric or substitution behavior.

## Recommendation

**Add one identity-only `fruit mostarda / mostarda` reference for the source-defined Italian fruit-and-mustard preserve family.** Use the English manufacturer display `fruit mostarda`, the Québec menu-attested borrowed French display `mostarda`, and the narrow English search alias `mostarda di frutta`. Keep the Québec French display provisional: the targeted OQLF searches did not surface a specific entry for *mostarda*, *moutarde de fruits*, or *moutarde aux fruits*. The local menu supports actual borrowed-name usage; it does not establish an OQLF-preferred translation or a universal French product label.

Keep the identity at the family level. Fruit selection, regional style, piece size, puree texture, sweetness, and mustard source vary. Do not add formulas, regional-style aliases, a generic `mustard`/`moutarde` alias, forms, measures, density, unit mappings, conversions, yields, recipe links, or substitutions. In particular, do not map vegetable mostardas, ordinary prepared mustard, fruit-flavoured mustard sauces, chutney, fruit ketchup, piccalilli, or Piemonte *cougnà* to this identity.

This advances one named Section Z gap only. It does not close the broader preserved-condiment or Section Z checklists.

## Evidence and scope

The Italian manufacturer Lazzaris sells a product titled **Fruit Mostarda** and describes candied fruit in sugar and mustard syrup. It lists several package presentations, but these are product packages and do not establish an ordinary kitchen portion, mass-volume conversion, or generic density [S01]. Its broader overview identifies fruit, sugar, and mustard as the base concept while documenting regional variation: Cremona may use whole or large-cut fruit; Mantova is associated with a particular apple; Piemonte *cougnà* uses grape must; other styles can use pureed fruit and may include vegetables [S02]. These are meaningful boundaries, not a single universal formula.

The Comune di Cremona describes its local traditional *mostarda* as candied fruit with mustard, served with meat and cheese [S03]. Regione Lombardia describes fruit candied in sweet syrup and then mustard-flavoured, identifies multiple local types, and explains use with meat, cheese, and cured meat [S04]. These official sources establish a regional culinary product family; they do not define Canadian label wording.

Canadian importer Elio Importing lists **Lazzaris Mostarda Fruit** as a 2 × 5 kg wholesale product. Its company page describes Canada-wide wholesale delivery and lists Québec as a service region [S05–S06]. The product page is a distributor listing, not a Québec retail inventory guarantee or independent standard. Hôtel Le Bonne Entente’s French-language Québec menu uses the borrowed label `mostarda` alongside beef carpaccio, grape must, Parmigiano, and charcuterie [S07]. This supports the provisional French display as local menu usage; it does not identify the menu’s supplier or product style.

### Naming decision

| Field | Proposal | Evidence and limit |
|---|---|---|
| English display | `fruit mostarda` | Direct Lazzaris English product title `Fruit Mostarda`; not a general standard for every regional mostarda. [S01] |
| fr-CA display | `mostarda` | Current French-language Québec menu uses this Italian term for an accompaniment in a meat/cheese context. Borrowed local usage only; no OQLF preference is claimed. [S07] |
| English alias | `mostarda di frutta` | Directly attested Italian product-family wording in Italian manufacturer/regional sources; exact full phrase only. [S02, S04] |
| French aliases | None | Do not invent `moutarde aux fruits` or `moutarde de fruits`; neither targeted OQLF searches nor the Québec menu established these as names for the product. |

The display pair is not a translation rule: `fruit mostarda / mostarda` records the source-attested English product name and the Québec menu’s borrowed French usage. Do not add the literal aliases `fruit mustard`, `mustard fruit`, or `moutarde aux fruits`; they can be read as a mustard product flavoured with fruit and are not established by the reviewed product label as general names.

## Current ownership and picker audit

Proposal-time snapshot: **1,841 active references, 174 forms, and 2,224 ledger records**. The exact normalized phrases `fruit mostarda`, `mostarda`, `mostarda di frutta`, `fruit mustard`, `mustard fruit`, `moutarde de fruits`, and `moutarde aux fruits` have no active reference or form owner. No legacy candidate or ledger record names the fruit-mostarda identity. Repository searches found no prior dedicated mostarda proposal or batch. R720’s source prefix and proposal path were unowned before this file was written; the specific external URLs below have no existing ledger source owner. The identifiers in this packet are proposal-local citations only.

Relevant active identities stay separate:

- `ingredient-ref-dijon-mustard`, `ingredient-ref-yellow-mustard`, and `ingredient-ref-whole-grain-mustard` are prepared mustard products; mustard seed and mustard oil rows remain separate ingredient classes.
- `ingredient-ref-fruit-ketchup` is Québec fruit ketchup; `ingredient-ref-sweet-mango-chutney` is specifically sweet mango chutney.
- `ingredient-ref-piccalilli` is the vinegar-and-mustard vegetable preserve; `ingredient-ref-giardiniera` is a separate preserved-vegetable condiment.
- `ingredient-ref-mango-pickle` and `ingredient-ref-lime-pickle` are separate South Asian pickles.
- `ingredient-ref-mustard-greens`, `ingredient-ref-pickled-mustard-greens`, and `ingredient-ref-mei-gan-cai` concern leafy products, not fruit condiments.

No ownership is proposed for unqualified `mustard` or `moutarde`. The legacy generic mustard candidate remains unreviewed. This matters in the current picker: normalized `mustard` returns 14 references and `moutarde` returns 13, including seeds, oil, leafy products, prepared varieties, and a fish-product alias. The proposed Italian/English displays do not add terms containing `mustard` or `moutarde`, so those result sets do not change.

`IngredientSearch.kt` normalizes case, accents, punctuation, and spaces, then prefers full word-phrase matches before substring fallback. A read-only projection with the proposed reference gives:

| Query | Current matches | Projected matches |
|---|---:|---:|
| `fruit mostarda` | 0 | 1 — proposed fruit mostarda row |
| `mostarda di frutta` | 0 | 1 — proposed row via English alias |
| `mostarda` | 0 | 1 — proposed row via the French display term |
| `fruit mustard`; `mustard fruit`; `moutarde aux fruits` | 0 | 0 |
| `mustard` | 14 | 14 — unchanged |
| `moutarde` | 13 | 13 — unchanged |

The shorter `mostarda` query is not stored as an alias; it matches the proposed French display. Its result is visibly qualified as `fruit mostarda` in English. If other regional or vegetable mostardas are later added, their distinct displays should make the short query multi-result rather than adding broad cross-style aliases now.

## Bundled corpus scan

The manifest lists **114 recipe JSON files and 1,123 ingredient rows**. I scanned all listed recipe files and each ingredient’s `originalText`, `ingredientName`, and `ingredientRefId` for `mostarda`, `mostarda di frutta`, `mostarda di Cremona`, `fruit mostarda`, `fruit mustard`, `mustard fruit`, `moutarde de fruits`, and `moutarde aux fruits`.

- Full recipe-file text hits: **0**.
- Ingredient-row hits: **0**.
- No existing recipe link or relink is proposed.
- The corpus’s mustard, ketchup, and fruit wording does not name this product and is not promoted into mostarda demand.

Identity coverage is proposed to make the named ingredient searchable when future recipes call for it, not to infer demand from adjacent ingredients or menu pairings.

## Measurement and substitution limits

The manufacturer’s package sizes and nutrition table are not kitchen portions. The Canadian distributor’s 2 × 5 kg case is wholesale packaging. No source reviewed provides a generic tablespoon/cup mass, a fixed composition, product-independent density, or a conversion among regional products. Keep density null and unit mappings empty; record no package amount or numeric observation as a reusable measure.

Sources discuss serving mostarda with meats and cheeses, but provide no replacement quantity, test, or dish-specific substitution. This supports no active or evidence-only substitution finding. Keep substitutions `not_yet_researched` until a recipe-specific question warrants review.

## Schema-shaped proposal examples

The reference example follows `docs/schemas/full-library.schema.v1.json` `IngredientReference`; the ledger example follows `docs/catalog/research-ledger.schema.json`. The `proposal-local-r720-fruit-mostarda` value is deliberately local to this review and **is not an allocated shared catalog ID**. Replace it only during a separately approved integration.

```json
{
  "id": "proposal-local-r720-fruit-mostarda",
  "nameFr": "mostarda",
  "nameEn": "fruit mostarda",
  "aliasesFr": [],
  "aliasesEn": ["mostarda di frutta"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "SAUCE_AND_CONDIMENT"
}
```

```json
{
  "recordId": "proposal-local-r720-fruit-mostarda",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP05-Z-MOSTARDA-R720-20261018-S01",
      "url": "https://www.lazzaris.com/en/traditional-products/classic-mostardas/fruit-mostarda/",
      "title": "Lazzaris, Fruit Mostarda",
      "accessedOn": "2026-10-18",
      "locator": "Product title, main ingredients, product description, and available formats",
      "supports": "The manufacturer names Fruit Mostarda and describes candied fruit in sugar and mustard syrup. Its listed formulation, fruit mixture, and packages are product-specific, not a universal formula or kitchen measure.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP05-Z-MOSTARDA-R720-20261018-S02",
      "url": "https://www.lazzaris.com/mostarda/",
      "title": "Lazzaris, La Mostarda",
      "accessedOn": "2026-10-18",
      "locator": "Sections on what mostarda is and regional Italian styles",
      "supports": "The manufacturer describes a fruit, sugar, and mustard preparation while distinguishing regional recipes and piece/puree styles. This is producer guidance, not a regulatory or universal definition.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP05-Z-MOSTARDA-R720-20261018-S03",
      "url": "https://www.comune.cremona.it/schede-informative/deco-cremona",
      "title": "Comune di Cremona, Le DE.CO. di Cremona",
      "versionOrDate": "Last modified 2026-05-18",
      "accessedOn": "2026-10-18",
      "locator": "La Mostarda tradizionale di Cremona",
      "supports": "Defines Cremona's traditional mostarda as candied fruit with mustard and describes serving it with meats and cheeses. It documents one local style, not all mostardas.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP05-Z-MOSTARDA-R720-20261018-S04",
      "url": "https://www.buonalombardia.regione.lombardia.it/wps/portal/site/buonalombardia/DettaglioRedazionale/ricette/secondi-piatti/mostarda-cremonese",
      "title": "Regione Lombardia, Mostarda",
      "accessedOn": "2026-10-18",
      "locator": "Definition, regional varieties, preparation, and serving sections",
      "supports": "Describes fruit candied in syrup and mustard-flavoured, names distinct local varieties including Cremona, Mantova, and Voghera, and discusses pairings. It is regional culinary information, not a single market standard.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP05-Z-MOSTARDA-R720-20261018-S05",
      "url": "https://elioimporting.com/product/mostarda-lazzaris-fruit/",
      "title": "Elio Importing, Lazzaris Mostarda Fruit",
      "accessedOn": "2026-10-18",
      "locator": "Product title, category, SKU, and 2 × 5 kg case description",
      "supports": "A Canadian wholesaler lists one Lazzaris Mostarda Fruit case. It supports current Canadian trade naming and a product package, not retail stock in Québec or a generic measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP05-Z-MOSTARDA-R720-20261018-S06",
      "url": "https://elioimporting.com/our-company/",
      "title": "Elio Importing, Our Company",
      "accessedOn": "2026-10-18",
      "locator": "Canada-wide delivery and service-region sections",
      "supports": "The importer states that its wholesale orders ship across Canada and lists Québec among its service regions. This is the distributor's service claim, not independent confirmation of item inventory.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP05-Z-MOSTARDA-R720-20261018-S07",
      "url": "https://lebonneentente.com/wp-content/uploads/2026/01/be_menu_domeexterieur_85x10_dec2025_fr_v1.pdf",
      "title": "Hôtel Le Bonne Entente, L’expérience Bulle menu (French)",
      "accessedOn": "2026-10-18",
      "locator": "Carpaccio de bœuf and plateau de charcuteries",
      "supports": "A Québec French-language menu uses the borrowed term mostarda alongside meat, cheese, grape must, and charcuterie. It supports local menu usage, not an OQLF ruling, product formula, or supplier identity.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add an identity-only fruit mostarda / mostarda reference in SAUCE_AND_CONDIMENT using the source-attested English product name and provisional Québec borrowed French display. Keep regional recipes, vegetable mostarda, ordinary prepared mustard, chutney, ketchup, and piccalilli distinct; do not infer a common texture, formula, or conversion across fruit-piece and puree styles. Add no forms, measures, density, unit mappings, recipe links, conversions, yields, or substitutions.",
      "sourceIds": [
        "WP05-Z-MOSTARDA-R720-20261018-S01",
        "WP05-Z-MOSTARDA-R720-20261018-S02",
        "WP05-Z-MOSTARDA-R720-20261018-S03",
        "WP05-Z-MOSTARDA-R720-20261018-S04",
        "WP05-Z-MOSTARDA-R720-20261018-S05",
        "WP05-Z-MOSTARDA-R720-20261018-S06",
        "WP05-Z-MOSTARDA-R720-20261018-S07"
      ]
    }
  ]
}
```

## Source register

All pages were accessed on **2026-10-18**. Source IDs below are review-local only; no source records are being written to the shared ledger.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-Z-MOSTARDA-R720-20261018-S01` | Lazzaris, [Fruit Mostarda](https://www.lazzaris.com/en/traditional-products/classic-mostardas/fruit-mostarda/) | Manufacturer’s English product title and one SKU’s variable candied-fruit/sugar/mustard-flavour formulation. The listed packages are not kitchen portions; the recipe is not universal. |
| `WP05-Z-MOSTARDA-R720-20261018-S02` | Lazzaris, [La Mostarda](https://www.lazzaris.com/mostarda/) | Manufacturer’s account of a fruit-and-mustard condiment and named regional styles, including piece and puree differences. It describes the producer’s culinary taxonomy, not a statutory standard. |
| `WP05-Z-MOSTARDA-R720-20261018-S03` | Comune di Cremona, [Le DE.CO. di Cremona](https://www.comune.cremona.it/schede-informative/deco-cremona) | Official local description of Cremona’s candied-fruit-and-mustard preparation and traditional pairings. One regional style only. |
| `WP05-Z-MOSTARDA-R720-20261018-S04` | Regione Lombardia, [Mostarda](https://www.buonalombardia.regione.lombardia.it/wps/portal/site/buonalombardia/DettaglioRedazionale/ricette/secondi-piatti/mostarda-cremonese) | Regional culinary description of fruit candying and mustard finishing, several local styles, and pairings. It does not establish one formula across Lombardy or Italian products. |
| `WP05-Z-MOSTARDA-R720-20261018-S05` | Elio Importing, [Lazzaris Mostarda Fruit](https://elioimporting.com/product/mostarda-lazzaris-fruit/) | Canadian wholesale product listing, `Lazzaris Mostarda Fruit`, 2 × 5 kg case. It does not confirm Québec retail stock, a serving amount, or a general composition. |
| `WP05-Z-MOSTARDA-R720-20261018-S06` | Elio Importing, [Our Company](https://elioimporting.com/our-company/) | The Canadian importer states it ships wholesale orders across Canada and lists Québec among service regions. This is the distributor’s own reach claim, not independent inventory confirmation. |
| `WP05-Z-MOSTARDA-R720-20261018-S07` | Hôtel Le Bonne Entente, [L’expérience Bulle menu](https://lebonneentente.com/wp-content/uploads/2026/01/be_menu_domeexterieur_85x10_dec2025_fr_v1.pdf), French menu published December 2025 | Québec French menu uses `mostarda` with beef carpaccio and charcuterie. Supports local borrowed-word usage only; not a product definition or OQLF ruling. |

## Disposition for integration review

If accepted, integrate the bounded identity example and evidence only after assigning a shared stable ID. Keep `ingredient-references.v1.json` and its generated index consistent with the ledger; do not modify recipe lines. Preserve the broader Section Z checkbox and its remaining open products. This proposal makes no shared-data change and needs no software test, build, emulator run, or deployment.
