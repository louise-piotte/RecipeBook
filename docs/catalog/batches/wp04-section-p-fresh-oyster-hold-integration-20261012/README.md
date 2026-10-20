# WP04 Section P — fresh oyster / huître hold (2026-10-12)

## Decision

Kept the existing `ingredient-ref-fresh-oyster` candidate unresolved. OQLF's `huître` entry links
the preferred Québec term to American oyster (*Crassostrea virginica*) and distinguishes cupped and
flat oyster groups. DFO lists multiple oyster species harvested in Canada, and the CFIA Fish List
uses unqualified `Oyster` and/or `Huître` on multiple species entries. Current Québec and Canadian
product listings name specific species, origins, or presentations. The recipe corpus contains no
fresh-oyster request.

Kept this candidate separate from dried oyster, oyster sauce, vegan oyster-style sauce, and oyster
mushrooms. No active reference, alias, form, ledger entry, recipe link, measurement, conversion,
yield, or substitution was added or changed. The broader Section P checklist remains open.

The [source review](../../proposals/wp04-section-p-fresh-oyster-identity-boundary-review-20261012.md)
uses [OQLF's huître entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198865/huitre),
[DFO's Canadian bivalve species guide](https://www.dfo-mpo.gc.ca/shellfish-mollusques/identification-eng.htm),
[CFIA common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names),
the [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp),
Québec retail listings from [Metro](https://www.metro.ca/epicerie-en-ligne/allees/poissons-et-fruits-de-mer/fruits-de-mer-frais/huitres/huitres-fraiches/p/080077081119)
and [Mayrand](https://mayrand.ca/en/our-products/fish-and-seafood/oyster/huitre-malpeque-53145),
and current supplier/industry product pages from [Seacore](https://www.seacoreseafood.com/product/Shucked_Oysters)
and [Seafood from Canada](https://seafoodfromcanada.ca/seafood/oysters/).

## Live package snapshot at reconciliation

No package data changed in this batch. Hashes cover exact file bytes. The recipe-corpus fingerprint
hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in
manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,226 references | 392,103 | `4946cf6b6256f8d1ef2714ee534ebad44f02d29bdfbf0dfa84f20146a133220f` |
| `ingredient-forms.v1.json` | 86 forms | 64,612 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,525 records; 5,212 sources; 4,275 distinct source IDs | 5,053,058 | `6954a3784dfff117b9ab926914123af8a503e32c18aee5ea7f90859ba115e953` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 752,942 | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated `BundledIngredientCatalog.kt` | 1,226 references | 537,040 | `8cf3119845a873644779c118a3e58963d8215058a46564954546b2362ecf5a3c` |

## Reconciliation checks

- Exact normalized ownership remains absent for generic `oyster`, `oysters`, `huître` / `huitre`,
  and their plurals across active references, forms, and legacy candidates. The existing fresh-oyster
  ledger candidate remains unresolved.
- The pre-integration scan covered all 114 manifest-listed recipe files, all 1,123 ingredient rows,
  and complete recipe JSON text. No oyster, huître, species, fresh, live, or shucked-oyster target
  phrase was found; the only nearby lines are crab meat and an optional unlinked generic seafood
  phrase.
- The eight fresh-oyster source IDs remain proposal-local and were not added to the ledger because
  this reconciliation changes no shared catalog or evidence data.
- The proposal, plan, roadmap, and README passed UTF-8/no-BOM and scoped trailing-whitespace checks;
  `git diff --check` passed for these documentation changes.
- No tests or emulator checks were run because this batch only reconciles a documentation hold; no
  database JSON changed.
