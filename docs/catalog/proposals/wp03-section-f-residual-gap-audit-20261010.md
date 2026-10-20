# WP03 Section F residual grain and cereal gap audit

## Packet record

- **Status:** proposal only; no shared catalog, recipe, ledger, plan, or roadmap file changed.
- **Audit date:** 2026-10-10.
- **Scope:** reconcile the current Section F checklist against the live split seed, forms, 114 bundled recipes, legacy candidates, existing research, and ledger; identify the next safe grain/cereal change.
- **Recommendation:** add one milling-class identity, `white rice / riz blanchi`, with dry and cooked forms. The cooked form resolves one explicit unlinked recipe line. Keep measurements and substitutions inactive.

## Current-state audit

The current bundled package has 751 ingredient references, 69 references in `GRAIN_AND_CEREAL`, 34 ingredient forms, 114 recipes, and 1,123 ingredient lines. The category count includes pasta/noodle entries and other Section G or A7 overlaps; it is not a Section F checklist count. The legacy file has 82 candidates, and the research ledger has 956 records and 1,932 source entries.

There is no active `ingredient-ref-white-rice`, no white-rice form, and no matching white-rice legacy candidate or ledger record. The generic `ingredient-ref-rice` already has dry and cooked forms. Brown, black, and red rice; named rice varieties; glutinous rice; parboiled rice; grain-length classes; broken rice; wild rice; puffed rice; rice cereal; and other named Section F products are already separate live identities. Do not recreate or rename them.

### Recipe demand

The exact ingredient-line scan found one unlinked white-rice request:

| Recipe | Current line | Current fields | Proposed link |
| --- | --- | --- | --- |
| 066, Korean Soy-Marinated Jammy Eggs (`e0a437cb-da80-4fd5-954d-87caf3b299e7`) | `Cooked white rice, for serving` | optional; quantity `1`; unit `for serving`; no `ingredientRefId` or form | `ingredient-ref-white-rice` + `ingredient-form-white-rice-cooked`; preserve source text, quantity, unit, and optional flag |

The current source page’s recipe ingredient list retains this exact line and its instructions say to serve the eggs over hot white rice. No amount or rice length/cultivar is supplied. The same corpus has three other explicit cooked-rice lines in recipes 086, 090, and 093; these already use generic rice’s cooked form and remain unchanged because they do not specify white rice. Recipe 040’s crispy-rice cereal line is a separate integrated product.

The 2026-10-07 rice/quinoa state-form checkpoint in `RecipeBook-global-ingredient-catalog-plan.txt` deliberately left this line unlinked to preserve its white-rice qualifier. This packet revisits that one hold using the milling-class definition and the still-current recipe source; it does not reopen the completed generic rice state forms.

No ingredient line requests milled rice, `riz blanchi`, brown rice, generic sushi rice, farro, rye berries, pot barley, polenta, generic grits, pearled hominy, pozole corn, or dried sweet corn. Rolled oats and quick oats are already active and have recipe uses as dry products; no line needs a cooked oat form. The remaining grain and cereal candidate terms have no direct recipe-line hits.

### Checklist reconciliation

Several unchecked Section F summaries in the plan are stale snapshots, not outstanding identities. The following are already integrated in the live reference file: jasmine, basmati, Arborio, Carnaroli, Bomba, Calrose, black and red rice, parboiled rice, broken rice, wild rice, generic rice/quinoa state forms, oat groats, steel-cut/rolled/quick/instant oats, oat-bran dry/cooked forms, hulled and pearl barley, bulgur, freekeh, wheat berries, emmer, cracked wheat, triticale, teff, millet identities, fonio identities, amaranth, hominy corn and hominy grits, popcorn, corn flakes, crispy rice cereal, puffed rice, and flattened rice (poha). Their completed references and corresponding batch notes are the live source of truth.

The remaining named candidates below already have documented holds and should not be folded into this proposal:

| Open term or question | Current evidence state | Disposition in this audit |
| --- | --- | --- |
| Generic sushi rice | Existing ledger candidate `ingredient-ref-sushi-rice`, `needs_clarification`; spans dry market products and prepared/seasoned rice | Keep unresolved; no recipe line asks for it. |
| Unqualified farro | Existing ledger candidate `ingredient-ref-farro`, `needs_clarification`; sources span einkorn, emmer, and spelt and do not settle grain/flour context | Keep unresolved; see `wp02-wp03-farro-grain-flour-boundary-20261010.md`. |
| Rye berries | The broad rye identity is active, but this product wording remains unassigned in the grain packet | Keep off `rye / seigle` aliases until exact whole-kernel product and French wording are established; no recipe demand. |
| Pot/Scotch barley | Existing `ingredient-ref-pot-barley` candidate, `needs_clarification`; process class is distinct but `orge mondé` is used ambiguously | Keep candidate-only; no recipe demand. |
| Generic polenta and grits | Existing packet distinguishes a prepared dish, dry cornmeal, hominy grits, and generic grits; no single dry identity is supported | Keep unresolved. Hominy grits is already integrated. |
| Pearled hominy and pozole corn | Existing ledger candidates, `needs_clarification`; human-food French scope and dry/canned product boundary remain unresolved | Keep unresolved; see `hominy-boundary-review.md`. |
| Dried sweet corn and non-rice puffed grains | No stable remaining product identity or Québec label established in the reviewed packet | Defer; no recipe demand. |
| Bulgur grind classes, broader poha grades/synonyms, other regional cereal mixes | Product/grade boundaries or region-specific recipes still need scoped review | Do not add aliases or forms in this packet. |

## Proposed canonical rows

This is an identity-plus-state proposal, not a type-by-length or type-by-variety matrix. White rice is the milled grain class; it does not assert a cultivar, grain length, parboiling process, enrichment, or cooking method.

| Stable ID | English display | fr-CA display | Aliases | Category / data |
| --- | --- | --- | --- | --- |
| `ingredient-ref-white-rice` | `white rice` | `riz blanchi` | EN: `milled rice`; FR: `riz blanc` | `GRAIN_AND_CEREAL`; `defaultDensity: null`; `unitMappings: []` |
| `ingredient-form-white-rice-dry` | `dry white rice` | `riz blanchi, sec` | none | Parent `ingredient-ref-white-rice`; `formCode: dry`; `prepState: dry`; `densityGPerMl: null`; no match terms |
| `ingredient-form-white-rice-cooked` | `cooked white rice` | `riz blanchi, cuit` | none | Parent `ingredient-ref-white-rice`; `formCode: cooked`; `prepState: cooked`; `densityGPerMl: null`; no match terms |

The OQLF’s preferred food-processing term is `riz blanchi`; Canadian CNF labels and the recipe’s French instructions use `riz blanc`, so retain that as a French alias. Codex directly equates “milled rice” and “white rice”; that supports the one English alias. Keep all other aliases empty.

If accepted, attach `ingredient-form-white-rice-cooked` to recipe 066’s existing line. Do not relink generic cooked-rice lines, add a quantity, or rewrite either language’s recipe prose. Add dry and cooked forms only to this broad white-rice milling identity; do not propagate them to black/red/brown rice, long/medium/short grain classes, varieties, glutinous rice, or parboiled rice.

## Identity and product boundaries

- Codex defines rice kernels as *Oryza sativa* L.; husked (brown/cargo) rice retains the bran after only the husk is removed, while milled (white) rice has all or part of the bran and germ removed. Grain-length classes are a separate axis. This supports a white-rice identity parallel to the already integrated brown-rice identity.
- Keep white rice separate from brown rice, `riz cargo`, black rice, red rice, wild rice (*Zizania*), and rice flour. The English and French broad queries overlap the existing white-rice-flour row by phrase containment; this is a parent/product search overlap, not an exact catalog-key collision.
- Keep `glutinous rice / riz gluant` distinct. Codex excludes glutinous rice from CXS 198 and describes it as special varieties with a separate starch/texture property; visual whiteness does not make it an alias for ordinary milled rice.
- Keep `parboiled rice / riz étuvé` distinct. Codex defines parboiling as a heat-and-drying process that may apply to either husked or milled rice. Do not create `white parboiled rice` as an alias or a compound reference.
- Do not alias `white long-grain rice`, `white medium-grain rice`, or `white short-grain rice` to either white rice or the length-class rows. These combine independent attributes and the live plan rejects a grain-length × milling × cooked-state matrix.
- Do not activate `polished rice` / `riz poli`: the OQLF note distinguishes its polishing stage from the named `riz blanchi` product. Keep instant/pre-cooked rice, generic sushi rice, sticky-rice wording, and prepared seasoned rice outside these aliases.

## Measurement and substitution review

Keep the proposed reference and forms free of active measurements: no default density, form density, unit mapping, mass/volume conversion, or cooking yield. The 2015 CNF interim serving pages show why the historical portions cannot be generalized: at 100 mL they list 78.2 g for white regular long-grain rice, dry; 66.8 g for that long-grain rice cooked; 84.5 g for white short-grain rice, dry; and 86.6 g for that short-grain rice cooked. These are product/state-specific published portions, not a universal density or a paired dry-to-cooked yield. Their listed measure does not specify filling/packing method.

Health Canada now identifies a 2026 CNF data release and says that the searchable 2015 CNF remains online only as an interim measure. Do not copy the old portion values into the ledger or runtime catalog until the corresponding 2026 `Measure Weight Conversion` records and methods are reviewed. This audit did not verify the new downloadable records. Recipe 066 has no numeric rice quantity, so no measurement is needed to resolve its identity/form link.

No substitution rule is proposed. The cited identity and serving sources do not establish a culinary replacement relationship between white rice and brown, parboiled, glutinous, wild, or any other rice product. Leave substitution research `not_yet_researched`; do not infer a dry/cooked yield or a rice-to-rice ratio from the separate CNF profiles.

## Alias, form, and ID collision audit

The live 751-reference catalog and 34 forms were checked using the application’s accent-folding, ligature-folding, punctuation-folding, and complete-phrase behavior. None of the proposed exact names, aliases, form labels, or IDs has an existing exact key/ID collision.

| Query | Expected search behavior if integrated |
| --- | --- |
| `white rice`, `milled rice`, `riz blanchi` | Finds the new white-rice identity. `white rice` also finds existing `white rice flour` because that longer label contains the complete query phrase. |
| `riz blanc` | Finds the new white-rice identity and existing `farine de riz blanc`; this is an intentional grain/flour family overlap. |
| `white rice flour`, `farine de riz blanc` | Finds the existing flour identity as the more specific phrase; it does not select the grain form. |
| `cooked white rice`, `riz blanchi cuit` | Finds the new identity with its cooked form hint. |
| `brown rice`, `riz brun` | Finds the existing brown-rice identity and brown-rice flour, as the longer flour terms contain the complete query phrase. |
| `glutinous rice`, `riz gluant` | Finds the existing glutinous-rice identity and glutinous-rice flour, as the longer flour terms contain the complete query phrase. |
| `parboiled rice`, `riz étuvé` | Continues to find the existing parboiled-rice identity only. |
| `white long-grain rice` | Remains unmatched as a compound; do not synthesize a length × milling row or alias. |
| `polished rice`, `instant rice`, `sushi rice`, `sticky rice` | No new match is introduced; existing open/withheld boundaries remain. |

Proposed reference/form IDs are absent from the current seed. The normalized exact-key audit found no collision for `white rice`, `riz blanchi`, `milled rice`, `riz blanc`, `dry white rice`, `riz blanchi sec`, `cooked white rice`, or `riz blanchi cuit`. Phrase overlap is limited to the two noted white-rice-flour matches. This overlap should be covered in picker regression fixtures if this packet is integrated.

## Sources

New source IDs below use prefix `WP03-FWR-20261010`; all were accessed on 2026-10-10. Existing `WP03-S3` (dry food code 4471), `WP03-S3-COOKED-4523` (cooked food code 4523), and `WP03-S116` remain the reused ledger evidence for CNF 2015 rice labels and the brown/white milling distinction; keep the state-specific sources separate.

| Source ID | Source and locator | What it supports and what it does not |
| --- | --- | --- |
| `WP03-FWR-20261010-S01` | OQLF, [riz blanchi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432775/riz-blanchi), food processing; preferred term and English equivalent | Preferred Québec French `riz blanchi` / `white rice`; defines it as cargo rice abraded at the pericarp. The entry was last updated in 1982, so keep the newer federal bilingual `riz blanc` wording as a search alias and independent Québec review open. |
| `WP03-S116` (existing) | Codex Alimentarius, [Standard for Rice CXS 198-1995](https://www.fao.org/input/download/standards/61/CXS_198e.pdf), §§2.1.1.1–2.1.1.5 and Annex | Identifies rice as *Oryza sativa* L.; distinguishes husked/brown, milled/white, parboiled, and glutinous rice; length classes are independent. Reused from the existing ledger entry. |
| `WP03-FWR-20261010-S02` | Codex Alimentarius, [current standards list](https://www.fao.org/fao-who-codexalimentarius/codex-texts/list-standards/en/?ds=247), CXS 198-1995 row | Confirms the Standard for Rice remains listed with 2026 last-modified metadata; the list itself does not establish catalog names, aliases, density, or substitution. |
| `WP03-S3` (existing) | Health Canada, [CNF 2015 white long-grain rice, dry](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4471), food code 4471 | Exact historical bilingual dry-state label and source-specific portion. This 2015 CNF row is term/history evidence only, not active numeric data. |
| `WP03-S3-COOKED-4523` (existing) | Health Canada, [CNF 2015 white long-grain rice, cooked](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4523), food code 4523 | Exact historical bilingual cooked-state label and source-specific portion. This 2015 CNF row is term/history evidence only, not active numeric data. |
| `WP03-FWR-20261010-S03` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html) and [CNF 2026 dataset record](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) | Health Canada’s current page describes the 2026 CNF and says 2015 online remains interim. The Open Canada record shows the 2026 dataset was modified 2026-10-04. It establishes that the newer dataset exists; this audit did not inspect its rice conversion rows. |
| `WP03-FWR-20261010-S04` | The Kitchn, [Korean Soy-Marinated Jammy Eggs](https://www.thekitchn.com/korean-soy-marinated-eggs-recipe-23636937), recipe ingredients, serving instructions, and “Helpful Swaps” | Updated 2026-08-12; lists `Cooked white rice, for serving` and instructs serving over hot white rice. Its listed swaps concern soy sauce, eggs, and pepper, not rice. Supports recipe demand and cooked state only; amount is unstated and no rice substitute is supported. |
| `WP03-FWR-20261010-S05` | Health Canada, [CNF 2015 white short-grain rice, dry](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4476), food code 4476 | Interim 2015 page gives the exact bilingual dry label and 84.5 g/100 mL portion. Historical evidence only; not a density or active conversion. |
| `WP03-FWR-20261010-S06` | Health Canada, [CNF 2015 white short-grain rice, cooked](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4477), food code 4477 | Interim 2015 page gives the exact bilingual cooked label and 86.6 g/100 mL portion. Historical evidence only; not a density or active conversion. |

## Review disposition

Accept the white-rice identity and its two state forms for integration review; preserve recipe 066’s exact text and link it to the cooked form. Keep density, mappings, yields, conversions, and substitutions empty. Recheck the bilingual picker phrase overlap with white rice flour. Continue the other Section F holds from their existing packets rather than copying stale unchecked summaries into the active checklist.
