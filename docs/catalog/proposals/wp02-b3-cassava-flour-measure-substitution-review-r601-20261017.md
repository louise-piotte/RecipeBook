# WP02 B3 R601 — cassava-flour serving weights and wheat-replacement claims

- **Reviewed:** 2026-10-17.
- **Status:** Integrated 2026-10-17. The product-specific observations and blocked generic substitution finding are recorded on the existing cassava-flour ledger record; the plan, roadmap, and integration README record the disposition.
- **Scope:** Product-label quarter-cup weights for the existing `ingredient-ref-cassava-flour` and the limit of the manufacturers’ wheat-flour replacement advice. This review does not reopen identity or alias decisions and does not revisit pea starch, cornstarch, sweet-potato starch, tapioca-starch chart portions, or the R598 polvilho package observation.
- **Open plan anchors:** The B3 checklist at [line 3042](../../RecipeBook-global-ingredient-catalog-plan.txt#L3042) keeps cassava flour in the unchecked flour/starch group. The broader WP02 parent at [line 15893](../../RecipeBook-global-ingredient-catalog-plan.txt#L15921) remains unchecked.
- **Decision:** **Evidence-only add** two manufacturer-specific `portion_weight` observations to the current cassava-flour ledger record. Generic measurement research is `blocked_pending_evidence`; `defaultDensity` remains `null` and `unitMappings` remains empty. The conflicting manufacturer replacement advice is recorded as `blocked_pending_evidence`, with no replacement list or active substitution rule. No catalog terms, form, conversion, yield, or recipe link was added.

## Existing identity and Québec French wording

The active catalog already has one whole-root flour reference: `ingredient-ref-cassava-flour`, `edible cassava flour / farine comestible de manioc`, with the English alias `manioc flour` and French alias `farine de manioc`. It remains category `FLOUR_AND_STARCH`; density is null and unit mappings are empty. No ingredient form points to this reference. The ledger marks its identity verified, measurement and substitution research not yet researched, and contains no measurement observations or substitution findings for it.

Retain the existing Québec French display and aliases unchanged. OQLF’s GDT headword is *farine de manioc* and lists *manioc flour* and *cassava flour* as English equivalents; the entry credits AFNOR (1979), so this is terminology evidence rather than a current product specification. Codex’s existing source supports the canonical *farine comestible de manioc* wording. Yupik’s bilingual panel renders its serving as “Per 1/4 cup (30 g) / Pour 1/4 tasse (30 g),” but that label does not establish a common cup convention or a new catalog name. Reuse the existing terminology sources; add no French or English search phrase.

## Product-specific portion observations

The two official product pages publish different masses for the same nominal serving. Preserve the brand and product scopes as separate observations; do not average them, create a generic interval, or derive a cup-to-mass mapping.

| Proposed observation ID | Published label and scope | Limit |
|---|---|---|
| `cassava-flour-bobs-red-mill-quarter-cup-35g-r601-20261017` | Bob’s Red Mill’s official [Cassava Flour product page](https://www.bobsredmill.com/product/cassava-flour) lists serving size **1/4 cup (35 g)** and ingredient “Cassava.” The product description identifies flour made from the whole cassava root. | One manufacturer product label. The page does not state the cup capacity or how the serving was filled. It is not a generic cassava-flour measure. |
| `cassava-flour-yupik-p31516-quarter-cup-30g-r601-20261017` | Yupik’s official [Organic Cassava Flour, Fine (Gluten Free)](https://yupik.com/en/organic-cassava-flour-fine-gluten-free-p31516) page, SKU P31516, describes organic cassava fine flour, 20 mesh, and gives **Per 1/4 cup (30 g) / Pour 1/4 tasse (30 g)**. | One product-specific bilingual label serving. The page does not state cup capacity or filling method. Do not transfer its measure to other cassava flours. |

The two recorded observations use `relationship: portion_weight`, `evidenceKind: manufacturer_label`, `valueUnit: g`, and `sourceQuantity: 0.25 cup`. Each describes flour dry/as sold and states that the serving method and cup convention are unspecified. The Bob’s Red Mill [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart) repeats 35 g per 1/4 cup and 140 g per cup for its Cassava Flour row, but this is the same manufacturer and not an independent measurement. Its URL already has source ID `WP02-B23-RESIDUAL-20261010-S05`; no new source owner or third observation was added from that chart.

The two product labels establish product-specific observations, not a common flour density or a generic quarter-cup weight. Their nominal values differ by 5 g; no source establishes whether that difference reflects product grind, cup convention, filling method, label rounding, or another factor. Keep generic `measurementState` blocked pending evidence with a stated measure protocol.

## Wheat-flour replacement evidence boundary

The product pages do not support one transferable wheat-flour replacement rule:

| Manufacturer statement | Source-specific content | Limit |
|---|---|---|
| Bob’s Red Mill | Its product page says cassava flour is **not a one-to-one replacement for wheat flours** and recommends recipes developed for gluten-free flours. [S01] | General product advice for this brand’s flour; it does not provide a replacement amount or a validated recipe context. |
| Yupik | Its page says the product can replace wheat flour in a **1:1 ratio**, while also saying the flour is lighter and absorbs more liquid. [S02] | It does not say whether 1:1 means mass or volume and gives no recipe or adjustment protocol. |
| Otto’s Naturals | The existing source says that, for its product, most recipes can use 1:1 **by weight** or 25% less flour volume when the recipe uses cups. Reuse ledger source `WP02-SECTION-B-MANIOC-FLOUR-ALIAS-20261012-S08`. | Brand-specific advice. It does not resolve the different statements from Bob’s and Yupik or validate a general cassava-flour rule. |

The ledger now records `cassava-flour-general-wheat-replacement-r601-20261017` with `researchState: blocked_pending_evidence` and source IDs S01, S02, and the existing Otto’s source ID. It states that the evidence is product-specific and the ratio basis/context is not consistent across sources. No `replacements`, `ruleId`, active rule, or recipe-line link was added. This holds a generic rule without disputing manufacturer-specific instructions.

## Catalog ownership, picker effect, and recipe demand

- **Source ownership:** The Bob’s Red Mill product-page URL and the Yupik P31516 product-page URL have no existing source entry in the ledger. The new proposal source IDs are `WP02-B3-CASSAVA-FLOUR-MEASURE-SUBSTITUTION-R601-20261017-S01` and `...-S02`, respectively. The Bob’s chart URL already uses `WP02-B23-RESIDUAL-20261010-S05` on several ledger records; reuse it only for the repeated chart row. Otto’s Naturals already has source ID `WP02-SECTION-B-MANIOC-FLOUR-ALIAS-20261012-S08` on the cassava-flour record. OQLF terminology is already recorded as `WP02-SECTION-B-MANIOC-FLOUR-ALIAS-20261012-S01`; Codex’s canonical French display is already supported by `WP02-S35`. No source ID is reassigned to another URL.
- **ID collision check:** The R601 source prefix and proposed observation/finding IDs were absent from the current ledger, proposal and batch archive, plan, and roadmap before drafting. The active identity remains `ingredient-ref-cassava-flour`; no new ingredient candidate ID is proposed.
- **Picker:** No names or aliases change. Static phrase matching against current reference terms gives one result, `ingredient-ref-cassava-flour`, for `cassava flour`, `edible cassava flour`, `manioc flour`, `farine de manioc`, and `farine comestible de manioc`. `tapioca flour` has no result; `cassava starch` returns the existing Brazilian polvilho doce, Brazilian polvilho azedo, and native-waxy tapioca-starch references. The evidence-only changes do not alter these results. Keep whole-root cassava flour distinct from extracted tapioca/manioc starch and the source-named polvilho products.
- **Bundled recipes:** A manifest scan of all **114 recipe files** and **1,123 ingredient rows** found zero direct links to `ingredient-ref-cassava-flour` and zero recipe-text matches for `cassava flour`, `edible cassava flour`, `manioc flour`, `farine de manioc`, `farine comestible de manioc`, Bob’s Red Mill, Yupik, or SKU P31516. The bundle supplies no recipe demand or context for a generic wheat-flour substitution.
- **Forms and active data:** There are no attached ingredient forms, substitution-rule references, or package-yield references for this ID. Add no form, density, unit mapping, conversion, package yield, active substitution rule, or recipe link.

## Source register

Accessed 2026-10-17 unless a reused ledger source is identified below.

| ID | Direct source and evidence | Limits |
|---|---|---|
| **WP02-B3-CASSAVA-FLOUR-MEASURE-SUBSTITUTION-R601-20261017-S01** | Bob’s Red Mill, [Cassava Flour](https://www.bobsredmill.com/product/cassava-flour). Nutrition Facts serving is 1/4 cup (35 g); page identifies whole-root cassava flour and says it is not a 1:1 wheat-flour replacement. | Product-specific label and advice; no cup-fill method, cup capacity, or replacement ratio is provided. |
| **WP02-B3-CASSAVA-FLOUR-MEASURE-SUBSTITUTION-R601-20261017-S02** | Yupik, [Organic Cassava Flour, Fine (Gluten Free), SKU P31516](https://yupik.com/en/organic-cassava-flour-fine-gluten-free-p31516). Bilingual panel says 1/4 cup (30 g); page identifies organic cassava, fine flour 20 mesh, and gives a 1:1 wheat-flour replacement statement with lighter-consistency/liquid-absorption caveats. | Product-specific label; cup capacity/fill method and ratio basis are unspecified. |
| **Reuse WP02-B23-RESIDUAL-20261010-S05** | Bob’s Red Mill, [Flour Weight Chart](https://www.bobsredmill.com/articles/bobs-red-mill-flour-weight-chart). Its Cassava Flour row repeats 35 g per 1/4 cup and lists 140 g per cup. | Same manufacturer as S01, not an independent product sample. Existing URL/source owner; add no duplicate source ID or observation. |
| **Reuse WP02-SECTION-B-MANIOC-FLOUR-ALIAS-20261012-S08** | Otto’s Naturals, [Organic Cassava Flour](https://www.ottosnaturals.com/products/ottos-organic-cassava-flour). Page rechecked 2026-10-17; it gives product-specific 1:1-by-weight or 25%-less-volume replacement advice. | Existing manufacturer source on the cassava-flour ledger record; product-specific, not a generic rule. |
| **Reuse WP02-SECTION-B-MANIOC-FLOUR-ALIAS-20261012-S01** | OQLF, [farine de manioc (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287122/farine-de-manioc). Supports the current Québec French alias and listed English equivalents. | Terminology entry credited to AFNOR (1979); no measure or substitution claim. |
| **Reuse WP02-S35** | Codex Alimentarius, *Norme pour la farine comestible de manioc* (CXS 176-1989), already registered on this ledger record. | Supports the canonical product name and identity boundary; no household measure or replacement rule. |

## Review checks

- [x] Read `AGENTS.md`, the roadmap, the current open WP02 parent and B3 checklist, the R585/R588/R591/R595/R598 materials, and earlier cassava-flour reviews.
- [x] Rechecked the live active reference, ledger state, attached forms, current substitution rules, and package-yield file.
- [x] Reopened the Bob’s Red Mill and Yupik manufacturer pages, checked the existing Bob’s chart and Otto’s source, and rechecked OQLF wording.
- [x] Audited exact source URLs and proposed identifiers; reused source IDs retain their existing URLs.
- [x] Scanned all 114 manifest recipes / 1,123 ingredient rows and projected existing picker phrase results.
- [x] At proposal drafting, only the proposal file was changed. UTF-8/no-BOM, final newline, local plan anchors, and scoped whitespace checks were verified; integration is recorded in the linked batch README.

The ledger evidence, plan checklist, roadmap, and integration README now reflect the accepted data-only update. No app tests, build, emulator run, or deployment were needed for these database-JSON additions under `AGENTS.md`.
