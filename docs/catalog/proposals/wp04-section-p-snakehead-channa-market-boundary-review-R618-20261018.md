# WP04 Section P R618 — snakehead / Channa market-name boundary

- **Review and source-access date:** 2026-10-18.
- **Checklist:** Open WP04 Section P finfish and regional-fish coverage in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6440). WP04 remains in progress in the [roadmap](../../../roadmap.md).
- **Candidate:** Unqualified snakehead and Channa wording on Canadian and Québec fish listings.
- **Recommendation:** Hold outside active references, forms, aliases, and the research ledger. Retail listings establish a food-market product but do not identify its species or prove that the English and French wording has the same scope.
- **Status:** Accepted as a bounded hold and recorded in the [integration README](../batches/wp04-section-p-snakehead-channa-market-boundary-hold-integration-r618-20261018/README.md). No active catalog JSON or ledger data changed.
- **Repository snapshot:** After R617 integration, 1,824 active ingredient references, 156 forms, 2,196 research-ledger records, and 114 manifest-listed recipes. The recipe scan below counted 1,123 ingredient rows.
- **Proposal-local source IDs:** WP04-SECTIONP-SNAKEHEAD-CHANNAMARKET-R618-20261018-S01 through S05; audit label WP04-SECTIONP-SNAKEHEAD-CHANNAMARKET-R618-20261018-R01. Reuse the existing CFIA Fish List overview source WP04-FINFISH-GAPS-20261010-S11.

## Why the market term stays unallocated

The Canadian Food Inspection Agency Fish List assigns the English common name **Snakehead** to several species in the genus *Channa*: *Channa argus*, *C. striata*, *C. punctata*, and *C. marulius*. The list pairs **Channa** in French with some of those *Channa* entries. It also assigns **Snakehead** to *Parachanna obscura*, but pairs that species with French **Lotte**. These are Canadian fish-label names, not evidence that the taxa are interchangeable in a recipe. The English market wording therefore does not identify one species, and the English-to-French name pair is not coextensive across all listed taxa. [S01; reused CFIA scope source]

Québec’s government species page calls *Channa argus* **Poisson à tête de serpent du Nord / Snakehead**. The page distinguishes the northern species from the wider group, says there are 29 snakehead species across *Channa* and *Parachanna*, and states that snakehead fish are sold in North American Asian-food markets. This confirms both local food-market relevance and why the Québec government’s unqualified English label cannot identify a retail fish as *C. argus*. [S02]

Current Canadian retailer evidence shows **Frozen Sliced Snakehead Fish** at T&T, sold as a frozen 250 g item without a binomial. A separate Québec flyer card for Marché C&T uses **Tranche de Poisson Channa**, also without a binomial. The two records come from different sellers and do not identify a matched bilingual SKU or package. They establish local English and French product wording, but not that both titles define one stable, species-level identity or a single genus-bounded market group. [S04–S05]

The earlier WP04 R604 review established a useful way to represent a broad fish market name when its English and French scopes are supported: visibly label a species-neutral market group. That precedent does not resolve this item by itself. A generic Snakehead group would cover several *Channa* species and at least one *Parachanna* species in CFIA’s list, while **Channa** is attached to only a subset of those entries and is also a current chickpea-form search term. The current Québec listings do not provide a paired package or species detail that resolves this scope boundary. Keep R604’s bream groups unchanged. See the [R604 proposal](wp04-section-p-bream-sea-bream-market-group-review-r604-20261018.md).

FAO food-culture material confirms *Channa striatus* as a food fish in Thailand, but it is historical regional context and does not identify the Canadian retail products above as that species. Do not use the fact that one snakehead species is a food fish to resolve a broader retail label. [S03]

## Ownership and archive audit

At the reviewed snapshot, no active reference, form, legacy-import candidate, or ledger record owns snakehead, *Channa striata*, *Channa argus*, or the Québec phrase **poisson à tête de serpent** as a fish identity. No prior proposal or batch reviews snakehead as fish. The proposed reference ID **ingredient-ref-snakehead-market-group** is unallocated. The only active catalog match for **Channa** is the match term **channa dal** on form **ingredient-form-desi-chickpeas-split-dehulled**, under Desi chickpeas. Other archived occurrences of Channa are in chickpea and roasted-gram work, not fish research. [R01]

The general CFIA Fish List overview source is already registered as WP04-FINFISH-GAPS-20261010-S11 and should be reused. The results endpoint has been cited in other fish reviews, including R604, but no Channa-specific locator or R618 source-ID prefix is already allocated. The T&T item URL and Québec Channa flyer URL have no exact owner in the reviewed ledger or catalog archive. [R01]

The hold leaves the current search behavior intact:

| Query | Current result | Effect of this hold |
|---|---|---|
| snakehead; snakehead fish | No fish result | No new singleton species or market group is implied. |
| Channa | Desi chickpeas, because the split/dehulled form includes channa dal | The result remains the chickpea reference; no fish alias is attached to it. |
| poisson Channa; poisson à tête de serpent | No fish result | No unpaired French market wording is presented as a resolved bilingual identity. |
| channa dal | Desi chickpeas | The qualified chickpea phrase keeps its current owner. |
| poisson à tête de serpent du Nord | No catalog result | The Québec species name is not mapped to an unqualified fish identity. |

This projection follows the current shared search behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): names, aliases, and attached form terms participate in one search; complete normalized word phrases are preferred before substring fallback. If future evidence supports a species-neutral market group, its display must make the multiple-species scope visible and its English and French terms must preserve that same boundary. A future species row must not make an unqualified Snakehead query appear taxonomically resolved.

## Recipe demand, measures, forms, and substitutions

A manifest-ordered scan parsed all 114 recipe files and 1,123 ingredient rows. It searched complete recipe JSON for snakehead, Channa, *Channa striata*, *Channa argus*, striped snakehead, **poisson Channa**, **poisson à tête de serpent**, and **cá lóc**. It found zero matching recipe files and zero matching ingredient rows. No recipe link, cooking role, portion, or substitution context is supported. [R01]

The T&T listing’s 250 g is a retail package quantity for that item only. It is not a household measure, recipe portion, edible or cooking yield, or reusable package-yield mapping. The sliced state and storage wording are also seller-specific; the separate C&T product card does not establish a matching product state. Add no ingredient reference or form, density, unit mapping, conversion, package yield, recipe link, or substitution. Leave the question of a reusable preparation form open until recipe or matched-product evidence needs one.

## Integrated disposition

**No active JSON or ledger delta was made.** Do not reserve a catalog ID, create a legacy mapping or ledger candidate, add an alias, attach a source record, or link a recipe. Keep the retailer terms and the research decision in this proposal and the integration README.

The hold covers the unqualified fish-market wording reviewed here. It does not reject *Channa striata* or any other species as a food fish, nor does it decide what species is in a specific package. Do not add *C. striata*, *C. argus*, *C. punctata*, *C. marulius*, or *Parachanna obscura* as the product identity. Do not promote **Channa**, **poisson Channa**, **striped snakehead**, **Northern snakehead**, *cá lóc*, or other regional names to global aliases. Leave the existing Desi-chickpea form and its channa dal wording unchanged.

Revisit if a Québec or Canadian product package identifies its binomial, or if a same-SKU bilingual label plus additional market evidence supports a stable, visibly qualified multi-species group whose English and French terms share the same scope. A recipe line can independently justify a narrowly scoped review of its exact product wording, form, and quantity.

## Source register and limits

Sources were accessed on 2026-10-18.

| Source ID | Source and evidence | Limits |
|---|---|---|
| **WP04-SECTIONP-SNAKEHEAD-CHANNAMARKET-R618-20261018-S01** | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). The rows include *Channa argus*, *C. striata*, *C. punctata*, and *C. marulius* under Snakehead wording, with Channa as a French name on multiple *Channa* entries; *Parachanna obscura* also has Snakehead with French Lotte. | Canadian fish-labelling names and taxon associations; not a statement of culinary equivalence or the species in a retail package. Fish List last modified 2023-09-18. |
| **Reused WP04-FINFISH-GAPS-20261010-S11** | CFIA, [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). CFIA describes the list as providing English and French fish-label common names and associated scientific names and TSNs. | Reuse the existing registered source; it describes the resource, not the specific Channa results. |
| **WP04-SECTIONP-SNAKEHEAD-CHANNAMARKET-R618-20261018-S02** | Gouvernement du Québec, [Poisson à tête de serpent du Nord](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/poisson-tete-serpent-nord), updated 2026-07-30. Names *Channa argus* as **Poisson à tête de serpent du Nord / Snakehead**; distinguishes the wider family and notes sale in North American Asian-food markets. | Government species/ecology page, not a food-label approval for every snakehead species or an identification of a retailer’s fish. |
| **WP04-SECTIONP-SNAKEHEAD-CHANNAMARKET-R618-20261018-S03** | FAO, [Snakehead Culture and its Socio-Economics in Thailand](https://www.fao.org/4/ac238e/ac238e00.htm), 1985. Identifies historical food-fish and aquaculture use for *Channa striatus*. | Historical regional food-culture evidence; the source uses older spelling and does not identify current Canadian product contents. |
| **WP04-SECTIONP-SNAKEHEAD-CHANNAMARKET-R618-20261018-S04** | T&T Supermarket, [Frozen Sliced Snakehead Fish (~250g)](https://www.tntsupermarket.com/chs/51676701-sliced-snakehead-fish.html), product 51676701. The indexed product page gives the frozen/sliced wording and a 250 g package size. | Retailer listing with no species binomial. Direct page rendering required JavaScript during access; package size is SKU-specific. |
| **WP04-SECTIONP-SNAKEHEAD-CHANNAMARKET-R618-20261018-S05** | Circulaires Québec, [Tranche de Poisson Channa at Marché C&T](https://www.circulairesquebec.com/produit/tranche-de-poisson-channa-6aabbe726cbae7c53a518fb4). The Québec flyer card supplies French product wording. | Third-party flyer/product card, not the package label; no binomial, paired English title, or transferable product state is shown. |
| **WP04-SECTIONP-SNAKEHEAD-CHANNAMARKET-R618-20261018-R01** | Read-only audit of the active reference and form files, legacy import identities, research ledger, prior proposal/batch archive, search implementation, manifest, and recipe corpus. | Repository snapshot audit only; it changes no shared data and does not substitute for a product’s species label. |

## Disposition

**Hold the unqualified snakehead / Channa market wording outside active data.** The available evidence establishes that snakehead is food-market language and that several taxa carry the same Canadian English fish-label name. It does not establish that separate Canadian and Québec retailer titles are the same bilingual product class, and it cannot identify a species. No bundled recipe demand, reusable measure, form requirement, or substitution context offsets that identity gap. No software tests were run; this documentation-only hold changed the plan, roadmap, proposal, and integration README, with no active catalog or ledger data change.
