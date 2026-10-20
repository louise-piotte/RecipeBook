# WP02 Section A7 R663 — roasted wheat malt flour package-scope hold

## Decision

Keep IREKS AROMA WHEAT MALT K's values off the existing generic `ingredient-ref-roasted-wheat-malt-flour` ledger row. The IREKS page describes a specifically named **slightly roasted wheat malt flour**, a 25 kg paper bag, and a 1–5% flour-basis professional dosage. These statements support that IREKS product only. The active row comes from a separate bilingual ingredient declaration that names roasted wheat malt flour without a grade or a process description. [IREKS product page](https://www.ireksnorthamerica.com/products/product-search/detail/ireks-aroma-wheat-malt-k)

The accepted R58 review already kept `slightly roasted wheat malt flour` and the corresponding French wording out of the active row because sources do not establish equivalence among toasted, slightly roasted, and unqualified roasted wheat-malt products. R663 applies that boundary to the IREKS package and dosage values. Keep the current measurement state `not_yet_researched`, substitution state `not_yet_researched`, and observations empty. The IREKS bag is not an active package-yield record, and the dosage is not a household amount, density, conversion, recipe quantity, or substitution ratio. [R58 boundary review](../../proposals/wp02-a7-toasted-wheat-malt-flour-equivalence-boundary-review-20261013-round58.md)

## Data disposition

No catalog, form, package-yield, substitution, recipe, candidate, or ledger source/observation data changed. The existing Diversi Foods declaration source and active bilingual display remain unchanged. No IREKS source ID or URL owner was added to the ledger.

The bundle has no matching recipe demand. Static checks reviewed the source boundary, active row, names and aliases, picker projection, 56 legacy candidates, all 114 manifest-listed recipes / 1,123 ingredient rows, and documentation links/encoding. No software tests, build, emulator run, or deployment were needed for this documentation-only hold.

See the [R663 review](../../proposals/wp02-a7-roasted-wheat-malt-flour-package-review-r663-20261018.md). Section A7 remains open.
