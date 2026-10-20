# WP04 Section P R658 — Yellowfin sole / *Limanda aspera* identity review

- **Status:** Integrated on 2026-10-18 after root source and ownership review; one identity-only reference and one research-ledger record were added.
- **Review and source-access date:** 2026-10-18.
- **Open checklist anchor:** Section P's broad finfish and regional-fish item remains open in the [global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6592).
- **Candidate:** Yellowfin sole / sole à nageoires jaunes, *Limanda aspera* (CFIA TSN 172907).
- **Scope:** One species-level Pacific flatfish identity. Keep the existing species-neutral sole and flounder market groups, yellowtail flounder / *Limanda ferruginea*, and all other flatfish distinct.

## Source findings and bounded identity

The CFIA Fish List pairs TSN 172907 and *Limanda aspera* with **Yellowfin Sole**. It also lists separate `Flounder / Plie` and `Sole / Sole` rows for the same taxon, and those broader names occur on other taxa as well. CFIA establishes the Canadian fish-label name and taxon; it does not supply a French name for this Yellowfin Sole row or make the broad names species-specific. [S01]

Pearlmark Foods has a current English product page titled **Yellowfin Sole** and a French route titled **Sole à nageoires jaunes**. Both pages print *Limanda aspera*, give the same product codes, and identify Montréal and Québec among the supplier's service regions. This is first-party evidence of a bilingual Canadian supplier name for the named fish. It is not an OQLF normalization, proof of current retail stock, or evidence for a reusable cut, measure, or product form. Do not turn the page's product details into general catalog data. [S02, S03]

OQLF's GDT fiche 1198645 is for a different fish, *Limanda ferruginea*: it selects **limande à queue jaune** and English **yellowtail flounder**. Its note says unqualified `sole` is used for several Canadian fish and can be confused with common sole (*Solea solea*). This is a useful naming boundary, not a French synonym for *L. aspera*. Keep **limande à queue jaune**, **yellowtail flounder**, and unqualified `sole` out of the new row's aliases. [S04]

The bilingual supplier wording plus CFIA's scientific-name pair supports a bounded `yellowfin sole / sole à nageoires jaunes` identity. The French display is taken from the supplier's Québec-facing route; this proposal does not describe it as the normalized or preferred OQLF term. The existing **sole** market-name group remains useful because the supplier-named species is one of the species that broad sole wording can obscure.

## Exact proposed data delta

Add one `PROTEIN` ingredient reference and its identity record only. Keep aliases empty so the picker gains the exact bilingual species-qualified terms without gaining generic names, taxonomic synonyms, or product-state wording.

```json
{
  "id": "ingredient-ref-yellowfin-sole",
  "nameFr": "sole à nageoires jaunes",
  "nameEn": "yellowfin sole",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-18T00:00:00Z",
  "category": "PROTEIN"
}
```

The proposed ledger record is:

```json
{
  "recordId": "ingredient-ref-yellowfin-sole",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "not_yet_researched",
  "substitutionResearchState": "not_yet_researched",
  "sources": [
    {
      "sourceId": "WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S01",
      "url": "https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp",
      "title": "Canadian Food Inspection Agency, Fish List results",
      "accessedOn": "2026-10-18",
      "locator": "Result rows for TSN 172907, Limanda aspera.",
      "supports": "Pairs Limanda aspera with Yellowfin Sole and also lists Flounder / Plie and Sole / Sole for this taxon. The broader names also appear for other taxa; no French label is supplied on the Yellowfin Sole row.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S02",
      "url": "https://www.pearlmarkfoods.com/our-products/yellowfin-sole",
      "title": "Pearlmark Foods, Yellowfin Sole",
      "accessedOn": "2026-10-18",
      "locator": "Product title, printed binomial, product table, and service-region footer.",
      "supports": "The English page pairs Yellowfin Sole with Limanda aspera and lists the same product codes as the French route. It supports supplier wording and species identity, not current retail inventory or reusable form or quantity data.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S03",
      "url": "https://www.pearlmarkfoods.com/fr/nos-produits/sole-a-nageoires-jaunes",
      "title": "Pearlmark Foods, Sole à nageoires jaunes",
      "accessedOn": "2026-10-18",
      "locator": "French product title, printed binomial, product table, and service-region footer.",
      "supports": "The French page pairs Sole à nageoires jaunes with Limanda aspera and uses the same product codes as the English route. It is supplier wording, not an OQLF normalization or proof of retail stock.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S04",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198645/limande-a-queue-jaune",
      "title": "Office québécois de la langue française, GDT: limande à queue jaune, fiche 1198645",
      "accessedOn": "2026-10-18",
      "locator": "Preferred French term, English and Latin terms, and note on unqualified sole usage.",
      "supports": "Identifies limande à queue jaune / yellowtail flounder as Limanda ferruginea, not Limanda aspera, and explains that unqualified sole can be applied to multiple Canadian fish and cause confusion with common sole. This term is excluded from the Yellowfin Sole aliases.",
      "sourceKind": "regional_authority"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only yellowfin sole / sole à nageoires jaunes for Limanda aspera, using the direct CFIA species name and the supplier's paired Québec-facing English/French product wording. Keep aliases empty, including the binomial, generic sole/flounder/plie wording, and the distinct limande à queue jaune / yellowtail flounder terms for Limanda ferruginea. No bundled recipe demand, form, measure, density, mapping, conversion, yield, recipe link, or substitution is supported.",
      "sourceIds": [
        "WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S01",
        "WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S02",
        "WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S03",
        "WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S04"
      ]
    }
  ]
}
```

No form, preparation state, amount, density, unit mapping, conversion, yield, recipe link, or substitution is proposed. The supplier's fillet product rows and package descriptions stay source-specific. The catalog row assigns no cut, frozen state, quantity, harvest origin, or stock claim beyond the exact identity wording above.

## Ownership, picker behavior, and recipe demand (proposal-time snapshot)

The read-only pre-integration audit covered active references and forms, legacy-import identities, research-ledger records and source URLs, Section P progress, prior proposals and batches, picker search behavior, the bundled-library manifest, and every manifest-listed recipe. Its snapshot had **1,834 ingredient references**, **164 forms**, **56 legacy candidates**, **2,207 research-ledger records**, and **114 recipe files with 1,123 ingredient rows**; root integration added one reference and one ledger record.

At the proposal-time snapshot, no active reference, form, legacy identity, ledger record, source locator, proposal, or batch owned **yellowfin sole**, **sole à nageoires jaunes**, *Limanda aspera*, `ingredient-ref-yellowfin-sole`, `candidate-yellowfin-sole`, or the R658 source-ID prefix. Root integration now allocates the reference and row with this exact identity. Existing `yellowtail flounder` and *Limanda ferruginea* mentions remain distinct. The generic **sole** and **flounder** market groups remain unchanged. [R01]

The current picker [matches complete normalized word phrases before using substring matching](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The hypothetical row uses only the canonical display pair in the JSON delta above.

| Query | Pre-integration results | Integrated results | Boundary |
|---|---|---|---|
| `yellowfin sole` | No result | Yellowfin sole row | Exact CFIA English species name. |
| `sole à nageoires jaunes` | No result | Yellowfin sole row | Exact French supplier wording paired with *L. aspera*. |
| `yellowfin` | Yellowfin tuna | Yellowfin tuna; Yellowfin sole | Broad word stays multi-result. |
| `sole` | Sole market-name group | Sole market-name group; Yellowfin sole | Broad term retains a generic multiple-species option beside the qualified species. |
| `flounder` | Flounder market-name group | Flounder market-name group | No `flounder` alias is introduced. |
| `plie` | American plaice; Flounder market-name group | Same two results | No `plie` alias is introduced. |
| `limanda aspera` | No result | No result | Binomial remains evidence, not a search alias. |
| `limande à queue jaune` | No result | No result | OQLF's term identifies *L. ferruginea* and is not transferred. |

All **114 recipe files** from the manifest and all **1,123 ingredient rows** were scanned for `yellowfin sole`, `sole à nageoires jaunes`, *Limanda aspera*, and `limande à nageoires jaunes`. The scan found **zero candidate-specific matches**. No recipe link, form, or ingredient amount is proposed. [R01]

## Source-ID and URL ownership (proposal-time snapshot)

Before integration, the proposed reference ID, candidate ID, and R658 source-ID prefix were unallocated in active references/forms, legacy identities, and the shared ledger. The generic CFIA Fish List results URL then had **42** existing ledger owners, so S01 uses a taxon-specific locator; after integration it has 43 scoped owners. The Pearlmark English/French product URLs and OQLF fiche URL had no exact ledger URL owner before integration and each now has one R658 source record. S01–S04 had no prior source-ID collision and now each has one ledger owner. [R01]

## Recommendation and remaining Section P scope

**Accepted and integrated the bounded identity and ledger row above.** The CFIA row supplies the English species/taxon anchor; Pearlmark's parallel Québec-facing routes supply one matching English/French product-name pair with that binomial. The row broadens generic `sole` searches from the existing multiple-species group to two visibly qualified choices and broad `yellowfin` from tuna to two fish choices. It does not collapse `sole`, `flounder`, or `plie` into a singleton. No recipe demand means there is no basis to add any recipe link, product form, quantity, conversion, yield, or substitution.

Treat `sole à nageoires jaunes` as a sourced supplier display, not an OQLF-normalized term. Keep the nearby OQLF `limande à queue jaune` / *Limanda ferruginea* identity separate. The broad finfish and regional-fish checklist remains open.

## Proposal audit and root integration checks

- Confirmed UTF-8 without BOM, no replacement characters or trailing whitespace, and resolving internal Markdown links.
- Confirmed the candidate/reference ID and four source IDs were unallocated at integration; checked each source URL owner, including the already-shared CFIA result endpoint.
- Recomputed current and hypothetical picker projections with attached form terms; confirmed the broad `sole`, `yellowfin`, `flounder`, and `plie` boundaries above.
- Re-scanned all manifest-listed recipes and structured ingredient rows; no candidate-specific demand was found.
- Root integration added one active reference and one research-ledger record, updated the generated index, plan, roadmap, workflow, and integration README. No software tests, build, emulator, or deployment were run for this database-JSON-only change.

## Sources

| ID | Source and locator | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S01** | CFIA, [Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), TSN 172907 rows. | Pairs *Limanda aspera* with Yellowfin Sole; also lists broader Flounder / Plie and Sole / Sole rows for this and other taxa. The Yellowfin Sole row has no French term. Generic endpoint has existing ledger owners; the taxon-specific locator remains proposal-local. |
| **WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S02** | Pearlmark Foods, [Yellowfin Sole](https://www.pearlmarkfoods.com/our-products/yellowfin-sole). | First-party supplier page pairs English Yellowfin Sole with *Limanda aspera*, carries the same product codes as the French route, and lists Québec/Montréal in service regions. Not proof of stock in a specific retail store. |
| **WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S03** | Pearlmark Foods, [Sole à nageoires jaunes](https://www.pearlmarkfoods.com/fr/nos-produits/sole-a-nageoires-jaunes). | Parallel first-party French route pairs its French product name with *Limanda aspera* and matches the English product codes. The source supports the seller's wording; it does not establish OQLF normalization. |
| **WP04-SECTIONP-YELLOWFIN-SOLE-R658-20261018-S04** | OQLF, [GDT: limande à queue jaune, fiche 1198645](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198645/limande-a-queue-jaune). | Defines *Limanda ferruginea* / yellowtail flounder and notes broad Canadian use of `sole`; supports keeping this term distinct from *L. aspera*. It does not supply the proposed Yellowfin Sole French display. |
| **R01** | Read-only audit of active refs/forms, legacy identities, ledger/source URLs, plan/proposal/batch archive, picker implementation, manifest and all bundled recipes. | Repository ownership and search observations only; no shared data or workflow file was modified. |


## Root integration

Accepted the bounded identity. Added `ingredient-ref-yellowfin-sole` with canonical names `yellowfin sole / sole à nageoires jaunes` and empty aliases. Added the verified identity ledger row with the four reviewed sources and one accepted decision. The CFIA Fish List provides the English/taxon pair; Pearlmark's parallel English and French routes pair the two product displays with *Limanda aspera* and matching product codes. OQLF's `limande à queue jaune` identifies *L. ferruginea* and remains excluded. No forms, measurements, conversions, yields, recipe links, or substitutions were added.

See the [R658 integration README](../batches/wp04-section-p-yellowfin-sole-identity-integration-r658-20261018/README.md).

## Root static validation

- Seed package validation and normalization checks passed; the generated catalog is current at 1,835 references.
- `validate_research_ledger()` passed with 2,208 records and zero errors. All four new source IDs have one owner; the generic CFIA URL now has 43 scoped ledger owners, and each other new URL has one.
- Both canonical phrases have a single exact picker owner; the identity row keeps empty aliases, null density, and empty unit mappings.
- Maintained JSON is UTF-8 without BOM with explicit Unicode escapes; five touched Markdown files passed UTF-8/no-BOM, link, newline, and whitespace checks. Scoped `git diff --check` passed.
