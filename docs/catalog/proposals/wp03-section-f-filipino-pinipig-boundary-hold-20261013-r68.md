# WP03 Section F — Filipino pinipig product-boundary hold (2026-10-13, R68)

## Review record

- **Plan location:** the regional cereal-mix and preprocessed-grain item remains open in [Section F](../../RecipeBook-global-ingredient-catalog-plan.txt#L2701).
- **Status:** proposal-only; no shared catalog, ledger, roadmap, plan, checklist, recipe, or generated file changed.
- **Recommendation:** keep Pinipig unallocated. Sources establish a Filipino pounded-rice product family and Canadian market naming, but the products found vary in presentation and the Québec French name for the plain ingredient remains unresolved.
- **Scope:** this reviews the Filipino term Pinipig. The archive has a separate Thai Khao Mao review at R35; this proposal does not reopen or revise it.

## Identity and process evidence

Central Philippines State University describes pinipig made from rice harvested at the firm-dough stage, pan-roasted over a fire, cooled, then pounded in a wooden mortar and pestle into flattened grains. Its 2025 account concerns farming communities on the university reserve, where the reviewed crop is black rice; it is not a universal product standard [S01].

A University of the Philippines Los Baños study calls pinipig “rice flakes” and reports producing it from soft-dough waxy, intermediate-amylose, and non-waxy rice varieties. It also studies dry-puffed rice as a separate processing treatment, while finding that waxy rice made the best-quality pinipig. This supports a distinct pounded/flaked rice process, but not a universal variety, color, maturity threshold, moisture specification, or retail form [S02].

The Philippine Department of Science and Technology Food and Nutrition Research Institute assigns Pinipig as an alternate/common name to one food-composition entry: “Rice, glutinous, parboiled, flattened,” with 100% edible portion [S03]. This is useful national food-data evidence for one scoped sample. It does not establish that all pinipig is parboiled or glutinous; the UPLB study tested multiple rice types.

The live Canadian importer AFOD lists “Buenas Pinipig Pounded Sweet Rice,” classifies it under frozen delicacies, and gives a case pack of 30 × 8 oz. The page showed the item out of stock when checked. AFOD identifies itself as a Canadian importer and distributor, so this is direct Canadian-market product-name evidence, but the page has no ingredient statement, process description, Québec French label, or usable recipe quantity [S04–S05].

Current Montréal Filipino grocery/restaurant P’Lengke lists pinipig as a halo-halo and mais-con-yelo topping, describing it in English as “rice crispies” or “toasted rice.” This supports local culinary use of the term, but the page is English-only and names finished desserts rather than a standalone packaged ingredient [S06].

Product descriptions do not yet resolve one catalog-wide scope. The Canadian AFOD listing is categorized as frozen, while CPSU describes a freshly pounded product and P’Lengke describes a toasted topping. A French-language European retailer sells a pandan-containing Vietnamese green-rice-flake product, equates Com Dep Xanh with Pinipig and Khao Mao, and calls the product riz soufflé. That listing is out of stock, is not Québec-facing, and does not establish that the Filipino and Thai names are interchangeable or that Pinipig should alias to puffed rice [S08].

## Bilingual naming

| Field | Evidence and decision |
|---|---|
| English candidate name | **Pinipig.** CPSU, FNRI, P’Lengke, and AFOD all use the name. AFOD’s wording “Pinipig Pounded Sweet Rice” is one Canadian product title, not a general alias for all pounded sweet rice. |
| Québec French display | **Unresolved.** No Québec French standalone Pinipig product label or authoritative Québec term was found. P’Lengke’s Montréal page uses English descriptions only. |
| French retail wording found | A Walmart Canada French page for Goldilocks Pinipig Polvoron says the pinipig pieces are “chips de riz gluant.” That page names a prepared polvoron confection, not a standalone grain product, and the seller-supplied wording is not a terminology ruling [S07]. |
| Existing French phrases to keep separate | Do not assign **riz soufflé**: it is the active display for puffed rice. Do not add **flocons de riz**: it already searches to flattened rice/poha and brown-rice flakes. Do not adopt **riz gluant** as a universal qualifier: the UPLB study includes non-waxy and intermediate-amylose rice samples. |

The French-language product page for Vietnamese Com Dep Xanh is evidence of one retailer’s cross-regional wording, not a Québec French name for plain Pinipig. Its equation of the Vietnamese, Filipino, and Thai names conflicts with the more specifically scoped sources above, and its product contains pandan extract [S08]. No French calque is proposed.

## Exact ownership, archive, and picker audit

At review time the live package contains 1,390 ingredient references and 100 forms; the legacy-import file has 63 candidates; the research ledger has 1,723 records. Exact normalized searches for Pinipig/Pilipig found no active reference, form, legacy candidate, ledger record, earlier proposal, or batch owner. The 114 manifest-listed recipes contain 1,123 ingredient rows. The archive contains a Thai Khao Mao review at R35, but no Filipino Pinipig review. Its shared broad rice-flake vocabulary is not reassigned here.

Relevant active ownership is:

| Active owner | Current terms and behavior |
|---|---|
| ingredient-ref-flattened-rice-poha | **flattened rice (poha) / flocons de riz (poha)**. English aliases include beaten rice, flaked rice, rice flakes, chiura, aval, atukulu, avalakki, chira, chuda, and sira; French aliases are riz aplati and riz battu. Density is null and unit mappings are empty. |
| Three flattened-rice forms | Thin, medium, and thick poha forms attach to the row. Each has null form density. The ledger keeps the grades distinct without standardized thickness cutoffs, conversions, or substitutions. The base record has one formula-specific 60 g / three-fistfuls observation for a complete Chirar Polao recipe; this is not a generic poha measure and does not transfer to Pinipig. |
| ingredient-ref-brown-rice-flakes and ingredient-ref-red-rice-flakes | Separate identities also appear for the complete English query **rice flakes**. The phrase-first projection for that query currently returns brown rice flakes, flattened rice (poha), and red rice flakes. |
| ingredient-ref-puffed-rice | **puffed rice / riz soufflé**, with English aliases muri and murmura; null density and empty unit mappings. |
| ingredient-ref-rice-cereal | **crispy rice cereal / céréales de riz croustillantes**; null density and empty unit mappings. Recipe 040#5 requests six cups of this cereal. |
| ingredient-ref-glutinous-rice | **glutinous rice / riz gluant**, with sweet rice and waxy rice as English aliases. Density and unit mappings are empty; it owns rice type, not the pounded/flattened process. |
| ingredient-ref-rice | Generic **rice / riz** with dry and cooked forms. Both form densities are null and no unit mappings are active. |

The static picker projection follows the current phrase-first, substring-fallback behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Current results include:

| Query | Current result |
|---|---|
| pinipig; pilipig; pounded rice; pounded sweet rice; young flattened rice; green rice flakes | No result |
| rice flakes | Brown rice flakes; flattened rice (poha); red rice flakes |
| flaked rice | Flattened rice (poha) |
| flocons de riz | Brown rice flakes; flattened rice (poha) |
| riz soufflé | Puffed rice |
| crispy rice cereal | Crispy rice cereal |
| glutinous rice | Glutinous rice and its three separately named flour references |

A new identity using only Pinipig could have a unique exact search key, but its required French display and the boundary from the active rice-flake/puffed-rice products are not sufficiently resolved. Do not attach the existing rice-flake or puffed-rice aliases to it.

## Recipe demand, numeric evidence, and substitution scope

All 114 bundled recipe files and their 1,123 ingredient rows were searched for Pinipig, Pilipig, pounded rice, pounded sweet rice, young flattened rice, green rice flakes, rice flakes, and related crisp-rice terms. No recipe requests Pinipig or a clear synonym. Recipe 040#5’s six-cup crispy-rice-cereal line is an explicitly different product and remains linked to ingredient-ref-rice-cereal.

FNRI reports nutrients per 100 g edible portion for its named Pinipig food entry. That is a composition denominator, not a kitchen measure, package conversion, or bulk density. AFOD’s 30 × 8 oz is a distributor case-pack listing, and it supplies no household portion or cup weight. The process descriptions and study samples provide no reusable measure, density, processing yield, or cooking yield. Keep all such values inactive.

Add no conversion or substitution between Pinipig, poha, puffed rice, crispy rice cereal, whole glutinous rice, or prepared polvoron. Shared rice material, crispness, or dessert use does not establish the same processing, water uptake, or replacement ratio. UPLB’s process comparison is not a substitution recommendation.

## Integration sketch and reopening conditions

If a current standalone Canadian product source and a Québec French label later establish a stable plain Pinipig product class, review one identity-only GRAIN_AND_CEREAL reference under the exact regional name. A French display must come from Québec-facing evidence; retain Pinipig unchanged only if that evidence supports it.

Keep these terms off the candidate’s aliases: pounded rice, pounded sweet rice, flattened rice, rice flakes, flaked rice, rice crispies, puffed rice, riz soufflé, flocons de riz, and riz gluant. Do not add a form, density, unit mapping, measure, recipe link, package or cooking yield, conversion, or substitution without independent evidence. Reopening should establish how the Canadian frozen product relates to toasted/pounded Pinipig and whether those are separate forms or differently named products.

## Source register

Sources were checked online on 2026-10-13. The source IDs below are proposal-local and were not added to the shared research ledger.

| Source ID | Source | Supports and limits |
|---|---|---|
| WP03-PINIPIG-R68-20261013-S01 | Central Philippines State University, [“A Taste of Tradition”: How Pinipig Keeps Filipino Heritage Alive](https://cpsu.edu.ph/news/533), 2025-07-16; also included in the [CPSU 2025 SDG report](https://cpsu.edu.ph/Uploads/Files/pdf/2025%20SDG%20Template_compressed%201.pdf), p. 12. | Supports the firm-dough harvest, pan-roast, cool, and pound process and a black-rice example at the CPSU reserve. The article is a local university account, not a national manufacturing specification. |
| WP03-PINIPIG-R68-20261013-S02 | Wilma A. Hurtada and Leoncio C. Raymundo, [“Processing, packaging and storage stability of pinipig (rice flakes)”](https://www.ukdr.uplb.edu.ph/journal-articles/5965/), *The Philippine Agricultural Scientist* 80(1–2), 1996, pp. 65–86. | The UPLB repository abstract identifies pinipig/rice flakes, tests waxy, intermediate-amylose, and non-waxy varieties, and reports waxy rice as best quality. The full article is not available from the repository page; methods and samples are study-specific. |
| WP03-PINIPIG-R68-20261013-S03 | DOST Food and Nutrition Research Institute, [Philippine Food Composition Table report, Food ID A011](https://i.fnri.dost.gov.ph/fct/library/report/2973), database release 2019. | Assigns Pinipig as alternate/common name for glutinous, parboiled, flattened rice and reports composition per 100 g. It is one food-data record, not a universal recipe, label, measure, density, or substitution source. |
| WP03-PINIPIG-R68-20261013-S04 | AFOD, [Buenas Pinipig Pounded Sweet Rice](https://afodltd.com/product/buenas-pinipig-pounded-sweet-rice/). | Canadian distributor page gives product wording, frozen-delicacy category, 30 × 8 oz case pack, SKU/barcode, and out-of-stock status on access. No ingredient statement, process, French name, or household measure is given. |
| WP03-PINIPIG-R68-20261013-S05 | AFOD, [About Us](https://afodltd.com/about-us/). | Identifies AFOD as a Canadian Filipino/Asian food importer and distributor. Supports Canadian-market relevance of its product listing, not Québec availability. |
| WP03-PINIPIG-R68-20261013-S06 | P’Lengke, Montréal, [restaurant and grocery menu](https://www.plengke.com/), summer-delights entries. | Current English-language menu names pinipig as a topping and describes it as rice crispies/toasted rice. This supports Montréal culinary use, not a standalone package or French term. |
| WP03-PINIPIG-R68-20261013-S07 | Walmart Canada, [Goldilocks Pinipig Polvoron Sablé (fr-CA)](https://www.walmart.ca/fr/ip/Goldilocks-Pinipig-Polvoron-Sabl/6000198640506). | French product copy describes Pinipig in this polvoron as chips de riz gluant. It is a prepared confection listing and seller-supplied text; it does not define the plain ingredient class or a Québec-preferred name. |
| WP03-PINIPIG-R68-20261013-S08 | Asiafoodland, [Flocons de riz vert – Com Dep Xanh](https://www.asiafoodland.fr/food/riz-et-pates/reis/klebereis/asiafoodland-flocons-de-riz-vert-com-dep-xanh-200-g.html). | A French-language European retailer equates Vietnamese Com Dep Xanh with Filipino Pinipig and Thai Khao Mao and calls its pandan-containing product riz soufflé. The page showed out of stock; it is not Québec evidence and does not establish cross-product equivalence. |

No app tests or emulator checks were run; this is a proposal-only document.

## Root integration outcome

Accepted the hold on 2026-10-13. No reference or research-ledger record was added because the Canadian frozen listing, Filipino process descriptions, and local culinary wording do not settle a stable product class or Québec French display. No bundled recipe demand was found. See the [integration record](../batches/wp03-section-f-filipino-pinipig-boundary-hold-integration-20261013/README.md). No tests or emulator checks were run for this documentation-only decision.
