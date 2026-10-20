# WP04 Section P — fresh oyster / huître identity boundary review

- **Packet type:** source-checked identity boundary review, reconciled into the active plan and roadmap.
- **Review and source access date:** 2026-10-12.
- **Status:** root accepted the evidence-based hold. Keep the existing `ingredient-ref-fresh-oyster` candidate unresolved.
- **Scope:** unqualified consumer ingredient wording for fresh oyster / huître. Exclude dried oyster, oyster sauce, vegan oyster-style sauce, oyster mushrooms, and species- or product-qualified oyster items.

## Root reconciliation

The recommendation was accepted. The specific fresh-oyster boundary is now checked in the Section P
plan and roadmap; the broader shellfish checklist remains open. No catalog, ledger, recipe, or
generated data changed. Current post-reconciliation hashes and static ownership/recipe checks are in
the [hold integration README](../batches/wp04-section-p-fresh-oyster-hold-integration-20261012/README.md).

## Recommendation

Retain `ingredient-ref-fresh-oyster` as a `candidate` with `identityState: needs_clarification`. Current Québec terminology and Canadian product sources confirm that oysters are sold under familiar consumer names, but they also show that bare `oyster / huître` does not consistently select one species or one product boundary. DFO lists three oyster species harvested in Canada. The CFIA Fish List attaches unqualified English `Oyster` and French `Huître` to multiple species rows, while its labelling guidance says common names are species-linked. OQLF's `huître` entry links the preferred Québec term to American oyster (*Crassostrea virginica*) while also distinguishing cupped and flat oyster groups. Current Québec listings name products by species or product presentation.

The manifest recipe corpus contains no oyster request. Recipe 019 asks for jumbo-lump crab meat, and recipe 093 has the optional, unlinked wording “Cooked meat or seafood, to taste”; neither selects oyster, a species, or a product state. The market and terminology evidence therefore does not establish which oyster, if any, a future recipe line should mean.

Keep the candidate separate from `ingredient-ref-dried-oyster`, `ingredient-ref-oyster-sauce`, `ingredient-ref-vegan-oyster-sauce`, `ingredient-ref-oyster-mushroom`, and `ingredient-ref-king-oyster-mushroom`. Do not activate a fresh-oyster reference, add aliases, forms, recipe links, measurements, conversions, yields, or substitutions from this review. Reopen only when a recipe or other exact ingredient request supplies a species or a sufficiently specific product scope.

## Species and product boundaries

| Evidence | What it establishes | Boundary for the catalog |
|---|---|---|
| OQLF's food-domain `huître` entry | The preferred Québec term is `huître`; the entry links it to American oyster (*Crassostrea virginica*) and notes the cupped (*Crassostrea*) and flat (*Ostrea*) groups. It says `huître de Caraquet` and `huître Malpèque` were not retained in Québec fish-product commercialization terminology. | This is useful Québec terminology evidence, but it does not make every English or French oyster label a single species across the Canadian market. Do not import named regional products as aliases. [S01] |
| Fisheries and Oceans Canada (DFO) | Its current Canadian harvest guide lists American oyster (*C. virginica*), Olympia oyster (*Ostrea conchaphila*), and Pacific oyster (*C. gigas*) as harvested species, with distinct Atlantic or Pacific contexts. | Canadian consumer use spans multiple harvested taxa. The guide is species identification evidence, not a recipe or ingredient-identity taxonomy. [S02] |
| CFIA common-name guidance and Fish List | The guidance says the Fish List supplies French and English common names and that only names listed for a fish species should be used for that species sold or processed in Canada. The live list contains unqualified `Oyster` / `Huître` entries on several species rows, including *C. gigas*, *C. virginica*, *O. conchaphila*, *O. edulis*, and *O. lurida*. | Do not treat the unqualified pair as a unique species key. The list also covers imported species and is not evidence that every listed species is harvested in Canada. [S03–S04] |
| Metro Québec product listing | The listing titled `Fresh Shucked Oysters` identifies *C. virginica*, Northwest Atlantic provenance, and a U.S. origin. The page showed the item out of stock when checked. | This confirms one species-qualified Québec retail product and one shucked presentation; it does not establish the scope of a generic recipe term or current local availability. [S05] |
| Mayrand Québec product listing | A `Malpeque Oyster x25` listing describes the Virginia oyster as *C. virginica* and ties the Malpeque name to cultivation on Prince Edward Island. | This is retailer wording for a named Atlantic product. It does not override OQLF's terminology guidance or establish a global alias. [S06] |
| Seacore Seafood Products, Vaughan, Ontario | Its shucked-oyster product family names both *C. virginica* and *C. gigas*, and lists fresh and frozen supply as well as shucked meat. | A supplier product family may span species and presentations. These options are not global forms, equivalence rules, or substitutions. [S07] |
| Seafood from Canada | Its oyster page identifies *C. virginica* and separately lists live oysters, frozen-in-shell oysters, and frozen meat among product forms. | This industry page illustrates product-state variation for a species-scoped offering; it does not support forms on an unqualified catalog candidate. [S08] |

Keep fresh or live shell oysters, shucked meat, frozen oysters, dried oyster, smoked or canned products, bottled oyster sauce, vegan oyster-style sauce, and oyster-shaped mushrooms distinct. This review makes no claim that these products are interchangeable and does not infer a species from the word `oyster` alone.

## Existing candidate and exact-key ownership audit

The live ledger has one fresh-oyster candidate, `ingredient-ref-fresh-oyster`, with `recordType: candidate`, `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Its prior unresolved decision holds a fresh-oyster row pending recipe demand and preserves the distinction from dried oyster, oyster sauces, and oyster mushrooms. It cites the existing OQLF `huître` source (`WP04-DOYS-S02`) and DFO bivalve source (`WP04-MOLLUSKS-20261009-S14`). No separate fresh-oyster proposal or integration packet was found; the 2026-10-09 broad mollusk review is the prior coverage and also recommended a hold for lack of recipe demand.

The exact-key audit checked display names and aliases in active references, labels and match terms in active forms, and display names and aliases in `legacy-import-identities.v1.json`. Normalization follows `normalizeIngredientSearchKey`: lowercase, NFKD, fold `œ`, `æ`, `ß`, and `&`, remove combining marks, replace non-search characters with spaces, and collapse whitespace.

| Normalized key or nearby owner | Current exact owner | Interpretation |
|---|---|---|
| `oyster`, `oysters`, `huître` / `huitre`, `huîtres` / `huitres` | None | There is no active generic oyster key. |
| `fresh oyster(s)`, `live oyster(s)`, `shucked oyster(s)`, `oyster meat`, `American oyster`, `Atlantic oyster`, `Pacific oyster`, `Olympia oyster` | None | No species- or product-qualified fresh-oyster identity or form is active. |
| `dried oyster`, `dried oysters`, `huître séchée`, `huîtres séchées` | `ingredient-ref-dried-oyster` | Keep the existing preserved product distinct. |
| `oyster sauce`, `sauce d'huître`, `sauce d'huîtres` | `ingredient-ref-oyster-sauce` | Bottled condiment identity, not fresh oyster. The legacy file also has a stale same-ID `oyster sauce` candidate using `sauce aux huitres`; do not promote it. |
| `vegan oyster sauce`, `sauce aux huîtres végane` | `ingredient-ref-vegan-oyster-sauce` | Vegan condiment identity, not oyster meat. |
| `oyster mushroom`, `oyster fungus`, `pleurote en huître`; `king oyster` / `king oyster mushroom` | `ingredient-ref-oyster-mushroom`; `ingredient-ref-king-oyster-mushroom` | Mushroom names remain distinct from shellfish. `king oyster` is a mushroom alias, not a mollusk term. |

No active form or legacy-import candidate owns an exact fresh-oyster key. The only oyster-related legacy candidate found is the unreviewed, same-ID oyster-sauce row. The ledger's existing fresh-oyster candidate is not an active reference and does not establish a recipe link.

## Manifest recipe audit

All **114** paths in the live `manifest.v1.json`, all **1,123** ingredient rows, and the complete UTF-8 recipe JSON documents were scanned. Whole-phrase matching after case, accent, punctuation, and whitespace normalization checked `oyster(s)`, `huître(s)` / `huitre(s)`, fresh, live, and shucked oyster wording, oyster meat, American/Atlantic/Pacific/Olympia oyster, and *Crassostrea* / *Ostrea* names. The scan found **0 target matches in recipe files** and **0 target matches in ingredient rows**.

| Recipe row | Existing text | Catalog interpretation |
|---|---|---|
| `019#8` | `1 lb jumbo lump crab meat`, linked to the crab-meat identity and Jumbo Lump form | A recipe-specific crab product; it does not request oyster or generic shellfish. |
| `093#4` | `Cooked meat or seafood, to taste`, unlinked | An optional species-unspecified catch-all. It cannot select oyster, a species, or a product state. |

No recipe link or recipe data change is proposed.

## Live package, ledger, generated-catalog, and recipe snapshot

Snapshot checked on 2026-10-12 before writing this proposal. File hashes cover exact bytes. The recipe-corpus fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, the exact recipe-file bytes, and a trailing NUL byte.

| Surface | Count | Bytes | SHA-256 / fingerprint |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,225 references | 391,768 | `c6a949abe54b0598fa9db207aad047a51ecb2fdfac72d689bf4454c70bae141e` |
| `ingredient-forms.v1.json` | 86 forms | 64,612 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,524 records; 5,203 source entries; 4,266 distinct source IDs | 5,045,553 | `b21803cad548fec3e0ed94ceeced3eea072c2e96b393393dfe3c5d29e81e7433` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 752,942 | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| `BundledIngredientCatalog.kt` | 1,225 references | 536,587 | `d4f678974c5ac8939108afbd2f54f72642bdacd049f417f94afca5215c89eabc` |

The proposal-local IDs `WP04-FRESH-OYSTER-IDENTITY-20261012-S01` through `S08` were checked against the live shared ledger and existing proposal/batch documentation before use; none was present.

## Source register

Sources were accessed on 2026-10-12. They establish consumer wording, species boundaries, and product distinctions only; no quantity, safety, conversion, yield, or substitution claim is used.

| Source ID | Source and evidence used | Limit |
|---|---|---|
| `WP04-FRESH-OYSTER-IDENTITY-20261012-S01` | Office québécois de la langue française, [huître (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198865/huitre). Preferred Québec term; linked English and Latin terms are American oyster and *Crassostrea virginica*. The note distinguishes cupped and flat oyster groups and discusses rejected Caraquet/Malpèque appellations in Québec commercial terminology. | The entry is dated 2012. It does not define one unqualified English oyster identity across all species or imported products. |
| `WP04-FRESH-OYSTER-IDENTITY-20261012-S02` | Fisheries and Oceans Canada, [Identifying bivalve shellfish](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm), “Oysters.” Lists harvested American oyster (*C. virginica*), Olympia oyster (*O. conchaphila*), and Pacific oyster (*C. gigas*). | Species and Canadian harvest identification, not a consumer recipe taxonomy or product equivalence. |
| `WP04-FRESH-OYSTER-IDENTITY-20261012-S03` | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), sections 2 and 4. Explains that the CFIA Fish List provides recognized English/French names and that only names listed for a species should be used for that species in Canada. | Labelling guidance does not decide which oyster a recipe means. |
| `WP04-FRESH-OYSTER-IDENTITY-20261012-S04` | CFIA, [Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), checked for *Crassostrea gigas*, *C. virginica*, *Ostrea conchaphila*, *O. edulis*, and *O. lurida*. Multiple rows include the unqualified English `Oyster` and/or French `Huître`, alongside species-qualified names. | The list is species-linked and covers foods sold or processed in Canada; it does not imply that all its species are harvested in Canada. |
| `WP04-FRESH-OYSTER-IDENTITY-20261012-S05` | Metro Québec, [Fresh Shucked Oysters / Huîtres fraîches Bevans](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/huitres/huitres-fraiches/p/080077081119). Product page identifies *C. virginica*, Northwest Atlantic provenance, U.S. origin, and one-by-one sales. | The listing displayed out of stock at review time. One product is not a universal fresh-oyster definition. |
| `WP04-FRESH-OYSTER-IDENTITY-20261012-S06` | Mayrand, [Malpeque Oyster x25](https://mayrand.ca/en/our-products/fish-and-seafood/oyster/huitre-malpeque-53145). Québec retailer page identifies *C. virginica* and links Malpeque wording to Prince Edward Island cultivation. | Retailer wording for one named item; not an alias decision or generic French standard. |
| `WP04-FRESH-OYSTER-IDENTITY-20261012-S07` | Seacore Seafood Products, [Shucked Oysters](https://www.seacoreseafood.com/product/Shucked_Oysters). Vaughan, Ontario supplier lists *C. virginica* and *C. gigas* in its shucked-oyster product family and lists fresh/frozen supply. | Supplier-specific product family; no universal form or interchangeability is inferred. |
| `WP04-FRESH-OYSTER-IDENTITY-20261012-S08` | Seafood from Canada, [Oysters](https://seafoodfromcanada.ca/seafood/oysters/). Identifies *C. virginica* and separately lists live, frozen-in-shell, and frozen-meat market presentations. | Industry product overview; its presentation list does not justify catalog forms or recipe quantities. |

## Remaining Section P gaps

This packet addresses only the held fresh-oyster boundary and does not close the open Section P parent work. The live plan continues to track shrimp/prawn by preparation; generic crab and crayfish boundaries; generic mussel beyond blue mussel; clam, cockle/coque, and generic/fresh scallop beyond the separate dried-scallop product; remaining fish species and vernacular names; preserved fish/seafood product states; fish powder, fish balls, and surimi; roe products; and sea urchin, abalone, conch, whelk, sea cucumber, and regional seafood. The existing accepted dried oyster, oyster sauces, mushroom identities, American lobster, langoustine, blue mussel, calamari/squid, cuttlefish/seiche, and octopus/pieuvre boundaries remain separate.
