# R470 — breaded calamari rings

Added identity-only `breaded calamari rings / rondelles de calmar panées` as `ingredient-ref-breaded-calamari-rings`, category `PROTEIN`, with empty aliases, null density, and empty unit mappings. The entry represents a named market product group, not a universal breading formula, squid species, storage condition, or cooking state.

Toppits names a Canadian retail product “Wild Caught Breaded Calamari Rings” and describes that SKU as uncooked and oven-ready. Mayrand’s current Québec frozen-seafood catalog distinguishes `Rondelles de calmar` from `Rondelles de calmar panées surgelées` and from other seasoned or tentacled products. High Liner’s Canadian foodservice listing supports the broader breaded calamari product boundary but includes tentacles, so it is not treated as a ring-only product. The existing OQLF `calmar / squid` source is reused for the base mollusc term. See the [R470 proposal](../../proposals/wp04-section-p-next-seafood-review-r470-20261017.md) for the source register and limitations.

The row stays separate from `ingredient-ref-calamari` and its `ingredient-form-calamari-rings`, which means cut shape only. The picker adds the two exact breaded phrases; broad `calamari` and `calmar` queries return both identities, `squid` stays on raw calamari, and exact `calamari rings`, `squid rings`, and `rondelles de calmar` queries continue to return the existing reference with the ring-cut form.

Recipe 023 describes Panko-crusted calamari and hand-breading in its instructions, but its structured line remains 140 g sliced raw calamari linked to the cut-only ring form. It is not a request for a purchased breaded product and was not relinked. Across all 114 manifest-listed recipes and 1,123 ingredient rows there is no structured breaded-calamari product request.

No forms, measures, density observations, mappings, conversions, package yields, recipe links, or substitutions were added. Toppits and Mayrand package sizes, High Liner case formats, and its nutrition panel remain product-specific.

Static checks passed: bundled seed normalization and validation; generated Kotlin catalog freshness at 1,753 references; ledger schema and source-ID/URL ownership; exact phrase/form picker projection; complete recipe scan; UTF-8 without BOM and escaped Unicode in database JSON; local Markdown links; and scoped whitespace. No app tests, build, emulator run, or deployment were performed because this is a database-JSON data addition under `AGENTS.md`.

Post-integration snapshot: 1,753 ingredient references / 141 forms; 2,112 ledger records / 9,624 source entries / 8,171 distinct source IDs / 6,884 distinct source URLs; 114 recipes / 1,123 ingredient rows. Section P remains open.
