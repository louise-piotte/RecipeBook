# WP03 Section F: durum-wheat-berries identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as identity-only `ingredient-ref-durum-wheat-berries`; see the batch README for root disposition and static validation.
- **Candidate:** Whole durum-wheat kernels marketed as durum wheat berries, separate from generic wheat berries and durum milling products.
- **Section F fit:** The live checklist covers unfinished grain identities and asks to keep whole grain, flour, semolina, and processed products distinct. The active catalog has generic wheat berries, durum flour, durum semolina, and remilled durum semolina, but no durum-grain identity.
- **Prior-work check:** Searches of the active plan, proposals, batches, references, forms, legacy candidates, and ledger found no focused durum-grain identity review, held candidate, or allocated identity. Existing durum-flour and durum-semolina sources mention the cereal as a milling input; they do not cover a package of whole durum kernels.

## Recommendation

Add one identity-only `GRAIN_AND_CEREAL` reference for the human-food kernels sold as **`durum wheat berries / blé dur`**. The English product phrase appears on a current Québec retailer listing; the French base name is the OQLF-preferred `blé dur`, and a current Québec product page calls its item `blé dur rond biologique` and describes it as whole grain.

Scope the row to whole, intact durum-wheat kernels sold as food. Keep durum flour, durum semolina, remilled durum semolina, generic wheat berries, and other wheat grain classes distinct. The proposed French display uses the OQLF-preferred grain name; `rond` and `biologique` remain product qualifiers and are not aliases.

| Proposed field | Recommendation |
|---|---|
| ID | `ingredient-ref-durum-wheat-berries` (unallocated) |
| English display | `durum wheat berries` |
| Québec French display | `blé dur` |
| Category | `GRAIN_AND_CEREAL` |
| English and French aliases | None |
| Recipe links | None; no candidate phrase occurs in the bundled corpus |
| Forms, default density, unit mappings, measures, yields, conversions, substitutions | None |

The evidence supports the scoped identity and bilingual names. It does not establish a universal durum-kernel variety, milling grade, household measure, cooking yield, or substitution.

## Naming and boundaries

| Phrase | Disposition | Evidence boundary |
|---|---|---|
| `durum wheat berries` | Proposed English display. | Exact wording on a current Québec retailer's product page for bulk organic durum-wheat kernels. The page is currently marked out of stock; it supports product naming, not present availability. |
| `blé dur` | Proposed Québec French display. | OQLF's preferred term for the cereal; the local product page uses `blé dur rond biologique` and describes a whole grain. No separate French alias is needed. |
| `durum wheat` / `durum` | Do not add as aliases. | OQLF lists `durum wheat` and `durum` as English equivalents for the cereal, but the live picker also finds the existing durum-flour entry for `durum wheat`; the shorter `durum` query reaches durum flour and both durum semolina products. |
| `pasta wheat` | Do not add. | OQLF calls this a colloquial associated term, but no reviewed product page uses it for a package of whole kernels. |
| `wheat berries` / `grains de blé entiers` | Keep on the existing generic wheat-berries reference. | A bare `wheat berries` search will find both the general reference and this more specific product if integrated. This preserves both choices rather than assigning durum kernels to the generic row. |
| `semolina`, `semoule`, `farina`, `couscous`, and `bulgur` | Do not add as aliases or forms. | OQLF says durum wheat is processed into semolina and used to make pasta, couscous, and bulgur. Those are related foods or milling products, not alternate names for intact kernels. |

The proposed display pair is intentionally specific enough to distinguish whole kernels from the existing flour and semolina identities. The French base term `blé dur` is authoritative; the product-state scope comes from the current Québec product listing.

## Live ownership and picker-collision audit

The review-time snapshot is from the canonical split seed package. Counts and hashes are over exact file bytes.

| Artifact | Review-time state | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,248 references; 115 in `GRAIN_AND_CEREAL` | `ff463caf37891f5ec56b27c739a6ee7c97ac17e5f6fbe6fe0b49eaa5d76905d8` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,555 records | `afbc8dcf991e21a3a1e6527f43a1df8a1b9739041d07c6f29a71622004b4d896` |

Exact-key checks used the repository's `normalize_search_key` on active reference names and aliases, form labels and match terms, all legacy-candidate names and aliases, and ledger record IDs. None owns `durum wheat berries`, `durum wheat berry`, `whole durum wheat`, `whole durum wheat berries`, `blé dur`, `grain de blé dur`, or the proposed ID. The only active durum-related records are `ingredient-ref-durum-flour`, `ingredient-ref-durum-semolina`, and `ingredient-ref-semola-rimacinata`; the only wheat-berry identity is `ingredient-ref-wheat-berries`.

The repository's phrase-first search code returns any indexed term containing the complete normalized query phrase. Based on that code, the expected source-level outcomes after a future integration are:

- `durum wheat berries` selects the proposed row.
- `wheat berries` returns both the existing generic row and the more specific durum row.
- `durum wheat` returns the proposed row and existing durum flour, whose alias is `durum wheat flour`.
- `durum` returns the proposed row, durum flour, durum semolina, and remilled durum semolina.
- `blé dur` returns the proposed row, durum flour, durum semolina, and remilled durum semolina.

These are source-code projections from `IngredientSearch.kt`, not live picker results. No search implementation or UI behavior is proposed.

## Recipe-demand audit

All 114 manifest-listed recipe files were scanned in full, including each ingredient row's original text, ingredient name, and reference ID. The audit covered the candidate names and variants `durum wheat berries`, `durum wheat berry`, `whole durum wheat`, `whole durum wheat berries`, `durum grain`, `durum wheat`, `durum`, `blé dur`, `grain de blé dur`, `grains de blé dur`, and `blé dur entier`. It found **zero matching recipe files and zero matching ingredient rows** among the 1,123 rows. No recipe link, quantity, form hint, or recipe-text change is proposed.

## Measurement, form, and substitution evidence

- **Retail package:** La Boîte à Grains lists its product by the kilogram. Moulin Abénakis lists a 500 g product format. These are product/package details, not household measures.
- **Cooking directions:** Moulin Abénakis gives a product-specific direction of 1 cup blé dur to 3 cups water and 45–60 minutes of cooking. This is not a mass-volume conversion or a measured cooking yield, and it should not be generalized to the catalog row.
- **USDA household measure:** USDA Standard Reference Release 28 lists `Wheat, durum` (NDB 20076) at 1 cup = 192 g. The same entry prints `Triticum aestivum L.` even though OQLF identifies durum wheat as *Triticum turgidum* L. subsp. *durum*; the table also does not state the kernel preparation or cup-packing method. Keep this historical value proposal-only and do not use it as an active observation, density, or unit mapping without a source-scope recheck.
- **Density and mappings:** No transferable density or ingredient-specific unit mapping is established for the proposed row. Keep `defaultDensity` null and `unitMappings` empty.
- **Forms and yield:** Whole kernels define the identity. No reusable form relation, dry-to-cooked yield, or conversion is established. Do not create a form under generic wheat berries.
- **Substitution:** The reviewed sources offer cooking and serving suggestions but no tested, quantity-qualified replacement rule. Add no global or contextual substitution.

## Integration delta if accepted

1. Add only `ingredient-ref-durum-wheat-berries` as `durum wheat berries / blé dur` in `GRAIN_AND_CEREAL`, with no aliases, forms, numeric data, or recipe links.
2. Add the accepted identity decision and proposal sources to the research ledger; keep measurement and substitution states unresolved unless later exact-scope evidence changes them.
3. Leave the existing wheat-berries, durum-flour, durum-semolina, and remilled-durum-semolina records unchanged.
4. Recheck exact ownership, phrase-first picker behavior, and the manifest corpus against the live package before integration. This proposal-only review did not run tests or emulator checks.

## Source register

Sources below were reviewed on 2026-10-12. Their IDs were absent from the shared ledger at drafting time; root recorded them on `ingredient-ref-durum-wheat-berries` during integration.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-DURUM-GRAIN-20261012-S01` | Office québécois de la langue française, [blé dur (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357379/ble-dur), updated 2019. | Gives preferred French `blé dur`, English `durum wheat` and `durum`, and the taxon *Triticum turgidum* L. subsp. *durum*. Describes the grain's food-processing uses. It does not name a retail package of intact kernels. |
| `WP03-DURUM-GRAIN-20261012-S02` | Canadian Grain Commission, [Classes de blé canadien](https://grainscanada.gc.ca/fr/qualite-grains/classement-des-grains/classes-ble.html), Western and Eastern Canadian Amber Durum classes. | Current federal grain-class source identifies durum wheat as a Canadian grain class and lists semolina, pasta, and couscous uses. It supports the grain/cereal context, not a consumer display or whole-kernel portion. |
| `WP03-DURUM-GRAIN-20261012-S03` | Moulin Abénakis, [Blé dur rond biologique](https://moulinabenakis.com/products/ble-dur-rond-bio), product title, description, format, and method. | Current Québec product page calls the product a whole grain, describes salads/soups/side-dish use, and lists a 500 g format. Its 1:3 water direction and cooking time apply to this product; no transferable yield or volume-to-mass measure is given. |
| `WP03-DURUM-GRAIN-20261012-S04` | La Boîte à Grains, [Organic Durum Wheat Berries (Bulk)](https://laboiteagrains.com/en/products/organic-durum-wheat-grains-bulk), product title and description. | Current Québec retailer page uses the exact English product phrase and says it is bulk durum wheat berries sold by the kilogram. The page is marked out of stock; it supports terminology and product identity, not current availability, a French label, or a kitchen measure. |
| `WP03-DURUM-GRAIN-20261012-S05` | USDA Agricultural Research Service, [USDA National Nutrient Database for Standard Reference, Release 28, Food Group 20](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg20.pdf), NDB 20076, PDF pp. 502–503. | The 2015 table lists `Wheat, durum` and 1 cup = 192 g. The same record's taxon line reads *Triticum aestivum L.* and does not specify the kernel-preparation or packing basis. Retained as a source-specific historical observation only; not activated as a measure or density. |

## Disposition

**Recommend an identity-only durum-wheat-berries reference**, using `durum wheat berries / blé dur`, with no aliases or numeric/substitution behavior. The current Québec product evidence and OQLF terminology support the identity and names; the recipe corpus has no demand, and the only located household-measure value has an unresolved scope/taxonomy issue. Section F remains open.
