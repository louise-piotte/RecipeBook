# WP02/WP03/WP05 R1054–R1059 generic ingredient integration

**Date:** 2026-10-19

**Scope:** Generic culinary ingredient diversity across grain milling, edible flowers, regional preserves, roots, and sea vegetables.

## Decisions

- **R1054 — add foxtail millet bran powder / poudre de son de millet d'Italie.** Limit the identity to powdered bran from *Setaria italica* and keep it separate from the grain, grain flour, and unground bran. The 2022 study's supplied sample, laboratory particle sizes and densities, and the 2020 muffin formulation and percentages remain source-scoped. No alias, form, reusable measure, recipe link, conversion, yield, or active substitution was added.
- **R1055 — add sweet violet flowers / fleurs de violette odorante.** Limit the identity to flowers of *Viola odorata*. Keep the French compound provisional, aliases empty, and other violet species and plant parts distinct. No measure, form, recipe link, conversion, yield, or substitution was added.
- **R1056 — add Nga-ngapi (Myanmar fermented fish paste) / nga-ngapi (pâte de poisson fermentée du Myanmar).** Keep it limited to fish-based Myanmar ngapi. Preserve the unresolved `candidate-ngapi`, shrimp-paste identities, and all existing source ownership. Shrimp-study results and WorldFish sample ratios and processes remain source-scoped. No aliases, forms, measures, recipe links, conversions, yields, or active substitution were added.
- **R1057 — add Nishin Zuke (Hokkaido pickled herring and vegetables) / nishin-zuke (hareng et légumes fermentés du Hokkaidō).** Keep the prepared regional ferment distinct from plain herring and vegetable-only pickles. MAFF household recipe amounts and preparation details stay source-scoped. No aliases, forms, reusable measures, recipe links, conversions, yields, or active substitution were added.
- **R1058 — add American groundnut tubers (edible tuberous rhizome swellings of *Apios americana*) / tubercules d’apios d’Amérique (*Apios americana*).** Use qualified displays with no aliases because “groundnut” can also name peanut and overlaps existing catalog names. Preserve adjacent peanut, pulse, and potato identities. No forms, measures, recipe links, conversions, yields, or substitutions were added.
- **R1059 — add sugar kelp / laminaire sucrée for *Saccharina latissima*.** Preserve kombu, wakame, winged kelp, and the unresolved broad-kelp candidate. Add no broad kelp, varech, or goémon aliases and no forms or substitutions. Biological dimensions, the raw nutrition-panel basis, and harvest guidance remain source-scoped.

## Cross-category commercial scope

All six assignments added generic culinary ingredient identities; none pursued brand, product-line, flavour-family, SKU, retailer-variant, or commercial-roster work. A fresh scan of unchecked plan items found no additional commercial-only deliverable. R1054 reconfirmed that further research limited to Anson Mills' named Colonial-Style Toasted Stone Cut Wheat Meal is out of scope because commercial-product counts do not add ingredient diversity. Stop that product-only line, preserve its R605 history and product-scoped evidence, and keep the separate generic wheat-meal question unresolved. Previously reviewed Section F rosters and named-product tasks remain out of scope for the same reason.

No existing ingredient reference, source allocation, candidate, or recipe was deleted, merged, relabeled, or broadened. Reused OQLF source ID `WP03-S175` supports the foxtail-millet crop wording only; new references have their own identity-specific source locators. No product-specific or study-specific measurement or claim was transferred without a separate transferability review. Manufacturer and study sources remain usable where they support a generic ingredient beyond a named product or sample.

## Static verification

- Bundled seed-package normalization and validation passed; the generated Kotlin catalog is current at **2,066 ingredient references**.
- Research-ledger schema and source checks passed at **2,471 records**, **11,521 source entries**, and **9,680 distinct source IDs**. The six new ingredient identities each have one ledger owner. Sixteen new source IDs are used once; the existing `WP03-S175` source ID is reused for its separate crop-wording support.
- The package retains **205 forms**, **55 legacy-import candidates**, and **114 manifest-listed recipes / 1,123 structured ingredient rows**. The six exact candidate searches found no recipe demand, forms, or existing identity owner.
- UTF-8/no-BOM, local links, scoped whitespace, and `git diff --check` passed for the authored data and documentation paths.
- No software tests, build, emulator, or deployment were run because the application changes only add database JSON under `AGENTS.md`.

## Review packets

- [R1054 foxtail millet bran powder](../../proposals/wp02-next-generic-milling-gap-review-r1054-20261019.md)
- [R1055 sweet violet flowers](../../proposals/wp03-section-k-sweet-violet-flowers-identity-review-r1055-20261019.md)
- [R1056 nga-ngapi](../../proposals/wp05-section-w-nga-ngapi-fish-paste-review-r1056-20261019.md)
- [R1057 nishin-zuke](../../proposals/wp05-section-w-nishin-zuke-regional-preserve-review-r1057-20261019.md)
- [R1058 *Apios americana* tubers](../../proposals/wp03-section-j-apios-americana-tuber-identity-review-r1058-20261019.md)
- [R1059 sugar kelp](../../proposals/wp03-section-n-sugar-kelp-identity-review-r1059-20261019.md)
- [All-category generic-ingredient scope review](../generic-ingredient-scope-review-20261019/README.md)

Sections A7, J, K, M, N, and W remain open for other generic culinary ingredient and evidence gaps.
