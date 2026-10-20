# WP02 Section E — Malt extract, activity states, and dough improvers: live recheck

- **Reviewed:** 2026-10-12
- **Status:** proposal only. This recheck changes no catalog JSON, ledger, recipe, plan, workflow, roadmap, code, or tests.
- **Owner:** WP02 / Section E catalog coordinator. No integration batch is proposed while recipe demand remains zero.
- **Review target:** [`wp02-malt-extract-diastatic-boundary-20261009.md`](wp02-malt-extract-diastatic-boundary-20261009.md) and its coordinator note, rechecked against the current bundled package, research ledger, legacy candidates, and all manifest-listed recipe rows.
- **Plan item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section E, line 1648. Its nested 2026-10-09 recheck says no demand means no new row, form, measurement, conversion, or substitution; keep Section E open. The nested note's count of three active malt-flour references is now stale: the live catalog has five flour references in this family.

## Live snapshot and demand audit

This audit snapshot records the package at review time before the independent coordinator integrations recorded in the ammonium and regional-spice batch READMEs. The malt-family result remains unchanged.

| Artifact | Current count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,190 references | `24a913f1af8a0d778d803bcac0624603eee70179c29112f16f2cdce24663e0dd` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe files, ordered aggregate of path + NUL + bytes + NUL | 114 files / 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `research-ledger.v1.json` | 1,491 records; 4,983 source entries; 4,066 distinct source IDs; 8 unit-conversion records | `e014f19fdf72353f16ef99adff433ce131eaeef7feafbe2c0e067a659802a914` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |

The search covered current reference display names and aliases, every form label and match term, legacy IDs/names/aliases, all ingredient-row text fields, and every parsed string in the 114 recipe files. The terms covered malt flour and cereal-qualified malted flours; malt extract/`extrait de malt`; malt syrup/`sirop de malt`; malt powder; diastatic and non-diastatic/diastasique wording; amylase; and dough/bread improver terms, including `améliorant à pain`, `améliorant à pâte`, `améliorant de la panification`, and `améliorant de la fermentation`.

- **Recipe demand:** 0 matches in 114 recipes / 1,123 ingredient rows, and 0 matches in all parsed recipe-file strings. No recipe line needs relinking.
- **Active forms:** no malt extract, activity-state, malt-powder, or improver form/alias is present.
- **Legacy candidates:** 0 in-scope matches among 66 candidates.
- **Ledger:** the accepted malt-family records cover the five current flour references below. `candidate-generic-malt-flour` is merged into the active generic malt-flour reference. The ledger has no active or held malt-extract, malt-syrup, activity-state, or dough-improver candidate. The yeast-extract-spread record cites an OQLF malt-extract entry only to distinguish products; it is not a malt-extract candidate. The nearby `ingredient-ref-malt-vinegar` record is a separate vinegar identity, outside this review.

## Current identities and aliases

| Active reference | English / French display | Current aliases | State |
| --- | --- | --- | --- |
| `ingredient-ref-malt-flour` | `malt flour` / `farine maltée` | EN: `malted cereal flour` | `FLOUR_AND_STARCH`; no forms, density, or unit mappings. Ledger identity is accepted. |
| `ingredient-ref-malted-barley-flour` | `malted barley flour` / `farine d'orge maltée` | EN: `malt barley flour` | `FLOUR_AND_STARCH`; no forms, density, or unit mappings. |
| `ingredient-ref-malted-wheat-flour` | `malted wheat flour` / `farine de blé maltée` | none | `FLOUR_AND_STARCH`; no forms, density, or unit mappings. |
| `ingredient-ref-malted-rye-flour` | `malted rye flour` / `farine de seigle malté` | none | `FLOUR_AND_STARCH`; no forms, density, or unit mappings. |
| `ingredient-ref-roasted-wheat-malt-flour` | `roasted wheat malt flour` / `farine de malt de blé torréfié` | none | `FLOUR_AND_STARCH`; no forms, density, or unit mappings. |

The broad string `malt` also finds `ingredient-ref-malt-vinegar` / `vinaigre de malt`. This is an unrelated, separately accepted condiment identity. Search results containing it must not be treated as extract or flour demand. Keep the five existing flour identities and their aliases unchanged; do not transfer aliases among them.

## Integrate versus hold

| Candidate or current concept | Exact English / Québec French wording supported here | Recommendation | Boundary and limits |
| --- | --- | --- | --- |
| Five active malt-flour references above | Preserve the current display pairs and aliases verbatim. | **Keep integrated, unchanged.** | They are milling products. Keep generic malt flour, cereal-specific malted flours, and roasted wheat malt flour distinct. No activity form is currently warranted. |
| Generic malt extract | `malt extract` / `extrait de malt` | **Hold a new row.** This is the only new identity in the review that is sufficiently distinct and has a supported bilingual headword for possible future use. | OQLF's 2019 entry supplies the term pair and liquid/powder presentation but is in food-chemistry/brewing vocabulary. Briess shows malt extracts can have different cereal sources, functions, and activity. There is no bundled demand; do not allocate an ID or category now. If later activated for an exact recipe, start with no aliases, no forms, no density, and no mappings. Capture a stated cereal source in the product/line wording rather than treating it as a global synonym. |
| Liquid, dry/powder, cereal-qualified, or diastatic malt extract | Supplier language includes `malted barley extract`, `malted wheat extract`, `liquid malt extract`, and dried extract; OQLF describes liquid or powder presentation. | **Hold forms and source-qualified identities.** | Presentation and enzyme activity are different properties. The unqualified term does not establish cereal source, activity, solids, or a conversion between presentations. “Malt powder” is ambiguous between ground malt flour and dried extract; do not add it as an alias. |
| Malt syrup | `malt syrup` / `sirop de malt`; current product example `Barley Malt Syrup` | **Hold as a separate unresolved candidate; do not alias to extract.** | OQLF supports the French term but its 1964 entry gives no definition. CFIA enumerates `malt syrup`, `malt extract`, and `malt flour` separately in standardized bread; its ingredient-name examples also list `malt syrup`, `malted barley extract`, and `malted barley syrup` separately. A current Eden product is specifically named barley malt syrup and declares sprouted barley and water. This proves that product's label/composition only, not equivalence across products. |
| Diastatic / non-diastatic activity on malted flour | Briess product headings include `Diastatic Malt Flours`, `Nondiastatic Dark Roast Flours`, and `Nondiastatic Sweet Flours`. Farinart's French page says `grains maltés diastatiques ou non diastatiques` and calls one product `farine de grains maltés avec une activité enzymatique naturelle (alias poudre de malt diastatique)`. | **Hold global aliases, IDs, and forms.** Retain a qualifier only when the exact recipe or product source gives it. | Activity is a product property, not an automatic consequence of an unqualified malted-flour name. The French phrases above are source-attested descriptions/product wording, not a general OQLF-approved pair for every grain or product. Do not infer activity from cereal alone or from `malt flour`. |
| Diastatic malt extract | Briess describes malt extract whose process preserves some alpha-amylase as a diastatic extract. | **Hold as a generic state or form.** | This establishes possibility, not that all extracts are active or that a universal catalog state model fits the property. Preserve the exact product label and activity data only if a future recipe names such a product. |
| Dough/bread improver family | Current Québec supplier heading: `Améliorants à pain`; product-specific wording includes `améliorant en poudre`. The Québec directory's English ingredient declaration says `dough improver (enzyme, ascorbic acid)`. | **Hold a generic identity and any malt alias.** | Puratos describes complete multi-use and modular solutions, so “improver” does not denote one composition. The directory example is one company-supplied ingredient declaration and has no matched French ingredient line; do not manufacture a canonical bilingual pair from separate pages. OQLF's older `améliorant de la fermentation` / `améliorant de la panification` entry has a narrower note on oxidizing flour-maturation agents and should not be a catch-all alias. |
| Named composition-known dough improver | `Maltorose Dough Improver`; Briess says it is a blend of specialty malt flours and dextrose. | **Hold product-specific identity.** | The composition belongs to this named industrial product, not to the improver family. No recipe names it. Add only if an exact recipe requires it and a product-specific bilingual label is available. |

### Numeric and substitution boundary

Add no default density, household measure, unit mapping, liquid/dry conversion, enzyme-activity default, use rate, yield, or substitution. Manufacturer activity and use data describe named industrial products and processes; they do not establish generic catalog values or kitchen replacements. Do not substitute flour for extract, extract for syrup, diastatic for non-diastatic products, or any malt for a dough improver based on these sources.

## Québec terminology and unresolved limits

- **Firm term pairs:** OQLF prefers `extrait de malt` / `malt extract` (2019) and `sirop de malt` / `malt syrup` (1964). The first entry is explicitly in food chemistry and brewing; the second is a terminology-only entry. Neither sets a Canadian product-composition rule.
- **Activity wording:** OQLF records `pouvoir diastasique` / `diastatic power` (1986) as a brewing/grain-steeping property. It does not provide a preferred French display for “diastatic malt flour” or define a universal enzyme-activity threshold. Farinart's exact French wording can be retained when that product or source is intended, but should not become a general alias.
- **Improver wording:** `améliorants à pain` is current Québec supplier usage. The MAPAQ directory example confirms a separate English ingredient phrase `dough improver (enzyme, ascorbic acid)`; it does not supply a bilingual named product label. The old OQLF entry is not a sufficient authority for a broad current family name.
- **Remaining gaps:** no Québec bilingual label pairing for generic diastatic/non-diastatic flour or malt-extract product states; no generic improver composition or stable bilingual product identity; no recipe demand. Keep those items open instead of creating an English-to-French alias from inference.

## Source register

IDs in this table are local to this proposal; none has been added to the shared research ledger.

| Source ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| `WP02-MALT-BOUNDARY-20261012-S01` | OQLF, [extrait de malt (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2086260/extrait-de-malt), updated 2019, definition, notes, preferred term, English term. | `extrait de malt` / `malt extract`; liquid and powder presentation; malt-wort definition. | Brewing/food-chemistry context, not a general baking product specification. |
| `WP02-MALT-BOUNDARY-20261012-S02` | CFIA, [Food composition and quality claims](https://inspection.canada.ca/en/food-labels/labelling/industry/composition-and-quality), “malted” guidance. | A food is not “malted” merely because malt extract is added; the carbohydrate must have been modified by malt diastase. | Claims guidance, not a catalog rule or activity threshold. |
| `WP02-MALT-BOUNDARY-20261012-S03` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 12, 12.2.1(f). | Names malt syrup, malt extract, and malt flour as separate permitted bread ingredients. | Does not define those names as synonyms or specify home-recipe use. |
| `WP02-MALT-BOUNDARY-20261012-S04` | CFIA, [List of ingredients and allergens](https://inspection.canada.ca/en/food-labels/labelling/industry/list-ingredients-and-allergens), Annex 1B examples, sugars-based ingredients. | Separately lists malt syrup, malted barley extract, and malted barley syrup as ingredient-name examples. | Naming examples are not a formulation or proof of universal non-equivalence; they are not an OQLF terminology decision. |
| `WP02-MALT-BOUNDARY-20261012-S05` | Briess Malt & Ingredients, [Malting & Roasting](https://food.briess.com/capabilities/malting/), “Malted Barley Extracts,” “Other Kilned Malted Cereals,” “Specialty Roasted Malts.” | Distinguishes enzyme-active from nondiastatic products; says wheat and rye malt products can also be diastatic/nondiastatic; describes cereal-qualified and potentially diastatic extracts. | Manufacturer's technical description; it does not set a Canadian naming rule, universal activity value, or kitchen use. |
| `WP02-MALT-BOUNDARY-20261012-S06` | Briess, [Malted Flours](https://food.briess.com/products/briess-specialty-malt-flours/), flour categories and named Maltorose products. | Current product list distinguishes diastatic and nondiastatic flour families and gives composition for named improver blends. | Supplier-specific names and blends, not universal identities or improver formulas. |
| `WP02-MALT-BOUNDARY-20261012-S07` | Farinart, [Nos grains germés et maltés](https://farinart.ca/fr/our-sprouted-grains/), French product-family wording. | Québec supplier phrasing `grains maltés diastatiques ou non diastatiques` and `farine de grains maltés avec une activité enzymatique naturelle (alias poudre de malt diastatique)`. | Supplier wording for its product context, not a general French standard; its application amounts are not imported. |
| `WP02-MALT-BOUNDARY-20261012-S08` | OQLF, [sirop de malt (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10491445/sirop-de-malt), updated 1964. | Preferred `sirop de malt` / English `malt syrup`. | Term pair only; the old entry provides no product definition or extract equivalence. |
| `WP02-MALT-BOUNDARY-20261012-S09` | OQLF, [pouvoir diastasique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088387/pouvoir-diastasique), updated 1986. | French technical term and English `diastatic power`. | Brewing/grain-steeping property; no preferred consumer-facing product label or general threshold. |
| `WP02-MALT-BOUNDARY-20261012-S10` | Puratos Canada, [Améliorants à pain](https://www.puratos.ca/fr/boulangerie/categories/bread-improvers), product-family description. | Current Québec supplier term and family variability (complete multi-use and modular solutions). | Commercial category and portfolio, not a generic composition. |
| `WP02-MALT-BOUNDARY-20261012-S11` | Québec Food Directory / MAPAQ, [Bread Mix White Bread](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8201535), product listing updated 2025-10-29, ingredient declaration. | One Québec product listing declares malted barley flour and separately `dough improver (enzyme, ascorbic acid)`. | Company-supplied information; one product, no ingredient proportions or French improver wording. |
| `WP02-MALT-BOUNDARY-20261012-S12` | Eden Foods, [Barley Malt Syrup organic](https://store.edenfoods.com/barley-malt-syrup-organic/), current product listing and ingredient declaration. | Exact product name and a product-specific sprouted-barley-and-water ingredient declaration. | One U.S. product; does not define all malt syrups or equate them with extracts. |
| `WP02-MALT-BOUNDARY-20261012-S13` | OQLF, [améliorant de la fermentation (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297239/ameliorant-de-la-fermentation), 1987 entry and note. | Older French/English bread-improver terminology. | Narrow note on oxidizing flour-maturation agents; do not use as an alias for all current multi-ingredient improvers. |

Existing flour identity evidence remains in the shared ledger: generic malt flour `WP02-MALT-FLOUR-IDENTITY-20261010-S01–S03`; malted barley flour `WP02-S110–S113`; malted wheat flour `WP02-S114–S117`; malted rye flour `WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S08–S09`; and roasted wheat malt flour `WP02-S115`, `WP02-S116`, `WP02-S129`, `WP02-ROASTED-QC-REVIEW-20261011-S01`. This review leaves those records and all shared data unchanged.

## Recommendation

1. Keep the five live flour references, exact aliases, categories, and empty numeric/form data unchanged. Keep malt vinegar separate.
2. Do not create any new row or form now. If exact recipe demand later appears, review `malt extract / extrait de malt` first as a separate identity with no inferred alias, product source, category, form, measurement, or substitution.
3. Keep malt syrup unresolved and separate from extract. Keep diastatic/nondiastatic product qualifiers attached only to exact source wording; do not make them global aliases, reference IDs, or forms in this no-demand review.
4. Keep generic dough improver and named improver blends held. Review an exact recipe and a bilingual product label before assigning an identity or French display.
5. Leave Section E open. The live evidence supports identity boundaries but supplies no recipe demand or general numeric/conversion/substitution behavior.


## Coordinator reconciliation — 2026-10-12

The plan now records this live recheck under Section E. No malt catalog row, alias, form, measurement, conversion, or substitution changed. The five active flour references remain unchanged; malt extract is the only future identity-ready candidate, while syrup, activity-state, and improver concepts remain held pending exact recipe demand. The Section E parent remains open.
