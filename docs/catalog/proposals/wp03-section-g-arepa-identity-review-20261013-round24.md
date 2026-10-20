# WP03 Section G — Arepa Identity Review (Round 24)

- **Reviewed:** 2026-10-13
- **Status:** Proposal only; coordinator decision pending.
- **Scope:** One unreviewed regional prepared-bread identity from Section G. This review does not change shared catalog data, the plan, or the roadmap.

## Recommendation

Add one identity-only prepared-food reference:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-arepa` |
| Category | `BAKING_MIXIN_AND_PANTRY` |
| English display | `arepa` |
| English aliases | `arepas` |
| fr-CA display | `arepa` |
| French aliases | `arepas` |
| Default density / unit mappings | None |
| Forms / recipe links / package yield | None |
| Active conversions / substitutions | None |

Use the borrowed name `arepa` in both displays. Tourisme Montréal and a Montréal restaurant use `arepa(s)` in French for the prepared corn bread, and a Québec City retailer lists `Arepas medianas`. The targeted terminology search did not locate an OQLF or TERMIUM entry, so the French display remains a source-backed local borrowing pending independent Québec terminology review.

Represent the named prepared arepa product, separate from its maize inputs and from generic flatbread and tortilla identities. Keep specific regional varieties, fillings, and descriptive translations out of the global aliases. The Colombian National Library describes arepas as a varied family whose ingredients, maize variety, and preparation differ; this review therefore does not define one universal formula or serving form.

## Why this is an open Section G gap

The active plan leaves regional prepared breads and comparable regional prepared starches open in [Section G](../../RecipeBook-global-ingredient-catalog-plan.txt). The latest Section G proposal set covers bagel, generic flatbread, and focaccia; an exact-name scan found no arepa identity review or active identity. This is a distinct prepared product candidate, not an extension of the focaccia review.

The related corn-flour work does not resolve the finished product. The live catalog has separate identities for precooked corn flour and masa harina, and the ledger's existing Montréal `DOÑA AREPA` source (`WP02-S87`) is explicitly about a flour product; its brand is not an alias. A finished arepa is a separate catalog object from either flour.

## Live ownership and corpus audit

Snapshot read on 2026-10-13. The package contains 1,350 active references, 98 forms, one package-yield record, and 114 manifest-listed recipes. The research ledger has 1,668 records, 6,510 source entries, and 5,451 distinct source IDs. The legacy file has 64 candidates. Active global and contextual substitution-rule files are both empty.

| Artifact | Current ownership and boundary |
|---|---|
| Active references | No display or alias owns normalized `arepa` or `arepas`. Nearby prepared identities are `ingredient-ref-flatbread` (`flatbread / pain plat`), `ingredient-ref-corn-tortillas` (`corn tortillas / tortillas de maïs`), and `ingredient-ref-flour-tortillas` (`flour tortillas / tortillas de farine`). These remain separate. |
| Maize inputs | `ingredient-ref-precooked-corn-flour` (`precooked corn flour / farine de maïs précuite`), `ingredient-ref-masa-harina` (`masa harina / farine de maïs nixtamalisée`), `ingredient-ref-cornmeal`, and `ingredient-ref-whole-kernel-corn-flour` are distinct input identities. None owns `arepa(s)`. |
| Forms and yields | No active form or form search term contains `arepa`; no arepa package yield exists. The sole package-yield row is for S&W canned black beans. |
| Legacy identities | No `arepa` or `arepas` candidate is present. The proposed ID is unassigned. |
| Research ledger | No record represents the prepared arepa identity. Its only exact `AREPA` hits are the two flour-related records that cite `WP02-S87`, the Montréal `DOÑA AREPA` flour listing; the source note explicitly says the brand is not imported as a flour alias. |
| Prior proposals | `docs/catalog/proposals/` has no exact `arepa` or `arepas` identity review. The existing WP02 flour boundary and source review concern maize flour, not the prepared product. |

The manifest-listed corpus contains 114 recipe files, 1,123 ingredient rows, and 753,792 bytes. A full-JSON scan for `arepa`, `arepas`, `arepa con queso`, `arepa de choclo`, `arepas medianas`, `pain de maïs`, `gâteau plat au maïs`, and `corn cake` found no recipe text or ingredient-row match. There is no recipe line to relink.

## Exact picker projection

The picker in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) folds case, accents, ligatures, punctuation, and spaces. It prefers complete word-phrase matches before partial substring matches. Projection below adds only the proposed displays and plural aliases.

| Query | Current picker | With proposal |
|---|---|---|
| `arepa` | No result | `ingredient-ref-arepa` |
| `arepas` | No result | `ingredient-ref-arepa` |
| `arepa con queso`, `arepa de choclo`, `arepas medianas` | No result | No result; these variant/product phrases are not aliases. |
| `pain de maïs`, `gâteau plat au maïs`, `corn cake` | No result | No result; descriptive terms are not unique arepa names. |
| `flatbread`, `pain plat`, `pains plats` | `ingredient-ref-flatbread` | Same |
| `tortilla de maïs`, `tortillas de maïs` | `ingredient-ref-corn-tortillas` | Same |
| `precooked corn flour`, `farine de maïs précuite` | `ingredient-ref-precooked-corn-flour` | Same |
| `masa harina`, `farine de maïs nixtamalisée` | `ingredient-ref-masa-harina` | Same |

Do not add `flatbread`, `pain plat`, `corn cake`, `cornbread`, `pain de maïs`, `gâteau plat au maïs`, `tortilla`, `masarepa`, `precooked corn flour`, or `farine de maïs précuite` as aliases. The last two are maize flour products; the generic descriptive terms are broader than the named food. Do not add `arepa de choclo`, `arepa de mote`, `arepa de maíz pelado`, `arepa con queso`, or `arepa rellena`; the sources identify varieties or fillings rather than universal synonyms. Keep brand names such as `DOÑA AREPA` and `P.A.N.` out of the aliases.

## Evidence-limited identity, forms, measures, and substitutions

- **Identity:** Advance `arepa / arepa` as a named prepared maize bread/cake. The sources support a recognizable product family and local Québec usage while showing variation in ingredients and preparation. This row does not define one canonical recipe or encompass empanadas, tortillas, or every regional corn cake.
- **Forms:** Add no forms. Restaurant and retailer examples include grilled, filled, frozen, and size-qualified products, but the sources do not establish one transferable form taxonomy for the whole family.
- **Measurements:** Add no density, unit mapping, household measure, or count-to-mass conversion. One Québec City retailer lists a five-piece `Arepas medianas` product; a Canadian marketplace lists a 400 g cheese-filled SKU. Those product-specific package facts establish neither an arepa's general piece mass nor a reusable package yield. Keep both as source-specific observations only if recorded in a later ledger update.
- **Substitutions:** Add no global or contextual substitution. Shared maize ingredients, shape, or service role do not establish that an arepa can replace a tortilla, flatbread, cornbread, or another prepared starch in a recipe.
- **Recipe links:** Add none; the bundled corpus has no matching line.

## Evidence register

All URLs and source-ID prefixes below were checked against the live ledger on 2026-10-13; there were no source-ID or URL collisions.

| ID | Source and supported claim | Limits |
|---|---|---|
| **WP03-G-AREPA-20261013-R24-S01** | Tourisme Montréal, [*Où manger sans gluten à Montréal*](https://www.mtl.org/fr/experience/manger-sans-gluten), updated 2026-09-30. Uses French `arepas` for a Venezuelan restaurant's traditional Venezuelan/Colombian maize-flour bread served with varied fillings. | Local food-writing usage and one restaurant context, not an OQLF/TERMIUM terminology ruling or a universal preparation. |
| **WP03-G-AREPA-20261013-R24-S02** | Biblioteca Nacional de Colombia, [Biblioteca Básica de Cocinas Tradicionales de Colombia, “Arepa” entry](https://siise.bibliotecanacional.gov.co/BBCC/Documents/View/221). Describes a cooked-and-ground maize dough product and notes variation in dough ingredients, maize variety, and preparation; its examples include Antioquian varieties. | Supports a varied Colombian product family and named examples, not one recipe, a Venezuela-wide standard, or global aliases for the varieties. |
| **WP03-G-AREPA-20261013-R24-S03** | Arepera du Plateau, [French site](https://www.arepera.ca/fr) and [English site](https://www.arepera.ca/). A Montréal restaurant uses `arepas` in both locales and describes its own grilled, filled corn-based preparation. | One restaurant's culinary framing; no recipe ratio, standard serving, or universal filling/form is inferred. |
| **WP03-G-AREPA-20261013-R24-S04** | Épicerie Tropica, [Québec City Latin grocery](https://epicerietropica.com/), current listing `Arepas medianas (x5)`. Supports the borrowed plural name and current Québec retail presence. | One product listing; it provides no product mass, ingredient formula, or piece-size standard. |
| **WP03-G-AREPA-20261013-R24-S05** | Walmart Canada, [French listing for *AREPA WITH CHEESE - FRENCH 400g*](https://www.walmart.ca/fr/ip/AREPA-WITH-CHEESE-FRENCH/64K05ENEQSDD). Retains `Arepa` in a French product listing and describes this filled SKU as `gâteau plat au maïs`. | Product-specific marketplace text with a site disclaimer; the descriptive French phrase is not proposed as a generic alias, and 400 g is not a per-piece mass. |

## Review record

- Compared the open Section G checklist, latest Section G reviews, live references/forms, research ledger, legacy candidates, and all manifest-listed recipe files.
- Projected the exact and variant queries through the current picker phrase-first behavior; no app or emulator was run.
- Confirmed the proposed ID, source IDs, and source URLs are currently unassigned in the relevant live data.
- No catalog JSON, generated file, plan, roadmap, code, or test was edited. No tests or emulator checks were run for this proposal-only Markdown review.
## Coordinator integration decision (2026-10-13)

Accepted and integrated as identity-only `ingredient-ref-arepa`, displayed as `arepa` in English and French with `arepas` as the plural alias in both locales. No forms, measures, recipe links, conversions, yields, or substitutions were added. See the [R24 integration record](../batches/wp02-wp03-wp04-round24-gap-review-integration-20261013/README.md).
