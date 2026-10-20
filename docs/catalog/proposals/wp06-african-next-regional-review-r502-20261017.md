# WP06 African next regional review — waterleaf — R502

**Status:** Proposal only. No catalog, ledger, recipe, plan, roadmap, workflow, generated file, or code was changed.

**Review date:** 2026-10-17

**Candidate:** edible leaves sold as waterleaf, accepted taxon *Talinum fruticosum* (synonym *Talinum triangulare*)

## Recommendation

Add one identity-only leafy vegetable reference, scoped to the food product called waterleaf in West African cooking and Canadian African-food retail:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-waterleaf-talinum-fruticosum` |
| English display | `waterleaf (Talinum fruticosum)` |
| French display | `water leaf (Talinum fruticosum)` (borrowed Québec-facing retail wording; provisional, not an OQLF term) |
| Category | `VEGETABLE_AND_AROMATIC` |
| English aliases | `water leaf`; `Talinum triangulare` |
| French aliases | `waterleaf`; `Talinum triangulare` |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` |
| Forms and other numeric behavior | None |

Use Kew’s accepted name in the ID and qualified display. Keep the product-label synonym *Talinum triangulare* searchable because Ghanaian and Canadian sources use it. Retain only the attested spacing variants `waterleaf` / `water leaf`; do not add source-local names as global aliases. The picker context is food ingredients; this is not a general botanical claim that every plant called “waterleaf” is *Talinum*.

The identity is for edible leaves, not the entire plant, fruit, seed, or a prepared soup. Do not add a fresh/frozen form, density, household measure, mapping, conversion, package yield, recipe link, or substitution. Retail package choices and the research papers’ nutrient/composition results are not reusable recipe conversions.

## Why this is an unresolved African regional gap

The bundled reference catalog has no waterleaf or *Talinum* identity. Regional evidence identifies waterleaf as a leafy food in Ghana and Nigeria; a French-facing Canadian farm listing identifies the product as *T. triangulare* and describes its Nigerian and Cameroonian soup use. A Longueuil African-grocery page also lists `Waterleaf` in French-facing retail material. These establish a bounded food identity and a Québec-accessible naming basis.

This is not a claim that *T. fruticosum* originated in Africa. Kew gives its native range as tropical and subtropical America. The recommendation concerns documented West African food use and African-food retail. The Ghana paper describes the vegetable as “indigenous,” but that characterization is not adopted here.

The candidate is distinct from `ingredient-ref-water-spinach` (*Ipomoea aquatica*), ordinary spinach, Malabar spinach, jute leaves, molokhia, moringa leaves, cassava leaves, African basil leaves, ugu leaves, gboma leaves, and dried Gnetum leaves. In particular, the older tropical-leafy-greens review excluded generic `waterleaf` as a water-spinach alias; this proposal preserves that decision and assigns the food name to a separate *Talinum* identity. See the [tropical leafy-greens review](wp06-tropical-leafy-greens-boundaries-20261009.md), [African cuisine gap sweep](wp06-african-cuisine-gap-sweep-20261010.md), and [R499 African review](wp06-african-next-regional-review-r499-20261017.md). The wider African parent remains open.

## Current catalog, legacy, and ledger audit

Read-only audit covered the live references, forms, legacy candidates, research ledger, manifest, current search implementation, prior WP06 African reviews, all proposal/batch Markdown, and the 114 manifest-listed recipes. Snapshot fingerprints:

| Surface | Current count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,781 references | `0789eeee3627a6c9cb5814e284d27a8c51486337698693bd5fbcc76d2ce35bd8` |
| `ingredient-forms.v1.json` | 143 forms | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| `legacy-import-identities.v1.json` | 56 candidates | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,139 records; 9,794 source entries | `9021ec38d5f79b9895bbbdb54dbf5cb40cfa2e3768fe3dbf5a74b962663ddfee` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The proposed reference ID, a matching legacy candidate ID, and source-ID prefix `WP06-AFRICA-WATERLEAF-R502-20261017-S` are unowned. Normalized exact/phrase checks across active reference labels and aliases, form labels and match terms, and all legacy names and aliases found no owner for `waterleaf`, `water leaf`, *Talinum fruticosum*, *T. triangulare*, `Lagos bologi`, `bologi`, `Bokoboko`, `gbure`, `efo gbure`, or the proposed ID. `water spinach` remains owned by `ingredient-ref-water-spinach`; it is a separate species and remains unchanged.

The only prior archive hit for `waterleaf` is the cited tropical leafy-greens packet. It lists `waterleaf` as a phrase not to attach to water spinach and does not review or add a *Talinum* food identity. No focused waterleaf / *Talinum* identity proposal or integration batch was found. The recent African reviews R478 (baobab leaf powder), R481 (dried Gnetum leaves), R484 (grains of Selim), R487 (ugu leaves), R490 (shiro powder), R493 (calabash nutmeg), R496 (African basil leaves), and R499 (gboma leaves) cover separate identities.

The ledger currently has 8,289 distinct source IDs and 7,001 distinct URLs. Its source-ID-to-URL audit found no ID assigned to multiple URLs. Each proposed R502 source ID below is new and has exactly one URL; each listed URL is currently unowned, so no existing source record needs to be duplicated or reassigned. The prior water-spinach evidence remains under `WP06-TROPICAL-LEAFY-GREENS-20261009-S01` through `S05`; those source IDs and URLs are not reused here.

## Taxonomy, naming, and alias boundaries

Kew accepts *Talinum fruticosum* and records *T. triangulare* as a synonym. The regional and Canadian food sources use the synonym. Keep both names on one species-scoped identity; do not create a second row or treat one as a different preparation.

The Québec-facing farm page’s rendered French product title is `Water leaf Frais`, and its French copy calls the food `water leaf` and gives *T. triangulare*. Its metadata/search title also contains `Feuilles d'eau`, but that wording is attested only in this retailer title. Do not select `Feuilles d'eau` as a catalog display or global alias: the wording is retailer-specific, and no Québec terminology source supports generalizing it. A Longueuil African-grocery page uses `Waterleaf`. No OQLF French culinary term was located. The proposed French display therefore retains the borrowed French-facing retail spelling and remains provisional. TERMIUM’s `waterleaf` / `water-leaf` entry applies to *Hydrophyllum*, with French `hydrophylle`, so it is evidence of an outside-food botanical name collision, not a translation for *Talinum*. The proposed taxon-qualified display makes the culinary record’s scope visible.

| Phrase | Treatment | Reason |
|---|---|---|
| `waterleaf` | English display; French search alias | Regional food-name and current Canadian African-food retail evidence. The food picker has no competing active identity. |
| `water leaf` | French display; English search alias | Directly attested on a French-facing Canadian product page and supported by regional food sources. This is a borrowed retail term, not an OQLF-approved French translation. |
| *Talinum fruticosum* | Accepted taxon in both display qualifiers | Kew’s current accepted name; the qualifier prevents the display from appearing to assert a broad plant-family identity. |
| *Talinum triangulare* | English and French search alias | Synonym confirmed by Kew and used on the Canadian product page and regional food studies. |
| `Feuilles d'eau` | Evidence only; no display or global alias | Attested in one retailer metadata/search title; rendered French product copy uses `water leaf`, and no Québec terminology source supports generalizing the retailer-specific wording. |
| `Bokoboko`, `Lagos bologi`, `efo gbure`, `gbure`, and other local names | Evidence only; no aliases | Source-specific regional, language, or retailer-title names; the catalog has no locality/language scope for them, and the waterleaf display already supports basic search. |
| `water spinach`, `épinard d’eau`, generic `spinach`, and *Ipomoea aquatica* | Keep on the existing separate water-spinach identity | Distinct taxon and source-named crop; do not attach these names to waterleaf. |
| `Hydrophyllum`, `hydrophylle`, `Surinam purslane`, `pourpier`, and `pourpier de Suriname` | Do not add | Botanical or broader common names that are not Québec food names for this item; some overlap other plants or culinary products. |
| Fresh, frozen, chopped, dried, or cooked | No forms proposed | Current product examples show differing seller states, but no form/conversion scope is established for the catalog. |

### Picker projection

Projection uses current `normalizeIngredientSearchKey` and `IngredientReferenceSearchIndex` behavior, with the proposed names and aliases and no form. Exact phrase matching is preferred before substring fallback.

| Query | Current result | With proposal |
|---|---|---|
| `waterleaf` | No result | One result: proposed *Talinum* waterleaf |
| `water leaf` | No result | One result: proposed *Talinum* waterleaf |
| `Talinum fruticosum` | No result | One result: proposed *Talinum* waterleaf |
| `Talinum triangulare` | No result | One result: proposed *Talinum* waterleaf |
| `water spinach` / `épinard d’eau` | Existing water-spinach row | Same existing water-spinach row; waterleaf is not pulled in |
| `gbure`, `bologi`, `Hydrophyllum`, `hydrophylle` | No result | Still no result; intentionally not assigned |
| `water` | 12 partial results | 13 partial results, including waterleaf; broad query remains multi-result |

These are static search projections against the current references/forms and the proposed terms, not a runtime picker test.

## Recipe scan and fingerprint

The manifest lists 114 recipe files. A read-only parse found 1,123 ingredient rows and 753,988 recipe-file bytes. The corpus fingerprint is SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`, computed in manifest order over each relative recipe path, NUL, exact file bytes, and NUL.

Case-folded, accent/punctuation-normalized whole-phrase checks across every manifest recipe and ingredient row searched `waterleaf`, `water leaf`, *Talinum fruticosum*, *T. triangulare*, `Lagos bologi`, `bologi`, `Bokoboko`, `gbure`, `efo gbure`, and *Hydrophyllum canadense*. Results: zero candidate-related recipe hits, zero ingredient-row hits, and no recipe links or recipe-line replacements proposed. This is a result for this bundled snapshot, not a statement about broader recipe use.

## Source register

All sources were checked on 2026-10-17. The assigned source ID is the sole ID for the URL shown here; proposal-only IDs have not been added to the ledger.

| Source ID | Source | Claim used and evidence limit |
|---|---|---|
| `WP06-AFRICA-WATERLEAF-R502-20261017-S01` | Royal Botanic Gardens, Kew, [Plants of the World Online: *Talinum fruticosum*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:1182764-2/general-information). | Accepts *T. fruticosum*, lists *T. triangulare* as a synonym, and includes `water leaf` among common-name data under the synonym; gives the native range as tropical and subtropical America. Taxonomic boundary only; not African food-use or Québec naming evidence. |
| `WP06-AFRICA-WATERLEAF-R502-20261017-S02` | FAO, [Food Composition Table for Use in Africa, Talinum entry](https://www.fao.org/4/X6877E/X6877E24.htm). | Lists *Talinum triangulare*, common names including `waterleaf` and `Lagos bologi`, and raw leaves as food code 633. Regional food-composition reference, not a culinary translation standard or active measurement source. |
| `WP06-AFRICA-WATERLEAF-R502-20261017-S03` | Kwenin, Wolli, and Dzomeku, [“Assessing the nutritional value of some African indigenous green leafy vegetables in Ghana”](https://m.elewa.org/JAPS/2011/10.2/4.pdf), *Journal of Animal & Plant Sciences* 10(2), 2011, pp. 1300–1305, opening summary and methods. | Identifies `water leaf (Bokoboko)` as *T. triangulare*, a food leaf sampled in Ghana’s Ashanti Region, and lists it separately from cocoyam leaves, amaranth, and moringa. Use only its identity and food-use context; its “indigenous” wording is not adopted as a botanical-origin claim, and study composition values do not support recipe conversions. |
| `WP06-AFRICA-WATERLEAF-R502-20261017-S04` | Government of Canada, Translation Bureau, [TERMIUM Plus: Hydrophyllum entry](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=alt&lang=eng&srchtxt=HYDROPHYLUM). | Gives `waterleaf` / `water-leaf` for *Hydrophyllum* and French `hydrophylle`. Boundary evidence for a Canadian botanical homonym; it does not identify the edible *Talinum* product. |
| `WP06-AFRICA-WATERLEAF-R502-20261017-S05` | Green Focus Farms / Les Fermes Fondi, [French-facing `Water leaf Frais` product page](https://www.greenfocusfarms.ca/fr/products/water-leaf-frais). | The metadata/search title is `Waterleaf (Gbure / Feuilles d'eau) – Fresh African Greens | GFF Canada – Les Fermes Fondi`; the rendered French product title and copy use `Water leaf` / `water leaf`. The page identifies the product as *T. triangulare* and names Nigerian and Cameroonian cooking contexts. Direct Canadian retail naming and product evidence; not a terminology ruling. Its metadata-title wording `Feuilles d'eau` is retailer-specific and is not generalized as a catalog display or alias. The page’s sold-out status and package options are SKU-specific and do not establish availability or conversions. |
| `WP06-AFRICA-WATERLEAF-R502-20261017-S06` | Green Focus Farms / Les Fermes Fondi, [FAQ and farm locations](https://www.greenfocusfarms.ca/pages/faq). | Identifies the same Canadian seller’s Ontario and Québec farm/pickup locations and lists water leaf among African vegetables. Seller-context support only; not additional species or recipe evidence. |
| `WP06-AFRICA-WATERLEAF-R502-20261017-S07` | Distributeur Blais, [Longueuil African-grocery page](https://www.distributeurblais.com/epicerie-africaine-longueuil). | A French-facing Longueuil retailer lists `Waterleaf` among its African grocery products. Supports local spelling and retail context only; the page does not identify the species or establish an official Québec French term. |

## Evidence limits and integration boundary

The papers support a food identity, not a nutrition claim, health benefit, preparation instruction, density, volume conversion, count weight, or cooking yield. The Canadian page’s package options and freshness notes are product-specific. No source supports a substitution with water spinach, ordinary spinach, or another leafy vegetable. Keep those fields unknown, and do not infer a value from other leafy greens.

If the integration owner approves this proposal, add only the identity reference and evidence ledger records. Keep the provisional French borrowing explicit and retain the accepted-taxon / synonym distinction. Do not alter other African identities, the water-spinach aliases, recipes, forms, numeric data, or substitution rules. No tests, build, emulator, or deployment were run for this proposal-only review.
