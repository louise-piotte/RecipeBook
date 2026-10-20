# WP03 Section F R696: Little Millet Picker Boundary Review — 2026-10-18

## Review record

- **Status:** Held at integration on 2026-10-18 because the proposed shared exact aliases violate the seed package’s unique normalized-name invariant. No catalog, form, ledger, recipe, manifest, or generated file was changed. See the [R695–R697 integration README](../batches/wp02-wp03-wp04-r695-r697-gap-review-integration-20261018/README.md).
- **Open item:** Section F still has species-level grain coverage underway. The existing `candidate-little-millet` remains held in the research ledger, with no active reference.
- **Prior decisions:** R10 held the grain identity pending French evidence. R15 added direct Canadian French evidence for *petit millet* but kept the grain and companion flour held because a `petit mil` query would hit `petit millet` through substring fallback and hide the other OQLF-backed millet choices. R696 resolves that exact picker boundary for the grain only; it does not reopen the flour candidate.
- **Recommendation:** Add the identity-only `little millet / petit millet` grain row and add the exact French alias `petit mil` to the three existing OQLF-backed generic, foxtail, and pearl millet rows. The alias distribution makes both French queries return the intended choices under the current picker.

## Evidence and naming boundary

| Evidence | What it supports | Limit |
| --- | --- | --- |
| FSSAI, [Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 (2025-05-07), §23, PDF p. 17; existing source `WP03-LITTLE-MILLET-20261010-S01`. | The cereal standard covers whole or dehulled millets and separately lists Little Millet (Kutki), *Panicum sumatrense*. | Does not establish a recipe measure, household density, or a standardized retail polishing state. |
| Agriculture and Agri-Food Canada, [Pleins feux sur le mil](https://agriculture.canada.ca/fr/science/science-racontee/realisations-scientifiques-agriculture/pleins-feux-mil), rechecked 2026-10-18; existing source `WP02-A6-LITTLE-MILLET-20261013-R15-S01`. | The French page directly names **le petit millet (*Panicum sumatrense*)**. This is an attested Canadian French name for the exact species; the page is a federal science article, not an OQLF preferred-term ruling. | Use the source wording without describing it as an OQLF-approved term. The page shows a last-modified date of 2023-01-27. |
| Ceylon Groceries, [Little Millet Rice | சாமை | *Panicum sumatrense* – Polished 2lbs](https://ceylongroceries.com/products/little-millet), current Canadian product listing, checked 2026-10-18; existing source `WP03-LITTLE-MILLET-20261010-S03` currently owns the earlier collection-route URL. | A current Canadian grain product is labelled Little Millet, paired with Tamil *samai* and the species name, and described as polished. FSSAI independently names *kutki* for this grain. | This retailer title is source wording, not a reason to alias rice or infer a generic grain-processing form. Its package weight is not a recipe conversion. |
| OQLF, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), [millet des oiseaux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), and [millet perle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle), existing sources `WP03-LITTLE-MILLET-20261010-S04` through `S06`, rechecked 2026-10-18. | The generic entry lists `petit mil` and says generic *millet* groups several species; the foxtail and pearl entries separately list `petit mil`. | These Québec entries do not identify *Panicum sumatrense* as `petit mil`; keep that term on the three existing owners instead of adding it to Little Millet. |

The display pair is therefore **little millet / petit millet**. The French display uses AAFC's exact species-qualified wording. Do not substitute the shorter `petit mil`, whose OQLF usage spans the generic millet grouping, foxtail millet, and pearl millet.

## Active ownership and picker projection

Before R695 and R697 integration, the split package had **1,838 references** and **172 forms**, and the ledger had **2,219 records**. No active reference, form, or ledger record owns `ingredient-ref-little-millet`; the ID appears only as an unallocated proposal in R10 and R15. The existing `candidate-little-millet` is `needs_clarification`; its measurement state is `researched_no_supported_value`, and substitution research remains `not_yet_researched`.

| Existing owner | Current fields relevant to the proposal | Bounded change |
| --- | --- | --- |
| `ingredient-ref-millet` | `millet / millet`; `GRAIN_AND_CEREAL`; no aliases; null density and empty unit mappings. One unrelated generic cooked-millet form remains attached. | Add French alias `petit mil`; preserve the cooked form and all other fields. |
| `ingredient-ref-foxtail-millet` | `foxtail millet / millet d'Italie`; English aliases `thinai`, `kangni`, `korra`, `rala`, `navane`, `kakum`, `kakun`, `kangani`, `kauni`, `kaon`; no French aliases; null density and empty unit mappings. | Add French alias `petit mil`; preserve all current fields. |
| `ingredient-ref-pearl-millet` | `pearl millet / millet perlé`; English aliases `bajra`, `bajri`, `sajjalu`, `kambu`, `sajje`; no French aliases; null density and empty unit mappings. | Add French alias `petit mil`; preserve all current fields. |

`IngredientReferenceSearchIndex` checks complete normalized word phrases before partial substring fallback. The projection below applies that current behavior over the live package. A Little Millet row by itself is insufficient: `petit mil` does not match the complete phrase `petit millet`, then substring fallback returns Little Millet alone. Adding the three exact OQLF aliases creates exact matches for `petit mil`, so that query returns the existing choices before fallback runs.

| Query | Current result | New row alone | Full proposal |
| --- | --- | --- | --- |
| `little millet` | No result | Little Millet | Little Millet |
| `petit millet` | No result | Little Millet | Little Millet |
| `petit mil` | No result | Little Millet only (unsafe substring fallback) | Foxtail Millet, generic Millet, and Pearl Millet |
| `kutki` / `samai` | No result | Little Millet | Little Millet |
| `millet` | 20 existing results | 21 including Little Millet | 21 including Little Millet |
| `mil` | 5 existing results | 5 existing results | 8, including the three OQLF-backed owners |
| `little millet rice` | No result | No result | No result |

`rice` stays unchanged: no rice wording is added to the new row. The full phrase `little millet rice` remains product wording only, and the new row has no form, so no form hint is introduced.

## Full recipe-demand audit

The manifest lists **114 recipe files** with **1,123 ingredient rows**. Every manifest-listed recipe was scanned across all string fields and ingredient rows for `little millet`, `little millet rice`, `Panicum sumatrense`, `kutki`, `samai`, `saamai`, `petit millet`, `petit mil`, and the proposed reference ID. There were **zero recipe-file hits and zero ingredient-row hits**. Add no recipe link or recipe-text edit.

## Proposed data delta

Add one identity-only reference:

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-little-millet` |
| English / French display | `little millet` / `petit millet` |
| English aliases | `kutki`, `samai` |
| French aliases | none |
| Category | `GRAIN_AND_CEREAL` |
| `defaultDensity` / `unitMappings` | `null` / `[]` |

On the existing references, append only `petit mil` to `aliasesFr` for `ingredient-ref-millet`, `ingredient-ref-foxtail-millet`, and `ingredient-ref-pearl-millet`. For any accepted alias decisions, cite the already registered OQLF `S04` on generic millet, `S05` on foxtail millet, and `S06` on pearl millet. For the identity decision, reuse the existing FSSAI `S01`, AAFC English `S02`, Canadian product `S03`, and AAFC French `WP02-A6-LITTLE-MILLET-20261013-R15-S01`. If integrated, update `S03` from its earlier collection-route URL to the current canonical product URL linked above rather than creating a duplicate source record. The canonical URL is not otherwise assigned in the ledger or proposal/batch archive; the proposed reference ID and R696 filename are also free.

Promote the existing ledger record by changing `recordId` from `candidate-little-millet` to `ingredient-ref-little-millet`, `recordType` from `candidate` to `ingredient_reference`, and `identityState` from `needs_clarification` to `verified`. Retain `researched_no_supported_value` for measurement and `not_yet_researched` for substitutions; append the accepted identity decision and source IDs rather than creating a duplicate candidate. Leave `candidate-little-millet-flour` held and unchanged. Add no forms, measures, density values, unit mappings, conversion, yield, recipe link, or substitution. Keep `Panicum sumatrense` as evidence only, and keep `rice`, `millet rice`, and `little millet rice` out of aliases.

**Proposal result:** The proposed bounded data delta would add Little Millet with `petit millet` display and `kutki` / `samai` aliases, then route `petit mil` to its three OQLF-backed existing owners.

## Integration result

Static package validation rejects repeated normalized names across active references. The requested `petit mil` aliases would create the same exact key on generic millet, foxtail millet, and pearl millet, so the proposal cannot be represented in the current JSON catalog while preserving the package invariant. Adding the Little Millet row alone would make substring fallback resolve `petit mil` only to Little Millet and repeat the misleading result this review is intended to prevent. Kept the existing Little Millet candidate and all active references unchanged pending a picker/catalog representation for ambiguous exact terms. No software tests or app changes were made; the hold required documentation only.
