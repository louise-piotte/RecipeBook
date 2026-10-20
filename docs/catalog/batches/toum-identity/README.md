# Toum identity integration and Pixel 9a QA

## Accepted scope

Added `ingredient-ref-toum` as `toum / sauce toum` in `SAUCE_AND_CONDIMENT`. The only alias is the
Québec French phrase `sauce libanaise à l’ail (toum)`. The English Farm Boy product title remains
source evidence rather than an alias: its generic `garlic sauce` suffix would match the new row
through the picker’s partial-search fallback. Generic garlic sauce, aioli, and mayonnaise remain
separate. No form, density, unit mapping, package yield, conversion, substitution, or recipe link was
added.

Preserved lemon remains unmodeled. The current corpus has no matching ingredient line, and the
reviewed sources do not establish a single preparation form that covers whole salt-cured fruit and
rind-only use. The broad Section Y checklist remains open.

## Evidence and package snapshot

The coordinator rechecked three source pages on 2026-10-09: [Farm Boy Toum Lebanese-Style Garlic
Sauce](https://www.farmboy.ca/products/farm-boy-toum-lebanese-style-garlic-sauce-275-g/), [Club
House Canada’s *sauce toum* recipe](https://www.clubhouseforchefs.ca/fr-ca/recettes/flavour-forecast/poulet-roti-et-sauce-toum),
and [Bon pour toi’s *Sauce libanaise à l’ail (Toum)*](https://bonpourtoi.ca/recettes/sauce-libanaise-a-lail-toum/).
Their source-to-claim notes and canonical source IDs `WP05-Y-TOUM-20261009-S01`–`S03` are in the
[review packet](../../proposals/wp05-mena-toum-preserved-lemon-followup.md).

- 458 ingredient references; SHA-256 `5c6f821d858db6fcd58303a7ff9527ba5aef3315957c935bf46d31bb3f7c68a5`.
- 17 forms; 625 ledger records, 843 source entries, and 738 distinct source IDs; ledger SHA-256
  `8d5bced3b73d553a0352f780016170121e4947146c2753c0e70c4d5f93260a3c`.
- 99 legacy candidates; 114 recipes and 1,123 ingredient lines. No Toum or preserved-lemon ingredient
  line was found.

## Verification

- Bundled package and research-ledger validation passed; reference normalization and generated-index
  freshness passed at 458 rows; `git diff --check` passed.
- All 9 Python package tests and all 283 Android unit tests passed.
- Pixel 9a / Android 16 instrumentation on `emulator-5556`: 29 tests, 27 passed, 2 skipped, no
  failures or errors. The deploy script installed and launched the debug app on this device.
- English picker query `toum` returned `toum`. Generic `garlic sauce` returned no Toum row. In the
  French editor, `sauce libanaise` returned `sauce toum`. The unsaved draft was discarded; the French
  home returned to `Toutes les recettes (114)`.

## Screenshots

| Check | Screenshot | SHA-256 |
|---|---|---|
| English `toum` result | [toum-en.png](toum-en.png) | `b12bcbb669f45bc71bbca65b2af4c5731065c966442c578194ece158be1f7186` |
| Generic English `garlic sauce` boundary | [toum-generic-garlic-sauce-en.png](toum-generic-garlic-sauce-en.png) | `25a4d2539420f125ada2b4c003d84ea89ce67866c6c34496cfa6edb220729171` |
| French `sauce libanaise` result | [toum-fr-ca.png](toum-fr-ca.png) | `b69f3eee4dc74fd1ac221f7fbaee77e1764ae64f119147b53e2b26458d4c9273` |
| French library home with 114 recipes | [toum-home-fr-ca-114.png](toum-home-fr-ca-114.png) | `d08540a33e0694bd1c060e8576e755264ee55a2e81553add385a737877194b0e` |
