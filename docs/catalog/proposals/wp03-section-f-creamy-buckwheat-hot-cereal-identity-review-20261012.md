# WP03 Section F: creamy buckwheat hot cereal identity review (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12 as an identity-only ingredient reference; see the [integration record](../batches/wp03-section-f-creamy-buckwheat-hot-cereal-integration-20261012/README.md).
- **Scope:** One remaining Section F preprocessed-grain candidate: plain, dry, single-grain creamy buckwheat hot cereal and its Québec French product wording.
- **Plan location:** Section F still leaves regional cereal mixes and preprocessed grains open at [line 1974](../../RecipeBook-global-ingredient-catalog-plan.txt#L2067). The current cream-of-rice and cream-of-wheat references cover different grains and do not allocate a buckwheat hot-cereal identity.
- **Disposition:** Integrated one identity-only `GRAIN_AND_CEREAL` reference as **`creamy buckwheat hot cereal / céréales chaudes crémeuses au sarrasin`**. Aliases, forms, measures, density, unit mappings, recipe links, yields, conversions, and substitutions remain empty.
- **Workflow:** Research stays separate from integration under the [catalog workflow](../ingredient-catalog-workflow.md).

## Candidate boundary and naming

Bob’s Red Mill identifies a packaged product as **Organic Creamy Buckwheat Hot Cereal**, says it is freshly milled from raw buckwheat groats, and lists whole-grain organic buckwheat as its sole ingredient. Its 2026 Canadian French product list gives the grammatical product wording **Céréales chaudes crémeuses au sarrasin biologique**. A current Québec retailer lists the same product as **Céréales Chaudes Crémeuse Au Sarrasin Bio**, describes it as hot cereal milled from raw groats, and lists whole-grain buckwheat as the ingredient. The catalog display omits the product’s organic qualifier and retains the generic name **céréales chaudes crémeuses au sarrasin**. This is a descriptive Québec-facing display supported by Canadian manufacturer and Québec retail usage, not an OQLF-standardized compound. OQLF supports the base food term *sarrasin* and pairs it with English *buckwheat*.

This scope is the dry grocery product sold as a hot cereal. It does not define every buckwheat meal, flour, grind, or porridge. Keep it separate from:

- active `buckwheat flour / farine de sarrasin`;
- active `buckwheat flakes / flocons de sarrasin` and `puffed buckwheat / sarrasin soufflé`;
- active `buckwheat groats, roasted, dry / grains de sarrasin rôtis et secs`;
- the unresolved ledger candidate `ingredient-ref-kasha`, which retains OQLF’s *kacha / kasha* wording for a cooked gruel made from roasted buckwheat; and
- mixed-grain hot cereals, flavored or sweetened products, and the cooked bowl itself.

The English manufacturer page uses **cream of buckwheat** in descriptive copy, and the Québec retailer uses **crème de sarrasin** as shorthand in its serving description. Neither phrase is the standalone product title in both locales. Keep both out of aliases so the picker name retains the explicit hot-cereal scope. Do not add broad aliases such as `buckwheat cereal`, `céréales au sarrasin`, `gruau de sarrasin`, `kasha`, or `kacha`; they can point to other buckwheat products, a prepared dish, or source-specific terminology. The previous [roasted-groats and kasha boundary review](wp03-section-f-residual-cereal-review-20261010.md) and the current ledger record preserve that distinction.

| Proposed field | Recommendation |
|---|---|
| ID | `ingredient-ref-creamy-buckwheat-hot-cereal` |
| English display | `creamy buckwheat hot cereal` |
| Québec French display | `céréales chaudes crémeuses au sarrasin` |
| Category | `GRAIN_AND_CEREAL` |
| English / French aliases | None |
| Scope | Plain, dry, single-grain buckwheat cereal sold for hot-cereal preparation; no universal grind or cooking process asserted. |
| Recipe links | None; no corpus demand found. |

The nearby [cream-of-rice review](wp03-section-f-cream-of-rice-hot-cereal-identity-review-20261012.md) and [cream-of-wheat review](wp03-section-f-cream-of-wheat-hot-cereal-identity-review-20261012.md) establish separate rice and wheat products. They are useful scope comparisons, not owners or aliases for this buckwheat product.

## Current package snapshot

The live split package was read immediately before drafting. File hashes cover exact bytes. The recipe-corpus digest hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | State at review | SHA-256 or corpus digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,254 references; 116 `GRAIN_AND_CEREAL` | `7a2916bb212ad9cc967ba63520c0ee01115d11d06bd9fce106a53819796904e7` |
| `ingredient-forms.v1.json` | 94 forms | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,736 recipe-file bytes | `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,563 records; 5,467 source entries; 4,505 distinct source IDs; 8 unit conversions | `f2c2040ce7d49b717bcbb051fd904ad1a305ae307c20f07b0c35c3ebb378acc0` |

All 114 manifest paths were read successfully. Counts and hashes reflect the workspace immediately before this integration; the ledger snapshot includes the intervening ketchup and plantain-starch updates.

## Exact ownership and picker-phrase audit

This is the pre-integration audit snapshot. The audit used the repository’s `normalize_search_key` behavior for case, accents, ligatures, and punctuation. It checked every active reference ID, display name, and alias; every form ID, label, and match term; all legacy candidates; ledger record IDs and serialized record text; and the manifest recipes.

| Surface | Exact result before integration |
|---|---|
| Active references | No exact owner for `creamy buckwheat hot cereal`, `cream of buckwheat hot cereal`, `cream of buckwheat`, `buckwheat hot cereal`, `céréales chaudes crémeuses au sarrasin`, `céréales chaudes au sarrasin crémeux`, or `crème de sarrasin`. The proposed ID is unallocated. |
| Nearby active references | `ingredient-ref-buckwheat-flakes` is `buckwheat flakes / flocons de sarrasin`; `ingredient-ref-buckwheat-flour` is `buckwheat flour / farine de sarrasin`; `ingredient-ref-puffed-buckwheat` is `puffed buckwheat / sarrasin soufflé`; `ingredient-ref-roasted-buckwheat-groats-dry` is `buckwheat groats, roasted, dry / grains de sarrasin rôtis et secs`; `ingredient-ref-soba-noodles` is `soba noodles / nouilles de sarrasin`. These rows have no exact candidate display or alias. |
| Forms | No active form is attached to any buckwheat reference, and no form label or match term exactly owns a candidate phrase. |
| Legacy identities | No exact candidate phrase or proposed ID among the 66 legacy candidates. |
| Research ledger | No candidate record or exact proposed phrase exists. Relevant records are the active buckwheat-flakes, buckwheat-flour, puffed-buckwheat, and roasted-dry-groats records, plus unresolved candidate `ingredient-ref-kasha`. The groats and kasha records mention `gruau de sarrasin` and the prepared-gruel distinction; they do not own the proposed hot-cereal phrase. |
| Prior proposals and batches | No focused `cream of buckwheat` / `creamy buckwheat hot cereal` identity review or integration was found. The rice and wheat hot-cereal reviews are different grain identities. |

The candidate phrases `buckwheat cereal`, `céréales au sarrasin`, `gruau de sarrasin`, `kasha`, and `kacha` are intentionally not aliases. Broad `buckwheat` or `sarrasin` searches already intersect multiple distinct active product rows, so this review does not claim a unique result for those broad queries or test live picker ranking.

Proposal source IDs `WP03-CREAM-BUCKWHEAT-20261012-S01` through `S05` were checked absent before drafting/integration and are now registered on the accepted ingredient record. Existing OQLF *kacha / kasha* evidence is reused from ledger source `WP03-S56`; it is not re-registered here.

## Recipe-corpus demand audit

The complete 114-file manifest corpus and all 1,123 ingredient rows were scanned for the proposed names and boundary phrases, including `creamy buckwheat hot cereal`, `cream of buckwheat`, `buckwheat hot cereal`, `céréales chaudes crémeuses au sarrasin`, `céréales chaudes au sarrasin crémeux`, `crème de sarrasin`, `gruau de sarrasin`, `kasha`, `kacha`, and broad `buckwheat` / `sarrasin` mentions.

| Search scope | Hits | Finding |
|---|---:|---|
| Full serialized recipe files | 0 / 114 | No recipe prose or title requests this product or its neighboring buckwheat terms. |
| Ingredient rows | 0 / 1,123 | No matching line, amount, form, or ingredient reference. |

No recipe link or recipe-text change is supported. This is a normalized corpus-content audit, not a live picker-ranking test.

## Forms, measures, conversions, and substitutions

- **Forms:** Add none. The proposed row is the packaged dry hot-cereal product; the sources do not establish a reusable dry/cooked state model, universal particle size, or a measured milling grade.
- **Measures and density:** Keep `defaultDensity` null and unit mappings empty. Bob’s product page gives a product-specific 1/4-cup (44 g) serving; the Canadian list gives a 510 g package. Neither value generalizes to other buckwheat products or to a standard household measure.
- **Cooking and yield:** Add no cooking yield, mass-volume conversion, or dry-to-cooked ratio. The manufacturer gives preparation instructions for its own product only; a water ratio and cooking time are not portable properties of a general buckwheat hot cereal identity.
- **Substitutions:** Add none. Manufacturer descriptions of a breakfast cereal do not establish an amount-qualified substitution for oats, roasted groats, buckwheat flour, flakes, or another cereal.
- **Recipe links:** Add none because no bundled recipe requests the product.

## Proposal-local source register

Sources were reviewed on 2026-10-12. The five source IDs below are registered on the accepted ingredient record.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP03-CREAM-BUCKWHEAT-20261012-S01` | Bob’s Red Mill, [Organic Creamy Buckwheat Hot Cereal](https://www.bobsredmill.com/product/organic-creamy-buckwheat), product name, description, ingredient list, and nutrition panel. | Manufacturer names the plain hot cereal, says it is freshly milled from raw groats, and lists whole-grain organic buckwheat as the only ingredient. The page’s 1/4 cup (44 g) serving is product-specific; it does not define a general density, measure, grind, or cooking yield. This is the manufacturer’s US page, not a Canadian French label. |
| `WP03-CREAM-BUCKWHEAT-20261012-S02` | Bob’s Red Mill, [Canadian Product List 2025](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-Product-List-2025), p. 27, cereal listing. | Lists “Cereal, Creamy Buckwheat Hot, Organic,” French product wording “Crémeuse au sarrasin céréales chaudes biologique,” and organic whole-grain buckwheat as the ingredient. It establishes Canadian product naming and composition for this product; the list’s French word order is not treated as a Québec terminology ruling or a generic product standard. Its 510 g package is not a general measure. |
| `WP03-CREAM-BUCKWHEAT-20261012-S03` | La Moisson, [Céréales Chaudes Crémeuse Au Sarrasin Bio](https://lamoisson.com/collections/cereales-granolas-breakfast-cereal-granola/products/cereales-chaudes-cremeuse-au-sarrasin-bio-creamy-buckwheat-hot-cereal-organic), product title, description, and ingredients. | Current Québec retailer listing for Bob’s Red Mill. It uses the hot-cereal and buckwheat wording, describes the product as milled from raw groats, and lists whole-grain buckwheat. It supports Québec retail context and the proposed descriptive French display, not an OQLF-prescribed compound or the processing limits of all products. The page’s title has nonstandard adjective agreement; the proposed display normalizes the plural. Search-indexed product details were available during this review; direct page retrieval returned a cache miss. |
| `WP03-CREAM-BUCKWHEAT-20261012-S04` | Office québécois de la langue française, [GDT: sarrasin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082623/sarrasin), food domain and preferred terms. | Gives preferred French `sarrasin`, English `buckwheat`, and the Latin taxon *Fagopyrum esculentum*. Supports the base food name; it does not define `céréales chaudes crémeuses au sarrasin` or a specific hot-cereal product. |
| `WP03-CREAM-BUCKWHEAT-20261012-S05` | Bob’s Red Mill, [2026 Canadian French Product List](https://bobs-ebooks.cld.bz/Bob-s-Red-Mill-Canadian-French-Product-List/28-29/), cereal listing, pp. 28–29. | Names the bilingual product “Cereal, Creamy Buckwheat Hot, Organic” / “Céréales chaudes crémeuses au sarrasin biologique” and lists whole-grain buckwheat. Supports Canadian commercial wording and product identity; the organic qualifier and 510 g package are not generalized, and the listing is not an OQLF terminology ruling or conversion source. |

## Integration disposition

**Integrated identity-only `ingredient-ref-creamy-buckwheat-hot-cereal` as `creamy buckwheat hot cereal / céréales chaudes crémeuses au sarrasin`.** The manufacturer, its current Canadian French product list, and a Québec retailer support the single-grain hot-cereal product and descriptive French display. Aliases remain empty to preserve the hot-cereal qualifier and avoid promoting descriptive shorthand or prepared-dish wording to global search terms. The identity remains separate from active buckwheat flour, flakes, puffed buckwheat, roasted dry groats, and the unresolved prepared *kasha* candidate. No forms, numeric behavior, recipe links, yields, conversions, or substitutions were added. Section F remains open.
