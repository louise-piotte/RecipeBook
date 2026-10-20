# WP04 Section P — salmon kama / collar-cut boundary review (R526)

- **Review and online source-access date:** 2026-10-17.
- **Open checklist:** Section P keeps fish powder, fish balls, surimi, and other named seafood open; the broader regional-seafood checklist is also open ([plan: Section P fish products](../../RecipeBook-global-ingredient-catalog-plan.txt#L7602), [regional seafood](../../RecipeBook-global-ingredient-catalog-plan.txt#L7901), [continuation note](../../RecipeBook-global-ingredient-catalog-plan.txt#L14713)).
- **Candidate:** The salmon collar cut marketed on restaurant menus as `salmon kama`, `salmon collar`, or, in one Québec platform menu, `cou de saumon / salmon neck`.
- **Recommendation:** **Hold the cut outside active references, forms, aliases, legacy identities, and the shared research ledger.** Canadian menus establish a named salmon-collar dish, but they do not settle a Québec-standard French ingredient name, a reusable raw-cut specification, or a recipe need. Do not attach collar/kama to the generic salmon-fillet row or to a salmon species row.
- **Scope and exclusions:** This review covers the salmon collar/kama cut boundary. It does not add a generic fish-collar identity, infer a salmon species, or reopen accepted salmon species, the unqualified salmon fillet, salmon roe, canned salmon, smoked salmon, the Grizzly Gravlax-style product, or salmon jerky. It does not overlap R520's silverside/capucette review or R523's fish-floss hold.
- **Write scope:** The proposal review itself added no shared catalog, form, ledger, generated Kotlin file, manifest, recipe, or code. Root integrated the hold into the plan, workflow, roadmap, and batch README. No tests, build, emulator run, or deployment was needed for this documentation-only hold.
- **Proposal-local source IDs:** `WP04-SECTIONP-SALMON-KAMA-R526-20261017-S01` through `S08`. These remain unregistered and unallocated.

## Why this is a distinct open cut boundary

The current salmon work distinguishes the unqualified salmon-fillet reference from six species identities and separate canned, smoked, roe, Gravlax-style, and jerky products. None of those decisions assigns a neck/collar cut, `kama`, or a salmon-kama recipe identity. The R268 fillet review leaves the bundled 675 g fillet line species-unspecified and does not make other salmon cuts forms of that fillet identity. R169 covers the marketed smoked-salmon product group; R172 covers canned salmon; R47 and R463 concern, respectively, one Gravlax-style semi-smoked product and salmon jerky. Those product states do not identify a salmon collar. [S02–S06]

The live Canadian restaurant menus use the Japanese menu name `salmon kama` and explicitly gloss it as `salmon collar`. Ryuko's Calgary menu pairs **roasted miso salmon kama** with **pan-roasted BC salmon collar**; Sushi Moto's Toronto menu lists **Grilled Salmon Kama / Grilled salmon collar** and separately **Grilled Hamachi Kama / Grilled yellowtail collar**; Sushi Nova's Vancouver menu lists **Grilled Salmon Kama / Grilled salmon collar (1pc)**. These are current first-party menu descriptions of prepared restaurant dishes. They establish the local English menu phrase and the salmon-to-collar pairing, not a raw retail specification, exact bone line, salmon taxon, or household recipe ingredient. [S02–S04]

The Japanese Fisheries Association's Fish Food Promotion Center explains `kama` for tuna: the named part is near the gills, beside otoro, and around the gills and pectoral fin. That article is tuna-specific; it does not define a universal anatomy for every fish or establish the exact salmon cut used by the Canadian restaurants. Its usefulness here is to caution against turning the bare word `kama` into a salmon-only alias or a universal fish-cut identity. The Canadian menus themselves also use `kama` for yellowtail. [S01, S03]

Québec-facing wording remains unresolved. A current indexed Uber Eats menu for Sushi Plus LaSalle presents `H06 Cou de saumon / Salmon Neck 2pc` with teriyaki sauce; the restaurant's own site confirms the LaSalle location, but the direct menu page was not available to the browser for verification. This is one platform menu wording, not a Québec terminology ruling. OQLF's `darne de saumon` is a transverse fish steak and does not name a collar. TERMIUM Plus records `collet de morue` / `collier de morue` for a cod nape specifically. Neither reviewed authority supplies a salmon-collar French term. This is a gap in the evidence reviewed here, not proof that no such term exists. Do not promote `cou de saumon`, `collier de saumon`, or a constructed `kama de saumon` as a normalized French name on this evidence alone. [S05–S08]

## Current snapshot and ownership audit

The read-only 2026-10-17 snapshot is the post-R523 state. Hashes below are SHA-256 over exact file bytes.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| [Active ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,797 | 587,154 | `bb380278585b32b2785b8b1bad1907b5f1b1b3903ef32ad5c5c345a849f11923` |
| [Active ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 143 | 113,370 | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| [Legacy import identities](../legacy-import-identities.v1.json) | 56 | 13,351 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| [Research ledger](../research-ledger.v1.json) | 2,153 records; 9,886 source entries; 8,365 source IDs; 7,075 URLs | 10,095,548 | `28211fb36c8cec0819fd763715866ff8da0150d25cbe374055b0f198aa8009a5` |
| [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Exact-key checks mirrored [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD folding, accent and punctuation normalization, complete word-phrase matches first, and substring fallback only when there are no phrase matches. Checks covered bilingual active names and aliases, attached form labels and match terms, legacy candidates, ledger record IDs/decisions, source IDs and URLs, and the proposal/batch archive.

| Candidate wording or related owner | Current exact owner | Disposition |
|---|---|---|
| `salmon collar`, `salmon kama`, `salmon neck`, `neck of salmon`, `collar of salmon`, `fish collar`, `cou de saumon`, `collier de saumon`, `saumon kama`; illustrative IDs `ingredient-ref-salmon-collar`, `ingredient-ref-salmon-kama`, `candidate-salmon-collar` | No exact active reference, form, legacy candidate, or ledger identity owner. No focused prior proposal/batch review of these phrases was found. | Keep terms and illustrative IDs unallocated; none is reserved. |
| `ingredient-ref-salmon-fillets-without-skin` | Active `salmon fillets / filet de saumon`, with French alias `filets de saumon`; no attached salmon form. | Keep the bundled fillet reference and recipe link unchanged. Do not attach collar/kama as an alias or fillet form. |
| `ingredient-ref-atlantic-salmon`, `ingredient-ref-chinook-salmon`, `ingredient-ref-chum-salmon`, `ingredient-ref-coho-salmon`, `ingredient-ref-pink-salmon`, `ingredient-ref-sockeye-salmon` | Active species-specific references; none has an attached form for collar/kama. | Do not infer one species from menus that say only salmon or BC salmon. |
| `ingredient-ref-canned-salmon`, `ingredient-ref-smoked-salmon`, `ingredient-ref-salmon-roe` | Active identities for separate product groups; no collar/kama ownership or attached forms. | Preserve their independent product boundaries. |
| `candidate-wp04-salmon-species-scope` | Ledger-only unresolved candidate limited to the taxon of the generic salmon ingredient in Recipe 077. | Keep unchanged; it does not identify a cut or a species for the menu products. |
| R526 source-ID prefix and S01–S08 URLs below | No prefix or exact source-URL owner in the current ledger or inspected proposal/batch archive. | All citations remain proposal-local; do not register sources or create a ledger identity as part of this hold. |

The eight R526 source IDs map one-to-one to the eight URLs in the source register. Search also found the R152 product name `kamaage shirasu`; that is a distinct Japanese product name, not an owner for salmon `kama` or a fish-collar cut.

## Picker projection

The static projection uses the matching behavior in `IngredientSearch.kt` over names, aliases, and attached form terms. For risk analysis only, the hypothetical row is `salmon collar / cou de saumon`, with no aliases or forms; it is not recommended.

| Query | Current result | With hypothetical row | Effect |
|---|---:|---:|---|
| `salmon collar`; `cou de saumon` | 0; 0 | 1; 1 | Exact lookup would work only if both displays were established for the intended ingredient. The French phrase is found only in a Québec platform menu here. |
| `salmon kama` | 0 | 0 | The bilingual collar hypothesis would not include `kama` as an alias. |
| `kama` | 0 | 0 | Do not add bare `kama`: the Canadian menus use it for salmon and yellowtail, while the Japanese fisheries article is about tuna. |
| `salmon`; `saumon` | 10 each | 11 each | A salmon-cut row would broaden two already multi-result species/product queries. |
| `fish`; `poisson` | 13; 12 | 13; 12 | No generic fish alias is proposed. |
| `collar` | `collard greens` via substring fallback | Hypothetical salmon collar only | A full-word `collar` phrase would take precedence over the current partial `collard` match. |
| `cou` | 30 substring results | Hypothetical salmon collar only | Using `cou de saumon` as a display makes the very short French query an exact-word match and suppresses fallback results; the phrase needs an actual recipe/picker decision before use. |

These projections are code-path analysis, not an app picker test. No hypothetical term was added to the active catalog.

## Full bundled-recipe scan

The manifest-ordered scan parsed all **114 recipe files** and all **1,123 structured ingredient rows**, searched the full decoded JSON for candidate wording, and separately searched every ingredient row. It covered `salmon collar/collars`, `salmon kama`, `salmon neck/necks`, `neck of salmon`, `collar of salmon`, `fish collar/collars`, `cou de saumon`, `cous de saumon`, `collier de saumon`, `saumon kama`, `鮭カマ`, `サーモンカマ`, and related salmon-cut wording. It found **0 matching recipe files, 0 matching ingredient rows, and 0 linked rows**.

The scan read **753,988 exact recipe-file bytes**. Its corpus fingerprint is **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, computed in manifest order over each manifest-relative recipe path encoded as UTF-8, NUL, exact file bytes, NUL. A broader salmon scan found one ingredient row: Recipe 077 ingredient 10, `675 g salmon fillets without skin, cut into cubes`, linked to `ingredient-ref-salmon-fillets-without-skin`. That line is not a collar/kama request and does not identify a species. [R01]

## Forms, measures, and substitutions

- **Identity and forms:** Add no active reference, alias, form, legacy mapping, ledger candidate, or recipe link. Do not merge a collar with the existing generic fillet reference or attach a collar form to any salmon species.
- **Measures:** The Vancouver menu's `1pc` and the LaSalle platform menu's `2pc` are different restaurant-item counts. Neither gives raw collar mass or a recipe ingredient quantity. No source supplies household volume, density, package conversion, edible yield, or cooking yield; add none.
- **Substitutions:** No reviewed recipe or cut source provides a tested replacement amount or dish-method outcome. Do not add a global or contextual substitution between salmon collar, salmon fillet, salmon head/cheek, yellowtail collar, tuna kama, or another fish cut.

## Disposition and reopen conditions

Hold `salmon kama / salmon collar` outside the active catalog and shared ledger. The Canadian menus support the English cut phrase as part of prepared restaurant dishes, while the Québec platform listing uses `cou de saumon / salmon neck`; the language authorities reviewed define salmon steaks and cod napes but do not establish a Québec salmon-collar display. The source set also does not settle one raw trimming boundary or imply species identity. With no matching bundled recipe and no recipe-ready bilingual name, neither a new salmon-cut reference nor a form under an existing salmon row is supported now.

Reopen when a bundled recipe or confirmed import requests the collar/kama cut. Then verify its source wording and ingredient state, determine whether the app needs an independent cut identity or a form on a specified salmon reference, and repeat the picker, ownership, and recipe scans. Do not promote bare `kama`, `cou de saumon`, or `collier de saumon` without support from the exact recipe or a Québec terminology/product source.

## Source register

Online source pages were accessed or checked on 2026-10-17. The menu and terminology sources support only the claims and limits in the rows below. Each proposal-local source ID maps to one URL; none is registered in the shared ledger.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SALMON-KAMA-R526-20261017-S01** | Japan Fisheries Association, Fish Food Promotion Center, [What is tuna kama? Where is it?](https://osakana.suisankai.or.jp/s-other/6016), “マグロのカマってドコ？” and “カマはどうやって食べたらいい？” sections, accessed 2026-10-17. | Describes tuna kama as near the gills, alongside otoro, and around the gills/pectoral fin; notes complex bones. Tuna-specific educational material, not a universal fish anatomy specification or salmon-collar source. |
| **WP04-SECTIONP-SALMON-KAMA-R526-20261017-S02** | Ryuko Japanese Kitchen + Bar, [Food Menu](https://www.ryuko.ca/newmenu/food-menu), “roasted miso salmon kama,” lines 75–78 in the online page; Calgary locations listed on page; accessed 2026-10-17. | First-party menu describes pan-roasted BC salmon collar with seasonings. `BC salmon` does not identify a taxon, and a cooked menu description does not define the raw trimming boundary or recipe amount. |
| **WP04-SECTIONP-SALMON-KAMA-R526-20261017-S03** | Sushi Moto Wine & Sake Bar, [Menu 2](https://sushimoto.ca/menu-2/), “Grilled Salmon Kama / Grilled salmon collar” and “Grilled Hamachi Kama / Grilled yellowtail collar,” lines 356–369; restaurant address at 4901 Yonge Street, Toronto, lines 2298–2304; accessed 2026-10-17. | First-party Canadian menu pairs the name with collar and separately applies `kama` to yellowtail. It gives no salmon species, raw-product specification, or reusable amount. |
| **WP04-SECTIONP-SALMON-KAMA-R526-20261017-S04** | Sushi Nova, [Robata menu](https://sushinova.ca/en/menu_03-salad_side_robata.php), “Grilled Salmon Kama / Grilled salmon collar (1pc),” lines 122–148; restaurant address at 2059 West 4th Avenue, Vancouver, lines 162–167; accessed 2026-10-17. | First-party Canadian menu links one prepared item to salmon collar. The `1pc` is one restaurant listing's item count, not raw collar mass or a household measure; page states items/prices may change. |
| **WP04-SECTIONP-SALMON-KAMA-R526-20261017-S05** | Sushi Plus, [Official restaurant site](https://sushiplus.ca/), LaSalle location and address at 2101 Dollard Avenue, lines 7–25; accessed 2026-10-17. | Confirms the restaurant location tied to S06. The site links out to ordering and does not itself provide the collar wording. |
| **WP04-SECTIONP-SALMON-KAMA-R526-20261017-S06** | Uber Eats, [Sushi Plus LaSalle menu](https://www.ubereats.com/ar-en/store/sushi-plus-lasalle/D2ugz6a7TvmCzf51esImwA), indexed current listing `H06 Cou de saumon / Salmon Neck 2pc` and description “Tender salmon neck in a sweet teriyaki sauce”; checked 2026-10-17. | Québec restaurant menu wording and count as indexed by a delivery platform. Direct page fetch returned a cache miss; this is not an OQLF/TERMIUM term record, raw retail listing, or verified ingredient specification. |
| **WP04-SECTIONP-SALMON-KAMA-R526-20261017-S07** | Office québécois de la langue française, [darne de saumon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298295/darne-de-saumon), definition and preferred term; last updated 1984; accessed 2026-10-17. | Defines `darne de saumon` as a cross-cut salmon/fish steak and gives English `salmon steak`. It is a different cut, not evidence for `cou de saumon` or `collier de saumon`. |
| **WP04-SECTIONP-SALMON-KAMA-R526-20261017-S08** | Translation Bureau, TERMIUM Plus, [COLLET results](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=COLLET), record “cod nape,” dated 2021-01-25; accessed 2026-10-17. | Gives English `cod nape/nape` and Québec French `collier de morue` / `collier`, with the observation that it designates cod necks. Cod-specific terminology must not be transferred to salmon. |
| **WP04-SECTIONP-SALMON-KAMA-R526-20261017-R01** | Read-only audit of the Section P plan, R520/R523 proposals, salmon product/species proposals and batches, active references/forms, legacy candidates, research ledger, manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Current ownership, source-ID/URL, picker-projection, numeric/substitution, and complete-corpus audit. Audit label only; not a shared-ledger record. |

## Final disposition

**Hold** the salmon collar/kama cut outside shared catalog data until a recipe or exact import selects the raw ingredient and the intended bilingual display. Preserve the existing generic salmon-fillets identity, species rows, and separate salmon product identities. The 114-file recipe corpus has no collar/kama demand; the available piece counts are restaurant menu counts, and no transfer or substitute amount is supported. The hold is integrated in the [R526 integration README](../batches/wp04-section-p-salmon-kama-collar-boundary-hold-integration-r526-20261017/README.md). No catalog or ledger data changed and no software tests were needed for this documentation-only update.
