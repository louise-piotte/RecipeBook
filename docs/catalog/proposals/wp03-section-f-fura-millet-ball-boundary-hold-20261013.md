# WP03 Section F: Fura millet-ball product boundary hold — 2026-10-13

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Source-grounded candidate; keep unallocated pending a clear Canadian product boundary and Québec-facing French display.
- **Open checklist:** The live Section F item for regionally significant cereal mixes and preprocessed grains remains open at [plan line 2389](../../RecipeBook-global-ingredient-catalog-plan.txt#L2482).
- **Scope:** Fura as the cooked, shaped millet-dough balls described in food-science sources, and its boundary from the ready-to-eat milk-and-cereal drink commonly named *fura da nono* / *fura da nunu*.
- **Decision:** Do not allocate an active reference, alias, form, legacy candidate, recipe link, ledger candidate, measure, density, conversion, yield, or substitution. The literature establishes fura as a distinct regional cereal preparation, but the Canadian listing reviewed uses “Fura” for a packaged milk-and-millet beverage and the other Canadian-market listing is the composite fura-and-yogurt meal. Neither supplies a Québec-facing product label for standalone fura balls. No matching bundled recipe demand was found.
- **Proposed ID:** `ingredient-ref-fura-millet-balls` (not allocated; absent from the live package and catalog archive at review time).
- **Source-ID prefix:** `WP03-FURA-PRODUCT-BOUNDARY-20261013-`. No occurrence was found in the current research ledger or proposal/batch archive. These proposal-local IDs are not ledger additions.

## Boundary and prior work

Research sources distinguish the cooked fura balls from the drink made by crumbling or mashing them into fermented milk. Fura itself is not one fully standardized process: sources discuss both unfermented and germinated or fermented millet preparations, and laboratory work has also made extruded millet-and-soy formulations. Those specific processes and formulations do not define one universal packaged ingredient.

The recent [Tom Brown review](wp03-section-f-tom-brown-cereal-mix-boundary-hold-20261013.md) concerns variable dry cereal-legume blends and prepared porridges. The [Hausa Koko flour review](wp03-section-f-hausa-koko-flour-identity-review-20261013.md) concerns a dry grain-and-spice mix for porridge; it mentions wet fermented millet dough only as out-of-scope context and does not review fura balls as a product. The [Ogi Baba review](wp03-section-f-ogi-baba-powder-boundary-review-20261013.md) concerns a sorghum product and its powder/slurry state. This review is limited to the distinct cooked millet-ball product and does not reopen those decisions.

It also does not revisit the separate farro, generic sushi-rice, pearled-hominy, pozole-corn, generic grits/polenta, dried-sweet-corn, or puffed-grain holds.

Do not merge or add as aliases the composite names *fura da nono*, *fura da nunu*, or *fura-de-nunu*, or the Canadian retailer's *Brukina* wording. The first group names prepared milk-cereal foods; one retailer applies *Fura* to a product it describes as a milk drink. A review pairs *Tchobal* with *Fura* in one regional processing account, but that is not enough to establish a global alias. These names are not interchangeable catalog terms for standalone Fura balls.

## Exact ownership and live baseline

Normalized exact-name, alias, and form-term checks covered `fura`, `furah`, `fura da nono`, `fura de nono`, `fura-de-nunu`, `fura da nunu`, `fura de nunu`, `fura balls`, `millet balls`, `millet dough balls`, `cooked millet dough`, `boules de mil`, `boulettes de mil`, `instant fura`, `fura flour`, and `tchobal`. There is no exact owner in active ingredient references, attached form labels or match terms, or the 64 legacy-import candidates. The research ledger has no Fura record or mention. No form is attached to a Fura identity because none exists.

The adjacent active owners remain distinct: `ingredient-ref-millet` (`millet / millet`), `ingredient-ref-pearl-millet` (`pearl millet / millet perlé`), `ingredient-ref-millet-flour` (`millet flour / farine de millet`), and `ingredient-ref-pearl-millet-flour` (`pearl millet flour / farine de mil chandelle`). The catalog also has separate processed identities including arraw, Sankhal, thiakry, millet couscous, millet flakes, and puffed millet. None names cooked fura balls. The four adjacent raw grain/flour references have no attached forms; their `defaultDensity` values are null and `unitMappings` are empty. Do not treat any of their measurements or names as Fura data.

| Artifact | Live snapshot |
| --- | --- |
| `ingredient-references.v1.json` | 1,364 references; SHA-256 `80ecf866eb614caa604338c909687c3c4f0ffc228cff2fa6c56d8ab9e6ea3b0d` |
| `ingredient-forms.v1.json` | 100 forms; SHA-256 `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63`; no Fura form terms |
| `legacy-import-identities.v1.json` | 64 candidates; SHA-256 `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,691 records, 6,598 source-entry occurrences, 5,529 distinct source IDs; SHA-256 `1927a4922e2b0726c1bf8f64ff90a03ea9c09c87823c97755ea3b8771c4b8363`; no Fura record or source mention |
| `manifest.v1.json` | 114 recipe paths; SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The focused archive search found no earlier Fura product decision or accepted identity. A broader Section F checklist and its completed subreviews remain open to additional distinct product research; this proposal does not alter them.

## Picker and recipe-demand effects

[`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents, punctuation, and case, returns complete word-phrase matches first, and falls back to substring matching. The following static projection was calculated from the live references and forms; it is not live picker QA.

| Query | Current result | Illustrative result if a future bilingual `fura / fura millet balls — boulettes de mil (fura)` row were activated |
| --- | --- | --- |
| `fura` | No result | One Fura result; this would also capture users searching the Canadian seller's milk-drink product under that name. |
| `fura da nono` | No result | No result if kept outside the Fura row; the composite prepared food should remain separate. |
| `millet balls` | No result | One Fura result. |
| `boulettes de mil` | No result | One Fura result. |
| `mil` | Five results across existing millet-product identities | Six results; the Fura term adds a processed form to this already broad query. |
| `millet` | 18 results across millet grains and products | 19 results; the Fura name adds one cooked preparation to a broad grain query. |

The exact `fura` query would be useful for the cooked balls but is not sufficient to resolve the Canadian listing's different ready-to-drink use. The French phrase above is only a projection example, not an approved Québec label. No active English or French name is recommended until a source identifies the intended Canadian ingredient state and a Québec-facing display term is supported.

The bundled package was scanned through all 114 manifest-listed recipe files, all 1,123 ingredient rows, and their serialized string fields. Candidate terms included the Fura spellings above, the composite names, millet dough/ball wording, and millet grain/flour names. The scan found zero phrase-hit files, zero matching ingredient rows, and zero links to any millet reference. The manifest-order corpus fingerprint is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` (753,792 recipe-file bytes). No recipe link is proposed.

## Measurement and substitution limits

- **Forms and product state:** Add no dry, instant, fermented, cooked, or ready-to-eat form. The sources describe different preparation paths and no Canadian product label resolves which standalone product, if any, should be represented.
- **Measures and density:** Add no household measure, density, unit mapping, or conversion. The Canadian listing's 1 kg is package mass for a drink sold out of stock on the review date. Study-process quantities, extrudate bulk-density outcomes, and analytical sample weights are not a reusable kitchen volume-to-mass conversion for fura balls.
- **Yield:** Add no cooking or preparation yield. The published recipes and lab processes are source-specific and do not establish a general raw-millet-to-fura yield.
- **Substitution:** Add no global or contextual rule. Shared millet content or a similar porridge/drink use does not establish an interchangeable amount, role, dish, or method for fura, millet flour, Hausa Koko flour, Ogi Baba, or Tom Brown.
- **Recipe links:** Add none. The bundled corpus contains no matching recipe demand.

## Source register

Sources were checked online on 2026-10-13. The source IDs below are unique proposal-local identifiers; none is being added to the shared ledger.

| Source ID | Source and locator | Evidence and limits |
| --- | --- | --- |
| `WP03-FURA-PRODUCT-BOUNDARY-20261013-S01` | Padonou et al., [“B-vitamins and heat processed fermented starchy and vegetable foods in sub-Saharan Africa: A review”](https://doi.org/10.1111/1750-3841.16697), *Journal of Food Science* (2023), section 3.1. | Describes Tchobal/fura as firm cooked millet dough shaped into balls and outlines a fermented processing route. A review of regional literature; it does not establish a single process, composition, or consumer measurement for all Fura products. |
| `WP03-FURA-PRODUCT-BOUNDARY-20261013-S02` | Ezeonu, Ononugbo, and Ike, [“Molecular characterization of *Listeria monocytogenes* isolated from a ready-to-eat fermented milk and cereal product, Fura-de-Nunu”](https://academicjournals.org/journal/AJMR/article-full-text/27AD2F357235), *African Journal of Microbiology Research* 12(19), 448–455 (2018), introduction and sample-collection methods. | Distinguishes the millet-based Fura balls from the fermented milk Nunu and describes the combined ready-to-eat food. This microbiological study is identity/boundary evidence, not a Québec name, standardized recipe, or retail specification. |
| `WP03-FURA-PRODUCT-BOUNDARY-20261013-S03` | Inyang and Zakari, [“Effect of Germination and Fermentation of Pearl Millet on Proximate, Chemical and Sensory Properties of Instant ‘Fura’”](https://pjnonline.org/pjn/article/view/575), *Pakistan Journal of Nutrition* 7(1), 9–12 (2008). | Separately studies traditional, fermented, germinated, and germinated-fermented Fura processes. The experimental treatments show that process qualifiers matter; they do not create a universal ingredient formulation or a household conversion. |
| `WP03-FURA-PRODUCT-BOUNDARY-20261013-S04` | Filli et al., [“System Parameters and Product Properties Responses During Extrusion of Fura from Millet-Soybean Mixtures”](https://www.ajol.info/index.php/nifoj/article/view/83144), *Nigerian Food Journal* 30(1) (2012), abstract. | Reports experimental extruded products made from pearl-millet and soybean flour mixtures. This supports keeping one research formulation separate from an unqualified Fura identity; its settings and ratios are not general product or substitution data. |
| `WP03-FURA-PRODUCT-BOUNDARY-20261013-S05` | Balogun African Caribbean Market, Concord, Ontario, [“Burkina Special Drink (Fura)”](https://balogunfoods.com/product/burkina-special-drink-fura/), product title, description, stock status, and package weight. | The Canadian retailer calls its milk-and-millet beverage “Burkina,” “Brukina,” or “Fura,” lists 1 kg, and showed it out of stock. This is a retailer's use of the name for a composite drink, not evidence for standalone balls, current availability, product ingredients, or a recipe measure. |
| `WP03-FURA-PRODUCT-BOUNDARY-20261013-S06` | Etsy Canada, [“Fura da Nunu (purée de boules de millet dans un yogourt crémeux sucré)”](https://www.etsy.com/ca-fr/listing/4306464515/fura-da-nunu-puree-de-boules-de-millet?lang_mismatch=1), marketplace listing dated 2026-06-11; French rendering attributed to Google; seller location shown as the United States. | Describes the prepared Fura/Nunu composite, not an ingredient listing for standalone Fura balls. The translated marketplace copy is not Québec French terminology or an ingredient declaration. |

Searches of OQLF and Québec/Canadian government domains for a Fura-specific French product name did not identify an authoritative Québec display term. This records a search limit, not proof that no local term exists.

## Next action

Reopen only when a current Canadian source documents a discrete Fura-ball product and its product state (for example, fresh cooked balls versus a dried or instant product), and a Québec-facing French display is verified. Then repeat exact ownership, `fura`/`mil`/`millet` picker projections, recipe demand, and any exact-form measurement review. Until then, keep the candidate and all numeric or substitution behavior inactive and leave the broader Section F checklist open.
