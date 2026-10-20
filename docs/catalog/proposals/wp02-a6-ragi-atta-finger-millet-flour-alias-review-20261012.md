# WP02 A6 regional flour naming review: ragi atta

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Accepted and integrated as one English alias on the existing finger-millet-flour reference.
- **Scope:** Decide whether the exact English product phrase `ragi atta` belongs as an alias on the existing `ingredient-ref-finger-millet-flour`.
- **Source IDs:** `WP02-A6-RAGI-ATTA-20261012-S01` through `S05`; these sources and the accepted decision are recorded on the existing finger-millet-flour ledger record.
- **A6 status:** The broad WP02 A6 checklist remains open. This narrow alias proposal does not finish the regional-grain-flour review.

## Root integration

Added only `ragi atta` as an English alias to `ingredient-ref-finger-millet-flour`. Retained the
existing bilingual display and `ragi flour` / `nachni flour` aliases; bare `ragi` remains owned by
the grain row. No recipe links or numeric behavior changed. The post-integration snapshot and static
checks are recorded in the
[alias integration README](../batches/wp02-a6-ragi-atta-finger-millet-flour-alias-integration-20261012/README.md).

## Recommendation

**Recommend adding only `ragi atta` as an English alias** on the existing `ingredient-ref-finger-millet-flour` reference. Current Canadian supplier and retail pages use the exact phrase and identify the product as finger-millet flour [S02–S04]. The 2025 FSSAI standard independently defines ragi flour as a milled product from *Eleusine coracana* and names finger millet as Ragi, which grounds the product boundary [S01].

Keep the current display pair `finger millet flour / farine de ragi` and the existing aliases `ragi flour` and `nachni flour`. Keep bare `ragi` on the separate finger-millet grain reference. Do not add `ragi aata`, `ragi ka atta`, `finger millet atta`, `nachni atta`, or French constructions such as `farine de ragi atta`; the reviewed Canadian sources support the exact phrase `ragi atta`, while the current French-facing Canadian listing uses `farine de ragi` [S02–S04]. Do not treat `sprouted ragi atta` as an unqualified flour synonym: that is a separately qualified product phrase and is outside this proposal [S04].

This proposal adds no new identity or form, recipe link, measurement, density, unit mapping, conversion, yield, substitution, or other numeric behavior. The existing ledger states for measurement and substitution research remain `not_yet_researched`.

| Phrase or change | Disposition | Evidence boundary |
|---|---|---|
| `ragi atta` | **Add as one English alias** to `ingredient-ref-finger-millet-flour`. | Bloom Global Foods titles a Canadian product `Ragi Atta (Finger Millet)` and describes it as ragi/finger-millet flour; independent Canadian product listings provide the same exact phrase [S02–S04]. |
| `finger millet flour / farine de ragi` | Retain as the current bilingual display pair. | The current French-facing Walmart Canada page uses `Farine de Ragi`; no French alias or display change is proposed [S03]. |
| `ragi flour`, `nachni flour` | Retain the existing English aliases. | They already belong to the live target row; this review adds only the distinct exact phrase `ragi atta`. |
| Bare `ragi` | Keep on `ingredient-ref-finger-millet`, the grain row. | The active grain and flour identities remain separate. The product sources qualify the flour name. |
| `ragi aata`, `ragi ka atta`, `finger millet atta`, `nachni atta`; French `farine de ragi atta` | Do not add in this proposal. | These exact forms are not needed to resolve the reviewed phrase. The immediately preceding nachni review also keeps `nachni atta` inactive. |
| `sprouted ragi atta` | Keep outside the unqualified alias decision. | A Canadian product page expressly qualifies it as sprouted; this proposal makes no processed-flour equivalence or form decision [S05]. |
| New ragi-flour ID, form, or recipe link | Do not create. | The source wording resolves to the already verified finger-millet-flour row, and no bundled recipe uses the candidate phrase. |

## Naming evidence and Québec/Canadian boundary

FSSAI's current consolidated cereal standard, Version 4 dated 2025-05-07, lists `Finger Millet (Ragi or Mandua) — Eleusine coracana` in its millet scope and defines ragi flour as the product obtained by milling dried mature grains of *Eleusine coracana* [S01]. This is authoritative identity and flour-class evidence, not a Canadian naming rule and not a source of kitchen measures or conversions.

Bloom Global Foods, whose product page lists its Mississauga, Ontario address, uses the exact title `Bloom Organic Bazaar Ragi Atta (Finger Millet)`. Its description says the product is “Ragi Flour, also known as Finger Millet flour” [S02]. The Canadian supplier's heading and description directly associate the exact alias with the existing target identity. Veehacart independently describes its Canadian-priced hand-pounded finger-millet flour as also known as `Ragi Flour or Ragi Atta` [S04]. These product pages establish source-specific naming, not a universal milling method or a distinct flour grade.

For Canadian French context, the French-facing Walmart Canada listing for Aachi includes `Ragi Atta` in its item title, describes the item as 100% finger millet, and uses `Farine de Ragi` in its French product wording [S03]. The item was marked out of stock when checked; that listing is terminology evidence, not an availability claim or an OQLF ruling. Retain the existing fr-CA display `farine de ragi`, and do not mechanically translate the English regional phrase into a new French alias.

## Pre-integration catalog, exact-key, and ledger audit

Snapshot read from the shared working tree on 2026-10-12. File hashes cover the exact file bytes. The recipe-corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, its exact file bytes, and a trailing NUL byte.

| Surface | Current snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,225 rows; 391,768 bytes | `c6a949abe54b0598fa9db207aad047a51ecb2fdfac72d689bf4454c70bae141e` |
| Ingredient forms | 86 rows; 64,612 bytes | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| Legacy import candidates | 66 rows; 15,752 bytes | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Research ledger | 1,524 records; 5,203 source entries; 4,266 distinct source IDs; 8 unit conversions; 5,045,553 bytes | `b21803cad548fec3e0ed94ceeced3eea072c2e96b393393dfe3c5d29e81e7433` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated `BundledIngredientCatalog.kt` | 1 file; 1,225 references; 536,587 bytes | `d4f678974c5ac8939108afbd2f54f72642bdacd049f417f94afca5215c89eabc` |
| Active catalog plan | A6 parent item remains unchecked; 684,003 bytes | `4273659c80f9cba18ac0aac76db5712240afabbdb00895e22db19ba8eb86c664` |

The active target row is `ingredient-ref-finger-millet-flour`, category `FLOUR_AND_STARCH`, with English/French display `finger millet flour / farine de ragi`, aliases `ragi flour` and `nachni flour`, `defaultDensity: null`, and no unit mappings. Its ledger record is `verified`, with `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`; it has six existing source entries and two accepted decisions, neither of which covers `ragi atta`. The separate grain record `ingredient-ref-finger-millet` retains `ragi` as an English alias.

I checked normalized exact keys across reference IDs/names/aliases, form IDs/labels/match terms, legacy IDs/names/aliases, and ledger record IDs. The key normalization case-folds, removes accents, turns punctuation into spaces, and collapses whitespace.

| Candidate key or ID | Exact current owner |
|---|---|
| `finger millet flour`, `farine de ragi`, `ragi flour`, `nachni flour`, `ingredient-ref-finger-millet-flour` | `ingredient-ref-finger-millet-flour` |
| `ragi` | `ingredient-ref-finger-millet` (grain) |
| `ragi atta`, `ragi aata`, `ragi ka atta`, `finger millet atta`, `nachni atta`, `farine de ragi atta`, proposed `ingredient-ref-ragi-atta` | None across active reference keys, forms, legacy candidates, or ledger record IDs |

The proposed alias and proposed ID had no exact normalized owner before integration. This is a
no-collision result, not a runtime picker test. No separate ragi-atta candidate record exists in the
ledger; the accepted alias decision uses the existing flour record.

## Bundled recipe demand

All 114 manifest-listed recipe JSON files and all 1,123 ingredient rows were searched across every string field using normalized whole-phrase matching. Terms included `ragi atta`, spelling and wording variants, the current display and aliases, the proposed and target IDs, `nachni atta`, and the sprouted phrase. The scan found **zero recipe-file hits and zero ingredient-row hits** for the reviewed terms, and **zero ingredient rows linked directly** to `ingredient-ref-finger-millet-flour`. No recipe link or recipe edit is proposed.

## Proposal-local source register

Sources were accessed on 2026-10-12. The source IDs below are unique to this file and were absent from the shared ledger at the proposal snapshot.

| ID | Source and evidence | Limit |
|---|---|---|
| **WP02-A6-RAGI-ATTA-20261012-S01** | Food Safety and Standards Authority of India, [Food Safety and Standards Regulations, Chapter 2.4: Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 dated 2025-05-07, §23(6), PDF p. 17, and §2.4.34, PDF p. 78. Lists finger millet (Ragi or Mandua) as *Eleusine coracana* and defines ragi flour as its milled product. | Primary food standard, not Canadian/French alias authority. Its quality specifications are not adopted as recipe measures, conversions, or flour behavior. |
| **WP02-A6-RAGI-ATTA-20261012-S02** | Bloom Global Foods, [Bloom Organic Bazaar Ragi Atta (Finger Millet)](https://bloomglobalfoods.com/our-products/bloom-organic-bazaar-ragi-atta-finger-millet/). Current supplier page gives the exact name and describes the product as ragi flour, also known as finger-millet flour; the page lists the supplier's Mississauga, Ontario address. | Canadian supplier product wording; source-specific description only. Origin, nutrition, and culinary marketing are not generalized. |
| **WP02-A6-RAGI-ATTA-20261012-S03** | Walmart Canada, [Aachi Farine de Ragi / Ragi Atta](https://www.walmart.ca/fr/ip/Aachi-Farine-de-Ragi-2-2-Lb-1-kg-Millet-Doigts-Grains-Entiers-Ragi-Atta-pour-Roti-M-lange-de-Dosa-Bouillie-et-Plus/2VJJKSBUJGHX), French-facing product title and product details. Identifies the item as 100% finger-millet flour and uses `Farine de Ragi`; marked out of stock when checked. | Canadian marketplace listing, not OQLF terminology or a claim of present availability. Its French text is not used to create a new French alias. |
| **WP02-A6-RAGI-ATTA-20261012-S04** | Veehacart, [Organic Mandya Hand Pounded Finger Millet/Ragi Flour](https://veehacart.ca/products/organic-hand-pounded-finger-millet-ragi-flour), current Canadian-dollar product page. Describes the flour as finger-millet flour, also known as Ragi Flour or Ragi Atta. | Retailer description; its hand-pounding method is product-specific and not proposed for the unqualified flour identity. |
| **WP02-A6-RAGI-ATTA-20261012-S05** | Veehacart, [Conscious Food Sprouted Ragi Atta / Sprouted Finger Millet Flour](https://veehacart.ca/products/sprouted-ragi-atta-sprouted-finger-millet-flour), current Canadian-dollar product page. The title explicitly qualifies the product as sprouted. | Product-specific wording; it does not establish a universal sprouting process or a form relationship to unqualified finger-millet flour. |

## Disposition

Integrated one English alias, `ragi atta`, on the existing finger-millet-flour row. Retain `finger millet flour / farine de ragi`, `ragi flour`, and `nachni flour`; keep bare `ragi` on the grain row. Add no French alias, identity, form, recipe link, measure, density, mapping, conversion, yield, substitution, or other numeric behavior. The zero-demand recipe scan does not warrant recipe changes. Keep the broad A6 checklist open.
