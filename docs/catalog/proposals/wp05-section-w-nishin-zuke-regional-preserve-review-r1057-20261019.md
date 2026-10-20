# WP05 Section W R1057 generic preserved-food gap review: nishin-zuke

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity and boundary review. Only this Markdown proposal was written. Shared catalog JSON, research ledger, plan, roadmap, recipes, generated files, and code were not edited; no tests were run.
- **Open-work anchor:** Section W leaves “Yuzu kosho, umeboshi, pickled ginger, and other regional Japanese preserved condiments” open at [catalog plan line 10371](../../RecipeBook-global-ingredient-catalog-plan.txt#L10371). This packet reviews one distinct regional prepared food, Hokkaido **nishin-zuke**, a herring-and-vegetable ferment.
- **Scope:** One generic regional culinary food identity, not a brand or commercial roster. No brands, product lines, flavour families, SKUs, retailer variants, or commercial rosters were researched. No roster-only task was encountered in this selected open-work item.

## Recommendation

Propose identity-only **Nishin Zuke (Hokkaido pickled herring and vegetables)**. Japan's Ministry of Agriculture, Forestry and Fisheries (MAFF) identifies Hokkaido nishin-zuke as a traditional fish ferment made from herring with vegetables. It places the main lore area in Rumoi and describes the salted, rice-koji pickling and fermentation. The English MAFF regional-cuisine entry documents it as a household winter food and notes that recipes vary by home and region. [S01–S02]

Keep the Hokkaido qualifier visible and the mixed herring-and-vegetable preparation explicit. This is not a generic pickled-herring or fish-ferment class. Do not collapse it into herring, kipper, fish sauce, fish paste, vegetable nukazuke, takuan, pickled radish, or Bettara-zuke. Preserve all active entries and evidence.

## Live ownership, forms, ledger, legacy, and recipe-demand audit

The refreshed bundled-package snapshot on 2026-10-19 contains **2,060 active ingredient references**, **205 forms**, **2,465 research-ledger records**, **55 legacy-import candidates**, **114 recipes**, and **1,123 ingredient rows**.

The exact-string and variant audit searched `Nishin Zuke`, `Nishin-zuke`, `nishin zuke`, `nishinzuke`, `ニシン漬け`, `にしん漬け`, `Hokkaido pickled herring`, `pickled herring and vegetables`, and proposed ID `ingredient-ref-nishin-zuke`.

| Surface | Result and disposition |
|---|---|
| Active references | No matching nishin-zuke name, alias, Japanese spelling, or proposed ID exists. Preserve active `Atlantic herring`, `Pacific herring`, `smoked herring bloater`, `smoked herring fillets in oil`, and `herring fillets in tomato sauce` as separate identities. None defines this Hokkaido herring-and-vegetable ferment. Also preserve `daikon`, `green cabbage`, `carrot`, `pickled radish`, `takuan`, `Bettara-zuke`, and the vegetable-only `nukazuke` and `koji-zuke` classes. No row is overwritten, merged, or removed. |
| Ingredient forms | None of the 205 active forms matches the candidate terms. Propose no forms. |
| Legacy imports | No matching name, alias, Japanese spelling, or ID occurs among the 55 candidates. |
| Research ledger and source ownership | No nishin-zuke identity or candidate record exists. The two dedicated MAFF URLs in S01 and S02 are not currently ledger-owned. If later integrated, create new R1057 source locators for those exact pages. Do not repurpose the separate MAFF pickles-classification pages already owned by other identities. |
| Bundled recipes | A case-folded scan of all 114 manifest-listed recipe files and their 1,123 ingredient rows found no Nishin Zuke spelling, Japanese name, Hokkaido pickled-herring phrase, or equivalent nishin-zuke demand. No recipe link, role, amount, or substitution is supported. |
| Open plan and queue scope | The selected parent is generic regional Japanese preserved-food coverage. No queued item limited to a brand, product line, flavour family, SKU, retailer variant, or commercial roster was found in this line. No commercial-product research was pursued. |

## Identity and bilingual boundary

| Locale | Proposed display | Evidence status |
|---|---|---|
| English | `Nishin Zuke (Hokkaido pickled herring and vegetables)` | MAFF's English regional-cuisine page uses `Nishin Zuke (pickled herring)`, identifies Hokkaido and the Rumoi area, and names vegetables in the preparation. The parenthetical clarifies the mixed-food scope. |
| French (Canada) | `nishin-zuke (hareng et légumes fermentés du Hokkaidō)` | Provisional descriptive fr-CA construction. No standardized Québec French name was found; the gloss is not an alias. |

Use the borrowed Japanese food name and add no aliases. Do not activate `pickled herring`, `fermented herring`, `Hokkaido pickle`, `kipper`, `herring pickle`, `rice-koji pickle`, `nukazuke`, or an unreviewed Japanese transliteration as aliases. The source does not assign an Atlantic or Pacific herring species, and its ingredient combination remains a source-bounded regional food identity rather than a generic herring form. [S01–S02]

The identity is a mixed preserved food, not a synonym for the dried herring (`kipper`) used as an input in the MAFF example. It is also not the liquid extracted from a ferment, a fish paste, a plain fish-and-vinegar pickle, or a vegetable-only rice-bran pickle. The sibling Hokkaido identity stays distinct from daikon-only preserves such as takuan and Bettara-zuke.

## Numeric, form, and substitution evidence limits

MAFF's English page provides one household pickle-container recipe: 2.5 kg daikon, 2.5 kg cabbage, 0.2 kg malted rice, 0.25 kg herring strips, 0.2 kg carrot, 40–50 g ginger, red pepper, and salt at 3% of weight. It describes ingredient preparation including soaking herring, and the Japanese page describes the regional process and fermentation. MAFF explicitly notes recipe variation by household and region. These figures, ingredients, timings, process conditions, and storage descriptions are observations of those source accounts; they are not a standard formula, safety recommendation, reusable measure, or transferable pickle rule. [S01–S02]

No reviewed source supports a transferable serving size, mass-per-piece, density, unit mapping, conversion, finished-food yield, or standard fermentation time for the proposed catalog identity. If accepted, use `defaultDensity: null` and `unitMappings: []`; add no forms, numeric observations, or reusable measures. No bundled recipe requests nishin-zuke and no source supports a substitute in a defined dish, role, method, and quantity. Set `substitutionResearchState: blocked_pending_evidence`; add no global or contextual substitution, warning, or recipe-line link.

If integrated, use `identityState: verified` and `measurementState: researched_no_supported_value`. Keep any source-specific recipe quantities and process findings attached to the MAFF source locators only.

## Proposed minimal data

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-nishin-zuke` |
| Category | `PROTEIN` — the source classifies it as a fishery fermented food and the identity's defining component is herring. |
| `nameEn` | `Nishin Zuke (Hokkaido pickled herring and vegetables)` |
| `nameFr` | `nishin-zuke (hareng et légumes fermentés du Hokkaidō)` — provisional descriptive fr-CA display |
| English aliases | None |
| French aliases | None |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` |
| Forms | None |
| Recipe links, reusable measures, conversions, yields | None |
| Active substitutions | None |
| Ledger states if integrated | `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence` |
| Candidate source IDs if integrated | `WP05-SECTIONW-NISHIN-ZUKE-R1057-20261019-S01` for the MAFF English regional-cuisine identity and source-scoped recipe; `...-S02` for the MAFF Japanese regional-food identity and process account. |

## Sources

| ID | Source | Scope used |
|---|---|---|
| **S01** | Japan Ministry of Agriculture, Forestry and Fisheries, [“Nishin Zuke (pickled herring),” Our Regional Cuisines](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/560/index.html). | English-language source identifies Hokkaido, Rumoi, herring with radish/cabbage/carrot/red pepper, and rice-malt-and-salt pickling with fermentation. Its household recipe, amounts, methods, timings, and storage details remain source-specific; the page notes regional and household recipe variation. |
| **S02** | Japan Ministry of Agriculture, Forestry and Fisheries, [“ニシン漬け（にしんづけ）,” Nippon Traditional Food Guide](https://www.maff.go.jp/j/keikaku/syokubunka/traditional-foods/menu/nisinzuke.html). | Japanese-language source classifies Hokkaido nishin-zuke as a fishery fermented food, names herring and vegetables, locates its main tradition in Rumoi, and describes source-specific preparation. Use for identity and regional boundary, not as a universal recipe or preservation-safety specification. |

**Disposition:** Propose one identity-only `Nishin Zuke (Hokkaido pickled herring and vegetables) / nishin-zuke (hareng et légumes fermentés du Hokkaidō)` reference in `PROTEIN`. Keep it distinct from raw, smoked, dried, or tomato-sauced herring; fish sauces and pastes; and vegetable-only pickles. Add no aliases, forms, measures, recipe links, conversions, yields, or active substitutions. No commercial roster was researched. No tests or builds were run because this packet is proposal-only.
