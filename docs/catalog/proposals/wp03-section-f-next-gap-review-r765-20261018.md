# WP03 Section F R765 — Quaker Harvest Crunch / Croque Nature family review — 2026-10-18

## Review record

- **Reviewed:** 2026-10-18.
- **Plan fit:** Section F still calls for review of regionally significant cereal mixes and preprocessed grains ([active checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4878)); the broader cereal and preprocessed-grain review also remains open ([current plan item](../../RecipeBook-global-ingredient-catalog-plan.txt#L15596)).
- **Candidate:** The current Canadian Quaker Harvest Crunch / Croque Nature ready-to-eat cereal family.
- **Recommendation:** Add seven separate, identity-only, bilingual GRAIN_AND_CEREAL references for the seven variants named on both current Canadian manufacturer family pages. Keep both English-listed Protein variants out until a manufacturer-supported French product name is available.
- **Boundary:** Add no aliases, forms, measures, conversions, yields, recipe links, or substitutions. This is a seven-pair subset of the displayed family roster, not a claim that the current nine-item English list is fully represented.
- **Status:** Proposal only. No catalog, ledger, plan, roadmap, recipe, or generated data changed.
- **Snapshot:** 1,850 active references (283 GRAIN_AND_CEREAL), 186 forms, 56 legacy candidates, 2,245 ledger records, and 114 manifest recipes / 1,123 structured ingredient rows.

## Why this is a distinct open gap

R524 held the Canadian Maple variant outside the catalog pending a family-level bilingual picker review. Its concern was concrete: the current English manufacturer page listed nine Harvest Crunch products, while the French Canadian Croque Nature page listed seven. Adding Canadian Maple alone would make a broad family query look like a complete singleton. R524 explicitly left the product and its proposed source IDs unallocated pending that follow-up ([R524 proposal](wp03-section-f-next-gap-review-r524-20261017.md), [hold integration note](../batches/wp03-section-f-quaker-harvest-crunch-canadian-maple-hold-integration-r524-20261017/README.md)).

The current Canadian manufacturer pages still show nine English products and seven French products [S01, S02]. The seven French names pair by flavor with seven current English names [S03–S16]. The two additional English entries are Protein Oat, Honey and Almond Flavour and Protein Oat, Chocolate and Almond Flavour. Neither is on the French family page, and this review did not find a manufacturer-supported French product name for either. Do not invent translations or present the seven proposed rows as an exhaustive family roster.

This question is separate from R762's Post Shredded Wheat & Bran Spoon Size identity and from R756's whole-grain sorghum forms/yields and R759's Apple Cinnamon Cheerios identity ([R762](wp03-section-f-next-gap-review-r762-20261018.md), [R756](wp03-section-f-next-gap-review-r756-20261018.md), [R759](wp03-section-f-next-gap-review-r759-20261018.md)). None covers Quaker Harvest Crunch / Croque Nature.

## Proposed bilingual identities

Each row is a finished branded cereal, not an ingredient component, granola synonym, preparation form, or family-level parent. Manufacturer marks are omitted from display names. Use empty aliases for both languages.

| Variant | Proposed stable ID | Proposed English display | Proposed Canadian French display | Source pages |
|---|---|---|---|---|
| Apple Crumble | ingredient-ref-quaker-harvest-crunch-apple-crumble-cereal | Quaker Harvest Crunch Apple Crumble Cereal | Quaker Céréales Croque Nature Croustade aux pommes | S03, S04 |
| Canadian Maple | ingredient-ref-quaker-harvest-crunch-canadian-maple-cereal | Quaker Harvest Crunch Canadian Maple Granola Cereal | Quaker Céréales granola Croque Nature Érable canadien | S05, S06 |
| Dark Chocolate, Cranberry & Almond | ingredient-ref-quaker-harvest-crunch-dark-chocolate-cranberry-almond-cereal | Quaker Harvest Crunch Dark Chocolate, Cranberry & Almond Cereal | Quaker Céréales Croque Nature Chocolat noir canneberges et amandes | S07, S08 |
| Light & Crisp Honey & Nut | ingredient-ref-quaker-harvest-crunch-light-crisp-honey-nut-cereal | Quaker Harvest Crunch Light & Crisp Honey & Nut Cereal | Quaker Céréales Croque Nature Légères et croustillantes Miel et noix | S09, S10 |
| Original | ingredient-ref-quaker-harvest-crunch-original-cereal | Quaker Harvest Crunch Original Cereal | Quaker Céréales Croque Nature Recette originale | S11, S12 |
| Raisin & Almond | ingredient-ref-quaker-harvest-crunch-raisin-almond-cereal | Quaker Harvest Crunch Raisin & Almond Cereal | Quaker Céréales Croque Nature Raisins secs et amandes | S13, S14 |
| Light & Crisp Raisin Almond | ingredient-ref-quaker-harvest-crunch-light-crisp-raisin-almond-granola-cereal | Quaker Harvest Crunch Light & Crisp Raisin Almond Granola Cereal | Quaker Céréales granola Croque Nature Légères et croustillantes Raisins secs et amandes | S15, S16 |

For each reference, use aliasesEn: [], aliasesFr: [], category GRAIN_AND_CEREAL, defaultDensity: null, and unitMappings: []. The Canadian Maple ID and displays appeared only as hypothetical values in R524; they are still unallocated in shared data. The other six IDs and all seven exact bilingual display pairs are unallocated.

Keep these variants separate from generic granola, plain rolled oats, wheat, maple syrup, almonds, raisins, and one another. Product flavor and family wording are part of the finished-product identity. Do not add Harvest Crunch or Croque Nature as aliases to another product.

## Ownership and prior-decision audit

The read-only audit covered active reference names and aliases, form labels and match terms, legacy identities, ledger records and source URLs, current plan and roadmap, proposal and batch history, and all manifest-listed recipes.

| Surface | Finding |
|---|---|
| Active references | No proposed ID or exact proposed product title is owned. No active Quaker Harvest Crunch or Croque Nature identity was found. |
| Forms | No matching form label or match term was found. No form is proposed. |
| Legacy identities | No proposed ID or exact bilingual product title is owned. |
| Research ledger | No Harvest Crunch / Croque Nature product identity or family-specific source is present. None of the proposed product-page or family-page URLs is owned in the ledger. The current Quaker Super Grains hot cereal is a different product. |
| Earlier decision | R524 is the only focused Harvest Crunch / Croque Nature decision found. It holds Maple pending this family review. The Canadian Maple proposed ID/title and the English/French family-page and Maple product-page URLs occur in R524 as proposal-local material; they were not allocated to shared data. No later family-level decision resolves the hold. |
| Other proposal or batch history | No prior Harvest Crunch/Croque Nature family integration or separate product identity was found. R762 is the Post bran-added cereal review; R756 and R759 address different products. |
| R765 allocation | The R765 reference IDs and source-ID prefix are absent from active data, the ledger, and prior proposal/batch files. Source IDs use the unique prefix WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S01 through S16. |

If this proposal is accepted, source entries for the two family URLs and the Canadian Maple product URLs should use the R765 source IDs below. Although those URLs were cited in R524, their earlier source IDs stayed proposal-local and have no shared-ledger owner.

## Static picker projection

This projection uses current references, aliases, and forms with the case-folded, accent/ligature/punctuation normalization and complete-word-phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The proposed rows have no aliases or forms.

| Query | Current matches | With seven proposed rows | Effect |
|---|---:|---:|---|
| Harvest Crunch | 0 | 7 | Returns the seven bilingual variants as distinct choices; does not imply the two English-only Protein variants are represented. |
| Croque Nature | 0 | 7 | Returns the same seven paired variants. |
| Each full proposed English or French display | 0 | 1 | The full product name selects its specific row. |
| Quaker | 4 | 11 | Adds seven named products to the existing Quaker results. |
| granola | 4 | 6 | Adds Canadian Maple and Light & Crisp Raisin Almond, whose proposed displays contain granola. |
| cereal / céréales | 77 / 74 | 84 / 81 | Each broad category term gains seven rows. |
| maple / érable | 8 / 8 | 9 / 9 | Adds only the Canadian Maple product. |

These are static result counts, not an Android picker test. The family terms no longer produce a single apparently complete Canadian Maple result. The English manufacturer page still lists two additional Protein items without French family entries; the seven-row result must remain described as the currently supported bilingual subset.

## Bundled recipe demand

The manifest-ordered scan parsed all 114 recipe files and 1,123 structured ingredient rows. It searched the full recipe JSON and ingredient-row fields for the seven proposed IDs and product names, Harvest Crunch, Croque Nature, Quaker Harvest Crunch, Canadian Maple, and Érable canadien. It found zero matching recipe files and zero matching ingredient rows. No candidate-specific recipe link or recipe-text change is justified.

## Measurement, form, and substitution scope

- **Measurements:** Manufacturer pages expose nutrition-panel serving statements, but this identity review did not evaluate them for a transferable recipe measure. Add no observation and leave measurement research as not_yet_researched if ledger records are created.
- **Forms and conversions:** Add no forms, density, unit mappings, or active conversions. No state or cooking yield is being modeled.
- **Substitutions:** No substitute research was performed. Leave substitution research as not_yet_researched if ledger records are created; add no finding or runtime rule.
- **Recipe links:** The corpus scan found no product-specific demand, so add no link.

If integrated, create one identity ledger record per proposed reference with identityState verified, measurementState not_yet_researched, and substitutionResearchState not_yet_researched. Attach the two family rosters and that variant's English/French product pages as identity evidence. Do not create a measurement observation from the nutrition-panel serving text.

## Source register

Sources are current Canadian Quaker / PepsiCo Canada pages accessed 2026-10-18. The product pages support their own displayed product identities and bilingual flavor pairing; they are not used here to establish measures, formulations, conversions, or substitutions.

| Source ID | Source and evidence |
|---|---|
| **S01 — WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S01** | Quaker / PepsiCo Canada, [Harvest Crunch cereal family page](https://www.tastyrewards.com/en-ca/brands/quaker/products-categories/c%C3%A9r%C3%A9ales-croque-naturemc). Lists nine English products, including the seven variants paired with French names below and the two Protein variants not listed on the French page. |
| **S02 — WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S02** | Quaker / PepsiCo Canada, [Croque Nature family page](https://www.tastyrewards.com/fr-ca/marques/quaker/produits-categories/c%C3%A9r%C3%A9ales-croque-naturemc). Lists seven French products and uses Croque Nature as the French family name. Its roster does not provide a French display for either Protein item. |
| **WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S03 / WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S04** | Quaker / PepsiCo Canada, [Apple Crumble, English](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-harvest-crunchr-apple-crumble-cereal) and [Croustade aux pommes, French](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-croque-naturemc-croustade-aux-pommes). Product headings support the bilingual pair. |
| **WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S05 / WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S06** | Quaker / PepsiCo Canada, [Canadian Maple, English](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-harvest-crunchr-canadian-maple-granola-cereal) and [Érable canadien, French](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-granola-croque-naturemc-erable-canadien). Product headings support the bilingual pair; these URLs were also cited locally in R524. |
| **WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S07 / WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S08** | Quaker / PepsiCo Canada, [Dark Chocolate, Cranberry & Almond, English](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-harvest-crunchr-dark-chocolate-cranberry-almond-cereal) and [Chocolat noir canneberges et amandes, French](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-croque-naturemc-chocolat-noir-canneberges-et-amandes). Product headings support the bilingual pair. |
| **WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S09 / WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S10** | Quaker / PepsiCo Canada, [Light & Crisp Honey & Nut, English](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-harvest-crunchr-light-crispr-honey-nut-cereal) and [Légères et croustillantes Miel et noix, French](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-croque-naturemc-legeres-et-croustillantesmc-miel-et-noix). Product headings support the bilingual pair. |
| **WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S11 / WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S12** | Quaker / PepsiCo Canada, [Original, English](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-harvest-crunchr-original-cereal) and [Recette originale, French](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-croque-naturemc-recette-originale). Product headings support the bilingual pair. |
| **WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S13 / WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S14** | Quaker / PepsiCo Canada, [Raisin & Almond, English](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-harvest-crunchr-raisin-almond-cereal) and [Raisins secs et amandes, French](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-croque-naturemc-raisins-secs-et-amandes). Product headings support the bilingual pair. |
| **WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S15 / WP03-QUAKER-HARVEST-CRUNCH-FAMILY-R765-20261018-S16** | Quaker / PepsiCo Canada, [Light & Crisp Raisin Almond, English](https://www.tastyrewards.com/en-ca/brands/quaker/products/quakerr-harvest-crunchr-light-crispr-raisin-almond-granola-cereal) and [Légères et croustillantes Raisins secs et amandes, French](https://www.tastyrewards.com/fr-ca/marques/quaker/produits/quakerr-cereales-granola-croque-naturemc-legeres-et-croustillantesmc). Product headings support the bilingual pair. |

## Review checks

- [x] Re-read current AGENTS.md, the open Section F checklist, roadmap, R524 and its hold note, R762, R756, and R759.
- [x] Verified the current English and French Quaker family rosters and opened the fourteen paired product pages.
- [x] Checked proposed IDs and exact names against references, forms, legacy identities, and the ledger; checked source-ID namespace and ledger URL ownership.
- [x] Projected family, product, and broad category searches against the current phrase-first picker behavior.
- [x] Scanned all 114 manifest-listed recipe files and 1,123 structured ingredient rows; found no product-specific demand.
- **No software tests, build, emulator, or deployment were run.** This is proposal-only documentation work.
