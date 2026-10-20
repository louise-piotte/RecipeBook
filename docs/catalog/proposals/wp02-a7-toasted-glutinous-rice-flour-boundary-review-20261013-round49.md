# WP02 A7 R49: toasted glutinous rice flour boundary review — 2026-10-13

## Review record

- **Status:** Proposal only; hold the candidate unallocated.
- **Scope:** The source-named food ingredient **toasted glutinous rice flour** and the toasted/sweet-rice flour wording around it. This review does not reopen malted rice flour, generic glutinous rice flour, toasted rice powder (*khao khua*), roasted red rice flour, Mochiko, or Shiratamako.
- **Open checklist:** [WP02 A7, “other grain meals, other malted/toasted flour identities, and gluten-flour equivalence”](../../RecipeBook-global-ingredient-catalog-plan.txt#L1444).
- **Proposal-local source IDs:** `WP02-A7-TOASTED-GLUTINOUS-RICE-FLOUR-20261013-R49-S01` through `S05`. These IDs are unique to this proposal and are not research-ledger source records.
- **Recommendation:** Keep **toasted glutinous rice flour** outside active references, aliases, and forms. A current B2B supplier page uses this exact English product name, and a prepared-food maker uses the flour in an espasol description. The sources do not establish a Canadian/Québec standalone product or an attested Québec French product name. The literal constructions `farine de riz gluant grillée` and `farine de riz gluant torréfiée` are not adopted.

## Dispositions

| Candidate or active row | Disposition | Boundary and limits |
|---|---|---|
| `toasted glutinous rice flour` | **Hold; no active row or alias.** Do not allocate `ingredient-ref-toasted-glutinous-rice-flour`. | The source phrase is product-attested by one B2B sourcing page, but its listing is not a Québec label or a regulator/terminology standard. No Québec French display is established. If reconsidered, a flour identity in `FLOUR_AND_STARCH` is more plausible than a form, but this remains provisional and unallocated. |
| `ingredient-ref-glutinous-rice-flour` — `glutinous rice flour / farine de riz gluant` | Retain unchanged. Its English aliases remain `sweet rice flour` and `sweet rice powder`. | The current row describes the unqualified flour. Do not put toasted wording on it or reuse the exact unqualified sweet-rice aliases for a processed product. The row currently has null density, empty unit mappings, no attached forms, and ledger measurement/substitution states `not_yet_researched`. |
| `ingredient-ref-toasted-rice-powder` — `toasted rice powder / poudre de riz rôti`, alias `khao khua` | Retain unchanged and separate. | The active row is a prepared dry seasoning sourced as toasted rice powder. The supplier candidate is described as fine glutinous-rice flour for coatings, confectionery, and thickening. Do not treat the shared toasted-rice words as equivalence or add either name as an alias of the other. |
| `ingredient-ref-roasted-red-rice-flour` | Retain unchanged and separate. | The active identity is specifically roasted red rice flour; it does not own the exact glutinous-rice candidate phrase. |
| `ingredient-ref-mochiko-glutinous-rice-flour` and `ingredient-ref-shiratamako-glutinous-rice-flour` | Retain unchanged and separate. | These are separately named glutinous-rice flour products. The reviewed sources do not establish that either name is a toasted-glutinous-rice-flour alias or form. |
| Québec French | No new French display or alias. | OQLF provides the base terms `farine de riz` and `riz gluant`/`riz glutineux`, but not the combined toasted product. Do not construct a display by mechanically adding `grillée` or `torréfiée`. |
| Forms, measures, conversions, yields, substitutions, recipe links | Add none. | No validated same-ingredient form relationship, exact-form household measurement, conversion, yield, substitution ratio, or bundled recipe link is established. |

## Product and naming boundary

Anrui Biotech’s current B2B page labels a food-grade sourcing item **Toasted Glutinous Rice Flour**. It describes glutinous rice being soaked, toasted or roasted, cooled, milled, and sifted, and distinguishes the item from its table’s **Glutinous Rice Flour (Sweet Rice Flour)** comparator [S01]. This supports an English candidate phrase and a potentially distinct processed product. The page is a sourcing/catalog page, not an independent specification or Canadian/Québec product label; its described process and properties are not generalized to every product.

San Vicente’s prepared-food page describes its espasol as made with and coated in “toasted glutinous rice flour” [S02]. That independently shows food use of the phrase, but the page sells a prepared confection, not a standalone dry-flour package or bilingual ingredient product. JETRO’s Japanese-rice-flour custard recipe calls for **toasted Japanese rice flour** and instructs the cook to toast rice flour separately [S03]. It uses no glutinous-rice qualifier and demonstrates a recipe-prepared toasted flour, not a source-defined standalone product equivalent to S01.

For Québec naming, OQLF defines `farine de riz` as a fine powder of milled rice grains and lists the preferred French term for generic rice flour [S04]. A separate OQLF record gives `riz glutineux`, `riz gluant`, and `riz doux` as preferred terms for the rice variety and English `glutinous rice`/`sweet rice` [S05]. Neither record establishes a Québec French compound for toasted glutinous rice flour. The active base display `farine de riz gluant` remains in place; it is not evidence for a toasted extension.

Do not use `khao khua` or `poudre de riz rôti` for this candidate. The integrated toasted-rice-powder review treats that as a separate seasoning, distinct from rice flour. Also keep this candidate separate from plain `farine de riz gluant`, roasted red rice flour, and the source-named Mochiko and Shiratamako products. No generic `toasted rice flour`, `toasted sweet rice flour`, or French alias is recommended from the evidence in this packet.

## Ownership and picker audit

Read-only snapshot: **1,369 active references**, **100 forms**, **64 legacy candidates**, and **1,699 ledger records**. Exact normalized phrase checks found no active reference, form, legacy candidate, ledger candidate/record ID, or proposed ID for `toasted glutinous rice flour`, `toasted sweet rice flour`, `farine de riz gluant grillée`, or `farine de riz gluant torréfiée`. The A7 archive contains general glutinous-rice flour work and a separate toasted-rice-powder identity, but no prior dedicated review of toasted glutinous rice flour. The active generic glutinous-rice-flour ledger decision explicitly left “cooked” and “roasted” distinctions outside that row for separate review; R49 addresses this deferred boundary without changing the ledger.

| Query | Current picker result | Ownership interpretation |
|---|---|---|
| `toasted glutinous rice flour`; `toasted sweet rice flour` | No result | Candidate phrases are currently unallocated. |
| `farine de riz gluant grillée`; `farine de riz gluant torréfiée` | No result | These are audit probes only, not proposed French terms. |
| `toasted rice`; `toasted rice powder`; `khao khua`; `poudre de riz rôti` | `ingredient-ref-toasted-rice-powder` | The qualified toasted-powder terms belong to the active seasoning row. |
| `glutinous rice flour`; `farine de riz gluant` | Three rows: generic glutinous rice flour, Mochiko glutinous rice flour, and Shiratamako glutinous rice flour | Current complete-phrase search includes the broad product and both branded/specific products. |
| `sweet rice flour` | `ingredient-ref-glutinous-rice-flour` | Existing alias owner; do not redirect it to a toasted candidate. |
| `rice flour`; `farine de riz` | Seven rows, including generic/white/brown rice flours, glutinous rice flour and its two named products, and roasted red rice flour | Broad phrase search; no product equivalence implied. |
| `riz gluant` | Four rows: glutinous rice grain, generic glutinous rice flour, Mochiko, and Shiratamako | Current picker distinguishes grain and flour identities but includes the named flour products. |

These results follow the current phrase-first, substring-fallback behavior in `IngredientSearch.kt`; they are static search projections, not live UI results. No active form label or match term owns the candidate, and there is no form attached to the generic glutinous-rice-flour row. If a future source-backed reference uses the English name, it would add a distinct qualified result to `glutinous rice flour` (three rows to four) and `rice flour` (seven to eight); `toasted glutinous` would newly return it. The query `toasted rice` would continue to return only toasted rice powder because those two words are not consecutive in the candidate name. A broad `toasted` query would gain one additional result. These are projections for the English candidate label only; the French result set cannot be projected until a Québec French name is sourced.

## Bundled recipe audit

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned. The complete serialized JSON and ingredient rows were normalized with the same lowercase/NFKD/accent-fold/punctuation-to-space behavior used by the picker. Candidate and boundary terms checked included `toasted glutinous rice flour`, `toasted sweet rice flour`, `farine de riz gluant grillée`, `farine de riz gluant torréfiée`, `glutinous rice flour`, `sweet rice flour`, `toasted rice powder`, `khao khua`, and `poudre de riz rôti`.

The scan found **zero matching recipe files and zero matching ingredient rows** for those terms. Direct `ingredientRefId` counts were also zero for the current generic glutinous-rice-flour, Mochiko, Shiratamako, toasted-rice-powder, and roasted-red-rice-flour rows. External food-use examples do not establish demand in the bundled corpus; no recipe link, relink, or edit is proposed.

## Measurement and substitution limits

- **Exact-form measurement:** The Anrui page lists 10 kg bags and a supplier-side 80-mesh checkpoint [S01]. These are bulk-packaging and product-specification details, not a household volume-to-mass observation, density, or universal particle-size standard. It does not supply a transferable cup or spoon measure. Do not populate density or unit mappings.
- **Adjacent recipe amount:** JETRO’s recipe uses 20 g of toasted Japanese rice flour in one custard and instructs the cook to toast rice flour as a preparation step [S03]. It does not specify glutinous rice, a packaged product, or a mass-volume relationship; do not transfer the amount to this candidate.
- **Substitution:** S01 gives functional marketing comparisons, not a validated ingredient-for-ingredient ratio or scoped RecipeBook dish rule. S02 describes a finished espasol, not a tested replacement rule. Do not substitute this candidate for plain glutinous rice flour, toasted rice powder, Mochiko, Shiratamako, tapioca starch, or another flour by global rule. Add no global or contextual rule.
- **Ledger limit:** The active generic glutinous-rice-flour ledger record remains `not_yet_researched` for measurement and substitution research. Its measurements or recipe-specific comparisons, if later found, cannot be transferred to a toasted product. No R49 ledger state or value is proposed.

## Source register

Sources were checked on 2026-10-13. Limits below apply to this candidate and do not define a universal toasted-flour standard.

| ID | Source and locator | Supports | Limits |
|---|---|---|---|
| **WP02-A7-TOASTED-GLUTINOUS-RICE-FLOUR-20261013-R49-S01** | Anrui Biotech, [Toasted Glutinous Rice Flour](https://anruibio.org/products/toasted-glutinous-rice-flour), product heading and description; “How is it made?” process table; technical sourcing notes and product comparison. Page reports last update 2026-07-18. | Exact English candidate name; supplier describes a food-grade item made from glutinous rice by soaking, toasting/roasting, cooling, milling, and sifting, and distinguishes it from its plain glutinous-rice-flour comparator. | B2B sourcing/catalog page, not a Québec or Canadian retail label, terminology source, or independent product standard. It requests batch COA review; do not generalize its process/specification or use 10 kg, mesh, or marketing data as recipe values. |
| **WP02-A7-TOASTED-GLUTINOUS-RICE-FLOUR-20261013-R49-S02** | San Vicente’s Homemade Kakanin, [Espasol](https://sanvicentekakanin.com/index.php/product/espasol/), product description, accessed 2026-10-13. | Uses toasted glutinous rice flour as an ingredient and coating for a human-food confection. | Prepared-food seller page; no standalone flour SKU, French label, milling specification, household measure, or substitution ratio. |
| **WP02-A7-TOASTED-GLUTINOUS-RICE-FLOUR-20261013-R49-S03** | Japan External Trade Organization (JETRO), [Japanese Rice Flour recipes](https://japan-food.jetro.go.jp/riceflour/en/recipes/index.html), “Toasted Grain Custard,” ingredients and method. | Calls for 20 g toasted Japanese rice flour and instructs the cook to toast rice flour separately. Shows that toasted flour wording can describe a recipe-prepared ingredient. | The recipe does not identify glutinous rice, a packaged toasted flour, or a transferable mass-volume measure. Its 20 g is not copied to the candidate. |
| **WP02-A7-TOASTED-GLUTINOUS-RICE-FLOUR-20261013-R49-S04** | Office québécois de la langue française, [farine de riz (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), preferred term, definition and note; last updated 2025. | Defines generic `farine de riz` as fine powder from milled rice grains and identifies the OQLF-preferred base term. | The entry covers generic flour from white or brown rice; it does not name glutinous or toasted flour. |
| **WP02-A7-TOASTED-GLUTINOUS-RICE-FLOUR-20261013-R49-S05** | Office québécois de la langue française, [riz glutineux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux), preferred terms and English terms; last updated 1997. | Lists Québec French `riz glutineux`, `riz gluant`, and `riz doux`, with English `sweet rice` and `glutinous rice`. | Describes the rice variety, not a flour or a toasted product; does not validate a compound display such as `farine de riz gluant torréfiée`. |

## Next action

Keep the A7 checklist open. Revisit only when a current Canadian/Québec producer, retailer, or authoritative Québec terminology source identifies the standalone product and supplies an exact French display distinguishable from plain glutinous rice flour, toasted rice powder, and recipe-prepared toasted flour. Until then, keep the phrase unassigned and add no catalog, ledger, form, measurement, recipe, conversion, yield, or substitution data.
