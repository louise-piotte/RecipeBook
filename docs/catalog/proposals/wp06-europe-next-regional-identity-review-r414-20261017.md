# WP06 Europe — Tête de Moine AOP identity review (R414)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review creates only this proposal file; it does not change the shared catalog, ingredient forms, research ledger, recipe files, generated files, Europe checklist, workflow, or roadmap.
- **Snapshot:** Counts, ownership, picker, and corpus results below describe the workspace before the R412–R414 integration; the integration README records the resulting state.
- **Scope:** One Swiss regional cheese identity, **Tête de Moine AOP / Fromage de Bellelay**. Keep the protected product distinct from generic cheese names and unrelated cheese identities.
- **Source-ID prefix:** `WP06-EUROPE-TETE-DE-MOINE-R414-20261017`. The proposed reference ID, source prefix, and seven direct source URLs were checked for collisions.

## Recommendation

If accepted, add one identity-only `CHEESE` reference for **`Tête de Moine AOP / PDO Tête de Moine cheese`**, with the protected alternate name **`Fromage de Bellelay`** as its French alias. The current Swiss Federal Office of Agriculture (BLW) specification defines the protected cheese and its production area; the federal registry lists the AOP as a cheese and records a 2026-03-31 amendment. [S01–S02]

Use Québec retailer Mayrand's current French title, **`Tête de Moine AOP`**, for the French display name. Its English title is **`PDO Tête de Moine Cheese`**. These are product-title sources, not an OQLF terminology ruling or independent proof that a particular SKU satisfies the AOP specification. Mayrand's French and English pages are the same item, code 26390. [S05–S06]

The identity covers the Swiss AOP cheese made under the registered specification. It does not cover generic semi-hard cheese, other Swiss cheeses, a girolle (the shaving tool), or a cheese product that merely uses similar wording without meeting the specification. Keep the already reviewed Europe identities and the broader Europe checklist unchanged. [S01–S04; R408; R411]

### Proposed catalog row

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-tete-de-moine",
  "nameFr": "Tête de Moine AOP",
  "nameEn": "PDO Tête de Moine cheese",
  "aliasesFr": ["Fromage de Bellelay"],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "CHEESE"
}
```

The two French names are the registered protected designation; the alternate name is also confirmed by Agroscope. The English display follows the current Québec retailer title. Do not add `girolle`, `rosette`, `rosettes`, `Swiss cheese`, `Gruyère`, `Comté`, or generic `cheese`/`fromage` as aliases. `Girolle` names a tool used to shave the cheese. The specification protects `rosette` in combination with the designation, but rosettes are a presentation of this product, not a general synonym for it. [S01, S03, S05–S06]

## Product boundary and nearby identities

The current BLW cahier des charges, amended 2026-03-31, names **Tête de Moine** and **Tête de Moine, Fromage de Bellelay** as the protected AOP. It restricts production to the defined mountain and summer-grazing areas in the Swiss cantons of Jura and Bern, requires raw milk, and specifies a semi-hard cylindrical cheese. It also protects rosettes made from Tête de Moine and sets the applicable production and maturation rules. Use this specification as the product boundary; a seller title alone does not establish compliance by a given item. [S01]

The BLW register classifies the product as cheese and confirms registration and amendments through 2026-03-31. Agroscope's current French overview independently identifies Fromage de Bellelay as another name for Tête de Moine and locates production in the canton of Jura and Bernese Jura. [S02–S03]

Keep neighboring identities separate:

- **Gruyère AOP, Comté, and Emmental:** separate named cheeses. Their appearance in the same fondue formula is co-use, not an alias or replacement relationship.
- **Generic Swiss cheese and semi-hard cheese:** broad categories do not establish the protected Tête de Moine identity.
- **Rosettes:** a protected presentation when combined with the AOP name; do not create a generic cheese alias or an ingredient form without recipe demand.
- **Girolle:** a dedicated shaving tool, not a cheese or ingredient form. It also appears in a separate historical chanterelle/mushroom archive; do not connect that record to this cheese.
- **Prepared foods containing Tête de Moine:** remain their own finished-product identities. The specification has specific conditions for naming foods made with the cheese; this proposal does not create identities for them. [S01]

Do not reopen the completed Europe boundaries for brunost (R393), burrata (R396), nduja (R399), Comté (R402), sobrasada (R405), Piment d'Espelette (R408), or Pimentón de la Vera (R411). R412 and R413 review unrelated milling and seafood candidates. This is a separate, still-unallocated cheese identity. [R408; R411]

## Live ownership and archive audit

Read-only workspace snapshot checked on 2026-10-17:

| Surface | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,715 | No exact owner for Tête de Moine, Fromage de Bellelay, the proposed ID, or the qualified English titles. The only active names with `moine` are two monk-fruit references; these are a picker effect described below, not cheese ownership. |
| Ingredient forms | 141 | No Tête de Moine form, label, or match term. `Girolle` is not an ingredient form. |
| Legacy import candidates | 56 | No exact cheese candidate, alternate name, or proposed reference ID. |
| Research ledger | 2,074 records; 9,389 source entries | No Tête de Moine record, R414 source prefix, proposed ID, or collision for the seven source URLs below. |
| Existing substitutions and package yields | Live bundled files | No candidate name or ID appears in the global substitution rules, contextual substitution rules, or package-yield file. No relevant active conversion or yield is proposed. |
| Previous proposals and batches | Phrase/ID search | No prior Tête de Moine or Fromage de Bellelay allocation or review. The target proposal path was unallocated. |

The exact product name and its accentless form, `Fromage de Bellelay`, the proposed ID and prefix were searched across active references, forms, legacy candidates, the ledger, and earlier proposal/batch text. The source URLs and source IDs were also checked against the live ledger. No exact collision was found. The checked inputs include the [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), [global substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitution rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), and [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json). The Europe coverage item remains open in the [regional checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L8972).

The R408 and R411 decisions are available in the [R408 proposal](wp06-europe-next-regional-identity-review-r408-20261017.md), [R411 proposal](wp06-europe-next-regional-identity-review-r411-20261017.md), and [R409–R411 integration report](../batches/wp02-wp04-wp06-r409-r411-gap-review-integration-20261017/README.md). None owns or blocks Tête de Moine.

## Phrase-first picker projection

I projected the current catalog and proposed names through the accent-, punctuation-, and case-folding phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The picker returns all complete word-phrase matches first; it uses substring matches only if no complete phrase matches. The result projection includes the proposed names and aliases above.

| Query | Current result | With proposed row |
|---|---|---|
| `Tête de Moine AOP`; `PDO Tête de Moine cheese`; accentless `Tete de moine`; `Fromage de Bellelay` | No exact phrase result | `ingredient-ref-tete-de-moine` only |
| `moine` | Two monk-fruit references by partial fallback | The exact word phrase in `Tête de Moine` wins, so the new cheese row is the only result |
| `moines`; `fruit de moine`; `fruit de moines`; `monk fruit` | The two monk-fruit references | The same two monk-fruit references |
| `cheese` | 13 references | 14 references, including this row |
| `fromage` | 11 references | 12 references, including this row |
| `Gruyère`; `Comté`; `Emmental`; `Parmesan` | Each resolves to its current matching reference | No change to those distinct identities |
| `girolle`; `rosette`; `rosettes` | No matching ingredient reference | Still no matching ingredient reference |

The one-word query `moine` will be claimed by the complete-word match in Tête de Moine instead of falling back to the monk-fruit substring matches. The explicit `moines` and monk-fruit phrases continue to return both existing references. Preserve this discoverability effect in the integration review; it does not justify aliasing the cheese to monk fruit or changing either existing identity.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed as UTF-8. The scan checked full recipe documents and ingredient-row text for accented and accentless Tête de Moine, hyphen and word-order variants, `Fromage de Bellelay`, `Bellelay`, `girolle`, and `rosette`/`rosettes`. It found **zero matching recipe files, zero matching ingredient rows, and zero direct recipe links** for the candidate. The manifest-order corpus fingerprint is `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`.

No recipe links or bundled ingredient rows should be added or changed. The Swiss fondue formula below is external source evidence and is not a bundled recipe.

## Forms, measurements, and substitutions

The AOP specification recognizes whole wheels, half wheels, and rosettes. Roasting, shaving, grating, and sales presentation do not create a current bundled recipe-line need for ingredient forms, so keep the proposed `forms` collection empty. Do not turn the specialized girolle into a cheese form or alias. [S01]

Several sources publish different wheel weights. The **current BLW cahier des charges** gives a physical weight range of 0.7–2 kg and separately states a 3 kg maximum for its protected-form criteria. The Swiss AOP-IGP association's product summary says 700–900 g. Agroscope's overview says 0.7–2.5 kg. These published ranges do not agree; the registered BLW specification is the strongest source for the protected-product definition, but none is a recipe quantity or count-to-mass mapping. [S01, S03–S04]

Mayrand lists item **26390** as an 880 g Tête de Moine AOP/PDO wheel. The listed amount is this retailer SKU's package size. Its page also describes aging of at least 60 days, which conflicts with the BLW specification's minimum 75 days; use Mayrand for Québec product-title wording and its SKU package label only, not as AOP compliance or a reusable measurement source. [S01, S05–S06]

The Swiss Cheese Marketing recipe *Fondue à la Tête de Moine AOP* serves four and lists **300 g Tête de Moine AOP**, roughly grated, with **500 g Gruyère AOP**. If recorded in research, preserve the 300 g as one recipe-specific `portion_weight` observation with its four-portion basis: `measurementState: researched_supported` would reflect only that published formula amount. Do not derive 75 g per person, a wheel/rosette count, density, volume mapping, package yield, or a reusable portion measure from it. The BLW specification allows fondue cheese mixtures subject to a minimum Tête de Moine content; the listed formula is an example of co-use and does not establish substitution in either direction. [S01, S07]

If integrated, keep `defaultDensity` null and `unitMappings` empty. Record no generic portion weight, conversion, yield, or ingredient-form mapping. The single external 300 g recipe observation may be retained with its full four-portion basis; do not treat it as a universal serving value. No reviewed source validates a global or contextual substitution ratio between Tête de Moine and Gruyère or any other cheese. Leave `substitutionResearchState` at `not_yet_researched`; add no active substitution, inverse rule, or recipe-line link.

## Source register

Sources were accessed on 2026-10-17. Source IDs are proposal-local and were checked against the live ledger.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-TETE-DE-MOINE-R414-20261017-S01` | BLW, [current cahier des charges: Tête de Moine, Fromage de Bellelay](https://www.blw.admin.ch/dam/fr/sd-web/EoJ3kVwEIIXB/T%C3%AAte%20de%20Moine%20%C3%84nderung%20PH%202026%20f.pdf), amended 2026-03-31, arts. 1–3, 13–14, 20–21. | Primary source for the protected French names, geographic boundaries, raw-milk semi-hard cheese identity, physical criteria, protected rosette presentation, aging minimum, and fondue-mixture condition. Art. 3 gives 0.7–2 kg; art. 3's protected-form criteria state a 3 kg maximum. Not Québec market terminology or evidence about a specific retailer SKU. |
| `WP06-EUROPE-TETE-DE-MOINE-R414-20261017-S02` | BLW, [AOP/IGP registry entry](https://www.blw.admin.ch/fr/aop-igp-appellations-dorigine-et-indications-geographiques), “Tête de Moine, Fromage de Bellelay (AOP),” current register. | Confirms the AOP name, cheese category, registration history, and 2026-03-31 amendment. The linked current specification in S01 is the product-boundary source. |
| `WP06-EUROPE-TETE-DE-MOINE-R414-20261017-S03` | Agroscope, [Tête de Moine AOP](https://www.agroscope.admin.ch/fr/tete-de-moine-aop-fr), published 2026-01-22. | Federal research centre overview; states Fromage de Bellelay is another name, describes raw-milk semi-hard cylindrical cheese, Jura/Bernese Jura production, and 0.7–2.5 kg wheel weights. The weight is in conflict with other current sources; do not use it as a recipe measure. |
| `WP06-EUROPE-TETE-DE-MOINE-R414-20261017-S04` | Association suisse des AOP-IGP, [Tête de Moine AOP](https://www.aop-igp.ch/fr/tete-de-moine-aop/page), product summary, production, maturation, appearance, and conditioning sections. | Describes raw milk, the four-district Jura/Bernese Jura origin, 75-day maturation, whole/half wheels and rosettes, and a 700–900 g weight range. This public summary conflicts with the current BLW specification and Agroscope's weight ranges; do not encode its weight as a reusable measure. |
| `WP06-EUROPE-TETE-DE-MOINE-R414-20261017-S05` | Mayrand, [French item 26390](https://mayrand.ca/fr/nos-produits/produits-laitiers/fromage/fromage-de-specialite/fromage-tete-de-moine-switzerland-26390), current Québec product page. | Uses the title `Tête de Moine AOP 880 g`, shows SKU 26390, and publishes package and product details. Supports local Québec French display and one SKU's 880 g package size. Its stated 60-day aging conflicts with S01; the page does not establish compliance with the protected specification. |
| `WP06-EUROPE-TETE-DE-MOINE-R414-20261017-S06` | Mayrand, [English item 26390](https://mayrand.ca/en/our-products/cheese-and-dairy/cheese/swiss-comte-gruyere-cheese/fromage-tete-de-moine-switzerland-26390), same SKU as S05. | Uses the title `PDO Tête de Moine Cheese 880 g`. Supports the Québec retailer's English title order and the same SKU package amount; not an independent specification or measurement source. |
| `WP06-EUROPE-TETE-DE-MOINE-R414-20261017-S07` | Switzerland Cheese Marketing, [Fondue à la Tête de Moine AOP](https://www.fromagesdesuisse.fr/inspiration/recettes/detail/fondue-a-la-tete-de-moine-aop), ingredients and preparation. | One four-portion formula lists 300 g Tête de Moine and 500 g Gruyère, roughly grated. Supports only this recipe's amount and co-use; not a general per-person serving or substitution rule. |

## Disposition

Proceed with one identity-only **`CHEESE`** row for **Tête de Moine AOP / PDO Tête de Moine cheese**, with **Fromage de Bellelay** as its French alias, if accepted. Use the current BLW cahier des charges for the protected boundary. Keep product forms, SKU weights, wheel-weight ranges, and the four-serving fondue amount scoped to their own source contexts. Add no reusable measures, forms, conversions, package yields, bundled recipe links, or substitutions. The Europe-wide regional coverage checklist remains open.

No software tests, build, emulator run, or deployment were performed because this is a proposal-only documentation change.
