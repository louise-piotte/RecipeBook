# WP03 citrus overlap — refreshed Québec and Canadian coordinator review

**Review date:** 2026-10-16
**Disposition:** Retain and safely disambiguate the separate grapefruit and true-pomelo identities using the current species-qualified French labels. No further catalog change is recommended. Proposal only; no shared catalog, ledger, plan, roadmap, code, test, or emulator file was changed.
**Scope:** The OQLF overlap among `pamplemousse`, `pomélo`, and `pomelo`; current Canadian product names; the separate grapefruit-juice identity; and the directly related citron/cédrat false friend.

## Coordinator recommendation

Keep grapefruit (*Citrus paradisi*) and true pomelo (*Citrus maxima*) as separate `FRUIT` references. Do not merge or hold them. OQLF’s 2024 GDT pages list all three French terms for both species, while a current Super C Quebec product listing calls the Asian fruit `Pomélo` and Provigo’s French grocery category lists red grapefruit as `Pamplemousse rouge`. Use `pamplemousse (Citrus paradisi)` as the grapefruit display and `pomélo (Citrus maxima)` as the true-pomelo display; the current Québec retail names support that split.

Keep the existing reciprocal, species-qualified French aliases. They preserve useful search for either shared word while avoiding an identical full normalized key across references. Do not add any bare French `pamplemousse`, `pomélo`, or `pomelo` alias to either whole-fruit reference. Accent folding already makes the displayed `pomélo` searchable as `pomelo`.

The plan marks the 15 whole-citrus identities integrated. The broader WP03 fruit-product work remains open, but WP05 has since integrated the named-fruit-juice subset, including grapefruit juice. Keep that product under its own reference. CFIA’s current Canadian standard gives `jus de pamplemousse` its own grapefruit-juice class and defines same-fruit reconstituted/from-concentrate juice; this does not make the juice phrase an alias for either whole fruit or establish a true-pomelo juice product. Retain the existing ready-to-use aliases on the grapefruit-juice reference and keep water-removed concentrate separate.

## Exact reference wording and boundaries

These values match the live package and are the coordinator recommendation if the rows are touched during a later integration pass:

| Reference | English display | fr-CA display | `aliasesFr` | `aliasesEn` | Boundary |
|---|---|---|---|---|---|
| `ingredient-ref-grapefruit` | `grapefruit` | `pamplemousse (Citrus paradisi)` | `pomélo (Citrus paradisi)` | none for this overlap | Whole grapefruit only. No bare shared-term aliases. |
| `ingredient-ref-pomelo` | `pomelo` | `pomélo (Citrus maxima)` | `pamplemousse (Citrus maxima)` | `pummelo`, `shaddock` | Whole Asian true pomelo only. Keep it separate from grapefruit. |
| `ingredient-ref-grapefruit-juice` | `grapefruit juice` | `jus de pamplemousse` | `jus de pamplemousse fait de concentré`; `jus de pamplemousse reconstitué` | `grapefruit juice from concentrate`; `reconstituted grapefruit juice` | Ready-to-use grapefruit juice, including same-fruit reconstituted product. No `jus de pomélo` alias and no water-removed concentrate alias. |

The aliases are qualified phrases formed from the OQLF names and species labels; they are not presented as single OQLF quotations. The live normalized full keys are distinct: `pamplemousse citrus paradisi`, `pomelo citrus paradisi`, `pomelo citrus maxima`, and `pamplemousse citrus maxima`. The current package has no exact normalized cross-reference collision on these names or aliases.

### Citron / cédrat

Keep the separate pairs `lemon / citron` and `citron (cedrat) / cédrat`. Retain `poncire` as the cédrat French alias and `etrog`, `esrog`, and `ethrog` as its English aliases. Do not add bare `citron` to either alias list: OQLF maps French `citron` to English `lemon` (*Citrus limon*) and French `cédrat` to English `citron` (*Citrus medica*). The current English label `citron (cedrat)` is already qualified; the French picker displays `citron` and `cédrat` as different rows.

## Search and recipe audit

The current `IngredientReferenceSearchIndex` searches French and English names and aliases together, folds accents, and returns all references containing the query phrase. The ingredient picker renders each result with its localized canonical name as a separate button; selection occurs only when a user taps a row. It does not choose a first or unique match. Keeping the species in the visible French canonical names is therefore necessary; an alias-only qualifier would not distinguish the rows.

A read-only simulation of the current normalizer and phrase matching against the live reference names and aliases gives:

| Search | French picker rows | English picker rows |
|---|---|---|
| `pamplemousse` | `pamplemousse (Citrus paradisi)`; `pomélo (Citrus maxima)`; `jus de pamplemousse` | `grapefruit`; `pomelo`; `grapefruit juice` |
| `pomélo` or `pomelo` | `pamplemousse (Citrus paradisi)`; `pomélo (Citrus maxima)` | `grapefruit`; `pomelo` |
| `citron` | Eight rows, including `citron`, `cédrat`, `jus de citron`, and `zeste de citron` | Eight rows, including `lemon` and `citron (cedrat)` |

The first two searches safely return both whole-fruit rows, with species-qualified French display text. `pamplemousse` additionally finds the separate juice product. The short `citron` query is broader because the word occurs in other citrus-product and lime-search terms, but it still returns separate visible rows and does not silently resolve. No duplicate full keys are needed to obtain these results.

The current manifest contains 114 recipes and 1,123 ingredient rows. The ingredient-row scan found no grapefruit, true-pomelo, grapefruit-juice, or cédrat request. The 17 citrus-related rows remain existing demand for lemon, lemon juice/zest, lime juice, one unlinked `vinegar or lime juice` alternative, and one optional generic citrus-zest note. No link, product identity, form, or measurement change follows from the terminology decision.

## Refreshed evidence

Sources accessed 2026-10-16. Canadian retailer listings support current market wording only; they do not establish taxonomy. OQLF and CFIA are used for terminology and standardized product boundaries.

| Source | Evidence and limits |
|---|---|
| Office québécois de la langue française, [pomélo (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506586/pomelo), updated 2024 | Identifies grapefruit as *Citrus paradisi*, lists `pomélo`, `pomelo`, and `pamplemousse`, notes these French terms also refer to the Asian fruit, and says `pamplemousse` is common and legitimate in Québec for grapefruit. |
| Office québécois de la langue française, [pamplemousse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506588/pamplemousse), updated 2024 | Identifies the Asian true pomelo as *Citrus maxima*; lists the same three French terms and the English terms `pomelo`, `pummelo`, and `shaddock`. |
| Super C, [Pomélo, product 4279](https://www.superc.ca/allees/fruits-et-legumes/fruits/agrumes/pomelo/p/4279) | Current Quebec grocery listing uses the exact French product name `Pomélo` for the fresh fruit, separately identifying it in the citrus aisle. Retail naming and product description only; the listing cautions that supplier information can change. |
| Provigo, [Pamplemousses](https://www.provigo.ca/fr/alimentation/fruits-et-l-gumes/fruits-frais/oranges-et-agrumes/pamplemousses/c/34472) | French retail category `Pamplemousses` includes a `Pamplemousse rouge` product. Retail naming only; prices and availability vary. |
| Metro Québec, [Pomelo et pamplemousse : une histoire embrouillée](https://www.metro.ca/produits-a-decouvrir/fruits-et-legumes/conseils-de-mon-maraicher/fruits-citrins-pour-faire-rayonner-votre-journee) | Its current indexed French guide calls the pomelo also known as `pamplemousse`, then distinguishes the thick-skinned Asian pomelo from thin-skinned grapefruit under separate headings. This is consumer guidance, not botanical authority; direct page fetch returned 403 in this environment, so it is corroborating rather than primary evidence. |
| Canadian Food Inspection Agency, [Normes canadiennes de composition des aliments](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/normes-canadiennes-composition-aliments-0), Volume 10, §§10.3.6 and 10.3.15; page last modified 2025-05-01 | Defines the standardized `jus de pamplemousse` class and the same-fruit ready-to-use juice made by adding water to juice whose water was removed. Supports the existing grapefruit-juice owner and its reconstituted/from-concentrate aliases; does not establish a whole-fruit alias or a pomelo-juice row. |
| Office québécois de la langue française, [citron (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366657/citron) and [cédrat (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366593/cedrat), both updated 2001 | Confirms the cross-language false friend and the distinct *Citrus limon* / *Citrus medica* identities. |

## Local review records

- `docs/catalog/proposals/wp03-citrus-identity-coordinator-review-20261009.md`
- `docs/catalog/proposals/wp03-citrus-overlap-terminology-independent-review-20261009.md`
- `docs/catalog/proposals/wp03-citrus-quebec-overlap-followup-20261013.md`
- `docs/catalog/batches/wp03-wp04-citrus-mushroom-finfish-identity-integration-20261009/README.md`
- `docs/catalog/batches/wp05-section-v-fruit-juice-residual-integration-20261012/README.md`
- `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section M, checked citrus identity and open fruit-product items
- `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`, `app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt`, and `tools/seed_package/bundled_seed_package.py`

This is proposal-only documentation. No tests or emulator checks were run.
