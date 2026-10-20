# WP03 Section F: chiwda/chivda as a poha alias or prepared snack (2026-10-12)

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Integrated hold and evidence refresh. No active catalog, form, recipe, or generated-index data changed; seven new source records and an accepted hold decision were added to the existing poha ledger record.
- **Scope:** One still-open regional term in the integrated flattened-rice (poha) family: whether bare `chiwda` / `chivda` should identify plain rice flakes or a prepared snack product.
- **Recommendation:** **Hold** bare `chiwda` and `chivda` as global aliases for flattened rice. Do not create a `GRAIN_AND_CEREAL` row for the prepared snack family: current Canadian products use the terms for multi-ingredient mixes whose cereal base can be poha or cornflakes. Keep the active poha identity, its existing aliases, and its thin/medium/thick forms unchanged. Add no new ID, alias, form, numeric behavior, recipe link, or substitution.
- **Checklist location:** The active Section F checklist says the common rice-flake synonyms are integrated while specialized regional terms remain open, and separately leaves regionally significant cereal mixes and preprocessed grains open ([plan lines 1865–1868](../../RecipeBook-global-ingredient-catalog-plan.txt#L1958), [plan line 1915](../../RecipeBook-global-ingredient-catalog-plan.txt#L2008); [plant-grains checklist](../batches/plant-grains-cereals.md#L139)).
- **Prior-review check:** This is a focused evidence refresh of an explicit hold, not a claim that chiwda was never reviewed. The poha integration cites CSIR's regional-name grouping and records that `chiwda` stays out of active aliases until its food/snack and regional scope is reviewed. No standalone proposal in the current proposal set reviews this term. This review adds current Canadian retail and bilingual recipe evidence without reopening the accepted plain-poha identity, common aliases, or grade forms.

## Package snapshot at proposal review

Hashes are SHA-256 over exact file bytes. The recipe-corpus digest hashes each manifest-relative path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order. All manifest recipe paths existed at review time.

| Artifact | Current count/state | SHA-256 or corpus digest |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,221 references; 108 `GRAIN_AND_CEREAL` | `dbbbae79b74064e4989ab0057e304598595895fa7ab14735a07720517dd055c0` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `manifest.v1.json` | 114 listed recipes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 recipe-file bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,522 records; 5,156 source entries; 4,219 distinct source IDs; 8 unit conversions | `a44a10bc8ec6c16f0fa0a47d0def0101025d59f89ca7af0faf687039c17e84f0` |
| Generated `BundledIngredientCatalog.kt` | 1,221 references | `f555aa8491addb6d95be3e6256c21a3b90d50d30af2561c8d242d6189e38bcff` |

This is a dated shared-worktree snapshot; recheck it before any later integration.

## Evidence and terminology boundary

There is evidence for both senses. The CSIR-CFTRI compendium groups chiwda with rice flakes, flaked rice, beaten rice, aval/avalakki, and poha as regional names. That supports a rice-flake synonym in some contexts, but is not a Canadian or Québec product label and does not establish one globally stable search meaning [S01].

Current Canadian usage also applies the spelling family to prepared snacks. The Canadian French Club House page presents *Poha Chivda* as a snack made with thick poha (flattened rice), peanuts, and curry leaves; its English counterpart describes the same named dish as a namkeen snack [S02]. Loblaws's French Canadian search results list Haldiram items as `Flocons de maïs chiwda` and `Chiwda aux flocons de maïs`; the matching English Zehrs listing calls the 150 g item `Cornflakes Chivda` and gives a multi-ingredient panel including cornflakes, potato, cashew, chickpea flour, peanuts, raisins, and seasonings [S03–S04]. Thus the same short term is used for a cornflake-based mixture, not only for plain rice flakes.

A current Canadian Cartly page titles a product `GG Roasted Poha Chiwda` and describes a snack made using thin flattened rice, peanuts, curry leaves, and seasoning; the listing is currently unavailable, so it supports naming and composition only [S05]. Walmart Canada's listing similarly presents roasted poha chiwda as a savory snack, under the retail title `Rice Flakes Roasted`; it was out of stock at review time, so no availability claim is made [S06]. The Nova Scotia Department of Agriculture includes `chivda` under its examples of sweets/snacks; this is an official Canadian classification example, not a Québec terminology ruling or complete definition [S07]. A Canadian Indian grocery's older article explicitly uses chiwda for flattened rice, confirming that the synonym sense is also present in Canadian English [S08].

The sources therefore do not support changing the active identity: the synonym sense exists, but Canadian product usage shows that the bare word also denotes ready-to-eat composite snacks and can name products based on other cereals. A global alias could make an ingredient search resolve a mixed snack when a recipe needs unseasoned flakes. The current package has no matching recipe demand to justify a recipe-specific allocation. Keep qualified names such as `flattened rice (poha)` and `rice flakes` available through their existing owner; leave the unqualified regional snack term unallocated until a future exact recipe context or a narrower product identity has a well-defined scope.

## Live ownership and full-recipe audit

The audit used the repository's `normalize_search_key` behavior over every reference name/alias, all form fields and match terms, all legacy candidates, serialized ledger strings, and all manifest-listed recipe files. Checked terms were the source-attested spellings and phrases `chiwda`, `chivda`, `poha chiwda`, `poha chivda`, `cornflake chiwda`, `cornflakes chivda`, `chiwda aux flocons de maïs`, and `flocons de maïs chiwda`, plus the existing rice-flake aliases for ownership context.

| Search surface | Result |
| --- | --- |
| Active references | No exact normalized-key owner for bare `chiwda` / `chivda` or the reviewed snack phrases. `ingredient-ref-flattened-rice-poha` owns `flattened rice (poha) / flocons de riz (poha)` and its existing aliases `beaten rice`, `flaked rice`, `rice flakes`, `riz aplati`, and `riz battu`. |
| Ingredient forms | No exact candidate phrase. The existing poha forms are thin, medium, and thick commercial rice flakes; none names a seasoned snack. |
| Legacy candidates | No exact candidate phrase or alias among 66 candidates. |
| Research ledger | No separate chiwda/chivda candidate allocation or identity record. The existing `ingredient-ref-flattened-rice-poha` record contains the earlier CSIR synonym evidence, a `Poha Chivda` recipe-source title, and the explicit decision to keep the bare term out pending this scope review. The reviewed candidate is therefore an existing hold, not a new ledger finding. |
| Manifest recipes | 0 exact or substring candidate-phrase hits across all 114 serialized recipe files. |
| Ingredient rows | 0 exact or substring hits across all 1,123 rows, including `ingredientName` and `originalText`. |

No bundled recipe needs a chiwda/chivda link, new form, quantity change, conversion, or substitution. This is a normalized-name/content audit, not a live picker-ranking test.

## Recommendation details

| Term or field | Disposition |
| --- | --- |
| Bare `chiwda` / `chivda` | Hold out of active flattened-rice aliases. Source evidence uses both a regional rice-flake sense and a prepared-snack sense. |
| `Poha Chivda` / `Poha Chiwda` | Treat current Canadian retail and recipe examples as prepared snack names containing poha; do not add them as forms or aliases for plain flakes. |
| `Cornflake Chivda` / French retailer wording | Keep as product-specific composite snack wording. Do not alias it to corn flakes, flattened rice, or another single cereal. |
| New ingredient reference | None. The proposal does not allocate the prepared-snack family to `GRAIN_AND_CEREAL` or another category. |
| Forms, quantities, density, mappings, conversions, and yields | None. Product panels and recipe compositions are not transferable measures or process defaults. |
| Recipe links and substitutions | None. The manifest contains no exact demand and no source establishes a global substitution. |

## Remaining Section F gaps

This disposition clarifies only the `chiwda/chivda` part of the regional poha-synonym question. The broader Section F checklist remains open, including:

- Unqualified farro and generic sushi rice; pearled hominy and pozole corn remain held, and generic grits/polenta and dried sweet corn remain unresolved.
- Other puffed-grain products, including candidates already held pending Québec product naming; remaining species-level millet/sorghum/fonio work; and exact dry/cooked forms only where recipe or measurement evidence calls for them.
- The broader regional cereal-mix and preprocessed-grain sweep, including additional cuisine-specific mixes and processing names; no generic cereal-mix identity is implied here.
- Independent Québec wording reviews and manufacturer-specific grade questions that remain open elsewhere in Section F.

## Proposal-local source register

These proposal-local IDs were unique to this review. S01 reuses the existing ledger source `WP03-S93`; S02–S08 are attached to the existing poha ledger record for this accepted hold. Sources were reviewed on 2026-10-12 except where a page's own publication date is stated.

| Source ID | Source and locator | Supports and limits |
| --- | --- | --- |
| `WP03-CHIWDA-SCOPE-20261012-S01` | Council of Scientific and Industrial Research, [Socially Relevant Technologies](https://www.csir.res.in/sites/default/files/2023-06/Compendium-of-Social-relevant-technologies-2.6.2021.pdf), CFTRI cereal-flakes entry, PDF pp. 52–53. | Groups chiwda with regional names for rice flakes. The source is useful counterevidence to a strict snack-only definition; it does not establish Canadian/Québec labeling or universal alias behavior. The same document is already recorded in the shared ledger as `WP03-S93`; this table uses a proposal-local ID only. |
| `WP03-CHIWDA-SCOPE-20261012-S02` | Club House Canada, [Poha Chivda (English)](https://www.clubhouse.ca/en-ca/recipes/snacks/poha-chivda) and [Poha Chivda (fr-CA)](https://www.clubhouse.ca/fr-ca/recettes/collations/poha-chivda), recipe introductions. | English and Canadian French pages describe a prepared snack using thick poha / riz aplati with peanuts and curry leaves. Supports bilingual recipe naming and component distinction, not a general definition for every regional use of chiwda. |
| `WP03-CHIWDA-SCOPE-20261012-S03` | Loblaws Canada, [Cornflakes Chivda search results (fr-CA)](https://www.loblaws.ca/fr/search?search-bar=cornflakes+chivda), Haldiram product titles. | Lists `Flocons de maïs chiwda` and `Chiwda aux flocons de maïs` products. Supports current Canadian French retail wording for cornflake-based chivda; the page is a search listing, not a Québec terminology authority or full ingredient panel. |
| `WP03-CHIWDA-SCOPE-20261012-S04` | Zehrs, [Haldiram Cornflakes Chivda, 150 g](https://www.zehrs.ca/en/cornflakes-chivda/p/20314667004_EA), product `20314667004_EA`. | English listing calls the product Cornflakes Chivda and gives a panel containing cornflakes plus other ingredients. It showed stock at one selected store; availability and composition can change, so only the displayed product example is used. |
| `WP03-CHIWDA-SCOPE-20261012-S05` | Cartly, [GG Roasted Poha Chiwda, 285 g](https://www.cartly.ca/products/gg-roasted-poha-chiwda-285g), product description and category. | Canadian retailer describes a savory snack using thin flattened rice, peanuts, curry leaves, and seasonings, and categorizes it under snacks/namkeen. The item was unavailable at review time; this supports the product name and ingredients only. |
| `WP03-CHIWDA-SCOPE-20261012-S06` | Walmart Canada, [Rice Flakes Roasted](https://www.walmart.ca/en/ip/Rice-Flakes-Roasted/6TGT8ZP6QZ2E), Garvi Gujarat product details. | Canadian listing presents roasted poha chiwda as a savory snack; it was out of stock. It supports retail naming and prepared-food context, not current availability or a generic serving. |
| `WP03-CHIWDA-SCOPE-20261012-S07` | Nova Scotia Department of Agriculture, [Temporary Food Service Event Notification Exemptions](https://www.novascotia.ca/sites/default/files/documents/1-4220/temporary-food-service-event-exemptions-en.pdf), p. 2, sweets/snacks examples. | Lists chivda among snack examples. Supports Canadian snack usage; the document is an event-exemption list, not a formal food identity or Québec naming source. |
| `WP03-CHIWDA-SCOPE-20261012-S08` | Singal's Indian Grocery, [Poha — The humble serving on your table](https://www.singals.ca/blogs/recipe/poha-the-humble-serving-on-your-table), posted 2021-03-22. | Canadian Indian-grocery article identifies flattened rice as chiwda and says the store ships in Canada. It supports the synonym sense in a Canadian context, but is older retailer-authored prose rather than a current bilingual label. |

## Review disposition

**Decision:** Hold bare `chiwda/chivda` out of the active flattened-rice alias list and leave prepared chiwda/chivda snacks without a global ingredient reference. Existing evidence supports both the rice-flake synonym sense and a current Canadian prepared-snack sense, including cornflake-based products represented in French Canadian retail. The active `flattened rice (poha)` row, its accepted aliases, and its three grade forms remain unchanged. The new Canadian sources and accepted hold decision are recorded on the existing poha ledger entry. No active catalog, recipe, generated-index, measurement, or runtime behavior changed.

## Integration status

- Root accepted the hold and recorded proposal sources S02–S08 plus the decision on
  `ingredient-ref-flattened-rice-poha`; source S01 reuses existing ledger source `WP03-S93`.
- No active reference, alias, form, recipe link, generated catalog, or numeric data changed.
- See `../batches/wp02-wp03-wp04-jowar-poha-langoustine-integration-20261012/README.md`.
