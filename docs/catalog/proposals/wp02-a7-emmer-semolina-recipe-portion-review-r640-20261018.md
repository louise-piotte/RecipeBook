# WP02 Section A7 emmer-semolina recipe portion review — R640 — 2026-10-18

## Review record

- **Reviewed:** 2026-10-18.
- **Status:** Accepted and integrated on 2026-10-18. The existing emmer-semolina ledger row now records one source-bounded manufacturer-recipe portion; active catalog data is unchanged.
- **Plan anchor:** WP02 Section A7 remains open for other grain meals and milling products in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2094). R638 has since recorded a separate barley-grits product-label portion; this review selects the distinct existing emmer-semolina identity.
- **Scope:** Add one manufacturer-recipe portion to the existing `ingredient-ref-emmer-semolina` ledger row. Do not reopen its identity, French display, or substitutions.
- **Avoided prior batches:** R605 toasted wheat meal; R624 wheat germ; R628 wheat bran; R631 Scottish oatmeal; R635 durum semolina; and R638 barley grits. R639 is allocated to a separate WP03 proposal in the shared archive; this A7 review uses the next unallocated ID, R640.

## Recommendation

Update only the existing `ingredient-ref-emmer-semolina` research-ledger record:

- Set `measurementState` from `researched_no_supported_value` to `researched_supported` and append one product-specific `portion_weight` observation from Anson Mills' *Gnocchi alla Romana* recipe: **1½ cups (8 ounces)** Anson Mills Ancient Emmer Semolina.
- Add one source record for the live Anson Mills recipe page. Reuse the existing Anson Mills product-page source `WP02-A7-EMMER-SEMOLINA-R440-20261017-S03` for product-identity context.
- Keep `substitutionResearchState: not_yet_researched`, `defaultDensity: null`, and `unitMappings: []`. Add no form, alias, active conversion, yield, or recipe link.

**Active numeric behavior supported:** none. This is one publisher-reported amount for one named product in one formula. The recipe does not state the cup convention or fill method. Do not convert the reported ounces to grams or treat the pair as a reusable emmer-semolina mapping.

## Evidence and limits

| Source | Evidence | Limits |
|---|---|---|
| [Anson Mills, Gnocchi alla Romana](https://ansonmills.com/recipes/589) (new S01) | The manufacturer recipe names its own Ancient Emmer Semolina and lists **1½ cups (8 ounces)** in the ingredient list. | This is one formula amount, not a label serving or direct weighing. The page does not state cup capacity or a filling method. The reported ounce quantity is retained exactly; no conversion to grams is proposed. |
| [Anson Mills, Ancient Emmer Semolina](https://ansonmills.com/products/98) (existing S03) | The manufacturer product page identifies a standalone Ancient Emmer Semolina product and describes its milling process as several cold stone-mill passes and hand bolting, yielding even-sized fine emmer semolina. | These process details are product-specific. The page provides no package serving size or transferable measure. |

The recipe is a current primary manufacturer source and directly identifies the same named product as the existing S03 product page. Its paired quantity is useful as a ledger observation while remaining bounded to the *Gnocchi alla Romana* formula. It does not establish the amount for other emmer-semolina products or a general household measure.

## Ownership, Québec terminology, picker, and recipe-demand audit

| Surface | Current state | R640 disposition |
|---|---|---|
| Active identity | `ingredient-ref-emmer-semolina`, `emmer semolina / semoule de blé amidonnier`, category `FLOUR_AND_STARCH`; alias lists empty; density null; mappings empty. | Preserve identity, display names, aliases, category, and numeric catalog fields. The exact English and French displays are already owned by this row. |
| Québec terminology | R440 established `semoule de blé amidonnier` using the bilingual DND food-quality wording and OQLF's `amidonnier` species term. OQLF's page lists `emmer` / `emmer wheat` and also accepts the broader term `farro`. | Make no French-name or alias change. Keep the emmer-specific display and do not add `farro` or transfer the emmer term to another semolina identity. |
| Source and ID ownership | The existing product page URL and source ID S03 are already attached to this row. The recipe URL, R640 source ID, and proposed observation ID below are unowned in the active ledger. | Reuse S03 for product context; add only the recipe source and one observation. Do not create a reference or duplicate product identity. |
| Forms, rules, and yields | No emmer-semolina form, global or contextual substitution rule, or package-yield record is attached to the identity. | Add none. Keep substitution research unreviewed. |
| Picker effect | The existing English and French names remain unchanged, and the proposed value is ledger-only. | No picker result or active numeric behavior changes. |
| Bundled recipe demand | Parsed the 114 current manifest-listed recipe files and 1,123 structured ingredient rows. No target reference ID, emmer-semolina phrase, `semoule de blé amidonnier`, or other emmer-semolina ingredient match was found. | The external Anson Mills formula is evidence only; no bundled recipe link or edit is proposed. |

The proposal path `wp02-a7-emmer-semolina-recipe-portion-review-r640-20261018.md`, source ID `WP02-A7-EMMER-SEMOLINA-MEASURE-R640-20261018-S01`, and observation ID `emmer-semolina-anson-mills-gnocchi-alla-romana-1-5-cups-8-oz-r640-20261018` were absent before this proposal.

## Exact proposed ledger delta

Merge the following into the existing ledger record whose `recordId` is `ingredient-ref-emmer-semolina`. Retain all other record fields and source entries.

1. Set `measurementState` to `researched_supported`.
2. Append this source:

```json
{
  "sourceId": "WP02-A7-EMMER-SEMOLINA-MEASURE-R640-20261018-S01",
  "url": "https://ansonmills.com/recipes/589",
  "title": "Anson Mills, Gnocchi alla Romana",
  "accessedOn": "2026-10-18",
  "locator": "Gnocchi ingredient list; the semolina amount and linked Anson Mills Ancient Emmer Semolina product name.",
  "supports": "The manufacturer recipe names Anson Mills Ancient Emmer Semolina and lists 1½ cups (8 ounces) for one Gnocchi alla Romana formula. The recipe gives no cup convention or filling method. This is a formula-specific published quantity, not a package serving, direct weighing, or general emmer-semolina measure.",
  "sourceKind": "test_kitchen"
}
```

3. Append this one observation. Preserve the source's ounce amount without converting it to grams.

```json
{
  "observationId": "emmer-semolina-anson-mills-gnocchi-alla-romana-1-5-cups-8-oz-r640-20261018",
  "relationship": "portion_weight",
  "value": 8,
  "valueUnit": "oz",
  "foodDescription": "Anson Mills Ancient Emmer Semolina, the dry ingredient listed for Gnocchi alla Romana.",
  "foodState": "Dry semolina as listed before cooking; not the hydrated gnocchi mixture.",
  "measurementMethod": "The manufacturer recipe reports 1½ cups (8 ounces). It does not describe a cup capacity, fill method, or independent weighing procedure.",
  "quantityBasis": "One Anson Mills formula amount only. Preserve the published cup and ounce pair; do not infer a general cup weight, density, conversion, or value for other emmer-semolina products.",
  "sourceQuantity": {
    "amount": 1.5,
    "unit": "cup",
    "unitConvention": "The recipe states 1½ cups; cup capacity and filling method are unspecified."
  },
  "evidenceKind": "published_portion",
  "sourceIds": [
    "WP02-A7-EMMER-SEMOLINA-MEASURE-R640-20261018-S01"
  ]
}
```

4. Append this decision and keep `substitutionResearchState: not_yet_researched`:

```json
{
  "outcome": "accepted",
  "reason": "Record one published portion from Anson Mills' Gnocchi alla Romana recipe: 1½ cups (8 ounces) of its Ancient Emmer Semolina. This is a single manufacturer-formula amount, not a package serving, direct weighing, or transferable household measure. Retain the source quantities without converting to grams. Keep defaultDensity null, unitMappings empty, substitution research not yet researched, and active names, picker results, forms, conversions, yields, recipe links, and runtime behavior unchanged.",
  "sourceIds": [
    "WP02-A7-EMMER-SEMOLINA-R440-20261017-S03",
    "WP02-A7-EMMER-SEMOLINA-MEASURE-R640-20261018-S01"
  ]
}
```

## Static review checks

- Read `AGENTS.md`, relevant `Requirements.md` conversion rules, the current roadmap and A7 checklist, active reference, forms, substitution rules, package yields, ledger row and schema, and prior A7 proposals including R440 and R638.
- Verified current manufacturer pages for Anson Mills Ancient Emmer Semolina and its *Gnocchi alla Romana* recipe. The recipe page directly lists 1½ cups (8 ounces) for the named product; no mass conversion is proposed.
- Rechecked the Québec terminology context against OQLF's [amidonnier entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10487378/amidonnier) and the accepted R440 bilingual terminology decision. No name or alias update is proposed.
- Audited source-ID and URL ownership. The existing Anson product page/S03 is already attached to the target row; the recipe URL and R640 source/observation IDs are unowned. Confirmed the R640 proposal path was unused.
- Checked the active display and alias ownership, forms, global and contextual rules, package yields, and the bundled recipe corpus. All 114 manifest files and 1,123 ingredient rows parsed; no emmer-semolina demand was found.
- Checked the source, observation, and decision objects against `docs/catalog/research-ledger.schema.json`. The ledger portion is source-published, is not converted to grams, and does not activate a catalog measure.
- Root review reopened the current manufacturer recipe and product pages and confirmed the linked ingredient and published amount. The ledger update passed static schema and ownership validation; no app tests, builds, emulator checks, or software tests were run because this was a database-JSON-only change under `AGENTS.md`.
