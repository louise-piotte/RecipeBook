# WP02/WP03/WP04 R178 gap-review integration

**Integrated:** 2026-10-16

**Plan:** [Global ingredient catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt)

**Reviewed proposals:** [Treculia africana seed starch](../../proposals/wp02-b3-treculia-africana-seed-starch-boundary-review-r178-20261016.md), [Sunny Boy Beta-glucan Hot Cereal](../../proposals/wp03-section-f-sunny-boy-beta-glucan-hot-cereal-boundary-review-r178-20261016.md), and [herring fillets in tomato sauce](../../proposals/wp04-section-p-canned-herring-fillets-tomato-sauce-boundary-review-r178-20261016.md).

## Integrated decisions

- **WP02 B3 — Treculia africana seed starch:** Kept the isolated seed-starch fraction outside active references and the research ledger. The primary study is laboratory extraction research; Canadian-facing evidence covers whole Ukwa seed, not culinary starch. Keep it distinct from whole-seed flour and *Artocarpus* breadfruit starch.
- **WP03 Section F — Sunny Boy Beta-glucan Hot Cereal:** Added identity-only `Sunny Boy Beta-glucan Hot Cereal / céréales chaudes Sunny Boy au bêta-glucane` as a separate `GRAIN_AND_CEREAL` product. Root accepted a provisional descriptive French display despite the proposal's hold recommendation: the current manufacturer and Canadian grocery pages establish a distinct branded cereal, and OQLF supports the French lexical term `bêta-glucane`. The display is not presented as a source-attested package title. Keep blend proportions, milling details, serving observations, preparation directions, and substitution behavior product-specific; none is active catalog data.
- **WP04 Section P — herring fillets in tomato sauce:** Added identity-only `herring fillets in tomato sauce / filets de hareng à la sauce tomate` as a species-neutral `PROTEIN` market group. Root accepted a narrower identity despite the proposal's hold recommendation because current Canadian and Québec retail listings share the named fish cut and sauce preparation. Do not assign species, cure, heat process, drained amount, or universal can measure. The Ilios Atlantic-herring product remains SKU-specific and is not transferred to this identity.

The three reviews found no matching demand in the manifest-listed **114 recipes / 1,123 ingredient rows**. No forms, aliases, active measures, mappings, recipe links, conversions, yields, or substitutions were added. The two accepted product identities have no recipe links.

## Source registration

- Added two current Canadian retail sources to the herring identity's ledger record.
- Added the Voilà listing and OQLF lexical record to the Sunny Boy Beta-glucan ledger record; reused the existing Sunny Boy manufacturer source ID and URL.
- No ledger record was added for Treculia seed starch. No research source URL was registered twice under a new source ID.

## Static validation

- Bundled seed package normalization/validation, ingredient-reference normalization, and generated Kotlin catalog freshness passed.
- JSON parse, UTF-8/no-BOM and escaped-Unicode checks passed. The package/schema/source linkage check passed.
- Ownership, picker projection, and manifest-ordered recipe corpus checks passed; no R178 product text or links occur in the recipe bundle.
- Local Markdown links and scoped whitespace checks passed.
- Totals: **1,555 references**, **122 forms**, **1,900 ledger records / 8,155 source entries / 6,966 distinct source IDs / 5,762 distinct source URLs**; **114 recipes / 1,123 ingredient rows**.
- No software tests, builds, emulator runs, or deployments were performed. The catalog additions are database JSON data under the updated `AGENTS.md` rule.

Broader WP02 B2/B3, Section F, and Section P coverage remains open.
