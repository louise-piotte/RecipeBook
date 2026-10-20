# WP02 B3 — Bracken starch / warabi-ko identity boundary

- **Reviewed:** 2026-10-11
- **Status:** Reviewed and integrated as a held research-ledger candidate; no active catalog row, form, recipe, or numeric behavior was added.
- **Scope:** One still-open B3 regional starch candidate: pure bracken-rhizome starch used for warabi mochi. This review does not reopen polvilho, water-chestnut products, kudzu, lotus-root starch, or the already reviewed tapioca-granule boundary.
- **Source IDs:** `WP02-BRACKEN-STARCH-20261011-S01` through `S07`; these are now stored on `candidate-bracken-starch` in the research ledger. No matching source-ID prefix or candidate reference ID was found in the inspected catalog, forms, legacy, ledger, or prior documentation before this report was written.

## Recommendation

**Hold a new catalog identity and all aliases pending a product-specific Québec or Canadian label for pure bracken starch.** Primary and Japanese government sources establish a real starch extracted from bracken roots/rhizomes, distinct from tapioca, sweet-potato, kudzu, and lotus starches. The current Canadian retail products found under `warabi-ko` / “Japanese bracken starch,” however, are mixtures. The French Canadian retail copy describes pure `hon-warabi-ko` as the 100% bracken-root-starch material, then says the listed product contains only a small percentage of that ingredient plus lotus-root starch and processed starch. It is not a standalone pure-starch package.

The available Québec evidence supports a French name for the plant (`fougère aigle`) but not a preferred food-starch name. Canadian French product and trademark wording exists (`amidon de fougère japonaise`, `amidon de racine de fougère`), but the product wording reviewed is for a blend and the trademark goods list does not identify species or prove a retail label. Leave the pure ingredient’s French display and unqualified `warabi-ko` mapping unresolved. This is an evidence-based hold, not a claim that bracken starch lacks a distinct identity.

| Candidate | Disposition | Boundary |
|---|---|---|
| Pure bracken-root/rhizome starch, described by MAFF as `bracken starch` and by retailers as `hon-warabi-ko` when 100% bracken starch | **Hold new reference.** The product class is source-confirmed; the pure product name and Québec French display are not sufficiently established by a standalone Canadian label. | If reconsidered, restrict to isolated starch from bracken rhizomes/roots. Research sources identify *Pteridium aquilinum*. Keep it separate from fiddleheads, generic fern products, lotus-root starch, kudzu starch, sweet-potato starch, and tapioca starch. No ID or display name is reserved by this proposal. |
| Retail `warabi-ko`, `warabiko`, or `warabi mochiko` | **Do not add aliases.** Current Canadian listings show that the label can identify a multi-starch blend rather than pure bracken starch. | A specific mix may be useful as a named product in a recipe when its package/formula is known; this review does not create a generic mix identity. |
| `bracken flour`, `fern starch`, `amidon de fougère`, `amidon de fougère japonaise` | **Do not add as aliases or broad displays.** These terms do not consistently resolve the pure starch product, and unqualified French `fougère` also overlaps an existing fiddlehead alias. | Do not infer that a fern ingredient, fern powder, fiddlehead, or a warabi-mochi mix is the pure starch. |

No proposed JSON row is included because no row is accepted. If later evidence justifies a row, first review a current package that explicitly identifies a pure bracken-starch product and its French label; decide the source-qualified botanical boundary and display wording from that evidence. Add no density, unit mapping, form, conversion, yield, recipe link, or substitution from this packet.

## Checklist location and prior-work reconciliation

- The active global plan leaves **“Water-chestnut flour and other documented regional starches”** open at lines 1268–1271 of [`docs/RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt). Its completed sub-items cover mung-bean starch, lotus-root starch, the water-chestnut product boundary, palm-sago pearls, and this bracken-starch review. The focused review is complete, while the broader checklist remains open.
- The current batch summary says B3 remains partial and that “water-chestnut flour and other regional products remain open” at line 483 of [`docs/catalog/batches/baking-flours-starches.md`](../batches/baking-flours-starches.md). This packet covers one new regional starch only.
- [`wp02-b2-b3-lotus-starch-quebec-wording-review-20261010.md`](wp02-b2-b3-lotus-starch-quebec-wording-review-20261010.md) previously used the same Canadian `warabi-ko` product page as evidence for the lotus-starch component. It explicitly kept warabi-ko separate from lotus starch because the product contains lotus starch, true warabi starch, and processed starch. This packet follows that boundary and reviews the bracken component itself; it does not repeat the lotus-name decision.
- A proposal search for `warabi` / `bracken` found no other product-level bracken-starch review. Other open candidates already covered by prior packets—including water chestnut and taro-corm starch—are not revisited here.

## Source findings and limits

1. Japan’s Ministry of Agriculture, Forestry and Fisheries describes warabimochi as made with bracken starch from bracken roots, calls that starch rare and labor-intensive to produce, and says commercially available warabimochi often uses sweet-potato, tapioca, or kudzu starch instead. This is strong official evidence for a source-specific ingredient class and against treating the finished sweet as proof of bracken starch. Its recipe’s 80 g starch quantity is for that one confection recipe, not a package conversion or general measure. [S01]
2. A primary starch study extracts samples from rhizomes identified as *Pteridium aquilinum* and reports laboratory properties for those samples. It supports the plant-part/species boundary, not a consumer label, kitchen measure, or general thickening/substitution rule. [S02]
3. The OQLF `ptéridium` entry pairs the plant terms `fougère aigle` and `bracken`, with an explanatory mention of *Pteridium aquilinum*. It supports Québec French botanical wording, not an extracted-starch compound or food-product name. [S03]
4. Fun Foods Canada’s French product listing uses `Warabi-ko – Amidon de fougère japonais` and describes authentic `hon-warabi-ko` as 100% bracken-root starch. It then states that the listed product contains only a small percentage of true warabi starch together with lotus-root starch and processed starch. The listing says “Produit du Japon”; Fun Foods says it ships from near Barrie, Ontario, across Canada. Neither source establishes a Québec-origin label or a standalone pure-starch package. [S04, S07]
5. Gusta Supplies’ current Canadian listing independently uses “Warabi-ko – Japanese Bracken Starch,” but its ingredient statement also lists lotus-root starch, true warabi starch, and processed starch. The store address is Markham, Ontario. This is useful English Canadian product-name evidence and direct blend-composition evidence, not a pure-bracken package label. [S05]
6. A Canadian Intellectual Property Office trademark journal goods list includes the French phrase `amidon de racine de fougère`. This confirms that phrase occurs in a Canadian commercial goods description, but a trademark filing is not a product label, botanical specification, or OQLF approval. [S06]

The independent identity sources and retail sources answer different questions. The former establish that pure bracken starch exists; the latter show why the unqualified retail name `warabi-ko` cannot be assumed to mean a pure ingredient. There was no reviewed Québec package label identifying pure bracken starch. The French terms remain candidates for review rather than accepted catalog copy.

## Live catalog, collision, ledger, and recipe audit

Read-only audit snapshot from the shared worktree before the held-candidate integration on 2026-10-11:

| Surface | Current count / fingerprint |
|---|---|
| Active `ingredient-references.v1.json` | 1,029 references; SHA-256 `f089a129d865d334659a2b77b65a9ca0bcc9efe415aedaff11b55be3552377b7` |
| Active `ingredient-forms.v1.json` | 71 forms; SHA-256 `1db31d8f54262555a18e15173f2a69b0d164cad5d53bf14fad86dac390c7989a` |
| `docs/catalog/legacy-import-identities.v1.json` | 75 candidates; SHA-256 `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| `docs/catalog/research-ledger.v1.json` | 1,318 records before this integration; SHA-256 `a96188a2a0ab8c40432c2e141b09731ea5570e3d4f551cff392c2e941fa3d9eb` |
| Seed manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe files | 114 recipes / 1,123 ingredient rows; manifest-order filename + NUL + file bytes + NUL fingerprint `0000c5dde42688400c036a83d0438fe717bf8a8d97161d4891d7a9eced1983d9` |

Exact normalized-name checks across active reference names/aliases, form names/match terms, and legacy candidate names/aliases found no exact owner for `warabi`, `warabi-ko`, `warabiko`, `hon-warabi-ko`, `warabi mochiko`, `bracken starch`, `bracken root starch`, `bracken fern starch`, `amidon de racine de fougère`, `amidon de racine de fougère aigle`, `amidon de fougère japonaise`, `fécule de fougère`, `fougère aigle`, or *Pteridium aquilinum*. No candidate ID for bracken starch was present in those active surfaces.

Two nearby active references matter for avoiding accidental mapping:

| Active reference | Relevant current data | Result for this review |
|---|---|---|
| `ingredient-ref-fiddleheads` | `fiddleheads / têtes-de-violon`; English aliases include `crosse de fougère` and `crosse de fougère-à-l'autruche`; category `VEGETABLE_AND_AROMATIC`. | The broad plant word `fougère` already occurs in a fiddlehead alias. Do not add a broad fern alias or use the fiddlehead row for starch. None of the full proposed starch phrases exactly matches this row. |
| `ingredient-ref-lotus-root-starch` | `lotus root starch / amidon de racine de lotus`; no aliases; category `FLOUR_AND_STARCH`. | The Canadian warabi-ko listings declare lotus starch as a component, but do not make the whole blend a lotus-starch alias or a pure bracken-starch product. |

Before this integration, the ledger had no bracken-starch identity record. The only related existing records are the fiddlehead identity, whose sources support Québec fiddlehead wording, and the lotus-root-starch identity, whose source `WP02-LOTUS-STARCH-QC-20261010-S03` is the Fun Foods Canadian French warabi-ko blend listing. There is no separate measurement or substitution record for bracken starch. A search for the source prefix `WP02-BRACKEN-STARCH-20261011` found no collision.

The recipe scan traversed all manifest-listed recipe files and ingredient rows. It searched each row and complete recipe JSON for `warabi`, `warabi-ko`, `warabiko`, `hon-warabi-ko`, `warabi mochiko`, `warabimochi`, `bracken`, `bracken starch`, `bracken root starch`, `Pteridium`, `amidon de racine de fougère`, `amidon de fougère`, `fécule de fougère`, `fougère aigle`, and `fern`. **Demand result: 0 of 1,123 ingredient rows and 0 of 114 recipe JSON files contain a match.** No recipe link, alias, form, measurement, or substitution is justified by the current bundled corpus.

## Sources

- **S01 — Japan Ministry of Agriculture, Forestry and Fisheries, [“Warabimochi | Our Regional Cuisines”](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/3671/index.html).** Official food-culture entry; defines the traditional bracken-starch source and notes common starch substitutions in commercial confection. The recipe amount and preparation steps are one regional recipe, not general conversion evidence.
- **S02 — Li et al., [“Structural and physicochemical properties of bracken fern (*Pteridium aquilinum*) starch”](https://doi.org/10.3389/fnut.2023.1201357), *Frontiers in Nutrition* (2023).** Primary study of extracted rhizome starch samples; laboratory properties are sample-specific and not kitchen conversions.
- **S03 — OQLF, [“ptéridium” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17053791/pteridium).** The 1981 entry pairs `fougère aigle` with English `bracken` and gives an explanatory reference to *Pteridium aquilinum*; it is botanical terminology, not a starch-product definition.
- **S04 — Fun Foods Canada, [“Warabi-ko – Amidon de fougère japonais pour mochi warabi”](https://funfoods.ca/fr/collections/newest-products/products/warabi-ko-japanese-bracken-starch-for-warabi-mochi-1kg).** French Canadian retailer listing and ingredients for a Japanese mixed starch product; explicitly says the marketed mix includes only a small percentage of true warabi starch. Nationwide availability is indicated, but no Québec origin or pure-starch package is established.
- **S05 — Gusta Supplies, [“Warabi-ko – Japanese Bracken Starch for Warabi Mochi”](https://supplies.gusta.ca/products/warabi-ko-japanese-bracken-starch-gusta-supplies?variant=29373821583383).** Current Ontario retailer listing with Markham pickup; its ingredient declaration identifies a blend of lotus-root starch, true warabi starch, and processed starch.
- **S06 — Canadian Intellectual Property Office, [Canadian Trademarks Journal, French issue, 2026-02-04](https://publications.gc.ca/collections/collection_2026/opic-cipo/RG42-2-73-3719-fra.pdf).** Goods-description evidence for the phrase `amidon de racine de fougère`; it does not identify botanical species or establish a retail package label.
- **S07 — Fun Foods Canada, [About us and terms of service](https://funfoods.ca/pages/about-fun-foods-canada-serving-valued-canadian-customers-since-2010).** States that orders ship from near Barrie, Ontario, across Canada. It establishes national distribution context, not a Québec location or Quebec-specific product naming.
