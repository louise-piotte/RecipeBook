# WP02 A7 — Teff Meal / Semoule de Teff Boundary Review (R52)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. Keep the possible meal/semolina product unallocated. This file changes no shared catalog, form, legacy, ledger, recipe, plan, roadmap, or batch file.
- **Proposal-local source IDs:** `WP02-A7-TEFF-SEMOLINA-20261013-R52-S01` through `S07`. They are unique to this review and are not new ledger records.
- **Scope:** The possible dry-milled teff product called `semoule de teff` in one Québec food-writing source. This is distinct from plain teff flour, whole teff, R37's experimental malted teff flour, and the finished bread injera.

## Recommendation

Keep **`semoule de teff` / possible `teff meal` or `teff semolina` unresolved and unallocated**. Do not add an active reference, alias it to `ingredient-ref-teff-flour`, or create a form. A Québec article says teff seeds are dried to make “semoule ou farine,” which is direct local-language evidence that the author distinguishes the words. It gives no product label, grain fraction, grind boundary, or method by which its semoule differs from flour [S01]. OQLF's `semoule` entry defines the term specifically in soft- and durum-wheat milling; it does not extend that product class to teff [S02].

The reviewed Canadian and Québec product sources identify **teff flour / farine de teff**, not a standalone teff meal or semolina [S04–S06]. OQLF gives the crop term `tef` and English `teff`, while marking the French spelling non-current; it does not name a milled teff product [S03]. I found no source-grounded English display name or independently supported Québec French product name for a separate coarse product. Do not invent `teff meal`, `teff semolina`, `semoule de teff`, `gruau de teff`, or `farine de teff grossière` as an alias or display from one general article.

| Phrase or product | Disposition | Boundary |
| --- | --- | --- |
| `semoule de teff` | **Hold unallocated** | Attested in one Québec article as a term alongside flour, but no standalone product or reproducible milling specification is provided. |
| `teff meal`; `teff semolina` | **Do not add as English names or aliases** | No reviewed Canadian product label or terminology source establishes either as the English name for the described French-language product. |
| `gruau de teff`; `farine de teff grossière` | **Do not invent** | Neither phrase is source-attested as a Québec product name for this candidate. |
| `teff flour / farine de teff` | **Retain current identity** | `ingredient-ref-teff-flour` remains the active milling-product owner. The Quebec supplier labels its product `Farine de teff bio` [S04]. |
| `teff / teff d'Abyssinie` | **Retain current identity** | `ingredient-ref-teff-grain` remains the whole-grain owner. It is not a meal alias. |
| Malted teff flour | **Keep R37 disposition separate** | R37 held experimental malted teff flour for lack of a current standalone product specification and French name; that decision does not resolve plain teff meal [A7; S03–S04]. |
| Injera | **Keep as finished bread** | `ingredient-ref-injera` owns the prepared bread name, not teff or a teff milling product. The Québec article was previously cited for injera, but that A7 product-boundary question was not decided [S01]. |

## Checklist, archive, and ownership audit

The live [A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444) remains open for other grain meals, malted/toasted flour identities, and gluten-flour equivalence. R51 reviewed quinoa meal; R37 reviewed **malted** teff flour. The prior WP03 injera packet and ledger source `WP03-INJERA-20261011-S07` cite the same Québec article only for the finished bread name and teff-inclusive context. They do not adjudicate whether `semoule de teff` is a standalone ingredient product. Searches of the existing A7 proposal archive, live references/forms, legacy candidates, and ledger found no prior product disposition for teff meal/semolina. The exact phrase `semoule de teff` occurs in that WP03 source title/URL; this review does not mistake that citation for a ledger decision about a meal identity.

At this snapshot the bundled package contains **1,371 active references** and **100 forms**; the legacy file lists **64 candidates**, and the research ledger contains **1,701 records**.

| Current owner | Category | Current English / French | Aliases and numeric fields |
| --- | --- | --- | --- |
| `ingredient-ref-teff-grain` | `GRAIN_AND_CEREAL` | `teff / teff d'Abyssinie` | No aliases; null density; no unit mappings. |
| `ingredient-ref-teff-flour` | `FLOUR_AND_STARCH` | `teff flour / farine de teff` | No aliases; null density; no unit mappings. |
| `ingredient-ref-injera` | `BAKING_MIXIN_AND_PANTRY` | `injera / injera` | English alias `injera bread`; no teff form or ingredient equivalence. |

No teff forms exist. No teff meal/semolina phrase or candidate ID occurs in the legacy list. The ledger's `semoule de teff` occurrence is the WP03 injera source record, not a teff meal candidate or decision. No exact candidate name is owned by the active references or forms.

### Picker and search effect

Static query projections use the current `IngredientReferenceSearchIndex` behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized phrase matches take priority, followed by substring matches. Current results are:

| Query | Current result |
| --- | --- |
| `teff meal`; `whole teff meal`; `teff semolina`; `semolina of teff`; `semoule de teff`; `tef meal` | No result. |
| `teff` | `ingredient-ref-teff-grain`, `ingredient-ref-teff-flour`. |
| `teff flour`; `farine de teff` | `ingredient-ref-teff-flour`. |
| `semoule` | Six references, including cornmeal, durum and remilled durum semolina, rye meal, sorghum semolina, and granulated sugar through its French alias. |
| `meal` | Five references: cornmeal, cracker crumbs, matzo meal, rye meal, and whole wheat meal. |

If a bilingual teff-meal row were eventually justified, `teff` would gain another result, while `semoule` and `meal` would each gain a new broad-query result. Adding a `teff meal` alias to teff flour would instead send a possibly distinct meal query to plain flour. No picker or catalog change is proposed.

## Product, naming, and bundled-recipe audit

On 2026-10-13 I checked the bounded searches `"teff meal" Canada grocery flour`, `"teff meal" "teff flour" product package`, `site:ca "teff meal" -meal-planning`, `"teff semolina" Canada food product`, and `"semoule de teff" product farine teff Canada`. They did not establish a standalone Canadian or Québec teff-meal product or a bilingual label. These searches are not an exhaustive market survey; absence of a result is not proof that no such product exists.

The Québec article is the only reviewed source that explicitly contrasts teff semolina with teff flour. It is culinary writing, not a package, mill specification, or terminology ruling. The OQLF entry supplies a useful limit: its definition of `semoule` is about wheat milling and cannot be reused as a universal cereal-grind standard. Québec product evidence currently supports the plain flour name `farine de teff`; the Canadian VANA Africa miller's own-label sack is named `Red Teff Flour` in English [S04–S05]. Neither source establishes a separate meal identity. R37's malted-teff hold remains distinct and supplies no name for an unmalted meal [S03, S07].

The manifest lists **114 recipe files** containing **1,123 ingredient rows**. A static scan of every manifest-listed ingredient row and complete serialized recipe file found **zero** matches for `teff meal`, `whole teff meal`, `teff semolina`, `semolina of teff`, `semoule de teff`, `tef meal`, or `farine de teff semoule`. It also found no bundled `teff` mention. There is no recipe demand, recipe link, or substitution use case for this candidate.

## Measurement and substitution limits

- No exact-form household measure, bulk density, or mass-volume observation for a defined teff meal/semolina product was found. The Quebec flour listing's 454 g size and VANA's 20 lb flour sack are package formats, not recipe measures or density evidence [S04–S05].
- Bob's Red Mill gives a `1/4 cup (35 g)` serving and suggests replacing about one quarter of white flour with its **teff flour** [S06]. Both values and that recommendation concern its whole-grain teff flour product; do not transfer them to an uncharacterized teff semolina/meal.
- No source establishes that teff meal and teff flour are interchangeable, or supplies a tested meal-specific substitute ratio. Add no density, unit mapping, form conversion, yield, recipe link, or substitution rule.

## Proposal-local source register

Sources were checked on **2026-10-13**. IDs below are local to R52 and are not added to the research ledger.

| ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **S01** | Le Québec cuisine, [L’accompagnement de crêpes à la farine ou semoule de teff](https://quebecuisine.ca/book/laccompagnement-de-crepes-a-la-farine-ou-semoule-de-teff/), article text, © 2025. | Uses `semoule de teff` in the title and says the very small seeds are dried to make semolina or flour. Direct Québec French-language usage. | General culinary writing; no producer, package, particle size, milling process, or distinction from the named flour product. It was previously cited for injera, not adjudicated as a meal-product source. |
| **S02** | OQLF, [semoule (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8895941/semoule), definition and translations; entry authored by the Agence de coopération culturelle et technique (1977). | Defines the term for soft-wheat milling particles and for durum wheat product intended for pasta; gives English `semolina` and associated `farina`. | It does not define teff milling or approve `semoule de teff`; its stated definition is wheat-specific. |
| **S03** | OQLF, [tef (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef), definition, spelling note, and English translations; entry authored by the Conseil international de la langue française (1974). | Defines the cereal term `tef`, notes the spelling is recommended but non-current, and lists English `teff` and `teff grass`. | Does not name flour, meal, or semolina and does not validate any proposed compound French product name. |
| **S04** | Vallée des Prairies via La Chèvre et le Chou, [Farine de teff bio](https://lachevreetlechou.ca/produits/farine-de-teff-bio), active product heading, ingredient list, and available format. | Québec product listing names `Farine de teff bio`, lists teff as its ingredient, and shows a 454 g format. Supports the current flour name only. | The listing does not define a coarse teff product. Product/package wording is not a reusable measure or density. |
| **S05** | VANA Africa, [current Calgary product catalogue](https://vanaafrica.ca/), own-label product section and pictured bilingual label. | Canadian own-label mill describes a 20 lb red teff flour sack and shows the English product name `Red Teff Flour`; it says teff is milled and bagged in Calgary. | Supports a flour product, not meal/semolina; English and Amharic packaging is not Québec French evidence. Package weight is not a recipe measure. |
| **S06** | Bob’s Red Mill, [Teff Flour](https://www.bobsredmill.com/product/teff-flour), description, serving-size panel, and product-specific baking suggestion. | Names a whole-grain teff flour product, gives 1/4 cup (35 g) as its labeled serving, and suggests using it for about 25% of the white flour in baked goods. | Manufacturer guidance and label values apply to this specific flour; not a meal specification, density, or transferable substitution ratio. |
| **S07** | WP02 A7, [Malted Teff Flour Boundary Review (R37)](wp02-a7-malted-teff-flour-boundary-review-20261013-round37.md), product boundary and source audit. | Documents that `malted teff flour` is a separate experimental candidate without a verified standalone Canadian/Québec product or French name. | It does not review unmalted teff meal/semolina and does not supply its name, measurement, or substitution evidence. |

## Next action

Leave the candidate unallocated. Reopen it only when a Canadian or Québec producer/retailer provides a standalone teff meal/semolina product with a bilingual name and an explicit milling boundary. Review that product's measures and any substitution independently; do not infer them from teff flour, whole teff, malted teff flour, a package weight, or a wheat-semolina definition.
