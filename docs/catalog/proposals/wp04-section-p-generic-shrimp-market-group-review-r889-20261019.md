# WP04 Section P — generic shrimp / crevette name-group review (R889)

- **Review and source-access date:** 2026-10-19.
- **Status at drafting:** Proposal only. Root later integrated the accepted identity-only row and supplemental source recheck; see the R887–R889 integration README for shared changes and validation.
- **Exact open plan anchor:** [Shrimp/prawn by meaningful preparation; crab and crayfish](../../RecipeBook-global-ingredient-catalog-plan.txt#L8200), under the open WP04 Section P fish and shellfish parent.
- **Recommendation:** Add one identity-only, visibly qualified generic market-name group: `shrimp (name used for multiple shrimp species) / crevette (nom utilisé pour plusieurs espèces de crevettes)`. This represents repeated species-linked label wording; it is not a taxon, a preparation state, or a claim that all species named this way are interchangeable.

## Scope and earlier decision

The 2026-10-09 review correctly held a bare fresh-shrimp/prawn identity. It found no bundled recipe demand, a real picker overlap with dried shrimp and Kapi, and no basis for treating `fresh`, `raw`, `cooked`, `frozen`, `previously frozen`, or shell presentation as synonyms. See the [earlier shrimp/prawn boundary review](wp04-fresh-shrimp-prawn-boundary-review-20261009.md).

This proposal reopens only the generic name boundary. It proposes a qualified name group, not a `fresh shrimp` product or a universal shrimp species. The current CFIA Fish List repeats the exact unqualified English/French pair `Shrimp / Crevette` across several distinct species entries. The visible qualifier makes that name-group scope explicit. The earlier recipe-demand and picker-overlap findings remain true and are documented below; this proposal does not claim the overlap disappears.

Keep all current species-specific, preserved, prepared, and condiment identities unchanged, including Northern shrimp, dried shrimp, breaded and coconut preparations, popcorn shrimp, canned cocktail shrimp, shrimp balls, Kapi, and fermented shrimp condiments. Preserve each existing ledger observation and product-specific measurement or claim on its current record. Do not transfer those claims to this group.

The reviewed [generic-ingredient scope disposition](../batches/generic-ingredient-scope-review-20261019/README.md) found no open task solely for a commercial-product roster. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched. Any such roster-only line remains out of scope because commercial-product counts do not add ingredient diversity. Existing branded rows and their evidence remain intact.

## Evidence and name boundary

CFIA’s [Fish List search for `shrimp`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=shrimp) currently returns species-linked common-name rows with the exact pair `Shrimp / Crevette` for multiple taxa. Examples in different families include *Acetes indicus* (Sergestidae), *Farfantepenaeus aztecus* (Penaeidae), and *Macrobrachium rosenbergii* (Palaemonidae). The same result set includes many narrower English or French names, so the proposed group covers only the repeated unqualified wording as a generic picker identity; it is not an import of every row containing the word `shrimp`. The result table is labeling evidence, not a complete taxonomy or a culinary-equivalence rule. [Existing source `WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S03`, rechecked 2026-10-19.]

OQLF identifies `crevette` as the preferred Québec term in the edible-crustacean domain and lists English `shrimp`; it labels `prawn` as United Kingdom usage. The entry’s note concerns a commercially relevant Québec fishery term and does not establish that every species on the CFIA list belongs to one Québec market or culinary class. Use it for the base bilingual terminology only; the full multi-species qualifier is catalog-authored, not an OQLF-normalized term. [Existing source `WP04-FRESH-SHRIMP-20261009-S01`, rechecked 2026-10-19.]

CFIA says the Fish List contains English and French common names tied to species, and that only names listed for a species should be used for that species on Canadian labels. Its guidance also says multi-species group names may be considered in its Fish List process. This explains the source’s label scope; it does not approve the catalog display or establish that the species share taste, preparation, safety, yield, or substitution behavior. [Existing source `WP04-FINFISH-ID-20261009-S06`, rechecked 2026-10-19.]

The proposed English and French qualifiers describe name usage only. They do not define membership by taxonomy, imply a universal commercial class, or resolve species for a recipe or product. The generic display should remain paired with the full qualifier; do not shorten it to unqualified `shrimp / crevette` as an official species or market name.

## Exact proposed data

If accepted later, add one new reference. No generic shrimp reference or unresolved shrimp candidate currently owns this identity, so there is no candidate to promote.

```json
{
  "id": "ingredient-ref-shrimp-market-group",
  "nameEn": "shrimp (name used for multiple shrimp species)",
  "nameFr": "crevette (nom utilisé pour plusieurs espèces de crevettes)",
  "aliasesEn": ["shrimps"],
  "aliasesFr": ["crevettes"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "PROTEIN"
}
```

The plural aliases are search inflections only. Do not add `prawn` or `prawns`: the OQLF entry labels `prawn` as UK usage, and this review found no food-label source establishing it as a Québec-wide alias for the proposed group. Also keep species names, scientific names, Northern/whiteleg/tiger/spot shrimp, `scampi`, freshwater qualifiers, `mantis shrimp`, and preparation or preservation wording out of aliases. The CFIA result assigns some of these more specific or differently paired labels to individual taxa; `mantis shrimp` is paired with `squille-mante`, not the unqualified pair modeled here.

Do not add forms, measurements, density, unit mappings, package relationships, conversions, edible or cooking yields, recipe links, or substitutions. If later integrated, create one ledger record for the qualified identity, set only its identity state to verified for this bounded name-group scope, and leave measurement and substitution research `not_yet_researched`.

## Source and scope register

The source identifiers below already exist in the research ledger; no proposal-local or shared-ledger source entries were added by this proposal.

| Source ID | Source | Supports and limits |
|---|---|---|
| **Reused `WP04-SECTIONP-NORTHERN-SHRIMP-20261013-R74-S03`** | CFIA, [Fish List results for `shrimp`](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=shrimp), checked 2026-10-19. | Species-linked rows show the exact `Shrimp / Crevette` pair across several taxa and families. The list also gives narrower names and alternate French pairings. Supports name overlap only; no culinary identity, complete species set, or equivalence claim. The original ledger source is attached to the Northern-shrimp and breaded-butterfly-shrimp records. |
| **Reused `WP04-FRESH-SHRIMP-20261009-S01`** | OQLF, [crevette (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198913/crevette), updated 1998; rechecked 2026-10-19. | Preferred Québec `crevette`, English `shrimp`, and UK-labelled `prawn`. Terminology only; it does not establish multi-species membership or preparation equivalence. The original ledger source is attached to coconut shrimp and Northern shrimp. |
| **Reused `WP04-FINFISH-ID-20261009-S06`** | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), modified 2023-09-25; rechecked 2026-10-19. | Defines the Fish List’s species-linked label scope and notes that group names covering multiple species may be considered. It is labeling policy, not recipe taxonomy or approval of this catalog group. The same source ID is already shared by multiple WP04 fish records. |
| **R01 — repository audit** | Read-only review of the current plan, references, forms, legacy identities, ledger, scope review, manifest-listed recipes, and [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). | Records current ownership and static picker projection only; it is not external identity evidence or a shared-ledger source. |

## Current ownership and picker audit

The live snapshot contains **1,915 ingredient references**, **201 forms**, **56 legacy identities**, **2,319 research-ledger records**, and **10,941 ledger source entries**. The manifest lists **114 recipes** and **1,123 structured ingredient rows**.

No active reference, form, or legacy identity owns an exact normalized key for `shrimp`, `shrimps`, `crevette`, `crevettes`, `prawn`, `prawns`, either proposed qualified display, or `ingredient-ref-shrimp-market-group`. The research ledger has no generic shrimp candidate or target-ID record. Related wording is present in existing product and condiment identities; it is not an exact owner for the proposed name group. No seafood form currently contains shrimp, prawn, or crevette wording.

Picker behavior follows phrase-first complete-word matching across displays, aliases, and attached forms, with substring fallback only when no phrase matches. The read-only projection is:

| Query | Current active results | With the proposed row | Boundary |
|---|---:|---:|---|
| `shrimp` | 10 | 11 | Adds a visibly qualified name group beside current product, preserved-food, condiment, and species-specific results. This remains a broad multi-result query. |
| `shrimps` | 1 | 2 | Adds the qualified group beside the dried-shrimp result; plural alias only. |
| `crevette` | 4 | 5 | Adds the qualified group beside coconut shrimp, dried shrimp, Northern shrimp, and popcorn shrimp. |
| `crevettes` | 14 | 15 | Adds the qualified group to an already broad product/condiment query; the picker remains multi-result. |
| `prawn` / `prawns` | 0 / 0 | 0 / 0 | No UK-only alias is activated. |
| `dried shrimp` / `dried shrimps` | 1 / 1 | 1 / 1 | Existing dried shrimp identity remains separate. |
| `Northern shrimp` / `crevette nordique` | 1 / 1 | 1 / 1 | Existing species/market-specific name remains separate. |
| `Kapi` | 1 | 1 | Existing shrimp paste condiment remains separate. |
| Full proposed English or French display | 0 | 1 each | The full qualifier selects only the proposed group. |

The bare `shrimp` and especially `crevettes` result sets are already broad. The visible qualifier names the proposed generic group, but the proposal does not claim to eliminate picker crowding. Product, preservation, species, and condiment results remain distinct so the user can choose among them.

## Bundled recipe demand

All **114 manifest-listed recipe files**, all **1,123 structured ingredient rows**, and the full serialized recipe text were scanned for whole-word `shrimp` / `shrimps`, `prawn` / `prawns`, `crevette` / `crevettes`, and `scampi` wording. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe amount, form, product state, identity link, or substitution can be inferred, so none is proposed.

## Out-of-scope boundaries and limitations

- This proposal fills only a generic unqualified-name gap. The existing shrimp/prawn preparation checklist remains open for separately justified generic ingredients; this review does not enumerate those preparations.
- Brand, product-line, flavour-family, SKU, and retailer-only roster work is out of scope because commercial-product counts do not add ingredient diversity. No such line was pursued. Preserve existing branded rows and all product-scoped evidence.
- The CFIA Fish List is species-linked Canadian labeling evidence. Its repeated names do not define a biological genus, list every food commonly called shrimp, or show that the species are interchangeable in recipes.
- OQLF supports the Québec base wording but its entry is not an exhaustive species scope. The catalog-authored qualifier remains necessary; independent Québec review of that compound display is still useful.
- The current `shrimp` and `crevettes` results will grow by one and remain crowded. There is no matching recipe demand. The proposal recommends the generic group for identity coverage and makes that picker tradeoff explicit.
- Do not generalize any product-specific quantity, ingredient declaration, readiness, preservation, shell presentation, cooking method, safety advice, or claim. Measurement and substitution research remain open.

## Files reviewed

`AGENTS.md`; the open Section P parent at [plan line 8182](../../RecipeBook-global-ingredient-catalog-plan.txt#L8200); the prior [fresh shrimp/prawn hold](wp04-fresh-shrimp-prawn-boundary-review-20261009.md); recent qualified-name-group examples for [snapper (R866)](wp04-generic-seafood-species-diversity-review-r866-20261019.md), [oyster (R871)](wp04-generic-oyster-species-diversity-review-r871-20261019.md), [cockle (R877)](wp04-section-p-generic-cockle-name-group-review-r877-20261019.md), [mussel (R883)](wp04-next-generic-seafood-gap-review-r883-20261019.md), and [eel (R886)](wp04-next-generic-seafood-gap-review-r886-20261019.md); the [generic scope review](../batches/generic-ingredient-scope-review-20261019/README.md); current active references and forms; legacy identities; relevant ledger records and reused sources; the manifest and every manifest-listed recipe; and `IngredientSearch.kt`.

The proposal path, target reference ID, exact display/alias keys, and R889 source-prefix search were checked before creation. No software tests, build, emulator run, or deployment was performed under the database-JSON exception in `AGENTS.md`.

### Integration source recheck

During root review on 2026-10-19, the current CFIA `shrimp` query was reopened and the exact
`Shrimp / Crevette` pair was confirmed on rows for *Acetes indicus* (TSN 95899),
*Farfantepenaeus aztecus* (TSN 551570), and *Macrobrachium rosenbergii* (TSN 96343), across three
families. CFIA guidance §5.2.2 was also reopened and confirms that multi-species group names may be
considered in the Fish List process. These current, source-scoped checks are recorded as supplemental
R889 ledger citations `WP04-SECTIONP-SHRIMP-MARKET-GROUP-R889-20261019-S01` and `-S02`; the original
R74, OQLF, and CFIA guidance source records remain unchanged.

## Recommendation

Accept one identity-only `ingredient-ref-shrimp-market-group` for `shrimp (name used for multiple shrimp species) / crevette (nom utilisé pour plusieurs espèces de crevettes)`, with the ordinary plural search inflections shown above. Preserve the previous fresh-shrimp/prawn hold as a valid historical boundary decision, all existing species and prepared-product rows, and their source-scoped evidence. Keep forms, measurements, recipes, conversions, yields, and substitutions unchanged.
