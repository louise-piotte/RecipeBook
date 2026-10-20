# WP03 Section F creamy buckwheat hot cereal integration

- **Added:** identity-only `creamy buckwheat hot cereal / céréales chaudes crémeuses au sarrasin` as `ingredient-ref-creamy-buckwheat-hot-cereal` in `GRAIN_AND_CEREAL`.
- **Naming:** Bob’s Red Mill’s 2026 Canadian French product list gives `Céréales chaudes crémeuses au sarrasin biologique`; the catalog display omits the product-specific organic qualifier. OQLF supports the base term `sarrasin`, not the full product compound. The Québec retailer listing corroborates local product context but has singular adjective agreement in its title.
- **Boundary:** kept it separate from buckwheat flour, flakes, puffed buckwheat, roasted dry groats, mixed-grain hot cereals, and prepared kasha. Added no aliases so the hot-cereal qualifier stays explicit.
- **Recipe and behavior:** the full 114-recipe, 1,123-row corpus has no candidate or boundary phrase hits. No recipe links, forms, measures, density, unit mappings, conversions, cooking yields, or substitutions were added. Measurement research records no transferable value; substitution research remains not yet researched.
- **Sources:** five sources are attached to the accepted ledger record: Bob’s Red Mill product page and 2025/2026 Canadian product lists, La Moisson’s Québec listing, and the OQLF GDT entry for `sarrasin`. See the [identity review](../../proposals/wp03-section-f-creamy-buckwheat-hot-cereal-identity-review-20261012.md).

## Static validation

- Seed package normalization and validation passed; ingredient references and generated Kotlin index are current at 1,255 references.
- Research ledger schema validation passed: 1,564 records, 5,472 source entries, 4,510 distinct source IDs, and 8 unit conversions.
- Picker phrase ownership passed: the English and French displays each have one active owner; the other audited candidate phrases have none. No matching phrase was found in forms or legacy import identities.
- Recipe corpus audit passed: 114 files, 1,123 ingredient rows, 753,736 recipe-file bytes; no candidate or boundary phrase hits.
- Reference SHA-256: `d05f2d2ef59a9862ab5cbe69501e857f5ee7dfe0747e88284447b64d1e1fdcf8`.
- Forms SHA-256: `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b`.
- Manifest SHA-256: `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`.
- Recipe corpus digest (manifest-relative path, NUL, recipe bytes, NUL in manifest order): `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3`.
- Legacy import identities SHA-256: `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f`.
- Research ledger SHA-256: `fefdb8d64fd00372f35fbcb29b79211221b7f439d280233ac5af05be94b1b157`.

No app tests or emulator checks were run because this change only adds ingredient catalog database data under `AGENTS.md`.
