# WP04 Section P R733 — whole Atlantic wolffish form review

- **Review date:** 2026-10-18.
- **Status:** Proposal-only. No shared catalog, ledger, plan, roadmap, workflow, integration, recipe, or generated file was changed.
- **Checklist:** The open Section P finfish and regional-fish item remains in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6804).
- **Target:** Whole-fish presentation under the existing `ingredient-ref-atlantic-wolffish` reference for *Anarhichas lupus*.
- **Recommendation:** Add one **whole Atlantic wolffish / loup de l’Atlantique entier** form, without freshness, freezing, cleaning, head/gut state, aliases, or quantity behavior. Keep the ingredient identity and its existing evidence unchanged.

## Why this is a distinct open gap

The active catalog already has the species-scoped identity `Atlantic wolffish / loup de l’Atlantique`. Its 2026-10-12 identity review did not allocate a product form, and a search of the Section P proposals and integration archive found no focused whole-wolffish-form decision. R733 asks only whether a whole presentation shown in a Québec fishmonger’s dated bilingual arrivals sheet can be modeled under that existing identity.

This does not reopen R730’s separate *Phycis chesteri* / longfin-hake market hold. R676 concerns fresh whole barramundi under a different identity. R672’s Hoki fillet hold, R683’s Atlantic-cod fillet hold, and R691’s yellow-perch fillet hold are also separate. The La Mer sheet includes a singular Atlantic-wolffish fillet line; this proposal deliberately excludes that cut because `fillet` currently returns seven plural fish-fillet results and a singular form label would win phrase-first matching, reducing the broad query to Atlantic wolffish alone. No fillet form or alias is proposed.

## Source evidence and limits

| Evidence | Finding | Limit |
|---|---|---|
| Existing parent source `WP04-P-ATLANTIC-WOLFFISH-20261012-S01`, OQLF, [loup de l’Atlantique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198844/loup-de-latlantique) | The Québec preferred fish-product name is `loup de l’Atlantique`; the entry pairs it with English `Atlantic wolffish` and *Anarhichas lupus*. OQLF says `loup atlantique`, `loup marin`, and `loup de mer` were not retained for Québec fish-product marketing, and discourages `chat de mer`. | Last updated 2011. It supports the species and Québec display, not a current product, presentation, or inventory. Reuse the existing source ID; do not duplicate its ledger source entry. |
| Existing parent source `WP04-P-ATLANTIC-WOLFFISH-20261012-S02`, CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp); [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | CFIA lists *A. lupus* with `Atlantic Wolffish`, alongside broader rows such as `Wolffish`, `Catfish`, `Ocean Catfish`, and `Ocean Wolffish`; *A. minor* also has a `Wolffish` row. CFIA describes its list as accepted English/French fish-label names linked to scientific names. | Naming and taxonomy evidence, not product-form or stock evidence. Keep broad and overlapping names out of aliases. Reuse the existing parent source ID. |
| Proposal-local source `R733-LOCAL-ATLANTIC-WOLFFISH-WHOLE-20261018-S01`, Poissonnerie La Mer, [arrival list / liste des arrivages, PDF](https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_10-03-2026.pdf?v=1773093273), accessed 2026-10-18 | Page 1 places `POISSON-LOUP DE L’ATLANTIQUE / ATLANTIC WOLFFISH` under the `POISSONS ENTIERS / WHOLE FISH` heading. The row gives `3-4 kg` in the size field and `IPE` in the origin field. This is Québec fishmonger evidence that a whole-fish presentation for the named wolffish is offered in a dated list. | The sheet prints `3/10/2026`; it is a dated arrivals list, not a live inventory feed or a guarantee of stock on the access date. It does not identify a binomial, SKU, cleaning/head/gut state, or fresh/frozen state. Do not interpret `3-4 kg` as a household amount, edible yield, or standard whole-fish weight. The form label combines the source’s whole-fish category with the existing OQLF-preferred species display. |

The same La Mer sheet puts `FILET DE POISSON-LOUP DE L’ATLANTIQUE / ATLANTIC WOLFFISH FILLET` in its separate fillet section. That line is evidence for a different presentation, but this proposal does not model it: the exact singular English word would suppress seven current broad `fillet` results under `IngredientSearch.kt`. This exclusion preserves the specific scope of R672 and R683 and is not a decision about the fish’s culinary suitability.

## Bounded data proposal

Add exactly one form attached to `ingredient-ref-atlantic-wolffish`. Use the species-qualified labels below, with empty match-term arrays; the labels themselves support exact bilingual searches and exact form hints. Keep the source’s broad `poisson-loup` wording, CFIA alternatives, scientific names, product origin, size field, and other wolffish names out of form aliases and reference aliases.

```json
{
  "id": "proposal-local-form-atlantic-wolffish-whole-r733",
  "ingredientRefId": "ingredient-ref-atlantic-wolffish",
  "formCode": "whole_fish",
  "labelFr": "loup de l\u2019Atlantique entier",
  "labelEn": "whole Atlantic wolffish",
  "prepState": "whole",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Pr\u00e9sentation enti\u00e8re seulement. La source ne pr\u00e9cise pas l\u2019\u00e9tat frais ou surgel\u00e9, le nettoyage, l\u2019\u00e9t\u00eatage ni l\u2019\u00e9visc\u00e9ration; aucune mesure ou relation de rendement n\u2019est \u00e9tablie.",
  "notesEn": "Whole-fish presentation only. The source does not specify fresh/frozen, cleaning, heading, or evisceration; no measure or yield relationship is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

If the form is accepted, add one `ingredient_form` ledger record with a proposal-local record ID and the single new La Mer source entry. Reuse the parent’s existing OQLF and CFIA evidence without duplicating their source records. A schema-shaped example for the form-level evidence record is:

```json
{
  "recordId": "proposal-local-form-atlantic-wolffish-whole-r733",
  "recordType": "ingredient_form",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "R733-LOCAL-ATLANTIC-WOLFFISH-WHOLE-20261018-S01",
      "url": "https://cdn.shopify.com/s/files/1/0287/2662/4338/files/Arrivages_Poissonnerie_10-03-2026.pdf?v=1773093273",
      "title": "Poissonnerie La Mer, arrival list / liste des arrivages",
      "versionOrDate": "Date printed on source: 3/10/2026",
      "accessedOn": "2026-10-18",
      "locator": "Page 1, whole-fish heading and Atlantic wolffish row (lines 53 and 72 in extracted PDF text)",
      "supports": "Lists Atlantic Wolffish / Poisson-loup de l\u2019Atlantique under Whole Fish / Poissons entiers. Supports a whole-fish presentation in this dated Qu\u00e9bec fishmonger list, not current inventory, a cleaning state, temperature state, household measure, or yield.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one whole-fish presentation form under the verified Atlantic wolffish identity. The dated Québec list places the species-named product under Whole Fish. Keep freshness, freezing, cleaning state, amounts, yields, and substitution behavior unspecified.",
      "sourceIds": [
        "R733-LOCAL-ATLANTIC-WOLFFISH-WHOLE-20261018-S01"
      ]
    }
  ]
}
```

These IDs are proposal-local examples only. Root must recheck source and ID ownership and allocate shared identifiers only if this data is approved for integration.

## Ownership and prior-work audit

Read-only live snapshot on 2026-10-18: **1,847 ingredient references**, **174 forms**, **56 legacy-import candidates**, **2,230 research-ledger records / 10,466 source entries**, and **114 manifest recipes / 1,123 ingredient rows**.

| Key | Current owner / result |
|---|---|
| `ingredient-ref-atlantic-wolffish` | Existing `PROTEIN` identity `Atlantic wolffish / loup de l’Atlantique`, scoped to *Anarhichas lupus*. Aliases are empty; default density is null; unit mappings are empty. No ingredient form is attached. |
| Exact proposed labels `whole Atlantic wolffish` and `loup de l’Atlantique entier` | No exact normalized reference, form, legacy-candidate, or ledger-string owner. The parent’s shorter bilingual names remain owned by the existing reference and are unchanged. |
| Proposal-local form/ledger IDs and La Mer PDF URL | No exact owner in current reference/form IDs, legacy IDs, ledger record/source IDs, prior proposals, or batch records. The generic CFIA Fish List URL is already used elsewhere; the OQLF page is owned by the existing Atlantic-wolffish parent record and is reused without a duplicate source entry. |
| Sibling picker scope | `ingredient-ref-spotted-wolffish` owns `spotted wolffish / loup tacheté`; the parent identity’s broad `wolffish` query already returns both species. `loup` also returns both wolffish rows and the separate seal-meat row carrying `viande de loup-marin`. No broad `catfish`, `loup-marin`, or other alternate name is added. |

The earlier Atlantic-wolffish identity review is retained as the source of the existing species name and its original boundary. R733 is a focused whole-presentation review under that existing row; it does not revise the taxonomy, the parent identity’s two CNF observations, or the separate spotted/northern-wolffish scopes. No dedicated whole-wolffish form decision was found in the active Section P archive.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): whole normalized word phrases are preferred to substring fallback, form labels participate in parent-reference searches, and only an exact form label or match-term query produces a form hint. No generic match terms are added.

| Query | Current result count | With the proposed whole form | Effect |
|---|---:|---:|---|
| `whole Atlantic wolffish` | 0 | 1 | Returns the Atlantic-wolffish parent with the exact whole-form hint. |
| `loup de l’Atlantique entier` | 0 | 1 | Same scoped result and form hint in French. |
| `Atlantic wolffish`; `loup de l’Atlantique` | 1; 1 | 1; 1 | Existing species identity remains unchanged. |
| `wolffish`; `loup` | 2; 3 | 2; 3 | Existing spotted-wolffish and seal-meat results stay visible. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Existing whole-tilapia result remains the only result for these exact generic phrases; no generic match term is added. |
| `whole`; `entier` | 42; 18 | 43; 19 | Each broad query remains multi-result. |
| `fillet`; `filet` | 7; 2 | 7; 2 | Unchanged because no fillet form is proposed. |

The new labels expose a distinct named whole presentation without turning broad `wolffish`, `loup`, or whole-fish searches into a species singleton. The supplier’s `poisson-loup` phrase is not copied into search terms.

## Recipe and numeric scope

The manifest-ordered scan parsed **114 recipe files**, **1,123 structured ingredient rows**, and **754,048 recipe bytes** (SHA-256 `e87bd15cd3705924b176c6a70b55d99497a4830f9e65132917958717f54bc108`). It checked complete normalized name/taxon phrases across recipe JSON text and ingredient rows, and checked explicit reference links. There are **zero** candidate phrase hits and **zero** links to `ingredient-ref-atlantic-wolffish`.

The La Mer `3-4 kg` field is product-list context, not a recipe quantity, household measure, net package weight, count mapping, or yield. The parent record’s Health Canada half-fillet and Food Guide observations stay on the parent ledger row; they do not describe the whole-fish form. Add no measurement observation, default density, unit mapping, package yield, conversion, cooking/edible yield, recipe link, or substitution. No source reviewed here supports replacing whole Atlantic wolffish with another ingredient or changing amounts.

## Static checks and test scope

- Read the current [AGENTS.md](../../../AGENTS.md), relevant [Requirements.md](../../../Requirements.md) form/search provisions, live Section P checklist, recent plan/roadmap/workflow entries through R730, and the R73, R676, R672, R683, R691, and R730 records.
- Rechecked the active references, forms, legacy candidates, ledger, source URL/ID ownership, and full manifest-listed recipe corpus. The only proposed additions are one form and one form-level ledger record; IDs remain proposal-local.
- Reproduced current and hypothetical query results from the normalization and phrase-first behavior in `IngredientSearch.kt`; checked that generic whole-fish and fillet results are preserved.
- Checked the example structures against `IngredientFormDto`/`IngredientForm` and `research-ledger.schema.json`; proposal-local JSON snippets parse as UTF-8 without BOM. Verified local Markdown targets and whitespace.
- No software tests, build, emulator, or deployment were run. This is proposal-only catalog work, and `AGENTS.md` exempts database-JSON-only additions from software testing.

## Bounded recommendation

Recommend exactly **one whole-fish form** under the existing Atlantic-wolffish identity, with the labels `whole Atlantic wolffish / loup de l’Atlantique entier` and no match-term aliases. Record the La Mer list as dated form evidence only if integrated, reusing the existing parent OQLF and CFIA sources. Keep the fish’s storage state, cleaning, whole-fish size, recipes, measurements, yields, and substitutions unspecified. Leave the Section P parent open.
