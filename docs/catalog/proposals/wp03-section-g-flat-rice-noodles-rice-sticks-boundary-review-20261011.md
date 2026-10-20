# WP03 Section G: Flat rice noodles and rice sticks boundary review

**Review date:** 2026-10-11  
**Disposition:** Hold / defer; do not add an active ingredient identity, alias, form, recipe link, measurement, or substitution rule.

## Recommendation

Current product and Québec recipe evidence supports a real flat-strip rice-noodle class sold under names such as **rice sticks**. It is distinguishable from fine rice vermicelli, edible rice-paper sheets, and Korean rice-cake sticks. The English product name **flat rice noodles** and Québec recipe wording **nouilles de riz plates** are both attested. This does not make them safe to activate now: the broader catalog candidate `rice noodles / nouilles de riz` remains unresolved, and either proposed display phrase would satisfy a broad query for that unresolved parent under current phrase search. The 114-recipe bundle has no direct ingredient-line demand for this class.

Keep `ingredient-ref-rice-noodles` unresolved as recorded by `WP03-S163`. Do not fold rice sticks into rice vermicelli, rice-paper sheets, mung-bean noodles, or prepared rice cakes. If this boundary is reopened after the broad-query matching issue is resolved and a recipe requests the product, `flat rice noodles / nouilles de riz plates` is the best-supported provisional bilingual pair. Treat **rice stick(s)** as an observed market name, not as an active alias in this review. These terms and the identity remain proposal evidence only.

## Live package and ledger snapshot

Audited the current package and files after the 2026-10-11 pasta updates:

| Surface | Current count or state |
| --- | ---: |
| Active ingredient references | 975 |
| Ingredient forms | 61 |
| Manifest recipes | 114 |
| Ingredient rows across manifest recipes | 1,123 |
| Research-ledger records | 1,250 |
| Research-ledger source entries | 3,952 |
| Legacy import candidates | 75 |
| Exact flat-rice / rice-stick ingredient rows in bundled recipes | 0 |
| Relevant active noodle/wrapper/cake-stick forms | 0 |

The active catalog includes `ingredient-ref-rice-vermicelli` (`rice vermicelli / vermicelle de riz`; French plural alias `vermicelles de riz`), `ingredient-ref-bean-thread-cellophane-noodles`, `ingredient-ref-rice-paper-wrapper`, and `ingredient-ref-korean-tteokbokki-rice-cake-sticks`. It has no active flat-rice, rice-stick, or generic-rice-noodle reference. The broad `ingredient-ref-rice-noodles` ledger record is unresolved, based on `WP03-S163`. The 75 legacy candidates contain no exact flat-rice noodle, rice-stick, rice-vermicelli, rice-paper, or rice-cake-stick candidate.

All four relevant active noodle/wrapper/cake-stick references have `defaultDensity: null` and `unitMappings: []`; none has an attached form. The catalog does have cooked and dry forms for rice grain, plus thickness-grade forms for flattened rice (poha). Those describe rice and poha and do not establish fresh/dry or width forms for noodles.

## Exact search ownership and collision audit

Current exact phrase ownership was checked against all 975 active references and their stored bilingual names and aliases. A phrase owner below means a complete normalized query phrase occurs within a stored term, matching `IngredientSearch.kt` behavior.

| Query phrase | Current exact owner(s) |
| --- | --- |
| `flat rice noodles`, `flat rice noodle` | None |
| `rice sticks`, `rice stick` | None |
| `rice noodles`, `rice noodle` | None |
| `nouilles de riz plates`, `nouilles plates de riz`, `nouilles de riz`, `nouille de riz` | None |
| `rice vermicelli`, `vermicelle de riz`, `vermicelles de riz` | `ingredient-ref-rice-vermicelli` only |
| `rice paper`, `rice paper wrappers`, `feuilles de riz` | `ingredient-ref-rice-paper-wrapper` only |
| `rice cake stick`, `rice cake sticks`, `bâtonnets de gâteau de riz` | `ingredient-ref-korean-tteokbokki-rice-cake-sticks` only |

There is no current active owner for the generic phrases. If the provisional English name `flat rice noodles` were stored, query `rice noodles` would match its final two words. If the provisional French name `nouilles de riz plates` were stored, query `nouilles de riz` would match its first three words. The phrase matcher deliberately accepts a whole query phrase embedded in a longer stored term, so this would send broad unresolved searches to a narrower product identity. Do not add either broad phrase as an alias to another row.

The exact current reference and form audit also confirms that `rice sticks` does not currently resolve through the Korean rice-cake row: that identity keeps `rice cake` in its English name and aliases. Its French aliases likewise preserve `gâteau de riz`. This qualification is important because a noodle `rice stick` is a flat dried noodle, while a Korean rice-cake stick is a prepared, thick cylindrical cake product.

## Manifest recipe demand audit

Every recipe file listed in the current manifest was parsed; its 1,123 ingredient rows were searched for flat rice noodles, rice sticks, generic rice noodles, rice vermicelli, rice-paper sheets, and rice-cake sticks in English and French. **No ingredient row matches.** No recipe line has an exact normalized key collision with the proposed identity, and no recipe was relinked.

Two non-ingredient mentions are not demand:

- Recipe 015, Beef Stroganov, says to serve with “du riz ou des nouilles” / “rice or noodles.” This is generic serving advice in instructions, not a named ingredient line or a request for the flat rice product.
- Recipe 054, Cookie Cake, says “décorer de vermicelles” / decorate with “sprinkles.” The French word is decorative confectionery, not rice vermicelli or rice noodles.

Recipe 093 is a cooked-rice recipe and has a rice-grain ingredient row; it does not request noodles. These checks retain the unrelated matches without treating them as identity demand.

## Product and terminology boundary

- **Flat rice noodles / rice sticks:** manufacturers and Canadian product listings use `rice stick(s)` for rice-based noodle products; at least one manufacturer explicitly describes its 5 mm rice sticks as flat rice noodles. Product sizes and formulas vary, so neither a width threshold nor a single ingredient declaration is generalized.
- **Rice vermicelli:** OQLF defines `vermicelle de riz / rice vermicelli` as a rice-flour product in long, very thin, translucent threads. The current active identity and French plural alias remain separate. No `rice stick(s)` alias is needed on this row.
- **Generic rice noodles:** OQLF’s older entry lists `nouilles de riz` within a wider Chinese-noodle family. It does not establish the dedicated English–Québec French pair or clean umbrella-to-subtype behavior needed here. Keep the candidate unresolved.
- **Rice paper:** `feuilles de riz / rice-paper sheets` are wrapper sheets softened for rolling; the current Québec product example is a sheet with a different ingredient declaration and use. Do not interpret a `rice paper` search as noodle demand.
- **Prepared rice cakes:** the current Korean tteokbokki row is explicitly qualified as Korean rice-cake sticks and uses `gâteau de riz` in French. It represents prepared cake pieces, not noodles. Keep “cake/gâteau” and Korean/tteokbokki qualifiers intact.
- **Bean-thread and glass noodles:** the active bean-thread identity is specifically based on mung-bean flour (`WP03-S162`). Its scope does not expand to rice-based noodles. Generic glass noodles remain unresolved by starch source.
- **Shape versus state:** flatness/width describes noodle geometry, while fresh/dry or cooked/uncooked describes product state. Neither the forms package nor these sources support noodle-state forms, state conversions, or width-grade forms for a shared identity.

## Measurements, forms, and substitution

The Québec Pad Thai recipe gives 8 oz (250 g) of flat rice noodles, and a Poulet du Québec pho recipe gives 450 g of medium flat rice noodles. These are source-specific recipe quantities, not mass/volume conversions, portion weights, package yields, or universal sizing data. The manufacturer’s 5 mm description and retailer pack sizes are product facts, not generic unit mappings. Current sources do not establish a density, dry-to-cooked yield, package yield, or conversion between rice-stick widths.

No form or substitution rule is supported. Recipe instructions to soak or cook a product describe preparation, not a globally equivalent cooked form or amount. There is no evidence for replacing flat rice noodles with rice vermicelli, mung-bean threads, rice-paper sheets, or prepared rice cakes, so no global or contextual substitution should be activated.

## Source-to-claim map

Accessed 2026-10-11 unless the source itself identifies an older revision. IDs beginning `WP03-FRN-20261011` are local to this proposal and have not been written to the shared ledger. Existing ledger source IDs are preserved as listed.

| Source ID | Source and URL | Claim supported | Limits |
| --- | --- | --- | --- |
| `WP03-FRN-20261011-S01` | OQLF, [pâtes alimentaires chinoises](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298986/pates-alimentaires-chinoises) | Lists rice noodles within a broad Chinese-noodle family; notes English types include wide/flat noodles; explains that English *noodles* can be generic or specific. | Last updated 1982. It does not map *rice sticks* to one preferred French flat-noodle term or define a dedicated rice-noodle boundary. Existing ledger source: `WP03-S163`. |
| `WP03-FRN-20261011-S02` | OQLF, [vermicelle de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8370358/vermicelle-de-riz) | Defines the rice-flour product as long, very thin, translucent threads; gives `vermicelle de riz / rice vermicelli` and permits French singular or plural. | Last updated 2000. It supports the existing narrow vermicelli identity, not widths or a universal boundary for every product called a rice noodle. Existing ledger source: `WP03-S161`. |
| `WP03-FRN-20261011-S03` | THAI SELECT Canada, [Rice Noodles](https://www.thaiselect.ca/rice-noodles) | Current Canada-facing sample lists `Rice Stick` products at 1, 3, 5, and 10 mm; some listed brands separately show rice vermicelli. | Product assortment is a market sample, not an official dimensional standard, complete Canadian inventory, or French terminology authority. |
| `WP03-FRN-20261011-S04` | Erawan Brand, [Noodles](https://www.erawanbrand.com/noodles) | Manufacturer lists rice-stick sizes S/M/L/XL and 0.7 mm rice vermicelli separately; states standard sizing depends on region. | Brand-specific market classification; does not set a universal width boundary or necessarily establish the geometry of every product named rice stick. |
| `WP03-FRN-20261011-S05` | Go-Tan, [Rice Sticks](https://www.go-tan.com/en/products/noodles/rice-sticks-250g/) | Manufacturer explicitly calls one 5 mm product flat rice noodles; its declaration lists 85% rice flour, tapioca starch, and water. | One manufacturer's product and formula; not a universal rice-stick composition or Canadian label. |
| `WP03-FRN-20261011-S06` | Maxi, [Erwan Rice Stick, Small](https://www.maxi.ca/en/rice-stick-small/p/20343466002_EA?source=nspt) | Canadian retail listing uses `Rice Stick, Small`, 454 g, with rice flour and water in its ingredient panel. | Dynamic retailer listing; direct opening was unavailable in this review, so claims are limited to the indexed product text. Retailer cautions that listed details can change and recommends checking the package. |
| `WP03-FRN-20261011-S07` | IGA, [French online grocery listing](https://www.iga.net/fr/epicerie_en_ligne/parcourir?page=158&pageSize=128&sort=IsInPromotionNextPeriod%3Adesc%3BFullDisplayName_Sort%3Aasc) | Québec French retail results show names such as `nouilles de riz à pad thaï moyen`, `nouilles de riz pad see ew large`, and `nouilles de riz pho petite`. | Search-indexed listing is older (crawled about 1.3 years before access) and redirected when opened. It supports market wording/grade labels only, not current availability, composition, shape standard, or preferred canonical terminology. |
| `WP03-FRN-20261011-S08` | Fédération des producteurs d’œufs du Québec, [Pad thaï classique](https://oeuf.ca/recettes/pad-thai-classique/) | Québec recipe uses `nouilles de riz plates` and gives a recipe quantity of 8 oz (250 g). | Recipe wording is usage evidence, not OQLF approval, product specification, density, or conversion evidence. |
| `WP03-FRN-20261011-S09` | Le Poulet du Québec, [Soupe tonkinoise minute au poulet](https://lepoulet.qc.ca/recettes/soupe-tonkinoise-minute-au-poulet/) | Québec recipe says `450 g de nouilles de riz plates moyennes` and instructs soaking them before preparation. | One recipe’s descriptor, amount, and method; no standardized medium width, generic measurement, or cooked yield follows. |
| `WP03-FRN-20261011-S10` | MITO, [Feuilles de riz](https://mito.ca/produit/feuilles-de-riz/) | Québec product uses `feuilles de riz`, is sold as sheets, lists water, rice, tapioca starch, and salt, and directs softening a sheet before rolling. | Product-specific wrapper evidence only; not a noodle formula or conversion. Existing ledger source: `WP03-WRAPPERS-20261010-S08`. |
| `WP03-FRN-20261011-S11` | Walmart Canada, [Bâtonnet de gâteau de riz Tokimi](https://www.walmart.ca/fr/ip/B-tonnet-de-g-teau-de-riz-Tokimi-1kg/4A4J9A4CMBM8) | French retail wording identifies Tokimi tteokbokki rice-cake sticks and describes a cylindrical prepared product. | Retail/marketplace listing is not a verified physical package panel; its description does not provide a generally applicable ingredient specification. Existing ledger source: `WP03-TTEOK-STICKS-QUEBEC-20261011-S01`. |
| `WP03-S162` | OQLF, [nouilles à base de farine de haricot mungo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18045583/nouilles-a-base-de-farine-de-haricot-mungo) | Supports the active mung-bean-flour thread identity as a separate product. | Product-specific terminology; it does not define rice noodles or generic glass noodles. |

## File and encoding verification

This is a proposal only. No shared catalog, forms, ledger, plan, roadmap, tests, batch README, or other proposal file was edited. The saved proposal was checked for strict UTF-8 decoding, no UTF-8 BOM, a final newline, and absence of common mojibake markers.
