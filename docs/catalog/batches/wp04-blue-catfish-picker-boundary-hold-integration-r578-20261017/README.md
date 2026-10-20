# WP04 Section P R578 — Blue catfish picker-boundary hold

Date: 2026-10-17

## Decision

Keep blue catfish (*Ictalurus furcatus*) outside active references and the shared ledger for this review. CFIA supplies the bilingual species name `Blue Catfish / Poisson-chat bleu`, but that French display would make the current unqualified `poisson-chat` query resolve to Blue Catfish alone. OQLF's 1996 entry maps unqualified `poisson-chat` to English `catfish` and displays the Latin field `Ammeriurus nebulosus`, not *I. furcatus*. CFIA also labels *Ictalurus punctatus* `Channel Catfish / Poisson Chat`; Metro's current paired routes for SKU 219018 call it *I. punctatus* and report about 200 g per item. Those facts make the generic French query unsafe for the proposed identity.

The Metro English and French pages are routes for one Cajun-seasoned Channel Catfish SKU, not evidence of a Blue Catfish product. The approximately 200 g amount remains specific to SKU 219018. No blue-catfish product matched the reviewed Québec retail sources, and the 114-recipe / 1,123-row bundle has no matching demand. No identity, candidate, alias, form, source record, measurement, recipe link, conversion, yield, or substitution was added. Preserve existing channel-catfish, bullhead, and other fish identities; keep the broad Section P finfish checklist open.

## Sources

- CFIA's [Blue search results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue&wbdisable=true) identify *Ictalurus furcatus* as `Blue Catfish / Poisson-chat bleu`. The contamination-risk grouping in that table is not used as recipe or handling guidance.
- The [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) and its search-indexed [Channel Catfish result](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Channel%20Catfish) show *Ictalurus punctatus* under `Channel Catfish / Poisson Chat` and additional catfish-name rows. The source supports name ambiguity, not a complete family taxonomy.
- The [OQLF GDT entry for poisson-chat](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8395497/poisson-chat) is dated 1996, gives the English equivalent `catfish`, and displays `Ammeriurus nebulosus` in its Latin field. Its age and spelling are retained as shown; no taxonomic correction is inferred.
- Metro's [English](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/cajun-catfish-fillet/p/219018) and [French](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-blancs/filet-de-poisson-chat-aux-epices-cajun/p/219018) routes are paired listings for product 219018. Indexed captures identify *Ictalurus punctatus* and show an approximate 200 g each; the title and amount do not establish a Blue Catfish product or a general serving.
- USDA FSIS's [Catfish from Farm to Table](https://www.fsis.usda.gov/food-safety/safe-food-handling-and-preparation/meat-fish/catfish-farm-table) distinguishes Blue Catfish from Channel Catfish in the US market and discusses their relative size and edible-meat percentages. It supplies no transferable household yield or substitution rule and does not establish Québec availability.

## Picker and corpus review

The checked-in `IngredientSearch.kt` projection uses complete normalized phrases before substring fallback. With the hypothetical identity `Blue catfish / Poisson-chat bleu` and no aliases, `Blue catfish` and `Poisson-chat bleu` would each return Blue Catfish; `catfish` would expand from Brown Bullhead and Channel Catfish to three results; bare `poisson-chat` / `poisson chat` would become a Blue-Catfish singleton despite the source ambiguity. Keep this boundary held until picker behavior can preserve the ambiguous family query and Québec market evidence supports the species-specific display.

The proposal's manifest-ordered scan covered all 114 recipe files and 1,123 ingredient rows, including the related catfish and barbue terms, and found zero matching files or rows. The SKU amount is excluded from any reusable measurement, and shared family words or US food-use evidence do not support a cross-species substitution.

## Files updated

- `docs/RecipeBook-global-ingredient-catalog-plan.txt`
- `roadmap.md`
- R578 proposal and this integration README

No shared catalog or ledger data changed.

## Verification

- Source names and the OQLF/CFIA boundary were checked against available official pages; Metro's paired product details were available in current indexed captures while direct page retrieval was blocked.
- Static picker projection and full bundled-recipe scan are documented in the proposal.
- UTF-8/no-BOM, local-link, final-newline, and scoped whitespace checks passed.
- No app tests, build, emulator run, or deployment were needed for this documentation-only hold.

Section P remains open. See the [R578 proposal](../../proposals/wp04-section-p-next-gap-review-r578-20261017.md).
