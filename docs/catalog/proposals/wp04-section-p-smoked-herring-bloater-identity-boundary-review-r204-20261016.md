# WP04 Section P — smoked-herring bloater identity review (R204, 2026-10-16)

- **Review and source-access date:** 2026-10-16.
- **Status:** Integrated as one identity-only reference; the supplier-specific approximate count-weight estimate was not retained.
- **Candidate:** The salted-and-smoked round-herring product class called *bloater* in English and *hareng bouffi* in Québec French.
- **Recommendation:** **Add** one identity-only `PROTEIN` market group, `smoked herring bloater / hareng bouffi`, with only source-backed spelling variants. Do not assign a species or add forms, general measures, recipe links, conversions, yields, or substitution rules.
- **Scope:** Whole/round salted-and-smoked herring bloaters. Keep the CFIA-defined separate product class of bloater fillets, split kippers, oil-packed smoked herring fillets, Matjes, rollmops, tomato- or mustard-sauce herring, and composite chiktay separate.
- **Proposal-stage scope:** At review time this file only changed. The accepted integration is documented in the R204 batch README and current shared catalog/ledger JSON. No software tests or emulator checks were needed under the current `AGENTS.md` database-JSON-only rule.
- **Source-ID policy:** The CFIA Grade Compendium URL reuses its existing ledger source ID. Eight new source URLs below receive unique R204 IDs; each ID maps to exactly one URL.

## Why this is an open, distinct candidate

The Section P plan keeps preserved seafood product identities under review while leaving universal preservation forms inactive ([preserved-fish review checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L11850)). The R166 Matjes review explicitly left bloaters, kippers, and other herring products outside its scope. R154 holds generic kipper pending a recipe or a product that resolves its split-and-smoked boundary; it does not decide the distinct whole/round bloater class. R180 covers smoked herring fillets in oil. R178 covers tomato-sauce herring, R185 proposes mustard herring, and R179 holds composite chiktay. None owns bloaters. The R201 canned-trout integration is complete and unrelated.

This proposal addresses only the bloater product class. Its sources distinguish the round/whole salted-and-smoked product from herring species and from separate fillet products. It does not create a generic smoked-herring form or reclassify any neighboring item.

## Identity and bilingual naming

The CFIA Canadian Grade Compendium is incorporated by reference into the Safe Food for Canadians Regulations. It defines **bloaters** as salted, smoked, round herring and gives French **bouffis**; it separately defines **bloater fillets** and **filets de bouffis**. Its definition of herring covers *Clupea harengus* and *Clupea pallasii*. The OQLF GDT defines the edible-fish term as whole salted and smoked herring, lists **bouffi**, **craquelot**, and **hareng bouffi** as preferred French terms, and gives English **bloater**. This supports a species-neutral prepared-food group with Québec French display *hareng bouffi*.

Canadian producers and suppliers currently list salted/smoked herring bloaters, and a Toronto retailer lists a whole-herring product as “Bloaters.” A French-language Canadian supplier page calls its product *hareng fumé salé canadien*. These market pages support Canadian product use but differ in their source-specific wording and presentations. The DFO Québec herring plan also refers to Québec smoked herring as *hareng bouffi* and describes its export market. It dates from 2021 and is production/trade context, not evidence of current Québec store inventory.

### Proposed reference if accepted

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-smoked-herring-bloater` |
| `category` | `PROTEIN` |
| `nameEn` | `smoked herring bloater` |
| `nameFr` | `hareng bouffi` |
| `aliasesEn` | `["bloaters"]` |
| `aliasesFr` | `["bouffis", "craquelot"]` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |

The qualified English display preserves the food meaning of *bloater*. TERMIUM notes that English *bloater* can also name the freshwater fish *Coregonus hoyi* and is sometimes used in Canada for *hareng saur*; it should not become an unqualified species claim. Do not add broad `smoked herring`, `hareng fumé`, bare `herring`/`hareng`, Atlantic/Pacific herring, scientific names, or `bloater fillets`/`filets de bouffis` as aliases. The proposed French aliases are OQLF-listed terms for this product, not synonyms for the raw herring species.

## Product boundaries and current owners

| Current owner / nearby decision | Boundary to preserve |
|---|---|
| `ingredient-ref-atlantic-herring` — Atlantic herring / *hareng de l’Atlantique* | Raw species identity. One producer's *C. harengus* claim is SKU-specific; do not attach all bloaters to this row. |
| `ingredient-ref-pacific-herring` — Pacific herring / *hareng du Pacifique* | Separate raw species identity. The CFIA definition covers both *C. harengus* and *C. pallasii*; do not choose between them for the proposed product group. |
| `ingredient-ref-smoked-herring-fillets-in-oil` — smoked herring fillets in oil / *filets de hareng fumés à l’huile* (R180) | Filleted, oil-packed finished product. Keep it separate from whole/round bloaters. |
| `ingredient-ref-herring-fillets-in-tomato-sauce` (R178) | Separate tomato-sauce preparation; no sauce alias or form is proposed here. |
| R154 kipper hold | OQLF's kipper is split and cold-smoked. Keep split kippers distinct from the round/whole bloater identity; the broader kipper hold remains unchanged. |
| R166 Matjes hold; R45 rollmops; R179 chiktay hold; R185 mustard-herring proposal | Separate curing/marinade, rolled pickle, composite spread, and mustard-sauce boundaries. R185 remains proposal-only in the active data snapshot checked here. |
| R184 smoked cod and the other smoked fish references | Different fish identities/products; no fish-to-fish alias or substitute is proposed. |

The reviewed CFIA definition distinguishes bloaters from bloater fillets. Product pages also mention whole/split variations. Keep those seller-specific presentations in their evidence notes; do not add `split` as a bloater alias or silently merge the separately defined fillet class.

## Exact ownership and source audit

The live snapshot after R201 contains **1,588 active references, 122 forms, 61 legacy candidates, and 1,933 research-ledger records**. Exact normalized-key checks covered reference IDs/names/aliases, form IDs/labels/match terms, legacy IDs/names/aliases, and ledger record IDs. No exact owner was found for `smoked herring bloater`, `bloater`, `bloaters`, `hareng bouffi`, `bouffi`, `bouffis`, `craquelot`, `bloater fillets`, `filets de bouffis`, or `ingredient-ref-smoked-herring-bloater`. There is no herring- or bloater-specific active form and no legacy candidate for this product.

The active herring-related owners are the four rows in the boundary table: Atlantic herring, Pacific herring, tomato-sauce herring fillets, and smoked herring fillets in oil. They have no bloater aliases or attached herring forms. No matching ingredient-reference ledger record or R204 source-ID prefix exists. R185's mustard-herring proposal is not integrated in the current references or ledger; if accepted later, it remains a separate product.

The CFIA URL is already registered in the ledger on `ingredient-ref-pacific-herring` as `WP04-PACIFIC-HERRING-IDENTITY-20261012-S05`; reuse that ID and URL. A dried-squid proposal also cited this CFIA page under a packet-local ID, but it did not add a competing ledger source. The eight other exact URLs below were not found in the current ledger or earlier proposal/batch archive. No new source ID is allocated for the reused CFIA URL.

## Picker projection

The projection follows the live phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including bilingual reference names, aliases, and attached form terms. The current active herring rows produce four results for broad `herring` and `hareng` searches.

| Query | Current results | With proposed row | Effect |
|---|---|---|---|
| `bloater`; `bloaters`; `hareng bouffi`; `bouffis`; `craquelot` | None | `smoked herring bloater / hareng bouffi` | Exact product terms resolve to the new group. |
| `smoked herring` | `smoked herring fillets in oil` | Same plus `smoked herring bloater` | The qualifier separates the two preserved-fish products. |
| `herring`; `hareng` | Atlantic herring; herring fillets in tomato sauce; Pacific herring; smoked herring fillets in oil | Same four plus smoked herring bloater | Broad searches remain multi-result and display product/species qualifiers. |
| `hareng fumé` | Smoked herring fillets in oil | Unchanged | The new French display is the OQLF-specific *hareng bouffi*, not a generic smoked-herring alias. |
| `Atlantic herring`; `Pacific herring`; `smoked herring fillets in oil`; `filets de hareng fumés à l’huile` | Their current respective owner | Unchanged | Existing species and oil-packed product boundaries remain intact. |

R185 mustard herring is proposal-only in this snapshot; if integrated, it will add a separate qualified herring result. No short generic alias is proposed here.

## Full recipe-corpus demand

The manifest-ordered audit parsed all **114 recipe files and 1,123 structured ingredient rows**. It searched every decoded recipe JSON document and every ingredient row for `bloater`, `bloaters`, `smoked herring bloater`, `hareng bouffi`, `bouffi`, `bouffis`, `craquelot`, bloater-fillets wording, *Clupea harengus*, and broad `herring`/`hareng`. It found **zero matching recipe files and zero matching ingredient rows**. The corpus supplies no recipe link, amount, method, form, or product-choice basis; this proposal is market coverage rather than a recipe-demand addition.

## Numeric evidence, measures, and substitutions

The sources report product-specific figures, none of which is a general recipe measure or yield:

- CFIA's `Choice` and `Standard` are product grades, not measures.
- Leslie Leger & Sons lists an 18 lb wooden box and its own 4–6 week smokehouse process. It describes locally caught Atlantic herring, salt-brine curing, and slight desalting before smoking; these statements apply to that producer's listing.
- Merex lists an 8.16 kg / 18 lb bulk box and “Choice” and “Split” varieties. Its contact page places the wholesale supplier in Halifax; the product page does not establish a universal count per box.
- Atwima's Toronto retailer page lists “Whole Herring (Bloaters)” at approximately 1 lb or 3–4 pieces. The option is shown crossed out on the page, so current stock is unconfirmed; the weight/count is retailer package wording only.
- Intercambio's French page reports approximately 100 g per whole herring, an 8.2 kg wooden case, a minimum two-week brine, and about 30 days of smoking. Its separate nutrition panel uses a 42 g basis. These are one supplier's product/process figures, not standardized values. The site's “use like anchovies” cooking suggestion gives no substitution ratio or recipe context.

If accepted, the ledger can preserve the Intercambio **approximate count-weight estimate** without turning it into a default serving or conversion:

| Ledger field | Proposed value |
|---|---|
| `recordId` / `recordType` | `ingredient-ref-smoked-herring-bloater` / `ingredient_reference` |
| `identityState` | `verified` |
| `measurementState` | `researched_supported` |
| `substitutionResearchState` | `researched_no_supported_substitute` |
| `measurementObservations` | One `count_weight` observation: `value: 100`, `valueUnit: "g"`, `evidenceKind: "estimate"`, quantity basis “approximately one whole herring; Intercambio page only,” and food description explicitly scoped to the supplier's salted/smoked whole Atlantic herring. Use only Intercambio's source ID. |
| `substitutionFindings` | One `researched_no_supported_substitute` finding. Note that the anchovy-use suggestion is not a measured replacement; no recipe or reviewed source establishes an equal-mass or context-specific replacement for raw herring, oil-packed smoked herring, kipper, Matjes, rollmops, or another fish. Cite the reviewed product/terminology sources as evidence examined. |
| `sources` | One source object per source-register ID below, with its one URL, access date, page title, locator, and bounded support statement. Reuse the existing CFIA ID without registering a duplicate URL. |

Do not add default density, unit mappings, a bloater-fillets form, package-yield record, recipe link, cooking or edible-yield factor, or substitution rule. If integration policy does not retain supplier-specific estimates on a species-neutral reference, omit the Intercambio observation and set `measurementState` to `researched_no_supported_value`; the package figures still must not become reusable measures.

## Source register

Pages were accessed on 2026-10-16. Reused source IDs are identified explicitly; each source ID maps to one URL.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **Reused `WP04-PACIFIC-HERRING-IDENTITY-20261012-S05`** | CFIA, [Canadian Grade Compendium: Volume 8 — Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-grade-compendium-volume-8). | Incorporated-by-reference federal source. Defines bloaters as salted, smoked, round herring (`bouffis`), bloater fillets separately (`filets de bouffis`), and herring as *C. harengus* or *C. pallasii*. It does not identify any one retail listing's taxon. Existing ledger URL owner: Pacific herring record. |
| **WP04-SECTIONP-HERRING-BLOATER-R204-20261016-S01** | OQLF, [GDT: bouffi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428388/bouffi), last updated 1983. | Québec edible-fish term; defines whole salted and smoked herring and lists *bouffi*, *craquelot*, and *hareng bouffi*, with English *bloater*. Terminology, not a current product specification. |
| **WP04-SECTIONP-HERRING-BLOATER-R204-20261016-S02** | DFO, [Atlantic herring in the Maritimes Region — Area 15, French](https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/herring-hareng/2021/area-15-zone-fra.html), 2021 management-plan page. | Describes Québec smoked herring (*hareng bouffi*) and its Caribbean/U.S. trade context. Government production/market context from the plan, not current store inventory or a consumer package. |
| **WP04-SECTIONP-HERRING-BLOATER-R204-20261016-S03** | Leslie Leger & Sons Ltd., [Salted/Smoked Herring Choice Bloaters (Whole or Split)](https://www.leslieandsons.com/salted-smoked-herring-choice-bloaters-whole-or-split/). | Current New Brunswick producer page; describes locally caught Atlantic herring, salt brine, slight desalting, 4–6 weeks in its smokehouse, and an 18 lb box. The species and process are producer/SKU-specific; the title also lists whole-or-split presentations. |
| **WP04-SECTIONP-HERRING-BLOATER-R204-20261016-S04** | Merex Inc., [Smoked fish](https://merex.ca/smoked-fish). | Current Canadian supplier distinguishes whole herring, called bloaters, from smoked herring fillets; lists Choice and Split varieties and an 8.16 kg / 18 lb box. It is wholesale product information, not a universal product specification. |
| **WP04-SECTIONP-HERRING-BLOATER-R204-20261016-S05** | Merex Inc., [Contact](https://merex.ca/contact). | Identifies Merex as a Halifax, Nova Scotia wholesale supplier. Locality/context only; it does not add product or measure evidence beyond S04. |
| **WP04-SECTIONP-HERRING-BLOATER-R204-20261016-S06** | Atwima M&S Supermarket, [Smoked Herring](https://atwimaonline.ca/products/smoked-herring). | Current Toronto retailer page labels an option “Whole Herring (Bloaters)” and displays an approximate 1 lb or 3–4-piece package. The option is crossed out on the page; inventory is unconfirmed and the package figure is not a reusable count-weight. |
| **WP04-SECTIONP-HERRING-BLOATER-R204-20261016-S07** | Intercambio Canada, [Hareng](https://smokedherring.com/fr/hareng/). | French-language supplier page calls its product Canadian salted/smoked herring, names *C. harengus* for that product, and reports whole-fish approximate weights, case sizes, brining/smoking durations, and a nutrition basis. These values and the species claim are supplier-specific. |
| **WP04-SECTIONP-HERRING-BLOATER-R204-20261016-S08** | Translation Bureau, [TERMIUM Plus: craquelot](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frt&lang=fra&srchtxt=CRAQUELOT). | Government terminology record lists *bouffi* and *craquelot* for the herring product, describes Canadian use of English *bloater* for *hareng saur*, and notes that English *bloater* can also refer to freshwater *Coregonus hoyi*. It supports careful qualified naming; it does not override the CFIA/OQLF product definition. |

The read-only workspace audit covered live references/forms, legacy candidates, the research ledger, Section P checklist, adjacent proposals/batches, picker source, manifest, and all listed recipe files. It found no exact owner or recipe demand and confirmed the source-ID/URL ownership described above.

## Final disposition and reopen conditions

**Add** the narrowly named, identity-only `smoked herring bloater / hareng bouffi` market group. Preserve the CFIA whole/round product boundary, keep bloater fillets separately scoped, and do not assign either Atlantic or Pacific herring species. Do not retain the optional Intercambio approximate 100 g count-weight estimate: it is one supplier's species-specific product detail, not a supported measure for this species-neutral group. Set `measurementState` to `researched_no_supported_value`; add no form, recipe measure, conversion, yield, recipe link, or substitution.

Reopen the decision if a bundled recipe or explicit user product request selects a bloater fillet, split product, or another specific package; a current Québec consumer listing establishes a narrower retail name or storage/process boundary; a source shows that the proposed group merges materially different products; or an active `Coregonus hoyi` identity makes the bare `bloater` search collision material. Keep the Section P checklist open for the remaining preserved-fish products.
