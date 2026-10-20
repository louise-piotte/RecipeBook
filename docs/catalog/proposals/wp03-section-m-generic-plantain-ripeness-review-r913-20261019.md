# WP03 Section M — generic plantain ripeness review

- **Reviewed:** 2026-10-19
- **Status:** proposal only; recommend holding active catalog changes.
- **Scope:** the open Section M generic plantain-ripeness boundary. Decide whether green/unripe and ripe plantains need separate generic identities or forms. This review does not cover cultivars, branded products, flour or starch product expansion, or retailer/SKU rosters.
- **Plan anchor:** [Resolve generic melon/cantaloupe naming, plantain ripeness, cherry subtype, and cooking-class boundaries](../../RecipeBook-global-ingredient-catalog-plan.txt#L6982).

## Recommendation

Keep one fresh-fruit identity: `ingredient-ref-plantain`, **plantain banana / banane plantain**. Green/unripe and ripe plantains do not warrant separate generic ingredient identities. General food-use sources show that ripening stage can change plantain cooking behavior, so if a future bundled recipe requires an explicit stage, model it as a form under this existing identity.

Hold on adding those forms or maturity aliases now. The current bundled library has no plantain ingredient line to classify. Québec recipes use both `bananes plantains vertes` and `banane plantain bien mûre`, but they are recipe-specific wording, not a standardized maturity taxonomy. The OQLF also notes that some banana varieties are green at maturity; therefore, do not equate the color word *green* with *unripe* across plantains. Reopen when a bundled recipe names a maturity stage and the line-specific Québec French and English terms can be preserved without making that equivalence.

If reopened, assess a form under `ingredient-ref-plantain`, not a duplicate identity. Keep color, physiological maturity, and preparation as separate qualifiers. Do not attach green-plantain-flour aliases or the held plantain-starch candidate to fresh-fruit forms. This review adds no references, forms, aliases, recipe links, measurements, densities, conversions, yields, or substitutions.

## Current catalog and recipe state

The read-only snapshot contains 1,939 ingredient references, 203 forms, and 114 manifest-listed recipes with 1,123 ingredient rows.

| Artifact | Current plantain state | Disposition |
|---|---|---|
| Active fresh fruit | `ingredient-ref-plantain`: FRUIT, `banane plantain` / `plantain banana`; no aliases, density, or unit mappings. | Preserve as the single fresh-fruit identity. |
| Active forms | No form points to `ingredient-ref-plantain`; no active form has a plantain display or alias. | Add none pending bundled recipe demand and a clear stage term. |
| Bundled recipes | Scanned all 114 recipe files and 1,123 ingredient rows; no ingredient line or stored text names plantain. | No recipe link or form demand. |
| Research ledger | `ingredient-ref-plantain` is verified for identity from the OQLF banana entry; measurement and substitution remain `not_yet_researched`. | Do not infer measurement or substitution behavior. |
| Legacy candidates | No plantain-ripeness candidate is present. | Create none. |
| Green plantain flour | Separate `FLOUR_AND_STARCH` identity `ingredient-ref-green-plantain-flour`, with the current aliases `plantain flour` / `farine de plantain`. Its product wording and flour process are not fresh-fruit forms. | Preserve the existing product boundary and aliases on the flour row only. |
| Plantain starch | Separate unresolved `candidate-plantain-starch`; current evidence concerns isolated starch and Québec product naming. | Leave it separate; it does not decide fresh-fruit maturity. |
| Regional cooking banana | `ingredient-ref-east-african-highland-cooking-banana` is a separate crop identity for Matooke. | Do not merge it into generic plantain or use it as a synonym. |

The scan searched the manifest-listed recipe JSON for plantain wording and links, including `plantain`, `plantain banana`, `green plantain`, `ripe plantain`, `banane plantain`, `bananes plantains`, and common maturity wording. No direct or indirect recipe row was found.

## Evidence and limits

These sources establish a real culinary stage distinction and Québec usage of maturity-qualified wording. They do not support separate ingredient identities, a universal color-to-ripeness mapping, or an active form without recipe demand.

| ID | Source and relevant evidence | Limit |
|---|---|---|
| **S01 — WP03-M-PLANTAIN-RIPENESS-R913-20261019-S01** | OQLF, [banane (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297102/banane). It identifies `bananes à cuire (bananes-plantain)` and discusses maturity and variety; it explicitly notes that some varieties are green at maturity. This supports the Québec French fruit term and warns against using color as a universal stage label. | The 1990 entry does not establish named plantain maturity forms or provide cooking instructions for those forms. |
| **S02 — WP03-M-PLANTAIN-RIPENESS-R913-20261019-S02** | Tchango Tchango et al., FAO, [Plantain: Post-harvest Operations](https://www.fao.org/fileadmin/user_upload/inpho/docs/Post_Harvest_Compendium_-_Plantain.pdf), last reviewed 1999, pp. 3–5. The compendium describes ripe and unripe plantains used in boiled, roasted, and fried preparations, and names narrower uses of unripe or overripe fruit. It treats stage as a culinary variable, not a separate fruit identity. | It covers varied regional practices and names a specifically green **mature** plantain as well as unripe plantain. Its stage/use examples are not a Québec-wide recipe taxonomy or a conversion source. |
| **S03 — WP03-M-PLANTAIN-RIPENESS-R913-20261019-S03** | Télé-Québec Cuisinez, [Galettes de banane plantain](https://cuisinez.telequebec.tv/recettes/6918/galettes-de-banane-plantain). The recipe calls for `2 bananes plantains vertes` and cooks then flattens them. This is Québec recipe evidence for that French wording and one use of green plantain. | One recipe does not establish that *verte* always means unripe or define a generic form boundary. |
| **S04 — WP03-M-PLANTAIN-RIPENESS-R913-20261019-S04** | Télé-Québec Cuisinez, [Plantain frit simple et bon](https://cuisinez.telequebec.tv/recettes/183/plantain-frit-simple-et-bon). The recipe specifies `1 banane plantain bien mûre` for frying. This is Québec recipe evidence for ripe-stage wording and a use distinct from S03. | The recipe gives no standard maturity threshold or claim that every frying recipe requires ripe plantain. |
| **S05 — WP03-M-PLANTAIN-RIPENESS-R913-20261019-S05** | Vepowo et al., “Cooking mode and ripening stage influence physicochemical and nutritional properties of boiled plantain pulps,” indexed by [FAO AGRIS](https://agris.fao.org/search/en/providers/122653/records/65fab08dce216acd4b804c0c), 2024. The study compared unripe, semi-ripe, and ripe fruit for two genotypes and found cooking-stage-related variation in assessed properties. | Results are limited to two genotypes and the study methods; they establish neither a universal stage taxonomy nor recipe measures. |

No new sources were sought for cultivars, brands, product lines, flavours, SKUs, or retailer counts. Existing product-only evidence for plantain flour remains scoped to flour and is not transferred to the fresh-fruit reference.

## Reopen criteria

Reopen this boundary when a bundled or otherwise accepted recipe line names green, unripe, semi-ripe, ripe, or overripe plantain and the wording changes how the ingredient should be selected or used. Preserve the recipe's exact source wording. Establish whether it refers to visible color, ripening stage, or another condition before assigning a generic form or search alias. Keep the fresh plantain identity in place, and leave ingredient measurements, conversions, yields, and substitutions to separate evidence reviews.

The source IDs in this proposal are citations only; this proposal does not add ledger records.


## Root integration decision

Accepted as a hold. The generic plantain identity remains unchanged; no maturity alias or form was added because the bundled library has no plantain ingredient line. The plan remains open for the other Section M gaps. The cross-category queue review found no roster-only assignment in this review; commercial-product counts do not add ingredient diversity. See the [R913–R916 integration README](../batches/wp03-r913-r916-generic-boundary-integration-20261019/README.md).
