# WP02/WP03/WP04 R779–R781 gap-review integration

Date: 2026-10-18

## Decisions

- **R779 — sorghum-flour substitution evidence:** added Sharanagat et al.'s controlled bread study as one source-scoped finding on the existing `ingredient-ref-sorghum-flour` ledger record. The trial uses untreated HJ-513 sorghum flour milled through a 212 μm sieve; each composite formula includes 10% rice flour, while sorghum ranges from 10–40% and refined wheat flour from 80–50%. The reported acceptable result up to 20% sorghum is limited to that formula family. Since rice is fixed as a co-flour and the wheat class is unspecified, substitution research remains `blocked_pending_evidence`; no reusable rule, flour mapping, recipe link, or active catalog data was added. Existing measurement observations and the Westpoint finding remain intact.
- **R780 — Rice Krispies Holiday Edition:** held the seasonal branded cereal outside active references and the ledger pending a family-level picker decision. WK Kellogg Canada currently lists Original, Spring Edition, and Holiday Edition in English and French; adding Holiday alone would make `Rice Krispies` resolve to one of the three. Preserve the generic `crispy rice cereal` identity, its recipe link, OQLF boundary, and R291's SKU-specific 28 g portion.
- **R781 — whole Brown trout:** held `whole brown trout / truite brune entière` outside active form data until a species-matched food product or recipe supports it. Québec sources confirm that Brown trout is raised and legally saleable through specified channels, while the available farm listings are for stocking and the industry sources do not identify a Brown-trout retail product. This is a bounded evidence hold, not a claim that Brown trout is never sold for food. The existing identity, aliases, and ledger sources remain unchanged.

## Package snapshot

- **1,866 ingredient references and 191 forms.** R779 does not change active picker data; R780 and R781 allocate no catalog records or forms.
- **2,266 research-ledger records, 10,633 source entries, 8,951 distinct source IDs, and 7,598 distinct source URLs.** R779 adds one primary-study source; R780 and R781 are documentation-only holds.
- **114 manifest-listed recipes and 1,123 structured ingredient rows.** R779 found no sorghum-related demand; R780 found no brand-specific Rice Krispies demand (recipe 040 requests generic crispy rice cereal); R781 found no Brown-trout demand.

## Static verification

- Research-ledger schema and custom validation passed: 2,266 records, zero errors.
- Confirmed R779 source ID, finding ID, DOI/URL, and proposal path had no prior owner. The ledger source, finding, and decision remain attached to the existing sorghum-flour record; the research state stays blocked.
- Source ownership, proposal links, picker projections, recipe-corpus scans, UTF-8 without BOM, and scoped whitespace were reviewed. No seed-package reference, form, generated index, or picker term changed.
- The scoped `git diff --check` passed. A workspace-wide `git diff --check` reports pre-existing trailing whitespace in unrelated dirty source and exported-recipe files; those files were left untouched.
- **No software tests, build, emulator run, or deployment were performed.** The only database-data change was a research-ledger JSON addition, for which the current `AGENTS.md` rule says software testing is not needed; R780 and R781 are documentation-only holds.

Sections A6, F, and P remain open.

## Proposals

- [R779 sorghum-flour substitution evidence](../../proposals/wp02-a6-next-gap-review-r779-20261018.md)
- [R780 Rice Krispies family hold](../../proposals/wp03-section-f-next-gap-review-r780-20261018.md)
- [R781 Brown-trout form hold](../../proposals/wp04-section-p-next-open-gap-review-r781-20261018.md)
