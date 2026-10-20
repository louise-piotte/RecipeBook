# WP02 Section 04 B3 R122 — resistant wheat starch identity boundary

- **Reviewed:** 2026-10-15.
- **Status:** Integrated on 2026-10-15; see [the batch README](../batches/wp02-b3-modified-and-resistant-wheat-starch-identity-integration-20261015/README.md).
- **Scope:** The specific resistant wheat starch class Health Canada describes as chemically
  phosphorylated, cross-linked wheat starch. This review follows the boundary left open in the
  [R121 modified-wheat-starch review](wp02-b3-r121-modified-wheat-starch-identity-review-20261014.md).
- **Proposal-local source-ID prefix:** `WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015`; checked
  against the current source register and proposal archive with no collision found.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for **resistant wheat starch / amidon résistant
de blé**, proposed as `ingredient-ref-resistant-wheat-starch`. Keep both alias lists empty, density
null, unit mappings empty, and add no forms, recipe links, conversions, yields, or substitutions.

Health Canada's accepted-fibre list describes a wheat starch chemically modified with
phosphorylating agents to form cross-linked phosphorylated starch. That is a process-defined
resistant-starch class, narrower than the general class of modified wheat starch. A current
Canadian distributor lists Fibersym® RW, an example of resistant wheat starch, for Canada, while
giving the label ingredient name `Wheat Starch, Modified`. This supports a separate identity for
resistance-qualified recipes while also showing that a package's broad common name may not identify
the subtype. [S01–S06]

Use `resistant wheat starch / amidon résistant de blé` as the display pair. Health Canada's
published French table uses the exact French phrase `amidon résistant de blé`; OQLF prefers
`amidon` as the general term and uses `fécule` more specifically for starch in tubers or other
underground organs. Wheat is a cereal, so do not use `fécule` here. OQLF does not have a reviewed
headword for this resistant product name; the proposed display uses the exact federal French term,
and independent Québec review remains appropriate. [S01, S03–S04]

Keep this reference distinct from ordinary `wheat starch / amidon de blé` and from the broad
`modified wheat starch / amidon de blé modifié` proposed in R121. Do not infer that every modified
wheat starch is resistant or phosphorylated. Health Canada's accepted-fibre table names the
resistant wheat product class as `resistant wheat starch or modified wheat starch` in English and
`amidon résistant de blé ou amidon modifié de blé` in French; its accompanying definition limits
that paired naming to the cross-linked, phosphorylated material. [S01–S02]

### Proposed reference delta

```json
{
  "id": "ingredient-ref-resistant-wheat-starch",
  "nameEn": "resistant wheat starch",
  "nameFr": "amidon résistant de blé",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Do not add `modified wheat starch`, `Wheat Starch, Modified`, `amidon de blé modifié`, or
`amidon modifié de blé` as aliases. The first two are used as broad Canadian label names for the
specific product as well as for other modified wheat-starch products; the R121 row should own the
general label wording. The latter French order appears in Health Canada's entry for this specific
cross-linked fibre, but it contains the shorter ordered phrase `amidon modifié`; under the current
picker's phrase-first matching, that alias would make the broad `amidon modifié` query select only
this specific row and hide the broader modified-starch result. Keep `Fibersym® RW`, `FiberRite® RW`,
`RS4`, and `cross-linked wheat starch` as source/product or technical wording, not active aliases.
The exact resistance-qualified English and French names are sufficient to select this identity.

If accepted, add a verified `ingredient_reference` ledger record with
`measurementState: researched_no_supported_value` and
`substitutionResearchState: researched_no_supported_substitute`. Do not copy product-level fibre
content or packaging details into density or kitchen mappings.

## Current identity and picker audit

The active reference JSON contains **1,465** references and **105** forms. It has ordinary
`wheat starch / amidon de blé` at `ingredient-ref-wheat-starch` with French alias
`amidon de froment`. It has no active modified-wheat-starch or resistant-wheat-starch row. The
ledger contains **1,806** records, including the verified ordinary wheat-starch record whose
measurement and substitution states remain `not_yet_researched`; it has no resistant-wheat-starch
record. No exact candidate phrase or proposed ID is owned by an active reference, form, legacy
candidate, or ledger record. The 63 legacy candidates were checked. R121 is the only earlier focused
proposal that raises the resistance-qualified boundary.

The current picker normalizes accents, punctuation, and spacing, prefers complete word-phrase
matches, then falls back to partial matching. The projection below assumes R121's proposed broad
modified-wheat-starch row is also accepted:

| Query | Current results | With R121 and this proposal |
|---|---|---|
| `resistant wheat starch` | None | Resistant wheat starch |
| `amidon résistant de blé` | None | Resistant wheat starch |
| `modified wheat starch` | None | Modified wheat starch |
| `amidon de blé modifié` | None | Modified wheat starch |
| `wheat starch` | Wheat starch | Wheat starch; modified wheat starch; resistant wheat starch |
| `amidon de blé` | Wheat starch | Wheat starch; modified wheat starch |
| `amidon modifié` / `modified starch` | None | None |

The Canadian distributor's French entry for Fibersym® RW says `amidon de blé modifié`, and the
manufacturer reports the common label name `Modified Wheat Starch` for Fibersym® RW and
FiberRite® RW. Thus, a search using only that package wording resolves to the broader R121 identity;
the label itself does not distinguish the resistant subtype. Resistance-qualified recipe wording
resolves to the proposed row. This limitation reflects the source wording and is preferable to
assigning a broad term to one subtype.

The candidate ID is unreserved pending review. No forms, legacy aliases, recipe links, or other
existing ownership require a migration or reconciliation.

## Canadian and Québec identity evidence

Health Canada's published accepted-fibre list groups `resistant wheat starch` with `modified wheat
starch` and defines this accepted fibre as wheat starch chemically modified by phosphorylating
agents to form cross-linked phosphorylated starch. The table classifies it as a novel fibre source
that produces energy-yielding metabolites and allows accepted fibre sources in unstandardized foods
subject to stated exclusions. This is an ingredient identity and regulatory-use boundary, not proof
that all modified wheat starch has this chemistry or that the class is sold in consumer-size bags.
The English and French pages are bilingual versions of the same Health Canada source, updated
2021-06-25. [S01–S02]

Quadra's current Canadian supplier listing identifies Fibersym® RW as supplied by MGP Ingredients,
with Canada as its regional availability, product code F01936, powdered physical form, and the
ingredient name `Wheat Starch, Modified`. Its French listing uses `Amidon de blé modifié` while
describing the product as an `amidon de blé résistant`. It reports fibre content above 90% on a dry
basis. This is current Canadian distributor evidence for one named ingredient product, not a
consumer retail listing, a Québec-specific inventory confirmation, a universal specification for
all resistant wheat starch, or a kitchen measure. Targeted searches on 2026-10-15 for
`amidon résistant de blé` and Fibersym® with Québec, Canada, and grocery terms did not surface a
Québec grocery listing or local consumer package for the resistant grade; the Québec evidence here is
terminology guidance and the supplier's French product entry. [S05–S06]

MGP's current product page describes Fibersym® RW as a granular RS4-type resistant wheat starch.
MGP also describes a separate product, FiberRite® RW, in its historical Health Canada approval
announcement. Its 2013 company announcement says Health Canada accepted those named resistant
starch products as dietary-fibre sources in unstandardized foods and reports `Modified Wheat
Starch` as their common label name. Treat that label-name statement as a manufacturer report about
the named products; Health Canada's published accepted-fibre list is the primary source for the
class and process definition. [S07–S08]

## Measurement and substitution boundaries

- No reviewed source gives a household cup or spoon amount, a product-specific kitchen mass per
  volume, or a consumer package serving that can become a reusable mapping. Keep `defaultDensity`
  null and `unitMappings` empty. The distributor's `>90%` total dietary-fibre figure is a dry-basis
  composition claim, not a density or conversion. The supplier's industrial powder format does not
  establish how a home cook would scoop it. [S05–S06]
- A primary white-pan-bread study tested replacing bread flour with phosphorylated cross-linked
  RS4 resistant wheat starch at **5%, 10%, 15%, 20%, and 25%**, with vital wheat gluten added to
  maintain the control flour's protein level. Mixograph water absorption rose by **2%** at the
  20% and 25% treatments. These are trial-specific bread formulations, not a general wheat-flour
  substitution range; they do not test other starches, gluten-free doughs, or ordinary recipes.
  Add no global or contextual substitution rule. [S09]
- MGP's current food FAQ states that the amount of Fibersym® RW depends on the particular recipe and
  the desired fibre claim, calculated for a defined serving. This supports treating recipe and
  nutrition requirements as formulation-specific, not as a reusable mass-for-mass replacement.
  [S10]
- Do not infer a gluten-free claim from the wheat-based identity. MGP says Fibersym can be made
  gluten-free through a special process and supplies lot-specific gluten information; that is not
  a property of every resistant wheat starch or every lot and does not establish a Québec or
  Canadian claim for this identity. [S11]

## Bundled recipe demand

The manifest names **114** recipe files; scanning those files counted **1,123** ingredient rows.
No exact or partial text match was found for `resistant wheat starch`, `amidon résistant de blé`,
`amidon modifié de blé`, `modified wheat starch`, `wheat starch`, or `amidon de blé`. The bundled
corpus provides no current demand, conversion context, or recipe-level substitution for this
candidate. This is a bundled-library result only.

## Reconsideration conditions

If accepted, integrate this as a separate resistance-qualified identity from both native and broad
modified wheat starch. Keep the broad Canadian label phrases on the generic modified row and retain
the resistance-qualified display names as the only exact picker owners for the subtype. Keep the B3
regional-starch checklist open. Revisit aliases only if an exact Québec product name or independently
reviewed local terminology establishes a useful, non-overlapping phrase.

## Sources

Sources accessed on 2026-10-15. IDs are local to this proposal and have not been added to the shared
research ledger.

| ID | Source and evidence boundary |
|---|---|
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S01** | Health Canada, [*List of Dietary Fibres Reviewed and Accepted by the Food Directorate*](https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-reviewed-accepted-dietary-fibres.html), English page updated 2021-06-25. Lists resistant wheat starch / modified wheat starch as a specific accepted fibre and defines the phosphorylated, cross-linked process. It does not define all modified wheat starch or provide a recipe measure. |
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S02** | Health Canada, [*Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments*](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html), French page updated 2021-06-25. Uses `amidon résistant de blé` / `amidon modifié de blé` for the same cross-linked, phosphorylated class. This is federal French wording, not an OQLF headword. |
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S03** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Prefers `amidon` generally and describes `fécule` more narrowly for starch in tubers or underground organs. It does not name resistant wheat starch. |
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S04** | Office québécois de la langue française, [*amidon de froment* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432751/amidon-de-froment). Supports ordinary `wheat starch`, `amidon de blé`, and `amidon de froment`; it does not define the resistant or modified subtype. This is also cited in the R121 proposal. |
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S05** | Quadra Canada, [Fibersym® RW product listing](https://www.quadragroup.store/brands/fibersym-1d4fd9be-8773-485c-bdb7-3a6123281bd0), current English page; product code F01936, Canada availability, MGP supplier, and ingredient name `Wheat Starch, Modified`. The current listing identifies the item as resistant wheat starch but is not a consumer retail or Québec inventory guarantee. |
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S06** | Quadra Canada, [French Canadian Fibersym brand listing](https://www.quadragroup.store/fr-CA/brands/fibersym-1d4fd9be-8773-485c-bdb7-3a6123281bd0), current localized brand page. Uses `Amidon de blé modifié` as the ingredient name and describes Fibersym as resistant wheat starch. The supplier page shows Canada availability but does not guarantee Québec inventory or consumer-size packaging. |
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S07** | MGP Ingredients, [Fibersym® RW](https://www.mgpingredients.com/food-ingredients/products/line/fibersym/fibersym-rw.html), current manufacturer page. Describes a granular RS4-type resistant wheat starch for food formulators. Its product claims and composition are product-specific. |
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S08** | MGP Ingredients, [*Health Canada Approves MGP’s Resistant Starches as Dietary Fiber Sources*](https://www.mgpingredients.com/more-information/news-press/news-releases/health-canada-approves-mgps-resistant-starches-dietary), 2013 manufacturer announcement. Reports Health Canada's acceptance of Fibersym® RW and FiberRite® RW and their `Modified Wheat Starch` common label name. It is a company report of a historical letter, not the primary current regulatory source. |
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S09** | Miller and Bianchi, [*Effect of RS4 Resistant Starch on Dietary Fiber Content of White Pan Bread*](https://doi.org/10.1094/CCHEM-03-16-0048-R), *Cereal Chemistry* 94 (2017), 185–189. Primary study of 5–25% bread-flour replacement using phosphorylated cross-linked RS4 and additional vital wheat gluten; it reports a 2% increase in mixograph water absorption at 20% and 25%. The results are limited to the experimental white-pan-bread formula. |
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S10** | MGP Ingredients, [Food FAQ](https://mgpingredients.com/food-ingredients/resources/food-faq.html), current manufacturer page. States Fibersym® RW usage depends on the specific recipe and dietary-fibre claim. It does not support a general substitution ratio or household measure. |
| **WP02-B3-RESISTANT-WHEAT-STARCH-R122-20261015-S11** | MGP Ingredients, [Food FAQ, gluten-free wheat-starch products](https://mgpingredients.com/food-ingredients/resources/food-faq.html), current manufacturer page. Says Fibersym may be made gluten-free through a specialized process and accompanied by lot-specific gluten information for U.S. criteria. This does not support a gluten-free claim for all wheat starches, resistant wheat starch, or Canadian/Québec products. |

## Static review performed

- Re-read `AGENTS.md`, the open Section 04 B3 checklist, the R91/R92/R94/R96/R116 integration notes,
  the R119/R120 product-boundary holds, and the R121 modified-wheat-starch proposal.
- Audited active references and forms, legacy candidates, ledger ownership, the picker implementation,
  and the 114-file package manifest. The exact candidate ID and proposal-local source-ID prefix are
  unused; source-qualified names do not collide with active identity ownership.
- Mirrored `IngredientSearch.kt` phrase-first and partial-match behavior for the query table; this is
  a static projection, not an app test.
- Scanned the manifest-listed recipe files and ingredient rows for the candidate and nearby wheat-
  starch phrases; none matched.
- Integrated with its accepted identity-only reference and research-ledger record on 2026-10-15. No
  app, Gradle, instrumentation, emulator, or deployment tests were run under the updated JSON-only
  rule; package, ledger, normalization, and generated-index static checks are recorded in the batch
  README.
