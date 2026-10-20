# WP04 Section P — smoked haddock product identity review (R149)

- **Reviewed / sources accessed:** 2026-10-15.
- **Recommendation:** Add identity-only `smoked haddock / aiglefin fumé` as `ingredient-ref-smoked-haddock`, category `PROTEIN`, with no aliases.
- **Scope:** A smoked haddock product name, scoped to the existing haddock identity (*Melanogrammus aeglefinus*). Do not treat it as a universal smoking form, a synonym for plain haddock, or an alias for `Finnan haddie` / `gades fumés`.
- **Proposal-only status:** This file is the only proposed artifact. No catalog JSON, ledger, forms, recipes, plan, roadmap, generated code, or tests were changed. No app, Android, or emulator tests were run.
- **Proposed source IDs:** `WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S01` through `S04`; checked for collisions in the current ledger and catalog proposal/batch archive before drafting.

## Gap and prior-work boundary

The active Section P fish list and preserved-fish checklist remain open. The existing Haddock / `églefin` identity is species-scoped; its 2026-10-09 identity review explicitly says smoked haddock and Finnan Haddie are not synonyms for unqualified haddock, but it does not allocate or review a smoked-haddock product row. The 2026-10-12 preserved-fish review holds generic preservation identities and universal state forms while retaining product-specific rows; it does not adjudicate this product. No dedicated smoked-haddock proposal, integration, active reference, form, ledger candidate, or recipe link was found. This review covers only the named smoked product and does not reopen those broader decisions.

The OQLF distinguishes a single smoked fish from the broader product it calls `gades fumés / Finnan haddie`: for one fish, it directs the user to the species-qualified name such as `aiglefin fumé`; it reserves `gades fumés` for a mixture of named gadids and cautions against calling a particular split, smoked, lightly salted haddock preparation `Finnan haddie`. The proposal therefore uses `smoked haddock / aiglefin fumé` only, and omits both broader terms. [S01]

## Identity and product evidence

DFO identifies haddock as *Melanogrammus aeglefinus* and documents the species in Canadian Atlantic waters. The existing active Haddock row owns the unqualified species name; this candidate adds only the separately qualified product phrase. [S02]

Current indexed Canadian grocery listings use the product wording. Real Atlantic Superstore's French storefront shows `Aiglefin fumé, Sea Bright`, marked prepared in Canada and priced by weight; its selected listing reports the item out of stock. The English storefront names `Sea Bright Smoked Haddock`. Direct retrieval of the storefront returned 403, so this wording and listing status are based on the indexed category pages. This supports Canadian English/French retail wording, not continuous availability, a shared UPC, or a particular preparation beyond the listing. [S03]

Fisherman's Market in Halifax currently lists `Frozen Cold Smoked Haddock Fillets`, describes them as smoked by its Seabright Smokehouse, and lists a one-pound package. This is a specific cold-smoked frozen fillet SKU, not a definition of every product called smoked haddock. The page warns that stock and pricing vary with landings and seasonality. [S04]

## Ownership and picker projection

The live package snapshot contains **1,511 ingredient references**, **119 forms**, **1,856 ledger records**, and **114 manifest-listed recipes**. Exact normalized-name checks found no owner for `smoked haddock`, `aiglefin fumé`, `haddock fumé`, `Finnan haddie`, or `gades fumés` among active reference names/aliases, form labels/match terms, legacy-import identities, or ledger record IDs. No `ingredient-ref-smoked-haddock` ID exists. The only relevant active identity is `ingredient-ref-haddock` (`haddock / églefin`, with French alias `aiglefin`). The proposal and batch archive contain only the generic Haddock exclusion and preserved-fish review described above; neither is an equivalent product decision.

The picker uses phrase-first matching and falls back to partial matching only when no full phrase matches ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). The table compares the current reference/form projection with that projection plus the proposed row:

| Query | Current result | With proposed row | Boundary |
|---|---|---|---|
| `smoked haddock` | None | Smoked haddock only | Exact English product phrase selects the proposed row. |
| `aiglefin fumé` | None | Smoked haddock only | Exact Québec French product phrase selects the proposed row. |
| `haddock` | Haddock | Haddock; smoked haddock | The broad species query shows the existing identity and product choice. |
| `aiglefin` | Haddock | Haddock; smoked haddock | The existing French species alias remains distinct from the product phrase. |
| `fumé` | Smoked paprika; smoked salt; smoked tofu | Same three plus smoked haddock | Broad preparation-word query remains a multi-choice search. |
| `smoked fish`, `poisson fumé` | None | None | The proposal adds neither broad fish phrase. |
| `Finnan haddie`, `gades fumés` | None | None | OQLF’s broader/canned or mixed product names remain unassigned. |

No broad alias is added to the existing Haddock row, and no species or form is inferred from unqualified recipe wording.

## Recipe demand

The current manifest lists **114 recipe files and 1,123 ingredient rows**. A case-insensitive search of all string fields in those ingredient rows for `smoked haddock`, `aiglefin fumé`, `haddock fumé`, `Finnan haddie`, and `gades fumés` found **zero matching rows in zero recipes**. No recipe link, relink, amount, or context-specific replacement is proposed.

## Forms, measurements, and substitutions

- **Forms:** Add no form. Current listings include a smoked product and a separate frozen, cold-smoked fillet SKU; those listings do not establish one reusable hot/cold, frozen/thawed, fillet/whole, salted, cooked, or ready-to-eat state for the product identity.
- **Measurements:** Use `defaultDensity: null` and `unitMappings: []`. The one-pound retailer package and the per-pound/per-kilogram listings are SKU or price-basis details, not a household measure, per-piece mass, density, conversion, package yield, edible yield, or cooking yield. Add no measurement observation.
- **Substitutions:** The sources reviewed here support identity and product naming, not recipe-specific substitution ratios or cooking equivalence. The bundled ingredient-row scan found no matching smoked-haddock line, so add no global or contextual substitution, warning, or recipe-line substitution link.

## Exact proposed reference delta

```json
{
  "id": "ingredient-ref-smoked-haddock",
  "nameEn": "smoked haddock",
  "nameFr": "aiglefin fumé",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "PROTEIN"
}
```

No ingredient-form, recipe-link, measurement-observation, unit-conversion, package-yield, or substitution-rule record is proposed.

## Proposed ledger delta

```json
{
  "recordId": "ingredient-ref-smoked-haddock",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488227/gades-fumes",
      "title": "Office québécois de la langue française, gades fumés (GDT)",
      "versionOrDate": "Last updated 1983",
      "accessedOn": "2026-10-15",
      "locator": "Definition and note distinguishing a single smoked fish (including aiglefin fumé) from mixed gades fumés / Finnan haddie, and warning about the canned product name.",
      "supports": "For a single fish in the product family, the OQLF directs the writer to the species-specific term, including aiglefin fumé. It reserves gades fumés for a mix of listed gadids and distinguishes the canned Finnan haddie product from a split, smoked, lightly salted haddock preparation. It does not establish a universal product formula or preparation state.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S02",
      "url": "https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/haddock-aiglefin-fra.html",
      "title": "Fisheries and Oceans Canada, Aiglefin species profile",
      "accessedOn": "2026-10-15",
      "locator": "Species heading, Latin name, and Canadian range.",
      "supports": "Identifies aiglefin as Melanogrammus aeglefinus and documents the species in Canadian Atlantic waters. Biological species evidence; it does not define the smoked product or its recipe behavior.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S03",
      "url": "https://www.atlanticsuperstore.ca/fr/alimentation/poissons-et-fruits-de-mer/poisson-fum/c/28219",
      "title": "Real Atlantic Superstore, smoked-fish product listings (French and English storefronts)",
      "accessedOn": "2026-10-15",
      "locator": "Current indexed product listing for Sea Bright Smoked Haddock / Aiglefin fumé, Sea Bright; prepared-in-Canada label and per-weight prices.",
      "supports": "The French listing uses Aiglefin fumé and the English listing uses Sea Bright Smoked Haddock. The item was out of stock in the selected listing. The storefront page returned 403 to direct retrieval; the indexed current listing supplied the displayed titles and price basis. This supports market wording only, not a common UPC, formula, stock at other locations, or processing details.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S04",
      "url": "https://www.fishermansmarket.ca/products/frozen-cold-haddock",
      "title": "Fisherman's Market, Frozen Cold Smoked Haddock Fillets",
      "accessedOn": "2026-10-15",
      "locator": "Current product page title, description, package amount, and availability note.",
      "supports": "Halifax seafood retailer lists frozen cold-smoked haddock fillets smoked by its Seabright Smokehouse, in a one-pound package. It is one named product example; its cold-smoked, frozen, fillet, and package details are not generalized to the identity. The seller says availability and prices vary with landings and seasonality.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only smoked haddock / aiglefin fumé as a named PROTEIN product scoped to the existing haddock species identity. Keep plain haddock separate and omit Finnan haddie / gades fumés, which OQLF uses for a broader or mixed/canned product boundary. Current Canadian listings support the product name, but not a universal smoke method, storage state, measure, yield, or substitution; the bundled corpus has no matching line. Add no forms, measurements, conversions, yields, recipe links, or substitutions.",
      "sourceIds": [
        "WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S01",
        "WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S02",
        "WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S03",
        "WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S04"
      ]
    }
  ]
}
```

## Source register

| Source ID | Source and evidence limit |
|---|---|
| **WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S01** | OQLF, [gades fumés (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488227/gades-fumes). Québec terminology source distinguishes one smoked species (`aiglefin fumé`) from the broader mixed/canned `Finnan haddie / gades fumés` boundary; it does not define every SKU's smoking process. |
| **WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S02** | Fisheries and Oceans Canada, [Aiglefin species profile](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/haddock-aiglefin-fra.html). Identifies *Melanogrammus aeglefinus* and its Canadian Atlantic distribution; species evidence only. |
| **WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S03** | Real Atlantic Superstore, [smoked-fish listings](https://www.atlanticsuperstore.ca/fr/alimentation/poissons-et-fruits-de-mer/poisson-fum/c/28219). Current indexed English/French storefront wording pairs `Sea Bright Smoked Haddock` with `Aiglefin fumé, Sea Bright`; the item was shown out of stock for the selected listing, and direct retrieval returned 403. Do not infer common SKU identity, current stock elsewhere, composition, or preparation. |
| **WP04-SECTIONP-SMOKED-HADDOCK-R149-20261015-S04** | Fisherman's Market, [Frozen Cold Smoked Haddock Fillets](https://www.fishermansmarket.ca/products/frozen-cold-haddock). Halifax seafood retailer lists a one-pound frozen cold-smoked fillet product and says it is smoked by its Seabright Smokehouse. Specific product evidence; stock, process, package, and cut are not universal. |

**Conclusion:** Recommend an identity-only smoked-haddock reference. Keep generic preservation forms, product-state measurements, and substitutions open for recipe-led review; this proposal allocates no ledger or catalog data and requires no app tests.
