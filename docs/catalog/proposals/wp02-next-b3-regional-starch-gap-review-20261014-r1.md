# WP02 Section 04 B3 R1 — modified rice starch identity review

- **Reviewed:** 2026-10-14.
- **Status:** Accepted and integrated on 2026-10-14. The original research pass wrote only this proposal; see the root integration record at [WP02 Section 04 B3 — modified rice starch](../batches/wp02-b3-modified-rice-starch-identity-integration-20261014/README.md).
- **Open checklist item:** Section 04 B3 remains open at “Water-chestnut flour and other documented regional starches.”
- **Related completed checkpoint:** The rice-starch review added identity-only rice starch / amidon de riz and explicitly kept modified, pregelatinized, instant, and other functional grades out of its aliases and defaults, leaving a later source-backed identity review possible.
- **Scope:** One source-qualified food ingredient class, modified rice starch, distinct from ordinary rice starch and from the other plant-qualified modified starch references.
- **Recommendation:** Add identity-only modified rice starch / amidon de riz modifié. Keep aliases, forms, density, unit mappings, recipe links, conversions, yields, and substitutions empty.
- **Proposed source-ID prefix:** WP02-B3-MODIFIED-RICE-STARCH-R1-20261014. No collision was found in the current ledger or proposal/batch text.

## Why this is a distinct unfinished gap

The completed rice-starch boundary review says that modified and other named rice-starch grades should not be aliases or default behavior for ordinary rice starch; it leaves a later source-backed review open for any specific grade that warrants its own identity. This review advances that narrow follow-up under the still-open Section 04 B3 line. It does not reopen the accepted rice-starch identity or claim that all modified rice products share a grade or function.

A full-text search of current WP02 proposals and batch notes found no focused modified-rice-starch decision. The only previous exact mention is the prior rice-starch review’s instruction to keep modified grades out of its alias set. The current modified pea, corn, potato, and tapioca rows were checked as neighboring precedents; each is a different source-qualified starch. No review of those products is repeated here.

## Evidence and naming

CFIA’s incorporated common-name table distinguishes starch from modified starch: ordinary starch uses the plant name plus “starch,” while modified starch uses “modified” plus the plant name plus “starch.” The rule supports the source-qualified English display and a separate identity; it is not by itself an exact rice product listing or French translation. A current Québec manufacturer specification supplies the paired English/French ingredient wording, and a Canadian distributor identifies a food-grade modified rice starch product available in Canada. OQLF’s current entry prefers amidon as the general French term and reserves the more specific fécule sense for starch in tubers or underground plant organs. The exact French display is directly attested in Québec-facing product material, not inferred from OQLF alone. [S01–S05]

| Proposed field | Value |
|---|---|
| ID | ingredient-ref-modified-rice-starch |
| Category | FLOUR_AND_STARCH |
| English display | modified rice starch |
| Québec French display | amidon de riz modifié |
| English aliases | None |
| French aliases | None |
| Default density | null |
| Unit mappings | None |
| Forms | None |

Do not add modified starch, modified food starch, fécule de riz modifiée, modified waxy rice starch, pregelatinized rice starch, instant rice starch, product codes, or brand names as aliases. The ingredient names and product documentation do not establish these phrases as universal synonyms for this class. In particular, BENEO describes instant native rice starch as pre-cooked/pregelatinized with functionality similar to modified starches; functional similarity does not make it the same identity or justify an alias. Waxy, pre-cooked, cross-linked, acetylated, and other grade/process descriptions remain product-specific where a source gives them. [S06–S08]

Keep modified rice starch separate from:

- rice starch / amidon de riz, the existing unmodified/family-level starch reference;
- rice flour and its white, brown, glutinous, roasted, Mochiko, and Shiratamako identities;
- modified pea, corn, potato, and tapioca starch;
- a specific BENEO or other supplier SKU, modification process, function, or grade.

The product evidence establishes a useful catalog-level identity class, not a common modification chemistry or a universal functional specification. BENEO describes multiple modified rice-starch grades and separately describes native pre-cooked grades. Do not imply that one grade’s texture, freeze/thaw stability, acid stability, or recipe performance applies to every modified rice starch. [S05–S08]

## Current ownership and picker effects

The audit checked exact normalized display names and aliases across active references, form labels and match terms, legacy candidates, and research-ledger record IDs.

| Phrase | Current exact owner |
|---|---|
| modified rice starch | None |
| amidon de riz modifié | None |
| rice starch | ingredient-ref-rice-starch |
| amidon de riz | ingredient-ref-rice-starch |
| fécule de riz modifiée | None |
| modified starch | None |

The current ordinary rice-starch row has no aliases, no forms, null default density, and no unit mappings. The exact modified phrases have no owner among the 105 forms or 63 legacy candidates. The ledger has one verified ordinary rice-starch record and no modified-rice-starch reference or candidate record. No exact target ID exists in the active catalog.

The app’s phrase search checks normalized names and aliases and then falls back to substring matching ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Before a new row, exact searches for rice starch and amidon de riz return only the ordinary rice-starch row; exact searches for modified rice starch and amidon de riz modifié return no row. With the proposed displays, the qualified English and French phrases each return the new row alone. The broader rice starch and amidon de riz queries return both ordinary and modified rice starch. That two-result family query is expected and preserves both identities; it does not hide the current rice-starch result. The rice-flour query remains independent.

## Recipe demand and numeric evidence

The current bundled-library manifest at app/src/main/assets/seed/bundled-library/manifest.v1.json lists 114 recipe files. A scan of all recipe JSON text and ingredient rows found 1,123 ingredient rows and no match for modified rice starch, amidon de riz modifié, fécule de riz modifiée, REMYGEL, or the proposed ID. No recipe line is linked to the existing rice-starch row either. No bundled recipe link or recipe-driven alias is supported.

The reviewed sources give no household mass or volume measure, bulk density, volume-to-mass conversion, cooking yield, package yield, or transferable substitution ratio for this ingredient class:

- Quadra lists one Canada-available BENEO REMYGEL 652 DR-P SKU as a powder stabilizer derived from polished waxy broken rice. “Powder” is a physical form, not a measure or density. Its product description does not establish a value for all modified rice starches. [S05]
- The Québec Shish Taouk specification is for a complete prepared chicken product. Its 4.5 kg case quantity is the finished-food case size, not the amount or measure of modified rice starch. [S03]
- BENEO Technology Center’s pound-cake test formula lists modified rice starch at 3% w/w. This is one manufacturer formula’s ingredient proportion, not a household measure, density, ingredient conversion, yield, or substitution recommendation. It does not identify a retail grade that can stand for the whole class. The ledger schema has no formula-composition observation type, so preserve the 3% fact in the proposal/source record narrative rather than modeling it as a reusable numeric observation. [S08]
- BENEO’s application material describes different functions for named modified rice-starch grades. Those technical uses are not a tested equal-amount exchange with ordinary rice starch, another starch, or flour. No substitution finding or active rule is supported. [S06–S08]

Keep the proposed row’s defaultDensity null and unitMappings empty. Add no form, recipe link, conversion, package yield, global substitution, contextual substitution, or measured observation. The current substitution-rules and contextual-substitution-rules files contain zero rules; the only package-yield row concerns S&W canned black beans. The existing rice-starch ledger record remains unchanged with researched_no_supported_value and researched_no_supported_substitute.

## Current-state snapshot

Counts and hashes below were read from the following canonical files during this review:

| Surface | Current path | Count and SHA-256 |
|---|---|---|
| Ingredient references | app/src/main/assets/seed/bundled-library/ingredient-references.v1.json | 1,457 references; cb3f5edbd22b83558efc6c3c6011527d170df9c46bd5523f29273bdcb6fe50bd |
| Ingredient forms | app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json | 105 forms; 32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0 |
| Research ledger | docs/catalog/research-ledger.v1.json | 1,797 records / 7,363 source entries / 6,243 distinct source IDs; 68982051c6048c950440e436bb2716d3e09d25e1d64354c7d091038c6d268d68 |
| Legacy identities | docs/catalog/legacy-import-identities.v1.json | 63 candidates; a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb |
| Seed manifest | app/src/main/assets/seed/bundled-library/manifest.v1.json | 114 listed recipes; b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984 |
| Manifest-ordered recipe corpus | manifest-listed recipe files under app/src/main/assets/seed/bundled-library/recipes/ | 114 files / 1,123 ingredient rows / 753,928 bytes; 0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143 |

The corpus digest hashes each manifest-relative path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte in manifest order. The current related reference set is ingredient-ref-rice-starch plus ingredient-ref-modified-pea-starch, ingredient-ref-modified-corn-starch, ingredient-ref-modified-potato-starch, and ingredient-ref-modified-tapioca-starch. No row exists yet for modified rice starch.

## Recommended integration if accepted

1. Add one identity-only row to app/src/main/assets/seed/bundled-library/ingredient-references.v1.json with the fields above. Do not modify the existing ordinary rice-starch row.
2. Add an ingredient_reference record for ingredient-ref-modified-rice-starch to docs/catalog/research-ledger.v1.json, with identityState verified, measurementState researched_no_supported_value, and substitutionResearchState researched_no_supported_substitute. Register the sources below and the accepted decision. Add no measurement observation or substitution finding.
3. Add a focused checked subitem under the open Section 04 B3 checklist line, link this proposal and an integration README, and update the catalog review notes. Keep the broader B2/B3 parent open.
4. Normalize and validate the bundled seed package and refresh the generated catalog/index as required by the project workflow. This was proposal-only work; no app, unit, instrumentation, or emulator tests were run.

## Source register

| ID | Source and bounded evidence |
|---|---|
| S01 | Canadian Food Inspection Agency, [Common Names for Ingredients and Components](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components), current version last amended 2026-02-11, Table 1 items 20–21. The incorporated table defines the naming construction for ordinary and modified starch. It does not name rice specifically or supply French wording. |
| S02 | Office québécois de la langue française, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Prefers amidon as the general term and notes that fécule more specifically names starch in tubers or underground plant organs. It has no dedicated modified-rice-starch term. |
| S03 | Spécialités MB, [Shaved marinated Shish Taouk chicken — product specification, code 19036](https://specialitesmb.com/wp-content/uploads/2025/05/19036-Poulet-marine-emince-Shish-Taouk-Shaved-marinated-Shish-Taouk-chicken.pdf), Quebec-made product specification, last revision shown as 01-05-2023. The bilingual ingredient declarations use Amidon de riz modifié / Modified rice starch. The page gives a 4.5 kg case for the complete prepared product; no starch quantity or grade is stated. |
| S04 | Grace Foods, [Produits surgelés](https://gracefoods.ca/product/produits-surgeles/?lang=fr), current French-language manufacturer product page, accessed 2026-10-14. The 750 g jerk-wing ingredient declaration lists amidon de riz, farine de riz, and amidon de riz modifié as separate ingredients. It confirms product-label wording and distinction, not a standalone starch specification, amount, or grade. |
| S05 | Quadra, [REMYGEL 652 DR-P](https://www.quadragroup.store/fr-CA/products/remygel-652-dr-p), current Canada-available distributor listing for a BENEO food ingredient, accessed 2026-10-14. Names amidon de riz modifié, powder form, stabilizer function, product code F03842, and a waxy-polished-broken-rice source. It is one SKU and supplier listing, not a reusable measure or specification for the ingredient class. |
| S06 | BENEO, [Rice starches](https://www.beneo.com/human-nutrition/human-nutrition-products/specialty-rice-ingredients/rice-starches), manufacturer page, accessed 2026-10-14. Describes a portfolio of native and modified rice starches, pre-cooked grades, and different food applications. It says its instant native starch can have functionality similar to modified starch; this is functional comparison, not identity or alias evidence. |
| S07 | BENEO, [Applications & benefits: specialty rice ingredients](https://www.beneo.com/wp-content/uploads/2022/09/beneo-brochure-specialty-rice-ingredients-en-202209v7-web.pdf), 2022 manufacturer brochure, pp. 7, 9, and 11. Lists product-specific modified waxy and modified regular rice starch grades and application functions. These are product/grade observations, not generic substitutions or conversions. |
| S08 | BENEO Technology Center, [Pound Cake formula](https://www.beneo.com/wp-content/uploads/2019/10/beneo-btc-rec-bak166-gf-cake.pdf), manufacturer test formula, accessed 2026-10-14. Lists modified rice starch at 3% w/w in one gluten-free pound-cake formulation. This is a formula-specific proportion, not a transferable kitchen amount, substitution, density, or yield. |
