# WP03 Section F — black fonio `iburu` alias review (2026-10-13, round 13)

## Review record

- **Status:** Integrated: one English alias on the existing black-fonio grain row.
- **Scope:** One regional English name for the existing black-fonio grain identity, `ingredient-ref-black-fonio`.
- **Active plan:** Section F still calls for species-level millet, sorghum, fonio, quinoa, and amaranth review ([plan, line 2140](../../RecipeBook-global-ingredient-catalog-plan.txt#L2233)); regional cereal mixes and preprocessed grains also remain open (line 2266). This is a name review for the already integrated *Digitaria iburua* grain, not a new grain or flour identity.
- **Recommendation:** Add the single English alias **`iburu`** to `ingredient-ref-black-fonio`. Keep the existing English and French displays, French aliases, flour rows, forms, measurements, recipes, and substitution data unchanged.

## Evidence and identity boundary

The Government of Canada's TERMIUM Plus entry for *Digitaria iburua* records `iburu` and `black fonio` as standardized English designations. A 2026 field study reports that farmers distinguish *D. iburua*, locally named **Iburu**, from *D. exilis*, locally named **Acha**. Together they support `iburu` as a name for the black-fonio cereal, not for white fonio [S01; reused WP02-A6-BLACK-FONIO-FLOUR-20261011-S03]. Health Canada's French crop-group list separately pairs `fonio noir` with *D. iburua* and `fonio blanc` with *D. exilis* [reused WP03-S36].

This evidence does not establish a Québec retail label using `iburu`. Mako Foods Exotik's current Longueuil-market listings use French `fonio`, including `fonio précuit` and `fonio torréfié`, without identifying the species. MyChopChop's current Ontario listing similarly calls its product `Fonio Grain`, lists `100% Fonio Grains`, and gives Nigeria as origin without identifying *D. iburua* or *D. exilis* [S02–S03]. These pages document current Canadian market context, not the species of their products.

The indexed MyChopChop copy retrieved during search included a conflicting sentence that associated `iburu` with *D. exilis*. That sentence is absent from the currently accessible product page, which now gives no species or alternate-name list. Treat the cached wording as stale and unverified; do not use it to change either active species assignment. The primary field study and TERMIUM entry are the sources for the alias decision [S01; reused WP02-A6-BLACK-FONIO-FLOUR-20261011-S03; S03].

## Exact proposed fields

| Field | Current value | Proposed value |
|---|---|---|
| ID | `ingredient-ref-black-fonio` | unchanged |
| English display | `black fonio` | unchanged |
| French display | `fonio noir` | unchanged |
| English aliases | `[]` | `["iburu"]` |
| French aliases | `[]` | unchanged |
| Category | `GRAIN_AND_CEREAL` | unchanged |
| Default density | `null` | unchanged |
| Unit mappings | `[]` | unchanged |

The alias belongs on the edible *D. iburua* grain row. Do not add it to white fonio or either flour row. `iburu flour` and `farine d'iburu` are not proposed: the reviewed studies establish that flour can be made from *D. iburua*, but do not establish either phrase as a Canadian or Québec product name. Do not add `black acha`, `iburu grain`, or other inferred variants in this pass.

## Picker ownership and projected results

Projection follows `IngredientSearch.kt`: the picker searches canonical names, aliases, and attached form terms; it prefers complete normalized word phrases across all results before substring fallback. The live references and forms were evaluated with that behavior.

| Query | Current result(s) | After adding only `iburu` to `ingredient-ref-black-fonio` |
|---|---|---|
| `iburu` | No result | `ingredient-ref-black-fonio` — black fonio / fonio noir |
| `iburu flour` | No result | No result; the grain alias does not match a flour-qualified query |
| `black fonio` | `ingredient-ref-black-fonio`; `ingredient-ref-black-fonio-flour` | Same two results |
| `fonio noir` | `ingredient-ref-black-fonio`; `ingredient-ref-black-fonio-flour` | Same two results |
| `fonio` | `ingredient-ref-black-fonio`; `ingredient-ref-black-fonio-flour`; `ingredient-ref-fonio-flour`; `ingredient-ref-white-fonio` | Same four results |
| `fonio blanc` | `ingredient-ref-white-fonio` | Same result |
| `ibourou` / `manne noire` | No result | No result; no French alias is proposed |

The black-fonio flour row remains a separate picker choice for the qualified `black fonio` / `fonio noir` terms. The bare regional grain name resolves only to the grain identity; it does not create a grain-to-flour conversion or identify flour as the requested ingredient.

## Québec French and product scope

Keep `fonio noir` as the French display and leave `aliasesFr` empty. Health Canada and TERMIUM support that French name for *D. iburua*. OQLF's reviewed `fonio blanc` entry covers *D. exilis* and does not establish a Québec-preferred black-fonio term. TERMIUM also records `ibourou` and `manne noire` in French, but the current Québec seller reviewed here uses `fonio` product wording and does not use either synonym. Do not promote those botanical/terminology synonyms to Québec picker aliases without food-product usage evidence [WP03-S36; reused WP02-A6-BLACK-FONIO-FLOUR-20261011-S03; WP03-S34; S02].

Keep these active identities distinct:

- `ingredient-ref-black-fonio` — whole edible grain, *D. iburua*; proposed English alias `iburu`.
- `ingredient-ref-white-fonio` — white fonio, *D. exilis*; existing aliases remain unchanged.
- `ingredient-ref-black-fonio-flour` — flour from *D. iburua*; no `iburu` alias or form is proposed.
- `ingredient-ref-fonio-flour` — existing fonio flour identity; no alias or species scope changes.
- Mako's toasted and precooked fonio products — source-specific processed products whose listings do not identify the species; neither is reclassified here.

## Forms, measurements, and substitution limits

- **Forms:** Add no `IngredientForm`. The alias changes retrieval of the existing grain identity only. No dry/cooked, toasted, precooked, or milled form is implied.
- **Measurement:** Keep `measurementState: not_yet_researched`, `defaultDensity: null`, and `unitMappings: []`. Mako's 400 g and 250 g package quantities apply to its precooked and toasted products, not to a general black-fonio measure. MyChopChop's current 2 lb package is unqualified fonio and supplies no volume-to-mass relationship. The field study's seed dimensions and agricultural findings are not kitchen measures; no numeric value is imported [S01–S03].
- **Cooking yield:** Add no yield or conversion. A product-specific water instruction for unqualified fonio does not establish a black-fonio grain yield or unit conversion [S03].
- **Substitutions:** Keep `substitutionResearchState: not_yet_researched`; add no global or contextual rule. Mako describes its unspecified fonio products as alternatives to couscous, quinoa, or rice, but provides no general mass/volume basis or black-species test. That wording is not transferred to this grain row [S02].
- **Recipe links:** Add none; the corpus contains no matching phrase or link.

## Live ownership, source-ID, and baseline audit

Read-only snapshot for this proposal:

| Artifact | Current snapshot |
|---|---|
| Ingredient references | 1,343; SHA-256 `43c02ea1acdf0ff3cc2e47a6ac28a634f7fd08488e5a40b52b063d4663ff9a05` |
| Ingredient forms | 98; SHA-256 `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64; SHA-256 `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,655 records; 6,385 source entries; 5,353 distinct source IDs; SHA-256 `2f10900fc04496a287904033694094a2fc4a058c5711a64b567953fb6dbcd77d` |
| Manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 file bytes; fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Exact normalized-name checks covered all active reference names and aliases, all form labels and match terms, all 64 legacy candidates, and ledger record IDs/decisions. `iburu`, `iburu grain`, `iburu flour`, `ibourou`, and `manne noire` have no exact active reference, form, or legacy owner. `black fonio` and `fonio noir` belong to `ingredient-ref-black-fonio`; `black fonio flour` and `farine de fonio noir` belong to `ingredient-ref-black-fonio-flour`. The ledger already contains the verified black-fonio and black-fonio-flour identities, but no accepted `iburu` alias decision. The same word appears in the black-fonio flour sources; that mention is evidence text, not an alias owner.

New proposal-local source IDs `WP03-BF-IBURU-20261013-S01` through `S03` were absent from the live ledger and searched proposal/batch archive. Their exact URLs were also absent from the ledger and archive. Existing TERMIUM, Health Canada, and OQLF records are referenced by their existing IDs below and are not reallocated.

## Full recipe-corpus demand scan

All 114 paths in the active package manifest were opened and parsed. The scan checked every ingredient row, every serialized recipe file, and reference-ID fields for `ingredient-ref-black-fonio`. It found **zero matching recipe files, zero matching ingredient rows, and zero links to the black-fonio grain ID** for `iburu`, `iburu grain`, `iburu flour`, `black fonio`, `fonio noir`, `black acha`, `ibourou`, `manne noire`, `white fonio`, `fonio blanc`, `fonio`, *D. iburua*, and *D. exilis*.

This alias is source-driven catalog coverage, not a recipe-demand correction. No recipe text or ingredient link is proposed.

## Source register

| ID | Source and locator | Supports / does not support |
|---|---|---|
| `WP03-BF-IBURU-20261013-S01` | Ishaq Muawiyya et al., [“Fonio (*Digitaria exilis* and *Digitaria iburua*) in Nigeria: Regional cultivation patterns, landrace diversity, and farmer knowledge for conserving a climate-resilient indigenous cereal”](https://nph.onlinelibrary.wiley.com/doi/full/10.1002/ppp3.70256), *Plants, People, Planet*, first published 2026-08-13; Section 3.3 and vernacular-name table. | Reports farmers distinguishing *D. exilis* as Acha from *D. iburua* as Iburu. Primary regional evidence for the name and species boundary; not a Canadian package, Québec term, household measure, or substitution source. |
| `WP03-BF-IBURU-20261013-S02` | Mako Foods Exotik, Longueuil, [Céréales](https://www.makofoods.ca/collections/cereales), current French cereal collection; entries `Fonio précuit` and `Fonio torréfié`, accessed 2026-10-13. | Current Québec-market source uses `fonio` plus process qualifiers and lists 400 g / 250 g packages. It does not identify *D. iburua*, use `iburu`, or provide a reusable grain measure. |
| `WP03-BF-IBURU-20261013-S03` | MyChopChop, Cambridge, Ontario, [Fonio Grain - 2 Lbs](https://www.mychopchop.ca/products/copy-of-fonio-flour-2-lbs), current product title, ingredient and origin fields, accessed 2026-10-13. | Current live page lists 100% fonio grains and Nigeria origin but does not identify species or use `iburu` in the accessible page. A separately retrieved search-index snapshot contained conflicting older copy; it is treated as stale and is not used to classify this product. No package weight or cooking instruction is generalized. |
| Reused `WP02-A6-BLACK-FONIO-FLOUR-20261011-S03` | Government of Canada Translation Bureau, [TERMIUM Plus: *Digitaria iburua*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=esr&lang=fra&srchtxt=NIGERIANA), entry dated 2023-11-29; English and French universal entries. | Standardizes English `iburu` and `black fonio` and French `fonio noir`, `manne noire`, and `ibourou` for *D. iburua*. Supports the proposed English alias and retained French display; it is not a Québec product-label attestation. This source is already on the black-fonio-flour ledger row and is reused, not duplicated. |
| Reused `WP03-S36` | Health Canada, [Groupes de cultures présentant des propriétés chimiques ou des résidus similaires](https://www.canada.ca/fr/sante-canada/services/securite-produits-consommation/pesticides-lutte-antiparasitaire/public/proteger-votre-sante-environnement/pesticides-aliments/groupes-cultures-proprietes-chimiques-residus.html), French grain-crop table. | Separates `fonio blanc` (*D. exilis*) and `fonio noir` (*D. iburua*). Federal French crop terminology; not a retail package or measure. Already on the black-fonio grain ledger row. |
| Reused `WP03-S34` | OQLF, [fonio blanc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529747/fonio-blanc), entry for *D. exilis*. | Québec term for white fonio and its related names. It does not define `iburu`, *D. iburua*, or a French black-fonio alias. Already on the white-fonio ledger row. |

## Disposition

**Recommend integrating only `iburu` as an English alias on `ingredient-ref-black-fonio`.** Preserve `fonio noir`, all French aliases, the black/white species boundary, separate flour references, null density, empty unit mappings, measurement and substitution research states, and all recipes. Add no forms, source-specific measures, conversions, yields, recipe links, or substitutions. Root integrated the alias in the active reference JSON and research ledger on 2026-10-13; the plan, roadmap, and batch README record the disposition.

Static review only: live ownership and picker projections were reproduced from the search implementation, the source/ID collisions were checked, and the complete 114-file / 1,123-row corpus was scanned. No app, unit, instrumentation, emulator, or application tests were run.

## Root integration result

Root added `iburu` to the English aliases on `ingredient-ref-black-fonio`, registered the three new source records and the reused TERMIUM source on the existing grain ledger record, and added an accepted decision. The TERMIUM ledger wording now records `iburu` alongside the existing species terms. No French alias, flour alias, form, recipe link, measurement, density, conversion, yield, or substitution changed. No Android tests or emulator checks were run because this integration only adds database JSON data and documentation under the updated workspace rule.
