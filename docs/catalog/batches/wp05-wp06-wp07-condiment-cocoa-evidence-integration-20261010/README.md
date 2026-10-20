# WP05 / WP06 / WP07 condiment and portion-evidence integration

Date: 2026-10-10  
Status: Reviewed proposal findings integrated into the canonical seed, recipe link, evidence ledger, regression coverage, plan, and roadmap. Pixel UI verification remains open because the Pixel 9a AVD could not install the APK with its available internal storage.

## Proposal inputs

- [WP05 barbecue-sauce alias and everyday-condiment boundary review](../../proposals/wp05-barbecue-sauce-alias-boundary-review-20261010.md)
- [WP06 East African fats, souring, and preservation boundary review](../../proposals/wp06-east-african-fat-souring-preservation-review-20261010.md)
- [WP07 cocoa and chocolate portion evidence review](../../proposals/wp07-cocoa-chocolate-portion-evidence-review-20261010.md)

## Accepted catalog and recipe changes

- Add English alias `barbecue sauce` to the existing `ingredient-ref-bbq-sauce`. The matching Canadian Kraft Heinz pages use `Original BBQ Sauce` / `Sauce BBQ Originale` for the same product and describe it as barbecue sauce / sauce barbecue. No French alias was added. The older OQLF entry has a narrower definition for `sauce barbecue`, and independent Québec review of the generic display remains open. Keep Chinese/char-siu barbecue sauce, grilling sauce, ketchup, Worcestershire, and steak sauce separate.
- Link recipe 019's exact `1/4 cup mayonnaise` line (`135813a6-75e2-4596-8c71-ffd450fab0ca-ingredient-13`) to the existing `ingredient-ref-mayo`. OQLF's mayonnaise definition and the recipe line support this exact link. Keep aioli separate; no form, measure, or substitution was added.
- Keep the existing Ethiopia-scoped niter kibbeh identity and its source-backed decision. Do not add a tesmi alias or mapping. Route smen to WP05; retain ergo and ersho as source-specific research candidates. No recipe demand or supported identity/form/measurement change was found in this sweep. The broader WP06 and Section Z checklists remain open.

The bundled reference count remains **753** and the form count remains **36**. Apart from the mayonnaise reference link, no recipe content changed in this cohort.

## WP07 ledger observations

All entries below are `portion_weight` observations in `docs/catalog/research-ledger.v1.json`. The cocoa reference measurement states remain `blocked_pending_evidence`; chip-form measurement states remain `not_yet_researched`. No default density, unit mapping, form density, conversion rule, or recipe quantity was activated.

| Ledger record | Source-published observations retained |
|---|---|
| `ingredient-ref-unsweetened-cocoa-powder` | USDA SR28 NDB 19165: 1 source cup = 86 g; 1 source tbsp = 5.4 g, with processing unstated. Hershey natural unsweetened cocoa label: 1 tbsp = 5 g. King Arthur birthday-cake frosting: 1 1/4 cups = 106 g; its lighter option is 1 cup = 85 g. The label serving and recipe portions remain separate from a kitchen conversion. |
| `ingredient-ref-dutch-process-cocoa-powder` | USDA SR28 NDB 19166, explicitly alkali-processed: 1 source cup = 86 g; 1 source tbsp = 5.4 g. Retained separately from NDB 19165. |
| `ingredient-form-semisweet-chocolate-chips` | Callebaut SKU 209671 label: 1 tbsp = 14 g; linked recipe/package statement: 2 cups = 340 g semisweet or bittersweet chips. USDA SR28 NDB 19701 (“made with butter”): regular 170 g/cup, large 182 g/cup, mini 173 g/cup. USDA Home and Garden Bulletin 72 (2002): semisweet chips 168 g/cup. These observations retain their different product, label, food, size, and date bases. |
| `ingredient-form-white-chocolate-chips` | USDA Home and Garden Bulletin 72 (2002): 170 g/cup. King Arthur chart: 170 g/cup; its product and chip-size details are unstated. The two values remain separate. |
| `ingredient-form-milk-chocolate-chips` | USDA Home and Garden Bulletin 72 (2002): 168 g/cup, retained as a historical source observation. |

Sources are recorded with IDs `WP07-COCOA-CHOC-20261010-S01` through `S08`, plus the existing `WP07-KAB-IWC` chart source. FDA label guidance records 240 mL/cup, 15 mL/tbsp, and 5 mL/tsp for Nutrition Facts household measures; those conventions are not equated with the app's U.S. units or unspecified recipe/chart cups.

### Held chart rows and identity boundaries

- King Arthur's “Cocoa (unsweetened)” chart row (1/2 cup = 42 g) links to Triple Cocoa Blend, a Dutch/natural/black blend. It is not assigned or scaled onto either cocoa reference.
- King Arthur's “Chocolate Chips” row (1 cup = 170 g) links to Guittard bittersweet chips. The catalog has no bittersweet-chip form, so the value remains a held finding rather than a measurement on the bittersweet base chocolate.
- The KAB mini-chip row (1 cup = 177 g) does not identify chocolate type, so it is not assigned to a current form.
- The old Hershey European-style cocoa portion and recipe-specific Dutch-cocoa frosting option remain product/context-specific; neither supports a general cocoa identity conversion or substitution rule.

No values were averaged, scaled, or converted into g/mL. Source cups, nutrition-label servings, and app unit definitions remain distinct.

## Verification and Pixel status

- Ingredient-reference normalization completed for 753 references; bundled-package normalization reported 0 changed parts. The generated Kotlin catalog is current at 753 references.
- Research-ledger/package validation passed. All 14 Python seed-package tests passed; all 335 Android unit tests passed with 0 failures, errors, or skips. `git diff --check` passed.
- The edited ledger and documentation decode as UTF-8 without a BOM; no known mojibake markers were found.

Final snapshot (SHA-256 over exact file bytes; recipe fingerprint uses sorted recipe basenames with NUL separators around exact file contents):

| Artifact | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 753 | `eaccfeb7fe5c4cf25dea4ad4d844bf6b2b3b41e7fc7bf9b0f01440b36a3fef5b` |
| Ingredient forms | 36 | `1a956f9d405134f013524ea5e7778325925f9f572c9c59b74f10b65e1921c8ef` |
| Evidence ledger | 958 records / 1,968 source entries / 1,590 source IDs | `1be05afc4c8e4b8fd37ee0c87f73555489272e94b75f37e2eac3f320e8e095ef` |
| Legacy candidates | 82 | `60d389975134f8d31c57c66caa6375b4466c4c9614d399617a64365878d6aa5f` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus | 114 recipes / 1,123 ingredient rows | `d4ba08e849c8f276446433fd1e8c70a78a0b31bd750c0283647e8e5b569604ee` |

The deployment script's Gradle test and debug-assembly stages passed in the prior WP02/WP03/WP04 checkpoint, but the APK install on `emulator-5554` failed with `INSTALL_FAILED_INSUFFICIENT_STORAGE` at 409 MB free. The non-streaming ADB fallback also failed before creating an install session (`Requested internal only, but not enough space`). `pm trim-caches 1G` freed no space. No app data or AVD image was cleared. Pixel bilingual picker navigation and screenshots remain open.

## Remaining scope

The generic Québec French review of `sauce barbecue`, the broad WP05 everyday-condiment checklist, WP06 African/Section Z regional coverage, WP07 broader measurement priorities, and Pixel 9a picker verification remain open.
