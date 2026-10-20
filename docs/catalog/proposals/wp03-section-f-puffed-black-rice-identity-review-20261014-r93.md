# WP03 Section F R93 — puffed black rice identity review

## Review record

- **Reviewed:** 2026-10-14.
- **Open checklist:** Section F still lists “remaining puffed-grain candidates” ([active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2743); [grain-packet checklist](../batches/plant-grains-cereals.md#L267)).
- **Candidate:** plain puffed black rice used as a crisp garnish.
- **Recommendation:** **Add one identity-only `GRAIN_AND_CEREAL` reference.** A Canadian foodservice recipe explicitly prepares “Puffed Black Rice” from uncooked black rice; two Canadian French culinary sources attest the compound *riz noir soufflé*. This supports the culinary identity and a Canadian culinary-attested French display, but not an OQLF-preferred term or a standalone Canadian retail package name.
- **Status:** Integrated 2026-10-14. One reference and one accepted ledger record are live; see [the integration README](../batches/wp03-section-f-puffed-black-rice-identity-integration-20261014/README.md).
- **Distinctness:** This is a black-rice puffed product, not generic puffed rice, puffed brown rice, puffed wild rice, or black glutinous rice. The recent puffed-einkorn and puffed-emmer holds cover other species and do not review this identity ([R91](wp03-section-f-puffed-einkorn-identity-boundary-hold-20261014-r91.md); [R92](wp03-section-f-puffed-emmer-identity-boundary-hold-20261014-r92.md)).
- **Integration status:** No forms, recipe links, or substitution, measurement, or conversion data were added. The reference and ledger row are identity-only.

## Identity and Canadian/Québec naming evidence

Unilever Food Solutions Canada’s scallop recipe has a section titled **“Prepare the Puffed Black Rice.”** Its ingredient list calls for 50 g uncooked black rice and oil; the method fries the rice at 180 °C for 15–30 seconds until it puffs, then uses it as a garnish. This directly attests the English culinary ingredient and its process in a Canadian foodservice recipe. The amount is a recipe input, not the mass of the puffed output or a general serving [S01]. The search index returned the recipe content; direct page opening was unavailable in this review session.

Gordon Food Service Canada’s French recipe is titled **“Aubergine et riz noir soufflé”** and lists 35 g of **“Recette: Chips de riz noir soufflé”** for a 350 g aubergine dish, served as an accompaniment. This is an exact Canadian French culinary attestation of *riz noir soufflé*. It refers to a recipe component/chips and does not establish a retail product title, standalone package, or general portion [S02]. Direct page opening returned a cache miss; the indexed recipe page and current sitemap both surfaced the title.

The Canadian Armed Forces’ French *Bulletin des logisticiens*, volume 9, issue 2 (June 2019), names a menu item **“Velouté de panais et racine de bardane avec riz noir soufflé.”** This is an independent Canadian French culinary use of the compound, not a terminology-standard entry or a quantified product specification [S03].

The federal bilingual Food Quality Specifications for Rice use **Black Rice / Riz noir** for the underlying edible grain [WP03-S128, WP03-S129]. Usito pairs *puffed rice* with *riz soufflé* and describes grains expanded by heat, but does not list the compound *riz noir soufflé* [WP03-S102]. Together with the direct Canadian culinary attestations above, these support the proposed French display while leaving its status explicitly market-attested rather than OQLF-approved. IRRI documents that black-rice varieties can be glutinous or non-glutinous; do not imply that puffed black rice is necessarily glutinous [WP03-S130].

A primary study also examines popping/puffing one named fragrant black-rice sample. Its controlled variety and equipment establish that black rice can be puffed, but its lab conditions are not household instructions or a general process specification [S04]. Targeted searches found no Québec/OQLF ruling for the exact compound and no Canadian standalone retail package. That is a bounded search result, not proof none exists.

## Pre-integration ownership and picker projection

The pre-integration live audit snapshot was **1,425 ingredient references, 104 forms, 63 legacy-import candidates, 1,764 research-ledger records, and 114 manifest recipes / 1,123 ingredient rows**.

| Current owner | Live scope | Proposed boundary |
|---|---|---|
| `ingredient-ref-black-rice` | `black rice / riz noir`, `GRAIN_AND_CEREAL`; no aliases, forms, density, or unit mappings. Its ledger identity is verified; measurement and substitution research remain not yet researched. | Owns the unqualified black-rice grain, not the puffed product. |
| `ingredient-ref-black-glutinous-rice` | `black glutinous rice / riz gluant noir`; English alias `glutinous black rice`, French alias `riz noir glutineux`. No attached forms. | Keep the glutinous qualifier explicit. IRRI says black rice includes glutinous and non-glutinous varieties. |
| `ingredient-ref-puffed-rice` | `puffed rice / riz soufflé`, with English aliases `muri` and `murmura`. No attached forms. | Keep as the generic puffed-rice identity; do not make it the owner of the black-rice-specific name. |
| `ingredient-ref-puffed-brown-rice`; `ingredient-ref-puffed-wild-rice` | Separate color/species-qualified puffed-grain identities. The brown-rice ledger record contains one Yupik SKU-specific 1 cup / 15 g observation; the wild-rice row has no reusable measure. | Preserve the qualified rows. Do not transfer the brown-rice label observation or wild-rice process/measurements. |
| Proposed `ingredient-ref-puffed-black-rice` | No exact active reference, form, legacy candidate, ledger record, or earlier focused proposal was found for the candidate phrase or ID. The proposed R93 source-ID prefix is also unallocated. | Add only as an identity; do not attach forms, chips wording, or inherited numeric data. |

The picker projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete-phrase matches take priority, with substring matching only if no phrase match exists.

| Query | Before integration | Integrated results |
|---|---|---|
| `puffed black rice` | None | `ingredient-ref-puffed-black-rice` only |
| `black rice puffs` | None | None; this wording is unsupported and is not added as an alias |
| `black rice` | `ingredient-ref-black-glutinous-rice`; `ingredient-ref-black-rice` | Those two plus `ingredient-ref-puffed-black-rice` |
| `black glutinous rice` | `ingredient-ref-black-glutinous-rice` only | Unchanged |
| `puffed rice` | `ingredient-ref-puffed-rice` only | Unchanged; the inserted word `black` prevents a phrase match on the new row |
| `riz noir soufflé` | None | `ingredient-ref-puffed-black-rice` only |
| `riz noir` | `ingredient-ref-black-glutinous-rice`; `ingredient-ref-black-rice` | Those two plus `ingredient-ref-puffed-black-rice` |
| `riz soufflé` | `ingredient-ref-puffed-rice` only | Unchanged |
| `chips de riz noir soufflé` | None | None; do not alias a crisp component/chips preparation |
| `puffed brown rice`; `puffed wild rice` | Their respective qualified rows only | Unchanged |

The broader `black rice` and `riz noir` searches will now intentionally return three distinct choices. The grain packet separately flags a future black-rice-vinegar candidate as another short-query overlap; repeat the broad-query audit if that candidate is activated. Exact puffed and French compound queries remain distinct.

## Recipe demand

I scanned all **114 manifest-listed recipe files and 1,123 structured ingredient rows** for `puffed black rice`, `black rice puffs`, `black rice`, `puffed rice`, `riz noir soufflé` (with and without the accent), `riz soufflé`, and `chips de riz noir soufflé`. The scan found **0 matching files, 0 matching ingredient rows, and 0 direct links** to the neighboring black-rice or puffed-rice references. No recipe relink, amount, or substitution is justified by the bundled corpus.

## Forms, measurements, conversions, and substitutions

- **Forms:** Add none. The puffed product is a distinct processed-grain identity, following the existing qualified puffed-grain rows. Do not add a `fried`, `cooked`, or `chips` form under raw black rice.
- **Measurements:** Do not add the 50 g uncooked black-rice input from S01 or the 35 g chip component from S02 as measurements for puffed black rice. Neither source reports the standalone puffed output mass; the GFS amount belongs to a recipe component in a finished 350 g dish. The Canadian Armed Forces menu gives no quantity. The controlled laboratory sample in S04 is not a household measure.
- **Density and conversions:** Keep `defaultDensity: null` and `unitMappings: []`. No reviewed source supports a cup-to-mass value, raw-to-puffed yield, or conversion to generic puffed rice. The Yupik 1 cup / 15 g label in the puffed-brown-rice ledger record is SKU-specific and not transferable.
- **Substitution:** The reviewed recipes use puffed black rice as a garnish/accompaniment and offer no tested replacement. Do not infer interchangeability with puffed rice, puffed brown rice, puffed wild rice, or other puffed grains; add no global or contextual substitution rule. Keep the new ledger record’s `substitutionResearchState` at `not_yet_researched` until a dedicated comparison is reviewed.

## Exact proposed integration delta

The accepted row in `ingredient-references.v1.json` is:

```json
{
  "id": "ingredient-ref-puffed-black-rice",
  "nameEn": "puffed black rice",
  "nameFr": "riz noir soufflé",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

The integrated `ingredient_reference` ledger record for `ingredient-ref-puffed-black-rice` has `identityState: verified`, `measurementState: researched_no_supported_value`, `substitutionResearchState: not_yet_researched`, and `measurementObservations: []`. It uses the four new source records S01–S04 below, reuses existing source IDs WP03-S102 and WP03-S128–S130, and has one accepted identity decision. No form, alias, recipe link, measurement observation, unit conversion, package yield, or substitution finding/rule was added. The shared ledger now uses four new source IDs under `WP03-PUFFBLACK-R93-20261014`.

The identity row and accepted ledger record are integrated. The source register retains the evidence limits and the source IDs.

## Sources

The R93 labels S01–S04 below are the four new shared-ledger source IDs; four existing source IDs are reused without duplication.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| WP03-PUFFBLACK-R93-20261014-S01 | Unilever Food Solutions Canada, [Pan Seared Scallops with Gochujang Demi Glace](https://www.unileverfoodsolutions.ca/en/recipe.R0076688.html), “Prepare the Puffed Black Rice” section; accessed 2026-10-14. | Calls the prepared garnish “Puffed Black Rice”; uses 50 g uncooked black rice and frying oil, with a recipe method at 180 °C for 15–30 seconds. Recipe-specific input and method only; not a package label, yield, serving weight, or universal process. Search-index content was available; direct opening returned an internal error in this review session. `sourceKind: culinary_reference`. |
| WP03-PUFFBLACK-R93-20261014-S02 | Gordon Food Service Canada, [Aubergine et riz noir soufflé](https://gfs.ca/fr-ca/idees/recette/aubergines-au-riz-noir-souffle/), title, 35 g “Recette: Chips de riz noir soufflé” ingredient, and preparation; accessed 2026-10-14. | Canadian French culinary attestation of *riz noir soufflé* and a chips component. The 35 g belongs to the recipe component; it does not establish a standalone retail product or measure. Direct opening returned a cache miss; indexed page content and the current sitemap supplied the text. `sourceKind: culinary_reference`. |
| WP03-PUFFBLACK-R93-20261014-S03 | Government of Canada Publications, [Bulletin des logisticiens, vol. 9, no. 2 (June 2019)](https://publications.gc.ca/collections/collection_2021/mdn-dnd/d3-45/D3-45-9-2-fra.pdf), p. 6 menu. | Uses “Velouté de panais et racine de bardane avec riz noir soufflé.” This is Canadian French menu wording, not a terminology ruling or quantified product specification. Direct PDF opening succeeded. `sourceKind: other`. |
| WP03-PUFFBLACK-R93-20261014-S04 | [“Effect of Popping and Steam Cooking on Total Ferulic Acid, Phenolic and Flavonoid Contents, and Antioxidant Properties of Sukhothai Fragrant Black Rice”](https://pmc.ncbi.nlm.nih.gov/articles/PMC12840501/), primary study; accessed 2026-10-14. | Examines popping/puffing a named fragrant black-rice sample under controlled equipment and moisture conditions. Supports process feasibility for that sample; it does not establish general cultivar scope, Canadian naming, a household quantity, or a reusable conversion. Search-index content was available; direct opening presented a browser challenge. `sourceKind: other`. |
| WP03-S128–S129 | Government of Canada, [Food Quality Specifications — Rice (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf) and [Spécifications sur la qualité des aliments — Riz (français)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf), black-rice entries. | Existing ledger sources pair `Black Rice / Riz noir` for the underlying grain. They do not name puffed black rice. |
| WP03-S130 | International Rice Research Institute, [Innovators in rice science](https://ricetoday.irri.org/innovators-in-rice-science/), black-rice varieties. | Existing ledger source reports both glutinous and non-glutinous black-rice types; do not infer glutinous type for the proposed identity. |
| WP03-S102 | Usito, [riz soufflé](https://sanction.usito.usherbrooke.ca/d%C3%A9finitions/riz), *riz soufflé* entry. | Existing ledger source supports the Québec/Canadian term for puffed rice, but not the exact black-rice compound. |

## Static review performed

- Re-read current `AGENTS.md`, `Requirements.md`, the active Section F plan item, the grain packet/checklist, relevant roadmap entries, and the adjacent R91/R92 proposal and batch records.
- Parsed the live ingredient references, forms, legacy-import candidates, ledger, package manifest, and recipes after integration. Snapshot: 1,426 references, 104 forms, 63 legacy candidates, 1,765 ledger records, 114 recipes, 1,123 ingredient rows.
- The pre-integration ownership audit found no exact owner or prior puffed-black-rice review in references, forms, legacy candidates, ledger records, or earlier focused proposals. Audited neighboring black-rice and puffed-grain owners and their attached forms, observations, and substitution rules.
- Reproduced the current phrase-first picker behavior for the listed queries and simulated the single row with no aliases.
- Scanned all manifest recipes and structured ingredient rows for candidate and neighboring English/French wording; found no bundled demand or direct reference links.
- Verified the federal black-rice wording, Usito’s generic *riz soufflé* definition, IRRI’s glutinous/non-glutinous distinction, and the Canadian recipe/menu attestations online. Recorded page-cache and search-index limitations above.
- Validated the new identity row, ledger schema, four unique source IDs, and reused source IDs; package/reference normalization, generated-index freshness, recipe and picker projections, encoding, links, and whitespace passed. No app, Gradle, instrumentation, or emulator tests were run because this change only adds database JSON data and its generated index under `AGENTS.md`.

Section F remains open.
