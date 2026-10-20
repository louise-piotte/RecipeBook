# WP02 / WP03 / WP04 R78 integration (2026-10-13)

## Decisions

### WP02 B3 — breadfruit starch / amidon du fruit à pain

Added identity-only `ingredient-ref-breadfruit-starch`:

- English: `breadfruit starch`
- French: `amidon du fruit à pain` (provisional pending Québec product-name review)
- Category: `FLOUR_AND_STARCH`
- Aliases: none
- Default density: `null`; unit mappings: empty

Primary studies distinguish extracted native starch from whole-flesh breadfruit flour. OQLF supports the Québec fruit name and the general term `amidon`; the combined display is transparent French wording also found in French Caribbean research, not a verified Québec package term. Keep the row separate from fresh breadfruit, breadfruit flour, breadnut, jackfruit, and other starches. No forms, recipe links, numeric observations, conversions, yields, or substitutions were added; the recipe bundle has no matching demand.

### WP03 Section F — Korean mixed seven-grain rice hold

Held the Korean-market `Mixed 7 Grains` candidate outside active references and the research ledger. An Alberta H Mart flyer lists `CRD)Mixed 7Grains` with Korean text, and a separate U.S. retailer page names Choripdong `Mixed 7 Grains`; neither provides an ingredient declaration or proves the two packages share a formula. A Québec institutional recipe uses generic `MÉLANGE DE RIZ 7 GRAINS`, not a product-specific French name. Keep the existing `7 grains` picker owner on Red River hot cereal. The Hangul query currently normalizes to an empty search and returns all references, so do not add it as an alias. No recipe in the bundle requests this product.

### WP04 Section P — soft-shell crab hold

Held soft-shell crab outside active references and forms. A Québec fishmonger describes a live product as Atlantic blue crab but gives no scientific name; Fisheries and Oceans Canada also uses `crabe mou` for the soft-carapace post-moult state of snow crab. Attaching unqualified `soft-shell crab` or `crabe mou` terms to the blue-crab row would make those searches misleading singleton results. Keep the existing blue-crab and crab-meat entries unchanged. No bundled recipe requests soft-shell crab.

## Evidence and proposals

- [WP02 breadfruit-starch proposal](../../proposals/wp02-b3-regional-starch-gap-review-r78-20261013.md)
- [WP03 Korean mixed-grain proposal](../../proposals/wp03-section-f-next-grain-review-r78-20261013.md)
- [WP04 soft-shell-crab proposal](../../proposals/wp04-section-p-next-seafood-gap-review-r78-20261013.md)

The proposals retain the source registers, identity and picker boundaries, recipe scans, and measurement and substitution limits.

## Verification

- The bundled seed package normalized and validated; the generated ingredient catalog check passed.
- The research ledger validated against its JSON Schema; ownership, source IDs, reference links, recipe demand, and static picker projections were checked.
- UTF-8/no-BOM, mojibake, local Markdown links, and changed-file whitespace were checked.
- No app tests or emulator checks were run. The only active catalog data change adds database JSON data, covered by the current `AGENTS.md` rule; the two holds are documentation-only.

The WP02 B3, Section F, and Section P parent checklist items remain open.
