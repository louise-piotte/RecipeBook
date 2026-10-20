# WP02 A7: gluten flour and vital wheat gluten class boundary

- **Reviewed:** 2026-10-13.
- **Status:** Reviewed and integrated on 2026-10-13 as a bounded research-ledger update. The worker proposal itself made no shared-file changes.
- **Scope:** Resolve the remaining A7 question about whether the standardized Canadian `Gluten Flour` class is universally identical to `vital wheat gluten`. The 2026-10-10 review already added `gluten flour` and `farine de gluten` as aliases to the vital-wheat-gluten reference on the strength of an OQLF term pair and a Canadian SKU whose ingredient declaration is vital wheat gluten. This review does not repeat that alias integration; it tests the broader equivalence claim.
- **Proposal-local source IDs:** `WP02-A7-GLUTEN-FLOUR-EQUIVALENCE-20261013-S01` through `S08`. The prefix and filename were checked against the proposal archive and research ledger before drafting.

## Recommendation

**Hold a separate active identity for the wider standardized `Gluten Flour` class, and do not claim that every product sold under `gluten flour / farine de gluten` is compositionally or functionally identical to vital wheat gluten.** Keep the existing identity and the already accepted term aliases as they are. The OQLF term pair and the Canadian/Québec product examples support those search names for specific vital-gluten products; the standards do not establish universal interchangeability between the whole class and the vital form.

Append the bounded finding to the existing `ingredient-ref-vital-wheat-gluten` ledger record. Do not create a second ledger candidate for the already documented term, add a new reference, or broaden the aliases. The open question is class scope, not whether the exact OQLF term pair or the cited Bob's Red Mill product name exists.

## Exact catalog keys and ownership

The read-only snapshot is the split bundled package checked on 2026-10-13: 1,383 ingredient references, 100 ingredient forms, and 114 manifest-listed recipes with 1,123 ingredient rows. Phrase ownership was checked using the normalization in `IngredientSearch.kt` (lowercase, NFKD accent folding, common ligature folding, and punctuation-to-space normalization).

| Normalized key / field | Current exact owner | Recommendation |
|---|---|---|
| `gluten flour` (`aliasesEn`) | `ingredient-ref-vital-wheat-gluten` | Keep the accepted alias; do not treat it as proof that all products in the CFIA class meet the vital-gluten definition. |
| `farine de gluten` (`aliasesFr`) | `ingredient-ref-vital-wheat-gluten` | Keep the accepted alias. OQLF supports the French/English term pair; the broader class remains unresolved. |
| `vital wheat gluten` (`nameEn`) | `ingredient-ref-vital-wheat-gluten` | Keep as the canonical English name. |
| `gluten de froment élastique` (`nameFr`) | `ingredient-ref-vital-wheat-gluten` | Keep as the canonical Québec French name. |
| `gluten de blé vital` (`aliasesFr`) | `ingredient-ref-vital-wheat-gluten` | Keep the Health Canada/OQLF-backed French alias. |
| `high-gluten flour` / `farine à haute teneur en gluten` | `ingredient-ref-high-gluten-flour` | Keep separate. High-gluten flour is not gluten flour or vital wheat gluten. |
| `wheat gluten` / `gluten de blé` | No exact active reference or form owner | Do not add either phrase as a broad alias from this review. |

No active form, legacy-import identity, or distinct ledger candidate has an exact normalized key for `gluten flour` or `farine de gluten`. The existing vital-wheat-gluten ledger record already contains the 2026-10-10 accepted alias decision and records the CFIA class limit. No new candidate ID is proposed.

The current picker has a related phrase overlap: the words `gluten flour` occur consecutively inside the separate display `high-gluten flour`. The search code matches complete word phrases inside a longer term, so an unqualified `gluten flour` query may surface both the high-gluten-flour identity and the vital-wheat-gluten identity. This search overlap is not evidence that the ingredients are the same; this proposal does not change search behavior or add another row.

## Evidence and findings

### Product-class boundary

CFIA standard 12.1.5 defines `Gluten Flour` as food obtained by removing part of the starch from flour. It permits up to 10% moisture and 44% starch on a moisture-free basis. It does not set a minimum protein percentage, a hydration/viscoelastic performance test, or a requirement that the retained gluten be vital. The standard therefore does not, by itself, support mapping every product within that class to vital wheat gluten.

Codex CXS 163-1987, revised in 2001 and listed by Codex as amended in 2022, covers wheat protein products made by separating starch and other non-protein constituents from wheat or wheat flour. It specifically characterizes **vital** wheat gluten by high viscoelasticity when hydrated, separately characterizes devitalized wheat gluten and solubilized wheat proteins, and sets a minimum protein level of 80% on a dry basis for vital and devitalized wheat gluten. Its naming provision uses `vital wheat gluten` or `wheat gluten` for the vital class; it does not establish `gluten flour` as a universal synonym for that more specific functional grade. These differences show that the reviewed standards define different scopes, while not proving that any particular retail product named `gluten flour` falls outside the vital category.

OQLF gives `farine de gluten` as the preferred Québec French term and `gluten flour` as its English equivalent. Its definition describes food obtained by removing part of the starch from whole-wheat flour, and its note says it has a high gluten content. OQLF does not describe the term as vital, nor does it specify the hydrated viscoelastic behavior used to distinguish vital wheat gluten.

### Canadian and Québec product evidence

The Canadian Metro listing for Bob's Red Mill SKU 039978002129 titles the product `Gluten Flour`, gives the 567 g package size, and declares `VITAL WHEAT GLUTEN` as its ingredient. Metro's listing is direct evidence for that named product only; it showed the item out of stock at the selected store when accessed and is not a standard for all products using the same name.

Bob's Red Mill's Canadian French product page names the product `Gluten de blé vital`, declares `Gluten de blé vital` as its ingredient, describes its hydrated elasticity and baking/seitan uses, and shows a package-image label whose accessibility text says `Gluten Flour`. Its reported serving of 1/4 cup (30 g) and product-specific protein values apply only to that company's SKU.

Québec retailer Avril lists that Bob's Red Mill product as `Gluten Wheat Flour` (product 52233); the French description calls it `farine de gluten de blé vital`, and the ingredient statement is `gluten de blé vital`. The page displayed stock at several Québec Avril locations when checked, though retailer inventory varies. A separate Avril `Artisan Tradition Farine de gluten` 1 kg listing was also visible and displayed Québec-store inventory, but it gives no ingredient statement or product specification in the reviewed page. That second listing confirms local use of the short French product name but does not establish its composition or equivalence to the Bob's product.

### Catalog and recipe-corpus audit

The current exact-key owner check found only the existing vital-wheat-gluten row for `gluten flour` and `farine de gluten`; the neighboring high-gluten-flour row owns its own exact qualified English and French display names. No form or legacy candidate claims the proposed terms. The current ledger has one verified `ingredient-ref-vital-wheat-gluten` record and no separate `candidate-gluten-flour` record.

All 114 recipe files listed by the package manifest and all 1,123 ingredient rows were scanned for `gluten flour`, `farine de gluten`, `vital wheat gluten`, `gluten de froment élastique`, `gluten de blé vital`, `wheat gluten`, `gluten de blé`, `high-gluten flour`, `farine à haute teneur en gluten`, and the active vital-wheat-gluten reference ID. **No recipe text, ingredient row, or linked recipe reference matched.** The bundle therefore supplies no recipe-specific demand or usage basis to resolve the class boundary.

## Explicit unsupported fields

- **New identity or alias:** None. Retain the current row only; add no separate `gluten flour` reference and no further aliases.
- **Forms:** None. The cited names are product/class names, not preparation states attached to the active identity.
- **Density and unit mappings:** Keep `defaultDensity: null` and `unitMappings: []`. Bob's 1/4 cup (30 g) nutrition serving is a product-specific labelled serving, not a measured general density or a class-wide mapping.
- **Conversions and yields:** None. The package sizes and Codex/CFIA composition limits are not kitchen conversions or yields.
- **Substitutions:** None. Product use descriptions for baking or seitan do not show that gluten flour products with different functional states can replace each other at any quantity.
- **Recipe links:** None. The bundled corpus has no matching text or active reference link.
- **Composition/function equivalence:** Unsupported for the complete standardized class. Do not infer that all `Gluten Flour` products meet Codex's vital-gluten functionality/composition criteria, or that every product carrying a `gluten flour` label is compositionally distinct from vital wheat gluten.

## Source register

Sources were accessed or rechecked on 2026-10-13. Product-specific numeric values and stock statements below apply only to the named SKU or the retailer's live listing.

| ID | Source | Evidence and limit |
|---|---|---|
| **WP02-A7-GLUTEN-FLOUR-EQUIVALENCE-20261013-S01** | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 12, standard 12.1.5. | Defines Gluten Flour by partial starch removal and limits moisture and starch. It provides no protein-minimum or vital-functionality criterion; it does not prove that a specific product differs from vital wheat gluten. |
| **WP02-A7-GLUTEN-FLOUR-EQUIVALENCE-20261013-S02** | Office québécois de la langue française, [farine de gluten (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8356360/farine-de-gluten). | Gives preferred Québec French `farine de gluten`, English `gluten flour`, and a starch-removal definition. The record does not state that the product is vital or specify hydration performance. |
| **WP02-A7-GLUTEN-FLOUR-EQUIVALENCE-20261013-S03** | Office québécois de la langue française, [gluten de froment élastique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084319/gluten-de-froment-elastique). | Pairs the preferred Québec French term with `vital wheat gluten`; describes the hydrated/rehydrated agglomerating and elastic properties. Terminology definition, not a general retail formula. |
| **WP02-A7-GLUTEN-FLOUR-EQUIVALENCE-20261013-S04** | Codex Alimentarius, [CXS 163-1987, Standard for Wheat Protein Products Including Wheat Gluten](https://www.fao.org/input/download/standards/323/CXS_163e.pdf); [current Codex standards listing](https://www.fao.org/fao-who-codexalimentarius/codex-texts/list-standards/en/?ids=91). | The standard defines vital, devitalized, and solubilized wheat protein classes, differentiates them by hydrated function, and sets composition and labelling requirements. Codex's listing records the standard as amended in 2022; that amendment concerns non-retail-container labelling, not the product-class definitions summarized here. |
| **WP02-A7-GLUTEN-FLOUR-EQUIVALENCE-20261013-S05** | Metro Canada, [Bob's Red Mill Gluten Flour, SKU 039978002129](https://www.metro.ca/en/online-grocery/aisles/pantry/baking-ingredients/flour-baking-essentials/gluten-flour/p/039978002129). | Current Canadian retail listing names the product `Gluten Flour` and lists `VITAL WHEAT GLUTEN` as its ingredient. The observed selected-store state was out of stock; the listing is one product, not evidence for every standardized product. |
| **WP02-A7-GLUTEN-FLOUR-EQUIVALENCE-20261013-S06** | Bob's Red Mill Canada, [Gluten de blé vital](https://www.bobsredmill.ca/produit/vital-wheat-gluten). | Manufacturer's French product page gives the product name and ingredient as `Gluten de blé vital`, describes product-specific hydrated elasticity and uses, and reports a 1/4 cup (30 g) serving. It supports the named SKU, not a universal conversion or equivalence. |
| **WP02-A7-GLUTEN-FLOUR-EQUIVALENCE-20261013-S07** | Avril, [Bob's Red Mill Gluten Wheat Flour, 567 g](https://avril.ca/en/flour-gluten-flour-52233.html). | Québec retailer's page labels the Bob's item `Gluten Wheat Flour`; its French description says `farine de gluten de blé vital` and its ingredient list is `Gluten de blé vital`. It displayed in-store availability at multiple Québec locations when checked; stock is dynamic and the evidence remains SKU-specific. |
| **WP02-A7-GLUTEN-FLOUR-EQUIVALENCE-20261013-S08** | Avril, [Farine de gluten, Artisan Tradition, 1 kg](https://avril.ca/fr/farine-farine-de-gluten.html). | Québec retailer listing confirms the short French product title and displayed store inventory. No ingredient statement or detailed specification was visible on the reviewed page, so it cannot be classified as vital or non-vital from this source. |

## Integration boundary

Keep the active `ingredient-ref-vital-wheat-gluten` values unchanged: `vital wheat gluten / gluten de froment élastique`, French aliases `gluten de blé vital` and `farine de gluten`, English alias `gluten flour`, category `GRAIN_AND_CEREAL`, `defaultDensity: null`, and `unitMappings: []`. Keep `ingredient-ref-high-gluten-flour` separate. The integration appends the no-universal-equivalence finding to the existing vital-wheat-gluten ledger record; no reference, form, measurement, conversion, substitution, or recipe link changed.

## Root review and integration result

Root independently reopened CFIA's current Canadian Food Compositional Standards, OQLF's entries for `farine de gluten` and `gluten de froment élastique`, and FAO's Codex CXS 163-1987 text. CFIA's class definition specifies partial starch removal and moisture/starch limits without a minimum protein or vital-functionality criterion. Codex separately describes vital, devitalized, and solubilized wheat-protein classes. The existing Canadian product example remains evidence for that SKU only.

The research-ledger update reuses the existing CFIA, OQLF, and Metro source IDs already attached to `ingredient-ref-vital-wheat-gluten`; it adds only the new Codex, manufacturer, and retailer sources needed for this boundary review, plus an unresolved decision. The record's measurement and substitution states now reflect the reviewed absence of reusable values. The active references, aliases, forms, recipe links, and numeric catalog fields are unchanged. No tests or emulator checks were run because this batch only changes database JSON and documentation.
