# WP04 Section P — fried fish balls product-state review

- **Review date:** 2026-10-12.
- **Scope:** Decide whether the retailer/manufacturer term `fried fish balls` merits its own catalog identity, a form under the active generic fish-ball identity, or an alias.
- **Disposition:** **Hold** a separate fried-fish-ball identity or form. Keep the existing generic `fish balls / boulettes de poisson` identity as-is; do not add `fried fish balls` or `boulettes de poisson frites` as aliases.
- **Root disposition:** Confirmed hold. No active row, form, alias, or ledger data changed. See the [batch decision](../batches/wp04-section-p-fried-fish-balls-product-state-hold-integration-20261012/README.md).
- **Separation from earlier work:** This is a product-state review of fried fish-ball listings. It does not reopen the accepted generic fish-ball identity or the held unqualified-surimi and surimi-shreds decisions.

## Recommendation

Canadian retailer and manufacturer pages confirm that products are sold under a fried-fish-ball description. The listings also show why that phrase is not yet a single recipe-ready identity: one retailer sells an assorted fried-fish-ball item and a separate fried cheese fish ball; a Toronto manufacturer lists plain, crab, fried, and crab-flavoured fish balls and says its fish balls use varied ingredients and flavours. These are product examples, not evidence for one shared formulation, fish species, cooking state, or culinary conversion.

The generic catalog owner is already `ingredient-ref-fish-balls`, displayed as `fish balls / boulettes de poisson` with only singular search aliases `fish ball / boulette de poisson`. No active row, form, or ledger candidate owns the fried modifier. Since no bundled recipe asks for fish balls, there is no recipe line to tell whether `fried` means the product was fried before sale, the recipe should fry the balls, or a particular filled/flavoured SKU is intended. Keep the generic row broad and identity-only; do not turn this preparation adjective into an alias or form without a recipe-backed state and label.

## Live ownership and recipe demand

| Audit | Finding |
|---|---|
| Active exact-name owner | `ingredient-ref-fish-balls`: EN `fish balls`, FR `boulettes de poisson`; aliases EN `fish ball`, FR `boulette de poisson`. It has no species, formulation, storage, or cooking state. |
| Fried exact-name owner | None for `fried fish ball(s)`, `boulette(s) de poisson frite(s)`, or the fried-cheese product wording in active reference names/aliases or form labels/match terms. No fried-fish-ball ledger record or candidate exists. The only nearby active owner is the generic fish-ball identity. |
| Adjacent owners | Actual crab meat remains `ingredient-ref-crab`; generic surimi remains `candidate-surimi-product-boundary` in `needs_clarification`. Neither owns a fish-ball preparation state. Fish cakes/croquettes, surimi paste, imitation seafood, and actual crab remain separate product identities. |
| Recipe scan | Exact case-insensitive scan of the 114 bundled recipe files and their 1,123 ingredient rows found no `fish ball(s)`, `boulette(s) de poisson`, `fried fish ball(s)`, `boulette(s) de poisson frite(s)`, or surimi-shreds line. Recipe 019 is titled “Crab Balls,” but its seafood row says `1 lb jumbo lump crab meat`; it is not fish-ball demand. |
| Forms and rules | The live forms file contains 94 forms and no fish-ball or surimi form. No relevant contextual substitution rule exists. The fish-ball ledger record is verified identity-only, with measurement `researched_no_supported_value` and substitution `researched_no_supported_substitute`. |

## Naming, product, and taxonomy boundaries

OQLF's GDT pairs `boulette de poisson` with `fish ball` [reused source `WP04-BONGA-POWDER-20261011-S08`]. A Québec Metro listing independently displays `Frozen Fish Ball / Boulette de poisson surgelée` for one generic frozen SKU [reused source `WP04-FBSUR-20261011-S08`]. The current T&T listings use English product titles, including `Choripdong Assorted Fried Fish Ball` and `Fried Cheese Fish Ball`; the accessible French-facing URL for the assorted item still exposes the English title. No authoritative Québec French term specifically naming the fried product was found. `Boulettes de poisson frites` is a possible descriptive rendering, not a verified GDT term or product label.

Ocean Food's current Canadian manufacturer page lists plain, crab, fried, and crab-flavoured fish-ball variants and says its fish balls use varied ingredients and flavours [reused source `WP04-FBSUR-20261011-S06`]. Its page also describes other fried kamaboko as pre-cooked, but that statement is not specific to its fried fish-ball SKU. Do not infer that every product called `fried fish balls` is precooked, ready-to-eat, made from one surimi formula, or the same product as a plain fish ball that a cook fries.

CFIA's fish-product labelling guidance says a product name should be the name generally known or a descriptive non-generic name when no prescribed common name applies; it also says species-scoped common names come from the Fish List and that a multi-species fish product may use a generic fish name when its species are identified in the ingredient list. Its guidance on surimi requires the finished product to use its generally known name and descriptors as appropriate, and imitation products to be identified clearly [reused source `WP04-FBSUR-20261011-S13`]. This is labelling guidance, not evidence that the candidate contains one species or surimi. Do not assign pollock, another species, or a biological taxon to the prepared product from its retail name.

Keep fish balls separate from actual crab meat and surimi paste. Keep fish cakes and croquettes separate: OQLF defines `croquette de poisson` as a distinct fish mixture shaped and fried [reused source `WP04-FBSUR-20261011-S12`]. Shrimp balls, squid balls, imitation-lobster balls, and cheese-filled fish balls are not generic aliases for plain fish balls. The broader generic fish-ball proposal also records the product boundary and prior recipe scan in [the 2026-10-11 review](wp04-fish-balls-surimi-product-boundary-review-20261011.md) and [its current-source reassessment](wp04-fish-balls-surimi-current-source-reassessment-20261011.md).

## Measurement and substitution limits

The T&T listings declare 500 g for the assorted fried fish-ball SKU and 454 g for a fried cheese fish-ball SKU [S01–S02]. These are package quantities, not a household measure, serving size, or count-to-mass relationship. Neither listing supplies per-piece count, recipe quantity, ingredient formula, cooking yield, density, or a usable conversion. The retailer's serving suggestions for hot pots, stir-fries, soups, and platters do not establish cooking directions or readiness for consumption.

Add no count, mass, or volume mapping; default density; package yield; recipe link; or conversion. Do not add a substitution between generic fish balls and fried fish balls, or between either product and surimi paste, imitation crab, actual crab, fish cakes/croquettes, shrimp balls, or squid balls. No corpus-backed context or evidence supports a ratio, interchangeability, cooking method, or safety equivalence.

## Source register

New source IDs use `WP04-FRIED-FISH-BALLS-20261012`; uniqueness was checked against the current catalog, research ledger, proposals, and batch records before assignment. IDs for existing OQLF, CFIA, Metro, and Ocean Food evidence are reused instead of duplicated.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-FRIED-FISH-BALLS-20261012-S01** | T&T Supermarket, [Choripdong Assorted Fried Fish Ball (500 g)](https://www.tntsupermarket.com/fr/71911401-choripdong-assorted-fried-fish-ball.html) | Current Canadian retailer listing indexed with the English product title and 500 g package quantity; its French-facing URL retains the English title. Search-index text describes possible uses but the product page requires JavaScript. Supports a named retail product and package quantity only; no formula, species, French product name, piece count, or readiness state was available. |
| **WP04-FRIED-FISH-BALLS-20261012-S02** | T&T Supermarket, [Fried Cheese Fish Ball (454 g)](https://www.tntsupermarket.com/eng/52830901-fried-cheese-fish-ball.html) | Current Canadian retailer product listing identifies a separately named cheese variant and package quantity. The page could not be opened by the research browser; no ingredients or preparation state are claimed from it. |
| **WP04-BONGA-POWDER-20261011-S08** *(reused)* | OQLF, [boulette de poisson (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10435974/boulette-de-poisson) | Preferred Québec French term and English equivalent for generic fish ball; no fried-state or species definition. |
| **WP04-FBSUR-20261011-S06** *(reused)* | Ocean Food Company, [Fresh Sea Market](https://www.oceanfoodcompany.com/fresh-sea-market) | Canadian manufacturer lists plain, crab, fried, and crab-flavoured fish-ball variants and states its fish balls have varied ingredients/flavours. Its separate pre-cooked fried-kamaboko statement is not generalized to fish balls. |
| **WP04-FBSUR-20261011-S08** *(reused)* | Metro Québec, [Frozen Fish Ball / Boulette de poisson surgelée, 180 g](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/boulette-de-poisson-surgelee/p/821964020282) | Bilingual generic fish-ball display on one Québec SKU; does not name or define a fried product. |
| **WP04-FBSUR-20261011-S12** *(reused)* | OQLF, [croquette de poisson (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488990/croquette-de-poisson) | Defines a fish croquette as a distinct shaped-and-fried fish mixture; it does not classify every fried fish ball as a croquette. |
| **WP04-FBSUR-20261011-S13** *(reused)* | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Current common-name, species-name, surimi, imitation-product, and descriptive-word guidance. Regulatory labeling source, not a product formulation or species declaration for the T&T items. |

## Next open work

Revisit the fried modifier if a bundled recipe or a user-requested named product needs it. Capture the actual label and preparation state, confirm a Québec French display, and decide whether the request denotes a prepared retail product or a recipe form of the generic fish balls. Until then, leave the generic fish-ball row unchanged and keep the broader Section P fish-ball/surimi checklist open.
