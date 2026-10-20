# WP03 Section F Sushi Rice Independent Review

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** Independent, proposal-only review. The live seed, research ledger, Section F plan, and both earlier sushi-rice packets were inspected. No shared catalog, ledger, plan, workflow, roadmap, code, test, or recipe file was changed.
- **Question:** Can the candidate be bounded to dry retail rice marketed for sushi, with a Québec French display, while keeping cooked seasoned sushi rice and grain classes distinct?

## Disposition

Retain `ingredient-ref-sushi-rice` as a ledger-only candidate with `identityState: needs_clarification`.

The exact French phrase **`riz à sushi`** is well attested in current Québec and Canadian retail listings for dry, packaged rice. That supports it as a product-label phrase. It does not, by itself, establish a stable generic ingredient identity: the listings apply it to different underlying grain classes, and public-health sources use the same phrase for cooked, seasoned ready-to-eat rice. A dry-retail scope removes the prepared-rice collision by definition, but available evidence still describes `sushi rice` as a use or retail label rather than a common grain type with a documented product boundary. No bundled recipe needs this identity.

This is a hold on the generic catalog identity, not a claim that the retail phrase is invalid. Keep `riz à sushi` as source wording when it identifies a specific product. Do not invent `riz à sushi sec` or `riz sec pour sushi` as a catalog display: no reviewed Québec source attests either phrase. Reopen if recipe or product-workflow demand requires a defined dry product category and the catalog adopts that use-label boundary.

## Current seed, ledger, and plan audit

The current split seed package contains **954 ingredient references**, **53 forms**, **114 recipes**, and **1,123 ingredient rows**. The active rice references relevant to this decision remain distinct:

| Active reference | Current display | Boundary relevant here |
| --- | --- | --- |
| `ingredient-ref-rice` | `rice / riz` | Generic grain with existing dry and cooked forms; those forms do not mean cooked-and-seasoned sushi rice. |
| `ingredient-ref-calrose-rice` | `calrose rice / riz Calrose` | Named market type; current sushi-market examples include Calrose. |
| `ingredient-ref-short-grain-rice` | `short-grain rice / riz à grain court` | Grain-length class. |
| `ingredient-ref-medium-grain-rice` | `medium-grain rice / riz à grain moyen` | Separate grain-length class. |
| `ingredient-ref-glutinous-rice` | `glutinous rice / riz gluant` | Distinct rice type; sticky cooked texture alone does not identify it. |

There is no active `sushi rice`, `riz à sushi`, `riz sushi`, or `riz à sushis` reference or form. A scan of all 114 current recipe files found zero matches for those terms or the related class and texture terms `short-grain rice`, `Calrose`, `glutinous rice`, and `sticky rice`. The ledger contains one `ingredient-ref-sushi-rice` candidate: `needs_clarification`, with measurement and substitution research still `not_yet_researched`. The current Section F plan likewise keeps generic sushi rice unresolved.

## Evidence and limits

### Dry retail wording

Current Québec listings use `riz à sushi` for dry retail products. MITO names a 450 g Calrose product `Riz à sushi Calrose`, lists its ingredient as Calrose rice, says to keep it cool and dry, and describes Calrose as medium-grain. Dainty’s current French product page also calls its product riz à sushi and identifies it as medium-grain Calrose. Walmart Canada’s French listing uses `riz à sushi` for a named Koshihikari short-grain Japonica product; Walmart cautions that supplier-provided product details are not independently verified. A current Metro listing applies the same wording to Aki Sushi Calrose rice. These are direct examples of retail naming, not a technical standard.

The examples do not support equivalence to Calrose or to short-grain rice. Dainty and MITO identify medium-grain Calrose; RiceSelect and the Hakuro listing identify short-grain varieties. OQLF separately defines the short-grain class as `riz à grain court` and does not make sushi use one of its class names. The strongest reading is that `riz à sushi` is a market/use label whose grain type must be read from each product, not a synonym for one grain-length class or variety.

### Prepared sushi rice and texture terms

OQLF defines `sushi` as a Japanese dish made with vinegared rice and possible fillings. Toronto Public Health describes sushi rice as ready-to-eat rice commonly prepared by mixing cooked rice with sugar, salt, and rice vinegar. Manitoba Health’s French sushi-preparation guidelines explicitly define `riz à sushi` as cooked short-grain rice mixed with vinegar and other ingredients such as sugar or salt, while listing uncooked rice separately among shelf-stable foods. These sources directly establish that the same phrase can name the prepared, seasoned food. They do not define dry retail grain.

Do not equate sushi rice with `glutinous rice / riz gluant`. OQLF has a separate entry for the glutinous-rice type. RiceSelect describes its own sushi rice as short-grain with a sticky texture and says sushi rice is not technically a glutinous-rice variety, while noting it can be used in recipes calling for sticky rice. This product-specific statement supports separating the texture word `sticky` from the glutinous-rice identity; it does not establish a universal property of all sushi-marketed rice.

## Finding: can the dry identity and Québec display be justified?

**The display phrase is justified as current retail French; the generic ingredient identity is not yet sufficiently bounded.** Current product evidence supports documenting the exact phrase `riz à sushi` without inventing a translation. A 2026 Canadian KitchenAid guide also uses `Riz à sushi` as a rice-cooker program distinct from `Riz blanc (grains courts)` and reports capacities for dry rice; this corroborates consumer use of the phrase in a dry-grain context, but a cooking-program label does not define a catalog ingredient class.

The remaining issue is not solved by adding a dry qualifier to the scope. The reviewed products share intended sushi use, yet their listings identify different grain classes. Neither OQLF nor the reviewed Canadian public-health sources define a dry retail class or criteria that separate all such products from other rice sold for sushi preparation. The exact phrase also remains the name of the cooked, seasoned preparation in authoritative usage. Treating the phrase as an active, generic ingredient reference would therefore require a catalog decision to model a label-defined use category; the evidence does not independently establish that identity. The lack of recipe demand removes a practical reason to make that modeling choice now.

Accordingly:

- Keep the candidate unresolved and unaliased.
- Do not alias `sushi rice` or `riz à sushi` to Calrose, medium-grain rice, short-grain rice, glutinous rice, generic cooked rice, or any other active row.
- Do not add `sticky rice` or `riz collant` as a sushi-rice/glutinous-rice equivalence.
- Do not create a cooked-seasoned form, dry/cooked conversion, quantity, cooking ratio, yield, density, unit mapping, or substitution from the product directions.
- Make no recipe links or recipe edits; the current seed has no matching recipe wording.

## New evidence versus corroboration

New evidence found during this independent pass:

- Manitoba Health’s French public-health guide separately defines prepared `riz à sushi` and lists uncooked rice as a shelf-stable ingredient. It strengthens the state boundary beyond the Toronto source already in the packet.
- KitchenAid Canada’s February 2026 French guide uses the exact display `Riz à sushi` for a dry-rice cooking program distinct from short-grain white rice. It corroborates the consumer-facing label but does not define the product class.
- Metro’s current Aki Sushi listing uses `Riz à sushi Calrose` for a 900 g product. It is additional Québec retail corroboration; direct retrieval returned HTTP 403 during this review, so it is not relied on for the decision.
- A current Canadian retailer page from OnlineOrganics describes its own sushi rice as medium-grain Japonica and says `riz à sushi` is a label merchants use for Japanese rice. This is useful retailer interpretation, not authoritative terminology; the page could not be opened from the browser cache during this review, so it is not relied on for the disposition.

Earlier evidence independently rechecked and corroborated:

- Dainty and MITO for Québec French `riz à sushi` applied to medium-grain Calrose.
- Walmart Canada and RiceSelect for sushi-marketed short-grain Koshihikari products.
- OQLF for the prepared dish, short-grain French class term, and separate glutinous-rice terms.
- Toronto Public Health for cooked, seasoned ready-to-eat sushi rice.

## Source register

All pages and files below were accessed on **2026-10-11**. Product listings support only the named product and seller/manufacturer wording. Source statements are separated from the catalog inference in the limits column.

| Source | Direct evidence and limits |
| --- | --- |
| [OQLF, `sushi`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359752/sushi) | Québec terminology authority: defines sushi as a prepared dish made with vinegared rice and possible fillings. It does not define dry sushi rice. Corroborates WP03-S73. |
| [Manitoba Health, Lignes directrices en matière de salubrité des aliments pour la préparation des sushis (PDF)](https://www.gov.mb.ca/health/publichealth/environmentalhealth/protection/docs/sushi.fr.pdf) | Government guide: defines `riz à sushi` as cooked short-grain rice mixed with vinegar and ingredients such as sugar or salt; separately lists uncooked rice as shelf-stable. Direct state-boundary evidence; it is food-safety guidance, not retail nomenclature. **New source in this review.** |
| [City of Toronto Public Health, Specific Food Processes](https://www.toronto.ca/community-people/health-wellness-care/food-safety/food-safety-for-businesses/food-safety-resources/specialty-foods/) | Public-health guidance: describes sushi rice as ready-to-eat rice commonly made from cooked rice mixed with sugar, salt, and rice vinegar. Corroborates WP03-S134; prepared-food scope only. |
| [KitchenAid Canada, Quick Start Guide W11797722 (PDF)](https://www.kitchenaid.ca/content/dam/global/documents/202602/quick-start-guide-w11797722-revb.pdf) | February 2026 guide has a French `Riz à sushi` dry-rice cooking program separate from `Riz blanc (grains courts)` (pp. 2, 8). Direct evidence of current French consumer-use wording and a dry cooking context; not a rice classification or product standard. **New source in this review.** |
| [Dainty, Le meilleur riz à sushi pour les recettes japonaises](https://dainty.ca/fr/produits/riz-sushi-calrose/) | Manufacturer page: uses `riz à sushi`, identifies its product as medium-grain Calrose, and provides its own cooking ratio. Product-specific evidence only; the ratio is not generalized. Corroborates WP03-S135. |
| [MITO, Riz à sushi Calrose – 450 g](https://mito.ca/produit/riz-calrose-450-g/) | Québec seller page: title says `Riz à sushi Calrose`; lists `Riz Calrose`, storage cool and dry, and describes Calrose as medium grain. Direct product-label evidence, not a universal class definition. Corroborates WP03-SUSHI-QC-20261011-S05. |
| [Metro, Riz à sushi Calrose Aki Sushi – 900 g](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/riz/riz-a-sushi-calrose/p/8165530029548) | Current Québec retailer search listing uses `Riz à sushi Calrose`. Direct page retrieval returned HTTP 403 on access date; treat as corroborative listing evidence only. **New source in this review.** |
| [Walmart Canada, Hakuro Riz à sushi de qualité supérieure](https://www.walmart.ca/fr/ip/Hakuro-Riz-sushi-de-qualit-sup-rieure/3U478VX51H55?classType=REGULAR) | French retail listing identifies Koshihikari, short-grain Japonica, under `riz à sushi`; Walmart disclaims independent verification of supplier product details. Direct evidence of listing wording, with a vendor-information limit. Corroborates WP03-SUSHI-QC-20261011-S06. |
| [OnlineOrganics, Riz blanc à sushi biologique](https://onlineorganics.ca/fr/products/riz-blanc-a-sushi-biologique) | Canadian retailer page search extract describes its product as medium-grain Japonica and says `riz à sushi` is a label merchants apply to Japanese rice. The page returned a cache miss when opened; retailer interpretation only, not relied on for the decision. **New source in this review.** |
| [OQLF, `riz à grain court`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8354929/riz-a-grain-court) | Defines short-grain rice and lists `riz à grain court`, `riz à grains courts`, `riz à grain rond`, and `riz à grains ronds` as preferred French terms. Does not define sushi rice. Corroborates WP03-S110. |
| [OQLF, `riz glutineux`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux) | Gives `riz glutineux`, `riz gluant`, and `riz doux` for the separate glutinous type. Used for the lexical/product boundary, not as current product specification. Corroborates WP03-SUSHI-QC-20261011-S03. |
| [University of California Agriculture and Natural Resources, The California Rice Varieties (PDF)](https://rice.ucanr.edu/files/217622.pdf) | Research-extension material places Calrose in medium grain and Koshihikari in short grain. Supports keeping the named products and grain classes separate; does not define sushi rice. Corroborates WP03-S44. |
| [RiceSelect, Sushi Rice](https://www.riceselect.com/products/riceselect-sushi-rice) | Manufacturer page calls its product short-grain, names Koshihikari and Calihikari, describes sticky texture, and gives separate cooking/seasoning directions. Product-specific only; corroborates WP03-S136. |
| [RiceSelect, How to Make Sticky Rice](https://www.riceselect.com/blog/how-to-prepare-the-best-sticky-rice) | Manufacturer distinguishes its sushi rice from a glutinous-rice variety while describing a sticky result. Product-specific support for not treating `sticky` as a universal identity. Corroborates WP03-SUSHI-QC-20261011-S09. |

## Verification of this proposal

The proposal was written as UTF-8 without a byte-order mark. The saved file was checked for valid UTF-8 and absence of a BOM; a trailing-whitespace scan and `git diff --no-index --check` against `/dev/null` produced no whitespace diagnostics. No tests were run.
