# WP04 Section P — Dried oyster identity and boundaries

- **Packet type:** proposal-only research for coordinator review.
- **Research date:** 2026-10-09.
- **Scope:** dried oyster as a food ingredient; boundaries from fresh/cooked oyster, oyster sauce, dried scallop, dried shrimp, powders, stock/bouillon, and other dried seafood.
- **Status:** integrated on 2026-10-09 as an identity-only `PROTEIN` reference; no recipe links or conversions were added. The audit snapshot below predates integration. Keep the broad Section P work open.
- **Live snapshot:** 453 references, 17 forms, 620 research-ledger records / 808 source entries, 99 legacy candidates, 114 recipes / 1,123 ingredient rows. Exact hashes and audit results are below.
- **New source IDs:** `WP04-DOYS-S01` through `WP04-DOYS-S05`; each was checked against the live ledger and all catalog proposals/batches before assignment.

## Coordinator recommendation

Add one candidate `PROTEIN` identity for **dried oyster**. The Hong Kong Food and Environmental Hygiene Department (FEHD) explicitly lists dried oyster in the dried-seafood category, separately from live/unprocessed oyster and other processed aquatic products [existing ledger source `WP04-DRSC-S02`]. A Hong Kong FEHD menu also uses dried oysters as a recipe ingredient [S03]. No reviewed source supports multiple dried-oyster identities by species, size, salting, shell state, or process. Keep those qualifiers unresolved until a product-specific source supports a split.

| Field | Candidate | Evidence status and limits |
|---|---|---|
| English display | `dried oyster` | Direct government classification wording [existing `WP04-DRSC-S02`]; also used in the Canadian CIPO journal [S01]. |
| English search alias | `dried oysters` | Used in an FEHD recipe title and ingredient list [S03]. |
| fr-CA display candidate | `huître séchée` | Provisional compound based on OQLF's normalized Québec base term `huître` [S02] and direct French-language Canadian retail usage of `huîtres séchées` [S05]. The OQLF entry is not specific to dried oyster and does not establish the species of the dried product. |
| fr-CA plural search alias | `huîtres séchées` | Appears on a Québec-based Canadian seller's dried-oyster listing [S05]. It also appears as a convenience translation in the CIPO journal [S01]; the journal states that the second-language goods text is translated for convenience only. Treat the Québec wording as well-attested retail language, not as an OQLF-normalized dried-seafood term. |
| Regional alias candidate | `Yokhoss` | The Québec seller says its dried oysters are commonly called `Yokhoss` in Senegal [S05]. If accepted, retain a note limiting this spelling to the cited Senegalese usage; this single seller listing does not establish a universal or species-qualified name. |
| Chinese source wording | `蠔豉` | FEHD prints this term beside “Dried oyster” [existing `WP04-DRSC-S02`]. The app search normalizer yields an empty key for the Chinese-script phrase, and no romanization was found in the reviewed authority source. Keep it in the evidence note; do not add it or an invented romanization as an active alias. |
| Identity relation | Distinct product identity, not a generic oyster form | The live catalog has no generic oyster identity. Do not create a form relation to a future generic oyster record unless matching species and processing are sourced. Do not infer species from OQLF's base-word entry or from a dried-oyster category label. |

The FEHD and CFS sources classify dried oyster as a dried seafood product, apart from live/unprocessed shellfish, other processed aquatic products, oyster sauce, concentrated soup/broth/bouillon, and seasoning powders [existing sources `WP04-DRSC-S02`, `WP04-DRSC-S10`]. The classifications support a distinct product boundary; they do not establish a standard recipe, exact physical presentation, species, salt level, shell removal, or preparation process.

## Boundaries and exact dispositions

| Neighboring product or term | Disposition | Evidence and limits |
|---|---|---|
| Fresh/live or cooked oyster | Separate product condition; no alias, form, or conversion proposed | FEHD lists live/unprocessed oyster separately from dried seafood [existing `WP04-DRSC-S02`]. CFIA says condition terms such as “dried” should be declared where their omission could cause a fish product to be mistaken for another food [S04]. Neither source links a particular dried product to a species-specific fresh oyster. |
| Bottled oyster sauce | Keep the active `ingredient-ref-oyster-sauce` identity separate | OQLF defines `sauce d'huître` as a concentrated extract sold bottled and distinguishes it from homemade `sauce aux huîtres`, a sauce containing oysters [existing `WP05-PANTRY-S01`]. CFS also places oyster sauce in the savory-sauce category separately from dried seafood [existing `WP04-DRSC-S10`]. |
| Vegan oyster-style sauce | Keep active `ingredient-ref-vegan-oyster-sauce` separate | It is a plant-based sauce identity, not dried oyster. Its existing English/French key match is recorded in the exact-key audit below. |
| Legacy `sauce aux huitres` | Historical candidate for the homemade-sauce wording, not a dried oyster alias | It normalizes to the French phrase that OQLF contrasts with bottled `sauce d'huître`; the candidate is the old oyster-sauce ID with an unaccented French display. Do not carry this legacy spelling onto dried oyster. |
| Dried scallop / `conpoy` | Keep active `ingredient-ref-dried-scallop` separate | The live catalog already treats dried scallop as its own identity and keeps `conpoy` there. FEHD lists dried scallop separately from dried oyster [existing `WP04-DRSC-S02`]. |
| Dried shrimp | Keep active `ingredient-ref-dried-shrimp` separate | FEHD lists dried shrimp separately [existing `WP04-DRSC-S02`]. Neither source says it aliases or substitutes for dried oyster. |
| Dried oyster powder or oyster extract powder | Boundary note only; do not fold into this candidate | No reviewed primary or local product source established a culinary dried-oyster-powder identity. CFS classifies seasoning powders separately from dried seafood [existing `WP04-DRSC-S10`]. A powder/extract product would need its own product evidence and review. |
| Stock, broth concentrate, bouillon, seafood seasoning powder | Keep separate; no substitution or conversion | CFS classifies concentrated soup/mix/paste/broth/bouillon and seasoning powders separately from dried seafood [existing `WP04-DRSC-S10`]. Current catalog examples include `ingredient-ref-broth-concentrate` and `ingredient-ref-hondashi`; neither is a dried-oyster alias. |
| Other dried seafood, including dried scallop, shrimp, squid, abalone, sea cucumber, bonito, and salted fish | Keep as distinct named products; no generic `dried seafood` alias | FEHD places these as separate examples within a broad dried-seafood class [existing `WP04-DRSC-S02`, `WP04-DRSC-S10`]. Category membership is not evidence of identity equivalence. |

## Measurement evidence — separate from identity

| Source observation | What it supports | What it does not support |
|---|---|---|
| One FEHD menu recipe, “Soup with Dried Oysters, Radish and Carrot,” lists **4 taels dried oysters**, one radish and one carrot, plus 4 taels blanched pork; the method simmers the ingredients for two hours [S03]. | A single recipe-specific ingredient amount and method. Preserve the source unit exactly as `4 taels`. | The PDF gives no serving count or tael conversion. It does not establish a default amount, count-to-weight, density, volume conversion, yield, or general rehydration ratio. |
| CFS table for contaminant-limit calculations lists fresh-oyster water content `79.2–89` g/100 g, dried-oyster water content `13.1–19.3` g/100 g, and a `0.13–0.26` conversion factor [existing `WP04-DRSC-S04`]. CFS says the factors proportionally adjust metal maximum limits and that water content varies with species, season, geography, and processing. | Source-scoped regulatory evidence about moisture and interpreting metal maximum limits. | It is not a recipe conversion, fresh-to-dried yield, rehydration ratio, cooking conversion, mass-volume mapping, or density. No value is activated. |

No general count weight, volume measure, density, package yield, or dried-to-cooked conversion was found. Keep all such fields unset.

## Substitution evidence — separate from identity and measurement

Searches for government, fishery-authority, and official culinary evidence of replacing dried oyster with fresh/cooked oyster, dried scallop, dried shrimp, oyster sauce, powder, or stock/bouillon did not find a dried-oyster-specific tested substitution rule. The FEHD menu uses dried oyster in one soup but gives no alternative. A government Singapore recipe source that recommends choosing an accessible similar seafood concerns a different Putian noodle recipe and does not establish a dried-oyster substitution. No alias, ratio, directed conversion, contextual substitution, warning, or blocking rule is proposed.

## Live snapshot and exact-key audit

Hashes below are SHA-256 over exact file bytes. The ordered recipe digest hashes each manifest-listed recipe basename in lexical order, then NUL, exact recipe bytes, then NUL.

| Artifact | Live count | SHA-256 / digest |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 453 references | `52bc70c5d568f09521bb7aae2d28d0c00520edc0e34579e5dda72986d780324c` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 17 forms | `2098e1048796a1aba42c25e4020f018d02c04c332567620432084fceac8f2d15` |
| `docs/catalog/legacy-import-identities.v1.json` | 99 candidates | `63b1be877ddc0bb5f8b1c74f7e3389ad59b1f3d03129b259c0a737d91ecf364b` |
| `docs/catalog/research-ledger.v1.json` | 620 records / 808 source entries; 703 distinct source IDs | `54c1102732a2a89b580f0441ba360bb79f6c3e9b84bf01adc16360751ede3816` |
| Manifest-listed recipe files | 114 files / 1,123 ingredient rows | `b4723f4a0dc4a19008c9f866307696235320845eaa8c0cfb21b8327d055f5194` |

The exact-key scan mirrored `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase and NFKD, fold `œ`/`æ`/`ß`, remove combining marks, expand `&` to `and`, replace other non-ASCII alphanumeric characters with spaces, then collapse whitespace. It compared active reference names/aliases, form labels/match terms, and legacy candidate names/aliases. It also checked related active ledger records and the current catalog proposals/batches.

- No exact normalized key exists in active references, forms, or legacy candidates for the proposed terms `dried oyster`, `dried oysters`, `huître séchée`, `huîtres séchées`, or `Yokhoss`. The active catalog contains no generic oyster identity or dried-oyster form.
- Exact neighboring keys are already assigned as follows: `oyster sauce`, `sauce d'huître`, and `sauce d'huîtres` → active `ingredient-ref-oyster-sauce`; `vegan oyster sauce` and `sauce aux huîtres végane` → active `ingredient-ref-vegan-oyster-sauce`; `dried scallop`, `dried scallops`, `pétoncle séché`, `pétoncles séchés`, and `conpoy` → active `ingredient-ref-dried-scallop`; `dried shrimp` and `crevette séchée` → active `ingredient-ref-dried-shrimp`; `hondashi` → active `ingredient-ref-hondashi`; and `broth concentrate` → active `ingredient-ref-broth-concentrate`.
- `sauce aux huîtres` has no active key; the only exact normalized match is the legacy `ingredient-ref-oyster-sauce` candidate's unaccented French `sauce aux huitres`. OQLF's definition distinguishes that homemade sauce wording from bottled `sauce d'huître`; neither is a dried-oyster alias.
- The source-script term `蠔豉` normalizes to an empty key under the app normalizer. It was also checked literally; it does not appear in active reference/form names, legacy candidates, or recipe ingredient rows. No romanization was added.
- The earlier dried-shrimp/scallop packet mentions `dried oyster` as a distinct boundary example, not as an identity recommendation. No existing proposal establishes a dried-oyster identity or uses the new `WP04-DOYS-S01`–`S05` source IDs. Existing shared sources reused by this packet are cited under their established IDs, not assigned duplicate IDs.

The recipe audit scanned both `originalText` and `ingredientName` in all 1,123 ingredient rows from all 114 manifest-listed recipes. No dried-oyster, oyster-sauce, French `huître`, `Yokhoss`, dried-seafood, dried-scallop, dried-shrimp, or powder/seafood-stock ingredient row matched. Two stock-boundary rows matched: recipe 066 ingredient row 12, `1 tsp hondashi` (`ingredient-ref-hondashi`), and recipe 099 ingredient row 3, `1 tbsp Better Than Bouillon` (`ingredient-ref-broth-concentrate`). They are existing stock identities, not evidence for dried oyster. Recipe corpus hash above is unchanged from the coordinator-provided snapshot.

## Source search log

Searches were performed on 2026-10-09. No-result searches are recorded as a search outcome, not proof that a term or rule does not exist.

| Search group | Representative queries | Result / limit |
|---|---|---|
| Hong Kong food classification and original terminology | `site:fehd.gov.hk "Dried oyster" "Dried scallop" dried seafood`; `site:fehd.gov.hk "Dried Oyster Simmered with Shiitake Mushrooms"`; `site:fehd.gov.hk "蠔豉" "Dried oyster" dried seafood` | FEHD's 2025 guide lists Chinese `蠔豉` beside English `Dried oyster` in dried seafood; the same guide separates live/unprocessed oysters and other processed aquatic products. A separate FEHD menu supplies one dried-oyster recipe quantity [existing `WP04-DRSC-S02`; S03]. |
| Québec French and Canadian use | `site:vitrinelinguistique.oqlf.gouv.qc.ca "huître séchée"`; `OQLF huître Grand dictionnaire terminologique`; `Canada Québec "huîtres séchées" produit` | No dried-oyster-specific OQLF entry surfaced. OQLF supports the base spelling `huître`; a Québec-based Canadian seller uses `huîtres séchées` and `Yokhoss` for the listed Senegalese dried-oyster product. CIPO also records the French phrase as a convenience translation, not a controlled term [S01–S02, S05]. |
| Dried product versus fresh, sauce, powder, and stock | `site:inspection.canada.ca fish products "condition" "dried"`; `site:cfs.gov.hk "Dried oysters" water content conversion factors`; `site:cfs.gov.hk "Concentrated soup/mix/paste/broth/bouillon" seasoning powders` | CFIA treats condition words such as dried as relevant descriptors when their omission could mislead. CFS separately classifies dried seafood, oyster sauce, concentrated soup/broth/bouillon, and seasoning powders. This supports product boundaries, not recipe equivalence [S04; existing `WP04-DRSC-S04`, `WP04-DRSC-S10`]. |
| Canadian and regional naming | `site:publications.gc.ca "huîtres séchées" "dried oyster"`; `Canada "dried oyster" "huîtres séchées"`; `site:ca dried oyster "huîtres séchées"` | CIPO records Canadian dried-seafood goods with English `dried oyster` and French `huîtres séchées`; its front matter says the second language is for convenience. A current Québec seller directly labels a dried-oyster product `Huîtres séchées ou Yokhoss`, attributing the latter to Senegal. Neither establishes species or processing details [S01, S05]. |
| Measurement and substitution | `CFS metal maximum limit conversion factor dried oysters`; `dried oyster substitute dried scallop culinary extension government`; `site:gov.hk dried oyster substitute recipe dried scallop`; `site:gov.sg dried oyster substitute Chinese cooking` | CFS numbers are only for contaminant-limit interpretation. No government/authority source found a tested dried-oyster replacement or general quantity relationship. The reviewed FEHD menu records a recipe-specific amount only [S03; existing `WP04-DRSC-S04`]. |

## Source-to-claim map

New source IDs below were assigned only after checking the reserved `WP04-DOYS-S01` through `WP04-DOYS-S05` range against all current ledger entries and catalog proposal/batch files. The exact URLs for these five sources were not already in the ledger. Shared evidence already recorded in the ledger is listed separately and keeps its current ID.

| ID | Source | Claim used and limits |
|---|---|---|
| **WP04-DOYS-S01** | Canadian Intellectual Property Office, [Trade-marks Journal, Vol. 54, No. 2724 (10 January 2007)](https://publications.gc.ca/collections/Collection/RG42-2-54-2724.pdf), pp. 0 and 77 | The goods entry lists dried seafood including “dried oyster” and its French text includes `huîtres séchées`; the entry says the wares had been used in Canada since at least 2003. The journal's front matter says the second-language wares are translations for convenience only. Use as Canadian market wording, not a Québec terminology authority. |
| **WP04-DOYS-S02** | OQLF, Grand dictionnaire terminologique, [huître](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198865/huitre) | OQLF normalizes `huître` and accepts the rectified spelling `huitre`. The entry is associated with American oyster / *Crassostrea virginica* while noting oyster genera; it does not define dried oyster, establish a dried product species, or resolve `huître séchée` as a Québec-specific term. |
| **WP04-DOYS-S03** | Hong Kong FEHD, [“Soup with Dried Oysters, Radish and Carrot” menu PDF](https://www.fehd.gov.hk/english/pleasant_environment/tidy_market/images/today_market_food/3-1e.pdf) | Recipe ingredient list names dried oysters and records 4 taels in one soup; no serving basis, conversion, or general ratio is given. This source supports source-scoped usage and amount only. |
| **WP04-DOYS-S04** | Canadian Food Inspection Agency, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish) | CFIA says additional condition descriptors such as dried should be shown when omission could cause a prepackaged fish product to be mistaken for another food. It supports preserving product-state information, not a specific dried-oyster species, alias, amount, or substitution. |
| **WP04-DOYS-S05** | Les Aliments MAKEDA, [Produits halieutiques](https://www.makedasnfood.com/collections/produits-halieutiques) | Québec-based Canadian seller's page has a product titled `HUÎTRES SÉCHÉES ou Yokhoss` and says dried oysters are commonly called Yokhoss in Senegal. Use as retail-language and source-specific regional-name evidence only; the listing does not specify species, shell state, salting, process, or package amount. |

Shared, already-ledgered sources (reuse IDs only):

- **`WP04-DRSC-S02`** — Hong Kong FEHD, [Guide to Application for Food Trader Licence](https://www.fehd.gov.hk/english/forms/FSO_guide.pdf), p. 35. Current source text includes `蠔豉` / `Dried oyster`; it also lists live/unprocessed oysters separately from dried seafood and other processed aquatic products. The prior ledger record covers dried shrimp/scallop; add this additional dried-oyster claim only if the coordinator later updates that record.
- **`WP04-DRSC-S04`** — Hong Kong Centre for Food Safety, [FAQ on conversion factors for dried/dehydrated foods](https://www.cfs.gov.hk/english/whatsnew/whatsnew_fstr/whatsnew_fstr_PA_Food_Adulteration_Metallic_Contamination_FAQ_Metals.html). Q3 states the factor adjusts metal maximum limits; its table includes dried oyster moisture and factor data. The prior ledger record covers shrimp/scallop; this packet records the additional oyster row for integration review.
- **`WP04-DRSC-S10`** — Hong Kong CFS, [Food Classification — Part C(iii)](https://www.cfs.gov.hk/english/public/public_fifdrs/files/fehe245_a1.pdf). March 2026 classification includes dried oyster under dried seafood and separately lists other processed aquatic products, concentrated soup/mix/paste/broth/bouillon, oyster sauces, and seasoning powders. Classification only; it does not prove identity equivalence or substitution.
- **`WP05-PANTRY-S01`** — OQLF, [sauce d'huître](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2095130/sauce-dhuitre). Defines bottled concentrated oyster extract and distinguishes it from homemade `sauce aux huîtres`; supports the existing oyster-sauce boundary only.

## Coordinator follow-up

1. Review one proposed `PROTEIN` identity: `dried oyster` / provisional fr-CA `huître séchée`; consider `dried oysters` and `huîtres séchées` as plural search aliases.
2. Decide whether to accept the source-qualified regional alias candidate `Yokhoss` for the Senegalese usage stated by the Québec seller. Do not generalize its scope beyond the source.
3. Keep oyster sauce, vegan oyster sauce, dried scallop/conpoy, dried shrimp, stock/bouillon, powders, fresh/cooked oyster, and other dried seafood separate. Do not infer a species or processing specification.
4. Leave density, count weights, unit mappings, rehydration or cooking yields, conversions, and substitutions inactive. The `4 taels` and contaminant-factor observations are evidence only.
5. Leave the broad Section P plan item open; this packet makes no canonical edits or recipe links.

## Coordinator integration — 2026-10-09

Added `ingredient-ref-dried-oyster` as a separate `PROTEIN` identity with EN `dried oyster`, plural alias `dried oysters`, fr-CA `huître séchée`, and plural alias `huîtres séchées`. `Yokhoss` was not activated as a global alias because its only reviewed support is explicitly Senegal-specific and the catalog has no region-qualified alias field. The FEHD recipe amount of 4 taels is recorded as a source-specific observation with no serving basis or conversion. No forms, density, yield, substitutions, or recipe links were added. The French display remains provisional pending independent Québec terminology review; Section P remains open.
