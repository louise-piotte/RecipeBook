# WP03 Section F R168: Amaranth-grain Québec French display review

- **Reviewed:** 2026-10-16.
- **Recommendation:** **HOLD any display mutation; retain `amarante` with no catalog delta.** The Québec French term is directly supported by OQLF, and current Québec product wording confirms it is used for grain-form amaranth. Keep the independent human Québec-language review item open until a bilingual reviewer signs off; this source audit is not that human sign-off.
- **Scope:** Review only the French display of the existing edible-seed amaranth grain identity. Do not reopen the R106 `grains d'amarante` alias, change adjacent amaranth identities, or infer a specific species or product process.
- **Exact proposed delta:** None. Preserve `ingredient-ref-amaranth-grain.nameFr = "amarante"`, its current aliases, category, density, and mappings.

## Open checklist item and prior-review boundary

The active Section F checklist explicitly requests independent Québec French review of `amarante` as the display for the edible-seed cereal. R106 added the separate search alias `grains d'amarante` and deliberately left that display review open ([R106 proposal](wp03-section-f-amaranth-grain-quebec-search-alias-review-r106-20261014.md), [R106 integration record](../batches/wp03-section-f-amaranth-grain-search-alias-integration-20261014/README.md)). The Section F checklist and unresolved-gap list retain the review request ([plant-grains-cereals packet](../batches/plant-grains-cereals.md#L532)). The completed R165–R167 work concerns blue corn, sushi rice, and teff, respectively; this is a separate open item.

The prior amaranth wording review for WP02 covered quinoa-flour and sprouted-amaranth-flour displays, not the edible-seed cereal ([WP02 A6 wording review](wp02-a6-quinoa-amaranth-quebec-wording-review-20261011.md)). R106's French alias already covers the exact plural product phrase `grains d'amarante`. This proposal considers only whether the base French display should be replaced or qualified.

## Identity boundary and exact ownership

The active target is `ingredient-ref-amaranth-grain`, displayed as `amaranth / amarante`, category `GRAIN_AND_CEREAL`. Its current French alias is `grains d'amarante`; its English alias is `ramdana`. The identity remains edible amaranth seed used as a grain, without a universal species assignment.

Keep the neighboring records separate:

| Reference | Current display | Boundary |
|---|---|---|
| `ingredient-ref-amaranth-grain` | `amaranth / amarante` | Edible seed sold or used as grain; only target. |
| `ingredient-ref-amaranth-flour` | `amaranth flour / farine d'amarante` | Milled flour. |
| `ingredient-ref-amaranth-flakes` | `amaranth flakes / flocons d'amarante` | Flaked grain product. |
| `ingredient-ref-amaranth-greens` | `amaranth greens / feuilles d'amarante` | Leaves; category `VEGETABLE_AND_AROMATIC`. |
| `ingredient-ref-puffed-amaranth` | `puffed amaranth / amarante soufflée` | Expanded grain product. |
| `ingredient-ref-sprouted-amaranth-flour` | `sprouted amaranth flour / farine d'amarante germée` | Flour from sprouted amaranth. |

The live exact-key audit found `amarante` on the grain display and `grains d'amarante` on the same grain alias. `amarante en grains` and `amarante biologique en grains` have no exact normalized owner in active reference names or aliases, forms, or legacy-import candidates. No amaranth legacy candidate or amaranth form exists. The base word `amarante` also occurs within the names of related records; the picker exposes those distinct identities as choices rather than treating the shared word as a duplicate identity.

Do not introduce `amaranthe`: OQLF's separate `amaranthe` entry defines a red-brown powder used to colour food. Do not activate `kiwicha`: OQLF lists it in the English translation field as a term with some anglo-American use, while the active bilingual identity is the direct `amaranth / amarante` pair. Neither is part of this display review.

## Québec French and bilingual evidence

OQLF's GDT entry identifies `amarante` as the preferred feminine French term for the cereal, gives English `amaranth`, and defines the cereal as coming from edible seeds. Its note says the small seeds can be used whole or ground into flour. The entry is the strongest terminology evidence and supports retaining the concise existing display. A Québec manufacturer currently titles its grain product `Amarante biologique en grains`; this supports the product qualifier in retail copy but does not show that the unqualified OQLF display is incorrect. A Québec distributor's bilingual product heading pairs `Amarante bio` with `Organic amaranth`, and its ingredient statement says `Grains d'amarante biologiques`; this independently supports the French/English base pair and grain use. That page currently asks customers to be notified when the product returns, so it is used for wording only, not current availability.

The evidence does not justify changing the active display to a constructed compound such as `amarante en grains` or `amarante-grain`. Those phrases may be useful product wording, but the reviewed sources do not establish them as a superior Québec display or official replacement for OQLF's preferred term. The market examples also contain optional qualifiers such as `biologique`; those are package descriptors and should not become part of a generic ingredient identity.

## Exact data delta and picker projection

**No database JSON delta is proposed.** The reviewed fields of the live row are:

```json
{
  "id": "ingredient-ref-amaranth-grain",
  "nameFr": "amarante",
  "nameEn": "amaranth",
  "aliasesFr": ["grains d'amarante"],
  "aliasesEn": ["ramdana"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-14T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Projection below follows normalization and phrase-first matching in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Counts and result IDs were recomputed over the live references and forms on 2026-10-16.

| Query | Live projection | Display-review effect |
|---|---|---|
| `amarante` | 6 choices: amaranth grain, flour, flakes, greens, puffed amaranth, sprouted-amaranth flour | No change. Keep the broad family query visibly multi-choice. |
| `amaranth` | The same 6 related identities | No change. |
| `grains d'amarante` / `grains d’amarante` | `ingredient-ref-amaranth-grain` only | Existing R106 product phrase remains supported. |
| `amarante en grains` / `amarante biologique en grains` | 0 exact phrase results | This review does not add a new alias; the current canonical display remains OQLF's `amarante`. |
| `farine d'amarante` | `ingredient-ref-amaranth-flour` and `ingredient-ref-sprouted-amaranth-flour` | No change; flour stays separate. |
| `ramdana` | Grain and amaranth flour | No change; the regional bare query remains a two-choice result. |
| `amaranthe` / `kiwicha` | 0 | No change; neither term is activated. |

Changing only the display to a grain-qualified construction would change the French text shown for the target but would leave `amarante` as a broad six-choice query. The evidence provides no sufficient reason to make that UI-facing text change in the shared catalog. This recommendation leaves the picker projection untouched.

## Recipe demand, forms, numeric behavior, and substitutions

The current manifest lists **114 recipe files and 1,123 ingredient rows**. A scan of every manifest-listed recipe file and structured ingredient row for the target and adjacent reference IDs, `amaranth`, `amarante`, `grains d'amarante` (straight and curly apostrophes), `ramdana`, `kiwicha`, and `amaranthe` found **no matching recipe, row, or direct reference link**. The bundled corpus supplies no demand-based reason to change the display.

The target has no attached ingredient form, `defaultDensity` is `null`, and `unitMappings` is empty. The global and contextual substitution-rule files are both empty. The ledger records `measurementState: researched_no_supported_value` and `substitutionResearchState: not_yet_researched`. R106's Québec and Canadian retail pages provide differing product-specific cooking directions (one uses 1/3 cup grain to 1 cup water for 30 minutes; another uses 1 cup grain to 2 cups water for 20 minutes and reports an approximate cooked amount). These SKU-specific directions do not establish a shared dry measure, density, conversion, yield, or substitution. No form, numeric value, or substitution delta belongs in this display review.

## Source ID and URL collision audit

No new source record or source ID is proposed. Existing source IDs and URLs were checked in the live ledger (1,887 records, 8,066 source entries, 6,902 distinct source IDs, and 5,698 distinct URLs). Reopened sources already belong to the target or the same OQLF authority term; no duplicate ledger source registration is needed.

| Existing source ID | Exact URL and current ledger owner | Evidence used here |
|---|---|---|
| `WP03-S23` | [OQLF GDT: amarante](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503667/amarante); currently attached to the amaranth-grain, amaranth-greens, and puffed-amaranth records | Preferred French term, feminine gender, English `amaranth`, edible-seed cereal definition, and seed/flour distinction. Reopened 2026-10-16. |
| `WP03-S48` | [OQLF GDT: amaranthe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8884624/amaranthe); amaranth-grain record | Separate red-brown colouring-powder spelling; keeps it outside grain aliases. Reopened 2026-10-16. |
| `WP03-AMARANTH-GRAIN-QC-R106-20261014-S01` | [Moulin Abénakis: Amarante biologique en grains](https://moulinabenakis.com/products/amarante-grains-bio); amaranth-grain record | Current Québec manufacturer title and distributor address in Saint-Léonard. Reopened 2026-10-16; product identity and wording only. |
| `WP03-AMARANTH-GRAIN-QC-R106-20261014-S02` | [Le Monde au Naturel: Amarante bio 500 g](https://shop.mondenaturel.ca/products/amarant-bio-500g); amaranth-grain record | Bilingual header `Amarante bio / Organic amaranth` and French ingredient wording `Grains d’amarante biologiques`. Reopened 2026-10-16; stock is not relied on. |

The shared OQLF `amarante` URL is intentionally reused on related amaranth records under source ID `WP03-S23`; all such entries point to the same authority page, so this is a documented shared source, not a conflicting URL owner. The four source IDs above already exist and match their recorded URLs. Candidate R168 IDs were not allocated, and no source URL is proposed for addition.

## Disposition

Retain the current display `amarante` and all live ownership. Record this as **HOLD / no JSON delta** until an independent human Québec-language review completes the checklist requirement. The source-backed evidence favors the current display; the hold preserves the explicit human-review boundary rather than claiming that an automated source audit is that sign-off. Keep the R106 alias and all adjacent ingredient identities unchanged.

## Static audit scope

- Read the current Section F checklist, R106 proposal and integration README, live references, forms, legacy candidates, research ledger, manifest recipe list, and `IngredientSearch.kt`.
- Audited normalized exact ownership across active references, forms, and legacy candidates; reviewed all existing source IDs and URLs cited above.
- Recomputed current query projections and scanned all manifest recipes and ingredient rows.
- No app, unit, instrumentation, emulator, or build tests were run. This is proposal-only work and changes no catalog data.
