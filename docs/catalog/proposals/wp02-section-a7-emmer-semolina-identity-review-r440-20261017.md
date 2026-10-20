# WP02 Section A7 R440: emmer semolina identity review

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** The recommendation was accepted and integrated on 2026-10-17; see the [R440–R442 integration record](../batches/wp02-wp04-wp06-r440-r442-gap-review-integration-20261017/README.md). This file records the proposal as reviewed before integration.
- **Open checklist:** WP02 Section A7 remains open for other grain meals and other malted/toasted flour identities at [plan line 2004](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Source IDs:** `WP02-A7-EMMER-SEMOLINA-R440-20261017-S02` and `S03` were allocated to the accepted ledger record. Existing DND and OQLF IDs are referenced without adding duplicate source entries.
- **Scope:** Review the specific milling ingredient named `emmer semolina` against active wheat/emmer/farro identities, Canadian and Québec naming, picker behavior, the full bundled recipe corpus, and the limits of available quantity and substitution evidence. This does not reopen generic emmer/farro identity, emmer flour, emmer grain, barley semolina, spring-wheat semolina, or other A7 meal decisions.

## Recommendation

Add one identity-only milling reference:

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-emmer-semolina` |
| Category | `FLOUR_AND_STARCH` |
| English display | `emmer semolina` |
| French display | `semoule de blé amidonnier` |
| English aliases | `[]` |
| French aliases | `[]` |
| Forms | none |
| Default density / unit mappings | `null` / `[]` |
| Measurements, conversions, yields, recipe links, substitutions | none |

The Canadian Department of National Defence food-quality specification has an emmer section and pairs the French product wording `semoule de blé amidonnier` with an English description of semolina made from farro; it also records that *farro* can refer to einkorn, emmer, or spelt in Italian usage [reused `FARRO-S03`]. A current British Columbia mill sells emmer fettuccine whose manufacturer ingredient declaration names `Stone-ground BC Emmer Semolina` [S02–S03]. OQLF identifies `amidonnier` as the French term for *emmer* (*Triticum dicoccum*) [reused `WP02A4-EM-S01`]. Together, the product label and bilingual government terminology support the exact, species-scoped pair without borrowing unqualified `farro` as an alias.

Keep the proposed identity separate from `emmer wheat / blé amidonnier`, `emmer flour / farine d'amidonnier`, `farro grain / grains de farro`, and the species-neutral market identity `farro flour / farine de farro`. Do not add `farro semolina`, `farina`, `emmer meal`, `emmer grits`, or bare `semolina` as aliases. The broader *farro* term has recorded species and product-state variation, and the active picker already returns separate flour and grain rows for `farro` [reused `FARRO-S03`; `WP03-FARRO-GRAIN-R147-20261015-S01–S05`; `WP03-FARRO-FLOUR-R148-20261015-S01–S10`].

This is an identity decision only. The current BC product is fettuccine containing emmer semolina, not a standalone bag of dry semolina; an American mill's retail product gives a detailed emmer-semolina process, but that one product's grain composition and process must not be generalized [S04]. None of the reviewed sources provides a transferable household measure, density, emmer-semolina form taxonomy, yield, or substitution ratio. The bundle has no emmer-semolina demand. If accepted, the ledger can record the identity sources and set measurement to `researched_no_supported_value`; leave substitution research `not_yet_researched` until a recipe-specific use requires it.

## Distinction from prior work

- The live A7 archive has no focused `emmer semolina` or `semoule de blé amidonnier` decision. This candidate is distinct from R394 spring-wheat semolina and R397 barley semolina: those establish different grain identities and do not own emmer wording.
- WP03's unqualified-farro and farro-flour reviews cite the same federal specification, but explicitly keep semolina outside their grain and flour identities. They do not adjudicate a separate emmer-semolina ingredient; R440 does not reopen those decisions.
- The active emmer flour and grain rows remain unchanged. The active farro flour and grain rows also remain unchanged, and the unresolved ledger candidate `ingredient-ref-farro` remains unresolved. No `farro` alias is proposed for the new row.
- The current A7 meal reviews include wheat, rye, barley, buckwheat, oats, quinoa, sorghum, millet, triticale, spelt, teff, and other named candidates. This is a separate emmer milling product, not another review of those holdings.

## Current-state audit

This snapshot was read from the live split package and live catalog sources on 2026-10-17.

| Store | Current snapshot | Ownership result |
| --- | ---: | --- |
| Active ingredient references | 1,733 rows; SHA-256 `b4c37afbd4e7f6c8806ac38217a6d6bf4a7834e204117d155295e52918a5144f` | No exact owner for `emmer semolina`, `emmer wheat semolina`, `semolina flour made from emmer`, or `semoule de blé amidonnier`; proposed ID is unused. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No emmer-specific form or exact semolina phrase. The emmer flour and emmer grain references have no linked forms. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact owner or alias for the proposed English or French display. |
| Research ledger | 2,092 records / 9,500 source entries; SHA-256 `9e763b2c2cbcde85a989ef8a73aff58e51fb58fbd0a3a026355737c23eb23460` | No `ingredient-ref-emmer-semolina` record. The existing `ingredient-ref-emmer-flour` and `ingredient-ref-emmer-grain` records are separate verified identities. The unresolved `ingredient-ref-farro` candidate contains the reused DND semolina evidence, but its accepted decisions do not allocate an emmer-semolina row. |
| Recipe manifest | 114 recipe files; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All manifest-listed files and ingredient rows were scanned; results are below. |

Relevant live milling rows:

- `ingredient-ref-emmer-flour`: `emmer flour / farine d'amidonnier`; no aliases, density, or unit mappings.
- `ingredient-ref-emmer-grain`: `emmer wheat / blé amidonnier`; no aliases, density, or unit mappings.
- `ingredient-ref-farro-flour`: `farro flour / farine de farro`; no aliases, density, or unit mappings.
- `ingredient-ref-farro-grain`: `farro grain / grains de farro`; its sole English alias is `farro grains`.
- Neighboring milling references include `ingredient-ref-durum-semolina`, `ingredient-ref-semola-rimacinata`, `ingredient-ref-spring-wheat-semolina`, `ingredient-ref-barley-semolina`, and `ingredient-ref-sorghum-semolina`. None owns an emmer-semolina name.
- No ingredient form is linked to an emmer or farro reference. The proposed ID is absent from references, forms, legacy identities, and ledger record IDs.

The DND source is already present as ledger source `FARRO-S03`; the OQLF source is already present as `WP02A4-EM-S01` and `WP03-S33`. R440 proposes reusing those source entries rather than duplicating them. WP03 separately cites the DND text as `WP03-FARRO-FLOUR-R148-20261015-S03`; that source note says the procurement reference mentions semolina but is not a universal milling standard. No new shared source entry is proposed here.

## Picker projection

The projection applies `IngredientSearch.kt` behavior to current reference and form terms, then appends the proposed bilingual names without aliases or forms.

| Query | Current result(s) | Projected result(s) |
| --- | --- | --- |
| `emmer semolina` | none | emmer semolina |
| `semoule de blé amidonnier` | none | emmer semolina |
| `emmer` | emmer flour; emmer wheat | prior two plus emmer semolina |
| `semolina` | barley semolina; durum semolina; sankhal (broken millet semolina); remilled durum semolina; sorghum semolina; spring wheat semolina | prior six plus emmer semolina |
| `semoule` | barley semolina; corn grits; cornmeal; durum semolina; rye meal; remilled durum semolina; sorghum semolina; spring wheat semolina; granulated sugar (through its French term) | prior nine plus emmer semolina |
| `semoule de blé` | durum semolina; spring wheat semolina | prior two plus emmer semolina |
| `farro` | farro flour; farro grain | unchanged |
| `farro semolina` | none | unchanged; no farro alias is proposed |
| `farine d'amidonnier` | emmer flour | unchanged |
| `emmer meal` | none | unchanged |

The qualified English and French searches will identify the new row. Broad `semolina`, `semoule`, `semoule de blé`, and `emmer` searches will return one additional product identity. Keeping `farro` off the aliases preserves the current flour/grain query scope and avoids converting the broad term into an emmer-only claim.

## Bundled recipe-demand audit

All **114** manifest-listed files and **1,123** ingredient rows were scanned. The scan covered full serialized recipe JSON and ingredient-row `originalText`, `ingredientName`, `preparation`, `notes`, and `ingredientRefId`, using the same lowercasing, accent/ligature folding, punctuation normalization, and whitespace collapse as `IngredientSearch.kt`.

Candidate-specific phrases included `emmer semolina`, `emmer wheat semolina`, `semolina from emmer`, `semolina flour made from emmer`, `semolina flour made from farro`, `farro semolina`, `semoule de blé amidonnier`, `semoule amidonnier`, `emmer meal`, and `farro meal`. The broad terms `emmer`, `farro`, `semolina`, `semoule de blé dur`, and `emmer flour` were also checked. **Every listed phrase returned 0 recipe files and 0 matching ingredient rows.** The manifest-ordered corpus fingerprint (relative path, NUL, raw file bytes, NUL per recipe) is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

No recipe link, relink, or bundled recipe edit is justified by current recipe demand.

## Measurements, forms, and substitutions

- True Grain sells the emmer semolina as an ingredient of its **finished fettuccine**; the 250 g product size and any amount of semolina in that package are not a household portion or a dry-ingredient measure [S02–S03].
- Anson Mills describes its own ancient emmer semolina as close to a fine beach-sand texture and nearly whole grain after its cold stone-milling and hand-bolting process [S04]. That is a product-specific specification, not a universal sieve class, bran level, or process that can be transferred to the Canadian manufacturer's semolina.
- The DND specification describes the culinary use of semolina from farro/emmer in soups and other dishes and records semolina terminology, but gives no particle-size limits, household amounts, density, or yield [reused `FARRO-S03`].
- OQLF establishes the species wording, not a mass-volume conversion or form name [reused `WP02A4-EM-S01`].
- No reviewed exact-class source supplies a transferable measure, density, conversion, yield, or tested substitution ratio. Add no form, measure, unit mapping, conversion, yield, recipe link, or substitution rule.

## Source register

| ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **Reused `WP02A4-EM-S01` / `WP03-S33`** | Office québécois de la langue française, [amidonnier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier), updated 2019; preferred terms, English translations, and scientific name. | Pairs `amidonnier` with English `emmer` / `emmer wheat` and *Triticum dicoccum*; also says `farro` is acceptable for the cereal. | Species terminology only; does not define semolina or endorse a milling-product display. Reuse the existing ledger source entry. |
| **Reused `FARRO-S03`** | Department of National Defence, [Food Quality Specifications — Cereal Grain, SQA-24-06 (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-eng.pdf) and [French](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-24-2018-fra.pdf), §§36–39, pp. 4–5, dated 2018. | Under the `Farro/Emmer` (*Triticum turgidum dicoccum*) section, the English version says semolina flour made from farro is used for soups and other dishes; the French version uses `semoule de blé amidonnier`. It also states that farro can refer to einkorn, emmer, or spelt. | Government procurement terminology and general culinary background, not a consumer semolina label, universal farro taxonomy, or particle-size/process standard. The True Grain label below supplies the emmer-specific English product phrase. Reuse the existing ledger source entry. |
| **WP02-A7-EMMER-SEMOLINA-R440-20261017-S02** | True Grain, [Organic BC Emmer Fettuccine](https://www.truegrain.ca/collections/shop-all-products/products/copy-of-organic-bc-emmer-fettuccine-6), ingredient declaration; product is also listed in the current [mail-order catalogue](https://www.truegrain.ca/collections/mailed-to-you), accessed 2026-10-17. | The Canadian mill's indexed product detail names `Stone-ground BC Emmer Semolina` as an ingredient; the current mail-order catalogue lists its Organic BC Emmer Fettuccine and says the pasta is made from BC-grown grain. This is direct Canadian manufacturer usage of the candidate English phrase and emmer species. | The ingredient is part of finished fettuccine, not a separately packaged dry semolina product. The search-indexed detail page was retrievable, while direct page opening returned a cache miss; the current catalogue confirms the finished pasta listing, not the full ingredient declaration. No dry measure, mill granulation, or French product label is supplied. |
| **WP02-A7-EMMER-SEMOLINA-R440-20261017-S03** | Anson Mills, [Ancient Emmer Semolina](https://ansonmills.com/products/98), current retail product description; copyright 2026. | A current primary miller names a standalone `Ancient Emmer Semolina` product, describes it as emmer milled to a fine beach-sand consistency, and distinguishes its own near-whole-grain stone-ground/hand-bolted process from industrial durum semolina. | U.S. market and product-specific process. It corroborates the emmer-semolina milling identity but does not establish a Canadian product, Québec French label, universal semolina specification, or transferable numeric data. |

## Disposition

Integrate only `ingredient-ref-emmer-semolina` with the exact bilingual display pair shown above, if accepted. Keep both alias arrays empty and all numeric/form/recipe/substitution behavior inactive. Reuse the existing OQLF and DND ledger source entries; add the True Grain and Anson primary sources to the new identity record if the proposal is integrated. Do not change the unresolved bare-farro candidate, the active farro grain/flour rows, emmer grain/flour rows, or any neighboring semolina reference. WP02 Section A7 remains open.

No app tests or emulator checks were run because this is a proposal-only review and changes no database JSON.
