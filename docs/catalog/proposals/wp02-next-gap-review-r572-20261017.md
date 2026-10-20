# WP02 A4 pearled-grain barley-flour portion and identity boundary review — R572 — 2026-10-17

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17. Root completed the shared-file integration.
- **Scope:** Reviewed flour milled from pearled barley as a source-grain grade under the still-open A4 barley-flour parent. Integrated one source-specific published portion on the existing generic barley-flour ledger record. No separate pearled-barley-flour identity or alias was created.
- **Exact plan anchor:** The open WP02 Section A4 parent at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658) still includes “remaining barley flour grades.” The existing generic barley-flour identity is checked off at [line 1743](../../RecipeBook-global-ingredient-catalog-plan.txt#L1743). This review is limited to the pearled-grain source and its published portion; it does not repeat R281’s whole-barley-flour measurement/substitution review or close the broader A4 parent.

## Bounded recommendation

**Keep pearled-grain barley flour within the existing generic barley-flour identity and record the GoBarley 1/4-cup (37 g) table entry as a source-specific observation on that row. Do not add an identity, alias, reusable conversion, density, or substitution rule.**

GoBarley explicitly says barley flour may be milled from either pearled barley or whole, dehulled barley. Its Table 1 lists barley flour at 1/4 cup (37 g) and footnotes that entry “made from pearled barley.” A current Canadian product listing likewise titles the product simply “Barley Flour, Organic” while describing it as stone-ground from pearled barley. This supports an observation qualified to the source’s pearled-grain flour entry; it does not establish a stable separately named retail or Québec French class.

If integrated, append one published-portion observation to the existing generic ledger record, citing the already registered GoBarley source ID. Keep the broad picker query and identity unchanged. Do not multiply the source portion into a cup conversion, merge it with the older USDA one-cup observation, average the values, or set defaultDensity. GoBarley does not identify a commercial SKU, exact USDA table row/release, cup standard, flour fill method, or direct weighing procedure.

## Existing owner and source-ID audit

The active reference is ingredient-ref-barley-flour: barley flour / farine d'orge, category FLOUR_AND_STARCH, English alias jau atta, no French aliases, defaultDensity null, and unitMappings empty. The matching ledger record has identityState verified, measurementState researched_supported, and substitutionResearchState blocked_pending_evidence. It already contains a historical USDA one-cup unsifted portion observation and one experimental 0.44 g/mL barley-flour sample observation; neither is a measure for a specified pearled-barley product. The generic row has no attached form, package yield, or substitution rule.

The distinct ingredient-ref-whole-barley-flour row is whole barley flour / farine d'orge entière. It remains separate and identity-only. R281 cited the same GoBarley page as WP02-A4-WBF-R281-20261016-S04 on that whole-barley record to explain why its pearled-grain portion could not be transferred to whole barley flour. Reuse that existing source ID for the new generic-row observation; do not mint a second ID or duplicate the URL. Cross-record source-ID reuse already occurs in R281 for evidence owned by the generic barley-flour record.

| Source / ID | Current ownership and bounded use |
|---|---|
| WP02A4-BF-S01 | Existing generic barley-flour ledger source: OQLF’s preferred Québec pair farine d'orge / barley flour. It does not define a pearled-flour term or milling threshold. Reuse for the base name only. |
| WP02-A6-JAU-ATTA-BARLEY-20261012-S06 | Existing generic barley-flour source: USDA 1977–78 one-cup unsifted portion. Keep it as its own historical observation; do not reconcile or replace it with the GoBarley table. |
| WP02-A6-JAU-ATTA-BARLEY-20261012-S07 | Existing generic barley-flour source: 0.44 g/mL experimental sample. It is not a default density or a measure for pearled-grain flour. |
| WP02-A4-WBF-R281-20261016-S04 | Existing GoBarley page, currently registered on ingredient-ref-whole-barley-flour. Reuse for the exact 37 g table entry and pearled-grain footnote; no new source ID or duplicate URL. |
| WP02-A4-PBF-R572-20261017-S01 | Added to the existing generic barley-flour ledger row during integration. SLO Foods / Buying Club BC product listing for Barley Flour, Organic, described as stone-ground from pearled barley. |
| WP02-A4-PBF-R572-20261017-S02 | Added to the existing generic barley-flour ledger row during integration. Mayrand’s current English page for Millbrooke Barley Flour 10 kg, SKU 10474 / UPC 577360815518. Supports a current Québec retail name, not the product’s milling grain. |
| WP02-A4-PBF-R572-20261017-S03 | Added to the existing generic barley-flour ledger row during integration. Mayrand’s French page for the same Millbrooke item, Farine d'orge 10 kg, SKU 10474 / UPC 577360815518. Supports local French product wording, not a pearled-grain specification. |

Before integration, the proposed observation ID barley-flour-pearled-gobarley-portion-r572-20261017 was not found in the current ledger; it is now recorded on the generic barley-flour ledger row. No pearled-barley-flour candidate or prior proposal assigning that identity was found. R281 already reviewed the GoBarley page for whole barley flour, but did not record its pearled-grain portion on the generic barley-flour row; this is the distinct target here.

## Bilingual names and picker projection

Keep the accepted canonical names barley flour / farine d'orge and the existing English alias jau atta. The OQLF term and current Mayrand bilingual listing support the general Québec name. The Mayrand product page uses Barley Flour / Farine d'orge without a pearled qualifier; it does not disclose whether Millbrooke flour is from pearled barley. SLO’s listing names its product Barley Flour, Organic, and only its description specifies pearled grain. Neither source uses pearled barley flour as a product title or supplies a Québec French equivalent. Do not construct farine d'orge perlée or add either phrase as a catalog alias from these pages.

The current IngredientSearch.kt projection is phrase-first with substring fallback. Simulating it over the active reference names and aliases gives:

| Query | Current result |
|---|---|
| barley flour | 4: generic, malted, roasted, and whole barley flour |
| farine d'orge | 4: generic, malted, roasted, and whole barley flour |
| pearled barley flour | 0 |
| farine d'orge perlée | 0 |
| pearled barley | 0 |
| pearl barley | 1: pearl barley / orge perlé |
| jau atta | 1: generic barley flour / farine d'orge |

No reference name, alias, or form term is proposed, so picker results remain unchanged. In particular, adding pearled barley flour as a generic-row alias would make the phrase-first search for the shorter query pearled barley return flour alone, even though a user could mean the active pearl-barley grain. The source evidence is not sufficient to justify that query ownership or a separate display row.

## Bundled recipe demand

Parsed all **114 manifest-listed recipes** and **1,123 structured ingredient rows**. Case-insensitive scans of full recipe JSON and ingredient fields for barley flour, whole barley flour, pearled barley flour, pearled barley, farine d'orge, farine d'orge perlée, pearl barley, orge perlé, jau atta, and the generic/whole barley-flour reference IDs found **zero matching files, zero matching ingredient rows, and zero direct links**. There is no bundled recipe demand, amount, role, or method that would justify a grade-specific alias or substitution.

## Measurement, density, conversion, and substitution limits

GoBarley’s current public Health & Nutrition page says barley flour can be milled from pearled barley or whole, dehulled barley. Table 1 lists barley flour as 1/4 cup (37 g), with the note “Made from pearled barley”; the table is marked “Adapted from the U.S. Department of Agriculture.” The page does not name a product or exact USDA food code/release for that table value, and gives no cup convention, fill/level method, or direct measurement protocol. Record only the exact printed observation. Do not infer a volume in millilitres, cup density, a general measure, a current SKU label portion, or equivalence with whole barley flour.

SLO Foods’ Canadian listing titles a current product “Barley Flour, Organic,” states that it is 100% stone-ground from pearled barley, and lists 400 g and 1 kg options. It is product-page evidence from the seller listing, not a milling standard or Quebec French name; package mass is not a recipe measure. Mayrand currently lists a 10 kg Millbrooke item as Barley Flour / Farine d'orge, but does not state its source grain. The live Québec pages therefore support the generic bilingual display while leaving product-specific grain sourcing unstated for that SKU.

The generic row already carries a USDA 1977–78 one-cup unsifted observation and a separate laboratory bulk-density observation. Their scope and methods do not match the GoBarley table. Keep all three as independent source-specific evidence; do not scale 37 g by four, convert it to a 1-cup value, treat it as a correction to the historical value, or derive density from either observation. Keep defaultDensity null and unitMappings empty.

GoBarley says flour from either pearled or whole, dehulled barley can be a complete or partial wheat-flour replacement, but gives no amount or recipe method. The generic-row substitution finding already blocks an unscoped replacement rule based on formula-specific studies. R572 changes neither that finding nor the substitutionResearchState; add no global or contextual substitution, preferred alternative, form conversion, or recipe-line link.

## Integrated ledger delta

Updated only the existing ingredient-ref-barley-flour research-ledger record:

| Field | Integrated value |
|---|---|
| Sources | Added S01–S03 for the pearled-grain product boundary and current Québec naming evidence. Reuse WP02-A4-WBF-R281-20261016-S04 as the GoBarley source for this cross-record observation; do not add a duplicate URL or new source ID. |
| Decision | Added an accepted decision to keep flour described as milled from pearled barley within the generic barley-flour identity. The Canadian listings use the unqualified display Barley Flour / Farine d'orge, and no source establishes a stable, separate Québec French class name. Cite S01–S03 and existing WP02A4-BF-S01. |
| Measurement state | Keep researched_supported. |
| Observation ID | barley-flour-pearled-gobarley-portion-r572-20261017. |
| Observation | relationship portion_weight; value 37; valueUnit g; observedMassG 37; sourceQuantity { amount: 0.25, unit: cup }; evidenceKind published_portion. |
| Observation context | foodDescription: GoBarley Table 1 barley flour entry, footnoted “Made from pearled barley”; foodState: dry flour attributed by that table to pearled-barley input; measurementMethod: published nutrition-table portion adapted from USDA, with no exact USDA item, cup standard, fill method, or direct weighing reported; quantityBasis: one source-specific published portion only, not a transferable volume-to-mass mapping or a retail SKU label. |
| Observation sourceIds | Existing WP02-A4-WBF-R281-20261016-S04 only. |
| Substitution state / finding | Keep the existing blocked_pending_evidence state and finding unchanged. Do not activate a ratio or rule from GoBarley’s qualitative complete/partial-use statement. |
| Active reference | Unchanged: nameEn barley flour, nameFr farine d'orge, aliasEn jau atta, aliasFr empty, defaultDensity null, unitMappings empty. |
| Forms, global/contextual rules, package yields, recipes | No changes. |

The A4 parent at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658) remains open for other barley grades, rye, oat, and rice work.

## Source register

Sources were accessed on 2026-10-17. R572 source IDs S01–S03 are now recorded on the generic barley-flour row. GoBarley source S04 is reused from R281 without a duplicate ID or URL entry elsewhere on the same row.

| Source ID | Source and locator | Supports and exact limits |
|---|---|---|
| Reused WP02-A4-WBF-R281-20261016-S04 | GoBarley, [Health & Nutrition](https://gobarley.com/health-nutrition/), paragraph on barley-flour milling and Table 1, footnote 3. | Says barley flour may be milled from pearled or whole, dehulled barley. Table 1 prints 1/4 cup (37 g) and footnotes the flour as made from pearled barley; table is adapted from USDA. No exact USDA row/release, product SKU, cup convention, or fill method is given. The source ID remains registered on the whole-barley-flour record and is reused without duplication. |
| WP02-A4-PBF-R572-20261017-S01 | SLO Foods / Buying Club BC, [Barley Flour, Organic](https://buyingclubbc.com/product/barley-flour-5-kg-organic/), product description and sizes. | Listing says 100% stone ground from pearled barley and gives 400 g / 1 kg options. Product title is unqualified Barley Flour, Organic. Seller listing; no exact Québec French label, standardized class, household measure, or substitution amount. |
| WP02-A4-PBF-R572-20261017-S02 | Mayrand, [Barley Flour 10 kg](https://mayrand.ca/en/our-products/grocery/flour-semolina-and-breadcrumb/speciality-flour/farine-dorge-millbrooke-10474), Millbrooke item 10474, UPC 577360815518. | Current Québec retailer listing supports the English product name and SKU/pack information. It does not disclose the grain input or confirm current stock beyond the page snapshot. |
| WP02-A4-PBF-R572-20261017-S03 | Mayrand, [Farine d'orge 10 kg](https://mayrand.ca/fr/nos-produits/epicerie/farine-semoule-et-chapelure/farine-de-specialite/farine-dorge-millbrooke-10474/), same Millbrooke item 10474 / UPC 577360815518. | Current French retailer listing supports the exact local display. It does not identify the pearling level or source grain. |
| Reused WP02A4-BF-S01 | Office québécois de la langue française, [farine d'orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge), last updated 1982. | Pairs the preferred Québec term farine d'orge with barley flour. No pearled-barley flour term or universal milling-grade definition is given; the dated technical note is not imported as current recipe or substitution guidance. |
| Reused WP02-A6-JAU-ATTA-BARLEY-20261012-S06 | USDA ARS, [Manual of Food Codes and Weights for the 1977–78 Nationwide Food Consumption Survey](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/7778/cfe_admin_rep_335.pdf), generic barley flour, one cup unsifted. | Already owns the existing generic-row historical portion. Retain as a distinct observation; it is not an equivalent or correction to GoBarley’s pearled-source quarter-cup table entry. |
| Reused WP02-A6-JAU-ATTA-BARLEY-20261012-S07 | El-Sherif and Kenawi, [Studies on Some Bakery Products Fortified with Barley and Sorghum Flour](https://jfds.journals.ekb.eg/article_115825_90511f1aef060b1d0f5bc1434f8dde1.pdf), Table 3. | Existing generic-row 0.44 g/mL experimental flour-sample observation. The sample does not identify the GoBarley flour or a transferable default density. |

## Local checks

- Checked the open A4 anchor, current generic and whole-barley reference rows, ledger source ownership, existing measurements, forms, substitution files, package yields, and the R281 / R11 prior reviews.
- Confirmed before integration that the three new R572 source IDs, URLs, and observation ID had no ledger collision; GoBarley is reused from R281.
- Reproduced current phrase-first/substring-fallback search results from the reference names and aliases; no picker edit is proposed.
- Parsed the 114 manifest-listed recipe files and 1,123 ingredient rows; found no target text or direct reference links.
- Integrated ledger and documentation change: UTF-8/no-BOM, whitespace, and local-link checks were run. No software tests, app build, emulator run, or deployment were run for this database-JSON-only update.
