# WP04 Section P — Dungeness crab cluster/section product identity review (R517)

- **Review and source-access date:** 2026-10-17.
- **Open checklist:** WP04 Section P, “Shrimp/prawn by meaningful preparation; crab and crayfish” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L6897)).
- **Gap selected:** the current Canadian Dungeness crab cluster product and its paired French title, left outside the earlier Dungeness species-only identity and separate from the R504 snow-crab section row.
- **Recommendation:** add one identity-only `PROTEIN` reference for **Dungeness crab clusters / sections de crabe dormeur**, representing this species-qualified section/cluster assembly. Add no taxonomic assertion, form, reusable measure, density, conversion, recipe link, yield, or substitution.
- **Status:** integrated on 2026-10-17; see the [R517 integration README](../batches/wp04-section-p-dungeness-crab-sections-identity-integration-r517-20261017/README.md).
- **Verification:** no software tests, build, emulator, or deployment were run because the catalog addition is database JSON data under `AGENTS.md`.

## Decision and proposed row

Costco Business Centre currently lists the Canadian item 2732946 in English as **Olivia Dungeness Crab Clusters** and in French as **Olivia — Sections de Crabe Dormeur**. Both language views identify the same 4.54 kg item, describe it as wild-caught and a product of Canada, and say to keep it frozen. The English and French pages are two views of one SKU, not independent product corroboration. The French page was available in current indexed content; direct retrieval returned a cache miss during this review. [S01–S02]

The English/French pair supports a bounded market product term, with the singular display forms below and the listing's exact plural names as search aliases. The existing Dungeness species identity already uses `Dungeness crab / crabe dormeur`; OQLF pairs those names, and DFO's current French species profile identifies *Metacarcinus magister* as `crabe dormeur`. The Costco product page itself gives no binomial, cooking state, or ingredient declaration. This proposal does not transfer scientific or preparation details from unrelated product records to the specific SKU. [reused `WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S01`, `R2-S02`; S01–S02]

The earlier Dungeness species review identified clusters as a different market presentation from whole crab, loose legs, and picked meat, but did not allocate a Dungeness-specific product identity. R450 made the same assembly boundary explicit for generic crab legs, and R504 has since added snow-crab sections. The present item is a distinct species-qualified product with its own current bilingual Canadian title; it should remain separate from the Dungeness species row and snow-crab section identity. [R2 proposal; R450 proposal; R504 proposal]

```json
{
  "id": "ingredient-ref-dungeness-crab-sections",
  "nameEn": "Dungeness crab cluster",
  "nameFr": "section de crabe dormeur",
  "aliasesEn": [
    "Dungeness crab section",
    "Dungeness crab clusters",
    "Dungeness crab sections"
  ],
  "aliasesFr": [
    "sections de crabe dormeur"
  ],
  "defaultDensity": null,
  "unitMappings": [],
  "category": "PROTEIN"
}
```

The plurals are the exact bilingual Costco product-title wording. `Dungeness crab sections` is the direct English counterpart of Costco's French `sections de crabe dormeur` for this same item. The singular English cluster/section phrases are number variants of those same paired product names, not separate product claims. Keep brand name `Olivia`, package size, wild-caught claim, frozen storage, and any cooking/readiness state out of the identity. Do not add bare `cluster`, `section`, `crab`, `crabe`, or species aliases beyond the product-qualified terms above.

## Product and species scope

- **Identity scope:** a Dungeness-crab cluster/section product, not an alias, form, or package yield on `ingredient-ref-dungeness-crab`.
- **Species evidence:** the product listing says Dungeness but does not give a scientific name. Reuse OQLF and DFO only to support the established Dungeness / `crabe dormeur` name pair; do not add a binomial to the new user-facing row.
- **Preparation state:** the item page says “keep frozen,” but does not say whether the crab was cooked before freezing. The older Costco consumer article discusses cooked Dungeness crab clusters, but that general preparation guidance does not establish the state of this specific SKU. Do not add `cooked`, `frozen`, `ready-to-eat`, or a cooking form to the reference.
- **Assembly boundary:** Costco's French consumer article describes clusters as multiple legs attached to part of the body. This supports the cluster/section boundary from loose crab legs; its older product guidance is not evidence of this SKU's exact assembly or cooking state. [reused `WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S08`]
- **Excluded:** whole Dungeness crab; picked Dungeness meat; generic crab meat and its canned/Jumbo Lump forms; generic crab legs; snow-crab sections/clusters; intact crab claws; and imitation crab products.

## Current snapshot and exact ownership

The proposal-review snapshot was recalculated after R514 and R515 and before the R518, R516, and R517 integrations. Those data additions do not overlap this crab-product boundary. The snapshot totals were:

| Live asset | Current content | Bytes; SHA-256 |
|---|---:|---|
| [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,789 references | 584,246; `4d529176b061ff9d1c23821e524e6db554e7be9bb7121b3bf17f05ecd20bfb53` |
| [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 143 forms | 113,370; `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json) | 56 candidates | 13,351; `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| [`research-ledger.v1.json`](../research-ledger.v1.json) | 2,146 records; 9,850 source entries; 8,337 distinct source IDs; 7,047 distinct URLs | 9,972,980; `db046eb36bc019eeb672e180b9ffcc8e0552f94fec6a3ffb28979fff0b52482e` |
| [`manifest.v1.json`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | 12,011; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The normalized ownership audit followed [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, folding of `œ`, `æ`, `ß`, and `&`, accent removal, punctuation-to-space conversion, and whitespace collapse. It checked reference names/aliases, form labels/match terms, all 56 legacy candidates, ledger record IDs and source IDs/URLs, plus the proposal/batch archive.

| Exact key or namespace | Existing owner | R517 result |
|---|---|---|
| `Dungeness crab`; `crabe dormeur` | `ingredient-ref-dungeness-crab`, species-only identity. | Retain; it is not a cluster/section product identity. |
| `ingredient-ref-dungeness-crab-sections`; the proposed bilingual full names and aliases | None at proposal review in references, forms, legacy candidates, or ledger record IDs. | The integration now assigns the reference ID and only the product-qualified English/French wording and number variants above. |
| `ingredient-ref-snow-crab-sections` and its aliases | R504 active identity for snow-crab sections/clusters. | Keep unchanged. It remains a second result for broad `cluster`, `section`, and crab-section searches after R517. |
| `ingredient-ref-crab-legs`; crab meat and its forms | Active loose-leg identity; `ingredient-ref-crab` plus canned and Jumbo Lump forms cover picked meat. | Keep unchanged; neither owns a Dungeness cluster/section assembly. |
| Proposed source-ID prefix `WP04-SECTIONP-DUNGENESS-CRAB-SECTIONS-R517-20261017` | No ledger or proposal/batch archive collision found at proposal review. | S01–S02 are now registered to the new record, each mapped to one URL. |
| Costco Business Centre English and French product URLs below | No exact URL owner at proposal review in the ledger or archive. | Two source mappings are now registered; both are language views for item 2732946, not independent products. |
| Reused DFO, OQLF, and Costco consumer-article URLs below | Already owned by `ingredient-ref-dungeness-crab` under R2-S02, R2-S01, and R2-S08, respectively. | Reuse those exact IDs/URLs; do not mint duplicate source IDs. |

No form ID, legacy mapping, ledger candidate, density, or unit mapping is proposed. The review does not reserve or update any shared ledger record.

### Archive and neighboring decisions

- The [R2 Dungeness identity proposal](wp04-section-p-next-fish-gap-review-20261013-round2.md) integrated only the species identity and explicitly left whole, legs/clusters, and picked meat as separate market presentations. It did not create or review a Dungeness cluster product row.
- The [R450 crab-legs proposal](wp04-section-p-crab-legs-product-boundary-review-r450-20261017.md) kept clusters/sections distinct from loose legs. The [R504 snow-crab review](wp04-section-p-next-seafood-review-r504-20261017.md) added the snow-crab assembly only; it did not allocate Dungeness clusters.
- The current [R508 dumpling hold](wp04-section-p-next-seafood-review-r508-20261017.md) and [R511 shrimp-ring hold](wp04-section-p-next-seafood-review-r511-20261017.md) concern different shrimp searches. R514 is canned sardines in tomato sauce and R515 is Oha leaves; none owns the terms, candidate ID, source URLs, or product in this proposal.
- Searches of the plan, roadmap, all proposal and batch filenames/content, active references/forms, legacy candidates, and ledger found no earlier focused Dungeness-cluster allocation or hold. Prior mentions of Dungeness clusters as an excluded presentation are context, not an active identity or form owner.

## Picker projection

This static projection applies the phrase-first and substring-fallback behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), over current reference and attached-form search terms, then adds the hypothetical row above. These are ingredient-reference result counts, not app/emulator observations.

| Query | Current | With R517 row | Interpretation |
|---|---:|---:|---|
| `Dungeness crab cluster`; `Dungeness crab clusters` | 0 | 1 | Exact species-qualified product lookup. |
| `Dungeness crab section`; `Dungeness crab sections` | 0 | 1 | The plural is the paired English counterpart of the French product title. |
| `section de crabe dormeur`; `sections de crabe dormeur` | 0 | 1 | Exact Québec French product lookup and its direct plural title. |
| `Dungeness crab`; `crabe dormeur`; `dormeur` | 1 | 2 | Species identity and named product stay visible as distinct choices. |
| `crab cluster(s)`; `crab section(s)`; `cluster(s)`; `section(s)` | 1 | 2 | Snow-crab and Dungeness assemblies remain separate choices; none becomes a singleton due to this addition. |
| `crab`; `crabe` | 11 | 12 | Existing broader crab choices remain multi-result. |
| `snow crab cluster`; `sections de crabe des neiges`; `crab legs`; `pattes de crabe` | Existing snow-crab-section or crab-leg owner | Unchanged | No species or product term is reassigned. |

No brand, generic `crab/crabe`, generic `cluster`, or unqualified crab section alias is added. The exact Dungeness queries become available while broad crab and assembly queries remain visibly multi-result.

## Recipe corpus, measures, and substitutions

The manifest-ordered scan parsed all **114 recipe files** and all **1,123 structured ingredient rows** (**753,988 recipe-file bytes**). It scanned every decoded recipe string and ingredient-row value for `Dungeness`, `crabe dormeur`, `crabe de Dungeness`, Dungeness cluster/section phrases, and French section wording. It found **zero candidate-phrase recipe files and zero candidate-phrase ingredient rows**. The only structured crab ingredient line is recipe `019`, row `#8`, `1 lb jumbo lump crab meat`, linked to `ingredient-ref-crab` / `ingredient-form-crab-jumbo-lump`; it does not request Dungeness crab or a cluster/section product. The corpus fingerprint is `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`, SHA-256 over each manifest path, NUL, exact recipe bytes, NUL in manifest order.

- **Forms:** Add none. A cluster/section is the named market assembly under review; the product page does not establish a cooked/frozen form relationship for the species row.
- **Measures and density:** Add none. The 4.54 kg is one SKU's package amount. Costco's page states “7–10 clusters per ounce,” an apparent anomalous count basis; do not normalize it, derive a count, or treat it as a reusable conversion. The older Costco article's cluster serving suggestions and whole-crab edible-yield estimate are consumer guidance, not a recipe-backed measure for this catalog.
- **Conversions and yields:** Add no package yield, edible yield, mass-per-cluster value, count mapping, or frozen/cooked conversion.
- **Substitutions:** Add no global or contextual substitution among Dungeness clusters, snow-crab sections, loose crab legs, picked crab meat, claws, other crab products, or crayfish. The bundle has no relevant method, role, amount, or dish context.
- **Recipe links:** Add none; no bundled row selects the product.

## Source register and exact source-ID ownership

Sources were checked on 2026-10-17. At proposal review, each new source ID mapped to one exact URL and each new Costco product URL was unowned. Integration registered both new mappings. The two Costco product pages are language views of one SKU. Existing DFO/OQLF/Costco consumer article IDs are reused under their existing owner, without creating a duplicate source ID.

| Source ID | Source and exact URL | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-DUNGENESS-CRAB-SECTIONS-R517-20261017-S01** | Costco Business Centre, [Olivia Dungeness Crab Clusters, 4.54 kg, item 2732946](https://www.costcobusinesscentre.ca/p/-/Olivia-Dungeness-Crab-Clusters%2C-4.54-kg/4201007193?langId=-24). | Current English Canadian product listing; title, item number, product-of-Canada and keep-frozen statements. No binomial, cooked state, or ingredient panel. The package amount and anomalous “7–10 clusters per ounce” entry are SKU-page claims only and are not reusable measures. Registered to the R517 record. |
| **WP04-SECTIONP-DUNGENESS-CRAB-SECTIONS-R517-20261017-S02** | Costco Business Centre, [Olivia — Sections de Crabe Dormeur, 4,54 kg, item 2732946](https://www.costcobusinesscentre.ca/p/-/Olivia-Dungeness-Crab-Clusters%2C-4.54-kg/4201007193?langId=-25). | Current indexed Québec French view gives the paired title and product details for the same SKU. Direct retrieval returned a cache miss; the source is used for its indexed title/content only. It is not an independent product observation from S01. Registered to the R517 record. |
| **Reused `WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S01`** | OQLF, [crabe dormeur (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198911/crabe-dormeur). | Pairs preferred Québec French `crabe dormeur` with English `Dungeness crab` and the older Latin name *Cancer magister*. Updated 1998; terminology evidence, not product-state evidence. Existing live owner: `ingredient-ref-dungeness-crab`. |
| **Reused `WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S02`** | Fisheries and Oceans Canada, [Crabe dormeur (*Metacarcinus magister*)](https://www.dfo-mpo.gc.ca/species-especes/profiles-profils/dungeness-crab-crabe-dormeur-fra.html). | Current French profile identifies the species and Québec/Canadian name; last modified 2026-06-09. Species evidence, not evidence that Costco's SKU states the binomial or cooking state. Existing live owner: `ingredient-ref-dungeness-crab`. |
| **Reused `WP04-P-DUNGENESS-CRAB-IDENTITY-20261013-R2-S08`** | Costco Canada, [Crabes dormeurs](https://www.costco.ca/f/-/connection-fyt-dungeness-crabs-june-2023?langId=-25). | Consumer article describes clusters as multiple legs attached to part of the body and uses French `grappes`. Page concerns general Dungeness-crab preparation, not current stock or the Olivia SKU; do not import its serving or yield values. Existing live owner: `ingredient-ref-dungeness-crab`. |

## Review record and limits

- Re-read `AGENTS.md`, the live global plan and roadmap, the R514 and R515 integration notes, R504/R450, the Dungeness identity proposal, and neighboring seafood decisions.
- Recomputed all current reference/form/legacy/ledger counts and hashes. Checked exact bilingual terms and candidate ID across active references/forms, all legacy candidates, the ledger, and proposal/batch archive.
- Verified current product wording against Costco Canada's English and French views, and checked species/Québec naming against DFO and OQLF. The English Costco product page opened; the French product page was available in indexed content but not directly retrievable in this web session.
- Reproduced picker results statically from the current `IngredientSearch.kt` matching algorithm and scanned the full manifest corpus. No software tests were run because the catalog addition is database JSON data under `AGENTS.md`.
- Main evidence limit: a single current bilingual retail SKU establishes product naming and sale in Canada, not general Québec inventory or universal composition, species documentation, cooking state, measures, or recipe equivalence. The recipe bundle contains no matching demand.

Integration added the one identity-only Dungeness cluster/section product row above. It remains distinct from the active Dungeness species identity, snow-crab sections, generic crab legs, picked crab meat, and other crab products. No form, measure, density, conversion, yield, recipe link, or substitution was added. Static package, ledger, generated-index, picker, corpus, and source-ownership checks are recorded in the [R517 integration README](../batches/wp04-section-p-dungeness-crab-sections-identity-integration-r517-20261017/README.md). WP04 Section P remains open.
