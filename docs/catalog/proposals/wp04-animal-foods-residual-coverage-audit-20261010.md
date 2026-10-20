# WP04 Proposal: Residual Animal-Food Coverage and Count/Edible-Portion Fixtures

**Review date:** 2026-10-10
**Status:** Proposal only; no shared catalog, ledger, recipe, plan, roadmap, code, or test files changed.
**Scope:** Residual WP04 O–R recipe-demand audit, with priority on specific uncovered protein/seafood/dairy products and the still-open count, edible-portion, and composition-sensitive fixture requirement.

## Disposition

Advance one narrow, identity-only generic beef candidate for the exact unlinked `400 g beef` line in Beef Stroganov. Canadian and Québec primary terminology sources support a generic culinary meat identity `beef / bœuf`; they also distinguish it from ground beef and named cuts. Keep the candidate separate from ground beef, beef stock, stew meat, veal, bison, and all other species and cuts. The active picker already returns ground beef and beef stock for the broad queries `beef` and `bœuf`; adding the candidate will make those broad queries show three distinct rows. This is a query-result overlap, not an exact normalized-key collision, and needs explicit picker QA if the candidate is integrated.

No additional recipe-backed seafood or dairy identity is advanced by this residual pass. The specific seafood requests in the corpus already point to active identities; generic or product-ambiguous lines stay unresolved. Common dairy identities are also present for the specific recipe terms; the remaining unlinked rows are alternatives, generic composition terms, or existing identities needing row-level linkage rather than new catalog entries.

The plan’s WP04 count/edible-portion/composition-sensitive fixture checkbox remains open. Existing source-qualified chicken-egg observations and duck/quail portions are ledger evidence, not active mappings or a tested fixture suite. The fixture recommendations below deliberately test unavailable and non-equivalent cases. They do not authorize a density, count conversion, edible-yield factor, or substitution.

## Live snapshot and audit method

Re-read from the current manifest-listed package and catalog on 2026-10-10. Hashes are SHA-256 over exact file bytes. The recipe digest hashes sorted manifest-relative recipe paths, NUL, exact file bytes, NUL.

| Artifact | Current state | SHA-256 / digest |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 751 references | `801584a93190b050d7c6cc9736f520520e6fb8d0765a034f952dac8c2368b4c5` |
| `ingredient-forms.v1.json` | 34 forms | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `legacy-import-identities.v1.json` | 82 candidates | `60d389975134f8d31c57c66caa6375b4466c4c9614d399617a64365878d6aa5f` |
| `research-ledger.v1.json` | 956 records / 1,932 source entries / 1,565 source IDs | `27ac5cccde7cb0234e5b386dcd18ecc0759eea6bbfec5f325ec57ba389042191` |
| Bundled manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipes | 114 files / 1,123 ingredient rows | `0ad0509ff9a3df3c7f3899e3304f94c9ac814efa347fe1cdface1d5883304b1d` |

The corpus audit read each ingredient line’s `originalText`, `ingredientName`, `ingredientRefId`, amount, unit, and preparation/notes; then reconciled exact terms against the active reference names/aliases, forms, legacy candidates, and WP04 proposal/batch material. Search-key checks follow `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` (lowercase/NFKD, fold common ligatures, remove combining marks, normalize punctuation and spaces). Picker behavior below was replayed against the production search algorithm and current reference terms; it is a code-path check, not emulator QA.

## Proposed identity

| Stable ID | Category | English display | fr-CA display | EN aliases | FR aliases | Scope |
| --- | --- | --- | --- | --- | --- | --- |
| `ingredient-ref-beef` | `PROTEIN` | `beef` | `bœuf` | none | none | Generic culinary beef meat with no cut, fat class, preservation state, or preparation state implied. |

The ID and exact normalized names `beef` / `bœuf` are absent from active references, forms, legacy candidates, and the current ledger. No exact normalized-key collision was found. The OQLF’s food-domain `bœuf` entry pairs the term with English `beef` and describes it as a general butchery term; its `viande de bœuf` entry calls that phrase a general butchery term as well. CFIA’s bilingual beef-cuts manual directly pairs `BEEF / BŒUF` and defines the product as meat from qualifying bovine carcasses [S01–S03].

The active `ingredient-ref-ground-beef` is a separate product. Its ledger already records OQLF’s narrower `bœuf haché / ground beef` definition (`WP04-S39`) and OQLF’s generic butchery distinction for `viande de bœuf` (`WP04-S45`). The earlier review explicitly removed bare `bœuf` as a ground-beef alias. Do not restore that alias or merge the two records. Do not add `ground beef`, `bœuf haché`, `beef stock/broth`, `beef cubes/stewing beef`, `veal/veau`, bison, pork, poultry, or any named cut as aliases of generic beef.

### Exact recipe demand

| Recipe line | Current source text | Current link | Proposed handling |
| --- | --- | --- | --- |
| `015#1` — Beef Stroganov | `400 g beef` | none | If the identity is accepted, link this exact line to `ingredient-ref-beef`; retain the source amount as 400 g. The source text specifies no cut, fat class, or preservation state. |
| `090#1` — African Peanut Stew | `454 g stew meat`; note: `chicken, beef, or pork` | `ingredient-ref-stew-meat` | Keep linked to `stew meat`; do not relink or create a beef match. The note lists source-level choices in this one recipe but does not define a cross-species catalog identity or substitution rule. |

The proposed identity does not authorize inference of a cut from “Beef Stroganov,” the recipe title, or a cooking method. If the recipe author’s intended cut matters later, keep that as unresolved recipe-source detail rather than generalizing it to the catalog.

## Picker behavior and boundary checks

Current production search is phrase containment, not exact-key ranking. Replaying its current reference terms gives:

| Query | Current results relevant to this boundary | Results after adding the proposed `beef / bœuf` row |
| --- | --- | --- |
| `beef` | `ingredient-ref-ground-beef` / ground beef; `ingredient-ref-beef-stock` / beef stock | Those two plus `ingredient-ref-beef` / beef |
| `bœuf` | `ingredient-ref-ground-beef` / ground beef; `ingredient-ref-beef-stock` / beef stock | Those two plus `ingredient-ref-beef` / bœuf |
| `ground beef` | ground beef only | ground beef only |
| `bœuf haché` | ground beef only | ground beef only |
| `lean ground beef` | no result | no result |

The same overlap occurs on the current catalog: a bare species/product token already returns beef stock and ground beef. The proposal increases that broad result set by one; it does not create an exact alias collision. A full French phrase such as `viande de bœuf` is not currently a term on either active result. If the integration chooses that as the French display instead of `bœuf`, the full phrase is more discriminating, while bare `bœuf` will still find all three. Record this picker behavior as an integration QA gate; do not solve it by adding the broad `bœuf` alias to the ground-beef row or by turning `beef` into a ground-beef synonym.

Other relevant exact-key checks:

- `ingredient-ref-beef` is absent from the active catalog, legacy candidates, and ledger record IDs.
- The active `ingredient-ref-ground-beef` remains at `ground beef / bœuf haché`, with no bare `beef` or `bœuf` alias.
- Existing beef stock is a `STOCK_AND_BROTH` reference with `beef broth` as an EN alias. The corpus’ unlinked `beef broth` line is therefore a stale/unlinked existing-identity issue, not demand for a beef identity; keep it outside this WP04 proposal.
- The current `ingredient-ref-stew-meat` row is not evidence that generic `beef` and “stew meat” are the same product.

## Recipe-corpus coverage: hits, misses, and holds

The active recipe-linked high-demand animal references include 48 whole-egg rows, 8 egg-white rows, 6 egg-yolk rows, 33 milk rows, 27 heavy-cream rows, 6 buttermilk rows, 4 Greek-style-yogurt rows, 3 ground-beef rows, 3 chicken-breast rows, and several one-to-three-row pork, fish, and cheese identities. Category totals are 46 `PROTEIN`, 15 `DAIRY_AND_ALTERNATIVE`, 9 `CHEESE`, and 5 `EGG` references. Counts are ingredient rows, not recipe counts.

| Corpus finding | Exact demand / count | Residual disposition |
| --- | --- | --- |
| Generic beef | One unlinked direct line: `015#1`, 400 g | Advance only `ingredient-ref-beef` above. |
| Ground beef | Three linked lines | Keep existing ground-beef identity and source-reviewed alias boundary. No generic-beef alias or fat-class form is implied. |
| Chicken breast | Three linked lines; recipe `087#1` says `2 chicken breasts` | No new identity. A source serving amount is not a per-breast weight; see measurement fixture section. |
| Generic cooked meat or seafood | `093#4`, “Cooked meat or seafood, to taste”; no quantity/unit | Hold as a recipe option with no specific species/product. It is not evidence for a new catalog identity or substitution. |
| Seafood | Linked recipe-specific calamari, jumbo-lump crab, salmon fillets, and tuna identities; no unlinked exact shrimp/prawn, mollusk, roe, or generic fish product line | No additional seafood identity is advanced. Existing WP04 proposals document no-demand holds for fresh shrimp/prawn, mollusks, roe, and several regional products. The single `1 tuna steak` count remains piece-specific and has no source mass. |
| Generic cheese | `027#5`, 2 cups “shredded cheese,” divided | Hold: no species, cheese type, blend formula, moisture/fat class, or melt function. Do not alias to cheddar or any other cheese. |
| Generic cream | `058#15`, 90 ml “cream”; legacy candidate `ingredient-ref-cream` remains unreviewed | Hold: no fat percentage or cooking/whipping function. Do not merge with heavy cream, 15% cooking cream, half-and-half, or crème fraîche. |
| Existing egg-yolk identity, unlinked rows | `057#8` (3 large egg yolks) and `072#11` (1 egg yolk) | No new identity. If exact recipe relinking is in scope, use existing `ingredient-ref-egg-yolk`; do not invent a measure from the unit text. |
| Explicit alternative dairy lines | `008#13` whole milk or heavy cream; `049#10` heavy cream or buttermilk; `051#9` sour cream or plain yogurt | Preserve as source-line alternatives. The choices do not make their products aliases or a global substitution. The WP08 sour-cream/yogurt review remains evidence-only for scoped contexts. |
| Plant proteins / dairy alternatives | No specific tofu, tempeh, seitan, soy milk, oat milk, almond milk, or other alternative-protein line in the 1,123 rows | No new identity or substitute relation from this corpus. Existing relevant legacy candidates remain inactive. |

The WP04 plan remains open for broader beef/veal and other meat cuts, offal, sausages, fish, dairy, cheeses, and plant-protein coverage. This packet only closes the exact generic-beef recipe miss if approved; it does not claim broad animal-food completeness.

## Count, edible-portion, and composition-sensitive fixture recommendations

Plan WP04 requires count, edible-portion, and composition-sensitive fixtures; plan §07 separately requires count, edible portion, cooking yield, and density to remain distinct. The current active catalog deliberately contains no egg density or egg unit mapping. The ledger currently holds 23 source-qualified chicken-egg count-to-edible-mass observations (13 whole egg, 5 white, 5 yolk) across the WP07 records. None is an active conversion. The prior WP04 duck/quail review also retains its USDA observations as source-specific edible portions: 70 g per raw fresh duck egg and 9.0 g per raw fresh quail egg, not shell-on weights or chicken-egg ratios [WP04-EGG-S07–S08].

Recommended later test fixture cases; not implemented or run in this proposal:

1. **Large chicken egg count vs shell-on grade and edible portion.** Health Canada CNF code 125 publishes 52.7 g for one large raw whole chicken egg and 105.4 g for two large eggs, under a food record with 12% total refuse. CNF’s user guide says household portion weights represent edible food without refuse. USDA SR28 separately publishes 50 g for one large raw whole egg. CFIA’s Canadian shell-egg Large threshold is at least 56 g shell-on. Preserve these as distinct source-qualified observations; do not average them, use the shell-on grade as edible mass, or activate a generic count-to-mass rule [WP07-EGG-20261010-S01, S04–S05, S07].
2. **Egg-part and recipe-specific boundary.** CNF code 126 gives 33.0 g for one large raw egg white; code 127 gives 16.1 g for one large raw yolk, 25.0 g for two unqualified yolks, and 68.0 g for four unqualified yolks. USDA SR28 large white/yolk observations are 33/17 g. The recipe source for `003#4` separately specifies two large egg whites (60 g). Preserve part, source, qualifier, and recipe basis; do not derive a white/yolk split from a whole egg, scale the unqualified CNF yolk portions from the one-large-yolk value, or treat 60 g as a universal white mapping [WP07-EGG-20261010-S02–S06, S09].
3. **Chicken breast piece count vs edible serving.** Recipe `087#1` contains `2 chicken breasts` as a count. Health Canada CNF code 841 describes raw, boneless, skinless chicken-breast meat, with 100 g edible portion and one 90 g Food Guide serving, and no refuse. It has no “one breast” weight. Keep two breasts as count/unknown mass; do not turn the 90 g serving into a piece weight or generalize the zero-refuse basis to skin-on or bone-in chicken [S06].
4. **Other species’ eggs are not chicken conversion factors.** Keep the cited duck and quail edible portions (70 g and 9.0 g respectively) attached to their own species/raw-food records and USDA source basis. Assert no chicken ↔ duck/quail count substitution, no shell-on mass, and no density from these portions [WP04-EGG-S07–S08].
5. **Ground-beef composition classes.** CFIA states maximum fat contents of 30% for regular ground meat, 23% medium, 17% lean, and 10% extra lean; the standard’s common name also identifies species or cut. These are regulatory upper bounds, not exact composition values or recipe conversion factors. The corpus has three ground-beef rows: recipes 034 and 074 are unqualified, while Shepherd's Pie 078#3 says `lean ground beef` and its linked source specifies `90% lean ground beef -or ground lamb`. That recipe wording is not shown to match a Canadian standardized common-name class or a verified composition percentage; see `wp04-ground-beef-90-percent-lean-line-followup-20261010.md`. Fixture assertions should keep generic beef, ground beef, composition-qualified ground beef, lean ground turkey, and non-ground cuts distinct; do not infer a 10% fat value or invent four new identities or forms [S04–S05].
6. **Unweighted fish piece.** Recipe `111#1` says `1 tuna steak` with a count unit and no weight. Preserve the count; do not import a generic steak weight from another species, cut, market, or source portion.

These fixtures can assert that original count quantities survive, unsupported mass output remains unavailable, edible and as-purchased bases stay distinct, source-conflicting portions are not collapsed, and meaningful composition terms are not discarded. Because the current catalog mapping fields do not encode the required source/market/size/edible-basis qualifiers, the source values stay ledger-only unless a future model can preserve them end to end.

## Measurement and substitution disposition

### Measurement

- Proposed beef identity: `defaultDensity: null`, `unitMappings: []`, no form, package amount, count weight, edible-portion yield, cooking yield, or numeric conversion.
- The only direct recipe demand is already 400 g, a mass quantity; no conversion is needed for that line.
- No source reviewed here gives an exact cut/market/preparation-specific mass-volume measure or count weight for generic beef. CNF portions for named chicken/egg foods remain source portions, not generic protein values.
- The CNF egg values above remain ledger evidence. CNF’s whole-egg refuse percentage is not a universal shell fraction. The CNF chicken-breast food-guide serving is not a one-piece measure.

### Substitution

- No global or contextual substitution rule is proposed for beef ↔ ground beef, beef ↔ another species, generic beef ↔ any cut, or any beef ↔ seafood/dairy alternative.
- The `chicken, beef, or pork` note on the single stew-meat recipe line is recipe-specific option text. It supplies no normalized amount relationship, test method, dish-wide context, or evidence that all cuts/processing states can replace one another.
- CFIA ground-meat composition limits distinguish products; they do not establish recipe replacement ratios, equivalent cooking results, or a safe cut substitution. Count-to-edible-mass observations for eggs likewise do not support egg-species substitution.
- No reviewed source provides a qualified reusable substitution for the proposed generic-beef identity. If the row is integrated, keep its substitution research state `not_yet_researched`; do not mark `researched_no_supported_substitute` from this bounded coverage audit.

## Source manifest

All newly accessed sources below were opened on **2026-10-10**. Existing source IDs are reused where the live ledger already holds the source.

| ID | Source and direct URL | Evidence used and limits |
| --- | --- | --- |
| **WP04-RESIDUAL-20261010-S01** | OQLF GDT, [bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434373/boeuf) | Food domain `viande de bœuf`; English term `beef`; notes that `bœuf` is a general butchery term. Naming evidence only. |
| **WP04-RESIDUAL-20261010-S02** | OQLF GDT, [viande de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434368/viande-de-boeuf) | Defines beef meat and explicitly says the French term is a general butchery term. The OQLF English rendering is `beef meat`; it does not justify `bœuf` as an alias on ground beef. |
| **WP04-RESIDUAL-20261010-S03** | CFIA, [Beef / Bœuf — Meat-cut nomenclature and description](https://inspection.canada.ca/DAM/DAM-food-aliments/STAGING/text-texte/meat_labelling_cutman_beef_1348582087107_eng.pdf) and [French PDF](https://inspection.canada.ca/DAM/DAM-food-aliments/STAGING/text-texte/meat_labelling_cutman_beef_1348582087107_fra.pdf), §1 | Bilingual title and paired definition: beef/bœuf is meat from dressed bovine carcasses meeting the manual’s warm-weight threshold. The manual separately enumerates cuts. It is a source-supported identity boundary, not a recipe-specific cut or portion source. |
| **WP04-S39** (existing) | OQLF GDT, [bœuf haché](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8888340/boeuf-hache) | Directly pairs `bœuf haché` with `ground beef` and defines the specific ground product; already recorded in the ledger for `ingredient-ref-ground-beef`. |
| **WP04-S45** (existing) | OQLF GDT, [viande de bœuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8434368/viande-de-boeuf) | Existing source entry records the general butcher’s term and distinguishes it from ground beef. |
| **WP04-RESIDUAL-20261010-S04** | CFIA, [Labelling requirements for meat and poultry products](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products), “Ground meat”; see also [Canadian Standards of Identity, Volume 7 — Meat Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-7), Table 2, Part A, items 1–4 | CFIA gives maximum fat limits of regular 30%, medium 23%, lean 17%, and extra lean 10%, and requires a species/cut name in the common name. These are legal composition boundaries, not composition means or substitution evidence. |
| **WP04-RESIDUAL-20261010-S05** | Health Canada CNF, [food code 841: raw boneless, skinless chicken breast](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=841) | Gives 100 g edible portion, one 90 g Food Guide serving, and 0% refuse. No per-breast portion is published; do not derive a count weight. |
| **WP07-EGG-20261010-S01–S03, S04–S08** (existing) | Health Canada CNF [whole egg 125](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=125), [white 126](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=126), [yolk 127](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=127&lang=eng), [CNF Users Guide](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-compilation-canadian-food-composition-data-users-guide.html), USDA SR28 Food Group 01, and CFIA [shell-egg size designations](https://inspection.canada.ca/en/food-labels/labelling/industry/shelled-eggs-products) | Existing WP07 source manifest and ledger hold the exact observations and qualifiers. Direct CNF pages were re-opened for this audit. Do not duplicate source IDs or activate conversions. |
| **WP04-EGG-S07–S08** (existing) | USDA ARS, [SR28 Food Group 01 PDF](https://www.ars.usda.gov/ARSUserFiles/80400525/Data/SR/SR28/reports/sr28fg01.pdf), NDB 01138 duck and NDB 01140 quail | Existing WP04 proposal records source-specific raw/fresh edible portions of 70 g per duck egg and 9.0 g per quail egg, with shell-refuse notes. No cross-species conversion or substitution. |

## Search log and remaining review

Searches on 2026-10-10 included: `site:vitrinelinguistique.oqlf.gouv.qc.ca bœuf anglais viande`, `site:inspection.canada.ca beef bœuf meat cuts`, `CFIA ground beef fat maximum regular medium lean extra lean`, `Health Canada CNF chicken breast serving portion count`, and `ground beef beef cut recipe substitution Canada`. The primary Canadian/OQLF sources above support the proposed identity and product distinctions. General substitution advice found in broader extension/consumer material did not provide a product-, recipe-, and method-qualified relation suitable for an active RecipeBook rule; no such value was adopted.

Independent Québec terminology review remains a project-level WP04 requirement. Any accepted generic-beef row should receive bilingual picker QA for `beef`, `bœuf`, `viande de bœuf`, `ground beef`, and `bœuf haché`, since the broad-query overlap is directly observable in the current search algorithm. This proposal makes no shared-file or runtime changes.
