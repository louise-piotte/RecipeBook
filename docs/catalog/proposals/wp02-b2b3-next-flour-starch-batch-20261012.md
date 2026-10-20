# WP02 B2/B3 next flour and starch batch — acorn-derived products

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No catalog JSON, research ledger, recipe, plan, roadmap, or generated file was changed.
- **Scope:** Review the unresolved boundary among whole-matrix acorn flour/meal and extracted acorn starch, with particular attention to Korean acorn starch used for *dotori-muk*. This is one B2/B3 seed-derived flour/starch subfamily; it does not reopen acorn squash, corn starch, or other regional starch identities.
- **Proposal-local source IDs:** `WP02-B2B3-ACORN-STARCH-20261012-S01` through `S11`. The prefix was checked against the current research ledger, proposal archive, and batch archive; no collision was found. These are not ledger records.

## Recommendation

**Keep acorn starch as a source-backed, separate identity candidate, but hold catalog integration until a human-food Québec French display is supported.** A manufacturer calls its product `Acorn Starch` and pairs it with the Korean label `도토리묵가루`; a primary food-processing study isolates purified acorn starch from acorn flour. Those sources establish a real ingredient class and a material boundary from whole acorn flour. They do not establish a Québec French name for the standalone food product. [S04–S06]

The possible future reference key is `ingredient-ref-acorn-starch`; the possible unresolved ledger candidate key is `candidate-acorn-starch`. Neither exists in the current catalog or ledger. Do not create an active row or ledger candidate in this proposal-only batch. Do not place `amidon de gland(s)` or `fécule de gland(s)` in a French display or alias without product-specific Québec terminology evidence. OQLF prefers general `amidon` and describes `fécule` for starch in underground plant parts; acorns are oak fruit, but that general rule does not itself establish the compound name. [S08–S09]

Keep a future whole-acorn-flour candidate separate as well. USDA records `acorn flour, full fat`, and food-science research describes flour made from acorns of named *Quercus* taxa using different drying or roasting methods. This supports the reality of a flour product class, not synonymy with refined extracted starch or a stable Québec retail scope. The exact future key, if reviewed separately, would be `ingredient-ref-acorn-flour`; it is not proposed for activation here. [S01–S02]

## Identity decisions

| Candidate or boundary | Decision | Evidence and scope |
|---|---|---|
| Acorn starch | **Hold as a distinct candidate** pending a supported Québec French display and a standalone Canadian human-food package/label. | Jayone’s product page labels a 1 lb item `Acorn Starch` and shows `도토리묵가루`; Haisue Canada lists `Acorn Starch` as an ingredient in a Korean-style noodle product. The primary study extracts acorn starch from dried acorn flour and reports purified starch as a separate product. None of these establishes a Québec French name for the standalone powder. [S04–S06] |
| Acorn flour | Keep separate from starch; do not create a row in this batch. | USDA SR27 uses the exact food name `Nuts, acorn flour, full fat`; a 2016 food study calls products from *Quercus ilex* and *Q. rotundifolia* acorn flours and compares drying and roasting. That evidence shows a whole-matrix flour class, but the inspected Canadian French `farine de glands de chêne` listing is for deer feed. No current human-food Québec package resolves a French display. [S01–S03, S11] |
| Acorn meal | Keep unassigned as an alias. | The USDA Forest Service food chapter uses `acorn meal` for the ground, leached material in its preparation and recipe examples. It does not establish a standardized equivalence between meal, flour, and refined starch. [S03] |
| Acorn starch vs acorn flour | Keep as different identities, not aliases or forms of each other. | The extraction study starts from acorn flour and separates a high-purity starch fraction through alkaline or enzymatic processing. Extraction is a product boundary, not a recipe form conversion. [S04] |
| Korean `도토리묵가루` | Record as source wording only; do not put it in either English or French aliases. | Jayone prints the Korean wording beside its English `Acorn Starch` product. The current reference schema offers only English and French alias arrays; there is no Korean locale field or documented policy for storing Hangul in either array. [S05] |
| Acorn jelly powder / acorn powder | Leave unassigned. | No reviewed manufacturer, OQLF, TERMIUM, Canadian French package, or primary study establishes these as safe English aliases for the standalone acorn-starch product. The word `powder` alone does not establish composition. |
| `corn starch` | Do not assign as an alias. | Instacart Canada lists Jayone `Acorn Starch` within a broad Corn Starch category. That retailer taxonomy is not a botanical or ingredient statement; the manufacturer calls the product acorn starch. Keep it separate from `ingredient-ref-cornstarch`. [S05, S07] |

## Québec French wording and exact-key ownership

OQLF’s `gland` entry supports the Québec French noun for oak fruit and the English translation `acorn`; it does not list an acorn-flour or acorn-starch product term. OQLF’s 2026 `amidon` entry provides a general French term for starch and explains when `fécule` is used, but it does not provide an acorn-starch compound. The French Ministry of Culture archaeology page uses `farine de glands` for historical food preparation; that is French-language historical evidence, not a present-day Québec product name. [S08–S10]

The exact French phrase `farine de glands de chêne` is used by a Québec seller for a ground red-and-white oak-acorn deer-feed product. That source is explicitly animal feed, not human food. Do not reuse its label as evidence for a Québec culinary flour name or attach it to an active human-food reference. [S11]

Read-only exact-key audit at review time: the live package has **1,300 references** and **98 forms**; the ledger has **1,608 records** and **5,823 source entries**; the legacy candidate file has **64 candidates**. The only active acorn-named reference is `ingredient-ref-acorn-squash` — `acorn squash / courge poivrée`, EN alias `pepper squash`, FR alias `courgeron`. Its ledger record is verified. There is no acorn-flour, acorn-starch, acorn-meal, or `dotori-muk` record.

The current normalized exact-key audit across reference names/aliases, form labels/match terms, and legacy names/aliases found no exact owner for the ASCII phrases `acorn flour`, `acorn starch`, `acorn meal`, `acorn jelly powder`, `acorn powder`, `farine de glands`, `farine de gland`, `farine de glands de chêne`, `amidon de gland(s)`, or `fécule de gland(s)`. A direct UTF-8 text search of the live package, research ledger, and legacy candidate file also found no `도토리묵가루` occurrence. The existing broad picker query `acorn` returns `ingredient-ref-acorn-squash`. If a future row is added with English display `acorn starch`, the query `acorn` will return both acorn squash and acorn starch under current complete-word-phrase matching; exact query `acorn starch` would resolve to the new row. This is a search behavior implication, not a collision on the full phrase.

No aliases are recommended now. In particular, do not transfer `acorn flour`, `acorn meal`, or the Korean `도토리묵가루` into the future acorn-starch alias set, and do not assign the French feed listing to an acorn-flour row. A separate whole-acorn-flour review would need to identify which product process it covers and obtain French Québec human-food label evidence.

## Measurement decisions

- The USDA SR27 record for full-fat acorn flour gives a **1 oz / 28.35 g mass measure**. It is not a cup, spoon, bulk-density observation, or acorn-starch measure. Retain it only as a source-qualified observation if a flour candidate is later recorded. [S01]
- Jayone’s 1 lb net weight is package size, not a household measure. Haisue’s 340 g acorn-starch noodles list both sweet-potato starch and acorn starch; that package weight cannot be allocated to the acorn-starch ingredient. [S05–S06]
- The primary starch-isolation studies report experimental process yields and purity, not kitchen portions or volume-to-mass conversions. Keep `defaultDensity: null` and `unitMappings: []` on any future row unless a source reports a directly usable measure for the exact product class. [S04]
- No general household portion, mass-per-cup value, bulk density, or app unit mapping was found for extracted acorn starch. No numeric data is proposed for either future candidate.

## Substitution decisions

- Jeanine A. Derby’s USDA Forest Service chapter reports personal experience replacing up to one-third of the flour in breads, crackers, and cookies with **acorn meal**, and replacing half the oats in an oatmeal cookie or muffin recipe with acorns. It is an author-reported, unspecific kitchen observation, not a controlled recipe trial and not evidence about refined acorn starch. Do not add a global or contextual substitution rule from it. [S03]
- The 2016 acorn-flour paper describes flour as a possible alternative to corn flour in breads and cakes but does not give a transferable replacement ratio. Do not create an acorn-flour-to-corn-flour substitution. [S02]
- The 2012 extraction study evaluates isolation method, yield, and starch purity; it does not test recipe replacement. Do not infer that acorn starch replaces corn, potato, tapioca, or other starches. [S04]
- No substitution rule or recipe-line link is proposed for this batch.

## Bundled recipe demand

The manifest-listed corpus contains **114 recipes and 1,123 ingredient rows**. Scanning each complete recipe JSON and each ingredient row found **zero** matches for `acorn flour`, `acorn starch`, `acorn meal`, `acorn jelly powder`, `acorn powder`, `dotori-muk` wording, or the reviewed French candidate phrases. There is no recipe line linked to `ingredient-ref-acorn-squash` that supplies demand for these products. The corpus provides no recipe association, measure, or substitution evidence.

## Acceptance checks for a later integration

1. Obtain a current standalone Canadian human-food package or manufacturer specification for acorn starch and a Québec French term or Québec-facing bilingual label for that same product.
2. Confirm the source product is extracted acorn starch rather than whole acorn flour, starch-containing noodle, acorn-flavoured product, or animal feed.
3. Add only source-attested names to a candidate `ingredient-ref-acorn-starch`; keep `ingredient-ref-acorn-flour` separate unless reviewed independently.
4. Verify the exact English/French search keys and confirm `acorn` produces the intended multiple-result set while `acorn starch` returns only the starch identity.
5. Leave forms, density, unit mappings, recipe links, conversions, yields, and substitutions empty unless new source-specific evidence directly supports them.

## Unresolved gaps

- No current Québec French human-food name for standalone acorn starch was found. `amidon de gland(s)` and `fécule de gland(s)` remain research phrases, not accepted aliases or displays.
- No Québec-facing human-food product label settled the French name or process scope for acorn flour. The phrase `farine de glands de chêne` in the reviewed Québec listing is explicitly animal feed.
- The manufacturer’s Korean `도토리묵가루` wording has no place in the existing bilingual alias schema; no English/French alias should be synthesized from it.
- The exact corpus has no demand; measurement and substitution evidence stays source-specific and inactive.

## Source register

All live pages and documents below were accessed on **2026-10-12**. Dates are the source publication or update dates when shown; `undated` means the live source did not show a publication date.

| ID | Source and date/access note | What it supports | Limits |
|---|---|---|---|
| **WP02-B2B3-ACORN-STARCH-20261012-S01** | USDA Agricultural Research Service, [National Nutrient Database for Standard Reference, Release 27, Food Group 12, NDB 12060](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR27/reports/sr27fg12.pdf), 2014; PDF pp. 1–3. | Exact database food name `Nuts, acorn flour, full fat`; one mass measure, 1 oz = 28.35 g. | US nutrient database record; not a Canadian product standard, cup measure, density, or extracted-starch observation. |
| **WP02-B2B3-ACORN-STARCH-20261012-S02** | Sara Silva et al., [“Nutritional characterization of acorn flour”](https://doi.org/10.1007/s11694-016-9340-1), *Journal of Food Measurement and Characterization* 10(3), 2016, pp. 584–588; University of Católica Portuguesa record accessed 2026-10-12. | Describes acorn flours from *Quercus ilex* and *Q. rotundifolia*, produced using traditional drying and roasting methods; discusses flour use in bread/cake and potential in place of corn flour. | Study-specific taxa and methods; no Québec French product name or transferable substitution ratio. Repository record is open; article access is restricted. |
| **WP02-B2B3-ACORN-STARCH-20261012-S03** | Jeanine A. Derby, [“Acorns—Food for Modern Man”](https://www.fs.usda.gov/psw/publications/documents/psw_gtr044/psw_gtr044_004.pdf), in USDA Forest Service General Technical Report PSW-044, 1980, pp. 360–361; presented at a 1979 symposium. | Describes human food preparation by grinding, leaching, and drying acorn meal; reports the author's own recipe experience with acorn meal. | Personal experience and named meal material, not a controlled baking trial, generic flour substitution rule, or acorn-starch use. |
| **WP02-B2B3-ACORN-STARCH-20261012-S04** | Correia et al., [“Starch isolation from chestnut and acorn flours through alkaline and enzymatic methods”](https://doi.org/10.1016/j.fbp.2011.06.005), *Food and Bioproducts Processing* 90(2), April 2012, pp. 309–316; ScienceDirect abstract accessed 2026-10-12. | Primary study of acorn starch isolated from dried *Quercus suber* fruit flour; compares alkaline/sieving and enzymatic methods and reports high-purity isolated starch. | Experimental process/yield evidence; not a retail specification, household measure, or recipe substitution study. |
| **WP02-B2B3-ACORN-STARCH-20261012-S05** | Jayone Foods, [Acorn Starch](https://www.jayonefoods.com/product/acorn-starch), live manufacturer product page; footer ©2025, accessed 2026-10-12. | Product title `Acorn Starch`; Hangul `도토리묵가루`; 1 lb net weight, SKU 11107CA, UPC 678108109255. | First-party product naming and package weight; does not provide a Québec French label, extraction spec, density, or recipe measure. |
| **WP02-B2B3-ACORN-STARCH-20261012-S06** | Haisue Canada, [Surasang Acorn Starch Noodle, 340 g](https://haisue.ca/products/surasang-acorn-starch-noodle-340g), live listing; accessed 2026-10-12. | Canadian retailer lists sweet potato starch and acorn starch as ingredients; seller identifies itself as a Canadian retailer/wholesaler and lists a Toronto address. | A mixed noodle product, not a standalone acorn-starch package or French ingredient label; page showed backordered/sold out at access. |
| **WP02-B2B3-ACORN-STARCH-20261012-S07** | Instacart Canada, [Corn Starch category listing](https://www.instacart.ca/categories/316-food/844-pantry/845-baking-and-cooking/884-baking-powders/889-corn-starch), live dynamic page; accessed 2026-10-12. | Lists `Jayone Foods, Inc. Acorn Starch` within its Canadian starch shopping taxonomy. | Retailer category placement is not ingredient identity evidence and does not make the acorn-derived product corn starch; availability depends on location. |
| **WP02-B2B3-ACORN-STARCH-20261012-S08** | Office québécois de la langue française, [*gland* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17030679/gland), 1990; accessed 2026-10-12. | Defines `gland` as the fruit of the oak and gives English `acorn`. | Does not define a flour or starch product name. |
| **WP02-B2B3-ACORN-STARCH-20261012-S09** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026; accessed 2026-10-12. | Prefers general `amidon` and explains `fécule` for starch in tubers or, more generally, underground plant organs. | Does not attest `amidon de gland(s)` as a Québec product term; no compound name is proposed from this general entry alone. |
| **WP02-B2B3-ACORN-STARCH-20261012-S10** | French Ministry of Culture, [*Les glands*](https://archeologie.culture.gouv.fr/palafittes/fr/les-glands), live archaeological education page, undated; accessed 2026-10-12. | Uses `farine de glands` in a historical human-food discussion and describes leaching and grinding. | Historical French wording outside Québec; not a current retail label or Québec terminology ruling. |
| **WP02-B2B3-ACORN-STARCH-20261012-S11** | Glands de Chêne, [*Farine de Glands de chêne*](https://www.glandsdechene.com/produit/farine-de-glands-de-chene/), current Québec product listing, footer ©2022; accessed 2026-10-12. | Exact Québec wording for a ground mixture of red and white Québec oak acorns. | The page explicitly describes use as deer feed; it cannot support a human-food identity or Québec culinary French display. |

## Proposal-only outcome

Keep the broader WP02 B2/B3 checklist open. The next action is terminology and product-scope research for the acorn-starch candidate; no catalog, ledger, form, recipe, measure, substitution, or app behavior changes are proposed here. No tests were run because this is a proposal-only research batch.
