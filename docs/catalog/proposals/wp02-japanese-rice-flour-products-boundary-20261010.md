# WP02 A7 proposal: Japanese glutinous-rice flour products — mochiko and shiratamako

- **Status:** proposal-only; identity decision remains on hold
- **Research date:** 2026-10-10
- **Scope:** Review `mochiko` and `shiratamako` against the integrated generic glutinous-rice flour identity. Assess Japanese product/process distinctions and Canadian/Québec naming. No seed, ledger, plan, roadmap, code, or test changes are proposed here.
- **Existing catalog anchor:** `ingredient-ref-glutinous-rice-flour` — `glutinous rice flour / farine de riz gluant`; English aliases `sweet rice flour` and `sweet rice powder`; category `FLOUR_AND_STARCH`; no forms, densities, or unit mappings. Relevant neighboring identities are `ingredient-ref-rice-flour` (`rice flour / farine de riz`), white and brown rice flour, and the source grain `ingredient-ref-glutinous-rice` (`glutinous rice / riz gluant`).

## Recommendation

**Keep `mochiko` and `shiratamako` unresolved as catalog identities for now. Do not add either as an alias of the generic glutinous-rice flour, and do not model them as ingredient forms yet.**

The evidence supports two distinct Japanese product names within the broader glutinous-rice-flour family. The Ministry of Agriculture, Forestry and Fisheries (MAFF) lists `shiratamako` and `mochiko` among regional rice-flour products, but says there are no flour-like uniform definitions or standards for these regional products and that milling methods vary. Maehara Seifun's own material also describes materially different processes in different entries: one comparison says `mochi-ko` is milled from washed, dried rice without water, while its product-category page says the rice is soaked, ground, and dried. A Shiratamaya manufacturer page documents wet milling and dewatering for its shiratamako. This supports a real process distinction in examples, but not a stable, cross-manufacturer process rule for the names.

Québec terminology is suggestive but does not settle whether the app should store two ingredient identities or two subtypes/forms. Télé-Québec calls shiratamako a type of `farine de riz gluant` and describes mochiko as the same type of flour in powder form, with a different texture. That is useful local-language evidence, but it is consumer recipe guidance rather than bilingual manufacturer packaging or a terminology ruling. OQLF's `farine de riz` entry covers ordinary rice flour and white/brown source rice; it does not define these Japanese product names. The Canadian listings found here use the Japanese names alongside English `glutinous rice flour`, but do not independently establish the French product names or a common process specification.

So the product names should remain visible as unresolved terms pending a tighter boundary decision. Treating either as a generic synonym now would discard the source-backed distinction; creating separate identities or forms now would overstate the consistency of their product/process definitions.

## Evidence and boundary

| Term | Evidence in this review | Proposed disposition | Evidence limit |
| --- | --- | --- | --- |
| `mochiko` / `mochi-ko` | Japanese flour-product name; Canadian retailers list named mochiko glutinous rice flour. Manufacturer accounts disagree on whether the general product is milled dry or soaked and ground. | Hold unassigned. Do not alias to generic glutinous-rice flour. | No invariant cross-manufacturer process definition; no Québec bilingual product label found. `Mochiko` may also be presented as a branded product name. |
| `shiratamako` | Japanese product name; MAFF and Japanese manufacturers describe it as glutinous-rice flour, with manufacturer evidence for wet grinding and dewatering. Canadian listings carry the name. | Hold unassigned. Do not alias to generic glutinous-rice flour. | A specific wet-milling account does not establish a universal standard; no bilingual Canadian manufacturer specification found. |
| Generic glutinous-rice flour | Already integrated as `ingredient-ref-glutinous-rice-flour`, with `sweet rice flour` and `sweet rice powder` aliases. Québec-market French product wording is `farine de riz gluant`. | Retain current row and current aliases as-is. | Do not use these broad terms as aliases on either Japanese product candidate. |
| Ordinary rice flour / source grain | Existing `ingredient-ref-rice-flour` and `ingredient-ref-glutinous-rice` remain separate. MAFF's Kushi-dango page distinguishes `joshinko` (short-grain rice flour) from `shiratamako` (glutinous rice flour) in the same ingredient list. | Keep each separate; do not map either Japanese product name to ordinary rice flour or to the grain. | MAFF's recipe entry establishes a culinary distinction, not a comprehensive milling standard. |

### Candidate labels if a later review accepts two product identities

These are **review candidates only**, not approved catalog names or assigned IDs:

| Candidate identity | English display candidate | Québec French display candidate | Alias guidance |
| --- | --- | --- | --- |
| Mochiko | `mochiko glutinous rice flour` | `farine de riz gluant de type mochiko` | Keep generic `glutinous rice flour`, `sweet rice flour`, and `sweet rice powder` on the existing generic row. Do not activate spelling variants without a source. |
| Shiratamako | `shiratamako glutinous rice flour` | `farine de riz gluant de type shiratamako` | Keep generic `glutinous rice flour`, `sweet rice flour`, and `sweet rice powder` on the existing generic row. Do not activate spelling variants without a source. |

Télé-Québec supports the French descriptive pattern `farine de type shiratamako`, pairs the ingredient with `farine de riz gluant`, and names mochiko as a related powder product. The candidate labels above combine that local wording with the explicit product name; they still need independent bilingual Québec review. No OQLF or TERMIUM entry for `mochiko` or `shiratamako` was found in the searches for this review.

If the boundary is later resolved in favor of two identities, both would remain in `FLOUR_AND_STARCH`. The names describe products established at milling, so `IngredientForm` is not recommended as a shortcut for unresolved identity scope. Do not infer forms, conversion rules, substitutions, or product measurements from this review.

## Current catalog, forms, recipe-hit, and collision audit

- **Active names:** generic glutinous flour is `glutinous rice flour / farine de riz gluant`, with English aliases `sweet rice flour` and `sweet rice powder`. Ordinary `rice flour / farine de riz`, white rice flour, brown rice flour, and glutinous rice grain have separate IDs.
- **Forms:** no form is attached to `ingredient-ref-glutinous-rice-flour`. The only rice-related forms in `ingredient-forms.v1.json` are `ingredient-form-rice-cooked` and `ingredient-form-rice-dry`, both attached to ordinary `ingredient-ref-rice`; neither is a Japanese flour product.
- **Bundled recipe hits:** searched all 114 current recipe JSON files for `mochiko`, `mochi-ko`, `shiratamako`, `glutinous rice flour`, `farine de riz gluant`, `sweet rice flour`, `sweet rice powder`, `mochi`, `shiratama`, `dango`, `joshinko`, and the corresponding Japanese spellings. There are no hits.
- **Archived recipe hits:** the same search across all 114 `RecipeKeeper_20260320_143058` recipe JSON files returned no hits. No recipe row is a candidate for relinking.
- **Catalog collisions:** exact normalized scans of names and aliases found no current `mochiko`, `mochi-ko`, `shiratamako`, `shiratama-ko`, `joshinko`, or Japanese-script matches. The generic terms `glutinous rice flour`, `farine de riz gluant`, `sweet rice flour`, and `sweet rice powder` resolve to the existing generic glutinous-rice-flour record. Those generic terms must not be copied onto future product-specific records. A broad search for `glutinous rice flour` could surface more than one candidate if the proposed display names are adopted; this is an expected family relationship, not an exact alias collision.
- **Existing proposal search:** no existing file in `docs/catalog/proposals/` mentions mochiko, shiratamako, or glutinous-rice flour. The relevant prior decisions are in `docs/catalog/batches/glutinous-rice-flour-identity.md`, `docs/catalog/batches/rice-flour-source-grades.md`, and the Section A4/B5 register in `docs/catalog/batches/baking-flours-starches.md`; those files remain unchanged.

## Evidence still needed

1. Comparable current product specifications from more than one Japanese manufacturer showing how each named product is made and whether the names have consistent product boundaries. Resolve the conflicting Maehara Seifun descriptions before using dry-versus-wet milling as the catalog definition.
2. Current Canadian bilingual packaging or manufacturer/importer specifications that pair each native product name with a French descriptor. Retailer category names and a Québec recipe page establish market-language usage, but not a standardized label pair.
3. Independent bilingual Québec culinary review of whether to create two product identities, retain one generic identity with source-specific terms, or encode an approved distinction in another structure.
4. A recipe or catalog use case before adding any measurement, form, conversion, or substitution data; none is supported or proposed here.

## Proposal-local source register

Sources were accessed on 2026-10-10. IDs below are unique to this proposal. Japanese-source descriptions are paraphrased; no quantities or recipe methods are imported.

- **WP02-JRFP-20261010-S01 — MAFF, rice-flour milling characteristics.** [Official technical overview](https://www.maff.go.jp/j/syouan/keikaku/soukatu/okome_summary/09/rice_flour_pro_cessing_03.html). Names `shiratamako`, `mochiko`, and `joshinko` among rice-flour products; states that these regional products do not have uniform flour-like definitions or standards and that processing methods vary. Supports the hold on universal process rules.
- **WP02-JRFP-20261010-S02 — Maehara Seifun / Gishi, mochiko product category.** [Manufacturer product page](https://www.gishi.co.jp/home/item.asp?ct=19). Identifies `mochi ko` as glutinous rice flour and describes polishing, soaking, grinding, and drying; says manufacturers may add non-glutinous rice or starch. It is manufacturer-specific information and is read alongside S03 because the same site gives a different general process account there.
- **WP02-JRFP-20261010-S03 — Maehara Seifun / Gishi, mochiko–shiratamako FAQ.** [Manufacturer comparison](https://www.gishi.co.jp/home/faq_view.asp?id=77). Contrasts powder-like `mochi-ko` with granular `shiratamako` and describes `mochi-ko` as dry milled versus water-milled shiratamako. The conflict with S02 prevents adopting this process as universal.
- **WP02-JRFP-20261010-S04 — Shiratamaya Shinshaburo, shiratamako process.** [Manufacturer process page](https://www.shiratamaya.co.jp/%E7%99%BD%E7%8E%89%E7%B2%89%E3%81%AB%E3%81%A4%E3%81%84%E3%81%A6/). Documents its own glutinous-rice shiratamako process, including soaking, water grinding, separation/dewatering, and drying. Supports one product-specific wet-milling account, not a category-wide standard.
- **WP02-JRFP-20261010-S05 — Télé-Québec, Mochis à la crème glacée.** [Québec recipe and ingredient note](https://cuisinez.telequebec.tv/recettes/6076/mochis-a-la-creme-glacee). Uses `shiratamako (farine de riz gluant)` and `farine de type shiratamako`; describes mochiko as the same type of flour in powder form and notes a texture difference. Supports Québec French usage, not a manufacturing standard or terminology ruling.
- **WP02-JRFP-20261010-S06 — OQLF, farine de riz.** [Grand dictionnaire terminologique entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz). Defines the generic French/English pair `farine de riz / rice flour` and notes white- and brown-rice sources. Does not define mochiko or shiratamako.
- **WP02-JRFP-20261010-S07 — MAFF, Kushi-dango.** [Regional cuisine entry](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/7285/index.html). Lists and uses `shiratamako (= glutinous rice flour)` separately from `joshinko (= short-grain rice flour)`. Supports separating glutinous from ordinary short-grain rice flour; this is a recipe distinction, not a milling taxonomy.
- **WP02-JRFP-20261010-S08 — Gusta Supplies, Japanese flour and starch collection.** [Canadian product collection](https://supplies.gusta.ca/collections/japanese-starch). Separately lists Koda Farms Mochiko, Tamasan Shiratamako, and Mitake Joshinko as distinct products; the English product labels support Canadian market naming only.
- **WP02-JRFP-20261010-S09 — Ozawa Canada, Gishi Shiratamako.** [Canadian importer product page](https://ozawa.ca/product/gishi-shiratamako-1kg/). Lists `Gishi Shiratamako (Rice Flour)` under flour and describes it as glutinous rice flour. Supports Canadian-market product identification, not French naming or process.
- **WP02-JRFP-20261010-S10 — Hungry Ninja, Gishi Mochiko.** [Canadian retailer product page](https://hungry-ninja.ca/products/gishi-mochiko-glutinous-rice-flour-250g). Uses `Gishi Mochiko Glutinous Rice Flour` and describes its listed product as glutinous rice. The retailer's process note agrees with S02's soaked/grind/dry account, underscoring why S03's different account cannot define all mochiko.

## Coordinator disposition — 2026-10-10

The source review was independently checked and the recommendation is accepted: keep `mochiko` and `shiratamako` unassigned, retain the generic glutinous-rice-flour row unchanged, and add no aliases, forms, or recipe links for these product names. The evidence does not support a stable cross-manufacturer process rule or a settled Québec French identity/form boundary. The decision and source IDs are recorded on `ingredient-ref-glutinous-rice-flour` in the research ledger.
