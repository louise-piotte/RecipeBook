# WP02 Section 04 B3 R132 — quinoa starch product-boundary review

- **Reviewed:** 2026-10-15.
- **Status:** proposal only; no active reference, ledger candidate, alias, or checklist change is proposed.
- **Checklist reference:** [`docs/RecipeBook-global-ingredient-catalog-plan.txt`](../../RecipeBook-global-ingredient-catalog-plan.txt), WP02 Section 04 B3, `[ ] Water-chestnut flour and other documented regional starches.` This review does not reopen the prior integrated or held candidates, including ginger-rhizome starch (R131).
- **Scope:** Food ingredient sold or developed under a quinoa-starch name, distinct from whole quinoa, quinoa flour, and starch naturally present in those products. The reviewed commercial descriptions do not establish one consistent scope for a Canadian/Québec pantry ingredient.
- **Proposal-local source-ID prefix:** `WP02-B3-QUINOA-STARCH-R132-20261015-S`. The prefix and S01–S09 were checked against the live ledger and WP02 proposal/batch archive before drafting; no collision was found. These IDs are proposal-local and are not ledger records.

## Recommendation

**Hold an active quinoa-starch reference and all aliases pending a current Canadian or Québec human-food product source that defines the product and supplies usable local product wording.** Primary research establishes quinoa starch as a distinct isolated material. Current non-Canadian ingredient suppliers also use the name, but their descriptions differ: one lists a powder as 77% native starch, while another describes a dry-fractionated starch-rich co-product. Neither establishes Canadian or Québec availability, and their public pages do not establish that both products share one catalog-level identity.

The Québec wording is also not settled as a product name. OQLF lists `quinoa` for *Chenopodium quinoa* and prefers `amidon` generally. From those component terms, **`amidon de quinoa` is a transparent French description**, but no product-specific OQLF entry or current Québec label was found. Do not present that construction as a validated fr-CA product name. Do not use `fécule de quinoa`: OQLF describes `fécule` more specifically for starch in tubers and underground plant parts, whereas this candidate is seed-derived.

### Proposed catalog and ledger delta

**None.** Do not add `ingredient-ref-quinoa-starch`, `candidate-quinoa-starch`, aliases, forms, measurements, density, unit mappings, recipe links, conversions, yields, or substitutions. No ID is reserved. This proposal does not edit the shared catalog, ledger, checklist, roadmap, or generated index.

## Product and Québec-name boundary

| Phrase or material | Decision | Evidence boundary |
|---|---|---|
| Isolated or starch-rich quinoa fraction | **Documented ingredient/research class; hold as an active pantry identity.** | Primary studies compare isolated quinoa starch with quinoa flour. Current non-Canadian supplier pages use `Quinoa Starch`, but describe different material scopes and do not establish a Canadian/Québec product specification. [S01–S04] |
| `quinoa starch` | **Do not add to the active picker yet.** | This is used for research material and in current international supplier listings. The reviewed Canadian/Québec sources establish quinoa grain and flour products, not a current standalone quinoa-starch ingredient. [S01–S04, S07–S09] |
| `amidon de quinoa` | **Transparent French construction only; do not activate.** | OQLF prefers `amidon` generally and lists `quinoa` as the French plant/food term for *Chenopodium quinoa*. Combining these terms is an inference, not a product-specific OQLF or Québec label attestation. [S05–S06] |
| `fécule de quinoa` | **Do not use.** | The OQLF note on `fécule` scopes it more specifically to starch in tubers or underground plant parts. The candidate source is quinoa seed. [S06] |
| Quinoa grain, dry/cooked; quinoa flours; flakes; puffed quinoa | **Keep current identities and forms unchanged.** | These products are separately named in the active catalog and Québec product sources; none establishes isolated starch. The local directory’s 30 g serving applies to one quinoa-flour SKU only. [S07–S08] |
| `quinoa powder`, `quinoa flour`, `farine de quinoa`, bare `quinoa` / `quinua` | **Do not transfer as starch aliases.** | The terms can resolve to whole seed, flour, or other quinoa products and do not identify extracted starch. [current catalog; S07–S08] |

Quinoa du Québec currently describes retail whole-grain quinoa and bulk grain for food-industry professionals. The Québec Food Directory lists a 700 g organic quinoa-flour product. These sources establish local grain and flour wording, not starch availability. The bounded Canadian/Québec search did not surface a current standalone food-grade quinoa-starch label or supplier listing. That is a bounded search result, not proof that no such product is sold. [S07–S08]

The Alberta Agriculture report is historical context only: in 2005 it described a patented quinoa-starch cream-substitute concept and stated that the technology had not been commercialized at that time. It cannot establish present-day availability or absence. [S09]

## Active catalog, archive, and picker audit

The live working-tree snapshot contains **1,482 ingredient references, 109 forms, 1,827 research-ledger records, 61 legacy-import candidates, 114 manifest-listed recipes, and 1,123 ingredient rows**. The workspace already has unrelated working-tree changes; these figures and checks describe the shared files read on 2026-10-15.

| Surface checked | Result |
|---|---|
| Active references | No row or alias owns `quinoa starch`, `isolated quinoa starch`, `starch from quinoa`, `amidon de quinoa`, or `fécule de quinoa`. Current quinoa-family references are `quinoa`, generic quinoa flour, black/red/white quinoa flour, roasted quinoa flour, quinoa flakes, and puffed quinoa. |
| Active forms | The quinoa reference has dry and cooked forms only. No form identifies extracted starch. |
| Legacy-import identities | No exact candidate name, alias, or `ingredient-ref-quinoa-starch` / `candidate-quinoa-starch` ID is present. |
| Research ledger | No quinoa-starch record, candidate, or decision owns the reviewed phrases or proposed IDs. The source-ID prefix is unused. |
| Proposal/batch archive | No focused quinoa-starch product-boundary decision or integration was found. Exact searches covered the proposed English and French phrases and candidate IDs. This is a bounded local archive search. |
| Checklist and roadmap | Section 04 B3 remains open. Existing entries cover other integrated or held candidates; this proposal selects quinoa starch without revisiting those decisions. |

The picker’s `IngredientReferenceSearchIndex` normalizes accents, punctuation, and case, prefers complete word-phrase matches, and then uses substring matching. A static projection over current reference and attached-form terms gives:

| Query | Current results | If a separately named row were ever accepted |
|---|---|---|
| `quinoa starch`; `isolated quinoa starch`; `amidon de quinoa`; `fécule de quinoa` | No result | A source-qualified canonical phrase would add one result; no alias is proposed now. |
| `quinoa` | Eight quinoa-family references | A new row with `quinoa` in its canonical names would join this already broad family query. |
| `quinoa flour`; `farine de quinoa` | Five quinoa-flour references | Unchanged if the candidate were kept source-qualified and separate. |
| `starch` | Existing starch-named results | A starch display would add another broad result; this review does not add it. |

No active reference, alias, form, legacy candidate, ledger record, or archive decision becomes an accidental exact owner because the hold adds no searchable term. Do not add generic `quinoa`, `quinua`, `starch`, `quinoa powder`, or flour wording as an alias if the candidate is reconsidered.

## Measures, forms, substitutions, and recipe demand

- **Numeric data:** APB Foods reports “77% native starch” and a 2 μm granule size for its named powder; these are supplier-specific composition/particle statements, not a household mass or volume measure. Jan et al. report lab extraction yields and a sample bulk density of 0.69 g/mL for their isolated starch. Those results are method- and sample-specific and do not establish a default density for a marketed Canadian ingredient. Queens Quinoa’s “~80%” figure describes co-product economics, not the ingredient’s starch percentage or a kitchen yield. Keep all of these out of active conversion data. [S01–S02, S04]
- **Forms:** Add none. The sources do not establish a consumer preparation-state family or conversion path. A powder or dry-fractionated ingredient listing is not by itself an `IngredientForm`.
- **Substitutions:** None supported. Supplier application claims and studies of viscosity, gel, swelling, and pasting behavior do not establish a recipe-tested ratio or a globally safe replacement for corn, potato, tapioca, or another starch. Add no global or contextual substitution.
- **Bundled recipes:** A full read-only scan of the 114 manifest-listed files and 1,123 ingredient rows found **zero** occurrences of `quinoa starch`, `isolated quinoa starch`, `starch from quinoa`, `amidon de quinoa`, or `fécule de quinoa`, and zero links to a quinoa-starch ID. One recipe contains cooked quinoa, linked to the existing quinoa reference and cooked form; it does not support a starch identity or relink.

## Source register

Web sources were checked on 2026-10-15. All IDs are local to this proposal and are not appended to the research ledger.

| ID | Source and locator | Supports and limits |
|---|---|---|
| **WP02-B3-QUINOA-STARCH-R132-20261015-S01** | APB Foods, [*Quinoa Starch*](https://apbfoods.com/product/quinoa-starch/), product page. | Current international ingredient listing names `Quinoa Starch`, describes powder and bakery/extruded/texturized/coating applications, and states 77% native starch with 2 μm granules. The page does not establish Canada/Québec availability, a consumer package, a Québec French name, or a household measure. |
| **WP02-B3-QUINOA-STARCH-R132-20261015-S02** | Queens Quinoa, [*Quinoa Protein & Starch for OEMs*](https://queensquinoa.com/ingredients.html), current product-development page. | India-based supplier describes a dry-fractionated, non-chemically modified quinoa-derived `starch-rich fraction`, with food applications and specifications available by enquiry. This is international B2B evidence; the public page does not provide a complete product composition or establish Canadian distribution. |
| **WP02-B3-QUINOA-STARCH-R132-20261015-S03** | Contreras-Jiménez, Torres-Vargas, and Rodríguez-García, [“Physicochemical characterization of quinoa (*Chenopodium quinoa*) flour and isolated starch”](https://pubmed.ncbi.nlm.nih.gov/31261014/), *Food Chemistry* 298 (2019), article 124982. | Primary study directly compares quinoa flour with isolated starch and characterizes their distinct composition and behavior. It establishes a research material, not a Canadian product, retail specification, recipe measure, or substitution. |
| **WP02-B3-QUINOA-STARCH-R132-20261015-S04** | Jan, Panesar, and Singh, [“Process standardization for isolation of quinoa starch and its characterization in comparison with other starches”](https://link.springer.com/article/10.1007/s11694-017-9574-6), *Journal of Food Measurement and Characterization* 11 (2017), 1919–1927; abstract. | Primary lab study reports extraction yields, granule diameter, and a sample bulk density of 0.69 g/mL. These values apply to its isolated research samples and process, not a general product or household conversion. |
| **WP02-B3-QUINOA-STARCH-R132-20261015-S05** | OQLF, [*quinoa* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26541613/quinoa), updated 2025. | Lists preferred Québec French `quinoa` and Latin *Chenopodium quinoa*. It names the plant/food source, not a starch product. |
| **WP02-B3-QUINOA-STARCH-R132-20261015-S06** | OQLF, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. | Prefers general `amidon` and describes `fécule` more specifically for starch in tubers or underground organs. It does not attest `amidon de quinoa` as a product name. |
| **WP02-B3-QUINOA-STARCH-R132-20261015-S07** | Gouvernement du Québec, [*Farine de Quinoa Biologique*](https://www.repertoirealimentsquebecois.gouv.qc.ca/Produit/Index/8223789), Québec Food Directory product record. | Current Québec record for a 700 g organic quinoa flour made by Moulin A. Coutu; its listed 30 g portion is for that flour SKU only. It supports a local flour/product boundary, not quinoa starch. |
| **WP02-B3-QUINOA-STARCH-R132-20261015-S08** | Quinoa du Québec, [*Nos produits en épicerie*](https://quinoaquebec.com/nosproduitepicerie). | Current local producer describes retail whole-grain quinoa and bulk grain for food-industry professionals. No starch product is listed on this page; the page is not an exhaustive supplier inventory. |
| **WP02-B3-QUINOA-STARCH-R132-20261015-S09** | Alberta Agriculture and Forestry, [*Quinoa … The Next Cinderella Crop for Alberta?*](https://www1.agric.gov.ab.ca/$department/deptdocs.nsf/all/afu9961/$FILE/quinoa_final_report_june_05.pdf), 2005, pp. 11–12 and 17. | Historical report discusses quinoa-starch research and says a patented cream-substitute concept had not been commercialized as of the report. This does not establish current availability or market absence. |

## Reconsideration criteria

1. Find a current Canadian or Québec human-food product or ingredient-supplier source that identifies the quinoa-starch product, its source/process, and whether it is purified starch or a starch-rich co-product.
2. Obtain the actual product specification or bilingual label; distinguish supplier-specific claims from class-wide measures or behavior.
3. Have an independent Québec terminology review assess the exact French product wording. Treat `amidon de quinoa` as a descriptive construction until that review or a product label supports it; keep `fécule de quinoa` out unless product-specific evidence changes the plant-part boundary.
4. If accepted later, recheck the candidate ID and alias ownership. Keep aliases, forms, density, mappings, recipe links, conversions, yields, and substitutions empty unless separate evidence supports each.
5. Keep WP02 Section 04 B3 open; this proposal does not complete the regional-starch checklist item.

No app, Gradle, unit, instrumentation, or emulator tests were run. This is a proposal-only documentation change with no database JSON change.
