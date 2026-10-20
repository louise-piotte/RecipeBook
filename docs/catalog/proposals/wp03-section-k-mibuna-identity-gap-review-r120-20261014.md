# WP03 Section K Mibuna identity-gap review (R120)

- **Reviewed:** 2026-10-14
- **Review slot:** R120
- **Status:** Integrated by root on 2026-10-14 as an identity-only reference with no reusable numeric or substitution behavior.
- **Scope:** One distinct fresh culinary leafy-green identity, Mibuna.
- **Recommendation:** Add identity-only `ingredient-ref-mibuna` in `VEGETABLE_AND_AROMATIC`. Use `mibuna` for both EN and fr-CA display, with the crop-qualified EN alias `mibuna mustard`; add no FR aliases. Keep `Japanese mustard`, `Japanese mustard greens`, and broad mustard wording out. Add no forms, density, unit mappings, conversions, yields, substitutions, or bundled recipe links.
- **Proposal-local source-ID prefix:** `WP03-K-MIBUNA-20261014-R120-S`; this prefix was absent from the repository and ledger at review time.

## Open plan item and boundary

This review addresses the continuing Section K item in `docs/RecipeBook-global-ingredient-catalog-plan.txt`:

> [ ] Continue the broader lettuce, leafy-green, and brassica sweep beyond these named identities; resolve additional market and regional types with source evidence and reviewer input.

Mibuna is a distinct named leafy crop in Québec's 2023 CETAB+/MAPAQ cold-climate trial and in current Canadian seed listings. A horticultural guide distinguishes it from mizuna by its denser clumps and smooth-edged leaves. This is a focused Mibuna review; it does not close the wider Section K sweep or independent Québec terminology review.

The R119 Komatsuna proposal and integration mention Mibuna only as a neighboring crop and comparator. They do not assign it an identity, alias, form, legacy candidate, ledger record, recipe link, or picker row. That mention is retained here as prior context rather than treated as a completed Mibuna review. The active `ingredient-ref-mizuna` and `ingredient-ref-komatsuna` remain separate identities.

## Repository audit and snapshot

I searched Section K, active references and forms, legacy candidates, the research ledger, WP03/WP06 proposals and batches, and all manifest-listed recipe files for `mibuna`, `mibuna mustard`, `mibuna mustard greens`, `mibuna early`, `Japanese mustard`, and `Japanese mustard greens`. No active Mibuna reference, alias, form, legacy candidate, Mibuna-specific ledger record, prior Mibuna proposal, or recipe-line hit was found. The only ledger mentions are sources and comparison text attached to the Komatsuna record; the prior Komatsuna proposal explicitly kept Mibuna separate. The new source-ID prefix was unused.

Snapshot before any integration:

| File or corpus | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,464 references | `defece4daa783bf0227c7c90d9ca0864737843360aac4da51dd7ca0155364898` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 105 forms | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/legacy-import-identities.v1.json` | 63 candidates | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `docs/catalog/research-ledger.v1.json` | 1,805 records / 7,438 source entries / 6,316 distinct source IDs | `21d32f94f37a1d4457f4445d229b0525ae21d86e8b472d4f571455fd41c83c11` |
| Manifest-ordered recipe corpus | 114 files / 1,123 ingredient rows | `75c7b6d7cd99fd7eee849be3a49970dc2aac5a92f2c3192a8bf80f75e785973f` |

The corpus digest is SHA-256 over each manifest-listed relative recipe path, a NUL byte, that file's SHA-256 hex digest, and a newline, concatenated in manifest order. A recursive scan of the complete corpus found no `mibuna` or `mibuna mustard` text in any recipe field.

## Proposed identity

| Candidate ID | Category | EN display | fr-CA display | EN aliases | FR aliases | Scope |
|---|---|---|---|---|---|---|
| `ingredient-ref-mibuna` | `VEGETABLE_AND_AROMATIC` | `mibuna` | `mibuna` | `mibuna mustard` | none | Fresh culinary leaves of the named Mibuna crop, including young and mature leaf harvests; exclude seed products, unspecified salad mixes, and other mustard greens. |

The fr-CA display is a provisional borrowed crop name, not an OQLF-standardized term. The Québec report uses `mibuna` in French and identifies it as a `verdurette`; an Ottawa seed company's French catalog lists `Mibuna Précoce Moutarde Japonaise`. These sources support French-facing use of the crop name, but the latter is a seed cultivar listing, not a fresh-food label. A targeted OQLF site search did not surface a dedicated Mibuna entry; that is a limited negative search, not a terminology ruling.

The Québec marketplace listing checked for this review shows mizuna and tatsoi among its leafy products but no Mibuna listing. This is one marketplace snapshot and cannot establish general unavailability. The Québec agronomy report documents trial production, not a continuing retail supply chain. The recommended identity therefore records a regionally documented crop name without claiming broad Québec fresh-produce availability.

## Picker boundary

The projection follows `IngredientReferenceSearchIndex` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: normalize case, accents, and punctuation; prefer complete word-phrase matches; use substring matching only when no complete phrase matches. Results below compare the current reference/forms snapshot with the proposed identity and alias.

| Query | Current result | Proposed effect / decision |
|---|---|---|
| `mibuna` | 0 | Resolves to `ingredient-ref-mibuna`. |
| `mibuna mustard` | 0 | Resolves to `ingredient-ref-mibuna` through the crop-qualified EN alias. |
| `mizuna` | 1: `ingredient-ref-mizuna` | Remains the existing Mizuna row only. |
| `komatsuna` | 1: `ingredient-ref-komatsuna` | Remains the existing Komatsuna row only. |
| `mustard` | 12 references | Expands to 13, including Mibuna through the source-attested `mibuna mustard` alias. This broad query is already ambiguous across mustard greens, seeds, oils, and prepared products. |
| `mustard greens` | 2 references | Unchanged; do not add `mustard greens` as an alias. |
| `Japanese mustard` | 1: `ingredient-ref-komatsuna` | Unchanged; do not add the broad phrase to Mibuna. |
| `Japanese mustard greens` | 0 | Keep unassigned because the descriptor is broader than this crop. |

`Mibuna mustard` is the exact crop-qualified English product name used by a Canadian seed retailer. Its disclosed bare-`mustard` expansion is the only broad-query change proposed. Do not add `Japanese mustard`, `Japanese mustard greens`, `mibuna greens`, or `Mibuna Early`: the first two are broad descriptors, the third is not established by the reviewed Québec/Canadian naming evidence, and the last is a variety/seed listing rather than a crop synonym. Keep Mibuna distinct from Mizuna and Komatsuna despite the similar names.

## Recipe demand, measures, and forms

The 114-file, 1,123-row bundled recipe corpus has no Mibuna or `Mibuna mustard` match. Do not create a bundled recipe link.

CETAB+/MAPAQ reports that Mibuna was harvested only at the baby-leaf stage in its institutional trial, and describes approximately 15 cm leaves, a slightly piquant taste, and potential use in winter mesclun. It also reports a full-width-leaf farm trial at Le Rizen. These are agricultural research observations; the reported kg/m² yields are not edible-portion measures, bunch weights, or recipe conversions. Richters and Gaia list seeds, not retail leaf portions. No reviewed source establishes a reusable cup weight, density, unit mapping, package weight, serving, or preparation yield.

RHS describes Mibuna leaves used in salads or lightly cooked and distinguishes its smooth-edged leaves from Mizuna's serrated leaves. These culinary options do not require separate catalog forms. Add no baby-leaf form, density, conversion, yield, or substitution rule. Keep Mibuna separate from Mizuna, Komatsuna, generic mustard greens, and mustard seed/oil/condiment identities.

## Sources reviewed on 2026-10-14

| Source ID | Source | Observation and limitation |
|---|---|---|
| `WP03-K-MIBUNA-20261014-R120-S01` | CETAB+ / MAPAQ, [Culture de climat frais sous abris : légumes asiatiques](https://cetab.bio/wp-content/uploads/culture-legumes-asiatiques-brocoli-celeri-chinois-komatsuna-mitsuba-mizuna-tasoi-cetab-2023.pdf), 2023, pp. 3, 16, 19. | Lists Mibuna separately among seven Québec trial crops, calls it a `verdurette`, and says only baby leaves were harvested in the institutional trial. The report says Mibuna is little known in North America and seed supply is limited. It also documents a Le Rizen trial. This is regional horticultural and crop-name evidence, not proof of current fresh retail availability or a culinary measure. |
| `WP03-K-MIBUNA-20261014-R120-S02` | Royal Horticultural Society, [How to grow mizuna and mibuna](https://www.rhs.org.uk/vegetables/mizuna-mibuna/grow-your-own). | Separates the crops by leaf and plant shape: Mibuna forms dense clumps of narrow, dark-green smooth-edged leaves; Mizuna has looser rosettes with serrated leaves. Gives salad and light-cooking use. Horticultural guidance, not Québec market or terminology evidence. |
| `WP03-K-MIBUNA-20261014-R120-S03` | Richters, [Mibuna Mustard](https://www.richters.com/products/mibuna-mustard-x8501). | Current Canadian-owned retailer title uses `Mibuna Mustard`; its text describes leafy culinary use in salads, stir-fries, and soups and sells seed packets/bulk seed. Supports the crop-qualified EN alias, not fresh-produce availability. The page's parenthetical botanical wording is not used as a catalog taxonomic claim. |
| `WP03-K-MIBUNA-20261014-R120-S04` | Gaia Organic Seeds, [French-language vegetable list](https://gaiaorganics.ca/product/vegetables-list-fr/). | Ottawa seed seller's French-facing catalog uses `Mibuna Précoce Moutarde Japonaise` and describes edible leafy use. This is cultivar/seed evidence, not a fresh-food market label. Do not promote the broad `moutarde japonaise` wording to a French alias. |
| `WP03-K-MIBUNA-20261014-R120-S05` | Gaia Organic Seeds, [local seed locations](https://gaiaorganics.ca/where-to-get-our-seeds-locally-ottawa/). | Seller page lists Ottawa and Québec seed locations, confirming the Canadian seller context for S04. It does not independently establish fresh Mibuna produce sales. |
| `WP03-K-MIBUNA-20261014-R120-S06` | OQLF, [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/). | A site-scoped search for `mibuna` did not surface a dedicated entry. Negative terminology search only; do not describe `mibuna` as OQLF-approved. |
| `WP03-K-MIBUNA-20261014-R120-S07` | Marché de proximité de Québec, [vegetables and legumes listings](https://www.marchequebec.org/index.php?categorieid=5&souscategorieid=22). | The currently indexed listing page includes mizuna and tatsoi but no Mibuna product. The page was not directly retrievable in the browser during review, so this is a limited marketplace snapshot and an absence of a listing is not evidence of general unavailability. |

## Recommendation and review limits

Recommend the identity-only row above because the Québec trial, the Canadian English product title, and a Canadian French-facing seed listing support a distinct culinary crop named Mibuna. Keep the name provisional in fr-CA and disclose the lack of a current Québec fresh-market listing. The recipe corpus has no demand, and no reusable numerical or substitution behavior is supported. The Section K regional sweep and independent Québec bilingual review remain open.

## Coordinator review and integration

An independent reviewer accepted `mibuna` as a provisional borrowed fr-CA display based on the Québec agronomy report and Gaia’s French-facing seed catalog. The reviewer confirmed that neither source is a fresh-produce package or an OQLF terminology ruling.

Root added `ingredient-ref-mibuna` in `VEGETABLE_AND_AROMATIC`, with `mibuna` for both display names, `mibuna mustard` as the only English alias, no French aliases, `defaultDensity: null`, and `unitMappings: []`. The ledger records identity and the unsupported measurement/substitution boundaries, with no observations or active replacement. The broad mustard query expands by one result; `mustard greens`, Mizuna, and Komatsuna exact results remain unchanged. The bundled corpus has no matching recipe line.

The wider Section K sweep and independent Québec terminology review remain open. Static package, ledger, generated-index, alias-ownership, and corpus checks were performed. No app, Gradle, instrumentation, or emulator tests were run because the catalog change adds database JSON data under the updated `AGENTS.md` rule.
