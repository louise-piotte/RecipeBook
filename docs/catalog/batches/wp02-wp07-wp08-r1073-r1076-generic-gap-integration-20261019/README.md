# WP02/WP07/WP08 R1073–R1076 generic ingredient integration

## Integrated findings

- **R1073 — Defatted wheat bran.** Added identity-only `ingredient-ref-defatted-wheat-bran` (`defatted wheat bran / son de blé dégraissé`) after two primary human-food biscuit studies independently named defatted wheat bran. The French compound remains descriptive and provisional. Study-specific extraction procedures, particle preparation, formulas, and outcomes were not generalized. No aliases, forms, measures, recipe links, conversions, yields, or active substitutions were added.
- **R1074 — Almond portions.** Added USDA SR28 source-qualified `portion_weight` observations for unroasted whole (1 cup = 143 g), sliced (1 cup = 92 g), and slivered almonds (1 cup = 108 g). Skin state and cup-filling method remain unspecified; the source-native cup is retained. Health Canada's shape-unspecified 2008 portion was not transferred to these forms. Density fields remain null, unit mappings empty, and no new form, mL conversion, count weight, or yield was added. Existing almond-flour product observations were preserved without transfer.
- **R1075 — Beef broth to water.** Recorded water as a same-slot option for beef broth in Ricardo's *Classic Beef Chili* only, at the recipe's 1/4 cup (60 ml). The finding stays on the generic beef-broth ledger record with source-specific context. No active rule or recipe-line link was added because the current resolver cannot enforce the named-recipe boundary; no transfer to other linked recipes or other broths was made.
- **R1076 — Pork dry rub.** Added generic `ingredient-ref-pork-dry-rub` (`pork dry rub / assaisonnement sec pour porc`) and linked Recipe 036's existing ingredient line. The English aliases are limited to source-attested `pork rub` and `dry rub for pork`. Recipe 042 remains a preparation recipe with separate spice components. Its exact formula, one-cup yield, and two-tablespoon-per-pound use rate, plus the ribs recipe's 3/4-cup amount, remain source-specific. No generic measure or substitution was added.

## All-category scope review

All four reviews pursued generic culinary ingredient diversity. A fresh scan of unchecked plan lines found no commercial-only roster deliverable. The Section F cereal rosters, named Anson Mills wheat-meal lead, and previously reviewed Nu Life Market/Dempsey and Mochiko/Shiratamako product-only tasks remain out of scope because commercial-product counts do not add ingredient diversity. Preserve their historical sources and existing rows. Existing branded entries and product-scoped measurements remain intact; manufacturer evidence may support generic claims only when transferable, and product-specific values stay tied to their named item.

## Validation and testing

Static checks passed for the bundled seed package, generated ingredient catalog, ledger schema and source-ID linkage, unique references and ledger records, UTF-8/no-BOM, local links, and whitespace. The package has **2,071 ingredient references**, **205 forms**, **2,476 research-ledger records**, **11,554 source entries**, **9,707 distinct source IDs**, and **114 recipes / 1,123 structured ingredient rows**. No software tests, build, emulator, or deployment were run: the application changes add only database JSON data, as allowed by `AGENTS.md`.

Generic ingredient coverage remains open across catalog categories. See the [R1073 review](../../proposals/wp02-a7-next-generic-milling-gap-r1073-20261019.md), [R1074 review](../../proposals/wp07-next-generic-measurement-review-r1074-20261019.md), [R1075 review](../../proposals/wp08-next-generic-substitution-review-r1075-20261019.md), and [R1076 review](../../proposals/wp05-generic-pork-dry-rub-identity-review-r1076-20261019.md).

