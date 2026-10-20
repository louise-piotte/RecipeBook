# WP02 Section E R249 — Dried egg forms and meringue powder integration

**Review date:** 2026-10-16
**Disposition:** Integrated.

**Scope:** The Section E checklist entry for meringue powder and dried egg white/yolk. The remaining lecithin, glycerin, food-acid, and other technical-baking inventory remains open.

## Integration

Added `ingredient-form-egg-white-dried` under the existing egg-white identity and `ingredient-form-egg-yolk-dried` under the existing egg-yolk identity. The English displays follow CFIA’s standardized `Dried Egg White` / `Dried Yolk` wording; the French labels use CFIA common names `poudre de blanc d’œuf` and `poudre de jaune d’œuf`. Powdered and albumen phrases remain form search terms, not base-reference aliases [S01–S04]. A Québec retail listing independently attests `Poudre de blanc d’œuf`, but its page did not expose a complete ingredient declaration during review [S05].

Added `meringue powder / meringue en poudre` as a separate `BAKING_MIXIN_AND_PANTRY` identity. Metro’s French product listing supplies the Québec-facing product name and a Wilton ingredient declaration containing egg-white powder along with corn starch, sugar, gum, salts, acid, flavour, and other ingredients. This confirms the compound product boundary; it is not interchangeable by identity with pure dried egg white [S06].

## Numeric and substitution boundary

- All three active references/forms have null density and no unit mappings. No general powder measure, reconstitution ratio, or conversion was added.
- Three package amounts (La Guilde 50 g, Caneggs 2 kg, and Wilton 113 g) are recorded only as product-specific ledger observations. Metro’s Wilton listing showed out of stock at review; its package amount is not a generic serving or dose.
- Caneggs says its yolk powder is entirely dehydrated egg yolk, lists a 2 kg package and a 1-part-powder to 1.25-parts-water reconstitution direction. The ratio basis is unspecified and the page does not equate the result to a fresh-yolk amount, so no conversion or replacement rule was added [S07]. The page also contains an erroneous parenthetical “albumen” beside egg yolk; it is not copied into active data.
- Wilton’s instructions give 2 tsp meringue powder plus 2 tbsp water to replace one egg white for stiff-peak recipes and warn against using this as a general egg substitute in cakes, brownies, cookies, or breads. This remains a brand-specific ledger finding only; no runtime rule was added [S08].
- The 114-recipe bundle contains no lines for dried egg products or meringue powder, so no recipe links were added. The separate `egg substitute` candidate remains untouched.

## Source register

- **S01 — CFIA, Canadian Standards of Identity, Volume 2 – Processed Egg Products:** Sections 3 and 4 distinguish dried yolk from dried egg white/albumen. Last amended 2024-12-18. [English standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-2).
- **S02 — ACIA, Normes d’identité canadiennes, Volume 2 – Produits d’œufs transformés:** French names for dried yolk, egg white, and albumen. [French standards](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-2).
- **S03 — CFIA, Labelling Requirements for Processed Egg Products:** prescribed common names, including “Dried Egg White” or “Dried Albumen.” [CFIA guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/processed-egg-products).
- **S04 — ACIA, Normes d’identité canadiennes, Volume 2:** French prescribed product names. [French standards](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-2).
- **S05 — La Guilde Culinaire, Poudre de blanc d’œuf 50 g:** Québec-facing retail title and package size; direct page returned a cache miss, so the indexed page text was used. [Product listing](https://liguildeculinaire.com/products/poudre-de-blanc-doeuf-en-50gr).
- **S06 — Metro Canada, Meringue en poudre Wilton 113 g:** current French product title and SKU-specific ingredient declaration; listing showed out of stock. [Product listing](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/decorations-et-glacages/meringue-en-poudre/p/020591840885).
- **S07 — Caneggs Canada, Egg Yolk Powder:** single-ingredient product, Canadian origin, package and product-specific reconstitution direction. [Manufacturer page](https://caneggs.com/shop/egg-yolk-powder/).
- **S08 — Wilton, How to Use Meringue Powder:** brand-specific stiff-peak method and limitations. Posted 2021-08-25. [Manufacturer instructions](https://blog.wilton.com/how-to-use-meringue-powder/).
