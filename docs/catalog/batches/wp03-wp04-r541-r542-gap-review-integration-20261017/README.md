# WP03 / WP04 catalog research integration (R541–R542)

Date: 2026-10-17

## Decisions and changes

- Added five CNF 2026 `portion_weight` observations to the existing research-ledger records `ingredient-form-rice-cooked` and `ingredient-form-quinoa-dry`: rice at 100, 125, and 250 mL; dry quinoa at 100 and 250 mL. Each uses the published gram value and remains separate from CNF 2015 evidence.
- Added four record-local source entries for each Food Code. The CNF 2026 sources document the Food Name, conversion, measure-name, and measure-type rows joined for codes 4523 and 4495. Each observation cites only sources attached to its own record.
- Left the R267 cooked-quinoa Food Code 5917 observations unchanged. No density, extrapolation, active measure, unit mapping, conversion, cooking yield, recipe mass, or substitution was added.
- Checked the two CNF 2026 row-inspection items for cooked rice (4523) and dry quinoa (4495) in the active plan. The broader Section F grain work remains open.
- Held *Trichiurus lepturus* outside active catalog and ledger data. OQLF's `Atlantic cutlassfish / sabre` species pair conflicts with the broader CFIA common-name assignments, and a current Ontario product uses `Atlantic Cutlassfish` for *Lepidopus* / *L. caudatus*. Added the hold beneath the still-open Section P fish parent; no row, alias, form, or recipe link was added.
- Updated the two proposal records to integrated status and added this batch to `roadmap.md`.

## Evidence and review

See the detailed [R541 CNF 2026 review](../../proposals/wp03-section-f-cnf-2026-cereal-measures-review-r541-20261017.md) and [R542 cutlassfish hold](../../proposals/wp04-section-p-next-finfish-gap-review-r542-20261017.md). R541 reports direct 2026-10-17 retrieval of the official Health Canada / Open Government CSV files and joins Food Name, Measure Weight Conversion, Measure Name, and Measure Type rows. R542 documents the OQLF, CFIA, ITIS, and current Ontario retailer name boundaries and the absence of matching bundled-recipe demand.

## Verification

- Parsed the ledger JSON and ran its research-ledger schema validator.
- Checked that all eight added source IDs are unique, attached to their intended record, and referenced by the five new observations; checked that observation IDs are unique and values match the joined rows.
- Checked UTF-8 without BOM, JSON formatting, local proposal links, plan links, and whitespace on the updated files.
- No application code or app behavior changed. The rice and quinoa work only adds database JSON data, which `AGENTS.md` exempts from software tests; R542 is a documentation-only hold. No unit or instrumentation tests, build, emulator run, or deployment were needed.

The Section F dry/cooked-grain work and Section P finfish parent remain open.
