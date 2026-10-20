# WP03 Section F: puffed rye product identity and Québec French naming review

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** The Québec French naming hold was recorded in the 2026-10-11 follow-up integration; no active reference was added. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).
- **Scope:** one specific candidate under the open Section F “remaining puffed-grain candidates” item: plain human-food puffed rye, its English product wording, Québec French naming evidence, boundaries, recipe demand, and form/numeric evidence.
- **Recommendation:** **hold integration**. Current manufacturer sources establish a human-food puffed-rye product and the English name `puffed rye`; the audited Québec evidence establishes `seigle` and the general class `céréales soufflées`, but does not establish a Québec French product name for rye in puffed form. Do not invent `seigle soufflé`, `grains de seigle soufflés`, or another French display or alias. Revisit if a Québec product label or authoritative Québec terminology source provides the exact scoped name.
- **Current package snapshot:** 904 ingredient references, 48 forms, 114 manifest-listed recipes with 1,123 ingredient rows, 1,156 research-ledger records with 8 unit-conversion records, 77 legacy candidates, 1 package-yield record, and no global or contextual substitution rules.
- **Fingerprints:** manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; references `ae957b92a8881a7a1d9bcdcdaf1666d4af6747aec66a2a40d579f1dc7775d207`; forms `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e`; ledger `4a2c27f13543fb7519478833605fae06088ecb859b5e5459052f40847c6b5f8f`; legacy candidates `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57`.

## Checklist scope and prior coverage

The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1667) leaves remaining puffed-grain candidates open. Puffed rice, wheat, quinoa, millet, amaranth, sorghum, buckwheat, spelt, and barley have active identities; the focused puffed-teff review remains on hold, and a puffed-oats review is already present. Searches of the active plan, roadmap, proposal directory, integration notes, catalog, ledger, legacy candidates, forms, and recipe package found no prior puffed-rye identity decision. This packet covers puffed rye only.

Puffed rye is distinct in scope from the active raw rye / `seigle`, rye berries / `grains de seigle`, rye flakes / `flocons de seigle`, rye flour, whole rye flour, rye meal, and malted rye flour references. The package already uses `rye kernels` as an English alias of rye berries; do not broaden that alias to puffed rye.

## Identity and naming disposition

Manufacturer and technical sources identify puffed rye as a real processed grain product for food use. They establish English product wording and baking/cereal applications, but none establishes a Québec French retail label. The following mapping keeps those evidence levels separate:

| Candidate field or term | Review disposition | Evidence boundary |
| --- | --- | --- |
| Candidate identity | Plain human-food rye grain in puffed form; if later accepted, treat as a separate processed-grain identity, not a form of raw rye or rye berries. | Manufacturer sources list puffed rye for food applications. They do not establish one universal process, cultivar, hull state, or end use. |
| English name | `puffed rye` is source-attested product wording. | Multiflour lists a product titled “Puffed rye”; CeralGran calls its material “puffed natural rye.” These are supplier names, not evidence for additional global synonyms. |
| Québec French base noun | `seigle` is the OQLF-preferred Québec French term paired with English `rye`; OQLF notes that it names the plant and its grain. | This supports the grain name only, not a processed-product compound. |
| Québec French product display | **Unassigned.** | CFIA French net-quantity guidance includes `céréales soufflées` as a general food category entry. Its separate `grains de céréales soufflés` definition is explicitly in the animal-feed ingredient table. Neither source names puffed rye as a Québec human-food product. |
| Candidate French phrases | Do not add `seigle soufflé`, `grains de seigle soufflés`, `seigle gonflé`, `seigle éclaté`, or a mechanically translated variant. | No reviewed Québec human-food product label or authoritative Québec term attests these as the puffed-rye product name. A French-language source outside Québec would not resolve that gap. |
| English aliases | None proposed. | `puffed rye` is already the documented English product title. `puffed rye kernels` appears in one mixed rye-bread concentrate ingredient list, but is not established as a separate retail synonym. Avoid `rye kernels`, already an alias of rye berries. |
| French aliases | None. | No Québec French product name has been established. |
| Category and numeric fields if later accepted | `GRAIN_AND_CEREAL`; null `defaultDensity`; empty `unitMappings`. | This is a product identity candidate. No transferable density, household measure, or mapping was found. |
| Keep separate from | Raw rye, rye berries, rye flakes, rye flour/meal, malted rye flour, mixed-grain cereal, sweetened/coated puffs, and flour-based extrudates. | Shared rye or puffed-cereal wording does not make these products equivalent. |

The reviewed non-Québec French terminology is useful only as context: the French phrase `céréales soufflées` occurs in Canadian food-label guidance, and `grains de céréales soufflés` is defined by CFIA for animal feed. Neither establishes the exact Québec French human-food product name. This review therefore declines to translate the English name by construction.

## Live package, collision, and recipe audit

The audit used the current split package and the repository's `normalize_search_key` behavior (case-folding, accent-folding, punctuation normalization, and ligature expansion) across active reference names/aliases, form labels/match terms, ledger strings, legacy candidates, and manifest-listed recipes. Candidate keys included `puffed rye`, `puffed rye grain(s)`, `puffed rye kernels`, `puffed rye cereal(s)`, `rye puff(s)`, and French search candidates `seigle soufflé`, `grain(s) de seigle soufflé(s)`, `céréales soufflées de seigle`, `seigle gonflé`, and `seigle éclaté`, including accent-folded variants.

| Search scope | Result |
| --- | --- |
| Exact normalized candidate-name/alias collisions in active references, forms, ledger, and legacy candidates | 0. No exact candidate phrase or candidate ID is present. |
| Prior proposals, plan, roadmap, and batch notes | No focused puffed-rye decision or exact product-name hit. Existing `rye flakes` and puffed-grain reviews are distinct. |
| Nearby active rye references | Seven: `ingredient-ref-rye-grain`, `ingredient-ref-rye-berries`, `ingredient-ref-rye-flakes`, `ingredient-ref-rye-flour`, `ingredient-ref-whole-rye-flour`, `ingredient-ref-rye-meal`, and `ingredient-ref-malted-rye-flour`. None has a puffed-rye name or alias. |
| Existing search collision to preserve | `rye kernels` is an alias of `ingredient-ref-rye-berries`; do not reuse it for puffed rye. Broad `rye` or `seigle` searches can return the seven related references. |
| Candidate terms in bundled recipes | 0 of 114 recipe files and 0 of 1,123 ingredient rows. A broader rye/`seigle` ingredient-line search also found 0. |
| Forms and numeric records | No form is linked to any of the seven active rye references. Each has null density and an empty unit-mapping array. No puffed-rye measure, density, conversion, or package-yield record exists; the single package yield is for canned black beans. The eight ledger unit conversions are unrelated. |
| Substitutions | Both global and contextual substitution-rule arrays are empty. No rye-puff rule or recipe-line substitution exists. |

The exact product phrase is distinct from existing rye names, but no bundled recipe demand supports adding a recipe link or quantitative data. This audit does not test live picker ranking or claim exhaustive retail coverage.

## Forms, quantities, conversions, yields, and substitutions

- **Forms:** add no `IngredientForm`. Puffed rye is a named processed-grain product, not a dry/cooked state form of rye or rye berries.
- **Measures and density:** add no serving mass, household volume, density, or unit mapping. A manufacturer’s nutrient values per 100 g and a commercial package size do not establish a household measure or density.
- **Conversions and yields:** add no raw-to-puffed factor, puffing yield, cooking yield, mass/volume conversion, or package yield. Process descriptions and supplier-specific absorption or formulation data do not provide a transferable recipe conversion.
- **Substitutions:** add no global or contextual rule. Similar cereal, garnish, or bakery use does not establish an equivalent amount or safe replacement for puffed wheat, barley, rice, or another puffed grain.
- **Recipe links:** add none because the bundled corpus has no candidate or broad rye ingredient line.
- **Future review boundary:** if direct Québec evidence appears, review only a plain puffed rye-grain product. Exclude mixed cereal, bars, sweetened/coated products, rye flakes, rye berries, rye flour/meal, and flour-based extrudates unless separately scoped.

## Proposal-local source register

The source IDs below are local to this proposal and were not added to the shared ledger. Sources were reviewed on 2026-10-11; dates below identify the source's stated publication/update where available.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-PRYE-20261011-S01` | Multiflour, supplier product page, [Puffed rye](https://www.multiflour.nl/en/productoverview/puffed-rye). | Current page names a `Puffed rye` product and lists bread, biscuits, cereal, salads, and bar applications. It directly supports the English product wording and human-food scope. It is a Netherlands supplier page, not Québec market evidence; its supplier-specific nutrient values per 100 g are not a culinary measure, density, or generic nutrition record. |
| `WP03-PRYE-20261011-S02` | CeralGran, manufacturer brochure, [CeralGran puffed wholemeal quality grains](https://cdn.asp.events/CLIENT_Dubai_Wo_4B15F265_5056_B739_54F3125D47F0BC95/sites/GFM-2019/media/libraries/exhibitor-brochures/78323CA1-BE47-0FFD-0F4D7F9E3FCDC025-document.pdf), 2019, pp. 1–2. | Calls out “puffed natural rye” and describes puffing as a controlled steam-based pressure process for whole cereal grains, with bakery uses. Its process, water absorption, weight, and use-rate data are supplier-specific and are not adopted as general conversion values. It is not Québec naming evidence. |
| `WP03-PRYE-20261011-S03` | Infanta Foods, manufacturer, [Grainy Rye](https://www.infanta.co.za/grainy_rye.php), indexed ingredient listing. | Lists `puffed rye kernels` within a multi-ingredient rye-bread concentrate and refers to fine puffed cereals. Supports the phrase as a component description only; it does not establish a pure puffed-rye retail SKU, a Québec product, or an alias. The page was available in indexed text but could not be fetched directly during this review. |
| `WP03-PRYE-20261011-S04` | Office québécois de la langue française, [seigle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432764/seigle), updated 2018. | OQLF prefers `seigle` and pairs it with English `rye`; the note says the French term names both the plant and the grain. It does not define a puffed product or a compound display. |
| `WP03-PRYE-20261011-S05` | Canadian Food Inspection Agency, [Net quantity on food labels](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/quantite-nette), current French guidance, table “Usage commercial établi.” | Includes `céréales soufflées` as a general food category entry and notes weight declarations for boxes and bags. This is not a Québec rye product label and does not establish `seigle soufflé`. |
| `WP03-PRYE-20261011-S06` | Canadian Food Inspection Agency, [Canadian Feed Ingredients Table](https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail), entries 1-201-013 and 1-201-022. | Defines `grain de seigle` as whole rye grain and `grains de céréales soufflés (ou grains soufflés)` as an ingredient for animal feed, with a steam/pressure/decompression process. The page explicitly concerns livestock feed; it is not used as human-food naming or product evidence. |

## Review disposition

**Hold puffed rye outside the active catalog pending Québec French product-name evidence.** The product and English wording are sufficiently supported for a future identity review, and the exact candidate does not collide with an existing key. The bilingual identity remains incomplete: OQLF supplies the base noun `seigle`, while federal French sources supply only a general human-food puffed-cereal class or an animal-feed term. Do not add `ingredient-ref-puffed-rye`, aliases, forms, numeric data, conversions, yields, substitutions, or recipe links on this evidence. Reopen with a Québec producer/retailer label for plain puffed rye or an authoritative Québec product-term decision.
