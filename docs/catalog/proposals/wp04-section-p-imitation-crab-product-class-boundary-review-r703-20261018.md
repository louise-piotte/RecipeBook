# WP04 Section P — imitation-crab product-class boundary review (R703)

- **Review and online source-access date:** 2026-10-18.
- **Open checklist:** Section P, “Fish powder, fish balls, and surimi”; the checklist remains open ([plan, line 8308](../../RecipeBook-global-ingredient-catalog-plan.txt#L8326)).
- **Scope:** The unqualified finished-food class `imitation crab / similicrabe`, including its consumer search wording, not any one species, recipe, shape, or branded product.
- **Recommendation:** Add one identity-only `PROTEIN` reference for `imitation crab / similicrabe`, using only the bilingual terms supported below. This class has a stable Québec terminology pair and current Canadian retail usage. Keep raw surimi, actual crab meat, crab-flavoured pollock flakes, surimi sticks, and other formed or imitation seafood products separate.
- **Status:** Proposal only. Do not reserve an ID or modify shared JSON, the plan, workflow, roadmap, or generated catalog. No form, amount, mapping, density, yield, recipe link, or substitution is proposed.
- **Source labels:** Existing live-ledger source IDs are marked as reused. New `R703` source labels below are proposal-local and unallocated.

## Decision and product boundary

OQLF’s GDT defines `similicrabe` as a surimi-based food that imitates crab meat and pairs the French term with English `imitation crab`. Its English equivalents include `imitation crab meat`; it also gives `simili-chair de crabe` as a French term. OQLF’s spelling guidance records `simili-crabe` as a variant of `similicrabe`. CFIA’s fish-labelling guidance separately identifies imitation crab as a finished-product example: surimi paste is an input, and a finished product imitating more valuable seafood must clearly show its imitation nature. Together, these primary terminology and labeling sources support a distinct finished-food class without making surimi paste an alias or form of it. [S01–S03]

Current Canadian retail wording confirms the class is recognizable in consumer channels: Metro lists an English product titled `Imitation crab flakes`, while a Québec Provigo seafood listing names `Surimi imitation crabe en flocons`. These are SKU-specific flake products and do not establish one formula, fish species, or package yield. A Canadian manufacturer also sells `surimi crab` as leg- and flake-style finished foods, separately from fish balls and kamaboko products. [S04–S06]

| Term or product | Boundary and disposition |
|---|---|
| `imitation crab / similicrabe` | Finished product class that imitates crab. Add one identity-only row with `imitation crab` (EN) and `similicrabe` (FR) as displays. Proposed search aliases: EN `imitation crab meat`; FR `imitation crabe`, `simili-chair de crabe`, and `simili-crabe`. These names are supported by OQLF and current Québec retail wording. [S01, S03, S05] |
| Actual `crab meat / chair de crabe` | Keep the active `ingredient-ref-crab` and its existing crab-meat forms. Imitation wording must not be added to this row, and the new row must not imply crab meat content. |
| Raw or unqualified `surimi` | Keep `candidate-surimi-product-boundary` unresolved. OQLF defines the technical paste sense, while Québec retail and Canadian manufacturer sources also use `surimi` in names for finished foods. Do not add `surimi`, `surimi paste`, or `pâte de surimi` as aliases of imitation crab. [S01, S04–S07] |
| `crab-flavoured pollock flakes / goberge en flocons à saveur de crabe` | Keep the active `ingredient-ref-crab-flavoured-pollock-flakes` as a separately named prepared product. Its Metro SKU wording and product-specific evidence do not make every crab-flavoured pollock product an alias, form, or synonym of the generic imitation-crab class. |
| Surimi sticks / crab sticks | Keep the product-specific stick review and hold in R387. Do not add `crab sticks`, `surimi sticks`, `surimi crab sticks`, or `bâtonnets de surimi` as aliases or create a shape form here. The held Montréal retail product has its own paired label, `Bâtonnets de surimi au crabe / Crab Flavoured Surimi Sticks`; it does not allocate a general identity. [prior R387] |
| Fish balls, fish tofu, chikuwa, kamaboko, and fish cakes | Preserve each existing identity or hold. A shared fish-paste base or seafood aisle does not make these products crab imitation. R530 and R171 address kamaboko and generic fish cake as separate boundaries. |
| Other imitation seafood / `simili-fruits de mer` | Keep this broader family term out of the aliases. A crab-specific class must not become a general imitation-shellfish or imitation-seafood row. |

The generic class is intentionally shape-neutral. Canadian manufacturers and retailers show flakes and leg-style products, but those product shapes and storage states vary by SKU. This review does not decide whether any such SKU is a form of the broad class, nor does it attach frozen, refrigerated, cooked, ready-to-eat, or raw states. [S04, S06]

## Current ownership and archive check

The live package has **1,839 references** and **173 forms**; the legacy-import file has **56 candidates** and the research ledger has **2,221 records**. The current active identities relevant to the boundary are:

| Surface | Current owner or state | Decision here |
|---|---|---|
| Actual crab meat | `ingredient-ref-crab` (`crab meat / chair de crabe`, `PROTEIN`), with crab-meat forms including Jumbo Lump. | Keep separate; do not transfer crab-meat wording to the new display. |
| Crab-flavoured pollock flakes | `ingredient-ref-crab-flavoured-pollock-flakes` (`crab-flavoured pollock flakes / goberge en flocons à saveur de crabe`, `PROTEIN`). | Keep the exact product name and aliases unchanged. |
| Fish balls, fish tofu, chikuwa | Active `ingredient-ref-fish-balls`, `ingredient-ref-fish-tofu`, and `ingredient-ref-chikuwa`. | Keep distinct. |
| Generic surimi | Ledger-only `candidate-surimi-product-boundary`, `needs_clarification`. | Do not resolve it through this finished-product review. |
| Exact generic imitation-crab names | No active reference, form, or legacy candidate owns `imitation crab`, `imitation crab meat`, `imitation crabe`, `similicrabe`, `simili-chair de crabe`, or `simili-crabe`. | One identity-only reference would fill the exact-name gap. |
| Focused review history | R189 covers generic surimi; R387 covers one surimi-stick product; R29 covers the active pollock-flake SKU; R171 covers generic fish cakes; R530 covers the kamaboko family. Those reviews mention imitation crab as a neighbor or exclusion, but none allocates or holds this generic finished class. | Keep those prior boundaries intact; this packet decides only the generic class. |

The ledger’s OQLF `similicrabe` source is already cited by the actual-crab and pollock-flake records as evidence that imitation crab is separate. Those mentions are not dedicated ownership of the imitation-crab identity. Reuse the existing OQLF and CFIA source records rather than adding duplicate shared ledger records. [S01, S02]

## Picker collision audit

`IngredientSearch.kt` normalizes case, accents, ligatures, punctuation, and spaces; it returns complete phrase matches across reference names, aliases, and attached form terms before falling back to partial matches. The current catalog was projected with a proposal-only row using the display and alias wording above; no shared file was changed.

| Query | Current result | Projected result and effect |
|---|---|---|
| `imitation crab`, `imitation crab meat` | No result. | One `imitation crab / similicrabe` result. |
| `similicrabe`, `simili-crabe`, `simili-chair de crabe`, `imitation crabe` | No result. | One `imitation crab / similicrabe` result. |
| `crab meat`, `chair de crabe` | `ingredient-ref-crab` only. | Both actual crab meat and imitation crab. The source-attested full aliases intentionally expose the distinction; they do not relabel the actual-crab row. |
| `crab`, `crabe` | 12 active crab-related results. | 13, adding the distinct imitation-crab choice. |
| `surimi`, `surimi paste` | No result; generic candidate is ledger-only. | Still no result. No surimi wording is proposed as an alias. |
| `crab-flavoured pollock flakes`, `goberge en flocons à saveur de crabe` | `ingredient-ref-crab-flavoured-pollock-flakes` only. | Same exact active result. |
| `fish balls`, `boulette de poisson`; `fish tofu`, `tofu au poisson`; `chikuwa` | Their respective active references. | Unchanged. |
| `kamaboko`, `crab sticks`, `bâtonnets de surimi` | No active result. | Still no result. The kamaboko and stick decisions remain separate. |

The alias collisions for `crab meat` and `chair de crabe` are visible, not silent: the result labels remain `crab meat` and `imitation crab`. Excluding the supported `imitation crab meat` and `simili-chair de crabe` aliases would hide useful full product names; these search keys should present both choices rather than merge the foods. The exact `jumbo lump crab meat` form phrase remains owned by `ingredient-ref-crab` because the proposed row does not use that grade wording.

## Bundled recipe demand and numeric evidence

The manifest-listed recipe scan covered **114 recipes** and **1,123 ingredient rows**. It found no ingredient line requesting imitation crab, similicrabe, simili-chair de crabe, simili-crabe, crab sticks, surimi sticks, or the related finished-product names. The one adjacent crab line is recipe **019**, `1 lb jumbo lump crab meat`, linked to actual crab meat and its Jumbo Lump form; it is not imitation-crab demand. No recipe link or recipe-line inference is proposed.

Retail package weights and manufacturer pack details are product-specific. They are not household amounts, piece counts, a generic mass-to-volume mapping, or a preparation yield. The reviewed sources do not support a default density, unit mapping, conversion, yield, or directed substitution from imitation crab to actual crab, pollock, raw surimi, fish balls, fish tofu, kamaboko, fish cakes, or any other seafood. Add none.

## Integration shape if accepted

Add a single identity-only `PROTEIN` reference with:

- **English display:** `imitation crab`
- **French display:** `similicrabe`
- **English alias:** `imitation crab meat`
- **French aliases:** `imitation crabe`, `simili-chair de crabe`, `simili-crabe`
- **Other fields:** no ID assigned by this proposal; null density; no unit mappings, forms, recipe links, package yields, conversions, or substitution rules.

Do not alias the row to `surimi`, `surimi paste`, `crab sticks`, `crab-flavoured pollock flakes`, actual crab meat, fish balls, fish tofu, chikuwa, kamaboko, generic fish cake, or `simili-fruits de mer`. No new ledger candidate or shared source allocation is needed for this proposal-only review.

## Source register

The OQLF GDT, CFIA, and Ocean Food Fresh Sea Market source IDs below already exist in the live ledger and are reused. The Arctic Sea Market source is reused from the R38 proposal archive. R703-local labels S03–S05 were checked against the research-ledger source IDs/URLs and the proposal/archive search; they are citations in this file only and are not shared-data allocations.

| Source ID | Source | Evidence used and limits |
|---|---|---|
| **WP04-CRAB-MEAT-20261011-S03** *(reused from live ledger)* | OQLF, [similicrabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199054/similicrabe). | Defines a surimi-based food imitating crab meat and gives the French and English terminology, including `similicrabe`, `simili-chair de crabe`, `imitation crab`, and `imitation crab meat`. The entry was last updated in 1998; it establishes terminology and product boundary, not current retail availability or a formulation for a particular SKU. |
| **WP04-FBSUR-20261011-S13** *(reused from live ledger)* | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). | Current federal labelling guidance distinguishes surimi paste from named finished products and says products imitating more expensive seafood must be clearly identified as imitations. This is a labeling boundary, not a recipe ingredient or retail formula. |
| **WP04-SECTIONP-IMITATION-CRAB-R703-20261018-S03** *(proposal-local)* | OQLF, [Trait d’union ou soudure avec l’élément *simili-*](https://vitrinelinguistique.oqlf.gouv.qc.ca/23185/lorthographe/emploi-du-trait-dunion/mots-composes/mots-composes-avec-prefixe-ou-element-grec-ou-latin/trait-dunion-ou-soudure-avec-lelement-simili8209). | Gives `similicrabe` and the variant spelling `simili-crabe`. This is spelling guidance; the GDT remains the source for the product definition and bilingual term pair. |
| **WP04-SECTIONP-IMITATION-CRAB-R703-20261018-S04** *(proposal-local)* | Metro, [Imitation crab flakes](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/prepared-fish-seafood/spreads-mousse-caviar/imitation-crab-flakes/p/219316). | Current English-facing Québec retailer product title uses `imitation crab`. The SKU is flake-style; its product title does not establish a universal formula, French display, or package yield. Availability is location-specific. |
| **WP04-SECTIONP-IMITATION-CRAB-R703-20261018-S05** *(proposal-local)* | Provigo, [Québec seafood category listing](https://www.provigo.ca/fr/alimentation/poissons-et-fruits-de-mer/poisson/c/28191?page=1). | The retailer listing uses `Captain Jac Surimi imitation crabe en flocons` for a specific item. This confirms current French retail wording, not a standard formulation, common-name ruling, or package yield. |
| **WP04-FBSUR-20261011-S06** *(reused from live ledger)* | Ocean Food Company, [Fresh Sea Market](https://www.oceanfoodcompany.com/fresh-sea-market). | Canadian manufacturer describes its `surimi crab` products in leg and flake styles and separates those finished foods from other lines. Product details apply to the manufacturer’s products and are not generalized to all imitation crab. |
| **WP04-SECTIONP-NARUTO-MAKI-20261013-R38-S04** *(reused from proposal archive)* | Ocean Food Company, [Arctic Sea Market Oden](https://www.oceanfoodcompany.com/arctic-sea-market). | The manufacturer's product listing includes precooked/frozen crab flakes alongside distinct Naruto maki, fish balls, and fish cakes. This supports adjacent-product boundaries and SKU variation; it does not assign a generic frozen form or support substitution. |

**Recommendation:** Integrate only the identity-only `imitation crab / similicrabe` class if accepted. Keep the Section P checklist and all adjacent product decisions otherwise unchanged; revisit forms, amounts, yields, and substitutions only with exact recipe or product evidence.
