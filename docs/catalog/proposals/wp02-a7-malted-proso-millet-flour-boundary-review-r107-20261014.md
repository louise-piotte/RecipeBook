# WP02 A7 review: malted proso millet flour boundary (R107)

- **Review date:** 2026-10-14
- **Workstream:** WP02, Section 04, A7
- **Candidate:** malted proso millet flour, made from common/proso millet (*Panicum miliaceum*)
- **Disposition:** **Hold; leave unallocated.** Add no active reference, alias, legacy identity, ledger candidate, form, recipe link, active measure, density, unit mapping, conversion, yield, or substitution.
- **Scope:** Flour milled from proso millet grain after malting. This is a distinct species/process review under A7's open request for other malted and toasted flour identities. It does not reopen existing decisions for other species or products.

## Recommendation and identity boundary

Primary food studies use the exact English phrase **malted proso millet flour**. A 1996 ICRISAT-hosted paper describes locally sourced proso grain made into malted flour for a *burfi* study. A 2022 Wiley paper separately describes cleaning and soaking proso grain, germinating it for five days, drying and kilning it, removing sprouts and rootlets, then hammer-milling the grain into flour for a bread experiment. These establish a research material, but neither specifies a current Canadian retail product, commercial grade, package declaration, or Québec French display. The 2023 cookie paper is likewise an experimental use of malted proso flour, not a product specification.

**Keep the candidate on hold.** The product name is clear in research, but the reviewed current Canadian product pages identify plain proso millet flour only. No reviewed Québec source names malted proso flour. The hold is limited to the sources checked and does not claim that no product exists in other markets.

Keep these boundaries separate:

- `ingredient-ref-common-millet` — common/proso millet grain, `common millet / millet commun`, botanically *Panicum miliaceum*.
- `ingredient-ref-proso-millet-flour` — plain proso millet flour, `proso millet flour / farine de millet commun`.
- `ingredient-ref-millet-flour` — generic `millet flour / farine de millet`; do not turn the broad millet family term into a malted-proso alias.
- `ingredient-ref-malt-flour` — generic `malt flour / farine maltée`, with English alias `malted cereal flour`. The OQLF definition describes flour to which malt extract or ground malt is added; it does not establish flour milled from previously malted proso grain.
- Other species-specific malted flours already reviewed in A7, including finger, pearl, Kodo, and foxtail millet. Their evidence does not support one generic “malted millet flour” identity.
- Composite research flours and finished foods. The 1996 *burfi* mix and the 2023 rice-cookie formulations are not standalone product names or general flour blends.

If a current Québec-facing product source later supports an active identity, use a species-qualified display and keep it distinct from plain proso flour and generic malt flour. This proposal does not approve an ID or a French display.

## English and Québec French naming

Research sources call the experimental material `malted proso millet flour` or `proso millet malted flour`. The OQLF's 2010 *millet commun* entry identifies *Panicum miliaceum* and gives `proso millet` as an English translation. A Canadian French-facing S&V listing calls its plain product `Farine de millet S&V Proso` and uses `farine de millet commun` in the description. A Canadian flour producer's product page also names plain `PROSO MILLET FLOUR` and describes ground proso grain.

These sources support the plain proso identity and its Québec grain term. They do not validate a French product name for malted proso flour. Do not add the constructed phrases `farine de millet commun maltée`, `farine maltée de millet commun`, or `farine de millet proso maltée` as displays or aliases. The first is used below only as an exploratory picker query, not as a proposed translation. Do not add `malted common millet flour`, `malted millet flour`, `malted cereal flour`, `malt flour`, or plain-flour aliases to the candidate.

## Ownership and picker projection

At this review snapshot, the bundled catalog contains 1,446 references, 105 forms, the legacy import file contains 63 identities, and the research ledger contains 1,786 records. The current neighboring references are:

| Reference | Current names and aliases | Active numeric fields |
|---|---|---|
| `ingredient-ref-common-millet` | EN `common millet`; FR `millet commun`; EN aliases include `proso millet`, `chena`, `barri`, `cheno`, `cheena`, `cheena millet`, `panivaragu` | `defaultDensity: null`; `unitMappings: []` |
| `ingredient-ref-proso-millet-flour` | EN `proso millet flour`; FR `farine de millet commun`; EN aliases `proso millet atta`, `barri flour`, `panivaragu maavu` | `defaultDensity: null`; `unitMappings: []` |
| `ingredient-ref-millet-flour` | EN `millet flour`; FR `farine de millet` | `defaultDensity: null`; `unitMappings: []` |
| `ingredient-ref-malt-flour` | EN `malt flour`; FR `farine maltée`; EN alias `malted cereal flour` | `defaultDensity: null`; `unitMappings: []` |

No exact malted-proso candidate appears in active references, forms, legacy identities, or ledger identity/finding text. There are proso grain and plain-flour ledger records, but no malted-proso ownership decision. No form references proso millet or proso flour.

The picker normalizes accents and punctuation, returns complete phrase matches before using substring fallback, and indexes the attached forms ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Static projection over current references and forms gives:

| Query | Current result |
|---|---|
| `malted proso millet flour`, `malted proso`, `farine de millet commun maltée` | No result |
| `proso millet flour`, `farine de millet commun` | `ingredient-ref-proso-millet-flour` |
| `proso millet`, `millet commun` | `ingredient-ref-common-millet` and `ingredient-ref-proso-millet-flour` |
| `millet flour` | Six references: finger, foxtail, Kodo, generic, pearl, and proso millet flour |
| `farine de millet` | Five references: foxtail, Kodo, generic, pearl, and proso millet flour |
| `malted cereal flour`, `farine maltée` | `ingredient-ref-malt-flour` |

A hypothetical English display `malted proso millet flour` would add a result to `proso millet flour`, `proso millet`, and `millet flour`. If a future Québec display included the current phrase `farine de millet commun`, that query would also gain a second result; a hypothetical `farine de millet commun maltée` would expand `farine de millet` from five to six results. Those are collision projections only. No name or picker term is added by this hold.

## Recipe demand

The current manifest lists 114 recipe files and 1,123 structured ingredient rows. A scan of every file and ingredient row found:

- zero recipe-file or ingredient-row mentions of `proso`, `malted proso`, `malted common millet`, or `millet commun`;
- zero ingredient references linked to `ingredient-ref-common-millet` or `ingredient-ref-proso-millet-flour`.

The bundled library has no direct demand for the candidate or its plain-flour neighbor. No recipe link or recipe-line quantity is proposed.

## Forms, measures, and substitutions

No proso form is present or proposed. The active plain proso-flour row has a null default density and empty unit mappings; its ledger record says measurement research found no supported household flour value. A 2020 study's **0.79 g/mL** bulk-density value is for intact proso grain, not flour, and is not transferred to the candidate. The 2022 malted-proso bread paper reports no cup measure or bulk density. No exact-form household measure, density, or unit mapping is supported.

The studies' recipe numbers remain local to their experiments:

- The 1996 *burfi* mix uses **50% malted proso millet flour, 25% roasted green-gram powder, and 25% roasted peanut powder**; fat is rubbed into the mix at 5 g per 100 g. This is a multi-ingredient sweet formula, not a flour substitution ratio.
- The 2022 optimized bread formula uses **73.3% refined wheat flour, 24.7% malted proso millet flour, and 2% gluten**. The experimental design varied malted proso flour between 20% and 45.7% with wheat flour and added gluten. Those values apply only to the tested bread system.
- The 2023 rice-cookie study tested malted proso flour at **15% and 30%** as rice-flour replacement levels in its cookie formulations. This does not establish a general gluten-free baking replacement.

Do not encode these experimental percentages as a global or contextual substitution rule, density, yield, or conversion. Add no measure, mapping, form, recipe link, or substitution.

## Source register and limits

Pages and records were checked on 2026-10-14. Publication and terminology dates are listed where supplied.

| ID | Source and date | What it supports | Limit |
|---|---|---|---|
| `WP02-A7-MALTED-PROSO-MILLET-FLOUR-20261014-R107-S01` | Srivastava and Pathak, [“Use of Proso Millet Malted Flour in Low-cost Nutritious Sweets”](https://oar.icrisat.org/1023/1/RA_000278.pdf), *International Sorghum and Millets Newsletter* 37 (1996), pp. 88–89. | Primary report identifies *Panicum miliaceum*, describes grain made into malted flour, and reports its use in an experimental *burfi* mix. | Indian research use; not a standalone commercial specification, Canadian product, Québec display, measure, or general substitution. The reported formula is specific to that sweet. |
| `WP02-A7-MALTED-PROSO-MILLET-FLOUR-20261014-R107-S02` | Aringalayan et al., [“Optimization and characterization of malted proso millet (*Panicum miliaceum*) based bread”](https://doi.org/10.1002/efd2.29), *eFood* 3(5), e29; first published 2022-09-04; DOI 10.1002/efd2.29. | Primary study defines one experimental process: soak, germinate five days, dry/kiln, remove sprouts and rootlets, then hammer-mill. It tests malted proso flour in a wheat-and-gluten bread system. | The protocol is an experimental method, not a retail grade or universal standard. The optimized proportions are not a general home-baking conversion or substitution. |
| `WP02-A7-MALTED-PROSO-MILLET-FLOUR-20261014-R107-S03` | [“Influence of malted buckwheat, foxtail and proso millet flour incorporation on the physicochemical, protein digestibility and antioxidant properties of gluten-free rice cookies”](https://doi.org/10.1016/j.focha.2023.100557), *Food Chemistry Advances* 3 (December 2023), article 100557; DOI 10.1016/j.focha.2023.100557. | Primary study includes malted proso millet flour among the tested flours and reports rice-cookie formulations at 15% and 30% replacement levels. | Experimental cookie formulations do not establish a retail product, Québec French display, household measure, or general substitution. |
| `WP02-A7-MALTED-PROSO-MILLET-FLOUR-20261014-R107-S04` | OQLF, [*millet commun* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun), last updated 2010. | Identifies *Panicum miliaceum* and lists `millet commun` among its preferred French terms, with `proso millet` among its English translations. | Names the plant/grain, not a malted-flour product. |
| `WP02-A7-MALTED-PROSO-MILLET-FLOUR-20261014-R107-S05` | OQLF, [*farine maltée* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432785/farine-maltee), last updated 1982. | Defines the term for flour with malt extract or ground malt added. | Does not name flour milled from previously malted proso grain. |
| `WP02-A7-MALTED-PROSO-MILLET-FLOUR-20261014-R107-S06` | Spice Divine, [Farine de millet S&V Proso 2 lb](https://spicedivine.ca/fr/products/sv-proso-millet-flour-2lb), listing surfaced in the 2026-10-14 search recheck; page title/description were directly recorded in the ledger on 2026-10-12. | Uses `Farine de millet S&V Proso` and `farine de millet commun` for its plain proso-flour listing. | Plain flour only; does not establish a malted product name or stable stock. Package weight is not a recipe measure. |
| `WP02-A7-MALTED-PROSO-MILLET-FLOUR-20261014-R107-S07` | Punjab Flour Mill Ltd, [Proso Millet Flour](https://punjabflourmill.ca/product/proso-millet-flour/), Canadian seller page observed 2026-10-14. | Names a plain proso flour and describes it as ground proso millet; the page gives a Surrey, British Columbia address. | Does not describe malting, a Québec French display, current stock, household measure, or a product equivalence. |
| `WP02-A7-MALTED-PROSO-MILLET-FLOUR-20261014-R107-S08` | Khatoniar and Das, [“Physical and Functional Properties of Some Millet Varieties of Assam”](https://www.ijcmas.com/9-5-2020/Sushmita%20Khatoniar%20and%20Pranati%20Das.pdf), 2020, pp. 1508–1511. | Reports 0.79 g/mL bulk density for proso millet grain and separate flour absorption tests. | The density is for intact grain, not malted or plain flour; no cup-mass mapping is provided. |

## Reopen criteria

Reconsider an active row when a current Canadian or Québec-facing manufacturer or retailer identifies a standalone malted proso-flour product with enough labeling or process detail to distinguish it from plain proso flour, generic malt flour, and composite products. Obtain an independently supported Québec French display. Then repeat exact-key ownership and picker projections. Research exact-form measurements and substitutions separately; do not transfer them from whole grain, plain proso flour, or experimental composite formulas.

## Static checks

- Checked the open A7 scope, A7 proposal/batch history, active references, forms, legacy identities, ledger, picker projection, and all manifest-listed recipes.
- Verified the primary studies, OQLF terminology, and Canadian plain-flour listings online on 2026-10-14.
- Created this proposal only. No shared catalog, ledger, plan, roadmap, code, recipe, or generated file was changed. No app, Gradle, instrumentation, or emulator tests were run.


## Root review outcome

Accepted the bounded hold. The reviewed studies establish research use, not a current standalone Canadian consumer product or Québec French product display. OQLF's `farine maltée` definition describes added malt extract or ground malt and does not name flour milled from previously malted proso grain. The 0.79 g/mL result is explicitly grain bulk density; the food formulas remain study-specific. Root static checks reproduced the picker table and found no candidate-specific row or demand in the 114-recipe / 1,123-row manifest.

No active reference or research-ledger record was added or changed. Recorded the decision in the active A7 checklist, the plan history, the roadmap, and the batch README. The agent created this proposal only; the root integration changed documentation only. No app, Gradle, instrumentation, or emulator tests were run.
