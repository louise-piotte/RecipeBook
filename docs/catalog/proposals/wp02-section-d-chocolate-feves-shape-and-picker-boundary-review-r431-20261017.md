# WP02 Section D proposal: chocolate fèves, drops, and the picker boundary (R431)

**Date:** 2026-10-17
**Status:** Reviewed and integrated as a documentation-only hold; see the [R431 integration README](../batches/wp02-section-d-r431-chocolate-feves-hold-integration-20261017/README.md).
**Disposition:** **Hold** a generic chocolate-fèves/drop form and its aliases in the shared catalog.

## Scope and recommendation

The open Section D checklist still names chocolate bars, chunks, wafers, fèves, grated/chopped chocolate, and other product forms. R424 held generic chunks and R427 held wafers. This proposal reviews only the unresolved *fèves* boundary: whether a producer’s use of “fèves” justifies a generic global form or alias on the existing chocolate references.

The evidence confirms that chocolate drops are a real shape. It does not make **fèves** a safe unqualified picker term: Valrhona says it calls its own couverture pistoles “fèves,” while its English and French terminology pages say drops/pistoles, beans/fèves, and chips/pépites can refer to slightly different shapes. A current bilingual Canadian listing uses *Valrhona Jivara Fèves* for one brand and chocolate type; Callebaut uses *Callets* on its own white-chocolate products. OQLF uses *fève* in Québec French for cacao seed and for edible legumes, which already creates active picker matches.

**Recommendation:** add no identity, alias, or form. Keep existing chocolate-type references and chip/melted forms unchanged. Do not add bare `fève`/`fèves`, `chocolate fèves`, `chocolate drops`, `pistoles de chocolat`, or `callets` to a reference or form at this time. These terms name a shape/product presentation, not a new chocolate composition class, and the bundled recipe corpus has no demand for them. This is a narrower source-naming review of the prior no-demand hold, not a reopening of chunks or wafers.

**Root review addendum:** OQLF also has a current generic entry for `pépite de chocolat` / chocolate chip. It describes a small baking-chocolate piece, often drop-shaped, with less cocoa butter so it keeps its shape during baking. That is relevant evidence for the existing chip identity/forms, but it does not establish `pistole`, `fève`, or Valrhona’s couverture drop as an alias or equivalent form. The picker still has no standalone chocolate-drop owner, and no recipe requests one. See S09 below.

## Candidate wording and exact data delta

The sources reviewed attest these terms at different scopes:

| Scope | English wording | French wording | Supported boundary |
|---|---|---|---|
| General shape wording used by the manufacturer’s terminology page | `chocolate drops` | `pistoles de chocolat` | Product-shape terms; not a separate ingredient identity. No Québec generic naming entry was found in the targeted OQLF search. |
| Valrhona product naming | `Valrhona Jivara Lactée Milk Chocolate Feves` | `Chocolat au lait Valrhona Jivara Fèves` | Brand- and product-specific; do not strip the chocolate type or brand context into a global alias. |
| Callebaut product naming | `Callebaut White Chocolate W – 2.5kg Callets` | No French label was reviewed on this Canadian page | Another producer’s product wording; not established as equivalent to Valrhona’s fèves or a general form name. |

| Data | R431 delta |
|---|---:|
| Ingredient references / identities | 0 |
| Aliases | 0 |
| Ingredient forms | 0 |
| Recipe links or text edits | 0 |
| Shared-ledger records | 0; source IDs below are packet-local |
| Densities, unit mappings, package yields, or active measures | 0 |
| Global or contextual substitution rules | 0 |

## Current ownership, forms, and picker impact

At this audit snapshot the seed has **1,725 active references** and **141 forms**; the legacy import file has **56 candidates**; the research ledger has **2,084 records** and **8 unit-conversion observations**. Exact normalized candidate wording was checked against active reference and form labels/aliases, legacy candidates, ledger records, and current identifiers. No active owner or form exists for `chocolate drops`, `chocolate fèves`, `fèves de chocolat`, `pistoles de chocolat`, or `callets`; no legacy candidate or candidate-specific ledger record exists for this chocolate presentation. Broader ledger uses of *fève* concern cacao or legumes and are not evidence for a chocolate-drop identity/form.

Relevant active owners are:

- `ingredient-ref-couverture-chocolate` — `couverture chocolate / chocolat de couverture`, no aliases, density, or unit mappings.
- Existing chocolate-type identities, including semisweet, white, dark, milk, bittersweet, and unsweetened chocolate. The active product shapes are six recipe-attested forms: chips for semisweet, white, dark, and milk chocolate, plus melted semisweet and white chocolate. All six have null form density. There is no drop, fève, pistole, or callet form.
- `ingredient-ref-cocoa-nibs` — `cocoa nibs / cacao en grains`, a processed cacao-seed product distinct from finished chocolate.
- `ingredient-ref-fava-beans`, `ingredient-ref-edamame`, and `ingredient-ref-soybeans`, whose existing Québec French names or aliases include *fève(s)*.

Replaying the shared ingredient-search phrase matching against the current refs/forms gives:

| Query | Current picker result | Consequence |
|---|---|---|
| `fève` | Edamame; fava beans | Bare singular is already ambiguous across edible legumes. |
| `fèves` | Edamame; soybeans | Bare plural is already ambiguous across edible legumes. |
| `fèves de chocolat`, `chocolate fèves`, `chocolate drops`, `pistoles de chocolat`, `callets` | No results | No current chocolate presentation owner; no recipe-driven alias gap to fix. |

Adding bare `fève` or `fèves` would broaden those existing legume searches and would not reliably select a chocolate type. OQLF's generic `pépite de chocolat` entry describes baking chips that often have a small drop shape and retain their form during baking; it does not establish equivalence with Valrhona's couverture pistoles/fèves or justify a broad drop alias. A future chocolate presentation should retain its chocolate type and be considered as a form on that type only after a recipe or concrete picker need identifies the shape. The separate `chocolate shavings` identity and existing chips forms remain unchanged.

## Complete bundled recipe scan

The manifest lists **114 recipe files and 1,123 ingredient rows**. I scanned every string value in every manifest-listed recipe, including bilingual titles, descriptions, instructions, ingredient fields, preparation, and notes. I separately scanned ingredient-row text fields and instruction/description/title/note text for `fève(s) de chocolat`, `chocolate fève(s)`, `chocolate drop(s)`, `pistole(s) de chocolat`, `chocolate callet(s)`, and standalone `pistole(s)`/`callet(s)` terms.

- Candidate-term hits in all serialized recipe text: **0**.
- Candidate-term hits in ingredient rows: **0**.
- Candidate-term hits in instructions, descriptions, titles, or notes: **0**.

The corpus does contain ingredient rows and other text for existing chocolate chips, chopped preparation, and shavings. Those are separate authored needs already represented by chip forms, preparation text, or the shavings identity; none asks for a drop/fève/pistole/callet product. No recipe relink, form hint, or text edit is supported.

## Measurement and substitution status

All current chocolate references reviewed have `defaultDensity: null` and empty `unitMappings`; each active chocolate form has `densityGPerMl: null`. The eight ledger unit-conversion observations contain no chocolate/cocoa conversion. The two active substitution-rule arrays each contain zero rules. The sole package-yield record is for canned black beans, not chocolate.

Valrhona’s own terminology page reports typical chocolate drops at about **2 g each** and its own fèves at **3.8 g each**. These are source-specific piece weights with different shapes; they are not a volume-to-mass conversion, a density, or a transferable count measure for other brands/forms. Fun Foods Canada’s 3 kg Jivara listing is a product package, not a reusable kitchen conversion. Existing chocolate-chip portion observations remain chip-specific and cannot be transferred to drops/fèves. No substitution from drops/fèves to chips, bars, or another chocolate type is established.

Keep measurement and substitution data inactive. If a future recipe specifically requests a drop/pistole shape, establish the chocolate base identity, exact bilingual form wording, and measure separately; do not infer them from a producer’s per-piece weight or bag size.

## Sources and evidence limits

Sources reviewed 2026-10-17. These proposal-local source IDs are not added to the shared ledger.

| ID | Source and evidence used | Limit |
|---|---|---|
| `WP02-D-CHOC-FEVES-R431-20261017-S01` | Valrhona, [Que sont les pistoles (ou fèves) de chocolat ?](https://www.valrhona.com/faq/lexique-definitions/que-sont-les-pistoles-ou-feves-de-chocolat). Explicitly says pistoles are called “fèves” at Valrhona and describes them as small couverture-chocolate discs. | Strong evidence for Valrhona’s house wording and use; it does not establish a Québec-preferred generic alias. |
| `WP02-D-CHOC-FEVES-R431-20261017-S02` | Valrhona, [Pistoles de Chocolat](https://www.valrhona.com/fr-FR/l-ecole-valrhona/decouvrir-l-ecole-valrhona/lexique-du-chocolat/pistoles-de-chocolat). Describes round, flat pistoles, distinguishes them from fèves/pépites by shape, and reports 2 g typical pistoles versus 3.8 g Valrhona fèves. | Manufacturer terminology and shape/weight evidence; not a transferable measure or Québec language authority. |
| `WP02-D-CHOC-FEVES-R431-20261017-S03` | Valrhona, [Chocolate drops](https://www.valrhona.com/en/l-ecole-valrhona/discover-l-ecole-valrhona/chocolate-terminology/chocolate-drops). English-language description says Valrhona calls its drops “fèves” and distinguishes drops, beans, and chips by shape. | Same manufacturer evidence, not an independent identity standard. |
| `WP02-D-CHOC-FEVES-R431-20261017-S04` | Fun Foods Canada, [Valrhona Jivara Lactée Milk Chocolate Feves, 3 kg](https://funfoods.ca/products/valrhona-jivara-lactee-milk-chocolate-feves-3kg-bag) and [French listing](https://funfoods.ca/fr/collections/best-selling-collection/products/valrhona-jivara-lactee-milk-chocolate-feves-3kg-bag). Paired Canadian product titles use “Milk Chocolate Feves” and “Chocolat au lait … Fèves”; the listing says it ships from within Canada. | Retail title is SKU-specific and does not supply a generic Québec French term or measure. |
| `WP02-D-CHOC-FEVES-R431-20261017-S05` | Callebaut, [White Chocolate W – 2.5kg Callets](https://www.callebaut.com/en-CA/products/callebaut/w/W-2B-U76). A Canadian manufacturer page uses `Callets` for a specified white-chocolate product. | Establishes Callebaut’s product naming only; no equivalence with Valrhona fèves is claimed. |
| `WP02-D-CHOC-FEVES-R431-20261017-S06` | OQLF, [cacao](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8399644/cacao). Defines cacao as the cacao-tree seed and gives *fève de cacao* as a preferred term. | Supports the raw-seed sense, not a finished chocolate form. |
| `WP02-D-CHOC-FEVES-R431-20261017-S07` | OQLF, [fève de soya](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18954613/feve-de-soya) and [fève de soya verte](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26532560/feve-de-soya-verte). These Québec entries support *fève(s) de soya* and *fève(s) de soya verte* for soybeans and edamame. | Supports existing legume terminology and picker collision only. |
| `WP02-D-CHOC-FEVES-R431-20261017-S08` | OQLF, [gourgane](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8351051/gourgane). Supports the Québec fava/broad-bean sense and *fève des marais*. | Supports another existing legume sense, not chocolate terminology. |
| `WP02-D-CHOC-FEVES-R431-20261017-S09` | OQLF, [pépite de chocolat](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9898216/pepite-de-chocolat), current entry updated 2026. Defines a small chocolate piece mainly used in cookies and cakes; notes that chips often have a small-drop shape and lower cocoa-butter content so they keep their shape during baking. | Supports the existing baking-chip category and its shape, not equivalence with Valrhona couverture pistoles/fèves or a generic `chocolate drops` alias. |

**Evidence gaps:** The targeted OQLF search found no GDT entry establishing `pistole` or `fève` as a generic Québec name for chocolate drops. OQLF’s `pépite de chocolat` entry concerns baking chips and does not establish equivalence with couverture pistoles/fèves. The Canadian retail listing names one Valrhona product, while the manufacturer’s shape weights are not transferable. There is no bundled recipe demand or picker request that requires choosing among generic or producer-specific forms. These gaps support the bounded hold.

No tests, build, emulator, or deployment were run. Root integrated this as a documentation-only hold; shared catalog JSON and recipe data remain unchanged.
