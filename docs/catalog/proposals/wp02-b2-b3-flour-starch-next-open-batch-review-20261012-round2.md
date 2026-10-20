# WP02 B2 — Brazil-nut flour identity boundary review

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No shared catalog, ledger, checklist, roadmap, workflow, recipe, or generated file was changed.
- **Scope:** One new B2 seed-derived flour candidate: Brazil-nut flour. This review does not reopen the whole Brazil-nut or Brazil-nut-butter identities, nor any previously reviewed or held flour/starch candidate.
- **Source IDs:** `WP02-B2-BRAZIL-NUT-FLOUR-20261012-S01` through `S06`. The prefix was checked against the existing ledger and proposal/batch archive before drafting; it was absent.

## Recommendation

**Record Brazil-nut flour as a real but unresolved product candidate; hold an active reference until its milling and oil-press-cake scopes, and the Québec French flour name, are resolved together.** Canadian import nomenclature recognizes a Brazil-nut flour/meal/powder class. Product sources describe flour as finely ground Brazil nuts but do not say whether those nuts were pressed first; Embrapa and a later food-science study explicitly describe flour made from ground oil-press cake. The available sources do not establish whether these should be one catalog identity with process forms or separate identities. OQLF establishes `noix du Brésil` for the nut, not a flour-specific headword. [S01–S06]

This is an evidence-based catalog hold, not a claim that Brazil-nut flour is unreal or unavailable as food. If later accepted, use a new `FLOUR_AND_STARCH` identity, distinct from `ingredient-ref-brazil-nut` and `ingredient-ref-brazil-nut-butter`. Do not assign `ingredient-ref-brazil-nut-flour` or store aliases in this proposal-only batch.

| Candidate wording or behavior | Disposition | Boundary |
|---|---|---|
| `Brazil nut flour` | **Candidate; no active reference yet.** | Real product class, but sources use the wording for finely milled edible kernels and for flour made from oil-press cake. Resolve product scope before assigning one unqualified key. [S03–S06] |
| `ground Brazil nut flour` | Keep as source evidence, not an accepted alias yet. | A retailer uses this exact product title and says it is made from finely ground Brazil nuts, but its page does not state whether the product was pressed or defatted first. [S04] |
| `partially defatted Brazil nut flour` / oil-press-cake flour | Keep as a separately documented process candidate. | Embrapa and a later food-science study describe flour made from pressed cake; do not silently treat it as equivalent to a whole-kernel milled product or add it as an alias/form before the identity boundary is settled. [S05–S06] |
| `farine de noix du Brésil` | Provisional translation only; no active display or alias. | OQLF supports the base term `noix du Brésil`; CFIA’s French import nomenclature places Brazil-nut flour, meal, and powder under `Farine, semoule et poudre : Noix du Brésil`. Neither is a Québec consumer label for flour. [S01–S02] |
| OQLF alternatives `châtaigne du Brésil` and `noix de Para` | Do not add. | OQLF lists these for the nut, not for flour; the chestnut wording can also pull searches toward chestnut flour. [S01] |
| `Brazil nut powder`, `Brazil nut meal`, Portuguese `farinha de castanha-do-Pará` / `farinha de castanha-do-Brasil`, and literal French variants | Leave unassigned. | Sources use different product titles and process descriptions. None establishes a Québec flour alias with a stable scope. [S02–S06] |
| Forms, measurements, density, unit mappings, recipe links, or substitutions | **No activation.** | The sources are either product-specific or experimental; they do not yield a reusable household measure, density, unit mapping, or replacement rule. [S03–S06] |

## Identity and alias evidence

OQLF pairs English `Brazil nut` with preferred French `noix du Brésil` and identifies the nut as *Bertholletia excelsa*. The same OQLF entry also lists `châtaigne du Brésil` and `noix de Para`; neither term is flour-specific, so neither is proposed for flour search. [S01]

CFIA’s 2024 SARI update lists separate import codes for conventional and organic `Farine, semoule et poudre : Noix du Brésil` (11.06.30.7113.01 and .02). This is useful Canadian bilingual product-class evidence, but it is a customs classification: it groups flour, semolina, and powder, and says nothing about whole-kernel milling versus oil extraction. It does not establish a retail label or recipe use. [S02]

Two product pages demonstrate the process gap. IBY Foods’ `Farinha de Castanha do Pará` page gives Brazil nut (`Castanha do Brasil`) as the ingredient, a 220 g package, and culinary uses; it does not state whether the nuts were pressed before milling. Sumano likewise describes its `Farinha de Castanha do Brasil` as Brazil-nut powder and lists baking uses without clarifying oil removal. A separate retailer calls its item `Ground Brazil Nut Flour` and describes it as finely ground Brazil nuts, but does not publish a process specification. These pages establish real food products and their names; they do not prove a common processing scope or Québec French wording. [S03–S04]

The process distinction is explicit in primary and technical sources. Embrapa describes roasting, pressing kernels into cake, and refining that cake into partially defatted Brazil-nut flour. A 2026 cookie study similarly heats Brazil-nut kernels, presses them three times, and mills the resulting cake as Brazil-nut flour. The primary study’s broad English product term therefore does not, by itself, prove that it is the same material as a retail flour described only as ground nuts. [S05–S06]

The active nearby identities stay distinct:

- `ingredient-ref-brazil-nut` — `Brazil nut / noix du Brésil`, category `NUT_SEED_AND_DRIED_FRUIT`.
- `ingredient-ref-brazil-nut-butter` — `Brazil nut butter / beurre de noix du Brésil`, category `FAT_AND_OIL`.
- No flour reference, form, legacy candidate, or ledger identity currently owns the full flour phrases audited below.

## Forms, measurements, density, and substitutions

No active form is proposed. Fine milling is already inherent in flour, while partial defatting is a materially different input process whose catalog representation (separate identity versus form) remains unsettled. Do not attach either product to the whole-nut row as a `ground` form.

The 220 g IBY package size is not a kitchen measure. The 2026 cookie study’s 10 g and 20 g flour-in-blend levels per 100 g of its specific dry flour blend are experimental formulation amounts, not household conversions. Its 1 g flour / 20 mL water-or-oil laboratory functional-capacity test is not a density or recipe ratio. None of the reviewed sources gives a general g/mL bulk density or mass per cup. Keep default density null and unit mappings empty if an identity is later integrated; keep measurement research `not_yet_researched` unless a broader source review resolves the product variants. [S03, S06]

No source establishes a reusable substitution. The experimental 0%, 10%, and 20% press-cake flour cookie formulations adjust several other blend components and water; they do not prove a transferable replacement ratio for wheat flour, almond flour, or another nut flour. A retailer’s broad description of ground Brazil-nut flour as a gluten-free flour alternative gives no denominator, amount, or tested recipe-level rule. Do not add a global or contextual substitution. [S04, S06]

## Exact-key ownership and recipe demand

Read-only snapshot from the shared worktree on 2026-10-12. Exact-key lookup used Unicode decomposition, accent folding, case folding, punctuation normalization, and whitespace collapse across active reference names/aliases, form labels/match terms, and legacy candidate names/aliases.

| Surface | Count | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,301 | `31d9c40fa87becc6679935fbac3e512bdd7d6e856fb3e3c340662f0b19744a59` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research-ledger records | 1,609 | `c2d17dc6c93ed2f5926e023fc4da7d840ec265fd130b61f98b6dbd0054f0e66e` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

No exact owner exists for `Brazil nut flour`, `ground Brazil nut flour`, `Brazil nut meal`, `Brazil nut powder`, `defatted Brazil nut flour`, `partially defatted Brazil nut flour`, `farine de noix du Brésil`, `farine de châtaigne du Brésil`, `farine de noix de Para`, or the reviewed Portuguese flour names. The shorter `Brazil nut` / `noix du Brésil` and the product phrase `Brazil nut butter` / `beurre de noix du Brésil` remain owned by the separate identities above. A proposal/batch archive search found no prior WP02 Brazil-nut-flour review or matching source-ID prefix; the earlier WP06 nut identity and WP03 nut-butter review do not cover flour.

All 114 manifest-listed recipe JSON files and 1,123 ingredient rows were scanned. The folded candidate flour phrases above produced zero full-recipe and zero ingredient-row hits; a separate scan for `Brazil`, `Brésil`, and `castanha` also found no recipe file hits. There is no ingredient-row demand, existing Brazil-nut flour ID link, measure, or recipe-level substitution evidence. Recipe aggregate fingerprint: `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

## Proposal-only result and remaining gaps

Keep WP02 B2/B3 open and record this new candidate as unresolved if the coordinator chooses to integrate review evidence. Do not create an active ingredient reference, alias, form, density, mapping, recipe link, or substitution from this packet alone. No tests were run because this proposal-only review did not change database JSON or application code.

Before promoting the candidate, resolve:

- whether the catalog should represent ground-kernel and partially defatted press-cake flour as distinct references or as process forms;
- whether a Québec/Canadian consumer label or terminology source supports a stable French product name for each scope;
- whether any source supplies a transferable household measure or bulk density; none is established here;
- whether a recipe-specific or general substitution rule exists; none is established here.

## Sources

All pages were accessed on 2026-10-12. Source IDs are proposal-local and were checked against the current ledger and proposal archive before drafting.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2-BRAZIL-NUT-FLOUR-20261012-S01** | Office québécois de la langue française, [noix du Brésil (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296932/noix-du-bresil). Gives preferred French `noix du Brésil`, English `Brazil nut`, and *Bertholletia excelsa*; lists `châtaigne du Brésil` and `noix de Para` as additional terms. | Nut terminology only; no flour product name, process, measure, or density. |
| **WP02-B2-BRAZIL-NUT-FLOUR-20261012-S02** | Canadian Food Inspection Agency, [ACIA-SARI update (2024-12-02)](https://inspection.canada.ca/fr/importation-aliments-vegetaux-ou-animaux/vegetaux-produits-vegetaux/sari/mises-jour-acia-sari-2024-12-02). Lists 11.06.30.7113.01 and .02 as `Farine, semoule et poudre : Noix du Brésil`, with a separate organic code. | Import classification groups flour, meal/semolina, and powder; it does not specify consumer wording, fat extraction, or Québec usage. |
| **WP02-B2-BRAZIL-NUT-FLOUR-20261012-S03** | IBY Foods via Empório Manjericão, [Farinha de Castanha do Pará](https://www.loja.emporiomanjericao.com.br/farinhas-6.html/farinha-de-castanha-do-brasil-iby-foods--p). Product page names Brazil-nut flour, lists a 220 g package and culinary use, and gives Brazil nut as its ingredient. | Brazilian retailer; page showed unavailable at access, and it does not describe pressing, defatting, particle size, a household measure, or a Québec French label. |
| **WP02-B2-BRAZIL-NUT-FLOUR-20261012-S04** | Oh! Nuts, [Ground Brazil Nut Flour](https://ohnuts.com/products/ground-brazil-nut-flour). Exact product title; description says it is made from finely ground Brazil nuts and suggests baking/cooking use. | US retailer copy; no process specification or transferable flour-replacement ratio. |
| **WP02-B2-BRAZIL-NUT-FLOUR-20261012-S05** | Embrapa Amazônia Oriental, [Study of the Process for Roasting Brazil Nuts in Order to Prepare Partially Defatted Flour (PDF)](https://www.infoteca.cnptia.embrapa.br/infoteca/bitstream/doc/998892/1/BPD43.pdf). Describes roasting kernels, pressing to obtain cake, then refining the cake into partially defatted flour. | Technical process report; supports a product boundary, not current Québec retail terminology, household measure, density, or substitution. |
| **WP02-B2-BRAZIL-NUT-FLOUR-20261012-S06** | Fabri et al., [Brazil Nut Flour as a Functional Ingredient (2026)](https://aocs.onlinelibrary.wiley.com/doi/10.1002/aocs.70038), *Journal of the American Oil Chemists’ Society* 103(3):185–196. Explicitly describes Brazil-nut flour made from thrice-pressed kernel cake, ground to 590 μm; tests it in one gluten-free reduced-sugar cookie blend at 10% and 20% of the flour/starch mix. | One lab process and formulation; does not define all commercial Brazil-nut flour, provide a household measure or density, or establish a general substitution rule. |
