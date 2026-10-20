# WP04 Section P — silverside/capucette naming-boundary review (R520)

- **Review and online source-access date:** 2026-10-17.
- **Open checklist:** WP04 Section P, “Resolve vernacular fish names against appropriate identity evidence instead of treating different species as synonyms” ([plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L7994)).
- **Gap selected:** The indexed Québec retail name pair `Capucette / Silverside` for Metro item 773365312308 and its relationship to the OQLF species name `capucette / Atlantic silverside`.
- **Recommendation:** **Hold the `capucette / silverside` identity allocation.** Metro’s indexed bilingual product listing identifies *Odontesthes regia* (Peru origin), while OQLF defines Québec `capucette / Atlantic silverside` as *Menidia menidia*. CFIA’s Fish List applies `Silverside / Capucette` to *O. regia*, and lists `Atlantic Silverside / Capucette` plus `Silverside / Capucette De L’atlantique` for *M. menidia*. The unqualified English and French search terms therefore overlap across distinct species, though the CFIA pairings differ. Do not add either species row, a legacy candidate, or aliases for these terms until a Québec-facing qualified French product name and picker scope are supported.
- **Scope:** This is a Canadian retail naming and fish-identity boundary review. It concerns the exact Metro SKU and its conflicting bilingual name; it does not review capelin, smelt, salmon, other silversides, substitutions, or seafood safety.
- **Data outcome:** Hold; no active reference, form, legacy mapping, ledger record, recipe, or generated file was changed. Following the independent review, this decision is recorded in the workflow, roadmap, plan log, and integration README; the broad vernacular-fish checklist remains open.
- **Proposal-local source IDs:** `WP04-SECTIONP-SILVERSIDE-CAPUCETTE-R520-20261017-S01` through `S04`. They remain unregistered under this hold. The CFIA results URL is shared by older source entries; the exact owners are listed below.

## Why this is a distinct open gap

The fish-name checklist remains open. Repository searches across the live plan, roadmap, proposals, batch archive, active references/forms, legacy candidates, and research ledger found no earlier focused `capucette`, `silverside`, *Odontesthes regia*, *Menidia menidia*, or Metro item 773365312308 review. This does not reopen any prior fish decision.

Metro’s indexed English and French product pages show the same product number, **773365312308**, as **Frozen Cleaned Headless Silverside** / **Capucette nettoyée sans tête surgelée**. The indexed product details list *Odontesthes regia* and provenance from Peru; the English page also shows a 908 g package. The page snippets reported the item out of stock. Direct Metro page requests returned 403 in this review, so these are search-indexed listing details, not a direct live-page or local-stock observation. [S01–S02]

OQLF’s GDT entry, updated in 2011, gives Québec **capucette** as the preferred term for **Atlantic silverside**, *Menidia menidia*, in the commercial-fish domain. The entry notes commercial potential in Québec; it does not identify Metro’s product. [S03]

CFIA’s Fish List currently displays `Silverside / Capucette` for *Odontesthes regia* and separate `Atlantic Silverside / Capucette` and `Silverside / Capucette De L’atlantique` rows for *Menidia menidia*. The *Odontesthes* genus-level rows also pair `Silverside` with `Capucette De L’atlantique` and `Atlantic Silverside` with `Capucette`. These rows assign overlapping common-name components across distinct taxa, while the longer pairings vary; the internally irregular genus-level display is not evidence that the taxa are synonyms. [S04]

The retailer’s indexed product binomial and OQLF’s species pairing are both specific, but the French term appearing on the product is already assigned to a different species by OQLF. The indexed retail listing has no qualified Québec French name that resolves *O. regia*. Hold the species and search-term allocation instead of assigning the product’s `capucette` wording to *M. menidia* or inventing a French qualified name for *O. regia*.

This review is separate from the recent [R508 shrimp-dumpling hold](wp04-section-p-next-seafood-review-r508-20261017.md), [R511 shrimp-ring hold](wp04-section-p-next-seafood-review-r511-20261017.md), [R514 canned-sardine product addition](wp04-section-p-next-seafood-review-r514-20261017.md), and [R517 Dungeness-cluster addition](wp04-section-p-next-seafood-review-r517-20261017.md). [R516 cereal](../batches/wp03-section-f-sugar-crisp-cereal-identity-integration-r516-20261017/README.md) and [R518 bitter-kola](../batches/wp06-african-bitter-kola-seeds-identity-integration-r518-20261017/README.md) integrations are unrelated; the current review snapshot includes them. The existing American and European smelt and Atlantic capelin identities remain separate.

## Current snapshot and exact ownership audit

The current post-R516/R517/R518/R519 snapshot was read on 2026-10-17. R519 adds an unrelated finished-cereal identity; the refreshed live counts below include it. File hashes are SHA-256 over exact bytes.

| Dataset | Current count | Bytes | SHA-256 |
|---|---:|---:|---|
| [Ingredient references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,793 | 585,604 | `450ca5a6445f75eef96eded4431c26759c2664819bb20e32ec56849e7fdba3ff` |
| [Ingredient forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 143 | 113,370 | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| [Legacy candidates](../legacy-import-identities.v1.json) | 56 | 13,351 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| [Research ledger](../research-ledger.v1.json): records / source entries / distinct source IDs / distinct URLs | 2,150 / 9,866 / 8,350 / 7,060 | 10,077,765 | `d18c280d5719d8a24def02e41320b3e89631f957553b4db75cf6da20961e995b` |
| [Recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The exact-key audit followed accent/punctuation normalization in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It checked bilingual reference names and aliases, form IDs/labels/match terms, all 56 legacy candidates, ledger record/source IDs and URLs, and the proposal/batch archive.

| Key or namespace | Existing owner | R520 disposition |
|---|---|---|
| `capucette`, `silverside`, `Atlantic silverside`, `capucette de l’Atlantique`, `Chilean silverside`, `Peruvian silverside`, *O. regia*, *M. menidia* | No exact owner in active references/forms, legacy candidates, or ledger identity records. No earlier focused proposal or integration record. | Keep unallocated. The terms occur in current primary source evidence but are not catalog terms. |
| `ingredient-ref-atlantic-silverside`, `ingredient-ref-peruvian-silverside`, `candidate-silverside-capucette` | No active or ledger owner; no collision in the proposal/batch archive. | No ID or candidate is proposed. |
| `ingredient-ref-american-smelt`, `ingredient-ref-european-smelt`, and `ingredient-ref-atlantic-capelin` | Existing species identities with their own name scopes. | Keep unchanged; do not add `silverside`, `capucette`, smelt, or capelin aliases to them. |
| R520 source-ID prefix `WP04-SECTIONP-SILVERSIDE-CAPUCETTE-R520-20261017` | No ledger or proposal/batch collision. | S01–S04 are proposal-local IDs, each mapped to one URL below; none is registered in the ledger. |
| Metro English and French product URLs; OQLF `capucette` URL | No exact URL owner in the ledger or proposal/batch archive at review time. | New proposal-local evidence only. The English and French pages are language views of one Metro SKU. |
| CFIA Fish List results URL | Existing URL-level ownership: 37 source entries across 37 records and 28 distinct source IDs. These entries belong to other species decisions; none is an identity owner for silverside/capucette. | R520-S04 records the current `Odontesthes` and `Menidia` rows with its own locator. It remains proposal-local; no existing source entry is edited. |

The CFIA results URL has 37 existing source entries across 37 records and 28 distinct source IDs. The exact `(sourceId → owning recordId[s])` mapping is:

| Existing source ID | Existing owner record(s) |
|---|---|
| `WP04-COCKLE-COQUE-20261011-S02` | `ingredient-ref-cockle` |
| `WP04-CRAYFISH-20261012-S02` | `ingredient-ref-crayfish` |
| `WP04-CUTTLEFISH-IDENTITY-20261012-S01` | `ingredient-ref-cuttlefish` |
| `WP04-FRESH-SCALLOP-IDENTITY-20261012-S03` | `ingredient-ref-scallop` |
| `WP04-LOBSTER-HOMARD-20261012-S01` | `ingredient-ref-lobster`, `ingredient-ref-lobster-claws` |
| `WP04-OCTOPUS-IDENTITY-20261012-S01` | `ingredient-ref-octopus` |
| `WP04-ORANGE-ROUGHY-20261013-R71-S02` | `ingredient-ref-orange-roughy` |
| `WP04-P-ATLANTIC-WOLFFISH-20261012-S02` | `ingredient-ref-atlantic-wolffish`, `ingredient-ref-spotted-wolffish` |
| `WP04-P-CUSK-BROSME-20261012-S02` | `ingredient-ref-cusk` |
| `WP04-P-MILKFISH-IDENTITY-20261013-S02` | `ingredient-ref-milkfish` |
| `WP04-P-PACIFIC-SAURY-20261013-S01` | `candidate-pacific-saury` |
| `WP04-P-RED-DRUM-20261012-S02` | `ingredient-ref-red-drum` |
| `WP04-PERIWINKLE-20261011-S03` | `ingredient-ref-common-periwinkle` |
| `WP04-SALMON-TUNA-BOUNDARY-20261011-S02` | `candidate-wp04-salmon-species-scope`, `ingredient-ref-salmon-fillets-without-skin` |
| `WP04-SALMON-TUNA-BOUNDARY-20261011-S07` | `candidate-wp04-tuna-species-scope` |
| `WP04-SARDINE-FISH-BOUNDARY-20261011-S02` | `ingredient-ref-canned-sardines`, `ingredient-ref-european-pilchard`, `ingredient-ref-pacific-sardine`, `ingredient-ref-smoked-sardine-fillets` |
| `WP04-SEACUCUMBER-20261011-S03` | `candidate-sea-cucumber` |
| `WP04-SECTION-P-SERIOLA-R334-20261016-S01` | `ingredient-ref-greater-amberjack`, `ingredient-ref-japanese-amberjack` |
| `WP04-SECTIONP-BARRACUDA-IDENTITY-R83-20261013-S02` | `ingredient-ref-barracuda` |
| `WP04-SECTIONP-COBIA-IDENTITY-R84-20261013-S02` | `ingredient-ref-cobia` |
| `WP04-SECTIONP-EASTERN-OYSTER-R131-20261015-S02` | `ingredient-ref-eastern-oyster` |
| `WP04-SECTIONP-EUROPEAN-FLAT-OYSTER-R139-20261015-S02` | `ingredient-ref-european-flat-oyster` |
| `WP04-SECTIONP-GIANT-RED-SEA-CUCUMBER-R146-20261015-S07` | `ingredient-ref-giant-red-sea-cucumber` |
| `WP04-SECTIONP-KUMAMOTO-OYSTER-R137-20261015-S10` | `ingredient-ref-kumamoto-oyster` |
| `WP04-SECTIONP-MEDITERRANEAN-MUSSEL-R133-20261015-S01` | `ingredient-ref-frozen-cooked-mussel-meat`, `ingredient-ref-mediterranean-mussel` |
| `WP04-SECTIONP-MICROPTERUS-PAIR-R91-20261014-S04` | `ingredient-ref-largemouth-bass`, `ingredient-ref-smallmouth-bass` |
| `WP04-SECTIONP-MONKFISH-20261012-S02` | `ingredient-ref-monkfish-market-group` |
| `WP04-SECTIONP-OPAH-20261016-R248-S01` | `ingredient-ref-opah` |

These are URL-level evidence owners for other species decisions, not identity owners for silverside/capucette. R520-S04 maps to the same results URL with its own proposal-local source ID and locator; no older source entry is edited.

### Source-ID to URL register

Each R520 source ID below maps to exactly one URL. New IDs and the Metro/OQLF URLs have no existing ledger owner. S04’s exact URL is already shared as described above; its R520 ID and locator are proposal-local and do not duplicate or alter the older source entries.

| Source ID | Exact URL | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-SILVERSIDE-CAPUCETTE-R520-20261017-S01** | Metro, [Capucette nettoyée sans tête surgelée, item 773365312308](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/poissons-et-fruits-de-mer-surgeles/emballes-et-en-vrac/capucette-nettoyee-sans-tete-surgelee/p/773365312308). | Indexed Québec French listing shows the French title, item number, *Odontesthes regia*, and Peru provenance. It reported out of stock. Product-specific evidence; not a species synonym ruling or a reusable measure. |
| **WP04-SECTIONP-SILVERSIDE-CAPUCETTE-R520-20261017-S02** | Metro, [Frozen Cleaned Headless Silverside, item 773365312308](https://www.metro.ca/en/online-grocery/aisles/fish-seafood/frozen-fish-seafood/packages-bulk/frozen-cleaned-headless-silverside/p/773365312308). | Indexed English view of the same SKU as S01, not an independent product observation. It gives the paired title, same species/origin details, and 908 g package amount. The package size is not a reusable measure. |
| **WP04-SECTIONP-SILVERSIDE-CAPUCETTE-R520-20261017-S03** | OQLF, [capucette (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198958/capucette). | Québec preferred term in edible-fish and zoology/ichthyology domains; pairs `capucette`, `Atlantic silverside`, and *Menidia menidia*. Last updated 2011. Supports terminology, not the Metro SKU. |
| **WP04-SECTIONP-SILVERSIDE-CAPUCETTE-R520-20261017-S04** | CFIA, [Search CFIA Fish List results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). | The live result table lists *Odontesthes regia* `Silverside / Capucette`; *Menidia menidia* has `Atlantic Silverside / Capucette` and `Silverside / Capucette De L’atlantique`; genus-level *Odontesthes* rows display both pairings. These overlapping terms support a search-boundary hold, not synonym or culinary-equivalence claims. |

## Picker projection

The projection replays the current complete-phrase-first matching and substring fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), over reference names/aliases and attached form labels/match terms. The hypothetical row is only a risk check: `Atlantic silverside / capucette`, no aliases or forms. No row is recommended.

| Query | Current result | Hypothetical with `Atlantic silverside / capucette` | Effect |
|---|---:|---:|---|
| `Atlantic silverside` | 0 | 1 | The qualified English query would resolve to *M. menidia* if a row were added. |
| `capucette` | 0 | 1 | The unqualified Québec term would point to *M. menidia*, despite Metro using the same product name for *O. regia*. |
| `silverside` | 0 | 1 | The broad English term would resolve to *M. menidia*, while the indexed Metro listing identifies *O. regia*. |
| `capucette de l’Atlantique` | 0 | 0 | Not included in the hypothetical row; only use it if a future name review supports it for the intended species. |
| *Odontesthes regia*; *Menidia menidia* | 0 each | 0 each | Do not add scientific names as aliases; the seller’s binomial remains source evidence. |
| `fish`; `poisson` | 13; 12 | 13; 12 | No broad generic-fish alias is added. |

The principal issue is that the hypothetical short names would present a species choice where the same Canadian/Québec product wording already identifies a different species. The current picker cannot show the conflicting named market uses as a qualified bilingual choice without an independently supported Québec French name for *O. regia*.

## Manifest recipe-corpus scan

The manifest-ordered scan read **114 recipe files** and all **1,123 structured ingredient rows**, totaling **753,988 exact recipe-file bytes**. It searched complete decoded recipe JSON and ingredient-row strings for `capucette`, `silverside`, `Atlantic silverside`, `Chilean silverside`, `Peruvian silverside`, *Odontesthes regia*, *Menidia menidia*, and the Metro bilingual product titles. It found **zero candidate-phrase files and zero candidate-phrase ingredient rows**. There is no linked row, recipe amount, or demand signal to resolve the naming collision.

Corpus fingerprint: **`847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e`**, SHA-256 over every manifest-relative recipe path encoded in UTF-8, NUL, exact file bytes, NUL, in manifest order.

## Forms, measures, and substitutions

- **References, aliases, and forms:** Keep both species/product naming sets out of active catalog data in this proposal. Add no active reference, alias, legacy candidate, form, or ledger identity. Preserve the existing smelt and capelin identities.
- **Measures and density:** Add none. Metro’s 908 g is one listing’s package amount. The source establishes no household volume, per-fish mass, count mapping, density, edible yield, or reusable conversion.
- **Substitutions:** Add no global or contextual substitution among Metro’s *O. regia*, *M. menidia*, capelin, smelt, or other fish. No recipe source gives a method, role, or amount for any such substitution.
- **Recipe links:** Add none; the manifest contains no candidate-specific ingredient row.

## Disposition and evidence limits

Hold the unqualified **`silverside / capucette`** identity allocation and its species-specific alias assignment. Metro’s indexed Québec product listing is explicitly *Odontesthes regia*, while OQLF’s Québec preferred edible-fish `capucette` entry is *Menidia menidia*; CFIA’s Fish List assigns overlapping English and French common-name components across these taxa with differing qualified pairings. No supported Québec French qualified retail name for the Metro species resolves the conflict. Reopen when a current regional label or authoritative terminology source supplies an unambiguous bilingual qualified name for *O. regia*, or when the picker can preserve both named species choices.

The evidence limits are specific: Metro’s English and French pages are two views of one SKU. Direct page requests returned 403; indexed excerpts showed the English page crawled about two weeks before access and the French page about five months before access. The reported out-of-stock state may vary by selected store. Its 908 g is a package quantity only. OQLF’s entry dates to 2011. CFIA’s result table was accessed live, but its genus-level pairings are internally inconsistent. These sources establish overlapping name components and a species identification in one Metro listing; they do not show how often either name is used across Canadian retail, establish product substitution, or create recipe demand. No software tests, build, emulator check, or deployment were run for this proposal-only review.
