# WP04 Section P — yelloweye rockfish picker-boundary review (round 14)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** proposal-only identity, Québec naming, picker, ownership, and recipe-demand review.
- **Candidate:** yelloweye rockfish / sébaste aux yeux jaunes (*Sebastes ruberrimus*).
- **Disposition:** **Hold** this species outside the active catalog and research ledger. Canadian and Québec-facing evidence supports the species and bilingual name, but activating a row would make the broad query `rockfish` return this one species alone. There is no bundled recipe demand to justify that risk.
- **Scope:** one new, species-level Pacific finfish gap. This does not reopen the Pacific ocean perch / *S. alutus* hold, the red snapper / *Lutjanus campechanus* and generic snapper hold, the existing Québec redfish market group, Manila clam, or shrimp powder.
- **Worktree scope:** this proposal file only. No catalog JSON, research ledger, plan, roadmap, recipe, generated file, or other shared file was changed.

## Why this is a distinct open gap

Section P keeps regional fish open. A search of the plan, proposals, integration notes, active references, forms, legacy candidates, and ledger found no prior focused identity allocation or review for *Sebastes ruberrimus*, yelloweye rockfish, or sébaste aux yeux jaunes. The nearby records concern different scopes: the active Québec redfish row is a local commercial *Sebastes* group; the [Pacific ocean perch packet](wp04-section-p-pacific-ocean-perch-picker-boundary-review-20261012.md) holds *S. alutus*; and the [red-snapper packet](wp04-section-p-red-snapper-vivaneau-picker-boundary-review-20261012.md) holds *Lutjanus campechanus* and generic snapper / vivaneau. This packet does not merge or revise those decisions.

If the picker boundary is later resolved, the candidate identity would be:

| Candidate ID | Category | English display | Québec French display | Taxon | Possible alias |
|---|---|---|---|---|---|
| `ingredient-ref-yelloweye-rockfish` | `PROTEIN` | **Yelloweye Rockfish** | **sébaste aux yeux jaunes** | *Sebastes ruberrimus* | `yellow-eye rockfish` only, to cover CFIA’s hyphenated spelling |

The candidate ID and alias are descriptive proposals only; neither is allocated. TERMIUM Plus uses **yelloweye rockfish** as the recommended commercial trade name and **sébaste aux yeux jaunes** as the standardized French commercial term. CFIA lists **Yellow-eye Rockfish** as an English label name, and DFO’s British Columbia identification guide pairs **Yelloweye Rockfish / Sébaste aux yeux jaunes** with *S. ruberrimus* [S01, S03, S05]. The evidence supports a species identity; it does not make every market name for the fish a safe search alias.

## Identity and naming boundaries

- Keep this candidate scoped to *Sebastes ruberrimus*. It is not the Atlantic *Sebastes* group marketed in Québec as sébaste, not Pacific ocean perch / *S. alutus*, and not another Pacific rockfish species.
- Do not add bare **rockfish**. CFIA applies that name to many taxa, and the proposed English display itself contains the word `Rockfish`; omitting it from aliases cannot prevent the current picker from matching that query [S01].
- Do not add bare **sébaste** or **redfish**. OQLF’s Québec edible-fish entry defines sébaste at the *Sebastes* genus level and says Québec catches under that term include *S. marinus*, *S. fasciatus*, and *S. mentella*. The current `ingredient-ref-quebec-redfish` row already represents the local market group. A candidate display would make `sébaste` return that group and this Pacific species together; it would not establish that the generic Québec term means yelloweye [S04].
- Exclude **red snapper**, **Pacific red snapper**, **Poisson Rose**, **snapper**, and **red rock cod**. CFIA assigns `Red Snapper / Sébaste aux yeux jaunes` and `Pacific Red Snapper / Poisson Rose` to *S. ruberrimus*, but also assigns `Pacific Red Snapper / Poisson Rose` to other rockfish, including *S. reedi*. TERMIUM notes that `red snapper` is a local British Columbia name for yelloweye and some other red rockfish. Separately, the project has a documented hold on *Lutjanus campechanus* / red snapper and generic snapper terms. None of these source names is a unique alias for this candidate [S01, S03, and the existing red-snapper hold].
- Do not add **sébaste du Pacifique**. Metro’s consumer-advice page uses it alongside the species-qualified name, but gives no scientific name, product lot, or Québec stock listing. Preserve it as source wording rather than assigning it as a global alias [S06].
- Do not infer identity from colour, the `yelloweye` substring, a fishing area, or a family-level fish name. Keep yellow perch / perchaude and the separate yellowmouth rockfish / *S. reedi* outside this identity.

CFIA’s Fish List is a Canadian fish-labelling name source, not a recipe synonym dictionary or proof that a local package belongs to a given species. Its search output gives several names under the target TSN 166740, while also applying broad rockfish and Pacific-red-snapper wording to other taxa [S01–S02]. TSN 166740 is CFIA’s taxonomy identifier; it is not an internal ingredient ID.

## Exact catalog and source-ID collision audit

The exact-key review used the app’s search normalization (lowercase, Unicode NFKD, accent and punctuation folding, and collapsed spaces) across active reference IDs, displays and aliases; form IDs, labels and match terms; legacy-candidate IDs, names and aliases; and ledger record IDs. No exact owner was found for the target English or French names, *Sebastes ruberrimus*, `ingredient-ref-yelloweye-rockfish`, or `candidate-yelloweye-rockfish` in those artifacts. No focused yelloweye identity review was found in the proposal and batch archive.

| Key or nearby allocation | Review result |
|---|---|
| `Yelloweye Rockfish`, `Yellow-eye Rockfish`, `yelloweye`, `sébaste aux yeux jaunes`, *Sebastes ruberrimus* | No exact active reference, form, legacy-candidate, or ledger identity owner. |
| `ingredient-ref-yelloweye-rockfish`, `candidate-yelloweye-rockfish` | Neither ID is allocated in the active references, forms, legacy candidates, or ledger records. |
| `sébaste` | Current picker result is `ingredient-ref-quebec-redfish` — Québec redfish / sébaste du Québec. Do not transfer that group-level term to this species. |
| `rockfish`, `red snapper`, `Pacific red snapper`, `Poisson Rose`, `sébaste du Pacifique` | No exact active picker result. These names remain excluded because authoritative and Québec-facing sources show broader, conflicting, or unverified scope. |
| `ingredient-ref-pacific-ocean-perch` / *S. alutus* | A separate proposal-only hold; not an allocation for yelloweye or for generic Pacific rockfish. |
| red snapper / generic snapper hold | A separate proposal and integration note for *Lutjanus campechanus* and broad snapper / vivaneau wording; not a yelloweye alias allocation. |

The proposal-local source-ID prefix `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-` was absent from the ledger’s allocated source IDs at review time. The S01–S09 labels below are proposal-local references only; they are not ledger additions and do not reuse the R12 or R13 source IDs.

## Phrase-first picker projection

The current ingredient picker searches complete normalized word phrases in reference and attached-form terms before it uses substring fallback [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The live picker was checked with the current references and forms, then projected with the conditional display above and no forms. The one possible spelling alias was included only for its own query.

| Query | Current picker | Conditional candidate result | Boundary |
|---|---|---|---|
| `yelloweye rockfish` | No result | Yelloweye Rockfish / sébaste aux yeux jaunes only | Species-qualified name. |
| `yellow-eye rockfish` | No result | Same candidate only, if the single spelling alias is later used | CFIA hyphenated spelling; do not shorten to `rockfish`. |
| `yelloweye` | No result | Same candidate only | Species-specific portion of the common name; not a separate broad alias. |
| `sébaste aux yeux jaunes` | No result | Same candidate only | Species-qualified French name. |
| `sébaste` | Québec redfish / sébaste du Québec only | Existing Québec group plus the candidate | Retains both current group and Pacific species rather than treating the Québec group name as a species synonym. |
| `rockfish` | No result | Candidate only | Unsafe singleton for a term CFIA uses across many taxa. This is the reason for the hold. |
| `red snapper` | No result | No result with the proposed names and alias | Do not add the CFIA name as an alias: it collides with the separate red-snapper hold and other fish uses. |
| `Pacific red snapper`, `Poisson Rose`, `snapper`, `red rock cod`, `sébaste du Pacifique` | No result | No result with the proposed names and alias | No safe species-specific alias is supported. |

The exact-name pair is well supported, but the present phrase-first behavior would make the broad English query `rockfish` resolve to only *S. ruberrimus*. The candidate should remain unallocated until search can preserve the broader category boundary or a reviewed set of rockfish choices prevents that false narrowing.

## Bundled recipe-corpus demand

All **114 manifest-listed recipe files**, all **1,123 ingredient rows**, and the complete JSON text were scanned for `yelloweye rockfish`, `yellow-eye rockfish`, `yelloweye`, `sébaste aux yeux jaunes`, *Sebastes ruberrimus*, `rockfish`, `rock fish`, `red snapper`, `Pacific red snapper`, `Poisson Rose`, `red rock cod`, and `sébaste du Pacifique`. The manifest-ordered corpus was 753,792 bytes; its review-time fingerprint was `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

**Result: zero matching recipe files and zero ingredient-row hits for every audited term.** No bundled recipe identifies yelloweye, a rockfish product, or a source-specific label that could be resolved to this species. No recipe link or recipe-derived need for a picker row is supported.

## Forms, measurements, and substitutions

| Dimension | Source-scoped evidence | Decision |
|---|---|---|
| Product form | Metro describes the fish as usually sold as fillets; the Canadian supplier page describes cooking methods for its named Pacific Yelloweye Rockfish item. Neither provides a Québec package, declaration, or product-specific portion. | Add no `fillet`, whole, frozen, cooked, or other ingredient form. These pages do not establish a globally reusable product state. |
| Biological size | COSEWIC’s 2020 report gives maximum recorded length of 91 cm and weight of 11.3 kg. These describe biological maxima, not market weights, serving sizes, edible yields, or kitchen measures [S09]. Metro’s undated consumer page gives a different, larger maximum; it is not used for catalog data [S06]. | Store no count weight, portion mass, density, mass/volume mapping, package quantity, or yield. |
| Fishery quota | DFO’s notice for the 2026–27 inside-rockfish commercial fishery sets a 6,500 lb quota cap for yelloweye in area 4B. That is a fishery-management quantity, not a consumer package or recipe measure [S08]. | Do not copy a quota into ingredient measures or infer that any particular consumer product came from area 4B. |
| Culinary use | Metro and the BC supplier describe fillets and ordinary cooking methods, including soup/chowder/casserole use, baking, grilling, steaming, or frying. These are general preparation suggestions, not recipe evidence, a validated cooking yield, or comparative tests [S06–S07]. | Add no conversion, cooking-yield rule, recipe link, or global or contextual substitution to cod, another *Sebastes*, or another finfish. |
| Safety | None of the reviewed sources tests safe cooking, curing, storage, or raw-consumption equivalence with another fish. | Infer no food-safety or raw-use substitution. |

No reviewed source supplies a standard household measure, portion, density, package yield, edible fraction, or species-specific recipe substitution. Keep the identity, if accepted later, identity-only unless new direct evidence supports additional catalog behavior.

## Canadian and Québec evidence limits

The Canadian evidence is strong for the target species and its species-qualified common names. CFIA and TERMIUM are naming references; DFO’s guide is a fish-identification source; the 2026 DFO notice documents a currently managed commercial fishery. None proves that an unlabelled retail fish is *S. ruberrimus* or that a specific product is currently sold in Québec [S01–S03, S05, S08].

Québec evidence is narrower. OQLF’s entry is authoritative for the Québec use of generic sébaste but was last updated in 2012 and describes Atlantic catch species, not yelloweye. Metro’s Québec-facing consumer advice page uses the target name and the broader term sébaste du Pacifique, but its publication date is not shown and it is not a live SKU or taxon-identified package. No species-specific OQLF entry or current Québec product package with a scientific name was located in this review [S04, S06]. The BC supplier’s undated wholesale page is not a Québec retail listing [S07].

These sources support preserving the qualified bilingual species identity as a future candidate. They do not justify activating a row under the current picker or importing broad product names, measures, conversions, or substitutions.

## Source register

Sources were accessed or rechecked on 2026-10-13. These IDs are local to this proposal.

| Source ID | Source | Claim supported and limit |
|---|---|---|
| `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S01` | CFIA, [Fish List results for rockfish](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=rockfish) | Lists *S. ruberrimus* (TSN 166740) with Yellow-eye Rockfish, Pacific Red Snapper / Poisson Rose, Red Snapper / Sébaste aux yeux jaunes, Rockfish, Rosefish, and Snapper. It also uses `Rockfish` across many taxa and Pacific Red Snapper / Poisson Rose for other rockfish, including *S. reedi*. Fish-label name evidence; the underlying CFIA Fish List displays a 2023-09-18 modification date and does not establish current Québec inventory or recipe equivalence. |
| `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S02` | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Describes the Fish List’s purpose and use for Canadian fish common-name labelling and scientific identification. It is not a consumer package verification service or synonym/substitution guide. |
| `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S03` | TERMIUM Plus, [*Sebastes ruberrimus* terminology entry](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=1&i=&index=alt&lang=eng&sg_kp_wet=1591810&srchtxt=RASCASSE) | Identifies yelloweye rockfish as the recommended commercial English term and sébaste aux yeux jaunes as the standardized French commercial term; records `yellow-eye rockfish` as a key term and notes the local non-exclusive use of `red snapper`. Terminology evidence, not a current retailer product label. |
| `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S04` | OQLF, [sébaste, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198848/sebaste) | Defines Québec’s normalized edible-fish term at *Sebastes* sp. scope and describes three species in Québec catches; last updated 2012. It establishes the broad Québec term boundary, not yelloweye identity or current retail availability. |
| `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S05` | Fisheries and Oceans Canada, [BC sport-fishing identification guide (French)](https://www.pac.dfo-mpo.gc.ca/fm-gp/rec/identify-identifier-fra.html) | Pairs Sébaste aux yeux jaunes / Yelloweye Rockfish / *Sebastes ruberrimus* and distinguishes it among other BC rockfish. This is an identification guide, not a food label, consumer product listing, or recipe source. |
| `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S06` | Metro, [English consumer fish guide](https://www.metro.ca/en/products-to-discover/fish-seafood/advice-from-my-fishmonger/anchors-aweigh-discover-exotic-fish) and [Québec French counterpart](https://www.bannieresdeproximite.ca/produits-a-decouvrir/poissonnerie/conseils-de-mon-poissonnier/decouvrez-les-poissons-exotiques) | Uses yelloweye rockfish / sébaste aux yeux jaunes and Pacific-red-snapper / sébaste-du-Pacifique wording; the English page distinguishes this market name from warm-water red snapper. The undated advice pages do not identify a scientific-name package or current stock. Their body-size claims conflict with COSEWIC and are excluded from measurements. |
| `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S07` | Canada Fish Export, [BC seafood products](https://canadafishexports.com/products/) | An accessible supplier page describes “Pacific Yelloweye Rockfish (‘Pacific Red Snapper’)” and suggests several cooking methods. The page is wholesale-oriented, gives no package or lot taxon identifier, is not Québec-specific, and does not establish a recipe substitution or measure. |
| `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S08` | Fisheries and Oceans Canada, [2026–27 inside-rockfish fishery notice](https://www-ops2.pac.dfo-mpo.gc.ca/fns-sap/index-fra.cfm?DOC_ID=367084&ID=all&pg=view_notice) | Notice dated 2026-09-11 updates temporary and permanent quota caps and lists a 6,500 lb yelloweye cap in area 4B. Current commercial-fishery management evidence; not a food-label, retail-supply, package-size, or recipe-amount source. |
| `WP04-SECTIONP-YELLOWEYE-ROCKFISH-PICKER-BOUNDARY-20261013-R14-S09` | COSEWIC, [Yelloweye Rockfish status report (2020)](https://www.canada.ca/en/environment-climate-change/services/species-risk-public-registry/cosewic-assessments-status-reports/yelloweye-rockfish-2020.html) | Gives a 91 cm / 11.3 kg maximum recorded biological size and a 2020 Threatened assessment for inside and outside populations. The report also distinguishes that COSEWIC assessment from the then-current SARA Special Concern listing. Biological and assessment evidence only; not a culinary measure or retail status claim. |

## Recommendation

Keep `ingredient-ref-yelloweye-rockfish` and `candidate-yelloweye-rockfish` unallocated. The species-specific bilingual identity is well supported, but a row titled **Yelloweye Rockfish / sébaste aux yeux jaunes** would make generic `rockfish` a one-result query. Do not add forms, aliases beyond the conditional spelling variant, measurements, recipe links, conversions, yields, or substitutions while the hold stands. Revisit if the picker can preserve broad category results or if a reviewed set of rockfish entries is added together, and if a current Québec product or recipe provides a concrete need.

No app, unit, instrumentation, or emulator tests were run: this is a proposal-only documentation change and no database JSON changed.

## Root integration status

**Integrated as a documentation-only hold.** The candidate remains unallocated because the current picker would make generic `rockfish` a one-result match. No active catalog or research-ledger records were added. Section P remains open.
