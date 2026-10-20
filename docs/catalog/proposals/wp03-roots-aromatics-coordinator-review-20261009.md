# WP03 Section J roots and aromatics coordinator review

- **Review date:** 2026-10-09
- **Status:** proposal only; no catalog, ledger, recipe, checklist, roadmap, code, or test files changed
- **Scope:** unique Section J gaps after the existing root/allium packets and root-owned integrations; recommend a bounded set of identity-only additions and record the remaining collisions and research questions.

## Snapshot and review method

The delegated baseline was 512 references, 32 forms, and 692 ledger records. The shared tree had advanced by the time of this review; its actual snapshot is 524 references, 32 forms, 704 ledger records, 97 legacy candidates, and 114 recipes with 1,123 ingredient rows. The hashes below were recalculated immediately before this proposal was written.

| File / corpus | Count | SHA-256 |
| --- | ---: | --- |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 524 refs | `c12bda3457be0432e689128dd327fd5363f6ace930825d1d08460ab313acdf18` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 32 forms | `02f31266c627ee63419e94755e7ff6b60ab226b94db16b0fa3e1609fcbe41cca` |
| `docs/catalog/research-ledger.v1.json` | 704 records | `121f86a6063e8d3b37553b10ab09c727917ec03f6ad03f938d7c4e19ce97af66` |
| `docs/catalog/legacy-import-identities.v1.json` | 97 candidates | `0d1eb71884ad814ceb01beb202d668d3eafddc6e9b7efc6d9f9f3f669540dc80` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe corpus, manifest order | 1,123 ingredient rows | `6bdaed1140e7910a74af717507cccb960df562e296f9f2ee7a238d1f03671068` |

Recipe corpus fingerprint is SHA-256 over each manifest-listed relative recipe path, a NUL byte, that file's SHA-256 hex digest, and a newline, concatenated in manifest order.

I reviewed Section J in `docs/RecipeBook-global-ingredient-catalog-plan.txt`, the catalog workflow, the existing plant root/allium packets, and the relevant WP06 cassava, papa seca, arracacha, and Andean-tuber proposals. I scanned the complete live reference and form arrays, all legacy candidates, and every ingredient row in the 114 manifest recipes. Exact normalized-name ownership was checked across live references, form labels/match terms, and legacy names/aliases. No catalog data was changed.

## Bounded identity-only proposal

The names below are absent as exact active identities. They have direct Québec terminology or Canadian food-product support. Treat them as *candidate ingredient identities*, not preparation forms, aliases of generic onion/potato, measures, or substitutions. Proposed names and candidate IDs are suggestions for coordinator review, not approved catalog changes.

| Candidate ID | Proposed EN / fr-CA display | Evidence-backed boundary and limits |
| --- | --- | --- |
| `ingredient-ref-red-onion` | red onion / oignon rouge | OQLF gives the bilingual name and *Allium cepa*. Keep a red onion line distinct from generic onion when the recipe names it. No size, preparation, or conversion data follows from the term. |
| `ingredient-ref-white-onion` | white onion / oignon blanc | OQLF gives the bilingual name and *Allium cepa*; its note describes white onions sold as bulbs and distinguishes them from the generic onion term. Do not infer a cooking method or numeric property. |
| `ingredient-ref-garlic-scape` | garlic scape / fleur d’ail | Ail Québec defines *fleur d’ail* as the edible garlic stem with its flower bud; AAFC describes edible scapes on hardneck varieties. This is an edible plant part, not an alias for garlic bulb, green garlic, or Chinese chives. The qualitative cooking suggestions on the grower page do not establish a global substitution rule. |
| `ingredient-ref-horseradish` | horseradish / raifort | OQLF identifies *Armoracia rusticana* and its edible root, and explicitly notes frequent confusion with radish. Keep it separate from `radish / radis` and from prepared horseradish sauce. |
| `ingredient-ref-greater-galangal` | greater galangal / grand galanga | OQLF identifies *Alpinia galanga* and a culinary rhizome. Do not activate ginger-like terms such as `Siamese ginger`, `Thai ginger`, or `Laos ginger` as aliases: they collide semantically with the active ginger identity. Do not merge with false/lesser galangal. |
| `ingredient-ref-lemongrass` | lemongrass / verveine des Indes | OQLF identifies *Cymbopogon citratus* and names *verveine des Indes*; Health Canada supports lemongrass as a food-flavouring ingredient. Keep the species boundary explicit. Do **not** add bare `citronnelle` automatically: another OQLF entry uses that term for lemon balm. Independent Québec culinary review should confirm the proposed French display. |
| `ingredient-ref-taro` | taro / taro | OQLF supports *Colocasia esculenta*, French `taro`, `colocase`, `colocasie`, and English `dasheen`. Keep taro separate from malanga. Do not add `eddoe` until its product/type boundary is resolved. |
| `ingredient-ref-malanga` | malanga / malanga | OQLF identifies *Xanthosoma sagittifolium* and lists `yautia` and Caribbean-cabbage names. Keep separate from taro and true yam. Exclude broad `elephant ear`, `arrowleaf`, and `macabo` matches pending species-specific review. |
| `ingredient-ref-yam` | yam / igname | OQLF identifies the edible tubers of *Dioscorea* and warns that North American `yam` is often misapplied to sweet potato. Keep the true-yam identity separate from active `sweet potato / patate douce`; do not use `ube` or `yam bean` as aliases. |
| `ingredient-ref-white-salsify` | white salsify / salsifis blanc | OQLF identifies *Tragopogon porrifolius* as true white salsify. Do not assign unqualified `salsify` or `salsifis` automatically: those market names often refer to black salsify. |
| `ingredient-ref-black-salsify` | black salsify / scorsonère | OQLF identifies *Scorzonera hispanica* and lists `scorsonère`, `salsifis noir`, and English `black salsify`. Keep it distinct from white salsify; do not use generic `salsify` as its alias. |

For the onion and tuber names, use only the directly supported terms above as initial display/alias candidates. These sources establish names and product identity boundaries; none supports default density, household measures, state forms, yields, or interchangeability. The current form file contains no forms for the reviewed Section J reference rows. Ground ginger and ground turmeric remain separate active references in `BAKING_AND_SPICE`; this proposal does not reclassify them as forms.

## Live collisions and recipe links

- **Generic onion:** `ingredient-ref-onion` currently has `yellow onion` in both its English and French alias arrays, and `gros oignon` in French. The English phrase in the French alias array is a cross-language cleanup item. The ledger still marks generic onion identity `unreviewed`; its measurement state is `blocked_pending_evidence` and substitution research is `not_yet_researched`.
- **Recipe onion lines:** the 1,123-row scan found `75 g red onion, minced` in recipe 018 linked to generic onion; yellow onion lines in 027, 037, 066, and 078; `1 Spanish onion` in 096; and `sweet onion` in 101, all linked to generic onion. Keep these source lines visible for later reconciliation. Do not silently rewrite recipe links as part of this proposal. The red onion line is a direct use case; Spanish and sweet onion remain open because this review did not find a Québec/product source sufficient to decide their catalog level or bilingual names.
- **Pearl / pickling onion:** OQLF defines *petit oignon* as an immature *Allium cepa* with a barely formed bulb and uses `pickling onion` in English. `Oignon à mariner` and `oignon perle` refer more specifically to small onions used for marinades; English `pearl onion` and `cocktail onion` are likewise context-specific. This is not the preserved `pickled onion` product. Because the source describes maturity and size rather than a separate species, leave the identity-versus-form decision open; do not add `pearl onion` as a broad alias to generic onion.
- **Green onions and shallot ambiguity:** the active green-onion row has `scallions` as an English alias; OQLF says Québec usage of `oignon vert` and `échalote` overlaps among immature *Allium cepa*, ciboule (*A. fistulosum*), and shallot. The legacy file still contains unreviewed candidates with IDs `ingredient-ref-chives` and `ingredient-ref-shallot`, although those IDs are already active references. Reconcile these stale legacy records; do not copy unqualified `spring onion` or `échalote` to an active row without context.
- **Russet potato:** the active generic potato row currently owns exact alias `russet potato`; recipe 078 uses `1 1/2 to 2 lb russet potatoes` linked to generic potato. Health Canada's CNF has a bilingual raw-product entry `Potato, Russet / Pomme de terre, Russet`, and CFIA describes Russet Burbank as one specific Russet cultivar. This supports a named candidate (`russet potato / pomme de terre Russet`) but not all potato cooking types or a Quebec-preferred variety class. If accepted as an identity, move the existing alias rather than duplicate it; otherwise mark the alias/source as unresolved. Do not infer a form, density, measurement, or recipe substitution from CNF portions.
- **Exact name check:** among the Section J candidate terms checked, the only exact normalized live owner not already represented as a generic base is `russet potato` on `ingredient-ref-potato`. The stale shallot/chive legacy duplicates are ID collisions, not proposed-name collisions. No candidate term is currently owned by a form.

## Remaining Section J work

- Resolve `yellow`, `sweet`, `Spanish`, `pearl/pickling`, and `spring` onion at the right identity/form level, with Québec terminology. OQLF's direct `green onion` entry describes immature onion and documents the local overlap; it does not justify a universal `spring onion` alias.
- Review garlic, ginger, turmeric, leek, green onion, and generic potato source identity states, and close their measurement/substitution research only with matching evidence. Avoid applying powdered/dried/paste data to fresh roots or bulbs.
- Research fingerroot with an authoritative food-product and Québec French source. The present pass did not find enough to propose a canonical bilingual row.
- Keep fresh wasabi root separate from prepared wasabi products until product scope is source-backed; OQLF's wasabi entry covers both plant and condiment.
- Resolve eddoe against taro cultivar/product evidence before adding it as an alias or identity. CFIA's crop list groups eddoe and taro under *Colocasia esculenta* but does not establish the culinary product boundary needed here.
- Continue potato cooking-type and sweet-potato-variety research. Russet is the only scanned line requiring an immediate alias owner decision; no general `baking potato` class is proposed.
- Keep arrowhead open: the terminology and botanical sources reviewed in prior work do not establish one unambiguous food species/product for automatic matching.
- Continue the WP06 regional tuber follow-up already documented in `wp06-andean-tubers-review-20261009.md` and the integrated cassava, arracacha, and papa seca packets. Do not repeat those rows in this batch.
- Independent Québec bilingual review remains pending for this proposed tranche and previously integrated WP03 plant packets.

## Evidence register

- OQLF, [oignon rouge](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296967/oignon-rouge): direct French/English name and *Allium cepa*.
- OQLF, [oignon blanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296970/oignon-blanc): direct name pair, taxon, and note about the marketed bulbs.
- OQLF, [petit oignon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870618/petit-oignon): immature bulb definition and contextual pearl/pickling terminology.
- Ail Québec, [la fleur d’ail](https://ail.quebec/la-fleur-dail/): edible garlic stem and bud; culinary context only, not substitution evidence.
- Agriculture and Agri-Food Canada, [Allium vegetables crop profile](https://publications.gc.ca/collections/collection_2023/aac-aafc/A118-10-34-2021-eng.pdf): scapes on hardneck garlic varieties.
- OQLF, [raifort](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095252/raifort) and [radis](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082624/radis): root identity and explicit confusion boundary.
- OQLF, [grand galanga](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502749/grand-galanga): *Alpinia galanga*, culinary rhizome, and potentially colliding ginger-like terms.
- OQLF, [verveine des Indes](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17045878/verveine-des-indes): *Cymbopogon citratus* and lemongrass terminology; OQLF's separate [citronnelle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19475105/citronnelle) entry identifies lemon balm, supporting the alias caution.
- Health Canada, [List of non-novel determinations](https://www.canada.ca/en/health-canada/services/food-nutrition/genetically-modified-foods-other-novel-foods/requesting-novelty-determination/list-non-novel-determinations.html): lemongrass as a known food ingredient at flavouring use levels.
- OQLF, [taro](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19466379/taro): *Colocasia esculenta*, French `taro/colocase/colocasie`, and English `dasheen`.
- OQLF, [malanga](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/42924/malanga): *Xanthosoma sagittifolium*, bilingual names, and distinction from neighboring products.
- CFIA, [Horticulture plant-health directive 94-26](https://inspection.canada.ca/en/plant-health/invasive-pests-and-plants/directives/horticulture/94-26?wbdisable=false): groups taro, arvi, dasheen, eddo, and kalo under *Colocasia esculenta*; does not resolve a separate eddoe food identity.
- OQLF, [igname](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082772/igname): *Dioscorea* food identity and warning against North American sweet-potato misuse of `yam`.
- OQLF, [salsifis](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296890/salsifis) and [scorsonère](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296886/scorsonere): distinct species, terms, and frequent market-name confusion.
- Health Canada CNF, [Potato, Russet, flesh and skin, raw](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=5284&lang=fre): bilingual named-product wording only.
- CFIA, [Russet Burbank](https://inspection.canada.ca/en/plant-health/potatoes/potato-varieties/russet-burbank): cultivar-specific potato page; does not define every potato sold as Russet.
- OQLF, [oignon vert](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083674/oignon-vert): immature onion and Québec overlap among `oignon vert`, `échalote`, ciboule, and shallot.
- OQLF, [wasabi](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26533049/wasabi): plant and condiment terminology; insufficient to merge fresh root and prepared products.

The report records identity and naming evidence only. It proposes no forms, measurements, density values, yields, unit mappings, or substitution rules.
