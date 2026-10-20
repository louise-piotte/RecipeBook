# WP04 Section P — generic fish-powder market-boundary review (R190)

- **Review/source access date:** 2026-10-16.
- **Recommendation:** Keep generic `fish powder / poudre de poisson` unallocated for now. Do not add a reference, alias, form, or new ledger candidate.
- **Scope:** The generic culinary product phrase only. Keep the active Bonga-specific dried-fish powder, held anchovy powder, powdered dried bonito, fish stock and compound stock powders, fish balls, fish tofu, surimi, and feed-grade fish meal separately scoped.
- **Status:** Integrated as an R190 documentation-only hold. The Section P checklist, roadmap, and integration README were updated; active catalog and ledger data remain unallocated.
- **New source IDs:** `WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S01` through `S11`; the prefix was checked against the live ledger and proposal/batch archive. Existing Bonga source `WP04-BONGA-POWDER-20261011-S02` is reused without reassignment.

## Recommendation and scope

Keep the generic row held. Current Canadian and Québec retail pages establish that `Fish Powder` and `Poudre de poisson` are live food-retail names. A current Canadian marketplace listing for a seller-named Mangne product gives the strongest product description: the seller says it is made from dried fish, finely ground, and used as a seasoning in sauces, stews, soups, and marinades [S01–S02]. Québec and Moncton retailers also list a generic `Poudre de Poisson` or `Poudre de poisson` product [S03–S05], and a Richmond seller lists a Japanese-origin `Fish Powder` for Canadian shipping [S06].

The sources do not yet establish that those unqualified listings share one product specification. The Mangne page is seller copy, not a package ingredient panel; it does not identify the fish, confirm whether the powder contains only fish, or describe bones, salt, or other processing. The Québec and Moncton pages provide no species, ingredients, or process, and Ng Fung's listing provides no composition or use. They therefore corroborate the names and market presence, but not one cross-retailer ingredient scope. Keep any future generic concept limited to a documented, human-food, directly used dried-fish powder; do not infer that every retail title has that composition.

The French market display `poudre de poisson` is source-attested and is suitable to reconsider if a row is later accepted. No OQLF food-product entry for that phrase was found in the targeted terminology review. OQLF's adjacent `farine de poisson` entry translates as `fish meal`, describes drying and grinding whole fish or fish parts from different species, and states poultry-feed use [S10]. CFIA's current bilingual livestock-feed table separately defines `fish meal / farine de poisson` as a feed ingredient [S08–S09]. Keep `farine de poisson` and `fish meal` out of names and aliases for a culinary row.

## Product boundaries

| Product or wording | Source-supported scope | Catalog treatment |
|---|---|---|
| Generic retail `fish powder / poudre de poisson` | Current sellers use these names for food products. Only the Mangne seller listing states dried, finely ground fish for direct seasoning; the other generic listings omit composition and preparation [S01, S03–S06]. | Keep generic identity unresolved until the product class is confirmed across a package or matched source set. `Poudre de poisson` remains a candidate French display, not an OQLF-standardized food term. |
| Bonga dried-fish powder | The active Montréal seller-specific row is `Bonga dried fish powder / poudre de poisson Bonga`, with no aliases. Its listed ingredient is dried and smoked Bonga fish, ground [reused `WP04-BONGA-POWDER-20261011-S02`]. | Keep `ingredient-ref-bonga-dried-fish-powder` narrowly named. Do not use Bonga as evidence for generic species scope or make the generic phrase an alias. |
| Anchovy powder | The prior review held `anchovy powder / poudre d’anchois`: culinary sources use it for ground anchovy, while current Canadian prepared-food ingredient lists use an anchovy-extract/carrier/salt blend; no reviewed Canadian or Québec standalone package resolves this [existing anchovy-powder review]. | Keep it outside the generic row and out of `ingredient-ref-anchovy` names, aliases, and forms. |
| Fish-stock or broth powder | Garno's Québec-made `Fumet de poisson 340-g` lists `Poisson en Poudre / Fish Powder` among salt, dextrose, flour, yeast extract, maltodextrin, starch, MSG, sugar, and other ingredients. Its 25 g per 1 L direction applies to this complete stock blend [S07]. | Do not treat the powder phrase nested in a compound stock seasoning as a standalone fish ingredient. Keep it separate from active liquid `fish stock / fumet de poisson`. |
| Feed-grade fish meal | CFIA defines fish meal in the livestock-feed table; OQLF pairs the feed/fisheries term `farine de poisson` with `fish meal` [S08–S10]. Its dry-and-ground process can resemble food-powder descriptions, but intended feed use and product naming are distinct. | Do not alias culinary `fish powder` to `fish meal / farine de poisson`. No generic feed-meal reference is active. |
| Dried-bonito powder | `ingredient-form-dried-bonito-powder` is attached to the separate `ingredient-ref-dried-bonito` identity. | Keep species/product-specific; do not generalize it to fish powder. |
| Fish balls, fish tofu, crab-flavoured pollock flakes, surimi, and surimi shreds | Existing formed-fish or pollock-product identities and the held generic surimi boundary are separate from powder. | Do not create powder aliases, forms, or substitutions on these records. |

## Live ownership and picker audit

At the review snapshot, the package had **1,570 ingredient references**, **122 forms**, **61 legacy-import candidates**, **1,915 research-ledger records**, and **114 manifest-listed recipes**. The two reference additions made during the research window were included in the final count; the relevant ownership check was rerun against the live files.

| Surface | Current exact owner/state | Result |
|---|---|---|
| Active exact names and aliases | No generic `fish powder`, `dried fish powder`, `poudre de poisson`, `poisson en poudre`, `fish meal`, or `farine de poisson` row exists. `ingredient-ref-bonga-dried-fish-powder` owns the displayed names `Bonga dried fish powder / poudre de poisson Bonga`, with no aliases. | Bonga's displayed words create phrase matches; generic ownership is not allocated. |
| Active forms | No fish-powder form is attached to Bonga, anchovy, fish stock, fish balls, or fish tofu. The sole adjacent powder form is `ingredient-form-dried-bonito-powder` under `ingredient-ref-dried-bonito`, with English match terms `bonito powder` and `katsuobushi powder`. | No generic powder form or powder form on an adjacent identity can be reused. |
| Legacy import | The 61-candidate file has no exact generic fish-powder or fish-meal candidate name/alias. | No legacy identity owns the proposed phrases. |
| Research ledger | No `candidate-fish-powder`, generic fish-powder reference, or powder-form record exists. The verified Bonga reference's accepted decision explicitly keeps generic fish powder unresolved; `ingredient-ref-fish-stock` is a distinct verified stock identity. `candidate-surimi-product-boundary` remains `needs_clarification` and is unrelated. | No generic candidate or ledger record is being adopted from incidental mentions in other records. |
| Adjacent active references | `ingredient-ref-anchovy` (`anchovy / anchois`), `ingredient-ref-anchovy-paste` (`anchovy paste / pâte d’anchois`), `ingredient-ref-fish-stock` (`fish stock / fumet de poisson`), `ingredient-ref-fish-balls`, `ingredient-ref-fish-tofu`, and `ingredient-ref-dried-bonito` retain their current owners. | None is an alias owner, form owner, or supported substitute for generic fish powder. |

`IngredientSearch.kt` normalizes accents and punctuation, first returns all full contiguous phrase matches across reference names, aliases, and attached form terms, then falls back to substring matches. It does not rank a qualified name over an unqualified query. Current phrase-query results are:

| Query | Current picker result |
|---|---|
| `fish powder` | `ingredient-ref-bonga-dried-fish-powder` only |
| `poudre de poisson` | `ingredient-ref-bonga-dried-fish-powder` only |
| `dried fish powder` | `ingredient-ref-bonga-dried-fish-powder` only |
| `poudre de poisson Bonga` | `ingredient-ref-bonga-dried-fish-powder` only |
| `fish stock powder`, `fish broth powder`, `poisson en poudre` | No result |
| `anchovy powder`, `poudre d’anchois` | No result |
| `fish meal`, `farine de poisson` | No result |
| `fumet de poisson` | `ingredient-ref-fish-stock` only |

The generic phrases match Bonga through its displayed names, not aliases. If a generic row were accepted with the names proposed below, `fish powder` and `poudre de poisson` would return both the generic row and Bonga; they would not resolve automatically to either. A source line naming Bonga could still select the Bonga row. Keep generic recipe lines unlinked while the active row is held.

## Full recipe-corpus demand

The manifest lists **114 recipe JSON files with 1,123 ingredient rows**. A case-insensitive scan of every listed recipe's JSON strings and ingredient rows found **zero** references to `fish powder`, `dried fish powder`, `powdered fish`, `poudre de poisson`, `poisson en poudre`, `fish meal`, `farine de poisson`, `fish stock powder`, `fish broth powder`, `anchovy powder`, `poudre d’anchois`, or Bonga powder. No recipe-specific identity, amount, or substitution can be linked.

## Numeric and substitution evidence

The market pages show package amounts of **250 g** for the Mangne seller listing [S01], **100 g** on Alièfè's generic listing [S03], and **1 kg** for Ng Fung's Japanese-origin SKU [S06]. These are product package sizes, not cooking measures, density, or conversions. The Bonga seller's **1–2 tablespoons** instruction is specific to the Bonga product and does not support a generic amount [reused `WP04-BONGA-POWDER-20261011-S02`]. Garno's **25 g per 1 L** direction reconstitutes its complete multi-ingredient fumet blend, not pure fish powder [S07].

No source supports a generic mass/volume mapping, density, serving measure, dry-to-cooked yield, stock yield, or equivalent dose. No substitution is supported among generic fish powder, Bonga powder, anchovy powder or extract blends, fish-stock powders, liquid fish stock, fish sauce, dried-bonito powder, fish balls, fish tofu, or surimi. Add no measurement, mapping, conversion, recipe link, yield, or substitution.

## Proposed reference and ledger mapping if later accepted

This is a contingent mapping only; do not allocate it under the current hold.

| Field | If a later source review accepts the generic class |
|---|---|
| Reference ID | `ingredient-ref-fish-powder` |
| Category | `PROTEIN` |
| English/French display | `fish powder` / `poudre de poisson` |
| Aliases | None. In particular, do not add `fish meal`, `farine de poisson`, `poisson en poudre`, `dried fish`, `anchovy powder`, or `Bonga powder` without direct evidence. |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` |
| Forms and recipe links | None |
| Ledger | `recordId: ingredient-ref-fish-powder`; `recordType: ingredient_reference`; `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: researched_no_supported_substitute`. Register only product-matched sources and an accepted decision defining the human-food dried-fish powder boundary. |
| Existing Bonga ledger decision | Update its generic-boundary wording so it distinguishes the named Bonga identity from the newly accepted generic row; keep the Bonga row and its aliases unchanged. |
| Numeric/substitution data | None. Record package sizes or product-only directions, if desired, as source-bounded observations only. |

Do not create a generic `candidate-*` ledger record while held; the earlier hold deliberately left no candidate allocated. The mapping above is not an instruction to edit shared data.

## Reopen conditions

Reopen when a manufacturer/package label or a matched Canadian/Québec source set establishes the composition and process of unqualified culinary `fish powder` across the same class, confirms the French display for that class, and distinguishes it from species-named powders, stock/bouillon blends, and feed-grade fish meal. A recipe that names a particular product or species can also reopen a narrower item. New package weights or a seller's spoon direction alone are not reusable quantity or substitution evidence.

## Source register

New pages were accessed on 2026-10-16. Retail pages document the seller's current title and claims; marketplace copy is not treated as an independently verified package label.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S01** | Afrik’ici, [250 g Poudre de Poisson Mangne](https://www.afrikici.com/products/250g-poudre-de-poisson-mangne-epice-traditionnelle-savoureuse-pour-sauces-et-ragouts) | Current CAD listing, in stock, sold by Dija Boutique. Seller describes dried fish finely ground and use in sauces, stews, soups, and marinades; no species or ingredient panel. |
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S02** | Afrik’ici, [About the Canadian marketplace](https://www.afrikici.com/pages/a-propos-de-nous) | Platform identifies itself as a Canadian marketplace connecting independent sellers and buyers. This establishes the marketplace context, not the seller's or product's place of manufacture. |
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S03** | Alièfè Épicerie Africaine, [current catalogue](https://aliefeepicerieafricaine.com/Catalogue) | Québec City delivery storefront lists `Poudre de Poisson (100 g)` beside a distinct `Poudre de Crevette (175 G)`. No ingredient, species, or process details are supplied. |
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S04** | Épicerie Loumo, [Poudre de poisson listing](https://loumostore.ca/en/produit/poudre-de-poisson/) | Current listing titled `Poudre de poisson`, in stock, with in-store pickup; no weight, species, ingredients, or process. |
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S05** | Épicerie Loumo, [contact and Moncton address](https://loumostore.ca/contactez-nous/) | Identifies the retailer at 257 McLaughlin Dr, Moncton, New Brunswick. Used only to place S04 in the Canadian retail market. |
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S06** | Ng Fung Foods, [Fish Powder](https://ngfungfood.com/en/home/279-fish-powder.html) | Richmond retailer lists a 1 kg `Fish Powder`, product of Japan, and says it can arrange shipping within Canada. No species, ingredients, processing, use, or French display appears on the accessible page. |
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S07** | Les Épices Garno, [Fumet de poisson](https://www.garno.com/boutique/produits-complementaires/fumet-de-poisson) | Québec manufacturer's 340 g multicomponent stock blend lists `Poisson en Poudre / Fish Powder` as one ingredient and gives 25 g/L instructions for the whole blend. Not a standalone fish powder specification. |
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S08** | CFIA, [Canadian Feed Ingredients Table (English)](https://inspection.canada.ca/en/animal-health/livestock-feeds/documents-incorporated-reference/canadian-feed-ingredients-table?wbdisable=false) | The livestock-feed table defines `Fish meal` (1-301-049) as a rendered product of clean, undecomposed whole fish or fish cuttings; feed tables and specifications are not culinary powder evidence. |
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S09** | CFIA, [Tableau canadien des ingrédients des aliments du bétail](https://inspection.canada.ca/fr/sante-animaux/aliments-du-betail/documents-incorporer-renvoi/tableau-canadien-ingredients-aliments-du-betail) | French livestock-feed table defines `Farine de poisson` (1-301-049) as a rendered fish-tissue feed ingredient. Keep this French feed term separate from the retail food phrase `poudre de poisson`. |
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S10** | OQLF, [farine de poisson (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084085/farine-de-poisson) | Pairs `farine de poisson` with `fish meal`; defines dried and ground whole fish or fish parts from multiple species and notes poultry-feed use. The page was last updated in 1990 and does not define the current human-food retail phrase `poudre de poisson`. |
| **WP04-SECTIONP-GENERIC-FISH-POWDER-R190-20261016-S11** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Current Canadian fish-labeling guidance provides common-name context. It does not supply a culinary identity specification for generic fish powder. |
| **WP04-BONGA-POWDER-20261011-S02** *(reused)* | Marché Mamou, [Poudre de poisson Bonga de Guinée, 200 g](https://commande.marchemamou.com/p/poudre-de-poisson-bonga-de-guinee-200-g?lang=en) | Existing source already registered to the Bonga identity. The Montréal seller names a specific Bonga product and describes dried, smoked Bonga fish ground into powder with product-specific use directions; it does not define generic fish powder. |

Existing adjacent records reviewed: [generic fish-powder product-scope review](wp04-section-p-generic-fish-powder-product-scope-review-20261012.md), [generic fish-powder hold integration](../batches/wp04-section-p-generic-fish-powder-search-hold-integration-20261012/README.md), [Bonga identity review](wp04-section-p-fish-powder-identity-boundary-review-20261011.md), [anchovy-powder boundary review](wp04-section-p-anchovy-powder-product-boundary-review-20261012.md), [katsuobushi-powder form review](wp04-section-p-katsuobushi-powder-form-review-r75-20261013.md), and [R189 generic-surimi market review](wp04-section-p-generic-surimi-market-identity-review-r189-20261016.md).
