# WP04 Proposal: Tuna Steak Recipe 111 Identity Boundary

**Review date:** 2026-10-11

**Status:** Root-reviewed on 2026-10-11. The review was accepted with no catalog, ledger, recipe, test, or code changes; the plan and roadmap record the decision.

**Scope:** Recheck the existing generic `tuna / thon` reference and recipe `111#1`, including current publisher wording, Canadian species naming, Québec French terminology, exact catalog ownership, recipe demand, and any supported measurement or substitution scope.

## Recommendation

Retain `111#1` on the existing generic `ingredient-ref-tuna` identity. The line and its linked publisher page say tuna, but neither names a species. The publisher describes steaks and gives a thickness for its current version; this is not enough to justify a species identity, a general tuna-steak identity, a new tuna form, or a catalog alias for `tuna steak` / `pavé de thon`. Keep the recipe quantity as `1 count` and leave its existing link unchanged.

The Canadian Fish List and Québec terminology evidence support the broad English/French name pair, while showing why neither word identifies one species. Keep canned tuna, dried bonito/katsuobushi, and process-specific regional tuna products separate. The current source's weight intervals remain source-specific ledger evidence; they do not establish a default count conversion or substitution.

This review does not change the existing ledger states: `identityState: unreviewed`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. It recommends the generic identity as the only defensible catalog link for this recipe, without recording an unimplemented identity-state change.

## Saved recipe provenance and current publisher wording

The bundled file [`recipe 111`](../../../app/src/main/assets/seed/bundled-library/recipes/111-thon-sous-vide-sous-vide-tuna-b699f193-4545-4e7a-98ad-ce092a1e38e4.v1.json) stores source URL `https://recipes.anovaculinary.com/recipe/sous-vide-tuna`, source name Anova Culinary, title *Sous Vide Tuna / Thon sous vide*, and two servings. Ingredient row `b699f193-4545-4e7a-98ad-ce092a1e38e4-ingredient-1` has `originalText: "1 tuna steak"`, `ingredientName: "tuna"`, `ingredientRefId: "ingredient-ref-tuna"`, `quantity: 1`, and `unit: "count"`.

The imported RecipeKeeper record [`processed recipe 111`](../../../docs/exported-recipe-lists/RecipeKeeper_20260320_143058/recipes/processed_111-thon-sous-vide-sous-vide-tuna-b699f193-4545-4e7a-98ad-ce092a1e38e4.json) has yield `2` and the source text `1 pavé de thon - 1 tuna steaks`; the bundled record is a manually cleaned version of that import. Neither file contains a publisher-version identifier or a saved copy of the publisher page.

On the current Anova page, attributed to J. Kenji López-Alt, the ingredient list is headed for four servings and describes two tuna steaks, each about 1½–2 inches thick and within the printed 10–12 oz and 280–320 g ranges. It supplies no species, named anatomical cut, trimming state, skin/bone status, or edible-versus-as-purchased basis. The current page's two steaks for four servings is numerically consistent with the bundle's one steak for two servings, but the bundle has no source capture or version date to establish which historical wording was imported. Treat the current page as a current publisher source, not as an archived copy of the import.

## Species and name boundary

The live CFIA Fish List search for `tuna` displays several distinct scientific taxa under common-name entries containing `Tuna` and/or `Thon`. Examples include *Thunnus alalunga* (including “Albacore Tuna” and “Tuna” entries), *T. albacares* (yellowfin and tuna entries), *T. obesus* (bigeye and tuna entries), *T. thynnus* (bluefin and tuna entries), *Katsuwonus pelamis*, and *Euthynnus affinis*. Thus the generic words on the recipe line do not select a single species. The result page displays a last-modified date of 2023-09-18; it was retrieved live on 2026-10-11.

CFIA guidance says the Fish List supplies French and English common names recognized for fish sold or processed in Canada and associates them with scientific names. Its separate fish-labelling guidance says prepackaged fish products need a common name; it also limits “white meat tuna / thon blanc” to *Thunnus alalunga*. These are product-label naming rules and examples, not evidence that the unqualified recipe ingredient is albacore or any other species. Anova supplies no “white,” “light,” “yellowfin,” “bluefin,” or other species qualifier.

The OQLF-hosted GDT entry for edible fish gives `thon` with English `tuna`. The entry credits Les Éditions Québec Amérique inc. (2003), and supports the generic fr-CA display `thon`; it does not establish a taxon or steak cut. `Pavé de thon` appears in the RecipeKeeper import, but this review found no Québec terminology source that would make that phrase a distinct global catalog identity or form. Preserve it only as imported/source text; do not add it as a global alias.

## Current catalog, form, ledger, and recipe audit

The current manifest contains **114 recipe files and 1,123 ingredient rows**. A normalized scan of each row's source text, ingredient name, and reference ID found one related ingredient row: `111#1` above. A scan of complete recipe JSON text for `tuna`, `thon`, steak/cut wording, canned/dried/smoked tuna, bonito, and species qualifiers found only recipe 111; its other matches occur in the recipe text, not additional ingredient rows.

The exact-key audit used the app's `normalizeIngredientSearchKey` behavior: lowercase, Unicode NFKD, fold `œ` / `æ` / `ß` and `&`, remove combining marks, replace punctuation with spaces, then trim and collapse spaces.

| Normalized key or owner | Current exact owner / result |
| --- | --- |
| `tuna` | Active `ingredient-ref-tuna` English name. |
| `thon` | Active `ingredient-ref-tuna` French name. |
| `tuna steak`, `tuna steaks`, `thon steak`, `pave de thon`, `thon en pave`, `canned tuna`, tested common names (`albacore`, `yellowfin tuna`, `bluefin tuna`, `skipjack tuna`, `bigeye tuna`, `white tuna`), and tested binomials (*Thunnus alalunga*, *T. albacares*, *T. obesus*, *T. thynnus*, *Katsuwonus pelamis*, *Euthynnus affinis*) | No exact active reference name/alias, form label/match term, or legacy-candidate name/alias. |
| Active forms | No tuna- or thon-named form. |
| Legacy candidates | No tuna- or thon-named candidate. |
| Other nearby identities | `ingredient-ref-dried-bonito` is explicitly the dried bonito/katsuobushi product; it has no bare `bonito` / `bonite` alias. It is not a tuna-steak match. The ledger keeps Maldivian `hikimas` and `valhoamas` process candidates unresolved and `rihaakuru` as a separate tuna-paste condiment; none is a generic tuna alias or a fresh steak identity. |

The active tuna reference has no aliases, density, or unit mappings. The package has no tuna form, substitution rule, contextual substitution rule, or package-yield observation. In the ledger, `ingredient-ref-tuna` already records the Anova source and two source-reported per-steak ranges; it has no species/cut identity evidence, and substitution research remains marked `not_yet_researched`.

Prior WP04 reviews already treated this one steak as generic tuna, recorded the publisher's measurement interval separately, and declined a tuna-steak form or universal mapping. The finfish follow-up also called out recipe `111#1` as existing generic tuna rather than evidence for a new species. The present review adds a species/name boundary check and does not reopen those measurement decisions. See [`WP04 tuna count and portion review`](wp04-next-animal-food-or-count-residual-20261010.md), [`WP04 interval contract`](wp04-count-portion-interval-contract-review-20261010.md), and [`WP04 finfish follow-up`](wp04-finfish-species-followup-20261009.md).

## Evidence dimensions and limits

| Dimension | Source facts | Disposition |
| --- | --- | --- |
| **Identity** | Anova names tuna; CFIA lists the generic English/French names against multiple taxa; OQLF maps edible-fish `thon` to English `tuna`. | Keep the generic active `tuna / thon` identity. Do not infer a species or create a species-qualified link. |
| **Cut / form** | Anova's current recipe says steak and states an approximate thickness. The imported French text says `pavé de thon`. No source establishes an anatomical cut, general catalog cut class, or stable tuna form. | Keep the recipe's original wording and current generic link. Add no alias, identity, or form. |
| **Measurement** | The current publisher line gives two separately printed per-steak ranges, 10–12 oz and 280–320 g, with “each” and a thickness qualifier. The existing ledger preserves these as separate source-reported intervals. | Retain the ledger observation only. Do not infer endpoint semantics, select a midpoint, scale from recipe yield, or treat the co-reported ranges as a conversion. The page does not state trim, skin/bone, purchase/edible basis, or cooked yield. |
| **Density / conversion** | No volume measure, density, tuna-specific unit mapping, or standardized weight for one steak is supplied. | No density, count-to-mass mapping, cooked yield, or edible-portion yield. Preserve `1 count`. |
| **Substitution** | Anova suggests using its sous-vide tuna in dishes where canned tuna is typically used, with a different texture/flavor. It gives no target recipe, amount, species, product state, or ratio for a substitution. | Treat as a qualitative publisher use suggestion only; do not add a global or contextual substitution rule. Do not infer food-safety equivalence. |

## Source register

All web sources below were accessed on **2026-10-11**.

| Source | Claims used | Limits |
| --- | --- | --- |
| Anova Culinary, [Sous Vide Tuna](https://recipes.anovaculinary.com/recipe/sous-vide-tuna), current publisher page, ingredient list and introductory text; attributed on-page to J. Kenji López-Alt. | Current four-serving line; two steaks with per-steak thickness and mass intervals; qualitative canned-tuna recipe-use suggestion. | Publisher recipe, not species taxonomy, retail label, product specification, conversion table, or safety authority. No archived version/date was shown for the imported bundle. |
| CFIA, [Search CFIA Fish List for tuna](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=tuna). | Official English/French common-name entries tied to distinct scientific taxa. | Dynamic query results; displayed page modification date 2023-09-18. The name index does not identify the fish in Anova's recipe. |
| CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). | Scope and role of the Canadian Fish List and scientific-name linkage; page displays last modified 2023-09-25. | Commercial fish naming guidance; does not resolve an unqualified culinary recipe ingredient to a species. |
| CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish). | Common-name labeling context and the species condition for hermetically sealed “white meat tuna / thon blanc.” | Product-label context, not a recipe parser or evidence that this recipe uses albacore. No safety determination is made here. |
| OQLF Vitrine linguistique, [GDT: thon](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423402/thon). | Québec-hosted terminology for edible fish; `thon` ↔ `tuna`. Entry credits Les Éditions Québec Amérique inc. (2003). | Generic language evidence only; not species, cut, or regulatory product-name evidence. |

## Review outcome

Retain the existing `ingredient-ref-tuna` link for `111#1`, retain its count unit, and keep the existing ledger-only source intervals. Do not add or alias a tuna species, tuna steak identity/form, `pavé de thon`, canned tuna, dried bonito, or another processed tuna product. No conversion, yield, substitution rule, recipe edit, or safety rule is supported by this review.

## Root disposition

Accepted after a root reread of the bundled ingredient row, active generic reference, existing ledger observation, manifest, and current source packet. The evidence leaves recipe `111#1` on `ingredient-ref-tuna`; the ledger state remains `identityState: unreviewed`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`. The existing source-reported intervals remain untouched. No new name, form, mapping, conversion, yield, substitution, or recipe link was added.
