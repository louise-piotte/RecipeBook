# WP02/WP03/WP04/WP05 — manioc flour, chiura, Atlantic capelin, and Vernonia leaves

Integrated on 2026-10-12 from three proposal-only agent reviews and one root research review. This batch adds two identity-only references and two exact aliases.

## Catalog changes

| Surface | Change | Boundary |
|---|---|---|
| `ingredient-ref-cassava-flour` | Add English alias `manioc flour` | OQLF pairs the term with dry-ground manioc-root flour. Keep wet-extracted manioc/tapioca starch and process-qualified products separate. No new forms or numeric behavior. |
| `ingredient-ref-flattened-rice-poha` | Add English alias `chiura` | Nepalese sources define chiura as beaten rice flakes; Canadian English product listings pair chiura with beaten rice. Keep qualified color/cultivar/crisp products and prepared dishes separate; add no French alias. |
| `ingredient-ref-atlantic-capelin` | Add `Atlantic capelin / capelan de l’Atlantique`, English alias `caplin` | Scope to *Mallotus villosus*. Do not add generic `capelin` / `capelan` aliases or a pan-species identity; short queries may still match within the qualified display. Keep other *Mallotus* species and roe products separate. No forms, recipes, or active numeric behavior. |
| `ingredient-ref-vernonia-amygdalina-leaves` | Add `Vernonia amygdalina leaves / feuilles de Vernonia amygdalina`, aliases `onugbu` and `ewuro` | Scope to food-use leaves of this species. Keep unqualified bitter leaf/bitterleaf and ndole/ndolé unassigned because sources document market use across three *Vernonia* species. |

The four candidate terms have no bundled recipe demand. No recipe text, quantity, link, measurement, conversion, yield, or substitution rule changed. The broader flour/starch, Section F, Section P, African cuisine, measurement, substitution, and bilingual-review checklists remain open.

## Research packets

- [Manioc flour English alias](../../proposals/wp02-b2-manioc-flour-english-alias-review-20261012.md)
- [Chiura / beaten-rice alias boundary](../../proposals/wp03-section-f-chiura-beaten-rice-alias-boundary-review-20261012.md)
- [Atlantic capelin identity](../../proposals/wp04-section-p-atlantic-capelin-identity-review-20261012.md)
- [Vernonia amygdalina food-leaf identity](../../proposals/wp05-west-african-vernonia-amygdalina-leaves-review-20261012.md)

## Static validation

- Bundled seed package normalization check and validation: passed; package contains 1,252 ingredient references and 114 recipes / 1,123 ingredient rows.
- Ingredient-reference normalization check: passed.
- Generated Kotlin catalog freshness check: passed at 1,252 references.
- Research ledger schema validation: passed with 1,560 records, 5,434 source entries, 4,472 distinct source IDs, 8 unit conversions, and 0 errors.
- Phrase search returned the intended unique row for `manioc flour`, `chiura`, `Atlantic capelin`, `capelan de l’Atlantique`, `caplin`, `Vernonia amygdalina`, `onugbu`, and `ewuro`; `rato chiura`, `caplan`, `bitter leaf`, `bitterleaf`, `ndole`, and `ndolé` remain unassigned.
- The full manifest scan covered 114 recipe files / 1,123 ingredient rows / 753,736 file bytes (corpus SHA-256 `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3`) and found zero candidate-phrase hits in files or ingredient rows.
- Exact reference SHA-256: `a67716b92d4129d7ecbd7109e5481787f12b3a479fb6f09769e5cd00e6a3ecf8`; ledger SHA-256: `2e667165a27c6fca16738e7f724b6a2495a8ef12dbc4c4e58528ec7b50764eba`.
- UTF-8/no-BOM and trailing-whitespace scans passed for touched files; targeted `git diff --check` passed for tracked touched files.
- No app tests or emulator checks were run because this batch only adds database JSON data under `AGENTS.md`.

## Source evidence

- Manioc flour: [OQLF, farine de manioc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287122/farine-de-manioc), [Codex edible cassava flour standard](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B176-1989%252FCXS_176f.pdf).
- Chiura: [Nepal Academy of Science and Technology, Traditional Foods of Nepal](https://nastlibrary.nast.org.np/elibrary/filestore/1/9/0_d5666a15fdb5bfd/190_f8d6b5e1ad6022d.pdf), [Danphe Stores Canada](https://danphestores.com/), [R&R Grocery Canada](https://randrgrocery.ca/products/white-beaten-rice-taichin-chiura-2lb).
- Atlantic capelin: [OQLF, capelan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198782/capelan), [DFO, Atlantic Capelin](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/capelin-capelan-eng.html), [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Capelin&wbdisable=true).
- Vernonia leaves: [FAO West African trade study](https://www.fao.org/4/x6612f/x6612f06.htm), [Government of Nigeria / FAO country report](https://www.fao.org/4/i1500e/Nigeria.pdf), [Afritibi Canada product page](https://afritibi.com/produit/ndole/).
