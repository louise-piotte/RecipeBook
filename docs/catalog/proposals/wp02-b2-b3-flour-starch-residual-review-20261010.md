# WP02 residual flour identity review: pulse and nut flours

- **Batch:** WP02-B23-FLOUR-RESIDUAL-20261010
- **Date:** 2026-10-10
- **Status:** Integrated on 2026-10-11. The five accepted identity-only references and evidence records are in the canonical package; recipes, forms, numeric behavior, and substitutions remain unchanged.
- **Coverage crosswalk:** The active outline places the remaining peanut, lentil, pea, and lupin flour terms under B1. This is the uncovered flour portion queued with WP02 regional flour/starch work. The existing B2/B3 regional-starches residual review covers arrowroot and water-chestnut products; this packet does not reopen or duplicate it.
- **Recommendation:** Accept five narrowly named, identity-only flour candidates: green lentil flour, yellow pea flour, partially defatted peanut flour, sweet lupin flour from *Lupinus albus*, and sweet blue lupin flour from *Lupinus angustifolius*. Hold broad, color-free pulse-flour labels and all unsourced aliases. The live recipe corpus contains no demand for any of these flour identities.

## Read-only audit snapshot

The review inspected the active plan and flour batch, the current canonical reference and form files, the research ledger, legacy import candidates, existing proposals, and the manifest-ordered bundled recipe corpus.

| Surface | Snapshot at this review |
|---|---|
| Canonical ingredient references | 795 rows; SHA-256 ba56d62f2f1e8a0b7cef04714eaca075fbacde76bfeb7020927aa6fe9b08f6fb |
| Canonical ingredient forms | 36 rows; SHA-256 1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef |
| Research ledger | 1,021 records; 2,183 source entries; 1,765 distinct source IDs; SHA-256 936c1e2ce2867ae360f7ec6842248b214118193493819a08686f920e9d64f8e |
| Legacy import candidates | 81 rows; SHA-256 2749996a0cb7e19a5646a42ac4045e40f50ea792395a42e970c500bfe3dd1503 |
| Bundled recipe corpus | 114 recipe files; 1,123 ingredient rows; manifest-ordered corpus fingerprint 806c88c67b42177ddd6671fce0134d0063df30c677112770e2e5767b627b045a |

The corpus fingerprint was calculated from manifest-ordered recipe paths and exact file bytes, with NUL separators and a trailing NUL per file. These values describe a point-in-time working tree. Each suggested reference ID below was absent from the active references, forms, legacy candidates, and ledger record IDs. The proposed source-ID prefix was absent from existing proposal source IDs and ledger sources.

The exact phrase audit found **zero matching ingredient rows** for the flour candidates reviewed here. Nearby whole-ingredient lines are not flour demand: Recipe 090 contains peanut butter and a peanut garnish; Recipe 105 contains two cups of dried yellow peas; Recipe 078 contains frozen peas and carrots. None supports a flour relink or conversion.

## Candidate dispositions

All accepted candidates use category FLOUR_AND_STARCH. Candidate IDs are recommendations for root integration, not IDs already added to the canonical catalog.

| Candidate | Proposed ID and bilingual display | Disposition and evidence boundary |
|---|---|---|
| Green lentil flour | **ingredient-ref-green-lentil-flour** — green lentil flour / farine de lentilles vertes | **Accept, identity only.** A Québec mill markets organic green lentil flour in English, and Aliments du Québec lists the corresponding French product as farine de lentilles vertes biologique [S03–S04]. These sources support the unqualified flour class names as part of a specific organic product label; they do not support an organic attribute for every green lentil flour. Do not alias generic lentil flour, yellow lentil flour, decorticated lentil flour, or pre-gelatinized lentil flour to this row. |
| Yellow pea flour | **ingredient-ref-yellow-pea-flour** — yellow pea flour / farine de pois jaune | **Accept, identity only.** Cuisine Soleil/Moulin A. Coutu presents the same bilingual product name for a flour it identifies as coming from mature, dried *Pisum sativum* peas, and distinguishes those from immature green peas [S05]. Health Canada separately lists yellow-pea flour as a flour made from yellow peas [S01–S02]. Keep the display color-qualified. Do not alias pea flour, split-pea flour, green-pea flour, or pea protein. |
| Peanut flour | **ingredient-ref-partially-defatted-peanut-flour** — partially defatted peanut flour / farine d’arachide partiellement dégraissée | **Accept only this scoped identity.** USDA ARS describes peanut flour as a dry powder produced after partial oil extraction from roasted peanuts. ADM’s English and Canadian French product pages name partially defatted peanut flour / farine d’arachide partiellement dégraissée and distinguish product fat and roast grades [S06–S08]. Keep the name explicitly defatted; do not merge whole ground peanuts, full-fat peanut meal, peanut butter, powdered peanut-butter mixes, or peanut protein isolates. |
| Sweet lupin flour, *Lupinus albus* | **ingredient-ref-sweet-lupin-flour** — sweet lupin flour / farine de lupin blanc | **Accept, species scoped.** Health Canada’s bilingual list separately names sweet lupin flour and farine de lupin blanc, and identifies *L. albus* [S01–S02]. This is a federal bilingual label, not an OQLF preferred-term determination. Keep independent Québec wording review open; do not add generic lupin flour as an alias. |
| Sweet blue lupin flour, *Lupinus angustifolius* | **ingredient-ref-sweet-blue-lupin-flour** — sweet blue lupin flour / farine de lupin à feuilles étroites | **Accept, species scoped.** Health Canada separately names sweet blue lupin flour and the French label farine de lupin à feuilles étroites ou lupin bleu, identifying *L. angustifolius* [S01–S02]. Use the narrower species-identifying French construction as the proposed display; the source-attested lupin bleu wording may be considered as a French alias only after Québec terminology review. Do not alias unqualified lupin flour or lupini seed. |

### Hold for separate review

| Candidate wording | Disposition | Reason |
|---|---|---|
| Generic lentil flour / farine de lentilles | Hold as an unqualified identity or alias. | The sources reviewed distinguish green, yellow, red, and decorticated products. The Québec mill directly supports green lentil flour; Health Canada lists yellow lentil flour, but its French entry is written as farine de lentilles jaune. Do not silently regularize that federal label into a preferred Québec display or generalize the green product to all lentil flours. |
| Generic pea flour / farine de pois | Hold as a display or stored alias. | The directly supported Québec product is yellow-pea-specific. Current search can match the phrase pea flour inside chickpea flour, and farine de pois inside farine de pois chiche. Keep the fully qualified candidate display and require users to choose among results; do not store the broad phrase as a synonym. |
| Generic peanut flour / farine d’arachide | Do not create a second generic row or stored alias. | The accepted English display already contains the phrase peanut flour. The proposed French display keeps ADM’s explicit partiellement dégraissée qualifier; no source here establishes a Québec generic preferred French term or a single full-fat/defatted cross-product equivalence. |
| Generic lupin flour / farine de lupin | Hold. | The official bilingual entries identify two different species-specific flours. Neither entry proves that all lupin species or flour products are equivalent. |
| Split-pea, green-pea, yellow-split-pea, decorticated, pre-gelatinized, roasted, or other processed flour names | Hold unless separately reviewed. | Manufacturer product families distinguish some of these preparation classes. The current catalog has no typed variety/process field that would preserve those distinctions as attributes, and this packet does not establish shared bilingual names. |

## Canonical boundaries and recipe demand

The existing whole-food references remain separate: ingredient-ref-lentils is whole lentils; ingredient-ref-peas is green peas; ingredient-ref-yellow-peas is dried yellow peas; and ingredient-ref-peanuts plus ingredient-ref-peanut-butter cover whole peanuts and peanut butter. Existing ingredient-ref-chickpea-flour and ingredient-ref-chana-sattu remain separate from these proposals. No candidate should be attached to a whole-pulse, whole-nut, peanut-butter, or roasted-preparation row merely because the source plant is shared.

| Flour family searched across all 1,123 recipe rows | Exact recipe demand | Adjacent but distinct rows |
|---|---:|---|
| Lentil flour, including green and yellow | 0 | No lentil-flour row. |
| Pea flour, including yellow pea flour | 0 | Recipe 105 has dried yellow peas; Recipe 078 has frozen peas and carrots. |
| Peanut flour | 0 | Recipe 090 has peanut butter and a separate peanut garnish; other peanut rows are whole peanuts or peanut butter. |
| Lupin flour | 0 | No lupin-flour row. |

Do not create a recipe link or relink an existing line from this review. In particular, Recipe 105’s volume for dried whole peas is not a flour measurement.

## Explicit data boundaries

- Proposed rows are identity-only. Leave defaultDensity null and unitMappings empty.
- Add no RecipeIngredientForm, preparation state, package form, or other form/conversion record.
- Record no numeric property from a product label or research page. Do not translate source nutrition values, fat grades, roasting grades, or package amounts into catalog measurements.
- Add no cup-to-mass or mass-to-volume mapping, density, household conversion, or recipe scaling rule.
- Add no global or contextual substitution, including flour-for-flour, flour-for-whole-pulse, flour-for-protein, or thickening replacements. Product-use text is not a substitution rule.
- Add no recipe ingredient link, measurement observation, yield, or conversion edge. No recipe need was found.
- Treat the Health Canada list strictly as identity and terminology evidence. Health Canada states that listed determinations concern novelty status and did not undergo a food-safety assessment [S01–S02].

## Source register

The initial source review was accessed 2026-10-10 and the primary product/authority pages were rechecked on 2026-10-11. IDs use the unique prefix WP02-B23-FLOUR-RESIDUAL-20261010.

- **S01** — [Health Canada, List of non-novel determinations for food and food ingredients](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html). Exact English flour labels and descriptions for sweet lupin (*Lupinus albus*), sweet blue lupin (*L. angustifolius*), yellow lentils, and yellow peas.
- **S02** — [Santé Canada, Liste des déterminations d’aliments et d’ingrédients alimentaires qui ne sont pas nouveaux](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html). Exact French labels for farine de lupin blanc, farine de lupin à feuilles étroites ou lupin bleu, farine de lentilles jaune, and farine de pois jaune. The page itself limits these decisions to novelty status and says they are not safety assessments.
- **S03** — [Aliments du Québec, Farine de lentilles vertes biologique](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-de-lentilles-vertes-biologique). Québec product listing for the green-lentil-flour label, attributed to La Minoterie des Anciens / Pure Gaspésie.
- **S04** — [La Minoterie des Anciens, Organic green lentil flour](https://www.laminoteriedesanciens.com/en/products/flour/organic-green-lentil-flour). Québec mill product page supporting the English green-lentil-flour label; its organic and recipe-use claims are not imported.
- **S05** — [Cuisine Soleil/Moulin A. Coutu, Yellow pea flour](https://cuisinesoleil.com/en/product/yellow-pea-flour/) and [Farine de pois jaune](https://cuisinesoleil.com/produit/farine-de-pois-jaune/). Paired Canadian product pages support the bilingual name and identify yellow pea as mature, dried *Pisum sativum*, distinct from immature green peas. Product nutrition and recipe suggestions are not imported.
- **S06** — [USDA Agricultural Research Service, The Powers of Peanut Flours](https://www.ars.usda.gov/news-events/news/research-news/2007/the-powers-of-peanut-flours/). Research summary defines peanut flour as a dry powder after partial oil extraction from roasted seed and describes distinct commercial fat and roast grades. It is archived; its performance findings are not imported.
- **S07** — [ADM, Peanut Flour](https://www.adm.com/en-us/products-services/human-nutrition/products/peanuts/nuts/). Manufacturer page labels its products partially defatted peanut flours and describes multiple fat and roast grades; used for product identity only.
- **S08** — [ADM Canada, Farine d’arachide (partiellement dégraissée)](https://www.adm.com/fr-ca/produits-et-services/nutrition-humaine/produits/noix/). Canadian French product label and grade distinctions; this is product-label evidence, not an OQLF terminology ruling.

## Integration result — 2026-10-11

- Added `ingredient-ref-green-lentil-flour`, `ingredient-ref-yellow-pea-flour`, `ingredient-ref-partially-defatted-peanut-flour`, `ingredient-ref-sweet-lupin-flour`, and `ingredient-ref-sweet-blue-lupin-flour` as `FLOUR_AND_STARCH` references.
- The current exact-name/alias audit found no prior reference, form, legacy candidate, or ledger record for these identities. The 114-file / 1,123-row manifest-ordered recipe corpus contains no exact demand; no recipe was linked or changed.
- All five rows have empty aliases, null density, and empty unit mappings. No forms, measurement observations, conversions, yields, recipe links, or substitution findings were added. The two French lupin labels remain open to independent Québec terminology review; `lupin bleu` was not activated as an alias.
- The ledger now contains five verified identity records with 13 source entries. Measurement and substitution research remain `not_yet_researched`.
- See `docs/catalog/batches/wp02-b2-b3-flour-starch-residual-integration-20261011/README.md` for fingerprints and verification results.
