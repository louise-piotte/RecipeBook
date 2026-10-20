# WP04 Section P — mustard herring product-identity review (R185)

- **Review and source-access date:** 2026-10-16.
- **Candidate:** Mustard herring / `hareng à la moutarde`, including current Canadian SILL SENAP, Feature Foods, and Appel products.
- **Recommendation:** **Add** an identity-only finished-food market group as `ingredient-ref-mustard-herring`, category `PROTEIN`. Leave aliases empty to avoid turning generic mustard-sauce queries into fish-product results; add no forms, reusable measures, mappings, conversions, yields, recipe links, or substitutions.
- **Scope:** Herring preserved or marinated with mustard sauce. This does not activate a universal marinated, pickled, canned, or mustard-sauce form and does not reopen the separate tomato-sauce, smoked-herring, Matjes, kipper, rollmops, or smoked-cod decisions.
- **Status:** Proposal-only. No shared catalog JSON, forms, ledger, legacy identities, generated Kotlin, recipe, plan, roadmap, batch README, or code was changed. No tests were run.
- **Proposal-local source IDs:** `WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S01` through `S05`. Each source ID below has exactly one URL; no ID has been allocated in the shared ledger.

## Why this is a distinct open gap

The open [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L6013) includes smoked, salt-cured, dried, canned, oil-packed, water-packed, and fermented seafood product states. It explicitly keeps generic preservation forms inactive while leaving exact product identities for review. This packet selects one documented mustard-herring product group.

The closest decisions remain separate: [R178 tomato-sauce herring](wp04-section-p-canned-herring-fillets-tomato-sauce-boundary-review-r178-20261016.md), [R180 smoked herring in oil](wp04-section-p-smoked-herring-fillets-in-oil-boundary-review-r180-20261016.md), [R166 Matjes](wp04-section-p-next-preserved-seafood-review-r166-20261016.md), [R45 rollmops](wp04-section-p-herring-rollmops-product-boundary-review-20261013-round45.md), [R179 chiktay](wp04-section-p-haitian-smoked-herring-chiktay-product-boundary-review-r179-20261016.md), and [R184 smoked cod](wp04-section-p-smoked-cod-market-boundary-review-r184-20261016.md).

- The R178 proposal and current `ingredient-ref-herring-fillets-in-tomato-sauce` row cover herring in tomato sauce.
- R180 covers smoked herring fillets in oil, with species and smoke details limited to its maker’s SKU.
- R166 holds generic Matjes herring because its Canadian products vary in salt, brine, and marinade presentation. R166 also cites an IKEA herring-plate page for its Matjes discussion; that page is not used as a source here and does not allocate SILL SENAP.
- R45 holds rollmops, whose defining rolled-pickle preparation differs from mustard herring.
- R179 holds Haitian chiktay, a variable herring or other-fish spread.
- R184 adds smoked cod / `morue fumée`, a different fish product and preservation boundary.

The archive contains no prior focused mustard-herring proposal or batch. The full proposal/batch Markdown archive was scanned for `mustard herring`, `herring in mustard sauce`, `herring fillets in mustard sauce`, `hareng à la moutarde`, `hareng sauce moutarde`, `filets de hareng à la sauce moutarde`, `SILL SENAP`, and `senapssill`; none of those candidate phrases has an earlier WP04 decision. The adjacent entries above were checked for their actual boundaries rather than treated as duplicate mustard-herring coverage.

## Terminology and current Canadian product evidence

The OQLF GDT gives **hareng à la moutarde** as its preferred Québec French term and **mustard herring** as the English equivalent. It defines the product as prepared like Bismarck herring except that mustard sauce is added instead of sweetened vinegar, and notes that it is sold canned or semi-preserved [S01]. This is a distinct prepared-fish product term, not a synonym for fresh herring served with a cooked mustard sauce.

Current Canadian and Québec-facing product pages show the term in more than one retail presentation:

| Source wording or product | Evidence | Limit |
|---|---|---|
| **SILL SENAP Marinated herring w mustard sauce / Hareng sauce moutarde**, item 901.010.33 | IKEA Canada’s English and French product pages identify the same 250 g item. They describe ready-to-eat herring pieces in creamy mustard sauce and explain that this herring is marinated in salt and vinegar before flavourings are added [S02–S03]. | The page does not identify the fish species or publish an ingredient list. It reports both net and drained weight as 250 g; treat that as a SKU page claim, not a general drained-yield rule. Dynamic store availability was not verified. |
| **Herring Fillets in Mustard Sauce**, UPC 063723121001 | Feature Foods’ current manufacturer page describes bite-sized marinated herring with Dijon mustard sauce and dill, with a Gulf of St. Lawrence/North Atlantic catch area and purse-seine method. The page says keep refrigerated and gives an eight-month shelf life [S04]. | It does not identify a species, package mass, or shared formula for other mustard-herring products. A catch area is not a taxonomic identification. |
| **Appel Filets de Hareng à la Sauce Moutarde**, 200 g | Walmart Canada’s French product listing shows a long-life 200 g can sold by Walmart, gives this French wording, and lists herring fillets with mustard sauce among the ingredients [S05]. | This Canadian page displays Mississauga pickup/delivery context, not Québec inventory. It does not identify a fish species or provide drained mass. The ingredient list and package state are SKU-specific. |

Together, OQLF’s product term and the different current Canadian product examples support a species-neutral **finished-food market group**. They do not support a single container, cure, marinade formula, storage state, or taxon. Do not name the catalog row `canned herring`: the IKEA product is a jarred marinated item and Feature Foods describes a refrigerated product. Keep each container and storage claim attached to its named SKU.

## Product boundary

| Nearby identity or wording | Disposition |
|---|---|
| Atlantic herring and Pacific herring | Keep as the existing species identities. None of the reviewed mustard-herring SKUs declares a scientific species; do not infer Atlantic herring from Feature Foods’ broad catch-area statement or map mustard herring to either species. |
| Herring fillets in tomato sauce | Keep as the distinct current `ingredient-ref-herring-fillets-in-tomato-sauce` row. Tomato sauce is not an alias or form of mustard sauce. |
| Smoked herring fillets in oil | Keep as the distinct current `ingredient-ref-smoked-herring-fillets-in-oil` row. The mustard products do not establish smoking, oil packing, or species. |
| Matjes, rollmops, kippers, and smoked herring | Keep separate. The reviewed sources do not establish mustard herring as a generic synonym for salt-cured, rolled-pickle, split-and-smoked, or smoked-oil herring. |
| Fresh herring served with mustard sauce | Keep outside this identity. A cooked fresh-fish dish with a mustard sauce is not the OQLF-defined canned/semi-preserved mustard-herring product. |
| Standalone mustard or mustard sauce | Keep as separate ingredient concepts. The mustard sauce is part of the prepared fish item; no sauce-only identity or recipe-line component relationship is proposed. |

Do not add `marinated herring`, `pickled herring`, `herring`, `hareng`, `sardine`, `SILL SENAP`, `Matjes`, `rollmops`, `kipper`, or generic `mustard sauce` as aliases. The canonical names already contain the broad herring terms; retailer wording should remain bounded to mustard-herring product titles.

## Exact ownership and archive audit

The live read-only snapshot contains **1,563 references, 122 forms, 61 legacy candidates, and 1,908 ledger records**. No exact normalized owner exists for `mustard herring`, `hareng à la moutarde`, `herring fillets in mustard sauce`, `hareng sauce moutarde`, `filets de hareng à la sauce moutarde`, `ingredient-ref-mustard-herring`, or the R185 source-ID prefix. The five candidate source URLs below are not currently owned in the shared ledger. The proposal-local source IDs remain unallocated.

| Current owner | Live state | Disposition |
|---|---|---|
| `ingredient-ref-atlantic-herring` | `Atlantic herring / hareng de l’Atlantique`; no aliases, no attached forms, and two ledger sources. | Preserve this raw species identity; do not attach unspecified mustard products to it. |
| `ingredient-ref-pacific-herring` | `Pacific herring / hareng du Pacifique`; no aliases, no attached forms, and five ledger sources. | Preserve this raw species identity; do not attach unspecified mustard products to it. |
| `ingredient-ref-herring-fillets-in-tomato-sauce` | `herring fillets in tomato sauce / filets de hareng à la sauce tomate`; no aliases, no attached forms, and two ledger sources. | Keep the separate tomato-sauce identity unchanged. |
| `ingredient-ref-smoked-herring-fillets-in-oil` | `smoked herring fillets in oil / filets de hareng fumés à l’huile`; no aliases, no attached forms, and three ledger sources. | Keep the smoked/oil-packed identity unchanged. |
| Legacy `ingredient-ref-mustard` | Generic mustard / `moutarde` candidate. | Keep as a standalone condiment candidate; it does not own a fish product or any proposed mustard-herring phrase. |
| `ingredient-ref-mustard-herring` and proposed phrases | No exact active reference, form label/match term, legacy candidate, ledger record, or ledger source ID. | New key and sources remain proposal-local until integration. |

The closest prior focused packets are linked above. The live data audit checked exact names and aliases, all form labels and match terms, legacy names and aliases, ledger record IDs and source IDs, plus the complete proposal/batch archive. R166’s IKEA herring-plate URL is not one of this proposal’s five source URLs, so this packet does not duplicate its source registration.

## Picker projection

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): lowercase/NFKD normalization, accent and punctuation folding, complete-word phrase matches first, then substring fallback only when there are no phrase matches. The candidate has no attached form terms or aliases. Its canonical names are `mustard herring / hareng à la moutarde`.

| Query | Current results | With hypothetical row | Effect |
|---|---|---|---|
| `mustard herring`; `hareng à la moutarde` | No exact product result | Mustard herring only | The canonical bilingual product term resolves to the new row. |
| `herring`; `hareng` | Atlantic herring, herring fillets in tomato sauce, Pacific herring, smoked herring fillets in oil | Same four plus mustard herring | Broad fish-name searches remain multi-result and display the preserved products separately. |
| `mustard`; `moutarde` | 13 English results; 11 French results | Same sets plus mustard herring | The product adds one expected match to broad mustard-word searches. |
| `herring fillets in mustard sauce`; `hareng sauce moutarde`; `filets de hareng à la sauce moutarde`; `mustard sauce`; `sauce moutarde`; `marinated herring`; `pickled herring`; `matjes`; `rollmops`; `SILL SENAP` | No exact result | No result | Product-title aliases would make shorter generic sauce phrases select this fish product. Keep those titles in source evidence and leave aliases empty. |
| `smoked herring`; `herring fillets in tomato sauce` | Smoked-herring-in-oil and tomato-sauce rows respectively | Same current product rows | The mustard identity does not absorb or rename adjacent preserved products. |

## Bundled-recipe demand

The manifest-ordered audit parsed all **114 listed recipe files** and **1,123 structured ingredient rows**, searched the complete UTF-8 recipe documents and ingredient-line fields for the candidate names and current market phrases, and also checked whole-word `herring` / `hareng`. It found **zero candidate hits and zero herring/hareng recipe hits**. No bundled recipe, ingredient amount, role, method, or recipe link selects mustard herring.

## Numeric and substitution evidence

- IKEA Canada reports **250 g net weight** and **250 g drained weight** for its SILL SENAP item [S02–S03]. Keep the unusual equality as that one product page’s wording; it is not a general drained yield, serving, or mass-volume measure.
- Walmart Canada lists the Appel can at **200 g** [S05]. This is a separate SKU and package amount, not a portion or conversion to the IKEA item.
- Feature Foods reports an **eight-month refrigerated shelf life** but no package mass or serving [S04]. This is storage context for that manufacturer’s item only.
- No reviewed product source supplies a common serving size, count weight, volume-to-mass mapping, density, drained-yield factor, or cooking yield. Do not add a measurement observation, reusable measure, or substitution rule. No reviewed source compares mustard herring with raw herring, tomato-sauce herring, smoked herring, Matjes, rollmops, or another fish as a substitute. Source pages recommending how to serve the fish are not substitution instructions.

If accepted, map the evidence into one identity record as follows:

| Ledger field | Proposed value |
|---|---|
| `recordId` / `recordType` | `ingredient-ref-mustard-herring` / `ingredient_reference` |
| `identityState` | `verified` |
| `measurementState` | `researched_no_supported_value` |
| `substitutionResearchState` | `researched_no_supported_substitute` |
| `sources` | One source object each for S01–S05, using its single registered URL, title, `accessedOn: 2026-10-16`, locator, and support/limit statement. Use `regional_authority` for S01, `manufacturer` for S04, and `other` for the retail sources S02, S03, and S05. |
| `measurementObservations` | `[]` |
| `substitutionFindings` | `[]` |
| `decisions` | One accepted decision with `sourceIds: [WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S01, WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S02, WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S03, WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S04, WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S05]`, explaining the species-neutral product boundary and empty-alias/no-form disposition. |

The reference row’s `updatedAt`, if integrated, would be `2026-10-16T00:00:00Z`. No separate form, package-yield record, recipe link, unit conversion, or substitution rule is proposed.

## Proposed reference mapping if accepted

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-mustard-herring` |
| `nameEn` | `mustard herring` |
| `nameFr` | `hareng à la moutarde` |
| `aliasesEn` | `[]` |
| `aliasesFr` | `[]` |
| `category` | `PROTEIN` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| `updatedAt` | `2026-10-16T00:00:00Z` |
| Forms, recipe links, conversions, yields, substitutions | None |

Leave aliases empty. Current market phrases contain generic components such as `mustard sauce` and `sauce moutarde`; storing those whole product titles as aliases makes those shorter queries select this fish product in the current picker. The canonical names retain the precise bilingual product term. Do not add unqualified `marinated herring`, `pickled herring`, or a brand alias.

## Source register

All pages below were accessed on 2026-10-16. Each source ID is assigned one URL only.

| Source ID | Source and locator | Supports | Limit |
|---|---|---|---|
| `WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S01` | Office québécois de la langue française, [GDT: hareng à la moutarde](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428372/hareng-a-la-moutarde), preferred term and definition; updated 1983. | Preferred Québec French term, English equivalent `mustard herring`, the mustard-sauce distinction, and canned/semi-preserved market scope. | Terminology, not a modern SKU specification, taxonomic identification, portion, or recipe equivalence. |
| `WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S02` | IKEA Canada, [SILL SENAP Marinated herring w mustard sauce](https://www.ikea.com/ca/en/p/sill-senap-marinated-herring-w-mustard-sauce-90101033/), title, item code, product text, net/drained weights. | Current Canadian 250 g product item 901.010.33, creamy mustard sauce, ready-to-eat wording, and salt/vinegar marination context. | No species or ingredient list; dynamic store inventory is not established. Its net/drained values are SKU-specific. |
| `WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S03` | IKEA Canada, [SILL SENAP Hareng sauce moutarde](https://www.ikea.com/ca/fr/p/sill-senap-hareng-sauce-moutarde-90101033/), French title, item code, product text, measurements. | Current Canadian French product wording for the same 250 g item; confirms `hareng sauce moutarde` and the page’s net/drained claims. | Does not identify species or establish stock availability at a particular Québec store. |
| `WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S04` | Feature Foods, [Herring Fillets in Mustard Sauce](https://featurefoods.ca/products/0-herring-fillets-in-mustard-sauce), UPC, product description, catch area, catch method, ingredients, storage and shelf-life lines. | A current manufacturer product with Dijon sauce and dill, broad catch area, and refrigerated shelf-life statement. | No scientific species, package mass, reusable amount, or universal formula. |
| `WP04-SECTIONP-MUSTARD-HERRING-R185-20261016-S05` | Walmart Canada, [Appel Moutarde Hareng Filets 200 g](https://www.walmart.ca/fr/ip/Appel-Moutarde-Hareng-Filets-200g/2KSTNDMCQVSH?classType=REGULAR), French title, details, can type, ingredients and package weight. | A Canadian listing for a 200 g long-life can, sold by Walmart, using `Filets de Hareng à la Sauce Moutarde` wording. | Retail listing rather than a Québec inventory guarantee; product formula and package amount are Appel-SKU-specific, and no species is named. |

## Reopen conditions

Reopen the boundary if a bundled recipe requests mustard herring in a different state, a current Québec package establishes a named species, or a recipe supplies a tested amount or replacement instruction. Recheck product availability before claiming local stock. Keep package mass, drained amount, marinade, storage, species, and serving suggestions tied to their own source and SKU unless separate evidence supports generalization.

## Recommendation

**Add** identity-only `mustard herring / hareng à la moutarde` as the species-neutral `PROTEIN` finished-food market group shown above. OQLF terminology and current Canadian product pages establish a useful product boundary. Keep aliases empty so store-title phrases containing generic `mustard sauce` / `sauce moutarde` do not make unrelated sauce searches return fish; the tradeoff is that those longer product titles remain unresolved picker searches. Keep it separate from raw herring species, tomato-sauce herring, smoked herring, Matjes, rollmops, kippers, and standalone mustard. The bundle has no matching demand; add no forms, measurements, recipe links, conversions, yields, or substitutions.
