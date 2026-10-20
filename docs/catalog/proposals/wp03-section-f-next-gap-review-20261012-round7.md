# WP03 Section F: sprouted rye berries product and naming boundary review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** integrated on 2026-10-12 as a documentation-only hold; no catalog or ledger allocation was made.
- **Scope:** one distinct sprouted-rye whole-grain product candidate under the open Section F item for regionally significant cereal mixes and preprocessed grains ([plan lines 2146–2147](../../RecipeBook-global-ingredient-catalog-plan.txt#L2239)).
- **Recommendation:** keep the shelf-stable dried `sprouted rye berries` candidate unallocated for now. Canadian manufacturers support the English product identity, but the current Québec French evidence for `seigle germé` names a fresh living germination product, not the dried product sold by Second Spring. Do not promote a constructed or state-ambiguous French name to the active catalog until a Québec source names the dried product or an independent Québec terminology review resolves that distinction.
- **No change to round6:** this is a rye-specific candidate review, not a re-review of the integrated `sprouted wheat berries / grains de blé germés` identity.

Earlier rye-berries packets explicitly kept sprouted rye outside the intact, unsprouted rye-berries identity, but they did not investigate or allocate a sprouted-rye product row. No dedicated sprouted-rye hold, exact active owner, or ledger record was found. The current candidate is a distinct product boundary; the naming gap below is why this proposal does not recommend integration yet.

## Current package, ownership, and source audit

The live workspace was checked on 2026-10-12. Exact ownership checks used the repository's `normalize_search_key` implementation, which folds case, accents, compatibility characters, punctuation, and whitespace.

| Artifact | Current count or result |
|---|---:|
| `ingredient-references.v1.json` | 1,312 references |
| `ingredient-forms.v1.json` | 98 forms |
| `legacy-import-identities.v1.json` | 64 candidates |
| `research-ledger.v1.json` | 1,620 records; 5,918 source entries |
| Package-yield records | 1; none for rye or the candidate |
| Unit conversions | 8 generic entries; none for rye or the candidate |
| Global substitution rules | 0 |
| Contextual substitution rules | 0 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows |

No active reference, form, legacy candidate, or ledger identity owns `ingredient-ref-sprouted-rye-berries`, `sprouted rye berries`, `sprouted rye kernels`, `sprouted whole grain rye`, `grains de seigle germés`, or `seigle germé`. No dedicated candidate row or hold exists. The source-ID prefix `WP03-SPRYEBERRIES-20261012` has no collision outside this proposal; the proposal path did not exist before this draft.

The active neighbors remain distinct:

- `ingredient-ref-rye-grain` owns broad `rye / seigle`.
- `ingredient-ref-rye-berries` owns the marketed intact, unsprouted kernels `rye berries / grains de seigle`, with `rye kernels` as its English alias.
- `ingredient-ref-cracked-rye`, `ingredient-ref-rye-flakes`, rye flour, rye meal, and malted rye flour are separate identities.
- `candidate-puffed-rye` is a separate unresolved product candidate; its hold does not cover sprouted rye.
- The existing `ingredient-ref-rye-berries` ledger record includes USDA SR28 NDB 20062's `1 cup = 169 g` observation for the source-named generic rye grain. That value is not sprouted rye data and must not be transferred.

The full manifest-listed recipe corpus and all ingredient rows were searched for `sprouted rye berries`, `sprouted rye`, `sprouted rye kernels`, `sprouted whole grain rye`, `germinated rye`, `germinated rye berries`, `grains de seigle germés`, `graines de seigle germées`, `seigle germé`, `seigle entier germé`, and `seigle germé biologique`. The search found **zero candidate-matching recipe files and zero matching ingredient rows**. A broad `rye` / `seigle` ingredient-line scan also found no rye lines. No recipe link, line edit, or quantity is proposed.

## Candidate boundary and current evidence

Second Spring currently sells **Organic Sprouted Rye Berries** as whole rye kernels that are soaked and sprouted, then carefully dried to shelf-stable moisture. It instructs customers to rehydrate or cook the grains before using them in dough, and lists salads, soups, risotto, and grain bowls as other uses [S01]. Everspring Farms, an Ontario grain processor, separately lists Sprouted Rye, Organic Sprouted Rye, and Regenerative Sprouted Rye as whole-grain products and describes use in breads, cereal, soups, toppings, and grain blends [S02]. These manufacturer sources support a real processed-grain product distinct from unsprouted rye berries, rye flour, cracked rye, and rye flakes.

The strongest local French evidence has a different product state. Ferme La Défriche's current Marché Outaouais profile describes its business as providing a source of living food, says it sells germinated cereals including rye, and lists **Seigle Germé bio Qué-Vrai** in 200 g and 1 kg formats [S03]. The product page itself was not retrievable during this review, so its displayed producer listing and accessible farm profile are used only for those claims. Québec's current germination guidance describes germinations as fresh food made by leaving seeds to germinate in water for a few days; the government's food-safety page says germinated seeds are kept refrigerated and consumed within a week [S04–S05]. Those sources distinguish the local fresh germination product from Second Spring's dried, shelf-stable grain. They do not establish that `Seigle Germé` is the Québec French name of the dried product.

OQLF confirms the base pair `rye / seigle` and says `seigle` names both the plant and its grain, but it does not establish a preferred compound for a dried sprouted-rye product [S06]. The exact descriptive phrase `grains de seigle germés` would follow the existing rye-grain wording, but no reviewed Québec source uses that full phrase for the shelf-stable dried product. It is therefore a candidate translation only, not an approved active display or alias.

| Wording or product | Disposition | Boundary |
|---|---|---|
| `sprouted rye berries` | Keep as an unallocated identity candidate | Manufacturer product for whole rye kernels intentionally sprouted, then dried back to shelf-stable moisture before sale. Do not merge it into unsprouted `rye berries`. |
| `sprouted rye` / `sprouted whole grain rye` | Do not add as aliases | B2B manufacturer wording is broad and can describe bulk ingredients or sprouted rye components; the candidate's exact English display is sufficient if later accepted. |
| `grains de seigle germés` | Candidate French wording only; do not activate yet | Descriptive and structurally clear, but no reviewed Québec product label applies this exact phrase to the dried shelf-stable product. |
| `Seigle Germé` | Keep as Québec fresh-product wording, not an alias for the dried candidate | The local farm-market listing is presented with its living-food and germination products. The listing does not show drying or shelf-stable storage. |
| `seigle entier germé biologique` | Keep as composite ingredient wording | A current Québec bakery listing uses it inside a multigrain bread ingredient declaration; it does not identify a standalone dried grain product [S07]. |
| `rye berries / grains de seigle` | Keep on the existing unsprouted rye-berries identity | Do not move these terms or their previous sources, 169 g USDA observation, or unquantified rice-use suggestion to the sprouted candidate. |
| Sprouted rye flour, rye flakes, cracked rye, puffed rye, malted rye, bread, and multi-grain products | Keep separate | These are milling products, other processed grains, or composite foods, not aliases or forms of this candidate. |

If the identity is later accepted, a conservative row would use the proposed ID `ingredient-ref-sprouted-rye-berries`, English display `sprouted rye berries`, and a Québec-reviewed French display; it would be in `GRAIN_AND_CEREAL` and have no aliases. The record should remain unallocated until the French product name is resolved. Do not create `seigle germé` as an alias: the exact Québec phrase currently identifies a fresh germination product, so matching it to a dried product could conflate distinct storage and recipe states.

## Measurements, forms, conversions, and substitutions

| Concern | Source evidence | Decision and limit |
|---|---|---|
| Package sizes | Second Spring offers 454 g and 1.5 kg packages [S01]. Everspring's bulk page lists 50 lb, 20 kg, or 2,000 lb totes, with a 250 lb minimum [S02]. The local fresh germination listing offers 200 g and 1 kg [S03]. | Package sizes are product or commercial-order data, not household measures, densities, recipe portions, or package yields. The fresh local product sizes do not describe Second Spring's dried product. |
| Preparation | Second Spring says to combine 1 part sprouted rye berries with 4 parts water and simmer for 30–40 minutes [S01]. | This is SKU-specific preparation guidance. The page does not state whether the “parts” are measured by mass or volume. It does not establish a reusable water ratio, dry-to-cooked yield, conversion, or serving measure. |
| Existing rye portion | The plain rye-berries ledger record has a separate USDA SR28 rye-grain observation of 1 cup = 169 g. | Keep it attached to its source-named generic rye grain; no transfer to sprouted rye or active mapping. |
| Forms | The candidate product is sold as sprouted and dried grain. The local Québec listing describes fresh living germinations, while the government guidance distinguishes fresh germinations from shoots and describes refrigeration and short storage [S03–S05]. | Add no `IngredientForm`, no fresh/dry/cooked form, and no state conversion. The sprouting-and-drying process is part of the candidate's product boundary; the reviewed sources do not justify a general rye form model. |
| Conversions and yields | No reviewed source provides a household mass-volume relation or measured cooking yield for the candidate. | Add no density, unit mapping, conversion, cooking yield, or package-yield record. |
| Substitutions | The manufacturers list possible uses and preparation contexts but do not establish a tested amount-qualified replacement rule for sprouted rye. | Add no global or contextual substitution. Do not transfer the existing rye-berries source's unquantified rice-use suggestion or infer equivalence to wheat berries, rice, quinoa, or other sprouted grains. |

## Proposal-local source register

The source IDs below are proposal-local and are not ledger additions; the shared ledger and the rest of the repository have no matching IDs. Sources were reviewed on 2026-10-12.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-SPRYEBERRIES-20261012-S01` | Second Spring, [Organic Sprouted Rye Berries](https://secondspringfoods.com/product/organic-sprouted-rye-berries/), current manufacturer product page. | Names the whole-kernel food product, describes soaking/sprouting and drying to shelf-stable moisture, gives package sizes and cooking/use instructions. The 1:4 water instruction is product-specific and has no stated mass/volume basis; it is not a conversion or yield. |
| `WP03-SPRYEBERRIES-20261012-S02` | Everspring Farms Ltd., [Sprouted Rye](https://www.everspringfarms.ca/product/sprouted-rye/), current Ontario manufacturer product page. | Lists Sprouted Rye, Organic Sprouted Rye, and Regenerative Sprouted Rye, describes whole-grain use, Canadian/Ontario origin information, and commercial package sizes. It is a bulk supplier page, not a consumer French label or household-measure source. |
| `WP03-SPRYEBERRIES-20261012-S03` | Ferme La Défriche / Marché Outaouais, [producer profile and current product listing](https://www.marcheoutaouais.com/producteurs/ferme-la-defriche-); linked listing title `Seigle Germé bio Qué-Vrai`. | The accessible farm profile describes a living-food producer and rye among its germinated cereals; its live product listing shows `Seigle Germé bio` in 200 g and 1 kg formats. The linked product-specific page returned a cache miss, so the exact product's processing and storage could not be confirmed. Do not treat the formats as household measures or the product as dried rye. |
| `WP03-SPRYEBERRIES-20261012-S04` | Gouvernement du Québec, [Culture des pousses et germinations](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/agriculture/agriculture-urbaine/quoi-planter/pousses-germinations), updated 2026-05-11. | Describes germinations as fresh foods produced by letting seeds germinate in water for a few days, distinguishes them from shoots/microgreens, and gives home-germination handling and storage guidance. Its six named crop examples do not include rye; it provides a process/state distinction, not a rye product standard. |
| `WP03-SPRYEBERRIES-20261012-S05` | Gouvernement du Québec, [Consommation des pousses et germinations](https://www.quebec.ca/sante/alimentation/salubrite-aliments-prevention-risques/salubrite-aliments-domicile/preparation-aliments-cuisson-securitaires/precautions-manipule-aliments/pousses-germinations), updated 2026-07-06. | Says germinated seeds are consumed whole, kept refrigerated, and consumed within a week of harvest or purchase. This supports a fresh-germination boundary; it does not establish that the same conditions apply to a manufacturer-dried shelf-stable grain. |
| `WP03-SPRYEBERRIES-20261012-S06` | Office québécois de la langue française, [seigle, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432764/seigle), updated 2018. | Pairs `seigle` with English `rye` and says the French term can name the grain as well as the plant. It does not name or approve a compound for dried sprouted rye berries. |
| `WP03-SPRYEBERRIES-20261012-S07` | La Moisson, [Pain grains germés biologiques le Big 16](https://lamoisson.com/products/pain-grains-germes-biologiques-le-big-16), Québec retailer product listing. | Its ingredient declaration uses `seigle entier germé biologique` within a multigrain bread. This is component wording in a composite food, not a standalone dried-grain label. Direct page fetch returned a cache miss; indexed product content was available. |

## Verification performed

- Re-read the current `AGENTS.md`, active Section F checklist, round6 integration note, and the prior rye-berries and residual-grain reviews.
- Audited normalized ownership across the current 1,312 references, 98 forms, 64 legacy candidates, and 1,620 ledger records. Confirmed the existing unsprouted rye-grain and rye-berries owners; found no exact candidate identity, dedicated hold, or source prefix.
- Checked package yields, unit conversions, global substitutions, and contextual substitutions for candidate ownership; found none.
- Scanned every manifest-listed recipe JSON file and ingredient row: 114 files, 1,123 rows, zero candidate phrase hits and zero broad rye/seigle ingredient lines.
- Checked source pages for product wording and access limits. Second Spring, Everspring, Québec government, OQLF, and the farm profile were accessible. The Ferme La Défriche product subpage and La Moisson page returned cache misses; their currently indexed product listings were used only within the stated limits.
- Confirmed the proposal path was newly added and the source-ID prefix has no collision outside it. At proposal-review time, this was documentation-only work; no app tests or emulator run were needed. No shared JSON or generated package check was run because no such file was changed.
- Post-draft checks found UTF-8 without BOM, no mojibake markers, and no trailing whitespace. At proposal-review time, no shared catalog, ledger, plan, roadmap, recipe, or generated file was edited.


## Integration result (2026-10-12)

Recorded a documentation-only hold for sprouted rye berries. Canadian manufacturers support a dried,
shelf-stable whole-kernel English product, but current Québec evidence for `Seigle Germé` describes a
fresh living germination product. The descriptive phrase `grains de seigle germés` remains an
unapproved candidate translation until a Québec source names the dried product or independent Québec
terminology review resolves the storage-state distinction.

No active reference, ledger record, alias, legacy candidate, form, measure, recipe link, conversion,
yield, or substitution was added. The existing unsprouted rye-grain and rye-berries rows and their
169 g USDA observation remain unchanged. The 114-file / 1,123-row corpus has no candidate or broad
rye/seigle ingredient match. Static ownership, source-prefix, package-yield, conversion, substitution,
recipe-corpus, UTF-8/no-BOM, mojibake, and whitespace checks passed. This documentation-only hold did
not require app tests or emulator checks. Section F remains open. See the batch integration note.
