# WP02 Section 04 A6 R161 — dark buckwheat flour identity review

## Review record

- **Reviewed:** 2026-10-16; live product pages checked on this date.
- **Status:** Proposal only. This file changes no shared catalog, forms, ledger, recipes, generated files, checklist, roadmap, or batch README.
- **Open checklist:** Continue the review of regional grains and flours under [Section 04 A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1458); A6 remains open after the integrated R160 review.
- **Candidate:** The dark/gray buckwheat flour product named in current sources.
- **Proposed, currently unallocated reference ID:** `ingredient-ref-dark-buckwheat-flour`.
- **Source IDs used only in this proposal:** `WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S01` through `S05`. No source IDs are added to the shared ledger by this proposal.

## Recommendation

**Add one reference for the identity `dark buckwheat flour / farine grise de sarrasin`** under `FLOUR_AND_STARCH`, using `ingredient-ref-dark-buckwheat-flour`. Keep both alias arrays empty; leave density null and unit mappings empty. A Québec miller currently markets dark buckwheat flour T60 in English and its French product catalogue names corresponding gray buckwheat flour products `farine grise de sarrasin`, separately from its pale and whole buckwheat flour products. This provides a bounded commercial product identity with direct local French wording [S01–S02].

This row represents a named product, not a claim that every flour called dark or gray has one standardized hull content, milling process, ash value, or behavior. A second Canadian mill's French product page independently uses `Farine de sarrasin foncée` and says its own product is made from whole buckwheat including hull; keep that mill's process statement attached to its product only [S03]. The current Québec directory likewise has a different `Farine de sarrasin entière biologique` SKU; its serving label does not transfer to the proposed dark/gray product [S05].

Keep the general `buckwheat flour / farine de sarrasin`, sprouted buckwheat flour, Tartary buckwheat flour, and unresolved `buckwheat meal` candidate unchanged. Do not alias the proposed row to `whole buckwheat flour`, `light buckwheat flour`, `farine pâle de sarrasin`, `farine entière de sarrasin`, `farine de sarrasin foncée`, `farine de sarrasin noir`, or `buckwheat meal`. The sources use these names for separate products or products from particular mills, and do not establish them as universal synonyms for the proposed Québec gray product [S01–S05, A1].

## Product and naming boundary

| Material or wording | Decision | Evidence boundary |
|---|---|---|
| `dark buckwheat flour / farine grise de sarrasin` | Add one `FLOUR_AND_STARCH` reference for the product identity. | Aliments Trigone's English catalogue names dark buckwheat flour T60; its French catalogue lists gray buckwheat flour products in 1 kg, 2 kg, 5 kg, 10 kg, and 20 kg sizes. Its local label is preferred for the fr-CA display [S01–S02]. |
| `farine grise de sarrasin` | Use as the French display; add no duplicate French alias. | This is the exact French product wording used by the Québec miller, rather than an independently coined translation [S02]. |
| `buckwheat flour` / `farine de sarrasin` | Preserve the existing family reference. | OQLF pairs the generic Québec French and English terms. A dark/gray product is a qualified choice within the family; do not put the broad term on the new row [A1]. |
| `light buckwheat flour`, `farine pâle de sarrasin` | Keep separate and unassigned in this review. | Trigone lists pale flour separately from gray/dark flour; the current active generic row remains unchanged. Do not add a competing row or alias without its own bounded review [S01–S02]. |
| `whole buckwheat flour`, `farine entière de sarrasin` | Keep separate and unassigned in this review. | Trigone lists whole flour separately from gray flour. The Québec Food Directory also describes a separate whole buckwheat flour SKU; its state and name are not interchangeable with every dark/gray product [S02, S05]. |
| `T60`, `dark buckwheat flour T60` | Do not add `T60` as an alias or shared grade claim. | T60 is present in the Québec miller's English product listing, but this review does not establish its definition or equivalence across mills [S01]. |
| `farine de sarrasin foncée`, `farine de sarrasin noir`, `buckwheat meal` | Keep off aliases. | An Ontario mill's French product page uses `farine de sarrasin foncée` for its product and describes whole kernels with hull. Existing A7 research found `buckwheat meal` used as a synonym for one dark flour listing while another supplier uses it for a coarse groat product. Neither establishes universal alias equivalence [S03, A2]. |
| Tartary buckwheat flour and sprouted buckwheat flour | Keep the current identities and aliases unchanged. | Both are separately qualified product identities; no source establishes dark/gray as equivalent to either [A3–A4]. |

## Proposed reference delta

If accepted, append only this row; do not change an existing row:

~~~json
{
  "id": "ingredient-ref-dark-buckwheat-flour",
  "nameFr": "farine grise de sarrasin",
  "nameEn": "dark buckwheat flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
~~~

## Exact ownership, source ID, archive, and picker audit

The post-R160 live snapshot contains **1,535 ingredient references, 119 ingredient forms, 61 legacy-import candidates, and 1,880 research-ledger records**. The manifest lists **114 recipe files and 1,123 ingredient rows**.

Exact normalized ownership was checked across reference IDs, names and aliases; form IDs, labels and match terms; legacy candidate fields; and ledger record IDs. Phrase matching uses the same lowercase NFKD, accent folding, and punctuation to space behavior as [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).

| Key or surface | Current owner or result |
|---|---|
| `ingredient-ref-dark-buckwheat-flour` | Absent from active references, forms, legacy candidate IDs, and ledger record IDs; proposed ID remains unallocated. |
| `dark buckwheat flour`; `farine grise de sarrasin`; `farine de sarrasin grise` | No exact active reference or form owner. The first phrase appears in the A7 buckwheat-meal evidence as a source-product description, not as an allocated reference. |
| `buckwheat flour`; `farine de sarrasin` | Current active results include the generic, sprouted, and Tartary flour identities. The generic row remains the family result. |
| Legacy candidates | No buckwheat/sarrasin candidate is present in the 61-row legacy import file. |
| Forms, package yields, and substitution rules | No buckwheat form is attached in the package of 119 forms; the package has no buckwheat yield or global or contextual substitution rule. |
| Prior A6 decisions | No earlier proposal or integration allocated a dark/gray buckwheat flour identity. R23's A7 decision concerns only the ambiguous `buckwheat meal` phrase and records dark flour as one use of that phrase in a particular source; it does not resolve this separately named flour product [A2]. |
| Source ID prefix `WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S` | No hit in the live ledger or archived proposals/batches before this draft. S01–S05 are used only here. Existing A1–A4 IDs are cited without reallocation. |

Static picker projection using the current whole-word phrase matching:

| Query | Current result | Projected result if accepted |
|---|---|---|
| `dark buckwheat flour` | No result. | `ingredient-ref-dark-buckwheat-flour` only. |
| `farine grise de sarrasin` | No result. | `ingredient-ref-dark-buckwheat-flour` only. |
| `buckwheat flour` | Generic, sprouted, and Tartary buckwheat flour. | The same three plus the proposed dark flour. |
| `farine de sarrasin` | Generic, sprouted, and Tartary buckwheat flour. | Unchanged: the proposed French display has the source-attested word order `farine grise de sarrasin`; no broad or rearranged alias is added. |
| `sarrasin` | Eleven current buckwheat product references. | The same eleven plus the proposed dark flour. |

This projection is static; no runtime picker or emulator test was run.

## Manifest recipe demand

All **114 recipe files listed in the manifest and 1,123 ingredient rows** were scanned for the proposed ID, `dark buckwheat flour`, `farine grise de sarrasin`, and related buckwheat flour phrases. There were zero direct ID references, ingredient-row matches, or recipe text mentions. No recipe link or edit is proposed.

## Forms, measures, conversions, yields, and substitutions

- **Forms:** Add none. No current buckwheat flour forms exist in the package; the existing buckwheat rows remain unchanged.
- **Measurements:** Add no reusable household measure. The miller lists retail package sizes, which are package masses rather than cup or spoon measures [S01–S02]. The Québec Food Directory lists 60 g per 1/3 cup for a separate `Farine de sarrasin entière biologique` SKU. That value is specific to that product and cannot be assigned to Trigone's gray/dark product [S05].
- **Density and unit mappings:** Leave `defaultDensity` null and `unitMappings` empty. No bulk density source for the proposed gray/dark product was found. The adjacent whole flour label does not establish a reusable density.
- **Conversions and yields:** Add none. Package size and a separate whole flour label serving do not establish milling yield, cooking yield, or a conversion for this product.
- **Substitutions:** Add no global or contextual rule and no supported substitution finding. The product listings describe uses such as pancakes or baking but do not test a transferable replacement amount or RecipeBook recipe context [S01–S03].
- **Recipe links:** Add none; the manifest scan found no candidate demand.

## Proposed ledger delta

If the reference is accepted, add one new `ingredient_reference` record. Keep any observations and substitution findings empty; this proposal has no reusable measurement or tested substitution specific to this product.

~~~json
{
  "recordId": "ingredient-ref-dark-buckwheat-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S01",
      "url": "https://en.alimentstrigone.com/collections/all",
      "title": "Aliments Trigone, English product catalogue",
      "accessedOn": "2026-10-16",
      "locator": "Organic dark buckwheat flour T60 listings and Québec business address",
      "supports": "The Québec miller lists dark buckwheat flour T60 in several package sizes. The English display names a product; T60, package weights, and claims specific to this product do not establish a general grade, household measure, density, or substitution.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S02",
      "url": "https://alimentstrigone.com/collections/sarrasin-noir-biologique",
      "title": "Aliments Trigone / Horizon Nature, French buckwheat product catalogue",
      "accessedOn": "2026-10-16",
      "locator": "Farine grise de sarrasin listings, package sizes, and separate pale and whole flour products",
      "supports": "The Québec miller currently lists farine grise de sarrasin in 1, 2, 5, 10, and 20 kg sizes, alongside separately named farine pâle and farine entière products. This supports the exact French product display and a bounded product distinction, not a universal milling specification or conversion.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S03",
      "url": "https://arvaflourmills.com/fr/products/buckwheat-flour-dark",
      "title": "Arva Flour Mills, Farine de sarrasin foncée",
      "accessedOn": "2026-10-16",
      "locator": "Product title and producer description",
      "supports": "The Ontario mill's French product page calls its 800 g item Farine de sarrasin foncée and says its flour is made from whole buckwheat including hull. This is corroborating French wording and process information for that producer; it does not make farine de sarrasin foncée a universal alias for Trigone's farine grise, nor establish transferable measures or substitutions.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S04",
      "url": "https://onehoney.ca/collections/buckwheat",
      "title": "Oneroot Honey, Buckwheat products",
      "accessedOn": "2026-10-16",
      "locator": "Product list for Organic Dark Buckwheat Flour and Organic Whole Buckwheat Flour",
      "supports": "The Canadian seller presents dark and whole buckwheat flour as separately named products and says its flours come from a Québec miller. This supports the existence of differentiated market names; the page does not establish that these categories are equivalent across producers or give a reusable measure.",
      "sourceKind": "retailer"
    },
    {
      "sourceId": "WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S05",
      "url": "https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8204187",
      "title": "Québec Food Directory, Organic Whole Buckwheat Flour",
      "accessedOn": "2026-10-16",
      "locator": "French product name and description; portion and serving-size declaration",
      "supports": "The government directory describes a distinct Farine de sarrasin entière biologique product made from organic black buckwheat and declares 60 g per 1/3 cup. The serving applies to this separate whole flour product and is deliberately not transferred to the proposed dark/gray reference.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-S31",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin",
      "title": "Office québécois de la langue française, farine de sarrasin",
      "accessedOn": "2026-10-05",
      "locator": "Preferred term and English translation",
      "supports": "Pairs the generic preferred Québec French term farine de sarrasin with English buckwheat flour. It does not define the compound farine grise de sarrasin.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Accept dark buckwheat flour / farine grise de sarrasin as one named milling product identity. A Québec manufacturer currently lists the English dark T60 product and French gray flour product, with distinct pale and whole flour items in the same catalogue. Keep the general buckwheat flour, sprouted and Tartary flours, and the unresolved buckwheat meal candidate unchanged. Do not claim universal process equivalence, measurements, density, conversions, yields, or substitutions.",
      "sourceIds": [
        "WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S01",
        "WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S02",
        "WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S03",
        "WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S04",
        "WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S05",
        "WP02-S31"
      ]
    }
  ]
}
~~~

## Source register

| ID | Source and locator | Supports and limits |
|---|---|---|
| **S01 — WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S01** | Aliments Trigone, [English product catalogue](https://en.alimentstrigone.com/collections/all), dark buckwheat flour T60 product listings. | Current Québec mill listing includes dark buckwheat flour T60 in multiple package sizes. Package size is not a kitchen measure; T60 is not asserted as a universal grade. |
| **S02 — WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S02** | Aliments Trigone / Horizon Nature, [French buckwheat product catalogue](https://alimentstrigone.com/collections/sarrasin-noir-biologique), `farine grise de sarrasin` listings. | Direct Québec French product wording. It separately lists `farine pâle` and `farine entière`; package sizes and pricing are not conversions. |
| **S03 — WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S03** | Arva Flour Mills, [Farine de sarrasin foncée](https://arvaflourmills.com/fr/products/buckwheat-flour-dark). | Ontario producer's French item page uses this title for its dark flour and describes its flour as made from whole buckwheat including hull. Do not use the phrase as an alias across producers without stronger equivalence evidence. |
| **S04 — WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S04** | Oneroot Honey, [Buckwheat products](https://onehoney.ca/collections/buckwheat). | Canadian retailer shows separately named dark and whole buckwheat flour products and identifies its miller as Québec-based. Retailer comparison does not define a universal milling class. |
| **S05 — WP02-A6-DARK-BUCKWHEAT-FLOUR-R161-20261016-S05** | Québec Food Directory, [Farine de sarrasin entière biologique](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8204187). | Government directory confirms another, separately named whole flour SKU and its serving of 60 g / 1/3 cup. Do not transfer its serving to the proposed dark/gray product. |
| **A1 — WP02-S31 (existing ledger source, reused without reallocation)** | OQLF, [farine de sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497972/farine-de-sarrasin). | Supports the generic preferred Québec French and English terms only; it does not define the compound `farine grise de sarrasin`. |
| **A2 — existing R23 A7 decision** | [WP02 A7 buckwheat meal boundary review](wp02-a7-buckwheat-meal-boundary-review-20261013-round23.md). | Keeps `buckwheat meal` unresolved because current sources use the phrase for both a dark flour product synonym and a coarser groat product. This review does not reopen or change that candidate. |
| **A3 — WP02-A6-TARTARY-BUCKWHEAT-FLOUR-R75 source record** | Existing ledger entry for `ingredient-ref-tartary-buckwheat-flour`. | Keeps Tartary flour separate from common-buckwheat flour; it does not support transferring Tartary composition, density, or formula data. |
| **A4 — WP02-A6-SPROUTED-BUCKWHEAT-FLOUR-IDENTITY-20261012 source record** | Existing ledger entry for `ingredient-ref-sprouted-buckwheat-flour`. | Keeps sprouted buckwheat flour separate and its study density and label serving specific to those sources. No value is transferred here. |

## Reopening conditions

- Reopen the French display only if an independent Québec terminology review or a new current local product source identifies a better supported display; retain the exact product phrase as the current proposal basis.
- Add aliases only when a current Canadian or Québec product source ties the exact phrase to the same product and the extra alias will not absorb generic flour, whole flour, pale flour, Tartary, or meal searches.
- Add any measure or density only from an explicit source for this product, with the state, method, and SKU recorded; do not import the separate whole flour serving.
- Reopen substitutions only with a tested finding for a specific recipe or a transferable source that identifies the product and basis. Until then, keep all substitution rules and findings empty.

No app, unit, instrumentation, emulator, or build tests were run. This is a proposal review; the database JSON exemption in `AGENTS.md` also states that testing is unnecessary for changes limited to database JSON data.
