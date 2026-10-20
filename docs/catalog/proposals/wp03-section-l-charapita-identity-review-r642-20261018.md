# WP03 Section L R642 — Charapita identity and fresh-form review — 2026-10-18

- **Status:** Accepted and integrated on 2026-10-18 with provisional Québec French naming and one fresh form.
- **Recommendation:** Add one source-named `ají charapita pepper / piment Charapita` identity and one `fresh` form. Keep both display names provisional, add only the source-attested English phrase `charapita chili`, and leave species, cultivar, fixed heat, measurements, and other product forms unresolved.
- **Scope:** This advances one distinct candidate under Section L’s open Latin American and regional chile review. It does not close that review or the separate dried-chile, chile-powder, or fresh-versus-processed product-boundary checklists.

## Why this is a distinct open item

The [active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6212) leaves regional chile identity review open beyond ají amarillo, ají panca, and rocoto. R639 integrated ají limo as a different Peruvian culinary grouping; this review concerns the separately profiled Charapita item. It does not reopen R629’s jalapeño, R632’s Serrano, R636’s Scotch Bonnet, or R639’s ají limo decisions. The [roadmap](../../../roadmap.md#L62) confirms that Section L remains open after R639.

Requirements [FR-7](../../../Requirements.md#L375) calls for ingredient references searchable in both languages. The proposed names use the Peruvian source name and Québec-facing product wording while keeping the weakly bounded botanical and trade-name details out of global matches.

## Current ownership and identifier audit

The read-only R642 snapshot contained **1,830 active references**, **160 forms**, **56 legacy candidates**, **2,201 research-ledger records / 10,273 source entries**, and **114 manifest-listed recipes / 1,123 ingredient rows**.

| Surface | Finding | Proposed treatment |
|---|---|---|
| Active references | No normalized exact owner for `charapita`, `charapita chili`, `ají charapita`, `ají charapita pepper`, or `piment Charapita`. Nearby active identities include `ingredient-ref-aji-amarillo-pepper`, `ingredient-ref-aji-dulce-pepper`, `ingredient-ref-aji-panca-pepper`, `ingredient-ref-aji-limo-pepper`, and `ingredient-ref-rocoto-pepper`; none is an alias owner for Charapita. | Add one `VEGETABLE_AND_AROMATIC` identity: `ingredient-ref-aji-charapita-pepper`. |
| Forms | No current form or match term owns a Charapita phrase. | Add only `ingredient-form-aji-charapita-pepper-fresh` under the new identity. |
| Legacy archive | No Charapita name, alias, or candidate ID exists in the 56-row archive. The legacy generic `ingredient-ref-chili-pepper` does not own a Charapita-specific phrase. | Do not promote or alter a legacy candidate. |
| Research ledger | No dedicated Charapita record exists. The only current mention is within the rocoto record’s source-bound distinction among Peruvian peppers; it is not a Charapita owner. | Add one identity record only if the proposal is accepted; keep the rocoto record unchanged. |
| IDs and source IDs | The proposed reference and form IDs are absent from active references/forms, the legacy archive, and ledger records. Before this proposal was created, source IDs `WP03-L-CHARAPITA-20261018-R642-S01` through `S04` had no owner in proposal/batch documents or the ledger. | Reserve these identifiers for a bounded integration if accepted. |

The identity remains separate from ají amarillo, ají panca, ají limo, ají dulce, rocoto, pimenta-de-cheiro, and generic chili, chile, pepper, or piment rows. Do not use `Charapita Amarillo`, `ají charapilla`, color words, `Amazonian pepper`, a botanical species, or broad pepper terms as aliases. Do not map Charapita to a similar Capsicum species or to a different regional pepper based on shared species labels.

## Evidence and Québec naming

PROMPERÚ’s English-language product profile gives Charapita its own entry as `Charapita chili`, calls it a Peruvian Amazon product, and says it is consumed ground and dried, pickled, or fresh. It also describes high diversity. This supports a source-named culinary identity and a fresh state, but it is an export profile rather than a universal taxonomy, Canadian retail standard, or alias authority. [S01]

Peru’s INIA catalogue separately lists several accessions as `Ají charapita` and records fresh-fruit characteristics and culinary use. Its listed accessions are classified as *Capsicum chinense*, while PROMPERÚ assigns *C. frutescens*. INIA’s native-chile catalogue also names `Ají charapita amarillo` as *C. frutescens*. These source-level differences mean the catalog should preserve the culinary name without asserting species, cultivar, color, heat, or a single accession. Accession-specific fruit weights are not reusable per-pepper measures. [S02, S03]

Québec seed seller Semences Solana uses the French product heading `Piment Charapita` and says its offered seeds produce fruit that ripens in Québec. This is direct local product wording, but it is a seed listing rather than evidence of a Québec fresh-produce SKU or an official terminology ruling. A targeted OQLF search did not surface a Charapita entry. Therefore `piment Charapita` is a provisional fr-CA display grounded in Québec usage; it is not presented as OQLF-preferred terminology. [S04]

Use `ají charapita pepper` as the English display, retaining the Peruvian ingredient name, and `piment Charapita` as a provisional Québec French display. Add `charapita chili` as the one English alias used in PROMPERÚ’s profile. Keep French aliases empty. The bilingual fresh labels express a state already documented by Peruvian sources; they do not claim local retail availability.

## Recipe demand

The manifest-ordered scan covered every string field in all 114 bundled recipe files and all 1,123 ingredient rows. There were no exact normalized hits for `charapita`, `ají charapita`, `ají charapita pepper`, `charapita chili`, `piment Charapita`, `fresh ají charapita pepper`, or the nearby variants `ají charapita amarillo` and `charapilla`. No recipe line, amount, form link, measurement, density, conversion, yield, or substitution is proposed.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accent and punctuation normalization, whole-phrase matches before substring fallback, and form labels searched through their owning reference. Counts below are reference results using the current 1,830-reference / 160-form snapshot and the exact proposed names and alias.

| Query | Before | After | Effect |
|---|---:|---:|---|
| `charapita` | 0 | 1 | Finds the new identity through both display names. |
| `ají charapita` / `aji charapita` | 0 | 1 | Finds the full native-name phrase in the English display; accent folding makes both spellings equivalent. |
| `charapita chili` | 0 | 1 | Finds the exact PROMPERÚ English phrase through the sole alias. |
| `piment Charapita` | 0 | 1 | Finds the provisional fr-CA display. |
| `fresh ají charapita pepper` / `piment Charapita frais` | 0 | 1 | Finds the identity and exposes the single fresh-form hint. |
| `ají` | 4 | 5 | Adds one result to the existing multi-result Peruvian chile family search. |
| `piment` / `pepper` / `chili` | 29 / 36 / 11 | 30 / 37 / 12 | Each broad singular query gains one result and remains multi-result. |
| `piments` / `chile` | 0 / 1 | 0 / 1 | No plural French or Spanish `chile` alias is introduced. |

Do not add `piments Charapita`, `piments forts`, `hot pepper`, or generic `piment`, `pepper`, `chile`, `chili`, or `ají` aliases. The sole alias is the named product phrase in a primary source; broad searches already receive the new result through the bilingual display names where their words occur.

## Exact proposed JSON delta

### Add to `ingredient-references.v1.json`

```json
{
  "id": "ingredient-ref-aji-charapita-pepper",
  "nameFr": "piment Charapita",
  "nameEn": "aj\u00ed charapita pepper",
  "aliasesFr": [],
  "aliasesEn": ["charapita chili"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

### Add to `ingredient-forms.v1.json`

```json
{
  "id": "ingredient-form-aji-charapita-pepper-fresh",
  "ingredientRefId": "ingredient-ref-aji-charapita-pepper",
  "formCode": "fresh",
  "labelFr": "piment Charapita frais",
  "labelEn": "fresh aj\u00ed charapita pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Les sources p\u00e9ruviennes documentent l\u2019usage frais; aucune mesure g\u00e9n\u00e9rique ni densit\u00e9 n\u2019est \u00e9tablie.",
  "notesEn": "Peruvian sources document fresh use; no generic measure or density is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

Do not add other forms, fixed heat, species or cultivar fields, numeric behavior, recipe links, substitutions, or source-specific per-fruit weights. Keep measurement and substitution research open; the INIA accession measurements cannot be generalized to Charapita as a whole.

## Source register — checked 2026-10-18

| Source ID | Primary source and locator | Supports and limits |
|---|---|---|
| `WP03-L-CHARAPITA-20261018-R642-S01` | PROMPERÚ, [*Peppers, rocoto peppers and chilies: Peruvian Capsicum*](https://repositorio.promperu.gob.pe/bitstreams/b071160c-de48-44a7-a3cb-79828d98a184/download), 2016, printed p. 32, “Charapita chili.” | Separate named entry, source English wording, fresh and other presentations, and high diversity. Does not establish a universal species, cultivar, Canadian retail product, or interchangeable alias set. |
| `WP03-L-CHARAPITA-20261018-R642-S02` | Instituto Nacional de Innovación Agraria (INIA), [*Catálogo de ajíes (Capsicum spp.)*](https://repositorio.inia.gob.pe/bitstream/20.500.12955/88/3/Libreros-Catalogos_de_ajies.pdf), Charapita accessions including PER006952 and PER017711. | Uses `Ají charapita`, records fresh-fruit characteristics and culinary uses, and classifies the cited accessions as *C. chinense*. Accession-level germplasm data; not a universal taxonomy or reusable measure for every Charapita product. |
| `WP03-L-CHARAPITA-20261018-R642-S03` | INIA, [*Ajíes nativos peruanos*](https://repositorio.inia.gob.pe/bitstreams/006b5660-0020-4134-a262-5062fb361f3f/download), printed pp. 120–121, “Ají Charapita Amarillo,” accession 26-Pucallpa. | Names a Charapita selection and identifies that accession as *C. frutescens*. This differs from the *C. chinense* accessions in S02 and supports leaving species unassigned; its accession-specific measurements are not generalized. |
| `WP03-L-CHARAPITA-20261018-R642-S04` | Semences Solana, [Piments forts et décoratifs](https://www.solanacom.com/piments.html), `Piment Charapita` listing. | Direct Québec seed-product wording and local cultivation description. The listing is not a produce-market offer, official terminology decision, universal species/heat statement, or household-measure source. |

Root review confirmed PROMPERÚ's source-named profile and fresh presentation, the INIA accession-level species disagreement, and Semences Solana's local French seed-product heading. The bounded identity, fresh form, and ledger evidence are integrated. Static package, generated-index, ledger-schema, picker-projection, ownership, recipe-corpus, encoding, link, and whitespace checks passed. No software tests, build, emulator run, or deployment were run because this only adds database JSON data under `AGENTS.md`.
