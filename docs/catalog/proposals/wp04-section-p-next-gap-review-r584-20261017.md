# WP04 Section P R584 — Zander / European pike-perch identity review

- **Review date:** 2026-10-17.
- **Status:** Integrated; see the [R584 integration README](../batches/wp04-section-p-zander-identity-integration-r584-20261017/README.md).
- **Plan anchor:** [Open Section P finfish and regional-fish checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6423).
- **Scope:** One species identity, *Sander lucioperca*. This review does not add a fillet form or revise the adjacent walleye, sauger, or pickerel decisions.
- **Integrated identity:** `PROTEIN` reference with display names **pike-perch / sandre européen**, English alias **zander**, and French alias **doré européen**. Keep `European pickerel`, `European walleye`, bare `pickerel`, and bare `walleye` out of aliases. Add no form, measure, recipe link, conversion, density, yield, package mapping, or substitution.

## Exact gap and prior-work check

The open parent at plan line 6391 covers salmon, cod, pollock, halibut, and other finfish, including regional species. R578 reviewed a Blue Catfish (*Ictalurus furcatus*) picker boundary; R581 reviewed Bluegill (*Lepomis macrochirus*) and the generic French query `crapet`. Neither allocates this Percidae species. Their conclusions remain separate.

The archive contains one earlier mention of *S. lucioperca*: the [R10 chain-pickerel review](wp04-section-p-next-fish-gap-review-20261013-round10.md) lists CFIA’s **European Pickerel / Doré Européen** name under that taxon while investigating the unrelated *Esox niger* `pickerel` collision. R10 did not propose or assess a Zander catalog row, product pages, or Zander-specific picker projection. Its CFIA source identifier, `WP04-SAUGER-20261012-S02`, is already the owner of the same Fish List overview/results source in the Sauger ledger record and was reused in R10 for those cross-taxon rows. Reuse that ID for this same source; do not mint a duplicate source ID for the same result set.

The [WP04 freshwater-finfish review](wp04-freshwater-finfish-gaps-20261010.md) says OQLF did not retain unqualified `sandre` for the *S. vitreus* walleye product name. That is a boundary on the Walleye name, not an identity review of *S. lucioperca*. The CFIA Fish List separately maps `Sandre Européen` to *S. lucioperca*. This proposal keeps the French display qualified.

Before root integration, case-insensitive searches of the plan, proposal and batch archive, active reference/form catalogs, legacy identities, and ledger found no focused Zander identity decision, active reference, form, or legacy allocation. The one R10 source mention is recorded above and was not an allocation. Exact normalized ownership checks found no `ingredient-ref-zander`, `candidate-zander`, `Zander`, `Pike-perch`, `Sandre Européen`, `doré européen`, or *S. lucioperca* value in active references, forms, legacy candidates, or ledger records. The exact Metro and Super C product-page URLs below were unowned in the ledger. Root integration added `ingredient-ref-zander` and allocated source IDs S01–S03 to its ledger record; S04 remains proposal-local because it records only the CNF access limitation.

## Taxon and Canadian / Québec naming

CFIA assigns TSN **650172** to *Sander lucioperca* and gives several species-scoped Canadian fish-label names: **Pike-perch / Sandre Européen**, **Zander**, **European Walleye / Sandre**, and **European Pickerel / Doré Européen** ([Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp); see also the [Fish List overview](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list)). The public Fish List reports a 2023-09-18 modification date. The same result set separately assigns *S. vitreus* to **Walleye** and **Pickerel / Doré Jaune**, and *S. canadensis* to **Baby Pickerel / Doré Noir**. The taxon is therefore distinct from the active **walleye / doré jaune** and **sauger / doré noir** references. CFIA’s [common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names) says to use only names listed for the fish species being sold or processed; it is labelling guidance, not a recipe synonym or an interchangeability rule. [Reused `WP04-SAUGER-20261012-S02`; reused general guidance `WP04-FINFISH-GAPS-20261010-S12`]

No direct OQLF GDT entry for *S. lucioperca* was located in this review. The recommended French display, `sandre européen`, is the qualified CFIA name, while the local French product title `doré européen` is a scoped alias supported by CFIA and Metro. The [OQLF `doré jaune` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198870/dore-jaune) and prior freshwater review concern *S. vitreus*: they do not identify Zander or override the CFIA *S. lucioperca* row. Do not shorten the display to `sandre` or `doré`; do not promote the less-qualified `European Walleye` and `European Pickerel` labels into search aliases.

## Current catalog, ledger, and source ownership

After R584 integration, the package contains **1,808 ingredient references**, **154 forms**, and **56 legacy candidates**; the research ledger contains **2,178 records** and **8 unit-conversion observations**. The active neighbor rows are `ingredient-ref-walleye` (**walleye / doré jaune**) and `ingredient-ref-sauger` (**sauger / doré noir**); neither has an attached form. The form catalog has no form for Zander, Walleye, or Sauger.

| Candidate or evidence | Current owner and treatment |
|---|---|
| `ingredient-ref-zander`, `candidate-zander`, *Sander lucioperca*, `pike-perch`, `sandre européen`, `zander`, `doré européen` | Before integration, there was no exact owner. Root added `ingredient-ref-zander`; no `candidate-zander` or form was added. |
| `WP04-SAUGER-20261012-S02` | Existing source ID owned by `ingredient-ref-sauger`; it identifies the same CFIA Fish List overview/results source and was reused in the R10 chain-pickerel review for the *S. lucioperca* row. Reuse it for that same source; do not duplicate it. |
| `WP04-FINFISH-GAPS-20261010-S12` | Existing CFIA common-name guidance ID used by multiple fish records. Reuse only for the general Canadian naming rule, not as species evidence. |
| `WP04-FRESHWATER-FINFISH-20261010-S01` | Existing OQLF `doré jaune` source ID owned by the Walleye record. It supports *S. vitreus* naming only; do not reuse it as Zander terminology evidence. |
| `WP04-SECTIONP-ZANDER-R584-20261017-S01`–`S03` | New retail-product source IDs, now owned by the `ingredient-ref-zander` ledger record. |
| `WP04-SECTIONP-ZANDER-R584-20261017-S04` | Proposal-local ID for the CNF access note below. It is not in the ledger because no Zander CNF food code or portion was inspected. |

## Product, package, and measurement evidence

The current Québec-facing listings support a species-identified fillet product, but they do not justify attaching SKU weights to a reusable ingredient measure. Their product numbers and package statements stay separate:

| Source ID | Listing and exact product scope | Evidence limit |
|---|---|---|
| `WP04-SECTIONP-ZANDER-R584-20261017-S01` | Metro, French [Filet de doré européen décongelé, format économique](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-frais/poissons-blancs/filet-de-dore-europeen-decongele/p/229351), product **229351**. The ingredient detail identifies *Sander lucioperca*; the title says `décongelé`, and the page describes about **four fillets per tray**. | The listing reported out of stock when reviewed. It gives no tray mass or per-fillet weight. Four per tray is SKU-specific and is not a count conversion or recipe serving. |
| `WP04-SECTIONP-ZANDER-R584-20261017-S02` | Metro, English [Previously frozen European pickerel fillet](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/fresh-fish/white-fish/previously-frozen-european-pickerel-fillet/p/235617), product **235617**. The ingredient detail identifies *S. lucioperca*, Central Asian / Kazakhstan provenance, wild capture, and gillnet method. The page’s serving selector displays **200 g fillet (1 person)** through **800 g (4 people)**. | The listing reported out of stock. The serving selector is retailer-specific product-ordering information; it does not set a general portion for this fish or another recipe. `Previously frozen` and the listed provenance/method remain scoped to this product. |
| `WP04-SECTIONP-ZANDER-R584-20261017-S03` | Super C, English [Previously frozen European pickerel fillet](https://www.superc.ca/en/aisles/fish-seafood/fresh-fish/white-fish/previously-frozen-european-pickerel-fillet/p/235617), product **235617**. The page identifies *S. lucioperca* and shows **400 g average**, with seasonal/unavailable and out-of-stock status. | This is an average for product 235617, not an individual-fillet weight, a serving standard, or a general measure. Do not merge it with Metro French product **229351**, which is a different product number and only reports an approximate four-per-tray count. |
| `WP04-SECTIONP-ZANDER-R584-20261017-S04` | Health Canada, [Canadian Nutrient File](https://www.canada.ca/en/health-canada/services/food-nutrition/healthy-eating/nutrient-data/canadian-nutrient-file-about-us.html), checked 2026-10-17. The current page links the CNF 2026 relational files and says the 2015 online search remains interim. | This review did not inspect CNF 2026 relational rows for *S. lucioperca* and did not verify a candidate-specific CNF food code or portion. No measure or absence claim is made from that uninspected dataset. |

The product pages give evidence for *S. lucioperca* sold as previously frozen / thawed fillets, not a common standardized package, preparation state for every product, edible yield, density, or volume conversion. Add no form, package-yield rule, unit mapping, measure, cooking yield, or numeric record. Do not treat the French product 229351 and English product 235617 as paired bilingual SKU routes: their product numbers differ.

## Active picker projection

This projection mirrors [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase and accent-fold terms, convert punctuation to spaces, prefer whole-word phrase results, then use substring fallback. The integrated row has no forms and these fields:

```json
{
  "id": "ingredient-ref-zander",
  "nameEn": "pike-perch",
  "nameFr": "sandre européen",
  "aliasesEn": ["zander"],
  "aliasesFr": ["doré européen"],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

| Query | Before integration | After integration | Effect |
|---|---|---|---|
| `zander`, `pike-perch`, `sandre européen`, `doré européen` | No result | Zander / pike-perch / sandre européen | Qualified candidate searches. |
| `sandre` | No result | Zander / pike-perch / sandre européen | The complete-word query matches the qualified French display. CFIA’s `Sandre` entry is assigned to *S. lucioperca*; OQLF’s prior statement about unretained `sandre` was specific to Walleye/*S. vitreus*. |
| `doré` | Maple-syrup and golden-syrup names; Sauger / doré noir; Walleye / doré jaune | Same results plus Zander | It remains a multiple-result query; the alias does not make the French term unique. |
| `pike` | Northern pike | Northern pike plus Zander | Broader English query gains a second fish choice. |
| `perch` | Nile perch; white perch; yellow perch | Those three plus Zander | Broader English query gains a fourth fish choice. |
| `perch` | Nile perch; white perch; yellow perch | Those three plus Zander | Broader English query gains a fourth fish choice. |
| `perche` | Nile perch | Unchanged | The proposed French terms do not add a `perche` match. |
| `walleye`, `doré jaune` | Walleye / doré jaune | Unchanged | Do not index `European walleye`; the North American species remains separately selectable. |
| `pickerel`, `European pickerel`, `European walleye` | No result | Unchanged | Do not index `European pickerel`: under current matching, its one qualified phrase would make bare `pickerel` return Zander alone while the active Walleye row has no pickerel alias. The retailer title remains product evidence, not an alias. |

The proposed display and two aliases keep the candidate searchable under Canadian and Québec-qualified terms. They leave the existing Walleye and Sauger identities intact. The recognized product wording `European pickerel / doré européen` is not promoted as a pair of search aliases because its English component would create a misleading lone result for bare `pickerel`; the qualified French alias `doré européen` instead keeps `doré` plural in the current projection.

## Bundled recipe demand and substitution limits

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned. Whole-phrase checks covered `zander`, `pike-perch` / `pike perch`, `sandre européen`, `doré européen`, `European pickerel`, `European walleye`, *Sander lucioperca*, `pikeperch`, and neighboring terms `sandre`, `pickerel`, `walleye`, `pike`, `perch`, `perche`, and `doré`. There were **zero ingredient-row matches** for every checked term. Candidate and species-qualified terms had zero recipe-file matches. The broad `doré` word appeared in nine recipe JSON files, but in no ingredient rows and not as Zander demand. The bundle contains no species-specific recipe, amount, method, role, form, or line link for this fish.

No reviewed recipe or product source supports a directed substitution between Zander and Walleye, Sauger, Northern pike, or generic white fish. Supplier descriptions of a delicate or firm white flesh, taxonomy within *Sander*, and similarly titled retailer products do not specify an equivalent recipe role, amount, or method. Add no global form conversion, contextual substitution, warning, or food-safety equivalence.

## Integrated decision

Root added identity-only `ingredient-ref-zander` in `PROTEIN`, displayed as **pike-perch / sandre européen**, with English alias **zander** and French alias **doré européen**. The ledger reuses the existing CFIA Fish List and common-name guidance source IDs, and records retail source IDs S01–S03. All quantities stay attached to product numbers **229351** or **235617** as stated. No form, measure, density, unit mapping, package yield, conversion, recipe link, or substitution was added. The broader Section P finfish and regional-fish parent remains open.

This is an identity and naming recommendation only. The CFIA and supplier pages support a distinct imported species and selected Canadian label terms; the checked retail pages were out of stock, the CNF 2026 species row was not verified, and the bundled recipes contain no demand. Do not describe the row as evidence of routine Québec availability or as culinary interchangeability with the existing freshwater fishes.

Static package, ledger/source ownership, generated-index, picker, recipe-corpus, UTF-8, local-link, and whitespace checks were completed. No application tests, build, emulator, or deployment were run for this database-JSON addition, as allowed by `AGENTS.md`.
