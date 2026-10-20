# WP02 Section 04 B2/B3 R266 — potato flour/starch processing boundary

- **Reviewed:** 2026-10-16.
- **Status:** Integrated by root on 2026-10-16. See the [R266 integration README](../batches/wp02-section-04-b3-pregelatinized-potato-starch-integration-r266-20261016/README.md).
- **Scope:** The potato-derived flour/starch part of the open Section 04 B3 item, “Preserve whole-root flour versus extracted starch and raw versus pregelatinized/precooked product distinctions.” This is a bounded review of potato products, not a completion claim for B2/B3 or the full pregelatinized-starch family.
- **Current package snapshot:** 1,655 ingredient references, 125 forms, 114 manifest-listed recipes, and 1,123 ingredient rows.
- **Source-ID prefix:** `WP02-B3-PREGELATINIZED-POTATO-R266-20261016`; it had no collision during proposal review. Integration registered S01, S05, and S06; S02–S04 reuse existing ledger source IDs listed in the batch README.

## Decision

**Add one source-qualified, identity-only reference for pregelatinized potato starch.** Ingredion’s current North American technical specification identifies NOVATION 6600 as a “pregelatinized potato-based starch,” labels it “Potato Starch” for Canada, and distinguishes the product’s cold-prepared-food function from its package presentation. This gives the exact botanical source and processing state that the existing source-neutral “native/pregelatinized starch” decision requires before catalog allocation. [S01, S04]

Use `pregelatinized potato starch / fécule de pomme de terre prégélatinisée`. Keep the French display provisional: OQLF supplies the preferred potato-starch and pregelatinized-starch terminology separately, but this review found no Québec package with the complete product phrase. Add the OQLF-supported alternate construction `amidon de pomme de terre prégélatinisé` as a French search alias. [S02–S03]

The addition is a distinct identity-only product class, not a form of ordinary potato starch and not a `modified potato starch` alias. Ingredion describes the example as a functional native starch that is pregelatinized; the Canadian label name remains “Potato Starch.” CFIA’s common-name table separately specifies source-qualified names for starch and modified starch, but does not define pregelatinization as its own regulatory class. The proposed identity records the product/process distinction found in the source; it does not claim a new legal common name. [S01, S04]

| Candidate or term | Decision | Reason |
|---|---|---|
| `pregelatinized potato starch` | Add as a separate `FLOUR_AND_STARCH` identity. | A current manufacturer technical specification identifies a potato-source, pregelatinized product; a Canadian retailer has a product listing, although it is currently sold out. [S01, S05] |
| `pre-gelatinized potato starch`, `pregelatinised potato starch` | Add as English spelling aliases. | OQLF lists these generic spelling variants for pregelatinized starch; they preserve the potato-qualified display. [S02] |
| `pregelatinized potato-based starch` | Add as an English alias. | This is the exact source wording on the Ingredion specification. [S01] |
| `amidon de pomme de terre prégélatinisé` | Add as a French search alias; keep its use provisional pending Québec product-label review. | It combines OQLF’s accepted potato-starch term with the preferred pregelatinized-starch term. OQLF lists `amidon de pomme de terre` alongside its preferred `fécule de pomme de terre`, and notes the former is common in use. [S02–S03] |
| `instant potato starch`, `cold-water-soluble potato starch`, `cold-water-swelling potato starch`, `precooked potato starch`, `instant starch`, and `precooked starch` | Do not add as aliases. | OQLF lists generic English translations for pregelatinized starch, but those terms do not establish potato-specific product identity or synonymy for the Ingredion product. [S02] |
| `functional native starch`, `native starch`, `NOVATION 6600` | Do not add as aliases. | The first two are a general technology/process description and a source-neutral term; the last is a brand/product name. None is a generic potato-starch name. [S01] |
| `modified potato starch` | Keep on its existing row; do not merge. | The manufacturer calls NOVATION 6600 a functional native starch and says it has properties similar to modified starches; similarity is not identity. The modified row remains a separate plant-qualified class. [S01, S04] |
| `raw unmodified potato starch` | Keep on its existing row; do not merge. | The R124 row is explicitly source/process-qualified and is separate from this heat-treated commercial product. [S08] |
| `potato flour`, `potato starch flour`, `pregelatinized potato flour`, `instant potato flour`, `pregelatinized potato powder` | Do not add as aliases to either starch row. Keep the whole-potato pregelatinized-flour candidate held. | Whole-potato flour is a separate material from extracted potato starch. The supplier page describes its pregelatinized product as extruded, cooked whole-potato flour retaining fibre and protein; it is not evidence for the Ingredion starch identity or for a Canadian/Québec flour product. [S06–S07] |

## Integrated reference delta

If accepted, add only this identity row to `ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-pregelatinized-potato-starch",
  "nameEn": "pregelatinized potato starch",
  "nameFr": "fécule de pomme de terre prégélatinisée",
  "aliasesEn": [
    "pre-gelatinized potato starch",
    "pregelatinised potato starch",
    "pregelatinized potato-based starch"
  ],
  "aliasesFr": [
    "amidon de pomme de terre prégélatinisé"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The integration adds no `IngredientForm`, recipe link, package yield, density, unit mapping, global conversion, or active substitution rule. It adds one `ingredient_reference` ledger record for `ingredient-ref-pregelatinized-potato-starch` with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Measurement observations and substitution findings are empty. S01–S06 support identity and terminology; the ledger reuses existing entries for S02–S04 as recorded in the batch README. S07 remains proposal-local because it concerns the separate, held whole-potato-flour product.

## Current-state ownership and picker projection

At proposal review before integration, current references included ordinary potato flour, ordinary potato starch, modified potato starch, and raw unmodified potato starch as separate rows. The existing potato-starch row had `defaultDensity: null` and no unit mappings, and no forms were attached to the potato flour or potato starch rows. The ledger then had no potato-specific pregelatinized-starch record, and exact scans found no current reference/form, legacy-import, or research-ledger owner for the candidate identity or proposed aliases. Integration adds the reviewed reference and record while preserving the neighboring rows and earlier R96/R124 decisions. [pre-integration seed package; R96; R124]

The projection follows `IngredientSearch.kt`: it normalizes accents and punctuation, prefers complete word phrases, then falls back to substrings. The result table uses the proposed row above with the current reference/form package. A broad query may return several qualified starch products; the qualified proposed name remains a unique result.

| Query | Current result | With proposal |
|---|---|---|
| `pregelatinized potato starch` | None | `ingredient-ref-pregelatinized-potato-starch` |
| `pre-gelatinized potato starch` | None | `ingredient-ref-pregelatinized-potato-starch` |
| `pregelatinised potato starch` | None | `ingredient-ref-pregelatinized-potato-starch` |
| `pregelatinized potato-based starch` | None | `ingredient-ref-pregelatinized-potato-starch` |
| `fécule de pomme de terre prégélatinisée` | None | `ingredient-ref-pregelatinized-potato-starch` |
| `amidon de pomme de terre prégélatinisé` | None | `ingredient-ref-pregelatinized-potato-starch` |
| `potato starch` | Modified potato starch; potato starch; raw unmodified potato starch; sweet-potato starch; sweet-potato-starch noodles | Those five plus `ingredient-ref-pregelatinized-potato-starch` |
| `fécule de pomme de terre` | Modified potato starch; potato starch | Those two plus `ingredient-ref-pregelatinized-potato-starch` |
| `amidon de pomme de terre` | Modified potato starch; potato starch | Those two plus `ingredient-ref-pregelatinized-potato-starch` |
| `amidon prégélatinisé` / `pregelatinized starch` | None | None; the source-neutral phrase stays unassigned |
| `instant potato starch` / `precooked potato starch` | None | None; neither is added as a source-specific alias |
| `potato flour` | Potato flour; sweet-potato flour | Unchanged |
| `pregelatinized potato flour` / `instant potato flour` | None | None; the whole-potato-flour candidate remains held |

## Recipe demand, quantities, and substitutions

The package manifest lists 114 recipes and 1,123 ingredient rows. A normalized scan of every manifest-listed recipe JSON and ingredient row found no match for `pregelatinized potato starch`, its reviewed spelling variants, the proposed French phrases, `instant potato starch`, `precooked potato starch`, or the adjacent pregelatinized-potato-flour phrases. No bundled ingredient row links to the existing potato flour, potato starch, modified potato starch, or raw unmodified potato starch identities. The new row therefore gets no recipe link or recipe-derived alias.

- **Density and measures:** Ingredion’s specification describes a coarse powder and a 55 lb bag, but gives no bulk/tapped density or household measure. The Canadian retailer lists a 25 kg SKU marked sold out. Treat both weights as product/package observations only; neither supplies a cup/spoon conversion. Keep the active density null and mappings empty. [S01, S05]
- **Whole-potato flour evidence:** A separate supplier’s pregelatinized whole-potato-flour page reports a typical bulk-density range of 0.5–0.7 g/mL and says the product retains potato fibre and protein. Those are that supplier’s pregelatinized flour specifications, not measurements for potato starch or the generic Canadian potato-flour row. No active density, measure, ledger observation, form, alias, or row is proposed for that candidate. [S07]
- **Substitutions:** Ingredion describes NOVATION 6600 as a binder/texturizer and as having some properties similar to modified starches; it supplies no home-cooking replacement ratio. The existing potato-starch ledger includes a qualitative potato-starch-to-cornstarch option for mochi surface dusting/rolling only, which is source- and context-specific and does not cover this pregelatinized product. The whole-potato-flour ledger’s historical 1 cup = 160 g observation and its bread findings also do not transfer. Add no new measurement observation, substitution finding, or rule. [S01, S08]

## Evidence gaps and reconsideration triggers

- No current Québec consumer package or Québec terminology decision was found for the complete pregelatinized-potato-starch name. The proposed French display and alias are transparent constructions from OQLF’s terminology and remain provisional.
- The Canadian retailer’s NOVATION 6600 product page was marked sold out when checked. Ingredion’s primary specification remains direct product evidence, but current local stock and retail-package access are unconfirmed.
- The available source is a specific commercial grade. Its particle size, viscosity, moisture limit, bag size, and product behavior do not define every pregelatinized potato starch.
- The whole-potato `pregelatinized potato flour` example came from an external supplier source, not a verified Canadian/Québec pantry product. Reopen it only after a current Canadian product and a product-matched Québec French display establish scope; determine whether it is a form of the active potato-flour row or a separately useful identity before modeling it.
- Do not treat generic `instant`, `precooked`, `cold-water-soluble`, `native`, or `pregelatinized` alone as a potato alias. Reopen those names only with exact source- and botanical-qualified evidence.

## Verification queries

The following source searches were run on 2026-10-16; they are recorded so the bounded review can be repeated:

- `pregelatinized potato starch Canada`
- `pre-gelatinized potato starch Canada`
- `site:ingredion.com pregelatinized potato starch NOVATION 6600`
- `site:inspection.canada.ca potato starch modified starch common names`
- `site:vitrinelinguistique.oqlf.gouv.qc.ca amidon prégélatinisé`
- `"amidon de pomme de terre prégélatinisé" Québec`
- `"fécule de pomme de terre prégélatinisée" Québec`
- `"pregelatinized potato flour" Canada`
- `"farine de pomme de terre prégélatinisée" Québec`

The focused local scans covered current ingredient reference/form terms, the 61 legacy-import candidates, ledger record text/IDs, every manifest-listed recipe and ingredient row, package-yield data, and active global/contextual substitution files. They found no exact owner or recipe demand for the candidate. The source-neutral native/pregelatinized ledger decision remains intact; this proposal adds only the potato-qualified product backed by S01.

## Source register

Integration reused the existing ledger entries for S02–S04 (OQLF pregelatinized starch, OQLF potato starch, and CFIA common names); new source IDs were registered for S01, S05, and S06. The integration README records the exact ID mapping.

All web sources below were accessed on **2026-10-16**. The S01–S06 labels are proposal-local labels; their ledger-ID mapping is documented in the integration README.

| Source ID | Source and locator | What it supports and its limit |
|---|---|---|
| `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S01` | Ingredion, [NOVATION 6600 technical specification](https://www.ingredion.com/content/dam/ingredion/technical-documents/na/NOVATION%206600%20-%2034281400%20Technical%20Specification.pdf), effective 2024-10-25, next review 2027-10-25; pp. 1, product description, packaging, regulatory data, and features. | Primary manufacturer source: says “pregelatinized potato-based starch,” calls it functional native starch, identifies Potato as source, specifies `Potato Starch` as Canada food-label wording, and gives 55 lb multi-ply bags. It has no cup/spoon measure or bulk-density field and does not establish every grade’s behavior. |
| `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S02` | Office québécois de la langue française, [*amidon prégélatinisé* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357585/amidon-pregelatinise), last updated 2004. | Québec terminology and process definition; prefers `amidon prégélatinisé`, lists `amidon gélatinisé`, and gives general English translations including spelling variants, `instant starch`, and `precooked starch`. It is generic to starch and does not supply a potato-specific product label. |
| `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S03` | Office québécois de la langue française, [*fécule de pomme de terre* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre), last updated 2004. | Québec potato-starch terminology; lists `fécule de pomme de terre`, its plural variant, and `amidon de pomme de terre` / plural as preferred terms. It also includes broad English cross-references to `potato flour` and `potato starch`; those cross-references do not merge the project’s distinct whole-potato-flour and extracted-starch identities. |
| `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S04` | Canadian Food Inspection Agency, [*Common Names for Ingredients and Components*](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/common-names-ingredients-and-components), last amended 2026-02-11, Table 1, items 20–21. | Current Canadian source naming: starch uses plant name plus `starch`; modified starch uses `modified` plus plant name plus `starch`. It does not define pregelatinization as a separate mandatory common name. |
| `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S05` | Prime Restaurant Supply Wholesale, [*NOVATION 6600 Potato Starch, 25 kg bag*](https://www.restaurantsupplywholesale.ca/products/novation-6600-potato-starch-25-kg-bag), checked 2026-10-16. | Canadian retail/foodservice listing connects NOVATION 6600 to a 25 kg potato-starch SKU and repeats the pregelatinized description. The listing showed **sold out**, so it does not establish current stock. |
| `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S06` | Food and Agriculture Organization of the United Nations, [*Potatoes in the human diet*](https://www.fao.org/4/i0500e/i0500e02.pdf), section on potato processing and food products. | Describes potato flour as ground from cooked whole potatoes, retaining potato taste, and distinguishes potato starch as a separately retrieved starch product. This is a product-boundary source, not a measurement or Québec-name source. |
| `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S07` | Junsheng Agriculture, [*Pregelatinized Potato Flour for Instant Food Processing*](https://hbjsnykj.com/products/pregelatinized-potato-powder/), checked 2026-10-16, product identity/process and typical values. | Supplier describes an extruded, cooked, whole-potato flour retaining fibre/protein and reports a 0.5–0.7 g/mL typical bulk-density range. It is separate from extracted starch; this supplier page is not current Canadian/Québec consumer-product evidence and the density is not reusable catalog data. |
| `WP02-B3-PREGELATINIZED-POTATO-R266-20261016-S08` | Project history: [R96 modified potato-starch review](wp02-b3-r96-modified-potato-starch-review-20261014.md), [R124 raw unmodified potato-starch review](wp02-b3-r124-raw-unmodified-potato-starch-identity-review-20261015.md), and [R187 pregelatinized wheat-starch review](wp02-b3-pregelatinized-wheat-starch-identity-review-r187-20261016.md). | Defines the active neighboring rows and prior source-qualified process decisions; internal history, not external product evidence. |
