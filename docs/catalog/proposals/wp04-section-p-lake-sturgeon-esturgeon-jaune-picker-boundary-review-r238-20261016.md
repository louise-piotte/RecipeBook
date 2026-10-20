# WP04 Section P — lake sturgeon / esturgeon jaune picker-boundary review (R238)

- **Review and source-access date:** 2026-10-16.
- **Candidate:** Lake sturgeon (*Acipenser fulvescens*), Québec-preferred edible-fish name `esturgeon jaune`.
- **Recommendation:** **Hold** the species outside active references, forms, legacy mappings, and the research ledger. The species and qualified bilingual names are well supported, but the current picker would make broad `sturgeon` and `esturgeon` searches return this one species. The bundled recipes do not request it by species.
- **Scope:** One Québec freshwater fish species as flesh. This review does not reconsider white sturgeon flesh, sturgeon caviar, other sturgeon taxa, or generic sturgeon products.
- **Status:** Submitted as a proposal-only review; root accepted the hold and documented it in the [R238 integration README](../batches/wp04-section-p-lake-sturgeon-picker-boundary-hold-integration-r238-20261016/README.md), plan, and roadmap. This decision adds no catalog JSON, forms, ledger data, generated index, or application changes.
- **New proposal-local source prefix:** `WP04-SECTIONP-LAKE-STURGEON-R238-20261016-S01` through `S04`. The prefix and target filename were checked against the current proposal, batch, and ledger archives before drafting; neither has a prior allocation.

## Why this candidate is still open

The [Section P fish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5440) leaves regional fish open. The focused [white-sturgeon flesh review](wp04-section-p-white-sturgeon-meat-species-boundary-review-20261013-round66.md) names Québec lake sturgeon only to preserve its boundary from *A. transmontanus*; it does not review *A. fulvescens* as a candidate, its Québec product evidence, or its own picker projection. The [sturgeon-caviar review](wp04-section-p-sturgeon-caviar-product-boundary-review-20261013-round34.md) is about roe and likewise does not allocate fish flesh. A search of the proposal and batch archive found no focused lake-sturgeon proposal, hold, or integration; an exact-name scan found only the two R66 white-sturgeon files using lake sturgeon as a boundary comparison. The recent R229/R232–R235 decisions contain no lake-sturgeon candidate review. This review advances only the *A. fulvescens* flesh boundary.

## Identity, Canadian naming, and Québec market evidence

The Office québécois de la langue française (OQLF) identifies `esturgeon jaune` as the preferred Québec term for *Acipenser fulvescens* and gives **lake sturgeon** as its English name. OQLF describes it as an edible fishery species with commercial potential in Québec. It says `esturgeon de lac`, `maillé`, and `camus` were not retained for Québec fish-product marketing, to avoid consumer-label confusion. The Québec government species page independently pairs `esturgeon jaune`, `Lake sturgeon`, and *A. fulvescens*, and says the species is commercially fished in the St. Lawrence. These sources establish the species and local fishery, not the taxon of an unlabelled seller item. [Reused `WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S05` and `WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S06`]

The current Canadian Food Inspection Agency Fish List includes `Lake Sturgeon / Esturgeon` and `Sturgeon / Esturgeon Jaune` for *A. fulvescens*. It also lists the unqualified English `Sturgeon` and French `Esturgeon` names under several other *Acipenser* taxa, including *A. baerii*, *A. brevirostrum*, *A. medirostris*, *A. oxyrinchus*, *A. sturio*, and *A. transmontanus*. CFIA's entries are fish-label naming evidence; they do not identify an unlabelled product or establish culinary interchangeability. The overlapping generic words are the picker problem described below. [Reused `WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S02`]

Québec commercial listings support a real local sturgeon-flesh market, but do not identify species on the reviewed product pages. SIMMER lists `L’esturgeon du Lac Saint-Pierre`, filet, portion, eviscerated fish, and a separate hot-smoked-sturgeon listing. Its product page gives Lac Saint-Pierre / PLIO provenance and case or tote formats, but no binomial. Capital Fish lists a fresh Québec-product sturgeon filet in a 500 g package without a species name. The location and the Québec-specific `esturgeon jaune` evidence make *A. fulvescens* a plausible interpretation of some local fishery product, but assigning that taxon to either seller's item would be an inference unsupported by its listing. The SIMMER directory also lists `Caviar d’esturgeon jaune` separately; that roe product does not identify the species of its flesh listings. [S01–S03]

An Érable du Québec recipe titled `Esturgeon froid mariné` uses about **1 kg** of fresh, skinless, generic `esturgeon` for **8–10 portions** and gives sea trout or mackerel fillets as recipe alternatives. It does not name *A. fulvescens*. This is external evidence of generic Québec recipe wording, not an exact species request in this app's bundle or a species-specific substitution rule. [S04]

## Exact ownership and archive audit

The current snapshot contains **1,628 active references**, **122 forms**, **61 legacy candidates**, **1,973 research-ledger records**, and **114 manifest-listed recipes**. Accent- and punctuation-normalized exact checks found no owner for the candidate terms or IDs below. The source-text term `esturgeon` appears in unrelated ledger provenance (including caviar-source context), but no record owns this flesh candidate or its scientific name.

| Candidate term or ID | Active reference / form | Legacy identity | Research ledger |
|---|---|---|---|
| `lake sturgeon`; `esturgeon jaune`; *Acipenser fulvescens* | None | None | None |
| `esturgeon de lac`; `esturgeon du lac`; `freshwater sturgeon` | None | None | None |
| `ingredient-ref-lake-sturgeon`; `candidate-lake-sturgeon` | None | None | None |
| `WP04-SECTIONP-LAKE-STURGEON-R238-20261016-S01`–`S04` | Not applicable | Not applicable | No prior prefix use; proposal-local only |

Nearby rows and decisions remain separate: the white-sturgeon flesh hold concerns *A. transmontanus*; the sturgeon-caviar hold concerns roe; the active finger-lime result for `caviar` is not a sturgeon identity. Neither prior sturgeon decision was reopened. No fish form or alias currently owns any lake-sturgeon wording.

## Picker projection

The read-only projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, and punctuation, prefers complete word-phrase matches across display names and aliases, then falls back to substring matching. The hypothetical row contains only the OQLF-supported display pair **`lake sturgeon / esturgeon jaune`**, with no aliases or forms.

| Query | Current result | With hypothetical display pair | Picker effect |
|---|---|---|---|
| `lake sturgeon` | None | Lake sturgeon / esturgeon jaune | Qualified English phrase resolves. |
| `esturgeon jaune` | None | Lake sturgeon / esturgeon jaune | Preferred Québec French phrase resolves. |
| `sturgeon` | None | Lake sturgeon / esturgeon jaune | Broad genus word returns this one species alone. |
| `esturgeon` | None | Lake sturgeon / esturgeon jaune | Broad French genus word returns this one species alone. |
| `freshwater sturgeon`; `esturgeon de lac`; `esturgeon du lac` | None | None | Not display names or proposed aliases. OQLF specifically says `esturgeon de lac` was not retained for fish-product marketing. |
| `Acipenser fulvescens` | None | None | Scientific name remains evidence, not a user-facing alias. |
| `caviar` | Finger lime / lime caviar | Unchanged | No roe term or alias is added to the flesh candidate. |

The risk is not that the qualified pair is inaccurate; it is that the present phrase-first picker treats a component word from each display name as an unambiguous family-level query. CFIA assigns the same broad words to several sturgeon taxa, while the app would show only this one. Do not activate the row until recipe demand and search behavior can preserve that broader scope.

## Bundled recipe demand

The manifest contains **114 recipes and 1,123 ingredient rows**. A scan of every manifest-listed recipe document and ingredient row found **zero files and zero rows** matching `lake sturgeon`, `esturgeon jaune`, *A. fulvescens*, `esturgeon de lac`, `freshwater sturgeon`, or the generic `sturgeon` / `esturgeon` wording. The external Érable du Québec recipe does not add bundle demand. No recipe link or recipe-derived amount is supported.

## Forms, measures, conversions, yields, and substitutions

The reviewed seller pages list fillet, portion, eviscerated, and hot-smoked sturgeon presentations. They are supplier-specific product offerings, not evidence that every lake-sturgeon recipe or fish item uses a universal form. SIMMER's **4.54 kg** portion case, approximately **13.61 kg** fish cases, and approximately **500 kg** tote are bulk selling formats. Capital Fish's **500 g** product package is SKU-specific. None is a household measure, serving size, portion conversion, density, or whole-to-fillet yield. Add no forms, unit mappings, package yields, or conversions.

Health Canada's accessible Canadian Nutrient File record 3069, `Fish, sturgeon, mixed species, raw`, gives a **90 g** Food Guide serving and a **100 g** edible-portion basis. It is mixed-species data, not a value for *A. fulvescens*, and does not provide a household volume mapping. Keep it inactive for this species. [Reused `WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S08`]

The Érable recipe's 1 kg for 8–10 portions is tied to that particular generic-fish preparation, not to a named lake-sturgeon SKU or the bundled recipe corpus. Although the recipe itself names sea trout or mackerel as alternatives, it does not identify its sturgeon species or compare those alternatives with *A. fulvescens*. Add no global or contextual substitution, warning, or recipe-line link. Do not infer a substitute from white sturgeon, another sturgeon, cod, salmon, trout, mackerel, or a generic white fish.

## Conditional integration shape

If a future bundled recipe and matching product label identify this species, the evidence supports an identity-only `PROTEIN` row with English display `lake sturgeon` and Québec French display `esturgeon jaune`. Keep aliases empty: do not add generic `sturgeon` / `esturgeon`, the nonpreferred or unretained variants, `freshwater sturgeon`, the scientific name, caviar/roe terms, or supplier-specific product names. The current picker would still make `sturgeon` and `esturgeon` resolve to this sole species even with empty aliases, so resolving that behavior is a prerequisite for activation. Add no form or numeric behavior without matching recipe and product evidence.

## Sources

Sources were accessed 2026-10-16. Reused source IDs point to existing proposal evidence; new IDs below are local to this R238 proposal and are not ledger records.

| Source ID | Source | Evidence and limit |
|---|---|---|
| **Reused `WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S05`** | OQLF, [esturgeon jaune (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198863/esturgeon-jaune). | Preferred Québec food-fish term, paired with *A. fulvescens* and English `lake sturgeon`; says `esturgeon de lac`, `maillé`, and `camus` were not retained for Québec fish-product marketing. Entry last updated 2011; terminology evidence, not seller-lot identity. |
| **Reused `WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S06`** | Gouvernement du Québec, [Esturgeon jaune](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/esturgeon-jaune). | Pairs the French name, English name, and binomial; describes the St. Lawrence commercial fishery and local population monitoring. It does not identify any reviewed seller's specific item. |
| **Reused `WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S02`** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), current *Acipenser* rows. | Lists *A. fulvescens* and repeats `Sturgeon / Esturgeon` names under several other taxa. Fish-label naming evidence; not recipe equivalence or seller-product traceability. |
| **WP04-SECTIONP-LAKE-STURGEON-R238-20261016-S01** | SIMMER international, [Produits](https://simmerinternational.com/produits-liste/). | Current catalogue separately lists `L’esturgeon du Lac Saint-Pierre`, `Esturgeon fumé à chaud`, and `Caviar d’esturgeon jaune`. These product names do not give the flesh listings' binomial or make the caviar species evidence for flesh. |
| **WP04-SECTIONP-LAKE-STURGEON-R238-20261016-S02** | SIMMER international, [L’esturgeon du Lac Saint-Pierre](https://simmerinternational.com/produits/esturgeon-du-lac-saint-pierre/). | Lists filet, portion, and eviscerated fish; identifies Lac Saint-Pierre / PLIO provenance and bulk cases/tote. It does not state a scientific name; package quantities are not recipe measures or yields. |
| **WP04-SECTIONP-LAKE-STURGEON-R238-20261016-S03** | Capital Fish Market, [Filet d’esturgeon frais](https://www.capitalfish.ca/product-page/filet-d-esturgeon-frais). | Lists fresh sturgeon filet as a Québec product in a 500 g package. The page gives no taxon and its package amount is SKU-specific. |
| **WP04-SECTIONP-LAKE-STURGEON-R238-20261016-S04** | Érable du Québec, [Esturgeon froid mariné, vinaigrette à la pomme et à l’érable](https://erableduquebec.ca/recettes/esturgeon-froid-marine-vinaigrette-a-la-pomme-et-a-lerable/). | Uses about 1 kg generic fresh sturgeon for 8–10 recipe portions and names sea trout or mackerel as alternatives in that recipe. It gives no sturgeon species and does not support an *A. fulvescens* substitution or catalog serving rule. |
| **Reused `WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S08`** | Health Canada, Canadian Nutrient File, [Fish, sturgeon, mixed species, raw, food code 3069](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3069). | Accessible record gives 90 g Food Guide serving and 100 g edible portion for mixed-species raw sturgeon; the page was last modified 2019-03-01. Not species-specific and not used as an active portion or conversion. |
| **P01** | Existing proposal, [sturgeon-caviar product-boundary review (R34)](wp04-section-p-sturgeon-caviar-product-boundary-review-20261013-round34.md). | Scope check only: prior hold is about roe, not flesh. |
| **P02** | Existing proposal, [white-sturgeon flesh species-boundary review (R66)](wp04-section-p-white-sturgeon-meat-species-boundary-review-20261013-round66.md). | Scope check only: its lake-sturgeon mentions preserve the boundary of the white-sturgeon decision and do not review *A. fulvescens* itself. |

## Recommendation

Keep lake sturgeon / `esturgeon jaune` unallocated in the active picker and research ledger. The Québec species and fishery are well established and generic sturgeon products are locally marketed, but the reviewed product pages do not identify their flesh by binomial, the bundled corpus has no candidate demand, and a one-species row would capture broad `sturgeon` / `esturgeon` searches. Revisit when a bundled recipe selects the named fish and the picker can keep sibling sturgeon choices visible.
