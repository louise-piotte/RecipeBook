# WP02 next open flour and starch gap: sesame flour

- **Review date:** 2026-10-12
- **Disposition:** Hold a broad sesame-flour identity pending a product-scope decision. This disposition is recorded beneath WP02 Section B in the live plan and roadmap; no catalog addition was made.
- **Checklist context:** New, unlisted seed-flour candidate within the still-open WP02 Section B item, “Alternative flours starches and regional starch products.” The checklist names several nut and pulse flours but does not name sesame flour. [Open WP02 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt)
- **Scope:** Human-food products sold as sesame flour, current Canadian/Québec English and French product wording, active ownership, picker behavior, bundled recipe demand, and support for measures or substitutions.
- **Proposal-local source IDs:** `WP02-B2-SESAME-FLOUR-20261012-S01` through `WP02-B2-SESAME-FLOUR-20261012-S07`. This prefix was absent from the ledger and proposal/batch archives at review time.

## Recommendation

Treat sesame flour as a genuine discovery gap, but **hold an active identity** until the catalog can name a stable product scope. Canadian listings use both `sesame flour` and `sesame seed flour`; a Walmart Canada French listing calls one item `Farine de Sésame Bio`. Those labels establish current market wording. They do not establish that all such products share one seed preparation or oil-removal process. [S02–S05]

The USDA Standard Reference food records distinguish `sesame flour, high-fat`, `sesame flour, low-fat`, `sesame flour, partially defatted`, and `sesame meal, partially defatted`. This supports materially different oil-extraction/grade descriptions under closely related names. Kevala describes its flour as ground from raw unhulled sesame seeds but does not say whether oil was removed. Its Canadian listing supplies a product-specific serving weight, not a process specification. [S01–S03]

Do not create the working ID `ingredient-ref-sesame-flour`, add a flour alias to a seed or paste reference, or reserve a new row. Revisit when a current Canadian food product source establishes whether the intended identity is milled seed, oil-extraction meal/cake, or a narrower grade, and the Québec display is tied to that same scope. The French phrase `farine de sésame` is supported as a Canadian marketplace label, not as an OQLF-defined flour term. [S03, S06–S07]

## Candidate wording and boundaries

| Wording | Evidence and decision |
| --- | --- |
| English `sesame flour` | Used by Kevala, Walmart Canada, and Naturitas Canada for retail products. Keep as a candidate phrase only until the underlying product scope is clear. [S02–S03, S05] |
| French `farine de sésame` | Appears in Walmart Canada’s French listing for the Kevala product. It is direct Canadian product-label wording; no OQLF flour definition was located in this review. Do not treat `beurre de sésame` as a flour alias: OQLF assigns that term to tahini. [S03, S06] |
| English `sesame seed flour` | Africanada Foods, a Canadian seller, uses this exact listing title. The page gives package information but no seed or extraction process. Do not add it as a global alias while its equivalence remains unverified. [S04] |
| `raw sesame flour`, `whole-seed sesame flour`, `full-fat sesame flour`, `low-fat sesame flour`, `defatted sesame flour` | Do not add as aliases. `Raw` and `unhulled` in the Kevala description qualify its source wording but do not say whether oil was removed; the USDA records treat oil-content/defatting labels as separate descriptions. [S01–S02] |
| Sesame meal or oil cake | Keep distinct from an unqualified flour candidate. The FAO-hosted Feedipedia entry describes sesame oil meal/cake as a by-product of oil extraction and notes both food-grade and feed uses; it does not establish a Québec consumer name for a flour. [S07] |
| Sesame seeds, tahini, sesame pastes, and sesame oil | Keep their existing identities and boundaries. Ground sesame paste is not a synonym for flour, and seed/oil lines in recipes are not flour demand. [S06; existing WP03 sesame reviews below] |

The earlier [WP03 sesame seed and tahini boundary review](wp03-sesame-tahini-boundary-review-20261009.md) covers seed colour, toast/hull wording, tahini, and sesame pastes; it does not decide sesame flour. The [black sesame paste review](wp03-section-i-black-sesame-paste-boundary-review-20261012.md) is also about paste, not flour. Neither review supplies a flour alias or active owner.

## Ownership and actual picker audit

The active reference file has **1,272** rows; the forms file has **94** rows. No active reference name, alias, or form label/match term owns `sesame flour`, `sesame seed flour`, `raw sesame flour`, `defatted sesame flour`, or `farine de sésame`. No legacy-import candidate owns those phrases or the working ID. The ledger has a separate unresolved `candidate-generic-sesame-paste`; it is not a flour candidate and remains outside this review.

The adjacent active sesame identities include:

- `ingredient-ref-sesame-seeds` — `sesame seeds / graines de sésame`
- `ingredient-ref-white-sesame-seeds` — `white sesame seeds / graines de sésame blanc`
- `ingredient-ref-black-sesame-seeds` — `black sesame seeds / graines de sésame noires`
- `ingredient-ref-tahini` — `tahini / beurre de sésame`
- `ingredient-ref-chinese-sesame-paste` — `Chinese sesame paste / pâte de sésame à la chinoise`
- `ingredient-ref-black-sesame-paste` — `black sesame paste / pâte de sésame noir`
- `ingredient-ref-sesame-oil` and `ingredient-ref-toasted-sesame-oil`

The two attached seed forms are toasted sesame seeds and toasted white sesame seeds. Neither is a flour form. The existing ledger entries describe seed, oil, paste, and sesame-related recipe evidence, but there is no `ingredient-ref-sesame-flour` record.

The actual recipe picker is `IngredientPickerDialog` in `RecipeEditorScreen.kt`, backed by `IngredientReferenceSearchIndex` in `IngredientSearch.kt`. It normalizes case, accents, punctuation, and spacing; it prefers complete normalized word-phrase matches and falls back to partial matching only when no complete phrase matches. Results below were computed from the current live references and forms using that implementation’s term set and ordering:

| Picker query | Results |
| --- | --- |
| `sesame flour` | None |
| `sesame seed flour` | None |
| `farine de sésame` | None |
| `raw sesame flour` | None |
| `defatted sesame flour` | None |
| `sesame` | Eight rows: black sesame paste, black sesame seeds, Chinese sesame paste, sesame oil, sesame seeds, tahini, toasted sesame oil, and white sesame seeds. |

Thus an unqualified search for `sesame` currently presents multiple seed, paste, and oil results, while the flour candidate has no result. No existing owner should receive flour terms as a workaround.

## Bundled recipe demand

The manifest lists **114 recipes** with **1,123 ingredient rows**. A scan of the complete manifest-listed recipe JSON files and their ingredient rows found zero occurrences of the candidate flour phrases, zero direct references to a sesame-flour ID, and zero candidate recipe links.

Five adjacent sesame ingredient lines occur in four recipes:

| Recipe and line | Current text and owner | Flour implication |
| --- | --- | --- |
| Korean Soy-Marinated Jammy Eggs, ingredient 10 | `1 tbsp toasted sesame oil` → `ingredient-ref-toasted-sesame-oil` | Oil only. |
| Korean Soy-Marinated Jammy Eggs, ingredient 11 | `1 tbsp toasted white sesame seeds` → `ingredient-ref-white-sesame-seeds`, toasted form | Whole seeds only. |
| Hamburger Buns, ingredient 14 | `Sesame seeds, toasted` → `ingredient-ref-sesame-seeds`, toasted form | Whole seeds only. |
| Habitant Pea Soup, ingredient 11 | `1 tbsp sesame oil` → `ingredient-ref-sesame-oil` | Oil only. |
| Sous Vide Tuna, ingredient 6 | `Sesame seeds` → `ingredient-ref-sesame-seeds` | Whole seeds only. |

These lines provide no flour demand, preparation relink, or recipe-line substitution evidence.

## Measurement and substitution limits

- Walmart Canada’s Kevala listing gives **2 tablespoons (30 g)** for its 16 oz product. This is one product-label observation. It does not specify a general packing method or establish a conversion for other sesame flours. The manufacturer listing is currently marked out of stock, and neither page defines its oil-removal process. Keep the value out of `defaultDensity`, form density, and generic `unitMappings`. [S02–S03]
- Africanada lists individual 454 g packages in a six-unit case. Package size is not a household-volume measure. [S04]
- USDA SR28 reports a 1 oz (28.35 g) mass measure for its flour records. That mass portion supplies no tablespoon/cup conversion. Its separate flour descriptions reinforce the need to keep any eventual measurement attached to a precise product grade. [S01]
- No supported generic mass-volume conversion, density, yield, or state conversion was found. Do not infer one from sesame seed, tahini, or sesame oil data.
- No candidate-specific substitution ratio or recipe-line link is supported. Do not substitute seed, tahini, another nut/seed flour, or a pulse flour by equal measure based only on family resemblance. The review did not complete a broad substitution search; a future ledger entry should retain `not_yet_researched` until that work is done.

## Exact pre-integration snapshot

Snapshot date: **2026-10-12**. Hashes fingerprint the exact working-tree bytes inspected, including concurrent edits already present in this shared worktree; they are not a clean-branch baseline. The recipe-corpus fingerprint is SHA-256 over each manifest-ordered relative recipe path, a NUL byte, that file’s exact bytes, and a NUL byte.

| Surface | Count or scope | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,272 references | `2b94176589510c344eedf318a03659005a7ab8883e755f79c6fb2b933bfc0e56` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `research-ledger.v1.json` | 1,580 records | `0ce7c077364b57ac61626932bc40c766c29f829d07a284a9dbd3c93be797a7e3` |
| `legacy-import-identities.v1.json` | 65 candidates | `7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7` |
| `IngredientSearch.kt` | Picker normalization and matching | `ca41ac04d18fc354c46c9a67798209255e8bc40cb70ca0ee7350a4121ea6b50e` |
| `BundledIngredientCatalog.kt` | Generated catalog search source | `aeabed47aa25137f2fe88587b857028576be7f62b61c33efe16f0df4b6348487` |

The working ID, exact candidate phrase family, and source-ID prefix were checked against active references/forms, legacy candidates, the research ledger, and proposal/batch archives. No exact candidate owner or source-ID collision was found. The archive scan found no earlier WP02 flour/starch decision for sesame flour.

## Source register

All pages were accessed on **2026-10-12**. Source IDs are proposal-local and have not been added to the research ledger.

| ID | Direct source | Evidence and limits |
| --- | --- | --- |
| **S01** | USDA Agricultural Research Service, [National Nutrient Database for Standard Reference, Release 28, Nut and Seed Products](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg12.pdf), pp. 341–349; records 12170, 12033, 12032, and 12034. | Official US composition reference lists high-fat, low-fat, and partially defatted sesame flour, plus partially defatted sesame meal. It supports distinct recorded product descriptions and mass-only ounce measures; it is not a Canadian retail standard or a universal ingredient naming rule. |
| **S02** | Kevala, [Organic Sesame Flour 1 lb](https://kevala.net/products/kevala-organic-sesame-flour-1-lbs). | Manufacturer says its product is made from certified organic unhulled sesame seeds and describes raw unhulled seeds ground into fine flour. Its serving label states 2 tbsp (30 g). The page does not state whether oil was removed; stock status may change. |
| **S03** | Walmart Canada, [Kevala Organic Sesame Flour, English listing](https://www.walmart.ca/en/ip/Kevala-Organic-Sesame-Flour-16-oz/5TUR78Y2WB6V) and [French listing](https://www.walmart.ca/fr/ip/Kevala-Farine-de-s-same-biologique-16-oz/5TUR78Y2WB6V). | Canadian English/French product pages for the 16 oz item use `Sesame Flour` and `Farine de Sésame Bio`; the label gives 2 tbsp / 2 c. à soupe as 30 g. The listing was marked out of stock at access. Retail wording and one package label only; it does not settle process or broad equivalence. |
| **S04** | Africanada Foods, [Sesame Seed Flour](https://www.africanadafoods.com/products/sesame-seed-flour). | Canadian seller’s exact `Sesame Seed Flour` title and 454 g units in a six-unit case. The page does not identify seed treatment, oil removal, or food-grade flour process. |
| **S05** | Naturitas Canada, [Salud Viva Sesame Flour, 250 g](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/flours/sesame-flour-250-g-salud-viva). | Canadian retailer describes flour made from raw sesame seeds and reports product-level protein and fibre values; it identifies Austria as country of origin. The listing does not disclose an oil-extraction step or a general measure. At access it showed stock but no confirmed delivery date. |
| **S06** | Office québécois de la langue française, [GDT: beurre de sésame](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360025/beurre-de-sesame). | Defines `beurre de sésame` as a paste made from ground sesame seeds and lists tahini/tahin/tahina as terms. This supports the existing tahini boundary; it does not define sesame flour. |
| **S07** | FAO-hosted Feedipedia, [Sesame (*Sesamum indicum*) seeds and oil meal](https://feedipedia.review.fao.org/node/26). | Describes sesame oil meal/cake as the protein-rich by-product after oil extraction and notes food-grade and feed uses by source material. It helps distinguish oilcake from seed and paste products; the page is an animal-feed reference, not Québec human-food terminology. |

## Integration delta

**Immediate delta: zero.** Keep active reference, alias, form, density, unit-mapping, recipe, yield, conversion, and substitution data unchanged. Do not create an active ID or ledger candidate from this proposal alone. Keep WP02 Section B open. If a coordinator later accepts a scoped candidate, the minimum reviewable change is one `FLOUR_AND_STARCH` identity with a process-aligned FR/EN name pair and only source-attested aliases; any product-specific 2 tbsp / 30 g observation belongs in source-qualified research evidence, not a generic mapping. No recipe link or substitution is justified by the present corpus or sources.

**Verification:** The research proposal itself adds no active catalog or ledger candidate. Its hold is recorded in the live plan and roadmap. No app or database tests were run because no JSON data changed.
