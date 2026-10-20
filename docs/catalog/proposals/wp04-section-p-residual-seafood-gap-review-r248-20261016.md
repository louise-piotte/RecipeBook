# WP04 Section P residual seafood identity review — opah (R248)

**Review date:** 2026-10-16
**Disposition:** Integrated as one identity-only, species-neutral market-group reference: `opah / opah`, category `PROTEIN`. Aliases, forms, active measures, recipe links, and substitutions remain empty. No *Lampris* taxon is encoded on the catalog row. See the [R248 integration README](../batches/wp04-section-p-opah-identity-integration-r248-20261016/README.md).

## Candidate and proposed catalog shape

| Field | Recommendation |
|---|---|
| Reference ID | `ingredient-ref-opah` |
| Category | `PROTEIN` |
| English display | `opah` |
| French display | `opah` |
| English / French aliases | `[]` / `[]` |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, substitutions | None |

This is a market-name identity for products sold as opah. It does not assert that every opah product is *Lampris guttatus* or another single species. The catalog DTO has no separate taxon field; keep the species caveat in research evidence if the row is accepted.

## Why this is not duplicate work

The Section P plan still leaves the finfish and regional-fish checklist open, and WP04 remains in progress in `roadmap.md`. I searched the plan, all 265 `wp04-section-p` proposal files, all 154 matching batch files, active references and forms, legacy candidates, and research-ledger records for `opah`, `Lampris`, `moonfish`, `poisson-lune`, and related names. There is no focused opah review, active identity, form, legacy candidate, or ledger identity record.

One neighboring proposal mentions `Moonfish` only as a CFIA common-name term for cusk and explicitly rejects it as a cusk alias: [`wp04-section-p-cusk-brosme-species-identity-review-20261012.md`](wp04-section-p-cusk-brosme-species-identity-review-20261012.md). That is relevant to alias ownership, not an opah decision. Recent fish-ball/surimi, roe, and canned/smoked product reviews concern separate product families and are not reopened here.

At this review snapshot, the active catalog contains **1,638 references** and **122 forms**; the legacy file has **61 candidates**, and the research ledger has **1,983 records**. Exact searches found no owner for `opah`, `moonfish`, `moon fish`, `poisson lune`, `poisson-lune`, `Lampris`, `Lampris guttatus`, `saumon des dieux`, or `Jerusalem haddock` in the active references, forms, legacy candidates, or ledger.

## Name evidence, scope, and picker behavior

CFIA’s Fish List currently records *Lampris guttatus* with the accepted common-name pair **Opah / Opah**. It also lists `Moonfish / Lampris` and `Poisson Lune` under that taxon. The list is Canadian fish-labelling name evidence; the result page reports its last modification as **2023-09-18**, so it should not be treated as a current taxonomic review. [S01]

Metro’s Québec fish guide uses `opah` in its French heading and body, confirming the word as Québec-facing food terminology. Its page also calls the fish `poisson-lune`, but it gives no species or publication date and is an informational page rather than evidence of current store stock. [S02]

The Canadian supplier Seafood Depot (Vaughan, Ontario) lists an opah product for special order and describes whole or fillet presentations, fresh or frozen condition, wild Hawaii origin, and U.S. product origin. The seller supplies the binomial *Lampris guttatus*, but that is a vendor product-page claim, not a taxonomic determination. The page has no publication date or package weight. [S03]

NOAA Fisheries’ page, last updated **2026-06-26**, describes opah as `Lampris guttatus, Lampris spp.` and reports that genetic analyses distinguish multiple opah species, including different species off California and Hawaii. This current government evidence makes a single-species catalog scope inappropriate for the common market word. Use the shared market display `opah` without a scientific-name alias or species claim. [S04]

Do not activate `poisson-lune` as an alias: OQLF’s GDT entry, last updated **1990**, defines that Québec term as *Mola mola* (sunfish), creating a real cross-species naming conflict despite Metro’s retail-language usage. Do not activate English `moonfish` either: CFIA assigns it to cusk (*Brosme brosme*) and other taxa, including *Mene maculata* and *Selene setapinnis*. `Lampris`, `Lampris guttatus`, `saumon des dieux`, `Jerusalem haddock`, and `kingfish` are not needed to make the accepted display searchable. [S01, S05]

The current phrase-first picker returns no result for `opah`. With the proposed bilingual display and no aliases, an `opah` query returns the one opah identity. Queries for `moonfish`, `poisson-lune`, and `Lampris` remain unassigned; adding them would make broader or disputed names look uniquely resolved. The `fish` query is unchanged because neither display contains that word.

## Recipe demand, product states, and quantities

The manifest contains **114 recipes** and **1,123 ingredient rows**. I searched each row and the full parsed recipe documents for `opah`, `moonfish`, `moon fish`, `poisson lune`, `poisson-lune`, `Lampris`, `Lampris guttatus`, `saumon des dieux`, and `Jerusalem haddock`; there were **zero matches**. No bundled recipe link is supported.

The supplier’s whole/fillet, fresh/frozen, wild-caught, and Hawaii-origin descriptions belong to that source listing. They do not justify catalog forms or conversions. NOAA’s general nutrition panel reports one raw **4 oz (113 g)** serving; that is a U.S. reference serving, not a Canadian package amount or a household measure. The reviewed Canadian product listing gives no package weight. Retain no default serving, density, unit mapping, or package conversion. [S03, S04]

Metro says opah can replace tuna or salmon in recipes, and NOAA offers it as a substitute in tuna or swordfish recipes. These are broad editorial suggestions without tested ratios or recipe-specific constraints. They do not justify a global form rule or a contextual substitution. Add none. [S02, S04]

## Sources

| ID | Source and date | Evidence and limit |
|---|---|---|
| S01 | CFIA, [Fish List lookup results](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp), list last modified 2023-09-18; accessed 2026-10-16. | Lists *L. guttatus* as `Opah / Opah`, plus `Moonfish / Lampris` and `Poisson Lune`; also assigns Moonfish to cusk and other taxa. Common-name / labelling evidence; predates the more recent official discussion of multiple opah species. |
| S02 | Metro Québec, [Tout sur l’opah](https://api.metro.ca/produits-a-decouvrir/poissonnerie/nos-poissons-et-fruits-de-mer/opah), undated page; accessed 2026-10-16. | French Québec-facing food wording, storage guidance, and editorial substitution statements. Not a dated stock listing, species identification, or tested substitution study. |
| S03 | Seafood Depot, [Opah](https://www.seafooddepot.ca/product-opah), undated listing; accessed 2026-10-16. | Vaughan, Ontario supplier; special-order whole/fillet product listing with seller-stated species, origin, and fresh/frozen availability. No package weight, label image, or date establishing when the listing was last verified. |
| S04 | NOAA Fisheries, [Opah: Science](https://www.fisheries.noaa.gov/species/opah/science), last updated 2026-06-26; accessed 2026-10-16. | Describes `Lampris guttatus, Lampris spp.`, multiple species and regional differences, and a 4 oz (113 g) raw nutrition serving. U.S. fishery and nutrition-profile evidence; serving is not a Canadian package measure. |
| S05 | OQLF GDT, [poisson-lune](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17487799/poisson-lune), last updated 1990; accessed 2026-10-16. | Assigns the Québec term `poisson-lune` to *Mola mola*. The entry is old and covers sunfish terminology, not opah; it is sufficient to flag the phrase as unsafe for this picker. |
| S06 | Underkoffler et al., [A taxonomic review of *Lampris guttatus* with descriptions of three new species](https://www.mapress.com/zt/article/view/zootaxa.4413.3.9), published 2018-04-23. | Primary taxonomic review establishing that the former broad *L. guttatus* concept contained multiple species. NOAA’s 2026 page is the more current summary used for the market-scope recommendation. |

## Integration result

Added `ingredient-ref-opah` with English and French display `opah`, category `PROTEIN`, empty aliases, no density, and no unit mappings. Recorded the source boundaries in the research ledger. The canonical bundle now has 1,640 references, 124 forms, and 1,987 ledger records. Static package, schema, generated-index, source-ID, and exact-name checks passed. No software tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.
