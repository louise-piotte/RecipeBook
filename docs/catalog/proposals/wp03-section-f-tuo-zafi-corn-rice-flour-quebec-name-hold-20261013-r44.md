# WP03 Section F — Tuo Zafi corn-and-rice flour candidate (R44, 2026-10-13)

## Review record

- **Scope:** one marketed dry flour product titled `Tuo Zafi Corn & Rice Flour`, considered against the open Section F review of regional cereal mixes and preprocessed grains ([live plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L2555)).
- **Status:** proposal only. No shared catalog, ledger, plan, roadmap, README, or generated file was changed.
- **Recommendation:** keep the product unallocated pending a Québec-facing French product name and a reliable product ingredient/process declaration. Do not create an active reference or assign bare `Tuo Zafi` / `Tuo Zaafi` as an alias to a corn-and-rice blend.
- **Boundary:** this review concerns the dry, packaged flour product only. It does not add the cooked Tuo Zaafi dish, generic corn flour, rice flour, millet flour, cassava flour, or Banku mix.
- **Proposal-local source-ID prefix:** `WP03-TUO-ZAFI-R44-20261013-S` (S01–S06); the prefix was absent from the proposal archive and research ledger when checked.

## Why this is a distinct open candidate

The Section F parent checklist remains open. Searches of that checklist, the roadmap, the proposal archive, active references, forms, legacy-import candidates, research-ledger records, and manifest-listed recipes found no prior `Tuo Zafi`, `Tuo Zaafi`, `Tuo Zafi flour`, or corn-and-rice Tuo Zafi review. This is separate from the earlier WP02 hold on Banku mix; it does not reopen or rename that candidate.

Current Canada-facing retailer pages list a Home Fresh product titled **Tuo Zafi Corn & Rice Flour** [S01, S02]. That makes it a concrete preprocessed-grain candidate. The product pages do not establish a Québec French title or provide a reliable manufacturer ingredient/process statement. The dish name also spans different cereal bases: a Ghanaian food-science study describes its staple base as millet, or corn flour in some cases [S05], while current product copy describes a corn-and-rice flour blend [S01, S02]. A 2026 consumer study examines a proposed maize–okara–cassava flour for Tuo-Zaafi, further showing that composite formulations are product-specific rather than a settled catalog formula [S06].

## English and Québec French naming

- **English source wording:** the current retailer title is `Tuo Zafi Corn & Rice Flour` [S01]. Other Canadian seller wording combines that phrase with `Banku Mix` in a single listing title [S02], so that listing is not evidence that the products are interchangeable or synonyms.
- **Québec French:** targeted searches did not find a Québec-facing French title for this product or an OQLF term for the full product name. OQLF supports the constituent names **farine de maïs** and **farine de riz** [S03, S04], but those entries define single-ingredient flours. A constructed gloss such as *mélange de farine de maïs et de riz pour Tuo Zafi* would be descriptive wording, not an attested product name; keep it out of the picker until a Québec label or bilingual producer source supports it.
- **Spelling boundary:** retail wording uses `Tuo Zafi`; academic sources also write `Tuo-Zaafi`. This review does not add spelling aliases or assign either bare dish name to a particular dry flour formula.

## Exact ownership and picker effects

The current snapshot contains **1,367 active references**, **100 forms**, **64 legacy-import candidates**, and **1,699 research-ledger records**. Exact normalized searches found no owner for `tuo zafi`, `tuo zaafi`, `tuwon zaafi`, `tuo zafi flour`, or `tuo zafi corn and rice flour` in those stores. No exact candidate owner or source-ID prefix was found in the proposal archive.

| Current owner or query | Current result | Boundary / projection |
|---|---|---|
| `tuo zafi`, `tuo zaafi`, `tuwon zaafi`, `tuo zafi corn and rice flour` | No exact reference, form, legacy, or ledger owner | Keep unallocated; no picker behavior changes in this proposal. |
| `ingredient-ref-whole-kernel-corn-flour` | `whole-kernel corn flour / farine de maïs` | Keep as a single-ingredient flour; do not alias to a composite. |
| `ingredient-ref-rice-flour` | `rice flour / farine de riz` | Keep as a single-ingredient flour; do not alias to a composite. |
| `ingredient-ref-cassava-flour` | `edible cassava flour / farine comestible de manioc` | Keep distinct; do not transfer Banku or other cassava formulations to this candidate. |
| Query `rice flour` | Seven active reference results, including brown, glutinous, Mochiko, plain, roasted-red, Shiratamako, and white rice flours | If a future identity includes the full product phrase, this broad query would gain another result. Do not add a generic `rice flour` or `corn flour` alias. |

These projections follow the current bilingual phrase-first, substring-fallback search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9). They are static source-code and data inspection, not picker QA.

## Recipe demand

All **114 manifest-listed recipes** and **1,123 ingredient rows** were scanned across serialized recipe text and ingredient rows for `Tuo Zafi`, `Tuo Zaafi`, `Tuwon Zafi`, hyphenated spellings, and `Tuo Zafi flour`.

- Candidate-phrase recipe files: **0**.
- Candidate-phrase ingredient rows: **0**.
- Recipe links to a Tuo Zafi flour identity: **0**.

The product-market listing is evidence of a catalog candidate, but the bundled recipes show no demand for a new identity or recipe link.

## Numeric and substitution limits

- **Package quantity:** the Canadian product title includes a 1 kg pack size [S01]. Treat it as one package label, not a serving, household measure, density, volume-to-mass conversion, or yield.
- **Measurements and forms:** no reviewed source gives a dependable ingredient panel, particle specification, household measure, or product-specific cooking yield. Add no form, density, unit mapping, measure, or dry-to-cooked conversion.
- **Preparation quantities:** recipe directions for cooked Tuo Zaafi use particular flours, water amounts, and methods; those values belong to those recipes and are not transferable measurements for the packaged corn-and-rice product [S05, S06].
- **Substitutions:** add no global or contextual substitution. Shared use in a cooked staple does not establish that this product can replace corn flour, rice flour, millet flour, cassava flour, or Banku mix at any general ratio or recipe role.

## Source register

Sources were checked online on 2026-10-13. The source IDs below are proposal-local and are not ledger entries.

| Source ID | Source and evidence | Limits |
|---|---|---|
| `WP03-TUO-ZAFI-R44-20261013-S01` | Margaret African Market, [Tuo Zafi Corn & Rice Flour – 1 kg](https://margaretafrica.com/products/tuo-zafi-corn-rice-flour-1kg), Canadian retailer product title and product page. | Supports English product wording and one 1 kg package title. The page marked the item sold out when checked; availability is not inferred. It gives no verified ingredient panel or Québec French display. |
| `WP03-TUO-ZAFI-R44-20261013-S02` | Feliza African Store, [Flour](https://www.feliza.ca/flour), Canadian retailer listing `Homefresh Tuo Zafi Corn & Rice Flour | Banku Mix` and separately listing `Home Fresh Banku Mix`. | Supports that the phrase is used in Canadian retail. Its combined listing title is ambiguous and does not establish Banku equivalence, composition, product identity, or Québec French wording. |
| `WP03-TUO-ZAFI-R44-20261013-S03` | Office québécois de la langue française, [farine de maïs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432786/farine-de-mais), preferred term, updated 2025. | Supports the Québec French name for corn flour only, not a corn-and-rice blend or Tuo Zafi product. |
| `WP03-TUO-ZAFI-R44-20261013-S04` | Office québécois de la langue française, [farine de riz (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), preferred term, updated 2025. | Supports the Québec French name for rice flour only, not a composite mix or a product display. |
| `WP03-TUO-ZAFI-R44-20261013-S05` | George Amponsah Annor, Kwaku Tano Debrah, and Allen Essen, [“Mineral and phytate contents of some prepared popular Ghanaian foods”](https://link.springer.com/article/10.1186/s40064-016-2202-9), *SpringerPlus* 5, 581 (2016), discussion of Tuo Zaafi at lines 104–105. | Describes millet as the staple base, with corn flour used in some cases. It is a prepared-food study, not a flour product standard or a transferable recipe specification. |
| `WP03-TUO-ZAFI-R44-20261013-S06` | [“Indigenous preparation practices, consumption frequency, and consumer perceptions of a proposed maize-okara-cassava composite flour for Tuo Zaafi preparation in Northern Ghana”](https://www.sciencedirect.com/science/article/abs/pii/S2949824426002405), *Food and Humanity* 6 (May 2026), 101232, abstract. | Reports a consumer study and a proposed composite flour. It is research on one proposed formula, not a market standard, universal Tuo Zaafi composition, or source for the Home Fresh product. |

## Next action

Keep `Tuo Zafi Corn & Rice Flour` unallocated and leave all active references, forms, aliases, measurements, recipes, ledger entries, conversions, yields, and substitutions unchanged. Reopen only after a product label or producer specification confirms the mix's contents and a Québec-facing French display is verified; then rerun exact ownership and picker projections. Section F remains open. This proposal-only review needs no tests.
