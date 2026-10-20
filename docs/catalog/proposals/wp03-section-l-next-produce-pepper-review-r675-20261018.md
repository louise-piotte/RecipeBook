# WP03 Section L R675 — Whole dried Ancho form under Poblano — 2026-10-18

- **Status:** Integrated 2026-10-18; see the [integration README](../batches/wp03-section-l-poblano-whole-dried-ancho-integration-r675-20261018/README.md). Ownership and picker counts below are the pre-integration proposal snapshot.
- **Disposition:** add one whole-dehydrated Ancho form under the active Poblano reference. Use Québec French **piment ancho entier séché** and English **whole dried ancho pepper**. Add no separate Ancho reference, powder form, measurement, conversion, substitution, or recipe link.
- **Scope:** resolve the whole-dried-Ancho identity-versus-form question explicitly deferred by the [R136 Poblano review](wp03-section-l-poblano-pepper-identity-review-r136-20261015.md). This is a new dried-product boundary, not another review of the already-integrated fresh Poblano identity.

## Plan, archive, and live-catalog audit

The active [Section L dried-chile checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6324) still names Ancho. R136 integrated fresh Poblano / piment poblano and its fresh form, while leaving Ancho outside that form pending this separate structural review. The earlier WP06 Mexican dried-chile sweep also recommends treating Ancho as Poblano’s named dried form; it did not change the live catalog. Recent focused Section L proposals for ñora, Kashmiri, Aleppo, and chipotle address separate chile names or boundaries.

Pre-integration read-only snapshot on 2026-10-18: **1,837 ingredient references**, **167 forms**, **56 legacy candidates**, **2,213 ledger records / 10,364 source entries**, and **114 manifest-listed recipes / 1,123 ingredient rows**. The live Poblano reference then had its fresh form and no Ancho alias or dried form. The form ID **ingredient-form-poblano-pepper-whole-dried-ancho** and R675 source-ID prefix were unallocated in that snapshot. The new Moulin aux Épices and Gaia Organics URLs had no prior ledger owners; the existing OQLF, Esslinger, and Club House evidence was reused by its R136 source ID. Integration has now allocated the form ID and two new source IDs.

Every manifest-listed recipe was scanned across its full JSON text and ingredient rows for Ancho and Poblano spellings, including ancho, ancho pepper, piment ancho, piments anchos, poblano, and piment poblano. There are **zero matching files or ingredient rows**. No recipe demand supports a link, quantity, or substitution.

## Evidence and Québec wording

The OQLF’s preferred French term is **piment poblano** and its English equivalent is **poblano pepper**. It says that when the pepper is dried it is known as **piment ancho**, gives **ancho pepper** as the associated English term, and lists **piments anchos** among its plural forms. A current Québec spice listing uses the whole-product title **Piment Ancho entier**. Together, the authoritative terminology and whole-product evidence support one named dried form under the existing Poblano identity.

The current Esslinger Foods Canada listing is titled “Ancho Chillies - Whole” and describes Ancho as the dried form of Poblano. Its whole-product title and description support bare English Ancho as the dried-form search term; its 120 g package is not a pepper weight. Moulin aux Épices’ indexed Québec listing is titled “Piment Ancho entier 30g”; direct retrieval returned a cache miss, so only the indexed title is used. Its 30 g is package size, not a pepper measure. Gaia Organics’ bilingual Ottawa seed listing says “Called Ancho when dried, Poblano when fresh” / “Appelé Ancho quand il est séché, Poblano quand il est frais”; this independently corroborates Ancho as the dried-state name, while remaining seed-product evidence rather than a food measure. The Club House / McCormick sheet concerns a separate ground Ancho product and supports keeping the powder presentation outside this whole form. Use bare Ancho only as an English form match term, not as a Poblano reference alias or French alias; OQLF-backed French terms remain piment ancho and piments anchos.

| Source ID | Source and use |
|---|---|
| WP03-L-POBLANO-20261015-R136-S01 (reuse) | [OQLF, piment poblano](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26559648/piment-poblano). Québec terms, English equivalent, plural, and dried-Poblano naming. |
| WP03-L-POBLANO-20261015-R136-S07 (reuse) | [Esslinger Foods Canada, Ancho Chillies — Whole](https://esslingerfoods.com/products/ancho). Current whole product and dried-Poblano description; package size is excluded from measurement evidence. |
| WP03-L-ANCHO-20261018-R675-S01 (new) | [Moulin aux Épices, Piment Ancho entier 30g](https://lemoulinauxepices.ca/produit/piment-ancho-30g/). Search-indexed Québec title and whole presentation; direct page retrieval returned a cache miss. |
| WP03-L-ANCHO-20261018-R675-S02 (new) | [Gaia Organics, product 144](https://gaiaorganics.ca/product/144/). Direct bilingual seed listing supports Ancho when dried / Poblano when fresh; no seed-product attributes or quantities are generalized. |
| WP03-L-POBLANO-20261015-R136-S08 (reuse) | [Club House for Chefs / McCormick Canada, Ground Ancho Chili Pepper sheet](https://www.clubhouseforchefs.ca/-/media/clubhouse-for-chef/sales-support/english/19-341_mccormick_groundanchochilipepper_ss-en-july0919.pdf). Ground product boundary only; case size is not a pepper measure. |

The two R675 source IDs now identify the new URLs only. The integration reuses the R136 source IDs above rather than duplicating those existing URLs.

## Proposed catalog and ledger delta

Add this form under ingredient-ref-poblano-pepper. whole_dehydrated and dry are existing form values in the live catalog.

~~~json
{
  "id": "ingredient-form-poblano-pepper-whole-dried-ancho",
  "ingredientRefId": "ingredient-ref-poblano-pepper",
  "formCode": "whole_dehydrated",
  "labelFr": "piment ancho entier s\u00e9ch\u00e9",
  "labelEn": "whole dried ancho pepper",
  "prepState": "dry",
  "matchTermsFr": ["piment ancho", "piments anchos"],
  "matchTermsEn": ["ancho", "ancho pepper", "ancho peppers"],
  "densityGPerMl": null,
  "notesFr": "Le piment ancho est la forme s\u00e9ch\u00e9e du poblano. Les sources appuient la pr\u00e9sentation enti\u00e8re, mais aucune mesure r\u00e9utilisable, masse par piment, densit\u00e9, conversion ou substitution.",
  "notesEn": "Ancho is the dried form of Poblano. Sources support the whole presentation, but no reusable measure, per-pepper mass, density, conversion, or substitution.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
~~~

The proposed research-ledger record is keyed by the form ID, with recordType ingredient_form, identityState verified, measurementState researched_no_supported_value, and substitutionResearchState researched_no_supported_substitute. Attach R675-S01/S02 plus the reused R136-S01/S07/S08 source entries. Keep measurementObservations and substitutionFindings empty. The 30 g and 120 g listing values are package sizes, not pepper weights. Do not infer density, unit mapping, count weight, soaking yield, form conversion, or substitution.

Keep ground Ancho outside the proposed form: the Club House sheet explicitly names a ground product, while this review only adds the whole dried presentation. Do not add a separate Ancho identity, parent alias, dried-Poblano alias, species or cultivar, powder state, recipe link, or substitution rule.

## Picker effect

A static projection using the live bilingual phrase-first search rules and the proposed form terms gives:

| Query | Current | With proposal |
|---|---:|---:|
| ancho | 4 substring-only results: anchovy, anchovy fillets in oil, anchovy paste, and myeolchi-jeot | 1 exact form result: Poblano with the whole-dried-Ancho form hint |
| ancho pepper, ancho peppers, piment ancho, piments anchos | 0 | 1 Poblano with the whole-dried-Ancho form hint |
| piments | 2 results | 3 results; remains multi-result |
| piment | 33 results | 33; Poblano is already returned by its base name |
| pepper, peppers | 40 / 14 results | 40 / 14; unchanged |
| dried, whole | 68 / 38 results | 69 / 39; each remains multi-result |

The phrase-first behavior means the exact Ancho form result replaces the four unrelated substring-only ancho results. The bare English match term lets the exact query ancho show the dried-form hint; French remains phrase-qualified. Other form hints appear only for a full proposed label or match term. This is a static search projection, not an app test.
