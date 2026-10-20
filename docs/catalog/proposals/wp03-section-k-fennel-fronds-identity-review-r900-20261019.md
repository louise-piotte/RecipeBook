# WP03 Section K — fennel fronds identity review (R900)

**Status:** Integrated as identity-only data in the R899–R901 batch.

**Reviewed:** 2026-10-19

**Plan anchor:** Section K remains open for further documented leafy-green, plant-part, and regional-plant coverage ([catalog plan, Section K](../../RecipeBook-global-ingredient-catalog-plan.txt#L6531)). This review concerns the fresh foliage of culinary fennel and does not reopen the existing bulb or seed identities.

## Recommendation

Add one identity-only `HERB` reference for **fennel fronds / frondes de fenouil**, limited to the finely divided foliage of correctly identified culinary fennel, *Foeniculum vulgare*. University of Wisconsin–Madison Extension says the fresh leaves are used to flavor fish, egg dishes, and salads; Purdue Extension says fennel stalks and fronds can be used in cooking. Québec recipe sources use the terms `frondes de fenouil` and `feuilles du fenouil` for garnish and finishing use.

This fills a distinct plant-part gap alongside the active fennel-seed spice and Florence-fennel bulb vegetable. Keep the fronds separate from the bulb, stems and stalks, seeds, pollen, flowers, and seed umbels. The open checklist supports continued generic plant-part discovery; it does not require a generic `fennel` alias or a roster of commercial products.

The OQLF's existing `fenouil / fennel` record names *F. vulgare* but defines culinary consumption through the fleshy petiole base or seeds; it does not establish leaf use. The proposed leaf-use claim comes from Extension and culinary evidence, not from that OQLF definition.

## Integrated data

```json
{
  "id": "ingredient-ref-fennel-fronds",
  "nameEn": "fennel fronds",
  "nameFr": "frondes de fenouil",
  "aliasesEn": ["fennel leaves"],
  "aliasesFr": ["feuilles de fenouil"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "HERB"
}
```

The integrated identity-only ledger record has `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. No form, recipe link, density, unit mapping, measure, conversion, yield, or substitution was added. The reviewed sources support fresh foliage use; they do not establish a dried form or transferable quantity.

## Identity and no-transfer boundary

| Identity or evidence | Treatment | Limit |
|---|---|---|
| `fennel fronds` / `frondes de fenouil` | New leafy-herb identity | Fresh, finely divided foliage of *F. vulgare* used as an aromatic culinary ingredient. The French compound is attested in a Québec recipe source but is not presented as an OQLF terminology ruling. |
| `fennel leaves` / `feuilles de fenouil` | Narrow search aliases | These terms identify the same foliage. Extension uses the English wording; Québec culinary sources use `feuilles du fenouil` and `frondes de fenouil`. The alias `feuilles de fenouil` is a descriptive normalization, not an OQLF-standardized term. Do not add bare `fennel` or `fenouil`. |
| `ingredient-ref-florence-fennel` (`Florence fennel / fenouil de Florence`) | Preserve unchanged | This row identifies the bulb vegetable and has only bulb-qualified aliases. Its Health Canada bulb portions, sliced-bulb observations, and refuse remain scoped to raw Florence fennel bulb. They are not foliage measures or conversions. |
| `ingredient-ref-fennel-seeds` (`fennel seed / graine de fenouil`) and its ground form | Preserve unchanged | Its seed identity covers the dried fruit/spice and the ground-seed form. CFIA and retailer evidence attached to that identity is not leaf evidence. No retailer package size or seed measurement is generalized. |
| Stalks, stems, bulb, flowers, pollen, mature fruits/seeds, seed umbels, and other fennel parts | Exclude from this identity | Sources name these separately or treat them as distinct culinary parts. A source's broader statement that other fennel parts are edible does not broaden the proposed foliage identity. |
| Dried leaves, tea, extracts, oils, seed products, and preparations | Keep unresolved or separate | Extension notes that fennel leaves do not retain flavor well when dried. No dried form or prepared product is proposed; infusion, extract, and oil evidence is not transferred. |
| Cultivars, branded products, commercial lines, flavours, SKUs, and retailer variants | Out of scope | Commercial-product counts do not add ingredient diversity. No commercial roster or brand evidence is researched or proposed; existing branded rows and evidence remain untouched. |

The Québec carpaccio recipe offers fennel fronds or dill as a garnish choice. That is a dish-specific option and does not establish a general fennel-to-dill substitution. Its “a few fronds” direction remains attached to that recipe. The Télé-Québec recipe's instruction to retain some fennel leaves for finishing and reserve the remainder for later use likewise supplies no reusable quantity or storage rule.

## Sources

IDs below are proposal-local unless marked as an existing ledger source. No shared ledger records or source IDs are assigned by this proposal.

| Source ID | Source | Supports and limits |
|---|---|---|
| **Existing `WP03-STEMS-SHOOTS-BLOSSOMS-20261010-S05`** | Office québécois de la langue française, [GDT: *fenouil*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095229/fenouil), updated 1982; accessed 2026-10-19. | Already owned by `ingredient-ref-florence-fennel`. Gives `fenouil / fennel` and *Foeniculum vulgare*. Its definition names the fleshy petiole base or seeds as consumed parts, not the foliage. Reuse it only for the reviewed base plant term and species boundary, not as leaf-use, alias, measure, or form evidence. `sourceKind: regional_authority`. |
| `WP03-K-FENNEL-FRONDS-R900-20261019-S01` | University of Wisconsin–Madison Extension, [Fennel, *Foeniculum vulgare*](https://hort.extension.wisc.edu/articles/fennel-foeniculum-vulgare/), revised July 2026; accessed 2026-10-19. | Identifies fennel as *F. vulgare*, distinguishes Florence fennel's bulb (stem bases) from leaves, and says fresh leaves are used to flavor fish, egg dishes, and salads. It notes that leaves do not retain flavor well when dried. Supports the foliage identity and fresh culinary use only; supplies no transferable amount or dried-form equivalence. `sourceKind: extension`. |
| `WP03-K-FENNEL-FRONDS-R900-20261019-S02` | Purdue Extension FoodLink, [Fennel](https://www.extension.purdue.edu/foodlink/food.php?food=fennel), accessed 2026-10-19. | Says stalks and fronds can be used in cooking and separately notes that other fennel varieties are grown for leaves or seeds. It also gives storage and freezing guidance; those directions are Purdue page guidance, not catalog forms or transferable storage claims. Its bulb selection, storage, and cooking instructions remain page-specific. `sourceKind: extension`. |
| `WP03-K-FENNEL-FRONDS-R900-20261019-S03` | Télé-Québec, [Salade fraises et fenouil au sumac](https://cuisinez.telequebec.tv/recettes/8061/salade-fraises-et-fenouil-au-sumac), accessed 2026-10-19. | Separates fennel leaves from bulb and stems, keeps some leaves for finishing the salad, and reserves the rest. Supports Québec culinary use and the phrase `feuilles du fenouil`; the recipe gives no general measure or reusable storage direction. `sourceKind: culinary_reference`. |
| `WP03-K-FENNEL-FRONDS-R900-20261019-S04` | Josée di Stasio, [Carpaccio du marché](https://www.joseedistasio.ca/recettes/entrees-et-apero/carpaccio-du-marche/), accessed 2026-10-19. | Names `frondes de fenouil` as an optional garnish and uses some fronds in that dish. Supports the French display wording and culinary use. Its alternative garnish choices do not establish a general substitution; recipe quantities stay recipe-specific. `sourceKind: culinary_reference`. |

No manufacturer, branded-product, SKU, or retailer-variant source was used. No product-specific measure or claim is generalized to fennel foliage.

## Ownership, recipe demand, and picker projection

**Current ownership snapshot (2026-10-19).** The bundled catalog has 1,927 ingredient references and 201 forms; the research ledger has 2,330 records, 10,990 source entries, and 9,224 distinct source IDs. The legacy candidate file has 56 candidates. The manifest lists 114 recipes and 1,123 ingredient rows.

The only active ingredient references containing the fennel plant name are `ingredient-ref-fennel-seeds` (`fennel seed / graine de fenouil`) and `ingredient-ref-florence-fennel` (`Florence fennel / fenouil de Florence`). The fennel-seed reference has one dry ground form; the Florence-fennel reference has no forms. Neither has a frond or leaf alias. Exact phrase, ID, scientific-name, form, legacy-candidate, ledger, proposal, batch, and plan searches found no owner for `fennel fronds`, `fennel leaves`, `frondes de fenouil`, `feuilles de fenouil`, or `ingredient-ref-fennel-fronds`. The UW–Madison Extension, Purdue Extension, Télé-Québec, and Josée di Stasio URLs and this R900 source-ID prefix are unowned in the current ledger. Preserve the existing bulb and seed records and all of their sources and measures; the only reused source is the OQLF crop-name/taxon entry described above.

**Bundled recipe demand.** Full-text and structured-row scans of all 114 manifest-listed recipe files found no fennel, fenouil, fennel-frond, or fennel-leaf mention. No recipe amount, source-text line, or recipe link is proposed. The two Québec culinary pages establish use outside the current bundled corpus; their garnish wording and directions remain source-specific.

**Picker projection.** This is a static projection using the current normalized phrase/substring search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), not live picker QA.

| Query | Current result | With proposal | Effect |
|---|---|---|---|
| `fennel` / `fenouil` | Florence fennel and fennel seed | Those two plus fennel fronds | Broad terms remain intentionally ambiguous and receive a third visibly part-qualified result. |
| `fennel fronds` / `fennel leaves` | None | `ingredient-ref-fennel-fronds` | Resolves the foliage part. |
| `frondes de fenouil` / `feuilles de fenouil` | None | `ingredient-ref-fennel-fronds` | Resolves the French part-qualified identity. |
| `fennel bulb` / `fenouil bulbeux` | Florence fennel | Unchanged | The bulb stays on its existing row. |
| `fennel seed` / `graines de fenouil` | Fennel seed | Unchanged | The seed spice and ground form stay separate. |
| Bare `leaves` / `feuilles` | Existing broad leaf results, where present | Adds the part-qualified display | No generic leaf or plant-name alias is introduced. |

**Queue and scope review.** The open Section K lines call for continued generic leafy-green, edible-flower, and regional plant-part discovery. The `Broccolini` mention is an existing trademark/alias exclusion, not a queued research assignment; it remains excluded because commercial-product counts do not add ingredient diversity. No Section K line limited to brand, product-line, flavour-family, SKU, or retailer-variant enumeration was found. Any such roster-only line is out of scope for the same reason. This proposal preserves existing branded rows and product-scoped evidence and does not reopen the Broccolini boundary.

## Remaining limits

- The proposed identity covers fresh, finely divided *F. vulgare* foliage as a culinary herb; it does not identify the bulb, stalks, shoots, seed, pollen, flower, or whole plant.
- The French compound is documented in Québec culinary wording but is not a separate OQLF ruling.
- No bundled recipe demand, reusable amount, density, unit mapping, form, conversion, yield, or generally applicable substitution is supported. Measurement and substitution research remain open.
- The sources do not establish dried-leaf equivalence or a foraging/safety guarantee. Use culinary fennel identified as food.

## Root review and integration

- Accepted `ingredient-ref-fennel-fronds` as an identity-only `HERB` reference for fresh, finely divided *Foeniculum vulgare* foliage. Added only the part-qualified aliases `fennel leaves` and `feuilles de fenouil`; kept bulb and seed references and all their measurements unchanged.
- Root review confirmed the extension sources identify leaf use and distinguish the Florence-fennel bulb; Télé-Québec names leaves/pluches of fennel and keeps its finishing direction within that recipe; Josée di Stasio attests `frondes de fenouil` as optional garnish. No recipe quantity, storage direction, drying rule, or garnish alternative was generalized.
- The existing Broccolini trademark exclusion remains a prior boundary rather than a queued assignment. No brand or retailer roster was researched or added.
