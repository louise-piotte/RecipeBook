# WP05 Section W R977 generic kimchi-type gap review: nabak-kimchi

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity, naming, measurement, and substitution review. This file is the only write; the shared catalog, ledger, plan, roadmap, recipes, and tests were not changed.
- **Plan anchor:** WP05 Section W leaves [named kimchi types](../../RecipeBook-global-ingredient-catalog-plan.txt#L10338) open. R944 explicitly retained nabak-kimchi as a separate type from dongchimi in the [dongchimi review](wp05-plan-generic-gap-r944-20261019.md); R947 kept that boundary in its [baek-kimchi review](wp05-plan-generic-gap-r947-20261019.md).
- **Recommendation:** Add identity-only `nabak-kimchi / nabak-kimchi`, with the source-attested English spelling alias `nabakkimchi`. Keep the French display as a provisional borrowed name. Do not add broad `water kimchi` or `mul-kimchi` aliases. Add no forms, reusable measures, recipe links, conversions, yields, or active substitutions.
- **Scope:** One generic Korean named kimchi preparation. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. Preserve all existing identities and their evidence.

## Live ownership and queue audit

Recounted the shared data on 2026-10-19, after the R972–R974 integration:

| Artifact | Count |
|---|---:|
| Active ingredient references | 1,992 |
| Ingredient forms | 205 |
| Legacy-import candidates | 55 |
| Research-ledger records | 2,397 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

Accent-, punctuation-, and case-normalized scans covered active reference names and aliases, form names and match terms, legacy candidates, and ledger records. Searches included `nabak-kimchi`, `nabak kimchi`, `nabakkimchi`, `nabak-gimchi`, `nabakji`, `na-bak-kimchi`, `나박김치`, `mul-kimchi`, `mul kimchi`, `물김치`, `water kimchi`, `radish water kimchi`, and `radish and cabbage water kimchi`. No active row, form, legacy candidate, or ledger identity owns the proposed `ingredient-ref-nabak-kimchi`. The proposed source-ID prefix `WP05-SECTIONW-NABAK-KIMCHI-R977-20261019-` and the reviewed Korea.net, Korea Tourism Organization, and Maangchi URLs have no current ledger owner. The only matching active substring for broad `water kimchi` wording belongs to the existing English alias `radish water kimchi` on `ingredient-ref-dongchimi`; it is not an exact `water kimchi` alias. The generic term also appears in source text on other Korean-condiment ledger records, which is evidence mention rather than ownership of nabak-kimchi.

The proposal archive contains no earlier dedicated nabak-kimchi identity packet. R944 named nabak-kimchi as an unresolved neighbouring type and explicitly did not assign it to dongchimi. The current open Section W checklist also leaves named kimchi types open. No roster-only queue item was encountered. If one appears in later work, classify it as out of scope because commercial-product counts do not add ingredient diversity, then stop that line.

Nearby identities establish boundaries, not duplicate ownership:

| Existing identity | Boundary retained |
|---|---|
| `ingredient-ref-kimchi` | Generic kimchi; it does not own named nabak-kimchi. |
| `ingredient-ref-dongchimi` | Named radish-water kimchi with its own source record and the alias `radish water kimchi`. Keep it separate from nabak-kimchi. |
| `ingredient-ref-baek-kimchi` | Named white kimchi; no source makes it a nabak-kimchi synonym or form. |
| `ingredient-ref-kkakdugi` | Diced-radish kimchi; its vegetable cut and preparation are distinct. |
| `ingredient-ref-gat-kimchi` | Leaf-mustard kimchi; its mustard-leaf identity remains distinct. |
| `ingredient-ref-pickled-radish` | Generic salt-and-vinegar pickle; it is not a kimchi alias or proven replacement. |

Keep the broad phrases `water kimchi` and `mul-kimchi` out of the proposed aliases. Korea Tourism Organization sources use water-kimchi wording for nabak-kimchi, while the existing dongchimi source independently uses radish-water-kimchi wording for another named preparation. The French KTO page calls nabak-kimchi `mul-kimchi`, but that broader family label is not exclusive enough to assign to this identity. Do not alter the dongchimi, generic kimchi, or gat-kimchi rows or their evidence.

## Recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned, including ingredient fields and serialized recipe text. The candidate and romanized, Hangul, and broad water-kimchi queries listed above returned no hits. The bundled corpus supplies no direct demand, target dish, or recipe role; no recipe link or relinking is proposed. The external KTO meal pairings and the Korea.net example are regional culinary-use evidence, not bundled demand. [S01–S02]

## Identity and bilingual naming

Korea.net, published by the Republic of Korea's Ministry of Culture, Sports and Tourism and prepared with the World Institute of Kimchi, describes nabak-kimchi as thin square slices of salted cabbage and radish in salted water with seasonings. Its cited preparation includes red chili, garlic, spring onion, ginger, and minari; the page says it is served cold and has a mild taste. This supports a named preparation distinct from generic kimchi and dongchimi, without establishing a universal ingredient list, colour, spice level, or fermentation duration. [S01]

The Korea Tourism Organization labels a separate entry `Water Kimchi (나박김치 / Nabakkimchi)` and describes cabbage and radish in a refreshing broth. Its French kimchi overview uses `nabak-kimchi` in its French text. Use `nabak-kimchi` in both display fields and add only the source-attested unhyphenated English spelling `nabakkimchi`. The OQLF's generic `kimchi` entry supports the borrowed parent term and its spellings, not a Québec-specific name for this subtype. Keep the fr-CA display explicitly provisional; add no French alias or invented descriptive translation. [S02–S03; reused `WP05-EAST-S06`]

Do not add `water kimchi`, `mul-kimchi`, `radish water kimchi`, `white kimchi`, `kimchi d'eau`, or a broad radish-and-cabbage translation as aliases. The first two can refer to a wider water-kimchi family; `radish water kimchi` already belongs to dongchimi; and the other wording is not source-attested as a unique nabak-kimchi name. Do not map nabak-kimchi to dongchimi, baek-kimchi, kkakdugi, or generic pickled radish.

## Measurement and substitution review

The Korea.net article includes one cherry-tomato recipe that lists `600 g of nabak kimchi` among its ingredients, then says in the method to add `600 ml of nabak kimchi`. Preserve this as a conflicting, recipe-specific source observation if it is recorded; do not select one unit, convert it, or treat either amount as a reusable measure. The page's three-day preparation note is also specific to its cited method. The KTO descriptions provide no package size, serving amount, density, unit mapping, or finished-food yield. If integrated, use `measurementState: researched_no_supported_value`, `defaultDensity: null`, and `unitMappings: []`; add no forms, measurements, conversions, or yields. [S01–S02]

The KTO describes nabak-kimchi alongside meals, snacks, and rice-cake soup. Maangchi says it may be served with rice, rice cake, porridge, or sweet potatoes and calls it a substitute for soup or stew; that is a dish-level serving suggestion, not a recommendation to replace another ingredient in a specified recipe. No reviewed source provides a finished nabak-kimchi ingredient replacement with a target dish role, method, ratio, or adjustment. The bundled recipes contain no target context. If integrated, keep substitution research `blocked_pending_evidence`; do not activate a global or contextual substitution, or link it to another kimchi identity. [S02, S04]

Proposed bounded substitution finding (ledger-only, not an active rule):

```json
{
  "findingId": "nabak-kimchi-no-safe-ingredient-substitute-r977-20261019",
  "researchState": "blocked_pending_evidence",
  "fromIngredientRefId": "ingredient-ref-nabak-kimchi",
  "context": "Replacement review for finished nabak-kimchi in an unspecified recipe; the bundled recipe corpus has no matching line or target dish role.",
  "basis": "KTO describes nabak-kimchi as an accompaniment with meals and snacks. Maangchi's soup-or-stew comparison is a dish-level serving suggestion, not a recipe-specific recommendation to replace another ingredient.",
  "limitations": [
    "No reviewed source establishes a target dish, ingredient role, method, quantity basis, ratio, or adjustment for replacing finished nabak-kimchi.",
    "Do not treat dongchimi, baek-kimchi, kkakdugi, generic kimchi, or pickled radish as a universal replacement."
  ],
  "rejectedCandidates": [],
  "replacements": [],
  "sourceIds": [
    "WP05-SECTIONW-NABAK-KIMCHI-R977-20261019-S02",
    "WP05-SECTIONW-NABAK-KIMCHI-R977-20261019-S04"
  ]
}
```

## Proposed minimal data and ledger state

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-nabak-kimchi` |
| `nameEn` | `nabak-kimchi` |
| `nameFr` | `nabak-kimchi` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | `nabakkimchi` (KTO spelling) |
| French aliases | None |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| Forms, recipe links, reusable measures, conversions, yields, active substitutions | None |

Proposed ledger states: `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: blocked_pending_evidence`, with the bounded finding above. Use new source IDs S01–S04 for nabak-kimchi claims. Reuse `WP05-EAST-S06` for the OQLF parent-term claim; it does not name the subtype. Keep the existing dongchimi evidence on its current record. This packet proposes no shared-data edits.

## Source register

Sources were reviewed online on 2026-10-19. Claims are kept within each source's scope.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-NABAK-KIMCHI-R977-20261019-S01` | Republic of Korea, Ministry of Culture, Sports and Tourism / World Institute of Kimchi, [Nabak kimchi with pickled cherry tomato](https://www.korea.net/NewsFocus/Culture/view?articleId=199014). | Defines the named preparation and gives one example formula and use. The article lists 600 g nabak-kimchi, then directs the reader to add 600 ml; retain that conflict as source-specific and infer no generic measure. The listed ingredients and three-day method are not universal. |
| `WP05-SECTIONW-NABAK-KIMCHI-R977-20261019-S02` | Korea Tourism Organization, [Water Kimchi (나박김치 / Nabakkimchi)](https://english.visitkorea.or.kr/svc/contents/contentsView.do?vcontsId=179909). | Pairs the Korean name with the English spelling and describes cabbage-and-radish water kimchi and broad serving context. It does not establish a universal recipe, amount, or unique alias for the wider water-kimchi family. |
| `WP05-SECTIONW-NABAK-KIMCHI-R977-20261019-S03` | Korea Tourism Organization, [Kimchi — French overview](https://english.visitkorea.or.kr/svc/contents/infoBscView.do?vcontsId=140803). | Uses `nabak-kimchi` in French text and describes it as a water-rich, mild type. Supports the borrowed display as an observed French rendering, not an OQLF or Québec-specific term. Its `mul-kimchi` wording is not proposed as a unique alias. |
| **Reused `WP05-EAST-S06`** | Office québécois de la langue française, [kimchi (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529902/kimchi). | Supports the French parent term `kimchi` and its listed spellings. It does not name nabak-kimchi or its subtype. Targeted OQLF searches for `nabak-kimchi`, `nabak kimchi`, `nabakkimchi`, and `나박김치` found no subtype entry. |
| `WP05-SECTIONW-NABAK-KIMCHI-R977-20261019-S04` | Maangchi, [Nabak-kimchi (Vegetable and Fruit Water Kimchi)](https://www.maangchi.com/recipe/nabak-kimchi), updated 2023. | Describes the preparation and several meal pairings. Its soup-or-stew statement is meal-level context; it does not give a recipe-specific ingredient replacement, ratio, or adjustment. It is not a Québec terminology authority. |

**Disposition:** Propose one identity-only generic `nabak-kimchi / nabak-kimchi` reference and the single source-attested English spelling alias `nabakkimchi`. Keep the French display provisional. Keep broad water-kimchi wording unassigned, preserve all neighbouring identities, and record no reusable measures or active substitutions. No commercial-product roster was researched. No software tests were run because this is proposal-only work.

## Document checks

- UTF-8 decoded cleanly without a byte-order mark, replacement character, or mojibake marker.
- The relative plan and proposal links resolve; external source links use HTTPS.
- The proposed substitution finding parses as JSON, and its source IDs resolve to the source register.
- The recount confirms 1,992 references, 205 forms, 55 legacy candidates, 2,397 ledger records, and 114 recipes / 1,123 ingredient rows.
- No trailing whitespace was found. No software tests were run for this proposal-only packet.
