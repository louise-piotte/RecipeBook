# WP06 African regional gap review R481 — dried Gnetum leaves

- **Date:** 2026-10-17
- **Status:** Proposal only; no shared catalog, form, ledger, recipe, plan, roadmap, or generated-file changes made.
- **Scope:** One dried Central African leafy-vegetable identity under the still-open Section 05 African cuisine-coverage item. This is separate from R478 kuka (baobab-leaf powder) and R475 Voatsiperifery pepper.
- **Recommendation:** Accept one identity-only `VEGETABLE_AND_AROMATIC` row for **`dried Gnetum leaves` / `feuilles séchées de Gnetum`**, with no aliases. Scope it to dried edible leaves sold as *Gnetum* products, whose commercial lots may include *G. africanum* and *G. buchholzianum*. Keep the region-specific names `eru`, `okok`, `okazi`, `fumbwa`/`fumbua`, `afang`, `ukasi`, and `koko` out of the global alias list.

## Open-plan fit and prior-work boundary

The Africa coverage line in [Section 05 of the global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt) remains open after the six-region sweep, its 2026-10-13 continuation, and R478. This proposal adds one bounded Central African ingredient and does not claim country-level or continental coverage.

No earlier focused *Gnetum*-leaf proposal or decision was found in the active references, forms, legacy-import candidates, ledger, plan, roadmap, or proposal/batch archive. The active `ingredient-ref-cassava-leaves`, species-qualified `ingredient-ref-vernonia-amygdalina-leaves`, and `ingredient-ref-baobab-leaf-powder` are different plants or plant parts. R478's dried baobab-leaf powder is not a generic dried-leaf identity and does not cover *Gnetum*.

The Codex regional standard covers fresh whole or sliced leaves of *Gnetum* spp. and says the commercial group commonly comprises *G. africanum* and *G. buchholzianum*. FAO and PROTA describe both species as close and often mixed in trade; PROTA also reports shredded leaves being dried for preservation and export. The candidate therefore follows the genus-level trade product, not a single retail listing's species identification. Codex spells the second species `Gnetum bucholzianum`; FAO and PROTA use `Gnetum buchholzianum`. The proposed user-facing terms avoid turning that spelling discrepancy into an alias or species claim.

## Live package snapshot and ownership audit

Counts and hashes were refreshed on 2026-10-17 before drafting. Hashes cover exact file bytes. The recipe aggregate follows `manifest.recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, its exact recipe bytes, and a NUL byte.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,757 references | 572,182 | `2ddb0accff533d31bde9e28fbcab09df94ce63434a9c8342e220f57fe96eff58` |
| `ingredient-forms.v1.json` | 142 forms | 112,520 | `19efc2f40ddd50e33c1373a997d6940962cabe32d929efedaab38934e46bea62` |
| `legacy-import-identities.v1.json` | 56 candidates | 13,351 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,116 records; 9,648 source entries; 8,190 distinct source IDs; 6,903 distinct URLs | 9,866,502 | `66ea3489b2237dcdc3bac5c545a65767bc52f18280177c73b632de99706ff0b0` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,988 aggregate bytes | — | `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

The proposed ID `ingredient-ref-dried-gnetum-leaves`, target proposal path, and source-ID prefix `WP06-AFRICA-DRIED-GNETUM-R481-20261017-S` were absent from active references, forms, legacy IDs, the ledger, and the archive at audit time. Exact normalized keys for `dried Gnetum leaves`, `Gnetum leaves`, `Gnetum spp.`, `feuilles séchées de Gnetum`, and the source-reported variants below had no active-reference, form, or legacy owner. No exact *Gnetum*/Eru/Okok product owner was found in prior proposals or batches. The word `koko` does occur in the archive's separate Hausa Koko flour hold; keep it out of this row.

The six proposal-local source IDs and their exact URLs in the source register below were not present in the live ledger at audit time. Recheck source-ID and URL ownership immediately before any integration.

## Candidate identity and name boundaries

| Proposed reference ID | English display | fr-CA display | Category | Aliases |
|---|---|---|---|---|
| `ingredient-ref-dried-gnetum-leaves` | `dried Gnetum leaves` | `feuilles séchées de Gnetum` | `VEGETABLE_AND_AROMATIC` | None |

The English display uses the source-backed ingredient name `Gnetum leaves` and specifies the dried product state supported by PROTA and Canadian retail listings. The French display follows Codex's product phrase `Feuilles de Gnetum spp.` and the Québec retailer's `feuille séchée de Gnetum africanum` wording. No OQLF preferred term was found in targeted searches; this is a clear descriptive fr-CA display, not an OQLF ruling.

| Name or boundary | Evidence and current ownership | Disposition |
|---|---|---|
| `Gnetum leaves`, `dried Gnetum leaves`, `feuilles de Gnetum`, `feuilles séchées de Gnetum` | No exact active reference, form, or legacy owner. Codex and FAO use the genus-level leaf product; the Québec seller lists its dried form. | Add one genus-level identity for the dried leaf product. Do not claim every lot is *G. africanum* alone. |
| `eru`, `okok`/`okoko`, `okazi`, `fumbwa`/`fumbua`, `afang`, `ukasi` | Codex lists local names by country; FAO gives Cameroon/Nigeria/Central African name distributions and says the two main species are indistinguishable in commercial lots. Some names also identify finished preparations made with the leaves. | Keep all out of aliases because the catalog cannot scope an alias by region or prepared-dish sense. The Québec seller's multi-name product title is evidence of its listing, not a global synonym set. |
| `koko` | FAO reports it as a Central African regional name for *Gnetum*, but the project archive has a separate Hausa Koko flour hold because bare `koko` is ambiguous. | Do not use it in display or aliases. Preserve the existing Hausa Koko picker boundary. |
| `Gnetum africanum`, `Gnetum buchholzianum`, `Gnetum bucholzianum` | Codex, FAO, and PROTA discuss two similar African species and mixed trade. The sources also differ in spelling of the second species. | Keep binomials in source notes, not aliases; a retail product name does not establish a species-pure lot. |
| *Gnetum* seeds, underground roots/tubers, stems, and other plant parts | FAO/PROTA discuss these as separate plant parts and uses. | Exclude from this leaf identity. |
| `eru`, `okok`, or `fumbwa` sauce/stew | The sources and Canadian product pages use the same local terms in finished-dish contexts. | Do not index finished dishes as aliases for the dried leaves. |
| `wild spinach`, generic forest greens, other *Gnetum* species | No reviewed source supports these as global aliases for this African two-species trade product. | Keep unassigned. |

## Picker effects

The picker normalizes case, accents, and punctuation, prefers complete word phrases, then falls back to partial matching. Baseline queries were projected against the current reference catalog and the proposed displays, with no aliases.

| Query | Current result | With proposal |
|---|---|---|
| `Gnetum`, `Gnetum leaves`, `dried Gnetum leaves`, `feuilles de Gnetum`, `feuilles séchées de Gnetum`, `Gnetum spp.` | No result | `ingredient-ref-dried-gnetum-leaves` |
| `Gnetum africanum`, `Gnetum buchholzianum` | No result | No result; species aliases are intentionally omitted because trade lots may mix species. |
| `okok`, `okazi`, `fumbwa`, `fumbua`, `afang`, `ukasi`, `koko` | No result | Unchanged; no regional alias is activated. |
| `eru` | Five unrelated partial-match results, including Jerusalem artichoke and whey powder | Unchanged; no bare `eru` alias is added because of its regional and prepared-dish ambiguity. |
| `leaves` / `feuilles` | 28 / 35 references | 29 / 36 references |

The exact genus and qualified bilingual product queries remain narrow. Keeping the broad local names out means the picker does not assume that each region's term is interchangeable or that a prepared dish is the same item as the dried leaves.

## Bundled recipe demand

All 114 manifest-listed recipe JSON files and all 1,123 `ingredients[]` rows were scanned, including full serialized recipe text and ingredient identity/text fields. Case-folded, accent-insensitive whole-phrase probes covered `Gnetum`, `Gnetum spp.`, *G. africanum*, both spellings of *G. buchholzianum*, dried Gnetum leaves, `eru`, `okok`/`okoko`, `okazi`, `fumbwa`/`fumbua`, `afang`, `ukasi`, `koko`, and French product phrases. The scan found **zero full-recipe hits and zero ingredient-row hits**. No recipe link, row change, or relink is proposed.

The Canadian seller pages are external market evidence, not bundled RecipeBook recipes. Their recipes, suggested preparation, and product use descriptions do not create recipe demand in the bundled package.

## Product, form, numeric, and substitution limits

The candidate is dried Gnetum leaves, reported as commonly shredded for cooking. It excludes fresh whole/sliced leaves covered by the Codex standard as a state-specific scope, and it does not merge the leaf ingredient with *Gnetum* seeds or roots. Add no form or match term in this proposal: current evidence identifies dried shredded retail leaves, while any reusable cross-state form relationship can be reviewed separately if the application has a recipe need.

No `defaultDensity`, unit mapping, reusable kitchen measure, conversion, or package yield is supported. The Québec product page offers 50 g, 100 g, and 200 g package variants; those are SKU net weights. A Canadian seller lists a 100 g package and suggests a dish-specific amount and rehydration method for four people; these are seller guidance, not a tested recipe-corpus measure or transferable conversion. Codex's fresh-product bundle/quality provisions do not apply as kitchen measures for dried leaves. Do not import these values into active numeric data.

PROTA says *G. africanum* leaves may be replaced in a dish by *G. buchholzianum* (already within this genus-level scope) or by *Lasianthera africana*. This qualitative taste statement gives no ratio, role, or method boundary. Add no active substitution rule or recipe-line substitution link; keep other-species replacement research open.

## Proposed data and ledger action

If accepted, add one identity-only row:

```json
{
  "id": "ingredient-ref-dried-gnetum-leaves",
  "nameFr": "feuilles séchées de Gnetum",
  "nameEn": "dried Gnetum leaves",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

If integrated, add an `ingredient_reference` ledger record with identity `verified`, measurement `researched_no_supported_value`, and substitution `researched_no_supported_substitute`. Use the sources below for identity and naming only. Add no forms, ingredient mappings, recipe links, yield, conversion, density, or active substitution rule. Keep broad Section 05 African coverage open.

## Sources and limits

Sources were checked on 2026-10-17. The six IDs are proposal-local and were not in the shared ledger at audit time.

| ID | Source and locator | Claim used and limit |
|---|---|---|
| **WP06-AFRICA-DRIED-GNETUM-R481-20261017-S01** | FAO/WHO Codex Alimentarius, [Norme régionale sur les feuilles fraîches de Gnetum spp. (Afrique), CXS 335R-2020](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/fr/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B335R-2020%252FCXS_335Rf.pdf), adopted 2020, amended 2022, §1, §6.1, and footnote 2. | Names fresh whole/sliced *Gnetum* leaves, says the main African commercial species are *G. africanum* and *G. bucholzianum*, and gives local label examples `Okok`/`Eru`, `Okazi`/`Afang`, and `Fumbua`. Supports the genus-level product and alias-scope caution; it does not standardize dried leaves or a Québec term. |
| **WP06-AFRICA-DRIED-GNETUM-R481-20261017-S02** | Charles Tekwe, Nouhou Ndam, and Joseph Poteh Nkefor, [“Gnetum domestication for livelihood improvement and conservation”](https://www.fao.org/4/XII/0671-B5.htm), FAO, “Introduction” and “Importance of Gnetum.” | Names edible leaves of *G. africanum* and *G. buchholzianum*, documents country/locality name differences and says the commercial species are not distinguishable, and describes the leaf vegetable in West and Central African trade. It is regional ethnobotanical/agroforestry evidence, not a retail specification or Québec language ruling. |
| **WP06-AFRICA-DRIED-GNETUM-R481-20261017-S03** | Plant Resources of Tropical Africa (PROTA), [*Gnetum africanum*](https://plantuse.plantnet.org/en/Gnetum_africanum_(PROTA)), “Uses,” “Production and international trade,” and “Adulterations and substitutes.” | Describes both African species as the vegetable called `eru`/`koko`, says shredded leaves can be dried and preserved, notes mixed commercial consignments and dried exports, and reports a qualitative possible substitute. It does not establish a universal alias set, household measure, or substitution ratio. |
| **WP06-AFRICA-DRIED-GNETUM-R481-20261017-S04** | AFFOXY, [Okok séché / Okazi / Fomboua](https://affoxy.ca/boutique/feuilles-legumes-seches/feuilles-dokok-sechees/), current product listing, accessed 2026-10-17. | Québec retailer lists dried shredded *Gnetum africanum* leaves from Cameroon and French wording `feuille séchée de Gnetum africanum`; the page offers 50/100/200 g variants. Supports a Québec retail display construction and one dried product, not universal species purity, synonymy, portion measures, or conversions. |
| **WP06-AFRICA-DRIED-GNETUM-R481-20261017-S05** | AFFOXY, [Notre histoire](https://affoxy.ca/notre-histoire/), company background. | Identifies AFFOXY as based in Sainte-Marthe-sur-le-Lac, Québec, and describes its Canadian Cameroon-food market. Supports Québec-facing retail context only, not terminology authority or product specification. |
| **WP06-AFRICA-DRIED-GNETUM-R481-20261017-S06** | SAVANNA SELECT, [Dried ERU Leaves (Okok) 100 g](https://savannaselect.ca/en/produit/feuille-eru), Calgary bilingual product listing, accessed 2026-10-17. | Uses the English display `Dried ERU Leaves (Okok)` and identifies the product as dried *G. africanum*; its French counterpart is `Feuilles d'eru séchées (Gnetum / Okok)`. The 100 g SKU, seller's serving suggestion, volume change, and preparation instructions are product/page-specific and are not imported as active recipe measures. |

This proposal addresses only the dried *Gnetum* leaf product. The local name boundaries, fresh-product state, other plant parts, alias scope, and wider African regional coverage remain open for separate source-led review. No tests, builds, emulator checks, or deployment were run; this is proposal-only documentation.
