# WP04 Section P R504 — snow-crab section / cluster product review

- **Review and source-access date:** 2026-10-17.
- **Open checklist:** WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6751)).
- **Gap selected:** the marketable snow-crab section/cluster assembly, explicitly left outside the generic crab-legs identity integrated in R450.
- **Recommendation:** add one identity-only `PROTEIN` reference for **snow crab sections / sections de crabe des neiges**, scoped to the section/cluster assembly. This is a product identity, not a *Chionoecetes* species identity. Keep the [R12 taxonomic hold](wp04-section-p-snow-crab-identity-boundary-review-20261012.md) unchanged.
- **Integration status:** Integrated on 2026-10-17 as documented in the [R504–R506 integration README](../batches/wp03-wp04-wp06-r504-r506-gap-review-integration-20261017/README.md).
- **Freshwater boundary:** keep the newly integrated [`freshwater crayfish / écrevisse d’eau douce`](wp04-section-p-crayfish-boundary-recheck-r501-20261017.md) identity separate. It is freshwater; this R504 product is marine. `crawfish` remains unassigned as decided in R501.
- **Proposal-local source IDs:** reuse the R450 and R99 live IDs and the R12 archive-only IDs listed below; the new source IDs use the unique prefix `WP04-SECTIONP-CRAB-SECTIONS-R504-20261017`.

## Decision

The live catalog has no reference, form, legacy candidate, or ledger record for snow-crab sections or clusters. The [R450 crab-legs proposal](wp04-section-p-crab-legs-product-boundary-review-r450-20261017.md) and [integration](../batches/wp04-section-p-crab-legs-identity-integration-r450-20261017/README.md) explicitly kept sections/clusters distinct: OQLF defines a section as five legs attached to part of the body/shoulder, making it a marketable assembly rather than another name for a loose crab leg. The current Québec sources also use this assembly as a human-food product. [R450 S03–S04; R12 S07; R504 S01–S04]

Add one bounded assembly identity, not the species identity held in the earlier R12 review. The OQLF species entry maps the Québec consumer name `crabe des neiges / snow crab` to *Chionoecetes opilio*, while the CFIA Fish List applies the same English and French snow-crab names to multiple *Chionoecetes* taxa. That collision still rules out a row claiming to identify *C. opilio* across the shared picker. The proposed row identifies the **section/cluster product** and carries no scientific name, species alias, or taxonomic claim. [R12 S01–S02; reused live CFIA R99 S01]

The display names necessarily contain `snow crab / crabe des neiges`. Phrase-first search will therefore return this row for those short queries. The result itself will display **snow crab sections / sections de crabe des neiges**, making the assembly boundary visible. No standalone `snow crab` or `crabe des neiges` alias is proposed. This is a deliberate, bounded product result; it does not reopen the species identity decision.

## Proposed identity-only delta

```json
{
  "id": "ingredient-ref-snow-crab-sections",
  "nameFr": "sections de crabe des neiges",
  "nameEn": "snow crab sections",
  "aliasesFr": [
    "section de crabe des neiges",
    "bouquet de pattes de crabe",
    "paquet de pattes de crabe"
  ],
  "aliasesEn": [
    "snow crab section",
    "snow crab cluster",
    "snow crab clusters"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

The bilingual display names follow current Québec product wording. OQLF supports the singular English `section`, and its food-product entry pairs `snow crab cluster` with the French terms `bouquet de pattes de crabe` and `paquet de pattes de crabe`. Add only those market-naming variants. Do not add `queen crab`, `crabe araignée`, *Chionoecetes opilio*, `crab leg(s)`, generic `crab section(s)`, or a bare `cluster` alias. Keep cooked/frozen, fresh, and any other seller-specific state out of the identity; no universal section form is established.

## Why this is a separate remaining gap

- **Crab legs:** `ingredient-ref-crab-legs` is the species-neutral edible leg cut (`crab legs / pattes de crabe`, with singular aliases). It does not include the shoulder attached to an intact five-leg section. R450 source IDs S03 and S04 already document the distinction but did not allocate the section product.
- **Crab meat:** `ingredient-ref-crab` is picked `crab meat / chair de crabe`, with canned and Jumbo Lump forms. Recipe `019#8` uses the Jumbo Lump form. Neither the meat reference nor those forms identify a section assembly.
- **Crab claws and prepared products:** `ingredient-ref-crab-claws`, `ingredient-ref-crab-cake`, and crab-flavoured pollock remain separate. None owns a section or cluster.
- **Taxon rows and held names:** active blue, Dungeness, Jonah, Northern stone, and stone crab references are not section identities. The prior snow-crab hold is taxonomic; it remains in force. No unqualified whole-crab identity is introduced here.
- **Crayfish:** the R501 freshwater-crayfish integration is a different crustacean and habitat. No crayfish or crawfish term is an alias for crab sections.
- **Other Section P coverage:** R450’s explicit exclusion left a real product boundary uncovered. Shrimp, prawn, lobster, and other crab preparations are outside this one-item review.

## Exact ownership and archive audit

The read-only snapshot for this review contains **1,783 references**, **143 forms**, **56 legacy candidates**, and **2,140 research-ledger records**. The live bundle has **114 manifest recipes and 1,123 ingredient rows**. Normalized exact names, aliases, form labels/match terms, candidate IDs, ledger record IDs, source IDs, and source URLs were checked for the candidate and its proposed terms.

| Existing owner or archive | Current boundary / exact audit result | R504 disposition |
|---|---|---|
| `ingredient-ref-crab-legs` | Active `crab legs / pattes de crabe`, aliases `crab leg` and `patte de crabe`. It has no section/cluster alias or child form. Its ledger record has `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`. | Keep unchanged. Its R450 sources establish that a section/cluster is a distinct assembly. |
| `ingredient-ref-crab` and `ingredient-form-crab-canned`, `ingredient-form-crab-jumbo-lump` | Picked crab meat, canned meat, and Jumbo Lump grade. No section identity. | Keep unchanged; do not relink recipe 019#8 or imply a meat yield. |
| `ingredient-ref-crab-claws`, `ingredient-ref-crab-cake`, crab-flavoured pollock | Intact claws, a prepared cake/croquette product, and pollock with crab flavouring. | Keep separate. |
| Blue, Dungeness, Jonah, Northern stone, and stone crab references | Existing market/taxon identities; none names or owns a snow-crab section. | No species-qualified alias or form is added to them. |
| `ingredient-ref-crayfish` | R501 freshwater identity `freshwater crayfish / écrevisse d’eau douce`; `crawfish` remains unassigned. | Keep separate from marine snow crab. |
| Legacy candidates | No exact candidate or normalized display/alias match for the proposed snow-crab-section names or IDs among all 56 candidates. | Add no legacy mapping. |
| Forms, measurements, and package yields | Only the two crab-meat forms are attached to `ingredient-ref-crab`. No snow-crab-section form, density, unit mapping, or package-yield row exists. | Add none. |
| Current substitution files | `substitution-rules.v1.json` and `contextual-substitution-rules.v1.json` are empty. No crab-section rule exists. | Add no global or contextual substitution. |
| [R12 snow-crab identity review](wp04-section-p-snow-crab-identity-boundary-review-20261012.md) and [hold integration](../batches/wp04-section-p-snow-crab-picker-hold-integration-20261012/README.md) | The archive holds a species-level `ingredient-ref-snow-crab` idea and has no active record. Its source IDs S01 (OQLF) and S07 (Mayrand) remain archive-only; the exact URLs have no current ledger owner. | Preserve the taxonomic hold. Reuse the archive source IDs only for the same exact URLs, with current access noted below. |
| [R450 crab-legs proposal](wp04-section-p-crab-legs-product-boundary-review-r450-20261017.md) and [integration](../batches/wp04-section-p-crab-legs-identity-integration-r450-20261017/README.md) | Explicitly states sections/clusters are outside `ingredient-ref-crab-legs`; its live ledger sources S03, S04, and S05 are already owned as listed below. | Treat the distinct assembly as the next gap; do not duplicate source IDs or change R450. |
| R504 candidate and source prefix | No active reference/form/candidate/ledger ID `ingredient-ref-snow-crab-sections`, `ingredient-form-snow-crab-sections`, or `candidate-snow-crab-sections`; no prior `R504` source prefix. | Reserve only in this proposal. Root owns any later ledger allocation. |

Exact live URL ownership was checked against the complete ledger: OQLF `section` and `bouquet` pages are owned by `ingredient-ref-crab-legs` under R450 S03/S04; the MAPAQ PDF is used by `ingredient-ref-crab-legs`, lobster, lobster claws, lobster meat, and Northern shrimp; the exact CFIA crab-query URL is currently owned by `ingredient-ref-stone-crab` under R99 S01. CFIA Fish List overview source ID R5 S04 is shared across 24 records; the complete owner list is in the source register. The reused OQLF snow-crab and Mayrand URLs have no live ledger owner. Each source ID below maps to one exact URL; reuse does not create a second ID for an already-owned URL.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word phrases are preferred, then partial matching is used. It combines current reference and attached form search terms; the prospective row has no forms.

| Query | Current picker | With proposed row |
|---|---|---|
| `snow crab`; `crabe des neiges`; `snow crab sections`; `snow crab section`; `snow crab cluster(s)` | No result | `ingredient-ref-snow-crab-sections` only, displayed with “sections” context. |
| `section de crabe des neiges`; `sections de crabe des neiges`; `bouquet de pattes de crabe`; `paquet de pattes de crabe`; `crab sections` | No result | `ingredient-ref-snow-crab-sections` only. |
| `crab legs` | `ingredient-ref-crab-legs` only | Unchanged. |
| `pattes de crabe` | `ingredient-ref-crab-legs` only | `ingredient-ref-crab-legs` and `ingredient-ref-snow-crab-sections`; the OQLF cluster alias contains this phrase, and the two displayed names distinguish cut from assembly. |
| `crab meat`; `chair de crabe` | `ingredient-ref-crab` only | Unchanged. |
| `crab`; `crabe` | Ten results: blue crab, crab meat, crab cake, crab claws, crab-flavoured pollock flakes, crab legs, Dungeness crab, Jonah crab, Northern stone crab, and stone crab. | Same ten plus the displayed snow-crab-sections product; remains multi-result. |
| `snow` | `ingredient-ref-snow-fungus` | Snow fungus and snow-crab sections. |
| `cluster` | No result | Snow-crab sections only. |
| `freshwater crayfish`; `écrevisse d’eau douce` | `ingredient-ref-crayfish` only | Unchanged. |
| `crawfish` | No result | Still no result. |

The short snow-crab phrases intentionally resolve to a visibly scoped sections result, not a species row. Bare-query picker behavior is a real consequence of phrase matching inside the display names, not a separate alias or a taxonomic claim. If the product display cannot remain visible in the picker, retain the R12 hold and defer this identity instead.

## Full manifest recipe scan

All **114** paths in the live manifest were parsed, covering **1,123** structured ingredient rows and **753,988** recipe-file bytes. Full recipe JSON and ingredient rows were scanned for `snow crab sections`, `snow-crab sections`, `cooked frozen snow crab`, `sections de crabe des neiges`, `section de crabe des neiges`, `snow crab cluster`, `crabe des neiges`, `bouquet de pattes de crabe`, and *Chionoecetes opilio*. There were **zero candidate phrase/taxon file hits and zero ingredient-row hits**. The scan fingerprint, computed over each manifest path plus NUL, exact recipe bytes plus NUL in manifest order, is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`.

Recipe 019 is the only recipe with a crab ingredient row: row **#8** is `1 lb jumbo lump crab meat`, linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. Its title and group label refer to crab balls, not snow-crab sections. No recipe link or relink is supported.

## Measures, forms, density, yields, and substitutions

- **Product evidence:** OQLF describes a five-leg section attached to the shoulder. Mayrand lists cooked/frozen SKU 53044 as approximately 1 kg per retail unit; the Super C indexed listing names cooked/frozen sections, shows approximately 175 g, and identifies *C. opilio*. Westmorland says its cooked sections are frozen in salted water and sorted by size grade. These are anatomical or seller/processor descriptions, not a standard piece weight or culinary conversion.
- **Consumer serving guidance:** IGA advises two or three sections at approximately 680 g per person for a meal, and one or one-and-a-half sections (340 g) for an appetizer. This is a retailer’s serving suggestion. It does not establish the mass of each section, a general count-to-mass conversion, or an edible-meat yield. Preserve it only as a source-specific observation if later useful; do not activate it as a reusable measure.
- **State/forms:** Sources show sections sold cooked/frozen and also describe fresh-season product. No universal raw/cooked/frozen form is supported. Add no form under the proposed row.
- **Density and unit mappings:** Add no density, `unitMappings`, count-to-mass rule, or volume mapping. Shell-and-meat proportion is not established.
- **Package yield and edible yield:** Add no package-yield record or shell-to-picked-meat yield. Do not interpret the Mayrand or Super C product weights as the mass of a standard section.
- **Substitutions:** Add no conversion or substitution among sections, generic crab legs, claws, picked crab meat, crab cakes, lobster, shrimp, or freshwater crayfish. The catalog has no source-backed quantitative or context-qualified equivalence.
- **Integrated:** one new `ingredient_reference` ledger record uses `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. No form, recipe link, yield, conversion, or active substitution was added.

## Source register and limits

Review/source access date is 2026-10-17. The live source IDs are reused with their existing URLs and owners. R12’s S01 and S07 appeared only in its archived proposal, not the live ledger; their IDs are reused for the same URLs and the product page was opened again for this review. R504-local IDs are new, and each maps to exactly one URL.

| Source ID | Exact URL | Ownership at review | Evidence used and limit |
|---|---|---|---|
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-S03** | [OQLF, section](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199044/section) | Live; `ingredient-ref-crab-legs` | Defines a section as five legs attached to part of the underside of the body/shoulder, calls it a marketable anatomical part, and says snow-crab legs are generally sold as a section. Updated 1998. Terminology/anatomy, not a kitchen measure. |
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-S04** | [OQLF, bouquet de pattes de crabe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18060893/bouquet-de-pattes-de-crabe) | Live; `ingredient-ref-crab-legs` | OQLF’s food-product entry (updated 1987) pairs `snow crab cluster` with preferred French terms `bouquet de pattes de crabe` and `paquet de pattes de crabe`. Terminology only. Direct open was a cache miss during this review; the indexed entry and existing R450 source record support the cited wording. |
| **WP04-SECTIONP-CRAB-LEGS-R450-20261017-S05** | [MAPAQ, Les crustacés du Québec (PDF)](https://cdn-contenu.quebec.ca/cdn-contenu/adm/min/agriculture-pecheries-alimentation/peche/FI_crustaces-quebec_MAPAQ.pdf) | Live; `ingredient-ref-crab-legs`, `ingredient-ref-lobster`, `ingredient-ref-lobster-claws`, `ingredient-ref-lobster-meat`, `ingredient-ref-northern-shrimp` | Identifies commercial snow-crab presentations including sections and other meat/cut formats. Publication date is not stated; pack grades are not household measures or yields. |
| **WP04-SECTIONP-STONE-CRAB-R99-20261014-S01** | [CFIA Fish List crab query](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab) | Live; `ingredient-ref-stone-crab` | The crab result list assigns snow-crab names to multiple *Chionoecetes* taxa. The list is Canadian labelling-name evidence (modified 2023-09-18), not a survey of products sold in Québec. |
| **WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S04** | [CFIA Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Live; shared by the 24 record IDs listed below | The overview says the Fish List gives common names acceptable for Canadian fish labels and corresponding scientific names/TSNs. Modified 2019-06-28. It explains the list’s purpose but does not display the crab-query results; the query itself could not be reopened through the browser during this review. |
| **WP04-SECTIONP-SNOW-CRAB-20261012-S01** | [OQLF, crabe des neiges](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198901/crabe-des-neiges) | Archive-only in the R12 proposal; no live ledger owner | Maps the Québec commercial species name to *C. opilio* and lists `snow crab`; last updated 2012. This is the species boundary preserved by R12, not evidence that the proposed section row is a species record. |
| **WP04-SECTIONP-SNOW-CRAB-20261012-S07** | [Mayrand, Section de crabe des neiges cuit et congelé, SKU 53044](https://mayrand.ca/fr/nos-produits/poissonnerie/fruit-de-mer/crabe/crabe-des-neiges-section-cg-53044) | Archive-only in the R12 proposal; no live ledger owner | Reopened for this review. The current listing uses singular `Section de crabe des neiges cuit et congelé` and an approximate 1 kg retail unit. Price, package weight, and listed store stock can change; no species is stated. |
| **WP04-SECTIONP-CRAB-SECTIONS-R504-20261017-S01** | [Westmorland Fisheries, crabe des neiges](https://westmorlandfisheries.ca/fr/produits/crabe-des-neiges) | New R504 ID; no live URL owner | Canadian processor page identifies its snow crab as *C. opilio* and says cooked sections are available in limited quantities, frozen in salted water, and sorted by grade. Supports one processor’s human-food product, not all taxa, current store inventory, or a common measure. |
| **WP04-SECTIONP-CRAB-SECTIONS-R504-20261017-S02** | [IGA, À la découverte du crabe des neiges](https://www.iga.ca/fr/articles/a_la_decouverte_du_crabe_des_neiges) | New R504 ID; no live URL owner | Québec consumer article says sections/pattes are sold cooked and frozen year-round, with fresh product in season and picked meat sold separately. Current retailer guidance, not a universal state/form definition. |
| **WP04-SECTIONP-CRAB-SECTIONS-R504-20261017-S03** | [IGA, Crabe des neiges](https://www.iga.ca/fr/articles/crabe_des_neiges) | New R504 ID; no live URL owner | Fishmonger article gives the meal/appetizer serving advice summarized above and describes sectioning. It is one retailer’s recommendation, not a reusable piece weight or recipe conversion. |
| **WP04-SECTIONP-CRAB-SECTIONS-R504-20261017-S04** | [Super C, Sections de crabe des neiges cuites surgelées, product 241306](https://www.superc.ca/allees/produits-surgeles/poissons-et-fruits-de-mer/crevettes-et-fruits-de-mer/sections-de-crabe-des-neiges-cuites-surgelees/p/241306) | New R504 ID; no live URL owner | The indexed Québec listing gives the cooked/frozen product name, SKU, approximate 175 g, and *C. opilio*; it was listed out of stock at crawl time. Direct retrieval returned HTTP 403, so no stock, label, ingredient, or package-content claim is inferred beyond indexed text. |

OQLF sources establish Québec terminology; the CFIA query’s already-recorded results establish the broader Canadian naming collision, and its overview page was reopened directly for current scope. The retailer and processor pages show current regional human-food formats. None supports interpreting all snow-crab-named foods as a single taxon, converting a section to a mass, or equating shell-on sections with picked crab meat. Product descriptions and inventory may change. The proposal does not use price or stock as identity evidence.

The live owner records for the shared CFIA Fish List overview source ID are `candidate-nile-tilapia`, `candidate-pacific-saury`, `ingredient-ref-atlantic-bluefin-tuna`, `ingredient-ref-atlantic-bonito`, `ingredient-ref-bay-scallop`, `ingredient-ref-black-bullhead`, `ingredient-ref-blue-crab`, `ingredient-ref-blue-swimming-crab`, `ingredient-ref-canned-trout`, `ingredient-ref-dungeness-crab`, `ingredient-ref-european-lobster`, `ingredient-ref-flounder-market-group`, `ingredient-ref-freshwater-drum`, `ingredient-ref-milkfish`, `ingredient-ref-ocean-pout`, `ingredient-ref-pacific-bluefin-tuna`, `ingredient-ref-pacific-oyster`, `ingredient-ref-red-drum`, `ingredient-ref-sauger`, `ingredient-ref-smoked-cod`, `ingredient-ref-smoked-trout`, `ingredient-ref-tilapia-fillets`, `ingredient-ref-white-perch`, and `ingredient-ref-whole-tilapia`. Each shares the same exact source ID-to-URL mapping; the URL does not have multiple source IDs in this proposal.

## Snapshot and review checks

| Asset | Current count/size | SHA-256 |
|---|---:|---|
| [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,783 references; 581,970 bytes | `239c64b203cb049a3e1182f9b713cdd7231c083a3f5a5ca1e4ef77783c8199bd` |
| [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 143 forms; 113,370 bytes | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json) | 56 candidates; 13,351 bytes | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| [`research-ledger.v1.json`](../research-ledger.v1.json) | 2,140 records / 9,808 source entries / 8,303 distinct IDs / 7,013 distinct URLs; 10,016,916 bytes | `2b8b6527045f0c3468cb604bc2b5c0741934a45a3e5a3b8090678a963ceb9950` |
| [`manifest.v1.json`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The recipe corpus scan and picker projection were read-only. This proposal changes documentation only. No tests, build, emulator, or deployment were run.

## Disposition

Recommend one bounded snow-crab section/cluster product identity with the terms above, no taxonomic assignment, and no measures, forms, yields, recipe links, conversions, or substitutions. Keep R12’s species-level hold, generic crab meat, generic crab legs, claws, and freshwater crayfish separate. Section P remains open.
