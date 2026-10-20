# WP04 Section Q review: dried whole egg — R351 — 2026-10-16

- **Status:** Integrated as one dried whole-egg form; see the [R351 integration README](../batches/wp04-section-q-dried-whole-egg-form-integration-r351-20261016/README.md).
- **Plan anchor:** The open Section Q egg checklist at [the active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7282) includes powdered eggs alongside whole, white, yolk, liquid, salted, and preserved products.
- **Recommendation:** Add one dried whole egg form under the existing generic `ingredient-ref-egg`; do not create a separate ingredient identity. Scope the form to plain, whole-egg product and keep duck/quail powder out of its terms.
- **Candidate form ID:** `ingredient-form-egg-whole-dried`.

## Evidence and product identity

The current CFIA [Canadian Standards of Identity, Volume 2](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-2) defines whole egg as the white/albumen and yolk without shell. Section 2 names **Dried Whole Egg** as a standardized processed egg product and limits its water content to 5%. It distinguishes this from dried yolk and dried egg white in Sections 3–4. Section 5 separately names **Dried Whole Egg Mix** when salt or a sweetening agent is added; Section 6 defines broader dried egg products that may contain other standardized egg products. These distinctions support a whole-egg form while warning against generic powder aliases. The related [Food Compositional Standards, Volume 19, §19.4.1](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) describes dried whole egg as whole contents from which the shell is removed and which are dried.

The French CFIA standard calls this product **poudre d’œuf entier** and defines **œuf entier** as white/albumen and yolk without shell. This is the strongest Québec-facing standardized French label. Current French product evidence aligns: SAIL’s Quebec-facing [Happy Yak product listing](https://www.sail.ca/fr-ca/products/happy-yak-ufs-entiers-en-poudre-995271-19-131570001) is titled **Œufs entiers en poudre** and declares **œufs entiers pasteurisés en poudre** as its ingredient. Happy Yak’s [French manufacturer page](https://happyyak.ca/fr/collections/ingredients-en-vrac/products/oeufs-entiers-en-poudre) uses **œuf entier en poudre** and says it is for omelettes, scrambled eggs, crêpes, and smoothies. The manufacturer page does not expose a complete ingredient declaration or source species; the SAIL listing does not specify species either.

Caneggs Canada’s [Whole Egg Powder](https://caneggs.com/shop/whole-egg-powder/) is a clearer composition example: the manufacturer describes a spray-dried, pasteurized product made from a complete Canada Grade A chicken egg without shell, with the ingredient listed as spray-dried pasteurized whole egg. This establishes a Canadian plain whole-hen-egg product, not that every powder called “egg powder” is single-ingredient or chicken-derived. The Canadian baking textbook [Understanding Ingredients for the Canadian Baker](https://opentextbc.ca/ingredients/chapter/egg-products/) notes that some dried whole-egg products use added carbohydrate, usually corn syrup, before drying to improve foaming. Keep such products inside a candidate only when the label or standard supports whole egg; do not imply that all commercial powders have the Caneggs ingredient declaration.

Québec’s [Regulation respecting food, P-29, r. 1](https://www.legisquebec.gouv.qc.ca/fr/document/rc/P-29%2C%20r.%201/20250401?langCont=en) defines egg to include domestic hen, turkey, quail, duck, and other domestic fowl, and defines dried egg as whole egg, yolk, or albumen in dried form. That legal umbrella does not make the proposed catalog form species-neutral: the existing unqualified culinary `egg / œuf` row is distinct from the catalog’s duck-egg and quail-egg identities, and the clearest plain-product source here is specifically chicken. Do not attach this form to `ingredient-ref-duck-egg` or `ingredient-ref-quail-egg`, or imply that either species has dried-product coverage. A source-backed species-specific powder can be reviewed separately if the corpus or product evidence calls for it.

The OQLF [GDT entry for poudre d’œuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429176/poudre-doeuf) lists **poudre d’œuf** and **œuf en poudre** but does not qualify whole egg; its English translation also exposes an older, broader egg-powder product sense. Do not use either as an alias for this whole-egg form. The standardized **poudre d’œuf entier** and product-attested **œufs entiers en poudre** preserve the fraction boundary.

## Candidate form and match boundary

| Field | Proposal |
| --- | --- |
| Form ID | `ingredient-form-egg-whole-dried` |
| Parent | `ingredient-ref-egg` (`egg / œuf`) |
| Form code / preparation state | `dried` / `dry` |
| English label | `dried whole egg` |
| Québec French label | `poudre d’œuf entier` |
| English matching terms | `whole egg powder`; `powdered whole egg` |
| French matching terms | `œuf entier en poudre`; `œufs entiers en poudre` |
| Density | `null` |

The labels follow the CFIA common names and the matching terms follow Canadian product wording. Do not add broad `egg powder`, `powdered egg`, or `dried egg`: the current picker’s query **powdered egg** already matches both the dried egg-white and dried egg-yolk forms, and broader terms can refer to different fractions, mixes, or composite egg products. The live catalog has separate active dried forms `ingredient-form-egg-white-dried` under egg white and `ingredient-form-egg-yolk-dried` under egg yolk; this candidate completes the whole-egg fraction without moving either form or creating a duplicate reference. Keep meringue powder, egg substitutes, dried whole-egg mixes, and other formulated dried egg products separate. The integrated R292 salted duck-egg form remains a salting state under duck egg, and the integrated R348 century-egg identity remains a preserved/alkali-treated product; neither is a dried whole-egg synonym.

## Picker effect and recipe demand

The app indexes form phrases alongside their parent reference and shows a form hint when a form phrase is explicit. Adding this candidate under `ingredient-ref-egg` therefore adds no second result row. Current exact searches for `whole egg powder`, `powdered whole egg`, `œuf entier en poudre`, and `œufs entiers en poudre` return no whole-powder match; each full proposed phrase would return the existing egg row with the dried-whole-egg hint. Existing `egg white powder` and `egg yolk powder` matches remain on their separate parent rows. Keep `powdered egg` unchanged as an ambiguous white/yolk query. Because the matcher accepts a query as a phrase contained inside a longer form term, the proposed `whole egg powder` term also makes the broader `egg powder` query return the generic egg row, but without a whole-form hint; do not add `egg powder` itself as a whole-egg synonym. `whole egg` similarly begins returning the egg row through the longer form phrase, while the French `œuf entier` query already returns that row through its base alias.

The package contains 114 manifest-listed recipes and 1,123 ingredient rows. I scanned all rows and recipe JSON for whole-egg-powder, dried-whole-egg, and French equivalents; there are no hits. The corpus has no line that justifies a recipe link, count equivalence, or direct substitution.

## Amounts, conversion, and substitution limits

Caneggs lists a **2 kg** package and instructs **1 part powder to 3 parts water by weight**. The package size is SKU-specific. The ratio is more transferable: the manufacturer direction is independently corroborated by *Understanding Ingredients for the Canadian Baker*, which gives 1 kg powdered whole egg to 3 kg cold water as a general reconstitution method. CFIA’s dried-whole-egg maximum of 5% water means at least 95% total solids; assuming a plain single-ingredient whole-egg powder, a 1:3 powder-to-water ratio gives at least 23.75% egg solids in the four-part mixture, close to and above the CFIA 23.5% minimum for liquid whole egg. This comparison is an inference from the standard and composition assumption, not a prescribed recipe equivalence. Record 1:3 by weight, if useful to the ledger, as a typical reconstitution direction for plain dried whole egg, with the Canadian text and Caneggs as separate support. The baking text notes that some commercial powders include added carbohydrate, so product instructions still govern when carriers or other additions appear.

The 1:3 direction does **not** establish a household spoon/cup measure, powder density, fresh-egg count, or universal quantity for replacing a shell-egg recipe line. It is a reconstitution method, not a contextual or global substitution rule. Add no density, unit mapping, count conversion, recipe link, direct fresh-egg conversion, or active substitution. Powder may also be mixed directly into dry recipe ingredients when the recipe’s method accounts for the liquid separately; no single reconstitution workflow is implied.

## Source ownership and integration notes

The English CFIA Volume 2 URL already appears in the R249 ledger sources `WP02-SECTIONE-DRIED-EGG-MERINGUE-R249-20261016-WHITE-S01` and `...-YOLK-S01`; the French URL already appears as `...-WHITE-S02` and `...-YOLK-S02`. Those existing entries point to white/yolk Sections 3–4, so do not relabel their current locators as Section 2. If a whole-egg ledger record is accepted, reuse the CFIA endpoints with a scoped whole-egg claim and Section 2 locator while preserving the existing records. The exact Caneggs, SAIL, Happy Yak, BCcampus, OQLF, and LégisQuébec URLs above had no exact owner in the current research ledger when checked.

The active plan’s broad Section Q egg checklist remains open after the liquid egg-white (R344), salted duck egg (R292), and century egg (R348) child work; none resolves plain dried whole egg. A form-only data integration should add the candidate form plus its sourced ledger record and check only the powdered whole-egg subtask once integrated. Keep the broader egg, dairy, and preserved-product checklist open. No software tests were run for this database JSON addition under the updated `AGENTS.md` rule.

## Sources

- [CFIA, Canadian Standards of Identity: Volume 2 – Processed Egg Products](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-2), §§1–6, last amended 2024-12-18.
- [ACIA, Normes d’identité canadiennes : Volume 2 – Produits d’œufs transformés](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-2), §§1–6, last amended 2024-12-18.
- [CFIA, Canadian Food Compositional Standards, Volume 19](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), §19.4.1.
- [Caneggs Canada, Whole Egg Powder](https://caneggs.com/shop/whole-egg-powder/), Canadian chicken product, single listed ingredient, 2 kg package and product reconstitution direction.
- [SAIL, Œufs entiers en poudre — Happy Yak](https://www.sail.ca/fr-ca/products/happy-yak-ufs-entiers-en-poudre-995271-19-131570001), Québec-facing product name and declared ingredient.
- [Happy Yak, Œufs Entiers en Poudre](https://happyyak.ca/fr/collections/ingredients-en-vrac/products/oeufs-entiers-en-poudre), French product wording and uses; no full ingredient declaration or source species shown.
- [BCcampus Open Education, *Understanding Ingredients for the Canadian Baker*, “Egg Products”](https://opentextbc.ca/ingredients/chapter/egg-products/), generic 1:3 weight reconstitution and caveat about added carbohydrate in some dried whole-egg products.
- [Éditeur officiel du Québec, Regulation respecting food, P-29, r. 1](https://www.legisquebec.gouv.qc.ca/fr/document/rc/P-29%2C%20r.%201/20250401?langCont=en), definitions for egg and dried egg.
- [OQLF, GDT: poudre d’œuf](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429176/poudre-doeuf), broad unqualified terminology; not used as a whole-egg alias.


## Integration notes

- Added `ingredient-form-egg-whole-dried` under `ingredient-ref-egg` using the Canadian standard label `poudre d’œuf entier / dried whole egg`, with the product-attested whole-egg powder terms. No new ingredient reference was created.
- Kept `egg powder`, `powdered egg`, `dried egg`, salted/sweetened whole-egg mixes, egg-white powder, egg-yolk powder, meringue powder, and egg substitutes distinct. Because phrase search accepts a query contained within a longer form term, `egg powder` and `poudre d’œuf` may return the generic egg reference without a form hint; only the explicit whole-egg phrases select the dried-whole-egg form.
- Kept the corroborated 1:3 powder-to-water instruction as preparation evidence only. Added no density, household measure, fresh-egg count, direct recipe conversion, package yield, recipe link, or active substitution.
