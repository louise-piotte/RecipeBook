# WP02 Section C honey and agave syrup identity-boundary review

## Work packet

- **Scope:** The open Section C sweeteners line for honey and agave. This is a proposal only; no shared catalog, ledger, checklist, roadmap, code, test, generated artifact, or recipe file was changed.
- **Proposal owner:** `/root/wp02_date_sugar`.
- **Coordinator:** `/root`.
- **Evidence accessed:** 2026-10-11.
- **Status:** Proposed for coordinator review; the broader Section C checklist remains open.

## Recommendation

**Verify and retain the existing honey identity** as `honey / miel`, using the current ID `ingredient-ref-honey`. Canadian compositional requirements and the OQLF entry independently support a bee-produced food identity, distinct from plant syrups. Keep it separate from date syrup, agave syrup, maple syrup, and invert sugar. Add the source-backed Canadian Nutrient File portion observation to research records only; do not activate a default density or recipe conversion from it.

**Add a distinct agave syrup identity** as `agave syrup / sirop d’agave`, category `SUGAR_AND_SWEETENER`, with a new ID if accepted. CFIA uses this exact bilingual terminology for a sweetening agent, a Québec-based producer sells the product under the French name and describes extraction, filtration, heating, and evaporation, and Mexico’s official standard defines the syrup as an agave-fructan hydrolysis product. Do not treat it as honey, date syrup, maple syrup, brown rice syrup, glucose syrup, or agave fibre/inulin.

Do **not** add `agave nectar` as an active English alias in this pass. A manufacturer uses that phrase for one single-ingredient blue-agave product, but the app’s current word-phrase search would make the standalone query `nectar` select the new agave identity and suppress the current substring result for `nectarine`. The source-attested phrase can be reconsidered if search can preserve both intended matches or if a recipe specifically requires it. Do not add `nectar`, `nectar d’agave`, `miel d’agave`, or bare `agave` as aliases.

Proposed fields:

| Candidate | Proposed fields and scope |
| --- | --- |
| Existing honey | Keep `ingredient-ref-honey`; EN `honey`; fr-CA `miel`; category `SUGAR_AND_SWEETENER`; no aliases, forms, default density, or unit mappings. Source-verify the identity. Keep crystallized, creamed, flavored, floral-source, or blended products from becoming aliases; assess a named variant only if recipe demand warrants it. |
| Agave syrup | New ID, for example `ingredient-ref-agave-syrup`; EN `agave syrup`; fr-CA `sirop d’agave`; category `SUGAR_AND_SWEETENER`; no aliases or forms; `defaultDensity: null`; empty unit mappings. Scope to the unqualified culinary liquid sweetener sold as agave syrup. Keep explicitly partially hydrolyzed/high-fructan products unnormalized until a named product or recipe is reviewed. |

The CFIA bilingual ingredient guidance supports the French display `sirop d’agave`; the same wording appears on a Québec producer’s page. I did not locate an OQLF GDT entry for agave syrup in the scoped searches described below. That is a limit of this search, not evidence that no OQLF record exists. No French alias for `agave nectar` is proposed.

## Live catalog, ledger, proposal, and recipe preflight

The live bundled package at review time contains **934 ingredient references**, **52 ingredient forms**, and **114 manifest-listed recipe files with 1,123 ingredient rows**. The current legacy-import file contains **75 candidates** and the research ledger contains **1,198 records**.

- `ingredient-ref-honey` is already active as `honey / miel`, category `SUGAR_AND_SWEETENER`, with no aliases, no default density, and no unit mappings. It has no associated form.
- `ingredient-ref-date-syrup` is active as `date syrup / sirop de dattes`, with English alias `date honey`. The existing date-syrup name and alias remain unchanged. `ingredient-ref-maple-syrup`, `ingredient-ref-corn-syrup`, `ingredient-ref-dark-corn-syrup`, `ingredient-ref-glucose-syrup`, `ingredient-ref-brown-rice-syrup`, and other named sweeteners are also active and remain separate.
- There is no active reference or form for agave syrup, agave nectar, or agave fructans. The only adjacent date form is the newly integrated dried-date powder form; it is not an agave or syrup form.
- No honey/agave/nectar candidate was found in the legacy-import list. Honey is the existing active row, not an unintegrated legacy candidate. No agave-named identity record was found in the ledger. The current honey ledger record is `unreviewed`, `blocked_pending_evidence` for measurement, `not_yet_researched` for substitutions, and has no source entries; it records an earlier removal of source-less draft density and mapping data.
- Related proposal coverage already distinguishes date syrup and date powder in [the date-sugar review](wp02-date-sugar-product-identity-boundary-review-20261011.md), brown rice syrup in [the brown-rice-syrup review](wp02-brown-rice-syrup-identity-boundary-review-20261011.md), syrup families in [the syrups/molasses review](wp02-syrups-molasses-boundary-review-20261009.md), and honey’s chemical relationship to invert sugar in [the non-sucrose sweetener review](wp02-non-sucrose-sweetener-gap-review-20261010.md). No earlier honey/agave identity-boundary packet was found.
- The exact ingredient-row and full-recipe-text scan found one recipe: recipe 086, Butter Chicken, has ingredient row 15, `1 tbsp honey`, linked to `ingredient-ref-honey`; the method also repeats the word honey. The row has no mass. No agave, agave nectar, or nectar ingredient row or recipe-text match exists in the 114 recipes. This supports retaining honey’s existing link and provides no recipe-demand signal for agave.

## Source facts and product boundaries

| Product or term | Source facts | Boundary decision |
| --- | --- | --- |
| Honey / miel | Canada’s food compositional standard defines honey as food produced by honey bees from blossom nectar and/or plant secretions. The blossom-honey standard includes compositional limits, including at least 65% apparent reducing sugar and no more than 20% moisture, with named floral exceptions. CFIA says no added ingredient such as colour or sugar is allowed in a product labelled “honey.” OQLF gives the Québec term `miel`, English `honey`, and a bee-production definition. [S03–S04, S15] | Verify the existing honey reference as a distinct bee-produced sweetener. Do not alias plant-derived agave syrup, date syrup, or invert sugar to honey. Keep varieties and textures out of generic aliases. |
| Agave syrup / sirop d’agave | CFIA’s English and French label guidance names `agave syrup` / `sirop d’agave` separately among sweetening agents. Mexico’s NOM-003-SAGARPA-2016 defines agave syrup as a concentrated aqueous carbohydrate solution produced through hydrolysis of agave fructans; its standard specifies ranges including 60–75 g fructose, 3–12 g glucose, and 20–28 g moisture per 100 g for the named syrup class. It also names partially hydrolyzed/high-fructan agave syrup separately. These are Mexican standard requirements, not a Canadian standard or a formula for every retail product. A Québec-based maker’s Sunny Via page describes its own product as agave juice extracted from the plant, filtered, gently heated, and evaporated into a blond liquid. [S01–S02, S05–S06] | Add one source-backed, source-qualified syrup identity. Keep the specialized partially hydrolyzed/high-fructan class out of aliases and forms until an exact recipe or product requires a decision. The sources do not support a general “agave” identity covering plant fibre, inulin/fructans, beverages, extracts, or other agave products. |
| Agave nectar | Wholesome Sweeteners’ official product page is titled “Organic Fair Trade Blue Agave Nectar,” lists “Organic Blue Agave Nectar” as its ingredient, identifies the blue-agave core and Jalisco origin, and presents the product for culinary sweetening. [S07] | This establishes `agave nectar` as one manufacturer’s product name for a culinary liquid sweetener. It does not establish a Canadian or Mexican common-name standard for the English phrase or all products using “nectar.” Retain it as a source-level observed name but omit it as an active alias because of the exact search collision below. |
| Date syrup and date paste/powder | OQLF defines `sirop de dattes` as syrup made by washing/extracting the flesh of ripe dates with water and concentrating it; its English equivalent is `date honey`. OQLF explicitly says that `miel` applies to bee products and rejects `miels de dattes` as a name based on syrup consistency. Fineberry lists date syrup and date paste/purée as separate products; its paste description is a moist date product, while the already reviewed Québec date-powder sources describe a dry milled-date product. [S08–S10; see also the date-sugar proposal] | Keep date syrup, date paste/purée, date powder, and agave syrup distinct. Preserve the existing English `date honey` alias on date syrup, but do not add French `miel de dattes` or `miel d’agave`. A literal syrup texture does not make a product honey. |
| Other culinary syrups | CFIA’s naming examples separately enumerate agave syrup, honey, maple syrup, brown rice syrup, rice syrup, corn syrup, glucose syrup, malt syrup, and other syrups in both languages. The list is labeling guidance, not a formula or proof that two products are interchangeable. | Preserve each named source/product boundary. Do not infer common identity, density, concentration, or substitution from the shared word “syrup” or sweetening function. |

## Search terms and exact collisions

Search results below follow the current ingredient search rule: accent/punctuation normalization, complete word-phrase matches first, then substring fallback only if no complete phrase matches. Proposed results are inferred from the proposed term set; no search code or test was changed.

| Query | Current result | Proposed result / note |
| --- | --- | --- |
| `honey` | `ingredient-ref-honey` and `ingredient-ref-date-syrup` | Leave as-is for this packet. The second result comes from the existing `date honey` alias. This is an existing exact one-word collision worth retaining in coordinator awareness. |
| `miel` | `ingredient-ref-honey` | Remains honey only; no French date-syrup alias is added. |
| `date honey` | `ingredient-ref-date-syrup` | Remains date syrup, consistent with OQLF. |
| `agave syrup`, `sirop d’agave`, `agave`, `agave nectar` | No current result | The first three resolve to the proposed identity if it is added; `agave nectar` stays unresolved because the alias is withheld. |
| `nectar` | `ingredient-ref-nectarine` through substring fallback | If `agave nectar` were indexed, it would become a complete phrase match and suppress the current `nectarine` fallback result. This is why the alias is omitted. |
| `sirop` | Multiple active syrup references | Continues to be broad by design; no short `sirop` alias is added. |

The manufacturer evidence for “agave nectar” is real but source-specific. Do not replace this app behavior with an unsupported collision rule. Revisit the alias only with a query implementation that can return both appropriate matches or a product/recipe reason strong enough to justify the search tradeoff.

## Measures, packages, conversion, yield, and substitution

These are source-specific observations. Keep them out of app defaults and active substitution rules unless later reviewed against the exact product and use.

| Evidence | Proposed treatment and limit |
| --- | --- |
| Health Canada’s Canadian Nutrient File entry for “Sweets, honey, strained or extracted,” food code 4294, lists 5 mL = 7.2 g, 15 mL = 21.5 g, and 100 mL = 143.2 g. The page is a published serving-portion record, not a density test or a specific retail honey label. The 15 mL pair implies about 1.43 g/mL by arithmetic, but the source does not report a measurement method. [S11] | Record the listed portions as a generic CNF honey observation only. The recipe 086 line is 1 tbsp but has no mass; do not silently turn the CNF pair into an active recipe-line conversion or default density. Further method/product review would be needed before setting honey density or an app mapping. |
| Sunny Via’s producer page lists package formats including a 340 mL dispenser, 500 mL jug, and 2 L bag-in-box. A Québec Maxi listing identifies a PC Organic Agave Syrup package as 480 mL. [S05, S12] | Package-size examples only. They establish no package yield, serving mass, or conversion. Price and stock are time-sensitive and not used. |
| Wholesome’s product page lists 11.75 oz and 23.5 oz bottles but no volume/mass serving pair in the accessible product text. [S07] | Do not convert ounces to mL or derive density; the page does not establish the ounce basis or a culinary measure. |
| NOM-003 gives moisture and carbohydrate-composition limits for its Mexican agave-syrup standard. [S06] | Chemical composition limits are not a bulk-density value, kitchen measure, or yield. Do not use them to calculate a conversion. |
| No source reviewed establishes commercial production yield, package-use yield, or a generic mass/volume conversion for agave syrup. No source establishes a yield from raw agave to syrup. | No yield, density, default measure, unit mapping, or conversion. |
| A 2011 Epicurious agave-syrup page gives a substitution note for baking: it says 1/2 cup honey or maple syrup can replace 1/2 cup agave; it separately gives 3/4 cup corn syrup for 1/2 cup agave with a couple tablespoons less other liquid. This is one publication’s advice, not a validated universal ratio. [S13] | Retain only as one source-level substitution observation. Do not create a global honey-to-agave, agave-to-honey, corn-syrup, or maple rule. |
| A current Government of Canada fruit-leather recipe gives 30 mL (2 tbsp) “maple syrup or honey” in that formula. [S14] | This is a same-quantity option for that one fruit-leather recipe only; it is not evidence for agave or a general sweetener substitution. |

The recipe corpus contains no agave recipe for which a package, amount, or substitution could be linked. The one honey line remains as written and can be weighed only if a future, reviewed ingredient-level conversion is accepted. No recipe yield is proposed.

## Coordinator integration recommendation

1. Source-verify and retain `ingredient-ref-honey` as `honey / miel`, category `SUGAR_AND_SWEETENER`. Attach CFIA and OQLF identity evidence. Record CNF food code 4294 measures as source-specific portion observations if accepted; keep `defaultDensity` null, `unitMappings` empty, and recipe 086’s stored amount unchanged.
2. If accepted, add one new identity for `agave syrup / sirop d’agave`, category `SUGAR_AND_SWEETENER`, with no aliases, forms, recipe links, measurements, density, mappings, package-yield data, or active substitutions.
3. Keep `agave nectar` as a documented manufacturer name but not an alias in this pass because of the `nectar` → `nectarine` query collision. Do not add generic `nectar`, `miel d’agave`, `date honey` to honey, or `miel de dattes` to date syrup.
4. Keep agave fructans/fibre/inulin and explicitly partially hydrolyzed/high-fructan syrup unnormalized. If a future recipe names either product class, review it separately rather than inheriting the unqualified syrup identity or its measurement data.
5. Do not encode the recipe-specific honey/agave, honey/maple, or agave/corn-syrup advice as a general rule. The broader Section C checklist remains open.

## Search terms and source-to-claim register

Sources were accessed on **2026-10-11**. Source IDs are local to this proposal, not ledger IDs.

### Search terms used

- Canada / Québec naming: `honey`, `miel`, `agave syrup`, `sirop d’agave`, `agave nectar`, `nectar`, OQLF GDT searches for `agave`, `sirop d’agave`, and `agave syrup`.
- Product identity/process: `NOM-003-SAGARPA-2016 jarabe de agave`, `agave fructans hydrolysis`, Sunny Via agave syrup, Wholesome blue agave nectar.
- Neighbor boundaries: `sirop de dattes`, `date honey`, `date paste`, `date powder`.
- Measurement/substitution: Health Canada CNF food code 4294, Sunny Via packaging, Wholesome product sizes, one recipe-page substitution note, and one Government of Canada recipe.

| Source ID | Source and direct URL | Facts used | Limit |
| --- | --- | --- | --- |
| WP02-HAG-20261011-S01 | CFIA, [List of ingredients and allergens on food labels](https://inspection.canada.ca/en/food-labels/labelling/industry/list-ingredients-and-allergens) | Uses `agave syrup` and `honey` as examples of sweetening agents and lists them separately in Annex 1B. Annex 1C includes generic `nectar` among functional substitutes for sweetening agents. | Labeling/grouping guidance, not a composition standard for agave syrup. The generic nectar entry does not define agave nectar. |
| WP02-HAG-20261011-S02 | CFIA, [Liste d’ingrédients et allergènes sur les étiquettes des aliments](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/liste-dingredients-allergenes) | Uses `sirop d’agave` and `miel` as the French examples corresponding to agave syrup and honey. | Labeling/grouping guidance, not an OQLF term record or compositional definition. |
| WP02-HAG-20261011-S03 | CFIA, [Importing honey](https://inspection.canada.ca/en/importing-food-plants-animals/food-imports/food-specific-requirements/honey) | States that imported honey must meet the Canadian standard; summarizes the bee-produced/source-material identity and says no added ingredient such as colour or sugar is allowed in a product labelled honey. | Canadian import and identity guidance; it does not define agave syrup or culinary substitutions. |
| WP02-HAG-20261011-S04 | OQLF, GDT, [miel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8418200/miel) | Gives the Québec term `miel`, English equivalent `honey`, and a bee-produced nectar/plant-secretion definition. | Terminology/definition entry dated 1985; not a measure or modern formulation survey. |
| WP02-HAG-20261011-S05 | Appalaches Nature, [Sunny Via](https://appalachesnature.com/sunny-via/) | Québec-based producer uses `sirop d’agave`; describes its product as extracted agave juice, filtered, gently heated, and evaporated; lists 340 mL, 500 mL, and 2 L formats. | Manufacturer evidence for its Sunny Via product and naming; not a process specification for every agave syrup. Marketing claims about health, glycemic index, or calories are not used. |
| WP02-HAG-20261011-S06 | Mexico’s Diario Oficial / SIDOF, [NOM-003-SAGARPA-2016, jarabe de agave](https://sidof.segob.gob.mx/notas/docFuente/5461591) | Official standard defines agave syrup as a concentrated carbohydrate solution produced by hydrolysis of agave fructans; provides composition limits and separately names partially hydrolyzed/high-fructan syrup. | Mexican standard; its geographic/legal scope is Mexico. It is not a Canadian compositional standard and does not prove every Canadian retail product complies with it. |
| WP02-HAG-20261011-S07 | Wholesome Sweeteners, [Organic Fair Trade Blue Agave Nectar](https://wholesomesweet.com/products/organic-blue-agave) | Product title and ingredient statement use `Organic Blue Agave Nectar`; says harvested from the blue-agave core in Jalisco; page lists 11.75 oz and 23.5 oz bottle variants. | One manufacturer’s product-name evidence; page showed unavailable/sold-out web ordering at access time. No mass/volume serving pair or broad name standard is supplied. |
| WP02-HAG-20261011-S08 | OQLF, GDT, [sirop de dattes](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8433496/sirop-de-dattes) | Defines the date-pulp/water-extraction/concentration process; gives `date honey` as the English equivalent and rejects French `miels de dattes` because `miel` names bee products. | Date-syrup terminology only; no agave or honey conversion evidence. Its °Bé range is concentration, not density. |
| WP02-HAG-20261011-S09 | Fineberry Foods, [Date Products Range](https://www.fineberry.ca/dates-products-range.html) | Supplier lists date powder/sugar, date paste, and date syrup as distinct product offerings. | Supplier product range; does not standardize all date products. |
| WP02-HAG-20261011-S10 | Fineberry Foods, [Date Paste / Date Purée](https://www.fineberry.ca/date-paste.html) | Describes the moist date-paste/purée product separately from syrup and powder. | One supplier’s formulation and description; no yield or substitution ratio. |
| WP02-HAG-20261011-S11 | Health Canada, [Canadian Nutrient File serving portion, food code 4294](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4294) | Lists generic strained/extracted honey portions of 5 mL = 7.2 g, 15 mL = 21.5 g, and 100 mL = 143.2 g. | Published serving-portion data; page modified 2019. Brand, sample, and method are unspecified; no generic default density is proposed. |
| WP02-HAG-20261011-S12 | Maxi, [PC Biologique Sirop d’Agave, 480 mL](https://www.maxi.ca/fr/sirop-d-agave/p/20901436_EA) | Québec retailer uses the French product name `sirop d’agave` and lists a 480 mL package. | Retail listing; stock and package details can change. Used for wording/package-size evidence only, not density, serving weight, or process. |
| WP02-HAG-20261011-S13 | Epicurious, [Agave Syrup](https://www.epicurious.com/recipes/food/views/agave-syrup-385411) | One 2011 recipe page’s “Need some, have none” note gives a 1/2-cup agave to 1/2-cup honey/maple option and a corn-syrup alternative with a liquid adjustment. | Single publication/cookbook advice, not a validated general ratio or a recipe-library line; retained as contextual evidence only. |
| WP02-HAG-20261011-S14 | Government of Canada / Public Health Agency of Canada, [Fruit leathers](https://www.canada.ca/en/health-canada/services/food-guide/eating-support/kitchen/recipes/fruit-leathers.html) | One recipe lists 30 mL (2 tbsp) maple syrup or honey in the same formula. | Recipe-specific alternative only; no agave evidence and no global substitution rule. |
| WP02-HAG-20261011-S15 | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 15, §15.1.16 | Sets composition requirements for honey; for blossom honey, including at least 65% apparent reducing sugar and no more than 20% moisture, with specified floral exceptions. | Canadian composition requirements for honey, not a cooking-measure, density, or substitution source. |

Independent bilingual review of the proposed agave French display and the search-term collision remains useful before any active catalog integration.
