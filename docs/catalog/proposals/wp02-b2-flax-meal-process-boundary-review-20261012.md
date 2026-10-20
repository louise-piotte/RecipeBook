# WP02 B2 — flax meal and flour process boundary

- **Reviewed:** 2026-10-12
- **Status:** Reviewed and held by root on 2026-10-12; see [hold integration record](../batches/wp02-b2-flax-meal-process-boundary-hold-integration-20261012/README.md). No catalog, ledger, recipe, generated, test, or application data changed; the plan and roadmap now record the decision.
- **Scope:** Whether seed-derived baking terms such as `flax meal`, `flaxseed meal`, and `flax flour` identify a stable product distinct from the active flax-seed reference, and whether Canadian/Québec product wording supports a safe identity or alias.
- **Disposition:** **Hold the unqualified meal/flour identity and all broad aliases.** Preserve the active flax-seed row unchanged. A later product-specific review can reconsider a narrow defatted product if recipe or package demand establishes the intended scope.
- **Review method:** Re-read `AGENTS.md`, `Requirements.md`, the live WP02 Section B checklist, relevant proposals and batches, active reference/form JSON, legacy candidates, research ledger, picker implementation, manifest-listed recipe files, and current Canadian and Québec sources. No tests or emulator work were needed for this proposal-only research.

## Recommendation

Do not add `flax meal`, `flaxseed meal`, `flax flour`, `flaxseed flour`, `linseed meal`, `linseed flour`, or bare `farine de lin` as a new identity or as aliases on `ingredient-ref-flax-seeds`.

The exact English phrase **flaxseed meal** is used for two materially different products: whole flaxseed ground with its oil retained, and crushed seed left after oil pressing. Québec sources distinguish **graines de lin moulues** from the separate product **farine de lin déshuilée**. The latter is a useful, qualified local label, but it does not establish that the unqualified English and French meal/flour phrases share one product scope or a common degree of oil removal. No manifest-listed recipe requests either product.

The current action is therefore **no integration delta**: no reference, alias, form, ledger candidate, density, unit mapping, recipe link, conversion, yield, or substitution. If an explicit recipe or package later identifies a defatted baking product, the narrow possible identity is `de-fatted flax meal / farine de lin déshuilée`, as a new `FLOUR_AND_STARCH` row with empty aliases and no numeric or substitution behavior. That is a future review path, not a recommendation to add it now.

## Checklist and archive boundary

The live WP02 Section B umbrella item remains open for alternative flours, including almond meal and several seed- and pulse-derived products. Its nearby product reviews are recorded in the plan, including the almond-meal hold, the sesame/sunflower/pumpkin-flour holds, and the recent pulse-flour reviews. This packet addresses a separate, previously unreviewed boundary: flaxseed meal/flour versus whole-ground flaxseed.

The earlier [WP03 flax/hemp/poppy seed review](wp03-flax-hemp-poppy-seed-gap-review-20261010.md) covered the culinary seed identity and explicitly kept flax meal/flour outside that row. It added no forms. This packet does not reopen that accepted seed identity or duplicate a WP02 flax-flour proposal; it evaluates the excluded baking-product boundary with newly checked Québec and Canadian product evidence. No earlier WP02 proposal or batch review specifically adjudicates flax meal/flour.

## Names and product boundary

| Product or term | English/Canadian evidence | Québec French evidence | Decision |
| --- | --- | --- | --- |
| Whole-ground seed | Bob’s Red Mill Canada lists an English retail item as **Whole Ground Flaxseed Meal**; its ingredient is whole brown flaxseed. Bob’s Red Mill Canada’s French product page calls the item **Farine de lin brun**, describes grinding, and lists whole flax seeds as the ingredient. | Patelin and Grains du Québec list **Graines de lin moulues à froid** separately from the defatted flour. | These are ground whole seeds, not evidence that all products called `flax meal` are the same. Do not add a ground form or a `meal` alias to the existing seed row in this review. |
| Pressed or defatted material | Manitoba Flax CA uses `flaxseed meal` for crushed seed remaining after oil pressing. TA Foods, a Canadian processor, separately lists whole flax, milled flax, cold-pressed oil, and **de-fatted flax meal**. Shape Foods’ Canadian specification names **partially defatted flax meal**. | Patelin’s Québec product is explicitly named **Farine de lin déshuilée**; its page says it is made from extruded seeds and is naturally low in fat. Aliments du Québec and Grains du Québec list it separately from ground flax seeds. | The qualified phrase `farine de lin déshuilée` identifies a local defatted product. The reviewed sources do not establish one shared residual-fat threshold or a safe broad alias for `farine de lin` or `flax meal`. Hold a general identity. |
| Unqualified meal/flour | Canadian source usage conflicts: `flaxseed meal` can mean a whole-ground seed product or an oil-pressing byproduct. `Flax flour` and `flaxseed flour` were not established as stable common names in the reviewed source set. | `Farine de lin brun` is source-attested for Bob’s whole-ground product; `farine de lin déshuilée` is source-attested for Patelin’s low-fat product. They are qualified product labels, not proof that bare `farine de lin` is unambiguous. | Keep `flax meal`, `flaxseed meal`, `flax flour`, `flaxseed flour`, `linseed meal`, `linseed flour`, and bare `farine de lin` unassigned. |

The Manitoba Flax article is manufacturer-authored and advocates for that company’s whole-milled product. Its use of `flaxseed meal` for press cake is therefore treated as evidence of real naming variation, not as a universal technical definition. The counterexample is independently visible in Canadian retail naming for Bob’s whole-ground product and the product’s own whole-seed ingredient statement. Patelin’s Québec French label is strong local lexical evidence for that product, not an OQLF ruling or a definition for all flax flours.

Targeted OQLF searches for the reviewed flour phrases did not surface a directly relevant GDT entry. Do not attribute the proposed product wording to OQLF. The Québec manufacturer, Aliments du Québec, and Grains du Québec provide the local naming evidence in this packet.

### Exclusions

- Do not merge whole-ground flaxseed with meal left after oil pressing, whether sold as fully or partially defatted.
- Do not place broad meal/flour terms on the active `flax seeds / graines de lin` identity. Keep flax oil, flax protein, flax fibre/hulls, and oil-press cake outside it as distinct products or materials.
- Do not treat `farine de lin brun` as a general synonym for `farine de lin déshuilée`.
- Do not infer that a product sold as animal feed, an industrial pressing byproduct, or a protein/fibre ingredient is a culinary baking flour.

## Live ownership and picker audit

Pre-integration snapshot checked 2026-10-12. The exact current reference is:

```json
{
  "id": "ingredient-ref-flax-seeds",
  "nameEn": "flax seeds",
  "nameFr": "graines de lin",
  "aliasesEn": ["flaxseed", "flax seed", "linseed", "linseeds"],
  "aliasesFr": ["graine de lin"],
  "category": "NUT_SEED_AND_DRIED_FRUIT",
  "defaultDensity": null,
  "unitMappings": []
}
```

| Surface | Current result |
| --- | --- |
| Active reference | `ingredient-ref-flax-seeds` owns the names and aliases above. No active reference owns an exact reviewed meal/flour phrase. |
| Forms | No form belongs to `ingredient-ref-flax-seeds`; no current form owns `ground flaxseed`, `flaxseed meal`, `flax meal`, or the reviewed French product phrases. |
| Legacy candidates | No flax/linseed meal or flour candidate is present in `legacy-import-identities.v1.json`. |
| Research ledger | The dedicated record is `ingredient-ref-flax-seeds` (`identityState: verified`; measurement and substitution states `not_yet_researched`). It cites WP03-FHP-SEED-GAP-20261010-S01 (Health Canada CNF) and S02 (AAFC) and records the decision not to add meal/flour aliases or forms. There is no dedicated meal/flour record or candidate. Other records mentioning flax do so as a component of a different product, such as Red River cereal. |

The picker in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt` indexes each reference’s bilingual display and aliases together with attached form labels and match terms. It normalizes case, accents, ligatures, punctuation, and whitespace; it returns complete word-phrase matches first and falls back to substring matching. For this live snapshot, its query behavior is:

| Query | Current result |
| --- | --- |
| `flax`, `flax seed`, `flaxseed`, `flax seeds`, `linseed`, `graines de lin` | `ingredient-ref-flax-seeds` |
| `flaxseed meal`, `whole ground flaxseed meal`, `ground flaxseed`, `flax meal`, `flax flour`, `flaxseed flour`, `linseed meal`, `linseed flour`, `farine de lin`, `farine de lin brun`, `farine de lin déshuilée`, `graines de lin moulues`, `graines de lin moulues à froid` | No result |

Adding the broad phrase `flax meal` to one row would create a false choice for users whose product is the other source-defined class. The same issue applies to bare `farine de lin`; its reviewed local product labels use qualifiers that distinguish defatted flour from ground seeds. The hold leaves all current picker outcomes unchanged.

## Full bundled recipe demand

All **114** manifest-listed recipe files were scanned, including all **1,123** ingredient rows. Search covered the recipe JSON text, ingredient names and original text, and linked reference IDs for:

`flax meal`, `flaxseed meal`, `whole ground flaxseed meal`, `ground flaxseed`, `flax flour`, `flaxseed flour`, `linseed meal`, `linseed flour`, `farine de lin`, `farine de lin brun`, `farine de lin déshuilée`, `graines de lin moulues`, and `graines de lin moulues à froid`.

Results: **0** matching recipe files, **0** matching ingredient rows, and **0** recipe ingredient lines linked to `ingredient-ref-flax-seeds`. There is no bundled recipe demand to justify choosing one product meaning for a broad name.

The corpus snapshot is **753,792 bytes**. Its fingerprint is SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`, computed in manifest order over each recipe-relative path, NUL, exact file bytes, NUL.

## Measurements and substitution limits

These values are source-specific observations only; none supports an active density, unit mapping, default recipe conversion, or general substitution:

- Health Canada’s CNF food code 4528 combines **whole and ground flaxseed** under the bilingual name `Seeds, flaxseed (linseed), whole and ground / Graines, lin, entières et moulues`. Its ground entries include 15 mL = 7.1 g, 30 mL = 14.2 g, 60 mL = 28.4 g, 100 mL = 47.3 g, and 125 mL = 59.2 g. These describe the CNF whole/ground item, not partially or fully defatted meal.
- Bob’s Red Mill Canada labels its whole-ground product **2 tbsp (13 g)**. That is a product label serving, not a reusable measure for meal of a different fat-removal scope. Its page also describes milling to preserve flax oils and identifies whole flax seeds as the ingredient.
- Shape Foods’ April 2020 **partially defatted flax meal** specification reports a typical oil content of 16.4% with a 9–25% range. It reports bulk density as 25 lb/ft³ with a 23–28 lb/ft³ range and says particle size is to be agreed between the supplier and customer. This industrial specification does not define a household cup/tablespoon mapping or a common retail `defatted` threshold.
- Patelin says its particular `farine de lin déshuilée` may replace up to one quarter of customary flour and recommends baking up to 375°F/190°C. These are claims for that branded product and its method; do not apply them to whole-ground flaxseed or all defatted meal.
- Manitoba Flax’s whole-milled product article reports a separate claim of replacing up to 50% of flour for its whole-milled flaxseed. This differs from Patelin’s 1/4-flour advice and applies to a different product and source context. Do not average or generalize the ratios.
- King Arthur Baking’s 2015 flax/water egg method uses 1 tablespoon flax meal plus 3 tablespoons cold water per large egg and rests the mixture for about 30 minutes. The article says this does not suit every baked good. It does not establish that its unqualified “flax meal” is defatted or define a universal recipe role, so the method must not be attached to this identity review.

The existing `docs/catalog/batches/baking-substitutions.md` already records flax/chia gel as a source- and role-limited egg-binder observation. This packet does not broaden that entry, create a flax-meal form, or add an ingredient substitution rule.

## Snapshot and precise delta

The current canonical surfaces at review time were:

| Surface | Count | SHA-256 |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,285 references | `632470bdd715bf0ce33156c5a8f50aa07300295f3a2922e220cae711c3b4dbe1` |
| `ingredient-forms.v1.json` | 97 forms | `d851af8fdfc42f7aa3b19b1cefb3afb5be237ebf9412035f5b991995b45023bd` |
| `research-ledger.v1.json` | 1,592 records | `de2b5e50edadd552d53782300fba8c0f464c17f1df4ecb43bd8765ae90ae1073` |
| `legacy-import-identities.v1.json` | 64 candidates | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Picker implementation `IngredientSearch.kt` | 9,050 bytes | `ca41ac04d18fc354c46c9a67798209255e8bc40cb70ca0ee7350a4121ea6b50e` |

**Recommended integration delta:** none. Keep active references, forms, aliases, ledger candidates, recipes, and picker behavior unchanged. Do not add this held candidate to the ledger as though it were an accepted identity; this packet is the research record for the current hold.

**Possible later delta after a specific request and fresh ownership review:** if a source-qualified baking recipe or package specifically requests the defatted product, create only `ingredient-ref-defatted-flax-meal` in `FLOUR_AND_STARCH`, with `nameEn: "de-fatted flax meal"`, `nameFr: "farine de lin déshuilée"`, empty alias arrays, null `defaultDensity`, and empty `unitMappings`; add no form, recipe link, number, or substitution unless separately supported. Keep `flax meal`, `flaxseed meal`, `flax flour`, `linseed meal`, and `farine de lin` off that row until their ambiguity is resolved. Recheck all hashes and owners before any such change.

## Source register

Source IDs are local to this proposal; they have not been inserted into the shared research ledger. All pages were accessed 2026-10-12.

| ID | Source and direct URL | Support and limit |
| --- | --- | --- |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S01 | Patelin, [Farine de lin pour notre santé](https://www.patelin.ca/farine-de-lin-pour-notre-sante--patelin) | Product is titled `Farine de lin déshuilée`; maker says it is made from extruded seeds and naturally low in fat. The page’s 1/4 flour and 375°F/190°C guidance is product-specific. |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S02 | Aliments du Québec, [Les produits Patelin](https://alimentsduquebec.com/entreprises/les-produits-patelin) | Identifies a Saint-Jean-Port-Joli processor and separately lists flax oil, whole seeds, ground seeds, and defatted flour. Local business/product naming; not an English definition. |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S03 | Grains du Québec, [Répertoire des produits certifiés](https://grainsduquebec.ca/repertoire-des-produits-certifies) | Separately lists `Farine de lin déshuilée` and `Graines de lin moulues à froid`. Its certification criteria apply to source/origin and Québec processing/packing, not ingredient equivalence. |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S04 | TA Foods, [Agricultural food ingredient processing and packaging](https://www.tafoods.ca/) | Canadian processor lists whole flax, milled flax, cold-pressed oil, and de-fatted flax meal as distinct products/services. The page does not define a common residual-fat threshold. |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S05 | Manitoba Flax CA, [Whole-milled flaxseed vs. flaxseed meal](https://manitobaflax.ca/ground-flaxseed-vs-flaxseed-meal-difference/) | Manufacturer describes meal as crushed seed left by oil pressing and distinguishes whole-milled seed. Useful evidence that one Canadian supplier uses the terms distinctly; manufacturer-authored and not a universal standard. |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S06 | Well.ca, [Bob’s Red Mill Whole Ground Flaxseed Meal](https://well.ca/products/bobs-red-mill-whole-ground-flaxseed_143212.html) | Canadian retail title uses `Whole Ground Flaxseed Meal`; product listing identifies whole brown flaxseeds. Retail listing is naming evidence, not a general specification. |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S07 | Bob’s Red Mill Canada, [Farine de lin brun](https://www.bobsredmill.ca/produit/flaxseed-meal) | French product page says the seeds are ground and identifies `Graines de lin entières` as the ingredient; supports a full-seed product under a `farine de lin` name. Package serving and nutrition are product-specific. |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S08 | Health Canada, [Canadian Nutrient File: Seeds, flaxseed (linseed), whole and ground, food code 4528](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4528&lang=fre) | Bilingual whole/ground food name and distinct whole/ground household portions; not defatted-meal data and not a catalog density recommendation. |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S09 | Shape Foods, [Product specification — partially defatted flax meal (PDF)](https://shapefoods.com/wp-content/uploads/2022/01/Shape-Foods-Flax-Meal-Technical-Spec-Sheet-April-7-2020.pdf) | Canadian supplier spec gives typical and ranged oil content, source-specific bulk density, and customer-agreed particle size. Revised 2020; technical specification is not a consumer measuring guide or universal product threshold. |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S10 | King Arthur Baking, [How to make homemade egg replacer](https://www.kingarthurbaking.com/blog/2015/07/12/make-homemade-egg-replacer) | One flax/water egg-binder method, proportions, and rest time; warns it is not suitable for every baked good. It does not identify the defatting scope of the meal. |
| WP02-B2-FLAX-MEAL-BOUNDARY-20261012-S11 | Manitoba Flax CA, [What is so special about whole-milled flaxseed?](https://manitobaflax.ca/what-is-so-special-about-whole-milled-flaxseed/) | Contrasts whole-milled seed with the company’s use of `flax meal` for pressed residue and gives a 50%-of-flour claim for its whole-milled product. Interested-source guidance only; not a general substitution. |
