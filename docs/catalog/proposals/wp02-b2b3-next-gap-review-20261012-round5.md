# WP02 B2/B3 next gap review — whole-matrix acorn flour

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as an identity-only reference with bounded French aliases and one source-specific ledger portion.
- **Scope:** Review whole-matrix acorn flour as a distinct candidate from extracted acorn starch, acorn meal, and acorn squash. This completes the separate flour review explicitly deferred by the acorn-starch packet; it does not reopen that starch hold.
- **Source-ID prefix:** `WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012`; checked against the proposal archive and ledger before drafting, with no prior occurrence.

## Recommendation

**Accept an identity-only `ingredient-ref-acorn-flour` reference for human-food acorn-kernel flour, displayed as `acorn flour / farine de glands de chêne`.** The current indexed text for Québec producer Prendre Racine's product describes 100% oak fruit, cold-water soaking to remove tannins, and milling; it also gives a 120 g package and culinary uses. The listing is marked out of stock, and a direct fetch returned 403 during this review, so the maker's current indexed page is the available product evidence. [S11]

A 2020 Québec article identifies the same producer and 120 g food product with the exact wording `farine de glands de chêne du Québec`, and describes muffin and cookie use. Together, the manufacturer listing and local article tie a Québec French name to a process-described human-food flour. OQLF supports `gland` for the oak fruit, but does not rule on a flour term; treat the display as product-supported Québec wording, not an OQLF ruling or proof of present availability. [S05–S06, S11]

Recommend category `FLOUR_AND_STARCH`, no English aliases, and only source-attested French product wording as aliases: `farine de chêne`, `farine de chênes`, `farine de noix de chênes`, and `farine de glands de chêne du Québec`. Limit the identity to human-food acorn-kernel flour; keep the listed species and leaching process as product-specific evidence, not forms. Keep it separate from acorn squash, extracted acorn starch, acorn meal, and animal feed. Add no forms, active measurements, unit mappings, recipe links, conversions, yields, or substitution rules. Preserve the USDA full-fat NDB 12060 one-ounce value only as source-specific ledger evidence. The broader WP02 B2/B3 review remains open. [S07, S11]

## Product and naming boundary

| Wording or product | Disposition | Evidence and limit |
|---|---|---|
| Human-food `acorn flour` | Accept an identity-only `FLOUR_AND_STARCH` row. | USDA SR28 records `Nuts, acorn flour, full fat`; Landratech and primary food studies establish flour from acorn kernels of named *Quercus* species. The current Prendre Racine listing supplies a Québec human-food product with a described leaching and milling process. Scope the row to edible acorn-kernel flour, not extracted starch or feed. [S01–S03, S11] |
| `farine de glands de chêne` | Use as the French display; keep direct product variants as aliases. | The 2020 Québec article uses `farine de glands de chêne du Québec` for Prendre Racine's culinary flour. Its current product listing calls the 120 g item `Farine de chênes` and `farine de noix de chênes`, and describes the oak fruit and food process. [S06, S11] |
| Current Québec animal-feed listing | Keep outside the human-food identity. | A different seller uses the exact phrase `farine de glands de chêne` for ground red and white Québec acorns sold as deer feed. Its explicit animal-feed instructions cannot define a culinary identity or justify mapping feed items into the food catalog. [S07] |
| `gland` / `acorn` | Use only as the fruit term. | OQLF defines `gland` as the fruit of the oak and gives English `acorn`. It does not define a flour, flour process, or product label. [S05] |
| Acorn flour from named oak species | Keep species-specific source names as evidence, not aliases. | Landratech currently separates cork-oak, European-oak, and holm-oak flour products; a primary paper evaluates *Q. robur* flour. Do not infer that any one species or process is the universal Canadian meaning of `acorn flour`. [S02–S03] |
| `acorn meal` | Keep unassigned. | The prior acorn-starch review documents `acorn meal` in a USDA Forest Service food-preparation chapter but does not establish a consistent market-wide fineness boundary between meal and flour. [S09] |
| `acorn starch`, `acorn starch powder`, `acorn jelly powder`, `dotori-muk-garu` / `도토리묵가루` | Keep outside this flour identity. | The prior acorn-starch review and primary extraction study distinguish isolated starch from whole-matrix flour. Retail translations such as “powder” or “flour” do not make starch and flour equivalent. This packet does not reopen that separate French-name hold. [S04, S09] |
| `oak flour`, `acorn powder`, `acorn jelly powder`, and bare `farine de glands` | Do not add as aliases. | The reviewed evidence does not establish these as stable product names for the same human-food flour; jelly powders may refer to different materials. |

## Pre-integration catalog, ledger, ownership, and recipe audit

Read-only pre-integration snapshot from the shared worktree on 2026-10-12:

| Surface | Snapshot |
|---|---|
| Active ingredient references | 1,310; SHA-256 `c789c90328c3e1849d11a1a6940869f0c96bfafbe1074beb7b5249d21e8b18ca` |
| Ingredient forms | 98; SHA-256 `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64; SHA-256 `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research-ledger records | 1,618; SHA-256 `780bf24cbfb759c19a42ca89599e2766b3d2a0171aa1d9cc1a936e3f1defb6ac` |
| Manifest-listed recipes / ingredient rows | 114 / 1,123; recipe-file bytes 753,792; manifest-order fingerprint `ea9d7b6bd14aafe822089052c27a73786a93e76c33b4863def3f44eabde92b9f` |

The normalized exact-key audit used the repository's `normalize_search_key` across active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs/names. It found no exact owner for `acorn flour`, `oak flour`, `acorn meal`, `acorn powder`, `acorn starch`, `acorn starch powder`, `acorn jelly powder`, `farine de gland(s)`, `farine de glands de chêne`, `farine de chêne(s)`, the reviewed `farine de noix de chêne(s)` variants, the reviewed `amidon`/`fécule` variants, or `ingredient-ref-acorn-flour`. No acorn-flour form or ledger identity exists. The source-ID prefix above was absent from the archive and ledger before drafting.

The only exact active-reference neighbor is `ingredient-ref-acorn-squash` (`acorn squash / courge poivrée`, aliases `pepper squash / courgeron`, category `VEGETABLE_AND_AROMATIC`). It names a winter squash, not an oak fruit or flour; it has no attached form or recipe link. The exact phrase `acorn flour` does not collide with that row. Under the current picker search, the shorter query `acorn` would return both rows if a flour row were later introduced, so retain the full qualified English name and do not add bare `acorn` as an alias. [S10]

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for normalized whole-phrase matches to the flour, meal, starch, French-name, and Korean boundary phrases listed above; direct UTF-8 text search also checked `도토리`. There were **zero recipe-file hits, zero ingredient-row hits, and zero links to `ingredient-ref-acorn-squash`**. The bundle supplies no acorn-flour demand or recipe-derived measure.

## Measurement and substitution boundaries

- USDA SR28 NDB 12060 reports one mass measure for its `acorn flour, full fat` food code: **1 oz = 28.35 g**. It does not give a cup, spoon, or volume measure. Treat that as a source-specific portion observation only; do not turn it into a bulk density or app unit mapping, and do not generalize the full-fat record to other oak products. [S01]
- The current Prendre Racine listing gives a 120 g package and recommends 1/4 to 1/3 cup of its acorn flour with 2/3 cup of wheat or another flour in selected baked goods. This is product-specific recipe guidance, not a cup-to-gram measure or a transferable replacement rule. Preserve it only as source evidence. [S11]
- The 2025 *Q. robur* bread study reports gluten-network development at no more than 20% substitution under its study conditions; a separate wheat-bread trial evaluates acorn flour from 5% to 50% and reports its own maximum acceptable level. These formula-specific results, together with the maker's product guidance, do not justify a general wheat-flour replacement ratio. Add no global or contextual substitution, including flour-for-starch or flour-for-meal. [S03, S08, S11]
- Keep `defaultDensity: null`, `unitMappings: []`, forms, conversions, yields, and recipe links empty. Preserve the USDA mass portion only as a ledger observation; the sources give no reusable volume-to-mass mapping or active numeric behavior.

## Prior-work reconciliation and revisit condition

The acorn-starch packet explicitly deferred whole-acorn flour until its process and Québec human-food naming could be reviewed separately. The current Prendre Racine product listing now documents the human-food process and a local French product name; the 2020 article connects the same maker's 120 g package to the exact `farine de glands de chêne du Québec` wording. This materially supports the identity-only row proposed here and does not reopen the separate acorn-starch hold. [S06, S09, S11]

The active catalog outcome is only the identity decision; the ledger also preserves the USDA source-specific portion and the finding that reviewed sources support no reusable substitution. Keep the broad WP02 B2/B3 checklist open, and revisit if a distinct defatted product or another material process needs its own identity. Keep package portions and recipe guidance source-specific; add no density, unit mapping, form conversion, yield, recipe link, or reusable substitution.

## Source register

Pages were accessed on 2026-10-12. External evidence IDs S01–S08 and S11 are recorded in the shared ledger. S09 is prior-work context and S10 is implementation context; neither is a ledger source record.

| ID | Source | Supports | Limits |
|---|---|---|---|
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S01** | USDA Agricultural Research Service, [National Nutrient Database for Standard Reference, Release 28, Food Group 12, NDB 12060](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg12.pdf), 2015, pp. 1–3. | Exact food code name `Nuts, acorn flour, full fat`; reports 1 oz = 28.35 g. | Historical US nutrient-database entry; does not define current Canadian product scope, species, processing, cup measure, or density. |
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S02** | Landratech, [Acorn Flour](https://www.landratech.com/sector/acorn-flour), current manufacturer page. | Describes flour from dried, shelled, selected, finely milled acorn kernels and lists cork-oak, European-oak, and holm-oak product lines. | European manufacturer; species-specific commercial copy does not establish a Canadian/Québec product name or one universal species/process scope. |
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S03** | Suo et al., [“Acorn Flour and Bread-Making Application: Technological and Chemical Insights”](https://doi.org/10.1021/acsfoodscitech.5c00171), *ACS Food Science & Technology* 5(6), 2025. | Primary study identifies *Q. robur* flour used in bread and reports flour functionality for this species. | Study-specific material and bread method; no current Canadian product specification or general measure. |
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S04** | Correia et al., [“Starch isolation from chestnut and acorn flours through alkaline and enzymatic methods”](https://doi.org/10.1016/j.fbp.2011.06.005), *Food and Bioproducts Processing* 90(2), 2012. | Primary study isolates a separate starch fraction from acorn flour, supporting the flour/starch boundary. | Experimental extraction study; not a retail specification, household measure, density, or recipe substitution. |
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S05** | Office québécois de la langue française, [*gland* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17030679/gland), entry dated 1990. | Supports Québec French `gland` for the fruit of an oak and English `acorn`. | Botanical/food-fruit term only; no flour product or process name. |
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S06** | Rémy Bourdillon, Unpointcinq, [“Achat local : le Québec est riche en ingrédients secrets”](https://unpointcinq.ca/alimentation/achat-local-ingredients-du-quebec/), 17 June 2020. | Reports that Prendre Racine in Shawinigan sold a 120 g culinary `farine de glands de chêne du Québec`; also uses `farine de chêne` for that same item and recommends it for muffins and cookies. | Historical media report, not a current package or technical specification; the linked product page returns 403 to this review, so present availability and preparation details remain unverified. |
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S07** | Glands de Chêne, [*Farine de Glands de chêne*](https://www.glandsdechene.com/produit/farine-de-glands-de-chene/), current Québec product page. | Uses the exact French phrase for ground red and white Québec oak acorns and gives a 4 lb package. | Explicitly describes deer-feed use. It cannot support a human-food identity, culinary French display, or kitchen measure. |
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S08** | Szabłowska and Tańska, [“Effects of Acorn Flour Addition on Baking Characteristics of Wheat Flour”](https://pmc.ncbi.nlm.nih.gov/articles/PMC11765099/), *Foods* 14(2), 190, 2025. | Primary experiments test defined wheat/acorn-flour blend levels and describe effects on dough and bread. | Laboratory/formula evidence only; it does not establish a transferable substitution rule. |
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S09** | Prior repository review: [WP02 acorn-starch boundary packet](wp02-b2b3-next-flour-starch-batch-20261012.md). | Established acorn starch as a distinct held product; explicitly deferred whole-acorn flour to a separate review. | Does not independently settle a flour identity or the current status of the historical Québec food product. |
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S10** | RecipeBook, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Current search treats a complete word phrase such as `acorn flour` separately from the shorter `acorn` query, which matches terms containing that word. | Implementation context only; this proposal does not change picker behavior or run UI tests. |
| **WP02-B2B3-ACORN-FLOUR-BOUNDARY-20261012-S11** | Prendre Racine, [*Farine de chênes*](https://prendreracine.ca/produit/farine-de-chenes/), current Québec producer product listing; accessed 2026-10-12. | The current indexed product text describes a 120 g food product from Québec oak fruit, leached by cold-water soaking and milled; it gives culinary use guidance and the seller's current French product wording. | The listing is marked out of stock and direct retrieval returned 403 in this review; this review used its current indexed text. Product-specific package and recipe guidance do not establish a general measure or substitution. |

## Proposal review checks before integration

Static checks performed before integration: re-read `AGENTS.md`, the current WP02 B2/B3 plan section, and the latest acorn-starch and chia-flour decisions; captured current reference, form, legacy, ledger, manifest, and recipe-corpus counts and hashes; checked exact normalized ownership across active references, forms, legacy candidates, and ledger records; confirmed the proposed source-ID prefix was unused; scanned all manifest recipes and ingredient rows plus direct UTF-8 text for candidate phrases; verified no recipe links to the existing acorn-squash row; and, after drafting, checked UTF-8/no-BOM, source-ID uniqueness, target-only diff, and whitespace. At proposal-review time, no database JSON or application code had been changed.


## Integration result (2026-10-12)

Added identity-only `acorn flour / farine de glands de chêne` as `ingredient-ref-acorn-flour` in
`FLOUR_AND_STARCH`. Added no English aliases and retained four source-attested French product
phrases: `farine de chêne`, `farine de chênes`, `farine de noix de chênes`, and
`farine de glands de chêne du Québec`. Kept `defaultDensity` null, `unitMappings` empty, and added
no forms, recipe links, yields, conversions, or substitutions.

Added nine reviewed external sources and three decisions to the ledger. USDA SR28 NDB 12060's
`1 oz = 28.35 g` remains a food-code-specific portion observation, not an active conversion.
Measurement research remains `blocked_pending_evidence`; substitution research records no supported
reusable substitute. The full 114-recipe / 1,123-row corpus has no candidate match.

Static seed-package validation, reference normalization, generated-index freshness, ledger schema,
normalized ownership, recipe-corpus, UTF-8/no-BOM, mojibake, and whitespace checks passed. The package
has 1,312 references; the ledger has 1,620 records, 5,918 source entries, and 4,939 distinct source
IDs. The nine new source IDs each occur once. No app tests or emulator checks were run because this
change only adds database JSON data and regenerates its index. See the batch integration note for
check details.
