# WP02 A6 Fonio Flour Identity and Boundary Review

- **Reviewed:** 2026-10-11
- **Status:** Proposal only. This review recommends retaining the existing generic fonio-flour reference and its current bilingual display, while keeping the roasted and precooked products unresolved. It changes no catalog data, ledger, recipes, tests, plan, or roadmap.
- **Proposal-local source IDs:** `WP02-FONIO-FLOUR-IDENTITY-BOUNDARY-20261011-S01` through `S07`; these are not ledger records.
- **Scope:** Recheck the generic product identity, process boundaries, Québec French wording, aliases, current collisions, measurements, forms, conversions, yields, substitutions, and bundled recipe demand. This packet does not close broader A6 coverage or independent bilingual review.

## Recommendation

| Candidate | Disposition | Identity / exact limit |
| --- | --- | --- |
| Generic fonio flour | **Accept; retain current row** | Keep `ingredient-ref-fonio-flour` as `fonio flour` / `farine de fonio`, category `FLOUR_AND_STARCH`. Scope it to food flour milled from white fonio, *Digitaria exilis*. Do not claim a uniform dehulling, bran-retention, grind, or heat-treatment specification. Keep black fonio separate. [S01–S05] |
| English `acha flour` | **Retain current alias** | The current Canadian `Fonio (Acha) Flour` title and OQLF’s white-fonio terminology support this exact flour phrase. Do not add bare `acha`, `acha fufu`, `fundi flour`, or `findi flour`; the OQLF terms apply to the grain and do not establish those flour names. [S01–S03] |
| French `farine de fonio` | **Accept as the fr-CA display** | A current Québec manufacturer uses the unqualified phrase in a French recipe ingredient line and uses it as the base of its qualified flour product names. OQLF does not have a flour-specific entry, so describe this as local product and culinary usage, not an OQLF ruling. [S01, S04, S05] |
| Roasted fonio flour / source label `farine de fonio torréfié` | **Hold as a qualified product candidate** | Mako Foods sells this named flour, but its listing does not say whether the grain is roasted before milling, whether already milled flour is roasted, or how the product relates to unqualified fonio flour. Preserve the source's masculine `torréfié`; do not regularize the label as an adjective on `farine`. Do not add an alias, active reference, form, or conversion yet. [S04, S06] |
| Precooked fonio flour / source label `farine de fonio précuit` | **Hold as a qualified product candidate** | Mako Foods sells this named flour, but its listing does not identify the process sequence or its relation to unqualified or roasted flour. Preserve the source's masculine `précuit`; do not regularize the label as an adjective on `farine`. Do not add an alias, active reference, form, or conversion yet. [S04, S06] |
| Black fonio flour | **Leave unassigned** | No reviewed Canadian or Québec product source documents flour made from *Digitaria iburua*. The active black-fonio grain row is not evidence for a flour product. |

Keep the existing reference identity-only: null density, empty unit mappings, and no forms, conversions, package yields, substitutions, or recipe links. Do not use a source-specific package size or recipe quantity as a general conversion.

## Reconciliation with existing project decisions

The active A6 checklist already marks the generic flour identity as added, and the current reference and ledger contain that accepted row. The [2026-10-10 A6 proposal](wp02-a6-regional-grain-flour-gaps-20261010.md) recommended the same base identity and held the roasted and precooked products; the later [WP02 A7 proposal](wp02-a7-grain-meals-malt-toasted-boundaries-20261010.md) explicitly warns against duplicating the row. This review confirms that live state. The broader A6 checklist remains open. The older A6 summary in `docs/catalog/batches/baking-flours-starches.md` still calls the identity and generic French display unresolved, while the roadmap describes the remaining process evidence as unresolved. Read that residual work as the qualified-product/process boundary and independent reviewer sign-off, not as a missing generic row. This proposal does not edit the shared plan or roadmap.

## Identity, process, and Québec wording

OQLF defines *fonio blanc* as *Digitaria exilis* and lists `fonio` and `acha` among its French terms. Its entry concerns the grain, not flour. A Canadian product page independently names `Fonio (Acha) Flour` and identifies its ingredient as 100% ground, dehulled *D. exilis* [S01–S02]. Together these sources support a narrow white-fonio flour identity and the existing English alias `acha flour`; they do not support bare `acha` as a flour alias.

A second Canadian retailer lists `Fonio Flour (Acha Fufu)` and says it is made by milling whole fonio grains from Nigeria. The directly retrieved product page does not name a species or explain what “whole” means for fonio milling. A recent search-index rendering of the same page showed different title and taxon wording. Because those versions conflict, this review uses the directly available page only as evidence of a second Canadian flour listing with a different process description; it does not use the listing to expand aliases or define the species/process boundary [S03]. The difference between “dehulled” and “whole” is not resolved here and does not justify a dehulled/whole form axis.

The Québec wording is supported by current local usage. Mako Foods' 2026 muffin recipe lists `200 g de farine de fonio Mako Foods`; the same seller's product listings name `Farine de Fonio Torréfié` and `Farine de Fonio Précuit` [S04–S05]. Recommend retaining `farine de fonio` as the generic French display, with the evidence status stated accurately: it is an attested Québec culinary/product phrase, not a flour term directly adjudicated by OQLF. Keep `farine d'acha`, `farine de fundi`, and `farine de findi` inactive because the reviewed Québec flour source does not use them.

The two qualified Mako flour listings establish real products with distinct names; they do not establish a shared process taxonomy. A peer-reviewed study of *D. exilis* reports that precooking and roasting are distinct processes and that processing method significantly affected measured physical and functional characteristics in the studied landraces. Its methods concern study samples, not Mako's commercial SKUs, so it supports caution about treating these products as interchangeable but does not identify their manufacturing sequence or supply catalog conversions [S06]. Keep the generic flour identity available while the two named products remain held; do not imply the base row captures their performance.

## Current catalog and collision audit

The current reference file already contains:

| ID | Current name / aliases | Current data |
| --- | --- | --- |
| `ingredient-ref-fonio-flour` | `fonio flour` / `farine de fonio`; EN alias `acha flour` | `FLOUR_AND_STARCH`; `defaultDensity: null`; `unitMappings: []` |
| `ingredient-ref-white-fonio` | `white fonio` / `fonio blanc`; includes `fonio` and `acha` grain aliases | `GRAIN_AND_CEREAL` |
| `ingredient-ref-black-fonio` | `black fonio` / `fonio noir` | `GRAIN_AND_CEREAL` |

The active forms file has no fonio form; the legacy-candidate file has no fonio flour candidate; and the only exact ledger record ID for this flour is the current `ingredient-ref-fonio-flour` record. That ledger record marks identity `verified`, measurement and substitution research `not_yet_researched`, and retains the note that independent Québec review was pending.

Exact normalized searches for `fonio flour`, `farine de fonio`, and `acha flour` each resolve to the existing flour row. The broader `fonio` query can return white fonio, black fonio, and fonio flour; that is a useful product/grain choice, not a duplicate identity. The broad `acha` fragment also matches unrelated text in arracacha, kachai/fingerroot, sriracha, and a rocoto `qacha` form. Do not add bare `acha` to the flour row; the exact phrase `acha flour` avoids those collisions. No exact active owner was found for the roasted/precooked flour names, `farine d'acha`, `acha fufu`, or black fonio flour.

## Measurement, form, substitution, and recipe audit

- **Measurements and density:** No general mass/volume observation was found for fonio flour. The active row has null density and no unit mappings; the ledger still marks measurement research not yet done. Mako's 200 g muffin ingredient and retailer package sizes are source-specific quantities, not weight-to-volume evidence.
- **Forms and conversions:** No form or conversion is active, and the research ledger has no fonio unit-conversion record. Do not create raw/cooked or whole/dehulled flour forms from the current descriptions. Do not infer a grain-to-flour yield or map roasted/precooked flour to the generic row.
- **Yields and substitutions:** The package-yield file and both substitution-rule files have no fonio entries. The processing study reports product-specific functional differences, not a tested recipe substitution ratio. Keep all flour-to-flour and flour-to-grain substitutions absent.
- **Bundled recipes:** All 114 manifest-listed recipe files and all 1,123 ingredient rows were searched for normalized whole-phrase matches and full-recipe text hits covering fonio flour, white/black fonio, `acha` flour, the French names, and roasted/precooked candidates. There were zero matching recipe files or ingredient lines, and none of the three fonio reference IDs appears in a bundled recipe file. Do not add a recipe link. The Mako muffin recipe is external evidence for French usage, not a bundled recipe link or conversion record.

## Evidence register

All web sources were checked on 2026-10-11. Product listings can change; source-specific details below are limited to the text observed.

| ID | Source and limit |
| --- | --- |
| **S01** | OQLF, [fonio blanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529747/fonio-blanc). Defines the grain as *Digitaria exilis*, lists French `fonio` and `acha`, and English `white fonio`, `fonio`, and `acha`. It does not name flour. |
| **S02** | Aga's Wholesome, [Fonio (Acha) Flour](https://www.agaswholesome.ca/products/fonio-flour). Current Canadian product page names the flour and lists `100% ground dehulled fonio grain (Digitaria exilis)` as the ingredient. Product-specific process only; no general performance or nutritional claims are used. |
| **S03** | MyChopChop, [Fonio Flour](https://www.mychopchop.ca/products/acha-flour). The directly retrievable page calls it `Fonio Flour (Acha Fufu)`, says it is milled from whole fonio grain from West Africa, gives Nigeria as origin, and does not identify species or dehulling. A newer indexed rendering differs, so no alias, taxon, or exact process claim is based on that conflicting text. |
| **S04** | Mako Foods Exotik, Québec product pages: [Farine de Fonio Torréfié](https://www.makofoods.ca/products/farine-de-fonio-torrefie-600-g) and [Farine de Fonio Précuit](https://www.makofoods.ca/products/farine-de-fonio-precuit-700-g). Establish the exact locally sold product names; neither page states the process sequence or equivalence to generic flour. |
| **S05** | Mako Foods Exotik, [Muffin pomme et cannelle sans gluten](https://www.makofoods.ca/blogs/recettes/muffin-pomme-et-cannelle-sans-gluten), published 2026-02-18. Its French ingredient list uses `farine de fonio Mako Foods`; the listed recipe amount is not converted or imported. |
| **S06** | Ballogou et al., [Effect of processing method on physico-chemical and functional properties of two fonio (*Digitaria exilis*) landraces](https://pmc.ncbi.nlm.nih.gov/articles/PMC4348282/), *Journal of Food Science and Technology* 52(3), 1570–1577 (2015), doi: [10.1007/s13197-013-1150-4](https://doi.org/10.1007/s13197-013-1150-4). Reports distinct precooking and roasting methods and significant process effects for the two studied landraces; does not specify Mako's products or establish recipe conversions. |
| **S07** | Afrique Verte, [Analyse de la valeur nutritive des produits transformés au Burkina](https://www.afriqueverte.org/r2_public/media/fck/File/Documentation/Etudes/valeur-nutritive-des-cereales-transformees-au-burkina.pdf), 2010, pp. 14–15. Describes `farine de fonio` from decorticated/whitened grain and discusses precooked and steamed products separately. Regional process evidence; not a universal specification or Québec naming authority. |

## Evidence limits and disposition

The identity has enough support to retain as a generic culinary flour from white fonio, and the current Québec phrase `farine de fonio` is source-attested. The evidence does not establish that all unqualified listings share the same dehulling or milling process, that the French term is an OQLF-preferred flour term, or that roasted and precooked flours are equivalent to the base product. Those limits do not require removing the current base identity; they require keeping it process-neutral and withholding unsupported forms, numbers, yields, conversions, and substitutions.

**Final recommendation: ACCEPT / RETAIN** `ingredient-ref-fonio-flour` with its current names and `acha flour` alias. **HOLD** the roasted and precooked product candidates for process-qualified follow-up. Leave black-fonio flour and unsupported French or regional flour aliases unassigned. Independent Québec reviewer sign-off remains an external terminology-review step.
