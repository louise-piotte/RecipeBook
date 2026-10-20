# WP04 Section P R676 — fresh whole Barramundi form integration

Integrated 2026-10-18. Added a fresh-whole form under the existing `ingredient-ref-barramundi` identity for *Lates calcarifer*.

## Naming and search

Metro's Québec-facing English and French guidance uses **fresh whole barramundi / barramundi frais entier** and recommends cooking it whole rather than as fillets. CFIA pairs *L. calcarifer* with Barramundi / Barramundi; OQLF's existing parent source confirms the Québec identity wording. The form adds only `whole barramundi / barramundi entier` as match terms. Generic `whole fish / poisson entier` remains owned by the existing tilapia terms, and `fillet / filet` results remain unchanged.

The source describes a fresh whole product presentation but does not specify whether it is scaled, gutted, gilled, trimmed, or otherwise prepared. No SKU-specific stock, recipe demand, or source-backed quantity was found.

## Data change

- Added `ingredient-form-barramundi-fresh-whole` with `formCode: fresh_whole`, `prepState: fresh`, and null density.
- Added a form-level research-ledger record with verified identity and `researched_no_supported_value` / `researched_no_supported_substitute` states.
- Added three new source entries for the CFIA species lookup and Metro's bilingual guidance. Reused the existing OQLF source ID on the Barramundi parent record without duplicating it on the new form record.
- Added no reference, alias, numeric observation, mapping, conversion, yield, recipe link, or substitution rule.

## Validation

Static package, ledger schema/custom, ID/URL ownership, picker projection, recipe-corpus, encoding, local-link, and whitespace checks passed. No software tests, build, emulator, or deployment were run because this update only adds database JSON data under [AGENTS.md](../../../../AGENTS.md).

At integration time the package contained 1,837 references, 169 forms, and 114 bundled recipes / 1,123 ingredient rows. The ledger contained 2,215 records.
