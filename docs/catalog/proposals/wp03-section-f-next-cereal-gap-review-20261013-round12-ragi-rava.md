# WP03 Section F — finger millet rava / ragi rava review (2026-10-13)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated as a ledger-only candidate hold. No active catalog, recipe, generated, or application file changed.
- **Scope:** one regional preprocessed-grain candidate: dry finger-millet semolina/granules sold as *finger millet rava* or *ragi rava*.
- **Plan location:** Section F still asks for regionally significant cereal mixes and preprocessed grains ([active checklist, line 2259](../../RecipeBook-global-ingredient-catalog-plan.txt#L2352)).
- **Recommendation:** **Hold an active picker row and aliases.** Primary technical and current Canadian retailer evidence support a distinct finger-millet rava product, but no Québec-facing French product name was verified. The existing French display `éleusine cultivée` names the grain, not the processed rava product. If the hold is integrated, preserve a ledger-only candidate and keep all active catalog fields unchanged.

## Why this is a distinct, still-open Section F gap

The open Section F catch-all covers regional cereal products beyond the completed wheat, rice, sorghum, poha, Sankhal, arraw, thiakry, flakes, and bran reviews. A focused repository search for `finger millet rava`, `ragi rava`, `finger millet semolina`, and `ragi semolina` found no earlier identity/alias decision or allocated candidate. The existing [finger-millet grain and flour reviews](../batches/finger-millet-identity.md) and WP02 A6 flour-alias reviews cover the intact grain and flour, not this granular product. The held [idli-rava review](wp03-section-f-idli-rava-boundary-review-20261012.md) is specifically about a rice product; it does not own ragi rava. The integrated [sorghum-semolina review](wp03-section-f-sorghum-semolina-jowar-rava-identity-review-20261013.md) covers sorghum and already warns against generalizing `rava` across cereals.

The evidence below describes a processed finger-millet product family. It should remain distinct from intact finger millet, finger-millet flour, rice idli rava, sorghum semolina, pearl-millet Sankhal, other millet ravas, prepared ragi idli/dosa mixes, and dishes made with rava.

## Product identity and naming evidence

ICAR–Indian Institute of Millets Research describes millet semolina as a ready-to-cook product made by dry milling millet grains, explicitly including finger millet. It distinguishes coarse, medium, and fine product variants by particle size and gives traditional product labels for the grades [S01]. A current Ontario retailer independently lists **Finger Millet Rava**, identifies it as **Ragi Rava**, and describes it as a milled form of finger millet [S02]. Its contact page gives a Kitchener, Ontario address [S03]. A separate product-brand page calls its item **Ragi (Finger Millet) Rava**, lists only `Ragi Rava` in the ingredients field, and describes that specific product as stone-ground [S04]. Together, these sources support a real processed-grain candidate rather than a synonym for the intact grain or flour.

This evidence does not establish one universal particle size, milling grade, or package specification. The IIMR grades are technical examples, and the Canadian retailer listing does not state a mesh or an ingredient panel. CSIR–CFTRI separately documents a **finger-millet-based multigrain semolina** made from multiple grains, legumes, and other inputs [S05]. Keep that multigrain product distinct from a single-grain ragi rava identity; the CFTRI formulation does not show that every product sold as ragi rava is a blend.

| Candidate field | Finding | Decision |
|---|---|---|
| Product identity | Dry, milled finger-millet granules/semolina are explicitly documented; the source market uses `Finger Millet Rava` and `Ragi Rava`. | Keep as a bounded research candidate; do not merge it into the grain or flour rows. |
| English name pair | `Finger Millet Rava` is a current Canadian retailer title; `Ragi Rava` is the same listing's stated name and is independently used on a product-brand page. | If later activated, the narrow candidate pair is English display `finger millet rava` plus English alias `ragi rava`. Do not add broad `rava`, `rawa`, `sooji`, `suji`, `semolina`, or `millet semolina`. |
| Québec French name | No Québec-facing source found a French product label for finger-millet rava. The active grain's `éleusine cultivée` does not name its milled product. | **Unresolved.** Do not construct `semoule d’éleusine cultivée`, `semoule de millet`, or `semoule de ragi` as a catalog display or alias. |
| Candidate IDs | `candidate-finger-millet-rava` and `ingredient-ref-finger-millet-rava` are unallocated in the live ledger/catalog snapshot. | Preserve these names as unallocated; do not create an active reference under this proposal. |

## Québec French boundary

The live finger-millet grain row is `finger millet / éleusine cultivée`. Existing source records support the English grain identity and its Québec/Canadian French crop name; they do not attest a processed-grain name. OQLF's generic `millet` entry notes that the unqualified French term can group multiple species [reused source `WP03-S20`]. It therefore does not resolve a species-specific rava label. The existing OQLF `semoule` source reviewed for the rice idli-rava boundary is defined in wheat-milling contexts [reused source `WP03-IDLI-RAVA-20261012-S06`]; it is not evidence that `semoule` alone or a constructed `semoule de millet` is the Québec display for this product.

Targeted OQLF/TERMIUM and Québec-facing searches for `ragi rava`, `finger millet rava`, and a species-qualified French product name did not surface a verified Québec French label. This is a bounded search result, not proof that no local wording exists. Keep `farine de ragi` on the existing flour identity, `éleusine cultivée` on the intact grain identity, and `brisures de mil (sankhal)` on Sankhal. None supplies the missing French name for this candidate. A future re-review should use a Québec package or retailer label, or a terminology authority entry, before adding a bilingual picker row.

## Exact ownership and picker projection

The normalized-key audit followed [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, Unicode NFKD, accent and combining-mark removal, common ligature and ampersand folding, punctuation-to-space replacement, and whitespace collapse. The picker checks exact attached-form phrases first, then complete normalized word phrases, and then partial matches only if no full phrase matched.

| Surface | Live owner/result |
|---|---|
| `ingredient-ref-finger-millet` | `finger millet / éleusine cultivée`, category `GRAIN_AND_CEREAL`; English aliases `ragi`, `kurakkan`, `mandua`; no French aliases; `defaultDensity: null`; `unitMappings: []`. This is the intact grain. |
| `ingredient-ref-finger-millet-flour` | `finger millet flour / farine de ragi`, category `FLOUR_AND_STARCH`; English aliases include `ragi flour`, `nachni flour`, `ragi atta`, `kurakkan flour`, `mandua flour`, and `mandua ka atta`; no French aliases; `defaultDensity: null`; `unitMappings: []`. This is flour, not rava. |
| `ingredient-ref-sankhal` | `sankhal (broken millet semolina) / brisures de mil (sankhal)`. This separately scoped pearl-millet product is a nearby semolina-word collision, not a finger-millet owner. |
| `ingredient-ref-sorghum-semolina` | `sorghum semolina / semoule de sorgho`, with source-attested English aliases `jowar rava` and `sorghum rava`. This is the only active reference returned today for the bare picker query `rava`. |
| `candidate-idli-rava` | A ledger-only rice-rava candidate. It is not an active picker entry and does not own finger-millet rava. |
| Exact candidate terms | No exact active reference, form, legacy candidate, or ledger candidate owns `finger millet rava`, `ragi rava`, `ragi semolina`, or `finger millet semolina`. No active form is attached to either finger-millet row. |

Current picker projection from the live reference/form data:

| Query | Current picker result |
|---|---|
| `ragi` | Finger millet grain; finger millet flour. The flour row matches because its bilingual name contains `ragi`. |
| `finger millet` | Finger millet grain; finger millet flour. |
| `ragi flour` | Finger millet flour only. |
| `ragi rava`; `finger millet rava`; `ragi semolina` | No results. |
| `rava` | Sorghum semolina only. The ledger-only rice candidate does not participate in picker search. |
| `semolina` | Durum semolina; Sankhal; remilled durum semolina; sorghum semolina. |
| `jowar rava`; `sorghum rava` | Sorghum semolina only. |

Conditional projection only, **not a proposed active change**: if a later review creates English display `finger millet rava` and alias `ragi rava`, the exact qualified queries `finger millet rava` and `ragi rava` return only that new row. Bare `rava` would return two clearly named choices: sorghum semolina and finger millet rava. The broad queries `ragi` and `finger millet` would each expand from two results to three, including rava alongside the grain and flour choices. `ragi flour`, `jowar rava`, and `sorghum rava` retain their existing single owner; `semolina` remains at its current four because no semolina alias is proposed. The picker effects are understandable, but they do not resolve the missing French display.

## Full recipe-corpus demand scan

The scan parsed all manifest-listed recipe JSON files, recursively checked serialized string values, and checked every ingredient row's `originalText`, `ingredientName`, and `ingredientRefId`. Matching used complete normalized phrases (not substring fragments such as French `travailler`). The candidate set included `finger millet rava`, `ragi rava`, `ragi millet rava`, `ragi idli rava`, `finger millet semolina`, `ragi semolina`, spelling variants with `rawa`, `ragi sooji`, `finger millet sooji`, `ragi suji`, `semoule de ragi`, and the constructed French candidate `semoule d’éleusine cultivée`.

| Corpus measure | Result |
|---|---:|
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Candidate-phrase recipe files | 0 |
| Candidate-phrase ingredient rows | 0 |
| Rows linked to finger-millet grain, finger-millet flour, Sankhal, sorghum semolina, or the rice-rava candidate | 0 |

No bundled recipe demand or recipe line supports an alias, form, measure, or reference link for finger-millet rava.

## Forms, measurements, and substitutions

| Field | Evidence and limit | Recommendation |
|---|---|---|
| Processing / forms | IIMR distinguishes coarse, medium, and fine millet-semolina grades by particle size, with use-specific names such as `Kichidi rawa`, `Upma rawa`, and `Idli rawa`; its cited passage gives no universal mesh thresholds [S01]. The Canadian listing does not assign one of those grades [S02]. | Add no `IngredientForm`. Do not infer a coarse/medium/fine form from the generic rava name or map one retail SKU to a technical grade. |
| Package weight | Organic Wisdom's one product page lists a 400 g net package and currently displays `Sold out` [S04]. | Treat as that SKU's package declaration only; add no ingredient portion, unit mapping, or conversion. |
| Process yields | IIMR reports coarse/medium/fine processing yields of 68–72%, 71–76%, and 74–80%, respectively, and says output varies by millet [S01]. These are grain-milling process outputs, not recipe measures or cooking yields. | Do not store as density, household measure, package yield, or dry-to-cooked conversion. |
| Density and units | No reviewed source provides a reusable ragi-rava volume measure, mass-volume relationship, or density. Both existing finger-millet rows have null density and empty unit mappings. | Keep density null and `unitMappings` empty if a future identity is approved. |
| Cooking time / use | Organic Wisdom's page gives a 20-minute recipe cue for its product and lists upma, porridge, and savoury uses [S04]. This is a product/recipe statement, not a general cooking instruction or yield. | Add no form, preparation rule, or cooking conversion. |
| Substitution | Organic Wisdom markets its SKU as a substitute for regular semolina [S04]. It supplies no validated amount-preserving replacement ratio or method-wide rule. | Add no global or contextual substitution. Keep finger-millet rava separate from durum semolina, sorghum semolina, rice idli rava, Sankhal, other millet ravas, and finger-millet flour. |

The manufacturer-style claim “semolina substitute” is evidence of one product's intended use, not proof that all finger-millet rava products are interchangeable with wheat semolina in recipes. No contextual recipe evidence or ratio was found.

## Exact proposal and hold disposition

If the hold is recorded in the research ledger, use one ledger-only record named `candidate-finger-millet-rava` with proposal-local sources S01–S05, an unresolved decision, `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: researched_no_supported_substitute`. Keep package size and industrial process yields only in source notes; create no reusable measurement observations.

Do **not** create `ingredient-ref-finger-millet-rava` in this integration. In particular, do not change the current references to:

- English display or alias: none;
- French display or aliases: none;
- category: no active row;
- forms, recipe links, density, unit mappings, unit conversions, or package/cooking yields: none;
- global or contextual substitution rules: none.

For a future source-complete integration, the narrow English pair to reconsider is `finger millet rava` / `ragi rava`. Do not promote a French display until a Québec-facing name is supported. Do not attach either term to intact finger millet, finger-millet flour, the held rice candidate, Sankhal, or sorghum semolina.

## Live baseline snapshot

Read-only snapshot taken on 2026-10-13 before proposal creation. File hashes cover exact bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Live count/state | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,343 references | `43c02ea1acdf0ff3cc2e47a6ac28a634f7fd08488e5a40b52b063d4663ff9a05` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,654 records; 6,363 source entries; 5,340 distinct source IDs | `0c371c92e0ac81492d2f65020dd59235ee63f2b42f9c02e692cc0497958e5c22` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `package-yields.v1.json` | 1 yield | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| `substitution-rules.v1.json` | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Generated `BundledIngredientCatalog.kt` | 1,343 references | `34ba41f3731379d77c00cddf0e9d46356741f23097d4c7f4ca148a0fb35348d0` |

## Source and ID audit

The five new source IDs and URLs below were checked absent from the live ledger and prior proposal/batch archive before this file was created. All remain proposal-local. Reused OQLF source IDs are identified separately; they are already recorded on other ledger entries and are not proposed as new sources. The unallocated candidate/reference IDs were also checked against active references, forms, legacy candidates, and ledger record IDs.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP03-FINGER-MILLET-RAVA-20261013-R12-S01` | ICAR–Indian Institute of Millets Research, [Latest Millet Production and Processing Technologies](https://www.millets.res.in/farmer/2024/1Latest-Millet-Production-and-Process-Tech.pdf), section 11, `Millets semolina (Rawa/Suji)`. | The official PDF's indexed section includes finger millet among grains dry-milled into ready-to-cook semolina and describes coarse, medium, and fine particle-size variants. Reported process yields are grade- and millet-specific; this is not a household measure, cooking yield, Québec label, or a universal SKU specification. The PDF was too large to open directly during this review; the indexed passage was available. |
| `WP03-FINGER-MILLET-RAVA-20261013-R12-S02` | TastyGrains, Kitchener, [Millets & Millet Products](https://www.tastygrain.ca/collections/millet-items), current collection page, entry `Finger Millet Rava`. | Uses the exact heading `Finger Millet Rava`, the phrase `Ragi Rava`, and describes the product as a milled form of finger millet. The direct product-page URL returned a cache miss during this review; the accessible collection page does not provide an ingredient declaration, mesh size, or French name. |
| `WP03-FINGER-MILLET-RAVA-20261013-R12-S03` | TastyGrains, [Contact](https://www.tastygrain.ca/pages/contact), store contact/address. | Gives a Kitchener, Ontario, Canada address, establishing the Canadian retailer context for S02; it does not provide product identity evidence beyond identifying the retailer. |
| `WP03-FINGER-MILLET-RAVA-20261013-R12-S04` | Organic Wisdom, [Ragi Rava 400 g](https://theorganicwisdom.com/products/ragi-rava), product title, description, ingredients field, and recipe page. | Identifies one SKU as `Ragi (Finger Millet) Rava`, lists `Ragi Rava` as its ingredient, describes it as stone-ground and a semolina substitute, and lists 400 g net weight. The page showed sold out when reviewed; its claims and package data are SKU-specific and provide no generic conversion or substitution ratio. |
| `WP03-FINGER-MILLET-RAVA-20261013-R12-S05` | CSIR–Central Food Technological Research Institute, [Finger millet based multigrain semolina for upma, kesari bhat and alike products](https://www.cftri.res.in/hweb1/technologies/CP/fmb.pdf), technology sheet. | Defines a separate ready-to-cook **multigrain** semolina/rava/soji product from mixed cereals, millets, legumes, and other raw materials. Supports keeping a blend distinct; it is not a formula or process specification for single-grain ragi rava. |
| Reused `WP03-S20` | OQLF, [millet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet). | Existing source on `ingredient-ref-millet`; supports generic French `millet` and its species ambiguity, not a rava product name. |
| Reused `WP03-IDLI-RAVA-20261012-S06` | OQLF, [semoule (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8895941/semoule). | Existing source on the held rice idli-rava candidate; defines the term in wheat-milling contexts and does not establish a French name for finger-millet rava. |

## Static review checks

- Confirmed the Section F checklist and prior proposal/batch archive; no focused ragi-rava review or allocated candidate was found.
- Audited normalized ownership across active reference names and aliases, all attached forms and match terms, legacy candidates, and ledger IDs/records.
- Reproduced current and conditional picker projections from the implementation and live data; no emulator or runtime picker check was run.
- Scanned all 114 manifest-listed recipes and 1,123 ingredient rows; candidate-specific phrase and reference-link counts are zero.
- Checked each new source ID and exact URL for ledger/archive collisions; none was found. No new source IDs were added to the ledger.
- Compared the written source limits and numeric/substitution conclusions with the cited pages. No application, unit, instrumentation, or emulator tests were run.

## Disposition

**Hold active integration; keep this as an unresolved Section F research candidate only.** Available evidence supports the product identity and a qualified English name pair, but no verified Québec French display was found, and the recipe bundle has no demand. Do not add any reference, alias, form, recipe link, measurement, density, conversion, yield, or substitution. Reopen when a Québec-facing bilingual package/retailer label or an authoritative French term establishes the product name and scope.

## Root integration result

Integrated by root on 2026-10-13 as the unresolved ledger-only candidate `candidate-finger-millet-rava`, with the five reviewed source records and two reused OQLF source records. The candidate keeps `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: researched_no_supported_substitute`. No active reference, alias, form, recipe link, measurement, density, conversion, yield, or substitution was added. Section F remains open. No app or emulator tests were run because this integration only adds research-ledger JSON data and documentation under the updated workspace rule.
