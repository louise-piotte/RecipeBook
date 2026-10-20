# WP04 Section P R486 — coconut shrimp identity review

- **Review and source-access date:** 2026-10-17.
- **Checklist fit:** The open WP04 Section P parent still calls for “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717)). This review proposes one prepared-shrimp identity under that open work.
- **Scope:** Review generic coconut shrimp / crevettes à la noix de coco as a named prepared product. Keep coconut butterfly shrimp, generic breaded shrimp, popcorn shrimp, shrimp tempura, species identities, preserved shrimp, shrimp pastes, and product bundles containing a separate sauce outside this identity.
- **Recommendation:** Add one identity-only `PROTEIN` reference for **coconut shrimp / crevettes à la noix de coco**, with one French singular search alias. Treat it as a species-neutral market product name, not a universal recipe or preparation standard. Add no form, measure, density, unit mapping, conversion, package yield, recipe link, or substitution.
- **Proposal-only status:** This packet is the only proposed file change. The shared references, forms, ledger, generated outputs, recipes, plan, roadmap, and batch records remain untouched.
- **Proposal-local IDs:** `WP04-SECTIONP-COCONUT-SHRIMP-R486-20261017-S01` through `S06`; `WP04-SECTIONP-COCONUT-SHRIMP-R486-20261017-R01` is the repository-audit label. These IDs have not been allocated in the shared ledger.

## Why this is a separate open gap

The [R441 coconut butterfly shrimp review](wp04-section-p-coconut-butterfly-shrimp-product-boundary-review-r441-20261017.md) added the separately named **coconut butterfly shrimp / crevettes papillon à la noix de coco** identity. It explicitly left generic `coconut shrimp` and `crevettes à la noix de coco` outside that row because Metro's frozen-seafood category shows coconut shrimp without the butterfly qualifier. The [R444 popcorn shrimp review](wp04-section-p-next-seafood-gap-review-r444-20261017.md) later reported the generic phrases as unmatched. Those records identify this boundary but do not own the generic product name or its direct product pages. [R441-S06; R444]

Current BlueWater manufacturer pages name **Coconut Shrimp** in English and **Crevette Coconut** in French, and describe shrimp coated with panko and coconut flakes. Metro Québec lists the same BlueWater 255 g product under the French plural **Crevettes à la noix de coco surgelées**. Metro also lists a separate 454 g coconut-shrimp item with sweet chili sauce; its ingredient declaration distinguishes the coconut shrimp from the accompanying sauce. This supports a searchable, species-neutral product identity while leaving each manufacturer's formula and sauce bundle product-specific. [S01–S06]

This is a product-name identity, not a generic form under all shrimp. It does not assert that every coconut shrimp is butterfly-cut, tail-on, breaded in the same way, frozen, cooked, species-specific, or sold with sauce.

## Proposed reference delta

Add only the following reference:

```json
{
  "id": "ingredient-ref-coconut-shrimp",
  "nameEn": "coconut shrimp",
  "nameFr": "crevettes à la noix de coco",
  "aliasesEn": [],
  "aliasesFr": ["crevette à la noix de coco"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "PROTEIN"
}
```

The French plural display follows Metro Québec's product title. The singular alias is a grammatical search variant of the attested noun phrase; the reused OQLF entry supports `crevette` as the preferred Québec French generic term for shrimp, but does not approve or define the full coconut product phrase. [S03, S05; reused `WP04-FRESH-SHRIMP-20261009-S01`]

Do not add `coconut shrimp with sweet chili sauce`, `coconut breaded shrimp`, a brand name, or a frozen-state variant as an alias. The first identifies a product bundle with a separate sauce; the second and frozen wording are details of particular listings, not stable shared product names. Do not add broad `shrimp`, `crevettes`, `coconut`, or `noix de coco` aliases.

## Ownership and collision audit

The live package snapshot has **1,760 ingredient references, 143 forms, 56 legacy candidates, and 2,119 research-ledger records**, with **9,674 source entries, 8,208 distinct source IDs, and 6,921 distinct source URLs**. Exact normalized checks covered reference keys, English/French display names and aliases, form IDs and terms, legacy-candidate keys, ledger record IDs/names, source IDs, and exact source URLs.

| Surface | Current ownership or evidence | R486 handling |
|---|---|---|
| Proposed identity and phrases | No exact active reference, form, legacy candidate, or dedicated ledger record owns `ingredient-ref-coconut-shrimp`, `coconut shrimp`/`coconut shrimps`, `crevettes à la noix de coco`, `crevette à la noix de coco`, `crevette coconut`, or the sauce-qualified phrase. The phrase `coconut shrimp` appears in R441 as an exclusion and in R444 as an unmatched query; neither is an identity allocation. | Propose one new identity row. Preserve those prior boundary notes as history; do not describe the phrase as absent from the archive. |
| Adjacent shrimp references | Active owners include R441 `ingredient-ref-coconut-butterfly-shrimp`, R459 `ingredient-ref-breaded-shrimp`, R444 `ingredient-ref-popcorn-shrimp`, R438 `ingredient-ref-breaded-butterfly-shrimp`, and separate canned, dried, Northern, cocktail, formed, and fermented shrimp products. | Keep all names and boundaries unchanged. Coconut coating does not make generic coconut shrimp a butterfly-shrimp alias or a form of plain breaded shrimp. |
| Nearby non-shrimp coconut references | Existing coconut identities cover coconut and other named coconut products. | Add no partial coconut term to those rows; only the full prepared-product name belongs on the proposed row. |
| Recent excluded decisions | [R483](wp04-section-p-next-seafood-review-r483-20261017.md) is a held fish-burger phrase; [R477](wp04-section-p-next-seafood-review-r477-20261017.md) reviews smoked Greenland halibut; [R480](wp04-section-p-lobster-meat-product-boundary-review-r480-20261017.md) reviews lobster meat. They do not own or qualify this shrimp product. Recent Section P decisions [R438](wp04-section-p-breaded-butterfly-shrimp-product-identity-review-r438-20261017.md), R441, R444, [R448](wp04-section-p-shrimp-tempura-product-boundary-review-r448-20261017.md), [R459](wp04-section-p-next-seafood-review-r459-20261017.md), and [R467](wp04-section-p-next-seafood-review-r467-20261017.md) cover other shrimp product or preparation boundaries and are retained as separate scopes. | No reopening or change to those reviews. The candidate specifically fills the generic coconut-shrimp boundary left out of R441 and seen unmatched by R444. |
| Measures, forms, yields, substitutions | The package-yield file contains one unrelated record; global and contextual substitution-rule files contain no active rules. No coconut-shrimp-specific form, yield, or substitution owner was found. | Add none. |
| New identifiers and source ownership | No current owner was found for the proposed reference ID or source-ID prefix. Each of the six product-page URLs in S01–S06 has zero exact URL owners in the live ledger. The reused category URL is already registered as R441-S06; the OQLF URL has existing registrations, including `WP04-FRESH-SHRIMP-20261009-S01`. | Keep S01–S06 local to this proposal until root review. Reuse the existing category and terminology IDs; do not register duplicate source entries or reassign IDs. |
| Proposal path | `docs/catalog/proposals/wp04-section-p-next-seafood-review-r486-20261017.md` did not exist before this review. | Use this one new proposal file only. |

The exact new source URL set is listed in Sources below. The reused Metro category page supplies only the already reviewed naming boundary, not a new source registration or formula claim. The OQLF source supports only the French headword `crevette`, not the complete product phrase.

## Picker projection

Projection follows the live accent-folding, punctuation-normalizing, phrase-first and substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It replays the current searchable names, aliases, and forms with the proposed row above.

| Query | Current results | With proposed row |
|---|---:|---:|
| `coconut shrimp`; `crevettes à la noix de coco`; `crevette à la noix de coco` | 0 | Proposed row only |
| `shrimp` | 9 | Same 9 plus proposed row (10) |
| `crevettes` | 13 | Same 13 plus proposed row (14) |
| `coconut`; `coco`; `noix de coco` | 14; 14; 9 | 15; 15; 10 |
| `coconut butterfly shrimp`; `crevettes papillon à la noix de coco` | R441 only | R441 only; unchanged |
| `breaded shrimp`; `crevettes panées` | R459 generic breaded-shrimp owner | Same owner; unchanged |
| `popcorn shrimp` | R444 popcorn-shrimp row | Same owner; unchanged |
| `coconut shrimp with sweet chili sauce` | 0 | 0; no sauce-specific alias is added |

Exact proposed product phrases select the new row alone. General `shrimp` and `crevettes` queries each gain one result, and generic coconut terms gain one result. No alias is added that would cause a collision with the R441 butterfly row or the R459 breaded-shrimp row.

## Manifest recipe-demand audit

The audit parsed **all 114 recipes in manifest order and all 1,123 structured ingredient rows**. The recipe files total 753,988 bytes. The manifest-ordered digest, computed over each manifest-relative path, a NUL byte, exact file bytes, and a trailing NUL byte, is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

Full recipe documents and ingredient rows were searched for `coconut shrimp`, `coconut shrimps`, `crevettes à la noix de coco`, `crevette à la noix de coco`, `crevette coconut`, `coconut shrimp with sweet chili sauce`, `coconut butterfly shrimp`, `crevettes papillon à la noix de coco`, `shrimp with coconut`, plus general `shrimp`/`crevette` terms. There were **zero candidate-containing recipe files and zero candidate ingredient rows**; no recipe ingredient row contains any shrimp/crevette term. No recipe link, relink, or recipe-derived amount is proposed.

The broader word `coconut` does occur in other recipe rows for coconut, coconut oil, coconut milk, or cream of coconut. These are unrelated baking or sauce ingredients, not a shrimp product request.

## Product-state, numeric, and substitution limits

- **Species and identity:** The reviewed product listings identify shrimp without establishing one shrimp species or taxon for the product category. Leave species unassigned. A product brand, SKU, or package is not part of the ingredient identity.
- **Forms and preparation:** Add no form. Panko, coconut flakes, breading, frozen retail presentation, and the accompanying sweet chili sauce are product-specific details. Do not infer universal tail state, butterfly cut, cooking readiness, coating composition, or a generic raw-to-cooked conversion.
- **Package quantities:** BlueWater's 255 g listing and the separate Metro 454 g sauce SKU are package masses for those products. They are not a serving, reusable measure, piece count, portion weight, density, package yield, or conversion. Add no numeric observation or active numeric field.
- **Substitutions:** Add no global or contextual substitution rule among coconut shrimp, plain shrimp, regular breaded shrimp, coconut butterfly shrimp, popcorn shrimp, tempura shrimp, fish, crab, or another seafood. Product-name similarity and shared shrimp content do not establish recipe- and method-scoped interchange.
- **Ledger if accepted:** Add one `ingredient_reference` record for `ingredient-ref-coconut-shrimp` with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: not_yet_researched`. Attach the six new product sources and any reused terminology/category sources under their existing IDs. Add no measurement observation, package-yield, form, conversion, substitution, or recipe-line record.

## Sources and limits

Pages were checked on 2026-10-17. Manufacturer and retailer product pages support the names and details of the listed SKUs. BlueWater's English and French pages are the same product; Metro's paired English/French pages for each UPC are the same retail product. The BlueWater and Irrésistible entries show more than one listing under the coconut-shrimp name, but do not establish one universal formula. Price, promotion, and store availability are not used.

| Source ID | Source and evidence | Limit |
|---|---|---|
| `WP04-SECTIONP-COCONUT-SHRIMP-R486-20261017-S01` | BlueWater, [Coconut Shrimp](https://www.bluewater.ca/en/products/coconut-shrimp/). Names Coconut Shrimp; describes panko and real coconut flakes; lists a 255 g package. | Manufacturer product facts, not a generic formula, species identification, or reusable amount. |
| `WP04-SECTIONP-COCONUT-SHRIMP-R486-20261017-S02` | BlueWater, [Crevette Coconut](https://www.bluewater.ca/fr/produits/coconut-shrimp/). French page for the same 255 g product as S01; its description mentions crispy panko breading and coconut flakes. | Same BlueWater product as S01, not an independent SKU or OQLF terminology decision. Its title does not establish the selected Québec French display by itself. |
| `WP04-SECTIONP-COCONUT-SHRIMP-R486-20261017-S03` | Metro, [BlueWater Frozen Coconut Shrimp](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/shrimp-seafood/frozen-coconut-shrimp/p/062218139699), product 062218139699, 255 g. | English retailer page for the same BlueWater product as S01/S02; package and frozen wording are SKU-specific. |
| `WP04-SECTIONP-COCONUT-SHRIMP-R486-20261017-S04` | Metro Québec, [BlueWater Crevettes à la noix de coco surgelées](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/crevette-a-la-noix-de-coco-surgelees/p/062218139699), product 062218139699, 255 g. | French retailer page paired with S03; supports the plural product wording, but is not a separate formulation or terminology authority. |
| `WP04-SECTIONP-COCONUT-SHRIMP-R486-20261017-S05` | Metro, [Irrésistible Frozen Coconut Shrimp with Sweet Chili Sauce](https://www.metro.ca/en/online-grocery/aisles/frozen/fish-seafood/shrimp-seafood/frozen-coconut-shrimp-with-sweet-chili-sauce/p/059749971478), product 059749971478, 454 g. Ingredient declaration separates the shrimp product from the sauce. | One product bundle with its own breading, sauce, ingredients, and package; not evidence that all coconut shrimp includes sauce or uses the same formula. |
| `WP04-SECTIONP-COCONUT-SHRIMP-R486-20261017-S06` | Metro Québec, [Irrésistible Crevettes à la noix de coco surgelées avec sauce chili douce](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/crevettes-a-la-noix-de-coco-surgelees-avec-sauce-chili-douce/p/059749971478), product 059749971478, 454 g. The product declaration distinguishes shrimp from sweet chili sauce. | French retailer page paired with S05; the sauce-qualified phrase remains excluded as an alias. |
| Reuse `WP04-FRESH-SHRIMP-20261009-S01` | OQLF, [crevette (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198913/crevette). Supports `crevette` as the preferred Québec French generic noun for shrimp. | Terminology for the base noun only; it does not establish the full phrase `crevette à la noix de coco` as an official term. Reuse this existing source ID, no duplicate registration. |
| Reuse `WP04-SECTIONP-COCONUT-BUTTERFLY-SHRIMP-R441-20261017-S06` | Metro Québec, [frozen seafood listings](https://www.metro.ca/epicerie-en-ligne/allees/produits-surgeles/poissons-et-fruits-de-mer). Shows coconut shrimp without the butterfly qualifier alongside other named frozen seafood items. | Category-level product-name boundary only; no formula, SKU, or product-state evidence. Reuse the existing source ID, no duplicate registration. |
| `WP04-SECTIONP-COCONUT-SHRIMP-R486-20261017-R01` | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6717), live references/forms/legacy candidates/ledger/yield and substitution data, recent Section P proposals, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and every manifest-listed recipe. | Records the workspace snapshot, exact owner/source collision review, picker projection, and full corpus scan. It does not extend claims about external products. |

## Disposition

Recommend adding identity-only **coconut shrimp / crevettes à la noix de coco** with only the display names and the French singular search alias shown above. Preserve coconut butterfly shrimp, plain breaded shrimp, popcorn shrimp, tempura shrimp, and all other shrimp preparations as separate identities. Keep the product species-neutral, and retain package, coating, state, and sauce information only as source-specific facts if they are useful in a future ledger review.

The full bundled recipe corpus has no shrimp/crevette demand, so this is a catalog-completeness proposal under the still-open Section P parent. No shared catalog, ledger, generated output, recipe, plan, roadmap, or integration file is changed by this proposal.
