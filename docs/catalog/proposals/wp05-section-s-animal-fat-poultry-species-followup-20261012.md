# WP05 Section S: goose and chicken fat follow-up

- Date: 2026-10-12
- Status: proposal only; no canonical data or shared planning files changed.
- Scope: Québec/Canadian naming, species identity, and product-state boundaries for goose and chicken cooking fats.

## Recommendation

Add two distinct `FAT_AND_OIL` references when this tranche is integrated:

| Suggested ID | English display | French display | Proposed aliases | Boundary |
|---|---|---|---|---|
| `ingredient-ref-goose-fat` | `goose fat` | `graisse d’oie` | French: `gras d’oie`; English: none | Standalone edible goose cooking fat. Do not state that it is rendered or clarified; the product sources do not name that process. |
| `ingredient-ref-rendered-chicken-fat` | `rendered chicken fat` | `gras de poulet fondu` | English: `chicken schmaltz`; French: none | Species- and process-qualified culinary fat. Do not add plain `chicken fat` or `gras de poulet` as aliases while raw fat tissue remains a possible reading. |

The goose name pair is supported by a Québec goose producer’s cooking-fat product and a manufacturer’s matching French/English product pages. The chicken pair has good Canadian product evidence, including an Ontario product explicitly described as rendered chicken fat and a Canadian manufacturer’s English/French ingredient wording. The French chicken wording is currently evidenced inside prepared foods rather than on a standalone fat product, so keep that source limitation visible in any later ledger entry.

Do not alias either species to rendered duck fat. Keep bare `schmaltz`, `goose schmaltz`, `poultry fat`, `gras de volaille`, and `graisse de volaille` unassigned. `Schmaltz` is commonly described as rendered chicken or goose fat, and generic poultry fat cannot identify a species. Do not add clarified, anhydrous, spread, or raw-tissue forms.

## Repository audit

The live bundled package contains 1,152 ingredient references, 79 forms, 114 manifest-listed recipes, and 1,123 ingredient rows. The legacy identity file contains 68 candidates and the research ledger has 1,448 records.

Current relevant references include `ingredient-ref-rendered-duck-fat` (`rendered duck fat` / `gras de canard fondu`, no aliases), lard, leaf lard, rendered pork fat, beef suet, edible tallow, vegetable shortening, and margarine. No active reference, form, or legacy candidate owns an exact goose-fat or chicken-fat name. The ledger already records the accepted duck-fat decision that goose, chicken, and generic poultry fats stay separate; this proposal narrows those held candidates without changing that decision. No goose-fat or chicken-fat forms are present.

An exact-name audit of references, forms, legacy candidates, and recipe rows found no existing goose-fat or chicken-fat owner. The only relevant ledger hit is the duck-fat record’s prior hold for goose, chicken, and generic poultry-fat identities. Do not reuse the duck reference or treat the held ledger wording as an alias.

## Recipe-demand scan

All 114 manifest-listed recipes and all 1,123 ingredient rows were scanned for goose fat, rendered goose fat, goose schmaltz, chicken fat, rendered chicken fat, chicken schmaltz, schmaltz, poultry fat, and French variants including `graisse d’oie`, `gras d’oie`, `gras de poulet`, and `gras/graisse de volaille`.

| Exact recipe demand | Rows | Decision |
|---|---:|---|
| Goose fat and goose-schmaltz wording | 0 | No recipe link. |
| Chicken fat, rendered chicken fat, and chicken-schmaltz wording | 0 | No recipe link. |
| Generic poultry-fat wording | 0 | Do not create a generic species-ambiguous reference. |

There are no recipe links to propose. Chicken stock, broth, and bouillon references are not fat ingredients and were not treated as demand for these identities.

## Naming and alias decisions

### Goose fat

Use `goose fat / graisse d’oie`. La Ferme Québec-Oies sells a jarred culinary product under the exact French name `graisse d’oie`; its page describes it as a cooking fat. Rougié’s French and English product pages identify the same single-ingredient jar as `graisse d’oie / goose fat`. A bilingual Canadian goose-rillettes ingredient declaration uses `gras d’oie / goose fat`, and the OQLF notes `gras d’oie` as a Québec usage of nominal `gras`. These sources support `gras d’oie` as a French alias, while `graisse d’oie` remains the Québec product display.

The cited goose-fat products are ready-to-use culinary products, but the Québec and Rougié product descriptions do not explicitly say `rendered`. Keep `rendered goose fat` out of the alias list until a source states that process. This name refers to goose fat sold as a food ingredient; it does not create a form for raw abdominal tissue, and it makes no claim that the fat is clarified or water-free. [S01–S04]

### Chicken fat

Use `rendered chicken fat / gras de poulet fondu`. Olliffe’s Ontario product is named `Chicken Schmaltz` and explicitly describes itself as rendered chicken fat. Bunnett Green Meadows Farm in New Brunswick likewise sells `Schmaltz - rendered chicken fat`. Nestlé Professional Canada has matched English and French product pages whose chicken-base ingredient lists say `Rendered chicken fat` and `Gras de poulet fondu`. Those latter pages support the bilingual wording but identify the fat as an ingredient of a compound product, not as a standalone jar.

Accept only the species-qualified English alias `chicken schmaltz`, supported by Olliffe’s product name and description. Hold plain `chicken fat` and plain `gras de poulet` as aliases: they occur in product titles or ingredient declarations, but can also name poultry fatty tissue without saying that it was rendered. The CFIA’s French poultry nomenclature explicitly identifies abdominal chicken fat (`graisse abdominale`, also `gras de panne`) as tissue in the abdominal cavity. Keep that raw-tissue concept separate from rendered cooking fat. [S05–S09]

### Generic poultry terms and schmaltz

Do not attach bare `schmaltz` to the chicken identity. Chabad describes schmaltz as rendered fat often made from goose or chicken, so the unqualified word does not select a species. The species-qualified `chicken schmaltz` is safe only as the English alias above. No evidence found here supports a French `schmaltz` alias or the phrase `goose schmaltz` as a Québec/Canadian product label.

Keep `poultry fat`, `gras de volaille`, and `graisse de volaille` unassigned. They could encompass duck, goose, chicken, or another poultry species. They must not collapse into the already-integrated rendered duck fat or either proposed species identity. [S10]

## Product-state boundaries

- Keep goose and chicken fat species-specific and separate from `rendered duck fat / gras de canard fondu`.
- Rendering is a process description. The CFIA defines rendering as extracting fat from fatty tissue by applying heat; that does not by itself establish clarification or removal of all water.
- CFIA’s chicken nomenclature distinguishes the animal’s abdominal fat tissue (`graisse abdominale / gras de panne`) from an extracted cooking fat. Do not map the tissue name to rendered chicken fat.
- The goose product evidence identifies a standalone cooking-fat product but does not establish its rendering method. Retain the exact product-level name without adding a rendered state.
- None of the reviewed poultry-fat sources supports an emulsified spread, margarine, or a water-containing product identity. Add no forms, measurements, density, unit mappings, conversions, yields, or substitutions.

## Source manifest

Sources were checked on 2026-10-12. These citations are proposal-local; this proposal does not edit the research ledger.

| ID | Source | Evidence and limits |
|---|---|---|
| `S01` | La Ferme Québec-Oies, [Graisse d’oie](https://boutique.lafermequebecoies.com/products/graisse-doie) | Québec product wording and jarred cooking-fat use. The page does not provide an English product name or state that the fat is rendered. |
| `S02` | Rougié, [Graisse d’oie 320 g](https://www.rougie.com/produit/graisse-doie-320g/) and [Goose fat 320 g](https://www.rougie.com/en/products/goose-fat-320g/) | Matching French and English product pages and ingredient wording for a single-ingredient jar. The producer is not Québec-based and does not state a rendering process. |
| `S03` | Costco Canada, [bilingual goose and duck product ingredient sheet](https://www.costco.ca/wcsstore/CostcoCABCCatalogAssetStore/Attachment/8110122NutritionalFactsEN-FR.pdf) | The goose-rillettes ingredient declaration pairs `gras d’oie` and `goose fat` in Canada. Rillettes are a compound product, so this is naming evidence for an ingredient rather than a standalone-fat product. |
| `S04` | OQLF, [acide gras saturé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869227/acide-gras-sature) | Notes that nominal `gras` is common in Québec, with `gras d’oie` as an example. This is not a dedicated goose-fat term record. |
| `S05` | Olliffe Butcher Shop, [Chicken Schmaltz](https://olliffe.ca/products/chicken-schmaltz) | Ontario retail product name; description explicitly calls it rendered chicken fat and identifies Ontario-raised chicken. English-only source. |
| `S06` | Bunnett Green Meadows Farm, [Schmaltz - rendered chicken fat](https://bunnettgreenmeadows.ca/products/schmaltz-rendered-chicken-fat) | New Brunswick product title explicitly pairs schmaltz and rendered chicken fat. No French wording. |
| `S07` | Nestlé Professional Canada, [MINOR’S Chicken Base](https://www.nestleprofessional.ca/minors/minors-chicken-base-6-x-1-lb) and [Base de poulet](https://www.nestleprofessional.ca/fr/minors/minors-base-de-poulet-6-x-1-lb) | Matched English/French manufacturer pages list `Rendered chicken fat / Gras de poulet fondu`; the fat is an ingredient within prepared chicken base. |
| `S08` | Québec Food Directory, [Aylmer cream of chicken soup](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8219286) | Québec product ingredient declaration uses `gras de poulet`; confirms local food-label usage but not a standalone culinary-fat product or rendering state. |
| `S09` | CFIA, [Canadian Standards of Identity, Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7) and [chicken nomenclature for wholesale](https://inspection.canada.ca/fr/etiquetage-aliments/etiquetage/industrie/produits-viande-volaille/viande-vendue-gros/poulet) | Volume 7 defines `render`; the French poultry nomenclature defines abdominal chicken fat as tissue. These sources set process and raw-tissue boundaries, not consumer-product names for rendered poultry fat. |
| `S10` | Chabad.org, [What Is Schmaltz?](https://www.chabad.org/library/article_cdo/aid/4159121/jewish/What-Is-Schmaltz.htm) | Culinary-cultural source describing schmaltz as rendered fat often made from chicken or goose. Supports holding bare `schmaltz` as species-ambiguous; it is not Québec terminology authority. |

## Limitations and integration notes

- No direct OQLF terminology record or Québec standalone retail product for chicken schmaltz/rendered chicken fat was located. The French display is supported by a Canadian manufacturer’s paired ingredient labels plus Québec product-label use of `gras de poulet`.
- Québec goose evidence is stronger for a French standalone product name than for a Canadian bilingual standalone package. English wording is confirmed on the matching Rougié product and in a Canadian compound-product declaration.
- No recipe rows currently demand either identity, so no recipe links or downstream behavior follow from this proposal.
- Recheck live names and aliases before integration. This document does not authorize changes to canonical JSON, forms, the research ledger, plan, workflow, or roadmap.
- No tests or emulator checks were run; this task adds only a proposal document.
