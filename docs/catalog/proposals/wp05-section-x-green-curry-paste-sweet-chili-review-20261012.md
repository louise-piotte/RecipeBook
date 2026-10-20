# WP05 Section X — Green Curry Paste and Thai Sweet Chili Sauce Review

Date: 2026-10-12. Status: proposal-only supplement; no canonical catalog, recipe, ledger, plan, or roadmap changes were made.

## Scope and current state

This bounded review covers only two candidate identities: Thai green curry paste and Thai-style sweet chili sauce. The 2026-10-08 WP05 Southeast Asian proposal already surfaced both candidates; this packet adds a narrow current-source and independent Québec French review rather than claiming new Section X coverage. The earlier broad proposal remains pending for these two rows and other candidates.

Fermented shrimp/fish pastes and sauces, the identities integrated in the 2026-10-12 fermented-paste batch, sambal, Kapi, padaek, fish sauce, and sriracha are excluded. Yellow, Panang, and Massaman curry pastes, nam prik pao, laksa/rendang/satay pastes, and other ready sauces are outside this tranche. Their status is not changed.

The live package snapshot inspected for this review has 1,095 ingredient references, 79 forms, 114 manifest-listed recipes, and 1,123 ingredient rows. Current active rows include:

| Existing ID | English / French display | Scope relevant to this review |
|---|---|---|
| `ingredient-ref-curry-paste` | `curry paste` / `pâte de cari` | Generic paste; do not use it as a color/style alias. |
| `ingredient-ref-red-curry-paste` | `red curry paste` / `pâte de cari rouge` | Specific red style; retain separately. |
| `ingredient-ref-sriracha-sauce` | `sriracha sauce` / `sauce sriracha` | Existing bottled sauce; do not merge with sweet chili sauce. |

Neither proposed name has an exact active-reference, form, or legacy-candidate owner. No form, measurement, conversion, yield, or substitution is proposed.

## Candidate decisions

| Proposed ID | English display | fr-CA display | Aliases | Recommendation and exact boundary |
|---|---|---|---|---|
| `ingredient-ref-green-curry-paste` | `Thai green curry paste` | `pâte de cari vert thaï` | None | Add as an identity-only prepared paste used as a green Thai curry base. Keep separate from generic curry paste, red curry paste, curry powder, green chili paste, and finished green curry sauce. Commercial and homemade formulas are source-specific; do not encode a required formula or any constituent as an alias. |
| `ingredient-ref-thai-sweet-chili-sauce` | `Thai sweet chili sauce` | `sauce chili douce de type thaïlandais` | None | Add as an identity-only bottled, ready-to-use, sweet and mildly hot Thai-style chili condiment. Keep separate from sriracha, sambal, generic chili paste, sweet-and-sour sauce, and unqualified tomato-style chili sauce. Retail formulas vary; do not imply one universal ingredient list. |

Both belong in `SAUCE_AND_CONDIMENT`. These are separate compound products, not aliases or substitutes for each other. A curry-paste package may itself list another catalog ingredient; that does not change the package identity or justify remapping the constituent.

## Bundled recipe-demand scan

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned. No ingredient row names green curry paste or Thai sweet chili sauce in English or French, and neither candidate has a recipe link proposed.

The adjacent hits are already owned by existing identities:

| Recipe | Exact ingredient line | Current owner | Limit |
|---|---|---|---|
| 086, Butter Chicken | `2 tsp curry paste` | `ingredient-ref-curry-paste` | Generic wording does not identify a Thai green style. |
| 095, Satay | `1 to 2 tbsp red curry paste` | `ingredient-ref-red-curry-paste` | The dish title does not establish demand for bottled satay paste. |
| 019, Crab Balls | `1/4 tsp sriracha sauce`; `2 tbsp sriracha sauce` | `ingredient-ref-sriracha-sauce` | Existing sriracha demand does not support a sweet-chili alias or substitution. |

Outside the bundled corpus, Québec sources use `pâte de cari vert` in Thai-curry recipes and `sauce chili douce thaï` in a chicken recipe [S03, S06]. These pages demonstrate local recipe wording and use, not bundled demand, a shared formula, or a conversion.

## Québec French wording and limits

- **Green curry paste:** OQLF lists `cari`, `carry`, `cary`, and `curry` for the spice term `cari`, whose definition is an Indian-origin spice blend. That entry does not name or define Thai curry paste. Québec retailer Avril uses `Cari vert` in a product title and calls its item a Thai green curry paste; Ricardo uses `Pâte de cari vert` for a homemade paste. These are independent local usage evidence for the proposed wording, not an OQLF ruling or a standard commercial recipe [S02–S04].
- **Thai sweet chili sauce:** Lee Kum Kee Canada labels one product `Sauce chili douce de type thaïlandais`; Le Poulet du Québec uses `sauce chili douce thaï` in a recipe. I did not find an OQLF entry for this exact prepared-sauce term. Retain the borrowed, descriptive Québec product wording without claiming standardization; retailer and recipe phrasing does not establish equivalence among every sweet chili sauce [S05–S06].

## Sources

Sources accessed 2026-10-12. Product ingredient lists support only the named SKU; they do not define every product in the proposed identity.

| ID | Direct source | Claim supported and limit |
|---|---|---|
| `WP05-THAI-PASTE-READY-20261012-S01` | McCormick for Chefs, [Thai Kitchen Green Curry Paste](https://www.mccormick.com/collections/all-mccormick-for-chefs-foodservice-products/products/thai-kitchen-green-curry-paste-35-oz) | Current manufacturer page names a Thai green curry paste and describes its use as a paste for curry, soups, and marinades. Its listed ingredients are one food-service SKU, not a Thai standard or a universal formula. |
| `WP05-THAI-PASTE-READY-20261012-S02` | Avril, [Pâte biologique — Cari vert](https://avril.ca/fr/pate-de-cari-vert-bio-93511-1.html) | Québec retailer's Mekhala product page uses `Cari vert`, describes the item as Thai green curry paste, and lists that SKU's ingredients. It establishes local retail wording and a product example, not the formula or name of every brand. |
| `WP05-THAI-PASTE-READY-20261012-S03` | Ricardo, [Pâte de cari vert](https://www.ricardocuisine.com/recettes/10211-pate-de-cari-vert) | Québec recipe publisher uses the exact phrase and treats it as a homemade paste for green curry. The page identifies the content as advertising format; its composition and amounts remain recipe-specific, not a commercial specification. |
| `WP05-THAI-PASTE-READY-20261012-S04` | Office québécois de la langue française, [cari (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8355168/cari) | OQLF accepts `cari`, `carry`, `cary`, and `curry` for the spice-blend term. The definition is not for Thai curry paste, so it supports spelling options only. |
| `WP05-THAI-PASTE-READY-20261012-S05` | Lee Kum Kee, [Thai Sweet Chili Sauce (English)](https://usa.lkk.com/en/products/thai-sweet-chili-sauce) and [Sauce chili douce de type thaïlandais (French)](https://ca.lkk.com/fr-ca/products/thai-style-sweet-chili-sauce) | Manufacturer pages name a bottled Thai-style sauce and list the ingredients/uses of that product line. Product-market formulas and naming are manufacturer-specific; they are not a universal recipe. |
| `WP05-THAI-PASTE-READY-20261012-S06` | Le Poulet du Québec, [Poulet au piment chili doux à la thaïlandaise à la mijoteuse](https://lepoulet.qc.ca/?p=4385) | Québec recipe page uses `sauce chili douce thaï` and lists it in one recipe. This supports local culinary wording; the recipe amount is not a conversion and its wording does not standardize the catalog name. |

## Handoff

This review proposes only two identity-only rows and no recipe links. The Section X checklist remains open. Before any integration, re-read the live package, verify normalized exact-name and picker behavior against the generic and red curry-paste rows, and confirm the proposed aliases remain empty. No tests or emulator checks were run because this is proposal-only work.
