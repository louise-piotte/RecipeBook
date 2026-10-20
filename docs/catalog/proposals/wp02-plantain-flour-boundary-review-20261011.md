# WP02 B4 — Plantain Flour and Green Banana Flour: Canadian Product Boundary Review

- **Reviewed:** 2026-10-11
- **Status:** Coordinator integrated the two source-attested search aliases on the existing green-plantain-flour reference; no new reference, form, recipe link, or numeric behavior was added.
- **Scope:** Recheck the identity boundary and Canadian/Québec English/French product naming for the existing green-banana-flour and green-plantain-flour references. Other regional root and fruit flours remain outside this focused review.
- **Audit basis:** Current bundled references, forms, manifest-listed recipes, generated Kotlin ingredient index, historical legacy-import candidate file, ledger records, and prior B4 proposals were reviewed.

## Recommendation

**Keep green banana flour and green plantain flour as separate, identity-only references.** The current Canadian market presents them as separate named products, and a manufacturer offers both as separate single-ingredient flours. The East African standard puts both under one green/unripe banana-flour specification, but its scope does not declare the names synonymous. A primary study uses “green banana flour” across several dessert-banana and plantain cultivars, which shows that technical writing may use a broader umbrella term; it does not establish that Canadian retail names are interchangeable or that one flour can replace the other in recipes. [S01–S04]

Keep the existing maturity-qualified canonical displays:

| Reference | Canonical EN / fr-CA display | Recommendation |
| --- | --- | --- |
| `ingredient-ref-green-banana-flour` | `green banana flour` / `farine de banane verte` | Retain. A current Walmart Canada French listing uses `Farine de Banane Verte` and describes young green bananas that are peeled and dried. Do not add generic `banana flour` or `farine de banane`: the older OQLF entry maps `farine de banane` to *banana meal* and discusses more than one maturity level. [S05–S06] |
| `ingredient-ref-green-plantain-flour` | `green plantain flour` / `farine de banane plantain verte` | Retain the explicit green scope. Add the exact Canadian product-label aliases `plantain flour` and `farine de plantain`: a Montréal-area retailer describes its Mountain Delight product as flour made from dried green plantains, while a Laval retailer lists the same brand and 340 g package as `plantain flour, farine de plantain`. The alias records observed retail wording for this green product; it does not assert equivalence with green banana flour. [S07–S08] |

Do not add `banana flour`, `farine de banane`, `farine de banane plantain`, `plantain fufu flour`, or any fufu/foufou blend as an alias. The first two are broad in historical terminology; the maturity-unspecified French compound is not directly established by the reviewed Canadian evidence; and Tropiway plantain fufu products are formulated blends, not the single-source flour identity. Historical food-processing literature also documents ripe-plantain flour, so the explicit `green` qualifier remains useful even though Canadian sellers sometimes shorten the retail label. [S06–S09]

No forms, density, unit mappings, recipe links, yields, conversions, or substitutions are supported. These references identify milled foods, not preparation states of the fresh banana or plantain rows. The data does not establish functional interchangeability.

### Proposed reference JSON

The following is the only proposed catalog change: two retail-name aliases on the existing green-plantain-flour row. Keep its current identity, category, canonical displays, null density, and empty unit mappings.

```json
{
  "id": "ingredient-ref-green-plantain-flour",
  "nameFr": "farine de banane plantain verte",
  "nameEn": "green plantain flour",
  "aliasesFr": ["farine de plantain"],
  "aliasesEn": ["plantain flour"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-11T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Do not change the green-banana-flour row or add a form.

## Current catalog, legacy, ledger, and demand audit

- **Active seed:** Both flour references already exist in `ingredient-references.v1.json`, category `FLOUR_AND_STARCH`, with maturity-qualified English and French displays, empty alias arrays, `defaultDensity: null`, and empty `unitMappings`. The fresh banana and plantain fruit rows remain separate from these flour rows.
- **Generated index:** `BundledIngredientCatalog.kt` already contains both active flour references with the same displays and no aliases. The historical `docs/catalog/legacy-import-identities.v1.json` has 75 candidates and no banana- or plantain-named candidate; it does not supply a competing flour identity.
- **Forms:** Neither flour has a row in `ingredient-forms.v1.json`. The existing mashed-ripe-banana form belongs only to the fresh banana reference.
- **Ledger:** Each flour has its own verified `ingredient_reference` record. Measurement and substitution research remain `not_yet_researched`. Existing decisions accept both identities separately and leave all quantitative and recipe behavior unset. There is no additional unresolved banana-flour or plantain-flour candidate; the separate East African highland cooking-banana candidate concerns the `matooke` ingredient/prepared-food boundary.
- **Recipe demand:** All 114 recipes listed in the current manifest and all 1,123 ingredient rows were scanned for the active IDs and relevant English/French flour phrases. There were zero recipe-line matches.
- **Phrase collisions:** The two canonical display pairs each match only their intended active reference. `plantain flour` and `farine de plantain` currently match no active display or alias; the proposed aliases would resolve only to the existing green-plantain-flour row. Generic banana flour wording remains unresolved.
- **Prior proposals:** The 2026-10-10 identity review kept the two rows separate and withheld generic aliases. The 2026-10-11 Québec display review retained the French compound provisionally because its Québec source was a Tropiway fufu blend. The current Le Pro listing adds a source that identifies a single plantain flour made from green plantains; this review uses that evidence for the exact shorter retail aliases only.

## Evidence and limits

**S01 — East African Community, EAS 1106:2023, “Banana flour — Specification.”** [Official 2023 standards notice](https://www.eac.int/documents?controller=download&file=8a4a7307-241d-40e1-b48e-8bd0cd2e4170&name=EAC+Vol+AT+1+NO+20+AUGUST+2023+-+STANDARDS.pdf&task=download.file). The scope covers green/unripe banana and plantain flour. A shared standard scope is not a synonym declaration.

**S02 — Tropicals Direct, Gluten Free Flours.** [Manufacturer product range](https://www.tropicals.direct/), current page accessed 2026-10-11. The manufacturer lists separate single-ingredient `Plantain Flour` and `Green Banana Flour` offerings; its product imagery identifies the plantain product as green plantain flour. This is manufacturer naming evidence, not a statement that every seller uses the same taxonomy.

**S03 — Suresh Kumar et al., “Structural, functional characterization and physicochemical properties of green banana flour from dessert and plantain bananas (*Musa* spp.),” 2019.** [DOI 10.1016/j.lwt.2019.108524](https://doi.org/10.1016/j.lwt.2019.108524). The primary study prepared flour from dessert and plantain cultivars and found cultivar-related differences. Its broader scientific use of `green banana flour` does not make the retail names synonyms and supplies no substitution rule.

**S04 — Edward & Sons, “Green Banana Flour” FAQ.** [Manufacturer FAQ](https://store.edwardandsons.com/pages/faq), current page accessed 2026-10-11. The manufacturer says its own green-banana-flour product is made from green bananas and “does not contain plantains.” This supports that product’s source statement only; this review does not rely on the FAQ’s simplified botanical claim that bananas and plantains are entirely different fruits.

**S05 — Walmart Canada, Let’s Do Organics, “Farine de Banane Verte.”** [Current Canadian French product listing](https://www.walmart.ca/fr/ip/Let-s-Do-Organics-Farine-de-Banane-Verte-14-oz/3MRTZDDKLTS4), accessed 2026-10-11. Uses the exact green-banana-flour display and says the product is made from young green bananas that are peeled and dried. This is retailer product-page evidence, not OQLF approval.

**S06 — OQLF, “farine de banane” (GDT).** [Official terminology record](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489070/farine-de-banane), last updated 1982. It pairs the French term with English *banana meal* and describes flour made from fruit at more than one maturity level. It does not define modern green banana flour or distinguish plantain.

**S07 — Le Pro 1600, Mountain Delight, “Plantain flour / Farine de plantain — 340 g.”** [English product page](https://lepro1600.com/en/products/delight-farine-de-plantain-340g-delight-plantain-flour-340g) and [French product page](https://lepro1600.com/products/delight-farine-de-plantain-340g-delight-plantain-flour-340g), accessed 2026-10-11. The English and French pages give the exact proposed label phrases and describe the flour as made from dried, finely ground green plantains. The listing was backordered when reviewed and says the seller ships across Canada; it is product-specific retail evidence, not proof that all unqualified plantain flour is green.

**S08 — Épicerie La Hacienda, Laval, Québec.** [Current grocery listing](https://www.epicerielahacienda.com/commande), accessed 2026-10-11. Lists `Mountain delight- plantain flour, farine de plantain 340g`; the same page identifies the Laval pickup location. It supports the bilingual retail name, but does not state maturity or composition itself.

**S09 — FAO, *Banana (Plantain): Post-harvest Operations*.** [Technical compendium PDF](https://www.fao.org/fileadmin/user_upload/inpho/docs/Post_Harvest_Compendium_-_Plantain.pdf), pp. 8–9. Documents flour from unripe plantain pulp and separately reports ripe-plantain flour. It supports preserving maturity as a product boundary; it is not current Canadian naming evidence.

**S10 — Africanada Foods, “Unripe Green Plantain Flour.”** [Canadian product listing](https://www.africanadafoods.com/products/unripe-green-plantain-flour?variant=47862374006939), accessed 2026-10-11. The Canadian-dollar listing uses the explicit English maturity-qualified name and describes a pure, unripe-plantain flour. It supports the canonical English display; it does not establish French Québec terminology.

**S11 — Basmex and Tropiway, fufu product boundary.** [Basmex Montréal product listing](https://www.basmex.ca/products) and [Tropiway manufacturer explanation](https://www.tropiway.com/making-fufu), accessed 2026-10-11. Basmex lists `Tropiway Farine de plantain`, but the manufacturer describes its regional fufu flours as formulated products. These sources do not support mapping plantain fufu blends to the single-source green-plantain-flour reference.

## Review result

The current rows already express the correct source and maturity distinctions. The newly verified Canadian label evidence supports adding only `plantain flour` and `farine de plantain` as search aliases to the green-plantain row. It does not support merging green plantain with green banana flour, activating broad banana-flour aliases, identifying fufu blends as single-source flour, or adding quantitative/form/substitution behavior. All conclusions remain limited to the sources and product pages cited above.

## Coordinator integration — 2026-10-11

Accepted the two proposed aliases on `ingredient-ref-green-plantain-flour` and added the Le Pro 1600 and Épicerie La Hacienda evidence to its existing ledger record. The green-banana-flour row remains separate and unchanged. No forms, recipe links, measurements, conversions, yields, or substitutions were added. See `docs/catalog/batches/wp02-plantain-flour-alias-integration-20261011/README.md`.
