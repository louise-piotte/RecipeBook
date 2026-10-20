# WP05 Salsa Lizano — identity and Québec naming review

**Date:** 2026-10-11
**Status:** Integrated on 2026-10-11 as an identity-only reference. See the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md) for the canonical row and verification.
**Scope:** One open Section Z condiment candidate, Salsa Lizano. Sambal products, chunjang, and the active black-bean-sauce identity are outside this review.

## Recommendation

**Accept one identity-only `SAUCE_AND_CONDIMENT` reference** for the named Costa Rican bottled sauce:

| Seed field | Value |
|---|---|
| ID | `ingredient-ref-lizano-sauce` |
| English display | `Lizano sauce` |
| Québec French display | `sauce Lizano` |
| English aliases | `Salsa Lizano`; `Lizano Salsa` |
| French aliases | `Salsa Lizano` |
| Category | `SAUCE_AND_CONDIMENT` |
| Default density / unit mappings | `null` / none |

The open plan names *salsa Lizano* under Latin American condiments. Unilever Food Solutions currently lists a distinct `Lizano® Salsa Regular` product; a Québec City retailer titles it `Salsa Lizano` and gives the French descriptor `Sauce lizano`; and a Montréal retailer lists `Lizano Sauce` [S01–S03]. This supports the concise bilingual names above while retaining the product's source name as a search alias.

The alias `Salsa Lizano` contains the generic token `salsa`; under the current search behavior, a one-word `salsa` query will also return this named product. The live package has no active generic-salsa reference, but it does have an inactive legacy candidate. Keep that generic candidate separate. If a generic salsa reference is ever integrated, recheck the one-word picker results and preserve both identities.

Do not alias generic `salsa`, `sauce brune` / `brown sauce`, `Worcestershire sauce`, `hot sauce`, `salsa inglesa`, or an unspecified seasoning/marinade to this product. One Canadian seller compares its flavor with Worcestershire while explicitly distinguishing it from hot sauce; that comparison describes, but does not establish, synonymy or substitution [S05]. The Québec French wording is supported by local retail usage; a targeted OQLF lookup did not find a dedicated Lizano entry.

## Plan and prior-proposal audit

Section Z of `docs/RecipeBook-global-ingredient-catalog-plan.txt` lists *salsa Lizano* as open alongside mole, adobo, achiote, and other Latin American sauce candidates. The relevant Mexico/Central America sweep discusses a generic salsa boundary, the separately named salsa macha, and Costa Rican *conserva de chiverre*, but does not review Salsa Lizano. The exact product name was not found in any prior WP05 or WP06 proposal or batch. Existing broad condiment packets cover other named candidates; they do not propose a Lizano reference. This proposal is restricted to the named product and does not close the broader checklist.

## Live package, collision, and recipe audit

Snapshot read on 2026-10-11. Search-key checks follow `normalizeIngredientSearchKey` and the current phrase-first, substring-fallback behavior in `IngredientSearch.kt`.

| Artifact | Current state | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 905 references; no Lizano identity or alias | `1ce5a81fb511bd422c8c8ce9c8247d3cc35c0b8fe056aae9afc4423c6326dfad` |
| `ingredient-forms.v1.json` | 48 forms; no Lizano form or match term | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `docs/catalog/research-ledger.v1.json` | 1,159 records; no Lizano record or source-ID-prefix collision | `998c6d37d5271a01f57800870a69d0c84b308f3c070c212942245a4559fa8b44` |
| `docs/catalog/legacy-import-identities.v1.json` | 77 candidates; no Lizano candidate | `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57` |
| `manifest.v1.json` | 114 recipe files; 1,123 ingredient rows | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

No exact normalized reference, form, or legacy-name/alias key was found for `Lizano`, `Lizano sauce`, `sauce Lizano`, `Salsa Lizano`, `Lizano Salsa`, or `Lizano Salsa Seasoning`. The proposed reference ID is absent from active references, forms, ledger records, and legacy candidates. The proposed source-ID prefix `WP05-LIZANO-20261011` was absent from the ledger, proposals, and batches before this file was created.

The one relevant legacy record is `ingredient-ref-salsa`, with `salsa` as both French and English name. It is inactive, has no sources, and remains `unreviewed` in the ledger; its decision says the legacy candidate needs identity and alias reconciliation before acceptance. It is not evidence that Salsa Lizano is generic salsa, and it is not an active collision. Because the app matches complete query phrases within longer terms, the proposed `Salsa Lizano` alias means the one-word query `salsa` will match the new row. Keep the product distinct and retain this search caveat for coordinator review.

Nearby active product identities include `ingredient-ref-worcestershire-sauce` (`Worcestershire sauce / sauce worcestershire`), `ingredient-ref-tomato-sauce` (`tomato sauce / sauce tomate`), `ingredient-ref-bbq-sauce` (`BBQ sauce / sauce barbecue`), and `ingredient-ref-black-bean-sauce` (`black bean sauce / sauce de soja noir`). Their names and product scopes remain separate. No active generic `salsa`, `brown sauce`, or Lizano identity was found.

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned across `originalText`, `ingredientName`, and `ingredientRefId`; a full-file search for `Lizano` also returned no result. **Bundled recipe hits: zero.** No recipe line or recipe link is proposed. As external—not bundled—demand evidence, Unilever's Gallo Pinto recipe names `Lizano Salsa` as an ingredient and instructs adding `salsa Lizano al gusto`; its interactive ingredient calculator renders `0.0 g` for that line [S04]. That placeholder is not a quantity and the “to taste” direction is not a conversion.

## Product boundary and data disposition

- **Include:** the named, bottled regular/original Costa Rican Lizano seasoning sauce. The official product page presents one `Lizano® Salsa Regular` SKU and a product-specific vegetable, seasoning, sweetener, acid, and thickener formula [S01]. This evidence supports a product identity, not one universal formula for every Lizano SKU.
- **Keep separate:** generic salsa, tomato sauce, Worcestershire/HP-style sauces, hot sauce, and generic seasoning sauce. Similar color, acidity, use, or a merchant comparison does not make these aliases. The named sauce is not a general salsa-family identity.
- **Variants:** the reviewed evidence directly names the regular product. Do not absorb a future mild, picante, or differently formulated Lizano product under the row solely because it shares the brand; review any exact variant separately.
- **Forms:** none. A bottled sauce's ready-to-use state does not warrant a form record, and no process-state conversion was found.
- **Aliases:** retain only the product-name word-order variants directly attested by the manufacturer and Québec retail page. Do not add `Lizano` alone, generic `salsa`, `salsa de vegetales`, `sauce piquante`, or a comparison sauce.
- **Recipe links:** none; the current bundled recipes have no exact demand.

## Measurements, conversions, yields, and substitutions

Add no density, unit mapping, volume-to-mass conversion, package yield, cooking yield, or substitution. The sources show unlike package presentations—3.7 L from Unilever, 635 mL with a 0.6 kg weight field from the Québec listing, and 675 g from a Montréal retailer [S01–S03]. Those are individual product/retailer listings, not a matched net-mass/net-volume pair or a universal conversion. Do not calculate a density from them. The external Gallo Pinto source's `0.0 g` calculator display and “to taste” instruction support no numeric rule [S04].

Worcestershire is only a retailer comparison, not a substitute; no ratio or tested replacement is supported [S05]. Do not add cross-ingredient substitution rules.

## Source register

Sources checked on 2026-10-11.

| ID | Source | Supports and limits |
|---|---|---|
| `WP05-LIZANO-20261011-S01` | Unilever Food Solutions Latin America, [Lizano® Salsa Regular 3.7 L](https://www.unileverfoodsolutionslatam.com/producto/lizano-salsa-regular-3-7-l-70-ES-1146152.html). | Current official product title; describes a Costa Rican traditional sauce and lists one commercial SKU's ingredients and package. Those ingredients are product-specific, not a universal standard. A separate description field on the page contains unrelated mayonnaise copy, which was not used. |
| `WP05-LIZANO-20261011-S02` | Épicerie Tropica, Québec City, [Salsa Lizano](https://epicerietropica.com/product/salsa-lizano/). | Québec retailer's product title is `Salsa Lizano`; its French product descriptor is `Sauce lizano, 635ml` under `Sauces`. This is direct local retail wording, not an OQLF terminology decision; its displayed weight field is not used for density. |
| `WP05-LIZANO-20261011-S03` | Marché Andes, Montréal, [Lizano Sauce](https://www.marcheandes.com/en/produit/lizano-sauce/). | Montréal retailer uses the English name `Lizano Sauce` for the Costa Rican product and lists a 675 g package. The shop page is in English and does not independently validate the French term. |
| `WP05-LIZANO-20261011-S04` | Unilever Food Solutions Latin America, [Gallo Pinto recipe](https://www.unileverfoodsolutionslatam.com/receta/gallo-pinto-R90013574.html). | Official recipe lists `Lizano Salsa`; directions say `salsa Lizano al gusto`. The interactive calculator's 0.0 g is a blank/default display, not a measured amount. External usage only; no matching bundled recipe line. |
| `WP05-LIZANO-20261011-S05` | The Gourmet Warehouse, [Lizano Salsa Sauce — Original, 625 mL](https://gourmetwarehouse.ca/lizano-salsa-sauce-original-625ml/). | Canadian retailer calls it Costa Rica's signature condiment, explicitly says it is not a hot sauce, and compares its role/flavor with Worcestershire. The comparison is not a synonym, product standard, or substitution; shipping to Québec is stated on the listing. |

## Evidence limits and recommendation boundary

Evidence supports the product identity and the displays `Lizano sauce / sauce Lizano`, with `Salsa Lizano` retained as a source-attested product-name alias. The local French retail title and descriptor are the basis for Québec wording; no dedicated OQLF Lizano entry was found. The product page and retail listings do not establish a universal recipe, a complete variant taxonomy, a density, a package conversion, or a substitute. The broader Section Z checklist remains open, and generic `salsa` remains a separate unresolved legacy candidate.

No tests were run during the source review. Implementation verification is recorded in the [batch README](../batches/wp02-wp03-wp04-wp05-followup-integration-20261011/README.md).
