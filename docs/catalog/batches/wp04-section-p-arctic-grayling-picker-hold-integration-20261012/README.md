# WP04 Section P Arctic grayling picker hold

## Decision

Keep the prospective *Thymallus arcticus* reference unallocated. CFIA lists `Arctic Grayling / Ombre Arctique`, and Yukon sources document northern food use, but the reviewed evidence does not establish Québec consumer naming or current Québec availability. There is no matching bundled recipe demand.

The live picker makes the boundary concrete: adding `Arctic grayling / ombre arctique` would make bare `grayling` return this one species even though CFIA also lists *Thymallus thymallus* as `Grayling / Ombre Commun`. Bare `ombre` currently returns `cucumber / concombre` and `orange-footed sea cucumber / holothurie touffue` through substring fallback; the proposed qualified French display would become a phrase-first hit and suppress both results. Leaving the broad terms out of alias arrays would not fix the collision because they occur inside the proposed displays.

## Data disposition

No reference, ledger record, alias, form, measurement, conversion, package yield, recipe link, substitution, or generated-catalog row was added. Reopen if a species-qualified recipe/import creates demand or picker behavior can preserve the broader meaning.

## Review

The review checked CFIA naming and species separation, Yukon French fish terminology and food-use context, and PHAC Foodbook's small-sample Yukon exposure estimate. The consumer-market and Québec terminology limits remain explicit. Static ownership, picker-projection, source-ID, full recipe-corpus, UTF-8/no-BOM, newline, and whitespace checks passed. This is a documentation-only hold; no app, unit, instrumentation, or emulator tests were run.

See [the species and picker review](../../proposals/wp04-section-p-arctic-grayling-species-picker-northern-use-hold-review-20261012.md). Section P remains open.
