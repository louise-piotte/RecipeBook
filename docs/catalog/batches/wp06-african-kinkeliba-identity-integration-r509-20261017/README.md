# WP06 African kinkeliba identity integration — R509

**Date:** 2026-10-17  
**Review:** [R509 proposal](../../proposals/wp06-african-next-regional-review-r509-20261017.md)

## Catalog change

Added identity-only `dried kinkeliba leaves / feuilles de kinkéliba séchées` as `HERB` under `ingredient-ref-kinkeliba-leaves`. The English display follows a Montréal-facing dried-leaf listing. The descriptive Québec French display remains provisional; no OQLF culinary term was located. Both alias lists are empty because the common name is already searchable in the displays.

Kept the prepared infusion separate from the dry leaves. `bush tea`, `tea/thé`, and beverage names are not aliases. Fresh leaves and other plant parts, extracts, and blends remain outside the identity. Added no forms, recipe links, densities, measures, mappings, conversions, yields, or substitution rules.

The Dakar study reports separate standardized infusion batches of 18 g and 19.5 g dried leaves per litre. These are study-specific preparation quantities, not reusable measures for the ingredient; the ledger records the evidence and limitations in decision text only. Retail leaf counts have no corresponding mass and do not establish a mapping.

## Evidence and validation

The [proposal](../../proposals/wp06-african-next-regional-review-r509-20261017.md) records ownership, source-ID/URL checks, picker projection, and a full scan of 114 recipes / 1,123 ingredient rows with no candidate hits. Evidence includes Kew taxonomy, PROTA regional use, the [Dakar food-use study](https://www.ajfand.net/Volume17/No4/Moussa15710.pdf), [TERMIUM Plus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=1&index=frt&lang=eng&srchtxt=KINKELIBA), and current Montréal retail wording from [KAWĀLI](https://kawali-traditions.com/en/products/kinkeliba-feuilles-sechees-30g) and [Maad MTL](https://maadmtl.com/fr-us/products/kinkeliba).

Bundled seed normalization/check and validation passed. The generated Kotlin reference index is current at 1,786 references. Ledger schema and source ownership validation passed with the package validator; scoped whitespace checks passed. No software tests, build, emulator check, or deployment were run because this change only adds database JSON data and regenerates its catalog index, per `AGENTS.md`.

Post-integration snapshot: 1,786 references / 143 forms / 56 legacy candidates; 2,143 ledger records / 9,835 source entries / 8,323 distinct source IDs / 7,033 distinct URLs.
