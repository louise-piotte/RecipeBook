# WP03 Section F — khao mao / young flattened rice boundary review (2026-10-13, R35)

## Review record

- **Scope:** one regional preprocessed grain candidate: Thai dried pounded unripe glutinous rice, called *Khao Mao*.
- **Plan location:** the live Section F item at [line 2395](../../RecipeBook-global-ingredient-catalog-plan.txt#L2488) remains open for regionally significant cereal mixes and preprocessed grains.
- **Status:** proposal-only, bounded hold. No shared catalog, ledger, plan, roadmap, recipe, generated, or application file changed.
- **Recommendation:** retain *Khao Mao* as an unallocated candidate. Do not alias it to generic flattened rice (poha), intact glutinous rice, or ordinary rice. Do not create a picker row until a Québec French product name and a product-level bilingual market label are supported. Add no forms, measurements, recipe links, conversions, yields, or substitutions.

This review is distinct from generic poha and its recent regional aliases, red-rice flakes, corn poha, puffed rice, prepared cereal breakfasts, Ogi Baba, Fura, Tom Brown, Hausa Koko, Puttu podi, and the previously reviewed millet rava products. It records the Thai product boundary only; it does not reconsider other flattened-rice names or cereal blends.

## Product identity and bilingual naming

The Thai Food and Drug Administration names a community-enterprise product **Dried Pounded Unripe Rice (Khao Mao)** and says it originates from glutinous-rice paddy. It describes the dried product as an ingredient consumers buy to process themselves and identifies Khao Mao breakfast and breakfast variants with mixed grains or fruit [S01]. This is authoritative evidence for a Thai product candidate and use, not a universal definition of every product sold as green or flattened rice.

A 2023 research article calls it **Young Flattened Rice (Khao-Mao)**. It describes immature grains, an unpolished green product, and a process involving soaking, high-heat roasting, pounding off the husks, and screening. The paper also says Khao-Mao may be called “beaten rice,” “rice flakes,” “pounded rice,” “young rice,” or “pressed rice” [S02]. Those broad descriptors already overlap with the active flattened-rice (poha) row and should not be added to a second identity as aliases.

| Language field | Evidence and disposition |
|---|---|
| English candidate wording | `Khao Mao` is the exact regional name used by the Thai FDA and the research article. Their explanatory English labels are `dried pounded unripe rice` and `young flattened rice`. Keep these as evidence, not active picker names. |
| Québec French display | **Unresolved.** The Thai FDA and academic paper are English-language sources and do not establish a French product label. No Québec-facing French Khao Mao listing or OQLF/TERMIUM entry for this product surfaced in the targeted search. |
| Existing French rice-flake wording | The active generic poha row uses `flocons de riz (poha)`, supported in its existing ledger by Canadian French retail wording [reused source `WP03-S95`]. That label names the existing generic rice-flake product; it does not prove a French name for young, unripe Khao Mao. |
| Nearby Canadian product wording | A Vancouver importer currently lists Vietnamese `Sweet Rice Flakes 'Com Dep Xanh'` as its own product [S04]. The listing does not identify it as Thai Khao Mao or establish that the names are interchangeable. Do not use generic `green rice flakes` or `sweet rice flakes` to bridge those products. |

The English wording is sufficient to track the candidate in research, but the bilingual catalog requires a source-backed French display. A literal construction such as `flocons de riz gluant immature` is not proposed as a Québec label. The targeted searches do not prove no such label exists; they establish only that this review did not verify one.

## Exact ownership and archive audit

The current active catalog contains 1,365 references and 100 forms. The audit also covered all 64 legacy-import candidates, 1,692 ledger records, and the proposal/batch archive. Exact normalized searches for `Khao Mao`, `Khao-Mao`, `Kao Mao`, `Kao-Mao`, Thai `ข้าวเม่า`, `young flattened rice`, `dried pounded unripe rice`, `pounded unripe rice`, and `green rice flakes` found no active reference, form, legacy candidate, ledger candidate, or earlier proposal/batch owner. The source-ID prefix `WP03-KHAOMAO-R35-20261013-` is unused in the current catalog archive and ledger.

| Current owner | Exact live boundary |
|---|---|
| `ingredient-ref-flattened-rice-poha` | `flattened rice (poha) / flocons de riz (poha)`, category `GRAIN_AND_CEREAL`; EN aliases include `beaten rice`, `flaked rice`, `rice flakes`, `chiura`, `aval`, `atukulu`, `avalakki`, `chira`, and `chuda`; FR aliases are `riz aplati` and `riz battu`. `defaultDensity` is null, `unitMappings` is empty. Three thin/medium/thick commercial-grade forms attach to this row, with no form density. Its generic processing/name family overlaps Khao Mao's descriptive terms, but the active evidence does not assign the exact Thai product name. |
| `ingredient-ref-glutinous-rice` | `glutinous rice / riz gluant`, EN aliases `sweet rice` and `waxy rice`, FR aliases `riz doux` and `riz glutineux`; no attached forms, density, or mappings. Owns the rice type, not this pounded immature product. |
| `ingredient-ref-rice` | `rice / riz`, EN alias `chawal`, with separate dry and cooked forms; no density or mappings. Owns general rice and its scoped state forms only. |
| Neighboring flakes | Brown rice flakes and red rice flakes are separate active identities; corn poha is also separate. None owns exact Khao Mao. |

The existing poha ledger record is identity-verified and has `measurementState: researched_supported` because it contains one tightly scoped observation: 60 g / three fistfuls for the complete FAO/BBF *Chirar Polao* formula, yielding one 230 g cooked bowl and two servings. That observation is not a generic poha conversion and does not transfer to Khao Mao. The poha record keeps `substitutionResearchState: blocked_pending_evidence`; it has one scoped measurement observation and one thickness-grade substitution finding, with no active substitution rule. Do not change or reuse those values for the candidate.

## Picker and recipe-corpus effects

This is a static projection of [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), which checks complete normalized word phrases before falling back to substring matching. No picker data changes are proposed.

| Query | Current active result | Bounded implication |
|---|---|---|
| `khao mao`, `young flattened rice`, `dried pounded unripe rice`, `green rice flakes` | No result | Keep exact Khao Mao unassigned; if separately approved later, only an exact regional term could identify a distinct candidate without broad aliases. |
| `rice flakes` | Brown rice flakes, flattened rice (poha), and red rice flakes | The generic phrase is already shared across active product identities. Do not add it to a second row. |
| `poha` | Corn poha, flattened rice (poha), and red rice flakes | A bare poha query is already multi-result; do not fold Khao Mao into this query family based only on the research article's broad “beaten rice/rice flakes” descriptions. |
| `glutinous rice` | Glutinous rice and its three flour identities | Adding Khao Mao as an alias of the intact grain would hide its distinct processing and maturity. |

All 114 manifest-listed bundled recipes and 1,123 ingredient rows were scanned for the exact candidate names and descriptive phrases listed in the ownership audit, including serialized recipe text and ingredient fields. The scan found zero matching recipe files and zero matching ingredient rows. No bundled ingredient line references `ingredient-ref-flattened-rice-poha`. The Thai FDA's Khao Mao breakfast uses show regional culinary demand, but they supply no quantity or evidence of bundled-library demand [S01]. The manifest-ordered corpus fingerprint at this audit point is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Forms, measurements, and substitutions

- **Product state:** the Thai FDA calls the community product dried, while the 2023 study reports sample moisture values from 17.96% to 21.31% across six young flattened-rice types [S01, S02]. These are source-specific descriptions and analytical results, not a universal moisture target, storage specification, or proof that all retail Khao Mao has one dry state. Add no dry, toasted, roasted, cooked, or ready-to-eat form.
- **Measurements and density:** neither source establishes a household mass-to-volume measure, bulk density, or recipe portion for plain Khao Mao. A current retail page's `1 kg` title is package wording only and showed the item out of stock on access [S03]. Keep all active numeric fields unsupported and inactive.
- **Processing and yield:** the study's soak/roast/pound/screen sequence is process evidence for its samples, not a recipe conversion or general processing yield. The FDA's breakfast and mixed-grain/fruit examples do not report a formula or portion [S01].
- **Conversions and substitutions:** add no conversion, cooking yield, or substitution between Khao Mao, generic poha, mature rice flakes, glutinous rice, puffed rice, or any prepared breakfast. Shared crop or texture does not establish equivalent water uptake, cooking behavior, or a ratio. No source supports a household replacement amount.

## Source register

Sources were checked online on 2026-10-13. New source IDs use the unique prefix `WP03-KHAOMAO-R35-20261013-`; they remain proposal-local and were not added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-KHAOMAO-R35-20261013-S01` | Thailand Food and Drug Administration, [Dried Pounded Unripe Rice](https://en.fda.moph.go.th/oryor-quality-award/60-dried-pounded-unripe-rice/), page dated 2025-02-26; community-enterprise description. | Names the product Khao Mao, says it originates from glutinous rice paddy, identifies a dried form consumers buy to process, and names breakfast products with mixed grains/fruit. Evidence is about one Thai community enterprise; no universal process, Québec name, recipe amount, or density is supplied. |
| `WP03-KHAOMAO-R35-20261013-S02` | Sutthidech Preecharram et al., [“Proximate Composition and Antioxidant Activity of Young Flattened Rice (Khao-Mao)”](https://tis.wu.ac.th/index.php/tis/article/download/6575/521), *Trends in Sciences* 20(4), 2023, DOI [10.48048/tis.2023.6575](https://doi.org/10.48048/tis.2023.6575), pp. 1–2. | Gives the young/immature glutinous-rice product wording, process description, broad descriptive synonyms, six sample types, and sample moisture range. It is one study's samples and terminology; its synonyms are not all safe aliases, and its composition data do not establish a culinary measure, density, or shelf-life limit. |
| `WP03-KHAOMAO-R35-20261013-S03` | Thiana Best Jerky, [1 kg Khao Mao Green Rice](https://www.thianabestjerky.com/product-page/1kg-khao-mao-green-rice), product listing. | Confirms a retail title and package label; the page showed `Out of Stock` when checked. The listing gives no process, ingredient specification, French wording, or general package measure. |
| `WP03-KHAOMAO-R35-20261013-S04` | New World Imports Ltd., Vancouver, [Vietnam rice catalogue](https://nw-imports.com/vietnam-rice/), `Sweet Rice Flakes 'Com Dep Xanh'`, item VT119. | A current Canadian distributor lists a distinct Vietnamese rice-flake product and a 200 g package. It is not identified as Thai Khao Mao and does not establish equivalence, recipe use, or a French-Canadian name. |
| Reused ledger source `WP03-S95` | Atlantic Superstore, [International Foods (fr-CA)](https://www.atlanticsuperstore.ca/fr/clpplp/clpplp/clpplp/food/international-foods/c/58044), Suraj product listing. | Existing ledger evidence for `Flocons de riz (Poha)` as Canadian French wording for the generic poha product. It does not name Khao Mao and is reused only to bound the existing owner's display. |

## Next action

Keep Khao Mao out of the active catalog pending a Québec-facing French label and an exact Canadian product listing or equivalent market evidence that identifies the Thai immature-rice product. If later approved, consider a separate product identity with the exact regional term only; do not assign `rice flakes`, `beaten rice`, `green rice flakes`, `poha`, or `glutinous rice` to it as global aliases. Recheck the dry/soft retail state and picker collisions before deciding whether any form is warranted. Until then, leave all numeric and substitution behavior inactive.

No app or shared catalog files were changed. No tests were run for this proposal-only review.
