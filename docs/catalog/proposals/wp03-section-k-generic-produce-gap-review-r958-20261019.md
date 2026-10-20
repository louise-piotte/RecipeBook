# WP03 Section K — cauliflower leaves identity review (R958)

- **Reviewed:** 2026-10-19
- **Disposition:** Recommend one identity-only generic reference for cauliflower leaves / feuilles de chou-fleur, scoped to the edible leaves of food-grown *Brassica oleracea* var. *botrytis*.
- **Scope:** Generic culinary ingredient diversity. No brand, product-line, flavour-family, SKU, or retailer-variant roster was researched.
- **Plan anchor:** The Section K leafy-green and brassica sweep remains open ([catalog plan, lines 6552–6559](../../RecipeBook-global-ingredient-catalog-plan.txt#L6552)).
- **Mutation scope:** Proposal only. No catalog, ledger, recipe, plan, workflow, or roadmap file is changed.

## Recommendation

Add `ingredient-ref-cauliflower-leaves` as a generic plant-part identity. Espace pour la vie's Québec French cooking guide identifies cauliflower as *Brassica oleracea* (Botrytis group), pairs the names `chou-fleur / cauliflower`, says its leaves are edible, and includes blanched cauliflower leaves in a recipe. University of Illinois Extension independently gives general uses for cauliflower leaves: roast them as chips or add them to soups and stews. Together these sources support leaves as a distinct culinary ingredient from the usual cauliflower curd. [S01–S02]

The French display `feuilles de chou-fleur` is a transparent, locally attested plant-part phrase. The OQLF source already owned by the parent cauliflower entry standardizes the base `chou-fleur / cauliflower` pair and identifies *Brassica oleracea* var. *botrytis*; it does not standardize a separate leaf term. Preserve that source on its current owner. [S03]

Scope the identity to the leaves of culinary cauliflower, not to every *Brassica* leaf, ornamental plants, or wild cabbage. Keep cauliflower leaves separate from the parent cauliflower identity for the curd/head, and from broccoli leaves. No bundled-recipe demand, quantity, measurement, form, conversion, yield, recipe link, or active substitution is proposed.

## Proposed minimal data

```json
{
  "id": "ingredient-ref-cauliflower-leaves",
  "nameEn": "cauliflower leaves",
  "nameFr": "feuilles de chou-fleur",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

Empty aliases keep the identity on the directly attested bilingual names. Do not add generic `greens`, `cabbage leaves`, botanical names, or related Brassica terms as aliases.

## Ownership and neighboring identities

The current bundled package has **1,975 active ingredient references** and **205 forms**. The legacy import file has **55 candidates**, and the research ledger has **2,380 records**. Exact and accent-folded searches for `cauliflower leaves`, `cauliflower leaf`, `cauliflower greens`, `feuilles de chou-fleur`, `feuille de chou-fleur`, `feuilles de chou fleur`, and the proposed reference ID found no leaf-identity owner in active references, form labels or match terms, legacy candidates, or ledger record IDs and decisions. The proposed R958 source-ID prefix and the two new source URLs in S01–S02 were absent from the current ledger; no earlier proposal was found for the proposed reference ID.

| Existing identity or evidence | Boundary to preserve |
|---|---|
| `ingredient-ref-cauliflower` — `cauliflower / chou-fleur` | This is the existing general cauliflower crop identity. Its current OQLF source `WP03K-S17` remains attached to this row. Do not narrow or replace the row to accommodate the leaves, or transfer its evidence. |
| Legacy candidate `ingredient-ref-cauliflower` | The legacy file contains a candidate for the base cauliflower identity, not a leaf-part identity. It does not own the proposed `ingredient-ref-cauliflower-leaves`; preserve it as-is. |
| `ingredient-ref-broccoli-leaves` — `broccoli leaves / feuilles de brocoli` | Preserve the separately accepted leaves of ordinary broccoli (*B. oleracea* var. *italica*) and all R940 evidence on that row. The shared species does not make broccoli leaves and cauliflower leaves the same crop part. Do not copy its sources, measurements, or culinary comparison to this identity. |
| Cauliflower head, curd, florets, stalk, and other Brassica crop identities | Keep the source-distinguished crop parts separate. This proposal covers only cauliflower leaves and does not establish an alias, form, or substitution for these identities. |

The open Section K item is a broad leafy-green and brassica sweep. Its Broccolini trademark note is an alias exclusion, not a queued commercial-roster assignment. No brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only item was found in the reviewed Section K queue; no such line is being pursued here. Commercial-product counts do not add ingredient diversity. Existing branded entries and product-specific evidence remain untouched.

## Bundled recipe demand

All **114 manifest-listed recipe files** and **1,123 structured ingredient rows** were scanned for the English and French leaf phrases above, common singular/plural variants, `cauliflower greens`, and the taxon-qualified leaf phrase. The scan found **zero matching recipe files and zero matching ingredient rows**. No recipe link, relink, or quantity is proposed.

Espace pour la vie's published recipe and the University of Illinois Extension examples establish culinary use outside this bundle; they do not create bundled-library demand. Their recipe-specific wording and preparation details remain with their sources. [S01–S02]

## Proposed ledger state and evidence limits

For the proposed ingredient-reference ledger record, use:

- `identityState: verified`;
- `measurementState: not_yet_researched`;
- `substitutionResearchState: not_yet_researched`;
- sources S01–S02; do not duplicate or transfer parent-owned source S03;
- no measurement observations or substitution findings.

Espace pour la vie says “quelques feuilles” in one recipe and describes blanching them; this is recipe-specific and does not establish a general amount or timing. The Illinois Extension handout gives preparation ideas without a reusable quantity. No default density, unit mapping, package yield, form, conversion, recipe link, or active substitution is supported. These sources do not establish retail availability in Québec, nutritional thresholds, safe foraging instructions, or the edibility of leaves from other species or ornamental cultivars. The identity is for edible culinary cauliflower leaves from correctly identified food produce.

## Sources

Online sources were opened 2026-10-19. New source IDs below are proposal-local; none has been written to the shared ledger.

| Source ID | Source | Support and limits |
|---|---|---|
| `WP03-K-CAULIFLOWER-LEAVES-R958-20261019-S01` | Espace pour la vie (Ville de Montréal), [Cuisiner sans gaspiller, “Couscous estival de chou-fleur” (PDF)](https://espacepourlavie.ca/sites/espacepourlavie.ca/files/2024-07-sb-recette-fr_3_0.pdf), p. 4 | Identifies *Brassica oleracea* (Botrytis group) as `Chou-fleur, Cauliflower`, states that the leaves can also be eaten, and uses “quelques feuilles de chou-fleur blanchies” in a published recipe. Supports the Québec French plant-part wording and culinary identity; the recipe's vague amount, 3-minute blanch, and preparation remain source-specific. |
| `WP03-K-CAULIFLOWER-LEAVES-R958-20261019-S02` | University of Illinois Extension, [Food Rescue at Home, “Leafy Green Vegetable Cooking Ideas” (PDF)](https://extension.illinois.edu/sites/default/files/food_rescue_handouts.pdf), p. 3 | Lists cauliflower leaves among plant parts and suggests roasting them into chips or using them in soups and stews. Supports generic culinary use, not a specific cultivar, quantity, conversion, nutritional claim, or Québec-market claim. |
| Existing `WP03K-S17` (owner retained) | Office québécois de la langue française, [GDT: chou-fleur](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297070/chou-fleur), currently attached to `ingredient-ref-cauliflower` | Supports the preferred Québec base term, English `cauliflower`, and *Brassica oleracea* var. *botrytis*. Reuse only as a boundary reference; do not create a duplicate source entry or move its ownership. |

## Disposition

Recommend adding one identity-only `VEGETABLE_AND_AROMATIC` reference, `cauliflower leaves / feuilles de chou-fleur`, with empty alias arrays. Keep it distinct from the existing cauliflower curd/head and broccoli-leaf identities; preserve all existing rows and source ownership. No forms, generic measures, recipe links, conversions, yields, or active substitutions are proposed. Section K's broader leafy-green and brassica sweep remains open.
