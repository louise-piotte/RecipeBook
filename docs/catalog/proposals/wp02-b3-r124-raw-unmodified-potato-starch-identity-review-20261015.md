# WP02 Section 04 B3 R124 — raw unmodified potato starch identity boundary

- **Reviewed:** 2026-10-15.
- **Status:** Integrated by root on 2026-10-15 as an identity-only reference with source records. See the [R124 batch README](../batches/wp02-b3-raw-unmodified-potato-starch-identity-integration-r124-20261015/README.md). The proposal's ownership snapshot below predates integration.
- **Open checklist:** Section 04 B3 remains open at “Water-chestnut flour and other documented regional starches.”
- **Scope:** The source-defined raw, unmodified potato-starch class and its overlap with the broader Canadian name `resistant potato starch`. This follows the modified potato-starch integration in R96 and the adjacent resistant wheat and high-amylose corn reviews in R122 and R123.
- **Proposal-local source-ID prefix:** `WP02-B3-RAW-UNMODIFIED-POTATO-STARCH-R124-20261015`; checked against the live ledger and proposal/batch archive with no collision found.

## Recommendation

Add one identity-only `FLOUR_AND_STARCH` reference for **raw unmodified potato starch / amidon non modifié de pommes de terre crues**, proposed as `ingredient-ref-raw-unmodified-potato-starch`. Keep both alias lists empty, `defaultDensity` null, and `unitMappings` empty. Add no forms, recipe links, conversions, yields, or active substitutions.

Health Canada lists two different potato resistant-starch classes. One is potato starch chemically phosphorylated to form cross-linked phosphorylated starch, and Health Canada also names that class `modified potato starch`. The other is made from raw potato tubers using conventional physical procedures without chemical modification, and the listed names include `raw unmodified potato starch`. Health Canada also gives the generic name `resistant potato starch` to both rows. Preserve the process-qualified raw/unmodified identity, but do not assign that ambiguous generic name as an alias to this proposed row or to the existing modified row. [S01–S02]

The exact English and French proposed displays follow Health Canada's table. Québec product evidence supports the term family: Marché Tau currently lists an in-stock fibre blend whose ingredients include `amidon résistant de pomme de terre (Solnul®)`. This is one branded ingredient inside a multi-fibre consumer product, not evidence that all resistant potato starches are unmodified RS2 or that the standalone ingredient is broadly available in Québec. A current French Carbonaut hamburger-bun label instead says `amidon résistant de tapioca et/ou de pomme de terre`, which leaves the source and grade open. These labels reinforce the need to keep the shared “resistant potato starch” wording unassigned. [S04, S07]

Do not merge this identity into `ingredient-ref-potato-starch`. The proposed row covers the Health Canada raw-tuber, physically processed class whose naturally resistant properties are to be preserved; the existing ordinary row remains the generic starch. Do not alter R96's `ingredient-ref-modified-potato-starch`. The proposal adds no product brand alias such as `Solnul` or `MSPrebiotic`. [S01–S05, S08]

### Proposed reference delta

```json
{
  "id": "ingredient-ref-raw-unmodified-potato-starch",
  "nameEn": "raw unmodified potato starch",
  "nameFr": "amidon non modifié de pommes de terre crues",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-15T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

## Existing identity and picker projection

At this review snapshot, the package has **1,469 references**, **105 forms**, and **1,810 research-ledger records** with **7,475 source entries**. The live catalog has distinct rows for ordinary potato starch, modified potato starch, potato flour, sweet-potato starch, and resistant wheat starch. No row uses the proposed ID or exact raw/unmodified displays. The focused R96 review had explicitly kept `resistant potato starch` out of the modified-potato alias set; no earlier focused raw/unmodified potato-starch decision was found. [S08]

The picker implementation normalizes accents, punctuation, and spacing; it prefers complete word-phrase matches and falls back to substrings only when there is no phrase match. Projection against the current reference/form data, adding the proposed row with empty aliases, gives:

| Query | Current result | With proposal |
|---|---|---|
| `raw unmodified potato starch` | None | `ingredient-ref-raw-unmodified-potato-starch` |
| `amidon non modifié de pommes de terre crues` | None | `ingredient-ref-raw-unmodified-potato-starch` |
| `resistant potato starch` | None | None; the wording is shared by Health Canada's two potato classes and remains unassigned |
| `amidon résistant de pomme de terre` | None | None; the Québec retail phrase is tied to one branded blend and is not generalized as an alias |
| `amidon résistant de pommes de terre` | None | None; Health Canada uses this generic name for both classes |
| `potato starch` | Modified potato starch; potato starch; sweet-potato starch; sweet-potato-starch noodles | Those four plus the proposed raw/unmodified row |
| `amidon de pomme de terre` | Modified potato starch; potato starch | Same two; the qualified proposed French name does not contain this phrase contiguously |
| `fécule de pomme de terre` | Modified potato starch; potato starch | Same two |

The broad English `potato starch` query gains a separate source-qualified choice. The federal raw/unmodified French display is directly searchable; the broader French potato-starch queries retain their current matches. Users searching only for the shared `resistant potato starch` wording will not be routed to either class until a specific product or process qualifier is known. This is the deliberate picker boundary.

## Canadian and Québec evidence

Health Canada's current English and French accepted-dietary-fibre pages (updated June 2021) define the two classes separately. The raw/unmodified row describes material derived from raw potato tubers by conventional physical procedures without chemical modification. It also recommends a warning that the naturally occurring resistant starch should not be exposed to high temperatures or added to food for cooking if its fibre properties are to be maintained. The other row is chemically phosphorylated, cross-linked starch derived from potato starch. These are federal class definitions, not proof that every product carrying a broad resistant-starch label belongs to one row. [S01–S02]

The Québec retailer listing for Mr. Regular Prébiotique Fibre was checked on 2026-10-15 and showed the product in stock. Its French ingredient statement names `amidon résistant de pomme de terre (Solnul®)` alongside psyllium, inulin, and other ingredients. This is useful local market wording and evidence that the named potato ingredient appears in a Québec-sold food product; it does not disclose its share, give a standalone starch package, or independently prove its processing class. [S04]

A Canadian clinical trial identifies the investigational Solnul™ ingredient as unmodified resistant potato starch, RS type 2, made by MSP Starch Products Inc. in Carberry, Manitoba. The paper reports stable 60% resistant-starch content for that named product. One author is affiliated with the manufacturer, so treat the process and composition statement as product-specific evidence rather than a universal property of the class. It links the named product in the Québec retailer listing to one raw/unmodified RS2 example, not to every product labelled `resistant potato starch`. [S05]

Rexall's Canadian listing has a 200 g `MSPrebiotic Prebiotic Resistant Potato Starch` powder, but its current page says out of stock. It supports Canadian product naming and package-format existence, not current availability in Québec or a live retailer offer. Carbonaut's current French Canadian page lists `amidon résistant de tapioca et/ou de pomme de terre` in a finished bun and instructs users to rely on the package for the most current ingredients. Its `and/or` source wording does not identify whether the potato starch is raw/unmodified or chemically modified. [S06–S07]

The proposed French display retains Health Canada's exact class wording. Québec retail wording uses `amidon résistant de pomme de terre` for Solnul, while OQLF's general potato-starch record prefers `fécule de pomme de terre` and also lists `amidon de pomme de terre`. No OQLF-specific term for the raw/unmodified resistant class was found; this proposal does not invent a `fécule` translation for it. [S02–S04]

## Corpus demand, numerical data, and substitutions

The manifest lists **114** recipe files containing **1,123** ingredient rows. Scanning all listed recipe JSON and ingredient rows found zero mentions of `raw unmodified potato starch`, `resistant potato starch`, their reviewed French wordings, `Solnul`, or generic potato starch/flour terms. There is no bundled recipe demand, candidate recipe link, or reason to relink an existing recipe.

- **Numeric implications:** The study's 60% resistant-starch result applies to Solnul™ in that study, not to every raw/unmodified potato-starch product; it is a composition result, not a density, serving conversion, or ingredient measure. The study's 3.5 g and 7 g daily supplement doses are trial doses, not culinary substitution amounts. Keep density null and add no kitchen unit mappings or other numeric behavior. [S05]
- **Forms:** Add no form. `Raw/unmodified` names a source/process-defined ingredient class and its resistant properties, not a reversible household preparation state. Health Canada's heating warning is use guidance, not a form conversion. [S01–S02]
- **Substitution:** Add no active same-ingredient form conversion or contextual substitution. The reviewed clinical use concerns supplementation; the Québec product and Carbonaut finished-food labels do not establish a mass-for-mass replacement, baking ratio, yield, or interchangeability with ordinary or modified potato starch. The federal warning specifically cautions against heating the naturally resistant starch when preserving its fibre properties. [S01–S07]

## Source register

| Source ID | Source and locator | Scope and limits |
|---|---|---|
| `WP02-B3-RAW-UNMODIFIED-POTATO-STARCH-R124-20261015-S01` | Health Canada, [*List of Dietary Fibres Reviewed and Accepted by Health Canada's Food Directorate*](https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-reviewed-accepted-dietary-fibres.html), updated June 2021, Table 1, “Resistant starches,” potato rows. | Primary federal accepted-fibre definitions for the raw/unmodified and chemically modified potato classes, including process and heat-warning wording; not product-specific market evidence. |
| `WP02-B3-RAW-UNMODIFIED-POTATO-STARCH-R124-20261015-S02` | Santé Canada, [*Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments*](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html), updated June 2021, Table 1, potato rows. | Official French class names are `amidon résistant de pommes de terre ou amidon non modifié de pommes de terre crues` and `amidon résistant de pommes de terre ou amidon modifié de pommes de terre`; same federal definitions, not independent review. |
| `WP02-B3-RAW-UNMODIFIED-POTATO-STARCH-R124-20261015-S03` | Office québécois de la langue française, [*fécule de pomme de terre* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357374/fecule-de-pomme-de-terre). | Québec terminology for generic potato starch and English translations; does not define resistant or raw/unmodified subclasses. |
| `WP02-B3-RAW-UNMODIFIED-POTATO-STARCH-R124-20261015-S04` | Marché Tau, [*Mr. Regular Prébiotique Fibre 231 g*](https://marchestau.com/mr-regulier-fibre-prebiotique-231gr), accessed 2026-10-15. | Current Québec listing marked in stock; ingredient list names `amidon résistant de pomme de terre (Solnul®)` in a fibre blend. Not a standalone starch package, amount disclosure, or process specification. |
| `WP02-B3-RAW-UNMODIFIED-POTATO-STARCH-R124-20261015-S05` | J. R. Bush et al., [“Consumption of Solnul™ Resistant Potato Starch Produces a Prebiotic Effect in a Randomized, Placebo-Controlled Clinical Trial”](https://pmc.ncbi.nlm.nih.gov/articles/PMC10097138/), *Nutrients* 15(7), 2023, sections 1, 2.1, and 5. | Primary randomized study identifies Solnul™ as unmodified RS2 from a Manitoba manufacturer and gives a product-specific 60% RS result. A study author is manufacturer-affiliated; doses and composition do not generalize to the class or establish cooking substitution. |
| `WP02-B3-RAW-UNMODIFIED-POTATO-STARCH-R124-20261015-S06` | Rexall, [*MSPrebiotic Prebiotic Resistant Potato Starch, 200 g*](https://shop.rexall.ca/store/rexall/products/27342196-msprebiotic-prebiotic-resistant-potato-starch-200-g), accessed 2026-10-15. | Canadian retail listing uses the generic product name and lists a 200 g powder, currently marked out of stock; not Québec-specific availability or class/process evidence. |
| `WP02-B3-RAW-UNMODIFIED-POTATO-STARCH-R124-20261015-S07` | Carbonaut Canada, [*Petits pains à hamburger Carbonaut Original*](https://carbonaut.fr/product/hamburger/), accessed 2026-10-15, French ingredient list. | Finished-bun ingredient wording is `amidon résistant de tapioca et/ou de pomme de terre`; it demonstrates source ambiguity and does not identify potato-starch process or grade. |
| `WP02-B3-RAW-UNMODIFIED-POTATO-STARCH-R124-20261015-S08` | Project history: [R96 modified potato-starch review](wp02-b3-r96-modified-potato-starch-review-20261014.md) and [R123 high-amylose corn-starch integration](../batches/wp02-b3-high-amylose-corn-starch-identity-integration-r123-20261015/README.md). | Establishes existing catalog boundaries and the previously excluded `resistant potato starch` alias; project history, not external identity evidence. |

## Static review checks

- Read `AGENTS.md`, the current Section 04 B3 checklist, the R96 modified-potato review, the R122 resistant-wheat review, the R123 high-amylose corn integration and proposal, active reference/form JSON, research ledger, package manifest, and picker search implementation.
- Confirmed the R124 source-ID prefix is absent from active ledger source IDs and the proposal/batch archive.
- Reproduced picker phrase-first/fallback behavior against the current reference/form data and the proposed row; the table records current and projected results.
- Scanned all **114** manifest-listed recipe files and **1,123** ingredient rows; candidate terms have no recipe hits.
- Verified the proposal file as UTF-8 without BOM and checked its local links and whitespace.
- No app, Gradle, instrumentation, emulator, or deployment tests were run; this is a proposal-only review with no database JSON changes.

## Integration disposition

Integrated identity-only `ingredient-ref-raw-unmodified-potato-starch` with empty aliases, null density, and empty unit mappings. Health Canada’s raw/unmodified and modified potato-starch classes remain distinct; generic `resistant potato starch` remains unassigned. The seven external sources S01–S07 are recorded on the ledger row; project-history source S08 remains proposal-local. No forms, recipe links, measures, conversions, yields, or active substitutions were added. Package totals are 1,470 references, 105 forms, and 1,811 ledger records / 7,482 source entries / 6,360 distinct source IDs. See the [integration record](../batches/wp02-b3-raw-unmodified-potato-starch-identity-integration-r124-20261015/README.md).
