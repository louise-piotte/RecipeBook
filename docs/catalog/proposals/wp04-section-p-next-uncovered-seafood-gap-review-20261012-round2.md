# WP04 Section P — wahoo / thazard bâtard picker-boundary review

- **Review and source-access date:** 2026-10-13.
- **Status:** Integrated documentation-only hold on 2026-10-13; no catalog or ledger change. See [the integration note](../batches/wp04-section-p-wahoo-picker-boundary-hold-integration-20261013/README.md).
- **Packet type:** Review of one uncovered regional finfish identity, CFIA name scope, Québec terminology, picker behavior, bundled-recipe demand, product forms, measurements, and substitution evidence.
- **Decision:** Recognize *Acanthocybium solandri* as a supported identity candidate with the qualified Québec term **thazard bâtard**, but keep it unallocated in the active picker. CFIA also uses the same unqualified market pair **Wahoo / Thazard** for *Scomberomorus* spp. A display-only `wahoo / thazard bâtard` row would therefore make a bare `wahoo` query resolve to one species even though the CFIA label covers both *A. solandri* and the genus-level *Scomberomorus* entry. No alias, form, measure, density, unit mapping, conversion, yield, recipe link, ledger record, or substitution behavior is proposed.

## Candidate boundary and disposition

Section P still has an open regional-fish gap. This review selects wahoo as a distinct candidate from the currently integrated seafood rows and from active or recent work on lumpfish roe, Atlantic pollock, arraw, and sprouted buckwheat flour. OQLF's GDT directly pairs edible-fish **thazard bâtard**, English **wahoo**, and *Acanthocybium solandri*. CFIA also lists *A. solandri* as **Wahoo / Thazard**, so the identity/name pair is well supported for Canadian food terminology.

The hold is about the scope of the product label, not a lack of support for the species identity. The exact CFIA collision is:

| CFIA TSN | Scientific name | English label | French label | Scope |
|---|---|---|---|---|
| 172451 | *Acanthocybium solandri* | Wahoo | Thazard | Species-level identity supported by OQLF as `thazard bâtard / wahoo`. |
| 172434 | *Scomberomorus* spp. | Wahoo | Thazard | Genus-level entry; its CFIA result also lists `Spanish Mackerel`. |

These are two recognized food-label scopes with the same exact bilingual market label. The shared label does not make *A. solandri* and *Scomberomorus* equivalent taxa. CFIA describes its Fish List as accepted Canadian fish-label names paired with scientific names and taxonomic serial numbers; it is market-label evidence, not an instruction to equate the taxa.

### Québec wording and qualified-name decision

OQLF's GDT entry is in the edible-fish domain, gives **thazard bâtard** as the preferred term, and directly pairs it with English **wahoo** and *Acanthocybium solandri*. Its entry was last updated in 2004. That is specific Québec terminology evidence, but not current evidence of retailer stock.

**Thazard bâtard is a safe qualified French term for the *A. solandri* candidate.** An exact `thazard bâtard` picker query would identify this candidate without matching the current `thazard` rows. It is not, by itself, a safe reason to activate a bilingual row: the same row would also index unqualified English `wahoo`, whose CFIA scope includes *Scomberomorus* spp. Keep the entire candidate out of the shared picker until product-name scope can be preserved or the picker can show the competing scope. Do not shorten the French display to `thazard`.

OQLF records **thazard bois**, **thazard noir**, **thazard raité**, **thazard rélé**, and **thon banane** as regional French synonyms of `thazard bâtard`; it records **ono**, **Pacific kingfish**, **peto**, and **wahoo fish** as regional English synonyms of `wahoo`. They are terminology findings, not evidence of Québec inventory or a way to repair the English CFIA collision. Leave all inactive while the identity is held. In particular, do not add only the qualified French term as an active alias to another fish identity.

## Exact ownership and current snapshot

The live data snapshot audited on 2026-10-13 contained 1,329 active ingredient references, 98 ingredient forms, 64 legacy-import candidates, and 1,637 research-ledger records (6,089 source entries and 8 unit-conversion observations). Normalized whole-value checks across all strings in references, forms, legacy candidates, and ledger records found no exact owner for `ingredient-ref-wahoo`, `candidate-wahoo`, `wahoo`, `thazard bâtard`, *Acanthocybium solandri*, `ono`, `Pacific kingfish`, `peto`, `wahoo fish`, `thazard bois`, `thazard noir`, `thazard raité`, `thazard rélé`, or `thon banane`.

The only existing proposal/batch search hit for wahoo is [WP06 Oceania animal-foods gap sweep](wp06-oceania-animal-foods-gap-sweep-20261012.md): its Tourism Fiji source note says one kokoda recipe lists wahoo among its fish options. That is a contextual source mention, not an identity allocation, exact owner, or global/app substitution. No prior wahoo identity proposal or hold was found. The proposal-local source-ID prefix `WP04-P-WAHOO-BOUNDARY-20261013-R2` had no prior occurrence.

| Live file | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,329 | 425,734 | `9b7f314205bddd57e6dab025c73dbcc4e96d945a3f8b0f349af3e6b832669853` |
| `ingredient-forms.v1.json` | 98 | 73,589 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| `legacy-import-identities.v1.json` | 64 | 15,264 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,637 records | 5,999,067 | `a976db6579ae00a627c2f95633dfd5955c3d82b62a4e77ebd0ac553c685437b2` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

These are a review-time snapshot, not a request to edit the files listed. No candidate reference or ledger entry is reserved by this proposal.

## Current picker projection

The projection applies the current normalization and complete-phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including display names, aliases, and attached form terms. The “with candidate” column is a static hypothetical row using only the qualified EN/FR pair `wahoo / thazard bâtard`, no aliases, and no forms; the row is not active.

| Query | Current results | With hypothetical display-only row | Effect |
|---|---|---|---|
| `wahoo` | None | Wahoo / thazard bâtard | One apparent result would receive a label that CFIA also assigns to *Scomberomorus* spp.; this is the decisive hold boundary. |
| `thazard bâtard` | None | Wahoo / thazard bâtard | The qualified Québec phrase uniquely finds the candidate. This does not fix the English label scope on the same row. |
| `thazard` | Narrow-barred Spanish mackerel; spotted Spanish mackerel | Those two plus Wahoo / thazard bâtard | Preserves multiple visible fish choices; do not use bare `thazard` as a display or alias. |
| `mackerel` | Atlantic mackerel; narrow-barred Spanish mackerel; Pacific mackerel; spotted Spanish mackerel | Same four rows | No result-set change. |
| `maquereau` | Atlantic mackerel; gooseberry; Pacific mackerel | Same three rows | Existing phrase matching also finds `groseille à maquereau`; no candidate row is added by this query. |
| `ono` | Five substring-fallback results: cream of tartar, dextrose, monosodium glutamate, ogbono kernels, and okonomi sauce | Same five results | No OQLF synonym is active while the candidate is held. If `ono` were later added as an alias, phrase-first matching would replace these fallback results with the candidate. |
| `peto` | Dried scallop; scallop | Same two substring-fallback results | `peto` occurs inside normalized `pétoncle`; adding the source-listed synonym later would make phrase-first search return the candidate alone. Keep it inactive during the hold. |

## Bundled recipe demand

The manifest-listed corpus was scanned in manifest order: **114 recipe files, 1,123 ingredient rows, 753,792 bytes**, corpus digest `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`. Matching normalized case, accents, punctuation, and whitespace.

The full recipe JSON fields and ingredient rows were checked for `wahoo`, `thazard bâtard`, *Acanthocybium solandri*, `ono`, `Pacific kingfish`, `peto`, `wahoo fish`, `thazard bois`, `thazard noir`, `thazard raité`, `thazard rélé`, and `thon banane`. Candidate-term results: **zero recipe-file hits and zero ingredient-row hits**. Ingredient rows also had zero whole-phrase matches for the adjacent broad words `mackerel`, `maquereau`, and `thazard`. The corpus supports no recipe link, amount, preparation state, form, or recipe-scoped substitution for this identity.

## Product forms, measurements, and substitutions

Canadian supplier evidence shows that wahoo is sold through commercial seafood channels, but reviewed listings do not establish Québec retail availability or a standardized home-cooking measure:

- Seacore Seafood Products in Vaughan, Ontario identifies **Wahoo / *Acanthocybium solandri*** and lists fresh, wild fish, available whole or as fillet, product of the U.S.A. The page gives no size or package weight.
- Boni Seafood Inc., which lists a Vancouver, British Columbia address, has a current supplier page identifying **Wahoo / *A. solandri***, wild-caught in the Pacific with Ecuador/Peru origin. It advertises supplier-specific portion-size bands of 6–8, 8–10, and 10–12 oz and commercial presentations including whole round, headed/gutted products, fillets, loins, steaks, and portions; packing formats include 10 kg blocks and 20 kg poly sacks. These wholesale specs are product evidence only: they are not standardized recipe servings, edible-yield data, a volume measure, or a conversion for another wahoo product.
- Health Canada's Canadian Nutrient File (CNF) 2026 release and food-search portal were reviewed as the current Canadian food-composition sources. The accessible search did not surface a species-matched wahoo serving record, and the downloadable data tables could not be inspected through this review's browser access. Treat numeric evidence as unresolved; this is not proof that no analysis exists. No density, unit mapping, count weight, whole-to-fillet yield, or kitchen-volume conversion is proposed.
- The only located recipe-context mention is the prior WP06 Tourism Fiji kokoda source. Its note records one recipe's `150 g` fish line and says Spanish mackerel/walu, snapper, or wahoo may be selected. Preserve that only as contextual evidence from that specific kokoda source. It does not resolve wahoo to the CFIA species, create a bundled recipe link, or support a substitution rule for this catalog. Do not add a global or contextual substitution record.

Accordingly, keep candidate identity, aliases, forms, product measures, density, conversions, yields, recipe links, and substitution behavior out of active data. The supplier pages document products; they do not override the CFIA label collision or resolve current Québec wording on a consumer package.

## Revisit conditions

Revisit the hold only when an active picker can preserve the distinct CFIA scopes or a Canadian/Québec product source provides an unambiguous *A. solandri* consumer label and the picker can retain that product scope. `Thazard bâtard` is suitable as the qualified French name for that identity, but do not pair it with an active unqualified English `wahoo` row under the current single-result behavior. Recheck live ownership, the complete recipe corpus, and picker projection before any future allocation. Source-listed regional synonyms, product states, and supplier pack sizes remain research evidence until independently justified for database use.

## Sources

Online sources were checked on 2026-10-13. IDs are proposal-local and do not create ledger records.

| Source ID | Source | Evidence and limits |
|---|---|---|
| `WP04-P-WAHOO-BOUNDARY-20261013-R2-S01` | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fpresults.asp) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Current result rows list TSN 172451 *Acanthocybium solandri* as `Wahoo / Thazard`, and TSN 172434 *Scomberomorus* spp. with the same exact labels. CFIA describes the list as accepted Canadian fish-label names paired with scientific names and TSNs. This documents market-name scope, not taxonomic equivalence or Québec shelf availability. |
| `WP04-P-WAHOO-BOUNDARY-20261013-R2-S02` | CFIA, [Fish product common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) | Explains the Canadian common-name scope for fish products and points to the Fish List as guidance. Regulatory/commercial labeling context, not a culinary substitution source. |
| `WP04-P-WAHOO-BOUNDARY-20261013-R2-S03` | OQLF, GDT, [thazard bâtard](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869811/thazard-batard) — last updated 2004 | In edible-fish terminology, gives preferred Québec `thazard bâtard`, English `wahoo`, and *Acanthocybium solandri*. It records regional French and English synonyms. Terminology evidence, not current retail inventory. |
| `WP04-P-WAHOO-BOUNDARY-20261013-R2-S04` | Seacore Seafood Products, [Wahoo](https://www.seacoreseafood.com/product/Wahoo) — Canadian supplier in Vaughan, Ontario | Identifies *A. solandri*; says fresh, wild, product of U.S.A., available whole or fillet. The product page gives no household measure or yield. |
| `WP04-P-WAHOO-BOUNDARY-20261013-R2-S05` | Boni Seafood Inc., [Wahoo (*Acanthocybium solandri*)](https://boniseafood.com/product/wahoo-acanthocybium-solandri/) and [contact information](https://boniseafood.com/contact-us/) — Canadian supplier in Vancouver, B.C. | Lists supplier-specific portion bands, commercial presentations, packing, fishing area, and country of origin. Those product specs do not establish a consumer serving, density, edible yield, or common conversion. |
| `WP04-P-WAHOO-BOUNDARY-20261013-R2-S06` | Health Canada, [Canadian Nutrient File 2026](https://open.canada.ca/data/en/dataset/1b6139bd-ed7e-4043-bc28-ff00e10f3109) and [food-search portal](https://food-nutrition.canada.ca/cnf-fce/newSearch) | Current Canadian composition source reviewed for a wahoo serving/measure record. The browser search did not surface one and did not allow inspection of downloadable tables; record the result as unresolved, not a definitive absence finding. |
| `WP04-P-WAHOO-BOUNDARY-20261013-R2-S07` | Tourism Fiji, [How to Make Fijian Kokoda](https://www.fiji.travel/things-to-do/local-eats/how-to-make-fijian-kokoda), previously noted as WP06 source S18 | WP06 records one recipe's fish amount/options, including wahoo. Source text was indexed but direct retrieval returned 403 in the earlier review. Retain as one recipe-context mention only; it is not an identity allocation, bundled recipe link, or global/app substitution. |

No app tests or emulator checks were run: this proposal changes documentation only and does not modify the database JSON, app, or tests.
