# WP03 Section F — Bob's Red Mill 10 Grain Hot Cereal review (2026-10-14)

## Review record

- **Reviewed:** 2026-10-14.
- **Status:** Integrated. Added the identity-only reference, source ledger record, product-specific serving observation, checklist, roadmap, generated catalog, and batch README.
- **Section F context:** The plan still leaves “regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” open at [the Section F entry](../../RecipeBook-global-ingredient-catalog-plan.txt#L2906). It already includes distinct rows for Red River 7 Grain Hot Cereal, Bob's Red Mill Mighty Tasty hot cereal, Kashi GoActive Original Cereal, and the Biowig millet cream. This candidate is the separately named Bob's Red Mill 10 Grain Hot Cereal.
- **Candidate:** Bob's Red Mill's current Canadian product listed in English and French by the manufacturer, with a matching French listing from a Québec retailer.
- **Decision:** Added one identity-only `GRAIN_AND_CEREAL` reference for this named dry blend. It stays separate from Mighty Tasty, Red River cereals, GoActive, individual grain references, and generic hot-cereal wording.

## Product boundary

Bob's Red Mill's Canadian French product page names **Céréale chaude à 10 grains**. The manufacturer's English page names **10 Grain Hot Cereal**. Both current product pages list whole-grain wheat, corn, rye, triticale, oats, millet, barley, brown rice, oat bran, and flaxseed, and both give the label serving as **1/4 cup (40 g)** [S01–S02]. The Québec retailer's French listing identifies Bob's Red Mill's 10-grain hot cereal and shows a 708 g package [S03]. These sources support a named, multi-ingredient cereal blend, not ten interchangeable single-grain ingredients or a general product class.

Keep this identity tied to the Bob's Red Mill product name. Do not split the blend into its component grains, transfer the formula to other 10-grain cereals, or treat the product as any of its component ingredients. The current official English and Canadian French product pages agree on the listed ingredients. An undated manufacturer preparation page calls the product **10 Grain Cereal**, but its ingredient paragraph includes soybeans and flaxseed meal instead of the current product-page list [S04]. Use its short title only as a searchable product-name variant; do not treat that page as evidence for the current formula or as a reusable measure.

The brand's page also calls the cooked result a *gruau*. OQLF defines *gruau* primarily as a hot cooked dish made from oat flakes, while noting that use can extend to dishes made with other cereals [S06]. Keep *gruau* off this dry packaged product's aliases. The French display follows the manufacturer's and Québec retailer's cereal wording; OQLF lists *céréales* and *céréales à déjeuner* as Québec terms for breakfast cereal products [S05].

## Canonical reference added

```json
{
  "id": "ingredient-ref-bobs-red-mill-10-grain-hot-cereal",
  "nameEn": "Bob's Red Mill 10 Grain Hot Cereal",
  "nameFr": "Céréales chaudes à 10 grains (Bob's Red Mill)",
  "aliasesEn": ["10 Grain Cereal"],
  "aliasesFr": ["Céréale chaude à 10 grains"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The English display follows the current manufacturer title with the brand qualifier. The French display combines the manufacturer's singular title with the plural product wording used by the Québec retailer [S01, S03]. The English alias is the manufacturer's shorter linked preparation-page title; the French alias is the exact Canadian manufacturer title [S01, S04]. Treat these only as names for this branded product. Do not alias bare `hot cereal`, `céréales chaudes`, `gruau`, `multigrain cereal`, or any component grain.

## Catalog, legacy, ledger, proposal, and picker audit

At proposal review baseline the live package had 1,435 active references and 105 forms; the legacy file listed 63 candidates and the research ledger had 1,775 records. Before integration, no exact normalized owner was found for the ID, displays, or aliases in the active names/aliases, form labels/match terms, legacy identities, or ledger text. The ID and aliases are now stored on the new reference. No previous Section F proposal, batch, plan entry, or roadmap entry reviewed this Bob's 10-grain product. The remaining similarly named catalog rows are separate products, including Red River's 7-grain hot cereal, Bob's Mighty Tasty, and Kashi GoActive.

The picker projection uses the current `normalizeIngredientSearchKey` and phrase-first matching rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including attached form terms.

| Picker query | Before integration | After integration | Effect |
| --- | ---: | ---: | --- |
| `Bob's Red Mill 10 Grain Hot Cereal` | 0 | 1 | Brand-qualified English product name. |
| `10 Grain Hot Cereal` | 0 | 1 | Current English manufacturer title. |
| `10 Grain Cereal` | 0 | 1 | Short manufacturer preparation-page title. |
| `Céréales chaudes à 10 grains (Bob's Red Mill)` | 0 | 1 | Integrated French display. |
| `Céréale chaude à 10 grains` | 0 | 1 | Current Canadian French manufacturer title. |
| `10 grains` | 0 | 1 | The branded product only. |
| `hot cereal` | 7 | 8 | Adds one named product to an existing multi-result query. |
| `céréales chaudes` | 4 | 5 | Adds one named product to an existing multi-result query. |
| `Mighty Tasty hot cereal` | 1 | 1 | Existing brand-specific identity remains unchanged. |
| `7 grain cereal` | 1 | 1 | Red River's separate product remains the only result. |

The exact brand and product queries are unique after integration. Broad hot-cereal queries remain multi-result. The new name does not take ownership of any Red River or Mighty Tasty query.

## Bundled recipe demand

The manifest lists 114 recipe files with 1,123 structured ingredient rows. A whole-file and ingredient-row scan for the brand, integrated names and aliases, `10 Grain Hot Cereal`, `10 Grain Cereal`, and their French product wording found **zero recipe-file matches and zero ingredient-row matches**. No recipe link, relink, or recipe substitution was added. The manufacturer's preparation page is external product guidance, not bundled RecipeBook demand.

## Measures, forms, and substitutions

- **Label portion:** The current manufacturer pages list 1/4 cup (40 g) as the product's label serving [S01–S02]. Recorded as a source-specific ledger observation only; it is not a general conversion for hot cereals or grain mixes.
- **Package:** The Québec retailer lists a 708 g package; package mass is not a household measure [S03]. Do not create a package mapping or yield.
- **Catalog numeric fields:** Keep `defaultDensity` null and `unitMappings` empty. Add no conversion or cooking yield. The manufacturer instruction page's 1 cup cereal to 3 cups water and four portions is recipe-specific; its ingredient paragraph also conflicts with the current product-page formula [S04].
- **Forms:** Add no `IngredientForm`. The reference identifies the named dry blend. Cooking it produces a prepared dish; no bundled recipe requires a reusable cooked form or yield.
- **Substitutions:** Add no global or contextual substitution rule or recipe-line link. Similarity to other grain blends or hot cereals does not establish an exchange ratio.

## Source register

Sources were checked online on 2026-10-14. Product pages without publication dates are marked undated; a current page or retailer listing does not guarantee local inventory.

| Source ID | Source | Evidence and limits |
| --- | --- | --- |
| `WP03-BR10GC-20261014-S01` | Bob's Red Mill Canada, [Céréale chaude à 10 grains](https://www.bobsredmill.ca/produit/10-grain-hot-cereal), undated manufacturer page. | Gives the Canadian French product title, product description, current ingredient list, and 1/4 tasse (40 g) label serving. It does not publish a milling grade, particle size, reusable conversion, or general cooked yield. |
| `WP03-BR10GC-20261014-S02` | Bob's Red Mill, [10 Grain Hot Cereal](https://www.bobsredmill.com/product/10-grain-hot-cereal), undated manufacturer page. | Corroborates the English name, listed blend, and 1/4 cup (40 g) serving. It agrees with the current Canadian French product page; its brand-level description is not a universal definition of 10-grain cereal. |
| `WP03-BR10GC-20261014-S03` | Nature Santé, [Céréales chaudes 10 grains](https://naturesante.ca/fr/products/03997830110), undated Québec retailer listing. | Its French product copy identifies Bob's Red Mill and 10-grain hot cereal, and its title lists a 708 g bag. The page showed no quantity in stock when checked; it is not a current package-panel ingredient declaration. |
| `WP03-BR10GC-20261014-S04` | Bob's Red Mill, [Basic Preparation Instructions for 10 Grain Cereal](https://www.bobsredmill.com/recipes/how-to-make/basic-preparation-instructions-for-10-grain-cereal), undated manufacturer instruction page. | Supports the short English product-name variant and a recipe-specific preparation method. Its ingredient paragraph lists soybeans and flaxseed meal, differing from the current product pages; do not use that paragraph as the current formula or treat its recipe quantities as reusable conversions or yields. |
| `WP03-BR10GC-20261014-S05` | Office québécois de la langue française, [céréales (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26571637/cereales), last updated 2024. | Lists *céréales* and *céréales à déjeuner* and describes breakfast cereal foods made from processed cereal grains. It does not name this brand or establish its formula. |
| `WP03-BR10GC-20261014-S06` | Office québécois de la langue française, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau), last updated 2002. | Defines *gruau* as a cooked dish based on oat flakes and notes that the dish sense can extend to other cereals. It does not name the dry Bob's Red Mill package; this supports leaving *gruau* out of the product aliases. |

## Review disposition

**Integrated `ingredient-ref-bobs-red-mill-10-grain-hot-cereal` as one identity-only `GRAIN_AND_CEREAL` reference.** The row is limited to Bob's Red Mill's named packaged hot-cereal blend. The 1/4 cup (40 g) label serving remains source-specific ledger evidence, not an active mapping; no forms, density, mappings, conversions, yield, recipe link, or substitution were added.

## Static checks

- Re-read `AGENTS.md`, relevant `Requirements.md` naming and ingredient-reference rules, Section F plan/roadmap state, recent Section F proposals and batches, and the current reference/form/legacy/ledger data.
- Confirmed no exact active owner, legacy identity, ledger owner, prior product review, or output-path collision for the new ID, displays, and aliases before integration.
- Reproduced the phrase-first picker projection from the current search normalizer and audited the brand-specific and broad-query counts above.
- Scanned all 114 manifest-listed recipe files and 1,123 ingredient rows for the brand, product names, aliases, and French wording; found no matches.
- Root integration added the reference, six-source ledger record, product-specific label-serving observation, checklist and roadmap entries, generated catalog, and batch README. No app, Gradle, instrumentation, or emulator tests were run because the database update only adds JSON data and its generated catalog index.
