# WP03 Section F R318: pozole-corn boundary hold

R318 rechecked `ingredient-ref-pozole-corn` against current Canadian and Québec product listings, regional maize-use evidence, the active picker, and the complete manifest-listed recipe corpus. The candidate remains ledger-only in `needs_clarification`; no active reference, alias, form, or recipe link was added.

Québec product listings show prepared states under pozole wording: A La Maison describes whole white corn as canned and nixtamalized, and EnRoute describes La Costeña kernels as precooked and ready to use. Walmart Canada likewise lists a ready-to-use whole canned white hominy product. Other local Spanish or French-language listings do not state the processing state. Allzone’s Canadian bulk page distinguishes dried raw kernels from processed hominy, but it is a quote-only umbrella listing with no confirmed lot or Québec French display. CONABIO and INIFAP describe pozole use across more than one maize race; the Mexican government article’s indexed wording spans precooked and dry states, though its page returned HTTP 403.

The shared ledger retains the existing unresolved candidate, its prior source records, and its `not_yet_researched` measurement/substitution states. Root added five current/regional source records and one R318 unresolved decision. Package sizes remain listing-specific evidence only; no measurement observations, density, unit mapping, conversion, form, recipe link, yield, or substitution were added. Existing `hominy corn / maïs lessivé`, hominy grits, corn grits, cornmeal, masa harina, and white canjica maize remain separate.

The R318 review records no exact picker owner for `pozole`, `posole`, `pozolero`, or the dry-product French variants. It also reports zero candidate-related matches across 114 manifest-listed recipe files and 1,123 structured ingredient rows. The two corn-related recipe lines remain generic frozen kernels and corn on the cob.

## Review records

- Proposal: [R318 product-identity boundary review](../../proposals/wp03-section-f-pozole-corn-product-identity-boundary-review-r318-20261016.md)
- Existing unresolved candidate: [research ledger](../../research-ledger.v1.json)
- Plan anchor: `docs/RecipeBook-global-ingredient-catalog-plan.txt`, WP03 Section F corn-product aggregate

## Static validation

Static validation passed: bundled-package validation and normalization check, generated-catalog freshness check (1,673 references), research-ledger schema validation, new source-ID ownership, UTF-8/no-BOM, scoped links/whitespace, picker-term ownership, and the manifest corpus scan. Totals remain 1,673 references and 127 forms; the ledger has 2,020 records, 8,966 source entries, 7,601 distinct source IDs, and 6,351 distinct URLs; the bundle has 114 recipes and 1,123 ingredient rows. No app tests, Gradle tasks, emulator checks, or deployment were run because this change only adds database JSON research data and documentation under `AGENTS.md`.
