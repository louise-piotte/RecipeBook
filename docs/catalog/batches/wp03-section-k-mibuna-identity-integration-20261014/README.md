# WP03 Section K Mibuna identity integration

## Decision

Added identity-only `mibuna / mibuna` as `ingredient-ref-mibuna` in `VEGETABLE_AND_AROMATIC`.
The only alias is the source-backed English `mibuna mustard`; French aliases remain empty. The
Québec agronomy report and Gaia’s French-facing seed catalog support `mibuna` as a provisional
borrowed fr-CA crop name. An independent review agreed with that usage while noting that neither
source is a fresh-produce package or an OQLF ruling.

Keep `Japanese mustard`, `Japanese mustard greens`, broad mustard wording, and generic `mustard
greens` unassigned. `mibuna mustard` expands the already broad `mustard` query by one candidate;
`mustard greens` remains unchanged. Keep Mibuna distinct from Mizuna and Komatsuna.

## Measurements and substitutions

The 2023 Québec trial and Canadian seed listings document crop identity and culinary use, but they
do not establish a package weight, serving, density, cup conversion, or preparation yield. No
matching recipe appears in the 114-file / 1,123-row bundled corpus. No form, measure, mapping,
conversion, yield, bundled recipe link, or active substitution was added.

## Evidence and review

The R120 proposal records Québec agronomy, horticulture, Canadian seed listings, and the bounded
OQLF/marketplace searches with their limits.

See [the proposal](../../proposals/wp03-section-k-mibuna-identity-gap-review-r120-20261014.md) and
[the catalog plan](../../../RecipeBook-global-ingredient-catalog-plan.txt). The wider Section K
leafy-green and brassica sweep remains open.

No app, Gradle, instrumentation, or emulator tests were run: this integration adds database JSON
data and documentation under the updated `AGENTS.md` rule.
