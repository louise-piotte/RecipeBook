# WP03 Section G — Bread Rolls, Sandwich Bread, and Sourdough Boundary Review

**Reviewed:** 2026-10-11  
**Status:** Proposal only; no catalog, ledger, plan, roadmap, code, or test files were changed.  
**Scope:** Generic bread rolls, sliced sandwich bread, sourdough bread, generic flatbread-family overlap, and regional prepared breads as possible recipe ingredients.

## Recommendation

| Class | Disposition | Proposed identity and aliases | Boundary |
| --- | --- | --- | --- |
| Generic bread roll | **Integrate**, identity-only | Proposed ID `ingredient-ref-bread-roll`; EN `bread roll`, alias `bread rolls`; fr-CA `petit pain`, alias `petits pains`. | This is the unqualified individual bread product. Do not add bare `roll`, `bun`, or `buns`; those terms also describe named and filled products. Do not transfer TERMIUM's source-specific French size description into a default portion weight. |
| Hamburger buns, dinner rolls, hot-dog buns | **Hold** as separate identities until a recipe ingredient line names a type | Do not assign `hamburger bun` / `pain à hamburger`, `dinner roll` / `petit pain mollet`, or `hot dog bun` / `pain à hot-dog` as aliases of the generic roll identity. | These are named types. Recipe 072 makes hamburger buns, but its ingredient list contains flour, yeast, milk, and other inputs rather than purchased buns. Recipe 005 makes steamed bao buns; that is also recipe output, not ingredient demand. |
| Sliced sandwich bread | **Integrate**, identity-only | Proposed ID `ingredient-ref-sandwich-bread`; EN `sandwich bread`, alias `sandwich loaf`; fr-CA `pain de mie`, alias `pain à sandwich`. | Treat this as the molded sandwich-loaf product. Do not alias generic `sliced bread` or `pain en tranches`: those name presentation and can describe other breads. OQLF discourages `pain tranché`. |
| Sourdough bread | **Integrate**, identity-only | Proposed ID `ingredient-ref-sourdough-bread`; EN `sourdough bread`; fr-CA `pain au levain`; no additional aliases. | Keep the finished bread separate from active `ingredient-ref-sourdough-starter` (`sourdough starter / levain naturel`, alias `levain chef`). Do not store a universal no-added-yeast composition rule: the OQLF definition is narrower than at least one current Québec product label. |
| Generic flatbread / pain plat | **Hold** as an ingredient identity; keep it as a family term | No generic reference or aliases proposed. | OQLF's family definition includes tortillas and chapati and also some pitas and focaccia. Do not alias the family to an individual member or merge the current named breads into it. If a recipe later asks for unqualified flatbread, add a separate generic identity then. |
| Named regional prepared breads | **Retain as separate integrated identities** | See the live-identity table below. | No cross-aliases among naan, roti, paratha, chapati, injera, pita, lavash, or the corn/flour tortilla products. These classes have no matching ingredient rows in the current recipe snapshot. |

The three proposed additions are identity-only, use the existing `BAKING_MIXIN_AND_PANTRY` category for prepared breads, and have no exact normalized-key collision in the live reference file. These recommendations do not create recipe links or define a dough formula.

The Section G checklist still has the combined open entry for naan, roti, paratha, injera, generic flatbread, bread rolls, sandwich bread, sourdough bread, and regional breads used as ingredients ([active plan](../../../docs/RecipeBook-global-ingredient-catalog-plan.txt)). This review advises its bread-product boundaries only; it leaves checklist state unchanged. In the research ledger, the existing brioche reference is `unreviewed`, the sourdough-starter reference is `verified`, and the named regional prepared-bread references shown below are `verified`. Bread flour remains `FLOUR_AND_STARCH` and is not part of the proposed bread-product category.

## Recipe audit

I scanned all 114 manifest-listed recipe JSON files, including their ingredient rows and text fields for names, descriptions, instructions, and serving labels. The corpus contains 1,123 ingredient rows. No row names a bread roll, sandwich bread, sourdough bread, generic flatbread, or one of the regional prepared breads in this review.

| Recipe evidence | Classification |
| --- | --- |
| [005 — Steamed Bao Buns](../../../app/src/main/assets/seed/bundled-library/recipes/005-bao-buns-vapeur-steamed-bao-buns-559fff48-4d46-4922-b1b8-66808cb0715c.v1.json) mentions bao buns in its title and instructions and yields buns. | Prepared recipe output, not a bun ingredient line. Keep bao outside the generic bread-roll alias set. |
| [072 — Hamburger Buns](../../../app/src/main/assets/seed/bundled-library/recipes/072-pains-a-hamburger-hamburger-buns-cfa64319-d4b9-4425-b087-3e30be3cc4a0.v1.json) makes 12 buns. Ingredient row `072#7` is `420 g bread flour` → `ingredient-ref-bread-flour`. | Flour is not a prepared roll. The recipe title/output does not create a bread-roll ingredient link. |
| [075 — French Toast](../../../app/src/main/assets/seed/bundled-library/recipes/075-pain-dore-french-toast-b3aacc80-d2f6-471d-bf42-85ba5fb8843a.v1.json), row `075#4`, says `5 to 8 slices brioche bread` → `ingredient-ref-brioche-bread`. | This is the only current prepared-bread ingredient row adjacent to the reviewed classes. Keep brioche distinct from sandwich bread, sourdough bread, and generic bread rolls. |

The scan also encountered bread-derived crumb products, bread flour, and `bread and butter pickle`; these are their own products or a condiment and were not counted as prepared-bread demand. Recipe 076's bread-flour wording is a recipe-local flour alternative, not a prepared bread line. The recipe corpus is unchanged by this review.

## Current identities and aliases

### Relevant existing bread identities

| Active ID | Current EN name / aliases | Current fr-CA name / aliases | Recommendation |
| --- | --- | --- | --- |
| `ingredient-ref-brioche-bread` | `brioche bread`; none | `pain brioche`; none | Retain; recipe 075 uses it directly. Do not alias it to sandwich bread or generic rolls. |
| `ingredient-ref-sourdough-starter` | `sourdough starter`; none | `levain naturel`; `levain chef` | Retain as the starter ingredient. Its one dehydrated, reactivatable starter form does not apply to finished bread. |
| `ingredient-ref-bread-flour` | `bread flour`; none | `farine à pain`; `farine pour pain` | Retain in `FLOUR_AND_STARCH`; it is not a bread product. |

### Regional flatbread-family members already integrated

| Active ID | Current EN name / aliases | Current fr-CA name / aliases | Recommendation |
| --- | --- | --- | --- |
| `ingredient-ref-naan-bread` | `naan bread`; `nan` | `pain naan`; `nan` | Retain. Keep named fillings and garlic/cheese varieties out of aliases. |
| `ingredient-ref-roti` | `roti`; none | `roti`; none | Retain separately from chapati and paratha. |
| `ingredient-ref-paratha` | `paratha`; none | `paratha`; none | Retain separately from roti and chapati. |
| `ingredient-ref-chapati-bread` | `chapati`; `chapatti`, `chappati`, `chapathi` | `chapati`; `chapatis` | Retain. Keep atta / chapati flour terms on the flour identity. |
| `ingredient-ref-injera` | `injera`; `injera bread` | `injera`; none | Retain. Keep `pain plat éthiopien` explanatory rather than an alias. |
| `ingredient-ref-pita-bread` | `pita bread`; none | `pain pita`; none | Retain as the bread product; keep pita sandwiches and pita chips distinct. |
| `ingredient-ref-lavash-bread` | `lavash bread`; none | `pain lavash`; none | Retain as the bread product; keep lavash crackers distinct. |
| `ingredient-ref-corn-tortillas` | `corn tortillas`; `corn tortilla` | `tortillas de maïs`; `tortilla de maïs`, `tortillas au maïs`, `tortilla au maïs` | Retain separately from flour tortillas. |
| `ingredient-ref-flour-tortillas` | `flour tortillas`; `flour tortilla` | `tortillas de farine`; `tortilla de farine`, `tortillas de farine de blé`, `tortilla de farine de blé` | Retain separately from corn tortillas. |

No active exact key exists for the proposed `bread roll`, `petit pain`, `sandwich bread`, `pain de mie`, `sourdough bread`, or `pain au levain` names. The current `levain naturel` starter wording remains a different exact phrase from `pain au levain`; do not add bare `levain` to either identity. Broad `bread`, `roll`, `bun`, and `flatbread` aliases would blur current crumb, flour, pickle, bao, and regional-product boundaries.

## Identity versus forms, measures, and substitutions

The recommendations above decide only which prepared products have distinct identities and which names identify them. Do not infer a density, slice mass, loaf mass, package yield, count-to-mass conversion, or unit mapping from recipe quantities or retail package sizes. “Sliced” is presentation wording, not a proposed `pain de mie` form.

The live forms file has 63 forms and only one form attached to the sourdough starter: `dehydrated_reactivatable` (`dehydrated sourdough starter` / `levain naturel déshydraté`). It is qualified as reactivatable and has no generic match terms. Keep that form on the starter. The active global and contextual substitution-rule files each contain zero rules. No bread-to-bread substitution or starter-to-bread conversion is proposed.

## Evidence and source limits

Sources support the names and product boundaries stated in this packet. They do not establish RecipeBook recipe demand, universal composition, measurement, or substitutability. Access dates below are 2026-10-11; a source's example formula, product contents, or amount remains source-specific.

| ID | Source and claim used | Limit |
| --- | --- | --- |
| S01 | Translation Bureau, [TERMIUM Plus — bread roll](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=10&i=&index=enb&lang=fra&sg_kp_wet=2033164&srchtxt=BAKING). Its 2023 breadmaking record pairs `bread roll` with `petit pain` and describes an individual portion, usually round or elongated, shaped before baking. | The French record describes a small, elongated loaf and gives an approximate weight. Neither the shape nor the weight is stored in the proposed identity. Direct page opening returned a cache error; the indexed TERMIUM record was accessible. |
| S02 | OQLF, [pain à hamburger](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506591/pain-a-hamburger), [pain à hot-dog](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410282/pain-a-hot-dog), and [petit pain mollet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18495418/petit-pain-mollet). These entries define named roll types; the hot-dog entry distinguishes grilled and steamed products. | They support separate terminology for these types, not catalog demand or aliases to generic `bread roll`. The entries date from 1983–2022. |
| S03 | OQLF, [pain à sandwich](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17491481/pain-a-sandwich), [pain de mie](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497992/pain-de-mie), and [pain en tranches](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298433/pain-en-tranches). The sandwich-bread entry gives `sandwich bread` / `sandwich loaf` and notes that Québec's usual sandwich bread is pain de mie; the sliced-bread entry translates `pain en tranches` as `sliced bread` and discourages `pain tranché`. | These records support the naming distinction, not a universal composition or slicing form. The terminology entries date from 1983–1984. |
| S04 | Current Québec product wording: [Aliments du Québec — Le Pain de Mie](https://alimentsduquebec.com/aliments-dici/boulangerie-patisserie-et-desserts/le-pain-de-mie) and [Pascal Le Boulanger — Pain de Mie](https://pascalleboulanger.com/products/pain-mie). Both use `pain de mie`; Pascal's current product page offers slicing. | These are specific Québec bakery listings and do not establish a single recipe, nutrition profile, or universal loaf format. No product amount is used. |
| S05 | OQLF, [pain au levain](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410395/pain-au-levain), gives `sourdough bread` as the English term and defines the bread narrowly as made from levain only, without added yeast. | The GDT record dates from 1988. Its composition definition is not imposed as a catalog validation rule because current product usage differs. |
| S06 | Current Québec naming is visible in [Aliments du Québec — Pain au Levain](https://alimentsduquebec.com/aliments-dici/boulangerie-patisserie-et-desserts/pain-au-levain). [Le Duo Choc — Pain au Levain](https://leduochoc.com/produit/pain-au-levain/) lists flour, water, levain, salt, and yeast for one product using that name. | These pages show local product wording and one SKU's ingredients; they neither revise the OQLF definition nor establish a universal sourdough formula. |
| S07 | OQLF, [pain plat](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488041/pain-plat), updated in 2026, defines `flatbread` / `pain plat` and gives tortillas, chapatis, focaccia, and some pitas as examples spanning unleavened and leavened breads. | This is a family definition, not a claim that its examples are aliases, identical products, or substitutes. OQLF's `galette` note is contextual and does not make `galette` a universal bread alias. |
| S08 | OQLF, [nan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26530011/nan), [chapati](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25399182/chapati), and [pita](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8367691/pita), supports the Québec terms for these named products. The pita entry is about a prepared sandwich, so current [Aliments du Québec — Pain pita blanc](https://alimentsduquebec.com/aliments-dici/boulangerie-patisserie-et-desserts/pain-pita-blanc) supplies the bread-product wording. | OQLF's pita entry does not define a generic flatbread class; the local product page supports its product name only. |
| S09 | Cuisinart Canada, [French-language recipe booklet](https://www.cuisinart.ca/on/demandware.static/-/Sites-ca-cuisinart-Library/fr_CA/dw8c97eb00/Instruction%20Booklet/CPP-200C_fr.pdf), describes injera as a traditional Ethiopian flatbread. | It is one Québec French-language manufacturer recipe source; its recipe does not establish a required grain blend, yield, or conversion. |
| S10 | The current Montréal [Khao Peeyo menu](https://khao-peeyo.com/fr/location/st_catherine/menu/) lists pain naan, lacha paratha, tandoori roti, and roti à trois couches as separate menu items. | A local menu supports distinct local names, not a terminology ruling or a general recipe/ingredient specification. Existing accepted reference evidence is also recorded in the [naan, roti, and paratha review](wp03-section-g-naan-roti-paratha-quebec-identity-review-20261011.md). |
| S11 | The accepted [pita and lavash review](wp02-section-g-pita-lavash-boundary-review-20261010.md) and [chapati review](wp03-section-g-chapati-bread-identity-review-20261011.md) record the current product and Québec-terminology evidence for those live identities. | Those sources support keeping each accepted product separate; they do not create recipe links, forms, or conversions. |

## Live snapshot and review checks

Snapshot taken from the live package on 2026-10-11. File SHA-256 values below use raw file bytes. The recipe corpus digest is SHA-256 over each manifest-listed relative recipe path, a NUL byte, and the raw file bytes in manifest order.

| Artifact | Live count | SHA-256 |
| --- | ---: | --- |
| Seed manifest | 114 recipes; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 1,123 ingredient rows; 752,117 bytes | `eaf41114fdeee1bb570e4d87f66271391437381343f1e728347e35936bb27ee8` |
| Ingredient references | 981; 310,891 bytes | `6ba2b4486985ec96cd0a39327314f1e8a1a648f18396b6655a8de5e8f9da4cdd` |
| Ingredient forms | 63; 45,436 bytes | `9eb6df4d64f73297a77fbf494fd77f037f05e3ff4169f103d57157e0b6c24147` |
| Research ledger | 1,259 records; 4,001 record source entries; 3,999,119 bytes | `cc27c9c285be16908039f8b6f69d1765b5557985143ba381c6ea88fa9d477467` |
| Legacy import identity candidates | 75; 17,900 bytes | `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |

Checks performed for this proposal:

- Audited all 114 manifest recipe files and their 1,123 ingredient rows; none contains an ingredient match for the proposed roll, sandwich-bread, sourdough-bread, generic-flatbread, or regional prepared-bread identities.
- Checked the active reference names and aliases listed above. An exact normalized-key comparison (Unicode decomposition, case folding, accent removal, punctuation/space collapse) found no collision for the proposed EN/FR names or listed aliases.
- Confirmed the live forms file has one sourdough-starter form, and both active substitution-rule files are empty.
- Verified this proposal file is UTF-8 without BOM, has a final newline, and contains no mojibake markers.
- No tests were run; this file is a proposal-only review and changes no database JSON.
