# WP03 citrus overlap terminology review

**Review date:** 2026-10-09  
**Disposition:** Proposal only. No catalog, ledger, plan, roadmap, code, or test file was changed.

## Recommendation

Safely disambiguate and integrate the grapefruit and true-pomelo identities with species-qualified French display names and reciprocal, species-qualified French search phrases. Do not assign any of `pamplemousse`, `pomélo`, or `pomelo` as a bare alias to just one identity.

The overlap need not force a hold on the identities or require a new picker behavior. The recipe editor’s existing search indexes names and aliases across both languages, folds accents and punctuation, and returns every exact phrase match. Its picker renders each matching reference as its own row and selects only the row the user taps. The current seed validator, however, rejects an identical normalized full name/alias key owned by multiple references. Keep the query words useful by placing each shared term in distinct species-qualified phrases; the phrases remain unique to the validator while the existing partial-phrase search returns both rows for a bare query.

## OQLF terminology finding

The OQLF’s 2024 GDT entry **pomélo** identifies grapefruit as *Citrus paradisi*, lists *pomélo*, *pomelo*, and *pamplemousse* as privileged French terms, and says *pamplemousse* is common and legitimate in Québec for that fruit. The same entry says those French terms are also used for the Asian fruit identified as *Citrus maxima*. The companion **pamplemousse** entry identifies that Asian fruit as *Citrus maxima* and gives the same three French terms. This is a real French naming overlap, not an identity merge.

For fr-CA display, retain the familiar Québec grapefruit term on the existing grapefruit candidate and use the alternate OQLF term for the Asian species. Put the species in the visible name because the picker does not show aliases or a separate botanical-name subtitle.

## Proposed displays and exact aliases

Keep the existing grapefruit legacy ID and use the proposed true-pomelo ID. Put the following text in the canonical display fields and alias arrays:

| Identity | English display | fr-CA display | `aliasesFr` | `aliasesEn` |
|---|---|---|---|---|
| `ingredient-ref-grapefruit` | `grapefruit` | `pamplemousse (Citrus paradisi)` | `pomélo (Citrus paradisi)` | none for this overlap |
| `ingredient-ref-pomelo` | `pomelo` | `pomélo (Citrus maxima)` | `pamplemousse (Citrus maxima)` | `pummelo`, `shaddock` |

These aliases are qualified search phrases built from OQLF’s shared French terms and its species names. They are not quotations of a single OQLF term entry. Do not add the bare French terms as aliases. Accent folding makes the `pomélo` display and alias searchable as both `pomélo` and `pomelo`, so an unaccented duplicate alias is unnecessary.

The normalized full phrases remain distinct: `pamplemousse citrus paradisi`, `pomelo citrus paradisi`, `pomelo citrus maxima`, and `pamplemousse citrus maxima`. The checker rejects duplicate complete normalized keys across references, while the picker’s phrase matching finds a query contained in a longer term. Thus `pamplemousse`, `pomélo`, and `pomelo` each return both rows, and a query including `Citrus paradisi` or `Citrus maxima` distinguishes the intended row. No locale-specific search assumption is needed because both labels and aliases are searched in either UI language.

## Picker and validation consequence

In `IngredientReferenceSearchIndex.filterNormalized`, exact phrase results are accumulated across all indexed entries and returned as a list; there is no first-result or unique-result resolution for ingredient identities. `IngredientPickerDialog` renders each result using only its localized `pickerName` and passes the tapped reference to the selection callback. Therefore the species must be part of each French display string; putting it only in an alias would leave two potentially identical visible rows.

The bundled seed validator gathers complete normalized canonical names and aliases, then reports an error if one key belongs to multiple references. The qualified names and aliases above avoid that exact-key error. They still exercise the runtime’s intended multi-result behavior on the shared word queries. This recommendation relies on the inspected current search and validation behavior; it does not require permitting duplicate bare alias keys.

## Adjacent citron/cédrat boundary

This false friend is directly relevant to the same cross-language search behavior. OQLF maps French *citron* to English *lemon* (*Citrus limon*) and French *cédrat* to English *citron* (*Citrus medica*). Since the app searches both languages regardless of selected UI language, keep `citron` as the French display for lemon and `cédrat` as the French display for citron/cédrat; do not add bare English `citron` as a second identity alias on the cédrat record. If the English cédrat display uses `citron (cedrat)`, an English query `citron` will intentionally show both records, with localized rows `lemon` / `citron` in English and `citron` / `cédrat` in French. No further cédrat change is proposed here.

## Sources

All sources accessed 2026-10-09.

- Office québécois de la langue française, [pomélo (grapefruit, *Citrus paradisi*)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506586/pomelo), updated 2024.
- Office québécois de la langue française, [pamplemousse (true pomelo, *Citrus maxima*)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506588/pamplemousse), updated 2024.
- Office québécois de la langue française, [citron (*Citrus limon*)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366657/citron), updated 2001.
- Office québécois de la langue française, [cédrat / English citron (*Citrus medica*)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8366593/cedrat), updated 2001.

## Local implementation inspected

- `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: cross-language normalized terms, phrase matching, and multi-reference results.
- `app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt`: picker row display and tap-to-select behavior.
- `tools/seed_package/bundled_seed_package.py`: full normalized-key collision validation.

