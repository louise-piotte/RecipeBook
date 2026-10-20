# WP03 Section F: teff-flakes identity and Québec naming review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Product identity is supported; active bilingual catalog integration is held pending a Québec French product-name source.
- **Scope:** Plain, single-grain teff flakes as one remaining item in Section F's open regional cereal and preprocessed-grain coverage ([plan, line 1952](../../RecipeBook-global-ingredient-catalog-plan.txt#L2045)).
- **Recommendation:** Keep a ledger-only `candidate-teff-flakes` record in `needs_clarification`. Do not allocate an active reference ID, French alias, ingredient form, measure, recipe link, or substitution. Reopen the active row when a Québec product source or authoritative Québec terminology source attests a French name for plain teff flakes.

## Why this is a distinct remaining item

The open Section F checklist continues to cover regional cereal mixes and preprocessed grains. Recent reviews and integrations already address Dalia, poha/chivda, cream-of-rice cereal, wheat/millet/triticale/Khorasan/barley/rye/quinoa/buckwheat flakes, bran flakes, and shredded wheat cereal. The dedicated [puffed-teff review](wp03-section-f-puffed-teff-boundary-review-20261011.md) says flakes remain a separate product, but does not decide their identity or French display. This review covers only plain teff flakes.

Other held Section F work remains out of scope: idli rava, unqualified farro, generic sushi rice, pearled hominy, pozole corn, ordinary grits/polenta, dried sweet corn, and remaining puffed-grain candidates. The [Dalia boundary review](wp03-section-f-regional-cereal-mixes-residual-gap-sweep-20261012.md) and its integration record address Dalia aliases and its product-specific serving; neither covers flakes.

## Product identity and boundary

Manufacturers identify plain teff flakes as a food ingredient made from teff grain. Blonk describes cooked, rolled, dried flakes made from a blend of brown and white teff; Enrich Agro-Industry describes a 100% teff product that is cooked, rolled, and toasted. These details establish the product class, but the process and grain blend remain source-specific.

| Candidate | Review disposition | Boundary |
|---|---|---|
| Plain human-food teff flakes | Product identity confirmed; catalog row held for Québec French naming. | A flake-format ingredient made only from teff; white/brown teff grain blends remain within this source-bounded class. If accepted later, use `GRAIN_AND_CEREAL` as a separate product identity, following the existing grain-flake pattern. |
| `teff flakes` | English product name is supported by manufacturers and a current Canadian storefront listing. | Keep the full product phrase. Do not alias bare `teff`, `teff grain`, or `teff cereal`. |
| `flocons de teff` | Exact French product wording appears in current European manufacturer/distributor and retail sources, but no reviewed Québec source labels teff flakes this way. | Keep as evidence only; do not make it the `fr-CA` display yet. |
| `tef` / `flocons de tef` | Do not use as the product display or alias. | OQLF marks `tef` “Non courant” while calling its spelling recommended; current Canadian and Québec product sources use `teff`. The base-word spelling does not establish a Québec compound for flakes. |
| Teff grain and teff flour | Existing, separate active identities. | Keep flakes distinct from `ingredient-ref-teff-grain` (`teff` / `teff d'Abyssinie`) and `ingredient-ref-teff-flour` (`teff flour` / `farine de teff`). Do not reinterpret the flake product as a form of either reference. |
| Puffed teff, flour-based crisps/extrudates, rings, crunches, bars, and composite cereals | Excluded from this candidate. | The existing puffed-teff review keeps puffed kernels separate. Enrich distinguishes flakes from its extruded Teff Rings and Teff Crunches; mixed-grain cereal formulas and bars are formulated products. |

No aliases are recommended. Terms such as `rolled teff`, `flaked teff`, `teff cereal`, singular variants, color-specific variants, and constructed French variants were not established as Québec names for this generic product.

## Québec naming disposition

OQLF's current GDT entry defines the cereal as `tef`, lists English `teff`, and marks the French spelling “Non courant” and “Orthographe recommandée.” The CFIA's French crop list uses `Teff d'Abyssinie`; it names the crop, not flakes. A current Québec-market page for Vallée des Prairies uses `Farine de teff bio` and lists `Teff` as the ingredient. These sources support the local base-word spelling `teff` and distinguish grain/flour, but none labels a flake product.

The exact compound `flocons de teff` is attested by the 2026 Cylteff exhibitor entry and current French-language product listings outside Québec. That is useful terminology evidence, not Québec product usage. Keep it out of the active `fr-CA` display until a Québec manufacturer, distributor, retailer, or authoritative Québec terminology source names the plain flake product. This hold follows the naming boundary recorded for puffed teff; it does not question whether teff flakes exist.

## Live ownership and collision audit

The snapshot used the live ingredient references, forms, legacy-candidate file, and research ledger. Exact normalized phrase checks used the repository's `normalize_search_key` behavior against every string field in those files.

| Artifact | Snapshot and result |
|---|---|
| Active ingredient references | 1,235 entries; SHA-256 `fe44e14adc8b1ad613dd84e15a36a6c381f96ecded39a777fae1279bfc674abd`. No exact teff-flake candidate phrase or proposed active ID is owned. The only adjacent teff rows are `ingredient-ref-teff-grain` and `ingredient-ref-teff-flour`; both have empty aliases, null `defaultDensity`, and empty `unitMappings`. |
| Active forms | 86 entries; SHA-256 `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978`. No teff-flake label or match term is present. |
| Legacy import identities | 66 candidates; SHA-256 `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f`. No exact candidate phrase or ID is present. |
| Research ledger | 1,534 records, 5,294 source entries, 4,336 distinct source IDs; SHA-256 `baffa3f9442bacf3807d44676fd051956e827e75c97518f7007312a8ee2e58eb`. No exact flake identity, form, or conversion record is present. The separate `candidate-puffed-teff` record is `needs_clarification` and remains untouched. |
| Proposed identifiers | `candidate-teff-flakes` and `ingredient-ref-teff-flakes` are absent from active references, forms, legacy candidates, and ledger records. |

The exact candidate phrases checked across references, forms, legacy candidates, and all ledger strings were: `teff flakes`, `teff flake`, `flaked teff`, `rolled teff`, `roll-dried teff flakes`, `teff cereal flakes`, `teff hot cereal`, `teff flakes cereal`, `brown teff flakes`, `white teff flakes`, `instant teff flakes`, `teff cereal`, `flocons de teff`, `flocon de teff`, `flocons de tef`, `flocon de tef`, `tef en flocons`, `teff en flocons`, `flocons de teff d'Abyssinie`, `flocons de tef d'Abyssinie`, `céréales de teff`, `cereal de teff`, and `céréale de teff`. There were zero exact owners for these phrases. A broad query for `teff` can still match the two existing grain and flour identities; do not add bare `teff` as an alias on the candidate.

## Complete manifest recipe-demand audit

The manifest lists 114 recipe files. All were parsed, and every ingredient row's `originalText`, `ingredientName`, quantity, and unit fields were checked against the candidate phrase set above. The audit found 1,123 ingredient rows and zero candidate-phrase hits. A broad search also found zero `teff` occurrences in the manifest-listed recipe JSON text. No recipe demand, link, state-form relation, or amount assignment is supported.

| Recipe corpus measure | Snapshot |
|---|---|
| Manifest | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Recipe files / ingredient rows | 114 files / 1,123 ingredient rows |
| Recipe-file bytes | 752,993 |
| Manifest-ordered corpus fingerprint | `2616c2aab8a48dd240bd4353ac208d06c8fc344541adc4b6a1e0ea4c42a93b27` (hashes each manifest-relative path, a NUL byte, exact file bytes, and a trailing NUL byte in manifest order) |

## Measurement, density, forms, and substitution evidence

- **Package quantities:** Blonk gives a 12 kg bag; Enrich lists a 375 g retail pack and 12-pack cartons; Naturitas Canada lists one 500 g item; Tibiona lists one 250 g item. These are package sizes for specific SKUs, not serving sizes or household measures. Do not derive a cup weight, density, unit mapping, or package yield from them.
- **Density and volume mappings:** None of the checked teff-flake sources gives a generic volume-to-mass relationship. Recommend null default density and empty unit mappings if a future identity is accepted.
- **Cooking or process yield:** Blonk's cook/roll/dry description and Enrich's cook/roll/toast description give no quantitative input/output ratio. The Québec-Amérique guide's 3 volumes of liquid per 1 volume of teff is specifically for cooking whole teff grains into porridge; do not transfer it to flakes.
- **Ingredient forms:** If accepted, represent teff flakes as a separate processed-grain reference rather than a `flaked` form under the active whole-grain identity. No form or grain-to-flake conversion is supported.
- **Substitution:** Blonk says its flakes can replace breadcrumbs and other cereals in meat products, but gives no replacement amount or sufficiently bounded product/recipe context. Keep this as a source-specific application claim only; do not create a global or contextual substitution rule. No interchangeability with oats or other single-grain flakes is established.
- **Nutrition and readiness:** Do not transfer supplier nutrition, water-binding, gluten, storage, or ready-to-eat claims to a generic catalog row. The sources describe different products and processing details.

## Source register and ledger-ID audit

New proposal-local source IDs below were checked against the live ledger snapshot above; none is already allocated. Reused source evidence is called out with its existing ledger ID rather than assigned a duplicate ID.

| Source ID | Source | What it supports and what it does not support |
|---|---|---|
| `WP03-TEFF-FLAKES-20261012-S01` | Blonk Quality Ingredients, [Teff](https://blonkingredients.com/our-products/teff/), manufacturer page; accessed 2026-10-12. | Directly describes flakes made by cooking, rolling, and drying teff; a blend of brown and white teff; culinary applications; 12 kg bags; and a possible breadcrumb/cereal replacement use. Supports the product identity and bounded manufacturer claim, not a Québec display, household measure, or general substitution. |
| `WP03-TEFF-FLAKES-20261012-S02` | Enrich Agro-Industry, [Teff-based breakfast cereals](https://enrichagroindustry.com/teff-based-breakfast-cereals/), manufacturer page; accessed 2026-10-12. | Calls a 100% teff product `Teff Flakes`, made by cooking, rolling, and toasting. Gives 375 g retail packaging and distinguishes extruded Teff Rings/Crunches. Pack details are not a serving or conversion. |
| `WP03-TEFF-FLAKES-20261012-S03` | Cylteff, [SIAL Paris 2026 exhibitor entry](https://www.sialparis.com/fr-FR/exposants-2026/Marque/Cylteff-CYLTEFF), producer listing updated 2026-09-17. | Lists `Flocons de Teff, séché sur rouleau` and says Cylteff grows and processes teff in Spain. Supports French product wording from a producer; it is not a Québec label. |
| `WP03-TEFF-FLAKES-20261012-S04` | Naturitas Canada, [Salutef Teff flakes, 500 g](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/teff-flakes-500-g-salutef), Canadian storefront; accessed 2026-10-12. | Lists `Teff flakes`, 500 g, ingredients `Teff flakes`, and use as cereal. The listing showed stock but said it could not confirm delivery date. It does not establish Québec availability or French naming. |
| `WP03-TEFF-FLAKES-20261012-S05` | Tibiona, [Flocons de teff bio 250 g](https://tibiona.eu/fr/flocons-de-teff-bio-250-g.html), French-language product listing for La Finestra sul Cielo; accessed 2026-10-12. | Uses the exact French title `Flocons de teff`, names teff as the ingredient, and lists a 250 g package. The page showed the SKU out of stock; it supports French-market wording, not Québec use or a measure. |
| `WP03-TEFF-FLAKES-20261012-S06` | Québec-Amérique, [Millet, teff et sorgho](https://www.quebec-amerique.com/index.php?controller=attachment&id_attachment=41), French culinary guide, section “Teff”; accessed 2026-10-12. | Describes teff grain and flour; its 3:1 liquid-to-teff gruel direction explicitly concerns whole grains. It supplies local culinary context and a useful exclusion for cooking ratios, but does not mention teff flakes. |
| Existing `WP02-S90` / `WP03-S76` | OQLF, [tef (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef); and CFIA, [Liste de grains et grandes cultures](https://inspection.canada.ca/fr/protection-vegetaux/grains-grandes-cultures/liste-grains-grandes-cultures). | Already in the live ledger for the teff grain/flour work. OQLF marks `tef` non-current and recommended; CFIA uses `Teff d'Abyssinie` for the crop. Neither names flakes. The puffed-teff ledger also records these pages as `WP03-PTEFF-20261011-S05` and `WP03-PTEFF-20261011-S06`; no duplicate source records are proposed. |
| Existing `WP02-S92` | La Chèvre et le Chou / Vallée des Prairies, [Farine de teff bio](https://lachevreetlechou.ca/produits/farine-de-teff-bio), Québec product listing. | Already in the live ledger for teff flour. The Québec title and ingredient list use `teff`, but the product is flour, not flakes; it does not establish the flake compound. |

## Recommended integration delta

1. Add only a ledger-level `candidate-teff-flakes` record if the evidence packet is accepted, with `identityState: needs_clarification`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: blocked_pending_evidence`. Preserve the source-specific breadcrumb/cereal application note without activating a rule.
2. Keep `ingredient-ref-teff-flakes` unallocated until a Québec French product source or authoritative Québec term supports the compound. If a Québec name is confirmed, consider an identity-only `GRAIN_AND_CEREAL` reference with no aliases, forms, density, unit mappings, recipe links, or substitutions.
3. Leave the existing teff grain, teff flour, puffed-teff candidate, recipes, and all other Section F decisions unchanged.

The new source IDs `WP03-TEFF-FLAKES-20261012-S01` through `WP03-TEFF-FLAKES-20261012-S06` are proposal-local and were absent from the live ledger when checked. No shared catalog, ledger, plan, roadmap, workflow, or other proposal file was changed for this review.
