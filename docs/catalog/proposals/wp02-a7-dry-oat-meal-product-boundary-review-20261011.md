# WP02 Section A7: dry oat meal / oatmeal product boundary

## Scope and status

- **Review date:** 2026-10-11
- **Candidate reviewed:** `candidate-dry-oat-meal`
- **Disposition:** narrow Scottish oatmeal identity integrated; generic oatmeal remains unresolved. See the integration disposition below.
- **Question:** do current Canadian and Québec sources support a dry oat-meal identity and name distinct from oatmeal's other uses, rolled oats, oat flour, oat groats, and cooked oatmeal?

## Recommendation

Do not resolve generic **oat meal**, **oatmeal**, or **dry oatmeal** as one product or alias. The same English word is used for oat flour, rolled oats, and the cooked dish. The research supports a narrower, source-defined product class: **Scottish oatmeal / gruau écossais**, made by grinding whole oat groats into a coarse meal rather than steaming and flattening them. That qualified identity is integrated; it is not generalized to all dry oat meal.

| Proposed scope | English display | Québec French display | Evidence level and status |
| --- | --- | --- | --- |
| Whole-groat meal in the Scottish style | `Scottish oatmeal` | `gruau écossais` | **Recommend a narrow identity.** A Canadian mill defines Scotch oatmeal as whole oat groats ground to coarse meal; Bob's Red Mill describes its Scottish product as stone-ground rather than steamed and rolled. Bob's Canadian French product page and Québec retail listings use `gruau écossais`. This is product and local-market evidence, not an OQLF terminology ruling. |
| Source-attested English product names | `Scotch oatmeal`; `Scottish oats` | — | **Accepted aliases** for the narrow product only: Arva Flour Mill's current listing calls it `Scotch oatmeal` and says it is “also known as Scottish oats.” Do not generalize either alias beyond this identity. |
| Generic dry meal | `oat meal`, `oatmeal`, `dry oatmeal` | **unresolved** | OQLF and Health Canada use *oatmeal* for different dry products; OQLF also uses it in the English equivalent for a cooked Québec dish. No generic French name or general processing boundary is supported. |

Suggested candidate ID if the narrow identity is approved: `ingredient-ref-scottish-oatmeal`. It was not found in the active seed or ledger. Recommended category: `GRAIN_AND_CEREAL`, based on its source-defined role as a coarse whole-grain hot cereal and the Canadian/Québec retail cereal placement. That category is a catalog judgment, not an official classification.

The OQLF records support formal Québec terminology for **farine d'avoine**, **flocon d'avoine**, and the cooked dish **gruau**. They do not rule on the dry product name **gruau écossais**. The latter is supported here by current Canadian manufacturer and retailer wording, and must be described as local product usage rather than an OQLF ruling.

## Review-time plan, ledger, and catalog snapshot

The following snapshot records the state examined before this proposal's integration. The broad dry-oat-meal candidate remains unresolved; the narrow identity described here is now in the seed package.

- The latest plan review, dated 2026-10-10, keeps dry oat meal unresolved and leaves `oatmeal`/`oat meal` aliases inactive because Canadian sources use the English wording for flour, rolled oats, and cooked porridge.
- Ledger record `candidate-dry-oat-meal` is `needs_clarification`, with an unresolved decision to keep oat groats, flakes, and oat flour distinct. Its current ledger source is the OQLF `gruau` entry, which supports the cooked dish, not a dry milling product. Measurement and substitution research remain `not_yet_researched`.
- The active seed contains `oat flour / farine d'avoine` (`FLOUR_AND_STARCH`), `oat groats / gruau d'avoine entier`, `steel-cut oats / avoine découpée`, `rolled oats / flocons d'avoine`, `quick oats / flocons d'avoine à cuisson rapide`, and `instant oats / flocons d'avoine à cuisson instantanée` (`GRAIN_AND_CEREAL`). The oat-flour row has no aliases; the oat-groats row retains the whole-kernel qualifier. These remain separate.
- No exact candidate or narrow Scottish-oatmeal wording appears in the authored ingredient text of the 114 bundled recipes. A full serialized-recipe scan found no occurrence of `dry oat meal`, `dry oatmeal`, `oat meal`, `oatmeal`, `Scottish oatmeal`, `Scotch oatmeal`, `Scottish oats`, `gruau écossais`, `gruau d'avoine`, `farine d'avoine`, or `flocons d'avoine`. There is no current recipe demand for a recipe link.

## Product boundary and naming evidence

| Product or source wording | Evidence for the dry product | Limit |
| --- | --- | --- |
| Arva Flour Mill (Ontario): `Scotch Oatmeal`, “also known as Scottish oats” | The mill's current product page describes Scotch oatmeal as whole oat groats ground into a coarse meal, calls the same product “also known as Scottish oats,” and contrasts it with rolled oats, which are steamed and flattened. It also describes porridge and oatcake uses. | One Canadian mill's product definition. It establishes a marketed coarse-meal class and a paired naming for that product, but gives no standard particle-size threshold or generic French display. Direct page retrieval returned a cache miss during the original review; the current listing wording was independently rechecked. |
| Bob's Red Mill: `Scottish Oatmeal` | The manufacturer's English product page says its product is stone-ground and distinguishes grinding between two millstones from steaming and rolling regular rolled oats. It lists hot-cereal and baking uses and declares whole grain oats as the ingredient. | Product-specific evidence, not a Canadian standard. It does not specify a sieve range or establish that all products sold as oatmeal are ground meal. |
| Bob's Red Mill Canada: `Gruau écossais` | The live Canadian French product page uses this exact display and describes stone-ground Scottish oats as ground rather than steamed and flattened. | Direct Canadian French product terminology, not a formal OQLF ruling. The brand page also uses *gruau* for the prepared breakfast dish. |
| Well.ca and Metro Québec listings: `Gruau écossais` | Canadian retail listings place Bob's dry Scottish oatmeal in cereal/hot-cereal sections. Well.ca's listing describes coarse meal ground between millstones; Metro lists `Bob's Red Mill Gruau écossais biologique 567 g`. | Retail listings corroborate local product use, not terminology authority. Well.ca's page was not fetchable directly in this review and showed a notify-me state in the indexed product detail; Metro's category page was indexed recently but returned 403 on direct retrieval. No stock or availability conclusion is drawn. |
| Well.ca alternate item title: `Flocons d'avoine écossais biologiques` | The retailer uses this wording in part of its Scottish-oatmeal listing. | Do not adopt it as an alias: OQLF defines *flocon d'avoine* as a steamed-and-flattened oat grain, whereas the manufacturer describes this product as ground, not rolled. The variation demonstrates that local retail metadata can be inconsistent. |

The two manufacturer descriptions support a reproducible narrow scope: whole oat groats ground into a coarse meal in the Scottish/Scotch oatmeal product class. They distinguish this class from rolled flakes and intact groats. They do not set a universal grind grade, nor do they show that every unqualified **oatmeal** is this product.

## Québec terminology and collision handling

- **Oat flour:** OQLF defines `farine d'avoine` as flour obtained by milling whole or non-whole oat grains and notes it may also be made from oat flakes. The English equivalents include `oatmeal` and `oat flour`. This is an official terminology record for the French flour term; its broad definition means the dry Scottish product's grain size is not separated by that record. Keep the active `oat flour / farine d'avoine` row, and do not use bare `oatmeal` as its alias.
- **Rolled oats:** OQLF defines `flocon d'avoine` as an oat grain steamed and flattened and discourages the calque `avoine roulée`. Health Canada calls rolled oats “also known as oatmeal” in a health-claim assessment. The Scottish product sources instead describe grinding and explicitly contrast it with steaming/rolling. Keep the active rolled-oats, quick-oats, and instant-oats identities separate; do not add `oatmeal` or `rolled oatmeal` as their aliases.
- **Oat groats:** CFIA describes oat groats as oat kernels remaining after the hull is removed; the whole groats may be consumed whole or further cut, steamed, and rolled. The Scottish meal is ground from groats, so it is not the active whole-kernel `oat groats / gruau d'avoine entier` identity.
- **Cooked oatmeal / gruau:** OQLF defines Québec `gruau` as a hot dish made from oat flakes cooked in water or milk and lists U.S. English `oatmeal` as an equivalent. The qualified market phrase `gruau écossais` names a dry product on Canadian product pages, but no OQLF entry was found for that compound. Keep bare `gruau` reserved from the dry product and do not claim the local compound is a formal ruling.
- **Oat flour versus coarse meal:** OQLF's broad milling definition does not by itself create a particle-size boundary. Arva's named `Scotch Oatmeal` page gives the stronger, product-scoped distinction by specifying whole-groat coarse meal; the display recommendation must remain limited to that market class. Do not infer a generic class for every coarse or fine ground oat product.
- **Search overlap:** a picker search for bare `oatmeal` may surface the specific `Scottish oatmeal` display by substring. That search result is not synonym evidence. The generic English term should not be added to any alias list.

## Proposal decision

1. Retain the narrow identity `Scottish oatmeal / gruau écossais`, category `GRAIN_AND_CEREAL`, scoped to whole oat groats ground into a coarse meal for the named Scottish/Scotch product class.
2. Accept `Scotch oatmeal` and `Scottish oats` as source-attested English aliases for that narrow row because Arva pairs both names for the same listed product. Keep `oatmeal`, `oat meal`, `dry oatmeal`, and `oatmeal flour` out of its aliases.
3. Keep generic `oatmeal` and `oat meal` unresolved. Do not add `farine d'avoine`, `gruau`, `flocons d'avoine`, or `flocons d'avoine écossais` as French aliases for the coarse meal.
4. Keep the active oat flour, oat groats, steel-cut oats, rolled oats, quick oats, and instant oats rows unchanged. No recipe links are supported by the current corpus.
5. Keep density, unit mappings, measurements, forms, conversions, yields, and substitutions empty. The product pages' package or preparation information is product-specific and supplies no generic quantity mapping.

## Proposal-local source register

Sources were accessed or rechecked on 2026-10-11 unless their date is stated. The source IDs below are local to this proposal and do not alter the shared ledger.

- **DOAM-20261011-S01 — Arva Flour Mill, [Scotch Oatmeal 650g](https://arvaflourmills.com/products/scotch-oatmeal).** Ontario mill product listing. The current description says whole oat groats are ground into coarse meal, calls the product “also known as Scottish oats,” and contrasts it with steamed, flattened rolled oats. Direct retrieval returned a cache miss during the original review; the current listing wording was independently rechecked. Supports both paired English names for this narrow product, not French terminology or a universal grind standard.
- **DOAM-20261011-S02 — Bob's Red Mill, [Scottish Oatmeal](https://www.bobsredmill.com/product/scottish-oatmeal).** Manufacturer page describes stone-ground Scottish oatmeal, ground between millstones rather than steamed and rolled; lists hot-cereal and baking uses and whole grain oats. Product-specific process/name evidence only.
- **DOAM-20261011-S03 — Bob's Red Mill Canada, [Gruau écossais](https://www.bobsredmill.ca/produit/gruau-ecossais).** Canadian French manufacturer product page. Uses the exact display `gruau écossais`, describes grinding rather than steaming and flattening, and identifies whole-grain oats. This is market terminology, not an OQLF ruling.
- **DOAM-20261011-S04 — Well.ca, [Bob's Red Mill Scottish oatmeal / gruau écossais](https://well.ca/fr/produits/bobs-red-mill-scottish-oatmeal_160950.html?cat=3114) and [organic Scottish oatmeal](https://well.ca/fr/produits/bobs-red-mill-organic-scottish_161026.html?cat=3114).** Current indexed Canadian retail listings use `gruau écossais` and describe coarse meal ground between stones; one title also says `flocons d'avoine écossais`. Direct page retrieval returned cache misses, so listings corroborate local naming with a metadata-quality limit and are not treated as formal terminology.
- **DOAM-20261011-S05 — Metro, [Granola et céréales santé](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/granola-et-cereales-sante).** Québec grocery category listing, indexed the review week, names `Bob's Red Mill Gruau écossais biologique 567 g`. Direct retrieval returned 403. Supports a local listing name only; no stock claim is made.
- **DOAM-20261011-S06 — OQLF, [farine d'avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497598/farine-davoine).** Terminology record updated 2017. Defines flour obtained by milling whole or non-whole oat grains, notes it can be made from flakes, and lists English `oatmeal` and `oat flour`. Formal terminology evidence for the French flour term; it does not define a coarse-meal class.
- **DOAM-20261011-S07 — OQLF, [gruau (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363388/gruau).** Terminology record updated 2002. Defines the Québec prepared dish made from cooked oat flakes and lists U.S. English `oatmeal`. Does not define the dry compound `gruau écossais`.
- **DOAM-20261011-S08 — OQLF, [flocon d'avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497597/flocon-davoine).** Terminology record updated 2017. Defines a steamed-and-flattened oat grain, lists English `rolled oat`, `oat flake`, and `rolled oatmeal`, and discourages `avoine roulée` in Québec French.
- **DOAM-20261011-S09 — Health Canada, [Summary of Assessment of a Health Claim about Oat Products and Blood Cholesterol Lowering](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/fn-an/alt_formats/pdf/label-etiquet/claims-reclam/assess-evalu/oat_avoine-eng.pdf).** 2010 regulatory health-claim assessment. Calls rolled oats “also known as oatmeal” and separately defines whole oat flour for the claim. Used only to demonstrate English-name overlap, not as a general consumer naming standard.
- **DOAM-20261011-S10 — CFIA, [Bacterial Pathogens and Indicators in Oats, April 1, 2018 to March 31, 2020](https://inspection.canada.ca/en/food-safety-industry/food-chemistry-and-microbiology/testing-reports-and-journal-articles/april-1-2018-march-31-2020-0).** Government survey page modified 2026-05-27. Describes hull removal to obtain oat groats and further cutting, steaming, and rolling; survey product classes include steel-cut, quick, rolled, and instant oats. The survey does not define Scottish oatmeal or a coarse-meal class.

## Integration disposition

The active catalog uses `Scottish oats` as an alias only on `ingredient-ref-scottish-oatmeal`, alongside `Scotch oatmeal`, based on Arva's current listing pairing both names for the same coarse-meal product. Neither alias resolves to generic oatmeal. `oatmeal`, `oat meal`, and `dry oatmeal` remain unresolved and inactive. Integration details and verification are recorded in the [WP02/WP03/WP05 oatmeal, coconut, and adobo batch](../batches/wp02-wp03-wp05-oatmeal-coconut-adobo-integration-20261011/README.md).
