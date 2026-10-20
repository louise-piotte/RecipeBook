# WP04 Section P — jellyfish product-boundary review (round 32)

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only regional seafood identity and product-state review.
- **Candidate:** Edible jellyfish products sold in Canada under `jellyfish` and, in Québec usage, `méduse`.
- **Recommendation:** Keep a generic `jellyfish / méduse` reference and any salted, dried, marinated, head, sheet, or slice row out of the active picker until a recipe or product request identifies the required product. Current sources establish Canadian commerce, but they document distinct parts and preparations without a stable Québec food label that selects one. The bundle contains no matching recipe demand.
- **Scope:** One previously unreviewed regional-seafood boundary. This does not reopen any crab, shellfish, sea-urchin, sea-cucumber, fish-powder, fish-ball, surimi, or pollock-flake decision.
- **Shared-data effect:** None. Add no active reference, alias, form, legacy identity, ledger record, recipe link, measurement, conversion, yield, or substitution.
- **New proposal-local source-ID prefix:** `WP04-SECTIONP-JELLYFISH-20261013-R32-`. It was absent from the current ledger and proposal/batch archive before this packet.

## Why this is a distinct open gap

The live plan leaves regional seafood open under **“Sea urchin, abalone, conch, whelk, sea cucumber, and regionally used seafood with verified names.”** It has no jellyfish decision. Searches of that plan, the proposal and batch archives, active references, forms, legacy identities, and the research ledger found no prior jellyfish review, hold, integration, or candidate ID. This packet concerns jellyfish product scope, not a new species name or a generic fish-preservation form.

The evidence confirms this is a real Canadian food-product category. It does not converge on one recipe-ready identity: Canadian listings distinguish salted heads, sheets, and slices, as well as seasoned ready-to-eat jellyfish; the CFIA labeling page supplies a broad regulatory definition of “fish,” and OQLF supplies a zoological term, but neither establishes one common Québec culinary display for these products. The Montréal-area menu use of `méduse` is a prepared dish with no disclosed product part or state.

## Canadian and Québec naming and product evidence

The OQLF GDT entry privileges **méduse** and gives English **true jellyfish** in zoology, with its entry dated 1985. It is useful Québec bilingual taxonomy terminology, not a food-product or seafood-market naming ruling. A broad consumer ingredient row must not be inferred from that zoological entry alone. [S02]

CFIA's current fish-labelling guidance defines “fish” for the page's regulatory purpose as any marine animal and its parts, products, and by-products. It also explains that product common names must describe the food and that fish products without a prescribed standard name use the generally known or descriptive name. The guidance does not name jellyfish products, prescribe `méduse` as a food label, or identify which species or part an unqualified recipe means. [S01]

The Government of Canada's Canadian Importers Database groups **live, fresh, chilled, frozen, dried, salted, in brine, or smoked jellyfish** under tariff item 030830 and lists Canadian importers for 2024. This confirms a trade category and its broad range of states; customs classification does not make those states interchangeable or identify a recipe ingredient. [S03]

Current Canadian product evidence shows why the catalog scope must stay narrower than one broad row:

- Richmond, BC supplier Watson lists **Salted Jellyfish (Slice)**, SKU 00407, UPC 800794004075, 400 g, marked in stock when reviewed. The product page supplies no scientific name, exact edible portion, salt-removal instruction, or recipe quantity. [S04]
- Watson's product catalogue, printed 2026-04-22, lists **salted jellyfish heads, sheets, and slices** under separate SKUs and package weights. The same catalogue separately lists 165 g seasoned, spicy, and vinegar jellyfish products. These entries support distinct market presentations, not one universal form or recipe identity. [S05]
- Azuma Foods (Canada) lists **Sesame Marinated Jellyfish / Méduse marinée au sésame**, product 11772, in an 80 g frozen package with a two-year shelf life; the stated main ingredients are jellyfish and seasonings. This is one named prepared SKU, not evidence that all jellyfish is sesame-marinated or ready to eat. [S06]
- A current Laval, Québec menu lists `Poulet + Méduse + Concombre + Épinard + Vinaigrette de sésame` in its “You Jelly?” salad. This supports local consumer use of the French word `méduse`; the menu does not disclose the jellyfish species, part, preservation state, preparation, or ingredient amount. [S07]

These sources support keeping a jellyfish gap visible for recipe-led follow-up. They do not justify assigning a species to a processed item or promoting one processor's part/state to the whole jellyfish category.

## Exact ownership and source-ID audit

The audit used the current worktree snapshot: **1,364 active references, 100 forms, 64 legacy-import candidates, and 1,691 research-ledger records**. Exact keys were normalized using the app's `normalizeIngredientSearchKey` behavior: lowercase, Unicode NFKD, compatibility folding, accent removal, punctuation-to-space conversion, and whitespace collapse. It checked active bilingual reference names and aliases, attached form labels and match terms, legacy names and aliases, ledger identities/IDs, and the Section P archive.

| Candidate or key | Current owner / result |
|---|---|
| `jellyfish`, `méduse`, `salted jellyfish`, `dried jellyfish`, `jellyfish head`, `jellyfish sheet`, `jellyfish slice`, `jellyfish salad`, `méduse salée`, `tête de méduse`, `méduse séchée`, `Rhopilema`, `Aurelia` | No exact active-reference, form, or legacy owner. No jellyfish ledger identity/candidate or focused archive decision was found. |
| `ingredient-ref-jellyfish`, `candidate-jellyfish`, `candidate-jellyfish-product-boundary` | Absent from active references, forms, legacy candidates, and ledger record IDs. |
| `WP04-SECTIONP-JELLYFISH-20261013-R32-` | No source-ID collision in the current ledger or proposal/batch archive before drafting. |
| Nearby seafood identities and forms | Existing seafood identities remain independently scoped. None has a jellyfish alias or attached jellyfish form. No cross-category alias is proposed. |

No candidate is added to the shared ledger by this proposal. Product-source phrases, scientific names, tariff codes, and package labels are evidence only; they are not catalog aliases.

## Current and conditional picker effect

The picker returns complete normalized word-phrase matches before substring fallback. The following static projection follows the current bilingual reference/form terms and the repository search rules; it is not a UI test.

| Query | Current active result | If one broad or product-specific jellyfish row were activated | Decision |
|---|---|---|---|
| `jellyfish`; `méduse` | None | A `jellyfish / méduse` row would be the sole result for each term. | Do not treat the single result as a selection among salted heads, sheets, slices, and seasoned products. |
| `salted jellyfish`; `jellyfish head`; `jellyfish sheet`; `jellyfish slice` | None | A row named for only one product would become the only result for that phrase, but would not represent the other listed parts or states. | Keep each product phrase unallocated until a recipe names the needed product. |
| `méduse salée`; `tête de méduse`; `méduse séchée` | None | No French alias is proposed. A constructed translation would not establish a Québec package name. | Do not invent a French alias from an English listing or a zoological term. |
| `fish`; `poisson` | Existing multiple-result seafood and fish-product sets | Unchanged, because no `fish`/`poisson` alias is added. | Keep broad search behavior unchanged. |

The present blank result for jellyfish terms preserves the fact that a search does not yet identify a recipe-stable product. A future product-specific row must be checked against these broad queries and the actual requested preparation before it is integrated.

## Bundled recipe-demand audit

The complete current manifest was scanned in manifest order: **114 recipe files, 1,123 ingredient rows, 753,792 recipe-file bytes**. The scan checked all recipe text and ingredient-row fields for `jellyfish`, `salted jellyfish`, `dried jellyfish`, `jellyfish head`, `jellyfish sheet`, `jellyfish slice`, `jellyfish salad`, `méduse`, `méduse salée`, `tête de méduse`, `méduse séchée`, `Rhopilema`, `Aurelia`, and `sea jelly`.

**Result: zero matching recipe files and zero matching ingredient rows.** The local Laval restaurant menu is external menu evidence, not a bundled recipe line or a basis for a recipe link. No bundled recipe establishes a species, product part, package, serving quantity, preparation, or substitution.

The manifest-ordered recipe fingerprint is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. The manifest has 114 paths and SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.

## Measurement and substitution limits

| Evidence | Limit and catalog decision |
|---|---|
| Watson salted head, sheet, and slice package sizes include 400 g, 908 g, and 25 kg SKUs; its prepared products include 165 g SKUs. Azuma's sesame-marinated product is an 80 g package. | These are package or wholesale amounts tied to different parts, preparations, and sellers. None is a serving amount, drained weight, edible yield, or repeatable household measure. Add no measure, density, unit mapping, conversion, or package-yield record. |
| The customs class groups multiple jellyfish species and product states; retailer pages do not identify a culinary species or recipe portion. | Do not infer a species, preservation form, part equivalence, or cooking state from the generic word or tariff line. No form is proposed. |
| No bundled recipe or reviewed source gives a tested swap involving jellyfish, sea cucumber, squid, surimi, fish balls, or another seafood product. | Add no global or contextual substitution, warning, conversion ratio, or recipe-line substitution link. Similar seafood role, marine origin, or texture language does not establish recipe equivalence. |

## Source register

Sources were reviewed on 2026-10-13. Current seller inventory and product data may change. Source IDs are local to this proposal and are not registered in the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP04-SECTIONP-JELLYFISH-20261013-R32-S01` | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), Overview and Common name sections. | Defines the regulatory scope of `fish` for this guidance and explains common-name requirements. It does not establish a jellyfish-specific common name, species, product form, or recipe use. |
| `WP04-SECTIONP-JELLYFISH-20261013-R32-S02` | OQLF, [méduse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17490300/meduse). | Privileges `méduse` and gives `true jellyfish`; its domain is zoology and the entry dates from 1985. It is not a seafood-product naming ruling. |
| `WP04-SECTIONP-JELLYFISH-20261013-R32-S03` | Innovation, Science and Economic Development Canada, [Canadian Importers Database — HS 030830](https://ised-isde.canada.ca/app/ixb/cid-bdic/productReport.html?hsCode=030830). | Lists jellyfish across live/fresh/chilled/frozen/dried/salted/brined/smoked states and Canadian importers for 2024. Customs classification and importer presence do not establish a specific taxon, label, Québec retail package, or recipe quantity. |
| `WP04-SECTIONP-JELLYFISH-20261013-R32-S04` | Watson Enterprises, [Salted Jellyfish (Slice)](https://www.watsonca.com/en/cold-food/jellyfish-and-seaweed-cooler/salted-jellyfish-slice-br/), SKU 00407, UPC 800794004075. | Current Richmond, BC supplier listing for an in-stock 400 g sliced salted product. It gives no species, salt-removal protocol, serving basis, or recipe amount. |
| `WP04-SECTIONP-JELLYFISH-20261013-R32-S05` | Watson Enterprises, [Cold Food catalogue PDF](https://www.watsonca.com/index.php?category_id=411&dispatch=categories.print_catalog&format=pdf), printed 2026-04-22, pp. 3 and 6. | Separates ready-to-eat jellyfish flavors from salted head, sheet, and slice products with different SKUs and package sizes. It is a supplier catalogue, not a single standardized product formula, serving guide, or species declaration. |
| `WP04-SECTIONP-JELLYFISH-20261013-R32-S06` | Azuma Foods (Canada), [Fukahire Kurage — Sesame Marinated Jellyfish](https://azumafoods.ca/products/fukahire-kurage-80g/), product 11772. | Current Canadian product page gives French/English product wording, 80 g frozen package, shelf life, and main ingredients. This supports one prepared SKU only; it does not generalize to salted raw jellyfish or other parts. |
| `WP04-SECTIONP-JELLYFISH-20261013-R32-S07` | Restaurant Gon Bui, Laval, [current menu](https://www.opentable.ca/r/restaurant-gon-bui-laval), “You Jelly?” salad. | Québec menu pairs French `méduse` with chicken, cucumber, spinach, and sesame vinaigrette. It discloses no species, product state, part, supplier, or amount; this is not bundled recipe demand. |

## Recommendation and next action

Keep jellyfish products outside the active picker and do not assign an alias, form, legacy candidate, ledger identity, or recipe link now. The Canadian evidence confirms products exist, while the observed market terms cover different parts and states and current Québec evidence does not resolve them to one reusable ingredient identity. The bundle has no matching demand to select among them.

Revisit this boundary only when a bundled recipe or user request names an exact jellyfish product and its intended part/preparation. Then use the current bilingual product label and recipe wording to decide whether that one product warrants an identity; keep source-specific package amounts inactive unless a real recipe supplies a portion basis. Do not infer a species or product family from a salted or marinated item.

Static review completed: live plan and archive scan, active/form/legacy/ledger exact-key audit, phrase-first picker projection, current source review, manifest-wide recipe search, and source-prefix collision check. This is a proposal-only Markdown change; no tests were run.
