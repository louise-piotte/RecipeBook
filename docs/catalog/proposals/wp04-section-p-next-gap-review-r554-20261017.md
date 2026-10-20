# WP04 Section P R554 — Haddock-loin cut-form boundary review

- **Review and source-access date:** 2026-10-17.
- **Packet:** Finfish cut form, bilingual naming, ownership, picker projection, bundle demand, product amounts, and substitution limits.
- **Status:** Integrated as a documentation-only hold in the [R552–R554 integration README](../batches/wp02-wp03-wp04-r552-r554-gap-review-integration-20261017/README.md). No catalog or ledger row was added.
- **Candidate:** Source-attested Haddock loins / longes d’aiglefin cut form under the existing `ingredient-ref-haddock` reference.
- **Disposition:** **Hold this single-species cut form outside active data for now.** Current Canadian manufacturer and retailer pages establish the named product and a Québec-facing French product title. But a form bearing that source-faithful plural name makes the generic picker queries `loins` and `longes` return Haddock alone. Current High Liner Canada listings also sell Atlantic cod loins, while the active catalog has no loin forms for either species. Singular `loin` and `longe` currently resolve to pork loin chops and would remain pork-only if the Haddock form uses the plural labels. The bundle has no matching Haddock demand.

## Exact open plan anchor and prior-work check

The open finfish parent is [the Section P checklist at plan line 6332](../../RecipeBook-global-ingredient-catalog-plan.txt#L6341): salmon, cod, pollock, halibut, and other fish identities/cuts. Keep that parent open. R554 resolves only whether the Haddock loin cut should be allocated now.

The focused prior-work audit found no active Haddock form, legacy candidate, Haddock-loin ledger record, or earlier Haddock-loin naming/picker decision. The proposed form ID `ingredient-form-haddock-loins` and source prefix `WP04-SECTIONP-HADDOCK-LOINS-R554-20261017-` were unallocated in the reviewed snapshot. Exact searches covered active references/forms, legacy candidates, the research ledger, the Section P plan, proposal and batch archives, and the manifest recipe corpus.

Nearby records address different products or cuts and remain unchanged:

- **R149** adds the separate identity `smoked haddock / aiglefin fumé`; it does not add a raw Haddock loin form.
- **R221** adds species-neutral commercial frozen breaded fish sticks. Its reviewed Metro listing can contain minced pollock or haddock, and the proposal explicitly separates those prepared sticks from raw fish cuts.
- **R224** holds an unqualified frozen tempura-fish product outside active data. It notes a separate tempura-battered Haddock fillet SKU; that batter-coated SKU is not a raw loin cut.
- **R545** adds the distinct Atlantic-halibut steak form. **R548** holds a rainbow-trout fillet form, and **R551** holds Atlantic-halibut cheeks. They establish no general fish-cut form rule and do not allocate Haddock loins.

## Product and bilingual naming boundary

High Liner’s paired Market Cuts pages use **Haddock Loins** and **LONGES D’AIGLEFIN** for the same named product family. The French page describes the loin as a high-quality cut with a flavor and texture distinct from other fillet cuts, hand-cut and selected for uniform portions and even cooking. The English page gives the corresponding product description. These paired language pages support a bilingual market name; they are two routes to one manufacturer product family, not independent products.

High Liner Foodservice Canada provides a more anatomical product definition: a loin is a premium rectangular portion cut from the thickest part of a fillet, generally with consistent thickness. That establishes the manufacturer’s use of a cut term distinct from the whole fillet. It does not establish one universal cut specification, skin/bone state, trim, or portion size for every Haddock seller.

If this form is reopened, the bounded parent would be the existing raw Haddock species identity, not smoked Haddock, a new Haddock identity, or a species-neutral fish-loin identity. The source-backed candidate display is **Haddock loins / longes d’aiglefin**. The active Haddock parent currently displays `haddock / églefin`, with French alias `aiglefin`; the spelling `aiglefin` in the manufacturer product title is retained as product wording, not proposed as a new parent alias. Do not extend the product phrase into a generic `loin(s)`, `longe(s)`, `fish loin`, or `longe de poisson` alias.

Current manufacturer descriptions and the Food Basics listing include particular frozen/boneless or water-and-phosphate-treated SKUs. Those details are not made attributes of a reusable loin form: the High Liner retail page does not itself declare a frozen state, the Food Basics page is a store-specific Canadian listing, and the foodservice Haddock SKU has a different product code and ingredient declaration. R554 makes no claim that every Haddock loin is frozen, boneless, vacuum sealed, phosphate-treated, or sold in a particular package.

## Current catalog, ledger, and source-ID ownership

The review snapshot after R549–R551 contains **1,805 active ingredient references**, **148 forms**, **56 legacy candidates**, and **2,168 ledger records**. The ledger has **10,011 source entries, 8,458 distinct source IDs, and 7,142 distinct URLs**. The bundled manifest covers **114 recipes and 1,123 ingredient rows**.

| Current record | Ownership and state relevant to R554 |
|---|---|
| `ingredient-ref-haddock` | Active `PROTEIN` identity displayed as `haddock / églefin`, French alias `aiglefin`, no English alias, null default density, and empty unit mappings. No form is attached. Its identity ledger record is verified; measurement and substitution states remain `not_yet_researched`. |
| `ingredient-ref-smoked-haddock` | Separate verified identity `smoked haddock / aiglefin fumé`, with no form. Its existing product-state research does not own a raw Haddock cut. |
| `ingredient-ref-atlantic-cod` | Active species-qualified Atlantic cod identity with no loin form. High Liner’s current Atlantic-cod-loin listing is an example of a sibling fish product using the same cut word. |
| `ingredient-ref-pork-loin-chops` | Existing English display `boneless pork loin chops` and French display `côtelettes de longe de porc désossées`. Its exact `loin` and `longe` terms currently own the singular generic searches described below. |

No active record or prior proposal allocates `ingredient-form-haddock-loins`; no legacy candidate matches the Haddock-loin phrase. The exact URLs for the new High Liner Market Cuts English/French pages, the High Liner Foodservice Haddock and Atlantic-cod pages, and the Food Basics SKU were absent from the current ledger. The new R554 source IDs below are proposal-local because this recommendation does not add ledger rows. Reuse existing identity sources rather than assigning duplicate ownership: `WP04-FINFISH-ID-20261009-S03` is the OQLF Haddock/églefin identity entry; `WP04-FINFISH-ID-20261009-S06` is CFIA fish-name guidance; and `WP04-FINFISH-ID-20261009-S08` is the CFIA Fish List query for Haddock. Those sources establish naming/identity only, not a loin cut.

## Picker projection and bilingual scope

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It first returns references with a complete normalized word phrase in their names, aliases, or attached form labels. Only if that global phrase search has no results does it use substring fallback. A form remains attached to its parent reference; the form hint is displayed only when the complete form label is explicit in the query.

The hypothetical form uses only the source-attested bilingual labels above, with no match terms or parent aliases. Under that projection:

| Query | Current picker | With hypothetical Haddock form | Resulting boundary |
|---|---|---|---|
| `Haddock loins` | No result | Haddock parent; exact form hint | The species-qualified English product phrase becomes selectable. |
| `longes d’aiglefin` | No result | Haddock parent; exact form hint | The French manufacturer title becomes selectable. |
| `Haddock loin` | No result | Haddock parent by substring fallback; no exact form hint | Singular English spelling happens to match the plural English label. |
| `longe d’aiglefin` | No result | No result | The plural French label does not match the singular phrase under this matcher. No unsupported singular alias is proposed to patch it. |
| `loins`; `longes` | No result | Haddock parent alone for each plural query | The cut name creates a new single-species result for both bare plural cut searches. |
| `loin`; `longe` | Boneless pork loin chops for each singular query | Same pork result only | Existing exact-phrase matches stop substring fallback, so plural Haddock labels do not join the singular results. The picker would become asymmetric across number in both languages. |
| `haddock`; `aiglefin` | Haddock and smoked Haddock | Same two results | Existing broad species wording remains multi-result. |
| `fillet`; `filet` | Seven and two results, respectively | Same results | The loin label adds neither `fillet` nor `filet`; existing broad fillet queries are unchanged. |
| `fish loin`; `longe de poisson` | No result | No result | No generic fish-loin identity or alias is introduced. |

The singular/plural effect is material: the exact product labels improve species-qualified searches, but their unavoidable plural cut words return Haddock as the only result. That result is incomplete against the current High Liner Atlantic-cod-loin product, whose parent is already active. The same picker would continue to return pork alone for the singular cut words, even though the manufacturer also uses singular `loin` and `longe` in its serving descriptions. Adding plural match terms to a singular label would not solve this: complete phrase matching would still make bare `loins` and `longes` Haddock-only. Do not create more aliases or match terms to work around a scope limitation the current model cannot represent cleanly.

## Bundle demand, package quantities, and measurement limits

All **114 manifest-listed recipe files** were searched across complete recipe documents for Haddock/aiglefin and Haddock-loin/longes d’aiglefin wording; the scan found **no matching file**. The bundle has no recipe line, amount, role, preparation, or species-qualified demand that requires this cut. External retail and foodservice listings establish market presence, not bundled demand.

The current product sources show deliberately non-interchangeable amount examples:

- High Liner Market Cuts lists a **227 g retail package** and nutrition for **about 1 loin (113 g)**. The matching English and French pages are one product family. Treat 113 g as that page’s approximate nutrition serving, not a standard loin mass, declared count-per-pack, or household measure.
- High Liner Foodservice’s **4.54 kg / 10 lb** individually quick-frozen Haddock SKU identifies an approximate **57 g / 2 oz** piece and nutrition for **about 2 loins (114 g)**. The product code, frozen state, portion size, and case details belong to this foodservice SKU; the page does not provide a general count-to-weight rule for other Haddock products.
- High Liner Foodservice separately lists **Atlantic cod loins**, with one product page describing about **1 loin (113 g)**. It is a distinct species and SKU, and its value does not turn 113 g into a generic fish-loin measure.
- Food Basics lists a **227 g Frozen Boneless Haddock, Market Cuts** product (number `061763038402`) whose ingredient statement says `haddock loins, water, sodium phosphate`. The selected page store was Sault Ste. Marie, Ontario; it does not establish Québec stock. Its ingredient and package statement is SKU-specific and does not establish the universal composition or availability of Haddock loins.

These examples do not support a generic count-to-mass mapping, cup or volume measure, density, unit conversion, package yield, edible yield, or cooking yield. Keep the parent’s density and mappings unchanged. Do not transfer the retail 113 g nutrition serving to the 57 g foodservice portions or other Haddock products. The manufacturer’s product-specific cooking directions likewise do not become general Haddock-loin cooking rules.

## Substitution boundary

No reviewed source or bundled recipe validates replacing a Haddock loin with a whole Haddock fillet, another Haddock cut, Atlantic cod loin, or another fish in a specified amount, recipe role, and method. High Liner’s comparison of loin quality with other fillet cuts is product marketing, not a tested culinary interchangeability rule. The anatomical statement that a loin is cut from the thickest part of a fillet does not establish an equal-weight, equal-time, or yield-preserving substitution. Add no global form conversion, contextual substitution, warning, or recipe-line substitution link.

## Bounded recommendation and integration delta

**Hold only the proposed Haddock-loin form outside active references, forms, and the shared research ledger.** If root accepts this review, add one checked child under the still-open Section P finfish parent recording the hold, with a short reason that the exact plural labels would make generic `loins` and `longes` return Haddock alone despite current Atlantic-cod-loin products, and that the bundle has no Haddock demand. Keep the broader parent open.

Do not add `ingredient-form-haddock-loins`, a new ingredient identity, parent alias, form match term, measurement observation, density, unit mapping, conversion, package yield, recipe link, or substitution. Leave the Haddock identity ledger’s `measurementState` and `substitutionResearchState` unchanged: the SKU observations are too narrow to settle species-wide research. Revisit the cut only when picker behavior can represent multiple species for the generic cut query, or a specific imported/bundled recipe creates a species-qualified need with its form scope handled.

## Sources and limits

Sources were accessed on 2026-10-17. Existing identity sources are reused by ID; R554 product-source IDs remain proposal-local.

| Source ID | Source | Evidence and exact limits |
|---|---|---|
| **Reused `WP04-FINFISH-ID-20261009-S03`** | OQLF, [églefin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199838/eglefin). | Existing Haddock/églefin identity and Québec terminology source. It does not define a loin cut, current product, serving, or substitution. |
| **Reused `WP04-FINFISH-ID-20261009-S06` and `WP04-FINFISH-ID-20261009-S08`** | CFIA, [Common names for fish and seafood](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) and the existing [Fish List Haddock query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Haddock). | Reuse the already-owned Canadian species-label evidence. These sources do not establish the loin product, product state, measure, or substitution. |
| `WP04-SECTIONP-HADDOCK-LOINS-R554-20261017-S01` | High Liner, [Longes d’aiglefin, Coupes du marché](https://www.highliner.com/fr/products/market-cuts/market-cuts-haddock-loins). | Uses the exact French title `LONGES D’AIGLEFIN`, says the cut is distinct from other fillet cuts and selected for uniform portions, gives 227 g product details and nutrition for about one 113 g loin, and lists Haddock, water, sodium phosphate. Manufacturer page; its 113 g is approximate nutrition-serving context, not a universal portion or measure. The page does not declare a frozen state. |
| `WP04-SECTIONP-HADDOCK-LOINS-R554-20261017-S02` | High Liner, [Haddock Loins, Market Cuts](https://www.highliner.com/products/market-cuts/market-cuts-haddock-loins). | Paired English-language route to S01 and same product family, with the corresponding English name and product facts. It is not independent product evidence; no universal product state or portion specification follows. |
| `WP04-SECTIONP-HADDOCK-LOINS-R554-20261017-S03` | High Liner Foodservice Canada, [Individually Quick Frozen Haddock Loins, approx. 57 g / 2 oz](https://www.highlinerfoodservice.com/en-CA/products/haddock/2c67d10e-e6d6-4f5b-bfc5-8334903ef7ff/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-haddock-loins-approx-57-g-2-oz). | Defines a loin as a rectangular premium portion cut from the thickest part of a fillet; lists a 4.54 kg / 10 lb foodservice SKU, approx. 57 g / 2 oz, and nutrition for about two loins (114 g). The page specifies this product only, not a universal cut standard, count per case, household measure, or conversion. |
| `WP04-SECTIONP-HADDOCK-LOINS-R554-20261017-S04` | High Liner Foodservice Canada, [Individually Quick Frozen Atlantic Cod Loins, approx. 113 g / 4 oz](https://www.highlinerfoodservice.com/en-CA/products/atlantic/9ca8c00f-aeba-4fec-a92a-38437e991bb8/high-liner-foodservice-signature-454-kg-10-lb-individually-quick-frozen-atlantic-cod-loins-approx-113-g-4-oz). | Current manufacturer listing for Atlantic cod loin portions, including its own about-one-loin (113 g) serving. Shows a sibling species/SKU that uses the same cut name; does not support a shared Haddock/Cod measure or substitution. |
| `WP04-SECTIONP-HADDOCK-LOINS-R554-20261017-S05` | Food Basics, [Frozen Boneless Haddock, Market Cuts](https://www.foodbasics.ca/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-boneless-haddock/p/061763038402), product `061763038402`. | Current retailer page lists 227 g and `haddock loins, water, sodium phosphate`. Its selected store was Sault Ste. Marie, Ontario, so it does not establish Québec availability; retailer product information may change and is SKU-specific. |
| **R01 — repository audit** | Current references/forms, legacy candidates, research ledger, plan, proposal/batch archive, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and all manifest-listed recipes. | Workspace snapshot on 2026-10-17. Confirms current ownership, source-ID and URL ownership, simulated picker projection, and no Haddock-loin bundle matches. No shared project file was edited. |
