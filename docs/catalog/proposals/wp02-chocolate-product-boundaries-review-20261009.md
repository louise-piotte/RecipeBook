# WP02 Section D — cocoa and chocolate product boundary review

- **Reviewed:** 2026-10-09
- **Status:** integrated on 2026-10-09 after coordinator review; the canonical disposition is recorded below.
- **Scope:** cocoa butter; cocoa mass / cocoa liquor / chocolate liquor; couverture chocolate; compound coating / compound chocolate. Existing chocolate identities and forms are inspected to avoid duplicate work.
- **Plan state:** broader WP02 Section D remains open.

## Repository snapshot

The live bundled seed contains **414 ingredient references** and **16 forms**. The research ledger has **579 records** and **575 source entries**. The legacy file has **99 candidates**. The bundled corpus has **114 recipe JSON files** and **1,123 ingredient rows**. Hashes below identify the exact proposal-time snapshot.

| Artifact | Count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 414 | `5f7cca9264d410c2c2e619321fc0daa7ed6a6907630225dd490ba0894ce8288e` |
| `ingredient-forms.v1.json` | 16 | `247a927eb706ac3867d001f556b480bdc5244a80eaeffe85a0861497a9c0378a` |
| `manifest.v1.json` | — | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `research-ledger.v1.json` | 579 records / 575 source entries | `db6ac4439396eca82f5f66508d30d538f5b4686431e09d87240239060143c647` |
| `legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| Sorted recipe filename + NUL + per-file SHA-256 + newline aggregate | 114 files / 1,123 rows | `0ac5ea9d625417b7ff2a84e3bacc2d4f0b3cdcb49c931d9eaedf77c28593779c` |

The active chocolate/cocoa references include bittersweet chocolate, dark chocolate, milk chocolate, semisweet chocolate, unsweetened chocolate, white chocolate, chocolate shavings, Dutch-process cocoa powder, and unsweetened cocoa powder. None of the four scoped product names has its own active reference. `ingredient-ref-unsweetened-chocolate` is the important existing overlap: it has no ledger sources, `identityState: unreviewed`, and `measurementState: blocked_pending_evidence`.

The six existing chocolate forms are chips forms on semisweet, white, dark, and milk chocolate, plus melted forms on semisweet and white chocolate. The two melted forms both match the exact generic phrase `melted chocolate`; that phrase is already ambiguous and should not become an alias for any new product. The prior [chocolate identity batch](../batches/chocolate-confectionery-identities.md) and [form-hint batch](../batches/chocolate-form-hints.md) cover milk-chocolate chips and recipe-attested chips/melted hints. The identity batch mentions compound coating only to distinguish it from real chocolate chips; it does not propose or integrate a compound-coating reference. Broader Section D remains open.

The legacy candidates include butterscotch chips and peanut-butter chips, but none for cocoa butter, cocoa mass/liquor, couverture, or compound coating. No prior proposal packet was found for these four boundaries. The relevant ledger record is the unreviewed, source-empty `ingredient-ref-unsweetened-chocolate`; no cocoa-butter, cocoa-mass, couverture, or compound-coating record is present.

## Candidate decisions for coordinator review

| Product | Proposed disposition | Names and safe alias boundary |
| --- | --- | --- |
| **Cocoa butter** | **New distinct identity candidate.** It is the separated cocoa-bean fat, not whole cocoa mass/liquor and not generic cocoa fat. | EN `cocoa butter`; fr-CA `beurre de cacao`. OQLF also records English `cacao butter`, suitable as a reviewed alias. Do not alias `cocoa fat` / `graisse de cacao`: OQLF distinguishes that nonconforming fat from cocoa butter. Keep the scientific `theobroma oil` term out of the ordinary food alias list. Powdered/freeze-dried cocoa butter is a separate processed presentation, not an alias. |
| **Cocoa mass / cocoa liquor / chocolate liquor** | **Do not add a second identity yet.** The current `ingredient-ref-unsweetened-chocolate` is the proposed existing row to review for this product class. Codex CXS 141 names cocoa/cacao mass and cocoa/chocolate liquor as one standardized product and lists cocoa paste and unsweetened chocolate among names for it; Canadian CFCS section 4.1.3 groups cocoa liquor, cocoa mass, unsweetened chocolate, bitter chocolate, and chocolate liquor under the same process/composition section. This supports an alias relationship but does not authorize a new ID or automatic seed merge. | If the coordinator accepts the existing row as the canonical identity, candidate EN aliases are `cocoa mass`, `cacao mass`, `cocoa liquor`, `chocolate liquor`, `cocoa/chocolate liquor`, and `cocoa paste`. OQLF supports fr-CA `pâte de cacao` and also lists `cacao en pâte`, `masse de cacao`, and `cacao en masse`; use these rather than a literal French calque of “liquor.” Keep `bitter chocolate` unresolved because it is easy to confuse with the separate active `bittersweet chocolate` identity. Do not add generic `chocolate`, `baking chocolate`, `cooking chocolate`, or `chocolate coating` as aliases: U.S. legal nomenclature is not a safe global alias policy, and the generic terms are broader in recipe/product use. |
| **Couverture chocolate** | **New distinct searchable product-class candidate**, separate from ordinary dark, milk, semisweet, and compound products. Standards and Québec terminology describe a higher-cocoa-butter chocolate product with a defined composition/use boundary. Treat dark/milk/white and cocoa-percentage wording as descriptors under this class, not as a set of combinatorial IDs; there is no current recipe need for those combinations. | EN `couverture chocolate`; fr-CA `chocolat de couverture` (OQLF preferred term). Do not alias unqualified `couverture`, `chocolate coating`, `dark chocolate`, or `chocolate chips`. A coating is an application, while couverture is a product class. The Québec “couverture” word also appears in recipe prose with the generic sense of a chocolate covering layer. |
| **Compound coating** | **New distinct identity candidate**, separate from real chocolate and couverture. CFIA distinguishes compound coatings from chocolate for common-name purposes: they have chocolate’s appearance but not its composition. | EN `compound coating`; fr-CA `enrobage composé` (CFIA wording). Do not alias `chocolate coating`: CFIA expects that name to meet the chocolate standard. Keep `compound chocolate` / `chocolate compound` unresolved and inactive: Codex uses these names in an imitation/substitute food category, but CFIA says there should be no indication that compound coatings are “chocolate.” Do not alias `candy melts`, `melting wafers`, `chocolate-flavoured coating`, or brand/product names; they do not prove one composition. |

### Product boundaries and rejected scope

- Cocoa mass/liquor retains cocoa butter and cocoa solids together. Cocoa butter is the separated fat; cocoa cake and cocoa powder result after partial or greater fat removal. Do not merge these product identities.
- The current unsweetened-chocolate row is source-empty and unreviewed, so this packet recommends a coordinator-led boundary update to that row, not an unreviewed alias write or second “cocoa mass” row. Codex lists multiple market names, while Canadian and U.S. rules use different naming conventions. The standards establish a close product class; independent product-label review is still useful before changing a canonical bilingual display.
- Couverture is real chocolate with a defined high-cocoa-butter/composition profile and confectionery/baking use. It is not interchangeable with every dark or semisweet chocolate identity. Its identity can have dark, milk, and other varieties, but no specific variety-level identity is recommended here.
- Compound coatings can mimic chocolate in appearance/use, but the Canadian regulator explicitly separates composition and naming. Keep real chocolate and compound coating as distinct identities. The specific fats and ingredients in compound products vary by maker; do not infer one recipe.
- `Cocoa fat` / `graisse de cacao`, cocoa-butter powder, cocoa cake, cocoa powder, nibs, chocolate shavings, chips, melted chocolate, couverture wafers/callets, and compound wafers remain distinct material, grade, or physical-form concepts. This review does not create forms for them. `Callets` and named drops are producer shapes/brands, not aliases for the underlying product.
- Recipe prose `couverture au chocolat` is not a product mention; see the recipe audit below. No recipe currently asks for cocoa butter, cocoa mass/liquor, couverture chocolate, or compound coating as an ingredient line.

## Measurement, forms, and conversion evidence

No reviewed source establishes a source-specific density or app-ready unit mapping for cocoa butter, cocoa mass/liquor, couverture, or compound coating. Keep `defaultDensity` null, `unitMappings` empty, and form-level density absent. Do not derive density from composition percentages, product packaging, a manufacturer’s melting/flow guidance, or a generic chopped-chocolate chart.

| Observed source statement | Relevance and disposition |
| --- | --- |
| King Arthur Baking’s chart lists `Chocolate (chopped)`: 1 cup = 6 oz = 170 g; `Chocolate Chips`: 1 cup = 6 oz = 170 g. | It does not identify a couverture, chocolate type, compound status, cut size, cup capacity, or filling method. Retain as generic source observations only; do not attach to these candidates or the existing chip forms. |
| The same chart lists `Cocoa (unsweetened)`: 1/2 cup = 1 1/2 oz = 42 g. | This is the cocoa powder entry, not cocoa mass/liquor or cocoa butter. Do not transfer it to the scoped products. |
| Callebaut sells cocoa butter as 4 kg blocks or as 3 kg buckets of Callets, and says adding 1–8% to the total volume of its chocolate can adjust fluidity. | Package quantity is not a kitchen conversion. The percentage is a manufacturer’s fluidity adjustment for its chocolate, not a density, universal formula, substitution, or app conversion. Keep inactive. |

No source-backed forms or transformations are proposed. Existing `chips` and `melted` hints remain attached to their current base chocolates. A package being sold as a block, drop, callet, wafer, or powder does not by itself establish a useful conversion form. Proposed measurement state for the four reviewed boundaries is `researched_no_supported_value` for the sources checked here; retain the existing unsweetened-chocolate record’s state until the identity review is accepted.

## Substitution evidence

No general substitution ratio is supported for cocoa butter ↔ cocoa mass/liquor, couverture ↔ ordinary chocolate, or real chocolate ↔ compound coating. These products differ in composition and handling roles. CFIA separates real chocolate coatings from compound coatings; Callebaut describes its compound milk coating as a product that melts, applies, and cools without tempering. This is handling evidence, not an equivalence ratio.

Callebaut’s 1–8% cocoa-butter addition is an optional product-specific fluidity adjustment to its chocolate. It is not a reciprocal cocoa-butter-to-chocolate substitution. No rule is proposed. The cocoa mass/liquor names are being reviewed as labels for one product class, not as a substitution. Keep all substitution rules inactive and mark exact unresearched recipe pairs open.

## Exact-key, legacy, ledger, and recipe audits

The exact-key check used the repository’s `normalize_search_key` from `tools/seed_package/bundled_seed_package.py` (NFKD/case folding, accent and ligature handling, punctuation-to-space folding, and trimming). It compared candidate displays, reviewed and rejected aliases, and boundary terms against all current reference names/aliases and all form labels/match terms, and checked the legacy candidate names/aliases. No ID or source is proposed in this packet.

| Searched term | Exact normalized owner / result | Decision |
| --- | --- | --- |
| `unsweetened chocolate` | Canonical name of `ingredient-ref-unsweetened-chocolate` | Existing identity is the cocoa-mass boundary to review; do not create a duplicate row. |
| `bittersweet chocolate` | Canonical name of `ingredient-ref-bittersweet-chocolate` | Distinct current identity; keep the proposed `bitter chocolate` alias unresolved. |
| `cocoa powder` | English alias on `ingredient-ref-unsweetened-cocoa-powder` | Existing powder alias, deliberately excluded from cocoa mass/liquor. |
| `chocolate shavings` | Canonical name of `ingredient-ref-chocolate-shavings` | Existing separate ingredient concept; no alias relationship proposed. |
| `chocolate chips` | English alias on `ingredient-ref-semisweet-chocolate` and match term on `ingredient-form-semisweet-chocolate-chips` | Existing chip behavior is covered by the prior chocolate batches; do not use as a couverture or compound alias. |
| `melted chocolate` | Match term on both existing semisweet-melted and white-melted forms | Existing ambiguous form key; do not use as a base-identity alias. |
| Other scoped names and reviewed alias candidates | No exact active reference/form or legacy-candidate match | No collision found. |

No target legacy candidate exists. The only related legacy confectionery candidates are butterscotch chips and peanut-butter chips; neither represents chocolate or cocoa mass.

All **114 serialized recipe JSON files** and **1,123 ingredient rows** were searched for the candidate names and boundary variants. Two lines already request `unsweetened chocolate`, both linked to `ingredient-ref-unsweetened-chocolate`: recipe 013 (*Pinwheel Cookies*) and recipe 107 (*French Silk Pie*). No recipe ingredient row mentions cocoa butter, cocoa mass/liquor, couverture chocolate, or compound coating. The word `couverture` occurs once in recipe 006’s French description, `couverture au chocolat`, meaning the chocolate topping/covering layer; its ingredient line is `semisweet chocolate`. No relink is indicated by this review.

The 575 existing ledger source IDs were checked against the packet-local prefix `WP02-D-CHOC-20261009-S`; there are no collisions. These IDs are used only in the source map below and do not create ledger records.

## Unresolved coordinator decisions

1. Confirm whether `ingredient-ref-unsweetened-chocolate` should become the canonical reference for the cocoa mass / cocoa-liquor class. If accepted, decide whether to set the French display to OQLF’s `pâte de cacao` or retain `chocolat non sucré` with the supported cocoa-mass French terms as aliases.
2. Confirm the app’s handling of a generic `couverture chocolate` identity versus a composition/grade field that can qualify dark, milk, or white chocolate. Do not generate product combinations without recipe need.
3. Confirm whether `compound chocolate` can be a search alias in a locale-neutral catalog despite CFIA’s labeling guidance. Until then, keep only `compound coating / enrobage composé` as the candidate display pair.
4. Obtain independent bilingual Québec French product review for displays and aliases. OQLF directly supports the cocoa butter, cocoa mass, and couverture vocabulary; CFIA supports `enrobage composé`, but the compound market labels need a terminology check.
5. Keep density, unit mapping, form, conversion, and substitution decisions open by exact product and preparation. No composition threshold, package mass, or manufacturing guidance is a kitchen conversion or universal substitution ratio.

## Source and query log

All sources were accessed **2026-10-09**. Source IDs are packet-local and were checked for collision against the current ledger before use.

### Search queries used

- `site:fao.org/fao-who-codexalimentarius CXS 141-1983 cocoa cacao mass cocoa chocolate liquor 2025`
- `site:inspection.canada.ca Canadian Food Compositional Standards 4.1.3 cocoa mass unsweetened chocolate`
- `site:ecfr.gov/current/title-21 163.111 chocolate liquor unsweetened chocolate`
- `site:vitrinelinguistique.oqlf.gouv.qc.ca pâte de cacao cocoa mass chocolate liquor`
- `site:vitrinelinguistique.oqlf.gouv.qc.ca beurre de cacao cocoa butter cacao butter`
- `site:vitrinelinguistique.oqlf.gouv.qc.ca chocolat de couverture couverture chocolate`
- `site:fao.org/fao-who-codexalimentarius CXS 87-1981 couverture cocoa butter 31%`
- `site:inspection.canada.ca/fr enrobages composés chocolat compound`
- `Codex GSFA 05.1.5 compound chocolate compound coatings`
- `site:callebaut.com couverture milk chocolate high fluidity cocoa butter`
- `site:callebaut.com compound milk coating no tempering`
- `site:puratos.ca/fr enrobage composé compound coating`
- `site:kingarthurbaking.com/learn/ingredient-weight-chart chocolate chopped cocoa unsweetened`
- `couverture chocolate compound substitute recipe weight ratio`

### Source-to-claim map

| ID | Source | Claim used and limitation |
| --- | --- | --- |
| WP02-D-CHOC-20261009-S01 | FAO/WHO Codex, [CXS 141-1983: Cocoa (Cacao) Mass (Cocoa/Chocolate Liquor) and Cocoa Cake](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS%2B141-1983%2FCXS_141e.pdf) | The current standard names cocoa/cacao mass and cocoa/chocolate liquor as the same defined product; its label section lists cocoa mass, cocoa/chocolate liquor, cocoa paste, unsweetened chocolate, and bitter chocolate. It separately defines cocoa cake after fat removal. Standard names still depend on importing-market acceptability. |
| WP02-D-CHOC-20261009-S02 | Canadian Food Inspection Agency, [Canadian Food Compositional Standards, volume 4, sections 4.1.3–4.1.9](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0) | Section 4.1.3 groups cocoa liquor, cocoa mass, unsweetened chocolate, bitter chocolate, and chocolate liquor under the same nib-disintegration/minimum-cocoa-butter standard; the next sections define sweetened chocolates separately. This is Canadian standard grouping, not proof that all retail phrases are universally interchangeable. |
| WP02-D-CHOC-20261009-S03 | U.S. eCFR, [21 CFR 163.111: Chocolate liquor](https://www.ecfr.gov/current/title-21/chapter-I/subchapter-B/part-163/section-163.111) | Defines chocolate liquor from finely ground cacao nibs and includes several U.S. legal food names, including unsweetened, bitter, baking, cooking, and coating chocolate. Do not generalize those U.S. labels as locale-neutral aliases. |
| WP02-D-CHOC-20261009-S04 | OQLF, [pâte de cacao](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8399626/pate-de-cacao) | Preferred fr-CA terms include pâte de cacao, cacao en pâte, masse de cacao, and cacao en masse; English terms include cocoa mass, cacao mass, and U.S.-marked chocolate liquor/chocolate. Supports the French display/alias boundary, not generic `chocolate`. |
| WP02-D-CHOC-20261009-S05 | FAO/WHO Codex, [CXS 86-1981: Standard for Cocoa Butter](https://www.fao.org/input/download/standards/66/CXS_086e.pdf) | Defines cocoa butter as fat obtained from cocoa beans and gives its standard scope. Supports a separate identity from whole cocoa mass; quality limits are not kitchen measurements. |
| WP02-D-CHOC-20261009-S06 | OQLF, [beurre de cacao](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26505321/beurre-de-cacao) | Preferred Québec French display and English terms cocoa butter/cacao butter. OQLF describes theobroma oil as scientific-context usage. |
| WP02-D-CHOC-20261009-S07 | OQLF, [chocolat de couverture](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8420752/chocolat-de-couverture) | Preferred fr-CA term chocolat de couverture; English equivalent couverture chocolate; definition describes a confectionery/baking product and its cocoa-butter/high-fluidity boundary. |
| WP02-D-CHOC-20261009-S08 | FAO/WHO Codex, [CXS 87-1981: Standard for Chocolate and Chocolate Products](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/pl/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+87-1981%2FCXS_087e.pdf) and EUR-Lex, [Directive 2000/36/EC](https://eur-lex.europa.eu/legal-content/EN/ALL/?uri=CELEX%3A32000L0036) | Codex and EU standards set couverture composition thresholds (including 31% cocoa butter and 2.5% dry non-fat cocoa solids for the specified product); the standard also defines milk chocolate couverture separately. They support a defined product class but do not make every couverture the same dark/milk/white subtype. |
| WP02-D-CHOC-20261009-S09 | CFIA, [Labelling requirements for confectionery, chocolate and snack food products](https://inspection.canada.ca/en/food-labels/labelling/industry/confectionery-chocolate-and-snacks) and [French version](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/confiseries-chocolat-grignotines) | Canada distinguishes chocolate from compound coatings as products of different composition; an unqualified chocolate coating is expected to meet the chocolate standard, and compound coatings should not be indicated as “chocolate.” This supports separate identities and the fr-CA term `enrobage composé`. |
| WP02-D-CHOC-20261009-S10 | Codex GSFA, [food category 05.1.5, imitation chocolate/chocolate substitutes](https://www.fao.org/gsfaonline/foods/details.html?d-3586470-o=2&d-3586470-s=2&d-49489-o=1&d-49489-s=2&id=92&lang=) | The Codex food-additive category gives compound chocolate and compound coatings as imitation/substitute examples. This is category context, not a standalone composition standard or Canadian common-name permission. The official result text was accessible in search; the direct page request returned 403 in this review tool. |
| WP02-D-CHOC-20261009-S11 | Callebaut, [milk chocolate couverture product](https://www.callebaut.com/en/products/chocovic/milk-chocolate-tokelat/CHM-O49TOKE-D38) | Manufacturer labels a milk product as couverture, describes high fluidity, and states the product uses pure cocoa butter. Product-specific evidence shows couverture can qualify a milk-chocolate type; it does not establish all couverture formulas. |
| WP02-D-CHOC-20261009-S12 | Callebaut, [milk compound coating product](https://www.callebaut.com/en/products/callebaut/compound-milk/ISM-Q8013-552) | Producer places a milk coating in its compound line and says it can be melted/applied/cooled without tempering. This is one product’s handling evidence, not universal composition or an equivalence ratio. |
| WP02-D-CHOC-20261009-S13 | Puratos Canada, [Chocolat vs. enrobage composé](https://www.puratos.ca/fr/blog/chocolate-vs-compound-coating) | Major supplier’s French Canadian page uses `enrobage composé`, describes vegetable-fat/cocoa/sugar formulation and no-tempering handling. Treat the formulation as a product-family example, not a universal recipe. |
| WP02-D-CHOC-20261009-S14 | Callebaut, [cocoa butter product and use guidance](https://www.callebaut.com/en-US/products/callebaut/cocoa-butter/CB-E0-655) | Identifies its butter as pressed cocoa butter and gives a product-specific 1–8% fluidity adjustment. This is not a density, generic recipe formula, or substitution rule. |
| WP02-D-CHOC-20261009-S15 | King Arthur Baking, [Ingredient Weight Chart](https://www.kingarthurbaking.com/learn/ingredient-weight-chart) | Publishes general chopped-chocolate, chips, and unsweetened cocoa weights cited above. It does not qualify the entries as the scoped products or state enough method detail for candidate mappings. |

No listed source is used to infer a density, unit mapping, universal formula, or active substitution rule.

## Coordinator integration result

Added separate cocoa butter, couverture chocolate, and compound coating references. Updated the
existing unsweetened-chocolate row with only supported cocoa/cacao mass, liquor, and paste terms.
No density, unit mapping, form, or runtime substitution rule was added. The wider Section D
confectionery checklist remains open.

Canonical post-merge snapshot: 446 ingredient references, 16 forms, and 612 research-ledger records.
