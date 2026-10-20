# WP04 Section P R781 — Brown trout whole-fish market boundary review — 2026-10-18

- **Review and source-access date:** 2026-10-18.
- **Packet type:** Proposal-only review of a possible whole-fish form and its Québec food-market boundary.
- **Disposition:** **Hold** `whole brown trout / truite brune entière` outside active form data.
- **Candidate:** A state-neutral `whole_fish` form under the existing `ingredient-ref-brown-trout` identity for *Salmo trutta*.
- **Status:** This proposal changes no shared catalog, ledger, plan, roadmap, generated file, workflow, recipe, or application file.

## Checklist fit and review boundary

The Section P finfish parent remains open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt). The recent R776–R778 checkpoint added a whole Yellow-perch form; that work concerns *Perca flavescens* and does not establish food-market use for brown trout. The current catalog contains the verified Brown-trout identity but no attached form. The R235 identity review deliberately added no form and cautioned against implying that brown trout is a common Québec retail fish. This review asks only whether current evidence justifies a culinary whole-fish presentation under that existing identity.

Keep the existing [R235 identity and alias decision](wp04-section-p-brown-trout-identity-review-r235-20261016.md) intact: `brown trout / truite brune`, with `German brown trout`, `truite d’Europe`, and `truite allemande`; keep `trout / truite`, `sea trout / truite de mer`, and *Salmo trutta* out of picker aliases. Do not merge brown trout with brook trout, rainbow trout, lake trout, or Arctic char.

## Evidence and recommendation

The current [Gouvernement du Québec brown-trout profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/truite-brune) identifies *Salmo trutta* and describes the species as stocked and sought by recreational anglers. It reports wild Québec size and weight observations, which are not a consumer product specification, recipe measure, or evidence of a market-ready whole-fish form.

The Gouvernement du Québec's [commercial aquaculture portrait](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-aquaculture-commerciale), updated 2026-06-16 with 2025 data, says brown trout is among the species raised in Québec and lists three terrestrial-aquaculture markets: table, stocking natural waters, and stocking fishing ponds. It does not assign brown trout to any one market. The [TFAEDQ FAQ](https://quebecaquaculture.com/fr/faq/) is more specific about scope: question 6 says brown trout is raised in smaller quantity; question 7 names rainbow trout, brook trout, and Arctic char as the Québec-raised fish consumers can buy at fishmongers or grocery stores, with several seller contacts. It does not identify a brown-trout retail channel. The FAQ was searchable on the access date, but a direct page open returned 502; its text is therefore treated as a bounded industry statement, not a current inventory feed or proof that no other retailer sells brown trout.

The [Association des aquaculteurs du Québec food-market page](https://www.pisciculturequebec.com/marche-alimentation) likewise names rainbow trout, Arctic char, and brook trout as the main species produced for the food market, and says many producers offer whole trout/char, fillets, or ready-to-eat products. It does not attach that general whole-fish offer to brown trout. These industry pages narrow the evidence to three identified retail species while still not proving that brown trout is never sold for food.

The two current Québec farm pages that specifically list brown trout describe stocking rather than culinary products. [Pisciculture des Arpents Verts](https://www.arpents-verts.com/differentes-especes) says its brown trout are produced for stocking and reports more than 50,000 trout stocked annually. [Pisciculture d’Arthabaska](https://www.pisciculturedarthabaska.ca/) describes live-fish stocking, says its production is destined to reproduce brown- and brook-trout populations in Québec waters, and lists brown trout by size for that service. Neither page establishes a dead, food-market product, whole-fish SKU, or a Québec retail display.

The official [Québec fish-sales regulation](https://www.legisquebec.gouv.qc.ca/fr/pdf/cr/C-61.1,%20R.%207.pdf) text retrieved for this review (PDF footer: consolidated to 2025-07-15) names brown trout and permits sales through specified qualifying channels, including fish from aquaculture sites. This establishes that brown trout is not categorically unsellable; legal eligibility alone does not establish a present consumer product. The existing ledger source `WP04-SECTIONP-BROWN-TROUT-R235-20261016-S06` already records the regulation and should be reused if referenced again. Its recorded version date should be checked against the retrieved PDF footer before any future ledger edit; this proposal does not change that record.

Together, the current sources establish that brown trout is raised in Québec, in lower quantities than the main species, and that lawful food sales are possible through specified channels. The industry FAQ’s named retail offer and the two supplier pages do not identify a brown-trout food product; the association’s whole-fish wording is generic and not species-assigned. None establishes a current, species-matched culinary product or recipe use. Hold the form pending that evidence. Do not infer whole culinary availability from wild-catch size ranges, aquaculture production alone, general whole-trout wording, or stocking products.

## Active state and collision audit

The active row is `ingredient-ref-brown-trout`, displayed as `brown trout / truite brune`, with the R235 aliases above. It has no attached forms. Before this review, the proposed-but-unallocated form ID `ingredient-form-brown-trout-whole-fish`, the R781 proposal-local source-ID prefix below, and the four exact industry/farm URLs were absent from the active data, ledger, and proposal/batch archive. The existing Government of Québec profile, aquaculture portrait, and regulation entries are reused; they are not assigned duplicate source IDs.

| Proposal-local source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-BROWN-TROUT-WHOLE-HOLD-R781-20261018-S01` | Table filière de l’aquaculture en eau douce du Québec, [Foire aux questions](https://quebecaquaculture.com/fr/faq/), questions 6–8. | Q6 says brown trout is raised in smaller quantity; Q7 names three species consumers can buy at fishmongers/grocery stores and lists seller contacts, but does not name brown trout. Current searchable text; direct open returned 502. This is not an exhaustive live inventory. |
| `WP04-SECTIONP-BROWN-TROUT-WHOLE-HOLD-R781-20261018-S02` | Association des aquaculteurs du Québec, [Marché de l’alimentation](https://www.pisciculturequebec.com/marche-alimentation), overview of food-market species and forms. | Names rainbow trout, Arctic char, and brook trout as the principal food-market species and says producers may offer whole fish; it does not attach the general offer to brown trout. |
| `WP04-SECTIONP-BROWN-TROUT-WHOLE-HOLD-R781-20261018-S03` | Pisciculture des Arpents Verts, [Différentes espèces](https://www.arpents-verts.com/differentes-especes), brown-trout section. | Identifies *Salmo trutta* and describes brown trout production for stocking; it provides no food-market product or whole-fish sale. |
| `WP04-SECTIONP-BROWN-TROUT-WHOLE-HOLD-R781-20261018-S04` | Pisciculture d’Arthabaska, [company and products](https://www.pisciculturedarthabaska.ca/), product and stocking description. | Lists brown trout for live stocking/reproduction in Québec waters, including size classes; it does not establish a culinary product. |
| **Reused `WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S01`** | Gouvernement du Québec, [Portrait de l’aquaculture commerciale](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/portraits-peche-aquaculture-commerciales/portrait-aquaculture-commerciale), terrestrial aquaculture section. | Updated 2026-06-16 with 2025 data; confirms brown trout is raised and lists table/stocking markets but does not assign the species to one. The existing ledger source is already attached to the Brown-trout record; reuse it. |
| **Reused `WP04-SECTIONP-BROWN-TROUT-R235-20261016-S02`** | Gouvernement du Québec, [Truite brune](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/truite-brune). | Supports species identity and describes stocking/recreational context. Its size and weight figures describe wild Québec observations, not retail fish or kitchen measures. |
| **Reused `WP04-SECTIONP-BROWN-TROUT-R235-20261016-S06`** | Éditeur officiel du Québec, [Règlement sur l’aquaculture et la vente des poissons](https://www.legisquebec.gouv.qc.ca/fr/pdf/cr/C-61.1,%20R.%207.pdf), article 30. | Names brown trout and its conditional sale channels; it does not attest to a current SKU or whole-fish market presentation. |

These R781 source IDs are proposal-local citation keys only. No candidate or source record is proposed for the shared ledger. If the form is reconsidered, preserve the existing Brown-trout identity-source ownership rather than duplicating it.

## Picker projection

The projection follows the current [phrase-first matcher with substring fallback](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It hypothetically adds only `whole brown trout` and `truite brune entière` as form labels under Brown trout, with empty match-term arrays. This shows that the wording would be reasonably species-qualified; picker fit does not overcome the missing food-product evidence.

| Query | Current results | With hypothetical form | Effect |
|---|---:|---:|---|
| `whole brown trout`; `truite brune entière` | 0; 0 | 1 Brown-trout result each | Adds only the explicit candidate labels and a form hint for the full phrase. |
| `brown trout`; `truite brune` | 1; 1 | 1; 1 | Existing identity matches remain unchanged. |
| `trout`; `truite` | 7; 6 | 7; 6 | Existing species and product choices remain unchanged. |
| `whole trout`; `truite entière` | 0; 0 | 0; 0 | No generic trout form phrase is created. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Existing generic whole-fish results remain unchanged. |
| `whole`; `entière` | 57; 14 | 58; 15 | Each gains Brown trout and remains a multi-result query. |

Do not add broad aliases such as `whole trout`, `truite entière`, `trout`, or `truite`; preserve the R235 exclusions and existing multi-result behavior.

## Manifest recipe-corpus audit

Scanned the **114 manifest-listed recipe files** and all **1,123 `ingredients[]` rows**, searching decoded recipe content and ingredient rows for `brown trout`, `truite brune`, *Salmo trutta*, `whole brown trout`, and `truite brune entière`. The scan found **zero matching recipe files and zero matching ingredient rows**. The bundled corpus supplies no brown-trout product, preparation, amount, or whole-fish demand. Add no recipe link or numeric observation.

## Bounded recommendation

Hold `whole brown trout / truite brune entière` outside active form data. Keep the existing species identity, precise aliases, measurement research, substitution research, and recipe links unchanged. Do not add a form, source record, recipe link, measure, density, yield, conversion, or substitution. Reconsider only when a current source establishes a species-matched food product or a bundled recipe directly requests brown trout; if supported then, use only species-qualified whole-fish labels and do not infer freshness, cleaning state, weight, or yield.

This is a documentation-only hold; no software tests, build, emulator, or deployment were run. No JSON, plan, or roadmap change is proposed.
