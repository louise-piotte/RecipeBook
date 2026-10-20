# WP03 Section F — oat groats Québec French display review (2026-10-14, R109)

## Review record

- **Status:** Integrated by root on 2026-10-14 as a documentation-only Québec display review; the current display and empty alias lists were retained. See the [R109 batch README](../batches/wp03-section-f-oat-groats-quebec-display-review-integration-20261014/README.md).
- **Open question:** Retain the existing French display `gruau d'avoine entier`, or replace it with the Québec market wording `amande(s) d'avoine complète(s)`?
- **Recommendation:** Retain `oat groats / gruau d'avoine entier` and approve the independent display review on that basis. Keep both alias lists empty. The full French phrase is used by the CFIA French oat survey for whole groats, while current Québec sources use `amande(s) d'avoine complète(s)` inconsistently for whole and cut oats. No safer replacement or alias is established.
- **Scope:** Naming and picker ownership for the existing whole, hulled oat-kernel identity. Do not reopen oat processing identities, forms, measurements, or substitutions.

## Identity and Québec French boundary

Oat groats are oat kernels after removal of the inedible hull. They remain whole kernels in this reference. Keep them separate from steel-cut oats, whose kernels have been cut into pieces; rolled, quick, and instant flakes; Scottish oatmeal, which is a coarse meal ground from groats; and prepared oatmeal (`gruau`).

The French compound matters. OQLF defines bare `gruau` as a cooked dish made from oat flakes, but the CFIA French survey uses the qualified `gruau d'avoine entier` for whole groats and lists cut and flaked oat products separately. The Québec qualifier `entier` preserves that whole-kernel boundary. This is a source-backed product label, not an OQLF ruling on the complete compound.

`Amande(s) d'avoine complète(s)` is a real Québec-facing market name: the Québec Food Directory lists La Milanaise's product under that French name, paired with the English listing `Organic Whole Oat Groats`. It is not a safe exclusive alias for whole groats, however. Rachelle Béry uses `amande d'avoine complète` among the names for steel-cut oats, and La Milanaise's own product page groups its complete oats with steel-cut names. The French market evidence therefore does not settle whether a user entering that phrase means an intact kernel or cut oats.

Keep these terms off the oat-groats row:

- `amande(s) d'avoine complète(s)`: market-attested for the whole-groat SKU, but also used for steel-cut oats; do not attach it as an alias to just one of those identities.
- `avoine épointée`: withhold; OQLF discourages it and prefers `avoine découpée` for steel-cut oats.
- `avoine irlandaise`, `avoine écossaise`, and `avoine coupée à la lame d'acier`: the reviewed Québec sources use these for cut oats, so they do not identify intact groats.
- Bare `gruau` or `gruau d'avoine`: do not add as aliases. The first has a Québec prepared-dish meaning and broad picker results; the second lacks the whole-kernel qualifier used in the CFIA food survey.

## Current ownership and picker projection

The live row is `ingredient-ref-oat-groats`, `GRAIN_AND_CEREAL`, displayed as `oat groats / gruau d'avoine entier`. It has no French or English aliases, density, unit mappings, or attached forms. The adjacent `ingredient-ref-steel-cut-oats` row owns `steel-cut oats / avoine découpée`.

The static projection below follows the current accent- and punctuation-folding, phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), against the live reference and form data. It is not runtime picker QA.

| Query | Current result | Disposition |
|---|---|---|
| `oat groats` | `ingredient-ref-oat-groats` | Keep the exact English display. |
| `gruau d'avoine entier` | `ingredient-ref-oat-groats` | Keep the complete French display; it returns one reference. |
| `gruau` | Six references, including oat groats and five other cereal or meal rows | Do not activate the bare word as an alias. |
| `amandes d'avoine complètes` | No active result | Do not add it as an exclusive alias while Québec product usage also assigns it to steel-cut oats. |
| `avoine découpée` | `ingredient-ref-steel-cut-oats` | Preserve the OQLF-backed steel-cut name. |
| `avoine épointée` | No active result | Keep it out of the catalog; OQLF discourages the term. |

If `amandes d'avoine complètes` were added only to the groats row, the picker would return that row for wording also used for cut oats. If it were added to both whole- and cut-oat rows, the phrase would return two identities. Retaining the current precise display and empty alias lists avoids either misallocation.

## Recipe-corpus demand

The read-only scan covered all **114** bundled recipe files and **1,123** structured ingredient rows.

- No recipe ingredient links to `ingredient-ref-oat-groats`.
- No recipe file or ingredient row contains `oat groats`, `whole oat groats`, `gruau d'avoine entier`, or `amande(s) d'avoine complète(s)`.
- The four current oat ingredient rows use two rolled-oat lines (recipes `001#1` and `065#1`) and two quick-oat lines (recipes `024#6` and `047#4`). None requests whole or cut groats.

There is no bundled recipe demand for a new alias, recipe relink, form, or measurement on this row.

## Numeric and substitution boundary

Keep `defaultDensity` null and `unitMappings` empty. Add no form, household measure, cooking yield, conversion, or substitution. The Québec Food Directory's published portion and cooking directions belong to one 500 g La Milanaise product; they do not establish a reusable conversion or a recipe demand for this catalog row.

## Sources

The plan's existing sources `WP03-S27`, `WP03-S60`, `WP03-S68`, and `WP03-S69` are reused below. New page checks are dated 2026-10-14; new proposal IDs are local references only and were not added to the shared ledger.

| Source ID | Source and evidence | Limit |
|---|---|---|
| `WP03-S68` | CFIA, [Bactéries pathogènes et indicatrices dans l'avoine](https://inspection.canada.ca/fr/salubrite-alimentaire-lindustrie/chimie-microbiologie-alimentaires/rapports-danalyse-articles-revues/1-avril-2018-au-31-mars-2020-0). Uses `gruau d'avoine entier` for whole groats and distinguishes `avoine découpée`, flakes, and quick/instant oat products. | Federal food-survey terminology; not an OQLF decision. |
| `WP03-S69` | Canadian Grain Commission, [Glossary](https://www.canada.ca/en/grain-commission/services/grain-quality/official-grain-grading-guide/28-glossary/glossary.html). Defines oat groats as kernels with hulls removed and gives the technical French gloss `gruau`. | Supports the identity and technical gloss, not consumer naming preference in Québec. |
| `WP03-S27` | OQLF, [`gruau`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau). Defines the preferred Québec/Canada term as cooked oatmeal. | Applies to the unqualified dish name; does not reject the qualified CFIA food label `gruau d'avoine entier`. |
| `WP03-S60` | OQLF, [`avoine découpée`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26574686/avoine-decoupee). Defines steel-cut oats as whole oat kernels cut by steel blades; discourages `avoine épointée`. | Supports the adjacent cut-oat boundary, not a whole-groat alias. |
| `WP03-OG-QC-20261014-S01` | Québec Food Directory, [Amande avoine complète Biologique](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8215718), La Milanaise, GTIN 627062300154; listing updated 2026-04-09. Identifies the food as an oat-grain product under a Québec French market name. | A product and producer listing, not a terminology ruling; its translated preparation text also uses steel-cut wording. Do not transfer its portion or recipe directions. |
| `WP03-OG-QC-20261014-S02` | Aliments du Québec, [Organic Whole Oat Groats](https://alimentsduquebec.com/en/certified-products/cereal-products/organic-whole-oat-groats), same brand and 500 g product. Confirms the English product name and Québec retail availability. | English-language market listing; does not establish a French preferred term. |
| `WP03-OG-QC-20261014-S03` | La Milanaise, [Amandes d'avoine complètes biologiques](https://lamilanaise.com/categorie-produits/grains-biologiques/page/2/). The maker lists the whole-grain product and groups it with several steel-cut names. | Manufacturer naming for its products; the grouped synonyms reveal scope overlap rather than a general alias rule. |
| `WP03-OG-QC-20261014-S04` | Rachelle Béry, [L’avoine sous toutes ses formes](https://www.rachellebery.ca/fr/conseils/lavoine-sous-toutes-ses-formes/). Its steel-cut section includes `amande d'avoine complète` among names for grains cut into pieces. | Québec retail explainer; evidence of local usage and collision, not a controlled vocabulary. |

## Recommendation

Retain `ingredient-ref-oat-groats` as `oat groats / gruau d'avoine entier`, category `GRAIN_AND_CEREAL`, with empty aliases, no forms, null density, and no unit mappings. Recommend that the root reviewer close the independent Québec display check as **retain with the whole-kernel qualifier**. Do not promote `amande(s) d'avoine complète(s)` until a Québec terminology source or a product-specific query context can distinguish intact groats from steel-cut oats.
