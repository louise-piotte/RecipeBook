# WP03 Section F — teff grain `tef` alias (R90)

Reviewed and integrated 2026-10-13. Section F and the grain's independent Québec display review remain open.

## Change

Added `tef` as the only French search alias on the existing `ingredient-ref-teff-grain` row and set its `updatedAt` to the 2026-10-13 review date. Kept the display `teff / teff d'Abyssinie`, category, numeric fields, forms, and the separate `teff flour / farine de teff` identity unchanged. The research ledger now has two new source entries and one accepted alias decision on the existing grain record; it reuses `WP02-S90` (OQLF GDT) and `WP03-S76` (CFIA French crop list).

The OQLF-hosted [GDT entry `tef`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef) defines the cereal and marks the spelling “Non courant” while also calling it recommended. [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=ERAGROSTIS+TEF) lists `tef` as correct and `teff` / `teff d'Abyssinie` as correct normalized terms. CFIA's French crop list supports the existing display. A current Canadian seller's [French whole-seed listing](https://yupik.com/fr/teff-seeds-p20075) uses `graines de teff`; Yupik identifies itself as Canadian and lists its Montreal address ([company information](https://yupik.com/en/about-us), [contact page](https://yupik.com/contact/)). These sources support a search spelling while the display awaits separate human Québec review; the alias decision does not claim that `tef` is the current consumer-facing display.

## Picker and recipe boundary

The exact phrase alias corrects the current substring fallback for `tef`: before the change, it matched teff grain, teff flour, and lake whitefish because `tef` occurs within `whitefish`. After the change, an exact `tef` query returns teff grain only. `teff` still returns both grain and flour; `teff d'Abyssinie` remains grain-only; `farine de teff` remains flour-only.

The 114 manifest-listed recipes and 1,123 structured ingredient rows contain no teff terms or links to the grain. No recipe links changed. Yupik's 1/8 cup (30 g) nutrition serving remains SKU-specific and was not added as a general measure, density, form, or yield. No global or contextual substitution was added; a qualitative texture comparison to polenta is not a tested replacement rule.

## Verification

Reference normalization, seed-package normalization, seed-package structural validation, and generated Kotlin catalog freshness checks passed. A focused static audit confirmed the grain row has exactly `aliasesFr: ["tef"]`, the flour row is unchanged, the two new source IDs occur once on the grain record, and identity/measurement/substitution states and numeric/form fields did not change. No unit, instrumentation, emulator, or app tests were run because this change only adds database JSON data under `AGENTS.md`. See the [R90 proposal](../../proposals/wp03-section-f-teff-grain-tef-alias-review-20261013-r90.md) for the source register, picker projection, and recipe scan.
