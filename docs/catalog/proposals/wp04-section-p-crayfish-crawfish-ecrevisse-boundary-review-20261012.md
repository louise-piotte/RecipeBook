# WP04 Section P — crayfish / crawfish / écrevisse identity boundary review

- **Packet type:** source-checked identity boundary review, reconciled into the active plan and roadmap.
- **Review date:** 2026-10-12.
- **Status:** root accepted the evidence-based hold. Keep the existing `ingredient-ref-crayfish` ledger candidate unresolved.
- **Scope:** generic consumer ingredient identity for crayfish, crawfish, and `écrevisse`. Exclude langouste/spiny lobster, the accepted American-lobster and langoustine references, crab and crab meat, surimi, and distinct prepared seafood products.

## Root reconciliation

The recommendation below was accepted. The specific crayfish boundary is now checked in the Section P
plan and roadmap; the broader shrimp/prawn and shellfish checklist remains open. No catalog, ledger,
recipe, generator, or generated file was changed. The current post-reconciliation snapshot and static
checks are recorded in the [hold integration README](../batches/wp04-section-p-crayfish-crawfish-ecrevisse-hold-integration-20261012/README.md).

## Recommendation

Keep `ingredient-ref-crayfish` in its current `candidate` state with `identityState: needs_clarification`. The recipe corpus has no crayfish, crawfish, or écrevisse request. Current Canadian and Québec evidence supports the words in real seafood contexts, but does not support one safe, unqualified catalog identity across their full market scope: OQLF defines `écrevisse` as a freshwater crustacean and lists `crayfish` and `crawfish`, while also noting that those English terms are used colloquially for langouste. CFIA's species-indexed Fish List uses `crayfish` and `crawfish` for multiple freshwater taxa and also for some other crustaceans whose French name is `langouste`.

Current Canadian product listings further show different boundaries: one Ontario supplier names a particular species (*Pacifastacus leniusculus*) as both crawfish and crayfish; a Canadian online supermarket lists an unqualified frozen crayfish tail without a scientific species; a Montréal food-ordering menu pairs `écrevisse` with `crawfish` in a mixed seafood item without a species. Those examples establish consumer-market use, not one shared taxon or product scope.

Do not activate a generic reference, add aliases, assign forms or recipe links, or add numeric behavior from this packet. Reopen the candidate if a bundled recipe names an identifiable freshwater species or a product whose Canadian name and scope can be tied to a specific recipe request. Do not infer a broad identity from the optional phrase “seafood, to taste.”

## Species and product boundaries

| Evidence | What it establishes | Boundary for the catalog |
|---|---|---|
| OQLF's food-domain `écrevisse` entry | Preferred French `écrevisse`; English terms `crayfish` and `crawfish`; definition is a small freshwater crustacean. It also records colloquial English overlap with langouste. | Supports the freshwater sense, but does not make either English word globally exclusive to that sense. Keep langouste/spiny lobster separate. |
| CFIA Fish List | `Crayfish` and `Crawfish` are attached to several named taxa. Examples include `Cambarus`, `Pacifastacus leniusculus`, and `Procambarus clarkii`; the same English terms also occur on entries such as `Cervimunida johni` and some `Panulirus` species, where the French entry uses `langouste`. | Treat common names as species-entry evidence, not as a unique genus-wide category. Do not map all `crayfish` or `crawfish` search text to langouste or to a freshwater species. |
| Seafood Depot, Vaughan, Ontario | A current product called `Crawfish` is identified as `Pacifastacus leniusculus`, also called crayfish by the supplier; its listed product options include whole or meat and fresh or frozen. | Evidence for that species/product listing only. Do not import these product states as forms or generalize the scientific name to every unqualified market listing. |
| Superwafer, Canadian online supermarket | Current listing `frozen crayfish tail` has no scientific species on the page. A related product is separately titled `XBL Crawfish - Spicy`. | Confirms unqualified retail use but not taxon, cross-product equivalence, or an alias between product names. The page warns that product information may not be current or complete. |
| Montréal food-ordering menu | A current consumer menu pairs `Écrevisse` and `Crawfish` in the name of a shrimp, mussel, and crayfish seafood item and also lists crawfish separately. | Supports Québec consumer-facing bilingual usage, not the species or the scope of a grocery ingredient identity. |

Keep this candidate separate from `American lobster / homard d’Amérique` (*Homarus americanus*), `langoustine / scampi` (*Nephrops norvegicus*), langouste/spiny lobster, crab/crab meat, shrimp, and prepared or imitation seafood. CFIA and OQLF name overlap is not sufficient grounds to merge these categories. Do not propose scientific names, plural aliases, crawdad aliases, species-specific rows, whole/meat/tail states, preparation states, conversions, yields, or substitutions here.

## Candidate and exact-key ownership audit

The live research ledger contains `ingredient-ref-crayfish` as a `candidate`, with `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its prior unresolved decision cites `WP04-MOLLUSKS-20261009-S04` (OQLF) and holds pending recipe demand, preserving the distinction from langouste. The broad 2026-10-09 mollusk/shellfish/cephalopod proposal is the only prior packet coverage found; it likewise held crayfish/crawfish/écrevisse for lack of a recipe. The live Section P checklist still lists “crab and crayfish” as open. No dedicated crayfish integration or later proposal was found.

Before this proposal, exact normalized ownership was checked over active reference display names and aliases, form labels and match terms, and legacy candidate names and aliases. Normalization follows `normalizeIngredientSearchKey` in `IngredientSearch.kt`: NFKD, lowercase, ligature folding, accent removal, punctuation folding, and whitespace collapse. None of the active references, forms, or legacy candidates owns the exact normalized key for `crayfish`, `crayfishes`, `crawfish`, `crawfishes`, `écrevisse`/`ecrevisse`, `écrevisses`, `freshwater crayfish`, `crawdad`/`crawdads`, `crayfish tail`, `crawfish tail`, `crayfish meat`, or `crayfish paste`. The catalog search terms also have no exact or partial result for the candidate terms.

The nearby active identities are bounded separately: `ingredient-ref-lobster` now displays `American lobster / homard d’Amérique` and owns the exact English `lobster` and French `homard` aliases; `ingredient-ref-langoustine` displays `langoustine / scampi`. Neither owns the crayfish-family keys. The only crayfish-named ledger record is the unresolved candidate. The exact-key and candidate phrase checks did not find a legacy candidate for this family.

## Manifest recipe audit

I scanned all **114 manifest-listed recipe files and all 1,123 ingredient rows**, including each complete recipe JSON document, localized titles/descriptions/instructions, ingredient names, original ingredient text, and linked reference/form IDs. The candidate strings `crayfish`, `crawfish`, `écrevisse`, their plural spellings, and crawdad spellings occur in **0** recipe files and **0** ingredient rows.

The adjacent seafood demand does not establish crayfish:

| Recipe row | Existing demand | Catalog interpretation |
|---|---|---|
| `019#8` | `jumbo lump crab meat`, linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump` | Specific crab-meat grade; not crayfish or generic crustacean demand. |
| `023#1` | `calamari`, linked to `ingredient-ref-calamari` | Existing squid/calamari identity; separate mollusk. |
| `077#10` | `salmon fillets`, linked to `ingredient-ref-salmon-fillets-without-skin` | Finfish product; no crayfish implication. |
| `093#4` | “Cooked meat or seafood, to taste,” unlinked and species-unspecified | Optional catch-all text; it cannot select crayfish or any other specific shellfish. |
| `111#1` | `tuna`, linked to `ingredient-ref-tuna` | Finfish identity; no crayfish implication. |

Fish-sauce rows in recipes 093 and 095 are sauce identities, not crayfish ingredient demand. No recipe link or recipe data change follows from this review.

## Live package and generated-catalog snapshot

Snapshot checked on 2026-10-12 before writing this proposal. File SHA-256 values cover exact bytes. The recipe-corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte.

| Surface | Count | Bytes | SHA-256 / fingerprint |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,224 references | 391,453 | `cb5bc0962c77e97dcad944c6352ed933002dd6d2ea2c7ef9a578c6064c3f8fcf` |
| `ingredient-forms.v1.json` | 86 forms | 64,612 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,523 records; 5,192 source entries; 4,255 distinct source IDs | 5,037,117 | `05223549fbf89b9e452282865ea1c551013d12f5d3a4214fa5d8792c984732fb` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 752,942 | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `BundledIngredientCatalog.kt` | 1,224 references | 536,146 | `dad935ecd939cdbea8cc1e53b511ac8ffce5f36b4f74b4d4e29bbb6cc3f0e751` |

The new proposal-local source IDs `WP04-CRAYFISH-20261012-S01` through `S07` were checked against all source IDs in the shared ledger and the existing proposal/batch documentation; none was present before this packet was written.

## Source register

Sources were checked on 2026-10-12. The sources support consumer naming and identity boundaries only. No measurement, safe handling, preparation conversion, yield, or substitution claim is used.

| Source ID | Source and claim used | Limit |
|---|---|---|
| `WP04-CRAYFISH-20261012-S01` | Office québécois de la langue française, [écrevisse (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363436/ecrevisse). Preferred French term `écrevisse`; food-domain definition identifies a freshwater crustacean and gives English `crayfish` and `crawfish`; notes colloquial English overlap with langouste. | Last updated 2011. Terminology evidence, not a species selection for a recipe. |
| `WP04-CRAYFISH-20261012-S02` | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp). Checked the listed entries for `Cambarus`, `Pacifastacus leniusculus`, `Procambarus clarkii`, `Cervimunida johni`, and `Panulirus` species; the English terms overlap and French names vary by entry. | CFIA page reports a 2023-09-18 modified date. Common-name entries are taxon-specific evidence; they do not establish the recipe's taxon or a generic consumer identity. |
| `WP04-CRAYFISH-20261012-S03` | CFIA, [Guidance on determining common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names). Explains the role of the CFIA Fish List and Canadian common-name requirements. | Labelling guidance; it does not resolve an unqualified recipe term. |
| `WP04-CRAYFISH-20261012-S04` | Seafood Depot, [Crawfish product listing](https://www.seafooddepot.ca/product-crawfish2). A Vaughan, Ontario seafood supplier names `Pacifastacus leniusculus` as Crawfish and says it is also known as Crayfish. | One supplier's species-specific product listing; listed product options do not establish a generic form model. |
| `WP04-CRAYFISH-20261012-S05` | Superwafer, [frozen crayfish tail](https://www.superwafer.ca/en/product/21182/frozen-crayfish-tail). Canadian online supermarket page lists a frozen product by that name without a scientific species; its related items separately include `XBL Crawfish - Spicy`. | Retail information may be incomplete or outdated; no species equivalence between the product and related items is inferred. |
| `WP04-CRAYFISH-20261012-S06` | Uber Eats, [Seau de Crabe (Downtown), Montréal menu](https://www.ubereats.com/ca/store/seau-de-crabe-downtown/VPl89a5ZV2K7X3ucksY0qA). Current consumer-facing menu search result pairs `Écrevisse` and `Crawfish` in the bilingual name of a shrimp, mussel, and crayfish item and lists crawfish separately. | Restaurant menu terminology only; no scientific species or general grocery-product scope is stated. |
| `WP04-CRAYFISH-20261012-S07` | Metro, [Tout sur les écrevisses](https://api.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/ecrevisses). Québec retailer consumer seafood guide uses `écrevisse` as a seafood name. | Consumer guide, not an in-stock SKU or species identification; the page was returned in current search results but blocked when opened directly. |

## Remaining Section P gaps

This proposal does not close or change the open Section P checklist. The live plan still lists shrimp/prawn by meaningful preparation and crab/crayfish beyond the integrated identities; generic mussel, clam, fresh oyster, scallop, and cockle boundaries; other fish and species scope; and separate preserved-seafood, roe, fish-powder, fish-ball/surimi, and regional seafood questions. Existing accepted identities such as American lobster, langoustine, blue mussel, common periwinkle, cuttlefish, octopus, and calamari remain separate. Revisit the held crayfish candidate only when a specific recipe or product request defines the needed scope.
