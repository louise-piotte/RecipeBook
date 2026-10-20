# WP04 Section P R571 — Greenland halibut steak form review

- **Review date:** 2026-10-17.
- **Plan anchor:** [Open WP04 Section P finfish item, lines 6366–6367](../../RecipeBook-global-ingredient-catalog-plan.txt#L6375). Keep the broad parent open.
- **Scope:** One species-qualified cut form beneath the existing `ingredient-ref-greenland-halibut`; no new fish identity and no parent-alias change.
- **Decision:** **Integrated on 2026-10-17.** Added `Greenland halibut steak / darne de flétan du Groenland` as a cut form with no match terms, measurement, conversion, yield, recipe link, or substitution. Current English product evidence identifies frozen cross-cut steaks of *Reinhardtius hippoglossoides*. Québec sources support the Greenland-halibut species name and `darne` cut terminology. The French label is a composed Québec display; no R571 product source verifies it as a paired Québec product title.

## Prior-work and ownership audit

At review time, this was the remaining Greenland-halibut steak-form gap after the two already integrated halibut steak forms. It is separate from the species identity, smoked product, and broader finfish naming holds.

- **R545** integrated `Atlantic halibut steak / darne de flétan de l’Atlantique` under `ingredient-ref-atlantic-halibut`.
- **R568** integrated `Pacific halibut steak / darne de flétan du Pacifique` under `ingredient-ref-pacific-halibut`.
- The existing Greenland-halibut identity review added `ingredient-ref-greenland-halibut` for *Reinhardtius hippoglossoides*, with `flétan du Groenland` and the French alias `flétan noir`. It explicitly kept `turbot` expressions out of Québec consumer-product aliases. At review time the Greenland identity had no cut forms.
- The separate `ingredient-ref-smoked-greenland-halibut` is a smoked product identity. This review concerns a retailer-described frozen steak cut and does not change the smoked identity.
- R557’s swordfish-steak hold remains closed. The proposed terms contain no `fish steak` phrase or generic match term, so the existing empty `fish steak` query remains unchanged. R554 Haddock-loin, R560 cod-loin, and R565 cod-centre-cut decisions concern different species and cuts.
- Exact repository searches found no prior Greenland-halibut steak form, matching form ID, focused proposal or batch, legacy candidate, or source-URL owner for the new product observations below. The open Section P checklist has no Greenland steak-form child beyond the parent row.

At review time the active package contained **1,805 ingredient references and 152 forms**. The ledger contained **2,173 records and 10,061 source links**. Existing source ownership was precise: `ingredient-ref-greenland-halibut` owned identity sources `WP04-P-GREENLAND-HALIBUT-20261012-S01` through `S06`; the Atlantic steak-form record owned the two reused OQLF cut entries `WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S01` and `S02`. At review time, R571 IDs `S01`–`S04` and form ID `ingredient-form-greenland-halibut-steak` were unallocated. No duplicate source URL was found in the ledger for the new R571 product pages.

The Greenland parent remains `PROTEIN`, has no English aliases, French alias `flétan noir`, null default density, and empty unit mappings. Do not add `turbot`, `Greenland turbot`, or `turbot du Groenland`: one Québec species page repeats `turbot` as a secondary name, but the existing OQLF/identity review boundary excludes those terms from the consumer-product alias set.

## Québec cut name and product evidence

The evidence establishes a named species and a possible cross-cut product form. It does not make package sizes reusable or imply that every Greenland-halibut product is sold as a steak.

| Proposal-local source ID | Source observation | Scope and limits |
|---|---|---|
| `WP04-SECTIONP-GREENLAND-HALIBUT-STEAK-R571-20261017-S01` | Mange ton Saint-Laurent, [Flétan du Groenland](https://mangetonsaintlaurent.com/especes/fletan-du-groenland/). Its page names *Reinhardtius hippoglossoides* and `flétan du Groenland`; it says the fish can be cut as filets, darnes, cubes, pavés, roasts, or medallions, and that it is most often sold as fillets. | Québec species guidance, last modified 2023-04-12. The cut list supports `darne` as a possible form for this species, not a current SKU, portion, or prevalence claim. The page also prints `turbot` as a secondary term; do not import that term because the existing OQLF consumer-name boundary keeps it out of the catalog aliases. Search-indexed content was available, but direct page opening returned HTTP 403. |
| `WP04-SECTIONP-GREENLAND-HALIBUT-STEAK-R571-20261017-S02` | OceanTaste, [HALIBUT STEAK VP 400G](https://oceantaste.ca/products/halibut-steak-vp-400g). The current English page explicitly calls it “Frozen Greenland Halibut Steak,” names *Reinhardtius hippoglossoides*, and describes thick cross-cut steaks in a 400 g vacuum pack. It says to keep the product frozen. | One Scarborough, Ontario retailer page; no item SKU or UPC was visible. The page amount is its own 400 g pack, not the weight of one steak, steak count, or standard recipe measure. It does not provide a paired French page. Its product descriptions and preparation suggestions are seller copy, not independent cooking-yield or substitution evidence. |
| `WP04-SECTIONP-GREENLAND-HALIBUT-STEAK-R571-20261017-S03` | Walmart, [Greenland Halibut Steak, item 6000200609470](https://www.walmart.ca/en/ip/greenland-halibut-steak/6000200609470) and its [French route](https://www.walmart.ca/fr/ip/Steak-de-fl-tan-du-Groenland/6000200609470). The English page lists a 400 g frozen item, SKU **6000200609470**, UPC **827510500420**, and reports it out of stock. | This is a distinct Walmart item, not OceanTaste’s page. Walmart’s English ingredient field says only `Halibut steak` and its page says supplier/third-party information is not independently verified; it gives no binomial. The older French search-indexed route for the same Walmart SKU uses `Steak de flétan du Groenland` / `Steak de poisson flétan`; direct opening required bot verification. This is a weak retail-language observation, not species verification or the preferred Québec form name; OQLF prefers `darne` and discourages `steak` in this sense. The paired language routes refer to one Walmart item and its 400 g package, not two products. Do not merge that package with OceanTaste’s separate 400 g page.
| `WP04-SECTIONP-GREENLAND-HALIBUT-STEAK-R571-20261017-S04` | Instacart’s T&T Supermarket listing, [Great Lake Greenland Halibut Steak](https://www.instacart.ca/store/t-t/products/17890966-great-lake-greenland-halibut-steak-454-g?guest=true), platform item **17890966**, listed as **454 g**. | A separate T&T marketplace listing, not the OceanTaste or Walmart item. It supplies a retail title and listing amount but no binomial, package state, cut anatomy, count, or manufacturer UPC. Its 454 g is listing-specific and cannot be pooled with either 400 g product. |

For the Québec French display, reuse ledger-owned terminology sources rather than adding duplicate source records:

- Reuse `WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S01`, OQLF [darne (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358741/darne), which defines the transverse raw fish cut and prefers `darne` over `steak de poisson` (entry updated 2025).
- Reuse `WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S02`, OQLF [darne de flétan (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298298/darne-de-fletan), which pairs `darne de flétan` with English `halibut steak`. This species-neutral entry dates to 1984 and does not identify Greenland halibut.
- Reuse parent-owned `WP04-P-GREENLAND-HALIBUT-20261012-S01` (OQLF [flétan du Groenland](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198640/fletan-du-groenland)) and `S02` (CFIA [Fish List lookup for *Reinhardtius hippoglossoides*](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&lang=e&q=Reinhardtius+hippoglossoides)). They establish the existing species/common-name boundary; they do not establish the cut or a retail SKU.

`darne de flétan du Groenland` is therefore a composed Québec display label based on the species and cut terms, not a verbatim label from the OceanTaste page or the Walmart item. The Walmart English/French route uses a different French phrase and does not override OQLF terminology or independently establish that its item is *R. hippoglossoides*.

## Integrated catalog and ledger delta

Add only the following cut form under the existing Greenland-halibut reference. The cut form does not encode frozen state: the frozen evidence belongs to specific retailer products, not the species-wide cut identity.

```json
{
  "id": "ingredient-form-greenland-halibut-steak",
  "ingredientRefId": "ingredient-ref-greenland-halibut",
  "formCode": "steak_cut",
  "labelEn": "Greenland halibut steak",
  "labelFr": "darne de flétan du Groenland",
  "prepState": "steak_cut",
  "matchTermsEn": [],
  "matchTermsFr": [],
  "densityGPerMl": null,
  "notesEn": "Species-qualified fish-cut form. The English product page explicitly names frozen Greenland halibut cross-cut steaks; Québec sources support darne as a halibut cut and identify darne as one possible cut for Greenland halibut. The French label composes established Québec cut and species terms; no R571 product source verifies it as a paired Québec product title. Retailer pack masses are SKU-specific and establish no mass per steak, count, or reusable portion. No density, unit mapping, conversion, yield, or substitution is established.",
  "notesFr": "Forme de coupe de poisson qualifiée par espèce. La fiche anglaise d’un produit nomme explicitement des darnes congelées de flétan du Groenland; les sources québécoises appuient darne comme coupe de flétan et indiquent cette coupe parmi les options pour le flétan du Groenland. Le libellé français combine les termes québécois établis pour la coupe et l’espèce; aucune source de R571 ne confirme ce libellé comme titre de produit québécois apparié. Les masses d’emballage des détaillants sont propres à chaque produit et n’établissent aucune masse par darne, aucun nombre de darnes ni aucune portion réutilisable. Aucune densité, correspondance d’unité, conversion, rendement ou substitution n’est établie.",
  "updatedAt": "2026-10-17T00:00:00Z"
}
```

The integrated form ledger row is scoped to `ingredient-form-greenland-halibut-steak`, with `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`. It reuses the Greenland parent’s OQLF/CFIA sources and the R545 OQLF cut sources; only R571 S01 and S02 directly support the form. R571 S03 and S04 remain proposal-local product observations because they do not independently verify the taxon or the Québec cut term. Parent identity states, aliases, density, unit mappings, and substitution findings remain unchanged.

## Picker projection

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized full word phrases are returned first, followed by substring matches only when no full phrase matches. Forms participate in parent-reference results; a form hint is returned only for an exact full form label.

| Query | Before R571 | After R571 | Form hint after |
|---|---|---|---|
| `Greenland halibut steak` | None | Greenland halibut | Yes |
| `darne de flétan du Groenland` | None | Greenland halibut | Yes |
| `halibut steak` | Atlantic + Pacific halibut | Atlantic + Greenland + Pacific halibut | No; shorter than the qualified form labels |
| `darne de flétan` | Atlantic + Pacific halibut | Atlantic + Greenland + Pacific halibut | No; shorter than the qualified form labels |
| `darne` | Atlantic + Pacific halibut | Atlantic + Greenland + Pacific halibut | No; broad cut query |
| `steak` | Atlantic halibut, Montreal steak spice, Pacific halibut, steak sauce | Those four plus Greenland halibut | No |
| `halibut` / `flétan` | Atlantic, Greenland, Pacific, and smoked Greenland halibut | Same four references | No |
| `Greenland halibut` / `flétan du Groenland` | Greenland halibut + smoked Greenland halibut | Same two references | No |
| `fish steak` | None | None | No |
| `turbot` | None | None | No |

The full species-qualified form queries identify Greenland halibut without claiming ownership of broad `halibut steak`, `darne de flétan`, or `darne` searches. Those generic cut queries now return all three halibut species represented with steak forms. No generic aliases or `matchTerms` were added; broad species and `turbot` behavior remains unchanged.

## Bundled demand, amounts, and substitution limits

A read-only scan followed every recipe path in the manifest (**114 files**) and all **1,123 structured `ingredients[]` rows**. It searched parsed recipe text and ingredient rows for `Greenland halibut`, `flétan du Groenland`, `flétan noir`, `darne de flétan`, `halibut steak`, and *Reinhardtius hippoglossoides*. It found **zero matching recipe files and zero matching ingredient rows**. No recipe link or recipe-line substitution is supported.

Package observations remain distinct:

- OceanTaste’s 400 g vacuum-pack product page gives a **package amount for that retailer page only**; it does not state the number of steaks or mass of one steak.
- Walmart SKU 6000200609470 is a different 400 g frozen listing with its own UPC 827510500420. Its metadata is supplier-provided, species-unverified, and out of stock at access time.
- Instacart/T&T item 17890966 is a separate 454 g listing. It is not the Walmart SKU or the OceanTaste page.
- None establishes a standard portion, mass-per-steak, density, volume conversion, package yield, cooking yield, or edible yield. The parent’s existing CNF observation for raw Greenland halibut (½ fillet = 204 g; Food Guide serving = 90 g; total refuse 64%) describes the CNF fillet/food record, not a darne. Do not transfer it. MAPAQ’s species-level 50–55 cm and 1–1.5 kg whole-fish profile is likewise not a cut measure.

The parent ledger records MAPAQ’s broad suggestion that Greenland halibut can substitute for Atlantic halibut, sole, haddock, cod, and plaice, but keeps it blocked because it lacks recipe role, method, preparation state, and replacement quantity. That note does not authorize steak-to-steak or cross-species substitution. Add no same-ingredient form conversion, contextual substitution, warning, or recipe link.

## Integrated result

Added only `ingredient-form-greenland-halibut-steak` under the existing `ingredient-ref-greenland-halibut`, with `steak_cut` form/preparation codes, bilingual species-qualified labels, empty match-term arrays, and null density. The new form ledger row uses R571 S01–S02 and reused OQLF/CFIA source ownership. The marketplace-language observations S03–S04 remain proposal-local. No parent alias, measurement, mapping, yield, conversion, recipe link, or substitution was added. The WP04 Section P finfish parent remains open, and existing R545/R557/R568 decisions remain intact.

The integrated form and ledger record do not change recipes, code, measures, conversions, yields, or substitutions. No app tests, build, emulator run, or deployment were needed for this database-JSON-only change.

## Source and audit limits

External sources were accessed on 2026-10-17. At review time, new R571 product-source IDs S01–S04 had no ledger owner. Integration registered S01–S02 on the new form record; S03–S04 remain proposal-local. The new sources do not duplicate the URLs of the reused identity or OQLF cut records.

| Source ID | Source | Evidence and limit |
|---|---|---|
| `WP04-SECTIONP-GREENLAND-HALIBUT-STEAK-R571-20261017-S01` | Mange ton Saint-Laurent, [Flétan du Groenland](https://mangetonsaintlaurent.com/especes/fletan-du-groenland/). | Québec species page identifies *R. hippoglossoides* and says the fish can be cut into darnes; it says fillets are the most common market form. Last modified 2023-04-12. Indexed text was available; direct open returned HTTP 403. Its secondary `turbot` wording is excluded from catalog aliases. |
| `WP04-SECTIONP-GREENLAND-HALIBUT-STEAK-R571-20261017-S02` | OceanTaste, [HALIBUT STEAK VP 400G](https://oceantaste.ca/products/halibut-steak-vp-400g). | Current retailer page explicitly identifies frozen Greenland halibut / *R. hippoglossoides*, cross-cut steaks and a vacuum-packed 400 g product. No SKU or UPC is shown; the mass is not per steak. One Ontario product page, not general market, cut-count, recipe, or yield evidence. |
| `WP04-SECTIONP-GREENLAND-HALIBUT-STEAK-R571-20261017-S03` | Walmart, [English item 6000200609470](https://www.walmart.ca/en/ip/greenland-halibut-steak/6000200609470) and [French route](https://www.walmart.ca/fr/ip/Steak-de-fl-tan-du-Groenland/6000200609470). | Paired retailer-language routes for one Walmart SKU/UPC and one 400 g package. English page is frozen and out of stock, but product ingredient data is only `Halibut steak` and Walmart disclaims independent verification of supplied details. French route is based on older indexed copy and was blocked on direct open. Excluded from taxon and preferred Québec terminology support. |
| `WP04-SECTIONP-GREENLAND-HALIBUT-STEAK-R571-20261017-S04` | Instacart/T&T, [Great Lake Greenland Halibut Steak](https://www.instacart.ca/store/t-t/products/17890966-great-lake-greenland-halibut-steak-454-g?guest=true). | Marketplace item ID 17890966, listed at 454 g. This is a separate listing, with no binomial, state, count, or cut details. Not pooled with either 400 g item. |
| Reuse `WP04-P-GREENLAND-HALIBUT-20261012-S01` and `S02` | OQLF, [flétan du Groenland (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198640/fletan-du-groenland); CFIA, [Fish List lookup](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=s&lang=e&q=Reinhardtius+hippoglossoides). | Already owned by the existing Greenland-halibut identity. OQLF supports the Québec species name and excludes `turbot` in the relevant consumer-product context; CFIA pairs the taxon and English/French fish names. Not cut or SKU evidence. |
| Reuse `WP04-SECTIONP-ATLANTIC-HALIBUT-STEAK-R545-20261017-S01` and `S02` | OQLF, [darne](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8358741/darne) and [darne de flétan](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2298298/darne-de-fletan). | Already owned by the Atlantic-halibut steak-form record. Supports Québec cut terminology and a species-neutral halibut-cut expression; it does not identify Greenland halibut. |
| R01 — repository audit, not a ledger source | Active reference/form JSON, legacy candidates, research ledger, plan, proposal/batch archive, picker implementation, manifest and all bundled recipe files. | Workspace snapshot from 2026-10-17. Confirms source/identity ownership, exact picker projection, and the 114-file / 1,123-row recipe scan. |
