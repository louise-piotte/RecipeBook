# WP02 B3 regional starch gap review — breadfruit starch

- **Reviewed:** 2026-10-13
- **Status:** Proposal only; no shared catalog, ledger, checklist, roadmap, generated file, or application file was edited.
- **Open checklist line:** `[ ] Water-chestnut flour and other documented regional starches.` in `docs/RecipeBook-global-ingredient-catalog-plan.txt` (line 2003 at review time). This review covers the “other documented regional starches” scope and does not reopen the water-chestnut hold.
- **Candidate:** starch isolated from the edible flesh of breadfruit (*Artocarpus altilis*), distinct from whole-flesh flour.
- **Source-ID prefix:** `WP02-B3-BREADFRUIT-STARCH-R78-20261013-S01` through `S05`; proposal-local IDs, not ledger entries. The prefix was absent from the proposal and batch archive when checked.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for **breadfruit starch / amidon du fruit à pain**. Keep the French display provisional for Québec pending a Québec product-label or independent terminology review. The identity boundary is well supported: primary studies isolate starch from edible *A. altilis* flesh and analyze it separately from flour; the documented extraction washes and separates starch granules from the fruit tissue. The OQLF supports `fruit à pain` as the Québec name for breadfruit and prefers general `amidon`; a French Caribbean doctoral thesis uses `amidon du fruit à pain`. These sources support a transparent provisional display, not a Québec retail-name claim. [S01–S05]

The row is for food starch isolated from *A. altilis* fruit flesh. It is not a form or alias of fresh breadfruit, whole-flesh breadfruit flour, breadnut seed products, jackfruit, or a generic *Artocarpus* starch. No source-neutral aliases are warranted.

## Proposed identity and exact catalog delta

| Field | Proposed value | Boundary |
|---|---|---|
| ID | `ingredient-ref-breadfruit-starch` | Suggested ID only; absent from active references, forms, legacy candidates, and ledger record IDs at review time. Recheck before integration. |
| English display | `breadfruit starch` | Source-backed phrase for starch isolated from *A. altilis* flesh. [S01–S02] |
| Québec French display | `amidon du fruit à pain` | Provisional. `amidon` is the OQLF preferred general term; `fruit à pain` is an OQLF preferred name for *A. altilis*. The compound appears in French Caribbean research, not a Québec package or OQLF entry. [S03–S05] |
| Category | `FLOUR_AND_STARCH` | Isolated food starch, separate from the fruit and its whole-flesh flour. |
| Aliases | None | Keep the two exact displays sufficient. Do not add bare `breadfruit`, `fruit à pain`, `amidon`, `fécule`, `breadfruit flour`, `breadfruit starch flour`, `breadnut`, `jackfruit`, or modified-starch terms. |
| Forms and numeric mappings | None | `defaultDensity: null`; `unitMappings: []`; no ingredient form, conversion, or yield mapping. |
| Recipe links and substitutions | None | No bundled recipe demand or transferable substitution evidence was found. |

If accepted, the only catalog-data addition proposed here is this reference object. The snippet uses the review date for `updatedAt`; use the actual integration date if integration happens later:

```json
{
  "id": "ingredient-ref-breadfruit-starch",
  "nameFr": "amidon du fruit \u00e0 pain",
  "nameEn": "breadfruit starch",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

## Product scope and Québec French

Rincón and Padilla distinguish breadfruit flour—dried, milled pulp—from extracted native starch. Their starch procedure blends edible fruit tissue with water, filters the slurry, centrifuges it, washes the recovered material, and dries it. A University of the West Indies study independently isolates starch from immature and mature breadfruit flesh across 11 *A. altilis* cultivars. This establishes a distinct processed food ingredient rather than a flour grade. [S01–S02]

Use the species and plant part already established by the active breadfruit identity: edible *A. altilis* fruit flesh. Exclude seed starch or flour from breadnut/*A. camansi*, jackfruit/*A. heterophyllus*, flour made by drying and milling the whole flesh, cooked or fresh breadfruit, starch from *A. altilis* hybrids without a matching source, and chemically or physically modified derivatives such as pyrodextrins. Starch extraction is a compositional separation, not a same-ingredient preparation form under breadfruit flour. [S01–S02, S05]

The OQLF entry supports `fruit à pain` and `fruit de l’arbre à pain` for the fruit and maps the English term `breadfruit` to *A. altilis*; it does not name the starch. The OQLF `amidon` entry prefers `amidon` generally and reserves the more specific `fécule` usage for starch in tubers or other underground organs. Because breadfruit is fruit, `amidon du fruit à pain` is the better provisional construction than `fécule de fruit à pain`. Nacitas’s Martinique-focused thesis uses `amidon du fruit à pain`, but it is not Québec terminology authority. Targeted searches on 2026-10-13 for quoted `breadfruit starch`, `amidon du fruit à pain`, `amidon de fruit à pain`, and `fécule de fruit à pain` did not locate a current Québec/Canadian standalone product label. This is a bounded search finding, not proof that no such label exists. [S03–S05]

## Current ownership, archive, and picker boundary

Read-only audit snapshot:

| Surface | Current count / SHA-256 |
|---|---|
| Ingredient references | 1,402 / `73f233ded5a21acccc94615afd90d5d74a706fabb3f6fd23c565570205e27bc7` |
| Ingredient forms | 104 / `4190dc88d9dc7914b3ef5a497d9c4f50def881ade9c0348d37faec3f02a63798` |
| Research ledger | 1,740 records / `1a0074e33ef41e87229dfc2179817fa0c06769e63ee19bc79777b621e0a163be` |
| Legacy import identities | 63 / `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| Manifest-ordered recipe corpus | 114 files, 1,123 ingredient rows / `81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552` |

| Current owner | Exact stored data | Consequence |
|---|---|---|
| `ingredient-ref-breadfruit` | `breadfruit / fruit à pain`; French alias `fruit de l’arbre à pain`; category `FRUIT`. | Keep the fresh fruit identity unchanged. |
| `ingredient-ref-breadfruit-flour` | `breadfruit flour / farine de fruit à pain`; no aliases; category `FLOUR_AND_STARCH`; density null and unit mappings empty. | Keep whole-flesh flour unchanged and separate from extracted starch. |
| Proposed `ingredient-ref-breadfruit-starch` | No active owner. No exact matching form, legacy candidate, or ledger record ID. | A new row would be a new product identity; do not alias starch to the fruit or flour row. |

The only earlier archive mention is the WP02 breadfruit-flour review, which explicitly says extracted breadfruit starch is a distinct product; it does not allocate a starch candidate or decide its name. No dedicated breadfruit-starch proposal or batch decision was found. Prior B3 decisions for mung/lotus starch, canna, kudzu, barley, bracken, acorn, sago, taro, and *Sagittaria* concern different source plants or products. The active `ingredient-ref-arrowroot` and its starch/flour aliases are also separate; no arrowroot cross-alias is proposed. The candidate ID and this source-ID prefix were not found in the active data or proposal/batch archive.

Picker results follow `IngredientReferenceSearchIndex` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`, which prefers complete normalized word phrases and then falls back to substring matching:

| Query | Current result | Result if proposed row is integrated |
|---|---|---|
| `breadfruit starch` | No result | New breadfruit-starch row only. |
| `amidon du fruit à pain` | No result | New breadfruit-starch row only. |
| `breadfruit flour` | Breadfruit flour only. | Breadfruit flour only. |
| `farine de fruit à pain` | Breadfruit flour only. | Breadfruit flour only. |
| `breadfruit` | Breadfruit fruit + breadfruit flour. | Fruit + flour + starch; an intentional broad product choice. |
| `fruit à pain` | Breadfruit fruit + breadfruit flour. | Fruit + flour + starch; an intentional broad product choice. |

Do not add broad aliases to manipulate these results. In particular, `breadfruit` and `fruit à pain` are source-level terms that should present the user with fruit, flour, and extracted starch as separate choices. The proposed full starch phrases remain unambiguous.

## Recipe demand and numeric evidence limits

A manifest-ordered scan of all 114 bundled recipe JSON files and 1,123 ingredient rows found **zero full-recipe or ingredient-row matches** for breadfruit, breadfruit flour/starch, *Artocarpus altilis* starch, `fruit à pain`, `farine de fruit à pain`, or `amidon du fruit à pain`. The reference is a catalog-coverage proposal only: add no recipe links or relinks.

Rincón and Padilla report **18.50 g/100 g dry-basis starch recovery** and **98.86% starch purity** for their seedless Venezuelan sample. The authors attribute the recovery figure partly to extraction and purification losses. These are study-specific isolation and purity results, not a kitchen yield from fresh whole fruit, a generic recovery rate, density, or unit conversion. [S01]

Broomes et al. studied 11 cultivars at immature and mature stages; cultivar affected several starch properties, including swelling and solubility. These findings and the French thesis’s secondary-literature summary of two granule-density observations (0.324 and 0.673 g/cm³) are research-sample evidence. The thesis does not give harmonized methods for those cited values. They do not establish bulk powder density, cup weight, or one representative culinary grade. Keep `defaultDensity` null, mappings empty, and measurements unavailable. [S02, S05]

The studies describe extraction and physicochemical behavior; they do not establish a global conversion from breadfruit flour to starch, an extraction-yield mapping for recipes, or a general replacement ratio. Do not equate breadfruit starch with breadfruit flour, arrowroot, kudzu, corn, potato, tapioca, or another starch because they share thickening or food-application uses. Add no global or contextual substitution, form, or conversion. [S01–S02, S05]

## Source register

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B3-BREADFRUIT-STARCH-R78-20261013-S01** | Rincón and Padilla, [“Physicochemical properties of Venezuelan breadfruit (*Artocarpus altilis*) starch”](https://ve.scielo.org/scielo.php?pid=S0004-06222004000400013&script=sci_arttext), *Archivos Latinoamericanos de Nutrición* 54(4), 2004. Studies a seedless Margarita Island variety; distinguishes dried/milled flesh flour from wet-isolated native starch and reports the sample recovery and purity figures above. | One regional variety and lab extraction method. The yield and composition are not household or general product data. |
| **WP02-B3-BREADFRUIT-STARCH-R78-20261013-S02** | Broomes, Badrie, and Roberts-Nkrumah, [“The characterization of starch from selected breadfruit (*Artocarpus altilis*) cultivars at two stages of maturity”](https://journals.sta.uwi.edu/ojs/index.php/ta/article/view/6518/0), *Tropical Agriculture* 93(5), 2016. Isolates starch from the flesh of 11 cultivars at immature and mature stages and compares physicochemical/functionality results. | Cultivar and laboratory findings; no kitchen measure, Québec name, or transferable substitution ratio. |
| **WP02-B3-BREADFRUIT-STARCH-R78-20261013-S03** | OQLF, [fruit de l’arbre à pain (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297101/fruit-de-larbre-a-pain), updated 1990. Lists `fruit de l’arbre à pain`, `fruit à pain`, English `breadfruit`, and *Artocarpus altilis*. | Names the fruit, not flour or extracted starch. |
| **WP02-B3-BREADFRUIT-STARCH-R78-20261013-S04** | OQLF, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Prefers `amidon` generally and identifies `fécule` as more specific for starch from tubers or underground plant organs. | Does not approve the compound `amidon du fruit à pain`; applying the general headword to this fruit starch is a naming inference. |
| **WP02-B3-BREADFRUIT-STARCH-R78-20261013-S05** | Joselle Nacitas, [*Composition du fruit à pain récolté sur un territoire contrasté : structure, propriétés et aptitudes technologiques de son amidon*](https://theses.fr/2012AGUY0517.pdf), doctoral thesis, Université des Antilles et de la Guyane, 2012. Studies fruit and starch in Martinique, describes starch extraction and food-technology work, and uses the French wording `amidon du fruit à pain`. | French Caribbean research, not Québec naming authority or current retail label. Its cited granule-density figures are not bulk-powder measurements. |

## Static review record

- Read current `AGENTS.md`, the open plan line, active references/forms, research ledger, legacy identities, bundled recipe manifest/corpus, and the closest flour/starch proposals and batch archive before drafting.
- Rechecked the primary study and OQLF pages online on 2026-10-13. Targeted bilingual product-name searches did not locate a Québec/Canadian standalone starch listing; the search was not exhaustive.
- Reproduced current normalized phrase ownership and forecast picker outcomes from `IngredientSearch.kt`; scanned the manifest corpus; checked proposed ID and source-ID prefix collisions.
- UTF-8 without BOM, all five Markdown links using HTTPS, zero missing local link targets, no trailing whitespace, no known mojibake markers, and a parseable JSON delta block were verified after writing.
- No tests or emulator run: this is proposal-only research; if accepted, the catalog addition is a database-JSON-only change, for which `AGENTS.md` says testing is not needed.
