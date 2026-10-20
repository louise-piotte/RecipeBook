# WP03 flattened rice (poha) identity

- **Date:** 2026-10-07
- **Status:** original identity-only checkpoint verified on Pixel 9a; the 2026-10-10 synonym and grade follow-up is recorded in [`poha-thickness-synonyms-integration-20261010/README.md`](poha-thickness-synonyms-integration-20261010/README.md)
- **Scope:** add a processed rice-flake identity with a Canadian French display. This does not
  standardize thickness, source variety, or every regional name for the product.

## Catalog decision

- **ID:** `ingredient-ref-flattened-rice-poha`
- **English:** `flattened rice (poha)`
- **fr-CA:** `flocons de riz (poha)`
- **Category:** `GRAIN_AND_CEREAL`
- **Aliases:** none
- **Numeric/form data:** none

**Follow-up (2026-10-07):** At this poha checkpoint, broken rice was still unallocated because its
generic French label had not yet been supported. It was later integrated as `broken rice / riz en
brisures`; see `broken-rice-identity.md` for the evidence and verification.

At the original 2026-10-07 checkpoint, CFTRI described rice flakes (poha/avalakki) as a paddy product made by soaking, roasting, and
beating/flaking. CSIR records regional names including flaked rice, beaten rice, aval/avalakki,
poha, and chiwda. The National Portal of India describes poha as flattened parboiled rice. A current
Canadian French retailer listing uses *Flocons de riz (Poha)*, and Club House Canada uses *poha
(riz aplati)*. These sources support a distinct processed-food identity and the proposed localized
display [WP03-S92–S96].

The original checkpoint kept generic rice, crispy rice cereal, and puffed rice separate and deferred
all aliases and thickness grades pending scope and collision review. The 2026-10-10 follow-up
resolved common rice-flake synonyms and commercial thin/medium/thick forms. It continues to exclude
`chiwda`, regional transliterations, and manufacturer-specific super-thin/nylon/paper terms. No
bundled recipe uses poha, so no recipe links or quantities change. No density, unit mapping, numeric
measurement, conversion, cooking yield, or substitution is added.

## Recipe and catalog audit

- Scanned all 114 bundled recipes: no poha, rice-flake, flattened-rice, beaten-rice, avalakki, or
  chiwda ingredient line was found.
- Checked live displays and aliases: the proposed English and French names do not collide with an
  active normalized key. The crisp cereal row remains separately scoped to crispy rice cereal.

## Sources

- **WP03-S92 — [CFTRI, Improvement of the traditional process for rice flakes](https://ir.cftri.res.in/6762/):** identifies rice flakes as poha/avalakki and describes the soaking, roasting, and flaking process.
- **WP03-S93 — [CSIR, Socially Relevant Technologies](https://www.csir.res.in/sites/default/files/2023-06/Compendium-of-Social-relevant-technologies-2.6.2021.pdf):** records the product name family in its Indian regional context; it does not establish universal global aliases.
- **WP03-S94 — [National Portal of India, Rice-based products: poha etc.](https://www.india.gov.in/explore-india/odop/details/rice-based-products-poha-etc):** describes flattened parboiled rice; no grade scope is inferred.
- **WP03-S95 — [Atlantic Superstore, International Foods (fr-CA)](https://www.atlanticsuperstore.ca/fr/clpplp/clpplp/clpplp/food/international-foods/c/58044):** current retailer listing for *Flocons de riz (Poha)*; product brand/grade is not imported.
- **WP03-S96 — [Club House Canada, Poha Chivda](https://www.clubhouse.ca/fr-ca/recettes/collations/poha-chivda):** uses *poha (riz aplati)* in a Canadian French recipe.

## Verification

- The normalized bundle contains 357 ingredient references, 16 forms, and 114 recipes; the research ledger contains 522 records. Seed, ledger, and generated-catalog hashes match the completed brown-rice verification checkpoint, so its package normalization, schema validation, generated-index check, 9 Python tests, 254 Android unit tests, and 29 connected tests (2 existing skips) cover these same catalog artifacts.
- On Pixel 9a / Android 16, the English picker query `poha` returned `flattened rice (poha)`; the French query `poha` returned `flocons de riz (poha)`. No recipe draft was saved.
- Screenshots: [English poha picker](screenshots/picker-poha-en.png) and [fr-CA poha picker](screenshots/picker-poha-fr-ca.png).
- Screenshot SHA-256: English `47ab9a4178643751acaf5988eaa993b6324b7643b66aaf9434ac469a4b866b6d`; fr-CA `5d776ed65d817a4c4366d9fa59fd0b1f37864c71d74fff2e33941b009e4a012d`.
- Package SHA-256: ingredient references `4aebf7f33b8e04cf13e796200c911f7e86c43823a8b64c048028037c5acdb70a`; forms `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a`; manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; research ledger `22a9b8c9b25ebb95446be5c631c7d8c3f5835043820ee3439655fc96315fdc5a`; generated Kotlin catalog `ee09a26a0ce1a18d4c24cb5a84013e7135b6e957623bdb429297bc16477a7f0a`.
- The updated plan, workflow, and batch notes passed UTF-8/no-BOM and mojibake checks; bundled seed JSON remains explicit-Unicode-escaped. `git diff --check` passed. Broken rice remains a separate unresolved milling-grade candidate.
