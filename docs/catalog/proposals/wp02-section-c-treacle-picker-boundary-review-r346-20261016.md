# WP02 Section C — treacle and black treacle picker-boundary review

- **Round:** R346
- **Reviewed:** 2026-10-16
- **Status:** integrated as a documentation-only picker-boundary hold; no catalog or ledger data changed.
- **Scope:** unqualified treacle, UK light treacle, UK black treacle, the existing golden-syrup and blackstrap identities, Québec French terminology, picker behavior, corpus demand, and numeric/substitution limits.
- **Plan item:** docs/RecipeBook-global-ingredient-catalog-plan.txt, WP02 Section C, “Light/dark corn syrup, glucose syrup, golden syrup, invert sugar, treacle, regular/fancy molasses, blackstrap molasses, malt syrup, and rice syrup.” The broad Section C item remains open.

## Recommendation

**Hold treacle and black treacle out of the active global catalog and keep the existing boundaries.** Do not add unqualified treacle as an alias for golden syrup, blackstrap molasses, generic molasses, or a new reference. Do not add black treacle to the blackstrap aliases, despite the OQLF’s UK-qualified term listing, because the catalog has no market scope and current Canadian product evidence does not establish a globally safe equivalence. Do not add light treacle to golden syrup: OQLF marks it UK-specific, and the live alias model would lose that scope.

This hold is about a global, unscoped catalog term. It does not dispute that Black Treacle is a real, separately sold UK product or that Canadian specialty retailers carry it. If a future recipe explicitly needs that product, reopen the question against the exact named product and recipe, with a market-qualified display/search design. No present bundled recipe requires that decision.

The bounded source claims are:

| Term or product | Supported claim | Catalog disposition |
| --- | --- | --- |
| golden syrup | A distinct Canadian refined-sugar-syrup class. OQLF lists golden syrup as the English term for mélasse claire and lists light treacle as UK usage within that term entry. | Keep active ingredient-ref-golden-syrup / golden syrup / sirop doré and its existing aliases. Do not add light treacle globally. |
| blackstrap molasses | OQLF lists black treacle as a UK English term under blackstrap molasses, but its definition also records conflicting grade usage for mélasse noire/dark molasses. | Keep active ingredient-ref-blackstrap-molasses / blackstrap molasses / mélasse verte and its current three English aliases. Do not add black treacle, mélasse noire, or dark molasses as global aliases. |
| Lyle’s Black Treacle | Lyle’s markets a named Black Treacle product separately from Golden Syrup. Its product specification calls the black-cane invert product a molasses and lists cane molasses, partially inverted refiners syrup, or sugarcane syrup as the ingredient declaration options. Canadian sellers list the imported 454 g tin. | Treat the exact UK product name as product-market evidence, not proof that unqualified treacle or every black-treacle product is synonymous with a Canadian blackstrap class. Do not create a global identity from this product-only evidence. |
| generic molasses | The legacy candidate ingredient-ref-molasses / molasses / mélasse remains unreviewed and unresolved; the standards and retail sources distinguish several grades and products. | Keep the legacy candidate unresolved. Do not assign it to black treacle, blackstrap, fancy, table, cooking, or golden syrup. |
| unqualified treacle | No source reviewed establishes one locale-neutral product boundary; sources distinguish light/golden and black variants. | No canonical row or alias. |

## Current catalog, ownership, and picker state

The live bundled reference catalog currently has these relevant owners:

| Live owner | Current names and aliases |
| --- | --- |
| ingredient-ref-golden-syrup | golden syrup / sirop doré; English aliases refined sugar syrup and refiners’ syrup; French aliases mélasse claire and mélasse légère. No treacle alias. |
| ingredient-ref-blackstrap-molasses | blackstrap molasses / mélasse verte; English aliases blackstrap, black strap, and third molasses; no French aliases. No black treacle alias. |
| ingredient-ref-fancy-molasses | fancy molasses / mélasse de fantaisie, with the two qualified French aliases mélasse qualité fantaisie and mélasse de qualité fantaisie. |
| ingredient-ref-pomegranate-molasses | pomegranate molasses / mélasse de grenade, category SAUCE_AND_CONDIMENT. Keep it separate from cane-sugar sweeteners. |
| ingredient-ref-molasses | Legacy-only candidate molasses / mélasse, with no aliases and reviewState unreviewed. Its ledger identity remains needs_clarification; measurements and substitutions remain blocked pending evidence. There is no active generic molasses reference. |

The current search implementation normalizes case, accents, punctuation, and spacing, then prefers complete word-phrase matches contained in a reference name or alias; it falls back to substring matching only when no phrase match exists. A read-only match audit against the current active catalog found:

| Query | Current active picker results |
| --- | --- |
| black treacle; treacle; mélasse noire | No result. The catalog test file also has expectations for no result on black treacle and mélasse noire. |
| molasses | blackstrap molasses, fancy molasses, and pomegranate molasses. |
| mélasse | blackstrap molasses, golden syrup, fancy molasses, and pomegranate molasses. |
| golden syrup | golden syrup only. |

If a separate black treacle reference were added, the phrase-first matcher would also return it for the shorter query treacle because treacle is a complete word phrase inside black treacle. If black treacle were instead added to the blackstrap aliases while a distinct row existed, an exact black treacle search would return both owners. The live catalog cannot express “black treacle means this only in UK recipe wording,” so activating either assignment would silently settle a market and identity dispute in the picker.

## Recipe demand and product boundaries

All 114 bundled recipe JSON files and 1,123 ingredient rows were scanned for treacle, black treacle, molasses, blackstrap, and French mélasse terms. There were zero matching rows. No recipe link or recipe-driven catalog promotion is proposed.

The current boundaries should remain explicit:

- **Golden syrup:** CFIA separately defines refined sugar syrup/refiners’ syrup/golden syrup. OQLF’s French entry lists light treacle as a UK term for the golden-syrup concept. This does not establish that all treacle is golden syrup.
- **Blackstrap molasses:** CFIA separately names refiners’ molasses, blackstrap molasses, or cooking molasses as residual liquid from sugar manufacture. OQLF lists black treacle under blackstrap, marked UK, but also describes contested naming around dark/second molasses. These do not establish a market-neutral alias.
- **Fancy and table molasses:** CFIA defines separate product classes; the active fancy-molasses identity must remain separate from black treacle and generic molasses.
- **Cooking molasses:** Crosby describes its own cooking product as a fancy/blackstrap blend. Do not use cooking molasses as a synonym for black treacle or blackstrap.
- **Pomegranate molasses:** retain its distinct condiment identity; the shared word molasses is not identity evidence.
- **Generic molasses and treacle:** do not fill the legacy molasses candidate with a grade or use treacle as its alias.

## Québec French wording

There is no unambiguous global fr-CA display or alias for black treacle in the reviewed evidence:

- OQLF’s 2024 preferred Québec term for blackstrap molasses is mélasse verte. The same entry lists black treacle as UK English usage under that concept.
- OQLF’s entry says mélasse noire may refer to second molasses/dark molasses in some sources and may be used synonymously with mélasse verte in others. Therefore, do not add mélasse noire or dark molasses to the current blackstrap row.
- OQLF’s golden-syrup entry gives mélasse claire and mélasse légère as preferred French terms and marks light treacle as UK usage. The active golden-syrup row already owns the two French terms, but not light treacle.
- A Canadian Armed Forces Morale and Welfare Services French baking handout uses mélasse noire or sirop de mélasse noire for black treacle in explanatory text. This is evidence of Canadian French descriptive wording, not a terminology ruling that resolves the OQLF overlap.
- A current Canadian specialty retailer lists the imported Lyle’s Black Treacle tin with the ingredient translation cane molasses / mélasse de canne. This is product-listing language; it does not establish a standard common name for Québec catalog display.

For these reasons, do not set sirop de mélasse noire, mélasse noire, mélasse de canne, or black treacle as a global French alias or display name in this round. Preserve the exact English product name only in evidence until a recipe need and a Québec naming decision resolve scope. Do not translate unqualified treacle as either sirop doré or mélasse.

## Numeric and substitution limits

No default density, volume-to-mass conversion, unit mapping, package yield, or form is supported.

- The Canadian 454 g imported tin is a package size, not a recipe measure or a volume-to-mass conversion.
- The manufacturer-authored Black Cane Invert Syrup specification reports composition and per-100-g nutrition for an Easy Flow/Squeezy product. Its listed 750 g bottle and bulk pack are format observations only and must not be transferred to the 454 g tin or other treacle products.
- Existing Health Canada blackstrap portions and Crosby blackstrap label data stay attached to their source products. Do not copy them to black treacle, golden syrup, fancy molasses, or generic molasses.
- Lyle’s product materials and its product-list page distinguish Black Treacle from Golden Syrup; they give usage examples but no substitution ratio. Do not activate black treacle ↔ golden syrup, black treacle ↔ blackstrap, or treacle ↔ generic molasses substitutions.
- Any future recipe that offers another syrup or molasses in the same recipe should be recorded as recipe-specific context only, with the exact amounts and scope. It must not establish a global rule.

## Source map

Sources were checked on 2026-10-16. The packet-local labels below are citations for this proposal only; they were not added to the shared ledger.

| Local source ID | Source and URL | Exact support and limits |
| --- | --- | --- |
| WP02-C-TREACLE-R346-S01 | OQLF, [mélasse verte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8874425/melasse-verte) | Preferred term and definition for blackstrap molasses; English terms include black treacle marked Royaume-Uni; note describes conflicting scope of mélasse noire/dark molasses. Terminology only. |
| WP02-C-TREACLE-R346-S02 | OQLF, [mélasse claire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296894/melasse-claire) | Preferred French terms mélasse claire and mélasse légère; English golden syrup, with light treacle marked Royaume-Uni. Terminology only. |
| WP02-C-TREACLE-R346-S03 | CFIA, [Canadian Food Compositional Standards, Volume 15](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Sections 15.1.7 and 15.1.10 separately define golden/refiners’ syrup and refiners’/blackstrap/cooking molasses. No treacle standard is listed. Canadian class distinction; not a product-specific classification for Lyle’s. |
| WP02-C-TREACLE-R346-S04 | Lyle’s, [Our Products](https://www.lylesgoldensyrup.com/our-products/) and [FAQ](https://www.lylesgoldensyrup.com/faq/) | The product range lists separate Golden Syrup and Black Treacle tins; FAQ says golden syrup is made in refining sugar cane and names Lyle’s Black Treacle separately. Supports distinct marketed products, not a general treacle definition or equivalence. |
| WP02-C-TREACLE-R346-S05 | Tate & Lyle Sugars, [Black Cane Invert Syrup Easy Flow product specification](https://classicfinefoods.co.uk/uploads/specifications/TAT005.pdf) | Manufacturer-authored specification dated 2022; identifies alternative names Lyle’s Black Treacle Easy Flow and Squeezy Treacle, describes the product as a black cane invert commonly described as molasses, and lists alternative ingredient declarations. Hosted by Classic Fine Foods; specific to this Easy Flow product/formula, not the tin or the whole product category. |
| WP02-C-TREACLE-R346-S06 | The Great British Shop, [Lyle’s Black Treacle, 454 g](https://www.thegreatbritishshop.ca/collections/new-arrivals/products/lyles-black-treacle-454g) | Canadian specialty retailer listing for an imported 454 g tin, with current Canada shipping/availability wording and the bilingual listing ingredient Cane molasses / Mélasse de canne. Retailer evidence, not an official Canadian standard or manufacturer French label. |
| WP02-C-TREACLE-R346-S07 | Canadian Forces Morale and Welfare Services, [French gingerbread-house handout](https://cfmws.ca/getmedia/5ea62da8-be02-4715-b663-276968379620/L-L-Maison-en-pain-d-epice-9-1-1.pdf) | French explanatory note uses mélasse noire and sirop de mélasse noire for black treacle. Canadian French usage evidence; the document does not settle the OQLF grade conflict or support a global alias. |
| WP02-C-TREACLE-R346-S08 | Crosby Foods, [Our Molasses](https://www.crosbys.com/product/) | Producer presents fancy, blackstrap, and cooking molasses as separate products and describes its own cooking product as a blend of fancy and blackstrap. Brand-specific evidence; not a treacle definition or cross-brand substitution basis. |

## Implementation notes for coordinator

- Keep the active catalog rows and aliases unchanged in this round.
- Keep legacy ingredient-ref-molasses unresolved; retain the existing no-global-treacle disposition in its ledger record.
- Do not link or edit any bundled recipe.
- Record no density, unit mapping, conversion, form, package yield, or substitution.
- Reopen only when a source recipe or user-library item explicitly requires treacle/black treacle, or when the search schema can preserve the necessary market qualifier. At that point, verify the exact product and choose a fr-CA display that does not steal mélasse verte, the ambiguous mélasse noire, or the golden-syrup terms.

## Integration

Integrated by the root coordinator in [`wp02-section-c-treacle-picker-hold-integration-r346-20261016`](../batches/wp02-section-c-treacle-picker-hold-integration-r346-20261016/README.md). The hold leaves active references, the research ledger, recipe links, measures, and substitutions unchanged. The Section C plan now records this treacle boundary as complete while the broader sweetener/molasses item remains open.
