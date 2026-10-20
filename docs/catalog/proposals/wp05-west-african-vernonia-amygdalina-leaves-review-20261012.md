# WP05 West African leafy vegetable — Vernonia amygdalina review

- **Reviewed:** 2026-10-12
- **Status:** Integrated as recommended on 2026-10-12. See the [integration record](../batches/wp02-wp03-wp04-wp05-manioc-chiura-capelin-vernonia-integration-20261012/README.md).
- **Scope:** Food-use leaves of *Vernonia amygdalina*. This review does not cover other *Vernonia* species, herbal extracts, roots, stems, or medicinal uses.
- **Source-ID prefix:** `WP05-WEST-AFRICA-VERNONIA-20261012`, S01–S05. Root added these five source records during integration.

## Proposed identity

Add one identity-only reference:

| Field | Proposed value | Evidence limit |
|---|---|---|
| Stable ID | `ingredient-ref-vernonia-amygdalina-leaves` | No matching active reference, alias, form, legacy candidate, or ledger ID was found in the checked surfaces. |
| Category | `VEGETABLE_AND_AROMATIC` | The source material identifies the leaves as a food leaf vegetable. |
| English display | `Vernonia amygdalina leaves` | Species-qualified name avoids treating the broader market term `bitter leaf` as species-exclusive. |
| French display | `feuilles de Vernonia amygdalina` | Clear descriptive French wording supported in Canadian specialty-market wording; not an OQLF ruling. |
| English aliases | `onugbu`, `ewuro` | Nigerian regional names tied to this species in the sources; not universal English names. |
| French aliases | none | No Québec-preferred or stable French alias was established. |
| Density / unit mappings | `null` / `[]` | No transferable household conversion was found. |

The Nigeria country report identifies *V. amygdalina* as bitter leaf / Yoruba `Ewuro` and classifies it as a leaf vegetable. The University of Texas African Studies page also ties Igbo `onugbu` and Yoruba `ewuro` to the species and describes its leaves as soup greens. The Canadian Afritibi listing names *V. amygdalina* and uses the product wording “Feuilles de vernonia.” [S03–S05]

## Name and species boundary

| Term or product | Decision | Evidence boundary |
|---|---|---|
| Food-use leaves of *Vernonia amygdalina* | Include as the species-qualified identity | FAO identifies the leaves as food and the Nigeria report lists the species as a leaf vegetable. [S01, S03] |
| `onugbu`, `ewuro` | Add as regional aliases | Sources directly connect these Nigerian language names to *V. amygdalina*. [S03, S04] |
| Unqualified `bitter leaf` / `bitterleaf` | Keep out of aliases | FAO’s market study groups *V. amygdalina*, *V. colorata*, and *V. calvoana* under “bitter leaf” and reports that it could not identify the species sold in surveyed shops. [S02] |
| `ndole` / `ndolé` | Keep unassigned | The same FAO study documents `ndolè` as a market name spanning multiple *Vernonia* species. The Canadian listing uses the product name but does not establish that it is a universal species alias. [S02, S05] |
| Other *Vernonia* species, roots, stems, and extracts | Keep separate or out of scope | The proposal is limited to food-use *V. amygdalina* leaves; no other plant part or species is mapped into it. |

The English display is deliberately species-qualified. The French display is a descriptive name, not a claim that OQLF or another terminology authority has standardized the wording. Retain exact diacritics in the regional names when displayed in source prose, while the alias keys remain `onugbu` and `ewuro`.

## Measurements, substitutions, and recipe demand

- **Measurement:** Set `measurementState` to `researched_no_supported_value`. Food composition values and recipe quantities do not establish a transferable leaf measure, density, or fresh-to-dried conversion. No measurement observation, density, or unit mapping is proposed. [S01, S02]
- **Substitution:** Set `substitutionResearchState` to `researched_no_supported_substitute`. Shared use as soup greens is not enough to establish a safe or quantity-equivalent substitute. Add no global or contextual rule.
- **Forms and processing:** Add no fresh, dried, frozen, washed, or blanched form. Canadian products show that fresh/frozen/dried trade states exist, but no recipe demand or shared preparation standard is established here. [S02, S05]
- **Recipes:** No exact candidate phrase was found in the bundled recipe corpus; add no recipe link.

## Pre-integration ownership and demand audit

At proposal time, active references and forms had no exact `Vernonia amygdalina`, `onugbu`, `ewuro`, `bitter leaf`, or `ndole` owner, and the proposed ID was unassigned. Root rechecked normalized-key ownership across active references, forms, the legacy import catalog, and ledger identifiers before integration. The manifest-ordered corpus scan covered 114 files and 1,123 ingredient rows and found zero candidate phrase hits. After integration, the qualified species name, `onugbu`, and `ewuro` each return only `ingredient-ref-vernonia-amygdalina-leaves`; unqualified `bitter leaf`/`bitterleaf` and `ndole`/`ndolé` remain unassigned. Preserve the broader African regional-coverage item as open; this is one bounded identity, not a cuisine-completion claim.

## Source register

Sources checked online on 2026-10-12:

| ID | Source | What it supports and what it does not |
|---|---|---|
| `WP05-WEST-AFRICA-VERNONIA-20261012-S01` | FAO, [Compendium of forgotten foods](https://openknowledge.fao.org/3/cc5044en/cc5044en.pdf), Bitter leaf entry. | Names bitter leaf as *Vernonia amygdalina*, describes its leaves as food, and reports food-composition data. The composition data are not a household conversion. |
| `WP05-WEST-AFRICA-VERNONIA-20261012-S02` | FAO, [Evaluation des échanges des produits forestiers non ligneux entre l’Afrique subsaharienne et l’Europe](https://www.fao.org/4/x6612f/x6612f06.htm), section 3.3.3. | Describes `ndolè` / bitter leaf as a leaf vegetable, documents three traded *Vernonia* species, reports uncertain species identification in surveyed markets, and distinguishes market wording by country. European trade research is not a Canadian label standard. |
| `WP05-WEST-AFRICA-VERNONIA-20261012-S03` | Government of Nigeria / FAO, [Country report on the state of plant genetic resources for food and agriculture](https://www.fao.org/4/i1500e/Nigeria.pdf), food-use table. | Lists *Vernonia amygdalina*, Bitter leaf, Yoruba `Ewuro`, and the use “Leaf vegetable.” It is a country report, not a Québec terminology ruling. |
| `WP05-WEST-AFRICA-VERNONIA-20261012-S04` | University of Texas at Austin, [No. 1261: Bitter Leaf](https://www.laits.utexas.edu/africa/ads/1261.html). | Associates *V. amygdalina* with Igbo `onugbu` and Yoruba `ewuro`, and describes leaves added to soup or eaten as greens. The page also contains medical claims; none are used here. |
| `WP05-WEST-AFRICA-VERNONIA-20261012-S05` | Afritibi, [Ndole frais et congelé](https://afritibi.com/produit/ndole/). | Canadian specialty-market wording includes “Feuilles de vernonia” and *V. amygdalina* on a fresh/frozen `ndole` product page. It supports one product listing, not universal synonymy among `ndole`, `bitter leaf`, and one species. |

## Prior work checked

- The global plan’s WP05 Africa coverage and existing bounded Africa gap sweep.
- Current leafy vegetable identities such as cassava, jute, moringa, molokhia, sweet-potato, taro, amaranth, and water-spinach leaves.
- The catalog has no active Vernonia leaf identity; this proposal does not reopen the separate `matooke` hold.


## Integration result

Added `ingredient-ref-vernonia-amygdalina-leaves` with species-qualified displays, aliases `onugbu` and `ewuro`, and a five-source accepted identity record. Kept broad `bitter leaf` and `ndole` terms unassigned. No recipe, form, numeric, conversion, yield, or substitution data changed. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`. See the [integration record](../batches/wp02-wp03-wp04-wp05-manioc-chiura-capelin-vernonia-integration-20261012/README.md).
