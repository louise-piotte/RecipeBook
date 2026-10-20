# WP05 Japanese gari identity review — R623 (2026-10-18)

**Status:** accepted and integrated. See the [R623 integration README](../batches/wp05-japanese-gari-identity-integration-r623-20261018/README.md).

## Decision

Add an identity-only Japanese sushi-ginger reference:

- ID: `ingredient-ref-japanese-gari`
- Category: `SAUCE_AND_CONDIMENT`
- English: `Japanese gari (pickled ginger)`
- French: `gingembre mariné pour sushi`
- English alias: `sushi ginger`
- French alias: `gingembre pour sushi`

The English name keeps the Japanese term explicit while identifying the ingredient. The French display follows Québec sushi terminology from Metro and MITO; it is not presented as an OQLF preferred term. Keep this row distinct from `ingredient-ref-beni-shoga` and the existing cassava `ingredient-ref-gari` / alias `garri`. Do not add an unqualified `pickled ginger` alias or colour, sweetness, cultivar, or serving-form claims.

## Repository and recipe findings

Before R623, the package contained 1,824 active ingredient references, 156 forms, 56 legacy candidates, and 2,196 ledger records. The bundled corpus contains 114 recipes and 1,123 ingredient rows. No recipe ingredient line requests gari, garri, sushi ginger, Japanese pickled ginger, beni shoga, or sushi ginger in French. Three rows request ground ginger; they refer to the existing spice identity and are not preserved ginger.

The only active `gari` reference was `ingredient-ref-gari`, categorized `FLOUR_AND_STARCH`, with English alias `garri`. The separate `ingredient-ref-beni-shoga` already represents red pickled ginger and has the English alias `red pickled ginger`. No exact ID or label existed for Japanese gari, sushi ginger, `gingembre mariné pour sushi`, or `gingembre pour sushi`.

## Product and terminology boundary

Endo Foods defines gari as sweetened pickled ginger and lists GARI and BENI SHOGA as separate product lines. Québec sources identify gari as sushi ginger and use the local French wording `gingembre mariné`; MITO’s sushi article specifically uses `gingembre mariné pour sushi` and describes thinly sliced ginger prepared with vinegar, sugar, and salt. Loblaws lists Bento Gari under its sushi collection and returns the sushi-ginger products Rooster `Gingembre pour sushi`, Heiwa `Gingembre Sushi`, and Bento `Gari` in its French search results.

These sources support a separate identity and bilingual search entry. They do not establish one commercial formula, colour, sweetness level, exact slice thickness across brands, preparation state beyond pickled ginger, nutrition, density, or household measure. The 340 g Loblaws and 430 g MITO package sizes are SKU quantities only. The source-specific MITO preparation is not generalized to all gari products.

## Picker projection

The reference search implementation matches complete normalized phrases across names and aliases, then uses partial matching. R623 preserves the cassava result and makes the homonym visible:

| Query | Expected result after R623 |
|---|---|
| `gari` | West African `gari` and `Japanese gari (pickled ginger)`, with distinct English/French labels |
| `garri` | West African cassava `gari` only |
| `Japanese gari`, `sushi ginger` | Japanese gari only |
| `gingembre mariné pour sushi`, `gingembre pour sushi` | Japanese gari only |
| `pickled ginger`, `red pickled ginger`, `beni shoga` | Japanese gari and/or the existing beni shoga row where the full phrase is present; the two labels remain distinct |

No form hints or automatic mapping were added. The plain `gari` query intentionally shows the homonym as two separate, labelled identities rather than assigning either meaning to the other.

## Integration and verification

- Added one `SAUCE_AND_CONDIMENT` reference and its identity-ledger record; updated the existing cassava-gari ledger decision to document the resolved collision policy.
- Added no forms, measurements, densities, unit mappings, recipe links, conversions, yields, or substitutions. Recipe data is unchanged.
- Counts after integration: 1,825 active references, 156 forms, 56 legacy candidates, 2,197 ledger records, and 114 recipes / 1,123 ingredient rows.
- Static package validation and normalization, generated-index freshness, source/ID ownership, bilingual picker projection, recipe scan, encoding, relative links, and scoped whitespace checks are recorded in the [integration README](../batches/wp05-japanese-gari-identity-integration-r623-20261018/README.md).
- No software tests, builds, emulator checks, or deployment were run. This change only adds bundled database JSON data and catalog documentation, and `AGENTS.md` says testing is not needed for database-JSON-only additions.

## Sources

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-JP-PANTRY-20261010-S23` | Endo Foods, [Product Information](https://www.endo-foods.co.jp/english/products/) (existing ledger source). | Defines gari as sweetened pickled ginger and lists gari and beni shoga separately. Manufacturer scope; it does not address the African cassava homonym. |
| `WP05-JP-PANTRY-20261010-S24` | OQLF, [sushi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359752/sushi) (existing ledger source). | Uses `gingembre mariné` for sushi accompaniment. It does not name gari or distinguish preserved-ginger products. |
| `WP05-JAPANESE-GARI-R623-20261018-S01` | Metro, [Secrets sushi](https://www.metro.ca/fr/recettes-et-occasions/dossiers-speciaux/cuisine-du-monde/cuisine-japonaise/secrets-sushi). | Its indexed French glossary defines gari as marinated ginger served between sushi bites. Direct page fetch returned 403; the indexed text supports terminology only. |
| `WP05-JAPANESE-GARI-R623-20261018-S02` | MITO Sushi, [Le gingembre mariné : l’ingrédient qui réveille vos sushis](https://mito.ca/gingembre-marine/). | Québec sushi specialist says marinated ginger is also called gari, uses `gingembre mariné pour sushi`, and describes thinly sliced vinegar-pickled ginger. Culinary account, not a universal commercial formula. |
| `WP05-JAPANESE-GARI-R623-20261018-S03` | MITO Sushi, [Gingembre mariné – 430 g](https://mito.ca/produit/gingembre-marine/). | Confirms a Québec-facing sushi accompaniment product under the French display wording. The 430 g package size is not a reusable measure. |
| `WP05-JAPANESE-GARI-R623-20261018-S04` | Loblaws Québec, [Sushis – Repas frais](https://www.loblaws.ca/fr/collection/sushi). | Lists Bento Gari 340 g under sushi products. The SKU quantity is package-size evidence only. |
| `WP05-JAPANESE-GARI-R623-20261018-S05` | Loblaws Québec, [search results for “sushi ginger”](https://www.loblaws.ca/fr/search?search-bar=sushi+ginger). | Search results show Rooster `Gingembre pour sushi`, Heiwa `Gingembre Sushi`, and Bento `Gari`. This supports useful search wording, not a single formulation across brands. |

**Encoding:** UTF-8 without BOM.
