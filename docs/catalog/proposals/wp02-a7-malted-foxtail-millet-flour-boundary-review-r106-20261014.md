# WP02 A7 review: malted foxtail millet flour boundary

- **Review date:** 2026-10-14
- **Workstream:** WP02, Section 04, A7
- **Candidate:** malted foxtail millet flour
- **Disposition:** **Hold; leave unallocated.** Do not add a reference, alias, legacy identity, ledger candidate, form, recipe link, active measure, conversion, yield, or substitution.
- **Scope:** Review the single-species flour made from malted foxtail millet, *Setaria italica*. This is a new candidate boundary under A7's open request to review other malted and toasted flour identities; it does not reopen earlier A7 decisions.

## Recommendation and product boundary

Primary studies establish food-research use of malted foxtail millet and malted foxtail millet flour. One 2022 cookie paper says malted foxtail flour was purchased under the Vedaka brand from an Indian e-commerce site, so the term is not merely hypothetical. The paper does not identify a product SKU, malting protocol, flour grade, package label, or current Canadian/Québec product. A 2011 study standardizes malting for two foxtail-millet varieties but studies malted grain samples rather than a retail flour. Current Canadian listings reviewed here identify plain foxtail millet flour. No Québec French display for a malted product was found.

**Keep the candidate on hold.** The source record does not yet connect the Indian branded research input to a current consumer product specification that can be named for this catalog, and there is no source-supported Québec French product display. This bounded hold does not claim that no such product exists in any market.

Keep these boundaries separate:

- `ingredient-ref-foxtail-millet` — foxtail millet grain / `millet d'Italie`.
- `ingredient-ref-foxtail-millet-flour` — plain foxtail millet flour / `farine de millet d'Italie`.
- `ingredient-ref-malt-flour` — generic malt flour / `farine maltée`, with `malted cereal flour` as an English alias. It is not a species-specific malted-grain flour alias.
- Malted finger millet, pearl millet, Kodo, and other cereal-specific flour candidates already reviewed in A7. Their species and evidence do not make a universal “malted millet flour” identity.
- Composite flours and foods containing malted foxtail millet, including the cookie blend of malted foxtail and lentil flour and the 2025 mixed-millet beverage study.
- Foxtail millet rava, plain flour, germinated flour, and toasted or otherwise heat-treated millet products. A shared grain source does not establish a shared process or ingredient identity.

If future evidence supports a catalog row, assess it as a species- and process-qualified `FLOUR_AND_STARCH` identity separate from plain foxtail flour. This proposal does not allocate a canonical ID or approve a French name.

## English and Québec French naming

English research literature uses `malted foxtail millet flour`. The 2022 paper describes that ingredient as purchased from a named Indian brand; a 2011 paper supports malting of the foxtail grain itself. The current Ontario seller page uses `Foxtail Millet Flour` for a stone-ground plain flour, while a Canadian French-facing retailer uses `Farine de millet S&V Foxtail` for plain flour.

The OQLF's 2010 *millet des oiseaux* entry identifies *Setaria italica* and lists `millet d'Italie`, `millet des oiseaux`, and other grain names as preferred terms. It does not name flour or malted flour. The OQLF entry for `farine maltée` defines flour with malt extract or ground malt added. Do not reuse that phrase as an alias for flour milled from previously malted foxtail grain.

No reviewed Canadian or Québec product page names malted foxtail flour in French. Do not invent or add `farine de millet d'Italie maltée`, `farine de millet des oiseaux maltée`, `farine maltée de millet`, `malted millet flour`, `malted flour`, or `foxtail flour` as candidate aliases. Keep the existing plain-flour displays and aliases unchanged.

## Ownership and picker projection

At the review snapshot, the active catalog has 1,444 references, the form file has 105 entries, the legacy import file has 63 identities, and the research ledger has 1,784 records. The current neighboring rows are:

| Reference | Current names and aliases | Active numeric fields |
|---|---|---|
| `ingredient-ref-foxtail-millet` | EN `foxtail millet`; FR `millet d'Italie`; EN aliases `thinai`, `kangni`, `korra`, `rala`, `navane` | `defaultDensity: null`; `unitMappings: []` |
| `ingredient-ref-foxtail-millet-flour` | EN `foxtail millet flour`; FR `farine de millet d'Italie`; EN aliases `thinai flour`, `kangni flour`, `korra flour`, `navane atta` | `defaultDensity: null`; `unitMappings: []` |
| `ingredient-ref-millet-flour` | EN `millet flour`; FR `farine de millet` | `defaultDensity: null`; `unitMappings: []` |
| `ingredient-ref-malt-flour` | EN `malt flour`; FR `farine maltée`; EN alias `malted cereal flour` | `defaultDensity: null`; `unitMappings: []` |

No active row or form owns malted foxtail millet flour. No exact candidate appears in the 63 legacy identities or 1,784 ledger records, and no focused earlier A7 proposal or integration batch reviews this candidate. The current plain foxtail flour ledger record has measurements and one recipe-specific plain-flour substitution finding, described below; neither is a malted-flour record.

The picker normalizes accents, case, and punctuation, checks complete word phrases before substring fallback, and includes attached form terms ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Static projection over the current references and forms shows:

| Query | Current result |
|---|---|
| `malted foxtail millet flour`, `malted foxtail flour`, `farine de millet d'Italie maltée` | No result |
| `foxtail millet flour`, `farine de millet d'Italie` | `ingredient-ref-foxtail-millet-flour` |
| `foxtail millet`, `foxtail` | `ingredient-ref-foxtail-millet` and `ingredient-ref-foxtail-millet-flour` |
| `malted cereal flour`, `farine maltée` | `ingredient-ref-malt-flour` |

A hypothetical English display `malted foxtail millet flour` would make that full query return the new candidate, and would expand `foxtail millet flour`, `foxtail millet`, and `foxtail` searches to include it. If a later French display contains the existing plain-flour phrase, that phrase would also return both plain and malted rows. This is a meaningful picker collision to disclose before any future addition; no picker term is added by this hold.

## Recipe demand

The [bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists 114 recipe files. Scanning all files and their 1,123 structured ingredient rows found:

- zero serialized recipe files or ingredient rows mentioning foxtail millet, thinai, malted foxtail flour, or `millet d'Italie`;
- zero ingredient references linked to `ingredient-ref-foxtail-millet` or `ingredient-ref-foxtail-millet-flour`.

The bundled library has no direct demand for either the candidate or the current plain foxtail flour and provides no recipe link or line quantity for this review.

## Forms, measures, and substitutions

No active form references foxtail millet or its plain flour, and no form is proposed. The plain foxtail-flour ledger record reports two laboratory bulk-density endpoints, **502.6 and 534.9 kg/m³**, across a study's moisture-dependent samples. They are not household cup measures or an active default density ([Subramanian and Viswanathan, 2007](https://doi.org/10.1016/j.jfoodeng.2006.09.026)). No exact-form household measure or density for malted foxtail flour was found. Leave the candidate's density and unit mappings absent.

The existing plain-flour ledger finding is blocked and scoped to a 2023 wheat bread-ready-mix formulation: the study tested 0–40% foxtail-flour blends and selected 30% for that formula. It does not study malted foxtail flour and does not support a general substitution rule. The 2022 malted-flour cookie paper's optimized formula used **59.5% refined wheat flour, 10% malted foxtail millet flour, and 30.5% malted lentil flour**. Those are proportions in a tested composite cookie formula, not a reusable home-baking replacement ratio. No global conversion, yield, or contextual substitution is proposed.

## Source register and limits

The online pages and bibliographic records were checked on 2026-10-14. Source publication and terminology dates are listed where supplied. The publisher landing page for the 2025 mixed-millet paper served unrelated spam content during this check; its article metadata and abstract were cross-checked against the FAO AGRIS record, and the publisher DOI is retained as bibliographic information only.

| ID | Source and date | What it supports | Limit |
|---|---|---|---|
| `WP02-A7-MALTED-FOXTAIL-MILLET-FLOUR-20261014-R106-S01` | Choudhury, Das, and Baroova, [“Nutritional evaluation of popped and malted indigenous millet of Assam”](https://pubmed.ncbi.nlm.nih.gov/23572808/), *Journal of Food Science and Technology* 48(6), 706–711; published December 2011; DOI 10.1007/s13197-010-0157-3. | Primary paper's abstract says malting was standardized for two local varieties of foxtail millet (*Setaria italica*) and reports results for malted grain samples. | Does not establish a flour product, commercial grade, Canadian availability, Québec French name, or household measure. |
| `WP02-A7-MALTED-FOXTAIL-MILLET-FLOUR-20261014-R106-S02` | Surya Teja et al., [“Optimization and Characterization of Cookies from Malted Foxtail Millet and Lentil Flour”](https://doi.org/10.47509/JFAR.2022.v02i02.01), *Journal of Food and Agriculture Research* 2(2), 77–93; published 2022-12-30; DOI 10.47509/JFAR.2022.v02i02.01. | Primary paper reports malted foxtail millet flour purchased under the Vedaka brand through an Indian e-commerce site and a cookie formula with 10% malted foxtail flour. | No SKU, label, malting protocol, flour grade, current product page, Canadian availability, Québec French name, or household measure is established. The optimized proportions are specific to the tested composite cookie formula. |
| `WP02-A7-MALTED-FOXTAIL-MILLET-FLOUR-20261014-R106-S03` | TastyGrains, [Foxtail Millet Flour - NFS](https://www.tastygrain.ca/products/foxtail-millet-flour-nfs), current Ontario page observed 2026-10-14. | Names a Canadian seller's plain foxtail flour, describes it as stone-ground and finely milled, and gives a Kitchener, Ontario contact address. | It is not malted; the page's stock indicators conflict and are not used as stable availability evidence. Package weight is not a recipe measure. |
| `WP02-A7-MALTED-FOXTAIL-MILLET-FLOUR-20261014-R106-S04` | Spice Divine, [Farine de millet S&V Foxtail 2 lb](https://spicedivine.ca/fr/products/sv-foxtail-millet-flour), Canadian French-facing product listing observed 2026-10-14. | Uses a French display for plain foxtail millet flour. | It does not identify malted flour or establish OQLF terminology; its package mass is not a household measure. |
| `WP02-A7-MALTED-FOXTAIL-MILLET-FLOUR-20261014-R106-S05` | OQLF, [*millet des oiseaux* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), last updated 2010. | Identifies *Setaria italica* and lists `millet d'Italie` and other preferred French terms for the plant/grain. | Does not name foxtail flour or a malted product. |
| `WP02-A7-MALTED-FOXTAIL-MILLET-FLOUR-20261014-R106-S06` | OQLF, [*farine maltée* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432785/farine-maltee), last updated 1982. | Defines `farine maltée` as flour with malt extract or ground malt added. | It does not name flour milled from malted foxtail grain; do not use it as an alias for this candidate. |
| `WP02-A7-MALTED-FOXTAIL-MILLET-FLOUR-20261014-R106-S07` | Swarnalatha, Kumar, and Madhavi, [“Malted Multi-millet based Probiotic Dairy Beverage: Nutritional, Sensory, Physicochemical and Microbiological Characterization” (FAO AGRIS record)](https://agris.fao.org/search/en/providers/122436/records/68b6b7c468d9e6806700435e), *International Journal of Economic Plants* 12(4), 1–5, 2025; DOI 10.23910/2/2025.6225. | The record reproduces the paper abstract describing flour ground from malted finger, foxtail, and little millet grains and used as equal-part mixed millet flour in a probiotic lassi study. | The flour is a mixed-species research ingredient, not a standalone foxtail flour product or consumer label; it does not support single-species identity, Canadian availability, Québec French naming, or household measures. |

The plain-flour measurement and substitution observations remain attached to `ingredient-ref-foxtail-millet-flour` in the research ledger; this proposal adds no ledger record or duplicate observation. The source for the plain-flour substitution finding is [“Quality characterization, bread making properties and storage stability of foxtail millet incorporated bread ready-mix”](https://doi.org/10.1016/j.jspr.2023.102208), *Journal of Stored Products Research* 104 (2023), article 102208. Its result remains specific to the studied bread formula.

## Reopen criteria

Reconsider an active row when a current Canadian or Québec-facing source identifies a standalone malted foxtail-flour product and supplies enough product wording or declaration detail to distinguish it from plain flour, generic malt flour, and composite malted-millet products. Obtain independent Québec review of the French display. Then rerun exact-key ownership and picker projections. Any accepted row should remain identity-only until separate evidence supports aliases, forms, exact-form measures, density, mappings, recipe links, conversions, yields, or substitutions.

## Static checks

- Confirmed this candidate has no focused earlier A7 proposal or integration batch, no exact active owner, no form, no legacy identity, and no ledger candidate.
- Checked all manifest-listed recipes and ingredient rows, current picker search behavior, active references, forms, legacy identities, and relevant plain-flour ledger observations.
- Verified the cited primary research, Canadian plain-product pages, and Québec terminology pages online on 2026-10-14.
- Created this proposal only. No shared catalog, ledger, plan, roadmap, code, recipe, or generated file was changed. No app, Gradle, or emulator tests were run.
