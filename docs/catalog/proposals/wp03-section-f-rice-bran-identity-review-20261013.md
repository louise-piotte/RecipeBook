# WP03 Section F: rice bran identity review

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated as an identity-only reference; see the [integration record](../batches/wp03-section-f-rice-bran-identity-integration-20261013/README.md).
- **Scope:** Food-grade dry rice bran used as a culinary ingredient. This is a rice-milling fraction, not rice-bran oil, a rice-germ ingredient, or a formulated rice cereal.
- **Open checklist:** The plan leaves regionally significant cereal mixes and preprocessed grains open ([plan, lines 2194–2223](../../RecipeBook-global-ingredient-catalog-plan.txt#L2287)). Recent entries cover Sankhal, arraw, thiakry, sprouted brown rice, and quick-cooking rice. This review covers the distinct rice-milling by-product; it does not revisit those products or the existing rice-bran-oil integration.

## Recommendation

Accepted: create one separate **GRAIN_AND_CEREAL** reference:

| Field | Proposed value |
|---|---|
| ID | **ingredient-ref-rice-bran** |
| English display | **rice bran** |
| French display | **son de riz** |
| English aliases | None |
| French aliases | None |
| Default density | null |
| Unit mappings | Empty |
| Forms, conversions, yields, recipe links, substitutions | None |

Use the human-food label wording **son de riz**. Current Canadian French food usage and a French Canadian product listing attest to it, while CFIA's bilingual naming guidance says that bran from a grain other than wheat must name its source grain [S02–S05]. OQLF's older entry uses **issues de riz** as its preferred term and **son de décorticage** in some contexts, but defines the product as a milling by-product used as stock feed and medicinally for thiamine. That 1982 entry does not establish a current human-food product name; do not add either older term as an alias [S06].

## Product identity and boundaries

Westpoint Naturals describes its rice bran as the outer brown layer removed while milling rice for white rice intended for human consumption. The manufacturer also explains that its stabilized SKU is processed to inactivate an enzyme that would otherwise degrade the bran oil. This supports a separate food ingredient identity, while stabilization remains a product-specific treatment rather than a proposed form or required definition [S01].

| Candidate or neighboring product | Boundary |
|---|---|
| Dry food-grade rice bran | The proposed identity: the bran milling fraction sold for culinary use. Commercial treatment and any retained or added germ can vary. |
| Stabilized rice bran | A current commercial presentation of rice bran. Do not create a form or alias from one manufacturer's stabilization process. |
| Rice germ | Keep distinct. Westpoint's product-specific ingredient declaration says “Rice (brown) bran and germ,” showing that the two can be separately named components; it does not make germ part of every rice-bran product [S01, S05]. |
| Rice bran oil / huile de riz | Keep the active oil identity separate. The live row is **ingredient-ref-rice-bran-oil**, category **FAT_AND_OIL**, with English alias **rice oil**; it is not the bran ingredient [S07]. |
| Rice / riz, brown rice / riz brun, rice flour / farine de riz | Keep whole grains and milled flour separate from the bran fraction. Rice already has dry and cooked forms; those forms do not represent bran. |
| Crispy rice cereal or formulated “riz croustillant” | Keep composite products separate. Enjoy Life's French glossary describes one crispy-rice product as rice flour, rice bran, grape-juice concentrate, honey, and salt [S04]. |
| Feed-grade rice bran | Outside this proposal's food-ingredient scope. Do not infer culinary identity, measures, or substitutions from feed uses. |

The manufacturer's product-specific ingredient statement includes both bran and germ. That statement is evidence of one retail formulation, not a universal composition. The proposed row should not be used to resolve whether a different retail product includes germ unless its label says so.

## Québec French and Canadian naming

CFIA's English and French industry labeling guidance says that unqualified “bran” / « son » refers to wheat bran / son de blé; when the source is another grain, the grain must be named, with “oat bran” / « son d'avoine » given as the example [S02, S03]. The same source-grain pattern supports the clear display **rice bran / son de riz**.

The French Canadian Enjoy Life glossary has a standalone heading **Son de riz** and says this ingredient is used in its foods [S04]. Well.ca's French listing names a Westpoint Naturals retail product **Son de riz stabilisé** and lists its ingredients as rice bran and germ (brown rice); the listing search result showed 400 g. Direct access to that retailer page returned HTTP 403 on 2026-10-13, so this review uses only its indexed title and product details and makes no availability claim [S05]. These current food-use sources support the proposed French wording; they are not an OQLF ruling.

The older OQLF GDT entry is relevant but scoped differently: its 1982 definition for **issues de riz** describes a rice-milling product used as stock feed and medicinally as a thiamine source. It also lists **son de décorticage** as a contextual term. Since that entry does not name a modern human-food ingredient, retain the directly attested food-label phrase **son de riz** and keep the OQLF terms out of the alias set [S06].

## Exact ownership and picker projection

The live catalog snapshot read for this review contains 1,330 ingredient references, 98 forms, 64 legacy import candidates, and 1,638 research-ledger records. No active reference name or alias exactly matches **rice bran** or **son de riz**; no form, legacy candidate, or ledger record ID owns those exact normalized terms, and the proposed ID and source prefix are unallocated. The active oil row does contain **rice bran** as the first two words of its longer name, which is why the phrase query returns both rows below.

Nearby live ownership is distinct:

| Current term or record | Current owner |
|---|---|
| **rice bran oil / huile de riz**; English alias **rice oil** | **ingredient-ref-rice-bran-oil**, **FAT_AND_OIL** |
| **wheat bran / son de blé** | **ingredient-ref-wheat-bran**, **GRAIN_AND_CEREAL** |
| **oat bran / son d'avoine** | **ingredient-ref-oat-bran**, **GRAIN_AND_CEREAL** |
| **bran flakes cereal / céréales de son en flocons** | **ingredient-ref-bran-flakes-cereal** |
| **rice / riz** | **ingredient-ref-rice**, with separate dry and cooked forms |
| **rice flour / farine de riz** | **ingredient-ref-rice-flour** |

The live ledger has incidental rice-bran mentions in five records: the oil record, a palm-kernel-oil source comparison, pickled-radish context, pla-ra fermentation context, and takuan pickling context. None is a standalone rice-bran identity record. The existing oil record supports **rice bran oil / huile de riz** and **rice oil**; it must remain distinct.

The table below is a static projection of current IngredientReferenceSearchIndex behavior against live reference and form terms, with the proposed display pair appended. The picker normalizes accents and punctuation, returns complete word-phrase matches first, then falls back to substring matches. This is a source-code projection, not a runtime or emulator observation.

| Query | Projected result |
|---|---|
| **rice bran** | **ingredient-ref-rice-bran-oil** and proposed **ingredient-ref-rice-bran**. This broader phrase match is expected because the active oil name contains the shorter phrase. |
| **rice bran oil** | **ingredient-ref-rice-bran-oil** only. |
| **rice oil** | **ingredient-ref-rice-bran-oil** only. |
| **son de riz** | Proposed **ingredient-ref-rice-bran** only. |
| **bran** | Five broad results: bran flakes cereal, oat bran, rice bran oil, wheat bran, and proposed rice bran. |
| **son** | Four broad results: bran flakes cereal, oat bran, wheat bran, and proposed rice bran. |
| **rice** / **riz** | Broad rice-family searches (51 / 47 projected results respectively), including the proposed row. |

Do not alias **rice bran oil**, **rice oil**, **huile de riz**, generic rice, brown rice, or rice flour to the proposed bran row. The French phrase **son de riz** is distinct from the existing rice-beverage label **boisson de riz**.

## Recipe-corpus demand

The complete current manifest lists **114 recipe files and 1,123 ingredient rows**. I parsed every manifest-listed recipe and scanned all serialized string values plus all ingredient-row fields for **rice bran**, **son de riz**, **rice (brown) bran**, **issues de riz**, and **bran de riz**. Results: **0 matching recipe files and 0 matching ingredient rows**. No recipe link is supported by the bundled corpus.

## Forms, measurements, density, and substitutions

Westpoint's product facts give **2 tbsp (15 g)** for its stabilized product. The same page lists its SKU package configurations as **12 × 400 g** and **22.7 kg**. Well.ca's French listing shows a 400 g package. These are product-specific serving and package facts, not transferable measures, a general mass-to-volume conversion, or evidence for default density. No packing or fill method is given from which a reusable density can be derived [S01, S05].

Westpoint also suggests replacing up to one-fourth of all-purpose flour with its stabilized bran in muffins or cakes, with a product-specific example of 3 cups flour becoming 3/4 cup bran plus 2 1/4 cups flour. This is a manufacturer's use suggestion for one product and context, not a tested general substitution between rice bran and flour. Keep it inactive as a global or contextual substitution [S01].

No dry/cooked or stabilized/unstabilized ingredient form is proposed. Keep all numeric behavior inactive: default density null, empty unit mappings, and no active measures, conversions, yields, recipe links, or substitutions.

## Source register

All sources below were accessed or checked on 2026-10-13. These source IDs were added to the shared research ledger under `ingredient-ref-rice-bran`.

| Source ID | Source and locator | Evidence and limit |
|---|---|---|
| WP03-RICE-BRAN-20261013-S01 | Westpoint Naturals, [Stabilized Rice Bran](https://www.westpointnaturals.com/products/stabilized-rice-bran/), current manufacturer product page, lines 73–106 and 112–133. | Defines its bran as the outer brown layer removed during milling for white rice for human consumption; describes its SKU stabilization process, lists brown-rice bran and germ, gives one product-specific flour-use suggestion, 2 tbsp (15 g) nutrition serving, and 12 × 400 g / 22.7 kg SKUs. It does not establish a universal formula, measure, density, or substitution. |
| WP03-RICE-BRAN-20261013-S02 | Canadian Food Inspection Agency, [Labelling and composition requirements for grain and bakery products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products?wbdisable=true), “Bran.” | Says unqualified bran means wheat bran and another grain source must be named, e.g. oat bran. Supports source-qualified English naming; not a product specification for rice bran. |
| WP03-RICE-BRAN-20261013-S03 | Agence canadienne d'inspection des aliments, [Exigences d'étiquetage et de composition pour les céréales et les produits de boulangerie](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/cereales-produits-boulangerie), « Son », lines 61–64. | Says unqualified « son » refers to wheat bran and another cereal source must be specified, e.g. « son d'avoine ». Supports the source-qualified French construction; it does not specifically prescribe « son de riz ». |
| WP03-RICE-BRAN-20261013-S04 | Enjoy Life Foods Canada, [Glossaire des ingrédients](https://enjoylifefoods.ca/fr/glossaire-des-ingredients/), lines 215–220. | Uses **Son de riz** as a human-food ingredient and separately describes a composite **Riz croustillant** containing rice flour, rice bran, grape-juice concentrate, honey, and salt. Supports French food usage and the composite-product boundary, not a universal composition or measure. |
| WP03-RICE-BRAN-20261013-S05 | Well.ca, [Westpoint Naturals Son de riz stabilisé](https://well.ca/fr/produits/westpoint-naturals-stabilized-rice_297338.html), French Canadian retail listing. | Indexed listing gives the French product title, 400 g package, and brown-rice bran-and-germ ingredient statement. Direct page fetch returned 403 on the access date; use only the indexed listing details and do not claim current availability. |
| WP03-RICE-BRAN-20261013-S06 | Office québécois de la langue française, [issues de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889516/issues-de-riz), GDT entry, updated 1982. | Search-indexed entry gives preferred **issues de riz**, contextual **son de décorticage**, English **rice bran**, and a definition scoped to feed and medicinal use. It is recorded as a terminology boundary and is not used as the proposed human-food display or alias. |
| WP03-RICE-BRAN-20261013-S07 | Office québécois de la langue française, [huile de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410164/huile-de-riz); live ledger sources WP05-REGIONAL-OILS-INT-20261012-S09–S10. | Supports the existing English rice-bran-oil / rice-oil and French huile-de-riz terms; Codex supports the oil's source boundary. It supports keeping the oil owner separate and is not evidence for a bran alias. |

## Disposition

The evidence supports **rice bran / son de riz** as a separate human-food rice-milling-fraction identity in **GRAIN_AND_CEREAL**. The reference is integrated without aliases, forms, recipe links, default density, or unit mappings. Westpoint's 2 tbsp (15 g) label is retained only as a product-specific observation; its muffin/cake flour-use suggestion remains blocked from active substitution behavior. The full recipe corpus has no matching demand. Static data checks passed; no app tests or emulator checks were run because this was a database JSON update.

