# WP06 Section 05 — Balearic soubressade / sobrasada identity review (R405)

- **Reviewed:** 2026-10-17.
- **Status:** Proposal only. This review creates only this proposal file; it does not change catalog data, forms, the research ledger, recipes, generated files, the Europe checklist, workflow, or roadmap.
- **Scope:** One European charcuterie identity: Québec French *soubressade* / Spanish *sobrasada*.
- **Source-ID prefix:** `WP06-EUROPE-SOUBRESSADE-R405-20261017`. The prefix, proposed reference ID, and source URLs were checked for collisions.

## Recommendation

Add one identity-only `PROTEIN` reference for **`soubressade / sobrasada`**. OQLF’s GDT gives *soubressade* and *saucisson soubressade* as Québec French terms for a Spanish spreadable sausage; TERMIUM records *sobrasada* and the Catalan spelling *sobrassada* in English-language charcuterie usage. Current Montréal product pages use *sobrasada* as the headword. The Mallorcan protected product provides a well-documented regional anchor, while current Québec product listings show that the food name is used locally. [S01–S08]

If accepted for integration, add only:

```json
{
  "id": "ingredient-ref-sobrasada",
  "nameFr": "soubressade",
  "nameEn": "sobrasada",
  "aliasesFr": ["saucisson soubressade"],
  "aliasesEn": ["sobrassada"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "PROTEIN"
}
```

The Québec French display and phrase alias follow OQLF. English *sobrasada* follows current Montréal product naming and a Government of Canada term record; *sobrassada* is its documented spelling variant. Do not add descriptive retailer wording such as *chorizo espagnol à tartiner* as an alias. Keep all forms, numeric behavior, recipe links, and substitutions empty.

## Identity, Québec naming, and boundaries

OQLF classifies *soubressade* under food/charcuterie and defines *saucisson soubressade* as a non-smoked spreadable sausage made from salted lean and fatty meat, seasoned and coloured with mild and hot pepper. Its preferred terms are *saucisson soubressade* and *soubressade*. The entry was last updated in 1983, so it is direct Québec terminology evidence but not evidence of present retail use. TERMIUM’s 2015 entry records *sobrassada* as an English term, *sobrasada* as an English synonym, *soubressade* in French, and *sobrasada* in Spanish; it describes the food as a Spanish charcuterie product and notes Mallorca. These records support the bilingual headwords, not a universal formulation. [S01–S02]

The current Balearic Government food-tourism page describes *Sobrasada de Mallorca* as a raw-cured pork sausage seasoned with salt, paprika, and other spices, and identifies its IGP protection. Spain’s Ministry of Agriculture lists the IGP and its regulatory body; the European Commission’s June 2026 decision again lists *Sobrasada de Mallorca* as a Spanish PGI meat product. These sources establish a distinct Mallorcan regional product. They do not make every product called *sobrasada* a Mallorcan IGP product or make the protected name a generic synonym. [S03–S05]

Current Montréal listings use the Spanish headword in several product-specific contexts: a local wholesaler lists *Sobrasada cular*; L’Española lists a 300 g Iberian acorn-fed product under *Sobrasada* in both French and English storefronts; and a Montréal restaurant menu uses *Sobrasada de Bellota*. The retailer’s phrase *chorizo espagnol à tartiner* describes its own Iberian SKU. It does not establish that chorizo is a global synonym for sobrasada. The retailer’s Iberian origin, acorn feeding, casing, label, and package size remain specific to that product. [S06–S08]

Keep these boundaries:

- **Mallorcan IGP:** *Sobrasada de Mallorca* is a region-qualified protected product name. Do not add it, *de Mallorca*, or *de cerdo negro* as a generic alias or ingredient form. The IGP’s black-pig variant and casing/size presentations are product-specific distinctions, not forms for this broader reference. [S03–S05]
- **Nduja:** retain the active Calabrian `ingredient-ref-nduja` as a separate identity. Shared pork, spreadability, or use on bread does not establish synonymy or an equal-amount replacement.
- **Chorizo, salami, and other sausages:** keep these separate. Retailers may use familiar product descriptions to explain one sobrasada SKU, but those descriptions do not replace the named ingredient.
- **Brands, Iberian/bellota wording, and cular:** retain as product evidence only; do not add them to global aliases.

## Live ownership and archive scan

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Live count | Finding |
|---|---:|---|
| Active ingredient references | 1,710 | No exact name/alias owner for `soubressade`, `saucisson soubressade`, `sobrasada`, `sobrassada`, or the proposed `ingredient-ref-sobrasada`. |
| Ingredient forms | 141 | No matching form label or match term; no proposed reference ID. |
| Legacy import candidates | 56 | No matching candidate name, alias, or proposed reference ID. |
| Research ledger | 2,070 records; 9,359 source entries; 7,926 source IDs; 6,644 URLs | No exact identity record, proposed ID, R405 source-ID prefix, or source-URL collision. |
| Proposal and batch archives | 2,738 readable `.md`, `.txt`, and `.json` files | No prior *soubressade*, *sobrasada*, *sobrassada*, *sobreasada*, Mallorcan sobrasada, R405-prefix, or proposed-ID review. |

The ownership check also included the product-specific phrases *Sobrasada de Mallorca*, *Sobrasada de Mallorca de cerdo negro*, *Sobrasada de Bellota*, and *Sobrasada cular*. All ten source URLs below, grouped under eight proposal-local source IDs, were absent from the ledger before this proposal. S07 has French and English pages for one product SKU; S08 has French and English pages for one restaurant menu. The language variants are not additional independent sources. The target R405 proposal path was unallocated. The active nearby identity `ingredient-ref-nduja` remains separate and does not own any candidate phrase. The Europe checklist still asks for coverage of Western, Southern, Northern, Central, and Eastern Europe; this single review does not close that regional item. [Plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L8829)

## Phrase-first picker projection

The picker normalizes accents and punctuation, checks full word phrases across reference names and aliases first, then falls back to partial matches. [Implementation: `IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)

| Query | Current result | With proposed row |
|---|---|---|
| `soubressade`; `saucisson soubressade`; `sobrasada`; `sobrassada` | No result | `ingredient-ref-sobrasada` only |
| `saucisson` | No result | `ingredient-ref-sobrasada` only, through the OQLF phrase alias |
| `Sobrasada de Mallorca`; `Sobrasada de Bellota`; `Sobrasada cular` | No result | No result; protected or SKU-specific qualifiers are not aliases for the broad identity |
| `chorizo`; `chorizo espagnol à tartiner` | No result | No result; retailer description stays out of global search terms |
| `nduja` | `ingredient-ref-nduja` only | Same single result |
| `sausage` | `ingredient-ref-breakfast-sausage`, `ingredient-ref-merguez-sausage` | Same two results; the proposed row does not add generic English `sausage` |

The `saucisson` query broadens to the proposed identity because the OQLF term is a complete phrase alias containing that word. The more specific Mallorcan and SKU-qualified phrases deliberately remain unallocated. They should receive their own review if future demand warrants a separate identity.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed. The scan checked each decoded recipe document and every structured ingredient row for `soubressade`, `saucisson soubressade`, `sobrasada`, `sobrassada`, `sobreasada`, `sobrasada de Mallorca`, `soubressade de Mallorca`, `sobrasada de Mallorca de cerdo negro`, `sobrasada de Bellota`, `sobrasada cular`, `sobreasada sausage`, and *chorizo espagnol à tartiner*. It found **zero matching files, zero matching ingredient rows, and zero recipe links**.

The manifest-order corpus fingerprint is `94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. It hashes each manifest-relative recipe path, a NUL byte, the lowercase SHA-256 digest of that recipe file, and a newline, then hashes the concatenated entries.

## Measurement and substitution evidence

The bundle supplies no sobrasada quantity. The current retailer listings show one 1 kg wholesaler format and one 300 g Iberian SKU. Those are source-specific packages, not standard units, recipe portions, or reusable piece weights. The Mallorcan IGP source’s composition proportions and maturation requirements are manufacturing-specification data; they do not support kitchen conversions, density, or household measures. Add no form, measurement observation, density, unit mapping, conversion, or package-yield rule. If accepted, set `measurementState` to `researched_no_supported_value`.

This review did not conduct a focused substitution survey. The Montréal menu’s combination of sobrasada with Manchego is a dish pairing, not substitution evidence. Nduja, chorizo, generic sausage, salami, and pâté remain distinct products; their broad culinary resemblance does not establish a general or contextual replacement. Add no substitution finding, rule, or recipe-line substitution link. If accepted, set `substitutionResearchState` to `not_yet_researched`.

## Source register

Sources were accessed on 2026-10-17. Proposal-local IDs have no current ledger owners.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-SOUBRESSADE-R405-20261017-S01` | Office québécois de la langue française, GDT, [saucisson soubressade](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2092764/saucisson-soubressade), definition and preferred terms; last updated 1983. | Direct Québec French terminology and product description. The dated entry is not evidence of current retail use or a modern product standard. Its English translation is *sobreasada sausage*; this review uses the locally current spelling *sobrasada* instead. |
| `WP06-EUROPE-SOUBRESSADE-R405-20261017-S02` | Government of Canada Translation Bureau, TERMIUM Plus, [sobrassada / sobrasada, record 63](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=esb&lang=eng&srchtxt=CARNE), dated 2015-01-29. | Lists English *sobrassada* and *sobrasada*, French *soubressade*, and Spanish *sobrasada*; describes a Spanish charcuterie product and notes Mallorca. Terminology evidence, not a current recipe, retail listing, or universal formula. |
| `WP06-EUROPE-SOUBRESSADE-R405-20261017-S03` | Govern de les Illes Balears / Agencia de Estrategia Turística de las Illes Balears, [IGP Sobrasada de Mallorca](https://gastronomia.illesbalears.travel/es/producto-local/marcas/indicacion-geografica-protegida-sobrasada-de-mallorca), product description and IGP section. | Current regional public-facing source for the named Mallorcan product, raw-cured pork identity, and IGP context. It is not the binding product specification and its product details are not generalized to every sobrasada. |
| `WP06-EUROPE-SOUBRESSADE-R405-20261017-S04` | Spain Ministry of Agriculture, Fisheries and Food (MAPA), [I.G.P. Sobrasada de Mallorca](https://www.mapa.gob.es/es/alimentacion/temas/calidad-diferenciada/dop-igp/igp_sobrasada), IGP record and regulatory-body information. | Official national GI listing, competent authority, and in-force date for the specification. The page links to the EU register but does not itself provide a full current specification text. |
| `WP06-EUROPE-SOUBRESSADE-R405-20261017-S05` | European Commission, [Commission Decision (EU) 2026/1367](https://eur-lex.europa.eu/legal-content/EN/TXT/PDF/?uri=OJ%3AL_202601367), amended Annex X, Spain entries. | The June 2026 EU publication lists *Sobrasada de Mallorca* as a PGI meat product. It corroborates the protected name and product class; it is not a manufacturing specification. |
| `WP06-EUROPE-SOUBRESSADE-R405-20261017-S06` | Distributions Macchi Inc., Montréal, [Sobrasada cular](https://macchiinc.com/produits/sobrasada-cular/), product title and package/price fields. | Current Québec wholesaler listing supports local French-market use of the headword and shows a 1 kg format. It gives no origin or universal product definition; price and package presentation are seller-specific. |
| `WP06-EUROPE-SOUBRESSADE-R405-20261017-S07` | L’Española, Montréal, [Chorizo espagnol à tartiner “Sobrasada” 300 g](https://lespanola.com/fr/products/senorio-de-montanera-raw-cured-iberian-bellota-pork-sausage-approximately-300-g) and [English listing](https://lespanola.com/products/senorio-de-montanera-raw-cured-iberian-bellota-pork-sausage-approximately-300-g), same product SKU. | Current bilingual Montréal product title uses *Sobrasada*; product copy describes that Iberian bellota SKU and its 300 g package. Its descriptive chorizo wording, formula, origin, and package size are product-specific, not general aliases or reusable measures. The two language pages are one source/product, not independent evidence. |
| `WP06-EUROPE-SOUBRESSADE-R405-20261017-S08` | Montreal Paella, Montréal, [French menu](https://montrealpaella.com/menu-fr) and [English menu](https://montrealpaella.com/menu-en/), “Bikini Sobrasada Bellota” line. | The current bilingual menu uses the sobrasada headword and pairs the named product with Manchego and caramelized onions. The two language pages are one venue/menu source, not independent evidence; they provide menu use, not ingredient quantity, recipe measurement, terminology consensus, or substitution evidence. |

## Disposition

Proceed with the identity-only `PROTEIN` row if accepted. Use Québec French **soubressade** and English **sobrasada**, with only the OQLF French phrase and TERMIUM spelling variant as aliases. Keep the Mallorcan PGI and retailer-specific Iberian, bellota, cular, brand, and package details bounded to their sources. The bundle has no demand, and the Europe-wide coverage checklist remains open.

No software tests, build, or emulator run were performed because this is a proposal-only documentation change.
