# WP02 A/A7 generic grain-meal diversity review — R864 (2026-10-19)

## Review record

- **Status:** Reviewed and held; no shared data change was made. Root disposition: the current questionnaire page did not open, and the accessible French classification's illustrative examples do not establish a Québec French barley-meal label or a consumer milling boundary. Its proposed source additions do not materially resolve the existing candidate, so they were not added. Keep the existing candidate and product-specific evidence unchanged.
- **Scope:** One generic milling identity gap: barley meal. This review does not expand commercial brands, product lines, flavours, SKUs, or retailer variants.
- **Plan anchor:** WP02 Section A7 remains open for other grain meals and milling products, including the unresolved wheat-meal candidate ([plan, line 2289](../../RecipeBook-global-ingredient-catalog-plan.txt#L2289)). The existing A7 boundary note keeps barley meal, dry oat meal, and toasted rye flour unresolved ([plan, line 2814](../../RecipeBook-global-ingredient-catalog-plan.txt#L2814)).
- **Existing candidate:** `candidate-barley-meal`, `identityState: needs_clarification`, `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`.
- **Recommendation:** Keep the barley-meal candidate unresolved. The current official sources reaffirm that barley meal exists as a milling/market category, but do not supply both a stable consumer product boundary and a distinct Québec French display. Do not create an active ingredient reference from this evidence.

## Bilingual identity boundary

| Field or wording | Review disposition |
|---|---|
| Candidate English name | `barley meal` is attested as a human-food milling category. It is not a single sufficiently bounded consumer identity in the reviewed Canadian evidence. |
| Québec French display | **Unresolved.** No reviewed Québec authority or standalone Québec bilingual product source supplies a distinct dry barley-meal name. |
| `farine d'orge` | Keep with active `ingredient-ref-barley-flour`. OQLF directly pairs this Québec French term with `barley flour`; a retailer's rendering of a meal ingredient in one finished product does not displace that pairing. |
| `farine d'orge entière` | Keep with active `ingredient-ref-whole-barley-flour`; the bilingual name is already assigned to whole barley flour. |
| `gruau d'orge` | Keep with active `ingredient-ref-barley-grits` / `barley grits`. Do not reuse it for dry barley meal. |
| `semoule d'orge` | Keep with active `ingredient-ref-barley-semolina` / `barley semolina`. The Québec French phrase is already owned, and feed-class or historical translations do not establish a separate Québec human-food term for barley meal. |
| `orge concassée` / `orge finement concassée` | Keep out of barley-meal aliases. The current Québec label evidence describes cracked barley, not an equivalent dry meal product. |

The earlier A7 review already found two materially different Canadian uses: an Ontario whole-grain product described as crushed and ground across a fine-to-coarse texture range, and a Yukon mill's cross-cut barley pieces sold under the terms “barley meal or grits.” Those are product-specific statements. They do not justify generalizing either product's process or name to all barley meal. See the [2026-10-11 Québec product-boundary review](wp02-a7-barley-meal-quebec-product-boundary-review-20261011.md).

## Current source review

| Proposal-local ID | Source and evidence | Limits |
|---|---|---|
| `WP02-A7-BARLEY-MEAL-DIVERSITY-R864-20261019-S01` | Statistics Canada, [Quarterly Miller's Survey — 2026](https://www23.statcan.gc.ca/imdb/p3Instr.pl?Function=assembleInstr&Item_Id=1585328&lang=en), current survey instrument. The indexed product list separates barley flour, barley meal, and pot/pearl barley under coarse-grain products. | Supports a current Canadian milling/output category. It does not define the consumer product's grind, kernel state, whole-grain status, or Québec French name. The official page's search-indexed text was available, but opening the page timed out during this review. |
| `WP02-A7-BARLEY-MEAL-DIVERSITY-R864-20261019-S02` | Statistics Canada, [SCPAN 2022 French human-food class 1821294](https://www23.statcan.gc.ca/imdb/p3VD_f.pl?CLV=2&CPV=1821294&CST=17022022&CVD=1386659&D=1&Function=getVD&MLV=4&TVD=1384502), corresponding French classification page. The short illustrative list includes other grain products but does not provide a French barley-meal pairing. | An omission from illustrative examples is not proof that no Québec French term exists. The page supplies no product definition or standalone label. The English all-examples page already registered on the candidate row lists `barley meal for human consumption` (existing source `WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S06`). |
| Reviewed but not proposed as a ledger source | Canada Border Services Agency, [Customs Tariff 2026, Chapter 11](https://cbsa-asfc.gc.ca/trade-commerce/tariff-tarif/2026/html/00/ch11-eng.html). The indexed chapter text says “meal” and “groats” are products obtained by fragmentation of cereal grains. | The page could not be opened because the fetch timed out. The retrieved excerpt does not distinguish meal from groats or establish a consumer naming boundary. Do not add it to the shared ledger on this review alone; recheck direct access if a future review needs it. |

The OQLF source already recorded on the candidate row remains the best Québec terminology evidence: [farine d'orge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge) pairs with English `barley flour`, not `barley meal` (`WP02-A7-BARLEY-MEAL-20261011-S09`). The existing candidate sources also record the conflicting Canadian product uses and the absence of a Québec standalone label. This review does not transfer the OQLF term or product-only statements to a new identity.

## Exact proposed data delta

Append the two newly reviewed source objects to `candidate-barley-meal.sources` and append the unresolved decision below to `candidate-barley-meal.decisions`. Keep its identity and research-state fields unchanged. Do not create or edit any active reference, alias, form, recipe link, measurement observation, mapping, conversion, yield, or substitution rule.

```json
[
  {
    "sourceId": "WP02-A7-BARLEY-MEAL-DIVERSITY-R864-20261019-S01",
    "url": "https://www23.statcan.gc.ca/imdb/p3Instr.pl?Function=assembleInstr&Item_Id=1585328&lang=en",
    "title": "Statistics Canada, Quarterly Miller's Survey — 2026",
    "accessedOn": "2026-10-19",
    "locator": "Coarse grains products: barley flour, barley meal, and pot and pearl barley",
    "supports": "The current official milling survey lists barley flour, barley meal, and pot/pearl barley as separate coarse-grain product outputs. It supports the continued existence of the barley-meal category but gives no consumer grind boundary, product state, or French name. The page text was retrieved through the official search result; direct page opening timed out during this review.",
    "sourceKind": "other"
  },
  {
    "sourceId": "WP02-A7-BARLEY-MEAL-DIVERSITY-R864-20261019-S02",
    "url": "https://www23.statcan.gc.ca/imdb/p3VD_f.pl?CLV=2&CPV=1821294&CST=17022022&CVD=1386659&D=1&Function=getVD&MLV=4&TVD=1384502",
    "title": "Statistics Canada, SCPAN Canada 2022, French human-food class 1821294",
    "accessedOn": "2026-10-19",
    "locator": "Illustrative examples under Produits céréaliers pour consommation humaine, n.c.a.",
    "supports": "The corresponding French human-food class lists selected grain products but provides no French barley-meal entry or bilingual pairing. This does not prove that no Québec term exists; it leaves the proposed meal display unsupported.",
    "sourceKind": "other",
    "versionOrDate": "Modified 2023-07-21"
  }
]
```

```json
{
  "outcome": "unresolved",
  "reason": "Keep generic barley meal as a research candidate. Current Canadian milling evidence distinguishes barley meal from flour and other barley outputs, but does not establish one consumer milling boundary or a Québec French display distinct from active barley flour, whole barley flour, barley grits, and barley semolina. The Québec phrase farine d'orge is already paired by OQLF with barley flour; gruau d'orge and semoule d'orge have active barley-product owners. Do not add an English-only reference, guess a French display, generalize a named mill's product, or add numeric, form, recipe, or substitution behavior.",
  "sourceIds": [
    "WP02-A7-BARLEY-MEAL-DIVERSITY-R864-20261019-S01",
    "WP02-A7-BARLEY-MEAL-DIVERSITY-R864-20261019-S02",
    "WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S06",
    "WP02-A7-BARLEY-MEAL-20261011-S03",
    "WP02-A7-BARLEY-MEAL-20261011-S09",
    "WP02-A7-BARLEY-MEAL-20261011-S11",
    "WP02-A7-BARLEY-MEAL-20261011-S12"
  ]
}
```

The JSON above is a proposal for the existing research candidate only; it is not a new active catalog identity. The inaccessible CBSA tariff page is intentionally absent from the data delta.

## Search, ownership, and demand checks

| Surface | Result |
|---|---|
| Active ingredient references | Exact `barley meal` and `whole grain barley meal` have no active display or alias owner. Existing French terms are owned: `farine d'orge` by `ingredient-ref-barley-flour`; `farine d'orge entière` by `ingredient-ref-whole-barley-flour`; `gruau d'orge` by `ingredient-ref-barley-grits`; and `semoule d'orge` by `ingredient-ref-barley-semolina`. |
| Research ledger | `candidate-barley-meal` is the sole current identity candidate. Its existing state is `needs_clarification`; it already carries earlier manufacturer, Statistics Canada, OQLF, and retailer evidence. |
| Forms and active rules | Exact target phrases have no ingredient-form owner. Neither global nor contextual substitution-rule file mentions `barley meal`, `candidate-barley-meal`, or a proposed barley-meal reference ID. |
| Recipe corpus | Parsed all 114 manifest-listed recipe files and 1,123 ingredient rows. Exact and adjacent barley-meal / milling phrases returned zero full-file matches and zero ingredient-row matches. No recipe link is proposed. |
| Source ownership | The two proposed Statistics Canada URLs and source IDs have no current ledger owner. The old NAPCS English URL is reused under its existing source ID rather than duplicated. The CBSA URL has no ledger owner but is omitted from the proposed ledger delta because direct retrieval timed out. |
| Plan and proposal ownership | Confirmed the open A7 parent at line 2289 and the existing A7 barley-meal hold at line 2814. Read the [A7 remaining-meals review](wp02-a7-remaining-meals-review-20261010.md), the [barley-meal Québec boundary review](wp02-a7-barley-meal-quebec-product-boundary-review-20261011.md), the current [catalog workflow](../ingredient-catalog-workflow.md), and current reference/ledger JSON. No brand-specific queued child task for barley meal appears under the live A7 anchor. |

## Out of scope and unresolved risks

- Brand, product-line, flavour, SKU, and retailer-variant catalog expansion is out of scope. The previously reviewed Ottawa Valley and Hinterland mill pages are used only as conflicting product-specific terminology evidence. Do not turn either named item into a catalog row or generalize its recipe suggestion, grind description, package, or measurement.
- No new sources for a branded product roster are sought. Any future brand-specific child task should be marked out of scope for this generic-diversity review, because additional commercial product counts do not establish additional ingredient identities.
- The English category is documented, but the reviewed Canadian sources do not set one meal-versus-grits boundary. The exact French term remains unresolved, and the most plausible phrases are already assigned to other barley identities or describe other states.
- The current StatCan survey page and CBSA tariff page timed out on direct open. The StatCan list was available in its official search result; the CBSA wording is not proposed for ledger integration pending direct recheck.
- The recipe corpus has no matching demand. This does not disprove the ingredient's culinary use, but it provides no local recipe context to resolve the product boundary.

No tests, build, emulator, or deployment were run. This is proposal-only catalog research, and no shared file other than this proposal was changed.
