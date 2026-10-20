# WP02/WP03/WP04 R782–R784 gap-review integration

Date: 2026-10-18

## Decisions

- **R782 — generic spelt-flour substitution research:** added Badem et al.'s mixed-flour bread experiment and King Arthur Baking's ancient-grain test-kitchen guidance as separate blocked, source-scoped findings on ingredient-ref-spelt-flour. The study's local flour samples, added Ahlat pear flour, lab bread process, and adjusted water do not establish a reusable wheat replacement. King Arthur's broad guidance cannot be represented as a safe active contextual rule: it does not define a finite spelt-specific dish scope and its 25% advice means partial replacement while the current resolver maps one full ingredient line to one target. Keep the finding blocked, with no replacement mapping, active rule, or recipe-line link.
- **R783 — Frosted Flakes family:** added identity-only standard, Strawberry Milkshake, Cookies & Crème Milkshake, and Chocolate Peanut Butter family members. Preserve ingredient-ref-frosted-flakes-less-sugar-multigrain and generic ingredient-ref-corn-flakes. The current English and French manufacturer family pages list all five family cards; the Chocolate Peanut Butter entry remains name-only because no product-matched detail or Québec confirmation was found. Refreshed the existing French family source WP03-MFLAKES-20261012-S06 under ingredient-ref-multigrain-flakes; kept its source ID and URL single-owned, and referenced it from the new decisions without adding a duplicate source entry.
- **R784 — Atlantic/Pacific cod fillets:** added paired species-qualified fillet_cut forms, reusing R683's held Atlantic ID and its four proposal-local product sources. Metro's English and French routes share Pacific product 229353 and identify Gadus macrocephalus; High Liner product 8894 independently lists Pacific cod fillets. Use plural display labels and only species-qualified singular French match terms. Keep previously frozen/thawed, boneless, additive, size, pack, and stock facts SKU-specific. No general measure, yield, conversion, recipe link, or active substitution was added; R683's hold is resolved.

## Package snapshot

- **1,870 ingredient references and 193 forms.**
- **2,272 research-ledger records, 10,649 source entries, 8,964 distinct source IDs, and 7,611 distinct source URLs.**
- **114 manifest-listed recipes and 1,123 structured ingredient rows.** The corpus scan found no matching spelt-flour, Frosted Flakes variant, or cod-fillet rows.

## Static verification

- Research-ledger schema and custom validation passed: **2,272 records, zero errors**.
- Bundled package schema validation and normalization check passed; the package was already normalized after integration.
- Generated BundledIngredientCatalog.kt was regenerated from the canonical ingredient-reference JSON and is current at 1,870 references.
- Picker projection returns five results for Frosted Flakes; fillet grows from seven to nine, filet from two to four, and cod fillet / filet de morue each return both cod species. Qualified Atlantic and Pacific fillet queries each return one corresponding parent. corn flakes / flocons de maïs remain single-result.
- The 114-recipe / 1,123-row corpus scan found no matching candidate rows.
- Source ownership, local proposal links, UTF-8 without BOM, scoped whitespace, and seed Unicode-escape conventions were checked.
- **No software tests, build, emulator run, or deployment were performed.** The catalog change adds database JSON data; the generated reference index was refreshed from the canonical JSON source without changing behavior.

Sections A6, F, and P remain open.

## Proposals

- [R782 generic spelt substitution review](../../proposals/wp02-a6-next-gap-review-r782-20261018.md)
- [R783 Frosted Flakes family review](../../proposals/wp03-section-f-next-gap-review-r783-20261018.md)
- [R784 cod fillet form review](../../proposals/wp04-section-p-next-open-gap-review-r784-20261018.md)
