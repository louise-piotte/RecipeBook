# WP03 Section L R129 — canned crushed tomatoes

## Decision

Added `ingredient-form-tomatoes-canned-crushed` under generic tomatoes, using the bilingual
commercial product labels `canned crushed tomatoes` / `tomates broyées en conserve`. The Government
of Canada Translation Bureau records `crushed tomato(s)` / `tomate broyée` / `tomates broyées`, and
Canadian retail and catalogue listings use those names for canned products. CFIA does not enumerate
“crushed” as a regulated tomato cut. The form therefore represents the named commercial presentation;
it does not imply equivalence to chopped, diced, whole, tomato pulp, purée, paste, or tomato-chili
sauce. [TERMIUM Plus, crushed tomato](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=esr&lang=fra&srchtxt=JITOMATES+TRITURADOS), [Metro Québec, Tomates broyées Aylmer](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/tomates-et-pates-de-tomates/tomates-broyees/p/058807656104), [ILIOS 2026 catalogue](https://fr.iliosfoods.ca/_files/ugd/7a4ac1_5fbfe6e609ab4310b481cac160c57337.pdf), [CFIA Canadian Standards of Identity, Volume 4](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-didentite-canadiennes-volume-4).

The unqualified aliases `crushed tomato(s)` / `tomate(s) broyée(s)` live on generic tomatoes and carry
no form hint because they do not identify canning. Explicit canned-crushed phrases select the new
form. Broad `canned tomatoes` / `tomates en conserve` terms remain shared across the diced, whole, and
crushed forms and therefore have no unique cut hint. The legacy `ingredient-ref-crushed-tomatoes`
candidate is recorded as merged into the new form and removed from the legacy-candidate list.

The bundle has no crushed-tomato recipe demand. Existing recipe links and rows are unchanged. No
density, unit mapping, package yield, conversion, or global substitution was added.

## Static validation

Passed:

- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --validate-only`
- `python3 -B tools/seed_package/normalize_bundled_seed_package.py --check`
- `python3 -B tools/ingredient_catalog/normalize_seed_ingredient_references.py --check`
- `python3 -B tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check`

No tests were run. This change only adds or updates database JSON data and its generated reference
index, as allowed by `AGENTS.md`.

After this batch, the package has 1,477 references, 109 forms, 1,822 ledger records, 7,571 source
entries, and 6,429 distinct source IDs. It has 61 active legacy candidates and 114 recipes / 1,123
ingredient rows.

See the [proposal](../../proposals/wp03-section-l-canned-crushed-tomatoes-review-20261015-r129.md)
and the [global catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). Section L
remains open.
