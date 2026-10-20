# WP02 Section D R326 — strawberry jam integration

Reviewed and integrated on 2026-10-16.

Promoted the existing legacy candidate to identity-only `strawberry jam / confiture de fraises` in
`SAUCE_AND_CONDIMENT`. Kept `confiture de fraise` as a search alias based on a current Montréal
pâtisserie listing; OQLF's generic entry says the fruit complement is generally plural and gives
`confiture de fraises` as its example. The accepted identity remains separate from fresh strawberries,
strawberry purée, raspberry jam, jelly, and lower-sugar fruit spreads.

The research ledger now records the exact Linzer-cookie formula's `1/2 cup (120 mL) raspberry jam or
strawberry jam` wording as one contextual alternative. This creates no active substitution rule or
recipe-line link. The bundled recipe still uses its existing raspberry-jam line unchanged.

Measurement research remains `blocked_pending_evidence`: no current, strawberry-jam-specific mass
paired with a volume was verified. The recipe volume and product package sizes remain source-specific;
no density, unit mapping, form, conversion, or recipe amount was added.

The [R326 proposal](../../proposals/wp02-section-d-strawberry-jam-identity-review-r326-20261016.md)
records the reviewed product boundaries and evidence. Key sources include [CFIA common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/processed-fruit-vegetable-products),
[OQLF's confiture entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17059918/confiture),
[Pâtisserie Madeleine's Montréal product page](https://patisseriemadeleine.ca/products/confiture-de-fraise-250ml),
and [John Kanell's Linzer cookie recipe](https://preppykitchen.com/linzer-cookies/),
[CFIA's separate jam and jelly standards](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4),
and [OQLF's fruit-spread entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26520715/tartinade-de-fruits).

The broader WP02 baking and Section D fruit-product checklists remain open.

Static seed-package validation and normalization, ingredient-reference normalization, generated-index
freshness (1,679 references), research-ledger schema/semantic validation, exact phrase-first search
projection, 114-recipe / 1,123-ingredient-row corpus scan, UTF-8/no-BOM and escaped-Unicode checks,
local links, and whitespace checks passed. No software tests, builds, emulator checks, or deployment
were run because this change only adds database JSON data and documentation under `AGENTS.md`.
