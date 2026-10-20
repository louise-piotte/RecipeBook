# WP05 Section T — Monosodium glutamate identity review

- **Packet type:** proposal-only bilingual identity, alias-boundary, and recipe-demand review.
- **Prepared and source-access date:** 2026-10-11.
- **Plan:** Section T, “Individual spices dried aromatics salts and seasoning blends”; open checklist item covering MSG, nutritional yeast, yeast extract, bouillon powder, seasoning salt, and mushroom seasoning.
- **Scope:** monosodium glutamate (MSG) only. The remaining checklist products are outside this packet.
- **Status:** recommend one identity-only reference. Do not add forms, measurements, recipe links, or substitution behavior.
- **Source IDs:** `WP05-MSG-20261011-S01` through `WP05-MSG-20261011-S06`. This prefix was checked against current proposal and ledger IDs; no collision was found.

## Recommendation

Add one identity-only row, proposed ID `ingredient-ref-monosodium-glutamate`:

| Field | Proposed value |
|---|---|
| English display | `monosodium glutamate` |
| French display | `glutamate monosodique` |
| English alias | `MSG` |
| French aliases | `GMS`; `glutamate de sodium` |
| Category | `BAKING_AND_SPICE` |
| Density / unit mappings | None |
| Forms / package yields / recipe links | None |

Health Canada uses `monosodium glutamate (MSG)` in English and `glutamate monosodique (GMS)` in French. The OQLF GDT entry also records `glutamate de sodium` as a term for the same named substance [S01–S03]. The direct bilingual Metro listing for one Accent product independently pairs the ingredient declaration `Monosodium glutamate` / `Glutamate monosodique` for the same product number [S05–S06].

Keep the row limited to the monosodium salt. Do not add an amount, density, conversion, or general dosing guidance from the Health Canada Q&A. Mark only MSG complete within the open Section T checklist line; nutritional yeast, yeast extract, bouillon powder, seasoning salt, and mushroom seasoning remain open for separate reviews.

## Repository audit and demand

Snapshot read on 2026-10-11. I reviewed the active reference and form arrays, all research-ledger records, legacy-import candidates, existing proposals, and every recipe named by the bundled-library manifest. Exact-key checks used the app’s search normalization: lowercase, NFKD, accent and ligature folding, punctuation-to-space, and whitespace collapse. The phrase audit included `monosodium glutamate`, `glutamate monosodique`, `glutamate de sodium`, `MSG`, `GMS`, `sodium glutamate`, `glutamic acid`, `Accent`, `seasoned salt`, and `seasoning salt`.

- The package has **1,031 active references** and **72 active forms**. No active reference, alias, form label, or form match term owns a proposed exact key. The nearby `ingredient-ref-baking-soda` terms include `sodium bicarbonate` / `bicarbonate de sodium`; they do not collide with the complete MSG phrases.
- The **75 legacy candidates** contain no MSG or glutamate identity. The **1,323 ledger records** contain no MSG reference/candidate record. No existing proposal covers MSG or has a matching MSG source-ID prefix.
- The **114 manifest-listed recipes and 1,123 ingredient rows** have zero exact MSG ingredient-name or ingredient-ID matches. A full recipe-string scan also found no direct MSG terms, French equivalents, `Accent`, or seasoning-salt wording.
- A broader scan for other glutamate sources found **9 rows in 8 recipes**: three soy-sauce rows, three tomato / tomato-paste / tomato-sauce rows, and three Parmesan-cheese rows. They already link to their named ingredient references. Health Canada lists soy sauce as another added source and tomatoes and some cheeses as foods that naturally contain glutamate [S01–S02]. These rows are not MSG demand and should not be relinked.

The absence of a bundled recipe request does not block a catalog identity for a named pantry ingredient. It does mean this proposal supports no recipe-link change.

## Identity and alias boundaries

| Term or product | Evidence-backed distinction | Catalog treatment |
|---|---|---|
| Monosodium glutamate / glutamate monosodique | Health Canada describes glutamate as occurring in food proteins and some foods, and distinguishes direct addition in the form of monosodium glutamate [S01–S02]. CFIA treats MSG as a named component in its ingredient-declaration rules [S04]. | One identity with the display and concise aliases above. |
| Glutamate / glutamic acid / other glutamate salts | `Glutamate` is broader than MSG: Health Canada describes naturally occurring glutamate and multiple sources, while CFIA groups glutamic acid or its salts and names MSG as one included form [S01–S04]. | Do not use `glutamate` or `glutamic acid` as aliases. Do not extend this row to other salts. |
| Soy sauce, autolyzed yeast extract, hydrolyzed plant/vegetable protein, tomatoes, and cheese | These can contain or supply glutamate, but Health Canada names them as other sources, separately from directly added MSG [S01–S02]. | Keep each under its own ingredient identity; no aliases or substitutions to MSG. |
| Seasoned salt, spice mixtures, bouillon, and flavour-enhancer preparations | CFIA distinguishes seasoning and flavour-enhancer preparations from their components; MSG may be present as a declared component in a mixture [S04]. | A mixture that contains MSG is not itself MSG. Keep seasoning salt, bouillon, and prepared blends separate. |
| Accent-branded flavour enhancer | Metro’s paired listings for product 047800000922 call one 128 g SKU an Accent flavour enhancer and list only monosodium glutamate / glutamate monosodique as its declared ingredient [S05–S06]. This is evidence about that SKU’s retailer listing, not every product sold under the brand. | Do not add `Accent`, `Accent flavour enhancer`, or `rehausseur de saveur` as generic aliases. The brand and function wording are not the ingredient’s name. |
| Nutritional yeast and yeast extract | They are separate yeast-derived products; Health Canada identifies yeast extracts as a possible source of glutamate, not as monosodium glutamate [S01–S02]. | Keep separate; this packet creates no yeast identity or relation. |

`MSG` is the English abbreviation used by Health Canada; use `GMS` for the French abbreviation. Do not add bare `umami`, `sodium`, `seasoning`, or `flavour enhancer`: each is broader than the named substance. The OQLF term `glutamate de sodium` is included only as its source-attested French wording; no unsupported English `sodium glutamate` alias is proposed.

## Source-to-claim map

Sources were accessed on 2026-10-11. Health Canada and CFIA pages support the identity and scope. Metro listings are current retailer evidence for the specified SKU and may change; the pages themselves caution that product information can change.

| ID | Source | Supports and limits |
|---|---|---|
| **WP05-MSG-20261011-S01** | Health Canada, [Monosodium glutamate (MSG) and other sources of glutamate in foods](https://www.canada.ca/en/health-canada/services/food-nutrition/food-safety/food-additives/monosodium-glutamate-questions-answers.html). | Uses `monosodium glutamate (MSG)`, distinguishes direct addition of MSG from glutamate naturally present in proteins and foods, and names soy sauce, autolyzed yeast extracts, and hydrolyzed plant/vegetable protein as other added sources. Supports identity and boundary only; its quantity guidance is not adopted. |
| **WP05-MSG-20261011-S02** | Santé Canada, [Glutamate monosodique (GMS) et autres sources de glutamate dans les aliments](https://www.canada.ca/fr/sante-canada/services/aliments-nutrition/salubrite-aliments/additifs-alimentaires/foire-questions-glutamate-monosodique.html). | Official French counterpart uses `glutamate monosodique (GMS)`, differentiates glutamate in foods from the directly added substance, and lists `sauce soya`, `extraits de levure autolysée`, and `protéines végétales hydrolysées` as other sources. No health or measurement guidance is copied into the catalog. |
| **WP05-MSG-20261011-S03** | OQLF, [glutamate monosodique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17561263/glutamate-monosodique). | The term list includes `glutamate monosodique`, `glutamate de sodium`, and `MSG`. The entry is in the medical domain and dates to 1993; it is used here for terminology only, not for its medical description. |
| **WP05-MSG-20261011-S04** | CFIA, [List of ingredients and allergens on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/list-ingredients-and-allergens). | The ingredient-declaration rules identify “glutamic acid or its salts, includes monosodium glutamate (MSG)” among components that must be declared in applicable preparations and mixtures. This supports keeping MSG distinct from a seasoning or flavour-enhancer preparation that contains it; it does not imply those mixtures share one composition. |
| **WP05-MSG-20261011-S05** | Metro Canada, [Accent All Natural Flavour Enhancer 128 g](https://www.metro.ca/en/online-grocery/aisles/pantry/herbs-spices-sauces/herb-spice-blends/all-natural-flavour-enhancer/p/047800000922), product 047800000922. | English retailer display and ingredient panel identify the specific SKU and declare `Monosodium glutamate`. The page showed the selected product out of stock at access time; this is retailer listing evidence, not a guarantee about current packaging or other Accent products. |
| **WP05-MSG-20261011-S06** | Metro Canada, [Rehausseur de saveur entièrement naturel Accent 128 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/fines-herbes-epices-et-sauces/melanges-de-fines-herbes-et-d-epices/rehausseur-de-saveur-entierement-naturel/p/047800000922), same product number. | French retailer display and ingredient panel identify the corresponding SKU and declare `Glutamate monosodique`. Like S05, it is product-specific retailer evidence and does not establish a generic alias for the brand or product-function label. |

## Limits and follow-up

- Integrate only the identity row. Do not add recipe links, forms, measurements, unit mappings, package yields, conversions, or substitutions.
- Keep the wider Section T item open for nutritional yeast, yeast extract, bouillon powder, seasoning salt, and mushroom seasoning.
- This is a proposal-only documentation change. No tests or emulator run was needed.

**Encoding:** UTF-8 without BOM; French accents are preserved as UTF-8 text.

## Integration disposition

Integrated as `ingredient-ref-monosodium-glutamate` with the identity and aliases above. The shared ledger uses Health Canada EN/FR, OQLF, and CFIA sources S01–S04. Metro retailer sources S05–S06 were not carried into the shared ledger because the listing pages could not be independently retrieved during integration review; the identity and alias decision is supported by S01–S04. No recipe link or numeric behavior was added.
