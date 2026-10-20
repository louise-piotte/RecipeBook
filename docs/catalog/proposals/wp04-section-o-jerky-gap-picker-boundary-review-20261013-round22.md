# WP04 Section O jerky identity and picker-boundary review — 2026-10-13 (round 22)

**Status:** Integrated on 2026-10-13 as unresolved, ledger-only `candidate-beef-jerky`; no active identity or alias was added. See the [R22 integration batch](../batches/wp02-wp03-wp04-round22-gap-review-integration-20261013/README.md).
**Scope:** The still-open named dried/cured-meat gap “jerky,” prioritizing beef jerky. This review does not reopen biltong, camelid charqui, Peruvian Amazon cecina, bresaola, or other regional dried-meat decisions.
**Disposition:** Keep a beef-jerky identity as an unallocated candidate only. Current English/French product wording and sources support a Québec-market beef-jerky concept, but a row named beef jerky necessarily makes a bare English query for jerky return only the beef item under the current picker. Official Québec product wording also documents jerky made from wild boar, and CFIA material lists jerky across other meat and poultry species. French naming is unsettled: OQLF favors charqui/charque and discourages jerky, while current Québec product listings use jerky de bœuf. Do not add a generic jerky alias, active reference, form, measure, recipe link, or substitution.

## Prior decisions and search boundary

The Section O dried/cured-meat item remains open. The prior cured-pork follow-up says no generic dried/cured-meat reference is supported by the regional products then catalogued and that other named dry-cured products require a source-scoped review. There is no earlier standalone beef-jerky proposal or candidate.

The existing product decisions set boundaries, not synonyms:

- The active biltong identity stays separate from generic beef jerky, charqui, and cecina; its proposal documents product variation and does not establish one universal formula [WP06 Africa integration].
- The active charqui identity is limited to the source-defined Peruvian camelid product. Its integration explicitly does not activate generic jerky or charque as aliases [WP06 charqui integration].
- Peruvian Amazon cecina remains a region-qualified smoked/dried family and does not own generic jerky or broad dried-meat terms [WP06 cecina identity review].
- The R21 bresaola review keeps bresaola separate from generic dry-cured beef and jerky.
- A prior Caribbean review routes Cuban tasajo for a separate meat-product review; tasajo is not treated as a jerky alias here.

The current active reference and form files contain no jerky or beef-jerky name or alias. No legacy identity candidate or package-yield record contains jerky. The ledger has no jerky candidate or measurement/substitution record; its only jerky mentions are the decisions that keep biltong, camelid charqui, and Peruvian Amazon cecina separate. The exact prior files are linked in Local evidence links below.

## Current snapshot and corpus audit

This review checked the current live reference, form, legacy-candidate, package-yield, recipe-manifest, and research-ledger files.

| Artifact | Snapshot |
|---|---:|
| Active ingredient references | 1,348 |
| Ingredient forms | 98 |
| Legacy identity candidates | 64 |
| Research-ledger records | 1,663 |
| Package-yield records | 1; none for jerky |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

The exact current picker query projection was reproduced from IngredientSearch.kt normalization and phrase-first matching, including reference names, aliases, and attached forms:

| Query | Current result |
|---|---|
| jerky | No result |
| beef jerky | No result |
| jerky de bœuf | No result |
| charqui | One result: the camelid-scoped charqui reference |
| charqui de bœuf | No result |
| charque | No result |
| viande séchée | One result: Peruvian Amazon cecina |

The manifest-listed recipe corpus was read directly. Its snapshot digest is 7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c. The 114 recipe files and 1,123 ingredient rows contain no occurrence of jerky, beef jerky, charqui, charque, biltong, cecina, or generic dried meat, and no recipe link, quantity, method note, or substitution request for these products. No recipe relink or recipe-level conversion is supported by the corpus.

## Québec naming and product boundary

The OQLF Grand dictionnaire terminologique entry for charqui describes dried meat, most often beef, pressed and salted, sometimes smoked, and presented in strips. It notes that charqui originally referred to llama meat, lists charqui and charque as preferred French terms, and identifies jerky as a discouraged English borrowing in French. In its English section, beef jerky, jerked beef, and chipped beef refer more specifically to beef-based charqui [S01]. This supports charqui as a French terminology direction, but the exact compound charqui de bœuf is not itself the entry’s preferred term and must remain provisional.

Current Québec sources use jerky de bœuf in product naming. The Québec government’s 2017 product notice names both JERKY DE BŒUF / BEEF JERKY and JERKY DE SANGLIER / WILD BOAR JERKY [S04]. A current Répertoire des aliments québécois listing also uses Jerky de boeuf for a local beef product; its ingredients are beef, salt, and spices, and its description says the seasoned beef is lightly dried while remaining moist with a semi-firm texture [S05]. Aliments du Québec lists a Québec-made Jerky de Bœuf product in 70 g and 1 kg packages [S06]. These are Québec-market terms and product examples, not a general definition or OQLF endorsement of jerky in French.

The species boundary is material. The MAPAQ product naming distinguishes beef from wild boar. CFIA’s Food Safety Supplemental Information glossary includes beef jerky as an example under ready-to-eat dried cured meat [S02]. A CFIA export categorization guideline lists jerky under dried-meat categories for beef, veal, pork, goat, and lamb, and separately under dried poultry [S03]. The latter is an export categorization document, not a Canadian recipe taxonomy, but together these sources show that the unqualified English term jerky is not reliably beef-specific.

The active charqui row is narrower than OQLF’s general terminology entry: it represents Peru’s defined camelid product. Do not broaden that row with beef jerky, wild-boar jerky, or generic jerky. Biltong, cecina, bresaola, tasajo, and Montréal smoked meat are likewise distinct named products or scopes, not interchangeable aliases. Nothing in the reviewed sources establishes one universal species, cut, seasoning, smoke level, moisture level, or process for all jerky products.

## Hypothetical picker projection and misselection risk

For boundary analysis only, I projected an unallocated beef-jerky candidate using English display beef jerky, provisional French display charqui de bœuf, and the local-market French wording jerky de bœuf as a possible search term. This is not a final bilingual label decision. The current picker normalizes accents and punctuation, searches both languages’ terms in either locale, and prefers complete word phrases before partial matching.

| Query | Current result | Hypothetical candidate result |
|---|---|---|
| jerky | No result | Beef jerky candidate only |
| beef jerky | No result | Beef jerky candidate only |
| jerky de bœuf / jerky de boeuf | No result | Beef jerky candidate only |
| charqui | Camelid charqui | Camelid charqui plus beef-jerky candidate |
| charqui de bœuf / charqui de boeuf | No result | Beef-jerky candidate only |
| charque | No result | No result unless separately selected as a search term |
| viande séchée | Peruvian Amazon cecina | Peruvian Amazon cecina |

The material ambiguity is the English query jerky: if the only active match were beef jerky, the picker would route a request for pork, poultry, wild-boar, goat, or another jerky product to the beef reference. This is not repaired by omitting a generic alias, because the English display beef jerky itself contains the full word jerky and phrase-first matching will return the candidate. The French term charqui has a second scope collision: a charqui de bœuf entry would appear alongside the existing camelid-specific charqui entry on a bare charqui query. The display qualifiers could distinguish those two results, but they do not resolve the broader English species routing.

Hold the active row until the catalog can represent jerky’s species variants or the picker can handle a broad query without routing it to one narrow species. Do not add jerky to the camelid charqui, biltong, or cecina aliases. Do not add charque as an alias solely because OQLF records it as a French variant; source and product scope would still need an exact policy decision.

## Forms, measurements, and substitutions

- **Forms:** None of the 98 active forms describes jerky. No forms should be inferred from retail package types or product textures.
- **Measurements:** No recipe in the bundled corpus calls for jerky. One Répertoire product record says the serving is 45 g per one jerky de boeuf, while its fields also list a 50 g net content. This internal product-record discrepancy is source-specific and does not establish a general piece weight [S05]. The Aliments du Québec 70 g and 1 kg values are package formats for one maker’s product, not serving measures or conversions [S06]. Do not add a generic count-to-weight, density, household measure, or package yield.
- **Substitutions:** No recipe context supports substituting jerky for biltong, charqui, cecina, bresaola, or another dried/cured meat. The reviewed sources provide no substitution amount, and the corpus has no recipe to scope a contextual rule to. Keep global and contextual substitution rules absent.

## Proposal-only candidate and disposition

If the coordinator wants a ledger entry to preserve this review, keep it unallocated as candidate-beef-jerky with identity state needing clarification. The following is a terminology candidate only, not an active ingredient reference:

- Proposed product scope: beef jerky as a source-named dried/seasoned beef product.
- English display candidate: beef jerky.
- French display candidate: charqui de bœuf, provisional; local product wording jerky de bœuf is attested but OQLF discourages jerky in French.
- Potential French search wording: jerky de bœuf, only if the catalog later accepts market-label aliases.
- Category if later approved: PROTEIN.
- No active ID, alias, form, measurement, density, unit mapping, package yield, conversion, substitution, or recipe link is recommended now.
- Measurement state if recorded: researched_no_supported_value. Keep the one maker’s product facts source-specific.
- Substitution state if recorded: researched_no_supported_substitute.

The R22 disposition is a hold on active integration, not a claim that beef jerky is absent from Québec commerce. Revisit after a family/variant model or search behavior can avoid making the beef item the sole result for an unqualified jerky query. Leave the broader Section O dried/cured-meat checklist open. No tests were run; this review changes documentation only.

## Source register

Sources were checked on 2026-10-13. Source IDs are proposal-local. The OQLF URL is already recorded in the ledger as WP06-SOUTHAM-20261009-S51 and WP06-CECINA-20261009-S10. The CFIA FSSI glossary URL is already recorded under WP03-HEMP-WHOLE-20261011-S04 for a different section of that page; those sources are reused without changing their earlier records. The other URLs below had no exact URL match in the current ledger.

| ID | Source | Evidence and limits |
|---|---|---|
| WP04-SECTION-O-JERKY-GAP-20261013-S01 | Office québécois de la langue française, [charqui — Grand dictionnaire terminologique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26542161/charqui), updated 2016 | Supports the French terms charqui and charque, marks jerky as discouraged in French, defines charqui as dried meat most often from beef, notes llama origins, and links English beef jerky to beef-based charqui. It does not prescribe the exact compound charqui de bœuf. Existing ledger source IDs are WP06-SOUTHAM-20261009-S51 and WP06-CECINA-20261009-S10. |
| WP04-SECTION-O-JERKY-GAP-20261013-S02 | Canadian Food Inspection Agency, [Food Safety Supplemental Information glossary of terms](https://inspection.canada.ca/en/about-cfia/my-cfia-account/user-guidance/supplemental-information-questionnaire/glossary-terms), RTE dried cured meat entry | Lists beef jerky as an example under the RTE dried cured meat category. Used only for product-class terminology, not preparation, storage, or home-processing advice. The same page URL is already in the ledger as WP03-HEMP-WHOLE-20261011-S04 for its seed entry. |
| WP04-SECTION-O-JERKY-GAP-20261013-S03 | Canadian Food Inspection Agency, [Annex G: Guideline on meat and poultry meat product categorization](https://inspection.canada.ca/en/exporting-food-plants-animals/food-exports/requirements-library/us-meat-and-poultry-products/annex-g), RTE dried meat and RTE dried poultry categories | Lists jerky across beef/veal/pork/goat/lamb and separately in dried poultry categories. This is an export categorization guideline, not a domestic culinary standard or recipe taxonomy. |
| WP04-SECTION-O-JERKY-GAP-20261013-S04 | Gouvernement du Québec / MAPAQ, [Avis de ne pas consommer de la viande séchée Jerky](https://www.quebec.ca/nouvelles/actualites/details/avis-de-ne-pas-consommer-de-la-viande-sechee-jerky-mise-en-garde-a-la-population), 2017-08-18 | Its product-name table uses JERKY DE BŒUF / BEEF JERKY and JERKY DE SANGLIER / WILD BOAR JERKY. Used only as evidence of Québec species-specific market wording; no safety conclusions are taken from the notice. |
| WP04-SECTION-O-JERKY-GAP-20261013-S05 | Répertoire des aliments québécois, [Jerky de boeuf — Les Fermes Valens](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8219588), product record updated 2026-07-07; underlying product data attributed to GS1 | Supports a current Québec product name, beef/salt/spices, a lightly dried and still-moist semi-firm product description, and a source-specific 45 g serving per one jerky. The same record lists 50 g net content, so its amount fields are not generalized. |
| WP04-SECTION-O-JERKY-GAP-20261013-S06 | Aliments du Québec, [Jerky de Bœuf — VériTable](https://alimentsduquebec.com/aliments-dici/viandes/jerky-de-boeuf-2), current product listing | Supports the Québec-market product name and Québec manufacture, with 70 g and 1 kg package formats. Does not support a serving weight, recipe conversion, ingredient list, or universal product specification. |

## Local evidence links

- [Section O plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3492)
- [Cured-pork follow-up](wp04-cured-pork-open-gap-followup-review-20261012.md)
- [Biltong integration](../batches/wp02-wp06-regional-flour-starch-africa-integration-20261010/README.md)
- [Charqui integration](../batches/wp06-charqui-identity-20261009/README.md)
- [Cecina identity review](wp06-cecina-boundary-review-20261009.md)
- [Round 21 bresaola review](wp04-section-o-bresaola-beef-product-gap-review-20261013-round21.md)
- [Caribbean review that routes tasajo to WP04](wp06-caribbean-spanish-cuisine-gap-sweep-20261011.md)
- [Live ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Live ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Live recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
- [Legacy identity candidates](../legacy-import-identities.v1.json)
- [Research ledger](../research-ledger.v1.json)
- [Picker search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)

