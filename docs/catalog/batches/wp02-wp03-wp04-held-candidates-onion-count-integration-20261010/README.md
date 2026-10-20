# WP02 / WP03 / WP04 Candidate and Portion Review

Date: 2026-10-10

## Outcome

Recorded three held ingredient candidates and one source-specific count-weight observation in `docs/catalog/research-ledger.v1.json`.

- `candidate-malanga-corm-flour`: edible whole-corm flour from *Xanthosoma sagittifolium*. English `malanga flour` is attested, but the exact Québec French flour name remains unconfirmed.
- `candidate-xanthosoma-corm-starch`: extracted starch from a sample identified only as *Xanthosoma* sp. The study does not identify a species or establish a Québec product name.
- `candidate-brown-top-millet`: edible *Urochloa ramosa* grain. The food identity and English product name are supported; `millet brun` and `millet à tête brune` remain non-Québec French candidates, not approved displays.
- `ingredient-ref-onion`: recorded USDA ERS TB-1927's historical source assumption of one raw medium onion (2½-inch diameter) = 110 g. The source does not label the value edible or as-purchased. Kept the mass basis unresolved and runtime count mapping inactive.

No active ingredient reference, alias, form, density, unit mapping, recipe link or text, reusable yield, conversion, or substitution was added. No app or generated catalog code changed.

## Source decisions

- The OQLF `malanga` entry identifies *X. sagittifolium* and treats `macabo` as context-specific for a neighboring species in Cameroon. The Québec marketplace's mixed title `Farine de macabo (colocase-malanga)` does not identify the botanical ingredient. The whole-corm flour candidate therefore remains held. The extraction study's *Xanthosoma* sp. sample is retained at genus scope rather than promoted as `malanga starch`.
- FSSAI's 2025 cereal standard lists brown top (Korale) as *Urochloa ramosa* within human-consumption millets. Canadian listings attest the English market name. OQLF's generic `millet` entry does not supply a species-specific French name; international French sources use different candidate phrases. The active picker row remains withheld pending Québec review.
- USDA ERS TB-1927 Appendix A, Table A-2 gives one medium raw onion (2½-inch diameter) as 110 g and lists 10% inedible separately. The ledger preserves the 110 g assumption without applying the refuse percentage or deriving a second mass. Recipe `015#2` remains `2 onions` with its stored `medium onion` unit and has no runtime conversion.

## Proposal packets

- [WP02 Xanthosoma flour and starch review](../../proposals/wp02-next-flour-starch-coverage-review-20261010.md)
- [WP03 brown-top millet review](../../proposals/wp03-section-f-next-grains-coverage-review-20261010.md)
- [WP04 medium-onion count review](../../proposals/wp04-next-count-edible-portion-review-20261010.md)

## Verification

The research-ledger JSON was rewritten with stable two-space formatting, escaped non-ASCII characters, UTF-8 without BOM, and a trailing newline. Repository package/ledger validation and whitespace checks are pending for this integration checkpoint. No Android assets or app behavior changed, so no emulator run is required.
