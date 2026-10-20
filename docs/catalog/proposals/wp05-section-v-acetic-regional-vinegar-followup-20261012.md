# WP05 Section V — Acetic and regional vinegar follow-up

**Packet type:** proposal-only catalog and recipe-corpus review  
**Reviewed and source-access date:** 2026-10-12  
**Status:** `Sukang Iloko` was integrated as a cane-vinegar alias in R612; the broader Section V recommendations remain open.
**Scope:** sherry vinegar, unqualified wine vinegar, fruit-vinegar wording, and palm-vinegar/product boundaries.  
**Source namespace:** `WP05-ACETIC-REGIONAL-20261012-S01` through `S14`. These IDs are local to this proposal and have not been added to the shared ledger.

## Recommendation

Advance two identity-only entries under `SAUCE_AND_CONDIMENT`:

1. Add generic **wine vinegar / vinaigre de vin** as its own broad, source-defined vinegar class. Do not assign the phrase as an alias to red-wine vinegar, white-wine vinegar, or sherry vinegar. Canada’s compositional standard defines wine vinegar as vinegar made from wine, and CFIA’s French import classes use `vinaigre de vin`. [S01–S03]
2. Add **sherry vinegar / vinaigre de Xérès** as a distinct source-qualified product. Keep it separate from generic wine vinegar, the red- and white-wine vinegar identities, and sherry wine. The Canadian GI record gives the bilingual translation `SHERRY VINEGAR / VINAIGRE DE XÉRÈS`, and a current Canadian food-service supplier uses the French product name. [S04–S06]

Keep aliases empty for both proposals. Do not add forms, measurements, density, unit mappings, recipe links, conversions, preservation guidance, or substitutions. The recipe audit supports no relinking.

| Proposed ID | English / fr-CA display | Aliases | Boundary |
|---|---|---|---|
| `ingredient-ref-wine-vinegar` | `wine vinegar` / `vinaigre de vin` | None | Own the unqualified standard class. Keep the existing red- and white-wine vinegar IDs as separately named products. Do not alias `wine vinegar` to either one. |
| `ingredient-ref-sherry-vinegar` | `sherry vinegar` / `vinaigre de Xérès` | None | Keep distinct from generic wine vinegar and from sherry wine. Do not attach the protected Spanish GI name `Vinagre de Jerez` as a broad alias; its protected scope is narrower than every product labelled sherry vinegar. |

Do not add a generic `fruit vinegar / vinaigre de fruits` or `palm vinegar / vinaigre de palme` identity or alias. Hold raspberry vinegar and other fruit-flavoured/fruit-source products for exact product review: Canadian and Québec sources show that the phrase can describe a vinegar-and-fruit preparation or a flavoured wine vinegar, not one stable fermented product. [S07–S10] Keep palm products source-qualified: official Philippine material distinguishes nipa sap, coconut sap/water, and other palm saps, while no reviewed source establishes one Québec/Canadian bilingual name for a catch-all palm-vinegar product. [S11–S13]

## Live repository and ownership audit

The current package snapshot contains **1,152 references**, **79 forms**, **114 manifest-listed recipes**, and **1,123 ingredient rows**. The legacy candidate file has **68 candidates**; the research ledger has **1,448 records** and **8 unit conversions**. The concatenated recipe-file audit digest is `443223a1e1514fa725cea2292f59d2f76c849d27c283ade603dc67048d4917b9`.

The active vinegar family is currently:

- `ingredient-ref-apple-cider-vinegar` — `apple cider vinegar / vinaigre de cidre de pomme`; aliases `cider vinegar`, `apple vinegar`, `ACV`, and `vinaigre de cidre`.
- `ingredient-ref-balsamic-vinegar` — `balsamic vinegar / vinaigre balsamique`.
- `ingredient-ref-cane-vinegar` — `cane vinegar / vinaigre de canne`; English alias `sugar cane vinegar`.
- `ingredient-ref-chinkiang-vinegar` — `Chinkiang vinegar / vinaigre de Chinkiang`; qualified Zhenjiang aliases.
- `ingredient-ref-coconut-vinegar` — `coconut vinegar / vinaigre de noix de coco`, no aliases.
- `ingredient-ref-malt-vinegar` — `malt vinegar / vinaigre de malt`.
- `ingredient-ref-red-wine-vinegar` — `red wine vinegar / vinaigre de vin rouge`.
- `ingredient-ref-rice-vinegar` and `ingredient-ref-seasoned-rice-vinegar` — plain and seasoned rice vinegars.
- `ingredient-ref-vinegar` — generic `vinegar / vinaigre`.
- `ingredient-ref-white-vinegar` — `white vinegar / vinaigre blanc`, with the reviewed distilled-white, spirit/alcohol, and grain aliases.
- `ingredient-ref-white-wine-vinegar` — `white wine vinegar / vinaigre de vin blanc`.

There are no vinegar forms. Exact normalized checks found no active reference, form, or legacy owner for `wine vinegar`, `vinaigre de vin`, `sherry vinegar`, `vinaigre de Xérès`, `fruit vinegar`, `vinaigre de fruits`, `raspberry vinegar`, `vinaigre de framboise`, `palm vinegar`, `vinaigre de palme`, `nipa vinegar`, `kaong vinegar`, or `maple vinegar`. The legacy file has no vinegar candidate; its `ingredient-ref-raspberry` entry is a fruit candidate, not a vinegar identity. The proposed wine- and sherry-vinegar IDs have no existing ledger records. No active or prior source ID uses this proposal’s reserved namespace.

## Recipe-corpus audit

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned for vinegar wording and the proposed subtype names. Five rows contain vinegar wording:

| Recipe / row | Current text and owner | Disposition |
|---|---|---|
| 007, ingredient 5 | `5 g vinegar or lime juice`, unlinked compound alternative | Leave unchanged; it does not identify vinegar style. |
| 074, ingredient 15 | `1 tbsp vinegar`, `ingredient-ref-vinegar` | Leave unchanged; it is generic vinegar. |
| 085, ingredient 8 | `1 tbsp vinegar`, `ingredient-ref-vinegar` | Leave unchanged; it is generic vinegar. |
| 091, ingredient 10 | `1 tsp white vinegar`, `ingredient-ref-white-vinegar` | Leave unchanged. |
| 101, ingredient 8 | `1 tsp white vinegar`, `ingredient-ref-white-vinegar` | Leave unchanged. |

There are **zero exact recipe mentions** of wine vinegar, sherry vinegar, fruit vinegar, raspberry vinegar, palm vinegar, nipa vinegar, kaong vinegar, or maple vinegar anywhere in the recipe JSON. No recipe row is relinked or otherwise changed by this proposal.

## Product and naming decisions

### Generic wine vinegar

The prior vinegar integration kept unqualified `wine vinegar` unassigned so it would not be placed on either red- or white-wine vinegar. This follow-up retains that separation and recommends a generic identity instead. CFIA’s incorporated compositional standard defines `Wine Vinegar` as vinegar made from wine; its separate standards name the alcohol/white/grain and cider/apple classes. [S01] CFIA’s French import classification names `vinaigre de vin`, alongside the distinct red/white wine-vinegar names used by Québec retailers in the prior integration. [S02, S03]

This is a broader standard class, not an alias for one subtype. Do not add `wine vinegar` to the red- or white-wine rows, and do not add red/white as aliases to the generic row. Do not treat ordinary wine, cooking wine, sherry wine, or rice wine as vinegar. Canada’s Food and Drug Regulations define vinegar by acetous fermentation of an alcoholic liquid; that definition supports the juice/fermentation boundary only and does not establish equivalence or preservation use. [S03]

### Sherry vinegar

Propose an independent `sherry vinegar / vinaigre de Xérès` identity with no aliases. The Canadian Intellectual Property Office’s official GI record translates the protected Spanish `Vinagre de Jerez` designation as `SHERRY VINEGAR` and `VINAIGRE DE XÉRÈS`, and classifies it as a wine vinegar. [S04] The EU product specification further limits `Vinagre de Jerez` to wine vinegar produced and aged in the designated area; that protected designation is not a global synonym for every product sold under the broader English name. [S05] A current Canadian French-language supplier listing uses `Vinaigre de Xérès` for a sherry-vinegar product. [S06]

The proposed row is separate from the generic wine-vinegar identity and the active red/white wine-vinegar identities. Do not add `Jerez vinegar`, `Vinagre de Jerez`, `sherry`, or `xérès` alone as aliases: the first two are tied to a narrower regional designation, while the latter two also name the alcoholic beverage. The accent-folding search handles unaccented `xeres` without a second alias.

### Fruit and raspberry vinegar

Hold `fruit vinegar / vinaigre de fruits` as a broad identity. The reviewed sources do not establish one product boundary or Québec display term spanning fermented fruit-source vinegars and fruit-flavoured/compound vinegars. The Philippine Statistics Authority separately classifies pineapple, banana, coconut-water, coconut-sap, palm, sugar-cane, and apple-cider vinegars; that list is evidence of product diversity, not a bilingual Canadian naming rule. [S11]

Do not add `raspberry vinegar / vinaigre de framboise` as an alias or an active reference in this tranche. OQLF records the exact bilingual term but describes a raspberry-juice, vinegar, and sugar preparation. [S08] CFIA’s current French ingredient-labelling guidance identifies raspberry vinegar as a non-standardized vinegar for which the ingredient list is required. [S07] Current Québec/Canadian retail examples vary: one Québec producer’s product labelled `vinaigre de framboise` lists white-wine vinegar and raspberries; a Canadian product labelled raspberry-flavoured wine vinegar lists wine vinegar and natural raspberry flavour. [S09, S10] These examples support a named prepared/flavoured product family, but not one unqualified fruit-fermentation identity or an alias on the raspberry fruit or a wine-vinegar row.

The North American WP06 sweep’s Parks Canada recipe titled “Raspberry Vinegar” is a historical beverage using raspberry-juice concentrate, lemon, lemonade, and soda water; it is not evidence for a vinegar ingredient identity. Preserve that earlier decision. [P1]

Other source-specific fruit candidates, including pineapple, banana, and fruit-wine vinegars, remain held until product identity and Québec/Canadian bilingual names are confirmed from direct product or authoritative terminology sources. The Philippine FDA’s revised vinegar guidelines are explicitly a **draft for comments**; they list fruit and nipa-sap vinegars separately and describe fruit, juice, and flavour ingredients, but are not treated as an in-force Canadian or Philippine naming standard here. [S12]

### Maple vinegar

Keep `maple vinegar / vinaigre d’érable` held, consistent with WP06. Érable du Québec describes two products under that name: vinegar made by fermenting maple sap and a neutral alcohol- or white-wine vinegar with maple syrup/aromatic components added. [S14] This is a Québec regional product boundary, not a fruit-vinegar identity, and the same display phrase can cover a fermented product and a flavoured/compound vinegar. Do not alias it to generic wine, fruit, cane, or white vinegar.

### Palm, nipa, and coconut products

Keep unqualified `palm vinegar / vinaigre de palme` unassigned and do not add it to `ingredient-ref-coconut-vinegar`. The active coconut-vinegar reference stays as integrated, with no aliases; coconut-water, coconut-sap, mixed, and regional/spiced products remain source-qualified or unresolved under the prior WP05 decision. [P2]

Official Philippine sources show why a palm umbrella is too broad: the FDA’s draft list separates coconut vinegar, coconut-water vinegar, fruit vinegar, and nipa-sap vinegar, and lists coconut, nipa, kaong, and buri palm saps as distinct raw materials. Because this page is a draft, it is used only as a terminology research lead. [S12] The current TESDA nipa-sap processing standard defines nipa palm and nipa sap, and identifies nipa vinegar separately from nipa wine and nipa-based spiced condiments. [S13] It supports a future review of a source-qualified `nipa vinegar` candidate, but the reviewed sources do not establish an authoritative Québec French label or Canadian retail name for that product. A later R612 review integrates `Sukang Iloko` as a borrowed alias on cane vinegar using Philippine, Canadian, and French product-title evidence. Hold `nipa vinegar`, `kaong vinegar`, `buri vinegar`, and `sukang tuba` from active aliases/IDs pending their own bilingual market review. In particular, do not treat `tuba` as a universal synonym for coconut vinegar. See [the R612 review](wp05-sukang-iloko-alias-review-r612-20261018.md).

## Reconciliation with previous WP05/WP06 decisions

- The integrated [WP05 vinegar proposal](wp05-section-v-vinegar-acid-gap-review-20261012.md) and [vinegar batch](../batches/wp05-section-v-vinegar-acid-integration-20261012/README.md) already established the current vinegar identities, the distinction from verjus, and the holds on sherry, unqualified wine vinegar, and broad fruit/palm products. This follow-up leaves red/white wine vinegars separate and revisits the two unqualified wine terms as possible *new* rows rather than aliases on an existing subtype.
- The [WP05 rice-vinegar review](wp05-rice-vinegar-boundary-review-20261009.md) keeps plain rice vinegar, seasoned rice vinegar, and Chinkiang/Zhenjiang vinegar distinct. No alias or decision in this packet changes that scope.
- The [WP05 acidic-juice boundary review](wp05-section-v-acidic-juice-and-preparation-boundaries-gap-review-20261012.md) distinguishes verjus from acetous-fermented vinegar and leaves broad sour-grape products held. This packet preserves that separation.
- The [WP06 North American cuisine sweep](wp06-north-american-cuisine-gap-sweep-20261009.md) treats the historical raspberry-vinegar drink as out-of-scope for ingredient identity and leaves maple vinegar open. Both decisions remain in place.
- The [WP06 Southeast Asia sweep](wp06-southeast-asia-cuisine-gap-sweep-20261011.md) and previous WP05 coconut-vinegar work keep regional preparations and source-qualified coconut products from becoming general aliases. This packet does not reopen them.

## Sources

Sources were accessed on 2026-10-12. Proposal-local source IDs are not ledger entries.

| ID | Source and locator | Supports | Limitation |
|---|---|---|---|
| `WP05-ACETIC-REGIONAL-20261012-S01` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 16, §16.1.1 and adjacent vinegar classes. | A named generic wine-vinegar class; wine vinegar is vinegar made from wine. | Canadian compositional identity, not a cooking equivalence or subtype alias rule. |
| `WP05-ACETIC-REGIONAL-20261012-S02` | CFIA, [AIRS updates, French page](https://inspection.canada.ca/fr/importation-aliments-vegetaux-ou-animaux/vegetaux-produits-vegetaux/sari/mises-jour-acia-sari-2024-12-02), commodity classes under heading 22.09. | Current federal French labels such as `vinaigre de vin`, `vinaigre de cidre`, and separate named vinegar classes. | Import classification does not define consumer product composition. |
| `WP05-ACETIC-REGIONAL-20261012-S03` | Department of Justice Canada, [Food and Drug Regulations, B.19.001](https://laws-lois.justice.gc.ca/eng/regulations/C.R.C.,_c._870/section-B.19.001.html), current to 2026-09-21 when accessed. | Defines vinegar by acetous fermentation of an alcoholic liquid; supports the juice/fermentation distinction. | No quantitative value or preservation guidance is used. |
| `WP05-ACETIC-REGIONAL-20261012-S04` | CIPO, [Canadian Trademarks Journal, 10 July 2019](https://www.ic.gc.ca/opic-cipo/tmj/fra/10Jul2019_fr.pdf?edition=07-10&year=2019), GI record for `VINAGRE DE JEREZ`. | Official Canadian translation as `SHERRY VINEGAR / VINAIGRE DE XÉRÈS`; identifies the protected product as wine vinegar from the designated territory. | Translation and protected GI scope, not an alias list for every sherry-vinegar SKU. |
| `WP05-ACETIC-REGIONAL-20261012-S05` | European Commission, [Vinagre de Jerez PDO product specification](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A52020XC0720%2801%29). | Protected product is made from eligible wines in its production area and aged under the designation. | Regional specification only; not generalized to all sherry vinegar. |
| `WP05-ACETIC-REGIONAL-20261012-S06` | Qualifirst Canada, [Vinaigre de Xérès 50 Ans, Columela](https://odoo.qualifirst.com/fr_CA/food/vinegars/sherry-vinegar-50-year-m). | Current Canadian food-service listing uses the French product name `Vinaigre de Xérès` for sherry vinegar. | One imported product listing; not a universal specification. |
| `WP05-ACETIC-REGIONAL-20261012-S07` | CFIA, [Liste d’ingrédients et allergènes sur les étiquettes des aliments](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/liste-dingredients-allergenes), section on prepackaged vinegars. | Distinguishes standardized vinegar classes from non-standardized vinegar, including raspberry vinegar, for ingredient-list purposes. | Labelling guidance, not a recipe identity definition. |
| `WP05-ACETIC-REGIONAL-20261012-S08` | OQLF, [vinaigre de framboise (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18494338/vinaigre-de-framboise). | Québec French preferred term paired with English `raspberry vinegar`; note describes raspberry juice, vinegar, and sugar. | Entry last updated in 1987; not a current compositional standard. |
| `WP05-ACETIC-REGIONAL-20261012-S09` | Gourmande boutique, [Vinaigre de framboise — Les Délices de l’Île d’Orléans](https://gourmandeboutique.com/products/vinaigre-de-framboise). | Québec product label and ingredient list name white-wine vinegar and raspberries. | One producer’s product. |
| `WP05-ACETIC-REGIONAL-20261012-S10` | Farm Boy, [Raspberry Flavoured Wine Vinegar](https://www.farmboy.ca/products/farm-boy-raspberry-flavoured-wine-vinegar-500-ml/). | Canadian bilingual listing identifies wine vinegar with natural raspberry flavour and names the French base `vinaigre de vin`. | Retail information can change; one SKU only. |
| `WP05-ACETIC-REGIONAL-20261012-S11` | Philippine Statistics Authority, [PSCC heading 22.09](https://psa.gov.ph/classification/pscc/heading/22.09). | Separately classifies pineapple, banana, palm, cane, coconut-water, and coconut-sap vinegars. | Philippine commodity classes, not Québec bilingual naming or recipe evidence. |
| `WP05-ACETIC-REGIONAL-20261012-S12` | Philippine FDA, [Draft for comments: revised vinegar guidelines](https://www.fda.gov.ph/draft-for-comments-revised-guidelines-for-the-standard-of-vinegar-repealing-administrative-order-no-134-s-1970-entitled-regulation-prescribing-the-standards-of-identity-and-quality-of-vi/), identity and basic-ingredient sections. | Proposed taxonomy separates fruit, fruit-wine, coconut-water, and nipa-sap vinegar and lists palm-sap sources. | Explicitly a draft for comments; used only to identify distinctions for later source review, not as an in-force standard. |
| `WP05-ACETIC-REGIONAL-20261012-S13` | TESDA, [Nipa Sap By-Products Processing Level II](https://tesda.gov.ph/Downloadables/CS/CS-Nipa%20Sap%20By-Products%20Processing%20Level%20II.pdf), February 2026 glossary. | Defines nipa sap/nipa vinegar and separates nipa vinegar, nipa wine, and nipa-based condiments. | Philippine training standard; does not supply Québec French or Canadian retail wording. |
| `WP05-ACETIC-REGIONAL-20261012-S14` | Érable du Québec, [Produits fins à l’érable](https://erableduquebec.ca/produits/produits-fins/), section `Vinaigre d’érable`. | The same Québec label covers fermented maple sap vinegar and a neutral-vinegar product with maple syrup/aromatic components. | Association’s product-family description; not a uniform formulation or identity standard. |

## Limits and next review

This packet is a proposal only. It adds no canonical reference, alias, form, ledger entry, recipe link, numeric behavior, preservation instruction, or substitution. The two proposed rows have no exact recipe demand. Retail evidence is product-specific, the OQLF raspberry-vinegar entry is older, and the Philippine FDA vinegar taxonomy cited here remains a draft. Future fruit- or palm-source identities need direct product-boundary evidence and Québec/Canadian bilingual naming before activation. Section V remains open.

[P1]: wp06-north-american-cuisine-gap-sweep-20261009.md
[P2]: ../batches/wp05-section-v-vinegar-acid-integration-20261012/README.md
