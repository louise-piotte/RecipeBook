# WP04 Section P smoked-herring bloater integration (R204)

Added one identity-only `PROTEIN` market group, `smoked herring bloater / hareng bouffi`, for
salted-and-smoked round herring. The CFIA Grade Compendium defines bloaters as salted, smoked, round
herring and distinguishes the separately defined bloater fillets; its herring definition includes
both *Clupea harengus* and *Clupea pallasii*. No species is assigned to the new market group.

The only aliases are English `bloaters` and French `bouffis` and `craquelot`. Keep the reference
separate from Atlantic and Pacific herring, oil-packed smoked herring fillets, herring in tomato
sauce, split kippers, Matjes, rollmops, and composite chiktay. No forms, recipe links, conversions,
yields, or substitutions were added. The full 114-recipe / 1,123-row corpus has no matching demand.

The Intercambio supplier’s approximate 100 g per whole fish was not retained as a ledger observation:
it describes one supplier’s species-specific product and is not a supported measure for this
species-neutral identity. Measurement research is recorded as `researched_no_supported_value`.
Supplier package amounts and processes remain source-specific. The reviewed supplier suggestion to
use its product like anchovies does not establish a recipe, ratio, or substitution.

The ledger reuses the CFIA source ID already registered on Pacific herring and adds eight distinct
R204 source URLs for OQLF terminology, DFO Québec context, Canadian producer and supplier listings,
and terminology boundaries. The Section P plan records the narrow whole/round identity boundary.

Static bundled-package, schema, generated-index, source ownership, picker, corpus, and encoding checks
were run after integration. No software tests or emulator checks were run because this change only
adds database JSON data under `AGENTS.md`. See the [R204 review](../../proposals/wp04-section-p-smoked-herring-bloater-identity-boundary-review-r204-20261016.md).
