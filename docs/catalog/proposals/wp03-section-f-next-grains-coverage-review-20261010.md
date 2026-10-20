# WP03 Section F: Brown-Top Millet Identity and Québec French Review

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** Root reviewed the packet and recorded `candidate-brown-top-millet` in the research ledger. No canonical ingredient reference, form, legacy candidate, recipe, measurement, or substitution data was added.
- **Scope:** one not-yet-reviewed Section F food-grain candidate, brown-top millet (*Urochloa ramosa*). Previously reviewed sushi rice, pot/Scotch barley, farro, hominy, pozole corn, grits, and integrated grain identities are outside this packet.
- **Disposition:** the food-grain identity is supported, but keep a new active reference on hold until an exact fr-CA display is reviewed. The current French candidates are attested outside Québec and do not converge.

## Candidate identity and boundary

The current FSSAI cereal standard applies to whole or dehulled millets and lists **Brown top (Korale) — *Urochloa ramosa*** [S01]. This supports a human-food grain identity for the edible grain of that species, separate from the already active generic and species-specific millet identities. The Indian Institute of Millets Research handbook uses the form *brown-top millet*, records *Brachiaria ramosa* and *Panicum ramosum* as scientific-name variants, and lists Korale and Andukorralu as regional names [S02]. Use FSSAI’s newer *Urochloa ramosa* name as the taxon anchor; retain older names only as source context.

Canadian retail evidence independently identifies a food product sold as “Brown Top Millet grains” [S03]. The candidate scope is **food-grade brown-top millet grain**, not the plant as a whole, planting seed, forage, bird feed, flour, or another processed grain product. The IIMR handbook also discusses growing, threshing, and seed processing; those agronomic statements do not define a culinary conversion or household measure.

| Candidate field | Proposal if the French-name gate is later cleared | Current disposition |
| --- | --- | --- |
| Stable ID | `ingredient-ref-brown-top-millet` | Do not allocate yet. |
| English display | `brown top millet` | Supported by the current food standard and Canadian retail wording. |
| fr-CA display | No approved value | Hold. `millet brun` and `millet à tête brune` are outside-Québec candidates, not approved Québec labels. |
| English aliases | `brown-top millet`, `browntop millet`; consider regional `Korale` only if the coordinator wants that regional query in the picker | Do not activate while the bilingual row is held. |
| French aliases | None proposed | Do not activate either French candidate without independent Québec review. |
| Category and numeric fields | `GRAIN_AND_CEREAL`; null density; empty unit mappings | No active row or numeric data until the name is approved. |

`Korale` is paired with brown top in the FSSAI standard and identified as a Kannada vernacular name by IIMR [S01–S02]. It is not a French term. Do not import `Andukorralu` or `Hari Kangni` as aliases from a single regional or retail source; their wider scope and spelling are not established here. Keep the brown-top candidate separate from generic `millet / millet`, pearl millet, common millet, foxtail millet, finger millet, kodo millet, and the other active species rows.

## Québec French naming review and hold rationale

The OQLF’s generic *millet* entry says that *millet* can group multiple species and can also be used as an abbreviation for particular species [S04]. It does not name brown-top millet. No dedicated OQLF or TERMIUM entry for this species-specific grain was located during this review.

Two French-language sources provide different candidate labels: a French millet guide uses **millet brun** for *Urochloa ramosa* and gives Korale as another name [S05]; a French Crop4HD project page lists **millet à tête brune** among its crop names [S06]. Neither source is a Québec terminology authority or a Québec product listing. This difference also makes the literal `millet brun` a risky global label: without species context, it can read as a color description. Do not choose either phrase as an active display or alias yet, and do not translate the English name mechanically.

**Hold decision:** retain the verified food-grain concept as a research candidate, but do not allocate a bilingual canonical row until a Québec source or independent Québec terminology review establishes one exact fr-CA display for the food grain. A source that only describes *Urochloa ramosa* as a crop or uses French in a non-Québec market is not enough to close that gate.

## Recipe demand and catalog collision audit

The current split package has **887 active ingredient references**, **48 ingredient forms**, **114 manifest-listed recipes**, and **1,123 ingredient rows**. All manifest-listed recipes and ingredient rows were scanned with case-folded, accent-folded, punctuation-normalized whole-phrase matching for `brown top millet`, `brown-top millet`, `browntop millet`, `millet brun`, `millet à tête brune`, `Korale`, `Urochloa ramosa`, `Brachiaria ramosa`, `Andukorralu`, and `Hari Kangni`.

- **Recipe results:** zero full-recipe hits and zero ingredient-row hits. No recipe link, amount, form hint, or text change is proposed.
- **Current catalog results:** no active reference or form has an exact normalized key matching the candidate names, variants, regional names, or botanical names above. The proposed ID is unused. The separate active `millet` reference is a broad identity, not an exact collision with the qualified candidate name.
- **Research records:** no brown-top candidate or source record was found in the current research ledger, legacy-import candidates, or earlier WP03 proposal files. The candidate is not an already integrated identity.

This is an exact-key and source-text audit, not a claim that a live picker has been tested. If integration is later approved, verify that the qualified English and French displays resolve to the new identity while generic `millet` continues to retain its broad results.

## Measurements, forms, conversions, and substitutions

- **Measurements and density:** leave `defaultDensity` null and add no serving mass or volume mapping. The 500 g package size on the Canadian retail page is a package label, not a cup conversion or density [S03]. FSSAI grain-quality limits are regulatory specifications, not recipe measures [S01].
- **Forms and yields:** add no `IngredientForm`, dry/cooked form, dehulled form, cooking yield, or preparation conversion. The standard’s whole/dehulled scope establishes product eligibility, not a need for catalog preparation-state forms. IIMR’s planting, seed-processing, and field-yield figures are not culinary yields [S02].
- **Substitutions:** propose no global or contextual rule. Neither the identity sources nor the retail listing establish an interchangeable substitute or ratio. Leave substitution research `not_yet_researched` if a candidate ledger row is later created.

## Sources

Source IDs are local to this proposal; no source entries were added to the shared research ledger. Sources were checked on 2026-10-10.

| Source ID | Source and scope | Supports / does not support |
| --- | --- | --- |
| `WP03-BTM-20261010-S01` | Food Safety and Standards Authority of India, [Food Safety and Standards (Food Products Standards and Food Additives) Regulations, Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 dated 2025-05-07, §2.4.6(1)–(2), PDF pp. 16–17. | Current official Indian standard says the section applies to whole or dehulled millets and lists `Brown top (Korale) — Urochloa ramosa`. This is the main food-grain/species anchor; it is not a Québec naming source, culinary measure, or substitution source. |
| `WP03-BTM-20261010-S02` | ICAR–Indian Institute of Millets Research, [Latest Millet English Book](https://www.millets.res.in/farmer/Latest_Millet_English_Full_Book_2020.pdf), 2020, chapter 13, pp. 57–58. | Uses `Brown-top Millet`, lists *Brachiaria ramosa* and *Panicum ramosum*, and gives Korale (Kannada) and Andukorralu (Telugu). It is an agronomy and crop-processing handbook, not a consumer-label or Québec terminology authority; its field, seed, and processing quantities are not recipe data. |
| `WP03-BTM-20261010-S03` | Shastha Canada, [Brown Top Millet grains (500 Gms)](https://shasthacanada.com/collections/millet-grains-grits/products/shastha-brown-top-millet-500-gms). | Current Canadian retail product title confirms a human-food grain listing and its marketed English name. The listing’s package size and regional-name text do not establish a density, Québec French label, or general alias set. |
| `WP03-BTM-20261010-S04` (reused OQLF evidence) | OQLF, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), updated 2010. | Says generic *millet* covers multiple species and can abbreviate a species name. It does not identify brown-top millet or support `millet brun` as its Québec name. Reuse as terminology context; do not duplicate it in the ledger. |
| `WP03-BTM-20261010-S05` | SimplyMillets, [Guide des millets](https://simplymillets.com/fr), French-language page, section “Explorer les 9 millets.” | Labels *Urochloa ramosa* `Millet brun / Korale`. This is French guide wording outside Québec, so it is only a candidate phrase, not a Québec display recommendation. |
| `WP03-BTM-20261010-S06` | Alliance Bioversity International / CIAT, [Crops4HD project page](https://alliancebioversityciat.org/fr/projets/crops4hd-consommation-resiliente-cultures-orphelines-produits-dietetiques-sains), French-language crop list. | Uses `millet à tête brune` among French crop names. It is a broad international research-project list, not a Québec food-product label or terminology decision. |
| `WP03-BTM-20261010-S07` | Indian Grocers Canada, [S&V BrownTop Millet](https://indiangrocerystore.ca/products/s-v-browntop-millet), product page, Burlington, Ontario. | Current grocery listing writes `BrownTop` as one word and categorizes the product under grocery/nuts and millets. Supports the orthographic variant only; it does not independently establish species or Québec French wording. |

## Acceptance checks for a future integration packet

1. Keep the identity scoped to edible food-grade whole or dehulled grain of *Urochloa ramosa*; do not merge it with generic millet or another millet species.
2. Do not allocate `ingredient-ref-brown-top-millet` until a Québec review selects one exact fr-CA display. Record why any competing French wording is rejected or retained.
3. If approved, use `brown top millet` as the English display. Add `brown-top millet` and `browntop millet` only as source-backed orthographic variants. Treat `Korale` as optional and regional; do not add `Andukorralu`, `Hari Kangni`, or any generic `brown millet` alias without further evidence.
4. Keep planting seed, forage, bird/feed use, flour, flakes, and other processed products out of this row.
5. Add no forms, recipe links, default density, unit mappings, serving values, cooking yields, conversions, or substitutions from these sources.
6. Re-run the exact normalized-key and complete recipe/ingredient-row scans against the integration-time package, then verify the final English and fr-CA picker terms.

## Review disposition

**Keep the candidate on hold for Québec French naming.** The food-grain identity has good species and food-scope support, but the available French labels (`millet brun` and `millet à tête brune`) are not Québec-validated and point to different wording. Do not change the catalog, recipe links, measurements, forms, or substitution data from this packet.
