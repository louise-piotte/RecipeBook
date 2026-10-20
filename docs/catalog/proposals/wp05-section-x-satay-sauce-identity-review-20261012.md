# WP05 Section X: satay-sauce identity review

- **Reviewed:** 2026-10-12.
- **Decision:** add identity-only `satay sauce / sauce satay` in `SAUCE_AND_CONDIMENT`, with no aliases, forms, recipe links, measures, conversions, yields, or substitutions.
- **Exact scope:** bottled or prepared Southeast Asian sauce identified by the product source as satay sauce. Keep satay paste, peanut sauce, satay dishes, and named satay marinades separate.

## Evidence and naming

A Québec manufacturer lists `Satay aux Arachides` and describes the product as `sauce Satay`; its formula contains peanut butter [S01]. Maxi's current French product listing includes `Sauce satay aux arachides Souvenirs de Szechwan` [S02]. La Pimenterie, a Montréal maker, describes its `Satay Satire` as a satay sauce with 0% peanuts, using roasted edamame and coconut milk [S03]. Together the sources support the condiment identity and Québec French borrowed wording `sauce satay`. They do not establish peanut sauce as an alias: peanut content varies among products.

Do not add `peanut sauce / sauce aux arachides`, `satay paste / pâte de satay`, `sate`, `satay marinade`, or the bare dish name as aliases. Keep measurement and substitution research `not_yet_researched`; no source in this review supports reusable numeric or replacement behavior.

## Ownership and recipe demand

A normalized exact-key scan across active references, forms, legacy candidates, and ledger identity IDs found no owner for `satay sauce` or `sauce satay`. Neighboring active identities include Thai curry pastes, sambal oelek, sambal matah, and Thai sweet chili sauce; none owns either exact phrase. Recipe 095 is titled *Satay* and describes peanut dipping sauce, but its ingredient list builds that sauce from coconut milk, brown sugar, red curry paste, fish sauce, soy sauce, lime juice, spices, and peanut butter; it has no premade satay-sauce line. Across 114 manifest-listed recipes and 1,123 ingredient rows, there are zero satay ingredient-row hits. Keep recipe 095's ingredients and links unchanged.

The current complete-phrase picker will return this one sauce identity for the qualified query `satay sauce`. Bare `satay` also finds this row while no satay paste identity is active. The plan continues to track satay paste separately; if a supported paste row is later added, review the broad query as a multi-result search.

## Source register

| ID | Source | Scope and limits |
|---|---|---|
| **S01** | Asia Sauce, [Satay aux Arachides](https://asiasauce.ca/). | Québec maker's French product heading, sauce description, and formula. This SKU contains peanuts; not a universal composition. |
| **S02** | Maxi, [Sauce satay aux arachides Souvenirs de Szechwan](https://www.maxi.ca/fr/alimentation/garde-manger/condiments-et-garnitures/marinades-et-sauces/sauces-de-cuisson/c/34570?page=1). | Current Canadian French retailer listing; one peanut-based 350 mL product. |
| **S03** | La Pimenterie, [Satay Satire](https://lapimenterie.com/en/products/satay). | Montréal producer identifies a peanut-free satay sauce made with roasted edamame and coconut milk. Product-specific formulation. |

## Static checks if integrated

Recheck exact-key ownership, confirm the category and empty alias/numeric fields, rescan manifest recipes, validate the package and research ledger, regenerate the Kotlin index, and check UTF-8/no-BOM and scoped whitespace. This review changes database JSON only, so no app tests or emulator run is required under the user's rule.
