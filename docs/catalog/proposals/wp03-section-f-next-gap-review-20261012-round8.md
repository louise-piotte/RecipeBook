# WP03 Section F: sprouted barley product review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as an identity-only reference with source-scoped substitution research.
- **Scope:** One distinct sprouted-barley grain product within Section F's open regional-cereal and preprocessed-grain coverage ([plan, line 2146](../../RecipeBook-global-ingredient-catalog-plan.txt#L2239)).
- **Recommendation:** Accept one identity-only `GRAIN_AND_CEREAL` reference for **`sprouted barley, dried / orge avec écorce germée séchée`**, using the exact French product name published by Québec manufacturer Malterie Caux-Laflamme. Scope it to the food ingredient it lists: barley with hull, germinated and dried. Keep the English name `sprouted barley` source-bounded; the English Caux-Laflamme page's machine-translated wording is not treated as terminology authority. Add no aliases, `IngredientForm`, density, unit mapping, active measure, package yield, recipe link, conversion, or substitution rule.
- **Existing adjacent decisions preserved:** Round6's integrated sprouted wheat berries and round7's held sprouted rye berries are not reopened. This review concerns barley only.

## Why this is a distinct open candidate

The current Section F checklist leaves regionally significant cereal mixes and preprocessed grains open. No focused sprouted-barley identity review or hold was found. A whole dried barley grain that has already been germinated is a distinct processed ingredient from the active unsprouted barley products. It is also separate from barley malt, malted barley flour, barley malt syrup, barley grass, and fresh living sprouts.

The active catalog has no unqualified `barley / orge` grain row and no exact sprouted-barley owner. Its neighboring identities cover barley flakes, barley flour, cream of barley cereal, hulled barley, malted barley flour, pearl barley, pot barley, puffed barley, roasted barley flour, and whole barley flour. Those rows remain unchanged. The existing `WP02-MALT-EXTRACT-20261012` proposal cites sprouted barley as an ingredient in one barley-malt-syrup product; that is syrup composition evidence, not ownership of a whole sprouted-grain product or a reason to reopen the malt-syrup boundary.

Malterie Caux-Laflamme's current Québec food-products page lists `orge avec écorce germée séchée` under barley. It separately lists sweet- and bitter-profile products and `orge nue germée maltée`. The exact French product name therefore preserves the hull and drying qualifiers and keeps the un-malted product distinct from naked malted barley. Everspring Farms independently lists `Sprouted Barley` among its sprouted whole-grain ingredients [S02]. These sources support a scoped identity, not a universal sprouting protocol, cultivar, or malt specification.

## Pre-integration package, ownership, and recipe audit

Snapshot and ownership checks were performed against the workspace before integration on 2026-10-12. Exact ownership used `tools/seed_package/bundled_seed_package.py::normalize_search_key`, which folds case, accents, compatibility characters, punctuation, and repeated whitespace.

| Artifact | Count or result before integration |
|---|---:|
| `ingredient-references.v1.json` | 1,312 references |
| `ingredient-forms.v1.json` | 98 forms |
| `legacy-import-identities.v1.json` | 64 candidates |
| `research-ledger.v1.json` | 1,620 records; 5,918 source entries |
| `package-yields.v1.json` | 1 entry; none for barley or this candidate |
| Research-ledger unit conversions | 8 generic entries; none for barley or this candidate |
| Global substitution rules | 0 |
| Contextual substitution rules | 0 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows |
| Recipe corpus bytes and fingerprint | 753,792 bytes; `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

Normalized exact-key checks found no active reference, form, legacy candidate, or ledger record for `ingredient-ref-sprouted-barley`, `sprouted barley`, `sprouted barley grain`, `sprouted barley kernels`, `sprouted barley with hull`, `sprouted barley, dried`, `germinated barley`, `orge germée`, or `orge avec écorce germée séchée`. The new proposed ID is unoccupied. No exact candidate-specific density, unit mapping, package yield, unit conversion, or substitution rule exists. The current package has no barley-specific `IngredientForm`.

The complete manifest-listed recipe corpus was scanned in manifest order for the candidate phrases above and related barley/sprout wording. The scan found **zero matching recipe files, zero matching ingredient rows, and zero barley/orge ingredient rows**. The current corpus fingerprint is recorded above; no recipe link or recipe-text change is proposed.

## Proposed catalog boundary

| Proposed field | Value |
|---|---|
| ID | `ingredient-ref-sprouted-barley` |
| English display | `sprouted barley, dried` |
| French display | `orge avec écorce germée séchée` |
| English aliases | None |
| French aliases | None |
| Category | `GRAIN_AND_CEREAL` |
| Identity scope | Barley sold as a dried, germinated food-grain ingredient. The French source names the specific with-hull product; this proposal does not imply that every sprouted-barley product has the same hull state, cultivar, germination length, drying method, or malt profile. |
| Forms | None |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` |
| Recipe links, package yields, conversions, substitutions | None |

Keep this identity separate from:

- unqualified barley, hulled barley (`hulled barley / orge mondé`), pearl barley (`pearl barley / orge perlé`), pot barley (`pot barley / orge en pot`), barley flakes, puffed barley, and barley flours;
- barley malt, malted barley flour, malt extract, malt syrup, malt sprouts, and the Québec producer's separate `orge nue germée maltée` product;
- live barley sprouts, barley grass, barley-grass powder, and barley seed sold for home sprouting;
- composite sprouted-grain bread, cereal, or topper products.

Do not add broad aliases such as `barley`, `orge`, `germinated barley`, `barley sprouts`, `barley malt`, `malted barley`, `orge germée`, or `orge maltée`. The sources do not establish those as safe same-scope synonyms; several belong to live sprouts, plant/grass products, brewing malt, or composite products.

## Identity, forms, measurement, and substitution findings

| Concern | Evidence and decision |
|---|---|
| Product identity | Caux-Laflamme's current Québec manufacturer page classifies the product under food ingredients and lists `Orge avec écorce germée séchée`; Everspring lists `Sprouted Barley` as a sprouted grain ingredient [S01–S03]. Accept the scoped dried-grain identity. CFIA's general survey describes dried sprouted seeds as partially sprouted seeds that are then dried (and milled for powder products); this supports the product-class boundary, not barley-specific processing or a formula [S07]. |
| French naming | Use Caux-Laflamme's exact local product wording as the French display. OQLF's GDT gives `orge` for barley and says it applies to the grain as well as the plant, but it does not establish a preferred compound for sprouted barley. The display is direct Québec product naming, not an OQLF ruling [S01, S06]. Do not shorten it to `orge germée`. |
| Malt boundary | Caux-Laflamme lists the dried, with-hull germinated product separately from `orge nue germée maltée`, and explains that germination develops natural grain aromas while malting creates new aromas. Keep the identity unqualified for malt status and separate from malted products [S01]. The available source does not disclose every process parameter or show that all manufacturers stop at the same germination point. |
| Forms | Add no `IngredientForm`. The Québec supplier says its cereals may be offered whole, crushed, or ground from coarse to extra-fine, and lists sweet/bitter product profiles; it does not define a stable, recipe-ready form set for this particular identity. Do not encode the supplier's generic presentation options or profile variants as catalog forms [S01]. |
| Measurements and conversions | The sources provide no household measure, mass-volume pair, density, cooking yield, or product-specific package-to-usable-yield relationship. Everspring lists bulk sizes and order minimums on its supplier pages, but those are commercial packaging facts, not household measurements [S02–S04]. Add no active measure, density, unit mapping, unit conversion, or package yield. |
| Substitution | Everspring's supplier shop says sprouted whole grains, seeds, and beans can substitute 1:1 for unsprouted products [S04]. It does not state a mass/volume basis, cooking context, dish role, or barley-specific test. Preserve it, if useful, only as a supplier-wide source claim; add no global or contextual substitution rule. Caux-Laflamme gives no replacement ratio or tested recipe in the reviewed page [S01]. |
| Recipe demand | No candidate or neighboring barley ingredient wording occurs in the bundled recipe ingredient rows. Add no recipe link. |

## Source register

Source IDs use the prefix `WP03-SPBARLEY-20261012`. The prefix was absent from the live ledger and repository files when the proposal was drafted; its seven source records are now allocated to the integrated ledger entry.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-SPBARLEY-20261012-S01` | Malterie Caux-Laflamme, [Aliments](https://malteriecauxlaflamme.com/aliments/), current manufacturer food-product list and process description. | The Québec-grown food-grain supplier lists `orge avec écorce germée séchée`, separate sweet/bitter profiles, and `orge nue germée maltée`. It says its cereals are available whole, crushed, or ground from coarse to extra-fine, and distinguishes germination from malting. The linked product detail page returned a cache miss during this review; the main food-products page is directly accessible. It does not supply a barley-specific recipe amount or household conversion. |
| `WP03-SPBARLEY-20261012-S02` | Everspring Farms, [Sprouted Ingredients](https://www.everspringfarms.ca/wp-content/uploads/2020/10/bakery.pdf), supplier ingredient listing, “Grains.” | Lists `Sprouted Barley` among sprouted grain ingredients and identifies bulk formats for the ingredient list. The PDF endpoint returned 404 when opened; the current search index exposed its product-list text. It is used as corroboration for the English product phrase, not as a current package specification, recipe measure, Québec French label, or process standard. |
| `WP03-SPBARLEY-20261012-S03` | Everspring Farms, [About Us](https://www.everspringfarms.ca/about/), manufacturer background. | Identifies Everspring as an Ontario grain/seed/flour company and describes its food-grade sprouted-grain business. It supports the Canadian manufacturer context, not a specific barley SKU. |
| `WP03-SPBARLEY-20261012-S04` | Everspring Farms, [Shop and supplier FAQ](https://www.everspringfarms.ca/shop/), “Can I Substitute Sprouted Ingredients 1:1?” and shelf-life sections. | States that sprouted whole grains, seeds, and beans can substitute 1:1 for unsprouted versions; it omits the amount basis and recipe scope. Its stated MOQ and shelf-life ranges describe the supplier's products generally, not a household measure or universal barley specification. The FAQ supports treating dry sprouted grains as shelf-stable in this supplier's product context. |
| `WP03-SPBARLEY-20261012-S05` | Everspring Farms, [Frequently Asked Questions](https://www.everspringfarms.ca/faq/), “What are sprouted grains?” and “How do grains sprout?” | Defines the supplier's sprouted grains as whole grains that are soaked, sprouted, and then dried at low temperature; the page says dry sprouted grains are shelf-stable. This is the supplier's process description and is not applied as a universal product specification. |
| `WP03-SPBARLEY-20261012-S06` | Office québécois de la langue française, [orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge), updated 2019. | Pairs `orge` and English `barley`, defines the grain, and says the French term applies to the plant and grain. It does not name a sprouted-barley compound. The exact compound display comes from the manufacturer in S01. |
| `WP03-SPBARLEY-20261012-S07` | Canadian Food Inspection Agency, [Bacterial Pathogens in Dried Sprouted Seed Products](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/final-report-8), survey definition and scope. | Describes dried sprouted seed products generally as partially sprouted seeds that are then dried, with powders also milled. This supports a general processed-product distinction only; it does not identify barley, approve a particular product, or provide culinary measurements. |

## Verification performed before integration

- Re-read `AGENTS.md`, the current Section F checklist, the latest catalog and ledger, and the round6/round7 sprouted-grain decisions. Confirmed this is a barley-specific gap and does not reopen sprouted wheat berries or the held sprouted rye candidate.
- Audited normalized exact ownership across 1,312 references, 98 forms, 64 legacy candidates, and all 1,620 ledger records. Confirmed the current barley neighbors and found no exact sprouted-barley owner or dedicated hold.
- Checked all reference unit mappings, the one package-yield row, 8 generic ledger unit conversions, and both substitution-rule files. None owns this candidate.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows for candidate phrases and barley/orge ingredient wording; found zero hits. Recorded the exact corpus byte count and manifest-order fingerprint above.
- Checked the proposed ID, source-ID prefix, and round8 proposal path for collisions; none is present elsewhere in the workspace. The source prefix is proposal-local and has not been added to the shared ledger.
- Reached the current Caux-Laflamme food-products page, the Everspring supplier pages, and OQLF directly. The Caux product-detail page returned a cache miss; the Everspring ingredient-list PDF returned 404, so those two details are recorded only within the access limits stated above.
- At proposal time, verified UTF-8 without BOM, absence of mojibake markers, no trailing whitespace, and that only this proposal file was newly created. Root then integrated the identity and source-ledger review; see the integration record below. Under the updated repository rule, no app tests or emulator checks were run for this database-JSON addition.


## Integration record

Added `ingredient-ref-sprouted-barley` as `sprouted barley, dried / orge avec écorce germée séchée` in `GRAIN_AND_CEREAL`, with no aliases or numeric behavior. Seven source records and one identity decision were added to the research ledger. Everspring's supplier-wide 1:1 claim is retained as a rejected, source-scoped substitution candidate because it has no unit basis, barley-specific test, recipe context, or unambiguous target in the catalog; `substitutionResearchState` is `researched_no_supported_substitute`. Measurement research remains `not_yet_researched`. No active rule, form, measurement, yield, conversion, or recipe link was added.

After integration, the catalog has 1,314 references and the ledger has 1,622 records, 5,943 source entries, and 4,960 distinct source IDs. The manifest-listed 114-file / 1,123-row corpus remains unchanged with no barley or candidate matches. Package normalization/validation, reference normalization, generated-index freshness, ledger schema validation, exact ownership, recipe corpus, UTF-8/no-BOM, and scoped whitespace checks passed. See `docs/catalog/batches/wp03-section-f-sprouted-barley-identity-integration-20261012/README.md`.
