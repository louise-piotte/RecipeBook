# WP03 Section F — Baddaz maize-couscous identity review (2026-10-13, R37)

## Review record

- **Scope:** one regional preprocessed-grain product: Moroccan Amazigh *Baddaz*, sold as corn couscous.
- **Open checklist:** the Section F item for regionally significant cereal mixes and preprocessed grains remains open at [plan line 2462](../../RecipeBook-global-ingredient-catalog-plan.txt#L2555).
- **Status:** integrated as identity-only `ingredient-ref-baddaz-corn-couscous` in the active reference catalog. No ledger record, form, measure, recipe link, conversion, yield, or substitution was added.
- **Recommendation:** add one identity-only `GRAIN_AND_CEREAL` reference for **`Baddaz (Moroccan corn couscous) / Baddaz (couscous de maïs marocain)`**, with no aliases, forms, measurements, conversions, yields, recipe links, or substitutions. Suggested ID: `ingredient-ref-baddaz-corn-couscous`.
- **Boundary:** this is the product named *Baddaz*, not a universal identity for every regional food called corn/maize couscous. Keep the Baddaz qualifier visible in both displays.
- **Integration:** the completed identity-only row uses the proposed bilingual display, has no aliases, null density, and empty unit mappings. The regional boundary and no-recipe-demand decision remain documented under the open Section F checklist item.

## Why this is a distinct open item

Before this review, the checklist and proposal/batch archive contained no Baddaz or maize-couscous adjudication. Exact searches across the live plan, roadmap, active reference names and aliases, forms, legacy-import candidates, research ledger, proposal archive, and bundled recipe files found no prior owner or decision. This review does not reopen the completed plain, pearl, barley, or millet couscous identities, or the separately reviewed Ogi Baba, Fura, Tom Brown, Hausa Koko flour, Khao Mao, Puttu podi, millet-rava, rice-grits, and tsampa boundaries.

DARI's current French product page calls the product **Baddaz** or **couscous de maïs**, identifies it as a Moroccan Amazigh product, and lists **100% semoule de maïs** [S01]. Its English page titles it **Corn Couscous** and says that DARI's corn couscous is known in Morocco as **Baddaz** [S02]. A Montréal-serving French retailer lists **Couscous maïs Baddaz** and describes it as traditional 100% corn semolina [S03]. The listing establishes local-market wording and product identity; it was out of stock when checked, so it is not evidence of current availability or a terminology ruling.

The generic phrase has a wider regional scope. An IFDC technical sheet developed with Benin's agricultural research institute calls a Southern Benin product **yeke-yeke (couscous de maïs)** and describes it as granulated, pre-steamed non-fermented maize paste (*mawè*) [S04]. That is not the DARI Baddaz product specified as 100% maize semolina. The French display therefore keeps the regional product qualifier, and no generic `couscous de maïs` alias is proposed. The OQLF entry found for `couscous` defines the prepared North African dish; it does not define Baddaz or a dry maize-couscous ingredient [S05].

## Exact active ownership and search effects

The pre-integration snapshot contained **1,365 active references**, **100 forms**, **64 legacy-import candidates**, and **1,699 research-ledger records**. Before integration, no exact Baddaz, `couscous de maïs`, `corn couscous`, or `maize couscous` owner existed in references, forms, legacy candidates, or ledger records. The source-ID prefix `WP03-BADDAZ-R37-20261013-` was unused across the catalog research archive before this proposal was created.

| Current owner | Existing scope and boundary |
|---|---|
| `ingredient-ref-baddaz-corn-couscous` | Identity-only `Baddaz (Moroccan corn couscous) / Baddaz (couscous de maïs marocain)`, with no aliases, forms, density, or unit mappings. Before integration, no active reference, form, legacy candidate, exact ledger record, or earlier proposal owned it. |
| `ingredient-ref-couscous` | `couscous / couscous`, no aliases, forms, density, or unit mappings. Generic current owner; it does not identify corn semolina. |
| `ingredient-ref-pearl-couscous` | `pearl couscous / couscous perlé`; no aliases or numeric data. |
| `ingredient-ref-barley-couscous` | `barley couscous / couscous d'orge`, English alias `belboula`; no forms, density, or mappings. |
| `ingredient-ref-millet-couscous-thiere` | `millet couscous (thiéré) / couscous de mil (thiéré)`, English alias `tyere`; no forms, density, or mappings. |
| `ingredient-ref-cornmeal`, `ingredient-ref-hominy-grits`, `ingredient-ref-maize-arraw`, corn-flour rows | Cornmeal, hominy grits, millet/corn arraw, and flour products retain their distinct names and preparations; none is a couscous identity. Do not merge Baddaz into them. |

Before integration, the four couscous references had no attached forms. Their existing generic, pearl, barley, and millet ledger records do not own Baddaz; their measurement/substitution states remain as recorded. The candidate scan found no exact Baddaz record or source evidence to attach to those records. No ledger change was made.

This is the pre-integration static projection of the phrase-first and substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), using the bilingual display names above:

| Query | Pre-integration result | Result with Baddaz row | Effect |
|---|---|---|---|
| `baddaz` | None | Baddaz row | Adds a direct product-name search. |
| `couscous de maïs` | None | Baddaz row | The qualified French display is a phrase match. Keep `marocain` visible in the result. |
| `corn couscous` | None | Baddaz row | The English display returns the specifically qualified Moroccan product. This generic phrase must not become an alias for other regional products. |
| `couscous` | Four rows: plain, pearl, barley, and millet couscous | Five rows | Broad query gains one visibly qualified product. |
| `corn` / `maïs` | 19 / 21 rows | 20 / 22 rows | Adds one result to already broad crop-term searches. |

The single-result generic corn-couscous query is bounded to the currently represented product. If another product such as Benin *yeke-yeke* is later added, it must receive its own identity and the generic search should show both; do not alias it to Baddaz.

## Recipe-demand audit

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned, including serialized recipe text and ingredient reference fields, for `Baddaz`, `couscous de maïs`, `couscous maïs`, `corn couscous`, and `maize couscous` (accent-folded where applicable).

- Candidate-phrase recipe files: **0**.
- Candidate-phrase ingredient rows: **0**.
- Existing recipe links to a Baddaz reference: **0**.

No bundled recipe demand or recipe edits are proposed.

## Forms, measurements, and substitutions

- **Forms:** add none. DARI identifies a retail product made of corn semolina but does not establish a reusable alternate form or a general moisture/cooking state across Baddaz products.
- **Measurements and density:** keep `defaultDensity` null and `unitMappings` empty. DARI and the Montréal listing show a **500 g retail package**; package mass is not a household portion or cup conversion. The manufacturer's nutrition basis per 100 g is not a recipe measure. The reviewed Baddaz pages supply no exact-form volume-to-mass observation or validated yield.
- **Substitutions:** add no global or contextual substitution. DARI and the seller describe Baddaz as an alternative to wheat couscous and suggest familiar couscous uses, but the pages provide no validated cross-product ratio or cooking method. The separate IFDC/INRAB *yeke-yeke* process and hydration directions apply to that Beninese maize-paste product, not Baddaz. Do not transfer its process or quantities to Baddaz or to the wheat, pearl, barley, or millet couscous references.
- **Other numeric claims:** do not import nutrition values, package size, product price, or source-specific preparation statements into ingredient measurements.

## Source register

Sources were checked online on 2026-10-13. Proposal-local IDs use the prechecked prefix `WP03-BADDAZ-R37-20261013-`; no shared ledger source or status was added.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-BADDAZ-R37-20261013-S01` | DARI, [Couscous Baddaz](https://www.couscousdari.com/fr/couscous-de-mais-baddaz), French manufacturer product page. | Names Baddaz / couscous de maïs, identifies its Moroccan Amazigh context, declares 100% maize semolina, and lists a 500 g pack. This supports product identity and French wording, not a Québec terminology ruling, household measure, or universal corn-couscous formula. |
| `WP03-BADDAZ-R37-20261013-S02` | DARI, [Corn Couscous](https://www.couscousdari.com/en/corn-couscous-0), English manufacturer product page. | Calls DARI's corn couscous Baddaz and declares 100% corn semolina. The manufacturer page does not establish that all regional corn couscous products share this formula. |
| `WP03-BADDAZ-R37-20261013-S03` | Le Pro 1600, [Couscous maïs Baddaz – 500 g](https://lepro1600.com/products/couscous-mais-baddaz-500-g), French retailer listing serving Greater Montréal and Canada. | The listing supports local-market wording, product identity, and a 500 g package. It was out of stock when checked, so it does not establish current availability; its title is a seller listing, not a normative French term. |
| `WP03-BADDAZ-R37-20261013-S04` | IFDC / Institut National des Recherches Agricoles du Bénin, [Fiche technique : transformation du maïs en yeke-yeke (couscous de maïs)](https://ifdc.org/wp-content/uploads/2019/07/FICHE-2-TRANSFORMATION-DU-MAI%CC%88S-EN-COUSCOUS-PROCESSING-OF-MAIZE-INTO-COUSCOUS.pdf), pp. 1–5. | Documents a distinct Southern Benin product formed from non-fermented *mawè* paste and pre-steamed, then optionally dried. Its process and preparation amounts are not transferable to Moroccan Baddaz. |
| `WP03-BADDAZ-R37-20261013-S05` | OQLF, [couscous (mets)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502206/couscous), Grand dictionnaire terminologique. | Defines the North African prepared-dish sense of `couscous`; it does not name Baddaz or establish a Québec ingredient label for dry maize couscous. |

## Next action

Keep the Section F checklist open. The approved integration adds only the qualified Baddaz identity in `GRAIN_AND_CEREAL`, preserves the source-backed bilingual display, and adds no aliases, forms, measurements, recipe links, conversions, yield, or substitution. Keep the Benin *yeke-yeke* boundary separate. The change only adds database JSON data, so no tests are required under `AGENTS.md`; static catalog and package checks are recorded in the integration batch README.
