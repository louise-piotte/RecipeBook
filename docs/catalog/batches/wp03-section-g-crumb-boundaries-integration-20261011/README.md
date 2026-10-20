# WP03 Section G crumb-boundary integration — 2026-10-11

## Scope

This batch resolves the remaining Section G identity and state questions for generic bread crumbs,
Graham crumbs, bread cubes, and the exact packaged phrase “stuffing croutons.” The other separate
identities for panko, cracker crumbs, matzo meal, and croutons remain in place.

## Integrated data

- Retained `ingredient-ref-breadcrumbs` as one generic bread-crumb identity. Added `fresh` and
  `dried` forms with the Québec labels *mie de pain fraîche* and *chapelure*. Moved the existing
  English term `dried bread crumbs` off the parent and onto the dried form label. No density or
  conversion was added.
- Linked only Meatloaf recipe 074, ingredient 5 (`1 cup dried bread crumbs`) to the dried form. Kept
  Turkey Meatballs recipe 018, ingredient 2 (`125 g bread crumbs`) state-neutral. The quantity,
  unit, original text, and existing `dried` / `séché` preparation on Meatloaf remain unchanged.
- Added English aliases `graham crumbs` and `graham wafer crumbs` to the existing
  `ingredient-ref-graham-cracker-crumbs`. Kept its three recipe links and its existing French display
  and alias unchanged; no Graham form or measure was inferred.
- Added the exact product phrase `stuffing croutons` to the existing `ingredient-ref-croutons`.
  Kept unqualified `stuffing cubes` and general bread cubes separate.
- Recorded generic bread cubes as a rejected active-identity candidate. Bread cubes remain exact
  recipe-line wording because cut shape does not establish bread, moisture, seasoning, or readiness.

No new ingredient reference was added. No ingredient amounts, forms beyond the two breadcrumb
states, densities, unit mappings, conversions, package yields, or substitutions were added.

## Evidence and boundaries

- The [OQLF entry for *chapelure*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8429217/chapelure)
  defines the French term for dried bread crumbs; the OQLF [*paner* entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8888028/paner)
  names *mie de pain fraîche* separately. [Canadian Living's crumb overview](https://www.canadianliving.com/food/article/kitchen-tip-3-types-of-bread-crumbs-and-how-to-use-them)
  describes fresh and dry crumbs as different textures and uses. These sources support the form
  distinction, not a universal measure or substitution.
- [Eagle Brand Canada recipes](https://www.eaglebrand.ca/fr/recettes/barres-et-biscuits/carres-rochers)
  use the existing Québec-facing French Graham wording. [Loblaws listings](https://www.loblaws.ca/en/search?search-bar=graham+crumbs)
  and [Walmart Canada](https://www.walmart.ca/en/ip/Great-Value-Honey-Graham-Crumbs/6000199822853?classType=REGULAR)
  show the Canadian product phrases `Graham Crumbs` and `Graham Wafer Crumbs`. The aliases stay
  on the biscuit-crumb identity, separate from bread crumbs, panko, cracker crumbs, matzo meal, and
  Graham flour.
- [Le Dindon du Québec's stuffing recipe](https://ledindon.qc.ca/recettes/farce-au-pain-de-marie-michele-desrosiers/)
  bakes *cubes de pain* until they become golden croutons in that recipe. [Sobeys and Safeway
  listings](https://www.sobeys.com/products/coarse-bread-cubes-340-g) confirm packaged bread-cube
  products but do not establish their common composition or readiness. [Atlantic Superstore's
  product listing](https://www.atlanticsuperstore.ca/en/stuffing-croutons/p/21339118_EA?source=nspt)
  uses the exact phrase *Stuffing Croutons* for seasoned croutons, which supports that narrow alias
  on the existing crouton identity. It does not support a general `stuffing cubes` alias.

## Package and verification

The package contains 981 ingredient references, 63 forms, and 114 recipes with 1,123 ingredient
rows. The research ledger contains 1,259 records, 4,001 source entries, and 3,270 distinct source
IDs. Ingredient-reference normalization passed and bundled seed-package validation reported the
package valid. No tests or emulator deployment were run, following the current `AGENTS.md` rule for
changes that only add database JSON data.
