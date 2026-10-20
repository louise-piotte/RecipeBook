# WP02 A7 review: malted Kodo millet flour boundary

- **Review date:** 2026-10-14
- **Workstream:** WP02, Section 04, A7
- **Candidate:** malted Kodo millet flour, considered only as a possible single-grain product made by malting Kodo millet before milling
- **Disposition:** **Integrated documentation-only hold on 2026-10-14.** Leave unallocated; do not add an ingredient reference, alias, legacy candidate, ledger candidate, form, recipe link, measure, conversion, yield, or substitution.
- **Scope:** This is one narrow review of whether research use establishes a stable culinary product identity with a Canadian and Québec naming boundary.

The open A7 checklist continues review of grain meals and malted or toasted flour identities ([plan, line 1509](../../RecipeBook-global-ingredient-catalog-plan.txt#L1509)). The existing Kodo grain and plain-flour identities are already integrated. This review does not reopen those rows or the other cereal-specific malted-flour decisions.

## Recommendation and identity boundary

Research establishes that Kodo grain has been malted in food experiments. It does not establish a current standalone Canadian product of flour milled solely from malted Kodo grain, with a stable product specification and Québec French display. The accessible 2017 study malts Kodo and little-millet grains, then develops a 50:50 two-grain mix with milk powder, fruit powder, and sugar or jaggery. A 2024 study explicitly evaluates **germinated** Kodo flour in rusk formulations; it does not call its flour malted. These studies do not close the commercial identity boundary.

Keep the following identities and processes separate:

- `ingredient-ref-kodo-millet` — Kodo grain, displayed as `kodo millet / kodo`.
- `ingredient-ref-kodo-millet-flour` — flour milled from Kodo millet, displayed as `kodo millet flour / farine de millet kodo`.
- `ingredient-ref-malt-flour` — generic `malt flour / farine maltée`, with `malted cereal flour` as an English alias. The OQLF defines *farine maltée* as flour with malt extract or ground malt added; that does not establish it as a synonym for flour milled from previously malted Kodo grain.
- The Kodo/little-millet malt mix in the 2017 experiment; it is a composite food, not single-grain Kodo flour.
- Germinated Kodo flour in the 2024 study; the source's process wording is germination, not malting.
- Other malted or malt-roasted cereal flours already represented in the catalog, including barley, spelt, oat, and wheat products.

The research phrase is not enough to choose whether a future consumer-facing identity should be a distinct `FLOUR_AND_STARCH` reference. Do not turn “malted” into a form on the plain Kodo flour or grain row, and do not treat the study's process as a universal household product specification.

## English and Québec French naming

The research literature uses Kodo-malt and malted-grain wording, but the reviewed Canadian product evidence names plain Kodo flour. Puremill describes a current Ontario product as 100% Kodo millet grains, cold milled. A Canadian French-facing listing uses `Farine de millet Kodo` for finely milled Kodo grain. Neither source identifies a malted product.

TERMIUM Plus gives English `kodo millet` and French `kodo` for *Paspalum scrobiculatum* in a grain-growing context. The OQLF's 2010 entry for *millet* is generic across multiple species; it does not name Kodo flour or malted Kodo flour. The OQLF's 1982 entry for *farine maltée* means flour to which malt extract or ground malt has been added. Therefore:

- Keep the existing plain-flour French display `farine de millet kodo` on its current row.
- Do not assign `farine maltée`, `farine de millet kodo malté`, or `farine maltée de millet kodo` to this candidate. The first has a different OQLF-defined boundary; the latter constructions have no reviewed Québec product or terminology validation.
- Do not add generic aliases such as `malted millet flour`, `malted flour`, `Kodo flour`, or `varagu flour`. They would broaden or blur species, process, or existing plain-flour ownership.

Targeted Canadian and Québec-facing searches for the exact English and French malted-Kodo phrases found research references and plain-flour products, but no standalone malted-Kodo product page or package declaration. This is a bounded search result, not proof that no such product exists in the market.

## Catalog ownership, legacy, ledger, and picker

At the 2026-10-14 snapshot, the live reference catalog has 1,444 rows and the form catalog has 105. The current plain Kodo rows have the displays and aliases shown below:

| Reference | Current displays and aliases | Numeric fields |
|---|---|---|
| `ingredient-ref-kodo-millet` | EN `kodo millet`; FR `kodo`; EN aliases `koda millet`, `varagu` | `defaultDensity: null`; `unitMappings: []` |
| `ingredient-ref-kodo-millet-flour` | EN `kodo millet flour`; FR `farine de millet kodo`; EN aliases `kodo millet atta`, `varagu maavu` | `defaultDensity: null`; `unitMappings: []` |
| `ingredient-ref-malt-flour` | EN `malt flour`; FR `farine maltée`; EN alias `malted cereal flour` | `defaultDensity: null`; `unitMappings: []` |

The catalog has no malted-Kodo row, and no active form contains Kodo or Varagu terms. The 63-entry [legacy import identity file](../legacy-import-identities.v1.json) has no exact malted-Kodo candidate. The 1,784-record [research ledger](../research-ledger.v1.json) has no malted-Kodo candidate or record; its existing Kodo-flour record is `ingredient-ref-kodo-millet-flour` and contains earlier plain-flour decisions and observations. Searches of prior catalog proposals, batches, the plan, live references, forms, legacy identities, and ledger found no prior adjudication of the malted-Kodo candidate.

The picker normalizes accents, case, and punctuation, prefers full word-phrase matches, and falls back to partial matching ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). A static projection over the current references and forms gives:

| Query | Current result |
|---|---|
| `malted kodo millet flour`, `kodo malt flour`, `farine de millet kodo malté`, `farine maltée de millet kodo` | No result |
| `kodo millet flour`, `farine de millet kodo` | `ingredient-ref-kodo-millet-flour` |
| `kodo`, `varagu` | `ingredient-ref-kodo-millet` and `ingredient-ref-kodo-millet-flour` |
| `malted cereal flour`, `farine maltée` | `ingredient-ref-malt-flour` |

If a future identity were added with `malted kodo millet flour` as its English display, a search for `kodo millet flour` would also match that label, while `kodo` would expand from two current rows to three. This broader result is understandable for a species/process-qualified product, but it is another reason not to attach plain Kodo terms or generic malt terms as aliases. No aliases are proposed in this hold.

## Recipe demand

The [bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) lists 114 recipes. A full scan of those files counted 1,123 structured ingredient rows and found:

- zero recipe files or ingredient rows mentioning Kodo, Varagu, malted Kodo, or a Kodo-malt phrase;
- zero ingredient references linked to either existing Kodo row.

The current bundle therefore provides no direct recipe demand for malted Kodo flour or plain Kodo flour. The experimental formulations below do not create bundled recipe links.

## Forms, measurements, and substitutions

No active Kodo form exists, and no form is proposed. The plain Kodo-flour ledger record has two source-specific measurement observations, neither transferable to a malted product:

- A 2019 laboratory study reports **0.68 ± 0.00 g/mL bulk density** for its plain Kodo flour sample. The method is a laboratory mass-over-volume measurement, not a household filling convention or active default density ([Srilekha et al., 2019](https://www.phytojournal.com/archives/2019.v8.i4.8848/evaluation-of-physical-functional-and-nutritional-quality-parameters-of-kodo-millet-flour)).
- One Tamil thattai recipe lists **1 cup or 250 g** of Kodo flour, without defining the cup standard or filling method. It is a single recipe portion, not a reusable conversion ([Millet Revival Project, published 2024-07-17](https://milletrevivalproject.in/2024/07/17/kodo-millet-thattai/)).

The ledger also records two blocked, recipe-specific substitution findings for plain Kodo flour: a 2019 unleavened-flatbread experiment includes Kodo among minor-millet flours in a particular wheat composite, and a 2026 muffin study reports results for heat-moisture-treated Kodo flour in its own formulation. Neither supplies a general substitution rule, and neither studies malted Kodo flour. No conversion, yield, recipe-line substitution, or active substitution rule is supported here.

The 2017 malt mix includes fruit, milk powder, and sweetener; the 2024 rusk study uses germinated flour at study-specific formulation levels. Neither supplies an exact-form household measure, density, general yield, or interchangeable flour ratio for malted Kodo flour.

## Source record and limits

All pages below were checked on 2026-10-14. Dates identify publication or terminology records where the source provides them; otherwise they identify this review's observation date.

| ID | Source and date | What it establishes | Limit |
|---|---|---|---|
| `WP02-A7-MALTED-KODO-FLOUR-20261014-R105-S01` | Himabindu & Devanna, [“Preparation and Processing of Ancient Millets for the Production of Nutritious Malt Powder with Natural Fruit Flavours”](https://www.rroij.com/open-access/preparation-and-processing-of-ancient-millets-for-the-production-of-nutritious-malt-powder-with-natural-fruit-flavours-.php?aid=85755), *Research & Reviews: Journal of Food and Dairy Technology*; published 2017-04-26. | Describes malting Kodo and little-millet grains, then using a 50:50 two-grain flour blend with milk powder, dried fruit, and jaggery or sugar for malt-mix products. | Experimental composite malt mix, not a standalone Kodo-only flour SKU, Canadian product specification, Québec name, or household measure. |
| `WP02-A7-MALTED-KODO-FLOUR-20261014-R105-S02` | Hasan et al., [“Analyzing the Effect of Germination on Nutritional Characteristics of Kodo Millet Flour and Its Role in Rusk Development”](https://journalarja.com/index.php/ARJA/article/view/596), *Asian Research Journal of Agriculture* 17(4), 862–873; published 2024-11-19; DOI 10.9734/arja/2024/v17i4596. | Calls the product germinated Kodo millet flour, compares 0/24/48/72-hour germination, and tests it in rusk formulations. | Germination wording and a study formulation do not establish a malted consumer product, retail process, reusable measure, or general substitution. |
| `WP02-A7-MALTED-KODO-FLOUR-20261014-R105-S03` | Puremill Canada, [Puremill Kodo Millet Flour](https://www.puremill.ca/products/puremill-kodo-millet-flour), current product page observed 2026-10-14. | Names a plain flour product made from 100% Kodo millet grains and describes cold milling; the page lists Ontario milling locations. | Plain flour only; the page does not identify malted grain, a French display, or a reusable measure. Package weights are not recipe measures. |
| `WP02-A7-MALTED-KODO-FLOUR-20261014-R105-S04` | Spice Divine, [Farine de millet Kodo S&V 907 g](https://spicedivine.ca/fr/products/sv-kodo-millet-flour-907g), Canadian French-facing product page observed 2026-10-14. | Uses `farine de millet Kodo` for finely milled Kodo millet. | Plain product wording from a retailer, not a malted product or an OQLF terminology ruling. Availability shown on the page is not treated as durable evidence. |
| `WP02-A7-MALTED-KODO-FLOUR-20261014-R105-S05` | OQLF, [*millet* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), last updated 2010. | Lists `millet`, `mil`, and `petit mil` as preferred generic terms and notes that `millet` covers multiple species. | Does not name Kodo flour or malted Kodo flour. |
| `WP02-A7-MALTED-KODO-FLOUR-20261014-R105-S06` | OQLF, [*farine maltée* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432785/farine-maltee), last updated 1982. | Defines the term as flour with malt extract or ground malt added. | It does not name flour milled from malted Kodo grain; do not use it as a candidate alias. |
| `WP02-A7-MALTED-KODO-FLOUR-20261014-R105-S07` | Government of Canada Translation Bureau, [TERMIUM Plus: *Paspalum scrobiculatum*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=alt&lang=fra&srchtxt=KODO), terminology record 2016-03-11, modified 2026-08-17. | Gives English `kodo millet` and French `kodo` for the species in grain-growing context. | Does not name flour or malted Kodo flour. |

The plain-flour numeric and substitution observations above remain in the existing Kodo-flour ledger entry; this proposal does not add ledger rows or duplicate those sources. Its source links are [the 2019 bulk-density study](https://www.phytojournal.com/archives/2019.v8.i4.8848/evaluation-of-physical-functional-and-nutritional-quality-parameters-of-kodo-millet-flour), [the 2024 thattai recipe](https://milletrevivalproject.in/2024/07/17/kodo-millet-thattai/), [the 2019 flatbread study](https://doi.org/10.1016/j.ijbiomac.2019.08.252), and [the 2026 muffin study](https://doi.org/10.1016/j.bcdf.2026.100528). Their results remain limited to the tested plain or treated flour, process, and recipe formulations.

## Reopen criteria

Reconsider only when a current Canadian or Québec-facing manufacturer or product declaration identifies malted Kodo grain milled as a standalone flour, states enough process or ingredient detail to distinguish it from plain and germinated Kodo flour and from added-malt flour, and supports a Québec French product display. Then rerun owner and picker checks. Any eventual row should be identity-only until separate evidence supports aliases, forms, exact-form measures, density, unit mappings, recipe links, conversions, yields, or contextual substitutions.

## Static checks

- Confirmed the proposal path and R105 source-ID prefix were unused before this review.
- Checked the current ingredient references, forms, legacy import identities, research ledger, A7 checklist, earlier proposals and batches, picker search implementation, and all 114 manifest-listed recipe files.
- Verified external sources and source dates on 2026-10-14; checked the page definitions and study scope against the cited sources.
- This is one new proposal file only. No catalog JSON, ledger JSON, plan, roadmap, code, or generated file was changed. No app, Gradle, or emulator tests were run.

## Root integration (2026-10-14)

Accepted the bounded hold. The 2017 study describes a two-grain Kodo/little-millet malt mix with fruit and dairy/sweetener additions; the 2024 study describes germinated Kodo flour, not malted flour. Current Canadian products name plain Kodo flour, and OQLF's `farine maltée` means flour with malt added. No current standalone malted-Kodo product or Québec French display was established. No reference, alias, candidate, form, recipe link, measurement, conversion, yield, or substitution was added. The plan and roadmap record this unresolved boundary.

No tests were run because this integration is documentation-only. See the [integration record](../batches/wp02-a7-malted-kodo-millet-flour-hold-integration-20261014/README.md).
