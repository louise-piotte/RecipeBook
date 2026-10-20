# WP05 Section W R989 generic condiment identity review: gukganjang

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal only. No shared catalog JSON, ledger, plan, roadmap, recipe, generated file, or test was edited.
- **Open checklist parent:** Section W still lists `ganjang` in “Gochujang, doenjang, ssamjang, chunjang, ganjang, gochugaru, named kimchi types, fermented shrimp, and other jeotgal” in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10339). This packet reviews only the narrower, source-named Korean soup-seasoning type `gukganjang`; it does not resolve or close unqualified `ganjang` or the checklist parent.
- **Scope:** One generic Korean condiment identity. This is distinct from R984 barley meal, R985 caimito, and R986 yeolmu-kimchi. No brands, product lines, flavour families, SKUs, retailer variants, or cultivar rosters were researched. The Section W checklist scan found no roster-only commercial task. If one is queued later, record it as out of scope because commercial-product counts do not add ingredient diversity, then stop that line. Preserve all existing branded rows and product-scoped evidence.

## Recommendation

Propose an identity-only reference for **gukganjang**, the Korean soy-sauce type named by the Korea Tourism Organization and used in soups, stews, and namul. Keep the KTO spelling `gukganjang` as the English display and provisionally borrow that name for fr-CA because this review did not establish a Québec French display. Add no aliases. In particular, do not make unqualified `ganjang`, `Korean soy sauce`, `soy sauce`, or `sauce soya` an alias of the new row.

The catalog already has a generic soy-sauce identity. A separate, narrowly named Korean culinary type adds a documented ingredient distinction alongside the existing Japanese soy-sauce style identities. It does not imply that every ingredient named `ganjang` is `gukganjang`, establish a universal manufacturing specification, or support a substitution from generic soy sauce.

## Ownership and current boundaries

The live package snapshot contains **2,003 ingredient references**, **205 forms**, **55 legacy-import candidates**, **2,408 research-ledger records**, and **114 manifest-listed recipes**. Case-, punctuation-, and accent-normalized checks of reference IDs, names and aliases; form labels and match terms; legacy candidates; and ledger records found no exact owner for `gukganjang`, `guk-ganjang`, `guk ganjang`, `soup soy sauce`, `soy sauce for soup`, `Korean soup soy sauce`, `hansik ganjang`, `han-sik ganjang`, `joseon ganjang`, `국간장`, `한식간장`, or `조선간장`. No form or legacy candidate owns these names. The proposed ID `ingredient-ref-gukganjang` and source prefix `WP05-SECTIONW-GUKGANJANG-R989-20261019-` are unallocated.

The generic term is already bounded. The National Institute of Korean Language dictionary translates `ganjang` as `soy sauce` and defines it as a salty dark liquid used to season food. The current `ingredient-ref-soy-sauce` owns the exact generic display `soy sauce / sauce soya` and its existing aliases `shoyu / sauce soja`; it does not currently have `ganjang` as an alias. Keep the broad alias question open, and do not make `ganjang` an alias of the narrow Korean name below. The prior Korean-condiment review held generic `ganjang` pending a crosswalk. This proposal addresses one named cooking type, not that broader language question. [S03; prior hold: `wp05-east-asian-korean-pastes-followup.md`]

| Active identity | Existing scope | Boundary retained |
|---|---|---|
| `ingredient-ref-soy-sauce` — `soy sauce / sauce soya` | Broad soy-sauce identity with aliases `shoyu / sauce soja`. | Keep ownership of its current generic display and aliases. The dictionary maps the broad Korean word `ganjang` to `soy sauce`, but a `ganjang` alias decision remains open; do not attach that broad term to `gukganjang`. [S03; live record] |
| `ingredient-ref-light-soy-sauce` and `ingredient-ref-dark-soy-sauce` | Existing light and dark soy-sauce identities. | Cooking use in Korean soups does not make `gukganjang` an alias or form of either identity. |
| `ingredient-ref-koikuchi-soy-sauce`, `ingredient-ref-usukuchi-soy-sauce`, `ingredient-ref-white-soy-sauce`, and `ingredient-ref-saishikomi-soy-sauce` | Existing named Japanese soy-sauce styles. | Keep their Japanese names and evidence separate. A shared liquid seasoning role does not transfer style identity or measurements. |
| `ingredient-ref-tamari` | Existing separate soy-derived condiment identity. | Do not cross-alias or infer substitution from Korean origin or soup use. |
| `ingredient-ref-doenjang` | Korean fermented soybean paste. | The Rural Development Administration describes soy sauce liquid and residual soybean solids as separate foods in a Korean preparation account. Keep the sauce distinct from doenjang; do not transfer the account’s process as a universal household method. [S02] |

No existing branded row, manufacturer claim, or product measurement is being generalized or reused. No product-scoped evidence is proposed for transfer; any future reuse requires a separate transferability review.

## Exact bundled-recipe demand

All **114** manifest-listed recipe JSON files and **1,123** ingredient rows were searched, including serialized recipe text and ingredient fields. The bounded query set (`gukganjang`, `guk-ganjang`, `guk ganjang`, `soup soy sauce`, `soy sauce for soup`, `Korean soup soy sauce`, `han-sik ganjang`, `hansik ganjang`, `joseon ganjang`, `국간장`, `한식간장`, and `조선간장`) returned **zero recipe-file and ingredient-row hits**. There is no direct bundled demand, recipe role, recipe-derived measure, or recipe line to link.

The broader exact phrase `soy sauce` appears on three existing rows. None establishes demand for the named Korean type:

| Recipe | Ingredient row | Existing line and owner | Disposition |
|---|---|---|---|
| 066, Korean Soy-Marinated Jammy Eggs | `e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-6` | `1 cup soy sauce or tamari` → `ingredient-ref-soy-sauce` | Preserve the generic-or-tamari choice; the recipe does not request `gukganjang`. |
| 085, Maple Chicken | `382d2080-2492-481c-bd33-2330cc3be65d-ingredient-6` | `2 1/2 tbsp soy sauce` → `ingredient-ref-soy-sauce` | Preserve the generic soy-sauce line. |
| 095, Satay | `9ec0ba36-1f7e-47d0-aedc-22ca03a5c672-ingredient-6` | `1 tbsp soy sauce` → `ingredient-ref-soy-sauce` | Preserve the generic soy-sauce line; the dish name does not identify a Korean style. |

No recipe links or relinking are proposed.

## Identity, naming, and scope evidence

The Korea Tourism Organization names `gukganjang` under Korean soy sauce and says it is used for soups, jjigae, and namul; the same page distinguishes it from `jinganjang` by cooking use. It reports 24% salinity for gukganjang on that page; the value is retained as a KTO-page claim only. This supports a narrow, source-named condiment identity and culinary distinction, not a universal composition or a crosswalk to every product carrying the word `ganjang`. [S01]

The Rural Development Administration’s National Institute of Agricultural Sciences likewise describes a Korean culinary distinction between `cheongjang-gukganjang`, used for soups, stews, and namul, and `jinganjang`, used for braises and meat seasoning. It gives typical aging periods of one to two years for the former and four to five years for the latter. Those periods belong to that page’s culinary account; they are not required attributes or universal production rules for the catalog identity. [S02]

The dictionary entry for `ganjang` translates the unqualified word as `soy sauce`. This confirms why the broad Korean term should remain with the existing generic soy-sauce reference rather than become an alias of `gukganjang`. [S03]

No Québec French terminology source was established for this subtype. Keep `gukganjang` as a provisional borrowed French display and add no French alias. Do not introduce `sauce soya de soupe` or another descriptive translation as an accepted alias without a separate terminology review.

## Evidence limits; measures and substitutions

The KTO page reports 24% salinity for `gukganjang`; keep that number source-specific rather than proposing it as a generic value. The RDA page reports one to two years for its `cheongjang-gukganjang` description and four to five years for its `jinganjang` description; those periods are not maturity forms, minimum requirements, or universal preparation instructions for this candidate. Neither source gives a reusable finished-product mass, serving, household measure, volume-to-mass relationship, density, unit mapping, recipe yield, or food-safety direction.

If integrated, use `measurementState: researched_no_supported_value`, `defaultDensity: null`, and `unitMappings: []`; add no forms, measurements, conversions, or package yields. No reviewed source recommends replacing `gukganjang` with another soy-sauce style in a defined dish role, method, and amount. Keep `substitutionResearchState: blocked_pending_evidence`; add no active substitution or recipe-line link. Do not infer equivalence or a replacement ratio with generic soy sauce, light/dark soy sauce, tamari, or Japanese styles from shared use, color, fermentation, or salty taste.

## Unsupported limits

The evidence supports the named Korean cooking type `gukganjang` as a condiment used in Korean soups, stews, and namul. It does not settle whether all contemporary preparations described under that culinary name fall within one manufacturing category, whether every preparation is made as a byproduct of doenjang, or how it maps to each Korean regulatory soy-sauce class. Keep the proposed identity at the source-named culinary scope.

The evidence does not establish a universal recipe, ingredient ratio, soy/bean sourcing rule, fermentation or maturation duration, salinity, color, viscosity, finished mass, storage period, or safety protocol. It does not support `ganjang`, `Korean soy sauce`, `soup soy sauce`, `soy sauce for soup`, `joseon ganjang`, or `hansik ganjang` as global aliases; those broader or potentially overlapping names need separate scope review. This review did not establish a Québec-specific French display, and the bundled recipe corpus has no direct demand.

## Proposed minimal state and source register

| Field | Proposed state |
|---|---|
| Candidate ID | `ingredient-ref-gukganjang` |
| `nameEn` | `gukganjang` |
| `nameFr` | `gukganjang` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases / French aliases | None / none |
| Forms, density, unit mappings, measures, conversions, yields | None |
| Recipe links and active substitutions | None |
| Ledger states if integrated | `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence` |

| Source ID | Source | Source type, support, and limits |
|---|---|---|
| `WP05-SECTIONW-GUKGANJANG-R989-20261019-S01` | Korea Tourism Organization, [Ingredients of Korean Food: Seasonings](https://english1.visitkorea.or.kr/enu/FOD/FO_ENG_1_3.jsp), accessed 2026-10-19. | Official tourism/cultural food guide. Names `gukganjang` and describes its soup, jjigae, and namul use, plus a separate `jinganjang` use description. Its salinity figure and broad introductory description are page-specific and are not catalog defaults. |
| `WP05-SECTIONW-GUKGANJANG-R989-20261019-S02` | Rural Development Administration, National Institute of Agricultural Sciences, [Understanding Korean Seasoning Sauces and Basic Cooking](https://www.nics.go.kr/food/kfi/hsMarinade/list_02), accessed 2026-10-19. | Official agricultural-science culinary resource. Describes soy sauce with soybean as a main raw material and distinguishes `cheongjang-gukganjang` and `jinganjang` by culinary use. Its one-to-two- and four-to-five-year aging descriptions remain source-specific. The same page describes soy-sauce liquid and separated doenjang solids as distinct foods; it does not set a universal household recipe or manufacturing standard. |
| `WP05-SECTIONW-GUKGANJANG-R989-20261019-S03` | National Institute of Korean Language, [Basic Korean-English Dictionary: 간장](https://krdict.korean.go.kr/eng/dicSearch/SearchView?ParaWordNo=70704&nation=eng), accessed 2026-10-19. | Government dictionary translates unqualified `ganjang` as `soy sauce` and defines it broadly as a salty dark liquid used to season food. This supports keeping the generic term with the existing generic identity; it does not define `gukganjang`. |

**Disposition:** Propose identity-only `gukganjang / gukganjang` in `SAUCE_AND_CONDIMENT`, with no aliases, forms, measurements, recipe links, or substitutions. Keep the French display provisional. Preserve the existing generic soy-sauce identity and all Japanese soy-sauce styles. Leave unqualified `ganjang` and the Section W parent open. No commercial-product roster was researched. No tests or builds were run because this is a proposal-only document.

## Document checks

- UTF-8 text without a byte-order mark, replacement character, or mojibake marker.
- Relative plan link resolves; all external source links use HTTPS.
- Proposal-local source IDs are unique and unallocated in the live ledger.
- Current reference, form, legacy, ledger, and recipe-corpus counts were recomputed from the live files.
- No software tests or builds were run.
