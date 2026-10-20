# WP03 Section F — Telugu atukulu / flattened-rice alias review (2026-10-13)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** integrated on 2026-10-13; see `docs/catalog/batches/wp02-wp03-wp04-alias-identity-integration-20261013/README.md`.
- **Scope:** decide whether the bare Telugu product name `atukulu` merits one English-search alias on the existing flattened-rice reference. This review does not cover another regional name, rice color, grade, prepared dish, recipe, or cereal identity.
- **Plan context:** Section F keeps regional cereal mixes and preprocessed grains open ([active plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L2210), [continuation checkpoint](../../RecipeBook-global-ingredient-catalog-plan.txt#L9416)).
- **Prior hold:** the 2026-10-10 poha-thickness batch left `atukulu` pending a regional/product-scope review ([batch record](../batches/poha-thickness-synonyms-integration-20261010/README.md)). The 2026-10-12 `aval` review again named `atukulu` as unassigned; that proposal assigned only `aval` ([review](wp03-section-f-regional-cereal-mix-next-gap-review-20261012.md)). Neither prior record created an `atukulu` owner or allocated sources for it.

## Recommendation

**Integrate only bare `atukulu` as an English search alias on the existing `ingredient-ref-flattened-rice-poha` reference.** Keep the English display `flattened rice (poha)`, Québec French display `flocons de riz (poha)`, existing aliases, category, forms, and all numeric fields unchanged. Do not create a new reference, form, legacy candidate, or ledger record.

The official regional technical source identifies `atukulu` as the Telugu name for flaked rice, and Canada-facing indexed product listings pair it with poha or flattened rice. These sources support the broad processed-rice-flake family already owned by the catalog. They do not make `atukulu` a color, thickness, brand, or French-Canadian label, and they do not establish current stock.

| Field | Proposal |
| --- | --- |
| Existing reference | `ingredient-ref-flattened-rice-poha` |
| English display | Keep `flattened rice (poha)` |
| fr-CA display | Keep `flocons de riz (poha)` |
| English alias | Add only `atukulu` |
| French aliases | Keep `riz aplati` and `riz battu` unchanged |
| New reference, form, candidate, or recipe link | None |
| Category | Keep `GRAIN_AND_CEREAL` |
| Density, mappings, measures, conversions, yields, substitutions | None |

## Identity and product boundary

The *Handbook of Processing of Puffed & Flaked Rice*, hosted at niftem.ac.in and published under the Indian Institute of Food Processing Technology name, lists `atukulu` as Telugu under flaked rice. Canada-facing indexed listings also use `atukulu` for flattened-rice products: PushmyCart pairs it with white thick poha, and Silkrute pairs it with white poha / flattened rice. The regional-language source and the retailer wording independently support a product-family search alias for flattened rice.

The term is not color-specific. A separate indexed Silkrute listing also pairs `Atukulu` with red poha / flattened rice. That use does not justify assigning bare `atukulu` to the specialized red-rice-flakes reference or adding a red form. Map the unqualified regional name to the existing generic flattened-rice row, and retain `red rice poha` as the red-specific query. The catalog already permits generic product-family searches to coexist with color-qualified rows; for example, `poha` returns the generic flattened-rice, red-rice-flakes, and corn-poha references.

The sources are product naming and technical terminology evidence. They do not establish a single rice cultivar, bran level, color, parboiling method, flake thickness, or retail specification for every product called `atukulu`. No qualified phrase such as `white atukulu`, `red atukulu`, `thick atukulu`, or `atukulu upma` is proposed.

## Exact ownership and picker projection

A read-only normalized-key audit covered active reference names and aliases, form labels and match terms, legacy candidates, and the full research ledger. No exact normalized owner exists for `atukulu`, `atukula`, `atukulu upma`, `atukula upma`, or `atukulu poha`. The ledger contains no `atukulu` mention. Prior catalog records contain only the explicit pending-review mention described above. The four proposal-local source IDs below are unallocated in the ledger and proposal/batch archive as of this review.

Current ownership of the relevant rows is:

| Reference | Current search identity | Boundary |
| --- | --- | --- |
| `ingredient-ref-flattened-rice-poha` | `flattened rice (poha)` / `flocons de riz (poha)`; English aliases `beaten rice`, `flaked rice`, `rice flakes`, `chiura`, `aval`; French aliases `riz aplati`, `riz battu` | Appropriate owner for a bare regional rice-flake name. `defaultDensity` is null and `unitMappings` is empty. |
| `ingredient-ref-red-rice-flakes` | `red rice flakes` / `riz rouge aplati`; aliases `red rice poha` and `poha rouge` | Keep color-qualified red-poha queries here. Do not add bare `atukulu`. |
| `ingredient-ref-corn-poha` | `corn poha` / `poha de maïs`; maize-qualified aliases | Maize product; do not merge with rice flakes. |

Three existing generic poha forms remain attached to the flattened-rice row: thin, medium, and thick. Each has `densityGPerMl: null`; their form IDs and labels do not contain `atukulu`.

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes terms, returns complete phrase matches before trying substring fallback, and includes attached form terms. This is a static projection from the current code and JSON, not live picker QA.

| Query | Current projection | Projection with the proposed alias |
| --- | --- | --- |
| `atukulu` | No result | One result: `ingredient-ref-flattened-rice-poha` |
| `atukula` | No result | No result; this spelling is not proposed |
| `poha` | Three results: generic flattened rice, red rice flakes, and corn poha | Same three results |
| `red rice poha` | One result: `ingredient-ref-red-rice-flakes` | Same red-specific result |
| `rice flakes` | Three results: brown rice flakes, generic flattened rice, and red rice flakes | Same three results |

The exact alias would replace the empty result for `atukulu`; no unrelated substring result competes under the current phrase-first behavior. It does not change `poha`, `red rice poha`, or `rice flakes` results. A bare alias also does not establish that a white, red, thick, or thin product is intended; users must enter the available qualifier where the picker has one.

Keep `atukula` and dish phrases such as `atukulu upma` unassigned. In Telugu-language dish names, inflected wording can identify a preparation rather than a pantry ingredient; this review does not establish it as an ingredient synonym. No French alias is supported: none of the reviewed Canadian French sources uses `atukulu`, and the Canada-facing attestations are English product copy.

## Recipe-demand audit

A read-only scan parsed all manifest-listed recipe files and checked their serialized content and every ingredient row, including existing reference links. The search set included `atukulu`, `atukula`, `atukulu upma`, `atukula upma`, `atukulu poha`, `flattened rice`, and `poha`.

| Corpus measure | Result |
| --- | ---: |
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Candidate-phrase recipe files | 0 |
| Candidate-phrase ingredient rows | 0 |
| Existing links to `ingredient-ref-flattened-rice-poha` | 0 |
| Recipe-corpus fingerprint | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The fingerprint hashes each manifest-relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte in manifest order. The corpus provides no demand, amount, form-specific use, or recipe link for this alias.

## Measurement, density, and substitution limits

- **Density and household measures:** retain `defaultDensity: null` and `unitMappings: []` on the generic reference. The 500 g and 1 kg values in individual retailer listings are SKU package sizes, not portions or volume/mass observations.
- **Technical thickness and process yield:** NIFTEM's handbook separately reports industrial flake-grade thicknesses (thick about 1 mm, medium about 0.6 mm, thin 0.3–0.55 mm, and very thin below 0.3 mm) and a 55–70% flaked-rice yield that varies with paddy variety, quality, process, and flake type. These are technical process observations; they do not specify a household measure, density, or `atukulu` retail-grade mapping. Keep all three existing poha form densities null and add no conversion, cooking yield, or package-yield record. Reconcile those technical grade values with the existing generic form notes in a separate form-measurement review before changing them; this alias proposal does not establish a universal consumer cutoff.
- **Forms:** add no form. The alias names the same broad product family and does not identify color, thickness, cooking state, or a separate ingredient.
- **Substitution:** add no global or contextual substitution, conversion, or replacement ratio. The sources mention uses such as poha, upma, sweets, or snacks, but do not test interchangeability with another ingredient or establish a dish/method-specific replacement. The target ledger remains `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: blocked_pending_evidence`.

## Source register

The following proposal-local IDs were checked against all current ledger source IDs and catalog proposal/batch records. They are not ledger additions. Existing poha source IDs were not reused as direct evidence for `atukulu`.

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| `WP03-ATUKULU-20261013-S01` | Indian Institute of Food Processing Technology, PMFME, [Handbook of Processing of Puffed & Flaked Rice](https://niftem.ac.in/newsite/pmfme/wp-content/uploads/2022/07/Rice-Based-Product-Handbook.pdf), section 1.3.2, p. 16; thickness and field-yield tables, pp. 23–24. Hosted at niftem.ac.in; accessed 2026-10-13. | Technical handbook lists flaked rice names including `atukulu (Telugu)`. Its nearby process description covers soaking, roasting, flaking, sieving, and packing. The later thickness/yield tables are industrial technical data, not a household conversion or legal naming standard; they are not specific to a particular `atukulu` retail SKU. |
| `WP03-ATUKULU-20261013-S02` | PushmyCart, Canada-facing page, [Nutty Yogi Organic White Thick Poha](https://pushmycart.com/en-ca/products/nutty-yogi-organic-white-thick-poha), product description. Search-indexed 2026-10-13. | Product copy calls white poha flattened white rice and lists `atukulu` among other names. The indexed listing marks the product sold out; direct page fetch returned a cache miss. It does not establish current stock, generalize the white/thick qualifiers, or supply a cooking measure. |
| `WP03-ATUKULU-20261013-S03` | Silkrute Canada, [Organic Tattva Organic White Poha / Flattened Rice / Atukulu, 500 g](https://www.silkrute.ca/grocery/instant/poha/poha-500g-en/), indexed product title and Canada storefront details. Search-indexed 2026-10-13. | The Canada-facing indexed product title pairs white poha, flattened rice, and `Atukulu`. Direct page access returned HTTP 403. The listing's crawl age was four months, so it supports a historical product-title attestation, not current stock. The listed 500 g is package size only. |
| `WP03-ATUKULU-20261013-S04` | Silkrute Canada, [Organic Tattva Red Poha / Flattened Rice / Atukulu, 500 g](https://www.silkrute.ca/grocery/instant/poha/organic-tattva-organic-red-poha-health-food-flattened-rice-atukulu-enriched-with-dietary-fibers-and-nutrients-500-gram/), indexed product title and description. Search-indexed 2026-10-13. | The indexed title also applies `Atukulu` to a red-rice poha listing. This is useful evidence that the bare regional term does not encode rice color; it supports keeping red-specific identity separate. The direct page returned HTTP 403 and the listing's crawl age was three months; no current-stock claim is made. Its SKU size and red-product claims do not establish a universal specification. |

## Live baseline snapshot

Read-only snapshot refreshed on 2026-10-13. File hashes are SHA-256 over exact bytes. The recipe-corpus fingerprint uses the manifest-order path/NUL/file-bytes/NUL method stated above.

| Artifact | Current count/state | SHA-256 or fingerprint |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,336 references; 147 `GRAIN_AND_CEREAL` | `eac7ae7bb7910c493488c3141076f06ae618cad7f6053e7fc28ec39bebf96f3d` |
| `ingredient-forms.v1.json` | 98 forms; 3 attached to flattened rice/poha | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates; no exact `atukulu` owner | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,644 records; 6,188 source entries; 5,192 distinct source IDs; 8 unit conversions | `30fffbf5cb46bfdad24b7e9620c0e16cc69eb886378e3c77a246db412eda485b` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Generated `BundledIngredientCatalog.kt` | 1,336 references | `69327df70776baa128389e3ff654890d741376975123cc71e5344046aff45287` |
| `package-yields.v1.json` | 1 entry; no flattened-rice/poha record | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| Global and contextual substitution files | 0 rules in each; no target match | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` for each |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

## Disposition

Recommend integrating the single English-search alias `atukulu` on `ingredient-ref-flattened-rice-poha`. Keep all existing names, forms, measurements, conversions, yields, recipe links, and substitutions unchanged. The official Telugu naming source and current Canada-facing listings support the product-family alias; the separate red-poha listing shows why the bare term should not be treated as a color or grade. The recipe scan found no current demand. Leave the existing ledger measurement and substitution states unchanged, and do not add the proposal-local source IDs to the shared ledger until a later approved integration batch.
