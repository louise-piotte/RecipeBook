# WP03 Section G hiyamugi noodles identity proposal

- **Reviewed:** 2026-10-09
- **Status:** integrated on 2026-10-09 after coordinator review; the fr-CA display remains provisional.
- **Owner:** WP03 identity research for one Japanese noodle product
- **Scope owned:** one plain hiyamugi noodle identity, separate from the integrated somen and udon rows.
- **Deferred:** fresh or cooked hiyamugi forms; hand-stretched hiyamugi as a separate identity or form; somen, udon, soba, ramen, kishimen/hiramen, generic wheat or maize noodles, rice and starch noodles, egg noodles, shirataki/konjac noodles, instant products, prepared noodle dishes, and all other open Section F/G work. The broad WP03 plan item remains open.
- **Repository snapshot:** rechecked the canonical package at 414 ingredient references, 16 forms, 579 ledger records, and 114 bundled recipe JSON files with 1,123 ingredient rows. The current plan still leaves the wider Japanese-noodle sweep open; somen and udon are integrated, while hiyamugi remains deferred in their packets. No hiyamugi reference, form, exact hiyamugi ledger record, legacy-import identity, or earlier hiyamugi-specific proposal exists. The live somen ledger record mentions hiyamugi only as a distinct neighboring class in its MAFF/MEXT evidence; it is not a hiyamugi record.
- **Work performed:** source review plus exact normalized-key, legacy, and all-recipe ingredient audits. This packet does not close Section F/G.

## Candidate decision

Recommend one identity for coordinator review:

| Proposed ID | English display | fr-CA display | English aliases | fr-CA aliases | Category |
| --- | --- | --- | --- | --- | --- |
| `ingredient-ref-hiyamugi-noodles` | `hiyamugi noodles` | `nouilles hiyamugi` | `hiyamugi` | `hiyamugi` | `GRAIN_AND_CEREAL` |

MAFF’s English grain-products page uses the exact English product term `hiyamugi` and includes a separate `Dried hiyamugi` row in its noodle/JAS table. MAFF’s export publication also uses `Hiyamugi Noodles` in an English recipe title and ingredient list. The proposed English display makes the food type explicit; the bare loanword is the only English alias.

For Québec French, the reviewed OQLF entry for `nouilles de blé` has no hiyamugi term. OQLF does list `somen` as a preferred French term for one Japanese noodle class, but it does not establish a hiyamugi label. A Canadian French storefront uses `Nouilles Hiyamugi Japonaises Artisanales`; the proposed display shortens that descriptive product title to `nouilles hiyamugi`. Treat this as a conservative, provisional fr-CA label pending independent Québec terminology review, not as an OQLF-approved term. Keep `hiyamugi` as the sole French alias so both locales can find the identity by the Japanese product name. Do not add `nouilles minces`, `nouilles minces de blé`, `nouilles de blé`, or `nouilles de maïs`: these are broad family or shape terms, not synonyms for hiyamugi.

Use `GRAIN_AND_CEREAL`, consistent with the current somen, udon, soba, and ramen rows and MAFF’s grain-products grouping. This is a product identity, not a fixed recipe claim. MAFF’s overview describes hiyamugi in prose as one of the thin/cold udon types, while its dried-noodle table separates dried hiyamugi from dried udon and somen. Preserve both source framings: hiyamugi belongs to the broad Japanese wheat-noodle family but is a separately named product class useful for search and recipe identity. Do not alias it to `udon` or `somen`.

The table’s size distinctions support separation for regular dried products: hiyamugi is 1.3 mm or more and less than 1.7 mm in diameter, between the cited dried somen and dried udon thresholds. MAFF reports a different hand-stretched classification: hand-stretched hiyamugi and hand-stretched somen are both listed below 1.7 mm. Thus the size thresholds do not establish one universal hiyamugi diameter or a reliable state conversion. MEXT’s food-composition records also group somen with hiyamugi rather than isolating hiyamugi. Do not encode a universal wheat-only formulation, one fixed size, or a claim about every fresh, cooked, or hand-stretched product.

Keep hiyamugi separate from:

- **Somen:** an existing distinct identity; regular dried somen is below 1.3 mm in the MAFF table, while dried hiyamugi starts at 1.3 mm. Some MEXT composition entries group the pair, which is a data classification limitation rather than proof they are identical products.
- **Udon:** an existing distinct identity. MAFF’s umbrella prose includes hiyamugi among udon types, but its dried-product table lists the two separately with separate regular dried thresholds. Do not make `udon` an alias.
- **Soba:** the current soba identity is a buckwheat noodle product; OQLF and MAFF distinguish it from the Japanese wheat-noodle classes.
- **Ramen, Chinese-style noodles, and generic wheat/maize noodles:** distinct or broader families. OQLF identifies `nouilles de blé` and `nouilles de maïs` as ingredient groupings, not hiyamugi synonyms.
- **Rice noodles, glass noodles, and other starch-defined noodles:** different product families; no shared-category inference supports aliasing or substitution.

Do not add Japanese-script aliases (`ひやむぎ`, `冷麦`): the current ingredient search key retains Latin letters and digits, so these normalize to an empty key. No alternate Latin transliteration such as `hiya-mugi` or `hiya mugi` was supported by the sources reviewed.

## Measurement and form evidence

- **Dried size classification:** MAFF’s English table states regular dried hiyamugi is 1.3 mm or more and less than 1.7 mm in diameter; regular dried somen is less than 1.3 mm and regular dried udon is 1.7 mm or more. MAFF Tokai’s 2023 consumer article says the naming distinction for these dried noodles is based on thickness. Record only as source-scoped dry-product classification evidence; it is not a mass/volume measure, and it does not apply universally to fresh or cooked noodles.
- **Hand-stretched classification:** MAFF lists hand-stretched hiyamugi below 1.7 mm and hand-stretched somen below 1.7 mm. The overlapping threshold means diameter alone cannot separate those two hand-stretched product labels. Do not turn these thresholds into form-specific recipe conversions or a universal size field.
- **Food-composition data:** MEXT’s 2023-supplemented item 01043 is `Somen and Hiyamugi`, common wheat, dried and uncooked, with nutrient values on an edible-portion mass basis. MEXT’s 2020 food list separately names dry and boiled regular somen/hiyamugi and hand-stretched somen/hiyamugi entries, but each pair stays grouped. These entries show that dry and boiled states exist in reference data; they do not give hiyamugi-only composition, household measures, cooking yield, or density.
- **Density, portion weight, and unit mapping:** no hiyamugi-specific supported mass-per-volume or household portion observation was found in the official material reviewed. Do not transfer Health Canada’s cooked-somen values or any udon values to hiyamugi. Recommend `measurementState: researched_no_supported_value`; keep `defaultDensity` null and `unitMappings` empty.
- **Forms and yield:** MAFF documents dried and hand-stretched dry hiyamugi. MEXT’s grouped data also names boiled entries, without hiyamugi-only cooked values. No bundled recipe ingredient line needs a hiyamugi form, so propose no form IDs, package yield, dry-to-cooked conversion, or cooked form now.

## Substitution findings

No source reviewed here gives a hiyamugi-for-somen, hiyamugi-for-udon, or hiyamugi-for-other-noodle substitution instruction with a scope and usable replacement method. MAFF’s English export publication includes a “Pasta-style Hiyamugi Noodles with Summer Vegetable Sauce” recipe, but it uses hiyamugi as the named ingredient; it does not instruct the reader to replace another noodle with hiyamugi. The current recipe corpus has no hiyamugi mention. Recommend `substitutionResearchState: researched_no_supported_substitute` after acceptance and add no active contextual or global substitution rule.

## Exact-key, legacy, and recipe audits

### Normalized-key collision audit

Audited all current reference and form names/aliases using the app’s `normalizeIngredientSearchKey` behavior: lowercase, Unicode NFKD, accent/ligature folding, punctuation-to-space, and whitespace collapse. Proposed terms produce three distinct normalized keys:

| Proposed term | Role | Normalized key | Current owners among 414 references and 16 forms |
| --- | --- | --- | --- |
| `hiyamugi noodles` | English display | `hiyamugi noodles` | none |
| `nouilles hiyamugi` | fr-CA display | `nouilles hiyamugi` | none |
| `hiyamugi` | English and fr-CA aliases | `hiyamugi` | none |

No proposed key collides with another proposed key or current reference/form term. Neighbor keys remain owned by their existing identities: `somen` and `somen noodles` by `ingredient-ref-somen-noodles`; `udon`, `udon noodles`, and `nouilles udon` by `ingredient-ref-udon-noodles`; `nouilles de sarrasin` by `ingredient-ref-soba-noodles`. `wheat noodles`, `nouilles de blé`, `maize noodles`, `nouilles de maïs`, unqualified `noodles`/`nouilles`, and `thin noodles`/`nouilles minces` have no exact current owner and are not proposed aliases. The proposed ID is absent from seed references, forms, ledger records, and `docs/catalog/legacy-import-identities.v1.json`; exact searches for `hiyamugi`, `ひやむぎ`, and `冷麦` returned no legacy candidate.

### Bundled recipe audit

Scanned all 114 bundled recipe JSON files and all 1,123 `ingredients[]` rows across `originalText`, `ingredientName`, and `ingredientRefId`. Exact hiyamugi spellings (`hiyamugi`, `ひやむぎ`, `冷麦`) had zero ingredient-line matches and zero matches across the complete recipe JSON corpus. A broader `noodle`/`nouille` check found zero ingredient-line matches. No recipe relink, form-specific reference, measurement, or recipe-line substitution is proposed.

## Recommended evidence states and acceptance checks

- **Identity:** consider `ingredient-ref-hiyamugi-noodles`, `hiyamugi noodles / nouilles hiyamugi`, category `GRAIN_AND_CEREAL`, with only `hiyamugi` as an alias in both locales. Treat the fr-CA display as provisional pending Québec terminology review.
- **Measurement:** `researched_no_supported_value` for density, portion weight, and unit mapping. Retain MAFF’s regular dried size thresholds only as source-specific classification evidence; do not create numeric catalog measures or conversions.
- **Substitution:** `researched_no_supported_substitute`; preserve no active substitution rule.
- **Forms:** add none. Revisit dry/boiled distinctions only if a recipe or source provides hiyamugi-specific actionable evidence.
- **Boundaries:** keep separate from somen, udon, soba, ramen, generic wheat/maize noodles, rice noodles, and starch-defined noodles; add no broader family aliases.
- **Merge-time:** repeat the exact normalized-key, legacy, and full 114-recipe ingredient-line audits against the package being merged. Keep the broader WP03 Section F/G plan item open.

## Sources and source-to-claim map

All sources below were accessed 2026-10-09. WP03-S224–WP03-S232 are proposal references only and have not been added to the shared ledger.

- **WP03-S224 — Japan MAFF, [Grain products — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/kokurui.html)** (page publication date not shown): English term `hiyamugi`; grain-products context; umbrella prose placing hiyamugi among udon types; separate dried hiyamugi row and regular dried size thresholds; separate hand-stretched hiyamugi classification. Primary source for identity, category, scope, and limitations of the size distinction.
- **WP03-S225 — Japan MAFF Tokai Regional Agricultural Administration Office, [“Difference between somen and hiyamugi”](https://www.maff.go.jp/tokai/keiei/shokuhin/bunka/attach/pdf/kaihou-50.pdf)** (newsletter dated 2023-07-10): says the dried noodle names are distinguished by thickness and gives somen `<1.3 mm`, hiyamugi `1.3 mm to <1.7 mm`, and udon `≥1.7 mm`. Japanese-language official explanatory article; corroborates the regular dried class distinction, not volume or fresh/cooked dimensions.
- **WP03-S226 — Japan MAFF, [Japanese Agricultural Standard, Dried Japanese Noodles, JAS 0911:2024](https://www.maff.go.jp/j/jas/jas_standard/attach/pdf/index-373.pdf)** (revised 2024-10-29; effective 2024-11-28): current standard scope defines dried noodles as made from wheat or buckwheat flour and other allowed ingredients, formed and dried. It supports limiting claims about dried products and varying ingredients; this standard document does not supply a hiyamugi-specific household measure or density.
- **WP03-S227 — Japan MEXT, [Food Composition Database, item 01043](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=1_01043_7)** (Japanese Food Composition Standard, 8th edition, supplement 2023): labels the item common wheat / `Somen and Hiyamugi`, dried and uncooked, with nutrition on an edible-portion mass basis. Supports a grouped dried-state record only; it does not isolate hiyamugi or provide a volume conversion.
- **WP03-S228 — Japan MEXT, [2020 Food Composition Standard food list](https://www.mext.go.jp/content/20201225-mxt_kagsei-mext_01110_001.pdf)** (2020 edition): lists dry and boiled entries for somen/hiyamugi and for hand-stretched somen/hiyamugi, with each pair grouped. Supports distinct dry/boiled data states while showing the hiyamugi-specific composition gap.
- **WP03-S229 — Japan MAFF, [Japanese Dried Noodles KANMEN, English publication](https://www.maff.go.jp/j/shokusan/export/e_info/kanmen/pdf/english3.pdf)** (publication date not shown): uses `Pasta-style Hiyamugi Noodles with Summer Vegetable Sauce` and a hiyamugi ingredient line; shows a use case but makes no substitution recommendation and gives no volume-density relation.
- **WP03-S230 — OQLF, [nouilles de blé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18699784/nouilles-de-ble)** (last updated 1997): lists broad food/pasta terms and `somen`, and describes Japanese wheat or sometimes maize noodles as calibre-grouped somen/udon. It has no hiyamugi entry; do not treat its generic terms as hiyamugi aliases or as complete current Japanese taxonomy.
- **WP03-S231 — Embassy of Japan in France, [“Les udons : histoire et culture des nouilles japonaises”](https://www.fr.emb-japan.go.jp/files/100565690.pdf)** (dated 2023-10-12): French-language official Japanese-government source uses `hiyamugi` as a distinct loanword within the Japanese wheat-noodle family and places it between somen and udon by thickness. Supports francophone loanword usage, but it is not Québec terminology authority.
- **WP03-S232 — Japan With Love, [Ibonoito Handmade Japanese Hiyamugi Noodles](https://japanwithlovestore.com/fr-ca/products/ibonoito-handmade-japanese-hiyamugi-noodles-200g-premium-quality)** (fr-CA storefront; page publication date not shown): uses the French product title `Nouilles Hiyamugi Japonaises Artisanales` and CAD pricing. Supports observed fr-CA retail wording only; it is not an official terminology source or evidence for a general package weight.

## Coordinator integration result

## Coordinator integration result

Added `hiyamugi noodles / nouilles hiyamugi` with only `hiyamugi` as a bilingual alias. The French
display remains provisional pending Québec terminology review. No form, measurement, density,
conversion, substitution, or recipe link was added. The wider Section F/G work remains open.

Canonical post-merge snapshot: 446 ingredient references, 16 forms, and 612 research-ledger records.
