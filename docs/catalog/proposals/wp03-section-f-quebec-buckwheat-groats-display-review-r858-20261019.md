# WP03 Section F R858 — roasted buckwheat Québec French search review

## Review record

- **Reviewed:** 2026-10-19.
- **Plan anchors:** Section F lists `buckwheat groats, roasted, dry / grains de sarrasin rôtis et secs` at [lines 4702–4712](../../RecipeBook-global-ingredient-catalog-plan.txt#L4711); the broader independent Québec French review remains open at [line 5845](../../RecipeBook-global-ingredient-catalog-plan.txt#L5854). R855 is a separate Corn Flake Crumbs product review and does not overlap this buckwheat terminology item.
- **Candidate:** Existing `ingredient-ref-roasted-buckwheat-groats-dry`.
- **Recommendation:** Keep the French display `grains de sarrasin rôtis et secs`. Add one French search alias, `sarrasin grillé`, supported by Québec source usage for roasted, dehulled buckwheat grains. Keep `kacha/kasha` inactive because local sources use it for dry roasted grains while OQLF defines it for a prepared gruel; the unqualified term remains ambiguous.
- **Status:** Integrated on 2026-10-19. The French alias and ledger evidence are recorded in the active catalog and research ledger; checklist and progress records are updated in the [R857–R859 integration README](../batches/wp02-wp03-wp04-r857-r859-gap-review-integration-20261019/README.md).
- **Scope:** No new identity, `kacha`/`kasha` alias, form, measure, observation, density, mapping, conversion, cooking yield, recipe link, or substitution is proposed.

## Québec source evidence

| Proposal source ID | Source | Supports and limits |
|---|---|---|
| `WP03-BW-GROATS-QC-R858-20261019-S01` | Ferme TournevenT, [Sarrasin rôti biologique](https://tournevent.ca/collections/sans-gluten/products/sarrasin-roti-biologique) | First-party Québec producer page names the roasted buckwheat product, says it can be eaten raw or cooked, and calls it kasha in Russian. It supports the roasted-grain identity and documents overlapping kasha usage; it does not resolve the Québec prepared-gruel meaning or establish a reusable amount. |
| `WP03-BW-GROATS-QC-R858-20261019-S02` | Ferme TournevenT, [Crème de patate douce au sarrasin grillé](https://tournevent.ca/blogs/recettes/creme-de-patate-douce-au-sarrasin-grille) | First-party Québec recipe calls `sarrasin grillé (kasha)` roasted buckwheat grains and uses them as a crunchy topping. Its 40 g / ¼ tasse amount belongs to that recipe and is not a reusable measure or conversion. |
| `WP03-BW-GROATS-QC-R858-20261019-S03` | BocoBoco, [Sarrasin grillé](https://bocoboco.ca/produit/sarrasin-grille/) | Québec retailer product title is `Sarrasin grillé`; its ingredient declaration identifies `Sarrasin grillé cru et décortiqué biologique`, and the page also calls the product kasha. This supports local usage for roasted, dehulled buckwheat sold uncooked while documenting overlapping kasha usage; it is retail wording, not a terminology ruling. |

The existing OQLF source `WP03-S56` defines **kacha / kasha** as a gruel made from roasted buckwheat. The two product sources and the TournevenT recipe also use `kasha` for dry roasted buckwheat grains. This establishes overlapping product and prepared-dish usage, so keep the unqualified term off the active alias and record the new evidence on the separate `ingredient-ref-kasha` candidate as an unresolved ambiguity. The Québec evidence supports `sarrasin grillé` as an alternate search phrase, not as a new identity or replacement display. The current descriptive display retains both the roasted-grain and dry-state qualifiers.

**Retrieval limit:** the web reader returned cache misses when opening the two TournevenT URLs directly, though its indexed first-party page results exposed the cited title and recipe wording. The BocoBoco product page opened and exposed its title, description, and ingredient declaration. No claim is made about current inventory or package availability.

## Exact proposed data delta

### Active reference

On `ingredient-ref-roasted-buckwheat-groats-dry`, retain both displays and the existing category, density, and unit mappings; append only this French alias:

```json
{
  "id": "ingredient-ref-roasted-buckwheat-groats-dry",
  "nameFr": "grains de sarrasin r\u00f4tis et secs",
  "nameEn": "buckwheat groats, roasted, dry",
  "aliasesFr": ["sarrasin grill\u00e9"],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

### Research ledger

Append these three source objects to the existing `ingredient-ref-roasted-buckwheat-groats-dry` record and append one decision. Reuse the existing OQLF source `WP03-S56`; do not register a duplicate OQLF URL.

```json
[
  {
    "sourceId": "WP03-BW-GROATS-QC-R858-20261019-S01",
    "url": "https://tournevent.ca/collections/sans-gluten/products/sarrasin-roti-biologique",
    "title": "Ferme TournevenT, Sarrasin r\u00f4ti biologique",
    "accessedOn": "2026-10-19",
    "locator": "French product title, ingredient, and product description",
    "supports": "First-party Qu\u00e9bec producer names sarrasin r\u00f4ti biologique and describes it as roasted buckwheat that can be eaten raw or cooked. The page also calls it kasha in Russian. This supports the roasted-grain identity and documents overlapping kasha usage; it does not resolve the Qu\u00e9bec prepared-gruel meaning or establish a reusable amount.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP03-BW-GROATS-QC-R858-20261019-S02",
    "url": "https://tournevent.ca/blogs/recettes/creme-de-patate-douce-au-sarrasin-grille",
    "title": "Ferme TournevenT, Cr\u00e8me de patate douce au sarrasin grill\u00e9",
    "accessedOn": "2026-10-19",
    "locator": "Introductory description and roasted-seed topping ingredient line",
    "supports": "First-party Qu\u00e9bec recipe describes sarrasin grill\u00e9 (kasha) as roasted buckwheat grains and uses it as a crunchy soup topping. The listed 40 g and 1/4 tasse are specific to this topping formula and are not a reusable portion or conversion.",
    "sourceKind": "manufacturer"
  },
  {
    "sourceId": "WP03-BW-GROATS-QC-R858-20261019-S03",
    "url": "https://bocoboco.ca/produit/sarrasin-grille/",
    "title": "BocoBoco, Sarrasin grill\u00e9",
    "accessedOn": "2026-10-19",
    "locator": "Product heading, description, and ingredient declaration",
    "supports": "The Qu\u00e9bec retail product is titled Sarrasin grill\u00e9, is described as kasha, and lists sarrasin grill\u00e9 cru et d\u00e9cortiqu\u00e9 biologique as its ingredient. Supports this local phrase for uncooked, roasted, dehulled buckwheat while documenting overlapping kasha usage; it is retail wording, not a terminology ruling.",
    "sourceKind": "other"
  }
]
```

```json
{
  "outcome": "accepted",
  "reason": "Keep the display grains de sarrasin r\u00f4tis et secs and add only the French search alias sarrasin grill\u00e9 to the existing roasted dry buckwheat-groats identity. Qu\u00e9bec producer and retailer wording supports the phrase for roasted grains. Do not activate kacha/kasha: the reviewed sources use it for both dry roasted grains and an OQLF-defined cooked gruel, so the unqualified term remains ambiguous for the picker. The recipe's 40 g / 1/4 tasse amount is formula-specific; add no measurement observation, form, density, mapping, conversion, cooking yield, recipe link, or substitution.",
  "sourceIds": [
    "WP03-BW-GROATS-QC-R858-20261019-S01",
    "WP03-BW-GROATS-QC-R858-20261019-S02",
    "WP03-BW-GROATS-QC-R858-20261019-S03",
    "WP03-S56"
  ]
}
```

Append the same three source objects above and this unresolved decision to the ledger-only `ingredient-ref-kasha` candidate. Preserve its `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; do not activate `kacha` or `kasha` on either row.

```json
{
  "outcome": "unresolved",
  "reason": "New Qu\u00e9bec producer, retailer, and recipe sources use kasha for dry roasted buckwheat grains, while OQLF defines kacha/kasha as a cooked gruel made from roasted buckwheat. This establishes overlapping product and prepared-dish usage rather than one unambiguous identity. Keep the candidate unresolved and the term inactive on both records until a recipe-context or form boundary supports safe picker assignment.",
  "sourceIds": [
    "WP03-BW-GROATS-QC-R858-20261019-S01",
    "WP03-BW-GROATS-QC-R858-20261019-S02",
    "WP03-BW-GROATS-QC-R858-20261019-S03",
    "WP03-S15",
    "WP03-S56"
  ]
}
```

Preserve the target’s existing CNF 2015/2026 source observations and measurement research state. Do not use TournevenT’s recipe amount to create or update a `measurementObservation`.

## Ownership, picker, and recipe audit

- **Active catalog:** The current reference is `buckwheat groats, roasted, dry / grains de sarrasin rôtis et secs`, `GRAIN_AND_CEREAL`, with empty aliases, null density, and no unit mappings. The normalized phrase `sarrasin grillé` has no current active-reference or form owner. After the proposal, it belongs only to the target French alias.
- **Forms and rules:** The target has no ingredient forms or form match terms. The global and contextual substitution-rule files contain no entries. No conversion, yield, form, or rule ID is allocated.
- **Ledger ownership:** The existing active-reference record owns CNF Food Code 4412 observations and prior buckwheat terminology sources. It already owns OQLF source `WP03-S56`; the three R858 source IDs and URLs above are unowned. Append those sources and the new unresolved decision to the separate `ingredient-ref-kasha` ledger candidate; leave its identity, measurement, and substitution states unchanged.
- **Phrase-first picker projection:** Against current reference/form terms and `IngredientSearch.kt`, exact `sarrasin grillé` changes from 0 results to the single roasted-dry-groats row. The qualified English and French display queries remain 1-to-1. Broad `sarrasin` remains 15 results; `grillé` grows from 2 to 3 because it is a one-word search. `kasha` remains 0, while `kacha` remains the existing substring-fallback result `fingerroot / krachai`. This alias does not change either prepared-kasha query.
- **Bundled recipes:** A manifest-ordered scan covered 114 recipe files and 1,123 ingredient rows. It found no candidate phrase, `sarrasin grillé` phrase, or direct link to `ingredient-ref-roasted-buckwheat-groats-dry`; no recipe demand or edit is proposed.
- **Measurement boundary:** The TournevenT recipe's 40 g / ¼ tasse amount remains specific to one topping formula. Keep existing CNF observations edition-specific and leave active density, measures, mappings, conversions, and cooking yield unchanged.
- **Substitution boundary:** Neither the Quebec product pages nor OQLF provides a quantity-qualified replacement relation for other buckwheat products or grains. Add no global or contextual rule.

## Static checks and disposition

- Confirmed the current plan anchors and R855 integration; the broader Section F checklist remains open.
- Checked the proposed alias against 1,891 active references, 201 forms, 56 legacy-import candidates, and 2,299 ledger records. No exact normalized-name owner, source-ID collision, or source-URL collision was found.
- Reproduced the phrase-first and substring-fallback projection from `IngredientSearch.kt` without running application tests.
- Scanned all manifest-listed recipes and structured ingredient rows for the proposed display/alias and target ID; found no matching demand.
- Read the proposal as UTF-8 without BOM and checked fenced JSON syntax, source enums/required fields, relative links, whitespace, and escaped Unicode in JSON examples.
- No software tests, build, emulator run, or deployment were performed. Integration changes only bundled database JSON and generated catalog data from that JSON source; `AGENTS.md` says database-JSON-only additions need no software tests.

Root owns any shared-data integration. Leave the Section F parent and the independent human Québec terminology review open beyond this exact phrase review.
