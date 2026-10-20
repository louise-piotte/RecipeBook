# WP02/WP03/WP04 residual identity integration — 2026-10-11

## Scope and decisions

Integrated the coordinator-reviewed proposals for remaining sweetener identities, the Section U `rau om` herb, and WP04 plant proteins. These are identity-only references with no recipe demand.

| ID | English display | Québec French display | Category | Search aliases |
|---|---|---|---|---|
| `ingredient-ref-crude-stevia-extract` | crude aqueous stevia-leaf extract | extrait aqueux brut de la feuille de stévia | `SUGAR_AND_SWEETENER` | none |
| `ingredient-ref-monk-fruit-juice-concentrate` | monk fruit juice concentrate | concentré de jus de fruit de moines | `SUGAR_AND_SWEETENER` | none |
| `ingredient-ref-rice-paddy-herb` | rice paddy herb | herbe à paddy | `HERB` | EN: `rau om`; FR: `limnophile aromatique` |
| `ingredient-ref-seitan` | seitan | seitan | `PROTEIN` | EN: `wheat meat` |
| `ingredient-ref-textured-vegetable-protein` | textured vegetable protein | protéine végétale texturée | `PROTEIN` | EN: `TVP`, `texturized vegetable protein`, `texturised vegetable protein`; FR: `PVT` |

- Allulose's French display spelling is resolved as `allulose`, supported by French biochemical usage and a Québec retailer ingredient statement. Its active reference remains held because the reviewed sources do not determine Canadian status for a particular specification/process and intended use. Absence from the permitted-sweetener list is not treated as blanket approval, prohibition, or a novelty determination.
- The generic commercial sweetener-blend identity remains inactive. No bundled recipe names a blend, and the reviewed manufacturer examples have distinct ingredient statements. The ledger records the product-specific evidence and the hold.
- *Limnophila aromatica* remains separate from Vietnamese coriander (*Persicaria odorata*). `rau om` is attached only to rice paddy herb; `rau ram`, `rau răm`, `ngò om`, `ngò ôm`, and ambiguous `rau ngổ` are excluded from its locale aliases. Health Canada's `Herbe à paddy` wording for *L. chinensis* is used as Canadian terminology evidence, not as an equivalence for every *L. chinensis* taxon.
- Seitan remains separate from vital wheat gluten, tempeh, generic TVP, and formulated simulated-meat products. Generic TVP remains separate from soy-specific textured protein/PST.
- The 114-recipe, 1,123-row bundle has no matching ingredient-line demand for these identities. No recipe text, link, amount, or form changed. The five references have no forms, density, unit mappings, measurement observations, conversion, yield, or substitution data.

## Evidence and source review

The proposal packets record the complete source registers, live catalog/recipe audits, and rejected crosswalks:

- [WP02 sweetener boundary review](../../proposals/wp02-sweetener-residual-boundaries-review-20261011.md)
- [WP03 rau om identity review](../../proposals/wp03-section-u-rau-om-identity-review-20261011.md)
- [WP04 seitan and TVP boundary review](../../proposals/wp04-plant-protein-seitan-tvp-boundary-review-20261011.md)

Coordinator verification checked the primary terminology and classification sources. Health Canada distinguishes aqueous crude stevia extracts from purified glycosides and says crude extracts are ingredients rather than food additives or novel foods, while also limiting its safety statement for broad retail-food use. CFIA distinguishes lower-mogroside monk-fruit juice concentrate from tabletop monk-fruit extract. [Health Canada, *Succédanés du sucre*](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/salubrite-aliments/additifs-alimentaires/succedanes-sucre.html), [CFIA, sweetener labelling and monk-fruit ingredients](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/edulcorants)

Kew accepts *Limnophila aromatica* and lists *L. chinensis* subsp. *aromatica* as a synonym; EPPO assigns `rau om`, `rice paddy herb`, and `limnophile aromatique` to that taxon. Health Canada's crop-group wording supplies `Herbe à paddy`, while the European Commission lists herbe à paddy separately from Vietnamese coriander. [Kew Plants of the World Online](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:804287-1), [EPPO Global Database](https://gd.eppo.int/taxon/LIOAR), [Health Canada crop-group list](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html), [European Commission Regulation (EU) 2018/62](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX:32018R0062)

OQLF defines seitan as wheat gluten cooked in seasoned broth, and defines generic TVP as extruded, dehydrated plant protein while treating soy-based textured protein as the narrower class. It separately defines vital wheat gluten and tempeh. [OQLF, seitan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8369808/seitan), [OQLF, protéine végétale texturée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086121/proteine-vegetale-texturee), [OQLF, protéine de soya texturée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26560132/proteine-de-soya-texturee), [OQLF, gluten de froment élastique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084319/gluten-de-froment-elastique), [OQLF, tempeh](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17049860/tempeh)

## Verification

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --check`: passed; no package normalization changes.
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`: passed at 927 references.
- Research-ledger validation: 1,184 records, 3,164 source entries, 2,563 distinct source IDs, 0 errors. The 76-entry legacy import candidate list was unchanged.
- `python3 -B -m unittest tools.seed_package.test_bundled_seed_package`: 81 tests passed.
- `./gradlew :app:testDebugUnitTest --no-daemon`: 396 tests passed, 0 failures.
- `./gradlew :app:connectedDebugAndroidTest --no-daemon --console=plain`: Pixel 9a / Android 16 API 36, 37 cases, 35 passed, 2 skipped, 0 failed.
- `RECIPEBOOK_EMULATOR_SERIAL=emulator-5560 ./tools/deploy_to_pixel9a_emulator.sh`: build, install, and launch passed.
- English picker searches returned all five intended identities. French picker searches returned the five localized displays. French `rau om` and `limnophile aromatique` returned `herbe à paddy`; `PVT` returned `protéine végétale texturée`; `Vietnamese Coriander` returned the separate `coriandre vietnamienne`; `rau ram` and `TSP` returned no matching rice-paddy/TVP identity. Unit tests additionally cover `wheat meat`, TVP spelling variants, and the sweetener boundaries.
- Rechecked thin, medium, and thick poha in both languages on the same final build; details and six captures are in the [Poha verification packet](../poha-thickness-synonyms-integration-20261010/README.md).
- The unsaved draft was discarded, and the final home showed `Toutes les recettes (114)`.
- Targeted UTF-8/no-BOM, screenshot-hash, and whitespace checks passed. Existing reference order was preserved; the five new references were appended.

### Final package fingerprints

| File | SHA-256 |
|---|---|
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `ingredient-references.v1.json` | `e14ad6668bc34bd83f7e1fd3993ac023d5d748ff134fafd807583435d6850468` |
| `ingredient-forms.v1.json` | `a195a0f3b487d193be11cf5648b291f5b51f001ee21cd643af766655dbf28267` |
| `research-ledger.v1.json` | `023f6bbe3e0dea7ecd2b701958ba230f8103fac526861b23b9c41a47dd641e97` |
| `BundledIngredientCatalog.kt` | `65f7c5fab875aff1057d341acb7462cc356726a6c08ddbecbec80796a65b0b0a` |

### Pixel 9a screenshots

| Check | Screenshot | SHA-256 |
|---|---|---|
| English crude aqueous stevia extract | [picker-en-crude-stevia-extract.png](screenshots/picker-en-crude-stevia-extract.png) | `638842bb302232f4f2f5cfe052c822e8555d0db7c5669e1762a5b78911410b94` |
| English monk-fruit juice concentrate | [picker-en-monk-fruit-juice-concentrate.png](screenshots/picker-en-monk-fruit-juice-concentrate.png) | `1bd9e29aa84296e3590b1868c9495f841c68bd5068ab70f4a4481968d27be3f4` |
| English rice paddy herb | [picker-en-rice-paddy-herb.png](screenshots/picker-en-rice-paddy-herb.png) | `529612c8142de8029e22c96652f50c670101d3ea06fded40f1a9abbd7942fe0e` |
| English seitan | [picker-en-seitan.png](screenshots/picker-en-seitan.png) | `efb6313d59e3075a4b8d61db97a101662d3094a818b4ac2370790b077e7a6e18` |
| English textured vegetable protein | [picker-en-textured-vegetable-protein.png](screenshots/picker-en-textured-vegetable-protein.png) | `5970973058998e4959e24f0c3bb2eb6bdd1fcc201cf35165b960d7baa571e57a` |
| French crude aqueous stevia extract | [picker-fr-crude-stevia-extract.png](screenshots/picker-fr-crude-stevia-extract.png) | `5fb4aa827fb7a02072a91c7f8b184ba589b550ee5b9b5b77d97187fe9fd8bc3b` |
| French monk-fruit juice concentrate | [picker-fr-monk-fruit-juice-concentrate.png](screenshots/picker-fr-monk-fruit-juice-concentrate.png) | `53346d68caa0fc96c24ffec08ac48b80311326528c654a244bc09f64d95b85f5` |
| French rice paddy herb | [picker-fr-rice-paddy-herb.png](screenshots/picker-fr-rice-paddy-herb.png) | `aab2680b0bbb97d806e37c026655bc822508059c23425712a54577f7cac4c506` |
| French seitan | [picker-fr-seitan.png](screenshots/picker-fr-seitan.png) | `98fbe2396dd115ef917f9bd9415ac687376630dae25e1955cb430490971cc172` |
| French textured vegetable protein via `PVT` | [picker-fr-pvt-alias-textured-vegetable-protein.png](screenshots/picker-fr-pvt-alias-textured-vegetable-protein.png) | `313f023b6847e286770f5e98805beefba26d0adae9e996e762ab2533874aa8d5` |
| French home with 114 recipes | [home-fr-114-recipes.png](screenshots/home-fr-114-recipes.png) | `1e083af1d88a337376b03076c36fa9c17e9258db3afc7e3adb0b23aee367899b` |
