# WP03 Section L R639 — Ají limo identity and fresh-form review — 2026-10-18

- **Status:** Accepted and integrated 2026-10-18. The identity reference, fresh form, research-ledger record, generated picker projection, plan, roadmap, and workflow log are updated; no recipe or app logic changed.
- **Recommendation:** Add one source-named `ají limo` pepper reference and one fresh-market form. Keep the name as a Peruvian culinary grouping rather than a species or cultivar. Do not add synonyms beyond the narrowly sourced English phrase, and do not model frozen, canned, dried, ground, powdered, or sauce products in this proposal.
- **Scope:** This advances one item under Section L’s open regional-chile review. It does not close the regional, dried-chile, chile-powder, or fresh-versus-processed chile checklists.

## Why this is a distinct open item

The active [WP03 Section L plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6212) records the integrated rocoto identity and leaves open the review of Latin American and regional chile identities beyond ají amarillo, ají panca, and rocoto. The adjacent plan lines also leave dried chiles and fresh/dried/smoked/purée/seasoning/sauce boundaries open. The [roadmap](../../../roadmap.md) confirms Section L remains open after R636.

The prior [WP06 Andean review](wp06-andean-peppers-review-20261009.md) and [resolution](wp06-andean-peppers-resolution-20261009.md) explicitly kept ají limo out of ají panca and other rows’ aliases. The [integration README](../batches/wp06-andean-peppers-identity-20261009/README.md) records that this was a boundary decision, not an active ají-limo identity. R629, R632, and R636 cover jalapeño, Serrano, and Scotch Bonnet state/name decisions; none models a Peruvian ají-limo identity. This proposal does not reopen those rows.

Requirements [FR-7](../../../Requirements.md#L375) calls for searchable ingredient references with bilingual names and aliases. The proposal provides a bounded bilingual row for a locally documented Peruvian ingredient name and leaves ambiguous regional terms out of its aliases.

## Current ownership and identifier audit

The pre-integration read-only snapshot had **1,829 active references**, **159 forms**, **56 legacy candidates**, **2,200 research-ledger records**, and **114 manifest-listed recipes / 1,123 ingredient rows**.

| Surface | Finding | Proposed treatment |
|---|---|---|
| Active references | No exact owner for `ají limo`, `limo chili`, `ají limo pepper`, or `piment ají limo`. The existing ají amarillo, ají dulce, ají panca, rocoto, and generic pepper rows remain separate. | Add one `VEGETABLE_AND_AROMATIC` identity, `ingredient-ref-aji-limo-pepper`. |
| Forms | Before integration, no active form owned `fresh ají limo pepper` or `piment ají limo frais`; the form ID was unused. | Added one `fresh` form under the new reference. |
| Legacy archive | No exact Ají Limo candidate or related candidate ID is present in the 56-row archive. | Do not promote or alter a legacy candidate. |
| Research ledger | The existing ají panca and amarillo records contain the old SENASA export-roster discussion that groups ají limo with other names. No dedicated Ají Limo identity record exists. The roster is trade-scope evidence, not a culinary synonym standard. | Create one identity record only if accepted. Preserve existing panca/amarillo ledger records and decisions. |
| Source IDs | Before integration, `WP03-L-AJI-LIMO-20261018-R639-S01` through `S06`, the reference ID, and the form ID had no owner in the active references/forms, legacy archive, ledger, proposals, or integration batches. | The six sources are now registered on the new Ají Limo ledger record; the reference and form IDs are active. |

Before integration, the term boundary was deliberately narrow. PROMPERÚ lists `paringo`, `miscucho`, `bola`, and `picante` as source common names for its Ají Limo profile, but those are not added as global aliases: the profile describes exceptionally high diversity, and those short names are not sufficiently scoped for Québec recipe search. Do not alias `ají limón` / `lemon drop` to Ají Limo; the Québec seed supplier distinguishes its Aji Limo and Aji Limon products. Do not add `ají panca`, `ají dulce`, `ají habanero`, `piment antillais`, `pepper`, `piment fort`, or broad `chile` / `chili` terms.

## Evidence and scope limits

PROMPERÚ’s official 2016 Peruvian pepper profile has a separate `Limo` entry. It says Ají Limo covers many highly diverse peppers, lists fresh and canned export presentations, and gives source-specific regional and common-name details. The paired English profile uses `Limo chili`. These sources support a distinct culinary-name grouping and a fresh presentation; their taxonomy and regional name list are not generalized here. [S01, S02]

Québec-facing use is independently documented. Aliments du Québec describes a locally prepared sauce as based on Peruvian `piments aji limo`; Montréal retailer Marché Latino Soledad lists a Tradiciones Andinas `Aji limo confelado` product in its frozen-food category; and two Québec seed sellers list Aji Limo pepper products. Semences Solana explicitly distinguishes Aji Limo from Aji Limon. These are primary product/retail sources for their own labels, not official terminology or food standards. In particular, the frozen listing does not identify whether the product is whole pepper, cut pepper, or purée, so it does not justify a frozen form. [S03–S06]

Use `piment ají limo` as a provisional descriptive Québec French display based on the local product wording and the Spanish source spelling. Do not call it an OQLF-preferred term. Use `ají limo pepper` as the English display and `limo chili` as the one source-attested English alias. The names are not botanical claims. Although PROMPERÚ assigns *Capsicum chinense* to this profile, it also emphasizes the name’s high diversity, and Québec seed listings include conflicting species descriptions. Do not add a species field, cultivar, color, size, fixed heat, or growing-origin claim.

## Recipe demand

The manifest-ordered scan covered every string field in all 114 bundled recipe files and all 1,123 ingredient rows. It found no exact phrase matches for `ají limo`, `limo chili`, `ají limo pepper`, `piment ají limo`, `ají limón`, `lemon drop`, or the source common names `paringo`, `miscucho`, `bola`, and `picante`. No bundled recipe link, amount, reusable measure, density, conversion, yield, or substitution is proposed.

## Picker projection

This static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): accent/punctuation normalization, whole-phrase matching before substring fallback, and form terms searched through the owning reference. Counts are reference results.

| Query | Before integration | After integration | Effect |
|---|---:|---:|---|
| `ají limo` / `aji limo` | 0 | 1 | Resolves to the new Ají Limo reference; accent folding keeps both spellings equivalent. |
| `ají limo pepper` | 0 | 1 | Resolves through the English primary name. |
| `limo chili` | 0 | 1 | Resolves through the PROMPERÚ English phrase. |
| `fresh ají limo pepper` | 0 | 1 | Resolves to the owning reference through the fresh form label. |
| `piment ají limo frais` | 0 | 1 | Resolves to the owning reference through the fresh form label. |
| `ají limón` / `lemon drop` | 0 / 0 | 0 / 0 | Remains distinct from the Ají Limo row. |
| `piment` / `piments` | 28 / 0 | 29 / 0 | The singular broad French query gains one result; the unqualified plural remains unresolved. |
| `pepper` / `chili` / `chile` | 35 / 10 / 1 | 36 / 11 / 1 | English common-word results remain multi-result; no generic alias is introduced. |
| `ají` | 3 | 4 | Remains a multi-result family search. |

Do not add `piments ají limo` as an alias: with the current search implementation it would add the row to the generic `piments` query, which currently has no result. The fresh form’s labels are state-qualified and add no additional reference.

## Exact integrated JSON delta

### Addition to `ingredient-references.v1.json`

```json
{
  "id": "ingredient-ref-aji-limo-pepper",
  "nameFr": "piment aj\u00ed limo",
  "nameEn": "aj\u00ed limo pepper",
  "aliasesFr": [],
  "aliasesEn": ["limo chili"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

### Addition to `ingredient-forms.v1.json`

```json
{
  "id": "ingredient-form-aji-limo-pepper-fresh",
  "ingredientRefId": "ingredient-ref-aji-limo-pepper",
  "formCode": "fresh",
  "labelFr": "piment aj\u00ed limo frais",
  "labelEn": "fresh aj\u00ed limo pepper",
  "prepState": "fresh",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Les sources nomment une pr\u00e9sentation fra\u00eeche; aucune mesure g\u00e9n\u00e9rale ou densit\u00e9 n'est \u00e9tablie.",
  "notesEn": "Sources name a fresh presentation; no general measure or density is established.",
  "updatedAt": "2026-10-18T00:00:00Z"
}
```

The new `ingredient_reference` ledger record includes S01–S06 and an accepted identity/form decision. Measurement and substitution research remain `not_yet_researched`; there is no separate measure or form observation. Existing panca, amarillo, rocoto, fresh-pepper, and sauce records are unchanged.

## Source register — checked 2026-10-18

| Source ID | Primary source and locator | What it supports and what it does not |
|---|---|---|
| `WP03-L-AJI-LIMO-20261018-R639-S01` | PROMPERÚ, [*Pimientos, rocotos y ajíes: Capsicum del Perú*](https://repositorio.promperu.gob.pe/bitstream/handle/20.500.14152/1503/Pimientos_rocotos_ajies_peruano_espanol_2016_keyword_principal.pdf?isAllowed=y&sequence=8), 2016, printed p. 32, “Limo.” | Separate named entry; fresh and canned export presentations; unusually high diversity and source common names. It does not establish universal synonyms, an individual cultivar, or a Québec term. Its species statement is not copied into the catalog. |
| `WP03-L-AJI-LIMO-20261018-R639-S02` | PROMPERÚ, [English profile, *Peppers, rocoto peppers and chilies: Peruvian Capsicum*](https://repositorio.promperu.gob.pe/bitstream/handle/20.500.14152/1503/Pimientos%20y%20ajies%20ingles%20Julio%2016.pdf?isAllowed=y&sequence=1), 2016, printed p. 32, “Limo.” | The official repository’s indexed text uses `Limo chili` for the source-named product and describes the same regional/product boundary. Direct PDF retrieval timed out in this review. This is an export-profile English label, not a general Canadian terminology ruling. |
| `WP03-L-AJI-LIMO-20261018-R639-S03` | Aliments du Québec, [Sauce piquante aji/pomme/rhum](https://alimentsduquebec.com/aliments-dici/assaisonnements-sauces-et-condiments/sauce-piquante-aji-pomme-rhum), Sambal Alex product description. | Says the Québec-prepared sauce is based on Peruvian `piments aji limo`; supports local ingredient wording only. The sauce and its 148 mL retail format do not support a pepper form or measurement. |
| `WP03-L-AJI-LIMO-20261018-R639-S04` | Semences Solana, [Piments forts et décoratifs](https://www.solanacom.com/piments.html), Aji Limo and Aji Limon entries. | A Québec seed seller distinguishes Aji Limo from Aji Limon and offers a red sub-cultivar; this supports keeping the names separate. The source’s cultivation and species claims are not generalized. |
| `WP03-L-AJI-LIMO-20261018-R639-S05` | Gaia Organic Seeds, [Aji Limo Hot Pepper](https://gaiaorganics.ca/product/aji-limo-hot-pepper/), bilingual Ottawa product page, accessed 2026-10-18. | Supports the English product wording `Aji Limo Hot Pepper` on a Canadian seed product. Its name and growing description are product-specific; its botanical identification is not copied into the catalog. |
| `WP03-L-AJI-LIMO-20261018-R639-S06` | Marché Latino Soledad, [Frozen Foods](https://marchelatinosoledad.com/shop/category/food-and-beverages-frozen-foods-1), Tradiciones Andinas `Aji limo confelado` listing; Montréal retailer address shown on page. | Confirms a local retailer listing under this product name within the frozen-food category. The spelling is shown as displayed; no correction, physical form, composition, package amount, or frozen form is inferred. |

Static package normalization, generated-index freshness, ledger validation, source/ID ownership, picker projection, recipe corpus, local links, encoding, and scoped whitespace checks passed. No software tests, build, emulator run, or deployment were needed for this database-JSON-only update under `AGENTS.md`. See the [R639 integration README](../batches/wp03-section-l-aji-limo-fresh-identity-integration-r639-20261018/README.md).
