# Catalog Completion Checkpoint — 2026-10-10

This checkpoint records the reviewed identity, recipe-link, measurement, and boundary work integrated on 2026-10-10. It does not complete the global ingredient-catalog plan; open coverage and terminology work remains in the roadmap and global plan.

## Integrated catalog decisions

| Scope | Result |
|---|---|
| Brandy | Added the bilingual brandy identity and linked the exact line in recipe 057#25. The French alias `eau-de-vie de vin` remains source-bounded. |
| Barley flakes and rye berries | Added `barley flakes / flocons d'orge`; added `rye berries / grains de seigle` with English alias `rye kernels`. Generic rye's USDA cup weight remains attached to the generic rye record, and no rye-berry conversion or substitution was added. |
| Chipotle in adobo and bread-and-butter pickle | Preserved the existing one-chipotle and one-pickle count lines. Both remain unconverted; no mass was inferred from an ingredient name, jar, or retail source. |
| Attiéké, lafun, Pupuru, and Kodo millet | Added distinct, bounded identities and only the accepted aliases: attiéké (`steamed cassava grits`, `akyeke`), Pupuru (`pupuru flour`), and Kodo millet (`koda millet`). Lafun and Pupuru remain separate; no forms, measures, recipe links, or substitutions were invented. |
| Pearl millet and pearl millet flour | Added English aliases `bajra` and `bajra flour` to the grain and flour rows respectively; the two identities remain separate. |
| Quinoa flakes and buckwheat flakes | Added identity-only `quinoa flakes / flocons de quinoa` and `buckwheat flakes / flocons de sarrasin` rows in `GRAIN_AND_CEREAL`. Both have empty aliases, no forms or recipe links, null density, and no unit mappings. Buckwheat flour, roasted buckwheat groats, and mixed breakfast cereal stay separate. |
| Sweet-potato flour and puffed amaranth | Added `sweet potato flour / farine de patate douce` in `FLOUR_AND_STARCH`, with only the sourced English spelling alias `sweetpotato flour`; added `puffed amaranth / amarante soufflée` in `GRAIN_AND_CEREAL` with no aliases. Neither has recipe demand, forms, active measurements, mappings, yields, or substitutions. Kept sweet-potato starch, potato flour, yam flour, raw amaranth, amaranth flour, greens, other puffed grains, and formulated bars separate. |
| Medjool date portion | Recorded USDA SR28's source-specific `1 pitted Medjool date = 24 g` edible portion with date size unspecified. The 8% pits refuse note is retained as context and was not used to derive a gross weight. Recipe 031#1 remains `20 Medjool dates`; no total mass or active count mapping was inferred. |
| Fraisier garnish strawberry | Reviewed recipe 045#16's `1 strawberry for decoration` line and kept its count. CNF 2015 has weights only for size-qualified berries; no size matches the garnish. No mass or global strawberry measurement state was added. |
| Brioche and blueberry pie crust | Kept recipe 075#4's slice count and recipe 106#1's one 5-inch shell count unchanged. Both measurement states remain blocked because available sources do not match the exact bundled portions. |
| Farro and Kokonte | Kept both allocations on hold. Farro remains unresolved between Canadian product labels; Kokonte remains unallocated because the evidence does not settle its boundary with the existing lafun identity. |

Recipe text, quantities, and units were not rewritten in this checkpoint. The brandy reference is linked only to its exact existing recipe line. No new active unit conversion, density, ingredient form, package yield, or substitution rule was added.

## Source review

The root coordinator independently checked the buckwheat-flake Québec term and product boundary against the [OQLF sarrasin entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082623/sarrasin), [Québec Ministry guide](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/famille/publications-adm/Service_de_garde/sante-securite/gazelle-potiron-guide-alim-resp.pdf), [Priméal plain-flake listing](https://primeal.bio/fr/nos-produits/autres/flocons-de-sarrasin-bio-350g/), [La Moisson Québec listing](https://lamoisson.com/products/flocons-de-sarrasin), and the matching [Priméal 350 g Botanic listing](https://www.botanic.com/produit/349453/flocons-de-sarrasin-bio-en-sachet-de-350-g.html). Priméal gives 1:2 flakes-to-liquid; Botanic gives 1:3 for the same named product, so neither direction was generalized. La Moisson supports the Québec name and composition but does not state a preparation ratio on its current product page. The separate Priméal [mixed cereal listing](https://primeal.bio/fr/nos-produits/autres/flakes-de-sarrasin-bio-250g/) confirms that a formulated breakfast cereal is a separate product.

For Medjool dates, the coordinator checked [USDA SR28 NDB 09421](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg09.pdf#page=270) against the source recipe's [20-date ingredient and pit-removal method](https://cookingwithayeh.com/chocolate-dates/). The ledger keeps this published portion separate from runtime conversions and from the other Medjool recipe's 425 g amount.

For sweet-potato flour, the coordinator checked East African Community standard **EAS 773:2012** in the [2023 standards catalogue](https://www.eac.int/component/filery/?Itemid=297&controller=download&file=4a15c808-4e2f-405e-8a26-596f623eeb16&name=EAS+Standards+Catalogue+June+2023.pdf&task=download.file), the OQLF [patate](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082785/patate) and [fécule de patate douce](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287217/fecule-de-patate-douce) entries, and La Moisson's [Farine de patate douce](https://lamoisson.com/products/farine-de-patate-douce) listing. The standard distinguishes food flour made from processed *Ipomoea batatas* roots; La Moisson supplies the exact Québec French product label. Its 227 g package is not a recipe measure. Ecoideas's 1:1 wheat/corn replacement claim remains product-specific.

For puffed amaranth, a current [Tootsi/Yupik certification list](https://tootsi.com/pdf/kosher.pdf) names `Organic Puffed Amaranth` and identifies the Montreal plant; an [Ecocert French product annex](https://tootsi.com/pdf/bio_fr.pdf) lists `Amarante soufflée`. The OQLF [amarante](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante) entry supports the base bilingual term and seed/flour distinction, not the compound puffed-product wording. Enjoy Life's [ingredient glossary](https://enjoylifefoods.ca/fr/glossaire-des-ingredients/) and a [Metro Québec ingredient list](https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-sucrees-et-bonbons/barres-tendres-et-collations-aux-fruits/barres-tendres-cuites-au-four-aux-pommes-et-caramel-sans-gluten/p/819597011456) independently attest `amarante soufflée` in local French product contexts.

For the Fraisier garnish, [Fashion Cooking](https://www.fashioncooking.fr/2016/09/fraisier-traditionnel/) lists one strawberry for decoration. Health Canada's [CNF 2015 strawberry portions](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=1749) distinguish small, medium, large, and extra-large berries by diameter and weight; the recipe gives no size class, so none maps to the garnish.

The proposal packets retain source IDs, scope limits, and acceptance checks:

- [Buckwheat flakes identity review](../../proposals/wp03-section-f-buckwheat-flakes-identity-review-20261010.md)
- [Medjool date count-portion review](../../proposals/wp04-medjool-date-count-portion-review-20261010.md)
- [Kokonte flour boundary review](../../proposals/wp02-section-b-kokonte-flour-boundary-review-20261010.md)
- [Sweet-potato flour identity review](../../proposals/wp02-b4-sweet-potato-flour-identity-review-20261010.md)
- [Puffed amaranth identity review](../../proposals/wp03-section-f-puffed-amaranth-identity-review-20261010.md)
- [Fraisier garnish strawberry portion review](../../proposals/wp04-strawberry-garnish-count-portion-review-20261010.md)
- [Blueberry pie-crust count review](../../proposals/wp04-blueberry-pie-crust-count-portion-review-20261010.md)
- [Brioche slice-count review](../../proposals/wp04-brioche-slice-count-portion-review-20261010.md)

## Package and automated verification

| Check | Result |
|---|---|
| Bundled package | 887 ingredient references, 48 forms, 114 recipes, and 1,123 recipe ingredient rows. |
| Research ledger | 1,132 records, 2,818 source entries, 2,229 distinct source IDs, and 171 measurement observations; validation reported zero errors. |
| Python seed-package tests | 53 passed. |
| Android unit tests | 374 passed, 0 skipped, 0 failures, 0 errors. |
| Android instrumentation | 31 test cases, 2 skipped, 29 passed, 0 failures, 0 errors on the Android 16 / API 36 Pixel 9a QA clone. |
| Package checks | Seed-package normalization, ingredient-reference normalization, generated catalog freshness, and ledger validation passed. |
| Deployment | `tools/deploy_to_pixel9a_emulator.sh` completed its test/build/install flow and launched the current debug app on `emulator-5556`. |

## Pixel 9a picker review

On the freshly deployed build, English and French searches returned the exact buckwheat-flake, sweet-potato-flour, and puffed-amaranth entries. The app was returned to the French library home, where the view tree showed `Toutes les recettes (114)`. The temporary unsaved recipe used to open the picker was discarded.

The retained screenshots include earlier checks for this catalog-completion series, plus current-build buckwheat picker and French-home evidence. Picker captures show the on-screen keyboard. `screenshots/SHA256SUMS.txt` fingerprints every PNG in the folder.

Current-build evidence:

- [English buckwheat-flakes picker](screenshots/en-buckwheat-flakes-picker.png)
- [French buckwheat-flakes picker](screenshots/fr-buckwheat-flakes-picker.png)
- [English sweet-potato-flour picker](screenshots/en-sweet-potato-flour-picker.png)
- [French sweet-potato-flour picker](screenshots/fr-sweet-potato-flour-picker.png)
- [English puffed-amaranth picker](screenshots/en-puffed-amaranth-picker.png)
- [French puffed-amaranth picker](screenshots/fr-puffed-amaranth-picker.png)
- [French home with 114 recipes](screenshots/fr-home-114-current.png)

Earlier picker evidence retained in this folder:

`en-bajra-grain-and-flour.png`, `en-barley-flakes.png`, `en-brandy.png`, `en-koda-alias-picker.png`, `en-kodo-millet-picker.png`, `en-lafun-picker.png`, `en-pupuru-picker.png`, `en-quinoa-flakes-picker.png`, `en-rye-berries.png`, `fr-bajra-grain-and-flour.png`, `fr-barley-flakes.png`, `fr-brandy-eau-de-vie.png`, `fr-kodo-picker.png`, `fr-lafun.png`, `fr-pupuru-picker.png`, `fr-quinoa-flakes-picker.png`, and `fr-rye-berries.png`. `fr-library-home-114.png` is an earlier home capture; the current restored home is `fr-home-114-current.png`.

The QA run used only the disposable Pixel 9a clone on `emulator-5556`, which was shut down after capture. The owner's Pixel_9a userdata and SD-card image hashes matched their recorded baseline after shutdown (`48d6753085207cbbdf6b1c2bc9416af3fe92ad42f6000ed5cfa49103ed0f9997` and `5f2d56e8dcd5f647175ea2ff9818471a0757f0bb28ec3959e658b99716abcd1a`).

## Still open

Continue the global category and regional sweeps, exact Québec naming review, remaining Section F products and forms, broader animal-food coverage, and count/edible-portion research. Farro, Kokonte, the Fraisier garnish mass, brioche mass, and blueberry pie-crust mass remain unresolved. CNF 2026 raw-strawberry portion rows were not checked in this pass. This checkpoint does not close the global plan.
