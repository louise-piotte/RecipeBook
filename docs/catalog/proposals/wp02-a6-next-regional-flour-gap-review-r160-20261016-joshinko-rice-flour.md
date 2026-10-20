# WP02 Section 04 A6 R160 — Joshinko rice-flour identity review

## Review record

- **Reviewed and current sources checked:** 2026-10-16.
- **Status:** Proposal only. This file proposes one identity and its ledger record; it changes no shared catalog, forms, legacy identities, ledger, recipes, generated files, checklist, roadmap, or integration README.
- **Open checklist:** Continue the regional grain-flour review under [Section 04 A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1452). The current integrated baseline is R159; A6 remains open.
- **Candidate:** `Joshinko`, the named Japanese non-glutinous/ordinary rice-flour product.
- **Proposed reference ID:** `ingredient-ref-joshinko-rice-flour`.
- **Proposal-local source IDs:** `WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S01` through `S04`. The prefix is absent from the live ledger source IDs and archived proposal/batch text before this draft. The IDs remain proposal-local until integration.

## Recommendation

**Accept an identity-only `Joshinko rice flour / farine de riz Joshinko` reference as `ingredient-ref-joshinko-rice-flour`, category `FLOUR_AND_STARCH`. Add the narrowly attested English spelling alias `Joshin ko`; add no French aliases, forms, density, unit mappings, conversion, yield, or substitution rule.** A current Canadian English retail page sells a product under the exact name “Joshinko,” a Canadian French-language listing uses the same product name with a rice-flour descriptor, and Japanese government food references classify Joshinko as ordinary/non-glutinous rice flour and use it separately from glutinous Shiratamako [S01–S04, A1].

Use the French display `farine de riz Joshinko` provisionally. It combines the OQLF-preferred generic term `farine de riz` with the product name retained in Canadian French retail wording. The Canadian listing’s phrase `non glutineux` is not copied into the display: it can read as a claim that the product lacks gluten, while its own ingredient line says `Riz non gluant (Japon)`. The OQLF entry supports only the generic term and does not rule on `Joshinko`; independent Québec French review of the full display remains open [S02, A3].

The prior broad Japanese-flour review did **not** make a Joshinko identity decision. It held Mochiko and Shiratamako while naming Joshinko only as a comparator in the Kushi-dango recipe; the later Mochiko/Shiratamako boundary review again used Joshinko as the ordinary-rice-flour comparator. Those files left Joshinko unassigned rather than rejecting or allocating it [A4–A5]. The fresh Canadian retail and official classification evidence resolves that unassigned identity-level question. It does not resolve the prior concern about regional rice flours lacking a uniform milling standard: record Joshinko as a named milling product without asserting one universal process, grain variety, texture, or composition specification [A2].

Keep Joshinko separate from unqualified `rice flour / farine de riz` as a named product identity, while leaving the family-level row intact. Do not copy broad class descriptors such as `ordinary rice flour`, `short-grain rice flour`, or `non-glutinous rice flour` into aliases. Keep it separate from glutinous rice flour, Mochiko, Shiratamako, and rice grain. The MAFF recipe uses Joshinko and Shiratamako together as separately hydrated ingredients, not as replacements for one another [A1–A2].

## Product and naming boundary

| Material or wording | Decision | Evidence boundary |
|---|---|---|
| `Joshinko rice flour / farine de riz Joshinko` | Add one identity-only `FLOUR_AND_STARCH` reference. | Canadian retail names the current product “Joshinko”; the Canadian French listing retains `Joshinko` with a farine de riz descriptor; MEXT classifies 上新粉 as “Joshinko (ordinary rice flour), washed and milled.” The French display is a provisional catalog construction, not an OQLF entry or verified Québec package panel [S01–S04, A3]. |
| `Joshin ko` | Add as the single English alias. | Maehara Seifun/Gishi itself uses the spaced romanization `Joshin ko` in its English product text and package names. Do not extend this to unverified `Joshin-ko` or other transliterations [S03]. |
| `rice flour / farine de riz` | Keep the current family-level reference. | The OQLF term is a broad category; Joshinko is a named product within that family. A broad search will continue to show the family and named variants together [A3]. |
| `glutinous rice flour`, Mochiko, Shiratamako | Keep the current identities unchanged. | Official classification and the Kushi-dango recipe distinguish Joshinko from glutinous Shiratamako. Do not route Joshinko to any glutinous-rice row or inherit the recipe-specific Shiratamako-to-Mochiko substitution [A1–A2]. |
| `ordinary rice flour`, `short-grain rice flour`, `non-glutinous rice flour` | Do not add as aliases. | These are source descriptors/translations, not exact product titles for a general Joshinko alias. Keeping them off the row avoids turning one named product into the picker’s answer for a broad class query [S01, S03–S04]. |
| `上新粉` | Do not add as a search alias. | Japanese characters identify the source product, but the current bilingual picker normalizer removes non-Latin characters. The proposal keeps the useful Latin product name `Joshinko` searchable and does not create a dead alias [S03–S04]. |
| `farine de riz non glutineux` | Do not use as the French display or alias. | It appears in a Canadian French retailer title, but the same listing’s ingredient line uses `Riz non gluant`. `non glutineux` risks being read as “gluten-free”; neither the OQLF generic entry nor the retailer establishes it as a preferred fr-CA product term [S02, A3]. |

This proposal identifies a named rice-flour product; it does not claim that every product called Joshinko has identical milling, particle size, rice cultivar, formulation, or culinary performance. MAFF explicitly describes regional rice flours as lacking flour-like uniform standards and says milling methods vary [A2].

## Complete proposed reference delta

If accepted, append this one row and leave all current rows unchanged:

~~~json
{
  "id": "ingredient-ref-joshinko-rice-flour",
  "nameFr": "farine de riz Joshinko",
  "nameEn": "Joshinko rice flour",
  "aliasesFr": [],
  "aliasesEn": ["Joshin ko"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
~~~

## Exact ownership, source-ID, archive, and picker audit

The current R159 live snapshot contains **1,534 ingredient references, 119 ingredient forms, and 61 legacy-import candidates**. The research ledger contains **1,879 records, 7,983 source entries, and 6,831 distinct source IDs**.

Exact normalized ownership was checked across reference IDs/names/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs. Normalization follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase NFKD normalization, accent/ligature folding, punctuation-to-space conversion, and whitespace collapse.

| Normalized phrase or ID | Current exact owner or result |
|---|---|
| `joshinko`; `joshinko rice flour`; `farine de riz joshinko`; `joshin ko`; `上新粉` | No exact owner in references, forms, legacy candidates, or ledger record IDs. |
| `ingredient-ref-joshinko-rice-flour` | Absent from references, forms, legacy IDs, and ledger record IDs. Proposed, currently unallocated ID. |
| `rice flour`; `farine de riz` | Exact display owner: `ingredient-ref-rice-flour` (`FLOUR_AND_STARCH`). These are broad family names, not aliases to copy onto the named row. |
| `glutinous rice flour`; `farine de riz gluant` | Current broad query returns the generic glutinous-rice-flour row, black glutinous rice flour, Mochiko, and Shiratamako. Joshinko is not an exact owner and will not join this query. |
| `Joshinko` in R157–R159 archive sweep | Prior Japanese-flour reviews mention it as a comparator; no prior A6 proposal or integration allocated the candidate ID or made a distinct Joshinko identity decision. |
| Source-ID prefix `WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S` | No live ledger source-ID hit and no proposal/batch archive hit before this draft. S01–S04 are proposal-local. Existing source IDs A1–A3 are reused, not reallocated. |

The static picker projection below applies the current phrase-first search behavior; it is not a runtime picker test.

| Query | Current result | Projected result with the proposed row |
|---|---|---|
| `Joshinko`; `Joshinko rice flour`; `farine de riz Joshinko` | No result. | `ingredient-ref-joshinko-rice-flour`. |
| `Joshin ko` | No result. | `ingredient-ref-joshinko-rice-flour` through its narrow English alias. |
| `rice flour`; `farine de riz` | 11 rice-flour references, including the generic, white, brown, glutinous, Mochiko, Shiratamako, red, black, black-glutinous, roasted-red, and wild rows. | The same 11 plus `ingredient-ref-joshinko-rice-flour` (12 total). |
| `glutinous rice flour`; `farine de riz gluant` | Four references: generic glutinous, black glutinous, Mochiko, and Shiratamako rice flours. | Unchanged; the proposed display and alias contain no glutinous-rice phrase. |
| `ordinary rice flour`; `short-grain rice flour`; `non-glutinous rice flour`; `farine de riz non gluant` | No result. | No result; these broad descriptions are not aliases. |
| `Mochiko`; `Shiratamako` | Their current distinct references. | Unchanged. |

## Manifest recipe scan

The current bundled manifest lists **114 recipe files and 1,123 ingredient rows**. The manifest-wide scan found zero recipe-file hits, zero ingredient-row hits, and zero direct reference links for `joshinko`, `joshin ko`, `joshin-ko`, `上新粉`, the proposed English/French displays, or the proposed ID. There is no bundled recipe demand or relink to add.

External culinary evidence does exist: the MAFF Kushi-dango recipe is for four servings and lists 120 g Joshinko alongside 30 g Shiratamako and separate water amounts. Its instructions hydrate the flours separately, then combine them. This is a recipe-specific quantity and use example, not a RecipeBook manifest hit, standard serving size, mass-volume mapping, or substitution [A1].

## Forms, measures, conversions, and substitutions

- **Forms:** Add none. No current rice-flour form is attached to the generic rice flour, generic glutinous flour, Mochiko, or Shiratamako rows. Existing cooked/dry rice forms apply to rice grain, not Joshinko flour.
- **Measurements:** Add no reusable volume-to-mass or portion mapping. The current generic rice-flour and generic glutinous-rice-flour ledger records are `not_yet_researched`; Mochiko and Shiratamako are `researched_no_supported_value` with no observations. None supplies transferable Joshinko evidence. The MAFF 120 g recipe amount may be retained as the single published recipe-amount observation below; it is not a default measure [A1].
- **Conversions and yields:** Add none. Package weights and MEXT nutrient values per edible 100 g do not establish a household measure, density, grain-to-flour yield, or cooking yield [S01, S03–S04].
- **Substitutions:** Add no global rule and no supported substitution finding. The Kushi-dango recipe combines Joshinko with Shiratamako after separately hydrating each; it does not substitute one for the other. The current Shiratamako-to-Mochiko finding is explicitly limited to Télé-Québec’s ice-cream-mochi recipe and must not be transferred to Joshinko [A1, A5].
- **Recipe links:** Add none. The manifest scan found no candidate recipe rows.

## Complete proposed ledger delta

If the reference is accepted, add this new `ingredient_reference` record. Existing source IDs WP02-S74, WP02-JRFP-20261010-S01, and WP02-S27 are reused as cited source records; their source identity is not reallocated.

~~~json
{
  "recordId": "ingredient-ref-joshinko-rice-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S01",
      "url": "https://supplies.gusta.ca/products/mitake-joshinko-non-glutinous-rice-flour-220g?variant=35901179330721",
      "title": "Gusta Supplies, MITAKE Joshinko Japanese non-glutinous rice flour",
      "accessedOn": "2026-10-16",
      "locator": "Product title, description, stock notice, and Markham store address",
      "supports": "The current Canadian English product title uses Joshinko for a Japanese non-glutinous rice flour; the page showed six units in stock at access. The retailer describes short-grain Japonica and contrasts Joshinko with glutinous Mochiko and Shiratamako. These are product-page claims, not a universal milling specification or household measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S02",
      "url": "https://hungry-ninja.ca/fr/products/mitake-joshinko-non-glutinous-rice-flour-220g",
      "title": "Hungry Ninja, French Mitake Joshinko listing",
      "accessedOn": "2026-10-16",
      "locator": "French product title and ingredient line in the indexed listing",
      "supports": "The Canadian French-language listing title is Farine de riz non glutineux Mitake Joshinko (220g), and its ingredient line says Riz non gluant (Japon). Its listed best-before date is 2026-02-16, already past at this review date; use it only as wording evidence, not current availability. The title’s non glutineux wording is not adopted as the catalog display.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S03",
      "url": "https://www.gishi.co.jp/home/item.asp?ct=21",
      "title": "Maehara Seifun / Gishi, Joshinko product category",
      "accessedOn": "2026-10-16",
      "locator": "English product description and listed package titles",
      "supports": "The manufacturer calls the product non-glutinous rice flour Joshin ko and lists multiple Joshinko products. Its own account says it polishes non-glutinous rice, soaks, breaks it down, and dehydrates it. This supports the narrow spaced spelling alias and named-product identity, not a cross-manufacturer process standard, household measure, or substitution.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S04",
      "url": "https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=1_01114_7&MODE=7",
      "title": "MEXT Food Composition Database, item 01114: Joshinko",
      "accessedOn": "2026-10-16",
      "locator": "Food-group path and English food name",
      "supports": "The Japanese Standard Tables entry classifies 上新粉 under cereals/rice/non-glutinous rice products and gives the English name Joshinko (ordinary rice flour), washed and milled. Its per-edible-100-g nutrient basis is not a recipe measure, density, or volume mapping.",
      "sourceKind": "food_composition"
    },
    {
      "sourceId": "WP02-S74",
      "url": "https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/7285/index.html",
      "title": "Japan MAFF, Kushi-dango",
      "accessedOn": "2026-10-06",
      "locator": "Main ingredients, four-serving recipe amounts, and method",
      "supports": "Names Joshinko as short-grain rice flour and Shiratamako as glutinous rice flour. The four-serving recipe lists 120 g Joshinko, 30 g Shiratamako, 50 ml water, and 70 ml hot water; it hydrates the flours separately before combining. This supports a published recipe-amount observation and distinction, not a conversion or substitution.",
      "sourceKind": "culinary_reference"
    },
    {
      "sourceId": "WP02-JRFP-20261010-S01",
      "url": "https://www.maff.go.jp/j/syouan/keikaku/soukatu/okome_summary/09/rice_flour_pro_cessing_03.html",
      "title": "Japan MAFF, rice-flour milling characteristics",
      "accessedOn": "2026-10-10",
      "locator": "Sections 2 and 3: regional rice-flour products and standards",
      "supports": "MAFF identifies Joshinko among rice-flour products and says Joshinko, Shiratamako, and Mochiko lack flour-like uniform standards or definitions, with milling methods varying by region. This limits universal process and texture claims; it does not negate the named-product identity.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-S27",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz",
      "title": "OQLF, farine de riz",
      "accessedOn": "2026-10-05",
      "locator": "Definition and preferred term",
      "supports": "Defines fine powder of milled rice grains and gives farine de riz as the preferred term. It supports the generic French component only; it does not name Joshinko or approve the full proposed display.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [
    {
      "observationId": "joshinko-maff-kushi-dango-120g-four-servings-20261016",
      "relationship": "portion_weight",
      "value": 120,
      "valueUnit": "g",
      "foodDescription": "Joshinko listed in the MAFF Kushi-dango recipe.",
      "foodState": "As listed before preparation; the recipe adds hot water and later combines it with separately hydrated Shiratamako.",
      "measurementMethod": "Published recipe ingredient amount.",
      "quantityBasis": "120 g for the complete four-serving recipe; source-specific recipe quantity only, not a per-person serving recommendation or reusable kitchen measure.",
      "sourceQuantity": {
        "amount": 120,
        "unit": "g"
      },
      "observedMassG": 120,
      "evidenceKind": "published_portion",
      "sourceIds": [
        "WP02-S74"
      ]
    }
  ],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Accept Joshinko rice flour / farine de riz Joshinko as a named identity-only rice-flour product, with the source-attested English spelling alias Joshin ko. Current Canadian English and French retail wording plus MEXT and MAFF classification support the identity. Keep the generic rice-flour family row and the distinct glutinous flour, Mochiko, and Shiratamako identities unchanged. The French full display remains provisional pending independent Québec review; do not assert a universal milling specification, measure, conversion, yield, or substitution.",
      "sourceIds": [
        "WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S01",
        "WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S02",
        "WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S03",
        "WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S04",
        "WP02-S74",
        "WP02-JRFP-20261010-S01",
        "WP02-S27"
      ]
    }
  ]
}
~~~

## Source register

New pages were checked on **2026-10-16**. S01–S04 are unique to R160. A1–A3 reuse existing ledger source IDs; no duplicate source registration is proposed.

| ID | Source and locator | Supports and limits |
|---|---|---|
| **S01 — WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S01** | Gusta Supplies, [MITAKE “Joshinko” — Japanese Non-Glutinous Rice Flour](https://supplies.gusta.ca/products/mitake-joshinko-non-glutinous-rice-flour-220g?variant=35901179330721), title, description, stock notice, Markham location. | Current Canadian English retail title uses Joshinko; page showed six units in stock and identifies the seller in Markham, Ontario. The short-grain Japonica and milling description is retailer copy, not a universal product standard. Package weight is not a household measure. |
| **S02 — WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S02** | Hungry Ninja, [French Mitake Joshinko listing](https://hungry-ninja.ca/fr/products/mitake-joshinko-non-glutinous-rice-flour-220g), product title and ingredient line. | Canadian French title preserves `Joshinko` with a rice-flour descriptor; ingredient line says `Riz non gluant (Japon)`. The item’s displayed best-before date, 2026-02-16, is past; this source supports wording only, not availability. Avoid copying `non glutineux` into the catalog name. |
| **S03 — WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S03** | Maehara Seifun / Gishi, [Joshinko product category](https://www.gishi.co.jp/home/item.asp?ct=21), English description and package titles. | Manufacturer uses `Non-glutinous rice flour “Joshin ko”` and lists multiple Joshinko products. Its own manufacturing account is specific to this company; MAFF reports that regional methods vary. |
| **S04 — WP02-A6-JOSHINKO-RICE-FLOUR-R160-20261016-S04** | MEXT Food Composition Database, [item 01114: Joshinko](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=1_01114_7&MODE=7), food-group path and English name. | Official table classifies 上新粉 as a non-glutinous rice product and translates it as Joshinko (ordinary rice flour), washed and milled. Nutrient values per edible 100 g are not a recipe portion, kitchen measure, or density. |
| **A1 — existing MAFF source, WP02-S74** | Japan MAFF, [Kushi-dango](https://www.maff.go.jp/e/policies/market/k_ryouri/search_menu/7285/index.html), main ingredients, amounts, and method; rechecked 2026-10-16. | Separates Joshinko (short-grain rice flour) and Shiratamako (glutinous rice flour); gives 120 g and 30 g respectively in one four-serving recipe and hydrates them separately. Reuse the existing source ID; no substitution or general measure is inferred. |
| **A2 — existing MAFF source, WP02-JRFP-20261010-S01** | Japan MAFF, [rice-flour milling characteristics](https://www.maff.go.jp/j/syouan/keikaku/soukatu/okome_summary/09/rice_flour_pro_cessing_03.html), sections 2–3; rechecked 2026-10-16. | Names Joshinko among regional rice-flour products and says the class lacks uniform standards/definitions, with regional milling variation. This limits universal process claims; reuse the source ID. |
| **A3 — existing OQLF source, WP02-S27** | OQLF, [farine de riz (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), definition and preferred term; rechecked 2026-10-16. | Supports the generic term `farine de riz`, not a specific Joshinko compound or an official ruling on the proposed display. Reuse the source ID. |
| **A4 — earlier broad review** | [Japanese rice-flour products boundary review, 2026-10-10](wp02-japanese-rice-flour-products-boundary-20261010.md). | Explicitly held Mochiko and Shiratamako. Mentioned Joshinko in the MAFF comparator row and left Japanese product names under review, but did not decide, assign, or reject a Joshinko identity. R160 addresses only that unassigned candidate. |
| **A5 — recent boundary review and integrated state** | [Mochiko/Shiratamako Canadian product boundary review, 2026-10-11](wp02-mochiko-shiratamako-canadian-product-boundary-review-20261011.md); current generic and named rice-flour ledger records. | The follow-up accepts separate Mochiko and Shiratamako identities and uses Joshinko as ordinary rice-flour context. Current generic rice-flour and generic glutinous-flour records have no measure or substitution research; Mochiko has `researched_no_supported_value` and no observations; Shiratamako has no reusable measure plus one recipe-specific Shiratamako-to-Mochiko finding. None is transferable to Joshinko. |

## Proposal-only checks

The exact-key/ID/source-prefix audit, static picker projection, related ledger-state inspection, and current manifest scan are read-only. This is a documentation-only proposal; no tests, builds, or emulator checks were run.
