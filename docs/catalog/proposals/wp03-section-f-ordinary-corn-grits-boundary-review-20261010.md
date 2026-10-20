# WP03 Section F: ordinary corn grits boundary review

## Review record

- **Reviewed:** 2026-10-10.
- **Status:** the standardized product boundary is supported; a separate active identity and a distinct Québec French display remain on hold.
- **Scope:** ordinary, degermed maize grits for direct human consumption, compared with the integrated hominy-grits identity and cornmeal. This packet does not revisit prior reviews of polenta, whole-kernel hominy, pearled hominy, pozole corn, or dried sweet corn.
- **Disposition:** retain `ingredient-ref-hominy-grits` and `ingredient-ref-cornmeal` unchanged. Do not merge them. Do not create a new active reference or cross-alias on the evidence reviewed here.

## Decision

Codex CXS 155 supports a bounded food product separate from hominy grits and meal: degermed maize grits milled from common maize for direct human consumption. It explicitly excludes hominy grits, quick grits, and alkaline-treated maize products. The annex's sieve limits also distinguish standardized grits from standardized meal. This establishes that a *specified degermed-grits product* is not the same identity as hominy grits or cornmeal.

The exact Québec name is not settled. OQLF's `gruau de maïs` entry is scoped to brewing and malt crushing and overlaps both `grits` and U.S.-scoped `hominy grits`; Statistics Canada's human-food code directly assigns `gruau de maïs` to the existing hominy-grits display. OQLF uses `semoule de maïs` for cornmeal across fine, medium, and coarse grinds, and that exact display already belongs to `ingredient-ref-cornmeal`. Québec recipe and retail sources show `semoule de maïs de type grits` and `gruau de maïs` in ordinary cooking, but do not identify the Codex germ-removal or alkaline-treatment state. They support local wording, not an unambiguous translation for the bounded Codex product.

**Recommendation:** accept the product distinction in research; hold catalog allocation until a Québec-market human-food label or Québec terminology source connects the Codex-defined degermed-grits product to a French name that does not collide with the active rows. Do not route an unqualified `grits` or `corn grits` line automatically to hominy grits or cornmeal. A future candidate display to validate is `degermed corn grits / semoule de maïs de type grits`; the French side is only a locally attested descriptive phrase, not a verified direct equivalent. Add no aliases now.

## Current catalog and checklist state

The read-only snapshot contains 862 active ingredient references, 47 forms, 1,107 research-ledger records, and 114 bundled recipes with 1,123 ingredient rows. The checked [reference seed](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms seed](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), and [research ledger](../research-ledger.v1.json) are the current package files. Exact normalized display/alias checks found:

| Current ID checked | Current display and state | Review disposition |
| --- | --- | --- |
| `ingredient-ref-hominy-grits` | `hominy grits / gruau de maïs`; `GRAIN_AND_CEREAL`; no aliases; no density or unit mappings. Ledger identity is verified; measurement and substitution research remain `not_yet_researched`. | Keep as the existing ground hominy product. Keep the current bilingual display and aliases unchanged; the documented Québec uniqueness concern remains a terminology caveat, not a basis to rename or recreate the integrated identity. |
| `ingredient-ref-cornmeal` | `cornmeal / semoule de maïs`; `FLOUR_AND_STARCH`; English alias `corn meal`; no French aliases, density, or unit mappings. Ledger identity is verified; measurement and substitution research remain `not_yet_researched`. | Keep as the broad dry-ground-corn meal identity. OQLF's fine/medium/coarse note does not make every coarse cornmeal a grits product. |
| `ingredient-ref-hominy-corn` | `hominy corn / maïs lessivé`; `VEGETABLE_AND_AROMATIC`; no aliases. | Keep the processed whole-kernel identity distinct from either ground product. |
| `ingredient-ref-corn-kernels` | `corn kernels / maïs`; `VEGETABLE_AND_AROMATIC`. | Keep whole kernels separate from grits and meal. |
| `ingredient-ref-masa-harina` | `masa harina / farine de maïs nixtamalisée`; `FLOUR_AND_STARCH`. | Keep the nixtamalized flour product distinct; do not use it as a grits alias. |

No active display or alias exactly matches `corn grits`, `maize grits`, `ordinary corn grits`, `degermed corn grits`, `semoule de maïs de type grits`, or `grits de maïs`. The exact current matches are `hominy grits` and `gruau de maïs` on `ingredient-ref-hominy-grits`, and `semoule de maïs` on `ingredient-ref-cornmeal`. No current form contains a grits, hominy, or cornmeal term. The ledger has no dedicated generic/ordinary-corn-grits candidate record; it mentions generic grits only as an unresolved neighboring concept in the hominy-grits research. These observations come from the current seed and ledger files, not a proposed integration.

The open aggregate checklist remains **WP03 Section F, “Grits, polenta, pearled hominy, pozole corn, dried sweet corn, and remaining puffed-grain candidates,” plan lines 1438–1448**. It records hominy grits as integrated and generic grits as unresolved. This packet resolves the product boundary for a narrowly specified ordinary degermed product, but leaves the open name/allocation question for generic recipe wording. It makes no change to other listed candidates. See the [plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1438) and [hominy-grits identity record](../batches/hominy-grits-identity.md).

## Recipe demand and search collisions

A scan of all 114 bundled recipe JSON files and their 1,123 ingredient rows found no occurrence of `grit`, `grits`, `hominy`, `cornmeal`, `corn meal`, `semoule de maïs`, or `gruau de maïs`; neither active ID is linked from a bundled ingredient row. The corpus therefore supplies no reason to add a row, relink a recipe, infer a state form, or broaden aliases.

The relevant lexical collisions are meaningful:

- `gruau de maïs` is already the exact French display for hominy grits. OQLF's older entry lists `grits` and `corn grits`, but its domain is brewing/malt crushing; it cannot support assigning that term to a second human-food row.
- `semoule de maïs` is already the exact French display for cornmeal. OQLF includes coarse grinds under that broad term, so coarse texture alone is not a safe alias rule.
- Local Québec culinary sources use `semoule de maïs de type grits`, and a Québec retailer labels a coarse-ground white-corn product `gruau de maïs`. These confirm that local wording overlaps; they do not document whether those particular products are degermed or alkali-treated.
- CFIA's Canadian Feed Ingredients Table uses `Corn grits (or hominy grits)` for an animal-feed ingredient. That feed entry is not evidence that the human-food products in Codex or the active human-food catalog should be merged.

## Names and merge recommendations

| Term or candidate | Recommendation |
| --- | --- |
| Existing `hominy grits / gruau de maïs` | Retain the integrated ID, display, category, and empty aliases. Do not assign generic `grits` or `corn grits` to it. |
| Existing `cornmeal / semoule de maïs` | Retain the integrated ID and its existing `corn meal` English alias. Do not add `grits`, `corn grits`, or `semoule de maïs de type grits`. |
| Strict product concept `degermed corn grits` | Accept as a distinct research concept under the Codex scope, not as a new active seed row yet. A later source naming the exact human-food product in Québec French is needed before allocation. |
| Candidate bilingual wording for later validation | `degermed corn grits / semoule de maïs de type grits`. The English wording scopes the Codex-defined state; the French phrase is attested in Québec recipes but does not itself prove germ removal. Do not store as a display until that mismatch is resolved. |
| Unqualified `grits`, `corn grits`, `gruau de maïs`, `semoule de maïs` | Do not add as aliases to the candidate or either active row. Resolve a recipe line from its package/process wording when it is encountered. |
| Merge ordinary grits with hominy grits or cornmeal | Reject. Codex excludes hominy grits from its degermed-grits standard and separately defines meal; the existing identities also have different supported categories and displays. |

No name collision was found for a new candidate's hypothetical English display, but the French terms are already occupied or semantically overlapping. Keep the proposal at identity-boundary level and do not reserve a new ID.

## Measurement, forms, and substitutions

No conversion or cooking data is proposed. The corpus has no matching recipe line. Le Porc du Québec gives one recipe quantity of `250 ml / 1 cup` for `semoule de maïs de type grits` and offers coarse `semoule de maïs no 120` as a recipe-specific alternate; it supplies no mass equivalent and does not specify the grain's processing. These are source-recipe observations only, not an ingredient density, unit mapping, or reusable substitution rule. No dry/cooked form, cooking yield, or hominy-grits conversion is supported here. Keep measurement and substitution state unknown.

## Focused future picker fixtures

These are proposal-level expectations for any later integration or terminology change; this packet adds no tests or catalog rows.

| Input | Expected result |
| --- | --- |
| `hominy grits` | Existing `ingredient-ref-hominy-grits` only. |
| `gruau de maïs` | Existing `ingredient-ref-hominy-grits` under its current display; do not silently generalize it to ordinary grits. |
| `cornmeal`, `corn meal`, `semoule de maïs` | Existing `ingredient-ref-cornmeal` only. |
| `degermed corn grits` | No active exact match while the new identity is held; do not resolve to hominy grits or cornmeal. |
| `corn grits`, bare `grits` | Do not auto-link to either active row. Ask for package/process context or retain unresolved text. |
| `semoule de maïs de type grits` | Do not treat as the exact cornmeal display or add it to hominy-grits aliases; keep unresolved until the product scope and French mapping are approved. |

## Sources

All pages below were accessed on 2026-10-10. Official standards and terminology sources support the product and lexical boundaries; recipe and retailer pages are used only for Québec usage examples and recipe-specific context.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-OCG-20261010-S01` | Codex Alimentarius, [Standard for Degermed Maize (Corn) Meal and Maize (Corn) Grits, CXS 155-1985](https://www.fao.org/input/download/standards/53/CXS_155e.pdf), sections 1.1–1.3, 2.1–2.2, 7.1, Annex | Defines degermed maize grits for direct human consumption from common maize and excludes hominy grits, quick grits, and alkaline-treated corn products. Separately describes meal. Annex sieve limits distinguish the standardized products. The standard does not provide a Québec French display. Adopted 1985, revised 1995. |
| `WP03-OCG-20261010-S02` | Statistics Canada, [MDFoodCode](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf), F232 rows 916 and 918 | Directly pairs `Corn meal / Semoule de maïs` and `Hominy grits / Gruau de maïs` as separate human-food entries. It does not name the Codex ordinary degermed-grits product. |
| `WP03-OCG-20261010-S03` | OQLF, [semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais), updated 2019 | Gives the preferred Québec French term for dry-ground corn meal and notes fine, medium, and coarse grinds. This broad term is already the active cornmeal display. |
| `WP03-OCG-20261010-S04` | OQLF, [gruau de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088614/gruau-de-mais), updated 1986 | Lists `grits` and `corn grits`, with U.S.-scoped `hominy grits`, under a brewing/malt-crushing entry. Useful lexical context, not a current human-food term distinction. |
| `WP03-OCG-20261010-S05` | Le Porc du Québec, [Côtes levées coupe St-Louis et grits au cheddar et au jalapeno](https://www.leporcduquebec.com/recette/489-cotes-levees-coupe-st-louis-et-grits-au-cheddar-et-au-jalapeno/), ingredient line and note | Québec recipe wording `semoule de maïs de type grits (gruau de maïs)` and an alternate coarse corn semolina no. 120. It does not identify germ removal or alkaline treatment; its amount and alternate stay recipe-specific. |
| `WP03-OCG-20261010-S06` | La Moisson, [Gruau de maïs blanc crémeux](https://lamoisson.com/products/gruau-de-mais-blanc-cremeux-creamy-white-corn-grits), description and ingredient list | Québec retail page uses `gruau de maïs` for a coarse-ground dried white-corn product with ingredient `maïs blanc`; it does not state whether the corn is degermed or alkali-treated. |
| `WP03-OCG-20261010-S07` | Canadian Food Inspection Agency, [Canadian Feed Ingredients Table](https://inspection.canada.ca/en/animal-health/livestock-feeds/documents-incorporated-reference/canadian-feed-ingredients-table?wbdisable=false), item 1-202-007 | Feed-scoped entry labels `Corn grits (or hominy grits)` as medium-sized ground corn portions low in bran/germ. Do not generalize this feed equivalence to human-food identities. |

## Evidence limits

The Codex definition makes the ordinary degermed-grits boundary defensible, but no source reviewed pairs that precise human-food product with a non-colliding Québec French term. The local culinary sources do not disclose enough processing detail to prove that their generic grits wording means Codex-standard degermed grits rather than hominy grits. The OQLF `gruau de maïs` entry is old and brewing-scoped; its overlap is a reason to keep aliases empty, not evidence for a second row. The CFIA equivalence is for feed only. No recipe-corpus demand, global quantity, yield, or transferable substitution resolves these remaining gaps.
