# WP02 B2/B3 cereal-starch gap review — oat and barley starch

- **Reviewed:** 2026-10-13.
- **Status:** Proposal reviewed and integrated; root integration is recorded below. The proposal author edited only this review file.
- **Scope:** A coherent review of two unchecked cereal-derived starch candidates: oat starch and barley starch. WP02 B2/B3 remains open.
- **Plan fit:** The global catalog plan keeps ingredient identity separate from measurement and substitution readiness and says the A–Z list is a discovery map rather than an item cap. This packet assesses the two candidates separately and does not close a wider flour/starch section.
- **Source-ID prefix:** `WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70`. Checked against the proposal/batch archive and research ledger before drafting; no collision was found. Root later added the barley evidence sources S01, S03, S04, S11, and S12 to the shared ledger; the remaining source IDs below remain proposal-only.

## Recommendation

| Candidate | Decision | Proposed identity fields or hold | Evidence state |
|---|---|---|---|
| Barley starch | **Add one identity-only `FLOUR_AND_STARCH` reference.** | Candidate ID `ingredient-ref-barley-starch`; EN `barley starch`; proposed fr-CA display `amidon d’orge` (supported by Canadian source-naming convention and OQLF cereal naming; exact compound remains provisional); aliases `[]` / `[]`; `defaultDensity: null`; `unitMappings: []`; no forms, measures, recipe links, conversions, yields, or substitution rules. | Anora identifies barley starch as a food-industry ingredient, and EFSA reviewed a source-defined barley starch used to manufacture foods. EFSA explicitly says the specific Lyckeby product is not sold directly to consumers or consumed as such. This supports ingredient identity for food production, but does not establish a consumer retail product, household recipe use, or a household-use measure. [S03–S04, S11–S12] |
| Oat starch | **Hold generic `oat starch` outside the active catalog pending a clearer human-food product boundary.** | Do not reserve an ingredient ID, create an alias, or attach the term to `ingredient-ref-oat-flour`, oat bran, groats, or flakes. Keep `native oat starch`, `modified oat starch`, and `oat starch fraction` unallocated as product/process-qualified phrases. | Canadian pilot and laboratory sources establish real oat-derived starch materials and food prototypes. The reviewed current Canadian public product list does not identify a standalone food-grade oat-starch product, while the current exact-name supplier page reviewed is in the personal-care/cosmetic/pharmaceutical context. The pilot fraction also contains substantial protein and beta-glucan, so it is not a clean specification for an unqualified starch ingredient. [S05–S10] |

For barley, `amidon d’orge` is the recommended provisional fr-CA display. This is supported beyond a word-for-word translation: OQLF prefers generic `amidon` and supplies the Québec cereal name `orge`, while a current CFIA incorporated-by-reference naming document specifies the common name pattern `amidon de` followed by the plant name for starch. French elision gives `d’orge`. The sources support that construction but do not attest the exact compound `amidon d’orge`; no current Québec package with that exact name was located, so keep it provisional for independent Québec terminology review. Do not use `fécule d’orge`: OQLF reserves *fécule* more specifically for starch in tubers or other underground plant organs. [S01, S03–S04]

### Barley identity and consumer-recipe scope

The consumer-scope evidence is narrower than the identity evidence. Anora's current page calls barley starch a pure ingredient for the food industry and describes food and brewing uses, establishing a real food-input product class. EFSA's 2020 opinion is specifically about Lyckeby's barley starch: it says this product is not sold directly to consumers or consumed as such, and describes its use as an ingredient for food manufacture. The opinion's 75 g sports-food serving and 150 g/day exposure scenario are risk-assessment assumptions, not evidence that a consumer recipe uses those quantities. The bundled corpus also has no barley-starch demand. [S11–S12]

I still recommend adding the identity because the plan treats ingredient existence independently from measurements and substitutions, and this packet represents the documented food-input identity without asserting consumer sale or direct use. This is an inventory-level identity decision, not a claim that a home cook can buy this specific product or substitute it by volume. No recipe link, household measure, conversion, yield, or substitution is justified. If the product boundary is later narrowed to ingredients with demonstrated consumer retail or home-recipe use, this row should be reconsidered against that explicit scope; the current sources do not settle that narrower criterion.

For oat, the source record supports the existence of starch-rich fractions, extracted native starch, and food research. The unresolved question is which current human-food product the generic picker name should identify. A future review can reopen the candidate when it finds a process-defined food ingredient specification or a current food-grade product record that distinguishes the product from oat flour and the pilot fraction.

## Product and naming boundaries

| Wording or product | Disposition | Boundary |
|---|---|---|
| `barley starch` | Add as the proposed English display for one source-derived starch ingredient. | Keep separate from barley grain, barley flour, whole barley flour, malted or roasted barley flour, barley bran, and barley malt. No source reviewed establishes that the identity includes every modified or functional barley starch grade. |
| `amidon d’orge` | Use as a provisional fr-CA display for the proposed barley-starch identity. | OQLF supplies preferred generic `amidon` and the cereal name `orge`; a current CFIA naming standard specifies `amidon de` + plant name for starch, supporting the construction including French elision. No source located attests the exact compound `amidon d’orge` in Québec, so this remains pending independent review. [S01, S03–S04] |
| `fécule d’orge` | Keep unassigned. | OQLF uses `fécule` more specifically for starch in tubers or underground organs. Barley is a cereal grain. [S01, S03] |
| `native barley starch`; `modified barley starch` | Keep outside aliases and forms. | The reviewed sources do not make these universal synonyms for the source-neutral display. EFSA describes an ingredient used both as a starting material and to manufacture modified starch; retain a process qualifier only when a product label or recipe gives it. [S12] |
| `oat starch` | Hold without a catalog owner. | The 2020 Canadian pilot report calls a 71.1%-starch ingredient a “starch fraction”; a 2023 study isolates oat starch in a laboratory; and the current Beacon CMP page lists oat starch in a company whose stated markets are personal care, cosmetics, and pharmaceuticals. These sources do not identify one current, general human-food product specification. [S05, S07, S10] |
| `native oat starch`; `citrate-modified oat starch`; `oat starch fraction` | Keep unassigned as separate qualified product/process phrases. | The lab study demonstrates that chemical modification materially changes composition and properties. The Canadian pilot fraction is compositionally different from the isolated laboratory starch. Do not combine those samples into one process or grade claim. [S05, S07, S09] |
| `oat flour` / `farine d’avoine` | Keep on `ingredient-ref-oat-flour`. | Ground oat flour is already an active identity. It is distinct from a wet-extracted, starch-rich fraction. OQLF’s base term `avoine` supports the cereal name but does not establish an oat-starch compound display. [S02, current catalog] |

## Live ownership, archive, and picker projection

Read-only snapshot of the shared worktree on 2026-10-13. Hashes identify the exact files used for this review. The manifest-ordered recipe fingerprint hashes each relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte.

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,390 | `14f83dfe57f2261a60af0e4e212f248a028580e43a4dbab1a79ac0cb6843e80a` |
| Ingredient forms | 100 | `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63` |
| Legacy import candidates | 63 | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| Research-ledger records | 1,723 | `4edb2efc5998fa64d62f5e6b120ae78b6eda36be5d75eaa6475424cb833a4364` |
| Manifest-listed recipes | 114 files / 1,123 ingredient rows | `81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552` |

Exact candidate phrases were checked across active reference display names and aliases, form labels and match terms, legacy candidate names and aliases, ledger records, the global plan, and proposal/batch archive text. There is no exact owner or earlier focused proposal/batch decision for `oat starch`, `native oat starch`, `oat starch fraction`, `amidon d’avoine`, `fécule d’avoine`, `barley starch`, `native barley starch`, `amidon d’orge`, or `fécule d’orge`. The proposed ID `ingredient-ref-barley-starch` and source-ID prefix also have no current owner. No oat-starch ID is reserved in this hold.

The closest active identities are boundaries rather than owners of the proposed terms:

| Active identity | Current display | Relation to this review |
|---|---|---|
| `ingredient-ref-oat-flour` | `oat flour / farine d’avoine` | Existing ground-oat flour; not a starch alias or wet-extracted fraction. |
| `ingredient-ref-oat-bran` | `oat bran / son d’avoine` | Separate oat fraction; its attached forms are `ingredient-form-oat-bran-dry` and `ingredient-form-oat-bran-cooked`. |
| `ingredient-ref-oat-groats` | `oat groats / gruau d’avoine entier` | Intact oat grain product. |
| `ingredient-ref-rolled-oats`, `ingredient-ref-quick-oats`, `ingredient-ref-instant-oats`, `ingredient-ref-steel-cut-oats` | Oat flakes or cut grain | Keep recipe lines for these products linked to their current grain identities. |
| `ingredient-ref-barley` | `barley / orge` | Whole cereal identity. |
| `ingredient-ref-barley-flour`, `ingredient-ref-whole-barley-flour`, `ingredient-ref-roasted-barley-flour`, `ingredient-ref-malted-barley-flour`, `ingredient-ref-roasted-barley-malt-flour` | Barley flour and qualified flour products | Milling products distinct from extracted starch. |
| `ingredient-ref-barley-bran`, `ingredient-ref-barley-flakes`, `ingredient-ref-hulled-barley`, `ingredient-ref-pearl-barley`, `ingredient-ref-pot-barley`, `ingredient-ref-barley-couscous`, `ingredient-ref-cream-of-barley-cereal`, `ingredient-ref-sprouted-barley` | Other barley products | Grain, cereal, bran, or processing identities distinct from extracted starch. |

No form record owns either starch candidate. Nearby active forms are limited to the oat-bran and pearl-barley dry/cooked forms; none provides an oat- or barley-starch state. No exact legacy candidate or ledger identity/measurement/substitution record exists for either starch. The pre-draft archive search covered 1,027 proposal Markdown files and all text under the batch archive; it returned no candidate phrase match. The immediately preceding WP02 B2/B3 reviews concern other products, including black-lentil flour, pine-nut flour, and *Sagittaria* arrowhead starch.

Picker behavior below mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode-decompose and fold accents, normalize punctuation and spacing, prefer complete word phrases, then fall back to substring matching. These are static projections, not emulator observations.

| Query | Current picker result | Projection under this proposal |
|---|---|---|
| `oat starch`; `native oat starch`; `amidon d’avoine`; `fécule d’avoine` | No result | Remain unassigned because oat starch is held. |
| `oat flour`; `farine d’avoine` | `ingredient-ref-oat-flour` only | Unchanged; no starch phrase is added to the flour aliases. |
| `oat`; `avoine` | 5 and 10 existing oat-related references, respectively | Unchanged; the held oat-starch candidate adds no result. |
| `barley starch`; `amidon d’orge` | No result | Each exact query would return only the proposed `ingredient-ref-barley-starch`. |
| `fécule d’orge` | No result | Remains unassigned. |
| `barley`; `orge` | 16 existing barley-related references for each query | 17 results after addition, including the separately named starch. |
| `starch`; `amidon` | 15 and 9 existing starch references, respectively | 16 and 10 results after addition. These broad queries remain multi-result. |
| `barley flour`; `farine d’orge` | The four existing barley-flour identities: `ingredient-ref-barley-flour`, `ingredient-ref-malted-barley-flour`, `ingredient-ref-roasted-barley-flour`, and `ingredient-ref-whole-barley-flour` | Unchanged; the proposed starch display does not claim flour wording. |

The candidate has no aliases, so the exact English and French displays remain its only exact starch queries. Keep `barley`, `orge`, `amidon`, and `starch` broad. Do not place `barley starch` or `amidon d’orge` on the existing grain, bran, or flour identities.

## Bundled recipe demand

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for the candidate phrases, French constructions, likely native/modified variants, and exact ingredient-reference links.

- The scan found **zero oat-starch or barley-starch recipe-text hits, zero matching ingredient rows, and zero rows linked to either candidate ID**.
- Four recipe lines mention oats, all for flakes: recipe 001 uses `1/2 cup old-fashioned rolled oats`; recipes 024 and 047 use quick oats; recipe 065 uses rolled oats. These lines already have oat-flake identities and do not imply starch or oat-flour demand.
- The bundled corpus contains no barley-starch line and no barley ingredient row that establishes a starch use. Barley grain or flour evidence was not inferred from the existence of barley products in the catalog.
- No recipe relink, measure, conversion, yield, or substitution is proposed for either candidate.

## Numeric measurement and substitution evidence

### Oat starch: lab values and formula-specific tests

- Başarici Ünlü and Aykaç extracted oat starch from dehulled commercial oats milled and sieved through a **0.425 mm** screen. The dry-basis starch yield was **43.07 ± 0.18 g per 100 g oat flour** for the control and **48.64 ± 0.24**, **49.04 ± 0.33**, and **47.91 ± 0.16 g/100 g** after 30, 45, and 60 minutes of sonication. These are process yields from one laboratory method, not an oat-flour-to-starch recipe conversion or a commercial product yield. [S07]
- The same paper measured bulk density by filling a **5 mL** measuring cylinder and tapping it until the volume stopped changing. Table 1 reports **0.80 ± 0.01**, **0.73 ± 0.03**, **0.65 ± 0.02**, and **0.67 ± 0.04 g/mL** for the control, 30-, 45-, and 60-minute samples. Its discussion says **0.59 ± 0.03 to 0.80 ± 0.01 g/mL**, which conflicts with the table’s lowest value of 0.65. Use the table only as a reported lab range of **0.65–0.80 g/mL**, and retain the text/table inconsistency. [S07]
- Multiplying that table range by RecipeBook’s `cup` unit (**236.5882 mL**) gives an arithmetic proxy of about **154–189 g per app cup**. The paper’s tapped-cylinder protocol is not a household scoop, spoon, or level-cup method, and the prose/table discrepancy widens the reported range. Do not activate this as density, a cup mapping, or a recipe conversion. [S07; current [`units.v1.json`](../../../app/src/main/assets/seed/bundled-library/units.v1.json)]
- A 2003 primary baking study replaced **5%, 10%, 15%, or 20%** of wheat starch with oat starch in **40 g model rolls** made from wheat starch and vital gluten. It also tested wheat bread of **250 g**, replacing **10% or 20%** of wheat-flour mass with oat starch; the authors report no positive quality effect in those wheat breads. These are narrow formulations and do not support a general wheat-flour replacement rule, other products, or a default percentage. [S08]
- The Canadian 2020 pilot report describes an oat “starch fraction” containing **71.1% starch, 15.5% protein, and 1.8% β-glucan** and prototypes in pasta, doughnuts, ice cream, and a meat analogue. In the meat analogue, oat starch alone did not deliver the desired meat-like texture; konjac and xanthan were added. Those results document one mixed fraction and prototypes, not a household-use amount or generic substitution. [S05]
- Alexander et al. report lab-extracted native oat starch with **95.3 ± 1.4% total starch** and citrate-modified oat starch with **96.0 ± 0.4% total starch**; resistant starch differed from **0.4 ± 0.5%** to **56.5 ± 0.6%** after modification. These source-specific measurements show that modification changes the material. They are not density, a kitchen measure, or substitution evidence. [S09]

**Oat disposition from numeric evidence:** retain all measurements as source-scoped research evidence. No current measurement is activation-ready for the held generic identity. Add no default density, unit mapping, measure, form conversion, yield, or substitution rule.

### Barley starch: product specifications are not kitchen measures

- EFSA’s 2020 opinion reproduces one Lyckeby barley-starch specification: maximum **15% moisture as packed**, **less than 20 mg/kg gluten**, energy **1,445 kJ / 340 kcal per 100 g**, and up to **5 g fat per 100 g**. Its manufacturing description is wet separation and washing of barley components followed by dewatering and drying. These values describe that supplier’s powder specification and food-allergen dossier; none is a bulk density, volume portion, or conversion. [S12]
- EFSA says its reviewed barley starch is **not sold directly to consumers or consumed as such**. Its high-consumer exposure scenario uses **75 g per sports-food serving** and **150 g/day for two servings**, and one gluten-free-staple scenario assumes up to **35% of digestible carbohydrates** from barley starch. These are risk-assessment assumptions, not a recipe portion, product label serving, or substitution percentage. The opinion provides no household cup or spoon measure and no volume-to-mass conversion. [S12]
- Anora’s current manufacturer page describes barley starch as an ingredient for the food industry and brewing as well as paper applications, but gives no household measure or consumer formulation. The reviewed evidence contains no source-neutral barley-starch density and no validated cooking or baking replacement ratio. [S11–S12]

**Barley disposition from numeric evidence:** keep `defaultDensity: null` and `unitMappings: []`; add no measure, form conversion, yield, or substitution rule. Identity acceptance does not make its measurement or substitution state ready.

## Source register

All pages were reviewed on **2026-10-13**. At proposal stage, these source IDs were proposal-local. Root later added barley sources S01, S03, S04, S11, and S12 to the shared research-ledger record; oat-source IDs remain proposal-only.

| ID | Source and supported claim | Limits |
|---|---|---|
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S01** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Marks `amidon` as preferred and `fécule` as context-specific wording for starch in tubers or other underground organs. | Generic terminology; it does not provide the exact oat- or barley-starch compound. Applying the distinction to cereal starch is a bounded terminology inference. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S02** | OQLF, [*avoine* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432769/avoine), 2019. Gives French `avoine`, English `oat`, Latin *Avena sativa*, and notes human/animal food use and oat flour/flakes. | Supports the cereal name and identity, not an exact oat-starch label, fraction, or product process. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S03** | OQLF, [*orge* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge), 2019. Gives French `orge`, English `barley`, Latin genus *Hordeum*, and explains that orge refers to plant and grain. | Supports the cereal name, not an exact French barley-starch compound or an extracted-starch product. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S04** | Canadian Food Inspection Agency, [*Noms usuels d’ingrédients et de constituants*](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants), current incorporated-by-reference document. Table 1 gives `amidon` the common-name pattern `amidon de` followed by the plant name; modified starch uses that source name plus `modifié` / `modifiée`. | Supports the Canadian French naming construction, not an attestation that a barley-starch package or Québec recipe uses the exact display `amidon d’orge`. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S05** | Prairie Oat Growers Association / University of Alberta, [*Product Development from Gluten Free Oat Fractions*, final report (28 January 2020)](https://poga.ca/wp-content/uploads/2022/06/Summary_of_the_project_Oat_fractionation_and_food_prototype_development_Jan_2020.pdf). Describes Avena Foods oat fractions, their composition, and four food prototypes. | Pilot product development; its starch fraction is not a pure-starch specification or current consumer SKU. Prototype behavior and use levels cannot be generalized. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S06** | Avena Foods, current [*New State-of-the-Art Oat Mill for RTE Ingredients* page](https://www.avenafoods.com/new-state-of-the-art-oat-mill-for-rte-ingredients/). Describes a Canadian oat mill and lists its public ingredient range: oat flours, flakes, rolled oats, steel-cut oats, and groats. | Oat starch is not named in this published range. This is a bounded catalogue check, not evidence that no food-grade oat-starch product exists elsewhere. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S07** | Esra Başarici Ünlü and Çiğdem Aykaç, [“Effect of ultrasound on isolation and properties of oat starch,” *Czech Journal of Food Sciences* 41 (2023), 111–117](https://cjfs.agriculturejournals.cz/pdfs/cjf/2023/02/04.pdf), DOI 10.17221/94/2022-CJFS. Primary study for extraction yield, tapped bulk density, and protocol. | Laboratory samples and extraction conditions; its measurements do not specify a retail flour/starch product or household scoop method. The article’s discussion and table differ on the minimum density. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S08** | Halina Gambuś and Marek Gibiński, [“The effect of addition of oat starch on wheat bread quality and staling,” *Biuletyn Instytutu Hodowli i Aklimatyzacji Roślin* 229 (2003), 291–299](https://ojs.ihar.edu.pl/index.php/biul/article/download/2060/1950/5022), DOI 10.37317/biul-2003-0076. Primary source for the 40 g model rolls and 250 g wheat-bread test percentages and reported outcomes. | One old, formulation-specific study; it does not establish a general recipe substitution, current market product, or household measure. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S09** | Vanessa Alexander et al., [“Physiochemical, Pasting, and Morphological Properties of Native Oat Starch and Citrate-Modified Oat Starch,” *Starch—Stärke*](https://onlinelibrary.wiley.com/doi/10.1002/star.202400063), first published 9 September 2024, DOI 10.1002/star.202400063. Primary research compares laboratory native and citrate-modified oat starch. | One lab extraction and treatment; composition and functional differences do not support an active density or recipe conversion. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S10** | Beacon CMP, current [About page](https://www.beaconcmp.com/aboutbeacon). Lists oat starch among products and states that the company introduced oat-derived ingredients into personal-care, cosmetic, and pharmaceutical industries. | Current product identity is in an industrial personal-care/cosmetic/pharmaceutical context; this page supplies no food-grade oat-starch specification. It does not establish that every oat-starch product is non-food. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S11** | Anora Industrial, current [Barley Starch product page](https://anoraindustrial.com/en/barley-starch). Calls barley starch a pure ingredient for the food industry and describes use in food, brewing, paper, and packaging. | Manufacturer evidence for a commercial B2B ingredient; no consumer package, Québec name, household measure, density, or recipe formula. |
| **WP02-B2B3-CEREAL-STARCHES-OAT-BARLEY-20261013-R70-S12** | EFSA Panel on Nutrition, Novel Foods and Food Allergens, [scientific opinion on Lyckeby barley starch](https://efsa.onlinelibrary.wiley.com/doi/10.2903/j.efsa.2020.6118), *EFSA Journal* 18(5), e06118 (2020), DOI 10.2903/j.efsa.2020.6118. Describes barley starch as a food-manufacturing ingredient and reproduces the applicant’s specification and exposure scenarios. | Supplier-specific and framed as an allergen-labelling assessment. The 75 g/150 g and 35% values are scenario assumptions, not kitchen measures or culinary substitution evidence; the opinion is not a Canada-specific allergen or gluten-free recommendation. |

## Proposal boundary

At proposal-author stage, this recommendation was limited to this review file; it did not edit the shared ingredient-reference JSON, forms, legacy identities, research ledger, global plan, roadmap, checklist, generated index, recipes, or code. Root later integrated the accepted data decision and documentation updates described below. No app tests or emulator checks were run because the database change only adds JSON catalog data and its generated index.

## Integration outcome (2026-10-13)

Root accepted the identity-only barley-starch addition and the oat-starch product-boundary hold.
`ingredient-ref-barley-starch` now displays `barley starch / amidon d'orge` in
`FLOUR_AND_STARCH`, with no aliases, forms, density, unit mappings, recipe links, or conversion and
substitution behavior. The French compound remains provisional. Five source entries and an accepted
decision were added to the research ledger. No oat-starch identity, alias, or ledger candidate was
created; its pilot, laboratory, and supplier evidence remains in this proposal. The shared plan,
roadmap, and integration record were updated; see the [integration README](../batches/wp02-b2b3-cereal-starch-integration-20261013/README.md).

The change only adds database JSON data and its generated index, so no app tests or emulator checks
were run.
