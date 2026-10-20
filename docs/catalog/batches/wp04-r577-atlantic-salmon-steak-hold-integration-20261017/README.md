# WP04 Section P R577 — Atlantic salmon steak hold

Date: 2026-10-17

## Decision

Hold the proposed Atlantic salmon steak form outside active catalog data. Metro's current fresh SKU 208205 has paired English and French routes: `Fresh Atlantic Salmon Steak` and `Darne de saumon Atlantique frais`. Both identify *Salmo salar* and show an average of about 250 g for that SKU. This product-specific amount does not establish a standard steak mass or recipe serving.

The OQLF entry supports `darne de saumon` as the Québec French name for a transverse slice of a large fish and lists `salmon steak` as the English equivalent. It discourages `steak de saumon`. With one Atlantic-only form, the current picker would make unqualified `salmon steak` and `darne de saumon` queries return Atlantic salmon alone. The full bundle has no salmon-steak demand.

The separate frozen Metro SKU 247827 is excluded from Atlantic-salmon evidence: its “Atlantic Salmon” title conflicts with its listed taxon, *Oncorhynchus mykiss* (rainbow trout). Its state and package data are not transferred to the fresh 208205 product.

No active form, alias, match term, identity, ledger source or decision, measure, recipe link, conversion, yield, or substitution was added. The existing Atlantic-salmon and generic salmon-fillets references remain unchanged.

## Sources

- [Metro, Fresh Atlantic Salmon Steak, SKU 208205](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/salmon-trout-tuna/fresh-atlantic-salmon-steak/p/208205) and [French listing](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/saumons-truites-et-thons/darne-de-saumon-de-l-atlantique-frais/p/208205): paired retailer titles, *Salmo salar*, Canadian farmed origin, and SKU-specific 250 g average.
- [OQLF, darne de saumon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298295/darne-de-saumon): preferred Québec cut term, English `salmon steak`, and the discouraged French wording `steak de saumon`.
- [Metro, Frozen Atlantic Salmon Steaks, SKU 247827](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/frozen-atlantic-salmon-steaks/p/247827): conflicting title and *Oncorhynchus mykiss* listing metadata; excluded from the Atlantic-salmon form evidence.

## Files updated

- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- R577 proposal status and this integration README

## Verification

- Reproduced the phrase-first picker projection from `IngredientSearch.kt`; the generic singleton collisions are documented in the proposal.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; found no salmon-steak demand or linked rows.
- UTF-8/no-BOM, local-link, final-newline, and scoped whitespace checks passed.
- No software tests, app build, emulator run, or deployment were needed for this documentation-only hold under `AGENTS.md`.

WP04 Section P remains open. See the [R577 proposal](../../proposals/wp04-section-p-next-gap-review-r577-20261017.md).
