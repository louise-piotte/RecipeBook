# WP05 Section W R1056 generic condiment gap review: nga-ngapi

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity and boundary review. Only this Markdown proposal was written. The shared catalog JSON, research ledger, plan, roadmap, recipes, generated files, and code were not edited; no tests were run.
- **Open-work anchor:** The Section W checklist at [plan line 10514](../../RecipeBook-global-ingredient-catalog-plan.txt#L10514) lists ngapi among fermented fish and shrimp pastes. Its existing note keeps unqualified `ngapi` unresolved because fish and shrimp products need separate scope. This review selects only the fish-based `nga-ngapi` identity.
- **Scope:** One generic Myanmar culinary condiment identity, bounded to salted-fermented fish paste. No brand, product line, flavour family, SKU, retailer variant, or commercial roster was researched. No roster-only queue item was encountered in this selected generic gap.

## Recommendation

Propose one identity-only reference for **Nga-ngapi (Myanmar fermented fish paste)**. The existing Yadanabon University source distinguishes fish-based `nga-ngapi` from shrimp-based `hmyin` or `seinsa ngapi`. A WorldFish field report independently documents multiple regional Myanmar fish-paste samples named `Shan Ngapi` and `Ye gyo Ngapi`. Together these sources support a fish-only culinary identity while leaving the broader `ngapi` family unresolved. [S01–S02]

Keep the Myanmar qualifier and fish substrate explicit. Do not make this an alias for unqualified `ngapi`, generic fish paste, shrimp paste, or any other national or regional fermented paste. Leave the existing unresolved `candidate-ngapi` record and its evidence intact; if later integrated, add a new identity record with fish-specific source locators rather than repurposing the candidate's locators.

## Live ownership, forms, ledger, legacy, and recipe-demand audit

The refreshed package snapshot on 2026-10-19 contains **2,060 active ingredient references**, **205 forms**, **2,465 research-ledger records**, **55 legacy-import candidates**, **114 recipes**, and **1,123 ingredient rows**.

The live-catalog audit searched `nga-ngapi`, `nga ngapi`, `nga pi`, `ngapi`, `ye gyo ngapi`, `hmyin ngapi`, `seinsa ngapi`, `Myanmar fish paste`, `Burmese fish paste`, and `ငါးပိ`, including the proposed ID `ingredient-ref-nga-ngapi`.

| Surface | Result and disposition |
|---|---|
| Active references | No active row, alias, or ID matches the proposed nga-ngapi identity. Keep active `fish sauce` as a liquid product, not a paste. Preserve `bagoong isda`, `prahok`, `pla ra`, and `padaek` as distinct regional fish-ferment identities. Preserve `kapi`, `belacan`, `terasi`, and `bagoong alamang` as distinct shrimp-paste identities; do not alias or merge them. `myeolchi-jeot` remains a separate salted-anchovy identity. No existing row is overwritten, merged, or removed. |
| Forms | None of the 205 active forms matches the candidate terms. Propose no forms. The Yadanabon study's powder and tablet forms refer to its shrimp-paste research and do not transfer to fish nga-ngapi. |
| Legacy imports | No matching term or proposed ID was found among the 55 candidates. |
| Research ledger and ownership | The ledger already contains unresolved `candidate-ngapi`. Its existing sources are Yadanabon University (current source ID `WP05-FERMENTED-CONDIMENTS-20261011-S10`) and WorldFish (current source ID `WP05-FERMENTED-CONDIMENTS-20261011-S11`). Preserve both records, source IDs, source descriptions, and the unresolved umbrella decision. The Yadanabon record supports the fish/shrimp distinction; its study's shrimp-paste measurements and storage results remain shrimp-specific. The WorldFish report supports only the sampled fish-paste descriptions and variations. If accepted, add separate R1056 fish-identity locators for these sources; do not transfer or broaden the current candidate's statements. |
| Bundled recipe demand | A case-folded scan of all 114 manifest-listed recipe files and 1,123 ingredient rows found no `nga-ngapi`, `ngapi`, Myanmar/Burmese fish-paste wording, or Burmese-script match. There is no recipe link, amount, role, or substitution demand. |
| Open plan | The selected line is the generic Section W fermented-fish/shrimp-paste coverage clause, not a commercial roster. No queued brand- or SKU-only item was pursued. |

## Identity and bilingual boundary

| Locale | Proposed display | Evidence status |
|---|---|---|
| English | `Nga-ngapi (Myanmar fermented fish paste)` | `nga-ngapi` is named as the fish-derived group in the Yadanabon University source; the WorldFish report documents Myanmar fish-paste examples. |
| French (Canada) | `nga-ngapi (pâte de poisson fermentée du Myanmar)` | Provisional descriptive construction. No Québec-standardized French name was found; this gloss is not an alias. |

Use the source-attested fish-only term as the canonical display and add no aliases. In particular, do not alias unqualified `ngapi`, `nga pi`, `Ye gyo Ngapi`, `fish paste`, `shrimp paste`, `prawn paste`, `hmyin ngapi`, or `seinsa ngapi`. The WorldFish report uses `Ye gyo Ngapi` for sampled fish-paste products in several areas, but does not establish that one sampled name is a global synonym for all nga-ngapi. The Yadanabon article concerns shrimp paste for its measured study; its measures, powder/tablet preparation, storage results, and quality findings do not describe fish nga-ngapi. [S01–S02]

Keep fish nga-ngapi distinct from liquid fish sauce and from fish or shrimp pastes in the neighboring active rows. Similar substrate, salt fermentation, or culinary role is not evidence of synonymy or substitution.

## Numeric, form, and substitution evidence limits

The WorldFish annex records ingredient ratios, fish species, regions, and processing times for individual sampled fish-paste products. These are study- and sample-specific observations across different producers and methods, not a standardized nga-ngapi formula or a transferable household measure. The Yadanabon article's powder, tablet, storage, and analytical findings apply to its shrimp-paste study. Do not transfer those findings to the proposed fish identity. [S01–S02]

No reviewed evidence supports a reusable measure, serving size, mass-per-piece, density, unit mapping, conversion, finished-food yield, universal salt proportion, shelf-life rule, or safety recommendation for this reference. If accepted, set `defaultDensity: null` and `unitMappings: []`; add no numeric observations, forms, or reusable measures. No bundled recipe requests nga-ngapi and no source supports a defined replacement in a dish, role, method, and quantity. Set `substitutionResearchState: blocked_pending_evidence`; add no global or contextual substitution rule or recipe-line substitution link. Do not infer equivalence with bagoong isda, prahok, padaek, pla ra, anchovy ferments, or shrimp pastes.

If integrated, use `identityState: verified` and `measurementState: researched_no_supported_value`. Keep the broader `candidate-ngapi` umbrella unresolved because it includes the separate shrimp-derived group; do not use this fish-only row to resolve or alias shrimp ngapi.

## Proposed minimal data

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-nga-ngapi` |
| Category | `SAUCE_AND_CONDIMENT` |
| `nameEn` | `Nga-ngapi (Myanmar fermented fish paste)` |
| `nameFr` | `nga-ngapi (pâte de poisson fermentée du Myanmar)` — provisional descriptive fr-CA display |
| English aliases | None |
| French aliases | None |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` |
| Forms | None |
| Recipe links, reusable measures, conversions, yields | None |
| Active substitutions | None |
| Ledger states if integrated | `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence` |
| Candidate source IDs if integrated | `WP05-SECTIONW-NGA-NGAPI-R1056-20261019-S01` for the Yadanabon fish/shrimp naming boundary; `...-S02` for the WorldFish fish-paste samples. Preserve candidate `WP05-FERMENTED-CONDIMENTS-20261011-S10` and `...-S11` unchanged. |

## Sources

| ID | Source | Scope used |
|---|---|---|
| **S01** | Hlaing, Oo, and Ni, [“An Investigation into the Quality Improvement of Myanmar Ngapi,” Yadanabon University Research Journal 9(1) (2018), MERAL record](https://meral.edu.mm/records/321?community=ydbu). | Repository description distinguishes `nga-ngapi` (fish) from `hmyin`/`seinsa ngapi` (shrimp). The article's actual study concerns shrimp paste; no shrimp-specific form, storage, measurement, quality, or safety result is transferred to the proposed fish identity. This source URL is already owned by the unresolved candidate record. |
| **S02** | Rizaldo, Aung, and Akester, [*Quality of fermented fish in Myanmar*, WorldFish report](https://digitalarchive.worldfishcenter.org/server/api/core/bitstreams/6700ae16-cc9a-4cb8-8571-2c38a46432bb/content), Annex 6.1, pp. 11–16. | Field-sample table records fish-paste entries including `Shan Ngapi` and `Ye gyo Ngapi`, with source-specific fish species, ingredients, locations, ratios, and processes. Used only to corroborate fish-derived Myanmar paste identity and variation. No sample ratio, ingredient list, process, or numeric result is treated as a universal recipe or product specification. This source URL is already owned by the unresolved candidate record. |

**Disposition:** Propose one identity-only `Nga-ngapi (Myanmar fermented fish paste) / nga-ngapi (pâte de poisson fermentée du Myanmar)` reference in `SAUCE_AND_CONDIMENT`. Keep it restricted to fish-derived Myanmar ngapi, distinct from shrimp-derived ngapi and other regional fish or shrimp ferments. Preserve the unresolved broad `candidate-ngapi`, its source ownership, and every existing reference. Add no aliases, forms, measures, recipe links, conversions, yields, or substitutions. No commercial roster was researched; no tests or builds were run because this packet is proposal-only.
