# WP05 kimchi and soy-sauce style identities

- Integrated: 2026-10-08; coordinator-owned merge from the East Asia follow-up proposal.
- Status: three identity rows integrated; the wider Section W and WP05 checklist remains open.
- Kimchi / kimchi is a generic prepared fermented-vegetable accompaniment with OQLF-listed spellings only. Named varieties remain separate work.
- Light soy sauce / sauce soya claire and dark soy sauce / sauce soya foncée are separately searchable product identities, not aliases of generic soy sauce and not low-sodium forms. The current form model describes preparation states, so no style was written into prepState.
- The manufacturer wording sauce soja noire is not enabled as an alias; it risks collision with the separate black-bean sauce name. No crosswalk is asserted between Chinese light soy sauce and Japanese usukuchi.
- Kimchi uses SAUCE_AND_CONDIMENT, consistent with the existing pickle category. All three rows have empty unit mappings and null density. No forms, package yields, conversions, measurements, or substitutions were added.
- Sources: [OQLF, kimchi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529902/kimchi), [OQLF, sauce soya](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095123/sauce-soya), [Pearl River Bridge, light soy sauce](https://www.pearlriverbridge.com/superior-light-soy-sauce), [Pearl River Bridge, sauce soja légère](https://fr.pearlriverbridge.com/superior-light-soy-sauce), [Pearl River Bridge, dark soy sauce](https://www.pearlriverbridge.com/dark-soy-sauce/), [Pearl River Bridge, sauce soja foncée](https://fr.pearlriverbridge.com/dark-soy-sauce).
- Recipe source-text audit across 114 bundled recipes found no kimchi or light/dark soy style mentions. Final checkpoint: 390 references / 557 ledger records; 9 Python package tests and 274 Android unit tests passed; the reference normalizer, generated-index check, and `git diff --check` passed.
