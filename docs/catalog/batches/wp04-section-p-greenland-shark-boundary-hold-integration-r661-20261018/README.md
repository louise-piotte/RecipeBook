# WP04 Section P R661 — Greenland shark boundary hold

## Disposition

Held Greenland shark (*Somniosus microcephalus*) outside active ingredient references, forms, legacy-import identities, and the research ledger. No database JSON, generated index, recipe, source ownership, or picker behavior changed.

The 2025 [COSEWIC English assessment](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/cosewic-assessments-status-reports/greenland-shark-2025.html) and [French assessment](https://www.canada.ca/fr/environnement-changement-climatique/services/registre-public-especes-peril/evaluations-rapports-situations-cosepac/laimargue-atlantiqu-2025.html) identify the species and bilingual wildlife names, describe Canadian catches as bycatch, and state that retention is prohibited in Canada. They also document directed artisanal fisheries in Iceland and Greenland, so this review makes no claim that the species is never targeted.

DFO's [English species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/greenlandshark-laimargueatlantique-eng.html) and [French species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/greenlandshark-laimargueatlantique-fra.html) provide the food-safety warning about fresh meat and support the French name; the English page is older and its general directed-fishery statement is not treated as current global-market evidence. A bounded search of Québec-facing fish retailers found no current consumer product, and the 114-recipe / 1,123-row bundle had no candidate-specific demand.

A hypothetical bilingual row would make the bare `shark` query resolve to this one species. The common French variant `requin du Groenland` was kept out of active data because it would also make broad `requin` searches singleton results. No candidate-specific CFIA labelling conclusion was made; the [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) was cited only for the purpose of the list.

## Validation and status

- Current snapshot: 1,836 active references, 164 forms, 56 legacy-import candidates, and 2,209 research-ledger records.
- Source and candidate ownership scans found no existing candidate-specific owner. The COSEWIC and DFO source URLs have zero exact ledger owners; the general CFIA Fish List URL has 32 existing owners and was not added to the ledger.
- The Section P checklist is checked with this bounded hold. Section P remains open.
- No software tests, build, emulator run, or deployment were needed for this documentation-only hold.

See the [R661 proposal](../../proposals/wp04-section-p-next-regional-fish-gap-review-r661-20261018.md).
