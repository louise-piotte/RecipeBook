# WP05 Section X — Unqualified Red Curry Paste Scope Review

Date: 2026-10-12. Status: reviewed hold; the ownership question remains open pending recipe provenance or owner confirmation. This follow-up covers only the unresolved relationship between the active unqualified `red curry paste` reference and Thai red curry paste. It changes no catalog or recipe data. The evidence and hold decision are recorded in the research ledger, plan, workflow, and roadmap. No tests were needed because the work changes only documentation and research metadata.

## Recommendation

**Hold the relationship.** Sources establish Thai red curry paste as a named product style and support a Québec French form, `pâte de cari rouge thaïe`. They do not establish that the current unqualified reference—or its sole bundled recipe request—means that Thai style. Do not add a Thai alias, a second identity, a form, or a recipe-line link yet.

The earlier green-curry review described the red reference as a “specific red style,” but the live research-ledger record had no source or decision attached. The residual-style proposal and its integration note correctly left the scope unresolved. This review treats the earlier phrase as an unsupported assertion, not evidence. The current ledger now records the reference as `needs_clarification` with an unresolved decision. [S10–S11]

If the recipe’s original source or author later confirms Thai intent, the least disruptive candidate is to keep `ingredient-ref-red-curry-paste` and add only `Thai red curry paste` / `pâte de cari rouge thaïe` as EN/FR aliases. If evidence instead confirms a genuinely broader red-paste class and a separate Thai identity is needed, do not create it without first addressing the search collision described below. Until either scope is established, leave the active record unchanged.

## Current owner and boundaries

| Reference | Current EN / fr-CA label | Current aliases | State and boundary |
|---|---|---|---|
| `ingredient-ref-red-curry-paste` | `red curry paste` / `pâte de cari rouge` | EN: `store-bought red curry paste`; FR: `pâte de cari rouge du commerce` | `SAUCE_AND_CONDIMENT`; no density or unit mappings. The ledger records `needs_clarification` with an unresolved scope decision. “Store-bought” does not establish Thai origin. |
| `ingredient-ref-curry-paste` | `curry paste` / `pâte de cari` | None | Generic prepared-paste neighbor; not an alias of the red row. |
| `ingredient-ref-green-curry-paste` | `Thai green curry paste` / `pâte de cari vert thaï` | None | Already integrated. Its green style is outside this follow-up. |

Yellow, Panang, Massaman, nam prik pao, pla ra, and shrimp-paste identities were integrated or reviewed in the preceding Section X packet and are excluded here. This note does not reopen those decisions. [S11]

## Bundled demand and static audit

The live split-package snapshot inspected for this review contains **1,190 ingredient references, 86 forms, 66 legacy candidates, and 114 manifest-listed recipes with 1,123 ingredient rows**. The source files were SHA-256 checked so the counts are tied to this snapshot:

| Population | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,190 | `24a913f1af8a0d778d803bcac0624603eee70179c29112f16f2cdce24663e0dd` |
| Ingredient forms | 86 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Manifest-listed recipe files | 114 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Ingredient rows in those recipes | 1,123 | — |
| Legacy import candidates | 66 | — |

The current research ledger contains **1,491 records, 4,983 source entries, 4,066 distinct source IDs, and 8 unit conversions** (SHA-256: `e014f19fdf72353f16ef99adff433ce131eaeef7feafbe2c0e067a659802a914`).

The only matching bundled row is in recipe 095, *Satay*: row `9ec0ba36-1f7e-47d0-aedc-22ca03a5c672-ingredient-4`, text `red curry paste`, owner `ingredient-ref-red-curry-paste`. The row contains no Thai qualifier. The current seed record has no source URL and its import metadata says `recipekeeper-manual-cleanup`. I also checked the archived [RecipeKeeper export](../../exported-recipe-lists/RecipeKeeper_20260320_143058/recipes/processed_095-sat-satay-9ec0ba36-1f7e-47d0-aedc-22ca03a5c672.json): `sourceUrl` is null and its bilingual ingredient line says only “store-bought red curry paste” / `pâte de cari rouge du commerce`. Neither the row wording nor the archive preserves source or author intent that would settle the style. The recipe title and surrounding dish context do not establish a paste’s regional identity. No row is reassigned, and no recipe quantity is reproduced.

The full row scan found no Thai-qualified red-paste request. There are no red-paste style forms. Exact normalized-name ownership across current references, forms, and legacy candidates is:

| Candidate term | Current exact owner |
|---|---|
| `red curry paste`; `pâte de cari rouge` | `ingredient-ref-red-curry-paste` |
| `store-bought red curry paste`; `pâte de cari rouge du commerce` | `ingredient-ref-red-curry-paste` aliases |
| `Thai red curry paste`; `pâte de cari rouge thaïe`; `pâte de cari rouge thaï`; `pâte de cari rouge à la thaïlandaise`; `pâte de curry rouge thaïe`; `pâte de curry rouge de la cuisine thaïlandaise`; `pâte au cari rouge` | No exact reference, form, or legacy owner |

The exact-name scan follows the application’s lowercase, NFKD, diacritic-folding search key. Exact-name ownership is currently unique, but the app also returns terms that contain the query as a whole word phrase. Therefore, if a second reference were named `Thai red curry paste` / `pâte de cari rouge thaïe`, searches for the existing unqualified phrases `red curry paste` and `pâte de cari rouge` would match both references. That predicted duplicate hit follows from [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which is why a second identity would require an explicit search-resolution decision. This is a code-based inference, not a catalog test.

## Identity evidence versus owner evidence

| Evidence | What it establishes | What it does not establish |
|---|---|---|
| Pantai’s manufacturer page calls its SKU “Red Curry Paste,” describes it as Thai red curry paste, and marks it made in Thailand. | A Thai manufacturer sells a red paste under an unqualified English product title while explicitly identifying its own product as Thai. | The name of the current catalog record or the intended product in recipe 095. [S01] |
| Ajinomoto Thailand’s page titles a product “Ready to cook Red Curry Paste” and describes its taste as Thai. | Another Thailand-based manufacturer uses an unqualified red-paste title for a specifically Thai product. | A universal rule that every unqualified red curry paste is Thai. [S02] |
| The Canadian Intellectual Property Office’s French goods description includes `pâte de cari rouge thaïe`. | An exact Canadian French qualified form for the named Thai style. | An OQLF terminology ruling, product standard, or mapping for this recipe row. [S03] |
| Québec’s SAQ recipe uses `pâte de cari rouge thaïe`; Metro’s Blue Dragon listing uses `Pâte de cari rouge thaï`; Le Creuset Canada uses `pâte de cari rouge à la thaïlandaise` for a homemade version. | Québec-facing French sources use the `cari` form with more than one Thai qualifier; the chosen candidate `pâte de cari rouge thaïe` is directly attested. | One universal vendor label or evidence that all three phrasings should become aliases. [S04–S06] |
| Well.ca’s French listing for Thai Kitchen uses both `pâte de curry rouge` and `pâte de cari rouge`; Loblaws listings include both unqualified and Thai-qualified product titles. | Retail wording varies by brand and listing, including `cari`/`curry` and qualified/unqualified displays. | Product equivalence, non-Thai scope for unqualified SKUs, or a stable alias set. [S07–S08] |
| OQLF’s GDT lists both `cari` and `curry` as accepted in Québec for the cited spice-blend sense. | `cari` is suitable in the existing fr-CA label; `curry` is also an accepted Québec variant in that sense. | An OQLF decision for the prepared paste name. [S09] |

Taken together, these sources support **the existence and bilingual naming of the Thai red paste class**, but not the ownership relationship currently open in the plan. Manufacturers show that a Thai product can carry the short English label “Red Curry Paste”; Canadian French retailers likewise vary their product labels. That makes the current unqualified row compatible with Thai intent, but not uniquely diagnostic of it. Recipe 095 lacks provenance, so it cannot resolve the ambiguity.

For any later Thai-qualified wording, prefer the narrow pair `Thai red curry paste` / `pâte de cari rouge thaïe`. Do not add the broader alternates `pâte de cari rouge`, `pâte de curry rouge`, `pâte au cari rouge`, or `pâte de cari rouge à la thaïlandaise` as aliases on a new Thai row: the first is already the current display, the others are not needed to identify a canonical Québec label, and the French base phrase would trigger the current search overlap. No alias is recommended while the owner relationship remains held.

## Evidence gaps

- The original source/author intent for recipe 095 and the provenance behind the current red-reference row are absent.
- External sources establish Thai red paste products but do not show that this recipe used one of them.
- Québec-facing product labels vary between `cari` and `curry` and between an adjectival qualifier (`thaïe`/`thaï`) and a phrase (`à la thaïlandaise`). The OQLF page supports the Québec acceptability of `cari` and `curry` in related senses, but does not standardize a paste term.
- Adding a separate Thai identity would create base-query overlap under current phrase-search behavior. The research packet does not propose search-code changes.

## Sources

External sources were accessed 2026-10-12. Manufacturer and retailer descriptions support only their named product or displayed label. Product formulas, amounts, and instructions were not transferred.

| ID | Source | Use and limit |
|---|---|---|
| `WP05-RED-SCOPE-20261012-S01` | Pantainorasingh Manufacturer Co., [Red Curry Paste](https://pantainorasingh.com/products/red-curry-paste) | Names a Red Curry Paste product, identifies it as Thai red curry paste, and labels it made in Thailand. Maker-specific evidence only. |
| `WP05-RED-SCOPE-20261012-S02` | Ajinomoto Thailand, [Ready to cook Red Curry Paste](https://www.ajinomoto.co.th/en/our-product/retail-product/rosdee-menu/ready-to-cook-red-curry-paste/) | Thai manufacturer product title and Thai-taste description; does not establish universal scope. |
| `WP05-RED-SCOPE-20261012-S03` | Canadian Intellectual Property Office, [Journal des marques de commerce, Vol. 73 No. 3727](https://www.ic.gc.ca/opic-cipo/tmj/eng/01Apr2026_fr.pdf?edition=04-01&year=2026) | Includes the wording `pâte de cari rouge thaïe` in goods text. Trademark wording is not a terminology or product standard. |
| `WP05-RED-SCOPE-20261012-S04` | SAQ, [Cari de crevettes au lait de coco](https://www.saq.com/fr/cari-crevettes-lait-coco) | Québec French recipe uses the exact phrase `pâte de cari rouge thaïe`; recipe context is not owner evidence for the bundled row. |
| `WP05-RED-SCOPE-20261012-S05` | Metro, [Blue Dragon Pâte de cari rouge thaï](https://www.metro.ca/epicerie-en-ligne/allees/cuisine-du-monde/asiatique/pate-de-cari-rouge-thai/p/672774116074) | Québec-facing product title and description use `thaï`; one retailer/SKU wording only. |
| `WP05-RED-SCOPE-20261012-S06` | Le Creuset Canada, [Cari rouge de poulet à la thaïlandaise](https://www.lecreuset.ca/fr_CA/cari-rouge-de-poulet-a-la-tha%C3%AFlandaise/LCRCA-0013.html) | Uses `pâte de cari rouge à la thaïlandaise` for a homemade paste in a Thai curry recipe; not a commercial product synonym standard. |
| `WP05-RED-SCOPE-20261012-S07` | Well.ca Canada, [Thai Kitchen Red Curry Paste](https://well.ca/fr/produits/thai-kitchen-red-curry-paste_127432.html) | French listing mixes `pâte de curry rouge` and `pâte de cari rouge` for one named Thai Kitchen SKU; retailer wording only. |
| `WP05-RED-SCOPE-20261012-S08` | Loblaws, [French product listings](https://www.loblaws.ca/fr/search?search-bar=curry+roux) | Shows unqualified and Thai-qualified curry-paste titles across listed SKUs; title variation does not establish product equivalence or catalog scope. |
| `WP05-RED-SCOPE-20261012-S09` | Office québécois de la langue française, [cari — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8355168/cari) | Lists `cari` and `curry` as Québec-accepted terms for the cited spice-blend sense; not a prepared-paste entry. |
| `WP05-RED-SCOPE-20261012-S10` | Existing proposal, [WP05 Section X green curry paste and Thai sweet chili sauce review](wp05-section-x-green-curry-paste-sweet-chili-review-20261012.md) | Contains the prior “specific red style” characterization, while the live red ledger row remains unreviewed. |
| `WP05-RED-SCOPE-20261012-S11` | Existing proposal and batch, [Thai curry-paste residual styles review](wp05-section-x-thai-curry-paste-residual-styles-review-20261012.md) and [integration note](../batches/wp05-section-x-thai-paste-identities-integration-20261012/README.md) | Both leave the red relationship unresolved because the only bundled owner request is unqualified; other integrated styles are outside this follow-up. |

## Handoff

The bounded research review is complete, but the ownership question stays open. Thai red curry paste is a distinct named product style with a locally attested French label; current evidence is not sufficient to alias or split `ingredient-ref-red-curry-paste`. Resolve the existing row only when its recipe source or owner intent can be recovered, then rerun the exact-owner, search-collision, form/legacy, and full recipe-row audits before any catalog change.
