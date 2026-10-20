# WP06 Europe — Piquillo pepper identity review (R449)

- **Reviewed:** 2026-10-17.
- **Status:** Integrated on 2026-10-17 after root review; see the integration record at
  `docs/catalog/batches/wp06-europe-piquillo-pepper-identity-integration-r449-20261017/README.md`.
- **Scope:** One pepper-variety identity associated with Navarra and Spanish cuisine. The proposed
  row is for the Piquillo pepper type, not a claim that every item sold under that name is the
  protected Lodosa product.
- **Source-ID prefix:** `WP06-EUROPE-PIQUILLO-PEPPER-R449-20261017`. The proposed reference ID,
  source prefix, target path, and source URLs were checked against the live workspace before writing.

## Recommendation

Add one identity-only **VEGETABLE_AND_AROMATIC** reference for **`piquillo pepper / piment de
piquillo`**. Current Québec-facing product evidence uses `Piquillo pepper(s)` and the French
ingredient wording `piment de piquillo`; the Spanish product specification identifies the Piquillo
variety as the pepper used for the protected Lodosa product. A Canadian distributor also lists a
Piquillo product imported from Peru. Together these support a useful variety-level picker identity
while showing why the unqualified row must not claim Navarre origin or PDO status. [S01–S06]

The complete bundled recipe corpus has no matching demand. If accepted, add only the reference row
below. Add no forms, measurements, density, unit mappings, conversions, recipe links, yields, or
substitutions.

### Proposed catalog row

| Field | Value |
|---|---|
| id | `ingredient-ref-piquillo-pepper` |
| nameEn | `piquillo pepper` |
| nameFr | `piment de piquillo` |
| aliasesEn | `piquillo peppers` |
| aliasesFr | empty |
| defaultDensity | `null` |
| unitMappings | empty |
| category | `VEGETABLE_AND_AROMATIC` |

The display and English alias follow current Québec product wording: Metro’s bilingual item uses
`Grilled Piquillo Peppers` / `Piments de piquillo grillés` and lists the ingredient in singular in
both languages; ILIOS lists `Piments Piquillo / Piquillo Peppers`. The paired Metro pages describe
one item, not two independent market observations. No French plural alias is proposed because it
would make the generic query `piments` a new single-result search. [S04–S06]

## Product and naming boundaries

- **Piquillo variety:** The Spanish Ministry’s product specification identifies the protected
  Lodosa product as fruit of *Capsicum annuum* L., variety “piquillo.” This proposal uses that
  variety-level boundary for the unqualified food ingredient name. It does not assign a place of
  origin to an unqualified market listing. [S02]
- **Pimiento del Piquillo de Lodosa PDO:** The European Commission’s in-force 2020 amendment
  records the protected designation and approves its current singular registered name. The
  official specification limits the PDO to a product tied to its defined Navarre area and required
  processing. Keep `Pimiento del Piquillo de Lodosa`, `Piquillo de Lodosa`, and `Lodosa` out of the
  proposed aliases; a generic Piquillo reference must not certify origin or protected status. [S01–S03]
- **Québec-market distinction:** Metro’s item 055789001076 is a grilled, jarred Piquillo product;
  the French ingredient panel uses `piment de piquillo`. ILIOS item 2895IG is listed as `Piments
  Piquillo` and is explicitly imported from Peru. Those labels support local naming and show that
  the name is used beyond the Lodosa PDO; they do not establish cultivar verification for every
  commercial product or the availability of fresh fruit. [S04–S06]
- **Lodosa product listing:** Montréal retailer L’Española currently lists El Navarrico “Whole
  Lodosa Piquillo Peppers,” describes the peppers as grown in Lodosa, Navarra, Spain, and identifies
  the item as a Spanish product. Its product description does not establish PDO certification, so
  it is used only as local regional-product and naming evidence. [S07]
- **Adjacent pepper identities:** Keep the existing Padrón, Espelette powder, poblano, Cubanelle,
  and other named pepper identities separate. Do not create a generic bell-pepper, red-pepper, or
  sweet-pepper alias; no active generic red/bell-pepper owner was found. A shared *Capsicum* family,
  sweetness, color, or roasted presentation does not establish a common identity or a substitute.
- **Québec French:** No direct OQLF entry for piquillo was found in this review. The French display
  follows the current Metro French ingredient wording; it is a market-attested label, not an OQLF
  terminology ruling.

## Live ownership and archive audit

Read-only workspace snapshot taken on 2026-10-17:

| Surface | Snapshot | Finding |
|---|---:|---|
| Active ingredient references | 1,740 | No Piquillo/Lodosa phrase or proposed ID. Nearby rows are other named pepper identities. |
| Ingredient forms | 141 | No Piquillo/Lodosa label, match term, or proposed-ID owner. |
| Legacy import candidates | 56 | No Piquillo/Lodosa candidate or proposed-ID owner. |
| Research ledger | 2,099 records; 9,543 source entries | No Piquillo/Lodosa identity record, phrase, proposed ID, or R449 source-prefix collision. |
| Numeric and rule data | 8 unit conversions; 0 global substitutions; 0 contextual substitutions; 1 package yield | No candidate-related conversion, rule, or yield. |
| Proposal and batch archive | Current catalog archive | Exact searches found no focused Piquillo/Lodosa identity review, allocation, or integration. |
| Proposed allocation | Checked before writing | `ingredient-ref-piquillo-pepper`, this target path, the R449 source prefix, and S01–S08 source IDs are unallocated. |

The ownership search covered active bilingual names and aliases, all form labels and match terms,
legacy candidate text, ledger records and source URLs, and proposal/batch archives. The only
existing exact URL overlap among the sources listed below is the general ILIOS French product-list
page; it is already cited in the ledger for unrelated products. This proposal uses a new R449 source
ID and the Piquillo-specific item locator rather than reusing those unrelated source records.
Earlier European reviews R393–R446, including the R442 Ossau-Iraty and integrated R446 Fourme
d’Ambert identities, do not overlap this pepper identity. The open Europe-wide item remains
uncompleted in the [global plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9178).

## Phrase-first picker projection

The current picker normalizes accents and punctuation, checks complete word phrases first, then
falls back to substring matches in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt).
The projection adds the proposed bilingual names and aliases only; no forms are proposed.

| Query | Current result count | With proposed row | Effect |
|---|---:|---:|---|
| `piquillo`; `piquillo pepper`; `piquillo peppers` | 0 | 1 | Resolves only to `ingredient-ref-piquillo-pepper`. |
| `piment de piquillo` | 0 | 1 | Resolves only to the proposed row. |
| `piments de piquillo`; `piments piquillo`; `piments` | 0 | 0 | No French plural alias is added; the broad `piments` query remains unchanged. |
| `Piquillo de Lodosa`; `Lodosa` | 0 | 0 | Remains unallocated; no protected-name or origin alias is proposed. |
| `pepper` | 31 | 32 | One result is added to the broad English query. |
| `piment` | 26 | 27 | One result is added to the broad French query. |
| `peppers` | 10 | 11 | The broad English plural query gains the new item. |
| `red pepper`; `red bell pepper`; `poivron rouge` | 0 | 0 | No red-pepper cross-alias is introduced. |

The exact English Piquillo terms and the French singular term gain one result. The protected Lodosa
product name remains outside this variety-level row, and existing pepper identities receive no new
aliases.

## Complete bundled recipe scan

All **114 manifest-listed recipe JSON files** and **1,123 structured ingredient rows** were parsed
as UTF-8. The scan checked the complete decoded recipe documents and ingredient rows, including
original text, ingredient name, reference ID, and form ID, for `piquillo`, `pimiento del piquillo`,
`piment(s) de piquillo`, `Lodosa`, and the proposed reference ID. It found **zero matching recipe
files, zero matching ingredient rows, and zero linked recipe IDs**.

The manifest-order corpus contains **753,988 bytes** and has fingerprint
`94505e664f049b1bdaee06ea27db86d3d9f817df11c8ac7f73a5b5dc29e5828b`. The fingerprint hashes each
manifest-relative path, a NUL byte, the lowercase SHA-256 digest of that recipe file, and a newline,
then hashes the concatenated bytes.

## Forms, measurements, and substitutions

- **Forms:** Add none. The proposal covers the Piquillo pepper identity and does not normalize
  fresh, grilled, roasted, jarred, whole, or cut presentations. The protected Lodosa specification
  distinguishes product and processing presentations; it does not make those general forms of the
  variety-level reference. [S02]
- **Measurements:** Set `measurementState` to `researched_no_supported_value` if integrated, with
  empty observations, `defaultDensity: null`, and `unitMappings: []`. The MAPA specification’s
  fruit-weight range describes protected-product standards, not a kitchen portion or count mapping.
  Metro’s 250 mL jar, ILIOS’s case pack, and L’Española’s product-specific package are not reusable
  measures, drained yields, densities, or unit conversions. [S02, S04, S06–S07]
- **Recipe links:** The complete bundle has no matching line; add no linked recipe or recipe-specific
  measurement.
- **Substitutions:** No substitution review was conducted. Use `substitutionResearchState:
  not_yet_researched` if integrated and add no global or contextual rule. Similar color, sweetness,
  or stuffing use does not establish that bell pepper, Padrón pepper, or another pepper can replace
  Piquillo in a recipe.

## Evidence limitations

- The legal sources define the narrower Lodosa PDO product. They do not establish that every
  commercial item called Piquillo is grown from verified seed stock of that variety.
- Metro’s English and French pages refer to the same item and are not independent observations. The
  pages were search-indexed recently, but a direct fetch of the Metro French URL returned HTTP 403
  during this review; the retailer’s search results report the item out of stock. Treat its wording
  as current indexed catalog evidence, not an in-store availability check. [S04–S05]
- MAPA’s official product specification and registry record were found through official search
  results, but direct page/PDF retrieval returned an internal error in this review. The accessible
  European Commission regulation confirms the PDO amendment and legal status; the direct MAPA links
  remain available for curator follow-up. [S01–S03]
- ILIOS’s product list is Canadian distributor evidence, not a Québec terminology authority. Its
  listed Peruvian origin is useful as a boundary signal, not as evidence of European provenance.
- L’Española’s listing is current retailer evidence and a retailer claim about the item’s origin; the
  page does not display a verifiable PDO mark. Its package amount and availability are item-specific.
- No recipe demand, general quantity, cultivar-to-cultivar equivalence, or substitute relationship
  was found.

## Source register

Sources S01–S08 are proposal-local. The prefix and source-ID range were checked against the live
ledger and archive before writing. URLs were checked for exact ownership; the ILIOS French product
list URL is reused for a different item locator and is called out above. Pages were accessed on
2026-10-17 unless otherwise noted.

| Source ID | Source and locator | Use and limit |
|---|---|---|
| `WP06-EUROPE-PIQUILLO-PEPPER-R449-20261017-S01` | European Commission, [Implementing Regulation (EU) 2020/1528](https://eur-lex.europa.eu/eli/reg_impl/2020/1528/oj/eng), in force, amending the registered name and PDO specification for Piquillo de Lodosa. | Primary legal record. Approves the current singular protected name `Pimiento del Piquillo de Lodosa`; it does not make the generic Piquillo name a geographic-origin claim. |
| `WP06-EUROPE-PIQUILLO-PEPPER-R449-20261017-S02` | Spanish Ministry of Agriculture, Fisheries and Food (MAPA), [Pimiento del Piquillo de Lodosa PDO product specification](https://www.mapa.gob.es/dam/mapa/contenido/alimentacion/temas/calidad-agroalimentaria/2017-calidad-diferenciada/nuevo_denominaciones/pliegos-de-condiciones/pliego-condiciones-agroalimentarios/pimiento_piquillo_lodosa_2020_10_21.pdf), approved under Regulation (EU) 2020/1528. | Official specification identifies *Capsicum annuum* L. variety `piquillo`, defines the protected product and area, and specifies processing. Fruit dimensions and weight are product-standard facts, not kitchen measurements. |
| `WP06-EUROPE-PIQUILLO-PEPPER-R449-20261017-S03` | MAPA, [DOP/IGP product record: Pimiento del Piquillo de Lodosa](https://www.mapa.gob.es/es/alimentacion/temas/calidad-diferenciada/dop-igp/detalle/hortalizas/dop_pimientopiquillo). | Official Spanish registry page linking the product to its regulator. Used as current institutional context; the detailed product boundary comes from S01–S02. |
| `WP06-EUROPE-PIQUILLO-PEPPER-R449-20261017-S04` | Metro Québec, [Piments de piquillo grillés](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/condiments-et-garnitures/legumes-marines-et-antipasti/piments-de-piquillo-grilles/p/055789001076), item 055789001076. | Current indexed French product title and ingredient-list wording `piment de piquillo`. The listed 250 mL jar is product-specific; the retailer page reported out of stock at review. |
| `WP06-EUROPE-PIQUILLO-PEPPER-R449-20261017-S05` | Metro Canada, [Grilled Piquillo Peppers](https://www.metro.ca/en/online-grocery/aisles/pantry/condiments-toppings/pickles-antipasto/grilled-piquillo-peppers/p/055789001076), item 055789001076. | English title and ingredient wording for the same Metro item as S04. Paired bilingual retailer evidence, not a separate market or product observation. |
| `WP06-EUROPE-PIQUILLO-PEPPER-R449-20261017-S06` | ILIOS Foods, [French product catalogue](https://fr.iliosfoods.ca/products), marinated-vegetables listing, item 2895IG. | Lists `Piments Piquillo`, 12 × 290 mL, imported from Peru. Canadian distributor evidence for local naming and non-Lodosa product usage; it does not prove cultivar identity beyond its product labeling. This exact page URL is already in the ledger under unrelated item locators. |
| `WP06-EUROPE-PIQUILLO-PEPPER-R449-20261017-S07` | L’Española, Montréal, [El Navarrico Whole Lodosa Piquillo Peppers](https://lespanola.com/products/el-navarrico-whole-lodosa-piquillo-peppers-390-g), retailer listing. | Current Montréal listing calls the item a Spanish product and says the peppers are grown in Lodosa, Navarra. The product description does not establish PDO certification; its package amount and stock are SKU-specific. |
| `WP06-EUROPE-PIQUILLO-PEPPER-R449-20261017-S08` | Consejo Regulador DOP Piquillo de Lodosa, [Origin of Piquillo de Lodosa](https://www.piquillodelodosa.com/en/denominacion-origen/origen). | Producer regulator describes the variety and eight-municipality protected area. Used to clarify the PDO subset, not as independent Québec-market evidence or as proof that unqualified market Piquillo products are from Lodosa. |

## Disposition

Accepted and integrated as one identity-only **VEGETABLE_AND_AROMATIC** reference for **`piquillo
pepper / piment de piquillo`**, with the English plural alias only. The protected Lodosa product and
existing named-pepper identities remain distinct; no generic red/bell-pepper aliases were added.
No forms, numeric behavior, conversions, recipe links, yields, or substitutions were added. The
WP06 Europe regional coverage item remains open. See the integration README for the final counts and
static validation results.
