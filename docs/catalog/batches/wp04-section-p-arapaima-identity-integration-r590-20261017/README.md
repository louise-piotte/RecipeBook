# WP04 Section P R590 — Arapaima identity integration

Date: 2026-10-17

## Decision

Added identity-only `Arapaima / arapaima` as `ingredient-ref-arapaima` in category `PROTEIN`, scoped to *Arapaima gigas*. Added the English search alias `Paiche` and French search alias `Pirarucu`. Excluded “Amazon cod”: it is an informal supplier name for this distinct species and would cause a broad `cod` query to return it.

Added a verified identity record and source register to the research ledger. Measurement research found no reusable measure or value; substitution research found no general substitute. A recent Brazilian ministry recipe gives salted dried pirarucu and dish-specific alternatives, but those directions stay limited to that recipe. The bundle has no matching Arapaima, Paiche, or Pirarucu demand.

No forms, measures, densities, unit mappings, recipe links, conversions, yields, or substitution rules were added. Generic fish, cod, fish powder, fish balls, and surimi identities remain separate. The broader regional seafood review remains open.

## Evidence

- Public Services and Procurement Canada, [TERMIUM Plus: ARAPAIMA](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=ARAPAIMA): associates English and French *arapaima* with *Arapaima gigas* and marks the French noun masculine.
- Government of Canada, [Wild Animal and Plant Trade Regulations](https://lois-laws.justice.gc.ca/eng/regulations/SOR-96-263/FullText.html), Schedule I, entry 1.6.4.1(1): lists *A. gigas* as Arapaima / Pirarucu. The regulation is for wildlife trade, not a food-labelling determination; the current HTML page is consolidated to 2026-09-21.
- Peru Ministry of Production, [Seafood Products catalogue](https://rnia.produce.gob.pe/wp-content/uploads/2019/07/Catalogo-de-Productos-Pesqueros-y-Acu%C3%ADcolas.pdf), pp. 32–33: identifies Paiche as *A. gigas*, lists Pirarucu and Arapaima as other names, and describes farmed fish and frozen skinless fillets. Its product quantities are not household measures.
- Seacore Seafood, [Paiche / Arapaima gigas](https://www.seacoreseafood.com/product/paiche-amazon-cod-arapaima): Canadian supplier evidence for frozen fillets and the species name. The informal “Amazon cod” wording is not an alias.
- Brazil Ministry of Fisheries and Aquaculture, [Pirarucu: the Amazon giant at Brazil’s table and economy](https://www.gov.br/mpa/pt-br/assuntos/noticias/pirarucu-gigante-amazonia-mesa-economia-brasil/), published 2026-09-11: identifies pirarucu as *A. gigas* and describes one salted/dried Pirarucu de Casaca recipe with dish-specific alternatives.

The proposal’s Justice Canada source was corrected from a stale PDF URL and consolidation date to the current HTML regulation page during integration. The picker identity uses only the species-bounded names supported by the reviewed sources.

See the [R590 proposal](../../proposals/wp04-section-p-next-seafood-review-r590-20261017.md), the open [regional fish checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L6426), and the broader [Section P seafood work item](../../../RecipeBook-global-ingredient-catalog-plan.txt#L14981). The broader fish-powder, fish-ball, surimi, and regional seafood work remains open.

## Static verification

Static seed-package validation, normalizer checks, generated-index freshness, research-ledger schema/source-ID validation, source ownership, picker projection, recipe-corpus scan (114 recipes / 1,123 ingredient rows), UTF-8/no-BOM, local-link, and scoped whitespace checks passed. No application tests, build, emulator check, or deployment were needed or run because this integration only adds database JSON data and tracking documentation under `AGENTS.md`.
