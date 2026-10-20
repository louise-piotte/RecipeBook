# WP03 Section I chopped pecans form integration — 2026-10-12

## Decision

Added `ingredient-form-pecans-chopped` (`chopped pecans / pacanes hachées`) under
`ingredient-ref-pecans`. The form records only the chopped preparation state. Sources vary in particle
size, including one that says “coarsely chopped,” so no shared cut size is asserted.

Linked four source-attributed recipe rows: 025#10, 026#6, 109#2, and 114#20. Their original text,
amounts, units, and preparation strings remain unchanged. Recipes 053#13 and 067#4 also request
chopped pecans, but have no source metadata and remain unlinked pending provenance.

The current [Preppy Kitchen pecan pie card](https://preppykitchen.com/pecan-pie/) publishes 1½ cups
(180 g) coarsely chopped pecans; bundled row 109#2 preserves 1/2 cup. The link added here relies only
on the preparation wording. This batch does not reconcile the quantity.

No measurement observation, density, unit mapping, conversion, yield, or substitution was added.
Other nut and seed forms remain open. See the [source review](../../proposals/wp03-section-i-chopped-pecans-form-review-20261012.md).

## Evidence

- [Cuisinez, Télé-Québec — Carrés au sirop d’érable et pacanes](https://cuisinez.telequebec.tv/recettes/6555/recette-de-carres-au-sirop-d-erable-et-pacanes): French wording `pacanes ... hachées`.
- [Eagle Brand — Magic Cookie Bars](https://www.eaglebrand.ca/en/recipes/bars-and-cookies/magic-cookie-bars): recipe card names chopped pecans.
- [Preppy Kitchen — The Best Pecan Pie](https://preppykitchen.com/pecan-pie/): recipe card names coarsely chopped pecans; quantity remains outside this form decision.
- [The Hungary Soul — Maple Pecan Cranberry Squares](https://thehungarysoul.com/maple-pecan-cranberry-squares-2/): introductory recipe description uses “chopped pecans.”
- Sally’s Baking Addiction source `WP03-HI-GAP-20261011-S07` already in the ledger: the Upgraded German Chocolate Cake card names chopped pecans and gives a recipe-specific 1 cup / 125 g pair.

## Static verification

- Bundled package validation passed.
- Ingredient-reference normalization passed; generated catalog is current at 1,243 references.
- Research ledger validation passed with 1,543 records and 0 errors.
- The new English and French form terms have unique catalog ownership. Four sourced recipe rows link to the form; the two source-less rows remain unlinked.
- All 114 recipes and 1,123 ingredient rows remain present. The recipe corpus is 753,291 bytes with manifest-ordered SHA-256 `4e925bc5664aef28449ce5235a1282502541bb46a512aa43345c9d8fbe4cdd06`.
- Updated JSON has no BOM and stores non-ASCII text as Unicode escapes. Scoped `git diff --check` passed.
- No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## Snapshot after integration

| Artifact | Count | SHA-256 |
|---|---:|---|
| `ingredient-forms.v1.json` | 88 forms | `407ee9c0b076075bc8c017436469294ed0de37a2b37f96224f0e578af6c6de5d` |
| `research-ledger.v1.json` | 1,543 records; 5,351 source entries; 4,392 distinct source IDs | `406d07283df4334aaf70b6a9d264e12f77ba59beb8897e9012efef0c3e7336fb` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,291 bytes | `4e925bc5664aef28449ce5235a1282502541bb46a512aa43345c9d8fbe4cdd06` |
