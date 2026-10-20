# WP03 Section F Puffed Millet Identity Review

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** reviewed and integrated on 2026-10-10. Added the identity and research-ledger record, with one source-scoped recipe alternative recorded as evidence only; no form, measurement, conversion, yield, or recipe link was added.
- **Scope:** one remaining non-rice puffed-grain candidate, `puffed millet / millet soufflé`. This is a narrow follow-up to the [Section F residual-gap audit](wp03-section-f-residual-gap-audit-20261010.md), which held non-rice puffed grains because it had not established a stable Québec label. It does not reopen puffed rice, puffed wheat, or puffed quinoa.
- **Recommendation:** accept a separate identity for the marketed puffed-millet grain product, with displays `puffed millet / millet soufflé` and the source-attested English alias `millet puffs`. Keep species unspecified. Add no forms, measurements, conversions, yields, or active substitutions.

## Current package and exact-key audit

The live bundled package has **796 ingredient references**, **36 ingredient forms**, **1,022 research-ledger records containing 2,190 source entries**, and **81 legacy-import candidates**. The manifest lists **114 recipes** with **1,123 ingredient rows**.

Relevant active references are `ingredient-ref-millet` (`millet / millet`), `ingredient-ref-common-millet` (`common millet / millet commun`, with the English alias `proso millet`), `ingredient-ref-pearl-millet` (`pearl millet / millet perlé`), `ingredient-ref-foxtail-millet` (`foxtail millet / millet d'Italie`), `ingredient-ref-finger-millet` (`finger millet / éleusine cultivée`), `ingredient-ref-amaranth-grain` (`amaranth / amarante`), and the separate `ingredient-ref-puffed-rice` and `ingredient-ref-puffed-wheat` products. Millet flour is also a separate active reference. No current millet reference has an ingredient form; the only unrelated form hit for the word `puffed` is a roasted/popped makhana form.

Neither `ingredient-ref-puffed-millet` nor an exact normalized key for `puffed millet`, `millet puffs`, or `millet soufflé` appears in the active references, form labels or match terms, research ledger, or legacy-candidate file. The check used the package's `normalize_search_key` accent- and punctuation-folding rules. The existing verified ledger record for broad `millet` supports the generic grain name and explicitly says it can cover multiple species; it does not cover the puffed product. No matching legacy candidate exists. Broad searches for `millet` will still match the broad and species-qualified references; the full proposed names have no exact collision.

## Candidate boundaries and dispositions

| Candidate or wording | Disposition | Boundary |
| --- | --- | --- |
| `puffed millet` | **Accept as a distinct identity for integration review** | Name the food product marketed as millet puffs. It is a grain-based processed product, separate from unpuffed millet grain. Do not infer a cultivar, botanical species, hull state, coating, brand, or whole-grain claim. |
| `millet soufflé` | **Accept as the fr-CA display, with a terminology limit** | The Québec distributor's bilingual product catalog uses this exact French product name, and French-language culinary sources use it for the ingredient. OQLF supports the base term `millet` but has no entry establishing `millet soufflé` as a preferred term; describe it as source-attested Québec-market French, not an OQLF ruling. |
| `millet puffs` | **Accept as the only proposed English alias** | It is the English product title used by the manufacturer and the Québec distributor for the same named product. Do not add singular `millet puff` without a separate source. |
| `millet`, `millet grain`, species names, or species aliases | **Keep on their existing references; do not alias** | OQLF notes that generic *millet* may refer to multiple species or abbreviate a species name. The puffed product evidence does not select proso, pearl, finger, or foxtail millet, or make the puffed product interchangeable with their unpuffed grains. |
| `puffed millet cereal`, `puffed grains`, `multigrain puffs`, `puffed amaranth`, and puffed rice or wheat | **Do not add as aliases or merge** | These phrases widen the product to cereal formats or other grains. Existing puffed-rice and puffed-wheat identities remain separate; the study below also treats puffed amaranth as a separate grain. |
| `popped millet`, `millet soufflé bio`, `millet gonflé`, or puffed-millet flour | **Hold outside this row** | These wordings are not needed to name the documented product; some add a process, marketing, or milling claim not established as an unconditional synonym by the Québec-market sources. |

### Proposed catalog row

| Stable ID | English display | fr-CA display | EN aliases | FR aliases | Category and data |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-puffed-millet` | `puffed millet` | `millet soufflé` | `millet puffs` | none | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |

Do not add `millet soufflé` a second time as an alias. Do not add organic or brand qualifiers to the display. The product sources do not identify the millet species, and OQLF's generic entry is not species-specific.

## Recipe demand

All **114 manifest-listed recipe files** and all **1,123 ingredient rows** were searched using whole-phrase, accent-folded matching over the recipe JSON, including ingredient text, ingredient names, reference IDs, and other fields. The query set included `puffed millet`, `puffed millet cereal`, `millet puff`, `millet puffs`, `millet soufflé` / `millet souffle`, `millet soufflé bio`, `millet gonflé`, `puffed proso millet`, and the broader grain-puff wording. **Zero ingredient rows and zero recipe files matched the candidate.** A scan for the standalone word `millet` also found no bundled ingredient line.

No recipe link or text change is supported. The Québec recipe source in the register below calls for `2 tasses de millet soufflé ou quinoa soufflé` in a particular no-bake bar formula. That external recipe is useful evidence of French culinary wording and a source-specific choice; it is not demand in the bundled library.

## Keep product identity, forms, measurements, conversions, and substitutions separate

| Concern | Recommendation and limit |
| --- | --- |
| **Identity** | Add one `GRAIN_AND_CEREAL` identity for the marketed puffed-millet product. Keep it separate from generic millet, species-qualified millet, millet flour, puffed rice, puffed wheat, and puffed amaranth. |
| **Product process versus ingredient form** | Treat puffing as the product-defining transformation in the identity name, not as a dry/cooked `IngredientForm` for generic millet. Add no form row or preparation-state hint. The research study is one proso-millet process example, not a universal process specification for the retail product. |
| **Measurements** | Add no default density, form density, serving weight, or unit mapping. The manufacturer lists a case pack of `6 x 175 g`; package configuration is not an ingredient-level serving measure. The external bar recipe's two-cup amount is specific to that formula, not a general volume-to-mass value. |
| **Conversions and yields** | Add no `g/ml` conversion, puffing factor, dry-to-puffed conversion, cooking yield, or package yield. The research study's moisture and processing values describe experimental samples and equipment; they do not establish catalog measurements or a universal transformation ratio. |
| **Substitutions** | Activate no global or contextual substitution rule. The external bar recipe permits equal recipe-volume choices of puffed millet or puffed quinoa for that one bar formula. It does not support a general millet-to-quinoa substitution, or substitution for puffed rice, puffed wheat, or other cereals. |

## Source register

The proposal-local IDs below are not ledger IDs. Sources were reviewed on 2026-10-10.

| Source ID | Source | Supports and limits |
| --- | --- | --- |
| `WP03-PMILLET-20261010-S01` | Simple Treasures Food Ltd., manufacturer, [Millet Puffs](https://simpletreasurefoods.com/product/millet-puffs/) | Lists `Millet Puffs`, identifies the item as `Organic Millet`, places it in the `Puffs` category, and gives the unit/case pack. Primary product-name evidence; the page does not give a detailed ingredient declaration, species, processing method, or recipe measure. |
| `WP03-PMILLET-20261010-S02` | Satau, Québec distributor, [English 2021 Simple Treasures portfolio](https://satau.ca/medias/documents/portfolios/Portfolio-gammes-Satau-EN-2021-07-12.pdf) and [French 2022 portfolio](https://satau.ca/medias/documents/portfolios/Portfolio-gammes-Satau-FR-2022-02-22.pdf) | The Simple Treasures cereal lineup names `Millet Puffs / Millet soufflé`. Supports the proposed bilingual pair in a Québec distributor's catalog. Catalog terminology is not an OQLF preference or current stock guarantee. |
| `WP03-PMILLET-20261010-S03` | Satau, [company and distribution profile](https://satau.ca/en/) | Identifies Satau as a distributor supplying health-food and grocery stores throughout Québec and neighbouring provinces, with a Québec address. Establishes the regional context for S02, not a product definition. |
| `WP03-PMILLET-20261010-S04` | New Moon Cookies, [Super Crunch Granola Bars](https://newmooncookies.com/products/super-crunch-granola-bars-2pk) | A producer's bilingual ingredient list uses `Puffed Millet / millet soufflé` as one component. Confirms independent English/French ingredient wording, but the page describes a multi-ingredient bar, not a plain puffed-millet package. |
| `WP03-PMILLET-20261010-S05` | Sophie Bourdon, [Barres de millet soufflé au tahini, sésame et figues](https://www.sophiebourdon.com/fr/blog/barres-de-millet-souffle-tahini-sesame-et-figues) | Uses `millet soufflé` as an ingredient and gives `2 tasses ... ou quinoa soufflé` for this no-bake bar formula. Supports culinary wording and documents one recipe-specific alternative; it does not establish a global substitution or mass conversion. |
| `WP03-PMILLET-20261010-S06` | OQLF, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet) (existing ledger source `WP03-S20`) | Supports the broad `millet / millet` name and notes that unqualified millet may group several species or abbreviate a species-specific name. It does not define the puffed product or certify the compound `millet soufflé`. |
| `WP03-PMILLET-20261010-S07` | Piłat, Ogrodowska & Zadernowski, [Nutrient Content of Puffed Proso Millet (*Panicum miliaceum* L.) and Amaranth Grains](https://cjfs.agriculturejournals.cz/pdfs/cjf/2016/04/11.pdf), *Czech Journal of Food Sciences* 34 (2016), 362–369, DOI [10.17221/405/2015-CJFS](https://doi.org/10.17221/405/2015-CJFS) | Primary food-science study of puffed proso-millet grains and a separately analyzed puffed-amaranth product. Its tested grain was expanded in a prototype at 260 °C for 2–3 seconds. Supports puffed grain as a distinct product and a species/process example only; do not generalize its process or nutrient values to all millet products. |

## Review disposition

Accept `ingredient-ref-puffed-millet` with the proposed displays `puffed millet / millet soufflé` and only the English alias `millet puffs`. Keep species unspecified and describe the French wording as source-attested rather than OQLF-preferred. Add no ingredient form, measurement, conversion, yield, or recipe link. The cited bar formula’s equal-volume choice between puffed millet and puffed quinoa is recorded in the ledger only for that recipe context; no runtime substitution rule is active. This candidate-specific evidence does not settle other puffed grains or the remaining Section F checklist.

## Integration review

Root verified the manufacturer page, Satau’s bilingual cereal portfolio, the OQLF millet entry, and the cited no-bake bar recipe on 2026-10-10. Added the identity with `millet puffs` as the sole English alias and source IDs S01, S02, S05, and S06. The bar recipe’s `2 tasses` alternative is retained as paired, source-specific research findings on puffed millet and puffed quinoa; it creates no active global or contextual rule and no mass/volume conversion. Measurement research remains `not_yet_researched`. See `docs/catalog/batches/wp03-puffed-quinoa-and-wp04-recipe-source-corrections-identity-integration-20261010/README.md`.
