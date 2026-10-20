# WP02 Section 04 A6 R155 — Red rice flour identity review

## Review record

- **Reviewed and sources checked:** 2026-10-15.
- **Status:** Proposal only. This review changes no shared catalog, form, legacy, ledger, recipe, checklist, roadmap, or generated file.
- **Open checklist:** Continue the A6 review of regional grain flours under [Section 04 A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1434). The parent remains open after R154.
- **Scope:** The unqualified, separately marketed red rice flour product name, kept distinct from edible red rice grain, red rice flakes, explicitly roasted red rice flour, and substrate/process-qualified Puttu podi products.
- **Proposed ID and source IDs:** **ingredient-ref-red-rice-flour**; **WP02-A6-RED-RICE-FLOUR-R155-20261015-S01** through **S07**. The proposed ID, exact names, and source-ID prefix were checked against live references, forms, legacy-import candidates, ledger records, and proposal/batch archive text. No collision was found. Existing source IDs are reused by reference, not reallocated.

## Recommendation

**Accept identity-only red rice flour / farine de riz rouge as ingredient-ref-red-rice-flour in FLOUR_AND_STARCH, with no aliases.** Current miller pages separately name red rice flour, including wholegrain red rice flour and a French-language product named Farine de Riz Rouge; the French JETRO/JFOODO directory also lists Farine de riz rouge. Canadian storefronts list Double Horse Red Rice Flour and Wijaya Red Rice Flour [S01–S06]. These support a named flour product, not a single cultivar, grade, process, or Québec-preferred term.

Use farine de riz rouge as the French display because current French manufacturer pages use that exact product wording, while the federal bilingual rice specification names the source grain riz rouge [S02–S04, A1]. OQLF defines the base term farine de riz but its note describes white or brown rice, not red rice; it does not approve the compound [A2]. A Canadian trademark goods list translates one named product, chemba puttu podi, as farine de riz rouge, but this is product-specific and not a terminology ruling [A3]. A Walmart marketplace item with the French title Farine de Riz Rouge Crue contradicts itself by saying the flour is made from 100% white rice, so it is not evidence for red-rice flour or a Québec label [S07]. Keep independent Québec French review open.

Do not add aliases, forms, density, unit mappings, measures, conversions, yields, recipe links, or active substitutions. Sources describe product uses and blending in qualitative terms; no source establishes a transferable amount or tested substitution. No manifest-listed recipe requests this ingredient.

## Product and naming boundary

| Material or wording | Decision | Evidence boundary |
|---|---|---|
| red rice flour / farine de riz rouge | Add one identity-only milling-product reference. | Current miller and product-directory pages name red rice flour; a Canadian retailer lists the same qualified English name. These sources do not define one cultivar or milling grade [S01–S06]. |
| red rice / riz rouge | Keep on existing ingredient-ref-red-rice. | The federal specification defines a red-coloured rice food class and gives the French term riz rouge. Flour is a milling product, not a grain alias or form [A1]. |
| roasted red rice flour / farine de riz rouge torréfiée | Keep the existing ingredient-ref-roasted-red-rice-flour unchanged. | Niru’s current Canadian manufacturer page names its roasted product. That source does not establish that the unqualified red rice flour name is a synonym or that every red rice flour is roasted [A4]. |
| red rice flakes / riz rouge aplati | Keep the existing ingredient-ref-red-rice-flakes unchanged. | This is a flattened grain product, not flour [A5]. |
| brown rice flour; generic rice flour; black rice flour | Keep their current references unchanged. | Shared rice substrate does not establish equivalence among these products. Red rice is not added as an alias to the brown or generic rice flour rows. |
| wholegrain red rice flour; farine de riz rouge complète | Do not add aliases or forms. | These are source-specific grade descriptions. Molino Peila describes a wholegrain product and Bongiovanni names a complete flour; they do not establish one grade for all red rice flour [S01, S03]. |
| chemba puttu podi; chemba arippodi; puttu maavu; red rice puttu flour | Keep out of the proposed aliases and preserve the existing unresolved Puttu-family boundary. | Canadian listings use substrate- and dish-qualified product names, and the CIPO French wording is limited to the named chemba puttu podi product. It is not evidence that every Puttu powder is plain red rice flour or that these names are aliases [A3, A6]. |
| red rice powder; red rice atta; farine de riz rouge grillée | Do not add aliases. | The reviewed product sources do not establish these as general names for the proposed row. The “grillée” wording belongs to a separate historical product listing and does not name this unqualified product [A7]. |
| red yeast rice; weedy red rice | Keep outside this food-flour identity. | Fermented red yeast rice and agronomic weedy-red-rice uses are different from the edible red-rice food products reviewed here [A1, A8]. |

This proposal does not reopen Section A4’s existing generic, white, brown, glutinous, Mochiko, and Shiratamako rice-flour decisions.

## Complete proposed reference delta

If accepted, append this one row to ingredient-references.v1.json; do not change any existing row.

~~~json
{
  "id": "ingredient-ref-red-rice-flour",
  "nameFr": "farine de riz rouge",
  "nameEn": "red rice flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
~~~

## Exact ownership, IDs, archive, and picker audit

The live read-only snapshot contains **1,526 ingredient references, 119 ingredient forms, 61 legacy-import candidates, and 1,871 research-ledger records**. The ledger has **7,921 source entries and 6,772 distinct source IDs**.

Exact phrase ownership was checked with the lowercase, NFKD accent-folding, punctuation removal, and whitespace normalization used by [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Phrase ownership includes reference names and aliases, form labels and match terms, legacy names and aliases, and ledger record IDs.

| Exact normalized phrase or ID | Current owner |
|---|---|
| red rice flour | None |
| farine de riz rouge | None |
| farine de riz rouge complète; wholegrain red rice flour | None |
| red rice powder; red rice atta | None |
| chemba puttu podi; chemba arippodi; puttu maavu | None |
| red rice; riz rouge | Exact display owner ingredient-ref-red-rice; phrase search also returns ingredient-ref-red-rice-flakes and ingredient-ref-roasted-red-rice-flour. |
| roasted red rice flour; farine de riz rouge torréfiée | ingredient-ref-roasted-red-rice-flour |
| ingredient-ref-red-rice-flour | Absent from references, forms, the 61 legacy IDs, and ledger record IDs. |
| Proposed prefix WP02-A6-RED-RICE-FLOUR-R155-20261015-S | No current ledger source ID or proposal/batch archive match. S01–S07 are unallocated. |

No focused review, hold, or integration for the unqualified red rice flour identity was found. The archive scan did find adjacent boundaries: the existing red-rice grain and red-rice-flakes reviews; the WP02 roasted-flour review and integration for Niru’s explicitly roasted product; the WP03 puttu-podi-family hold; and the R154 black-rice-flour review. R154’s JETRO source lists red rice flour alongside black rice flour but does not decide the red flour identity, source grain, French wording, catalog row, or boundary. The CIPO wording belongs to the held chemba puttu podi context. The newly integrated R154 black rice flour remains separate.

Existing ledger sources WP03-S129, WP02-S27, and WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S04 are reused only for their stated limits [A1–A3]. No new source ID is allocated to those sources.

This static picker projection follows phrase-first normalized matching over current references and forms plus the proposed row. It is not runtime picker testing.

| Query | Current result | Projected result if accepted |
|---|---|---|
| red rice flour | roasted red rice flour | red rice flour; roasted red rice flour |
| farine de riz rouge | farine de riz rouge torréfiée | farine de riz rouge; farine de riz rouge torréfiée |
| red rice; riz rouge | Red rice; red rice flakes; roasted red rice flour | Those three plus red rice flour |
| rice flour; farine de riz | Nine current rice-flour identities, including generic, brown, white, black, roasted-red, wild, glutinous, Mochiko, and Shiratamako | The same nine plus red rice flour |
| roasted red rice flour; farine de riz rouge torréfiée | roasted red rice flour | Unchanged |
| wholegrain red rice flour; farine de riz rouge complète | None | None; no source-specific grade alias is stored |
| red rice powder; red rice atta | None | None |
| chemba puttu podi; chemba arippodi; puttu maavu | None | None |

The red-rice and rice-flour queries gain an additional distinct flour choice. The new row has no aliases, and no grain, flake, roasted-flour, or Puttu-family row changes.

## Manifest-wide recipe and ingredient-row scan

The manifest lists **114 recipe files and 1,123 ingredient rows**. Every listed recipe file and ingredient row was scanned for red rice flour, farine de riz rouge, red rice powder, red rice atta, wholegrain/complete qualifiers, red rice, riz rouge, red-rice flakes, roasted red-rice flour, puttu/chemba variants, and the proposed/existing red-rice IDs. The scan found:

- zero full-file hits for the candidate and adjacent red-rice or Puttu terms;
- zero ingredient-row text hits;
- zero links to ingredient-ref-red-rice, ingredient-ref-red-rice-flakes, ingredient-ref-roasted-red-rice-flour, or ingredient-ref-red-rice-flour.

No bundled recipe creates demand for this row, amount, form, or recipe link. The manifest-ordered corpus snapshot was **753,928 bytes**, SHA-256 **0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143**. The fingerprint hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

## Forms, measures, density, unit mapping, conversion, yield, and substitution audit

- **Forms:** Add none. Flour is the named milling product itself, not a dry/cooked state of ingredient-ref-red-rice. The current 119 forms contain no red-rice-flour term or match term and no form is attached to ingredient-ref-red-rice or ingredient-ref-roasted-red-rice-flour.
- **Household measures and density:** No source gives a reusable mass-volume pair or kitchen measure. Molino Peila’s 25 kg and 1,000 kg packaging and Lakpura’s 1 kg pack are product/package sizes, not household measures [S01, S06]. Do not infer a cup or spoon measure.
- **Unit mappings:** Keep unitMappings empty.
- **Conversions and yields:** Add no grain-to-flour conversion, milling yield, cooking yield, edible yield, or package yield. No source quantifies a reusable mass-volume relationship or a yield.
- **Substitutions:** Add no active rule. Molino Peila describes bread/bakery use, Bongiovanni says its complete flour is used in bakery products mixed with wheat flour, and JETRO says a few percent may add a light purple color. None supplies a controlled recipe, a transferable percentage basis, or adjustments. Record these only as blocked, product-specific usage findings [S01, S03–S04].

## Source register

New sources were checked on 2026-10-15. New source IDs are local to this proposal and, if accepted, are added once to the new ledger record.

| Source ID | Source and locator | What it supports and does not support |
|---|---|---|
| **WP02-A6-RED-RICE-FLOUR-R155-20261015-S01** | Molino Peila SpA, [Red rice flour](https://www.molinopeila.it/en/products/riso/red-rice-flour), current manufacturer page. | Names wholegrain red rice flour, lists 100% wholegrain red rice flour as the ingredient, and describes bread/bakery use. Its 25 kg and 1,000 kg packaging is commercial packaging, not a household measure. It does not identify one cultivar, a universal grade, or a tested replacement ratio. |
| **WP02-A6-RED-RICE-FLOUR-R155-20261015-S02** | Riseria Provera, [Les Farines Biologiques et Conventionnelles](https://www.riseriaprovera.it/fr/les-farines-biologiques-et-conventionnelles/), French-language manufacturer page. | Uses the exact product heading Farine de Riz Rouge and describes it as special for pasta. The page does not identify a cultivar or a Québec product name, and it provides no recipe formula or amount. |
| **WP02-A6-RED-RICE-FLOUR-R155-20261015-S03** | Molino Bongiovanni, [French products catalogue](https://www.molinobongiovanni.com/files/ProductsCatalogVer1-FR.pdf), entry Farine de riz rouge complète. | Names a complete red rice flour, states that it is obtained by stone milling red rice, and describes use in sweet and savoury bakery products mixed with wheat flour. It gives no transferable ratio and does not establish that every red rice flour is complete or stone-milled. The catalogue also carries health claims that are not adopted here. |
| **WP02-A6-RED-RICE-FLOUR-R155-20261015-S04** | Japan Food Product Overseas Promotion Center / JETRO, [Farine de riz japonaise — product directory](https://japan-food.jetro.go.jp/riceflour/fr/brands/index.html), Greenpower Nanohana entry. | The current French-language directory lists Farine de riz rouge as a distinct manufacturer product and describes red rice as a kind of brown rice selected and air-flow crushed. It says a small percentage may color foods light purple, but gives no usable denominator, recipe, or tested substitution. |
| **WP02-A6-RED-RICE-FLOUR-R155-20261015-S05** | Motherland Grocery, [Products, page 31](https://toronto.motherlandgrocery.ca/collections/all?page=31), Toronto retailer listing. | The Canadian product list displays Double Horse Red Rice Flour (Chemba Arippodi) with a listed price. It supports a Canadian retailer’s use of the qualified English name; it does not establish current stock, product composition, or that Chemba Arippodi is a general alias. |
| **WP02-A6-RED-RICE-FLOUR-R155-20261015-S06** | Lakpura, [Wijaya Red Rice Flour (1 kg)](https://ca.lakpura.com/products/wijaya-red-rice-flour-1kg), Canada/CAD storefront. | The page names Wijaya Red Rice Flour and says it is made from cleaned and de-stoned red rice. The listing showed sold out; it supports a Canadian-targeted product listing, not current availability or a reusable measure. |
| **WP02-A6-RED-RICE-FLOUR-R155-20261015-S07** | Walmart Canada, [Farine de Riz Rouge Crue](https://www.walmart.ca/fr/ip/Farine-de-Riz-Rouge-Crue/20RP7K90Y3NM), third-party marketplace listing. | The title uses the French phrase but the indexed product details say the flour is made from 100% white rice. This internal contradiction is not used to support red-rice flour or Québec terminology; it is a misleading product listing boundary. The page’s 1 kg package is not a measure. |
| **WP03-S129** (reused) | Government of Canada, [Spécifications sur la qualité des aliments — Riz](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf), 2018-04-01, SQA-22-02, Riz rouge. | Defines the French grain term riz rouge for a red-coloured rice food class. It does not name red-rice flour or determine a Québec product label. Reopened on 2026-10-15; the existing source ID and original ledger date are retained. |
| **WP02-S27** (reused) | OQLF, [farine de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), GDT entry last updated 2025. | Defines the base term farine de riz. Its note says rice flour comes from white or brown rice; the entry does not name red-rice flour and does not approve farine de riz rouge. Reopened on 2026-10-15; the existing source ID and original ledger date are retained. |
| **WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S04** (reused) | Canadian Intellectual Property Office, [Journal des marques de commerce, vol. 72, no. 3685](https://publications.gc.ca/collections/collection_2025/opic-cipo/RG42-2-72-3685-fra.pdf), 2025-06-11, p. 334. | A goods list renders chemba puttu podi as nommément farine de riz rouge. This is Canadian French wording for one named Puttu product, not an OQLF/TERMIUM ruling or a general alias. Reused from the existing candidate-puttu-podi-family record. |
| **A4 — related existing source** | Niru Enterprise Inc., [Roasted Red Rice Flour](https://niru.com/product/roasted-red-rice-flour/), current manufacturer page. | Names its explicitly roasted product and describes finely milled red rice. This is the source basis for keeping the existing roasted-red identity distinct; it does not support an unqualified-product alias. See the [WP02 roasted-flour review](wp02-roasted-urid-mong-oat-rice-flour-review-20261010.md) and [integration notes](../batches/wp02-wp05-roasted-flour-preserved-condiment-followup-integration-20261010/README.md). |
| **A5 — related existing records** | WP03 red-rice-flakes identity and terminology reviews: [identity integration](../batches/wp03-section-f-red-rice-poha-identity-integration-20261012/README.md) and [Québec wording review](wp03-section-f-red-rice-quebec-terminology-review-20261011.md). | Keep red-rice flakes and their Québec wording decision separate from flour. |
| **A6 — related existing review** | [WP03 Puttu podi family boundary hold](wp03-section-f-puttu-podi-family-boundary-hold-20261013-r33.md). | The generic Puttu family remains unresolved because substrate and processing vary across Canadian listings. The source-specific red rice name here does not reopen that hold or create a Puttu alias. |
| **A7 — related existing source** | Canadian Intellectual Property Office, [Journal des marques de commerce, vol. 57, no. 2905](https://publications.gc.ca/collections/collection_2010/opic-cipo/RG42-2-57-2905.pdf), trademark product list. | The historical listing uses farine de riz rouge grillée for a separately roasted product; it does not name the unqualified flour reviewed here. |
| **A8 — related existing records** | [WP03 red-rice grain decision](../batches/red-rice-identity.md) and [WP02 roasted-red-rice-flour decision](../batches/wp02-wp05-roasted-flour-preserved-condiment-followup-integration-20261010/README.md). | Keep the edible red rice grain and roasted flour identities unchanged. The grain record discusses the separate weedy/agronomic use of “red rice”; no such use is assigned here. |

## Complete proposed ledger delta

If accepted, append this full ingredient_reference record. Existing source records WP03-S129, WP02-S27, and WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S04 are reused with their existing IDs and original evidence boundaries. Add no measurement observation, conversion, package yield, form, or substitution rule.

~~~json
{
  "recordId": "ingredient-ref-red-rice-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-RED-RICE-FLOUR-R155-20261015-S01",
      "url": "https://www.molinopeila.it/en/products/riso/red-rice-flour",
      "title": "Molino Peila SpA, Red rice flour",
      "versionOrDate": "Current manufacturer product page",
      "accessedOn": "2026-10-15",
      "locator": "Product heading, description, ingredients, use, and packaging.",
      "supports": "Names wholegrain red rice flour; lists 100% wholegrain red rice flour as the ingredient; describes bread/bakery use and 25 kg / 1,000 kg packaging. This supports a named milling product, not a household measure, universal grade, density, or tested substitution.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-RED-RICE-FLOUR-R155-20261015-S02",
      "url": "https://www.riseriaprovera.it/fr/les-farines-biologiques-et-conventionnelles/",
      "title": "Riseria Provera, Les Farines Biologiques et Conventionnelles",
      "accessedOn": "2026-10-15",
      "locator": "Heading Farine de Riz Rouge and its special-for-pasta line.",
      "supports": "Uses the exact French product name Farine de Riz Rouge on a French-language manufacturer page. It does not establish current Québec use, an OQLF ruling, a recipe formula, or a reusable amount.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-RED-RICE-FLOUR-R155-20261015-S03",
      "url": "https://www.molinobongiovanni.com/files/ProductsCatalogVer1-FR.pdf",
      "title": "Molino Bongiovanni, French products catalogue",
      "accessedOn": "2026-10-15",
      "locator": "Entry Farine de riz rouge complète; ingredient, milling description, and use.",
      "supports": "Names a complete red rice flour obtained by stone milling red rice and describes use in sweet or savoury bakery products mixed with wheat flour. It does not establish a universal wholegrain/stone-milled grade or a transferable blend ratio.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-RED-RICE-FLOUR-R155-20261015-S04",
      "url": "https://japan-food.jetro.go.jp/riceflour/fr/brands/index.html",
      "title": "Japan Food Product Overseas Promotion Center / JETRO, Farine de riz japonaise",
      "accessedOn": "2026-10-15",
      "locator": "Greenpower Nanohana Farine de riz rouge product entry and description.",
      "supports": "Lists Farine de riz rouge as a distinct manufacturer product. The described color use is qualitative and gives no denominator, recipe, or tested substitution.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-RED-RICE-FLOUR-R155-20261015-S05",
      "url": "https://toronto.motherlandgrocery.ca/collections/all?page=31",
      "title": "Motherland Grocery, Products, page 31",
      "accessedOn": "2026-10-15",
      "locator": "Toronto product listing Double Horse Red Rice Flour (Chemba Arippodi).",
      "supports": "A Canadian retailer listing uses the qualified name Double Horse Red Rice Flour and the product-specific qualifier Chemba Arippodi. It does not establish current stock, product composition, or Chemba Arippodi as a generic alias.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-RED-RICE-FLOUR-R155-20261015-S06",
      "url": "https://ca.lakpura.com/products/wijaya-red-rice-flour-1kg",
      "title": "Lakpura, Wijaya Red Rice Flour (1 kg)",
      "accessedOn": "2026-10-15",
      "locator": "Product title, description, package size, and stock status.",
      "supports": "Canada/CAD storefront listing identifies Wijaya Red Rice Flour and says it is made from cleaned and de-stoned red rice. It showed sold out; it does not establish current availability, a household measure, or a milling grade shared by other products.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-RED-RICE-FLOUR-R155-20261015-S07",
      "url": "https://www.walmart.ca/fr/ip/Farine-de-Riz-Rouge-Crue/20RP7K90Y3NM",
      "title": "Walmart Canada, Farine de Riz Rouge Crue",
      "versionOrDate": "Marketplace page indexed about one month before review",
      "accessedOn": "2026-10-15",
      "locator": "French product title and indexed ingredient/description text.",
      "supports": "The title says Farine de Riz Rouge Crue, but the indexed product details say 100% white rice. This contradiction means the listing cannot support a red-rice product identity or Québec display. Its 1 kg is package size, not a kitchen measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-S129",
      "url": "https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf",
      "title": "Government of Canada, Spécifications sur la qualité des aliments — Riz (français)",
      "versionOrDate": "2018-04-01",
      "accessedOn": "2026-10-07",
      "locator": "SQA-22-02, Riz rouge.",
      "supports": "Uses Riz rouge for a red-coloured edible rice class; does not name red-rice flour or establish Québec-preferred flour wording.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-S27",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz",
      "title": "OQLF, farine de riz",
      "accessedOn": "2026-10-05",
      "locator": "Definition, note, and English translation.",
      "supports": "Defines farine de riz as fine powder from milled rice; its note mentions white and brown rice, not red rice. It does not name or approve farine de riz rouge.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S04",
      "url": "https://publications.gc.ca/collections/collection_2025/opic-cipo/RG42-2-72-3685-fra.pdf",
      "title": "Canadian Intellectual Property Office, Journal des marques de commerce, vol. 72, no. 3685",
      "versionOrDate": "2025-06-11",
      "accessedOn": "2026-10-13",
      "locator": "Page 334, Ajmi Flour Mills goods list.",
      "supports": "Translates the specific name chemba puttu podi as nommément farine de riz rouge. This is not an OQLF/TERMIUM ruling or a general alias for every red-rice flour or Puttu product.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [
    {
      "findingId": "wp02-a6-red-rice-flour-general-flour-substitution-r155-20261015",
      "researchState": "blocked_pending_evidence",
      "context": "General blend or replacement ratio for wheat flour, generic rice flour, or another flour using red rice flour.",
      "basis": "Molino Peila describes bread/bakery use, Bongiovanni says its complete flour is used in bakery products mixed with wheat flour, and JETRO says a few percent may add a light-purple colour. These statements provide no controlled recipe, consistent product grade, amount denominator, or adjustment. Keep them as qualitative product-use descriptions, not transferable substitution guidance.",
      "limitations": [
        "Do not infer a wheat-flour replacement percentage from a bakery-use or mixed-with-wheat statement.",
        "Do not treat JETRO's qualitative 'few percent' colour suggestion as a reusable ratio or recipe conversion.",
        "Do not infer equivalence to generic, white, brown, glutinous, black, or roasted-red rice flour."
      ],
      "rejectedCandidates": [
        {
          "candidate": "Replace a fixed percentage of wheat flour with red rice flour in bread or bakery formulas.",
          "reason": "Manufacturer product-use descriptions provide no tested recipe, amount basis, or adjustment.",
          "sourceIds": [
            "WP02-A6-RED-RICE-FLOUR-R155-20261015-S01",
            "WP02-A6-RED-RICE-FLOUR-R155-20261015-S03"
          ]
        },
        {
          "candidate": "Use a few percent of red rice flour as a universal colour-use ratio.",
          "reason": "JETRO's colour statement does not define a recipe, ingredient basis, denominator, or test conditions.",
          "sourceIds": [
            "WP02-A6-RED-RICE-FLOUR-R155-20261015-S04"
          ]
        }
      ],
      "sourceIds": [
        "WP02-A6-RED-RICE-FLOUR-R155-20261015-S01",
        "WP02-A6-RED-RICE-FLOUR-R155-20261015-S03",
        "WP02-A6-RED-RICE-FLOUR-R155-20261015-S04"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only red rice flour / farine de riz rouge as a distinct FLOUR_AND_STARCH milling-product reference, with no aliases, forms, density, unit mappings, measurement observations, conversions, yields, recipe links, or active substitutions. Current manufacturer pages and a Canadian retailer listing separately name red rice flour. The French display is an exact manufacturer-directory/product name and is consistent with the federal French grain name riz rouge, but it is not an OQLF-preferred compound or verified Québec package title. OQLF's farine de riz note mentions white or brown rice and does not include red rice; the Canadian marketplace phrase found for Farine de Riz Rouge Crue contradicts its own white-rice description. Keep independent Québec wording review open. Preserve the existing roasted-red-rice-flour identity, red-rice grain and flakes, and the unresolved Puttu-family boundary. Do not infer a cultivar, milling grade, process, numeric behavior, or substitution.",
      "sourceIds": [
        "WP02-A6-RED-RICE-FLOUR-R155-20261015-S01",
        "WP02-A6-RED-RICE-FLOUR-R155-20261015-S02",
        "WP02-A6-RED-RICE-FLOUR-R155-20261015-S03",
        "WP02-A6-RED-RICE-FLOUR-R155-20261015-S04",
        "WP02-A6-RED-RICE-FLOUR-R155-20261015-S05",
        "WP02-A6-RED-RICE-FLOUR-R155-20261015-S06",
        "WP02-A6-RED-RICE-FLOUR-R155-20261015-S07",
        "WP03-S129",
        "WP02-S27",
        "WP03-PUTTU-PODI-BOUNDARY-20261013-R33-S04"
      ]
    }
  ]
}
~~~

## Proposal-local checks and limits

- UTF-8 without BOM; both embedded JSON blocks parse. The reference delta matches the live reference-row shape, and the complete ledger record validates against research-ledger.schema.json.
- The reference ID is absent from live references, forms, legacy-import candidates, and ledger records. The seven new source IDs are unallocated; local Markdown links resolve; no trailing or end-of-file whitespace remains.
- The manifest snapshot and static phrase-first picker projection are described above. No tests, Gradle tasks, emulator, app, or deployment checks were run. This proposal makes no shared catalog or application changes; proposal-local static checks only cover the document and proposed data.
