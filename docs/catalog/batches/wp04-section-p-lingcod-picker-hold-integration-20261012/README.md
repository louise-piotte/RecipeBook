# WP04 Section P: Lingcod picker hold

## Decision

Keep the source-verified lingcod candidate outside the active catalog until the picker can handle
the broader `ling` and `ling cod` name boundary. OQLF and CFIA support `lingcod / morue-lingue` for
*Ophiodon elongatus*, while TERMIUM also records `ling cod` for *Molva molva*. Under the current
phrase-first search, adding that spaced spelling would make a broad `ling` query return only
lingcod. Do not add the candidate reference, alias, ledger record, form, recipe link, measurement,
conversion, yield, or substitution in this pass.

The proposal's static projection finds no current owner for the species-qualified terms or ID, and
the manifest-listed corpus has no matching ingredient row. Health Canada portions and a Toronto
vendor's fillet listings remain source-specific evidence; they do not resolve the picker ambiguity
or justify active numeric behavior.

## Review and validation

- Root reviewed the proposal and verified the OQLF, TERMIUM, DFO, and Health Canada evidence.
- The proposal records the exact-key and neighboring-owner audit, the picker projection, and the
  114-recipe / 1,123-row corpus scan.
- No catalog, ledger, manifest, recipe, or application data changed. This documentation-only hold
  required no app tests or emulator checks.

See [the full review proposal](../../proposals/wp04-section-p-lingcod-morue-lingue-picker-boundary-review-20261012.md).
