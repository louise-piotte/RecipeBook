# WP02 Chana Sattu Identity (B1/B6)

- **Owner:** WP02 / WP10 integration lead
- **Reviewer:** independent bilingual Québec French culinary reviewer — pending
- **Status:** identity integrated and verified; independent bilingual review remains pending
- **Research date:** 2026-10-06
- **Scope:** Identify the source-defined roasted Bengal gram product Chana Sattu and select English and Québec French display/search names. Keep generic chickpea flour/besan and sattu made from other grains outside this identity.

## Accepted identity

| Stable ID | English / fr-CA display | Aliases | Category |
| --- | --- | --- | --- |
| `ingredient-ref-chana-sattu` | chana sattu / farine de sattu | EN: `roasted Bengal gram flour`, `roasted chickpea flour`; FR: `farine de pois chiches grillés` | `FLOUR_AND_STARCH` |

FSSAI names Chana Sattu as Roasted Bengal Gram Flour and defines it as flour ground from roasted
gram (*Cicer arietinum*) [WP02-S136]. eNAM lists Chickpea Flour (Besan) and Roasted Bengal Gram
Flour (Chana Sattu) as separate commodity entries [WP02-S137]. The sources support a separate,
roasted chickpea-flour product identity, not equivalence with generic chickpea flour.

Canadian English and French product pages use Sattu / roasted chickpea flour and `farine de sattu`
/ `farine de pois chiches grillés` [WP02-S138–S140]. These retailer names support localization only;
vendor claims about nutrition, health, organic certification, or culinary performance are not
imported. The catalog keeps the qualified English name `chana sattu`; it does not store bare
`sattu`, `besan`, `gram flour`, `chickpea flour`, or `farine de pois chiche` as aliases. The complete
display and qualified names still let users recognize the product. A search for the broad phrase
`chickpea flour` can show both this row and generic chickpea flour so the user can choose.

The row has no density, unit mappings, forms, conversions, yields, measurements, or substitutions.
Fine/coarse grades, nutritional values, and replacement claims are outside this identity batch.

## Catalog and recipe audit

Before integration, the active reference catalog and 114 bundled recipe JSON files had no Sattu,
roasted Bengal gram, or roasted-chickpea-flour term. The existing `ingredient-ref-chickpea-flour`
row is `chickpea flour / farine de pois chiche`, with only the Canadian French plural alias
`farine de pois chiches`; it remains unchanged. No recipe line was changed.

## Sources

Sources were accessed on 2026-10-06.

- **WP02-S136 — FSSAI, Food Safety and Standards Regulations, Chapter 2.4:** [official cereal and
  cereal-products chapter](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals%20and%20Cereal%20products.pdf).
  Section 2.4.33 names Roasted Bengal Gram Flour (Chana Sattu) and defines the flour as ground from
  roasted gram (*Cicer arietinum*). No standards or numeric values are imported.
- **WP02-S137 — eNAM, Commodity list:** [official commodity list](https://enam.gov.in/commodity/commodity-list).
  Lists Chickpea Flour (Besan) and Roasted Bengal Gram Flour (Chana Sattu) separately.
- **WP02-S138 — Spice Divine, Sattu bio 24 Mantra:** [Canadian French product
  page](https://spicedivine.ca/fr/products/24-mantra-organic-sattu-roasted-chickpea-flour-1kg).
  Its French heading says `Sattu ... (farine de pois chiches grillés)`; the vendor's nutrition and
  performance claims are not imported.
- **WP02-S139 — Spice Divine, 24 Mantra Organic Sattu:** [Canadian English product
  page](https://spicedivine.ca/products/24-mantra-organic-sattu-roasted-chickpea-flour-1kg).
  Its heading says `Sattu (Roasted Chickpea Flour)`; this is product-name evidence only.
- **WP02-S140 — Walmart Canada, Angur Farine de Sattu:** [French-market product
  page](https://www.walmart.ca/fr/ip/Angur-Farine-de-Sattu-Farine-de-Gramme-R-tie-2-lb-Faite-Partir-de-Pois-Chiches-R-tis-V-gane-non-OGM/22GLDNIKO26D).
  Uses `Farine de Sattu` and identifies the named product as roasted chickpea/Bengal gram flour;
  seller-provided health, nutrition, and culinary claims are not imported.

## Acceptance checks

| Check | State |
| --- | --- |
| FSSAI product definition and Besan boundary reviewed | Pass: roasted gram (*Cicer arietinum*) is explicit; eNAM lists Besan separately. |
| English and fr-CA product naming recorded | Pass: source-named `chana sattu / farine de sattu` and qualified roasted-flour variants only. |
| Catalog and 114-recipe audit | Pass: no matching entry or recipe-line use; no recipe changed. |
| Catalog test coverage | Pass: exact bilingual names, alias behavior, and generic chickpea boundary; included in 242 passing Android unit tests. |
| Package and ledger validation, generated index, Python package tests, encoding audit and diff check | Pass: package and ledger schemas valid; generated index current at 338 references; 9 Python tests passed; no BOM or literal non-ASCII in 125 bundled JSON files; `git diff --check` passed. |
| Android instrumentation | Pass: all 29 tests ran directly through AndroidJUnitRunner; 27 passed, 2 environment-gated assumption skips, 0 failures. The Gradle connected task could not install under emulator storage limits, so the compiled APKs were installed directly for the same full suite. |
| Pixel 9a / Android 16 API 36 searches and restored French home | Pass: qualified English and accent-folded French aliases returned chana sattu; generic chickpea searches kept the reviewed boundary; the temporary draft was discarded and the French home was restored with 114 recipes. |
| Independent Québec French review | Pending. |

## Verification record

The normalized seed package contains 338 references; its reference JSON SHA-256 is
`7a230d9f9f2c1488f8403ceb61b595e419da551f766c40d6fb4cab8d1a9052ff`. The ledger contains 493
records; its current SHA-256 is
`ca13b14ea14750dbe6f66ab9cedd8dbabbb81c4dac4424c0eae44bee034f6b25`. The generated Kotlin catalog
was regenerated at 338 references. Normalization made no additional changes; package validation,
ledger schema, generated-index check, 9 Python package tests, 242 Android unit tests, encoding audit,
and diff check all passed. The connected Gradle task reported `INSTALL_FAILED_INSUFFICIENT_STORAGE`
before tests began. Installing the compiled APKs directly and running the full AndroidJUnitRunner
returned 29 tests: 27 passed, 2 environment-gated skips, no failures. The app was redeployed from a
fresh project-only emulator state, and its French home shows all 114 recipes.

Expected picker coverage:

- English: `chana sattu` and `roasted Bengal gram flour` show the new row. Broad `chickpea flour`
  displays both the generic and roasted rows.
- Québec French: `farine de sattu` and the accent-folded query `farine de pois chiches grilles`
  show the new row; singular `farine de pois chiche` returns the generic chickpea-flour row.
- Broad English `chickpea flour` shows both rows for explicit selection. `besan` remains unassigned.

Screenshots to record:

- English: `pixel9a-chana-sattu-picker-en.png`,
  `pixel9a-roasted-bengal-gram-flour-picker-en.png`, and
  `pixel9a-chickpea-flour-boundary-en.png`.
- Québec French: `pixel9a-farine-de-sattu-picker-fr-ca.png`,
  `pixel9a-farine-de-pois-chiches-grilles-picker-fr-ca.png`, and
  `pixel9a-chickpea-flour-boundary-fr-ca.png`.
- Restored library: `pixel9a-sattu-home-restored-fr-ca-114.png`.

## Remaining work

- Obtain independent Québec French review.
- Continue generic chickpea/besan decisions, other roasted gram products, generic toasted-barley
  equivalence, other functional toasted flours, and remaining B1/B6 work separately.
