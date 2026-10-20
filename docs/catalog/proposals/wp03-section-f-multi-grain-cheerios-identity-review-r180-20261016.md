# WP03 Section F: Multi-Grain Cheerios identity review (R180)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Proposal only. No shared catalog, ledger, plan, recipe, or generated data is changed here.
- **Open checklist:** Section F still calls for regionally significant cereal mixes and preprocessed grains in the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3513).
- **Candidate:** the current Canadian ready-to-eat product titled **Multi-Grain Cheerios**.
- **Recommendation:** Add identity-only `GRAIN_AND_CEREAL` reference **`Multi-Grain Cheerios / céréales multigrains Cheerios`** as `ingredient-ref-multi-grain-cheerios`. Keep aliases empty and retain it as the full branded product choice. Do not infer a fixed multigrain count or recipe formula from conflicting current marketing descriptions. Add no forms, active measures, density, mappings, conversions, yields, recipe links, or substitutions.

## Product identity and bilingual naming

General Mills' current Canadian English and French product pages both identify the item as **Multi-Grain Cheerios**. The Canadian French page is available from the Canada-Français language route and identifies the cereal as suitable for use in recipes. It supplies the current ingredient list and a product-specific nutrition panel. The package sizes listed by the manufacturer range from 20 g to 1.24 kg [S01–S02]. A current Metro Québec product listing calls it **Céréales Multi Grain Cheerios** / **Céréales multigrains Format économique Cheerios** and identifies the seller's 585 g item by code `065633134157` [S03].

Use the manufacturer's English brand title and a descriptive Québec-facing French display with the local product class. The wording `céréales multigrains` is supported by the current Metro product title. OQLF's food-domain entry prefers `multigrain` and `multicéréale`, explains the compound's food sense, and gives the spelling rule: the prefix joins without a hyphen; plural marking may follow the plural referent. This supports the spelling of the French description, but does not prescribe the complete branded product title [S04].

The candidate remains one finished, formulated, ready-to-eat cereal. Do not model it as loose multigrain flakes, a form of oats, or an ingredient formula. Manufacturer copy says the product contains three whole grains, while Metro's current description says five; the manufacturer's ingredient panel names whole-grain oats and corn and brown-rice flour among the ingredients. This conflict is a reason to avoid fixing a grain count or deriving a generic blend definition. It does not obscure which branded product the bilingual manufacturer pages identify. Record the formula only at source scope if needed; do not split it into component-reference links.

| Neighbor | Existing owner | Boundary |
|---|---|---|
| `multigrain flakes / flocons multigrains` | `ingredient-ref-multigrain-flakes` | A dry blend of cereal flakes, not this ready-to-eat formulated cereal. |
| Frosted Flakes Less Sugar Multigrain | `ingredient-ref-frosted-flakes-less-sugar-multigrain` | A separate branded finished cereal with a different formula and name. The shared word `multigrain` does not make it the same product. |
| Oat, corn, and rice identities and their processed forms | Existing ingredient references | Source-listed components remain separate from the finished packaged cereal identity. No aliases or recipe links are proposed between them. |
| Cheerios-branded oat-crunch, honey-nut, and other variants | Separate product names in manufacturer pages; no current exact active reference found for the candidate | Do not generalize the identity to the Cheerios brand family or to another flavor. |

## Exact ownership and source-collision audit

At the review snapshot the working tree has **1,556 active ingredient references**, **122 ingredient forms**, **61 legacy-import candidates**, and **1,901 ledger records** containing **8,158 source entries**, **6,969 distinct source IDs**, and **5,765 distinct source URLs**.

Exact normalized searches covered the proposed stable ID, `Multi-Grain Cheerios`, `Multi Grain Cheerios`, `céréales multigrains Cheerios`, the manufacturer's French current title, product code `065633134157`, and the neighbor phrases. No exact candidate owner exists in active references, forms or form terms, legacy names or aliases, or ledger records. The exact product and product code were not found in the active plan, recipe corpus, proposal archive, or batch archive. There is no earlier focused WP03 Section F review or hold for Multi-Grain Cheerios. The proposal-local source IDs `WP03-MULTIGRAIN-CHEERIOS-R180-S01` through `S03` were checked absent from the research ledger and proposal archive; the product-page and Metro URLs were likewise absent from ledger source URLs. Reuse OQLF source `WP03-MFLAKES-20261012-S01`, already registered on the multigrain-flakes research, instead of duplicating it.

The active cereal/flake family includes `ingredient-ref-multigrain-flakes`, R179's Frosted Flakes less-sugar cereal, and the current bran-flakes, cereal, oat, rice, and branded hot-cereal identities. None owns `Multi-Grain Cheerios` or the proposed French title. Related entries remain distinct even though a broad multigrain or cereal query returns several results.

## Picker projection

The current ingredient picker normalizes accents and punctuation, returns complete word-phrase matches first, and uses substring matching only when no phrase match exists. A static read-only projection from the current reference file shows:

| Query | Current result | With proposed display |
|---|---|---|
| `Multi-Grain Cheerios` | 0 | Proposed row only |
| `céréales multigrains Cheerios` | 0 | Proposed row only |
| `Cheerios` | 0 | Proposed row only; a future broader Cheerios family query would need review if more brand products are added |
| `multigrain` / `multigrains` / `multi-grain` | 2 / 2 / 1, including multigrain flakes and R179's Frosted Flakes cereal | 2 / 3 / 2. The singular `multigrain` query stays with the two existing phrase matches because the picker prefers phrase matches over substring fallback; the French plural and hyphenated query each include the proposed row. |
| `multigrain cereal` | 1: R179's Frosted Flakes cereal | 1; no generic alias is added |
| `cereal` / `céréales` | 20 / 16 existing rows | 20 / 17 rows; the English display omits `cereal`, while the French display names the product class. |

The three-result multigrain-family query is an expected product choice: the plain loose flake blend, the Frosted Flakes ready-to-eat SKU, and the proposed Cheerios ready-to-eat SKU are different items. Keep aliases empty so bare `Multi Grain`, `Cheerios`, or `multigrain cereal` is not added as a free-standing mapping. The display itself necessarily makes `Cheerios` a phrase within the full product name, so note it as a brand-family query rather than equivalence to other Cheerios products.

## Recipe-corpus demand

All **114 manifest-listed recipe files** and all **1,123 ingredient rows** were searched for the English/French product title and spelling variants, `Multi-Grain Cheerios`, `Multi Grain Cheerios`, `multigrain Cheerios`, `céréales multi-grains`, `céréales multigrains Cheerios`, `Cheerios`, and product codes `065633134157` / `065633132832`. There were **0 matching recipe files and 0 matching ingredient rows**. No recipe link or text change is supported.

## Numeric, preparation, and substitution boundaries

- **Manufacturer serving:** The official nutrition panel lists **1 cup (30 g)** for the current product [S01–S02]. Keep this as a product-page serving observation only if a later ledger integration records it. It does not establish a generic cup measure or a reusable density for cereal, flakes, or oats.
- **Package sizes:** The manufacturer lists several package sizes, and Metro lists a 585 g family-format product [S01–S03]. These are package amounts, not portions, ingredient measures, or yields.
- **Forms and composition:** It is sold ready to eat; no reusable form is needed. The product's stated grain-count and formulation conflict between sources, so add no component decomposition, formula record, or inferred grain-count identity.
- **Conversion or yield:** No recipe preparation ratio, cooking yield, or conversion is supplied. The nutrition serving does not create a mass-volume conversion.
- **Substitutions:** General Mills says the cereal can be used in recipes but gives no tested exchange ratio or specific replacement ingredient. Add no global or contextual substitution to cereal, oats, loose multigrain flakes, corn flakes, or another ready-to-eat cereal.

## Source register

Sources accessed 2026-10-16. Proposal-local sources are not ledger additions.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-MULTIGRAIN-CHEERIOS-R180-S01` | General Mills / Cheerios Canada, [Multi Grain Cheerios](https://www.cheerios.ca/products/multi-grain-cheerios), product title, description, ingredients, and nutrition panel. | Current Canada-English manufacturer page names the product, lists ingredients, says it has three whole grains, lists sizes from 20 g to 1.24 kg, and gives 1 cup (30 g) as a nutrition serving. The claim and serving are product-specific; the package label governs if the online page conflicts with it. |
| `WP03-MULTIGRAIN-CHEERIOS-R180-S02` | General Mills / Cheerios Canada, [Multi-Grain Cheerios](https://www.cheerios.ca/fr-CA/products/multi-grain-cheerios), French product page, ingredients, and nutrition panel. | Current Canadian French route identifies the same product and provides a French ingredient list and serving label. It says the product contains three whole grains; the detailed current Metro description says five. This inconsistency is not resolved as a fixed grain count. The manufacturer name remains product identification, not an OQLF-approved full compound. |
| `WP03-MULTIGRAIN-CHEERIOS-R180-S03` | Metro Québec, [Céréales multigrains Format économique Cheerios, 585 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/cereales-pour-la-famille/cereales-multigrains/p/065633134157), French title, product code, product description. | Current indexed Québec retailer listing supports the French descriptive wording, a 585 g family package, and product code `065633134157`; its marketing copy says five whole grains, conflicting with the manufacturer's three-grain claim. Direct retrieval returned 403 during review; treat the result as corroborating Québec market naming, not a formula authority. |
| Reused `WP03-MFLAKES-20261012-S01` | Office québécois de la langue française, [multigrain (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8355580/multigrain), food domain and spelling note. | Existing source record supports the food-domain sense, preferred French adjectives `multigrain` / `multicéréale`, and the no-hyphen prefix rule. It supports lexical construction only, not this product's complete display or formula. |

## Recommendation

**Add identity-only `ingredient-ref-multi-grain-cheerios` as `Multi-Grain Cheerios / céréales multigrains Cheerios`.** The bilingual Canadian manufacturer pages identify the current cereal, and a Québec retailer provides a current French product listing. Keep it distinct from the dry multigrain-flakes ingredient and from other ready-to-eat cereal products. Retain no aliases, forms, reusable measurements, density, mappings, conversions, yields, recipe links, or substitutions. Do not encode a grain count or formula from the conflicting manufacturer and retailer descriptions. Section F remains open.

## Root integration disposition

**Accepted with a product-specific serving observation.** Added the identity-only `GRAIN_AND_CEREAL`
reference with empty aliases, null density, and no unit mappings. Recorded the manufacturer's 1 cup
(30 g) Nutrition Facts serving only as a product-specific ledger observation; it creates no reusable
cereal measure or conversion. The French display follows the Québec retailer's multigrains wording.
The three-versus-five-grain marketing discrepancy remains unencoded. No recipe link was added.
