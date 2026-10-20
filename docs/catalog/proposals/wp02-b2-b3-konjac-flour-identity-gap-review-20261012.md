# WP02 Section B2/B3 — Konjac flour identity gap review

- **Reviewed:** 2026-10-12
- **Status:** Proposal only; no shared catalog, ledger, plan, checklist, roadmap, or workflow files were changed.
- **Scope:** One edible tuber-derived flour identity, `konjac flour / farine de konjac`. This review does not reopen other B2/B3 products or held candidates.

## Bounded decision

Recommend one identity-only `FLOUR_AND_STARCH` reference:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-konjac-flour` |
| English display | `konjac flour` |
| French display | `farine de konjac` |
| English/French aliases | None |
| Default density | `null` |
| Unit mappings | `[]` |

Scope the identity to food-grade material sold as konjac flour and made from konjac tubers/corms. Do not imply one standardized species or flour composition across suppliers: manufacturer material covers *Amorphophallus konjac* and other edible konjac species, and its flour grades vary by purity and other specifications [S02]. Keep product-specific botanical declarations with their source; do not broaden this row to all *Amorphophallus* powders or extracts.

OQLF accepts the French borrowing `konjac` and says the plant’s tuberous rhizome is used to produce flour [WP03-SHKN-20261011-S01]. A Québec-facing Super C listing for Haiku vermicelli uses the exact French ingredient wording `farine de konjac` [S04]. Together these support the bilingual display. Super C’s page names a prepared product, not a standalone flour package, so it does not establish local bulk availability or a flour specification.

Do not alias `konjac powder`, `konjac gum`, `glucomannan`, `konnyaku powder`, `konnyaku`, bare `konjac`, or `elephant yam flour`. The naming varies by source: Health Canada’s NHPID lists `konjac gum` as a common name for its defined konjac-flour substance [S01], while a manufacturer catalogs flour and gum in separate product series [S02], and the research paper describes glucomannan as a constituent extracted from konjac tuber [S03]. No Québec food-label evidence establishes these as safe general synonyms. MAFF describes `konnyaku powder` as an input in a process for making prepared konnyaku, not as a general retail synonym for flour [WP03-SHKN-20261011-S02]. Keep active `yam flour / farine d’igname` separate. The existing noodle decision also keeps konjac material distinct from finished shirataki/konjac noodles [WP03-SHKN-20261011-S01–S02].

## Plan and prior-decision reconciliation

The active WP02 plan leaves B2/B3 partial and keeps “Water-chestnut flour and other documented regional starches” open at [the plan’s Section B checklist](../../RecipeBook-global-ingredient-catalog-plan.txt). Recent work in that area addresses the potato-starch Québec alias, cassava-flour wording, and named starch/pearl products. The held water-chestnut, bracken-starch, and taro-corm-starch reviews concern different source materials. None proposes konjac flour. A search across the existing proposals and batches for `konjac flour`, `farine de konjac`, and `glucomannan flour` found only the accepted WP03 shirataki boundary review. That review deliberately leaves konjac flour/gum and glucomannan separate from finished noodles; it does not propose or hold a konjac-flour reference.

The only active konjac-related identity is `ingredient-ref-shirataki-noodles`, displayed as `shirataki noodles / nouilles shirataki` with the qualified aliases `konjac noodles / nouilles de konjac`. Its ledger decision says to keep konjac material distinct. This proposal follows that boundary and adds no noodle aliases. The related active true-yam flour identity remains `ingredient-ref-yam-flour`.

## Live ownership, ID, and recipe audits

The exact-key audit used the app’s current normalization: case folding, diacritic folding, `œ`/`æ`/`ß` folding, and punctuation/spacing normalization. It compared every reference display and alias, form label and match term, and legacy candidate display and alias.

| Exact normalized phrase | Current reference owner | Forms / legacy exact owner |
|---|---|---|
| `konjac flour` | None | None |
| `farine de konjac` | None | None |
| `konjac powder` | None | None |
| `konjac gum` | None | None |
| `glucomannan` | None | None |
| `konnyaku flour` / `konnyaku powder` | None | None |
| `konjac` / `Amorphophallus konjac` | None | None |
| `konjac noodles` | `ingredient-ref-shirataki-noodles` (`aliasesEn`) | None |
| `nouilles de konjac` | `ingredient-ref-shirataki-noodles` (`aliasesFr`) | None |
| `shirataki noodles / nouilles shirataki` | `ingredient-ref-shirataki-noodles` (canonical displays) | None |
| `yam flour / farine d’igname` | `ingredient-ref-yam-flour` (canonical displays) | None |

The source phrase `konjac flour` occurs in the ledger only within the existing `ingredient-ref-shirataki-noodles` record, as a product ingredient and in the decision to keep konjac material separate. There is no konjac-flour identity or held candidate record. `candidate-konjac-flour` and `ingredient-ref-konjac-flour` are absent from current reference, form, legacy, and ledger IDs.

| Surface | Current snapshot |
|---|---|
| Ingredient references | 1,236 rows; SHA-256 `5777a596ace933894fca32a4b5f0269894a4543b10d45f798013d05f3dda1c9f` |
| Ingredient forms | 86 rows; SHA-256 `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import candidates | 66 rows; SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| Research ledger | 1,535 records / 5,300 source entries / 4,342 distinct source IDs; SHA-256 `9b330827411ea776a62e8b68a21a49ea7a809ccf1e5d3f64febc34c08bcacb23` |
| Seed manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 recipes / 1,123 ingredient rows / 752,993 bytes; SHA-256 `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` |

The recipe scan checked every manifest-listed recipe and ingredient row for `konjac flour`, `farine de konjac`, `konjac powder`, `konjac gum`, `glucomannan`, `konnyaku`, `Amorphophallus konjac`, `shirataki`, `yam flour`, and `elephant yam`. It found **0 of 1,123 ingredient rows and 0 of 114 recipe files** with a text match. No ingredient row links to `ingredient-ref-shirataki-noodles`, and none links to the proposed ID. The recipe corpus is searchable for the proposed identity but does not currently require a recipe link.

Proposed new source IDs use prefix `WP02-B2B3-KONJAC-FLOUR-GAP-20261012`; S01–S04 were checked against all 4,342 distinct live ledger source IDs and have no collision. The reused WP03 source IDs listed below are present in the live ledger.

## Measurements and substitution

- **Density and household measures:** Unknown. No reviewed source supplies a transferable mass-per-volume value, cup/spoon weight, or kitchen unit mapping. KALYS describes high water retention and says gel/solution characteristics vary by product type, concentration, pH, and ingredient interactions [S02]. The primary bread study adjusted water by formulation and powder lot; those experiment values are not density evidence [S03]. Keep `defaultDensity: null`, `unitMappings: []`, and no flour form.
- **Substitution:** No general ratio or substitution rule is supported. The bread paper reports a particular gluten-free formulation series using flour-basis percentages, with a product labeled 70% glucomannan; its recipe-specific hydration and sensory results cannot be transferred as a general flour-for-flour conversion [S03]. Keep measurement and substitution research states `not_yet_researched`; add no global or contextual rule.

## Recommended integration delta

If accepted, create only `ingredient-ref-konjac-flour` with the proposed bilingual displays, `FLOUR_AND_STARCH`, empty alias arrays, null density, and empty unit mappings. Add an accepted identity decision to a new ledger reference record, cite S01–S04 and the existing OQLF/MAFF cross-references, and retain `not_yet_researched` measurement and substitution states. Add no form, recipe link, recipe edit, yield, conversion, or substitution. Leave the broader B2/B3 checklist open.

## Sources checked online on 2026-10-12

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2B3-KONJAC-FLOUR-GAP-20261012-S01** | Health Canada, [Natural Health Products Ingredients Database: Konjac flour](https://webprod.hc-sc.gc.ca/nhpid-bdipsn/ingredReq?id=3974&lang=eng&wbdisable=true). Lists `Konjac flour` as the proper name, names tuber as plant part, and includes gelling/thickening purposes. | Natural-health-products database entry, last modified 2019-03-01; not a food-label standard or claim that every grade is authorized for food use. |
| **WP02-B2B3-KONJAC-FLOUR-GAP-20261012-S02** | KALYS Productions, [KALYS Konjac Flours](https://www.kalys.com/en/produits/konjac-kalys). Manufacturer describes food applications, up to 95% glucomannan, more than 30 controlled specification lines, and source tubers from *A. konjac* and other edible konjac species. | First-party supplier description; establishes grade variation and food-ingredient use, not a common composition, kitchen measure, or single species across products. |
| **WP02-B2B3-KONJAC-FLOUR-GAP-20261012-S03** | Laignier et al., [“*Amorphophallus konjac*: A Novel Alternative Flour on Gluten-Free Bread”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8229984/), *Foods* 10(6), 1206 (2021), doi:10.3390/foods10061206. Primary study describes commercial flour lots labelled 70% glucomannan and tests flour in gluten-free bread formulations. | Formulation-specific research; it does not establish generic substitution ratios, density, household measures, or universal product composition. |
| **WP02-B2B3-KONJAC-FLOUR-GAP-20261012-S04** | Super C Québec, [Haiku vermicelles de konjac](https://www.superc.ca/allees/garde-manger/pates-riz-et-feves/nouilles-et-vermicelle/vermicelles-de-konjac/p/055789720632), item `055789720632`. The indexed French product page lists `EAU, FARINE DE KONJAC, ACIDE CITRIQUE`; the parallel Haiku konjac-rice listing uses `Eau, Farine de konjac, Acide citrique`. | Retail ingredient-label evidence for exact Québec-facing wording, not a standalone flour package or standardized composition. The product pages returned HTTP 403 on direct open; search-indexed listing text was available at review time, so no stock or current price claim is made. |

**Existing ledger cross-references:** `WP03-SHKN-20261011-S01` is OQLF’s [konjac GDT entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26559799/konjac), updated 2022; it accepts French `konjac` and says the tuberous rhizome is used to make flour and other foods. `WP03-SHKN-20261011-S02` is Japan MAFF’s [Konnyaku overview](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/nousan-kakou.html); it describes konnyaku powder as a processed input mixed with water and coagulant to make block or noodle products. These IDs already exist on the accepted shirataki ledger record; they are cited here as boundary references, not new source IDs.

No tests or emulator work were performed; this is a proposal-only review with no database JSON changes.
