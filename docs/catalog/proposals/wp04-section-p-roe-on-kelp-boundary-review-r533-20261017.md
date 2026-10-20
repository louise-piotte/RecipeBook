# WP04 Section P — herring roe on kelp boundary review (R533)

**Status:** The recommended picker-scope hold is integrated in the R531–R533 batch record; herring roe on kelp remains outside shared catalog and ledger data.

- **Review and source-access date:** 2026-10-17.
- **Open checklist:** Section P still leaves the roe and regional-seafood work open ([plan, roe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7804), [regional-seafood checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L7922)).
- **Candidate:** The distinct market product `herring roe on kelp` / `herring spawn on kelp`, where fertilized herring eggs adhere to kelp and are harvested together.
- **Recommendation:** **Hold this product outside active references, forms, aliases, legacy identities, and the shared research ledger.** Canadian producer and retailer sources establish a distinct product, and federal sources support the fishery identity and French terms. A natural bilingual display would nevertheless make unresolved generic `herring roe` / `œufs de hareng` searches return this one preparation. The bundled corpus has no demand that selects it.
- **Scope:** This is a focused roe-on-kelp product-boundary review. It does not reopen the plain kazunoko / salted herring-roe skein hold, the accepted Atlantic or Pacific herring species references, kombu, or other roe identities. It does not infer a species for every commercial product, or make `komochi kombu`, `kazunoko kombu`, or bare `kazunoko` global aliases.
- **Write scope:** The R533 result is a documentation-only hold; this proposal adds no shared catalog or ledger data. The batch integration updates the global plan, roadmap, and integration README. No software tests, build, emulator run, or deployment was performed.
- **Proposal-local source IDs:** `WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S01` through `S10`, plus audit source `R01`. These are unregistered and unallocated.

## Why this is a distinct open boundary

The open Section P roe checklist continues to request coverage for roe products where recipes call for them. The earlier [kazunoko review (R42)](wp04-section-p-kazunoko-salted-herring-roe-product-boundary-review-20261013-round42.md) and [generic herring-roe review (R416)](wp04-sectionp-next-seafood-gap-review-r416-20261017.md) name roe on kelp only to keep it distinct from detached salted roe skeins. Neither review assigns the roe-on-kelp product or makes a focused product-level decision. The current proposal advances only that separate product boundary.

The more recent [fish-floss hold (R523)](wp04-section-p-fish-floss-product-boundary-review-r523-20261017.md), [salmon kama/collar hold (R526)](wp04-section-p-next-seafood-review-r526-20261017.md), and [kamaboko family hold (R530)](wp04-section-p-kamaboko-boundary-review-r530-20261017.md) concern different fish products. They do not identify herring roe on kelp, and none is reopened here.

## Identity, species, and naming boundary

Fisheries and Oceans Canada describes the Pacific herring spawn-on-kelp fishery as harvesting eggs that adhere to kelp after the herring spawn. It identifies `Rogue sur varech` as a separate commercial fishery from `Hareng rogué`, and explains that harvesters suspend kelp lines where herring spawn. The 2026 DFO notice uses the longer French phrase `Œufs de hareng récoltés sur le varech` for a current communal-sale fishery. These official sources support a distinct fishery product and contemporary Canadian French wording; they are not consumer recipe labels or ingredient specifications. [S01, S02]

TERMIUM Plus records `herring roe on kelp` and `herring spawn on kelp`, with French terms `œufs de hareng sur algue` and `œufs de hareng pondus sur algue`. Its record describes fertilized eggs adhering to kelp fronds, with a Pacific-coast product that is cut and salted. This is Canadian terminology-bank evidence, not an OQLF ruling or proof that the French wording appears on a Québec retail package. The federal fishery regulation separately pairs `Herring Spawn on Kelp` with `Rogue de hareng sur varech`. [S03, S04]

Canadian producer Canfisco lists `Herring Roe (Kazunoko)` separately from `Herring Roe on Kelp (Komochi Kombu)`. It says kelp covered with herring spawn is harvested, brine-cured, and graded. Its origin table says only `Herring and Kelp`, and assigns a 30 lb pail to that wholesale product. Aero Trading likewise describes its herring roe and herring roe-on-kelp as separate lines. This supports product distinction; the listings do not establish a scientific taxon or one composition for every roe-on-kelp product. [S05, S06]

Seaborn's current Vancouver store listing uses `Herring Roe on Kelp`, describes the roe and kelp as combined, and gives desalting and seasoning directions for that seller's SKU. Another Seaborn listing shows `Salted Herring Roe on Kelp` separately from `Salted Herring Roe`. These are product-specific retail descriptions, not evidence of a Québec label or a standard recipe preparation. [S07, S08]

Do not promote the Japanese product descriptors as universal aliases. The Canadian sources use `Komochi Kombu` and `Kazunoko Kombu` for their roe-on-kelp lines, but Hiroshima City's official `こもち昆布` page describes a sweet simmered kombu tsukudani whose roe-like texture comes from tarako (`たらこ`). The Hiroshima product is not evidence about the Canadian roe-on-kelp SKU; it demonstrates that the romanized Japanese term alone does not safely identify one cross-market product. Bare `kazunoko` is also used for detached herring roe in the earlier R42 decision. [S05, S06, S09]

Use **herring roe on kelp / herring spawn on kelp** only when the recipe or package explicitly identifies the eggs-on-kelp product. Keep it separate from:

- detached herring roe skeins sold as kazunoko;
- Atlantic or Pacific herring flesh and their species identities;
- kombu / kelp as a seaweed ingredient;
- salmon roe, trout roe, tobiko, masago, bottarga, and milt;
- `komochi kombu` or `kazunoko kombu` as unqualified, global aliases.

The reviewed Québec sources support the generic phrase `œufs de hareng`, but do not identify it as the French consumer name for the on-kelp product. DFO's `rogue de hareng sur varech` and TERMIUM's qualified `œufs de hareng sur algue` are defensible official French fishery/terminology phrases. Neither reviewed source is a current Québec retail package. That is a limit of the source set, not a claim that no Québec product wording exists. [S03, S04, S10]

## Active ownership and source audit

Read-only snapshot taken 2026-10-17. Hashes are SHA-256 over exact file bytes.

| Artifact | Current contents | Bytes; SHA-256 |
|---|---:|---|
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,799 references | 587,981; `d653bdc31f156a1610dbbb4e3c2e6fa73de4adaed777ced14b9fcbc0643dce13` |
| [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 144 forms | 114,690; `5a47b562629b3f7a248f4d6068b606a6baf6c216480caca8a63fc9fb1ec74b17` |
| [Legacy-import identities](../legacy-import-identities.v1.json) | 56 candidates | 13,351; `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| [Research ledger](../research-ledger.v1.json) | 2,156 records; 9,913 source entries; 8,390 distinct source IDs; 7,098 URLs | 10,047,014; `a210eda318aa2aa04b684e3c0e134ed5c618cc0b666fc8a0e2b50f9d291e494c` |
| [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | 12,011; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Exact ownership checks covered bilingual names and aliases, attached form labels/match terms, all legacy candidates, ledger record IDs, source IDs and URLs, and the focused WP04 proposal/batch archive. Search-key behavior was mirrored from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase and NFKD normalization, accent/punctuation folding, complete word-phrase matches first, then substring fallback only if no phrase match exists.

| Candidate wording or adjacent owner | Current owner | R533 disposition |
|---|---|---|
| `herring roe on kelp`, `herring spawn on kelp`, `spawn on kelp`, `roe on kelp`, `œufs de hareng sur algue`, `œufs de hareng pondus sur algue`, `rogue de hareng sur varech`, `komochi kombu`, `kazunoko kombu` | No exact active reference, form, legacy candidate, or dedicated ledger record. The illustrative IDs `ingredient-ref-herring-roe-on-kelp` and `candidate-herring-roe-on-kelp` are also unallocated. | Keep every term and ID proposal-local; add none to shared data. |
| `ingredient-ref-pacific-herring` | Active `Pacific herring / hareng du Pacifique`, species identity *Clupea pallasii*. Its ledger record cites a DFO plan for food/bait, roe, and spawn-on-kelp fisheries, but allocates only the whole-species identity. | Preserve the source context, but do not make roe-on-kelp a herring form or infer the taxon for every commercial roe-on-kelp item. |
| `ingredient-ref-atlantic-herring`; `ingredient-ref-herring-fillets-in-tomato-sauce`; `ingredient-ref-smoked-herring-bloater`; `ingredient-ref-smoked-herring-fillets-in-oil` | Active identities for Atlantic herring or named herring products. None is roe on kelp. | Keep fish, roe, and finished product scopes distinct. |
| `ingredient-ref-kombu` | Active kombu seaweed identity, with `konbu` aliases. | Do not attach roe-on-kelp as a kombu alias or form. |
| `ingredient-ref-bottarga`; `ingredient-ref-fish-milt`; `ingredient-ref-masago`; `ingredient-ref-salmon-roe`; `ingredient-ref-tobiko`; `ingredient-ref-trout-roe` | Active neighboring roe/milt identities. | Do not merge or substitute any of these products with herring roe on kelp. |
| Generic herring roe / `œufs de hareng` | R416 keeps generic herring roe unallocated because current sources do not settle one preparation state. R42 separately holds plain salted kazunoko. | Preserve both holds; do not let a spawn-on-kelp row appear to resolve detached herring roe. |

The active Pacific-herring ledger record's related source is `WP04-PACIFIC-HERRING-IDENTITY-20261012-S01`, attached to `ingredient-ref-pacific-herring` at the DFO 2025–2026 Integrated Fisheries Management Plan URL. Its locator mentions food/bait, roe, and spawn-on-kelp fisheries as whole-species context; it is not a roe-on-kelp product record. The exact R533 source URLs below have no existing exact URL owners in the shared ledger, except the Québec government herring-roe overview in S10, already owned by `ingredient-ref-sea-scallop` / `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S05` for a different, scallop-focused claim. That reused URL is cited here only for its generic `œufs de hareng` wording.

Archive URL checks found prior proposal-local citations for the Canfisco PDF in R18, R42, and R416; for Aero Trading in R42 and R416; for the TERMIUM query in R166; and for the Québec government overview in R42, R89, R365, R416, and R415–R417 integration documentation. Those mentions do not create a herring-roe-on-kelp allocation. Exact URL checks found no earlier archive owner for the DFO product/fishery page, federal regulation PDF, 2026 DFO notice, Seaborn product pages, or Hiroshima City page. The R533 source-ID prefix is not allocated in the ledger or inspected archive. [R01]

## Ingredient picker projection

The table mirrors the phrase-first picker over active reference names, aliases, and attached form terms. The hypothetical row uses `herring roe on kelp / œufs de hareng sur algue`, with the evidence-backed phrase variants `herring spawn on kelp` and `œufs de hareng pondus sur algue`; it is shown only to expose search effects, not as an integration proposal.

| Query | Current result | With hypothetical row | Effect |
|---|---|---|---|
| `herring roe on kelp`; `herring spawn on kelp` | None | Roe on kelp only | Exact product search would resolve. |
| `herring roe` | None | Roe on kelp only | The broad held term would look resolved to the on-kelp preparation even though detached kazunoko remains distinct and unallocated. |
| `œufs de hareng sur algue`; `œufs de hareng pondus sur algue` | None | Roe on kelp only | The terminology-backed qualified phrases would resolve to the candidate. |
| `œufs de hareng` | None | Roe on kelp only | Generic Québec herring-roe wording would incorrectly return the specialized product as a singleton. |
| `herring`; `hareng` | Five current results each (Atlantic/Pacific herring and named herring products) | Six each | Both remain multi-result, but the additional roe product makes a broad whole-fish query less specific. |
| `roe` | Six results: bottarga, milt/soft roe, masago, salmon roe, tobiko, and trout roe | Seven results | The row would add a distinct type of roe, without clarifying the unresolved herring-specific query. |
| `kombu`; `konbu` | Kombu only | Kombu only | No seaweed alias is proposed. |
| `komochi kombu`; `kazunoko kombu`; `kazunoko` | None | None | These Japanese phrases are deliberately not added as aliases. |

The naming collision is the reason for the hold. Either natural English display `herring roe on kelp` or TERMIUM's French `œufs de hareng sur algue` contains the broad phrase already left unresolved by R416. The fisheries term `herring spawn on kelp / rogue de hareng sur varech` could narrow the query, but it is not established as the Québec recipe/retail display, and it would not make the generic roe product boundary unambiguous.

## Full bundled-recipe scan

The manifest-ordered audit parsed all **114 recipe files** and all **1,123 structured ingredient rows**, scanning every decoded recipe document and each ingredient row. It searched for `herring roe on kelp`, `herring spawn on kelp`, `spawn on kelp`, `roe on kelp`, `herring roe`, `œufs/oeufs de hareng`, `œufs/oeufs de hareng sur algue`, `œufs/oeufs de hareng pondus sur algue`, `œufs/oeufs de hareng récoltés sur le varech`, `rogue sur varech`, `rogue de hareng sur varech`, `komochi kombu`, and `kazunoko kombu`.

**Result: 0 candidate-term recipe files, 0 ingredient rows, and 0 linked rows.** The scanned recipe files contain **753,988 exact bytes**. The corpus fingerprint is **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, computed in manifest order over each relative path encoded as UTF-8, NUL, exact recipe bytes, NUL. This result applies to the bundled corpus only. [R01]

## Measures and substitutions

- **Forms and recipe links:** Add no reference, alias, form, legacy mapping, ledger identity, or recipe link. Do not attach this harvested product as a form of Pacific herring, Atlantic herring, or kombu.
- **Numeric evidence:** Canfisco's 30 lb pails and Seaborn's listed 180 g, 300 g, 400 g, and offcut options are source-specific packaging/SKU amounts. The sources do not support a recipe portion, household measure, density, roe-to-kelp ratio, draining conversion, edible yield, or cooking yield. Add no measurement observation or reusable value.
- **Substitution:** No reviewed recipe or source validates replacing this brined eggs-on-kelp product with detached kazunoko, herring flesh, kombu, another roe, or another seafood. Add no global or contextual substitution or recipe-line link.

## Recommendation and reopen conditions

Keep herring roe on kelp unallocated. Its identity as eggs harvested while attached to kelp is distinct and well-supported; the commercial product name, official French fishery wording, and Canadian market examples are also documented. However, any natural bilingual display that preserves these product names makes generic herring-roe wording select this one preparation while R416 and R42 intentionally leave the related plain-roe boundary unresolved. The recipe bundle has no demand to justify that picker tradeoff, and the reviewed sources do not provide a current Québec consumer label.

Reopen if a bundled recipe or confirmed import explicitly calls for spawn on kelp, herring roe on kelp, or an identified product such as `komochi kombu`. Match the line to its package and preparation, verify the French display in Québec-facing product/terminology evidence, and repeat picker and ownership checks. Do not use the plain kazunoko row, `ingredient-ref-pacific-herring`, or kombu as a substitute identity.

## Source register

Pages were accessed or checked on 2026-10-17. Each source ID maps to one URL. These citations remain proposal-local and add no shared ledger records.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S01** | Fisheries and Oceans Canada, [Informations sur la pêche au hareng du Pacifique](https://www.pac.dfo-mpo.gc.ca/fm-gp/pelagic-pelagique/herring-hareng/about-sujet-fra.html), sections `Rogue sur varech` and `Hareng rogué`, lines 35–61. | Defines a distinct Pacific herring fishery where eggs attach to kelp after spawning; mentions suspended kelp lines and traditional harvest. Official fishery explanation, not a Québec consumer label, recipe input, or universal product specification. Page last modified 2021-05-11. |
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S02** | Fisheries and Oceans Canada, [Pêches et Océans — 2026 communal-sale fishery notice FN0367](https://www-ops2.pac.dfo-mpo.gc.ca/fns-sap/index-fra.cfm?DOC_ID=350462&ID=all&pg=view_notice), French notice, issued 2026-03-31. | Uses `Œufs de hareng récoltés sur le varech` for a current Five Nations communal-sale fishery. Confirms current Canadian fishery naming and context; not a consumer package, OQLF ruling, or recipe measure. |
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S03** | Department of Justice Canada, [Pacific Fishery Regulations, 1993](https://laws-lois.justice.gc.ca/PDF/SOR-93-54.pdf), Part V, section 47, bilingual text, p. 16 of the consolidated PDF. | Pairs `Herring Spawn on Kelp` with `Rogue de hareng sur varech` in a transport rule. This is statutory fishery terminology, not a culinary product label or a recipe specification. Consolidation is current to 2024-06-19. |
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S04** | Government of Canada Translation Bureau, [TERMIUM Plus: Herring, Spawn on Kelp](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=73&i=&index=frb&lang=fra&sg_kp_wet=1945395&srchtxt=HARENG), Fish / Commercial Fishing record 5, dated 2018-02-23. | Lists `œufs de hareng sur algue` and `œufs de hareng pondus sur algue` for `herring roe on kelp / herring spawn on kelp`, and describes fertilized eggs attached to kelp. Terminology-bank evidence, not an OQLF ruling or a current Québec product label; the direct page request returned a cache miss during this review, while the record text was available in the indexed TERMIUM result. |
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S05** | Canfisco Group, [Salmon and Herring Roe Products](https://canfiscogroup.com/wp-content/uploads/2023/06/CanfiscoGroup-products-2023-06.pdf), pp. 5–6, lines 114–143; `Herring Roe (Kazunoko)` and `Herring Roe on Kelp (Komochi Kombu)`. | Canadian processor separates detached Kazunoko from eggs-on-kelp, describes brine-curing and grading, and lists a 30 lb pail. Origin table says only herring and kelp; no scientific taxon, recipe portion, or universal retail formulation is established. |
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S06** | Aero Trading, [Herring Roe & Herring Roe on Kelp](https://aerotrading.ca/our-products/kazunoko/), product heading and description. | Canadian processor separately names Kazunoko and herring roe on kelp and describes its BC spring-spawn supply; product grades are packed in 30 lb pails. Supplier-specific commercial information, not a scientific species assignment, Québec retail package, or kitchen measure. |
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S07** | Seaborn, [Herring Roe on Kelp](https://delivery.seaborn.ca/products/herring-roe-on-kelp-%E6%B5%B7%E5%B8%B6%E4%B8%8A%E7%9A%84%E9%AF%A1%E9%AD%9A%E5%AD%90-%E6%95%B0%E3%81%AE%E5%AD%90%E6%98%86%E5%B8%83), product description and package selector, lines 45–74; Vancouver address at lines 131–134. | Canadian retailer uses the English name and lists package options; advises desalting and seasoning this product. Wording and preparation are seller-specific and do not establish a Québec French name or a generic conversion. |
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S08** | Seaborn Canada, [New Products page](https://ol.seaborn.ca/index.php?disp_order=2&language=en&main_page=products_new&page=7), items HR-06 and HR-63. | Retailer separately lists `Salted Herring Roe on Kelp 180g` and `Salted Herring Roe 180g`. Search-indexed item listing and package labels only; stock, title, and package details may change. |
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S09** | Hiroshima City, [認定品名 こもち昆布](https://www.city.hiroshima.lg.jp/hiroshima-brand/tokusan/1026502/1026504/1014749.html), product description, lines 169–181; page updated 2025-08-27. | Describes a sweet simmered kombu tsukudani with tarako roe texture and lists 50 g / 140 g products. Japanese regional example showing `komochi kombu` has a distinct product use; not Canadian herring product evidence. |
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-S10** | Gouvernement du Québec, [Transformation des produits marins](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/transformation-produits-marins), `Hareng` section, last updated 2026-06-16. | Uses generic French `œufs de hareng` for herring roe in Québec marine-products context. It does not identify roe-on-kelp, salting state, or a retail name; this broad wording is used only to assess picker collision. |
| **WP04-SECTIONP-ROE-ON-KELP-R533-20261017-R01** | Read-only audit of the Section P plan, R42/R416 and adjacent product proposals, active references/forms, legacy candidates, ledger, manifest-listed recipe files, exact source URLs, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Current snapshot, identity/source ownership, exact-URL archive audit, picker projection, full recipe-corpus scan, and numeric/substitution evidence check. Audit reference only; not a ledger record. |

## Static validation

- Proposal file is UTF-8 without a BOM; accents and symbols display correctly.
- The R533 source-ID prefix is unique in the ledger and inspected proposal/batch archive; each external source ID above maps to one URL.
- Relative links to local plans, proposals, catalog assets, and `IngredientSearch.kt` resolve.
- Proposal text contains no trailing whitespace or mojibake markers.
- No software tests, build, emulator, or deployment were run; this documentation-only hold does not modify shared application/catalog data.
