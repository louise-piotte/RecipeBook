# WP02 Section A7 R800 — emmer-flour product portion review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Integrated on 2026-10-19. The Purcell source is `WP02A4-EM-S04`; observation ID is `emmer-flour-purcell-organic-whole-grain-quarter-cup-45-g-r800-20261019`. The data remains product-specific. No software tests/build/emulator/deploy were run because this change only adds database JSON data under `AGENTS.md`.
- **Plan anchor:** Section A7 remains open for grain meals and milling products, including the unresolved wheat-meal candidate ([global catalog plan, line 2276](../../RecipeBook-global-ingredient-catalog-plan.txt#L2276)). The current checklist already includes the integrated R794 hominy-grits portion and R797 Khorasan-flour portion.
- **Target:** Existing milling reference **ingredient-ref-emmer-flour**, displayed as **emmer flour / farine d'amidonnier**.
- **Scope:** Review one published volume-and-mass serving for one named emmer-flour product. Do not reopen the emmer-flour identity, generic French display, farro boundary, or emmer-semolina decision.
- **Proposal-local handles:** **R800-PURCELL-EMMER-20261019-S01** maps to shared source **WP02A4-EM-S04**. The observation handle is retained as shared observation ID **emmer-flour-purcell-organic-whole-grain-quarter-cup-45-g-r800-20261019**.

## Integrated finding

**Record one product-specific portion observation** on the existing emmer-flour ledger row:

- Purcell Mountain Farms Organic Emmer Flour, described on the current product page as whole-grain flour made with its Unifine milling system: **1/4 cup = 45 g**.

Root integrated that product-specific serving by changing only the existing row’s measurement research to **researched_supported**, adding the Purcell product-page source, and appending one **portion_weight** observation. The source page currently offers 1, 3, 5, and 10 pound options; its stock and package selections were not stored as catalog facts.

Keep the value attached to this named Purcell product. Do not treat it as a measure for Arva’s flour, a generic emmer-flour cup weight, or a Québec-market availability claim. Preserve the active reference’s names and empty alias arrays; keep density null, unit mappings empty, and substitution research unchanged. Add no form, conversion, recipe link, package yield, or substitution rule.

## Evidence and limitations

Sources were checked online on 2026-10-19.

| Source and ownership | Evidence | Limits |
|---|---|---|
| **New product-portion source, proposal-local handle R800-PURCELL-EMMER-20261019-S01:** Purcell Mountain Farms, [Organic Emmer Flour](https://shop.purcellmountainfarms.com/products/organic-emmer-flour). | The brand’s own storefront currently lists the item as an in-stock flour and prints the Nutrition Facts serving as **1/4 cup (45 g)**. The same page identifies the product as whole-grain emmer flour, says the flour contains the bran and germ, describes a single-pass Unifine process, and states United States origin. | This is a published serving on a storefront page, not an independently weighed sample or a verified package photograph. The page does not identify cup capacity, how the flour is filled or leveled, or a weighing method. It gives no GTIN and does not establish availability in Québec. Keep the serving strictly product-specific. |
| **Reuse existing ledger source WP02A4-EM-S01:** OQLF, [amidonnier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier). | The Québec terminology entry pairs **amidonnier** with English **emmer** and the Latin taxon **Triticum dicoccum**. It supports the existing Québec French species wording. | The entry was last updated in 2019 and is terminology evidence, not a flour product listing or measurement source. It does not support a volume-and-mass amount. |
| **Reuse existing ledger source WP02A4-EM-S02 for English product context:** Arva Flour Mill, [Organic Whole Emmer Flour](https://arvaflourmills.com/products/whole-emmer-flour). **French product wording checked on the mill’s [French product page](https://arvaflourmills.com/fr/pages/our-flours).** | The current Ontario mill sells a named whole emmer flour. Its French catalogue names the product **Farine d'amidonnier complet biologique** and describes baking uses. This Canadian product evidence is consistent with the species-qualified French form already owned by the active reference. | Arva’s Canadian product is not the Purcell product and publishes no cup serving on these pages. The French page is from an Ontario mill, not a Québec retailer; neither page supports the Purcell serving or a general measure. Do not transfer Purcell’s 45 g value to Arva. |
| **Reuse existing ledger source WP02A4-EM-S03:** Biofarm, [farine d'amidonnier mi-blanche](https://biofarm.ch/fr/emmerhalbweissmehl-ch-16760-g). | Existing evidence for French-language use of farine d'amidonnier on a named flour product. | Swiss product evidence only. It does not support Québec market usage or any measure and adds nothing to this portion decision. |

The exact generic French display remains supported by the existing OQLF entry. Arva’s French wording corroborates Canadian product usage, but is not represented as a Québec label. No French alias or product-grade claim is proposed.

## Existing-key and source-ownership audit

| Surface | Live state and ownership | R800 disposition |
|---|---|---|
| Active reference | **ingredient-ref-emmer-flour** is verified as **emmer flour / farine d'amidonnier** in **FLOUR_AND_STARCH**. Both alias arrays are empty; default density is null; unit mappings are empty. | Preserve all active reference fields. Do not add whole-grain, organic, Unifine, or brand wording as aliases. |
| Ledger measurement owner | The emmer-flour row now has **measurementState: researched_supported**, **substitutionResearchState: not_yet_researched**, and the one R800 product-specific measurement observation. Its existing sources are WP02A4-EM-S01 (OQLF), WP02A4-EM-S02 (Arva English product page), and WP02A4-EM-S03 (Biofarm French product page). None publishes a cup amount. | The accepted source-specific observation is attached to this row; substitution research remains unchanged. |
| New source ownership | The exact Purcell URL was unowned before integration and is now recorded as `WP02A4-EM-S04` on the emmer-flour row. | The shared source supports only the named product’s published serving; it does not create generic flour measure behavior. |
| Québec and Canadian product context | WP02A4-EM-S01 and WP02A4-EM-S02 are already owned by the emmer-flour row. The Arva French catalogue page is cited here for Canadian French product wording only; it does not provide the proposed amount. | Reuse the existing OQLF and Arva English evidence; cite the French page without adding it as a shared ledger source for this numeric observation. |
| Adjacent identities and forms | Separate active rows exist for emmer grain, emmer semolina, farro flour, and farro grain. The emmer-flour reference has no ingredient-form entry, and neither global nor contextual substitution rules mention it. | Keep grain, semolina, and flour owners separate. Add no form or cross-product mapping. |
| Prior A7 ownership | R440 accepted the separate emmer-semolina identity. R640 recorded Anson Mills’ **1½ cups (8 ounces)** as one formula-specific emmer-semolina amount; it is not an emmer-flour observation. R315’s Section F farro-flour boundary review discussed Arva product properties and baking guidance but added no emmer-flour measure. R794 and R797 cover hominy grits and Khorasan flour, respectively. | This is a distinct measure on the existing emmer-flour row. Do not transfer R640’s semolina quantity or any Arva baking guidance. |
| Excluded earlier candidate | The R28 einkorn-meal boundary review already surfaced a separate Québec-directory **1/4 cup (30 g)** serving for an einkorn-flour product and explicitly limited it to that product. | Do not repeat that value or attach it to emmer flour. R800 uses a separate emmer product and source. |
| Proposal/source identifiers | The proposal-local source handle maps to shared `WP02A4-EM-S04`; the accepted observation ID is `emmer-flour-purcell-organic-whole-grain-quarter-cup-45-g-r800-20261019`. | Root integration assigned both identifiers after the ownership audit. |

## Picker and recipe-corpus impact

No active display name, alias, category, form, or ingredient-reference ID changes. The bilingual picker projection therefore remains unchanged: **emmer flour / farine d'amidonnier** continues to identify the same row, and no new search term is introduced. The product’s brand, whole-grain specification, and processing method remain research evidence rather than picker keys.

Parsed all **114** manifest-listed recipes and **1,123** structured ingredient rows. Searches across the manifest-listed corpus for **emmer**, **amidonnier**, **farro**, and **farine d'amidonnier** found no matching recipe ingredient rows. The external Purcell listing creates no bundled-recipe link or edit.

## Integrated data delta

Applied only to the existing **ingredient-ref-emmer-flour** research-ledger record:

| Field | Integrated operation |
|---|---|
| measurementState | Change from **not_yet_researched** to **researched_supported**. |
| Source | Add one source for the Purcell Mountain Farms product page. Use shared ledger source **WP02A4-EM-S04** (proposal-local handle **R800-PURCELL-EMMER-20261019-S01**). Describe it as the current product listing’s published nutrition serving, not a direct weighing or package-photo verification. |
| Measurement observation | Append one **portion_weight** observation with value **45 g**, source quantity **1/4 cup**, observed mass **45 g**, and evidence kind **published_portion**. Identify the food as Purcell Mountain Farms Organic Emmer Flour, whole-grain Unifine product, United States origin. State that cup capacity and fill/level method are unspecified. Use observation ID **emmer-flour-purcell-organic-whole-grain-quarter-cup-45-g-r800-20261019**. |
| Decision | Accept one source-specific amount for the named product. Do not infer a general cup weight, density, mapping, or conversion. |
| Unchanged | Preserve the active reference, French and English names, empty aliases, null density, empty unit mappings, absent forms, and **not_yet_researched** substitution state. Add no recipe link, package yield, form, conversion, or active substitution. |

## Alternative hold considered

If the storefront listing had not been considered sufficient without an accessible package image or independent product-label confirmation, the alternative would have been to hold the amount and leave the row unchanged. The accepted integration instead records the storefront’s published serving with explicit product-specific limits. OQLF and the current Canadian Arva product pages continue to support the existing emmer-flour identity and French terminology, but do not independently support a numerical measure.

## Review checks performed

- Read the live A7 checklist around line 2276 and the completed R797 proposal and integration record; confirmed that R794’s hominy-grits portion and R797’s Khorasan-flour portion are already integrated and distinct.
- Audited the active emmer-flour reference, forms, global and contextual substitution rules, owning ledger row and its sources, adjacent emmer/farro identities, and prior A7 emmer-semolina and farro-boundary proposals.
- Checked exact source-URL ownership for the Purcell listing; no existing ledger owner or prior focused portion review was found.
- Checked the current Purcell product listing, current Arva English and French product pages, and OQLF’s Québec terminology entry online.
- Parsed 114 manifest-listed recipes and 1,123 ingredient rows; found no emmer/farro/amidonnier ingredient match.
- Root integrated the product-specific ledger observation and updated the shared checklist, workflow, roadmap, and batch README. Static package and ledger validation, reference normalization, and generated-index freshness passed; no software tests, build, emulator run, or deployment were needed for this database-JSON-only change under `AGENTS.md`.

