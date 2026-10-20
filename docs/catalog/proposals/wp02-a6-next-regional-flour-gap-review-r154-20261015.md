# WP02 Section 04 A6 R154 — Black rice flour identity review

## Review record

- **Reviewed and primary sources checked:** 2026-10-15.
- **Status:** Proposal only. This review changes no shared catalog, form, legacy, ledger, recipe, checklist, roadmap, or generated file.
- **Open checklist:** Continue the A6 review of regional grain flours under [Section 04 A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1434). The parent remains open after R149–R153; none of those decisions reviews black rice flour.
- **Scope:** A separately marketed flour made from black rice (*Oryza sativa*), distinct from intact black rice, black glutinous rice, and the generic, white, brown, glutinous, roasted-red, and wild-rice flour references.
- **Proposed ID and source IDs:** **ingredient-ref-black-rice-flour**; **WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S01** through **S05**. The proposed reference ID, normalized names, and new source-ID prefix were checked against live references, forms, legacy-import candidates, ledger records, and the proposal/batch archive. No collision was found. Existing black-rice grain source IDs are reused by reference, not reallocated.

## Recommendation

**Accept identity-only black rice flour / farine de riz noir as ingredient-ref-black-rice-flour, in FLOUR_AND_STARCH, with no aliases.** Manufacturer listings separately name black rice flour, and a Canadian retailer product listing uses that name. Molino Peila specifies a wholegrain product, while another product source describes a semi-polished medium-grain product and explicitly excludes short-grain sticky black rice [S01, S03–S05]. The sources establish a black-rice flour product class, but they do not define one cultivar, one milling grade, or a universal glutinousness boundary.

Use farine de riz noir as the French display. The exact phrase is used on an Italian miller’s French-language product page. The Government of Canada’s bilingual rice specification uses riz noir, and the OQLF entry provides the base term farine de riz; neither source is a Québec product label for black-rice flour. The OQLF entry’s explanatory note mentions white and brown rice, not black rice. This is a transparent fr-CA construction supported by a French manufacturer product name, not an OQLF-preferred qualified term or a verified Québec package title. Keep independent Québec wording review open [S02, A1–A3].

Do not add aliases, forms, density, unit mappings, measurements, conversions, yields, recipe links, or an active substitution. Record one seller’s 20–25% bread-flour replacement suggestion only as blocked, product-specific guidance; it is not a transferable or tested rule [S04].

## Product and naming boundary

| Material or wording | Decision | Evidence boundary |
|---|---|---|
| black rice flour / farine de riz noir | Add one identity-only milling-product reference. | Molino Peila’s product page names wholegrain black rice flour; Riseria Provera uses the French product name; the Canadian T&T listing names Juliang Organic Black Rice Flour. This supports the named product class, not a standard cultivar or grade [S01–S03]. |
| black rice / riz noir | Keep on the existing ingredient-ref-black-rice grain row. | The federal food-quality specification uses the bilingual grain names and gives Indonesian and Thai jasmine examples. Flour is a milling product, not a grain alias or form [A1]. |
| black glutinous rice / riz gluant noir | Keep on the existing ingredient-ref-black-glutinous-rice grain row. | Black-rice varieties can be glutinous or non-glutinous. No source here establishes that the unqualified black-rice-flour products all use one glutinousness class. Do not add black glutinous rice flour or farine de riz gluant noir as aliases [A2]. |
| Generic, white, brown, and glutinous rice flours | Keep each existing row unchanged. | These are already separate active identities. The new display does not establish equivalence to generic or white/brown rice flour, glutinous rice flour, Mochiko, or Shiratamako. |
| Roasted red rice flour | Keep the existing ingredient-ref-roasted-red-rice-flour unchanged. | It is a separately named red-rice and roasting product. No red-rice or roasted wording is added to the new row. |
| Wild rice flour | Keep the existing ingredient-ref-wild-rice-flour unchanged. | Wild rice is not Oryza rice and already has a separate A6 identity. |
| wholegrain black rice flour; semi-polished black rice flour | Do not add aliases or forms. | These are source-specific milling/grade descriptions. The reviewed products do not establish one shared grade, and the Canadian listing does not give a processing specification [S01, S04]. |
| forbidden rice flour, black glutinous rice flour, and brand names | Do not add aliases. | The reviewed product names do not establish these as general synonyms. One retailer’s Juliang name and one seller’s Heirloom name remain source-specific [S03–S04]. |

The A6 placement is limited to this regional/specialty rice-flour product identity. It does not reopen Section A4’s existing generic, white, or brown rice-flour decisions.

## Complete proposed reference delta

If accepted, append this one row to ingredient-references.v1.json; do not change any existing row.

~~~json
{
  "id": "ingredient-ref-black-rice-flour",
  "nameFr": "farine de riz noir",
  "nameEn": "black rice flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
~~~

## Exact ownership, IDs, archive, and picker audit

The live read-only snapshot contains **1,524 ingredient references, 119 ingredient forms, 61 legacy-import candidates, and 1,869 research-ledger records**. The ledger has **7,907 source entries and 6,762 distinct source IDs**.

Exact phrase ownership was checked with the lowercase, NFKD accent-folding, punctuation removal, and whitespace normalization used by [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). Phrase ownership includes reference names and aliases, form labels and match terms, legacy names and aliases, and ledger record IDs.

| Exact normalized phrase or ID | Current owner |
|---|---|
| black rice flour | None |
| farine de riz noir | None |
| wholegrain black rice flour | None |
| semi-polished black rice flour | None |
| black glutinous rice flour; farine de riz gluant noir | None |
| black rice; riz noir | Exact display owner ingredient-ref-black-rice; phrase search also returns ingredient-ref-black-glutinous-rice and ingredient-ref-puffed-black-rice. |
| rice flour; farine de riz | Exact display owner ingredient-ref-rice-flour; phrase search returns eight existing rice-flour references. |
| roasted red rice flour | ingredient-ref-roasted-red-rice-flour |
| ingredient-ref-black-rice-flour | Absent from references, forms, the 61 legacy IDs, and ledger record IDs. |
| Proposed prefix WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S | No current ledger source ID or proposal/batch archive match. The new S01–S05 IDs are unallocated. |

A scan of all proposal and batch Markdown found no prior black-rice-flour review, hold, or integration. The adjacent [WP03 R82 black-rice-flakes review](wp03-section-f-black-rice-flakes-review-r82-20261013.md) is about flakes and does not review flour; the existing [black-rice identity record](../batches/black-rice-identity.md) covers the intact grain. R149 wild rice flour and R150–R153 cover other identities and leave the A6 parent open. Existing ledger sources WP03-S128–S130 and WP02-S27 are reused only for their stated grain-name, glutinousness, and base-terminology limits [A1–A3].

This static picker projection follows phrase-first normalized matching over current references and forms plus the proposed row. It is not runtime picker testing.

| Query | Current result | Projected result if accepted |
|---|---|---|
| black rice flour | None | ingredient-ref-black-rice-flour only |
| farine de riz noir | None | ingredient-ref-black-rice-flour only |
| black rice | Black glutinous rice; black rice; puffed black rice | Those three plus black rice flour |
| riz noir | Riz gluant noir; riz noir; riz noir soufflé | Those three plus farine de riz noir |
| rice flour | Generic, brown, white, wild, roasted-red, glutinous, Mochiko, and Shiratamako rice flours | The same eight plus black rice flour |
| farine de riz | The same eight French rice-flour results | The same eight plus farine de riz noir |
| black glutinous rice flour; farine de riz gluant noir | None | None |
| wholegrain black rice flour; semi-polished black rice flour | None | None; no source-specific grade alias is stored |
| red rice flour; roasted red rice flour | Roasted red rice flour | Unchanged |

The broad black rice and riz noir queries gain one flour result because the new display contains the grain phrase. This is an expected grain/product choice. No bare black rice or riz noir alias is added.

## Manifest-wide recipe and ingredient-row scan

The manifest lists **114 recipe files and 1,123 ingredient rows**. Every listed recipe file and ingredient row was scanned for black rice flour, farine de riz noir, spelling/word-order variants, wholegrain and semi-polished qualifiers, black-glutinous flour wording, black rice / riz noir, and the existing/proposed black-rice IDs. The scan found:

- zero full-file hits for the candidate or adjacent black-rice terms;
- zero ingredient-row text hits;
- zero links to ingredient-ref-black-rice, ingredient-ref-black-glutinous-rice, ingredient-ref-puffed-black-rice, or any existing rice-flour reference;
- zero links to the proposed ingredient-ref-black-rice-flour.

No bundled recipe creates demand for this row, amount, or recipe link. The manifest-ordered corpus snapshot was **753,928 bytes**, SHA-256 **0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143**. The fingerprint hashes each manifest-relative recipe path, a NUL byte, the exact recipe bytes, and a trailing NUL byte in manifest order.

## Forms, measures, density, unit mapping, conversion, yield, and substitution audit

- **Forms:** Add none. Flour is the named milling product itself, not a dry/cooked state of ingredient-ref-black-rice. The current 119 forms contain no exact black-rice-flour term, and no form is attached to the black-rice grain or existing rice-flour references.
- **Household measures and density:** No source gives a mass-volume pair or a reusable flour measure. Molino Peila’s 25 kg and 1,000 kg figures and T&T’s 4 lb package are product/package sizes, not kitchen measures [S01, S03]. Purple Superfoods’ 100 g package is stale product-page data; its 1 tablespoon plus about 100 ml water is a product-specific porridge preparation with no mass for the spoonful, so it cannot establish flour density or a unit mapping [S04].
- **Unit mappings:** Keep unitMappings empty. Do not infer a cup, spoon, or package conversion.
- **Conversions and yields:** Add no grain-to-flour conversion, milling yield, cooking yield, edible yield, or package yield. No source quantifies a yield or mass-volume relationship for a reusable catalog conversion.
- **Substitutions:** Purple Superfoods suggests replacing 20–25% of bread flour or gluten-free flour with its black rice flour, but gives no controlled recipe, basis, or adjustment. Its page showed the product out of stock and a best-before date of August 2025 when checked on 2026-10-15. Treat this as aged product-specific seller advice and keep a blocked finding in the ledger; do not activate a global or contextual rule. Molino Peila’s bread/bakery use and JETRO’s “few percent” color guidance do not establish replacement ratios [S01, S04–S05].

## Source register

Sources were checked on 2026-10-15. New source IDs are local to this proposal and, if accepted, are added once to the new ledger record.

| Source ID | Source and locator | Supports and does not support |
|---|---|---|
| **WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S01** | Molino Peila SpA, [Black rice flour](https://www.molinopeila.it/en/products/riso/black-rice-flour), current manufacturer product page; product code 0610. | Names a wholegrain black rice flour, lists 100% wholegrain black rice flour as the ingredient, gives 25 kg paper-bag and 1,000 kg big-bag packaging, and suggests bread/bakery use. This is a manufacturer product listing, not a consumer package, household measure, flour density, or tested substitution. |
| **WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S02** | Riseria Provera, [Les Farines Biologiques et Conventionnelles](https://www.riseriaprovera.it/fr/les-farines-biologiques-et-conventionnelles/), French-language manufacturer page. | Uses the exact French name Farine de Riz Noir and lists it for bread and cakes. The page is dated 2021-07-27 and the mill is in Italy; this is not a Québec/Canadian package title, an OQLF ruling, or a recipe formula. |
| **WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S03** | T&T Supermarket, [Juliang Organic Black Rice Flour](https://www.tntsupermarket.com/eng/78771601-juliang-organic-blk-rice-flour.html), Canadian retailer product listing. | The retailer search index showed a 4 lb product titled Juliang Organic Black Rice Flour, with a crawl about four months before this review. Direct retrieval on the review date exposed only a minimal page response. This supports Canadian retail wording, not current local stock, manufacturer identity, ingredients, or processing details. |
| **WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S04** | Purple Superfoods, [Heirloom Black Rice Flour](https://purplesuper.com/product/black-rice-flour/), product page. | Identifies a product made from semi-polished medium-grain black rice (*Oryza sativa* L.) and says it is not made from short-grain sticky black rice. The page showed out of stock and a best-before date of August 2025. Its 100 g pack, porridge preparation, and 20–25% bread-flour replacement suggestion are product-specific, stale guidance; they do not establish stock, a reusable measure, a density, or an active substitution. |
| **WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S05** | Japan Food Product Overseas Promotion Center / JETRO, [Japanese Rice Flour Products](https://japan-food.jetro.go.jp/riceflour/en/brands/index.html), Greenpower Nanohana listing. | Lists Black Rice Flour and Red Rice Flour as separate Greenpower Nanohana products and says a few percent of black rice flour may color a product light purple. Supports a manufacturer-listed flour product and a color-use claim, not Canadian availability, a product-grade standard, or a replacement ratio. |
| **WP03-S128** (reused) | Government of Canada, [Food Quality Specifications — Rice (English)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf), FQS-22-02, Black Rice. | Gives the English black-rice class and Indonesian/Thai-jasmine examples. It is a grain specification, not a flour product specification. |
| **WP03-S129** (reused) | Government of Canada, [Spécifications sur la qualité des aliments — Riz (français)](https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf), SQA-22-02, Riz noir. | Uses French riz noir for the grain class. This is not a flour name or a Québec retail label. |
| **WP03-S130** (reused) | International Rice Research Institute, [Innovators in rice science](https://ricetoday.irri.org/innovators-in-rice-science/), black-rice variety discussion. | Reports black-rice varieties that include both glutinous and non-glutinous types. This blocks treating all black rice flour as one glutinousness class. |
| **WP02-S27** (reused) | OQLF, [farine de riz (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), definition, note, and English translation. | Establishes the OQLF base term farine de riz; its note mentions white and brown rice, not black rice. It does not approve farine de riz noir. |

## Complete proposed ledger delta

If accepted, append this full ingredient_reference record. Existing source records WP03-S128–S130 and WP02-S27 are reused with their existing IDs and evidence limits. Add no measurement observation, conversion, package yield, form, or substitution rule.

~~~json
{
  "recordId": "ingredient-ref-black-rice-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "blocked_pending_evidence",
  "sources": [
    {
      "sourceId": "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S01",
      "url": "https://www.molinopeila.it/en/products/riso/black-rice-flour",
      "title": "Molino Peila SpA, Black rice flour",
      "versionOrDate": "Current manufacturer product page, product code 0610",
      "accessedOn": "2026-10-15",
      "locator": "Product heading, description, ingredients, use, and packaging.",
      "supports": "Names wholegrain black rice flour; lists 100% wholegrain black rice flour as the ingredient; provides bread/bakery use and 25 kg / 1,000 kg packaging. This supports a named milling product, not a consumer package, household measure, density, or tested substitution.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S02",
      "url": "https://www.riseriaprovera.it/fr/les-farines-biologiques-et-conventionnelles/",
      "title": "Riseria Provera, Les Farines Biologiques et Conventionnelles",
      "versionOrDate": "Page dated 2021-07-27",
      "accessedOn": "2026-10-15",
      "locator": "Heading Farine de Riz Noir and its bread/cake use line.",
      "supports": "Uses the exact French phrase Farine de Riz Noir on a French-language manufacturer page dated 2021-07-27. The company is in Italy; this does not establish current Québec use, an OQLF ruling, or a recipe formula.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S03",
      "url": "https://www.tntsupermarket.com/eng/78771601-juliang-organic-blk-rice-flour.html",
      "title": "T&T Supermarket, Juliang Organic Black Rice Flour",
      "versionOrDate": "Search index crawled about four months before review; page freshness not verified",
      "accessedOn": "2026-10-15",
      "locator": "Canadian retailer product title and indexed size details.",
      "supports": "The retailer search index showed a 4 lb product named Juliang Organic Black Rice Flour, crawled about four months before this review. Direct retrieval returned only minimal page text; it supports Canadian retail wording, not current local stock, manufacturer identity, ingredients, or processing details.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S04",
      "url": "https://purplesuper.com/product/black-rice-flour/",
      "title": "Purple Superfoods, Heirloom Black Rice Flour",
      "accessedOn": "2026-10-15",
      "locator": "Product description, ingredient, suggested uses, stock status, and best-before date.",
      "supports": "Describes semi-polished medium-grain black rice flour (Oryza sativa L.) and expressly excludes short-grain sticky black rice. The page showed out of stock and a best-before date of August 2025. Its 100 g pack, porridge preparation, and 20–25% flour-replacement suggestion are stale product-specific information, not a reusable measure, density, or general rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S05",
      "url": "https://japan-food.jetro.go.jp/riceflour/en/brands/index.html",
      "title": "Japan Food Product Overseas Promotion Center / JETRO, Japanese Rice Flour Products",
      "accessedOn": "2026-10-15",
      "locator": "Greenpower Nanohana Black Rice Flour and Red Rice Flour product entries.",
      "supports": "Lists black rice flour and red rice flour as separate manufacturer products and says adding a few percent of black rice flour may color foods light purple. This does not establish Canadian availability, a standard grade, or a replacement ratio.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-S128",
      "url": "https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-eng.pdf",
      "title": "Government of Canada, Food Quality Specifications — Rice (English)",
      "versionOrDate": "2018-04-01",
      "accessedOn": "2026-10-07",
      "locator": "FQS-22-02, Black Rice.",
      "supports": "Names the broader black-rice food product and gives Indonesian black rice and Thai jasmine black rice as examples. It does not say all black rice is glutinous.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-S129",
      "url": "https://publications.gc.ca/collections/collection_2019/mdn-dnd/D2-531-22-2018-fra.pdf",
      "title": "Government of Canada, Spécifications sur la qualité des aliments — Riz (français)",
      "versionOrDate": "2018-04-01",
      "accessedOn": "2026-10-07",
      "locator": "SQA-22-02, Riz noir.",
      "supports": "Uses riz noir as the French label for the broader black-rice class; it does not name the black-glutinous intersection.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-S130",
      "url": "https://ricetoday.irri.org/innovators-in-rice-science/",
      "title": "International Rice Research Institute, Innovators in rice science",
      "accessedOn": "2026-10-07",
      "locator": "Black-rice variety discussion.",
      "supports": "Reports black-rice varieties that include both glutinous and non-glutinous types; supports keeping this qualified product separate from the broad black-rice and glutinous-rice identities.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-S27",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz",
      "title": "OQLF, farine de riz",
      "accessedOn": "2026-10-05",
      "locator": "Definition, note, and English translation.",
      "supports": "Defines finely milled rice grains, names rice flour as the English equivalent, and notes white-rice and brown-rice source forms. It does not name black-rice flour or approve farine de riz noir.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [
    {
      "findingId": "wp02-a6-black-rice-flour-general-substitution-r154-20261015",
      "researchState": "blocked_pending_evidence",
      "context": "General replacement of bread flour or gluten-free flour with black rice flour.",
      "basis": "Purple Superfoods suggests replacing 20–25% of bread flour or gluten-free flour with its own black rice flour, but supplies no controlled recipe, amount basis, method, or adjustment. The page showed the product out of stock and a best-before date of August 2025 when checked on 2026-10-15. Other reviewed manufacturer guidance describes general bread/bakery use or color addition, not a tested replacement.",
      "limitations": [
        "Do not activate or generalize the 20–25% suggestion; it is seller guidance for one named product, not a tested recipe-level rule.",
        "The product page is stale for availability and the recommended replacement scope has no recipe, amount basis, or adjustment.",
        "Do not infer replacement equivalence to generic rice flour, white or brown rice flour, black glutinous rice flour, or wheat flour."
      ],
      "rejectedCandidates": [
        {
          "candidate": "Replace 20–25% of bread flour or gluten-free flour with black rice flour.",
          "reason": "The source does not tie the percentage to a tested recipe, method, amount basis, or adjustment; keep it blocked and inactive.",
          "sourceIds": [
            "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S04"
          ]
        }
      ],
      "sourceIds": [
        "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S04"
      ]
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only black rice flour / farine de riz noir as a distinct FLOUR_AND_STARCH milling-product reference, with no aliases, forms, density, unit mappings, measurement observations, conversions, yields, recipe links, or active substitution. Manufacturer listings name black rice flour, and a Canadian retailer product listing uses that name. The French display is used on an Italian miller’s French-language page and is a transparent fr-CA construction supported by the federal French grain name riz noir and the OQLF base term farine de riz; it is not an OQLF-preferred compound or verified Québec package title. Keep independent Québec wording review open. Do not infer a cultivar, grade, glutinousness class, or equivalence with existing generic, white, brown, glutinous, roasted-red, or wild-rice flour references.",
      "sourceIds": [
        "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S01",
        "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S02",
        "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S03",
        "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S04",
        "WP02-A6-BLACK-RICE-FLOUR-R154-20261015-S05",
        "WP03-S128",
        "WP03-S129",
        "WP03-S130",
        "WP02-S27"
      ]
    }
  ]
}
~~~

## Proposal-local checks and limits

- UTF-8 without BOM; both embedded JSON blocks parse. The reference delta matches the live reference-row shape, and the complete ledger record validates against research-ledger.schema.json.
- The reference ID is absent from live references, forms, legacy-import candidates, and ledger records. All five new source IDs are unallocated; local Markdown links resolve; no trailing or end-of-file whitespace remains.
- No tests, Gradle tasks, emulator, app, or deployment checks were run. This proposal makes no shared catalog or application changes; these checks cover the proposed data and document only.
