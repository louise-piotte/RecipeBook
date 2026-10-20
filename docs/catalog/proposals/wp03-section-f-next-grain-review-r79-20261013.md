# WP03 Section F R79 — puffed brown rice identity review

- **Date:** 2026-10-13.
- **Chosen open checklist item:** `[ ] Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.` ([live Section F checklist, line 2757](../../RecipeBook-global-ingredient-catalog-plan.txt#L2757)).
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, `puffed brown rice / riz brun soufflé`, with no aliases.
- **Scope:** Plain, single-ingredient brown rice expanded by heat and pressure. The review does not cover sweetened or coated rice cereals, puffed-rice snacks, rice cakes, brown-rice flakes, or cooked brown rice.

## Decision and product boundary

Yupik currently markets SKU P31093 as **Organic Puffed Brown Rice**. Its official English page lists organic puffed brown rice as the only ingredient and describes heating rice kernels under high pressure with steam to form puffed grains [S01]. The official French product page names the same SKU **Riz brun soufflé (bio)** and lists **riz brun soufflé biologique** as its ingredient [S02]. A Québec recipe from La Tablée des Chefs also names **riz brun soufflé** and uses it in bars [S04]. Together these sources support a specific, searchable brown-rice product and a Québec-attested French phrase.

The existing puffed-rice row remains the broader process identity. The historical Canadian General Standards Board specification defines its puffed-rice class as whole dehulled rice with bran either retained or removed, and the government catalogue marks that specification withdrawn in April 2020 [WP03-S103, WP03-S104]. This class overlap means brown puffed rice belongs to the broader puffed-rice class; it does not make **brown** a synonym for unqualified puffed rice. The live catalog already distinguishes brown rice from generic rice. Preserve that source-attested milling qualifier in the picker as a narrow identity, rather than attaching it as an alias that would return a generic display label. This does not assert a universal product specification for all brands.

Puffing is part of the product identity, not a dry/cooked state form. Keep the existing `ingredient-ref-puffed-rice` row and its `muri`/`murmura` aliases unchanged. Do not add `riz brun soufflé` or `puffed brown rice` to the generic row, and do not add white-puffed-rice cross-products or a broader puffed-cereal alias.

## Ownership and archive audit

The read-only live snapshot contains **1,403 references, 104 forms, 63 legacy candidates, and 1,741 ledger records** ([reference catalog](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), and [research ledger](../research-ledger.v1.json)). The exact candidate check used the same case, accent, punctuation, and whitespace normalization as [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Surface | Current owner or overlap | R79 result |
|---|---|---|
| `ingredient-ref-puffed-rice` | `puffed rice / riz soufflé`, `GRAIN_AND_CEREAL`, English aliases `muri` and `murmura`, no French aliases, null density, empty unit mappings. Its accepted identity source set already includes historical class source `WP03-S104`. | Keep it as the unqualified process class. Do not attach brown-qualified wording as an alias. |
| Brown-rice references | `ingredient-ref-brown-rice` is `brown rice / riz brun`, with English `hulled rice` and French `riz cargo`, `riz complet`; separate rows cover brown-rice flakes, flour, syrup, and sprouted brown rice. | None denotes puffed brown rice. Preserve the ordinary brown-rice row and all its aliases. |
| Forms and legacy candidates | No form label or match term, and no legacy candidate, owns `puffed brown rice`, `brown rice puffs`, `riz brun soufflé`, or `riz brun soufflé biologique`. | Add no form or legacy mapping. |
| Proposed ID and exact phrase | No active reference, form, legacy candidate, or ledger record ID owns `ingredient-ref-puffed-brown-rice` or the exact bilingual names. The new source-ID prefix `WP03-PUFFBROWN-R79-20261013` is unused. | The new ID and four new source IDs below are collision-free in the current snapshot. |
| Prior proposal/archive | The only earlier exact phrase mention found is a one-recipe puffed-Khorasan alternative in the [R10 Khorasan-puff review](wp03-section-f-next-gap-review-20261012-round10.md#L109). Its ledger decision says no replacement quantity or tested equivalence and rejects a general or contextual substitution. It is not a focused brown-rice identity decision. | Do not reopen or adopt that substitution suggestion. No earlier brown-puffed-rice identity or alias allocation was found. |
| R74–R78 work | The R74 pearl-millet-flakes/Bajra Poha hold, R75 kishk hold, R76 Rogers blend, R77 Mighty Tasty cereal, and R78 Korean Mixed 7 Grains hold concern other products. | No overlap; this packet does not reopen them. |

## Bundled demand and picker boundary

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for exact and normalized variants of `puffed brown rice`, `brown rice puffs`, `puffed brown rice cereal`, `riz brun soufflé`, and `riz brun soufflé biologique`, as well as neighboring puffed-rice terms and ingredient IDs. The scan found **zero bundled recipe files, rows, or links** for the candidate or existing puffed-rice row. The external Québec bar recipe is one separate source of demand: it calls for **4 cups** of riz brun soufflé; it gives no mass or brand [S04]. No bundled recipe link or recipe edit is proposed.

The picker projection below follows `IngredientSearch.kt`: complete normalized word phrases take priority, followed by substring fallback only if no complete phrase matches. It includes current names and aliases, no forms, and the proposed reference. With this behavior, exact `puffed rice` and `riz soufflé` queries continue to show only the generic row; they do not enumerate the brown-qualified row. That is the current picker boundary, and a future request to show all related variants from a generic query would require a deliberate search-model change.

| Query | Current result | With proposed row |
|---|---|---|
| `puffed brown rice` | No result. | `ingredient-ref-puffed-brown-rice` — `puffed brown rice / riz brun soufflé`. |
| `riz brun soufflé` | No result. | `ingredient-ref-puffed-brown-rice` — `puffed brown rice / riz brun soufflé`. |
| `puffed rice` or `riz soufflé` | `ingredient-ref-puffed-rice` only. | Same generic result only. |
| `muri` or `murmura` | `ingredient-ref-puffed-rice` only. | Same generic result only; no aliases are inherited. |
| `brown rice` or `riz brun` | Five rows: brown rice, brown-rice flakes, brown-rice flour, brown-rice syrup, and sprouted brown rice. | Those five plus `ingredient-ref-puffed-brown-rice`. The broad query stays broad. |

## Numeric and culinary limits

| Dimension | Evidence | Proposed handling |
|---|---|---|
| Product/process identity | Yupik lists one ingredient and describes pressure-and-steam puffing [S01, S02]. The historical CGSB class permits bran to be retained or removed [WP03-S104]. | One product identity. Do not describe a standardized puffing method or a universal formulation. |
| Form | No source supports a catalog state form. Puffing defines this processed product; it is not a raw/cooked form pair. | Add no `IngredientForm`, no dry/cooked form, and no form conversion. |
| Measurement | Yupik's bilingual nutrition panel reports **1 cup (15 g)** for its P31093 SKU [S01, S02]. The Québec recipe reports **4 cups**, without mass or brand [S04]. | If integrated, retain one manufacturer-label portion observation for this SKU only. Do not derive 4 cups = 60 g, because the recipe does not identify P31093. Leave `defaultDensity` null and `unitMappings` empty; the cup convention and filling method are not stated. |
| Conversion and yield | No source reports a reusable cup-to-mass factor, a raw-rice-to-puffed-rice conversion, or a cooking yield. | Add no conversion, density, processing expansion ratio, cooking yield, or package yield. |
| Substitution | The archived R10 blog says puffed brown rice could replace Khorasan puffs in that particular recipe, but supplies no replacement amount or tested equivalence; the ledger already rejects inferring a global or contextual rule [R10 archive]. | Add no global or contextual substitution and infer no reverse-direction replacement. Keep this product separate from puffed wheat, puffed Khorasan wheat, crispy rice cereal, rice cakes, and prepared snack products. |

## Exact future data delta

If integrated, add exactly one identity reference to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-puffed-brown-rice",
  "nameEn": "puffed brown rice",
  "nameFr": "riz brun souffl\u00e9",
  "aliasesEn": [],
  "aliasesFr": [],
  "category": "GRAIN_AND_CEREAL",
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z"
}
```

Add one `ingredient_reference` record for `ingredient-ref-puffed-brown-rice` to `research-ledger.v1.json`, with `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: researched_no_supported_substitute`. Register sources S01–S04 below and reuse existing `WP03-S104` for the historical bran-inclusion class locator; do not create another record for the withdrawn standard. Reuse `WP03-KHORASAN-PUFFS-20261012-S06` from the existing puffed-Khorasan ledger record for the bounded substitution finding; it is not a new source ID. Add one ledger-only `manufacturer_label`/`portion_weight` observation, ID `yupik-puffed-brown-rice-p31093-one-cup-15g-r79`, with `sourceQuantity: {"amount": 1, "unit": "cup"}`, `value: 15`, `valueUnit: "g"`, `observedMassG: 15`, and `sourceIds: ["WP03-PUFFBROWN-R79-20261013-S01", "WP03-PUFFBROWN-R79-20261013-S02"]`. Its quantity basis must say the cup convention and fill method are unspecified and the value is specific to Yupik SKU P31093. Add this bounded substitution finding (no replacement array):

```json
{
  "findingId": "puffed-brown-rice-khorasan-substitution-no-supported-r79-20261013",
  "researchState": "researched_no_supported_substitute",
  "fromIngredientRefId": "ingredient-ref-puffed-khorasan-wheat",
  "context": "Reusable replacement of puffed Khorasan wheat by puffed brown rice; the only reviewed mention is one recipe-specific suggestion.",
  "basis": "The archived recipe blog suggests puffed brown rice in its own Khorasan-puff cereal recipe but gives no replacement quantity or tested equivalence. The existing puffed-Khorasan ledger review rejects a general or contextual runtime rule based on that evidence.",
  "limitations": [
    "The suggestion is limited to one recipe and has no replacement quantity.",
    "The reviewed source does not support a reusable or runtime substitution rule.",
    "Do not infer the reverse direction or substitutions for other puffed grains."
  ],
  "rejectedCandidates": [
    {
      "candidate": "Puffed brown rice as a general or runtime replacement for puffed Khorasan wheat.",
      "reason": "One recipe-specific suggestion without a replacement amount or tested equivalence does not support a general or contextual rule.",
      "sourceIds": ["WP03-KHORASAN-PUFFS-20261012-S06"]
    }
  ],
  "sourceIds": ["WP03-KHORASAN-PUFFS-20261012-S06"]
}
```

Add no ingredient form, recipe link, active measure, density, unit mapping, conversion, yield, or supported substitution. Leave `ingredient-ref-puffed-rice` untouched.

## Evidence and uncertainty

| Source ID | Source | What it supports and limits |
|---|---|---|
| `WP03-PUFFBROWN-R79-20261013-S01` | Yupik, [Organic Puffed Brown Rice](https://yupik.com/en/organic-puffed-brown-rice-p31093), SKU P31093. | Official manufacturer page names the product, lists organic puffed brown rice as its sole ingredient, describes high-pressure steam puffing and culinary uses, and reports 1 cup (15 g). The English page says the origin is the United States. Its label portion is SKU-specific. |
| `WP03-PUFFBROWN-R79-20261013-S02` | Yupik, [Riz brun soufflé (bio)](https://yupik.com/fr/organic-puffed-brown-rice-p31093), SKU P31093. | Official French page uses the title `Riz brun soufflé (bio)`, lists `Riz brun soufflé biologique` as the sole ingredient, and repeats the one-cup/15 g panel. It says the origin is Sri Lanka, conflicting with the English page for the same SKU. Use neither origin as an identity property. |
| `WP03-PUFFBROWN-R79-20261013-S03` | Yupik, [À propos](https://yupik.com/fr/a-propos). | The company describes itself as a Canadian family-owned company and says it ships across Canada. It says only products marked “Préparé au Canada” are processed/packaged at its Montreal facilities; this SKU is not claimed to be Canadian-made. |
| `WP03-PUFFBROWN-R79-20261013-S04` | Recettes du Québec / La Tablée des Chefs, [Barres au riz brun soufflé](https://www.recettes.qc.ca/recettes/recette/barres-au-riz-brun-souffle). | Québec recipe title and ingredient wording attest `riz brun soufflé`; the ingredient list uses 4 cups for a bar recipe. No brand, mass, cup convention, or replacement ratio is stated. |
| `WP03-S103`, `WP03-S104` (existing ledger sources) | Government of Canada Publications, [standard catalogue record](https://publications.gc.ca/site/eng/9.841373/publication.html) and [CAN/CGSB-32.13-88 PDF](https://publications.gc.ca/collections/collection_2017/ongc-cgsb/P29-5-032-013-1988.pdf). | The catalogue marks the 1988 bilingual standard withdrawn in April 2020. Section 5.3.1 historically defines Class A puffed rice as whole dehulled rice, with or without bran removal, expanded by heat. Historical class evidence only; not a current product standard or measure. |

The exact English and French product names, single-ingredient statement, and pressure/steam process align across Yupik's language pages. The two pages disagree on country of origin, so country is excluded from the proposed identity. The withdrawn standard shows that “puffed rice” is a wider process class that can include both bran-retaining and bran-removed rice; the narrower brown-rice display is retained because the product and Québec recipe specifically name it, and the live picker already represents brown rice as its own milling identity. Evidence supports this one identity and its search terms, not a normalized standard covering every brand or recipe.

## Static review record

- Re-read current [`AGENTS.md`](../../../AGENTS.md), the live Section F checklist, the puffed-rice and brown-rice references, forms, legacy candidates, relevant ledger records, R74–R78 decisions, and the proposal/batch archive before writing this packet.
- Audited exact names, aliases, IDs, forms, legacy ownership, source-ID prefix, prior proposal mentions, and bundled recipe lines/links against the live JSON. Confirmed the picker results by mirroring `IngredientSearch.kt` matching behavior.
- Rechecked the current Yupik English and French product pages, Yupik's Canadian-company page, the Québec recipe, and the existing government standard sources. No outside source was treated as a general cup conversion.
- Static file checks for UTF-8/no BOM, final newline, trailing whitespace, and local Markdown link targets were run after writing. No tests or emulator were run: this is proposal-only research, and the current `AGENTS.md` says database-JSON-only additions need no tests.
