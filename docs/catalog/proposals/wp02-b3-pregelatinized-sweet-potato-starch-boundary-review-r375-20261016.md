# WP02 Section 04 B3 — R375 pregelatinized sweet-potato-starch boundary review

- **Reviewed:** 2026-10-16.
- **Status:** Proposal-only bounded hold. This review creates this file only; no catalog or ledger JSON, plan, roadmap, batch README, recipe, code, or test file was changed.
- **Checklist fit:** WP02 Section 04 B3, the open item “Preserve whole-root flour versus extracted starch and raw versus pregelatinized/precooked product distinctions” at [the active plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L3232). The broader alternative-flour and regional-starch items remain open.
- **Recommendation:** Hold a separate identity for **pregelatinized sweet potato starch** outside active references and the ledger until a current Canadian human-food product and product-matched Québec French name are established. The product class and food use are source-supported, but the sources reviewed do not meet that local evidence threshold.
- **Possible future ID:** `ingredient-ref-pregelatinized-sweet-potato-starch` (unallocated; not reserved by this review).
- **Proposed source-ID prefix:** `WP02-B3-PREGEL-SWEET-POTATO-STARCH-R375-20261016` (S01–S04 only). These IDs remain proposal-local. The OQLF sources below are reused under their existing ledger IDs.

## Decision and scope

Pregelatinized sweet potato starch is a distinct processing product in food research: primary studies prepare it from native sweet potato starch and use it in noodle formulation. A current manufacturer page also advertises a product with the exact English name. China’s 2025 edible-starch standard, in an unofficial USDA translation, defines pregelatinized starch within edible modified starch and lists sweet potato among tuber-starch sources. This supports the existence of a real source-and-process candidate, separate from native sweet potato starch.

The Canadian and Québec evidence does not establish a standalone Canadian product or an exact Québec French product name. The product page is from a Chinese supplier, combines food and non-food applications, and provides no product specification or certification that would confirm the offered item is a human-food grade. OQLF supplies the existing Québec term `fécule de patate douce` for native starch and the generic term `amidon prégélatinisé`, but no source reviewed uses a sweet-potato-specific pregelatinized French product name. A constructed phrase such as `fécule de patate douce prégélatinisée` is understandable but remains an inference, not an attested Québec label.

Accordingly, do not add a reference, a `candidate-` ledger record, an alias, form, measurement, conversion, recipe link, yield, or substitution rule. This is a bounded hold on the pregelatinized sweet-potato-starch candidate, not on the existing sweet potato starch identity or the broader pregelatinized-starch category. It does not change the separate R363 tapioca-starch hold or the integrated potato, rice, wheat, corn, and waxy-maize product classes.

## Product and naming boundaries

| Candidate phrase or related item | Disposition | Evidence and boundary |
|---|---|---|
| `pregelatinized sweet potato starch` | Hold outside active references and ledger. | Primary food studies establish the processed material and food use; one supplier advertises that exact product name. No current Canadian human-food product with a product-matched Québec name was verified. [S01–S04] |
| Possible English display `pregelatinized sweet potato starch` | Working name only; do not allocate. | Follows the research and supplier wording. Do not copy the supplier’s grade, process settings, functional claims, or broad non-food use into a general identity. [S01–S03] |
| Possible Québec French display `fécule de patate douce prégélatinisée` | Descriptive reviewer construction only; do not add. | OQLF attests the base term `fécule de patate douce` and generic `amidon prégélatinisé`. Neither attests this compound or a sweet-potato-specific pregelatinized starch label. [reused OQLF sources S05–S06] |
| `sweet potato starch / fécule de patate douce` and existing alias `amidon de patate douce` | Keep on `ingredient-ref-sweet-potato-starch`. | This row represents the unqualified native/extracted starch identity and remains distinct from its pregelatinized derivative. Do not transfer its name ownership or product scope. |
| `sweet potato starch noodles / nouilles à base de fécule de patate douce` | Keep on `ingredient-ref-sweet-potato-starch-noodles`. | Finished noodles remain a prepared starch product, not the loose pregelatinized ingredient. |
| `modified starch`, `modified sweet potato starch`, `instant starch`, `precooked starch` | Do not add as aliases. | The reviewed sources do not establish these broad phrases as exact synonyms for the proposed source-and-process scope. The manufacturer’s description of its product as “modified” is product-page wording; the Chinese standard’s definition applies to edible pregelatinized starch under its own jurisdiction and does not establish a Canadian search synonym. |
| Whole sweet potato flour, whole roots, potato starch, and other pregelatinized starch sources | Keep separate. | Whole-root flour differs from extracted starch; ordinary potato starch is another botanical source. Existing pregelatinized potato, rice, wheat, corn, and waxy-maize references retain their exact source boundaries. |

If reopened after stronger local product evidence, evaluate it as a separately named, source-qualified B3 starch identity, consistent with the current source-specific pregelatinized starch rows. Do not treat “precooked,” “instant,” or “native” as synonyms without matching product evidence. No study-specific process, viscosity, water-absorption, or formulation value supports a reusable kitchen measure or substitution rule.

## Evidence register

Sources were checked online on 2026-10-16. New source URLs and the new source-ID prefix were checked against the current ledger and proposal/batch archive before this file was created; see the ownership audit below.

| ID | Source and evidence | Limit |
|---|---|---|
| **S01 — new: `WP02-B3-PREGEL-SWEET-POTATO-STARCH-R375-20261016-S01`** | Jiahe Energy, [Pregelatinized Sweet Potato Starch](https://www.jiahestarch.com/pregelatinized-starch/pregelatinized-sweet-potato-starch.html). The current indexed manufacturer page names the product, says it is made from native sweet-potato starch by high-temperature gelatinization, drying, and pulverization, and mentions certain food-processing uses. | The page also lists feed, foundry, building-material, handicraft, and papermaking applications. It gives no human-food grade specification, certification, full technical sheet, Québec label, or Canadian availability. Direct page retrieval returned a cache miss; wording was limited to the current indexed product-page text. This is not evidence of a Canadian product. |
| **S02 — new: `WP02-B3-PREGEL-SWEET-POTATO-STARCH-R375-20261016-S02`** | Ding et al., [“Development of noodles with high highland barley flour incorporation level with proteins and pre-gelatinized flour/starch”](https://doi.org/10.1111/ijfs.16547), *International Journal of Food Science & Technology* 59(2), 2024; first published 2023. The primary study identifies pre-gelatinized sweet potato starch as an input to highland-barley noodles. | The noodle formulation establishes a food-science use, not a Canadian product, retail label, general category specification, household measure, or transferable substitution. The publisher page returned 403 during direct retrieval; the journal metadata and abstract were available in search results. |
| **S03 — new: `WP02-B3-PREGEL-SWEET-POTATO-STARCH-R375-20261016-S03`** | dos Santos, Franco, and Leonel, [“Gelatinized sweet potato starches obtained at different preheating temperatures in a spray dryer”](https://doi.org/10.1016/j.ijbiomac.2019.11.105), *International Journal of Biological Macromolecules* 149 (2020), 1339–1346. The primary study gelatinizes native sweet potato starch, spray-dries it, and compares process-specific products. | It supports a distinct processed starch material and laboratory production. It does not define a standardized retail class, a commercial human-food grade, Canadian availability, Québec terminology, or a recipe conversion. Publisher full-text retrieval returned 403; the article preview and abstract were available. |
| **S04 — new: `WP02-B3-PREGEL-SWEET-POTATO-STARCH-R375-20261016-S04`** | USDA Foreign Agricultural Service, [National Food Safety Standard Edible Starch Finalized, CH2025-0082](https://apps.fas.usda.gov/newgainapi/api/Report/DownloadReportByFileName?fileName=National+Food+Safety+Standard+Edible+Starch+Finalized_Beijing_China+-+People%27s+Republic+of_CH2025-0082.pdf), 2025, translation of China’s GB 31637-2025. Sections 2.1–2.3 define edible starch, include pregelatinized starch as edible modified starch, and list sweet potato among tuber-starch sources. The standard became effective in China on 2026-03-16. | USDA labels its translation unofficial and directs stakeholders to review the regulation themselves. The standard supports the class boundary in China; it is not Canadian regulation, does not set a Québec name, and does not separately certify the Jiahe product. Combining the general pregelatinized class and sweet-potato source category is broader than a product-specific Canadian specification. |
| **S05 — reused; no new ID** | OQLF, [fécule de patate douce (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287217/fecule-de-patate-douce). Existing ledger source ID: `WP02-B2-SWEETPOTATO-STARCH-ALIAS-20261012-S01`. The entry gives `fécule de patate douce` and defines the industrial product as wet-extracted starch from *Ipomoea batatas*. | The entry credits AFNOR (1979) and names native/extracted sweet-potato starch; it does not cover a pregelatinized product or its French compound name. |
| **S06 — reused; no new ID** | OQLF, [amidon prégélatinisé (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357585/amidon-pregelatinise). Existing ledger source ID: `WP02-B3-PREGELATINIZED-RICE-STARCH-R125-20261015-S03`. The entry supports the generic Québec terminology and spelling variants for pregelatinized starch. | The term is generic and does not establish `fécule de patate douce prégélatinisée`, a sweet-potato-specific compound, or any product-market availability. |

The evidence supports three bounded conclusions: (1) sweet potato starch can be physically pregelatinized; (2) pregelatinized sweet potato starch has been used in a food formulation; and (3) one current supplier advertises a similarly named product. The evidence does **not** demonstrate an in-scope Canadian human-food product or an attested Québec French product name. The conclusion is a gap-specific hold, not a market-wide absence claim.

## Current ownership, source uniqueness, and picker audit

Read-only snapshot taken 2026-10-16:

| Surface | Snapshot | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,698 | `b18f0d523b37ee2ef087f9cf2dbb7074537a6f07f87abb8867bcc61a05790b7d` |
| Ingredient forms | 141 | `2b35ba0b1601fa862276f8d2315704126c7883dc2f60da92fd359e51f76de9ed` |
| Research ledger | 2,054 records; 9,248 source entries; 7,824 distinct source IDs; 6,547 distinct URLs | `fe7b0a0ae84edad3565d07b46201ed1086fa91de0a3c02730564367d6a32c80d` |
| Legacy import candidates | 56 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| Manifest-listed recipe corpus | 114 recipes; 1,123 ingredient rows | Ordered corpus fingerprint `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

The active `ingredient-ref-sweet-potato-starch` is `sweet potato starch / fécule de patate douce`, with alias `amidon de patate douce`, null density, empty unit mappings, and no attached forms. The related `ingredient-ref-sweet-potato-starch-noodles` is a separate finished product. No active reference, form, legacy candidate, or ledger record owns `ingredient-ref-pregelatinized-sweet-potato-starch` or the exact pregelatinized sweet-potato-starch phrases checked below. The broad unqualified phrases `sweet potato starch`, `fécule de patate douce`, and `amidon de patate douce` are already owned by the generic starch row; keep them there rather than transferring them to a hypothetical pregelatinized row.

The exact-term audit checked these candidates and spellings against active reference names and aliases, form labels and match terms, legacy candidates, ledger record IDs and names, and the proposal/batch archive: `pregelatinized sweet potato starch`, `pre-gelatinized sweet potato starch`, `pregelatinised sweet potato starch`, `gelatinized sweet potato starch`, `fécule de patate douce prégélatinisée`, and `amidon de patate douce prégélatinisé`. No exact owner or prior focused proposal/batch decision for this candidate was found. Nearby pregelatinized-starch work is source-specific to potato, rice, wheat, corn, waxy maize, and tapioca; this review neither repeats nor changes those decisions.

The new IDs `WP02-B3-PREGEL-SWEET-POTATO-STARCH-R375-20261016-S01` through `S04` were absent from the ledger’s source IDs and prior proposal/batch text before drafting. The four new URLs in S01–S04 were absent from the ledger and proposal/batch archive. OQLF URLs in S05–S06 already have the source IDs listed in the table; they are reused, not reassigned. The possible future reference ID is absent from active references, forms, legacy candidates, and ledger record IDs. No source or catalog ID is allocated by this proposal.

The picker projection follows `IngredientSearch.kt`: it normalizes case, accents, and punctuation, returns complete word-phrase matches before substring fallback, and includes forms in reference search. It is a static projection from current names/aliases plus the possible future bilingual display, not a live picker test.

| Query | Current result | If later added with only the proposed bilingual display and no aliases/forms | Boundary |
|---|---|---|---|
| `pregelatinized sweet potato starch` | None | Candidate row only | Exact English name. |
| `fécule de patate douce prégélatinisée` | None | Candidate row only | Exact descriptive French construction; it is not yet an attested Québec product name. |
| `sweet potato starch` | Existing generic sweet potato starch and sweet potato starch noodles | Those two plus candidate row | Qualified family query exposes native starch, noodles, and the new processing candidate separately. |
| `fécule de patate douce` | Existing generic sweet potato starch and sweet potato starch noodles | Those two plus candidate row | French family query retains the native-starch and finished-noodle choices. |
| `potato starch` | Six existing potato/sweet-potato starch-related results, including the unqualified and pregelatinized potato rows | Those six plus candidate row | The current phrase-first matcher already returns sweet-potato results for this broad phrase; the added row would remain visibly qualified as sweet potato. |
| `pregelatinized starch` | None | None | Do not add a source-neutral alias. |
| `pre-gelatinized sweet potato starch` / `pregelatinised sweet potato starch` | None | None | These spellings would need an explicit source-backed alias decision; they are not automatically normalized to the single-word English display. |

## Recipe demand, measurements, and substitution

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned using the bundle snapshot above. The scan checked the exact candidate phrases and spelling variants in English and French, the base terms `sweet potato starch`, `fécule de patate douce`, and `amidon de patate douce`, and the proposed future reference ID. There were **zero ingredient-row hits and zero full-recipe text hits**. No row links to `ingredient-ref-sweet-potato-starch`; no recipe link or relinking is proposed. This describes the bundled corpus only, not external recipe demand.

The source studies report process- and sample-specific pasting, swelling, water absorption, viscosity, and noodle-formulation behavior. They do not establish a household density, volume-to-mass mapping, general yield, or reusable flour/starch replacement ratio. If a local product later qualifies for identity integration, research its measurements and substitutions independently against that actual product. Keep `defaultDensity` null and unit mappings, forms, recipe links, and substitution rules empty unless separate evidence supports them.

## Reopen threshold

Reopen this hold when a current Canadian or Québec source identifies pregelatinized sweet potato starch as a human-food product, provides a product-matched French label or authoritative Québec terminology support, and clarifies whether the grade is physical pregelatinization without chemical modification or a broader modified-starch product. Preserve native sweet potato starch and sweet-potato-starch noodles as separate identities. Do not infer Canadian availability from the international manufacturer listing or transfer a Chinese product description into a Québec display.

No tests, build, emulator run, package normalization, or shared-data edit was needed or performed for this proposal-only review.
