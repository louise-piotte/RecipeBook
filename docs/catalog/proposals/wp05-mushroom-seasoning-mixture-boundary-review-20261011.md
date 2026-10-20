# WP05 Section T — Mushroom-seasoning identity and mixture-boundary review

- **Packet type:** proposal-only identity, bilingual naming, composition-boundary, and recipe-demand review.
- **Prepared and source-access date:** 2026-10-11.
- **Plan:** Section T, “Individual spices, dried aromatics, salts and seasoning blends”; open mushroom-seasoning item.
- **Recommendation:** add one narrowly scoped, identity-only `mushroom seasoning / assaisonnement aux champignons` reference in `BAKING_AND_SPICE`, with no aliases. No recipe link is warranted.
- **Proposal source IDs:** `WP05-MUSHROOM-SEASONING-20261011-S01` through `S09`. The prefix was checked against the current proposal set and research ledger; no collision was found.

## Coordinator recommendation

**Add one identity-only row** with these proposed fields:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-mushroom-seasoning` |
| English display | `mushroom seasoning` |
| French display | `assaisonnement aux champignons` |
| Aliases | None |
| Category | `BAKING_AND_SPICE` |
| Forms, density, unit mappings, package yields, substitutions | None |
| Recipe links | None |

Use the identity only for a savory seasoning product explicitly named or marketed as **mushroom seasoning**, with mushrooms or mushroom-derived ingredients as its defining flavor. This product-name boundary is needed because current examples differ in mushroom species, added salt and flavorings, extraction, and physical presentation. The row must not imply one recipe, salt content, nutrition profile, dry state, serving amount, or substitution behavior.

The English product-class name is used by multiple current sellers, including Canadian listings. The OQLF supports *assaisonnement* as the French class term but does not provide a term entry for the exact compound *mushroom seasoning*. The proposed French display is therefore a conservative compound translation, supported by bilingual Canadian usage of *assaisonnement aux champignons* and local Québec usage of *assaisonnement champignon* [S01–S03]. This is product-language evidence, not an OQLF preferred-term ruling.

## Current catalog, ledger, proposals, and collision audit

Snapshot read on 2026-10-11. The audit covered the live reference and form arrays, research ledger, legacy-import candidates, relevant existing proposals, and every recipe named in the bundled-library manifest.

- The active package contains **1,035 references and 72 forms**. It already has a generic `mushroom / champignons` reference, an English `mushrooms` alias, named mushroom identities, and the separate `ground dried candy cap mushrooms / lactaires séchés moulus` identity. No active reference name or alias, nor any form label or match term, is the exact normalized phrase `mushroom seasoning`, `assaisonnement aux champignons`, or another reviewed candidate phrase. No mushroom-seasoning form exists.
- The **75 legacy candidates** include `ingredient-ref-mushrooms` (`mushrooms / champignons`), a duplicate of the active generic mushroom identity. It is not a seasoning candidate. No other legacy candidate is named for mushroom seasoning, mushroom powder, or mushroom bouillon.
- The **1,327-record ledger** has mushroom records for named species and existing mushroom identities, but no record for the mushroom-seasoning product class or the proposed English/French compound. It has no source ID for this proposal’s product identity.
- Exact normalized-key checks across active names/aliases, form labels/match terms, and legacy names/aliases found no full-key collision for `mushroom seasoning`, `assaisonnement aux champignons`, `assaisonnement champignon`, `mushroom spice`, `mushroom powder`, `poudre de champignons`, `shiitake mushroom seasoning`, `mushroom bouillon powder`, or `bouillon de champignon en poudre`. The bare query `mushroom` remains broad because it matches the generic identity and multiple species; `seasoning` also matches several other seasoning rows. Keep the complete proposed phrase in both displays and add no short or broad aliases.
- Relevant prior mushroom work is covered in [WP03’s fungi and seaweed coordinator review](wp03-fungi-seaweed-coordinator-review-20261009.md), [WP03’s Québec mushroom-term review](wp03-mushroom-quebec-term-review-20261010.md), and [WP03’s remaining mushroom-identity review](wp03-remaining-culinary-mushroom-identities-20261009.md). These preserve generic mushroom, named species, and ground dried candy caps as separate identities; they do not establish a mushroom-seasoning identity or a generic mushroom-powder form.
- Adjacent seasoning decisions are in the [WP05 MSG review](wp05-msg-monosodium-glutamate-identity-review-20261011.md), [nutritional-yeast review](wp05-nutritional-yeast-identity-review-20261011.md), [yeast-extract identity review](wp05-yeast-extract-identity-review-20261011.md), [chicken bouillon-powder review](wp05-bouillon-powder-product-boundary-review-20261011.md), and [seasoning-salt review](wp05-seasoning-salt-mixture-boundary-review-20261011.md). They keep the named ingredient or mixture distinct and do not set a mushroom-seasoning formula. The [WP05 East Asian condiment review](wp05-east-asian-condiments.md) also keeps mushroom-flavored prepared sauce separate. The [WP06 East Asia gap sweep](wp06-east-asia-cuisine-gap-sweep-20261011.md) treats Chinese five-spice as its own blend and holds Taiwan’s “five-seasoning powder” wording pending a product crosswalk; neither term is an alias for mushroom seasoning.

## Bundled recipe demand

The manifest lists **114 recipes and 1,123 ingredient rows**. A full scan of each recipe JSON, not just linked ingredient names, found **zero** occurrences of the reviewed mushroom-seasoning phrases in English or French and **zero** ingredient rows linked to a mushroom-seasoning identity. No recipe asks for mushroom seasoning by brand, by product variant, or by a mushroom-bouillon name.

The only direct mushroom ingredient lines are:

| Recipe line | Current ingredient text | Current link | Demand finding |
|---|---|---|---|
| 037#7 | `1 lb white mushrooms, sliced` | `ingredient-ref-mushroom` | Fresh, generic mushrooms; no seasoning product. |
| 037#12 | `extra sauteed mushrooms, to taste` | `ingredient-ref-mushroom` | Generic mushroom garnish/add-in. |
| 089#3 | `1/2 box mushrooms` | `ingredient-ref-mushroom` | Generic mushrooms; package contents are unspecified. |
| 100#2 | `7 g ground dried candy cap mushrooms` | `ingredient-ref-ground-dried-candy-cap-mushrooms` | Named ground dried mushroom ingredient; not a seasoning mixture. |

Other recipe-text hits do not add demand: recipe 021’s “meringue mushrooms” are decorative egg-white confections; recipes 085 and 097 say mushrooms may be added, but do not name or require a mushroom seasoning; recipes 037 and 089 discuss the fresh mushrooms already listed above. No relink, recipe edit, or substitution is proposed.

## Identity and composition boundaries

| Product or wording | Evidence-backed boundary | Proposed treatment |
|---|---|---|
| **Mushroom seasoning** | Products explicitly sold under this name include a mushroom-powder/extract and vegetable-extract mixture with salt and sodium 5′-guanylate [S03–S04]; a dried-mushroom, salt, onion, garlic, celery-seed, and oregano blend [S05]; and an all-mushroom species blend sold as an umami mushroom seasoning [S06]. A Québec frozen-food specification lists a mushroom seasoning component containing milk ingredients, salt, dried mushrooms, sugar, aromatics, spices, yeast extract, hydrolyzed soy protein, flavour, and caramel [S02]. | One identity-only product class is supportable when a product is explicitly named or marketed as mushroom seasoning. Store no ingredient list or universal blend formula. |
| **Mushroom powder / dried mushroom powder** | Powder may be one dried mushroom identity, such as a named species, or one component in a prepared blend. The current catalog has ground dried candy caps but no general mushroom-powder reference or form; prior WP03 reviews leave generic powder/form behavior unestablished. | Do not add `mushroom powder` or `poudre de champignons` as aliases. Do not treat all ground mushrooms as seasoning products. Resolve a future exact ingredient by species, source, and recipe context. |
| **Mushroom bouillon powder** | Lee Kum Kee Canada sells a product explicitly named `Bouillon de champignon en poudre`; its ingredient list includes mushroom powder, salt, maltodextrin, sugar, yeast extract, and nucleotide flavor enhancers, and its stated uses include soup base [S08]. Its savory seasoning uses overlap with mushroom seasoning, but its product label identifies it as bouillon. | Do not make `bouillon`, `stock`, `soup base`, `cube`, or `granules` aliases or forms. Whether a specific bouillon SKU should also resolve to a future mushroom-seasoning row remains unresolved; preserve the exact product name until a recipe or source directly cross-identifies it. |
| **Mushroom gravy or sauce mixes** | Québec retailer listings distinguish mushroom gravy mixes as products for preparing gravy; the reviewed wild-mushroom gravy mix includes starch, flour, cream powder, proteins, mushroom powder, broth, and seasonings [S09]. WP05 East Asian condiment work also keeps mushroom-flavored prepared sauces separate. | Keep gravy mixes and prepared sauces separate from seasoning. Do not map a recipe’s `mushroom sauce`, vegetarian mushroom sauce, or mushroom gravy to this row. |
| **MSG / GMS and yeast extract** | Some mushroom seasonings contain nucleotide enhancers or yeast extract [S02–S04, S08]; some products are marketed as alternatives to MSG [S07]. These component declarations and marketing claims differ by SKU. | The mixture is not MSG or yeast extract. Do not encode MSG status, add either as an alias, or infer an ingredient list from a product claim. Keep existing MSG and yeast-related identities separate. |
| **Seasoning salt and other dry blends** | Some mushroom-seasoning products contain salt; others are mushroom-only blends [S05–S06]. Salt presence does not make the product seasoning salt, nor does a shared savory use make it Chinese five-spice, panch phoron, or a generic umami seasoning. | Keep each product class separate. Do not add `seasoned salt`, `seasoning salt`, `mushroom spice`, `umami seasoning`, or other generic blend names as aliases. |
| **Mushroom extract or mushroom-flavoured soy sauce** | Extract is a possible component, and prior WP05 East Asian work distinguishes prepared mushroom-flavoured sauces from their ingredients. | Do not alias extract or sauces. A mushroom-derived flavour component does not itself identify a seasoning product. |
| **Formats and recipes** | Examples range from powders to concentrated seasoning dices [S04, S07]. The reviewed recipes provide no mass/volume amount or same-product crosswalk for mushroom seasoning. | Add no form, package yield, density, spoon conversion, substitution, or recipe link. Preserve format and dosage at the exact SKU or recipe level if later evidence requires them. |

## Naming and alias disposition

| Language | Proposed display | Aliases | Evidence and limit |
|---|---|---|---|
| English | `mushroom seasoning` | None | Exact product-class wording appears in Canadian listings and a Québec bilingual technical sheet [S02–S06]. Do not promote the narrower `shiitake mushroom seasoning` product wording or the adjacent `Mushroom Spice` brand title to global aliases. |
| French | `assaisonnement aux champignons` | None | OQLF supports the general noun `assaisonnement`, not the exact compound [S01]. A Canadian bilingual ingredient listing uses `Assaisonnement aux champignons`, while a Québec manufacturer’s bilingual specification uses `Assaisonnement champignon` for one component [S02–S03]. The display is a supported, readable compound translation, not a formal OQLF equivalence. |

Do not add `poudre de champignon(s)`, `extrait de champignon`, `bouillon de champignon en poudre`, `sel aux champignons`, `assaisonnement umami`, or `mélange d’épices aux champignons` as aliases. The reviewed sources do not establish them as equivalent labels for the same product class.

## Source-to-claim register

Sources accessed 2026-10-11. Product pages and technical sheets support only the named seller/manufacturer product or component; none establishes a universal recipe for mushroom seasoning.

| Source ID | Source | Supports and limits |
|---|---|---|
| **WP05-MUSHROOM-SEASONING-20261011-S01** | Office québécois de la langue française, [assaisonnement (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095245/assaisonnement). | Defines *assaisonnement* as something used to season food, gives English *seasoning*, and explains that adding salt, flour, or vegetables to spices moves a mixture into the seasoning class. The entry was last updated in 1982 and does not list the exact compound *mushroom seasoning*. |
| **WP05-MUSHROOM-SEASONING-20261011-S02** | Les Aliments Fondue Paysanne inc., [Mini mushroom arancini technical data sheet](https://alimentspaysanne.com/uploads/fiches/PH-FO-34-FT-arancini-champignons.pdf), product 227, issued 2023-05-31, Lévis, Québec, pp. 1–2. | A Québec manufacturer’s bilingual specification pairs English `Mushroom seasoning` with French `Assaisonnement champignon` inside one finished food’s ingredient list. It gives a complex product-specific component formula, not a standalone retail seasoning definition or universal French-term ruling. |
| **WP05-MUSHROOM-SEASONING-20261011-S03** | Harvest to Harmony Vitality, [Dim Sum BBQ Buns](https://harvesttoharmonyvitality.ca/shop/dim-sum-bbq-buns/). | The Canadian bilingual ingredient list pairs `Mushroom seasoning` with `Assaisonnement aux champignons` and lists mushroom powder, mushroom extract, vegetable extract, salt, and sodium 5′-guanylate. It supports the proposed French wording and one component formula only; the page asks readers to verify current package labeling. |
| **WP05-MUSHROOM-SEASONING-20261011-S04** | Haisue, [Po Lo Ku — Shiitake Mushroom Seasoning, 500 g](https://haisue.ca/products/po-lo-ku-shiitake-mushroom-seasoning-500g). | Canadian retailer lists a specific shiitake mushroom seasoning and declares mushroom powder, mushroom extract, vegetable extract, salt, and sodium 5′-guanylate. Supports one product and formulation; not an alias, universal formula, or Québec French display. |
| **WP05-MUSHROOM-SEASONING-20261011-S05** | Click Fork, [The Ugly Barn Farm Mushroom Seasoning](https://www.clickfork.ca/products/prepared-food-n-desserts/condiments/mushroom-seasoning/). | Canadian farm product is named `Mushroom Seasoning`; its formula lists a mix of dried shiitake, oyster, lion’s mane, and chestnut mushrooms, sea salt, onion, garlic, celery seed, and oregano. Supports one locally sold herb/salt blend only. |
| **WP05-MUSHROOM-SEASONING-20261011-S06** | Well.ca, [Woodbloom Umami Mushroom Seasoning Blend — Robust](https://well.ca/products/woodbloom-umami-mushroom-seasoning_366290.html). | Canadian retail listing calls the product a mushroom seasoning blend and lists only lion’s mane, maitake, shiitake, oyster, and chestnut mushrooms as ingredients. This shows that the English product class is not limited to blends with added salt; its recipe is SKU-specific. |
| **WP05-MUSHROOM-SEASONING-20261011-S07** | Hsin Sui Industry Co., Ltd. / Po Lo Ku, [About the manufacturer](https://poloku.com/pages/about/?v=d41d8cd98f00). | Manufacturer describes concentrated shiitake essence in seasoning dices made from concentrated mushroom and vegetable extracts. Supports a non-powder presentation example for this maker, not a general mushroom-seasoning format or exact formula equivalence with the retail product in S04. |
| **WP05-MUSHROOM-SEASONING-20261011-S08** | Lee Kum Kee Canada, [Bouillon de champignon en poudre](https://ca.lkk.com/fr-ca/products/mushroom-bouillon-powder). | Canadian manufacturer’s French page explicitly names a mushroom bouillon powder, lists its ingredients, and describes soup-base use. Supports a separate named boundary, not a synonym or shared composition with mushroom seasoning. |
| **WP05-MUSHROOM-SEASONING-20261011-S09** | Super C, [The Keg Wild Mushroom Gravy Mix](https://www.superc.ca/en/aisles/pantry/herbs-spices-sauces/package-sauces-seasonings/wild-mushroom-gravy-mix/p/695676012688). | Québec retailer lists a prepared dry gravy mix with mushroom powder and other thickening, dairy, broth, and seasoning ingredients. Supports keeping a mushroom gravy mix separate; not evidence for the proposed seasoning’s formula. |

## Disposition

The evidence supports a **new identity-only row** because multiple food products are explicitly named mushroom seasoning, and a Québec manufacturer plus a Canadian bilingual listing show workable French wording. Composition and format variation are substantial, but they do not prevent a named product-class identity when the row is restricted to products actually sold as mushroom seasoning. That variation prevents aliases to mushroom powder, bouillon, gravy, MSG, yeast extract, or broad “umami” products, and it prevents numeric or substitution behavior. The relationship between a mushroom seasoning and a mushroom bouillon SKU remains product-specific and is not resolved globally by this packet.

Coordinator review is complete. The identity-only reference and verified identity-ledger record were integrated; no recipe link, form, numeric behavior, or substitution was added. The checklist item is complete.

**Encoding:** UTF-8 without BOM; French accents and apostrophes are preserved as Unicode text.

## Coordinator integration note

After this packet was prepared, three other Section T identities were integrated. The coordinator rechecked the live package at 1,038 references / 72 forms / 114 recipes / 1,123 ingredient rows and the ledger at 1,330 records before integration. Exact normalized-name/form/legacy collision checks for the reviewed phrases returned zero, the full manifest recipe scan returned zero phrase hits, and all nine proposal source IDs were unused in the research ledger. The active row is `ingredient-ref-mushroom-seasoning`, category `BAKING_AND_SPICE`, with English `mushroom seasoning`, French `assaisonnement aux champignons`, and no aliases. The identity-ledger record cites all nine sources. See the [integration README](../batches/wp05-mushroom-seasoning-identity-integration-20261011/README.md).
