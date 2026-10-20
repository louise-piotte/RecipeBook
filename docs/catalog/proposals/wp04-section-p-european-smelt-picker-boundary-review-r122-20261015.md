# WP04 Section P — European smelt / éperlan européen picker-boundary review (R122)

- **Review and source-access date:** 2026-10-15.
- **Packet type:** species identity, Canadian and Québec naming, picker ownership, and recipe-demand review.
- **Candidate:** European smelt, *Osmerus eperlanus* (CFIA TSN 162039).
- **Recommendation:** propose a separate identity-only `PROTEIN` row, **European smelt / éperlan européen**, with no aliases or numeric behavior. The qualified row would make existing broad `smelt` and `éperlan` queries return both smelt identities instead of only American smelt. Québec retailer wording remains species-unspecified, so the row must not claim that any current Québec `éperlan` product is *O. eperlanus*.
- **Shared-data effect at review:** none; the proposal made no shared catalog or ledger edits. The accepted integration is recorded at the end of this packet.
- **Tests:** none; proposal-only review.

## One distinct unresolved question

The Section P finfish item remains open in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4656). The [American smelt review](wp04-section-p-smelt-identity-review-20261012.md) and its [integration README](../batches/wp04-section-p-american-smelt-identity-integration-20261012/README.md) assigned `American smelt / éperlan` to *O. mordax*, kept `rainbow smelt` as its only alias, and explicitly left European smelt separate. They did not allocate *O. eperlanus* or project how a qualified second row would affect the live picker.

This review addresses that separate species identity and the overlapping short names. It does not reopen the American-smelt decision, assign a taxon to an unqualified Québec retail item, or establish that the two fish are interchangeable.

## Canadian and Québec naming and product evidence

The current CFIA Fish List gives *O. eperlanus* (TSN 162039) the English/French pair **European Smelt / éperlan Européen**. It lists *O. mordax* (TSN 162041) under **Rainbow Smelt**, **Smelt**, **American Smelt / éperlan De Lac**, and **Lake Smelt**. The list therefore identifies distinct species while also showing that the English word `smelt` and the French root `éperlan` are shared. CFIA says its list supplies English and French common names for fish labelling in Canada and that the names listed for a species should be used for that species. This is Canadian naming evidence, not a rule for RecipeBook's picker or proof of culinary equivalence. [S01–S02]

OQLF's terminology records expose a Québec display boundary that the current data does not yet represent. Its GDT entry authored by FAO in 1972 maps **éperlan / smelt** to *O. eperlanus*. A separate OQLF entry, last updated in 2011, normalizes **éperlan** for Québec fish-product commercialization to *O. mordax* and says that `éperlan arc-en-ciel` was not retained for that market. The qualified form **éperlan européen** is present in the current CFIA pair; the reviewed Québec consumer pages do not use it or identify a product as *O. eperlanus*. Therefore, keep the proposed French display qualified and do not add bare `éperlan` as an alias. [S03–S04]

Current market pages show both the local generic wording and a Canadian species-identified product, with different limits:

- Mayrand lists **Éperlan entier frais**, product 52958, as an approximately 1 kg item for Québec stores. The page showed it as “Bientôt disponible” when checked and gives no binomial, harvest origin, or species. This supports local use of the unqualified French market word, but does not identify the species. Its approximate package weight is not a serving or recipe measure. [S06]
- FinFish Inc., based in Wheatley, Ontario, lists a product headed **Smelt / *Osmerus eperlanus*** and describes it as European dressed smelt in a boat-run bulk pack. This is current Canadian supplier evidence for the distinct species and an edible product. It does not establish Québec retail availability or a reusable dressed form, package amount, or cooking conversion. [S05]

## Current ownership and picker projection

The read-only snapshot contains **1,465 ingredient references, 105 forms, 63 legacy candidates, and 1,806 research-ledger records**. No active reference, form, legacy candidate, or ledger identity owns **European smelt**, **éperlan européen**, or `ingredient-ref-european-smelt`. The existing `ingredient-ref-american-smelt` owns the active French display **éperlan** and English alias **rainbow smelt**. The only prior European-smelt references are the explicit exclusion in the American-smelt proposal/integration and its ledger evidence; those do not allocate the European identity. The proposal-local source-ID prefix used below was absent from the proposal archive, batch archive, and ledger before drafting.

The projection follows the current phrase-first normalized matcher in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). I compared the live reference and form search terms with one hypothetical alias-free row named **European smelt / éperlan européen**:

| Query | Current result | With proposed row | Picker effect |
|---|---|---|---|
| `European smelt` | None | European smelt | Species-qualified English query is specific. |
| `éperlan européen` | None | European smelt | Species-qualified French query is specific. |
| `smelt` | American smelt | American smelt; European smelt | Broad English query surfaces both species. |
| `éperlan` | American smelt | American smelt; European smelt | Broad Québec query surfaces both species because the qualified French display contains the term. |
| `American smelt` / `rainbow smelt` | American smelt | American smelt | Existing English scope remains unchanged. |
| `éperlan de lac` | None | None | Keep the separate lake-product wording out of the proposed aliases. |
| `Osmerus eperlanus` | None | None | Keep the binomial as evidence, not a picker alias. |

No explicit `smelt` or `éperlan` alias is needed: both words are already present in the qualified displays, and the resulting broad query correctly has two species choices. The French consumer display is a proposal based on the CFIA-qualified name; current Québec retailer evidence does not show it on a local package.

## Recipe demand and product-state limits

All **114** manifest-listed recipe files and **1,123** ingredient rows were scanned for `European smelt`, *O. eperlanus*, and `éperlan européen`; there were **zero file hits and zero ingredient-row hits**. The same row scan found no broad `smelt`, `éperlan`, `rainbow smelt`, or `American smelt` request. There is no bundled recipe line to link and no recipe-derived amount, cooking state, or substitution context.

FinFish's “dressed” description belongs to one supplier product. Add no ingredient form, household measure, density, unit mapping, conversion, package or edible yield, recipe link, or substitution. The species' identification and the existence of a Canadian supplier listing do not establish a default form or interchangeability with *O. mordax*, capelin, whitebait, or another fish.

## Proposed identity-only delta if accepted

```json
{
  "id": "ingredient-ref-european-smelt",
  "nameEn": "European smelt",
  "nameFr": "\u00e9perlan europ\u00e9en",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN",
  "updatedAt": "2026-10-15T00:00:00Z"
}
```

Record *O. eperlanus* as the identity scope if integrated. Keep the aliases empty, especially for bare `smelt`, bare `éperlan`, and the lake-product term. Add no form, measure, recipe link, conversion, yield, or substitution.

## Recommendation and evidence limits

Propose the qualified European-smelt row as a separate identity. CFIA supplies a current Canadian name pair, OQLF's GDT includes the species in edible-fish terminology, and a Canadian supplier currently lists the species as food. A qualified English/French display makes both species-specific searches available while broad `smelt` and `éperlan` queries return two explicit choices. This separates the CFIA species from the active American-smelt reference without assigning the generic Mayrand product to either one.

The main limit is Québec market evidence: the reviewed local retail page uses only `éperlan` and supplies no species. Keep the proposed *O. eperlanus* name qualified and treat the Mayrand listing solely as evidence of the broad local market word. No measures, forms, recipe links, conversions, yields, or substitutions are supported. Section P remains open.

## Source register

Sources were checked on **2026-10-15**. Retail availability and product descriptions can change; each source is limited to the named record or product page reviewed.

| Source ID | Source and URL | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-EUROPEAN-SMELT-R122-20261015-S01` | Canadian Food Inspection Agency, [Fish List query for European Smelt](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&lang=e&q=European+Smelt) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Lists *O. eperlanus* TSN 162039 as European Smelt / éperlan Européen and *O. mordax* TSN 162041 under Rainbow Smelt, Smelt, American Smelt / éperlan De Lac, and Lake Smelt. The Fish List reports a 2023-09-18 modification date. This is Canadian common-name and taxon evidence; it does not establish a Québec SKU's species or culinary interchangeability. |
| `WP04-SECTIONP-EUROPEAN-SMELT-R122-20261015-S02` | Canadian Food Inspection Agency, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Explains that the Fish List supplies English and French common names for fish labelling and says only names listed for a species should be used for that species in Canada. It does not prescribe internal ingredient-picker behavior. |
| `WP04-SECTIONP-EUROPEAN-SMELT-R122-20261015-S03` | Office québécois de la langue française, [GDT: éperlan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19050623/eperlan). | Food-fish terminology entry authored by FAO in 1972; pairs `éperlan` / `smelt` with *O. eperlanus*. It is not a recent Québec normalization decision or evidence that a local product uses this species. |
| `WP04-SECTIONP-EUROPEAN-SMELT-R122-20261015-S04` | Office québécois de la langue française, [GDT: éperlan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198849/eperlan). | OQLF entry last updated 2011; normalizes `éperlan` for Québec fish-product commercialization to *O. mordax*, and lists rainbow smelt / American smelt as English terms. This is the existing active-row naming basis and the reason to qualify the proposed European display. |
| `WP04-SECTIONP-EUROPEAN-SMELT-R122-20261015-S05` | FinFish Inc., [European smelt product](https://www.finfishinc.net/products/european-smelt) and [company page](https://www.finfishinc.net/). | Current Canadian supplier page identifies *O. eperlanus* and describes European dressed smelt in a boat-run bulk pack; the company page places FinFish in Wheatley, Ontario. Supplier/catalog evidence only; it does not establish Québec retail supply or a general ingredient form or measure. |
| `WP04-SECTIONP-EUROPEAN-SMELT-R122-20261015-S06` | Mayrand, [Éperlan entier frais](https://mayrand.ca/fr/nos-produits/poissonnerie/poissons-a-larrivage/eperlan-entier-fr-52958), product 52958. | Current Québec retailer page uses the unqualified French name and lists an approximate 1 kg unit; the page showed “Bientôt disponible” when accessed. It gives no binomial, species, or harvest origin. Package weight is SKU-specific, not a measure or portion. |

## Static review record

- Read `AGENTS.md`, the open Section P finfish plan item, the R120 and R121 proposals, the American-smelt review and integration README, the current reference/form JSON, legacy candidates, ledger, manifest, and matcher source.
- Checked 1,465 references, 105 forms, 63 legacy candidates, and 1,806 ledger records for exact candidate names, aliases, binomial, and proposed ID. The active American-smelt ownership of `éperlan` is documented above; no European-smelt identity owner was found.
- Reproduced current and hypothetical picker results from the phrase-first matching rules. Parsed all 114 manifest-listed recipe files and 1,123 ingredient rows; the candidate and broad-smelt row scans returned no hits.
- Checked the proposal-local source-ID prefix against the current archive and ledger before drafting. This is a proposal-only file; no shared catalog, ledger, plan, roadmap, generated index, recipe, or application file was edited.
- Static file checks: UTF-8 without BOM, LF line endings, final newline, no trailing whitespace or mojibake markers, valid local links, and unique source IDs. No application, Gradle, instrumentation, or emulator tests were run; the project instructions require no testing for database-JSON-only changes, and this packet changes no database data.

## Integration disposition

Integrated identity-only `ingredient-ref-european-smelt` as `European smelt / éperlan européen` for *Osmerus eperlanus*. Alias arrays remain empty. Broad `smelt` and `éperlan` searches surface both species through the qualified English and French displays; Mayrand’s generic Québec product remains unassigned. The six reviewed sources are now recorded in the research ledger. No forms, measures, mappings, recipe links, conversions, yields, or substitutions were added. Package totals after integration are 1,469 references, 105 forms, and 1,810 ledger records / 7,475 source entries / 6,353 distinct source IDs. See the [integration record](../batches/wp04-section-p-european-smelt-identity-integration-r122-20261015/README.md).
