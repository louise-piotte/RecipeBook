# WP03 Section H — Lentil whole/split/dehulled form review

- **Reviewed:** 2026-10-12
- **Packet type:** proposal-only catalog review
- **Scope:** Existing active lentil identities only: generic lentils, green, French green, red, and black Beluga lentils. Review the whole/split/dehulled boundary, Québec French product wording, recipe demand, and the existing `lentilles corail` alias.
- **Write scope:** This proposal file only. No canonical JSON, research ledger, plan, roadmap, recipe, or code was changed.

## Recommendation

**Treat whole, split, and dehulled as product forms or preparation states, not separate lentil identities or aliases. Keep the individual lentil-form rows unresolved until a recipe or explicit product need identifies the state.** The evidence establishes that splitting and removing the seed coat are separable operations: a lentil may be whole or split, and either may retain or have its coat removed. Do not treat `split` as synonymous with `dehulled`, or make one universal split/dehulled alias for all lentil identities.

The Canadian evidence is clearest for red lentils. It supports whole red products, whole red lentils after dehulling, and split red lentils after dehulling. The official Canadian Grain Commission method separately sorts whole and split seeds, then classifies each as coated or dehulled. That supports forms under the existing red-lentil identity when an exact recipe or product requests one; it does not justify adding every state combination now. The sources do not establish equivalent product demand or French product labels for the active green, French green, or Beluga rows.

**Review the existing `lentilles corail` alias as too broad for the base red-lentil identity.** Québec sources use `lentilles rouges (corail)` as local product wording, but do not say whether those products are whole, split, or dehulled. Canadian processing evidence shows that `red lentils / lentilles rouges` includes more than one such state. Recommend removing `lentilles corail` from the broad red identity and leaving the phrase unassigned until a Québec or Canadian product source ties it to a specific form. If a future source establishes the usual split/dehulled product boundary, attach it only to that red form. The local wording supports the term’s use in Québec; it does not prove the process definition.

This is a resolution of the **catalog boundary**, not a request to add forms without demand. The plan’s whole/split and hulled/unhulled checklist remains open for other pulses. Do not add measurement, density, unit mapping, yield, conversion, or substitution data.

## Live catalog and recipe audit

The live seed package checked on 2026-10-12 contains these five active lentil references. They all use `LEGUME_AND_PULSE`, have `defaultDensity: null` and empty `unitMappings`, and have no attached forms. The form file has 79 rows total and no lentil form.

| Active ID | English / French display | Current aliases | Proposed treatment |
|---|---|---|---|
| `ingredient-ref-lentils` | `lentils / lentilles` | None | Keep generic; add no processing aliases or forms without an exact need. |
| `ingredient-ref-green-lentils` | `green lentils / lentilles vertes` | None | Keep identity-only. No state-qualified aliases or forms. |
| `ingredient-ref-french-green-lentils` | `French green lentils / lentilles vertes françaises` | fr-CA: `lentilles françaises` | Keep identity-only and separate from general green lentils. |
| `ingredient-ref-red-lentils` | `red lentils / lentilles rouges` | fr-CA: `lentilles corail` | Keep the red identity; review `lentilles corail` as a form-qualified phrase as described above. Add no form in this packet. |
| `ingredient-ref-black-beluga-lentils` | `black Beluga lentils / lentilles noires Beluga` | EN: `Beluga lentils`; fr-CA: `lentilles Beluga` | Keep identity-only. Do not infer processing states from the Beluga name. |

`ingredient-ref-green-lentil-flour` is a separate `FLOUR_AND_STARCH` product and is not a whole-seed lentil identity or a form parent in this review. The prior brown/yellow name review remains closed as a no-add decision; this packet does not reopen it.

The manifest lists **114 recipe files and 1,123 ingredient rows**. A scan of every ingredient row’s stored fields for `lentil`, `lentille`, `dal`/`dahl`, `masoor`, and `Beluga` found **zero matches**. There is no whole, split, dehulled, red, green, French green, Beluga, or `corail` recipe demand to link or resolve.

No current form or measurement record exists for these lentil references. If the ledger is updated after review, append the form-boundary evidence and decision to the existing `ingredient-ref-red-lentils` record; do not create a new ingredient-reference record or a form record for a form that is not being integrated. No new ledger record ID is proposed.

## Evidence and boundaries

| Question | Evidence | Decision and limit |
|---|---|---|
| Are whole, split, and dehulled distinct lentil identities? | Statistics Canada describes secondary pulse processing as operations including `décortiquer ou casser`. It says green lentils are often marketed whole, while red lentils are marketed whole or dehulled and split [S02]. | These are processing/presentation states within the lentil identity. The 2014 article reflects an older market snapshot and is not used to infer present prevalence. |
| Are splitting and dehulling the same state? | The Canadian Grain Commission’s method for red lentils separates whole seeds, split seeds, broken seeds, and hulls, then classifies both whole and split seeds as coated or dehulled [S01]. Its 2024 red-lentil report separately reports dehulled whole and dehulled split samples [S03]. | No. Preserve the two attributes; one may not be inferred from the other. The method is a red-lentil quality protocol, not a universal household product catalog. |
| Which French forms are supported? | The Commission’s French method uses `graines entières`, `graines fendues`, `graines cassées`, `enveloppes`, `vêtues`, and `décortiquées` for its processing categories [S01]. Its 2024 report uses `lentilles rouges entières décortiquées` and `lentilles fendues décortiquées` [S03]. | These are Canadian French technical terms. They support clear descriptive wording, but do not amount to an OQLF ruling or a Québec retail standard. |
| What Québec product labels are attested? | A Québec Metro listing is titled `Lentilles rouges cassées` [S05]. Québec recipe and bulk-retail sources use `lentilles rouges (corail)` [S06–S07]. | `Cassées` and `corail` are attested local wording. The listings do not state the seed-coat status; the recipe does not state whether the seeds are whole or split. Do not derive a process alias from titles alone. |
| Is `lentilles corail` a broad red-class synonym? | OQLF’s GDT entry supports generic `lentille` and the English `lentil`, but does not define a red class or `corail` form [S04]. The local sources use `corail` parenthetically with `rouges`, without specifying processing [S06–S07]. | The local evidence supports the phrase’s use, not its unrestricted equivalence to every red-lentil presentation. Keep it off the broad identity pending a product source that establishes form. |

The independent Québec wording review is therefore limited but positive: `lentilles rouges cassées` and `lentilles rouges (corail)` occur in Québec-facing sources; `lentilles rouges fendues`, `entières`, and `décortiquées` are established in official Canadian French technical sources. No OQLF class-specific definition for `corail`, `fendue`, or lentil dehulling was located in this review. Use the technical French as descriptive wording only unless a current Québec product label confirms the exact combined form.

## Proposed catalog disposition

| Data area | Proposal |
|---|---|
| Ingredient references | Preserve the five live identities and their IDs. Add no new lentil identity or processing alias. Keep the red color class separate from generic lentils. |
| `ingredient-ref-red-lentils` | Review/remove `lentilles corail` from the base row; keep it unassigned unless a direct Québec/Canadian source establishes its product scope. If that evidence establishes a split/dehulled product, attach the term to that form only. This proposal leaves the live row untouched. |
| Forms | Add no forms now. When a recipe/product need occurs, model the documented state under its exact active parent. For red lentils, distinguish whole from split and coated from dehulled; use a combined state only when the source establishes both. Do not infer that every split lentil is dehulled. |
| `ingredient-forms.v1.json` | No new row. There is no form-specific recipe line or approved product boundary to link in the current package. |
| Research ledger | Reuse existing `ingredient-ref-red-lentils` record if the integrator records this review. Add no new ingredient/form record ID. Keep measurement and substitution research states unchanged. |
| Plan and roadmap | Leave untouched here. The Section H whole/split and hulled/unhulled checklist remains open pending recipe-backed, identity-specific forms. |
| Measurements and transformations | Add no density, mapping, yield, conversion, or substitution. The processing sources do not establish household measurements or interchangeable cooking behavior. |

## Source register

Sources were accessed 2026-10-12. Their scope and limits are stated here so technical grain classification is not mistaken for a Québec product-name ruling.

| ID | Source | Support and limitation |
|---|---|---|
| S01 | Canadian Grain Commission, [Pulse crops methods and tests](https://www.grainscanada.gc.ca/en/grain-research/export-quality/pulses/methods-tests.html) and [Méthodes et analyses servant à mesurer la qualité des légumineuses](https://www.grainscanada.gc.ca/fr/recherche-donnees/qualite-exportations/legumineuses/methodes-et-analyses.html) | Official English/French red-lentil dehulling protocol separates whole and split seeds, then distinguishes coated from dehulled fractions. It is technical quality testing, not a consumer-label rule or culinary conversion source. |
| S02 | Statistics Canada, [Les légumineuses au Canada](https://www150.statcan.gc.ca/n1/pub/96-325-x/2014001/article/14041-fra.pdf), 2014 | Says green lentils are often sold whole, and red lentils whole or dehulled and split; describes processing operations as dehulling or splitting. The article reports an older Canadian market snapshot and does not define `corail`. |
| S03 | Canadian Grain Commission, [Qualité des lentilles de l’Ouest canadien 2024](https://www.grainscanada.gc.ca/fr/recherche-donnees/qualite-recoltes-exportations-grain/lentilles/2024/rapport-qualite-lentilles-2024.pdf) | Official French report distinguishes whole and split red samples after dehulling; supports the French technical forms `entières`, `fendues`, and `décortiquées`. Not a Québec retail terminology ruling. |
| S04 | Office québécois de la langue française, [lentille (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082779/lentille) | Supports generic `lentille` / `lentil` and the edible dry seed. The entry does not establish the preferred name or processing scope for red lentils or `lentilles corail`. |
| S05 | Metro, [Lentilles rouges cassées, Mieux-être](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/feves-sechees/lentilles-rouges-cassees/p/059749929301) | Québec-facing French grocery title and ingredient name `LENTILLES ROUGES CASSÉES`. The product page does not state dehulling status; retailer inventory and text may change. |
| S06 | Mangez Québec, [Velouté de carottes, rutabaga et courge style dhal](https://mangezquebec.com/recette/veloute-de-carottes-rutabaga-et-courge-style-dhal/) | Québec recipe ingredient line says `lentilles rouges (corail)`. The recipe does not identify seed-coat or split state; its cooking time is not proof of form. |
| S07 | Épicerie La Recette5, [Espace VRRAC product list, 2025-04-15](https://www.epicerielarecette.com/assets/site/img/presse/LISTE%20PRODUITS%20VRAC%20%20%202025-04-15.pdf) | Québec bulk-retail product list uses `lentilles rouges (corail)` for multiple brands. It attests local wording only; it supplies no product specification for whole, split, or dehulled state. |

## Review limits

This proposal resolves only the modeling category and the current alias boundary for active lentil identities. It does not create form IDs, alter recipe links, resolve brown/yellow labels, or close the wider Section H forms checklist. No tests, normalizers, builds, or emulator checks were run, as required for this proposal-only review.
