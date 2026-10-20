# WP03 Section J R1049 — parsley-root identity review

- **Review date:** 2026-10-19
- **Status:** proposal only; no shared catalog JSON, ledger, plan, roadmap, recipe, or generated file changed
- **Recommendation:** add one identity-only generic reference for parsley root (*Petroselinum crispum* root-grown forms), limited to the enlarged edible root.
- **Open-plan anchor:** Section J keeps broader regional root/tuber discovery and independent Québec terminology review open at [line 6557](../../RecipeBook-global-ingredient-catalog-plan.txt#L6557). This review covers one distinct identity only.
- **Scope:** root-grown parsley, not the whole parsley plant or its leaves. No brand, product-line, flavour, SKU, retailer-variant, or commercial-roster research was done.

## Identity and plant-part boundary

Recommend **parsley root / persil-racine** for the enlarged edible root of root-grown parsley, *Petroselinum crispum*. OQLF directly identifies the root vegetable and gives *P. crispum* var. *radicosum* and var. *tuberosum* as Latin terms; Wisconsin Extension describes var. *tuberosum* as Hamburg or turnip-rooted parsley grown for an enlarged edible root. This proposal follows those source terms without treating the root type as a separate species.

Keep the proposed reference root-only. Do not include the leaves, stems, flowers, seeds, ordinary leaf-parsley cultivars, dried parsley leaves, parsnip, or celeriac. OQLF and culinary sources compare parsley root with parsnip in appearance or use, but do not establish identity, alias equivalence, a general replacement, or a substitution ratio. Do not alias unqualified `parsley` or `persil`, which remain with the active herb reference.

OQLF supports the display names `parsley root / persil-racine` and the following qualified synonyms. No botanical name is proposed as a picker alias.

## Minimal proposed data

If accepted, add one reference row only:

| Field | Proposed value |
| --- | --- |
| `id` | `ingredient-ref-parsley-root` |
| `nameEn` | `parsley root` |
| `nameFr` | `persil-racine` |
| `aliasesEn` | `Hamburg parsley`, `turnip-rooted parsley`, `Hamburger parsley` |
| `aliasesFr` | `persil tubéreux`, `persil de Hambourg`, `persil à grosse racine`, `persil à grosses racines`, `persil bulbeux` |
| `category` | `VEGETABLE_AND_AROMATIC` |
| `defaultDensity` / `unitMappings` | `null` / `[]` |

Do not add aliases `parsley`, `persil`, `Petroselinum hortense`, or unqualified `root`. Add no form, recipe link, density, unit mapping, measurement, conversion, yield, or substitution. If accepted, measurement and substitution research remain `not_yet_researched`.

## Live ownership, evidence, and recipe-demand audit

Live files checked on 2026-10-19: **2,055 ingredient references, 205 forms, 55 legacy-import candidates, and 2,460 ledger records with 11,488 source entries and 9,648 distinct source IDs**. The bundled package contains **114 recipes and 1,123 ingredient rows**.

Exact and case-folded scans of active references, forms, legacy candidates, ledger records and source text, and recipe ingredients found no existing owner for `parsley root`, `root parsley`, `Hamburg parsley`, `turnip-rooted parsley`, `persil-racine`, or the root-form Latin names. The OQLF, Wisconsin Extension, and BZfE source URLs have no existing ledger source allocation. The legacy file has 55 candidates and no parsley-root or parsley candidate. No root-specific ingredient row appears in the bundled recipe corpus.

| Existing owner | Boundary and evidence to preserve |
| --- | --- |
| `ingredient-ref-parsley` — `parsley / persil`, category `HERB` | Keep unchanged. Its ledger record is currently unreviewed and has no sources or identity decision. This proposal does not narrow it to leaves or transfer the new root evidence to it. |
| `ingredient-ref-dried-parsley` — `dried parsley / persil séché`, category `HERB` | Keep unchanged. Its English alias `dried parsley leaves` remains with this owner. Its ledger record is unreviewed and has no sources or identity decision. Do not assume this dried-leaf reference covers dried root. |
| `ingredient-ref-parsnip` — `parsnip / panais` | Preserve the distinct root identity and its existing ledger evidence. Visual or culinary comparisons in the parsley-root sources do not make the two roots synonyms or interchangeable. |
| `ingredient-ref-celeriac` — `celeriac / céleri-rave` | Preserve the separate root-vegetable identity and aliases; no name or evidence transfers. |

The current bundled corpus has four parsley-related ingredient rows, all non-root: recipe 043 uses `2 tbsp dried parsley` linked to the dried-parsley reference; recipe 078 uses `2 tsp dried parsley` with the existing parsley reference and a dried preparation; recipe 087 uses `2 tbsp minced parsley` as an optional garnish; and recipe 111 lists parsley among optional fresh aromatics. None names root parsley, and none is relinked or used to infer a root measure. No recipe link is proposed.

## Measures, forms, and substitutions

No reviewed source or bundled recipe supports a household amount, count, mass or volume conversion, density, unit mapping, yield, or substitution for parsley root. BZfE describes source-specific culinary uses, including soups, salads, casseroles, and cooked root preparations, but gives no transferable recipe quantity. Its reported root length and diameter are morphological observations, not kitchen measures. Wisconsin Extension's note that roots retain flavour when dried does not establish a common dry form or preparation conversion. Keep forms and numeric fields empty, and leave measurement/substitution states `not_yet_researched`.

The sources' parsnip comparison supports a distinction check only. It does not authorize substituting parsnip, carrot, or celeriac for parsley root or transferring any root measurement among them.

## Queue and commercial scope

The selected Section J item is generic regional root/tuber discovery. No Section J roster-only assignment was found in this review. The previously dispositioned Section F commercial cereal rosters and Anson Mills wheat-meal product lead remain **out of scope** because commercial-product counts do not add ingredient diversity. No commercial line was researched or pursued. Preserve all existing branded rows and product-scoped evidence; none is used to support this identity.

## Evidence register

These source IDs are proposal-local; this proposal does not change or pre-allocate ledger records.

| Source ID | Source | Supported claim and limit |
| --- | --- | --- |
| `WP03-J-PARSLEY-ROOT-R1049-20261019-S01` | Office québécois de la langue française, [GDT: *persil-racine*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26504813/persil-racine), updated 2010; accessed 2026-10-19. `sourceKind: regional_authority`. | Directly supports the Québec French display `persil-racine`, English equivalent `parsley root`, root-vegetable classification, and qualified French/English terms in the proposed alias lists. Lists *Petroselinum crispum* var. *radicosum* and var. *tuberosum* among Latin terms. It gives no culinary measurement, form, or substitution. |
| `WP03-J-PARSLEY-ROOT-R1049-20261019-S02` | University of Wisconsin–Madison Extension, Susan Mahr, [*Parsley, Petroselinum crispum*](https://hort.extension.wisc.edu/articles/parsley-petroselinum-crispum/), revised August 2026; accessed 2026-10-19. `sourceKind: extension`. | Separates leaf-grown parsley varieties from var. *tuberosum* (Hamburg/turnip-rooted parsley), which is grown for its enlarged edible root; notes the root's culinary aroma and harvest season. The source does not support a root mass, household measure, conversion, or substitution. Its drying observation does not establish an activated form. |
| `WP03-J-PARSLEY-ROOT-R1049-20261019-S03` | Bundeszentrum für Ernährung (German Federal Center for Nutrition), Heike Kreutz, [*Kochen mit Wurzelpetersilie*](https://www.bzfe.de/presse/pressemeldungen-archiv/kochen-mit-wurzelpetersilie), status 2026-10-14; accessed 2026-10-19. `sourceKind: other`. | Identifies *Petroselinum crispum* var. *tuberosum* and describes root use raw or cooked in soups, stews, salads, casseroles, and cooked vegetable preparations. Its recipe and preparation details remain source-specific; its root dimensions are not kitchen measures. It supports no general replacement ratio. |

The evidence supports one narrow, Québec-named edible-root identity. Preserve the existing parsley herb and dried-parsley owners, avoid parsnip or celeriac aliasing, and add no forms or numeric behavior. This is proposal-only work; no tests were run.
