# WP03 Section F: broomcorn-millet alias and picker boundary review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only; no shared catalog or ledger file changed.
- **Scope:** Whether the qualified English phrase `broomcorn millet` can be added as an alias to the existing common-millet grain identity.
- **Recommendation:** Keep the phrase out of active aliases for now. The OQLF maps it to the same species as the current `common millet / millet commun` row, and a current Canadian grocery listing uses it for a millet product. However, the current ingredient search treats each word in an alias as a complete phrase match. Adding `broomcorn millet` would also make the shorter query `broomcorn` select common millet, while CFIA uses `broomcorn` for a distinct sorghum stalk-and-inflorescence product used to make brooms [S04]. Record this as an alias-boundary hold on the existing common-millet ledger record if this review is integrated; do not create a new reference or candidate.
- **Plan location:** Section F keeps species-level millet coverage open and already has a distinct `common millet / millet commun` identity with only `proso millet` as an English alias ([plan lines 1898–1906](../../RecipeBook-global-ingredient-catalog-plan.txt#L1991)). This packet reviews one additional phrase and does not reopen the species identity or other millet aliases.

## Candidate boundary

OQLF's GDT entry for *millet commun* identifies *Panicum miliaceum*, gives `millet commun` as the French head term, and lists `broomcorn millet` among its English translations [existing source `WP03-S180`]. TERMIUM Plus also maps `broomcorn millet` to *P. miliaceum* in a botany / grain-growing record [S01]. Ontario's government weed guide uses the hyphenated `broom-corn millet` among proso-millet names, but that source describes a crop weed rather than a food package [S02]. A current T&T online grocery listing uses the exact unhyphenated product title **Tong Feng Organic Broomcorn Millet**, package size 400 g [S03].

Together, these sources support the species relationship and document the phrase in Canadian food retail. They do not support a separate species, preparation state, or ingredient identity. Keep the canonical row as `common millet / millet commun`, category `GRAIN_AND_CEREAL`; do not create an identity for `broomcorn millet`.

The picker boundary prevents activating the otherwise source-backed alias. [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L23) checks whether the query's complete normalized words occur within a catalog term before falling back to partial matching. If `broomcorn millet` is an alias, a one-word query for `broomcorn` will match that alias and return common millet. That shorter term can also refer to broomcorn sorghum (*Sorghum bicolor* var. *technicum*), a different crop class; the current catalog has no row that could preserve that distinction. This is a code-path inference from the existing matcher, not a live picker test.

| Phrase | Decision | Boundary |
|---|---|---|
| `broomcorn millet` | **Hold as an active English alias.** | OQLF and TERMIUM connect it to *P. miliaceum*, and T&T uses the exact phrase for a current grocery product. The current matcher would also return the row for the shorter `broomcorn` query. |
| `broom-corn millet` / `broom corn millet` | **Hold.** | Ontario's spelling is hyphenated; normalization makes it a different key from `broomcorn millet`. It is in a weed-identification context and has no separate food-label or Québec French evidence. Do not add spelling variants merely because they refer to the same crop taxon. |
| `broomcorn`, `broom-corn`, `broom corn`, `broom millet` | **Do not add.** | These shorter forms discard the millet qualifier. CFIA scopes broomcorn to a sorghum stalk-and-inflorescence product used for brooms; none is a safe global food-grain alias. |
| `millet`, `mil`, `millet commun`, `common millet`, `proso millet` | **Leave existing ownership unchanged.** | `millet commun / common millet` remains the species-qualified row; the shorter generic `millet` belongs to a separate, broader reference. `proso millet` remains the current row's only English alias. |
| `millet à balais`, `millet balai`, and other constructed French phrases | **Do not add.** | No OQLF or current Canadian/Québec food label reviewed here uses these as the French name for the grocery product. Retain the existing Québec display `millet commun`. |

## Exact catalog and ledger ownership audit

The read-only audit applied the repository's accent-, punctuation-, case-, and ligature-folding key to active reference display names and aliases, form labels and match terms, legacy-candidate names and aliases, ledger record IDs, and the candidate phrase set below. The live package at this review contains 1,256 references (117 `GRAIN_AND_CEREAL`), 94 forms, 66 legacy candidates, and 1,565 ledger records.

| Surface | Exact normalized ownership and current state |
|---|---|
| Active references | No exact owner for `broomcorn millet`, `broom-corn millet`, `broom corn millet`, `broomcorn`, `broom-corn`, or `broom corn`. `ingredient-ref-common-millet` owns `common millet / millet commun` and the English alias `proso millet`; it is `GRAIN_AND_CEREAL`, with empty French aliases, null `defaultDensity`, and empty `unitMappings`. `ingredient-ref-millet` separately owns generic `millet / millet`. `ingredient-ref-grain-sorghum` remains `grain sorghum / sorgho à graine` with empty aliases. |
| Ingredient forms | No exact candidate phrase or common-millet form is present. No form is proposed. |
| Legacy identities | No exact candidate phrase or proposed reference ID is present among the 66 legacy candidates. |
| Research ledger | No candidate record, source ID, or decision owns `broomcorn millet` or its spelling variants. The verified `ingredient-ref-common-millet` record already cites OQLF source `WP03-S180`; its stored source summary mentions `common millet`, `proso millet`, and *Panicum miliaceum*, but does not capture the page's `broomcorn millet` translation. Existing `WP03-S181`–`S183` remain species/cereal evidence, not proof of a Canadian grocery label. New IDs `WP03-BROOMCORN-MILLET-ALIAS-20261012-S01`–`S04` were absent from the live ledger. |

The corpus audit scanned all **114** recipe files named by the live package manifest, including full serialized recipe text and the `originalText`, `ingredientName`, and `ingredientRefId` fields for each of **1,123** ingredient rows. The phrases `broomcorn millet`, `broom-corn millet`, `broom corn millet`, `broomcorn`, `broom-corn`, `broom corn`, `broom millet`, `common millet`, `millet commun`, and `proso millet` produced **zero recipe-file hits and zero ingredient-row hits**. There is no bundled recipe demand or line to relink.

## fr-CA evidence and limits

The live OQLF *millet commun* GDT page directly supplies the Québec French base term, the species *Panicum miliaceum*, and English translations including `broomcorn millet` [existing `WP03-S180`]. The canonical French display therefore remains `millet commun`; no new French alias is needed. The entry is in botany and describes a plant cultivated mainly as a cereal. It is not a food-product standard and does not recommend a French translation of the current T&T title.

The Canadian T&T listing is an English product listing. It does not identify a Latin species, supply a French title, or establish Québec retail preference. TERMIUM's record is a Canadian terminology source but its subject fields are botany and grain growing; Ontario's page is crop-identification material. The evidence supports documenting the English phrase and its limits, not constructing `millet à balais` or claiming that a particular label is Québec-preferred.

## Numeric, form, and substitution limits

- The T&T listing's **400 g** value is the package size for one named organic item; it is not a serving, household measure, or mass-volume conversion.
- Keep `defaultDensity` null and `unitMappings` empty. No product-neutral volume/mass relation, serving, or package yield is established.
- Add no ingredient form, dry/cooked form, cooking yield, or conversion. The proposal does not change the existing whole-grain identity.
- Add no substitution between common millet, generic millet, pearl millet, sorghum, rice, or any other cereal. No recipe-specific test or quantity supports one.
- Keep the existing ledger measurement and substitution research states unchanged (`not_yet_researched`).

## Recommended integration disposition

If accepted, append the four new product/crop source records and an **accepted alias-boundary hold** to `ingredient-ref-common-millet`. Keep the active row, display, aliases, category, forms, recipes, and numeric data unchanged; do not create a separate candidate record. Reconsider the exact English alias only if picker matching can preserve the `millet` qualifier or a review establishes that a bare `broomcorn` query safely belongs to this food product. This proposal itself changes no shared files and adds no new row.

## Proposal-local source register

Pages were checked on 2026-10-12. The existing OQLF source is cited by its current ledger ID so its evidence is not duplicated.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| Existing `WP03-S180` | Office québécois de la langue française, [GDT: millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), definition, preferred French terms, English translations, and Latin name. | Direct Québec terminology evidence for `millet commun`, *Panicum miliaceum*, and English translation `broomcorn millet`. The entry concerns the plant/crop and does not standardize a product label. The current ledger already contains this source. |
| `WP03-BROOMCORN-MILLET-ALIAS-20261012-S01` | Translation Bureau, [TERMIUM Plus: broomcorn millet](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enw&lang=eng&srchtxt=BROOMCORN+MILLET), 2016 record, Botany / Grain Growing. | Maps the phrase to *Panicum miliaceum* and lists it as standardized terminology in a grain-growing record. This supports the species-level name, not a Canadian human-food product standard or kitchen measure. |
| `WP03-BROOMCORN-MILLET-ALIAS-20261012-S02` | Ontario Ministry of Agriculture, Food and Agribusiness, [Proso millet: Weed identification guide for Ontario crops](https://www.ontario.ca/document/weed-identification-guide-ontario-crops/proso-millet), names and species section. | Identifies proso millet as *Panicum miliaceum* and lists `broom-corn millet` among other names. Its context is weed identification; it does not establish a human-food label or Québec French wording. |
| `WP03-BROOMCORN-MILLET-ALIAS-20261012-S03` | T&T Supermarket, [Pantry rice and grains listing](https://www.tntsupermarket.com/south-van/pantry/rice.html), item `Tong Feng Organic Broomcorn Millet 400g`; cross-listed by [Instacart for T&T](https://www.instacart.ca/products/57170361-tong-feng-organic-broomcorn-millet-400-g?retailerSlug=t-t). | Current Canadian grocery catalog evidence for the exact English product title and 400 g package. The direct T&T storefront requires JavaScript in this review; its indexed catalog entry is visible. Neither listing provides a botanical ingredient declaration, French label, generic serving, or conversion. |
| `WP03-BROOMCORN-MILLET-ALIAS-20261012-S04` | Canadian Food Inspection Agency, [D-96-08: Import and Domestic Movement Requirements, Sorghum spp.](https://inspection.canada.ca/en/plant-health/invasive-species/directives/grains-and-field-crops/96-08), subject, introduction, and broomcorn definition/context. | Identifies broomcorn as *Sorghum vulgare* var. *technicum* and describes the stalk with inflorescence as material used to make brooms and whisks. This is phytosanitary crop terminology, not a food identity; it supports keeping the unqualified picker query `broomcorn` separate from qualified millet. |

No tests or emulator checks were run. This proposal changes documentation only; no shared database or application files were modified.
