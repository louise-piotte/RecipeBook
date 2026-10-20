# WP04 Section P R483 — fish-burger product boundary

- **Review and source-access date:** 2026-10-17.
- **Checklist:** The open Section P finfish coverage item, `[ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.` There is no dedicated fish-burger checkbox. See the [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6207).
- **Candidate:** Generic commercial fish burgers / `burgers de poisson`, kept separate from species-specific tuna burgers and from fish cakes/croquettes.
- **Recommendation:** **Hold the generic fish-burger identity unallocated.** Do not add an active reference, alias, form, legacy mapping, ledger candidate/record, recipe link, or substitution.
- **Status:** Proposal only; this file is the only intended change. Root alone integrates shared catalog, ledger, plan, and roadmap data. No tests, build, emulator, or deployment checks were run.
- **New source IDs:** `WP04-SECTIONP-FISH-BURGERS-R483-20261017-S01` through `S06`; proposal-local and unregistered. At audit time, the prefix had no preexisting allocation in the live ledger or reviewed proposal/batch archive.

## Open-plan fit and overlap audit

The parent finfish checklist remains open. The plan does not enumerate a fish-burger subtask, and the existing prepared-fish work explicitly keeps fish burgers separate from frozen breaded fish sticks. This review takes that unresolved boundary as its candidate; it does not reopen an accepted identity.

The R476–R481 proposals and recent integration notes were checked for overlap. R477 adds a species-qualified smoked Greenland-halibut product; R480 adds species-neutral lobster meat and one cooked-frozen form. R476 covers foxtail millet flakes, R478 dried baobab-leaf powder, R479 aliases for steel-cut oats, and R481 dried Gnetum leaves. None names or allocates a fish-burger product. The [R479–R481 integration note](../batches/wp03-wp04-wp06-r479-r481-gap-review-integration-20261017/README.md) confirms that Section P remains open.

Keep the decision distinct from two earlier prepared-fish boundaries:

- **Generic fish cake:** R171 holds `fish cake(s)` unallocated because Québec market use spans different products and OQLF's `croquette de poisson`, `beignet de poisson`, and `galette de poisson` describe a particular flaked-fish mixture shaped and fried. R483 does not reopen that decision or use those French terms as universal fish-burger aliases.
- **Frozen breaded fish sticks:** R221 explicitly excludes fish burgers from its frozen breaded stick identity. Its current reference remains separate and unchanged.

Fish balls, fish tofu, surimi products, crab cake, raw fish species, fillets, and homemade fish cutlets remain separate product or ingredient boundaries. Shared fish content or a round/patty shape does not establish an alias, form, or replacement rule.

## Source evidence and naming boundary

CFIA's current fish-labelling guidance says a fish product's common name is the prescribed standardized name where one applies, or otherwise the name by which the food is generally known or a descriptive name. It also calls for descriptors where omission could make a product mistaken for another food. This supports retaining product-specific wording and composition; it does not establish one universal fish-burger formula or recipe behavior. OQLF's entry for `croquette de poisson` is narrower: its English terms are `fish cake` and `fish croquette`, and its French preferred terms apply to the defined fish/breadcrumb/egg preparation. Neither source makes a fish-burger label equivalent to a fish cake.

The current Québec and Canadian product pages use burger wording for materially different fish products:

| Product example | What the reviewed page supports | Why it does not establish a shared recipe ingredient state |
|---|---|---|
| High Liner, Metro item 061763041365 | Frozen crispy-breaded fish burgers; the same English/French SKU pages identify pollock, crumbs, flour/starches, oil, and seasonings. The product is listed as 515 g. | A breaded pollock product with its own package and cooking directions. The listing does not support a count-to-mass conversion or a recipe-wide state. |
| Janes, Metro item 069299242133 | `Burgers de poisson en pâte à la bière`; 450 g. Metro describes whole pollock fillets in beer batter. Janes' manufacturer page says the burgers are made from 100% whole fillets. | Intact fillets in beer batter differ in structure and coating from the High Liner crumbed item. Each brand's directions and package are SKU-specific. |
| Poissonnerie La Mer, Montréal | `Burgers de Thon Bluefin`: the listing describes fresh/local tuna with aromatics, breadcrumb, egg, and other ingredients; it sells a two-burger pack and gives its own cook-from-frozen advice. | A locally made tuna mixture with no stated scientific species or pack mass. Its name and instructions do not define the frozen pollock products or all fish burgers. The listing says “special end of season”; no current inventory claim is made. |

The source set establishes Québec-facing product wording and three distinct formulations/presentations. It does not support a single default species, fish structure, coating, raw/cooked state, retail readiness, or culinary interchangeability for the unqualified category. No bilingual term authority was found that maps every use of `fish burger` to one French preparation. `Burgers de poisson` is used on one Québec retail product, while the local tuna item is explicitly species-qualified. Keep `galette de poisson` scoped to the OQLF-defined fish-cake/croquette preparation.

## Bounded disposition

Hold generic `fish burger(s)` / `burger(s) de poisson` outside active references, forms, legacy identities, and research-ledger candidates. Do not create a generic row based on the reviewed product pages alone. Reopen only when a bundled recipe or exact product request selects a product style, such as a formed seasoned fish mixture, a breaded pollock patty, or a whole battered fish fillet sold for a bun. At that point, use the selected product's exact French/English name and state, and keep its ingredients and package details attached to that product scope.

Keep these boundaries explicit:

- Do not alias fish burger to `fish cake`, `croquette de poisson`, `galette de poisson`, or `beignet de poisson`. R171's terminology decision remains scoped to fish-cake/croquette preparations.
- Do not alias fish burger to fish sticks, fish balls, fish tofu, surimi, crab cake, fish fillets, or any fish species. R221's stick reference continues to exclude burgers.
- Do not interpret a fish sandwich or a whole fish fillet placed on a bun as a formed fish-burger ingredient unless the recipe or exact product names that item.
- Do not use the La Mer `Bluefin` wording as a species assignment or alias for generic fish burgers. Its product page gives no binomial.
- No general French aliases are supported beyond source-specific product titles. No active reference or source-ledger candidate is proposed.

## Live ownership and archive audit

The repository snapshot on 2026-10-17 contains **1,759 active ingredient references**, **143 forms**, **56 legacy-import candidates**, and **2,118 research-ledger records** with **9,663 source entries**, **8,201 distinct source IDs**, and **6,914 distinct source URLs**.

| Surface | Exact finding | R483 decision |
|---|---|---|
| Active references | Exact normalized-key scans of IDs, English/French displays, and aliases found no owner for `fish burger(s)`, `fishburger(s)`, `fish patty/patties`, `burger(s) de poisson`, `burger(s) au poisson`, `burger(s) de thon`, `galette de poisson`, `fish cake(s)`, or `croquette de poisson`. The relevant nearby active rows are `ingredient-ref-fish-balls`, `ingredient-ref-fish-tofu`, `ingredient-ref-frozen-breaded-fish-sticks`, and `ingredient-ref-crab-cake`; none owns a fish-burger term. | Add no row, aliases, or legacy mapping. |
| Forms | Exact scans of all 143 form IDs, labels, and match terms found no fish-burger owner or product form. | Add no form under a fish species or neighboring product identity. |
| Legacy import | Exact scans of all 56 candidate IDs, names, and aliases found no fish-burger owner. | Add no legacy candidate or mapping. |
| Research ledger | No record ID or identity key owns a fish-burger phrase. The phrase occurs only as a named exclusion in the frozen-fish-sticks research decision; it is not a fish-burger identity record. | Add no candidate or ingredient-reference ledger record. |
| Proposal and batch archive | No dedicated fish-burger review or decision was found. R221 excludes fish burgers from fish sticks; R171 holds generic fish cakes. R477 and R480 cover different products. | Treat R483 as a distinct bounded hold; preserve earlier decisions. |
| Proposed allocation | `ingredient-ref-fish-burger(s)` and `candidate-fish-burger(s)` have no allocation. Before this write, the R483 proposal path was absent; this file is its first archive entry. The R483 source-ID prefix had no preexisting ledger or archive allocation. | Do not allocate a candidate ID or mutate shared sources while holding. |

### Exact source-ID and URL ownership

The exact CFIA fish-labelling URL below is already represented **26 times across 14 source IDs** in the live ledger. `WP04-FBSUR-20261011-S13` is one existing exact-URL source ID; its current record associations are `candidate-surimi-product-boundary`, `ingredient-ref-boneless-salted-pollock`, and `ingredient-ref-crab-flavoured-pollock-flakes`. Reuse that source ID for the guidance only; do not add a duplicate URL or ID. The exact OQLF URL has **zero live-ledger URL associations**. `WP04-FBSUR-20261011-S12` is an archived proposal source ID used by the fish-ball/fish-cake reviews, not a live ledger source registration. R483 does not register it.

The six product-page URLs in S01–S06 below each have **zero exact URL owners** in the live ledger. The proposed S01–S06 IDs have no current ledger allocation; they remain proposal-local because the recommendation is a hold.

| Source ID / state | Exact URL | Existing exact owner or proposed scope |
|---|---|---|
| Reuse `WP04-FBSUR-20261011-S13` | [CFIA — Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Exact URL already has 14 source IDs / 26 record associations; S13 is currently on the three records listed above. Reuse, do not register again. |
| Archived only `WP04-FBSUR-20261011-S12` | [OQLF — croquette de poisson (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488990/croquette-de-poisson) | Zero live-ledger URL owners. ID appears in earlier proposal archive; do not allocate it to a new ledger record. |
| R483 S01, unallocated | [Metro — High Liner Frozen Fish Burgers, 061763041365](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/seasoned-breaded/fishbburgers/p/061763041365) | Exact URL owner count 0. One English locale for the SKU also represented by S02. |
| R483 S02, unallocated | [Metro — High Liner Burgers de poisson surgelés, 061763041365](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/assaisonnes-et-panes/burgers-de-poisson/p/061763041365) | Exact URL owner count 0. Same product number and product evidence as S01; not independent product evidence. |
| R483 S03, unallocated | [Metro — Janes Burgers de poisson en pâte à la bière, 069299242133](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/burgers-de-poisson-en-pate-a-la-biere-surgeles/p/069299242133) | Exact URL owner count 0. Québec retailer title, ingredient panel, 450 g listing, and whole-pollock-fillets description. |
| R483 S04, unallocated | [Janes — Beer Battered Fish Burgers](https://www.janesfoods.com/products/beer-battered-fish-burgers/) | Exact URL owner count 0. Manufacturer description of whole pollock fillets and the product's own instructions. |
| R483 S05, unallocated | [High Liner — Breaded Fish Burgers](https://www.highliner.com/products/family-favourites/family-favourites-breaded-fish-burger) | Exact URL owner count 0. Manufacturer page for the 515 g product; the nutrition panel basis is SKU-specific. |
| R483 S06, unallocated | [Poissonnerie La Mer — Burgers de Thon Bluefin](https://www.lamer.ca/products/burger-de-thon) | Exact URL owner count 0. Montréal fishmonger product description; no binomial or transferable pack weight. |

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases match first, then substring matching applies when there is no full-phrase result. The current catalog has no fish-burger row, so **the actual picker does not change under this hold**.

For root's impact review only, the hypothetical comparison below models a single row with source-attested plural displays `fish burgers / burgers de poisson`; it is not a proposed catalog delta or alias set.

| Query | Current results | Hypothetical one-row effect | R483 result |
|---|---:|---:|---|
| `fish burger`, `fish burgers`, `burgers de poisson` | 0 | 1 each | Remain unowned. |
| `burger` | 0 | 1 through substring fallback | Remains unowned. |
| `fish` | 12, including fish balls, fish tofu, and frozen breaded fish sticks | 13 | Unchanged at 12. |
| `poisson` | 12, including fish balls, fish tofu, and frozen breaded fish sticks | 13 | Unchanged at 12. |
| `pollock`, `goberge` | 4 each | 4 each; no species term is added | Unchanged. |
| `fish cake(s)`, `croquette de poisson`, `galette de poisson`, `beignet de poisson` | 0 | 0 | Unchanged; preserve R171's separate boundary. |
| `fish balls`, `fish sticks`, `fish tofu` | 1 each, selecting their existing references | 1 each | Existing identities remain unchanged. |

## Bundled recipe corpus

The manifest-ordered scan parsed all **114 recipe files** and all **1,123 structured ingredient rows**, checking complete decoded recipe JSON and ingredient-row fields for fish burger/burger, fish patty, fish cake/croquette, fish ball, fish stick, fish tofu, surimi, and pollock-burger wording in English and French. It found **zero matching recipe files and zero matching ingredient rows**. No bundled line identifies a product style, recipe role, quantity, or preparation state, so no recipe link is proposed.

The manifest-ordered corpus is **753,988 bytes**, with SHA-256 **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**. The digest input is each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte, in manifest order.

## Product-state, numeric, and substitution limits

- **Identity and form:** No single fish burger product state is established. The examples include a frozen breaded pollock product, whole pollock fillets in beer batter, and a local tuna mixture with separate ingredients and handling instructions. Add no `raw`, `cooked`, `frozen`, `breaded`, `battered`, `formed`, or other form under a generic fish identity. Requirements model forms as states or formats of a known ingredient; the reviewed products do not establish one shared same-ingredient transformation.
- **Package amounts and count:** The High Liner 515 g and Janes 450 g values are package masses for their own products. High Liner's manufacturer nutrition basis of **about 2 burgers (132 g)** is a nutrition serving basis for that SKU, not a per-burger mass, recipe measure, package yield, or generic count-to-mass conversion. La Mer lists a two-burger pack but no pack mass. Do not derive a common patty weight or yield.
- **Other measurements:** Add no default density, unit mapping, household measure, volume-to-mass conversion, ingredient mass conversion, package yield, cooked yield, thawing yield, or recipe amount. None of the retailer package sizes describes the other products.
- **Cooking instructions:** Each manufacturer's cook-from-frozen or temperature/time directions apply only to its named SKU. Do not turn them into a generic state or transferable cooking method.
- **Recipe links and substitutions:** Add no recipe-line link or substitution among these burger products, fish cakes/croquettes, fish sticks, fish balls, fish tofu, surimi products, raw fish, tuna, pollock, or any other species. The corpus has no role/method context and the product sources do not establish a ratio or equivalent cooking behavior.

## Root-review recommendation

**Accept the bounded hold.** Keep the generic fish-burger wording unallocated; do not add active data, a legacy candidate, a research-ledger candidate, aliases, forms, or recipe links. Leave the Section P parent finfish checklist open. Revisit when a bundled recipe or exact product request identifies the preparation and species/product state so the catalog can represent that request with a narrower, source-backed bilingual identity. Because R483 is a documentation-only hold, no software tests or emulator checks were run.

## Sources and limits

Sources were reviewed on **2026-10-17**. Retail pricing and availability are variable. The Metro product pages are exact SKU listings and not independent corroboration of their paired manufacturer pages. The La Mer page is a local seasonal product listing, not evidence of year-round inventory or a generic fish-burger standard.

| Source ID | Source and evidence | Limit |
|---|---|---|
| Reuse `WP04-FBSUR-20261011-S13` | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). Common-name guidance and fish-product descriptions. | Existing exact URL/source-ID owners; general labeling guidance, not a burger recipe or equivalence ruling. |
| Reuse archived `WP04-FBSUR-20261011-S12` | OQLF, [croquette de poisson (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488990/croquette-de-poisson), updated 2022. | Preferred French terms `croquette de poisson`, `beignet de poisson`, and `galette de poisson`; definition is a fish/breadcrumb/egg mixture, sometimes with potato, shaped and fried. Archived source ID; not registered in the live ledger. |
| `WP04-SECTIONP-FISH-BURGERS-R483-20261017-S01` | Metro, [High Liner Frozen Fish Burgers, product 061763041365](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/seasoned-breaded/fishbburgers/p/061763041365). English listing names frozen crispy-breaded fish burgers and reports 515 g; ingredient list begins with pollock. | One SKU and one retailer locale; page price/sale snapshot is not used. Product weight is not a measure or yield. |
| `WP04-SECTIONP-FISH-BURGERS-R483-20261017-S02` | Metro, [Burgers de poisson surgelés, product 061763041365](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/assaisonnes-et-panes/burgers-de-poisson/p/061763041365). French listing of the same High Liner 515 g SKU; ingredient list begins with goberge. | Paired locale page for S01, not a second formulation or product. |
| `WP04-SECTIONP-FISH-BURGERS-R483-20261017-S03` | Metro Québec, [Burgers de poisson en pâte à la bière surgelés, Janes product 069299242133](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/filets-et-darnes-de-poissons/burgers-de-poisson-en-pate-a-la-biere-surgeles/p/069299242133). Lists 450 g; describes whole pollock fillets in beer batter and provides the SKU ingredient panel. | One product listing; package weight and product wording do not generalize to other burgers. Stock and pricing may change. |
| `WP04-SECTIONP-FISH-BURGERS-R483-20261017-S04` | Janes, [Beer Battered Fish Burgers](https://www.janesfoods.com/products/beer-battered-fish-burgers/). Manufacturer says made from 100% whole fillets, lists 450 g, pollock-fillets ingredients, and its own cook-from-frozen instructions. | First-party product information. Its formulation and cooking details apply to this product only. |
| `WP04-SECTIONP-FISH-BURGERS-R483-20261017-S05` | High Liner, [Breaded Fish Burgers](https://www.highliner.com/products/family-favourites/family-favourites-breaded-fish-burger). Manufacturer page lists 515 g, pollock and breading ingredients, SKU cooking instructions, and nutrition per about 2 burgers (132 g). | First-party product information. Nutrition serving basis is not a per-piece mass, generic measure, or recipe conversion. |
| `WP04-SECTIONP-FISH-BURGERS-R483-20261017-S06` | Poissonnerie La Mer, Montréal, [Burgers de Thon Bluefin](https://www.lamer.ca/products/burger-de-thon). Describes fresh/local tuna with herbs, spices, breadcrumbs, egg and other ingredients; states pack of two and product-specific frozen cooking instructions. | No scientific species, pack mass, general recipe basis, or year-round availability is established. |
| **WP04-SECTIONP-FISH-BURGERS-R483-20261017-R01** | Read-only audit of Section P plan checkboxes, R476–R481 proposals and integration notes, R171/R221 boundaries, active references/forms, legacy candidates, ledger record/source-ID/URL ownership, `IngredientSearch.kt`, and all manifest-listed recipes. | Repository-snapshot record of exact ownership, query projection, and corpus scan; no catalog or ledger mutation. |
