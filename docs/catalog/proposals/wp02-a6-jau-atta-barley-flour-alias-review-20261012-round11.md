# WP02 A6 regional grain-flour follow-up: Jau Atta naming review

## Review record

- **Reviewed and sources accessed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12. The accepted changes and post-integration validation are recorded in the [integration README](../batches/wp02-a6-jau-atta-alias-integration-20261012/README.md). This proposal update records that outcome and replaces the pre-integration catalog snapshot with the live snapshot from the README.
- **Scope:** Review the South Asian flour name `jau atta` against the existing barley-flour identity, and check the related grain-level term `jau` so the shorter picker query retains its grain meaning.
- **A6 context:** The plan keeps WP02 A6 open for other regional grain flours after its listed millet, quinoa, amaranth, fonio, and related subitems. The current roadmap also says A6 remains open. This packet adds one previously unreviewed regional name boundary; it does not reopen the completed regional-flour decisions.
- **Source IDs:** `WP02-A6-JAU-ATTA-BARLEY-20261012-S01` through `S04` and `S06` through `S09` were unique against the live ledger and prior proposal archive during the pre-integration review; integration added them to the existing barley-flour and pearl-barley ledger records. Existing OQLF source `WP02A4-BF-S01` was reused for the Québec French display and not duplicated.
- **Proposal path:** This file name was unused before drafting.

## Integrated recommendation

Integrated `jau atta` as an English alias on existing `ingredient-ref-barley-flour` (`barley flour / farine d'orge`) and bare `jau` as an English alias on existing `ingredient-ref-pearl-barley` (`pearl barley / orge perlé`). A search for `jau` can show the grain and its named flour as separate choices. No new identity was created.

The exact qualified product name is directly paired with barley flour by multiple Canada-facing sellers; a Toronto-area importer currently lists `Barley Flour (Jau Atta)` under its flour inventory, while separate Canadian retail listings use the same exact pair [S02–S04]. India's food standard provides a product-class cross-check for barley flour and separately names `Pearl Barley (Jau)` [S01]. These sources support a regional grain/flour naming relationship, not a milling grade or a new product class.

| Candidate or field | Disposition | Evidence boundary |
|---|---|---|
| `jau atta` | **Integrated as `aliasesEn` on `ingredient-ref-barley-flour`.** | Canadian product listings explicitly pair the phrase with `barley flour`; the alias is not added to whole-barley flour because the phrase alone does not state an extraction class. [S02–S04] |
| Bare `jau` | **Integrated as `aliasesEn` on `ingredient-ref-pearl-barley`.** | FSSAI names `Pearl Barley (Jau)` as a grain product. The grain-level term remains off the flour reference as a stored alias. [S01] |
| French display | **Retain** `farine d'orge` for the flour and `orge perlé` for the grain; add no French alias. | OQLF directly pairs `farine d'orge` with `barley flour`. A Canadian French marketplace title also uses `Farine d'Orge (Jau Atta)`, but it does not establish `jau` as a Québec French term. [WP02A4-BF-S01, S04] |
| `jau ka atta`, `jau flour`, `farine de jau` | **Do not add in this pass.** | The reviewed Canada-facing flour listings use `jau atta`; they do not establish these exact variants as stable Canadian/Québec aliases. The FSSAI standard's `choker yukt jau ka churan` is a distinct source wording, not evidence for the shorter `jau ka atta` alias. [S01–S04] |
| Whole-grain milling class | **Keep distinct and unresolved for the regional name.** | One retailer's Angur listing calls its own product whole grain; other Canadian listings say only barley flour. Do not make `jau atta` an alias of `ingredient-ref-whole-barley-flour` or infer that every product with this name retains the bran. [S02–S04] |
| Forms, recipe links, and runtime numeric behavior | **None added.** | Product pages give package mass or marketing descriptions, not household measures or transferable recipe behavior. The current corpus has no recipe demand. |

## Naming, species, and picker boundary

FSSAI's official Chapter 2.4 compendium, Version 3 (04.11.2024), names `Pearl Barley (Jau)` and separately defines wholemeal barley powder / barley flour / `choker yukt jau ka churan` from dehusked *Hordeum* barley [S01]. The standard supports the grain-level `jau` term and places barley flour in the barley product family; it does not name `jau atta` as an English flour phrase or provide a Canadian bilingual label.

For the English flour name, three Canada-facing product sources provide the necessary direct pairing. Premier Foods, a Toronto-area importer and distributor, lists WAQAR `Barley Flour (Jau Atta) 2LBS`; its fetched page displayed `In stock`, but the search-index copy is old, so no current availability claim is made [S02]. Neelam Foodland Canada's listing title is `Barley Flour/Jau Atta 250 Gm`; it was marked sold out and provides little product-specification detail [S03]. Walmart Canada's Angur product title and description pair `Barley Flour` and `Jau Atta` and describe flour milled from barley grains; Walmart says its marketplace product information is supplied by sellers and not separately verified, and this listing is sold by Bombay Trading Company [S04]. These are direct retail names, not manufacturer standards. No package mass is treated as a kitchen measure.

OQLF's existing record `WP02A4-BF-S01` gives preferred Québec French `farine d'orge` and its English equivalent `barley flour`. The French-facing Walmart listing also renders the product as `Farine d'Orge (Jau Atta)` [S04]. Retain the existing French display and do not store the South Asian phrase as a French alias.

The name `jau atta` does not reliably identify whole-grain milling. Walmart's Angur listing calls that particular product whole grain, but Premier Foods and Neelam Foodland identify their listed products only as barley flour. The separate `whole barley flour / farine d'orge entière` row therefore remains a more qualified identity. Do not direct the alias to that row or infer that all Jau Atta products share the Angur product's milling process.

The app's current search matches a complete word phrase inside a term before falling back to partial matching. With the integrated aliases, `jau atta` resolves to the existing barley-flour row; `jau` resolves to the pearl-barley row and also surfaces the flour row because it is part of `jau atta`. This makes the short search show the grain and flour choices together without storing bare `jau` on the flour. The broad `atta` search includes the barley-flour row alongside existing atta-named results; the qualified phrase is the useful exact search.

## Measurements, density, and substitutions

The integrated barley-flour ledger record now has `measurementState: researched_supported` and `substitutionResearchState: blocked_pending_evidence`; the reference still has `defaultDensity: null` and `unitMappings: []`. The review found source-specific measurements and formulation studies, but none qualifies as a reusable default or global rule:

- USDA's Agriculture Research Service household-survey manual for 1977–78 lists **1 cup, unsifted barley flour = 0.225 lb** (about **102.1 g**) [S06]. This is a historical published portion value; the exact cup convention and filling procedure are not specified for RecipeBook's mapping, and it is not specific to a Jau Atta product. Keep it as a source-specific observation only; do not create an active cup mapping.
- El-Sherif and Kenawi report a **0.44 g/mL** bulk-density result for their tested barley flour sample [S07]. The paper's sample and laboratory context do not establish a current Canadian-product default, and no method details sufficient for transferring the value to every barley flour were located. Keep `defaultDensity` null and `unitMappings` empty.
- Primary flour studies test barley-flour replacement only within defined products and formulas: 10–30% in steamed wheat bread [S08], and 20–60% whole barley flour in a bread experiment that also tested Cephalaria flour and adjusted added water using farinograph data [S09]. Their measured dough and bread effects vary with level, flour fraction, and recipe context. They do not support an arbitrary wheat-to-barley substitution rule for a user recipe.

Integration recorded the historical portion and laboratory density as source-scoped observations and kept broad wheat-for-barley replacement blocked pending evidence. No active density, unit mapping, conversion, yield, form, or substitution behavior was added.

## Live catalog, ownership, and recipe audit

Post-integration live snapshot from the [integration README](../batches/wp02-a6-jau-atta-alias-integration-20261012/README.md), captured on 2026-10-12. File hashes cover exact bytes. The recipe-corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte.

| Surface | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,324 rows; 139 `GRAIN_AND_CEREAL` | `6b4a1e34d8b7e8b75fdaf48c1bbf27c6ca1ce6562a75dc958a00d1b9e5014a7d` |
| Ingredient forms | 98 rows | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,632 records; 6,017 source entries; 5,033 distinct source IDs; 8 unit conversions | `b959f36a409e902795dfc8f5322cfbce667e7e7c0030eecef6c6c49ca3298d0d` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1 file; 1,324 reference entries | `d2f206e8499e985c8195a76ce1d38cd39de4f9781f283f5d5fc05f485f4472ba` |

Exact-key ownership used the repository's `normalize_search_key` across all active reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs. Normalization folds case, accents, ligatures, punctuation, and whitespace. This is exact-key ownership, not a runtime picker test.

| Exact normalized key | Active reference owner | Form owner | Legacy owner | Ledger record-ID owner |
|---|---|---|---|---|
| `jau atta` | `ingredient-ref-barley-flour` (alias) | none | none | none |
| `jau` | `ingredient-ref-pearl-barley` (alias) | none | none | none |
| `jau ka atta` | none | none | none | none |
| `jau flour` | none | none | none | none |
| `farine de jau` | none | none | none | none |
| `barley flour` | `ingredient-ref-barley-flour` | none | none | none |
| `farine d'orge` | `ingredient-ref-barley-flour` | none | none | none |
| `whole barley flour` | `ingredient-ref-whole-barley-flour` | none | none | none |
| `farine d'orge entière` | `ingredient-ref-whole-barley-flour` | none | none | none |
| `pearl barley` / `orge perlé` | `ingredient-ref-pearl-barley` | none | none | none |

At pre-integration review, the source prefix `WP02-A6-JAU-ATTA-BARLEY-20261012` had no matching IDs in the 5,017 ledger source IDs or earlier proposal files. Integration has since added its S01–S04 and S06–S09 IDs to the two existing ledger records; see the [integration README](../batches/wp02-a6-jau-atta-alias-integration-20261012/README.md). No reference ID was proposed.

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across serialized strings for `jau atta`, `jau ka atta`, `jau flour`, bare `jau`, `barley flour`, `farine d'orge`, whole-barley variants, and pearl-barley variants. The scan found **zero recipe-file hits**, **zero ingredient-row hits**, and **zero direct links** to `ingredient-ref-barley-flour` or `ingredient-ref-pearl-barley`. No recipe link or recipe edit was proposed.

## Integration outcome

1. Added `jau atta` to `aliasesEn` on `ingredient-ref-barley-flour` and `jau` to `aliasesEn` on `ingredient-ref-pearl-barley`; retained both Québec French displays and added no French aliases or new identity.
2. Added source IDs S01–S04 and S06–S09 to the applicable existing ledger records and reused OQLF source `WP02A4-BF-S01` without duplication. The ledger now preserves the historical cup portion and experimental density observation as source-scoped evidence, with broad wheat-for-barley replacement blocked pending evidence.
3. Added no forms, recipe links, conversions, package yields, active density, unit mappings, or substitution behavior. The recipe corpus remains unchanged and WP02 A6 remains open.
4. Package validation, generated-index freshness, reference normalization, ledger, ownership, recipe-corpus, encoding, and whitespace checks passed as recorded in the integration README. No app, unit, instrumentation, or emulator tests were run because the change only adds database JSON data under `AGENTS.md`.

## Source register

Pages were accessed on 2026-10-12. Source IDs S01–S04 and S06–S09 are now recorded in the live ledger as described above; the existing OQLF source remains reused rather than duplicated.

| ID | Source and locator | Evidence and limit |
|---|---|---|
| **WP02-A6-JAU-ATTA-BARLEY-20261012-S01** | Food Safety and Standards Authority of India, [Chapter 2.4: Cereals and Cereal Products, Version 3 (04.11.2024)](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals%20and%20Cereal%20products%281%29.pdf), §§2.4.5–2.4.5(2), pp. 5–6. | Current official compendium names `Pearl Barley (Jau)` and separately defines barley flour / `choker yukt jau ka churan` from dehusked barley (*Hordeum vulgare* or *H. distichon*). Supports the grain term and barley product family; it does not itself use the exact phrase `jau atta` or prescribe a Canadian retail alias. Regulatory limits are not recipe measures. |
| **WP02-A6-JAU-ATTA-BARLEY-20261012-S02** | Premier Foods, Toronto-area importer/distributor, [Barley Flour (Jau Atta) 2LBS](https://www.premierfoods.ca/product/barley-flour-jau-atta-2lbs/), WAQAR brand, product title. | Canadian inventory listing directly pairs `Barley Flour` and `Jau Atta`; the fetched listing displays `In stock`, but its search-index copy is old, so this is not treated as a current availability claim. Retail/distributor product name, not a manufacturer milling specification or French terminology ruling. Package weight is not a cup measure. |
| **WP02-A6-JAU-ATTA-BARLEY-20261012-S03** | Neelam Foodland Canada, [Barley Flour/Jau Atta 250 Gm](https://neelamfoodlandca.com/products/barley-flour-jau-atta-250-gm), current product title. | Independent Canada-facing listing directly pairs the phrases; the product was marked sold out and the page gives no ingredient/process details. Title supports wording only; 250 g is package mass, not a recipe measure. |
| **WP02-A6-JAU-ATTA-BARLEY-20261012-S04** | Walmart Canada, [Angur Barley Flour (Jau Atta) 2 lb](https://www.walmart.ca/en/ip/Angur-Barley-Flour-Jau-Atta-2lb-Premium-Finely-Ground-Whole-Grain-Flour-High-Fiber-Non-GMO/2UGDCXUOLHGP?classType=undefined) and [French listing](https://www.walmart.ca/fr/ip/Angur-Farine-d-Orge-Jau-Atta-2-Lb-Farine-de-Grains-Entiers-de-Qualit-Sup-rieure-Finement-Moulue-Riche-en-Fibres-non-OGM/2UGDCXUOLHGP). Product title/details and seller attribution. | The titles use `Barley Flour (Jau Atta)` / `Farine d'Orge (Jau Atta)`; English details say milled from barley grains. The listing calls this specific item whole grain and is sold by marketplace seller Bombay Trading Company; Walmart says supplier-provided item details are not separately verified. Do not generalize its whole-grain claim. The French listing supports marketplace wording, not a Québec terminology ruling or French `jau` alias. |
| **Existing source `WP02A4-BF-S01`** | Office québécois de la langue française, [farine d'orge, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge); already recorded on the active barley-flour ledger entry. | Directly pairs preferred Québec `farine d'orge` with English `barley flour`. The entry was last updated in 1982; its historical milling and recipe-performance notes are not used. Reuse this existing ledger source ID rather than duplicating it. |
| **WP02-A6-JAU-ATTA-BARLEY-20261012-S06** | USDA Agricultural Research Service, [Manual of food codes and weights for use in household food consumption, 1977–78 survey](https://www.ars.usda.gov/ARSUserFiles/80400530/pdf/7778/cfe_admin_rep_335.pdf), table of food descriptions/common units/weights, `Barley flour`. | Reports `1 cup, unsifted = 0.225 lb` (about 102.1 g). Historical published portion only; exact cup convention and fill procedure are not connected to the app's unit mapping, and the value is not Jau Atta product-specific. Do not activate a g/cup mapping. |
| **WP02-A6-JAU-ATTA-BARLEY-20261012-S07** | El-Sherif and Kenawi, *Studies on Some Bakery Products Fortified with Barley and Sorghum Flour*, [article PDF](https://jfds.journals.ekb.eg/article_115825_90511f1aef060b1d0f5bc1434f8dde1.pdf), *Journal of Agricultural Science, Mansoura University* 34(12), 2009, bulk-density table and cake/biscuit formulas. | Reports 0.44 g/mL bulk density for its barley-flour sample and formula trials using 15–40% barley flour. The article calculates bulk density using a cited method but does not give enough flour-processing detail to establish a reusable default. Experimental cake/biscuit formulas do not define a global substitution rule. |
| **WP02-A6-JAU-ATTA-BARLEY-20261012-S08** | Lin et al., [Effects of Blending of Wheat Flour with Barley Flour on Dough and Steamed Bread Properties](https://onlinelibrary.wiley.com/doi/10.1111/j.1745-4603.2012.00352.x), *Journal of Texture Studies* (2012), abstract and practical applications. | Tests 10%, 20%, and 30% barley flour in steamed wheat bread and reports changes to gluten, dough, and bread properties. The ratios are product/formula-specific; no general substitute quantity is adopted. |
| **WP02-A6-JAU-ATTA-BARLEY-20261012-S09** | Boz, [The Effects of Cephalaria Syriaca Flour on Dough and Bread Containing Different Levels of Barley Flour](https://onlinelibrary.wiley.com/doi/10.1111/jfq.12155), *Journal of Food Quality* (2015), abstract, methods, and results. | Tests whole barley flour at 20%, 40%, and 60% in bread, with a separate Cephalaria-flour adjustment and farinograph-based water. It is a bounded bread study and supports no arbitrary substitution for other product contexts. |

## Disposition

Integrated the two narrow regional names `jau atta` (barley flour) and `jau` (pearl barley) on their existing identities, retaining the Québec French displays. No identity was created, the flour alias was not attached to whole barley flour, and no runtime measurement or substitution behavior or recipe link was added. The broader A6 regional-flour checklist remains open. See the [integration README](../batches/wp02-a6-jau-atta-alias-integration-20261012/README.md) for accepted data changes and post-integration validation.
