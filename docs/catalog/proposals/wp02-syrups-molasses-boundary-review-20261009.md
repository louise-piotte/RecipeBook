# WP02 Section C — syrup and molasses product-boundary review

- **Reviewed:** 2026-10-09
- **Status:** integrated on 2026-10-09 after coordinator review; accepted and unresolved dispositions are recorded below.
- **Scope:** generic corn syrup and its current glucose-syrup alias; light and dark corn syrup; golden/refiners’ syrup; molasses grades and treacle naming. Measurement and substitution evidence are reviewed separately.
- **Plan state:** broader WP02 Section C remains open.

## Repository snapshot and existing work

This review used the live bundled package as found before writing this proposal. Counts and hashes identify that proposal-time snapshot; recheck them before coordinator integration.

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| ingredient-references.v1.json | 414 references | 5f7cca9264d410c2c2e619321fc0daa7ed6a6907630225dd490ba0894ce8288e |
| ingredient-forms.v1.json | 16 forms | 247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a |
| manifest.v1.json | — | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| research-ledger.v1.json | 579 records / 575 source references | db6ac4439396eca82f5f66508d30d538f5b4686431e09d87240239060143c647 |
| legacy-import-identities.v1.json | 99 candidates | 63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b |
| Sorted recipe filename + NUL + per-file SHA-256 + newline aggregate | 114 recipe files / 1,123 ingredient rows | 0ac5ea9d625417b7ff2a84e3bacc2d4f0b3cdcb49c931d9eaedf77c28593779c |

The active corn syrup reference is ingredient-ref-corn-syrup, category SUGAR_AND_SWEETENER, displayed as corn syrup / sirop de mais. It has the exact English alias glucose syrup, no French aliases, no default density or unit mappings, and an unreviewed, source-empty ledger record. Its French display is missing the circumflex in maïs; that spelling should be corrected in any later integration.

The active date syrup row and pomegranate molasses row are separate reviewed identities. Pomegranate molasses is category SAUCE_AND_CONDIMENT, not the legacy sweetener class. Do not map either product to generic molasses or corn syrup.

The only matching legacy candidate is ingredient-ref-molasses / molasses / mélasse, category SUGAR_AND_SWEETENER. It remains unreviewed and has no source evidence. It is not clear whether this unqualified legacy name denotes a broad ingredient class or a particular molasses grade.

The current forms file contains no form for corn syrup, golden syrup, molasses, or treacle. The ledger record for corn syrup is identityState unreviewed, measurementState blocked_pending_evidence, and substitutionResearchState not_yet_researched. The legacy molasses candidate is also unreviewed and source-empty. Neither record should be filled by inference from the sources below.

The prior WP02 cane-sweetener review covers solid cane products and explicitly leaves liquid cane syrup / melado outside its scope. The WP05 MENA batch has separate, accepted date-syrup and pomegranate-molasses identities. No existing proposal was found for the corn-syrup/glucose-syrup, golden-syrup, or generic molasses boundaries in this packet.

## Identity and naming recommendations

These are candidate recommendations for coordinator review, not canonical changes.

| Product boundary | Candidate English / fr-CA naming | Recommendation and alias boundary |
| --- | --- | --- |
| Generic corn syrup / glucose syrup | corn syrup / sirop de maïs | Keep the current row unchanged pending a terminology decision. Canadian compositional standards define glucose syrup broadly by starch hydrolysis and separately define a source-named glucose syrup; the 1990 OQLF entry crosslists sirop de glucose and sirop de maïs as preferred terms for a concept whose definitions mention both corn starch and starch generally. That is a real scope conflict. Do not affirm or remove the existing glucose syrup alias in this proposal. Keep sirop de glucose unresolved as a French alias; it is not currently present in the catalog. |
| Light corn syrup | light corn syrup / sirop de maïs léger | Treat “light” as a named product variant, not an alias for unqualified corn syrup. Karo’s product composition and the Karo FAQ give this term a product/color scope; a Canadian French Cuisinart recipe uses sirop de maïs léger. No current recipe ingredient line requests it, so do not add a separate canonical row in this packet. If the app later needs to distinguish recipe-specified grades, model it as a searchable product identity or grade; do not silently fold it into the generic row. Karo says “white corn syrup” is used by consumers for its own light product, but that market-specific wording is not proposed as a global alias. |
| Dark corn syrup | dark corn syrup / sirop de maïs foncé | Recommend a distinct candidate identity, not an alias of generic corn syrup. Karo’s dark product contains corn syrup plus molasses and has a more robust flavor and deeper color; current Canadian French recipe use supports sirop de maïs foncé. This is a meaningful named product variant, and an exact unlinked recipe row uses it. Karo’s statement that its light and dark products can substitute in Karo recipes is contextual substitution evidence, not synonym evidence. |
| Golden / refiners’ syrup | golden syrup / sirop doré; CFIA also lists sirop de sucre raffiné and sirop de raffineur; OQLF lists mélasse claire and mélasse légère | Recommend a separate candidate identity from corn syrup, golden corn syrup, molasses grades, and invert sugar. Canadian compositional standards group refined sugar syrup, refiners’ syrup, and golden syrup as one standard product. OQLF maps golden syrup to mélasse claire / mélasse légère. Choose the fr-CA display and whether to store the other supported names as aliases only after terminology review. Do not activate UK-labeled light treacle or light molasses as global aliases. |
| Golden corn syrup | golden corn syrup / sirop de maïs doré | Keep distinct from golden syrup. CFIA’s French labeling example describes a prepackaged golden corn syrup with glucose, water, refiners’ syrup, salt, and vanillin, while its ingredient examples list golden syrup/refiners’ syrup separately. Treat golden corn syrup as a blended product name, not an alias for the refining syrup or plain corn syrup. No recipe row currently needs a reference. |
| Fancy molasses | fancy molasses / mélasse qualité fantaisie | Recommend a separate candidate identity from table and blackstrap molasses. CFIA defines it as cane juice syrup from which sugar has not previously been extracted. Do not map unqualified legacy molasses directly to this grade. |
| Table molasses | table molasses / mélasse de table | Keep as a separate candidate or grade from fancy molasses. CFIA defines it as liquid food obtained during raw or refined sugar manufacture. The current corpus has no such ingredient line. |
| Blackstrap / refiners’ molasses | blackstrap molasses / mélasse verte | A distinct candidate is justified for the named product family. CFIA’s standard names refiners’ molasses, blackstrap molasses, or cooking molasses together as residual liquid from sugar manufacture. OQLF’s preferred Québec term for blackstrap is mélasse verte; it also records blackstrap and black strap in English. Do not infer that every “cooking molasses” product is a synonym for blackstrap: Crosby markets its cooking molasses as a blend of fancy and blackstrap. |
| Cooking molasses | cooking molasses / mélasse de cuisine or mélasse pour cuisson | Leave the identity boundary unresolved. CFIA groups the name in the same compositional standard as refiners’ and blackstrap molasses, but Crosby describes its retail cooking product as a blend of fancy and blackstrap. This evidence does not support a locale-neutral alias to blackstrap or fancy. |
| Dark molasses / mélasse noire | dark molasses / mélasse noire | Keep unresolved. OQLF reports that some sources distinguish dark/second molasses from green/blackstrap/third molasses, while other sources treat mélasse noire and mélasse verte as synonyms. Do not activate dark molasses, second molasses, or mélasse noire as aliases for blackstrap. |
| Generic molasses / treacle | molasses / mélasse; unqualified treacle | Leave the source-empty legacy molasses candidate unresolved. Unqualified treacle is also unresolved. OQLF marks light treacle and black treacle as UK terms for different products; Lyle’s separately sells Golden Syrup and Black Treacle. The current alias model has no market scope, so do not add either qualified treacle term globally. |

### Boundary terms kept separate

- **Corn syrup vs. glucose syrup:** the existing glucose-syrup alias remains unresolved because Canadian standards and OQLF use different scopes. Do not force an alias decision or add a generic glucose-syrup row without terminology review.
- **Light/dark corn syrup vs. generic corn syrup:** “light” and “dark” are meaningful marketed variants. Dark corn syrup includes molasses in Karo’s product example; its distinction is not just a spelling or language variant.
- **Golden syrup vs. golden corn syrup:** refining syrup and a blended corn syrup product have different source descriptions. Do not merge.
- **Golden syrup vs. invert sugar:** one Le Creuset recipe glosses golden syrup as sirop de sucre inverti, but Canadian standards name golden/refiners’ syrup separately and state it may be hydrolyzed. The recipe wording is not enough to establish a general alias.
- **Fancy, table, blackstrap/refiners’, cooking, and generic molasses:** Canadian standards distinguish source/process classes, while the manufacturer’s retail cooking blend shows why a broad cooking-molasses alias is unsafe. Keep the legacy generic molasses candidate unresolved.
- **Treacle:** keep the UK-qualified terms light treacle and black treacle inactive as global aliases, and keep unqualified treacle unresolved.
- **Pomegranate molasses and date syrup:** retain their current distinct identities. “Molasses” in pomegranate molasses does not make it generic molasses.
- **Cane syrup / melado:** outside this review; do not use as an alias for molasses or golden syrup.

## Measurement and conversion evidence

No form, density, default unit mapping, or conversion is proposed. Record the following only as source-specific observations; none is active conversion data.

| Source observation | Scope and disposition |
| --- | --- |
| Karo lists a 2 tbsp (30 mL) serving for its Light and Dark Corn Syrups. | Product label volume only; it does not provide a matching mass in the reviewed page. Do not infer density or map tablespoon/cup to grams. |
| Health Canada Canadian Nutrient File food code 4322, “Sweets, syrups, corn, dark” / “Confiseries, sirop de maïs, foncé,” lists 15 mL = 20.8 g, 30 mL = 41.6 g, 100 mL = 138.6 g, 125 mL = 173.3 g, and 250 mL = 346.6 g. | Exact published portion basis for the generic dark-corn-syrup entry. The record does not identify a brand or explain the measurement method. The CNF serving observation is not enough to activate a default density or unit mapping for an individual recipe or product. |
| Carnation Canada’s French praline-candy recipe lists 3 tbsp (45 mL) dark corn syrup. | Recipe measure only; no paired mass. It supports the fr-CA ingredient wording, not an app conversion. |
| Le Creuset’s French honeycomb topping lists 1 tbsp golden syrup or dark corn syrup. | Exact measure in one recipe alternative, retained below as substitution context only. It does not create a conversion or equivalence. |

No mass/volume observations were found for golden syrup or the molasses grades in the reviewed sources. Do not copy the dark-corn-syrup CNF value to generic corn syrup, glucose syrup, golden syrup, or molasses. No forms or package yields are proposed.

## Substitution evidence

No global substitution rule is proposed.

- Karo says its Light and Dark Corn Syrups can be used interchangeably in Karo recipes; it also notes a lighter flavor for Light and a more robust flavor and deeper color for Dark. Keep this as a brand-family contextual observation. It is not a safe catalog alias and does not establish that dark corn syrup equals generic corn syrup.
- Le Creuset’s single French honeycomb-topping recipe offers 1 tbsp golden syrup or dark corn syrup. Retain this as one recipe-specific alternative with an exact listed amount; do not generalize it to other recipes, golden syrup, or dark corn syrup.
- Crosby says its cooking molasses can commonly substitute for its fancy molasses in many recipes, with a more robust molasses flavor in the finished product. The page does not give a ratio or identify a universal scope. Keep it as maker-specific qualitative context, not a reusable rule.
- No source reviewed establishes an app-ready substitution for golden syrup ↔ molasses, treacle ↔ molasses, or corn syrup ↔ generic glucose syrup.

## Exact-key, legacy, ledger, forms, and recipe audits

The exact-key audit used the repository’s normalize_search_key helper in tools/seed_package/bundled_seed_package.py, comparing normalized candidate names and aliases against all 414 reference names/aliases, all 16 form labels/match terms, and the 99 legacy candidate names/aliases. The helper folds accents, ligatures, case, punctuation, and surrounding whitespace.

| Audited term | Exact normalized owner/result |
| --- | --- |
| corn syrup | Active canonical name on ingredient-ref-corn-syrup. |
| glucose syrup | Existing English alias on ingredient-ref-corn-syrup. |
| sirop de maïs / sirop de mais | Accent-folds to the current canonical French name sirop de mais on ingredient-ref-corn-syrup. |
| sirop de glucose | No exact active reference, form, or legacy match; its relationship to the current English glucose-syrup alias is unresolved. |
| molasses / mélasse | Exact names on the source-empty legacy candidate ingredient-ref-molasses; no active canonical row. |
| pomegranate molasses / mélasse de grenade | Separate active reference ingredient-ref-pomegranate-molasses. |
| date syrup / sirop de dattes | Separate active reference ingredient-ref-date-syrup. |
| Remaining scoped terms and proposed names | No exact normalized active reference, form, or legacy candidate match was found for light/dark corn syrup, golden syrup, golden corn syrup, refiners’ syrup, fancy/table/blackstrap/cooking molasses, dark molasses, treacle, or the reviewed Québec terms. |

There are no current forms for the scoped products. The 575 existing ledger source IDs were checked against packet-local prefix WP02-C-SYR-20261009-S; zero collisions were found. The IDs in the source map are local citations only and do not create or modify ledger records.

All 114 serialized recipe JSON files and 1,123 ingredient rows were scanned for scoped names. Only three recipe ingredient rows matched:

| Recipe row | Existing state | Recommendation |
| --- | --- | --- |
| app/src/main/assets/seed/bundled-library/recipes/040-croustillant-chocolate-et-noix-chocolate-nutty-crisp-798352ab-d4ad-4e5d-9c90-f0484609bca2.v1.json, ingredient row 798352ab-d4ad-4e5d-9c90-f0484609bca2-ingredient-1 | “1 cup corn syrup”; linked to ingredient-ref-corn-syrup. | Keep linked to generic corn syrup. |
| app/src/main/assets/seed/bundled-library/recipes/057-gateau-quadruple-chocolat-chocolate-truffle-cake-f4807560-d19f-4e2d-aeab-80138564b93f.v1.json, ingredient row f4807560-d19f-4e2d-aeab-80138564b93f-ingredient-22 | “1/4 cup corn syrup”; linked to ingredient-ref-corn-syrup. | Keep linked to generic corn syrup. |
| app/src/main/assets/seed/bundled-library/recipes/109-tarte-aux-pacanes-pecan-pie-02721958-323d-47a4-96df-d383ae0994ff.v1.json:52, ingredient row 02721958-323d-47a4-96df-d383ae0994ff-ingredient-3 | Original text “1/3 cup dark corn syrup”; ingredientName dark corn syrup; no ingredientRefId. | Recommend linking this row in a future integration to a distinct dark-corn-syrup identity if the coordinator accepts that candidate. Do not link it as an alias to generic corn syrup. Preserve originalText and do not modify the recipe during this review. |

No ingredient row names light corn syrup, golden syrup, golden corn syrup, glucose syrup, molasses, blackstrap, cooking molasses, or treacle. No recipe ingredient row uses the generic molasses legacy candidate. The recipe corpus does not establish a light/dark substitution rule or a molasses identity.

## Unresolved coordinator decisions

1. Resolve whether the active glucose syrup alias should remain on corn syrup. Canadian standards define glucose syrup broadly by starch source; OQLF’s older entry crosslists sirop de glucose with sirop de maïs. Decide whether to keep the alias, remove it, or create a separate generic glucose-syrup identity after Québec terminology review.
2. Confirm whether light corn syrup should remain a product-grade descriptor until a recipe needs it as a distinct search identity. Do not use “white corn syrup” as a global alias without a regional scope.
3. Accept or reject a distinct dark-corn-syrup candidate. If accepted, a future integration should link the exact unlinked ingredient row in recipe 109 to that identity; the current proposal has not changed the recipe.
4. Choose the fr-CA display and alias set for golden syrup from the CFIA naming family (sirop doré / sirop de raffineur / sirop de sucre raffiné) and the OQLF terms (mélasse claire / mélasse légère). Keep golden corn syrup separate.
5. Reconcile CFIA’s shared refiners’/blackstrap/cooking molasses standard with manufacturer-specific cooking-molasses blends. Decide whether cooking molasses is a separate searchable identity or a qualified product grade; do not alias it to blackstrap globally.
6. Decide how to represent fancy, table, and blackstrap molasses while leaving the generic legacy molasses candidate unresolved until its intended scope is known.
7. Leave densities, unit mappings, forms, conversions, and substitutions inactive unless later evidence identifies the exact product, form, measure basis, and scope.

## Source queries and source-to-claim map

All listed sources were accessed on 2026-10-09. The source-ID prefix was checked against all 575 ledger source references and had no collision.

### Search queries used

- site:inspection.canada.ca/en/about-cfia/acts-and-regulations "15.1.7" "Golden Syrup" "Glucose Syrup"
- site:inspection.canada.ca/fr/etiquetage/industrie liste ingrédients sirop de maïs doré sirop doré mélasse verte
- site:vitrinelinguistique.oqlf.gouv.qc.ca "sirop de glucose" "sirop de maïs"
- site:vitrinelinguistique.oqlf.gouv.qc.ca "mélasse claire" golden syrup
- OQLF mélasse verte blackstrap molasses dark molasses deuxième extraction third molasses
- site:karosyrup.com/products light corn syrup dark corn syrup molasses 2 tbsp 30 ml
- site:karosyrup.com/fequently-asked-questions light dark corn syrup interchangeable Karo recipes
- site:ca/fr "sirop de maïs léger" recette
- site:carnationmilk.ca/fr/recettes "sirop de maïs foncé"
- site:lecreuset.ca/fr_CA "golden syrup" "sirop de maïs foncé"
- site:aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4322 dark corn syrup
- site:crosbys.com/product fancy molasses blackstrap cooking molasses substitute
- Lyle's golden syrup treacle official product molasses

### Sources

| Source ID | Source | Claims used and limits |
| --- | --- | --- |
| WP02-C-SYR-20261009-S01 | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 15, sections 15.1.7–15.1.14 | Defines refined sugar syrup/refiners’/golden syrup; fancy, table, and refiners’/blackstrap/cooking molasses; glucose syrup; and source-named glucose syrup. Supports product-class distinctions and the glucose-syrup scope conflict. It does not itself name corn syrup. |
| WP02-C-SYR-20261009-S02 | CFIA, [Liste d’ingrédients et allergènes sur les étiquettes des aliments](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/liste-dingredients-allergenes) | Separately lists sirop de maïs doré, mélasse, sirop de glucose, sirop de maïs, and sirop de sucre raffiné / sirop de raffineur / sirop doré. Its golden-corn-syrup label example lists glucose, water, refiners’ syrup, salt, and vanillin. This is Canadian label terminology and one example, not a universal formula. |
| WP02-C-SYR-20261009-S03 | OQLF, [sirop de glucose](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084324/sirop-de-glucose) | Last updated 1990; lists sirop de glucose and sirop de maïs as preferred French terms, with broad starch-hydrolysis and corn-starch definitions. This terminology record conflicts in scope with the current Canadian standard; it is not treated as a reason to force the catalog alias. |
| WP02-C-SYR-20261009-S04 | OQLF, [mélasse claire](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296894/melasse-claire) | 2024 entry lists mélasse claire / mélasse légère and English golden syrup, light treacle (UK), first molasses, and light molasses; definition describes an amber, caramel-flavored syrup after first sugar extraction. UK or grade-specific English terms are not activated as global aliases. |
| WP02-C-SYR-20261009-S05 | OQLF, [mélasse verte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8874425/melasse-verte) | 2024 entry gives mélasse verte as preferred, mélasse de cuisine as rare, and blackstrap molasses / blackstrap / black strap / black treacle (UK) / third molasses. It explicitly says sources differ on whether mélasse noire/dark molasses is second extraction or synonymous with mélasse verte, so those terms remain unresolved. |
| WP02-C-SYR-20261009-S06 | Karo, [Products](https://www.karosyrup.com/products/) | Karo Light lists corn syrup, salt, and vanilla; Karo Dark is described as corn syrup with a small amount of molasses and a more robust flavor/color. Both show a 2 tbsp (30 mL) serving. Brand-specific composition and volume only. |
| WP02-C-SYR-20261009-S07 | Karo, [Frequently Asked Questions](https://www.karosyrup.com/fequently-asked-questions/) | Says Karo Light and Dark can be interchanged in recipes, with flavor/color differences; says light refers to color and that consumers may call Karo Light “white corn syrup.” This is brand-family advice, not global synonym or substitution evidence. |
| WP02-C-SYR-20261009-S08 | Cuisinart Canada, [French-language popcorn maker recipe booklet](https://www.cuisinart.ca/on/demandware.static/-/Sites-master-ca/fr_CA/v1757149474375/Instruction%20Booklet/CPM-100C_fr.pdf) | French Canadian recipe wording includes sirop de maïs léger and lists 2 tbsp (30 mL). Supports the fr-CA variant name; it is recipe context, not a product mass or a generic conversion. |
| WP02-C-SYR-20261009-S09 | Carnation Canada, [Bonbons aux pacanes pralinées](https://www.carnationmilk.ca/fr/recettes/desserts/bonbons-aux-pacanes-pralinees) | French Canadian recipe uses sirop de maïs foncé and lists 3 tbsp (45 mL). Recipe measure only; no paired mass. |
| WP02-C-SYR-20261009-S10 | Crosby Foods, [Our Molasses](https://www.crosbys.com/product/) | Producer describes fancy, blackstrap, and cooking molasses as separate products; says cooking molasses is a blend of its blackstrap and fancy molasses and can commonly replace fancy molasses in many recipes with a more robust result. Manufacturer-specific product and qualitative substitution context, no general ratio. |
| WP02-C-SYR-20261009-S11 | Lyle’s, [Our Products](https://www.lylesgoldensyrup.com/our-products/) and [Golden Syrup FAQ](https://www.lylesgoldensyrup.com/faq/) | Official producer sells separate Golden Syrup and Treacle / Black Treacle products and says golden syrup is made during sugarcane refining. Supports distinction, not a global definition of treacle. |
| WP02-C-SYR-20261009-S12 | Health Canada, [Canadian Nutrient File serving portion, food code 4322](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4322) | Exact published dark-corn-syrup serving portions transcribed in the measurement section. Product/brand and measurement method are unspecified; values remain inactive. |
| WP02-C-SYR-20261009-S13 | Le Creuset Canada, [Muffins au caramel à garniture croquante](https://www.lecreuset.ca/fr_CA/muffins-au-caramel-a-garniture-croquante/LCRCA-0084.html) | One French recipe offers 1 tbsp golden syrup or dark corn syrup for its honeycomb topping. Record as a recipe-specific alternative only. Its parenthetical “sirop de sucre inverti” is not adopted as a general alias. |

No source in this review supports an active catalog density, unit mapping, form conversion, package yield, or universal substitution rule.

## Coordinator integration result

Fixed the French corn-syrup display to `sirop de maïs`, removed the unsupported English `glucose
syrup` alias from corn syrup, and added a separate glucose-syrup identity. Added dark corn syrup and
linked only the exact `1/3 cup dark corn syrup` line in recipe 109. Five Health Canada portions and
brand/recipe-specific findings remain ledger evidence; no conversion or general substitution was
activated. Generic molasses remains an unresolved candidate, and light corn syrup remains inactive.
Section C remains open.

Canonical post-merge snapshot: 446 ingredient references, 16 forms, and 612 research-ledger records.

## Follow-up: light corn syrup integration (2026-10-11)

The earlier decision above described light corn syrup as inactive because this review did not add a
row. A later source-backed review promoted the separate identity
`light corn syrup / sirop de maïs clair`, with the narrow French alias `sirop de maïs léger`.
The row has no form, recipe link, density, unit mapping, or reusable conversion. CNF code 4323
portions and Karo Light/Dark advice remain source-scoped ledger evidence; the Karo advice is not a
global cross-brand substitution. See
[`wp02-light-corn-syrup-quebec-identity-boundary-review-20261011.md`](wp02-light-corn-syrup-quebec-identity-boundary-review-20261011.md)
and the integrated catalog checkpoint in
[`../batches/wp02-wp03-wp04-sweetener-pulse-insect-integration-20261011/README.md`](../batches/wp02-wp03-wp04-sweetener-pulse-insect-integration-20261011/README.md).
