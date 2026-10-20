# WP03 Section M sea-buckthorn berry identity integration — 2026-10-12

- **Status:** Integrated.
- **Source proposal:** [`wp03-section-m-sea-buckthorn-berry-identity-review-20261012.md`](../../proposals/wp03-section-m-sea-buckthorn-berry-identity-review-20261012.md).
- **Change:** Added identity-only `sea buckthorn berry / argouse` for the edible fruit of *Hippophae rhamnoides* as `FRUIT`, using OQLF-attested English and French terms. Added six source records and one accepted identity decision to the research ledger.

## Evidence and boundaries

OQLF defines *argouse* as the fruit of the argousier and lists `argouse` and `baie d’argousier` as preferred Québec terms. Its English fruit terms include `sea buckthorn berry`, `sea buckthorn`, `seaberry`, and `seaberry fruit`; the companion plant entry identifies *Hippophae rhamnoides*. UQAC describes the edible fruit and local culinary use. Québec producer and retail listings distinguish frozen berries from juice, pulp, powder, leaf tea, and sorbet. [OQLF fruit entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26556697/argouse) · [OQLF plant entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357878/argousier) · [UQAC](https://www.uqac.ca/foretnourriciere/les-fruitiers/argousier/) · [Aliments du Québec](https://alimentsduquebec.com/entreprises/les-argousiers-du-lac-brome-inc)

Keep leaves and leaf tea, juice, pulp, seed oil, powder, flour, preserves, sorbet, and composite products separate. No forms, default measure, density, conversion, yield, recipe link, or substitution were added. A Québec consumer guide's 125 mL fruit-serving statement remains source context only, with no corresponding mass or app measure; measurement and substitution research remain `not_yet_researched`.

The exact picker queries `sea buckthorn berry`, `sea buckthorn`, `seaberry`, `seaberry fruit`, `argouse`, and `baie d’argousier` resolve to the new row alone. Broad `berry` and `baie` remain multi-result searches. Full review covered the 114-recipe / 1,123-row bundle and found no sea-buckthorn or adjacent product demand.

## Validation

The current shared package snapshot contains 1,279 references and 94 forms. The references file SHA-256 is `77f42f8abdab6d6320c0b6879144594dc2711d9d971f9e351d44f180bb1d09b3`; the ledger has 1,587 records and 5,642 source entries, with SHA-256 `6be08066986efae74e61f5110018a821341f20ea5f7e40423f50f45e8564e578`.

`python3 tools/seed_package/normalize_bundled_seed_package.py` reported zero changed parts. The seed-package `--check` passed, and `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` confirmed the generated index is current at 1,279 references. No app tests or emulator checks were run because this change only added database JSON data.
