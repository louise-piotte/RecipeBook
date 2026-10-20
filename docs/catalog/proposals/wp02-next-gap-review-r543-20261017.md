# WP02 A4 generic brown-rice-flour substitution review — R543 — 2026-10-17

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17. See the [R543–R545 integration README](../batches/wp02-wp03-wp04-r543-r545-gap-review-integration-20261017/README.md).
- **Scope:** Research whether the existing generic, unsprouted `ingredient-ref-brown-rice-flour` supports a reusable wheat-flour replacement. This review does not revisit its identity, French aliases, serving evidence, or the already integrated sprouted form.
- **Checklist anchor:** [WP02 Section A rice source-grain grades](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658). The parent item remains open; the white-rice-flour review is complete under R290, while the brown-rice-flour ledger still has `substitutionResearchState: not_yet_researched`.
- **Source ownership:** Reuse R115 source IDs for the existing OQLF, Québec manufacturer, and MAPAQ evidence below. The primary study URL and `WP02-A4-BRF-SUB-R543-20261017-S01` were not found in the ledger, proposal archive, or batch archive. The proposal path and source-ID namespace were also unowned at review time.

## Recommendation

**Add one evidence-only finding that no general wheat-flour replacement is supported for the existing brown-rice-flour row, and set its `substitutionResearchState` to `researched_no_supported_substitute` if integrated. Add no active substitution rule.**

Proposed finding ID: `brown-rice-flour-no-general-wheat-substitute-r543-20261017`.

The primary study tests whole brown rice flour at 5%, 10%, and 15% in one wheat-flour blend for Iranian Barbary flatbread. Its 5% sample was closest to the control and received the highest overall quality score; the authors' conclusion is specific to Barbary flatbread [S01]. That result is useful evidence about one tested formulation. It does not establish a general home-recipe exchange amount, a rule for other breads or pastry, or a water adjustment.

Current product guidance is also product- or blend-specific. The Québec Food Directory describes one La Milanaise SKU as unsuitable for bread-making and recommends cookies and muffins [reused R115-S05]. Cuisine l’Angélique describes its own flour for gluten-free pastry and as a thickener in soups, sauces, and creams, without a replacement amount [reused R115-S03]. Cuisine Soleil gives ranges for a three-part custom gluten-free flour blend containing its brown-rice flour, legume flour, and hemp or flax flour; those component percentages are not a one-ingredient wheat-replacement ratio [reused R115-S02].

Keep the ledger finding on the **generic, unsprouted** brown-rice-flour record. Do not transfer the study or product claims to the sprouted form added under R250, to white or glutinous rice flour, or to rice starch.

Keep `measurementState: researched_no_supported_value`, `defaultDensity: null`, and `unitMappings: []`. R115 already records two different product servings—La Milanaise 1/3 cup (60 g) and Cuisine Soleil 1/4 cup (31 g)—as source-specific evidence [reused R115-S05–S06]. Do not average or convert these values, infer a replacement measure, or use them as evidence for a substitution ratio.

## Current ownership and prior work

| Surface | Current state and finding |
|---|---|
| Active reference | `ingredient-ref-brown-rice-flour` is `brown rice flour / farine de riz brun`, category `FLOUR_AND_STARCH`; French aliases are `farine de riz complet` and `farine de riz brun complet`; English aliases are empty. Density is null and unit mappings are empty. Keep the row unchanged. |
| Active form | `ingredient-form-brown-rice-flour-sprouted` is already integrated under the reference. Its labels are `sprouted brown rice flour / farine de riz brun germé`, with only `germinated brown rice flour` as an English match term. R250’s One Degree guidance concerns its sprouted product and does not supply a general substitution for the unqualified base row. |
| Research ledger | The base row has `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`. Its existing sources include the white/brown identity boundary, the two SKU servings, and R115 terminology evidence. No `substitutionFindings` entry exists for the row. |
| Active rules | Both `substitution-rules.v1.json` and `contextual-substitution-rules.v1.json` are empty. Neither currently contains a brown-rice-flour rule. Add none. |
| Related completed work | R115 added two French aliases and kept the two serving values source-specific; R250 added a sprouted form and retained One Degree’s qualitative guidance at the product/form level; R290 researched white-rice-flour measurement and wheat replacement separately. None resolves reusable substitution behavior for generic brown-rice flour. |
| Plan and roadmap | The Section A parent still lists rice source-grain grades with remaining work. Roadmap entries for R115, R250, and R290 describe their bounded identity, form, and white-rice-flour decisions; this proposal does not amend those entries. |

## Naming and picker projection

Retain the existing names and aliases. The current `IngredientSearch.kt` normalizes accents and punctuation, matches full word phrases first, and then falls back to substring matching. A static projection over current references and forms gives:

| Query | Current result | R543 effect |
|---|---|---|
| `brown rice flour`, `farine de riz brun`, `farine de riz complet`, or `farine de riz brun complet` | `ingredient-ref-brown-rice-flour` only | No alias or picker change. |
| `sprouted brown rice flour` or `germinated brown rice flour` | `ingredient-ref-brown-rice-flour`, with the existing sprouted-form phrase available for the form hint | Keep the R250 form boundary unchanged. |
| `rice flour` or `farine de riz` | 12 rice-flour references, including the generic, white, brown, glutinous, and other qualified rows | Keep the broad family query broad. |
| `riz complet` | Brown rice grain and brown rice flour | Keep both existing identities; do not broaden or reassign the alias. |
| `riz brun` | Brown rice grain, brown rice flakes, brown rice flour, brown rice syrup, puffed brown rice, and sprouted brown rice | Keep current multi-result behavior. |

The picker audit is a static projection, not an Android picker test. No new alias, reference, or form is proposed.

## Bundled recipe demand

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient objects** in the current bundled package. Searches for `brown rice flour`, `farine de riz brun`, both existing French aliases, `brown rice meal`, `brown rice farina`, `riz brun`, `brown rice`, and `ingredient-ref-brown-rice-flour` found **zero recipe-file hits and zero ingredient-object hits**. There is no bundled recipe line, recipe link, or method context supporting an active substitution rule.

## Evidence and limits

- The primary study concerns flour milled from whole brown rice and a commercial Iranian wheat flour in an experimental Barbary flatbread formula. It tests 5%, 10%, and 15% fortification levels; the 5% sample scored closest to the control and highest overall among those treatments. Preserve this as study-specific evidence only. Do not encode 5% as a general exchange ratio, a home-baking recommendation, or a contextual catalog rule. [S01]
- The MAPAQ La Milanaise product sheet says its named product is not suitable for bread-making and suggests cookies and muffins. This is that manufacturer's SKU guidance, not a universal claim that brown-rice flour cannot be used in bread; the distinct study and other product uses show why product and formula context must stay attached. [reused R115-S05]
- Cuisine l’Angélique names gluten-free pastries and thickening soups, sauces, and creams as uses for its own fine-granulated product. A customer testimonial on the same page says the flour is used in a bread recipe but supplies no formula or amount. Neither statement proves a direct replacement ratio for the catalog row. [reused R115-S03]
- Cuisine Soleil describes its percentages as a three-step custom blend: brown-rice flour, a selected legume flour, and hemp or flax flour. These percentages describe ingredients within a blend, not replacement of wheat flour by brown-rice flour alone. [reused R115-S02]
- R115’s two MAPAQ portion statements are for different named products and do not establish a shared volume-to-mass mapping, density, or recipe-line measure. They are irrelevant to a replacement ratio. [reused R115-S05–S06]
- OQLF defines `farine de riz` as milled rice and says it may come from white or brown rice. This supports the existing family/source-grade boundary only; it establishes no substitution behavior. [reused R115-S01]

No source supports a transferable wheat replacement amount across dish types or ingredient roles. No source supports water/hydration correction, leavener change, texture correction, yield, or substitution confidence/risk metadata. A later contextual rule would need an explicit supported dish, role, and method under Requirements [FR-5 and §6.5](../../../Requirements.md), plus evidence adequate for the rule itself.

## Proposed ledger finding

If accepted, add one evidence-only finding to `ingredient-ref-brown-rice-flour`:

| Field | Proposed value |
|---|---|
| `findingId` | `brown-rice-flour-no-general-wheat-substitute-r543-20261017` |
| `researchState` | `researched_no_supported_substitute` |
| `context` | Whether unqualified, unsprouted brown-rice flour has a reusable replacement amount for wheat flour across recipe types and roles. |
| `basis` | Manufacturer guidance is tied to distinct products or describes a multi-flour blend. The primary study identifies one limited Barbary flatbread result, not a transferable catalog amount. No bundled recipe supplies the missing dish/method context. |
| `limitations` | Do not encode the study’s 5% result as a general ratio or active contextual rule; do not read blend-component ranges as a direct wheat substitution; do not infer hydration or texture adjustments; do not transfer the evidence to the sprouted form or other rice flour/starch identities. |
| `sourceIds` | `WP02-A4-BRF-SUB-R543-20261017-S01`; reused `WP02-A4-BROWN-RICE-FLOUR-R115-S01`, `-S02`, `-S03`, `-S05`, and `-S06` |

Add no rule, recipe-line substitution link, preferred substitute, numeric mapping, density, form, conversion, yield, recipe link, or alias. Keep all existing source-grain identities separate.

## Source register

New study evidence was accessed on **2026-10-17**. The following new source ID is local to this proposal. Reused IDs remain owned by the existing brown-rice-flour ledger record; no source IDs or ledger records are changed by this proposal-only review.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A4-BRF-SUB-R543-20261017-S01` | Khoshgozaran-Abras, Azizi, Bagheripoor-Fallah, and Khodamoradi, [“Effect of brown rice flour fortification on the quality of wheat-based dough and flat bread”](https://pmc.ncbi.nlm.nih.gov/articles/PMC4190248/), *Journal of Food Science and Technology* 51(10) (2014), 2821–2826; DOI [10.1007/s13197-012-0716-x](https://doi.org/10.1007/s13197-012-0716-x), abstract, materials/methods, and results/conclusion. | Primary study of 5%, 10%, and 15% whole brown-rice-flour fortification in one wheat-based Iranian Barbary flatbread formula; 5% was the closest to control and highest-rated tested level. Not a general household substitution amount or evidence for other dish types, flour products, or the sprouted form. |
| Reused `WP02-A4-BROWN-RICE-FLOUR-R115-S01` | OQLF, [farine de riz (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), updated 2025. | Defines the family term and notes white or brown rice as source grain; no substitution evidence. |
| Reused `WP02-A4-BROWN-RICE-FLOUR-R115-S02` | Cuisine Soleil, [Farine de riz brun](https://cuisinesoleil.com/produit/farine-de-riz-brun/), current product page. | Brown-rice-flour product and its three-step custom blend guidance. The blend percentages do not establish a direct wheat replacement amount. The previously owned URL now resolves to the current product page. |
| Reused `WP02-A4-BROWN-RICE-FLOUR-R115-S03` | Cuisine l’Angélique, [Farine de riz brun complet sans gluten](https://www.cuisinelangelique.com/fr/produits/farine-riz-brun-sans-gluten), current product page. | Product-specific suggested uses include gluten-free pastries and thickening; no recipe replacement amount. Customer testimonial is not a quantified formulation. |
| Reused `WP02-A4-BROWN-RICE-FLOUR-R115-S05` | MAPAQ, Québec Food Directory, [La Milanaise Organic Whole Brown Rice Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8204185), product description, suggested uses, and serving fields. | Names one brown-rice flour SKU, says it is not suitable for bread-making, suggests cookies and muffins, and reports that SKU’s 1/3 cup (60 g) serving. Not a universal flour-use or replacement rule. |
| Reused `WP02-A4-BROWN-RICE-FLOUR-R115-S06` | MAPAQ, Québec Food Directory, [Cuisine Soleil Organic Gluten Free Brown Rice Flour](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223778), serving fields. | Reports the named SKU’s 1/4 cup (31 g) serving. Source-specific measurement only; not a substitution claim or reusable mapping. |

## Verification record

Re-read current `AGENTS.md`, relevant `Requirements.md` conversion/substitution requirements, the WP02 plan and roadmap entries, the existing R115/R250/R287/R290 proposals and integration notes, the active reference/form/rule files, and the brown-rice-flour ledger record. Rechecked current picker projection, source-ID and study-URL ownership, and manifest-listed recipe demand. Opened current OQLF, MAPAQ, Cuisine Soleil, and Cuisine l’Angélique pages and reviewed the primary study’s indexed article text. At proposal review, no shared catalog, ledger, plan, roadmap, recipe, or rule files were changed. This review preceded root integration.

## Integration

Integrated on 2026-10-17: added the primary-study source and one `researched_no_supported_substitute` finding to `ingredient-ref-brown-rice-flour`, then updated its substitution research state. No active substitution rule, ratio, adjustment, density, measure, alias, recipe link, or form was added. The sprouted form and the two product-specific serving observations remain unchanged. See the [R543–R545 integration README](../batches/wp02-wp03-wp04-r543-r545-gap-review-integration-20261017/README.md).
