# WP04 Section P — canned sardines product-boundary review (R170)

- **Review / source-access date:** 2026-10-16.
- **Recommendation:** Integrate identity-only `canned sardines / sardines en conserve` as `ingredient-ref-canned-sardines`, category `PROTEIN`, with no aliases or forms.
- **Scope:** A finished-food market group for fish products sold in sealed cans and marketed as sardines. It is not a sardine species, a canning form on a raw-fish row, a Canadian legal-label ruling, or a universal identity for every Codex sardine-type product.
- **Status:** Proposal-only. No shared catalog or ledger JSON, generated file, plan, roadmap, batch README, recipe, or code was changed. No app, build, emulator, or software tests were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S01` through `S05`; audit ID `WP04-SECTIONP-CANNED-SARDINES-R170-20261016-R01`. All remain unallocated pending review.

## Distinct open gap

The [active Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5925) keeps canned and other preserved fish products open. The [sardine species review](wp04-sardine-fish-identity-boundary-review-20261011.md) integrated species-qualified European pilchard and Pacific sardine rows while explicitly reserving canned, oil-packed, and other prepared sardine products for separate work. The [broad preserved-fish review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) likewise kept canned sardines distinct from raw fish and from a generic canned-fish identity. Neither allocated a canned-sardine product row.

Recent preservation decisions address other boundaries: R165 held one Brunswick kippered-sardine SKU because its fish/process identity was unresolved; R168 integrated canned tuna; and R169 integrated smoked salmon. None decides the product group `canned sardines / sardines en conserve`.

The current Codex standard defines a canned sardine and sardine-type product class across multiple fish taxa and packing media. Brunswick's current Canadian pages market canned sardines in English and Québec French, explain that the firm's sardine products use North Atlantic herring, and place its products in canned seafood. A current Metro Québec product listing uses `Sardines` in a canned-product aisle. This supports a narrow product-market identity while showing why no single raw species, packing medium, or drained amount belongs on the row. [S01–S05; reused sources below]

## Product and species boundary

The proposed row covers products sold as canned sardines. Codex CXS 94-1981 is explicitly titled for canned sardines and sardine-type products; its current text, amended in 2026, lists several taxa, including *Clupea harengus*, *Sardina pilchardus*, and *Sardinops* species. The standard includes products packed in water, oil, or another suitable medium. This is an international product-standard scope, not a Canadian Fish List entry or permission to replace a product's Canadian common name. [Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S08`; CFIA naming sources below]

Brunswick says its canned sardine products use North Atlantic herring (*Clupea harengus*), while the active catalog already has a separate species identity for Atlantic herring. The canned row therefore must not become an alias or form on Atlantic herring, European pilchard, or Pacific sardine. Keep species claims attached to source-specific products and preserve all three existing fish identities. [S01–S02; reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S02`]

The proposed market identity includes variation in packing medium and product presentation only when the product is sold as canned sardines. Current Brunswick offerings include oil, water, tomato, and pepper variants, as well as a separate sardine-fillets line. Do not add medium, sauce, seasoning, smoked, kippered, fillet, drained, ready-to-eat, or `sardine-type product` wording as global aliases or forms. Exclude fish packed in oil but marketed under another name, extracted sardine oil, sardine paste, fish sauce, roe, and composite dishes. [S02–S05]

## Exact-key and source-ownership audit

The live snapshot contains **1,545 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,889 research-ledger records** with **8,084 source entries / 6,916 distinct source IDs / 5,712 distinct URLs**. The manifest lists **114 recipe files and 1,123 ingredient rows**.

Exact-key checks mirror `normalizeIngredientSearchKey` in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase with `Locale.ROOT`, Unicode NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace other punctuation runs with spaces, and collapse whitespace. Checks covered reference names/aliases, form labels/match terms, legacy names/aliases and IDs, ledger record IDs and source IDs/URLs, and the inspected proposal/batch archive.

| Candidate phrase or key | Current exact owner | Disposition |
|---|---|---|
| `canned sardines`; `canned sardine`; `sardines en conserve`; `sardine en conserve`; `sardines en boîte`; `sardines en boite`; `canned sardine fillets`; `sardine-type products` | No exact active reference, form, legacy candidate, or ledger identity field owns these keys. | Only `canned sardines / sardines en conserve` is proposed. Add no singular, product-type, medium, cut, or preparation alias. |
| `ingredient-ref-canned-sardines`; `candidate-canned-sardines` | No exact active reference, form, legacy ID, or ledger record ID. | Propose the reference ID only; add no legacy candidate. |
| `ingredient-ref-european-pilchard`; `ingredient-ref-pacific-sardine`; `ingredient-ref-atlantic-herring`; `ingredient-ref-canned-tuna` | Active rows for the named species or distinct canned-tuna product group. The sardine and herring species rows have no attached forms. | Keep all rows unchanged; do not attach the canned product to a species. |
| `WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S01`–`S05`; audit `…-R01` | No exact source-ID collision in the live ledger or inspected proposal/batch archive. | IDs remain proposal-local and unallocated. |

The S01–S05 URLs have no exact owner in the live ledger or inspected proposal/batch archive. Reused source ownership is explicit: OQLF `WP04-SARDINE-FISH-BOUNDARY-20261011-S01`, CFIA Fish List `…-S02`, Codex CXS 94 `…-S08`, and CFIA fish-product labelling `…-S09` remain owned by the earlier sardine review and its species records. Reuse those IDs where needed; do not allocate duplicate IDs or source URLs.

## Picker projection

The projection follows phrase-first matching over bilingual reference names, aliases, and attached forms in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The proposed row has only `canned sardines / sardines en conserve`, empty aliases, and no forms.

| Query | Current result | With proposed row | Consequence |
|---|---|---|---|
| `canned sardines` | No result | Canned sardines / sardines en conserve | Exact English product query selects the new market identity. |
| `sardines en conserve` | No result | Canned sardines / sardines en conserve | Exact Québec French product query selects the same identity. |
| `sardines` | European pilchard and Pacific sardine | Those two plus canned sardines | The plural query now distinguishes species from the canned product group. |
| `sardine` | European pilchard and Pacific sardine | Unchanged | Phrase-first matching returns the two existing singular species terms; the proposed plural product name is not treated as a singular alias. |
| `canned`; `en conserve` | Nine existing results each, including existing canned food forms and canned tuna | Those nine plus canned sardines | Broad preservation searches remain multi-result. |
| `Atlantic herring`; `sardine européenne`; `sardine du Pacifique` | Their current species identities | Unchanged | Species-qualified searches remain attached to their current rows. |
| `sardines in oil`; `sardines in water`; `filets de sardines`; `sardine-type products`; `poisson en conserve` | No exact result | No exact result | No medium, cut, standard-class, or generic-canned-fish aliases are added. |

No form hint is produced. The row makes the exact canned-product phrase searchable without implying one taxon, packing medium, cut, or drained state.

## Manifest recipe demand

The manifest-ordered audit parsed all **114 recipe files and 1,123 structured ingredient rows** and scanned every decoded JSON string and ingredient row for `canned sardine(s)`, `sardines en conserve`, canned sardine fillets, sardine-type products, sardine/pilchard phrases, and the associated Québec French variants. It found **zero matching recipe files and zero matching ingredient rows**. There is no recipe link, selected product state, amount, or method to connect to this row. [R01]

## Forms, numeric data, conversions, and substitutions

- **Forms:** No form is attached to the existing European-pilchard, Pacific-sardine, or Atlantic-herring rows. Add no canning, draining, oil-packed, water-packed, smoked, or other form to those species rows or to the proposed finished-product row.
- **Package and drained amounts:** Metro's current Québec listing shows a 106 g Brunswick can. Brunswick's product page gives a nutrition basis of one can drained (84 g). These are different SKU-specific net-package and nutrition-serving statements; neither is a recipe amount, general can size, drained yield, or conversion. Record no reusable quantity or package-yield rule. [S04–S05]
- **Density and unit mapping:** The three neighboring raw fish references have `defaultDensity: null` and `unitMappings: []`; the proposed reference should also use `null` and `[]`. The one existing package-yield entry has no sardine, herring, or fish record. Add no count/volume mapping, density, drained mass, edible yield, or cooking yield.
- **Substitutions:** The global and contextual substitution files contain zero active rules. The corpus provides no dish or method scope. Add no rule, warning, amount, or recipe-line link between canned sardines, raw species, herring, canned tuna, other preserved fish, or any substitute.

## Proposed delta

Add one identity-only reference:

```json
{
  "id": "ingredient-ref-canned-sardines",
  "nameFr": "sardines en conserve",
  "nameEn": "canned sardines",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "PROTEIN"
}
```

If accepted, add a verified ledger record for `ingredient-ref-canned-sardines` with `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`. Use S01–S05 and reuse the existing OQLF, CFIA, and Codex source IDs for their established naming/product-standard limits. Keep observations about 106 g package size and 84 g drained label basis explicitly product-specific; add no active measure, density, mapping, form, package conversion, yield, recipe link, species assignment, legacy identity, or substitution. Keep all new source IDs proposal-local until integration.

## Source register

New sources were accessed on 2026-10-16. S01–S05 are proposal-local and unallocated. Reused source IDs retain their existing ownership.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S01** | Brunswick Canada, [Frequently Asked Questions](https://brunswickcanada.ca/faq/). | Current manufacturer FAQ says Brunswick sardines are sold in Canada's canned-seafood section and that its canned sardine products use North Atlantic herring (*Clupea harengus*). This is maker-specific evidence, not a universal sardine taxon. |
| **WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S02** | Brunswick Canada, [Questions fréquemment posées](https://brunswickcanada.ca/fr/questions-frequemment-posees/). | Current French-language maker FAQ uses `sardines ... en conserve` and says Brunswick products use Atlantic herring. Supports Québec French market wording and product/species separation; it is not a general labeling ruling. |
| **WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S03** | Brunswick Canada, [Products](https://brunswickcanada.ca/products/). | Current manufacturer catalog separates sardines and sardine-fillets products and lists oil, spring-water, tomato-sauce, pepper, and other variants. Supports product diversity, not a universal composition or preparation. |
| **WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S04** | Brunswick Canada, [Sardines Brunswick à l’huile de soya](https://brunswickcanada.ca/fr/products/sardines-brunswick-dans-lhuile-de-soja-106-g/). | Current French product page identifies one sardine/oil product and provides a one-can drained (84 g) nutrition basis. This is product-specific; it is not a reusable mass, can yield, or recipe measure. |
| **WP04-SECTIONP-CANNED-SARDINES-R170-20261016-S05** | Metro Québec, [Sardines dans de l'huile de soya](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/sardines-dans-de-l-huile-de-soya/p/066613000059). | Current retailer listing names a Brunswick canned-sardine product and displays a 106 g package. It is a retailer/SKU listing, not a general availability statement, drained quantity, or conversion. |
| **Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S08`** | FAO/WHO Codex, [Standard for Canned Sardines and Sardine-Type Products, CXS 94-1981](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/ua/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS%2B94-1981%2FCXS_094e.pdf), current text amended 2026. | Scope and product definition cover multiple fish taxa and water/oil/other packing media. International product-standard evidence only; it is not Canadian species identity or authorization to rename all listed taxa. |
| **Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S01`** | OQLF, [sardine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198919/sardine). | Existing term record pairs Québec French `sardine` with *Sardina pilchardus*. Reuse only for the raw-species/product boundary; it does not define canned sardines. |
| **Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S02`** | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). | Existing source maps acceptable Canadian common names to species and shows that sardine wording spans multiple taxa. It does not establish equivalence among raw species or this app-level product group. |
| **Reused `WP04-SARDINE-FISH-BOUNDARY-20261011-S09`** | CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). | Existing CFIA source gives fish-product labelling and condition guidance. The proposed catalog display is not a legal label authorization. |
| **WP04-SECTIONP-CANNED-SARDINES-R170-20261016-R01** | [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5925), R154–R169 decisions, active [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), [substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), every manifest-listed recipe, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Read-only exact-key and source-ID/URL ownership, picker, corpus, forms, numeric, and substitution audit at the snapshot counts above. |

## Final disposition

**Integrate** `ingredient-ref-canned-sardines` as the identity-only market group `canned sardines / sardines en conserve`. Keep it separate from raw European pilchard, Pacific sardine, Atlantic herring, and canned tuna. Preserve product-specific species, packing medium, cut, seasoning, smoke, readiness, package, and drained state. Add no aliases, forms, reusable measures, conversions, yields, recipe links, or substitutions. Exact canned-product queries become searchable while broad `sardines`, `canned`, and `en conserve` queries remain multi-result.
