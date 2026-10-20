# R1025–R1027 generic ingredient integration

Reviewed 2026-10-19. This cross-category batch adds three generic identity-only culinary ingredients. It does not expand commercial product rosters.

## Decisions

- **R1025 — oat bran flour / farine de son d’avoine:** Added `ingredient-ref-oat-bran-flour` as `FLOUR_AND_STARCH`. Keep it distinct from oat bran and oat-kernel flours, with no claim of a universal milling grade. The English identity is directly named in noodle and muffin studies; their formulas and results remain study-specific. The French compound is descriptive and provisional for Québec.
- **R1026 — umbilicate hydnum / hydne ombiliqué:** Added `ingredient-ref-umbilicate-hydnum` as `VEGETABLE_AND_AROMATIC`, bounded to the culinary fruiting body of *Hydnum umbilicatum*. Keep *H. repandum*, generic mushroom, lion’s mane, and the species-unspecified dried-mushroom form separate. Do not treat biological dimensions or the 2013 market price as kitchen measures or imply field-identification or safety guidance.
- **R1027 — chonggak-kimchi:** Added `ingredient-ref-chonggak-kimchi` as `SAUCE_AND_CONDIMENT`, a named generic kimchi type made with whole young radishes and leaves. Keep it separate from generic kimchi, other named kimchi types, raw radish, and pickled radish. The French parenthetical remains a descriptive construction, not an OQLF-standardized subtype term.

No forms, recipe links, reusable measures, conversions, yields, or active substitutions were added. The oat-bran flour measurement state is `researched_no_supported_value`, and its replacement research remains blocked because study formulas do not establish a general rule. Hydnum substitution research found no supported substitute. Chonggak-kimchi measurement research found no reusable value; replacement research remains blocked pending a defined recipe context.

## Scope and evidence limits

- All three assignments covered generic ingredient diversity across milling, fungi, and preserved foods. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. Any roster-only queue item is out of scope because commercial-product counts do not add ingredient diversity; mark it with that reason and stop that line.
- Existing branded rows remain intact. Product-specific claims and measurements were not generalized without a separate transferability review. No such product evidence was needed for these identities.
- The R1025 studies establish oat bran flour as an ingredient in tested noodle and muffin formulas, not a household measure, standard grind, density, or all-purpose replacement ratio. OQLF establishes the base term `son d’avoine`; the French compound remains provisional.
- Cultur’Innov and MycoQuébec provide Québec-facing names and species-bounded culinary evidence for *H. umbilicatum*. Source-reported cap dimensions and historical price remain attached to those references; *H. repandum* remains distinct.
- KTO and MAFRA name the whole-radish kimchi type. Korean government French-language pages support the borrowed term and young-radish description; the French display is descriptive, not standardized. No product formulation or recipe quantity was generalized.

## Static checks

Pre-integration snapshot: 2,035 references, 205 forms, 55 legacy candidates, 2,440 ledger records, 11,418 source entries, and 114 recipes / 1,123 structured ingredient rows.

Post-integration counts: **2,038 references**, **205 forms**, **2,443 ledger records** with **11,428 source entries**, **55 legacy candidates**, and **114 recipes / 1,123 ingredient rows**. The R1024 sea-urchin candidate remains unchanged.

- Bundled package normalization reported zero changed parts; package validation passed.
- Ingredient reference normalization and generated-index freshness checks passed at 2,038 references.
- `validate_research_ledger()` accepted all 2,443 records with zero errors.
- Each new identity has one active reference and one ledger record. No new phrase occurs in the bundled recipe corpus; no recipe link or form was added.
- UTF-8/no-BOM, explicit escaped accents in bundled JSON, local links, and scoped whitespace checks passed.
- No software tests, build, emulator check, or deployment were run because these app changes only add database JSON under `AGENTS.md`.

## Proposals and sources

- [R1025 — oat bran flour](../../proposals/wp02-next-generic-milling-gap-review-r1025-20261019.md)
- [R1026 — umbilicate hydnum](../../proposals/wp03-next-generic-produce-gap-review-r1026-20261019.md)
- [R1027 — chonggak-kimchi](../../proposals/wp05-next-generic-pantry-gap-review-r1027-20261019.md)
