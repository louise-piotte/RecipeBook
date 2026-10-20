# WP02 Section 04 B3 R126 — resistant tapioca starch identity review

- **Reviewed:** 2026-10-15.
- **Status:** Integrated into the reference catalog and shared ledger; see the [R126 batch
  README](../batches/wp02-b3-resistant-tapioca-starch-identity-integration-r126-20261015/README.md).
  At the review snapshot, this was proposal-only and no shared catalog or planning file had changed.
- **Open checklist:** Section 04 B3 remains open at “Water-chestnut flour and other documented
  regional starches.”
- **Scope:** A tapioca-derived resistant starch class, especially products described as RS4, and
  its boundary with the existing general `modified tapioca starch` identity.
- **Proposal-local source-ID prefix:**
  `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015`; no collision was found in the active ledger,
  proposal archive, or batch archive.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for **resistant tapioca starch / amidon résistant
de tapioca**. Add only the two source-attested label variants `modified resistant tapioca starch`
and `amidon de tapioca résistant modifié` as aliases. Keep the identity separate from ordinary
`tapioca starch` and from R94's broader `modified tapioca starch / amidon de tapioca modifié`.
Keep `defaultDensity` null and `unitMappings` empty. Add no forms, conversions, yields, recipe
links, or active substitutions.

This is a distinct resistance-qualified material class, not a claim that all modified tapioca
starches are resistant. The study literature identifies RS4 as chemically modified starch, while
the current product labels and suppliers use resistance-qualified wording for tapioca-derived
products. The exact Canadian and Québec market phrases support a narrow picker identity. They do
not establish one shared modification chemistry, grade, fibre percentage, standalone consumer
package, or home-cooking replacement ratio. [S05–S11]

### Proposed reference delta

```json
{
  "id": "ingredient-ref-resistant-tapioca-starch",
  "nameEn": "resistant tapioca starch",
  "nameFr": "amidon résistant de tapioca",
  "aliasesEn": ["modified resistant tapioca starch"],
  "aliasesFr": ["amidon de tapioca résistant modifié"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Do not alias bare `RS4`, `resistant starch`, `modified tapioca starch`, or `amidon de tapioca
modifié` to this identity. Do not add the combined label `amidon résistant de tapioca et/ou de
pomme de terre`: it leaves the botanical source open. Do not treat `resistant tapioca fiber`,
`tapioca fiber`, or soluble tapioca fiber as synonyms; those names can describe different
ingredients and were not established as equivalent by this review. [S01–S08]

If accepted, add an `ingredient_reference` ledger record with
`measurementState: researched_no_supported_value` and
`substitutionResearchState: researched_no_supported_substitute`. Attach the source IDs below to that
record. Do not add study-specific percentages or trial portions as catalog measurements or
reusable unit mappings.

## Identity and boundary

The active catalog already contains `ingredient-ref-tapioca-starch` for ordinary extracted starch
and `ingredient-ref-modified-tapioca-starch` from R94 for the broad plant-qualified modified
starch identity. R94 preserves one Expandex portion and one recipe-specific substitution as
bounded evidence; neither finding describes RS4 products generally. [R94]

The CFIA common-name table says ordinary starch is named with the plant plus “starch,” while
modified starch uses “modified” plus the plant name plus starch. Its French table gives `amidon de`
plus the plant name for starch, and adds `modifié/modifiée` for modified starch. These rules support
keeping the broad modified-tapioca name on the R94 row; they do not establish `modified tapioca
starch` as equivalent to the more specific resistance-qualified product class. [S01–S02]

Health Canada's accepted dietary-fibre list describes resistant/high-amylose corn starch, resistant
green-banana starch, two potato classes, and resistant wheat starch, but has no tapioca RS4 row in
the version checked. The document expressly says its accepted-fibre list is not exclusive. Its
omission therefore does not establish that tapioca RS4 is prohibited or unaccepted in Canada, and
this review makes no regulatory approval conclusion. No tapioca-specific Canadian class definition
was found in that list. [S03]

The Quebec French display follows the exact ingredient phrase used on Carbonaut's French Canadian
product page. OQLF's general `amidon` entry supports the preferred headword but does not define a
resistant-tapioca term. Marché Tau's current French product page uses the alternate order
`amidon de tapioca résistant modifié`, which supports the one French alias. The Carbonaut phrase
`amidon résistant de tapioca et/ou de pomme de terre` is not an alias because its source may be
tapioca, potato, or both. [S04–S06]

The identity is not tied to one modification method. Mah et al. describe RS4 as chemically modified
starch and study a tapioca-derived phosphorylated product, Actistar 75330. ADM's current Texperien®
Edge listing describes a resistant tapioca product but does not publish a specific modification
chemistry in the page reviewed. Ettlinger's Fibioca RS4 page describes another tapioca RS4 grade,
but says it is currently unavailable and expected back by Q2 2027. Keep all of these supplier and
study specifics out of the general reference name. [S07–S10]

## Canadian and Québec market evidence

- ADM's current North-American product page describes resistant tapioca starch as cassava-root
  derived and promotes it for food formulation. ADM's direct-order page lists Texperien® Edge
  RT7490 in a 50 lb bag as available to order. This establishes a current commercial product
  category, but that storefront does not confirm Canadian shipping, Québec inventory, or a
  consumer-size package. Its 90% dietary-fibre figure is a product claim, not a class-wide value.
  [S07–S08]
- Carbonaut's French Canadian bun page currently lists `amidon résistant de tapioca et/ou de pomme
  de terre`. It is direct evidence for Canadian French naming in a finished food, but its `et/ou`
  wording does not identify which starch source is present in a given product or package. [S05]
- A Montréal retailer's Carbonaut white-bread product page lists `Modified resistant tapioca starch`,
  supporting the English alias exactly. Its stock indicator has no dated inventory record; the page
  supports the label phrase, not standalone-starch availability. [S11]
- Marché Tau's French listing for Carbonaut white bread showed the item in stock when checked and
  states `Amidon de tapioca résistant modifié`. This is a current Québec retail example of the
  alternate French phrase. It is a retailer transcription for a finished bread, not a standalone
  ingredient specification or independent confirmation of the production process. [S06]
- The `fr-ca` ADM page renders English content. It supports the supplier's product category but is
  not evidence of Québec French usage. The French phrases above come from the Carbonaut and Marché
  Tau pages. [S05–S08]

The market evidence is sufficient for an identity and narrow label aliases. It does not show a
widely available standalone resistant-tapioca bag in Québec. The previously found 2021 British
Canadian Importers offer was not used to establish present availability. A separate current
supplier's unavailability notice is product-specific and does not establish that resistant tapioca
starch as a whole is unavailable. [S09–S10]

## Current identity, picker, and recipe demand

At the review snapshot, the active catalog contains **1,474 references** and **106 forms**. It has
ordinary tapioca starch and the R94 general modified-tapioca row, but no resistant-tapioca row. The
candidate ID, proposed exact English/French names, and both proposed aliases are not owned by an
active reference or form. The source-ID prefix is not present in the active ledger or proposal and
batch archive. The live manifest lists **114 recipes**. [current package; `IngredientSearch.kt`]

The picker normalizes accents, punctuation, and spacing, then prefers complete word-phrase matches
before partial matches. Projection with the proposed row gives:

| Query | Current results | With proposal |
|---|---|---|
| `resistant tapioca starch` | None | Resistant tapioca starch |
| `amidon résistant de tapioca` | None | Resistant tapioca starch |
| `modified resistant tapioca starch` | None | Resistant tapioca starch |
| `amidon de tapioca résistant modifié` | None | Resistant tapioca starch |
| `modified tapioca starch` | Modified tapioca starch | Modified tapioca starch only |
| `amidon de tapioca modifié` | Modified tapioca starch | Modified tapioca starch only |
| `tapioca starch` | Modified tapioca starch; tapioca starch | Those two plus resistant tapioca starch |
| `tapioca` | Brazil tapioca granulada; modified tapioca starch; tapioca pearls; tapioca starch | Those four plus resistant tapioca starch |
| `RS4` | None | None |
| `resistant starch` | None | None |
| `amidon résistant` | High-amylose corn starch; resistant green banana starch; resistant wheat starch | Those three plus resistant tapioca starch |
| `amidon résistant de tapioca et/ou de pomme de terre` | None | None; the combined source wording remains unassigned |

The narrow alias captures the Québec retail phrase without taking ownership of R94's broader
`modified tapioca starch` query. Broad tapioca queries gain a separate result; resistance-qualified
queries resolve to the new row. Bare RS4 remains unassigned because it denotes a resistant-starch
type across different source plants and products. [S01–S06; R94; `IngredientSearch.kt`]

The manifest-listed corpus has **114 recipe files and 1,123 ingredient rows**. A scan of every
listed recipe found no candidate-specific hit for resistant-tapioca wording, RS4/tapioca wording,
Actistar, Texperien, Fibioca, or resistant cassava starch. Existing ordinary tapioca references are
not evidence of demand for this resistant class. Do not add recipe links or relink ordinary starch
uses. This is a bundled-library result, not a claim about external recipe demand.

## Numeric, form, and substitution decisions

- **Density and mappings:** Keep `defaultDensity` null and `unitMappings` empty. ADM's 90% dietary
  fibre claim and Actistar's 88.6% measured fibre content are product-specific compositions; neither
  is mass per volume or a scoop measure. The 50 lb industrial package is not a household unit
  mapping. [S07–S09]
- **Study amount:** The controlled breakfast-bar study used 27 g of Actistar 75330 in its test bar
  and found the RS4 bar drier and more crumbly than its control. That 27 g is a clinical test-food
  formulation, not a typical serving, household measure, or general recipe quantity. Do not make
  it a reusable conversion or a density observation. [S09]
- **Forms:** Add no ingredient form. RS4 identifies a process-defined resistant starch class, not a
  reversible cooking state such as cooked, drained, or dried.
- **Substitution:** Add no global or contextual substitution. The study's bar formulation is a
  product-specific comparison with a corn-starch control, and ADM's “replaces flour” statement has
  no general ratio. The measured texture difference is a reason not to generalize from either
  source. R94's Expandex-to-regular-tapioca finding remains limited to its cited sopapillas recipe
  and does not transfer to RS4. [S07–S09; R94]
- **Research state if integrated:** Record that no reusable household measurement or substitute was
  supported. Preserve the study's product, trial amount, fibre assay, and texture note only in
  source-scoped narrative evidence if the ledger schema and review accept such observations.

## Sources

External source IDs below are local to this proposal and have not been added to the shared research
ledger. Sources were checked on 2026-10-15 except where a specific publication date is given.

| ID | Source and evidence boundary |
|---|---|
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S01` | CFIA, [Common Names for Ingredients and Components](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components), Table 1, items 20–21; page last amended 2026-02-11. Distinguishes ordinary starch from modified starch naming; does not define resistant tapioca starch. |
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S02` | CFIA, [Noms usuels d’ingrédients et de constituants](https://inspection.canada.ca/fr/propos-lacia/lois-reglements/liste-lois-reglements/documents-incorpores-renvoi/noms-usuels-dingredients-constituants), Table 1, items 20–21. Gives French construction for ordinary and modified starch names; does not define RS4. |
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S03` | Health Canada, [List of Dietary Fibres Reviewed and Accepted by the Food Directorate](https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-reviewed-accepted-dietary-fibres.html), updated 2021-06-25, table 1 and note at page introduction. Lists resistant starch categories but no tapioca row; says the list is not exclusive. Absence is not proof of prohibition or non-acceptance. |
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S04` | OQLF, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Supports `amidon` as the preferred general term; does not define resistant tapioca starch. |
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S05` | Carbonaut Canada, [Petits pains à hamburger Carbonaut Original](https://carbonaut.fr/product/hamburger/), French ingredient statement. Uses `amidon résistant de tapioca et/ou de pomme de terre`; the combined phrase is botanically ambiguous and does not identify one ingredient source in every package. |
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S06` | Marché Tau, [Carbonaut Pain Blanc Sans Gluten Keto 550 g](https://marchestau.com/pain-blanc-sans-gluten-keto-550gr), French product listing. Showed `En inventaire` and `Amidon de tapioca résistant modifié` at review time. This is one Quebec retail listing for a finished food, not a stand-alone starch specification. |
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S07` | ADM, [Resistant Starches](https://www.adm.com/fr-ca/produits-et-services/nutrition-humaine/produits/amidons/resistant-starches/), current manufacturer page. Identifies a cassava-root-derived resistant tapioca starch, but gives no SKU or Canadian/Québec inventory confirmation; page content is English despite its French-Canada route. |
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S08` | ADM, [Texperien® Edge RT7490 Resistant Tapioca Starch](https://www.admbuydirect.com/ordering/items/texperien-edge-rt7490-resistant-tapioca-starch), current direct-order listing. Lists a 50 lb bag as available to order and a 90% insoluble-fibre claim. The storefront does not establish Canadian shipping, Québec inventory, or a household measure. |
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S09` | Mah et al., [Substitution of Corn Starch with Resistant Starch Type 4 in a Breakfast Bar](https://pmc.ncbi.nlm.nih.gov/articles/PMC6186909/), *Current Developments in Nutrition* 2(10), 2018, methods and study-products sections. Primary randomized crossover study using 27 g of Cargill Actistar 75330, a phosphorylated tapioca RS4; reports 88.6% dietary fibre and a drier, more crumbly test bar. One author is Cargill-affiliated; all figures and texture findings are product/formula-specific. |
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S10` | Ettlinger Corporation, [Fibioca RS4](https://ettlingercorp.com/fibioca-rs-tapioca-starch/), current supplier notice. Describes a tapioca RS4 product but says production is paused and expected availability is Q2 2027. This is one product's status, not a market-wide availability finding. |
| `WP02-B3-RESISTANT-TAPIOCA-STARCH-R126-20261015-S11` | Nature Sante, [PAIN CARBONAUT 544G WHITE S/G](https://naturesante.ca/products/69668510004). Montréal retailer page lists `Modified resistant tapioca starch` in the product ingredients. The displayed stock state is undated; this supports the exact English finished-food label, not standalone starch availability. |

Internal history checked: [R94 modified tapioca starch integration](../batches/wp02-b3-modified-tapioca-starch-identity-integration-20261014/README.md), [R122 resistant wheat starch proposal](wp02-b3-r122-resistant-wheat-starch-identity-review-20261015.md), [R124 raw unmodified potato starch proposal](wp02-b3-r124-raw-unmodified-potato-starch-identity-review-20261015.md), and [R125 pregelatinized rice starch integration](../batches/wp02-b3-pregelatinized-rice-starch-identity-integration-r125-20261015/README.md). R124's mention of the combined tapioca-and/or-potato label is adjacent evidence only; it did not review the resistant-tapioca identity or its picker boundary.

## Static checks performed

- Read `AGENTS.md`, the open WP02 Section 04 B3 checklist, the active manifest, current reference and
  form JSON, research ledger, and the R94/R122/R124/R125 review and integration history.
- At review time, confirmed the proposed reference ID, exact names, aliases, and R126 source-ID prefix
  were not owned by an active reference/form/ledger record or another proposal/batch source.
- Mirrored `IngredientSearch.kt` accent and punctuation normalization and complete-phrase-first
  behavior for the picker table. This is a static projection, not an application test.
- Parsed all 114 manifest-listed recipe JSON files and scanned 1,123 ingredient rows for the
  candidate and product terms; found no candidate-specific demand.
- Opened the cited Canadian, Québec, official, supplier, and primary-study sources. Eleven unique
  proposal-local source IDs are recorded in the shared ingredient-reference ledger entry. UTF-8/no-BOM,
  source-prefix uniqueness, and whitespace checks passed.
- No app, Gradle, instrumentation, or emulator tests were run because the shared change only adds
  database JSON data under `AGENTS.md`.
