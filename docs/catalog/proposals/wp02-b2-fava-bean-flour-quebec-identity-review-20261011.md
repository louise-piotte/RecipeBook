# WP02 B2 review — fava bean flour / farine de gourgane

**Reviewed:** 2026-10-11
**Scope:** one proposed flour identity in the open WP02 alternative-flour coverage. This is a flour-product review; it does not reopen WP03 whole-bean naming.

## Recommendation

**Accept an identity-only `FLOUR_AND_STARCH` reference** for `fava bean flour / farine de gourgane`, provisionally identified at the *Vicia faba* species level. This exact bilingual product is sold by the Québec Cuisine Soleil brand, the French product page names it `Farine de gourgane`, and OQLF recognizes `gourgane` as the Québec/Canada term for *Vicia faba* [S01–S04].

The recommendation was integrated on 2026-10-11; see the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the catalog and verification record.

Integrated identity-only catalog row:

| Field | Integrated value |
|---|---|
| `id` | `ingredient-ref-fava-bean-flour` |
| `nameEn` | `fava bean flour` |
| `nameFr` | `farine de gourgane` |
| category | `FLOUR_AND_STARCH` |
| aliases | none |
| forms, density, unit mappings, links, substitutions | none |

The source supports this named flour identity, not an organic attribute on every fava flour, a universal milling or dehulling process, or a general recipe substitution.

## Identity and Québec French boundary

Cuisine Soleil markets an English `Fava Bean Flour` product for delivery in Québec and Ontario, and its product page identifies the plant as *Vicia faba* [S01]. Its French product page names the corresponding product `Farine de gourgane` and explicitly identifies *Vicia faba* as the fève des marais known in Québec as gourgane [S02]. The product listing from Satau, the Québec brand's distributor, independently lists `Farine de gourgane` as a 700 g Cuisine Soleil flour with UPC 851424000257 [S03].

Use the source-attested pair `fava bean flour / farine de gourgane` as the display. OQLF's entry identifies `gourgane` as the preferred Québec/Canada name for *Vicia faba*; it lists `fève des marais` as another term and notes that it is less used in Québec [S04]. Do not add `fève des marais` as a flour alias: OQLF establishes the plant name, while the flour manufacturer uses `farine de gourgane`.

Keep the separately marketed Québec `farine de féverole` outside this row. OQLF assigns `féverole` to *Vicia faba minor*, and Les Moulins de Soulanges has a separately named `Farine de Féverole` product [S05–S06]. The available sources do not establish that the two flour products have the same seed class, processing, or culinary performance. Do not alias `féverole`, `faverole`, `horse bean flour`, or `field bean flour` to this row.

Also keep the following out of aliases: bare `gourgane` (whole pulse), `fève`/`fèves` (broad and potentially ambiguous), `broad bean` (whole-pulse term), and generic `bean flour`. The source supports the narrower English name `fava bean flour` and Québec product label `farine de gourgane`.

## Collision and recipe audit

The live package currently has 910 ingredient references and 48 forms. Neither references nor forms contain `fava`, `gourgane`, `farine de gourgane`, or `féverole`; the proposed ID is unused. Adjacent flour references include green lentil, yellow pea, soy, and chickpea flours. Whole-pulse references remain in `LEGUME_AND_PULSE`; none should acquire the flour names as aliases.

The research ledger has no fava-flour identity record. One existing record mentions fava only as a component of a commercial gluten-free blend; it is not evidence for an individual reference, recipe formula, or common flour blend. The 77-row legacy import-candidate file has no fava/gourgane flour candidate.

I scanned all 114 manifest-listed bundled recipes and their 1,123 ingredient lines for fava, broad bean, gourgane, and féverole terms: **zero ingredient-line hits** and no ingredient-reference links. The separate WP03 plant/legume discussion of whole fava beans/gourganes is not flour coverage. No recipe link is proposed.

## Numeric, form, and substitution disposition

- **Density and unit mapping:** leave unset. Cuisine Soleil gives a serving label of 30 g per ¼ cup for its own flour, but this is a product serving statement, not a generic measurement mapping for all fava flours [S07]. Keep it as source-specific evidence only.
- **Forms and processing:** add none. The Québec package is sold as flour, but the reviewed product page does not specify whole-seed versus dehulled milling or heat treatment. Do not infer `raw`, `precooked`, `roasted`, or `dehulled` forms from the word `flour`.
- **Conversions, yields, and substitutions:** add none. The manufacturer's suggested percentages are for constructing its own flour blend, not a tested replacement ratio in a recipe. The similarly named féverole product is not a proven substitute [S02, S05–S06].
- **Recipe links:** none; the bundled corpus has no matching flour demand.

## Decision boundary

This proposal resolves the product-specific Québec French display for fava flour while preserving the separate whole-bean and féverole boundaries. It does not claim that every *Vicia faba* flour on the market is identical to this organic Cuisine Soleil product. If integration needs a narrower botanical or process class than *Vicia faba*, obtain manufacturer specifications before adding qualifiers or aliases.

## Source register

- **S01 — Cuisine Soleil, [Fava Bean Flour](https://cuisinesoleil.com/en/product/fava-bean-flour/), accessed 2026-10-11.** Current brand product page. Supports the English product name, Québec/Ontario availability, and the brand's identification of the plant as *Vicia faba* / gourgane. Product nutrition and use claims are not imported.
- **S02 — Cuisine Soleil, [Farine de gourgane](https://cuisinesoleil.com/produit/farine-de-gourgane/), accessed 2026-10-11.** Current French brand page. Supports the exact Québec French product wording and the product-level link to *Vicia faba*. Its organic and culinary claims are not generalized.
- **S03 — Satau, [Cuisine Soleil product listing](https://satau.ca/fr/nos-produits/cuisine-soleil/), accessed 2026-10-11.** Current Québec distributor listing at the `Farine de gourgane (Aliments du Québec) bio` entry; gives Cuisine Soleil UPC 851424000257 and a 700 g package listing. Used only to confirm the product and local commercial naming.
- **S04 — OQLF, [gourgane | Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351051/gourgane), accessed 2026-10-11; entry updated 2006.** Supports `gourgane` as the preferred Québec/Canada plant name, its English equivalent `broad bean`, and the botanical scope *Vicia faba*; says `fève des marais` is less used in Québec.
- **S05 — OQLF, [féverole | Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8404131/feverole), accessed 2026-10-11; entry updated 1991.** Gives `féverole / faverole` and the narrower Latin identification *Vicia faba minor*; used to avoid an unsupported alias.
- **S06 — Les Moulins de Soulanges, [Farine de Féverole](https://moulinsdesoulanges.com/language/fr/farine-de-feverole/), accessed 2026-10-11.** Current Québec mill product page showing a separate flour sold under the féverole name. It does not establish equivalence to Cuisine Soleil flour.
- **S07 — Cuisine Soleil, [Créez votre farine](https://cuisinesoleil.com/creez-votre-farine/), accessed 2026-10-11.** The brand lists a 30 g per ¼ cup serving for its gourgane flour. This is not promoted to a general flour density or unit mapping.
