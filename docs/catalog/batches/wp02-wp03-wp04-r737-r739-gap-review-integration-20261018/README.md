# WP02/WP03/WP04 R737–R739 integration — 2026-10-18

Integrated one bounded ledger finding and one fish form; documented one cereal-family hold. Sections A6, F, and P remain open.

## Decisions

- **R737 — white quinoa flour:** Recorded Tootsi's statement that product 31501 can replace up to 25% of flour as a `blocked_pending_evidence` substitution finding on the existing ledger row. Tootsi does not identify the base flour, percentage basis, recipe scope, or adjustments; studies of other quinoa flours are formulation-specific. No replacement, active rule, alias, recipe link, or measurement was added.
- **R738 — Oatmeal Crisp Chocolate Almond:** Held this single SKU outside active data until a family-level picker decision covers the seven English/French products listed by General Mills Canada. Adding one row would make `Oatmeal Crisp` and `Avoine Croquante` brand-family searches misleading singletons. No identity, source, ledger row, portion observation, or recipe link was allocated; the 1 cup (58 g) label observation remains proposal-local.
- **R739 — Atlantic cod form:** Added `fresh whole Atlantic cod / morue de l’Atlantique fraîche entière` as a `fresh_whole` form. A current Canadian supplier describes its product as head-off and gutted; those details remain SKU-specific. The current Seafood from Canada form tables list HOG/H&G, not unqualified fresh whole, and the DFO wording is historical. Broad cod, whole-fish, and fillet picker searches remain unchanged. No measure, yield, recipe link, conversion, or substitution was added.

## Package state

- 1,848 ingredient references; 177 forms; 114 manifest-listed recipes; 1,123 structured ingredient rows.
- 2,234 research-ledger records; 10,483 source entries; 8,850 distinct source IDs; 7,497 distinct source URLs.
- R737 and R739 found no matching recipe-line demand. R738 found no brand/full-title/ID/retailer-number match; the one generic phrase collision in recipe 040 is unrelated cereal demand.

## Static verification

- Bundled package validation and normalization check, generated reference-index freshness, and research-ledger schema/semantic validation passed.
- R737 added two distinct academic sources to the existing white-quinoa-flour record and reused its two Tootsi product-page sources. R739 added three new source URLs to the form-level record and reused the existing Salties and OQLF source IDs. The new URLs have new source IDs; reused IDs retain their existing URLs, with no parallel IDs minted.
- Picker projections: R738's `Oatmeal Crisp` / `Avoine Croquante` queries resolve to one row for the single candidate versus seven for the current family roster, so the SKU remains held. R739's qualified whole-Atlantic-cod English/French queries resolve to the cod parent; generic cod/morue, whole-fish, and fillet results remain unchanged. R737 changes no picker term.
- The 114-file / 1,123-row recipe corpus scan found no R737 or R739 target demand and no R738 Oatmeal Crisp family demand. Changed JSON is UTF-8 without BOM; French characters in bundled JSON are escaped. Local links, scoped whitespace, and diff checks passed.
- No software tests, builds, emulator run, or deployment were performed. The active catalog change adds database JSON only, so tests are not required under [AGENTS.md](../../../../AGENTS.md); R738 is a proposal and checklist documentation hold.

## Follow-up

Continue the broader WP02 Section A6, WP03 Section F, and WP04 Section P reviews, including a family-level Oatmeal Crisp picker decision.
