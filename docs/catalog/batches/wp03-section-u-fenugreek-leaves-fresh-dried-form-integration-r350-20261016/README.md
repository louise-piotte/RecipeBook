# WP03 Section U — Fenugreek leaf forms integration (R350, 2026-10-16)

## Integrated data

Kept the existing `ingredient-ref-fenugreek-leaves` display `feuilles de fenugrec / fenugreek leaves`, its `methi leaves` and `kasuri methi` aliases, and the distinct `ingredient-ref-fenugreek-seeds` identity. Added two forms under the leaf reference:

- `ingredient-form-fenugreek-leaves-fresh`: `fresh fenugreek leaves / feuilles de fenugrec fraîches`, with exact singular English and French match terms.
- `ingredient-form-fenugreek-leaves-dried`: `dried fenugreek leaves / feuilles de fenugrec séchées`, with exact singular terms plus `kasuri methi` and Canadian retail spelling `kasoori methi` as dried-form terms.

The dried form is whole leaves. Leaf powder remains outside this form. No density, unit mapping, measurement, conversion, yield, recipe link, or substitution was added. The ledger marks both form identities verified, with no supported general measurement or substitute.

## Evidence and limits

- Health Canada’s [French crop-group table](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html) lists fresh and dried fenugreek-leaf commodities for *Trigonella foenum-graecum*. This is a pesticide-residue classification, not a recipe measure or naming standard.
- [Fine India Grocers](https://fineindia.ca/products/fresh-methi-leaves-bunch) labels the fresh product `Fresh Methi Leaves`; its bunch listing is not a reusable quantity.
- [Bulk Mart Canada](https://bulkmart.ca/fr/products/premium-spices-dried-fenugreek-leaves-720-g) uses the French product wording `Feuilles de fenugrec séchées` and identifies kasoori methi. Its package size and listing wording remain product-specific.
- [Walmart Canada](https://www.walmart.ca/en/ip/MDH-Kasoori-Methi/6000196835929) labels the product MDH Kasoori Methi and specifies dried fenugreek leaves.
- The previously ledgered [Metro Québec listing](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/legumes-exotiques/feuilles-de-fenugrec/p/4994) supports French leaf naming and fresh/dried product states. [Venus Dehydrates](https://www.dehydratedvegetables.in/kasuri-methi.html) distinguishes whole dried leaves from leaf powder.

Product package amounts, including the 720 g Bulk Mart listing and the Fine India bunch, remain source-specific observations and were not added as general measures. No fresh-to-dried conversion is inferred.

## Picker and corpus review

Expected exact phrase behavior after the forms are added:

| Query | Result |
|---|---|
| `fresh fenugreek leaves`; `feuilles de fenugrec fraîches`; singular equivalents | Fenugreek leaves, fresh form hint |
| `dried fenugreek leaves`; `feuilles de fenugrec séchées`; singular equivalents | Fenugreek leaves, dried form hint |
| `kasuri methi`; `kasoori methi` | Fenugreek leaves, dried form hint |
| `methi leaves` | Fenugreek leaves, no forced state |
| `methi` | Fenugreek leaves due to existing multiword partial-match behavior; no bare alias was added |
| `fenugreek`; `fenugrec` | Fenugreek leaves and fenugreek seeds remain separate results |
| `feuilles de fenugrec`; `graines de fenugrec` | Respective leaf and seed identities |

The scan of 114 manifest-listed recipes and 1,123 ingredient rows found no matching fenugreek, fenugrec, or methi demand.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py` completed with no package files needing normalization.
- No generated ingredient-reference index update was needed because reference identities and aliases did not change; the new data is in the forms JSON.
- Software tests and emulator checks were not run because this change only adds database JSON data under the updated `AGENTS.md` rule.
