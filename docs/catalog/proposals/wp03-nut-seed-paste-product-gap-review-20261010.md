# WP03 Section I — nut, seed butter, paste, and filling product gap review

- **Reviewed:** 2026-10-10
- **Status:** Root integration complete on 2026-10-10; this proposal records the reviewed dispositions.
- **Scope:** Remaining nut/seed butter, paste, purée, and filling product boundaries after the existing WP03 kernel and seed reviews. This review does not close Section I.
- **Method:** Read `AGENTS.md`, `Requirements.md`, Section I and the current plan progress, the live split seed package, ingredient forms, research ledger, legacy candidates, the 114-recipe corpus, and related tree-nut, coconut, sesame/tahini, candlenut, egusi, seed-kernel, flax/hemp/poppy, pumpkin, sunflower, lotus, and makhana reviews. Checked product identities and French-market terminology against OQLF, Canadian food makers and distributors, Canadian product listings, Codex, and European Commission sources.

## Recommendation

Add distinct identity-only rows for eight single-species nut/seed butters, plain chestnut purée, sweetened chestnut spread, and poppy-seed filling. The butter names describe ground products with their own culinary use and sometimes added ingredients; they are not forms of the corresponding whole nut or seed. Keep the chestnut purée separate from the sweeter ready-to-spread chestnut product, and keep poppy-seed filling separate from the poppy-seed identity.

| Proposed stable ID | English display | Provisional fr-CA display | Alias recommendation | Category | Disposition |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-cashew-butter` | `cashew butter` | `beurre de noix de cajou` | FR: `beurre de cajous` | `FAT_AND_OIL` | Add. NTY uses `beurre de cajous`; Canadian product-goods wording also uses `beurre de noix de cajou`. One Canadian maker’s butter includes sunflower oil, so do not define a universal ingredient formula. [S04–S06, S13] |
| `ingredient-ref-macadamia-butter` | `macadamia butter` | `beurre de macadamia` | None | `FAT_AND_OIL` | Add. Québec-market catalog and Canadian product pages support the name. A reviewed NTY product is dry-roasted macadamias only; keep that formulation source-specific. [S04, S07, S13] |
| `ingredient-ref-walnut-butter` | `walnut butter` | `beurre de noix de Grenoble` | None | `FAT_AND_OIL` | Add. Québec producer evidence uses the qualified walnut name; the product reviewed is raw/activated, but that qualifier does not define the unqualified identity. [S10, S13] |
| `ingredient-ref-pecan-butter` | `pecan butter` | `beurre de pacanes` | None | `FAT_AND_OIL` | Add. A Canadian maker sells pure dry-roasted pecan butter; a Québec maker uses the French phrase for a pecan-and-almond blend sweetened with maple sugar. The French name is supported, but its formula is not universal. [S01, S11–S13] |
| `ingredient-ref-pine-nut-butter` | `pine nut butter` | `beurre de pignon de pin` | None; French display remains provisional | `FAT_AND_OIL` | Add. Canadian makers sell 100% pine-nut butter. OQLF supports `pignon` as a food term; the exact French compound was located on a Canadian marketplace listing, so have Québec wording independently reviewed before activation. [S03, S14–S16] |
| `ingredient-ref-brazil-nut-butter` | `Brazil nut butter` | `beurre de noix du Brésil` | None | `FAT_AND_OIL` | Add. Canadian and Montréal-market products establish the product class and French wording. Reviewed formulas include both a Montreal maker’s roasted-nut spread and a current Canadian product made only from dry-roasted nuts. [S13, S17–S19] |
| `ingredient-ref-pumpkin-seed-butter` | `pumpkin seed butter` | `beurre de graines de citrouille` | None | `FAT_AND_OIL` | Add. NTY sells a product made from dry-roasted Canadian pumpkin seeds; its Québec French catalog uses the proposed name. Keep `pepitas`, whole seeds, and kernel-state terms separate as the earlier seed review decided. [S04, S08] |
| `ingredient-ref-sunflower-seed-butter` | `sunflower seed butter` | `beurre de graines de tournesol` | None | `FAT_AND_OIL` | Add. NTY sells dry-roasted Canadian seeds with sunflower oil; its Québec French catalog uses the proposed name. Keep sunflower kernels and whole-seed identity separate. [S04, S09] |
| `ingredient-ref-chestnut-puree` | `chestnut puree` | `purée de marrons` | Accent folding makes English spellings searchable; no extra alias needed | `NUT_SEED_AND_DRIED_FRUIT` | Add as a product identity. Codex covers sweetened and unsweetened canned chestnut purée styles; a Canadian supplier labels a non-sweetened product `purée de marrons non sucrée`. Keep the sugar-style qualifier on the product/recipe line; do not create style forms without recipe need. [S02, S24–S25] |
| `ingredient-ref-sweetened-chestnut-spread` | `sweetened chestnut spread` | `pâte à tartiner aux marrons sucrée` | FR: `crème de marrons` | `NUT_SEED_AND_DRIED_FRUIT` | Add separately from purée. A Canadian supplier lists the exact spread name; its Faugier product and the maker’s own page show a sweet product based on chestnuts, sugar, candied chestnuts/syrup, and vanilla. Do not use it as an alias of plain purée or whole marrons. [S02, S25–S27] |
| `ingredient-ref-poppy-seed-filling` | `poppy seed filling` | `garniture aux graines de pavot` | FR: `garniture de graines de pavot` | `BAKING_MIXIN_AND_PANTRY` | Add as a composite baking product, separate from poppy seeds. A Commission recommendation describes ground seeds, sugar, water or milk, and optional ingredients; a protected-product specification uses the proposed French phrase. Do not alias `poppy seed paste` or `poppy butter` on the evidence of one Canadian retailer’s product. [S21–S23] |

The names above are source-backed category recommendations, not universal ingredient declarations. Record added oil, sugar, salt, stabilizer, seed/nut roast, and texture only when a particular package or recipe specifies them. Keep such wording on the source-specific product/recipe line; do not add general `pure`, `raw`, `roasted`, `smooth`, `crunchy`, or `unsweetened` aliases or forms here.

## Holds and overlap decisions

| Candidate or current identity | Decision | Reason and next action |
| --- | --- | --- |
| Pistachio butter | **Hold; do not add as an alias of current `ingredient-ref-pistachio-paste`, and do not add a new row yet.** | A Canadian manufacturer sells pure pistachio butter. Another manufacturer distinguishes its pistachio paste and butter by grind fineness and viscosity, while both are made only from pistachios. The active paste has two recipe rows but no reviewed composition source. Review those exact recipe lines and the active paste’s intended scope before deciding whether butter is a separate identity, a product style, or a synonym in the project’s usage. Sweetened pistachio creams with added fats/sugars are separate products again. [S32–S34] |
| Hemp-seed butter | **Hold.** | A Québec maker calls its product raw/pregerminated hemp-seed butter, but the page does not say whether the seeds are hulled. Do not attach it to the current hulled `ingredient-ref-hemp-hearts`, and do not assume it represents whole hemp seeds. Revisit when the product’s hull state and ingredient scope are explicit. [S20] |
| Sesame butter, sesame paste, black sesame paste | **No addition in this batch.** | The existing sesame/tahini review keeps `ingredient-ref-tahini` distinct from generic sesame paste/butter wording and holds black sesame paste pending a composition source. Preserve that decision; do not duplicate its research. [WP03 sesame/tahini review] |
| Coconut butter | **No addition in this batch.** | The coconut-products review already proposes the separate coconut-butter row and French wording. Carry that proposal forward once; do not create a duplicate. [WP03 coconut-products review] |
| Almond, hazelnut, peanut butter; almond and pistachio paste; praline paste | **Keep existing identities.** | The active seed already separates these products. Almond, hazelnut, and peanut butters are used in current recipes; current almond/pistachio paste rows remain distinct. Do not create product duplicates or merge praline paste into a nut butter. [WP03 tree-nut review; current seed audit below] |
| Mixed nut/seed butters | **Hold; no generic row or blend IDs.** | Canadian products demonstrate that blends exist, but formulas vary across nuts, seeds, coconut, sugar, oils, salt, and texture. No bundled recipe requests a defined blend. Preserve a named blend on its own source/recipe line if one is encountered; do not make a global `mixed nut butter` crosswalk. [S04, S12] |
| Candlenut, egusi/watermelon, flax/hemp/poppy, pumpkin/sunflower, lotus/makhana | **No duplicate identity work.** | Earlier proposals and current package records already handle or hold these seed identities and their boundaries. Keep candlenut out of active references pending safe food-grade processing evidence; keep egusi separate from dried watermelon kernels, and whole hemp seed separate from hemp hearts. [WP03 related reviews listed in “Audit basis”] |

The plan text still has a broad unchecked seed-coverage line naming chia even though the current package contains `ingredient-ref-chia-seeds`. Do not create a duplicate chia row; the coordinator should reconcile that plan checkpoint against the live package when updating progress. Whole hemp seed remains a separate unresolved product, while the new Québec hemp-butter product does not resolve its hull state.

## Product boundaries: identity, form, and recipe wording

- A single-species nut/seed butter is a distinct processed product identity, not a `ground` or `roasted` form of its whole-kernel reference. The makers reviewed do not even agree on a single formula: cashew butter may add sunflower oil; some macadamia, pumpkin-seed, pecan, pine-nut, and Brazil-nut butters are seed/nut only; sunflower butter may add sunflower oil; and a local maple pecan product contains almonds, coconut, maple sugar, and salt. These are product-specific formulations, not global definitions. [S05, S07–S12, S14–S18]
- Smooth/crunchy, raw/roasted, salted/unsalted, and sweetened/unsweetened wording describes a package or a recipe request. It does not justify a product-by-product form matrix in the absence of recipe demand. Do not infer that the whole kernels were roasted because a particular butter maker roasts its input.
- Chestnut purée and sweetened chestnut spread differ in intended product composition. Codex’s canned purée standard distinguishes sweetened and unsweetened styles while limiting sugar in canned purée; Faugier’s `crème de marrons` is a substantially sweet spread containing chestnuts, sugar, and candied chestnuts. It is not simply the `sweetened` style of canned purée. [S24–S27]
- Poppy-seed filling is a composite preparation containing ground seeds and sweeteners/liquid, often with optional flour, crumbs, spices, fruit, or other ingredients. It is not a form of plain poppy seeds, and a ground-only poppy paste is not guaranteed to have the same composition. [S21–S23]
- Keep whole/chopped/sliced/slivered/ground/blanched and other preparation wording with the recipe line unless an independently useful, source-supported form is demanded. Do not map kernel-to-butter, seed-to-filling, or whole-to-ground product states as conversions.
- Internal categories group catalog products; `NUT_SEED_AND_DRIED_FRUIT`, `FAT_AND_OIL`, and `BAKING_MIXIN_AND_PANTRY` are not botanical, allergen, safety, or formula claims.

## Live catalog and recipe audit

Snapshot read on **2026-10-10**. The shared working tree has changed across WP03 passes, so these counts and hashes describe this review’s read point; the coordinator should rerun owner and recipe checks before integrating any proposal.

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 719 references | `8fd20068788d49cf51b2dd07c031468865f83cfb848e6c8bf9f7c77baaa548ea` |
| `ingredient-forms.v1.json` | 34 forms | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `legacy-import-identities.v1.json` | 84 candidates | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| `research-ledger.v1.json` | 908 records | `557409149c96c35c704b64640222ff0bda7f8362efc459a389bf9ec43d8bca6a` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe-set fingerprint | 114 files / 1,123 ingredient rows | `83daad2b3cab9782f079d0e976b7493a23899676ef18185c0b98d4225d860695` |

The recipe fingerprint hashes each manifest-relative path, a NUL byte, that file’s SHA-256 digest bytes, and a newline, in manifest order. All 114 manifest recipe files were present. The full ingredient-row scan found these existing butter/paste uses:

| Active identity | Rows | Recipe positions (`recipe prefix#ingredient array index`) |
| --- | ---: | --- |
| `ingredient-ref-peanut-butter` | 7 | `001#9`, `020#10`, `022#1`, `031#5`, `067#3`, `090#2`, `095#11` |
| `ingredient-ref-almond-butter` | 3 | `031#9`, `040#4`, `070#14` |
| `ingredient-ref-hazelnut-butter` | 1 | `031#7` |
| `ingredient-ref-almond-paste` | 2 | `003#1`, `011#6` |
| `ingredient-ref-pistachio-paste` | 2 | `056#7`, `056#16` |

No bundled ingredient row requests any proposed butter, chestnut purée/spread, poppy-seed filling, or held pistachio/hemp butter. No recipe links are proposed in this packet. The product pages’ recipes and manufacturer substitution statements below are external-source evidence, not bundled-recipe demand.

The current seed rows for almond butter, hazelnut butter, peanut butter, almond paste, pistachio paste, praline paste, and tahini have no non-null density and empty unit mappings. There is no candidate nut/seed butter/paste form in the 34-form file. The candidate phrases have no exact normalized owner among active reference names/aliases, forms, or legacy candidates, except the intentionally existing `pistachio paste` and `tahini` owners. The source ledger was reviewed for related product evidence; no candidate butter or filling identity is ready to merge directly from ledger data.

### Search collisions and false matches

The app’s normalized search folds accents, punctuation, case, and ligatures, then uses phrase/substring matching. A unique qualified display can therefore share query results with its source nut/seed; this is expected. Keep product names qualified and do not add bare source names as butter aliases.

| Query or phrase family | Existing owner / likely collision | Recommendation |
| --- | --- | --- |
| `cashew` / `noix de cajou` | Current whole-cashew identity; qualified butter phrases have no exact owner. | Keep whole cashews and cashew butter distinct. Never alias bare `noix de cajou` to butter. |
| `macadamia` | Current macadamia-kernel identity; qualified butter phrase has no exact owner. | Add only the butter-qualified name. |
| `walnut`, `noix de Grenoble` | Current walnut-kernel identity; phrase can also retrieve the proposed butter. | Keep the qualified kernel and butter product names separate; do not use bare `noix`. |
| `pecan`, `pacane(s)` | Current pecan-kernel identity owns the short names; the proposed `beurre de pacanes` key is distinct. | Keep the product qualifier. Do not use `pacane(s)` as an alias for the butter. |
| `pine nut`, `pignon`, `noix de pin` | Current pine-nut kernel identity owns qualified kernel names; `pignon` may be a broader phrase match. | Keep `pine nut butter` and the provisional `beurre de pignon de pin` qualified. |
| `Brazil nut`, `noix du Brésil` | Current Brazil-nut kernel identity owns the short names; proposed butter phrase is distinct. | Keep bare product words on the kernel identity. |
| `pumpkin seed`, `graines de citrouille` | Current pumpkin/squash-seed identity owns seed names. | Add butter-qualified term only; preserve the earlier exclusion of `pepitas` and `graines de courge` as general aliases. |
| `sunflower seed`, `graines de tournesol` | Current sunflower-seed identity owns seed names. | Add butter-qualified term only; keep kernels and seed identity distinct. |
| `chestnut`, `marron(s)`, `châtaigne(s)` | Whole sweet chestnuts, chestnut flour, and water chestnut can appear in partial search; `marrons` is already the whole sweet-chestnut name. | Use `chestnut purée` and `sweetened chestnut spread` as full product names. Do not alias bare `chestnut`, `marron`, or `châtaigne`; use `purée de marrons` only for the purée product. |
| `poppy seed`, `graines de pavot` | Current poppy-seed identity owns these base terms; the longer filling phrases have no exact owner. | Keep the product-qualified filling name; do not alias the seed row to a ready-made filling. |
| `hemp seed`, `graines de chanvre` | Current row is specifically hulled hemp hearts, displayed as `graines de chanvre décortiquées`; substring search can return it for broad seed wording. | Do not use `hemp seed butter` or unqualified `graines de chanvre` as aliases for hemp hearts. Keep hull state explicit if a future butter identity is sourced. |
| `pistachio`, `pistache` | Current whole-pistachio row and active `pistachio paste` may both appear in phrase search. | Keep existing paste intact; defer butter until its boundary is reviewed. |
| `sesame butter/paste`, `tahini`; `coconut butter` | Already considered by sesame/tahini and coconut-product reviews. | Preserve their prior dispositions; do not introduce duplicate identities or broad cross-aliases. |

Search findings are not alias recommendations. Re-run the exact normalized-key and recipe search at integration because the catalog is being updated in parallel.

## Measurement and substitution evidence

No reviewed source supports a transferable density, cup/spoon-to-mass mapping, count weight, package yield, or nut/seed-to-butter yield for any candidate. Package net weights and nutrition-panel portion sizes are label-specific; Codex Brix values describe purée quality/style, not kitchen volume. Keep proposed butter, purée, spread, and filling `defaultDensity` null and `unitMappings` empty. Do not convert recipe amounts or infer a source-kernel-to-paste ratio. Use `not_yet_researched` for general measurements unless the coordinator stores a tightly qualified observation for a specific package or source.

Some Canadian-maker recipes do provide narrow, directed alternatives. Preserve them as source-specific context; none justifies a general rule:

- NTY’s dairy-free herb-and-garlic cream-cheese recipe uses **¼ cup sunflower-seed butter** and says cashew butter is a good alternative in that blended tofu spread. Its French page names `beurre de graines de tournesol` and `beurre de cajous`. [S29]
- NTY’s baked vegan mac-and-cheese recipe calls for **⅔ cup cashew or “Macadamia Cashew Butter.”** The second option is a cashew/macadamia blend, not evidence that macadamia-only butter has the same role. [S30]
- NTY’s spinach-and-artichoke dip uses **½ cup cashew butter** and says its named Macadamia Cashew Butter also works. Again, this is a compound blend in one dip. [S31]
- NTY’s Green Goddess tahini dressing permits **¼ cup tahini, sunflower-seed butter, or pumpkin-seed butter** in that herb dressing. It is not a general conversion from tahini or a blanket substitution among seed butters. [S35]

No rule is proposed. Record any such claim only with source, direction, recipe role, exact source amount where given, and the blend/formulation caveat. Keep current and candidate substitution states distinct from an assertion that no substitute exists.

## Audit basis and related proposals

The live Section I checklist already has separate reviews for whole tree nuts/peanuts, sesame/tahini, coconut products, flax/hemp/poppy seeds, pumpkin/sunflower kernels, egusi/watermelon products, makhana, sacred lotus, and candlenut. This review adds only the processed-product gap decisions above. It does not re-open source claims or integration results from those packets.

- [Tree-nut and peanut checklist review](wp03-tree-nuts-coordinator-review-20261009.md)
- [Sesame/tahini boundary review](wp03-sesame-tahini-boundary-review-20261009.md)
- [Coconut-products review](wp03-coconut-products-coordinator-review-20261009.md)
- [Candlenut/kemiri boundary review](wp03-candlenut-kemiri-boundary-review-20261009.md)
- [Egusi and dried-watermelon-seed review](wp03-egusi-melon-seeds-identity-review-20261009.md)
- [Flax, hemp hearts, and poppy-seed gap review](wp03-flax-hemp-poppy-seed-gap-review-20261010.md)
- [Pumpkin seed and pepitas boundary review](wp03-pumpkin-seeds-pepitas-boundary-review-20261010.md)
- [Sunflower-seed kernel boundary review](wp03-sunflower-seed-kernel-boundary-review-20261010.md)
- [Sacred-lotus-seed/fox-nut boundary review](wp03-lotus-seed-fox-nut-boundary-review-20261010.md)
- [Makhana identity review](wp03-makhana-fox-nut-identity-20261009.md)

## Source-to-claim map

All web pages were accessed 2026-10-10. IDs are local to this proposal and have not been added to the shared research ledger.

| ID | Source and locator | Claim supported and limits |
| --- | --- | --- |
| **WP03-PASTE-PRODUCT-20261010-S01** | Office québécois de la langue française, [GDT: noix de pacane](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083802/noix-de-pacane) | Preferred Québec/Canada terms `pacane` and `noix de pacane`, English pecan. Supports the kernel’s French name, not a pecan-butter formula or product label. |
| **WP03-PASTE-PRODUCT-20261010-S02** | OQLF, [GDT: marron](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2295692/marron) | Identifies `marron` as the usual edible fruit name of cultivated sweet chestnut, *Castanea sativa*; lists `sweet chestnut` and `chestnut`. It does not define purée or spread products. |
| **WP03-PASTE-PRODUCT-20261010-S03** | OQLF, [GDT: pignon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon) | Food term `pignon`, with `pigne` and `noix de pin`, and English pine seed/nut. It does not prescribe a butter name; the proposed French compound remains provisional. |
| **WP03-PASTE-PRODUCT-20261010-S04** | Nuts to You, [Nos beurres](https://nutstoyou.ca/fr/nos-beurres/) | Québec French maker catalog lists `beurre de cajous`, `beurre de macadamia`, `beurre de graines de citrouille`, and `beurre de graines de tournesol` among separately named butters and blends. Listing establishes market terms, not one universal formula. |
| **WP03-PASTE-PRODUCT-20261010-S05** | Nuts to You, [Cashew Butter Smooth](https://nutstoyou.ca/products/cashew-butter-smooth/) | Canadian product ingredients are dry-roasted cashews and sunflower oil; product is made in Canada of imported ingredients. Product-specific formula only. |
| **WP03-PASTE-PRODUCT-20261010-S06** | Nuts to You, [Beurre de cajous crémeux](https://nutstoyou.ca/fr/products/beurre-de-cajous-cremeux/) | Québec French product page uses the alias `beurre de cajous` and confirms a formulation with dry-roasted cashews and sunflower oil. It is one product, not a universal formula or a terminology ruling. |
| **WP03-PASTE-PRODUCT-20261010-S07** | Nuts to You, [Macadamia Butter Smooth](https://nutstoyou.ca/products/macadamia-butter-smooth/) | A Canadian maker sells dry-roasted macadamias under the product identity; that formula and process are source-specific. |
| **WP03-PASTE-PRODUCT-20261010-S08** | Nuts to You, [Pumpkin Seed Butter Smooth](https://nutstoyou.ca/products/pumpkin-seed-butter-smooth/) | Canadian maker lists dry-roasted Canadian pumpkin seeds as the ingredient and calls it pumpkin-seed butter. Does not establish a recipe conversion. |
| **WP03-PASTE-PRODUCT-20261010-S09** | Nuts to You, [Sunflower Seed Butter Smooth](https://nutstoyou.ca/products/sunflower-seed-butter/) | Canadian maker lists dry-roasted Canadian sunflower seeds and sunflower oil. This formula is not universal. |
| **WP03-PASTE-PRODUCT-20261010-S10** | Cru Nature, [Beurre de noix de Grenoble crues](https://crunature.com/products/beurre-de-noix-de-grenoble-crues); Aliments du Québec, [product listing](https://alimentsduquebec.com/aliments-dici/collation/beurre-de-noix-de-grenoble-crues) | Québec-market term for a raw/activated walnut butter product. Supports the qualified source-plant phrase and a distinct product; does not imply the general identity is raw. |
| **WP03-PASTE-PRODUCT-20261010-S11** | Balsam Tahini, [Pecan Butter Spread](https://balsamtahini.com/products/pecan-butter) | Canadian maker states 100% dry-roasted pecans, no added oils/sugars/emulsifiers. Establishes one pure pecan-butter product and English label only. |
| **WP03-PASTE-PRODUCT-20261010-S12** | Les Minettes, Québec, [Beurre de pacanes + érable](https://lesminettes.ca/collections/cadeaux-de-profs/products/beurre-de-pacanes-erable) | Québec product label uses `beurre de pacanes`; ingredients include pecans, almonds, maple sugar, coconut, and salt. Supports French product naming but proves formulations vary. |
| **WP03-PASTE-PRODUCT-20261010-S13** | Canadian Intellectual Property Office, [Trade-marks Journal, Vol. 69 No. 3509 (French)](https://publications.gc.ca/collections/collection_2022/opic-cipo/RG42-2-69-3509-fra.pdf) | Canadian goods-description examples include `beurre de noix de cajou`, `beurre de noix de Grenoble`, `beurre de pacane`, `beurre de noix du Brésil`, `beurre de pistache`, and `beurre de noix de macadamia`. This is applicant product-goods language published in an official journal, not an OQLF terminology ruling or composition standard. |
| **WP03-PASTE-PRODUCT-20261010-S14** | Balsam Tahini, [Pine Nut Butter Spread](https://balsamtahini.com/products/pine-nut-butter) | Canadian maker states product is 100% dry-roasted pine nuts, without added oils, sugars, or emulsifiers. Supports the product identity and one product formula, not French wording. |
| **WP03-PASTE-PRODUCT-20261010-S15** | NutJar, [Pine Nut Butter](https://www.nutjar.ca/products/pine-nut-butter) | Canadian product page describes pine-nut butter made from dry-roasted pine nuts. Product-specific corroboration. |
| **WP03-PASTE-PRODUCT-20261010-S16** | Walmart Canada, [Beurre de pignon de pin product listing](https://www.walmart.ca/en/ip/Balsam-Natural-Pine-Nut-Butter-310g/5H6ZRGG4G8DK) | Marketplace title uses exact French phrase. Seller/marketplace listing is weaker language evidence than a Québec maker or OQLF; keep the French display provisional. |
| **WP03-PASTE-PRODUCT-20261010-S17** | Ezra Cohen Montreal, [Brazil Nut Butter](https://ezracohenmontreal.ca/brazil-nut-butter-from-ezra-cohen-montreal/) | Montréal brand page identifies a roasted Brazil-nut spread. It supports Québec-market product demand/name context, not current availability or an additive-free formula. |
| **WP03-PASTE-PRODUCT-20261010-S18** | Balsam Tahini, [Brazil Nut Butter](https://balsamtahini.com/products/brazil-nut-butter) | Canadian maker states 100% dry-roasted Brazil nuts, without added oils, sugars, or emulsifiers. Product-specific formula. |
| **WP03-PASTE-PRODUCT-20261010-S19** | Bassé, [Beurre de noix du Brésil](https://bassenuts.com/fr/recette-beurre-de-noix-du-bresil/) | French Canadian recipe/product copy provides the French phrase for Brazil-nut butter. Recipe copy is naming evidence, not a universal ingredient declaration. |
| **WP03-PASTE-PRODUCT-20261010-S20** | Cru Nature, [Beurre de graines de chanvre crues](https://crunature.com/products/beurre-de-graines-de-chanvre-crues) | Québec maker describes a raw/pregerminated-seed product, but does not state hull status. This limitation is why no identity/alias is proposed. |
| **WP03-PASTE-PRODUCT-20261010-S21** | NewMarket Natural Foods, [Poppy Seed Paste (Frozen)](https://newmarketnaturalfoods.ca/products/poppy-seed-paste-butter-1) | Canadian retailer says its item is also called poppy butter/filling and lists sugar, water, poppy seeds, corn syrup, and minor ingredients. One product only; does not justify globally aliasing all three terms or imply a standard formulation. |
| **WP03-PASTE-PRODUCT-20261010-S22** | European Commission, [Recommendation 2014/662/EU, French text](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A32014H0662) | Describes poppy-seed filling as ground seeds with sugar and water or milk, optionally other ingredients and spices. Supports the composite-product boundary; it is not a standardized commercial recipe or Canadian label. |
| **WP03-PASTE-PRODUCT-20261010-S23** | European Commission, [Valašský frgál protected-geographical-indication specification (French)](https://eur-lex.europa.eu/legal-content/FR/TXT/?qid=1774460087676&uri=CELEX%3A52022XC0325%2801%29) | Uses `garniture aux graines de pavot` and lists a local filling formula. Supports the proposed French product phrase in a specific protected cake context, not a Québec standard. |
| **WP03-PASTE-PRODUCT-20261010-S24** | FAO/WHO Codex, [CXS 145-1985: Canned Chestnuts and Chestnut Purée](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ru/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B145-1985%252FCXS_145e.pdf) | Defines canned chestnut purée styles, sweetened and unsweetened, and composition/quality requirements. Brix and added-sugar provisions are product-standard information, not a kitchen measure, density, or conversion. |
| **WP03-PASTE-PRODUCT-20261010-S25** | Qualifirst, Canadian supplier, [Chestnut Products](https://www.qualifirst.com/fr_CA/food/chestnut_products) | Lists `purée de marrons non sucrée en boîte` and `pâte à tartiner aux marrons sucrée` as distinct Faugier products. Supports Canadian French-market names and product separation; supplier listing is not a terminology authority. |
| **WP03-PASTE-PRODUCT-20261010-S26** | Qualifirst, [Sweetened Chestnut Spread product page](https://odoo.qualifirst.com/fr_CA/food/chestnut_products/chestnut-spread-sweetened-tinned-xxl) | French product description lists chestnuts, sugar, candied chestnuts/syrup, water, and vanilla. Supports the specific ready-to-spread product, not the composition of all chestnut spreads. |
| **WP03-PASTE-PRODUCT-20261010-S27** | Clément Faugier, maker, [Crème de Marrons](https://www.clementfaugier.fr/fr/detail_produit?produit=40) | Official maker page lists chestnuts (50%), sugar, candied chestnuts with glucose syrup, and vanilla. Supports `crème de marrons` as an alias for this sweetened product class; not for plain purée. |
| **WP03-PASTE-PRODUCT-20261010-S28** | OQLF, [GDT: graine de pavot](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095300/graine-de-pavot) | Supports the Québec food-seed name `graine de pavot / poppy seed`; it names the seed, not prepared filling. |
| **WP03-PASTE-PRODUCT-20261010-S29** | Nuts to You, [Dairy-Free Herb & Garlic Cream Cheese (French)](https://nutstoyou.ca/fr/fromage-a-la-creme-herbes-et-ail-sans-produits-laitiers/) | One blended tofu spread uses ¼ cup sunflower-seed butter and states cashew butter is a good substitute. Source-specific direction, role, amount, and recipe only. |
| **WP03-PASTE-PRODUCT-20261010-S30** | Nuts to You, [Easy Baked Vegan Mac and Cheese](https://nutstoyou.ca/easy-baked-vegan-mac-and-cheese/) | One sauce recipe gives ⅔ cup cashew or the cashew/macadamia blend named `Macadamia Cashew Butter`; not evidence for macadamia-only butter as an equivalent. |
| **WP03-PASTE-PRODUCT-20261010-S31** | Nuts to You, [Vegan Spinach and Artichoke Dip](https://nutstoyou.ca/vegan-spinach-and-artichoke-dip/) | One dip uses ½ cup cashew butter and accepts the named Macadamia Cashew Butter; the latter is a blend and the evidence is role-specific. |
| **WP03-PASTE-PRODUCT-20261010-S32** | Nuts to You, [Pistachio Butter Smooth](https://nutstoyou.ca/products/pistachio-butter-smooth/) | Canadian product page identifies a dry-roasted-pistachio butter. It establishes a product exists but not whether to merge it with the active paste identity. |
| **WP03-PASTE-PRODUCT-20261010-S33** | The Pistachio Factory, [FAQ](https://pistachiofactory.com/pages/faq) | One manufacturer distinguishes its paste and butter by grind fineness/viscosity while both are pistachio products. Supports holding the equivalence decision for review; not a universal definition. |
| **WP03-PASTE-PRODUCT-20261010-S34** | The Pistachio Factory, [Pure Pistachio Paste](https://pistachiofactory.com/products/pistachio-paste) | Its paste is roasted pistachios only. This is one product formula and does not tell us the current active row’s intended scope. |
| **WP03-PASTE-PRODUCT-20261010-S35** | Nuts to You, [Green Goddess Tahini Dressing](https://nutstoyou.ca/green-goddess-tahini-dressing/) | One dressing allows ¼ cup tahini, sunflower-seed butter, or pumpkin-seed butter. This is not a universal unit conversion or global substitute rule. |

## Root integration result

The coordinator reviewed the live catalog and cited product/terminology sources, then integrated all eleven proposed identity-only rows into the canonical references and research ledger. Stable IDs match the proposal. Search remains qualified by product names. The cashew-butter row keeps the Quebec-maker alias `beurre de cajous`; the sweetened chestnut-spread row alone carries `crème de marrons`; the poppy-filling row keeps both directly sourced French phrase variants. All new rows have null densities and empty unit mappings; no forms, package yields, recipe links, conversions, or substitution rules were added.

`beurre de pignon de pin` remains provisional because the exact product phrase is attested by a Canadian marketplace listing while OQLF supports only the component food term `pignon`. Independent Québec terminology review remains open. Pistachio butter remains held for comparison with the current pistachio-paste recipe uses and scope; hemp-seed butter remains held because hull state is unspecified. Existing coconut, sesame/tahini, candlenut, and other kernel dispositions were not duplicated.

The source records and accepted identity decisions use the `WP03-PASTE-PRODUCT-20261010` source IDs. Package verification and Pixel picker QA are tracked in the WP03 Section I checkpoint in `docs/RecipeBook-global-ingredient-catalog-plan.txt` and the companion batch README.

**Coordinator disposition:** integrate the eleven source-bounded product identities as above; preserve the holds and existing rows; add no forms, measurements, densities, mappings, package yields, recipe links, conversions, or substitution rules from this packet. Keep Section I open.
