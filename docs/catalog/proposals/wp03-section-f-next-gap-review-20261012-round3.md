# WP03 Section F: Red River 7 Grain Hot Cereal identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated as an identity-only catalog reference with a source-backed research record on 2026-10-12. No recipe link, form, or numeric behavior was added. See the [integration README](../batches/wp03-section-f-red-river-7-grain-cereal-identity-integration-20261012/README.md).
- **Scope:** One distinct regional cereal product named as a sibling to the already reviewed Original Red River cereal.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference for **`Red River 7 Grain Hot Cereal / Céréales chaudes Red River 7 grains`** if accepted at integration. Keep it separate from Original Red River cereal, Red River Cream of Whole Wheat cereal, its individual grain and seed components, and generic hot or multigrain cereals. Add no forms, active measures, conversions, yields, recipe links, or substitutions.
- **Open checklist:** The plan still leaves “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps” open at [plan lines 2146–2147](../../RecipeBook-global-ingredient-catalog-plan.txt#L2239). This review proposes a separate product identity within that open item.

This is not a repeat of the Original Red River review. That packet and its live ledger record cite the 7-grain product only to distinguish it from the original four-component mix. They do not create a separate 7-grain identity or ledger record. Current manufacturer listings name and formulate it as a separate product, and Arva’s current French collection lists it separately from both Original Red River and its non-original cream-of-whole-wheat product [existing sources `WP03-REDRIVER-20261012-S06` and `S07`]. No dedicated hold for this candidate was found.

## Current package and ownership snapshot

Counts below were checked in the active workspace on 2026-10-12. The ownership audit used the repository’s accent-, ligature-, case-, punctuation-, and whitespace-folding search-key normalization.

| Artifact | Current count or result |
|---|---:|
| `ingredient-references.v1.json` | 1,306 references |
| `ingredient-forms.v1.json` | 98 forms |
| `legacy-import-identities.v1.json` | 64 candidates |
| `research-ledger.v1.json` | 1,614 records; 5,867 source entries |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows |

The proposed ID `ingredient-ref-red-river-7-grain-hot-cereal` has no active reference or ledger-record owner. Exact normalized ownership checks also found no active reference, form, or legacy candidate for these candidate phrases:

- `Red River 7 Grain Hot Cereal`
- `Red River 7 Grain Cereal`
- `Céréales chaudes Red River 7 grains`
- `Red River Céréales Chaudes 7 Grains`

There is one related ledger record: `ingredient-ref-red-river-cereal`, the Original Red River identity. Its existing source `WP03-REDRIVER-20261012-S07` names the separate 7-grain product and lists its components; `WP03-REDRIVER-20261012-S06` lists it separately in Arva’s French collection. These are useful sibling-boundary evidence, not an exact-key owner or a completed review of the candidate. No new ledger source IDs are assigned to those previously recorded pages.

Every recipe path in the active manifest was scanned, along with each parsed `ingredients` row, for the candidate titles and common English and French variants (including `Red River 7 Grain`, `7 Grain Hot Cereal`, `Red River 7 Grain Cereal`, and `Céréales chaudes Red River 7 grains`). The scan found **zero matching recipe files and zero matching ingredient rows** among all 114 files and 1,123 rows. No bundled recipe references this product, and no recipe link is proposed.

## Proposed identity and boundaries

Arva’s product page titles the item **Red River 7 Grain Hot Cereal** and lists quick-cooking oats, large-flake oats, cracked wheat, cream of whole wheat, cornmeal, sunflower seeds, and flax seeds [existing source `WP03-REDRIVER-20261012-S07`]. Its French product collection calls it **Céréales chaudes Red River 7 grains**, separately from the original and non-original cream-of-whole-wheat products [existing source `WP03-REDRIVER-20261012-S06`]. The English product page is direct manufacturer evidence for the current product name and formula. The French collection supplies a matching manufacturer French display; a current Walmart Canada French title independently uses the alternate word order `Red River Céréales Chaudes 7 Grains` [S01].

| Proposed field | Recommendation |
|---|---|
| ID | `ingredient-ref-red-river-7-grain-hot-cereal` |
| English display | `Red River 7 Grain Hot Cereal` |
| French display | `Céréales chaudes Red River 7 grains` |
| English alias | `Red River 7 Grain Cereal` |
| French alias | `Red River Céréales Chaudes 7 Grains` |
| Category | `GRAIN_AND_CEREAL` |
| Identity scope | This named, ready-to-cook dry blend as sold; “hot cereal” describes its intended prepared use, not the cooked bowl. |
| Forms | None. |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []`. |
| Recipe links, yields, conversions, substitutions | None. |

Keep this product distinct from:

- Original Red River cereal (`ingredient-ref-red-river-cereal`), a separate mix of cracked wheat, cracked rye, cracked and whole flax;
- Arva’s separately listed non-original Red River Cream of Whole Wheat cereal;
- the oats, wheat, cornmeal, sunflower seeds, and flax seeds that are components of this composite mix;
- generic `hot cereal`, `céréales chaudes`, `7 grain cereal`, or `céréales à 7 grains` terms, which are not unique names for this exact formula;
- the cooked porridge or other prepared dishes made with the dry blend.

Do not add the existing Original Red River aliases `Red River hot cereal` or `céréales chaudes Red River` to the new identity. The qualified 7-grain names preserve product distinction; the existing broader wording can continue to find the original product. A broad `Red River` query will appropriately find both branded blends.

## Picker boundary and bundled demand

A static comparison against the current phrase-matching behavior indicates that the proposed full English and French product names resolve to the proposed identity, while a broad `Red River` query returns both this candidate and Original Red River. The broad query change follows from adding another distinct product with that brand. This is a source-code behavior review only; no live picker or emulator QA is claimed.

The full bundled recipe scan found no demand for this product. No recipe text, ingredient reference link, or related row should be added on the basis of the external manufacturer’s recipe page.

## Numeric, form, and substitution decisions

The identity evidence supports a distinct packaged dry blend. It does not support numeric behavior or a reusable state conversion.

| Evidence | What it supports | What it does not support |
|---|---|---|
| A current Arva spice-muffin recipe uses `1 cup Red River 7 Grain Cereal` for a batch of 12 muffins [S03]. | One recipe-specific ingredient amount for that manufacturer recipe. It also confirms the shortened English name `Red River 7 Grain Cereal`. | No default cup measure, mass conversion, density, serving size, generic yield, or link to a bundled RecipeBook recipe. |
| Canadian listings describe a 685 g bag; the Walmart page offers a five-bag lot [S01, S02]. | Product-specific package-size evidence. | No household measure, serving mass, bulk density, package yield, or unit mapping. |
| The dry mix is described as a hot cereal and as usable in a recipe; the muffin page supplies one baking example [existing source `WP03-REDRIVER-20261012-S07`; S03]. | Intended product context and one named recipe use. | No reusable dry/cooked `IngredientForm`, cooking ratio, cooked yield, or evidence that another cereal or a combination of component grains is an equivalent substitute. |

Add no `IngredientForm`, measurement observation, package yield, default density, unit mapping, conversion, or substitution rule. Do not turn the muffin recipe’s one-cup amount or a retailer’s package weight into app-wide measure data. No source reviewed supplies a tested amount-qualified substitute for this exact seven-grain blend.

## Evidence limits

- Arva’s current English page provides the direct product name and component list. The existing original-cereal ledger already records this page as `WP03-REDRIVER-20261012-S07`; re-use that evidence rather than duplicating a source entry.
- Arva’s French collection provides the product’s French title and separates it from the original and cream-of-whole-wheat items. It is already recorded as `WP03-REDRIVER-20261012-S06` on the Original Red River ledger record. Manufacturer French is useful direct product wording, not an OQLF terminology ruling.
- Walmart Canada’s French listing is sold and shipped by Arva and repeats the product title, component list, and 685 g package information [S01]. Some French wording is retailer marketplace copy; treat it as corroborating Canadian product-label vocabulary, not a Québec language ruling.
- Seasons Pharmacy & Culinaria provides a Canadian English listing with the same product name and component list and a 685 g bag [S02]. It corroborates product identity and packaging only.
- OQLF’s GDT entry gives general French usage for `céréales` and notes forms such as flakes, whole grains, ground grains, and cracked grains [S04]. It is generic terminology evidence and does not name this product or approve its display.
- RICARDO uses `céréales chaudes` for the Québec food category [S05]. This supports the natural category wording, not a formal naming rule for the Red River product.
- Arva’s manufacturer recipe is a product-specific 12-muffin example, not a reusable conversion or substitution test [S03].

These sources support a distinct Canadian branded cereal identity. They do not quantify regional prevalence, establish a generic seven-grain formula, or support an equivalence claim with other cereals.

## Proposal-local source register

Sources were reviewed on 2026-10-12. The new IDs below were checked absent from the live research ledger before drafting. Existing Original Red River source IDs `WP03-REDRIVER-20261012-S06` and `S07` are cited in the body and are reused as existing evidence; they are not duplicated here or assigned new IDs.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-RR7HOT-20261012-S01` | Arva Flour Mills, [Red River Céréales Chaudes 7 Grains, 685 g - Lot de 5](https://www.walmart.ca/fr/ip/Red-River-C-r-ales-Chaudes-7-Grains-685-g-Lot-de-5/6OHWQ2P95EMD), Walmart Canada French listing; seller and shipper identified as Arva Flour Mills. | Supports the Canadian French product-title variant, Arva seller relationship, product-specific ingredient wording, 685 g bags, and a five-bag listing. Marketplace copy is not an OQLF decision; package weight is not a serving or conversion. |
| `WP03-RR7HOT-20261012-S02` | Seasons Pharmacy & Culinaria, [Red River 7 Grain Hot Cereal - Arva Flour Mill](https://www.seasonspharmacy.com/grocery/p/arva-redriver7grain), product description and package size. | Gives the English product name, component list, hot-cereal context, and 685 g bag. Retailer corroboration only; it does not establish measure conversion or generic formula equivalence. |
| `WP03-RR7HOT-20261012-S03` | Arva Flour Mills, [Red River 7 Grain Cereal Spice Muffins](https://arvaflourmills.com/blogs/recipes/red-river-7-grain-cereal-spice-muffins), ingredient list and yield. | Manufacturer recipe names `Red River 7 Grain Cereal`, uses 1 cup, and yields 12 muffins. This is a recipe-specific quantity and use, not a standard measure, mass conversion, or general yield. |
| `WP03-RR7HOT-20261012-S04` | Office québécois de la langue française, [céréales, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26571637/cereales), definition and notes. | Supports general French category vocabulary `céréales`; it does not name or standardize this branded hot-cereal product. |
| `WP03-RR7HOT-20261012-S05` | RICARDO, [Des céréales chaudes au petit déjeuner](https://www.ricardocuisine.com/chroniques/a-votre-sante/39-des-cereales-chaudes-au-petit-dejeuner), Québec culinary usage. | Supports `céréales chaudes` as an understandable Québec culinary phrase for the product class, not a formal terminology ruling or the exact branded name. |

## Verification performed

This review resulted in one database JSON identity addition and one source-backed ledger record. Static review covered current reference/form/legacy/ledger ownership, the existing Red River sibling evidence, and all 114 manifest-listed recipe files and 1,123 ingredient rows. No app tests or emulator run were needed for this database-JSON-only change; package and generated-index checks were run.
