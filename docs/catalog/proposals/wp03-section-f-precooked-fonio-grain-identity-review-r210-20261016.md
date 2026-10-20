# WP03 Section F — pre-cooked fonio grain identity review (R210, 2026-10-16)

## Review record

- **Status:** Proposal only. No shared catalog JSON, ledger, plan, roadmap, recipes, generated files, or tests changed.
- **Open checklist:** Section F still asks for review of regionally significant cereal mixes and preprocessed grains in the [active catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3643). This packet covers one preprocessed grain product: fonio sold as pre-cooked.
- **Recommendation:** Add one identity-only `GRAIN_AND_CEREAL` reference, `precooked fonio / fonio précuit`, as `ingredient-ref-precooked-fonio`. Keep it distinct from plain white/black fonio, fonio flour (including the separately held pre-cooked flour), roasted fonio, puffed fonio, and fonio flakes. Add no forms, reusable measurements, recipe links, conversions, yields, or substitutions. Keep the parent Section F item open.
- **Scope limit:** The proposed identity follows current product naming. Neither local product listing names the fonio species or supplies a full ingredient statement; this proposal assigns no Latin taxon or universal formula.

## Why this is a bounded product

Mako Foods Exotik's current English cereal collection lists **Precooked fonio (400 g)** and describes it as ready within minutes. Its Québec-facing French product page titles the item **Fonio précuit (400 g)** and describes the same product as a cereal. The site gives the Longueuil Public Market address. A second Canadian retailer lists **Fonio précuit de Guinée Conakry, 1 kg** and states that it ships throughout Canada. These current listings establish bilingual Québec naming and a repeated Canadian product class, rather than a phrase found only in a foreign research paper.

A CTA/GRET technical dossier describes a West African shelf-stable product called *fonio précuit séché*, made in its documented process by dehulling, steaming, and drying fonio. It confirms that pre-cooked fonio is a distinct processed-grain product in regional food processing. It does not establish that Mako or Distribution Samantan use that exact process, species, or formulation. Keep the catalog scope tied to the product name and do not encode a process sequence.

OQLF's existing entry pairs Québec French *fonio* with English *fonio* and *white fonio* for *Digitaria exilis*. The product sources do not identify their species. The proposal therefore uses the exact product-qualified phrases and makes no taxon claim or alias transfer to either existing species-qualified row.

The pre-cooked flour is a different candidate. The existing A6 review holds **Farine de Fonio Précuit / Pre-cooked Fonio Flour** apart from generic fonio flour because its process and relationship to that flour are not established. This grain proposal does not resolve or absorb that flour question.

## Proposed reference

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-precooked-fonio` |
| English display | `precooked fonio` |
| French display | `fonio précuit` |
| English aliases | `pre-cooked fonio` (the current English listing also uses this hyphenated spelling in its description) |
| French aliases | None |
| Category | `GRAIN_AND_CEREAL` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| Forms | None |
| Recipe links | None |

Do not add bare `fonio`, `fonio blanc`, `white fonio`, `fonio noir`, `black fonio`, `acha`, `fundi`, `findi`, `riz`, `rice`, `couscous`, or `quinoa` as aliases. Keep *fonio précuit* in the product's display, rather than assigning it as a cooked-state form on raw white fonio. The local seller markets it as a separate processed cereal; it is not a home-cooked state form of the raw grain.

## Current catalog, exact ownership, and picker projection

The current working tree contains **1,595 ingredient references**, **122 forms**, **61 legacy-import candidates**, and **1,940 research-ledger records**. Exact active fonio references are:

| ID | Current identity | Existing scope |
|---|---|---|
| `ingredient-ref-white-fonio` | `white fonio / fonio blanc`; EN aliases `fonio`, `acha`, `hungry rice`; FR aliases `fonio`, `acha`, `fundi`, `findi` | Whole white-fonio grain, currently no forms or numeric mappings. OQLF supports the white-fonio term family. |
| `ingredient-ref-black-fonio` | `black fonio / fonio noir`; EN alias `iburu` | Separate black-fonio grain identity. |
| `ingredient-ref-fonio-flour` | `fonio flour / farine de fonio`; EN alias `acha flour` | Flour product, separate from grain. |
| `ingredient-ref-black-fonio-flour` | `black fonio flour / farine de fonio noir` | Black-fonio flour identity. |

There is no fonio form. `ingredient-ref-precooked-fonio` is absent from active, legacy, and ledger IDs, and the normalized phrases `precooked fonio`, `pre-cooked fonio`, and `fonio précuit` have no active owner. The direct Mako product URL is already registered as `WP03-PUFF-FONIO-20261012-S06` on `candidate-fonio-flakes`; the French Mako cereal collection is already registered as `WP03-BF-IBURU-20261013-S02`; and OQLF's `WP03-S34` is already used for white fonio. Reuse those source IDs, not new duplicates. The exact new English Mako collection URL, Distribution Samantan URL, GRET document URL, and R210 source-ID prefix were not found in the ledger or proposal archive.

Static picker projection uses `IngredientSearch.kt`: case/accent/punctuation normalization, full word-phrase matching first, then substring matching. Adding only the proposed display and one English spelling alias would have these effects:

| Query | Current result | With proposal |
|---|---|---|
| `fonio` | Four rows: white fonio, black fonio, fonio flour, black fonio flour | Five rows, adding precooked fonio; each display remains qualified. |
| `precooked fonio` | No result | One result: `ingredient-ref-precooked-fonio`. |
| `pre-cooked fonio` | No result | One result through the source-attested English alias. |
| `fonio précuit` / `fonio precuit` | No result | One result; accents fold for the unaccented query. |
| `fonio flour` | Fonio flour and black fonio flour | Unchanged. |
| `pre-cooked fonio flour` / `farine de fonio précuit` | No active result | Still no result; the new grain name does not add `flour` / `farine` wording or resolve the held flour candidate. |

Broad `fonio` search adds one distinct, visibly process-qualified result. The proposal does not make bare `fonio` select the processed product or assign the plain-grain aliases to it. The Mako comparison with couscous, rice, and quinoa stays in product-description context; those are not catalog aliases.

## Recipe demand

I parsed all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. A search of the full serialized recipe files and ingredient rows found no `fonio` text and no occurrence of `precooked fonio`, `pre-cooked fonio`, or `fonio précuit`. There is no bundled recipe demand or recipe link for this candidate.

## Numeric and substitution boundaries

- Mako lists a 400 g retail package; Distribution Samantan lists its 1 kg product. These are SKU package sizes, not household measures, servings, or conversion factors.
- Neither current retailer listing provides a cup/spoon weight, an explicit reproducible cook time or dry-to-water ratio, or a complete ingredient/species declaration. Keep density null and unit mappings empty; add no active measurements or forms.
- The CTA/GRET dossier reports industrial processing yields and moisture targets for its documented method. Those facts are not a cooking yield or a kitchen conversion for the current Canadian products; do not carry them into the ledger as app values.
- Mako describes the product as an alternative to rice, couscous, and quinoa. This is marketing context without a tested quantity, dish, or method. Add no global or contextual substitution rule.
- Record measurement research as `researched_no_supported_value` and substitution research as `researched_no_supported_substitute` if root adds the proposed identity to the shared ledger. Keep any package observations source-qualified only.

## Source register

Sources checked online on 2026-10-16. Existing IDs are reused and should not be registered again.

| Source ID | Source and locator | Supports / does not support |
|---|---|---|
| `WP03-PRECOOKED-FONIO-GRAIN-R210-20261016-S01` | Mako Foods Exotik, [Cereals](https://www.makofoods.ca/en/collections/cereales), current English collection. | Lists `Precooked fonio (400 g)`, describes it as ready in minutes, and identifies the Longueuil Public Market contact address. The collection listing supplies the English display and hyphenated description spelling. It does not identify species, a full ingredient statement, exact process, household measures, or a substitution ratio. |
| `WP03-PRECOOKED-FONIO-GRAIN-R210-20261016-S02` | Distribution Samantan, [Épicerie africaine](https://distributionsamantan.com/collections/epicerie-africaine), current Canadian retail page. | Lists `Fonio précuit de Guinée Conakry 1kg` and says it ships across Canada. This corroborates Canadian retail use of the French product phrase, not an OQLF ruling, species, or a shared SKU formula. |
| `WP03-PRECOOKED-FONIO-GRAIN-R210-20261016-S03` | CTA–Gret–TPA, [Fonio précuit séché](https://www.doc-developpement-durable.org/file/Culture/Culture-plantes-alimentaires/FICHES_PLANTES/fonio/Fonio%20pr%C3%A9cuit%20s%C3%A9ch%C3%A9%20-%20Gret.pdf), technical dossier for African food-processing SMEs. | Defines a regional pre-cooked dried fonio product and documents one dehulling/steaming/drying process. This is process context, not the process specification for Mako or Samantan. Manufacturing yield and moisture details are not transferred to recipe quantities. |
| Reuse `WP03-PUFF-FONIO-20261012-S06` | Mako Foods Exotik, [Fonio précuit (400 g)](https://www.makofoods.ca/products/fonio-precuit), Québec-facing product page. | Current French display, cereal-product framing, 400 g package, and preparation-in-minutes description. Already registered on `candidate-fonio-flakes`; reuse its source ID. |
| Reuse `WP03-BF-IBURU-20261013-S02` | Mako Foods Exotik, [Céréales](https://www.makofoods.ca/collections/cereales), current French collection. | Current Québec-facing use of `Fonio précuit` and local seller context. Already registered on the black-fonio alias record; reuse its source ID. |
| Reuse `WP03-S34` | Office québécois de la langue française, [fonio blanc](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26529747/fonio-blanc). | Pairs Québec French `fonio` with English `fonio` / `white fonio` for *Digitaria exilis*. It supports the base term only, not the processed-product name or the species in the current retailer SKUs. |
| Reuse `WP02-A6-GRAIN-FLOUR-GAPS-20261010-S08` | Mako Foods Exotik, [Farine de Fonio Précuit (700 g)](https://www.makofoods.ca/products/farine-de-fonio-precuit-700-g?variant=45458303549626), existing flour boundary source. | Establishes a separately named pre-cooked fonio flour product. The earlier A6 decision holds its process relationship unresolved; it is not the whole-grain product proposed here. |

## Disposition

Recommend the narrow identity-only reference **`precooked fonio / fonio précuit`**, with only the source-attested hyphenated English spelling alias. Preserve the species, formula, preparation, and measurement unknowns in the ledger. Keep the pre-cooked flour and other fonio process candidates separate, add no forms or numeric/substitution behavior, and leave the wider Section F checklist open. This document is proposal-only; root handles any integration.
