# WP03 Section H — Bambara bean identity and Canadian French display review

- **Review date:** 2026-10-11
- **Status:** Proposal only; no catalog, ledger, plan, recipe, test, or code changes made
- **Scope:** Food seed of *Vigna subterranea* (Bambara groundnut), including maturity and product boundaries, bilingual naming, current catalog collisions, and bundled recipe demand

## Recommendation

Support an **identity-only** pulse row, provisionally `ingredient-ref-bambara-beans`, with the display **Bambara beans / pois bambara** and category `LEGUME_AND_PULSE`.

The English and French display pair is directly present in current Canadian government material: the CFIA’s organic grain extension table pairs “Bambara beans” with French “pois bambara” and identifies *Vigna subterranea*. The CFIA also lists “pois de terre” as an alternative, and Agriculture and Agri-Food Canada’s germplasm record lists French “voandzou.” I did not locate an OQLF crop entry or a current Québec retail label in this review, so this is supported as a Canadian French display, not claimed as an OQLF-preferred or Québec-market retail term.

Keep the proposed row to the edible seed identity. Sources distinguish immature fresh seed from mature dry seed, but no bundled recipe calls for either. Do not add forms, measurements, mappings, yields, recipe links, or substitutions now.

## Source-backed findings

| Finding | Source fact | Limit |
|---|---|---|
| Botanical identity | Kew’s Plants of the World Online accepts *Vigna subterranea* (L.) Verdc. in Fabaceae and lists *Voandzeia subterranea* among its synonyms [S1]. | Taxonomy establishes the species boundary; it does not establish a food label or consumer synonym. |
| Canadian bilingual name and pulse classification | The CFIA’s current page lists a packaged organic grain entry as “Bambara beans (*Vigna subterranea*) (bambara groundnut)” and, in French, “Pois bambara (*Vigna subterranea*), (pois Bambara, pois de terre)” [S2]. Statistics Canada’s 2023 export classification separately lists Bambara beans as *Vigna subterranea* or *Voandzeia subterranea* [S3]. | The CFIA table is an organic import code list, not a mandatory retail label or a Québec terminology ruling. Statistics Canada’s table is a trade classification, not a recipe-use standard. |
| Additional French common name | Agriculture and Agri-Food Canada’s GRIN-Global Canada taxon record lists “pois bambara” and “voandzou” in French; PROTA also lists “voandzou,” “pois de terre,” and “pois bambara” [S4, S5]. | The AAFC page is a germplasm/taxonomy record and PROTA is a crop reference, not evidence that all names are common in Québec retail. |
| Québec terminology check | The OQLF GDT result for “bambara” opened to an entry for the Bambara language, not the crop [S6]. | This unrelated entry does not establish a food name. I found no OQLF crop record during this review; that is a search result, not proof that no such terminology exists elsewhere. |
| Seed as food and maturity states | PROTA says the crop is grown primarily for its seeds; it distinguishes mature dry seeds, which are boiled and eaten as a pulse, from immature seeds, which are often boiled fresh as a snack. It also describes dry seeds used whole or split and ground into flour [S5]. A Ugandan production and use study likewise distinguishes fresh pods with seeds eaten as snacks from dry seed used whole or crushed [S7]. | These are regional crop-use descriptions. They establish product distinctions, not a universal preparation or retail form standard for Canada. |
| Pod and seed boundaries | PROTA describes an underground pod and says harvesting differs according to whether seeds are consumed unripe or ripe; mature harvest is associated with yellowing leaves and hard pods [S5]. FAO’s Senegal crop booklet describes voandzou boiled in its pod while fresh [S8]. | The food item proposed here is the seed. A recipe explicitly asking for fresh pods should retain that product wording and should not be silently treated as dried shelled seeds. |
| Bambara-derived fermented products | A published study describes soaking, dehulling, boiling, and fermenting Bambara groundnut to make a product called dawadawa [S9]. A separate study calls the Bambara product “dawadawa-type” and explains that dawadawa is generally made from African locust bean (*Parkia biglobosa*), with soybean and Bambara variants also reported [S10]. | These describe prepared fermented products and variable substrates; they do not make dawadawa or other fermented condiments aliases of the unfermented seed. |

## Proposed identity and names

| Field | Proposal |
|---|---|
| Candidate ID | `ingredient-ref-bambara-beans` (unreserved recommendation) |
| English display | Bambara beans |
| fr-CA display | pois bambara |
| Category | `LEGUME_AND_PULSE` |
| Narrow English aliases | Bambara bean; Bambara groundnut; Bambara groundnuts |
| Narrow French aliases | pois de terre; voandzou |
| Forms, density, mappings, conversions, yields, recipe links, substitutions | None proposed |

Use **Bambara beans / pois bambara** as the display pair because that exact bilingual pair is supported in the CFIA’s Canadian grain classification. Keep “Bambara groundnut” as a useful English search alias rather than the display: the “groundnut” wording without its Bambara qualifier risks conflation with peanut. Keep “pois de terre” and “voandzou” as source-attested French search aliases only; the sources do not justify presenting either as a Québec-preferred display.

Do not add *Vigna subterranea* or *Voandzeia subterranea* as consumer aliases. Record the accepted taxon and synonym in review evidence; the catalog alias list is for ingredient names. Do not add the spelling “Bambarra” or broader regional names without a separate Canadian naming need.

## Maturity and product boundaries

- The food identity is the edible seed of *Vigna subterranea*. It is a distinct pulse from peanut (*Arachis hypogaea*) and from other *Vigna* species.
- Mature dry seed and immature fresh seed are different culinary states. The sources describe mature dry seeds as a pulse and immature seeds as fresh snacks, often boiled. Fresh pods may also be cooked and served with the seeds inside. Do not make “fresh,” “green,” “dry,” “whole,” “split,” or “in pod” interchangeable aliases.
- The base identity can be added without assigning a default maturity state. If a future recipe names a state, consider an explicit form under this seed identity only if the product is clear. Treat a recipe naming pods as pod product wording, not as an automatic match to dry seed.
- Whole or split dry seeds, Bambara flour, seed milk, and fermented Bambara products are preparations/products, not aliases of the base seed. Review them separately if a recipe or product label creates demand.
- A Bambara-based dawadawa-type condiment remains a prepared fermented product. Do not route unqualified “dawadawa,” “iru,” or “soumbala” to this seed; the prior WP06 condiment review documents both substrate variation and the distinct *Parkia* product boundary [S10, P1].

## Current package and exact-key audit

The live working tree was re-read on 2026-10-11 before drafting. It already contained unrelated and concurrent edits; the hashes below identify the inspected working-tree snapshot, not a clean commit.

| File or scope | Snapshot |
|---|---|
| Active ingredient references | 930 |
| Ingredient forms | 52 |
| Legacy identity candidates | 76 |
| Research-ledger records | 1,193 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |
| `manifest.v1.json` SHA-256 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `ingredient-references.v1.json` SHA-256 | `a2945fd82e7cbcd859f8a98950c5c1325655ac8fca3674df4ff0577067190442` |
| `ingredient-forms.v1.json` SHA-256 | `2d1d872697cae29d9c448e1df11f9bd3405306ea1f3f860fc2b4163180288c50` |
| `legacy-import-identities.v1.json` SHA-256 | `be5ff09fb522c8a36633dbaea66f57e44653c2840da88600f03f943e1bbd9fb0` |
| `research-ledger.v1.json` SHA-256 | `da614c241375703b79d484fd3e5066435c7e221acd9416e580a89ab8f8f677a8` |
| Manifest-order recipe corpus digest | `28d90c9114de305be735a4ba2a388457584562b5271e9ba4abab0e3ca9677c64` |

Exact-key checks used the app search normalizer’s behavior (case folding, Unicode decomposition/accent removal, and punctuation-to-space normalization) across active reference names/aliases, form labels/match terms, and legacy candidate names/aliases. No exact owner was found for the proposed Bambara keys: Bambara bean(s), Bambara groundnut(s), *Vigna subterranea*, *Voandzeia subterranea*, pois bambara, pois de terre, or voandzou. The research ledger has no Bambara/Voandzeia record or exact-key collision.

Relevant distinct owners remain:

- `ingredient-ref-moth-beans` is the active moth-bean identity, with *Vigna aconitifolia* product wording such as “moth bean,” “matki,” and “haricot papillon.” It is a different species from *Vigna subterranea*; CFIA also lists Bambara beans and moth beans under separate species codes [S2].
- `ingredient-ref-peanuts` owns “peanuts” / “arachides,” with “cacahuète” and “cacahouète” aliases. `ingredient-ref-peanut-butter` and `ingredient-ref-partially-defatted-peanut-flour` are separate processed products. Do not alias bare “groundnut,” “peanut,” or “arachide” to the Bambara row.

## Bundled recipe demand

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were scanned. The scan checked each ingredient row’s `originalText`, `ingredientName`, and `ingredientRefId`, plus normalized whole-phrase occurrences across the serialized recipe files, for Bambara bean(s), Bambara groundnut(s), *Vigna subterranea*, *Voandzeia subterranea*, pois bambara, pois de terre, voandzou, and related reviewed spellings. It found **zero ingredient-line hits and zero full-recipe hits**. No link, relink, form, or recipe-specific quantity is supported.

Peanut ingredient lines remain peanut evidence only. In recipe 090, the natural creamy peanut-butter line is linked to `ingredient-ref-peanut-butter`, and the garnish line says peanuts. Neither line requests Bambara beans or supports a Bambara-to-peanut substitution [P2].

## Forms, measures, conversions, yields, and substitutions

- **Forms:** The sources support a real maturity distinction: immature/fresh seed versus mature/dry seed. Some sources also discuss dry seed whole or split, flour, milk, and fermented products. No bundled recipe names any of them, so no form record is proposed now. Keep the stage distinctions documented for future recipe matching.
- **Density and measures:** Unavailable. No reviewed source provides a culinary volume-to-weight mapping or usable density for a defined Bambara product. Food-composition figures per 100 g are nutritional composition, not cup measures.
- **Conversions and package yields:** Unavailable. No dry-to-soaked, dry-to-cooked, pod-to-shelled, drained, or package conversion is proposed. Agricultural field yield and shelling data are not recipe yield data.
- **Substitutions:** No global or automatic substitution rule is supported. The FAO Senegal source describes voandzou roasted as a local snack in place of peanuts [S8], but that is a context-specific food use, not evidence of a general recipe interchange or quantity ratio. The current peanut recipe lines do not supply Bambara demand.
- **Safety or nutrition claims:** None are proposed. Taxonomic and food-use references do not establish allergy, cooking-safety, or dietary suitability rules.

## Prior work and open checklist context

- Section H of the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) leaves regional pulse coverage and the dry/fresh/cooked form boundary open. The [plant-legumes-pulses packet](../batches/plant-legumes-pulses.md) explicitly lists Bambara as a candidate requiring its own source and bilingual review; it says not to invent French labels.
- The [WP06 west/central African condiment review](wp06-west-african-locust-bean-condiment-boundary-review-20261010.md) distinguishes Bambara-derived dawadawa-type products from the base seed and notes that dawadawa may use different seed substrates [P1].
- The [WP06 groundnut/palm boundary review](wp06-section-z-groundnut-palm-boundary-20261010.md) keeps generic African groundnut paste separate from peanut butter; it does not establish a Bambara-seed alias or recipe demand [P2].

## Source register

Sources were accessed 2026-10-11. The limits above are part of each source’s interpretation.

| ID | Source | Use and limit |
|---|---|---|
| S1 | Kew Science, [Plants of the World Online: *Vigna subterranea*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:525534-1) | Accepted name, Fabaceae placement, and *Voandzeia subterranea* synonym; botanical taxonomy only. |
| S2 | Canadian Food Inspection Agency, [English organic seed and grain extension codes](https://inspection.canada.ca/en/food-labels/organic-products/import-requirements/organic-ogd-codes-seeds-amp-grains/new-ogd-extension-codes-organic-seeds-and-grai) and [French version](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme) | Paired English/French terms for Bambara beans and species code; organic-import classification, page lists modification date 2020-04-07. |
| S3 | Statistics Canada, [Canadian Export Classification, Chapter 7 (2023)](https://www150.statcan.gc.ca/n1/pub/65-209-x/2023001/t/tbl_07-eng.htm) | Trade code 0713.34 identifies Bambara beans separately from cowpeas; trade nomenclature only. |
| S4 | Agriculture and Agri-Food Canada, [GRIN-Global Canada taxon record](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=105107) | Lists English Bambara groundnut/Bambara-bean and French pois bambara/voandzou; germplasm record, not Québec retail-label evidence. |
| S5 | Plant Resources of Tropical Africa, [*Vigna subterranea* crop profile](https://plantuse.plantnet.org/en/Vigna_subterranea_%28PROTA%29) | French vernacular names, seed uses, maturity distinctions, and agricultural context; regional crop reference rather than Canadian terminology or product standard. |
| S6 | Office québécois de la langue française, [GDT entry “bambara”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015065/bambara) | The located entry defines the language, not the food crop; it supplies no crop-name recommendation. |
| S7 | [Production and utilisation of Bambaranut in Northern and Eastern Uganda](https://academicjournals.org/journal/AJAR/article-full-text/F4EC58669915) | Local fresh-pod/fresh-seed and dry-seed uses; study describes Ugandan production and consumption, not Canadian formats. |
| S8 | FAO, [Senegal traditional crops booklet, Voandzou entry](https://www.fao.org/fileadmin/templates/olq/files/generaldoc/Senegal_libretto.pdf) | Names pois bambara/pois de terre and describes fresh-pod boiling and roasted snack use in Senegal; not a generic substitution rule. |
| S9 | [Assessment of nutritional and phytochemical quality of dawadawa produced from Bambara groundnut](https://www.sciencedirect.com/science/article/pii/S0026265X19310331) | A specific fermentation study and substrate process; not a standard for every dawadawa product. |
| S10 | [Volatile compounds from Bambara groundnut fermented into a dawadawa-type condiment](https://doi.org/10.1080/10942912.2018.1460757) | Explains standard locust-bean dawadawa and a Bambara-groundnut dawadawa-type product; study-specific product terminology. |

## Internal records checked

- `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section H
- `docs/catalog/batches/plant-legumes-pulses.md`
- `app/src/main/assets/seed/bundled-library/manifest.v1.json`
- `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`
- `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json`
- `docs/catalog/legacy-import-identities.v1.json`
- `docs/catalog/research-ledger.v1.json`
- `docs/catalog/proposals/wp06-west-african-locust-bean-condiment-boundary-review-20261010.md`
- `docs/catalog/proposals/wp06-section-z-groundnut-palm-boundary-20261010.md`
