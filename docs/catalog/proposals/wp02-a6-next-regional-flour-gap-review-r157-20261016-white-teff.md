# WP02 Section 04 A6 R157 — White teff flour identity boundary review

## Review record

- **Reviewed and sources checked:** 2026-10-16.
- **Status:** Proposal only. This review changes no shared catalog, forms, legacy identities, ledger, recipes, generated files, checklist, roadmap, or integration README.
- **Open checklist:** Continue the regional-grain-flour review under [Section 04 A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1452). The parent remains open after the integrated [R155 red-rice-flour decision](wp02-a6-next-regional-flour-gap-review-r155-20261015.md) and [R156 red-teff hold](wp02-a6-next-regional-flour-gap-review-r156-20261015.md).
- **Scope:** Current Canadian product wording for white teff flour and its unresolved relationship to the existing ivory-teff-flour identity.
- **Candidate ID checked but not allocated:** ingredient-ref-white-teff-flour.
- **Proposal-local source-ID prefix:** WP02-A6-WHITE-TEFF-FLOUR-R157-20261016-S01 through S03. Before drafting, the prefix and S01–S03 were absent from the live ledger source IDs and the proposal/batch archive. They remain proposal citations only because this review recommends a hold.

## Recommendation

**Hold white teff flour outside the active references and research ledger. Do not add it as an English alias to ingredient-ref-ivory-teff-flour, and do not create a separate white-teff-flour row yet.** Current Canadian listings show white teff flour as a real product name. A Toronto seller explicitly pairs “White” and “Ivory” for one product, while a Calgary own-label packer and the Winnipeg-based Azmera seller list separate white-flour products. The evidence does not establish whether those products share a stable catalog identity with Berhan’s Ontario-made Ivory Teff Flour or whether “white” is a broader source-specific color class. The recent red-teff review also shows that teff color wording can overlap across sellers and should not be normalized from the color adjective alone [S01–S03, A1, A2].

The English phrase white teff flour is source-attested in Canada. No standalone Québec flour listing or OQLF entry for farine de teff blanc was found. The Québec evidence reused from R150 uses teff ivoire within ingredient declarations, not a white-teff flour title. A French-language product page from France names farine complète de teff blanc, but its whole-grain qualifier and French-market context do not establish a Québec French display for an unqualified Canadian product [A2–A4]. Keep the existing ivory display farine de teff ivoire unchanged; do not add a French white alias or infer equivalence from the imperfect bilingual label on VANA Africa’s current white product.

Reopen this candidate if a Canadian producer or packer documents whether its white SKU is equivalent to Berhan’s ivory product and a Québec-facing source supports the French product wording. Until then, add no reference ID, alias, form, measure, density, unit mapping, conversion, yield, recipe link, or substitution.

## Product and naming boundary

| Candidate or nearby identity | Disposition | Evidence boundary |
|---|---|---|
| white teff flour / possible farine de teff blanc | Hold unallocated. | Current Canadian product pages establish the English product wording. They do not establish a shared identity with Berhan’s ivory product, a standard teff color taxonomy, or a Québec French term [S01–S03]. |
| ivory teff flour / farine de teff ivoire | Keep existing ingredient-ref-ivory-teff-flour unchanged. | R150 added this source-named Ontario product as an identity-only reference. Zula Market’s White/Ivory wording applies to its own listing; it does not prove that every white-teff product is the same product class [A1–A2]. |
| generic teff flour / farine de teff | Keep existing ingredient-ref-teff-flour unchanged. | Do not broaden the generic flour identity with a color alias or move an unqualified product into a color-qualified row. |
| brown teff flour / farine de teff brun | Keep existing ingredient-ref-brown-teff-flour unchanged. | R151’s Canadian brown product remains separate from generic and ivory flour. This review does not reopen it. |
| red teff flour | Keep held by the R156 boundary decision. | VANA’s red product and the conflicting red/brown seller terminology remain outside this review; no red phrase is added to any teff row [A3]. |
| teff grain / teff d’Abyssinie | Keep existing ingredient-ref-teff-grain unchanged. | Flour and grain are different identities. Do not attach white-teff-flour wording to the grain row. |
| farine complète de teff blanc | Do not use as a display or alias. | The reviewed source is a French-market whole-grain product. Its complete-grain qualifier is not established for the unqualified Canadian products [A3]. |
| VANA’s French bag wording | Do not use as a French alias. | VANA’s current catalogue says the French line printed on the white-teff sack reads FARINE DE FEFF ROUGE and that a label correction is pending. This is an acknowledged label error, not evidence for white or red French terminology [S01]. |

This review does not reopen the integrated generic, ivory, or brown teff flour references, the teff grain reference, or A7’s separate malted-teff-flour hold.

## Proposed catalog delta

There is no catalog or ledger delta. The candidate ID ingredient-ref-white-teff-flour is an audit placeholder only and remains unallocated. Neither white teff flour nor farine de teff blanc is proposed as an alias, display name, or active ledger identity.

If future evidence establishes a distinct identity, the likely category would be FLOUR_AND_STARCH; this review does not authorize that row or settle its bilingual display.

## Exact ownership, ID, archive, and picker audit

The read-only package snapshot contains **1,529 ingredient references, 119 ingredient forms, 61 legacy-import candidates, and 1,874 research-ledger records**. The ledger contains **7,944 source entries and 6,792 distinct source IDs**.

Exact phrase ownership was checked across reference IDs, names and aliases; form IDs, labels, and match terms; legacy candidate IDs, names, and aliases; and ledger record IDs. Search-key normalization follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase NFKD normalization, accent and ligature folding, punctuation-to-space conversion, and whitespace collapse.

| Exact normalized phrase or ID | Current owner or result |
|---|---|
| white teff flour; farine de teff blanc; teff blanc; teff white flour | No exact owner in active references, forms, legacy candidates, or ledger record IDs. |
| ingredient-ref-white-teff-flour | Absent from references, forms, all 61 legacy candidate IDs, and ledger record IDs. It remains an audit placeholder, not an allocated ID. |
| WP02-A6-WHITE-TEFF-FLOUR-R157-20261016-S | No matching live ledger source ID or earlier proposal/batch archive entry before this proposal. S01–S03 are proposal-local and are not registered in the ledger. |
| ivory teff flour; farine de teff ivoire | Exact owner: ingredient-ref-ivory-teff-flour. |
| teff flour; farine de teff | Exact generic owner: ingredient-ref-teff-flour; phrase search also returns ingredient-ref-ivory-teff-flour and ingredient-ref-brown-teff-flour. |
| teff | Exact display owner: ingredient-ref-teff-grain; phrase search also returns the generic, ivory, and brown flour references. |
| Teff forms | None of the 119 ingredient forms has a teff label or teff match term. |

The archive search found no focused white-teff-flour review, hold, or integration. R150 established the ivory-teff-flour identity without evaluating white as a synonym. R156 is the only recent A6 packet that discusses a white teff flour product: it cites a French-market sibling product named farine complète de teff blanc while reviewing red teff, and explicitly does not decide whether a white product belongs on the ivory row. That mention is not a white-teff decision or hold [A1, A3].

The static picker projection below follows phrase-first word matching and substring fallback from IngredientSearch.kt. It is a read-only projection over current references and forms, not runtime picker testing.

| Query | Current results | Projected results with this hold |
|---|---|---|
| white teff flour | None | None; no white alias or identity is added. |
| farine de teff blanc | None | None; no French phrase is added. |
| ivory teff flour; farine de teff ivoire | ingredient-ref-ivory-teff-flour | Unchanged. |
| teff flour; farine de teff | ingredient-ref-teff-flour, ingredient-ref-ivory-teff-flour, ingredient-ref-brown-teff-flour | Unchanged. |
| teff | ingredient-ref-teff-grain, ingredient-ref-teff-flour, ingredient-ref-ivory-teff-flour, ingredient-ref-brown-teff-flour | Unchanged. |

If the English alias were added later, white teff flour would resolve to the ivory row. This review does not recommend that route because current evidence does not establish that mapping across Canadian sellers. A separate identity would add another result to broad teff flour searches and would need its own supported Québec French name.

## Manifest-wide recipe and ingredient-row scan

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for white teff flour, farine de teff blanc, teff blanc, teff white flour, ivory teff flour, generic teff-flour wording, and the candidate and existing teff reference IDs. The scan found:

- zero recipe-file text hits for the white-teff candidate terms;
- zero ingredient-row text hits for the candidate or teff-flour terms;
- zero direct links to ingredient-ref-white-teff-flour, ingredient-ref-ivory-teff-flour, ingredient-ref-brown-teff-flour, ingredient-ref-teff-flour, or ingredient-ref-teff-grain.

No bundled recipe establishes demand, a recipe amount, or a catalog link. The manifest-ordered corpus snapshot is **753,928 bytes**, SHA-256 **0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143**. The fingerprint hashes each manifest-relative recipe path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

## Forms, measures, conversions, yields, and substitutions

- **Forms:** Add none. Plain white teff flour is reviewed as a possible product identity, not a preparation form. No teff-specific ingredient forms currently exist.
- **Measures and density:** VANA lists a 20 lb / 9.08 kg sack; Zula lists package variants; Afrikart lists Azmera’s 25 lb product. These are package quantities, not recipe measures or paired mass-volume observations [S01–S03]. Keep active density null and unit mappings empty.
- **Conversions and yields:** Do not infer a white-to-ivory, white-to-brown, grain-to-flour, or milling-yield conversion from product color or packaging.
- **Substitutions:** Product pages suggest baking and injera uses but provide no validated replacement ratio for the candidate. Add no global or contextual substitution.
- **Recipe links:** The manifest scan found no matching demand. Add no recipe link or quantity.

## Source register

New sources were checked on **2026-10-16**. S01–S03 use the unallocated proposal-local prefix shown above. Existing R150/R156 and OQLF sources are cited by reference and are not re-registered.

| ID | Source and locator | Supports and limits |
|---|---|---|
| **S01 — WP02-A6-WHITE-TEFF-FLOUR-R157-20261016-S01** | VANA Africa, [current Calgary catalogue](https://vanaafrica.ca/) and [wholesale catalogue](https://vanaafrica.ca/catalogue), White Teff Flour product entry and own-label details. | The current Canadian packer lists a distinct White Teff Flour product, separate from its Red Teff Flour, in 20 lb / 9.08 kg sacks. VANA says the teff is milled and bagged under its own label in Calgary and lists Ethiopia as origin. Its wholesale page reports that the French line on the white product currently reads FARINE DE FEFF ROUGE and is awaiting correction. This supports Canadian English product wording and documents why the French print cannot be trusted; it does not establish an ivory equivalence, a valid French name, or a reusable measure. |
| **S02 — WP02-A6-WHITE-TEFF-FLOUR-R157-20261016-S02** | Zula Market, [Mama White/Ivory Teff Flour](https://zulamarket.ca/products/mama-white-teff-flour), page title, description, and store location. | The Toronto seller uses “White/Ivory” in the same product title and says “Mama white (ivory) teff flour.” This is direct evidence that one Canadian listing treats the terms as alternate names for its product. The page showed sold out when checked; its package variants and standard 20 lb package are not recipe measures. The source does not define a universal teff color taxonomy or map all white products to Berhan’s Ontario-made ivory product. |
| **S03 — WP02-A6-WHITE-TEFF-FLOUR-R157-20261016-S03** | Afrikart, [Azmera White Teff Flour — 25 lb](https://global.afrikartt.com/product/azmera-white-teff-flour-25lb) and [Azmera vendor page](https://afrikartt.com/store/azmera). | The current marketplace listing names a 25 lb Azmera White Teff Flour SKU, describes it as milled from 100% whole-grain white teff, and gives Ethiopia as product origin. The vendor page identifies Azmera Inc in Winnipeg, Manitoba, while the marketplace says products ship from the United States. This is Canadian seller/vendor context with a cross-border fulfillment caveat, not direct evidence from the manufacturer or a Québec French label. The package weight is not a kitchen measure. |
| **A1 — reused R150 sources** | Ontario Made, [Berhan Grains Ivory Teff Flour](https://supportontariomade.ca/explore-products/5-lb-ivory-teff-flour), and source entries WP02-A6-IVORY-TEFF-FLOUR-R150-20261015-S01–S02 in the [R150 proposal](wp02-a6-next-regional-flour-gap-review-r150-20261015.md). | Establishes the existing Ontario-made Ivory Teff Flour identity and separate Brown Teff Flour sibling. R150 did not establish white as an alias or a standardized color class. Reuse the existing source IDs. |
| **A2 — reused R150 Québec sources** | Source entries WP02-A6-IVORY-TEFF-FLOUR-R150-20261015-S03–S04 in the [R150 proposal](wp02-a6-next-regional-flour-gap-review-r150-20261015.md): Boulangerie Merveilles sans Gluten and Super C product ingredient declarations. | Québec-facing French ingredient lists use teff ivoire and farine de teff d’ivoire à grains entiers. They are finished mixed products, not standalone flour packages, and do not attest farine de teff blanc. Do not duplicate the R150 sources. |
| **A3 — reused R156 source** | R156 source entry WP02-A6-RED-TEFF-FLOUR-R156-20261015-S03 in the [R156 proposal](wp02-a6-next-regional-flour-gap-review-r156-20261015.md), BHA, [Farine complète de teff rouge](https://bekele-ha.fr/produit/farine-complete-de-teff-rouge/), including its sibling white product listing. | The French-market page lists farine complète de teff blanc as a whole-grain sibling product. It is not a Canadian or Québec source and does not support removing complète or mapping the product to ivory. Reuse the R156 citation; do not allocate its source ID again. |
| **A4 — existing OQLF entry** | OQLF, [tef (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef), existing generic-teff source WP02-S90. | Defines the base cereal term and English teff. It does not define white teff flour or farine de teff blanc. Reuse the existing ledger source. |

## Proposal-local static checks

The live package, exact-ownership, source-ID, archive, picker, and manifest scans above are read-only. This proposal adds no shared data. No Gradle, unit, instrumentation, emulator, app, or deployment work is required for this proposal-only review.
