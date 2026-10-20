# WP02 white-wheat identity and Québec flour-terminology gap review

**Review date:** 2026-10-10
**Status:** Integrated by root on 2026-10-10. The identity-only reference and all-purpose alias correction are in the canonical seed and research ledger; generated index and focused tests were updated.
**Scope:** Open WP02 A1/A2 wheat-flour identity and Québec French terminology gaps that are not covered by the integrated specialist flour packets or the existing Italian/French numbered-class reviews.

## Recommendation

Advance one identity-only candidate for the plan’s explicit white whole-wheat-flour gap:

| Candidate field | Proposal |
|---|---|
| Stable ID | `ingredient-ref-white-whole-wheat-flour` |
| English display | `white whole-wheat flour` |
| Québec French display | `farine intégrale de blé blanc` |
| English alias | `hard white whole wheat flour` |
| French aliases | None proposed |
| Category | `FLOUR_AND_STARCH` |
| Identity boundary | Flour made from white wheat while retaining the whole grain; separate from generic whole-wheat flour and refined white flour. Do not claim that every white-wheat flour is whole-grain. |
| Measurement state | `not_yet_researched` |
| Substitution state | `not_yet_researched` |
| Forms, density, mappings, recipe links, conversions, yields | None |

The English product name and its hard-white-wheat wording appear on a Canadian producer’s product page. A Québec mill directly markets `farine intégrale de blé blanc` and says the product contains the entire grain. Canadian Grain Commission material separately defines Canadian white-wheat grain classes. Together, these sources support a useful identity candidate, but not a crosswalk to a named Canadian Grain Commission class, all-purpose flour, bread flour, or any national extraction grade [WQF-S03–S05].

Keep the English alias limited to the manufacturer-attested hard-white wording. Do not add `white wheat flour` or `hard white wheat flour`: either can describe a refined or partly sifted product without establishing a whole-grain flour. Do not add `farine de blé entier blanche` as an alias. That phrase appears on a Canadian retailer’s listing for Sher Fiber Wala, whose listed ingredients describe a blend containing atta plus several other flour/fibre ingredients; the brand also identifies a specific “White Whole Wheat Atta” product. This is not reliable evidence that the phrase is a synonym for the proposed single-ingredient flour [WQF-S06–S08].

The proposed French display is directly attested by the Québec mill, rather than inferred from an English phrase. It remains a product-market term rather than an OQLF entry; independent Québec review should confirm that it is the preferred standalone display.

## Regional and Québec terms held outside the candidate

These are useful search findings, not additional global reference proposals.

| Term or product wording | Evidence found | Disposition |
|---|---|---|
| `farine de blé entier claire Rudy` | A Québec mill lists this as a product and gives a product-specific hydration/use description. Its page does not define “claire” as a white-wheat class or establish a general milling grade. | Hold as a product-level term. Do not alias it to whole-wheat flour, white whole-wheat flour, or pastry flour. |
| `farine de blé bise` | The same mill lists a product and says it is richer and darker. No general Québec definition or reproducible grade boundary was found in this review. | Hold; do not map it to French T80, whole-wheat flour, or rye meal. |
| `farine de blé crème` | The mill describes one white flour product for artisan bread. It does not define a general flour grade or a synonym for all-purpose flour. | Hold as product wording. |
| `farine de blé blanc Tradition` | A Québec stone-mill product is described as made with transitional-organic white wheat, strong, very white, and suited to brioche/viennoiserie. The source does not state that it retains the whole grain or define a general hard-white flour class. | Keep separate from the proposed whole-grain candidate; do not alias to all-purpose, bread flour, or white whole-wheat flour. |
| `Manitoba` / `farine Manitoba` | A Montréal retailer lists one Vecchio Molino product as “Farine Manitoba” and describes that specific product as type 00, enriched, and unbleached. That supports the wording and attributes for the listed SKU only; it does not establish a universal Manitoba flour identity or synonym [WQF-S09]. | Hold as a product/regional label. Do not alias to Italian type 00, high-gluten flour, bread flour, or all-purpose flour. |
| `Sher White Whole Wheat Atta` / `white whole wheat atta` | Brar’s product page lists this as one branded atta alongside a separate brown whole-wheat atta; the Canadian retailer’s French title is `Farine blanche de blé entier Sher`. The retail ingredient list describes a multi-ingredient product. Neither page establishes that “white” means the Canadian hard-white wheat class in the proposed identity [WQF-S07–S08]. | Keep as a source-specific atta product; do not make it an alias of the proposed white whole-wheat-flour identity or of generic atta. |

The local mill’s wording is valuable Québec-market evidence, but its product page groups regional labels with different grain sources and processes. The names `crème`, `bise`, `entier claire`, and `blé blanc Tradition` therefore need product specifications and independent Québec terminology review before they become generic rows [WQF-S05].

## White flour and bleaching boundary

OQLF defines `farine blanche` / “white flour” as wheat flour milled after removing bran and germ. OQLF separately defines `farine tout usage` / all-purpose flour as a Canadian blend of hard- and soft-wheat milling products and notes that flour classes and names differ by country. Those are related but not identical definitions [WQF-S01–S02].

The live reference `ingredient-ref-all-purpose-flour` currently has `farine blanche` and `farine tout usage non blanchie` as French aliases. The exact picker query `farine blanche` currently returns only all-purpose flour. Because the OQLF term describes a broader refined-white-flour class, the alias risks making a generic milling description appear equivalent to all-purpose flour. Recommendation: remove or separately resolve `farine blanche` during integration; do not add it to the white whole-wheat row.

Québec retail terminology confirms that “white” and “unbleached” can occur together: BocoBoco lists a Québec-made, single-ingredient product as `farine de blé blanche tout usage non blanchie tamisée` and says it is for general use. Its product-specific “equivalent T65” statement is not a class crosswalk and should not be reused as one [WQF-S10].

Bleached and unbleached are documented as product variants within all-purpose flour by Ardent Mills Canada: the same hotel/restaurant all-purpose product is available in bleached and unbleached formats. The source also describes a particular unbleached all-purpose product for long sponge/brew fermentations. This supports treating bleaching as a processing/product attribute within an all-purpose family for now, not as two new global ingredient identities. The current alias `farine tout usage non blanchie` can be a search phrase for the base identity only if the app accepts that the picker does not preserve the bleaching qualifier; a structured qualifier/product-specific record remains an open A1 design question [WQF-S11].

No bleaching-specific measurements or recipe substitutions were researched here. Do not turn the source’s commercial product wording into general baking performance or a replacement rule.

## Canadian wheat classes are grain classes, not flour aliases

The Canadian Grain Commission classifies wheat varieties by functional grain characteristics. It separately lists hard-white spring, prairie-spring-white, soft-white-spring, and eastern-white-winter grain classes, with different end uses. The page is a grain classification reference; it does not establish that every flour milled from one of those classes is sold under the class name, or that a class name is interchangeable with cake, pastry, bread, or all-purpose flour [WQF-S03].

The Québec mill’s `farine intégrale de blé blanc` and the Alberta producer’s hard-white whole-wheat flour provide product evidence for the single proposed whole-grain identity. This packet does not propose separate `CWHWS flour`, `CPSW flour`, `CWSWS flour`, or `CEWW flour` identities. Such rows need a Canadian mill product that names the grain class and defines the marketed flour product, plus Québec French evidence if a French label is to be activated.

## Recipe-demand audit

I parsed the 114 recipe files listed in the bundled seed manifest, covering 1,123 ingredient rows. Candidate and held terms were checked against each row’s `ingredientName`, `originalText`, and `ingredientRefId`, with case- and accent-insensitive normalized phrase matching.

- Zero recipe rows mention white whole-wheat flour, hard white whole-wheat flour, `farine intégrale de blé blanc`, `farine de blé entier blanche`, the listed Québec mill descriptors, or `Manitoba flour`.
- The corpus contains 50 all-purpose-flour ingredient rows, confirming demand for the existing generic identity. No candidate identity is used by a bundled recipe.
- No recipe line should be relinked from this research.

The manifest-ordered corpus snapshot contains 114 files / 1,123 ingredient rows; its fingerprint is `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629`.

## Active, legacy, ledger, and search audit

The exact current working-tree snapshot read for this proposal is:

| Artifact | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 719 | `8fd20068788d49cf51b2dd07c031468865f83cfb848e6c8bf9f7c77baaa548ea` |
| Ingredient forms | 34 | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| Research-ledger records | 908 records; 1,795 source entries / 1,479 distinct source IDs | `557409149c96c35c704b64640222ff0bda7f8362efc459a389bf9ec43d8bca6a` |
| Legacy candidates | 84 | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

I searched active names and aliases, all legacy candidate names and aliases, ledger record IDs and source text, and the selected unique ID/source-ID namespace. No exact active, legacy, or ledger owner was found for the proposed ID or the exact candidate phrases `white whole-wheat flour`, `hard white whole wheat flour`, and `farine intégrale de blé blanc`. The proposed ID `ingredient-ref-white-whole-wheat-flour` and local source-ID prefix `WP02-WQF-20261010-` also have no current owner.

Exact active picker searches for those candidate phrases return no result today. On integration, the qualified proposed names should be unique full-phrase matches. Broad queries will remain broad: `whole wheat flour` will match the existing whole-wheat reference and may also match the proposed name by phrase containment; `farine de blé entier` already surfaces the whole-wheat family, meal, and pastry-flour distinctions. Do not add those broad phrases as aliases. The current `farine blanche` exact result is the all-purpose row noted above, so that alias decision must be resolved deliberately rather than mistaken for evidence that the term means all-purpose flour.

This check used the current `IngredientSearch.kt` rules: lowercase, NFKD/accent folding, punctuation-to-space normalization, complete normalized phrase search first, then substring fallback. It does not claim that a single picker result proves equivalence.

## Evidence states and integration limits

For the proposed white whole-wheat identity:

- Identity: source-supported candidate. The product boundary is whole-grain white-wheat flour; the exact hard/soft class and milling details are not generalized.
- Measurement: `not_yet_researched`. No density, cup/weight mapping, package yield, or serving value was activated.
- Substitution: `not_yet_researched`. No global or contextual replacement is proposed.
- Forms, conversions, yields, and recipe links: none.

For all held descriptors, continue to record source-local product names and limits if they enter a later research ledger. Do not normalize them into the candidate or current generic flour rows merely to make search return a result.

## Sources

All sources were accessed on 2026-10-10. Source IDs are proposal-local and are not current ledger IDs.

| Source ID | Source and URL | What it supports and limits |
|---|---|---|
| WQF-S01 | OQLF, [farine de blé entier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361931/farine-de-ble-entier) | Québec French preferred term `farine de blé entier` and its English term; notes the Canadian ≥95% whole-wheat compositional definition and distinguishes Graham flour. It does not name white-wheat flour. |
| WQF-S02 | OQLF, [farine blanche (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8356361/farine-blanche) and [farine tout usage (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25796945/farine-tout-usage) | Defines white flour as flour milled from wheat with bran and germ removed; separately defines Canadian all-purpose flour as a hard/soft-wheat blend and notes national names/classifications differ. It does not say all-purpose and white flour are synonyms. |
| WQF-S03 | Canadian Grain Commission, [Canadian wheat classes](https://www.grainscanada.gc.ca/en/grain-quality/grain-grading/wheat-classes.html) | Identifies Canadian hard-white, prairie-spring-white, soft-white, and eastern-white wheat grain classes and their described uses. Grain-class evidence only; it does not define flour products or crosswalk them to retail baking-flour classes. |
| WQF-S04 | Canadian Food Inspection Agency, [Canadian Food Compositional Standards, Volume 12](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Separately defines white flour, whole-wheat flour, and Graham flour. This supports preserving whole-grain/refined boundaries; legal compositional criteria are not recipe measures or substitutions. |
| WQF-S05 | Expeditor Dry Goods, [Hard White Whole Wheat Flour](https://expeditordrygoods.com/products/hard-white-wheat-flour) | Canadian product page names the flour and says it is Alberta-grown hard white wheat, stone-milled and partially sifted with a small portion of bran removed; it describes the product as retaining whole-grain qualities and lighter/milder than red wheat. Does not state a regulatory percentage or Québec French name. |
| WQF-S06 | Moulin de Charlevoix, [Des farines locales aux qualités uniques](https://www.moulin-charlevoix.net/farines-flour) | Québec mill directly names `farine intégrale de blé blanc` and says it contains the whole grain; it also lists product-level `bise`, `crème`, `blé entier claire`, and `blé blanc Tradition` items. It does not define those regional product names as general grades or provide English equivalents for the full product range. |
| WQF-S07 | Brar Natural Flour Milling, [Sher product list](https://sherbrarmills.com/our-products/) | Lists Sher White Whole Wheat Atta / Fiber Wala separately from brown whole-wheat atta and other products. It does not publish the product’s ingredient list or wheat-class definition on this page. |
| WQF-S08 | Walmart Canada, [Farine blanche de blé entier Sher](https://www.walmart.ca/fr/ip/Farine-blanche-de-bl-entier-Sher/6000197100753) | Provides the Québec-facing product phrase, identifies the listing as Sher Fiber Wala, and lists atta plus soy, oat, psyllium, corn, and chickpea ingredients. Retailer-transcribed product data; it supports excluding the phrase as an unqualified alias for a single-ingredient flour, not a general French terminology ruling. |
| WQF-S09 | Berchicci, Montréal retailer, [Vecchio Molino Farine Manitoba](https://store.berchicci.ca/fr-ca/Vecchio-Molino-Manitoba-Farine) | Attests the Québec-market name `Farine Manitoba` for one SKU and labels that product type 00, enriched, and unbleached. The statements are product-specific and do not define a global Manitoba identity or synonym. |
| WQF-S10 | BocoBoco, [Farine de blé blanche tout usage non blanchie tamisée](https://bocoboco.ca/produit/farine-de-ble-biologique/) | Québec product page gives this exact French product name, says it is for general use and produced in Coaticook, and lists one ingredient: white unbleached wheat flour. Its “T65 equivalent” statement is product-specific and is not used as a class crosswalk. |
| WQF-S11 | Ardent Mills Canada, [All Purpose Flour](https://ardentmills.ca/products/traditional-wheat/standard-flours/all-purpose/) | Manufacturer lists unbleached and bleached hotel/restaurant all-purpose product formats under the same all-purpose flour family, and describes one unbleached all-purpose product. This supports treating bleaching as a product/process qualifier within the family for now, not as separate universal IDs. |

## Root integration decisions (2026-10-10)

- Added `ingredient-ref-white-whole-wheat-flour` with the proposed English and Québec French displays, the single source-attested English alias, no French aliases, no measurements, and no substitutions.
- Removed `farine blanche` from the all-purpose flour aliases because the OQLF defines it as the broader refined-white-flour term and defines `farine tout usage` separately.
- Retained `farine tout usage non blanchie` as a search phrase for the all-purpose family. The app does not persist the unbleached qualifier separately, so this remains a picker limitation rather than evidence of identical product processing.
- No bundled recipe line was relinked. The new identity remains without forms, density, unit mappings, conversions, yields, or substitutions.
- Added a focused picker test for the new identity, the removed broad alias, and the retained unbleached product phrase. Full package, unit, and emulator verification is recorded in the integration checkpoint.

## Remaining WP02 work after integration

- Obtain independent Québec wording review for `farine intégrale de blé blanc`; current evidence is a direct Québec mill product name, not an OQLF generic-term entry.
- Decide how the search/catalog should preserve bleaching qualifiers without inventing separate ingredients or losing meaningful product distinctions.
- Obtain mill/product specifications before turning Québec `bise`, `crème`, `entier claire`, or `blé blanc Tradition` wording into reusable identities.
- Keep `Manitoba` product labels scoped to the attested products until a current source establishes a consistent flour class and Québec French naming.
- Keep measurement and substitution research separate from the identity decisions above.
