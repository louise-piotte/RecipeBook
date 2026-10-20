# WP03 Section K generic edible-flower diversity review — calendula petals — R876

**Status:** Proposal only. No shared catalog, ledger, plan, workflow, roadmap, code, or other file was changed.

**Reviewed:** 2026-10-19

**Plan anchor:** The open [documented edible-flower checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6608). Keep the broader Section K checklist open and do not add a generic `edible flowers` identity.

## Recommendation

Add one identity-only reference for **calendula petals / pétales de calendula**, scoped to the edible petals of correctly identified, food-grown *Calendula officinalis*. Québec’s OQLF identifies the plant with the French terms `calendula` and `souci officinal`, the English terms `calendula` and `pot marigold`, and the Latin name *C. officinalis*; it describes the flowers as edible and used in cooking. UQAC’s Québec edible-flower guide specifically says to use the petals fresh or dried in salads and tisanes. University extension sources independently confirm culinary petal use.

This is a generic culinary plant-part identity, not a branded or retailer-specific product. Keep the identity distinct from rose petals, culinary lavender, nasturtium flowers, squash blossoms, roselle calyces, borage flowers, and chive blossoms. Do not include other *Calendula* species, the leaves or other plant parts, cosmetic or medicinal preparations, or flowers sold for ornamental use. The name `marigold` alone is deliberately excluded because it can refer to *Tagetes* species; the University of Wisconsin Extension distinguishes those “true marigolds” from *Calendula officinalis*.

## Exact proposed data

```json
{
  "id": "ingredient-ref-calendula-petals",
  "nameEn": "calendula petals",
  "nameFr": "pétales de calendula",
  "aliasesEn": [],
  "aliasesFr": ["pétales de souci officinal"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

If accepted, add an `ingredient_reference` ledger record with `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Record no measurement observations or substitution findings. Add no forms, recipe links, density, unit mappings, conversions, yields, or substitutions. Source examples of fresh or dried use remain culinary context; they do not establish an active form or a transferable measure.

## Naming and identity boundary

| Term | Treatment | Evidence and limit |
|---|---|---|
| `calendula petals` | English display | The OQLF accepts `calendula` as an English term for *C. officinalis*; University of Minnesota Extension uses the exact phrase `calendula petals` for edible culinary use. |
| `pétales de calendula` | Québec French display | The OQLF lists `calendula` as a preferred French term; UQAC identifies the plant as `Souci, Calendula officinalis` and documents use of its petals. |
| `pétales de souci officinal` | French alias | Part-qualified wording built from the OQLF preferred plant term `souci officinal`; avoids assigning the bare plant name as a petal identity. |
| `pot marigold`, `English marigold`, `Scotch marigold`, `marigold` | Do not add as aliases | OQLF records some as English plant names, but the unqualified `marigold` family wording can collide with *Tagetes*. Keep the picker terms plant-part-qualified and species-specific. |
| *Calendula officinalis* | Taxonomic scope only | Supported by OQLF, UQAC, and extension sources. Do not expose the botanical name as a picker alias or generalize to the genus. |
| Leaves, whole plant, extracts, creams, oils, and medicinal preparations | Excluded | UQAC separately mentions young edible leaves; this proposal covers petals only. Cosmetic and medicinal uses are not generic culinary ingredient identities. |

No species-specific measurement, household measure, density, yield, or generally safe substitution was found. Fresh and dried petals are both documented uses, but this identity-only proposal does not define forms or imply that their quantities are interchangeable.

## Proposed research sources

The source IDs below are proposal-local and were checked against the current ledger and archive. They are not assigned in the shared ledger.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP03-K-CALENDULA-PETALS-R876-20261019-S01` | Office québécois de la langue française, [GDT: *calendula*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8395813/calendula), updated 2024; accessed 2026-10-19. | Gives preferred French terms `calendula`, `calendule`, `souci officinal`, `souci des jardins`, and `souci`; English translations include `calendula` and `pot marigold`; identifies *Calendula officinalis* and describes cultivated edible flowers used in cuisine. It establishes plant naming and edible flower use, not a household measure or part-specific preparation rule. `sourceKind: regional_authority`. |
| `WP03-K-CALENDULA-PETALS-R876-20261019-S02` | Université du Québec à Chicoutimi, [Souci, *Calendula officinalis*](https://www.uqac.ca/foretnourriciere/les-fleurs-comestibles/souci/); accessed 2026-10-19. | Québec edible-flower entry identifies the species and says petals are consumed fresh or dried in salads and tisanes. Its June–October harvest period is local horticultural context, not a kitchen measure, retail-availability claim, or form conversion. The page separately notes young leaves; those are outside this petal identity. `sourceKind: other`. |
| `WP03-K-CALENDULA-PETALS-R876-20261019-S03` | University of Minnesota Extension, [Edible flowers and late-summer herbs](https://extension.umn.edu/about/our-stories/news/yard-and-garden-news/edible-flowers-and-late-summer-herbs), 2025-08-05; accessed 2026-10-19. | Identifies *C. officinalis* and describes petals in salads, oil or vinegar infusions, and dried as a food dye. These are generic culinary uses, not proportions, product specifications, or reusable measures. `sourceKind: extension`. |
| `WP03-K-CALENDULA-PETALS-R876-20261019-S04` | University of Wisconsin–Madison Extension, [Calendula, *Calendula officinalis*](https://hort.extension.wisc.edu/articles/calendula-calendula-officinalis/), revised 2025-08-07; accessed 2026-10-19. | Says the flowers or petals are used in cooking and describes fresh petals as garnish, seasoning, or a traditional yellow cheese colorant. It explicitly distinguishes pot marigold/*C. officinalis* from “true marigolds” in *Tagetes*. It also lists cultivar names, which are not proposed as catalog identities. `sourceKind: extension`. |
| `WP03-K-CALENDULA-PETALS-R876-20261019-S05` | University of Florida IFAS Extension, [Edible Flowers](https://gardeningsolutions.ifas.ufl.edu/plants/ornamentals/edible-flowers/); accessed 2026-10-19. | Lists calendula/*C. officinalis* petals as culinary and gives general edible-flower handling guidance: confirm the species and edible part, use petals, and avoid pesticide-treated or roadside flowers. The same page URL is already cited under other flower records (`WP03-FLOWERS-IDENTITIES-20261011-S06` and `WP03-FLOWERS-IDENTITIES-20261011-S10`); this proposal-local ID is separately scoped to calendula petals and handling. It does not create a generic edible-flower identity or a foraging guarantee. `sourceKind: extension`. |

No manufacturer, product, brand, SKU, or retailer source was used. No product-specific measurement or claim is transferred to the generic ingredient.

## Ownership, picker, recipe, and queue checks

The audit snapshot was taken on 2026-10-19:

| File or corpus | Count | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 1,905 references | `119d604c1c7a42b7e2d81200393c1e713d6a93749958d14cb4828f29055a7a49` |
| `ingredient-forms.v1.json` | 201 forms | `5784488eba2effc1e99e29e4ab3f3143256a25c6cb327344099e045c1b85cf0e` |
| `legacy-import-identities.v1.json` | 56 candidates | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,312 records / 10,904 source entries / 9,158 unique source IDs | `995d5d5a84b5668b8c661cada73469ea9f8dc29f8950435ba139b8d3471f6b30` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `9527e9e177132e6385e7d3756b5cc996bb1f12b8938d2863d66afdd54782b486` |

The recipe digest is SHA-256 over each manifest-relative recipe path, a NUL byte, that file's SHA-256 hex digest, and a newline, concatenated in manifest order. Case-insensitive searches across active references, forms and form match terms, legacy candidates, the ledger, prior proposals and batches, and the plan found no owner for `calendula petals`, `pétales de calendula`, `pétales de souci officinal`, *Calendula officinalis*, `ingredient-ref-calendula-petals`, the proposed R876 source-ID block, or any of the four botanical evidence URLs. The UF/IFAS general edible-flower page is the one exception to new-URL ownership: its existing source IDs and owners are documented above; no old source ID is reused or edited.

The manifest-listed recipe scan searched complete recipe JSON text and structured ingredient rows for the candidate terms. It found zero matching recipes and zero matching ingredient rows. This is an absence in the current bundle, not evidence that the ingredient lacks culinary use or local availability. No recipe link is proposed.

Picker projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete phrase matches are preferred, with substring matching as a fallback. This is a static projection, not live picker QA.

| Query | Current results | With proposal | Consequence |
|---|---|---|---|
| `calendula`, `calendula petals`, `pétales de calendula`, `souci officinal` | None | `ingredient-ref-calendula-petals` only | Exact plant and petal-qualified terms resolve to one candidate. |
| `pétales de souci officinal` | None | `ingredient-ref-calendula-petals` only | The OQLF-backed French plant name stays qualified by edible part. |
| `petals` / `pétales` | `ingredient-ref-rose-petals` | Rose petals plus calendula petals | The broad petal query gains one visibly named flower ingredient. |
| `marigold` | None | None | Avoids redirecting an unqualified query that may mean *Tagetes*. |
| `flowers` / `fleurs` | Six existing named flower or calyx identities | Unchanged | The proposal uses petal-specific names and does not create a generic edible-flower match. |

The current scope review found no open task solely for expanding a brand, product-line, flavour, or retailer roster. The Section K `Broccolini` mention remains an existing trademark/alias exclusion rather than a queued task; it stays out of scope because commercial-product counts do not add ingredient diversity. This proposal does not research or expand it. Existing branded references and product-specific measurements remain untouched. Manufacturer evidence may support a generic ingredient only when its claim applies beyond a named product; no such product evidence was needed here. See the [generic ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md).

## Remaining review points

- The proposed Québec French display uses the OQLF-backed term `calendula`; `pétales de souci officinal` remains a part-qualified synonym. If an independent Québec review adjusts the wording, retain the *C. officinalis* and petal boundary.
- The sources document several culinary uses but do not support recipe amounts, density, unit mappings, preparation yields, or generally safe substitutes. Measurement and substitution research remain open.
- Use only correctly identified, food-grown petals. Follow the edible-flower sourcing caution in the cited extension guidance; do not imply that ornamental, florist, roadside, or chemically treated flowers are food. This identity is not a foraging-identification guarantee.
- The broader Section K review of documented edible flowers remains open. Do not generalize calendula evidence to every flower or *Calendula* species.

No software tests, build, emulator run, or deployment were performed because this task changes only a proposal document.
