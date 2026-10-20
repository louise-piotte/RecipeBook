# WP04 Section P — octopus / pieuvre identity gap sweep

- **Review and source access date:** 2026-10-12.
- **Scope:** the held `ingredient-ref-octopus` candidate; exact-key ownership in active references, forms, and legacy imports; current Canadian and Québec terminology and product evidence; and all manifest-listed recipe files.
- **Recommendation:** promote the existing candidate to one identity-only `PROTEIN` reference for the unqualified consumer product name **octopus / pieuvre**, with the directly supported French alias **poulpe**. Keep named species and prepared or size-specific products outside this row.
- **Proposal status:** integrated on 2026-10-12 as an identity-only reference. The active ref and candidate ledger record were updated; see [integration README](../batches/wp04-section-p-octopus-identity-integration-20261012/README.md).

## Integration status (2026-10-12)

Root review accepted the narrow identity-only recommendation. Added `ingredient-ref-octopus` as `octopus / pieuvre`, with `poulpe` as its sole French alias and `PROTEIN` category. Promoted the existing ledger candidate to `ingredient_reference` / `verified`, added the seven source records below, and kept measurement and substitution research unresearched. No recipe link, form, density, unit mapping, conversion, yield, or substitution was added. The proposal-review counts and hashes below are a pre-integration snapshot; the post-integration package and ledger checks are recorded in the [integration README](../batches/wp04-section-p-octopus-identity-integration-20261012/README.md).

## Recommendation

The current Canadian and Québec evidence supports a narrow consumer identity. The CFIA Fish List applies `Octopus`, `Pieuvre`, and `Poulpe` across generic and species-specific common-name rows; the listings include *Octopus* spp., *Octopus vulgaris*, and *Enteroctopus dofleini*. OQLF's food-mollusc entry gives `pieuvre` and `poulpe` as preferred French terms for English `octopus`, while a 2025 OQLF entry reports that `pieuvre` is commonly used and well known in Québec. Current Québec retailers list frozen octopus and separate pieuvre and poulpe products. Together these sources support one unqualified market identity, without selecting a species or preparation state.

Use **octopus** as the English display and **pieuvre** as the Québec French display, with only the explicitly sourced singular French alias **poulpe**. No other aliases are proposed. `Poulpe` is not inferred from a similar seafood name: it appears as a preferred OQLF term and as a CFIA common name. The common name spans different taxa, so the row is a consumer ingredient identity, not a taxonomic assertion. Keep *Octopus vulgaris*, *Enteroctopus dofleini*, *Bathypolypus arcticus*, vendor-listed *Eledone polypus*, and other species names out of the aliases.

There is no octopus-specific ingredient request in the bundled recipes. Recipe 093#4 says only `Cooked meat or seafood, to taste`; that unlinked catch-all does not select octopus. Recipe 023#1 requests `140 g sliced calamari` and remains with the separate active `ingredient-ref-calamari`. Current Canadian and Québec product listings independently establish a recognizable market category, but this proposal creates no recipe link or recipe demand claim.

## Identity-only row

| ID | Category | English display | Québec French display | Aliases | Scope |
|---|---|---|---|---|---|
| `ingredient-ref-octopus` | `PROTEIN` | **octopus** | **pieuvre** | French: `poulpe`; no English aliases | Unqualified consumer product name for octopus sold as food; no single species, cut, processing state, or harvest origin selected. |

Promote the existing held candidate under the same ID. Add no forms, recipe links, density, unit mappings, conversion, package yield, edible yield, or substitution. The French alias is limited to the explicitly attested singular `poulpe`; do not generate plural aliases or add `tako`, species names, or product descriptors.

## Naming and product boundaries

| Term or product | Decision |
|---|---|
| **Octopus / pieuvre / poulpe** | Use the labels in the identity-only row. `Pieuvre` is the Québec display; `poulpe` is the sole French alias because OQLF and CFIA explicitly attest it. The generic market identity is not a Latin taxon. [S01–S03] |
| **Named species** | Do not add *Octopus vulgaris*, *Enteroctopus dofleini*, *Bathypolypus arcticus*, or *Eledone polypus* as aliases or treat any one as the species behind unqualified product labels. CFIA and OQLF entries and a Canadian seller's listing associate octopus names with multiple taxa. [S01–S03, S07] |
| **`tako`** | Do not add as an alias. One Canadian seafood seller labels it as a sushi name for a listed octopus product; that vendor-specific use does not establish a general Canadian or Québec ingredient alias. [S07] |
| **`baby octopus`, T4/T7, whole, tentacles, frozen, grilled, marinated, or prepared packs** | Keep these product, size, grade, or presentation details out of the identity row. Retail listings use multiple such descriptors, but they do not establish a global form taxonomy, recipe mapping, or amount. [S05–S07] |
| **Squid / calamari / calmar** | Keep on the active `ingredient-ref-calamari`. Its `squid` alias remains there; none of these names belongs on octopus. Recipe 023#1 is the bundled calamari request. |
| **Cuttlefish / seiche** | Keep on the separate active `ingredient-ref-cuttlefish`. Do not alias cuttlefish to octopus or vice versa. |
| **Cephalopod; seafood / fruits de mer** | Do not use broad class or seafood-mix terms as aliases for this named ingredient. The prior CFIA labeling source `WP04-DOYS-S04` remains a class-boundary reference, not an octopus identity source. |
| **Recipe quantities or DFO harvest limits** | Do not derive recipe measures, edible yield, or conversions. DFO's current area-specific recreational limit is a fishery regulation, not a cooking portion or conversion observation. [S04] |

## Exact-key ownership and ledger state

The exact-key audit followed `normalizeIngredientSearchKey` in `IngredientSearch.kt`: lowercase, NFKD, fold `œ`/`æ`/`ß` and `&`, remove combining marks, replace punctuation with spaces, then collapse whitespace. It compared active reference names and aliases, form labels and match terms, and legacy candidate names and aliases. Exact normalized phrases were checked; substring matches were not counted as exact owners.

| Exact query keys | Active exact owner / state at proposal review |
|---|---|
| `octopus`, `octopuses`, `pieuvre`, `pieuvres`, `poulpe`, `poulpes`, `common octopus`, `giant octopus`, `baby octopus`, `octopus vulgaris`, `octopus spp`, `octopod`, `octopodidae`, `tako`, and `octopus tentacles` | No exact active reference, form, or legacy-candidate owner. `ingredient-ref-octopus` exists only as the held ledger candidate. |
| `squid`, `calamari` | Exact active owner: `ingredient-ref-calamari`, the existing verified calamari reference; `squid` is its accepted English alias. |
| `cuttlefish`, `seiche` | Exact active owner: `ingredient-ref-cuttlefish`, the separate cuttlefish identity integrated in the current package. |
| `seafood`, `fruits de mer` | No exact active reference, form, or legacy-candidate owner under those exact phrases. They remain broad category terms, not octopus aliases. |

At proposal review, `ingredient-ref-octopus` was a **candidate** with `identityState: needs_clarification`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Root promoted that same record to `ingredient_reference` / `verified`, retained the two existing source entries, added the seven proposal-local source entries, and replaced the unresolved hold with the accepted identity decision. Measurement and substitution research remain unresearched.

## Complete bundled-recipe audit

All 114 recipe paths listed in the current `manifest.v1.json`, all 1,123 `ingredients[]` rows, and the full JSON text of every listed recipe were scanned for `octopus`, `pieuvre`, `poulpe`, `tako`, octopod terms, and the named genera reported in the source listings. There are **zero octopus-specific ingredient-row hits** and **zero full-file hits** for those terms.

| Recipe row | Exact ingredient text | Boundary |
|---|---|---|
| 023#1 | `140 g sliced calamari` | Existing `ingredient-ref-calamari`; a squid/calamari request, not octopus demand. |
| 093#4 | `Cooked meat or seafood, to taste` | Unlinked generic choice; it does not identify octopus or any cephalopod. |

The package has no basis for an octopus recipe link, amount, form, or substitution.

## Refreshed package, ledger, and generated-catalog snapshot

Proposal-review snapshot read from the shared worktree on **2026-10-12**, after the cuttlefish integration and concurrent package updates. Hashes cover exact file bytes. The recipe-corpus digest hashes sorted recipe basenames, NUL, exact file bytes, NUL.

| Artifact | Count | SHA-256 / digest |
|---|---:|---|
| `ingredient-references.v1.json` | 1,218 references | `a446785f1cd9b409d9220ab6471dff9b9834ff7a7c9333bcbcae49352ff43933` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,520 records; 5,139 source entries; 4,202 distinct source IDs | `a8c9e1e7597d29535831c7b43d3bb5627f5f78905567add80753ea61b51d68d2` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | `b70a826e18497a37ce343f6c98cafa143d573dd59704ea6022bb034b2640e5a2` |
| `BundledIngredientCatalog.kt` | 1,218 generated reference entries | `453204d42068302ec9ec1891e93c9a649f96e1714c8a79f046fd96676ca9aade` |

The seven source IDs `WP04-OCTOPUS-IDENTITY-20261012-S01` through `S07` were checked absent from the ledger and existing proposal/batch files before assignment. Root added them to the existing octopus ledger record during integration; the proposal snapshot above records the prior state.

## Sources

All new sources were accessed on 2026-10-12. IDs are unique to this proposal.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-OCTOPUS-IDENTITY-20261012-S01** | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) | Current lookup rows list *Octopus* spp. as `Octopus / Poulpe` and `Pieuvre`; *Octopus vulgaris* as `Common Octopus / Poulpe` plus French `Pieuvre commune`, `Poulpe commun`, and `Pieuvre`; and *Enteroctopus dofleini* as `Octopus / Poulpe` and `Giant Octopus / Pieuvre`. This supports a broad common-name identity while showing that the names do not select one species. |
| **WP04-OCTOPUS-IDENTITY-20261012-S02** | OQLF, [pieuvre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8402783/pieuvre) | Food-mollusc entry gives English `octopus` and the preferred French terms `pieuvre` and `poulpe`. Its 1992 definition and Latin field focus on *Octopus vulgaris* and European coasts, so they do not establish a single species for all Canadian products. |
| **WP04-OCTOPUS-IDENTITY-20261012-S03** | OQLF Vitrine linguistique, [pieuvre boréale (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26583570/pieuvre-boreale) | 2025 zoology entry for *Bathypolypus arcticus* says `pieuvre` is commonly used and well known in Québec, unlike `poulpe`. It supports the Québec display preference and demonstrates another taxon; it is not itself a food-product or generic species entry. |
| **WP04-OCTOPUS-IDENTITY-20261012-S04** | Fisheries and Oceans Canada, [BC tidal area 28 recreational fishing limits](https://www.pac.dfo-mpo.gc.ca/fm-gp/rec/tidal-maree/a-s28-eng.html) | Current area-specific regulations list `Octopus` among managed invertebrates and the page was last updated 2026-06-09. This is Canadian species-category terminology and a harvest rule, not evidence for recipe quantities or a consumer cut/form. |
| **WP04-OCTOPUS-IDENTITY-20261012-S05** | Mayrand Food Depot, [Frozen Octopus T7](https://mayrand.ca/en/our-products/fish-and-seafood/squid/pieuvre-poulpe-t7-surgele-51000) | Québec retailer lists `Frozen Octopus T7`, SKU 51000, approximately 1 kg, with store stock shown for Anjou, Laval, Brossard, and Saint-Jérôme. The page does not identify a species; the product grade and frozen presentation are not global forms or aliases. |
| **WP04-OCTOPUS-IDENTITY-20261012-S06** | La Mer, [Calmars & Pieuvre product collection](https://www.lamer.ca/collections/calmars-pieuvre) | Québec fish-shop collection uses `Pieuvre` for T4 Morocco, marinated, grilled, and tentacle products, and `Poulpe` for Galician-sauce and olive-oil packs. It lists squid products separately. These names support Québec consumer wording but the listed preparations remain distinct products. |
| **WP04-OCTOPUS-IDENTITY-20261012-S07** | Seafood Depot (Vaughan, Ontario), [Octopus](https://www.seafooddepot.ca/product-octopus) | Canadian seafood seller uses the heading `Octopus`, lists *Eledone polypus*, and describes frozen/wild products, sizes, a sushi name `Tako`, and a `baby octopus` count category. Those are vendor-specific product claims and descriptors; no species, alias, form, or numeric behavior is inferred for the catalog. |

Reused ledger sources: `WP04-DOYS-S04` (CFIA, [Labelling requirements for fish and fish products](https://inspection.canada.ca/en/food-labels/labelling/industry/fish)) and `WP04-MOLLUSKS-20261009-S11` (OQLF, [pieuvre (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8402783/pieuvre)). They are referenced by their existing IDs and are not duplicated among the seven proposal-local sources.

## Remaining Section P gaps

This proposal addresses only the held octopus candidate. Section P remains open for generic crab beyond the recipe-specific jumbo-lump crab-meat identity; lobster, crayfish, langoustine, clam, generic mussel, fresh oyster, and generic/fresh scallop boundaries; and the unqualified cockle/coque and eel holds. The [mollusk boundary review](wp04-mollusks-shellfish-cephalopods-boundary-review-20261009.md), [cockle/coque review](wp04-cockle-coque-identity-boundary-review-20261011.md), and [eel review](wp04-unqualified-eel-identity-boundary-review-20261011.md) track those separate decisions. The [red-hake checkpoint](wp04-section-p-next-finfish-gap-sweep-20261012.md) leaves generic hake/pollock and bare `goberge` unresolved. The [preserved-seafood review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) still owns product-state questions; roe, fish powders, fish balls/surimi, regional aquatic foods, and measurement/substitution research remain outside this identity decision. The squid/calamari and [cuttlefish/seiche](wp04-section-p-cuttlefish-identity-gap-sweep-20261012.md) rows retain their separate accepted boundaries.

No tests or emulator checks were run because the integration only adds database JSON data and its generated index under `AGENTS.md`.
