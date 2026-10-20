# WP03 Section F round 19: Panivaragu / Proso millet grain alias — 2026-10-13

## Review record

- **Status:** Integrated on 2026-10-13; root integration complete.
- **Scope:** Review the closed spelling `panivaragu` for the existing proso/common-millet grain, `ingredient-ref-common-millet` (`common millet / millet commun`, *Panicum miliaceum*). The WP02 round-19 packet separately reviews the proso flour wording `panivaragu maavu`; this packet covers the grain alias and its picker effect without duplicating that flour recommendation.
- **Next-gap selection:** The integrated round-18 kodo packet added `varagu` to Kodo and explicitly left Tamil `Pani varagu` / `panivaragu` for separate Proso review. The current Section F species row is `common millet / millet commun`; see the [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2265-L2179), [round-18 Kodo packet](wp02-a6-next-regional-flour-gap-review-20261013-round18-varagu-kodo.md), and [round-18 Cheena packet](wp03-section-f-next-cereal-gap-review-20261013-round18-cheena-alias.md).
- **Disposition:** Add only English alias `panivaragu` to `ingredient-ref-common-millet`. Keep spaced `pani varagu` inactive because it changes the current bare-`pani` picker behavior. Keep the existing French display and all measure, form, recipe, and substitution fields unchanged.

## Identity and source boundary

ICAR–IIMR's current [Millets Information](https://millets.res.in/millets_info.php) page maps Tamil `Pani varagu` to English Proso Millet and separately maps Tamil `Varagu` to Kodo Millet. The page footer says it was updated on 2026-07-07. This is the primary crosswalk for the two-word form and the Kodo/Proso distinction; it does not establish Canadian terminology or a flour name [reused `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03`].

The closed spelling is independently supported by ICAR–IIMR's 2026 [Chapter 7: Proso millet](https://www.millets.res.in/pub/2026/GAP-English.pdf), which names `panivaragu` as a Tamil and Malayalam name for Proso millet. The current search index exposes that chapter text; direct retrieval failed because the 21 MB PDF exceeds the web fetch limit, so rely on indexed text for this spelling only. The exact URL already appears in the proposal/batch archive for other chapters. Reuse the existing `WP03-SIKIYA-20261012-S02` source record and extend its locator/support to Chapter 7 if root records this spelling; do not create another source ID for this PDF URL.

A current Calgary local-store card is titled `Proso Millet (Panivaragu) 2lb`. It is Canada-market wording for the grain and is indexed as a same-day local-store listing. Direct retrieval failed; the title does not prove an inspected package label, a specific millet lot, or continuing stock. The `2lb` is retail package mass, not a kitchen measure. The same URL and proposed ID are already documented in the separate WP02 round-19 packet; reuse `WP02-A6-PANI-VARAGU-PROSO-ALIAS-20261013-R19-S01` instead of creating another source record.

The Canada-facing Desertcart listing for Proso Millet also names spaced `Pani Varagu`. Its indexed page was crawled about three weeks before this review, while direct retrieval returned a cache miss. Desertcart says it purchases products on the buyer's behalf from other markets, so this is marketplace wording rather than a verified Canadian label or stable inventory record. Reuse the existing `WP03-CHEENA-MILLET-ALIAS-20261013-R18-S03`; broaden its locator/support only if root records this wording.

For Québec, OQLF's [millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun) entry identifies *Panicum miliaceum*, prefers `millet commun`, and lists `common millet` and `proso millet` in English. It was last updated in 2010 and does not mention either Panivaragu spelling. Mayrand's current Québec [Graines de millet crues 1 kg](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/noix-et-fruits-secs/noix-et-fruits-secs-vrac/graine-de-millet-crue-mayrand-chef-27825) listing likewise uses only generic French grain wording; it does not identify the species or name Panivaragu. Reuse `WP03-S180` for OQLF and `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02` for Mayrand. Health Canada's current [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html) places Proso millet (*Panicum miliaceum* subsp. *miliaceum*) in the cereal-grain group, but is regulatory taxonomy evidence, not an alias source; reuse `WP03-S181`.

The evidence supports the closed grain search spelling on the existing Proso/common-millet identity. It does not establish `panivaragu` as a Québec French name, a flour name, or a term used on a Canadian package inspected directly. Keep the French display `millet commun`.

## Exact ownership and product boundary

The current common-millet grain row already represents *Panicum miliaceum*, has English aliases `chena`, `proso millet`, `barri`, `cheno`, `cheena`, and `cheena millet`, and retains French display `millet commun`. Its category is `GRAIN_AND_CEREAL`; `defaultDensity` is `null`, `unitMappings` is empty, and no ingredient form is attached. The exact normalized-key audit found no active reference or form owner for `panivaragu` or `pani varagu`. Mentions in the round-18 Kodo record and prior proposals document a boundary; they are not active picker aliases.

| Key or identity | Current exact owner | Proposed outcome |
|---|---|---|
| `panivaragu` | None | Add only to the existing common-millet grain row. |
| `pani varagu` | None | Leave inactive; see picker behavior below. |
| `panivaragu maavu` | None | Outside this grain packet; WP02 round 19 separately proposes it for the existing proso-millet-flour row. |
| `pani varagu maavu`, `panivaragu mavu`, `panivaragu flour`, `panivaragu atta` | None | Leave inactive here; no grain evidence assigns a flour-qualified alias. |
| `varagu` / `varagu maavu` | Kodo grain / Kodo flour | Keep on those existing Kodo rows; do not transfer either name to Proso. |
| `ingredient-ref-common-millet` | Existing verified *Panicum miliaceum* grain | Reuse; create no ingredient or form ID. |

The catalog change proposed here is one English alias on the grain row. Do not create a separate `panivaragu` identity, duplicate the Proso grain, add a French alias, or merge Proso with Kodo.

## Picker projection

The read-only projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it normalizes spelling, returns complete word-phrase matches if any exist, then falls back to substring matching. Forms are included in the picker term set. This is a source-code projection, not runtime or emulator QA.

| Query | Current result | With only proposed grain alias | If WP02 round-19 flour alias is also integrated |
|---|---|---|---|
| `panivaragu` | None | Common-millet grain only | Common-millet grain plus proso-millet flour; a grain/flour choice. |
| `pani varagu` | None | None; the closed form does not match the spaced query. | None. |
| `pani` | Four substring results: narrow-barred Spanish mackerel, Spanish onion, spotted Spanish mackerel, and yeast (`levure de panification`). | Substring fallback still returns those four plus common-millet grain (five results total). | Substring fallback still returns those four plus common-millet grain and proso-millet flour (six results total). |
| `varagu` | Kodo grain and Kodo flour | Same two Kodo results. | Same two Kodo results. |
| `panivaragu maavu` | None | None | Proso-millet flour only. |
| `proso millet` | Common-millet grain and proso-millet flour | Same two results | Same two results. |
| `common millet` | Common-millet grain only | Same result | Same result. |

The closed spelling preserves the distinction between exact phrase matching and substring fallback. In particular, `panivaragu` is a single closed token, so a bare `pani` query does not become an exact phrase hit that suppresses the four current partial results. By contrast, adding only the spaced grain alias `pani varagu` would make `pani` an exact whole-word phrase match and return common millet alone, suppressing those four results. If a spaced flour alias were also added, it would return the grain/flour pair instead, still suppressing the four existing partial results. Keep the spaced spelling out of active aliases until the search behavior can avoid that shorter-token capture.

The current picker therefore will not find the official spaced query `pani varagu`; the proposed closed spelling is supported by the current IIMR 2026 chapter and a current Canadian product card. This is a deliberate, bounded spelling choice, not a claim that the spaced form is incorrect.

## Bundled recipe demand

The manifest-listed corpus currently contains **114 recipe files** and **1,123 ingredient rows**. A read-only scan of serialized recipe text and ingredient-row fields found **0** file hits and **0** row hits for `panivaragu`, `pani varagu`, the flour-qualified forms, or the common-millet target reference. There are **0** direct recipe links to `ingredient-ref-common-millet`. Five files contain the bare substring `pani`, but none contains the candidate name; these are not recipe demand for Panivaragu. No recipe edit, relink, or recipe substitution is proposed.

## Measures and substitutions

Adding an alias does not change the food state or numeric behavior. Keep the common-millet grain's `defaultDensity: null`, `unitMappings: []`, lack of forms, and `measurementState: not_yet_researched` unchanged. Retail package quantities such as 2 lb or 1 kg are package mass, not a serving amount, cup conversion, or grain density. The source set supplies no transferable household measure for Panivaragu.

Keep `substitutionResearchState: not_yet_researched`; do not add a global or contextual replacement for rice, other millet species, or wheat. The independent WP02 flour proposal retains the flour row's null active density, empty mappings, and blocked substitution findings. Neither proposal supplies a grain-to-flour conversion, cooking yield, package yield, or recipe-line substitution.

## Source-ID and URL collision audit

The exact URL and source-ID audit covers the live research ledger and the existing proposal/batch archive. Reuse records for URLs already registered or described in the parallel WP02 round-19 packet; do not create a second source ID for the same page.

| Source ID and URL | Collision handling |
|---|---|
| Reuse `WP03-SIKIYA-20261012-S02` — IIMR [2026 Chapter 7: Proso millet](https://www.millets.res.in/pub/2026/GAP-English.pdf) | Exact URL already appears in the archive under `WP02-A6-BARNYARD-FLOUR-20261012-S06`, `WP02-A6-SIKIYA-FLOUR-20261012-S02`, `WP03-BARNYARD-20261011-S03`, and `WP03-SIKIYA-20261012-S02`. Reuse the existing `WP03-SIKIYA-20261012-S02` record and extend its locator/support; do not mint a new ID. Indexed IIMR text supports closed Tamil `panivaragu`; direct retrieval exceeds the web fetch limit. |
| Reuse `WP02-A6-PANI-VARAGU-PROSO-ALIAS-20261013-R19-S01` — BuyNearby Calgary [Proso Millet (Panivaragu)](https://buynearby.store/calgary/desiindianmarket?city=calgary&filter_cat=3259&lang=te&store=desiindianmarket) | Already used in the separate WP02 R19 packet for this exact URL. Reuse the ID; do not mint a WP03 duplicate. Its listing is current-indexed but not directly retrievable. |
| Reuse `WP02-A6-PROSO-MILLET-ATTA-ALIAS-20261013-R2-S03` — IIMR [Millets Information](https://millets.res.in/millets_info.php) | Existing primary crosswalk source; reuse for spaced `Pani varagu` and its distinction from Kodo `Varagu`. The URL is repeated elsewhere under millet-specific IDs; do not add another record. |
| Reuse `WP03-CHEENA-MILLET-ALIAS-20261013-R18-S03` — Desertcart Canada [Superior Proso Millet](https://canada.desertcart.com/products/885364060-superior-proso-millet-1-kg-premium-whole-grain-source-dietary) | Existing source ID and URL; reuse for the marketplace's spaced `Pani Varagu` wording and extend its locator/support only if root records the evidence. |
| Reuse `WP03-S180` — OQLF [millet commun](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506451/millet-commun); `WP03-S181` — Health Canada [Residue Chemistry Crop Groups](https://www.canada.ca/en/health-canada/services/consumer-product-safety/pesticides-pest-management/public/protecting-your-health-environment/pesticides-food/residue-chemistry-crop-groups.html) | Existing authoritative Canadian/Québec taxonomy and terminology URLs on the common-millet row; reuse. |
| Reuse `WP03-COMMON-CHENA-ALIAS-20261013-R15-S02` — Mayrand [Graines de millet crues 1 kg](https://mayrand.ca/fr/nos-produits/fruits-et-legumes/noix-et-fruits-secs/noix-et-fruits-secs-vrac/graine-de-millet-crue-mayrand-chef-27825) | Existing current Québec generic-product source; reuse. |
| Reuse sibling WP02 R19 IDs `WP02-A6-PANI-VARAGU-PROSO-ALIAS-20261013-R19-S02` and `...-S03` for Sempulam's spaced flour page and Silkrute Canada's closed-spelling flour page | These are flour evidence only and are not needed to establish the grain alias. Reuse the sibling packet's IDs if the flour evidence is integrated; do not duplicate their URLs in this packet. |

No new ingredient ID, form ID, source ID, recipe link, measurement observation, yield, conversion, or substitution finding is proposed. All referenced URLs and IDs are reused from the live ledger or proposal/batch archive.

## Recommendation and integration status

1. Add `panivaragu` as the sole new English alias on `ingredient-ref-common-millet`.
2. Keep spaced `pani varagu`, flour-qualified names, French transliterations, and other spellings out of this grain alias change. Coordinate the separate `panivaragu maavu` decision with the WP02 round-19 packet.
3. Keep `varagu` and `varagu maavu` on the existing Kodo grain and flour rows.
4. Preserve current displays, category, density, unit mappings, forms, recipe links, measurement/substitution research states, and findings.
5. Reuse the exact source IDs listed above; extend the existing IIMR chapter locator/support rather than registering another ID for its URL.

At proposal time this packet changed no shared catalog JSON, ledger, plan, roadmap, generated file, or other reviewer's work. Root integration added the accepted closed grain alias and supporting source records. No app, unit, instrumentation, or emulator tests were run under the updated `AGENTS.md` rule for database-JSON additions.
