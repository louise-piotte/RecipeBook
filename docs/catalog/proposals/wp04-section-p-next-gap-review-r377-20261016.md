# WP04 Section P — chikuwa formed-fish product review (R377)

## Scope and recommendation

- **Review date:** 2026-10-16.
- **Scope:** The named Japanese formed fish-paste product `chikuwa` only. This review does not allocate a fish species, generic surimi paste, a general fish-cake identity, or a universal preparation/storage state.
- **Recommendation:** Add one identity-only `PROTEIN` reference, `ingredient-ref-chikuwa`, displayed as **`chikuwa / chikuwa`**, with no aliases. Keep it separate from fish balls, fish tofu, shrimp and cuttlefish balls, naruto maki, kamaboko generally, generic fish cake, raw surimi paste, finished surimi products, and fish species. Add no forms, measure, density, unit mapping, yield, recipe link, conversion, or substitution.

The open [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt) still includes fish balls/surimi and regional seafood work. Chikuwa is a specific formed product within that gap, rather than a proposed synonym for the held generic `fish cake` or `surimi` terms. The Ministry of Agriculture, Forestry and Fisheries (MAFF) describes chikuwa as fish surimi wrapped around a bamboo or metal stick and heated; it also documents regional variants and differing fish-paste methods. Kikkoman describes a tube-shaped product with a central opening, made with fish paste and starch and steamed or roasted. These sources support a bounded product name while cautioning against inferring one fish species, formula, or process for every chikuwa. [S01, S02]

The display keeps the product name itself in both languages. A targeted OQLF site search found no dedicated chikuwa entry. A French-language Canadian distributor index lists “Mini Chikuwa,” and a Canadian trademark-journal goods list gives an applicant-supplied description, `galettes de pâte de poisson rôties en forme de tube (chikuwa)`. Neither is a Québec terminology ruling. Therefore do not use `galette de poisson`, `gâteau de poisson`, `pâte de poisson`, or the translated trademark description as the French display or aliases. Retain the source-attested loanword `chikuwa` in the French field and keep the lack of OQLF-preferred wording explicit. [S04, S05]

This recommendation does not reopen the [R171 generic fish-cake hold](../batches/wp02-wp03-wp04-r171-gap-review-integration-20261016/README.md), [R189 generic-surimi hold](wp04-section-p-generic-surimi-market-identity-review-r189-20261016.md), [fish-ball identity](wp04-fish-balls-surimi-product-boundary-review-20261011.md), [fish-tofu identity](wp04-section-p-fish-tofu-product-identity-review-r147-20261015.md), or [naruto-maki hold](wp04-section-p-naruto-maki-product-boundary-review-20261013-round38.md). Those decisions remain unchanged.

## Candidate ownership and proposed shape

| Surface | Current owner/state | R377 disposition |
|---|---|---|
| Active reference ID and names | No owner for `ingredient-ref-chikuwa`, `chikuwa`, `mini chikuwa`, `ちくわ`, or `竹輪`. | Propose `ingredient-ref-chikuwa`; English and French display names both `chikuwa`; category `PROTEIN`; aliases `[]` / `[]`; `defaultDensity: null`; `unitMappings: []`. |
| Active forms | No chikuwa or generic fish-cake form is active. | Add none. Chikuwa is a distinct named product; no evidence supports attaching a count, state, or cooking method as a reusable form. |
| Legacy import identities | No chikuwa candidate or proposed ID/name match. | No legacy mapping. |
| Research ledger | No chikuwa record, candidate, or source allocation. `candidate-surimi-product-boundary` remains the sole unresolved generic-surimi candidate. | If integrated, use `ingredient-ref-chikuwa` as the reference and ledger `recordId`, with `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. Do not duplicate or resolve the generic-surimi candidate. |
| Proposal/batch archive | No chikuwa-specific allocation or hold was found. Related fish-ball, fish-tofu, naruto-maki, generic fish-cake, and generic-surimi work is documented separately above. | This proposal is the only R377 chikuwa review; no other archive item is reassigned to it. |

The proposed row owns only the named chikuwa product. MAFF lists `noyaki-chikuwa` as a regional product and `tofu-chikuwa` as a fish-paste-and-tofu variant; the reviewed evidence does not make either a generic alias. Do not infer that chikuwa is interchangeable with fish balls, fish tofu, naruto maki, a board-shaped kamaboko, fried fish-paste cakes, imitation crab, or plain surimi paste. Do not infer an Alaska-pollock-only species claim from MAFF’s general discussion of fish-paste products. [S01, S02]

The Canadian Superwafer listing is headed `chikuwa fish cake` and reports one 112 g SKU. The page labels its image reference-only and says the actual item is final; the site's general disclaimer disclaims responsibility for errors or omissions and reserves changes to site content without prior notice. This is a Canadian retail naming example only: it does not establish a universal composition, species, French label, Québec availability, or reusable recipe amount. The 112 g figure is package mass, not a serving or conversion. [S03]

## Picker projection and bilingual boundaries

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete word-phrase matches take precedence over substring fallback. The proposed row uses only `chikuwa` in each display field and no aliases or forms.

| Query | Current result | Projected result | Boundary |
|---|---|---|---|
| `chikuwa` | None | `ingredient-ref-chikuwa` | Exact named product resolves to one row. |
| `mini chikuwa` | None | None | The French distributor’s `Mini` is a listing modifier; do not make one SKU/size variant a general alias. |
| `chikuwa fish cake`; `fish cake`; `fish cakes`; `tube-shaped fish cake` | None | None | Generic fish-cake terms remain held. Do not add the retailer wording or Kikkoman’s descriptive English phrase as an alias: each would make the broad `fish cake` phrase return this one named product. |
| `fish paste`; `surimi`; `kamaboko` | None | None | Chikuwa is a finished formed product, not the unqualified paste input or all kamaboko. |
| `fish balls`; `boulette de poisson` | `ingredient-ref-fish-balls` | Same | Existing fish-ball identity stays distinct. |
| `fish tofu`; `tofu au poisson` | `ingredient-ref-fish-tofu` | Same | Existing formed-fish tofu identity stays distinct. |
| `shrimp balls`; `boulettes de crevettes` | `ingredient-ref-shrimp-balls` | Same | Existing shrimp-ball identity stays distinct. |
| `frozen cuttlefish balls`; `boulettes de seiche surgelées` | `ingredient-ref-cuttlefish-balls` | Same | Existing frozen cuttlefish-ball identity stays distinct. |
| `surimi shreds`; `naruto maki`; `narutomaki`; `chikuwabu` | None | None | Held or distinct product terms remain unallocated by this proposal. |
| `fish`; `poisson` | 10 results each | Same 10 results each | A name-only chikuwa row adds neither broad term. |
| `pâte de poisson` | Two results: `bagoong isda` and `prahok` | Same two results | Do not alias a formed chikuwa product to this broad fermented-paste phrase. |
| `ちくわ`; `竹輪` | Search normalizes to an empty key and returns all 1,698 references | Still normalizes to an empty key and returns all 1,699 references | The current ASCII-token search cannot refine Japanese-script queries. Do not add nonfunctional script aliases or change the search implementation in this proposal. |

Source descriptions such as `tube-shaped fish cake`, `fish-paste cake`, and `Mini Chikuwa` are retained as evidence, not silently promoted to aliases. That leaves the generic fish-cake and surimi questions available for later source- and recipe-specific resolution.

## Recipe demand and numeric/substitution limits

The scan read every manifest-listed recipe JSON and ingredient row, including the complete file text. It searched `chikuwa`, `mini chikuwa`, `ちくわ`, `竹輪`, `chikuwa fish cake`, `tube-shaped fish cake`, fish cake(s), fish paste, surimi paste/surimi, `pâte de poisson`, kamaboko, naruto maki/narutomaki, chikuwabu, fish ball(s), `boulette(s) de poisson`, fish tofu, `tofu au poisson`, shrimp balls, `boulettes de crevettes`, and cuttlefish balls. It found **zero matching recipe files, ingredient rows, or links**. Kikkoman’s external recipe examples establish culinary contexts for chikuwa, but do not create demand in this bundled corpus and are not proposed as recipe links. [S02]

No source or bundled recipe establishes a chikuwa count mass, cup measure, density, package yield, or transferable quantity. Product heating and formulation vary; the retailer’s SKU mass is not a kitchen measure. No source supplies a tested replacement amount or outcome among chikuwa, fish balls, fish tofu, naruto maki, kamaboko, generic fish cakes, surimi paste/shreds, imitation crab, or fish fillets. Add no form, measure, conversion, yield, substitution rule, warning, or recipe-line substitution.

## Snapshot and uniqueness checks

Pre-integration read-only snapshot from the shared checkout on **2026-10-16**. Recipe corpus SHA-256 uses each manifest-relative `recipeFiles` path, a NUL byte, the exact file bytes, and a trailing NUL byte in manifest order.

| Artifact | Pre-integration snapshot |
|---|---|
| Active ingredient references / forms | 1,698 / 141 |
| Legacy import candidates | 56 |
| Research ledger | 2,054 records; 9,248 source entries; 7,824 distinct source IDs; 6,547 distinct URLs |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 753,988 bytes; SHA-256 `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

Pre-integration ownership checks across active references, forms, legacy identities, ledger records, the plan, proposals, and batches found no `ingredient-ref-chikuwa`, chikuwa name/spelling, or R377 source-ID prefix. The candidate row and all five source IDs were checked for existing exact matches before drafting. New source URLs for S01–S04 were absent from the prior ledger/archive. S05 is a disclosed URL reuse: the French Uniking product index already appeared as `WP04-P-PACIFIC-SAURY-20261013-S07`, whose locator/support concerns Pacific saury, not chikuwa. The R377 integration now records S05 under its distinct claim-specific ID.

No software tests, build, or emulator run was performed. The accepted database-data integration and its static verification are recorded in the [integration README](../batches/wp04-section-p-chikuwa-identity-integration-r377-20261016/README.md).

## Integration status and reopen conditions

Integrated on 2026-10-16 as the identity-only `ingredient-ref-chikuwa` row and research-ledger record; the romanized French display remains bounded to the source-attested loanword. See the [integration README](../batches/wp04-section-p-chikuwa-identity-integration-r377-20261016/README.md). Revisit alias or form scope only when a Québec-facing source or a bundled recipe identifies a more precise label or presentation. Preserve the generic fish-cake/surimi boundaries, keep package mass SKU-specific, and add recipe links or numeric/substitution behavior only from the exact recipe and product evidence that supports them.

## Source register

The source IDs below document the evidence used for R377 and are now recorded under `ingredient-ref-chikuwa` in the shared research ledger. Each source record states the claim it supports and the limit on that evidence.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CHIKUWA-R377-20261016-S01** | Japan Ministry of Agriculture, Forestry and Fisheries, [Fishcakes — Traditional Foods in Japan](https://www.maff.go.jp/e/policies/market/dento_syoku/bunrui/nerimono.html), “Chikuwa,” “Production Methods,” and “Relationship with Regions” sections (accessed 2026-10-16). | Defines chikuwa as fish surimi wrapped around a bamboo or metal stick and heated; notes regional variants, tofu-chikuwa, differing ingredient preparation, forming, heating, and refrigeration methods. Authoritative cultural/food description, not a Canadian product specification, Québec French term, universal formulation, or measure. |
| **WP04-SECTIONP-CHIKUWA-R377-20261016-S02** | Kikkoman Corporation, [Chikuwa / Tube-Shaped Fish Cake](https://www.kikkoman.com/en/cookbook/glossary/chikuwa.html), “What is chikuwa?” and related recipes (accessed 2026-10-16). | Gives Japanese spelling `ちくわ`, fish paste with starch shaped around bamboo/metal and steamed or roasted, and example food uses. Corporate cooking glossary, not a Québec/Canadian label standard or exact Canadian product formula; recipe examples are outside the bundled corpus. The descriptive phrase is evidence only, not a picker alias. |
| **WP04-SECTIONP-CHIKUWA-R377-20261016-S03** | Superwafer, [chikuwa fish cake](https://www.superwafer.ca/en/product/17534/chikuwa-fish-cake), item 17534, and [Disclaimer](https://www.superwafer.ca/en/page/disclaimer), last updated 1 December 2019 (accessed 2026-10-16). | Current Canadian online retail page uses the product wording `chikuwa fish cake` and shows one 112 g SKU. The page labels its image reference-only and says the actual item is final; the site's general disclaimer disclaims responsibility for errors or omissions and reserves changes to site content without prior notice. It supplies no reliable ingredient list, species, French wording, Québec availability, or reusable measure; 112 g remains package-only. |
| **WP04-SECTIONP-CHIKUWA-R377-20261016-S04** | Canadian Intellectual Property Office, [Journal des marques de commerce, French edition, 23 July 2025 (Vol. 72 No. 3691)](https://cipo-opic.ic.gc.ca/opic-cipo/tmj/fra/23Jul2025_fr.pdf?edition=07-23&year=2025), p. 91, goods list containing `galettes de pâte de poisson rôties en forme de tube (chikuwa)` (accessed 2026-10-16). | Provides a French-language Canadian descriptive phrase that includes `chikuwa`. The wording is supplied in a trademark goods list, not an OQLF decision, food standard, Québec retail label, or basis for general `galette de poisson`/`pâte de poisson` aliases; its roasted descriptor does not define every product. |
| **WP04-SECTIONP-CHIKUWA-R377-20261016-S05** | Uniking Enterprises (Canada) Ltée, [Produits](https://www.uniking.ca/fr/products), French-language product index, `Mini Chikuwa` entry and company address (accessed 2026-10-16). **Exact URL already used** by `WP04-P-PACIFIC-SAURY-20261013-S07`. | The current French-language index supports the presence of the romanized product name on a Canadian distributor page. The pre-existing ledger source record’s locator/support is for balaou du Pacifique (saury), not chikuwa; S05 is a new claim-specific proposal ID if this claim is later persisted. It is a BC distributor index, not a Québec-preferred term, product ingredient panel, species, or preparation specification. |
