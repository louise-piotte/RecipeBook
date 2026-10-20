# WP03 Section I — sunflower seed and kernel boundary review

- **Reviewed:** 2026-10-10
- **Status:** Proposal only. This review changes no catalog, ledger, plan, recipe, test, or code files.
- **Scope:** Edible sunflower achenes and their kernels, species/plant-part scope, shell state, confectionery versus oilseed market classes, related processed products, fr-CA wording, aliases, and bundled-library demand.
- **Deferred:** Other Section I seeds, sunflower oil, sunflower-seed butter, lecithin, meal/flour, sprouts, seed/feed grades, forms, measures, yields, and substitutions.

## Recommendation

Add one identity-only reference for the common edible sunflower seed product:

| Proposed field | Recommendation |
| --- | --- |
| ID | `ingredient-ref-sunflower-seeds` |
| English display | `sunflower seeds` |
| fr-CA display | `graines de tournesol` |
| Category | `NUT_SEED_AND_DRIED_FRUIT` |
| English aliases | Consider `sunflower kernels` as a lookup synonym for a dehulled edible product; do not add bare `sunflower`, oil/butter terms, or regional snack names without source and product scope. |
| French aliases | Add `graine de tournesol` for the OQLF preferred singular term if the display stays plural. Do not store the display phrase again as an alias. |
| Data | No form, density, unit mapping, package yield, recipe link, or substitution rule. |

The OQLF’s preferred term is **graine de tournesol**. Its note says that in food-industry and other nonspecialist contexts this term applies to both the hulled and unhulled achene. The proposed plural display **graines de tournesol** is natural for a recipe ingredient and supported by Québec retail usage. The proposed English display is the direct common equivalent, **sunflower seed(s)**. This gives one broad culinary identity without claiming that shell-on seeds and kernels share a measure or conversion.

The identity should be scoped to food-grade seed of cultivated common sunflower, *Helianthus annuus* L. In strict botanical wording, the commercial “seed” is the achene: the fruit includes the hull and contains the true seed/kernel. USDA’s sunflower-seed standard defines the seed commodity as including both kernel and hull. Do not broaden the entry to all *Helianthus* species; in particular, keep the existing Jerusalem artichoke (*H. tuberosus*) tuber identity and its `sunchoke`/`sunroot` terms separate.

## Product and naming boundaries

| Term or product | Evidence and scope | Catalog treatment |
| --- | --- | --- |
| `sunflower seed(s)` / `graine(s) de tournesol` | OQLF identifies the French term as an achene and explicitly says food use can refer to hulled or unhulled achenes. It also lists human food, animal feed, oil, biofuel, and planting seed as different uses of the crop. | One general edible seed identity is supported. Limit the catalog identity to culinary food-grade ingredient requests; do not infer food-grade status from a botanical name alone. |
| Hull-on seed and dehulled kernel | USDA defines dehulled seed as the hull removed from the kernel. Health Canada describes confectionery/non-oil seeds as commonly baked and dehulled for snack consumption. A Québec supplier sells `graines de tournesol décortiquées` and describes these as dehulled, cooking-ready seeds. | Treat `sunflower kernels` as a possible search alias for the same edible seed identity, not as an active state or conversion. If later recipe data requires shell-state processing, add a source-backed form only then; preserve the original wording and do not infer hull state from an unqualified line. |
| Raw, roasted/baked, and salted snack seeds | Health Canada documents baked/dehulled confectionery seed use. The Canadian Grain Commission distinguishes confectionery from oil classes; it describes the hull appearance and size used to classify the grain, not a culinary preparation rule. Québec retailers distinguish raw dehulled products. | Do not create separate identities or aliases for raw, toasted, roasted, salted, or unsalted states. No forms are proposed in this review. |
| Confectionery versus oilseed classes | Canadian grading standards define separate classes; confectionery seed is generally larger and has a grey/striped hull, while oilseed is generally smaller and darker. The standards classify agricultural lots, not a promise that a recipe’s `sunflower seeds` names a particular cultivar or grade. | Do not create class-specific ingredient rows or use `oilseed` as a culinary alias. Preserve a class qualifier only when a recipe or package explicitly requires it. |
| Sunflower oil | Oil is extracted from the seed and is a separate product; the Canadian food-standard material defines sunflower oil as oil of *H. annuus*. | Keep oil distinct from whole seed and kernel. Do not add `sunflower oil`/`huile de tournesol` as aliases for the seed identity. The current catalog has no sunflower oil row at this snapshot, so future oil work remains separate. |
| Sunflower-seed butter / branded SunButter | A seed-derived spread is sold and used as a spread, in oatmeal, sauces, and baking; its composition and prepared state differ from whole seed. | Separate processed-product identity if the roadmap or recipe corpus later needs it. Do not alias `sunflower butter`, `sunbutter`, or `beurre de graines de tournesol` to whole seeds. |
| Sunflower lecithin, meal/cake, flour/protein, hulls, sprouts/microgreens | These are source-qualified additives, oil-processing products, or other plant products rather than the generic whole culinary seed. Existing baking research already treats source-qualified sunflower lecithin as distinct from generic lecithin. | Do not alias these products to sunflower seeds. Keep seed-derived oil products and non-seed plant parts out of this bounded candidate. |
| Birdseed, feed grain, planting seed | OQLF and Canadian federal sources document these uses, but their products and intended uses are not automatically edible household ingredients. | Exclude feed mixes, planting lots, and seed grades from culinary aliases. |
| Regional snack names | No non-Québec regional snack term was established as a stable, unqualified fr-CA or English alias by the sources reviewed here. | Do not add `pipas`, `pipas de girasol`, `semechki`, or similar locale-specific names as global aliases. A source-specific recipe may retain its own wording without turning it into a universal synonym. |

The French wording is defensible without claiming a special OQLF term for a kernel: **graines de tournesol** is the broad OQLF term and a Québec retailer’s exact product title for hulled seeds is **graines de tournesol décortiquées**. The latter is a state-qualified product label, not a proposed synonym that would erase the dehulling detail. `Écalées` also appears in Québec retail copy for the same product state; no separate alias is needed.

## Catalog, legacy, ledger, proposal, and recipe audit

Snapshot date: **2026-10-10**. Counts and keys below describe the working-tree bytes identified by these SHA-256 values. They are an audit checkpoint; the coordinator should repeat the collision and recipe scan at integration time.

| Source inspected | Count/state | SHA-256 |
| --- | ---: | --- |
| Bundled `ingredient-references.v1.json` | 714 references; no reference name or alias contains `sunflower`, `tournesol`, or `Helianthus` | `200a6b7d0651b86cb8ccb286d8799c321d01fd41a8e6f7524fff432725cc8489` |
| Bundled `ingredient-forms.v1.json` | 34 forms; no sunflower, tournesol, or Helianthus form | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `docs/catalog/legacy-import-identities.v1.json` | 84 candidates; no sunflower/tournesol candidate | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| `docs/catalog/research-ledger.v1.json` | 903 records and 8 unit-conversion entries | `fcaf888322909022780f94d1744cf0bce70a01c265a4d1cdae0896fe4a61df20` |
| Bundled `manifest.v1.json` | 114 listed recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The normalized-key review covered `sunflower seed(s)`, `sunflower kernel(s)`, `sunflower heart(s)`, `graines de tournesol`, `graine de tournesol`, `graines de tournesol décortiquées`, `huile de tournesol`, `beurre de graines de tournesol`, and *Helianthus annuus*. No exact active reference, form, or legacy owner was found. The app uses NFKD/accent-folded lowercase keys and prefers complete word-phrase matches before substring fallback. A query for the proposed English singular can already match a plural `sunflower seeds` display by substring; the French preferred singular does not match the plural display that way, which is why the one French singular alias is useful. Do not add bare `sunflower` as an explicit alias: it is too broad, and the app’s partial matching may still surface the seed entry for that short query.

The ledger has related **mentions**, not a sunflower identity: the existing egusi record cites a Nigerian sunflower-seed egusi-style soup and records its recipe-specific alternative claim; a Jerusalem-artichoke record notes the plant’s relation to sunflower while identifying *Helianthus tuberosus*. Neither is evidence to merge sunflower seed with egusi or topinambour. The proposal review also checked the WP03 egusi, sesame/tahini, lotus/fox-nut, and makhana boundary packets, plus the baking-ingredient review’s source-qualified sunflower-lecithin note. No prior sunflower-seed identity proposal was found.

Every path in the manifest was read: **114 recipe files, 1,123 ingredient rows, no missing files**. Searches of all recipe text and each ingredient row for `sunflower`, `tournesol`, `Helianthus`, and the related kernel/heart terms returned **zero files and zero ingredient rows**. Thus the bundled corpus supplies no recipe link, hull-state requirement, or form demand.

## Measures, forms, and substitutions

- No density, household measure, unit mapping, package yield, or conversion is proposed. No generic measure research was done for this packet. In particular, do not transfer a sunflower oil density, an agricultural grain test-weight value, or a recipe-specific external quantity into a seed conversion.
- No active form is proposed. Hull state and roasting/salting are real product descriptors, but the bundled recipes do not require a form and this review does not establish a conversion between the hull-on achene and dehulled kernel. Keep any source wording on a future recipe line rather than silently assigning a state.
- An external Nigerian recipe titled “Sunflower Seeds Egusi Soup” says to replace egusi with sunflower seeds for that soup preparation. It gives `2 cups (290 g)` sunflower seeds and says to use the same cooking method. This is one recipe-specific alternative, not a general equivalence, measure, ratio, or basis for an active substitution rule. The existing egusi ledger record already captures the claim and its limit. Do not add a global sunflower-to-egusi or seed-family substitution.
- No recipe link or recipe relink is proposed.

## Proposal-local source-to-claim map

IDs below are unique to this packet and have not been added to the shared ledger. Sources were accessed on 2026-10-10 except where a source itself states an earlier publication/update date.

| Source ID | Source and locator | Claim supported and limit |
| --- | --- | --- |
| **WP03-SUN-20261010-S01** | Office québécois de la langue française, [GDT: graine de tournesol](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015064/graine-de-tournesol), definition, preferred term, note, and English equivalent. | Gives preferred French singular `graine de tournesol`, definition as an achene, English `sunflower seed`, uses including human food, and explicitly says the food-industry term applies to hulled and unhulled achenes. This is the principal fr-CA and broad-identity source. It does not set a recipe conversion. |
| **WP03-SUN-20261010-S02** | USDA Agricultural Marketing Service, [United States Standards for Sunflower Seed](https://www.ams.usda.gov/sites/default/files/media/SunflowerSeedStandards.pdf), §§ 810.1801–810.1802, PDF p. 2. | Anchors the cultivated crop as *Helianthus annuus* L.; defines the commodity `seed` as both hull and kernel, the hull-bearing fruit/achene, and defines dehulled seed as the hull removed from the kernel. This is a grain-standard definition, not a consumer recipe specification. |
| **WP03-SUN-20261010-S03** | Canadian Grain Commission, [Official Grain Grading Guide, Chapter 14: Sunflower Seed](https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/pdf/14-sunflower.pdf), PDF p. 2 and grade tables pp. 15–16; see also [classes page](https://www.grainscanada.gc.ca/en/grain-quality/official-grain-grading-guide/14-sunflower-seed/classes.html). | Distinguishes confectionery and oil classes and describes seed hull appearance/size criteria. Supports keeping market classes separate from culinary identity and not using hull color as a universal preparation alias. The guide is for grain grading. |
| **WP03-SUN-20261010-S04** | Health Canada, [Novel food information: herbicide-tolerant H4 sunflower](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/aliments-genetiquement-modifies-autres-aliments-nouveaux/produits-approuves/hybride-tournesol-h4-tolerant-herbicides.html), § 5 “Exposition alimentaire”, lines discussing food use. | States that confectionery/non-oil sunflower seeds are mainly baked and dehulled for direct snack consumption, alongside oil production. Supports real product states and culinary use; this is a particular variety’s food-safety assessment, not a recipe protocol or conversion. |
| **WP03-SUN-20261010-S05** | Arôme des champs, Québec producer, [Graines de tournesol décortiquées biologiques](https://boutiquearomedeschamps.com/products/graine-tournesol), product title and description; see its [producer page](https://www.laromedeschamps.com/), sections on seed/oil products. | Documents actual Québec retail wording `graines de tournesol décortiquées` and a separate cold-pressed sunflower-oil product. The producer describes the seed product as a Québec-grown, dehulled food ingredient. One retailer does not establish an OQLF-approved processing term or universal product specification. |
| **WP03-SUN-20261010-S06** | La Moisson, Québec retailer, [Graines de tournesol crues décortiquées biologiques](https://lamoisson.com/products/graines-de-tournesol-crues-decortiquees-biologique), product title and product/ingredient description. | Confirms local retail use of `crues`, `décortiquées`, `écalées`, and the generic ingredient phrase `graines de tournesol`; identifies a raw shelled product for direct use and recipes. Label evidence only; it does not establish a conversion. |
| **WP03-SUN-20261010-S07** | University of Connecticut Extension, [The Nutritional Benefits of Nut & Seed Butters](https://extension.uconn.edu/publication/nut-seed-butters/), `Sunflower Seed Butter` section. | Treats sunflower seed butter as a seed-derived spread with different uses from whole seed, including oatmeal, sauces, and baking. Supports a separate processed-product boundary, not a shared reference or substitute ratio. |
| **WP03-SUN-20261010-S08** | All Nigerian Recipes, [Sunflower Seeds Egusi Soup](https://www.allnigerianrecipes.com/soups/sunflower-seeds-egusi-soup/), title, introductory substitution note, ingredient list, and preparation notes. | Presents sunflower seed as a regional recipe alternative for egusi soup, calls for 2 cups/290 g for that recipe, and says to follow the same method. This is narrow culinary context only; it does not establish a general substitution or transferable unit mapping. The existing egusi ledger entry already records it. |

## Coordinator integration notes

1. Re-run exact-key ownership against the current references, forms, 84-candidate legacy file, and ledger at merge time; retain the human source/product scope for every alias.
2. If accepted, add only the generic food-grade seed identity in `NUT_SEED_AND_DRIED_FRUIT`. Use `sunflower seeds / graines de tournesol`; consider the English kernel alias and use `graine de tournesol` as the French singular alias. Keep the displayed French plural natural for recipe ingredients.
3. Keep oil, butter/spread, lecithin, cake/meal, flower, tuber, feed, planting seed, and species-specific market lots distinct. Do not add bare `sunflower`, `sunroot`, `sunchoke`, `pipas`, `semechki`, or a cross-family alias.
4. Add no form or numeric data in this merge. Revisit hull, roast, and salt states only when recipe demand exists and a form can preserve the exact state without implying a yield or conversion.
5. Leave the broader WP03 Section I checklist open. This packet addresses only its sunflower-seed/kernel portion.

**Decision requested:** accept the identity-only sunflower seed candidate and source-backed fr-CA wording; hold all forms, measurements, conversions, recipe links, and substitutions.
