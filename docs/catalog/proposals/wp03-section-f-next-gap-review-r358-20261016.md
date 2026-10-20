# WP03 Section F — Cinnamon Toast Crunch cereal-family picker hold (R358, 2026-10-16)

## Review record

- **Status:** Integrated as a documentation-only picker hold on 2026-10-16; see the [integration README](../batches/wp03-section-f-cinnamon-toast-crunch-family-picker-hold-integration-r358-20261016/README.md).
- **Selected gap:** The Canadian ready-to-eat cereal marketed as `Cinnamon Toast Crunch` / `Croque Cannelle` has no active identity. A Walmart Canada brand-listing snapshot groups the base product with differently named variants, but does not establish which variants remain available.
- **Section F context:** The checklist still calls for remaining grain and cereal coverage ([plan, line 552](../../RecipeBook-global-ingredient-catalog-plan.txt#L552)). Its existing cereal decisions use family-wide picker review where a single flavor would make a broad brand query look complete; see the separate Honey Nut Cheerios hold and Oat Crunch Cheerios family integration ([R186 proposal](wp03-section-f-honey-nut-cheerios-family-picker-hold-review-r186-20261016.md), [R186 README](../batches/wp03-section-f-honey-nut-cheerios-family-picker-hold-integration-r186-20261016/README.md), [R198 proposal](wp03-section-f-oat-crunch-cheerios-family-review-r198-20261016.md), [R198 README](../batches/wp03-section-f-oat-crunch-cheerios-family-integration-r198-20261016/README.md)). Those decisions concern other products and remain unchanged.
- **Exact-candidate archive audit:** Exact and normalized searches of active references and forms, legacy identities, research-ledger records, the plan, roadmap, proposal archive, and batch READMEs found no `Cinnamon Toast Crunch` / `Croque Cannelle` owner or earlier candidate-specific review. Recent Post, Vector, and EnviroKidz cereal reviews concern different products ([R262 proposal](wp03-section-f-cranberry-almond-crunch-cereal-identity-review-r262-20261016.md) / [README](../batches/wp03-section-f-cranberry-almond-crunch-cereal-integration-r262-20261016/README.md), [R251 proposal](wp03-section-f-vector-cereal-family-identity-review-r251-20261016.md), [R265 proposal](wp03-section-f-gorilla-munch-cereal-identity-review-r265-20261016.md) / [README](../batches/wp03-section-f-gorilla-munch-cereal-integration-r265-20261016/README.md)). No reviewed candidate or hold is reopened here.
- **Recommendation:** Hold the proposed single-product reference pending a family-level picker decision. The base cereal has a well-supported English product description and Québec-facing French retail wording. An accessible Walmart Canada brand-listing snapshot shows several differently named entries, but it is not a manufacturer SKU list and its available crawl may predate this review. Verify the current Canadian family before adding one row that could make `Cinnamon Toast Crunch` or `Croque Cannelle` appear to select the whole family.
- **Candidate wording, if a family review later approves this product:** `Cinnamon Toast Crunch cereal / céréales Croque Cannelle`. The French display is Québec retail wording, not an OQLF ruling or a current French-language manufacturer product title.
- **Snapshot at review:** 1,693 active references, including 243 `GRAIN_AND_CEREAL` references; 139 forms; 56 legacy candidates; 2,049 research-ledger records; 114 manifest-listed recipes with 1,123 ingredient rows.
- **Evidence IDs:** `WP03-CTC-FAMILY-R358-20261016-S01` through `S04` are proposal-local only. They are not registered in the shared ledger.

## Product identity and bilingual naming

General Mills Canada's current English page identifies **Cinnamon Toast Crunch™** as a cinnamon-sugar cereal. Its Canadian French page keeps the same English brand title and describes a cinnamon-sugar cereal; its image text calls the brand **Croque Cannelle** [S01–S02]. A current Walmart Canada French listing for the 354 g item uses the product wording **Croque Cannelle, Céréales pour le petit-déjeuner au goût de cannelle authentique, grains entiers** and describes crisp whole-wheat and rice squares with cinnamon sugar [S03]. These sources support the candidate pair `Cinnamon Toast Crunch cereal / céréales Croque Cannelle`, with the French name grounded in local retail usage. They do not establish an OQLF-preferred product name.

The candidate is the standard ready-to-eat cinnamon-sugar square cereal. Keep it separate from generic corn flakes, crispy rice cereal, multigrain flakes, shredded-wheat cereal, and other branded cereals. Do not derive aliases or ingredient links from its wheat, rice, cinnamon, sugar, or whole-grain description.

The French Walmart brand-listing snapshot available to this review shows nine entries under **Cinnamon Toast Crunch**. In addition to plain `Croque Cannelle` package sizes, it displays `Croque Cannelle Remplies`, `Croque Cannelle Waffle`, `Croque Cannelle Churros`, `Croquant de toast aux fraises`, and `Croque pain doré` [S04]. These are listing titles, not aliases for the plain cereal. The retailer page may combine package sizes, duplicated listings, and sibling products. Its available web crawl predates this review, so it does not establish which siblings remain available or define the manufacturer's full Canadian family. This is enough to flag a possible broad-query collision, but a current manufacturer family review is needed before catalog promotion.

## Ownership, neighbors, and picker effect

The live reference catalog has no exact English or French display/alias for `Cinnamon Toast Crunch`, `Croque Cannelle`, or `céréales Croque Cannelle`. No current form label or match term covers them. The legacy file and research ledger have no matching candidate or identity record. The nearest active product identities are:

| Current owner | Existing identity | Boundary |
|---|---|---|
| `ingredient-ref-corn-flakes` | `corn flakes / flocons de maïs` | A generic corn-flake cereal, not the formulated cinnamon-sugar product. |
| `ingredient-ref-rice-cereal` | `crispy rice cereal / céréales de riz croustillantes` | The generic crispy-rice cereal used in recipe 040; keep that recipe link unchanged. |
| `ingredient-ref-multigrain-flakes` | `multigrain flakes / flocons multigrains` | A plain multigrain flake identity, not this finished branded cereal. |
| `ingredient-ref-shredded-wheat-cereal` | `shredded wheat cereal / blé filamenté` | A separate finished cereal identity; no product equivalence is established. |
| `ingredient-ref-gorilla-munch-cereal`, `ingredient-ref-oreo-puffs-cereal`, and active Cheerios/Special K products | Other named ready-to-eat cereals | Product and brand neighbors only; keep each product family separate. |

The current phrase-first picker normalizes accents and punctuation, returns complete word-phrase matches first, then falls back to substring matches ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). No live Android picker QA was performed or is claimed.

| Query | Current catalog result | If only the plain candidate row were added | Concern |
|---|---|---|---|
| `Cinnamon Toast Crunch` | No result | Plain cereal only | A brand query could look like a complete family result while listed variants remain unrepresented. |
| `Croque Cannelle` | No result | Plain cereal only | The local brand wording is also present in several sibling product titles. |
| `Cinnamon Toast Crunch cereal` | No result | Plain cereal only | Exact product query would be useful, but its presence alone does not settle the broader family query. |
| `cereal` / `céréales` | Many unrelated results | Would gain one result | Generic category search remains broad and is not an alias target. |

Do not add aliases for `Croque Cannelle`, `Cinnamon Toast Crunch`, `cinnamon cereal`, `céréales à la cannelle`, or the component names while this hold remains. The candidate's bilingual displays, if integrated after a family review, should carry the exact product phrases; no broad aliases are needed.

## Manifest-listed recipe demand

All 114 manifest-listed recipe files and their 1,123 structured ingredient rows were scanned. Full-file and ingredient-row searches for `Cinnamon Toast Crunch`, `Croque Cannelle` (with and without a hyphen), and the close product-name variants found no matching mention or ingredient link. Recipe 040's `crispy rice cereal` line remains linked to `ingredient-ref-rice-cereal`; it is not demand for this product. No recipe link, legacy mapping, or substitution is proposed.

## Forms, measurements, conversions, and substitutions

- The candidate is sold ready to eat. The evidence does not support a dry/cooked form or a preparation-yield conversion; add no form.
- Walmart lists a 354 g product and larger 591 g / 830 g plain-product packages [S03–S04]. Those are net package amounts, not household measures, density, serving conversion, or recipe yield. Keep them out of active mappings and measures.
- The sources reviewed do not provide a common volume-to-mass value for the product family. If a later family review records a nutrition-panel serving, keep it SKU-specific in the research ledger; do not transfer it to siblings or make a reusable cup mapping.
- No source establishes a tested replacement ratio between this cereal and corn flakes, crispy rice cereal, another branded cereal, or a grain ingredient. Add no global or contextual substitution rule.
- Because this is a hold, add no active reference, alias, form, measurement observation, recipe link, conversion, yield, or substitution, and do not create a research-ledger candidate.

## Source register

Sources checked online on **2026-10-16**. All source IDs remain proposal-local.

| ID | Source | Evidence and limits |
|---|---|---|
| `WP03-CTC-FAMILY-R358-20261016-S01` | General Mills Canada, [Cinnamon Toast Crunch™ (English)](https://www.generalmills.ca/our-food/brands/cinnamon-toast-crunch). | Current Canadian brand page. Names the brand and describes its cinnamon-sugar cereal; it is not a SKU list or package label. |
| `WP03-CTC-FAMILY-R358-20261016-S02` | General Mills Canada, [Cinnamon Toast Crunch™ (French)](https://www.generalmills.ca/fr-ca/our-food/brands/cinnamon-toast-crunch). | Current Canadian French brand page. Describes the cereal in French and identifies `Croque Cannelle` in image text; the product heading itself remains `Cinnamon Toast Crunch`. This does not establish an OQLF term or a complete French product title. |
| `WP03-CTC-FAMILY-R358-20261016-S03` | Walmart Canada, [Croque Cannelle cereal, 354 g](https://www.walmart.ca/fr/ip/Croque-Cannelle-C-r-ales-Pour-le-Petit-d-jeuner-au-Gout-De-Cannelle-Authentique-Grains-Entiers-354-g/6000198307325). | Current French-language product listing with the 354 g item title and description of whole-wheat and rice squares coated with cinnamon sugar. Retailer-authored/aggregated wording; package labeling governs. The net package amount is not a measure. |
| `WP03-CTC-FAMILY-R358-20261016-S04` | Walmart Canada, [Cinnamon Toast Crunch brand listings](https://www.walmart.ca/fr/c/brand/cinnamon-toast-crunch). | French-language retailer listing snapshot retrieved on 2026-10-16; the available web crawl was older than the review date. It groups nine entries under the brand, including named variants and multiple plain-product sizes. It signals possible query-family breadth but does not establish current availability, a complete assortment, or manufacturer-confirmed SKU relationships. |

## Disposition

Keep `Cinnamon Toast Crunch cereal / céréales Croque Cannelle` outside active references and the shared research ledger until a family-level review defines which current Canadian sibling products the English `Cinnamon Toast Crunch` and French `Croque Cannelle` picker queries should return. Revisit only as that new family review; this proposal does not reopen any existing hold or adjacent cereal decision. Broader Section F identity and terminology coverage remains open.

## Integration record

- Recorded the R358 hold in the Section F cereal-product checklist. No active reference, research-ledger candidate, alias, form, measurement, recipe link, or substitution was added.
- The hold is provisional until current Canadian sibling products and manufacturer naming can be reviewed together. The retailer listing is treated as a dated snapshot, not proof of current stock or a complete product family.
- The documentation-only decision is recorded in the [integration README](../batches/wp03-section-f-cinnamon-toast-crunch-family-picker-hold-integration-r358-20261016/README.md). No software tests were run.
