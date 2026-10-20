# WP05 Section W R929 generic preserved-condiment gap review: suguki-zuke

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity and boundary review. No catalog JSON, ledger, checklist, plan, roadmap, recipe, batch, workflow, code, or test file was edited.
- **Scope:** One generic regional Japanese preserved condiment, `suguki-zuke`. No brand, product-line, flavour, SKU, or retailer roster was researched.
- **Recommendation:** Accept one identity-only generic reference for Kyoto `suguki-zuke`, provisionally displayed as `suguki-zuke` in English and fr-CA, with source-attested English aliases `sugukizuke` and `suguki pickles`. Add no forms, density, unit mappings, recipe links, measures, conversions, yields, or substitutions.

## Current-state and open-work audit

Section W of the ingredient-catalog plan leaves “other regional Japanese preserved condiments” open. The earlier [shibazuke identity review](wp05-east-asian-shibazuke-preserve-identity-review-20261016.md) lists `suguki-zuke` among distinct Kyoto pickles and explicitly holds it for a separate review. The R924 shibazuke recheck confirms the shibazuke row is already integrated and does not claim to cover suguki-zuke. This is therefore a separate generic identity gap, not a repeat of the shibazuke addition.

The current live seed has 1,948 ingredient references and 204 forms; `legacy-import-identities.v1.json` has 55 candidates; the research ledger has 2,352 records. Exact and variant-term searches for `suguki`, `suguki-zuke`, `sugukizuke`, `suguki pickles`, `すぐき`, and `すぐき漬け` found no owner in active references, forms, legacy candidates, or ledger records. The only proposal mentions found are the two prior shibazuke reviews that identify suguki-zuke as a separate, unresolved preserve. No dedicated suguki-zuke identity proposal or proposed ID owner was found.

The nearest active entries are `ingredient-ref-turnip`, `ingredient-ref-turnip-greens`, `ingredient-ref-pickled-radish`, `ingredient-ref-takuan`, `ingredient-ref-takana-zuke`, and `ingredient-ref-shibazuke`; each is a separate raw ingredient or preserved identity. The normalization rule used by the ingredient picker folds punctuation and accents. No current normalized owner was found for `suguki-zuke`, `sugukizuke`, or `suguki pickles`. Do not alias the preserve to `turnip`, `turnip greens`, `radish`, `pickled radish`, or generic Japanese pickles. Static ownership was reviewed; no runtime picker QA was performed for this proposal.

All 114 manifest-listed bundled recipes (1,123 ingredient rows) were searched for Romanized and Japanese Suguki terms; no recipe row matched. No recipe link or recipe-driven measurement evidence is proposed. The official MAFF source describes eating the preserve with rice or in ochazuke, but customary use does not establish a bundled recipe demand, portion, or substitution rule.

The current cross-category scope review found no open Section W task whose only deliverable is a commercial-product roster. Any roster-only work remains out of scope because commercial-product counts do not add ingredient diversity. Existing branded references and their product-scoped evidence remain untouched; no branded fact is transferred in this proposal.

## Identity and boundaries

Japan’s Ministry of Agriculture, Forestry and Fisheries (MAFF) names `suguki-zuke` as one of several distinct Kyoto pickles, alongside senmai-zuke, shiba-zuke, nanohana-zuke, and Kyoto mibuna-zuke. MAFF describes suguki as a Kyoto turnip cultivar and suguki-zuke as that vegetable pickled with salt and fermented by lactic-acid bacteria. The resulting preserve has a sour character; the root and leaves are cut and served separately. Kyoto Prefecture independently describes suguki-na as a local native turnip and states that the preserved preparation is fermented from that vegetable and salt. These sources support a named, generic preserved-food identity without requiring a brand or fixed commercial formulation. [S01–S03]

The MAFF English regional-food page uses “Sugukizuke” and “Suguki Pickles” in its English title and description, while its Kyoto-preserve overview uses the hyphenated spelling `suguki-zuke`. Recommend the latter as the readable English display; keep `sugukizuke` as the spelling alias and `suguki pickles` as a narrow source-attested English alias. Do not add `turnip greens` as an alias: one English translation uses that parenthetical gloss, but other MAFF and Kyoto Prefecture accounts identify the source vegetable as a local turnip type, and the live catalog already has a separate generic turnip-greens reference. The prepared preserve should not absorb the raw cultivar or its component parts as aliases.

Keep the preserve separate from:

- **Senmai-zuke:** a different Kyoto turnip preserve, made from Shogoin turnip slices with kelp and a vinegar-based seasoning. It is not an alias, form, or substitute for suguki-zuke.
- **Shiba-zuke:** a separately named Kyoto pickle made from a different vegetable mix and red perilla. It remains its own active row.
- **Takuan and generic pickled radish:** takuan is a daikon preserve, and the active generic pickled-radish row represents a different, broader pickle class. Neither is a generic parent or safe universal replacement for suguki-zuke.
- **Fresh turnip and turnip greens:** the raw vegetable references remain separate. MAFF’s source-specific note that the preserve’s leaves and root are cut separately does not justify separate catalog forms or part identities for the preserve.
- **Other fermented seasonings:** the name and salt-driven lactic fermentation do not make suguki-zuke a koji, miso, amazake, or soy-seasoning identity.

The row would describe only the named regional preserve. It would not define the whole Kyoto-pickle family or create child rows for household techniques, seasons, retail preparations, or flavours.

## Québec French display and search

Targeted online searches of the OQLF’s Vitrine linguistique for `suguki`, `suguki-zuke`, and `navet fermenté` did not surface a Québec terminology entry for this preserve. The OQLF GDT’s general `navet` entry gives `navet` as the preferred term in specialized French and notes that `rabiole` names a particular round, flattened variety; that entry does not name suguki or authorize either word as a preserve synonym. A French-language Kyoto tourism page calls it `suguki (navet)` under its pickle section. That is useful French culinary usage, but it is not a Québec terminology decision. [S04, S05]

For fr-CA, retain the borrowed display `suguki-zuke` pending a stronger Québec-specific name source. This preserves the source-named identity without implying that the generic term `navet`, the Canadian variety name `rabiole`, or broad `navet fermenté` wording uniquely identifies the Kyoto preserve. Add no French alias. The borrowed display still exposes `suguki` to ingredient search; the English alias covers the official fused spelling. This is a provisional display choice, not an OQLF-standardized translation.

## Numeric behavior and substitution limits

The reviewed MAFF pages describe a particular traditional method, including salting and fermentation stages and, in one account, a warmed chamber. These are source-specific process descriptions, not measurements for a recipe ingredient, a universal preparation specification, or evidence for density, mass-per-volume conversion, serving size, unit mapping, or yield. No generic measurement, density, unit mapping, or form is supported here.

Serving with rice, ochazuke, or as an accompaniment supports culinary context only. It does not establish a substitution between suguki-zuke and pickled radish, takuan, shibazuke, sauerkraut, or any other pickle. Add no global or contextual substitution rule and do not infer a recipe alternative.

## Proposed identity-only row

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-suguki-zuke` |
| `nameEn` | `suguki-zuke` |
| `nameFr` | `suguki-zuke` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | `sugukizuke`; `suguki pickles` |
| French aliases | None |
| Density / unit mappings / forms | None |
| Recipe links / measures / conversions / yields / substitutions | None |

No product-specific source or product-specific measurement is used. All evidence supports the named generic culinary identity or documents a source-specific process without transferring it to a runtime default.

## Sources

Sources were directly reviewed online on 2026-10-19. Claims are paraphrased; process details are not proposed as catalog defaults.

| ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-SUGUKI-R929-20261019-S01` | Japan Ministry of Agriculture, Forestry and Fisheries, [Kyo Tsukemono — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/menu/kyo_tsukemono.html). | Lists suguki-zuke as a named Kyoto pickle distinct from other regional preserves; identifies suguki as a turnip type and describes salt-only lactic fermentation, sour taste, and separate cutting of root and leaves. Its production stages describe one traditional method only. |
| `WP05-SECTIONW-SUGUKI-R929-20261019-S02` | Japan Ministry of Agriculture, Forestry and Fisheries, [Sugukizuke — Our Regional Cuisines](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/4751/index.html). | Attests the fused English spelling `Sugukizuke` and the descriptive phrase `Suguki Pickles`; its page title also contains the parenthetical English gloss “turnip greens.” Do not use that gloss as a catalog alias because other primary descriptions identify a turnip type and the active catalog separately owns generic turnip greens. |
| `WP05-SECTIONW-SUGUKI-R929-20261019-S03` | Kyoto Prefecture, [すぐき菜（すぐき）](https://www.pref.kyoto.jp/kyotootokuni-f/1228962211981.html). | Government agriculture page describes suguki-na as a local turnip cultivar and the preserve as made from the vegetable and salt through lactic fermentation. It documents traditional production context; its process statements are not generalized. |
| `WP05-SECTIONW-SUGUKI-R929-20261019-S04` | Voyages à Kyoto, [Gastronomie et boissons](https://kyoto.travel/fr/food-and-drink). | French-language Kyoto tourism page uses `suguki (navet)` in its pickle section. It is not Québec-specific; it supports recognition of the borrowed food name and generic French description only. |
| `WP05-SECTIONW-SUGUKI-R929-20261019-S05` | Office québécois de la langue française, [navet (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8870711/navet). | Gives `navet` as the preferred specialized term and limits `rabiole` to a particular variety. It does not define the Kyoto preserve. Targeted OQLF searches for `suguki`, `suguki-zuke`, and `navet fermenté` returned no preserve-specific entry. |

**Disposition:** Propose one identity-only `suguki-zuke` reference and keep the broader Section W regional-preserve parent open. No commercial variant work, data changes, or software tests are part of this packet.
