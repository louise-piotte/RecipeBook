# WP05 Québec cretons and ketchup identities

## Scope and disposition

**Status:** Integrated, identity-only batch. **Owner:** catalog integration lead. **Review date:** 2026-10-11.

Added three distinct references from the local-ingredient checklist:

- `cretons / cretons` (`PROTEIN`), scoped to the Québec pork-based charcuterie spread.
- `fruit ketchup / ketchup aux fruits` (`SAUCE_AND_CONDIMENT`), preserved as a named Québec condiment class.
- `green tomato ketchup / ketchup vert` (`SAUCE_AND_CONDIMENT`), with the source-attested French alias `ketchup aux tomates vertes`.

The full 114-recipe, 1,123-row corpus has no matching cretons, fruit-ketchup, or green-tomato-ketchup ingredient line. The checklist calls for local Québec products independently of recipe demand, so the identity rows have no recipe links. No forms, measurement observations, densities, unit mappings, conversions, yields, substitutions, or recipe edits were added.

## Identity boundaries

- OQLF defines cretons as a Québec pork-based charcuterie pâté and says it resembles but is not rillettes. The row does not absorb `cretons de panne`, generic pork pâté/spread, head cheese, or plant-based products marketed as cretons-style.
- Fruit ketchup remains separate from generic tomato ketchup. The exact name is source-backed, but its retail and recipe compositions vary; the identity makes no claim that it is tomato-free or follows one fixed formula.
- Green tomato ketchup remains separate from both products above and from ordinary ketchup. Québec sources use `ketchup vert` and `ketchup aux tomates vertes`; some sources also use chow-chow, while others distinguish relish and ketchup, so `chow-chow` is not an alias.

## Evidence

### Cretons

- [OQLF, cretons](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2092672/cretons): Québec term and English equivalent; pork-based charcuterie pâté; distinction from rillettes and cretons de panne.
- [Dictionary of Canadianisms on Historical Principles, cretons](https://dchp.arts.ubc.ca/entries/cretons): Canadian English borrowing and pork-spread definition.
- [Québec Food Directory, P.A.G. Cretons](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8205011): current Québec prepared-meat product and ingredient evidence.

### Fruit ketchup

- [OQLF, ketchup](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2077493/ketchup): explains why nonstandard ketchup products require a qualifier.
- [Aliments du Québec, Fruit ketchup](https://alimentsduquebec.com/en/certified-products/seasonings-sauces-and-condiments/fruit-ketchup-2) and [Ketchup aux fruits](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/ketchup-aux-fruits-4): exact bilingual display wording and Québec product classification.

### Green tomato ketchup

- [Metro Québec, Si-Bon Homestyle Green Ketchup / Ketchup vert genre maison](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/ketchup-et-moutarde/ketchup-vert-genre-maison/p/055429500228): bilingual product title and green-tomato ingredient declaration.
- [La petite bette, Le ketchup vert délicieux de ma maman](https://lapetitebette.com/recette/ketchup-vert/): Québec usage of `ketchup vert` and `ketchup aux tomates vertes`, plus the naming overlap with chow-chow.
- [Wildly Canadian, Green Tomato Ketchup](https://www.wildlycanadian.com/products/green-tomato-ketchup): corroborates the English product name on a Canadian product listing.

Full source locators and evidence decisions are in `docs/catalog/research-ledger.v1.json` under the three ingredient reference IDs.

## Acceptance and checks

- English and fr-CA names are directly supported; one scoped French alias is directly attested.
- Identity-only JSON rows have null density and empty unit mappings.
- All 114 recipes / 1,123 ingredient rows were scanned; no candidate wording was found.
- Database JSON only was added. No tests or emulator run were needed under the JSON-only data rule in `AGENTS.md`.
- Package normalization reported 0 changed parts; ingredient-reference normalization reported already normalized; package/ledger validation passed; the generated index is current at 1,023 references.
- The package has 1,023 references / 69 forms / 114 recipes / 1,123 ingredient rows. The ledger has 1,306 records / 4,223 source entries / 3,462 distinct source IDs / 8 unit conversions.
- Both database JSON files are UTF-8 without BOM and contain only escaped non-ASCII text. Targeted `git diff --check` passed. A repository-wide `git diff --check` reports trailing whitespace in pre-existing files under `docs/exported-recipe-lists/`; those files were not changed in this batch.
- SHA-256: reference JSON `eadf564dbc3fc13da4ed2a33adb65a6f71c685fe91ddb5b0afcc67fa83a2d01e`; research ledger `e51f38d81cafa7b7c4cf60e73e39bfb2810fcba5a4bf439c9d748a4589e6d630`.
