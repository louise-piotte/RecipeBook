# WP04 Section P R111: Southern bluefin tuna identity

## Disposition

Added identity-only `Southern bluefin tuna / thon rouge du Sud` for *Thunnus maccoyii* as `ingredient-ref-southern-bluefin-tuna` in `PROTEIN`. Both alias arrays are empty so qualified searches find the species and broad `bluefin` / `thon rouge` searches return all three bluefin references.

CFIA's Fish List, the current Québec fish table, and TERMIUM Plus support the qualified bilingual identity. Keep the Atlantic and Pacific rows unchanged and leave recipe 111 linked to generic `tuna / thon`; the bundled recipe does not name a species. No forms, active measures, mappings, recipe links, conversions, yields, package rules, or substitutions were added. Measurement research found no supported species-specific value; substitution research remains `not_yet_researched`.

## Evidence and review

- CFIA, [Fish List tuna query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna), lists TSN 172431, *Thunnus maccoyii*, with Southern Bluefin Tuna and Thon Rouge Du Sud name rows.
- The [Québec government's current species table](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/etablissements-alimentaires/precautions-aliments-dangereux/poisson) directly pairs *T. maccoyii* with `Thon rouge du Sud / Southern bluefin tuna`.
- [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frb&lang=eng&srchtxt=THUNNUS+MACCOYII) records the same qualified pair.
- Full source limits, picker projection, generic recipe boundary, and numeric review are in the [R111 proposal](../../proposals/wp04-section-p-southern-bluefin-tuna-identity-review-r111-20261014.md); accepted evidence and decisions are in the [research ledger](../../research-ledger.v1.json).

## Static checks

- Bundled reference normalization and package validation passed; the generated catalog index contains 1,453 references.
- Ledger schema and source-reference validation passed.
- Static picker projection returns the qualified English and French names to the new row; broad bluefin and thon rouge queries return all three species rows. Recipe 111 remains generic and no bundled row names Southern bluefin.
- UTF-8/no-BOM, local links, and whitespace checks passed.
- No application tests or emulator checks were run because the catalog/runtime change only adds database JSON data and its generated index, under the updated `AGENTS.md` rule.

Section P remains open; recipe 111 remains on generic tuna.
