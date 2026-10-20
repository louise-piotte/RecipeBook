# WP02 Section A7: current Canadian product boundary for wheat meal

## Scope and status

- **Review date:** 2026-10-11
- **Candidate:** generic `wheat meal`
- **Disposition:** proposal only; no catalog, seed, ledger, plan, roadmap, recipe, or code files changed.
- **Question:** do current Canadian or Québec product sources define a generic wheat-meal product and a Québec French display distinct from whole wheat meal, groats or cracked wheat, flour, and durum semolina?

## Recommendation

**Keep generic `wheat meal` held and unresolved.** Current Canadian evidence confirms that the name is used in food regulation, statistical classification, trade, and specific product listings. It does not establish one generic milling identity or a standalone Québec French consumer name. The current evidence supports only explicitly qualified products and ingredient-label uses.

Retain the already accepted, narrower reference:

| Scope | English display | Québec French display | Evidence/status |
| --- | --- | --- | --- |
| Whole-wheat meal identity | `whole wheat meal` | `farine de blé entier brute` | Accepted existing narrow catalog identity. OQLF gives this French term and the English equivalent in a terminology record; product/process evidence comes from a specific mill, not a Canadian standard. |
| French alternate for that identity | — | `farine de blé complet brute` | Existing accepted alternate listed by OQLF for the same narrow whole-wheat term. |
| Unqualified meal | `wheat meal` | **unresolved** | CFIA and Statistics Canada use the English term, but neither supplies a consumer milling definition or a generic Québec French display. |

OQLF terminology evidence is not a product standard or a legal ruling. Its record supports the French wording for **whole wheat meal** specifically; it must not be extended to every product called **wheat meal**. No generic French alias is proposed.

## Current Canadian and Québec product evidence

| Source and exact name | What it establishes | Evidence limit |
| --- | --- | --- |
| Honeywell manufacturer catalog: `Honeywell Whole Wheat Meal` | A current manufacturer catalog lists a product under an explicitly whole-wheat-qualified name and marks it as whole grain. The same catalog lists `Honeywell Semolina` separately. | Manufacturer-level naming evidence for those branded products. The accessible catalog does not state a particle-size specification or a complete milling process for its meal, and its semolina page says wheat semolina without establishing durum wheat. |
| MyChopChop Canadian product listing: `Honeywell Whole Wheat Meal - 900g` | A Canadian retailer lists the same branded product. Its description calls it a swallow flour made from 100% whole wheat, describes it as fine meal, and gives swallow preparation and Nigerian-soup serving context. The listing was marked sold out when checked; the retailer's shipping page describes shipping across Canada. | Retail copy for one named product, not a generic definition or a milling standard. It does not establish a Québec French label or make the product equivalent to every wheat meal. |
| Voilà and Metro ingredient listings for Nature's Path Heritage cereals | Canadian grocery listings include `Whole Wheat Meal` in finished cereal ingredient statements. | Ingredient-label use only: these are not standalone meal products and provide no milling specification or French generic name. |
| Québec Anglophone Heritage Network, Golden Sheaf package, circa 1920s | A historical Wakefield, Québec package is identified as `Golden Sheaf Whole Wheat Meal`; the museum description also calls it a cracked-wheat cereal or meal. | Historical local product evidence, not current market terminology. It cautions against inferring a universal process boundary from the words *meal* or *whole wheat meal*. |

These sources show current Canadian uses of **whole wheat meal**, plus historical Québec use. They do not provide a current Québec retail product page with a generic French name for unqualified **wheat meal**. The targeted search found no standalone current Québec product listing named simply *wheat meal* with a process description.

## Official and terminology evidence

- **CFIA compositional standards:** the bread-ingredient provision lists `wheat meal` separately from flour and starch names, but does not define wheat meal there. Other provisions define `crushed wheat or coarse ground wheat` and `cracked wheat` with explicit product wording and sieve criteria. This establishes that the Canadian standards use distinct named categories; it does not define generic meal or make meal a synonym for cracked wheat.
- **Statistics Canada NAPCS Canada 2022:** the human-consumption grain-products class gives `wheat meal (except durum semolina)` as an illustrative example. This is classification evidence and supports keeping durum semolina distinct at that level. It gives no consumer process boundary, particle size, or bilingual product name.
- **CBSA/ASFC tariff terminology:** the wheat tariff grouping uses collective wording for wheat groats and meal, with French wording `gruaux et semoules de froment (blé)`. A customs grouping does not establish that the goods are synonyms or provide a retail name for generic wheat meal. In particular, it does not support adding bare `semoule de blé` to this reference.
- **OQLF:** the terminology record for `farine de blé entier brute` gives `whole wheat meal` and `coarse whole wheat flour` as English equivalents and lists `farine de blé complet brute` as an alternate preferred French term. This is terminology evidence for the qualified whole-wheat identity, not an OQLF ruling defining generic `wheat meal`.

Together, the sources strengthen the evidence that **wheat meal** is a recognized food and trade term. They still leave open whether an unqualified consumer use means whole-kernel meal, a refined meal, a cereal fraction, or another locally marketed product. The official classifications are not interchangeable with a recipe-facing product definition.

## Identity boundary and collision risks

- **Whole wheat meal:** retain the accepted narrow identity only. Current Honeywell and cereal-label examples include the qualifier *whole*; the Canadian product evidence does not justify dropping it.
- **Whole-wheat flour:** keep `whole wheat meal` distinct from the active `whole-wheat flour / farine de blé entier` reference. OQLF's English equivalent `coarse whole wheat flour` is not activated as an alias: a picker search for `whole wheat flour` could then return both meal and flour.
- **Groats and cracked wheat:** tariff grouping does not prove identity. CFIA defines cracked wheat separately, and OQLF supports `blé concassé` for cracked/coarse-ground/crushed wheat. The historical Golden Sheaf Québec item further shows that product labels may describe a whole-wheat meal as cracked-wheat cereal. Do not add `wheat groats`, `wheat grits`, `gruau de blé`, or `blé concassé` as aliases without a product-specific boundary.
- **Durum semolina:** retain active `durum semolina / semoule de blé dur` and `remilled durum semolina / semoule de blé dur remoulue` separately. Statistics Canada's parenthetical exclusion distinguishes durum semolina from its wheat-meal example, while tariff terminology is collective. Neither source supports bare `semoule de blé` as a generic French display; that phrase would also risk colliding with the active durum identities.
- **Search overlap:** the phrase `wheat meal` occurs inside the active display `whole wheat meal`. A text search may find that row for the broader phrase, but substring matching is not evidence that the two identities are equivalent.
- **Category:** retain the current narrow whole-wheat-meal row in `FLOUR_AND_STARCH` as already accepted. Do not assign the generic candidate a category until its product boundary is supported.

## Catalog and recipe demand

The current catalog contains the accepted narrow `whole wheat meal / farine de blé entier brute` reference with the existing French alternate `farine de blé complet brute`. Relevant distinct references include whole-wheat flour, durum flour, durum semolina, remilled durum semolina, cracked wheat, wheat bran, and wheat germ. No generic wheat-groats or wheat-grits reference was found.

An exact case-insensitive scan of the current 114 bundled recipe JSON files (1,123 ingredient rows) found no match for `wheat meal`, `whole wheat meal`, `wheat groats`, `wheat grits`, `cracked wheat`, `farine de blé entier brute`, `farine de blé complet brute`, `gruau(x) de blé`, or `semoule de blé`. The corpus therefore supplies no recipe demand that would justify choosing a generic boundary now.

## Decision

1. Keep the unqualified `wheat meal` candidate unresolved and out of the active catalog and alias set.
2. Retain the existing accepted `whole wheat meal / farine de blé entier brute` identity and `farine de blé complet brute` alternate as scoped; do not infer that all Canadian products labeled meal fit it.
3. Do not add generic French wording, groats/cracked-wheat aliases, `semoule de blé`, or `coarse whole wheat flour` as an alias.
4. Keep measurements, density, unit mappings, forms, conversions, yield data, and substitutions empty. None of the sources establishes numeric or substitution behavior.
5. Revisit only if a current Canadian or Québec source supplies both a defined generic wheat-meal product boundary and a product-supported bilingual name, with enough detail to distinguish it from the neighboring identities.

## Proposal-local source register

Sources below were accessed or rechecked on 2026-10-11 unless identified as historical. They establish only the evidence level stated above.

- **A7WM-20261011-S01 — CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0).** Current official standard. Section 12.2.1(h) lists wheat meal among possible bread ingredients but does not define it there; sections 12.1.6–12.1.7 define crushed/coarse-ground wheat and cracked wheat separately.
- **A7WM-20261011-S02 — Statistics Canada, [NAPCS Canada 2022, 1821294: Grain products for human consumption, n.e.c.](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=4&CPV=1821294&CST=17022022&CVD=1386659&Function=getVD&MLV=4&TVD=1384502).** Current statistical classification page gives wheat meal except durum semolina as an illustrative example. Classification evidence, not a process or consumer-name definition.
- **A7WM-20261011-S03 — CBSA, [Customs Tariff 2026, Chapter 11 (English)](https://www.cbsa.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-eng.html), and ASFC, [Tarif des douanes 2026, chapitre 11 (français)](https://www.cbsa.gc.ca/trade-commerce/tariff-tarif/2026/html/02/ch11-fra.html).** Current tariff classification pages group wheat groats and meal; the French collective wording is `gruaux et semoules de froment (blé)`. Classification evidence only.
- **A7WM-20261011-S04 — OQLF, [farine de blé entier brute](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497897/farine-de-ble-entier-brute).** Terminology record gives `farine de blé entier brute` and `farine de blé complet brute` as preferred French terms and lists `whole wheat meal` and `coarse whole wheat flour` in English. It does not define generic wheat meal or set product standards.
- **A7WM-20261011-S05 — Honeywell, [Products](https://www.honeywellfood.com/products/), and [Semolina](https://www.honeywellfood.com/products/semolina/).** Current manufacturer pages list `Honeywell Whole Wheat Meal` and `Honeywell Semolina` separately. The accessible catalog marks the former as whole grain; the semolina product page identifies wheat semolina but does not establish durum species.
- **A7WM-20261011-S06 — MyChopChop, [Honeywell Whole Wheat Meal - 900g](https://www.mychopchop.ca/products/honeywell-whole-wheat-meal), and [Shipping & Returns](https://www.mychopchop.ca/pages/shipping-returns).** Canadian retailer listing for one branded, explicitly whole-wheat-qualified product; the product page describes swallow use and fine meal and was marked sold out when checked. Shipping policy describes service across Canada. Retail evidence, not generic identity or official terminology.
- **A7WM-20261011-S07 — Voilà, [Nature's Path Organic Heritage O's](https://voila.ca/products/nature-s-path-organic-cereal-heritage-o-s-907-g/31755EA), and Metro, [Organic Heritage O's](https://www.metro.ca/en/online-grocery/aisles/pantry/cereals-spreads-syrups/granola-healthier-cereals/organic-whole-grain-cereal/p/058449770015).** Current Canadian finished-cereal listings include `Whole Wheat Meal` in ingredient statements. Label-use evidence only.
- **A7WM-20261011-S08 — Québec Anglophone Heritage Network, [Golden Sheaf Whole Wheat Meal Package, circa 1920s](https://100objects.qahn.org/node/181).** Historical Québec package description identifies a whole-wheat meal/cracked-wheat cereal. Historical local-use evidence only; not a current product standard.
- **A7WM-20261011-S09 — Heimatsmühle, [Wheat Meal Fine/Medium/Coarse](https://www.heimatsmuehle.com/en/commercial-customers/products/wheat-meal-fine-medium-coarse).** Manufacturer describes a specific whole-kernel meal product retaining bran, germ, and endosperm and milled less finely than wholegrain flour. Supports the already scoped product identity, but is not Canadian market or generic wheat-meal evidence.

