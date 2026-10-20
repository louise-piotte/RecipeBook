# WP03 Section F — Fregola Sarda Regional Pasta Identity Review (R45, 2026-10-13)

## Review record

- **Scope:** the named Sardinian dried pasta product *fregola sarda*, made as small semolina-dough granules and commonly dried and toasted.
- **Open checklist:** the parent item for regionally significant cereal mixes and preprocessed grains remains open in the [live plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
- **Status:** proposal only. No catalog, ledger, plan, roadmap, batch README, recipe, or generated file was changed.
- **Recommendation:** add one identity-only `GRAIN_AND_CEREAL` reference as **`fregola sarda / fregola sarda`**, with source-attested spelling aliases **`fregula`** and **`fregula sarda`** in both alias arrays. Keep the dry regional pasta distinct from couscous, pearl couscous, orzo, durum semolina, and generic pasta.
- **Suggested ID:** `ingredient-ref-fregola-sarda`.
- **Data limits:** no forms, recipe links, measures, density, unit mappings, conversions, cooking yield, or substitutions.
- **Proposal-local source-ID prefix:** `WP03-FREGOLA-R45-20261013-S` (S01–S07); this prefix was absent from the research ledger and proposal/batch archive before drafting.

## Why this is a distinct open candidate

The current Section F parent item remains unchecked. Exact-name searches of the live plan, roadmap, proposal and batch archive, active ingredient references, forms, legacy-import candidates, research ledger, and bundled recipes found no prior *fregola* review or exact owner. This candidate is a dry Sardinian pasta product, not a grain mix or a new couscous alias; the regional sources classify it as pasta and describe a distinct rolled-granule and drying/toasting process [S01, S02].

The current Québec product listing from Montréal distributor Distributions Macchi uses **Fregola Sarda** in both its English and French product pages and categorizes the item under pasta / *pâtes* [S03, S04]. A Québec retail listing also uses **Fregola** in a French product title and description [S05]. The regional term is therefore useful in the picker without inventing a French translation. A targeted OQLF search did not find a dedicated entry for this product name; the proposed French display retains the locally listed Italian name rather than presenting an unattested translated common noun.

The regional government product sheet describes irregular small spheres of durum wheat semolina and water, dried and toasted, while Sardinian manufacturers document both hand-formed and commercial versions [S01, S06]. Those sources establish a stable named product boundary, not a single producer-independent particle size, recipe, ingredient declaration, or manufacturing method.

## English and Québec French naming and boundary

| Use | Decision | Evidence limit |
|---|---|---|
| **English display** | `fregola sarda` | Macchi's current English product page uses `Fregola Sarda`; this is Canadian supplier wording, not a guarantee of stock at a retailer [S03]. |
| **Québec French display** | `fregola sarda` | Macchi's French page retains `Fregola Sarda` under *Pâtes*; La Moisson's French retail page uses `Fregola` [S04, S05]. This is product-name evidence, not an OQLF terminology ruling. |
| **Spelling aliases** | Add `fregula` and `fregula sarda` to both alias arrays | The Regione Autonoma della Sardegna product sheet and the national traditional-food register identify `fregola/fregula`; a current maker page also uses `Fregula Sarda` [S01, S02, S07]. |
| **Sardinian pasta boundary** | Small, irregular granules made from semolina dough; commonly dried and toasted | The official regional sheet and manufacturer sources support this product family. Their descriptions do not establish that every product has the same size, ingredient panel, toasting level, or hand/industrial process [S01, S06]. |
| **Whole-wheat or flavored variants** | Keep outside the proposed plain identity unless an exact recipe/product requires review | Importers list whole-wheat and flavored variants separately; those product-specific differences do not establish aliases or universal composition for the plain identity [S06]. |
| **Not accepted as aliases** | `Sardinian couscous`, `toasted couscous`, `pearl couscous`, `couscous`, `orzo`, `durum semolina`, `fregola tostata`, and `toasted fregola` | Some sources compare fregola with couscous or list toasted variants, but comparison and producer-specific product labels do not make them universal synonyms. Keep these terms on their existing identities or out of global aliases. |

## Exact ownership and picker effects

At the pre-proposal snapshot the bundled reference catalog contains **1,368 references**, the form catalog **100 forms**, the legacy-import file **64 candidates**, and the research ledger **1,699 records**. Exact normalized searches for `fregola`, `fregola sarda`, `fregola tostata`, `fregula`, `fregula sarda`, `sa fregola`, `Sardinian couscous`, and `toasted fregola` found no active reference, form, legacy candidate, ledger owner, prior proposal, or batch decision. The suggested reference ID and source-ID prefix were also unused.

| Current exact owner | Existing boundary | Proposed effect |
|---|---|---|
| None for `fregola sarda` or `fregula sarda` | No active reference, form, legacy identity, or ledger candidate owns these phrases. | Add one bounded identity; both source-backed phrases resolve to that identity. |
| `ingredient-ref-couscous` — `couscous / couscous` | Generic couscous remains broad and unchanged. | Do not add either fregola spelling or a couscous comparison as an alias. |
| `ingredient-ref-pearl-couscous` — `pearl couscous / couscous perlé` | Existing small-pasta/couscous identity remains separate. | No alias or recipe substitution is added. |
| `ingredient-ref-baddaz-corn-couscous`, `ingredient-ref-barley-couscous`, `ingredient-ref-keskes-khoumassi`, `ingredient-ref-millet-couscous-thiere` | Each names a separately scoped couscous product. | No current owner or picker term changes. |
| `ingredient-ref-durum-semolina`, `ingredient-ref-pasta`, `ingredient-ref-orzo` | Existing raw milling ingredient, broad pasta identity, and pasta shape remain separate. | Fregola does not become a semolina synonym or a generic pasta alias. |

The static projection uses the current [phrase-first ingredient search](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9), which normalizes accents and punctuation before falling back to substring matching:

| Query | Current result count | Projected count | Effect |
|---|---:|---:|---|
| `fregola` | 0 | 1 | Finds the new identity. |
| `fregola sarda` | 0 | 1 | Finds the new identity. |
| `fregula` | 0 | 1 | Finds the regional spelling alias. |
| `fregula sarda` | 0 | 1 | Finds the qualified spelling alias. |
| `couscous` | 6 | 6 | Unchanged because no couscous alias is proposed. |
| `pearl couscous` | 1 | 1 | Unchanged. |
| `pasta` | 5 | 5 | Unchanged because the new display and aliases do not include the generic word. |
| `semolina` | 4 | 4 | Unchanged; the raw semolina identity retains its current ownership. |

These are static data/source projections only, not interactive picker testing.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across complete serialized JSON and ingredient fields for `fregola`, `fregola sarda`, `fregola tostata`, `fregula`, `fregula sarda`, `sa fregola`, `Sardinian couscous`, and `toasted fregola`.

- Candidate-phrase recipe files: **0**.
- Candidate-phrase ingredient rows: **0**.
- Links to `ingredient-ref-fregola-sarda`: **0**.

The Canadian and Québec market listings establish a real catalog candidate, but the current bundled recipe corpus has no direct demand. No recipe link or recipe edit is proposed.

## Forms, measurements, and substitutions

- **Forms:** add none. The catalog identity is the named dried pasta product; a later cooked preparation belongs to the recipe line and does not require global dry/cooked forms here.
- **Measurements and density:** keep `defaultDensity: null` and `unitMappings: []`. The Canadian product page and Québec retail page give a 500 g package [S04, S05]; package mass is not a household measure, density, or recipe portion. Manufacturer nutrition panels expressed per 100 g are nutrition bases, not mass-to-volume observations [S06].
- **Cooking behavior and yield:** producers' drying, toasting, and recipe descriptions are product/process evidence only. They do not establish a reusable volume, dry-to-cooked conversion, cooking yield, or a universal water ratio [S01, S06].
- **Substitutions:** add no global or contextual rule between fregola, couscous, pearl couscous, orzo, semolina, or other pasta. Similar small-granule appearances and menu uses do not establish equal cooking behavior, recipe role, or replacement quantities.

## Source register

Sources were checked online on 2026-10-13. The IDs below are proposal-local; none was added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-FREGOLA-R45-20261013-S01` | Regione Autonoma della Sardegna, [Schede identificative dei prodotti tradizionali — fresh pasta and bakery category](https://files.regione.sardegna.it/squidex/api/assets/redazionaleras/24b3925f-91ef-4438-bf20-9cdc3cf7b3d9/7.-schede-categoria-paste-fresche-e-prodotti-della-panetteria-della-pasticceria-della-biscotteria-e-della-confetteria.pdf), PDF pp. 43–44, fregola sarda entry. | Regional government product sheet describes irregular small spheres of durum wheat semolina and water, natural drying and toasting, and the processing method; it documents `fregola/fregula` spelling. This is a regional product specification, not evidence that all current manufacturers use identical sizes or formulations. |
| `WP03-FREGOLA-R45-20261013-S02` | Italian Ministry of Agriculture, Food Sovereignty and Forests, [National list of traditional agri-food products](https://www.masaf.gov.it/flex/cm/pages/ServeAttachment.php/L/IT/D/7%252Ff%252Fc%252FD.752a52535cc29bcadf34/P/BLOB%3AID%3D11568/E/pdf), Sardinia section, PDF p. 57, item 109. | Lists `Fregola, Fregula` among products of Sardinia in the traditional-food register. The register entry establishes regional product recognition, not an ingredient formula or protected geographical indication. |
| `WP03-FREGOLA-R45-20261013-S03` | Distributions Macchi Inc., Montréal, [Fregola Sarda — English product page](https://macchiinc.com/en/products/fregola-sarda/). | Current Québec distributor page lists the English product name, pasta category, and 500 g format. A supplier listing is not a retail-availability guarantee or a recipe measure. |
| `WP03-FREGOLA-R45-20261013-S04` | Distributions Macchi Inc., Montréal, [Fregola Sarda — French product page](https://macchiinc.com/produits/fregola-sarda/). | French product page uses the unchanged name `Fregola Sarda`, classifies it under *Pâtes*, and lists a 500 g format. It supports Québec-facing display wording, not an OQLF ruling. |
| `WP03-FREGOLA-R45-20261013-S05` | La Moisson, [Pâtes artisanales — Fregola](https://lamoisson.com/collections/pates-pasta/products/pates-artisanales-fregola), French Québec retail listing. | Search-indexed page content lists a 500 g Favuzzi product titled `Pâtes artisanales - Fregola`, gives the ingredient `semoule de blé dur`, and describes the local French product name. Direct page retrieval returned a cache miss during this review; the source is used for displayed wording, not a current stock claim. |
| `WP03-FREGOLA-R45-20261013-S06` | Qui Sardegna / I Cagliaritani, [Pasta](https://www.quisardegna.it/en/pasta/), manufacturer page. | Current maker page describes Fregola as traditional dried Sardinian pasta, small irregular spheres made with durum wheat semolina, naturally dried and toasted. Those are this maker's product claims and do not establish universal ingredients or recipe behavior. |
| `WP03-FREGOLA-R45-20261013-S07` | Pastificio Tanda & Spada / Kara Sardegna, [Toasted Fregula Sarda](https://www.karasardegna.it/scheda-mp.asp?id=MP123-9770B&ver=en), manufacturer product page. | The maker's product wording supports `Fregula Sarda` as a qualified spelling variant. Search-indexed page content also identifies it as a toasted durum-semolina pasta; direct page retrieval returned a cache miss during this review, so no availability or additional product specification is inferred. |

## Next action

Integrate only the identity `ingredient-ref-fregola-sarda`, with display `fregola sarda / fregola sarda`, spelling aliases `fregula` and `fregula sarda` in both alias arrays, category `GRAIN_AND_CEREAL`, null density, and empty unit mappings. Keep generic couscous, pearl couscous, barley/millet couscous, Baddaz, Khoumassi, semolina, and pasta unchanged. Add no forms, numeric behavior, recipe links, conversions, cooking yields, or substitutions. Section F remains open.

No tests were run because this is proposal-only research.
