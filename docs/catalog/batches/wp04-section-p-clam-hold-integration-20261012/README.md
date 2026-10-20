# WP04 Section P — generic clam / palourde hold (2026-10-12)

## Decision

Keep the existing `ingredient-ref-clam` ledger candidate unresolved. Do not promote an unqualified
`clam / palourde` identity or add species names, product forms, or aliases. CFIA applies `Clam` to
several taxa with different French common names; DFO’s Canadian bivalve guide lists multiple harvested
clam species and French labels; OQLF retains Québec commercial fish terms at species scope. A
Montréal fish-shop `Palourdes` collection groups Littleneck, Pasta, Savoury, Cherrystone, razor clams,
New Zealand coques, myes, chowder, breaded clams, and canned products. This supports a broad retail
category, not a single species-stable ingredient identity.

The 114 manifest-listed recipes contain no clam ingredient row. Recipe 093#4 remains an unlinked
`Cooked meat or seafood, to taste` catch-all and does not request clams. Keep the hold until a recipe
or requested product establishes a specific market type or species.

Full evidence and the exact-name audit are in the
[generic clam / palourde boundary review](../../proposals/wp04-section-p-clam-quebec-market-boundary-review-20261012.md).

## Evidence checked

- [CFIA Fish List lookup](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp) maps `Clam` to multiple species and French names, including `Mye`, `Mactre d’Amérique`, `Palourde`, and `Couteau de l’Atlantique`.
- [DFO French bivalve identification guide](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-fra.htm) lists multiple Canadian clam species and uses `Palourde américaine` for *Arctica islandica*.
- [OQLF’s `mye` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198878/mye) identifies *Mya arenaria* and says broad alternatives `clam`, `coque`, `palourde`, and `quahog` were not retained for Québec fish-product marketing.
- [Poissonnerie La Mer’s Montréal `Palourdes` collection](https://www.lamer.ca/collections/palourdes) presents several species, product names, and preparations under one retail heading.

## Package boundary

The existing ledger candidate remains `candidate` / `needs_clarification`, with three existing source
records; no source was appended and no active catalog or recipe data changed. Root exact-key review
found no active reference, form, or legacy owner for the clam candidate terms. The 114-recipe,
1,123-row audit found zero clam ingredient hits. The separate cockle/coque candidate remains distinct.

No tests or emulator checks were run; this hold changes documentation only.
