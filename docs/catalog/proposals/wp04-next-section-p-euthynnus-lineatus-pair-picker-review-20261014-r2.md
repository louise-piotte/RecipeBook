# WP04 Section P — *Euthynnus lineatus* paired skipjack picker review (R117)

- **Review date:** 2026-10-14.
- **Status:** Root-reviewed and integrated in R117 as a simultaneous, identity-only pair. See the [paired integration README](../batches/wp04-section-p-skipjack-pair-identity-integration-20261014/README.md).
- **Bounded case:** *Euthynnus lineatus* as the partner taxon to the R116 hold for *Katsuwonus pelamis*.
- **Recommendation:** Accepted the paired, identity-only representation with the qualified displays below. Both rows were added together. `skipjack`, `skipjack tuna`, and `listao` deliberately return both taxa; no singleton species assignment is implied.
- **Parent checklist item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section P, exact open item: “Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.” This review addresses only the *K. pelamis* / *E. lineatus* naming pair; Section P remains open.
- **Source IDs:** `WP04-SECTIONP-EUTHYNNUS-LINEATUS-PAIR-20261014-R2-S01` through `S09`; the used records are now in the shared research ledger.

## Decision and conditional pair

The current CFIA Fish List assigns shared names to both taxa. With the current picker, that collision can be represented honestly without aliases: the two rows can use qualified display names that retain the shared terms in both entries. R117 accepted the following bilingual displays; they are qualified catalog labels, not exact statutory naming formulae:

| Taxon | Conditional English display | Conditional French display | Aliases |
|---|---|---|---|
| *Katsuwonus pelamis* | `Skipjack tuna (Listao)` | `Thon listao (bonite à ventre rayé)` | none |
| *Euthynnus lineatus* | `Black skipjack tuna (Listao)` | `Thonine noire (thon)` | none |

These composite displays deliberately keep `Listao` and `skipjack` visible on both rows. The current CFIA list also assigns `Thon` to *E. lineatus*; the French display keeps OQLF’s species-qualified `thonine` term primary and places the broad CFIA name `thon` in parentheses. OQLF’s 1983 GDT entry notes that `thon` was a discouraged term for this fish and a tolerated commercial designation only from 1971 to 1976, so the qualified French term must remain prominent. Do not add `little tunny`, bare `thonine`, bare `bonite`, or either binomial as aliases from this review.

The picker simulation uses the current bilingual name-and-alias matcher in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including its complete-word-phrase pass followed by substring fallback. With these qualified displays and no aliases:

| Query | At the proposal snapshot | R117 pair results |
|---|---:|---:|
| `skipjack`, `skipjack tuna`, `listao` | 0 | 2: both taxa |
| `black skipjack`, `black skipjack tuna`, `thonine noire` | 0 | 1: *E. lineatus* |
| `bonite à ventre rayé` | 0 | 1: *K. pelamis* |
| `tuna`, `thon` | 6 | 8: the six existing tuna identities plus both taxa |

`skipjack tuna` intentionally returns both rows: that phrase occurs within both the *K. pelamis* display and the longer `Black skipjack tuna` display. The user can distinguish the two result labels, and the qualified `black skipjack tuna` query returns only *E. lineatus*. `listao` also remains a two-row search because the CFIA list currently gives that English common name to both species. The simulation exposes shared terms as visible names rather than aliases, so neither short query appears to belong uniquely to one taxon. The broad `bonite` query already reaches other active bonite ingredients and would also reach *K. pelamis* through its qualified French display; do not add a bare `bonite` alias.

## Prior work and current ownership

R116 and its R1 proposal already established the *K. pelamis* hold after seeing the shared `Skipjack` and `Listao` terms, but did not model the current CFIA rows for *E. lineatus* or test a simultaneous two-row display. The tuna-steak recipe-boundary review used *E. lineatus* as a search term but did not decide its identity. Other mentions of skipjack in the katsuobushi and bonito reviews concern different product/species boundaries. No focused *E. lineatus* identity decision was found in the current proposal or batch archive.

Proposal-time snapshot before R117 integration:

| File | Current count | SHA-256 |
|---|---:|---|
| [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,459 references | `0d819668694783ac8975914236aaf447d77c36ae0a2f61fbce52193f22b1738b` |
| [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 105 forms | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json) | 63 candidates | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| [`research-ledger.v1.json`](../research-ledger.v1.json) | 1,799 records | `c34c23d9c6bd631cb9c573bcfa9de7cec7463c3b8977e9f40bacae6489c58568` |
| [`manifest.v1.json`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The manifest-listed recipes contain **1,123 ingredient rows**; the path/NUL/exact-bytes/NUL corpus fingerprint is `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`. Exact-name scans found no active reference or legacy candidate for `Euthynnus lineatus`, `Katsuwonus pelamis`, `black skipjack`, `black skipjack tuna`, `listao`, `skipjack`, `skipjack tuna`, `thonine noire`, or `bonite à ventre rayé`; no tuna/thon form exists among the 105 forms. No exact species binomial record ID was found in the ledger. At the proposal snapshot, there was no active owner for the short shared terms; R117 now represents both taxa.

The current active `tuna` and `thon` queries each return six refs: albacore, Atlantic bluefin, Pacific bluefin, Southern bluefin, generic tuna, and yellowfin. Those broad queries already have several owners. The new pair would make them eight, which is consistent with the current CFIA name crosswalk and does not create a singleton result. Search matches across both language fields regardless of the active display language.

## Taxon, name, and product evidence

The current CFIA Fish List query returns these unique name pairs for the two taxa (the result page repeats them for hazard rows):

| Taxon | CFIA English / French names observed |
|---|---|
| *Euthynnus lineatus* (TSN 172405) | `Listao / Thonine Noire`; `Skipjack / [French blank]`; `Black Skipjack Tuna / Thon`; `Tuna / [French blank]` |
| *Katsuwonus pelamis* (TSN 172401) | `Listao / Bonite à ventre rayé`; `Skipjack / Listao`; `Skipjack Tuna / Thon`; `Tuna / [French blank]` |

This fuller current list means neither `skipjack` nor `listao` can be treated as a unique *K. pelamis* search term. It also means that `tuna` and `thon` are current CFIA names for both species; both terms are already broad in the active recipe picker. The list is a Canadian common-name source, not evidence that every listed name appears on a current Canadian SKU.

ITIS lists *E. lineatus* as a valid species, TSN 172405, with `black skipjack` and `thonine noire`; IATTC uses the common name `Black skipjack tuna` and the code BKJ. OQLF’s GDT entry links the preferred Québec term `thonine` to English `black skipjack` and Latin *E. lineatus*. The OQLF entry is old (updated 1983) and supplies the species/term relationship, while the current CFIA Fish List supplies the current full French common name `Thonine Noire`.

Current Québec-facing manufacturer pages support `thon listao` as commercial French wording for canned *K. pelamis*: Clover Leaf’s French product page names the species in the ingredient declaration, and Ocean’s identifies its product as `Thon listao – Latin: Katsuwonus pelamis`. These are *K. pelamis* product examples only. Targeted Canadian/Québec searches did not establish a current SKU explicitly identifying *E. lineatus*; that bounded search result is not proof that no such product exists. The species-only identity recommendation rests on the current CFIA name crosswalk and taxonomic authorities, not on transferring *K. pelamis* retail labels to *E. lineatus*.

### The canned-tuna table is proposal-era text

The frequently cited tuna table is from the **2017 Canada Gazette, Part I proposed regulations**. Its hermetically sealed product scope lists `Skipjack` for *K. pelamis* and `Black Skipjack` / `Little Tunny` for *E. lineatus*, with French names in the accompanying table. It is proposed text, not a current SFCR species-name table; `Little Tunny` is not among the current CFIA *E. lineatus* names listed above. The current consolidated SFCR is current to 2026-09-21 and contains no “Skipjack” entry. Section 262 addresses the flesh-colour expression for tuna in hermetically sealed packages; CFIA’s current fish-labelling guidance describes that rule. The R116 batch currently calls the Gazette table a narrower SFCR canned-tuna table. Root should correct that source-status wording while keeping the R116 picker hold intact; the current CFIA Fish List independently establishes the cross-taxon names.

## Recipe demand and product-state boundary

There is no *E. lineatus*-specific or *K. pelamis*-specific ingredient row in the 114-recipe corpus. The only tuna row is recipe `111#1`, `1 tuna steak`, linked to `ingredient-ref-tuna`; leave it generic and unchanged. The recipe corpus does not justify a species-specific link, form, or substitution.

The Canadian/Québec product pages reviewed here concern canned *K. pelamis* in water, oil, or flavored preparations. They do not establish a common product form for both taxa, nor a fresh/frozen form for *E. lineatus*. Add identity only; do not create a canned, drained, raw, fresh, frozen, cooked, or prepared form from these pages. Do not infer culinary, safe-cooking, storage, curing, or raw-consumption equivalence from the fact that both species are tuna.

## Measures, density, conversions, yields, and substitutions

No reusable numeric behavior is supported for *E. lineatus* or the pair:

| Evidence reviewed | Limit and catalog decision |
|---|---|
| R116 cites Health Canada CNF code 3082 for raw *K. pelamis*, with source-specific portions and refuse data. | This is not an *E. lineatus* record. Do not transfer its 100 g edible portion, half-fillet weight, food-guide serving, or refuse value to this species or to a canned product. No *E. lineatus*-specific CNF code was established in this review. The CNF site says its 2015 database is no longer being updated while the 2026 dataset is being made available. |
| Manufacturer package sizes and nutrition portions for *K. pelamis* canned products. | SKU/label observations only. For example, Clover Leaf gives a drained half-can portion on one product page; that does not establish a default can size, drained yield, or measure for either species. |
| No species-specific volume, density, unit mapping, or recipe ratio was found. | Keep `defaultDensity` null and `unitMappings` empty on any future identity rows. Add no serving, count-to-mass conversion, yield, or conversion rule. |
| No source supports substitution between these taxa or between canned and fresh/raw states. | Add no global or contextual substitution and no recipe-line substitution link. |

## Source register

Sources were checked on 2026-10-14. Retailer and manufacturer pages can change; product observations below are limited to the pages and SKU state reviewed.

| ID | Source and URL | Use and limit |
|---|---|---|
| **S01** | Canadian Food Inspection Agency, [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list), [current query results](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna), and [guidance on common names](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Current accepted English/French common-name rows, TSNs and Canadian name guidance. Query rows are repeated for hazard categories; the table above collapses duplicate hazard rows. Naming evidence, not picker behavior or proof of current retail SKU usage. |
| **S02** | Integrated Taxonomic Information System, [*Euthynnus lineatus*, TSN 172405](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=0172405) | Valid species and English/French common names; taxonomic authority, not Canadian product-label evidence. |
| **S03** | Inter-American Tropical Tuna Commission, [*Euthynnus lineatus* (BKJ)](https://www.iattc.org/en-US/Resources/Species/Detail/BKJ) | Fisheries identity and `Black skipjack tuna`; distinguishes it from *K. pelamis*. Fisheries source, not Québec retail terminology. |
| **S04** | Office québécois de la langue française, [GDT: thonine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488161/thonine) | Preferred `thonine`, English `black skipjack`, Latin *E. lineatus*, and the dated discouraged-term note for `thon`; entry last updated 1983. Use current CFIA for the full `thonine noire` spelling. |
| **S05** | Government of Canada, [Safe Food for Canadians Regulations, current consolidated text](https://laws-lois.justice.gc.ca/eng/regulations/SOR-2018-108/FullText.html), and CFIA, [labelling requirements for fish](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | Consolidated SFCR current to 2026-09-21; §262 requires the applicable flesh-colour expression for hermetically sealed tuna. The current regulation contains no species-specific `skipjack` table. |
| **S06** | Canada Gazette, [Part I proposed regulations, 2017-01-21](https://gazette.gc.ca/rp-pr/2017/2017-01-21/html/reg1-eng.html#s253) | Proposal-era hermetically sealed tuna table only. Do not cite it as enacted current SFCR text. |
| **S07** | Clover Leaf, [Thon pâle émietté, Listao dans l’eau](https://www.cloverleaf.ca/fr/produits/thon-pale-emiette-clover-leaf-listao-dans-leau/) | Current French product page with `thon listao` and *K. pelamis*; canned product wording only. Nutrition portion/packaging details remain SKU-specific. |
| **S08** | Ocean’s, [Thon pâle entier et émietté](https://oceans.ca/fr/products/thon-pale-entier-et-emiette/) | Current French manufacturer page explicitly identifies `Thon listao` as *K. pelamis*. Product-specific evidence, not an *E. lineatus* crosswalk or generic form. |
| **S09** | Health Canada, [CNF serving portions, food code 3082](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3082), and [CNF search page](https://food-nutrition.canada.ca/cnf-fce/) | Code 3082 is the R116 raw skipjack/*K. pelamis* evidence only; its measures are not transferred. The 2015 CNF search page states that dataset is no longer being updated. No *E. lineatus*-specific CNF code was established here. |

## R117 integration result

Root added both rows together in `PROTEIN`, with the qualified bilingual displays above, empty aliases, null densities, and empty unit mappings. The source-specific CNF code 3082 half-fillet (98 g) and Food Guide (90 g) portions are recorded only on the *K. pelamis* ledger record. No measurements transfer to *E. lineatus* or canned products. No forms, recipe links, conversions, yields, or substitutions were added; generic `ingredient-ref-tuna` and recipe `111#1` remain unchanged.

The R116 proposal, hold README, and Section P checklist were corrected to describe the 2017 Gazette table as proposal-era text and current SFCR §262 as a flesh-colour rule. The Section P parent remains open. See the [paired integration README](../batches/wp04-section-p-skipjack-pair-identity-integration-20261014/README.md).

No app or emulator tests were run for these JSON catalog additions under the updated `AGENTS.md` rule. Static validation results are recorded in the integration README.
