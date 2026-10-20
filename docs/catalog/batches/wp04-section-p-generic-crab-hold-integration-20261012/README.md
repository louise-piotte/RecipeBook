# WP04 Section P — generic crab hold (2026-10-12)

## Decision

Kept a separate unqualified `crab / crabe` ingredient reference held beyond the verified
`ingredient-ref-crab` (`crab meat / chair de crabe`) and its `ingredient-form-crab-jumbo-lump` form.
The active reference is species-unspecified crab meat, not a whole-crab identity.

CFIA's Fish List and OQLF apply crab names to multiple taxa. Canadian and Québec sources describe
multiple named crab species, and Québec retailers distinguish live crab, cooked/frozen sections,
and picked meat. Recipe 019#8 already requests `1 lb jumbo lump crab meat` and links to the existing
reference and grade form. The dish title `Crab Balls` does not ask for a separate whole-crab
ingredient. Current search already returns the crab-meat reference for bare `crab` and `crabe`
queries because those words occur as complete phrases in `crab meat` and `chair de crabe`; a second
generic row would overlap that result without resolving the product scope.

No new active reference, alias, form, ledger record, recipe link, measurement, conversion, yield, or
substitution was added. Existing crab-meat and Jumbo Lump data remain unchanged. Section P remains
open for the other held seafood identities.

The reviewed evidence is summarized in the
[generic crab boundary proposal](../../proposals/wp04-section-p-generic-crab-identity-boundary-review-20261012.md).
Sources include [OQLF's broad `crabe` entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488189/crabe),
the [CFIA Fish List results for crab](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&q=crab),
[DFO's 2026–27 Pacific crab fishery plan](https://www.pac.dfo-mpo.gc.ca/fm-gp/mplans/crab-crabe-ifmp-pgip-sm-eng.html),
the [Canadian seafood guide](https://www.chooseseafood.ca/fr/seafood-guide/crab),
[La Mer's Québec snow-crab collection](https://www.lamer.ca/collections/crabe-des-neiges),
[Fruits de mer Madeleine's local crab-meat listing](https://www.fruitsdemermadeleine.com/nos-produits/nos-crabes/crabe-commun/chair-de-crabe-commun),
and [OQLF's definition of crab croquettes](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26503150/croquette-de-crabe).

## Live package snapshot at reconciliation

No package data changed in this batch. These hashes describe the live package after the earlier
cream-of-rice integration. The recipe-corpus digest hashes each manifest-relative path, a NUL byte,
the exact recipe bytes, and a trailing NUL byte in manifest order.

| Artifact | Count/state | SHA-256 or corpus digest |
| --- | ---: | --- |
| `ingredient-references.v1.json` | 1,221 references | `dbbbae79b74064e4989ab0057e304598595895fa7ab14735a07720517dd055c0` |
| `ingredient-forms.v1.json` | 86 forms | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,522 records; 5,156 source entries; 4,219 distinct source IDs; 8 unit conversions | `a44a10bc8ec6c16f0fa0a47d0def0101025d59f89ca7af0faf687039c17e84f0` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows; 752,942 recipe-file bytes | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated `BundledIngredientCatalog.kt` | 1,221 references | `f555aa8491addb6d95be3e6256c21a3b90d50d30af2561c8d242d6189e38bcff` |

## Reconciliation checks

- Normalized exact-key audit found only the existing owners: `crab meat` and `chair de crabe` map to
  `ingredient-ref-crab`; `jumbo lump crab meat` maps to `ingredient-form-crab-jumbo-lump`. No exact
  owner exists for a separate generic crab label.
- Confirmed the ledger has no distinct generic-crab candidate. It retains the verified crab-meat
  identity, the Jumbo Lump form, and the unresolved `candidate-surimi-product-boundary` separately.
- Confirmed the ingredient search code uses complete normalized word-phrase matching, so bare `crab`
  and `crabe` already return `ingredient-ref-crab` through its display names.
- Scanned all 114 manifest-listed recipes: the only file with crab wording is recipe 019. Its only
  crab ingredient row is #8, `1 lb jumbo lump crab meat`, already linked to the reference and form;
  other rows use `Crab balls` as their recipe group label.
- Proposal and batch documentation passed UTF-8/no-BOM and trailing-whitespace checks; scoped
  `git diff --check` passed.
- No tests or emulator checks were run because this was a review and documentation reconciliation;
  no database JSON data changed.
