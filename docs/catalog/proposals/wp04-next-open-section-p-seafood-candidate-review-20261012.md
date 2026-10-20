# WP04 Section P — common carp / carpe commune picker-boundary review

- **Review and source-access date:** 2026-10-12.
- **Packet type:** source-backed species identity, Québec food-fish evidence, ownership, picker, recipe-demand, and numeric-boundary review.
- **Reconciliation status:** The species-specific hold was accepted on 2026-10-12 and recorded in the [integration note](../batches/wp04-common-carp-picker-boundary-hold-integration-20261012/README.md). The generic carp hold remains as previously recorded.
- **Recommendation:** **Hold** the prospective common-carp identity unallocated. The broad `carp` / `carpe` identity and aliases are already held by the October 10 Section P review (S11/S13 and the “Carp” disposition); this packet does not reopen that generic-name decision. It is a distinct species-specific follow-up for *Cyprinus carpio*, which the earlier review explicitly allowed only with qualified names and no bare aliases. Québec and Canadian sources support the species as a food-fish identity and document a Québec commercial-fishing pathway. But a row named `Common carp / carpe commune` would itself be the only result for both broad queries, so hold the species row too until search can preserve the generic scope or communicate the ambiguity.
- **Research packet delta:** No canonical JSON, research ledger, forms, legacy candidates, recipe, generated Kotlin, or application code changed during this review. Root recorded the accepted hold in the plan and roadmap; no app tests or emulator work were needed for this documentation-only reconciliation.

## Bounded candidate and evidence

The candidate is the species *Cyprinus carpio*, commonly identified by the Québec government as **Carpe commune / Common carp**. This review does not propose an active reference or approve generic `carp` / `carpe` for recipes.

| Prospective ID | Category if later integrated | English display candidate | fr-CA display candidate | Proposed aliases | Taxon |
|---|---|---|---|---|---|
| `ingredient-ref-common-carp` | `PROTEIN` | Common carp | carpe commune | None | *Cyprinus carpio* |

The naming sources have different roles. OQLF’s edible-fish entry pairs Québec-normalized **carpe** with English **carp** and *C. carpio*, and describes the species as having commercial potential in Québec. It labels `carpe commune` as France/Europe terminology. The current Québec government species profile instead uses **Carpe commune / Common carp** as the bilingual species heading, identifies *C. carpio*, and says the fish is commercially caught in the St. Lawrence. MAPAQ’s current freshwater commercial-fishing information includes common carp among permit species and says licensed commercial catch intended for consumption can be sold. These are strong Québec food-fish and fishery-pathway sources, but they do not establish current retail inventory or a particular sold product.

The Canadian Fish List gives fish-label names by species and shows why generic wording needs care: CFIA and the earlier Section P carp review identify `Carp` / `Carpe` names across more than one taxon. Do not apply *C. carpio* to an unqualified Canadian product or recipe merely because it says `carp` or `carpe`. Exclude koi and ornamental forms, Chinese/Asian carp species, crucian carp, mirror/leather/German carp product terms, and any other cyprinid species from this candidate. The Québec species profile distinguishes common carp from koi, goldfish, grass carp, and related fish; shared names or family membership do not merge them.

No species-specific recipe, retail product label, package presentation, or food-preparation state was located in the reviewed catalog or cited sources. Québec’s commercial-fishing page establishes a regulated sale pathway for food fish, not a live stock or retailer listing. The province’s species profile warns that wild-fish consumption requires precautions; a catalog identity must not be read as harvest permission, source approval, or health guidance.

## Prior work and why this is a distinct species follow-up

The broad carp boundary is already covered: the October 10 finfish-gap review’s S11 CFIA Fish List comparison and S13 OQLF entry support holding generic `carp` / `carpe` identities and aliases. Its “Carp” disposition specifically leaves a later *C. carpio* row possible only with species-qualified names and no bare aliases. This proposal honors that prior decision and does not propose either generic alias. The *C. carpio* identity is a distinct refinement not integrated or independently reviewed before this packet; current active, form, legacy, ledger, and archive ownership are audited below. The remaining question is whether the qualified row can safely be discoverable while the generic name stays unresolved. The picker projection shows it cannot: the species display alone captures both broad queries and becomes their only result. So the generic hold remains unchanged, and this species-specific follow-up also recommends hold.

The current Section P hold cases establish the relevant picker rule:

| Held candidate | Broad query and projected species-only result | Existing rationale |
|---|---|---|
| Nile tilapia / tilapia du Nil (*Oreochromis niloticus*) | `tilapia` can surface the Nile-specific candidate alone. | Hold until generic and species-scoped choices remain distinguishable. |
| Cunner / tanche-tautogue (*Tautogolabrus adspersus*) | `tanche` can surface the cunner-specific candidate alone. | Same one-result boundary, with a separate finding that the species is not yet commercialized in Québec. |
| Gilthead bream / dorade royale (*Sparus aurata*) | `bream` and `dorade` can each surface the gilthead-specific candidate alone. | Hold until broad search can preserve or clearly show generic scope. |
| Common carp / carpe commune (prospective) | `carp` and `carpe` would each surface this one species row. | Same one-result boundary; there is no second carp identity or generic row to make the broader scope visible. |

The Québec commercial-fishing evidence makes common carp a real food-fish candidate; it does not change the picker shape. As with Nile tilapia, cunner, and gilthead bream, a qualified display label would remain the only result for a broader query. Hold the species row until search can show a generic option or clearly communicate ambiguity. Do not add an alias as a workaround: the broad words already occur in the qualified displays.

## Exact ownership and live snapshot

The audit checked active reference names and aliases, form labels and match terms, legacy-import candidate names and aliases, ledger record IDs/names, the generated catalog, the Section P plan, and archived proposal/batch files. Search-key normalization mirrors `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase, Unicode NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, normalize punctuation, and collapse whitespace. A broad search phrase occurring in a field is distinguished from an exact stored alias/owner.

| Candidate key or prospective ID | Active reference owner | Active form owner | Legacy candidate owner | Ledger record owner | Archive result |
|---|---|---|---|---|---|
| `ingredient-ref-common-carp` / `candidate-common-carp` | None; both IDs absent | None | None; both IDs absent | None; both IDs absent | No prior species-specific record |
| `common carp` / `carpe commune` | None | None | None | None | Only the earlier generic carp boundary is discussed |
| `Cyprinus carpio` | None | None | None | None | No species-specific allocation |
| `carp` / `carpe` | No exact name or alias owner | None | None | None | Generic identity and aliases already held by the October 10 finfish-gap review (S11/S13); this packet does not reopen that decision |
| `German carp`, `European carp`, `mirror carp`, `carpe allemande`, `carpe européenne`, `carpe miroir` | None | None | None | None | Alternate/product terms remain excluded |

The current broad picker query `carp` has one unrelated substring-fallback result, `ingredient-ref-mascarpone`; `carp` is a character sequence inside `mascarpone`, not an accepted alias or exact owner. The projected common-carp display becomes an exact complete-word phrase match and takes priority over all partial matches, so that fallback disappears and the species row would be the sole result. See the exact projection below.

The live snapshot was read on 2026-10-12. File hashes cover exact bytes. The recipe-corpus digest hashes each manifest-listed relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count / size | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,277 references; 408,948 bytes | `35f1b3b98527b87d15648c9722af9a968e4b160e2b19714d8de66612bbd8d076` |
| `ingredient-forms.v1.json` | 94 forms; 70,793 bytes | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `legacy-import-identities.v1.json` | 65 candidates; 15,508 bytes | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `research-ledger.v1.json` | 1,585 records; 5,630 source entries; 4,661 distinct source IDs; 8 conversions; 5,507,988 bytes | `d75f02fafc1cfd015d10148a9e15c5862b438d190e4c3e8fa0cbc41313ceec97` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,277 references; 559,727 bytes | `1e6be90e14f4ac60ad99a5094946ed329cf6e96fb3340cdebefa660e632ccb6d` |

The hashes document this read-only review snapshot; they are not requests to update those artifacts. The source IDs below are proposal-local, not ledger additions.

## Live picker projection

The picker indexes bilingual reference names and aliases plus form labels/match terms. `IngredientReferenceSearchIndex` returns complete normalized word-phrase matches first and falls back to substring matching only when no complete phrase matches. The table projects one hypothetical display-only row, `Common carp / carpe commune`, with no aliases or forms. This is a static code-based picker projection, not an app UI test.

| Query | Current live results | With hypothetical row | Interpretation |
|---|---|---|---|
| `common carp` | None | Common carp / carpe commune only | Qualified English phrase. |
| `carpe commune` | None | Common carp / carpe commune only | Qualified French species-profile phrase. OQLF labels this wording France/Europe in fish-product terminology; the Québec species profile uses it as its species heading. |
| `carp` | `ingredient-ref-mascarpone` only, from substring fallback | Common carp / carpe commune only | Complete-word `carp` inside the new display wins and suppresses the unrelated partial match. It is not an alias. This would give the broad query a single species-specific result. |
| `carpe` | None | Common carp / carpe commune only | Complete-word phrase inside the French display; it is not an alias. It would give the broad Québec term a single species-specific result. |
| `german carp`, `european carp`, `mirror carp`, `carpe allemande`, `carpe européenne`, `carpe miroir`, `koi` | None | None | Do not add these alternate names as aliases. |

Do not add generic `carp` / `carpe` aliases or automatically link those recipe words to *C. carpio*. The exact phrase-match priority is why a candidate display alone produces a false single-species answer for the broad query even with empty alias arrays.

## Full bundled-recipe demand

All 114 paths in the live manifest, all 1,123 ingredient rows, and all parsed recipe JSON strings were scanned for `common carp`, `carpe commune`, `carp`, `carpe`, *Cyprinus carpio*, the alternate names above, and the prospective ID. Matching used complete normalized word phrases so embedded fragments did not count as fish demand.

**Result: zero matching recipe files and zero matching ingredient rows.** Nearby lines do not identify common carp: `019#8` requests jumbo-lump crab meat; `023#1` requests sliced calamari; `077#10` requests salmon fillets; `093#4` offers free-text “Cooked meat or seafood, to taste” with no reference; `093#6` and `095#5` use fish sauce as a condiment; and `111#1` requests a tuna steak. No recipe link or relink is supported.

## Product, measurement, and substitution limits

The Québec species profile gives a biological size range of 17–75 cm, says the fish can reach 1.2 m and up to 37 kg, and includes a wild-fish consumption precaution. Those are identification and wildlife observations, not fillet/package weights, edible yield, household counts, recipe portions, density, or unit conversions. MAPAQ’s commercial permit source establishes that licensed commercial catch may be sold for consumption, but supplies no product listing, preparation state, recipe amount, or standard measure. No reviewed Canadian/Québec source supports a default portion, fillet weight, count conversion, volume-to-mass mapping, cooking yield, density, or safe cooking/storage instruction for a recipe.

No recipe or reviewed culinary source establishes common carp as a substitute for another carp, freshwater fish, or generic fish. Do not infer interchangeability from taxonomy, freshwater habitat, commercial fishery status, or a shared market category. The Québec profile’s consumption caution is not a transferable food-safety endorsement or a catalog rule.

If the picker boundary is resolved and the French product display is independently confirmed, a future integration would be identity-only: no aliases, forms, measures, density, mappings, recipe links, conversions, yields, or substitutions. This review adds none of those values or records.

## Recommended hold delta

1. Keep `ingredient-ref-common-carp` and `candidate-common-carp` absent from active references, forms, legacy identities, and the research ledger. Do not create a ledger candidate as part of this hold.
2. Add no `Common carp / carpe commune` row or aliases. In particular, do not store bare `carp` or `carpe` as aliases.
3. Add no form, recipe link, default measure, source-specific recipe measure, density, unit mapping, conversion, yield, or substitution.
4. Revisit when picker search can preserve a generic carp choice or clearly communicate that a broad `carp` / `carpe` query has multiple species scopes, and when the French food-product display boundary is settled.

## Sources

Sources were accessed on 2026-10-12. Québec and Canadian government sources support the stated food-fish identity and commercial-fishing context; none of them establishes a current retail SKU or recipe use.

| Proposal source ID | Primary source | Evidence and limits |
|---|---|---|
| WP04-COMMON-CARP-PICKER-HOLD-20261012-S01 | Office québécois de la langue française, [carpe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198858/carpe) | In ichthyology and edible-fish terminology, pairs Québec-normalized `carpe`, English `carp`, and *Cyprinus carpio*; says the species has commercial potential in Québec. Labels `carpe commune` France/Europe and says `carpe allemande`, `carpe cuir`, and `carpe miroir` were not retained for Québec fish-product marketing. Last updated 2011; not current retail evidence. |
| WP04-COMMON-CARP-PICKER-HOLD-20261012-S02 | Gouvernement du Québec, [Carpe commune species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/carpe-commune) | Current profile (updated 2026-10-02) pairs `Carpe commune / Common carp` and *C. carpio*, reports established St. Lawrence/Richelieu/Ottawa River presence and commercial catch in the St. Lawrence, and gives biological length/weight observations and wild-fish consumption precautions. A wildlife profile is not a retailer product specification or recipe measure. |
| WP04-COMMON-CARP-PICKER-HOLD-20261012-S03 | Gouvernement du Québec / MAPAQ, [Permis de pêche commerciale en eau douce](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/permis-peches-aquaculture-commerciales/permis-peche-commerciale-eau-douce) | Names common carp among freshwater permit species and states that licensed commercial catch intended for consumption may be sold. This is a legal commercial pathway, not proof of present inventory, an individual retailer, a product state, or universal harvest permission. |
| WP04-COMMON-CARP-PICKER-HOLD-20261012-S04 | CFIA, [Fish List: Carp query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Carp) | Canadian accepted fish-label common-name list. The earlier Section P query review reports `Carp / Carpe` for *C. carpio* and French `Carpe` names for other carp taxa as well; generic names therefore do not safely assign every product to common carp. Fish List last modified 2023-09-18. |
| WP04-COMMON-CARP-PICKER-HOLD-20261012-S05 | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains that the Fish List supplies accepted English/French names for fish species sold or processed in Canada and that labels must not be false or misleading. Labelling policy, not a recipe identity resolver. |
| WP04-COMMON-CARP-PICKER-HOLD-20261012-S06 | Department of Justice Canada, [Freshwater Fish Marketing Act (PDF)](https://laws-lois.justice.gc.ca/pdf/F-13.pdf) | The current consolidated statute’s marketing schedule lists Carp (*Cyprinus carpio*) / Carpe (*Cyprinus carpio*). This corroborates Canadian food-marketing identity but does not provide a recipe quantity or prove current Québec retail stock. |

Prior Section P boundary context: [finfish gaps review](wp04-finfish-gaps-20261010.md), which holds generic carp/carpe and records the OQLF/CFIA name collision; [Nile tilapia identity hold](wp04-section-p-nile-tilapia-identity-review-20261012.md); [cunner Québec-market hold](wp04-section-p-cunner-quebec-market-hold-review-20261012.md); and [gilthead-bream picker hold](wp04-section-p-gilthead-bream-dorade-royale-picker-boundary-review-20261012.md).

No tests or emulator checks were run for this proposal-only review.
