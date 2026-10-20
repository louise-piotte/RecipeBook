# WP02 A/B next flour gap: whole-rye wording and dark-rye boundary

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 after coordinator review. Added one Québec French search alias to the existing whole-rye reference; retained the evidence-based hold on unqualified dark rye flour. See [the integration record](../batches/wp02-whole-rye-alias-dark-rye-boundary-integration-20261012/README.md).
- **Scope:** A bounded Section A4 rye-flour follow-up, using current Canadian and Québec mill/product evidence to distinguish a source-attested whole-rye name variant from the open dark-grade boundary.
- **Source IDs:** `WP02-AB-DARK-RYE-GAP-20261012-S01` through `S09`. The prefix was absent from the research ledger before drafting; source S01 was added to the whole-rye ledger record during integration. S02–S09 remain proposal-local evidence for the dark-rye hold.
- **Explicit exclusions:** Light and medium rye flour, whole rye flour identity, rye meal, and recent flour integrations are not proposed as new rows. The live catalog already includes light and medium rye flour; defatted coconut flour; white, red, and black quinoa flour; sprouted amaranth flour; and kodo, proso, and foxtail millet flour. The wider A/B checklist remains open.

## Recommendation

**Accept one French alias on the existing whole-rye-flour reference:** add `farine de seigle entière` to `ingredient-ref-whole-rye-flour` (`whole rye flour / farine entière de seigle`). A Québec mill uses that exact phrase as its current product title for its Québec-grown rye flour. The active reference already has English alias `complete rye flour`; no new English alias is needed. [S01]

**Keep generic dark rye flour on hold.** Do not create `ingredient-ref-dark-rye-flour`, and do not add `dark rye flour`, `dark rye`, `farine de seigle foncée`, or the Charlevoix phrase `farine de seigle foncée biologique` as aliases to generic rye flour, whole rye flour, medium rye flour, or rye meal. Current Québec labels establish the French wording for particular products, but do not establish one shared milling scope. Ontario mill Brant defines its own dark product as fine, 100% whole flour; Moulin de Charlevoix uses `dark complete rye flour` for its bilingual product; Mayrand's current R.Fortin listing supplies the French name without a process definition; and Ardent Mills describes dark rye as higher in bran than white while separately describing its pumpernickel rye meal as whole rye flour. These sources do not support a market-wide dark-grade threshold or safe cross-alias. [S02–S06]

| Phrase or product | Disposition | Boundary |
|---|---|---|
| `farine de seigle entière` | **Add as a French alias** to `ingredient-ref-whole-rye-flour`. | Exact Québec mill product title for whole rye flour; a word-order variant of the existing `farine entière de seigle` display. This is a search-name decision, not a claim about every supplier’s grade system. [S01] |
| `dark rye flour`, `dark rye`, `farine de seigle foncée` | **Hold.** | Current product names describe products whose milling scope is not established consistently across sources. Keep exact source labels documentary. [S02–S09] |
| `farine de seigle foncée biologique` / `organic dark complete rye flour` | Keep as the bilingual product wording of Moulin de Charlevoix’s SKU SGB20; do not activate as aliases. | One maker’s paired product name does not establish that unqualified dark rye is whole grain across suppliers. [S03–S04] |
| `light rye flour`, `medium rye flour`, `whole rye flour`, `rye meal` | Retain current identities and aliases. | The live catalog and recent integration records already distinguish these rows. No grade or meal relationship changes are proposed. |

The French alias is supported by the Québec producer's exact page title, but the evidence does not show that it is a preferred OQLF term or a universal French rye-flour convention. The dark-rye hold is an evidence-based boundary decision: an exact retail name exists, but a global catalog match would erase product-scope variation. [S01–S09]

## Existing catalog and ledger boundary

The relevant live references are:

| Active ID | Current display and aliases | This proposal |
|---|---|---|
| `ingredient-ref-rye-flour` | `rye flour / farine de seigle`; no aliases | Keep generic; do not attach dark or whole-grain qualifiers. |
| `ingredient-ref-light-rye-flour` | `light rye flour / farine de seigle claire`; EN `white rye flour`; FR `farine de seigle blanche`, `farine de seigle légère` | Retain as integrated. |
| `ingredient-ref-medium-rye-flour` | `medium rye flour / farine de seigle moyenne`; no aliases | Retain as integrated. |
| `ingredient-ref-whole-rye-flour` | `whole rye flour / farine entière de seigle`; EN `complete rye flour` | Add only FR alias `farine de seigle entière`. |
| `ingredient-ref-rye-meal` | `rye meal / gruau de seigle`; EN `coarse rye meal`, `pumpernickel meal`, `pumpernickel flour`; FR `semoule de seigle`, `farine à pumpernickel` | Keep meal/pumpernickel scope unchanged. |

The ledger already has accepted records for general, light, medium, and whole rye flour: `ingredient-ref-rye-flour`, `ingredient-ref-light-rye-flour`, `ingredient-ref-medium-rye-flour`, and `ingredient-ref-whole-rye-flour`. The general-rye decision keeps extraction grades out of its aliases, and the medium-rye decision explicitly keeps dark rye unresolved because supplier meanings vary. The prior whole-rye decision accepted `farine entière de seigle` and `complete rye flour`, while leaving other French product wording out of aliases. There is no separate dark-rye candidate or `ingredient-ref-dark-rye-flour` ledger record. This proposal uses new current product evidence for one exact French title; it creates no ledger record and does not change any existing decision. See [the rye-grade boundary review](wp02-medium-dark-rye-product-boundary-review-20261011.md), [the whole-rye review](wp02-next-flour-gap-review-20261011-whole-rye-flour.md), and [the medium-rye integration record](../batches/wp02-medium-rye-flour-integration-20261011/README.md).

## Live package, exact-key, and recipe audit

The read-only audit used the live split seed package, the research ledger, the legacy candidate file, and all manifest-listed recipe files in the shared worktree. Hashes cover exact file bytes. The recipe fingerprint hashes manifest-ordered relative paths, a NUL byte, exact file bytes, and a trailing NUL byte for each recipe.

| Surface | Current snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,214 | `ec8900828ccacca720b3b07d8ad288489b73a8c27b8124ed93c8f2e0ee75c11a` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Research ledger | 1,517 records; 5,119 source entries; 4,182 distinct source IDs | `86bcab482e41601317447cc44fbd39a715fafbdeb05a0034906589a946ca5c66` |
| Legacy import candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |

Exact-key matching case-folded and diacritic-folded text, replaced punctuation with spaces, and collapsed whitespace. Across active reference displays/aliases, form labels/match terms, and legacy names/aliases, exact owners are:

| Exact wording | Current owner |
|---|---|
| `whole rye flour`; `farine entière de seigle` | `ingredient-ref-whole-rye-flour` |
| `complete rye flour` | English alias of `ingredient-ref-whole-rye-flour` |
| `farine de seigle entière` | None; proposed French alias for `ingredient-ref-whole-rye-flour` |
| `dark rye flour`; `dark rye`; `farine de seigle foncée` and accent-folded spelling | None |
| `dark complete rye flour`; `organic dark complete rye flour`; `farine de seigle foncée biologique` | None |
| `ingredient-ref-dark-rye-flour` | No active reference, form, legacy candidate, or ledger record uses this ID. |

No form or legacy candidate owns any audited dark-rye phrase. The current whole-rye row does not own `farine de seigle entière`; the match is a distinct word order, not a normalized duplicate. The existing source entry for Moulin de Charlevoix's dark product is retained as documentary evidence in the prior review, not as an alias.

The audit scanned all 114 manifest-listed JSON files and all 1,123 ingredient rows for the exact candidate phrases, as well as whole-word `rye` and `seigle` mentions across serialized recipe content. It found **zero exact-name ingredient-line matches, zero rye/seigle ingredient-line matches, and zero full-recipe rye/seigle mentions**. No recipe link or recipe edit is supported.

## Data boundary and next steps

If accepted for integration, add only `farine de seigle entière` to `ingredient-ref-whole-rye-flour.aliasesFr`. Do not change the row's English alias, name, category, density, or unit mappings. Do not add forms, recipe links, household measures, conversions, yields, or substitutions. Do not create a dark-rye identity or move names among light, medium, whole, generic rye flour, and rye meal.

Keep the broader dark-rye candidate held until a Québec/Canadian standard or multiple product specifications establish a stable scope for the unqualified grade and a bilingual name that does not collapse whole-grain, partially sifted, or other products. If a future recipe names a specific dark rye product, review that source and its whole-grain/milling declaration before linking the line.

## Coordinator integration result

Added only French alias `farine de seigle entière` to `ingredient-ref-whole-rye-flour`, supported by the exact current Québec mill product title in S01. The existing English alias, display names, category, null density, and empty unit mappings remain unchanged. No dark-rye reference or alias was added; no recipe links, forms, measures, conversions, yields, or substitutions changed. The broad A/B checklist remains open.

The bundled database JSON change did not require tests or emulator checks under `AGENTS.md`. Static package validation, generated-catalog freshness, exact-key ownership, UTF-8/no-BOM, and scoped whitespace checks passed; see the integration record.

## Source register

All pages below were accessed on 2026-10-12. The full proposal-local source IDs are shown below; in-text citations such as `[S01]` use the corresponding short suffix. These IDs are not ledger entries and their prefix was checked for uniqueness against the current ledger.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-AB-DARK-RYE-GAP-20261012-S01** | Moulin Lacoste, [Farine de Seigle Entière](https://moulinlacoste.com/index.php/product/farine-de-seigle-entiere/). Current Québec mill product page titles its item `Farine de Seigle Entière`, identifies Québec-grown rye, and describes stone milling; the product details list T125. Supports the proposed French word-order alias on the existing whole-rye identity. | One producer's exact product title; T125, stone-milling, color, and other product details are not generalized. |
| **WP02-AB-DARK-RYE-GAP-20261012-S02** | Brant Flour Mills, [Milling Guide](https://www.brantflourmills.com/milling-guide), current rye-product listings. Defines its `DARK RYE FLOUR` as fine, 100% whole flour; separately names coarse `WHOLE RYE FLOUR #2` and partially sifted medium rye flour. | One Ontario mill's product definitions; does not establish a market-wide dark-rye standard. |
| **WP02-AB-DARK-RYE-GAP-20261012-S03** | Moulin de Charlevoix, [Des farines locales aux qualités uniques](https://www.moulin-charlevoix.net/farines-flour), current Québec product listing, SKU SGB20. Names `Farine de seigle foncée biologique` and describes its taste and bread use. | Local product-name evidence only; the page does not specify the grain fractions retained. |
| **WP02-AB-DARK-RYE-GAP-20261012-S04** | Moulin de Charlevoix, [2023 bilingual flour catalogue](https://mobicheckin-assets.s3.amazonaws.com/uploads/events/6626131d7b519fa07f4df032/person_files/brochure_2YKJH61_Charlevoix_-_D%C3%A9pliant_4_voletsSept23.pdf), p. 2. Pairs `Farine de seigle foncée bio` with `Organic Dark Complete Rye Flour`. | Same producer/product as S03; exact bilingual product wording, not an independent milling specification. |
| **WP02-AB-DARK-RYE-GAP-20261012-S05** | Mayrand, [Farine de seigle foncée 5 kg](https://mayrand.ca/fr/nos-produits/epicerie/farine-semoule-et-chapelure/farine-de-specialite/farine-de-seigle-foncee-13726), current R.Fortin item 13726. Confirms a current Québec retail listing with the exact French phrase and Québec-store availability. | Retail listing gives no milling or whole-grain specification; package size is not a kitchen measure. |
| **WP02-AB-DARK-RYE-GAP-20261012-S06** | Ardent Mills, [Rye Flour](https://www.ardentmills.com/products/alternative-grains/additional-gluten-free-flours-grains-seeds/rye/), current product-family page. Says medium and dark rye flours contain more bran than white rye; separately describes `Rye Meal Pumpernickel` as whole rye flour. | Supplier-specific qualitative taxonomy; it does not state whether its dark product is whole grain or give a transferable grade threshold. |
| **WP02-AB-DARK-RYE-GAP-20261012-S07** | OQLF, [farine de seigle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489069/farine-de-seigle), last updated 1982. Supports generic Québec `farine de seigle` / English `rye flour` and mentions lighter/darker rye flours. | Does not name dark rye as a separate preferred term or define its milling scope. |
| **WP02-AB-DARK-RYE-GAP-20261012-S08** | BC Cook Articulation Committee, [Understanding Ingredients for the Canadian Baker: Rye Flour](https://opentextbc.ca/ingredients/chapter/rye-flour/), 2015. Describes dark rye as comparable to first-clear wheat flour and gives values within its educational discussion. | Canadian baking education, not a current flour specification; values are not imported as standards or measurements. |
| **WP02-AB-DARK-RYE-GAP-20261012-S09** | Oldways Whole Grains Council, [Types of Rye](https://wholegrainscouncil.org/whole-grains-101/grain-month-calendar/rye-triticale-august-grains-month/types-rye). Summarizes supplier variation: dark rye may be whole grain, a sifted outer-endosperm/bran fraction, or mill-stream leftovers. | Secondary explanatory source, used only to corroborate the source-specific boundary; not a Québec authority. |
