# WP03 Section F: polenta, grits, and dry cornmeal product boundary review

## Review record

- **Reviewed:** 2026-10-11.
- **Status:** product boundaries are supported, but ordinary corn-grits allocation remains on hold because Québec wording overlaps active names and no bundled recipe demands it. Keep the existing cornmeal and hominy-grits references unchanged; keep bare `polenta` and generic `grits` unallocated.
- **Scope:** prepared polenta versus dry cornmeal products; ordinary degermed corn grits versus hominy grits; current related dry-corn references. Pearled hominy and pozole corn are excluded. This review does not revisit wheat, rice, or puffed-grain records.
- **Changes:** proposal document only. No seed, ledger, recipe, plan, roadmap, index, or README was edited. No tests were run.

## Recommendation

Do not add or merge a catalog identity in this review.

Keep `cornmeal / semoule de maïs` as the broad dry-ground-corn product. OQLF explicitly says its grind can be fine, medium, or coarse, so coarse texture alone does not support splitting every coarse cornmeal into grits. Keep its existing English alias `corn meal`.

Keep `hominy grits / gruau de maïs` as the existing ground hominy product, with no aliases. Statistics Canada's human-food food-code table directly pairs these names; Codex separately excludes hominy grits from its standard for degermed corn grits. `Gruau de maïs` also appears in Québec cooking for grits more generally, so the French term should remain scoped to this existing row rather than become a generic alias.

Keep bare `polenta` unallocated. OQLF defines it as a prepared dish made from corn semolina cooked with liquid. Retail products also use *polenta* as a dry ingredient label, but the reviewed Québec manufacturer and Canadian manufacturer pages show different product descriptions: precooked corn semolina in one case and dried, coarsely ground corn in another. These examples do not define one source-neutral product class. Do not add `polenta` as a cornmeal or hominy-grits alias, ingredient form, or separate generic reference.

Treat ordinary degermed corn grits as a distinct *research concept*, not yet as an active reference. Codex defines a direct-human-consumption degermed grits product, separate from hominy grits and meal. A later candidate could use English `degermed corn grits` and provisionally investigate the descriptive fr-CA wording `semoule de maïs de type grits`; that French phrase is used in Québec culinary writing but does not prove the product's degermination. `Gruau de maïs` is already the active hominy-grits display, while `semoule de maïs` is the active cornmeal display. Do not activate either broad wording or the provisional compound as a display or alias until a Québec/Canadian food source connects it to the bounded product.

No candidate merits an alias or merge. If ordinary degermed grits later receives a supported bilingual identity, `GRAIN_AND_CEREAL` is the likely category because the source defines it as a milled cereal-grain product; keep its aliases empty unless direct sources establish narrower terms. This is a future proposal only, not an active row or reserved ID.

## Product and catalog boundaries

| Product | Current or proposed wording | Disposition |
| --- | --- | --- |
| Dry cornmeal | `cornmeal / semoule de maïs`; English alias `corn meal`; `FLOUR_AND_STARCH` | Retain. OQLF includes fine, medium, and coarse grinds under *semoule de maïs*. Do not add `grits`, `polenta`, or a coarse-grind form. |
| Ground hominy | `hominy grits / gruau de maïs`; no aliases; `GRAIN_AND_CEREAL` | Retain. Federal human-food coding supports the pair; Codex excludes it from ordinary degermed corn grits. Keep the French phrase scoped to this row despite broader Québec culinary use. |
| Ordinary degermed corn grits | Candidate `degermed corn grits`; possible descriptive French lead `semoule de maïs de type grits` | Hold. The English technical product is defined, but the French phrase does not establish degermination and `gruau de maïs` is already assigned. Do not create a row, aliases, or forms. |
| Polenta | `polenta` | Hold as ingredient identity. It names a prepared dish and is also used on different dry corn products. Resolve a future recipe line from its exact ingredient/package, not from the word alone. |
| Whole hominy | `hominy corn / maïs lessivé`; `VEGETABLE_AND_AROMATIC` | Keep separate as the processed whole-kernel product. This review does not reopen pearled hominy or pozole corn. |
| Masa harina | `masa harina / farine de maïs nixtamalisée`; `FLOUR_AND_STARCH` | Keep separate as nixtamalized flour. Codex excludes alkaline-treated maize products from the degermed-meal/grits standard. |
| Precooked corn flour | `precooked corn flour / farine de maïs précuite`; `FLOUR_AND_STARCH` | Keep separate from semolina and grits. A source-specific precooked polenta product does not create a generic equivalence. |
| Roasted corn flour | `roasted corn flour / farine de maïs torréfiée`; `FLOUR_AND_STARCH` | Keep separate; no evidence connects the named flour product to grits or generic polenta. |
| Whole-kernel corn flour | `whole-kernel corn flour / farine de maïs`; `FLOUR_AND_STARCH` | Keep separate as flour. |

Reject merging cornmeal, ordinary grits, hominy grits, and polenta. The terms cover different product scopes: broad dry meal, a specified degermed granulation class, ground alkaline-treated hominy, and a prepared dish or variable retail label. Shared corn base or coarse texture is not enough to equate them.

## Current package, collision, and recipe audit

The manifest-listed package currently contains **1,090 ingredient references**, **79 ingredient forms**, **1,389 research-ledger records**, and **114 recipes**. A scan of every manifest-listed recipe file counted **1,123 ingredient rows**. The scan checked both complete recipe JSON text and ingredient-line fields for `polenta`, corn/maize grits, `grits`, hominy grits, *gruau de maïs*, *semoule de maïs*, cornmeal, and related corn-product wording. It found **zero full-text hits and zero ingredient-line hits**. This is a snapshot audit, not a picker test.

Using the repository's `normalize_search_key` (NFKD/case folding, accent removal, and punctuation-to-space normalization), exact candidate-term keys were checked against active reference displays and aliases, form labels and match terms, and legacy-candidate names and aliases:

| Candidate/query | Exact normalized owner in the current active references |
| --- | --- |
| `polenta`, `corn polenta` | None |
| `grits`, `corn grits`, `maize grits`, `degermed corn grits` | None |
| `hominy grits` | `ingredient-ref-hominy-grits` (`hominy grits / gruau de maïs`) |
| `gruau de maïs` | `ingredient-ref-hominy-grits` |
| `cornmeal`, `corn meal` | `ingredient-ref-cornmeal` (`cornmeal / semoule de maïs`; `corn meal` is an English alias) |
| `semoule de maïs` | `ingredient-ref-cornmeal` |
| `semoule de maïs de type grits`, `grits de maïs`, `corn semolina` | None |
| `masa harina`, `farine de maïs précuite` | `ingredient-ref-masa-harina` and `ingredient-ref-precooked-corn-flour`, respectively |

No current form label or match term exactly owns the candidate grits/polenta phrases. The ledger contains the existing unresolved `ingredient-ref-polenta` candidate but no separate ordinary-corn-grits record. Proposed IDs `ingredient-ref-ordinary-corn-grits` and `ingredient-ref-corn-grits` are not in the active seed, legacy candidates, or ledger; neither should be reserved while the name remains unresolved. The exact-key review does not claim there are no partial-search overlaps.

The active cornmeal and hominy-grits rows have null density, empty unit mappings, and no attached forms. Their ledger measurement and substitution states remain `not_yet_researched`. This review adds no density, household measure, form, conversion, cooking yield, package yield, substitution, or recipe link. Brand serving values and recipe quantities remain product- or recipe-specific evidence only.

The open aggregate checklist remains WP03 Section F at [plan lines 1804–1810](../../RecipeBook-global-ingredient-catalog-plan.txt#L1897). This packet records the polenta/grits disposition only; it does not close the remaining Section F work or change pearled-hominy and pozole-corn decisions.

## Focused future picker expectations

- `cornmeal`, `corn meal`, and `semoule de maïs` continue to resolve only to `ingredient-ref-cornmeal`.
- `hominy grits` and the current exact French display `gruau de maïs` continue to resolve only to `ingredient-ref-hominy-grits`.
- Do not resolve bare `grits` or `corn grits` to either active reference. Keep them unresolved until a source- and recipe-specific product boundary is available.
- Do not resolve `polenta` automatically to a dry-corn row. If it appears as a recipe ingredient, inspect the product/recipe context; if it names the prepared dish, retain it as dish or preparation wording.
- Keep `masa harina`, precooked corn flour, roasted corn flour, whole-kernel corn flour, whole hominy, and corn kernels distinct.

## Sources

Sources were accessed on 2026-10-11. IDs in this table are local to this proposal and have not been added to the shared research ledger.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-CORNBOUNDARY-20261011-S01` | FAO/WHO Codex Alimentarius, [Standard for Degermed Maize (Corn) Meal and Maize (Corn) Grits, CXS 155-1985](https://openknowledge.fao.org/handle/20.500.14283/ce0343en), current 2026 edition, §§1–2, 7.1, Annex | Defines degermed maize grits for direct human consumption and distinguishes the meal and grits granularity classes. It excludes whole meal, flour, quick grits, hominy grits, and alkaline-treated maize products. It supplies no Québec French display. |
| `WP03-CORNBOUNDARY-20261011-S02` | Office québécois de la langue française, [polenta](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26557111/polenta), 2019, definition and note | Defines polenta as an Italian dish made from corn semolina cooked with liquid. This is dish terminology, not a generic dry ingredient label. |
| `WP03-CORNBOUNDARY-20261011-S03` | Office québécois de la langue française, [semoule de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais), 2019, definition and note | Defines it as milled dried corn kernels; says it can be fine, medium, or coarse and is used to prepare polenta; gives `corn meal` as English. This supports retaining broad cornmeal and not splitting on grind alone. |
| `WP03-CORNBOUNDARY-20261011-S04` | Office québécois de la langue française, [gruau de maïs](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2088614/gruau-de-mais), 1986, domain, preferred term, and translations | Lists *grits*, *corn grits*, U.S. *hominy grits*, and U.K. *maize grits* under the French term, but the entry's domain is brewing/malt crushing. It is not a current consumer-food crosswalk. |
| `WP03-CORNBOUNDARY-20261011-S05` | Statistics Canada, [Monthly Millers Survey, 2024](https://www23.statcan.gc.ca/imdb/p3Instr_f.pl?Function=assembleInstr&Item_Id=1530723), question 10, lines 474–482 | In current Canadian miller reporting, separately lists `Gruau de maïs (tous genres)` and `Grosse semoule de maïs`. This confirms distinct reporting labels, but does not define processing scope or pair each with an English consumer name. |
| `WP03-CORNBOUNDARY-20261011-S06` | Statistics Canada, [MDFoodCode](https://www.statcan.gc.ca/en/statistical-programs/document/3503_DLI_D12_T22_V1_B.pdf), F232, rows 916 and 918 | Directly pairs human-food `Corn meal / Semoule de maïs` and `Hominy grits / Gruau de maïs` as separate entries. The table is an older food-code reference, not a current retail label standard. |
| `WP03-CORNBOUNDARY-20261011-S07` | RICARDO, [Grits aux crevettes](https://www.ricardocuisine.com/recettes/8419-grits-aux-crevettes), ingredient line and team note | Uses `semoule de maïs de type grits` in a Québec recipe and says coarse semoule no. 250 of the polenta type can replace it. This demonstrates overlapping local culinary wording, not a processing equivalence or reusable conversion. Recipe amounts are not ingredient mappings. |
| `WP03-CORNBOUNDARY-20261011-S08` | TIPIAK Canada, [Polenta](https://tipiak.ca/produit/polenta/), product description and ingredients | The manufacturer's Québec-facing page sells polenta as a 5-minute precooked product and lists `semoule de maïs précuite`. It documents one product's process, not a general polenta identity. |
| `WP03-CORNBOUNDARY-20261011-S09` | Bob's Red Mill Canada, [Polenta de maïs jaune](https://www.bobsredmill.ca/produit/corn-grits-polenta), product description | The Canadian manufacturer's page describes its polenta as dried, coarsely ground yellow corn. This is one brand's product and does not establish the composition or processing of all products labelled polenta. |

## Outcome

Retain the current cornmeal and hominy-grits rows exactly as they are. Keep ordinary degermed corn grits as an unallocated research concept until a Québec/Canadian food source supplies a reliable French label that distinguishes it from hominy grits and broad cornmeal. Keep `polenta` unallocated for ingredient matching because sources use it for the prepared dish and materially different dry retail products. No data, forms, recipe links, or numeric behavior are proposed.
