# WP04 Section P — Haitian smoked-herring chiktay product-boundary review (R179)

- **Reviewed / source-access date:** 2026-10-16.
- **Candidate:** Prepared Haitian *chiktay* made with smoked herring; current Québec-facing names include *Chiktay au hareng fumé* and *Chiktay Joj*.
- **Recommendation:** **Hold** a generic chiktay identity and any herring-specific catalog row until a bundled recipe or a clearer repeatable product scope establishes the intended ingredient.
- **Scope:** One prepared smoked-fish product from the open Section P preserved seafood coverage. This does not reopen plain herring, herring in tomato sauce, kippers, Matjes, rollmops, herring roe, or the distinct chiktay/chiquetaille preparations made with other fish or meat.
- **Proposal-local IDs:** `WP04-SECTIONP-CHIKTAY-HERRING-R179-20261016-S01` through `S05`, plus audit ID `WP04-SECTIONP-CHIKTAY-HERRING-R179-20261016-R01`. IDs are unallocated.

## Product boundary and evidence

Current Montréal/Laval-facing businesses sell named chiktay products made with smoked herring. Phafo calls *Chiktay Joj* a Haitian smoked-herring spread and describes smoked herring with fresh vegetables and Scotch bonnet pepper; the maker says its products are made in Montreal in small batches. Ibiskis Distribution lists a ready-to-eat *Bocal de Chiktay au hareng fumé* and describes chiktay more generally as a preparation made mainly with smoked herring, peppers, hot peppers, and spices. This supports a real local product name and a herring-based variant, but it does not establish one common recipe or processing method across makers. [S01–S02]

The Québec government has also used *chiktay (hareng fumé assaisonné dans l’huile)* for a Montréal retail product. This is useful local product-language evidence for one past product, not a universal definition. The product and ingredient boundaries are visibly variable: current Québec listings include herring chiktay, while MAPAQ has also reported a separate chiktay made with cod. General *chiquetaille* sources describe versions with smoked herring, cod, or chicken. Keep the herring version distinct from other fish/meat variants and do not promote bare *chiktay* or *chiquetaille* as a universal synonym for a particular fish product. [S03]

Health Canada’s smoked-fish guidance distinguishes cold smoking from hot smoking and explicitly treats multi-ingredient smoked-fish foods as a separate product context. The local chiktay pages do not consistently establish a smoking method, salt/cure state, storage conditions, or full ingredient statement. A product name containing *fumé* therefore does not justify assigning a hot-smoked, cold-smoked, shelf-stable, canned, fermented, or oil-packed form. [S04]

## Ownership, collision, and picker audit

Exact and normalized ownership checks covered active reference names/aliases, form labels/match terms, legacy names/aliases, ledger record IDs/source IDs/URLs, and candidate phrases. There is no exact owner for `chiktay`, `chiquetaille`, `chiktay de hareng`, `chiquetaille de hareng`, `smoked herring chiktay`, or the illustrative ID `ingredient-ref-chiktay-herring`. The Phafo, Ibiskis, and MAPAQ source URLs below had no exact ledger owner. No focused earlier chiktay proposal or batch record was found. Existing source reviews that mention herring smoke only distinguish chiktay from raw herring, kippers, or other preserved fish; they do not allocate a chiktay identity. [R01]

| Nearby owner or query | Boundary and likely picker effect |
|---|---|
| `ingredient-ref-atlantic-herring` — *hareng de l’Atlantique* / `Atlantic herring` | Species identity; no evidence assigns every chiktay product to this species. |
| `ingredient-ref-pacific-herring` — *hareng du Pacifique* / `Pacific herring` | Species identity; do not infer Pacific origin from the product name or regional cuisine. |
| `ingredient-ref-herring-fillets-in-tomato-sauce` — *filets de hareng à la sauce tomate* / `herring fillets in tomato sauce` | Separate fish-in-sauce product; not a chopped/spread composite and not a form of chiktay. |
| `ingredient-ref-canned-sardines`, `ingredient-ref-canned-mackerel`, and `ingredient-ref-smoked-salmon` | Separate named finished-food groups; none owns chiktay or its recipe. |
| Broad `herring` / `hareng` queries | Existing phrase results already include Atlantic herring, Pacific herring, and herring fillets in tomato sauce. A hypothetical chiktay display containing “smoked herring” / *hareng fumé* would add another broad result and could make a composite spread appear to be plain smoked fish. |
| Exact `chiktay` | Would be a useful unique query only if the catalog had one stable scope. Current sources also use chiktay for other species and preparations, so an unqualified row would conceal those distinctions. |

The picker normalizes accents and punctuation, prefers complete phrases, then uses substring matching ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Holding the candidate leaves current searches unchanged and avoids turning the phrase *hareng fumé* into a result for a seasoned spread.

The manifest-listed corpus contains **114 recipe files and 1,123 ingredient rows**. A read-only scan of complete recipe JSON and ingredient-row fields for *chiktay*, *chiquetaille*, spelling variants, herring/hareng, and smoked-herring phrases found **zero matching files and zero matching ingredient rows**. No recipe owner, dish role, method, or requested amount supports the row. [R01]

## Numeric, form, and substitution limits

- The Ibiskis 500 ml jar title is a product package declaration; it is not a recipe amount, edible volume, density, or fish-only quantity. No quantitative amount is proposed for Phafo’s product. Add no measure, unit mapping, package conversion, density, or yield.
- Product pages describe different preparations and do not establish one ingredient formula, fish proportion, oil content, salt level, smoked-fish process, readiness/storage state, or universal package form. Do not attach the candidate as a form to Atlantic or Pacific herring, the tomato-sauce herring reference, or any generic smoked-fish identity.
- No source or recipe establishes a safe or equal-amount substitution between chiktay, plain smoked herring, chiktay made from cod, salted/dried fish, kippers, herring in tomato sauce, fish sauce, or another spread. Add no global or contextual rule, warning, recipe-line link, or conversion.

## Source register

Pages were accessed on 2026-10-16. Proposal-local IDs are provenance labels only.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CHIKTAY-HERRING-R179-20261016-S01** | Phafo, [Chiktay Joj — chiquetaille de hareng fumé fort](https://www.phafo.com/products/chiktay-joj) and [About / product range](https://www.phafo.com/). | Current maker page describes a Haitian smoked-herring spread with vegetables and Scotch bonnet pepper; the maker identifies its production as Montreal small-batch. Product description does not provide a complete recipe, species, smoking method, or measurement. |
| **WP04-SECTIONP-CHIKTAY-HERRING-R179-20261016-S02** | Ibiskis Distribution, [Bocal de Chiktay au hareng fumé, 500 ml](https://www.ibiskisdistribution.com/product-page/bocal-de-chiktay-au-hareng-fum%C3%A9-500-ml-16oz) and [company home page](https://www.ibiskisdistribution.com/). | Current Québec-facing listing titles a ready-to-eat herring chiktay jar; the distributor describes chiktay as mainly smoked herring with peppers and spices. The 500 ml is a seller package title, not a reusable ingredient measure; the distributor text is not a standardized product specification. |
| **WP04-SECTIONP-CHIKTAY-HERRING-R179-20261016-S03** | Gouvernement du Québec / MAPAQ, [Avis concernant un chiktay décrit comme hareng fumé assaisonné dans l’huile](https://www.quebec.ca/nouvelles/actualites/details/avis-de-ne-pas-consommer-du-chiktay-hareng-fume-assaisonne-dans-lhuile-vendu-par-lentreprise-la-fraicheur-tropicale-37801). | Official 2022 notice records one Montréal product named CHIKTAY and describes it as smoked herring seasoned in oil. It is historical, lot-specific evidence, not a current package recommendation or general processing definition. |
| **WP04-SECTIONP-CHIKTAY-HERRING-R179-20261016-S04** | Health Canada, [Guidance Document on Ready-to-Eat Smoked Fish and Multi-Ingredient Products Containing Smoked Fish](https://www.canada.ca/en/health-canada/services/food-nutrition/legislation-guidelines/guidance-documents/smoked-fish.html). | Defines cold and hot smoking separately and identifies multi-ingredient foods containing smoked fish as a distinct product category. It does not classify the cited chiktay SKUs or establish their processing/storage conditions. |
| **WP04-SECTIONP-CHIKTAY-HERRING-R179-20261016-S05 (reused URL)** | Government of Canada, [CFIA Fish List and common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list); existing ledger source examples include `WP04-P-PACIFIC-SAURY-20261013-S02` and `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S07`. | Canadian fish-name reference associates common names with species. Used only to preserve species boundaries; no species assignment is inferred for chiktay. The URL is existing ledger evidence; this proposal uses a new, source-specific label. |
| **WP04-SECTIONP-CHIKTAY-HERRING-R179-20261016-R01** | Active references/forms, legacy identities, research ledger, focused proposal/batch archive, manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only candidate ownership, source-URL, picker, and recipe-corpus audit. Candidate IDs remain unallocated. |

## Final disposition

**Hold** generic *chiktay* / *chiquetaille* and the proposed smoked-herring variant outside active references, forms, legacy mappings, and the research ledger. Current Québec-facing makers establish a real herring-based spread, but the same regional name is used for other fish and the product descriptions do not establish a shared recipe or smoke/storage process. A hypothetical herring-specific picker row would collide with broad *herring* / *hareng fumé* searches despite representing a seasoned multi-ingredient spread. The bundle has no demand to choose a narrower scope. Revisit when a recipe selects a named product or stronger evidence supports a stable, non-misleading display and category. Add no identity, alias, form, measurement, conversion, yield, recipe link, or substitution at this review.

## Root integration disposition

Accepted as a hold on 2026-10-16. Generic chiktay and the herring-specific proposal remain outside active references, forms, and the research ledger. No catalog or ledger data changed. See the [R179 integration record](../batches/wp02-wp03-wp04-r179-gap-review-integration-20261016/README.md); Section P remains open.
