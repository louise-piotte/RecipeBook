# WP02 A6 Quinoa and Amaranth Flour Identity Review — 2026-10-11

## Review record

- **Reviewed:** 2026-10-11.
- **Status:** Proposal only; no catalog, ledger, recipe, plan, roadmap, or generated file was changed.
- **Scope:** Recheck the existing generic quinoa-flour and amaranth-flour identities, exact bundled-recipe demand, current Canadian/Québec product labels, and the narrow color/process variants that have direct evidence. This packet does not close the broader A6 review.
- **Proposal-local source IDs:** `WP02-A6-QAM-FLOUR-20261011-S01` through `S14`. The prefix was not present in the existing catalog ledger before this packet was written.

## Recommendation

Keep the active generic flour identities unchanged. Add no aliases to them. Product labels support separate color-specific quinoa-flour identities for white, red, and black quinoa. A current Ontario manufacturer also names sprouted amaranth flour as a distinct processed product; its proposed French display remains provisional and requires an independent fr-CA reviewer before integration.

| Finding | Recommendation | Evidence limit |
| --- | --- | --- |
| Generic quinoa flour | Retain `ingredient-ref-quinoa-flour` as `quinoa flour / farine de quinoa`; no aliases or data. | Generic Canadian and Québec product labels support this milling identity. They do not establish a color default. |
| White quinoa flour | Add `ingredient-ref-white-quinoa-flour`, `white quinoa flour / farine de quinoa blanc`; no aliases or numeric/form data. | Direct Québec product and current Canadian bilingual product-catalog labels. Do not make this an alias of the generic row. |
| Red quinoa flour | Add `ingredient-ref-red-quinoa-flour`, `red quinoa flour / farine de quinoa rouge`; no aliases or numeric/form data. | The wording appears as a separate named ingredient in current Canadian product ingredient declarations and as a product class in a Canadian organic-operator listing. The declarations are for mixed pasta, not a stand-alone retail flour bag. |
| Black quinoa flour | Add `ingredient-ref-black-quinoa-flour`, `black quinoa flour / farine de quinoa noir`; no aliases or numeric/form data. | A 2025 Canadian organic certification annex lists the French product class for a Canadian supplier; a 2026 operator directory corroborates the English class. No current consumer product page or package was located. |
| Generic amaranth flour | Retain `ingredient-ref-amaranth-flour` as `amaranth flour / farine d'amarante`; no aliases or data. Do not assign a scientific species. | OQLF supports the food name and milling use; current Québec and Canadian product sources label unqualified amaranth flour without declaring a species. |
| Sprouted amaranth flour | Add `ingredient-ref-sprouted-amaranth-flour`, English display `sprouted amaranth flour`, provisional French display `farine d'amarante germée`; no aliases or numeric/form data. **Hold integration of this row until an independent bilingual reviewer approves or replaces the French display.** | Everspring Farms currently lists the product and its product codes and describes sprouting and milling. Its page provides no French name, package label, or universally applicable composition/process specification. |

Do not create a white/red/black/tricolor blend identity, sprouted quinoa flour identity, whole-amaranth flour identity, or species-specific amaranth flour from the evidence reviewed here. Holds are detailed below. Keep the existing `ingredient-ref-roasted-quinoa-flour` fixed; this packet does not revisit its provisional French process wording.

## Reconciliation and live catalog audit

The generic rows are already integrated and the prior A6 review explicitly retained them. The current references remain:

| Existing ID | Active display | Aliases / data | Disposition |
| --- | --- | --- | --- |
| `ingredient-ref-quinoa-flour` | `quinoa flour / farine de quinoa` | No aliases; density `null`; unit mappings `[]` | Retain generic milling identity. |
| `ingredient-ref-roasted-quinoa-flour` | `roasted quinoa flour / farine de quinoa torréfiée` | No aliases; density `null`; unit mappings `[]` | Retain as the existing named processed flour. Its French process wording remains provisional under the separate review. |
| `ingredient-ref-amaranth-flour` | `amaranth flour / farine d'amarante` | No aliases; density `null`; unit mappings `[]` | Retain generic milling identity. Keep the supplier spelling `farine d'amaranthe` documentary and inactive. |

Other relevant live references are `ingredient-ref-quinoa` (`quinoa / quinoa`, `GRAIN_AND_CEREAL`), `ingredient-ref-amaranth-grain` (`amaranth / amarante`, `GRAIN_AND_CEREAL`), `ingredient-ref-puffed-quinoa`, `ingredient-ref-quinoa-flakes`, and `ingredient-ref-puffed-amaranth`. Quinoa alone has two forms, dry and cooked; neither generic flour nor amaranth flour has forms. None of the proposed flour products should be modeled as a dry/cooked form of the intact grain.

Pre-integration snapshot captured from the bundled manifest package and research files:

| Dataset | Count | SHA-256 |
| --- | ---: | --- |
| Active ingredient references | 1,081 | `3a381c9d6293786ddf26f8f9dcff3688400caebace60c293175797b67a7a87ab` |
| Ingredient forms | 79 | `e6e9bd997bc1d8eda3047e6fd349c1c6f02876160a6705368c6c2687b3f52419` |
| Legacy import candidates | 75 | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| Research ledger records | 1,380 | `951867ea3e6f3d035d484d84234dd223996080e5c74b27422193be5f040c2258` |
| Manifest | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The 114 manifest-listed recipe files contain 1,123 ingredient rows. The ordered recipe-corpus fingerprint is `68ac43f1fdcd24b38f532fdfab1f0500e1387d651a06df114f208f871685db9c`; it was calculated from each manifest-listed relative path, a NUL byte, exact recipe-file bytes, and a final NUL byte.

An accent-insensitive exact-name check covered active reference names and aliases, form labels and match terms, and all legacy-candidate names and aliases. Exact owners are:

| Exact wording | Current owner |
| --- | --- |
| `quinoa flour`; `farine de quinoa` | `ingredient-ref-quinoa-flour` |
| `roasted quinoa flour`; `farine de quinoa torréfiée` | `ingredient-ref-roasted-quinoa-flour` |
| `amaranth flour`; `farine d'amarante` | `ingredient-ref-amaranth-flour` |
| `white quinoa flour`; `farine de quinoa blanc` | None |
| `red quinoa flour`; `farine de quinoa rouge` | None |
| `black quinoa flour`; `farine de quinoa noir` | None |
| `tricolor quinoa flour`; `farine de quinoa tricolore` | None |
| `sprouted quinoa flour`; `farine de quinoa germée` | None |
| `sprouted amaranth flour`; `farine d'amarante germée` | None |
| `farine d'amaranthe` | None; previously documented as a supplier spelling, not activated |

No proposed ID (`ingredient-ref-white-quinoa-flour`, `ingredient-ref-red-quinoa-flour`, `ingredient-ref-black-quinoa-flour`, or `ingredient-ref-sprouted-amaranth-flour`) is present in active references, forms, legacy candidates, or ledger record IDs. There is no matching quinoa/amaranth flour legacy candidate. Existing ledger entries cover only the generic quinoa, roasted-quinoa flour, amaranth-flour, and grain identities; they do not cover these proposed IDs or the proposed source prefix.

## Bundled recipe demand

I scanned all 114 manifest-listed recipe files, all 1,123 ingredient rows, and the complete serialized recipe contents for English/French names and candidate qualifiers. The only matching ingredient line is recipe 016, ingredient 1: `2 cups cooked quinoa`, already linked to `ingredient-ref-quinoa` and `ingredient-form-quinoa-cooked`. Recipe 018 mentions quinoa in its serving description/instructions but has no quinoa ingredient row. There are no quinoa-flour, amaranth-flour, color-qualified, or sprouted-flour ingredient lines, and no amaranth mentions. No recipe link, alias, portion, form, measure, density, conversion, yield, or substitution is proposed.

## Product, species, and processing boundaries

### Quinoa

The generic `quinoa flour / farine de quinoa` remains appropriate for an unqualified milling product. Canadian and Québec producers/distributors label generic quinoa flour without saying the incoming grain color; that does not establish that all such flour is white. A Québec mill’s professional catalog lists ordinary quinoa flour and roasted quinoa flour in separate product headings, which supports retaining the existing generic/roasted boundary, but it does not specify the roast/mill sequence [S04].

Color-qualified names are supported only where they occur as identifiable flour products or ingredient materials:

- **White:** a Québec mill sells a product titled `Farine de quinoa blanc biologique`; Tootsi’s current Canadian catalog pairs `Organic white quinoa flour` with `Farine de quinoa blanc bio`, and the current item page describes it as finely ground white quinoa seeds [S05–S06]. This supports an identity beneath the unqualified flour family, not a default color for it.
- **Red:** current Canadian bilingual ingredient declarations for GoGo Quinoa macaroni separately name white and red quinoa flour. A Canadian organic-operator product list also includes red quinoa flour. The retail ingredient lists prove the ingredient wording and its use in a product formula, but do not establish a stand-alone red-flour bag, composition standard, or baking behavior [S08–S09]. The narrow identity is still useful for recipe/catalog matching when a recipe names red quinoa flour explicitly.
- **Black:** Tootsi Impex’s Canadian organic certification annex lists `Farine de quinoa noir sans gluten`; a current operator directory separately lists black quinoa flour [S07, S10]. These are portfolio/certification evidence, not package imagery or proof of current retail stock. They support a named flour class, but no brand, organic, gluten-free, measure, or composition claim is carried into the catalog.

OQLF identifies quinoa as *Chenopodium quinoa*. It separately identifies kaniwa/canihua as *Chenopodium pallidicaule* and specifically discourages the misleading French calque `bébé quinoa`, noting that the quinoa plant is different [S01, S11]. Do not add `kaniwa`, `canihua`, `cañihua`, `baby quinoa`, or `bébé quinoa` as quinoa flour aliases. Do not infer that a color descriptor is a separate species.

**Holds:** Keep `tricolor quinoa flour / farine de quinoa tricolore` out of the active set pending a current manufacturer/retail label and French wording that show what the tricolor flour product is. The only additional hit is an operator certification list: it does not state whether the product is milled from a blend of colored grains or is itself a standardized blend [S10]. Keep sprouted quinoa flour out for now: an older Canadian processor brochure lists it, and a Canadian-facing retailer currently lists an imported sprouted-quinoa flour product, but no current Canadian manufacturer's product page/package plus fr-CA label was located [S12]. Sprouting is a meaningful process qualifier if a current source confirms the product; do not merge that wording into generic or roasted quinoa flour.

### Amaranth

Retain unqualified `amaranth flour / farine d'amarante` as a generic milling product. OQLF’s food entry prefers `amarante` and states that the seeds can be reduced to flour. A current Québec mill product and Canadian supplier listings use the same unqualified product class [S02, S05, S13]. Those sources do not specify one amaranth species. OQLF’s cited food example is amarante queue de renard, but the commercial labels reviewed here do not identify the source species; do not narrow the generic catalog row to that plant or attach a species alias.

Everspring Farms, an Ontario sprouting/milling supplier, currently lists **Sprouted Amaranth Flour** as a separate product, with conventional and organic product codes. This supports a process-qualified flour identity distinct from generic amaranth flour. The manufacturer's current page does not supply a French display or a process specification beyond the product name and the supplier’s sprouting/milling capabilities [S14]. The proposed `farine d'amarante germée` is therefore a provisional translation only; an independent Québec French reviewer must approve or replace it before integration.

Do not activate `farine d'amaranthe`: SATAU’s live distributor page uses this spelling for a Cuisine Soleil amaranth-flour product, but OQLF records `amaranthe` in chemistry for a red-brown powder/coloring material and associates that term with `amarante`. The active preferred botanical/food display remains `farine d'amarante` [S02–S03, S13]. Likewise, do not add `kiwicha` or `rajgira` as aliases: OQLF lists `kiwicha` as an English translation for its food entry, not as a Québec French product synonym, and no Canadian/Québec amaranth-flour label reviewed here establishes either term as a name for this generic flour [S02].

**Holds:** Do not add `whole amaranth flour`, `whole-grain amaranth flour`, or a dehulled/degermed grade. The product labels and manufacturer page do not establish the milling extraction class. Keep sprouted amaranth separate from the generic identity; do not make sprouted an alias or form of generic amaranth flour.

## Exact proposed reference rows

All proposed rows are identity-only, category `FLOUR_AND_STARCH`, with no aliases, no forms, `defaultDensity: null`, and `unitMappings: []`. Do not add `organic`, `gluten-free`, brand, particle-size, whole-grain, or recipe-use phrases as aliases.

```json
{
  "id": "ingredient-ref-white-quinoa-flour",
  "nameFr": "farine de quinoa blanc",
  "nameEn": "white quinoa flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

```json
{
  "id": "ingredient-ref-red-quinoa-flour",
  "nameFr": "farine de quinoa rouge",
  "nameEn": "red quinoa flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

```json
{
  "id": "ingredient-ref-black-quinoa-flour",
  "nameFr": "farine de quinoa noir",
  "nameEn": "black quinoa flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

```json
{
  "id": "ingredient-ref-sprouted-amaranth-flour",
  "nameFr": "farine d'amarante germée",
  "nameEn": "sprouted amaranth flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The final row is not cleared for integration until the independent fr-CA terminology review is complete. If the reviewer cannot accept a concise stable display, retain the evidence as a candidate and leave the row unintegrated.

## Source-to-claim register

All sources were accessed on 2026-10-11. Proposal-local IDs are unique to this report; this register is not a ledger write.

| ID | Source and claim | Limit |
| --- | --- | --- |
| **WP02-A6-QAM-FLOUR-20261011-S01** | OQLF, [quinoa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa). Gives Latin name *Chenopodium quinoa*, preferred French `quinoa`, and its pseudocereal/grain context. | Grain terminology and species boundary, not a flour grade or milling specification. |
| **WP02-A6-QAM-FLOUR-20261011-S02** | OQLF, [amarante](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante). Prefers `amarante`; says edible seeds can be reduced to flour; lists `amaranth` and `kiwicha` in English translations. | Food-term entry uses a named amaranth plant; it does not identify the species used by every current commercial flour. `Kiwicha` is not evidence of a Québec product alias. |
| **WP02-A6-QAM-FLOUR-20261011-S03** | OQLF, [amaranthe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8884624/amaranthe). Defines the chemical term as a red-brown powder used to color food and associates it with `amarante`. | A chemistry/coloring term; supports withholding the distributor spelling as an unqualified alias, not a claim that every product use is misidentified. |
| **WP02-A6-QAM-FLOUR-20261011-S04** | Quinoa du Québec, [professional product list](https://www.quinoaquebec.com/nosproduitprofessionnel). Separately lists conventional and roasted quinoa flour among flour products and separately lists white/red whole-quinoa varieties. | Does not establish roast/mill sequence, universal milling profile, or that color-qualified grain automatically defines a flour SKU. |
| **WP02-A6-QAM-FLOUR-20261011-S05** | Aliments du Québec / Pure Gaspésie, [Farine de quinoa blanc biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-de-quinoa-blanc-biologique) and [Farine d'amarante biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-damarante-biologique). Exact current Québec product names; the mill says its grains are transformed into flour locally. | The white-quinoa page establishes one product, not a default for generic quinoa flour. The amaranth page does not name a species or extraction class. |
| **WP02-A6-QAM-FLOUR-20261011-S06** | Tootsi, [Canadian catalog](https://www.tootsi.com/forms/TOOTSI_CATALOG_CANADA.pdf), [white quinoa flour product page](https://tootsi.com/en-GB/Product/Detail/31501), and [French gluten-free flour listing](https://tootsi.com/fr-FR/Product/Index/1020). The bilingual catalog pairs `Organic white quinoa flour` with `Farine de quinoa blanc bio`; page 31501 says it is made from finely ground white quinoa seeds. | The product page’s serving/usage statements are specific to this supplier product and are not transferred as recipe measures, density, or substitutions. |
| **WP02-A6-QAM-FLOUR-20261011-S07** | Ecocert Canada, [2025 Tootsi Impex organic certificate, French annex](https://www.tootsi.com/pdf/bio_fr.pdf). Lists `Farine de quinoa noir sans gluten` under the Canadian supplier’s certified product range. | Certification annex, not a retail package or proof of current stock; organic/gluten-free modifiers are not added to catalog names. |
| **WP02-A6-QAM-FLOUR-20261011-S08** | Well.ca, [GoGo Quinoa macaroni, French listing](https://well.ca/fr/produits/gogo-quinoa-red-white-quinoa_14958.html). Its French ingredient statement lists organic white-rice flour, white-quinoa flour, and red-quinoa flour. | Retail ingredient declaration for a mixed pasta, not a direct sale page for a bag of red quinoa flour. |
| **WP02-A6-QAM-FLOUR-20261011-S09** | Food Basics, [Organic Red and White Quinoa Macaroni Pasta](https://www.foodbasics.ca/aisles/pantry/pasta-rice-beans/pasta/organic-red-and-white-quinoa-macaroni-pasta/p/896899000272). Current English/French item and ingredient statement separately name white and red quinoa flour. | Retail product formula; does not establish a standalone flour brand, ingredient ratios, process, or baking behavior. |
| **WP02-A6-QAM-FLOUR-20261011-S10** | OCIA, [2026 certified operations list](https://ocia.org/wp-content/uploads/2026/04/cor_certified_operations.pdf). Under Canadian operator listings, names white, red, black, and tricolor quinoa flour among certified product classes. | Operator/certification inventory, not package labeling, consumer availability, detailed composition, or Québec French wording. Used as supporting evidence only. |
| **WP02-A6-QAM-FLOUR-20261011-S11** | OQLF, [kaniwa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532687/kaniwa). Identifies *Chenopodium pallidicaule* separately from quinoa and discourages French `bébé quinoa`. | Grain-level terminology; it does not establish a kaniwa-flour product or alias. |
| **WP02-A6-QAM-FLOUR-20261011-S12** | Everspring Farms, [2020 bakery brochure](https://www.everspringfarms.ca/wp-content/uploads/2020/10/bakery.pdf), and Naturitas Canada, [Salud Viva sprouted quinoa flour](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/flours/eco-sprouted-quinoa-flour-400-g-salud-viva). The older Canadian processor brochure lists sprouted quinoa flour; the Canadian-facing retailer describes sprouted, dried, low-temperature-milled quinoa flour from an imported brand. | The brochure is older and not a current SKU page; the retailer listing said the item was awaiting stock and is not a Canadian manufacturer label. No bilingual Québec package name was located. |
| **WP02-A6-QAM-FLOUR-20261011-S13** | SATAU / Cuisine Soleil, [current French flour list](https://satau.ca/fr/nos-produits/cuisine-soleil/). Lists an amaranth flour product as `Farine d'amaranthe`; the same live page has exact product identifier and package size. | Distributor listing spelling conflicts with OQLF’s preferred `amarante` and the existing accepted display; retain as documentary evidence, not search data. |
| **WP02-A6-QAM-FLOUR-20261011-S14** | Everspring Farms, [Sprouted Amaranth Flour](https://www.everspringfarms.ca/product/sprouted-amaranth-flour/). Current Ontario manufacturer lists conventional and organic product codes for sprouted amaranth flour and describes sprouting/milling capabilities. | English-only bulk product page; no French label, grain-species statement, exact process sequence, home measurement, density, or universal substitution evidence. |

## Conflicts and limits

- `quinoa flour` and `amaranth flour` are already generic products. The qualified identities must not overwrite them or add the generic phrase as an alias on a qualified row.
- The current color-specific quinoa evidence is asymmetric: white has direct Québec and Canadian flour product listings; red is named as a flour ingredient in active Canadian pasta listings and as a certified product class; black has bilingual certification evidence plus a product-class listing but no consumer label in this search. Keep those limits attached to any integration decision.
- The OCIA listing includes tricolor quinoa flour, but there is no accompanying current bilingual package or product statement explaining whether that means flour milled from tricolor grain or a flour blend. Hold it; do not synthesize `farine de quinoa tricolore` from the English inventory term.
- Amaranth species and extraction class are absent from product labels. No species, “whole,” “whole-grain,” dehulled, roasted, toasted, or other milling qualifier is assigned to generic amaranth flour.
- SATAU’s `farine d'amaranthe` product spelling is recorded but not activated because OQLF’s entry creates a direct lexical collision with a coloring-agent term. Existing `farine d'amarante` remains preferred.
- Everspring’s sprouted-amaranth identity is supported, but its French display is not source-attested. The independent fr-CA reviewer must accept or replace the provisional phrase before the identity can be integrated.
- No source supports density, cup/weight equivalence, conversions, yield, substitution, unit mapping, or a recipe link. No product-package weight is repurposed as a cooking measure.

## Validation and review notes

- Read-only review only; the only requested write is this proposal file.
- No app tests were run, consistent with the proposal-only/no-tests instruction.
- Do not treat this packet as completion of all A6 regional grain-flour work.
- **Independent review required:** approve or replace `farine d'amarante germée` for the proposed sprouted-amaranth row. The color-qualified quinoa French names are supported by current Québec/Canadian French product or certification labels; no separate reviewer hold is recorded for those names.
