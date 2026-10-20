# WP02 B2 — sprouted black-bean flour form boundary

- **Reviewed:** 2026-10-12.
- **Status:** Integrated on 2026-10-12. Added one sprouted form and its ledger record; no new ingredient reference or base-reference alias was added.
- **Checklist:** The broader WP02 Section B2 alternative-flour review remains open. This packet resolves the deferred sprouted-product process/form question.
- **Scope:** Determine whether Canadian product wording `sprouted black bean flour` is a distinct flour identity or a sprouted form of the existing `ingredient-ref-black-bean-flour`, and whether its exact Canadian French ingredient wording is supportable.
- **Proposal-local source IDs:** `WP02-B2-SPROUTED-BLACK-BEAN-FLOUR-20261012-S01` through `S06`. This prefix was absent from the live research ledger and prior proposal/batch archive before drafting.

## Integration outcome

The catalog now contains `ingredient-form-black-bean-flour-sprouted` with the source-attested labels `sprouted black bean flour / farine de haricots noirs germés`, `formCode: sprouted`, and `prepState: sprouted`. Match terms are empty; the base flour keeps its existing aliases, null density, and empty unit mappings. The 114-recipe / 1,123-row corpus has no matching phrase or linked row. The final catalog contains 1,288 references, 98 forms, and 1,596 ledger records.

## Decision

**The catalog now has one `sprouted` form under the existing `ingredient-ref-black-bean-flour`; it does not create a second ingredient identity or add sprouted wording as an alias on the base reference.** A Canadian flour manufacturer currently lists its own product as `Organic Sprouted Black Bean Flour`, and a Canadian French grocery listing gives `farine de haricots noirs germés` as an ingredient in a finished cereal. This supports a source-named process form and a Canadian French label, while the product pages do not establish one universal sprouting, drying, dehulling, or milling specification. A primary study of *Phaseolus vulgaris* flour samples confirms that germination and dehulling are consequential processing distinctions, not synonyms for ordinary raw flour. [S01–S04]

The French compound is directly attested in a Canadian French ingredient declaration. OQLF supports the base term `haricot noir` for *Phaseolus vulgaris*, but has no flour-term ruling for this sprouted product; its separate `germe de haricot` entry refers to mung-bean sprouts (*Vigna radiata*). Do not shorten the form label to `haricot germé` or `farine de haricots germés`, and do not present the wording as an OQLF-approved compound. [S03–S05]

This accepted form is not evidence that every supplier's sprouted flour shares the same species lot or processing protocol. Keep the current active reference's ordinary `black bean flour / farine de haricots noirs` identity, aliases, null density, and empty unit mappings unchanged. Do not infer an organic, dehulled, roasted, precooked, or extruded state from the word `sprouted`. No bundled recipe requires the form. [S01–S04, S06]

## Prior-work reconciliation

- The [integrated black-bean-flour identity review](wp02-section-b-black-bean-flour-identity-review-20261012.md) added only `ingredient-ref-black-bean-flour` and explicitly left the sprouted SKU as a future process/form question. It did not define or activate a form.
- The [black-bean-flour integration record](../batches/wp02-section-b-black-bean-flour-identity-integration-20261012/README.md) preserves the source-specific density observation and the current no-substitution finding. This packet keeps those boundaries intact.
- This review does not revisit black-bean flour's base identity or the separate whole-bean, black-bean-sauce, urad/black-gram, or roasted-urid identities.

## Pre-integration ownership and picker behavior

Read-only audit of the live shared worktree before integration on 2026-10-12. Exact-name checks use the app's lowercase, Unicode NFKD/accent-folded, punctuation-to-space, whitespace-collapsed search key across active reference names/aliases, attached form labels/match terms, and legacy names/aliases.

| Phrase or surface | Current owner/state | Proposed boundary |
|---|---|---|
| `black bean flour` | Exact active owner: `ingredient-ref-black-bean-flour`, `FLOUR_AND_STARCH`. | Keep as the plain base flour display. |
| `farine de haricots noirs` | Exact active owner: `ingredient-ref-black-bean-flour`, canonical French display. | Keep as the plain base flour display. |
| `sprouted black bean flour`; `Organic Sprouted Black Bean Flour` | No exact active-reference, form, or legacy owner. The ledger's existing black-bean-flour record cites the Everspring product as evidence, but it contains no form decision. | Attach only `sprouted black bean flour` as the English form label; omit `Organic` because that is a product certification/attribute, not the flour state. |
| `farine de haricots noirs germés` | No exact active-reference, form, or legacy owner. | Use as the French form label because it is printed in a Canadian French ingredient declaration; do not add it to `aliasesFr` on the base row. |
| Forms on `ingredient-ref-black-bean-flour` | None. The only black-bean-related active form is `canned black beans, drained / haricots noirs en conserve, égouttés`, attached to the whole-pulse row `ingredient-ref-black-beans`. | Add one flour form only; leave the canned/drained pulse form unchanged. |
| Legacy imports | The live legacy file has 64 candidates; none owns the reviewed sprouted-flour terms or this proposed form ID. | No legacy promotion. |
| Research ledger | `ingredient-ref-black-bean-flour` is identity-verified. Its measurement state is `researched_supported` because it holds a study-specific unsprouted black-bean-flour bulk-density observation; substitution state is `researched_no_supported_substitute`. Existing sources mention the sprouted product, but no sprouted-form record or accepted form decision exists. | Record the proposed form decision on the existing identity record if accepted; do not transfer its existing observation to sprouted flour or change its active conversion behavior. |

The picker in `RecipeEditorScreen.kt` builds an `IngredientReferenceSearchIndex` over active references and forms. `IngredientSearch.kt` searches exact attached-form keys, then complete normalized word phrases, then substring matches; after selecting a reference, the screen resolves a form hint only when the query exactly matches one attached form term. Current code-backed static replay results:

| Query | Current picker result |
|---|---|
| `black bean flour` | `ingredient-ref-black-bean-flour` |
| `farine de haricots noirs` | `ingredient-ref-black-bean-flour` |
| `sprouted black bean flour` | No result |
| `farine de haricots noirs germés` | No result |
| `black beans` | `ingredient-ref-black-beans` |
| `haricots noirs` | `ingredient-ref-black-beans` and `ingredient-ref-black-bean-flour` |
| `black bean` | `ingredient-ref-black-bean-sauce` and `ingredient-ref-black-bean-flour` |

After integration, the two exact sprouted-flour queries return the existing black-bean-flour reference with the corresponding form hint. No second picker result is created. The existing plural French overlap and broad English `black bean` result remain unchanged.

## Full bundled-recipe demand

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned. The full serialized recipe JSON and each ingredient row were checked for normalized matches for:

`black bean flour`, `sprouted black bean flour`, `Organic Sprouted Black Bean Flour`, `farine de haricots noirs germés`, `farine de haricots noirs`, `germinated black bean flour`, `germinated black beans`, `black turtle bean flour`, and `farine de haricot noir germé`.

The scan found **zero candidate phrase hits** in full recipe text, **zero matching ingredient rows**, **zero ingredient rows linked to `ingredient-ref-black-bean-flour`**, and no ordinary black-bean ingredient rows. The recipe package supplies no form link, measure, or substitution use case.

## Quantitative and substitution limits

- Keep `defaultDensity: null` and `unitMappings: []` on `ingredient-ref-black-bean-flour`; the integrated form also has no density. The existing ledger's `0.515 g/mL` result belongs to one selected dry, unsprouted black-bean sample and is not a sprouted-flour measure. [S06]
- Everspring lists 50 lb and 20 kg bulk bags with a 250 lb minimum order. These are wholesale package sizes, not a cup or spoon weight, density, or yield. The Nature's Path cereal listing reports 284 g for the whole cereal package; it gives no flour fraction. [S01, S03]
- The primary study compares raw, germinated, and dehulled *P. vulgaris* flours and reports changes in flour properties. Its lab results are specific to its samples and processing; they do not establish a kitchen measure or an active unit conversion for the Canadian commercial product. [S04]
- Everspring's general product-use statement names soups, sauces, baked goods, snacks, and tortillas but gives no recipe ratio. The cereal label describes a multi-ingredient finished food, not a replacement instruction. No reviewed source establishes a tested, source-neutral substitution from sprouted flour to plain black-bean flour, wheat flour, another pulse flour, or starch. Preserve the existing no-supported-substitute finding; add no contextual or global rule. [S01, S03]

## Integrated form and ledger change

One form was added under `ingredient-ref-black-bean-flour`:

| Field | Integrated value | Limit |
|---|---|---|
| ID | `ingredient-form-black-bean-flour-sprouted` | Canonical form ID. |
| `ingredientRefId` | `ingredient-ref-black-bean-flour` | Not a new reference. |
| `formCode` / `prepState` | `sprouted` / `sprouted` | Does not assert a universal germination time, drying protocol, dehulling, or heat treatment. |
| `labelEn` / `labelFr` | `sprouted black bean flour` / `farine de haricots noirs germés` | Both phrases are source-attested; French is Canadian retail ingredient wording, not an OQLF compound entry. |
| Match terms | `matchTermsEn` and `matchTermsFr` are empty; the form labels remain searchable. | Do not add `organic`, `sprouted beans`, `bean sprouts`, `germinated bean flour`, or generic `sprouted flour`. |
| Numeric and recipe fields | No density, mapping, measure, yield, recipe link, conversion, or substitution | No transferable value is supported. |

Updated the existing black-bean-flour ledger record with six current source entries and the accepted form decision, retaining its identity and research states. Added a separate ingredient-form ledger record with no supported measurement or substitute. The base reference aliases, recipes, legacy candidates, and generated catalog index remain unchanged. See the [integration record](../batches/wp02-b2-sprouted-black-bean-flour-form-integration-20261012/README.md).

## Exact pre-integration snapshot

Pre-integration snapshot refreshed from the shared worktree on **2026-10-12 after the WP04 freshwater-drum integration** and before adding this form. The exact snapshot was 1,288 references and 1,595 ledger records. File hashes are SHA-256 of exact bytes. The recipe fingerprint hashes manifest-ordered relative paths, a NUL byte, exact recipe-file bytes, and a trailing NUL byte per file.

| Surface | Count or scope | SHA-256 / fingerprint |
|---|---:|---|
| `ingredient-references.v1.json` | 1,288 references | `d20bc95f97b8d78ee6709655f3321ff000925c135862fd15cbc52e7d85e473ad` |
| `ingredient-forms.v1.json` | 97 forms | `d851af8fdfc42f7aa3b19b1cefb3afb5be237ebf9412035f5b991995b45023bd` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `research-ledger.v1.json` | 1,595 records; 5,706 source entries / 4,737 distinct source IDs | `7d0f8e6e322c07556841bba258220a467b58daf29934e25f554738db735c019b` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| `IngredientSearch.kt` | Search normalization/index/filter | `ca41ac04d18fc354c46c9a67798209255e8bc40cb70ca0ee7350a4121ea6b50e` |
| `RecipeEditorScreen.kt` | Picker wiring and form-hint resolution | `91aa383d7e418ef4150e86f2b3c75903ee51782b35803f33eabb2d2ef1784b98` |
| `RecipeBook-global-ingredient-catalog-plan.txt` | Active plan/checklist | `a9366c5e5d01820909ae10d13e7a22c632c40744731283907d4263314f5d0632` |

## Source register

All web pages were accessed on **2026-10-12**. These source IDs were added to the canonical research ledger during integration.

| ID | Source and direct URL | Supported evidence and limits |
|---|---|---|
| **S01 — `WP02-B2-SPROUTED-BLACK-BEAN-FLOUR-20261012-S01`** | Everspring Farms, [Sprouted Black Bean Flour](https://www.everspringfarms.ca/product/sprouted-black-bean-flour/). | Current Canadian manufacturer product page names `Sprouted Black Bean Flour`; product code `BNBLK-O1-SM` is `Organic Sprouted Black Bean Flour`, origin Canada. It lists 50 lb/20 kg packages and 250 lb minimum order. It does not give botanical species, ingredients, sprouting/drying steps, milling specification, household measures, or recipe ratios. |
| **S02 — `WP02-B2-SPROUTED-BLACK-BEAN-FLOUR-20261012-S02`** | Everspring Farms, [Beans & Lentils product category](https://www.everspringfarms.ca/product-category/beans/). | Current manufacturer catalog separately lists `Black Bean Flour`, `Black Beans`, and `Sprouted Black Bean Flour`; describes milling and sprouting as on-site capabilities. It does not publish this SKU's process specification or species. |
| **S03 — `WP02-B2-SPROUTED-BLACK-BEAN-FLOUR-20261012-S03`** | Walmart Canada, [Nature's Path Qi'a Céréales cacao noix de coco Superflakes](https://www.walmart.ca/fr/ip/Nature-s-Path-Qi-a-C-r-ales-cacao-noix-de-coco-Superflakes/6000197607311). | French ingredient declaration lists `farine de haricots noirs germés` inside `grains germés` with sprouted brown-rice flour; the 284 g weight is for the finished cereal. Page was out of stock at access and says online product information may not be independently verified. This supports Canadian French ingredient-list wording, not a Québec standalone flour package or flour-only formula. |
| **S04 — `WP02-B2-SPROUTED-BLACK-BEAN-FLOUR-20261012-S04`** | Guajardo-Flores et al., [“Effect of Dehulling and Germination on Physicochemical and Pasting Properties of Black Beans (*Phaseolus vulgaris* L.)”](https://doi.org/10.1094/CCHEM-02-16-0017-FI), *Cereal Chemistry* 94 (2017), 98–103. | Primary study compares raw, germinated, and dehulled black-bean flours and reports changed composition and pasting properties. It supports treating germination as a consequential process form; its experimental samples and values are not a commercial specification or home conversion. |
| **S05 — `WP02-B2-SPROUTED-BLACK-BEAN-FLOUR-20261012-S05`** | Office québécois de la langue française, [haricot noir (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8350002/haricot-noir). | Gives preferred `haricot noir`, English `black bean`, and *Phaseolus vulgaris*. It supports the base noun, not a full flour or sprouted-flour compound, nor the species of the commercial sprouted SKU. |
| **S06 — `WP02-B2-SPROUTED-BLACK-BEAN-FLOUR-20261012-S06`** | Office québécois de la langue française, [germe de haricot (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8403750/germe-de-haricot). | Defines the sprout food as from *Vigna radiata* / haricot mungo and lists `germe de haricot` and `haricot germé`. This is not the right complete product term for *P. vulgaris* black-bean flour; retain the source-attested full compound `farine de haricots noirs germés`. |

## Integration result

Recorded as a completed, bounded B2 form review. The evidence supports a sprouted state under the existing black-bean-flour identity, but not a separate identity, species certification, standardized process, culinary measure, or substitution. Static package, reference, generated-index, ledger, form-ownership, recipe-corpus, encoding, and whitespace checks passed. No app tests or emulator checks were run because the change only adds database JSON data under the updated `AGENTS.md` rule.
