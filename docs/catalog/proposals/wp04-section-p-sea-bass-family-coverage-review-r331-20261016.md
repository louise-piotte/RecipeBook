# WP04 Section P sea-bass-family coverage review (R331)

**Date:** 2026-10-16

**Status:** Proposal only; no catalog, ledger, plan, recipe, generated, or app change is proposed here.

**Recommendation:** Keep the two remaining candidates below outside active data as a bounded picker and product-identity hold.

## Scope and decision

This review checks whether two additional CFIA-listed species can be added together to make broad English `sea bass` and French `bar` searches safer:

- *Lateolabrax japonicus* — CFIA `Asian Seabass / Bar d'Asie`.
- *Diplectrum formosum* — CFIA `Sand Seabass / Serran de sable`.

The live Section P parent remains open in [`docs/RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt#L5749). The nested holds for *Centropristis striata* / black sea bass and *Dicentrarchus labrax* / sea bass remain accepted and are not reopened. R328 *Lateolabrax latus* is used only as the held picker-boundary anchor. R323 splendid alfonsino and its separate accepted hold are outside this review.

The pair is not safe to activate together. The CFIA display spellings produce no `sea bass` result and a singleton `bar` result. Source-attested English variants can make a two-row `sea bass` result, but cannot provide a second qualified French `bar` name. In addition, OQLF assigns the English term `Asian seabass` to *Lates calcarifer*, the active `barramundi` identity; Canadian product pages using `Asian Seabass` do not show a scientific name that resolves which fish they sell. No current Québec product source was found that resolves this naming boundary for either candidate.

## CFIA coverage and candidate evidence

The CFIA overview states that its Fish List supplies the English and French common names accepted for fish labelling in Canada and the scientific names/TSNs used to identify imported species. The current CFIA result set returns these relevant rows:

| Taxon and TSN | CFIA English name | CFIA French name | Scope in this review |
|---|---|---|---|
| *Centropristis striata*, 167687 | Black Sea Bass | Fanfre Noir; French-only `Bar noir` | Existing accepted hold; not reopened |
| *Dicentrarchus labrax*, 170317 | Sea Bass | Bar Commun | Existing accepted hold; not reopened |
| *Diplectrum formosum*, 167793 | Sand Seabass | Serran De Sable | Candidate considered below |
| *Lateolabrax japonicus*, 167951 | Asian Seabass | Bar d'Asie | Candidate considered below |
| *Lateolabrax latus*, 643281 | Blackfin Sea Bass | Bar à nageoires noires | R328 picker-boundary anchor only |

Other CFIA names also use `bass` and `bar` components. This review does not reallocate them or change the other Section P decisions.

### *Lateolabrax japonicus*

ITIS recognizes TSN 167951 as a valid species. CFIA accepts `Asian Seabass / Bar d'Asie` for it. NCBI Taxonomy gives `Japanese seabass` and `suzuki` as common names; the European Commission fish-names database lists French `bar du Pacifique` for France and `Suzuki` among Czech commercial designations. These are source-attested lookup terms, but the European regional label is not evidence of Québec usage.

There is some Canadian food-service evidence for the Japanese name: Sushi Bar Maumi lists `Suzuki — Japanese sea bass`. The menu does not supply a binomial, so it supports the restaurant's wording but does not independently prove that menu item is *L. japonicus*. Uniking Enterprises, a Canadian seafood seller, currently lists `Asian Seabass Whole Round (Gilled / Gutted)`; that product page also gives no scientific name. These pages support Canadian use of the product words, not a species assignment for every item sold under them.

The Québec boundary is material. OQLF's GDT record for *Lates calcarifer* lists `Asian seabass` and `seabass` as English terms for barramundi, while its preferred French terms are `barramundi` and `perche barramundi`. The active catalog already has `barramundi / barramundi` for this taxon, with no `Asian Seabass` alias. FAO sources likewise use `Asian seabass` for *Lates calcarifer*. Thus adding the CFIA label to *L. japonicus* would give a Québec-recognized fish name to a different species than the one OQLF attaches it to, while the Canadian product listings found here do not identify the species.

### *Diplectrum formosum*

ITIS recognizes TSN 167793 as a valid species. CFIA accepts `Sand Seabass / Serran De Sable`. FAO's Western Central Atlantic species guide independently pairs *D. formosum* with English `Sand seabass`, alternate `Sand perch`, and French `Serran de sable`; it describes the fish as small and says it is not commercially important in the region covered by that guide. This establishes a species/name pair, not Canadian retail supply. No current Canadian or Québec package or menu identifying *D. formosum* was found. Targeted OQLF searches for `serran de sable` did not surface a Québec GDT fiche, so Québec consumer usage remains unknown.

The one-word name `Sand Seabass` does not match the picker query `sea bass` as a complete word phrase. `Sand perch` is an attested regional name, but no Québec or Canadian product evidence connects it to this taxon. Neither term supplies the missing French `bar` component.

## Current ownership and demand audit

Read-only counts from the live bundle and catalog research files:

- **1,680** active ingredient references and **129** forms. No active reference, form, or alias owns either candidate's binomial, CFIA display, or the reviewed `Japanese seabass`, `suzuki`, `sand seabass`, `sand perch`, or `serran de sable` terms. The current exact `bass` results are only `largemouth bass / achigan à grande bouche` and `smallmouth bass / achigan à petite bouche`. The active `barramundi` row is a separate identity.
- **58** legacy-import candidates. None owns either candidate or any of the reviewed names.
- **2,028** research-ledger records. No record is allocated to *L. japonicus* or *D. formosum*. The existing `ingredient-ref-barramundi` record is verified for *Lates calcarifer* and records measurement and substitution research as not yet done.
- Archive search found no prior proposal or batch that allocates either candidate. The black-sea-bass review, European-sea-bass hold, R328, and R162 are consulted only to preserve their existing decisions; their holds remain unchanged.
- The manifest-ordered bundled corpus has **114 recipe files and 1,123 ingredient rows**. A full decoded-text scan for both binomials; CFIA names; `Japanese sea bass`, `Japanese seabass`, `suzuki`, `Sand Seabass`, `sand perch`, `serran de sable`, `bar d'Asie`, and `bar du Pacifique` found **zero matching files and zero matching ingredient rows**. No recipe amount, role, method, form, recipe link, or substitution is supported.

## Exact picker projection

The projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): a complete normalized word phrase wins across all terms; substring matching is used only when no complete phrase matches. The hypothetical pair below uses only the bilingual CFIA names, with no aliases or forms.

| Query | Current results | Hypothetical results after adding both CFIA-name rows | Outcome |
|---|---|---|---|
| `sea bass` | none | none | `Asian Seabass` and `Sand Seabass` are each spelled as one word; R328 and the earlier sea-bass holds remain outside active data. |
| `seabass` | none | `Asian Seabass / Bar d'Asie`; `Sand Seabass / Serran De Sable` | Two rows, but only for this unspaced query. |
| `bass` | `largemouth bass / achigan à grande bouche`; `smallmouth bass / achigan à petite bouche` | Same two rows | Existing exact phrase hits remain; the hypothetical names do not add a `bass` word token. |
| `bar` | 38 substring-fallback results listed below | `Asian Seabass / Bar d'Asie` only | The exact `bar` phrase on one row suppresses all 38 current fallback results; *D. formosum* has no source-supported `bar` term. |
| `bar d asie` | none | `Asian Seabass / Bar d'Asie` | Species-specific name only. |
| `serran de sable` | none | `Sand Seabass / Serran De Sable` | Species-specific name only. |

For completeness, the current `bar` substring-fallback result set in catalog order is:

1. `ingredient-ref-bambara-beans` — Bambara beans / pois bambara
2. `ingredient-ref-bambara-groundnut-flour` — Bambara groundnut flour / farine de pois bambara
3. `ingredient-ref-barley` — barley / orge
4. `ingredient-ref-barley-bran` — barley bran / son d'orge
5. `ingredient-ref-barley-couscous` — barley couscous / couscous d'orge
6. `ingredient-ref-barley-flakes` — barley flakes / flocons d'orge
7. `ingredient-ref-barley-flour` — barley flour / farine d'orge
8. `ingredient-ref-barley-starch` — barley starch / amidon d'orge
9. `ingredient-ref-barracuda` — barracuda / barracuda
10. `ingredient-ref-barramundi` — barramundi / barramundi
11. `ingredient-ref-baru-seeds` — baru seeds / graines de baru
12. `ingredient-ref-bbq-sauce` — BBQ sauce / sauce barbecue
13. `ingredient-ref-black-bullhead` — black bullhead / barbotte noire
14. `ingredient-ref-brown-bullhead` — brown bullhead / barbotte
15. `ingredient-ref-burdock` — burdock / bardane
16. `ingredient-ref-channel-catfish` — channel catfish / barbue de rivière
17. `ingredient-ref-common-millet` — common millet / millet commun
18. `ingredient-ref-cream-of-barley-cereal` — cream of barley cereal / crème d’orge
19. `ingredient-ref-dried-barberry` — dried barberry / épine-vinette séchée
20. `ingredient-ref-hulled-barley` — hulled barley / orge mondé
21. `ingredient-ref-light-caramelized-barley-malt-flour` — light caramelized barley malt flour / farine de malt d'orge légèrement caramélisée
22. `ingredient-ref-malabar-spinach` — Malabar spinach / baselle
23. `ingredient-ref-malted-barley-flour` — malted barley flour / farine d'orge maltée
24. `ingredient-ref-narrow-barred-spanish-mackerel` — narrow-barred Spanish mackerel / thazard rayé indo-pacifique
25. `ingredient-ref-pearl-barley` — pearl barley / orge perlé
26. `ingredient-ref-pot-barley` — pot barley / orge en pot
27. `ingredient-ref-prickly-pear` — prickly pear / figue de Barbarie
28. `ingredient-ref-proso-millet-flour` — proso millet flour / farine de millet commun
29. `ingredient-ref-puffed-barley` — puffed barley / orge soufflée
30. `ingredient-ref-quick-cooking-barley` — quick-cooking barley / orge à cuisson rapide
31. `ingredient-ref-rhubarb` — rhubarb / rhubarbe
32. `ingredient-ref-roasted-barley-flour` — roasted barley flour / farine d'orge torréfiée
33. `ingredient-ref-roasted-barley-malt-flour` — roasted barley malt flour / farine de malt d'orge, pâle et grillée
34. `ingredient-ref-sambar-powder` — sambar powder / poudre de sambar
35. `ingredient-ref-sprouted-barley` — sprouted barley, dried / orge avec écorce germée séchée
36. `ingredient-ref-white-perch` — white perch / baret
37. `ingredient-ref-whole-barley-flour` — whole barley flour / farine d'orge entière
38. `ingredient-ref-yellow-bullhead` — yellow bullhead / barbotte jaune

As an English-only sensitivity check, the source-attested phrase `Japanese sea bass` for *L. japonicus* and the separate spelling `Sand sea bass` for *D. formosum* in a U.S. government report would make a hypothetical `sea bass` search return both rows. The latter is not the FAO standard spelling (`Sand seabass`) and is not Canadian or Québec product evidence. Neither phrase repairs the French projection: `bar` would still return only *L. japonicus* and displace the same 38 fallback results. `bar du Pacifique` is an EU/France name, not a supported Québec alias; no second French `bar` term for *D. formosum* was found. These aliases are not proposed.

## Bounded delta

**No catalog or ledger delta is proposed.** Keep *Lateolabrax japonicus* and *Diplectrum formosum* outside active references, forms, aliases, legacy mappings, and the research ledger. Do not add `Asian Seabass` to *Lates calcarifer* or transfer it to *Lateolabrax japonicus* without species-resolved Québec product evidence. Do not add `sea bass`, `bar`, `bar du Pacifique`, or `sand sea bass` as active aliases to force the broad projection. Add no measurement, conversion, recipe link, yield, or substitution; all remain unknown.

Revisit only when current Canadian/Québec product evidence ties each name to a scientific taxon, Québec French usage is independently supported, and the picker can show the relevant CFIA species together for broad English and French queries without presenting one as the sole answer.

## Sources and limits

| ID | Source | Support and limit |
|---|---|---|
| R331-S01 | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) and [Fish List search results for sea bass](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Sea%20Bass) | Primary Canadian labelling source for the listed English/French names, species names, and TSNs. Accepted labels do not guarantee a particular retailer's product is that species. |
| R331-S02 | ITIS, [*Lateolabrax japonicus*, TSN 167951](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=0167951) | Valid species and taxonomic identity; no commercial or Québec consumer-name conclusion. |
| R331-S03 | NCBI Taxonomy, [*Lateolabrax japonicus*, Taxonomy ID 8164](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=8164&mode=Info) | Gives `Japanese seabass` and `suzuki` as common names; these are not Canadian regulatory name assignments. |
| R331-S04 | European Commission, [commercial designations for *Lateolabrax japonicus*](https://fish-commercial-names.ec.europa.eu/fish-names/species/lateolabrax-japonicus_en) | Lists France `bar du Pacifique` and region-specific names. The France label is not Québec naming evidence. |
| R331-S05 | Sushi Bar Maumi, [today’s fresh fish](https://www.sushibarmaumi.ca/today-s-fresh-fish) | Toronto restaurant menu lists `Suzuki — Japanese sea bass`; it does not give a binomial or Québec demand. |
| R331-S06 | Uniking Enterprises Canada, [products](https://www.uniking.ca/products) | Current Canadian seller page lists `Asian Seabass Whole Round (Gilled / Gutted)` and a separate barramundi item, but gives no scientific name for the seabass product. |
| R331-S07 | OQLF, [barramundi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8349020/barramundi) | Québec source identifies *Lates calcarifer*, prefers `barramundi` and `perche barramundi`, and lists `Asian seabass`/`seabass` as English terms for that fish. It does not endorse `Asian Seabass` for *Lateolabrax japonicus*. |
| R331-S08 | FAO, [country experiences, section on Asian seabass](https://www.fao.org/4/i0202e/i0202e10.pdf) | Uses `Asian seabass` for *Lates calcarifer*. This is fishery/aquaculture terminology, not Canadian labelling law. |
| R331-S09 | ITIS, [*Diplectrum formosum*, TSN 167793](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=167793) | Valid species identity; identifies sand perch as a common name, not Canadian retail supply. |
| R331-S10 | FAO, [Western Central Atlantic species guide, *Diplectrum formosum*](https://www.fao.org/4/y4161e/y4161e52.pdf), species entry at pp. 1338–1339 | Pairs `Sand seabass` / `Serran de sable`, notes alternate `Sand perch`, and says it is not commercially important in the region covered because of small size. This is not a current Canadian-market survey. |
| R331-S11 | BOEM, [MMS 2008-060, Volume 1](https://www.boem.gov/sites/default/files/mm-research/2022-03/2008-060_Volume1.pdf), PDF p. 124 | A U.S. government fish-survey table pairs the spaced spelling `Sand sea bass` with *D. formosum*. This is one regional spelling observation, not Canadian/Québec market naming or evidence for an active alias. |
| R331-S12 | CFIA, [Fish List search results for Blackfin Sea Bass](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Blackfin%20Sea%20Bass) | R328 anchor only: verifies *L. latus* / TSN 643281 and its CFIA pair. R328's hold is not reassessed here. |

No Québec OQLF record surfaced in targeted searches for `bar d'Asie` or `serran de sable`. No measure or substitution source was identified or needed because the recipe corpus has no demand and the recommendation is to hold both identities.
