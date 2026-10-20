# WP02 B2 R72: sacred lotus seed flour identity boundary

## Scope and status

- **Review date:** 2026-10-13
- **Status:** Integrated in [the R72 batch record](../batches/wp02-b2-lotus-seed-flour-identity-integration-20261013/README.md).
- **Candidate:** flour made from edible seeds of sacred lotus, *Nelumbo nucifera*.
- **Source-ID disposition:** `S01`–`S11` are registered in the active research ledger as part of R72 integration. `S12` is a proposal-archive cross-reference and is not a ledger source.
- **Review inputs:** the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), [WP02 baking-flours-starches batch](../batches/baking-flours-starches.md), current active references/forms/legacy identities/ledger, the [R70 cereal-starch review](wp02-b2-b3-cereal-starch-gap-review-20261013-round70.md), the [R71 Lima-flour review](wp02-b2-b3-next-open-starch-boundary-review-20261013-r71.md), and the lotus seed/root proposals linked below.

## Recommendation

**Add one identity-only flour reference for research-documented human-food use, with an explicitly provisional Québec French display.** The source evidence establishes flour made from *Nelumbo nucifera* seeds as a formulation ingredient for noodles and baked products. It does not establish a current Canadian/Québec retail SKU or a general consumer product specification. Bound this identity to seed flour used in cooked or baked food formulations; do not imply that arbitrary lotus seeds are food grade, that raw flour is ready to eat, or that a product is currently available in Canada.

| Integrated field | Value |
|---|---|
| Stable ID | `ingredient-ref-lotus-seed-flour` |
| Category | `FLOUR_AND_STARCH` |
| English display | sacred lotus seed flour (Nelumbo nucifera) |
| fr-CA display | farine de graines de lotus sacré (Nelumbo nucifera) — **provisional descriptive construction**, not a preferred OQLF term or a Québec product label |
| English / French aliases on the new flour row | None |
| Forms, recipe links, density, unit mappings, conversions, yields, substitutions | None |
| Companion picker alias on existing `ingredient-ref-lotus-seeds` | Add English alias `sacred lotus seed`; no French singular alias |

### Separate identity versus a form of whole seeds

Prefer the new `FLOUR_AND_STARCH` reference over adding a flour form under `ingredient-ref-lotus-seeds`. The food studies mill seed cotyledons into flour and then use that flour directly as the ingredient in noodle and biscuit formulations. This gives the flour its own ingredient identity and category. A form would instead be indexed under the `NUT_SEED_AND_DRIED_FRUIT` whole-seed reference: `IngredientReferenceSearchIndex` includes form terms in the parent reference’s search terms, so a flour query would return the whole-seed reference (possibly with a form hint for an exact form label), not a separate flour picker result. That projection blurs the distinction between whole seeds and flour used as a recipe-line ingredient. The studies also use different seed-coat, drying, milling, and pre-gelatinization processes, with no bundled recipe demand or general seed-to-flour yield to support a reusable form conversion. Reconsider a form only if future recipe evidence consistently treats the flour as an explicitly prepared state of the seed ingredient rather than as a separate flour ingredient.

This identity choice does not claim separate retail availability. It reflects the distinct material and recipe role documented in the studies. The species-qualified whole-seed identity remains active and separate.

The botanical and food-formulation boundary is sufficiently distinct for an identity row: the flour is made from seeds, not from the lotus rhizome, and is not lotus-root starch. Preserve the species qualifier. Do not add bare lotus flour, lotus powder, lotus root flour, lotus root powder, farine de lotus, farine de racine de lotus, poudre de racine de lotus, or makhana/foxnut/foxnut-flour wording as aliases. Do not link or alias this identity to whole seeds, *Euryale ferox* makhana, lotus root, or lotus-root starch.

## Product and Québec French evidence

Kew accepts *Nelumbo nucifera* as a species in Nelumbonaceae; the Muséum national d’Histoire naturelle uses the French species name **lotus sacré** and describes the seeds as eaten raw, grilled, or reduced to paste for pastry [S01–S02]. These sources establish the plant and edible seed, not a flour label.

Two primary food studies make the narrower flour identity concrete. Ashoka and Revanna’s 2022 study used *N. nucifera* seeds from Karnataka and Tamil Nadu, removed the seed coat, dried the seeds at 60°C, ground them, and sieved the flour to 72 µm [S04]. Jirukkakul and Sengkhamparn’s 2018 study removed the hard seed coat, milled dried *N. nucifera* cotyledons, and tested native and pre-gelatinized flour in noodles that were subsequently cooked [S05]. A 2026 biscuit study also names *N. nucifera* in its title and reports seed-flour formulations [S06]. Taken together, these support a human-food flour identity with documented cooked/baked applications. The processing methods vary; none supplies a universal retail-grade definition or establishes ready-to-eat raw-flour use.

The proposed French construction combines the MNHN French common name **lotus sacré** with OQLF’s generic food definition of **farine**, a powder from milling grain kernels and some plant species [S02–S03]. OQLF does not name lotus seed flour, and no current Québec/Canadian bilingual seed-flour package was verified. Keep the fr-CA display provisional pending independent Québec terminology review. Do not borrow **farine de racine de lotus**: OQLF uses **racine de lotus** for the edible rhizome vegetable [S12], and the current extracted product is separately displayed as **amidon de racine de lotus**.

### Current listing check

No verified current Canadian/Québec consumer listing for flour specifically identified as *Nelumbo nucifera* seed flour was found in targeted searches on 2026-10-13. A live Indian seller page offers “Makhana Atta” and also describes it as “lotus seed flour,” with chapati, pancake, and halwa uses [S07]. The seller does not name a species. India’s Ministry of Agriculture identifies makhana as *Euryale ferox*, a different accepted species from *N. nucifera* [S08–S09]; therefore the product page cannot verify a sacred-lotus flour listing. This species assignment is an inference from the seller’s Makhana name and the official makhana identity, not a botanical statement on the seller page. A current US grocery search page surfaced “West Lake Lotus Root Flour,” a root product, rather than a verified seed-flour SKU [S10]. These results are not evidence of Canadian or Québec availability.

## Current ownership and archive audit

Snapshot checked on 2026-10-13:

| Source of ownership | Current state |
|---|---|
| Active references, [ingredient-references.v1.json](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,394 rows; SHA-256 `4fd115aebdf62ee716c7dfc31bf131c092730ba8b6c323f6f7271c6f66781e1d`. The only active lotus-related rows are `ingredient-ref-lotus-root` (`lotus root` / `racine de lotus`), `ingredient-ref-lotus-root-starch` (`lotus root starch` / `amidon de racine de lotus`), and `ingredient-ref-lotus-seeds` (`sacred lotus seeds (Nelumbo nucifera)` / `graines de lotus sacré (Nelumbo nucifera)`). None has aliases, active density, or unit mappings. No seed-flour row or exact proposed display owner exists. |
| Active forms, [ingredient-forms.v1.json](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 102 rows; SHA-256 `e1af2e3a024ae4d2f2879f90dca62835305706b38b41c4850f7df3e855d84e22`. No lotus, *Nelumbo*, or flour form exists. |
| Legacy candidates, [legacy-import-identities.v1.json](../legacy-import-identities.v1.json) | 63 candidates; SHA-256 `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb`. No lotus-seed-flour candidate or reserved legacy owner exists. |
| Research ledger, [research-ledger.v1.json](../research-ledger.v1.json) | 1,729 records; SHA-256 `906111c255507131383001184734140d22f6d37af5fde32c44ad4285b1cc9406`. The whole-seed identity has one historical USDA SR28 observation: dried whole *Nelumbo* spp., 1 cup = 32 g. The lotus-root-starch identity has no measurement observations and remains `needs_clarification`; root vegetable measurements are also unresearched. There is no flour record, flour density observation, seed-to-flour conversion, or flour substitution record. |
| Generated picker catalog | [BundledIngredientCatalog.kt](../../../app/src/main/java/app/recipebook/data/local/recipes/BundledIngredientCatalog.kt) contains the same three active lotus identities; no flour entry exists. |
| Plan and review archive | Section B still leaves alternative-flour coverage open; Section B3 remains partial under “Water-chestnut flour and other documented regional starches.” R70’s barley/oat cereal-starch decisions and R71’s Lima-bean-flour review are separate and are not reopened. The WP03 [whole lotus seed / fox-nut boundary review](wp03-lotus-seed-fox-nut-boundary-review-20261010.md) established a species-qualified seed identity and explicitly left flour-specific product review for later. The WP02 [lotus-starch Québec wording review](wp02-b2-b3-lotus-starch-quebec-wording-review-20261010.md) covers extracted rhizome starch and keeps it apart from root flour/powder; it does not review seed flour. Searches of proposal and batch archives found no earlier dedicated sacred-lotus seed-flour decision. |
| Proposal path and source prefix | The requested path did not exist before this write. The proposed ID and source prefix were absent from active references, forms, legacy identities, ledger, proposals, and batch reports. |

The current ledger’s whole-seed cup value must remain attached to that historical dried whole-seed record. It is not flour evidence and must not be copied to this candidate.

## Picker ownership and projection

The projection follows the actual accent/punctuation normalization and complete-phrase-before-substring matching in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The “Flour identity only” column uses the proposed displays and no flour aliases; the last column additionally applies the English companion alias on the existing whole-seed row.

| Query | Current result | Flour identity only | Flour identity + recommended seed alias |
|---|---|---|---|
| `lotus seed flour` | None | Sacred lotus seed flour only | Sacred lotus seed flour only |
| `farine de graines de lotus sacré` | None | Sacred lotus seed flour only | Sacred lotus seed flour only |
| `lotus seed` | Whole sacred-lotus seeds by substring fallback (`lotus seeds` contains the character substring) | Flour only: the flour display contains `lotus seed` as a complete word phrase, so the exact-phrase pass returns it before substring fallback | Both whole seeds and flour |
| `sacred lotus seed` | Whole sacred-lotus seeds by substring fallback | Flour only: its canonical display contains the complete singular phrase | Both whole seeds and flour |
| `sacred lotus seeds` | Whole sacred-lotus seeds | Whole sacred-lotus seeds only | Whole sacred-lotus seeds only |
| `graines de lotus sacré` | Whole sacred-lotus seeds | Whole seeds and seed flour; both displays contain this complete phrase | Whole seeds and seed flour |
| `graine de lotus sacré` | None | None; no singular French alias is proposed | None; no singular French alias is proposed |
| `lotus root` / `racine de lotus` | Lotus-root vegetable and lotus-root starch | Same two results | Same two results |
| `lotus root starch` / `amidon de racine de lotus` | Lotus-root starch only | Lotus-root starch only | Lotus-root starch only |
| `lotus root flour` / `farine de racine de lotus` | None | None | None |
| `lotus` | Root, root starch, and whole sacred-lotus seeds | Same three plus seed flour | Same four results |

**Picker guard for integration:** add the species-qualified singular search phrase `sacred lotus seed` to the existing whole-seed row’s English aliases at the same time as the new flour identity. This is a search-only singular variant of the already species-qualified whole-seed name, not a claim that it is a separate preferred product name. `IngredientSearch.kt` first returns complete word-phrase matches, then falls back to character-substring matching. Therefore, without the companion alias, `lotus seed` and `sacred lotus seed` switch from the current whole-seed result to the flour result: the new flour display wins the complete-phrase pass, so substring fallback does not also return the plural whole-seed display. With the companion alias, both identities contain the singular phrase and both are returned. Keep the flour row’s aliases empty; do not add bare `lotus seed(s)`, `graines de lotus`, root-flour, or root-starch aliases. Explicit English and French flour queries remain flour-only. The French plural query `graines de lotus sacré` returns both whole seeds and flour; `graine de lotus sacré` currently returns neither, and remains an unresolved singular search term. Keep French singular aliases off the seed row pending Québec terminology review.

The broad `lotus` query intentionally returns separate root, root-starch, whole-seed, and seed-flour results after integration. A form under the whole-seed reference would keep `lotus` as a single whole-seed result, with no distinct flour identity in the picker.

## Bundled recipe demand

The current manifest lists 114 recipe files. All 114 files were present; they contain 1,123 ingredient rows, of which 1,097 have an ingredient reference ID. Full-text and ingredient-object scans for lotus, *Nelumbo*, seed-flour wording, French flour wording, root-flour wording, and the related whole-seed terms found zero matches. There is no bundled recipe demand or recipe line to link.

## Numeric, conversion, and substitution evidence

| Evidence | Bounded finding | Catalog behavior proposed |
|---|---|---|
| Study-specific bulk density | Ashoka and Revanna report 0.50 g/mL loose and 0.58 g/mL packed bulk density for their flour sample [S04]. Their sample came from seeds with the seed coat removed, dried at 60°C, milled, and sieved to 72 µm; the study measured a cylinder sample and then tapped it. These values describe that study’s flour and packing method, not a household measuring convention or a retail-grade range. | Keep as bounded evidence only. `defaultDensity` stays null; unit mappings stay empty. |
| Household measure | No common cup/spoon mass for *N. nucifera* seed flour was found. The existing historical USDA 1 cup = 32 g observation is for dried whole seeds, not flour, and is outside this candidate’s ledger scope. | No cup, spoon, or other mass mapping. Do not transfer the whole-seed measure. |
| Processing conversion | The 2018 noodle study uses a seed-coat-removed cotyledon flour, with a separate pre-gelatinized branch boiled at 100°C for 10 minutes at a 1:4 seed-to-water ratio, then dried at 60°C for 8 hours and milled through 80 mesh [S05]. The 2022 study uses a different drying and sieving process [S04]. Neither supplies a general seed-to-flour yield or interchangeability rule. | No process form, yield, seed-to-flour conversion, or native-to-pregelatinized conversion. |
| Recipe-specific replacement | The 2018 noodle study tested 5%, 10%, and 15% flour replacements; its 5% pre-gelatinized formulation was closest to the control in consumer acceptance, and the finished noodles were cooked [S05]. The 2026 biscuit study tested 20%, 40%, and 60%; 20% received the highest scores among the flour formulations, while the control remained highest overall [S06]. | These are formula- and process-specific research observations, not a general wheat-flour substitution ratio. Add no active or contextual substitution rule. |
| Raw use and safety | The sources establish edible seeds and flour in research formulations. The flour studies use processed seeds, and the tested foods are cooked noodles or baked biscuits. They do not establish safety or suitability of consuming unprocessed/raw flour. | Limit the identity rationale to cooked/baked food formulation evidence; do not make a raw-flour or ready-to-eat claim. |

## Source register

All sources below were checked online on 2026-10-13.

| ID | Source | Supports and limits |
|---|---|---|
| S01 | Kew, [Plants of the World Online: Nelumbo nucifera](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:605422-1) | Accepted species and classification in Nelumbonaceae; botanical identity only. |
| S02 | Muséum national d’Histoire naturelle, [Lotus sacré](https://www.mnhn.fr/fr/lotus-sacre) | French common name tied to *N. nucifera*; edible uses include seeds raw, grilled, or as pastry paste. French botanical source, not Québec product terminology. |
| S03 | OQLF, [farine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432781/farine) | Generic food definition for farine; does not establish the compound lotus-seed-flour name. Entry last updated 1982. |
| S04 | Ashoka and Revanna, [“Physico Chemical and Functional Properties of Lotus (Nelumbo nucifera) Seed”](https://www.uasbangalore.edu.in/images/2022-4th-Issue/7.pdf), Mysore Journal of Agricultural Sciences 56(4), 2022, pp. 61–67 | Primary study; sample collection, seed-coat removal, drying/milling process, loose and packed bulk-density values. These are sample-specific lab observations. |
| S05 | Jirukkakul and Sengkhamparn, [“Physicochemical properties and potential of lotus seed flour as wheat flour substitute in noodles”](https://sjst.psu.ac.th/journal/40-6/16.pdf), Songklanakarin Journal of Science and Technology 40(6), 2018, pp. 1354–1360 | Primary study; specifies *Nelumbo nucifera*, seed-coat removal, native/pregelatinized flour processes, 5–15% noodle formulations, and cooked-food evaluation. No general substitution recommendation. |
| S06 | Ashoka and Revanna, [“Lotus (Nelumbo nucifera) Seed Powder as a Novel Ingredient for the Formulation of Biscuits”](https://doi.org/10.1080/15428052.2026.2723041), Journal of Culinary Science & Technology, published online 2026-08-24 | Primary study abstract reports 20/40/60% flour formulations and relative sensory findings. Cookie/biscuit-specific; it does not establish a general exchange rate or a Québec-market product. |
| S07 | Mharajabhog, [Makhana Atta product page](https://mharajabhog.com/products/mharajabhog-premium-makhana-atta-1kg-100-pure-lotus-seed-flour-healthy-flour-for-a-healthier-you) | Live Indian food listing uses both Makhana Atta and “lotus seed flour” wording, describes food uses, and does not state a botanical species or Canadian distribution. |
| S08 | Government of India, Press Information Bureau, [India’s Makhana Sector](https://www.pib.gov.in/PressNoteDetails.aspx?ModuleId=3&NoteId=159603&id=159603&lang=1&reg=3) | Identifies makhana as *Euryale ferox* and its seed as the edible portion. Government source; supports the species boundary, not the seller page’s exact ingredient statement. |
| S09 | Kew, [Plants of the World Online: Euryale ferox](https://powo.science.kew.org/taxon/605350-1) | Accepted *E. ferox* in Nymphaeaceae, separate from *N. nucifera*. |
| S10 | Weee!, [Lotus Seed Flour search page](https://www.sayweee.com/en/grocery-near-me/lang-en/explore/lotus-seed-flour) | Current US-facing page lists a related West Lake lotus-root-flour product, not verified *Nelumbo* seed flour; not Canadian availability evidence. |
| S11 | OQLF, [racine de lotus (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434863/racine-de-lotus) | Québec French/English pairing for the lotus-root vegetable. Does not name seed flour or extracted starch. |
| S12 | [WP02 lotus-starch Québec wording review](wp02-b2-b3-lotus-starch-quebec-wording-review-20261010.md) and [WP03 lotus seed boundary review](wp03-lotus-seed-fox-nut-boundary-review-20261010.md) | Local archive sources confirm the accepted root/starch/seed distinctions and the earlier seed review’s explicit reservation of flour-specific review. |

## Static review and integration record

- Confirmed the requested proposal path was absent before this write and the R72 source-ID prefix had no collision.
- Parsed active references, forms, legacy candidates, and research ledger; checked exact phrase ownership, IDs, aliases, relevant records, and existing root/seed/starch state.
- Compared the plan, baking-flour batch, R70/R71 proposals, and prior lotus seed/root-starch proposals and batch archive.
- Scanned all 114 manifest-listed recipe files and all ingredient rows; found no matching recipe text or line.
- Modeled picker results using current `IngredientSearch.kt` phrase and substring behavior, including the English singular-query effect, companion-alias safeguard, root/starch distinctions, and the parent-reference projection for a form.
- Checked source pages and links online on 2026-10-13. No app tests or emulator checks were run because this is proposal-only work.
- The ownership counts and absence statements above describe the pre-integration review snapshot. Proposal research did not modify shared files; root integration and the database-only verification record are documented in the linked batch README.

