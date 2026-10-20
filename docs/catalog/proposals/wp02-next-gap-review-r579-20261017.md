# WP02 Section A4 — dark rye flour identity and label evidence review (R579) — 2026-10-17

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated as a market-grade identity with one limited product-label observation; see the [R579 integration README](../batches/wp02-r579-dark-rye-flour-identity-integration-20261017/README.md).
- **Scope:** One open rye milling-grade boundary: dark rye flour. This is a follow-up to the earlier hold and the Rogers label lead explicitly excluded from R569; it does not reopen R569's generic rye-flour observation or the already integrated light, medium, whole, malted, or meal identities.
- **Exact plan anchor:** The open WP02 Section A4 parent is at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658). The current plan keeps broad dark rye unresolved in the medium-rye note at [lines 1724–1730](../../RecipeBook-global-ingredient-catalog-plan.txt#L1724). R569 explicitly separated the Rogers label portion from generic rye flour at [the excluded-source note](wp02-next-gap-review-r569-20261017.md#L53).

## Bounded recommendation

**Add `dark rye flour / farine de seigle foncée` as an identity-only, market-grade `FLOUR_AND_STARCH` reference, with no aliases.** TERMIUM gives the exact English/French pair, and Mayrand currently lists a Québec product under the French name. Treat the catalog identity as the named market grade, not as a process-defined or composition-universal class; the medium-rye identity is likewise a named market grade without universal milling thresholds. The sources support a searchable product grade, but do not establish one universal extraction, bran, germ, or whole-grain specification. Preserve that limit in the identity decision and keep the broader A4 rye parent open.

The integration records Save-On's published **1/4 cup (30 g)** only as a portion observation for the Rogers retail 2.5 kg product. Rogers announced that this retail bag was discontinued in January 2026 and that residual stock would be sold while supplies lasted. Do not transfer the portion to generic rye flour, other dark-rye products, or an active cup conversion.

Rogers's November 2025 newsletter explicitly suggests using a 20–40% portion of its dark rye to add colour and flavour and later suggests blending 25–50% rye with bread flour for a lighter loaf. Keep those two manufacturer recommendations source-specific. The newsletter does not provide a tested, fully specified formula or a clear common percentage basis, and the two ranges address different claims. Do not encode either as a reusable substitution ratio or active rule.

## Catalog and ledger audit

The current split package has **1,805 ingredient references**, **154 forms**, and a manifest of **114 recipes**. The exact proposed ID `ingredient-ref-dark-rye-flour` is absent from active references, forms, and ledger records; the bundled seed JSON contains no dark-rye phrase owner. Existing ownership remains:

| Current owner | Identity and boundaries | R579 treatment |
|---|---|---|
| `ingredient-ref-rye-flour` | `rye flour / farine de seigle`; no aliases. Its ledger already has R569's AGROBIO 1/4 cup (30 g) observation and the no-general-wheat-replacement finding. | Leave unchanged. Do not attach the Rogers measure to this generic row. |
| `ingredient-ref-light-rye-flour` | `light rye flour / farine de seigle claire`; owns the white/light French aliases. | Keep the dark phrase off this row. |
| `ingredient-ref-medium-rye-flour` | `medium rye flour / farine de seigle moyenne`; has its own source-specific USDA observation and no active rule. | Keep separate. |
| `ingredient-ref-whole-rye-flour` | `whole rye flour / farine entière de seigle`; aliases include `complete rye flour`, `whole grain rye flour`, and `farine de seigle entière`. | Do not make `dark rye` or `farine de seigle foncée` an alias. A supplier's dark product may be whole-grain, but that relationship is not universal. |
| `ingredient-ref-malted-rye-flour` | `malted rye flour / farine de seigle malté`. | Keep malted rye separate from dark rye. |
| `ingredient-ref-rye-meal` | `rye meal / gruau de seigle`; owns coarse/pumpernickel flour and meal aliases, including `farine à pumpernickel`. | Do not transfer pumpernickel wording to the proposed row. |
| `ingredient-ref-rye-bran` | `rye bran / son de seigle`; owns existing Save-On source ID `WP03-RYE-BRAN-20261013-R58-S07`. That source records the Rogers label's combined 1/4 cup (30 g) serving but correctly says the amount cannot be assigned to the bran component. | The dark-rye row reuses this existing source ID for a whole-product serving observation; no second ID was created for the same Save-On URL. The bran record's no-bran-measure finding remains intact. |

No rye form, dark-rye package-yield entry, rye-linked global/contextual substitution rule, or rye unit conversion is present. All current rye-flour references have null `defaultDensity` and empty `unitMappings`. The proposed data delta does not add a form, yield, density, unit mapping, or conversion.

## Bilingual naming and picker projection

TERMIUM's milling and breadmaking record marks **dark rye flour / farine de seigle foncée** correct. Its definition calls the item a coarse flour ground from whole rye; its own French context cautions that dark rye is **often, but not always, whole-grain**. The wording supports a product-grade name, not an equivalence to `whole rye flour`.

Mayrand's Québec listing names R.Fortin's 5 kg product **Farine de seigle foncée**. It supports local market usage for that SKU; the listing gives no milling process. Rogers's English product page names its separate retail product **Dark Rye Flour**. No Rogers product-matched French label was found, so do not imply that Mayrand's R.Fortin item and Rogers's discontinued bag share milling specifications.

Proposed fields:

| Field | Proposed value |
|---|---|
| Stable ID | `ingredient-ref-dark-rye-flour` |
| English display | `dark rye flour` |
| Québec French display | `farine de seigle foncée` |
| Category | `FLOUR_AND_STARCH` |
| Aliases | None |

Keep `dark rye`, `dark rye meal`, `pumpernickel flour`, `whole grain rye flour`, `farine de seigle entière`, and `farine à pumpernickel` off this row. Do not put the dark product name on the generic, whole-rye, light-rye, medium-rye, or meal references.

The current phrase-first picker projection has no result for `dark rye`, `dark rye flour`, or `farine de seigle foncée`. `rye flour` and `farine de seigle` each return five existing rye-flour references; adding the row would make six. Broad `rye` and `seigle` each return eleven current rye references and would gain the new grade. These are expected family-query expansions; exact qualified queries would select the new grade. The phrase search and alias behavior are implemented in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). No runtime picker code change is proposed.

## Bundle demand

I scanned every manifest-listed recipe file and all **1,123 structured ingredient rows** for `dark rye`, `dark rye flour`, `farine de seigle foncée` (accented and folded), `Rogers Rye Flour`, and direct `ingredientRefId` matches. No recipe file, ingredient row, or direct link matched. No recipe relink, recipe text change, recipe-specific measure, or recipe-level substitution is supported.

## Measurement, density, and substitution limits

### Rogers package portion

The Save-On listing for Rogers's 2.5 kg `Rogers Rye Flour` product (product number `00060179030215`) prints **1/4 cup (30 g)** and lists rye flour and rye bran as ingredients. Rogers's current retail page says its **Dark Rye 2.5 kg** retail bag was discontinued on 2026-01-13, with residual store inventory available only while supplies last. This match is by maker and package size; the retailer title omits “dark,” and the manufacturer page does not show the retailer's product number. Treat the observation as a named-product label report with that linkage limit, not a universal dark-rye measure.

The integrated ledger records one `portion_weight` observation on `ingredient-ref-dark-rye-flour`: `sourceQuantity: { amount: 0.25, unit: "cup" }`, `observedMassG: 30`, and `evidenceKind: "published_portion"`, with the Save-On listing and Rogers product page as sources. It states that no physical package was inspected, the listing may not exactly match the manufacturer SKU, and no filling/leveling method is given. No 120 g/cup conversion or density was derived, and the number was not assigned to rye bran. The printed 2.5 kg is package size, not package yield.

Rogers's separate [commercial 20 kg `Dark Rye` page](https://rogersfoods.com/shop/commercial-products/specialty-flour/dark-rye/) is discontinued and describes a coarse flour with commercial specification fields. It is not the 2.5 kg retail package; no commercial moisture, ash, protein, or application figures are transferred to the retail label or to the new row.

### Wheat replacement

Rogers's newsletter includes broad product-use suggestions for its own flour: one statement gives a 20–40% portion for colour/flavour, and a later bread suggestion gives 25–50% rye with bread flour for a lighter loaf. These are explicitly manufacturer recommendations, not controlled recipe results. The newsletter does not document a full tested formula, ingredient role, common denominator or percentage basis, flour handling, hydration, fermentation, or expected range of outcomes. Its advice is limited to this Rogers product and cannot define a general dark-rye substitution.

The new row's substitution research state is `researched_no_supported_substitute` **for a reusable home-recipe replacement rule**, with the two Rogers recommendations preserved in the finding basis and limitations. No `replacements` array, global or contextual rule, or recipe-line substitution was added. The current product is discontinued, the bundle has no dark-rye demand, and the available recommendations do not establish scope and safeguards for a reusable rule.

## Source-ID ownership and evidence register

The proposed R579 IDs below were not found in the current ledger. Existing source IDs are reused for their existing sources rather than duplicated. A source may be cited on more than one record when the same page directly supports each bounded claim; its present owner is shown here.

| Source ID and current owner | Source / locator | Evidence and limit |
|---|---|---|
| New `WP02-A4-DARK-RYE-R579-20261017-S01` | Government of Canada Translation Bureau, [TERMIUM Plus, dark rye flour](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=3&i=&index=esb&lang=fra&sg_kp_wet=1904574&srchtxt=HARINA+CENTENO+OSCURO), Milling and Cereal Industries / Breadmaking, fiche dated 2012-01-11. | Marks `dark rye flour / farine de seigle foncée` correct. The entry's whole-kernel definition is qualified by its own French context: dark rye is often, but not always, whole-grain. Historical terminology record, not a current product specification. URL and source ID are new to the ledger. |
| Existing `WP02-AB-RESIDUAL-COVERAGE-20261011-S16`, currently on `ingredient-ref-light-rye-flour` | Mayrand, [Farine de seigle foncée 5 kg](https://mayrand.ca/fr/nos-produits/epicerie/farine-semoule-et-chapelure/farine-de-specialite/farine-de-seigle-foncee-13726), R.Fortin listing. | Reuse for the exact Québec French product title. Re-opened during R579; supports this listed SKU, not a shared process or equivalence to Rogers. Do not create a duplicate source ID or URL record. |
| New `WP02-A4-DARK-RYE-R579-20261017-S02` | Rogers Foods, [Dark Rye Flour 2.5 kg retail page](https://rogersfoods.com/shop/retail-products/dark-rye-flour/), product description and discontinuation notice. | Names Rogers's retail product and intended rye-bread/baked-product uses; says the 2.5 kg retail bag was discontinued effective 2026-01-13 and remaining inventory would not be replenished. Manufacturer, product-specific. |
| Existing `WP03-RYE-BRAN-20261013-R58-S07`, currently on `ingredient-ref-rye-bran` | Save-On Foods, [Rogers Rye Flour 2.5 kg](https://www.saveonfoods.com/sm/pickup/rsid/2220/product/rogers-rogers-rye-flour-id-00060179030215), ingredient list and Nutrition Facts panel. | Reuse for the retailer's 1/4 cup (30 g) label statement and rye flour/bran ingredient list. The panel is for the combined product, not the bran fraction. Save-On warns that its listing information may be inaccurate; no physical bag was inspected. No new Save-On source ID is proposed. |
| New `WP02-A4-DARK-RYE-R579-20261017-S03` | Rogers Foods, [November 2025 newsletter](https://rogersfoods.com/wp-content/uploads/2025/11/Rogers-Foods-Newsletter-November-2025-1.pdf), pp. 17–18, “Rogers Foods Dark Rye Flour (Whole Grain Rye).” | Manufacturer describes this product as milled from the whole rye berry, including bran and germ, and gives the two broad percentage suggestions summarized above. Product-specific marketing guidance; no tested full formula, universal dark-rye specification, or validated replacement rule. URL is new to the ledger. |
| Existing `WP02-MED-DARK-RYE-BOUNDARY-20261011-S04`, currently on `ingredient-ref-medium-rye-flour` | Ardent Mills, [Rye Flour / Pumpernickel Flour: White, Medium & Dark](https://www.ardentmills.com/products/alternative-grains/additional-gluten-free-flours-grains-seeds/rye/), current product-family description. | Reuse as evidence that Ardent describes medium/dark as containing more bran than white and separately identifies pumpernickel rye meal as whole rye flour. It does not establish that all dark rye is whole grain or a shared grade threshold. |
| Reused by reference only: `WP02A4-S01`, currently on `ingredient-ref-rye-flour` | OQLF, [farine de seigle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489069/farine-de-seigle), GDT. | Retain as the Québec base term `farine de seigle / rye flour`; it is not evidence for the full dark-grade compound. Do not duplicate the existing source entry. |

No new source ID is proposed for the existing Mayrand, Save-On, Ardent, or OQLF URLs. The current source ownership and cross-record reuse are called out above so root can keep a single ID per source page.

## Integrated delta

| Target | Integrated delta |
|---|---|
| Ingredient reference | Added identity-only `ingredient-ref-dark-rye-flour`, `dark rye flour / farine de seigle foncée`, category `FLOUR_AND_STARCH`; aliases `[]`; `defaultDensity: null`; `unitMappings: []`. |
| Ledger record | Added `ingredient-ref-dark-rye-flour` as an `ingredient_reference` record with `identityState: verified`, `measurementState: researched_supported` (one product-specific label portion), and `substitutionResearchState: researched_no_supported_substitute` for a reusable home-recipe rule. |
| Ledger sources | Added three new R579 sources to the new row and reused the existing Mayrand, Save-On, and Ardent source IDs without duplicating IDs or URLs. The OQLF source remains on the generic rye-flour record and is used as terminology context only. |
| Measurement | Added observation `dark-rye-flour-rogers-label-portion-r579-20261017`: `portion_weight`, 1/4 cup = 30 g as a published product-label portion, with the linkage/method limits above. Its sources are the existing Save-On ID `WP03-RYE-BRAN-20261013-R58-S07` and the new Rogers product page. No reusable measure or density was added. |
| Substitution research | Added finding `dark-rye-flour-no-general-wheat-replacement-r579-20261017`, state `researched_no_supported_substitute`, scoped to a reusable home-recipe replacement rule. Preserved Rogers's 20–40% and 25–50% manufacturer recommendations in the basis/limitations; added no `replacements` array or active rule. |
| Forms, mappings, yields, conversions, recipe links | Left unchanged. |
| Parent plan | Added this bounded child under the open rye-grade parent; the wider A4 parent remains open. |

## Local review checks

- Rechecked current active reference and form ownership, ledger records/source URLs, and all exact candidate IDs. No dark-rye row, form, ledger candidate, source-ID collision, observation-ID collision, finding-ID collision, or R579 source-ID collision exists.
- Recomputed the current picker phrase projection from the live bilingual reference terms; verified the current and proposed query result counts above. No app behavior or code was changed.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; found no dark-rye demand or direct link.
- Root integrated the identity, source-specific observation, and no-general-replacement finding in the canonical data and updated the plan and roadmap. The broader A4 parent remains open. No app tests, build, emulator, or deployment were run for this database-data change under `AGENTS.md`.
