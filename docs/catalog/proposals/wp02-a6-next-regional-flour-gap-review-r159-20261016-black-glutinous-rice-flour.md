# WP02 Section 04 A6 R159 — Black glutinous rice flour identity review

## Review record

- **Reviewed and current sources checked:** 2026-10-16.
- **Status:** Proposal only. This review changes no shared catalog, forms, legacy identities, ledger, recipes, generated files, checklist, roadmap, or integration README.
- **Open checklist:** Continue the regional grain-flour review under [Section 04 A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1452). R158's jowari-flour hold is integrated; A6 remains open.
- **Candidate:** A separately marketed flour milled from black glutinous rice, not an alias or form of unqualified black rice flour or generic glutinous rice flour.
- **Proposed reference ID:** `ingredient-ref-black-glutinous-rice-flour`. It is not allocated in references, forms, legacy-import candidates, or ledger record IDs.
- **Proposal-local source IDs:** `WP02-A6-BLACK-GLUTINOUS-RICE-FLOUR-R159-20261016-S01` through `S04`. The prefix is absent from the live ledger source IDs and proposal/batch archive text before this draft. The IDs remain proposal-local and are not ledger entries.

## Recommendation

**Accept an identity-only `black glutinous rice flour / farine de riz gluant noir` reference as `ingredient-ref-black-glutinous-rice-flour`, category `FLOUR_AND_STARCH`, with no aliases or numeric behavior.** A Canadian retailer lists a 500 g product under the exact English product name, and the manufacturer identifies black glutinous rice as the flour's raw material. A current French-language retailer page uses the exact French compound name. This establishes a separately named milling product and supports keeping it apart from both the active generic black rice flour and generic glutinous rice flour rows [S01–S03].

Use the French display `farine de riz gluant noir` as a transparent Québec French construction. The OQLF lists `riz gluant` and `riz glutineux` as preferred terms, and the Loblaws French storefront currently lists `Farine de riz gluant` and `Riz gluant noir` as separate products. It does not list the full compound flour name, and the exact French product page found is from a retailer in Aubenas, France. Keep independent Québec review of the compound display open; do not describe it as an OQLF-preferred term or a verified Québec package label [S03–S04, A1].

The R154 black-rice-flour review rejected `black glutinous rice flour` and `farine de riz gluant noir` as aliases of `ingredient-ref-black-rice-flour` because its unqualified products did not establish a universal glutinousness class. R159 preserves that boundary and proposes a distinct row for the separately named, source-grain-qualified product. Do not add these phrases to `ingredient-ref-black-rice-flour`, `ingredient-ref-glutinous-rice-flour`, or the existing black-glutinous-rice grain reference [A2–A3].

Keep aliases, forms, density, unit mappings, measurements, conversions, yields, recipe links, and substitutions empty. Package weights are not household measures. The sources do not establish a reusable grain-to-flour yield, volume-to-mass conversion, or substitution ratio.

## Product and naming boundary

| Material or wording | Decision | Evidence boundary |
|---|---|---|
| `black glutinous rice flour / farine de riz gluant noir` | Add one identity-only `FLOUR_AND_STARCH` reference. | A Canadian retail product page uses the exact English name; a manufacturer describes the product as fine flour milled from selected black glutinous rice. The French compound is exact on a France-based retail page and is a transparent fr-CA construction from Québec-facing component terms, not an OQLF entry or verified Québec product title [S01–S04, A1]. |
| `black glutinous rice / riz gluant noir` | Keep on `ingredient-ref-black-glutinous-rice` as a grain. | The active grain identity has Canadian English and French retail wording, and its OQLF terminology source lists `riz gluant` / `riz glutineux`. Flour is a separate milling product, not a grain form [A1, A4]. |
| `black rice flour / farine de riz noir` | Keep on `ingredient-ref-black-rice-flour`. | R154 supports an unqualified black-rice flour product but does not establish that it is glutinous. Do not add the candidate phrase as an alias to this row [A2]. |
| `glutinous rice flour / farine de riz gluant` | Keep on `ingredient-ref-glutinous-rice-flour`. | This remains the general glutinous rice-flour reference. The black-glutinous product is not an alias or form of generic flour [A5]. |
| `Mochiko` and `Shiratamako` | Keep existing references unchanged. | They are already separate milling products with their own process and Québec wording history; no equivalence is established here [A5]. |
| `black sticky rice flour`, `black sweet rice flour`, `glutinous black rice flour`, `farine de riz noir glutineux`, and brand names | Do not add aliases. | No source in this review attests these as general synonyms for the exact candidate. The French source and OQLF terms support only the displayed construction; the Canadian retailer page supplies one exact English product title [S01–S04, A1]. |

This review does not claim that all black rice flour is made from glutinous rice, does not reopen the black-rice grain identity, and does not reopen the existing Mochiko, Shiratamako, generic rice-flour, or generic glutinous-rice-flour decisions.

## Complete proposed reference delta

If integrated, append this one reference row and do not change existing rows:

~~~json
{
  "id": "ingredient-ref-black-glutinous-rice-flour",
  "nameFr": "farine de riz gluant noir",
  "nameEn": "black glutinous rice flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
~~~

## Exact ownership, ID, archive, and picker audit

The read-only live snapshot contains **1,531 ingredient references, 119 ingredient forms, and 61 legacy-import candidates**. The research ledger contains **1,876 records, 7,966 source entries, and 6,814 distinct source IDs**.

Exact normalized ownership was checked across reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs. Search normalization follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase NFKD normalization, accent and ligature folding, punctuation-to-space conversion, and whitespace collapse.

| Normalized phrase or ID | Current exact owner or result |
|---|---|
| `black glutinous rice flour`; `farine de riz gluant noir` | No exact owner in references, forms, legacy candidates, or ledger record IDs. |
| `ingredient-ref-black-glutinous-rice-flour` | Absent from references, forms, legacy IDs, and ledger record IDs. It is the proposed unallocated ID. |
| `black glutinous rice`; `riz gluant noir` | Exact display owner: `ingredient-ref-black-glutinous-rice` (`GRAIN_AND_CEREAL`). Its accepted aliases include `glutinous black rice` and `riz noir glutineux`. |
| `black rice flour`; `farine de riz noir` | Exact display owner: `ingredient-ref-black-rice-flour` (`FLOUR_AND_STARCH`). |
| `glutinous rice flour`; `farine de riz gluant` | Exact display owner: `ingredient-ref-glutinous-rice-flour` (`FLOUR_AND_STARCH`). |
| Relevant forms | None of the 119 current forms exactly owns a candidate phrase. No form is attached to the black-glutinous-rice grain, black-rice-flour, or generic glutinous-rice-flour references. |
| Source-ID prefix `WP02-A6-BLACK-GLUTINOUS-RICE-FLOUR-R159-20261016-S` | No live ledger source-ID or proposal/batch archive hit before drafting. S01–S04 are proposal-local and are not ledger entries. |

The archive sweep found no prior separate-row review for black glutinous rice flour. The [R154 black-rice-flour proposal](wp02-a6-next-regional-flour-gap-review-r154-20261015.md) explicitly rejected this phrase only as an alias on the unqualified black-rice-flour row; it left the separate identity unresolved. R159 addresses that separate-product question with a proposed distinct ID and no aliases. The active black-glutinous-rice grain decision remains unchanged [A2, A4].

Static picker projections use the current phrase-first search behavior from `IngredientSearch.kt`; they are not runtime picker tests.

| Query | Current result | Projected result with the proposed row |
|---|---|---|
| `black glutinous rice flour` | No result. | `ingredient-ref-black-glutinous-rice-flour`. |
| `farine de riz gluant noir` | No result. | `ingredient-ref-black-glutinous-rice-flour`. |
| `black glutinous rice`; `riz gluant noir` | `ingredient-ref-black-glutinous-rice` (grain). | Both `ingredient-ref-black-glutinous-rice` and `ingredient-ref-black-glutinous-rice-flour`; the query exposes the source grain and its flour. |
| `riz noir glutineux` | `ingredient-ref-black-glutinous-rice` (grain alias). | Unchanged; R159 does not add the alternate word-order phrase to the flour. |
| `glutinous rice flour`; `farine de riz gluant` | Generic glutinous flour, Mochiko, and Shiratamako references. | The same three results plus `ingredient-ref-black-glutinous-rice-flour`. |
| `black rice flour`; `farine de riz noir` | `ingredient-ref-black-rice-flour`. | Unchanged; the proposed French and English displays do not contain either complete query phrase. |
| `rice flour`; `farine de riz` | Ten rice-flour references. | The same ten plus `ingredient-ref-black-glutinous-rice-flour`. |

Do not add shorter aliases such as `black rice flour` or `glutinous rice flour`. They would blur the separate glutinousness and source-grain boundaries. The expected two-result behavior for bare `black glutinous rice` / `riz gluant noir` reflects the active grain and its flour, rather than routing the query to only one of them.

## Manifest recipe scan

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for `black glutinous rice flour`, `farine de riz gluant noir`, the grain phrase `black glutinous rice` / `riz gluant noir`, and the proposed reference ID. The scan found **zero matching files and zero matching ingredient rows**. No bundled recipe links to the proposed ID or requires a new ingredient line. The scanned package fingerprint was `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143` (SHA-256 over each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order).

## Forms, measurements, conversions, yields, and substitutions

- **Forms:** Add none. This is a separately milled product identity, not a form of the black-glutinous-rice grain. No black-glutinous-rice-flour form exists in the current catalog.
- **Measures and density:** Add no reusable measure or density. The Canadian product listing shows a 500 g package, the manufacturer lists 1 kg / 25 kg / 50 kg packs, and the French retailer lists 400 g. These are package quantities, not household measure-to-mass pairs [S01–S03]. The related rice-flour references have `defaultDensity: null` and empty `unitMappings`.
- **Conversions and yields:** Add none. The product sources do not give a grain-to-flour milling yield, flour volume-to-mass conversion, cooking yield, or package yield. Do not infer one from the package weights.
- **Substitutions:** Add no active rule or new reusable substitution finding. Retailer usage text names desserts and mochi-like products but gives no transferable substitution ratio. Do not infer equivalence to generic glutinous rice flour, Mochiko, Shiratamako, unqualified black rice flour, or wheat flour. Existing black-rice-flour seller suggestions remain scoped to their own product and do not apply to this row [S03, A2, A5].
- **Recipe links:** Add none. The full recipe scan found no matching candidate wording or reference ID.

## Source register

New pages were checked on **2026-10-16**. New IDs are unique to this proposal; previously recorded OQLF and grain sources are cited with their existing IDs and are not reallocated.

| ID | Source and locator | Supports and limits |
|---|---|---|
| **S01 — WP02-A6-BLACK-GLUTINOUS-RICE-FLOUR-R159-20261016-S01** | Absolutely Thai, [Black Glutinous Rice Flour](https://www.absolutelythai.ca/products/black-glutinous-rice-flour-%E0%B9%81%E0%B8%9B%E0%B9%89%E0%B8%87%E0%B8%82%E0%B9%89%E0%B8%B2%E0%B8%A7%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B5%E0%B8%A2%E0%B8%A7%E0%B8%94%E0%B8%B3-1), product title and package selector. | Canadian retail listing uses the exact English name, gives a 500 g package, and showed a CAD price. On the review date the store's home page said it was on vacation and would reopen November 2, 2026; this review does not claim the product could be ordered that day. The page does not provide a flour specification, household measure, or substitution ratio. |
| **S02 — WP02-A6-BLACK-GLUTINOUS-RICE-FLOUR-R159-20261016-S02** | CAP MONYET, [Black Glutinous Rice Flour](https://blackglutinous.com/), product and specification sections. | Current manufacturer page names black glutinous rice flour, says it is milled from selected black glutinous rice, and lists retail and bulk package formats. It supports a distinct milling product, not Canadian stock, a cultivar/grade standard, household measure, density, conversion, yield, or substitution. |
| **S03 — WP02-A6-BLACK-GLUTINOUS-RICE-FLOUR-R159-20261016-S03** | Épices du Monde, [Farine de riz gluant noir, Thai Dancer, 400 g](https://www.epices-du-monde.com/article/8852646264009/farine-de-riz-gluant-noir-400gr-thai-dancer), product title, origin, ingredients, uses. | French-language retailer page uses the exact compound `farine de riz gluant noir`, identifies Thailand as origin, lists the single ingredient, and gives a 400 g package. The retailer is in Aubenas, France; this supports French product wording but not Québec retail wording. Its package weight and general use description do not establish household measures or replacement ratios. |
| **S04 — WP02-A6-BLACK-GLUTINOUS-RICE-FLOUR-R159-20261016-S04** | Loblaws French storefront, [current French product search](https://www.loblaws.ca/fr/search?cartId=0e3c782e-eafb-4455-aa77-0758d5903573&search-bar=glutino&storeId=1050), visible grocery listings. | Current French-language Canadian grocery results list `Farine de riz gluant` and `Riz gluant noir` as separate products. They support the component wording in a Québec-facing shopping context; the page does not list the combined black-glutinous flour product or establish that the separate products have the same source or producer. |
| **A1 — existing OQLF source** | OQLF, [riz glutineux (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux), current GDT entry; existing ledger source `WP03-S11` / `WP02-S73`. | Lists `riz glutineux`, `riz gluant`, and `riz doux` as preferred terms for the grain. It does not provide an approved black-glutinous-rice-flour compound. Reuse the existing source ID; do not re-register it. |
| **A2 — existing black-rice-flour record** | Existing record `ingredient-ref-black-rice-flour` and the [R154 focused proposal](wp02-a6-next-regional-flour-gap-review-r154-20261015.md). | The unqualified black-rice flour identity remains separate; R154 rejected the black-glutinous phrase as an alias because the reviewed unqualified products did not establish glutinousness. Its product-specific measurement and blocked substitution research remain unchanged. |
| **A3 — existing related grain record** | Existing `ingredient-ref-black-glutinous-rice` sources `WP03-BLACK-GLUTINOUS-RICE-R85-20261013-S01` and `S02`; Metro's `Riz noir glutineux` and Food Basics' `Black Glutinous Rice`. | Current Canadian French and English product names support the grain-level row already in the catalog. These are grain listings, not evidence that flour is a form or alias of that grain. Reuse existing IDs. |
| **A4 — existing OQLF/base rice-flour source** | OQLF, [farine de riz (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), existing ledger source `WP02-S27`. | Supports the base term `farine de riz`; its note does not name this black-glutinous product. Reuse the existing source ID and do not infer an OQLF ruling on the compound. |
| **A5 — existing glutinous-rice-flour decision** | Existing record `ingredient-ref-glutinous-rice-flour`, its accepted generic and sweet-rice names, and separate Mochiko/Shiratamako decisions. | Preserve the generic reference and existing named products. The sources do not establish that black glutinous rice flour is a generic alias or a form of those products. No existing measures, conversions, or substitutions are extended by R159. |

## Proposal-only checks

Ownership, source-prefix, archive, static picker, ledger-state, and manifest scans are read-only. This proposal does not modify database JSON or application code; no tests or builds are required.
