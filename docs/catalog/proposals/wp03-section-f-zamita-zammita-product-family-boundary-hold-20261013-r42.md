# WP03 Section F R42 — Zamita / Zammita product-family boundary hold

- **Reviewed:** 2026-10-13.
- **Status:** integrated documentation-only hold; no catalog or ledger data changed.
- **Open checklist:** the regional cereal-mix and preprocessed-grain item remains open in the [live Section F checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2555).
- **Candidate:** Moroccan Zamita / Zammita / Zemita and related spellings, used for roasted-grain products and preparations.
- **Decision:** keep the unqualified name family unallocated. Do not add an active reference or alias, attach the names to roasted barley or wheat flour, or create a candidate-ledger record. No stable product boundary or Québec French display is established.

## Why this is a distinct open review

The live checklist has no Zamita-specific decision. R40 mentions zammita only as a neighboring product in its Barkoukch review; R41 reviews the separate Balboula/Belboula family. Neither decides Zamita ownership or composition. The focused search of the plan, roadmap, proposals, batches, active references, forms, legacy-import identities, research ledger, and bundled recipes found no prior Zamita review or exact catalog owner. The spelling appears only incidentally in the R40 proposal archive.

The sources establish a real Moroccan food name, but not one stable ingredient identity:

- Morocco’s High Commission for Planning groups sfouf, zemita, and sellou together under “other cereal-based products.” This is a broad reporting category, not a product standard [S01].
- The Moroccan public Agricultural Development Agency’s Terroir du Maroc marketplace lists in-stock Zamita de blé and Zamita d’orge products from the Laarassi cooperative. Both pages describe the product as a variant of Sellou and as a traditional recipe made from several ingredients. A separate Lemima cooperative page describes toasted maize, wheat, and chickpeas with herbs and spices [S02, S03].
- Choumicha’s recipe page names a specific Zammita preparation and lists roasted chickpea, barley, almond, flax, sesame, and millet with herbs and spices; honey, butter, and water are listed for serving [S04].
- Caubet and Aumeeruddy-Thomas’s Rif ethnobotanical and linguistic study records regionally different uses: young roasted seed flour in one context, a multi-flour preparation also called sǝllu in others, and a Middle Atlas barley-flour variant with butter, sesame, and almonds [S05].

These sources support Zamita as an uncovered regional cereal-mix/prepared-grain boundary. They do not support a universal cereal base, dry-product formula, or separation from prepared Sellou. The English marketplace title “Zmita (Roasted Flour Mixture)” is a seller’s wording for one Jerada-region product; it does not resolve that broader family [S06].

## English and Québec French naming

Source-attested wording includes the Moroccan French product labels Zamita de blé, Zamita d’orge, and Zamita de blé aux herbes; one Moroccan marketplace uses the English title “Zmita (Roasted Flour Mixture)” [S02, S06]. These labels identify particular seller products, not a shared catalog class. Targeted searches of the OQLF terminology site and Québec-facing product sources did not find a Zamita-specific Québec French display. The Moroccan French phrases remain source labels only; do not promote them as Québec-preferred terminology or construct a French translation of the English marketplace title.

## Exact ownership and picker effect

Current ownership snapshot: **1,367 active references, 100 forms, 64 legacy-import candidates, and 1,699 research-ledger records**. Exact normalized ownership checks found no Zamita/Zammita/Zemita/Zemmita/Zmita/Zomita/Sellou/Sfouf owner in the reference catalog, forms, legacy identities, or ledger. The product-qualified phrases Zamita de blé and Zamita d’orge also have no exact owner.

| Search phrase | Current exact picker result | R42 effect |
|---|---|---|
| zamita, zammita, zemita, zemmita, zmita, zomita, sellou, sfouf, Zamita de blé, Zamita d’orge | None | Keep all names unallocated. |
| roasted barley flour, toasted barley flour | ingredient-ref-roasted-barley-flour (roasted barley flour / farine d’orge torréfiée) | Preserve the existing flour identity; add no Zamita alias. |
| roasted wheat flour | ingredient-ref-roasted-wheat-flour (roasted wheat flour / farine de blé torréfiée) | Preserve the existing flour identity; add no Zamita alias. |

The two roasted-flour references have no forms, default density, or unit mappings. Their substrate-specific names do not own the broader mixed cereal/legume preparations. Assigning unqualified Zamita to either would make a variable blend or finished preparation look like one roasted cereal flour. The picker normalizes case, accents, punctuation, and spacing, prefers complete word-phrase matches, then falls back to substring matches ([implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9)). The results above are a static projection from the current reference and form JSON, not an Android UI observation.

## Recipe-demand audit

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were searched across serialized recipe text and ingredient-reference IDs for Zamita/Zammita/Zemita variants, Sellou/Sfouf, and the source-attested roasted-flour-mixture wording. The scan found **zero matching recipe files**, **zero matching ingredient rows**, and no linked catalog reference. Choumicha’s external recipe documents one formulation; it does not create demand in the bundled recipe corpus.

## Measurement, form, and substitution limits

- **Product state and composition:** sources describe both dry roasted-grain mixtures and preparations mixed with fat or liquid, with different grain, legume, nut, seed, and herb ingredients. Do not create one dry, cooked, or prepared form from this evidence.
- **Numeric evidence:** the Choumicha gram amounts are the quantities for that complete recipe, not a reusable measure or composition standard for packaged Zamita. Product listings of 500 g, 1 kg, or 1.5 kg are package sizes only. Add no household measure, density, unit mapping, conversion, or cooking yield.
- **Substitution:** no reviewed source validates replacing barley flour, wheat flour, another cereal mix, or prepared Sellou with a generic Zamita product at a transferable ratio or method. Add no substitution rule.
- **Active data:** add no reference, alias, form, measurement, recipe link, conversion, yield, substitution, or ledger candidate.

## Source register

Sources were checked online on 2026-10-13. The prefix WP03-ZAMITA-R42-20261013- was unused in the repository before this proposal; no source IDs or candidate status were added to the shared ledger.

| Source ID | Source and evidence | Limits |
|---|---|---|
| WP03-ZAMITA-R42-20261013-S01 | Morocco High Commission for Planning, [cereal-product classification](https://www.hcp.ma/region-drda/attachment/1125796/), page 562. Code 0179 groups sfouf, zemita, and sellou as “other cereal-based products.” | Official classification category, not a definition of composition, form, or synonymy. |
| WP03-ZAMITA-R42-20261013-S02 | Agence pour le Développement Agricole, [Terroir du Maroc](https://terroirdumaroc.gov.ma/details-qui-sommes-nous) and its current product pages for [Zamita de blé](https://terroirdumaroc.gov.ma/fr_ma/catalog/product/view/id/257/s/zamita-ble-1kg-laarassi/category/12/) and [Zamita d’orge](https://terroirdumaroc.gov.ma/fr_ma/catalog/product/view/id/258/s/zamita-d-orge-1kg-laarassi/category/12/). The public agency is under Morocco’s agriculture ministry; the marketplace lists in-stock cooperative products and describes both as multi-ingredient Sellou variants. | Marketplace product descriptions, not a legal ingredient standard. The package sizes are SKU amounts, not recipe measures. |
| WP03-ZAMITA-R42-20261013-S03 | Terroir du Maroc, cooperative Lemima, [Zamita 500 g](https://terroirdumaroc.gov.ma/fr_ma/catalog/product/view/id/1357/s/zamita-500-g-cooperative-lamima/category/2/). Its product description names roasted maize, wheat, and chickpeas with herbs/spices and says the preparation may be eaten with oil, butter, argan oil, or honey. | One cooperative’s product description; no percentages or common formula are supplied. |
| WP03-ZAMITA-R42-20261013-S04 | Choumicha, [Recette Zammita](https://www.choumicha.ma/recette/175-zammita.html). The current French recipe page labels the recipe Zammita/Zamita and lists roasted chickpea, barley, almond, flax, sesame, and millet with herbs and spices. | A single prepared recipe, not a retail specification. Ingredient quantities belong to that recipe and are not transferred to the catalog. |
| WP03-ZAMITA-R42-20261013-S05 | Dominique Caubet and Yildiz Aumeeruddy-Thomas, [Céréales, pains, levains et fours dans la région d’El Hoceima](https://doi.org/10.4000/ethnoecologie.3070), Revue d’ethnoécologie, Supplement 1 (2017). The ethnobotanical/linguistic study records regionally varying uses of zǝmmēṭa and related forms, including roasted young-grain flour and richer multi-flour preparations. | Regional ethnography, not a current product standard or Québec naming source. The journal landing page presented an anti-bot check during this review; the article text was verified in indexed full-text results. |
| WP03-ZAMITA-R42-20261013-S06 | CoopMarketplace, [Zmita (Roasted Flour Mixture)](https://www.coopmarketplace.ma/An/produit/Zmita-%28Roasted-Flour-Mixture%29/466). The current indexed English title describes a hand-made wheat, barley, sorghum, corn, carob, and herb mix from Jerada. | Marketplace seller wording for one product. The page could not be opened directly during this check; its indexed listing is used only as product-name and formula evidence, not as a common specification or Québec term. |
| WP03-ZAMITA-R42-20261013-S07 | Slama Agricole, [Les farines et Zemita](https://slamaagricole.ma/fr/categorie-produit/zemita-farines/). The current Moroccan seller describes mixtures of roasted/ground barley, corn, millet, or wheat with aromatics, nuts, or sesame, served dry or mixed with liquid. | Seller description, not an independent standard; it documents this seller’s family-level usage only. |

## Next action

Keep generic Zamita/Zammita/Zemita unallocated and Section F open. Reopen only when a product specification distinguishes a dry sellable mix from prepared Sellou and establishes its substrate/form, alongside a Québec-facing French product label or authoritative Québec terminology entry. Until then, keep the source-attested labels inactive and do not infer measurements or substitutions.

## Integration

The hold is recorded under the open Section F checklist and in the roadmap. No catalog, form, measurement, recipe, or ledger data changed. No tests were run for this documentation-only update.
