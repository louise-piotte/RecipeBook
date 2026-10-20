# WP02 A6 follow-up: kodo millet atta alias review

## Review record

- Reviewed: 2026-10-13.
- Status: integrated on 2026-10-13; see `docs/catalog/batches/wp02-wp03-wp04-alias-identity-integration-20261013/README.md`.
- Scope: reopen one previously unresolved regional flour alias on the existing kodo millet flour reference.
- Recommendation: integrate the single English alias kodo millet atta.
- Proposal-local source IDs: WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S01 through S08. At final audit, they were absent from the research ledger and every other proposal/batch file.
- The broader WP02 A6 work remains open.

## Recommendation and exact ownership

Add only kodo millet atta to aliasesEn on ingredient-ref-kodo-millet-flour.

| Field | Current value | Proposed value |
| --- | --- | --- |
| Reference ID | ingredient-ref-kodo-millet-flour | unchanged |
| Category | FLOUR_AND_STARCH | unchanged |
| English display | kodo millet flour | unchanged |
| French display | farine de millet kodo | unchanged |
| English aliases | empty | kodo millet atta |
| French aliases | empty | empty |
| defaultDensity | null | null |
| unitMappings | empty | empty |

This is the existing product identity for flour milled from kodo millet, Paspalum scrobiculatum. It remains separate from ingredient-ref-kodo-millet (kodo millet / kodo), generic millet flour, and generic atta. No new ingredient identity or grain alias is warranted.

The 2026-10-12 kodo-flour identity proposal accepted the row with no aliases and explicitly left kodo atta, kodo flour, and other regional names inactive. It did not resolve kodo millet atta. The new evidence below supplies that exact, species-qualified phrase in a Canada-facing retail listing and independently corroborates atta as a name for the same flour in the maker’s product page. Restrict this update to the exact phrase kodo millet atta. Do not add kodo atta, kodo flour, harka atta, kodra atta, varagu maavu, varagu flour, arikelu pindi, or any French regional alias in this packet. The maker’s broader regional list is not being treated as proof of Canadian naming frequency or Québec French usage.

## Evidence dimensions

### Ingredient identity and English alias

The identity is already verified in the ledger. Its existing evidence includes TERMIUM Plus for the grain term and current Canadian listings for kodo millet flour / farine de millet kodo. This review does not change the identity boundary or displays.

Veehacart’s Canada-facing listing explicitly describes “Kodo Millet Flour” as also known as “Kodo Millet Atta or Kodo Flour” [S01]. Its legal-information page identifies Veehacart as operated by a registered Canadian company in Paris, Ontario [S02]. Organic Mandya’s manufacturer product page names “Kodo Millet Flour (Kodo Atta / Harka Atta)” and describes Kodo Atta as flour ground from kodo millet [S03]. The Indian Council of Agricultural Research’s Indian Institute of Millets Research lists Harka, Kodra, Kodon, Varagu, Arikelu and other regional names for the kodo grain [S08]; it does not define flour or attest these as flour aliases. Together these sources support the proposed search alias while leaving other regional expressions outside this decision.

The Veehacart product URL could not be opened directly by the browser tool on 2026-10-13; its search-indexed page returned the product text, a 500 g title, CAD pricing, and a sold-out status, and reported a crawl age of three months. Treat that page as Canada-facing label evidence, not a claim of current stock or a live inventory check. The separate Veehacart legal page was directly opened. Organic Mandya’s maker page was directly opened.

### Québec French

Keep the existing French display farine de millet kodo. The ledger’s existing TERMIUM Plus entry and Canadian French listing support the display. The reviewed evidence does not establish a Québec French alias for atta or the other listed regional flour names. Add no French alias.

### Measurement and density

The active flour row has defaultDensity null and unitMappings empty. Its ledger record currently has measurementState not_yet_researched and no measurementObservations.

A 2019 study reports a laboratory bulk density of 0.68 ± 0.00 g/mL for kodo millet flour [S04]. The authors procured kodo grain from a local Hyderabad market, cleaned and milled it, and attribute the bulk-density procedure to a prior method. The paper does not report a retail product, a household cup convention, a spooned/sifted/scooped/packed fill method, or particle-size specification. Preserve 0.68 g/mL only as a source-specific bulk-density observation; do not promote it to defaultDensity or a kitchen unit mapping.

A Tamil thattai recipe lists kodo millet flour as “1 cup or 250 grams” [S05]. It does not state the cup volume convention or flour filling method. If recorded in the ledger, retain that exact one-recipe portion as a published portion observation with sourceQuantity 1 cup and observedMassG 250; do not derive a density or general conversion from it. The Veehacart 500 g listing is package mass, not a volume measure or portion.

If integrated, set measurementState to researched_supported to reflect these two source-scoped observations, attach them to the existing flour record, and keep active defaultDensity null and unitMappings empty. The state would indicate that bounded observations were researched; it would not make either observation universal.

### Substitution

Two studies show only formula-specific uses. Sharma and Gujral test kodo millet among several minor millet flours in an unleavened wheat flatbread composite using a reported 3:1 proportion [S06]. A 2026 muffin study reports its best results with kodo flour processed at 30% moisture and 100°C, particularly at 75% replacement [S07]. The flour treatment and food systems differ; neither source establishes a reusable replacement ratio for roti, dosa, bread, muffins, cookies, thickening, or recipes generally.

If integrated, set substitutionResearchState to blocked_pending_evidence and record the two formulation findings with their individual conditions and limits. Do not add an active substitution rule, recipe-line substitution, or generalized replacement percentage.

## Ownership, forms, and picker projection

The audit used the active reference and form terms, legacy import candidates, ledger record IDs, and the repository search normalization. No exact normalized owner exists for kodo millet atta in those surfaces. The exact kodo millet flour and farine de millet kodo terms belong to ingredient-ref-kodo-millet-flour. The shorter kodo and kodo millet terms already resolve to the separate grain and flour identities. No ingredient form is attached to the target; no kodo/kodra row exists in the legacy-candidate file.

The static picker projection follows IngredientSearch.kt: lowercase/NFKD normalization, removal of accents and punctuation, complete-word phrase matching first, then substring fallback. It was calculated from the current references and forms, with the proposed alias added only in memory.

| Query | Current result | Result with proposed alias |
| --- | --- | --- |
| kodo millet atta | none | ingredient-ref-kodo-millet-flour only |
| kodo atta | none | none |
| kodo flour | none | none |
| kodo millet flour | ingredient-ref-kodo-millet-flour | same |
| kodo millet | ingredient-ref-kodo-millet and ingredient-ref-kodo-millet-flour | same |
| kodo | ingredient-ref-kodo-millet and ingredient-ref-kodo-millet-flour | same |
| atta | 8 results, including ingredient-ref-atta and pre-existing substring matches | same 8 plus ingredient-ref-kodo-millet-flour |

The qualified alias resolves to one flour result. The broad atta query already has substring matches on attanga (an alias on safou) and shatta; the proposal adds one predictable flour result to that broad set. No grain alias is needed because the current bare kodo queries already return both distinct identities.

## Bundled recipe demand

The audit covered all 114 recipe paths in the split-package manifest and all 1,123 ingredient rows. It searched serialized recipe files and ingredient-line text for kodo millet atta, kodo atta, kodo flour, varagu flour, kodra flour, kodo millet flour, farine de millet kodo, farine de kodo, kodo millet, koda millet, and kodo.

- Direct ingredientRefId links to ingredient-ref-kodo-millet-flour: 0.
- Phrase hits across the complete recipe files and ingredient rows: 0.
- No recipe link, recipe wording change, or recipe-specific substitution is proposed.
- Manifest-ordered recipe corpus fingerprint: SHA-256 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c.

## Baseline snapshot

Read-only snapshot rechecked at final review on 2026-10-13. The shared ledger changed after the initial pre-write audit; the latest hash/counts are shown below. The kodo-flour record itself was rechecked and remained unchanged. File hashes cover exact bytes.

| Surface | Baseline | SHA-256 |
| --- | --- | --- |
| Active ingredient references | 1,336 refs; target aliases empty, null density, empty mappings | eac7ae7bb7910c493488c3141076f06ae618cad7f6053e7fc28ec39bebf96f3d |
| Ingredient forms | 98 forms; no form for target | b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c |
| Legacy import candidates | 64 candidates; no kodo/kodra candidate | 69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005 |
| Research ledger | 1,644 records; 6,188 source entries; 5,192 distinct source IDs; target identity verified, measurement and substitution not yet researched | 30fffbf5cb46bfdad24b7e9620c0e16cc69eb886378e3c77a246db412eda485b |
| Seed manifest | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | fingerprint above |

The target ingredient reference is ingredient-ref-kodo-millet-flour. The existing ledger record has sources WP02-A6-MILLET-FLOUR-IDENTITIES-20261012-S01 through S03 and an accepted decision that intentionally added no aliases. The proposed source IDs are absent from the current ledger and every other proposal/batch file after the final recheck.

## Proposed ledger delta if integrated

Keep the existing record ID and identityState verified. Append source entries S01–S08 and an accepted decision for the single English alias, citing S01–S03 for that alias. Record S08 only as regional grain-name context. Add:

- One measured bulk_density observation of 0.68 g/mL linked to S04. Preserve the source’s reported 0.68 ± 0.00, sample provenance, and method limitation in quantityBasis/foodState; do not infer a household fill convention.
- One published portion_weight observation linked to S05: sourceQuantity 1 cup, value/valueUnit 250 g, observedMassG 250; explicitly state that the cup convention and flour filling method are unspecified and that the observation is one Tamil recipe only.
- Separate formula-scoped substitution findings linked to S06 and S07. Retain the respective flatbread composite and heat-treated muffin conditions; do not imply a global substitute.
- measurementState researched_supported and substitutionResearchState blocked_pending_evidence.

The exact observation/finding IDs may use the following checked-unique IDs:

- WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-DENSITY-01
- WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-PORTION-01
- WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-SUBSTITUTION-FLATBREAD
- WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-SUBSTITUTION-MUFFIN

## Proposal-local source register

All sources were accessed or search-checked on 2026-10-13. The unique S01–S08 IDs below are proposal-local; they have not been added to the shared ledger.

| ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S01 | Veehacart, [Organic Mandya Organic Kodo Millet Flour - 500 gms](https://veehacart.ca/products/organic-kodo-millet-flour), product title and description as returned in the search-indexed listing. | Canadian-facing product copy says Kodo Millet Flour is also known as Kodo Millet Atta or Kodo Flour. Listing showed 500 g and CAD pricing, and a sold-out status; its indexed crawl age was three months and direct page open returned Cache miss. Use for the exact label wording, not current availability. |
| WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S02 | Veehacart, [Legal Information](https://veehacart.ca/pages/legal-information), company information and registration lines 77–92. | Identifies Veehacart as owned and operated by a Canadian registered company, with Paris, Ontario contact details. Establishes the Canadian seller context only, not the flour identity or alias. |
| WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S03 | Organic Mandya, [Kodo Millet Flour (Kodo Atta / Harka Atta)](https://organicmandya.com/products/kodo-millet-flour-500-gm), title and description lines 115–155 and FAQ lines 240–253. | Manufacturer page identifies Kodo Atta as its kodo-millet flour. It supports the product/atta relationship but is an Indian maker source, not Canadian market or Québec French evidence. Other regional names on the page are not added here. |
| WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S04 | Srilekha et al., “Evaluation of physical, functional and nutritional quality parameters of kodo millet flour,” Journal of Pharmacognosy and Phytochemistry 8(4) (2019), 192–195, [journal page and full text](https://www.phytojournal.com/archives/2019.v8.i4.8848/evaluation-of-physical-functional-and-nutritional-quality-parameters-of-kodo-millet-flour). | Methods/results pp. 193–194: local-market kodo grains were cleaned and milled; the authors report bulk density 0.68 ± 0.00 g/mL and cite Stojceska et al. for their method. The paper does not establish a household cup measure or packing convention. |
| WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S05 | Millet Revival Project, [Kodo Millet Thattai](https://milletrevivalproject.in/2024/07/17/kodo-millet-thattai/), published 2024-07-17, recipe ingredient line and context. | Tamil thattai recipe identifies varagu arisi maavu as kodo millet flour and lists 1 cup or 250 grams. Cup volume and flour filling method are unstated; preserve only as a single recipe portion, not a density or general mapping. |
| WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S06 | Sharma and Gujral, [“Modulation in quality attributes of dough and starch digestibility of unleavened flat bread on replacing wheat flour with different minor millet flours”](https://doi.org/10.1016/j.ijbiomac.2019.08.252), International Journal of Biological Macromolecules 141 (2019), 117–124. | The study tests kodo among minor-millet flours in an unleavened flatbread composite with a reported 3:1 proportion. This is one formula and does not establish a general wheat-flour replacement ratio. |
| WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S07 | Thakur et al., [“Valorization of kodo millet for gluten-free muffin: Physicochemical characteristics, textural profile, and storage stability”](https://doi.org/10.1016/j.bcdf.2026.100528), Bioactive Carbohydrates and Dietary Fibre 35 (2026), article 100528. | Publisher abstract/search-index evidence reports best muffin results with flour treated at 30% moisture and 100°C, particularly at 75% replacement. This result is treatment- and recipe-specific; the full ScienceDirect page returned 403 during review and no universal rule is inferred. |
| WP02-A6-KODO-MILLET-ATTA-ALIAS-20261013-S08 | ICAR–Indian Institute of Millets Research, [Millets Information: common names in Indian languages](https://millets.res.in/millets_info.php), kodo-millet entry, page updated 2026-07-07. | Lists regional grain names including Harka (Kannada), Kodra (Gujarati/Marathi/Punjabi), Kodon (Hindi), Varagu (Tamil), and Arikelu/Arika (Telugu). This is an official regional grain-name cross-check, not flour- or atta-name evidence; none of these terms is proposed as an alias. |

## Verification evidence and limits

- Confirmed the target proposal path did not exist before writing.
- Checked exact phrase ownership across active reference names/aliases, forms and match terms, legacy candidate names/aliases, and ledger record IDs; kodo millet atta had no owner.
- Checked all proposed source IDs against current ledger source IDs and every other proposal/batch file; no collisions were found.
- Reproduced the production picker normalizer and phrase-first/substring-fallback behavior using the live reference and form data; the results are shown above.
- Audited all 114 manifest-listed recipe files and all 1,123 ingredient rows; no matching recipe demand or direct target link was found.
- No app tests or emulator checks were run because this is a proposal-only review.

