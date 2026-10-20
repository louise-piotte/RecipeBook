# WP03 Section I cashew-butter evidence integration (R376)

Recorded formulation and portion evidence under the existing `ingredient-ref-cashew-butter` ledger record. The verified reference, `beurre de cajous` alias, empty form list, null default density, and empty unit mappings remain unchanged.

## Evidence retained

- Health Canada CNF food code 2548 lists 15 mL = 16.2 g, 30 mL = 32.4 g, and 100 mL = 108.1 g. These remain food-code-specific `portion_weight` observations, with no density or recipe conversion. [CNF serving-size page](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2548&lang=eng&wbdisable=true)
- The Québec Food Directory lists one tablespoon (15 g) for Mille et Une Noix's 225 g organic SKU, GTIN 628110294531. This remains SKU-specific and does not define a shared tablespoon weight. The directory identifies organic cashews and sunflower oil, while the maker's French product page makes the same formula claim and its English page says cashews only. Both maker-page options were sold out at review, and the discrepancy remains unresolved. [Directory record](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8207927), [French page](https://www.milleetunenoix.ca/products/cashew-butter), [English page](https://www.milleetunenoix.ca/en/products/cashew-butter)
- Umano says its Sherbrooke product contains cashews only; Aliments du Québec repeats the same product statement. These are product-specific claims, not a generic formula. [Umano product page](https://www.umano.ca/en/products/beurre-de-noix-de-cajou-biologique-equitable), [Aliments du Québec listing](https://alimentsduquebec.com/aliments-dici/collation/beurre-de-cajou-biologique)

The ledger's measurement state is `researched_supported` for these cited portions only. Substitution research remains `not_yet_researched`. No aliases, forms, recipe links, density, unit mapping, conversion, yield, or substitution were added.

## Validation

- Seed package normalization check and validation-only pass.
- Research-ledger schema validation passes.
- Generated ingredient catalog freshness check passes at 1,698 references; references did not change.
- The manifest-ordered 114-recipe corpus scan found no cashew terms (1,123 ingredient rows).
- The six new source IDs and URLs had no exact matches in the ledger or archived catalog documents before this integration.
- No software tests, Gradle tasks, emulator run, or deployment were performed because this change only adds database JSON research data, as directed in `AGENTS.md`.
