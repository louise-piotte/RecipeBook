# WP04 Section P — Shishamo product-label boundary review (R153)

- **Review and source-access date:** 2026-10-15.
- **Candidate:** unqualified `shishamo` / Shishamo seafood product label.
- **Recommendation:** **Hold** the unqualified label outside active references, forms, and the research ledger. Do not add `shishamo` as an alias to the existing Atlantic capelin row.
- **Scope:** one seafood-product naming and identity boundary. This review does not reopen Atlantic capelin or shirasu.
- **Worktree change:** this proposal only. No catalog JSON, ledger, generated index, plan, checklist, roadmap, or other proposal was changed. No tests, emulator, app, or deployment work was run.

## Why this is the next unfinished candidate

The WP04 Section P checklist keeps broader fish, regional-seafood, and product coverage open. The R151 and R152 Section P rounds reviewed and integrated Hokkaido scallop and shirasu respectively; neither addressed shishamo. A case-insensitive search of the focused Section P proposal and integration archive found no earlier shishamo-specific review, hold, or integration. Incidental related capelin work does not allocate the product name. The live references, forms, legacy-import candidates, and research ledger also have no shishamo identity or prior shishamo source record.

The current live snapshot has **1,522 references**, **119 forms**, **61 legacy candidates**, and **1,867 ledger records / 7,894 source entries / 6,749 distinct source IDs**. The complete bundled package lists 114 recipes. Six source IDs proposed for this review, `WP04-SECTIONP-SHISHAMO-R153-20261015-S01` through `S06`, were absent from the ledger and the proposal/batch archive when checked. The candidate ID `ingredient-ref-shishamo` was absent from the active references, forms, and ledger; no reference ID is reserved because the recommendation is a hold.

## Identity and product-name boundary

The Japanese Ministry of Agriculture, Forestry and Fisheries (MAFF) describes true Hokkaido shishamo as an indigenous fish with only minimal current availability, while saying that almost all Japanese-market fish sold as “shishamo” in recent years has instead been imported Atlantic capelin. It also notes that shishamo kanroni is often made with capelin. This is direct evidence that the unqualified market word can identify either a Japanese species or a capelin product; the MAFF page does not itself state the two scientific names. [S01]

A current MAFF export-establishment list names frozen **CAPELIN (*Mallotus villosus*)** and **SHISHAMO SMELT (*Spirinchus lanceolatus*)** separately. MEXT's food-composition entry also identifies semi-dried raw shishamo as *S. lanceolatus*. Together these support the distinct species scopes behind true Hokkaido shishamo and capelin-labelled product use, while the MAFF list's scope is approved products and establishments for export to Vietnam, and the MEXT table is a composition reference rather than a synonym guide or Canadian labeling rule. [S02, S06]

A Toronto seafood retailer currently lists **Shishamo 8pc** and explicitly identifies that SKU as **Capelin (*Mallotus villosus*) — sold as shishamo**. Its “whole small fish,” “semi-dried,” eight-piece package, frozen-storage, and cooking details describe that single listing only. This is useful evidence of Canadian product wording and one SKU's species, but it does not establish that every product sold as shishamo is capelin. [S03]

The sources therefore support two different scopes behind the same short name: true Hokkaido shishamo (*S. lanceolatus*) and at least one Canadian shishamo-labelled Atlantic-capelin product (*M. villosus*). Creating an unqualified ingredient row or attaching `shishamo` to `ingredient-ref-atlantic-capelin` would conceal that distinction. Keep `Hokkaido shishamo`, `shishamo smelt`, `karafuto shishamo`, and `capelin sold as shishamo` unallocated as picker aliases until an exact recipe or product specification establishes which scope is meant.

## Québec French naming boundary

OQLF's edible-fish entry normalizes **capelan** for *Mallotus villosus* and explicitly pairs it with English **capelin**. It says `caplan` and borrowed `capelin` were not retained for Québec fish-product commercialization. This governs the existing Atlantic-capelin row; it does not translate shishamo, and it cannot be extended to true Hokkaido shishamo (*S. lanceolatus*). [S04]

No OQLF entry or current Québec product source establishing a French name for shishamo was found in this bounded search. Do not invent `capelan shishamo`, `éperlan japonais`, or another French construction. If a future exact Canadian SKU is explicitly identified as *M. villosus*, use the existing Atlantic-capelin naming boundary and preserve the package wording as source text; if it is *S. lanceolatus*, request a separate Québec terminology review. The CFIA page explains that its Fish List pairs acceptable Canadian English/French fish-label names with scientific names and TSNs. This review did not verify an exact Fish List entry for either Shishamo wording, so it makes no claim that `shishamo` is or is not an acceptable Canadian label. [S05]

## Exact ownership and picker projection

The read-only ownership audit compared the normalized candidate phrases against every bilingual active reference name and alias, every form label and match term, and every legacy candidate name and alias. It also checked the ledger and focused proposal/batch archive for prior shishamo source records or decisions.

| Phrase | Active reference / form / legacy owner | Current picker result | Disposition |
|---|---|---:|---|
| `shishamo` | None | 0 | Keep unallocated; same name is used for different fish scopes. |
| `shishamo smelt` / `Hokkaido shishamo` | None | 0 | Do not imply the Japanese species from one product listing. |
| `karafuto shishamo` | None | 0 | Do not add a historical or language variant without a reviewed product boundary. |
| `Spirinchus lanceolatus` / `Mallotus villosus` | No exact display or alias owner | 0 | Scientific names are not picker terms in the active catalog. |
| `Atlantic capelin` / `capelin` | `ingredient-ref-atlantic-capelin` through its qualified English display | 1 | Retain existing row unchanged. |
| `capelan de l’Atlantique` / `capelan` | `ingredient-ref-atlantic-capelin` through its qualified French display | 1 | Retain the current Québec species-qualified naming. |
| `smelt` | `ingredient-ref-american-smelt` and `ingredient-ref-european-smelt` through qualified display names | 2 | Keep both smelt choices; do not add a third ambiguous shishamo result. |

Picker projections were read from the current reference/form terms using the logic in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accent/ligature/punctuation folding, complete phrase matching, then partial matching when no complete phrase is found. Under the hold, `shishamo`, `shishamo smelt`, and `Hokkaido shishamo` still return zero results; capelin/capelan queries still resolve to the existing Atlantic capelin row, and `smelt` still returns American and European smelt. The exact ownership check found no shishamo-named form, legacy candidate, or ledger source record. The six proposal source IDs above are unused in both the live ledger and proposal/batch archive.

## Bundled-recipe demand

The complete manifest-ordered scan parsed all **114 recipe files** and **1,123 `ingredients[]` rows**. It searched each full recipe-file text and ingredient row for `shishamo`, `shishamo smelt`, `Hokkaido shishamo`, `karafuto shishamo`, `capelin`, `capelan`, `capelan de l’Atlantique`, *Mallotus villosus*, and *Spirinchus lanceolatus*. **There were no full-file or ingredient-row hits.** No recipe link, recipe-line change, or recipe-specific identity resolution is supported by the bundle.

## Forms, measures, density, conversions, yields, and substitutions

The retailer's whole, semi-dried, frozen, eight-piece pack is one SKU description; its page does not state the pack's net mass or a reusable count-to-weight relationship. MEXT's semi-dried raw food-table row establishes that state for a specific composition entry, not a universal shishamo form. Do not create a form attached to an unallocated label, infer that semi-dried is universal, or turn the retail piece count into a kitchen measure. MAFF's Hokkaido home recipe lists **400 g for four servings**, but its name is ambiguous against MAFF's own statement that the dish is often made with capelin. That single dish quantity is not a generic portion or a cross-species measure. [S01, S03, S06]

No household volume, product density, unit mapping, package yield, edible-yield factor, cooking-yield factor, or mass/count conversion is supported. The reviewed material also establishes no interchangeable quantity between *M. villosus* and *S. lanceolatus*, or between either fish and American/European smelt. Keep `defaultDensity` and unit mappings untouched on the existing capelin row; add no conversion, yield, recipe-line substitution link, global substitution, or contextual substitution rule. A future recipe using an exact shishamo product requires its species and presentation to be resolved before reviewing any numeric or replacement claim.

## Proposed reference and ledger delta

**No reference or ledger delta is proposed.** The disposition is hold, so this review allocates no `ingredient-ref-shishamo` or other new identity, adds no alias to `ingredient-ref-atlantic-capelin`, and reserves no ID. The six source IDs are proposal-only provenance and must not be copied into the shared research ledger as an accepted record. No forms, measures, density, unit mappings, conversion, yield, recipe link, or substitution data are proposed.

## Source register

| Source ID | Source | Supports and limitations |
|---|---|---|
| **WP04-SECTIONP-SHISHAMO-R153-20261015-S01** | MAFF, [Shishamo kanroni (Sweetened boiled smelt), Our Regional Cuisines](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/3588/index.html), accessed 2026-10-15 | History/origin and market availability: distinguishes indigenous Hokkaido shishamo from imported capelin commonly sold as shishamo and notes the dish often uses capelin. The page does not give the scientific binomials; its 400 g recipe amount is specific to the named dish and uncertain fish scope. |
| **WP04-SECTIONP-SHISHAMO-R153-20261015-S02** | MAFF, [Approved Japanese fishery food business operators for export to Vietnam](https://www.maff.go.jp/j/shokusan/hq/i-4/attach/pdf/yusyutu_shinsei_asia-1050.pdf), current list retrieved 2026-10-15 | PDF p. 75 lists CAPELIN (*Mallotus villosus*) and SHISHAMO SMELT (*Spirinchus lanceolatus*) separately among eligible frozen product types. Export-establishment scope; not a Canadian label standard or product synonym ruling. |
| **WP04-SECTIONP-SHISHAMO-R153-20261015-S03** | Seaborn-Toronto, [Shishamo 8pc](https://www.seaborntoronto.com/product-page/shishamo-8pc), accessed 2026-10-15 | Current Canadian retailer page explicitly says Capelin (*Mallotus villosus*) “sold as shishamo”; lists whole small fish, semi-dried, 8 pieces per pack, and frozen storage. One retailer SKU; not evidence for all shishamo or a reusable measurement. |
| **WP04-SECTIONP-SHISHAMO-R153-20261015-S04** | OQLF, [capelan, Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198782/capelan), last updated 2011; accessed 2026-10-15 | Normalizes Québec `capelan` for *Mallotus villosus*, pairs it with English `capelin`, and rejects `caplan`/`capelin` for Québec fish-product marketing. It does not establish a French name for shishamo or for *S. lanceolatus*. |
| **WP04-SECTIONP-SHISHAMO-R153-20261015-S05** | CFIA, [Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), accessed 2026-10-15 | Explains that the list supplies acceptable Canadian English/French fish-label names with scientific names and TSNs. This review did not verify a result for the candidate word/species; no positive or negative label-acceptability conclusion is drawn. |
| **WP04-SECTIONP-SHISHAMO-R153-20261015-S06** | MEXT, [Food Composition Database: Shishamo smelt, semi-dried, raw](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=10_10180_7), 2023 composition-table supplement; accessed 2026-10-15 | The official entry identifies `Shishamo smelt, semi-dried, raw` as *Spirinchus lanceolatus*. It confirms a Japanese food-table product/taxon pairing and one described preparation state; it does not define all products marketed as shishamo, Canadian market naming, or reusable measures/yields. |

## Final disposition

**Hold** the unqualified shishamo product label outside the active picker and ledger. Preserve the existing Atlantic capelin identity and the distinct American/European smelt choices. Reopen only when an exact recipe or Canadian product specification resolves the intended fish and a Québec-facing French name can be supported for that scope.
