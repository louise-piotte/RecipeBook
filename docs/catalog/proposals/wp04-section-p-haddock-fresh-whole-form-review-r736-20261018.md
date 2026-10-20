# WP04 Section P R736 — fresh whole Haddock form review

- **Review date:** 2026-10-18.
- **Status:** Proposal-only. No shared seed/catalog JSON, ledger, plan, roadmap, workflow, integration record, recipe, or generated file was changed.
- **Checklist scope:** The open Section P finfish item includes haddock among salmon, cod, pollock, halibut, and the remaining regional fish ([global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6816)).
- **Target:** A fresh whole-fish presentation under the existing `ingredient-ref-haddock` identity for *Melanogrammus aeglefinus*.
- **Recommendation:** Add one `fresh_whole` form labeled **fresh whole haddock / églefin frais entier**. Keep the form attached to the existing Haddock reference. Do not add cleaning/head/gut qualifiers, a generic `whole fish` match, a cut form, measurement, yield, recipe link, conversion, or substitution.

## Why this is a distinct open gap

The live catalog has an accepted Haddock / églefin identity but no attached form. Seafood from Canada’s bilingual species profile names *Melanogrammus aeglefinus* and lists fresh whole/round product presentation. Its English profile shows the image text “Fresh, whole haddock” and `Fresh (Round, Fillets, Bits, HOG, Roe)`; its French profile lists `Frais : entier` separately from HOG, H&G, and filets. OQLF’s existing parent source gives the Québec fish-product terminology: `églefin` and `aiglefin` are both normalized terms for the species. This supports a narrow fresh whole form, not every Haddock cut or processing state. [S01–S02; existing parent source `WP04-FINFISH-ID-20261009-S03`]

This proposal does not reopen prior Haddock decisions:

- R149 added the separate **smoked haddock / aiglefin fumé** product identity ([R149 proposal](wp04-section-p-smoked-haddock-product-identity-review-r149-20261015.md)); R736 covers the fresh whole presentation under plain Haddock.
- R164 reviewed Finnan haddie naming and picker boundaries ([R164 proposal](wp04-section-p-finnan-haddie-naming-picker-boundary-review-r164-20261016.md)); R736 does not add that term.
- R554 held the Haddock loin form because its plural English/French cut labels would monopolize generic `loins` and `longes` ([R554 proposal](wp04-section-p-next-gap-review-r554-20261017.md)). The R736 labels contain no loin terms and do not change that hold.
- R712 added only the qualified `scrod haddock` alias ([R712 proposal](wp04-section-p-next-open-gap-review-r712-20261018.md)); no `scrod` search wording is proposed here.
- R676, R709, and R733 concern fresh-whole or whole-fish forms for different identities ([R676](wp04-section-p-next-regional-fish-review-r676-20261018.md), [R709](wp04-section-p-atlantic-salmon-fresh-whole-form-review-r709-20261018.md), [R733](wp04-section-p-whole-atlantic-wolffish-form-review-r733-20261018.md)); their data and source evidence are not transferred to Haddock.

## Source evidence and limits

| Evidence | Finding | Limit |
|---|---|---|
| Existing parent source `WP04-FINFISH-ID-20261009-S03`, OQLF, [églefin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199838/eglefin) | Pairs French `églefin` with English `haddock` and Latin *Melanogrammus aeglefinus*. It identifies both `églefin` and `aiglefin` as normalized Québec terms. | Terminology and identity evidence only. It does not describe freshness or whole presentation. Reuse the existing source ID and ledger entry; do not duplicate it. |
| Proposal-local source `R736-LOCAL-HADDOCK-FRESH-WHOLE-EN-20261018-S01`, Seafood from Canada, [Haddock profile](https://seafoodfromcanada.ca/seafood/haddock/), accessed 2026-10-18 | Names *Melanogrammus aeglefinus*; the image label says `Fresh, whole haddock`; Product Forms lists fresh `Round` separately from fillets, bits, HOG, and roe. | A Canadian Atlantic seafood-sector profile, not a Québec retailer listing or a SKU specification. The page supports a Canadian product presentation, not stock at a particular shop. The page’s nutrition display says “per 180 grams”; that is not treated as a recipe portion or kitchen measure. |
| Proposal-local source `R736-LOCAL-HADDOCK-FRESH-WHOLE-FR-20261018-S02`, Seafood from Canada, [Aiglefin profile](https://seafoodfromcanada.ca/fr/seafood/aiglefin/), accessed 2026-10-18 | Identifies *Melanogrammus aeglefinus* as `Aiglefin`; under `Formes du produit`, it lists `Frais : entier` separately from HOG, H&G, and filets. This directly supports fresh whole and a French whole-presentation term. | The bilingual profile is sector information, not a particular retail product or current Québec inventory. The page does not specify cleaning, scaling, head/gut state, net weight, or consumer package. The catalog label combines the existing canonical `églefin` display with the page’s `frais` and `entier` descriptors; `aiglefin` remains the existing parent alias and is supported by OQLF as normalized Québec wording. |

The English `Round` category is kept as source context, not added as a match term. The French page’s explicit `entier` and the English image text support a whole presentation, while the separate HOG/H&G categories show why a whole form should not imply a particular preparation. Add no fresh-to-frozen relation or other process equivalence.

## Bounded data proposal

Add exactly one form under the existing `ingredient-ref-haddock`; do not create an identity or a second market group. The proposed display uses the parent’s canonical Québec spelling. Its match terms remain species-qualified and whole-specific. No generic `fresh fish`, `whole fish`, `poisson frais`, or `poisson entier` term is introduced.

```json
{
  "id": "proposal-local-form-haddock-fresh-whole-r736",
  "ingredientRefId": "ingredient-ref-haddock",
  "formCode": "fresh_whole",
  "labelFr": "\u00e9glefin frais entier",
  "labelEn": "fresh whole haddock",
  "prepState": "fresh",
  "matchTermsFr": [
    "\u00e9glefin entier",
    "aiglefin frais entier",
    "aiglefin entier"
  ],
  "matchTermsEn": [
    "whole haddock"
  ],
  "densityGPerMl": null,
  "notesFr": "Pr\u00e9sentation fra\u00eeche enti\u00e8re seulement. La source distingue entier, HOG et H&G, sans pr\u00e9ciser la pr\u00e9paration du produit entier; aucune mesure, conversion ou relation de rendement n\u2019est \u00e9tablie.",
  "notesEn": "Fresh whole presentation only. The source lists whole separately from HOG and H&G but does not specify the preparation of the whole product; no measure, conversion, or yield relationship is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

If accepted, create one form-level ledger record using the same allocated form ID as its `recordId` and new shared source IDs only after ownership recheck. The example below uses proposal-local identifiers. Measurement and substitution research remain unreviewed; the 180 g nutrition display is not recorded as a portion observation.

```json
{
  "recordId": "proposal-local-form-haddock-fresh-whole-r736",
  "recordType": "ingredient_form",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "R736-LOCAL-HADDOCK-FRESH-WHOLE-EN-20261018-S01",
      "url": "https://seafoodfromcanada.ca/seafood/haddock/",
      "title": "Seafood from Canada, Haddock",
      "accessedOn": "2026-10-18",
      "locator": "Species heading and scientific name; image alt text; Product Forms, lines 18-35.",
      "supports": "Identifies Melanogrammus aeglefinus and shows Fresh, whole haddock; lists Fresh (Round, Fillets, Bits, HOG, Roe). Supports a fresh whole presentation, not a Qu\u00e9bec retail SKU, cleaning state, serving, measure, or yield.",
      "sourceKind": "other"
    },
    {
      "sourceId": "R736-LOCAL-HADDOCK-FRESH-WHOLE-FR-20261018-S02",
      "url": "https://seafoodfromcanada.ca/fr/seafood/aiglefin/",
      "title": "Seafood from Canada, Aiglefin",
      "accessedOn": "2026-10-18",
      "locator": "Species heading and scientific name; Formes du produit, lines 20-34.",
      "supports": "Identifies Melanogrammus aeglefinus as Aiglefin and lists Frais : entier separately from HOG, H&G, and filets. Supports the French fresh whole descriptor, not inventory, preparation detail, measure, or yield.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one fresh whole presentation form under the existing verified Haddock identity. Keep it distinct from the separate smoked-haddock product; do not infer cleaning, scaling, heading, evisceration, quantity, yield, conversion, recipe behavior, or substitution.",
      "sourceIds": [
        "R736-LOCAL-HADDOCK-FRESH-WHOLE-EN-20261018-S01",
        "R736-LOCAL-HADDOCK-FRESH-WHOLE-FR-20261018-S02"
      ]
    }
  ]
}
```

These IDs are examples for this proposal only. Shared form, record, and source IDs remain unallocated pending integration review.

## Current ownership and prior-work audit

Read-only live snapshot on 2026-10-18: **1,848 ingredient references**, **175 forms**, **56 legacy candidates**, **2,232 ledger records / 10,472 source entries**, and **114 manifest-listed recipes / 1,123 ingredient rows**.

| Key | Current owner / result |
|---|---|
| `ingredient-ref-haddock` | Existing `PROTEIN` identity `haddock / églefin`; French alias `aiglefin`, English alias `scrod haddock`, null default density, and no unit mappings. It has no attached form. Its identity ledger row owns the OQLF `églefin` source `WP04-FINFISH-ID-20261009-S03`. |
| `ingredient-ref-smoked-haddock` | Separate `smoked haddock / aiglefin fumé` identity. R736 does not merge it into plain Haddock or add a smoked-state alias. |
| Exact form labels and match terms | No exact owner was found for `fresh whole haddock`, `whole haddock`, `églefin frais entier`, `églefin entier`, `aiglefin frais entier`, or `aiglefin entier` among active reference names/aliases, form labels/match terms, or legacy candidates. |
| Evidence and proposal IDs | The two Seafood from Canada language URLs and the R736 proposal-local source IDs are not in the current ledger. The OQLF URL and source ID are already owned by the Haddock identity and are reused by reference only, with no duplicate source entry. |
| Recent product/cut decisions | R149 smoked Haddock and R164 Finnan haddie are separate product boundaries. R554’s Haddock-loin form remains held. R712’s `scrod haddock` alias remains unchanged. R733’s whole Atlantic wolffish form concerns another identity. No earlier whole or fresh-whole Haddock form decision was found. |

## Picker projection

The projection follows phrase-first matching and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Forms are searched within their parent ingredient result; only an exact form label or match-term query gives an exact form hint. The new labels and match terms are all species-qualified; generic whole-fish phrases are excluded.

| Query | Current result count | With the proposed form | Effect |
|---|---:|---:|---|
| `fresh whole haddock`; `whole haddock` | 0; 0 | 1; 1 | Returns the Haddock parent with the fresh-whole hint. |
| `églefin frais entier`; `églefin entier`; `aiglefin frais entier`; `aiglefin entier` | 0 each | 1 each | Qualified French phrases select the same form; accent-folded searches behave the same. |
| `haddock`; `aiglefin` | 2; 2 | 2; 2 | The plain and smoked Haddock identities remain visible together. |
| `scrod` | 2 | 2 | The R712 cod/Haddock qualified alias boundary is unchanged. |
| `whole fish`; `poisson entier` | 1; 1 | 1; 1 | Existing whole-tilapia results remain unchanged; no generic term was added. |
| `fresh`; `frais` | 33; 27 | 34; 28 | Each broad freshness query remains multi-result. |
| `whole`; `entier` | 43; 19 | 44; 20 | Each broad presentation query remains multi-result. |

Queries such as `fresh whole haddock` provide a selectable explicit form while preserving the existing broad Haddock search. No new result is created by the Haddock identity itself; the form remains attached to that reference.

## Recipe, quantity, and substitution scope

The manifest-ordered corpus scan parsed all **114 recipe files** and **1,123 structured ingredient rows** (**754,048 bytes**). It checked complete normalized English/French name and taxon phrases, full recipe text, and direct ingredient-reference links. There were **zero** mentions of `haddock`, `églefin`, `aiglefin`, *Melanogrammus aeglefinus*, or the proposed fresh-whole phrases; there were **zero** ingredient-row links to `ingredient-ref-haddock`.

The source profile’s `per 180 grams` nutrition display is not used as a household portion or conversion. No source establishes whole-fish edible yield, cleaned weight, volume, density, unit mapping, package yield, cooking yield, recipe link, substitution amount, or culinary interchangeability. Add none of these. Keep substitution research unreviewed.

## Static checks and test scope

- Read current `AGENTS.md`, relevant form and search provisions in [Requirements.md](../../../Requirements.md), the active Section P checklist, recent `roadmap.md` and `ingredient-catalog-workflow.md` progress through R733, and the R149, R164, R554, R712, and R733 records.
- Rechecked live references, forms, legacy candidates, ledger/source IDs and URLs, sibling Haddock ownership, source-specific bilingual product pages, and the full manifest-listed recipe corpus. No shared ID is allocated.
- Reproduced current/hypothetical phrase-first picker counts with the live catalog terms and `IngredientSearch.kt` matching rules.
- Confirmed both JSON examples parse; form fields match `IngredientFormDto` / `IngredientForm`; the ledger example validates as one record inside the `research-ledger.schema.json` package object. Verified relative Markdown links, UTF-8 without BOM, and whitespace.
- No software tests, build, emulator, or deployment were run. This is proposal-only database catalog work; `AGENTS.md` exempts JSON-only catalog additions from software tests.

## Bounded recommendation

Recommend one `fresh_whole` form under the existing Haddock reference with the labels **fresh whole haddock / églefin frais entier** and the narrow whole-specific terms shown above. Reuse the existing OQLF identity evidence by source ID; if accepted, add only the two new Seafood from Canada form sources in the form ledger record. Leave the parent Haddock identity, smoked Haddock, scrod aliases, R554’s held loin form, quantities, cleaning state, and all recipe/substitution behavior unchanged. Keep the broader Section P finfish parent open.
