# WP03/WP04/WP06 R497–R499 gap review integration

Integrated on 2026-10-17 after root review of [R497](../../proposals/wp03-section-f-next-gap-review-r497-20261017.md), [R498](../../proposals/wp04-section-p-next-seafood-review-r498-20261017.md), and [R499](../../proposals/wp06-african-next-regional-review-r499-20261017.md).

## Decisions

- **R497 — Canadian Honey Nut Cheerios pair:** resolved the R186 family hold by adding separate identity-only rows for Naturally Flavoured Honey Nut Cheerios and its Lower Sugar sibling. Keep the standard English and French manufacturer comparison phrases as its only aliases; the standard English title also matches the lower-sugar row. Retain four manufacturer 37 g servings only as product-specific ledger observations, including the lower-sugar English page’s literal “1 tasse” wording.
- **R498 — monkfish / baudroie market-name group:** reopened R12 after R404 caused bare monkfish and baudroie searches to return only steamed monkfish liver. Added an explicitly multi-species fish-flesh identity, alongside the liver row. Keep species-specific names, burbot / lotte, and organ products separate.
- **R499 — gboma leaves:** added identity-only gboma leaves / feuilles de gboma for edible leaves of *Solanum macrocarpon*. The French display remains provisional pending Québec consumer-name review. Do not add broad African eggplant / aubergine africaine terms, generic eggplant aliases, fruit, leaf flour, or forms.

No forms, recipe links, densities, reusable measures, unit mappings, conversions, yields, or substitution rules were added. R498 measurement research found no supported reusable value; R499 measurement and substitution research remain open. R497 label servings remain ledger-only. No recipe demand was found for the four candidates.

## Catalog, evidence, and picker effects

- Active references: **1,781**, up from 1,777. Forms remain **143**; legacy-import candidates remain **56**.
- Ledger: **2,139 records**, **9,794 source entries**, **8,289 distinct source IDs**, and **7,001 distinct source URLs**. The batch added four records and 22 record-source entries. Fifteen source IDs and 14 previously unowned URLs entered the live ledger. R497 reused the four archived R186 source-ID assignments; R498 reused OQLF and DFO English mappings, registered archive-only CFIA and DFO French IDs, and added Salties. R499 reused Health Canada’s existing source ID and registered eight other proposed sources. Every source ID maps to exactly one URL.
- **R497:** Honey Nut Cheerios / au miel et aux noix each returns two products. The official standard English title returns both because it is contained in the Lower Sugar title; its comparison aliases return one. Honey nut grows from one to three rows, and Cheerios from six to eight. Generic cereal / céréales results are unchanged.
- **R498:** monkfish / baudroie each grows from the steamed-liver row to two visibly named results. Monk fish returns the market group alone. Liver / foie and lotte results are unchanged.
- **R499:** gboma and feuilles de gboma each return one row; aubergine africaine remains without a match and generic aubergine remains at four results. Eggplant grows from four to five through the qualified alias; feuilles grows from 39 to 40.
- The manifest-ordered corpus scan covers **114 recipe files**, **1,123 ingredient rows**, and **753,988 bytes**, with fingerprint **847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e**. Candidate-specific hits and direct recipe links: **0**.

## Validation

- Ingredient-reference normalization and its check passed; the package has **1,781 references**.
- Bundled-package normalization check and validation passed.
- Generated Kotlin catalog freshness check passed with **1,781 references**.
- Research-ledger Draft 2020-12 schema and semantic validation passed with **2,139 records and zero errors**. Source-ID-to-URL ownership validation found no IDs assigned to multiple URLs.
- Static phrase-first picker projections matched the documented family, species, and regional-name effects. The recipe corpus fingerprint is unchanged.
- Seed JSON is ASCII-escaped and UTF-8 without BOM. The research ledger is UTF-8 without BOM. Link, mojibake, and whitespace checks passed.
- No software tests, builds, emulator checks, or deployment were run. These changes add database JSON data; AGENTS.md says no testing is needed for that change type.

## Snapshot hashes

- Ingredient references: 0789eeee3627a6c9cb5814e284d27a8c51486337698693bd5fbcc76d2ce35bd8
- Ingredient forms (unchanged): ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6
- Research ledger: 9021ec38d5f79b9895bbbdb54dbf5cb40cfa2e3768fe3dbf5a74b962663ddfee
- Generated Kotlin catalog: 70be551c2829ad5393c3c2e07f89aa34ac0e873f98929333355eb885db4000aa
