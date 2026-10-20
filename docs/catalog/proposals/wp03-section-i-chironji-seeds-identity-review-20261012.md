# WP03 Section I — chironji-seed identity review

- **Reviewed:** 2026-10-12
- **Status:** Integrated as recommended on 2026-10-12. See the [integration record](../batches/wp03-section-i-chironji-seeds-identity-integration-20261012/README.md) for post-integration checks and counts. Ownership and counts below are the pre-integration snapshot.
- **Scope:** The culinary seed/kernel of *Buchanania lanzan*. This review does not add fruit pulp, seed oil, medicinal use, or planting seed identities.
- **Source-ID prefix:** `WP03-I-CHIRONJI-SEEDS-20261012`, S01–S05. The IDs were checked against the live ledger before integration.

## Accepted identity

Add one identity-only reference:

| Field | Accepted value | Evidence limit |
|---|---|---|
| Stable ID | `ingredient-ref-chironji-seeds` | Unassigned in the pre-integration reference, form, legacy, and ledger ID surfaces. |
| Category | `NUT_SEED_AND_DRIED_FRUIT` | The reference is scoped to the seed/kernel as a food ingredient. |
| English display | `chironji seeds` | Health Canada names `Chironji seeds (Buchanania lanzan)`. |
| French display | `graines de chironji` | Santé Canada’s French entry uses this exact phrase. It is a descriptive bilingual food name, not an OQLF ruling. |
| English alias | `chironji seed` | Supported by the singular food-use wording in the reviewed sources. |
| French alias | `graine de chironji` | Santé Canada uses this singular in its description. |
| Other aliases | none | Keep `charoli`, `Cuddapah almond`, and `almondette` out of global aliases; they are regional or cross-crop common names that can blur product identity. |
| Default density / unit mappings | `null` / `[]` | No transferable density or kitchen conversion was found. |

Health Canada’s current English and French entries describe whole or minimally processed seeds and a history of food use. Health Canada states that entries in this list did not undergo a safety assessment for food use; do not treat the list as preparation or safety guidance. NIFTEM’s food-processing booklet describes edible chironji kernels and confectionery use, but its process-specific recipe quantities and cultivar data do not establish a general measure. [S01–S04]

## Identity and processing boundary

| Term or product | Decision | Evidence boundary |
|---|---|---|
| Chironji seeds/kernel of *Buchanania lanzan* for food | Include as the identity | Health Canada names this exact species and whole/minimally processed seed; NIFTEM describes edible seed kernels used in food. [S01–S04] |
| *Buchanania lanzan* fruit pulp | Keep separate | The fruit and edible kernel are distinct product parts. NIFTEM describes the pulp as a separate value-added product. [S03] |
| Chironji oil | Keep separate | It is extracted from the seed/kernel and is a processed oil product. [S03] |
| `charoli`, `Cuddapah almond`, `almondette` | Do not add as aliases | These are regional/common-name variants; the latter two contain `almond` language and are not Québec consumer seed labels. No recipe request requires them. [S03–S05] |
| Planting seed and medicinal preparations | Exclude | Food ingredient scope does not establish horticultural or medicinal use. Health Canada’s food listing is limited to its stated food novelty status. [S01, S02] |
| Roasted or ground seed | Do not add as a global form | NIFTEM describes preparation and example foods, but the bundled corpus has no chironji line and no general form specification is needed. [S03] |

## Measurements and substitutions

- **Measurement:** The identity stays at `researched_no_supported_value`. NIFTEM’s booklet includes one `1 tablespoon` recipe quantity and cultivar-specific kernel weights, but neither supplies a transferable mass-per-volume, household conversion, or density. No measurement observation, density, or unit mapping is added. [S03]
- **Substitution:** NIFTEM describes chironji as a palatable almond substitute in confectionery, but gives no tested recipe ratio, method, or adjustment. Record this as no supported automatic substitute; add no global or contextual rule. [S03]
- **Yield and conversions:** No transferable kernel, fruit, or oil yield applies to recipe lines. Add none.
- **Recipes:** No phrase hit was found in the current bundled corpus; add no recipe link.

## Pre-integration ownership and demand audit

The exact audit used the app’s `normalize_search_key` behavior across active reference displays/aliases, form labels/match terms, legacy candidate names/aliases, and ledger IDs. It found no exact owner for the accepted displays, singular aliases, or proposed ID `ingredient-ref-chironji-seeds`. The proposed source-ID prefix had no existing ledger entry. Nearby common names are not promoted as aliases.

The complete manifest scan covered 114 recipe files and 1,123 ingredient rows. It searched `chironji`, `chironji seeds`, `graines de chironji`, `charoli`, `Cuddapah almond`, `almondette`, and *Buchanania lanzan*; **zero full-file or ingredient-row hits** were found. The recipe corpus was 752,993 bytes with manifest-ordered digest `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27`.

## Implemented integration delta

Added `ingredient-ref-chironji-seeds` in `NUT_SEED_AND_DRIED_FRUIT` with the bilingual displays and singular aliases above. Added a verified identity ledger record with five sources, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. No forms, measurement observations, recipe links, density, unit mappings, conversions, yields, or substitution rules were added. The broad Section I seed/kernel checklist remains open.

## Source register

All sources were checked online on 2026-10-12. S01 and S02 are the English and French presentations of the same Health Canada list, not independent determinations.

| ID | Source | What it supports and what it does not |
|---|---|---|
| `WP03-I-CHIRONJI-SEEDS-20261012-S01` | Health Canada, [List of non-novel determinations for food and food ingredients](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html), entry dated 2025-05-29. | Names Chironji seeds (*Buchanania lanzan*), whole or minimally processed seeds, and a history of food use. The list says these entries did not undergo a safety assessment for food use. |
| `WP03-I-CHIRONJI-SEEDS-20261012-S02` | Santé Canada, [Liste des déterminations d’aliments et d’ingrédients alimentaires qui ne sont pas nouveaux](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/demander-determination-nouveaute/liste-determinations-pas-nouveaux.html), entry dated 2025-05-29. | Uses `Graines de chironji (Buchanania lanzan)` and `Graine de chironji entière ou minimalement transformée`. Supports the French display and singular alias; not an OQLF ruling. |
| `WP03-I-CHIRONJI-SEEDS-20261012-S03` | National Institute of Food Technology Entrepreneurship and Management / ICAR KVK Alappuzha, [Processing of Chironji](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/08/chironjiprocessing.pdf). | Describes *Buchanania lanzan*, edible kernels, and confectionery use. It also reports a single recipe quantity and cultivar measurements, which are not generalized as a recipe measure, density, yield, or substitution ratio. |
| `WP03-I-CHIRONJI-SEEDS-20261012-S04` | Government of India National Agriculture Market, [Chironji commodity parameter list](https://enam.gov.in/web/docs/221_commodity_list.pdf). | Identifies the commodity as dried *Buchanania lanzan* seeds and gives commodity quality parameters. It is not a household measure or recipe standard. |
| `WP03-I-CHIRONJI-SEEDS-20261012-S05` | DistaCart Canada storefront, [Gropure Organic Chironji Seeds](https://www.distacart.com/en-ca/products/gropure-organic-chironji-seeds). | Canada-facing product title and ingredient wording. This is an imported product listing, not a Québec French label or evidence of local stock. |

## Prior work checked

- `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section I, remaining melon-seed products and regional culinary kernels.
- The integrated identities for egusi, dried watermelon kernels, makhana, sacred lotus, pili nuts, perilla seeds, and the existing pumpkin/squash, sunflower, sesame, poppy, flax, hemp, and other kernels.
- The open magaz/magaj and regional melon-product holds; this proposal does not reopen their species/shell-state ambiguity.

The broader Section I seed, kernel, and butter/paste checklist remains open.
