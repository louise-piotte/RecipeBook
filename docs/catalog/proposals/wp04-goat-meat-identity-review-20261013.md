# WP04 animal-protein identity review — goat meat / viande de chevreau

- **Review date:** 2026-10-13.
- **Status:** Reviewed and integrated on 2026-10-13; the worker proposal itself made no shared-file changes.
- **Recommendation:** Add one identity-only `PROTEIN` reference for plain goat meat, displayed as **goat meat / viande de chevreau**. Use English alias `chevon` and French alias `viande de chèvre`; leave other aliases empty. No recipe link, form, measurement, density, unit mapping, conversion, yield, or substitution is supported.
- **Candidate ID:** `ingredient-ref-goat-meat`.

## Why this is an open candidate

The active WP04 checklist remains open for animal foods and reviewer-confirmed Canadian English / Québec French identities ([global plan, WP04](../../RecipeBook-global-ingredient-catalog-plan.txt#L612)). The older [protein/dairy identity packet](../batches/protein-dairy-identities.md) lists goat meat as a candidate family name, but does not allocate a reference, create a focused hold, or add a ledger record. The later [rabbit-meat review](wp04-rabbit-meat-quebec-identity-review-20261011.md) and its [integration note](../batches/wp02-wp03-wp04-sweetener-pulse-insect-integration-20261011/README.md) provide a nearby animal-food example; they do not cover caprine meat.

The live references, forms, legacy candidates, ledger, recipe corpus, and focused WP04 proposal/batch archive have no goat-meat allocation or decision. The proposed row is limited to plain edible meat from farmed domestic goats; it does not identify breed, age, cut, bone-in state, or processing. It excludes wild/game goat, offal, goat milk/cheese, and prepared products. This review does not reopen the generic recipe phrase “cooked meat or seafood, to taste.”

## Identity and Québec/Canadian food-market evidence

The OQLF Grand dictionnaire terminologique gives **viande de chevreau** as the French food term, **viande de chèvre** as an associated term, and **chevon** as the English term. Its English definition describes the flesh of a goat used as food. This directly supports the proposed display and the two scoped aliases; it does not establish cuts, preparation states, a recipe amount, or a scientific-name field. [S01]

The current Gouvernement du Québec / MAPAQ caprine-sector page distinguishes meat production from milk, cheese, and fibre. It describes caprine meat as a Québec specialty, reports a meat-slaughter volume of 5,280 animals and about fifty businesses focused mainly on meat goats, and says chevreau meat is commonly sold in cuts through producers, public markets, specialty groceries, and butcher shops. The page was updated 2026-03-05; the slaughter-volume line does not state its year. MAPAQ describes the meat as lean and tasty when slow-cooked, but gives no transferable recipe quantity, fat percentage, or cooking conversion. [S02]

Two current Québec producer pages corroborate human-food use and regional product wording. Ferme Bovos lists caprine meat products including ground chevreau, cubes, chops, roasts, shanks, sausage, and rillettes, with Québec points of sale. Ferme Le Chèvrefeuille in Lévis describes chevreau meat as its specialty and lists vacuum-packed cuts, ground meat, and cubes. Their offerings demonstrate product variation; they do not establish one catalog form or make processed goat products synonyms for plain meat. [S03–S04]

CFIA import guidance separately recognizes sheep, lamb, and goat meat and meat products as Canadian import commodities from New Zealand, subject to the page’s product and certification conditions. This is national regulatory context, not blanket approval for every origin, product, or establishment, and not evidence of a particular retail label. [S05]

## Exact-key ownership and candidate fields

The audit follows `normalizeIngredientSearchKey` in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD normalization, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. Exact ownership was checked across active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs.

| Normalized key or ID | Active reference | Form | Legacy candidate | Ledger record | Decision |
|---|---|---|---|---|---|
| `goat meat` | None | None | None | None | Proposed English display. |
| `viande de chevreau` | None | None | None | None | Proposed Québec French display. |
| `chevon` | None | None | None | None | Proposed English alias; OQLF term. |
| `viande de chevre` | None | None | None | None | Proposed French alias; OQLF associated term. |
| `viande caprine` | None | None | None | None | Source wording only; not promoted as an alias. |
| `goat`, `chevre`, `chevreau`, `caprine meat`, `Capra hircus` | None | None | None | None | No exact owner. Do not add these broad, age-specific, or unverified terms as aliases. |
| `ingredient-ref-goat-meat`, `candidate-goat-meat` | None | None | None | None | Both IDs are available; the proposal recommends only the reference ID. |

The new source prefix `WP04-GOAT-MEAT-IDENTITY-20261013-S` is absent from the current ledger and focused proposal/batch archive. The only earlier exact-topic text is the unallocated candidate-family row in `protein-dairy-identities.md`; it is not an active identity or hold.

If accepted, the identity-only row would be:

```json
{
  "id": "ingredient-ref-goat-meat",
  "category": "PROTEIN",
  "nameEn": "goat meat",
  "nameFr": "viande de chevreau",
  "aliasesEn": ["chevon"],
  "aliasesFr": ["viande de chèvre"],
  "defaultDensity": null,
  "unitMappings": []
}
```

The projection using current phrase-first search rules returns this single reference for `goat meat`, `goat`, `chevon`, `viande de chevreau`, `viande de chèvre`, `chèvre`, and `chevreau`. `goat` and `chèvre` are component-word queries from the displays/alias, not separate aliases. They would each surface this one meat identity until other goat products are represented. `viande caprine` remains unmatched because it is sector-level wording, not a proposed ingredient alias. Broad English `meat` currently has 12 results and would have 13; French `viande` currently has 8 and would have 9. Neither broad query becomes a singleton.

## Recipe demand

The manifest-ordered corpus contains **114 recipe files and 1,123 ingredient rows**. Every full recipe JSON and every ingredient row was scanned for `goat meat`, `goat`, `chevon`, `viande de chevreau`, `viande de chèvre`, `viande caprine`, `chevreau`, `chèvre`, and `caprine`. There were **zero candidate-term hits in ingredient rows and zero matching recipe files**. [R01]

Recipe 093’s optional `Cooked meat or seafood, to taste` line is unlinked, does not name goat, and has no species-specific quantity. It does not support a goat recipe link, form, measurement, conversion, or substitution. No recipe line should be linked or changed.

## Unsupported forms and numeric behavior

- **Forms:** MAPAQ and producer sources mention cuts and distinct processed products, but the corpus selects none. Add no cut, raw, cooked, fresh, frozen, ground, sausage, cured, smoked, or vacuum-packed form.
- **Measures and density:** No reviewed source gives a household portion, stable package size, count-to-mass value, cup mapping, bulk density, or edible-yield value. MAPAQ’s general leanness description and seller cut lists are not numeric evidence.
- **Conversions:** No source supports volume-to-mass, count-to-mass, yield, or form conversion for goat meat.
- **Substitutions:** MAPAQ’s description of goat meat as tasty when slow-cooked, and a producer’s qualitative comparison with veal or lamb, do not establish a directed recipe replacement. Add no global or contextual substitution rule for lamb, veal, beef, or another meat.
- **Recipe links:** None; the complete corpus has no goat-meat request.
- **Scientific-name alias:** None. The reviewed culinary sources support the caprine food identity but do not require a taxon string in the active search keys.

## Source register

Sources were checked on 2026-10-13. IDs below are proposal-local, not additions to the shared ledger.

| Source ID | Source and support | Limits |
|---|---|---|
| **WP04-GOAT-MEAT-IDENTITY-20261013-S01** | Office québécois de la langue française, [GDT: viande de chevreau](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17491379/viande-de-chevreau). Gives French `viande de chevreau`, associated `viande de chèvre`, English `chevon`, and a goat-meat definition. | Terminology entry dated 1983; not current supply, cut, package, measurement, or recipe evidence. |
| **WP04-GOAT-MEAT-IDENTITY-20261013-S02** | Gouvernement du Québec / MAPAQ, [Élevage caprin (chèvre)](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/elevage-caprin-chevre), updated 2026-03-05. Documents Québec meat-goat production, slaughter volume, retail channels, cuts, French terms, and the distinction from milk/fibre production. | The slaughter-volume year is not stated on its line. General leanness and slow-cooking comments are not measures or conversion evidence. |
| **WP04-GOAT-MEAT-IDENTITY-20261013-S03** | Ferme Bovos, [Nos produits de viande caprine](https://www.fermebovos.com/nos-produits). Québec producer lists plain and processed caprine products and regional sales points. | Seller-specific product list; does not establish a standardized ingredient form, recipe quantity, or general processing rule. |
| **WP04-GOAT-MEAT-IDENTITY-20261013-S04** | Ferme Le Chèvrefeuille, [Nos produits](https://fermechevrefeuille.ca/nos-produits/). Lévis producer identifies chevreau meat as a current specialty and lists vacuum-packed cuts, ground meat, and cubes. | Producer-specific availability and product wording; no stable package mass or transferable measure. |
| **WP04-GOAT-MEAT-IDENTITY-20261013-S05** | CFIA, [Conditions for importing meat products from New Zealand](https://inspection.canada.ca/en/importing-food-plants-animals/food-imports/food-specific-requirements/approved-countries/new-zealand?wbdisable=true), §§1–2, modified 2024-09-25. Recognizes goat meat and meat products as import commodities under the stated conditions. | Origin- and certification-specific regulatory guidance; not a Canadian retail label or blanket approval. |
| **WP04-GOAT-MEAT-IDENTITY-20261013-R01** | Local read-only audit of the current manifest and all listed recipe JSON files; 114 files and 1,123 ingredient rows. | Corpus demand audit only; it supplies no external food identity evidence. |

## Snapshot and disposition

Snapshot before integration: 1,383 active references, 100 forms, 63 legacy candidates, 1,714 ledger records, and 114 manifest-listed recipes / 1,123 ingredient rows. The manifest-ordered recipe corpus is 753,806 bytes with digest `81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552`.

## Root review and integration result

Root independently reopened OQLF's `viande de chevreau` entry, current MAPAQ caprine-sector guidance, and current Ferme Bovos and Ferme Le Chèvrefeuille product pages. They support the bilingual identity and current Québec human-food use. The active row keeps the English word `meat` explicit and adds only the OQLF-backed aliases. The legacy `ingredient-ref-goat-cheese` candidate is a separate unreviewed cheese identity, not an exact owner of the meat terms and not part of the active picker.

Added identity-only `ingredient-ref-goat-meat` in `PROTEIN` and its five-source research-ledger record. The 114-recipe / 1,123-row corpus has no matching request; the generic meat-or-seafood line was not linked. No forms, measures, densities, mappings, conversions, yields, recipe links, or substitutions were added. No tests or emulator checks were run because the change only adds database JSON data and its generated index.
