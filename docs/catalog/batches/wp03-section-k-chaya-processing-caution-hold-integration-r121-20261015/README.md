# WP03 Section K chaya processing-caution hold (2026-10-15)

## Decision

Keep chaya leaves / `feuilles de chaya` outside active references and the shared research ledger.
The species and leaf-ingredient identity are supported, but reviewed sources warn against raw
leaves and require thorough cooking. The current ingredient reference and full-library schema have
no user-visible handling-caution field, and the reviewed preparation times are source- or
sample-specific. Do not encode a general cooking time as a form, conversion, or substitution.

No catalog reference, ledger record, alias, form, density, unit mapping, recipe link, conversion,
yield, or substitution was added. No bundled recipe contains a matching ingredient line. Revisit
when a source-bounded preparation caution can be stored and shown to users; keep the broader
Section K greens sweep open.

See the [R121 chaya review](../../proposals/wp03-section-k-chaya-leaves-processing-safety-identity-review-r121-20261015.md).

This is a documentation-only hold. No app, Gradle, instrumentation, emulator, or deployment tests
were run; the updated `AGENTS.md` rule also exempts JSON-only data additions from testing.
