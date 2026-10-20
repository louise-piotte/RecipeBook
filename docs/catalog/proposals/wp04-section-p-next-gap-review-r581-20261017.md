# WP04 Section P R581 — Bluegill identity and generic-picker boundary review

- **Review date:** 2026-10-17.
- **Status:** Integrated as a documentation-only picker-boundary hold; see the [R581 integration README](../batches/wp04-bluegill-picker-boundary-hold-integration-r581-20261017/README.md).
- **Scope:** One unreviewed species identity, Bluegill (*Lepomis macrochirus*), beneath the open Section P finfish/regional-fish parent. This review does not add a fillet, battered-fillet, whole-fish, or other product form.
- **Decision:** **Hold Bluegill outside active references and the shared ledger for now.** The Canadian and Québec sources establish the bilingual species pair `Bluegill / crapet arlequin`, but adding the unavoidable French display would make the generic query `crapet` return Bluegill alone. OQLF expressly defines `crapet` as a generic, non-taxonomic name covering several species, and current search prefers complete word phrases; the current active subset has no other `crapet` display to keep that query plural. No aliases, reference, form, measures, links, conversions, yields, or substitutions should be added in this review.
- **Candidate for reconsideration:** `ingredient-ref-bluegill`, names `Bluegill / crapet arlequin`, category `PROTEIN`, empty aliases. Before activation, address the generic `crapet` singleton or provide an explicit generic-group picker result alongside species results.

## Exact plan anchor and nearby prior work

The exact open plan anchor is **P Fish shellfish seafood products roe and other regional proteins** → `[ ] Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.` It remains open; this review addresses only the regional-fish child.

R578 is the immediately preceding fish review, a Blue Catfish (*Ictalurus furcatus*) hold over the unrelated French query `poisson-chat`. R577 covers an Atlantic-salmon steak hold. The other recent child reviews in this parent address cod and halibut loin/steak/centre cuts, Haddock loins, swordfish steak, Alaska-pollock fillets, Atlantic-salmon steak, and cod/catfish identities. None is reopened here. Bluegill belongs to Centrarchidae; the spelling `crapet` and the species pair are distinct from the recent catfish matter.

Exact, case-insensitive searches for `bluegill`, `crapet arlequin`, *Lepomis macrochirus*, `crapet à oreilles bleues`, `ingredient-ref-bluegill`, and `candidate-bluegill` found no prior dedicated candidate in the plan, proposal/batch archive, active references, forms, legacy import identities, or ledger. Related active references `ingredient-ref-black-crappie` and `ingredient-ref-white-crappie` use `marigane noire` and `marigane blanche`; neither is a Bluegill synonym or an active generic `crapet` row.

## Live catalog, ledger, and source-ID ownership

The live bundled catalog inspected for this review has **1,805 ingredient references and 154 forms**. The research ledger has **2,175 records**. The proposed reference ID, a `candidate-bluegill` ID, the exact display terms, the binomial, and a Bluegill form ID are unallocated across active references, forms, legacy identities, and ledger record IDs.

The CFIA `Blue` results URL is already present under narrow evidence owners for Bluefish and Blue Mussel: `WP04-SECTIONP-BLUEFISH-20261012-S02` on `ingredient-ref-bluefish`, and `WP04-BLUE-MUSSEL-20261011-S03` on the blue-mussel and mussel records. Those source descriptions address their named taxa, not Bluegill; do not reuse either source ID for this result. The OQLF Bluegill entry, the separate generic `crapet` entry, the Québec government species page, and the FinFish and Presteve product pages have no exact URL owner in the current ledger. The CFIA common-name guidance source `WP04-FINFISH-GAPS-20261010-S12` already exists and can be reused for its general naming scope. The new `WP04-SECTIONP-BLUEGILL-R581-20261017-S01`–`S06` identifiers below are proposal-local; none is registered in the shared ledger. As this is a hold, do not create a ledger record or source entry.

## Evidence, aliases, and bounded product scope

| Source ID | Source and evidence | Limits |
|---|---|---|
| `WP04-SECTIONP-BLUEGILL-R581-20261017-S01` | CFIA, [Fish List results for “Blue”](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?lang=e&q=Blue&wbdisable=true), retrieved 2026-10-17. The result lists TSN 168141, *Lepomis macrochirus*, family Centrarchidae, `Bluegill / Crapet Arlequin`. The query result carries a 2023-09-18 modification date. | Canadian accepted fish-label name and taxon evidence; not a recipe, retailer, cut, household portion, or interchangeability specification. The same result URL is owned elsewhere for different taxa, so this R581 ID remains local to this proposal. |
| `WP04-SECTIONP-BLUEGILL-R581-20261017-S02` | Gouvernement du Québec, [Crapet arlequin](https://www.quebec.ca/agriculture-environnement-et-ressources-naturelles/faune/animaux-sauvages-quebec/fiches-especes-fauniques/crapet-arlequin), page updated 2026-10-15. It gives the English `Bluegill`, French `Crapet arlequin`, and scientific name *Lepomis macrochirus*; lists French names `crapet à oreilles bleues` and `crapet commun à oreilles bleues`; and places it among Québec freshwater fishes. | Current wildlife/species identification, not a commercial label or proof of retail availability. Its local “up to about 300 g” statement is a maximum fish weight in named St. Lawrence waters, not edible portion, fillet mass, serving, purchase unit, or conversion. Do not use it as a culinary measure. |
| `WP04-SECTIONP-BLUEGILL-R581-20261017-S03` | OQLF, [crapet arlequin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8402505/crapet-arlequin), last updated 2004. It identifies *L. macrochirus* and gives preferred French terms `crapet arlequin` and `crapet à oreilles bleues`, with English `bluegill`, `bluegill bream`, `bluegill sunfish`, and `blue sunfish`. | Species and terminology evidence, not a food-product name or retail listing. Keep the secondary synonyms out of catalog aliases in this review because several contain broader search tokens. |
| `WP04-SECTIONP-BLUEGILL-R581-20261017-S04` | OQLF, [crapet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26556630/crapet), last updated 2019. It translates generic `crapet` as `panfish`, says the term is not taxonomic, and lists crapet-soleil, crapet arlequin, and crapet de roche as familiar Québec species. | Establishes the generic-name boundary; it does not define all fish grouped in each market use or make the species interchangeable. |
| `WP04-SECTIONP-BLUEGILL-R581-20261017-S05` | FinFish Inc., [Bluegill](https://www.finfishinc.net/products/bluegill), Canadian seafood-supplier product page, retrieved 2026-10-17. The listing identifies *L. macrochirus*, says farm-raised, and names Bluegill fillets (supplier code 501603) and Bluegill battered (code 501604), each displayed with `11 LB`. | Supplier/product evidence, not a Québec consumer SKU or bilingual product label. The page does not specify the per-fillet weight, count, case/inner-pack basis, or whether the battered product uses an identical fillet presentation. Keep each 11 lb value attached only to its displayed supplier item; do not derive a piece measure, portion, yield, density, or reusable conversion. |
| `WP04-SECTIONP-BLUEGILL-R581-20261017-S06` | Presteve Foods, [Sunfish](https://presteve.com/project/sunfish/), an Ontario supplier page, retrieved 2026-10-17. It says `Also known in Market as: Bluegill` and describes fresh wild sunfish. | The page does not give a scientific name and uses generic `Sunfish` as the product heading. Do not merge it with FinFish’s species-identified Bluegill listing or use generic `sunfish` as a Bluegill alias. No net mass, cut, or package amount is given. |
| Reused `WP04-FINFISH-GAPS-20261010-S12` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). CFIA says its Fish List collects French/English names for Canadian fish labels with taxon identifiers; the guidance describes name assignment and the list’s scope. | General Canadian labeling guidance, not a recipe identity rule, commercial availability guarantee, or ingredient substitution standard. |

The FinFish page confirms a current Canadian supplier listing for the species-specific product. Its two differently described 11 lb items do not resolve a Québec product name or support one fillet mass. Presteve’s broader `Sunfish` page is a separate, taxonomically unspecified market presentation. These retailer sources support keeping the name and product boundaries explicit; they do not repair the generic picker collision.

## Bilingual display and current picker projection

If this identity is reconsidered, use only the exact supported primary pair `Bluegill / crapet arlequin` with empty alias arrays. Do not add `panfish`, `sunfish`, `bluegill sunfish`, `blue sunfish`, `crapet`, `crapet à oreilles bleues`, or the long Bluegill synonyms as aliases. The generic English and French terms cover broader fish groupings, and synonym aliases would expand those broad searches.

Static projection used the current bilingual reference/form terms and the implementation in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete consecutive word phrases win; substring matching is the fallback. Adding the hypothetical display pair with no aliases produces:

| Query | Current result | With hypothetical `Bluegill / crapet arlequin` row | Assessment |
|---|---|---|---|
| `bluegill` | none | Bluegill | Specific English phrase works. |
| `crapet arlequin` | none | Bluegill | Specific Québec French phrase works. |
| `crapet` | none | Bluegill alone | **Unsafe generic singleton.** The matcher treats the first word of the species display as a complete phrase match. OQLF says the query is generic and non-taxonomic; a lone species result falsely resolves it. |
| `panfish` | none | none | Correctly remains unassigned because no English group identity is added. |
| `sunfish` | none | none | Correctly remains unassigned; neither supplier’s wording is added as a species alias. |
| `crapet de roche` / `crapet-soleil` | none | none | The display does not collide with these full phrases, but the unqualified parent query `crapet` still returns Bluegill alone. |

Do not add a `crapet` alias or a generic-group row as part of this one-candidate review. If future scope adds the generic panfish/`crapet` market group or improves search to expose broader ambiguity, reproject `crapet`, `panfish`, `sunfish`, and all qualified species names together before activating this identity.

## Bundle demand, measurements, and substitutions

A manifest-ordered scan of all **114 recipe files and 1,123 ingredient rows** searched each complete recipe file and ingredient-row text for `bluegill`, `crapet arlequin`, *Lepomis macrochirus*, `crapet à oreilles bleues`, `crapet`, `panfish`, and `sunfish`; it found **zero full-file hits and zero ingredient-row hits**. No recipe link or recipe-derived measure is supported.

FinFish’s listed **11 lb** amounts are supplier-item-specific values for codes 501603 and 501604. They establish no piece count, per-fillet weight, edible yield, standard portion, density, or conversion. Québec’s approximately 300 g maximum fish weight is ecological size information for named waters, not a purchase or serving measure. No density, household unit mapping, form-to-form conversion, package yield, cooking yield, or species-wide amount should be added.

FinFish’s general preparation language (fry, bake, or grill) and its mild-flavour description do not establish a directed, amount-backed replacement. No reviewed source validates Bluegill as a substitute for yellow perch, crappie, other sunfish, white fish, or any recipe ingredient under a defined dish, method, and role. Add no conversion, yield, substitution rule, warning, or recipe-line substitution.

## Bounded recommendation

Keep *Lepomis macrochirus* out of active references and the shared ledger in this review. The name pair is well-supported and Canadian supplier products exist, but the current picker would make the generic French query `crapet` resolve to Bluegill alone. The bundle provides no demand that justifies accepting this false singleton. Do not add `ingredient-ref-bluegill`, any alias, form, measurement, source record, recipe link, conversion, package/cooking yield, or substitution. Leave the finfish/regional-fish parent open.

Revisit with either (1) a picker change or a reviewed generic `panfish / crapet` market-group identity that prevents the bare French term from resolving to one species, or (2) another approved mechanism that preserves the generic query’s ambiguity. On reconsideration, keep Bluegill distinct from *Lepomis* species not covered here and from the supplier’s taxonomically broader `Sunfish` listing. The 11 lb item values remain attached to FinFish codes 501603 and 501604 only.

Root recorded this hold in the plan, roadmap, and [R581 integration README](../batches/wp04-bluegill-picker-boundary-hold-integration-r581-20261017/README.md). No catalog, ledger, manifest, recipe, or code data changed. No app tests, build, emulator, or deployment were run for this documentation-only review.
