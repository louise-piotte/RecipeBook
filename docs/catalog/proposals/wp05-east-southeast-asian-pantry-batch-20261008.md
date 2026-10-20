# WP05 Section X — Lao padaek identity proposal

**Packet type:** independent proposal, partially accepted and integrated  
**Owner:** `/root/sea_pantry_batch`  
**Reviewer/integration owner:** coordinator; partial acceptance on 2026-10-08  
**Prepared and source access date:** 2026-10-08  
**Scope:** one distinct Southeast Asian pantry product under Section X: Lao padaek. This adds a country-sweep candidate and does not complete Section X or WP05. The coordinator integrated its identity, evidence, checklist, and search fixture on 2026-10-08; no runtime conversion or substitution rule was added.

## Live-state and overlap check

Inspected the current repository instructions, Section X evidence and identity rules, the current seed and evidence ledger, and the existing WP05 East Asian, Southeast Asian, and pandan proposals before drafting. The worktree already contains concurrent edits; this packet preserves them.

| Input | Observed state |
|---|---|
| Git HEAD | `0caaef893ebd9e12443c62fdbbb6a5a328c53fc4` |
| Live reference seed | 395 references; SHA-256 `7be0d158a0241037e229a2c6a925ca0f7912d8715507dbf8e76340d06df5880a` |
| Live forms seed | 16 forms; SHA-256 `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` |
| Live research ledger | SHA-256 `e4d0366353e40661212444c6e8f05a8ef55902110d047373c573bec29738719e` |
| Live plan | SHA-256 `2c5ad26f58081aa749e879b8a0286960ea7b7e03656db91535cc3d7757c28f7d` |

The prior Section X proposal already covers kecap manis/asin, curry pastes, nam prik pao, sambals, belacan, terasi, bagoong, prahok, sweet chili sauce, peanut sauce, laksa paste, banana ketchup, toyomansi, coconut/cane vinegar, kaya, and a Kampong Speu palm-sugar syrup. Its follow-ups cover Kapi, ube halaya, and pandan boundaries. Kapi, generic fish-sauce aliases, sriracha aliases, and the first-tranche sauces are already integrated. Padaek is absent from the live references, forms, legacy candidate identities, ledger, and existing WP05 proposals. It is explicitly within the Section X fermented-fish and additional Lao-product sweep, so this candidate does not duplicate a pending proposal.

The normalized-key audit used the repository's `normalize_search_key` behavior (case-fold, Unicode decomposition/accent removal, ligature fold, then non-alphanumeric runs to spaces). The proposed keys `padaek`, `sauce padaek`, `pa daek`, and `padek` had **zero exact normalized collisions** across the current English/French canonical names and aliases. A scan of all 114 bundled recipe JSON files found no occurrence of those terms, `pla ra`, `prahok`, or `ngapi`; there is no padaek recipe line to relink. Existing recipes 093 and 095 request generic `fish sauce`; those lines remain unchanged.

## Proposed identity

| Proposed ID | EN display | fr-CA display | EN aliases | fr-CA aliases | Category suggestion |
|---|---|---|---|---|---|
| `ingredient-ref-padaek` | `padaek` | `sauce padaek` | `pa daek` | `padek` | `SAUCE_AND_CONDIMENT` |

This is a named Lao salt-fermented freshwater-fish seasoning. JIRCAS identifies *pa daek* as a Lao fish paste and all-purpose seasoning; Lao News Agency identifies *pa daek* as heavily salted fermented fish; Télé-Québec uses the fr-CA terms *sauce padaek* and *padek*, describing it as an unfiltered Lao fish sauce. The proposed category follows its direct culinary role as a seasoning/condiment; it is not a claim about a single recipe or formulation.

**Alias limits:** the two proposed spellings are directly evidenced variants of the named product. Do not activate broad `fish paste`, `fish sauce`, `Lao fish sauce`, `Lao bagoong`, or generic fermented-fish phrases as aliases. The exact regional name improves search without making a broad English label silently select one member of the product family.

**Identity and boundary decisions:**

- Keep padaek separate from the live generic `fish sauce / sauce de poisson` reference. JIRCAS describes pa daek as a salt-fermented freshwater-fish paste; Télé-Québec calls it unfiltered and lists `sauce padaek` separately from generic `sauce poisson` in one Lao recipe. These sources support a separately searchable regional product identity.
- Do not alias `pla ra`. JIRCAS calls it a similar Thai product and reports both regional names in its comparative research, but does not establish that the names are interchangeable across products. Keep a Thai pla ra crosswalk outside this proposal.
- Do not alias the separately proposed Cambodian `prahok`, Thai Kapi, Philippine bagoong, Malaysian belacan, Indonesian terasi, or Myanmar ngapi. The regional names and preparations require item-level evidence; shared fermentation or broad translation is not enough.
- JIRCAS reports variation among products. It describes salt with rice bran or roasted rice powder; Télé-Québec's short note instead says wheat bran. Do not assert one universal formulation or treat that disagreement as an alias/form distinction. No ingredient-form row is proposed.
- The English and French names are supported, but `sauce padaek` is a source-supported Québec recipe term rather than an OQLF-approved term. Keep independent Québec terminology review as an acceptance check.

## Measurement and substitution evidence status

**No numeric conversion or yield is proposed.** Recommend ledger `measurementState: researched_no_supported_value`; proposed reference `defaultDensity: null`, `unitMappings: []`, and no forms, conversion edges, or package yields. The targeted searches found no exact-form g/mL value, mass-per-volume observation, count weight, or package yield. JIRCAS's salinity and fermentation observations are product-quality measurements, not kitchen conversions. Télé-Québec gives 45 mL (3 tablespoons) for one recipe's ingredient quantity; this is a recipe amount, not grams or density. A household production formula is not a finished-food density or a recipe-use conversion.

**No substitution rule is proposed.** Recommend ledger `substitutionResearchState: researched_no_supported_substitute` for the documented ordinary recipe-use search scope; no source-grade, context-specific replacement with a supported amount and adjustments was found. Targeted searches included `padaek substitute fish sauce Lao recipe substitute authoritative` and `Lao padaek replacement fish sauce ratio`. The Lao-focused home-cook source below states that regular fish sauce does not replicate padaek's role but does not provide a validated replacement. A recent recipe-blog result proposes fish sauce plus anchovy and pickled-fish brine, but offers no independent test-kitchen or technical evidence and is rejected for activation. Télé-Québec's co-use of padaek and generic fish sauce in the same recipe is not substitution evidence. Do not activate fish sauce, pla ra, prahok, or shrimp paste as a replacement by inference. Revisit if a credible Lao culinary authority, tested recipe source, or manufacturer provides directional guidance for a named cooking context; never generalize to preservation or fermentation use.

## Source-to-claim mapping

Sources were accessed on **2026-10-08**.

1. **Japan International Research Center for Agricultural Sciences (JIRCAS), [Assessment of usage and fermentation-related components of pa daek](https://www.jircas.go.jp/lo/publication/jircas_working_report/90/89)** (2020, with a linked full report). Supports the `pa daek` spelling; identifies it as salt-fermented freshwater fish paste used in Laos as an all-purpose seasoning; confirms both commercial and household use; and reports product-to-product variation. It does not support an English display translation, density, unit conversion, or substitute.
2. **Khaosan Pathet Lao (Lao News Agency), [Vientiane Province](https://kpl.gov.la/EN/detail.aspx?id=79553)** (2024). Supports the Lao regional identity and `pa daek` spelling; describes it as heavily salted fermented fish. It is not used to assign a universal recipe or measurement.
3. **Télé-Québec Cuisinez, [Sai oua – Boulettes de porc](https://cuisinez.telequebec.tv/recettes/8042/sai-oua-boulettes-de-porc)**. Supports the Québec French display `sauce padaek`, the alternate spelling `padek`, and the description of a non-filtered Lao fish sauce. Its recipe separately lists padaek and generic fish sauce, supporting distinct ingredient requests. It gives a recipe-specific 45 mL amount but no mass equivalent. Its note lists wheat bran, which conflicts with JIRCAS's rice-bran descriptions; the proposal therefore makes no universal bran/composition claim.
4. **JIRCAS Newsletter No. 77, [Component and Microbial Analyses for Quality Improvement of Fermented Freshwater Fish Products](https://www.jircas.go.jp/sites/default/files/publication/jircas_newsletter/jircasnewsletter77.pdf)** (2016, pp. 8–9). Supports the `pa-daek` spelling, regional Lao identity, use as a cooking ingredient/seasoning, variable product characteristics, and that pla ra is a similar Thai product. It does not state that pla ra is a universal synonym. Product fermentation observations are not kitchen conversion values.
5. **JIRCAS, [Importance of salt concentration and long-term fermentation in the quality of salty-fermented freshwater fish paste in Thailand and Laos](https://www.jircas.go.jp/en/publication/research_results/2014_c04)**. Supports comparison of regional pla ra / pa daek products and describes salted fish fermented with rice bran or roasted rice powder. Its process context is not a household substitute or finished-ingredient conversion.
6. **Padaek.com, [How to make padaek](https://padaek.com/make-padaek-lao-fermented-fish-sauce-recipe/)**. A Lao-focused home-cook page reviewed during the substitution search. Its indexed text describes padaek as a thick, sometimes chunky fermented fish seasoning and says ordinary fish sauce does not replicate its role, but gives no validated substitute rule. Direct page opening timed out. The page labels its own recipe experimental, so it is not used for numeric or substitution activation.
7. **DishNomad, [Tam Mak Hoong Recipe: Lao Green Papaya Salad with Padaek](https://dishnomad.com/recipe/tam-mak-hoong)**. Search result text reviewed as a possible substitute source; the page was not directly opened. Its surfaced fish-sauce/anchovy/pickled-fish suggestion lacks independent technical or test-kitchen evidence; it is recorded only as rejected research, not a supported recommendation.

## Recommended acceptance checks

1. Re-read the live seed, forms, ledger, proposals, and all 114 recipe lines at integration time; repeat the exact normalized collision audit because other work is active.
2. Confirm `ingredient-ref-padaek` and category against the current schema, accept the source-supported Québec display `sauce padaek`, and retain only the cited spellings `pa daek` and `padek` as language-scoped aliases.
3. Keep generic fish sauce and the regionally named paste/ferments distinct; do not relink existing generic-fish-sauce recipe lines. No form, measurement, unit mapping, package yield, conversion, or substitution should be added from the sources in this packet.
4. If integrated, record source-specific identity/name evidence and the two explicit unavailable evidence states in the ledger, then run the coordinator-owned catalog and package validation and relevant search checks.

**Acceptance status:** partially accepted. `ingredient-ref-padaek` was integrated as `padaek / sauce padaek`, with only `pa daek` and `padek` as scoped aliases. Numeric data, forms, and runtime substitution remain empty. Section X's other countries and candidates, broader recipe-miss review, and independent Québec terminology review remain open. See [`../batches/wp05-padaek-identity.md`](../batches/wp05-padaek-identity.md).

**Verification note:** the coordinator's normalized collision and 114-recipe scans found no collision or recipe mention. Package validation, generated-index checks, all 9 Python package tests, 275 Android unit tests, lint, and APK assemblies passed. On Pixel 9a / API 36, the fr-CA picker returned `sauce padaek`; connected instrumentation reported 29 cases (27 passed, 2 QA-only skips, 0 failures) using a temporary user-data image. The original AVD data was preserved. Independent Québec terminology review and broader Section X coverage remain open.
