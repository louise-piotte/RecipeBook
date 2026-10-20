# R383 fish milt identity

Integrated 2026-10-16 under the open WP04 Section P roe/product-coverage checklist.

## Decision

Added identity-only **`milt / laitance`** as `ingredient-ref-fish-milt` in `PROTEIN`. OQLF standardizes Québec French *laitance* for a mature male fish gonad and lists English *milt* and *soft roe*; the latter is the only alias. Keep female roe, herring *rave*, bottarga, species-specific products, and formed seafood separate.

The new identity gives broad `roe` searches two explicit results: existing bottarga and milt. The exact phrases `fish roe` and `œufs de poisson` still resolve to bottarga; `caviar` remains with finger lime. No forms, package measures, recipe links, conversions, yields, or substitutions were added. Measurement research is `researched_no_supported_value`; substitution research remains `not_yet_researched`. The parent Section P checklist remains open.

## Evidence and scope

- [OQLF GDT: laitance](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199069/laitance) defines the product as a mature male gonad and commercializable anatomical part, prefers *laitance* in Québec, and lists *milt* and *soft roe* in English.
- [DFO’s 2021 Area 15 herring plan](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/herring-hareng/2021/area-15-zone-fra.html) separately identifies herring eggs as *rave* and sperm as *laitance* in its historical account. The existing R204 source ID is reused with a milt-specific locator; no duplicate URL or source ID was allocated.
- [Salties’ current seafood catalogue](https://www.salties.ca/) lists fresh cod roe and fresh cod milt separately. Its approximately 400 g and 1,000 g sizes and January–April season are supplier-specific listing details, not household measures or general product rules.

The ledger contains three evidence entries for the new record: two new source IDs/URLs and the reused DFO source. The OQLF and Salties URLs were absent from the live ledger and exact-URL proposal/batch archive. The active reference owner, forms, legacy identities, and ledger contained no exact milt/laitance owner before integration.

## Static checks

- The post-integration package contains **1,700 references and 141 forms**. The ledger contains **2,056 records, 9,267 source entries, 7,842 distinct source IDs, and 6,564 distinct URLs**.
- Static seed-package validation, research-ledger schema validation, generated-catalog freshness, source ownership, and picker projection passed. Phrase-aware scanning of all **114** manifest-listed recipe files and **1,123** ingredient rows found no candidate or nearby roe phrase matches and no direct ingredient-reference link.
- UTF-8/no-BOM, local-link, and whitespace checks passed. No software tests, builds, emulator checks, or deployment work were run because this change only adds database JSON data under `AGENTS.md`.
