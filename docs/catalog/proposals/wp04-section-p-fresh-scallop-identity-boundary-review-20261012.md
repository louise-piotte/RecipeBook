# WP04 Section P — generic scallop / pétoncle identity boundary review

- **Packet type:** integrated identity review. Root independently verified the terminology, regulatory, species, and retail evidence; promoted the held candidate in place and recorded the accepted decision with six new sources.
- **Review and source access date:** 2026-10-12.
- **Decision:** promoted the existing `ingredient-ref-scallop` candidate in place to an identity-only `PROTEIN` reference for **scallop / pétoncle**, scoped to the marketed edible adductor muscle. Kept the active dried-scallop identity distinct.
- **Scope:** species-unspecified culinary scallop wording as sold for food in Canada and Québec. Exclude the whole animal/shell, separate roe, named species or product classes, breaded preparations, and dried scallop/conpoy.

## Recommendation

Promoted `ingredient-ref-scallop` to an identity-only `PROTEIN` reference with English display **scallop**, French display **pétoncle**, and only the source-supported search aliases **scallops**, **pétoncles**, and **scallop meat**. The intended identity is the edible adductor muscle sold under the consumer category; it does not select a single species. Québec terminology sources and current Metro consumer guidance describe the marketed scallop product as the adductor muscle, while CFIA and DFO sources show that the same category name is used across multiple scallop species. Current Québec retail listings also use unqualified `pétoncle` alongside named Bay and Hokkaido products.

The recipe audit found no scallop request. That means no recipe link, ingredient relink, amount, or serving-specific behavior follows. The evidence still supports a bounded consumer ingredient identity independently of a current recipe occurrence. This recommendation updates the 2026-10-09 broad mollusk packet's hold rationale, which preceded the current Metro consumer explanation of the North American product boundary. It does not resolve any other Section P item.

Keep `ingredient-ref-dried-scallop` and its `conpoy` alias separate. Do not add species names, `noix` as a bare alias, `coquille Saint-Jacques`, `noix de Saint-Jacques`, `Hokkaido`, `Bay scallop`, roe/coral, preparation names, freshness/frozen descriptors, or forms. OQLF uses `noix` as a culinary term for the muscle, but the bare word is broad and does not uniquely identify scallop. OQLF discourages `coquille Saint-Jacques` for Canadian scallops because it denotes specified European species. Do not assign measurements, conversions, yields, densities, or substitutions.

## Consumer identity and product boundaries

| Evidence | What it establishes | Boundary for the proposed row |
|---|---|---|
| OQLF's `pétoncle` entry | Preferred Québec name `pétoncle`; English terms `scallop` and `scallop meat`; the Québec commercial product is the adductor muscle, sometimes accompanied by roe, rather than the whole animal. It discourages `coquille Saint-Jacques` for Canadian scallops because that name refers to specified European species. | Supports a species-unspecified consumer ingredient name with a narrow edible-part scope. The occasional attached roe is not made a global alias, form, or separate recipe ingredient here. [S01] |
| Fisheries and Oceans Canada (DFO) | The Canadian harvest guide lists Iceland scallop (*Chlamys islandicus*), sea scallop (*Placopecten magellanicus*), and Pacific pink and spiny scallops (*Chlamys rubida* and *C. hastata*) as separate harvested taxa. | Supports several Canadian species under the consumer scallop category; does not claim that the taxa are interchangeable or choose one species for a recipe. [S02] |
| CFIA Fish List | The live list attaches `Scallop` and/or `Pétoncle` to multiple species rows, including *Amusium pleuronectes*, *Chlamys islandica*, *C. rubida*, and *Placopecten magellanicus*. Species-specific names are also listed on those rows. | Supports a family-level consumer identity with explicit species names remaining out of the generic aliases. The Fish List is species-linked and also covers imported products. [S03] |
| CFIA Canadian Standards of Identity, Volume 3 — Fish | The standard separately names breaded scallops and scallop meat; the scallop-meat standard excludes roe, gut, shell pieces, sand, and other extraneous material. | Supports keeping breaded products and roe separate from a plain scallop-meat identity. Regulatory composition rules do not create recipe conversions or forms. [S04] |
| Metro Québec, consumer guide `Pétoncles` | Metro describes `pétoncle` as a common name for multiple Pectinidae species, says the adductor muscle is commercialized in North America, and describes fresh and frozen consumer offerings. | Current retail-facing evidence for the shared consumer category and edible part. Cooking or storage advice is not imported as a measurement, form, or safety rule. [S05] |
| Mayrand Québec, `Pétoncle surgelé` catalog | Current retailer listings separate unqualified scallop packages from Bay and Hokkaido-labelled products, and group the listings under frozen scallop. Several location entries displayed “coming soon” at review time. | Confirms Québec French retail wording and named product variation, not species equivalence, current local stock, package conversions, or aliases for Bay/Hokkaido. [S06] |

The catalog row would group only the commonly marketed edible adductor-muscle ingredient under `scallop / pétoncle`. It does not assert one biological species or include the whole shellfish. Keep species-specific, market-qualified, dried, breaded, and roe products independently searchable when supported by their own evidence.

## Existing candidate and exact-key ownership audit

The live research ledger contains `ingredient-ref-scallop` as a `candidate` with `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its prior unresolved decision holds a generic/fresh scallop row pending recipe demand and preserves the dried-scallop and Québec/European naming boundaries. The ledger cites `WP04-MOLLUSKS-20261009-S09` (OQLF) and `WP04-MOLLUSKS-20261009-S14` (DFO). The broad 2026-10-09 mollusk/shellfish/cephalopod packet and the dried-shrimp/scallop packet are the prior scallop coverage found; no dedicated fresh/generic scallop packet or integration was found.

The exact-key audit checked active reference display names and aliases, active form labels and match terms, and legacy-import candidate names and aliases. Normalization follows `normalizeIngredientSearchKey`: lowercase, NFKD, fold `œ`, `æ`, `ß`, and `&`, remove combining marks, replace non-search characters with spaces, and collapse whitespace.

| Normalized key or neighboring owner | Current exact owner | Interpretation |
|---|---|---|
| `scallop`, `scallops`, `pétoncle` / `petoncle`, `pétoncles` / `petoncles` | None | No active generic scallop reference, form, or legacy candidate owns these exact keys. |
| `scallop meat`, `fresh scallop(s)`, `sea scallop`, `bay scallop`, `Iceland scallop`, `Atlantic scallop`, `coquille Saint-Jacques`, `scallop roe` | None | No species- or product-qualified fresh scallop identity or form is active. |
| `dried scallop`, `dried scallops`, `pétoncle séché`, `pétoncles séchés`, `conpoy` | `ingredient-ref-dried-scallop` | Keep the existing preserved product and its aliases separate. |

The active dried-scallop identity is the only scallop-related active reference. There is no scallop-named form and no scallop-related legacy-import candidate. A bare `scallop` or `pétoncle` picker query can still return `ingredient-ref-dried-scallop` through complete-word phrase matching inside `dried scallop` / `pétoncle séché`; this is a search overlap, not an exact-key owner. The proposed generic label would appear alongside the clearly labelled dried product. `conpoy` remains only on the dried-scallop row.

## Manifest recipe audit

All **114** paths in the live `manifest.v1.json`, all **1,123** ingredient rows, and the complete UTF-8 recipe JSON documents were scanned. Whole-phrase matching after case, accent, punctuation, and whitespace normalization checked `scallop(s)`, `pétoncle(s)` / `petoncle(s)`, fresh scallop wording, `scallop meat`, sea/bay/Iceland/Atlantic scallops, `conpoy`, `coquille Saint-Jacques`, roe/coral, and the source-backed species names. The scan found **0 target matches in recipe files** and **0 target matches in ingredient rows**.

| Recipe row | Existing text | Catalog interpretation |
|---|---|---|
| `093#4` | `Cooked meat or seafood, to taste`, unlinked | A generic optional choice; it does not request scallop or any other specific seafood. |
| `019#8` | `1 lb jumbo lump crab meat`, linked to crab meat and Jumbo Lump form | A separate crab product. |
| `023#1` | `140 g sliced calamari`, linked to the calamari identity | A separate squid/calamari ingredient. |

No recipe link, recipe edit, or ingredient relink is proposed.

## Live package, ledger, generated-catalog, and recipe snapshot

Snapshot checked on 2026-10-12 before writing this proposal. File hashes cover exact bytes. The recipe-corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, exact recipe-file bytes, and a trailing NUL byte.

| Surface | Count | Bytes | SHA-256 / fingerprint |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,226 references | 392,103 | `4946cf6b6256f8d1ef2714ee534ebad44f02d29bdfbf0dfa84f20146a133220f` |
| `ingredient-forms.v1.json` | 86 forms | 64,612 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,525 records; 5,212 source entries; 4,275 distinct source IDs | 5,053,058 | `6954a3784dfff117b9ab926914123af8a503e32c18aee5ea7f90859ba115e953` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 752,942 | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `BundledIngredientCatalog.kt` | 1,226 references | 537,040 | `8cf3119845a873644779c118a3e58963d8215058a46564954546b2362ecf5a3c` |

The proposal-local IDs `WP04-FRESH-SCALLOP-IDENTITY-20261012-S01` through `S06` were checked against the live shared ledger and existing proposal/batch documentation before use; none was present.

## Source register

Sources were accessed on 2026-10-12. They support consumer naming, species scope, and product distinctions only. No numeric conversion, yield, density, or substitution claim is used.

| Source ID | Source and evidence used | Limit |
|---|---|---|
| `WP04-FRESH-SCALLOP-IDENTITY-20261012-S01` | Office québécois de la langue française, [pétoncle (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1199062/petoncle). Normalized Québec name, English `scallop` / `scallop meat`, marketed adductor muscle with occasional attached coral, and the Québec distinction from European `coquille Saint-Jacques`. | Last updated 1998. Terminology evidence; does not select a scallop species or establish a recipe amount. |
| `WP04-FRESH-SCALLOP-IDENTITY-20261012-S02` | Fisheries and Oceans Canada, [Identification des mollusques bivalves](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm), “Pétoncles.” Names Iceland, sea, pink, and spiny scallops with Latin taxa and Canadian coastal locations. | Canadian species/harvest identification, not an interchangeability or cooking-conversion source. |
| `WP04-FRESH-SCALLOP-IDENTITY-20261012-S03` | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), checked for *Amusium pleuronectes*, *Chlamys islandica*, *C. rubida*, and *Placopecten magellanicus*. Multiple species rows use `Scallop` and/or `Pétoncle`, alongside species-specific names. | Common names are species-linked. The list supports a consumer group name but does not establish species equivalence or Canadian harvest for every listing. |
| `WP04-FRESH-SCALLOP-IDENTITY-20261012-S04` | CFIA, [Canadian Standards of Identity: Volume 3 — Fish](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-standards-identity-volume-3), sections 10–11. Separately names breaded scallops and scallop meat and specifies what the meat standard excludes. | A regulatory product standard; its composition rules are not recipe conversions or global form definitions. |
| `WP04-FRESH-SCALLOP-IDENTITY-20261012-S05` | Metro Québec, [Pétoncles](https://api.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/petoncles). Consumer guide calls scallop a common name for multiple Pectinidae species, identifies the adductor muscle as the marketed North American product, and describes fresh and frozen availability. | Retail consumer guidance, not a species or universal preparation standard. The page redirects to English when opened directly; the French search result and URL were checked. |
| `WP04-FRESH-SCALLOP-IDENTITY-20261012-S06` | Mayrand Québec, [Pétoncle surgelé](https://mayrand.ca/fr/nos-produits/surgele/fruit-de-mer-surgele/petoncle-surgele). Current frozen-product catalog groups generic scallop with `Pétoncles de baies`, Hokkaido, and brand-qualified packages. | Product listings use vendor-specific names; some locations showed “coming soon.” No species, aliases, forms, or package conversion is inferred. |

## Integration record

The held candidate was promoted in place. The reference has only the display names `scallop / pétoncle`
and the aliases `scallops`, `pétoncles`, and `scallop meat`. Six new source entries and an accepted
decision were added to the existing ledger record. The dried-scallop row remains separate. No forms,
measurements, recipe links, or numeric behavior were added. Package validation, reference
normalization, generated-catalog freshness, ledger validation, exact-key ownership, recipe scanning,
UTF-8/no-BOM, and scoped whitespace checks passed. No tests or emulator checks were run because this
change only adds database JSON data under `AGENTS.md`. See
`../batches/wp04-section-p-scallop-identity-integration-20261012/README.md`.

## Remaining Section P gaps

This proposal addresses only the generic scallop identity and does not close the open Section P parent work. The live plan continues to track shrimp/prawn by preparation; generic crab and crayfish boundaries; generic mussel beyond blue mussel; the clam, oyster, and cockle/coque holds; other fish species and vernacular names; preserved seafood product states; fish powder, fish balls, and surimi; roe products; and sea urchin, abalone, conch, whelk, sea cucumber, and regional seafood. Keep the separate dried-scallop identity, the accepted dried shrimp/oyster identities, and the already-reviewed crab, lobster, mussel, squid/calamari, cuttlefish, and octopus boundaries intact.
