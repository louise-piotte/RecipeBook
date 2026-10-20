# WP04 Section P — canned salmon product-boundary review (R172)

- **Review / source-access date:** 2026-10-16.
- **Recommendation:** Integrate identity-only `canned salmon / saumon en conserve` as `ingredient-ref-canned-salmon`, category `PROTEIN`, with no aliases or forms.
- **Integration:** Accepted. The identity and ledger record are integrated as proposed.
- **Scope:** A picker identity for the finished product group sold as canned salmon. It is separate from raw salmon fillets, each salmon species, and smoked salmon. It is not a species assignment, a legal label name, or a claim that the products share one cut, packing medium, or drained state.
- **Status:** Integrated into the bundled reference catalog and research ledger. No legacy identity, recipe link, form, numeric value, conversion, yield, or substitution was added. No tests or builds were run.
- **Source registration:** `WP04-SECTIONP-CANNED-SALMON-R172-20261016-S01` through `S05` are allocated to the new ledger record; the existing CFIA common-name source is reused. Audit `WP04-SECTIONP-CANNED-SALMON-R172-20261016-A01` remains proposal documentation only.

## Why this is an open, bounded product identity

The [active Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5925) leaves canned fish products open. The broad [preserved-fish review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) correctly declined a generic canned-fish identity and universal canned forms; it did not allocate a canned-salmon product row. Recent decisions separately integrated `canned tuna / thon en conserve` (R168), `smoked salmon / saumon fumé` (R169), and `canned sardines / sardines en conserve` (R170). None covers canned salmon. The R171 generic fish-cake hold concerns a separate formed product.

The current Codex Standard CXS 3-1981 defines canned salmon as a product class made from seven named *Salmo* and *Oncorhynchus* species, sealed hermetically, and heat-processed to commercial sterility. Its permitted products can have different presentations and packing media; the standard says the species-appropriate name and packing medium belong in commercial product labeling. This supports a prepared-product picker identity without assigning a taxon or replacing Canadian species-specific package names. [S01; reused CFIA guidance below]

A current Québec Maxi page has the exact category title **Saumon en conserve** and lists sockeye and pink-salmon products under it. Clover Leaf’s current bilingual product pages show further presentation differences: whole pink salmon with skin and bones and flaked pink salmon with skin and bones removed. These sources support the French market wording and a distinct product group, while package and label details remain SKU-specific. [S02–S04]

## Product, species, and state boundary

The proposed row covers canned salmon as a finished market product when the recipe or label names that product group. It remains distinct from:

- raw or unspecified `salmon fillets / filet de saumon` and the active Atlantic, Chinook, chum, coho, pink, and sockeye species identities;
- the separately integrated `smoked salmon / saumon fumé` product group;
- salmon salad, pâté, bowls, spreads, and other composite or ready-meal products;
- canned tuna, canned sardines, and other canned seafood.

The row does not assert that all salmon species or presentations are interchangeable. Codex lists *Salmo salar*, *Oncorhynchus nerka*, *O. kisutch*, *O. tshawytscha*, *O. gorbuscha*, *O. keta*, and *O. masou* within its canned-salmon standard; that international list is product-scope evidence, not Canadian labeling authorization. Current Québec retail evidence reviewed here directly shows sockeye and pink products. Do not infer a particular species from the proposed group name. The catalog display is for recipe search and must not replace species and packing-medium wording required on a package. [S01–S03; reused CFIA guidance]

Do not add `pink`, `sockeye`, `whole`, `flaked`, `chunk`, `skinless`, `boneless`, `in water`, `in oil`, `in broth`, `salted`, `low-sodium`, `smoked`, `drained`, or `undrained` as aliases or forms. Exclude products sold as pouches, smoked salmon, salmon pâté, and composite meals unless a later recipe requests an exact product and state.

## Exact-key and ownership audit

The live snapshot contained **1,547 references**, **119 forms**, **61 legacy candidates**, **1,891 ledger records**, **8,099 source entries / 6,925 distinct source IDs / 5,721 distinct URLs**, and **114 manifest-listed recipes with 1,123 ingredient rows**. Exact-key checks mirrored accent folding, ligature folding, punctuation removal, and phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). They covered bilingual reference names and aliases, form labels and match terms, legacy candidate names and aliases, ledger identity fields and record IDs, and the inspected proposal/batch archive.

| Key or owner | Live result | Disposition |
|---|---|---|
| `canned salmon`; `saumon en conserve`; `canned pink salmon`; `canned sockeye salmon`; `saumon en boîte`; `tinned salmon`; `salmon in a can` | No exact active reference, form, or legacy candidate key. No ledger identity or candidate record owns the canned-salmon group. | These product-group keys remain unallocated; only the two display names in the proposed row are recommended. |
| `ingredient-ref-canned-salmon` | No active reference, form, legacy candidate, or ledger record ID. | Proposed reference ID only; unallocated. |
| `ingredient-ref-smoked-salmon` | Active `smoked salmon / saumon fumé` market group. | Keep unchanged and separate from canned salmon. |
| `ingredient-ref-salmon-fillets-without-skin`; salmon species references | Active raw/unspecified fillet identity and species-specific identities; none has a canned form. | Keep all owners and recipe links unchanged. Do not attach canned wording to them. |
| Existing canned-salmon food-code evidence | The ledger stores CNF code 3222 (salted canned pink salmon) under `ingredient-ref-pink-salmon` and code 3226 (canned sockeye, drained solids with bone, unsalted) under `ingredient-ref-sockeye-salmon`. | These are source-specific quantities for distinct species and food states, not ownership of a canned-salmon identity or shared measurement. Reuse the existing source records; do not duplicate or pool them. |

The new source-ID prefix and S01–S05 URLs were checked against the live ledger and proposal/batch archive. No exact source-ID or URL owner was found. The reused CFIA fish-label guidance keeps its existing owner `WP04-SALMON-TUNA-BOUNDARY-20261011-S01`; it is not reallocated. No separate legacy candidate is proposed.

## Picker projection

The projection follows phrase-first matching over bilingual names, aliases, and attached forms in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The proposed row contains only `canned salmon / saumon en conserve`, with empty alias arrays and no form.

| Query | Current results | With proposed row | Effect |
|---|---:|---:|---|
| `canned salmon` | 0 | 1 | Exact English product query becomes available. |
| `saumon en conserve` | 0 | 1 | Exact Québec French product query becomes available. |
| `salmon` / `saumon` | 8 each | 9 each | Still returns multiple species/product choices; canned salmon does not take over the broad query. |
| `canned` / `en conserve` | 10 each, including canned foods, tuna, and sardines | 11 each | Broad preservation searches remain multi-result. |
| `smoked salmon` / `saumon fumé` | The smoked-salmon row | Same smoked-salmon row | Canned salmon receives no smoked alias or form and does not displace the smoked product. |

The projection was computed against the current 1,547 references and 119 forms. The proposed identity adds no form hint.

## Manifest recipe demand

All **114** paths in `manifest.v1.json` were parsed. The scan checked all **1,123** structured ingredient rows and every decoded JSON string for `canned salmon`, `canned pink salmon`, `canned sockeye salmon`, `saumon en conserve`, `saumon en boîte`, `tinned salmon`, `salmon in a can`, and `canned fish`; it found **zero matching recipe files and zero matching ingredient rows**. One recipe ingredient contains the word salmon: recipe 077 line 10 requests `675 g salmon fillets without skin, cut into cubes` and links to `ingredient-ref-salmon-fillets-without-skin`. It gives no canned state and stays unchanged. [A01]

## Forms, numeric evidence, and substitutions

- **Forms and mappings:** None of the 119 active forms belongs to a salmon reference. The raw salmon identities have null default densities and empty unit mappings. Add no form or mapping to the proposed row or a raw/species row.
- **Source quantities:** The French Clover Leaf pink-salmon page reports a nutrition portion of `1/4 boîte (55 g)`. That is the named product’s nutrition basis, not a recipe measure, can yield, or drained conversion. The existing Health Canada CNF entries for pink code 3222 and sockeye code 3226 stay attached to their species records and exact salted/drained food states; they do not support one canned-salmon number. The Québec retail package sizes are SKU facts. Add no density, unit mapping, serving default, can conversion, drained-weight mapping, package yield, or recipe link. [S02–S04; reused CNF records]
- **Conversions:** No salmon-specific conversion or package-yield record exists. The shared package-yield file’s one record is for canned black beans. Add no salmon conversion or yield.
- **Substitutions:** The global and contextual substitution files each contain zero rules, and the corpus supplies no dish or method context. Add no substitution between canned salmon, raw salmon, salmon species, smoked salmon, canned tuna, canned sardines, or composite salmon products.

## Proposed delta

Integrated identity-only reference:

```json
{
  "id": "ingredient-ref-canned-salmon",
  "nameFr": "saumon en conserve",
  "nameEn": "canned salmon",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "PROTEIN"
}
```

The ledger record has `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. It records the bounded canned-salmon product identity and the sources below. Add no aliases, form, species assignment, legacy mapping, recipe link, numeric value, conversion, yield, or substitution.

## Source register

New sources were accessed on 2026-10-16. S01–S05 are allocated to the integrated ledger record; A01 remains a proposal-local audit label. Existing sources are explicitly marked reused.

| ID | Source | Supports and limits |
|---|---|---|
| **WP04-SECTIONP-CANNED-SALMON-R172-20261016-S01** | FAO/WHO Codex Alimentarius, [Standard for Canned Salmon, CXS 3-1981](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B3-1981%252FCXS_003e.pdf), current version amended 2026, §§2 and 7. | Defines canned salmon across seven named species, commercial-sterility process, product presentations, and packing-medium labeling. International product-standard evidence only; it is not Canadian law or a universal species/medium assignment. |
| **WP04-SECTIONP-CANNED-SALMON-R172-20261016-S02** | Maxi Québec, [Saumon en conserve](https://www.maxi.ca/fr/fr/alimentation/garde-manger/produits-en-conserve-et-marin-s/saumon-en-conserve/c/29699), category heading and listed products. | Uses the exact Québec category wording and groups pink and sockeye salmon products. Retail category evidence; its item amounts and package descriptions remain SKU-specific. |
| **WP04-SECTIONP-CANNED-SALMON-R172-20261016-S03** | Clover Leaf, [Flaked Pink Salmon — Skin & Bones Removed](https://www.cloverleaf.ca/en/products/flaked-pink-salmon-skin-bones-removed/), product description. | Current Canadian maker page describes a canned pink-salmon product packed in water and sold flaked/chunked without skin or bones. This presentation and its 142 g can are product-specific. |
| **WP04-SECTIONP-CANNED-SALMON-R172-20261016-S04** | Clover Leaf, [Saumon rose Clover Leaf](https://www.cloverleaf.ca/fr/produits/saumon-rose-clover-leaf/), French product description and nutrition panel. | Current French maker page describes whole pink salmon with skin and bones and lists the nutrition basis as 1/4 boîte (55 g). This portion and presentation do not establish a general measure or yield. |
| **WP04-SECTIONP-CANNED-SALMON-R172-20261016-S05** | Clover Leaf, [De quelle façon prépare-t-on les produits de la mer en conserve?](https://www.cloverleaf.ca/fr/nutrition-et-inspiration/nutrition/de-quelle-facon-prepare-t-on-les-produits-de-la-mer-en-conserve-aucun-agent-de-conservation-nest-requis/), sections on sealed-can heat treatment and salmon in water. | Manufacturer explains its canned-seafood process and identifies canned salmon among its products. Supports finished-product state only; it is company-level information, not a universal recipe, safety instruction, or conversion. |
| **Reused `WP04-SALMON-TUNA-BOUNDARY-20261011-S01`** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Existing source ID and URL owner. Fish common-name guidance ties species labels to CFIA Fish List entries; the proposed app search group does not authorize a package label or identify a fish species. |
| **Reused `WP04-SECTIONP-PINK-SALMON-R103-20261014-S09`** | Health Canada, [CNF food code 3222: salted canned pink salmon](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3222). | Existing ledger source on `ingredient-ref-pink-salmon`; quantities remain limited to that named canned pink-salmon code and state. No new source record or value is proposed. |
| **Reused `WP04-SECTIONP-SOCKEYE-SALMON-R105-20261014-S08`** | Health Canada, [CNF food code 3226: canned sockeye salmon, drained solids with bone, unsalted](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=3226). | Existing ledger source on `ingredient-ref-sockeye-salmon`; quantities remain limited to that drained, unsalted sockeye code. No new source record or value is proposed. |
| **WP04-SECTIONP-CANNED-SALMON-R172-20261016-A01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5925), active [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), package yields, substitution data, [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), all manifest-listed recipe files, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and the proposal/batch archive. | Exact-key, source-ID/URL ownership, picker projection, recipe-demand, form/numeric, and substitution checks described above. Audit label only; not a ledger source record. |

## Final disposition

**Integrate** `ingredient-ref-canned-salmon` as identity-only `canned salmon / saumon en conserve`. Keep it separate from raw salmon, all salmon species, and smoked salmon. Current official product-scope and Québec retail evidence support the bounded product group, while the picker currently has no result for either exact bilingual phrase. Keep species, presentation, packing medium, recipe amounts, drained state, and package quantities product-specific. Add no aliases, forms, measures, conversions, yields, recipe links, or substitutions.
