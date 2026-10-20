# WP02 A6 black fonio flour identity review — 2026-10-11

## Review record

- **Reviewed:** 2026-10-11.
- **Coordinator status:** Integrated on 2026-10-11 as one identity-only reference and ledger record. No recipe, form, measurement, or substitution data was added.
- **Scope:** Decide whether black fonio (*Digitaria iburua*) supports a separate culinary flour reference beside the existing black-fonio grain and white-fonio flour identities.
- **Proposal-local source IDs:** `WP02-A6-BLACK-FONIO-FLOUR-20261011-S01` through `S04`. They are unique to this report and are not research-ledger entries.

## Recommendation

**Accept one identity-only flour reference** for food flour made from black fonio (*Digitaria iburua*):

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-black-fonio-flour` |
| English display | `black fonio flour` |
| French display | `farine de fonio noir` |
| Category | `FLOUR_AND_STARCH` |
| English aliases | none |
| French aliases | none |
| Default density | `null` |
| Unit mappings | `[]` |
| Forms, recipe links, conversions, yields, substitutions | none |

The product identity is supported by food-science studies that separately identify flour made from *D. iburua*. The Canadian terminology record TERMIUM Plus standardizes English `black fonio` and French `fonio noir` for that species. `Farine de fonio noir` is a transparent French product-name construction from that Canadian species term and the flour class; no Canadian or Québec retail label for black-fonio flour was found. Keep independent Québec review of this display open. Do not use `iburu flour`, `farine de manne noire`, or `farine d'ibourou` as aliases: the reviewed sources do not establish these as flour product labels.

## Reconciliation with prior work

The current [A6 fonio identity and boundary review](wp02-fonio-flour-identity-boundary-review-20261011.md) retains `ingredient-ref-fonio-flour` as `fonio flour / farine de fonio`, backed by a Canadian product made from *D. exilis*. It leaves black-fonio flour unassigned because its sources did not document flour made from *D. iburua*. The earlier [regional grain-flour gap proposal](wp02-a6-regional-grain-flour-gaps-20261010.md) likewise scoped that base row to white fonio and held black-fonio flour for lack of product evidence.

This follow-up addresses only that missing species-to-flour evidence. It does not reopen the accepted generic white-fonio-flour row or the held roasted and precooked fonio flour products. Québec retailer Mako Foods currently lists those qualified flour products without naming the source species; this review does not map them to black fonio [S04].

## Current catalog, form, ledger, and name audit

At the read-only snapshot on 2026-10-11, the bundled catalog contained **1,020 references** and **69 forms**. The research ledger contained **1,303 records**. The manifest listed **114 recipes** with **1,123 ingredient rows**.

| Existing item | Current identity | Disposition here |
| --- | --- | --- |
| `ingredient-ref-black-fonio` | `black fonio / fonio noir`, `GRAIN_AND_CEREAL`, no aliases | Retain as the grain identity; do not convert it into flour or add a flour form. |
| `ingredient-ref-white-fonio` | `white fonio / fonio blanc`, `GRAIN_AND_CEREAL`; carries source-supported grain terms including `fonio` and `acha` | Retain unchanged. |
| `ingredient-ref-fonio-flour` | `fonio flour / farine de fonio`, `FLOUR_AND_STARCH`; English alias `acha flour` | Retain as the existing *D. exilis* flour identity. Do not broaden it to black fonio. |
| Fonio-related forms | none | No form is proposed. |
| Ledger entry for black-fonio flour | none | `ingredient-ref-black-fonio-flour` is free as a new reference and ledger record ID. |

Exact normalized-name checks used the project search-key normalizer against every current reference name and alias and every form label and match term. No exact owner exists for `black fonio flour`, `whole grain black fonio flour`, `farine de fonio noir`, `farine complète de fonio noir`, `iburu flour`, or `farine de manne noire`. Existing exact owners are `ingredient-ref-black-fonio` for `black fonio` / `fonio noir`, and `ingredient-ref-fonio-flour` for `fonio flour` / `farine de fonio`. The proposed qualified flour name keeps these source-grain and flour products distinct. Broader `fonio` queries may return the grain and both flour choices.

The proposed reference ID was absent from active references, forms, legacy candidates, and ledger record IDs. The source-ID prefix was absent from current ledger entries. No existing form describes black fonio flour.

## Bundled recipe demand

I read every manifest-listed recipe file and every ingredient row. Matching used the project search-key normalization and checked `originalText`, `ingredientName`, `preparation`, and `notes`, followed by a full serialized-recipe search.

| Candidate phrases searched | Ingredient-row matches | Recipe-file matches |
| --- | ---: | ---: |
| `black fonio flour`; `whole grain black fonio flour`; `farine de fonio noir`; `farine complète de fonio noir`; `farine de manne noire`; `black acha flour`; `iburu flour` | 0 | 0 |
| `fonio flour`; `farine de fonio`; `black fonio`; `fonio noir`; `Digitaria iburua`; `iburu`; `ibourou`; `manne noire` | 0 | 0 |

Across the full corpus, the result was **0 matching ingredient rows in 114 recipes / 1,123 rows** and **0 full-recipe JSON hits** for each phrase. There is no current recipe link or recipe-driven alias request. The regional flour identity is a catalog-coverage decision only.

## Product and name evidence

The evidence now supports a narrow flour identity that was not available in the earlier A6 hold:

- A 2025 *Journal of Cereal Science* paper is explicitly titled around **whole-grain fonio flour (*Digitaria iburua*)**. Its indexed publisher record describes milling *D. iburua* grain into flour. This is direct product/species evidence for black-fonio flour, but it is a research sample, not a commercial product specification or retail label [S01].
- A 2010 *Food Microbiology* paper studies **Acha (*D. exilis*) and Iburu (*D. iburua*) flours** separately and describes milling grain from each species. It independently confirms the flour identity and the white/black species boundary; it does not establish a market grade or consumer display [S02].
- TERMIUM Plus, a Government of Canada terminology source, gives *D. iburua* as the universal entry and lists standardized English `black fonio` and French `fonio noir`. It supports the species term in Canadian English and French, not a flour-specific Québec label [S03].
- Mako Foods Exotik, a current Québec seller, lists **Pre-cooked Fonio Flour** and **Roasted Fonio Flour**. These product pages do not specify *D. iburua* and are not used to identify the proposed flour [S04].

The French display is therefore a clear, species-qualified construction, not a directly attested Québec package name. Leave independent Québec wording review open. Do not transfer study particle sizes, composition values, baking behavior, or processing claims into the reference. The studies establish that the flour exists; they do not establish universal particle size, dehulling, roasting, cooking, or fermentation properties.

## Exact proposed reference

```json
{
  "id": "ingredient-ref-black-fonio-flour",
  "nameFr": "farine de fonio noir",
  "nameEn": "black fonio flour",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

## Exact proposed ledger record

```json
{
  "recordId": "ingredient-ref-black-fonio-flour",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP02-A6-BLACK-FONIO-FLOUR-20261011-S01",
      "url": "https://www.sciencedirect.com/science/article/pii/S0733521025001493",
      "title": "Fall et al., Synergistic impact on postprandial glycemic response to whole grain fonio flour (Digitaria iburua) by its particle size and released phenolic compounds",
      "versionOrDate": "2025-09",
      "accessedOn": "2026-10-11",
      "locator": "Title, abstract, and indexed Materials extract",
      "supports": "Names whole-grain fonio flour from Digitaria iburua and describes milling black-fonio grain into flour. Supports product identity only; this is a research sample, not a retail specification. No numeric or performance values are imported.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-BLACK-FONIO-FLOUR-20261011-S02",
      "url": "https://www.sciencedirect.com/science/article/pii/S0740002010001814",
      "title": "Coda et al., Exploitation of Acha (Digitaria exilis) and Iburu (Digitaria iburua) flours: Chemical characterization and their use for sourdough fermentation",
      "versionOrDate": "2010-12",
      "accessedOn": "2026-10-11",
      "locator": "Abstract, introduction, and flour-preparation method",
      "supports": "Studies Acha and Iburu flour as separate products and describes milling grain from both species into flour. Supports the species boundary only; it does not define a retail product class or universal processing grade.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-A6-BLACK-FONIO-FLOUR-20261011-S03",
      "url": "https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=esr&lang=fra&srchtxt=NIGERIANA",
      "title": "Government of Canada Translation Bureau, TERMIUM Plus: Digitaria iburua",
      "versionOrDate": "2023-11-29",
      "accessedOn": "2026-10-11",
      "locator": "Seed Plants record for Digitaria iburua",
      "supports": "Standardizes English black fonio and French fonio noir for Digitaria iburua. Terminology evidence for the species name, not a flour-specific Québec product label.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add black fonio flour / farine de fonio noir as an identity-only FLOUR_AND_STARCH reference for culinary flour made from Digitaria iburua, separate from black-fonio grain and the existing white-fonio flour identity. The French display is a transparent construction from the Government of Canada's standardized species term; it is not a Québec retail label, so independent Québec wording review remains open. Add no aliases, forms, measurements, conversions, yields, recipe links, or substitutions.",
      "sourceIds": [
        "WP02-A6-BLACK-FONIO-FLOUR-20261011-S01",
        "WP02-A6-BLACK-FONIO-FLOUR-20261011-S02",
        "WP02-A6-BLACK-FONIO-FLOUR-20261011-S03"
      ]
    }
  ]
}
```

## Source register and limits

All sources below were checked on 2026-10-11. Claims are limited to the source statements described here.

| ID | Source | Evidence and limit |
| --- | --- | --- |
| **S01** | Fall et al., *Journal of Cereal Science* 125 (2025), [publisher article](https://www.sciencedirect.com/science/article/pii/S0733521025001493), doi: [10.1016/j.jcs.2025.104250](https://doi.org/10.1016/j.jcs.2025.104250). | The title names whole-grain fonio flour (*D. iburua*); the publisher's indexed abstract and Materials extract identify black fonio and flour made by milling the grain. Direct full-page retrieval returned 403, so this review uses only the publisher-visible title/abstract and indexed Materials excerpt. It is experimental evidence, not a consumer product label, process standard, or Canadian market listing. No study quantities or health claims are imported. |
| **S02** | Coda et al., *Food Microbiology* 27(8) (2010), [publisher article](https://www.sciencedirect.com/science/article/pii/S0740002010001814), doi: [10.1016/j.fm.2010.07.006](https://doi.org/10.1016/j.fm.2010.07.006). | The article title and abstract identify Acha (*D. exilis*) and Iburu (*D. iburua*) flours separately. Its available article extract says grain was milled into flour. Older research sample; no Canadian label, standard grind, or universal product process is inferred. Scientific composition and fermentation measurements are excluded. |
| **S03** | Government of Canada Translation Bureau, [TERMIUM Plus: Digitaria iburua](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=esr&lang=fra&srchtxt=NIGERIANA), record dated 2023-11-29. | Under Seed Plants, lists standardized French `fonio noir` and English `black fonio` for *D. iburua*. This is Canadian terminology evidence for the species; it is not an OQLF ruling or a Québec-market flour label. It also lists `manne noire` and `ibourou` as plant names; those are not activated as flour aliases. |
| **S04** | Mako Foods Exotik, [current product collection](https://www.makofoods.ca/en/collections/all), Québec seller. | Lists `Pre-cooked Fonio Flour` and `Roasted Fonio Flour` as separate flour products. The page does not identify their fonio species, so neither product is treated as a black-fonio flour source. It supports only the local market's qualified fonio-flour naming and the scope limit. |

## Integration boundary

If accepted, add only the exact reference and ledger record above. Keep generic `fonio flour / farine de fonio` tied to its current white-fonio evidence, and keep the black-fonio grain row unchanged. Preserve the current holds on roasted and precooked fonio flour until their species and process relationships are established. Do not add a black-fonio form, alias, recipe link, numeric value, conversion, yield, or substitution. The broad A6 review and independent Québec French display review remain open.


## Coordinator integration

Integrated `ingredient-ref-black-fonio-flour` and its accepted source record. The display remains provisional pending independent Québec review. The active row has no aliases, form, density, unit mapping, recipe link, conversion, yield, or substitution. Generic fonio flour remains scoped to its existing white-fonio evidence; roasted and precooked products remain unresolved.
