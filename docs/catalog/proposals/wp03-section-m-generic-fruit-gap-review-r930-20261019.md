# WP03 Section M: loquat identity review (R930)

- **Reviewed:** 2026-10-19
- **Disposition:** accept one identity-only generic `loquat / nèfle du Japon` reference for the edible fruit of *Eriobotrya japonica*.
- **Scope:** one distinct fruit identity, separate from the existing medlar / nèfle and plum / prune rows. No shared catalog, recipe, ledger, checklist, plan, roadmap, or workflow file is changed by this proposal.

## Recommendation

Add `ingredient-ref-loquat` in `FRUIT`:

| Field | Proposed value |
|---|---|
| English display | `loquat` |
| Québec French display | `nèfle du Japon` |
| English aliases | `Japanese medlar`, `loquats` |
| Québec French aliases | `bibace`, `bibasse`, `nèfles du Japon` |
| Category | `FRUIT` |

The OQLF entry places `nèfle du Japon` in the food/fruit domain, defines it as the fruit of *Eriobotrya japonica*, and lists `bibace`, `bibasse`, and `loquat` as preferred terms. Its English terms include `Japanese medlar` and `loquat`. University extension sources independently identify edible loquat fruit and describe culinary use. This supports a distinct species-bounded fruit identity; it does not support transferring any fruit measurements or cultivar claims. [S01–S03]

Keep the scope to the edible fruit of correctly identified *E. japonica*. OQLF describes the pips as nonedible, and NC State Extension identifies the fruit flesh as edible. Do not extend the identity to leaves, flowers, wood, ornamental plant material, medicinal preparations, or the inedible pips. Leave peel treatment and fresh/cooked preparation to a recipe; no separate form is justified. [S01–S02]

## Proposed data

```json
{
  "id": "ingredient-ref-loquat",
  "nameFr": "nèfle du Japon",
  "nameEn": "loquat",
  "aliasesFr": ["bibace", "bibasse", "nèfles du Japon"],
  "aliasesEn": ["Japanese medlar", "loquats"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "FRUIT"
}
```

Do not add `Japanese plum`, `Chinese medlar`, `Biwa`, `nispero`, or botanical names as aliases. `Japanese plum` is ambiguous with the existing plum identity and is also used in the umeboshi evidence to describe ume; `Chinese medlar`, `Biwa`, and `nispero` are unnecessary regional alternatives for this picker entry. Keep the user-facing terms concise and fruit-specific.

## Identity boundary and transferability

| Current or related identity/term | Treatment |
|---|---|
| `ingredient-ref-medlar` — `medlar / nèfle` | Preserve unchanged for the fruit called medlar in the existing Québec identity. OQLF maintains separate fruit entries for `nèfle` and `nèfle du Japon`; do not merge them or add loquat aliases to medlar. [S01, S04] |
| Proposed `ingredient-ref-loquat` | Scope to the edible fruit of *E. japonica*. The OQLF name and extension evidence apply to the species and fruit generally, not to a named cultivar or commercial product. |
| `ingredient-ref-plum` — `plum / prune` | Preserve unchanged. Do not use the OQLF-listed English alternative `Japanese plum` as a loquat alias because it could select the plum identity and is also used for ume in the existing Japanese-condiment source records. [S05] |
| Loquat fruit flesh, peel, and pips | Treat the fruit as one generic culinary identity. OQLF calls the pips nonedible; NC State Extension says the fruit flesh is edible. Sources do not establish one universal peel-preparation rule. Do not add a pip identity, peel form, or edible-yield rule. [S01–S02] |
| Jams, jellies, pies, syrups, marmalades, and other processed loquat products | These are culinary uses of the fruit, not aliases or forms of the generic fresh-fruit identity. No processed product identity or form is proposed. [S02] |
| Cultivar names and horticultural traits | Keep outside the generic identity. The University of Florida source lists cultivar examples and growing information; none is adopted as a catalog identity, form, measure, or alias. [S03] |

The scoped Section M assignment is one generic culinary fruit identity. It does not enumerate or add brands, product lines, flavours, SKUs, or retailer variants. The cross-category scope review found no open task devoted only to a commercial roster; any such commercial-only expansion remains out of scope because commercial-product counts do not add ingredient diversity. Preserve all existing branded entries and their evidence unchanged. [S06]

## Current ownership, exact keys, and picker projection

The current package snapshot contains 1,948 active ingredient references and 204 forms. The legacy list contains 55 candidates, and the research ledger contains 2,352 records. I checked active reference names and aliases, form labels and match terms, legacy candidate labels, ledger records and source text, prior Section M proposals, the current plan, and the recipe corpus.

There is no active owner for `ingredient-ref-loquat`, `loquat`, `loquats`, `nèfle du Japon`, `nèfles du Japon`, `bibace`, `bibasse`, or `Japanese medlar`. No loquat form or legacy candidate exists. The ledger contains no loquat identity or source record. Its only exact `Japanese plum` phrase hits are two Japanese-condiment records describing umeboshi; those are not loquat evidence and are one reason to exclude that alias. No R930 source-ID prefix is present in the ledger.

The active nearby identities are:

- `ingredient-ref-medlar`: `medlar / nèfle`, with no aliases.
- `ingredient-ref-sapodilla`: `sapodilla / sapotille`, with French alias `nèfle d’Amérique`.
- `ingredient-ref-plum`: `plum / prune`, with no aliases.

I checked the projection against `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` (lowercase, NFKD normalization, diacritic folding, punctuation-to-space, and whitespace collapse). The proposed qualified terms behave as follows:

| Query | Current owner | With proposal | Consequence |
|---|---|---|---|
| `loquat` / `loquats` | None | `ingredient-ref-loquat` | Selects the new fruit identity. |
| `nèfle du Japon` / `nèfles du Japon` | None | `ingredient-ref-loquat` | Full French part-qualified query selects the new identity. Accent-folded `nefle du Japon` resolves the same way. |
| `bibace` / `bibasse` | None | `ingredient-ref-loquat` | Source-listed Québec French terms select the same identity. |
| `Japanese medlar` | None | `ingredient-ref-loquat` | The source-qualified English phrase selects the new identity. |
| `medlar` | `ingredient-ref-medlar` | `ingredient-ref-medlar` and `ingredient-ref-loquat` | Expected broad search overlap from the `Japanese medlar` alias; each result keeps its full display name. |
| `nèfle` | `ingredient-ref-medlar`; `ingredient-ref-sapodilla` may match its `nèfle d’Amérique` alias | Those rows plus `ingredient-ref-loquat` | Broad query overlap is expected. Keep `nèfle` unassigned as a loquat alias and preserve the full qualified display. |
| `plum` / `prune` | `ingredient-ref-plum` | Unchanged | No `Japanese plum` alias is added, so the loquat does not enter that fruit query. |

This is a static picker consequence review, not a runtime picker test.

## Bundled recipe demand

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for `loquat`, `Japanese medlar`, `Japanese plum`, `nèfle du Japon`, `bibace`, `bibasse`, *Eriobotrya*, and related spelling variants. There are no matching ingredient rows, full-recipe mentions, or direct references. No recipe link or quantity is proposed. The corpus therefore supplies no recipe-specific measurement or preparation boundary for this fruit.

## Measurements, density, and substitution

Do not add a household measure, mass conversion, density, unit mapping, yield, form, conversion, or active substitution.

- OQLF describes roughly four nonedible pips. That is a source description of fruit structure, not an edible count or yield.
- NC State Extension gives a horticultural fruit dimension of 1–3 inches and describes edible flesh and possible culinary uses. The size range is not a household measure, weight, or serving size.
- UF/IFAS provides botanical and horticultural information, including cultivar examples. Its growing and cultivar facts are not transferable kitchen measurements or generic recipe properties.

If integrated, record generic measurement research as `measurementState: researched_no_supported_value`. No culinary substitution was researched, so retain `substitutionResearchState: not_yet_researched`; do not infer a swap from flavour comparisons or from the fruit's listed uses.

## Prior review and open-plan fit

The 2026-10-09 [Section M open-fruit follow-up](wp03-section-m-open-fruit-followup-20261009.md) already recognized that OQLF treats `nèfle du Japon` / loquat as distinct from `nèfle` / medlar. It did not recommend a loquat identity because that fruit was outside the named candidates in that packet; it explicitly kept loquat separate rather than merging the names. No later focused proposal or integration adds loquat. The current Section M plan parent remains open for further generic fruit and fruit-product identities and evidence boundaries. R930 advances that previously unassigned, source-backed fruit identity while preserving the earlier medlar boundary.

The selected gap is generic ingredient diversity. No commercial-only queue item was pursued. If one is encountered in another Section M pass, mark it out of scope because commercial-product counts do not add ingredient diversity, then stop that research line.

## Sources

Sources were accessed 2026-10-19. The source IDs below are local to this proposal and have not been added to the shared ledger.

| ID | Source | Support and limits |
|---|---|---|
| `WP03-SECTIONM-LOQUAT-R930-20261019-S01` | Office québécois de la langue française, [nèfle du Japon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083899/nefle-du-japon) | Places the entry in botanical and food/fruit domains; defines the fruit as *Eriobotrya japonica*; lists Québec French `nèfle du Japon`, `bibace`, `bibasse`, and English `loquat` / `Japanese medlar`; describes the pips as nonedible. The page was last updated in 1990; it supports terminology and identity, not a measure or current market claim. |
| `WP03-SECTIONM-LOQUAT-R930-20261019-S02` | North Carolina State University Extension Gardener Plant Toolbox, [Loquat — *Eriobotrya japonica*](https://plants.ces.ncsu.edu/plants/eriobotrya-japonica/common-name/loquat/) | Identifies the species and says the fruit flesh is edible raw or in specified cooked preparations. The source's horticultural dimensions, cultivar names, growing conditions, and seed-pit caution remain source-scoped; no recipe quantity or generic measure is taken from it. |
| `WP03-SECTIONM-LOQUAT-R930-20261019-S03` | University of Florida IFAS Extension, [*Eriobotrya japonica*: Loquat](https://ask.ifas.ufl.edu/publication/ST235) | Independently identifies the species and describes the fruit as edible. Its cultivar list, climate, dimensions, and horticultural recommendations are not used as ingredient taxonomy, measurements, or forms. |
| `WP03-SECTIONM-LOQUAT-R930-20261019-S04` | Office québécois de la langue française, [nèfle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410193/nefle), and current `ingredient-ref-medlar` ledger decision | The separate OQLF fruit entry maps `nèfle` to English `medlar`; the active catalog row already owns `medlar / nèfle`. This supports preserving the existing identity and not merging it with `nèfle du Japon`. The OQLF page does not itself establish a botanical name for the active row. |
| `WP03-SECTIONM-LOQUAT-R930-20261019-S05` | Japan Ministry of Agriculture, Forestry and Fisheries, [Pickled foods](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/tukemono.html), cited in existing Japanese-condiment ledger records | Describes umeboshi as salted and dried Japanese plum. This is contextual evidence of `Japanese plum` ambiguity; it does not support the loquat identity and is not transferred to it. |
| `WP03-SECTIONM-LOQUAT-R930-20261019-S06` | [Generic ingredient coverage scope review](../batches/generic-ingredient-scope-review-20261019/README.md) | Records the cross-category rule that commercial-product counts do not add ingredient diversity, that brand-only roster expansion is out of scope, and that existing branded rows and product-scoped facts must be preserved. |

## Disposition

Accept one identity-only `loquat / nèfle du Japon` reference for the edible fruit of *Eriobotrya japonica*, with only the source-listed qualified names and their regular plural forms. Preserve medlar, sapodilla, and plum identities and their aliases unchanged. Do not add commercial variants, forms, measures, densities, mappings, recipe links, conversions, yields, or active substitutions. Keep the pips out of the edible identity and do not generalize horticultural or cultivar-specific information.
