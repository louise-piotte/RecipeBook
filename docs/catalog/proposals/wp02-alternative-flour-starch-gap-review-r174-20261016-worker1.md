# WP02 Section 04 B3 R174 — Chinese water chestnut starch gap review

- **Reviewed:** 2026-10-16.
- **Status:** proposal-only; this file is the only change owned by this review.
- **Checklist:** [`docs/RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt), WP02 Section 04 B3, open item “Water-chestnut flour and other documented regional starches” (near line 2457). The parent remains open.
- **Scope:** one bounded review of extracted starch from *Eleocharis dulcis* corms, current Canadian product and recipe wording, provisional Québec French naming, picker behavior, ownership, corpus demand, and numeric/substitution claims. It does not reopen the generic `water chestnut flour` decision or the accepted *Trapa* Singoda flour row.
- **Proposal-local source IDs:** `WP02-ELEOCHARIS-DULCIS-STARCH-R174-20261016-S01` through `S04`. They are unallocated in the live research ledger. Their URLs were checked against the ledger and proposal/batch archive; none is already registered there.

## Recommendation

Propose one identity-only `FLOUR_AND_STARCH` reference for **Chinese water chestnut starch**, scoped to starch extracted from *Eleocharis dulcis* corms:

| Proposed field | Value |
|---|---|
| ID | `ingredient-ref-chinese-water-chestnut-starch` (unallocated) |
| English display | `Chinese water chestnut starch` |
| French display | `amidon de châtaigne d’eau chinoise` — descriptive, provisional fr-CA wording; no Québec authority or Canadian product label reviewed here attests this exact compound as a product name |
| Category | `FLOUR_AND_STARCH` |
| Aliases | None in either language |
| Default density / unit mappings | `null` / `[]` |

The product boundary is supported by primary research that separately prepares whole-corm flour and water-extracted starch from *E. dulcis*. A Canadian grocery page currently lists a standalone `ZX Water Chestnut Starch`; CFIA maps the raw commodity name “water chestnut” to *E. dulcis*, and the Canadian recipe evidence also uses water-chestnut starch. Those market sources do **not** identify the listed starch package’s botanical species, so its link to the *E. dulcis* research class is an inference, not a verified package-level species claim. The proposed English display follows the source-qualified research name and distinguishes this starch from the *Trapa* dried-fruit flour.

Use the French display only as a provisional descriptive label if the root accepts that level of naming uncertainty. OQLF records `châtaigne d’eau` for the Chinese sedge, but a separate OQLF record and the current Québec flora page also use the unqualified name for water-caltrop / *Trapa natans*. TERMIUM and Swiss customs support the more specific qualifier `châtaigne d’eau chinoise`; OQLF supports `amidon` as the general preferred term for starch. None of those sources establishes the exact proposed compound as a Québec food-product name. If a provisional compound is not acceptable, hold the row pending Québec terminology review.

Keep `candidate-water-chestnut-flour` unresolved. Do not add whole-corm flour, any *Trapa* flour alias, a water-chestnut vegetable form, recipe links, conversions, yields, or substitutions in this proposal. No shared catalog, generated Kotlin, ledger, roadmap, or checklist change is proposed.

## Product and naming boundary

| Material or wording | Decision | Evidence boundary |
|---|---|---|
| `Chinese water chestnut starch` | Propose as an identity for aqueous-extracted *E. dulcis* corm starch. | Rujirapisit gives a separate starch preparation: peeled corms are ground with water, filtered and re-extracted, starch settles from the filtrate, and the recovered material is dried and milled. This is one study and process, not a universal manufacturing specification. |
| `water chestnut flour` | Keep unresolved. | The existing ledger candidate records that this unqualified phrase can refer to whole *E. dulcis* corm flour, extracted *E. dulcis* starch in some market naming, or dried-*Trapa* fruit flour. No single identity is safe. |
| `ZX Water Chestnut Starch` | Canadian market corroboration only. | Superwafer currently lists a 250 g product by this title. The page does not state a botanical species, ingredient declaration, or extraction process. Package size is not a recipe measure. |
| `water chestnuts starch` in a Campbell’s Canada recipe | Recipe-specific culinary usage only. | The page uses 2 tbsp / 30 mL in one vermicelli soup and gives a cornstarch replacement tip for that soup. It does not establish a mass/volume conversion, density, general substitution, or species for every product sold under the phrase. |
| `châtaigne d’eau` | Do not use as a new alias or standalone French display. | It already identifies the water-chestnut vegetable and has conflicting Québec/OQLF botanical scope involving *Eleocharis* and *Trapa*. |
| `amidon de châtaigne d’eau chinoise` | Provisional descriptive French display only. | `amidon` is the general OQLF term, and the Chinese qualifier is supported in federal Canadian and Swiss customs nomenclature. The full product compound is reviewer-composed, not OQLF-approved or confirmed on a Québec package. |
| `Singoda flour / farine de singoda` | Leave as the existing separate identity. | R129 accepted this product-qualified *Trapa* dried-fruit flour with `Singhare ka atta`; it remains separate from *E. dulcis* corm starch and from generic `water chestnut flour`. |

## Alias and picker collision audit

The picker normalizes accents and searches complete word phrases inside display names and aliases, then falls back to substring matching. The following forecast was checked against the live reference rows and that matching behavior, with the proposed row added in memory only:

| Query | Current result | Result if proposed row is merged | Boundary |
|---|---|---|---|
| `water chestnut` | `ingredient-ref-water-chestnut` | Vegetable plus proposed starch | This collision is caused by the proposed canonical display containing the phrase; no explicit alias is needed. |
| `water chestnut starch` | No result | Proposed starch | The proposed canonical display contains the complete phrase. This deliberately makes the generic Canadian starch wording discoverable, though the retailer page itself does not identify species. |
| `Chinese water chestnut starch` | No result | Proposed starch only | Qualified English query. |
| `water chestnut flour` | No result | No result | Remains unassigned; no `flour` wording is proposed. |
| `chestnut flour` | Tree-chestnut flour only | Tree-chestnut flour only | `ingredient-ref-chestnut-flour` remains separate. |
| `chestnut starch` | Tree-chestnut starch | Tree-chestnut starch plus proposed starch | Broad query collides because the phrase is contained in both canonical names. A user should choose the water-chestnut qualifier. |
| `châtaigne d’eau` | Water-chestnut vegetable | Vegetable plus proposed starch | Accent-insensitive phrase match inside the proposed French display. Do not add the bare term as an alias. |
| `farine de châtaigne d’eau` | No result | No result | No flour identity or alias is proposed. |
| `amidon de châtaigne d’eau` | No result | Proposed starch | The shorter phrase is contained in the proposed French display; it is not a separate alias. |
| `amidon de châtaigne d’eau chinoise` | No result | Proposed starch only | Qualified French query. |
| `Singoda flour` / `Singhare ka atta` | Existing Singoda flour | Existing Singoda flour only | R129 identity and its one alias remain unchanged. |

No aliases are recommended. In particular, do not add `water chestnut flour`, `farine de châtaigne d’eau`, bare `châtaigne d’eau`, `water caltrop starch`, `chestnut starch`, `ma tai fen`, or Singoda/Trapa terms to the proposed row. Because the current picker searches subphrases inside canonical names, an empty alias list does not prevent the shorter queries shown above from matching.

## Ownership, legacy, and prior-review audit

Read-only live snapshot taken 2026-10-16:

| Source | Count | SHA-256 |
|---|---:|---|
| Live ingredient references | 1,549 | `55a008eeaa5716bcfc06fe4506000b159bf0871b63f847b8da41614b469e9432` |
| Live ingredient forms | 120 | `07a02985cddf2a7fd854b934b3f7b1c45b63981bac0ee7b08e4b839ea1d4e1cf` |
| Legacy import identity candidates | 61 | `bf1a780527e26e90526f6d579096b67e8b82cbbbd764ce1ced650c2d9c9a0a14` |
| Research ledger records | 1,894 | `0f5073e320ecca74bc62cdb0c10cc422f7d160e9d708706a5ea254088bf6e5cf` |
| Seed manifest | 114 recipe files | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

Relevant active references:

- `ingredient-ref-water-chestnut` is `water chestnut / châtaigne d'eau`, category `VEGETABLE_AND_AROMATIC`, with no aliases, density, or unit mappings.
- `ingredient-ref-singoda-flour` is `Singoda flour / farine de singoda`, category `FLOUR_AND_STARCH`, with only `Singhare ka atta` as its English alias and no numeric data.
- `ingredient-ref-chestnut-flour` and `ingredient-ref-chestnut-starch` are distinct `FLOUR_AND_STARCH` references for tree chestnut, with no water-chestnut aliases.
- No water-chestnut flour or starch form is present. A search of the 61 legacy candidates for water-chestnut, Singoda, Singhare, or *Eleocharis* terms returned no match.
- `candidate-water-chestnut-flour` remains `needs_clarification`, with `researched_no_supported_value` measurement state and `researched_no_supported_substitute` substitution state. Its unresolved decision says the generic phrase may mean whole-corm *Eleocharis* flour, extracted *Eleocharis* starch, or dried-*Trapa* flour; it must not be aliased to the vegetable, tree-chestnut flour, or generic starch. This proposal does not edit that record.
- Proposed reference ID `ingredient-ref-chinese-water-chestnut-starch` and the four proposal-local source IDs were absent from active references, forms, legacy identities, ledger, and the existing proposal/batch archive at the audit snapshot.

The 2026-10-09 boundary proposal and independent review already distinguish whole-corm *E. dulcis* flour from extracted starch and hold generic `water chestnut flour`. R129 already integrates the separate *Trapa* Singoda flour identity. This review does not repeat those decisions: it addresses the standalone Canadian *starch* listing and proposes only the source-qualified extracted-starch branch.

## Recipe corpus audit

The manifest contains 114 bundled recipe files and 1,123 ingredient rows. A scan of ingredient lines and recipe text for `water chestnut`, `Chinese water chestnut`, `water chestnut starch`, `water chestnut flour`, `Singoda`, `Singhare`, *Eleocharis*, and the French starch/flour phrases returned no matching ingredient lines and no recipe links. There is no bundled recipe demand to support forms, measures, or substitutions.

## Measurement and substitution limits

- Keep `defaultDensity` null and `unitMappings` empty. The 250 g retailer package is package weight only.
- Campbell’s 2 tbsp / 30 mL amount is one soup recipe’s volume measure. Its cornstarch tip is scoped to that soup and does not establish a reusable replacement rule.
- The primary paper's sample composition, pasting, or laboratory processing data do not establish a consumer package measure, density, household conversion, or kitchen substitution.
- Add no forms, conversions, yields, recipe links, or cross-ingredient substitutions. Do not treat whole-corm flour and extracted starch as interchangeable.

## Source register — proposal-local, unallocated IDs

| ID | Source | Supports and limits |
|---|---|---|
| **WP02-ELEOCHARIS-DULCIS-STARCH-R174-20261016-S01** | Superwafer, [ZX Water Chestnut Starch](https://www.superwafer.ca/en/product/15887/zx-water-chestnut-starch), product title, listing, and package size; accessed 2026-10-16. | Current Canadian retailer listing for a standalone 250 g starch product. It does not supply species, ingredients, or extraction method; the retailer warns its product information may not be complete/current. Not a botanical identity standard or measure source. |
| **WP02-ELEOCHARIS-DULCIS-STARCH-R174-20261016-S02** | Translation Bureau of Canada, TERMIUM Plus, [châtaigne entry search](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=1&index=frw&lang=fra&srchtxt=CHATAIGNE); record dated 2021-09-24, accessed 2026-10-16. | Search-indexed result distinguishes *Eleocharis dulcis/tuberosa* as “Chinese water chestnut” / `châtaigne d’eau` and notes the French common name is also used for *Trapa natans*. Direct record access returned 403 during this review; the result text is used only for the terminology distinction, not as product-label evidence. |
| **WP02-ELEOCHARIS-DULCIS-STARCH-R174-20261016-S03** | Swiss Federal Office for Customs and Border Security, [Chapter 07 explanatory notes](https://www.bazg.admin.ch/dam/fr/sd-web/6dWeVsN9cYtw/Kap_07_f.pdf), effective 2026-10-01, sections on edible tubers and starch classifications; accessed 2026-10-16. | Calls the edible *E. dulcis / E. tuberosa* tuber `châtaigne d’eau chinoise` and separates flour/semolina/powder classifications from starch. Supports a transparent descriptive French qualifier and product distinction, not a Québec consumer-product term or culinary-use claim. |
| **WP02-ELEOCHARIS-DULCIS-STARCH-R174-20261016-S04** | Campbell’s Canada, [Street-Style Vermicelli Soup](https://www.cookwithcampbells.ca/recipe/street-style-vermicelli-soup/), ingredients and tip; accessed 2026-10-16. | Uses the wording “water chestnuts starch” for 2 tbsp / 30 mL in one soup and gives a cornstarch replacement tip in that context. Recipe-specific usage only; no species declaration, mass/volume weight, general conversion, or reusable substitution rule. |

## Previously allocated sources reused; no new IDs assigned

- `WP02-WCKF-20261010-S10` — Rujirapisit, [“Chemical Composition and Some Physicochemical Properties of Chinese Water Chestnut (*Eleocharis dulcis* Trin.) Flour and Starch”](https://www.thaiscience.info/Article%20for%20ThaiScience/Article/2/10029953.pdf), pp. 207–208 for separate corm-flour and water-extracted-starch preparations. One study/sample, not a universal product specification or kitchen conversion.
- `WP03-AGARICUS-MARKET-TERMS-20261009-S04` — CFIA, [D-94-26, Import Requirements for Root Crops](https://inspection.canada.ca/en/plant-health/invasive-pests-and-plants/directives/horticulture/94-26), table mapping commodity “water chestnut” to *Eleocharis dulcis*. This concerns raw-root import nomenclature, not processed-starch species or retail naming.
- `WP02-WCKF-20261010-S07` and `WP02-WCKF-20261010-S08` — OQLF GDT entries for `châtaigne d’eau` (Chinese sedge) and water caltrop, respectively. Plant/common-name records, not starch-product labels.
- `WP02-B3-TRAPA-SINGODA-FLOUR-R129-20261015-S07` — Gouvernement du Québec, [Châtaigne d’eau](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/flore/fiches-especes-floristiques/chataigne-eau), current flora entry for *Trapa natans*. It informs the French naming collision only; no inference is made here about processed-food rules.
- `WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S02` — OQLF GDT, [amidon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), general preferred French term for starch. It does not attest the full proposed compound.

## Remaining limits

The extracted-*E. dulcis* starch product class has direct process evidence, and current Canadian sources show the unqualified starch wording in retail and recipe use. The Canadian retail listing does not identify its botanical source, and no Québec food authority or package reviewed here establishes a preferred product-specific French label. The provisional display and mapping from generic `water chestnut starch` to the source-qualified *E. dulcis* row therefore require coordinator acceptance. The generic `water chestnut flour` candidate remains unresolved, and WP02 B3 stays open.
