# WP04 Section P — Atlantic surf clam picker boundary review (R143)

- **Review date:** 2026-10-15.
- **Open checklist item:** “Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below” in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5377).
- **Candidate:** *Spisula solidissima*, OQLF-preferred Québec French **mactre d’Amérique**; English **surf clam** and **Atlantic surf clam**. DFO also uses **mactre de l’Atlantique**.
- **Disposition:** **Hold this species row outside active references and the research ledger.** The species and a Québec canned product are precisely identified, but a bilingual row would make broad `clam`, `surf clam`, and `mactre` queries return this species alone while the generic clam and Stimpson surf-clam identities remain unresolved. The bundle has no matching ingredient demand.
- **Data outcome:** No catalog, form, ledger, legacy mapping, recipe link, plan, roadmap, or generated file changed. No tests were run for this proposal-only review.

## Scope and prior-work boundary

R143 reviews the identity and picker boundary for Atlantic surf clam, not the generic clam candidate or the earlier Stimpson surf-clam hold. The existing [generic-clam review](wp04-section-p-clam-quebec-market-boundary-review-20261012.md) kept `ingredient-ref-clam` unresolved because Canadian and Québec sources apply clam-related terms across species. The [Stimpson surf-clam review](wp04-section-p-stimpson-surf-clam-picker-boundary-review-20261012.md) held *Mactromeris polynyma* because broad clam/surf-clam/mactre queries would misleadingly return a sole result. It cited *S. solidissima* as a comparison but did not decide this species’ Québec identity or product. R142's Pacific calico scallop hold is a separate species boundary.

A search of the Section P plan, proposal and batch archive, current references/forms, legacy identities, and research ledger found no dedicated *Spisula solidissima* proposal or allocation. The previous clam and Stimpson packets are relevant evidence and picker context, not duplicate decisions. [R142’s Pacific calico scallop hold](wp04-section-p-next-identity-gap-review-r142-20261015.md) is a separate species boundary. The wider Section P shellfish line remains open.

## Identity and Québec/Canadian naming

The identity is well supported. OQLF normalizes **mactre d’Amérique** for the edible species *Spisula solidissima* and lists **surf clam** and **Atlantic surf clam** as English terms. DFO’s Canadian bivalve guide calls it **mactre de l’Atlantique**, says it is also known as **mactre d’Amérique**, and notes that it can be difficult to distinguish visually from Stimpson’s mactre. The CFIA Fish List assigns TSN 80944 (*S. solidissima*) the Canadian common-name entries `Clam / Mactre d’Amérique`, `Surf Clam / Mactre solide`, and `Bar Clam` with no French pairing. CFIA’s term list is food-label naming evidence, not proof that each wording is the preferred Québec consumer display.

For the French display, **mactre d’Amérique** has the clearest combined support: it is OQLF’s normalized Québec term, appears in the Québec producer’s French product listing, and is also the CFIA French wording attached to `Clam` for this species. Keep **mactre de l’Atlantique** as DFO’s attested alternative, not as a new alias in this hold. Keep **mactre solide** as a CFIA label observation rather than the proposed Québec display. OQLF says **palourde** and **coque** were not retained for Québec commercial fish-product terminology for this species; do not add them as aliases. None of these choices resolves the broad picker boundary.

This is not a harvest-prohibition finding. DFO identifies the species among Canadian harvested bivalves, and Québec product sources document its harvest and sale. The hold is about the shared picker’s unresolved broad-name choices and recipe demand, not an inference that the species is unavailable in Québec.

## Current ownership and picker projection

The live bundle has **1,499 ingredient references** and **116 forms**; the research ledger has **1,844 records**. There is no active reference, form, legacy candidate, or species-specific ledger record for `ingredient-ref-atlantic-surf-clam`, *Spisula solidissima*, `mactre d’Amérique`, `Atlantic surf clam`, `surf clam`, or `mactre solide`. The only related ledger record is the existing generic `ingredient-ref-clam` candidate, whose `identityState` is `needs_clarification`; preserve that unresolved scope. No species-specific legacy mapping exists.

The projection follows the current phrase-first reference/form search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical row below uses only the bilingual display `Atlantic surf clam / mactre d’Amérique`, with empty aliases and no forms; it is not active.

| Query | Current results | If the display-only row were activated | Picker consequence |
|---|---:|---:|---|
| `Atlantic surf clam` | 0 | 1 | Species-qualified English choice. |
| `mactre d’Amérique` | 0 | 1 | OQLF-preferred, species-qualified Québec French choice. |
| `clam` | 0 | 1 | Sole result despite CFIA applying `Clam` to several taxa and generic clam remaining unresolved. |
| `surf clam` | 0 | 1 | Sole result even though CFIA applies `Surf Clam` to both *S. solidissima* and *Mactromeris polynyma*. |
| `mactre` | 0 | 1 | Sole result despite the separate, held mactre de Stimpson species. |
| `mactre de l’Atlantique` / `mactre solide` | 0 / 0 | 0 / 0 | DFO/CFIA wording is not added as an alias in this held proposal. |
| `palourde` / `coque` | 0 / 0 | 0 / 0 | No aliases proposed; OQLF explicitly excludes these broad terms for the species’ Québec fish-product marketing name. |

The one-result projections for the broad query words would imply a more complete generic-clam choice than the catalog has. Adding a source-attested alias such as `mactre de l’Atlantique` would not solve the broad French `mactre` singleton; adding `surf clam` would worsen the English cross-species singleton. Keep all candidate terms out of the live picker until the broader identity/search boundary can preserve a meaningful choice or a specific recipe requires a scoped row.

## Recipe demand, product forms, and numeric limits

The corpus scan followed all **114** paths in `manifest.v1.json`, parsed all **1,123** `ingredients[]` rows, and inspected only each ingredient row’s `ingredientName` and `originalText` fields. It did not count recipe titles, instructions, notes, source text, or arbitrary recipe JSON text as ingredient demand. Case, accents, punctuation, and whitespace were normalized for a scan covering *Spisula solidissima*, Atlantic surf clam, surf clam, bar clam, mactre d’Amérique, mactre de l’Atlantique, mactre solide, clam, palourde, and coque. Result: **0 matching ingredient rows in 0 recipe files**.

Québec producer Les Fruits de mer Madeleine currently lists *S. solidissima* as **mactres d’Amérique** in French and **surf clams** in English. Its page says this is a canned product, reports 154 g jars or cases of 12, and states year-round availability at its local fish market and wholesale availability. This is direct Québec product evidence. The 154 g jar and 12-jar case are SKU package observations only; the page does not state a recipe serving, drained edible mass, or a reusable package conversion. MAPAQ’s 2025 Quebec seafood-week announcement also lists mactre d’Amérique among transformed products offered year-round, but is sector-level availability evidence, not current shelf inventory.

Metro Canada has a separate `Fresh Large Surf Clams` page naming *S. solidissima* and Northwest Atlantic, Canada provenance; at review time the listing marked the selected product out of stock. It supports a species-qualified Canadian retail listing, not current availability or a measure. Together, these sources show canned Québec and fresh Canadian product listings; they do not justify merging those presentations into one universal culinary form or inferring a conversion between them.

No measurement, form, or substitution data is proposed. The only numeric retail observation is the producer’s **154 g jar / 12 jars per case**; it is not a per-clam amount, drained weight, recipe portion, density, unit mapping, edible yield, or conversion. The DFO guide’s shell length is an identification detail, not a kitchen measure. The sources support a canned product and a separately listed fresh product, but no recipe requires either state and no source gives a general raw/fresh-to-canned relationship. No source or recipe supports a substitution between *S. solidissima*, Stimpson’s mactre, another clam, or other seafood; DFO’s note that two species can be difficult to distinguish visually is not evidence of culinary equivalence.

## Source register

All web sources were accessed 2026-10-15. Source IDs are proposal-local and were not added to the research ledger.

| Source ID | Direct source and locator | Supports and limits |
|---|---|---|
| `WP04-SECTIONP-ATLANTIC-SURF-CLAM-R143-20261015-S01` | OQLF, [mactre d’Amérique, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198885/mactre-damerique), updated 2012; domains zoologie/malacologie and alimentation/mollusque comestible; note and English/Latin terms. | Preferred Québec name **mactre d’Amérique**, English **surf clam** and **Atlantic surf clam**, Latin *Spisula solidissima*, and commercial potential in Québec. The note says `palourde` and `coque` were not retained in Québec fish-product marketing to avoid label confusion. Terminology and identity evidence; not proof of current inventory. |
| `WP04-SECTIONP-ATLANTIC-SURF-CLAM-R143-20261015-S02` | CFIA, [Fish List lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSNs 80944 and 80983. | Lists *S. solidissima* as `Clam / Mactre d’Amérique`, `Surf Clam / Mactre solide`, and `Bar Clam` without a French pairing. It separately lists *Mactromeris polynyma* as `Surf Clam / Mactre`, `Arctic Surf Clam / Mactre arctique`, and `Stimpson Surf Clam / Mactre de Stimpson`. Canadian fish-label names; generic English terms also occur for other taxa and should not become broad aliases. |
| `WP04-SECTIONP-ATLANTIC-SURF-CLAM-R143-20261015-S03` | Fisheries and Oceans Canada, [Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm), `Mactre de l’Atlantique` and `Mactre de Stimpson` entries. | Pairs *S. solidissima* with **mactre de l’Atlantique**, notes **mactre d’Amérique** as an alternate, and says it is difficult to distinguish from *Mactromeris polynyma*. Species identification and harvested-bivalve context, not a culinary substitution rule. |
| `WP04-SECTIONP-ATLANTIC-SURF-CLAM-R143-20261015-S04` | Gouvernement du Québec / MAPAQ, [Québec seafood week announcement](https://www.quebec.ca/nouvelles/actualites/details/autonomie-alimentaire-et-promotion-des-produits-marins-la-semaine-des-poissons-et-des-fruits-de-mer-du-quebec-est-lancee-63064), 2025-05-22, “Faits saillants.” | Names **mactre d’Amérique** among transformed Québec seafood products offered year-round. The announcement does not provide the binomial, SKU, or current retailer stock. |
| `WP04-SECTIONP-ATLANTIC-SURF-CLAM-R143-20261015-S05` | Les Fruits de mer Madeleine, [Mactres d’Amérique (French)](https://www.fruitsdemermadeleine.com/nos-produits/nos-palourdes/mactres-damerique) and [Surf clams (English)](https://www.fruitsdemermadeleine.com/en/our-products/our-clams/surf-clams). | Product pages identify *S. solidissima*, local Îles-de-la-Madeleine harvest, canned product, 154 g jars / 12-jar case, and year-round availability. Package details are supplier-specific; a product page is not a guarantee of current shelf inventory. |
| `WP04-SECTIONP-ATLANTIC-SURF-CLAM-R143-20261015-S06` | Metro, [Fresh Large Surf Clams](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-seafood/mussels-clams/fresh-large-surf-clams/p/245982), product 245982. | Names *S. solidissima*, Northwest Atlantic/Canada provenance, and wild hand collection. The listing showed out of stock when checked; it gives no reusable quantity or Québec-specific availability. |

## Recommendation and data delta

Keep *Spisula solidissima* outside active references, forms, legacy mappings, and the research ledger for this pass. Preserve the existing unresolved `ingredient-ref-clam` candidate. Revisit when the picker can preserve broad clam/surf-clam/mactre choices or a recipe/product request requires a deliberately scoped species row, then recheck whether the display can avoid presenting the broad queries as complete.

**Exact proposed data delta: none.** Add zero ingredient references, forms, ledger records or sources, aliases, legacy identities, recipe links, measures, unit mappings, conversions, yields, and substitutions. Section P remains open.
