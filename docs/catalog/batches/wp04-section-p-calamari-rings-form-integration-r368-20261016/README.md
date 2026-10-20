# WP04 Section P — calamari rings form (R368, 2026-10-16)

## Integration record

- **Status:** Integrated on 2026-10-16; see the [proposal](../../proposals/wp04-section-p-next-gap-review-r368-20261016.md).
- **Change:** Added `ingredient-form-calamari-rings` under the existing `ingredient-ref-calamari` and linked recipe `023#1` to it.
- **Scope:** The form represents cut shape only. It does not assign a species or imply frozen, cooked, breaded, or packed product state. No research-ledger source record was added, as the proposal recommends.

## Evidence and decision

Recipe 023 already describes its 140 g calamari line in English as “sliced into rings” and in French as `tranché en rondelles`; it had no form link. The Québec-facing Mayrand catalog lists unbreaded `Rondelles de calmar` separately from breaded frozen rings. Metro's indexed Blue Tide listing corroborates the phrase `Rondelles de calmar surgelé`, but its direct page returned 403, so it is not the sole evidence. OQLF's existing `calmar / squid` entry supports the parent identity and does not define the cut form.

The form label and match terms remain qualified by calamari/squid/calmar. The recipe keeps its original text, 140 g quantity, unit, and bilingual preparation. The package listings do not establish a general serving, ring count, density, conversion, yield, or substitution.

## Picker and recipe impact

- `calamari rings`, `squid rings`, and `rondelles de calmar` return the existing calamari reference with a ring-cut form hint.
- Broad `ring`, `rings`, and `rondelles` searches may include the calamari reference as an additional result; no standalone shape alias was added.
- Recipe `023#1` is the only matching ingredient row in the 114-recipe / 1,123-row bundle. Its quantity, original text, ingredient identity, and preparation remain unchanged.

## Sources

- Office québécois de la langue française, [GDT: calmar](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198881/calmar).
- Metro, [Rondelles de calmar surgelé Blue Tide, 454 g](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/rondelles-de-calmar-surgele/p/836443000433), indexed product listing.
- Mayrand, [Calamar surgelé](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/calamar-surgele), current Québec product catalog.

## Validation

- Confirmed the form points to an existing reference and recipe `023#1` points back to the same reference's form.
- Confirmed the recipe amount remains 140 g and its original text and bilingual preparation are unchanged.
- Bundled seed package normalization and validation passed; UTF-8 without BOM and scoped links and whitespace were checked.
- No app, unit, instrumentation, emulator, or deployment tests were run because this change adds database JSON data under `AGENTS.md`.
