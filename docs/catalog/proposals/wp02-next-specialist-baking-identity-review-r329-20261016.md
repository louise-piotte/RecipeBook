# WP02 Section D — dark chocolate percentage qualifier review (R329, 2026-10-16)

- **Scope:** one open Section D checkpoint: preserve documented cocoa-percentage qualifiers without making a generic chocolate identity imply a fixed percentage.
- **Target:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section D, “Preserve composition/cocoa-percentage qualifiers where documented and useful rather than inventing a fixed composition for generic names.”
- **Status:** proposal only. No shared catalog, ledger, recipe, checklist, roadmap, or generated file changed.

## Recommendation

**No new identity, form, measure, or substitution rule.** Keep one generic `dark chocolate / chocolat noir` reference. Correct the current French canonical display from `chocolat 70%` to OQLF’s generic `chocolat noir`, and remove the now-duplicate `chocolat noir` French alias. Do not keep `chocolat 70%` as a catalog alias: the available attestation is one recipe-specific product qualifier, not a general synonym for dark chocolate.

| Field | Proposed existing-reference state |
|---|---|
| ID | `ingredient-ref-dark-chocolate` (unchanged) |
| English display | `dark chocolate` (unchanged) |
| Québec French display | `chocolat noir` (promote the currently supported French alias) |
| Aliases | Remove the duplicate French `chocolat noir`; retain the current English `dark chocolate chips` search term with the already-attached chips form; do not retain `chocolat 70%` |
| Category | `CHOCOLATE_AND_CANDY` (unchanged) |

Keep the 70% qualifier on the recipe line where it is documented. Recipe 102, ingredient `bd3f9152-5ea3-44c3-ad79-8f4d7624f07d-ingredient-1`, already stores `70 %, haché / 70%, chopped` in its bilingual preparation field beside the original text `225 g 70% dark chocolate, chopped`. Do not create a `70% dark chocolate` identity or form, move the percentage into the generic reference, or infer a fixed composition for other dark-chocolate lines.

## Live catalog, prior work, and demand audit

- The active reference is `ingredient-ref-dark-chocolate`, currently `dark chocolate / chocolat 70%`, with French alias `chocolat noir` and English alias `dark chocolate chips`. Its density is null and its unit mappings are empty. The attached `ingredient-form-dark-chocolate-chips` is the one reviewed form; its density is also null.
- The matching ledger record currently says `identityState: unreviewed`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: not_yet_researched`. It has no sources and preserves the unresolved removal of earlier unsupported density/mapping values. This proposal supplies naming evidence only; it does not reopen measurements.
- No dark-chocolate identity is present in the legacy-import candidate file. Existing Section D chocolate-form and cocoa-product reviews cover chips/melted forms, cocoa products, chocolate shavings, and chopped preparation lines; none reviewed the generic French display against the specific 70% recipe wording. The 2026-10-12 confectionery/fruit sweep expressly treated the recipe 102 wording as a chopped preparation, not a new purchasable product form.
- The manifest contains 114 recipes and 1,123 ingredient rows. Five rows link to `ingredient-ref-dark-chocolate`: 031#2 `100 g dark chocolate`; 040#3 `2 cups dark chocolate chips`; 067#1 `1 cup dark chocolate chips`; 070#12 `35 g dark chocolate`; and 102#1 `225 g 70% dark chocolate, chopped`. Only recipe 102 explicitly qualifies the product at 70%. The other four rows do not establish a percentage.
- Recipe 102’s linked RICARDO card gives `225 g (8 oz) de chocolat à 70% de cacao, haché` and about 32 bites. This is one recipe’s amount and yield, not a chocolate density, a general volume measure, or a universal specification. The source-created card is marked as advertising content; it is used here only for the exact recipe wording and amount.
- Recipe 031’s source allows its chocolate-date recipe to use the author’s preferred chocolate, including several chocolate types and chips. This is a recipe-scoped option only. It does not establish a global dark-chocolate substitution rule or erase the specific percentage on recipe 102.

## Exact picker projection

The projection uses the current domain picker’s `normalizeIngredientSearchKey` and `IngredientReferenceSearchIndex` behavior against all 1,679 references and 127 forms: accent/compatibility folding, punctuation-to-space, complete word-phrase matches first, substring fallback only when no phrase matches, and exact form phrases narrowing to their base reference. The proposed display change was simulated without changing the live files.

| Query | Current projection | After proposed display repair |
|---|---|---|
| `dark chocolate` | 1: `ingredient-ref-dark-chocolate` | 1: same reference |
| `chocolat noir` | 1: `ingredient-ref-dark-chocolate` | 1: same reference; canonical French display |
| `chocolat 70%` | 1: same reference via its current display | 0: this recipe-specific shorthand is not retained as a generic alias |
| `chocolat à 70% de cacao` | 0 | 0; not a generic identity term or alias |
| `70% dark chocolate` | 0 | 0; percentage is not part of picker identity terms |
| `dark chocolate chips` | 1: same reference, dark-chocolate-chips form hint | 1: same reference and form hint |
| `pépites de chocolat noir` | 1: same reference, dark-chocolate-chips form hint | 1: same reference and form hint |

The display repair changes no identity ownership for generic `dark chocolate`, `chocolat noir`, or the explicit chips form. It intentionally removes the misleading generic result for the shorthand query `chocolat 70%`; the recipe retains its exact percentage in its preparation text. The recommendation adds no aliases for dark, bittersweet, semisweet, unsweetened, cocoa, or compound products.

## Naming and product boundary

Use English `dark chocolate` and Québec French `chocolat noir`. The OQLF GDT explicitly pairs those terms. CFIA lists `dark chocolate` as a standardized common name and treats a factual label statement such as `X% cacao` as a separate percentage claim. **Inference:** because the Québec terminology source gives the generic name without a percentage, the CFIA guidance separates common name from the factual percent claim, and the linked RICARDO card attaches 70% to one recipe line, the percentage belongs to that documented product/recipe instance rather than the generic identity.

Keep the dark-chocolate identity distinct from the existing bittersweet, semisweet, milk, white, and unsweetened-chocolate references. The CFIA standard grouping of several names under one composition section is not an alias list. Keep chocolate chips as their existing form, cocoa powder/mass/nibs/butter as their separate product identities, and compound coating separate from real chocolate.

No current evidence supports a reusable cup-to-mass measure, density, unit mapping, or general substitution for the generic identity. Keep `defaultDensity: null`, `unitMappings: []`, and the existing dark-chocolate-chips form density null. The 225 g (8 oz) amount is recipe-specific. Recipe 031’s author-permitted choices stay attached to that formula; add no global or form-level rule.

## Source register and ownership

New source IDs below use the checked R329 namespace. The CFIA labelling URL has existing source owners `WP02-D-CHOC-20261009-S09` and `WP-D-S02-CFIA-CHOCOLATE`, but their locators cover other chocolate-label claims; the R329 ID below records the distinct common-name/percentage-claim locator. The Ayeh URL is already ledgered as `WP03-HI-GAP-20261011-S05` and `WP04-MEDJOOL-COUNT-20261010-S01`; reuse the former for its chocolate-date ingredient note. The OQLF URL has no prior source entry. RICARDO’s URL appears as recipe 102’s bundled source but has no matching catalog-ledger source entry. New R329 source IDs were checked against the current proposal and ledger archive.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP02-D-DARK-CHOCOLATE-R329-20261016-S01` | Office québécois de la langue française, [chocolat noir (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18052604/chocolat-noir), preferred term and English translation. | Directly supports Québec French `chocolat noir` and English `dark chocolate`. The terminology entry was last updated in 1991; it is a naming source, not a composition or measure source. |
| `WP02-D-DARK-CHOCOLATE-R329-20261016-S02` | CFIA, [Labelling requirements for confectionery, chocolate and snack food products](https://inspection.canada.ca/en/food-labels/labelling/industry/confectionery-chocolate-and-snacks), standardized common-name section and factual percentage-statement note. | Lists `dark chocolate` as a standardized common name and says a cocoa-percentage statement must be factual. It supports the product class and percentage-as-claim boundary, not any particular recipe’s chosen percentage. Current page was modified 2025-01-15. |
| `WP02-D-DARK-CHOCOLATE-R329-20261016-S03` | RICARDO, [Saucissons de chocolat](https://www.ricardocuisine.com/recettes/3769-saucissons-de-chocolat), ingredient list and yield. | Lists 225 g (8 oz) of chocolate at 70% cacao, chopped, and about 32 bites. One source formula; it does not establish a generic dark-chocolate percentage or a volume measure. The page identifies the recipe content as created for an advertiser. |
| **Reuse `WP03-HI-GAP-20261011-S05`** | Ayeh Manfre, Cooking With Ayeh, [Chocolate Dates](https://cookingwithayeh.com/chocolate-dates/), chocolate ingredient note and recipe card. | Author says this particular date-coating recipe can use preferred chocolate and names lower-percentage dark, semisweet, milk, white, and chips as options; recipe card lists 100 g. This is contextual advice for that formula, not a general conversion or catalog-wide substitution. |

## Evidence gaps and bounded disposition

- The evidence establishes the generic bilingual name and confirms that the 70% figure belongs to one recipe line. It does not support a separate 70% ingredient identity, a product form, or an identity-wide composition value.
- No source reviewed supplies a reusable measure or density for dark chocolate. Preserve the current blocked measurement state until candidate-specific, method-described evidence supports a value.
- RICARDO’s source card is promotional content, so its ingredient amount is retained only for recipe 102; it is not a neutral product standard. The Ayeh page’s alternatives are author guidance for recipe 031 only.
- This review leaves the broader Section D chocolate-bar/chunk/wafer/fève and fruit-product checklist open. It makes no claim about a product form for the other four dark-chocolate rows.

## Verification

- Read the live Section D plan, active references/forms, legacy candidates, dark-chocolate ledger record, prior Section D proposals/integration notes, and the manifest-listed recipe corpus.
- Checked all 114 bundled recipes / 1,123 ingredient rows for current demand and projected exact picker matches with the domain phrase-first rules.
- Checked proposed source IDs and ledger URL ownership. Reused the existing Ayeh source ID; the R329 OQLF, CFIA, and RICARDO IDs are new to the proposal/ledger archive. The CFIA ID is for a distinct page locator, with existing same-page owners named above.
- No tests, builds, emulator checks, shared data updates, or ledger writes were performed; this is a proposal-only documentation task.
