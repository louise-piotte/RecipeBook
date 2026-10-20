# WP04 Section P — canned trout product-boundary review (R201)

- **Review and source-access date:** 2026-10-16.
- **Candidate:** Canned trout / *truite en conserve*.
- **Recommendation:** **Add** an identity-only finished-food market group as `ingredient-ref-canned-trout`, category `PROTEIN`, with no aliases or forms.
- **Scope:** Trout sold as a canned or tinned fish product. The proposed row is a product group, not a trout species, a form on a raw-trout row, or a claim that canned trout products share one species, recipe, packing medium, presentation, or storage condition.
- **Status:** Integrated as an identity-only `PROTEIN` reference and accepted research-ledger record. No software tests or emulator checks were run for this database-JSON-only addition.
- **Proposal-local source IDs:** `WP04-SECTIONP-CANNED-TROUT-R201-20261016-S01` through `S05`. Existing OQLF and CFIA sources are reused by their current ledger IDs; no new IDs are proposed for those URLs.

## Open checklist and distinct boundary

The [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6161) keeps canned and other preserved fish product states open. Recent product decisions separately add canned tuna, sardines, salmon, and mackerel; R158 adds smoked trout. None allocates a canned-trout product group. The current smoked-trout row does not have a canned form, and the accepted row does not attach one to it or to any raw trout species.

This is a finfish review. It does not reopen the R197 mussels-in-brine integration or any prior shellfish decision. It also leaves canned salmon, canned sardines, canned mackerel, smoked trout, and the raw trout species identities unchanged.

The product evidence is bounded but coherent: a Canadian canned-seafood maker has marketed Ontario trout with dill; current Canadian retailers list the same product; and a Québec culinary source uses *truite en conserve* for a local trout preparation. The Canadian commercial listing is one seasoned SKU and is not a universal formula. The Québec source is not a current retail label or a terminology ruling, and the audit did not find a current Québec retailer page for canned trout. The display pair below therefore records the exact Québec culinary wording as a practical recipe-search term, without claiming that OQLF standardizes it or that a canned-trout SKU is currently stocked in Québec. [S01–S04; reused `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01`]

## Identity, species, and product-state boundaries

The Québec source titles its preparation **Truite en conserve** and identifies the fish as small brook trout (*omble fontaine* / *truite mouchetée*). It supports the French phrase and shows that the prepared product need not be rainbow trout. Its recipe is a home preparation, not evidence for a current Québec commercial product or a reusable processing method. [S01]

Scout Canning’s Canadian product is titled **Ontario Trout with Dill**. Scout describes it as a canned seafood item and identifies trout, sunflower oil, dill, and salt. The current retailer pages identify the product as Ontario rainbow trout; one current Hamilton retailer lists a 90 g package with an Add to Cart control. Those sources support a Canadian canned-trout product but do not establish that all canned trout is rainbow trout, dilled, oil-packed, or sold at the same size. The Natura Market page currently displays “Notify Me,” so it is treated as a live product listing, not proof of stock. [S02–S04]

Keep the proposed product group separate from:

- `brook trout / omble de fontaine`, `lake trout / touladi`, and `rainbow trout / truite arc-en-ciel`, which remain species identities;
- `smoked trout / truite fumée`, which remains a distinct preservation-product group;
- canned salmon, sardines, mackerel, and tuna, which remain different product groups;
- seasoned trout dishes, trout spreads, and other composite foods.

Do not infer the species from the proposed product name, nor attach `canned`, `tinned`, or `en conserve` as a form to a raw-trout reference. Do not add `Ontario trout with dill`, `canned rainbow trout`, `smoked trout`, `trout in oil`, dill, or a brand name as aliases. These terms either belong to an individual SKU, name another product state, or exceed the support of the reviewed evidence. The catalog row is an app picker identity, not a Canadian package-label ruling. The reused CFIA Fish List source is included only as Canadian species/common-name context. [reused `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S07`]

## Ownership and source-ID audit

The live read-only snapshot contained **1,579 references**, **122 forms**, **61 legacy candidates**, and **1,924 ledger records / 8,313 source entries / 7,084 distinct source IDs / 5,874 distinct URLs**. The bundled manifest listed **114 recipe files and 1,123 ingredient rows**.

Accent-, punctuation-, and case-normalized exact-key checks covered bilingual reference names and aliases, form labels and match terms, legacy-candidate names and aliases, and ledger identity IDs and terms.

| Candidate key or ID | Current owner | Disposition |
|---|---|---|
| `canned trout`; `truite en conserve`; `tinned trout`; `trout in a can`; `canned rainbow trout`; `Ontario trout with dill` | No exact reference, form, or legacy owner; no exact ledger product record. | Keep the proposed exact displays as the only new search terms. Do not claim the product-specific phrases as global aliases. |
| `ingredient-ref-canned-trout`; `candidate-canned-trout` | No active reference, form, legacy ID, or ledger record ID. | Proposed reference ID is unallocated; no separate legacy candidate is proposed. |
| `ingredient-ref-brook-trout` | Active `brook trout / omble de fontaine`, alias `truite mouchetée`. | Preserve as a species identity; do not attach a canned form. |
| `ingredient-ref-lake-trout` | Active `lake trout / touladi`. | Preserve as a species identity; do not attach a canned form. |
| `ingredient-ref-rainbow-trout` | Active `rainbow trout / truite arc-en-ciel`. | Preserve as a species identity; do not infer that every canned-trout item uses this species. |
| `ingredient-ref-smoked-trout` | Active `smoked trout / truite fumée`. | Preserve as a separate product group; do not merge its smoke state with canning. |
| `ingredient-ref-canned-salmon`, `ingredient-ref-canned-sardines`, `ingredient-ref-canned-mackerel`, `ingredient-ref-canned-tuna` | Active finished-product groups for other fish. | Keep separate. |

The source-ID prefix `WP04-SECTIONP-CANNED-TROUT-R201-20261016-` was absent from the live ledger and proposal/batch archive. The five new source URLs in S01–S05 have no existing exact URL owner in the ledger. OQLF’s rainbow-trout URL reuses `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01`; the CFIA Fish List URL reuses `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S07`. Each registered source ID below points to exactly one URL. These reused entries must not be registered a second time if the proposal is accepted.

No exact phrase in the candidate set occurs in an earlier focused proposal or batch. The broader archive search also checked R158 smoked trout and the canned tuna, sardine, salmon, and mackerel product decisions; these remain adjacent but distinct.

## Picker projection

The projection follows case folding, NFKD accent/punctuation normalization, complete word-phrase matching, then substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical reference has only `canned trout / truite en conserve`, empty aliases, and no forms.

| Query | Current results | With proposed row | Effect |
|---|---|---|---|
| `canned trout` | None | Canned trout / *truite en conserve* | Exact English product query becomes searchable. |
| `truite en conserve` | None | Canned trout / *truite en conserve* | The Québec culinary phrase finds the product group. |
| `trout` | Brook trout; lake trout; rainbow trout; smoked trout | Those four plus canned trout | Broad English search remains multi-result. |
| `truite` | Brook trout; rainbow trout; smoked trout | Those three plus canned trout | Broad French search remains multi-result. |
| `canned` | 15 current results | 16, including canned trout | Broad preservation search remains multi-result. |
| `en conserve` | 14 current results | 15, including canned trout | Broad French preservation search remains multi-result. |
| `smoked trout`; `truite fumée` | Smoked trout | Unchanged | The existing smoked-trout result remains distinct. |
| `rainbow trout`; `truite arc-en-ciel`; `brook trout`; `omble de fontaine`; `lake trout`; `touladi` | The matching species row | Unchanged | Existing species identities stay separate. |
| `Ontario trout with dill`; `canned rainbow trout`; `trout in a can` | None | None | No product-specific or unsupported synonym is added. |

The added name therefore increases the broad trout/truite result sets by one. It does not claim any of the currently available species results as equivalent to a generic canned product.

## Bundled-recipe demand

The manifest-ordered audit parsed all **114 recipes and 1,123 ingredient rows** and searched every decoded recipe string and ingredient row for `canned trout`, `truite en conserve`, `tinned trout`, `Ontario trout with dill`, `canned rainbow trout`, `trout in a can`, `trout`, and `truite`. It found **zero matching recipe files and zero matching ingredient rows**. No bundled recipe selects a canned-trout species, product state, measure, link, or substitution. [A01]

An external Toronto recipe page uses **2 tins** of Scout’s Ontario Trout with Dill in one quiche. That is a recipe-specific quantity for the seasoned product and is outside the bundled corpus. It does not establish a default serving, tin weight, drained amount, or substitution ratio. [S05]

## Measures, forms, and substitutions

- **Numeric product evidence:** Current retailer listings identify one Scout package as **90 g**. That is a product-specific net package amount. The cited external quiche uses two tins of that named product. Neither value is a generic trout measure, drained weight, household-volume conversion, edible-yield factor, or package conversion. [S02, S03, S05]
- **Québec home-recipe quantities:** The *Truite en conserve* recipe names 1.8–2 kg of small trout for four 500 ml jars and 2.5 ml salt per jar. Those quantities remain source-specific to that home recipe and its identified brook trout; they are not entered as a catalog measure or yield. Only the recipe title and fish identification support this review’s naming boundary. [S01]
- **Forms:** Add no form. The candidate is itself a finished-product identity. Do not add a generic canned form to any trout species or infer a shared canning process, liquid, seasoning, cut, skin/bone state, drained state, or storage claim.
- **Measurements and conversions:** Proposed reference uses `defaultDensity: null` and `unitMappings: []`. Add no piece/count mapping, can-to-mass conversion, drained yield, cooking yield, mass-volume conversion, or reusable portion. No reviewed source supports one value for the broader product group.
- **Substitutions:** Record `researched_no_supported_substitute`; add no global or contextual rule, warning, or recipe-line link. No reviewed source or bundled recipe establishes that canned trout can replace raw trout, smoked trout, canned salmon, or another fish in an equal amount.

## Proposed mapping if accepted

### Reference

```json
{
  "id": "ingredient-ref-canned-trout",
  "nameEn": "canned trout",
  "nameFr": "truite en conserve",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "PROTEIN"
}
```

### Research-ledger record

If accepted, create one `ingredient_reference` record with `recordId: ingredient-ref-canned-trout`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Add one source object for each new source S01–S05 and reuse existing source records S06 and S07 only as boundary evidence. Use `culinary_reference` for S01, `other` for S02, S03, and S05, `manufacturer` for S04, and `regional_authority` for S06 and S07. Keep `measurementObservations` and `substitutionFindings` empty. The decision should use outcome `accepted`, cite the source IDs above, and explain that the row represents a canned-trout market product group while leaving species, ingredients, package size, medium, cut, and storage source-specific. Add no recipe links, forms, legacy mappings, or conversions.

## Source register

Sources were accessed on 2026-10-16 unless a page’s publication date is noted. Each source ID below has one exact URL.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP04-SECTIONP-CANNED-TROUT-R201-20261016-S01` | Le Québec Cuisine, [Truite en conserve](https://quebecuisine.ca/recipes/truite-en-conserve/), title, food type, featured fish, and provenance fields. | Direct Québec culinary wording `truite en conserve`; identifies small brook trout / omble fontaine or truite mouchetée. It is a home recipe, not a current retail package, formal OQLF ruling, food-safety standard, or generic quantity source. |
| `WP04-SECTIONP-CANNED-TROUT-R201-20261016-S02` | Verlan, [Petit Marché](https://verlan.ca/PETITMARCHE/tabid/122769/Default.aspx), current pantry listing; Hamilton, Ontario. | Lists Scout Ontario Trout with Dill at 90 g with an Add to Cart control. Retail listing and package amount only; it does not provide a species Latin name, ingredient list, Québec inventory, or common French product name. |
| `WP04-SECTIONP-CANNED-TROUT-R201-20261016-S03` | Natura Market, [Scout Canning Ontario Trout with Dill, 90 g](https://naturamarket.ca/scout-canning-ontario-trout-with-dill-90g.html), product title, SKU, description, and ingredient list. | Current Canadian retail page identifies Ontario rainbow trout, sunflower oil, dill, dill seed, and salt. At access it displayed “Notify Me”; this listing does not prove stock or Québec availability. The 90 g amount is product-specific. |
| `WP04-SECTIONP-CANNED-TROUT-R201-20261016-S04` | Scout Canning via Canada Newswire, [Scout launches Canadian canned-seafood line](https://www.newswire.ca/news-releases/scout-the-first-canned-seafood-brand-to-source-100-of-product-from-canada-and-the-u-s-launches-today-818839136.html), 2020-09-09, Scout product-line section. | Primary brand release identifies Scout as a Toronto-based Canadian canned-seafood maker and lists Ontario Trout with Dill, with trout, sunflower oil, dill, and salt. It supports product identity and launch scope, not current retailer stock or a universal trout product composition. |
| `WP04-SECTIONP-CANNED-TROUT-R201-20261016-S05` | Streets of Toronto, [Chef Charlotte Langley’s Dilled Trout Quiche](https://streetsoftoronto.com/food/chef-charlotte-langleys-dilled-trout-quiche-recipe/), 2021-04-28, ingredient list and method. | Uses two tins of Scout Ontario Trout with Dill in one external quiche recipe, saving the product oil for the same dish. Recipe-specific amount and product use only; it does not support a generic portion, can conversion, or substitution. |
| **Reused `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S01`** | OQLF, [GDT: truite arc-en-ciel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198854/truite-arc-en-ciel). | Existing ledger source for the Québec-preferred name *truite arc-en-ciel*, English `rainbow trout`, and *Oncorhynchus mykiss*. Reused to preserve the species boundary; it does not define canned trout or standardize *truite en conserve*. |
| **Reused `WP04-SECTIONP-SMOKED-TROUT-R158-20261016-S07`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Existing ledger source describing the Canadian fish-name list and its species context. Reused as a common-name boundary reference; the proposed picker name is not a legal package-label ruling. |

## Reopen conditions

Reopen if a bundled recipe or explicit user request names canned trout and requires a product-specific state, if a current Québec retailer or manufacturer provides a bilingual commercial label that improves the French display, or if a package declaration supports a distinct species or numeric property. Keep all package, drained, seasoning, storage, species, and recipe-amount evidence tied to its own product unless further sources support generalization.

## Final recommendation

**Add** the identity-only product group `canned trout / truite en conserve` as `ingredient-ref-canned-trout`. Canadian manufacturer and retail sources support the canned-trout market identity; a Québec culinary source supports the French phrase while identifying one local home-prepared brook-trout example. Preserve the limits: current Québec commercial stock and commercial French package wording were not established, the corpus has no matching demand, and one dilled rainbow-trout product does not define every canned-trout item. Keep all raw trout species and smoked trout distinct. Add no aliases, forms, measures, conversions, yields, recipe links, or substitutions.

### Proposal-local repository audit (not a ledger source)

**WP04-SECTIONP-CANNED-TROUT-R201-20261016-A01** — Read-only audit of the live Section P checklist, current references/forms/legacy/ledger, source-ID and URL ownership, archived Section P proposals/batches, `IngredientSearch.kt`, the bundled manifest, all 114 manifest-listed recipes, and all 1,123 ingredient rows. Counts and picker projection describe the repository snapshot on 2026-10-16 only.


## Integration disposition

Root independently reviewed the Québec home-recipe title and fish identification, the Canadian Scout product listing and manufacturer release, the Québec retailer listing, the product-specific 90 g observation, OQLF species terminology, and the CFIA Fish List scope. The bounded evidence supports the market-group reference and the recipe-search phrase `truite en conserve`; it does not establish a current Québec commercial French package label or a universal trout species, recipe, packing medium, presentation, or package amount. The 90 g package and quiche quantity remain source-specific.

Added `ingredient-ref-canned-trout` with empty aliases, null density, and empty unit mappings, plus one accepted ledger record with the five new source entries and the two exact reused R158 source records. No forms, recipe links, conversions, yields, or substitutions were added. The Section P preserved-fish checklist and roadmap now record the integration; Section P remains open.

Static seed/package, catalog normalization, generated-index, ledger schema, source ownership, picker projection, recipe-corpus, encoding, link, and whitespace checks are recorded in the batch README. No software tests or emulator checks were run because the only application data change adds database JSON data under the updated `AGENTS.md` rule.
