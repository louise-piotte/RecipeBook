# WP03 Section I — Baru seed identity review

- **Reviewed:** 2026-10-12
- **Status:** proposal only; recommend an identity-only addition. No shared catalog, ledger, recipe, plan, roadmap, batch, code, or test file was changed.
- **Candidate:** baru seeds / graines de baru, the edible seed of *Dipteryx alata*
- **Scope:** one uncovered regional culinary seed identity in Section I. The fruit pulp, oil, meal, planting seed, and prepared products are outside this identity.
- **Testing:** no tests or emulator work; proposal-only research.

## Recommendation

Add one identity-only reference for the edible seed of *Dipteryx alata* using **baru seeds / graines de baru**. Kew accepts *D. alata* and records **baru** among its common names. Embrapa describes the species as a Cerrado leguminous tree and says its seed is edible. A Québec-facing retailer currently titles a product **GRAINES DE BARU 150g GRILLÉES** and uses **baru seeds** in its English product description. These sources support a distinct species-scoped seed identity and a directly attested local French product name. [S01–S03]

Use the seed wording in both displays. Do not classify this as a true botanical nut, alias it to peanut or almond, or imply allergen safety from a retailer’s “nut-free” marketing. The culinary category below supports finding this kernel among catalog nuts and seeds; it does not specify botanical family or allergen status.

Proposed identity fields:

| Field | Proposed value |
|---|---|
| ID | **ingredient-ref-baru-seeds** — no current ID collision; proposed, not reserved |
| Category | **NUT_SEED_AND_DRIED_FRUIT** |
| English display | **baru seeds** |
| French display | **graines de baru** |
| English aliases | none |
| French aliases | none |
| Default density / unit mappings | none / empty |

No alias is needed for the exact bilingual product wording. Keep **baru nut(s)**, **baru almond(s)**, **Brazilian almond**, **cumaru**, and **cumbaru** out of the aliases. The local retailer uses seed wording and explicitly distinguishes its product from almonds; Kew records **cumaru** for *D. odorata* as well as among vernacular names reported for *D. alata*, so it is not a safe species discriminator. Do not generalize the identity to the genus *Dipteryx*. [S01, S03, S06]

## Section I and prior-coverage check

The main Section I checklist still has an open item for additional melon-seed products and regional culinary kernels, alongside an open broader forms and pastes checklist. The plan now records the separate bunya-seed integration; baru is a different species in Fabaceae and is not covered by that entry. [S07]

Whole-word searches across the current plan, references, forms, legacy candidates, ledger, proposals, batches, and bundled recipes found no prior baru identity, alias, hold, proposal, batch, source, or recipe request. Terms checked included **baru**, **baru seed(s)**, **baru nut(s)**, **baru almond(s)**, **Brazilian almond**, *Dipteryx alata*, **baruzeiro**, **cumbaru**, **cumaru**, **castanha de baru**, **graine(s) de baru**, **noix de baru**, and **amande(s) de baru**. The proposed ID and source-ID prefix below have no live collision. The name boundary also keeps the candidate separate from active **Brazil nut / noix du Brésil**, **peanuts / arachides**, **nuts / noix**, and the recently integrated **bunya nuts / noix de bunya**. [S07]

## Live catalog, ledger, and recipe audit

Snapshot from the live split seed package and research ledger on 2026-10-12:

| Artifact | Live count | Candidate result |
|---|---:|---|
| Active ingredient references | 1,292 | No exact baru name, alias, or candidate ID owner |
| Active ingredient forms | 98 | No baru form or exact candidate phrase |
| Legacy-import candidates | 64 | No baru candidate ID, name, or alias |
| Research-ledger records | 1,600 | No whole-word baru or *Dipteryx alata* occurrence in record IDs or serialized record text |
| Ledger source entries / distinct source IDs | 5,768 / 4,793 | No collision with `WP03-I-BARU-SEEDS-IDENTITY-20261012-S01` through `S06` |
| Manifest recipes / ingredient rows | 114 / 1,123 | No baru recipe demand |

Exact-key checks used `normalize_search_key` across active reference IDs, names and aliases; form IDs, labels and match terms; legacy IDs, names and aliases; and ledger record IDs and serialized record text. No exact owner was found for **baru seeds**, **baru seed**, **graines de baru**, **graine de baru**, **baru nut(s)**, **baru almond(s)**, **Brazilian almond**, *Dipteryx alata*, **cumaru**, or **cumbaru**. `ingredient-ref-baru-seeds` is unassigned.

The full manifest-listed corpus was searched in every recipe file and ingredient row for the candidate and boundary phrases above. Result: **zero full-file hits and zero ingredient-row hits**. The corpus’s species-unspecified generic-nuts lines remain generic; no recipe link or relink is proposed.

## Identity and product boundaries

- **Species and edible part:** scope the row to the edible seed of accepted species *D. alata*. Embrapa reports the seed and mesocarp as edible; this proposal names only the seed and does not create a fruit-pulp identity. [S01–S02]
- **French and English names:** use **baru seeds / graines de baru**, both attested in a Québec-facing retailer’s product page. The listing’s title also says **grillées**, but roasting is product-specific wording and stays out of the base identity. No claim is made about current store stock from the page. [S03]
- **Aliases:** keep **baru nut**, **baru almond**, and **Brazilian almond** out of the alias arrays even though those labels appear in some research or retail contexts. The Québec page names the product as seeds and states that the kernel comes from a legume; an exact label is preferable to borrowed nut/almond synonyms that could imply a different botanical identity. [S03–S05]
- **Ambiguous regional names:** do not add **cumaru**. Kew lists it among reported vernacular names for *D. alata* and also names *D. odorata* as **cumaru / tonka bean**. This overlap prevents the term from identifying the proposed species by itself. Do not add **cumbaru** or tree-name **baruzeiro** as consumer aliases. [S01, S06]
- **Other products:** keep fruit pulp/mesocarp, seed oil, extracted meal or flour, and any prepared snack distinct from the whole-seed identity. No form or processed-product row is proposed in this review. [S02, S04]

## Measurements and substitutions

The Québec product page lists a **150 g** roasted package. That is retail net content, not a recipe amount. Embrapa’s analytical report presents compositional data on a per-100-g basis; laboratory composition is not a household-volume measure or a density. No count-to-mass value, cup weight, bulk density, de-shelling yield, cooking yield, default measure, unit mapping, or conversion is supported here. Keep all numeric fields empty or unknown. [S03–S04]

The retailer compares flavor or eating experience with peanuts, almonds, and cashews. Those are sensory/product statements, not a tested substitution ratio or evidence of equivalent recipe function. No source establishes direction, role, method, or adjustment; add no global or contextual substitution. [S03]

## Recommended integration delta

If accepted by the coordinator:

1. Add only `ingredient-ref-baru-seeds` in `NUT_SEED_AND_DRIED_FRUIT`, with **baru seeds / graines de baru**, no aliases, null default density, and empty unit mappings.
2. Add one identity-only ledger record with measurement state `researched_no_supported_value` and substitution state `researched_no_supported_substitute`; cite S01–S06 with the limits recorded below.
3. Add no forms, measurements, recipe links, conversions, yields, or substitutions. Keep the broader Section I seed/kernel and paste/butter checklists open.

## Source register

The source prefix below was checked against live ledger source IDs and is unused. IDs are proposal-local suggestions, not reserved ledger entries. Sources were checked on 2026-10-12.

| ID | Source and locator | What it supports and what it does not |
|---|---|---|
| **S01** | Kew Science, [Plants of the World Online: *Dipteryx alata*](https://powo.science.kew.org/taxon/492757-1), accepted name, family, native range; [general information](https://powo.science.kew.org/taxon/urn%3Alsid%3Aipni.org%3Anames%3A492757-1/general-information) for vernacular names. | Accepts *D. alata*, places it in Fabaceae, and records **baru** as a common name. It does not establish the Canadian retail name or a recipe measure. Its reported **cumaru** name is not used as an alias. |
| **S02** | Embrapa, [*Baru: biologia e uso*](https://www.infoteca.cnptia.embrapa.br/bitstream/doc/566595/1/doc116.pdf), English abstract, printed p. 50. | Describes *D. alata* as a Cerrado leguminous tree and identifies its seed and mesocarp as edible; it also notes seed use by rural families. It does not set a Canadian identity label, food-preparation rule, or kitchen measure. |
| **S03** | Nature Sante, [Graines de Baru 150g grillées](https://naturesante.ca/fr/products/baru-seeds-150g-roasted), current product title and description. | Québec-facing French product name **graines de baru**; its English description uses **baru seeds** and says the marketed item is a legume seed. The roast and 150 g package are product-specific. Retailer claims about digestibility, nutrition, and similarity to peanuts/almonds/cashews are not safety findings, measures, or substitutions; the page does not establish current stock. |
| **S04** | Revista do Instituto Adolfo Lutz, [Chemical composition of baru seed and oil (*Dipteryx alata*)](https://periodicos.saude.sp.gov.br/index.php/RIAL/article/view/35540), abstract. | Primary food-composition study of the named seed and its extracted oil. Its per-100-g chemical composition is lab data, not household measure or density; the paper’s food-use suggestion is not a kitchen-conversion standard. |
| **S05** | Canadian Intellectual Property Office, [Trade-marks Journal, Vol. 73, No. 3716](https://publications.gc.ca/collections/collection_2026/opic-cipo/RG42-2-73-3716-fra.pdf), French goods wording. | Uses **noix de baru préparées** and **graines de baru préparées** in a commercial-goods statement. This is trademark-list wording, not a package label, terminology ruling, or evidence that the alternative names should be aliases. |
| **S06** | Kew Science, [Plants of the World Online: *Dipteryx odorata*](https://powo.science.kew.org/taxon/492769-1/general-information), accepted species and vernacular-name fields. | Separately accepts *D. odorata* and records **cumaru / tonka bean**. Combined with S01, this shows why **cumaru** cannot distinguish the *D. alata* food identity. |
| **S07** | [RecipeBook global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt), Section I, and current WP03 seed/kernel proposals and batches. | Confirms the remaining regional-kernel checklist is open and that no previous review covers baru. This is scope evidence only. |

No source-backed baru kitchen measurement or tested substitution is transferred into catalog behavior. No tests or emulator checks were run because this packet is proposal-only work.
