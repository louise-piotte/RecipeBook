# WP05 Section W R980 generic preserved-food gap review: Dongbei suancai

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-stage identity, boundary, measurement, and substitution review. The root accepted and integrated the identity in the [R978–R980 integration README](../batches/wp02-wp03-wp05-r978-r980-generic-gap-integration-20261019/README.md); the snapshot and recommendations below describe the pre-integration review.
- **Plan anchor:** The open Section W checklist includes Chinese preserves and “further documented regional preserves” in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10360).
- **Recommendation:** Add identity-only generic `Dongbei suancai / Dongbei suancai` for the Northeast Chinese fermented cabbage preserve. Keep the regional name in both displays, with the French display provisional and borrowed. Do not add the unqualified `suan cai` as an alias.
- **Scope:** One generic regional preserve. No brands, product lines, flavour families, SKUs, or retailer variants were researched. Existing branded identities and product-scoped evidence remain untouched.

## Pre-integration snapshot and ownership audit

Recounted the shared data before integration on 2026-10-19:

| Artifact | Count |
|---|---:|
| Ingredient references | 1,995 |
| Ingredient forms | 205 |
| Legacy-import candidates | 55 |
| Research-ledger records | 2,400 |
| Research-ledger source entries / distinct source IDs / distinct URLs | 11,268 / 9,461 / 8,052 |
| Manifest-listed recipe files / ingredient rows | 114 / 1,123 |

Case-, punctuation-, and accent-normalized searches of reference IDs, names and aliases, form labels and match terms, legacy candidates, ledger record IDs, and all recipe text and ingredient fields found no owner for `Dongbei suancai`, `Dongbei suan cai`, `Northeast Chinese suancai`, `Northeast China suancai`, `suan cai`, `suan-cai`, `suancai`, or `酸菜`. Raw-script searches also found no `东北酸菜`. The proposed `ingredient-ref-dongbei-suancai` ID and source prefix `WP05-SECTIONW-DONGBEI-SUANCAI-R980-20261019-` are unowned. No earlier proposal or batch assigns this region-qualified identity.

The ledger does mention unqualified `suan cai` in the `ingredient-ref-mei-gan-cai` evidence, where Hakka preserved-mustard products are distinguished. That is boundary evidence, not an identity owner. The earlier [Section W preserved-vegetable boundary review](wp05-section-w-regional-preserved-vegetable-boundary-review-20261012.md) held broad `suan cai` because sources use the term for products with different regional and vegetable scopes. This proposal addresses only the Northeast Chinese-cabbage product supported below.

Nearby active identities establish boundaries, not ownership:

| Active identity | Existing scope | Boundary retained |
|---|---|---|
| `ingredient-ref-napa-cabbage` — `Napa cabbage / chou nappa` | Raw Chinese cabbage. | The finished preserve is not a raw-vegetable alias or form; no fresh-cabbage amount is a finished-food measure. |
| `ingredient-ref-pickled-mustard-greens` — `pickled mustard greens / feuilles de moutarde marinées` | Generic preserved mustard greens. | Keep the proposed Napa-cabbage preserve separate; do not turn either name into a catch-all for Chinese fermented greens. |
| `ingredient-ref-mei-gan-cai` — `mei gan cai / feuilles de moutarde séchées (Meigan Cai)` | Hakka dried leaf-mustard preserve. | Different region, substrate, and product description; preserve its evidence and do not alias it to Dongbei suancai. |
| `ingredient-ref-zha-cai` — `zha cai / zha cai` | Named preserved mustard-tuber product. | Distinct substrate and named product; no synonym or substitution is supported. |
| `ingredient-ref-yibin-ya-cai` — `Yibin ya cai / Yibin ya cai` | Geographically bounded Yibin preserve. | Keep its existing regional identity and evidence separate. Do not add generic `ya cai` or cross-preserve aliases. |
| `ingredient-ref-kimchi` — `kimchi / kimchi` | Generic Korean kimchi identity. | Similar fermentation or cabbage use does not make kimchi a synonym or substitute for this Chinese regional preserve. |

The open Section W preserve checklist remains open. No roster-only queue item was encountered. If one appears, mark it out of scope because commercial-product counts do not add ingredient diversity, then stop that line. Preserve existing branded rows and product-scoped evidence; do not generalize them without a transferability review.

## Recipe demand

All 114 manifest-listed recipes and 1,123 ingredient rows were scanned, including serialized recipe text, `originalText`, `ingredientName`, and reference IDs. Queries for the candidate name, common spellings, `Northeast Chinese fermented cabbage`, and the Chinese name returned no matches. The corpus contains no direct demand or recipe context; no recipe link or relinking is proposed. General Napa-cabbage demand, if present, does not establish demand for the finished preserve.

## Identity evidence and naming

An original research paper describes suan cai as a traditional Northeast China preserve made generally from Chinese cabbage and used as a winter food. A separate comparative study treats Dongbei suancai as one named regional fermented-vegetable type alongside Jiangxi yancai and Sichuan paocai, and reports household samples collected in Heilongjiang, Sichuan, and Jiangxi respectively. These sources support a regional generic identity, not a universal identity for every food called `suan cai`. [S01–S02]

The term must stay geographically qualified. A 2024 study of Bashang suancai states that it uses common head cabbage, while Dongbei suancai uses Chinese cabbage, and describes different regional fermentation seasons. This is enough to keep Bashang suancai separate; it does not make Bashang data or practices transferable to Dongbei suancai. Other regional products already represented in the catalog, such as mei gan cai, zha cai, and Yibin ya cai, remain separately owned. [S03]

The proposed English display `Dongbei suancai` follows the comparative study's source spelling. No Québec-specific French name was found in the targeted terminology search. OQLF's `chou de Chine` entry names raw Chinese cabbage and its types; it does not name this preserve. Keep `Dongbei suancai` as a provisional borrowed French display and add no translated alias such as `chou fermenté du Nord-Est de la Chine`. Do not activate `Chinese sauerkraut`, `sauerkraut`, `pickled cabbage`, `fermented Chinese cabbage`, `suan cai`, `suan tsai`, or `suancai` as aliases: these terms are broader or are used for other regional preserve products. [S01, S04]

The 2014 paper's study protocol uses Chinese cabbage air-dried for two days, salt at 1% of cabbage mass, a 750 L jar, a stone weight, and 30 days of fermentation. These are that paper's method details only; they are not a universal formula, preparation instruction, food-safety protocol, or catalog form. Keep all source amounts and steps within their source context. [S01]

## Measurement and substitution review

The literature reports process-specific salt ratios, batch sizes, fermentation periods, and laboratory results, but none supports a finished-product mass, serving, household measure, density, unit mapping, yield, or preparation-independent conversion. If integrated, set `measurementState: researched_no_supported_value`, retain null density and an empty `unitMappings` array, and add no forms or measurement observations. Do not transfer the 1% salt ratio or 750 L jar from S01, or any Bashang study process from S03.

No reviewed source recommends a substitute for the finished Dongbei preserve in a defined dish, role, method, or amount. Recipe demand is absent. Keep `substitutionResearchState: blocked_pending_evidence`; add no active substitution rule or recipe-line link. Do not treat napa cabbage, generic pickled mustard greens, mei gan cai, zha cai, Yibin ya cai, kimchi, Bashang suancai, Sichuan paocai, or Jiangxi yancai as a replacement based on shared vegetable or fermentation language.

## Unsupported limits

The evidence supports a region-qualified preserve identity, but not a complete definition of all Dongbei household or commercial preparations. It does not establish a universal ingredient list, salt level, fermentation time, acidity, cut, drained state, serving measure, finished mass, shelf life, or safety protocol. Keep the 1% salt and 30-day method within S01, and do not apply Bashang procedures from S03 to Dongbei suancai.

The sources do not establish that this product is equivalent to European sauerkraut, Korean kimchi, Sichuan paocai, Jiangxi yancai, or any generic pickled cabbage or mustard-green identity. They do not support aliases, recipe substitutions, recipe links, or a Québec-approved French preserve name. No manufacturer or retailer evidence was sought, so this proposal makes no claim about current commercial availability or product formulations.

## Proposed minimal state and source register

| Field | Candidate state |
|---|---|
| Candidate ID | `ingredient-ref-dongbei-suancai` |
| `nameEn` | `Dongbei suancai` |
| `nameFr` | `Dongbei suancai` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases / French aliases | None / none |
| Forms, density, unit mappings, measures, conversions, yields | None supported |
| Recipe links and active substitutions | None |
| Ledger states if integrated | `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence` |

The four R980 source IDs were proposal-local at review time and are now allocated to the integrated identity record. The sources were accessed online on 2026-10-19.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-DONGBEI-SUANCAI-R980-20261019-S01` | Hongyan Yang et al., [“Dominant Microorganisms during the Spontaneous Fermentation of Suan Cai, a Chinese Fermented Vegetable”](https://www.jstage.jst.go.jp/article/fstr/20/5/20_915/_html/-char/ja), *Food Science and Technology Research* 20(5), 2014, pp. 915–926, [DOI: 10.3136/fstr.20.915](https://doi.org/10.3136/fstr.20.915). | Original study. Describes Northeast China suan cai as a traditional Chinese-cabbage preserve and winter food. Its 1% salt, 750 L jar, and 30-day protocol are specific to the reported study and are not reusable measures or a universal method. |
| `WP05-SECTIONW-DONGBEI-SUANCAI-R980-20261019-S02` | Muyan Xiao et al., [“The Microbial Communities and Flavour Compounds of Jiangxi Yancai, Sichuan Paocai and Dongbei Suancai: Three Major Types of Traditional Chinese Fermented Vegetables”](https://doi.org/10.1016/j.lwt.2019.108865), *LWT* 121, 2020, article 108865. | Comparative original study. Names Dongbei suancai separately from the Jiangxi and Sichuan products and describes household sample origins by province. It supports regional product separation, not a universal taxonomy or transferable ingredient formula. |
| `WP05-SECTIONW-DONGBEI-SUANCAI-R980-20261019-S03` | Yuan Liu et al., [“Characterization of the Microbial Communities and Their Correlations with Volatile Flavor Compounds and Physicochemical Factors in Bashang Suancai, a Traditional Chinese Pickle”](https://www.frontiersin.org/journals/microbiology/articles/10.3389/fmicb.2024.1478207/full), *Frontiers in Microbiology* 15, 2024, article 1478207, [DOI: 10.3389/fmicb.2024.1478207](https://doi.org/10.3389/fmicb.2024.1478207). | Original study of Bashang suancai. Its introduction distinguishes Bashang from Dongbei suancai by region, cabbage type, and season; the study's own process and measurements concern Bashang only. Use it as a boundary source, not evidence for Dongbei preparation. |
| `WP05-SECTIONW-DONGBEI-SUANCAI-R980-20261019-S04` | Office québécois de la langue française, [“chou de Chine” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082728/chou-de-chine). | Supports Québec French wording for raw Chinese cabbage. It does not name suan cai or establish a French term for this preserve. No preserve alias is inferred from it. |

**Disposition:** Propose identity-only `Dongbei suancai / Dongbei suancai` in `SAUCE_AND_CONDIMENT`, with no aliases, forms, numeric behavior, recipe links, or active substitutions. Keep the French display provisional. Preserve the broader unqualified `suan cai` hold and all existing identities and source-scoped evidence. No commercial-product roster was researched. No software tests or builds were run because this packet is proposal-only.

## Document checks

- UTF-8 decoded cleanly without a byte-order mark, replacement character, or mojibake marker.
- The relative plan link resolves; external source links use HTTPS.
- Proposal-local source IDs are unique and are not claimed to exist in the live ledger.
- Current catalog, form, legacy, ledger, and full recipe-corpus counts were recomputed from the live files.
- No software tests or builds were run for this documentation-only proposal.
