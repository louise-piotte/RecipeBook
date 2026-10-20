# WP03 Section G sweet-potato-starch noodle gap review

- **Reviewed:** 2026-10-11
- **Recommendation:** add a source-qualified sweet-potato-starch noodle identity to the Section G review queue. Keep generic glass-noodle terms unresolved and separate from the existing mung-bean thread identity.
- **Scope:** check whether finished noodles made with sweet potato starch have a supported English and Québec French name, and whether a starch-source identity is distinct from mung-bean threads, generic glass noodles, sweet-potato flour/starch, and recipe preparation state. This is a proposal only; no catalog, ledger, seed, recipe, plan, roadmap, or code edits are proposed.

## Audit of the current catalog, ledger, recipes, and earlier review

Snapshot checked on 2026-10-11:

| Artifact | Snapshot |
| --- | ---: |
| Active ingredient references | 962 |
| Ingredient forms | 53 |
| Research-ledger records | 1,233 |
| Legacy import candidates | 75 |
| Manifest-listed bundled recipes | 114 |
| Bundled recipe ingredient rows | 1,123 |

The normalized exact-key check found no active reference or form for `sweet potato starch noodles`, `sweet potato glass noodles`, `sweet potato noodles`, `glass noodles`, `dangmyeon`, `japchae noodles`, `nouilles à base de fécule de patate douce`, `nouilles de patate douce`, `vermicelles de patate douce`, or `nouilles de verre`. The exact existing noodle owner is `ingredient-ref-bean-thread-cellophane-noodles` (`bean thread cellophane noodles / nouilles à base de farine de haricot mungo`, category `LEGUME_AND_PULSE`). Related but separate active references are `ingredient-ref-sweet-potato-starch` (`sweet potato starch / fécule de patate douce`, `FLOUR_AND_STARCH`), `ingredient-ref-sweet-potato-flour` (`sweet potato flour / farine de patate douce`, `FLOUR_AND_STARCH`), the sweet-potato root, and `ingredient-ref-rice-vermicelli`. None is a finished sweet-potato-starch noodle identity.

The ledger contains verified records for the existing mung-bean thread, sweet-potato starch, sweet-potato flour, and rice vermicelli. It has no sweet-potato noodle, dangmyeon, or generic glass-noodle identity record. The earlier [Section G rice-noodle boundary review](wp03-section-g-rice-noodles-boundary-review-20261010.md) correctly held generic `glass noodles`, `cellophane noodles`, and `nouilles de verre` because glass-noodle products can use different starches. It kept sweet-potato glass noodles as a future source-specific candidate because the Roland product page’s description said starch while its ingredient panel said flour. The Canadian listings reviewed here provide separate, direct ingredient statements and resolve that product-specific evidence gap for other products; they do not repair or override Roland’s conflicting listing.

All 114 manifest-listed recipes and their 1,123 ingredient rows were scanned for the candidate names, `glass noodles`, `dangmyeon`, Japchae noodle phrases, and the French variants above. There are no matching ingredient rows or full-recipe text hits. This candidate therefore addresses catalog coverage rather than a current bundled recipe request.

## Evidence and proposed identity

The strongest formulation evidence is product-specific. Canadian retailer Haisue lists a Daesang product as `Sweet Potato Glass Noodle`; its description identifies sweet-potato starch and its ingredient panel separately lists sweet potato starch plus other ingredients [S04]. Walmart Canada’s French-language listing names SunGiven `Vermicelles de Patates Douces` and lists `Amidon de Patate Douce` as the ingredient [S05]. Walmart’s page says the product is out of stock at the time checked and warns that supplier or third-party product information is not independently verified. These two listings support the starch-qualified product class, but do not establish a universal formula or that sweet-potato starch is the only ingredient in every product.

The Korean National Institute of Health library hosts a 2022 food-science paper whose abstract studies dangmyeon made with corn, potato, and sweet-potato starches [S01]. This directly cautions against assigning bare `dangmyeon` to the sweet-potato identity. A Sempio manufacturer page likewise calls its product sweet-potato glass noodles while listing both tapioca and sweet-potato starch [S10]. Keep the identity at the product-class boundary: a finished noodle sold as sweet-potato-starch/glass noodle with product evidence for sweet-potato starch, whether or not that particular product includes other ingredients. Do not state a sole-starch recipe or percentage.

Québec French evidence supports a precise display. OQLF records `fécule de patate douce` for English `sweet potato starch` and defines the food ingredient as a product obtained through wet extraction from sweet-potato roots [S02]. OQLF also defines `nouilles` and notes that Asian noodles vary in thickness and width and can be grouped by ingredients [S03]. A Montréal-area French Haisue Japchae page uses `Vermicelles de patate douce coréens` in its title and `nouilles à base de fécule de patate douce` in the description [S06]. The Journal de Québec uses `nouilles Dangmyeon, nouilles à base de patate douce` in a local recipe article [S07], while Walmart Canada’s French listing provides a direct retail product title and ingredient statement [S05]. The precise fr-CA display below is intentionally source-specific; the shorter market phrase remains a search alias, not a claim that every sweet-potato noodle is starch-made.

| Field | Proposal |
| --- | --- |
| Candidate ID | `ingredient-ref-sweet-potato-starch-noodles` |
| English display | `sweet potato starch noodles` |
| fr-CA display | `nouilles à base de fécule de patate douce` |
| English alias | `sweet potato glass noodles` |
| French alias | `vermicelles de patate douce`; `nouilles de patate douce` |
| Category suggestion | `VEGETABLE_AND_AROMATIC`, following the botanical source category of `ingredient-ref-sweet-potato`; confirm during integration because the product is processed from starch. |
| Identity boundary | Finished noodles whose product listing or label identifies sweet-potato starch as a source ingredient. Do not extend to sweet-potato root, sweet-potato flour, isolated starch, or products whose only name is generic glass/cellophane noodles. |

The retailer-supported aliases are source-qualified in context: Haisue’s French title and Walmart’s product title are paired with starch ingredient evidence. Do not add bare `glass noodles`, `cellophane noodles`, `nouilles de verre`, `Korean glass noodles`, `Korean vermicelli`, `dangmyeon`, or `japchae noodles`. The NIH paper shows that dangmyeon can refer to starch noodles made from several botanical sources; `Japchae` names a prepared dish/context. Do not add bare `sweet potato noodles` as an English alias because that phrase can also describe vegetable-cut sweet potato or products with unspecified processing. Do not alias any of these noodle terms to `ingredient-ref-bean-thread-cellophane-noodles`, whose defining French name explicitly identifies mung-bean flour.

## Product state and data boundaries

The proposal names the packaged noodle product. Recipe soaking, boiling, or stir-frying is preparation, not a separate ingredient identity. A Daesang Vietnam supplementary label for a separate Daesang sweet-potato glass-noodle product gives boil-before-use instructions and dry storage [S09], but that overseas label is not matched to the Canadian Daesang listing’s SKU and cannot define all Canadian products. The Canadian listing pages do not consistently establish package state. Do not add a dried/cooked form, cooking time, density, unit mapping, quantity conversion, yield, or recipe link from this evidence. No global or contextual substitution is proposed.

Thin and thick products appear in one Canadian retailer’s dangmyeon listing [S08]. Treat those as retailer product variants, not standardized forms or evidence that every shape has one cooking behavior. The broad source-defined noodle row can cover the product class only where the product itself is identified by sweet-potato starch; it does not imply a width or shape rule.

## Sources

All sources were checked on **2026-10-11**. Product stock and assortments can change; listings are evidence of market names and product-specific declarations, not standards.

- **WP03-SPN-20261011-S01 — Korean National Institute of Health library**, [“Quality Characteristics of Dangmyeon (Starch Vermicelli) Made from Heat-Moisture Treated Corn, Potato, and Sweet Potato Starches”](https://library.nih.go.kr/ncmiklib/elib/kom/articleDtl.do?pk_pb_seq=PB08372467), 2022. The abstract identifies three starch sources used to make dangmyeon. The library page was directly accessible; it supports source variation, not retail formulation or Québec naming.
- **WP03-SPN-20261011-S02 — Office québécois de la langue française**, [fécule de patate douce](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287217/fecule-de-patate-douce), GDT. The term is attributed to AFNOR (1979); the definition distinguishes extracted starch from the root and from flour.
- **WP03-SPN-20261011-S03 — Office québécois de la langue française**, [nouilles](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8359483/nouilles), last updated 2003. It describes Asian noodles as elongated, variable in thickness and width, grouped by ingredients. This supports the generic noun, not the complete compound display as an OQLF entry.
- **WP03-SPN-20261011-S04 — Haisue**, [Daesang Sweet Potato Glass Noodle](https://haisue.ca/products/daesang-sweet-potato-glass-noodle-500g), Canadian retailer, Toronto pickup address shown. The page title and description name sweet-potato glass noodles/starch; the ingredient panel lists sweet potato starch and additional ingredients. At access, the page showed backordered status; it also displayed a pickup option. No posting date or package image label was independently verified.
- **WP03-SPN-20261011-S05 — Walmart Canada**, [SunGiven Vermicelles de Patates Douces](https://www.walmart.ca/fr/ip/SunGiven-Vermicelles-de-Patates-Douces/10283597). The French product page names the item and lists `Amidon de Patate Douce`; it showed out of stock. Walmart states that supplier/third-party product data may not be independently verified. Used with the Haisue listing, not as a sole formulation authority.
- **WP03-SPN-20261011-S06 — Haisue**, [Japchae (Vermicelles de patate douce coréens sautés)](https://haisue.ca/fr/blogs/recipes-1/japchae-korean-stir-fried-glass-noodles). Search-indexed French excerpt gives both `Vermicelles de patate douce coréens` and `nouilles à base de fécule de patate douce`. Direct page access returned a cache miss, so only the indexed wording is used; it is a retailer recipe page, not an OQLF ruling or product label.
- **WP03-SPN-20261011-S07 — Journal de Québec**, [Cuisine coréenne: la salade japchae au bœuf, patate douce, canneberges et coriandre](https://www.journaldequebec.com/2024/01/28/cuisine-coreenne-la-salade-japchae-au-buf-patate-douce-canneberges-et-coriandre), 2024-01-28 URL date. The accessible article calls the dish’s ingredient `nouilles Dangmyeon, nouilles à base de patate douce`; this is Québec French culinary wording, not a starch declaration or package label.
- **WP03-SPN-20261011-S08 — Superking Supermarket**, [Korean Sweet Potato Noodles (Dangmyeon)](https://superking.ca/products/korean-sweet-potato-noodles-dangmyeon-london), London, Ontario. The page showed in-stock/pickup status at access and uses a sweet-potato/dangmyeon retail name. No ingredient panel was visible, so it supports market naming only.
- **WP03-SPN-20261011-S09 — Daesang Vietnam**, [supplementary product label](https://daesang.com.vn/upload/photos/shares/V%C4%83n%20b%E1%BA%A3n%20c%C3%B4ng%20b%E1%BB%91/H%C3%A0ng%20nh%E1%BA%ADp%20kh%E1%BA%A9u/2.2%20TB%20Thay%20%C4%91%E1%BB%95i%20%C4%91%E1%BB%8Ba%20ch%E1%BB%89%20Daesang%20HQ%2C%20t%C3%AAn%20Miwon%20VN%20tr%C3%AAn%20HSCB%2C%20nh%C3%A3n%20ph%E1%BB%A5%20s%E1%BA%A3n%20ph%E1%BA%A9m%20NK.pdf). It names one imported product `Sweet potato glass noodle`, identifies its own starch composition and gives dry-storage/preparation directions. It is an overseas label for a separate product; its formula and state are not generalized to Canadian listings.
- **WP03-SPN-20261011-S10 — Sempio**, [Glass Noodles (French product page)](https://globalsempio.com/fr/products/glass-noodles), manufacturer. The product is described as sweet-potato glass noodles, while the ingredient panel lists tapioca starch and sweet-potato starch. It demonstrates why the candidate must not claim a single-starch or universal composition. Manufacturer page; not a Canadian retailer listing.
- **WP03-SPN-20261011-S11 — Marché Liantai**, [Asian Style Sweet Potato Noodles DangMyeon](https://www.marcheliantai.ca/Asian-Style-Sweet-Potato-Noodles-DangMyeon.html), Canadian retailer. The listing showed in stock and names thin and thick versions; it does not provide an ingredient statement. Used for current market naming/shape variation only.

## Disposition

The evidence supports a distinct, identity-only sweet-potato-starch noodle candidate. Add the source-qualified English/French display pair to the Section G follow-up and preserve the generic glass-noodle hold. Keep the bundle’s lack of direct demand visible; it does not justify a recipe link, form, or measurement record. The exact French display is supported by OQLF component terminology and Canadian French retail/recipe wording, while the complete compound itself is not an OQLF-listed term. Integration should preserve that distinction and leave all numeric, form, conversion, yield, and substitution data empty.
