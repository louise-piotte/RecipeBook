# WP02 Section D — Peanut butter chips identity review (R298, 2026-10-16)

- **Status:** Integrated as R298; the legacy candidate was promoted to an active identity, source-specific measurement and substitution findings were recorded, and the existing peanut-butter spread gained the OQLF-preferred plural alias.
- **Target anchor:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section D, the open checklist item beginning “Continue review of chocolate bars, chunks, wafers, fèves, grated/chopped chocolate, and other product forms where relevant”.
- **Candidate:** existing legacy ID `ingredient-ref-peanut-butter-chips`; the active ingredient-reference catalog has no row with this ID or the exact English product name.
- **Proposal-local source IDs:** `WP02-D-PB-CHIPS-R298-20261016-S01` through `S08`. These IDs and the exact URLs were checked against the current proposal/batch archive and research ledger; no collision or prior URL owner was found. Reuse the existing OQLF source `WP03-I-PB-FORMULATION-R213-20261016-S02` rather than issuing a duplicate.

## Recommendation

Promote the legacy candidate as one identity-only baking inclusion:

| Field | Proposal |
|---|---|
| Stable ID | `ingredient-ref-peanut-butter-chips` |
| English name | `peanut butter chips` |
| Québec French name | `brisures au beurre d’arachides` |
| English aliases | none |
| French aliases | `brisures de beurre d’arachides` |
| Category | `CHOCOLATE_AND_CANDY` |

Hershey Canada uses the proposed French display on its current product listing and in French recipes. Its French CHIPITS catalog lists this as a separate 270 g product alongside milk, semisweet, white-creme, dark-chocolate, and butterscotch chips. The category follows the existing baking-inclusion taxonomy (which already includes butterscotch chips); it does not imply that this product contains chocolate.

Keep the candidate separate from the `peanut butter` spread, whole peanuts, semisweet chocolate, and the distinct Mini REESE’S PIECES baking candy. It is a flavored, shaped baking inclusion marketed as peanut-butter chips, not a form of the peanut spread or a chocolate product. The “normalize pure chocolate chips to the matching base chocolate” rule in `AGENTS.md` does not apply to this non-chocolate inclusion. Do not add peanut-butter or chocolate aliases, a brand alias, or a link to either base ingredient.

The French alias is limited to `brisures de beurre d’arachides`, which Hershey uses in its French recipe title/description for this product. Keep the legacy singular phrase `brisures de beurre d’arachide` inactive unless a product source attests it; OQLF's grammatical note for the singular complement alone is not an exact product label.

## Picker projection and related French term

The domain picker searches reference names, aliases, and attached form terms. It normalizes accents and punctuation, prefers complete word phrases, and only falls back to partial matching when no complete phrase exists. A static projection using the current bundled references/forms and that matching behavior gave:

| Query | Current matches | With proposed chip identity |
|---|---:|---:|
| `peanut butter chips` | 0 | 1: `ingredient-ref-peanut-butter-chips` |
| `brisures au beurre d’arachides` | 0 | 1: `ingredient-ref-peanut-butter-chips` |
| `brisures de beurre d’arachides` | 0 | 1: `ingredient-ref-peanut-butter-chips` |
| `beurre d’arachide` (singular complement) | 1: `ingredient-ref-peanut-butter` | 1: `ingredient-ref-peanut-butter` |
| `beurre d’arachides` (plural complement) | 1: `ingredient-ref-vector-peanut-butter-flavour-cereal` | 2: cereal plus the new chips identity |
| `chips` | 6 references | 7 references |

OQLF's existing, already-ledgered entry prefers `beurre d’arachides` for the peanut-butter spread while accepting `d’arachide` in the singular. Because the new display contains the plural phrase, the plural query would otherwise gain the chips item while continuing to omit the spread. For picker safety, consider adding `beurre d’arachides` as an alias on the existing `ingredient-ref-peanut-butter` when integrating this candidate. With that additive alias, the plural query returns the spread, the cereal-flavour product, and the chips. R298 adds `beurre d’arachides` to the existing spread and cites its already-ledgered source `WP03-I-PB-FORMULATION-R213-20261016-S02`.

The broader English query `peanut butter` currently returns the spread and Vector cereal; the proposed display adds the chips result. The French `beurre d’arachide` singular query remains on the spread because the proposed French name uses the plural. Do not add aliases such as `Reese's Pieces` or generic `baking chips`; they would cross product boundaries.

## Recipe demand

The bundled library currently has 114 recipe files and 1,123 ingredient rows. A case-insensitive scan of full recipe ingredient-line JSON found no exact candidate ID, `peanut butter chips`, `peanut-butter chips`, or French `brisures` phrase, so there is no bundled recipe to relink. Several current Hershey Canada recipes explicitly use the product, including the French S’mores cookie and signature fondue recipes. This external recipe usage supports that the product is a real baking ingredient; it is not bundled-library demand and creates no RecipeBook recipe link.

## Forms, amounts, conversions, and substitutions

- Add no ingredient forms. Hershey recipes describe melting these chips as a recipe step; without bundled lines that name a melted form, this preparation does not justify a globally selectable form.
- Add no `defaultDensity`, unit mapping, package-yield mapping, or general cup-to-gram conversion. Hershey's French S’mores cookie formula lists `1 3/4 tasse (300 g)` of these chips. That is one paired portion in that specific formula, not a reusable density. The same current 270 g package is a separate package-size observation, not a portion conversion.
- Hershey's French fondue recipe lists `1 1/2 tasse (375 mL)` of peanut-butter chips and the same volume of milk-chocolate and dark-chocolate chips, places each type in a separate bowl, and makes separate fondues. This is a volume-only recipe portion and evidence that the flavors remain distinct; it gives no mass pairing or interchangeability.
- Hershey's French fudge-muffin recipe lists `1 tasse (250 mL)` of the peanut-butter chips and its indexed variation says to replace them with pure semisweet chocolate chips in that specific muffin formula. The direct page fetch returned a cache miss, so the substitution is recorded here only as the current indexed manufacturer recipe text and should be rechecked before any future rule decision. It supports no general peanut-butter-chip-to-chocolate substitution.
- Hershey's English Peanut Butter Chocolate Chip Cookies recipe lists `1 1/2 cups` of pure semisweet chips **or** peanut-butter chips at `375 mL`, but its directions then say to stir in semisweet chips and fold in melted peanut-butter chips. Since the directions conflict with the ingredient-line alternative, do not treat that line as a supported substitution even for that recipe.
- No global same-ingredient form conversion, contextual substitution rule, or line-level substitution is proposed. Preserve the exact quantities and alternatives of any future recipe record that explicitly names this product.

## Source register

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP02-D-PB-CHIPS-R298-20261016-S01` | Hershey Canada, [HERSHEY'S CHIPITS REESE'S Peanut Butter Chips, 270 g](https://www.hersheyland.ca/en_ca/products/hersheys-chipits-reeses-peanut-butter-chips-270-g-bag.html), product title, current package size, and product details. | Current English product identity and baking use. Search-indexed result exposed the product details; direct fetch returned HTTP 406. Use the result for the displayed SKU and name, not for an ingredient declaration. |
| `WP02-D-PB-CHIPS-R298-20261016-S02` | Hershey Canada, [Brisures au beurre d’arachides HERSHEY'S CHIPITS REESE'S, 270 g](https://www.hersheyland.ca/fr_ca/Produits/brisures-au-beurre-darachides-hersheys-chipits-reeses-sac-de-270-g.html.html), French product title, package size, and details. | Product-matched Québec French display. Search-indexed result exposed the title/details; direct fetch returned a cache miss. |
| `WP02-D-PB-CHIPS-R298-20261016-S03` | Hershey Canada, [Brisures de cuisson HERSHEY’S CHIPITS et recettes](https://www.hersheyland.ca/fr_ca/chipits), product list. | Current French catalog separately lists chocolate, butterscotch, and peanut-butter chip products and identifies the peanut-butter product as a 270 g bag. Opened and checked 2026-10-16. |
| `WP02-D-PB-CHIPS-R298-20261016-S04` | Hershey Canada, [Biscuits S’mores moelleux au beurre d’arachides](https://www.hersheyland.ca/fr_ca/Recettes/biscuits-smores-moelleux-au-beurre-d-arachides.html), ingredients and steps 2–3. | Uses the exact French product name at `1 3/4 tasse (300 g)` and melts it as a step before incorporating; one formula-specific amount/preparation, not a reusable conversion or form. Opened and checked 2026-10-16. |
| `WP02-D-PB-CHIPS-R298-20261016-S05` | Hershey Canada, [Fondue Signature HERSHEY'S CHIPITS](https://www.hersheyland.ca/fr_ca/recettes/fondue-signature-hersheys-chipits.html), ingredients and steps 1–2. | Lists `1 1/2 tasse (375 mL)` for each of milk-chocolate, peanut-butter, and dark-chocolate chips; melts each type separately. Volume-only recipe portions, not measured mass or substitution evidence. Opened and checked 2026-10-16. |
| `WP02-D-PB-CHIPS-R298-20261016-S06` | Hershey Canada, [Muffins au fudge et aux brisures de beurre d’arachides](https://www.hersheyland.ca/fr_ca/Recettes/muffins-au-fudge-et-aux-brisures-de-beurre-d-arachides.html), ingredient list and “Variation”. | Indexed manufacturer text lists `1 tasse (250 mL)` and a formula-specific replacement with pure semisweet chips. Direct fetch returned a cache miss; treat as a recheck lead, not a general substitution rule. |
| `WP02-D-PB-CHIPS-R298-20261016-S07` | Hershey Canada, [Peanut Butter Chocolate Chip Cookies Recipe](https://www.hersheyland.ca/en_ca/recipes/peanut-butter-chocolate-chip-cookies-recipe.html), ingredients and steps 1–3. | Lists `1 3/4 cups (300 g)` peanut-butter chips, then `1 1/2 cups` pure semisweet or peanut-butter chips (`375 mL`); directions use semisweet chips and melted peanut-butter chips. The ingredient-line alternative conflicts with the directions, so it supports no substitution. Opened and checked 2026-10-16. |
| `WP02-D-PB-CHIPS-R298-20261016-S08` | Hershey Canada, [Morceaux de friandises au beurre d’arachides HERSHEY'S CHIPITS MINI REESE'S PIECES pour cuisson, 270 g](https://www.hersheyland.ca/fr_ca/produits/morceaux-de-friandises-au-beurre-darachides-hersheys-chipits-mini-reeses-pieces-pour-cuisson-sac-de-270-g.html), product title and description. | Identifies a separate miniature candy-shell baking inclusion made from REESE’S PIECES. Search-indexed product listing checked 2026-10-16; direct fetch returned a cache miss. Use only to preserve the product boundary, not as evidence about the peanut-butter-chip formula. |

**Reused terminology source:** `WP03-I-PB-FORMULATION-R213-20261016-S02`, OQLF [beurre d’arachides (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360854/beurre-darachides), last updated 2023. It defines the spread as roasted, ground peanuts; prefers `beurre d’arachides`; allows the noun complement in the singular; and discourages `beurre de pinotte` / `beurre de peanut`. This supports the existing spread name and the picker safeguard above. It does not name peanut-butter chips.

## Verification

- Read the current WP02 Section D checklist, project requirements, roadmap, legacy candidate, active ingredient references/forms, research ledger, and proposal/batch archive. Confirmed the target checklist item remains open and the peanut-butter-chip legacy ID is not active.
- Checked the proposal filename, R298 source-ID prefix, and each proposed source URL against the current proposal/batch archive and research ledger. No ownership collision was found; the OQLF URL is already owned by the cited R213 source and is reused without a duplicate ID.
- At proposal time, projected picker results over 1,665 references and 127 forms; scanned all 114 bundled recipe files / 1,123 ingredient rows for exact English/French demand and the candidate ID.
- At proposal time no software tests, builds, emulator checks, shared data updates, or ledger writes were performed. The R298 integration is recorded below.


## Integration record — accepted as R298

Promoted the existing legacy ID ingredient-ref-peanut-butter-chips to identity-only peanut butter chips / brisures au beurre d’arachides in CHOCOLATE_AND_CANDY. Added only the French alias brisures de beurre d’arachides; kept it distinct from chocolate, peanut-butter spread, peanuts, and Mini REESE'S PIECES. Removed the promoted row from legacy-import-identities.v1.json.

Added a source-specific 270 g package observation and the two manufacturer-recipe paired portions of 1 3/4 cup/tasse = 300 g. No reusable density, unit mapping, cup conversion, form, package-yield mapping, or recipe link was added. The ledger records no supported active substitution; the muffin variation remains a recheck lead, and the English cookie ingredient-line alternative conflicts with its directions.

Added the OQLF-preferred plural beurre d’arachides to the existing peanut-butter spread aliases, preserving its current singular display. The WP02 Section D and WP03 Section I plan records and roadmap now link this follow-up. Static data checks are in the integration README; no software tests, builds, or emulator runs were performed because this update changes bundled database JSON and related catalog data.
