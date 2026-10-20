# WP03 Section F — spelt berries current-evidence recheck (R170, 2026-10-16)

## Review record

- **Status:** Proposal only. No catalog JSON, research ledger, generated code, plan, roadmap, recipe, or batch README was changed.
- **Scope:** One still-unallocated Section F grain product: food-grade whole spelt kernels sold for cooking, milling, or sprouting.
- **Recommendation:** **Integrate** one identity-only `GRAIN_AND_CEREAL` reference, `spelt berries / grains d’épeautre`, using the previously proposed but still unallocated ID `ingredient-ref-spelt-berries`.
- **Proposed source-ID prefix:** `WP03-SPELTBERRIES-R170-20261016-S` (S01–S04, unallocated). Reuse the existing OQLF source ID identified below; do not create a duplicate OQLF source record.
- **Prior review:** The 2026-10-12 spelt-berries proposal recommended this same narrow identity, but it was not integrated and has no live reference or ledger owner. This recheck uses current product pages and a fresh live-package audit. It does not reopen spelt flakes, puffed spelt, spelt flour, malted/sprouted spelt flour, or any separate human Québec-language sign-off.

## Why this remains an open Section F gap

The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L3203) continues remaining grain and cereal identity coverage. The current [grain/cereal batch packet](../batches/plant-grains-cereals.md#L530) still lists wider grain and terminology work. The package already has separate spelt-flake, puffed-spelt, spelt-flour, malted-spelt-flour, and sprouted-spelt-flour references, but no whole-kernel spelt identity. The prior [spelt-berries review](wp03-section-f-spelt-berries-identity-review-20261012.md) is a proposal only; a fresh audit confirms that neither its proposed ID nor its product-name pair was allocated.

Current Québec product evidence directly names **Grains d’épeautre Bio**, identifies the grain as *Triticum spelta* (grand épeautre/spelt), and describes it for whole-grain cooking, milling, flaking, and sprouting [S01]. A current Canadian grain-seller page independently titles its product **Spelt berries**, names Québec as the growing location, and lists salad, stew, and sprouting uses [S02]. OQLF pairs *épeautre* with English *spelt* and defines it as a variety of wheat [existing source WP03-SPELT-FLAKES-20261011-S01]. The product title and market use support a bounded bilingual identity without a constructed French name.

## Identity boundary and terminology

The proposed row covers the edible, dry, whole-kernel spelt product sold for human-food cooking or further home preparation. It records the named whole-grain product class, not an agronomic variety, origin, organic status, hull-removal specification, or grain grade. The Coop Agrobio source explicitly names *Triticum spelta*; Almanac Grain supports the English retail phrase and Québec-grown context [S01–S02]. OQLF’s base-name entry and the Québec vendor’s direct product label support the English/French pairing [S01, existing source WP03-SPELT-FLAKES-20261011-S01].

Keep these identities separate:

- generic `wheat berries / grains de blé entiers`;
- einkorn berries `grains de petit épeautre` (*Triticum monococcum*), emmer wheat, durum wheat, Khorasan wheat, and other wheat-class identities;
- spelt flour, flakes, puffed spelt, bran, malted flour, and sprouted flour;
- prepared spelt dishes, sprouted kernels, and products that still contain the grain only as one ingredient; and
- seed or feed lots that are not sold as human-food grain.

Do not add `épeautre`, `spelt`, `grand épeautre`, `whole spelt`, or `spelt grain` as aliases. The two proposed displays already provide the exact product phrases; broader terms would widen search or overlap the existing grain and processed-spelt choices. Keep `grains de petit épeautre` with the existing einkorn identity. The shorter `épeautre` query can intentionally show multiple spelt products and the separately qualified einkorn products.

## Exact proposed reference delta

If accepted, add only this row to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-spelt-berries",
  "nameEn": "spelt berries",
  "nameFr": "grains d\u2019\u00e9peautre",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Do not add a form, legacy candidate, recipe link, recipe-line edit, conversion, cooking-yield rule, density, unit mapping, or substitution. The identity row represents the source-named whole-grain product; the seller’s preparation instructions remain source-specific.

## Live ownership, ID, and URL audit

The live snapshot contains **1,545 references**, **119 forms**, **61 legacy candidates**, **1,889 research-ledger records**, and **114 manifest-listed recipes / 1,123 structured ingredient rows**. Accent-, case-, punctuation-, compatibility-character-, and whitespace-normalized exact-key checks covered reference displays and aliases, form labels and match terms, legacy names and aliases, plus ledger record IDs and strings.

| Candidate key | Live exact owner | Disposition |
|---|---|---|
| `spelt berries`, `spelt berry`, `spelt grain`, `spelt grains`, `spelt kernels`, `whole spelt`, `whole spelt grain`, `spelt wheat berries` | None | Only the qualified display `spelt berries` is proposed. Do not add the other variants as aliases. |
| `grains d’épeautre`, `grain d’épeautre`, `grains entiers d’épeautre`, `épeautre entier` | None | `grains d’épeautre` is the direct Québec product label proposed as display. No singular or extended alias is proposed. |
| `ingredient-ref-spelt-berries` | None in active references, forms, legacy candidates, or ledger records | This ID appears as an unallocated suggestion in the older proposal only; no active data or ledger record owns it. |
| `spelt`, `épeautre` | Multiple existing spelt-related identities | Preserve these broad queries; the proposal intentionally adds one whole-grain result. |
| `grains de petit épeautre` | `ingredient-ref-einkorn-berries` | Keep the einkorn product separate. |

The active neighboring rows include `ingredient-ref-einkorn-berries`, `ingredient-ref-emmer-grain`, `ingredient-ref-spelt-flakes`, `ingredient-ref-puffed-spelt`, `ingredient-ref-spelt-flour`, `ingredient-ref-malted-spelt-flour`, and `ingredient-ref-sprouted-spelt-flour`. None has an exact whole-spelt-berry display or alias. Existing spelt-related rows have null `defaultDensity` and empty `unitMappings`; no form is attached to a spelt grain identity because none exists.

The new `WP03-SPELTBERRIES-R170-20261016-S01` through `S04` IDs are absent from the ledger and proposal/batch archive. Their four URLs are unowned by live ledger sources. The OQLF URL is already represented on spelt-flour, spelt-flakes, puffed-spelt, and malted-spelt-flour records; reuse **`WP03-SPELT-FLAKES-20261011-S01`** for that established source rather than allocating another ID. The older proposal’s local S01–S05 labels are not live ledger allocations.

## Picker projection

The projection uses the current phrase-first, accent-folding behavior and reference/form terms in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical row contains only the two display names above.

| Query | Current → proposed results | Picker effect |
|---|---:|---|
| `spelt berries` | 0 → 1 | The English product name resolves to the whole-kernel identity. |
| `grains d’épeautre` | 0 → 1 | The Québec product label resolves to the whole-kernel identity. |
| `spelt` | 5 → 6 | Adds whole kernels among the existing spelt flours and processed grains. |
| `épeautre` | 7 → 8 | Adds whole spelt; retains the separate *petit épeautre* (einkorn) results. |
| `grains de petit épeautre` | 1 → 1 | Remains on `ingredient-ref-einkorn-berries`; it does not match the proposed wording. |
| `wheat berries` | 11 → 11 | No English wheat-berry alias is added. |
| `spelt flakes` / `flocons d’épeautre` | 1 / 1 → unchanged | Existing spelt-flake identity remains the exact owner. |
| `puffed spelt` / `épeautre soufflé` | 1 / 1 → unchanged | Existing puffed-spelt identity remains the exact owner. |
| `spelt flour` / `farine d’épeautre` | 3 / 1 → unchanged | Existing flour identities and their specific forms stay separate. |
| `spelt grain` / `whole spelt` | 0 / 0 → unchanged | No unsupported English alias is introduced. |

The broad `spelt` and `épeautre` queries gain one appropriate whole-grain choice. Exact processing phrases remain with their existing references. This is a static projection of the search code and live seed; no app QA was run.

## Bundled recipe demand

All **114 recipe files listed by the live manifest** and all **1,123 structured ingredient rows** were parsed. Complete serialized files and each row’s `originalText`, `ingredientName`, preparation, notes, and reference ID were searched for `spelt berries`, singular variants, `spelt grain(s)`, whole-spelt variants, `grains d’épeautre`, related French singular/plural phrases, and the proposed reference/candidate IDs. The scan found **zero candidate phrase hits in recipe files and zero candidate phrase hits in ingredient rows**. It also found no current recipe line for `spelt` or `épeautre` and no related recipe link. No recipe link or relink is recommended.

## Forms, numeric behavior, and substitutions

- **Forms:** Add none. The proposed identity is a dry whole-kernel grain product, not a dry/cooked state form of generic wheat, einkorn, emmer, spelt flakes, or flour. The recipe corpus has no demand for a spelt state distinction.
- **Packages:** Coop Agrobio lists 5 kg and 25 kg product choices [S01]; these are package quantities, not recipe measures or mass-volume mappings. Almanac Grain’s product options and price are seller details, not a household measure [S02].
- **Cooking observations:** Coop Agrobio gives one product-specific direction of one cup of dry grain to three cups of water and an approximate three-cup cooked yield per dry cup [S01]. Preserve it only as that seller/product’s preparation note. Do not transfer it to a default form conversion or global cooking yield; the label does not establish a standard cup convention or applicability to other spelt products.
- **Density and conversions:** Neither current product page establishes a reusable mass-per-volume value. Keep `defaultDensity: null`, `unitMappings: []`, and conversion data empty. No spelt conversion appears in the live ledger’s unit-conversion list.
- **Substitutions:** The sources describe culinary uses but no tested replacement direction, ratio, or dish/method limits. Shared use in salads, stews, or breads does not establish interchangeability with wheat berries, einkorn, emmer, farro, or other cereals. Add no global or contextual substitution rule.
- **Ledger states:** If integrated, add one `ingredient_reference` record for `ingredient-ref-spelt-berries`, with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`; use empty `measurementObservations` and `substitutionFindings`. The listed cup-based preparation instructions stay in the source description and are not a reusable measurement observation.

The global and contextual substitution-rule arrays contain **zero** rules; the package-yield file has one unrelated record. No spelt row or conversion exists there.

## Proposed ledger source register

Sources were checked online on 2026-10-16. Source IDs S01–S04 are proposal-local and unallocated. The OQLF entry is reused by its existing live source ID, as described above.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-SPELTBERRIES-R170-20261016-S01` | Coop Agrobio / Comptoir Saint-Vrac, [Grains d’épeautre Bio](https://comptoirstvrac.com/product/2088), current product page. | Direct Québec product title and ingredient wording; page describes whole-grain cooking, milling, flaking, and sprouting uses, identifies the product as *Triticum spelta* (grand épeautre/spelt), and lists 5 kg and 25 kg packages. Its one-cup dry-grain / three-cup-water instruction and approximate three-cup cooked result are product-specific, not a reusable conversion or yield. The page showed inventory 0 for St-Adrien when checked; availability is not part of the identity decision. |
| `WP03-SPELTBERRIES-R170-20261016-S02` | Almanac Grain, [Spelt berries](https://almanacgrain.ca/products/spelt-berries), current seller page. | Uses the exact English product title `Spelt berries`, describes salad, stew, and sprouting uses, and says the grain is grown in Saint-Paul, Québec. It does not independently specify Latin species, hull state, or French display. |
| `WP03-SPELTBERRIES-R170-20261016-S03` | Équiterre, [Épeautre](https://www.bienmangerbonmarche.ca/fr/trucs-et-astuces/epeautre), French-language culinary guidance. | Uses `grains d’épeautre` for cooking and lists Québec brands and sellers that offer grains. This corroborates regional French culinary wording; it is not a product label, taxonomic standard, or OQLF ruling. |
| `WP03-SPELTBERRIES-R170-20261016-S04` | Gouvernement du Québec, [Culture des grains (céréales et oléagineux)](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/industrie-agricole-au-quebec/productions-agricoles/culture-grains-cereales-oleagineux), page updated 2026-03-24. | Lists *épeautre* among grains grown in Québec and describes grain/cereal crops. Supports local crop context, not a whole-kernel retail product or a specific food use. |
| Reuse `WP03-SPELT-FLAKES-20261011-S01` | Office québécois de la langue française, [épeautre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre), updated 2007. | Pairs the preferred French term `épeautre` with English `spelt`, defines it as a variety of wheat, and describes grains strongly adhering to the hull. It supports the base name and taxonomic boundary, not the exact product-title compound or a claim about hull removal in the retail SKU. |

## Static proposal checks

- Read the live Section F checklist, the grain/cereal batch packet, the prior spelt-berries proposal, relevant spelt/einkorn/emmer identities, current reference/form/legacy files, and the research ledger.
- Confirmed the proposed reference ID and product phrase have no active exact-key owner; the ID appears only as an unallocated suggestion in the older proposal.
- Confirmed R170 source IDs S01–S04 and their URLs are unallocated in the live ledger and catalog archive; reused the existing OQLF source ID/URL.
- Reproduced representative picker results from live reference/form data and `IngredientSearch.kt`.
- Scanned all 114 manifest-listed recipe files and all 1,123 ingredient rows; found no matching demand or link.
- Checked current forms, default density and unit mappings, ledger conversions, package yields, and substitution-rule files; none supports a reusable numeric or substitution delta.
- This proposal changes only this Markdown file. No software, app, unit, instrumentation, emulator, build, or deployment tests were run.
