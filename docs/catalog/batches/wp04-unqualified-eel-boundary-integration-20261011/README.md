# WP04 Section P — Unqualified eel boundary integration

## Result

Recorded unqualified `eel / anguille` as the unresolved ledger candidate
`candidate-unqualified-eel-identity-boundary`. CFIA lists `Eel / Anguille` for multiple *Anguilla*
species and separately lists `Conger Eel`; OQLF scopes Québec food-fish `anguille` to American eel.
Québec and Canadian product listings show eel, unagi, and anago products but do not provide the
scientific species needed to connect them to the active American eel identity.

The existing `ingredient-ref-american-eel` remains unchanged. No generic reference, alias, recipe
link, form, measurement, conversion, yield, or substitution was added. Searching `eel` still matches
the word in the species row's `American eel` display name. The proposal audit found no eel terms in
the 114 bundled recipes / 1,123 ingredient rows.

## Evidence

- CFIA Fish List rows use `Eel / Anguille` for *Anguilla dieffenbachii*, *A. japonica*, and *A.
  rostrata*, and list `Conger Eel` for *Conger* spp. CFIA guidance explains that the Fish List
  supplies English and French common names for Canadian fish labeling. These are labeling names,
  not recipe alias rules.
- OQLF's food-fish entry maps Québec `anguille` to American eel, *Anguilla rostrata*; this supports
  the existing species row rather than every product called eel.
- Les Trésors du fleuve describes Québec eel fishing and smoked, preserved, and sausage products, but
  supplies no scientific species. Frandon lists smoked sliced unagi eel. Daily Seafood separately
  lists roasted unagi and frozen anago/conger fillets; its descriptions are seller terminology, not
  taxonomic evidence.

The full source register and query-boundary audit are in
[`wp04-unqualified-eel-identity-boundary-review-20261011.md`](../../proposals/wp04-unqualified-eel-identity-boundary-review-20261011.md).

## Package state

- 1,027 ingredient references; 70 forms; 114 recipes / 1,123 ingredient rows.
- 1,315 research-ledger records; 4,262 source entries; 3,499 distinct source IDs; 8 unit conversions.
- 75 legacy candidates.
- Active ingredient-reference and recipe data were unchanged.

## Validation

- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` — passed.
- `python3 tools/ingredient_catalog/normalize_seed_ingredient_references.py --check` — passed.
- `python3 tools/ingredient_catalog/generate_bundled_ingredient_catalog.py --check` — passed.
- `validate_research_ledger()` — passed with 0 errors.
- Targeted `git diff --check` — passed for this batch's changed files.
- No tests or emulator run were needed because this change only adds database JSON data, as stated in
  `AGENTS.md`.

## SHA-256

| File | SHA-256 |
| --- | --- |
| `ingredient-references.v1.json` | `b63ae0206120f62b9879dfed2eee0bf0af43c2057981f1154c5fd1475dc67e0b` |
| `research-ledger.v1.json` | `e790a4c3753d81700b2a66b853e63adf6dda657474be66469773da1f1db49e4d` |
| `BundledIngredientCatalog.kt` | `7382e4c44debf0cac65418a5a6afb15a24ca545cefeaee7108f13341e3c88a2d` |
