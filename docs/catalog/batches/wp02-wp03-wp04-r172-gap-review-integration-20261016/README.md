# WP02/WP03/WP04 R172 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [Kodo millet aliases](../../proposals/wp02-a6-next-regional-flour-review-r172-20261016-kodon-atta.md), [Aurora polenta roll boundary](../../proposals/wp03-section-f-aurora-polenta-roll-identity-review-r172-20261016.md), and [canned salmon](../../proposals/wp04-section-p-canned-salmon-product-boundary-review-r172-20261016.md).

## Integrated decisions

- **WP02 A6 — Kodo millet:** Added kodon to the existing Kodo grain reference and kodon atta to its flour reference. ICAR–IIMR lists Hindi Kodon under Kodo Millet; Organic Mandya lists “Kodon Atta (Bengali)” for its Kodo flour ([ICAR–IIMR](https://millets.res.in/millets_info.php), [Organic Mandya](https://organicmandya.com/products/kodo-millet-flour-500-gm)). Because the sources differ on the language attribution, the integration records the exact flour wording without generalizing the label. Reused both source IDs and URLs. Preserved French displays, numeric research, and blocked substitution findings; added no French alias, form, measure, recipe link, conversion, yield, or substitution.
- **WP03 Section F — Aurora polenta roll:** Held the Aurora CRPF-998 / UPC 0061659002739 product outside active references and forms. Acema’s French listing describes a Canadian 500 g pre-cooked cylinder ready to slice; the English listing uses “Traditional plain polenta” and identifies the same SKU but does not itself describe a roll ([Acema French](https://www.acema.ca/fr/produits/crpf-998), [Acema English](https://www.acema.ca/en/products/CRPF-998)). The two source records and an unresolved SKU-specific hold are attached to the existing generic-polenta candidate. No active identity, alias, form, measure, or recipe link was added.
- **WP04 Section P — canned salmon:** Added identity-only canned salmon / saumon en conserve as ingredient-ref-canned-salmon, category PROTEIN. This is a finished-product search group, separate from raw salmon, salmon species, smoked salmon, canned tuna, canned sardines, and composites. Codex product-scope evidence, Québec retail wording, and Canadian maker listings support the bounded group ([Codex CXS 3-1981](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B3-1981%252FCXS_003e.pdf), [Maxi](https://www.maxi.ca/fr/fr/alimentation/garde-manger/produits-en-conserve-et-marin-s/saumon-en-conserve/c/29699), [Clover Leaf](https://www.cloverleaf.ca/en/products/flaked-pink-salmon-skin-bones-removed/)). The row assigns no species, presentation, packing medium, drained state, or legal package name. Existing pink- and sockeye-salmon CNF quantities remain attached to their species records. Added no aliases, forms, measures, conversions, yields, recipe links, or substitutions.

## Source registration

- WP02 reused Organic Mandya S03 and ICAR–IIMR S08; no new source ID or URL.
- WP03 added Acema S01–S02 to the unresolved ingredient-ref-polenta candidate; no product identity record was created.
- WP04 added five source records for Codex, Maxi Québec, and Clover Leaf; reused the existing CFIA common-name source. The existing CNF pink- and sockeye-salmon records were not copied to the new identity.

## Static validation

- Bundled seed-package validation, ingredient-reference normalization, and generated-index freshness checks passed. The generated index contains **1,548 references**.
- Research-ledger schema validation passed with **1,892 records and zero errors**. Source IDs in the modified decisions resolve; all seven new source IDs and their URLs have unique ownership.
- Static picker projection passed: kodon returns Kodo grain and flour; kodon atta returns Kodo flour only; exact English and French canned-salmon phrases return the new identity.
- The manifest scan covered **114 recipe files / 1,123 ingredient rows** and found no R172 candidate text or direct identity links. The Aurora reference remains unallocated and generic polenta remains unresolved.
- UTF-8/no-BOM, explicit escaped-Unicode database JSON, local Markdown links, and scoped whitespace checks passed.
- Totals: **1,548 references**, **119 forms**, **1,892 ledger records / 8,107 source entries / 6,932 distinct source IDs / 5,728 distinct source URLs**; 114 recipes / 1,123 ingredient rows.
- No app, unit, instrumentation, emulator, build, deployment, or other software tests were run. The changes add or update database JSON data under the updated AGENTS.md rule.

Sections 04 A6, F, and P remain open for broader candidate coverage.

