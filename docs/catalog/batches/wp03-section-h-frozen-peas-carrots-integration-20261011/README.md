# WP03 Section H — frozen peas and carrots

Integrated one exact mixed frozen product discovered in recipe 078#14 as a separate `VEGETABLE_AND_AROMATIC` ingredient reference: `frozen peas and carrots / petits pois et carottes surgelés`. Linked only that row. Kept its original text, quantity `1`, unit `cup`, and bilingual frozen preparation unchanged. Standalone peas and carrots remain distinct.

The CFIA Canadian identity standard defines pea-first frozen peas and carrots separately from the reversed carrots-and-peas mixture. Its permitted component percentages establish a product boundary; they do not establish this recipe's ratio or a cup conversion. The linked publisher recipe suggests half a cup of peas and half a cup of sliced carrots only as a fallback for this recipe. A current bilingual ILIOS Foods listing uses the exact English and French product names for the same SKU. None of these sources supports a global measure, component ratio, density, yield, or substitution.

The evidence ledger records four source entries: [CFIA, Canadian Identity Standards, Volume 4, section 53](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4), [The Wholesome Dish, Shepherd's Pie](https://www.thewholesomedish.com/the-best-classic-shepherds-pie/), [ILIOS Foods, English catalog](https://www.iliosfoods.ca/products), and [ILIOS Foods, French catalog](https://fr.iliosfoods.ca/products). Measurement and substitution research remain open.

## Validation

- Bundled seed package validation passed.
- Ingredient-reference normalization and generated-catalog freshness checks passed.
- Research-ledger schema validation passed with 1,317 records and zero errors.
- UTF-8 without BOM and targeted diff checks passed.
- No tests or emulator run were needed because this change only adds database JSON data under `AGENTS.md`.

## Package state

- 1,028 ingredient references, 71 forms, 114 recipes, and 1,123 ingredient rows.
- 1,317 ledger records, 4,270 source entries, and 3,506 distinct source IDs.
- Reference JSON SHA-256: `c786ee7aa3aaa4fe470164ea4459befedb5e291642f9986ff283c1681b1e3149`.
- Form JSON SHA-256: `1db31d8f54262555a18e15173f2a69b0d164cad5d53bf14fad86dac390c7989a`.
- Recipe 078 JSON SHA-256: `112a229ae57e3cb16ed413c2d589e304617efc52bea9907e35172128a025ecae`.
- Research ledger SHA-256: `97db8ac58bed0722a336a0ed322508f2f1272f1bd2920b0ad8aef2c3b359252f`.
- Generated catalog SHA-256: `677d8146035ee95aee82db10b4487738454e1cb29ea7691e32b0ded2f6693d20`.
- Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.

The broad Section H and global catalog work remain open.
