# WP02 Hattai-ko, Roasted Gram, and Functional Toasted-Flour Boundary Review

- **Batch:** `WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010`
- **Date:** 2026-10-10
- **Status:** Proposal only. No canonical reference, form, ledger, recipe, test, plan, or roadmap file was changed.
- **Scope:** Reconcile the Hattai-ko/mugikogashi hold with new manufacturer-specific evidence; check other roasted gram flours and the Québec functional-flour portfolio; audit the live bundled recipes and exact search-name collisions.

## Decision

Add one source-bounded identity-only reference for the Québec mill's named **roasted quinoa flour** product, distinct from generic quinoa flour and whole/cooked quinoa:

| Proposed stable ID | English / fr-CA display | Aliases | Category |
| --- | --- | --- | --- |
| `ingredient-ref-roasted-quinoa-flour` | `roasted quinoa flour` / `farine de quinoa torréfiée` | None | `FLOUR_AND_STARCH` |

Les Moulins de Soulanges, a Québec mill, lists `Roasted Quinoa Flour` and `Farine de Quinoa Torréfié` as a named functional flour in its English and French product pages and places the product in its range of heat-treated ingredients [S06–S08]. Use the grammatically agreeing French display `farine de quinoa torréfiée`, following the existing roasted corn and wheat flour records; do not add the source page's masculine `torréfié` spelling as an alias. Keep independent Québec French review pending. The available page supports the product name and category only; it does not provide a roasting specification or justify transferring the manufacturer's performance, nutrition, or health statements.

No bundled recipe line requests this product or any reviewed Hattai-ko, mugikogashi, roasted gram, roasted urid/mong, or toasted-flour term. The quinoa-flour identity is therefore a catalog coverage decision; it does not justify a recipe link or recipe edit.

Keep `hattai-ko` and `mugikogashi` off the existing `ingredient-ref-roasted-barley-flour` alias list. A new Maehara Seifun retail page now verifies one exact 100%-domestic-barley product sold under `はったい粉 (麦こがし)`, roasted and marketed as barley flour [S02]. This product can be understood as a source-specific instance of the existing roasted-barley-flour class. It does not make the regional names stable global aliases: Maehara's broader Japanese description says Hattai-ko variants also use naked barley, corn, or millet in different regions [S01], and another mill describes a barley/naked-barley Hattai-ko product [S03]. The established English alias `toasted barley flour` remains as accepted in the earlier boundary review [WP02-S144–S145]; this proposal does not revise it.

Keep the existing `ingredient-ref-chana-sattu` as the only reviewed roasted Bengal gram flour identity. FSSAI defines Chana Sattu from roasted *Cicer arietinum*; eNAM lists it separately from besan [WP02-S136–S137]. Do not broaden its exact aliases to `roasted gram flour`, `gram flour`, `besan`, or unqualified `sattu`. A Canadian Niru product page names `Urid Flour (Roasted)`, while OQLF identifies urd/black gram as *Vigna mungo*, distinct from mung/green gram (*Vigna radiata*) [S10–S11]. Hold roasted urid and Niru's less-specified `Roasted Mong Flour` for their own species, roast/milling, and Québec French review. Neither is a basis for changing chana sattu.

Keep the existing source-defined roasted barley, corn, and wheat flour identities, and the separate roasted wheat malt flour identity, unchanged. Hold roasted oat wording: Moulins de Soulanges labels the product `Pregelatinized Oat Flour` in one place, while the same page describes roasting and calls it `Roasted Oat Flour`; the product/process boundary is unclear [S06–S07]. Niru's Canadian manufacturer site also lists roasted red rice flour and roasted mung/mong flour products, but its red-rice page does not explain a roasting process, and the mong page does not identify the bean species or explain roasting [S12–S14]. Do not create aliases or identities from those incomplete boundaries in this batch.

No measurements, densities, forms, unit mappings, conversions, cooking yields, or substitutions are proposed for any item.

## Pre-integration audit snapshot

The read-only audit used the live split seed package, evidence ledger, legacy candidate file, and manifest-ordered bundled recipes. Hashes and counts below describe this workspace snapshot on 2026-10-10; other concurrent work may make them stale.

| Surface | Snapshot |
| --- | --- |
| Ingredient references | 753; SHA-256 `eaccfeb7fe5c4cf25dea4ad4d844bf6b2b3b41e7fc7bf9b0f01440b36a3fef5b` |
| Ingredient forms | 36; SHA-256 `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Research ledger | 958 records / 1,968 source entries / 1,590 distinct source IDs; SHA-256 `1be05afc4c8e4b8fd37ee0c87f73555489272e94b75f37e2eac3f320e8e095ef` |
| Legacy import candidates | 82; SHA-256 `60d389975134f8d31c57c66caa6375b4466c4c9614d399617a64365878d6aa5f` |
| Seed-package manifest | SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Live recipes | 114 recipes / 1,123 ingredient rows; manifest-ordered recipe-byte fingerprint `806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a` |

The proposed reference ID `ingredient-ref-roasted-quinoa-flour` was absent from the active references, forms, ledger record IDs, and legacy candidates. The source-ID prefix `WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-` had no collisions in the ledger before this proposal.

## Identity boundaries and recommendations

### Hattai-ko and mugikogashi

- The new Maehara SKU is a 120 g product titled `はったい粉(麦こがし) 120g 国内産大麦100％`. The Japanese product copy calls it domestic barley flour and says it is slowly roasted. This exact product fits the existing roasted-barley-flour ingredient class [S02].
- The manufacturer's broader Japanese product note says regional Hattai-ko products can use barley, naked barley, corn, or millet; all are roasted and ground. Its English rendering calls naked barley “rye,” so that translation is not relied on. NARO classifies naked barley as a barley type [S01, S05].
- Another manufacturer describes Hattai-ko as a flour from several types of roasted barley, specifically domestic naked barley and barley [S03]. This supports a barley-specific product from that manufacturer, not a universal definition for the regional name.
- MAFF regional meeting notes mention Hattai-ko and barley-kogashi as traditional roasted-grain foods but do not give a uniform cereal, milling grade, or product specification [S04].
- Keep both `hattai-ko` and `mugikogashi` unassigned in the global catalog. Do not create a duplicate barley identity or aliases that would route corn- or millet-based regional products to barley. A future recipe with a manufacturer, region, or explicit barley qualifier can be resolved from that line's own context.
- Québec wording remains source-specific: OQLF pairs the general term `farine d'orge` with `barley flour`, while the Québec mill supplies the existing roasted display `farine d'orge torréfiée` [S09, WP02-S123–S125]. Neither source establishes a Québec French term for Hattai-ko/mugikogashi as a whole.

### Roasted gram and related pulse flours

| Product wording | Current evidence and catalog boundary | Proposal |
| --- | --- | --- |
| Chana sattu / roasted Bengal gram flour | Existing `ingredient-ref-chana-sattu` has the source-backed aliases `roasted Bengal gram flour`, `roasted chickpea flour`, and `farine de pois chiches grillés`. FSSAI defines the product as roasted *Cicer arietinum* flour; eNAM lists it separately from chickpea flour/besan. Canadian listings also use `roasted gram flour` for a specific sattu product [WP02-S136–S140]. | Retain the existing row and exact aliases. Do not add the underspecified phrase `roasted gram flour`, unqualified `sattu`, `besan`, or `gram flour`. |
| Roasted urid flour | Niru Enterprise Inc. (Scarborough, Ontario) names `Urid Flour (Roasted)` and says it is finely milled and slow roasted. Its product description calls the pulse “lentils” without a botanical name. OQLF maps `urd` and `black gram` to *Vigna mungo* and notes the French common name `haricot mungo` can also refer to *Vigna radiata* [S10–S11]. | Keep as a distinct future candidate, not a chana-sattu alias. There is no settled Québec French flour name in the reviewed sources; do not use bare `haricot mungo` or `black gram flour` as a cross-species alias. |
| Roasted mong flour | Niru lists `Roasted Mong Flour` and describes it as a fine grain starch made from “mong beans,” without a botanical species or process details [S12]. OQLF documents that French `haricot mungo` spans *Vigna mungo* and *Vigna radiata* [S11]. | Hold. Confirm species and whether this is flour, starch, or a named regional flour product before assigning it to a base pulse identity. |
| Whole/split roasted gram | Roasted pulse grains and split roasted gram are not flour; the catalog's flour identity must not absorb them. A separate pulse identity/form decision belongs with WP03's candidate review. | No flour alias, form, or recipe link. |

This is an exact-name boundary audit rather than a claim that sattu is the only roasted pulse flour in world markets. The source evidence found distinct roasted urid/mong products; they remain unassigned because the product grain, French display, or preparation scope is incomplete, and no bundled recipe calls for them.

### Functional toasted flours

| Product | Current identity state | Recommendation |
| --- | --- | --- |
| Roasted barley flour / `farine d'orge torréfiée` | Existing `ingredient-ref-roasted-barley-flour`; accepted English alias `toasted barley flour` from the prior Eurogerm/Québec-mill comparison [WP02-S123–S125, WP02-S144–S145]. | Preserve. Do not generalize to Hattai-ko/mugikogashi or add a French alias. |
| Roasted corn flour / `farine de maïs torréfiée` | Existing `ingredient-ref-roasted-corn-flour`, distinct from `precooked corn flour` [WP02-S86–S89, WP02-S130–S131]. | Preserve. Do not alias `toasted corn flour` or precooked corn flour. |
| Roasted wheat flour / `farine de blé torréfiée` | Existing `ingredient-ref-roasted-wheat-flour`; separate from ordinary/malted wheat flour and roasted wheat malt flour [WP02-S114–S129]. | Preserve; no `toasted wheat flour` alias established here. |
| Roasted quinoa flour / `farine de quinoa torréfiée` | Moulins de Soulanges names this as a separate functional flour in English and French. Generic `quinoa flour / farine de quinoa` already exists; OQLF classifies quinoa as a pseudocereal, while the catalog already separates quinoa flour from whole/cooked quinoa [S06–S08, WP02-S25–S26, WP03-S5, WP03-S5-COOKED-5917, WP03-S14]. | Add the proposed identity-only reference. Keep it separate from generic quinoa flour and quinoa grain; no aliases. |
| Oat product | English/French navigation calls it pregelatinized oat flour, but the same manufacturer's descriptive text discusses roasting and refers to roasted oat flour [S06–S07]. | Hold both `pregelatinized oat flour` and `roasted oat flour` until the manufacturer clarifies its exact product/process. Do not infer equivalence between pregelatinization and roasting. |
| Roasted red/white rice flour | Niru's Canadian manufacturer pages/catalog list these names; the red-rice description states it is made from milled red rice but does not specify whether roasting is before or after milling. The product list, not a bilingual technical specification, names white-rice flour [S13–S14]. | Leave for a rice-flour-specific review; do not add process aliases to generic white/brown rice flour or whole red rice. |

Do not borrow the manufacturer's usage ideas or technical claims as a home-recipe substitution rule. For this proposal, the useful source statement is that a specifically named roasted-quinoa flour product exists, not how it performs in a formula.

## Recipe audit

All 114 live bundled recipe files were scanned in manifest order (1,123 ingredient rows). The focused ingredient-text audit searched English and French spellings for Hattai-ko/mugikogashi, chana sattu/roasted gram, roasted urid/mong, roasted quinoa/rice/barley/corn/wheat flours, and the corresponding French product phrases. **No focused recipe-line match was found.** No recipe line was changed.

The lack of recipe demand means there is no line to link to the proposed roasted-quinoa reference or to any held regional flour. It does not erase the manufacturer-defined product identity; a future line must still state enough grain/process context to choose it correctly.

## Exact phrase and collision audit

Exact normalized-name/alias checks covered active references and forms; legacy candidate names were checked separately. Accent-folded French queries use the app's current search normalization. “No exact match” below means the full phrase is not already stored as a reference or form term; broader one-word searches can still return related generic products.

| Exact query | Current reference/form match | Boundary |
| --- | --- | --- |
| `hattai-ko`, `mugikogashi`, `はったい粉`, `麦こがし` | None | Keep regionally variable names off roasted barley flour. |
| `roasted barley flour`, `toasted barley flour` | `ingredient-ref-roasted-barley-flour` | Existing shared class and accepted English alias; no change. |
| `barley flour` | `ingredient-ref-barley-flour` | Keep general flour separate from roasted flour. |
| `roasted gram flour` | None | Too broad for chana sattu; do not add it. |
| `roasted Bengal gram flour`, `roasted chickpea flour`, `farine de pois chiches grillés`, `farine de sattu` | `ingredient-ref-chana-sattu` | Existing specific roasted *Cicer arietinum* identity. |
| `chickpea flour`, `farine de pois chiche` | `ingredient-ref-chickpea-flour` | Generic chickpea flour/besan boundary remains separate from chana sattu. |
| `roasted urid flour`, `roasted black gram flour`, `roasted mong flour`, `roasted mung flour` | None | Do not map these to chana sattu or generic chickpea flour. |
| `roasted quinoa flour`, `farine de quinoa torréfiée` / `farine de quinoa torrefiee` | None | Proposed new reference. |
| `quinoa flour`, `farine de quinoa` | `ingredient-ref-quinoa-flour` | Keep generic quinoa flour separate from the proposed roasted product. |
| `roasted corn flour`, `roasted wheat flour` | `ingredient-ref-roasted-corn-flour`, `ingredient-ref-roasted-wheat-flour` | Existing exact identities. |
| `toasted corn flour`, `toasted wheat flour` | None | Do not infer aliases from the accepted barley-only toasted alias. |
| `roasted red rice flour`, `roasted white rice flour` | None | Hold pending a separate source and Québec naming review. |

No proposed reference ID, source ID, active alias, form term, or legacy candidate collision was found for the proposed roasted-quinoa identity. Broad ingredient queries such as `quinoa` or `barley` are expected to retrieve multiple distinct catalog identities; the complete phrases above disambiguate the product classes.

## Source register

New sources were accessed on 2026-10-10. IDs `S01`–`S14` below use the full prefix `WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-` (for example, `S01` is `WP02-HATTAI-KOGI-FUNCTIONAL-FLOUR-20261010-S01`). Prior WP02/WP03 source IDs are reused where noted. Claims are limited to the product names, species distinctions, processing words, and regional naming boundaries stated below.

- **S01 — Maehara Seifun, Hattai-ko product information:** [manufacturer page](https://gishi.co.jp/home/item.asp?ct=28). The Japanese text describes regional barley, naked-barley, corn, and millet variants and roasting/grinding. Do not use its English rendering of naked barley as “rye.”
- **S02 — Maehara Seifun, Hattai-ko 120 g, 100% domestic barley:** [official online shop product page](https://shop.gishi.co.jp/products/hattaiko-120g). The Japanese heading identifies `はったい粉(麦こがし)` and `国内産大麦100％`; product copy describes domestic barley flour that is slowly roasted. This supports one barley-based product instance, not a general regional alias.
- **S03 — Kojo Seifun, Hattai-ko:** [manufacturer product page](https://kojoseifun.co.jp/products/kinako/hattaiko/). Names Hattai-ko and lists domestic naked barley and barley as ingredients; no global processing or Québec French rule is inferred.
- **S04 — MAFF Chugoku-Shikoku regional bureau, barley/naked-barley meeting record:** [PDF, page 1](https://www.maff.go.jp/chushi/seisan/mugi/mugiproject/attach/pdf/event-19.pdf). Mentions Hattai-ko and barley-kogashi in a discussion of roasting/storage; it does not set one cereal or grind specification.
- **S05 — NARO, What is high beta-glucan barley?:** [classification pamphlet](https://www.naro.go.jp/publicity_report/publication/files/20180731nics_kind_pamph.pdf). Places naked barley within barley; used to interpret the Japanese-language source, not its erroneous English translation.
- **S06 — Les Moulins de Soulanges, Functional Ingredients (English):** [Québec manufacturer page](https://moulinsdesoulanges.com/language/en/functional-ingredients-2/). Introduces a range of heat-treated products and lists roasted barley, corn, wheat, and quinoa flours. The quinoa product appears under the exact name `Roasted Quinoa Flour`; manufacturer's health/performance statements are excluded.
- **S07 — Les Moulins de Soulanges, Ingrédients fonctionnels (français):** [Québec manufacturer page](https://moulinsdesoulanges.com/language/fr/ingredients-fonctionnels/). Lists `Farine de Quinoa Torréfié` in the same functional ingredient range and describes it as a flour product. Its title adjective agreement is not copied as a search alias.
- **S08 — Les Moulins de Soulanges, Farine de Quinoa Torréfié:** [French product page](https://moulinsdesoulanges.com/language/fr/farine-de-quinoa-torrefie/). Names the product, its breadmaking applications, and its exact French product wording. No roast temperature, duration, or transferable performance claim is given.
- **S09 — OQLF, farine d'orge:** [Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge). Pairs general `farine d'orge` with `barley flour`; does not define roasted barley flour or the Japanese names.
- **S10 — Niru Enterprise Inc., Urid Flour (Roasted):** [Canadian manufacturer's product page](https://niru.com/product/roasted-urid-flour/). Names a roasted, finely milled urid-flour product and gives the maker's Scarborough, Ontario address. Its description calls the base pulse “lentils” but supplies no Latin species name or French product name.
- **S11 — OQLF, haricot mungo / urd:** [Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo). Identifies urd/black gram with *Vigna mungo* and explains that the French common name `haricot mungo` is also used for *Vigna radiata*.
- **S12 — Niru Enterprise Inc., Roasted Mong Flour:** [Canadian manufacturer's product page](https://niru.com/product/roasted-mong-flour/). Names the product and calls it a fine grain starch from “mong beans”; no botanical identity or explicit roast/milling sequence is given.
- **S13 — Niru Enterprise Inc., Roasted Red Rice Flour:** [Canadian manufacturer's product page](https://niru.com/product/roasted-red-rice-flour/). Names the flour and red-rice base; the page does not explain the roast stage or give a French product name.
- **S14 — Niru Enterprise Inc., product list:** [manufacturer catalogue PDF](https://niru.com/wp-content/uploads/2013/11/Product-List-All-1.pdf), page 3. Lists roasted red and white rice flours, roasted mung/mong flour, and roasted urid flour as separate product names/SKUs. This older list supports item-name existence only.
- **WP02-S136–S140 — existing chana-sattu evidence:** FSSAI's roasted Bengal gram definition, eNAM's separate besan/sattu entries, and Canadian English/French product listings already recorded in `baking-flours-starches.md` and `chana-sattu-identity.md`.
- **WP02-S123–S125, WP02-S144–S145 — existing roasted-barley evidence:** Québec mill pages, OQLF's general barley-flour term, and Eurogerm's toasted-barley catalogue/specification already recorded in `baking-flours-starches.md` and `toasted-barley-boundary-review.md`.
- **WP02-S86–S89, WP02-S114–S131 — existing corn and wheat boundaries:** Source records for separate roasted corn/wheat products, precooked corn flour, roasted wheat malt flour, and the existing distinct rows.
- **WP02-S25–S26, WP03-S5, WP03-S5-COOKED-5917, WP03-S14 — existing quinoa boundary:** Canadian product labels for ordinary quinoa flour and the separate generic quinoa / cooked-form identity.

## Integration checklist proposal

If accepted, add only the identity-only `ingredient-ref-roasted-quinoa-flour` row described above, with no aliases or numerical data. Keep its English and French source-specific names tied to the Québec manufacturer and leave independent Québec French review open. No recipe line is eligible for relinking. Keep Hattai-ko/mugikogashi, roasted urid/mong, the conflicting oat flour labels, and Niru's rice-flour listings unresolved; broader B6 and independent terminology review remain open.
