# WP02 Section B — sunflower seed flour boundary review

- **Reviewed:** 2026-10-12.
- **Status:** The hold disposition is recorded beneath WP02 Section B in the live plan and roadmap. No catalog, ledger, recipe, code, or generated file was changed.
- **Scope:** One adjacent Section B alternative-flour candidate: culinary sunflower-seed flour. This is a new WP02 review, not a second review of the existing sunflower-seed identity.
- **Recommendation:** **Hold the unqualified catalog identity and all aliases.** Current Canadian products establish demand for the phrase, but sources use it for different and incompletely specified milling, oil-removal, carrier, and heat-treatment scopes. The French flour name has no strong current Québec product or terminology support. The bundled recipes contain no sunflower wording or flour demand.
- **Prior-review check:** The WP03 sunflower-seed/kernel review explicitly deferred flour and meal for later work; it did not decide their flour boundary. No earlier WP02 flour/starch proposal or integration batch for sunflower-seed flour was found. The review remains open after the separate sesame-flour hold.

## Recommendation and name boundary

| Phrase or product | Evidence and decision | Catalog treatment now |
|---|---|---|
| `sunflower seed flour` | A current Ontario bakery mills hulled sunflower seeds into a product with this title; a Canadian retail listing uses the same English name for a different product whose ingredient list says 100% sunflower seeds. Neither page establishes a shared oil-removal specification. [S01–S02] | Keep unassigned. Do not create `ingredient-ref-sunflower-seed-flour` or an alias. |
| `sunflower flour` | The Ontario bakery uses this as shorthand for its source-specific sunflower-seed product. A French food-industry supplier uses the phrase for non-defatted material, sometimes with a carrier, and distinguishes several heat-treated versions. It is not a safe market-wide alias for one process. [S01, S03] | Keep unassigned and do not attach to sunflower seed, butter, oil, meal, or another flour reference. |
| `farine de graines de tournesol` | A discontinued Canadian marketplace listing uses this wording, but its seller is a third-party merchant and the listing warns that its content is not independently verified. This is weak evidence for a Québec display. [S06] | Keep inactive; do not use as an accepted display or alias. |
| `farine de tournesol, non déshuilée` | A 2004 Statistics Canada goods classification records a specifically non-defatted sunflower flour. It is historical trade nomenclature, not evidence that modern unqualified retail flour always has this process. [S07] | Keep source-specific; do not broaden to generic `farine de tournesol`. |
| `edible sunflower seed flour (solvent extracted)` | Bureau of Indian Standards has a product standard for solvent-extracted edible sunflower-seed flour, described as a low-fat product. This is a separate, clearly processed product class, not a synonym for seed milled without oil extraction. [S04] | Keep as a distinct, unassigned product scope. Do not alias it to an unqualified sunflower flour. |
| `sunflower seeds / graines de tournesol` | The active edible-seed identity already exists. OQLF supports `graine de tournesol` as the French seed term for hulled or unhulled achenes, not as a flour term. [S05] | Retain only on the existing seed reference. Do not treat grinding as an identity alias or form. |
| Sunflower-seed meal/cake for feed; sunflower oil; sunflower-seed butter | Oil, meal/cake, and spread have different processed-product scopes and uses. Keep them out of a flour identity and do not infer that a food-grade flour name can cover feed material. [S03–S05] | Separate products; no alias or substitution. |

The evidence supports sunflower seed as a flour ingredient, but it does not establish one source-neutral product behind bare `sunflower flour` or `sunflower seed flour`. It includes flour from milled hulled seeds, a retail product listed as 100% sunflower seed with no milling or oil-removal specification, non-defatted industrial flour with optional carrier, and a formal solvent-extracted low-fat product. A future identity must name its product scope and have a Québec-facing French name supported for that same scope.

## Live ownership and archive audit

The exact-key check covered the current active ingredient displays and aliases, attached form labels and match terms, legacy names and aliases, ledger record IDs, and recipe-linked ownership. The proposed working ID `ingredient-ref-sunflower-seed-flour` has no active reference, form, legacy candidate, or ledger record.

| Candidate phrase or owner | Active references and forms | Legacy candidate | Ledger ownership |
|---|---|---|---|
| `sunflower seed flour`, `sunflower flour`, `sunflowerseed flour`, `farine de graines de tournesol`, `farine de graine de tournesol`, `farine de tournesol`, and `farine de tournesol non déshuilée` | No exact display, alias, form label, or form match term. No sunflower-flour form exists. | No exact candidate or working ID. | No sunflower-flour record or candidate. |
| `sunflower seeds`; `graines de tournesol`; `graine de tournesol` | `ingredient-ref-sunflower-seeds`, category `NUT_SEED_AND_DRIED_FRUIT`; FR display `graines de tournesol`, EN display `sunflower seeds`, FR alias `graine de tournesol`. No forms are attached. | None. | `ingredient-ref-sunflower-seeds`, accepted WP03 identity record. It does not own a flour phrase. |
| `sunflower seed oil`; `sunflowerseed oil` | `ingredient-ref-sunflower-oil`, category `FAT_AND_OIL`; these are its EN aliases. | None. | `ingredient-ref-sunflower-oil`; no flour phrases are assigned to it. |
| `sunflower seed butter`; `beurre de graines de tournesol` | `ingredient-ref-sunflower-seed-butter`, category `FAT_AND_OIL`; these are its EN/FR displays. | None. | `ingredient-ref-sunflower-seed-butter`; no flour phrases are assigned to it. |

Related archives were checked to preserve scope. `wp03-sunflower-seed-kernel-boundary-review-20261010.md` covers the edible achene and explicitly leaves flour/meal for a separate review. WP06 egusi evidence discusses sunflower seeds as a soup ingredient, not a sunflower-flour identity. The sesame-flour proposal does not cover sunflower. No prior WP02 sunflower-flour hold or accepted identity was located.

## Actual picker behavior

The current picker builds its search index from each reference's English/French displays and aliases, plus any attached form names and match terms. [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes lowercase text with NFKD, folds accents, punctuation, and spaces, prefers complete word-phrase matches, then falls back to substring matching.

The following results were computed against the current references and forms using that search behavior:

| Query | Current picker results |
|---|---|
| `sunflower seed flour` | No result. |
| `sunflower flour` | No result. |
| `farine de graines de tournesol` | No result. |
| `farine de tournesol` | No result. |
| `sunflower seeds` | `ingredient-ref-sunflower-seeds` — `sunflower seeds / graines de tournesol`. |
| `sunflower seed` | `ingredient-ref-sunflower-oil` and `ingredient-ref-sunflower-seed-butter`; both match the complete phrase inside their names/aliases. The plural seed display does not match singular `seed` as an exact word phrase. |
| `graines de tournesol` | `ingredient-ref-sunflower-seed-butter` and `ingredient-ref-sunflower-seeds`; the phrase appears in both French displays. |
| `graine de tournesol` | `ingredient-ref-sunflower-seeds` through its singular French alias. |

Because the picker prefers whole phrases, a future flour name would be a distinct result for the exact flour query; it would not be found in the current index. The common seed and processed-product queries already expose their current scope, so do not put flour wording on one of those rows to make it searchable.

## Full bundled recipe demand

Every path listed by `manifest.v1.json` was parsed, along with every `ingredients[]` row and the complete serialized recipe content: **114 recipe files and 1,123 ingredient rows; no missing files**. The scan found **zero** exact flour-phrase matches, sunflower/tournesol mentions, flour-ID links, or candidate recipe rows. The current bundle therefore gives no reason to create a recipe link, line substitution, form, or product-specific measure.

## Québec and Canadian naming evidence

- The Ontario bakery's current product page titles its product `Sunflower Seed Flour` and says it mills hulled sunflower seeds. It provides Canadian retail English wording and a local product scope, but no French label, oil-removal declaration, or full formula. [S01]
- Naturitas Canada's listing also uses `sunflower seed flour`, states that the ingredient is 100% sunflower seeds, and describes the seeds as ground into flour. It lists Austria/Hungary as origin and provides no oil-removal or flour-process specification. Its Canadian availability does not make it a Canadian-made product. [S02]
- OQLF's preferred French seed term is `graine de tournesol`; the entry explains that food-industry usage covers hulled and unhulled achenes. It does not define `farine de graines de tournesol` or any sunflower flour. [S05]
- The old Statistics Canada goods classification has the narrower French category `farine de tournesol, non déshuilée`. The current 2025 Canadian tariff table instead uses a broad oilseed-flour class. Neither establishes a current common Québec consumer display for unqualified sunflower-seed flour. [S07–S08]
- The Walmart Canada French marketplace page uses `Farine de Graines de Tournesol`, but it marks the product discontinued and identifies Wholesale2go as a third-party seller. Treat this as a phrase observation only, not a terminology or process standard. [S06]

For this hold, the exact source-attested English names are `sunflower seed flour`, `sunflower flour`, and the solvent-extracted standard name. The source-attested French phrases are `graine de tournesol` for seed and the discontinued marketplace's `farine de graines de tournesol`. None qualifies as a supported bilingual catalog pair for a shared flour identity. Keep `farine de tournesol, non déshuilée` tied to the historical source and do not use literal translations such as `farine de graines de tournesol déshuilées` as active aliases without a Québec product or terminology source.

## Measurements, forms, and substitutions

- Marci's Bakery sells a 454 g package; Naturitas Canada lists a 250 g package and a nutrient table per 100 g. These are package and nutrition data, not household volume measures. No reviewed source supports a generic cup, tablespoon, density, unit mapping, yield, or conversion. [S01–S02]
- The Naturitas product is described as 100% sunflower seeds, but its listed composition and the page's lack of a stated oil-removal process do not establish a general flour density or equivalence. Do not infer a measure from sunflower seeds, oil, meal, or another flour.
- Marci's Bakery advises replacing a quarter cup of usual flour with its sunflower product in baking and separately suggests using the product in pesto or vegan-parmesan preparations in place of pine nuts or ground cashews. These are manufacturer suggestions for that product and named uses; they do not establish a generally valid one-to-one flour substitution, a replacement for all flour in a recipe, or equivalence to defatted sunflower flour. No reviewed controlled recipe study validates a generic rule. [S01]
- The BIS solvent-extracted product and the industrial non-defatted product are not interchangeable on the evidence reviewed. Do not transfer one product's percentage, particle size, serving, or suggested substitution to another product scope. [S03–S04]
- No generic measurement or substitution research is complete for a future source-neutral candidate. If one is later recorded in the shared ledger, retain `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched` until those separate reviews are completed.

## Pre-integration snapshot

Snapshot read **2026-10-12 19:21 UTC**. Hashes fingerprint the exact working-tree bytes inspected in this shared worktree; concurrent changes may already be present. The recipe-corpus fingerprint is SHA-256 over each manifest-ordered relative path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte.

| Canonical surface | Count or scope | SHA-256 / fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,274 references | `7dd8e817ac83fb11b5ee486007178f90e966e062cd890944dfa1a430a103b726` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `research-ledger.v1.json` | 1,582 records; 8 unit conversions | `bf2cba1f35c4d6281475358bb9623f42a2570be0991cc14fc6bc274aa566da14` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `IngredientSearch.kt` | Actual picker matching and normalization | `ca41ac04d18fc354c46c9a67798209255e8bc40cb70ca0ee7350a4121ea6b50e` |
| `BundledIngredientCatalog.kt` | Generated bundled ingredient-search catalog | `51494e0aaed4b5546a2cb93ada4d559903807453e9640adf608374867be2318c` |

## Possible integration delta

**Recommended delta: zero.** Keep active references, aliases, forms, density, unit mappings, recipes, yields, conversions, and substitutions unchanged. Do not create an active row or ledger candidate from this proposal alone. Keep WP02 Section B open.

Reopen only when an in-scope food product can be described by a stable process boundary and a current Québec/Canadian French product name is supported for that same boundary. Treat milled hulled-seed flour without stated oil removal, non-defatted flour, and solvent-extracted flour as separate evidence scopes unless a standard demonstrates equivalence. A future accepted row must use only the exact bilingual names and aliases verified for its selected scope; it must not add generic measurement, conversion, yield, recipe, or substitution behavior from the present sources.

## Source register

All sources were accessed on **2026-10-12**. IDs are local to this proposal and are not research-ledger entries.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-SUNFLOWER-FLOUR-GAP-20261012-S01** | Marci's Bakery, [Ingredient, Flour: Sunflower Seed Flour (454g)](https://marcisbakery.com/products/sunflower-seed-flour). Current Hamilton, Ontario pickup listing, Canadian-dollar price, product title, description of milling hulled sunflower seeds, and product-specific baking/pesto/parmesan suggestions. | One bakery product page; it does not declare a general oil-removal process, bilingual label, tested conversion, or recipe-wide substitution ratio. |
| **WP02-SUNFLOWER-FLOUR-GAP-20261012-S02** | Naturitas Canada, [Sunflower seed flour, Salud Viva, 250 g](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/flours/sunflower-seed-flour-250-g-salud-viva). Exact English product name, 100% sunflower-seed ingredient declaration, ground-seed description, country of origin, and nutrition data per 100 g. | Canadian retailer, not Canadian manufacture. The page cautions that product information can change; its ingredient wording does not explain the milling or oil-removal process. |
| **WP02-SUNFLOWER-FLOUR-GAP-20261012-S03** | Flanquart, [Sunflower seed flour](https://www.flanquart.fr/en/range/flour-range/sunflower-seed-flour/). Current French food-industry supplier describes its flour as non-defatted, sometimes combined with a carrier to absorb lipids, and offered in natural, decontaminated, toasted, and caramelised versions. | Manufacturer-specific industrial products, not Canadian retail or Québec French terminology. Its process distinctions should not be transferred to every product with a similar name. |
| **WP02-SUNFLOWER-FLOUR-GAP-20261012-S04** | Bureau of Indian Standards, [IS 8677:1977 preview — edible sunflower seed flour (solvent extracted)](https://www.services.bis.gov.in/tmp/SR8677.pdf). The official standard is explicitly for solvent-extracted flour; its preview describes a low-fat product scope. | Indian standard, originally 1977 and reaffirmed in 2023; not a Canadian retail label. It establishes a distinct processed flour class, not the name or market scope for Canadian unqualified flour. |
| **WP02-SUNFLOWER-FLOUR-GAP-20261012-S05** | Office québécois de la langue française, [GDT: graine de tournesol](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015064/graine-de-tournesol). Preferred French seed term, definition, and note on hulled/unhulled food-industry usage. | Supports the seed term only; it does not establish a French flour display. |
| **WP02-SUNFLOWER-FLOUR-GAP-20261012-S06** | Walmart Canada, [Farine de Graines de Tournesol (Discontinuée)](https://www.walmart.ca/fr/ip/Farine-de-Graines-de-Tournesol-Discontinu-e/4TFXFSCT180P). Third-party French marketplace listing with the phrase `farine de graines de tournesol`. | Marked discontinued; seller is Wholesale2go and the marketplace disclaims independent verification of seller-supplied details. Phrase evidence only. |
| **WP02-SUNFLOWER-FLOUR-GAP-20261012-S07** | Statistics Canada, [EAM 2004, goods list 311 — aliments](https://www23.statcan.gc.ca/imdb/p3VD_f.pl?CLV=1&CPV=311&CST=01012004&CVD=139831&D=1&Function=getVD&MLV=2&TVD=139830). Search-indexed official French category `farine de tournesol, non déshuilée`. | Historical 2004 goods classification, not a current consumer label or evidence for unqualified flour. The page timed out during direct open; the phrase was confirmed in Statistics Canada's indexed result. |
| **WP02-SUNFLOWER-FLOUR-GAP-20261012-S08** | Statistics Canada, [Customs Tariff 2025, Chapter 12: Oilseeds and oleaginous fruits](https://www150.statcan.gc.ca/n1/pub/65-209-x/2025001/t/tbl_12-fra.htm). Current French chapter lists sunflower seeds and a broad oilseed-flour class. | Customs nomenclature, not ingredient-picking terminology; it does not decide a retail flour display. |

