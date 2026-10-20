# WP02 B2 — Bunya nut flour picker-boundary hold (R86)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. This is the sole file created for this review; no shared reference, ledger, plan, roadmap, batch, recipe, generated, or application file was edited.
- **Open checklist item:** Section 04, B2, `[ ] Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours.` The candidate is a distinct additional regional nut flour within that open alternative-flour work.
- **Scope:** Review ground edible Bunya seeds from *Araucaria bidwillii* as a flour identity, separate from whole Bunya nuts, Brazilian pinhão flour, and isolated starch.
- **Source-ID prefix:** `WP02-B2-BUNYA-NUT-FLOUR-R86-20261013`. IDs below are proposal-local; no candidate ledger record is proposed.

## Recommendation

**Hold active catalog allocation.** Primary food studies and an Australian food-ingredient listing establish Bunya flour or ground Bunya-nut meal as real food products. The strongest blocker is the current picker: adding the well-attested English display `bunya nut flour` would make the broad query `nut flour` return only the Bunya row. Today that query returns seven partial-match flour rows. Phrase-first search would prefer the new contiguous `nut flour` phrase and suppress those fallback results. No truthful, evidence-backed alias on a generic flour row can preserve the broader result set. The French compound `farine de noix de bunya` is descriptive and consistent with the existing `noix de bunya` display, but no Québec product label or OQLF entry for Bunya flour was found. Keep the candidate unallocated until search can preserve the `nut flour` boundary and Québec French naming receives review. [S01–S06]

This is a hold on catalog promotion, not a rejection of Bunya flour as a food ingredient. Do not allocate `ingredient-ref-bunya-nut-flour`, do not attach a flour alias to the whole-nut identity, and do not add a ledger candidate. The exact proposed data delta is **none**.

## Product and naming boundary

| Candidate term | Evidence and disposition |
|---|---|
| **`bunya nut flour` / `bunya flour`** | A 2025 primary study evaluates flour prepared from Bunya nuts and compares raw, whole, roasted, and fermented preparations; a second study tests raw and processed flour in bread. UQ also describes Bunya nuts as edible and ground into flour. This supports a genuine flour product class for *A. bidwillii*, but not one standardized commercial grade or preparation. Retain as a documented, unallocated candidate. [S01–S03] |
| **`Bunya Nut Meal`** | NATIF lists a product whose ingredient is “100% Bunya Nut meal (ground nuts)” and suggests culinary uses. Its market name is `meal`, not `flour`; do not turn it into a global synonym or claim that its grind/process matches each research flour. The product listing is Australian, not Canadian or Québec evidence. [S04] |
| **`farine de noix de bunya`** | Use only as a provisional descriptive construction if the candidate is revisited. A French-language source outside Québec uses `noix de bunya` for the edible seed, and the active catalog already uses that French whole-food display; neither source attests this flour compound. No OQLF entry or Québec flour package was found. [S05] |
| **`pignon`, `pine nut flour`, and Brazilian `pinhão`** | Keep separate. OQLF’s `pignon` entry describes pine seeds, while Bunya is *Araucaria bidwillii*. The live Brazilian pinhão-flour row is sourced to *A. angustifolia*. Shared genus or culinary comparison does not establish synonymy or process equivalence. [S06; live catalog] |
| **Isolated Bunya starch** | Keep outside this flour candidate. The flour study separately evaluates isolated starch; its lab extraction and characterization do not convert flour into a flour form or support an active starch row here. [S01] |

The 2025 flour study states that there is no globally recognized terminology for dry-milled Bunya-nut products. It also reports that preparation changes particle size and functional behavior; roasted material is described as more like fine meal in that experiment. This reinforces the need to retain research-specific distinctions without assigning `meal`, `flour`, `roasted`, `fermented`, or whole-seed terms as aliases or catalog forms. [S01]

## Live ownership and archive audit

At the final static check on 2026-10-13, the live snapshot contained **1,417 ingredient references, 104 forms, 1,756 ledger records, and 63 legacy candidates**. The manifest lists **114 recipes and 1,123 ingredient rows**.

The current whole-food owner is `ingredient-ref-bunya-nuts` (`bunya nuts / noix de bunya`, category `NUT_SEED_AND_DRIED_FRUIT`) with the sole English alias `bunya nut`; it has no French alias, attached form, density, or unit mapping. Its ledger record verifies the edible *A. bidwillii* seed identity and already cites a Bunya Nut Meal listing, but does not decide a flour reference. The active `ingredient-ref-pinhao-flour` (`Brazilian pinhão flour / farine de graines du pin du Paraná`) is a separate *A. angustifolia* product. No active reference, form, legacy candidate, or ledger record owns `bunya nut flour`, `bunya flour`, or `farine de noix de bunya`; `ingredient-ref-bunya-nut-flour` is unused. [live reference, form, ledger, and legacy files]

The proposal and batch archive contain no focused Bunya-flour decision. R84's pinhão-flour proposal explicitly keeps Bunya nuts separate and leaves generic pine/pine-nut flour terms unassigned; it does not review flour made from *A. bidwillii*. The whole-Bunya review mentions meal and other ground styles as product-boundary evidence but does not allocate a flour identity. This R86 candidate is distinct from those decisions. [R84 proposal; Bunya whole-nut ledger record]

## Picker projection

`IngredientSearch.kt` returns complete normalized word-phrase matches first. It uses substring fallback only when the full-phrase pass has no results. The table compares current behavior with a hypothetical row named `bunya nut flour / farine de noix de bunya` and no aliases:

| Query | Current result | Hypothetical result | Assessment |
|---|---|---|---|
| `bunya nut flour` | No result | Bunya flour only | Good exact-product result. |
| `bunya nut` | `ingredient-ref-bunya-nuts` only | Whole Bunya nuts and Bunya flour | Acceptable related-product results; the existing whole-nut alias preserves the broad English term. |
| `noix de bunya` | `ingredient-ref-bunya-nuts` only | Whole Bunya nuts and Bunya flour | Broad French source/product query returns both identities. |
| `farine de noix de bunya` | No result | Bunya flour only | Good exact French phrase if that provisional display is later reviewed. |
| `farine de noix` | Acorn flour, cashew flour, and defatted coconut flour | Those three plus Bunya flour | Remains a multi-result French category query. |
| `nut flour` | Seven partial-match flour rows: Bambara groundnut, chestnut, defatted coconut, defatted tigernut, hazelnut, partially defatted peanut, and tigernut flours | Bunya flour only | **Unsafe regression.** The new display contains the exact phrase `nut flour`; phrase-first matching would suppress the current seven fallback results and incorrectly make one regional item stand for a broad flour query. |
| `Brazilian pinhão flour` / `pinhao flour` | `ingredient-ref-pinhao-flour` only | Unchanged | Preserves the distinct *A. angustifolia* identity. |

No existing generic-nut row or truthful flour alias can guard the broad `nut flour` query: doing so would imply a common identity across distinct nut flours. Do not accept the regression as a side effect of adding a specific item. Revisit after picker behavior can preserve both the exact Bunya result and the broader flour results.

## Recipe demand and numeric limits

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for `bunya nut flour`, `bunya flour`, `Bunya Nut Meal`, `farine de noix de bunya`, and the Bunya whole-nut reference. The scan found **zero candidate phrase hits, zero ingredient-row hits, and zero links** to `ingredient-ref-bunya-nuts`. This is no bundled demand; it does not measure broader Australian or Canadian interest.

The primary study reports composition for its raw flour sample, including 8.4% dry-basis fibre, 4.7% dry-basis protein, and 4.4% dry-basis fat, and finds that flour properties change with preparation. Those are sample-specific composition and functional results, not bulk density or household measures. The bread study includes a 50% raw-Bunya-flour formulation whose aroma and flavour are described; that result is tied to its experimental bread formula, not a general flour-replacement ratio. NATIF's 100 g and 500 g package variants are package sizes, not portion weights or cup measures. Its comparison to almond meal or pine nuts is not a tested, scoped substitution rule. [S01–S04]

No default density, unit mapping, form, conversion, package yield, recipe link, or global/contextual substitution is supported. None is proposed.

## Exact data delta

**None.** Keep active references, forms, ledger, legacy candidates, recipes, and generated files unchanged. Do not reserve an ID or attach `farine de noix de bunya`, `Bunya Nut Meal`, `nut flour`, `pine nut flour`, or `pinhão flour` to another row.

## Source register

Sources were checked on 2026-10-13. IDs are local to this proposal because the recommendation adds no ledger record.

| ID | Source and evidence | Limit |
|---|---|---|
| **WP02-B2-BUNYA-NUT-FLOUR-R86-20261013-S01** | Nadolny et al., [“Nutritional, functional and rheological properties of bunya nut flour as a versatile gluten-free option”](https://doi.org/10.1016/j.foodres.2024.115627), *Food Research International* 202 (2025), 115627; abstract and full-text sections on flour preparation/particle size. | Primary study supports Bunya flour as a food ingredient and reports preparation-dependent properties. Its lab samples do not define a commercial grade or household measures. It says terminology for dry-milled products is not globally standardized. |
| **WP02-B2-BUNYA-NUT-FLOUR-R86-20261013-S02** | Nadolny et al., [“Physicochemical, rheological and sensory properties of gluten-free doughs and breads of Australian bunya nuts”](https://doi.org/10.1016/j.fufo.2025.100584), *Future Foods* 11 (2025), 100584. | Primary bread-formulation study for raw, fermented, boiled, roasted, and whole Bunya flours. Results, including the reported 50% raw-flour formulation, are recipe-specific, not a reusable replacement rule. |
| **WP02-B2-BUNYA-NUT-FLOUR-R86-20261013-S03** | University of Queensland, [“Bringing new life to an ancient nut”](https://stories.uq.edu.au/news/2024/bringing-new-life-to-an-ancient-nut/index.html), 2024. | Identifies *Araucaria bidwillii*, describes ground flour use and long-standing First Nations food significance, and includes a Bunya People’s Aboriginal Corporation perspective. It is not a package specification or Québec terminology source. |
| **WP02-B2-BUNYA-NUT-FLOUR-R86-20261013-S04** | NATIF Foods, [Bunya Nut Meal](https://natif.com.au/products/bunya-nut-meal), current product page. | Names a ground-nut meal, declares 100% Bunya nut meal, gives package options, and suggests culinary uses. It is an Australian listing, not Canadian availability; its `meal` wording does not settle flour/meal equivalence. |
| **WP02-B2-BUNYA-NUT-FLOUR-R86-20261013-S05** | L’École Jardin-Forêt, [*Bunya-Bunya, l’Araucaria bidwillii*](https://ecolejardinforet.fr/wp-content/uploads/2025/01/Bunya-Bunya-lAraucaria-bidwillii.pdf), 2025. | French-language source uses `noix de bunya` for edible seeds. It is outside Québec and does not attest a flour product name. |
| **WP02-B2-BUNYA-NUT-FLOUR-R86-20261013-S06** | Office québécois de la langue française, [*pignon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083473/pignon). | Québec French evidence for `pignon`/pine-seed wording; it does not identify Bunya or authorize merging *A. bidwillii* flour with pine-nut flour. |

## Static review record

Read current `AGENTS.md`, Section 04 B2/B3 plan text, live references/forms/ledger/legacy records, the proposal/batch archive, and current `IngredientSearch.kt`. Confirmed the B2 parent item remains open after R85 and found no focused Bunya-flour decision. Recomputed the final snapshot counts above; checked exact ID/name ownership, source-prefix uniqueness, attached forms, current and hypothetical picker results, and every manifest-listed recipe file/ingredient row. Verified this file as UTF-8 without BOM, with a final newline and no trailing whitespace; checked all six unique proposal-local source IDs, HTTPS link syntax, archive/ID collisions, and the picker/query projection. No tests, Gradle, emulator, or deployment were run for this proposal-only review.
