# WP03 Section F: kaniwa grain identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as identity-only `ingredient-ref-kaniwa`; the shared catalog, ledger, generated catalog, plan, roadmap, and integration README now record the accepted result. No app or emulator tests were run for this database-JSON addition.
- **Scope:** The whole edible seed/grain called kaniwa or canihua, *Chenopodium pallidicaule*. This review addresses the missing grain identity and its boundary from quinoa; it does not cover kaniwa flour, puffed kaniwa, or a prepared recipe.
- **Plan location:** The Section F checklist leaves species-level grain coverage and regional cereal products open ([global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1983)). A separate WP02 flour review cites the OQLF kaniwa entry only to keep kaniwa terms off quinoa-flour aliases; it does not propose or review a whole-grain identity ([quinoa/amaranth flour review](wp02-a6-quinoa-amaranth-flour-identity-review-20261011.md#L82)).
- **Accepted decision:** Add `ingredient-ref-kaniwa` as **`kaniwa seeds / graines de kaniwa`**, category `GRAIN_AND_CEREAL`, with only the exact French alias `canihua`. Keep `baby quinoa` / `bébé quinoa` out of aliases and preserve a separate boundary from quinoa.

## Identity and picker boundary

The OQLF's GDT entry defines kaniwa as a small, dark-red seed cultivated in the Andes, gives *Chenopodium pallidicaule*, and lists **kaniwa** and **canihua** as preferred French terms. Its English term list includes `kaniwa`, `canihua`, `cañihua`, `kañiwa`, and `baby quinoa`. The same entry discourages French **bébé quinoa** because it competes with the French term already in use and can confuse kaniwa with quinoa, which comes from a different plant [S01]. The OQLF's separate quinoa entry identifies *Chenopodium quinoa* and calls quinoa a pseudocereal [S02].

Current Canadian commercial wording supports the product display. Montréal-based Yupik currently lists the same SKU as **Kaniwa Seeds** in English and **Graines de Kaniwa** in French; its French ingredient declaration says `Canihua` [S03–S05]. Tootsi's 2026 Canadian catalog also shows **Kaniwa seeds / Graines de kaniwa** in its bilingual grains-and-seeds section [S06]. These are product and market-name attestations, not a claim that the imported grain is grown or processed in Canada.

| Integrated field | Accepted value |
|---|---|
| ID | `ingredient-ref-kaniwa` |
| English display | `kaniwa seeds` |
| Québec French display | `graines de kaniwa` |
| Category | `GRAIN_AND_CEREAL` |
| English aliases | None |
| French aliases | `canihua` |
| Forms and recipe links | None |
| Default density and unit mappings | None |

Use the market-attested bilingual display while preserving the OQLF term `kaniwa` within both labels. The repo's picker indexes both localized names and aliases in either UI language; accent-folded `cañihua` normalizes to the supported `canihua` key, and `kañiwa` normalizes to `kaniwa`. Do not store duplicate orthographic aliases for those normalized keys. Do not add `baby quinoa` or `bébé quinoa`: beyond the OQLF's warning, a query for `quinoa` is a complete word phrase within the longer alias `baby quinoa`, so the current picker would also return kaniwa for a broad quinoa query. Keep the exact query `canihua` available through its one alias and do not make `quinoa` an alias.

The existing white- and black-fonio identities remain separate. In particular, do not move `fundi` or `findi` from the white-fonio row to kaniwa: they are not listed on the OQLF kaniwa entry. Keep quinoa grain, quinoa flour, quinoa flakes, and puffed quinoa as their own identities. The prior WP02 flour proposal's statement that kaniwa names must not alias to quinoa flour remains correct; this proposal fills the distinct whole-grain gap only.

## Live ownership and phrase audit

The following is the proposal-time, pre-integration snapshot. Exact phrase ownership used the repository's `normalize_search_key` implementation, including accent and punctuation folding, across all active reference string fields, form string fields, and legacy-candidate string fields. See the [integration README](../batches/wp03-wp04-kaniwa-atlantic-wolffish-integration-20261012/README.md) for the current post-integration snapshot.

| Surface | Live state |
|---|---|
| Active ingredient references | 1,256 references, including 117 in `GRAIN_AND_CEREAL`. Before integration, no reference owned `kaniwa`, `canihua`, `cañihua`, `kañiwa`, `baby quinoa`, `bébé quinoa`, `kaniwa seeds`, `graines de kaniwa`, `Chenopodium pallidicaule`, or the proposed ID. |
| Adjacent quinoa reference | `ingredient-ref-quinoa`, `quinoa / quinoa`, `GRAIN_AND_CEREAL`; aliases empty, density null, unit mappings empty. The separate forms `ingredient-form-quinoa-dry` and `ingredient-form-quinoa-cooked` belong to this row only. The bare exact key `quinoa` remains owned by it. |
| Other adjacent active rows | `ingredient-ref-quinoa-flour` (`FLOUR_AND_STARCH`), `ingredient-ref-quinoa-flakes`, and `ingredient-ref-puffed-quinoa` (`GRAIN_AND_CEREAL`) retain their own processed-product names. None owns a kaniwa phrase or form. |
| Ingredient forms | 94 total; no form ID, label, or match term owns a kaniwa phrase. No form is proposed. |
| Legacy import identities | 66 candidates; no exact candidate phrase or proposed ID is present. |
| Research ledger | 1,565 records, 5,477 source entries, and 4,515 distinct source IDs. Before integration, no `ingredient-ref-kaniwa` or `candidate-kaniwa` record, source entry, exact phrase owner, or proposed source ID was present. The WP02 flour proposal was the only earlier focused document found that mentioned kaniwa; it used the OQLF distinction to reject quinoa-flour aliases and did not allocate a grain row. |

The exact-key set checked included `kaniwa`, `canihua`, `cañihua`, `kañiwa`, `baby quinoa`, `bébé quinoa`, `kaniwa seed(s)`, `graines de kaniwa`, `graines de canihua`, `Chenopodium pallidicaule`, and the proposed ID. All had zero exact owners in active references, forms, legacy candidates, and ledger records. The separately checked bare key `quinoa` is intentionally not a candidate key and remains on `ingredient-ref-quinoa`.

## Bundled recipe demand

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned using the candidate phrase set above, including accent-folded terms and the scientific name. The audit found zero recipe-file hits and zero ingredient-row hits for kaniwa/canihua or its listed aliases. Existing quinoa recipe use does not establish kaniwa demand, a recipe link, or interchangeability. No recipe change or reference link is proposed.

## Numeric, form, and substitution limits

Yupik's one current package page shows a product-specific `1/2 cup (100 g)` nutrition serving, a suggested 2:1 kaniwa-to-water preparation ratio, a 15–20 minute cooking description, and says the grain can be popped [S03–S04]. These statements do not establish a general cup mass, density, household measure, cooking yield, universal dry/raw or cooked form, or a distinct puffed-kaniwa catalog identity. The page does not specify a transferable measuring or cooking method. Keep all such numbers and process claims out of reusable catalog data.

The retailer's description of kaniwa as close to quinoa or as “the new quinoa” is product marketing, not a recipe-tested substitute relationship. OQLF explicitly distinguishes the plant species [S01–S02]. The integrated row has no global or contextual substitution rule, no quinoa form conversion, no unit mapping, and no recipe-specific replacement claim. Its ledger record retains the product-specific 1/2-cup, 100-g nutrition serving as one observation; it does not establish a general measure or density.

## Source register and ledger disposition

These source IDs were checked absent from the live ledger and repository documents before drafting. Pages were reviewed online on 2026-10-12. Sources S01–S05 now appear in the integrated ledger record; S06 remains proposal evidence and was not copied into the ledger.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP03-KANIWA-GRAIN-20261012-S01` | Office québécois de la langue française, [kaniwa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532687/kaniwa), GDT, last updated 2015. | Authoritative Québec terminology; defines the edible seed, gives *Chenopodium pallidicaule*, prefers French `kaniwa` and `canihua`, lists English variants, and discourages French `bébé quinoa`. The entry does not specify a commercial package, measure, or cooking behavior. |
| `WP03-KANIWA-GRAIN-20261012-S02` | Office québécois de la langue française, [quinoa](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa), GDT, updated 2025. | Identifies quinoa as *Chenopodium quinoa* and explains its pseudocereal use. Supports the separate-species boundary; it does not define kaniwa. |
| `WP03-KANIWA-GRAIN-20261012-S03` | Yupik, [Kaniwa Seeds, SKU P20072](https://yupik.com/en/kaniwa-seeds-p20072), current English product page. | Names a currently listed single-ingredient product `Kaniwa Seeds`, gives ingredient `Kaniwa`, origin Peru, and source-specific package/cooking statements. Product copy is not a general specification; no country-of-origin or processing claim is transferred to the catalog identity. |
| `WP03-KANIWA-GRAIN-20261012-S04` | Yupik, [Graines de Kaniwa, SKU P20072](https://yupik.com/fr/kaniwa-seeds-p20072), current French product page. | Same SKU is titled `Graines de Kaniwa`, lists `Canihua` as its ingredient, and is currently shown in stock. Attests Québec-facing bilingual product wording and the `canihua` spelling; its serving and cooking statements remain product-specific. |
| `WP03-KANIWA-GRAIN-20261012-S05` | Yupik, [About us](https://yupik.com/en/about-us) and [contact](https://yupik.com/contact/). | First-party pages identify the vendor as a Canadian family-owned company and list its Montréal address. They establish Canadian/Québec market context, not that the Peruvian-origin kaniwa itself is grown or processed locally. |
| `WP03-KANIWA-GRAIN-20261012-S06` | Tootsi, [Canada Catalog 2026, page 59](https://tootsi.com/pdf/e-catalog-canada/files/basic-html/page59.html), product code 20072. | Current Canadian trade catalog lists `Kaniwa seeds / Graines de kaniwa` under grains, seeds, and rice, with a 10 kg trade pack. The pack size is not a household measure or serving. This is supplier catalog evidence, not an independent botanical or terminology authority. |

## Disposition

**Integrated `ingredient-ref-kaniwa` as identity-only `kaniwa seeds / graines de kaniwa` in `GRAIN_AND_CEREAL`, with only the OQLF-listed French alias `canihua`.** The OQLF establishes the Québec term and distinct species, while Canadian/Québec product listings attest the bilingual grain product. `baby quinoa` / `bébé quinoa`, flour, puffed products, forms, reusable measures, densities, conversions, yields, recipe links, and substitutions remain outside the row. The lack of bundled recipe demand does not erase this source-backed global identity gap. See the [integration record](../batches/wp03-wp04-kaniwa-atlantic-wolffish-integration-20261012/README.md).
