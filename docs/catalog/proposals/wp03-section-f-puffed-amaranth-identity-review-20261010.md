# WP03 Section F Puffed Amaranth Identity Review

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** proposal only. No canonical catalog, ledger, legacy, recipe, plan, roadmap, generated, or test file changed.
- **Scope:** one additional preprocessed grain product from Section F's still-open puffed-grain and regional preprocessed-grain coverage: puffed amaranth. The recent puffed-millet packet explicitly keeps puffed amaranth separate, but it does not review its identity or naming. This packet does not reopen puffed rice, wheat, quinoa, or millet.
- **Recommendation:** accept an identity-only reference for the food product `puffed amaranth / amarante soufflée`, with no aliases. Treat the French compound as Québec-market/source-attested wording, not an OQLF-preferred term. Keep forms, measurements, conversions, yields, recipe links, and active substitutions empty.

## Current package and prior-coverage audit

The live split seed contains **885 ingredient references**, **48 ingredient forms**, **114 manifest-listed recipe files**, and **1,123 ingredient rows**. The research ledger contains **1,130 records** and the legacy-import file contains **77 candidates**.

The current Section F checklist leaves “remaining puffed-grain candidates” open (plan line 1488) and separately leaves regional cereal mixes/preprocessed grains open (line 1522). The active catalog already has `ingredient-ref-amaranth-grain` (`amaranth / amarante`), `ingredient-ref-amaranth-flour` (`amaranth flour / farine d'amarante`), `ingredient-ref-amaranth-greens` (`amaranth greens / feuilles d'amarante`), and the distinct puffed-rice, puffed-wheat, puffed-quinoa, and puffed-millet identities. None represents puffed amaranth. The research ledger has a verified base-amaranth identity record but no puffed-amaranth record or candidate; the legacy file has no matching candidate. No earlier proposal focuses on this product: the puffed-millet review mentions it only as a separate product that must not be merged with millet.

## Identity and proposed row

| Stable ID | English display | fr-CA display | EN aliases | FR aliases | Category and data |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-puffed-amaranth` | `puffed amaranth` | `amarante soufflée` | none | none | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |

OQLF's existing `amarante` entry identifies the edible seed product as a cereal, pairs it with English `amaranth`, and notes that the seeds may be used whole or milled into flour. The live grain reference and the parallel puffed-grain references use `GRAIN_AND_CEREAL`. Puffed amaranth is a separate marketed product identity, not a dry/cooked preparation form of raw amaranth and not a flour. The proposed names are directly attested in Canadian/Québec product material; OQLF does **not** define or endorse the compound `amarante soufflée`.

Do not import organic or brand qualifiers. Available product evidence does not specify an amaranth species, a universal puffing method, whether all products are unsweetened or uncoated, or a whole-seed claim. Keep the identity at the named product level and do not expand it to formulated bars, granolas, or multi-grain cereals.

### Wording and neighboring-product dispositions

| Term or product | Disposition | Reason / boundary |
| --- | --- | --- |
| `puffed amaranth / amarante soufflée` | **Accept for integration review** | Canadian producer/certification and Canadian French-language sources name the product/component this way. The compound is source-attested, not an official terminology ruling. |
| `amaranth / amarante` | Keep on the existing raw edible-seed identity | OQLF supports the base pair; neither term alone specifies puffing. Do not add puffed amaranth as an alias to the base row. |
| `amaranth flour / farine d'amarante`; amaranth greens | Keep on their existing identities | Milling and plant-part boundaries remain distinct. |
| Puffed quinoa, millet, rice, and wheat | Keep separate | They are different grain products; no cross-grain equivalence is implied. |
| `amaranth puffs`, `puffed amaranth seeds`, `popped amaranth`, `graines d'amarante soufflées`, and `amarante soufflée bio` | Do not add as aliases | These exact alternate forms are not needed for the supported display pair. The current sources do not establish a global alias set or a product-wide organic claim. |
| `amaranthe`, `kiwicha`, or a named species | Do not add | The existing amaranth decision deliberately keeps the regulatory/colorant spelling `amaranthe` and unsourced `kiwicha` inactive. No puffed-product source identifies a species. |
| Sweetened/coated puffs, puffed-amaranth cereal, granola, bars, and other mixes | Outside this row | Formulated products can include multiple ingredients; their name or amaranth component does not make them equivalent to the named puffed-amaranth product. |

## Exact recipe demand

All **114 manifest-listed recipe files** and all **1,123 ingredient rows** were scanned across ingredient text, names, references, and other recipe JSON strings. Searches included `puffed amaranth`, `puffed amaranth cereal`, `amaranth puff(s)`, `puffed amaranth seed(s)`, `amaranth`, `amarante soufflée/soufflee`, `graines d'amarante soufflées`, and broader puffed-grain wording.

| Query group | Recipe files matched | Ingredient rows matched | Disposition |
| --- | ---: | ---: | --- |
| Puffed-amaranth English product phrases | 0 | 0 | No recipe link or text change. |
| French `amarante soufflée` and descriptive variants | 0 | 0 | No French line demand. |
| Broad `amaranth` / `amarante` | 0 | 0 | No bundled amaranth line of any form. |

This is catalog-coverage evidence only. The producer and retailer references below are not bundled recipe demand, and no recipe link or amount is proposed.

## Normalized-key and ID collision audit

The active references and forms were checked using the package's `normalize_search_key` behavior (case folding, accent/ligature folding, and punctuation normalization). `ingredient-ref-puffed-amaranth` and a possible form ID are unused. Neither complete proposed display has an exact normalized key collision in active names, aliases, form labels, or form match terms. The ledger and legacy file contain no exact candidate ID/name match. No other proposal contains a focused puffed-amaranth row or alias; the puffed-millet proposal's exclusion is not an accepted assignment.

The only normalized phrase overlap is the shorter base term: `amaranth` is contained in `puffed amaranth`, and `amarante` in `amarante soufflée`; both belong to the existing raw amaranth identity. This is a family/query overlap, not an exact-key collision. Broad `amaranth` searches may also find amaranth flour and greens. Do not claim that broad searches become unique; use the full product wording for exact selection.

## Keep identity, forms, measurements, yield, and substitution separate

| Concern | Evidence-qualified recommendation |
| --- | --- |
| **Identity/category** | Add one `GRAIN_AND_CEREAL` identity for the named puffed-amaranth food product, separate from raw edible amaranth, flour, leaves, and other puffed grains. Do not infer species, brand, organic status, coating, sweetening, or a universal process specification. |
| **Forms** | Add no `IngredientForm`. Puffing is the defining product transformation in the identity name, consistent with the separate puffed-grain identities; no dry/cooked preparation-state requirement exists. |
| **Measurements** | Keep `defaultDensity` null and `unitMappings` empty. The current producer certification and terminology pages provide no general serving measure, density, or mass-volume relation. Do not derive a measure from a formulated bar or cereal product. |
| **Conversions and yields** | Add no puffing factor, raw-to-puffed conversion, cooking/water relation, package yield, or cooked yield. The reviewed sources do not supply a transferable quantitative relation. |
| **Substitutions** | Activate no global or contextual rule, including substitutions with puffed quinoa, millet, rice, wheat, or cereal mixes. No reviewed source establishes a transferable ratio or method/dish scope. |
| **Ledger states** | If integrated, keep measurement and substitution research `not_yet_researched` unless the coordinator separately records qualified evidence. No unsupported numeric or substitution data belongs on this row. |

## Source register

Sources were checked on **2026-10-10**. Proposal-local IDs below are not ledger source IDs.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-PAMARANTH-20261010-S01` | Tootsi Impex / Yupik, [COR certification PDF](https://tootsi.com/pdf/kosher.pdf), letter dated 2026-06-25, expires 2027-06-30, pp. 55–56, product code 31092 | Names a current Yupik/Tootsi-manufactured product `ORGANIC PUFFED AMARANTH` and identifies Tootsi Impex's Montreal, Québec plant. Supports the English product identity and Canadian producer context. Certification is not an ingredient declaration or processing specification; the organic qualifier is not carried into the canonical name. |
| `WP03-PAMARANTH-20261010-S02` | Tootsi Impex / Ecocert Canada, [French organic-product certificate annex](https://www.tootsi.com/pdf/bio_fr.pdf), certificate CA-91344-Z-383631-2025, issued 2025-06-30, p. 8 | Lists `Amarante soufflée` among products certified for the Elan, Yupik, and Tootsi Impex brands. Supports the French product wording in a Québec-market brand/product document. It is not an OQLF preference, does not supply the COR item code, and does not establish composition or measurements. |
| `WP03-PAMARANTH-20261010-S03` (reuses ledger source `WP03-S23`) | OQLF, [amarante](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), preferred term and definition (last updated 2009) | Pairs preferred French `amarante` with English `amaranth`, defines it as a cereal from edible amaranth seeds, and notes the seeds can be used whole or milled into flour. Supports the base identity and grain/flour distinction, not the compound puffed-product name. |
| `WP03-PAMARANTH-20261010-S04` | Enjoy Life Foods Canada, [Glossaire des ingrédients](https://enjoylifefoods.ca/fr/glossaire-des-ingredients/), entry `Amarante soufflée` | The Canadian brand's French glossary uses this exact term for a crunchy product ingredient and identifies amaranth as a seed. Supports Canadian French ingredient usage; it is a formulated-food glossary, not a standalone product specification or puffing-process standard. |
| `WP03-PAMARANTH-20261010-S05` | Metro Canada, [Enjoy Life baked apple-caramel soft-baked bars](https://www.metro.ca/epicerie-en-ligne/allees/collations/collations-sucrees-et-bonbons/barres-tendres-et-collations-aux-fruits/barres-tendres-cuites-au-four-aux-pommes-et-caramel-sans-gluten/p/819597011456), ingredient list | A Québec-facing French retail listing includes `AMARANTE SOUFFLÉE` in a multi-ingredient bar. Corroborates current local product-label wording; the amaranth component is not a standalone product or a measure. |
| `WP03-PAMARANTH-20261010-S06` | Grainwell, [Puffed Amaranth](https://grainwellfoods.com/product/puffed-amaranth/), manufacturer product page | A North American puffed-grain manufacturer offers a separate puffed-amaranth product. Corroborates the processed-product boundary; it is not Québec terminology evidence, a retail formula, or a numeric source. |

## Integration recommendation and acceptance checks

Recommend **accept for integration review** as `ingredient-ref-puffed-amaranth` with the exact display pair and empty alias arrays shown above. The English and French product names have direct product-source support; the French compound should remain identified as source-attested, not OQLF-preferred. Hold any broader synonym set, product-grade claim, numeric rule, or substitution rule.

1. Add only the proposed identity and `GRAIN_AND_CEREAL` category; keep density null and unit mappings empty.
2. Preserve the existing raw amaranth grain, amaranth flour, amaranth greens, and puffed-grain identities without alias changes or merges.
3. Add no ingredient form, package yield, conversion, measurement, recipe link, or active substitution.
4. Preserve the zero-hit bundled recipe audit. If the row is integrated, verify that the complete English and French product queries resolve to this identity while the broader `amaranth`/`amarante` query retains its existing neighboring results.
5. Keep the French compound documented as product-attested wording and do not describe it as an OQLF-preferred term.

## Remaining Section F gaps

This packet addresses only one puffed-grain candidate. Continue the unresolved generic sushi-rice and farro boundaries, pot/Scotch-barley French naming, generic grits/polenta and pearled-hominy/pozole-corn/dried-sweet-corn holds, remaining puffed-grain products, species/product review across sorghum, millet, fonio, quinoa, and amaranth, regional cereal mixes and preprocessed grains beyond the already reviewed products, bulgur grade crosswalks, selective grain dry/cooked forms where a recipe or qualified source requires them, and independent Québec terminology review. Do not treat this proposal as closing the Section F checklist.
