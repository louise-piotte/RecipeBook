# WP03/WP05 Québec citrus terminology follow-up

**Review date:** 2026-10-13
**Disposition:** Safely disambiguate the overlapping whole-fruit names and retain the current integrated labels and aliases. Proposal only; no catalog, ledger, plan, roadmap, code, or test file was changed.
**Scope:** OQLF’s overlapping French names for grapefruit and true pomelo; the adjacent citron/cédrat cross-language false friend; the current grapefruit-juice row and picker results.

## Recommendation

Keep grapefruit (*Citrus paradisi*) and true pomelo (*Citrus maxima*) as separate `FRUIT` identities. Both OQLF entries list `pamplemousse`, `pomélo`, and `pomelo` as French names across the two concepts. OQLF also says that `pamplemousse` is common and legitimate in Québec for grapefruit. The short French words therefore cannot identify one whole fruit by themselves.

Use the species-qualified French display labels already in the package. Keep the reciprocal French search phrases species-qualified too; do not assign any bare `pamplemousse`, `pomélo`, or French `pomelo` alias to just one fruit. The app accent-folds `pomélo` to `pomelo`, so a second unaccented alias is unnecessary. This preserves natural short searches while making the two displayed whole-fruit rows unambiguous.

This recommendation is already reflected in the live package. The global plan marks the 15 reviewed citrus identities, including this boundary, integrated. WP03’s wider juice/zest/peel/pulp item remains open; WP05 later integrated the named single-fruit juice subset, including `grapefruit juice / jus de pamplemousse`, with same-fruit reconstituted/from-concentrate aliases. Keep that juice identity separate from both whole fruits. No additional catalog edit or recipe relinking is recommended by this review.

## Exact displays and aliases to retain

| Reference | English display | fr-CA display | `aliasesFr` | `aliasesEn` | Recommendation |
|---|---|---|---|---|---|
| `ingredient-ref-grapefruit` | `grapefruit` | `pamplemousse (Citrus paradisi)` | `pomélo (Citrus paradisi)` | none for this overlap | Retain. Do not add a bare French shared term. |
| `ingredient-ref-pomelo` | `pomelo` | `pomélo (Citrus maxima)` | `pamplemousse (Citrus maxima)` | `pummelo`, `shaddock` | Retain. The English aliases are listed by OQLF for true pomelo. |
| `ingredient-ref-grapefruit-juice` | `grapefruit juice` | `jus de pamplemousse` | `jus de pamplemousse fait de concentré`; `jus de pamplemousse reconstitué` | `grapefruit juice from concentrate`; `reconstituted grapefruit juice` | Retain as a separate juice identity. Do not add its product phrases to either whole-fruit row or create a true-pomelo juice alias without a named need. |

The qualified French phrases in the two whole-fruit rows normalize to four distinct full keys: `pamplemousse citrus paradisi`, `pomelo citrus paradisi`, `pomelo citrus maxima`, and `pamplemousse citrus maxima`. They do not collide under the seed validator’s normalized full-name/alias ownership rule. The bare terms still occur inside those longer phrases, so the picker can find both fruits for a short query without permitting duplicate full keys.

### Adjacent citron/cédrat false friend

Keep the existing pairs `lemon / citron` and `citron (cedrat) / cédrat`. Retain the cédrat record’s French alias `poncire` and English aliases `etrog`, `esrog`, and `ethrog`. Do not add bare English `citron` as an alias to the cédrat row: OQLF distinguishes French `citron` (*Citrus limon*, English `lemon`) from French `cédrat` (*Citrus medica*, English `citron`). The current English display `citron (cedrat)` is qualified and keeps the cross-language search useful. In the French picker, the visible rows remain `citron` and `cédrat`.

## Picker, collision, and recipe consequences

`IngredientReferenceSearchIndex` indexes French and English names and aliases together, folds accents, and returns all matching reference rows. The recipe picker renders each result using the selected-language display name as its own button; the ingredient is selected only when the user taps that row. The species text must stay in each French canonical display because aliases are not shown as a subtitle.

A static read of the current names and aliases against the search normalizer gives these results:

| Query | Visible French rows | Visible English rows | Consequence |
|---|---|---|---|
| `pamplemousse` | `pamplemousse (Citrus paradisi)`; `pomélo (Citrus maxima)`; `jus de pamplemousse` | `grapefruit`; `pomelo`; `grapefruit juice` | Three distinct fruit/product rows appear; no row is silently resolved. |
| `pomélo` or `pomelo` | `pamplemousse (Citrus paradisi)`; `pomélo (Citrus maxima)` | `grapefruit`; `pomelo` | Accent folding and the reciprocal qualified phrase return both whole-fruit rows. |
| `citron` | Eight matches, including `citron`, `cédrat`, `jus de citron`, and `zeste de citron` | Eight matches, including `lemon` and `citron (cedrat)` | This short cross-language search is broad because it also occurs in lime and citrus-product terms; the distinct localized labels remain visible and no result is auto-selected. |

The current reference package has no duplicate normalized full name/alias key among these overlapping terms. The multiple results above are phrase containment and intentional cross-locale matching, not exact-key collisions. If a future UI changes the picker to auto-select the first match or hide the qualified display labels, revisit this decision before relying on shared French search terms.

The manifest-listed recipe corpus contains 114 recipes and 1,123 ingredient rows. A scan of ingredient rows found no request for grapefruit, true pomelo, or grapefruit juice. The 17 citrus-related rows are existing demand for one half lemon, eight lemon-juice rows, four lemon-zest rows, two lime-juice rows, one unlinked `vinegar or lime juice` alternative, and one generic optional citrus-zest note. No recipe link, measurement, or form follows from this terminology review.

## Québec and Canadian sources

All web sources below were accessed 2026-10-13.

| Source | Evidence used |
|---|---|
| Office québécois de la langue française, [pomélo (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506586/pomelo), updated 2024 | Identifies grapefruit as *Citrus paradisi*; lists French `pomélo`, `pomelo`, and `pamplemousse`; says `pamplemousse` is common and legitimate in Québec for grapefruit; notes the same French names are also used for Asian true pomelo. |
| Office québécois de la langue française, [pamplemousse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506588/pamplemousse), updated 2024 | Identifies Asian true pomelo as *Citrus maxima*; lists the same three French terms and English `pomelo`, `pummelo`, and `shaddock`. |
| Office québécois de la langue française, [citron (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366657/citron), updated 2001 | Pairs French `citron` with English `lemon` and *Citrus limon*. |
| Office québécois de la langue française, [cédrat (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366593/cedrat), updated 2001 | Lists French `cédrat` and `poncire`; pairs the fruit with English `citron`, `etrog`, `esrog`, and `ethrog`, and *Citrus medica*. |
| Canadian Food Inspection Agency, [Normes canadiennes de composition des aliments](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), Volume 10, §§10.3.6–10.3.9 and 10.3.15; page last modified 2025-05-01 | Uses `jus de pamplemousse` for the standardized grapefruit juice; names the separate `jus de citron`, `jus de lime ou jus de limette`, and `jus d’orange` classes; defines same-fruit reconstituted/from-concentrate juice. Supports retaining the existing juice row and keeping the water-removed concentrate distinct. |
| Office québécois de la langue française, [lime (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366576/lime) and [limette (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366575/limette), updated 2017 | OQLF lists `lime` and `citron vert` for acidic lime, while `limette` is sweet lime (*Citrus limetta*). Keep `limette` off the current broad acidic-lime reference. |

## Local records reviewed

- `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section M, checked citrus identity item and open fruit-product item.
- `docs/catalog/proposals/wp03-citrus-identity-coordinator-review-20261009.md` and the earlier independent overlap proposal `docs/catalog/proposals/wp03-citrus-overlap-terminology-independent-review-20261009.md`.
- `docs/catalog/batches/wp03-wp04-citrus-mushroom-finfish-identity-integration-20261009/README.md` and `docs/catalog/batches/wp05-section-v-fruit-juice-residual-integration-20261012/README.md`.
- `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`, `app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt`, and `tools/seed_package/bundled_seed_package.py`.

This is a documentation-only adjudication. No tests or emulator checks were run.
