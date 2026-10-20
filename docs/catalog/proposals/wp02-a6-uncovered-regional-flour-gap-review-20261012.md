# WP02 A6 uncovered regional flour gap review: Bajri flour

- **Review date:** 2026-10-12
- **Scope:** One still-uncovered regional flour spelling for the unfinished WP02 A6 review.
- **Status:** Proposal only. No catalog, ledger, checklist, roadmap, or workflow data changed.
- **Proposal-local source IDs:** `WP02-A6-BAJRI-FLOUR-ALIAS-20261012-S01` through `S05`. All five IDs were checked against the live research ledger and were absent.

## Bounded decision

Add the single English alias **`bajri flour`** to the existing `ingredient-ref-pearl-millet-flour` reference. Do not create a new ingredient reference. Keep its current display pair `pearl millet flour / farine de mil chandelle`, its existing `bajra flour` alias, its `FLOUR_AND_STARCH` category, and its current numeric state.

This is a source-qualified spelling decision. FSSAI defines “Bajra Flour (Pearl Millet Flour)” as a product milled from pearl-millet grains [S01]. Canadian manufacturer Puremill explicitly names its product “Bajri Flour (Pearl Millet Flour),” and a separate Mississauga retailer lists “Bajri Flour (Pearl Millet Ground)” [S02, S03]. These sources support the qualified flour phrase on the existing pearl-millet-flour identity.

Keep bare `bajri`, `bajri atta`, and `bajra atta` out of the alias list; the reviewed evidence does not establish those exact qualified or bare names for this catalog row. Keep `sprouted bajri flour` and other sprouted pearl-millet wording out of the plain-flour alias list, consistent with the existing A6 sprouted-flour hold. Puremill describes its own milling as retaining the whole grain [S02]; treat that as maker-specific process information, not a universal meaning of `bajri flour` or grounds to create a whole-grain flour identity in this spelling review.

The current matcher uses phrase containment: after adding `bajri flour`, a search for bare `bajri` may also surface the flour row. No bare `bajri` alias is proposed. If a future source review establishes `bajri` as a grain name, the query may present both grain and flour choices, as the existing `bajra` query already does.

## Language and identity boundary

Retain `pearl millet flour / farine de mil chandelle`. The current ledger already cites Codex CXS 170-1989 as source `WP02-S34` for the pearl-millet-flour identity and French product name. OQLF lists Québec terms for the **grain**—including `millet perle` and `millet à chandelle`—and English `pearl millet`; it does not supply a French name for this regional flour spelling [S04]. Do not add a French alias or change the existing French display from this evidence.

The proposal does not treat the target flour as the pearl-millet grain, generic millet flour, finger-millet flour, or sprouted pearl-millet flour. It does not infer extraction level, germ content, grind, or processing from the regional spelling.

## Measurement and substitution evidence

The live target reference has `defaultDensity: null` and `unitMappings: []`. No reviewed Canadian manufacturer or Québec source provides a household cup-to-mass value for this product. A 2022 peer-reviewed study reports a bulk density of `0.63 ± 0.01 g/mL` for its tested pearl-millet flour sample. The authors ground whole grains below 0.5 mm and measured the sample in a 100 mL cylinder filled with 50 g, then tapped it to settle [S05]. This is a sample- and protocol-specific bulk-density observation, not a household measure or transferable catalog default. Keep density null and mappings empty.

The study's flour-blend experiments do not establish a generally applicable pearl-millet-flour substitution ratio. The reviewed manufacturer, standard, Québec, and study sources provide no reusable direct substitute or adjustment rule. Add no global or contextual substitution rule, conversion, yield, or recipe-line substitution. Retain the existing ledger states `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`; this bounded alias review does not close broader research for either topic.

## Current ownership and collision audit

Audit method: exact keys were compared after the repository's `normalize_search_key` normalization across active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs. The live snapshot at review time is:

| Store | Count | SHA-256 |
| --- | ---: | --- |
| Ingredient references | 1,235 | `fe44e14adc8b1ad613dd84e15a36a6c381f96ecded39a777fae1279bfc674abd` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy candidates | 66 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Research ledger | 1,534 records; 5,294 source entries; 4,336 distinct source IDs | `baffa3f9442bacf3807d44676fd051956e827e75c97518f7007312a8ee2e58eb` |

| Exact key or ID | Active reference owner | Form owner | Legacy candidate owner | Ledger record ID owner |
| --- | --- | --- | --- | --- |
| `bajri flour` | none | none | none | none |
| `bajri` | none | none | none | none |
| `bajri atta` | none | none | none | none |
| `bajra atta` | none | none | none | none |
| `bajra flour` | `ingredient-ref-pearl-millet-flour` | none | none | none |
| `bajra` | `ingredient-ref-pearl-millet` | none | none | none |
| `pearl millet flour` | `ingredient-ref-pearl-millet-flour` | none | none | none |
| `farine de mil chandelle` | `ingredient-ref-pearl-millet-flour` | none | none | none |
| `millet perlé` | `ingredient-ref-pearl-millet` | none | none | none |
| `sprouted bajri flour` | none | none | none | none |
| `sprouted bajra flour` | none | none | none | none |
| `farine de bajri` | none | none | none | none |
| Proposed ID `ingredient-ref-bajri-flour` | none | none | none | none |

The target reference is currently `pearl millet flour / farine de mil chandelle`, with English alias `bajra flour`, no French aliases, null density, and no unit mappings. The distinct grain reference owns `bajra` and `millet perlé`. No form entry supplies a pearl-millet flour form or an exact `bajri` term. The five proposal-local source IDs above are unused in the ledger's 4,336 distinct source IDs.

The existing ledger record `ingredient-ref-pearl-millet-flour` contains the verified flour identity, current Codex source `WP02-S34`, and accepted `bajra flour` decision from `WP03-BAJRA-FLOUR-20261010-S01`. It does not have a record ID for `bajri flour`; this proposal would append the new source evidence and alias decision to that same record.

## Manifest recipe-demand audit

The manifest lists 114 recipe files. Their 1,123 ingredient rows were scanned using the repository search-key normalization across every serialized string and ingredient-row field. Candidate phrases included `bajri flour`, `bajri`, `bajri atta`, `bajree`, `bajra flour`, `bajra`, `bajra atta`, the current English and French flour names, Québec pearl-millet terms, and sprouted pearl-millet variants.

- Full-recipe files with a candidate phrase: **0**.
- Ingredient rows with a candidate phrase: **0**.
- Direct recipe links to `ingredient-ref-pearl-millet-flour`: **0**.
- Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Recipe corpus fingerprint: `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.

No recipe-demand evidence supports a new identity or recipe link. The alias is justified by current product naming and the existing species-qualified flour identity.

## Recommended integration delta

1. Add only `bajri flour` to `aliasesEn` on `ingredient-ref-pearl-millet-flour`.
2. Append sources S01–S05 to that existing ledger record and add one accepted alias decision using S01–S03 for the product/name boundary and S04–S05 for language and numeric evidence limits.
3. Preserve the bilingual display, `bajra flour` alias, category, null default density, empty unit mappings, and the current measurement and substitution research states.
4. Add no reference ID, form, legacy entry, recipe link, conversion, package yield, density, unit mapping, or substitution rule. Keep the broader A6 checklist open.

This proposal changes no shared catalog data and requires no tests or emulator work.

## Sources

| ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| **WP02-A6-BAJRI-FLOUR-ALIAS-20261012-S01** | Food Safety and Standards Authority of India, [Food Products Standards and Food Additives Regulations, Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 dated 2025-05-07, §2.4.17, PDF p. 58. | Defines “Bajra Flour (Pearl Millet Flour)” as a product obtained by milling pearl-millet grains. Primary Indian food-standard evidence for the qualified name and milling identity; no household measure or substitution is inferred. |
| **WP02-A6-BAJRI-FLOUR-ALIAS-20261012-S02** | Puremill Canada, [Puremill Bajri Flour](https://www.puremill.ca/products/puremill-bajri-flour) and [Our Story](https://www.puremill.ca/pages/our-story), product description and milling explanation, accessed 2026-10-12. | The product page pairs `Bajri Flour` with `Pearl Millet Flour` and identifies pearl millet grains. The company describes its own milling as retaining the whole grain; that process statement is maker-specific and is not generalized. Product and company pages are one manufacturer source entry. |
| **WP02-A6-BAJRI-FLOUR-ALIAS-20261012-S03** | East India Pantry, Mississauga, [Bajri Flour (Pearl Millet Ground)](https://www.eastindiapantry.ca/products/bajri-flourpearl-millet-ground), product title and Canadian retail listing, accessed 2026-10-12. | Independent Canadian retailer evidence for the exact regional spelling and its pairing with pearl millet. Retail availability and package size do not establish a recipe measurement. |
| **WP02-A6-BAJRI-FLOUR-ALIAS-20261012-S04** | Office québécois de la langue française, [millet perle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle), Grand dictionnaire terminologique, accessed 2026-10-12. | Supplies Québec terms for pearl millet as a grain and the English equivalent; it does not name this flour product or establish `bajri` as a French alias. |
| **WP02-A6-BAJRI-FLOUR-ALIAS-20261012-S05** | Emmanuel Anyachukwu Irondi et al., [“Physicochemical, antioxidant and starch-digesting enzymes inhibitory properties of pearl millet and sweet detar gluten-free flour blends, and sensory qualities of their breads”](https://www.frontiersin.org/journals/food-science-and-technology/articles/10.3389/frfst.2022.974588/full), *Frontiers in Food Science and Technology*, 20 September 2022, methods and bulk-density results. | Reports the study-specific bulk-density protocol/result (`0.63 ± 0.01 g/mL`) and flour blends. It provides neither a household cup mapping nor a universal substitution ratio. |

**Existing ledger source:** `WP02-S34`, Codex CXS 170-1989, [Norme pour la farine de mil chandelle](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B170-1989%252FCXS_170f.pdf), already attached to `ingredient-ref-pearl-millet-flour`. It remains the existing support for the current English/French display pair; this proposal assigns it no new source ID.
