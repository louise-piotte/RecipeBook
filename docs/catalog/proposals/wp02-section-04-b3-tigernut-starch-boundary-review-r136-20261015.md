# WP02 Section 04 B3 R136 — tigernut starch product-boundary hold

- **Reviewed:** 2026-10-15.
- **Status:** Proposal-only hold. This review changes no shared catalog JSON, research ledger, checklist, roadmap, generated index, recipe, or application file.
- **Checklist:** WP02 Section 04 B3, `[ ] Water-chestnut flour and other documented regional starches.` The parent remains open.
- **Candidate:** starch isolated from edible tigernut tubers, *Cyperus esculentus* L.; distinct from whole-tuber flour, defatted flour, and flour or meals left after beverage or oil processing.
- **Proposal-local source-ID prefix:** `WP02-B3-TIGERNUT-STARCH-R136-20261015-S`. The candidate phrase, proposed record ID, and prefix were checked against the live references, forms, ledger, legacy identities, plan, and proposal/batch archive. No focused tigernut-starch decision or ID owner was found.

## Recommendation: hold, no delta

Keep tigernut starch out of the active picker and research ledger until a current Canadian or Québec human-food product source identifies the marketed starch fraction and supports a product-specific Québec French name. Primary studies establish starch isolated from *C. esculentus* tubers as a research material separate from whole-tuber flour. One study extracts it from freshly harvested yellow and black tubers; other studies recover starch from defatted meal after oil extraction. These laboratory fractions do not establish a stable consumer-product scope or a Canadian/Québec retail ingredient.

The current Canadian and Québec product evidence located for the adjacent ingredient names whole-tuber tigernut flour, not isolated starch. The Québec government herbarium uses `souchet comestible` for *C. esculentus*. OQLF prefers `amidon` as the general French food-starch term and says `fécule` is used more specifically for starch in tubers or other underground organs. Thus `fécule de souchet comestible` is a transparent possible construction, but neither it nor `amidon de souchet` is attested here as a Québec product name. Keep both inactive.

**No JSON delta is proposed.** Do not add or reserve a reference ID; add no alias, ledger candidate, form, measurement observation, default density, unit mapping, recipe link, conversion, yield, or substitution. Reconsider if a current Canadian or Québec human-food product source identifies isolated tigernut starch, resolves whether the product comes from raw tubers or oil-extraction meal, and supplies usable French product wording.

## Product and Québec naming boundary

| Material or phrase | Disposition | Evidence boundary |
|---|---|---|
| Starch isolated from *C. esculentus* tubers | Hold outside active references and the ledger. | Akonor et al. isolate starch from two varieties of freshly harvested mature tubers using soaking, wet milling, filtering, settling, washing, and drying. This establishes a distinct research fraction, not a Canadian consumer-product specification. [S01] |
| Starch recovered from defatted tigernut meal | Keep as a separate research feedstock description; do not silently include it in an unqualified consumer identity. | Miao et al. study starch from meal remaining after oil extraction and report that extrusion pretreatment changes extraction yield and properties. This is an oil-processing by-product and a method-specific sample, not evidence that a retail product called tigernut starch has that scope. [S02] |
| `tigernut starch` / `tiger nut starch` | Research names only; do not activate. | Primary literature uses tigernut-starch wording for isolated fractions. The reviewed Canada/Québec product pages use flour or tuber wording, not a standalone isolated-starch label. [S01–S02, S05–S06] |
| `fécule de souchet comestible` | Descriptive fr-CA construction only; do not add as display or alias. | `souchet comestible` is a Québec government herbarium name for *C. esculentus*, while OQLF describes `fécule` as the more specific term for starch from tubers. Neither source attests the full phrase as the name of a marketed tigernut starch. [S03–S04] |
| `amidon de souchet` | Do not add as display or alias. | OQLF supports `amidon` generally but does not attest this compound. It also lacks the species qualifier supplied by `souchet comestible`. [S03–S04] |
| Whole-tuber tigernut flour / `farine de souchet` | Keep the existing `ingredient-ref-tigernut-flour` unchanged. | Canadian and Québec product sources identify ground whole tubers as flour. Flour contains the ground tuber material and is not the wet-separated starch fraction. [S05–S06] |
| Defatted tigernut flour / `farine de souchet dégraissée` | Keep the existing `ingredient-ref-defatted-tigernut-flour` unchanged and separate. | The live row represents flour from material after oil extraction and further processing; it is not an alias or form of isolated starch. [current catalog; existing record sources] |
| `chufa`, `tiger nut`, `souchet comestible`, `amande de terre`, `noix tigrée`, and similar tuber names | Do not add to a starch row as bare aliases. | These names refer to the edible tuber or species, not to an isolated starch product. A bare term would overstate the match and could direct the user to starch when they mean the tuber or flour. [S03, S05–S06] |
| Modified, resistant, retrograded, or meal-derived starch grades | Keep outside this candidate unless a product-specific review establishes the scope. | Laboratory treatments and oil-extraction feedstocks affect properties; they do not define interchangeable retail grades or preparation forms. [S01–S02] |

The market search on 2026-10-15 used the exact English and French phrases `tigernut starch`, `tiger nut starch`, `chufa starch`, `amidon de souchet`, and `fécule de souchet`, including Canada/Québec-qualified searches. It surfaced primary research and listings for flour, whole tubers, or products made from those materials, but no current Canadian/Québec standalone human-food tigernut-starch listing. This is a bounded search result, not proof that no such product is sold.

## Live catalog, archive, and picker audit

The read-only snapshot contains **1,488 ingredient references, 109 forms, 1,833 research-ledger records, 61 legacy-import candidates, and 114 manifest-listed recipes / 1,123 ingredient rows**.

| Surface | Finding |
|---|---|
| Active references | The only matching rows are `ingredient-ref-tigernut-flour` (`tigernut flour / farine de souchet`) and `ingredient-ref-defatted-tigernut-flour` (`defatted tigernut flour / farine de souchet dégraissée`). Both currently have empty alias arrays, `defaultDensity: null`, and `unitMappings: []`. No `tigernut starch`, `tiger nut starch`, or `chufa starch` row is active. |
| Active forms | No tigernut forms or form search terms are present. Extraction, settling, washing, and drying in a laboratory method are not consumer preparation forms. |
| Research ledger | The only tigernut records are the verified whole-tuber flour and defatted-flour rows. No `candidate-tigernut-starch`, tigernut-starch source prefix, or accepted starch decision is present. Do not transfer the whole-flour density or substitution research state to isolated starch. |
| Legacy identities | The 61 current legacy candidates contain no tigernut-starch identity or proposed reference ID. |
| Proposal/batch archive and plan | The open B3 parent remains unchecked. The earlier tigernut-flour boundary proposal says extracted starch is outside that flour row and cites a starch-extraction review, but it makes no focused B3 decision. The focused archive contains no prior tigernut-starch proposal or integration. This candidate does not reopen the earlier sago-starch hold, plantain-starch hold, Tacca/pia hold, or any other reviewed B3 candidate. [S07] |

`IngredientSearch.kt` normalizes accents and punctuation, prefers complete word-phrase matches, then falls back to substring matching. A static projection over the live names, aliases, and forms gives:

| Query | Current picker results | If a hypothetical `tigernut starch / fécule de souchet comestible` row were added | Boundary |
|---|---|---|---|
| `tigernut starch`, `tiger nut starch`, `fécule de souchet comestible` | None | Hypothetical row only | Qualified terms would find the product directly, but current market and French-name evidence do not justify activating it. |
| `tigernut` | Whole-tuber tigernut flour; defatted tigernut flour | Both flour rows plus the starch row | A broad source-name query would correctly become a three-product choice if a distinct starch row were later supported. |
| `souchet` | Whole-tuber flour; defatted flour | Both flour rows plus the starch row | The French source term would intentionally surface all three products; no alias should be added to an existing flour row. |
| `tiger nut`, `chufa`, `souchet comestible`, `amande de terre`, `noix tigrée` | None | No result unless a bare tuber name were added as an alias | Keep these terms off a starch row; using them could make a raw-tuber query appear to resolve only to starch. |
| `starch` / `amidon` | Many existing starch references | Existing results plus the candidate | Broad family queries remain multi-result and are not a reason to add generic aliases. |

The hypothetical English display uses the joined spelling `tigernut starch` to stay consistent with the live `tigernut flour` row; `tiger nut starch` remains a separate phrase and should not be added as an alias without a product source. The French construction is only for picker-impact analysis, not an accepted display or alias.

## Measurements, forms, substitutions, and recipe demand

- **Measurements:** Akonor et al. report laboratory starch composition and functional properties, including amylose values of 19–21% for their yellow and black cultivar samples. These are sample-specific physicochemical data, not a household mass-volume pair, bulk density, package serving, or kitchen measure. Miao et al.'s extraction-yield observations depend on defatted feedstock and extrusion pretreatment; do not treat them as a home-processing yield or unit conversion. [S01–S02]
- **Forms:** Add none. A laboratory extraction sequence or oil-extraction feedstock distinction does not establish a repeatable consumer form family or same-ingredient conversion path.
- **Substitutions:** Add none. The reviewed primary characterization/extraction studies do not test a general tigernut-starch replacement ratio for a recipe. Do not infer equivalence with tigernut flour, arrowroot, corn, potato, tapioca, or another starch from similar thickening or food-application language. No global or contextual substitution rule is supported. [S01–S02]
- **Recipe demand:** A manifest-ordered read-only scan of all **114 recipe files and 1,123 ingredient rows** found zero occurrences of `tigernut`, `tiger nut`, `tiger-nut`, `chufa`, `souchet`, `souchet comestible`, `amande de terre`, `noix tigrée`, `Cyperus esculentus`, `tigernut starch`, `tiger nut starch`, `chufa starch`, `amidon de souchet`, or `fécule de souchet`. No recipe line links to a tigernut-starch ID. No recipe link, relink, or substitution is proposed. |

## Source register

Sources were checked or rechecked on 2026-10-15. IDs below are proposal-local only; no ledger record is proposed.

| ID | Source and bounded evidence |
|---|---|
| **WP02-B3-TIGERNUT-STARCH-R136-20261015-S01** | P. T. Akonor et al., [“Physicochemical, Microstructural, and Rheological Characterization of Tigernut (*Cyperus esculentus*) Starch”](https://pmc.ncbi.nlm.nih.gov/articles/PMC6582905/), *International Journal of Food Science* (2019), Article 3830651. Primary study isolates starch from freshly harvested mature yellow and black tigernuts and analyzes the recovered material separately. It reports sample-specific composition and functional results, including amylose values of 19–21%. It does not establish a Canadian product, consumer specification, household measure, or transferable substitution. |
| **WP02-B3-TIGERNUT-STARCH-R136-20261015-S02** | Wen-Bo Miao et al., [“The physicochemical properties of starches isolated from defatted tigernut meals: Effect of extrusion pretreatment”](https://www.sciencedirect.com/science/article/pii/S0144861722010578), *Carbohydrate Polymers* (2022). Primary study isolates starch from meals remaining after oil extraction and examines how extrusion pretreatment changes yield and properties. This is process- and feedstock-specific research, not proof of a standalone food product in Canada or Québec. |
| **WP02-B3-TIGERNUT-STARCH-R136-20261015-S03** | Gouvernement du Québec, Herbier du Québec, [*Souchet comestible*](https://herbierduquebec.gouv.qc.ca/produit/souchet-comestible/). The entry gives French `souchet comestible`, English `perennial yellow flatsedge`, and Latin *Cyperus esculentus*. It names the plant, not an extracted starch product. The direct page returned rate limiting during this pass; the indexed government entry was available. |
| **WP02-B3-TIGERNUT-STARCH-R136-20261015-S04** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Prefers `amidon` generally and says `fécule` is used more specifically for starch in tubers or other underground organs. It does not attest `fécule de souchet comestible` or `amidon de souchet` as a product name. |
| **WP02-B3-TIGERNUT-STARCH-R136-20261015-S05** | Delish Kitch, [*Tigernut “Extra Fine” Flour, Organic*](https://delishkitch.ca/product/tigernut-flour-12-5-kg-im-interested-in-purchasing-some/), Ontario, accessed 2026-10-15. The current page marks the flour in stock and lists organic extra-fine tigernut flour as its ingredient; it describes combining the flour with starchier binders such as arrowroot or tapioca. This is Canadian product-boundary evidence for flour and adjacent starches, not a tigernut-starch listing. The page has inconsistent package-size text, so no size is carried into this proposal. |
| **WP02-B3-TIGERNUT-STARCH-R136-20261015-S06** | La Moisson, Québec retailer, [*Farine de noix tigrées*](https://lamoisson.com/collections/farines-preparations-flour-meal-flour-mixtures/products/farine-de-noix-tigrees). The current indexed product page identifies a flour product; the existing ledger source record says the page describes it as `farine de souchet` and lists edible tiger nuts/tubers as the sole ingredient. This supports local flour wording only, not isolated starch. |
| **WP02-B3-TIGERNUT-STARCH-R136-20261015-S07** | [WP02 tigernut-flour boundary review (2026-10-10)](wp02-tigernut-flour-boundary-review-20261010.md). The focused B4 flour review explicitly keeps extracted starch outside the directly ground whole-tuber flour identity and cites a 2024 starch review. It does not decide a B3 identity, product scope, or Québec starch name. |

## Review record

Read current `AGENTS.md`, `Requirements.md`, `roadmap.md`, and the live WP02 Section 04 B3 plan section. Audited current references, forms, research ledger, legacy-import candidates, the tigernut-flour proposal, the relevant B3 archive, and the manifest-listed recipe bundle. Replayed candidate query effects from the current `IngredientSearch.kt` phrase-first/substring-fallback behavior. Searched the current Canadian and Québec product web for the exact candidate English and French phrases listed above. The Herbier du Québec page returned rate limiting in direct retrieval; its indexed government record was available. The La Moisson page was also only available through its current indexed listing in this pass; its product wording and ingredient scope are corroborated by the existing 2026-10-11 ledger source record. These retrieval limits are why the proposal does not make a negative claim beyond the bounded search.

No tests were run. This turn changed only this proposal document; the project instruction says database JSON-only additions need no tests, and no database JSON was changed here.

## Reconsideration conditions

1. Locate a current Canadian or Québec human-food product label or supplier specification for isolated tigernut starch, and determine whether it is recovered from untreated tubers or oil-extraction meal/cake.
2. Obtain product-specific French wording or independent Québec terminology review before activating `fécule de souchet comestible`, `amidon de souchet`, or any alias.
3. Recheck the live picker when that evidence appears. Keep bare tuber names off the starch row; do not alias it to either flour identity.
4. Keep density, mappings, forms, measurements, recipe links, conversions, yields, and substitutions absent unless separate evidence supports each behavior.
5. Leave WP02 Section 04 B3 open; this proposal does not complete the regional-starch checklist item.
