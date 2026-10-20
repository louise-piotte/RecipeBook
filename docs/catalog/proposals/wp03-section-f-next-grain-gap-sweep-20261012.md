# WP03 Section F next-grain gap sweep: amaranth flakes (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** integrated as one identity-only `amaranth flakes / flocons d'amarante` reference. Source IDs S01–S03 are now registered on its research-ledger record. No forms, measurements, density, unit mappings, conversions, yields, recipe links, or substitutions were added. No tests or emulator checks were run under the JSON-only data rule; see the [integration record](../batches/wp03-section-f-amaranth-flakes-integration-20261012/README.md).
- **Scope:** select one unreviewed human-food grain/cereal identity from the remaining Section F coverage, and audit its current exact-key ownership and bundled recipe demand.
- **Plan location:** Section F leaves grits, polenta, pearled hominy, pozole corn, dried sweet corn, and residual puffed-grain candidates open, along with further preprocessed-grain and cereal-mix coverage and state-form review ([plan lines 1834–1900](../../RecipeBook-global-ingredient-catalog-plan.txt#L1927)). The latest wheat-flakes identity was integrated separately on 2026-10-12 ([plan line 8120](../../RecipeBook-global-ingredient-catalog-plan.txt#L8391)); this review does not repeat it.
- **Disposition:** recommend adding one identity-only `GRAIN_AND_CEREAL` reference, **`amaranth flakes / flocons d'amarante`**. The exact English product name is listed by a current Canadian retailer, and current Québec grocery ingredient listings attest the French phrase. The candidate remains distinct from plain amaranth grain, amaranth flour, greens, puffed amaranth, and composite cereals.

## Current package snapshot

The snapshot below was read from the live split package immediately before drafting. File hashes are SHA-256 over exact bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte, in manifest order.

| Artifact | Current count/state | SHA-256 or corpus digest |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,216 references; 105 `GRAIN_AND_CEREAL` | `aeab72e4fc30c6938fb8beefa4b68820962b3b69cd1d60fa0ec565c20b79d982` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `manifest.v1.json` | 114 listed recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 recipe-file bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,519 records; 5,130 source entries; 4,193 distinct source IDs; 8 unit conversions | `016629dc79b4f70bf566639807af58af4e352866ddd9a893452f191612f9337d` |
| Generated `BundledIngredientCatalog.kt` | 1,216 references | `0a5a3e93dadd38ea212d248135da462d4304bcf06d244741f02ba3f21cb47787` |

All 114 recipe paths named in the manifest existed at review time. These counts and hashes identify this review snapshot; recheck them before any future integration.

## Candidate decision: amaranth flakes

A Canadian online retailer currently lists an in-stock, single-ingredient product titled **Organic Amaranth flakes**. Its product ingredients are `amaranth flakes`; the description calls that particular product pre-cooked. A current Québec grocery listing uses the exact ingredient wording **`FLOCONS D'AMARANTE`** in a Nature's Path multi-grain hot-cereal ingredient declaration. The latter is a composite cereal, so it supports the Québec French ingredient wording but does not describe a standalone amaranth-flake package. OQLF identifies `amarante` as the preferred feminine name for the seed-derived cereal and pairs it with English `amaranth`; it does not standardize the flake compound.

Together, these sources support a plain amaranth-flake product identity and the proposed bilingual display. The recommendation does not adopt the Canadian retailer's brand, package size, organic claim, pre-cooked claim, preparation instructions, or the Québec cereal's multigrain formula. The product evidence does not establish a universal species, flaking method, ready-to-eat state, cooking time, or equivalence to another grain.

A repository scan of existing WP03 proposals and batch records found no earlier amaranth-flake review. Existing reviews of barley, wheat, rye, buckwheat, quinoa, and spelt flakes, and the distinct puffed-amaranth review, do not cover this identity.

| Proposed field | Recommendation |
| --- | --- |
| ID | `ingredient-ref-amaranth-flakes` (unallocated) |
| English display | `amaranth flakes` |
| Québec French display | `flocons d'amarante` |
| Category | `GRAIN_AND_CEREAL` |
| English and French aliases | None |
| Recipe links | None; the corpus has no matching line |
| Forms, measures, default density, unit mappings, yields, conversions, substitutions | None |

Keep this product separate from the active `amaranth / amarante` grain, `amaranth flour / farine d'amarante`, amaranth greens, and `puffed amaranth / amarante soufflée` identities. Flaking is sold as a grain-product format and the Canadian example is described as pre-cooked; it is not an established dry/cooked state form of the raw amaranth reference. Do not alias flakes to grain, flour, puffed amaranth, instant cereal, or a multigrain breakfast mix. Keep the source-specific `pre-cooked` wording and cooking directions out of runtime data. The OQLF entry for `amaranthe` concerns a food-colouring powder, so do not activate that spelling for the edible grain or flakes.

## Exact-key and recipe audit

The audit used the repository's `normalize_search_key` implementation from `tools/seed_package/bundled_seed_package.py` on active reference names and aliases, form labels and match terms, legacy identity names and aliases, ledger record IDs, and the complete serialized recipe files. Candidate phrases included `amaranth flakes`, `amaranth flake`, `flakes of amaranth`, `instant amaranth flakes`, `precooked amaranth flakes`, `amaranth grain flakes`, `flocons d'amarante`, `flocon d'amarante`, and `amarante en flocons`.

| Search scope | Result |
| --- | --- |
| Exact normalized-key owners in active reference names/aliases | 0. The nearby active amaranth grain, flour, greens, and puffed-amaranth rows remain separate owners of their own names. |
| Exact normalized-key owners in ingredient-form labels/match terms | 0. No amaranth-flake form exists. |
| Exact normalized-key owners in 66 legacy candidates | 0. |
| Exact proposed ID or candidate record in active references, forms, legacy candidates, or ledger | None. `ingredient-ref-amaranth-flakes` is unallocated. |
| Candidate phrases in ledger record IDs or serialized ledger text | 0. The active amaranth grain, flour, greens, and puffed-amaranth records do not mention flakes. |
| Candidate phrases in complete manifest recipe text | 0 / 114 files. |
| Candidate phrases in `ingredients[]` objects | 0 / 1,123 rows. |

The full serialized recipe files and each ingredient object were normalized and scanned. This is a text and exact-key audit, not a live picker-ranking test. The lack of recipe demand means no recipe relink, quantity, form, or substitution is proposed.

## Remaining Section F gaps

This single identity does not close Section F. The live checklist and current review records leave the following distinct work open:

- The existing holds for unqualified farro and generic sushi rice; pearled hominy and pozole corn; generic grits and polenta; and dried sweet corn remain unchanged ([plan lines 502–507](../../RecipeBook-global-ingredient-catalog-plan.txt#L502), [1834–1844](../../RecipeBook-global-ingredient-catalog-plan.txt#L1927)).
- The species-level millet review still has held brown-top, barnyard, and Sikiya/crab-finger candidates ([plan lines 509–523](../../RecipeBook-global-ingredient-catalog-plan.txt#L509)). Sorghum flakes remain unresolved; recent candidate reviews also keep puffed teff, puffed rye, puffed corn, and whole-kernel puffed oats out of the active catalog ([plan lines 1867–1880](../../RecipeBook-global-ingredient-catalog-plan.txt#L1960), [2098–2102](../../RecipeBook-global-ingredient-catalog-plan.txt#L2191)).
- Independent Québec terminology decisions remain open for some existing grain displays, including pot barley and rye berries; `sticky rice` remains withheld as a global glutinous-rice alias. Broader Québec naming review also remains open for red rice and other grain classes.
- Dry/cooked forms remain unassigned for other grains without specific recipe or measurement evidence. Regionally significant cereal mixes and preprocessed grains encountered in cuisine reviews need their own product-boundary checks; this review does not propose a generic cereal-mix row.

The recently integrated barley, rye, buckwheat, spelt, and wheat flake identities, along with the held grain candidates above, were not repeated or reopened here.

## Proposal-local source register

The proposal-local source IDs below were checked absent from the shared research ledger before writing; integration registered S01–S03 on `ingredient-ref-amaranth-flakes`. Sources were reviewed on 2026-10-12.

| Source ID | Source and locator | Supports / does not support |
| --- | --- | --- |
| `WP03-AMARFLAKE-20261012-S01` | Naturitas Canada, [Organic Amaranth flakes, 250 g — El Granero Integral](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/organic-amaranth-flakes-250-g-el-granero-integral), product description and ingredients. | Current Canadian storefront listing marked in stock; the ingredient line is `amaranth flakes*`. The page describes this specific product as pre-cooked and gives its product-specific uses. Supports a current Canadian-market example and the English product wording; it does not establish Canadian manufacture, universal processing, a transferable measure, or a Québec French product title. |
| `WP03-AMARFLAKE-20261012-S02` | Super C Québec, [Gruau d'avoine et de supergrains biologique en sachets — Nature's Path](https://www.superc.ca/allees/garde-manger/cereales-tartinades-et-sirops/flocons-d-avoine-et-cereales-chaudes/gruau-d-avoine-et-de-supergrains-biologique-en-sachets/p/058449154006), UPC 058449154006, ingredient declaration. | Current indexed Québec grocery listing includes `FLOCONS D'AMARANTE*` among oats, buckwheat, chia, hemp, and quinoa in a composite hot-cereal mix. Supports the exact local French ingredient wording only; it is not a standalone product label or a specification of amaranth-flake process. Direct page retrieval returned 403 during this review. |
| `WP03-AMARFLAKE-20261012-S03` | Office québécois de la langue française, [amarante](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante), GDT, updated 2009. | Gives preferred feminine French `amarante`, English `amaranth`, and a cereal identity derived from the plant's seeds. Supports the base noun and edible-grain context; it does not define or standardize `flocons d'amarante`. |

## Review disposition

**Integrated `amaranth flakes / flocons d'amarante` as one identity-only Section F reference.** Current Canadian retail evidence supports the standalone single-ingredient product, and Québec ingredient declarations attest the exact French phrase. Keep aliases, forms, measures, density, mappings, yields, conversions, substitutions, and recipe links empty. Preserve the active amaranth grain, flour, greens, and puffed-amaranth identities as separate products, and leave all other Section F holds and gaps open.
