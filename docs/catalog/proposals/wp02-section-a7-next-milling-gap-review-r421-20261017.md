# WP02 Section A7 R421: wheat grits identity boundary hold

## Review record

- **Reviewed:** 2026-10-17.
- **Status:** Proposal-only bounded hold. No shared catalog, ledger, plan, roadmap, recipe, README, or generated-index data is changed.
- **Checklist context:** The [active A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2004) continues review of other grain meals and milling boundaries. This review treats `wheat grits` as a distinct question from the already scoped whole-wheat-meal identity and its unresolved generic wheat-meal term.
- **Prior decisions kept:** The wheat-meal reviews reject `wheat grits` and `gruau de blé` as aliases of whole wheat meal, but do not settle whether a separate wheat-grits identity is appropriate. R415 adds buckwheat grits; R412 adds barley grits; R418 holds unqualified oat grits. R421 does not reopen those identities or the generic wheat-meal hold.
- **Scope:** Review only human-food wheat grits and the proposed French picker wording. Do not infer equivalence with cracked wheat, coarse-ground wheat, bulgur, wheat meal, wheat groats, semolina, or prepared hot cereal.

## Recommendation

**Keep `wheat grits` unallocated, with no active reference or new ledger candidate.** Do not alias it to `ingredient-ref-cracked-wheat`, `ingredient-ref-wheat-meal`, `ingredient-ref-bulgur`, a wheat-semolina row, or `ingredient-ref-buckwheat-grits`. Do not assign `gruau de blé`, `blé concassé`, or `semoule de blé` as its French display or alias.

The current Statistics Canada NAPCS examples list wheat grits separately from wheat groats and wheat meal, supporting a distinct named product class [S01]. They do not define its milling state or retail scope. CFIA defines cracked wheat and crushed/coarse-ground wheat as two separate wheat products with different sieve boundaries, but does not define wheat grits [S02]. A current Canadian-market Franck listing calls one 400 g product “instant wheat grits (semolina)” and directs that it be cooked in milk as a breakfast cereal [S03]. This is evidence for that product, not a universal dry milling specification.

The French term is unresolved. The federal TERMIUM record for `gruau de blé` maps it to `cracked wheat` in a historical tariff observation [S04], and OQLF assigns `blé concassé` to the cracked/coarse-ground/crushed-wheat family already owned by `ingredient-ref-cracked-wheat` [S05]. Current French Canadian cereal wording also uses `gruau` for a prepared hot cereal, while the relevant Canadian product page calls the dry cereal `crème de blé` [S06–S07]. The evidence does not justify making `gruau de blé` a stable French display for grits.

| Proposed data field | Disposition |
|---|---|
| New active identity / category | None; retain no `wheat grits` reference |
| New aliases | None; do not add `wheat grits` to cracked wheat or another neighbor |
| French display or alias | None; `gruau de blé`, `blé concassé`, and `semoule de blé` remain unassigned to this candidate |
| New ledger candidate / source entries | None |
| Forms, measures, density, unit mappings, conversions, yields | None |
| Recipe links or substitutions | None |

## Product boundary and existing ownership

| Neighbor | Existing owner and boundary to retain |
|---|---|
| Cracked wheat | `ingredient-ref-cracked-wheat` — `cracked wheat / blé concassé`. The CFIA standard covers wheat cracked or cut into angular fragments; the OQLF French term includes cracked, crushed, and coarse-ground wheat. Neither source calls that identity wheat grits. |
| Crushed or coarse-ground wheat | CFIA standard 12.1.6 defines this separately from cracked wheat in 12.1.7. Do not use either regulatory sieve definition as a wheat-grits specification. |
| Bulgur | `ingredient-ref-bulgur` — `bulgur / boulgour`, a separately processed wheat product. Keep it distinct from raw cracked wheat and the instant semolina cereal sold as grits. |
| Whole wheat meal | `ingredient-ref-wheat-meal` — `whole wheat meal / farine de blé entier brute`; only `farine de blé complet brute` is its French alias. The generic `wheat meal` question stays unresolved. |
| Wheat semolina | `ingredient-ref-spring-wheat-semolina` — `spring wheat semolina / semoule de blé tendre`; `ingredient-ref-durum-semolina` — `durum semolina / semoule de blé dur`. The retail description “grits (semolina)” is specific to its listed instant product and does not establish a general semolina synonym. |
| Wheat kernels and hot cereal | `ingredient-ref-wheat-berries` retains whole kernels. `ingredient-ref-cream-of-wheat-hot-cereal` retains the named hot-cereal product. Neither supplies a general wheat-grits identity. |
| Buckwheat grits | `ingredient-ref-buckwheat-grits` — `buckwheat grits / gruau de sarrasin`. Do not treat the substring match described below as ownership of wheat grits. |

The prior A7 wheat-meal reviews listed wheat grits among terms not to fold into the narrower whole-wheat-meal identity. R421 makes a separate disposition for the potential grits product rather than changing those wheat-meal decisions. The current catalog contains no exact active name or alias `wheat grits` / `wheat grit`, and no active row owns `gruau de blé` or `gruaux de blé`.

## Catalog, legacy, ledger, and picker audit

The read-only snapshot reviewed on 2026-10-17:

| Store | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,721 rows; SHA-256 `aa04da254f21e7dc89e43c002cb31890f59b349adf5c60f4ad9c4eab7aa46452` | No exact wheat-grits owner. Related wheat rows above remain distinct. Relevant milling rows have null default density and empty unit mappings. |
| Ingredient forms | 141 rows; SHA-256 `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` | No form or match term for wheat grits. Bulgur's existing grind forms do not imply wheat-grits forms. |
| Legacy import identities | 56 candidates; SHA-256 `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` | No exact wheat-grits identity or alias. |
| Research ledger | 2,080 records / 9,424 source entries; SHA-256 `2fe0f35d32689f007f800d4ce50f2ee842d3a64adfe9df38e49ef9a73bf1d6a2` | No `candidate-wheat-grits` or exact wheat-grits record. Apparent substring hits for `wheat grits` occur inside the newer `buckwheat grits` records; they are not a separate wheat-grits decision. |
| Recipe manifest | 114 paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` | All manifest paths exist and parse; full-corpus results are below. |

The picker behavior follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases take precedence, then substring matching is used only if no complete phrase is found.

| Query | Current result | Hold effect |
|---|---|---|
| `wheat grits`; `wheat grit` | `ingredient-ref-buckwheat-grits`, by partial substring fallback because `wheat` occurs inside `buckwheat` | This is an accidental current false positive, not valid ownership. Do not add a wheat-grits alias to buckwheat. |
| `gruau de blé`; `gruaux de blé` | None | Keep unallocated until a product-matched French term is established. |
| `cracked wheat`; `blé concassé` | `ingredient-ref-cracked-wheat` | Preserve the narrower existing identity. |
| `wheat meal`; `whole wheat meal` | `ingredient-ref-wheat-meal` | Preserve the scoped whole-wheat-meal result; this does not resolve bare wheat meal or grits. |
| `grits` | Six references: attiéké, barley grits, buckwheat grits, corn grits, hominy grits, and sorghum grits | No identity is added; do not add an unsupported seventh row. |
| `gruau` | Eleven references | No unqualified French term is added. |

If a future review verifies an independent bilingual product, a properly qualified `wheat grits` identity would remove the current false positive for the exact plural query. R421 does not invent a French label to get that picker behavior.

## Complete bundled recipe scan

All **114** files listed by the manifest were read and parsed, covering **1,123 ingredient rows**. Full serialized recipe text and structured ingredient content were normalized for accents, punctuation, and spacing. Searches for `wheat grits`, `wheat grit`, `gruau de blé`, `gruaux de blé`, cracked, crushed, and coarse-ground wheat, `wheat groats`, `wheat meal`, wheat semolina / `semoule de blé`, `bulgur / boulgour`, and the related hot-cereal terms found **0 matching recipe files and 0 matching ingredient rows**. The broad word `gruau` occurs in two recipe files' titles or metadata and in **0 ingredient rows**. No recipe links or edits are proposed.

## Measures and substitutions

- The Canadian marketplace listing's **400 g** package, **67 g** nutrition serving, and directions for four spoons (approximately **65 g**) refer only to that instant Franck product [S03]. The directions do not define a spoon size, and neither serving value supplies a general wheat-grits measure or density. Do not copy package or label amounts into reusable data.
- CFIA's sieve measurements define *cracked wheat* and *crushed/coarse-ground wheat*, not wheat grits [S02]. The current cracked-wheat, bulgur, and whole-wheat-meal rows have null density and empty unit mappings; no wheat-grits form or reusable measure exists.
- The bundled global and contextual substitution-rule files each contain **0** rules. The one package-yield record belongs to canned black beans. No recipe context or paired wheat-grits quantity supports an active or general substitution.

## Source register

Sources were checked on 2026-10-17. Source IDs marked reused are existing ledger IDs; proposal-local IDs are not shared-ledger records.

| Source ID | Source and locator | Supports | Limits |
|---|---|---|---|
| **Reused:** `WP02-A7-BUCKWHEAT-MEAL-20261013-S01` | Statistics Canada, [NAPCS Canada 2022, class 1821294 examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=3&CPV=1821294&CST=17022022&CVD=1386659&Function=getAllExample&MLV=4&TVD=1384502&V=447178&VST=17022022), modified 2026-01-08. | Lists wheat grits separately from wheat groats and wheat meal (except durum semolina) in the human-consumption grain-products class. | Classification examples do not define processing, consumer use, or bilingual display. Reuse the existing ledger source rather than duplicate it. |
| **Reused:** `WP02-S101` | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 12, standards 12.1.6 and 12.1.7. | Defines crushed/coarse-ground wheat and cracked wheat separately, with different sieve limits. | Defines neither wheat grits nor a Québec-facing wheat-grits name. |
| `WP02-A7-WHEAT-GRITS-R421-20261017-S01` | Translation Bureau, TERMIUM Plus, [GRUAU BLE](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+BLE), record dated 1986-04-15. | Lists `gruau de blé`, `blé concassé`, and `blé en petits fragments` for English `cracked wheat`, with a historical tariff note. | It does not translate wheat grits; the dated record warns against adopting `gruau de blé` as a grits alias. |
| **Reused:** `WMA7-20261010-S05` | OQLF, [blé concassé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2494947/ble-concasse). | Supports Québec French `blé concassé` for coarse-ground wheat, cracked wheat, and crushed wheat, matching the active cracked-wheat boundary. | Does not include wheat grits or establish a grits synonym. |
| `WP02-A7-WHEAT-GRITS-R421-20261017-S02` | OQLF, [gruau (GDT), grits entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8430011/gruau), brewing/malt-crushing domain, record dated 1983. | Connects French `gruau` with English `grits` in a specific milling domain and notes coarse-grind usage. | It does not name wheat grits as a Québec food product; it also records a relation to semoule, so it cannot resolve the candidate's product boundary. |
| `WP02-A7-WHEAT-GRITS-R421-20261017-S03` | Instacart Canada, [Franck Grits, Instant, 400 g](https://www.instacart.ca/products/18384027-franck-grits-instant-400-g), current product listing. | Lists wheat grits as the ingredient, parenthetically calls them semolina, and gives milk-cooking directions for one imported instant cereal sold through Canadian stores. | Retailer aggregation for one SKU, not a manufacturer milling specification or bilingual product label. The package and serving amounts are SKU-specific. |
| **Reused:** `WP03-CREAM-WHEAT-HOT-CEREAL-20261012-S04` | Bob's Red Mill Canada, [Céréales chaudes au blé crémeux](https://www.bobsredmill.ca/produit/cereales-chaudes-au-ble-cremeux), French product page. | Uses `gruau` for the prepared hot cereal made from its cream-of-wheat product; the catalog's named product is `crème de blé`. | This is a prepared cereal use, not a name for dry wheat grits. |
| **Reused:** `WP03-CREAM-WHEAT-HOT-CEREAL-20261012-S03` | Metro Québec, [Crème de blé, céréales chaudes](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/cereales-tartinades-et-sirops/flocons-d-avoine-et-cereales-chaudes/cereales-chaudes/p/072400011597). | Current Québec retail wording for the named cream-of-wheat hot cereal. | It does not identify a wheat-grits milling product. |

## Disposition

Keep wheat grits outside the active catalog and ledger. The authoritative Canadian classification recognizes wheat grits as a named class, but the current Canadian retail example describes an instant cereal, the federal French term `gruau de blé` is attached to cracked wheat in its cited record, and the Canadian French retail wording `gruau` also appears in a cooked-cereal context. No supported Québec-facing dry-product display or common milling boundary resolves these uses. Preserve the existing wheat-meal, cracked-wheat, bulgur, semolina, hot-cereal, and buckwheat-grits rows. Add no identity, alias, ledger candidate, form, measure, density, mapping, conversion, yield, recipe link, or substitution. This documentation-only hold required no software tests, build, emulator, or deployment checks.
