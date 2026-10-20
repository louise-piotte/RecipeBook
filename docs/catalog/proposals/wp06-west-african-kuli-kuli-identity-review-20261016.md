# WP06 Nigerian kuli-kuli identity review

- **Date:** 2026-10-16
- **Status:** Proposal only; no shared catalog or ledger changes made.
- **Scope:** One Nigerian source-named groundnut snack, reviewed as a distinct identity. This is a narrow Section 05 continuation, not a regional coverage claim and not a reopening of the generic groundnut-paste or red-palm-oil boundary decisions.
- **Recommendation:** Accept an identity-only `kuli-kuli` candidate, subject to coordinator review of the proposed category and display. Keep its source-local name separate from peanuts, peanut butter, groundnut paste, generic groundnut cake, and other snacks.

## Prior-work boundary

The African parent checklist in Section 05 remains open after the bounded six-region sweep and the 2026-10-13 continuation. Those packets integrated reviewed identities and recorded source-specific holds; they did not claim continental coverage. Section Z remains open as well.

This packet does not repeat egusi, fonio, dried oyster/Yokhoss, MENA products, or the accepted African identities from the previous two sweeps. It does not reopen the 2026-10-10 Section Z decision to keep generic groundnut paste and African red-palm names source-local. The active crude-palm-oil row remains unchanged. It also does not reconsider yaji, which the 2026-10-13 continuation held over product-form/category ambiguity.

## Live package snapshot

Counts and SHA-256 hashes were refreshed from the shared worktree on 2026-10-16. Hashes cover exact file bytes. The recipe aggregate follows `manifest.recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, its exact file bytes, and a NUL byte.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,595 references | 515,344 | `999088c56419aeb84bd95b022715de9b26a7126be3158c2ede8ac59d0e885392` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 122 forms | 92,787 | `d8fcce3554d3dab0f972f045231292ac61da2b6df62045481095ac3443129cc1` |
| `docs/catalog/legacy-import-identities.v1.json` | 61 candidates | 14,525 | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| `docs/catalog/research-ledger.v1.json` | 1,940 records; 8,388 source entries; 7,128 distinct source IDs | 8,465,405 | `b577938bc7c4255efbbb74eec2c776fdb98d253e8acf95ac6998941174629589` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe JSON aggregate | 114 files; 1,123 ingredient rows | — | `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` |

The proposal-local source-ID prefix `WP06-KULIKULI-20261016-S` and proposed reference ID `ingredient-ref-kuli-kuli` were absent from the proposal archive, live ledger, active references, forms, and legacy candidates before drafting. The target proposal path was also absent.

## Exact-key, ownership, and recipe audit

The audit compared normalized whole phrases against active reference names and aliases, current form labels and match terms, legacy candidates, the ledger, and all manifest-listed recipe JSON. It used Unicode NFKD, case folding, accent removal, punctuation-to-space conversion, whitespace collapse, and exact normalized-key equality for catalog ownership.

| Query or context | Current owner or result | Disposition |
|---|---|---|
| `kuli-kuli`, `kulikuli`, `kuli kuli`, `groundnut cake`, `peanut cake` | No exact active reference, form, legacy, or ledger candidate. No earlier proposal or batch claims a kuli-kuli identity. | New exact product-name candidate. Use only `kuli-kuli` as the display and consider `kulikuli` as the source-attested spelling alias. Do not activate generic `groundnut cake` or `peanut cake` as aliases: reviewed sources use “cake” for the input press-cake as well as the named snack. |
| `peanuts` / `arachides` | Active `ingredient-ref-peanuts`; active roasted form `ingredient-form-peanuts-roasted`. | Kuli-kuli is a separately named prepared snack, not a whole-peanut synonym or a roasted-peanut form. |
| `peanut butter` / `beurre d'arachide` | Active `ingredient-ref-peanut-butter`; English aliases include `natural peanut butter` and `smooth peanut butter`. OQLF defines the Québec product as a spread of roasted, ground peanuts [S06]. | Keep distinct. The peanut-stew recipe line below is context for this active product only. |
| `groundnut oil` | English alias of active `ingredient-ref-peanut-oil`. | Do not broaden the oil alias to groundnut products generally. |
| `groundnut paste`, `peanut paste` | No exact active reference, form, legacy, or recipe key. Generic-paste status is governed by the earlier Section Z review. | Do not add or revive a generic paste identity or map the phrase to peanut butter or kuli-kuli. |
| Red-palm names and active crude palm oil | `ingredient-ref-crude-palm-oil` is the source-bounded Brazilian crude-oil identity. The earlier African Section Z review keeps red-palm and zomi terms unresolved. | Boundary only; this packet makes no change or equivalence claim. |

Across all 114 recipes and 1,123 ingredient rows, there were zero exact normalized full-recipe or ingredient-row matches for `kuli-kuli`, `kulikuli`, `groundnut cake`, `peanut cake`, `groundnut paste`, or `peanut paste`. The African Peanut Stew, recipe 090, does contain `1/2 cup natural creamy peanut butter`, linked to `ingredient-ref-peanut-butter`; its optional garnish `peanuts and fresh cilantro` is linked to `ingredient-ref-peanuts`. Neither line names kuli-kuli or supports an alias, form conversion, or substitution. No recipe line or reference relink is proposed.

## Candidate recommendation

| Candidate reference ID | Proposed English / fr-CA display | Category | Alias and boundary recommendation |
|---|---|---|---|
| `ingredient-ref-kuli-kuli` | `kuli-kuli` / `kuli-kuli` | `OTHER` (the taxonomy has no dry-snack category) | Keep the borrowed Nigerian product name in both locales. `kulikuli` is a source-attested spelling variant and may be added as an English alias. OQLF supports `arachide` as the Québec French term for peanut, but does not establish a French name for this snack; `collation nigériane à base d’arachides` is at most a descriptive gloss, not an alias or an OQLF term. Do not add `groundnut cake`, `peanut cake`, `groundnut paste`, `peanut paste`, `peanut butter`, `groundnut`, `peanut snack`, `Dakuwa`, or `Donkwa` as aliases. |

**Disposition:** Accept the narrowly named Nigerian snack identity for coordinator review. Nigeria’s university courseware describes kulikuli as a groundnut snack consumed alone or with gari; NAFDAC lists kuli-kuli among dry finger foods; and the National Bureau of Statistics codes it separately from groundnuts. A research article further distinguishes the prepared fried product from the groundnut cake produced during oil extraction [S01–S05]. These support a source-named prepared product, not a universal formula or a global meaning for “groundnut cake.”

If integrated, add no form, density, unit mapping, measurement, package yield, recipe link, conversion, or substitution. No source in this review supplies a reusable quantitative value or a general substitution rule.

## Sources

Source IDs are local to this proposal and have not been inserted into the shared research ledger. Sources were checked on 2026-10-16. They are used for the limited naming and identity claims stated here, not for recipe formulas, safety guidance, or numeric data.

| ID | Source and locator | Claim used and limit |
|---|---|---|
| **WP06-KULIKULI-20261016-S01** | Nigeria Raw Materials Research and Development Council, [“The Enhancement of Production Process and Quality of Kuli-Kuli and Dakuwa Snacks”](https://www.rmrdc.gov.ng/project-details.php?id=51), project overview. | Names Kuli-Kuli as groundnut cake and separately names Dakuwa as a groundnut–cereal snack. Supports Nigerian product naming and the product boundary; does not specify one formula or preparation standard. |
| **WP06-KULIKULI-20261016-S02** | National Open University of Nigeria, [AFS 202 Principles of Food Science and Technology](https://nou.edu.ng/coursewarecontent/AFS%20202%20MAIN_1.pdf), §3.2.7 “Groundnut Cake,” PDF pp. 175–176. | Identifies kulikuli as a groundnut-based snack among Yoruba Nigerians and gives eating-alone/with-gari context. The courseware's processing discussion is not adopted as a recipe, handling instruction, or safety recommendation. |
| **WP06-KULIKULI-20261016-S03** | National Agency for Food and Drug Administration and Control (NAFDAC), [Micro, Small & Medium Enterprises — Categories of Products](https://nafdac.gov.ng/our-services/micro-small-medium-enterprises-msme1/), dry finger foods. | Lists Kuli-kuli as a dry finger food separately from packaged groundnut and peanut burger. This is an illustrative product-category listing, not a product standard. |
| **WP06-KULIKULI-20261016-S04** | National Bureau of Statistics, [Nigeria General Household Survey-Panel 2010–2011 (PostHarvest), variable V6124](https://microdata.nigerianstat.gov.ng/index.php/catalog/31/variable/V6124). | Codes “Kulikuli (groundnut cake)” separately from “Groundnuts” and “Locust bean (dawadawa).” This is survey classification, not a culinary definition or prevalence claim. |
| **WP06-KULIKULI-20261016-S05** | Balogun et al., [“Effect of Potash addition on groundnut oil yield and quality of kulikuli (fried groundnut cake)”](https://www.ajol.info/index.php/agrosh/article/view/198814), *Agrosearch* 20(1) (2020), article abstract. | Calls kulikuli fried groundnut cake and describes it as a prepared product derived from groundnut cake after oil extraction. Supports keeping the named product distinct from the intermediate. The study's process variables, measured yields, and quality results are not catalog amounts, formulas, or safety evidence. |
| **WP06-KULIKULI-20261016-S06** | Office québécois de la langue française, [arachide](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8350973/arachide) and [beurre d'arachides](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8360854/beurre-darachides), GDT. | Supports `arachide` as Québec French peanut terminology and defines peanut butter as a spread of roasted, ground peanuts, with `beurre d'arachides` identified as Québec usage. It does not name or translate kuli-kuli. |

## Next actions and limits

1. Coordinator: decide whether to add `ingredient-ref-kuli-kuli`, confirm `OTHER`, and choose whether `kulikuli` should be an English-only spelling alias.
2. If accepted, recheck current IDs, alias search ownership, and recipe corpus at integration time; keep the peanut-butter and peanuts links in recipe 090 unchanged.
3. Keep generic groundnut/peanut paste and the red-palm/crude-palm-oil boundary under their existing Section Z review. Review a future recipe's exact product label before allocating either generic term.
4. Continue the broader African sweep; this single candidate does not close Section 05 or Section Z.

This deliverable is proposal documentation only. No tests or emulator checks were run.
