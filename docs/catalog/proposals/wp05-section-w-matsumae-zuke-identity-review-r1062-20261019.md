# WP05 Section W R1062 generic preserved-food gap review: Matsumae-zuke

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity and boundary review. This Markdown file is the only proposed change. Shared catalog JSON, research ledger, plan, roadmap, recipes, generated files, and code were not edited; no tests were run.
- **Open-work anchor:** Section W leaves broader regional Japanese preserved-condiment coverage open under “Yuzu kosho, umeboshi, pickled ginger, and other regional Japanese preserved condiments” at [catalog plan line 10371](../../RecipeBook-global-ingredient-catalog-plan.txt#L10371). This review selects one named, generic regional food identity: Hokkaido **Matsumae-zuke**.
- **Scope:** One generic Hokkaido preserved-food identity, not a brand or commercial roster. No brands, product lines, flavour families, SKUs, retailer variants, or commercial rosters were researched. No commercial-only queue item was encountered in the selected generic gap. Any separate roster-only item is out of scope because commercial-product counts do not add ingredient diversity; stop that line. Preserve all current entries and evidence.

## Recommendation

Propose one identity-only reference for **Matsumae-zuke**, a named preserved food from southern Hokkaido and the Matsumae area. Japan's Ministry of Agriculture, Forestry and Fisheries (MAFF) describes it as shredded dried squid and kelp marinated with soy sauce, sake, mirin, and sugar; its English page also names herring roe and carrot among ingredients used. The page records historical and household variation, including optional additions. [S01–S02]

Keep the regional name and the mixed-preparation boundary. This is not dried squid as an ingredient form, kombu, herring roe, generic pickled seafood, fish paste, or a generic Japanese pickle. In particular, preserve active **Nishin Zuke (Hokkaido pickled herring and vegetables)** as a separate Hokkaido identity: nishin-zuke is herring-and-vegetable based, while Matsumae-zuke is built around dried squid and kelp. Similar region and the `-zuke` suffix do not establish equivalence. Do not add aliases or substitutions.

If accepted for integration, add one minimal `PROTEIN` reference. MAFF places the Japanese food under its fisheries food classification, and squid is the defining preserved seafood in the reviewed account. Add no forms, default density, unit mappings, reusable measures, recipe links, conversions, yields, or active substitutions. Keep all recipe amounts and process particulars attached only to the source page that reports them.

## Live ownership, forms, ledger, legacy, and recipe-demand audit

The refreshed bundled-package snapshot on 2026-10-19 contains **2,066 active ingredient references**, **205 forms**, **2,471 research-ledger records**, **55 legacy-import candidates**, **114 manifest-listed recipes**, and **1,123 recipe ingredient rows**.

The exact and normalized-string audit searched `Matsumae-zuke`, `Matsumae zuke`, `Matsumaezuke`, `Matsumae-zuke`, `Matsumae pickles`, `松前漬`, `松前漬け`, `まつまえづけ`, `Hokkaido squid and kelp preserve`, and proposed ID `ingredient-ref-matsumae-zuke`.

| Surface | Live result and disposition |
|---|---|
| Active references | No matching name, alias, Japanese spelling, or proposed ID occurs among 2,066 references. Preserve active `calamari` and `kombu` as separate base ingredients. Preserve `Nishin Zuke (Hokkaido pickled herring and vegetables)` as a distinct herring-and-vegetable ferment; it is not a Matsumae-zuke alias or owner. No row is overwritten, merged, or removed. |
| Ingredient forms | No Matsumae-zuke spelling, identity, or matching form occurs among 205 forms. Existing squid forms, where present, do not represent the named mixed preserve; propose no form. |
| Legacy imports | No matching name, alias, Japanese spelling, or proposed ID occurs among 55 legacy candidates. |
| Research ledger and source ownership | No Matsumae-zuke identity/candidate record or exact MAFF source URL occurs among 2,471 ledger records. If integrated, add new R1062 source locators for S01 and S02; do not repurpose the nishin-zuke source records or any other existing MAFF locators. |
| Bundled recipes | A case-folded and Japanese-script scan of all 114 manifest-listed recipe files and their 1,123 ingredient rows found no Matsumae-zuke spelling, proposed ID, or descriptive equivalent. Existing references to squid, kelp, soy sauce, or mirin do not establish demand for this prepared food. Add no recipe link, role, amount, or recipe-line substitution. |
| Open plan and queue scope | The regional Japanese preserve clause remains open. The selected lead is a generic named food identity, not a product roster. MAFF's generic-page recipe is used only as source-scoped evidence; no commercial roster is proposed or researched. Any separate queue item limited to brands, product lines, flavour families, SKUs, or retailers is OOS because commercial-product counts do not add ingredient diversity, and that research stops. |

## Identity and bilingual boundary

| Locale | Proposed display | Evidence status |
|---|---|---|
| English | `Matsumae-zuke (Hokkaido squid and kelp preserve)` | `Matsumae-zuke` is the MAFF English display; MAFF identifies it as a Hokkaido food from the southern Hokkaido/Matsumae area and describes the dried-squid-and-kelp preserve. The parenthetical is descriptive, not an alias. |
| French (Canada) | `matsumae-zuke (préparation marinée de calmar séché et de kombu du Hokkaidō)` | Provisional descriptive fr-CA construction based on the source identity and ingredients. No Québec-standardized French name is asserted; the parenthetical is not an alias. |

Use no aliases. The Japanese source gives `松前漬け（まつまえづけ）`; it supports identification of the source-named food, not a need to create separate search aliases. Do not add `Matsumae pickle`, `Hokkaido pickle`, `dried squid`, `squid and kelp`, `nishin-zuke`, or unqualified `zuke` as aliases. The reviewed MAFF account describes a family of regional and household preparations rather than one mandatory ingredient formula. Herring roe, carrot, daikon, turnip, chili, and yuzu appear as source-specific or optional ingredients; do not require these in the generic boundary or infer a product subtype from them. [S01–S02]

Keep the identity distinct from:

- active `Nishin Zuke`, which is the separate Hokkaido herring-and-vegetable preserve;
- active `calamari` and `kombu`, which are component ingredients rather than this finished preserve;
- active pickled radish and named Japanese vegetable preserves, which are plant-based identities;
- generic pickled seafood, fish sauce, and fermented fish pastes, none of which is a synonym for Matsumae-zuke.

## Numeric, form, and substitution evidence limits

MAFF's English page presents one four-serving account using one dried squid, a 60 cm piece of kelp, two or three herring roe, a little yuzu and salt, one cup of soy sauce, and three to five tablespoons each of mirin and sake; it describes marinating for about a week and explicitly notes household and regional recipe variation. These are details of that named recipe only. They do not establish a standard Matsumae-zuke formula, reusable serving measure, ingredient conversion, density, shelf life, preservation-safety rule, or universal fermentation time. The Japanese MAFF page also describes one method and optional additions; those process details remain specific to that source account. [S01–S02]

No reviewed source supports a transferable portion size, mass-per-piece value, density, unit mapping, conversion, finished-food yield, standardized form, or generic preparation-time default. If accepted, use `defaultDensity: null` and `unitMappings: []`; add no forms or numeric observations. No bundled recipe requests Matsumae-zuke, and no reviewed source recommends a replacement in a defined dish, role, method, and amount. Set `substitutionResearchState: blocked_pending_evidence`; add no global or contextual substitution, warning, or recipe-line link. Do not infer that nishin-zuke, calamari, kombu, herring roe, or a generic pickle can replace the finished preserve.

If integrated, use `identityState: verified` and `measurementState: researched_no_supported_value`. Keep the source recipe amounts and method scoped to S01 or S02; do not put them into reusable catalog measures.

## Proposed minimal data

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-matsumae-zuke` |
| Category | `PROTEIN` — a named seafood-based preserved food; MAFF classifies it under fisheries foods and identifies dried squid as its defining base. |
| `nameEn` | `Matsumae-zuke (Hokkaido squid and kelp preserve)` |
| `nameFr` | `matsumae-zuke (préparation marinée de calmar séché et de kombu du Hokkaidō)` — provisional descriptive fr-CA display |
| English aliases | None |
| French aliases | None |
| Density and unit mappings | `defaultDensity: null`; `unitMappings: []` |
| Forms | None |
| Recipe links, reusable measures, conversions, yields | None |
| Active substitutions | None |
| Ledger states if integrated | `identityState: verified`; `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence` |
| Candidate source IDs if integrated | `WP05-SECTIONW-MATSUMAE-ZUKE-R1062-20261019-S01` for MAFF English regional-cuisine identity and its source-specific recipe; `WP05-SECTIONW-MATSUMAE-ZUKE-R1062-20261019-S02` for Japanese name, regional identity, and source-specific preparation. |

## Sources

| ID | Source | Scope used |
|---|---|---|
| **S01** | Japan Ministry of Agriculture, Forestry and Fisheries, [“Matsumae-zuke,” Our Regional Cuisines](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/5943/index.html). | English-language official source identifies the regional food, its southern Hokkaido/Matsumae area, core dried-squid-and-kelp preparation, common ingredient variation, household/region recipe variation, and one source-specific recipe. Use the one recipe's amounts and timing only as cited observations; do not use the page's modern commercial references to build a roster. |
| **S02** | Japan Ministry of Agriculture, Forestry and Fisheries, [“松前漬け（まつまえづけ）,” Nippon Traditional Food Guide](https://www.maff.go.jp/j/keikaku/syokubunka/traditional-foods/menu/matumaezuke.html). | Japanese-language source provides the spelling/reading, Hokkaido and Matsumae regional boundary, preserved-food identity, source-specific ingredient/process descriptions, and variation. Its measurements and process account are not transferable defaults; commercial distribution and product variants are not used. |

**Disposition:** Propose one identity-only `Matsumae-zuke (Hokkaido squid and kelp preserve) / matsumae-zuke (préparation marinée de calmar séché et de kombu du Hokkaidō)` reference in `PROTEIN`. Keep it distinct from nishin-zuke and its component ingredients. Add no aliases, forms, measures, recipe links, conversions, yields, or active substitutions. Preserve all existing references and evidence. No commercial roster was researched; any roster-only queued work is out of scope because commercial-product counts do not add ingredient diversity. This was a proposal-only document, so no tests or builds were run.
