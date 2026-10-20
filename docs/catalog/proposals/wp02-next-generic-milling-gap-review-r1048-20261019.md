# WP02 Section A7 R1048: wheat aleurone flour identity review

**Date:** 2026-10-19  
**Disposition:** Proposal only; recommend one identity-only generic milling-fraction entry. No shared catalog, ledger, plan, roadmap, recipe, or generated-file changes were made.  
**Snapshot audited:** 2,055 ingredient references, 205 forms, 2,460 research-ledger records / 11,488 source entries / 9,648 distinct source IDs, 55 legacy candidates, and 114 bundled recipes / 1,123 ingredient lines.

## Scope and recommendation

The open WP02 Section A7 parent continues review of generic grain meals and milling products ([plan, line 2290](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)). R1048 reviews **wheat aleurone flour**, a separately isolated wheat-kernel fraction with direct human-food study use. The recommendation is to add one identity-only, crop-qualified generic reference in `FLOUR_AND_STARCH` if this proposal is accepted. This is a distinct milling identity, not a product roster or retailer variant.

No brand, product line, flavour family, SKU, retailer variant, or commercial roster was researched. All available measures, blend levels, nutrient values, processing details, and trial outcomes remain with their cited studies; none is transferred to a generic recipe measure, health claim, or substitution rule.

## Identity boundary

The Cereals & Grains Association definition places aleurone in the outermost endosperm layer(s), around the starchy endosperm and part of the embryo. It describes separating the tissue from germ and starchy endosperm through milling and further extraction, and says isolated aleurone should contain low starch and pericarp. Fenech et al. (1999) directly describe wheat aleurone flour prepared from isolated aleurone cells and used in a cereal study; later primary studies use wheat aleurone in bread. Together these sources support a generic food fraction when the grain source and isolated tissue are both specified.

Keep the proposed identity crop-qualified and limited to flour prepared from separated wheat aleurone. It is distinct from:

- **Wheat bran** (`ingredient-ref-wheat-bran`), a broader milling fraction that may contain pericarp and aleurone along with other tissues;
- **Wheat bran flour** (`ingredient-ref-wheat-bran-flour`), ground/fractionated bran material not established as an isolated aleurone layer;
- wheat germ, defatted wheat-germ meal, whole-wheat meal, whole-wheat flour, and flour containing some retained outer-kernel tissue;
- aleurone from other cereal species, feed fractions, isolated aleurone compounds, or bran-rich flour blends.

The generic definition supports the tissue boundary, not a universal extraction protocol, purity specification, particle size, retail grade, or home-milling method. Do not treat “aleurone” alone as an alias: it can refer to the tissue across cereals, while this proposed food ingredient is specifically wheat aleurone flour.

### Recent-proposal overlap check

The recent A7 proposal scan found only an incidental reference to aleurone in R957’s description of barley middlings as a mixed barley milling stream. That is not a separately isolated aleurone identity and does not cover wheat aleurone flour. R1031 covers wheat bran flour made from bran material, while R1045 held a study-defined fine triticale bran fraction; neither establishes this crop-qualified isolated fraction. No recent A7 proposal owns or already proposes wheat aleurone flour.

## Bilingual naming boundary

Proposed display: **wheat aleurone flour / farine d’aleurone de blé**. OQLF’s GDT entry supports the French base term **aleurone** and pairs it with English **aleurone**, but its entry is biological terminology rather than a preferred Québec food-ingredient name. The French compound in this proposal is a transparent descriptive translation and remains provisional; do not claim OQLF preference or add it as an alias elsewhere. No source supports a shorter unqualified food name that would avoid confusion with other cereal aleurone fractions.

## Live ownership and recipe-demand audit

The read-only audit covered the current split seed package, research ledger and source IDs, legacy-import candidates, substitution rules, package yields, and all bundled recipe files.

| Surface | Live state | R1048 finding |
|---|---:|---|
| Ingredient references | **2,055** | No `aleurone`, `wheat aleurone`, `wheat aleurone flour`, proposed ID, or proposed French display owns a reference or alias. Preserve the nearby `ingredient-ref-wheat-bran`, `ingredient-ref-wheat-bran-flour`, `ingredient-ref-wheat-germ`, `ingredient-ref-defatted-wheat-germ-meal`, `ingredient-ref-wheat-meal`, and whole-wheat flour owners; none is renamed, merged, or generalized. The wheat-bran-flour row is already separate from wheat bran and has its own four R1031 sources. |
| Ingredient forms | **205** | No aleurone or proposed-ID form exists; no wheat-bran, wheat-bran-flour, wheat-germ, or wheat-meal form owns the candidate. Add no form. |
| Research ledger | **2,460 records / 11,488 source entries / 9,648 distinct source IDs** | No aleurone identity record, exact aleurone source ID, or ownership of the cited OQLF/DOI source URLs exists. Preserve all adjacent ownership: `ingredient-ref-wheat-bran` has five sources (`WP02-S100`, `WP02-S98`, `WP07-KAB-IWC`, `WP02-A7-WHEAT-GERM-MEASURE-SUB-R624-20261018-S02`, and `WP02-A7-WHEAT-BRAN-MEASURE-SUB-R628-20261018-S01`), three measurement observations, and one substitution finding; `ingredient-ref-wheat-bran-flour` retains its four `WP02-A7-WHEAT-BRAN-FLOUR-R1031-20261019-S01`–`S04` sources and no supported reusable measure; `ingredient-ref-wheat-germ` retains six sources, two observations, and two findings; `ingredient-ref-wheat-meal` retains its 35-source unresolved record. None of those source IDs or findings transfers to the proposed identity. No R1048 source IDs are allocated to the shared ledger by this proposal. |
| Legacy import identities | **55 candidates** | No aleurone or proposed-ID candidate exists. Do not create a legacy candidate. |
| Bundled recipes | **114 files / 1,123 ingredient lines** | No recipe file or structured ingredient line contains aleurone or the proposed English/French names. There is no recipe-line owner, current recipe demand, or quantity. |
| Substitution rules and package yields | **0 global rules / 0 contextual rules / 1 unrelated package-yield record** | No candidate-specific rule, yield, conversion, or recipe-line substitution link exists. Add none. |

## Numeric and substitution limits

The 1999 study’s 100 g serving is cereal made with aleurone flour, not 100 g of isolated flour. Fenech et al. (2005) describe 175 g bread per day in a controlled study; that is the bread serving, not an aleurone-flour measure. Keaveney et al. (2015) compare study meals and aleurone bread, without establishing a reusable kitchen quantity. Those servings and all study formulas, inclusion levels, compositions, and outcomes remain source-specific.

No household volume measure, cup weight, density, unit mapping, cooking yield, or general milling yield is supported. Bread-making evidence shows food use, not a general replacement ratio for wheat flour, wheat bran, wheat germ, or another ingredient. If accepted, keep `defaultDensity` null, `unitMappings` empty, add no measurement observation, and use `measurementState: researched_no_supported_value`. Use `substitutionResearchState: blocked_pending_evidence`; add no active or contextual substitution rule and no recipe-line substitution link. No health or nutrient claim is proposed.

## Commercial-only queue disposition

The repeated Anson Mills **Colonial-Style Toasted Stone Cut Wheat Meal** lead remains **out of scope** because commercial-product counts do not add ingredient diversity. Preserve its historical R605 proposal evidence and the existing generic wheat-meal hold; do not research the product or variants here ([R605 review](wp02-a7-next-grain-meal-gap-review-r605-20261018.md), [A7 plan, lines 2374–2379](../../RecipeBook-global-ingredient-catalog-plan.txt#L2374)).

The Nu Life Market and Dempsey sorghum-meal product-only leads were already marked **out of scope** in R1040 for the same reason. Preserve their current source ownership and product-scoped evidence; stop those product-only lines. No new commercial-only queue item was found or pursued in this review.

## Minimal proposed data

If accepted, add only this reference row:

```json
{
  "id": "ingredient-ref-wheat-aleurone-flour",
  "nameEn": "wheat aleurone flour",
  "nameFr": "farine d’aleurone de blé",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Proposed ledger state, only if the identity is integrated:

- `recordId`: `ingredient-ref-wheat-aleurone-flour`; `recordType`: `ingredient_reference`; `identityState`: `verified` for the crop-qualified, separated milling fraction and its direct human-food use.
- `measurementState`: `researched_no_supported_value`; zero measurement observations.
- `substitutionResearchState`: `blocked_pending_evidence`; zero generic or contextual substitution findings.
- Add the proposal-local source evidence below only. Add no aliases, forms, density, mappings, measures, conversions, yields, recipe links, or substitution rules. Keep the French display provisional pending an independent Québec food-terminology review.

## Proposal-local source evidence

These identifiers are reserved for the proposed record in this review only; they have not been added to the live research ledger.

| Proposal-local source ID | Source and locator | Claim used and limit |
|---|---|---|
| `WP02-A7-WHEAT-ALEURONE-FLOUR-R1048-20261019-S01` | Cereals & Grains Association, [“Aleurone”](https://www.cerealsgrains.org/resources/definitions/Pages/Aleurone.aspx), approved definition (2010). | Supports the anatomical and milling boundary for cereal aleurone and the low-starch/low-pericarp expectation for isolated tissue. It is not a universal grade, numeric purity threshold, product specification, measure, or health claim. |
| `WP02-A7-WHEAT-ALEURONE-FLOUR-R1048-20261019-S02` | Fenech et al., [“Aleurone flour is a rich source of bioavailable folate in humans”](https://pubmed.ncbi.nlm.nih.gov/10356074/), *The Journal of Nutrition* 129(6) (1999):1114–1119, DOI [10.1093/jn/129.6.1114](https://doi.org/10.1093/jn/129.6.1114). Abstract. | Identifies wheat aleurone flour prepared from isolated wheat aleurone cells and used to make cereal in a human-food study. Supports crop-qualified ingredient identity/use only; study servings, folate values, and trial results are not generic quantities or claims. |
| `WP02-A7-WHEAT-ALEURONE-FLOUR-R1048-20261019-S03` | Fenech et al., [“Aleurone flour increases red-cell folate and lowers plasma homocyst(e)ine substantially in man”](https://pubmed.ncbi.nlm.nih.gov/15877875/), *British Journal of Nutrition* 93(3) (2005):353–360, DOI [10.1079/bjn20051377](https://doi.org/10.1079/bjn20051377). Abstract. | Documents bread made with aleurone flour in a human-food study. The study’s daily bread portion, ingredients, and clinical outcomes stay with that trial; none supplies a flour measure, generic use level, or health claim for this catalog entry. |
| `WP02-A7-WHEAT-ALEURONE-FLOUR-R1048-20261019-S04` | Keaveney et al., [“Postprandial plasma betaine and other methyl donor-related responses after consumption of minimally processed wheat bran or wheat aleurone, or wheat aleurone incorporated into bread”](https://pubmed.ncbi.nlm.nih.gov/25585164/), *British Journal of Nutrition* 113(3) (2015):445–453, DOI [10.1017/S0007114514003778](https://doi.org/10.1017/S0007114514003778). Abstract. | Directly distinguishes wheat bran and aleurone fractions and documents aleurone bread. It supports the ingredient boundary and food use only; study preparations, serving quantities, and physiological results remain scoped to the trial. |
| `WP02-A7-WHEAT-ALEURONE-FLOUR-R1048-20261019-S05` | Office québécois de la langue française, GDT: [“aleurone”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17067684/aleurone). | Supports the French base term `aleurone` and English equivalent. Its domain is biology, not Québec food labelling; it does not establish the proposed French compound as a preferred culinary name. |

## Decision

Recommend one generic, identity-only `wheat aleurone flour / farine d’aleurone de blé` reference, with a provisional French display and no aliases, forms, measures, recipes, conversions, yields, or substitutions. Preserve all current wheat-bran, wheat-bran-flour, wheat-germ, wheat-meal, and branded-product rows and their source-specific evidence. Keep the A7 parent open.
