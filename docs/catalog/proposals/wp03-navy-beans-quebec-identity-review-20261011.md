# WP03 Section H — Navy beans and Québec French identity review

- **Reviewed:** 2026-10-11
- **Packet type:** root-reviewed identity proposal
- **Scope:** Navy/white-pea bean identity, Québec and Canadian naming, class boundaries, current normalized-key ownership, matcher behavior, legacy/ledger state, and all manifest-listed recipe ingredient rows.
- **Write scope at proposal preparation:** proposal only. Root integration is recorded below.
- **Plan state:** the Navy/white-pea identity item is integrated; broader Section H coverage remains open. Great Northern and Cannellini are active references.
- **Proposal-local source IDs:** `WP03-H-NAVY-20261011-S01` through `S06`; these are not ledger records.

## Recommendation

**Promote the existing `ingredient-ref-navy-beans` legacy candidate as an identity-only `LEGUME_AND_PULSE` reference** for the mature dry edible Navy/pea bean market class of *Phaseolus vulgaris*.

Use displays **`navy beans` / `haricots Navy`**. Québec French `Haricots Navy` is the current Metro product name; Statistics Canada's 2026 French crop survey separately labels the class `haricots secs ronds blancs Navy (pea beans)`. OQLF's preferred French term is singular `petit haricot blanc`; keep that exact narrow term as an alias, while retaining `haricots Navy` as the display so a plural display does not contain the broad legacy key `haricots blancs`. [S01–S03]

Activate only source-supported narrow English aliases `navy bean`, `white pea bean`, and `white pea beans`, plus singular French `petit haricot blanc`. Do not alias generic `white beans / haricots blancs`, pluralized `petits haricots blancs`, Great Northern, Cannellini/white kidney, red kidney, or dried yellow peas. The singular OQLF phrase does not collide with the current generic legacy display `haricots blancs` under the repository matcher; however, do not assign the exact singular alias `haricot blanc` to a future generic white-bean row, since that would collide with the Navy alias. [S01–S05, repository matcher behavior]

The complete corpus contains no Navy line. Add no forms, measures, density, unit mappings, conversions, yields, substitutions, or recipe links.

## Proposed row

| Field | Recommendation | Evidence and limit |
|---|---|---|
| Candidate ID | `ingredient-ref-navy-beans` | Reuse the existing unreviewed legacy candidate ID. |
| English display | `navy beans` | OQLF and Canadian crop sources identify Navy as a dry-bean class; current Metro English retail title uses `Navy Beans`. [S01–S03] |
| Québec French display | `haricots Navy` | Current Metro Québec listing uses this exact product name; Statistics Canada uses the fuller class description `haricots secs ronds blancs Navy (pea beans)`. [S02, S03] |
| Botanical identity | *Phaseolus vulgaris* | OQLF's Navy entry and AAFC's Canadian dry-bean profile give this species. [S01, S04] |
| Product boundary | Mature dry edible Navy/pea beans | AAFC describes Navy among Canadian dry-bean market classes; StatCan distinguishes dry white-pea Navy beans from dry field peas. No app form is proposed. [S02, S04] |
| Category | `LEGUME_AND_PULSE` | The sources classify Navy as an edible dry common bean. [S01, S04, S05] |
| English aliases to activate | `navy bean`; `white pea bean`; `white pea beans` | OQLF lists `navy bean` and `white pea bean`; AAFC also refers to Navy as white or white pea beans. [S01, S04] |
| French alias to activate | `petit haricot blanc` | This is OQLF's preferred singular term for Navy. Keep the qualifier `petit`; do not add the broad `haricot blanc` or the plural `petits haricots blancs`. [S01] |
| Numeric/form data | None | No Navy-specific measures, conversions, yields, density, or recipe demand are established here. |

## Identity, naming, and class boundaries

### Source facts

- OQLF's 1991 GDT entry gives preferred French `petit haricot blanc`, English `navy bean` and `white pea bean`, and Latin *Phaseolus vulgaris*. Its note says Navy is pea-sized and kidney-shaped, and that many varieties fall under the wider `haricot blanc` category, including Navy, Great Northern, and cranberry bean. A separate OQLF entry warns not to confuse Navy (`petit haricot blanc`) with `haricot blanc fin` / small white bean. [S01, S06]
- Statistics Canada's 2026 Field Crop Survey lists `dry beans, white pea (Navy)` separately from Great Northern and separately from `dry field peas -- yellow` and green dry field peas. The French survey uses `haricots secs ronds blancs Navy (pea beans)` and lists yellow field peas as a separate crop. [S02]
- Agriculture and Agri-Food Canada's 2017 *Crop Profile for Dry Bean in Canada* identifies dry bean as *Phaseolus vulgaris* and lists Navy (also referred to as white or white pea beans) as a market class distinct from Great Northern and kidney classes, including white kidney. [S04]
- USDA AMS standards define beans for these classes as dry-threshed edible field and garden beans and list Pea/Navy, Great Northern, Small White, Flat Small White, White Kidney, light red kidney, dark red kidney, and Yellow as separate classes. [S05]
- Metro Canada currently lists Cedar Phoenicia `Haricots Navy` in French and `Navy Beans` in English. Its French page places the dry package under dried beans. [S03]

### Review interpretation

These sources support Navy as a distinct white-seeded dry common-bean market class, not a synonym for all white beans or for yellow peas. Navy and Great Northern, Cannellini/white kidney, and red kidney can all be discussed as beans but remain distinct reference identities. The “pea” in `pea bean` is part of a bean-class name; it does not make Navy a *Pisum* field pea.

Use the narrow French retail label `haricots Navy` for the display. OQLF's preferred French term `petit haricot blanc` is supported and useful as a singular alias, but do not pluralize it into `petits haricots blancs`: that phrase contains the generic `haricots blancs` search key and would return both identities if the generic white-bean candidate is later activated. Keep the singular exact phrase distinct from any future unqualified `haricot blanc` alias on that generic row.

## Current repository preflight

Snapshot checked in the merge-time tree on 2026-10-11, after Great Northern and Cannellini integration. Counts are a snapshot and may change as other reviews merge.

| Artifact | Current state relevant to this review |
|---|---|
| Active ingredient references | 940 references. No active Navy reference, display, or alias. Great Northern, Cannellini, `kidney beans / haricots rouges`, and `dried yellow peas / pois jaunes séchés` are active as separate identities. |
| Active forms | 52 forms. No Navy, white-pea-bean, generic-white-bean, Great Northern, Cannellini, kidney-bean, or dried-yellow-pea form matched the normalized search. |
| Legacy candidates | 75 candidates. Navy remains unreviewed as `ingredient-ref-navy-beans` (`navy beans / haricots navy`), with no aliases. Generic `ingredient-ref-white-beans` (`white beans / haricots blancs`) is also unreviewed. The Cannellini candidate is still present as an unreviewed legacy entry even though Cannellini is now active; treat it as a stale legacy duplicate, not a second identity. |
| Research ledger | 1,204 records and 8 unit-conversion entries. The Navy candidate record is `identityState: unreviewed`, has no sources, and leaves measurements and substitutions `not_yet_researched`. The ledger has verified records for Great Northern and Cannellini; the kidney reference and generic white-bean candidate remain unreviewed. No Navy-specific measurement or substitution evidence is present. |
| Forms, units, yields, and substitutions | 30 unit definitions, one unrelated package-yield entry, and no global or contextual substitution rules. No Navy density, unit mapping, conversion, or yield exists. |
| Manifest-listed recipes | All 114 recipe files exist; the complete corpus has 1,123 ingredient rows. No Navy, white-pea-bean, Great Northern, Cannellini, generic-white-bean, or `haricots Navy` recipe line was found. Related rows are recipe 034's `540 ml kidney beans, rinsed and drained` (linked to `ingredient-ref-kidney-beans`) and recipe 105's `2 cups dried yellow peas` (linked to `ingredient-ref-yellow-peas`). |
| Prior review context | `docs/catalog/batches/plant-legumes-pulses.md` leaves Navy/white pea for its own bilingual review and states that `haricot blanc` covers multiple varieties. The Great Northern and Cannellini reviews keep Navy distinct. No earlier Navy-specific proposal was found. The live Section H checklist still has the white/Navy work open. |

### Normalized-key and matcher audit

The audit compared lowercased, accent-folded normalized exact keys across active reference displays/aliases and form labels/match terms, then checked legacy candidates and ledger IDs. Current ownership:

| Key family | Current exact owner/state | Integration guidance |
|---|---|---|
| `navy beans`; `navy bean`; `haricots navy`; `haricot navy` | No active ref or form owns these keys. The plural displays `navy beans / haricots navy` belong only to the unreviewed Navy legacy candidate. | Reuse the candidate ID and promote one row. |
| `white pea bean(s)` | No active ref/form exact owner. OQLF/AAFC source these as Navy names. | Safe as narrow English aliases; they do not contain the complete generic phrase `white beans`. |
| `petit haricot blanc` | No active ref/form exact owner; source-attested by OQLF. | Safe against the current generic legacy display `haricots blancs` because the exact tokens differ in number. Keep `petit` and forbid an unqualified `haricot blanc` alias on the generic row. |
| `white beans`; `haricots blancs` | No active ref/form owner. Both are on the unreviewed legacy `ingredient-ref-white-beans` candidate. | Do not alias these to Navy. A plural Navy alias/display `petits haricots blancs` would contain the generic phrase and collide. |
| Great Northern, Cannellini, kidney, and dried-yellow-pea keys | Active owners are respectively `ingredient-ref-great-northern-beans`, `ingredient-ref-cannellini-beans`, `ingredient-ref-kidney-beans`, and `ingredient-ref-yellow-peas`; their displayed keys are separate from Navy. | Keep each identity separate; do not add any of these names as Navy aliases. |

The repository matcher in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` normalizes case, accents, and punctuation, returns complete word-phrase matches first, and uses substring matching only if no phrase matches. Thus proposed `haricots Navy` and singular `petit haricot blanc` do not match the current generic legacy term `haricots blancs`; the plural `petits haricots blancs` would match the generic phrase and is excluded. A future generic alias `haricot blanc` would collide with the OQLF singular Navy term and must not be introduced without changing the collision strategy. Very broad searches such as `bean`, `beans`, `haricot`, or `haricots` can naturally return multiple bean identities; these are not evidence for merging them.

## Forms, measures, conversions, yields, substitutions, and recipe links

- The identity review supports Navy as a dry edible bean class, but this packet does not propose active dry, cooked, canned, drained, or other form rows.
- The Metro package listing is market-label evidence only; no portion weight, density, dry-to-cooked conversion, drained-can yield, or recipe measure is taken from it.
- The recipe scan has no Navy line and supplies no quantity or context for a recipe link or substitution.
- Add no unit mapping, conversion, package yield, density, global substitution, contextual substitution, or recipe link. These remain unavailable for this candidate.

## Source-to-claim register

All online sources below were accessed **2026-10-11**. Limits distinguish direct source facts from this review's naming and catalog recommendations.

| Source ID | Direct source and locator | Claim used | Limit |
|---|---|---|---|
| `WP03-H-NAVY-20261011-S01` | Office québécois de la langue française, [*petit haricot blanc*, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083589/petit-haricot-blanc), updated 1991; preferred term, English terms, Latin name, and white-bean note. | Preferred French term `petit haricot blanc`; English `navy bean` / `white pea bean`; *Phaseolus vulgaris*; notes the broad white-bean category and distinguishes Navy among its varieties. | Terminology and morphology entry, not a current retail label or a bean-grading standard. |
| `WP03-H-NAVY-20261011-S02` | Statistics Canada, [2026 Field Crop Survey — June, English](https://www.statcan.gc.ca/en/statistical-programs/instrument/3401_Q2_V9) and [French](https://www.statcan.gc.ca/fr/programmes-statistiques/instrument/3401_Q2_V9), 2026 seeding question, English/French crop lists. | Separates white pea/Navy dry beans from Great Northern and dry field peas (green/yellow); French class wording includes `haricots secs ronds blancs Navy (pea beans)`. | Crop survey categories support agricultural identity and terminology; they do not establish a recipe measure or every retail synonym. |
| `WP03-H-NAVY-20261011-S03` | Metro Canada, [Cedar Phoenicia Haricots Navy](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/feves-sechees/haricots-navy/p/062356507404) and [Cedar Phoenicia Navy Beans](https://www.metro.ca/en/online-grocery/aisles/pantry/pasta-rice-beans/dried-beans/navy-beans/p/062356507404). | Current Quebec French and Canadian English product titles use `Haricots Navy` / `Navy Beans`; the French page places the product under dried beans. | Dynamic retailer listings support market wording only; product size and availability are not ingredient measures or a terminology ruling. |
| `WP03-H-NAVY-20261011-S04` | Agriculture and Agri-Food Canada, [*Crop Profile for Dry Bean in Canada, 2015*, second edition 2017](https://publications.gc.ca/collections/collection_2017/aac-aafc/A118-10-4-2015-eng.pdf), PDF p. 1 (viewer p. 5), “Crop Profile for Dry Bean in Canada.” | Identifies dry bean as *Phaseolus vulgaris* and lists Navy (also white or white pea beans) as a Canadian dry-bean market class, distinct from Great Northern and kidney classes. | Agricultural market-class profile; production background is dated and not used for current demand or nutrition claims. |
| `WP03-H-NAVY-20261011-S05` | USDA Agricultural Marketing Service, [Beans, Grades and Standards](https://www.ams.usda.gov/grades-standards/beans), §§101–102. | Defines the relevant bean product as dry-threshed edible beans and lists Pea/Navy separately from Great Northern, several white-bean classes, kidney classes, and Yellow beans. | U.S. commodity-grade taxonomy corroborates class boundaries but does not set Québec French naming. |
| `WP03-H-NAVY-20261011-S06` | Office québécois de la langue française, [*haricot blanc fin*, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296957/haricot-blanc-fin), updated 1991, note distinguishing it from `petit haricot blanc`. | Supports excluding `haricot blanc fin` / small white bean from Navy aliases. | Historical terminology entry; does not identify an active app form or package. |

## Integration guardrails

1. Recheck active normalized keys, forms, ledger state, and all manifest-listed recipes at merge time.
2. If accepted, promote `ingredient-ref-navy-beans` once as an identity-only `LEGUME_AND_PULSE` reference with displays `navy beans / haricots Navy`.
3. Activate only the source-supported English singular/plural aliases `navy bean`, `white pea bean`, and `white pea beans`, plus the qualified OQLF French alias `petit haricot blanc`.
4. Keep `white beans / haricots blancs`, plural `petits haricots blancs`, unqualified `haricot blanc`, and `haricots secs ronds blancs Navy` inactive. Do not assign the broad singular `haricot blanc` to a generic white-bean row if the OQLF Navy alias remains active.
5. Keep Great Northern, Cannellini/white kidney, red kidney, yellow peas, and other pea/bean identities separate; add no forms, measures, densities, mappings, conversions, yields, substitutions, or recipe links.

## Root integration outcome

Accepted and integrated on 2026-10-11 after root rechecking current exact-key ownership, matcher behavior, the manifest-listed recipe corpus, and the cited OQLF, Statistics Canada, AAFC, USDA, and Québec retail evidence. Promoted `ingredient-ref-navy-beans` as an identity-only `LEGUME_AND_PULSE` reference with `navy beans / haricots Navy`, English aliases `navy bean`, `white pea bean`, `white pea beans`, and the single qualified French alias `petit haricot blanc`. No form, measure, density, unit mapping, conversion, yield, substitution, or recipe link was added. The research ledger now marks its identity `verified`; measurement and substitution research remain `not_yet_researched`. See the 942-reference integration checkpoint in [`../batches/wp02-wp03-wp04-sweetener-pulse-insect-integration-20261011/README.md`](../batches/wp02-wp03-wp04-sweetener-pulse-insect-integration-20261011/README.md).
