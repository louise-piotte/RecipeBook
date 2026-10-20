# WP02 Sections A/B/A6 R246 — Sprouted sorghum flour identity review — 2026-10-16

## Review record

- **Reviewed and sources accessed:** 2026-10-16.
- **Status:** Coordinator reviewed; held pending a safe picker boundary. No catalog or ledger data was changed. See the [R246 hold README](../batches/wp02-a6-sprouted-sorghum-flour-picker-hold-integration-r246-20261016/README.md).
- **Scope:** One open A6 product boundary: flour made from sprouted sorghum, separate from plain sorghum flour and from whole sprouted sorghum grain.
- **Checklist context:** The broad WP02 A6 review remains open at [plan line 1598](../../RecipeBook-global-ingredient-catalog-plan.txt#L1598). This proposal covers one flour product only; it does not close the parent checklist.
- **Namespace check:** No prior R246 proposal/prefix or exact candidate ID was found. The proposed source-ID prefix is `WP02-A6-SPROUTED-SORGHUM-FLOUR-R246-20261016-S`.

## Recommendation

**Add one identity-only `FLOUR_AND_STARCH` reference for `sprouted sorghum flour`, with the provisional Québec French display `farine de sorgho germé` and the single English alias `sprouted jowar flour`.** Everspring is an Ontario grain/flour supplier whose current supplier-directory listing offers organic sprouted sorghum in whole and flour forms; a current Canada storefront separately sells Sprout Feast’s `Sprouted Jowar Flour` and identifies the ingredient as sprouted jowar (sorghum). This is enough to distinguish a marketed process-qualified flour from plain sorghum flour. It does not define a universal sprouting, drying, milling, or safety specification. [S01–S04]

OQLF gives the Québec base name `sorgho` as a masculine noun and pairs it with English `sorghum` and Latin *Sorghum bicolor*. The official CFIA biology page confirms that *S. bicolor* grain can be milled into food flour. These support the base identity, but no Québec or Canadian French package for this sprouted flour was found. Treat `farine de sorgho germé` as a transparent, provisional construction pending independent Québec review; it is not an OQLF-preferred product name. Keep French aliases empty. [S05–S06]

The shorter queries `sprouted sorghum` and `sorgho germé` will also find this flour because the current search matches complete word phrases contained in displayed names. That is a visible limitation: WP03 R94 continues to hold the separate whole-grain product under these unqualified phrases. Do not add either short phrase as an alias, and do not alter R94's whole-grain hold. The full English and French flour phrases remain unique. The owner should review the short-query effect before catalog integration. [WP03 R94; search projection below]

### Proposed reference JSON delta

```json
{
  "id": "ingredient-ref-sprouted-sorghum-flour",
  "nameFr": "farine de sorgho germé",
  "nameEn": "sprouted sorghum flour",
  "aliasesFr": [],
  "aliasesEn": ["sprouted jowar flour"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Keep the row separate from plain sorghum flour and from whole sprouted sorghum grain. Do not attach sprouting as a form to `ingredient-ref-sorghum-flour`: available sellers name sprouted flour as a product in its own right, and the current catalog already represents other process-qualified flours as separate identities. Do not add `malted sorghum flour`, `fermented sorghum flour`, `sorghum sprouts`, `sorghum germinated`, `sorgho germé`, `farine de jowar`, or a bare `jowar` alias. The malted and fermented boundaries are separate and unresolved.

## Current ownership and prior-work audit

The active bundled snapshot contains **1,639 ingredient references**, **124 ingredient forms**, **61 legacy-import candidates**, and **1,986 research-ledger records**. The manifest lists **114 recipes and 1,123 structured ingredient rows**.

The proposed ID and exact phrases have no current owner in reference names/aliases, forms, legacy candidates, or ledger IDs/decisions:

- `ingredient-ref-sprouted-sorghum-flour`
- `sprouted sorghum flour`; `sprouted jowar flour`
- `farine de sorgho germé`; `farine de sorgo germé`

No exact current form or candidate holds these flour phrases. The current `ingredient-ref-sorghum-flour` row has null default density and empty unit mappings; it owns `sorghum flour / farine de sorgho`, plus English aliases `jowar flour`, `jowar atta`, `guinea corn flour`, `sweet white sorghum flour`, and `red sorghum flour`. Existing nearby rows are:

| Current owner | Existing boundary | R246 treatment |
|---|---|---|
| `ingredient-ref-grain-sorghum` | `grain sorghum / sorgho à graine`; includes `jowar whole`, `guinea corn`, and `red sorghum` aliases. | Keep whole grain distinct. Do not add an unqualified sprouted-grain name. |
| `ingredient-ref-sorghum-flour` | Plain `sorghum flour / farine de sorgho`; includes the qualified `jowar flour` and `jowar atta` aliases. | Keep it unchanged; do not transfer sprouted flour to this row. |
| `ingredient-ref-sorghum-grits` and `ingredient-ref-sorghum-semolina` | Separate milling products in `GRAIN_AND_CEREAL`. | No aliases or numeric behavior shared with flour. |
| `ingredient-ref-sorghum-starch` | Extracted starch in `FLOUR_AND_STARCH`. | Keep distinct from flour. |
| `ingredient-ref-sprouted-millet`, `ingredient-ref-sprouted-buckwheat-flour`, `ingredient-ref-sprouted-amaranth-flour`, and sprouted wheat/spelt flour rows | Other source-qualified sprouted ingredients. | They support the catalog pattern of preserving source and process identity, not a sorghum conversion or specification. |
| `candidate-malted-sorghum-flour` | R36 ledger hold for a malted product with uncertain Canadian/Québec scope and French name. | Keep separate; sprouted and malted are not aliases. |

**Prior-work check:** WP03 R94 is a whole-sprouted-sorghum-grain review, not a flour review. Its scope explicitly excludes sprouted or malted sorghum flour. It mentions Everspring's older brochure and the supplier directory only as adjacent evidence, then holds whole grain because local naming and product-stage questions remain unresolved. R36 is an A7 malted-flour hold with different process evidence. Neither proposal decided the identity or French name of this marketed sprouted flour. The exact candidate and proposal filename are not present in prior proposal/batch records. The old brochure, supplier-directory URL, OQLF entry, and Aliments du Québec listing below are cited as reused evidence where already held; no duplicate shared-ledger source records are proposed.

Current name and alias ownership was checked against the read-only reference file. The 124 forms contain no sorghum or jowar flour form. Both active global and contextual substitution-rule files contain no rules; the package-yield file has one unrelated record and no sorghum entry.

## Picker projection

The projection follows [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, compatibility characters, punctuation, and whitespace; prefer complete normalized word phrases; then use substring matching only if no complete phrase matches. Counts are ingredient references, not forms.

| Query | Current results | Projected results | Result or ambiguity |
|---|---:|---:|---|
| `sprouted sorghum flour` | 0 | 1 | New flour only. |
| `sprouted jowar flour` | 0 | 1 | New flour only; exact Canadian-market product phrase. |
| `sprouted sorghum` | 0 | 1 | New flour, although the whole-grain candidate remains held. Do not add this phrase as an alias. |
| `sorgho germé` | 0 | 1 | New flour by display-phrase containment; this remains a provisional and potentially ambiguous French search. |
| `sorghum flour` | 1 | 2 | Plain and sprouted sorghum flour. |
| `jowar flour` | 1 | 2 | Plain generic sorghum flour and sprouted sorghum flour. The plain phrase remains on the existing generic row only. |
| `jowar` | 3 | 4 | Existing grain, flour, and semolina results plus the sprouted flour. |
| `sorghum` | 6 | 7 | Adds the process-qualified flour to the broad family search. |
| `farine de sorgho` | 1 | 2 | Generic and sprouted flour. |
| `farine de sorgho germé` | 0 | 1 | New provisional French display only. |

The two full product phrases are currently unowned. The broad-query expansion is disclosed because the current matcher cannot require the `flour` qualifier before returning a contained phrase. A later search-design change could separate the unqualified whole-grain query from flour without changing these identities.

## Bundled recipe demand

All **114 manifest-listed recipe JSON files**, **1,123 ingredient rows**, and their string fields were scanned with the repository's lowercase/accent/punctuation normalization for `sprouted sorghum flour`, `sprouted jowar flour`, `sprouted sorghum`, `sorghum flour`, `jowar flour`, `farine de sorgho germé`, `sorgho germé`, `farine de sorgho`, and the proposed ID. The scan found **zero matching files, zero matching ingredient rows, and no reference link**. The product addition is supported by current ingredient coverage, not bundled recipe demand. No recipe link or relink is proposed.

## Forms, measurements, conversions, package observations, and substitutions

- **Forms:** The form catalog contains no sorghum flour form. Keep this as a separate flour reference, not a sprouted form attached to plain sorghum flour or grain.
- **Density and unit mappings:** No candidate-specific g/ml density, cup/spoon quantity, or volume-to-mass evidence was found. Keep `defaultDensity` null and `unitMappings` empty.
- **Packages:** The Canada storefront listing shows an 800 g bag; the current Everspring directory states a five-by-50-lb minimum order; the older Everspring brochure mentions bulk packages including 50-lb bags and 2,000-lb totes. Everspring's current general shop page also describes wholesale bag/tote packaging. These are package or ordering observations only, from different suppliers and source dates. They do not define a household measure or transferable mass-volume mapping.
- **Conversions and yields:** No conversion between plain and sprouted sorghum flour, and no cooking or package yield, is supported.
- **Substitutions:** Everspring's current general FAQ says sprouted flours behave similarly to whole-grain/whole-wheat flours and generally require more liquid; it gives no amount, sorghum-specific formula, or validated general replacement rule. The current Canada storefront says to combine its product with other gluten-free flours, also without proportions. Keep these as product/general guidance only; do not activate a substitution to or from plain sorghum flour or wheat flour.
- **Nutrition and safety claims:** Do not import marketing nutrition, digestibility, gluten-free, or health claims to a generic identity. The sources do not establish a universal sprouting/drying protocol for sorghum flour.

## Source register

New sources were accessed on 2026-10-16. Unless otherwise stated, a current web listing has no visible last-updated date; `accessed` refers to this review date. Source-specific package and process claims are not generalized.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP02-A6-SPROUTED-SORGHUM-FLOUR-R246-20261016-S01` | The Whole Grains Council, [Wholesale Ingredient Sources](https://wholegrainscouncil.org/find-whole-grains/wholesale-ingredient-sources), Everspring Farms Ltd. listing; accessed 2026-10-16. | Lists `Organic Sprouted Sorghum (Whole, Flour)`, gives a 5 × 50-lb minimum order, and says products ship from Seaforth, Ontario. The page has no visible update date and is a directory, not a consumer label or Québec naming source. It is the strongest current product-family signal for the Canadian supplier, not proof of a particular package or current stock. |
| `WP02-A6-SPROUTED-SORGHUM-FLOUR-R246-20261016-S02` | Pushmycart, [Sprout Feast Sprouted Jowar Flour](https://pushmycart.com/en-ca/products/sprout-feast-sprouted-jowar-flour), Canada storefront; accessed 2026-10-16. | Names an 800-g `Sprouted Jowar Flour`, identifies the ingredient as 100% sprouted jowar (sorghum), and recommends combining it with other gluten-free flours without a ratio. The indexed page is marked published four months earlier; it is a Canada-facing imported-product listing, not a Canadian manufacturer or Québec French package. Package weight is not a household measure. |
| **Reused from R94 by URL** | Everspring Farms, [2020 bakery brochure](https://www.everspringfarms.ca/wp-content/uploads/2020/10/bakery.pdf); source ID `WP03-SPBARLEY-20261012-S02` reused by citation. | The manufacturer lists `Sprouted Sorghum Flour` in a whole-grain flour offering and describes bulk formats including 50-lb and 2,000-lb totes. This is older B2B evidence; it does not prove present stock, consumer package, French name, or a kitchen measure. |
| **Reused from R94 by URL** | Whole Grains Council, [Wholesale Ingredient Sources](https://wholegrainscouncil.org/find-whole-grains/wholesale-ingredient-sources); same URL as S01. | R94 already recorded the directory's Everspring listing. R246 cites the page for its current checked wording and Ontario shipping location, without creating another shared-ledger source record. |
| **Reused source** | Everspring Farms, [About Us](https://www.everspringfarms.ca/about/) and [Shop/FAQ](https://www.everspringfarms.ca/shop/); existing ledger source IDs `WP03-SPBARLEY-20261012-S03` and `WP03-SPBARLEY-20261012-S04` reused by citation. | Current site identifies the company as an Ontario supplier and describes sprouting/milling operations. Its general FAQ discusses sprouted-flour behavior, package formats, minimum orders, and product-development support. It does not provide a sorghum-specific recipe ratio or current individual sorghum flour detail page. |
| **Reused from R94 by URL** | Canadian Food Inspection Agency, [La biologie du *Sorghum bicolor* (L.) Moench](https://inspection.canada.ca/fr/varietes-vegetales/vegetaux-caracteres-nouveaux/demandeurs/directive-94-08/documents-biologie/sorghum-bicolor-lmoench), section 4.3; accessed 2026-10-16. | Says *S. bicolor* seed can be processed into flour for foods. This official biology document supports the base grain/flour relationship, not sprouting, a consumer product, a conversion, or a Québec market label. |
| **Reused source** | OQLF, [sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho), last updated 2010; source ID `WP03-MILO-GRAIN-20261012-S01` reused by citation. | Gives preferred masculine `sorgho`, accepted spelling `sorgo`, English `sorghum`, and *Sorghum bicolor*. It does not name flour or approve the compound `farine de sorgho germé`. |
| **Reused source** | Aliments du Québec, [Farine de sorgho](https://alimentsduquebec.com/aliments-dici/produits-cerealiers/farine-de-sorgho); source ID `WP02-A6-JOWARI-FLOUR-R158-20261016-S03` reused by citation. | Current Québec product-directory wording for generic sorghum flour. It does not establish a sprouted product name or French alias. |
| **Reused source** | FSSAI, [Food Product Standards, Chapter 2.4 Cereals and Cereal Products](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals%20and%20Cereal%20products.pdf), version dated 2023-10-05, section 2.4.18, PDF p. 60; existing document source ID `WP02-S136` reused by URL with a new pinpoint locator. | Defines plain `Jowar Flour (Sorghum Flour)` as milled *Sorghum bicolor* grain. This is an Indian plain-flour standard, not a sprouted-flour specification, Canadian label, Québec term, particle-size transfer, or kitchen measure. |

## Local references

- [WP02 Section A6 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1598).
- [WP03 Section F R94 sprouted-sorghum-grain review](wp03-section-f-r94-next-grain-review-20261014.md), which held the distinct whole-grain product and explicitly excluded sprouted flour from its scope.
- [WP02 A7 R36 malted-sorghum-flour review](wp02-a7-malted-sorghum-flour-boundary-review-20261013-round36.md), which holds a separate malted product candidate.
- Read-only checks used current [ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [global substitution rules](../../../app/src/main/assets/seed/bundled-library/substitution-rules.v1.json), [contextual substitution rules](../../../app/src/main/assets/seed/bundled-library/contextual-substitution-rules.v1.json), [package yields](../../../app/src/main/assets/seed/bundled-library/package-yields.v1.json), [legacy-import identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), the manifest-ordered recipe corpus, and the current search implementation.

## Coordinator disposition

**Hold the proposed identity outside the active reference catalog and research ledger.** The product evidence supports a distinct sprouted-flour product, but the proposed French display `farine de sorgho germé` makes the unqualified query `sorgho germé` return the flour as its only result. WP03 R94 separately holds whole sprouted sorghum grain because the same short phrase does not identify a product state and Québec French wording remains unresolved. The current picker cannot prioritize the full `farine de ...` phrase over its contained short query. No recipe demand offsets this ambiguity.

Do not add the proposed `sprouted jowar flour` alias or any French alias, identity, form, measurement, package yield, recipe link, conversion, or substitution yet. Reopen when an independently reviewed Québec French product name distinguishes flour from whole grain, or when picker behavior can make the qualified product phrase resolve without making `sorgho germé` look uniquely flour-specific. Keep the R94 whole-grain hold unchanged.

No tests or emulator checks were run. This is a documentation-only hold; no database JSON was changed.
