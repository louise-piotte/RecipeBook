# WP02 Section A7 R403: roasted-corn semolina boundary review

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This file does not change shared catalog JSON, the research ledger, plan, roadmap, recipe package, generated catalog, or tests.
- **Open checklist:** WP02 Section A7 continues review of other grain meals and milling identities at [plan line 2004](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004).
- **Candidate:** the separately listed French-mill product `semoule de maïs torréfié`, considered as a possible roasted-corn-semolina identity.
- **Adjacent decisions:** This does not reopen R394 spring-wheat semolina, R397 barley semolina, or R400 buckwheat semolina. It excludes foxtail millet rava, already held unallocated in WP03 R34.
- **Proposal-local source IDs:** `WP02-A7-ROASTED-CORN-SEMOLINA-R403-20261017-S01` through `S06`. These IDs are local to this proposal and are not ledger entries.

## Recommendation

**Hold the candidate outside active references pending a Québec-facing product-name review.** Current primary sources from two French mills separately name a roasted-corn semolina product, and the Office québécois de la langue française (OQLF) validates the base Québec term `semoule de maïs` for ground dried corn [S01, S03, S04]. This is a worthwhile product-boundary question. It is not yet enough to claim that a specific bilingual roasted-semolina display is established for Québec.

The French wording **`semoule de maïs torréfié`** is source-attested by the mills and is a plausible descriptive phrase built from OQLF’s Québec term. The OQLF entry does not attest the roasted qualifier or this particular product. The Québec sources found for `farine de maïs torréfiée` concern corn flour, not semolina. The English phrase **`toasted corn semolina`** appears in an English manufacturer catalog as a coating on a bakery product, not as the paired English name for either mill’s standalone semolina SKU [S05]. Treat it as a search lead, not as a validated English display. No current Canadian or Québec bilingual label pairing the candidate English and French names was found.

Therefore, `semoule de maïs torréfié` can be recorded as the source wording for this review, but should not yet be committed as a Québec-validated catalog display. Do not allocate a reference or candidate ID, add aliases, or broaden `cornmeal` or `corn grits`. Reopen if a Québec product label or a terminology review confirms a bilingual display and the intended product scope.

## Product boundary

Moulin Taron lists **Semoule de maïs torréfié** as a separate 1 kg item from its **Farine de maïs torréfié (Gaudes)** and describes the semolina for making polenta and dusting breads or pizza [S01, S02]. Vallée Torréfaction independently lists `Semoule de Maïs Torréfié` in its current range of toasted cereal products [S03]. These sources support a real named milling-product candidate and a distinction from the mills’ flour products. They do not state a sieve range, the corn kernel preparation, a repeatable roasting profile, or whether the same process or grade applies across producers.

| Neighbor | Boundary for this review |
| --- | --- |
| `cornmeal / semoule de maïs` | OQLF’s general Québec term for dried, ground corn; its note allows fine, medium, or coarse grades. The source-named roasted product adds a process qualifier, but no equivalence or alias is inferred. |
| `corn grits / semoule de maïs de type grits` | A separate active identity with a grits qualifier. Taron and Vallée give no granulation limit that would place their semolina in this class. |
| `hominy grits / gruau de maïs` | Keep separate; the semolina sources do not establish a nixtamalized or other hominy process. |
| `roasted corn flour / farine de maïs torréfiée` | Taron lists flour and semolina as separate products. Grain-source and roast wording do not erase the milling-product distinction. Do not infer a shared process specification. |
| `polenta` | Taron describes polenta as a use for its dry semolina. OQLF defines polenta as the prepared dish, so do not add `polenta` as an ingredient alias. |
| `gaudes / farine de gaude` | Keep the regional roasted-corn flour and its prepared porridge separate. R59 held the flour-name/equivalence question; it did not adjudicate a standalone roasted-semolina identity. |
| Baddaz and other corn couscous products | Keep separately named regional products and prepared dishes distinct; a corn-semolina ingredient in a couscous formula is not this dry mill product. |

The Association Les Alwati provides useful regional context: it distinguishes traditional polenta semolina from roasted-corn gaudes flour and notes Taron’s later roasted-semolina product as a new polenta. This is contextual corroboration, not a Québec terminology ruling or technical milling specification [S06].

## Current catalog, ledger, and archive audit

The static audit used the live split seed package, its manifest, and the current catalog files. SHA-256 values identify the exact snapshot reviewed.

| Store | Snapshot | Candidate ownership |
| --- | ---: | --- |
| Active ingredient references | 1,710 rows; SHA-256 `3d621ad22ad38453a709f7603e83f01c87c2f0d1f2e48ed9b7e78abada56e827` | No exact owner for `roasted corn semolina`, `toasted corn semolina`, `semoule de maïs torréfié`, `semoule de maïs torréfiée`, or a proposed roasted-corn-semolina ID. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No matching label or search term. The adjacent cornmeal, corn-grits, hominy-grits, and roasted-corn-flour references have no attached forms. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact candidate or alias for the reviewed English/French phrases or an equivalent candidate ID. |
| Research ledger | 2,070 records / 9,359 source entries; SHA-256 `35013eaf441ae3c257733da1045ad3acef19c5191fd1921e076a625184f60668` | No dedicated roasted-corn-semolina record or candidate key. Existing cornmeal, corn-grits, hominy-grits, and roasted-corn-flour records cover their named identities only. |
| Recipe manifest | 114 recipe files; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | Every listed file and ingredient row was scanned; results below. |

Relevant active rows are:

- `ingredient-ref-cornmeal` — `cornmeal / semoule de maïs`, EN alias `corn meal`, category `FLOUR_AND_STARCH`; no forms, density, or unit mappings.
- `ingredient-ref-corn-grits` — `corn grits / semoule de maïs de type grits`, EN aliases `degermed corn grits` and `maize grits`, category `GRAIN_AND_CEREAL`; no forms, density, or unit mappings.
- `ingredient-ref-roasted-corn-flour` — `roasted corn flour / farine de maïs torréfiée`, no aliases, category `FLOUR_AND_STARCH`; no forms, density, or unit mappings.
- `ingredient-ref-hominy-grits` — `hominy grits / gruau de maïs`, category `GRAIN_AND_CEREAL`; no forms, density, or unit mappings.

The exact phrase and ID scan covered active displays and aliases, form labels and match terms, legacy candidate names and aliases, ledger record IDs and serialized decisions, the plan, and the proposal/batch archive. No prior focused A7 decision assigns or holds a roasted-corn-semolina identity. R59 and its integration README mention that Taron separately sells semolina, but decide only whether `gaude`/roasted-corn-flour names can attach to the active roasted-corn-flour row. R59 explicitly keeps flour, semolina, and porridge distinct; it does not decide the semolina’s own catalog status. Other nearby decisions cover Baddaz, ordinary corn grits, hominy grits, or generic polenta and do not decide this mill product. The R403 source-ID prefix is unused.

## Phrase-first picker projection

This static projection follows `IngredientSearch.kt`: normalize case, accents, and punctuation; prefer complete word phrases; then fall back to partial matches. Forms are included with their owning reference.

| Query | Current result |
| --- | --- |
| `roasted corn semolina` | None |
| `toasted corn semolina` | None |
| `semoule de maïs torréfié` | None |
| `semoule de maïs torréfiée` | None |
| `corn semolina` | None |
| `semoule de maïs` | `ingredient-ref-corn-grits` and `ingredient-ref-cornmeal` |
| `roasted corn` | `ingredient-ref-roasted-corn-flour` |
| `farine de maïs torréfiée` | `ingredient-ref-roasted-corn-flour` |
| `polenta` | None |

No picker change is recommended while the candidate is held. If a future reviewer approves a new row with the working English phrase `roasted corn semolina` and French phrase `semoule de maïs torréfié`, the exact phrases would resolve to that row; the broad query `semoule de maïs` would return three rows (cornmeal, corn grits, and the new row), and `roasted corn` would return roasted corn flour plus the new row. `toasted corn semolina` would remain unmatched unless independently approved as an alias; the Panamar wording is not enough to equate its bakery coating with the Taron/Vallée product. `polenta` should remain unassigned as an ingredient query.

## Bundled recipe demand

All **114 manifest-listed recipe files** and all **1,123 ingredient rows** were scanned. The scan searched full serialized recipe JSON and each ingredient row, including original text, ingredient name, preparation, notes, and reference ID. Terms included `roasted corn semolina`, `toasted corn semolina`, `corn semolina`, both accented/unaccented forms of `semoule de maïs torréfié`, `semoule de maïs`, `farine de maïs torréfiée`, roasted-corn-flour and cornmeal terms, corn grits, hominy grits, `polenta`, `gaude(s)`, and the neighboring active reference IDs.

The scan found **0 matching recipe files, 0 matching ingredient rows, and 0 links** to the neighboring cornmeal, corn-grits, hominy-grits, or roasted-corn-flour references. The bundled corpus supplies no demand, recipe context, or recipe-line amount for this candidate.

## Measurements and substitutions

- Taron’s listed 1 kg retail bag is a package size, not a serving amount or household measure [S01]. The product pages give no cup-to-mass observation, density, particle-size standard, cooking yield, or quantified polenta recipe.
- Taron’s use suggestions for polenta and dusting, and Panamar’s use of corn semolina as a bakery decoration, give no amount-preserving substitution rule [S02, S05]. They do not establish a replacement for cornmeal, corn grits, hominy grits, or roasted corn flour.
- The candidate has no ledger record carrying measurement or substitution evidence. Existing values or research states for neighboring identities must not be transferred.
- Add no forms, density, unit mappings, measures, conversions, yields, recipe links, global substitutions, or contextual substitutions. This is a bounded no-data decision for this candidate, not a finding that no such evidence could ever exist.

## Source register

Sources were checked on 2026-10-17. Proposal-local IDs are not shared-ledger records.

| Source ID | Source and locator | Supports | Limits |
| --- | --- | --- | --- |
| **S01** | Moulin Taron, [Nos produits](https://www.gaudes-de-chaussin.com/produits.htm), current product list. | Separately lists `Semoule de maïs torréfié` and `Farine de maïs torréfié (Gaudes)`; shows a 1 kg semolina bag and identifies semolina for polenta. | French producer page, not a Canadian or Québec label. It gives no semolina sieve range, kernel preparation, roast profile, or equivalent English product name. The 1 kg package is not a recipe measure. |
| **S02** | Moulin Taron, [home page](https://www.gaudes-de-chaussin.com/), current product descriptions. | Names the semolina separately from flour and lists polenta, bread, and pizza-dusting uses. The mill describes itself as specializing in wood-fire roasting and stone milling. | The process description is general mill information and does not specify how this semolina SKU is roasted, milled, or graded. Use statements are not measured recipes. |
| **S03** | Vallée Torréfaction, [Nos produits](https://vallee-torrefaction.com/nos-produits), current range. | Independently lists `Semoule de Maïs Torréfié` within its roasted-cereal product range. | French supplier page with no paired English name, Québec market display, semolina specification, package quantity, or cooking measure. |
| **S04** | OQLF, [semoule de maïs (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17031243/semoule-de-mais), updated 2019. | Establishes the preferred Québec French base term `semoule de maïs` for ground dried corn, pairs it with English `corn meal`, and notes fine, medium, or coarse grades. | It does not name roasted corn semolina, endorse the full phrase `semoule de maïs torréfié`, or say where the candidate sits within those grades. |
| **S05** | Panamar Bakery, [English 2026 export catalog](https://panamarbakery.com/public/Attachment/2026/5/177996969505catalogoexportpanamar2026.pdf), p. 42, product 130957; Spanish counterpart wording on the same page. | Uses English `toasted corn semolina` and Spanish `sémola de maíz tostado` for decoration on one ready-to-bake pastry. Provides a manufacturer-paired language example for an ingredient phrase. | This is a bakery-product decoration, not a standalone semolina SKU, Québec label, or proven match for Taron/Vallée’s mill product. No amount of the semolina is specified. |
| **S06** | Les Alwati, [Les gaudes](https://alwati.com/les-traditions/les-gaudes/), regional food-history page. | Distinguishes traditional polenta semolina from roasted-corn gaudes flour and describes Taron’s roasted-semolina product as a later polenta variant. | Contextual regional source, not a Québec terminology authority or milling specification; use it to avoid merging flour, semolina, and prepared polenta, not to assign a Québec display. |

## Disposition

Keep the roasted-corn-semolina candidate unallocated and make no shared-data changes. Treat `semoule de maïs torréfié` as a source-attested French name, not yet a Québec-validated catalog display. Do not add `toasted corn semolina`, `roasted corn semolina`, `polenta`, `gaude(s)`, `cornmeal`, or grits phrases as aliases. No tests, build, emulator, or deployment checks were run; this is a documentation-only proposal.
