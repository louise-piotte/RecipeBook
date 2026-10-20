# WP03 Section F: Brazilian canjiquinha identity-boundary hold (R220)

## Review record

- **Reviewed:** 2026-10-16.
- **Status:** Review disposition accepted and integrated on 2026-10-16 as a documentation-only boundary hold. No catalog JSON, ledger, or recipe data was allocated; see the R219–R225 gap-review integration README.
- **Open checklist:** Section F still calls for regionally significant cereal mixes and preprocessed grains ([active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3648)).
- **Candidate:** Brazilian dry yellow maize sold as canjiquinha de milho, also called canjiquinha and, in some Brazilian product sources, xerém or quirera.
- **Recommendation:** Keep the term unallocated for now. Do not add a new reference or route it to the existing corn-grits identity until a Canadian SKU’s particle-size grade is documented. Current sources support the product’s regional name and processing, but they also identify canjiquinha as a name for corn grits. The current Canadian Amafil listing does not state the size range needed to decide whether it belongs under the Codex-bounded corn-grits row or represents a distinct coarser grade.
- **Candidate reference key:** ingredient-ref-canjiquinha (unallocated; not reserved).
- **Possible bilingual wording if the boundary is resolved:** canjiquinha (crushed yellow maize) / canjiquinha brésilienne (maïs jaune concassé). The English and French glosses are descriptive; the regional name is retained in both locales.

**Free source-ID namespace, reported but not allocated:** WP03-CANJIQUINHA-R220-20261016-S01 through S09 did not appear in the live research ledger or proposal/batch archive at the audit snapshot. This proposal does not add or reserve those IDs. Reuse the existing MAPA source WP03-CANJICA-R67-20261013-S01 and Yoki source WP03-CANJICA-R67-20261013-S08 rather than minting IDs for their URLs.

## Product boundary and reason for the hold

MAPA’s existing canjica record defines yellow canjica maize as degerminated Zea mays grains or grain pieces; Yoki’s current Canjiquinha de Milho page describes its product as crushed yellow canjica maize [R67 S01, S08]. A current Brazilian government procurement listing calls the item CANJIQUINHA/XERÉM, AMARELA and describes clean, dry, degerminated yellow maize broken into uniform granules [S01]. These sources establish a dry, yellow, broken-maize product, separate from white whole-grain canjica and alkaline-treated hominy.

The open identity question is its relationship to active ingredient-ref-corn-grits. Embrapa’s technical circular says corn grits are popularly also called canjiquinha or quirera and defines the described grits fraction as dry-milled degerminated maize particles larger than 300 μm [S02]. A current Moinho Régio canjiquinha listing publishes several grades; its Grade III is a coarse, screened granule product, not one universal canjiquinha particle size [S03]. The R113 corn-grits reference, by contrast, is scoped to Codex CXS 155 degermed maize grits, whose sieve profile requires at least 95% to pass a 2.00 mm sieve and no more than 20% to pass a 0.71 mm sieve [R113 S01].

The sources therefore leave two unsafe shortcuts:

- A new regional row could duplicate ordinary degermed corn grits if the Canadian product matches the active Codex-sized identity.
- An alias on ingredient-ref-corn-grits could overstate equivalence if the retail product is a coarser commercial grade outside that sieve profile.

The current Canadian Amafil product listings identify the SKU and package name but do not publish a sieve result or a grade crosswalk. Keep the identity unresolved until a manufacturer or Canadian product specification documents its particle-size grade or explicitly maps that SKU to the existing Codex-bounded product. This is a grain-granule identity question, not a grain-flour or milling-product review assigned to WP02.

Keep canjiquinha separate from white canjica maize, whole corn kernels, hominy corn, hominy grits, cornmeal, South African samp, and maize rice. Do not treat its use in a cooked dish as evidence that it is interchangeable with any of those products.

## Market evidence and bilingual naming

Canadian and Québec sources show a real regional-market presence:

- SaveMaxx lists Amafil Canjiquinha De Milho as a Brazilian-category grocery item; the indexed page reported it in stock when crawled four months before this review [S04]. Treat that availability as historical because retail stock changes.
- Brazilian Food Grocery in Moncton lists Amafil Canjiquinha as a 500 g product; its indexed title adds “Degiminated corn grits” (spelling as indexed). It was marked sold out when crawled on the review date [S05]. This retailer gloss supports a market search phrase but also illustrates the unresolved link to the active corn-grits identity.
- Marché Brésil in Chambly, Québec, lists “Amafil canjiquinha” in its French storefront. The listing was sold out when crawled; the page supports Québec use of the Portuguese product name, not current availability [S06].
- The Montréal Brasa Bowls French menu lists “Canjiquinha de Milho Amafil – 500 g” and describes it as “Canjiquinha de maïs brésilienne traditionnelle.” The same menu describes the cooked dish as simmered crushed maize. The indexed page was crawled recently, but direct opening returned a cache miss; use it for local naming and market context, not as a terminology authority or independent measurement [S07].

If a later source resolves the product boundary, retaining canjiquinha in both display names is better supported than inventing an unqualified English or French grits synonym. The French gloss “maïs jaune concassé” is a descriptive construction from the local French menu’s maïs concassé wording and the yellow-grain product specifications; it is not OQLF-approved terminology. The source-attested Brazilian variants xerém and quirera should remain inactive aliases until the catalog scope is resolved.

## Active ownership, picker, recipes, and archive audit

The read-only live snapshot contains 1,614 ingredient references, 122 forms, 61 legacy-import candidates, and 1,959 research-ledger records. Exact normalized phrase checks found no canjiquinha, canjiquinha de milho, xerém, or quirera owner in active reference names and aliases, form labels and match terms, legacy-import identities, or a dedicated ledger record. The ledger contains the R67 Yoki source and the R67 canjica boundary decision, which explicitly left canjiquinha outside white canjica. R165 also lists canjiquinha outside its yellow whole-kernel scope. Archive searches found those exclusions, but no focused accepted, held, or reviewed canjiquinha decision.

The relevant active owners are:

| Current reference | Current scope |
|---|---|
| ingredient-ref-corn-grits | corn grits / semoule de maïs de type grits; English aliases degermed corn grits and maize grits; the R113 identity is Codex-bounded. |
| ingredient-ref-hominy-grits | hominy grits / gruau de maïs; alkaline-treated ground maize product. |
| ingredient-ref-hominy-corn | hominy corn / maïs lessivé; whole-kernel alkaline-treated maize. |
| ingredient-ref-cornmeal | cornmeal / semoule de maïs; WP02 grain-meal identity, not a canjiquinha owner. |
| ingredient-ref-canjica-white-maize | white canjica maize / maïs blanc pour canjica; source-defined white whole-grain product. |

No form is attached to ingredient-ref-corn-grits. A full scan of the 114 manifest-listed recipe files and 1,123 structured ingredient rows found no canjiquinha, xerém, xerem, quirera, or canjiquinha de milho match. There is no recipe demand or recipe link to add.

The picker normalizes accents and punctuation, prefers complete word phrases, and falls back to substring matching ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Current ownership and the effect of a hypothetical source-named canjiquinha reference are:

| Query | Current results | If a canjiquinha row were later added | Decision |
|---|---|---|---|
| canjiquinha; canjiquinha de milho | None | One canjiquinha result | Exact regional product search is currently unowned. |
| xerém; quirera | None | One result only if a source-attested alias is added | Do not add these aliases until scope is resolved. |
| corn grits; degermed corn grits | ingredient-ref-corn-grits only | Could remain unchanged if the new bilingual display avoids “corn grits”; a generic alias would create duplicate results | Do not alias canjiquinha to the current row without a grade crosswalk. |
| grits | Four results, including ingredient-ref-corn-grits | A display or alias containing “grits” would add a fifth result | Keep bare grits broad and unassigned. |
| canjica | ingredient-ref-canjica-white-maize only | Remains separate if canjiquinha is not aliased to canjica | Do not collapse crushed yellow canjiquinha into white whole-grain canjica. |
| hominy grits; gruau de maïs | ingredient-ref-hominy-grits only | Unchanged | Preserve the alkaline-treated product boundary. |

## Measures, forms, and substitutions

Yoki’s existing manufacturer record says its 500 g Canjiquinha de Milho package lists a 50 g portion as ⅓ xícara de chá [R67 S08]. That is one SKU’s nutrition-label serving. The page does not state the volume of xícara de chá, and the serving must not be converted to an app cup, density, or reusable unit mapping. Do not transfer it to Amafil or to a general canjiquinha identity.

Amafil’s current product page gives a 500 g package; this is net package size, not a recipe measure [S08]. Its official pork-rib recipe uses one 500 g package with 2 L water, calls for a four-hour soak, then says to cook until soft. This is one recipe’s amount and preparation method, not a dry-to-cooked yield, volume conversion, density, or general substitution [S09]. The government procurement listing’s 20 kg order and 500 g–1 kg package requirement are purchasing specifications, not kitchen measures [S01].

No source reviewed establishes a reusable household volume, density, dry/cooked form, cooking yield, or exact mass conversion for Canadian retail canjiquinha. No source provides a tested replacement ratio against corn grits, cornmeal, hominy grits, white canjica, samp, or maize rice. Keep all numeric/form behavior and global or contextual substitutions inactive. The bundled recipe corpus has no matching line that could support a recipe-specific substitute.

## Source register

The IDs S01–S09 below are proposal-local and unallocated. R67 S01 and S08 are reused records; their URLs must not receive duplicate source IDs.

| ID | Source | Evidence and limits |
|---|---|---|
| WP03-CANJIQUINHA-R220-20261016-S01 | Contrata+Brasil, [Canjiquinha/Xerém, amarela procurement specification](https://contratamaisbrasil.sistema.gov.br/alimentos/oportunidade/1138/detalhar), Niterói/RJ, current 2026 opportunity. | Government food listing defines yellow maize, degermed and broken into uniform granules; it sets net-weight package and procurement amounts. It is a current procurement specification, not a universal consumer-grade standard or cooking measure. |
| WP03-CANJIQUINHA-R220-20261016-S02 | Embrapa Agroindústria de Alimentos, [CT137: Produção de flocos de milho instantâneos](https://www.infoteca.cnptia.embrapa.br/infoteca/bitstream/doc/416968/1/CT137flocosmilho.pdf), p. 2, lines 27–37. | Calls grits popularly canjiquinha or quirera and defines the described dry-milled, degerminated fraction as greater than 300 μm. It is industrial processing guidance; it does not give a complete retail-grade range or a Canadian SKU crosswalk. |
| WP03-CANJIQUINHA-R220-20261016-S03 | Moinho Régio, [Canjiquinha III](https://www.moinhoregio.com.br/canjiquinha-3/), product description and granulometry. | A current industrial supplier lists a coarse screened grade and multiple sieve bands. This demonstrates grade variation; the page does not describe the Canadian Amafil package. |
| WP03-CANJIQUINHA-R220-20261016-S04 | SaveMaxx, [Amafil Canjiquinha De Milho](https://savemaxx.ca/product/amafil-canjiquinha-de-milho/), SKU SM_49136. | Canadian retailer listing and Brazil category. The search-index crawl reported in-stock status four months before this review; do not assert current stock or infer product grade. |
| WP03-CANJIQUINHA-R220-20261016-S05 | Brazilian Food Grocery, [Amafil Canjiquinha, 500 g](https://bfgrocerymoncton.ca/), Moncton product listing. | Canadian retailer listing uses “Degiminated corn grits” in its indexed title (spelling as indexed) and was marked sold out when crawled on 2026-10-16. Its English gloss is retailer wording, not a verified Codex grade. |
| WP03-CANJIQUINHA-R220-20261016-S06 | Marché Brésil, [Amafil canjiquinha](https://www.marchebresil.com/products/amafil-canjiquinha), Chambly, Québec. | French storefront retains the product name; page showed sold out and pickup unavailable when crawled. Supports local Québec naming, not current stock or product composition. |
| WP03-CANJIQUINHA-R220-20261016-S07 | Brasa Bowls, [Montréal French-language delivery menu](https://www.ubereats.com/ca/store/brasa-bowls-cuisine-bresilienne/9RvkZHQ-X0S5OmtVYI0d7g). | Indexed menu lists Canjiquinha de Milho Amafil, 500 g, and describes “Canjiquinha de maïs brésilienne traditionnelle”; another menu dish is described as simmered crushed maize. Recent index text was available, while direct page opening returned a cache miss. This is local usage, not official terminology or an independent weight measurement. |
| WP03-CANJIQUINHA-R220-20261016-S08 | Amafil, [Canjiquinha de Milho](https://amafil.com.br/produto/canjiquinha-de-milho-amafil/), current product page. | Manufacturer identifies a 500 g plastic package and notes gluten; its page does not provide a particle-size grade or household measure. |
| WP03-CANJIQUINHA-R220-20261016-S09 | Amafil, [Canjiquinha de Costelinha](https://amafil.com.br/receita/canjiquinha-de-costelinha-amafil/), recipe and method. | Indexed manufacturer recipe uses one 500 g pack and 2 L water and calls for a four-hour soak before cooking until soft. The recipe page itself returned a cache miss on direct opening; indexed recipe evidence is recipe-specific and does not create a yield or substitution rule. |
| Reused R67 S01 | MAPA, [Compêndio de Produtos Vegetais](https://www.gov.br/agricultura/pt-br/assuntos/inspecao/produtos-vegetal/legislacao-programas-nacionais-e-seguranca-dos-alimentos-1/legislacao/compendios/compendio-produtos-vegetais.pdf/@@download/file), pp. 119–121. | Existing ledger record defines canjica maize and color/processing classes. It does not specify canjiquinha’s grind size. Reuse WP03-CANJICA-R67-20261013-S01. |
| Reused R67 S08 | Yoki, [Canjiquinha de Milho](https://www.yoki.com.br/produtos/yoki-canjiquinha-de-milho), manufacturer page. | Existing ledger record identifies yellow canjica maize, crushed; package 500 g; label portion 50 g / ⅓ xícara de chá. Reuse WP03-CANJICA-R67-20261013-S08. |
| R113 comparator | Codex Alimentarius, [CXS 155: Degermed Maize (Corn) Meal and Maize (Corn) Grits](https://www.fao.org/4/a1392e/a1392e00.pdf), Annex granularity table; see the [R113 identity review](./wp03-section-f-ordinary-corn-grits-boundary-review-r113-20261014.md). | Establishes the active corn-grits sieve profile and separate product boundary. It does not classify the Canadian canjiquinha SKU. The exact Codex URL and source ID already belong to the corn-grits review; reuse that existing record if needed. |

## Recommendation

Keep Brazilian canjiquinha unallocated in R220. Its current Canadian and Québec listings establish market presence and bilingual search wording, and the sources identify it as yellow, degermed, broken maize. Embrapa also identifies canjiquinha as a popular name for corn grits, while grade-specific processing evidence shows that the commercial label does not identify one universal particle size. The Canadian Amafil SKU has no published grade to resolve the current boundary with ingredient-ref-corn-grits. Do not add a new row or an alias until that crosswalk is documented.

No catalog or ledger data, recipe links, measures, forms, conversions, yields, substitutions, tests, or emulator checks are proposed.
