# WP03 Section J: green onion and scallion identity review

- **Reviewed:** 2026-10-11
- **Status:** Proposal only. No shared catalog, research ledger, recipe, plan, roadmap, code, or test file was changed.
- **Scope:** The active `ingredient-ref-green-onions` identity, its exact aliases/forms, its two linked recipe lines, and matching source-specific portion evidence. Pearl/pickling onions and the broader unresolved Section J list are boundary checks only.
- **Recommendation:** Verify the existing green-onion identity against OQLF, Agriculture and Agri-Food Canada (AAFC), Health Canada's CNF, and current Québec retail naming. Keep the same identity and category; add only singular spellings of its established English/French names and OQLF's accepted `ognon` spelling. Add CNF source-specific portion observations to the ledger, but do not activate density, unit mappings, a form, conversions, yields, package weights, or substitutions. Keep spring-onion, bunching-onion, ciboule, `échalote verte`, and pearl/pickling terms out of aliases pending their identity/usage boundaries.

## Snapshot and audit

The review used the live bundled package and research ledger on 2026-10-11.

| Artifact | Snapshot | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,002 refs | `5bccacd9c8fce798564d34c2d6288e83e0b01d50db7bd73055f0cb12601a4660` |
| `ingredient-forms.v1.json` | 63 forms | `9eb6df4d64f73297a77fbf494fd77f037f05e3ff4169f103d57157e0b6c24147` |
| `research-ledger.v1.json` | 1,281 records | `216fc09b509426e4bfbdd4ac3f623bcee769e4b61b8e3e33606bc11c2b3e861c` |
| Manifest-listed recipes | 114 recipes, 1,123 ingredient rows | recipe-corpus hash `e71f84fbe273b879772e717786f0629bf8e9a3efbb5278e8550f5bdd6faa5bb2` |
| `legacy-import-identities.v1.json` | 75 candidates | exact names/aliases scanned |

The recipe-corpus hash is SHA-256 over each manifest-listed relative recipe path, a NUL byte, that recipe file's SHA-256 hex digest, and a newline, concatenated in manifest order.

The current active reference is:

```json
{
  "id": "ingredient-ref-green-onions",
  "nameFr": "oignons verts",
  "nameEn": "green onions",
  "aliasesFr": [],
  "aliasesEn": ["scallions"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-03-23T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

There are no forms attached to this reference and no form whose label or match terms exactly own any green-onion, scallion, spring-onion, or pearl-onion query. The current ledger row is `identityState: unreviewed`, `measurementState: not_yet_researched`, `substitutionResearchState: not_yet_researched`, with empty `sources` and `decisions`.

Candidate terms were checked by exact normalized search key against active reference names/aliases, form labels/match terms, and legacy names/aliases, using the app's `normalize_search_key` routine. `green onions` and `scallions` are already owned by `ingredient-ref-green-onions`. The proposed singular variants `green onion`, `scallion`, `oignon vert`, and `ognon vert` currently have no exact owner in those datasets. `ingredient-ref-shallot` owns `shallot`, `échalote française`, and `échalote sèche`; the legacy file still contains a stale same-ID shallot candidate. No active `ciboule` identity was found. These exact-match results do not erase the regional semantic ambiguity described below.

## Identity, aliases, and form decision

OQLF defines *oignon vert* as an immature onion, identifies *Allium cepa*, gives *oignon vert* and *oignon nouveau* as preferred French terms, and lists *green onion*, *scallion*, *spring onion*, *salad onion*, and *immature onion* as English terms. Its Québec usage note explicitly warns that *oignon vert* and *échalote* can refer either to an immature *A. cepa* onion or to ciboule (*A. fistulosum*); *échalote française* denotes the distinct shallot. AAFC's 2024 Canadian allium crop profile separately identifies commercial green onions as *A. cepa* and distinguishes them from dry onions and shallots. It describes green onions as harvested while the tops are green, before a bulb forms. The English and French profile pages do not use every market term consistently, so this review does not treat *bunching onion* or *oignon à botteler* as safe global aliases.

A Québec Metro product listing uses the shelf name `Oignons verts` and sells it as `1 botte`. This corroborates the current bilingual grocery name and the retail bunch package, but supplies no bunch mass or number of onions. IGA's Québec onion article calls the same grocery item `échalote verte`; because OQLF documents the local overlap with the separate shallot identity, that retailer wording is evidence of regional usage, not a safe catalog alias.

### Proposed active reference

Keep one identity, not separate green-onion and scallion identities. Keep the current bilingual display names, classification, null density, and empty unit mappings. Add only singular/orthographic variants of the established bilingual label and its existing English alias:

```json
{
  "id": "ingredient-ref-green-onions",
  "nameFr": "oignons verts",
  "nameEn": "green onions",
  "aliasesFr": ["oignon vert", "ognon vert"],
  "aliasesEn": ["scallions", "green onion", "scallion"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

Do not add a second identity, form, or reference-to-form conversion. The whole immature green-onion product is the ingredient identity in this scope. Chopped and thinly sliced are recipe preparations already expressed on their lines. Retail `1 botte` is packaging; it is not an ingredient form or a standardized count/mass.

### Terms to keep out of active aliases

| Term | Decision | Boundary |
|---|---|---|
| `spring onion`, `oignon nouveau`, `salad onion`, `immature onion` | Hold | OQLF lists these in the same terminology record, but no bundled ingredient row uses them. Spring onion can be a regional/product term; keep the wider English/French synonym set pending independent Québec bilingual review rather than expanding the live search surface without demand. |
| `bunching onion`, `oignon à botteler` | Hold | AAFC's English and French crop-profile pages do not align on the term: the English page presents bunching onion as a synonym, while the French page cautions against `oignon à botteler`. Avoid a bilingual cross-market alias until this conflict is reviewed. |
| `échalote`, `échalote verte` | Exclude | OQLF documents the Québec overlap with both immature onion and ciboule; unqualified `échalote` also belongs to active shallot usage. IGA's market wording is not a universal identity boundary. |
| `ciboule`, `cive` | Exclude | OQLF identifies ciboule as *Allium fistulosum*, distinct from the *A. cepa* green-onion entry and from common chives. No active ciboule row or direct recipe line warrants merging it here. |
| `pearl onion`, `cocktail onion`, `pickling onion`, `oignon perle`, `oignon perlé`, `oignon à mariner` | Exclude from this identity | OQLF defines a very small, immature bulb and says the pearl/cocktail/pickling names apply more specifically to small onions used in marinades. This is a size/maturity/use boundary, not evidence that they are scallions or a prepared pickled-onion product. There are no matching recipe rows. |
| `green tops`, `onion tops`, `chives` | Exclude | Green onions include the bulb and tops in CNF's food name; tops alone and common chives are not synonyms of the whole ingredient. |

## Recipe-line demand and source drift

The 1,123-row scan found exactly two ingredient rows linked to this reference and no pearl/pickling-onion, `spring onion`, or `oignon nouveau` ingredient-row hits.

| Recipe line | Stored row | Recipe context | Audit result |
|---|---|---|---|
| `019#6` (`135813a6-75e2-4596-8c71-ffd450fab0ca-ingredient-6`) | `2 green onions, chopped`; quantity `2`, unit `count`; `ingredient-ref-green-onions` | Mixed into the crab-ball binder with egg, yogurt, mustard, lemon, seasoning, crab, and crumbs. | Publisher page still says `2 green onions, chopped`. No size or matching volume is stated. Keep the count unchanged and do not map it to grams. |
| `066#3` (`e0a437cb-da80-4fd5-954d-87caf3b299e7-ingredient-3`) | `3 green onions, thinly sliced`; quantity `3`, unit `item`; `ingredient-ref-green-onions` | Thinly sliced into the soy marinade for Korean soy-marinated eggs. | The current linked publisher page, updated 2026-08-12, now says `3 medium scallions` and its method says this is about `1/2 cup`. The bundled line is older and does not include *medium*. Record the source drift; do not silently rewrite the seed row or apply a size-specific weight to its unsized `item` quantity. |

The linked original publisher pages are S07 and S08 below. In the current Kitchn version, its “Helpful Swaps” section mentions tamari, quail eggs, and jalapeño for serrano, but gives no scallion replacement. The Eat Yourself Skinny page gives no green-onion replacement. No contextual substitution is supported for either recipe role.

## Measurement and conversion disposition

Health Canada's CNF food code `2144` describes raw spring/green onion or scallion including tops and bulb. It publishes these source-specific portions:

| Relationship | Source quantity | Published mass | Qualifiers |
|---|---|---:|---|
| `count_weight` | 1 small green onion | 5.0 g | 7.6 cm long; CNF reports 4% refuse as rootlets. |
| `count_weight` | 1 medium green onion | 15.0 g | 10.5 cm long; CNF reports 4% refuse as rootlets. |
| `count_weight` | 1 large green onion | 25.0 g | Length not stated; CNF reports 4% refuse as rootlets. USDA SR28 NDB 11291 independently also gives 1 large = 25 g. |
| `portion_weight` | 15 mL chopped | 6.1 g | Raw; no loose/packed method stated. |
| `portion_weight` | 100 mL chopped | 42.3 g | Raw; no loose/packed method stated. |
| `portion_weight` | 125 mL chopped | 52.8 g | Raw; no loose/packed method stated. |
| `portion_weight` | 250 mL chopped | 105.7 g | Raw; no loose/packed method stated. |

Propose preserving these seven CNF portions as observations on `ingredient-ref-green-onions`, with `measurementState: researched_supported`. The raw, size-qualified count observations do not match either stored recipe line: 019 omits size, and stored 066 also omits size despite its later publisher update. The chopped-volume observations are not conversions for either line: 019 provides a count without volume, while 066 says thinly sliced rather than chopped. CNF's 4% rootlet refuse is retained as source context only; it is not a general whole-bunch edible-yield factor.

USDA SR28 NDB 11291 reports one large onion at 25 g, one cup chopped at 100 g, and one tablespoon chopped at 6 g. Keep that source distinct from CNF: USDA's cup convention is not established in the record, whereas CNF reports metric millilitres. Do not average or convert the chopped observations across sources. In particular, the CNF chopped-volume portion weights do not establish a general `g/mL` density; their packing method and preparation match are not established.

Proposed source IDs use the prefix `WP03-J-GREEN-ONIONS-20261011`. Store the count and chopped portions only in the evidence ledger; leave `defaultDensity: null` and `unitMappings: []`. Do not add a runtime count/item mapping, an edible-yield conversion, cooking yield, dried/frozen/canned form, unit conversion, or package yield. Metro's one-bunch retail pack is not weighed, and the 63 active forms contain no green-onion form. The only current package-yield record belongs to S&W canned black beans. The active global and contextual substitution-rule arrays are both empty; there is no green-onion rule.

### Proposed ledger update

Update only the existing `ingredient-ref-green-onions` ledger record:

```json
{
  "recordId": "ingredient-ref-green-onions",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_supported",
  "substitutionResearchState": "not_yet_researched"
}
```

Append the eight source records in the evidence register, then record the identity and measurement decisions below. Keep substitution research `not_yet_researched` because this pass found no recipe-supported replacement but did not complete a separate general substitution survey; add no `substitutionFindings` and no active substitution rule.

**Proposed decisions**

1. `accepted` — Verify `ingredient-ref-green-onions` as the source-backed Canadian grocery identity `green onions / oignons verts`, *Allium cepa*, harvested before bulb formation. Add only the singular/orthographic aliases in the proposed reference JSON. Keep the broader regional and species overlaps listed above out of aliases. Sources: S01, S02, S05, S06.
2. `accepted` — Preserve the CNF size-qualified raw count portions and chopped-volume portions as source-specific published observations. The values do not support active recipe-line mappings or density; no current recipe row exactly matches a sized-count or chopped-volume portion. Sources: S03, S04, S07, S08.

**Proposed `measurementObservations` array**

```json
[
  {
    "observationId": "ingredient-ref-green-onions-raw-small-count-weight-cnf-2026-2144",
    "relationship": "count_weight",
    "value": 5.0,
    "valueUnit": "g",
    "foodDescription": "Onion, spring (green) or scallion (includes tops and bulb), raw; CNF food code 2144.",
    "foodState": "Raw; the CNF food description includes tops and bulb and reports 4% rootlet refuse.",
    "measurementMethod": "Health Canada CNF food code 2144 serving-portion record 2144: one small onion, 7.6 cm long, is 5.0 g.",
    "quantityBasis": "One source-defined small onion only. Preserve the 7.6 cm size and rootlet-refuse qualifier; do not apply to an unsized recipe count or to a whole retail bunch.",
    "evidenceKind": "published_portion",
    "sourceIds": ["WP03-J-GREEN-ONIONS-20261011-S03"],
    "sourceQuantity": {"amount": 1, "unit": "small green onion (7.6 cm long)"},
    "observedMassG": 5.0
  },
  {
    "observationId": "ingredient-ref-green-onions-raw-medium-count-weight-cnf-2026-2144",
    "relationship": "count_weight",
    "value": 15.0,
    "valueUnit": "g",
    "foodDescription": "Onion, spring (green) or scallion (includes tops and bulb), raw; CNF food code 2144.",
    "foodState": "Raw; the CNF food description includes tops and bulb and reports 4% rootlet refuse.",
    "measurementMethod": "Health Canada CNF food code 2144 serving-portion record 2144: one medium onion, 10.5 cm long, is 15.0 g.",
    "quantityBasis": "One source-defined medium onion only. Preserve the 10.5 cm size and rootlet-refuse qualifier; do not apply to the stored 066 line, whose bundled wording omits medium.",
    "evidenceKind": "published_portion",
    "sourceIds": ["WP03-J-GREEN-ONIONS-20261011-S03"],
    "sourceQuantity": {"amount": 1, "unit": "medium green onion (10.5 cm long)"},
    "observedMassG": 15.0
  },
  {
    "observationId": "ingredient-ref-green-onions-raw-large-count-weight-cnf-2026-2144",
    "relationship": "count_weight",
    "value": 25.0,
    "valueUnit": "g",
    "foodDescription": "Onion, spring (green) or scallion (includes tops and bulb), raw; CNF food code 2144.",
    "foodState": "Raw; the CNF food description includes tops and bulb and reports 4% rootlet refuse. The source gives no length for large.",
    "measurementMethod": "Health Canada CNF food code 2144 serving-portion record 2144: one large onion is 25.0 g; USDA SR28 NDB 11291 independently reports one large at 25 g.",
    "quantityBasis": "One source-defined large onion only. The source gives no length; preserve the separate rootlet-refuse qualifier and do not apply to an unsized recipe count.",
    "evidenceKind": "published_portion",
    "sourceIds": ["WP03-J-GREEN-ONIONS-20261011-S03", "WP03-J-GREEN-ONIONS-20261011-S04"],
    "sourceQuantity": {"amount": 1, "unit": "large green onion"},
    "observedMassG": 25.0
  },
  {
    "observationId": "ingredient-ref-green-onions-raw-chopped-15ml-cnf-2026-2144",
    "relationship": "portion_weight",
    "value": 6.1,
    "valueUnit": "g",
    "foodDescription": "Onion, spring (green) or scallion (includes tops and bulb), raw, chopped; CNF food code 2144.",
    "foodState": "Raw, chopped; the CNF food description includes tops and bulb and reports 4% rootlet refuse.",
    "measurementMethod": "Health Canada CNF food code 2144 serving-portion record 2144: 15 mL chopped is 6.1 g.",
    "quantityBasis": "Source-specific chopped metric-volume portion. CNF does not establish loose/packed preparation; this is not a density and does not match either stored recipe quantity.",
    "evidenceKind": "published_portion",
    "sourceIds": ["WP03-J-GREEN-ONIONS-20261011-S03"],
    "sourceQuantity": {"amount": 15, "unit": "mL, chopped", "unitConvention": "Metric millilitres as reported by CNF."},
    "observedMassG": 6.1
  },
  {
    "observationId": "ingredient-ref-green-onions-raw-chopped-100ml-cnf-2026-2144",
    "relationship": "portion_weight",
    "value": 42.3,
    "valueUnit": "g",
    "foodDescription": "Onion, spring (green) or scallion (includes tops and bulb), raw, chopped; CNF food code 2144.",
    "foodState": "Raw, chopped; the CNF food description includes tops and bulb and reports 4% rootlet refuse.",
    "measurementMethod": "Health Canada CNF food code 2144 serving-portion record 2144: 100 mL chopped is 42.3 g.",
    "quantityBasis": "Source-specific chopped metric-volume portion. CNF does not establish loose/packed preparation; this is not a density and does not match either stored recipe quantity.",
    "evidenceKind": "published_portion",
    "sourceIds": ["WP03-J-GREEN-ONIONS-20261011-S03"],
    "sourceQuantity": {"amount": 100, "unit": "mL, chopped", "unitConvention": "Metric millilitres as reported by CNF."},
    "observedMassG": 42.3
  },
  {
    "observationId": "ingredient-ref-green-onions-raw-chopped-125ml-cnf-2026-2144",
    "relationship": "portion_weight",
    "value": 52.8,
    "valueUnit": "g",
    "foodDescription": "Onion, spring (green) or scallion (includes tops and bulb), raw, chopped; CNF food code 2144.",
    "foodState": "Raw, chopped; the CNF food description includes tops and bulb and reports 4% rootlet refuse.",
    "measurementMethod": "Health Canada CNF food code 2144 serving-portion record 2144: 125 mL chopped is 52.8 g.",
    "quantityBasis": "Source-specific chopped metric-volume portion. CNF does not establish loose/packed preparation; this is not a density and does not match either stored recipe quantity.",
    "evidenceKind": "published_portion",
    "sourceIds": ["WP03-J-GREEN-ONIONS-20261011-S03"],
    "sourceQuantity": {"amount": 125, "unit": "mL, chopped", "unitConvention": "Metric millilitres as reported by CNF."},
    "observedMassG": 52.8
  },
  {
    "observationId": "ingredient-ref-green-onions-raw-chopped-250ml-cnf-2026-2144",
    "relationship": "portion_weight",
    "value": 105.7,
    "valueUnit": "g",
    "foodDescription": "Onion, spring (green) or scallion (includes tops and bulb), raw, chopped; CNF food code 2144.",
    "foodState": "Raw, chopped; the CNF food description includes tops and bulb and reports 4% rootlet refuse.",
    "measurementMethod": "Health Canada CNF food code 2144 serving-portion record 2144: 250 mL chopped is 105.7 g.",
    "quantityBasis": "Source-specific chopped metric-volume portion. CNF does not establish loose/packed preparation; this is not a density and does not match either stored recipe quantity.",
    "evidenceKind": "published_portion",
    "sourceIds": ["WP03-J-GREEN-ONIONS-20261011-S03"],
    "sourceQuantity": {"amount": 250, "unit": "mL, chopped", "unitConvention": "Metric millilitres as reported by CNF."},
    "observedMassG": 105.7
  }
]
```

No source supports a general substitution between green onions and shallots, chives, onion bulbs, or onion powder. Do not add a global or contextual substitution finding/rule from similar flavor or shared culinary role alone.

## Evidence register

All sources were checked on 2026-10-11. Source IDs are proposal-local and have not been added to the shared ledger.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-J-GREEN-ONIONS-20261011-S01` | OQLF, [oignon vert](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083674/oignon-vert), updated 2018; definition, preferred terms, English terms, Latin name, and Québec usage note. | Defines an immature *Allium cepa* onion; supports `oignon vert`, `oignon nouveau`, and English terms including `green onion` and `scallion`; allows `ognon` spelling. Also documents Québec overlap with ciboule and shallot, so not every listed term is safe as an unqualified catalog alias. |
| `WP03-J-GREEN-ONIONS-20261011-S02` | Agriculture and Agri-Food Canada, [Crop Profile for Allium Vegetables in Canada, 2024](https://agriculture.canada.ca/en/science/agriculture-and-agri-food-research-centres/pest-management-centre/pesticide-risk-reduction-pest-management-centre/crop-profiles/crop-profile-allium-vegetables-canada-2024) and [profil français](https://agriculture.canada.ca/fr/science/centres-recherche-lagriculture-lagroalimentaire/centre-lutte-antiparasitaire/reduction-risques-lies-aux-pesticides-au-centre-lutte-antiparasitaire/profils-culture/profil-cultures-legumes-du-genre-allium-au-canada-2024); 2024 crop profile, fifth edition 2025, opening crop description. | Identifies Canadian commercial green onion as *A. cepa*, harvested before bulb formation, and distinguishes dry onion and shallot. The English page calls green onions bunching onions/scallions; its paired French page warns that `oignon à botteler` and `échalote` are sometimes used incorrectly. The term mismatch is why bunching/bottling aliases remain held. |
| `WP03-J-GREEN-ONIONS-20261011-S03` | Health Canada, [Canadian Nutrient File serving portion, food code 2144](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=2144); item name, household portion list, and refuse. | Names raw spring/green onion or scallion including tops and bulb; publishes the three size-qualified count masses, four chopped metric-volume masses, and 4% rootlet refuse. These are source-specific portions, not runtime conversions or density. |
| `WP03-J-GREEN-ONIONS-20261011-S04` | USDA ARS, [Standard Reference Release 28, Food Group 11](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg11.pdf), NDB 11291, `Onions, spring or scallions (includes tops and bulb), raw`, common-measure block (2015). | Corroborates one large = 25 g and publishes chopped volume measures. The source's cup volume convention is not established here; do not merge its cup value with the CNF metric-millilitre entries. |
| `WP03-J-GREEN-ONIONS-20261011-S05` | Metro Québec, [Oignons verts, product 4068](https://www.metro.ca/epicerie-en-ligne/allees/fruits-et-legumes/legumes/oignons-et-poireaux/oignons-verts/p/4068), grocery listing. | Current Québec product label is `Oignons verts`, offered as `1 botte`. Confirms shelf name/package form only; gives no number of pieces or mass. |
| `WP03-J-GREEN-ONIONS-20261011-S06` | IGA Québec, [Oignons : sélection, conservation et recettes](https://www.iga.ca/fr/articles/oignons), green-onion paragraph. | Uses `échalote verte` for the green-onion grocery item in Québec. This documents regional wording; it does not override OQLF's distinction/overlap note or make that phrase a stable shallot alias. |
| `WP03-J-GREEN-ONIONS-20261011-S07` | Eat Yourself Skinny, [Baked Crab Cake Balls with Sriracha Dipping Sauce](https://www.eatyourselfskinny.com/baked-crab-cake-bites-with-sriracha-dipping-sauce/), ingredient list and method. | Directly matches recipe `019#6`: two chopped green onions in the crab mixture; no size or replacement is given. |
| `WP03-J-GREEN-ONIONS-20261011-S08` | The Kitchn, [Korean Soy-Marinated Jammy Eggs](https://www.thekitchn.com/korean-soy-marinated-eggs-recipe-23636937), page update 2026-08-12; ingredients, method, and Helpful Swaps. | Current publisher version says `3 medium scallions`, about `1/2 cup`, thinly sliced. The bundled line is older (`3 green onions`, no size). The source's swaps do not mention scallions. Do not infer a bundled recipe mass or change its text from this later page without a separate recipe-reconciliation decision. |

## Open gaps

- The broader Section J onion checklist remains open. This review does not resolve the identity-versus-form level for pearl/pickling onions or the meaning of spring onion across regions.
- Independent bilingual review remains useful for the alias boundary, especially `oignon nouveau`, `spring onion`, `bunching onion`, `oignon à botteler`, and the Quebec market use of `échalote verte`.
- Recipe `066#3` has source drift: the current publisher's size-qualified ingredient differs from the saved recipe row. Keep that as a separate recipe-source reconciliation item.
- CNF's size-qualified portions remain separate from both bundled recipe rows; chopped portions do not establish density or match thinly sliced preparation. No runtime measure, yield, package weight, or substitution is supported by this batch.
