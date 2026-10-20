# WP06 African regional gap review R518 — Bitter kola seeds

- **Review date:** 2026-10-17
- **Status:** integrated on 2026-10-17; see the [R518 integration README](../batches/wp06-african-bitter-kola-seeds-identity-integration-r518-20261017/README.md).
- **Scope:** one West and Central African food-seed identity: bitter kola, *Garcinia kola*.

## Recommendation

Add one identity-only reference for the food seeds of *Garcinia kola*, separate from true kola seeds in *Cola acuminata* and *Cola nitida*.

| Proposed field | Value |
|---|---|
| ID | ingredient-ref-bitter-kola |
| English display | bitter kola seeds |
| French display | noix de bitter kola |
| Category | NUT_SEED_AND_DRIED_FRUIT |
| English aliases | none |
| French aliases | none |
| Default density | null |
| Unit mappings | [] |
| Forms, measurements, recipe links, conversions, yields, substitutions | none |

The English display captures the source-used product phrase “bitter kola” and specifies the consumed plant part. The French display follows a current French-language Ottawa–Gatineau product label, “Noix de Bitter Kola.” This is local retail wording, not an OQLF or TERMIUM recommendation. Keep both display terms as written and add no aliases.

The proposed scope is the *Garcinia kola* seed sold and consumed as bitter kola. It does not include the leaves, bark, roots, extracts, drinks, powders, medicinal products, or unverified preparations of the plant. Keep the existing true-kola identity unchanged. This is a bounded West and Central African regional addition; it does not close the WP06 African regional sweep.

## Fit with the active plan and recent integrations

The [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L993) keeps WP06 in review and still calls for source-grounded regional ingredient mentions and a disposition for each gap. The [roadmap](../../../roadmap.md#L1297) records that African regional coverage remains open.

The [R514 integration](../batches/wp04-section-p-canned-sardines-tomato-sauce-identity-integration-r514-20261017/README.md) added canned sardines in tomato sauce and is outside this regional scope. The [R515 integration](../batches/wp06-african-oha-leaves-identity-integration-r515-20261017/README.md) added Oha leaves and keeps broader African coverage open. Both were read before the live catalog audit. The current live package and ledger counts are **1,789 references, 143 forms, 56 legacy candidates, 2,146 ledger records, 9,850 source entries, 8,337 distinct source IDs, and 7,047 distinct URLs**. A full source-ID audit found no ID pointing to more than one URL. These current counts supersede earlier R514/R515 snapshot numbers in the historical notes.

The African archive was checked review by review: [R478, kuka powder](wp06-african-next-regional-review-r478-20261017.md), [R481, dried Gnetum leaves](wp06-african-next-regional-review-r481-20261017.md), [R484, grains of Selim](wp06-african-next-regional-review-r484-20261017.md), [R487, ugu leaves](wp06-african-next-regional-review-r487-20261017.md), [R490, shiro powder](wp06-african-next-regional-review-r490-20261017.md), [R493, calabash nutmeg](wp06-african-next-regional-review-r493-20261017.md), [R496, African basil leaves](wp06-african-next-regional-review-r496-20261017.md), [R499, gboma leaves](wp06-african-next-regional-review-r499-20261017.md), [R502, waterleaf](wp06-african-next-regional-review-r502-20261017.md), [R505, garden egg fruit](wp06-african-next-regional-review-r505-20261017.md), [R509, dried kinkeliba leaves](wp06-african-next-regional-review-r509-20261017.md), [R512, uziza leaves](wp06-african-next-regional-review-r512-20261017.md), and [R515, Oha leaves](wp06-african-next-regional-review-r515-20261017.md). None proposes a separate *Garcinia kola* identity. The exact-term archive search found bitter-kola wording in the older [R373 true-kola proposal](wp03-section-i-next-gap-review-r373-20261016.md) and its [integration record](../batches/wp03-section-i-kola-nuts-identity-integration-r373-20261016/README.md), but no distinct active or candidate identity for *G. kola*.

R373 intentionally kept bitter kola / bitter cola, petit cola, and *Garcinia kola* off the true-kola row because its evidence did not yet establish a separately scoped product and the name index linked “bitter cola” to more than one species. This review resolves only the product-specific gap: a regional food-use study and a current Canadian retailer page connect the bitter-kola seed product to *G. kola*. It does not reopen R373’s true-kola identity or alias decisions.

## Regional food use and bilingual naming

The 1999 FAO volume *Non-Wood Forest Products of Central Africa* describes *Garcinia kola* as “bitter kola” in the humid forest zone of West and Central Africa, says the product is eaten and contributes to rural household income, and distinguishes it from *Cola acuminata*. Its market evidence reflects Cameroon studies from 1995–96, so it supports a regional product boundary, not present-day prevalence or a current retail standard. [S01]

A 2026 survey of 152 respondents from South-South Nigeria asked about non-medicinal, leisurely oral consumption. It reports seeds as the most commonly consumed plant part and describes fresh or dried seeds. Its sample is regional and self-reported, and the authors note limits from urban, educated, and online-heavy participation. This supports seed identity and social consumption; it is not a recipe study, serving recommendation, safety finding, or transferable measurement. [S02]

A current French-language retailer based in Ottawa–Gatineau lists “Bitter Kola — Noix amères Garcinia kola,” uses “Noix de Bitter Kola” in its product details, and identifies the product as whole nuts. The page also uses “Petit cola,” but this wording is not selected for the French display or aliases: with the current picker, activating that phrase would turn the query cola from 14 existing partial results into one exact match for this seed. No authoritative Québec terminology source for *Garcinia kola* was found in the reviewed material. [S03]

The existing OQLF-backed true-kola wording in R373 applies to *Cola acuminata* and *C. nitida*, not to *Garcinia kola*. Therefore do not transfer noix de kola or noix de cola to this identity. The borrowed French retail phrase noix de bitter kola is the narrowest product-specific local wording found. Retain it as a provisional fr-CA display pending independent Québec terminology review.

## Duplicate, alias, ownership, and archive audit

Read-only review covered the live [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), the R514 and R515 integration notes, the African proposal/batch archive, and [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

The live reference for kola nuts is ingredient-ref-kola-nuts, with display names “kola nuts / noix de kola” and only “kola nut” as an English alias. It covers seeds of *Cola acuminata* and *C. nitida*. Its ledger decision already keeps *Garcinia kola* separate; the same record links to Kew’s accepted-name page for *G. kola* and to Kew’s medicinal-name index, which associates the spelling “bitter cola” with both *C. nitida* and *G. kola*. The current reference does not own “bitter kola,” “bitter cola,” “petit cola,” or *Garcinia kola* as active search terms.

Before R518 integration, exact active ID, form, legacy-candidate, and reference-term checks found no owner for ingredient-ref-bitter-kola or its proposed display phrases. The ledger contained those terms in the R373 boundary discussion and source notes, but no candidate record or accepted identity for this species. No earlier R478–R515 African review assigned the candidate.

| Term or boundary | Decision |
|---|---|
| bitter kola seeds; bitter kola | English display; no alias needed because the display contains the complete phrase. |
| noix de bitter kola | French display from current Canadian retail wording; provisional local-market construction, not an official Québec term. |
| petit cola | Keep out of the active display and aliases. The term is attested in the retailer’s French copy, but its cola token would replace the picker’s 14 existing fallback results with a singleton exact match. Retain as source evidence only. |
| bitter cola | Keep out of aliases. R373’s existing Kew name-index source maps this spelling to both *Cola nitida* and *Garcinia kola*. |
| kola nuts; noix de kola; kola nut | Keep on ingredient-ref-kola-nuts, the distinct *Cola* species identity. |
| *Garcinia kola* | Research-record taxon only; do not expose the scientific name as a picker alias. |
| orogbo; mbitacola; other vernacular names | Keep out of aliases. The reviewed Canadian seller listing gives localized name variants without establishing a broad, source-independent alias set. |
| powders, extracts, drinks, leaves, bark, roots | Keep outside this seed identity unless a separate product review establishes identity and form boundaries. |

## Picker projection

The static projection uses the current reference and form terms and follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, punctuation, and spacing; return complete phrase matches before substring fallback. The proposed reference has no forms and no aliases.

| Query | Current | With proposal |
|---|---:|---:|
| bitter kola; bitter kola seeds; noix de bitter kola | 0 | 1: ingredient-ref-bitter-kola |
| kola | 1: ingredient-ref-kola-nuts | 2: ingredient-ref-kola-nuts and ingredient-ref-bitter-kola |
| kola nut; kola nuts; noix de kola | 1: ingredient-ref-kola-nuts | 1: ingredient-ref-kola-nuts, unchanged |
| cola | 14 existing fallback matches | 14, unchanged |
| petit cola; bitter cola; Garcinia kola; orogbo | 0 | 0, unchanged |
| seeds | 36 | 37 |
| noix | 30 | 31 |
| nut; nuts | 13; 7 | 13; 7, unchanged |

This keeps the phrase-level true-kola searches intact, allows a broad “kola” search to show both species-specific ingredients, and avoids capturing the unrelated “cola” query with the French display term petit cola.

## Full manifest recipe scan

The current manifest lists **114 recipe files** and the files contain **1,123 ingredient rows**, totalling **753,988 exact recipe bytes**. The manifest-ordered fingerprint is **847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e**; it hashes each relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte.

All 114 full recipe files and all 1,123 ingredient rows were scanned for bitter kola, bitter cola, *Garcinia kola*, petit cola, kola-seed and kola-nut wording, noix de kola, orogbo, and related seed phrases. The scan found zero full-file hits and zero ingredient-row hits. The bundled corpus contributes no recipe demand, recipe amount, form state, or relink for this identity.

## Measures, forms, and substitutions

The Nigerian survey’s one-to-three seeds describes self-reported non-medicinal use, not a recipe amount. The retailer’s 150 g value is a package size. Neither supports a reusable measure, density, or unit mapping. Record no numeric behavior.

Although the sources document fresh and dried use and the Canadian retailer describes whole seeds, they do not establish a reusable processing taxonomy or kitchen interchange. Add no forms. The reviewed sources do not establish a tested recipe replacement. Keep substitution research unresearched and add no active or contextual rule, warning, yield, or recipe link. Do not import health claims, medicinal preparations, or consumption advice into recipe data.

## Source register and source-ID-to-URL ownership

At proposal review, the ledger had 9,850 source entries, 8,337 distinct source IDs, and 7,047 distinct URLs. A complete mapping audit found zero source IDs pointing to multiple URLs. The R518 prefix and three proposed source IDs were then absent, and each proposed URL was unowned. The integration registered those three IDs to their corresponding URLs; the global audit continues to find no source-ID-to-multiple-URL conflicts.

| Source ID | Exact URL and source | Supports and limit |
|---|---|---|
| WP06-AFRICA-BITTER-KOLA-R518-20261017-S01 | Food and Agriculture Organization of the United Nations, [Non-Wood Forest Products of Central Africa: Current Research Issues and Prospects for Conservation and Development](https://www.fao.org/4/x2161e/x2161e.pdf), 1999, Garcinia kola section and Cameroon market data. | Regional range, local name bitter kola, seed/fruit product eaten, and market role in West/Central Africa. Reported market sample is from 1995–96; not current market prevalence, a recipe, or a household measure. Registered to the R518 record. |
| WP06-AFRICA-BITTER-KOLA-R518-20261017-S02 | Purger et al., [Traditional use of Garcinia kola Heckel in Nigeria](https://pmc.ncbi.nlm.nih.gov/articles/PMC13014730/), 2026, South-South Nigeria questionnaire study. | A 152-person primary survey reports non-medicinal oral seed use and fresh/dried preparations. Sampling and self-report limitations apply; do not convert its findings to recipe or safety guidance. Registered to the R518 record. |
| WP06-AFRICA-BITTER-KOLA-R518-20261017-S03 | All Market, [Bitter Kola — Noix amères Garcinia kola 150 g](https://all-market.net/products/bitter-kola-150g?variant=46595336339644), Ottawa–Gatineau Canadian retailer. | Current bilingual product label and local wording “Noix de Bitter Kola”; page identifies the sold item as whole *Garcinia kola* seed and also mentions petit cola. Use only for product-name and Canadian retail evidence. Its product prose is seller-authored, not independent botanical or Québec terminology authority; 150 g is SKU-specific. Registered to the R518 record. |

Previously owned evidence used only for boundary context: R373 source WP03-I-KOLA-NUT-20261016-S07 maps to Kew POWO’s *Garcinia kola* page at https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:428024-1/general-information; R373 source WP03-I-KOLA-NUT-20261016-S06 maps the “Bitter cola” name-index result at https://mpns.science.kew.org/mpns-portal/drugDetail?drugName=Bitter+cola&filter=&fuzzy=true&nameType=all&query=coea. These IDs each retain their existing single URL; neither URL is added under a new ID in this proposal.

## Proposal-only static checks and evidence limits

- Recomputed live counts from the references, forms, legacy identities, and ledger; checked candidate ID and display ownership across live references, forms, legacy candidates, and ledger records.
- Audited all ledger source IDs against their URLs; before integration, the three R518 IDs and URLs were unowned. The live ledger now contains one mapping for each ID and URL, with no source-ID-to-multiple-URL conflicts.
- Compared picker projections against the current Kotlin normalization and phrase-first matching behavior, including the broad cola query and existing true-kola owner.
- Scanned the entire manifest-ordered recipe corpus and every ingredient row; recorded its count, byte total, and fingerprint above.
- Checked that local Markdown links resolve and the proposal is UTF-8 without a BOM.

Integration added one identity-only reference and one research-ledger record. No software tests, build, emulator, or deployment were run because the catalog change adds database JSON data under `AGENTS.md`; static package, ledger, index, picker, and source-ownership checks are recorded in the [integration README](../batches/wp06-african-bitter-kola-seeds-identity-integration-r518-20261017/README.md). Evidence is strongest for regional seed consumption and for the current Ottawa–Gatineau retail product label. No Québec terminology authority confirms the French construction; retailer wording is the only local bilingual evidence found. Regional consumption patterns are not uniform across the continent or among Nigerian communities. No recipe demand, standard culinary measure, powder-to-seed form rule, or tested replacement was found.
