# WP03 Section L R665 — Aleppo pepper identity integration

## Decision

Added one identity-only reference, `ingredient-ref-aleppo-pepper`:

- English display: `Aleppo pepper`
- Québec French display: `piment d'Alep`, attested in Québec recipe wording and treated as descriptive local usage, not an OQLF-approved named term
- English aliases: `Aleppo pepper flakes`, `Aleppo chili pepper flakes`
- Category: `BAKING_AND_SPICE`
- French aliases: none
- Density: null; unit mappings: empty
- Forms, recipe links, measurements, and substitutions: none

The University of California Agriculture and Natural Resources extension page describes Aleppo as a named pepper traditionally dried and crushed into flakes. Walmart Canada's Edi Gourmet listing uses “Aleppo Pepper Flakes” in its product title and “Dried Aleppo Pepper” in the ingredient field. Loblaws lists “Aleppo Chili Pepper Flakes” inside one PC Black Label seasoning product that also contains salt and vegetable oil. Those sources support the two narrow aliases and the named seasoning identity; they do not justify a universal formula or form. [UC ANR](https://ucanr.edu/site/uc-master-gardener-program-contra-costa-county/gtps-2026-peppers), [Walmart Canada](https://www.walmart.ca/en/ip/Edi-Gourmet-Spice-Aleppo-Pepper-Flakes-113g-4oz/2341IGMYCBB4), [Loblaws](https://www.loblaws.ca/en/aleppo-pepper/p/21431146_EA)

Recettes du Québec, Télé-Québec, and Grains du Québec each use `piment d'Alep` in an ingredient list. The reused OQLF record defines only generic `piment`; it does not certify an Aleppo-specific term. The Québec recipe amounts and one recipe-local “or” alternative remain out of generalized measurement and substitution data. [Recettes du Québec](https://www.recettes.qc.ca/recettes/recette/veloute-de-courge-poivree), [Télé-Québec](https://cuisinez.telequebec.tv/recettes/6427/pain-de-viande-d-alep), [Grains du Québec](https://grainsduquebec.ca/nos-recettes/oeuf-a-la-turque-sur-riz-davoine), [OQLF](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410223/piment)

## Boundaries

- Kept generic `red chili flakes`, `chili powder`, `gochugaru`, and other named dried chiles separate.
- Did not activate seller synonym lists such as Halaby/Halabi, Pul biber, Maraş/Marash, Armenian pepper, Syrian pepper, Near East pepper, or Aleppo paprika.
- Added no fresh/dried or flakes/ground form relation, recipe link, measurement, density, mapping, conversion, yield, or substitution.
- The 114 manifest-listed recipe files and 1,123 ingredient rows had no Aleppo-specific hits.
- The picker projection adds one result for Aleppo-name queries; generic chili-flake, powder, and gochugaru results remain unchanged. Broad `piment` and `pepper` counts move from 32 to 33 and 39 to 40.

## Ledger and validation

Added one verified `ingredient_reference` ledger record with eight new source entries and one reused OQLF `piment` source entry. The eight new URLs and source IDs are unique to R665; the existing OQLF source ID and URL retain their prior owners.

Static validation passed after integration:

- bundled seed package normalization and validation
- generated Kotlin ingredient index freshness
- research-ledger schema and custom validation: 2,210 records, zero errors
- package snapshot: 1,837 references, 164 forms, 56 legacy candidates, 114 recipes, 1,123 ingredient rows
- source URL/ID ownership, alias collision, picker-boundary, corpus, UTF-8/no-BOM, local-link, and scoped whitespace checks

No software tests, build, emulator run, or deployment were run because this change only adds database JSON data under `AGENTS.md`.

See the [R665 source proposal](../../proposals/wp03-section-l-aleppo-pepper-identity-review-r665-20261018.md). Section L remains open.
