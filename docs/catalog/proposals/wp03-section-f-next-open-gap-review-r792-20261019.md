# WP03 Section F — Krave cereal family review (R792, 2026-10-19)

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated on 2026-10-19. Root accepted all three bilingual product references and their GTIN-specific label portions.
- **Integration record:** [R791–R793 batch README](../batches/wp02-wp03-wp04-r791-r793-gap-review-integration-20261019/README.md). This review changes no shared catalog JSON, ledger, checklist, plan,
  roadmap, generated index, or application code.
- **Checklist gap:** The open Section F item “Regionally significant cereal mixes and preprocessed
  grains encountered in the cuisine sweeps” at the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4920).
- **Scope:** The three current Canadian products on WK Kellogg Co Canada's Krave family pages:
  Brownie Flavour, Cinnamon Sugar Churro Flavour, and Chocolate Flavour cereal. This is a bounded
  ready-to-eat cereal family review, separate from R789's Quaker Squares family.
- **Recommendation:** Add three separate bilingual `GRAIN_AND_CEREAL` references with no aliases.
  Record one current SmartLabel serving only for the exact package GTIN reviewed for each product.
  Keep forms, reusable measures, density, unit mappings, recipe links, and substitutions empty.
- **Current snapshot:** 1,876 ingredient references, 196 forms, 56 legacy-import candidates, and
  2,281 research-ledger records. The bundled package has 114 manifest-listed recipes and 1,123
  structured ingredient rows.

## Bilingual family and proposed references

WK Kellogg Canada's English Krave family page lists Brownie Flavour, Cinnamon Sugar Churro, and
Chocolate Flavour cereal [S01]. Its French family and Québec-region “Où Acheter” pages list the same
three product variants in French [S02, reused source ID]. The French “Où Acheter” page was rechecked
with Québec selected and displayed all three Krave products on 2026-10-19 [reused source ID]. These
are finished, filled, ready-to-eat cereal products. Keep each named flavour separate from the other
two Krave products and from component ingredients such as whole-wheat flour, oat flour, corn bran,
and chocolate. Do not turn product ingredients into aliases, identities, or substitutions.

| Proposed reference ID | English display | French display | Aliases | Exact reviewed package portion |
|---|---|---|---|---|
| `ingredient-ref-kelloggs-krave-brownie-flavour-cereal` | `Kellogg's Krave Brownie Flavour Cereal` | `Céréales Kellogg's Krave Saveur de Brownie` | None | GTIN `00064100146228`, 298 g package: 1 cup (43 g) |
| `ingredient-ref-kelloggs-krave-cinnamon-sugar-churro-cereal` | `Kellogg's Krave Cinnamon Sugar Churro Flavour Cereal` | `Kellogg's Krave céréales saveur de churro au sucre à la cannelle` | None | GTIN `00059724102088`, 314 g package: 1 cup (42 g) |
| `ingredient-ref-kelloggs-krave-chocolate-flavour-cereal` | `Kellogg's Krave Chocolate Flavour Cereal` | `Céréales Kellogg's Krave Saveur de chocolat` | None | GTIN `00064100142305`, 981 g package: 1 cup (43 g) |

The English and French displays follow the manufacturer’s family, product, SmartLabel, and
Québec-selected product-listing wording [S01–S10, reused source ID]. In particular, preserve the
manufacturer's French churro wording as published. The reviewed labels show distinct named products
and different compositions; they do not establish a single generic “Krave cereal” identity or make
any of the three flavour names interchangeable. Keep the products separate from `ingredient-ref-corn-bran`,
generic chocolate, wheat, oat flour, rice flour, and generic cereal references. Add no broad aliases
such as `Krave`, `chocolate cereal`, `brownie cereal`, `churro cereal`, or component-ingredient names;
the canonical bilingual displays already support the product and family searches.

## Product-specific measurement and substitution evidence

WK Kellogg's SmartLabel pages give the published serving for each selected package: Brownie, 298 g
GTIN `00064100146228`, is 1 cup (43 g); Cinnamon Sugar Churro, 314 g GTIN `00059724102088`, is 1 cup
(42 g); and Chocolate, 981 g GTIN `00064100142305`, is 1 cup (43 g) [S04, S06–S07, S09–S10]. These
are observations for the listed package GTINs. The product pages list additional package sizes for
Churro and Chocolate, so do not transfer the reviewed portion to those sizes or to other cereal
products. The labels do not specify a cup-filling method. Keep the printed quantity as `1 cup`; do
not assign an app cup convention, infer density, activate a general volume-to-mass conversion, or
add a reusable unit mapping.

The product pages and SmartLabel disclosures identify cereal compositions; they do not recommend
replacing Brownie with Chocolate or Churro, or replacing any Krave product with another cereal or
ingredient. This review does not complete substitution research. Keep each record's
`substitutionResearchState` as `not_yet_researched` and add no global or contextual replacement rule.

## Source register and ownership

New source IDs use `WP03-KRAVE-FAMILY-R792-20261019-S01` through `S10`. All ten corresponding URLs
were absent from the live ledger at review time. Reuse the already-owned French “Où Acheter” source
ID for the current Québec Krave roster; do not allocate a second ID for its URL. That existing ID is
`WP03-ALL-BRAN-FAMILY-R203-20261016-S03`, currently present under the All-Bran references and Cocoa
Loops. Preserve those existing owners. Rechecking the page on 2026-10-19 confirmed that its current
Québec listing also names the three Krave products. If added to the Krave records, its owner-local
support text may describe those additional product names while retaining the existing All-Bran and
Cocoa Loops scopes.

| Source ID | Direct source and evidence | Limit |
|---|---|---|
| `WP03-KRAVE-FAMILY-R792-20261019-S01` | WK Kellogg Co Canada, [Kellogg's Krave family page (English)](https://www.wkkellogg.ca/en/our-foods/our-brands/krave), accessed 2026-10-19. Lists the Brownie Flavour, Cinnamon Sugar Churro, and Chocolate Flavour products. | Current Canadian English family roster and product wording; not a French name or portion source. |
| `WP03-KRAVE-FAMILY-R792-20261019-S02` | WK Kellogg Co Canada, [Kellogg's Krave family page (French)](https://www.wkkellogg.ca/fr/nos-aliments/nos-marques/krave), accessed 2026-10-19. French-Canadian Krave family page. | Supports French family context; product-card text is not fully exposed in the page's text view. Use the Québec “Où Acheter” listing and French SmartLabel pages for exact French product wording. |
| Reuse `WP03-ALL-BRAN-FAMILY-R203-20261016-S03` (existing URL owner retained) | WK Kellogg Co Canada, [Où Acheter (French, Québec selected)](https://www.wkkellogg.ca/fr/ou-acheter), rechecked 2026-10-19. The current page lists `Céréales Kellogg's Krave Saveur de Brownie`, `Kellogg's Krave céréales saveur de churro au sucre à la cannelle`, and `Céréales Kellogg's Krave Saveur de chocolat`; it showed two, three, and eight online retailer listings respectively at review time. | Existing ID and URL remain owned by four All-Bran rows and Cocoa Loops. Reuse for the additional Krave product names without minting a duplicate URL ID. Retailer counts are a page snapshot, not a stock guarantee. |
| `WP03-KRAVE-FAMILY-R792-20261019-S03` | WK Kellogg Co Canada, [Krave Brownie Flavour Cereal](https://www.wkkellogg.ca/en/products/kelloggs-krave-brownie-flavour-cereal), accessed 2026-10-19. English product page lists the 298 g product and its ingredients. | Product identity and composition only; package mass is not a household quantity. |
| `WP03-KRAVE-FAMILY-R792-20261019-S04` | WK Kellogg Co, [SmartLabel: Krave Brownie Flavour Cereal, GTIN 00064100146228](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100146228), accessed 2026-10-19. Reports 1 cup (43 g) for the 298 g package. | Portion belongs to this GTIN; no cup fill method or reusable measure is provided. |
| `WP03-KRAVE-FAMILY-R792-20261019-S05` | WK Kellogg Co Canada, [Krave Cinnamon Sugar Churro Flavour Cereal](https://www.wkkellogg.ca/en/products/krave-cereal-cinnamon-sugar-churro), accessed 2026-10-19. English product page lists 306 g and 314 g package options and the cereal's ingredients. | Product identity and package options; the 314 g serving is sourced separately by exact GTIN. |
| `WP03-KRAVE-FAMILY-R792-20261019-S06` | WK Kellogg Co, [SmartLabel: Krave Cinnamon Sugar Churro Flavour Cereal, GTIN 00059724102088](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00059724102088), accessed 2026-10-19. Reports 1 cup (42 g) for the 314 g package. | Portion belongs to this GTIN; no cup fill method or reusable measure is provided. |
| `WP03-KRAVE-FAMILY-R792-20261019-S07` | WK Kellogg Co, [SmartLabel français: Krave Cinnamon Sugar Churro, GTIN 00059724102088](https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00059724102088), accessed 2026-10-19. French label title is `Kellogg's Krave céréales saveur de churro au sucre à la cannelle`; the label gives 1 tasse (42 g) for the same 314 g package. | French product wording and this package's serving only; not a general cereal conversion. |
| `WP03-KRAVE-FAMILY-R792-20261019-S08` | WK Kellogg Co Canada, [Krave Chocolate Flavour Cereal](https://www.wkkellogg.ca/en/products/kellogg-s-krave-chocolate-flavour-cereal-product), accessed 2026-10-19. English product page lists 300 g, 500 g, and 981 g package options and the cereal's ingredients. | Product identity and package options; the reviewed 981 g serving is sourced separately by exact GTIN. |
| `WP03-KRAVE-FAMILY-R792-20261019-S09` | WK Kellogg Co, [SmartLabel: Krave Chocolate Flavour Cereal, GTIN 00064100142305](https://smartlabel.wkkellogg.com/en_CA/Product/Index?gtin=00064100142305), accessed 2026-10-19. Reports 1 cup (43 g) for the 981 g package. | Portion belongs to this GTIN; no cup fill method or reusable measure is provided. |
| `WP03-KRAVE-FAMILY-R792-20261019-S10` | WK Kellogg Co, [SmartLabel français: Céréales Krave saveur de chocolat, GTIN 00064100142305](https://smartlabel.wkkellogg.com/fr_CA/Product/Index?gtin=00064100142305), accessed 2026-10-19. French title is `Céréales Kellogg's Krave Saveur de chocolat`; the label gives 1 tasse (43 g) for the same 981 g package. | French product wording and this package's serving only; not a general cereal conversion. |

## Catalog and collision audit

At review time, no active reference, ingredient form, legacy candidate, ledger record, prior proposal,
or integration README contained `Krave` or any of the three proposed product IDs. The proposed
English and French displays were also absent from those stores. The broad Section F parent already
includes R789's distinct Quaker Squares family; no Krave-specific review or hold was found in the
archive. The current manufacturer roster supports all three Krave siblings together, so the picker
addition does not leave a one-flavour partial family.

No ledger record owns any of the ten new family, product, or SmartLabel URLs. The sole URL collision
is `https://www.wkkellogg.ca/fr/ou-acheter`, already registered under
`WP03-ALL-BRAN-FAMILY-R203-20261016-S03`; retain that ID and its existing All-Bran/Cocoa Loops owners.
No ledger source ID begins with `WP03-KRAVE-FAMILY-R792-20261019-`. The proposal path was unique at
review time.

## Picker projection

This static projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, and punctuation; prefer complete word phrases; then use substring matching only when no complete phrase matches. It includes current reference and form terms plus the three displays above, with no aliases.

| Query | Current | With three products | Effect |
|---|---:|---:|---|
| `Krave`; `Kellogg's Krave` | 0; 0 | 3; 3 | Returns the complete named family. |
| `Krave Brownie`; `Kellogg's Krave Brownie` | 0; 0 | 1; 1 | Finds only the Brownie product. |
| `Krave Cinnamon Sugar Churro` | 0 | 1 | Finds only the Churro product. |
| `Krave Chocolate`; `Céréales Kellogg's Krave Saveur de chocolat` | 0; 0 | 1; 1 | Finds only the Chocolate product. |
| `cereal` / `céréales` | 102 / 99 | 105 / 102 | Adds three finished cereals to broad class searches. |
| `chocolate` / `chocolat` | 15 / 15 | 16 / 16 | Adds the one product whose canonical names specify chocolate flavour. |
| `corn bran` / `son de maïs` | unchanged | unchanged | Ingredient remains separate; no component alias is added. |

Each exact product display returns one reference. This is a deterministic static projection, not a
live Android picker check.

## Bundled-recipe demand

The manifest lists 114 recipe files with 1,123 structured ingredient rows. I scanned every
manifest-listed recipe file and ingredient row for `Krave`, the complete English and French product
phrases, all three proposed IDs, and the exact `Brownie`, `Cinnamon Sugar Churro`, and `churro au
sucre à la cannelle` product-family phrases. The scan found zero matching recipe files and zero
matching ingredient rows. The ingredient name `chocolate` alone is common recipe text and was not
treated as Krave demand. Add no recipe links or bundled recipe changes.

## Precise proposed data delta

Add exactly the three references in the bilingual table as identity-only `GRAIN_AND_CEREAL` products,
with empty English and French alias arrays, `defaultDensity: null`, `unitMappings: []`, and no forms.
Add one `ingredient_reference` research-ledger record for each with `identityState: verified`,
`measurementState: researched_supported` for that named package's label portion, and
`substitutionResearchState: not_yet_researched`. Add one `portion_weight` observation per row:

- Brownie: `sourceQuantity` 1 `cup`, value 43 `g`, GTIN `00064100146228` (298 g package).
- Cinnamon Sugar Churro: `sourceQuantity` 1 `cup`, value 42 `g`, GTIN `00059724102088` (314 g package).
- Chocolate: `sourceQuantity` 1 `cup`, value 43 `g`, GTIN `00064100142305` (981 g package).

Each observation's food state is dry, ready-to-eat cereal as sold. Its method should state that the
manufacturer SmartLabel publishes the serving without describing how the cup is filled; do not set a
unit convention or derive a general conversion. Use these observation IDs:

- `krave-brownie-1-cup-43g-gtin00064100146228-r792-20261019`
- `krave-cinnamon-sugar-churro-1-cup-42g-gtin00059724102088-r792-20261019`
- `krave-chocolate-1-cup-43g-gtin00064100142305-r792-20261019`

Register new sources S01–S10 once with the row scopes above. Reuse
`WP03-ALL-BRAN-FAMILY-R203-20261016-S03` for the rechecked French Québec product-listing names; do
not register a duplicate source ID for `https://www.wkkellogg.ca/fr/ou-acheter`, and preserve its
existing All-Bran and Cocoa Loops owners. Add no aliases, forms, active measures, density, mappings,
conversions, yields, recipe links, or substitutions. The broad Section F checklist remains open.

## Proposal-only checks

- [x] Confirmed the exact open Section F checklist item and read the active references, forms, legacy
  candidates, research ledger, current plan item, workflow contract, and recent batch integration
  records.
- [x] Checked proposed IDs and names, proposal path, R792 source-ID prefix, all exact source URLs,
  source-ID ownership, and the existing French Where-to-Buy URL owner.
- [x] Reopened current English and French manufacturer family, product, retailer-directory, and
  SmartLabel pages on 2026-10-19; kept all servings tied to their exact GTIN/package.
- [x] Projected phrase-first picker effects and scanned every manifest-listed recipe file and
  structured ingredient row for product-specific demand.
- **No software tests, build, emulator checks, or deployment were run.** This is a proposal-only
  documentation change; no database JSON or executable code changed.
