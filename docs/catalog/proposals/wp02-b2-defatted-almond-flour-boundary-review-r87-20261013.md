# WP02 B2 — Defatted almond flour identity review (R87)

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. This is the only file written by this review.
- **Open checklist item:** Section 04, B2, line 1832: `[ ] Almond flour versus almond meal; hazelnut, coconut, chestnut, peanut, chickpea/besan, lentil, pea, soy, and lupin flours.` See the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L1832).
- **Candidate:** Defatted almond flour, made by milling almond material after oil removal. The parent item already keeps almond flour and almond meal under review; this packet examines the separate oil-removed product boundary.
- **Source-ID prefix:** `WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013`. IDs are proposal-local and are not present in the shared ledger.
- **Snapshot:** 1,418 ingredient references, 104 forms, 1,757 ledger records, 63 legacy candidates, 114 bundled recipes, and 1,123 recipe ingredient rows.

## Recommendation

**Integrate one identity-only `FLOUR_AND_STARCH` reference** for **defatted almond flour / farine d’amande déshuilée**. Add the directly attested qualified French alias **poudre d’amande partiellement déshuilée**. The French phrases are attested on current Québec retail product pages, but only inside composite product ingredient declarations; no standalone Québec package or OQLF entry for this flour was found. The display normalizes those local ingredient terms transparently rather than claiming a regulated or universal French product name. [S01, S06–S09]

Bound the identity to almond material with some oil removed and then milled as food flour, including press-cake flour. Oil removal changes the ingredient material and is a stable enough product boundary to distinguish it from whole-ground almond flour/meal. The reviewed sources show that the degree and extraction process vary, so the row must not claim one residual-fat threshold, a specific extraction method, or one protein grade. Keep ordinary almond flour/meal, whole almonds, almond oil, almond butter, and protein isolates outside this row. [S01–S05]

This is an identity decision only. Add no forms, density, unit mappings, conversions, package yield, recipe links, or substitutions. The current recipe corpus has two ordinary almond-flour lines but no defatted-almond-flour demand. [S02–S05]

## Product and language boundary

| Term or material | Decision | Evidence boundary |
|---|---|---|
| **Defatted almond flour** | Add one separate flour identity. | The Almond Board defines it as finely ground almond flour with a percentage of oil removed. Blue Diamond's FDA notice describes a partially defatted almond protein flour made by pressing almonds, crumbling the cake, and milling it. These sources support an oil-removed flour product class, not a universal process or specification. [S01–S03] |
| **`farine d’amande déshuilée`** | Use as the French display. | A Québec retailer's French ingredient declaration names `farine d’AMANDE déshuilée` and says the flour is the solid coproduct of oil extraction. It appears inside almond purée, not on a standalone flour package. Use the phrase as a source-attested display with that scope stated. [S06] |
| **`poudre d’amande partiellement déshuilée`** | Add as one qualified French alias. | A Québec retailer and the Canadian French product page for Le Pain des Fleurs almond crisps both use this phrase in the ingredient list. It identifies 12% of the crisp ingredient formula, not 12% residual oil or a standalone flour product. The full qualified phrase is searchable; do not add unqualified `poudre d’amande` or plural `poudre d’amandes` to the new row. [S07–S08] |
| **`partially defatted almond protein flour`** | Treat as FDA-notice terminology, not an alias. | The phrase names Blue Diamond's notified product, whose process and specifications are manufacturer-specific. Keeping it out of aliases avoids making the narrower “protein flour” wording a synonym for every defatted almond flour. [S02–S03] |
| Ordinary almond flour and almond meal | Keep on the current ordinary almond-flour row; do not merge them into this identity. | Existing almond-flour reviews leave meal unassigned where grind and market labels overlap, while noting defatted flour as a distinct boundary. Ordinary whole-ground flour or meal is not shown to have undergone oil extraction. [live catalog; prior reviews] |
| Almond protein powder, almond protein isolate, and generic almond powder | Keep unassigned to this row. | The FDA notice describes a mechanically produced flour; it does not establish equivalence to isolates or every product called almond protein powder. The source's qualified FDA phrase is not an active search alias. [S02–S03] |

OQLF confirms **amande** as the common food term for sweet almond, but it has no entry for this flour compound. The French display is grounded in Québec ingredient-label usage, not an OQLF terminology ruling or evidence that a standalone flour bag is sold locally. [S06–S09]

## Ownership and archive audit

The live ordinary owner is `ingredient-ref-almond-flour`, displayed as `almond flour / farine d'amande`, category `FLOUR_AND_STARCH`. Its French aliases are `poudre d'amande` and `poudre d'amandes`; its English aliases are empty; density is null and unit mappings are empty. The whole-food owner is `ingredient-ref-almonds` (`almonds / amandes`, with English alias `whole almonds`). Existing almond forms are blanched, finely chopped, and sliced whole almonds; none belongs to the flour row. No active reference, form, legacy candidate, or ledger identity owns defatted almond flour or the proposed ID. [live references, forms, ledger, and legacy-import identities]

The catalog already has separate defatted-flour references for coconut, tigernut, and poppy seed, plus partially defatted peanut flour. These are relevant catalog precedents for representing oil-removed flour as a separate identity; they do not supply almond measurements or product specifications. [live references]

The archive includes the earlier [almond flour/meal boundary review](wp02-almond-flour-meal-boundary-review-20261010.md) and [almond measurement follow-up](wp02-b2-almond-flour-measurement-followup-20261012.md). Those retain the ordinary row, remove the broad `ground almonds` alias, and explicitly leave defatted almond flour outside their measurement/substitution scope. The measurement packet mentions `ingredient-ref-defatted-almond-flour` only as an unallocated ID it does not reserve or create; it does not assess or reject the separate identity. No focused defatted-almond-flour review or integration batch was found. The proposed ID has no active catalog, form, ledger, or legacy owner, and the R87 source-ID prefix is unused in the archive.

## Picker projection

The current [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes accents and punctuation, then returns contiguous normalized word-phrase matches before substring fallback. This static projection applies the current matcher to the live references and the proposed reference, including its one French alias.

| Query | Current result | Projected result | Boundary |
|---|---|---|---|
| `almond flour` | `ingredient-ref-almond-flour` | `ingredient-ref-almond-flour`; `ingredient-ref-defatted-almond-flour` | General flour wording shows both ordinary and oil-removed almond flour. |
| `defatted almond flour` | No result | `ingredient-ref-defatted-almond-flour` | Qualified English product phrase selects only the new identity. |
| `farine d’amande` | `ingredient-ref-almond-flour` | `ingredient-ref-almond-flour`; `ingredient-ref-defatted-almond-flour` | General French flour wording shows both products. |
| `farine d’amande déshuilée` | No result | `ingredient-ref-defatted-almond-flour` | Qualified French display selects only the new identity. |
| `poudre d’amande` | `ingredient-ref-almond-flour` | `ingredient-ref-almond-flour`; `ingredient-ref-defatted-almond-flour` | The existing ordinary alias and new qualified alias both contain this contiguous phrase; presenting both options is truthful for this broad query. |
| `poudre d’amande partiellement déshuilée` | No result | `ingredient-ref-defatted-almond-flour` | Full local ingredient phrase selects only the new identity. |
| `poudre d’amandes` | `ingredient-ref-almond-flour` | `ingredient-ref-almond-flour` | The current plural alias remains on ordinary almond flour; the new singular qualified alias does not match the plural phrase. |
| `almond` / `amande` | Five almond references | The same five plus `ingredient-ref-defatted-almond-flour` | Broad source-name searches show another selectable almond product. |
| `almonds` / `amandes` | `ingredient-ref-almonds` | `ingredient-ref-almonds` | Whole-almond plural queries remain on the whole-food row. |
| `farine` | 136 results | 137 results | A broad category query adds one flour option; the picker remains multi-result. |
| `almond protein powder` | No result | No result | No protein-powder or isolate alias is added. |

The qualified display naturally causes broad `almond flour` and `farine d’amande` searches to show two products. The exact terms remain unique, and the two French powder queries are projected separately because the matcher does not stem singular and plural tokens. No picker code change is proposed.

## Recipe demand, numeric evidence, and substitution limits

The full bundled corpus contains **114 recipes and 1,123 ingredient rows**. Two rows use the existing ordinary `ingredient-ref-almond-flour`: 150 g in Linzer cookies and 113 g in almond frangipane mini tarts. No recipe text or ingredient row contains a defatted-almond-flour phrase, and no recipe references the proposed ID. These are ordinary almond-flour quantities, not a demand signal or measurement source for this candidate.

The numerical evidence is product- or experiment-specific:

- The FDA notice's specifications for Blue Diamond's notified flour list fat at **5.3–12% as-is**. This is one producer's specification range for its partially defatted protein flour, not a generic identity threshold. FDA's page records a 2021 closure and “no questions” letter concerning the notifier's GRAS conclusion; it is not an FDA approval of every defatted almond flour or a Canadian authorization. [S02–S03]
- Roncero et al. report sample crude-fat values of **27.40%** for flour from their hydraulic-press cake and **8.63%** for flour from their screw-press cake; protein was **44.46%** and **55.88%**, respectively. These are samples from defined experimental press conditions and show why no universal residual-fat, protein, or extraction-yield value should be encoded. [S04]
- Naturitas Canada's listed **125 g** size is one package amount. La Moisson's almond-purée page claims **15% less fat** and **25% more protein** for that finished purée due to adding press-cake flour; the crisps' **12%** is the share of that product's recipe attributed to the qualified almond powder. None is a cup weight, flour density, serving conversion, or flour fat percentage. [S05–S07]
- Naturitas says its flour can replace wheat flour “to a greater extent” but gives no transferable amount. The FDA notice's use levels vary by U.S. food category and are formulation-use assumptions, not household substitution ratios. Do not encode either as a baking rule. [S02–S03, S05]

No reviewed source provides a reusable mass-per-volume measurement, cup weight, unit mapping, generic milling yield, or same-ingredient conversion. Add no form or package-yield record. Recipe and manufacturer application statements do not establish a general equal-mass or percentage substitution for ordinary almond flour, wheat flour, almond meal, or any other ingredient. Record substitution research as reviewed with no supported reusable rule.

## Exact prospective JSON delta

Add one reference only:

```json
{
  "id": "ingredient-ref-defatted-almond-flour",
  "nameFr": "farine d\u2019amande d\u00e9shuil\u00e9e",
  "nameEn": "defatted almond flour",
  "aliasesFr": ["poudre d\u2019amande partiellement d\u00e9shuil\u00e9e"],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Append this research-ledger record with no measurements or substitutions:

```json
{
  "recordId": "ingredient-ref-defatted-almond-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S01",
      "url": "https://www.almonds.org/why-almonds/almonds-in-many-forms/defatted-almond-flour",
      "title": "Almond Board of California, Defatted Almond Flour",
      "accessedOn": "2026-10-13",
      "locator": "Definition and product uses.",
      "supports": "Defines defatted almond flour as finely ground flour with a percentage of oil removed. Supports a distinct food-flour process class, not a residual-fat threshold or household substitution rule.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S02",
      "url": "https://hfpappexternal.fda.gov/Scripts/Fdcc/index.cfm?id=918&set=GRASNotices",
      "title": "U.S. FDA, GRAS Notice 918: Partially defatted almond protein flour",
      "versionOrDate": "Closed July 7, 2021",
      "accessedOn": "2026-10-13",
      "locator": "Notice identity, intended food uses, closure date, and FDA letter status.",
      "supports": "Records Blue Diamond Growers' notified product and intended food uses, and a 2021 closure with an FDA no-questions letter concerning the notifier's GRAS conclusion. This does not establish Canadian authorization or a universal flour standard.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S03",
      "url": "https://www.fda.gov/media/141213/download",
      "title": "Blue Diamond Growers, GRAS Notice 918: Partially defatted almond protein flour",
      "versionOrDate": "2020-02-19 submission; FDA closure 2021-07-07",
      "accessedOn": "2026-10-13",
      "locator": "Sections 2.1–2.3, pages 6–8; product specification table; proposed food-use table.",
      "supports": "Describes a Blue Diamond flour made from natural or blanched almonds by mechanical oil pressing, cake crumbling, milling, and thermal treatment. Its 5.3–12% as-is fat specification is product-specific; the stated U.S. use levels are not household recipe replacement guidance.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S04",
      "url": "https://doi.org/10.3390/foods10051049",
      "title": "Roncero et al., Influence of Pressure Extraction Systems on the Performance, Quality and Composition of Virgin Almond Oil and Defatted Flours",
      "versionOrDate": "Foods 2021, 10, 1049",
      "accessedOn": "2026-10-13",
      "locator": "Methods for oil extraction and press-cake flour, Section 3.4 and Table 2.",
      "supports": "Primary research mills almond press cake into flour and reports process-specific samples: crude fat 27.40% hydraulic versus 8.63% screw press, and protein 44.46% versus 55.88%. These experimental values are not generic specifications, density, or recipe measures.",
      "sourceKind": "food_composition"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S05",
      "url": "https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/flours/almond-flour/eco-defatted-almond-flour-125-g-salud-viva",
      "title": "Naturitas Canada, Salud Viva Eco defatted almond flour",
      "accessedOn": "2026-10-13",
      "locator": "Product title, package size, product description, and origin statement.",
      "supports": "Canadian storefront lists a 125 g almond flour sold as defatted and describes it as a food product for pastries and other foods; its stated origin is Spain. The page does not confirm delivery timing to Québec or supply a reusable measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S06",
      "url": "https://lamoisson.com/products/beurre-damande-complete",
      "title": "La Moisson, Beurre d'amande complète",
      "accessedOn": "2026-10-13",
      "locator": "French product description, ingredient declaration, and Québec delivery details.",
      "supports": "Québec retailer lists `farine d'AMANDE déshuilée` as an ingredient in almond purée and says the flour is the solid coproduct of oil extraction. It is composite-product ingredient evidence, not a standalone flour package or universal process specification.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S07",
      "url": "https://lamoisson.com/collections/collations-craquelins-croustilles-snacks-crakers-chips/products/tartines-craquantes-amande-bio",
      "title": "La Moisson, Tartines craquantes — Amande bio",
      "accessedOn": "2026-10-13",
      "locator": "Québec retailer ingredient declaration and delivery scope.",
      "supports": "French product listing names `poudre d'amande partiellement déshuilée` as 12% of an almond-crisp ingredient formula. The 12% is not the flour's residual-fat level or a household measure; the phrase is a composite-product ingredient label, not a standalone flour SKU.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S08",
      "url": "https://www.lepaindesfleurs.com/ca-fr/nos-produits/tartines-craquantes-bio-a-lamande-3/",
      "title": "Le Pain des Fleurs Canada, Tartines Craquantes Bio à l'Amande",
      "accessedOn": "2026-10-13",
      "locator": "Canadian French product ingredient declaration.",
      "supports": "Manufacturer's Canadian French product page uses `Poudre d'AMANDE partiellement déshuilée` in the ingredient list for almond crisps. It confirms Canadian French phrase usage for a composite ingredient, not a standalone almond-flour package.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S09",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297061/amande-douce",
      "title": "OQLF, amande douce (GDT)",
      "accessedOn": "2026-10-13",
      "locator": "Preferred French term and common-name note for the edible sweet almond.",
      "supports": "Confirms `amande` as the common Québec French food name for sweet almond. It does not define defatted almond flour or attest its compound name.",
      "sourceKind": "regional_authority"
    }
  ],
  "measurementObservations": [],
  "substitutionFindings": [],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add one identity-only defatted almond flour / farine d’amande déshuilée reference, with the qualified French ingredient phrase poudre d’amande partiellement déshuilée as an alias. The phrase is attested in Québec composite-product ingredient declarations; no standalone Québec flour package was found. Keep oil-removal process variation and product-specific numeric data out of active fields; add no forms, measures, conversions, yields, recipes, or substitutions, and keep ordinary whole-ground almond flour/meal and protein isolates separate.",
      "sourceIds": [
        "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S01",
        "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S02",
        "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S03",
        "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S04",
        "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S05",
        "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S06",
        "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S07",
        "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S08",
        "WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S09"
      ]
    }
  ]
}
```

## Source register

Sources were checked on 2026-10-13. Each source ID is local to this proposal and maps to the same ID in the prospective ledger record above.

| ID | Source and support | Limits |
|---|---|---|
| **WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S01** | Almond Board of California, [Defatted Almond Flour](https://www.almonds.org/why-almonds/almonds-in-many-forms/defatted-almond-flour). Defines finely ground flour with some oil removed and describes food uses. | Board's description is a product-class definition, not a universal removal percentage, measure, or local naming source. |
| **WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S02** | U.S. FDA, [GRAS Notice 918](https://hfpappexternal.fda.gov/Scripts/Fdcc/index.cfm?id=918&set=GRASNotices). Names the notifier's partially defatted almond protein flour, intended food uses, closure date, and no-questions-letter status. | A U.S. notifier GRAS notice and FDA no-questions response are not a Canadian authorization, FDA approval, or universal almond-flour standard. |
| **WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S03** | Blue Diamond Growers, [GRAS Notice 918 PDF](https://www.fda.gov/media/141213/download). Describes mechanical oil pressing, crumbling press cake, milling, and one product's specs/use levels. | One manufacturer's product and U.S. intended-use proposal; its fat range and formulation percentages are not generic identity or recipe-conversion data. |
| **WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S04** | Roncero et al., [Influence of Pressure Extraction Systems on the Performance, Quality and Composition of Virgin Almond Oil and Defatted Flours](https://doi.org/10.3390/foods10051049), *Foods* 10 (2021), 1049. Primary study mills press cake and compares hydraulic- and screw-press flour composition. | Experimental variety and press conditions only. Reported fat/protein are sample composition, not a commercial threshold, measure, density, or transferable substitution. |
| **WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S05** | Naturitas Canada, [Salud Viva Eco defatted almond flour](https://www.naturitas.ca/p/food/cereals-legumes-and-pasta/flours/almond-flour/eco-defatted-almond-flour-125-g-salud-viva). Lists an actual 125 g defatted-flour food SKU. | Canadian storefront; product origin Spain and no confirmed delivery date in the page. Package mass is not portion or conversion evidence. |
| **WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S06** | La Moisson, [Beurre d'amande complète](https://lamoisson.com/products/beurre-damande-complete). Québec French ingredient declaration uses `farine d’AMANDE déshuilée` and identifies it as the solid coproduct of oil extraction. | Flour appears inside almond purée; this is not a standalone flour package. The product page's finished-purée nutrition claims do not describe the flour alone. |
| **WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S07** | La Moisson, [Tartines craquantes — Amande bio](https://lamoisson.com/collections/collations-craquelins-croustilles-snacks-crakers-chips/products/tartines-craquantes-amande-bio). Québec retailer ingredient declaration uses `poudre d’amande partiellement déshuilée`; page identifies 12% in the composite crisp and Québec delivery. | The percentage is the named ingredient's share of the crisp product formula, not a defatting rate or flour measure. The source is a composite product page. |
| **WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S08** | Le Pain des Fleurs Canada, [Tartines Craquantes Bio à l'Amande](https://www.lepaindesfleurs.com/ca-fr/nos-produits/tartines-craquantes-bio-a-lamande-3/). Canadian French manufacturer page repeats the qualified powder wording in the ingredient declaration. | Confirms phrase usage in a composite crisp, not a standalone flour product or Québec terminology ruling. |
| **WP02-B2-DEFATTED-ALMOND-FLOUR-R87-20261013-S09** | OQLF, [amande douce (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297061/amande-douce). Supports the food base term `amande` for sweet almond. | Does not attest defatted almond flour or its complete French compound. |

## Static review record

- Re-read current `AGENTS.md`, Section 04 B2 text, the live reference and form catalogs, ledger, legacy candidates, relevant proposals/batches, and current `IngredientSearch.kt`.
- Confirmed current counts: 1,418 references, 104 forms, 1,757 ledger records, 63 legacy candidates, and 114 recipes / 1,123 ingredient rows.
- Audited the ordinary almond-flour owner, its current aliases, whole-almond forms, previous almond flour/meal decisions, related defatted-flour precedents, recipe corpus, and candidate ID/source-prefix collisions.
- Projected singular/plural French queries separately against the exact current matcher. Confirmed `poudre d’amande` adds both almond-flour identities while `poudre d’amandes` remains on the existing ordinary row.
- Rechecked the Almond Board page, FDA notice and dossier, primary press-cake study, Canadian retailer listing, Québec French ingredient pages, Canadian French manufacturer page, and OQLF base term. Kept source-specific numbers and the lack of a standalone Québec flour package explicit.
- Static checks only: UTF-8 without BOM, final newline, no trailing whitespace, source IDs unique and mapped to the register, all JSON snippets parse, ledger fragment matches the ledger schema, reference fields match the live catalog shape, and all local Markdown links resolve. HTTPS source links were opened or searched and are recorded above.
- No tests, Gradle, emulator, app code, or shared catalog/ledger/plan/roadmap files were changed.
