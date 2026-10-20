# WP03 Section F R83 — sprouted millet identity review

## Review record

- **Reviewed:** 2026-10-13.
- **Chosen open checklist item:** “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps.” The parent Section F item remains open in the [live plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2788); the R82 black-rice-flakes hold is already recorded separately at [line 2803](../../RecipeBook-global-ingredient-catalog-plan.txt#L2803).
- **Recommendation:** Add one identity-only reference, `ingredient-ref-sprouted-millet`, displayed as **sprouted millet / millet germé**, category `GRAIN_AND_CEREAL`. Keep aliases empty.
- **Scope:** The plain, single-ingredient whole millet grain that has been sprouted and dried back to shelf-stable moisture. The reviewed maker does not identify the millet species. This is not a live sprout, flour, malt, cereal blend, or prepared dish.
- **Decision confidence:** Accept the product identity and the bilingual ingredient wording. French sources use `millet germé` in ingredient declarations for Québec-market sprouted-grain products, but neither reviewed French source is a standalone sprouted-millet package. Keep that product-label limitation explicit.
- **Work boundary:** This document is a proposal only. No shared catalog, ledger, checklist, roadmap, recipe, or generated file was edited.

## Product identity and naming

Second Spring Foods currently lists **Organic Sprouted Millet** as a standalone product. Its ingredient declaration contains only Organic Sprouted Millet; the maker identifies its grain type as organic millet and says it dries the grains back to shelf-stable moisture after sprouting [S01]. It offers 454 g and 1.5 kg packages and describes porridge, salad, grain-bowl, fritter, and bread uses. The product page has a selectable package size and add-to-cart control and lists flat-rate shipping to Canada [S01]. The maker’s About page says its sprouting facilities are in Seaforth, Ontario [S02]. These are direct manufacturer sources for a plain, single-ingredient dried grain sold to Canadian customers.

The Québec French manufacturer La Milanaise lists the exact ingredient wording `millet germé` in the French ingredient description for its nine-grain sprouted blend; the page identifies La Milanaise at a Québec address [S03]. The Québec retailer Avril’s French listing for Ezekiel bread independently uses `millet germé biologique` in its ingredient declaration and identifies Avril as a Québec chain [S04]. These sources support `millet germé` as Québec French ingredient wording, not as the title or standalone-label wording of a sprouted-millet SKU. OQLF’s existing `WP03-S20` entry supplies the bilingual generic term `millet` and warns that it can group several species or abbreviate one; it does not name a sprouted product or identify the maker’s millet species.

The product contains one grain ingredient rather than a recipe-ready mixture, and the source describes a grain rather than germinated shoots eaten as sprouts. The sprouting and subsequent drying define the product distinction. Because the source gives no millet species, attaching the process as a form to common/proso, pearl, foxtail, finger, kodo, or another species row would make an unsupported species assignment. Use a separate process-qualified reference, consistent with the catalog’s existing sprouted whole-grain identities. Do not add an `organic` alias: that is a SKU attribute, not part of the identity. Do not represent a universal sprouting or drying protocol.

## Ownership, collision, and archive audit

The post-R82 live snapshot contains **1,409 ingredient references, 104 forms, 1,748 ledger records, and 63 legacy candidates**. The current rows below are linked to their live files: [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [ledger](../research-ledger.v1.json), and [legacy candidates](../legacy-import-identities.v1.json).

| Current owner or overlap | Current data and exact boundary | R83 handling |
|---|---|---|
| Generic millet | [`ingredient-ref-millet`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L10169) owns `millet / millet`, has no aliases, and is supported by the generic-species caveat in [its ledger record](../research-ledger.v1.json#L71597). | Keep unqualified millet and its existing broad search result intact. Sprouted wording does not become a raw-millet alias. |
| Species-qualified millet grains | [ingredient-ref-common-millet](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L4000) owns common millet / millet commun; its English aliases are chena, proso millet, barri, cheno, cheena, cheena millet, and panivaragu, with no French aliases. [ingredient-ref-finger-millet](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L5883) owns ragi, kurakkan, and mandua as English aliases; [ingredient-ref-foxtail-millet](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L6183) owns thinai, kangni, korra, rala, and navane; [ingredient-ref-pearl-millet](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L11772) owns bajra, bajri, sajjalu, kambu, and sajje. Those three rows have no French aliases. | Do not assign a species or add sprouted wording to any one species row. |
| Other millet products | [ingredient-ref-millet-flakes](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L10193) and [ingredient-ref-millet-flour](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L10204) have no aliases. [ingredient-ref-millet-couscous-thiere](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L10180) has English alias tyere. [ingredient-ref-puffed-millet](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L12855) has English alias millet puffs. [ingredient-ref-arraw](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L703) has English millet arraw and French arraw de mil / arraw mil aliases; [ingredient-ref-sankhal](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L14466) has French sanxal / sankhal de mil; [ingredient-ref-thiakry-millet-granules](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L16330) has French thiacry / thiacri. | Keep the candidate separate from flakes, flour, couscous, puffed grain, granules, and precooked products; do not transfer any of these aliases. |
| Existing sprouted grain references | The catalog has [sprouted barley](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L15503), [brown rice](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L15514), [buckwheat](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L15527), [rolled oats](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L15551), and [wheat berries](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L15562), plus sprouted amaranth and buckwheat flour. The grain rows have no aliases except sprouted brown rice’s English alias germinated brown rice; the buckwheat flour row has English alias germinated buckwheat flour. | Add one matching grain identity. Do not merge it with sprouted flour, live sprouts, malt, or composite cereals. |
| Exact candidate and legacy ownership | No current reference or form owns the exact phrases `sprouted millet` or `millet germé`; no live ID `ingredient-ref-sprouted-millet` exists in references, forms, legacy candidates, or ledger records. | The proposed ID and names do not collide with an active owner. Add no legacy mapping. |
| Proposal/archive overlap | The only focused archive hit for “sprouted millet” is the [A6 sprouted pearl-millet flour review](wp02-a6-sprouted-pearl-millet-flour-boundary-review-20261012.md#L17), which keeps a flour product held because it lacks a qualified Québec French product name. Other occurrences describe millet as one ingredient in a flour blend. It does not review or decide a whole dried sprouted-millet grain. R82 concerns black-rice flakes, not millet. | This is a new whole-grain product review. It does not reopen the A6 flour hold, the R82 black-rice hold, or earlier millet identity decisions. |

The current generic millet row and OQLF source do not resolve the sprouted-product scope by themselves. The separate candidate row is justified by the maker’s single-ingredient product and sprouting/drying distinction, not by the word `millet` alone. The four new R83 source IDs below are proposal-local and were absent from the active ledger and earlier proposal/batch archive when checked; `WP03-S20` is explicitly reused from the live generic-millet ledger record.

## Bundled recipe demand

The current manifest lists **114 recipe files and 1,123 ingredient rows**. All manifest-listed recipe JSON was scanned, including full serialized bilingual recipe content, ingredient rows, and ingredient-reference links. Searches covered the proposed ID and `sprouted millet`, `germinated millet`, `millet germé`, and `millet germé biologique`. Results: **0 matching recipe files, 0 matching ingredient rows, and 0 links to any current millet reference**. There is no bundled demand or recipe link to support the row; no recipe association is proposed.

## Picker projection

Projection follows the live [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L48): exact form-term matches take priority, then the index returns all normalized phrase matches, and only then falls back to substring matching. None of the listed query strings is an exact form term in the current 104 forms.

| Query | Current picker result | With the proposed reference |
|---|---|---|
| `sprouted millet` | No result. | The new `ingredient-ref-sprouted-millet` only, via the English name phrase. |
| `millet germé` | No result. | The new `ingredient-ref-sprouted-millet` only, via the French name phrase after accent normalization. |
| `millet` | 18 phrase matches across the generic row, species rows, flour, flakes, puffed millet, and other millet products. | The same 18 plus the proposed row (19 total). This broad query remains broad; the new row does not take over generic millet. |
| `common millet` | `ingredient-ref-common-millet` only. | Unchanged. |
| `pearl millet` or `millet perlé` | The pearl-millet grain and pearl-millet flour rows. | Unchanged. |
| `puffed millet` or `millet soufflé` | `ingredient-ref-puffed-millet` only. | Unchanged; the new row is not a puffed grain. |
| `sprouted` | Seven existing sprouted identities, including flour identities. | The same seven plus sprouted millet (eight total). |
| `millet flour` | Six current millet-flour rows. | Unchanged; no flour alias is added. |

The broad `millet` and `sprouted` queries gain the expected one product result. Exact unqualified/species-specific and puffed-grain queries remain with their current owners. No alias such as `germinated millet`, `organic millet`, or a regional millet name is proposed.

## Measurement, form, conversion, yield, and substitution limits

| Dimension | Source evidence | Proposed handling |
|---|---|---|
| Identity and category | A current standalone product lists only sprouted millet as ingredient and says the grains are dried to shelf-stable moisture [S01]. | Add one `GRAIN_AND_CEREAL` reference for this process-qualified whole-grain product. Do not infer millet species, organic status, or a standardized production protocol. |
| Form | The product is sprouted and dried, but the maker does not identify a base species to which a form can attach. | Add no `IngredientForm`; keep it as a separate identity rather than assigning a sprouted form to a species row. |
| Package and kitchen measurement | The maker lists package sizes **454 g** and **1.5 kg** [S01]. These are retail pack sizes, not serving amounts or volume-to-mass evidence. | Record no package yield, portion weight, density, or unit mapping from the package sizes. Leave `defaultDensity` null and `unitMappings` empty. |
| Cooking directions | The product page says to use **1 part millet to 4 parts water**, rinse, then simmer about **10 minutes** [S01]. It does not state whether “parts” are mass or volume, and the timing is a product-specific preparation direction. | Do not encode a conversion, recipe yield, water mapping, or generic cooking time. The source reports no final cooked mass or volume. |
| Substitution | The manufacturer says to swap it **1:1 for non-sprouted millet** and also suggests it as a substitute for rice, quinoa, or couscous [S01]. It gives no mass/volume basis, dish role, preparation crosswalk, or method adjustments. | Preserve this only as a rejected, product-specific suggestion. Add no global form conversion or contextual ingredient substitution. Set the future research state to `researched_no_supported_substitute`. |

The maker’s amounts and timings are useful product evidence but do not supply reusable application conversions or yields. Proposed measurement state is `researched_no_supported_value`; no `measurementObservations`, default value, form conversion, package yield, recipe link, or active substitution rule is proposed.

## Exact future JSON delta

If accepted for a later integration, add exactly this reference object to `ingredient-references.v1.json`. The French accent is escaped to follow the bundled JSON text rule:

```json
{
  "id": "ingredient-ref-sprouted-millet",
  "nameEn": "sprouted millet",
  "nameFr": "millet germ\u00e9",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Append one ledger record keyed by the same ID. It carries no measurement observations. The no-supported-substitute finding records why the manufacturer’s broad suggestion does not become a runtime rule:

```json
{
  "recordId": "ingredient-ref-sprouted-millet",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP03-R83-SPROUTED-MILLET-S01",
      "url": "https://secondspringfoods.com/product/organic-sprouted-millet/",
      "title": "Second Spring Foods, Organic Sprouted Millet",
      "accessedOn": "2026-10-13",
      "locator": "Product identity, ingredient declaration, pack sizes, cooking instructions, and storage description",
      "supports": "The maker sells a single-ingredient sprouted millet grain, identifies the grain type only as organic millet, and says it dries the grain to shelf-stable moisture. Package sizes, a product-specific water ratio and cooking time, and replacement suggestions do not establish a generic measure, yield, or substitution rule.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-R83-SPROUTED-MILLET-S02",
      "url": "https://secondspringfoods.com/about/",
      "title": "Second Spring Foods, About Us",
      "accessedOn": "2026-10-13",
      "locator": "Everspring Farms facility and Second Spring Foods company description",
      "supports": "The manufacturer says Everspring Farms operates two sprouting facilities in Seaforth, Ontario and that Second Spring Foods sells sprouted foods directly to individuals. This establishes Canadian maker context, not a millet species or process standard.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-R83-SPROUTED-MILLET-S03",
      "url": "https://lamilanaise.com/produits/melange-9-grains-germes-biologique/",
      "title": "La Milanaise, M\u00e9lange 9 grains germ\u00e9s biologique",
      "accessedOn": "2026-10-13",
      "locator": "French product description and company address",
      "supports": "The Qu\u00e9bec manufacturer lists millet germ\u00e9 as an ingredient in its nine-grain sprouted blend and gives a Saint-Jean-sur-Richelieu, Qu\u00e9bec address. This supports ingredient wording only; it is not a standalone millet product label.",
      "sourceKind": "manufacturer"
    },
    {
      "sourceId": "WP03-R83-SPROUTED-MILLET-S04",
      "url": "https://avril.ca/fr/ezekiel-4-9-pain-100-grains-germes-entiers-et-lin.html",
      "title": "Avril, Ezekiel 4:9 biologique — pain 100 % grains germ\u00e9s entiers et lin",
      "accessedOn": "2026-10-13",
      "locator": "French ingredient declaration and Avril company description",
      "supports": "The Qu\u00e9bec retailer’s French product listing names millet germ\u00e9 biologique as an ingredient of a finished sprouted-grain bread. It corroborates local ingredient wording, not a standalone millet label or a measure.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP03-S20",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet",
      "title": "OQLF, millet",
      "accessedOn": "2026-10-06",
      "locator": "French preferred terms, English translation, and generic-use note",
      "supports": "Supports the bilingual generic word millet and warns that it can group multiple species or abbreviate one. It does not identify the maker’s millet species or name a sprouted product.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add sprouted millet / millet germ\u00e9 as a process-qualified, single-ingredient dried-grain identity. Keep species unspecified and aliases, forms, measurements, conversions, yields, recipe links, and active substitutions empty.",
      "sourceIds": [
        "WP03-R83-SPROUTED-MILLET-S01",
        "WP03-R83-SPROUTED-MILLET-S02",
        "WP03-R83-SPROUTED-MILLET-S03",
        "WP03-R83-SPROUTED-MILLET-S04",
        "WP03-S20"
      ]
    }
  ],
  "substitutionFindings": [
    {
      "findingId": "sprouted-millet-maker-substitution-claim-20261013",
      "researchState": "researched_no_supported_substitute",
      "context": "Second Spring's suggestion to swap its sprouted millet 1:1 for non-sprouted millet, or to use it in place of rice, quinoa, or couscous.",
      "basis": "The manufacturer does not state whether 1:1 means volume or mass, and gives no dish role, preparation crosswalk, or method adjustment. The other alternatives have no replacement amount or tested cooking method.",
      "limitations": [
        "This source is one maker's product claim and does not generalize to every sprouted millet.",
        "Do not infer an equal mass or volume replacement.",
        "Do not create a rice, quinoa, or couscous substitution rule."
      ],
      "rejectedCandidates": [
        {
          "candidate": "Use sprouted millet as a general 1:1 replacement for unsprouted millet, rice, quinoa, or couscous.",
          "reason": "The source does not define the quantity basis or provide context and method changes needed for a safe reusable rule.",
          "sourceIds": ["WP03-R83-SPROUTED-MILLET-S01"]
        }
      ],
      "sourceIds": ["WP03-R83-SPROUTED-MILLET-S01"]
    }
  ]
}
```

No form, legacy mapping, recipe link, density, unit mapping, conversion, cooking or package yield, or active substitution rule is part of this delta. Any future integration limited to database JSON additions needs no app tests under the current [AGENTS.md rule](../../../AGENTS.md#L22).

## Source register and evidence limits

| ID | Source and locator | Supports | Limit |
|---|---|---|---|
| **WP03-R83-SPROUTED-MILLET-S01** | Second Spring Foods, [Organic Sprouted Millet](https://secondspringfoods.com/product/organic-sprouted-millet/), product/ingredient panel, package selectors, cooking instructions, and storage description. | Direct manufacturer source for the standalone plain product, one-ingredient statement, generic grain type, post-sprouting drying, uses, sizes, cooking directions, and maker substitution claims. | It does not identify a millet species, define a standard production protocol, provide a kitchen volume-to-mass measure, or establish a reusable conversion, yield, or substitution. |
| **WP03-R83-SPROUTED-MILLET-S02** | Second Spring Foods, [About Us](https://secondspringfoods.com/about/), Everspring Farms facility and brand description. | Canadian manufacturer context: Ontario sprouting facilities and a direct-to-consumer brand. | Does not specify where this SKU’s millet was grown, its species, or a universal process. |
| **WP03-R83-SPROUTED-MILLET-S03** | La Milanaise, [Mélange 9 grains germés biologique](https://lamilanaise.com/produits/melange-9-grains-germes-biologique/), French ingredient statement and Québec address. | Exact Québec manufacturer ingredient term `millet germé`; supplier is based in Saint-Jean-sur-Richelieu, Québec. | It is one constituent in a nine-grain sprouted blend, not a standalone product name or product specification for millet alone. |
| **WP03-R83-SPROUTED-MILLET-S04** | Avril, [Ezekiel 4:9 bread](https://avril.ca/fr/ezekiel-4-9-pain-100-grains-germes-entiers-et-lin.html), French ingredient declaration. | Independent Québec retailer wording `millet germé biologique` in a sprouted-grain product. | A bread ingredient listing; product availability may change and it does not establish a standalone SKU or quantity. |
| **WP03-S20** (reused live ledger source) | OQLF, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), generic term and species note. | Québec bilingual generic term and warning about unqualified species scope. | Does not name this process-qualified product or identify its millet species. |

## Static review record

Static review on 2026-10-13: the proposal was saved as UTF-8 without BOM, ends with a newline, and has no trailing whitespace. The reference JSON example and ledger record example parse as JSON; field names and enum values match the current reference row shape and [research-ledger schema](../research-ledger.schema.json). The live references, forms, ledger, legacy file, manifest, and all 114 manifest-listed recipe JSON files parsed successfully; snapshot totals and the 1,123 ingredient-row count match the values above. Candidate ID/name scans found no active or legacy owner. Archive search found only the separate A6 sprouted pearl-millet flour review; no earlier whole dried sprouted-millet grain decision was found. New R83 source IDs are unique within the source register and absent from the current ledger and prior archive; the reused `WP03-S20` source ID is present on the existing generic-millet ledger record. Local Markdown links and line anchors were checked after writing. Picker results were projected from the current phrase-first, exact-form-priority behavior; no listed query is an exact form term. No tests or emulator were run for proposal-only research.
