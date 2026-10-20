# WP02 A4 White and Brown Rice Flour Source Grades

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** `in_review`
- **Research date:** 2026-10-06
- **Scope:** Resolve the Section 04 A4 white- and brown-rice source-grain grades. Keep generic `rice flour` as a family-level discovery identity; keep glutinous rice flour and rice starch distinct. Do not infer densities, measurements, or substitutions.
- **Input revision:** repository `HEAD` `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4`; pre-integration reference JSON SHA-256 `db2c505e090df9d45c641bb899d20b7c4da0f109e238bb3fc5433bedffaabcdb` (308 references); pre-integration research ledger SHA-256 `c4a9a5c70d72a144aae538dfd5ba4a8725a142c87d02524e063722d22611098e` (458 records); plan snapshot SHA-256 `d01a78deecbe1971d4b3b075ff25c063de14eb346699eb9e4e2f18a3e7cd6e55`; seed contains 114 recipe files.
- **Dependencies:** WP01 identity/evidence contract; WP02 A4 rice-flour review; WP10 canonical seed integration.

## Identity decision

| Stable ID | English / fr-CA display | Aliases | Evidence and boundary |
| --- | --- | --- | --- |
| `ingredient-ref-rice-flour` | rice flour / farine de riz | None | Keep as the family-level discovery term. OQLF says rice flour may be made from white or brown rice; do not silently resolve this unqualified term to either source grade. [S27, S77–S78] |
| `ingredient-ref-white-rice-flour` | white rice flour / farine de riz blanc | None | Distinct polished-rice flour product. Canadian manufacturer product listings pair the English and French names. Keep superfine grind and gluten-free packaging claims out of the general identity. [S77–S79] |
| `ingredient-ref-brown-rice-flour` | brown rice flour / farine de riz brun | None | Distinct bran-retaining source-grain flour product. Canadian suppliers use the bilingual product name; keep organic, wholegrain, package, and grind qualifiers out of general aliases. [S77–S80] |

All three records remain in `FLOUR_AND_STARCH`; densities are null, unit mappings and aliases are empty, and no forms, conversions, or substitutions were added. The brown and white source-grain grades are separate ingredient identities because the retained/removal-of-bran source changes the product, its color, texture, and flavor. The generic rice-flour record remains available without implying a default grade. Neither grade aliases glutinous rice flour or rice starch.

## Source register

Sources were accessed on 2026-10-06. Existing OQLF source `WP02-S27` is retained as the authority for the family-level term and its white/brown source note.

- **S77 — USA Rice, Rice Flour 101:** [Industry association article](https://www.usarice.com/thinkrice/detail-pages/blog/rice-flour-101-everything-you-need-to-know). Distinguishes brown flour milled with bran from white flour milled without it and describes differing color, texture, and flavor; no numerical or substitution claim is taken from this source.
- **S78 — QUeen Milling, product collection:** [Current Canadian mill products](https://www.queenmilling.ca/collections/all). Lists white rice flour and wholegrain brown rice flour as separate products.
- **S79 — QUeen Milling, French storefront:** [Current French-language product list](https://www.queenmilling.ca/fr). Lists *farine de riz blanc extra-fine* and *farine de riz brun complet superfine* separately.
- **S80 — SATAU / Cuisine Soleil, French product list:** [Current supplier catalog](https://satau.ca/fr/nos-produits/cuisine-soleil/). Lists standalone *farine de riz brun* products; the general display does not carry the supplier's organic, package-size, or certification qualifiers.

## Recipe and duplicate audit

Before integration, all 114 bundled recipe JSON files were searched for `white rice flour`, `brown rice flour`, `farine de riz blanc`, and `farine de riz brun`. No recipe ingredient line used these grades, so no recipe was relinked. Existing `ingredient-ref-rice-flour` remains unchanged as the unqualified family entry; `ingredient-ref-glutinous-rice-flour` remains a separate product.

## Integration and verification

Integration adds the two source-grade references and generated catalog entries, and extends
`BundledIngredientCatalogTest` to assert exact EN/fr-CA names, distinct IDs, separate exact search
keys, `FLOUR_AND_STARCH` category, empty aliases, null densities, and empty unit mappings. The
verification results below are complete; independent review and the remaining A4 scope stay open.

The final reference JSON has **310 records**, SHA-256
`40c44054cc34f1aa277e8f885b89ae2e8e7c472080b5ff1eb3cc18243af7bfaa`; the research ledger has
**460 records**, SHA-256
`454d4fac42ce4e8663ffbcfb93a5a539c80ed13294a2bb08f6a1ef4e6a33b37e`.

- `:app:testDebugUnitTest --no-daemon --console=plain`: 203 tests passed, zero failures/errors/skips.
- Python bundled-package tests: 9 passed. Seed-reference normalization, bundled-package validation
  and normalization, and generated Kotlin-catalog freshness checks passed.
- Pixel 9a / Android 16 instrumentation on the temporary 8 GB profile: 26 tests, 24 passed, two
  isolated-QA-package cases skipped, zero failures/errors. The original 6 GB AVD was left intact.
- `tools/deploy_to_pixel9a_emulator.sh` completed its test and debug-assembly tasks, installed the
  APK, and launched the app. The picker was checked at 1080×2424 in both editor languages:
  `rice flour` returned the brown, glutinous, family-level, and white results separately; exact
  French searches `farine de riz brun` and `farine de riz blanc` each returned their matching
  localized result. The French family query `farine de riz` showed the family, both grades, and
  glutinous flour as four separate results. The unsaved probe was discarded; the French home screen
  still showed `Toutes les recettes (114)`.
- All 124 bundled JSON files passed the UTF-8/no-BOM audit: no BOM, raw non-ASCII bytes, or known
  mojibake markers. Package validation also checked ledger schema and alias collisions; final
  `git diff --check` passed.

Live UI evidence: `pixel9a-rice-flour-family-grades-en.png`,
`pixel9a-rice-flour-family-grades-fr-ca.png`, and `pixel9a-rice-flour-home-fr-ca-114.png`.

## Remaining work

- Obtain independent bilingual Québec French review of `farine de riz blanc` and `farine de riz brun` and the family-versus-grade decision.
- Keep measurement and substitution evidence separate; no density, unit mapping, conversion, or replacement is active.
- Continue the remaining A4 flour review and the wider global catalog plan.
