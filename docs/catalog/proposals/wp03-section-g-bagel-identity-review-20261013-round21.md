# WP03 Section G — Bagel identity review

**Reviewed:** 2026-10-13  
**Status:** Integrated on 2026-10-13 as an identity-only reference and source-specific package observation. See the R21 integration batch README.  
**Scope:** Plain bagels as a prepared bread identity, including the Québec French name, picker ownership, exact recipe demand, product-specific package evidence, forms, and substitutions.

## Recommendation

Add one identity-only prepared-bread reference if the coordinator accepts this proposal:

| Field | Proposed value |
|---|---|
| ID | ingredient-ref-bagel |
| Category | BAKING_MIXIN_AND_PANTRY, following the live bread-roll, English-muffin, sandwich-bread, sourdough-bread, pita, and lavash identities |
| English display | bagel |
| English aliases | bagels; beigel |
| fr-CA display | bagel |
| fr-CA alias | baguel |

The OQLF lists both baguel and bagel as preferred French terms, and explicitly says the spelling bagel is accepted and widespread. Current Montréal maker and Québec product-directory pages consistently use bagel/bagels in French. Using bagel as the fr-CA display follows that current product usage; retaining baguel as a search alias covers the OQLF’s adapted form.

Keep this identity distinct from generic bread rolls, English muffins, sandwich bread, sourdough bread, brioche, named flatbreads, matzo, pretzels, and bagel chips. Do not alias petit pain, pain, roll, bun, everything bagel, bagel chips, or croustilles de bagel. A bagel topping or flavor is not a synonym for plain bagel, and the Fairmount product list separately names pretzels, matzo, and bagel chips.

Add no forms, density, unit mappings, package yield, recipe links, conversions, or substitutions. Record the Québec directory’s 6-bagel / 410 g listing only as a source-specific package observation if that evidence is later entered in the research ledger; it does not establish a general per-bagel mass. Do not calculate 410/6 or reuse this product package for other bagels.

## Why this is a distinct open gap

The current Section G checklist still leaves regional prepared breads open. Bagels are not an active identity or a named candidate in the prior Section G proposals reviewed for this pass. The previous bread-roll proposal mentions bagels only as an example in a flour product page and as an incidental path component in a Montréal bakery URL; neither packet assigned a bagel identity or reviewed its French display and picker behavior.

Bagels fit the prepared-bread portion of Section G. OQLF defines the product under baking and pastry, and current Montréal bakeries sell multiple named bagel varieties. The proposed identity resolves this common bread product without creating one identity per topping, flavor, or regional style.

## Current package and exact ownership audit

Snapshot read on 2026-10-13.

| Artifact | Current state | SHA-256 or audit note |
|---|---:|---|
| Seed manifest | 114 recipe files | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Ordered recipe corpus | 1,123 ingredient rows; 753,792 raw recipe bytes | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |
| Ingredient references | 1,347 active references | 92afa0f16bdada79553b5037085a6eaeaab6949dc54a0e25ddec5d7c9994a41d |
| Ingredient forms | 98 forms | b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c |
| Legacy import candidates | 64 candidates | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| Research ledger | 1,660 records / 6,463 source entries / 5,412 distinct source IDs | 8a8406c75995d2c0cce50bd59b7e81f0752d1c9de29c6027e717b6bd19cf2c57 |
| Active substitution rules | 0 global / 0 contextual | Both files currently contain empty arrays. |
| Package yields | 1 entry, for S&W canned black beans | No bagel package yield exists. |

No active reference ID, form ID, reference name, alias, or form term owns ingredient-ref-bagel or the normalized phrases bagel, bagels, baguel, beigel, Montreal bagel, bagel chips, or croustilles de bagel. The proposed ID is absent from the 64 legacy candidates and the 1,660 ledger record IDs.

Adjacent active prepared-bread owners include:

- ingredient-ref-bread-roll — bread roll / petit pain; aliases bread rolls / petits pains.
- ingredient-ref-english-muffin — english muffin / muffins anglais.
- ingredient-ref-brioche-bread — brioche bread / pain brioche.
- ingredient-ref-sandwich-bread — sandwich bread / pain de mie; sandwich loaf / pain à sandwich.
- ingredient-ref-sourdough-bread — sourdough bread / pain au levain.
- ingredient-ref-pita-bread and ingredient-ref-lavash-bread — separate regional breads.

The bagel candidate does not duplicate these exact normalized keys. Do not transfer the OQLF definition’s descriptive phrase petit pain to the bagel alias list: that exact phrase already belongs to the generic bread-roll identity.

### Picker phrase behavior

IngredientReferenceSearchIndex normalizes case, accents, ligatures, punctuation, and spaces; it first matches a complete word phrase embedded in a stored term, then falls back to substring matching. Every active reference and form term was checked with this behavior. Before integration, each of bagel, bagels, baguel, beigel, Montreal bagel, bagel chips, and croustilles de bagel returns no reference or form. The same proposed names and aliases have no exact normalized-key owner in the legacy candidate file.

With the proposed terms:

1. bagel resolves to ingredient-ref-bagel through the display name.
2. bagels resolves to ingredient-ref-bagel through the plural alias.
3. baguel resolves to ingredient-ref-bagel through the fr-CA alias.
4. beigel resolves to ingredient-ref-bagel through the OQLF-listed English variant.
5. bagel chips and croustilles de bagel remain unmatched; do not let a broad bagel alias claim these separately marketed crisp products.
6. petit pain continues to resolve to ingredient-ref-bread-roll. No broad bread, pain, roll, or bun alias is added to bagel.

Do not add Montreal bagel or bagel de Montréal as aliases. They are regional-style descriptions, not shown by these sources as alternate generic names for every bagel.

The ledger has incidental bagel text but no bagel identity record: the high-gluten-flour record mentions bagels as a flour application, and a rye-meal source URL has a bread-bagels path segment. Neither is an active picker term or candidate identity. The proposed five source IDs and all five source URLs below are absent from the ledger; none collides with an existing source ID or URL.

## Recipe demand audit

All 114 manifest-listed recipe files and all 1,123 ingredient rows were checked. Exact phrase-boundary searches for bagel, bagels, baguel, baguels, beigel, beigels, bagel chips, croustilles de bagel, Montreal bagel, bagel de Montréal, and pain bagel returned:

- 0 matching ingredient rows;
- 0 matching recipe titles, descriptions, instructions, or notes;
- 0 recipe lines to relink.

Recipe 027 uses English muffins, cubed and toasted. That row remains linked to the existing english muffin identity and does not create bagel demand. The recipe corpus remains unchanged.

## Measurement, forms, and substitutions

- **Identity:** Evidence supports bagel as a prepared-bread identity.
- **Measurements:** One Aliments du Québec listing identifies a St-Viateur sesame product as six bagels in a 410 g format. This is product-specific package evidence, not a universal count conversion, per-piece mass, cup measure, or density. The listing gives no evidence for other bagel brands or varieties. Keep defaultDensity null and unitMappings empty.
- **Forms:** No forms are proposed. Sesame, poppy, everything, cinnamon-raisin, blueberry, whole-wheat, multigrain, sourdough, and miniature products appear as named variants or SKUs. Do not encode them as universal bagel forms without direct recipe demand and a form question that the current model can express. Toasted is a preparation instruction, not a bagel identity or a conversion form.
- **Substitutions:** Add no rule. The shape and process description does not establish a safe or recipe-tested replacement between bagels and bread rolls, English muffins, sandwich bread, sourdough bread, or any other bread. There is no bundled bagel ingredient line with a recipe-local alternative.

## Source register

All sources were accessed on 2026-10-13. IDs were checked against the current ledger; none is in use.

| ID | Source and claim supported | Limits |
|---|---|---|
| WP03-BAGEL-20261013-S01 | Office québécois de la langue française, [baguel (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26520190/baguel). Lists baguel and bagel as preferred French terms, says bagel is accepted and widespread, gives the English terms bagel and beigel, and defines the food as a ring-shaped leavened small bread that is poached before baking. | Terminology record last updated in 2013. It establishes the lexical class and accepted spellings, not the formula or preparation of every current retail product. |
| WP03-BAGEL-20261013-S02 | St-Viateur Bagel, [Comment ils sont faits](https://stviateurbagel.com/fr/pages/comment-on-les-fait). Current Montréal maker page describes hand-rolled bagels, simmered in honeyed water, topped with classic seeds, and baked in wood-fired ovens. | One maker’s Montréal process; do not apply its honey water, toppings, hand-rolling, or oven to every bagel. |
| WP03-BAGEL-20261013-S03 | St-Viateur Bagel, [Nos bagels](https://stviateurbagel.com/fr/collections/bagels). Current French product listing names sesame, poppy, tout garni, cinnamon and raisins, rosemary and sea salt, blueberry, whole-wheat, and plain bagels. | Current SKU list from one Montréal producer; flavor names and product compositions remain source-specific. |
| WP03-BAGEL-20261013-S04 | Fairmount Bagel, [Nos Bagels](https://fairmountbagel.com/events/?lang=fr). Current Montréal maker page lists multiple bagel products and has separate entries for New York-style pretzels, matzo, bagel crisps, and mini bagels. | One producer’s range; it supports product naming and separation only. It does not make these variants, crisp products, or pretzels aliases of generic bagel. |
| WP03-BAGEL-20261013-S05 | Aliments du Québec, [Bagel sésame](https://alimentsduquebec.com/aliments-dici/boulangerie-patisserie-et-desserts/bagel-sesame). Product entry names St-Viateur’s sesame bagels, lists six units and a 410 g available format, and shows Canadian/Québec retail channels. | A specific product-directory entry, not a full package label or per-piece test. Preserve the 6 / 410 g values only for this listed product; infer no general count weight. |

## Coordinator integration recommendation

Accept one identity-only reference as ingredient-ref-bagel in BAKING_MIXIN_AND_PANTRY, with the display names and aliases in the recommendation table. Keep bagel chips and pretzels unassigned to this identity; do not add recipe links, forms, measures, active conversions, package yields, or substitutions. The coordinator recorded the 6 / 410 g observation only for the listed St-Viateur product; no per-bagel mass or general conversion was inferred.

This proposal closes only the bagel identity gap. It does not complete the remaining Section G regional-bread or prepared-product checklist.

## Review record

- Sources and source-ID/URL collision checks cover the current 6,463 ledger source entries and 5,412 distinct source IDs.
- Exact ownership and picker behavior were checked against the current 1,347 references and 98 forms.
- The recipe audit used all 114 manifest files and 1,123 ingredient rows.
- No app tests, unit tests, instrumentation, or emulator checks were run because this is proposal-only work and no implementation changed.

