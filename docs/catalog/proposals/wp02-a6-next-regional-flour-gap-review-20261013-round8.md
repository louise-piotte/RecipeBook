# WP02 A6 Round 8: `jowar atta` alias for sorghum flour

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only; root owns any integration.
- **Scope:** Review the exact English flour phrase `jowar atta` for the existing sorghum-flour reference. This does not reopen the integrated `jowar flour` alias or the grain and semolina identities.
- **Plan/archive:** The active A6 checklist remains open for regional grain flours. The 2026-10-12 jowar-flour review explicitly left `jowar atta` out because its then-reviewed FSSAI and mill sources established `jowar flour`, not this exact phrase. This review records new direct evidence for the still-unowned phrase; it does not change that earlier decision for `jowar flour`. The round-seven `quinua` integration and other completed/held A6 entries remain untouched.
- **Recommendation:** **Integrate only `jowar atta` as an English alias** on `ingredient-ref-sorghum-flour`. Retain `sorghum flour / farine de sorgho`, the existing `jowar flour` alias, empty French aliases, no forms, null density, empty unit mappings, and the unresearched measurement/substitution states. Do not add bare `jowar`, `sorghum atta`, `jowar rich multigrain atta`, `farine de jowar`, or a new flour identity.

## Identity and ownership

ICAR–Indian Institute of Millets Research (IIMR) publishes a product section headed “JOWAR ATTA” and describes it as “Sorghum flour (atta)” made through milling [S01]. Two independent Canadian retailer pages pair the exact phrase with sorghum flour: Namaste Supermarket in Mississauga calls its product “Bloom Organic Jowar Atta” and describes it as “or Sorghum Flour” [S02]; Neelam Foodland Canada's product title is “Sorghum Flour/Jowar Atta” [S03]. FSSAI's existing flour standard separately defines “Jowar Flour (Sorghum Flour)” as a product milled from *Sorghum bicolor* [existing S04]. Together these support a narrow synonym for the current sorghum-flour milling product.

IIMR's booklet also describes its particular Eatrite Jowar Atta as made from whole grains, while its milling description refers to separating bran and germ from the endosperm. That source does not establish a consistent extraction specification for every product called `jowar atta`; the Canadian listings do not specify extraction. Therefore the alias identifies the sorghum-flour product class only. It does not claim that every jowar atta is whole-grain, refined, a particular brand, or equivalent to the distinct “Jowar rich multigrain atta” product described by IIMR. Keep that multigrain product and any process-qualified flour outside this alias decision.

The current canonical owner is `ingredient-ref-sorghum-flour` (`sorghum flour / farine de sorgho`, category `FLOUR_AND_STARCH`). The exact normalized phrase `jowar atta` has no owner among active references, forms, legacy candidates, or ledger record IDs. It does appear in the prior jowar-flour proposal and accepted ledger decision as a phrase left outside scope; those mentions are documentation, not picker ownership. No separate `ingredient-ref-jowar-atta` or legacy candidate is warranted.

| Wording | Recommendation and owner | Boundary |
|---|---|---|
| `jowar atta` | Add to `ingredient-ref-sorghum-flour.aliasesEn`. | Exact primary and Canadian retail wording maps the phrase to sorghum flour. |
| `jowar flour`, `sorghum flour`, `farine de sorgho` | Retain on the existing sorghum-flour reference as currently stored. | The first is already the accepted English alias; the other two are the display pair. |
| bare `jowar` | Do not add to the flour reference. | The picker already keeps the grain, flour, and semolina distinct for this broad query. |
| `jowar whole`, `jowar rava` | Leave on their current owners: grain sorghum and sorghum semolina, respectively. | No ownership changes. |
| `sorghum atta` | Do not add in this scoped change. | IIMR uses it in one product-specific nutritional heading; this proposal adds only the regionally qualified phrase with direct Canadian retail pairing. The canonical `sorghum flour` query already resolves the row. |
| `jowar rich multigrain atta` | No owner proposed. | IIMR describes a separate blend containing jowar, wheat, ragi, black gram, and fenugreek. Do not map that full product to plain sorghum flour. |
| `farine de jowar` and `farine de jowar atta` | Do not add French aliases. | Québec French remains `farine de sorgho`; no French regional display is proposed. |

## Exact proposed catalog delta

Add this one string to the existing row's English aliases:

```json
"aliasesEn": ["jowar flour", "jowar atta"]
```

No other catalog field or record is proposed to change. In particular, keep `aliasesFr: []`, `defaultDensity: null`, `unitMappings: []`, and the existing `updatedAt` convention for root's integration.

## Picker projection and form behavior

Projection uses the current `normalizeIngredientSearchKey` rules in `IngredientSearch.kt`: lowercase with `Locale.ROOT`, Unicode NFKD and accent/ligature folding, punctuation to spaces, then whitespace collapse. Exact phrase matches are preferred; the picker then falls back to substring matching. Static projection over all 1,341 references and 98 forms gives:

| Query | Current picker result | After proposed alias |
|---|---|---|
| `jowar atta` (also `Jowar-Atta`) | No result | `ingredient-ref-sorghum-flour` only |
| `jowar flour` | `ingredient-ref-sorghum-flour` only | Same |
| `jowar` | grain sorghum; sorghum flour; sorghum semolina | Same three results |
| `jowar whole` | grain sorghum only | Same |
| `jowar rava` | sorghum semolina only | Same |
| `sorghum flour` | sorghum flour only | Same |
| `farine de sorgho` | sorghum flour only | Same |
| `atta` | 8 references, including the generic atta row | 9 references; adds only sorghum flour |
| `sorghum atta` | No result | No result |
| `farine de jowar` | No result | No result |

The target has no attached forms, so `jowar atta` returns the ingredient reference without a form hint. The alias does not add `jowar` as a standalone key or alter ownership of grain sorghum and sorghum semolina.

## Québec French boundary

Keep the existing French display `farine de sorgho` and `aliasesFr: []`. The existing OQLF GDT source says `sorgho` is the preferred Québec French term for the species and gives English `sorghum` [existing S06]. The existing Codex standard names the flour in French as `farine de sorgho` [existing S07], and a Canadian French retailer uses that display for a jowar-flour product [existing S08]. These sources support the current label; none requires translating the Indian English word `atta` into French or adding `farine de jowar`.

## Measurements and substitutions

The live target remains `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. It has no attached forms, no measurement observations, no substitution findings, `defaultDensity: null`, and `unitMappings: []`.

- **ICAR–IIMR [S01]:** Its one-kilogram product package is a product pack size, and its nutrition table is stated per 100 g. Neither is a household measure, portion conversion, density, or unit mapping. Its roti instructions say to add an “appropriate quantity” of hot water but give no tested ratio. Do not convert these details into active numeric data.
- **Namaste and Neelam [S02–S03]:** The displayed 2 lb and 500 g quantities are package sizes. Neelam marked its listing sold out when checked; no availability claim is made. No cup-to-mass value or recipe ratio is supplied.
- **FSSAI [existing S04]:** Regulatory moisture percentages and sieve/particle-size criteria are flour-quality specifications, not recipe measures or density values.
- **Substitution:** None of these sources establishes a reusable flour replacement ratio or a contextual rule. Do not add a form conversion, density, unit mapping, yield, global substitution, contextual substitution, or recipe-line substitution. Keep measurement and substitution research open.

No new observation ID or substitution `findingId` is proposed. No new form ID, conversion ID, or ingredient identity ID is proposed.

## Recipe demand

The scan covered every path in `manifest.v1.json`: **114 recipe files and 1,123 ingredient rows**. The corpus fingerprint is `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`, calculated from each manifest-ordered relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte.

The following terms each have **0 recipe-file hits and 0 ingredient-row hits**: `jowar atta`, `jowar ka atta`, `sorghum atta`, `jowar flour`, `jowar`, `sorghum flour`, and `farine de sorgho`. There are **0 direct `ingredientRefId` links** to `ingredient-ref-sorghum-flour`. The alias addresses picker coverage only; do not change recipe text, links, quantities, or form data.

## Source register and collision audit

The new proposal-local source IDs below were checked against every source ID in the live ledger and all text files under `docs/catalog`; each had zero existing ledger entries and zero archive occurrences before assignment. Existing source IDs are reused evidence and are not proposed for re-registration. No new measurement observation ID or substitution finding ID is proposed.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP02-A6-JOWAR-ATTA-ALIAS-20261013-R8-S01** | ICAR–Indian Institute of Millets Research, [*Technologies of Millet Value Added Products*](https://www.millets.res.in/technologies/Technologies_of_millet_value_added_products.pdf), printed June 2016, §II, “Eatrite Products Already Commercialized,” item 1, “Jowar Atta,” printed pp. 34–35 (PDF pp. 35–36). | Primary institutional product terminology. The section heading is `JOWAR ATTA` and the description calls it “Sorghum flour (atta).” It supports the exact flour phrase and broad milling-product identity. Its brand-specific whole-grain description and unclear extraction wording are not generalized. Pack and nutrition values are not RecipeBook measures. `sourceKind: regional_authority`. |
| **WP02-A6-JOWAR-ATTA-ALIAS-20261013-R8-S02** | Namaste Supermarket, Mississauga, [Bloom Organic Jowar Atta 2 lb](https://namastemississauga.ca/products/bloom-org-jowar-atta-2lb/019a58c3-b004-788c-ada8-d6778e89d4ae), product title, description, and Flour & Grains / Alternative Flours category; checked 2026-10-13. | Current Canadian retailer page explicitly describes the product as “Jowar Atta, or Sorghum Flour.” It is retail wording, not a standard or manufacturer specification; no stock claim or package conversion is inferred. `sourceKind: other`. |
| **WP02-A6-JOWAR-ATTA-ALIAS-20261013-R8-S03** | Neelam Foodland Canada, [Sorghum Flour/Jowar Atta 500 Gm](https://neelamfoodlandca.com/products/sorghum-flour-jowar-atta-500-gm), product title and Canadian storefront; checked 2026-10-13. | Independent Canadian retailer title pairs the exact regional name with sorghum flour. The page marked the product sold out; this is nomenclature evidence only, not availability, contents, or a kitchen measure. `sourceKind: other`. |
| Existing **WP02-A6-JOWAR-FLOUR-20261012-S01** | FSSAI, [Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), Version 4 (2025-05-07), §2.4.18, PDF p. 58. | Reuse the live-ledger primary standard. It defines Jowar Flour (Sorghum Flour) from *Sorghum bicolor*; its quality limits are not recipe conversions. It supports the target identity, not by itself the `atta` alias. |
| Existing **WP02-A6-JOWAR-FLOUR-20261012-S02** | Puremill Canada, [Puremill Jowar Flour](https://www.puremill.ca/products/puremill-jowar-flour), product name and description. | Reuse the already-recorded current Canadian manufacturer source for the existing `jowar flour` alias; it does not supply the exact `jowar atta` wording. |
| Existing **WP02-A6-JOWAR-FLOUR-20261012-S03**, **WP02-A6-JOWAR-FLOUR-20261012-S04**, and **WP02-S33** | OQLF, [sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho); Spice Divine, [Farine de sorgho Nutrifresh](https://spicedivine.ca/fr/products/nutrifresh-jowar-flour-2lb); Codex, [Norme pour la farine de sorgho](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/fr/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+173-1989%2FCXS_173f.pdf). | Reuse existing ledger sources for retaining the Québec display. They do not support a new French alias. |

## Baseline snapshot and static verification

Snapshot captured 2026-10-13 before proposal creation. Hashes cover exact file bytes. The proposed source IDs were also searched against the ledger and catalog archive as stated above.

| Surface | Count | SHA-256 / fingerprint |
|---|---:|---|
| Ingredient references | 1,341 | `c59281b35053e251f419a57e82785dce2f09c2ae439238d5dfa37f8664d1163f` |
| Ingredient forms | 98 | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,650 records; 6,301 source entries / 5,293 distinct source IDs; 341 measurement observations; 190 substitution findings; 8 unit conversions | `14a8d25a6303d08d88fb31a25ab127686873d607a36fe010745d03f909c4208d` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Global substitution rules | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Contextual substitution rules | 0 rules | `37517e5f3dc66819f61f5a7bb8ace1921282415f10551d2defa5c3eb0985b570` |
| Generated `BundledIngredientCatalog.kt` | 1,341 references | `d74ae81199a67cbbe2c4b9b21d802deb40a810b8c08337cc24c8221844397ce6` |

Static review covered the active A6 checklist and archive, target row and ledger states, exact normalized ownership, picker query projection including attached forms, source/finding-ID collision status, numeric and substitution evidence, French naming, and the full manifest-listed recipe corpus. No app, unit, instrumentation, emulator, or application tests were run; this is proposal-only and the project rule exempts JSON-only database changes from testing.

## Root integration result

Integrated on 2026-10-13: added only `jowar atta` to the English aliases on `ingredient-ref-sorghum-flour`, and added sources S01–S03 plus the accepted alias decision to that ledger record. French aliases, forms, density, mappings, measurement state, substitution state, and recipe links remain unchanged. Static package, generated-index, ledger, ownership/picker, recipe-corpus, and text checks passed. No app tests or emulator checks were run under the JSON-only database-data rule.
