# WP04 Section P — scallop roe / corail de pétoncle product-boundary review (R211)

- **Review date:** 2026-10-16.
- **Open checklist items:** “Mussel, clam, oyster, cockle, and remaining shellfish identities; scallop is integrated below” and “Roe, tobiko, masago, salmon roe, bottarga, and caviar where recipes call for them” in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt).
- **Candidate:** detached scallop roe (gonad) / **corail de pétoncle**.
- **Disposition:** **Hold outside active references, forms, legacy mappings, and the research ledger.** MAPAQ and historical DFO material establish the scallop gonad as culinary `corail`, but the current Canadian examples found in this pass are whole or roe-on scallop products. I did not find a current Canadian or Québec retailer listing for extracted scallop roe sold by itself, and the bundled recipes do not request scallop or roe.
- **Data outcome:** This proposal only. No catalog, form, ledger, legacy-identity, recipe, plan, roadmap, or generated file changed.

## Scope and prior-work boundary

This review concerns the detached reproductive gonad sold as scallop roe or `corail`. It does not cover the adductor muscle sold as `scallop / pétoncle`, a whole scallop, a roe-on scallop product, dried scallop/conpoy, or Fumoir d’Antan’s smoked scallop product. It does not assign a species to the detached gonad.

The generic scallop row is already integrated as an identity-only adductor-muscle ingredient. Its review explicitly excluded separate roe and whole animals. Bay, Hokkaido, Icelandic, and sea scallop rows remain species- or market-qualified; the dried scallop and smoked scallop product remain separate. Nothing in this packet changes those scopes. [S01–S03; reused source IDs below]

The plan’s separate roe checklist already holds salmon roe and other roe products pending recipe demand. That is neighboring work, not an owner for scallop gonad. Keep scallop roe separate from fish roe/caviar and sea-urchin gonads (`uni`). The recent R207 dried-mussels hold is also unrelated; it preserves the unresolved generic mussel boundary and is not reopened here.

## Evidence and product boundary

MAPAQ describes the scallop muscle (or `noix`) as the most sought-after part and separately says the pink-orange or cream-colored `corail du pétoncle` is appreciated. Its listed living products are whole scallops with coral, and its 100 g nutrition panel is for `chair`; neither is evidence of a roe-only retail package. [S01]

OQLF defines Québec `pétoncle` as a marketable anatomical part: the adductor muscle, sometimes accompanied by coral, rather than the whole animal. CFIA’s Canadian scallop-meat standard requires that meat to be free of roe, gut, shell pieces, sand, and other extraneous material. These sources support keeping the muscle and gonad distinct. They do not establish a universal standalone roe product or claim that detached roe is inherently inedible. [S02–S03]

Current Québec-facing retailer evidence is for scallops with coral attached. Montréal fish market La Mer’s product page calls its Canadian item a live sea scallop in the shell with coral, farmed in Mahone Bay, Nova Scotia; it showed a six-unit format and was sold out when accessed. The page does not name a species or offer the coral separately. [S04]

T&T’s current indexed Canadian seafood listings include **Clear Ocean Frozen Cooked Scallop Roe-On (~227g)**. The direct category page was JavaScript-only when opened, so this verifies the retailer’s displayed product title, not current stock, species, package contents, or a detached-roe fraction. TFI Foods’ Ontario food-service scallop list separately names “Scallop Half Shell with Roe” and “Scallop Roe Off,” but no roe-only line. Both are evidence for roe-on/roe-off scallop presentations, not a standalone gonad identity. [S05–S06]

There is historical Québec commercialization evidence: a 1998 DFO report says the scallop gonad, also called `corail`, was commercially recovered and sold in 1997; it describes the findings of that period’s pilot work, including use of landed coral for spread. This establishes a distinct historical food product and French name, but cannot confirm a current retail category, stable species scope, or contemporary consumer label. [S07]

CFIA’s current import guidance distinguishes scallops with roe attached from the standard adductor-meat product, for which roe and viscera are removed. This is a product-boundary and import-rule source; it is not a substitute for product-specific safety requirements and does not establish that roe-only products are exempt from regulation. Do not infer general safety or preparation advice for roe from this identity review. [S08]

## Exact ownership and prior-review audit

At the 2026-10-16 snapshot, the live catalog has **1,595 references**, **122 forms**, the legacy-import file has **61 candidates**, and the research ledger has **1,940 records**. The exact normalized candidate keys checked were `scallop roe`, `scallop gonad`, `roe-on scallop`, `corail de pétoncle`, `corail du pétoncle`, `gonade de pétoncle`, and `pétoncle avec corail`. None is owned by an active reference or alias, attached form or match term, legacy-import identity, or dedicated ledger record. The proposed ID `ingredient-ref-scallop-roe` is also unowned.

The ledger has the integrated `ingredient-ref-scallop` and its species/product neighbors; its accepted scallop decision excludes separate roe. Existing mentions of `scallop roe` in the generic scallop and smoked-scallop reviews are exclusion boundaries, not a prior roe review. There is no dedicated scallop-roe proposal or batch in the archive. The held ledger candidates `candidate-salmon-roe` and `candidate-sea-urchin-gonads-uni` name different products and are left unchanged.

Exact-URL search found existing ledger ownership for MAPAQ’s mollusk guide, OQLF’s `pétoncle` entry, and the CFIA identity standard; those source IDs are reused below. The exact URLs for La Mer, T&T, TFI Foods, the current CFIA import guidance, and the DFO report were not found in the ledger or proposal/batch archive. Source IDs assigned to those new sources below are local to this proposal and were not added to the ledger.

## Picker projection

The projection follows the phrase-first search in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), including attached forms. The held hypothetical display is `scallop roe / corail de pétoncle`, with no aliases or forms.

| Query | Current results | With hypothetical row | Effect |
|---|---:|---:|---|
| `scallop` | 6 | 7 | Adds the candidate alongside generic, named, dried, and species-qualified scallops. |
| `pétoncle` | 6 | 7 | Same expansion in the French search. |
| `scallop roe` | 0 | 1 | The qualified English query would identify the held row. |
| `corail de pétoncle` | 0 | 1 | The qualified French query would identify the held row. |
| `roe` | 1 | 1 | Today the partial-match fallback returns Greenland halibut through `Groenland`; phrase-first matching would instead return only `scallop roe`. Other roe products remain unrepresented, so this singleton would imply false completeness. |
| `corail` | 0 | 1 | A display containing bare `corail` would create a singleton from a generic query. |
| `roe-on scallop` | 0 | 0 | No alias is proposed; a roe-on scallop is not the detached gonad. |

Do not add bare `roe`, `corail`, or `roe-on` aliases. The exact French compound `corail de pétoncle` has historical and MAPAQ support, but that does not make bare `corail` a unique scallop term. The existing broad roe checklist remains open.

## Recipe demand, numerical limits, and substitutions

A manifest-ordered scan read all **114** recipe files and all **1,123** structured ingredient rows. It found zero candidate rows for scallop, pétoncle, roe, corail, gonade, `scallop roe`, or roe-on scallops. No recipe link or relink is supported.

No reviewed source gives a detached-roe mass, roe count, density, household measure, or scallop-to-roe yield. MAPAQ’s 100 g nutrition value describes scallop meat; its shell-size/count formats describe whole live scallops with coral. La Mer’s six units are whole shell-on scallops, and T&T’s approximately 227 g is the package size for its cooked roe-on scallop listing. These values cannot be converted into detached-roe quantity or an ingredient measure. DFO’s seasonal gonad-volume statement is biological/historical context, not a kitchen measure. Add no amount, density, unit mapping, conversion, or yield.

No source or bundled recipe supports replacing adductor meat with detached roe, replacing roe with a roe-on scallop package, or substituting scallop roe for fish roe/caviar, sea-urchin gonad, or another shellfish part. Add no global or contextual substitution, warning, or recipe-line link.

## Sources

Sources were checked online on 2026-10-16. Existing IDs are reused exactly where the URL is already in the ledger; R211-local source IDs are documentation only.

| Source | Evidence used and limit |
|---|---|
| **S01** MAPAQ, [Les mollusques du Québec](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_mollusques-quebec_MAPAQ.pdf). Reused `WP04-SECTIONP-SEA-SCALLOP-R89-20261013-S04`. | Calls the edible gonad `corail du pétoncle`, describes its color and culinary appreciation, and lists whole live scallops with coral. Its nutrition value is for `chair`; whole-product size/counts are not roe measures. |
| **S02** OQLF, [pétoncle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199062/petoncle). Reused `WP04-FRESH-SCALLOP-IDENTITY-20261012-S01`. | Defines the Québec marketed `pétoncle` as adductor muscle sometimes accompanied by coral; English equivalents include `scallop` and `scallop meat`. Entry last updated 1998; terminology, not a current SKU source. |
| **S03** CFIA, [Canadian Standards of Identity: Volume 3 — Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-3). Reused `WP04-FRESH-SCALLOP-IDENTITY-20261012-S04`. | Section 11 excludes roe from the standardized scallop-meat product. Last amended 2024-12-18; supports product separation, not roe-only composition or use. |
| `WP04-SECTIONP-SCALLOP-ROE-R211-20261016-S04` | CFIA, [Regulatory requirements: Fish](https://inspection.canada.ca/en/food-guidance-commodity/fish/regulatory-requirements), import requirements for live/raw scallops and roe-attached scallops. | Current Canadian import distinction; this review does not derive a standalone roe authorization or consumer safety conclusion from it. |
| `WP04-SECTIONP-SCALLOP-ROE-R211-20261016-S05` | Poissonnerie La Mer, [Pétoncle vivant canadien](https://www.lamer.ca/products/petoncle-vivant-canadien). | Current Montréal-facing listing for whole live Canadian shell-on scallops with coral; showed six units and sold out at access. No separate roe listing, binomial, or roe mass. |
| `WP04-SECTIONP-SCALLOP-ROE-R211-20261016-S06` | T&T Supermarket, [Shellfish & Squid listings](https://www.tntsupermarket.com/eng/product-categories/tt-meat-seafood/tt-shellfish-squid.html) and [French seafood listings](https://www.tntsupermarket.com/fr/product-categories/seafood.html). | Current indexed listings include Clear Ocean Frozen Cooked Scallop Roe-On (~227g). Direct category-page retrieval is JavaScript-only; no current stock or package-content claim is made. |
| `WP04-SECTIONP-SCALLOP-ROE-R211-20261016-S07` | TFI Foods Ltd., Scarborough, [Scallop food-service list](https://www.tfifoods.com/food-services/scallop.html). | The current catalog page lists half-shell scallop with roe and scallop roe-off, but not a roe-only item. Product details and availability are not supplied. |
| `WP04-SECTIONP-SCALLOP-ROE-R211-20261016-S08` | DFO, [Bilan du programme de recherche sur le pétoncle](https://publications.gc.ca/collections/collection_2007/dfo-mpo/Fs97-14-247-1998.pdf), 1998 report, pp. 54–57. | Historical Québec commercialization and naming: scallop gonad as `corail`, with reported recovery/sales in 1997 and pilot use for spread. Does not establish current retail naming or availability. |

**Recommendation:** Keep detached scallop roe / `corail de pétoncle` unallocated. Preserve the adductor scope of `ingredient-ref-scallop`, the existing species and prepared scallop rows, and the open roe checklist. Add no reference, alias, form, ledger record, measure, recipe link, conversion, yield, or substitution. Keep both Section P checklist items open.
