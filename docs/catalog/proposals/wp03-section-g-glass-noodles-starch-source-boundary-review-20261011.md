# WP03 Section G glass-noodle starch-source boundary review

- **Reviewed:** 2026-10-11
- **Disposition:** Keep unqualified `glass noodles`, `cellophane noodles`, and proposed broad French equivalents held. Do not add a broad reference or alias to the mung-bean or sweet-potato-starch references. Preserve the two source-qualified noodle identities as separate products.
- **Scope:** Re-audit the live Section G entries and evidence after the October 11 catalog updates; check exact normalized owners, current picker phrase matching, forms, legacy candidates, ledger, and every manifest recipe ingredient line. Compare current Canadian and Québec product wording and ingredient declarations. This proposal changes no shared files.
- **Source IDs:** New sources use the proposal-local prefix `WP03-GLASS-BOUNDARY-20261011` with suffixes S01–S08. The prefix was searched in `docs/` and `app/` and had no existing match. Existing ledger source IDs WP03-S162 and WP03-SPN-20261011-S01 are retained where used.

## Current snapshot

Snapshot checked on 2026-10-11:

| Artifact | Current count or result |
| --- | ---: |
| Active ingredient references | 975 |
| Active ingredient forms | 61 |
| Research-ledger records / source entries / distinct source IDs | 1,250 / 3,952 / 3,244 |
| Legacy import candidates | 75 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |
| Active unit definitions | 30 |
| Active direct / contextual substitution rules | 0 / 0 |
| Active package-yield rows | 1; none for noodles |
| Active reference densities / non-empty unit mappings | 0 / 0 |
| Non-null form densities | 0 |

The Section G checklist still calls for reviewing glass noodles by starch source. The live, source-qualified noodle references are:

| Reference | Active labels, category, and boundary |
| --- | --- |
| `ingredient-ref-bean-thread-cellophane-noodles` | `bean thread cellophane noodles / nouilles à base de farine de haricot mungo`; no aliases; `LEGUME_AND_PULSE`. The exact English–French pair comes from OQLF's entry for the mung-bean-flour product. |
| `ingredient-ref-sweet-potato-starch-noodles` | `sweet potato starch noodles / nouilles à base de fécule de patate douce`; aliases EN `sweet potato glass noodles`, FR `vermicelles de patate douce`; `GRAIN_AND_CEREAL`. The existing identity is limited to finished products whose product evidence names sweet-potato starch; it does not claim a sole-starch formula. |

The active raw-material references `mung bean starch / amidon de haricot mungo` and `sweet potato starch / fécule de patate douce` are in `FLOUR_AND_STARCH`; they are not finished noodle products. Rice vermicelli and shirataki are also separate active noodle identities. No category is proposed for a generic glass-noodle reference because this review recommends holding that reference.

## Exact-key, search, forms, ledger, and recipe audit

Active reference labels and aliases, all 61 forms and their labels/match terms, 75 legacy candidates, all 1,250 ledger records, and every recipe ingredient line were checked. Exact keys use the app normalizer: case-folding, Unicode compatibility decomposition and accent removal, `œ/oe`, `æ/ae`, and `ß/ss` folding, ampersand expansion, and punctuation/space normalization.

| Candidate or neighboring key | Exact normalized active owner | Current phrase-first picker match |
| --- | --- | --- |
| `glass noodles`, `glass noodle` | None | `glass noodles` returns `ingredient-ref-sweet-potato-starch-noodles`, because that row has the longer alias `sweet potato glass noodles`. |
| `cellophane noodles`, `cellophane noodle` | None | `cellophane noodles` returns `ingredient-ref-bean-thread-cellophane-noodles`, because the phrase occurs in its longer display name. |
| `nouilles de verre`, `nouilles transparentes`, `nouilles cellophane` | None | No current match. |
| `bean thread cellophane noodles` | `ingredient-ref-bean-thread-cellophane-noodles` | Same reference. |
| `nouilles à base de farine de haricot mungo` | `ingredient-ref-bean-thread-cellophane-noodles` | Same reference. |
| `sweet potato starch noodles`, `sweet potato glass noodles` | `ingredient-ref-sweet-potato-starch-noodles` | Same reference. |
| `nouilles à base de fécule de patate douce`, `vermicelles de patate douce` | `ingredient-ref-sweet-potato-starch-noodles` | Same reference. |
| `dangmyeon`, `japchae noodles`, `starch noodles` | None | Bare `dangmyeon` and `japchae noodles` have no current match; `starch noodles` phrase-matches the source-qualified sweet-potato display. |
| `mung bean noodles`, `mung bean vermicelli`, `bean thread noodles`, `fensi`, `lungkow vermicelli` | None | No exact candidate identity. |

The phrase-first results above are based on the current matcher in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: a complete phrase within a longer indexed term counts as a match. They are not exact-key ownership. Thus a bare search for `glass noodles` currently points to a starch-qualified product, and a bare `cellophane noodles` search points to the mung-bean product, even though neither bare phrase is an active exact key. Adding broad rows while retaining those qualified terms would create overlapping picker results. Do not turn either phrase into an alias on a particular starch-source reference.

No one of the 61 active forms has a label or match term for glass/cellophane noodles, bean threads, mung-bean noodles, sweet-potato-starch noodles, dangmyeon, or japchae noodles. None of the 75 legacy candidates contains an exact or relevant candidate identity. There is no standalone generic glass/cellophane record in the ledger. The ledger's accepted record `ingredient-ref-bean-thread-cellophane-noodles` cites WP03-S162 and explicitly keeps generic glass noodles, rice vermicelli, and rice noodles separate; its measurement and substitution research states remain `not_yet_researched`. The accepted sweet-potato-starch noodle record cites WP03-SPN-20261011-S01–S11, limits identity to product evidence for sweet-potato starch, and likewise adds no preparation form, density, mapping, yield, or substitution. The mung-bean- and sweet-potato-starch ingredient-reference records remain separate from finished noodles. The broader rice-noodle ledger candidate remains unresolved; it does not establish a glass-noodle identity.

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for glass/cellophane terms, bean-thread and mung-bean noodle terms, sweet-potato-starch noodle terms, bare dangmyeon/japchae terms, French equivalents, and the two active noodle reference IDs: **zero matching ingredient lines, zero reference-ID links, and zero direct candidate phrase hits in full recipe text**. There is no bundled recipe demand for a generic or source-qualified glass noodle.

## Product boundary and Québec French

The current product evidence does not make bare `glass noodles` a stable botanical or formulation identity. Canadian listings use the phrase for more than one starch profile. Haisue calls a Long Pin Lungkow product `Vermicelli (Bean Thread)` and says it is also known as mung-bean vermicelli or glass noodles, while listing potato starch, tapioca starch, mung-bean starch, and water. Haisue separately sells a Daesang `Sweet Potato Glass Noodle` with sweet-potato starch plus sodium alginate, chitosan oligosaccharide, and malic acid. Well.ca's Canadian listing uses `Bean Vermicelli Glass Noodles` for an Eat Wholesome product listing pea starch, mung-bean starch, and water. These are retailer product claims, not a universal recipe; the Haisue items showed backorder status and Well.ca's listing showed notification when available at access. [S01–S03]

This variation is not limited to a single retailer. The Japanese manufacturer Marumatsu calls products `Glass noodles`/harusame and lists green beans, mung beans, and potato starch as main materials; it separately lists a mung-bean-starch harusame product. Sempio's manufacturer page calls its finished product `Glass Noodles` and lists both tapioca starch and sweet-potato starch. These pages document their own products and terminology, not a global standard. The 2022 Korean food-science paper in the existing ledger examines dangmyeon prepared from corn, potato, and sweet-potato starches, so bare `dangmyeon` should not be treated as a reliable alias for the active sweet-potato row. [S06, S07, WP03-SPN-20261011-S01]

For Québec French, OQLF's exact term pair is the strongest specific boundary: `bean thread cellophane noodles / nouilles à base de farine de haricot mungo`; its entry (last updated 1997) also records several mung-bean-specific French variants. This supports the existing qualified identity only. Current French Canadian listings are similarly source-qualified: Montréal retailer SUE Foods uses `Vermicelles aux haricots (lungkow)` for a product listing pea and green mung-bean starches, and Walmart Canada uses `Vermicelles de Patates Douces` for a SunGiven listing whose ingredient is sweet-potato starch. A current Haisue French prepared-product page uses `nouilles de verre` in its title but describes the included noodles as `vermicelles de patate douce`; a Montréal restaurant menu likewise uses `nouilles de verre de patate douce` alongside `sweet potato glass noodles`. These uses are specific to a sweet-potato product or dish and do not support `nouilles de verre` as a broad Québec French catalog alias. Walmart's listing was out of stock and warns that supplier/marketplace product data may not be independently verified; the Haisue prepared-product page has no ingredient panel. [WP03-S162, S04, S05, S08]

### Recommended identity and alias boundary

| Item | Disposition |
| --- | --- |
| Broad identity `glass noodles` | **Hold.** The term covers marketed products with differing starch inputs and lacks direct bundled recipe demand. This review does not assign a category to the held identity. |
| Broad English aliases `cellophane noodles`, `bean threads`, `crystal noodles`, `starch noodles`, `mung bean vermicelli` | **Do not add.** These terms are source- or product-family-sensitive; the active English display already gives the explicit mung-bean cellophane pair. |
| Broad French aliases `nouilles de verre`, `nouilles transparentes`, `nouilles cellophane`, `vermicelles transparents` | **Hold.** The reviewed Québec sources do not establish one stable broad French product name. OQLF's mung-bean-specific term and local sweet-potato-qualified usage should remain qualified. |
| Existing bean-thread reference | Preserve `bean thread cellophane noodles / nouilles à base de farine de haricot mungo` as the mung-bean-specific identity. Do not reclassify it as all cellophane or glass noodles. |
| Existing sweet-potato-starch reference | Preserve `sweet potato starch noodles / nouilles à base de fécule de patate douce` as source-qualified. The existing `sweet potato glass noodles` alias remains specific because it includes the source qualifier; do not shorten it to `glass noodles`. |
| Other starch-defined products | Keep mung-bean starch, sweet-potato starch, rice vermicelli, and shirataki distinct. Do not alias raw starches or other noodle identities into a glass-noodle row. |

The existing sweet-potato phrase alias makes a bare `glass noodles` query return that specific row in the current picker. That is a partial-query side effect, not evidence that the bare phrase belongs to that identity. This proposal makes no shared catalog or search-code change. If the project later wants an unqualified glass-noodle row, it should first resolve the overlapping picker behavior and decide whether a broad entry can coexist with the source-qualified products without presenting either one as the default match.

## Measurements, forms, and substitutions

The active catalog has no forms for either source-qualified noodle identity, no reference densities or unit mappings, no direct or contextual substitutions, and no noodle package-yield row. The one package-yield row belongs to canned black beans. OQLF's older bean-thread note says that this product is usually sold in a 100 g package, soaked about 10 minutes before use except in soup, and absorbs appreciable liquid. Well.ca gives its specific pea/mung product a five-minute cooking instruction; that does not override the OQLF note or define other products. Haisue's Daesang listing and Sempio's manufacturer listing identify formulations but do not establish a transferable volume-to-mass value. Treat package sizes and method notes as source-specific observations only. Do not add density, cup/spoon mapping, dry/cooked form, yield, conversion, recipe link, or preparation duration from this review. No source supports a global or contextual substitution ratio between mung-bean, pea/mung, potato/tapioca/mung, sweet-potato/tapioca, rice, or shirataki noodles.

## Source-to-claim map

All web sources were accessed on **2026-10-11**. Product names, ingredients, price/stock and availability may change. Retailer ingredient text supports only the identified listing; marketplace information is not treated as an independently verified package label.

| ID | Source | Claim supported | Limits |
| --- | --- | --- | --- |
| **WP03-S162** (existing ledger ID) | OQLF, [nouilles à base de farine de haricot mungo](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18045583/nouilles-a-base-de-farine-de-haricot-mungo) | Exact Québec French and English pair `nouilles à base de farine de haricot mungo / bean thread cellophane noodles`; note describes transparency and source-specific soaking/liquid behavior. | Entry last updated 1997. It defines the mung-bean-flour product, not all glass or cellophane noodles; its package/preparation notes are not universal conversion data. |
| **WP03-GLASS-BOUNDARY-20261011-S01** | Haisue, [Daesang Sweet Potato Glass Noodle 500 g](https://haisue.ca/products/daesang-sweet-potato-glass-noodle-500g) | Toronto retailer product title and description use `Sweet Potato Glass Noodle`; ingredient list includes sweet-potato starch and other ingredients. | The product was backordered at access, though pickup was listed. One product/SKU only; not a universal formulation or stock record. |
| **WP03-GLASS-BOUNDARY-20261011-S02** | Haisue, [Long Pin Lungkow Vermicelli (Bean Thread)](https://haisue.ca/products/long-pin-lungkow-vermicelli-bean-thread-300g) | Canadian retailer calls this product glass noodles/mung-bean vermicelli and lists potato starch, water, tapioca starch, and mung-bean starch. | Retailer copy and one product listing; it showed backorder status. Does not establish that all cellophane noodles use this mix. |
| **WP03-GLASS-BOUNDARY-20261011-S03** | Well.ca, [Eat Wholesome Bean Vermicelli Glass Noodles](https://well.ca/products/eat-wholesome-bean-vermicelli-glass_298162.html) | Canadian retailer uses the composite product title and lists pea starch, mung-bean starch, and water. | Listing showed notification when available; retailer page is not a general product specification or evidence for all glass noodles. |
| **WP03-GLASS-BOUNDARY-20261011-S04** | SUE Foods, [Vermicelles aux haricots (lungkow)](https://suefoods.com/products/pagoda-brand-vermicelles-aux-haricots-lungkow) | Current Québec French retail wording for a bean-thread/Lungkow noodle; ingredient statement lists pea starch, green mung-bean starch, and water. | Product listing calls them vermicelles aux haricots, not generic glass noodles; its product formulation is SKU-specific. |
| **WP03-GLASS-BOUNDARY-20261011-S05** | Walmart Canada, [SunGiven Vermicelles de Patates Douces](https://www.walmart.ca/fr/ip/SunGiven-Vermicelles-de-Patates-Douces/10283597) | Current French Canada product title and listed sweet-potato-starch ingredient support a source-qualified French market name. | Out of stock at access. Walmart disclaims independent verification of supplier/marketplace data; use only with the other source-qualified evidence. |
| **WP03-GLASS-BOUNDARY-20261011-S06** | Marumatsu Bussan, [Vermicelli and Rice Noodles](https://www.marumatsu-mb.co.jp/English/products/en.14Vermicelli_RiceNoodles.html) | Manufacturer identifies its products as glass noodles/harusame and lists green beans, mung beans, and potato starch; separately lists mung-bean-starch harusame. | Japanese manufacturer catalog, not Canadian or Québec terminology authority; product family listing only. |
| **WP03-GLASS-BOUNDARY-20261011-S07** | Sempio, [Glass Noodles](https://globalsempio.com/products/glass-noodles) and [French product page](https://globalsempio.com/fr/products/glass-noodles) | Manufacturer markets a finished product as glass noodles; the French page calls it `Vermicelles de patate douce (glass noodles)` and lists tapioca and sweet-potato starch. | Manufacturer evidence for its own products, not Canadian retailer stock or a standard French term. The ingredient list shows the marketed product is not necessarily one-starch-only. |
| **WP03-GLASS-BOUNDARY-20261011-S08** | Restaurant La Belle Corée (Montréal), [bilingual menu PDF](https://www.restomontreal.ca/portal/la-belle-coree/menu/menu_342-2022-07-24-01.pdf) | Local bilingual usage pairs `Nouilles de verre de patate douce` with `Sweet potato glass noodles` for japchae. | Menu dated 2022; supports only a source-qualified dish wording, not a general product identity or OQLF preference. |
| **WP03-SPN-20261011-S01** (existing ledger ID) | Korean National Institute of Health library, [Quality Characteristics of Dangmyeon … corn, potato, and sweet potato starches](https://library.nih.go.kr/ncmiklib/elib/kom/articleDtl.do?pk_pb_seq=PB08372467) | 2022 study abstract uses several starch sources for dangmyeon, cautioning against bare `dangmyeon` as a sweet-potato-specific alias. | Study formulation scope; it does not define Canadian retail usage or Québec terminology. |

## Final disposition and file checks

Keep generic glass/cellophane identities and bare English/French aliases **held**. Preserve the existing source-qualified mung-bean and sweet-potato-starch references as separate finished products, and do not infer identity from translucency, an unqualified market term, or a source-specific product instruction. No new row, category, alias, form, quantity behavior, conversion, yield, substitution, or recipe link is recommended. The bundle has no direct demand, and current Canadian/Québec listings show source-specific product wording and non-uniform starch profiles.

The proposal was saved as UTF-8 without BOM with a final newline. A mojibake-marker scan found no matches; the whitespace diff check emitted no warnings.
