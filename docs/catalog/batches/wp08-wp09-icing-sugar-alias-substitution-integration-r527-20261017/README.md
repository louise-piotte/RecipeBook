# WP08 / WP09 R527 integration — icing sugar identity and substitution

- **Date:** 2026-10-17
- **Identity:** Verified the existing `icing sugar / sucre à glacer` reference and its aliases without changing active ingredient-reference data.
- **Substitution:** Recorded one volume-based, source-bounded homemade powdered-sugar formula and one blocked weight-based batter/dough context.
- **Measurement:** Preserved all nine source-specific icing-sugar observations and `measurementState: blocked_pending_evidence`.
- **Runtime behavior:** No form, density, unit mapping, conversion, active substitution rule, recipe-line link, recipe edit, or manifest change.

## Identity and picker result

OQLF identifies `sucre glace` as a preferred French term and gives `icing sugar` and `confectioner's sugar` in English. TERMIUM Plus directly supports Québec `sucre en poudre`; Metro uses `Sucre à glacer` on a French Redpath product listing. The Canadian Sugar Institute supports `sucre en poudre`, and Collins documents `confectionery sugar` as a British English term. These sources support the current aliases, so none were added or removed.

The current phrase-first picker returns icing sugar alone for `sucre glace`, `sucre en poudre`, `icing sugar`, `powdered sugar`, `confectioners' sugar`, and `confectionery sugar`. `Sucre à glacer` returns both the icing-sugar entry and the separate `fondant sugar / sucre à glacer fondant` entry. Keep these as separate visible identities; the broader French picker check remains open. Do not add `sucre fondant` as an alias.

## Substitution evidence

The University of Nebraska–Lincoln substitution table pairs 1 cup confectioners’ or powdered sugar with 1 cup granulated sugar plus 1 tablespoon cornstarch, processed with a metal blade until powdery. King Arthur recommends volume use for dusting and weight use for batter or dough, but does not report the finished homemade powder’s mass. The ledger therefore records the one-cup formula as volume-based evidence and leaves mass-based batter/dough use blocked. It does not establish a mass conversion or recipe-specific performance across the 30 existing linked recipe rows.

The substitution evidence is stored only on the existing `ingredient-ref-icing-sugar` record. There is no `ruleId`; future runtime substitution would need separately constrained context and reviewed behavior.

## Demand, ownership, and validation

The manifest-listed corpus contains 30 existing icing-sugar ingredient rows across 26 of 114 recipes. These lines cover frosting, filling, glaze, pastry, confectionery, and dusting uses; no line was edited or linked to the generic finding.

Seven unique source IDs were added to the existing icing-sugar ledger record. The King Arthur and Canadian Sugar Institute URLs were already used by other sugar records; OQLF, TERMIUM Plus, Metro, Collins, and University of Nebraska–Lincoln URLs had no prior ledger owner. No source ID collision was found.

The ledger schema, required source ownership, query projection, manifest corpus, UTF-8/no-BOM, local links, and scoped whitespace were checked. No software tests, build, emulator run, or deployment were needed for this evidence-only JSON update under `AGENTS.md`.

See the [R527 proposal](../../proposals/wp08-icing-sugar-substitution-review-r527-20261017.md). Broader WP08 substitution and WP09 naming coverage remain open.
