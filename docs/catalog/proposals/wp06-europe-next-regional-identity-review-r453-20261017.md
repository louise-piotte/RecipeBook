# WP06 Europe — Piedmontese grissino stirato identity review (R453)

- **Reviewed:** 2026-10-17.
- **Status:** Root-reviewed and recorded as a documentation-only hold; see
  `docs/catalog/batches/wp06-europe-grissino-stirato-hold-integration-r453-20261017/README.md`.
- **Checklist:** The WP06 Europe regional sweep remains open for Western, Southern, Northern, Central, and Eastern Europe in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9250). This review documents a candidate hold and does not complete regional coverage.
- **Scope:** One unintegrated candidate identity for the Piedmontese `grissino stirato`, a dry, crisp, pulled breadstick recognized by Regione Piemonte as a traditional agri-food product (PAT). Do not infer PDO/PGI status.
- **Proposal-local source IDs:** `WP06-EUROPE-GRISSINO-STIRATO-R453-20261017-S01` through `S05`; audit label `WP06-EUROPE-GRISSINO-STIRATO-R453-20261017-R01`. These are review identifiers, not ledger allocations.

## Recommendation

**Hold** the Piedmontese `grissino stirato` identity; do not add a reference row or aliases under the current picker behavior. Regione Piemonte provides strong regional evidence: it identifies `Grissino Stirato` as a traditional product, describes the stretching method, locates production across the Valli di Lanzo, Canavese, Pinerolese, and Torino, and uses it in the Waldensian `Supa dij Barbet` (supa barbëtta). [S01]

Québec evidence supports keeping the named Italian product wording distinct from generic `gressin` / `breadstick`: OQLF defines `gressin` broadly as a small twice-baked bread flute and translates it as `breadstick`; a Mayrand listing separately names `Grissini Torino` and `Gressin régulier`, while a Montréal retailer lists `Grissini Torinesi`. Those shelf titles do not verify a package’s origin or the traditional stretching method, so do not use `Grissini Torino/Torinesi` to bypass the search collision. [S02–S04]

The current search treats a query word as a match when it occurs inside a longer display name or alias. A regional row named `grissino stirato` would therefore make the broad singular query `grissino` resolve to this one regional product. Adding the source-supported plural `grissini stirati` would also make bare `grissini` resolve to that same row. Omitting the plural alias would leave `grissini` unresolved, but the singular generic query would still select the regional item, and users searching the source’s plural name would not find it. R449 avoided mapping broad plural `piments` to Piquillo; at that review snapshot, broad singular `piment` already returned 26 catalog entries. R453 has no generic grissino owner or competing result. [R449 proposal](wp06-europe-piquillo-pepper-identity-review-r449-20261017.md); [R01]

Hold until a generic grissino/grissini identity can coexist without making a broad query select only this regional subtype, or picker matching can prioritize the complete specific phrase over contained generic words. The full bundled corpus has no matching ingredient demand to justify accepting the collision now.

The candidate concept is the named Piedmontese `grissino stirato`, with a provisional French gloss `grissino stirato piémontais`. This is not a proposed JSON row, name allocation, or alias set. OQLF’s generic `gressin`/`breadstick` pair and the Québec shelf titles remain unassigned. The plural `grissini stirati` is source-attested, but adding it now would create the broad-picker result described above.

## Product and naming boundaries

- **Piedmontese traditional product:** Regione Piemonte’s PAT page describes a crisp, hollow grissino made by stretching dough. It identifies several production areas within Piedmont and notes local disagreement over whether traditional dough includes lard or oil. This supports a distinct regional candidate, but not one universal recipe formula or product-origin claim for every item sold as a grissino. [S01]
- **Québec generic term:** OQLF’s entry uses `gressin` for the general breadstick and gives `breadstick` as its English equivalent. Keep both generic terms out of the aliases so a plain breadstick or gressin does not silently select the regional identity. No direct OQLF entry for `grissino stirato` or its regional French wording was found. [S02]
- **Québec retail labels:** Mayrand lists Granforno `Grissini Torino` (item 32421) alongside a regular `Gressin` product; Épicerie Les 3 Gourmets lists `MULINO BIANCO GRISSINI TORINESI`. These are useful evidence of local shelf spelling, not evidence that either SKU follows the Regione Piemonte product description or is made in Piedmont. Keep those titles unresolved as aliases. [S03–S04]
- **Commercial variants:** Grissitalia’s catalog separates `Torinesi`, `Friabili`, and `Stirati a Mano` product groups and lists sesame, pizza, garlic/herb, whole-grain, and other variants. These product-family and flavor labels do not establish universal grissino forms or equivalence to the regional PAT description. [S05]
- **Waldensian soup:** Regione Piemonte’s `Supa barbëtta` recipe lists grissini as an ingredient and says stale bread was the earlier ingredient, replaced by grissini from the second half of the nineteenth century. This is a recipe-specific cultural relationship, not a global substitution rule. [S01]
- **European status:** The source identifies the item as PAT. This proposal makes no claim that the name is a PDO or PGI and does not treat PAT as a protected-origin mark in the catalog.

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Current count | Finding |
|---|---:|---|
| Active ingredient references | 1,742 | No proposed ID or `grissino stirato`/`grissini` owner. Nearby bread references such as bread roll, breadcrumbs, and croutons identify other products. |
| Ingredient forms | 141 | No matching form, label, match term, or proposed-ID owner. |
| Legacy import candidates | 56 | No matching candidate or proposed-ID owner. |
| Research ledger | 2,101 records; 9,562 source entries | No identity record, exact candidate phrase, proposed ID, or R453 prefix. One existing Canadian source mentions breadstick ingredient lists, but it is attached to malted wheat flour research and does not allocate a grissino identity. |
| Numeric and rule data | 8 unit-conversion records; 0 global substitutions; 0 contextual substitutions; 1 package yield | No candidate-specific conversion, yield, or substitution. |
| Proposal and integration archive | Current catalog archive | Exact searches found no grissino/grissini/gressin identity owner or proposal. R442 Ossau-Iraty, R445 Grana Padano, R446 Fourme d’Ambert, and R449 Piquillo pepper concern distinct products. |
| Proposed allocation | Checked before authoring | `ingredient-ref-grissino-stirato` is not reserved. Before this review, the R453 path/prefix and S01–S05 URLs had no prior proposal or ledger owner; they are documented here as proposal-local evidence. |

The archive and live-data search checked bilingual reference names and aliases, form labels and match terms, legacy candidate text, ledger records and URLs, and existing WP06 proposals and integration records. The Europe-wide checklist remains open; no other region or European identity is marked complete by this proposal.

## Phrase-first picker projection

The current picker accent-folds names and aliases, prefers complete word-phrase matches within each indexed term, and then falls back to substring matching in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). This projection shows why no regional row is proposed now.

| Query | Current result | If a row were added |
|---|---|---|
| `grissino stirato` | No result | One regional row, if the named row is added |
| `grissino` | No result | One regional row through the contained word, even with only the singular product name |
| `grissini` | No result | One regional row if the plural `grissini stirati` alias is added; remains unresolved if that alias is omitted |
| `grissini stirati` | No result | One regional row if the source-attested plural phrase is added; otherwise no result |
| `grissini Torino`; `grissini torinesi` | No result | No result; retailer titles do not prove the regional stretching method |
| `gressin`; `breadstick` | No result | No result if generic OQLF equivalents are kept out of the regional row |

The singular-only compromise protects bare plural `grissini` but still makes bare singular `grissino` select the regional subtype and loses the source’s common plural search phrase. Since the live catalog has no generic grissino result to keep broad search from resolving to one regional item, the review holds rather than selecting that compromise.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed. Complete decoded recipe content, ingredient rows, and linked reference/form text were checked for `grissino stirato`, `grissini stirati`, `grissini Torino/Torinesi`, generic `grissini`, `gressin(s)`, `breadstick(s)`, and the candidate reference ID. The scan found **zero matching recipe files, zero matching ingredient rows, and zero linked recipe IDs**.

The manifest-order corpus contains **753,988 bytes** and has fingerprint `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each manifest-relative path, a NUL byte, the lowercase SHA-256 hex digest of that recipe file, and a newline, then hashes the concatenated bytes.

## Forms, measurements, conversions, and substitutions

- **Forms:** none are proposed while the candidate is held. The official source describes several local fat choices and a hand-stretched method. These are historical/regional preparation differences, not recipe-linked forms that should normalize to a conversion chain.
- **Measurements:** none are proposed. The source’s `Supa barbëtta` recipe uses 1 kg of grissini for that recipe and ten stated servings, while also documenting stale bread as the historical alternative. This is a single recipe amount, not a reusable measure or a basis for package yield or conversion. Mayrand’s 100 g SKU is retailer package data, not a recipe portion. [S01, S03]
- **Recipe links:** the bundled corpus has no matching row; add no recipe link.
- **Substitutions:** no global or contextual substitution rule is proposed. The stale-bread relationship is specific to `Supa barbëtta`; it does not establish that bread, breadcrumbs, croutons, or other breadsticks can replace grissino stirato in unrelated dishes. No broader substitution study was performed.

## Evidence limitations and source access

- Regione Piemonte’s government source was accessible and identifies `Grissino Stirato` as PAT, but the page gives no visible revision date. Its regional descriptions include varying fat practices, so this review does not assert one universal formulation. It is not used to claim PDO/PGI status. [S01]
- OQLF’s entry was accessible but last updated in 1985 and covers the generic `gressin`, not this Piedmontese identity. A Québec-specific preferred term for the regional product remains unverified; the French gloss above is only a candidate label, not a proposed live display. [S02]
- Mayrand’s category listing provides current-facing SKU names and package sizes but no ingredient label, origin statement, production method, or inventory guarantee for `Grissini Torino`. The Les 3 Gourmets page identifies a Montréal retailer and a `Grissini Torinesi` product title, but marks the item sold out and does not establish origin or method. [S03–S04]
- Grissitalia is a manufacturer source used only to distinguish its own commercial ranges and flavor labels; it does not define every grissino or certify regional origin. [S05]
- Search results and page contents were accessible for the sources listed here. No separate conclusion about protected EU geographical status is made beyond the Regione Piemonte page’s PAT label.

## Source register

Proposal-local source IDs S01–S05 and their URLs were checked against the live ledger before authoring; no exact URL collision was found. Pages were accessed on 2026-10-17.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| WP06-EUROPE-GRISSINO-STIRATO-R453-20261017-S01 | Regione Piemonte, [PiemonteIS — Grissino Stirato](https://www.piemonteagri.it/qualita/it/prodotti/paste-e-dolci/306-grissino-stirato), product description, production territory, method, and `Supa barbëtta` recipe. | Primary regional-government source for the PAT label, traditional Piedmont production areas, dough-stretching method, regional formulation variation, and soup context. The recipe’s one amount and serving count are not reusable catalog measures. |
| WP06-EUROPE-GRISSINO-STIRATO-R453-20261017-S02 | Office québécois de la langue française, [GDT — gressin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17042580/gressin), updated 1985. | Establishes `gressin` as a generic Québec French term and `breadstick` as its English translation. It does not provide the regional product’s French name. |
| WP06-EUROPE-GRISSINO-STIRATO-R453-20261017-S03 | Mayrand, [Craquelin et biscotte](https://www.mayrand.ca/fr/nos-produits/epicerie/biscuit-et-craquelin), Granforno item 32421 `Grissini Torino` and item 29864 `Gressin régulier`. | Québec-market naming evidence for separate shelf titles. The list does not show product origin, ingredients, or production method; SKU/package amounts are not recipe measures. |
| WP06-EUROPE-GRISSINO-STIRATO-R453-20261017-S04 | Épicerie Les 3 Gourmets (Montréal), [MULINO BIANCO GRISSINI TORINESI](https://www.epicerie-les3gourmets.ca/products/mulino-bianco-grissini-torinesi), product title, SKU 1481. | Local product-title spelling. The page reports sold out and supplies no origin or traditional-method evidence. |
| WP06-EUROPE-GRISSINO-STIRATO-R453-20261017-S05 | Grissitalia, [Grissini product range](https://www.grissitalia.it/grissini/?lang=en), current product-family list. | Manufacturer distinguishes Torinesi, Friabili, and Stirati a Mano ranges and lists flavor/whole-grain variants. This is company-specific product organization, not a universal taxonomy or protected-origin claim. |
| WP06-EUROPE-GRISSINO-STIRATO-R453-20261017-R01 | Read-only audit of the [Europe checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L9250), live references/forms/legacy candidates/research ledger/rules, picker, proposal and integration archive, manifest, and all bundled recipe files. | Records the current ownership check, picker projection, counts, source-ID/URL inventory, and complete recipe scan. Repository evidence only; it does not expand external-source claims. |

## Disposition

**Hold** the Piedmontese grissino stirato candidate. Do not add a row or aliases while the picker would make the broad singular `grissino` query resolve to this one regional product; adding the common plural alias would also make bare `grissini` resolve to it. Revisit after a generic grissino identity can coexist in search results or picker matching can distinguish a complete specific phrase from a contained generic token. Keep `gressin`, `breadstick`, Torino/Torinesi shelf titles, flavored products, and stale-bread substitution outside any future regional identity. Europe-wide coverage remains open.

No tests, builds, emulator checks, or deployment were run because this is a documentation-only hold.
