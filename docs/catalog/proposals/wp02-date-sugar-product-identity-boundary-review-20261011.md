# WP02 date sugar product identity and boundary review

## Work packet

- **Scope:** The open Section C sweeteners item for date sugar. This is a proposal only; no shared catalog, ledger, plan, roadmap, test, code, or recipe file was changed.
- **Proposal owner:** `/root/wp02_date_sugar`.
- **Coordinator:** `/root`.
- **Input revision:** `0caaef8` (`HEAD` checked before drafting; the worktree contains ongoing edits).
- **Evidence accessed:** 2026-10-11.
- **Status:** Proposed for coordinator review; Section C and the global plan remain open.

## Recommendation

Treat **date sugar / date powder as one powdered form of the existing dried-dates identity**, not as a separate chemically distinct sugar reference. The reviewed maker and supplier pages describe the product as dates that are dried, pitted, and milled, retaining the whole-fruit material. They use *date sugar* and *date powder* for that same dry product. The French-Canadian evidence supports **dattes en poudre** as a clear display, with **sucre de dattes** as a product-attested search term.

Suggested form only (ID is unallocated):

| Field | Proposal |
|---|---|
| `id` | `ingredient-form-dried-dates-powdered` |
| `ingredientRefId` | `ingredient-ref-dried-dates` |
| `formCode` / state | `powdered` / `dry` |
| EN label | `date powder` |
| fr-CA label | `dattes en poudre` |
| EN match terms | `date sugar` |
| fr-CA match terms | `sucre de dattes`; `poudre de datte` |

Keep the existing base identity, aliases, and `NUT_SEED_AND_DRIED_FRUIT` category as-is. Do not add a second `ingredient-ref-date-sugar`, and do not put powder terms on the unqualified dates or Medjool references. This proposal treats the Section C checklist term as a source-backed product form under dried dates. That fit is an architectural inference from the product/process evidence and current catalog model; the cited evidence consists of product pages, not an Ontario, Québec, or Canadian standard defining `date sugar`.

This match describes the source-supported whole-date powder product. It should not imply that every product marketed with a date-related “sugar” or “powder” label has an identical composition; check product ingredient statements where carriers or other ingredients are named.

## Live preflight and demand

- The bundled seed currently contains **927 ingredient references**, **51 forms**, and the manifest lists **114 recipe JSON files**. The corpus has **1,123 ingredient rows**.
- Active date-related references are `ingredient-ref-dates` (`dates` / `dattes`), `ingredient-ref-medjool-dates` (`Medjool dates` / `dattes medjool`), `ingredient-ref-dried-dates` (`dried dates` / `dattes séchées`, with singular aliases), and `ingredient-ref-date-syrup` (`date syrup` / `sirop de dattes`, EN alias `date honey`). No active reference or form is date sugar/date powder, and no active form belongs to the date references.
- The 76 legacy candidates include generic `ingredient-ref-sugar` and `ingredient-ref-maple-sugar`; none is date-specific. There is no proposed `ingredient-form-dried-dates-powdered` ID in the active form set.
- The ledger has accepted date-syrup and dried-dates records, but no dedicated date-sugar or date-powder identity record. The existing date-syrup record only mentions powder to establish that syrup is a separate product.
- Existing adjacent proposal coverage is [WP05 MENA pantry compounds](wp05-mena-pantry-batch-20261008.md), which already holds date syrup separate from date paste, date powder, and date juice; this packet does not reopen date syrup.
- I searched every manifest-listed recipe and ingredient row for case-insensitive exact phrases: `date sugar`, `date powder`, `date sugar powder`, `dried date powder`, `sucre de dattes`, `sucre de datte`, `dattes en poudre`, `datte en poudre`, `poudre de dattes`, and `poudre de datte`. **No exact matches** were found in the 114 recipes / 1,123 ingredient rows. No recipe relinking is proposed; the corpus provides no demand signal for this product form.

The normalized catalog-key audit used `normalize_search_key` from `tools/seed_package/bundled_seed_package.py`, including current names, aliases, form labels/match terms, and legacy candidate names/aliases. None of the proposed form keys has an exact collision. Relevant existing exact owners are:

| Key | Exact current owner | Boundary |
|---|---|---|
| `date syrup` | `ingredient-ref-date-syrup` name | Do not map to powder. |
| `date honey` | `ingredient-ref-date-syrup` EN alias | OQLF's English equivalent for *sirop de dattes*; do not map to powder. |
| `dried dates` / `dried date` | `ingredient-ref-dried-dates` name / EN singular alias | Keep the unqualified dried-fruit identity distinct from its powdered form. |
| `dates` | `ingredient-ref-dates` name | Keep generic dates unqualified. |

No exact owner was found for `date sugar`, `date powder`, `sucre de dattes`, `dattes en poudre`, or the proposed form ID. Do not add generic `sugar`, `raw sugar`, `date honey`, `date molasses`, `date syrup`, `date paste`, or `date juice` as aliases. `raw sugar` is not a product-specific equivalent; `date honey` is already the date-syrup alias; and the reviewed sources distinguish liquid, paste, and dry-powder products.

## Source-backed product identity and terminology

### Facts from the reviewed pages

1. **Québec maker: “dattes en poudre” and “sucre de dattes.”** [Madame Labriski, 5 kg bulk “Dattes en poudre”](https://madame-labriski.myshopify.com/products/wow-en-vrac-dattes-en-poudre) says the product is also known as *sucre de dattes*, then explains it is dates made into powder. Its page describes the dates as dried, pitted, and finely ground and lists the ingredient as 100% dried dates made into powder. It positions the product for cooking, baking, drinks, and other uses. The page described the 5 kg pack but showed it sold out when accessed. This is direct local naming/product evidence, not an official language standard or universal manufacturing specification.

2. **Québec seller/manufacturer: a separately sold sweetener product made from dates.** [Création Delicia, *Sucre de dattes biologique Degla*](https://www.creationdelicia.com/products/sucre-de-dattes-biologique-degla) identifies a 350 g product and says it is 100% organic pitted dates, dried and finely ground; its ingredient statement is 100% pitted dates. Its wording supports the proposed French search term *sucre de dattes*. The maker's [food-manufacturing page](https://www.creationdelicia.com/pages/services-aux-transformateurs-alimentaires) also uses *poudre de datte* for dry date-sweetened products. These pages are evidence for the maker's product terms, not a national naming standard.

3. **Canadian supplier: date powder and date sugar are paired names.** [Fineberry Foods, Dates Powder / Date Sugar](https://www.fineberry.ca/dates-sugar.html) calls its item “Dates Powder / Date Sugar,” says the dates are cleaned, pitted, dehydrated/dried, then finely ground, and describes the product as 100% pure dates without additives. It describes a powder consistency and lists 5 kg bulk packaging. Fineberry's broader [date-products range](https://www.fineberry.ca/dates-products-range.html) lists date paste, date syrup, and date sugar/powder as separate products. This is supplier-specific product evidence; it does not standardize every product sold under these names.

4. **Particle size can vary within date powder.** [NFI America, Date Powder](https://nfi-america.com/our-products/date-powder/) describes grinding and milling dehydrated dates and offers granular (595 micron) and superfine (90 micron) powder. That source supports a range of grind sizes, not a universal fineness threshold, density, or household measure.

5. **Date paste is a moist/paste product with a different described process.** [Fineberry Foods, Date Paste / Date Purée](https://www.fineberry.ca/date-paste.html) describes a soft puree-textured product made from cleaned, pitted dates; the page describes moistening and grinding/pressing in its process. Its catalog treats paste/purée separately from powder. This is product-page evidence for a distinct form/process, not a universal paste specification.

6. **Date syrup is a liquid extract/concentrate and already has a distinct fr-CA term.** [OQLF, GDT, *sirop de dattes*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8433496/sirop-de-dattes) defines it as syrup made by washing/exhausting date pulp with water and concentrating it; its English equivalent is *date honey*. OQLF also rejects *miel de dattes* as French wording and gives 37–40 °Bé as a syrup concentration range. Baumé is not density. The already-integrated ledger contains this source context; none of it transfers to dry date powder.

7. **Commercial “date sugar” can be granular or powder-like and does not behave like refined sugar.** [Country Life Natural Foods, Date Sugar](https://countrylifefoods.com/products/date-sugar) describes its single-ingredient product as whole dates dried and ground, with sandy/coarse texture that can be finer, “closer to a powder”; it says it does not dissolve or melt like refined sugar. This is a US supplier's specific product description, not a Canadian standard. It reinforces that “sugar” here is a sweetening use/name for ground whole-fruit material, not evidence of extracted or refined date sugar.

### Identity inference and language decision

Across the Québec and Canadian product pages, *date sugar* and *date powder* refer to the same dry milled whole-date product. The sources do not establish a separate extracted sugar, crystalline sugar, or process that would warrant a separate ingredient identity. They also do not show that all date-derived powders, pastes, or syrups are interchangeable. The recommended form relationship is an inference from those product descriptions plus the already active dried-date reference.

For fr-CA, *dattes en poudre* is the most transparent display for the local product as described by Madame Labriski; *sucre de dattes* is a product-attested search term from both Madame Labriski and Création Delicia. I found no OQLF entry specifically standardizing *sucre de dattes* or *dattes en poudre* as a culinary term in this review. The OQLF's *sirop de dattes* page supports only the syrup term.

## Measures, conversion, yield, and substitution evidence

| Evidence | Source-published observation | Limit and recommendation |
|---|---|---|
| Package size | Création Delicia offers a 350 g retail product; Madame Labriski lists a 5 kg bulk format; Fineberry lists 5 kg bulk packaging. | Package mass is not a volume measure, serving size, or yield. Do not derive conversion or density. |
| Portion / mass-volume | Country Life states a serving of 1/4 cup (28 g) for its particular product. | This is one US product's published serving description. The page does not specify cup standard, fill/packing method, grind of the serving, or whether the measure is level; keep source-scoped only and do not activate a general unit mapping or density. |
| Grind size | NFI lists 595 micron granular and 90 micron superfine date powder. | A particle-size specification is not a kitchen conversion or density; no generic powder fineness form split is proposed. |
| Process yield | Product pages describe drying/dehydration and grinding but give no input/output yield for dried dates to powder. | No yield relation. Do not infer one from single-ingredient composition. |
| Sweetener replacement | Création Delicia says “1 dose” of date sugar equals “1 dose” of white sugar. Madame Labriski says its powder replaces sugar “1 pour 1”; Country Life says to start with a 1:1 swap and adjust sweetness/texture. | These are product-page claims, not controlled comparative tests. “Dose” and the 1:1 basis are unspecified (weight vs volume), and sources note textural differences. Record only as source-specific qualitative/equal-dose claims if useful; do not activate a global substitution rule or conversion. |
| Replacement for date paste or date syrup | None found. | Keep the products separate; no direction, amount, yield, or cross-form substitution is established. |

The existing ledger's **1 tbsp / 15 g** observation and honey/maple use note belong only to the Academy of Nutrition and Dietetics' named homemade **date-syrup** recipe (see [the existing date-syrup source](https://www.eatright.org/recipes/desserts/simple-date-syrup-recipe) and [WP05 proposal](wp05-mena-pantry-batch-20261008.md)). Do not transfer them to date sugar/powder.

## Proposed disposition for coordinator

1. If accepted, add one `powdered` / dry form under `ingredient-ref-dried-dates`, with label `date powder` / `dattes en poudre`; attach only source-attested `date sugar`, `sucre de dattes`, and `poudre de datte` terms to that form. Do not create a new date-sugar reference or change base aliases/category.
2. Keep date syrup, date paste/purée, date juice/concentrate, generic dates, and Medjool dates distinct. Preserve the existing `date honey` owner on `ingredient-ref-date-syrup`.
3. Add no active density, unit mapping, conversion, process yield, or substitution rule. If the maker's 1:1 wording is retained in the ledger, label its basis and scope unresolved and keep runtime behavior inactive.
4. Do not relink recipes; this term has zero matches in the current corpus.
5. Keep the parent Section C item and the broader global ingredient-catalog checklist open until their remaining candidates are reviewed.

## Source log

All pages were accessed **2026-10-11**. Manufacturer/supplier pages establish the products and terms those businesses describe, not a universal product standard. The product pages' health and “healthy” claims were not used as evidence.

| ID | Source and evidence used |
|---|---|
| `WP02-DATE-SUGAR-20261011-S01` | [Madame Labriski, “En vrac (5 kg) : Dattes en poudre”](https://madame-labriski.myshopify.com/products/wow-en-vrac-dattes-en-poudre) — Québec naming, `sucre de dattes` wording, dried/pitted/fine-ground composition, 100% dried dates, usage, 5 kg pack, and “1 pour 1” seller claim. |
| `WP02-DATE-SUGAR-20261011-S02` | [Création Delicia, *Sucre de dattes biologique Degla*](https://www.creationdelicia.com/products/sucre-de-dattes-biologique-degla) — 350 g pack, French product name, pitted/date/dried/fine-ground composition, ingredient statement, and one-dose-to-one-dose white-sugar seller claim. |
| `WP02-DATE-SUGAR-20261011-S03` | [Fineberry Foods, Dates Powder / Date Sugar](https://www.fineberry.ca/dates-sugar.html) — paired English names, 100% date product description, cleaning/pitting/dehydrating/grinding process, powder consistency, and 5 kg package. |
| `WP02-DATE-SUGAR-20261011-S04` | [Fineberry Foods, Date Products Range](https://www.fineberry.ca/dates-products-range.html) — separately enumerates date powder/sugar, date paste, and date syrup products. |
| `WP02-DATE-SUGAR-20261011-S05` | [Fineberry Foods, Date Paste / Date Purée](https://www.fineberry.ca/date-paste.html) — specific paste texture/process description used for the product boundary. |
| `WP02-DATE-SUGAR-20261011-S06` | [NFI America, Date Powder](https://nfi-america.com/our-products/date-powder/) — dried-date milling, granular/superfine particle-size examples, and no kitchen conversion evidence. |
| `WP02-DATE-SUGAR-20261011-S07` | [Country Life Natural Foods, Date Sugar](https://countrylifefoods.com/products/date-sugar) — US product's single-date composition, granular/powder texture, non-dissolving behavior, 1/4 cup (28 g) serving statement, and seller 1:1 claim; not generalized. |
| `WP02-DATE-SUGAR-20261011-S08` | [OQLF, GDT, *sirop de dattes*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8433496/sirop-de-dattes) — authoritative French/English syrup terminology and liquid-extraction/concentration boundary; °Bé is not density. |
| `WP02-DATE-SUGAR-20261011-S09` | [Academy of Nutrition and Dietetics, Simple Date Syrup Recipe](https://www.eatright.org/recipes/desserts/simple-date-syrup-recipe) — cited only to identify the existing syrup-specific portion and use observation that must not be transferred to the dry powder. |
| `WP02-DATE-SUGAR-20261011-S10` | [Création Delicia, services to food manufacturers](https://www.creationdelicia.com/pages/services-aux-transformateurs-alimentaires) — uses *poudre de datte* for dry date-sweetened products and lists date sugar separately from date syrup. |
