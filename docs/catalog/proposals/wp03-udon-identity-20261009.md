# WP03 Section G udon noodles identity proposal

- **Reviewed:** 2026-10-09
- **Status:** integrated on 2026-10-09; broader Section F/G review remains open
- **Owner:** WP03 identity research for one Japanese noodle identity
- **Scope owned:** plain udon noodles as one ingredient identity, with conservative bilingual labels and aliases.
- **Deferred:** somen, hiyamugi, hiramen/kishimen as separately searchable products or forms, ramen, soba, generic wheat noodles, rice noodles and rice sticks, glass noodles by starch, egg noodles, shirataki/konjac noodles, yakisoba, instant udon products, prepared udon dishes, and all other Section F/G candidates. Fresh, boiled, frozen, dried, and hand-stretched udon states are documented as product states but no form, density, unit mapping, yield, or state conversion is proposed in this packet. This packet leaves the broader Section F/G plan open.
- **Repository snapshot:** rechecked the canonical package at 409 ingredient references, 16 forms, 574 ledger records, and 114 bundled recipe JSON files. The Section G plan still lists udon as open. The 2026-10-08 workflow entry records soba as integrated; soba, ramen, and generic pasta remain distinct current references. No udon reference, form, ledger record, legacy-import identity, or earlier udon-specific proposal exists. The older grain/pasta proposal explicitly deferred udon. The recipe corpus has 1,123 ingredient rows.
- **Proposal work performed:** research and audits only. The integration review below records the later coordinator changes and validation.

## Candidate decision

Recommend adding one ingredient identity after acceptance review:

| Proposed ID | English display | fr-CA display | English aliases | fr-CA aliases | Category |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-udon-noodles` | `udon noodles` | `nouilles udon` | `udon` | `udon` | `GRAIN_AND_CEREAL` |

MAFF uses the English product name `Udon noodles` and describes udon as noodles made by adding salt water to flour. The Québec Office québécois de la langue française (OQLF) entry for `nouilles de blé` says Japanese wheat noodles, sometimes made with maize, are grouped by calibre as thin `somen` or thick `udon`. The OQLF entry does not list `udon` as a preferred French term, so the proposed fr-CA label is supported by observed Québec usage rather than an OQLF recommendation: Québec.ca uses `udon` in French, and Aliments du Québec lists a local product titled `Nouilles Udon fraîches` in `Pâtes alimentaires`. Lowercase `nouilles udon` follows the Québec government usage in running text.

Use `GRAIN_AND_CEREAL`, consistent with current pasta, soba, and ramen rows. The category is reinforced by MAFF’s grain-products classification; it does not assert that every udon product has an identical flour composition. Do not encode a 100% wheat, egg-free, gluten-free, or fixed-size claim. OQLF notes that Japanese wheat noodle groupings can also include maize; MAFF describes flour and salt water and reports variation in ratios, shape, width, thickness, and diameter.

Keep `udon` as the only alias in each locale. Do not activate `thick wheat noodles`, `wheat noodles`, `nouilles de blé`, `somen`, `hiyamugi`, `hiramen`, `kishimen`, `ramen`, `soba`, unqualified `noodles`/`nouilles`, `pasta`/`pâtes alimentaires`, `instant udon`, or dish names. The generic wheat-noodle phrase is broader than udon; Japanese size classes and related styles need their own evidence and should not be collapsed into an alias. MAFF discusses kishimen as a regional flat noodle style and classifies dried hiyamugi, somen, and hiramen separately from dried udon under its cited Japanese standards.

## Measurement and form evidence

- **Density and volume conversion:** searched the official MAFF and MEXT sources, the Québec product listing, and the Québec recipe source below. No supported udon bulk density or mass-per-volume conversion was found. Recommend `measurementState: researched_no_supported_value`; keep `defaultDensity` null and `unitMappings` empty.
- **Food-composition data:** MEXT’s 2023-supplemented food composition record 01039 is boiled udon and reports nutrients per 100 g edible portion. The food list separately enumerates fresh udon, boiled udon, semi-dried udon, dried udon, and boiled dried udon; it lists somen/hiyamugi and Chinese-style noodles separately. These records support product-state distinctions and composition context, but a per-100-g nutrient basis is not a household volume measure or bulk density.
- **Size standards:** MAFF gives Japanese standards for dried udon as diameter at least 1.7 mm, dried hiyamugi as 1.3 mm to less than 1.7 mm, and dried somen as less than 1.3 mm. These are product-classification dimensions for the named dried products, not a mass/volume measure and not a universal size rule for fresh or cooked udon.
- **Recipe quantity:** Le Dindon du Québec uses 500 mL (2 cups) cooked udon for six servings. This is one recipe quantity with no matching mass value; it cannot establish density or an app conversion. Aliments du Québec lists one local fresh product in a 300 g package, which is package size, not a volume equivalence or cooking yield.
- **Forms:** MAFF describes fresh, boiled, frozen, dried, and hand-stretched product states. Because no bundled recipe needs state-specific handling, propose the identity only and leave form IDs, cooked yields, and dry-to-cooked conversions open for later evidence and use.

## Substitution findings

Le Dindon du Québec’s teriyaki recipe note says udon may be replaced, if needed, by `pâtes de forme allongée`. This is one recipe-context suggestion for a turkey teriyaki stir-fry, credited on the page to the Éleveurs de dindon de l’Ontario. It does not identify one precise pasta shape or form, give a substitute amount, or specify cooking adjustments. The catalog has generic pasta, but no corresponding long-form pasta identity/form that lets the note map to a precise target.

Record the source as a contextual research finding only; add no active substitution rule. Recommend `substitutionResearchState: blocked_pending_evidence` because the source gives a broad target and no actionable amount or preparation adjustments. This state preserves the observed recipe suggestion without treating it as a general udon-to-pasta rule. No evidence found here supports replacing udon with soba, somen, ramen, rice noodles, or starch noodles, and none should be inferred from a shared grain or category.

## Exact-key and recipe audits

### Normalized-key collision audit

Audited current reference and form labels with the application’s `normalizeIngredientSearchKey` rules: lowercase, Unicode NFKD, ligature and accent folding, punctuation-to-space, and whitespace collapse. The candidate labels and aliases produce three distinct keys:

| Candidate term | Normalized key | Current owners among 409 references and 16 forms |
| --- | --- | --- |
| `udon noodles` | `udon noodles` | none |
| `nouilles udon` | `nouilles udon` | none |
| `udon` | `udon` | none |

The current exact key `soba` belongs to `ingredient-ref-soba-noodles`; `ramen` belongs to `ingredient-ref-ramen-noodles`; `pasta` belongs to `ingredient-ref-pasta`. `somen`, `wheat noodles`, `nouilles de blé`, `noodles`, and `nouilles` are unassigned. The proposed ID is absent from the seed, forms, ledger, and `docs/catalog/legacy-import-identities.v1.json`. The only earlier packet mention is a deferral, not an accepted identity. No proposed term collides with another proposed term or existing reference/form search key.

### Bundled recipe audit

Scanned all 114 bundled recipe JSON files and all 1,123 `ingredients[]` rows across `originalText`, `ingredientName`, and `ingredientRefId`. The candidate and near-neighbor search (`udon`, `うどん`, `somen`, `sōmen`, `nouilles de blé`, `wheat noodles`) found zero ingredient-line matches; a broader `noodle`/`nouille` scan also found zero ingredient-line matches. The target terms were absent from the recipe JSON corpus. No recipe relinks, form-specific ingredient references, or package-yield entry are proposed.

## Recommended evidence states

- Identity: propose `ingredient-ref-udon-noodles` with `identityState: verified` after the coordinator’s acceptance and Québec terminology review. The product identity is supported by MAFF; local French usage is supported, though OQLF does not list `nouilles udon` as a preferred term.
- Measurement: `researched_no_supported_value`. Store no density, volume mapping, portion weight, or yield from the evidence reviewed here.
- Substitution: `blocked_pending_evidence`. Retain the one recipe-scoped long-pasta suggestion as a research finding only; activate no runtime rule.

## Sources and source-to-claim map

All listed web sources were accessed 2026-10-09. Source IDs WP03-S206–WP03-S214 are proposal references only and have not been added to the shared ledger.

- **WP03-S206 — OQLF, [nouilles de blé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18699784/nouilles-de-ble)** (last updated 1997): places the term in food/pasta, distinguishes ingredient-grouped Asian noodles, and says Japanese wheat or sometimes maize noodles are grouped by calibre as thin somen or thick udon. It supports the broad family boundary and the distinction from generic wheat noodles; it does not make `udon` a preferred French label.
- **WP03-S207 — Japan MAFF, [Grain products — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kokurui.html)** (page publication date not shown): uses the English label `Udon noodles`; describes salt water and flour, product variation, fresh/boiled/frozen/dried/hand-stretched states, and Japanese dried-noodle size classes. It also separately describes buckwheat soba and lists kishimen, hiyamugi, and somen as differentiated styles/classes. Supports the identity, category, and boundaries; does not support a universal formulation or kitchen conversion.
- **WP03-S208 — Gouvernement du Québec, [Accueillir le touriste japonais](https://www.quebec.ca/tourisme-loisirs-sport/services-industrie-touristique/etudes-statistiques/marches-touristiques/le-marche-touristique-en-asie/marche-touristique-japon/accueillir-le-touriste-japonais)** (last updated 2026-05-21): in French, lists `soba, udon ou rāmen` as noodle choices. Supports established Québec-government French use of `udon`; it is not a terminology definition.
- **WP03-S209 — Aliments du Québec, [Nouilles Udon fraîches](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/nouilles-udon-fraiches)** (listing has no publication date shown; site copyright 2026): exact local French product wording, `Pâtes alimentaires` classification, and 300 g retail format. Supports label usage/category context only; it describes one fresh product and supplies no general composition, density, or yield.
- **WP03-S210 — OQLF, [nouilles de sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17037421/nouilles-de-sarrasin)** (last updated 1997): gives `soba noodles` as the English term and defines the Japanese product as buckwheat noodles. Supports keeping the existing soba row separate; its broader preferred phrases are not udon aliases.
- **WP03-S211 — OQLF, [nouilles ramen](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529875/nouilles-ramen)** (last updated 2014): defines ramen as fine quick-cooking egg noodles, says they are made from wheat flour, and gives the English terms `ramen` and `ramen noodles`. Supports the separate ramen boundary.
- **WP03-S212 — Japan MEXT, [Food Composition Database, boiled udon, item 01039](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=1_01039_7&MODE=7)** (Japanese Food Composition Standard, 8th edition, supplement 2023): identifies boiled udon and reports nutrients per 100 g edible portion. Supports one cooked food-state record, not density or volume conversion.
- **WP03-S213 — Japan MEXT, [2020 Food Composition Standard food list](https://www.mext.go.jp/content/20201225-mxt_kagsei-mext_01110_001.pdf)** (2020 edition; accessed 2026-10-09): lists distinct fresh, boiled, semi-dried, dried, and boiled-dried udon items, with somen/hiyamugi and Chinese-style noodles in separate food entries. Supports state and neighboring-product distinctions only.
- **WP03-S214 — Le Dindon du Québec, [Dindon teriyaki avec nouilles udon](https://ledindon.qc.ca/recettes/dindon-teriyaki-avec-nouilles-udon/)** (publication date not shown; page credits the Éleveurs de dindon de l’Ontario): uses 500 mL (2 cups) cooked udon for six and says long-form pasta may replace it if needed. Supports that recipe’s volume amount and narrow substitution note only; provides no gram conversion, target shape, amount adjustment, or general substitution rule.

## Recommended acceptance checks

- [x] Accept one identity, `udon noodles / nouilles udon`, with only bilingual `udon` aliases and category `GRAIN_AND_CEREAL`.
- [x] Keep the identity separate from soba, somen, ramen, generic wheat noodles, generic pasta, and starch-defined noodle products.
- [x] Leave all densities, unit mappings, portion-weight observations, forms, conversions, and yields empty.
- [x] Preserve the Le Dindon page as a one-recipe contextual substitution finding; activate no generic or contextual rule because the target and amount are underspecified.
- [x] Repeat the normalized-key and all-recipe ingredient-line audits against the merge-time canonical package; keep all remaining Section F/G candidates open.

## Coordinator integration result

Accepted as `ingredient-ref-udon-noodles`, with displays `udon noodles / nouilles udon`, bilingual `udon` aliases, and category `GRAIN_AND_CEREAL`. Added one accepted ledger record using sources WP03-S206–WP03-S214. The Le Dindon recipe's 500 mL (2 cups) cooked amount for six remains source-specific; the suggested long-form pasta replacement is stored as a blocked contextual finding because no exact shape, replacement amount, or method adjustments are given. No forms, densities, unit mappings, yields, or runtime substitution rules were added. The normalized-key and 114-recipe ingredient-line audits remained clear at merge time. Final package, unit-test, instrumentation, and live-picker results are recorded in [`../batches/wp03-udon-identity.md`](../batches/wp03-udon-identity.md).
