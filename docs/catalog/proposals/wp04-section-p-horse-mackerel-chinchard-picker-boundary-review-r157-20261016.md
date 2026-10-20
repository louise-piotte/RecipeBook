# WP04 Section P — horse mackerel / chinchard picker-boundary review (R157)

- **Review and source-access date:** 2026-10-16.
- **Candidate:** Québec fresh-fish listings using `horse mackerel / chinchard`, including a separately listed `horse mackerel Africa / chinchard Afrique` product.
- **Recommendation:** **Hold** the unqualified market label and a species-scoped *Trachurus trachurus* row outside active references, forms, legacy mappings, and the research ledger. Do not attach these labels to an existing mackerel identity.
- **Scope:** One fish-name and product-boundary review. This does not reopen active Atlantic, Pacific, chub, or Spanish mackerel identities; Atlantic bonito; or prior finfish holds.
- **Proposal-only status:** This file is the sole proposed artifact. No shared catalog JSON, ledger, generated index, manifest, recipe, checklist, roadmap, or batch archive was changed. No tests, build, emulator, app, or deployment work was run.
- **Proposal-local source IDs:** `WP04-SECTIONP-HORSE-MACKEREL-R157-20261016-S01` through `S04`, plus repository audit ID `WP04-SECTIONP-HORSE-MACKEREL-R157-20261016-R01`. These labels are local to this proposal and are not shared-ledger records.

## Why this is an unfinished candidate

The active [Section P fish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4978) still covers named and regional fish. R150–R156 concern seal meat, scallops, shirasu, shishamo, kipper, smoked oysters, and tarako; none reviews horse mackerel as a product or fish identity. The only archive mention found is in the R3 Atlantic-bonito review, which lists `horse mackerel` among terms that must not be added as an alias to Atlantic bonito. That is a useful neighboring boundary, but it does not allocate or decide horse mackerel. No dedicated horse-mackerel / chinchard review or hold was found.

At proposal time, the bundled package contains **1,529 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,874 ledger records / 7,944 source entries / 6,792 distinct source IDs**. The manifest lists **114 recipes / 1,123 ingredient rows**. No active identity, form, legacy candidate, or ledger record allocates the candidate name or *Trachurus trachurus*.

## Québec naming, species, and product boundary

OQLF’s GDT entry **chinchard** is classified in zoology/ichthyology and edible fish. It gives the preferred Québec term **chinchard**, English **horse mackerel**, and Latin name *Trachurus trachurus*. It describes that fish as having commercial potential in Québec, which is terminology context rather than evidence of a current local sale. OQLF also lists `saurel` as France/Europe usage and says `saurel` and `carapeau` were not retained by the fish-products terminology committee. The entry was updated in 2011. [S01]

The CFIA Fish List creates a material collision for a catalog that uses phrase-first search. Its current result set for `MACKEREL` pairs **Horse Mackerel / Chinchard** with *Trachurus trachurus*, but it also lists **Horse Mackerel** for *Megalaspis cordyla* and *Trachurus symmetricus*, and **Chinchard** for *Trachurus japonicus*, *T. picturatus*, and *T. symmetricus* under Jack Mackerel names. The list therefore applies the proposed short market terms to multiple taxa. It is Canadian fish-label naming evidence, not evidence that these fish are culinary equivalents. [S02]

CFIA’s naming guidance says that the Fish List collects English and French common names for Canadian fish labelling and that only names listed for a species should be used as its names when sold or processed in Canada. That guidance supports keeping the fish species-specific; it does not resolve an app picker’s broad-query behavior or supply a species for an unqualified retail listing. [S03]

A current Québec-facing Timelia menu places both `Chinchard / Horse Mackerel` and `Chinchard Afrique / Horse Mackerel Africa` in its **Poissons frais / Fresh Fish** section. This confirms local market use of the terms as fresh-fish listings, but neither entry supplies a binomial, label photograph, catch location, farm, fillet/whole-cut description, or storage detail. `Afrique` is retained only as the seller’s product wording; it is not treated as a verified species or provenance claim. The local listing does not establish that either item is *T. trachurus*. [S04]

Accordingly, the source set supports a possible *T. trachurus* identity but does not disambiguate the Québec product names from other CFIA-listed taxa. Do not use `horse mackerel`, `chinchard`, `horse mackerel Africa`, `chinchard Afrique`, `jack mackerel`, `saurel`, `carapeau`, or the Latin name as aliases on the existing Atlantic or Pacific mackerel rows. Those rows are separate species in a different fish family; shared “mackerel” wording does not establish identity.

## Exact ownership and identifier audit

The read-only audit compared normalized whole phrases across bilingual reference names and aliases, form labels and match terms, all legacy candidate names and aliases, ledger record IDs and text, plus the proposal and batch archive. Search normalization follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase, NFKD folding, `œ`/`æ`/`ß` folding, punctuation and accent removal, and whitespace collapse.

| Candidate term or ID | Current owner | Disposition |
|---|---|---|
| `horse mackerel`; `chinchard`; `Atlantic horse mackerel`; `European horse mackerel`; `Trachurus trachurus` | No exact active reference, form, legacy, or ledger-record owner. | No species or product is allocated. `ingredient-ref-horse-mackerel` and `ingredient-ref-atlantic-horse-mackerel` are absent; neither is reserved by this hold. |
| `horse mackerel Africa`; `chinchard Afrique`; `jack mackerel`; `saurel`; `carapeau` | No exact active reference, form, legacy, or ledger-record owner. | Keep the seller-specific label and the nearby names out of aliases until a product label supplies the species. |
| `candidate-horse-mackerel-picker-boundary`; `candidate-atlantic-horse-mackerel-picker-boundary` | No ledger record ID. | No candidate record is proposed under this hold. |
| `WP04-SECTIONP-HORSE-MACKEREL-R157-20261016-S01`–`S04`; `…-R01` | No current ledger or archive collision. | Proposal-local provenance only; do not allocate these IDs in shared data. |
| `ingredient-ref-atlantic-mackerel`; `ingredient-ref-pacific-mackerel`; `ingredient-ref-spotted-spanish-mackerel`; `ingredient-ref-narrow-barred-spanish-mackerel` | Existing identities for distinct *Scomber* or *Scomberomorus* species. | Preserve all existing names, aliases, and identity scopes. |
| `ingredient-ref-atlantic-bonito` | Existing identity for *Sarda sarda*. | The R3 exclusion of `horse mackerel` as an Atlantic-bonito alias does not allocate or decide a horse-mackerel identity. |

The archive phrase scan found no focused candidate review or prior hold. The one `horse mackerel` hit is the R3 Atlantic-bonito alias exclusion noted above. No matching candidate-specific entry was found in the current plan, roadmap, checklist history, or workflow notes. [R01]

## Static picker projection

The current picker checks exact form phrases, then complete word phrases across reference names, aliases, and attached form terms, and uses substring fallback only when no phrase match exists. Current results below were simulated from the live references and forms. The counterfactual row is **not proposed data**; it uses only `horse mackerel / chinchard` as display names, with no aliases or forms, to show the impact of activating the OQLF/CFIA pair.

| Query | Current results | Counterfactual with one *T. trachurus* row | Picker boundary |
|---|---|---|---|
| `horse mackerel` | None | `horse mackerel / chinchard` | One result would make this shared CFIA name look species-specific. |
| `chinchard` | None | `horse mackerel / chinchard` | One result would hide the other CFIA taxa using `Chinchard`. |
| `mackerel` | Four active references: Atlantic, Pacific, narrow-barred Spanish, and spotted Spanish mackerel | Those four plus the hypothetical row | Still multi-result, but it expands a broad family-word query with another species. |
| `horse` | Horse gram / grain de cheval | Horse gram plus the hypothetical row | The proposed display adds an unrelated substring result to a broad short query. |
| `horse mackerel Africa`; `chinchard Afrique` | None | None | The retailer’s distinct listing is not promoted to a species alias. |
| `maquereau` | Atlantic mackerel, Pacific mackerel, and gooseberry / groseille à maquereau | Unchanged | `chinchard` does not create a new match for this query. |

Under the hold, horse-mackerel and chinchard searches remain empty, leaving the unresolved species choice visible instead of presenting *T. trachurus* as the only possible match.

## Bundled-recipe demand

The manifest-ordered scan parsed all **114 recipe files** and **1,123 structured ingredient rows**. It searched complete recipe JSON text and ingredient-row values for `horse mackerel`, `Atlantic horse mackerel`, `European horse mackerel`, `chinchard`, `chinchard Afrique`, `horse mackerel Africa`, `jack mackerel`, *Trachurus trachurus*, `saurel`, and `carapeau`. It found **zero matching recipe files and zero matching ingredient rows**. Adjacent row searches for `mackerel` and `maquereau` also returned zero. No recipe text, ingredient line, reference link, amount, role, or cooking method selects this fish. [R01]

## Forms, measures, conversions, and substitutions

- **References and forms:** Add no active reference, alias, or form. The local menu’s `fresh fish` section establishes a retail category only; it does not say whether a listing is whole, filleted, chilled, previously frozen, frozen, raw, or prepared.
- **Measures:** Add no amount, density, unit mapping, serving, package quantity, or yield. The menu supplies product names and prices, not a weight or recipe portion. No source-specific number is used as an ingredient measure.
- **Conversions and yields:** Add no raw-to-cooked, whole-to-fillet, fresh-to-frozen, count-to-mass, or mass/volume conversion. The reviewed sources supply no comparable product-state pair or measured yield.
- **Substitutions:** Add no global or contextual substitution between *T. trachurus*, other horse-mackerel/chinchard taxa, Atlantic/Pacific mackerel, Atlantic bonito, or generic fish. No recipe context or tested amount supports a directed replacement; shared menu words do not establish cooking or safety equivalence.
- **Recipe links:** Add none. The bundled corpus has no matching ingredient request.

## Proposed catalog and ledger delta

**No reference, form, legacy mapping, or ledger record is proposed.** Do not allocate a horse-mackerel ID or move the unqualified Timelia listing to *Trachurus trachurus*. Reopen when a current Québec package or exact recipe provides a species-identifying label, and confirm that the resulting display and query behavior preserve other Canadian meanings of `horse mackerel` and `chinchard`.

## Source register

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-HORSE-MACKEREL-R157-20261016-S01** | Office québécois de la langue française, [GDT: chinchard](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198926/chinchard), updated 2011; accessed 2026-10-16. | Lists preferred Québec `chinchard`, English `horse mackerel`, and *Trachurus trachurus* in zoology/ichthyology and edible-fish domains. Notes commercial potential in Québec, not current inventory. `Saurel` and `carapeau` were not retained by the fish-products terminology committee. |
| **WP04-SECTIONP-HORSE-MACKEREL-R157-20261016-S02** | Canadian Food Inspection Agency, [Fish List query for Mackerel](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=e&q=MACKEREL), accessed 2026-10-16; result page modified 2023-09-18. | Lists *T. trachurus* as Horse Mackerel / Chinchard and shows the overlapping names for *Megalaspis cordyla*, *T. symmetricus*, *T. japonicus*, and *T. picturatus*. Canadian fish-label name evidence; it does not support one culinary identity across taxa or identify the Timelia product. |
| **WP04-SECTIONP-HORSE-MACKEREL-R157-20261016-S03** | Canadian Food Inspection Agency, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), accessed 2026-10-16. | Says the Fish List provides English/French fish-label common names with a taxonomic serial number and that only names listed for a species should be used for that species. Canadian naming guidance, not picker UX or recipe evidence. |
| **WP04-SECTIONP-HORSE-MACKEREL-R157-20261016-S04** | Timelia Québec, [order and delivery menu](https://order.online/store/timelia-qu%C3%A9bec-2862751), accessed 2026-10-16. | Current Québec menu lists `Chinchard / Horse Mackerel` and `Chinchard Afrique / Horse Mackerel Africa` under `Poissons frais / Fresh Fish`. Seller wording only: no taxon, origin proof, exact processing/storage state, weight, or package specification. |
| **WP04-SECTIONP-HORSE-MACKEREL-R157-20261016-R01** | [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4978), current [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), the manifest-listed recipe files, and Section P proposal/batch archive. | Read-only exact ownership, ID/source-ID collision, archive, static picker, and recipe-corpus audit at 1,529 references, 119 forms, 61 legacy candidates, 1,874 ledger records / 7,944 source entries / 6,792 source IDs, and 114 recipes / 1,123 ingredient rows. Repository snapshot only. |

## Final disposition

**Hold** the unqualified `horse mackerel / chinchard` market label and a hypothetical *Trachurus trachurus* row outside active catalog and ledger data. OQLF supplies a Québec name for *T. trachurus*, but CFIA assigns overlapping `Horse Mackerel` and `Chinchard` names to several fish, and the current local fresh-fish menu does not identify its species. The bundle has no matching demand. Add no reference, alias, form, amount, conversion, yield, recipe link, or substitution. No tests were run for this documentation-only proposal.
