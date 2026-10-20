# WP03 Section H proposal: Kabuli and Desi chickpeas; roasted split gram

## Packet record

- **Reviewed:** 2026-10-11.
- **Status:** Proposal only. No shared catalog, ledger, recipe, plan, roadmap, code, or test file was changed.
- **Scope:** Chickpea type identities, black/Kala Chana boundary, split and split-roasted Desi product boundaries, active aliases and search behavior, recipe demand, measurements, yields, conversions, and substitutions.
- **Current package snapshot:** 992 ingredient references, 63 forms, 114 recipes, and 1,123 ingredient rows. The research ledger has 1,271 records and 8 unit-conversion observations.
- **Recommendation:** Add identity-only Kabuli and Desi chickpeas, and represent unroasted split/dehulled Desi chickpeas as a form. The Indian government standard and Canadian retail listings establish roasted split Bengal gram as a distinct preparation product; model it as a Desi form, subject to Québec French display review of the proposed compound label. Add no numeric behavior, yields, conversions, substitutions, or recipe links.

## Catalog and corpus audit

### Active references and forms

| Active ID | Current labels and aliases | Disposition |
|---|---|---|
| `ingredient-ref-chickpeas` | `chickpeas / pois chiches`; EN aliases `garbanzo beans`, `canned chickpeas`, `dried chickpeas`; FR aliases `pois chiches en conserve`, `pois chiches secs`; density `null`; no unit mappings. | Keep broad. The OQLF uses *garbanzo* as an English synonym for chickpea generally; do not move that existing alias to Kabuli solely because a crop classification also uses it as a Kabuli example. |
| `ingredient-ref-black-chickpeas` | `black chickpeas / pois chiches noirs`; EN aliases `black chickpea`, `kala chana`; FR aliases `pois chiche noir`, `kala chana`; density `null`; no unit mappings. | Already accepted and active. Keep as the source-attested Kala Chana market product; do not merge it into all Desi chickpeas or reuse its exact `kala chana` alias on the broader Desi row. |
| `ingredient-ref-chickpea-flour` | `chickpea flour / farine de pois chiche`; FR alias `farine de pois chiches`. | Keep separate from whole chickpeas, raw split dal, and roasted products. |
| `ingredient-ref-chana-sattu` | `chana sattu / farine de sattu`; EN aliases `roasted Bengal gram flour`, `roasted chickpea flour`; FR alias `farine de pois chiches grillés`. | Keep as the source-defined roasted chickpea flour. Do not alias whole or split-roasted product names to it. |

The generic chickpea reference has two forms: `ingredient-form-chickpeas-dried` and `ingredient-form-chickpeas-canned-drained`. Both densities are `null`. No Kabuli-, Desi-, or black-specific forms are active. The legacy `ingredient-ref-dried-chickpeas` is only an unresolved ledger candidate and is absent from the bundled references.

The active `substitution-rules.v1.json` and `contextual-substitution-rules.v1.json` arrays are empty. The ledger's two former canned-to-dried chickpea rules (`substitution-rule-chickpeas-canned-to-dried-mass` and `substitution-rule-chickpeas-canned-to-dried-package`) remain unresolved/blocked pending evidence. The sole active package-yield record is for canned S&W black beans; it is not transferable to chickpeas.

### Search and collision review

The current normalized search returns:

| Query | Current result(s) | Proposed handling |
|---|---|---|
| `chickpeas` | Generic chickpeas and black chickpeas. | After type identities are added, Kabuli and Desi will also appear for the broad query. This is expected because the catalog has no parent/subtype tree. |
| `pois chiches` | Chickpeas, chickpea flour, chana sattu, and black chickpeas. | Type rows will add further broad results; preserve exact type phrases. |
| `garbanzo beans` | Generic chickpeas only. | Retain this existing broad alias there; do not duplicate it on Kabuli. A qualifying `kabuli garbanzo` phrase is not needed. |
| `desi chickpeas`, `kabuli chickpeas`, `kabuli chana` | No active result. | Add the two type references and their singular/qualified names. |
| `kala chana` | Black chickpeas only. | Keep the exact alias on the existing black/Kala Chana row. Do not duplicate it on Desi. |
| `bengal gram` | Chana sattu, via `roasted Bengal gram flour`. | Do not add bare `Bengal gram` as a reference alias: it would broaden an already ambiguous search to raw Desi and flour. Use qualified form terms only. |
| `chana dal`, `roasted chana dal`, `roasted gram split`, `pottukadalai` | No active result. | Attach qualified dal wording to the matching split form only. Keep `pottukadalai` and `bhuna chana` inactive because sources use them across whole-roasted and split products. |
| `roasted chickpea flour` | Chana sattu. | Keep that alias scoped to flour; do not reuse it for split snack products. |

No duplicate normalized display/alias key is proposed. `Bengal gram`, `Kala chana`, and generic `garbanzo beans` are deliberately excluded from the new reference alias lists because of current or source-demonstrated scope overlap.

### Recipe demand

All 114 bundled recipe files and their 1,123 ingredient rows were checked for active links to generic chickpeas, black chickpeas, chickpea flour, and chana sattu, and for direct chickpea/Kabuli/Desi/Kala-Chana/chana-dal/roasted-gram ingredient wording. There are no matching ingredient rows or links. Recipes 090 and 105 mention generic chickpeas only in notes/variation text, without an ingredient quantity or type. No type- or roasted-split recipe link is proposed.

## Proposed catalog JSON

Add two references. The proposed aliases are qualified so they do not collide with existing broad terms.

```json
[
  {
    "id": "ingredient-ref-kabuli-chickpeas",
    "nameFr": "pois chiches Kabuli",
    "nameEn": "Kabuli chickpeas",
    "aliasesFr": [
      "pois chiche Kabuli",
      "pois cornu"
    ],
    "aliasesEn": [
      "Kabuli chickpea",
      "Kabuli chana"
    ],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-11T00:00:00Z",
    "category": "LEGUME_AND_PULSE"
  },
  {
    "id": "ingredient-ref-desi-chickpeas",
    "nameFr": "pois chiches Desi",
    "nameEn": "Desi chickpeas",
    "aliasesFr": [
      "pois chiche Desi"
    ],
    "aliasesEn": [
      "Desi chickpea"
    ],
    "defaultDensity": null,
    "unitMappings": [],
    "updatedAt": "2026-10-11T00:00:00Z",
    "category": "LEGUME_AND_PULSE"
  }
]
```

The OQLF directly records the singular French type names and says Kabuli is sometimes called *pois cornu*. The Canadian product `Kabuli Chana` supports that qualified EN alias. Keep `garbanzo beans` on generic chickpeas: OQLF uses it generically, while NAPCS gives it as an illustrative Kabuli example, so an unqualified move would over-narrow a term with documented broader use.

### Split Desi form

NAPCS lists split Desi chickpeas as a Desi example; Canadian retail also sells products titled “Dry Split Desi Chickpeas” and “Split Desi Chickpeas.” A Canadian pulse retailer describes channa dal as split brown chickpeas with the skin removed. This supports a split/dehulled form under the Desi identity. It does not justify assuming that every split chickpea product is dehulled.

```json
{
  "id": "ingredient-form-desi-chickpeas-split-dehulled",
  "ingredientRefId": "ingredient-ref-desi-chickpeas",
  "formCode": "split_dehulled",
  "labelFr": "pois chiches Desi cassés",
  "labelEn": "split, dehulled Desi chickpeas",
  "prepState": "split_dehulled",
  "matchTermsFr": [],
  "matchTermsEn": [
    "split Desi chickpeas",
    "dry split Desi chickpeas",
    "dried split Desi chickpeas",
    "chana dal",
    "channa dal"
  ],
  "densityGPerMl": null,
  "notesFr": "Le produit chana dal cité par la source canadienne est décortiqué. Ne pas généraliser cet état à tous les pois chiches cassés.",
  "notesEn": "Chana dal is scoped here to split, dehulled Desi chickpeas. Do not infer that every split chickpea product is dehulled.",
  "updatedAt": "2026-10-11T00:00:00Z"
}
```

The French form label reuses the official phrase `pois chiches Desi cassés`; its internal form code records the dehulled state reported for the cited Canadian Channa dal product. No Québec/Canadian French product page found in this review publishes a fuller French dehulled label. Treat the label as a source-bounded display, not an OQLF terminology ruling.

### Roasted split Bengal gram form

The Government of India's AGMARK rule defines “Roasted Bengal Gram (split)” as a product from mature, dried, sound *Cicer arietinum* grains, roasted without oil and split and husked. Statistics Canada's NAPCS places Bengal gram and split Desi chickpeas under the Desi class. Canadian retailers list “Roasted Gram split,” “Roasted Chana Split,” and “Roasted Chana Dal Split.” This is a preparation/product form, not another chickpea species, flour, or packaging size.

```json
{
  "id": "ingredient-form-desi-chickpeas-roasted-split-dehulled",
  "ingredientRefId": "ingredient-ref-desi-chickpeas",
  "formCode": "roasted_split_dehulled",
  "labelFr": "pois chiches Desi cassés et rôtis",
  "labelEn": "roasted split Bengal gram",
  "prepState": "roasted_split_dehulled",
  "matchTermsFr": [],
  "matchTermsEn": [
    "roasted Bengal gram split",
    "roasted gram split",
    "roasted chana split",
    "roasted chana dal",
    "roasted split chickpeas"
  ],
  "densityGPerMl": null,
  "notesFr": "La norme AGMARK décrit un produit issu de graines matures, sèches et saines de Cicer arietinum, rôties sans huile, cassées et décortiquées. Le libellé français composé est descriptif et reste à valider au Québec.",
  "notesEn": "The AGMARK standard describes a product made from mature, dried, sound Cicer arietinum grains, roasted without oil, split, and husked. This is not whole roasted Kala Chana or a flour.",
  "updatedAt": "2026-10-11T00:00:00Z"
}
```

**French-name gate:** `pois chiches Desi cassés` is attested by Statistics Canada and Canadian French sources use `pois chiches rôtis`, but this review found no Québec/Canadian French product page for the exact combined roasted/split product. The JSON above is therefore a draft descriptive translation only. Before activating this form, either obtain a direct Canadian French product label or have an independent Québec reviewer accept the transparent phrase. Do not silently present it as a sourced product name.

Do not add whole-roasted chickpeas, `bhuna chana`, `pottukadalai`, `dalia/daliya`, or `pottukadalai maavu` as aliases. Sources use those words across whole roasted seeds, split roasted gram, or flour contexts. Keep the existing `candidate-pottukadalai-maavu` unresolved and the chana-sattu/chickpea-flour boundaries unchanged.

## Measurements, conversions, yields, and substitutions

| Dimension | Evidence and decision |
|---|---|
| Density and unit mappings | No Kabuli-, Desi-, split-, or roasted-split chickpea density or volume/mass mapping was found. Retail package net weights (for example 1.8 kg, 453 g, or 350 g) are declared package sizes, not cup conversions or edible-yield observations. Keep densities null and mappings empty. |
| Official quality measurements | AGMARK moisture/foreign-matter grade limits describe product quality. They are not bulk density, serving weight, recipe conversion, or a cooking yield. Do not import them into recipe measurement data. |
| Cooking yield | The existing general dried-chickpea cooking-yield range in `docs/catalog/batches/baking-substitutions.md` is not type-specific and cannot be turned into the runtime's single yield value; there is no cooked-chickpea form. Add no Kabuli/Desi yield. |
| Package yield | No chickpea-specific net/drained package yield was found. Do not transfer the active black-bean yield. |
| Conversions and substitutions | No mass, water-absorption, or roasted-process yield ratio is supported. A historical Canadian market bulletin says Kabuli may replace Desi when price is favorable; that is a price/market statement, not a recipe-equivalence ratio or contextual cooking rule. Add no form-conversion or ingredient-substitution rule. Leave the two old generic canned/dried records blocked. |

The generic form's canned-drained / dried state, existing black chickpeas identity, and split/roasted forms do not establish conversions between types or states. No recipe-line substitution links are warranted.

## Proposed ledger evidence and decisions

New source IDs are local to this proposal; register only if the root accepts the corresponding catalog decision.

| Source ID | Source and scope | Use |
|---|---|---|
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S01` | OQLF, [pois chiche, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296897/pois-chiche), updated 2026. | Québec French base term, *Cicer arietinum*, type contrast, and the occasional Kabuli synonym `pois cornu`. It does not establish numeric behavior. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S02` | CFIA, [Pulse seed crop inspection procedures](https://inspection.canada.ca/en/plant-health/seeds/seed-inspection-procedures/pulse-crops), Appendix III, updated 2026-04-01. | Desi/Kabuli type characteristics; CFIA says Kabuli is sometimes called garbanzo. Seed-crop guidance, not a retail-food standard. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S03` | Canadian Grain Commission, [Pois chiches: classes, types et variétés](https://www.grainscanada.gc.ca/fr/qualite-grains/guide-officiel-classement-grains/22-pois-chiches/classes-types-varietes.html). | Current Canadian classes. Notably, new Kabuli varieties may be black or green, so black seed colour alone does not establish Desi identity. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S04` | Statistics Canada, [NAPCS Canada 2017 Version 2.0](https://www150.statcan.gc.ca/n1/pub/12-003-x/12-003-x2017001-eng.pdf), class 114311; [classification examples](https://www23.statcan.gc.ca/imdb/p3VD.pl?CLV=0&CVD=1197661&D=1&Function=getVD&MLV=1&TVD=1197661&adm=0&dis=0). | Separates Desi and Kabuli. Illustrative examples place split Desi chickpeas, Bengal gram, Channa dal, and Kala channa under Desi, and garbanzo beans under Kabuli. These are product-class examples, not a warrant to add ambiguous unqualified aliases. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S05` | Statistics Canada, [NAPCS Canada 2022 Version 1.0, English](https://www150.statcan.gc.ca/n1/pub/12-003-x/12-003-x2022001-eng.pdf) and [French](https://www150.statcan.gc.ca/n1/pub/12-003-x/12-003-x2022001-fra.pdf), printed p. 157. | Separate product codes for Desi, Kabuli, and other chickpeas; split Desi is an illustrative example. French example: `pois chiches Desi cassés`. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S06` | Food Basics, [Divya Dry Split Desi Chickpeas](https://www.foodbasics.ca/aisles/pantry/pasta-rice-beans/dried-beans/dry-split-desi-chickpeas/p/062781060994), current listing. | Canadian retail wording for dry, split Desi chickpeas. Page access may be store-dependent; no density or unit conversion is used. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S07` | Loblaws, [Suraj Kala Channa Desi Chickpeas](https://www.loblaws.ca/en/kala-channa-desi-chickpeas/p/20558760_EA?source=nspt) and [Suraj Split Desi Chickpeas](https://www.loblaws.ca/en/split-desi-chickpeas/p/20558756_EA?source=nspt). | Current Canadian retail item names distinguish Kala Channa Desi from split Desi products. Package weights/listing context are not recipe measurements. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S08` | Walmart Canada, [Aman's Pois Chiches Kabuli Chana](https://www.walmart.ca/fr/ip/Aman-s-Pois-Chiches-Kabuli-Chana/6000196815652). | Canadian French product-name evidence for `Kabuli Chana` and `pois chiches`. Seller listing, not an OQLF ruling. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S09` | FSSAI, [Food Safety and Standards Regulations, Chapter 2.4](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals%20and%20Cereal%20products.pdf), section 2.4.33; and eNAM, [commodity list](https://www.enam.gov.in/web/commodity/commodity-quality). | Existing chana sattu definition/boundary: roasted Cicer arietinum flour remains separate from raw split pulses and besan. No measurements imported. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S10` | Government of India, India Code, [Roasted Bengal Gram (Split) Grading and Marking Rules, 2002](https://upload.indiacode.nic.in/showfile?actid=AC_CEN_23_31_00011_193701_1535099362507&filename=roasted_bengal_gram_%28split%29_grading_and_marking_rules%2C_2002.pdf&type=rule). | Defines the botanical ingredient and product preparation: mature, dried, sound *Cicer arietinum*, roasted without oil, split and husked. The grade moisture limits are not recipe conversions. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S11` | Spice Divine, [Zaika Roasted Chana Split](https://spicedivine.ca/products/zaika-roasted-chana-split-350g), current Canadian retailer listing. | Canadian market name `Roasted Chana Split`; product page supports name/availability only, not exact composition or cooking use. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S12` | Grocerybasket.ca, [Roasted Gram split](https://grocerybasket.ca/products/roasted-gram-split-453g-di). | Canadian retailer uses the qualified product name `Roasted Gram split`; the page also lists 453 g as package net weight. Neither the package size nor its sparse description supports a conversion. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S13` | Galloway's Wholesome Foods, [Channa dal](https://www.gallowaysfoods.com/products/channa-dal), Canadian retailer. | Describes channa dal as split brown chickpeas with the skin removed and calls it Bengal gram/Desi chickpeas. Use for the retailer's product boundary, not universal names. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S14` | Osteoporosis Canada, [Pois chiches rôtis](https://osteoporose.ca/recipes/pois-chiches-rotis/). | Canadian French phrase `pois chiches rôtis`, but the recipe is whole chickpeas roasted in a home recipe; it does not supply the exact split-product label. |
| `WP03-H-CHICKPEA-TYPES-ROASTED-GRAM-20261011-S15` | Agriculture and Agri-Food Canada, [Chickpea market bulletin](https://publications.gc.ca/collections/Collection/A27-18-19-13F.pdf), 2006. | Reports Kabuli replacing Desi when price is favorable. This concerns market choice only; not a recipe substitution or quantity basis. |

If accepted, use these ledger decisions:

1. **`ingredient-ref-kabuli-chickpeas`** — `accepted`: add the distinct Kabuli chickpea crop/product class with OQLF French type wording and the narrow `Kabuli chickpea`, `Kabuli chana`, and `pois cornu` terms. Keep `garbanzo beans` on the existing generic row because its source usage is not exclusive. No forms, density, unit mappings, conversions, yields, recipe links, or substitutions are added.
2. **`ingredient-ref-desi-chickpeas`** — `accepted`: add the distinct Desi chickpea crop/product class. Keep it separate from black/Kala Chana as a broader class and from roasted flour. Do not add `Bengal gram` or `Kala chana` to the reference alias list: those phrases are already ambiguous or assigned in the active search catalog. No numeric or recipe behavior is added.
3. **`ingredient-form-desi-chickpeas-split-dehulled`** — `accepted`: add the source-attested split/dehulled preparation form with exact qualified Dal wording. Do not infer density, cooked yield, a generic split-to-whole ratio, or suitability for every whole-chickpea recipe.
4. **`ingredient-form-desi-chickpeas-roasted-split-dehulled`** — `accepted pending fr-CA label review`: AGMARK defines the product and Canadian retailers list it, but this review did not find a French Canadian retail name for the combined state. Keep the proposed French display explicitly provisional until reviewed. Do not create a separate ingredient identity or alias the unqualified `roasted gram`/`bhuna chana`/`pottukadalai` terms.
5. **`ingredient-ref-black-chickpeas`** — append source S03 and amend its source note to say the active name represents the market product Kala Chana / `pois chiches noirs`; it does not imply every black-seeded chickpea is Desi, because the Canadian Grain Commission records black Kabuli varieties as well.
6. **Measurements/substitutions for the two references and two forms** — record no supported active value. If the ledger requires a completed search state, use `researched_no_supported_value` for numeric data and `researched_no_supported_substitute` for recipe-level substitution, while preserving the market-only Kabuli/Desi replacement observation from S15. Keep the two old canned-to-dried rule records blocked.

## Integration boundary and open gaps

1. Add only the two reference rows and, if accepted, the two forms shown above. Do not change generic chickpea aliases/forms or recipe rows.
2. Keep the existing black chickpea identity scoped to Kala Chana market wording. Do not imply that all Desi chickpeas are black or that all black-seeded Kabuli chickpeas are Kala Chana.
3. Preserve `garbanzo beans` on generic chickpeas; do not add bare `Bengal gram`, `chana`, `Kala chana`, `bhuna chana`, `pottukadalai`, `dalia/daliya`, `gram flour`, `besan`, or `chickpea flour` to new identities/forms.
4. Keep chana sattu distinct from chickpea flour, raw split Desi, and roasted split Bengal gram. Keep `candidate-pottukadalai-maavu` unresolved because the regional names cross whole roasted, split roasted, and flour contexts.
5. The combined Québec French display for roasted split Desi chickpeas needs independent bilingual validation. Do not represent that proposal as a certified or retail-attested product term until reviewed.
6. No forms for soaked, cooked, canned-with-liquid, puréed/refried, or fermented chickpeas are supported by this packet's product/recipe demand. No aquafaba row is proposed.
7. No tests were run; this is a proposal-only catalog research file and does not change database JSON.
