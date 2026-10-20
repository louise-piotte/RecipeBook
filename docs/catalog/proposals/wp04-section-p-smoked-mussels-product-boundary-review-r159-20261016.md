# WP04 Section P — smoked mussels product-boundary review (R159)

- **Reviewed / sources accessed:** 2026-10-16.
- **Recommendation:** Add identity-only `smoked mussels / moules fumées` as `ingredient-ref-smoked-mussels`, category `PROTEIN`, with no aliases.
- **Scope:** A named market product group sold as smoked mussels. It is not a mussel species, a universal smoked form for raw mussel references, or a claim that every product has one species, smoke method, packing medium, shell state, storage state, or ready-to-eat treatment.
- **Status:** Proposal-only. No shared catalog JSON, ledger, forms, recipes, plan, roadmap, README, or generated index was changed. No tests or builds were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S01` through `S07`; repository audit ID `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-R01`. These IDs are local to this proposal and are not shared-ledger allocations.

## Open checklist and prior-work boundary

The broad [Section P fish and regional-seafood checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L4988) remains open. Its completed [preserved-fish product-state review](../../RecipeBook-global-ingredient-catalog-plan.txt#L11364) keeps generic preservation rows and universal `smoked` forms inactive, while allowing specific product reviews. The review establishes that product identity, species, cut, preservation condition, packing medium, and readiness are separate descriptors.

The [blue-mussel identity review](wp04-blue-mussel-identity-review-20261011.md) mentions smoked mussels among inactive product states; it assigns no smoked-mussel identity or form. The [Sardo marinated-mussel boundary review](wp04-section-p-sardo-marinated-mussels-product-boundary-review-20261013-round46.md) says to keep that herb-and-garlic product separate from smoked mussels, but does not allocate or hold the smoked product. The [R155 smoked-oyster hold](../batches/wp02-wp03-wp04-r155-gap-review-integration-20261015/README.md) is limited to packaged smoked oysters. The recent [R158 smoked-trout integration](../batches/wp02-wp03-wp04-r158-gap-review-integration-20261016/README.md) accepts a distinct finished-product group without adding a species form; this proposal reviews a different seafood product and retains the same species/product boundary.

A focused search of the current WP04 proposal and batch archive, active checklist, catalog, legacy candidates, and ledger found no smoked-mussel identity decision, focused hold, or allocation. The incidental mentions above are boundaries only. This review concerns the market product wording `smoked mussels / moules fumées`; it does not reopen blue, Mediterranean, or green-lipped mussel species, generic unqualified `mussel`, Sardo marinated mussels, smoked oysters, smoked trout, or universal preservation forms.

## Québec wording, species scope, and product state

Current manufacturer pages use **Smoked Mussels / Moules fumées** as a bilingual product name. Clover Leaf describes its product as hardwood-smoked mussels packed in sunflower oil and gives source details that vary by market source: Chile—*Mytilus* spp.; China—*Mytilus edulis*. The same product is therefore evidence for a finished product sold under smoked-mussel wording, not a single-species identity. A current Canadian distributor independently lists **Moules fumées**, item `3551BF`, as 14 × 120 g, product of Latvia. [S03–S04]

MAPAQ’s Québec mollusc guide (publication 09-0018) places **fumée / formats variés** among the listed product formats for blue mussels, *Mytilus edulis*. This supports a Québec smoked-mussel product presentation, but the document is an older industry guide and does not establish current retail availability or the species of unrelated products. OQLF’s GDT entry normalizes **moule** for blue mussel / *M. edulis* and cautions that related terms were not retained for commercial seafood labelling. It does not standardize the full phrase `moules fumées`. The full plural phrase is retained here only because current Québec-facing product pages use it; it must not be reduced to bare `moules` as a generic species alias. [S01–S02]

Treat the proposed row as the named market product group rather than a taxonomic assignment. Keep the existing species references and the unresolved generic `ingredient-ref-mussel` candidate unchanged. Do not infer that a product is packed in oil, canned, shell-free, chilled, shelf-stable, cold-smoked, hot-smoked, fully cooked, or ready to eat from the phrase alone. Clover Leaf’s specific product page says its product is ready for quick meals; that claim does not generalize to all products sold under the phrase. CFIA treats form/style, packing medium, and condition such as smoked as separate product descriptors, and its guidance separately addresses storage and non-ready-to-eat states. [S03, S07]

## Exact ownership and ID audit

At proposal handoff the live snapshot contained **1,531 ingredient references**, **119 forms**, **61 legacy candidates**, and **1,876 research-ledger records / 7,966 source entries / 6,814 distinct source IDs**. The manifest lists **114 recipes / 1,123 ingredient rows**. Exact ownership checks normalized case, accents, punctuation, ligatures, and whitespace across active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record strings.

| Candidate phrase or ID | Exact active owner | Allocation result |
|---|---|---|
| `smoked mussels`; `smoked mussel`; `moules fumées`; `moule fumée`; `smoked mussels in oil`; `moules fumées à l’huile`; `smoked mussels canned`; `moules fumées en conserve` | None in active reference names/aliases, form labels/match terms, or legacy-candidate names/aliases. No ledger product record has an exact phrase. | No exact smoked-mussel product reference or form exists. The phrase is not attached to a raw-mussel species. |
| Mussel species rows | `ingredient-ref-blue-mussel` is **blue mussel / moule**, with aliases `blue mussels`, `moule bleue`, `moules bleues`; `ingredient-ref-mediterranean-mussel` is **Mediterranean mussel / moule méditerranéenne**, with species-qualified plural aliases; `ingredient-ref-green-lipped-mussel` is **green-lipped mussel / moule verte**. | These remain species references. None has an attached form. Do not link smoked product wording to any of them. |
| `ingredient-ref-mussel` | Ledger-only candidate with `identityState: needs_clarification`; its current decisions keep generic mussel wording unresolved. It is not an active reference or form. | Keep the generic candidate unchanged; it does not own the smoked product. |
| `ingredient-ref-smoked-mussels`; `candidate-smoked-mussels` | Neither ID appears in references, forms, legacy candidate IDs, or ledger record IDs. | Both prospective IDs are free. Only the reference ID is proposed; no legacy candidate is proposed. |
| `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S01`–`S07`; `…-R01` | No current ledger source-ID collision. The complete R159 prefix was absent from the proposal/batch archive before drafting. | Source labels are unique to this packet and remain proposal-local until integration. |

Some authoritative URLs below already occur in the ledger for other evidence: the OQLF `moule` page is registered under `WP04-BLUE-MUSSEL-20261011-S01` and `WP04-MOLLUSKS-20261009-S06`; the MAPAQ PDF under `WP04-WHELK-20261011-S05`, `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S04`, and `WP04-SECTIONP-ICELAND-SCALLOP-R136-20261015-S12`; and the ILIOS catalogue page under `WP03-H-FROZEN-PEAS-CARROTS-20261011-S04`. CFIA’s general fish-label page also has existing records. The R159 IDs are still unused and their locators/support statements are scoped to this review; the coordinator may reuse an existing shared source object where its exact recorded evidence is sufficient. No shared source IDs are reserved by this proposal.

## Static picker projection

The projection mirrors phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), using reference names, aliases, and attached form terms. The hypothetical row uses only `smoked mussels / moules fumées`, empty aliases, and no forms.

| Query | Current results | With proposed row | Impact |
|---|---|---|---|
| `smoked mussels` | None | Smoked mussels / moules fumées | Exact English product phrase returns the proposed row. |
| `smoked mussel` | None | Smoked mussels / moules fumées | Singular English query reaches the plural display through substring fallback. |
| `moules fumées` | None | Smoked mussels / moules fumées | Exact Québec-facing product phrase returns the proposed row. |
| `moule fumée` | None | None | The plural French product display does not match this singular phrase; no singular alias is proposed because the Québec product sources use the plural product name. |
| `mussels`; `moules` | Blue mussel; Mediterranean mussel | Those two plus smoked mussels | These broad plural queries remain multi-result and visibly distinguish species from the prepared product. |
| `mussel`; `moule` | Blue, Mediterranean, and green-lipped mussel | Same three | Existing exact phrase results win before fallback, so the plural product row does not change these singular searches. |
| `smoked` | Seven results, including Montreal smoked meat, smoked haddock, smoked paprika, smoked salt, smoked tofu, smoked trout, and Peruvian Amazonian cecina | Those seven plus smoked mussels | Remains a broad multi-result query. |
| `fumée` | Four existing results | Same four | The plural display `fumées` does not alter the singular exact phrase results. |
| `fumées` | None | Smoked mussels / moules fumées | New plural French word is searchable. |
| `blue mussel`; `moule bleue`; Mediterranean species terms | Existing species row(s) | Unchanged | Species-specific names and aliases stay separate. |

No `canned`, `oil-packed`, species, cold/hot-smoke, shell-state, or ready-to-eat alias is added. The picker gains exact bilingual product queries while common species and broad smoke queries remain visibly multi-result.

## Manifest recipe scan

The manifest-ordered scan parsed all **114 recipe files** and all **1,123 structured ingredient rows**. It searched complete recipe JSON and ingredient-row values for `smoked mussels`, `smoked mussel`, `moules fumées`, `moule fumée`, `smoked mussels in oil`, `moules fumées à l’huile`, `smoked mussels canned`, and `moules fumées en conserve`; there were **zero matching files and zero matching ingredient rows**. Separate ingredient-row searches for broad `mussel`/`mussels` and `moule`/`moules` also returned zero. Broad `smoked` row search found two unrelated `smoked paprika` rows; `fumée` and `fumées` returned zero. No bundled recipe requests this product or links to a mussel species. [R01]

## Forms, measures, conversions, yields, and substitutions

- **Forms:** Add none. The proposed identity denotes the smoked-mussel product group as named in current market listings. Do not add a universal `smoked` form to blue, Mediterranean, green-lipped, or generic mussel rows. Keep canning, packing medium, shell state, smoke method, storage, and readiness product-specific.
- **Observed package/recipe quantities:** MAPAQ lists smoked blue-mussel formats as varied. ILIOS lists its Latvia product as a 14 × 120 g distributor pack. Clover Leaf recipe pages call for an 85 g can, drained; its product nutrition panel gives one drained can as 65 g. These refer to source- and product-specific package/serving descriptions, not a reusable portion. Do not calculate a general drained yield or treat the 85 g and 65 g figures as a catalog conversion. Clover Leaf also notes that the number of mussels per can varies by mussel size and that the cans are filled by weight. [S01, S04–S06]
- **Measurements and conversions:** Use `defaultDensity: null` and `unitMappings: []`. Add no piece count, count-to-mass, mass-volume, volume-mass, package, draining, cooking, or edible-yield conversion. No source supports a reusable density or shell-adjusted measure.
- **Substitutions:** Add no global or contextual substitution, amount, warning, or recipe-line substitution link. The market pages do not establish interchangeability with raw/fresh mussels, another mussel species, smoked oysters, smoked trout, or marinated mussels; the bundled corpus has no recipe method or role to scope a replacement.

## Proposed reference delta

```json
{
  "id": "ingredient-ref-smoked-mussels",
  "nameEn": "smoked mussels",
  "nameFr": "moules fum\u00e9es",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "PROTEIN"
}
```

No form, measurement observation, unit conversion, yield, recipe link, or substitution record is proposed.

## Proposed ledger delta

If accepted, add one verified identity record scoped to the named smoked-mussel product group. Do not change the existing unresolved generic mussel record.

```json
{
  "recordId": "ingredient-ref-smoked-mussels",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {"sourceId": "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S01", "sourceKind": "regional_authority"},
    {"sourceId": "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S02", "sourceKind": "regional_authority"},
    {"sourceId": "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S03", "sourceKind": "manufacturer"},
    {"sourceId": "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S04", "sourceKind": "other"},
    {"sourceId": "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S05", "sourceKind": "manufacturer"},
    {"sourceId": "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S06", "sourceKind": "manufacturer"},
    {"sourceId": "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07", "sourceKind": "regional_authority"}
  ],
  "decisions": [{
    "outcome": "accepted",
    "reason": "Add identity-only smoked mussels / moules fumées as a named finished-product group. Current manufacturer and distributor pages use the bilingual product wording, MAPAQ documents smoked formats for Québec blue mussels, and the manufacturer reports more than one Mytilus source scope for its product. Keep the row separate from mussel species and do not infer a universal species, packing medium, smoke method, readiness, measure, yield, or substitution. No bundled recipe demand was found.",
    "sourceIds": [
      "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S01",
      "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S02",
      "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S03",
      "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S04",
      "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S05",
      "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S06",
      "WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07"
    ]
  }]
}
```

The repository audit ID `WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-R01` is proposal provenance, not an external ledger source.

## Source register

Sources were accessed on 2026-10-16. The S01–S07 IDs remain local to this proposal; the shared ledger is unchanged.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| **WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S01** | Ministère de l’Agriculture, des Pêcheries et de l’Alimentation du Québec, [Les mollusques du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf), publication 09-0018, blue-mussel product-format table. | Identifies blue mussel as *Mytilus edulis* and lists smoked product as `Fumée — Formats variés` alongside other mussel products. Supports a Québec smoked-blue-mussel product presentation, not current stock or the taxon/formula of all marketed smoked mussels. This is an older MAPAQ industry guide now hosted at the current Québec CDN URL. |
| **WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S02** | Office québécois de la langue française, [GDT: moule](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198877/moule), updated 2012. | Gives normalized Québec `moule`, English `blue mussel`, and Latin *Mytilus edulis*; notes that `moucle`, `moule bleue`, and `mouque` were not retained for commercial fish-product labelling. Species terminology only: it does not standardize `moules fumées` as a complete product name or identify every smoked-mussel product as *M. edulis*. The URL is already in the ledger under the blue-mussel and generic-mussel records; this proposal’s source ID is new. |
| **WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S03** | Clover Leaf, [Moules fumées](https://www.cloverleaf.ca/fr/produits/moules-fumees-clover-leaf/) and [Smoked Mussels](https://www.cloverleaf.ca/en/products/smoked-mussels/), current manufacturer pages. | Directly supports the bilingual product wording and one product’s hardwood-smoke, sunflower-oil, ingredient, ready-use, and nutrition descriptions. Its sourcing section lists Chile—*Mytilus* spp. and China—*M. edulis*, so it does not establish one taxon for the product group. The readiness and packing claims apply to Clover Leaf’s specific product only. |
| **WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S04** | ILIOS Foods, [Produits](https://fr.iliosfoods.ca/products), fish-preserves section, item `3551BF`. | Current importer/distributor list identifies `Moules fumées`, 14 × 120 g, product of Latvia. Independent French-language Canadian market evidence; it gives no mussel species, retail serving, drain yield, or recipe conversion. The page URL is already registered in the ledger for an unrelated product section, with a different locator. |
| **WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S05** | Clover Leaf, [Poulet à la sauce crémeuse aux moules fumées](https://www.cloverleaf.ca/fr/recette/poulet-a-la-sauce-cremeuse-aux-moules-fumees/), current manufacturer recipe. | Uses one 85 g can of Clover Leaf smoked mussels, drained; method also uses the mussel liquid. Product-specific recipe quantity, not a general serving or conversion. |
| **WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S06** | Clover Leaf, [Bruschetta aux moules](https://www.cloverleaf.ca/fr/recette/bruschetta-aux-moules/), current manufacturer recipe. | Uses two 85 g cans. The note says cans are filled by weight and the number of mussels varies by size. It does not support a fixed per-piece mass or cross-product yield. |
| **WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-S07** | Canadian Food Inspection Agency, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish), “Descriptive words about the true nature of fish products,” “Net quantity,” and “Smoked or liquid smoked fish.” | Treats form/style, packing medium, and condition such as smoked as separate descriptors; gives additional storage and readiness-related labelling requirements for particular products. Supports keeping those fields separate. It is not a smoked-mussel product-name standard or a storage/ready-to-eat determination for either commercial listing above. The same general page is already used in other ledger records. |
| **WP04-SECTIONP-SMOKED-MUSSELS-R159-20261016-R01** | [Section P plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L4988), [preserved-fish boundary item](../../RecipeBook-global-ingredient-catalog-plan.txt#L11364), [live references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy candidates](../legacy-import-identities.v1.json), [ledger](../research-ledger.v1.json), manifest-listed recipes, `IngredientSearch.kt`, and WP04 proposal/batch archive. | Read-only ownership, ID/source-ID, archive, picker, and corpus audit at 1,531 references, 119 forms, 61 legacy candidates, 1,876 ledger records / 7,966 source entries / 6,814 distinct source IDs, and 114 recipes / 1,123 ingredient rows. Snapshot only. |

## Final recommendation

**Accept** an identity-only `smoked mussels / moules fumées` reference for the named market product group. Current manufacturer and distributor pages use this bilingual wording, Québec sources document smoked mussel products, and the manufacturer’s product details show why the row must not be assigned one species or a universal packing/readiness state. Keep the blue-, Mediterranean-, and green-lipped mussel references separate and leave the generic mussel candidate unresolved. Add no aliases, forms, measurements, density, mappings, conversions, yields, recipe links, or substitutions. No tests were run for this proposal-only documentation change.
