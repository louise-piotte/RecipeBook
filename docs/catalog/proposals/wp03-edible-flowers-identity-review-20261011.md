# WP03 Section K — food-bounded edible-flower identity review

## Scope and coordinator decision

- **Review date:** 2026-10-11
- **Scope:** food-grade hibiscus calyces, culinary lavender, rose petals, and cultivated nasturtium flowers; English/Québec French names; species and edible-part boundaries; existing catalog and recipe demand.
- **Disposition:** integrate four identity-only references. Keep ornamental flowers and a generic `edible flowers` match out of the catalog.
- **Deferred:** other documented flowers, flower-specific product forms, measurements, densities, unit mappings, conversions, package yields, substitutions, and recipe links.

## Catalog and recipe audit

The review began with 1,012 active references, 66 forms, and 75 legacy candidates. It searched all 114 manifest-listed recipes and 1,123 ingredient rows for rose petals, rose syrup/hips, lavender, hibiscus/roselle, nasturtium/capucine, and the botanical or product terms used in the source review. No matching recipe ingredient rows were found. No recipe was changed or linked.

The live catalog had no exact name or alias for culinary lavender, rose petals, nasturtium flowers, or dried Hibiscus sabdariffa calyces. Two nearby entries were retained as distinct identities: `ingredient-ref-rose-syrup` is a prepared sweetener, and `ingredient-ref-mashua` is the *Tropaeolum tuberosum* tuber (`capucine tubéreuse` / `tuberous nasturtium`). No broad alias is proposed that would merge either product with flower petals.

## Identity decisions

| Stable ID | English display | Québec French display | Category | Boundary |
| --- | --- | --- | --- | --- |
| `ingredient-ref-culinary-lavender` | `culinary lavender` | `lavande culinaire` | `HERB` | Food-grade *Lavandula angustifolia* flowers. Do not match ornamental lavender products, essential oil, or extract. |
| `ingredient-ref-nasturtium-flowers` | `nasturtium flowers` | `fleurs de capucine` | `VEGETABLE_AND_AROMATIC` | Source-qualified cultivated flower product, supported as *Tropaeolum majus*. Keep mashua and tuberous nasturtium separate; do not alias bare `nasturtium` or `capucine`. |
| `ingredient-ref-rose-petals` | `rose petals` | `pétales de rose` | `VEGETABLE_AND_AROMATIC` | Culinary rose petals. Keep rose hips, rose syrup, rose water, and non-food floral products separate; do not use bare `rose` as an alias. |
| `ingredient-ref-roselle-calyces` | `dried hibiscus calyces` | `calices d'hibiscus séchés` | `VEGETABLE_AND_AROMATIC` | The food-grade *Hibiscus sabdariffa* calyx product, commonly sold in Québec as dried hibiscus flowers. Do not broaden to other *Hibiscus* species, leaves, seeds, juice, generic `sorrel`, or plant-level `oseille de Guinée`. |

The nasturtium directory listing uses a 25-flower retail package; that SKU count is not a recipe portion. The rose sources describe both fresh and dried uses, but this identity-only batch does not turn those states into forms. The food-grade lavender listing is a dried product; the catalog retains only its product identity until a measured or recipe-specific need warrants a form.

## Food and plant-part boundary

The sources identify specific culinary products and edible plant parts. They do not make every flower edible or establish that an ornamental plant was grown for food. The University of Florida IFAS and Colorado State University Extension advise using correctly identified flowers grown for consumption and not using treated florist or garden-center flowers. That guidance is recorded in this review only; no app safety claims or generic edible-flower aliases are added.

For roselle, OQLF’s `oseille de Guinée` entry is a plant name for *Hibiscus sabdariffa*, not a calyx-product label. New Montréal and Canadian retail listings support the local product wording `fleurs d'hibiscus`; extension guidance identifies the calyx as the usual edible part. This resolves the product-name gap without activating `oseille de Guinée`, `oseille`, or `sorrel` in the ingredient picker.

## Sources

New sources recorded in the research ledger:

- `WP03-FLOWERS-IDENTITIES-20261011-S01` — [OQLF, lavande (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3497962/lavande); French plant term and *Lavandula angustifolia*.
- `WP03-FLOWERS-IDENTITIES-20261011-S02` — [Les Récoltes du Bout d'en Haut, lavande culinaire bio](https://lesrecoltesduboutdenhaut.ca/products/fleurs-de-lavande-sechees-pos); Québec food-grade dried flowers of *L. angustifolia* for cuisine and infusion.
- `WP03-FLOWERS-IDENTITIES-20261011-S03` — [Université du Québec à Chicoutimi, rose (*Rosa* sp.)](https://www.uqac.ca/foretnourriciere/les-fleurs-comestibles/rose/); culinary rose-petal uses and separate rose-hip fruit.
- `WP03-FLOWERS-IDENTITIES-20261011-S04` — [Aliments du Québec, pétales de rose sauvage](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/petales-de-rose-sauvage); Québec product name and suggested food uses.
- `WP03-FLOWERS-IDENTITIES-20261011-S05` — [MAPAQ, Répertoire des aliments québécois, fleurs de capucine](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8238689); Québec product listing and named culinary flower parts.
- `WP03-FLOWERS-IDENTITIES-20261011-S06` — [University of Florida IFAS Extension, edible flowers](https://gardeningsolutions.ifas.ufl.edu/plants/ornamentals/edible-flowers/); identifies *Tropaeolum majus*, flower use, the Hibiscus calyx boundary, and food-production cautions.
- `WP03-FLOWERS-IDENTITIES-20261011-S07` — [OQLF, oseille de Guinée (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19471115/oseille-de-guinee); plant-level French name and *H. sabdariffa*.
- `WP03-FLOWERS-IDENTITIES-20261011-S08` — [Umano, fleur d'hibiscus biologique et équitable](https://www.umano.ca/products/fleurs-hibiscus-biologique-equitable); Canadian food product name, botanical identification, and infusion use.
- `WP03-FLOWERS-IDENTITIES-20261011-S09` — [Maad MTL, bissap rouge (Hibiscus)](https://maadmtl.com/products/bissap-rouge-hibiscus); local product, *H. sabdariffa*, and dried hibiscus flower wording for tisane/juice.
- `WP03-FLOWERS-IDENTITIES-20261011-S10` — [University of Florida IFAS Extension, edible flowers](https://gardeningsolutions.ifas.ufl.edu/plants/ornamentals/edible-flowers/); *H. sabdariffa* and its usual edible calyx part.

The roselle candidate also retains its earlier sources: `WP06-CAR-EN-GAP-20261011-S10` (Jamaica Ministry of Agriculture), `WP06-CAR-EN-GAP-20261011-S12` (OQLF), and `WP06-CAR-EN-GAP-20261011-S27` (Visit Trinidad). Those sources establish plant and regional drink context, not a Québec French calyx-product display.
