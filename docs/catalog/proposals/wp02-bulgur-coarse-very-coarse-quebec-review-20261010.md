# WP02 proposal review: coarse and very-coarse bulgur terminology

**Review date:** 2026-10-10
**Scope:** Research-only review of the open coarse / very-coarse bulgur naming question.
**Requested boundary:** Do not change the shared catalog, research ledger, recipes, plan, roadmap, code, tests, or integration docs.

## Coordinator recommendation

Add two dry grind forms under the existing `ingredient-ref-bulgur` identity:

| Proposed form key | English display | Québec French display | Scope |
| --- | --- | --- | --- |
| `ingredient-form-bulgur-coarse-grind` | `coarse bulgur` | `boulgour gros` | Federal procurement class No. 3; do not expose `#3` as a global alias. |
| `ingredient-form-bulgur-extra-coarse-grind` | `extra coarse bulgur` | `boulgour extra gros` | Federal procurement class No. 4; do not map generic `very coarse bulgur` to it. |

The official Canadian federal food-purchase specification supplies these exact English/French class pairs. A Québec packer’s current product page independently lists a one-kilogram coarse product, although its heading has the typo `Boulgur Gros`; do not store that misspelling as a display or alias. A Canadian grocery listing and the manufacturer’s own product page corroborate that “extra coarse bulgur” is a marketed product name [S01–S02, S04, S06–S07, S10].

Do **not** add `very coarse bulgur` / `boulgour très grossier` as a global form or alias yet. Sources use incompatible size vocabularies: Bob’s Red Mill calls the largest of its four types “very coarse”; the federal specification names No. 4 “extra coarse / extra gros” and then separately lists No. 5 “Half Cuts / extra large grind / mouture très grossière”; Duru has its own “extra coarse” and “extra extra coarse” categories, and describes the latter as a Duru-specific type [S01–S02, S06–S09, S11]. None establishes a crosswalk between those taxonomies. Retain the federal No. 5 half-cuts / extra-large-grind class as a documented unresolved candidate; do not collapse it into No. 4 or Bob’s “very coarse.”

Keep the proposed forms’ aliases and match-term arrays empty, with `prepState: dry`, `densityGPerMl: null`, and no unit mappings, cooking-yield conversion, or substitution rule. Add no density or conversion values from the cooking instructions below. The existing base identity and fine/medium forms remain unchanged in this proposal.

## Findings

### Identity and grade boundaries

OQLF defines the food identity `boulgour` as germinated wheat that has been precooked, dried, and cracked. The federal specification describes bulgur as wheat kernels boiled, dried, cracked, and sorted by particle size. This is a processing identity with grind-size forms, not a new ingredient identity for each grade [S01, S03].

The federal bilingual specification makes the following distinctions in its “Bulgur” section:

| Federal class | English wording | French wording | Review treatment |
| --- | --- | --- | --- |
| No. 3 | Coarse | gros | Supported coarse form. |
| No. 4 | Extra coarse | extra gros | Supported extra-coarse form; keep distinct from coarse. |
| No. 5 | Half Cuts; extra large grind | mouture très grossière | Distinct federal candidate, but not a verified synonym for “very coarse” or No. 4. Keep unresolved. |

There is an internal scope wrinkle in the federal document: it first says North American bulgur is produced in four sizes, No. 1 through No. 4, then adds a No. 5 “Half Cuts” entry. Preserve both statements as source evidence rather than inferring that No. 5 is a standard fifth retail grade in every market [S01–S02].

The manufacturer Duru labels separate products “Coarse Bulgur,” “Extra Coarse Bulgur,” and “Extra Extra Coarse Bulgur.” Its coarse product page calls its own coarse size 3#, while another Duru page calls “Medium Coarse” 4#; this numbering differs from the federal No. 4 “Extra Coarse” terminology. Duru explicitly describes extra-extra-coarse as a special type for its brand. These are product-specific classes, not global numeric aliases or a dependable cross-brand grade system [S06–S09].

The active catalog already separates processed bulgur from raw cracked wheat and whole wheat berries. Keep `ingredient-ref-bulgur` (`bulgur / boulgour`), `ingredient-ref-cracked-wheat` (`cracked wheat / blé concassé`), and `ingredient-ref-wheat-berries` (`wheat berries / grains de blé entiers`) distinct. In particular, do not import `blé concassé` from RICARDO’s parenthetical ingredient text as a bulgur alias: the package already has that exact bilingual display for cracked wheat, and the processing descriptions distinguish raw cracked wheat from precooked bulgur [S01, S03, S11–S12].

### Québec and Canadian names; alias disposition

- **`boulgour gros`** is the strongest Québec French display for the No. 3 coarse candidate: it is the direct French wording in the federal specification, and a Québec food brand lists a packaged product under the misspelled heading `Boulgur Gros`. The brand says its products are bagged at its Québec facility. The product page’s ingredient and cooking text identify bulgur, but its typo and lack of a stated federal grade mean it corroborates a local coarse product rather than a formal #3 crosswalk [S01, S04–S05].
- **`boulgour extra gros`** is the direct Canadian federal French label for No. 4. A Canadian grocery chain lists Duru “Extra Coarse Bulgur” as a 1000 g product, and Duru’s manufacturer page describes a distinct product larger than its coarse bulgur. I found no strong Québec retail package page carrying the exact French label `boulgour extra gros`; the French display is therefore supported by the federal bilingual specification, not by a localized French package label [S01, S07, S10].
- **`boulgour très grossier`** is not established as the French display for Bob’s “Very Coarse Bulgur.” The federal phrase is `mouture très grossière` for the separate No. 5 “Half Cuts” class. Do not convert the modifier into a new label or alias without a source that makes that exact product pairing [S01–S02, S11].
- OQLF’s preferred base term is `boulgour`; it also records `boulghour`, `bulgur`, and `bulghur` in its term family. Those are identity-level variants, not coarse-grade labels. This review proposes no changes to the existing empty alias arrays [S03].
- Keep `#3`, `#4`, `#5`, `half cuts`, `extra extra coarse`, red/brown color labels, and `blé concassé` out of global aliases and match terms. Numeric grades vary across manufacturer and federal schemes; color is not grind size; `blé concassé` is already a separate active identity [S01–S04, S06–S09].

### Active catalog collisions and exact bundled demand

The current seed catalog contains the base `ingredient-ref-bulgur` and only two bulgur forms: `ingredient-form-bulgur-fine-grind` (`fine bulgur / boulgour fin`) and `ingredient-form-bulgur-medium-grind` (`medium bulgur / boulgour moyen`). The base has empty EN/FR aliases and null density / empty unit mappings; both forms have empty match-term arrays and null density. No active coarse, extra-coarse, very-coarse, half-cuts, or numeric-grade key/alias was found. The separate cracked-wheat reference owns `cracked wheat / blé concassé` [S03–S04, S11–S12; current package inspected 2026-10-10].

I searched all **114** bundled recipe JSON files for bulgur/boulgour spellings, cracked-wheat wording, the active bulgur reference ID, and half-cuts wording. **No bundled recipe requests bulgur or any grind form.** Existing Québec reference recipes do show fine and medium bulgur: RICARDO uses `boulgour fin` and lists 180 g per cup; Metro names `boulgour brun moyen` and gives a volume-only amount. They are context for the already-integrated fine/medium forms, not exact demand for coarse grades [S11–S12].

### Measurement, cooking density, and substitutions

No source reviewed here supplies a defensible dry mass per volume for coarse or extra-coarse bulgur. Do not set density or unit mappings.

- The Québec packer’s coarse-product directions use 1 cup bulgur with 2¼ cups water, simmer for 10 minutes, and report an approximate cooked yield of 3 cups. The page gives no dry mass for the cup and does not state a standardized cup or packing method; this remains a product-specific preparation/yield observation, not a catalog density, universal conversion, or generic time rule [S04].
- Duru’s manufacturer pages give 60 g as a dry serving and recommend 2 cups hot water per cup of bulgur for its coarse and extra-coarse products. That serving amount has no volume counterpart, and the water ratio is manufacturer-specific; it does not supply g/ml or establish an interchangeable cooking rule across grades [S06–S07].
- The federal document gives culinary uses, but no mass/volume measures or cooking ratios for No. 3 or No. 4. Its rice-substitution statements apply to No. 1 and No. 2, not to coarse or extra-coarse bulgur [S01–S02].
- Bob’s general statement that bulgur can substitute for other grains does not state a target dish role, method, ratio, or coarse-grade mapping. Duru says its own extra-coarse product may substitute for rice but supplies no application-specific ratio or method. Neither supports an active directional substitution rule [S06–S07, S11].
- RICARDO’s 180 g / 1 cup observation is for fine bulgur only, while Metro’s medium-bulgur amount is volume-only. Do not transfer either measurement to new forms [S11–S12].

### Package implications if approved

1. Add only the two recommended dry forms to the existing bulgur identity, using `coarse_grind` and `extra_coarse_grind` form codes consistent with the active `fine_grind` and `medium_grind` forms.
2. Use `coarse bulgur / boulgour gros` and `extra coarse bulgur / boulgour extra gros` as exact display pairs. Keep aliases/match terms empty and all density/conversion/substitution fields null or empty.
3. Do not create `very_coarse_grind`, `half_cuts`, or `extra_extra_coarse` as active forms in this batch. Keep No. 5 as an unresolved candidate because the federal term is explicit but the federal count is internally inconsistent, Québec retail usage is not established, and there is no bundled recipe demand. If the coordinator later chooses to model it, review a distinct candidate named from the source as `extra-large-grind bulgur / boulgour à mouture très grossière`; do not alias it to No. 4 or to “very coarse.”
4. Do not change the active `bulgur / boulgour` base name, its aliases, cracked wheat, the previously integrated fine/medium forms, or any recipe references.

## Sources

All web sources were accessed on **2026-10-10**. Where a page did not expose a publication/update date, that is stated below. Source IDs use the new `WP02-BULGUR-COARSE-QUEBEC-20261010` prefix; this prefix was collision-checked in `docs/` and the bundled seed package before writing this proposal.

| Source ID | Source/date | Supports / limits |
| --- | --- | --- |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S01 | [Department of National Defence, Food Quality Specifications: Cereal Grain, French, SQA-24-03 Bulgur](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf), dated 2018-04-01, §§19–27 | Authoritative Canadian bilingual processing description, grade names, use examples, and #5 half-cuts entry. Procurement specification, not a retail standard; its “four sizes” statement followed by a fifth entry is retained as an unresolved inconsistency. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S02 | [Department of National Defence, Food Quality Specifications: Cereal Grain, English, FQS-24-03 Bulgur](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf), dated 2018-04-01, §§19–27 | Confirms English labels “Coarse,” “Extra Coarse,” and “Half Cuts: Extra large grind,” and assigns rice substitution only to fine and medium classes. Same procurement-scope limitation as S01. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S03 | [OQLF, `boulgour`, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502438/boulgour), last updated 2016 | Preferred Québec French base term, recorded variants, and definition of the processed wheat identity; it does not classify grind sizes. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S04 | [Artisan Tradition, Grains / Céréales](https://www.artisan-tradition.ca/grains-cereals), no page date shown | Québec brand page with a 1 kg coarse bulgur item and its product-specific water, time, and approximate yield instructions. Heading spells the product `Boulgur Gros`; do not adopt that typo. No formal grind grade, dry mass per cup, or standardized cooking measure is given. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S05 | [Artisan Tradition, À propos](https://www.artisan-tradition.ca/%C3%A0-propos-about), no page date shown | States that the company bags its products at its Québec facility. Supports local source context, not the product’s precise grind standard. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S06 | [Duru Bulgur, Coarse Bulgur](https://durubulgur.com/en/brand/coarse-bulgur), no page date shown | Manufacturer-specific coarse label, own 2.0–2.8 mm / 3# class, 60 g dry serving, and 2:1 hot-water ratio. Numeric size and grade are not generalized. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S07 | [Duru Bulgur, Extra Coarse Bulgur](https://durubulgur.com/en/brand/extra-coarse-bulgur), no page date shown | Manufacturer’s distinct extra-coarse product, preparation guidance, 60 g dry serving, and rice-substitute wording; gives no recipe-specific substitution ratio. No direct Duru-to-federal-grade crosswalk. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S08 | [Duru Bulgur, Extra Extra Coarse Bulgur](https://durubulgur.com/en/brand/extra-extra-coarse-bulgur), no page date shown | Identifies extra-extra-coarse as a special type for Duru; evidence for withholding the manufacturer-specific class from global names. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S09 | [Food Basics, Duru Extra Coarse Bulgur 1000 g](https://www.foodbasics.ca/aisles/pantry/pasta-rice-beans/dried-beans/extra-coarse-bulgur/p/8691440401001), no publication date shown | Canadian retail listing corroborates the English product name and size. Listing included a promotional end date of 2026-09-23, before this review date; price and availability are not relied on. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S10 | [Bob’s Red Mill, What Is the Best Way to Cook Bulgur?](https://www.bobsredmill.com/articles/what-is-the-best-way-to-cook-bulgur), no publication date shown | Manufacturer article defines its own four types, including “very coarse,” and offers broad substitute suggestions without a role, method, or ratio. It does not map its term to federal No. 4 or No. 5. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S11 | [RICARDO, Taboulé (salade de persil)](https://www.ricardocuisine.com/recettes/2011-taboule-salade-de-persil), recipe page date not shown | Québec fine-bulgur wording, the recipe’s 180 g / 1 cup portion, and soaking method. The cup/packing convention is unstated; not a coarse measurement. Its parenthetical `blé concassé` is not accepted as a bulgur alias. |
| WP02-BULGUR-COARSE-QUEBEC-20261010-S12 | [Metro, Taboulé de boulgour libanais](https://www.metro.ca/recettes-et-occasions/recettes/taboule-de-boulgour-libanais), dated 2014-06-09 | Québec recipe uses `boulgour brun moyen` with a volume-only quantity. This is medium-grind context only; no dry mass or coarse-form mapping. |
