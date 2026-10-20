# WP04 Section P — White sturgeon flesh species-boundary review (round 66)

- **Review and source-access date:** 2026-10-13.
- **Disposition:** Hold white sturgeon flesh outside active references, forms, and the research ledger for now. A current Canadian aquafarm sells white-sturgeon fillets, but no bundled recipe requests the species and the current search behavior would make broad `sturgeon` / `esturgeon` queries return this one species alone.
- **Scope:** White sturgeon (*Acipenser transmontanus*) as an edible-fish species, based on farmed Canadian meat evidence. This is separate from sturgeon caviar, Québec’s lake sturgeon / `esturgeon jaune`, and other sturgeon species. It does not propose a generic sturgeon identity.
- **Proposal-only:** This file only. No catalog JSON, forms, ledger, recipe, checklist, roadmap, or code was changed. No tests or emulator checks were run.
- **New local source-ID prefix:** **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-**. The candidate IDs, prefix, and filename were checked against the current catalog, ledger, proposal, and batch archive before drafting; no prior allocation or use was found.

## Decision

White sturgeon is a concrete Canadian farmed food product. Northern Divine Aquafarms currently lists boneless, skin-on white-sturgeon fillets as meat from its British Columbia land-based aquafarm. CFIA’s Fish List gives *Acipenser transmontanus* the acceptable common names **White Sturgeon / Esturgeon Blanc** for Canadian fish labelling. DFO’s Canadian aquaculture list also names farmed white sturgeon in British Columbia, alongside Atlantic and shortnose sturgeon in New Brunswick. These sources establish the species and a Canadian farmed-food context; they do not establish regular Québec retail availability for this exact species. [S01–S04]

Québec usage makes an unqualified active row risky. OQLF identifies Québec’s commercially used `esturgeon jaune` as *Acipenser fulvescens* and says that this species-specific French term is standardized to avoid confusion on fish products. Québec’s species page describes a St. Lawrence commercial fishery, and a Québec retailer lists an unqualified `filet d’esturgeon` from lac Saint-Pierre without a scientific name. These sources do not prove that the retailer’s product is *A. fulvescens*, but they show that local `esturgeon` food wording is not uniquely tied to white sturgeon. CFIA likewise assigns unqualified `Sturgeon / Esturgeon` names to multiple taxa, including *A. fulvescens*, *A. medirostris*, *A. oxyrinchus*, *A. sturio*, and *A. transmontanus*. [S02, S05–S07]

The official Canadian French name `esturgeon blanc` is a reasonable future display, but no OQLF entry or current Québec retail label for *A. transmontanus* flesh was found. The French display would therefore be based on CFIA and DFO nomenclature, not a Québec product label. A 2023 DFO recovery strategy states that white sturgeon occurs in British Columbia and identifies four SARA-listed populations as endangered. That conservation scope applies to the named wild populations; the current farmed product listing does not imply wild sourcing or determine the legality of any wild fish. [S02–S04, S10]

Keep the species unallocated until a bundled recipe selects it and search can preserve the broader sturgeon choices. This is not the prior sturgeon-caviar review: caviar is roe, while this candidate is flesh. Do not add a generic sturgeon row or extend any caviar name to the fish. [P01]

## Plan and archive check

The [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4044) leaves regional fish open. The separate [sturgeon-caviar review](wp04-section-p-sturgeon-caviar-product-boundary-review-20261013-round34.md) held the roe product and does not decide whole-fish flesh. The [round-65 Atlantic-cod-cheeks review](wp04-section-p-atlantic-cod-cheeks-cut-form-boundary-review-20261013-round65.md) concerns a cut of another species. Exact archive searches found no prior white-sturgeon meat proposal, batch, or candidate. Both neighboring reviews are retained as scope checks only.

The source snapshot contains **1,389 active references**, **100 ingredient forms**, **63 legacy candidates**, and **1,722 research-ledger records**. No current reference or form contains the candidate name or scientific name. The active `caviar` result is still finger lime; no current sturgeon-caviar or sturgeon-flesh reference is being changed.

| Normalized candidate term or ID | Active reference / form | Legacy identity | Research ledger |
|---|---|---|---|
| `white sturgeon`; `esturgeon blanc`; `acipenser transmontanus` | None | None | None |
| `white sturgeon meat`; `chair d’esturgeon blanc` | None | None | None |
| `ingredient-ref-white-sturgeon`; `candidate-white-sturgeon` | None | None | None |
| `WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S…` | Not applicable | Not applicable | Unallocated; no prior prefix use found |

The archive search also found no exact allocation for `esturgeon jaune` or *Acipenser fulvescens* in the active seed, legacy file, or ledger. Those Québec terms are used here as external evidence of the broader species family, not as a claim that they already have a catalog owner.

## Exact search ownership and collision projection

The read-only projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes case, accents, and punctuation, returns complete word-phrase matches first across reference names, aliases, and attached form terms, then falls back to substring matching. Forms return their parent reference. The hypothetical row below uses only the proposed bilingual display names and one product-attested English alias, `white sturgeon meat`; it adds no Latin alias or form.

| Query | Current result | Hypothetical result with `white sturgeon / esturgeon blanc` and `white sturgeon meat` | Picker effect |
|---|---|---|---|
| `white sturgeon`; `esturgeon blanc` | None | White sturgeon / esturgeon blanc | The species-qualified English and French phrases would be searchable. |
| `white sturgeon meat`; `sturgeon meat` | None | White sturgeon / esturgeon blanc | The exact product wording and its contained `sturgeon meat` phrase would select this species. |
| `sturgeon`; `esturgeon` | None | White sturgeon / esturgeon blanc | Each broad family query would return one species, although CFIA uses the unqualified names across several taxa and Québec has a distinct commercial lake-sturgeon species. |
| `Acipenser transmontanus` | None | None | The scientific name is evidence only and is not proposed as a user-facing search alias. |
| `esturgeon jaune`; `lake sturgeon` | None | None | Keep Québec’s *A. fulvescens* wording distinct; do not alias it to white sturgeon. |
| `caviar`; `sturgeon caviar` | Finger lime / lime caviar; none | Finger lime / lime caviar; none | The flesh candidate does not create or own a roe/caviar search. |

This projection is a data-level consequence of the current search implementation, not a runtime picker test. It predicts a false singleton for broad sturgeon queries, even though no sturgeon row is currently active. The Canadian Fish List and aquaculture list document multiple relevant taxa; the local Québec naming sources document another species and unqualified fish-product wording. Do not treat a single searchable result as a safe species resolution.

## Bundled recipe demand

The live manifest lists **114 recipe files** with **1,123 ingredient rows**. A scan of every manifest-listed parsed recipe document, including ingredient names, original text, and reference/form IDs, found **zero files and zero rows** containing `white sturgeon`, `esturgeon blanc`, *Acipenser transmontanus*, `sturgeon meat`, `sturgeon`, or `esturgeon`. No recipe link or recipe amount is supported.

## Measures, numeric evidence, and substitutions

Northern Divine describes its product as an approximately **6 lb skin-on side** of boneless fillets. This is a seller’s SKU/package description, not a serving count, yield, or household measure. A current Québec retailer separately describes an approximately **200 g portion** for its unidentified lac-Saint-Pierre sturgeon filet; that quantity is specific to the retailer’s item and cannot be transferred to white sturgeon. [S04, S07]

Health Canada’s Canadian Nutrient File page for **“Fish, sturgeon, mixed species, raw”** (food code 3069) lists a **90 g Food Guide serving** and a 100 g edible-portion basis. The page is not species-specific and was last modified in 2019; it does not supply a household volume mapping or a white-sturgeon conversion. A 1989 study of cultured *A. transmontanus* reports processing yields across 10–43-month-old fish, including 54–61% for skin-on fillets and 32–50% for skinless fillets from round weight. Those age- and processing-specific yields are not a conversion for the seller’s side or a home recipe. Keep all such observations inactive. Add no density, unit mapping, portion, package yield, or conversion. [S08–S09]

No reviewed recipe or source establishes a directed substitution between white sturgeon and lake sturgeon, Atlantic or shortnose sturgeon, cod, halibut, salmon, or any roe/caviar product. The seller’s texture and cooking descriptions are not equivalence evidence. Add no global or contextual substitution rule and no recipe-line link.

## Integration sketch if the hold is later resolved

If a bundled recipe explicitly requests this fish and the picker can preserve broader choices, represent it as one identity-only `PROTEIN` reference:

- English display: **white sturgeon**.
- Québec French display: **esturgeon blanc**, based on the CFIA and DFO common-name pair. No OQLF headword or Québec *A. transmontanus* retail label was found.
- Add `white sturgeon meat` as an English alias only if the recipe context needs the current seller’s product wording. Do not add bare `sturgeon`, bare `esturgeon`, `lake sturgeon`, `esturgeon jaune`, or the Latin binomial as aliases.
- Keep any future evidence tied to farmed, traceable product. Do not infer wild harvest or apply conservation statements to the farmed SKU.
- Add no forms, measures, density, mappings, recipe links, conversions, yields, or substitutions without a recipe and matching product evidence.

Even with the qualified displays, the current matcher will return white sturgeon as the sole result for `sturgeon` and `esturgeon`. Keep the row out of the active picker until that broader family query can retain appropriate species choices or a recipe-driven review establishes a safe search behavior.

## Source register

Sources were accessed on 2026-10-13. Source IDs are local to this proposal.

| ID | Source | Evidence used | Limits |
|---|---|---|---|
| **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S01** | Canadian Food Inspection Agency, [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | CFIA says the Fish List provides English and French common names acceptable in Canada for fish labelling, scientific names, and related taxonomic identifiers. | The list concerns common-name labelling; it does not establish Québec retail availability, recipe demand, or culinary measures. |
| **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S02** | Canadian Food Inspection Agency, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), entries for *A. transmontanus*, *A. fulvescens*, *A. medirostris*, *A. oxyrinchus*, and *A. sturio*. | Lists *A. transmontanus* as `White Sturgeon / Esturgeon Blanc` and also assigns unqualified `Sturgeon / Esturgeon` names across multiple taxa, including *A. fulvescens* and several other sturgeons. | The live lookup is a nomenclature source, not proof that every listed taxon is currently sold as food in Québec. |
| **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S03** | Fisheries and Oceans Canada, [Farmed species in Canada (English)](https://www.dfo-mpo.gc.ca/aquaculture/farmed-elevage/listing-eng.htm) and [Espèces d’élevage en aquaculture au Canada (French)](https://www.dfo-mpo.gc.ca/aquaculture/farmed-elevage/listing-fra.htm). | Lists white sturgeon / `esturgeon blanc`, *A. transmontanus*, farmed in British Columbia, as well as Atlantic and shortnose sturgeon in New Brunswick. | The page is a farmed-species snapshot last modified in 2015; it is evidence of listed Canadian aquaculture species, not current volume or retail stock. |
| **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S04** | Northern Divine Aquafarms, [White Sturgeon Meat](https://divinecaviar.com/products/northern-divine-sturgeon-meat). | Current product page says the boneless, skin-on fillets are from Fraser River white sturgeon raised on a British Columbia land-based farm; it lists an approximately 6 lb side. | Producer product and farming claims; the binomial is not printed on the page, the package amount is SKU-specific, and Québec delivery/retail availability is not established. |
| **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S05** | Office québécois de la langue française, [esturgeon jaune (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198863/esturgeon-jaune). | Identifies Québec’s commercially relevant edible-fish term `esturgeon jaune` as *Acipenser fulvescens* and says other names are not retained for fish-product marketing labels to avoid confusion. | Entry last updated 2011; supports Québec terminology and the distinct local species, not the name `esturgeon blanc` for a Québec product. |
| **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S06** | Gouvernement du Québec, [Esturgeon jaune](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/esturgeon-jaune). | Identifies *A. fulvescens* and describes its commercial fishery in the St. Lawrence River. | A Québec species and fishery source; it does not identify the taxon in any particular retail fillet. |
| **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S07** | Poissonnerie La Mer, [Filet d’esturgeon QC](https://www.lamer.ca/products/filet-desturgeon-qc-200-gr). | Québec retailer page describes fresh sturgeon from lac Saint-Pierre and an approximately 200 g portion; it shows the item as seasonal/unavailable when reviewed. | No scientific name is given, and the page does not identify the local taxon or support a standard portion for other sturgeon products. |
| **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S08** | Health Canada, Canadian Nutrient File, [serving size: Fish, sturgeon, mixed species, raw](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3069), food code 3069. | Lists 100 g edible portion and one 90 g Food Guide serving for mixed-species raw sturgeon. | The page was last modified in 2019, gives no species-level identification, household measure, or white-sturgeon conversion, and is not activated here. |
| **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S09** | Price et al., [Processing Yields and Proximate Composition of Cultured White Sturgeon (*Acipenser transmontanus*)](https://doi.org/10.1111/j.1365-2621.1989.tb08605.x), *Journal of Food Science* 54(1), 1989, pp. 216–217. | Abstract reports processing yields for cultured fish aged 10–43 months, including skin-on and skinless fillets. | Old, age-specific research; processing yields are based on round fish weights and do not convert the current retail side to edible portion, servings, or recipe units. |
| **WP04-SECTIONP-WHITE-STURGEON-20261013-R66-S10** | Fisheries and Oceans Canada, [Amended recovery strategy for White Sturgeon in Canada (2023)](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/recovery-strategies/white-sturgeon-amended.html). | Identifies white sturgeon as *A. transmontanus* in British Columbia and distinguishes four SARA-listed endangered populations from other white-sturgeon populations. | Conservation and wild-population evidence; it does not make a status claim about the farmed meat SKU or establish a blanket ban on farmed product. |
| **P01** | Existing proposal, [sturgeon-caviar product-boundary review (round 34)](wp04-section-p-sturgeon-caviar-product-boundary-review-20261013-round34.md). | Confirms that the neighboring candidate is caviar/roe and was held separately from whole sturgeon flesh. | Prior scope check, not evidence about meat naming, species, product availability, or recipes. |

## Next action

Keep white sturgeon flesh unallocated in the current picker and ledger. Revisit if a bundled recipe requests it, the recipe’s species wording can be checked against its product label, and search can avoid presenting this species as the sole meaning of the broader `sturgeon` / `esturgeon` queries.

## Root integration outcome

Accepted the hold on 2026-10-13. No catalog or research-ledger data changed; the row remains unallocated because it would make broad `sturgeon` and `esturgeon` searches resolve to a single species without recipe demand. See the [integration record](../batches/wp04-section-p-white-sturgeon-meat-picker-hold-integration-20261013/README.md). No tests were needed for this documentation-only decision.
