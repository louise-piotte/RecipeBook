# WP02/WP03/WP04 R767–R769 gap-review integration

Date: 2026-10-18

## Decisions

- **R767 — Holy Crap Superseed cereal family:** completed the bilingual family follow-up and retained the R726 hold. The maker’s current pages identify four English products and SKUs, while the French retailer assortment does not map each blend description to its product SKU. No reference, source, or measurement was allocated. See the [R767 proposal](../../proposals/wp03-section-f-next-open-gap-review-r767-20261018.md).
- **R768 — Job’s-tears flour:** updated the existing `ingredient-ref-jobs-tears-flour` ledger row with two supported, formula-scoped findings from Watanabe et al.’s cookie and crepe trials. Nisshin Flower is linked to the existing Japanese weak-wheat-flour class, without asserting equivalence to Nisshin Violet or generic cake flour. The R755 beverage observation and unsupported reusable measurement state remain unchanged. No active substitution rule or recipe link was added. See the [R768 proposal](../../proposals/wp02-a6-next-gap-review-r768-20261018.md).
- **R769 — Atlantic herring:** added `whole Atlantic herring / hareng de l’Atlantique entier` under verified *Clupea harengus*. The form is state-neutral, with empty match terms and null density. Fresh/frozen state, cleaning condition, retail weight, and generic herring terms remain outside the form. No measure, conversion, yield, recipe link, or substitution was added. See the [R769 proposal](../../proposals/wp04-section-p-next-open-gap-review-r769-20261018.md).

## Package snapshot

- 1,857 ingredient references and 188 forms.
- 2,254 research-ledger records, 10,578 source entries, 8,917 distinct source IDs, and 7,564 distinct source URLs.
- 114 manifest-listed recipes and 1,123 structured ingredient rows. The three reviews found no matching recipe demand or direct recipe links.

The package totals are unchanged for references because this batch adds only a form and ledger evidence. R769 adds one form ledger record, four new source IDs/URLs, and reuses two existing DFO identity sources. R768 refreshes its already-owned article source in place. R767 creates no ledger source or record.

## Static verification

- `python3 tools/seed_package/normalize_bundled_seed_package.py --check` — bundled seed package is already normalized; schema and ledger linkage validation passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — generated catalog is current at 1,857 references.
- Reviewed exact form/reference and finding/source ownership, the species-qualified picker projection, all manifest-listed recipe files and ingredient rows, UTF-8 without BOM, escaped Unicode in bundled JSON, local Markdown links, mojibake markers, and scoped whitespace.
- No software tests, build, emulator run, or deployment were performed. The database changes are JSON-only and the remaining change records a hold, so `AGENTS.md` does not require testing.

Sections A6, F, and P remain open.
