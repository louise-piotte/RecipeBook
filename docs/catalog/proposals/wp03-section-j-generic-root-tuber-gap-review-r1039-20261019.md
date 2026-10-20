# WP03 Section J R1039 — skirret identity review

- **Review date:** 2026-10-19
- **Status:** proposal only; no shared catalog JSON, ledger, recipe, plan, roadmap, checklist, or generated files changed
- **Recommendation:** accept one generic, identity-only root-vegetable reference for *Sium sisarum* L.
- **Open-plan anchor:** the broader Section J regional root/tuber discovery and independent Québec terminology review remain open at [plan line 6557](../../RecipeBook-global-ingredient-catalog-plan.txt#L6557). This covers one distinct identity only.
- **Scope:** edible roots of *S. sisarum*. No brand, product-line, flavour, SKU, retailer-variant, or commercial-roster work was researched.

## Candidate and identity boundary

| Field | Recommendation |
| --- | --- |
| Suggested ID | ingredient-ref-skirret |
| English display | skirret |
| fr-CA display | chervis |
| Species | *Sium sisarum* L. |
| Plant part | Edible roots only |
| Category | VEGETABLE_AND_AROMATIC |
| Aliases | none |
| Forms, measures, conversions, yields, substitutions | none proposed |

The OQLF’s Grand dictionnaire terminologique directly treats **chervis** as an edible-root vegetable, gives **skirret** as its English equivalent, and pairs both with *Sium sisarum* L. It also notes that the roots are consumed like salsify and describes their texture and central fibrous core. This directly supports the Québec French display, English display, species, and root-part boundary. [S01]

UF/IFAS Extension independently identifies skirret as a vegetable grown for its edible roots and describes boiling, stewing, and roasting. Its advice to remove the fibrous central core is a source-supported preparation observation, not a general substitution, yield, or measure. [S02]

Keep this identity separate from leafy chervil (*Anthriscus cerefolium*) and turnip-rooted chervil (*Chaerophyllum bulbosum*), which are different species and already have distinct active references. Keep it separate from parsnip (*Pastinaca sativa*) as well. The existing parsnip ledger record explains that the regional phrase `grand chervis` can refer to parsnip by resemblance, but explicitly rejects it as an unconditional alias. Do not transfer that phrase to this row or add it to the parsnip row. The OQLF’s exact term `chervis` is the supported display for *S. sisarum*. [S01, S03]

Do not include leaves, shoots, flowers, other *Sium* species, or processed preparations. Keep `grand chervis`, `water parsnip`, `sugar root`, and other loose common names out of aliases; the reviewed sources do not establish those terms as safe Québec picker keys for this species.

## Live ownership and recipe-demand audit

Current live files checked on 2026-10-19: **2,046 ingredient references, 205 ingredient forms, 55 legacy-import candidates, and 2,451 research-ledger records containing 11,464 source entries**. No active reference or alias owns `skirret`, `Sium sisarum`, or the proposed `chervis / skirret` pair. No matching legacy candidate or ledger identity/source allocation exists.

The active `ingredient-ref-parsnip` row is `parsnip / panais` with no aliases or forms. Its one ledger record contains the OQLF discussion of the resemblance-based regional term `grand chervis` and explicitly declines that alias. The active `ingredient-ref-chervil` row is `chervil / cerfeuil`, category HERB, with one fresh-herb form; it is not a root identity. `ingredient-ref-turnip-rooted-chervil` is the separate `turnip-rooted chervil / cerfeuil tubéreux` identity, with no aliases or forms. These rows and their evidence remain unchanged.

The current recipe package has 114 files and 1,123 ingredient rows. A scan found no `skirret`, `Sium sisarum`, or `chervis` text in recipe ingredients and no matching recipe demand for the existing chervil, turnip-rooted-chervil, or parsnip owners. No recipe link is proposed.

The open Section J item is generic regional-root discovery, not a commercial roster. The cross-category queue audit found no new root/tuber task whose only deliverable was a brand, product-line, flavour, SKU, or retailer-variant list. The plan’s previously dispositioned Section F commercial cereal rosters and named Anson Mills product-only lead remain out of scope because commercial-product counts do not add ingredient diversity. No such line was pursued here; existing branded rows and product-scoped evidence remain untouched. [S04]

## Numeric and substitution limits

Neither reviewed source establishes a household amount, count-to-mass conversion, volume measure, density, unit mapping, yield, or tested recipe substitution. UF/IFAS gives root lengths and cultivation timing in its horticultural description; these are not kitchen measures and must not be transferred. OQLF’s “like salsify” wording describes culinary handling, not ingredient equivalence. Keep measurement and substitution research states `not_yet_researched`; add no active forms, measurements, conversions, yields, recipe links, or substitution rules.

## Minimal proposed data

If accepted, add one reference row only:

- ID: `ingredient-ref-skirret`
- English name: `skirret`
- French name: `chervis`
- English aliases: `[]`
- French aliases: `[]`
- Default density: `null`
- Unit mappings: `[]`
- Category: `VEGETABLE_AND_AROMATIC`

Add no form, recipe link, measurement, conversion, yield, or substitution. Preserve the existing parsnip, leafy-chervil, and turnip-rooted-chervil references, forms, ledger decisions, and all branded entries unchanged.

## Evidence register

- **[S01]** Office québécois de la langue française, Grand dictionnaire terminologique, [*chervis*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095280/chervis), updated 1982; accessed 2026-10-19. Preferred French term `chervis`; English equivalent `skirret`; Latin equivalent *Sium sisarum* L.; definition specifies a plant with an edible root and the note describes root use and the fibrous central cylinder. Direct Québec terminology and edible-part evidence. Proposed sourceKind: `regional_authority`.
- **[S02]** James M. Stephens, UF/IFAS Extension, [*Skirret—Sium sisarum L.* (HS667)](https://www.growables.org/informationVeg/documents/Skirret.pdf), original publication 1994, revised 2015, reviewed 2018; accessed 2026-10-19. Extension handout identifies the species, edible root vegetable, and boiled/stewed/roasted uses; its plant dimensions, cultivation times, and core-removal note stay source-scoped and establish no kitchen measure or substitution. Proposed sourceKind: `other`.
- **[S03]** Existing live research-ledger record `ingredient-ref-parsnip`, source `WP03J-S02`, OQLF, [*panais*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/23797105/panais), accessed 2026-10-05. Says some regions use `grand chervis` for parsnip because of resemblance and rejects it as an unconditional alias. Boundary/alias evidence only; it does not assign `chervis` to parsnip or establish skirret identity. Reuse the existing record; do not create or alter ledger data in this proposal-only review.
- **[S04]** Existing plan queue dispositions at [lines 5107–5110](../../RecipeBook-global-ingredient-catalog-plan.txt#L5107) and current cross-category checkpoints. They keep commercial product rosters out of scope because commercial-product counts do not add ingredient diversity. Queue audit evidence only; it supports no ingredient identity.

The evidence supports one narrow generic *Sium sisarum* edible-root identity with an OQLF-backed Québec French display. Numeric behavior and substitutions remain unresearched, and Section J remains open.
