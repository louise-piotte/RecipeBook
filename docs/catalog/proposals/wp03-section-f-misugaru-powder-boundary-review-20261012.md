# WP03 Section F: Korean misugaru powder boundary review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated as a documented hold on 2026-10-12. The plan, roadmap, and [hold integration README](../batches/wp03-section-f-misugaru-picker-hold-integration-20261012/README.md) record the decision. No active catalog reference or ledger record was added. This reconciliation edits only this proposal.
- **Scope:** The Korean product family called *misugaru/misutgaru*: a roasted and milled powder blend sold for mixing into a drink; its identity, Canadian and Québec naming evidence, picker ownership, recipe demand, process, measures, forms, and substitutions.
- **Plan context:** Section F leaves regionally significant cereal mixes and preprocessed grains open ([global plan, Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L2239)). Its checklist now records this hold and links the [batch integration note](../batches/wp03-section-f-misugaru-picker-hold-integration-20261012/README.md). This review concerns a Korean mixed-grain drink powder and does not reopen the integrated quick-cooking barley review or earlier Section F decisions.
- **Recommendation:** **Hold an active picker row and aliases.** Evidence supports a distinct Korean mixed-grain powder family, but the current word-phrase-first/substring-fallback picker would also return a future `misugaru` row for the query `misu`. A Korean cultural encyclopedia uses *misu* for the prepared beverage made from misugaru, so that result would conflate the powder with the prepared drink. Resolve that picker boundary before adding a searchable identity. No forms, measures, substitutions, or recipe links are justified in any case.

## Product identity and boundary

The sources describe *misugaru* as a Korean powdered drink product made by roasting and grinding cereal grains with beans, and in some formulations seeds. A Korean Traditional Knowledge Portal entry names it “Misutgaru (Roasted Multi-grain Powder)” and presents one historical recipe: rice, barley, white beans, perilla, sesame, and Job’s tears are processed separately, then finely ground and mixed. Some components are soaked or steamed and dried before roasting; others are dried and roasted. The entry cites a 1942 source reproduced in a 2008 local-food collection and says the data was provided by Korea’s Rural Development Administration. It is evidence for one recipe and process, not a fixed formula.

Samjin Food currently markets a black-bean mixed-grain powder as misugaru. Its listed formula includes 44% Korean black soybean, black rice, soybean, barley, rice, glutinous brown rice, and sugar. Its two product pages describe roasted whole grains milled into powder, but present different process sequences: the 700 g page lists washing, steaming, drying, roasting, and milling, while the 40 g stick page describes separately roasting the components before milling and blending. These are SKU descriptions, not a universal process standard. The Canadian Food Inspection Agency (CFIA) also reported sampling an “Organic misugaru multi-grain drink powder” in its 2020–2021 survey.

This evidence supports a product-family boundary around a Korean roasted/milled mixed-grain drink powder, not a single-grain ingredient. Formula composition varies: a historical recipe contains grain, legumes, and seeds; Samjin’s current black-bean blend contains several grain/bean ingredients and added sugar; the CFIA sample’s full formula is not disclosed in the survey. Do not assign the product to a single grain, soy, flour, or seed identity. Keep it distinct from:

- individual grains and their flours or meals;
- `ingredient-ref-kinako` (`kinako` / `poudre de soja Kinako`, with `roasted soybean flour` as an alias), which is roasted soybean flour rather than a mixed product;
- generic mixed-grain blends that are not identified as Korean misugaru;
- the prepared drink called *misu*, which the Academy of Korean Studies describes as misugaru mixed with sugar water or honey water.

Do not treat the historical recipe as a universal definition of the product, or include any powder solely because a seller calls it a grain drink or meal-replacement shake.

## Naming and Québec limits

| Naming evidence | What it supports | Limit |
|---|---|---|
| Samjin Food’s manufacturer pages use `misugaru`. | This romanization is used by a current manufacturer for its Korean mixed-grain powder. | One manufacturer’s wording does not make its formula or spelling universal. |
| Baro Market, a Canadian online market, titles an Obok product `Misutgaru 2LB`. | A second spelling occurs in Canadian retail. | The English listing does not show a full ingredient statement, a French display, or a verified Québec package label. The page is not evidence of current availability. |
| CFIA’s bilingual survey calls one sample `Organic misugaru multi-grain drink powder`; the French report describes it as `Poudre pour boisson misugaru multigrain biologique`. | Canadian government English/French descriptive wording for one sampled product. | This is a sample description, not a transcription of the package or a Québec terminology decision. The survey does not tie this particular sample to its Montréal collection site. |
| Creatrip’s French-language tourism page uses `Misugaru (Poudre de grains mélangés)`. | A French-language descriptive translation outside Québec. | It is not OQLF guidance or a Canadian product label. |

Targeted OQLF searches for `misugaru` and `misutgaru`, and a TERMIUM Plus search for `misugaru`, returned no terminology entry. This bounded exact-term search is not proof that the term is never used in Québec. No Québec-facing French package or retailer product page was located in this review.

If a later review resolves the picker issue and selects an active identity, `misugaru` is the best-supported English display; `misutgaru` is a source-backed spelling variant but should not be added as an alias without a decision to accept both spellings in search. A possible French descriptor is `poudre pour boisson misugaru multigrain`, following the CFIA’s French sample description without its SKU-specific `biologique` qualifier. This wording remains provisional, not an established Québec product name. Do not add `poudre de grains mélangés`, `poudre multigrains`, or a broader “mixed grain powder” alias to the active catalog on this evidence alone.

## Exact ownership and picker boundary

The live reference catalog, forms, legacy candidates, and research ledger were checked using the app’s normalization behavior: lowercase/case folding, Unicode NFKD, accent and combining-mark removal, common ligature and ampersand folds, punctuation-to-space replacement, and whitespace collapse. I checked reference names and aliases; form labels and match terms; legacy names and aliases; ledger strings and record IDs; and the full Section F proposal/batch archive.

| Candidate query | Active picker owners | Legacy candidate owner | Exact ledger owner |
|---|---|---|---|
| `misugaru`, `misugaru powder`, `misu-garu` | None | None | None |
| `misutgaru`, `misutgaru powder` | None | None | None |
| `misugaru multigrain drink powder` / `poudre pour boisson misugaru multigrain` | None | None | None |
| `mixed grain powder`, `multi-grain powder`, `multigrain powder`, `roasted grain powder` | None | None | None |
| `미숫가루`, `미수가루`, `misu` | None | None | None |

No exact owner exists for the candidate product or its proposed phrase family. The active `kinako` row is a separate pure-soy flour neighbor. No misugaru identity or source record exists in the ledger, and the proposal-local source-ID prefix `WP03-MISUGARU-20261012` remains unused. The integrated hold documents this boundary only; it does not allocate the prefix or add a ledger candidate.

The live picker first returns complete normalized word-phrase matches and only falls back to substring matching when there are no complete matches. A future active term containing `misugaru` would not be a complete phrase match for `misu`, but it would match `misu` during that substring fallback. The Korean Academy of Korean Studies defines *misu* as a prepared summer drink made with misugaru and sugar or honey water. This makes `misu` a meaningful, separately used query rather than a safe alias. Do not add bare `misu` as an alias, and keep the active identity on hold until that partial-query behavior is resolved or deliberately accepted.

This is a static matcher evaluation using the current reference/form terms and the implementation in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), not an emulator or runtime picker observation.

## Full bundled-recipe demand scan

I parsed every recipe path listed in the current manifest, scanned all string values in each full recipe object, and separately included every structured ingredient row. The search included `misugaru`, `misutgaru`, `misu-garu`, their powder variants, Korean script spellings, `misu`, `Korean roasted grain powder`, `roasted grain powder`, `mixed grain powder`, `multigrain powder`, `roasted multigrain powder`, and the French candidate phrases above.

| Corpus measure | Result |
|---|---:|
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Recipe files with candidate phrase hits | 0 |
| Candidate ingredient-row hits | 0 |
| Rows linked to a misugaru reference | 0 |

There is no current recipe demand, supported recipe link, recipe form, or recipe-line amount for this candidate.

## Process, measurements, forms, and substitutions

| Observation | Source scope | Limit |
|---|---|---|
| Historical recipe component quantities include rice at 170 g (or a one-cup alternative), barley rice at 150 g/one cup, white beans at 160 g/one cup, and one cup each of perilla, sesame, and Job’s tears. | One archived recipe’s quantities for separate components before they are ground and mixed. | These are not measurements of finished misugaru powder, a standard formula, a household portion, a density, or a conversion. |
| Samjin 700 g product: 40 g powder mixed with 200 mL milk or water. | Manufacturer direction for that SKU. | Do not generalize to another formula, milk type, preparation state, or volume-to-mass conversion. |
| Samjin 40 g stick: one 40 g sachet mixed with 180 mL milk. | Manufacturer direction for that stick SKU. | The 180 mL direction differs from the 700 g page’s 200 mL; neither is a generic drink ratio or a density. |
| Baro Market product listing: 2 lb pack. | One Canadian retailer’s displayed package size. | Not a serving or ingredient measure; no composition or preparation direction is supplied. |

These are mixing directions for specific products, not powder volume measurements. The sources provide no generic household volume-to-mass value for misugaru. If this family is later added, keep `defaultDensity` null, `unitMappings` empty, and the two manufacturer mixing directions as distinct SKU-specific preparation observations only. Do not create a generic form called “cooked”: the powder is roasted/milled before sale and mixed directly into a liquid for the finished drink. Do not create a prepared-drink ingredient form or a cooking yield from the reconstitution instructions.

No source supports replacing a grain, flour, meal, cereal, or prepared beverage with misugaru at a fixed ratio. Adding milk or water reconstitutes the powder and is not an ingredient substitution. Add no active substitution rules or recipe-line substitution links.

## Live package and corpus snapshot

Snapshot rechecked from the live workspace on 2026-10-12. File hashes cover exact bytes. The recipe-corpus fingerprint hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Live count | SHA-256 or corpus fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,323 references; 138 `GRAIN_AND_CEREAL` | `86076e7b58fe1d06889f15792a0d2928f69951582bc0d39aaa13a3f7f54f3835` |
| `ingredient-forms.v1.json` | 98 forms | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,631 records; 6,000 source entries; 5,017 distinct source IDs; 8 unit conversions | `95da8ee4b608a3a8bc3cac26205762222765e7dfb5c72b6620aaff01a51fea84` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 rows; 753,792 recipe-file bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `package-yields.v1.json` | 1 yield | `5aee6b94cae0c25128ec5c99583089927c945a3438178065bff08b2b0e0d0c2b` |
| `substitution-rules.v1.json` | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| `contextual-substitution-rules.v1.json` | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Generated `BundledIngredientCatalog.kt` | 1,323 references | `9eff5dce691429d43cfc0c13a1feeac55c04c200f3615eaae03b0f713f0ac55d` |

## Source register

Sources were accessed on 2026-10-12. The eight `WP03-MISUGARU-20261012-S01` through `-S08` IDs are proposal-local, unique, and absent from the current ledger. They have not been allocated or added to shared data.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP03-MISUGARU-20261012-S01` | Korean Traditional Knowledge Portal, [Misutgaru (Roasted Multi-grain Powder)](https://koreantk.com/ktkp2014/food/food-view.view?foodCd=TF10002561). | Names the powder and records one historical formulation and processing sequence. The entry cites a 1942 recipe, appears in a 2008 local-food collection, and credits Korea’s Rural Development Administration for the data. It does not establish a universal formula or finished-powder measure. |
| `WP03-MISUGARU-20261012-S02` | Academy of Korean Studies, [Encyclopedia of Korean Culture: Misu (미수)](https://encykorea.aks.ac.kr/Article/E0019965). | Defines the prepared beverage as misugaru mixed into sugar or honey water and describes glutinous-rice and barley-rice variants. Supports keeping the drink distinct from the powder; it does not establish a Québec French name. |
| `WP03-MISUGARU-20261012-S03` | Samjin Food, [Black Bean Mixed Grain Powder 700 g](https://samjinfoods.com/en/00023/). | Manufacturer page lists the product’s ingredients, describes a Korean roasted/milled grains-and-beans powder, gives its own 40 g + 200 mL mixing direction, and lists a process that includes steaming, drying, roasting, and milling. These details are SKU-specific. |
| `WP03-MISUGARU-20261012-S04` | Samjin Food, [Black Bean Mixed Grain Powder 40 g Stick](https://samjinfoods.com/en/00682/). | Manufacturer page identifies a 40 g stick and directs mixing it with 180 mL milk. It describes a 44% black-soybean blend and roasting/milling. No generic measure, universal formula, or process standard follows from this SKU. |
| `WP03-MISUGARU-20261012-S05` | Canadian Food Inspection Agency, [Undeclared Allergens and Gluten in Hot Drink and Instant Coffee Mixes – April 1, 2020 to March 31, 2021](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/testing-reports-and-journal-articles/targeted-surveys). | Its sample table names one “Organic misugaru multi-grain drink powder.” Products were sampled at Canadian local/regional stores during 2020–2021. The English page does not give the sample’s manufacturer or ingredients, nor the city or origin of that specific sample. |
| `WP03-MISUGARU-20261012-S06` | Canadian Food Inspection Agency, French report, [Présence non déclarée d’allergènes et de gluten dans les préparations pour boissons chaudes et café instantané](https://publications.gc.ca/collections/collection_2023/acia-cfia/A104-326-2022-fra.pdf). | Page 5 translates the sample description as `Poudre pour boisson misugaru multigrain biologique`; the same report says sampling covered six Canadian cities, including Montréal. This is an agency sample description, not the package’s transcription, a Québec market label, or proof this sample was collected in Montréal. |
| `WP03-MISUGARU-20261012-S07` | Baro Market, [Obok Tteok House | Misutgaru 2LB](https://baromarket.ca/en/products/%EC%98%A4%EB%B3%B5%E3%85%A3%EB%AF%B8%EC%88%AB%EA%B0%80%EB%A3%A8-mixed-grain-powder-2lb). | Canadian online-market listing uses the title spelling `Misutgaru` and says the item is made from various grains. It does not supply a full formula, French name, or specific preparation measure; current availability was not verified. |
| `WP03-MISUGARU-20261012-S08` | Creatrip, [Collations incontournables de Jjimjilbang](https://creatrip.com/fr/blog/517). | French-language tourism page labels the item `Misugaru (Poudre de grains mélangés)`. It supports a descriptive translation outside Québec only, not a preferred Québec term or consumer product name. |

## Static checks and disposition

- Reconfirmed the proposal-local source-ID prefix remains absent from the current ledger; the integrated hold README likewise records that no source IDs were allocated.
- Parsed the active reference, form, legacy, ledger, manifest, yield, and substitution JSON to calculate the snapshot counts and hashes above.
- Compared candidate labels against the live reference/form picker terms and legacy candidates with the app’s normalized phrase-first/substring-fallback logic; searched the ledger and Section F archive for existing owners or a prior review.
- Parsed all 114 manifest-listed recipe JSON files and scanned all string content plus all 1,123 ingredient rows. Found no candidate phrase hits.
- This reconciliation changes proposal documentation only. No app, unit, instrumentation, or emulator tests were run under the user's database-JSON testing exemption.
- The proposal is UTF-8 without BOM, has no trailing whitespace, ends with one newline, and contains no mojibake markers.

**Disposition:** preserve this as a documented candidate boundary only. Make no active reference, alias, form, measure, density, unit mapping, yield, recipe link, conversion, or substitution until the picker can distinguish `misugaru` from the separately named prepared drink *misu* and a Québec-facing French name is independently established.
