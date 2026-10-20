# WP04 Section P — Mrigal market-name group review (R626)

- **Status:** Proposed; not integrated. No shared catalog, ledger, recipe, package, plan, or roadmap data changed.
- **Review and access date:** 2026-10-18.
- **Open checklist anchor:** The broad finfish and regional-fish item remains open in [Section P](../../RecipeBook-global-ingredient-catalog-plan.txt#L6485).
- **Candidate:** The CFIA Fish List returns two rows with English `Mrigal` and French `Carpe`: *Cirrhinus cirrhosus* (TSN 688892) and *Cirrhinus mrigala* (TSN 163679).
- **Recommendation:** Add one identity-only, species-neutral `mrigal` market-name group with a visible multi-species qualifier in both languages. Use French `mrigal`, attested by FAO for *C. mrigala*, and exclude `carpe` from the display and aliases because OQLF standardizes Québec fish-market `carpe` for *Cyprinus carpio*.
- **Scope:** This groups a shared market name; it does not assign either scientific name to an unqualified product, decide whether the two CFIA taxon records should be taxonomically reconciled, or establish culinary equivalence. The existing Catla hold ([R622](wp04-section-p-catla-carpe-fr-name-boundary-review-R622-20261018.md)), common-carp hold, and Rohu identity ([R594](wp04-section-p-next-seafood-review-r594-20261017.md)) remain unchanged; those names are considered only in the picker-boundary check below.

## Exact proposed catalog delta

Add one `PROTEIN` reference, with no aliases, forms, recipe links, measurements, density, unit mappings, package yields, conversions, or substitutions:

```json
{
  "id": "ingredient-ref-mrigal-market-group",
  "nameFr": "mrigal (nom utilis\u00e9 pour plusieurs esp\u00e8ces de poissons)",
  "nameEn": "mrigal (name used for multiple fish species)",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "PROTEIN"
}
```

If accepted, add a ledger record keyed by `ingredient-ref-mrigal-market-group` with `recordType: ingredient_reference`, `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Its accepted decision should state that the qualified market group covers the two CFIA name rows, uses French `mrigal` rather than the conflicting Québec market label `carpe`, and adds no aliases or numeric/substitution behavior. Add no measurement observations or substitution findings.

## Evidence and naming boundary

The CFIA Fish List gives both *Cirrhinus cirrhosus* (TSN 688892) and *C. mrigala* (TSN 163679) the same Canadian fish-labelling names, `Mrigal / Carpe`. CFIA says its Fish List contains acceptable English and French common names for Canadian fish labelling and maps them to scientific names and TSNs. This supports one visibly qualified name group, not one species assignment. [Reused shared source IDs `WP04-SECTIONP-BREAM-MARKET-GROUP-R604-20261018-S01` and `WP04-FINFISH-GAPS-20261010-S11`]

FAO's French-language cultured-species fact sheet identifies *Cirrhinus mrigala* and gives the English name `Mrigal carp` and French name `Mrigal`. It supports French `mrigal` for that species, but does not establish a French label for every product carrying the broader CFIA market name. Keep `Mrigal carp` source-local: storing it as an alias would also make the generic English query `carp` return this one group. [S01]

OQLF's GDT entry for `carpe` identifies *Cyprinus carpio* and says that Québec fish-product marketing standardized one species-specific term to avoid consumer-label confusion. Therefore, do not copy CFIA's `Carpe` label into this group's French display or aliases. This preserves the earlier common-carp and Catla boundary decisions without reopening them. [S02]

A current Montréal fish retailer lists products titled `MRIGAL I CARPE`, alongside separately titled products and product-size listings. This establishes local retail wording and a product-market context, but the page gives no scientific name for the Mrigal products and its package weights are SKU-specific; it does not support a cut form, reusable recipe measure, yield, or substitution. [S03]

## Ownership, bilingual picker behavior, and recipe demand

The current seed contains **1,825 ingredient references** and **156 forms**; the legacy import file contains **56 candidates** and the research ledger contains **2,197 records**. Exact normalized scans found no active reference, form, legacy candidate, or ledger record for `mrigal`, `mrigel`, `mrigala`, *Cirrhinus cirrhosus*, *C. mrigala*, `ingredient-ref-mrigal-market-group`, or the proposed new source IDs. The exact FAO, OQLF, and Montréal retailer URLs below have no existing ledger owner. No earlier Mrigal-specific proposal or batch was found; the existing references in R594 and R622 mention Mrigal only as a neighboring fish or picker-collision term.

The picker first prefers complete word phrases and then uses substring matching. The projection below uses only the proposed display terms and empty alias arrays:

| Query | Current result | With proposed group | Boundary |
|---|---|---|---|
| `mrigal` | No result | Mrigal market-name group | Makes the source-attested market name searchable in both languages while displaying its multi-species scope. |
| `mrigal carp` | No result | No result | Keep FAO's English phrase source-local; do not make generic `carp` select the group. |
| `carpe` | No result | No result | Do not apply OQLF's *Cyprinus carpio* term to this group. |
| `carp` | Existing substring fallback to `mascarpone` | Same existing result | The proposed row contains no `carp` term and does not change the common-carp boundary. |
| `rohu` | Rohu | Rohu | No Rohu label or row is changed. |
| `catla` | No result | No result | The R622 Catla hold remains untouched. |

The complete manifest-listed bundle was scanned: **114 recipe files** and **1,123 structured ingredient rows**. Whole-file and structured-row searches for `mrigal`, `mrigel`, `mrigala`, `Cirrhinus mrigala`, and `Cirrhinus cirrhosus` found **zero matching files and zero matching rows**. There is no bundled recipe demand, form specification, or amount to link. The retailer's product weights remain specific to those listings and must not become a kitchen measure, density, edible yield, or conversion. No source establishes a directed substitution to Rohu, Catla, common carp, or another fish.

## Source register and ownership

Source IDs prefixed `WP04-SECTIONP-MRIGAL-MARKET-R626-20261018-` are proposal-local and are not allocated in the shared ledger. Reuse the two already-owned CFIA source IDs rather than adding duplicate Fish List URLs.

| Source ID | Source and evidence | Limit and ownership |
|---|---|---|
| **Reused `WP04-SECTIONP-BREAM-MARKET-GROUP-R604-20261018-S01`** | CFIA, [Search CFIA Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), rows for *Cirrhinus cirrhosus* (TSN 688892) and *C. mrigala* (TSN 163679); source ID first recorded in the [R604 proposal](wp04-section-p-bream-sea-bream-market-group-review-r604-20261018.md). | Both rows pair `Mrigal / Carpe`. The Fish List is Canadian fish-labelling evidence; it does not establish culinary interchangeability. Keep the existing source ID and URL. |
| **Reused `WP04-FINFISH-GAPS-20261010-S11`** | CFIA, [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list). | Describes the Fish List's common-name, scientific-name, and TSN scope. Already ledger-owned; do not duplicate its URL. |
| **WP04-SECTIONP-MRIGAL-MARKET-R626-20261018-S01** | FAO, [Cirrhinus mrigala cultured-species fact sheet](https://www.fao.org/fishery/docs/DOCUMENT/aquaculture/CulturedSpecies/file/fr/fr_mrigalcarp.htm), 2009. | Lists `Mrigal carp / Mrigal` under English and French FAO names for *C. mrigala*. This is not evidence that every CFIA-listed Mrigal product is that taxon. No exact URL owner was found in the shared ledger. |
| **WP04-SECTIONP-MRIGAL-MARKET-R626-20261018-S02** | OQLF, [GDT: carpe](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198858/carpe), last updated 2011. | Defines the Québec fish-market term `carpe` for *Cyprinus carpio* and describes its species-specific standardization. No exact URL owner was found in the shared ledger. |
| **WP04-SECTIONP-MRIGAL-MARKET-R626-20261018-S03** | Bismillah Bazaar, [Montréal fish listings](https://www.newbismillahbazar.com/cat-products.php?cat-name=Fish&mec_catid=15), address shown as 6495 Avenue Victoria, Montréal, Québec. | Current product titles include `MRIGAL I CARPE` and additional Mrigal listings. Vendor naming and SKU-level package ranges only; no taxon or reusable recipe amount. No exact URL owner was found in the shared ledger. |
| **R01** | Read-only repository audit of Section P, R594/R604/R618/R622 materials, active references/forms, legacy candidates, ledger, picker code, package manifest, and every manifest-listed recipe. | No shared catalog, ledger, recipe, package, plan, or roadmap file was modified. |

Static proposal checks: valid UTF-8 without BOM; no mojibake markers; final newline present; no trailing whitespace; local links resolve; proposed IDs are unallocated. No software tests, build, emulator run, or deployment were run or needed for this proposal-only review under `AGENTS.md`.
