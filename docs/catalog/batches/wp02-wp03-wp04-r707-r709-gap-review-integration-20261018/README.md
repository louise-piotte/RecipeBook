# WP02/WP03/WP04 R707–R709 integration — 2026-10-18

Integrated three independent gap reviews across flour/milling, grain products, and seafood.

## Decisions

- **R707 — Wheatlets and wheat middlings:** Recorded Ardent Mills’ statement that code 10287 Wheatlets is “ideal where wheat middlings are required” as a blocked, source-scoped lead on the existing `ingredient-ref-wheatlets` ledger record. The USDA AMS feedstuffs glossary defines middlings as a mixture of milling fractions, but neither source identifies a human-food recipe, replacement direction, middlings grade, method, or proportion. No alias, form, or active substitution rule was added. See the [proposal](../../proposals/wp02-a7-wheatlets-substitution-review-r707-20261018.md).
- **R708 — `pori`:** Held the term outside `ingredient-ref-puffed-rice` aliases. Tamil Nadu’s Crop Production Guide calls expanded rice from parboiled paddy “pori”; a TNAU variety page uses “Pori (Popped rice)” without describing the process. Keep the existing `puffed rice / riz soufflé`, `muri`, and `murmura` unchanged pending authoritative scope clarification. No shared catalog or ledger data changed. See the [review](../../proposals/wp03-section-f-puffed-rice-pori-alias-boundary-review-r708-20261018.md).
- **R709 — fresh whole Atlantic salmon:** Added `ingredient-form-atlantic-salmon-fresh-whole` under `ingredient-ref-atlantic-salmon`, with `fresh whole Atlantic salmon / saumon de l’Atlantique frais entier` and the qualified terms `whole Atlantic salmon` / `saumon atlantique entier`. La Mer’s paired pages support fresh product and a selectable whole cut. The form does not claim scaled, gutted, cleaned, skinned, wild, farmed, or origin status. The listed 5 kg format remains product-specific. No measurements, mappings, recipe links, conversions, yields, or substitutions were added. See the [proposal](../../proposals/wp04-section-p-atlantic-salmon-fresh-whole-form-review-r709-20261018.md).

## Package state

- 1,841 ingredient references, 174 forms, 114 recipes, and 1,123 ingredient rows.
- 2,224 research-ledger records, 10,420 source entries, 8,792 distinct source IDs, and 7,441 distinct source URLs.
- The only active catalog change is a database JSON form addition; no software tests, build, emulator run, or deployment were needed under `AGENTS.md`.

## Static verification

Seed-package normalization and schema validation, research-ledger schema validation, generated import-index freshness, identifier/source ownership, phrase-first picker projection, manifest recipe corpus, UTF-8/no-BOM, local links, and scoped whitespace checks are recorded for this integration. The exact queries and results are summarized here:

- `fresh whole Atlantic salmon`, `whole Atlantic salmon`, `saumon de l’Atlantique frais entier`, and `saumon atlantique entier` return the Atlantic salmon parent with the new form hint.
- Unqualified `whole salmon` and `saumon entier` remain empty. Broad `salmon` / `saumon` stay at 10 references; `whole fish` / `poisson entier` remain owned by whole tilapia.
- `pori`, `pori urundai`, and `popped rice` remain empty; `puffed rice` / `riz soufflé`, `muri`, and `murmura` retain their existing owner.
- The 114-recipe / 1,123-row corpus contains no Wheatlets, middlings, `pori`, or candidate salmon-form demand; recipe 077’s generic salmon-fillets line remains unchanged.
- The Wheatlets finding has no replacement, source allocates only its scoped lead, and the active substitution-rule files remain unchanged.

No application tests, build, emulator, or deployment were performed. Sections A7, F, and P remain open.
