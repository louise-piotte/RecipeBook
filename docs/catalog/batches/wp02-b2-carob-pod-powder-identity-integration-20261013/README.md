# WP02 B2 carob pod powder identity (2026-10-13)

Added identity-only `ingredient-ref-carob-powder` as **carob powder / poudre de caroube**, category `CHOCOLATE_AND_CANDY`, for dry human-food powder made from carob pods. The row has no aliases. TERMIUM pairs `carob powder` with `poudre de caroube`, and that French wording appears on a Canadian product listing.

Added French `farine de caroube` to the existing `locust bean gum / gomme de caroube` aliases. Left English `carob flour` unallocated. Canadian retail evidence uses it for pod powder, while TERMIUM also lists it as a gum synonym; the bundled-reference validator requires unique alias ownership, so assigning it to either row alone would hide one documented meaning.

Added a verified research-ledger record for the powder, naming evidence, the accepted French gum alias, and the unresolved English term. No aliases beyond those named above, forms, density, unit mappings, measures, recipe links, conversions, yields, or substitutions were added. The 114-recipe / 1,123-row corpus has no carob demand. Reference normalization, package normalization and validation, generated-index freshness, exact-name ownership, recipe demand, UTF-8/no-BOM, local-link, and whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

See the [review proposal](../../proposals/wp02-b2-carob-pod-powder-identity-review-20261013-round64.md), [TERMIUM caroube results](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=1&index=frb&lang=eng&srchtxt=CAROUBE), and [OnlineOrganics product listing](https://onlineorganics.ca/fr/products/poudre-de-caroube-rotie-biologique).
