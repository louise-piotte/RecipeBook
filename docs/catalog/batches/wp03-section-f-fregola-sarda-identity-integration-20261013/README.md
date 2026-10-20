# WP03 Section F Fregola Sarda identity

## Decision

Add identity-only `fregola sarda / fregola sarda` as `ingredient-ref-fregola-sarda` in
`GRAIN_AND_CEREAL`, with `fregula` and `fregula sarda` as spelling aliases in both language arrays.
The Montréal distributor lists the unchanged Italian product name on its English and French pages,
under *Pasta* and *Pâtes*. Sardinian government sources describe a distinct dried, toasted semolina
pasta product and document the `fregola/fregula` spelling. Keep it separate from couscous, pearl
couscous, orzo, semolina, and generic pasta.

The bundle has no matching recipe demand. Add no forms, measures, density, unit mappings, recipe links,
conversions, cooking yields, or substitutions. Package mass and nutrition-panel serving bases do not
establish a household measure or a conversion.

## Sources

- Regione Autonoma della Sardegna, [traditional product sheet for *fregola sarda*](https://files.regione.sardegna.it/squidex/api/assets/redazionaleras/24b3925f-91ef-4438-bf20-9cdc3cf7b3d9/7.-schede-categoria-paste-fresche-e-prodotti-della-panetteria-della-pasticceria-della-biscotteria-e-della-confetteria.pdf): identifies `Fregola sarda - Fregula`, describes irregular semolina-and-water pasta spheres, and lists drying and oven toasting.
- Italian Ministry of Agriculture, [national traditional agri-food products register](https://www.masaf.gov.it/flex/cm/pages/ServeAttachment.php/L/IT/D/7%252Ff%252Fc%252FD.752a52535cc29bcadf34/P/BLOB%3AID%3D11568/E/pdf): lists `Fregola, Fregula` for Sardinia.
- Distributions Macchi Inc., Montréal, [English product page](https://macchiinc.com/en/products/fregola-sarda/) and [French product page](https://macchiinc.com/produits/fregola-sarda/): both retain `Fregola Sarda`; the French page classifies it under *Pâtes*.
- Qui Sardegna / I Cagliaritani, [pasta range](https://www.quisardegna.it/en/pasta/): describes its fregola as dried Sardinian pasta made from durum semolina, with irregular small spheres, drying, and toasting.
- La Moisson, [French retail listing for Fregola](https://lamoisson.com/collections/pates-pasta/products/pates-artisanales-fregola): search-indexed French title and ingredient text support local retail wording; direct retrieval returned a cache miss, so no availability claim is made.

The ownership, picker, recipe-corpus, and numeric-boundary review is recorded in the [R45 proposal](../../proposals/wp03-section-f-fregola-sarda-regional-pasta-identity-review-20261013-r45.md).

## Validation

- The manifest-listed corpus scan found no fregola/fregula ingredient rows (114 recipes / 1,123 ingredient rows).
- The bundled reference catalog now contains 1,369 rows. The seed package normalizer and generated catalog index completed successfully.
- No tests or emulator checks were run because this change adds database JSON reference data and its generated index, under the updated `AGENTS.md` rule.
- The plan link anchors were migrated after the checklist insertion.

See [the Section F checklist](../../../RecipeBook-global-ingredient-catalog-plan.txt#L2556).
