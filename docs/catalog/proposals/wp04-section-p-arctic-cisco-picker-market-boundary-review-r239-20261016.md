# WP04 Section P — Arctic cisco picker and market-boundary review (R239)

- **Review and source-access date:** 2026-10-16.
- **Candidate:** Arctic cisco / cisco arctique, *Coregonus autumnalis*.
- **Packet type:** Proposal-only regional-fish identity, Québec terminology, picker, product, and recipe-demand review.
- **Disposition:** Hold `ingredient-ref-arctic-cisco` unallocated. CFIA and TERMIUM support the species-specific bilingual name pair, but a row named `Arctic cisco / cisco arctique` would make bare `cisco` return one species in the current phrase-first picker. CFIA and OQLF show that cisco terminology spans multiple *Coregonus* species. The sources establish northern subsistence use and U.S. specialty-product listings, but not a current species-identified Québec or Canadian retail product. No bundled recipe demand was found. Add no reference, alias, form, legacy mapping, ledger record, recipe link, measurement, conversion, yield, or substitution.
- **Worktree scope:** This proposal file only. Shared catalog JSON, ledger, plan, roadmap, recipes, generated files, batches, and application code were read only.

## Candidate and prior-work boundary

The open Section P finfish checklist continues to include regional fish ([catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5439)). The candidate is *Coregonus autumnalis*, called Arctic Cisco / Cisco Arctique by CFIA and Arctic cisco / cisco arctique by the Government of Canada's Translation Bureau. Parks Canada's French page also names `cisco arctique (Coregonus autumnalis)` in its northern-fish habitat description.

This is a distinct species-level boundary, not a continuation of the earlier lake-herring / cisco review. The [R8 cisco/tullibee review](wp04-section-p-cisco-tullibee-name-market-scope-hold-review-20261012-round8.md) explicitly excluded *C. autumnalis* from its *C. artedi* candidate, and the [lake-whitefish review](wp04-section-p-lake-whitefish-identity-review-20261012.md) listed Arctic cisco separately from *C. clupeaformis*. Those are boundary mentions, not a focused Arctic-cisco allocation or hold. No dedicated Arctic-cisco proposal, batch, reference, form, legacy mapping, or ledger record was found.

Keep Arctic cisco distinct from lake herring / cisco de l'Est (*C. artedi*), lake whitefish / grand corégone (*C. clupeaformis*), other cisco-named taxa, Arctic char, and Arctic cod. OQLF describes `cisco` / `corégone` as a broad group of *Coregonus* species and excludes lake whitefish; its examples include *C. artedii*, *C. sardinella*, and *C. laurettae*, but do not name *C. autumnalis*. CFIA separately lists `Cisco` for *C. artedi* and several other *Coregonus* rows. These sources support a cisco-name collision; they do not make the species interchangeable.

| Unallocated candidate ID | Proposed English display | Proposed Québec French display | Taxon | Aliases proposed |
|---|---|---|---|---|
| `ingredient-ref-arctic-cisco` | Arctic cisco | cisco arctique | *Coregonus autumnalis* | None |

The identity pair is for review only. Do not add bare `cisco`, `corégone`, `omul`, `salmon-herring`, a taxon name, or other terms as aliases in this hold. TERMIUM lists `salmon-herring` as another correct English term for the species, but no recipe or product label in the reviewed corpus establishes it as a useful app alias. The North Fish USA page's `also known as: Omul` wording is product copy without a binomial; it is not sufficient to make `omul` a global identity alias.

## Exact ownership and live snapshot

The exact-name audit follows `normalizeIngredientSearchKey` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, fold `œ`, `æ`, `ß`, and `&`, remove combining marks, replace punctuation with spaces, and collapse whitespace. It checked active-reference IDs, bilingual names, and aliases; form IDs, labels, and match terms; legacy-candidate IDs, names, and aliases; and ledger `recordId` values. The proposal and batch archive was also searched for focused candidate decisions and source-ID collisions.

| Phrase or key | Exact active reference / form / legacy / ledger-record owner | Finding |
|---|---|---|
| `Arctic cisco`; `cisco arctique`; *Coregonus autumnalis* | None | No exact identity field owner. |
| `cisco`; `cisco de l'Est`; `lake herring`; `corégone`; `salmon-herring`; `omul` | None | No exact stored field owner. `salmon-herring` and `omul` appear in terminology or product wording, but neither is proposed as an alias. |
| `ingredient-ref-arctic-cisco`; `ingredient-form-arctic-cisco`; `candidate-arctic-cisco` | None | No reference, form, legacy, or ledger ID is allocated. |
| `ingredient-ref-lake-whitefish`; `ingredient-ref-smoked-lake-whitefish` | Existing adjacent identities only | They remain separate lake-whitefish references; neither owns cisco names or *C. autumnalis*. |

At the audit snapshot, the live package held **1,635 ingredient references**, **122 forms**, and **114 manifest-listed recipes**; the legacy file held **61 candidates**, and the ledger held **1,980 records**. Exact-byte hashes and the recipe-corpus digest below record the snapshot used for this review. The global and contextual substitution-rule files each contain **0 rules**. No exact URL for any new source below was present in the ledger. The source IDs assigned to these sources were checked absent from the ledger and proposal/batch archive before this file was added. The three R8 source IDs reused here identify the same CFIA, OQLF, and Health Canada pages and are not duplicate source entries.

| Artifact | Count / bytes | SHA-256 or digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,635 references; 528,957 bytes | `5c37b0adcac83062a293fbb300acd8dd39c11cbbcbed53f98245a3b569d81448` |
| `ingredient-forms.v1.json` | 122 forms; 92,787 bytes | `d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1` |
| `legacy-import-identities.v1.json` | 61 candidates; 14,525 bytes | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| `research-ledger.v1.json` | 1,980 records; 8,652 source entries; 7,333 distinct source IDs; 8,746,653 bytes | `9ae52d45fe58338945f29b35d02a35cf139d60db122a9f33611dfc6f97a8f14a` |
| `manifest.v1.json` | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,928 recipe bytes | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

## Picker behavior and alias collisions

The current picker indexes bilingual reference names and aliases together with attached form labels and match terms. It returns complete normalized word-phrase matches before using substring fallback. The following static projection uses only the current rows plus the proposed display pair, with no aliases or forms:

| Query | Current results | With proposed display pair | Decision |
|---|---|---|---|
| `Arctic cisco`; `cisco arctique` | None | `ingredient-ref-arctic-cisco` | Qualified name pair would be selectable. |
| `cisco` | None | `ingredient-ref-arctic-cisco` only | Hold: the French display contains the broad word `cisco`; CFIA assigns Cisco names to multiple species, and OQLF treats cisco as a broader fish term. |
| *Coregonus autumnalis* | None | None | No scientific-name alias is proposed. |
| `salmon-herring`; `omul` | None | None | Do not add aliases from the terminology or manufacturer's wording without product/recipe need and a collision review. |
| `corégone` | Lake whitefish and smoked lake whitefish | Same two results | Existing broad corégone results remain unchanged. |
| `whitefish` | Lake whitefish and smoked lake whitefish | Same two results | Existing results remain unchanged. |
| `Arctic` | Arctic char and Arctic cod | Those two plus Arctic cisco | The qualified display adds one broad prefix result. |

`fish` and `poisson` result sets are also unchanged because neither word appears in the proposed pair. Do not use the candidate to resolve an unqualified recipe or import line containing only `cisco`, `corégone`, `whitefish`, or generic fish. Reconsider if the picker can preserve a general cisco choice alongside species-specific entries, or if the intended record is otherwise unambiguous.

## Full recipe-corpus demand audit

All 114 recipe paths in manifest order were read. The audit inspected all 1,123 ingredient rows and every parsed string value in every recipe file for `Arctic cisco`, `cisco arctique`, *C. autumnalis*, `cisco`, `cisco de l'Est`, `lake herring`, `Coregonus`, `salmon-herring`, and `omul`.

**Result: zero matching ingredient rows and zero matching recipe files.** No bundled recipe links to an Arctic-cisco reference or form or supplies a species-qualified request, amount, preparation, cooking method, or serving context. Nearby seafood rows do not establish demand for this taxon.

## Québec/Canadian terminology and product evidence

- **Canadian fish nomenclature:** CFIA's Fish List pairs *C. autumnalis* with Arctic Cisco / Cisco Arctique and describes its English and French common names as acceptable for fish labelling in Canada. The list is nomenclature evidence, not a retail inventory. It also shows the collision: other *Coregonus* species have `Cisco` in English or French name rows.
- **Québec terminology:** OQLF's 2011 GDT entry treats cisco / corégone as a group term for diverse *Coregonus* species. It notes `hareng de lac` and `poisson blanc` were not retained for Québec commercial fish-product naming, and that `poisson blanc` is also culinary wording for pale-fleshed fish. It does not list *C. autumnalis* among its examples, so it is evidence of broad naming scope, not the exact Arctic-cisco pair. TERMIUM's 2016 species record and Parks Canada's northern-fish page independently pair *C. autumnalis* with `cisco arctique`.
- **Regional use:** Fisheries and Oceans Canada's 2008 report documents a subsistence fishery for Arctic cisco in Tuktoyaktuk Harbour during 1997–1999, described as important to that community. Its annual harvest estimates are historical, local fishery data, not current Canadian retail or Québec product evidence.
- **Product check:** The current North Fish USA wholesale page lists `Arctic Cisco`, says `also known as: Omul`, and describes it as `Cold-smoked · v/p` (vacuum-packed). The listing gives no binomial, Québec French label, or pack size. A separate Cold Cure Fish Co. product page names `Cold Smoked Arctic Cisco “Omul” (Direct from Siberia)` and offers 8 oz / 16 oz variants, but was marked sold out when reviewed; it gives no binomial or Québec French name. These non-Canadian product pages do not establish Canadian distribution. A bounded search for the exact English, French, and scientific names did not find a current identity-verified Québec or Canadian retail listing.

## Measures, forms, conversions, yields, and substitutions

- Health Canada's Table 8 lists generic `Cisco (lake herring, tullibee), raw` at 90 g and `Cisco (lake herring, tullibee), baked or broiled` at 75 g. Neither entry gives a binomial or product identity. Keep these as generic table observations; do not assign either value to *C. autumnalis* or infer a raw-to-cooked conversion from the separate food entries.
- The DFO report's fork lengths, biological weights, and harvest counts are fishery and biological observations, not household measures, edible yields, or recipe portions. The 8 oz / 16 oz variants in one U.S. product page are SKU-specific package sizes, not general portions or conversions; the North Fish USA listing supplies no pack size. No species-specific density, household measure, fillet weight, cooking yield, conversion, or portion basis was found.
- Add no fresh, whole, fillet, cooked, or smoked form, unit mapping, density, yield, or conversion. The manufacturer's cold-smoked wording is one product listing, not evidence for a general catalog form or a Québec product.
- No global or contextual substitution rule exists in the current seed files, and no recipe asks for this species. No reviewed source supports a direction-, dish-, method-, and quantity-specific substitution. Do not substitute Arctic cisco for lake whitefish, lake herring/cisco, Arctic char, Arctic cod, or another fish based on shared family, habitat, or culinary similarity.

## Recommended disposition

Keep `ingredient-ref-arctic-cisco` unallocated in active references, forms, legacy identities, and the research ledger. The exact species and bilingual name pair are well supported, but adding that pair would silently turn a broad `cisco` search into a single-species selection. The northern fishery report does not establish current retail availability; the product pages reviewed do not establish Canadian supply or a Québec French label; and the bundle contains no matching recipe demand. Add no aliases, forms, recipe links, measures, conversions, yields, or substitutions. Reopen this review if picker behavior preserves generic and species-specific cisco choices, or if a recipe or Québec product source resolves both intended identity and product state.

## Sources

Sources were checked on 2026-10-16. IDs are proposal-local and are not ledger additions. `R8-S01`, `R8-S02`, and `R8-S03` are reused from the prior cisco/tullibee review for the same CFIA, OQLF, and Health Canada sources.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-CISCO-TULLIBEE-SCOPE-20261012-R8-S01` | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Lists *C. autumnalis* as Arctic Cisco / Cisco Arctique and describes Fish List names as acceptable Canadian fish-labelling common names. Nearby rows assign Cisco to *C. artedi* and several other taxa. Nomenclature evidence only; not proof of market supply. |
| `WP04-CISCO-TULLIBEE-SCOPE-20261012-R8-S02` | OQLF, [GDT: cisco](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198956/cisco) | Describes cisco / corégone as a group of diverse *Coregonus* species, gives examples, excludes lake whitefish, and discusses Québec fish-product wording. Updated 2011; it does not name *C. autumnalis* in its examples and is not current retail evidence. |
| `WP04-SECTIONP-ARCTIC-CISCO-R239-20261016-S01` | Parks Canada, [Poissons et mammifères marins — Le site canadien des pingos](https://parcs.canada.ca/lhn-nhs/nt/pingo/environment/poissons-fish) | French-language wildlife page identifies `cisco arctique (Coregonus autumnalis)` among fish in northern estuaries. Supports the French species name and habitat context, not consumer or market wording. |
| `WP04-SECTIONP-ARCTIC-CISCO-R239-20261016-S02` | Government of Canada Translation Bureau, [TERMIUM Plus: Coregonus autumnalis](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enr&lang=eng&srchtxt=COREGONUS+AUTUMNALIS) | Official 2016 terminology record pairs *C. autumnalis* with Arctic Cisco and cisco arctique; it also lists salmon-herring as a correct English term. Terminology evidence, not a product listing or alias recommendation. |
| `WP04-SECTIONP-ARCTIC-CISCO-R239-20261016-S03` | Fisheries and Oceans Canada, [Assessment of the subsistence fishery and biological data for Arctic Cisco in Tuktoyaktuk Harbour, 1997–1999](https://publications.gc.ca/collections/collection_2014/mpo-dfo/Fs97-4-2845-eng.pdf) | 2008 report identifies *C. autumnalis* and describes the historical Tuktoyaktuk subsistence fishery as important to the community. Harvest counts and fish measurements are local historical evidence, not recipes, household measures, or current retail supply. |
| `WP04-SECTIONP-ARCTIC-CISCO-R239-20261016-S04` | North Fish USA, [Wholesale smoked fish products](https://northfishusa.info/product.html) | Current listing names Arctic Cisco, says `also known as: Omul`, and specifies cold-smoked/vacuum-packed. It gives no binomial, French name, or pack size; no Canadian distribution or Québec sale is established. |
| `WP04-SECTIONP-ARCTIC-CISCO-R239-20261016-S05` | Cold Cure Fish Co., [Cold Smoked Arctic Cisco “Omul” (Direct from Siberia)](https://coldcurefishco.com/products/cold-smoked-arctic-cisco-omul-direct-from-siberia?variant=43351025188912) | Product page identifies a cold-smoked item and 8 oz / 16 oz size options, but was marked sold out when accessed. It supplies no binomial or Québec French name, so it does not establish Canadian market availability, a catalog form, or a general measure. |
| `WP04-CISCO-TULLIBEE-SCOPE-20261012-R8-S03` | Health Canada, [Nutrient Value of Some Common Foods, Table 8: Fish and Shellfish](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/table-8-fish-shellfish-nutrient-value-some-common-foods-2008.html) | Lists generic cisco (lake herring, tullibee) at 90 g raw and 75 g baked/broiled. No species binomial or product is supplied; these amounts are not assigned to Arctic cisco or treated as a conversion. |

No software tests or emulator checks were run; this is a proposal-only research file and changes no database JSON.
