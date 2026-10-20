# WP03 Section F pearl millet–Bajra grain/flour boundary review

## Packet record

- **Reviewed:** 2026-10-10.
- **Status:** proposal only; no shared catalog, ledger, recipe, plan, roadmap, generated file, or test changed.
- **Scope:** source-qualified English names `bajra` and `bajra flour` on the already active pearl-millet grain and flour identities.
- **Recommendation:** accept two exact English aliases for integration review: `bajra` on `ingredient-ref-pearl-millet`, and `bajra flour` on `ingredient-ref-pearl-millet-flour`. Keep French aliases empty. Do not add an identity or form, measurements, conversions, yields, substitutions, or recipe links.

## Disposition and proposed catalog delta

The official Indian food standard uses *Bajra* as the parenthetical name for pearl millet in its whole/dehulled millet category, then defines *Bajra Flour (Pearl Millet Flour)* as a separate product milled from pearl millet grains [S01]. This resolves the qualified phrase `bajra flour` to the existing pearl-millet-flour identity while supporting bare `bajra` as a regional English food-grain name for the existing pearl-millet identity. The source does not support treating the grain and flour as one product.

| Existing ID | Existing English / fr-CA display | Proposed EN aliases | Proposed FR aliases | Disposition |
| --- | --- | --- | --- | --- |
| `ingredient-ref-pearl-millet` | `pearl millet` / `millet perlé` | `bajra` | none | Add only the source-qualified English grain alias. The official standard includes pearl millet (Bajra) in its whole/dehulled millet scope. |
| `ingredient-ref-pearl-millet-flour` | `pearl millet flour` / `farine de mil chandelle` | `bajra flour` | none | Add only the exact source-named flour alias. The official standard defines Bajra flour as a milling product of pearl-millet grains. |

No new ID or display name is proposed. Do not add `bajra` to the flour row, `bajra flour` to the grain row, or either term to generic `millet`, `grain sorghum`, or `sorghum flour`. Do not add unverified variants such as `bajri`, `bajree`, `bajra atta`, `sajje`, or `kambu`. The cited authority does not establish any of those exact aliases for the existing catalog rows.

## Exact query behavior

The repository search implementation prefers complete normalized word phrases anywhere within a term and returns every reference containing the phrase. I checked the behavior in memory using the current names plus the two proposed aliases; this is not an app picker test.

| Query | Result with proposed aliases | Interpretation |
| --- | --- | --- |
| `bajra` | `ingredient-ref-pearl-millet`; `ingredient-ref-pearl-millet-flour` | **Both grain and flour.** The short query is contained in the exact flour phrase as well as the grain alias. It must present both choices. |
| `bajra flour` | `ingredient-ref-pearl-millet-flour` only | The complete qualifier resolves to flour. |
| `pearl millet` | `ingredient-ref-pearl-millet`; `ingredient-ref-pearl-millet-flour` | Existing phrase behavior already returns both grain and the longer flour name. |
| `pearl millet flour` | `ingredient-ref-pearl-millet-flour` only | Existing qualified phrase resolves to flour. |
| `millet perlé` | `ingredient-ref-pearl-millet` only | Existing Québec display remains on the grain identity. |
| `farine de mil chandelle` | `ingredient-ref-pearl-millet-flour` only | Existing Québec flour display remains on the flour identity. |

This broad-query result is deliberate and visible in the existing `pearl millet` search behavior. The longer `bajra flour` query remains unambiguous. Because the matcher finds a query phrase inside longer terms, `bajra flour` alone would still make a bare `bajra` search return the flour row. If the coordinator does not want the two-row result, hold both proposed aliases; do not keep only the flour alias and silently make bare `bajra` mean flour.

## Live package, ledger, legacy, and collision audit

The current split package contains **880 active references and 48 forms**. Its manifest lists **114 recipes and 1,123 ingredient rows**. The research ledger contains **1,125 records and 2,762 source entries**; the legacy-import file has **77 candidates**. The two target IDs are already active and their ledger identity states are `verified`; both have `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`. Neither target has an attached form or numeric reference data. There is no separate active or ledger `bajra` reference, and no matching legacy candidate was found.

The targets remain distinct from the generic `ingredient-ref-millet / millet` reference and from `ingredient-ref-grain-sorghum / grain sorghum`. FSSAI's same millet listing names `Sorghum (Jowar)` as *Sorghum bicolor* separately from `Pearl Millet (Bajra)` [S01]; do not infer a relationship from those shared regional-food categories.

I checked candidate keys against active reference canonical names and aliases, form labels and match terms using `tools/seed_package/bundled_seed_package.py:normalize_search_key`. This is an exact normalized-key audit, not a runtime search or duplicate to do with phrase-containment behavior.

| Candidate key or ID | Current exact collision | Proposed target |
| --- | --- | --- |
| `bajra` | None | `ingredient-ref-pearl-millet` alias only |
| `bajra flour` | None | `ingredient-ref-pearl-millet-flour` alias only |
| `ingredient-ref-pearl-millet` | Existing target ID, unique | No ID change |
| `ingredient-ref-pearl-millet-flour` | Existing target ID, unique | No ID change |
| `bajri`, `bajree`, `bajra atta`, `sajje`, `kambu` | No exact collision found; none is proposed | Keep inactive without exact evidence in this review |

The current English/French canonical keys remain unique to the two existing target references. No pearl-millet form label or match term exists in the 48-form file. The exact `bajra` and `bajra flour` keys do not collide with any current name, alias, or form term.

## Bundled recipe demand

I scanned all string fields in the 114 manifest-listed recipe files and all 1,123 ingredient rows, including direct links to either target ID. Accent- and punctuation-normalized candidate queries covered `bajra`, `bajra flour`, `pearl millet`, `pearl millet grain`, `pearl millet flour`, `millet perlé`, `millet perle`, `millet à chandelle`, `millet à chandelles`, `petit mil`, `mil pénicillaire`, `farine de mil chandelle`, `bajri`, `bajree`, and `kambu`.

| Search scope | Hits | Result |
| --- | ---: | --- |
| Recipe files with any candidate phrase | 0 of 114 | No recipe prose demand. |
| Ingredient rows with any candidate phrase | 0 of 1,123 | No amount, state, or target line to relink. |
| Ingredient rows linked directly to either target ID | 0 | No existing pearl-millet grain/flour recipe link. |

No recipe or recipe link is proposed. The recommendation is a terminology/identity-boundary improvement based on an official product standard, not a claim of bundled demand.

## Identity, French naming, forms, measurement, and substitution

**Identity and language.** FSSAI's English 2025 standard explicitly pairs `Pearl Millet (Bajra)` and lists pearl-millet species synonyms; it also names the flour product `Bajra Flour (Pearl Millet Flour)` and specifies the milling boundary [S01]. Its standard is Indian regulatory evidence, not a Canadian label mandate. The OQLF entry pairs *pearl millet* with its Québec French terminology and lists preferred French equivalents, but does not list *bajra* [S02]. Preserve the existing French labels `millet perlé` and `farine de mil chandelle`. Add no French alias for `bajra` or `bajra flour` without Québec French usage evidence.

**Forms.** Add no ingredient forms. FSSAI's whole/dehulled scope describes a regulatory grain class; it does not require a cooking-state or preparation form in this catalog. No recipe requests a particular whole/dehulled or cooked state.

**Measurements and yields.** Keep `defaultDensity` null, `unitMappings` empty, and no measure or package/cooking yield. FSSAI's product-quality requirements are not kitchen volume-to-mass conversions, serving portions, or cooking yields. The source review found no source-qualified cup/mass observation for the two target identities.

**Substitutions.** Keep substitution research `not_yet_researched`; propose no rule. The cited sources distinguish grain from flour and specify no culinary substitution relationship, quantity, or method context.

## Integration recommendation and acceptance checks

**Recommendation: integrate the two English aliases into the existing verified rows, subject to coordinator review of the intentionally broad `bajra` search result.** Keep all shared files unchanged until root integration.

1. Retain the exact existing IDs and bilingual displays. Add no reference or form.
2. If integrating both aliases, set only `ingredient-ref-pearl-millet.aliasesEn` to include `bajra` and `ingredient-ref-pearl-millet-flour.aliasesEn` to include `bajra flour`; leave both French alias arrays empty.
3. Confirm the search behavior: `bajra` returns the grain and flour choices, while `bajra flour` returns the flour row only. Preserve or reject that two-result broad query intentionally; do not let the short alias overwrite either identity.
4. Keep `bajra` separate from `jowar`/sorghum and generic `millet`; retain the existing OQLF French display and do not activate other regional variants from this packet.
5. Keep all forms, density, unit mappings, measurement observations, conversions, cooking yields, and substitution rules absent.
6. Keep all 114 recipes unchanged; no recipe relink is warranted by the zero-hit audit.
7. Repeat the normalized-key collision audit and picker fixtures at integration time; source research does not substitute for runtime picker verification.

## Remaining Section F gaps

This narrow alias boundary does not finish the species or regional cereal sweep. Other recorded gaps remain open, including generic sushi rice, unqualified farro, pot/Scotch barley wording, generic grits/polenta, pearled hominy and pozole corn, dried sweet corn, bulgur grade crosswalks, additional puffed grains, and regional cereal mixes beyond the recently reviewed products. Remaining species-level and product discovery and independent Québec French review also continue. No claim is made here about `bajri`, `bajree`, `bajra atta`, other South Asian names, mixed millet products, or unsourced forms/yields.

## Proposal-local source register

Sources were checked on 2026-10-10. IDs below are local to this proposal and do not change the research ledger.

- **WP03-BAJRA-20261010-S01 — Food Safety and Standards Authority of India (FSSAI), [Food Safety and Standards (Food Products Standards and Food Additives) Regulations, Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 dated 2025-05-07, §§23, 2.4.17, pp. 16–17 and 57–58.** Section 23 applies to whole or dehulled millets and lists Pearl Millet (Bajra) with *Pennisetum glaucum* and related species synonyms; it separately lists Sorghum (Jowar) as *Sorghum bicolor*. Section 2.4.17 defines Bajra flour (Pearl Millet Flour) as a product milled from pearl-millet grains. Direct official evidence for the grain/flour name boundary. The food-safety/specification requirements are not adopted as culinary measurements.
- **WP03-BAJRA-20261010-S02 — Office québécois de la langue française (OQLF), [millet perle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506450/millet-perle), last updated 2010, accessed 2026-10-10.** Identifies pearl millet as a cereal species and provides Québec French and English terminology. Does not include *bajra* or *bajra flour* among its preferred/translations; supports retaining current French displays without adding those as fr-CA aliases.

## Coordinator integration result — 2026-10-10

Integrated the two source-bounded English aliases on the existing verified grain and flour rows.
The exact query `bajra` intentionally returns both choices under the current phrase matcher, while
`bajra flour` returns the flour row only. Existing French displays remain unchanged; French aliases,
recipe links, forms, measurements, and substitutions were not added. The broader Section F review
and independent Québec terminology review remain open.
