# WP05 Section X — Lao padaek identity reassessment

**Packet type:** proposal-only current-state and terminology reassessment

**Reviewed and source access date:** 2026-10-12

**Scope:** the Lao padaek / pa daek / padek identity, its requested Section X overlap, regional-product boundaries, Québec French wording, and exact demand in the current bundled recipes.

**Write scope:** this file only. This reassessment made no edits to the canonical catalog, ledger, plan, workflow, batch, or roadmap. No tests or emulator checks were run.

## Finding and disposition

The expected “not already active” condition does not hold. The live reference catalog already contains `ingredient-ref-padaek`, with English display `padaek`, Québec French display `sauce padaek`, English alias `pa daek`, and French alias `padek`. The Section X plan marks this item complete and points to [`wp05-padaek-identity.md`](../batches/wp05-padaek-identity.md). The focused 2026-10-08 proposal [`wp05-east-southeast-asian-pantry-batch-20261008.md`](wp05-east-southeast-asian-pantry-batch-20261008.md) records its integration. Later fish-sauce and fermented-paste reviews also preserve the identity and its boundaries. Padaek is therefore covered by a focused proposal and is not a new candidate waiting only for the broad WP05 gap mention.

| Current field | Live value | Reassessment |
|---|---|---|
| ID | `ingredient-ref-padaek` | Retain; do not propose a duplicate ID. |
| English display | `padaek` | Retain. |
| fr-CA display | `sauce padaek` | Retain as source-attested Québec recipe wording; do not claim standardization. |
| English alias | `pa daek` | Retain as the JIRCAS-attested spacing variant. |
| fr-CA alias | `padek` | Retain as a spelling used by Télé-Québec. |
| Category | `SAUCE_AND_CONDIMENT` | Retain. |
| Numeric fields | `defaultDensity: null`; `unitMappings: []` | Retain; no new measurement evidence is established here. |

A separately searchable Lao product identity is justified by authoritative Lao-focused research using *pa daek* for a widely used Lao salt-fermented freshwater-fish seasoning and by Québec recipe evidence that requests it separately from generic fish sauce. That identity already exists. This review recommends **no additional padaek identity, no alias expansion, and no canonical changes**. The broad Section X sweep of other Lao and regional products remains open.

## Product boundaries

- **Generic fish sauce:** keep it separate from padaek. JIRCAS describes pa daek as a freshwater-fish paste. In its sai oua recipe, Télé-Québec separately lists 125 mL of `sauce poisson` and 45 mL of `sauce padaek`, and later uses more `sauce poisson`; its note calls padaek non-filtered. This is direct, recipe-specific evidence that the names can denote separate requested ingredients. It does not establish that every product marketed as fish sauce has one texture or formulation. Do not add `fish sauce`, `sauce de poisson`, or broad translations such as `Lao fish sauce` as aliases to padaek.
- **Thai pla ra:** it is a close regional counterpart in the same broader family of salty-fermented freshwater-fish seasonings, so avoid claiming that it is an unrelated product. JIRCAS’s comparative work associates *pla-ra* with Thailand and *pa-daek* with Laos and analyzes samples from both. A peer-reviewed microbial study also uses the combined term `pla-ra/pa-daek` for its research scope. Those broad scientific usages show relationship and technical overlap; they do not establish that the names are interchangeable on every market product or in every recipe. Keep `pla ra` off the active Lao aliases. If an exact Thai pla ra request appears, review it as a Thai-named candidate with its own sources.
- **Cambodian prahok:** keep it separate. Cambodia-focused scholarship treats *prohok/prahok* as an essential Khmer fermented-fish product, with its own production, cuisine, and product variation. Similar fish-and-salt fermentation is not an alias rule.
- **Shrimp pastes:** keep these outside the padaek identity. Padaek evidence identifies freshwater fish; the official Cambodia visitor guide explicitly distinguishes pra-hok as fermented fish paste from kapi as fermented prawn paste. The active Thai Kapi row is independently tracked in the [WP05 Kapi integration checkpoint](../batches/wp05-kapi-shrimp-paste.md). Shared regional use or fermentation does not make shrimp products aliases for a Lao fish product.

These sources do not define one universal pa daek recipe or a boundary based on a single texture or grain additive. JIRCAS reports variation, while the Télé-Québec note names wheat bran and research sources discuss rice bran or roasted rice. This packet does not promote any single formulation, form row, conversion, or substitute.

## Québec French wording

Télé-Québec Cuisinez uses `sauce padaek` in its ingredient list and explanatory note, and writes “padaek ou padek (ou sauce padaek).” It is a Québec public-broadcaster recipe source and direct evidence for the borrowed name with the French classifier `sauce`. Its same recipe distinguishes that wording from `sauce poisson`. This supports retaining the current fr-CA display `sauce padaek` and alias `padek`.

Targeted OQLF and TERMIUM searches did not locate an entry for *padaek*, *pa daek*, or *padek*. This is a bounded search result, not proof that no terminology record exists. No standardized French translation is proposed. Keep the regional name visible; do not substitute generic `sauce de poisson` as a padaek alias.

## Exact recipe demand

The current bundled corpus contains 114 recipe JSON files and 1,123 ingredient rows. A case-insensitive scan for `padaek`, `pa daek` (including spacing variants), and `padek` found **zero exact recipe-row matches**. No recipe link or new recipe demand is proposed.

Two existing rows ask only for generic `fish sauce`, both already linked to `ingredient-ref-fish-sauce`:

- `093-riz-frit-fried-rice`: `2 tbsp fish sauce`.
- `095-satay`: `1 tbsp fish sauce`.

These generic requests are not evidence for padaek and remain outside this proposal.

## Sources

All sources below were accessed on **2026-10-12**.

| Source | Use and limits |
|---|---|
| Japan International Research Center for Agricultural Sciences (JIRCAS), [Assessment of usage and fermentation-related components of pa daek](https://www.jircas.go.jp/en/publication/jircas_working_report/90/89) (2020) | Direct Lao-focused research: identifies pa daek as salt-fermented freshwater-fish paste, all-purpose seasoning, and locally made/marketed product; documents variation. Supports identity and spelling, not a universal recipe or conversion. |
| Khaosan Pathet Lao (Lao News Agency), [Vientiane Province](https://kpl.gov.la/EN/detail.aspx?id=79553) | Lao tourism reporting calls the heavily salted, fermented fish product `pa daek`; regional evidence, not a product standard. |
| Télé-Québec Cuisinez, [Sai oua – Boulettes de porc](https://cuisinez.telequebec.tv/recettes/8042/sai-oua-boulettes-de-porc) | Québec French usage for `sauce padaek` and `padek`; describes it as non-filtered and lists it separately from `sauce poisson` in one recipe. Its wheat-bran note is not treated as a universal formula. |
| JIRCAS, [Importance of salt concentration and long-term fermentation in salty-fermented freshwater fish paste in Thailand and Laos](https://www.jircas.go.jp/en/publication/research_results/2014_c04) | Comparative technical research on Thai pla-ra and Lao pa-daek products; supports close regional relation, product variation, and a shared broad research family. It does not provide a recipe-level synonym rule. |
| Marui et al., [Culture-independent bacterial community analysis of the salty-fermented fish paste products of Thailand and Laos](https://www.jstage.jst.go.jp/article/bmfh/34/2/34_2014-018/_article) (2015) | Peer-reviewed study uses pla-ra/pa-daek collectively for its sampling and microbiology. That technical grouping is recorded as evidence of overlap, not interchangeable catalog aliases. |
| LeGrand, Borarin & Young, [Tradition and Fermentation Science of prohok, an ethnic fermented fish product of Cambodia](https://link.springer.com/article/10.1186/s42779-019-0027-1) (2020) | Cambodia-focused study documents prohok/prahok as a named Khmer product and describes its uses and variation; supports keeping the Cambodian identity separate. |
| Cambodia Francophonie 2026, [Information for Visitors](https://www.francophonie2026.gov.kh/en/InformationForVisitor) and [French version](https://www.francophonie2026.gov.kh/fr/InformationForVisitor) | Official bilingual visitor information distinguishes pra-hok as fermented fish paste from kapi as fermented prawn paste. |
| Existing WP05 Kapi checkpoint, [Thai Kapi shrimp-paste integration](../batches/wp05-kapi-shrimp-paste.md) | Links the active Thai shrimp-paste identity to its Thai product standard and Canadian French evidence; retained as a separate product. |

## Handoff

Retain the existing `ingredient-ref-padaek` record and its current labels and scoped aliases. Treat this file as a focused reassessment of a candidate whose “not yet covered” premise was disproved by the live repository. Do not count it as completion of the broader Section X additional-products sweep.
