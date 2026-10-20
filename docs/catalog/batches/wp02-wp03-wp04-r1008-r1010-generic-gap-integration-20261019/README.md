# R1008–R1010 generic ingredient integration

**Date:** 2026-10-19  
**Status:** Integrated  
**Scope:** Three generic ingredient identities across grain milling, fungi, and meat.

## Integrated data

- **R1008 — Wild rice bran / son de riz sauvage:** Added an identity-only `GRAIN_AND_CEREAL` reference for the bran-powder fraction studied from *Zizania palustris*. The French compound is descriptive and provisional because the cited Québec terminology sources attest the base terms, not the full phrase. The study’s samples, milling, composition, and antioxidant results remain tied to the study; no aliases, forms, measurements, recipe links, conversions, yields, or substitutions were added.
- **R1009 — Gem-studded puffball / vesse-de-loup perlée:** Added an identity-only `VEGETABLE_AND_AROMATIC` reference for *Lycoperdon perlatum*. Added only the species-attested English scientific-name alias and French terminology variants. Preserved giant puffball (*Calvatia gigantea*), generic mushroom, the broad puffball group, and the generic dried-mushroom form as separate identities. Added no forms, measures, recipe links, conversions, yields, or substitutions.
- **R1010 — Lamb / agneau:** Added an identity-only `PROTEIN` reference, keeping mutton / mouton separate and leaving recipe 078#3’s ground-lamb option linked to ground beef. Recorded only the Health Canada legacy Food Guide’s 75 g cooked serving as a `portion_weight` observation for one named serving. The paired 125 mL remains outside conversion data; the observation does not apply to raw lamb, mutton, or a recipe quantity.

No bundled recipe mentions wild-rice bran or gem-studded puffball. The only lamb-related recipe line is the existing ground-lamb alternative in 078#3; it was not relinked or changed. The integration adds no forms, density values, unit mappings, package yields, or active substitution rules.

## All-category scope review

The user reaffirmed that generic culinary ingredient diversity is the goal across all ingredient types. All three queued assignments were generic. No brand, product line, flavour family, SKU, or retailer-variant roster was researched or added. The named Anson Mills wheat-meal follow-up and the commercial-only Section F cereal roster clauses remain out of scope because commercial-product counts do not add ingredient diversity; their generic parent questions remain open. Existing branded references and their source ownership were preserved. No product-specific measurement or claim was transferred to another ingredient.

## Evidence

- R1008 uses the primary *Food Chemistry: X* study on wild-rice whole, milled, and bran fractions, the existing OQLF `riz sauvage` term, the OMAFRA *Zizania palustris* profile, and the existing OQLF `son` milling term. The study’s ingredient-sample measurements are not generalized.
- R1009 uses OQLF terminology for **gem-studded puff-ball** and its French equivalents, Québec species references for *L. perlatum*, and Agriculture and Agri-Food Canada’s historical species account. Biological measurements and culinary examples are not household measures or broad mushroom claims.
- R1010 uses OQLF and CFIA terminology to bound lamb apart from mutton, plus Health Canada’s legacy Food Guide handout for the one cooked portion. The recipe-local ground-lamb option is not a transferable substitution rule.

See the [R1008](../../proposals/wp02-a7-next-generic-grain-gap-review-r1008-20261019.md), [R1009](../../proposals/wp03-section-n-gem-studded-puffball-identity-review-r1009-20261019.md), and [R1010](../../proposals/wp04-section-o-generic-lamb-identity-review-r1010-20261019.md) proposals and the [cross-category scope review](../generic-ingredient-scope-review-20261019/README.md).

## Data checks

- Bundled references: 2,024 (up from 2,021).
- Ingredient forms: 205 (unchanged).
- Research ledger: 2,430 records (up from 2,427).
- Legacy candidates: 55 (unchanged).
- Recipe corpus: 114 manifest-listed files and 1,123 ingredient rows (unchanged).
- Reusable mappings, density, package yields, conversions, and active substitutions: none added.
- Software tests, builds, emulator checks, and deployment: not run; this catalog batch only adds database JSON data, as permitted by `AGENTS.md`.

Static package validation passed; the ledger schema and source linkage have zero errors; the generated Kotlin catalog is current at 2,024 references. Exact-name ownership is unique for all added identities and aliases, with no mutton or broad puffball alias assigned. The recipe scan found zero wild-rice-bran or gem-studded-puffball rows and only the unchanged 078#3 ground-lamb alternative across the 114 recipes / 1,123 rows. UTF-8/no-BOM and local-link checks passed for the changed documentation and data files, and `git diff --check` passed. No software tests, builds, emulator checks, or deployments were run because the catalog change only adds database JSON under `AGENTS.md`.
