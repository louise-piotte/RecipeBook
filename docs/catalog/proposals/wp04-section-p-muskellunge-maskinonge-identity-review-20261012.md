# WP04 Section P — muskellunge / maskinongé identity review

- **Review and source-access date:** 2026-10-12.
- **Scope:** one species-scoped Québec freshwater fish identity; exact catalog ownership, search behavior, legal/product boundary, and recipe demand.
- **Disposition:** recommend an identity-only PROTEIN reference for muskellunge / maskinongé (*Esox masquinongy*). Use the paired primary names and the OQLF-supported English aliases muskie and musky. Add no forms, recipe links, measures, density, unit mappings, conversions, yields, or substitutions.
- **Change scope:** this proposal only. The shared catalog, ledger, recipes, plan, roadmap, generated files, and tests are not changed.

## Why this candidate remains open

Section P keeps its finfish and regional-fish parent item open. The existing Northern pike review mentions muskellunge only as a distinct neighboring species; it did not review or allocate this identity. A current exact-name search across the plan, proposal archive, batch archive, active references/forms, legacy candidates, and research ledger found no dedicated muskellunge review, hold, or catalog allocation.

This is one bounded taxon and naming decision. Do not use it to resolve broad pike, pickerel, or brochet wording, or other regional fish names.

## Candidate identity

| Field | Recommendation |
|---|---|
| Reference ID | ingredient-ref-muskellunge |
| Category | PROTEIN |
| English display | **muskellunge** |
| fr-CA display | **maskinongé** |
| English aliases | **muskie**, **musky** |
| French aliases | None |
| Species scope | *Esox masquinongy* |

OQLF prefers maskinongé in Québec and directly pairs it with muskellunge and *Esox masquinongy*. Its entry categorizes the fish under both ichthyology and edible fish, and lists muskie and musky among the English terms. CFIA’s Fish List independently pairs Muskellunge / Maskinongé with the same taxon. The current Québec species profile gives the same primary bilingual pair and taxon.

Do not add bare pike, pickerel, brochet, or other Esocidae names as aliases. Do not add Maski or requin d’eau douce from the government profile’s secondary-name list; the canonical Québec term is clear, and those names are unnecessary picker terms. OQLF also records maskinonge without the accent, which the app’s accent-folded search already matches to maskinongé; storing it again as an alias would be redundant. The less-used lunge and the additional spelling muskallunge are not proposed as aliases.

This identity says which fish a named ingredient refers to. It does not establish retail availability, authorize harvest or sale, or imply a prepared product. Québec prohibits buying or selling fish caught under a sport-fishing permit. A catalog identity must not be read as permission to source a sport-caught fish; any commercial product remains subject to applicable licensing and labeling rules. The CFIA name is labeling evidence, not proof that a maskinongé product is currently sold at a particular Québec retailer.

## Exact ownership and picker behavior

The live catalog at review time has a distinct active Northern pike reference for *Esox lucius*:

| Candidate phrase or key | Live owner |
|---|---|
| muskellunge, maskinongé / maskinonge, muskie, musky, lunge, muskallunge, Maski, requin d’eau douce, *Esox masquinongy* | No exact active reference, form, or legacy-candidate owner. |
| Proposed ID ingredient-ref-muskellunge | Unowned in active references, legacy candidate IDs, and ledger record IDs. |
| Northern pike / grand brochet, *Esox lucius* | Active owner ingredient-ref-northern-pike, category PROTEIN, no aliases, verified ledger identity. This is a different taxon. |
| Forms | No form label or match term has an exact candidate-name owner. The active Northern pike reference currently has no attached forms. |
| Research ledger | No muskellunge candidate or identity record exists. One source note on ingredient-ref-northern-pike says that *E. lucius* is distinct from muskellunge; it is a comparison, not a muskellunge allocation or candidate record. |

The search audit follows IngredientReferenceSearch.kt: Unicode NFKD and accent/punctuation folding, complete word-phrase matches across localized names and aliases first, with substring matching only if no phrase match exists. Form labels and form match terms can also return their parent ingredient.

| Query | Current result | Result if this proposal is integrated |
|---|---|---|
| muskellunge | No result | ingredient-ref-muskellunge |
| maskinongé or maskinonge | No result | ingredient-ref-muskellunge; the accentless query normalizes to the French display |
| muskie or musky | No result | ingredient-ref-muskellunge via the proposed aliases |
| pike or brochet | ingredient-ref-northern-pike | ingredient-ref-northern-pike only |
| *Esox masquinongy* | No result | No result; scientific names are not added as aliases |

The proposal preserves the existing short-query behavior: pike and brochet continue to return the species-qualified Northern pike row and do not return muskellunge. The exact candidate identity and alias terms produce a single species row.

## Recipe demand and links

All 114 recipe paths in the bundled manifest and all 1,123 ingredient rows were reviewed. A case-insensitive full-text scan of the parsed recipe JSON found zero matches for muskellunge, maskinongé/maskinonge, muskie, musky, lunge, muskallunge, Maski, requin d’eau douce, or *Esox masquinongy*. There is no matching recipe ingredient line and no recipe link or relink to propose.

Recipe 093’s generic “cooked meat or seafood, to taste” option is not species-specific demand. Fish sauce, fish stock, salmon, tuna, seafood, or another pike species also do not establish a muskellunge link.

## Forms, numbers, conversions, and substitutions

| Data area | Recommendation |
|---|---|
| Forms | Add none. The name sources establish a species identity, not fresh, frozen, whole, fillet, smoked, dried, salted, or canned product states. |
| Measurement, density, and unit mappings | Leave absent. No source supports a household measure, count, edible yield, package size, density, or unit mapping for a recipe ingredient. |
| Biological and regulatory numbers | Keep source-scoped only. OQLF gives a typical biological length of 70–120 cm; Québec’s species profile reports observed Québec sizes of 25–113 cm and notes that some fish exceed 1.5 m and 40 kg. These are biological observations, not kitchen measures. Current Québec sport rules set a 137 cm retention threshold in specified fishing zones and require whole or eviscerated fish there; this is a zone-specific harvest rule, not a catalog conversion or general species measure. |
| Consumption guidance | Keep out of recipe quantities. Québec’s health table recommends at most two meals per month for sport-caught maskinongé and defines one such meal as 230 g before cooking. This is source-specific health guidance, not a recipe serving default, package measure, or conversion basis. |
| Conversions and yields | Add none. There is no form pair, package basis, edible-yield observation, or product-specific conversion to support. |
| Substitutions | Add none. Northern pike and muskellunge are different species; related family, freshwater habitat, or cooking similarity does not establish interchangeability. No contextual dish/method source or recipe line supports a substitution. |
| Recipe links | Add none. The complete bundled recipe corpus has no exact candidate demand. |

## Refreshed package snapshot

Snapshot refreshed on 2026-10-12 after the American-smelt integration. Hashes cover exact file bytes. The recipe digest iterates the manifest’s recipeFiles in stored order and hashes each manifest-relative path, a NUL byte, the exact recipe bytes, and a NUL byte.

| Artifact | Count / kind | SHA-256 / digest |
|---|---:|---|
| ingredient-references.v1.json | 1,269 references | adb6080896bea039e290a96f8a739978edaa6c6be735efdb128abf10723056ce |
| ingredient-forms.v1.json | 94 forms | 55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b |
| legacy-import-identities.v1.json | 65 candidates | 7415fa4305ea2ed2b98f56d93cf36fc3d519e1d9b24c5dabe38ca2e3da723ff7 |
| research-ledger.v1.json | 1,577 records; 5,566 source entries; 4,602 distinct source IDs | d782590ca04ee42c40e3cd7896b8d75d6d3187b73b61f173997accb602d6634a |
| manifest.v1.json | 114 recipe paths | b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c |

At the final catalog-state audit, the proposal ID and source-ID prefix below were checked as unowned. Proposal-local source IDs are not ledger entries.

## Sources

| Source ID | Primary source | What it supports and limits |
|---|---|---|
| WP04-MUSKELLUNGE-IDENTITY-20261012-S01 | OQLF GDT, [maskinongé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8872761/maskinonge) | Preferred Québec French edible-fish term, English muskellunge, alternate English names, taxon *Esox masquinongy*, and biological length description. Its 2000 terminology entry is naming evidence, not retail or recipe evidence. |
| WP04-MUSKELLUNGE-IDENTITY-20261012-S02 | Gouvernement du Québec, [Maskinongé species profile](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/maskinonge) | Current (updated 2026-10-02) Québec species profile supplies the bilingual display pair and taxon, distinguishes the species from grand brochet, describes its Québec range and recreational fishing, and cautions that wild-fish consumption can present health risks. Biological sizes and weights are not cooking measures. |
| WP04-MUSKELLUNGE-IDENTITY-20261012-S03 | CFIA Fish List, [Muskellunge query](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Muskellunge) and [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Lists *E. masquinongy* with accepted Canadian labeling names Muskellunge / Maskinongé. Fish-label naming evidence; it does not establish Québec store availability or culinary equivalence. |
| WP04-MUSKELLUNGE-IDENTITY-20261012-S04 | Gouvernement du Québec, [Pêcher au Québec](https://www.quebec.ca/tourisme-loisirs-sport/activites-sportives-et-de-plein-air/peche-sportive/pecher-quebec), with current zone rules for [zone 7](https://www.quebec.ca/tourisme-loisirs-sport/activites-sportives-et-de-plein-air/peche-sportive/zones-periodes/zones-de-peche/zone-7) and [zone 25](https://www.quebec.ca/tourisme-loisirs-sport/activites-sportives-et-de-plein-air/peche-sportive/zones-periodes/zones-de-peche/zone-25) | Identifies muskellunge as a regulated sport-fishing species; the cited zones specify a 137 cm retention threshold and whole/eviscerated condition. The general page says fish caught with a sport permit cannot be bought or sold. These are fishing rules, not recipe data. |
| WP04-MUSKELLUNGE-IDENTITY-20261012-S05 | Gouvernement du Québec, [Recommandations concernant la consommation de poisson](https://www.quebec.ca/sante/alimentation/saines-habitudes-alimentaires/consommation-de-poisson-et-sante/recommandations) | Gives the sport-fish consumption limit of two meals per month and defines a meal as 230 g before cooking. Health guidance is not a recipe default or conversion. |
| WP04-MUSKELLUNGE-IDENTITY-20261012-S06 | Gouvernement du Québec, [Permis de pêche commerciale en eau douce](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/peches-aquaculture-commerciales/permis-peches-aquaculture-commerciales/permis-peche-commerciale-eau-douce) | Separates permitted commercial sale of fish from sale of recreational catch and explains that freshwater commercial fishing requires a permit. It does not establish current commercial availability of muskellunge. |

## Recommendation

Advance only ingredient-ref-muskellunge as an identity-only PROTEIN reference with the primary bilingual pair and English aliases muskie and musky. Preserve the species boundary from northern pike, keep any fishery, safety, package, and recipe quantities out of active conversion data, add no recipe link, and leave the wider Section P checklist open.
