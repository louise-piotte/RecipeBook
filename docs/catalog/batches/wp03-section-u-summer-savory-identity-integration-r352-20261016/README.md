# WP03 Section U R352 — summer savory identity integration

## Integrated data

Added one identity-only `HERB` reference, `ingredient-ref-summer-savory`, for culinary *Satureja hortensis* L.:

- English display: `summer savory`
- Québec French display: `sarriette d’été`
- English alias: `summer savory leaves`
- French aliases: `sarriette des jardins`, `sarriette commune`

Kept *Satureja montana* / winter savory separate. Omitted `summer thyme`, the generic retailer phrase `feuilles de sarriette`, botanical names, and unsupported spellings. The short searches `savory` and `sarriette` still match through the display terms; if winter savory is added later, those broad queries can return both identities.

The ledger records the identity as verified. Measurement and substitution research remain `not_yet_researched`. No form, measurement, unit mapping, density, conversion, yield, recipe link, or active substitution was added.

## Evidence and limits

- The [OQLF GDT entry for *sarriette*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2077733/sarriette) gives the preferred French term, English `savory`, and notes the distinction between garden and mountain savory. It is an older terminology record and uses the historical spelling *Satureia hortensis*.
- Montréal’s [Espace pour la vie entry for sarriette commune](https://m.espacepourlavie.ca/carnet-horticole/sarriette-commune) identifies *Satureja hortensis* as `sarriette commune / summer savory` and documents leaves and flowers as culinary parts.
- [Kew Plants of the World Online](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:457680-1) accepts *Satureja hortensis* L. as a species.
- [VASCAN](https://data.canadensys.net/vascan/taxon/6452) lists `sarriette des jardins`, `summer savory`, and `summer thyme` among names for *S. hortensis*. The last term is omitted because the current picker would add this row to the three existing `thyme` results.
- [Ontario’s crop profile](https://www.omafra.gov.on.ca/CropOp/fr/herbs/culinary/ssav.html) and the Québec producer [La Brouette Maraîchère](https://www.labrouettemaraichere.com/products/sarriette-dete) support `sarriette d’été`, `sarriette des jardins`, and `sarriette commune` for *S. hortensis*. The producer’s plant listing was sold out when reviewed; these sources support terminology and culinary scope, not availability or measures.
- The Montréal Botanical Garden’s [winter-savory entry](https://m.espacepourlavie.ca/carnet-horticole/sarriette-vivace) identifies *Satureja montana* as `sarriette vivace / winter savory`, supporting a separate identity.
- A [Save-On-Foods listing](https://www.saveonfoods.com/sm/pickup/rsid/5530/product/mccormick-summer-savory-leaves-id-00066200002046) uses the packaged product wording `Summer Savory Leaves`. Its package size is not a reusable measure.

## Picker projection and recipe demand

| Query | Expected result after R352 |
|---|---|
| `summer savory`, `summer savory leaves` | `ingredient-ref-summer-savory` |
| `sarriette d’été`, `sarriette des jardins`, `sarriette commune` | `ingredient-ref-summer-savory` |
| `savory`, `sarriette` | `ingredient-ref-summer-savory` today, via the display terms |
| `feuilles de sarriette` | No result from the new row; the Québec retail wording does not identify the species |
| `thyme` | Existing three thyme references; the new row is excluded |
| `summer thyme` | No result from the new row |
| `winter savory`, `sarriette vivace`, `sarriette des montagnes` | No result from the new row |

The manifest lists 114 recipes with 1,123 ingredient rows. Phrase scans found no summer-savory ingredient line and no matching recipe demand. No recipe link or amount was added.

## Validation

- Bundled seed-package normalization and validation passed; the reference count is 1,691.
- The generated `BundledIngredientCatalog.kt` index was refreshed and reports 1,691 references.
- Research ledger JSON schema validation passed; the ledger now has 2,041 records.
- Static picker projection, recipe-corpus scan, UTF-8/no-BOM, local-link, and whitespace checks passed.
- No software tests, build, emulator check, or deployment was run because this change only adds database JSON data under the updated `AGENTS.md` rule.
