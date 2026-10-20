# WP02 Section 04 A6 R150 — Ivory Teff Flour Identity Review

## Review record

- **Reviewed and sources accessed:** 2026-10-15.
- **Status:** Proposal-only source packet. The parent task has since integrated the ivory teff flour reference and ledger record in R150; this proposal did not edit shared data. See the R150 integration README.
- **Scope:** One open regional-flour candidate: flour marketed in Canada under the exact product name **Ivory Teff Flour**.
- **Open checklist item:** [WP02 Section 04 A6, “Continue the A6 review … and other regional grain flours”](../../RecipeBook-global-ingredient-catalog-plan.txt#L1399).
- **Source-ID prefix:** `WP02-A6-IVORY-TEFF-FLOUR-R150-20261015-S` (S01–S04), now allocated to the R150 ledger record.

## Recommendation

**Accept an identity-only reference for `ivory teff flour / farine de teff ivoire`, scoped to a distinct Canadian flour-market name.** Ontario Made lists Berhan Grains' 1 lb **Ivory Teff Flour** as a product made in Ontario and lists it separately from Berhan's 1 lb **Brown Teff Flour** and its grain products [S01–S02]. This demonstrates a current Canadian seller's distinct named flour product. It does not establish a universal teff color taxonomy, a botanical variety, a difference in milling process, or that every product described as ivory teff flour is equivalent to Berhan's product. Do not generalize the qualifier beyond the source-attested market identity.

Use `ivory teff flour` as the English display because it is the product's exact listed name apart from package size. Use `farine de teff ivoire` as the French display, based on a Québec bakery's ingredient declaration `farine de (sorgho, teff ivoire, riz blanc, millet)` [S03] and the existing Québec French-market base display `farine de teff` [WP02-S92]. A Québec retailer separately lists `farine de teff d'ivoire à grains entiers` in the ingredients of a tortilla product [S04]. These sources attest French ingredient-list wording, not a standalone French flour product title or an OQLF-preferred term. The proposed French display is a concise catalog rendering of that Québec ingredient usage; it should not be presented as an exact standalone label.

Add no aliases. Keep the existing generic teff flour row, teff grain, and the separately held malted-teff candidate unchanged. Add no form, density, unit mapping, conversion, recipe link, or substitution.

## Product and identity boundary

| Candidate or nearby identity | Recommendation | Evidence boundary |
|---|---|---|
| Ivory teff flour / farine de teff ivoire | **Add** as an identity-only `FLOUR_AND_STARCH` reference. | Berhan Grains lists a flour product under this exact English name in Ontario, separately from its Brown Teff Flour product [S01–S02]. The French display is based on Québec ingredient-list wording, not a standalone flour title [S03–S04]. |
| Generic teff flour / farine de teff | Keep on existing `ingredient-ref-teff-flour`. | The generic milling product remains distinct from Berhan's named ivory product. Do not overwrite the existing general row or add `ivory` as an alias to it. |
| Teff grain / teff d'Abyssinie | Keep on existing `ingredient-ref-teff-grain`. | Grain-level teff stays separate from flour. The active grain row also owns the broad `teff` search term. |
| Brown teff flour | Do not add in this review. | Berhan's product list shows it as a distinct sibling product [S01–S02], but this review is limited to one candidate and does not assess whether it merits an independent catalog identity. |
| Malted teff flour | Keep held under the existing A7 review. | R37 concerns a proposed malting process and lacks a current Canadian/Québec product identity; it is not equivalent to the plain ivory product ([A7 R37](wp02-a7-malted-teff-flour-boundary-review-20261013-round37.md)). |

## Proposed reference JSON delta

This is the complete new reference object proposed for `ingredient-references.v1.json`. No existing row should be edited.

    {
      "id": "ingredient-ref-ivory-teff-flour",
      "nameFr": "farine de teff ivoire",
      "nameEn": "ivory teff flour",
      "aliasesFr": [],
      "aliasesEn": [],
      "defaultDensity": null,
      "unitMappings": [],
      "updatedAt": "2026-10-15T00:00:00Z",
      "category": "FLOUR_AND_STARCH"
    }

The French display intentionally does not include `à grains entiers`: that wording is attached to a tortilla ingredient declaration and is not established for Berhan's product. The query phrase `farine de teff d'ivoire` is also not added as an alias; its reviewed occurrence is within that whole-grain tortilla ingredient declaration, not a standalone flour product title [S04].

## Source review

| Source | Locator and evidence | What it supports and does not support |
|---|---|---|
| **S01 — Ontario Made, [1 lb. Ivory Teff Flour — Berhan Grains Inc](https://supportontariomade.ca/explore-products/1-lb-ivory-teff-flour)** | Product heading; description; “Proudly made in Ontario by”; related product listings. Accessed 2026-10-15. | Exact Canadian product name `1 lb. Ivory Teff Flour`; page says it is made in Ontario and separately lists 1 lb Brown Teff Flour, 1 lb Brown Teff Grain, 1 lb Ivory Teff Grain, and 5 lb flour products. Its uses and flavor/color descriptions are seller guidance, not a universal baking formula or teff taxonomy. The 1 lb amount is a package size. |
| **S02 — Ontario Made, [Berhan Grains Inc manufacturer listing](https://supportontariomade.ca/manufacturer/barrie/berhan-grains-inc)** | Barrie, Ontario address and sibling product listings. Accessed 2026-10-15. | Confirms the Ontario maker listing and separate Brown/Ivory Teff Flour products in 1 lb and 5 lb sizes. It is not evidence that the teff grain itself was grown in Canada. |
| **S03 — Boulangerie Merveilles sans Gluten, [Multigraines](https://www.douceurgourmande.ca/fr/produit/multigraines)** | French ingredient declaration `farine de (sorgho, teff ivoire, riz blanc, millet)`; 650 g finished bread; Sainte-Perpétue, Québec. Accessed 2026-10-15. | Québec food-market use of `teff ivoire` within a flour list. The page is for a multi-grain bread, not a bag or standalone product titled farine de teff ivoire; its 650 g is the finished bread size, not a flour quantity. The page currently says the product is unavailable for online purchase. |
| **S04 — Super C, [Tortillas aux grains anciens sans gluten — La Tortilla Factory](https://www.superc.ca/allees/pains-et-patisseries/tortillas-et-pains-plats/tortillas/tortillas-aux-grains-anciens-sans-gluten/p/078858525020)** | French ingredient declaration includes `Farine de teff d'ivoire à grains entiers`; 396 g finished tortillas. Accessed 2026-10-15. | Québec retailer attestation of the longer French ingredient wording. This is an ingredient in a tortilla product, with the `à grains entiers` qualifier; it does not establish an exact standalone flour display or a match to every product marketed as ivory teff flour. The product page reported out of stock at review time. |
| **Existing WP02-S90 / WP02-S92** | OQLF [tef (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef); La Chèvre et le Chou [Farine de teff bio](https://lachevreetlechou.ca/produits/farine-de-teff-bio). | Reuse the current ledger's existing sources. The OQLF entry concerns the cereal name and does not establish the ivory compound. The Québec product listing supports the existing generic French flour display `farine de teff`; neither source is duplicated or treated as a ruling on `farine de teff ivoire`. |

## Live catalog, archive, alias, picker, and recipe audit

The read-only package snapshot contained **1,514 ingredient references, 119 forms, 61 legacy candidates, and 1,859 research-ledger records**. The manifest lists **114 recipes and 1,123 ingredient rows**.

| Surface | Finding |
|---|---|
| Active references | `ingredient-ref-teff-flour` is `teff flour / farine de teff`; `ingredient-ref-teff-grain` is `teff / teff d'Abyssinie`. At review time, the candidate ID and exact proposed displays were unused; R150 has since added the reference. |
| Active forms | No teff-related forms or form search terms are present. |
| Legacy identities and ledger | At review time, no legacy candidate owned the proposed ID or exact phrases `ivory teff flour`, `farine de teff ivoire`, or `teff ivoire`, and no ledger record used the candidate ID. R150 has since added the reference and its evidence record. |
| Proposal and batch archive | Searches for the proposed phrases found no earlier ivory-teff-flour review or equivalent integration. The R149 wild-rice-flour review is already integrated and excluded; it concerns another grain. A7 R37 is a held malted-teff process candidate, not the plain named product reviewed here. |
| Recipe corpus | All 114 manifest-listed recipe files and 1,123 ingredient rows were searched for candidate wording and teff reference links. There are **0** lexical hits for the ivory candidate or generic teff-flour wording and **0** direct links to teff grain or teff flour. No bundled recipe demand, recipe link, measurement, or substitution is proposed. |

Exact normalized phrase ownership before this proposal:

| Phrase | Current owner |
|---|---|
| `ivory teff flour` | None |
| `farine de teff ivoire` | None |
| `teff ivoire` | None |
| `farine de teff d'ivoire` | None |
| `teff ivory flour` | None |
| `teff flour` / `farine de teff` | Existing `ingredient-ref-teff-flour` |
| `teff` | Exact display owner: `ingredient-ref-teff-grain`; phrase search also matches `ingredient-ref-teff-flour`. |

The following static picker projection applies the complete-phrase-first behavior in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It projects the reference names and aliases only; no app or runtime check was run.

| Query | Before proposal | After proposal | Effect |
|---|---|---|---|
| `ivory teff flour` | 0 | 1 | Finds only `ingredient-ref-ivory-teff-flour`. |
| `farine de teff ivoire` | 0 | 1 | Finds only `ingredient-ref-ivory-teff-flour`. |
| `teff ivoire` | 0 | 1 | Finds the new qualified flour display. |
| `teff flour` | 1 | 2 | Existing generic flour plus the ivory product identity. |
| `farine de teff` | 1 | 2 | Existing generic flour plus the ivory product identity. |
| `teff` | 2 | 3 | Existing grain and generic flour plus the ivory product identity. |
| `farine de teff d'ivoire` | 0 | 0 | Remains unassigned because the source phrase includes a whole-grain tortilla ingredient qualifier, not a standalone flour title. |
| `teff ivory flour` | 0 | 0 | No word-order alias is added. |

The broad `teff flour`, `farine de teff`, and `teff` searches gain a distinct product row because the proposed display contains those phrases. This does not merge the existing generic flour and grain identities. The ivory term remains attached to the source-attested named flour candidate.

## Measurements and substitutions

- **Package size:** Berhan's Ontario Made page lists 1 lb and 5 lb packages [S01–S02]. These are net package sizes, not kitchen measures or paired mass-volume observations.
- **Québec loaf and tortilla sizes:** The 650 g bread and 396 g tortilla weights are finished mixed products [S03–S04]. They do not specify the quantity of teff flour in either product.
- **Density and unit mapping:** No reviewed source gives a volume-to-mass measure, bulk density, or reusable conversion for ivory teff flour. Keep `defaultDensity` null and `unitMappings` empty.
- **Substitution:** Berhan lists baking applications and says its product can be incorporated into recipes, but gives no tested ratio or replacement formula [S01]. No general or contextual substitution is supported. Add none.
- **Recipe linkage:** The bundled corpus has no teff or teff-flour demand. Add no recipe link.

## Proposal-local static checks

After writing, verify this file is UTF-8 without BOM, has no trailing whitespace or mojibake, its JSON delta parses, its local links resolve, and its only change is this proposal file. No Gradle, tests, emulator, app, or deployment checks are in scope.
