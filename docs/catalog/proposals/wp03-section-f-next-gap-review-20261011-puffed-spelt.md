# WP03 Section F: puffed-spelt identity review

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** proposal only. No shared catalog, ledger, recipe, plan, roadmap, test, or seed artifact was changed.
- **Scope:** one uncaptured candidate under the open Section F “remaining puffed-grain candidates” checklist item: food-use puffed spelt, its Québec French product wording, relationship to generic puffed wheat, recipe demand, and numeric/form evidence.
- **Recommendation:** accept one identity-only `GRAIN_AND_CEREAL` reference as `puffed spelt / épeautre soufflé`, with `spelt puffs` as its only proposed English alias and no French aliases. The French compound is attested in a Québec grocery ingredient listing; OQLF supports the base noun `épeautre` but does not standardize this compound. Add no forms, measurements, density, mappings, conversions, yields, recipe links, or substitutions.
- **Current package snapshot:** 895 active ingredient references, 48 forms, 114 manifest-listed recipes with 1,123 ingredient rows, 1,145 research-ledger records, and 77 legacy candidates.
- **Fingerprints:** manifest `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; references `bdbc64b60d828ee44fd3515ca4c37929e58c44fef4e0e8afd2231d17233be608`; forms `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e`; ledger `1add103daec0a0467dd4c5dcd74cd190a7d473c7289018af5b7c637c1c0293b4`; legacy candidates `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57`.

## Checklist scope and prior coverage

The active [Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1567) leaves “grits, polenta, pearled hominy, pozole corn, dried sweet corn, and remaining puffed-grain candidates” open. The same item records puffed wheat, quinoa, millet, and amaranth as integrated; later work also integrated puffed sorghum. Focused proposals cover puffed buckwheat and those other puffed products. A repository-wide phrase check found no prior `puffed spelt`, `spelt puffs`, or `épeautre soufflé` identity proposal. This review handles only puffed spelt; it does not repeat the separate species-level millet holds, including Sikiya/crab finger.

The active package has `ingredient-ref-puffed-wheat` (`puffed wheat / blé soufflé`), `ingredient-ref-puffed-millet`, `ingredient-ref-puffed-quinoa`, `ingredient-ref-puffed-rice`, `ingredient-ref-puffed-amaranth`, and `ingredient-ref-puffed-sorghum`. It also has `ingredient-ref-spelt-flour` (`spelt flour / farine d'épeautre`), but no plain spelt-grain reference. None of these rows names puffed spelt.

## Identity and naming disposition

OQLF's food-term entry pairs `épeautre` with English `spelt`; its botanical entry identifies spelt as a variety of wheat and gives *Triticum aestivum* ssp. *spelta*. A current manufacturer product is titled “Spelt Puffs” and lists organic hulled spelt as its only ingredient. Another cereal manufacturer describes puffed spelt made from spelt kernels. Together these sources support a named, food-use puffed-spelt product.

Spelt is a wheat type, so the new identity is a **species-qualified product within the broader wheat family**, not a claim that puffed spelt and every product called puffed wheat are disjoint. The active generic `puffed wheat / blé soufflé` row has no aliases and does not explicitly list spelt as included or excluded. Keep the names separate: the reviewed product labels identify spelt specifically, and no source establishes `puffed spelt` as an interchangeable synonym for the unqualified wheat-puff reference. Do not add either proposed display as an alias of the other. This is a semantic scope overlap, not an exact normalized-key collision.

| Candidate field or term | Proposed decision | Evidence boundary |
| --- | --- | --- |
| Stable ID | `ingredient-ref-puffed-spelt` | Unallocated in the current active references, forms, ledger, and legacy candidates. |
| English display | `puffed spelt` | Matches a current Canadian product listing and a cereal manufacturer's product name. Do not imply that every supplier uses the same cultivar, hull state, or expansion process. |
| Québec French display | `épeautre soufflé` | Exact phrase appears in a French Québec grocery ingredient listing, and OQLF prefers the base noun `épeautre`. The Québec retailer evidence is an ingredient declaration in a mixed muesli, not a standalone spelt-puff package or an OQLF ruling on the compound. |
| English alias | `spelt puffs` | Exact manufacturer product-title wording. Do not add singular `spelt puff` without a demonstrated need. |
| French aliases | None | Keep the locally attested product phrase as the display only. Accent-folded search already covers `épeautre souffle`; do not add mechanical alternatives such as `grains d'épeautre soufflés`. |
| `puffed wheat`, `wheat puffs`, `blé soufflé` | Keep on the existing generic puffed-wheat row; do not alias here | OQLF describes spelt as a variety of wheat, which creates a real broad-category relationship. The sources do not establish blanket synonymy between the named spelt product and the generic wheat product. |
| `farro`, `emmer`, `einkorn`, `petit épeautre`, `Kamut` | Do not add as aliases | OQLF uses `farro` for emmer (*Triticum dicoccum*); the current unqualified farro ledger candidate remains unresolved. Einkorn is distinct, and no reviewed puffed-spelt source equates it with spelt. `petit épeautre` is already part of the active einkorn-flour display; avoid the broader wheat-family terms. |
| Sweetened, coated, mixed, or feed products | Exclude from this plain ingredient identity | The product examples include plain one-ingredient puffs and separate multi-ingredient breakfast/snack products; Schapfenmühle also lists a puffed-spelt use in pet food. Keep honey/chocolate-coated snacks, muesli mixes, bars, crispbreads, and animal-feed-only products outside this row. |
| Category and numeric fields | `GRAIN_AND_CEREAL`; null `defaultDensity`; empty `unitMappings` | Matches the current processed-grain identity pattern. No general quantity evidence was found. |

The evidence supports the source-named food product but does not establish a standard for whole-grain claim, organic status, hull retention/removal, cultivar, or one universal puffing process. Do not carry those qualifiers into the canonical name or aliases.

## Live package, collision, and recipe audit

The audit read the current split seed package, all 1,145 ledger records and unit-conversion entries, all 77 legacy candidates, all 48 ingredient forms, and every manifest-listed recipe file. Candidate keys were checked with the repository's accent-, case-, punctuation-, and ligature-normalizing `normalize_search_key` function. Candidate terms included `puffed spelt`, `spelt puffs`, `spelt puff`, `puffed spelt wheat`, `épeautre soufflé` and its accent-folded form, `grains d'épeautre soufflés`, and `spelt souffle`.

| Search scope | Result |
| --- | --- |
| Exact normalized-key collisions against active reference names/aliases and form labels/match terms | 0 for the proposed display and alias. The existing `puffed wheat / blé soufflé` row is an adjacent broader product identity, not an exact collision. |
| Exact proposed ID or candidate identity in active references, forms, ledger, or legacy candidates | None. No current spelt-grain form or legacy candidate exists. |
| Candidate terms in manifest recipes | 0 of 114 recipe files; 0 of 1,123 ingredient rows. Broader `spelt`, `épeautre`, `farro`, `emmer`, `einkorn`, and generic puffed-wheat terms also returned no recipe files or ingredient rows. |
| Existing nearby rows | `ingredient-ref-puffed-wheat`, `ingredient-ref-spelt-flour`, `ingredient-ref-emmer-grain`, `ingredient-ref-emmer-flour`, and `ingredient-ref-einkorn-flour`; none has the proposed exact display or alias. |
| Existing numeric/form records | The nearby puffed-wheat and spelt-flour rows have null default density and empty unit mappings. No spelt/puffing form, package-yield entry, or ledger unit conversion was found. The package currently has one unrelated package-yield record and eight ledger unit conversions. |
| Active substitutions | The global and contextual substitution-rule arrays are empty. No puffed-spelt rule is present in the ledger. |

This is a snapshot and normalized-key audit, not a live picker-rank test or an exhaustive retail search. Because spelt is a variety of wheat, queries or future broad matching for `wheat` may still surface both generic wheat and specific spelt products. The exact qualified displays should remain distinct; do not broaden this candidate with `wheat puffs`, `blé soufflé`, or bare `épeautre` aliases.

## Forms, quantities, conversions, yields, and substitutions

- **Forms:** add no `IngredientForm`. Puffing defines the named processed product; it is not a dry/cooked state form of the active spelt-flour row, and the package has no active raw spelt-grain parent row to receive a form.
- **Measures and density:** add no serving mass, household volume, density, or unit mapping. Good Morning Cereals reports a 14 g serving and a 175 g net package for its own product; neither gives a volume/mass relation and neither transfers to other puffed spelt products. The Canadian Naturitas listing's 200 g is a package quantity, not a recipe measure.
- **Conversions and yields:** add no grain-to-puffing factor, raw-to-puffed conversion, mass-volume relation, cooking yield, or package yield. The manufacturers describe puffing but provide no general culinary input/output ratio.
- **Substitutions:** add no global or contextual rule. Shared breakfast or topping uses do not establish a replacement quantity or equivalence with puffed wheat, puffed millet, puffed quinoa, puffed rice, or puffed buckwheat.
- **Recipe links:** add none. The bundled corpus contains no candidate line and no spelt line.
- **Data not researched:** do not infer cultivar, hull status, nutrition defaults, moisture, shelf life, or a universal serving from the product examples.

## Proposal-local source register

Sources were opened or their indexed product listing was reviewed on 2026-10-11. IDs below are local to this proposal and were not added to the shared research ledger.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-PUFSPELT-20261011-S01` | Office québécois de la langue française, [épeautre — alimentation, céréale traitée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354126/epeautre), updated 2005. | Primary Québec terminology source: prefers masculine `épeautre` and pairs it with English `spelt` in the food-cereal domain. It establishes the base noun and grain identity, not the puffed compound. |
| `WP03-PUFSPELT-20261011-S02` | Office québécois de la langue française, [épeautre — botanique, poacée](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354125/epeautre), updated 2007. | Identifies spelt as a wheat variety, gives *Triticum aestivum* ssp. *spelta*, and pairs the term with English `spelt`. This supports the wheat-family overlap; it does not establish puffed-grain naming. |
| `WP03-PUFSPELT-20261011-S03` | Good Morning Cereals, manufacturer, [Spelt Puffs](https://www.goodmorningcereals.com/products/spelt-puffs/). | Current product page names `Spelt Puffs` and lists `Organic Hulled Spelt (100%)` as the ingredient. It reports 175 g net and a 14 g serving for that package; these are product-specific and supply no household-volume conversion. It is not Québec-market evidence. |
| `WP03-PUFSPELT-20261011-S04` | Good Morning Cereals, manufacturer, [Our process](https://www.goodmorningcereals.com/our-process/). | Describes its puffing process as heating whole grains in a pressure vessel and releasing pressure; the page says its plain puffed grains have no added ingredients and identifies spelt puffs as a product. This is one manufacturer's process description, not a universal method or yield. |
| `WP03-PUFSPELT-20261011-S05` | SchapfenMühle, manufacturer, [Puffed spelt](https://schapfenmuehle.de/en/commercial-customers/products/puffed-cereals/puffed-spelt). | Current product page describes puffed spelt made from spelt kernels using pressure and steam, with use in muesli and pet food. It supports a named processed grain product; the page does not give a retail ingredient declaration, Québec label, or recipe conversion. |
| `WP03-PUFSPELT-20261011-S06` | Limagrain Ingredients, [Presco puffed grains for culinary products](https://blog.limagrain-ingredients.com/fr/grains-souffles-presco-culinaire), published 2024-07-10. | Manufacturer's food-ingredient page lists spelt among puffed grain varieties used in culinary applications such as salads and plant patties. It is industrial ingredient context, not Québec retail naming or a household measure. |
| `WP03-PUFSPELT-20261011-S07` | Naturitas Canada, retailer, [Organic puffed spelt, 200 g](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/mueslis-and-breakfast-cereals/organic-puffed-spelt-200-g-naturitas-essentials). | The Canada storefront listing names a 200 g `Organic puffed spelt` product and shows `Spelt wheat` as the ingredient. Its indexed page was crawled about four months before this review and direct retrieval returned a cache miss. It supports a Canadian-market listing, not live inventory or Québec delivery. |
| `WP03-PUFSPELT-20261011-S08` | Metro Québec, [Dorset Cereals Muesli au chocolat noir](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante/muesli-au-chocolat-noir/p/814930010646), product 814930010646. | The indexed French listing displays the ingredient `ÉPEAUTRE SOUFFLÉ* (BLÉ)` in a Québec grocery product. This is exact local ingredient wording, but only within a mixed muesli; the listing said the product was out of stock, and the page returned 403 on direct retrieval during this review. It does not establish a standalone puffed-spelt package or OQLF preference. |
| `WP03-PUFSPELT-20261011-S09` | Office québécois de la langue française, [amidonnier](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier), updated 2019. | Pairs `amidonnier` / `emmer` with *Triticum dicoccum* and also lists `farro` as a term for that cereal. Supports keeping the distinct spelt product away from an unqualified `farro` alias; the separate live farro ledger candidate remains unresolved. |

## Review disposition

**Accept `ingredient-ref-puffed-spelt` for identity-only integration review** as `puffed spelt / épeautre soufflé`, with only `spelt puffs` as an English alias and no French aliases. Keep it as a species-qualified product beside, not an alias of, generic `puffed wheat / blé soufflé`; preserve the documented wheat-family overlap and the difference between exact names and broad search intent. The Québec compound is attested at ingredient-list level only, while OQLF supports the base noun. Do not add forms, recipe links, measurements, density, mappings, conversions, yields, or substitutions. Keep organic, cultivar, hull, process, and sweetening/coating qualifiers source-specific.
