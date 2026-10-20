# WP04 Section P R508 — shrimp-dumpling product boundary review

- **Review and online source-access date:** 2026-10-17.
- **Checklist:** Open WP04 Section P item, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6880)).
- **Gap selected:** Canadian and Québec retail products labelled `shrimp dumplings` / `dumplings aux crevettes`, including shrimp-filled frozen dim sum.
- **Recommendation:** **Hold the general shrimp-dumpling identity unallocated.** Current human-food product evidence supports these names, but the phrase-first picker would make broad `dumpling` and `dumplings` searches return this single shrimp-specific result. The product evidence also spans named styles and differing fillings. Reopen when a recipe requests a specific product/style or the picker can show the broader Asian-dumpling family alongside named products.
- **Scope boundary:** This is a distinct prepared-food review, not a new shrimp species or a form of generic shrimp. It does not reopen the accepted shrimp-ball, breaded-shrimp, coconut-shrimp, popcorn-shrimp, canned-cocktail-shrimp, or species-specific shrimp decisions, nor any crab identity.
- **Integration status:** Integrated as a documentation-only hold. No shared catalog JSON, ledger, recipe, generated file, or application file changed. No software tests/build/emulator/deploy were needed; see the [R508 integration README](../batches/wp04-section-p-shrimp-dumpling-boundary-hold-integration-r508-20261017/README.md).
- **Proposal-local source IDs:** `WP04-SECTIONP-SHRIMP-DUMPLINGS-R508-20261017-S02` through `S05`; repository audit label `WP04-SECTIONP-SHRIMP-DUMPLINGS-R508-20261017-R01`. Reuse OQLF source `WP03-GNOCCHI-20261010-S03` for its existing URL and owner below.

## Why this is a distinct open gap

The open Section P parent covers shrimp and prawn by meaningful preparation. The current catalog includes distinct shrimp balls (`ingredient-ref-shrimp-balls`) and several species-neutral coated, breaded, canned, and snack products. It has no shrimp-dumpling identity or dumpling filling identity. The earlier shrimp-ball review explicitly listed shrimp dumplings as a separate excluded product, but did not allocate or review them. [R148](wp04-section-p-next-seafood-product-gap-review-r148-20261015.md)

Current Canadian retail evidence confirms a product labelled **T&T Shrimp Dumplings** (1.04 kg); the corresponding Québec retailer view uses **Dumplings aux crevettes** for the same product number, `21471210_EA`. A separate Canadian seafood seller lists frozen **Shrimp - Dumpling (Har Gow)**, states that its particular product contains shrimp and pork fat, and gives a product-specific steaming direction. These establish current product names, not one uniform recipe or cooking state for every food called a shrimp dumpling. [S02–S04]

Québec terminology evidence makes the picker boundary material. OQLF defines *ravioli asiatique* as a filled dish that may contain meat, seafood, or vegetables, identifies jiaozi, gyoza, and wonton as types, and notes that *dumpling* is established Québec usage for this broader family. The OQLF entry is general terminology evidence; it does not identify shrimp dumplings or establish `ravioli asiatique` as their synonym. [reused `WP03-GNOCCHI-20261010-S03`]

CFIA’s 2017–2018 allergen-surveillance report uses separate sample descriptions including **Frozen shrimp shaomai** and **Shrimp dumpling gyoza**. That old survey is not a product standard, but it reinforces that shrimp-containing dumpling products can have named style variants. The review does not merge har gow, shaomai, gyoza, wonton, shrimp rolls, or mixed meat/seafood fillings into one ingredient family. [S05]

## Ownership and archive audit

The live package snapshot was read on 2026-10-17:

| Dataset | Count | SHA-256 |
|---|---:|---|
| Ingredient references | 1,785 | `2e4dfc405a3578d17400dd108296d37305651fd9626820ba1f1f7850606e8b9a` |
| Ingredient forms | 143 | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| Legacy candidates | 56 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| Research-ledger records / source entries / distinct source IDs / distinct URLs | 2,142 / 9,829 / 8,317 / 7,027 | `8fabf1c8e425815974a34db5434ad8d57507efb315948003dc189917e7289927` |
| Manifest | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Exact normalized-key and ID checks covered reference names and aliases, form labels and match terms, legacy candidate IDs/names/aliases, ledger record IDs, ledger source URLs, and the proposal/batch archive.

| Name, phrase, or ID | Current owner | Disposition |
|---|---|---|
| `shrimp dumpling`; `shrimp dumplings`; `dumplings aux crevettes`; `har gow`; `ingredient-ref-shrimp-dumplings`; `ingredient-form-shrimp-dumplings`; `candidate-shrimp-dumplings` | No exact active reference, form, legacy candidate, or ledger record ID owns these keys. | New identity remains unallocated under this hold. No aliases, form, or candidate record are proposed. |
| `ingredient-ref-shrimp-balls` | Active **shrimp balls / boulettes de crevettes** reference and ledger owner. | Keep separate. R148 explicitly excludes shrimp dumplings from the shrimp-ball identity; it does not decide this gap. |
| `ingredient-ref-fish-balls` | Active fish-ball identity. | Keep separate from shrimp-filled dumpling products. |
| `ingredient-ref-gyoza-wrapper`; `ingredient-ref-wonton-wrapper` | Active wrapper identities; neither denotes a filled dumpling. | Keep wrapper ingredients distinct from the proposed product family. |
| Existing shrimp references | Northern shrimp, dried shrimp, saeu-jeot, Kapi, terasi, bagoong alamang, belacan, canned cocktail shrimp, breaded/coconut/popcorn products, and other prepared rows have their own identities. | No generic shrimp/prawn alias or species assignment is added. |
| Crab identities/forms | Separate crab meat, cake, claws, legs, species, and snow-crab sections owners. | This shrimp-only review does not modify or alias crab products. |
| R508 proposed ID/source prefix | No live ledger or archive allocation found for `ingredient-ref-shrimp-dumplings`, `ingredient-form-shrimp-dumplings`, `candidate-shrimp-dumplings`, or `WP04-SECTIONP-SHRIMP-DUMPLINGS-R508-20261017-*`. | Prefix and IDs remain proposal-local and unallocated. |

The archive contains R148’s boundary mention of shrimp dumplings only as an excluded product name; no focused shrimp-dumpling decision or identity owner was found. No R508 source-ID prefix collision was found. Four proposed source URLs below are absent from the ledger and archive. The OQLF URL is already owned by `WP03-GNOCCHI-20261010-S03` on `ingredient-ref-gnocchi`; reuse that source record rather than creating another source ID. This owner concerns generic Asian-dumpling terminology only.

## Source-ID → URL register

Each source ID maps to exactly one URL. New `S02`–`S05` IDs remain unregistered because this is a hold; no existing ledger record is updated.

| Source ID | Exact URL | Current URL owner / evidence and limits |
|---|---|---|
| **Reused `WP03-GNOCCHI-20261010-S03`** | https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557603/ravioli-asiatique | Existing ledger owner: `ingredient-ref-gnocchi`. OQLF’s 2020 definition supports *ravioli asiatique* as a broad filled-dish category and records Québec use of *dumpling* for that family; it does not provide a shrimp-dumpling name or establish a shrimp recipe. |
| **WP04-SECTIONP-SHRIMP-DUMPLINGS-R508-20261017-S02** | https://www.provigo.ca/en/shrimp-dumplings/p/21471210_EA | New URL and source ID. Current Provigo listing names T&T **Shrimp Dumplings**, 1.04 kg, item `21471210_EA`; its indexed page showed stock at one Longueuil store during access. Retail stock and package size are location- and product-specific. |
| **WP04-SECTIONP-SHRIMP-DUMPLINGS-R508-20261017-S03** | https://www.provigo.ca/fr/collection/east-asian | New URL and source ID. Current Québec-facing collection uses **T&T Dumplings aux crevettes**, 1.04 kg, and also lists dumplings with other fillings. The English and French Provigo pages are views of the same named item, not independent formulations; collection membership does not specify its filling recipe. |
| **WP04-SECTIONP-SHRIMP-DUMPLINGS-R508-20261017-S04** | https://shop.dailyseafood.ca/products/60ecbcb8230b9f003248b1f3/shrimp-dumpling-pack-of-12-pcs | New URL and source ID. Current Canadian seller page calls its ready-made item **Shrimp - Dumpling (Har Gow)**, says frozen, product of Canada, 12 pieces per pack, shrimp and pork fat filling, and six-minute steaming directions. Those particulars apply to that product only. |
| **WP04-SECTIONP-SHRIMP-DUMPLINGS-R508-20261017-S05** | https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/food-safety-testing-reports-and-journal-articles/april-1-2017-march-31-2018-4 | New URL and source ID. CFIA’s report lists distinct sampled product descriptions `Frozen shrimp shaomai` and `Shrimp dumpling gyoza`. Sampling took place in 2017–2018; the page is evidence of named sample varieties, not current market prevalence, composition standards, or culinary equivalence. |

## Picker projection

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, returns complete word-phrase matches first, and uses partial matching only if no full-phrase result exists. The projection below replays that behavior over current reference names/aliases and attached form labels/match terms. The hypothetical row has only `shrimp dumplings / dumplings aux crevettes` as bilingual display names and no aliases; it is shown to explain the hold, not as an integration delta.

| Query | Current projection | Hypothetical projection | Effect |
|---|---|---|---|
| `shrimp dumplings`; `shrimp dumpling` | No result | One: hypothetical `ingredient-ref-shrimp-dumplings` | Qualified product phrases become selectable. |
| `dumplings aux crevettes` | No result | One: hypothetical `ingredient-ref-shrimp-dumplings` | Directly observed Québec product wording becomes selectable. |
| `dumpling` | No result | One: hypothetical `ingredient-ref-shrimp-dumplings` by partial fallback | A broad category query would lead only to the shrimp-specific product. |
| `dumplings` | No result | One: hypothetical `ingredient-ref-shrimp-dumplings` | The broad plural query would also lead only to this product. |
| `shrimp` | 10 references | The same 10 plus the hypothetical shrimp-dumpling row | Existing broad shrimp search stays multi-result. |
| `crevettes` | 14 references | The same 14 plus the hypothetical shrimp-dumpling row | Existing broad French shrimp search stays multi-result. |
| `crevette` | 4 references | Same 4 | Proposed plural display does not add a singular French alias. |
| `har gow` | No result | No result | No source-supported global alias is proposed; Har Gow is a named style on one product listing. |
| `crab`; `crabe`; `prawn` | 11; 11; 0 results | Unchanged | No crab, prawn, or species terms are introduced. |

The broad-query singleton is the principal reason to hold. The Québec term source expressly treats *dumpling* as broader than one filling/style. A future general dumpling row or picker behavior that preserves broad and qualified choices could permit more useful family coverage; this review does not add that broader identity without recipe demand.

## Manifest recipe-corpus scan

All **114** recipe paths listed in `manifest.v1.json` were read in manifest order. The scan covered decoded JSON text and all **1,123** structured ingredient rows for `shrimp dumpling(s)`, `dumplings aux crevettes`, `har gow` variants, `xia jiao`, Chinese characters for the name, and related `dumpling(s)`, wonton, gyoza, and ravioli wording. It found **zero** matching recipe files and **zero** matching ingredient rows; there is no recipe link or recipe-specific quantity to propose.

Corpus fingerprint: **753,988 recipe-file bytes**, SHA-256 **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, computed in manifest order over each relative path encoded as UTF-8, a NUL byte, the exact file bytes, then a NUL byte. This makes the scan auditable against the read-only corpus snapshot above.

## Forms, measures, and substitutions

- **Identity and forms:** Keep the candidate out of active references, aliases, forms, legacy identities, and the research ledger. `Frozen` and `ready-made` are observed on the Daily Seafood product; those states are not established for every item carrying a shrimp-dumpling name. Do not attach har gow, gyoza, shaomai, wonton, wrapper, steaming, or filling-composition terms as global aliases/forms.
- **Measures:** The 1.04 kg Provigo/T&T package and Daily Seafood’s 12-piece package belong to different SKUs. Neither supplies a reusable piece-to-mass relation, kitchen measure, density, drained yield, or cooking yield. Add no active or ledger numeric behavior.
- **Substitutions:** No reviewed source or corpus recipe supports a tested substitution among shrimp dumplings, shrimp balls, whole shrimp, dumpling wrappers, shrimp gyoza/shaomai, wontons, or crab products. Add no conversion, yield, warning, contextual rule, or recipe-line substitution.

## Disposition

Keep **shrimp dumplings / dumplings aux crevettes** unallocated for now. Canadian and Québec listings establish current product wording, but the French and English phrases would make broad `dumpling(s)` searches resolve to a single shrimp-specific choice, and reviewed products include distinct named styles and mixed fillings. The 114-recipe bundle supplies no demand to justify that picker cost. Preserve the existing shrimp-ball and wrapper owners; add no references, forms, aliases, ledger candidate, recipe links, numeric behavior, or substitutions. Reopen this gap when a recipe identifies a specific dumpling product/style or picker scope can represent the broader dumpling family without a misleading singleton result.
