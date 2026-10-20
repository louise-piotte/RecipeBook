# WP04 Section P — frozen grass carp fillets / filets de carpe de roseau surgelés (R260)

- **Review and source-access date:** 2026-10-16.
- **Status:** Integrated as a documentation-only hold; see the [R260 integration record](../batches/wp04-section-p-grass-carp-fillets-picker-hold-integration-r260-20261016/README.md).
- **Packet type:** bounded species/product identity, Canadian and Québec naming, ownership, picker, recipe-demand, and product-measure review.
- **Recommendation:** **Hold** outside active references, forms, legacy mappings, and the research ledger.
- **Scope:** frozen fillets or sliced fillet product of grass carp, *Ctenopharyngodon idella*. This is a separate follow-up from the prior common-carp hold and from R256's smoked-sardine product review.

## Decision summary

Canadian retailer listings establish frozen grass-carp fillet products, and Québec sources identify *Ctenopharyngodon idella* as **carpe de roseau / grass carp**. The exact market-supported English candidate is `frozen grass carp fillets`; a possible fr-CA display is `filets de carpe de roseau surgelés`, but no reviewed Québec package attests that combined product phrase. CFIA's Fish List adds a name-boundary issue: it lists `Grass Carp` with no French name and separately lists `Amur Carp / Carpe Herbivore` for the same taxon. The current picker would make this product-specific row the sole exact-phrase result for broad `carp` and `carpe` queries. The catalog already keeps generic carp and a separate common-carp species row unallocated for this same scope problem. No matching recipe demand supplies a reason to accept that false singleton. Keep the candidate unallocated until the bilingual display and picker boundaries are resolved.

At proposal stage, no catalog JSON, recipe, generated file, plan, checklist, or roadmap entry changed. The hold was subsequently integrated in documentation only.

## Conditional candidate and product boundary

| Field | Candidate if the hold is later cleared |
|---|---|
| Prospective ID | `ingredient-ref-frozen-grass-carp-fillets` (illustrative only; not reserved) |
| Category | `PROTEIN` |
| English display | `frozen grass carp fillets` |
| fr-CA display | `filets de carpe de roseau surgelés` (provisional translation, not an attested retailer/package label) |
| Taxon | *Ctenopharyngodon idella* only |
| Aliases | None proposed at this hold. CFIA's `Amur Carp` / `Carpe Herbivore` label pair is a naming-policy follow-up, not an alias allocation. |
| Competing CFIA label-name option | `frozen Amur carp fillets` / `filets de carpe herbivore surgelés` (constructed product wording; neither phrase is attested on the reviewed retail pages) |

The product group is bounded to frozen grass-carp fillets or sliced fillet portions. It does not cover live fish, whole fish, fresh product, other Asian carp species, common carp (*Cyprinus carpio*), or unqualified carp products. Do not add `carpe amour`, `amour blanc`, `white amur`, `grass fish`, `Asian carp`, or generic `carp` / `carpe` as aliases. Québec terminology sources support some of these as species names, but they are not product-specific fillet labels and would broaden search ownership.

If later integrated, keep the row identity-only. Do not create ingredient forms, recipe links, conversions, densities, reusable unit mappings, cooking yields, package conversions, or substitutions. The frozen and cut descriptors belong to this market-product boundary; they do not establish a same-ingredient conversion model.

## Species naming and adjacent carp decisions

The Québec government species profile gives **Carpe de roseau**, alternative French name **Amour blanc**, English **Grass carp**, and scientific name *Ctenopharyngodon idella*. It says the species is invasive in Québec and explicitly distinguishes it from common carp, with which it is often confused. OQLF's 2017 GDT entry uses `carpe de roseau` and `carpe amour` as preferred French terms and gives `grass carp`, `white amur`, and *C. idella* as English and Latin equivalents. These sources support the taxon/name pair, not a product-specific French package label. [S01–S02]

CFIA's Fish List identifies TSN 163537 as *C. idella*. Its results include `Grass Carp` with no French name and a separate `Amur Carp / Carpe Herbivore` name pair. The list describes its English/French common names as names acceptable in Canada for fish labelling. This is a Canadian labelling reference, not proof of the wording on either retailer's package; the Québec government and OQLF support `carpe de roseau` as the local French species name. Keep the market title, Québec species name, and CFIA labelling names distinct until the bilingual display policy is clear. [S09–S10]

FAO's cultured-species fact sheet title spells the scientific name *Ctenopharyngodon idellus* and gives English `grass carp (= white amur)` alongside different French wording (`carpe herbivore (= chinoise)`). Treat its spelling and terminology as a comparison from that 2009 sheet, not as a current taxonomic determination. The Québec government, OQLF, and CFIA results identify *C. idella*. Avoid adding broad `Chinese carp` wording. The accepted species is not common carp: do not transfer the *C. carpio* identity, aliases, market evidence, or held status to *C. idella*. [S06, S09]

The live Section P checklist still has the broad finfish item open and names carp among the remaining fish families. Its prior common-carp follow-up keeps both generic carp and *C. carpio* unallocated because the current picker would return one species for broad `carp` and `carpe` queries. This grass-carp review is a different taxon and a narrower frozen-fillet product, but the same picker behavior applies. The R256 smoked-sardine proposal is an unrelated prepared-fish boundary and is not reopened here. [R01–R02]

## Canadian and Québec market evidence

T&T Supermarket's seafood listings use the exact English product wording **Frozen Grass Carp Fillets (~300g)**. Its product and weekly-special pages are JavaScript-rendered; the web view could not expose a current store-level package label. A Kaso Montréal flyer search result on the review date showed the same item in a flyer nominally valid October 16–22, 2026, but opening the canonical page returned older September 25–October 1 data. Treat that flyer snippet as an unverified current-market lead, not reliable evidence of the displayed sale or store inventory. [S03–S04]

PriceSmart Foods provides an accessible Canadian retail product page for **Frozen - Grass Carp Fillet, 1 Each**. The page is set to Richmond–Ackroyd, British Columbia, and describes a 250 g sliced product for hotpot and soup that is to remain frozen. This independently supports a Canadian frozen grass-carp fillet market product and a stated culinary use, but not Québec availability, a Québec French product label, or recipe-level interchangeability. [S05]

DFO's 2004 biological synopsis records historical Canadian live-fish food-market sales, primarily in Toronto in 1996–2004. That evidence is historical and about live fish; it is not used to infer today's frozen-fillet market, product measurements, preparation guidance, or local availability. [S07]

Québec's invasive-species page and regulation concern live grass carp; the candidate here is explicitly a dead, frozen fillet product. CBSA separately states that live or dead uneviscerated listed Asian carp imports are prohibited, while dead, eviscerated fish may be imported subject to CFIA requirements. Retail listings alone do not identify origin, package labeling, or import status, so this review makes no product-compliance determination and does not broaden the candidate to live fish. [S01, S08, S11]

The best-supported product wording remains market-supported English with a provisional Québec French compound. `filets de carpe de roseau surgelés` is a transparent working translation using the Québec species name, but it must remain marked provisional until a Québec retailer or package attests it. CFIA's `Amur Carp / Carpe Herbivore` is an accepted Canadian label-name pair, while its separate `Grass Carp` row has no French name. The current T&T Montréal flyer result cannot close the product-label gap because the indexed page became stale on direct access.

## Exact ownership and archive audit

The read-only snapshot contains **1,653 active references**, **125 forms**, **61 legacy candidates**, and **2,001 research-ledger records**. The manifest lists **114 recipes** and **1,123 ingredient rows**. Exact candidate ownership was checked in bilingual reference names and aliases, form labels and match terms, legacy candidate IDs and terms, ledger record IDs and text, and the proposal/batch archive. Search normalization mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD, compatibility folding, diacritic/punctuation removal, and whitespace collapse.

| Candidate key or related scope | Current active/catalog owner | Archive/source result |
|---|---|---|
| `grass carp fillets`; `frozen grass carp fillets`; `filets de carpe de roseau surgelés`; `frozen Amur carp fillets`; `filets de carpe herbivore surgelés`; `carpe de roseau`; `Amur Carp`; `Carpe Herbivore`; *Ctenopharyngodon idella* | No exact reference, form, legacy, or ledger owner. | No earlier focused grass-carp identity or frozen-fillet review found. The prior common-carp review mentions grass carp only as a distinct adjacent taxon. |
| `ingredient-ref-frozen-grass-carp-fillets`; `candidate-frozen-grass-carp-fillets` | Both IDs absent from references, forms, legacy candidates, and ledger. | Illustrative identifiers only; no allocation is proposed under this hold. |
| `carpe amour`; `amour blanc`; `white amur`; `Amur Carp`; `Carpe Herbivore` | No exact active alias/owner. | Species-level or CFIA labelling terminology; not proposed as product aliases under this hold. |
| `carp`; `carpe`; generic carp | No exact active reference or alias. | Generic `carp` / `carpe` and common carp remain held under earlier Section P work; not reopened. |
| T&T, Kaso, PriceSmart, OQLF, Québec species-profile, FAO, DFO, and CBSA URLs below | No exact source URL owner in the ledger at this snapshot. | No duplicate URL allocation found. |
| CFIA Fish List overview URL | Cited by 22 ledger records. | Existing example: `WP04-SECTIONP-BLUEFIN-PAIRED-R110-20261014-S02`. Proposal-local S10 refers to the general scope statement; no shared ledger allocation is made. |
| CFIA Fish List result URL | Cited by 30 ledger records. | Existing example: `WP04-P-PACIFIC-SAURY-20261013-S01`. Proposal-local S09 identifies the *C. idella* rows; no shared ledger allocation is made. |
| LégisQuébec regulation URL | Cited by two ledger records. | Existing ID: `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S08`. Proposal-local S11 cites the live-fish restriction; no shared ledger allocation is made. |
| `WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S01`–`S11`, `R01`–`R02` | No current source-ID owner. | Prefix and proposal-local source-ID range were absent from the research ledger and proposal/batch archive before this file. Reused URLs are identified above; the proposal adds no ledger record. |

The archive search found the generic carp hold and the species-specific common-carp follow-up, but no earlier focused review for *C. idella* or the frozen grass-carp fillet market product. R256 concerns smoked sardine fillets and has no overlapping identity or product scope.

## Picker projection

`IngredientReferenceSearchIndex` searches bilingual displays, aliases, and attached form terms. It returns whole-word phrase matches first and uses substring fallback only if there are no phrase hits. The following static projection adds one hypothetical row with the conditional displays above and no aliases or forms; it is not an app or emulator test. [R01]

| Query | Current live projection | With hypothetical row | Assessment |
|---|---|---|---|
| `frozen grass carp fillets` | No result. | Frozen grass carp fillets only. | Intended product-qualified query. |
| `filets de carpe de roseau surgelés` | No result. | Frozen grass carp fillets only. | Candidate French phrase works, but its product wording remains provisional. |
| `grass carp`; `carpe de roseau` | No result. | Frozen grass carp fillets only. | Species-qualified discovery would work. |
| `carp` | `ingredient-ref-mascarpone` only, via substring fallback (`carp` is inside `mascarpone`). | Frozen grass carp fillets only. | The exact word in the new display outranks and removes the unrelated partial match, leaving one species/product result for a broad query. |
| `carpe` | No result. | Frozen grass carp fillets only. | The French display makes a broad query resolve to one species/product. |
| `carpe amour`; `amour blanc`; `white amur`; `Amur Carp`; `Carpe Herbivore` | No result. | No result, because none is proposed as an alias. | Québec species synonyms and the CFIA label pair remain out of product search pending a naming-policy decision and safer query behavior. |

The broad-query outcome is not cured by omitting alias arrays: `carp` and `carpe` occur as complete words in the bilingual display itself. This is the same structural ambiguity recorded by the prior common-carp hold. Avoid implying that this product row represents all carp or all grass-carp product states.

## Recipe demand

All **114** manifest-listed recipes and all **1,123** ingredient rows were parsed. Complete recipe JSON and ingredient-row values were searched for `grass carp`, `grass carp fillets`, `frozen grass carp`, `filets de carpe de roseau`, `carpe de roseau`, `carpe amour`, `amour blanc`, `white amur`, *Ctenopharyngodon idella*, and whole-word generic `carp` / `carpe`. **There are zero matching recipe files and zero matching ingredient rows.** A substring-only corpus search finds `carp` inside the unrelated `mascarpone` frosting title; it is not carp demand. No recipe link or recipe-specific form is supported. [R01]

## Forms, measurements, and substitutions

- **Forms:** Add no fresh, frozen, cooked, whole-fish, or other form record. The candidate itself is a bounded frozen-fillet market product, not a conversion path.
- **Package observations:** T&T's item title gives an approximate 300 g; PriceSmart's separate listing says 250 g and describes sliced fillet portions. Keep each only as a retailer/SKU observation. Neither establishes a standard package, serving, count, per-fillet mass, or package-to-recipe conversion.
- **Conversions and yield:** No density, volume mapping, thawed/drained yield, cooking yield, or weight-per-fillet mapping is supported. The stated hotpot/soup use is a retailer description, not a cooking conversion or safety instruction.
- **Substitutions:** Add no substitution to common carp, silver/bighead/black carp, generic fish, tilapia, basa, or another fillet. Shared freshwater habitat, family, cut, or retailer cooking-use wording does not establish equivalence.

## Recommended hold and unresolved follow-up

Keep the candidate outside active references, forms, legacy mappings, and the research ledger. The retailer and Québec sources support the species and English market wording, but the combined Québec French product phrase is unconfirmed, CFIA's Fish List presents a different accepted bilingual common-name pair, the current picker assigns broad `carp` and `carpe` queries to one species/product row, and the bundled recipe corpus has no demand.

Revisit after (1) search can preserve a broad carp choice or clearly expose multiple scopes, (2) a current first-party Québec listing or package confirms the bilingual product wording and local availability, and (3) the catalog's naming policy resolves how retailer wording `Grass Carp`, Québec terminology `carpe de roseau`, and CFIA's accepted `Amur Carp / Carpe Herbivore` pair should be represented. The CFIA species rows were checked in this review; they list `Grass Carp` without a French name and a separate accepted bilingual pair. Keep historic live-fish evidence, current frozen retail listings, Québec species terminology, and fish-labelling names as distinct evidence types.

## Sources

Sources were accessed on 2026-10-16. All source IDs below are proposal-local and are not research-ledger allocations. The exact CFIA and LégisQuébec URLs already have owners in the ledger, as shown in the ownership audit.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S01** | Gouvernement du Québec, [Carpe de roseau species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/carpe-roseau). | Updated 2026-10-02. Pairs `Carpe de roseau`, alternative `Amour blanc`, `Grass carp`, and *Ctenopharyngodon idella*; distinguishes it from common carp and describes invasive/live-fish controls. Species identity and Québec naming source, not a food-product label. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S02** | Office québécois de la langue française, [carpe de roseau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9496846/carpe-de-roseau). | 2017 entry in zootechny/zoology identifies `carpe de roseau` and `carpe amour`, English `grass carp` and `white amur`, and *C. idella*. Supports terminology, not current market phrasing. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S03** | T&T Supermarket, [seafood fish-fillets category](https://www.tntsupermarket.com/eng/product-categories/seafood/fish-fillets.html?id=1&level=null&name=null) and [weekly seafood specials](https://www.tntsupermarket.com/eng/weekly-special-er/seafood.html?id=1&level=2&name=Offre+%C3%A0+la+une). | Indexed first-party listing gives `Frozen Grass Carp Fillets (~300g)`. The pages require JavaScript in this browser and their indexed snapshots are months old; they do not verify current inventory, exact package contents, species traceability, or French wording. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S04** | Kaso, [T&T Montréal weekly flyer](https://kaso.ca/fr/circulaire/tnt-supermarket). | Search index on the review date showed `Frozen Grass Carp Fillets (~300g)` in a flyer nominally valid 2026-10-16–22. Direct page retrieval showed stale 2026-09-25–10-01 contents. Not relied on as independently verified current promotion or stock. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S05** | PriceSmart Foods, [Frozen - Grass Carp Fillet, product 06937086706004](https://www.pricesmartfoods.com/product/frozen-grass-carp-fillet-06937086706004). | Retail page selected Richmond–Ackroyd, B.C.; lists 1 each, 250 g, sliced, hotpot/soup use, keep frozen. Canadian retail evidence, not Québec availability or a recipe measure. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S06** | FAO Fisheries and Aquaculture, [Cultured aquatic species fact sheet: *Ctenopharyngodon idellus*](https://www.fao.org/fishery/docs/CDrom/aquaculture/I1129m/file/en/en_grasscarp.htm). | The 2009 sheet title spells *Ctenopharyngodon idellus* and reports English `Grass carp (=White amur)` alongside French FAO wording `carpe herbivore (=chinoise)`. Terminology comparison only; the Québec government/OQLF sources support the *C. idella* name used here. Not Québec product wording. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S07** | Fisheries and Oceans Canada, [Biological synopsis of grass carp](https://publications.gc.ca/collections/collection_2007/dfo-mpo/Fs97-4-2705E.pdf). | 2004 technical synopsis describes food use internationally and historical Canadian live-food-market imports/sales, mostly Toronto in 1996–2004. Historical and live-fish-specific; not evidence of present frozen-fillet stock or measures. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S08** | Canada Border Services Agency, [Memorandum D19-8-5: aquatic-species import prohibitions and requirements](https://www.cbsa-asfc.gc.ca/publications/dm-md/d19/d19-8-5-eng.html). | Names grass carp among regulated Asian carp and distinguishes live/dead uneviscerated imports from dead, eviscerated imports subject to CFIA requirements. Regulatory context only; the retailer listings do not establish origin or package compliance. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S11** (proposal-local source ID; regulation URL already in ledger) | LégisQuébec, [Regulation respecting aquaculture and the sale of fish](https://www.legisquebec.gouv.qc.ca/fr/document/rc/c-61.1,%20r.%207). | Annex IV lists *C. idella* among live fish for which sale and purchase are prohibited. The exact regulation URL is already registered under `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S08`; this local ID records the relevant context without adding a shared ledger allocation. This is not a legal conclusion on a specific retailer product. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S10** (proposal-local source ID; overview URL already in ledger) | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | CFIA says the list provides English/French common names acceptable in Canada for fish labelling and scientific names/TSNs. This exact overview URL is already cited by 22 ledger records; this local ID records the general scope statement without adding a shared ledger allocation. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-S09** (proposal-local source ID; result URL already in ledger) | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). | Lines for TSN 163537 identify *C. idella* as `Grass Carp` (no French name shown) and separately `Amur Carp / Carpe Herbivore`. The results page URL is already cited by 30 ledger sources; this local ID records the species-specific rows for this proposal and adds no shared ledger allocation. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-R01** | Read-only audit of the [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5518), current references/forms/legacy identities/ledger, manifest recipes, proposal/batch archive, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Confirmed live counts, exact ownership, absence of a prior grass-carp review, picker projection, candidate query behavior, source namespace, and recipe demand. No shared file changed. |
| **WP04-SECTIONP-GRASS-CARP-FILLETS-R260-20261016-R02** | [Common-carp species picker-boundary review](wp04-next-open-section-p-seafood-candidate-review-20261012.md) and [hold integration note](../batches/wp04-common-carp-picker-boundary-hold-integration-20261012/README.md). | Prior adjacent-taxon decision for *Cyprinus carpio* and broad carp wording. It does not identify, allocate, or decide *Ctenopharyngodon idella* or a frozen grass-carp product. |

## Static review record

- Read `AGENTS.md`, `Requirements.md`, the live Section P checklist and common-carp follow-up, the current roadmap context, and the relevant recent Section P archives.
- Checked exact candidate terms, prospective IDs, aliases, source URLs, and source-ID prefix against active references, forms, legacy identities, ledger records, and archived proposal/batch files.
- Reproduced the current picker normalization and phrase-first behavior using the conditional bilingual display; confirmed the `carp` substring fallback currently belongs only to `mascarpone`, while `carpe` has no current result.
- Parsed all 114 manifest-listed recipes and 1,123 ingredient rows; found no complete-word candidate or generic carp demand.
- At proposal stage, made no changes outside this proposal. The later integration changed only the catalog plan, roadmap, and hold documentation; active catalog JSON, recipes, and generated files remain unchanged. No software tests, package generation, app deployment, or emulator checks were run for this database-data-free hold.
