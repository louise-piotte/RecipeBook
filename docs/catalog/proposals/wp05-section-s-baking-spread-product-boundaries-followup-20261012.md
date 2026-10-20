# WP05 Section S — baking-spread and butter-alternative boundaries follow-up

- **Review date:** 2026-10-12
- **Status:** proposal-only; no canonical or shared files changed
- **Scope:** remaining baking-spread and butter-alternative wording after the animal-fat, shortening, margarine, and coconut-oil integrations

## Recommendation

Add no new identity or alias in this slice. Retain the existing, distinct identities for lard, vegetable shortening, margarine, and coconut oil. Keep generic `baking spread`, `plant butter` / `beurre végétal`, and `butter alternative` wording held until an exact recipe line or source product selects a stable product class. The corpus has no ingredient demand for those phrases or for shortening or lard. All six margarine rows already point to the active margarine reference.

| Wording or identity | Current state | Recommendation and boundary |
|---|---|---|
| Lard | Active `ingredient-ref-lard`: `lard / saindoux`; separate leaf lard and rendered pork fat identities are also active | Retain. Do not alias lard to vegetable shortening, margarine, butter, or generic shortening. No recipe links. |
| Vegetable shortening | Active `ingredient-ref-shortening`: `vegetable shortening / shortening végétal`; no aliases | Retain. Keep distinct from lard and margarine. Do not add bare `shortening`, `graisse végétale`, or `matière grasse` as aliases. |
| Margarine | Active `ingredient-ref-margarine`: `margarine / margarine`; no aliases | Retain and preserve all six existing recipe links. Do not add `baking spread`, `plant butter`, `butter alternative`, or `beurre végétal` as aliases. |
| Baking spread / plant butter / butter alternative | No active or legacy owner, and no exact recipe-row demand | Hold without a generic identity. The Québec-facing manufacturer evidence shows product-specific names and differing product/category language; it does not define one universal spread class. Do not alias these terms to margarine, dairy butter, or vegetable shortening. |
| Coconut oil | Active generic `ingredient-ref-coconut-oil` and `ingredient-ref-virgin-coconut-oil` | Keep the single unqualified recipe line on generic coconut oil. The earlier regional-oil review already added virgin coconut oil and held refined/deodorized coconut distinctions; do not reopen them here. |

This is an identity and naming review only. It proposes no forms, numeric values, conversions, substitutions, package yields, or recipe edits.

## Repository and owner audit

I read `AGENTS.md`, the open Section S checklist and workflow entries, the completed [animal-fats and margarine batch](../batches/wp05-section-s-animal-fats-integration-20261012/README.md), [poultry-fat batch](../batches/wp05-section-s-poultry-fats-integration-20261012/README.md), and [regional-oil batch](../batches/wp05-section-s-regional-oils-integration-20261012/README.md), plus the [animal-fat/spreads proposal](wp05-section-s-animal-fats-spreads-gap-review-20261012.md), its [poultry follow-up](wp05-section-s-animal-fat-poultry-species-followup-20261012.md), and the WP04 [butter-product](wp04-butter-products-identity-review-20261010.md) and [plant-cream/spread boundary](wp04-section-r-plant-cream-spread-product-boundaries-followup-20261012.md) reviews. This working-tree snapshot contains **1,154 active references, 83 forms, 68 legacy candidates, 114 recipes, 1,123 ingredient rows, and 1,456 research-ledger records**; refresh counts before any integration.

- `ingredient-ref-lard` is `lard / saindoux`; `ingredient-ref-leaf-lard` is `leaf lard / saindoux de panne`; and `ingredient-ref-rendered-pork-fat` is separately named `rendered pork fat / graisse de porc fondue`.
- `ingredient-ref-shortening` is now active as `vegetable shortening / shortening végétal`; it was promoted from its stable legacy ID. Its alias arrays are empty. No `shortening`, `baking spread`, or plant-butter legacy candidate remains.
- `ingredient-ref-margarine` is active as `margarine / margarine`, with empty alias arrays. Its ledger identity is verified from the CFIA compositional standard. No separate baking-spread or butter-alternative record was found.
- Active `ingredient-ref-coconut-oil` remains the owner for unqualified coconut oil; `ingredient-ref-virgin-coconut-oil` owns only virgin-qualified wording. Refined/deodorized coconut remains a prior held boundary, not a new identity for this review.
- No current form matches shortening, margarine, baking spread, plant butter, or a butter-alternative class. Other uses of “spread” are product-specific existing references (for example, sweetened chestnut spread and hazelnut spread with cocoa) or an alias on maple butter (`maple spread`); do not assign bare `spread` or `tartinade` to a fat identity.
- The active butter identities and their WP04 distinctions remain unchanged. A plant-butter product name is not a license to alias a dairy-butter identity, ghee, margarine, or vegetable shortening.

## Recipe-demand scan

The scan covered every `ingredients[]` row in all **114 manifest-listed recipes / 1,123 ingredient rows**, searching original wording, normalized ingredient name, reference ID, and notes for shortening, lard, margarine, baking spread, plant butter, butter alternative, relevant French phrases, and coconut-oil wording.

- **Shortening / vegetable shortening / lard:** zero ingredient-row matches.
- **Baking spread / plant butter / butter alternative / beurre végétal / tartinade:** zero ingredient-row matches.
- **Margarine:** six rows; all are already linked to `ingredient-ref-margarine`:

| Recipe | Exact row ID | Existing link |
|---|---|---|
| Chocolate Chip Cookies | `3e2bd9d9-95fc-43ea-8d33-140de5b7de25-ingredient-1` | `ingredient-ref-margarine` |
| Beef Stroganov | `e1e7939b-206f-4839-97d9-2a91febb28eb-ingredient-3` | `ingredient-ref-margarine` |
| Chocolate Galettes | `3a206140-a145-4871-92c6-7024ce958858-ingredient-5` | `ingredient-ref-margarine` |
| Mango Cake | `9ec55a0a-92b7-425d-9d7f-1a9a455022bb-ingredient-5` | `ingredient-ref-margarine` |
| Double Chocolate Muffins | `81d376ac-c305-402f-a73d-8bb721045319-ingredient-5` | `ingredient-ref-margarine` |
| Chocolate Syrup | `43dd1f6e-ab29-4365-bfee-a7ecb0d6309b-ingredient-5` | `ingredient-ref-margarine` |

- **Coconut oil:** one optional, unqualified row in Buckeyes remains linked to `ingredient-ref-coconut-oil`; no virgin/refined/deodorized qualifier is present. The separate virgin-coconut identity has no exact recipe-line demand in this scan.

No recipe link change is warranted. In particular, the existing margarine rows do not justify remapping the product to butter or vegetable shortening, and no current row establishes a plant-based or baking-specific alternative.

## Québec / Canadian naming and product-state findings

**Shortening and lard remain separate.** The current Canadian Food Compositional Standards, [English Volume 8](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) and [French Volume 8](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), define shortening as a semi-solid food prepared from fats/oils other than butter or lard and define margarine separately as a water-in-fat/oil emulsion. This supports retaining the active IDs as distinct identities. It does not establish that recipes can exchange them.

OQLF's [graisse alimentaire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/24198175/graisse-alimentaire) entry says English `shortening` is used in French for several solid cooking fats, from animal or vegetable sources, and recommends a context-specific French name. Current Canadian/Québec product pages from [Crisco Canada](https://criscocanada.com/product/all-vegetable-shortening/) and [Mayrand](https://mayrand.ca/fr/nos-produits/epicerie/ingredient-de-patisserie/shortening-et-saindoux/shortening-vegetal-crisco-00981) support the specific product wording `vegetable shortening` / `shortening végétal`. The manufacturer also titles its French product [Shortening Tout Végétal](https://criscocanada.com/fr-ca/produit/all-vegetable-shortening/). Keep the active display narrow and do not infer broad aliases such as `graisse végétale` or bare `shortening`.

**“Baking spread” is not a stable class in this corpus.** The inspected CFIA standard has named entries for shortening, margarine, and calorie-reduced margarine, but an unqualified recipe phrase `baking spread` would not identify which product is intended. There is no such recipe line here. Keep it held until an exact line or product source supplies a usable name and state.

**Butter-alternative branding is product-specific.** Becel Canada currently markets `Plant Butter` on its English site and `beurre végétal sans produits laitiers` on its French-Canada site. Its French product navigation groups the product under both `Margarines` and `Briques à base de Plantes`, while the English brand FAQ describes a different taste/consistency from Becel margarine. Its pages also market it for cooking and baking. These are useful examples of current Canadian wording, but one manufacturer's label and product family cannot establish a generic `plant butter`, `beurre végétal`, or `baking spread` alias. Do not transfer the product-specific butter-replacement claim into catalog substitution behavior. [S03–S05]

**Coconut oil is already covered.** The regional-oils integration added the exact identity `virgin coconut oil / huile de noix de coco vierge` while retaining generic `coconut oil / huile de coco` for unqualified wording. That integration held refined/deodorized product mapping because its bilingual product pages conflict on wording. This review preserves those decisions and the one generic coconut-oil recipe link without duplicating the earlier evidence.

## Source register and limits

Sources were checked on 2026-10-12. Proposal-local IDs below are not ledger entries; in-text `S##` citations use the `WP05-S-BAKING-SPREAD-FOLLOWUP-20261012-` prefix in the register.

| ID | Source | Supports and limits |
|---|---|---|
| `WP05-S-BAKING-SPREAD-FOLLOWUP-20261012-S01` | CFIA, [Canadian Food Compositional Standards, Volume 8 — English](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Current incorporated standard, §§8.3.1–8.3.3. Defines shortening, margarine, and calorie-reduced margarine. Used for product-class boundaries; no numeric criteria are carried into the catalog. |
| `WP05-S-BAKING-SPREAD-FOLLOWUP-20261012-S02` | CFIA, [Normes canadiennes de composition des aliments, Volume 8 — français](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0) | French counterpart; uses `shortening`, `saindoux`, `margarine`, and `margarine réduite en calories` in the corresponding classes. Does not provide a generic baking-spread identity. |
| `WP05-S-BAKING-SPREAD-FOLLOWUP-20261012-S03` | OQLF, [graisse alimentaire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/24198175/graisse-alimentaire) | Québec usage note shows that English `shortening` can cover multiple plant and animal fats in French. The entry dates to 2013; specific current product wording is corroborated with manufacturer and retailer sources. |
| `WP05-S-BAKING-SPREAD-FOLLOWUP-20261012-S04` | Becel Canada, [Plant Butter FAQ](https://www.becel.ca/en-ca/skip-the-cow) and [French Beurre végétal page](https://www.becel.ca/fr-ca/skip-the-cow) | Current manufacturer wording and product-specific marketing for plant butter/baking use; the FAQ distinguishes its product from the brand's margarine. This does not define all products sold as plant butter or baking spread. |
| `WP05-S-BAKING-SPREAD-FOLLOWUP-20261012-S05` | Becel Canada, [English unsalted Plant Butter](https://www.becel.ca/en-ca/products/plant-butter/dairy-free-becel-plant-butter-unsalted) and [French beurre végétal non salé](https://www.becel.ca/fr-ca/products/plant-butter/dairy-free-becel-plant-butter-unsalted) | Current bilingual product title and ingredients for one Canadian SKU. Product formulation and marketing do not establish a global ingredient alias or substitution rule. |
| `WP05-S-BAKING-SPREAD-FOLLOWUP-20261012-S06` | Crisco Canada, [All-Vegetable Shortening](https://criscocanada.com/product/all-vegetable-shortening/) and [Shortening Tout Végétal](https://criscocanada.com/fr-ca/produit/all-vegetable-shortening/); Mayrand, [Shortening végétal Crisco](https://mayrand.ca/fr/nos-produits/epicerie/ingredient-de-patisserie/shortening-et-saindoux/shortening-vegetal-crisco-00981) | Current Canadian manufacturer and Québec retail naming for the existing vegetable-shortening identity; claims and composition remain SKU-specific. |
| `WP05-S-BAKING-SPREAD-FOLLOWUP-S07` | RecipeBook, [WP05 regional-oils integration](../batches/wp05-section-s-regional-oils-integration-20261012/README.md) | Records the already-integrated virgin-coconut name, generic unqualified coconut-oil behavior, and held refined/deodorized mapping. |

This is a bounded terminology review, not a full Canadian-market survey. Product names, marketing claims, and ingredient panels describe those SKUs only; they do not establish a shared composition, global alias, recipe match, or substitution. No tests or emulator checks were run for this proposal-only review.
