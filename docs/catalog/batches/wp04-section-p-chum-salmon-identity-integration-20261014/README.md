# WP04 Section P R96 — chum salmon identity integration

Reviewed and integrated 2026-10-14. The broader Section P fish and seafood sweep remains open.

## Decision

Added identity-only `chum salmon / saumon kéta` for *Oncorhynchus keta* as
`ingredient-ref-chum-salmon`, category `PROTEIN`, with `keta salmon` as its only alias. CFIA and
OQLF support the species and bilingual name; current Québec product pages use Keta wording. Other
salmon species remain distinct.

Recipe 077#10 remains linked to `ingredient-ref-salmon-fillets-without-skin`. Its unqualified
`salmon fillets` wording does not identify a species. The existing
`candidate-wp04-salmon-species-scope` stays unresolved specifically for that recipe line and no
longer reads as a hold on separately sourced species identities.

Recorded six Health Canada Canadian Nutrient File portions as source-code-specific ledger
observations: two for raw chum salmon, food code 3217, and four for baked/broiled chum salmon, food
code 3158. They do not become default measures, a density, unit mappings, or an edible-yield rule.
No forms, recipe links, conversions, yields, or substitutions were added. The 114-recipe corpus has
no chum/keta matches.

## Integration and validation

- Added one reference and one `ingredient_reference` ledger record; regenerated the Kotlin ingredient
  catalog index. Current counts: 1,431 references, 105 forms, 1,771 ledger records, 63 legacy
  candidates, 114 recipes, and 1,123 ingredient rows.
- Updated the Section P checklist, clarified the existing salmon-scope candidate, and updated the
  review proposal and roadmap.
- Seed-package and reference normalization, ledger schema, generated-index freshness, static picker
  projection, recipe-link preservation, candidate/source ownership, UTF-8/no-BOM, local links, and
  scoped whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the application change only
  adds database JSON data and its generated catalog index under the `AGENTS.md` exception.

See the detailed [R96 review](../../proposals/wp04-section-p-chum-salmon-identity-review-r96-20261014.md).

## Sources

- CFIA's [Fish List query for *Oncorhynchus keta*](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Oncorhynchus%20keta)
  has an indexed result pairing the taxon with `Chum Salmon / Saumon Kéta` and `Keta Salmon`; the
  direct query page was inaccessible to the browser during review.
- OQLF's [saumon kéta entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198949/saumon-keta)
  gives the preferred Québec French term, English equivalent, and Latin name. Fisheries and Oceans
  Canada's [species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/chum-salmon-saumon-keta-eng.html)
  independently identifies *Oncorhynchus keta*.
- Québec-facing listings include [Lufa's frozen individual portion](https://montreal.lufa.com/en/marketplace/partner/organic-ocean-seafood-inc-487),
  [Metro's previously frozen 200 g product](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/fish-filets-steaks/previously-frozen-wild-keta-salmon/p/244867),
  and [Metro's 418 g canned product](https://www.metro.ca/en/online-grocery/aisles/pantry/canned-jarred/fish-seafood/keta-salmon/p/059749902540).
  These seller-specific sizes do not establish reusable measures; Metro showed the selected-store
  items out of stock when reviewed. The [La Mer Keta roe product](https://www.lamer.ca/products/caviar-saumon-keta)
  remains outside the fish-flesh identity.
- Health Canada's [raw chum salmon CNF record, code 3217](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3217)
  reports 198 g per half fillet and a 90 g Food Guide serving. The [baked/broiled record, code 3158](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3158)
  reports 57.5 g per 100 mL flaked, 143.7 g per 250 mL, 154 g per half fillet, and a 75 g Food
  Guide serving. These remain preparation- and food-code-specific ledger observations.
