# WP06 Andean pepper identities — 2026-10-09

## Catalog decision

- Added separate identities `ingredient-ref-aji-amarillo-pepper` and `ingredient-ref-aji-panca-pepper` in `VEGETABLE_AND_AROMATIC`.
- Added fresh and dried whole-fruit forms for each identity. No species claim, unqualified alias, ground-product or paste identity, density, unit mapping, measurement, conversion, yield, substitution, or recipe relink was added.
- Kept `ají escabeche`, `ají mirasol`, `ají cristal`, `ají limo`, `ají dulce`, and `ají habanero` out of global aliases and form match terms. The reviewed evidence is regional or inconsistent across trade labels.
- English displays preserve the source names. fr-CA displays are provisional: `piment jaune (ají amarillo)` and `piment panca (ají panca)`.

## Evidence

PROMPERÚ profiles ají amarillo and ají panca separately and describes fresh and dried whole-fruit presentations for both. An INIA-hosted 2021 study also distinguishes the two and documents fresh and dry use. Peruvian INS food tables distinguish fresh and dried amarillo entries and list panca separately. These sources support separate identities and explicit fresh/dried forms, but not a universal species or alias rule. [PROMPERÚ](https://repositorio.promperu.gob.pe/bitstreams/b64381bc-6520-4bc6-a240-90a398db97e0/download), [INIA-hosted study](https://repositorio.inia.gob.pe/server/api/core/bitstreams/e3d3d25d-00f3-4697-aabe-3f320c80f2d5/content), [INS fresh amarillo](https://tablasperuanas.ins.gob.pe/node/625), [INS dried amarillo](https://tablasperuanas.ins.gob.pe/node/627), [INS panca](https://tablasperuanas.ins.gob.pe/index.php/node/628).

SENASA's 2026 export-inspection roster groups additional names with amarillo and panca, but is a phytosanitary trade roster rather than a culinary identity standard. This is why grouped labels were not added as aliases. Québec French evidence is limited to SAQ's Peruvian-context `piment jaune (ají amarillo)` and Canadian market wording for `piment panca`; neither is an OQLF ruling. [SENASA roster](https://www.senasa.gob.pe/senasa/descargasarchivos/2026/02/09-02-2026-Ate-1.pdf), [SAQ](https://www.saq.com/fr/contenu/mois-patrimoine-hispanique-alexandra-yavar), [CIPO French goods wording](https://publications.gc.ca/collections/collection_2019/opic-cipo/RG42-2-66-3371-fra.pdf).

See the full [source-grounded resolution proposal](../../proposals/wp06-andean-peppers-resolution-20261009.md) for the item-by-item alias, ground-product, paste, species, and market-boundary decisions.

## Collision and recipe checks

The pre-integration audit covered 487 references, 18 forms, and 99 legacy candidates, plus all 114 manifest-listed recipes / 1,123 ingredient rows. It found no exact normalized owner for the candidate names and no candidate phrase in a recipe ingredient row. After integration, the active catalog contains the two new identities and four fresh/dried forms. No recipe text or links changed.

## Validation

- Ingredient references: 489 entries, SHA-256 `e4d7700d0234f10969215c57cba025f4f8197c44a9ae972f68986cd843e93265`.
- Ingredient forms: 22 entries, SHA-256 `e258fddbdae2b6df168dfe7e14b1926e7f05004bde775916beeaeaa0b8fd17ff`.
- Manifest: 114 recipe paths, SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Legacy identity candidates: 99, SHA-256 `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b`.
- Research ledger: 660 records / 993 source entries / 851 distinct source IDs, SHA-256 `3fcf3f3f78889834de642483d6a86dae673b49432d966337d1d1be3dc6bb4d07`.
- Package normalizers and generated-index check passed. All 9 Python package tests and 307 Android unit tests passed.
- Pixel 9a / Android 16 connected instrumentation on `emulator-5556`: 29 cases, 27 passed, 2 skipped, 0 failures or errors. The deployment script installed and launched the app.
- English picker searches returned the two identities; `aji panca seco` showed the dried panca form hint. French picker search `aji amari` returned `piment jaune (ají amarillo)`; `aji panca seco` returned the panca identity and `piment panca (ají panca), séché` form hint. The temporary unsaved draft was discarded and the French library returned to 114 recipes.

## Emulator screenshots

| Screenshot | SHA-256 |
|---|---|
| [English picker: ají amarillo](en-aji-amarillo-picker.png) | `1da57895d2e612196b98f79f8a9ca7b8b0bce8c3ed83261a7c5af6b64bf66ef4` |
| [English picker: ají panca](en-aji-panca-picker.png) | `f39d89d150bae5464a4bf70d01c3586a3a4ec2616eb11c64d84fa734b365c9c0` |
| [English picker: dried ají panca hint](en-aji-panca-dried-picker.png) | `7e09b4b54e01609302c4751fa6d4e68f5cc52d4873ce50e3728fbe1b1c870e3a` |
| [French picker: ají amarillo](fr-aji-amarillo-picker.png) | `7e9b95eda4d0b494378d4c1d20b4aac652bba73d0c79aaa146e9afa149d73649` |
| [French picker: dried ají panca hint](fr-aji-panca-dried-picker.png) | `8a9eec135cc3e96746973e9dae2329ce956c98b71aaeb6c799b9e990b412bad5` |
| [French home, 114 recipes](fr-library-home.png) | `483375bf45b7e40e6aa82787d1848890f1d411bda17a5e6282959cbfa67c8747` |

## Open work

Additional regional Capsicum boundaries beyond the integrated rocoto identity, independent Québec terminology review, and any future product-level review of ground peppers or pastes remain open.
