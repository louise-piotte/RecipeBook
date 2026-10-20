# WP04 Section P — crayfish / crawfish / écrevisse hold (2026-10-12)

## Decision

Kept the existing `ingredient-ref-crayfish` ledger candidate unresolved. OQLF defines `écrevisse`
as a freshwater crustacean and lists `crayfish` and `crawfish`, while noting that those English
terms are also used colloquially for langouste. CFIA assigns `crayfish` and `crawfish` to multiple
taxa, including entries whose French names use `langouste`. Canadian and Québec product/menu
listings support current consumer use but do not establish one safe unqualified identity across
those scopes. The bundled recipes contain no crayfish, crawfish, or écrevisse request.

No active reference, alias, form, ledger record, recipe link, measurement, conversion, yield, or
substitution was added or changed. Keep the candidate separate from American lobster, langoustine,
langouste, crab and crab meat, shrimp, and prepared seafood products. The broad Section P checklist
remains open.

The source review is in the
[crayfish/crawfish/écrevisse boundary review](../../proposals/wp04-section-p-crayfish-crawfish-ecrevisse-boundary-review-20261012.md).
It cites [OQLF's écrevisse entry](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363436/ecrevisse),
the [CFIA Fish List](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp),
[CFIA common-name guidance](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names),
an Ontario supplier's [species-identified crawfish listing](https://www.seafooddepot.ca/product-crawfish2),
a Canadian supermarket's [unqualified frozen crayfish-tail listing](https://www.superwafer.ca/en/product/21182/frozen-crayfish-tail),
and current [Montréal bilingual seafood-menu wording](https://www.ubereats.com/ca/store/seau-de-crabe-downtown/VPl89a5ZV2K7X3ucksY0qA).

## Live package snapshot at reconciliation

No package data changed in this batch. Hashes cover exact file bytes. The recipe-corpus fingerprint
hashes each manifest-relative path, a NUL byte, exact recipe bytes, and a trailing NUL byte in
manifest order.

| Artifact | Count | Bytes | SHA-256 or corpus fingerprint |
| --- | ---: | ---: | --- |
| `ingredient-references.v1.json` | 1,225 references | 391,768 | `c6a949abe54b0598fa9db207aad047a51ecb2fdfac72d689bf4454c70bae141e` |
| `ingredient-forms.v1.json` | 86 forms | 64,612 | `24a939c9342a94719d83b07a70c89601a220459e48cc6861bcaba1d72090e978` |
| `legacy-import-identities.v1.json` | 66 candidates | 15,752 | `bedef9b12dca5306eb035e411703fcbf58ea61c24046dff4dc5b526b8df6a39f` |
| `research-ledger.v1.json` | 1,524 records; 5,203 sources; 4,266 distinct source IDs | 5,045,553 | `b21803cad548fec3e0ed94ceeced3eea072c2e96b393393dfe3c5d29e81e7433` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files; 1,123 ingredient rows | 752,942 | `dc45c474ff678d2ddbfc2922cd307ec27c489de1bf9dc9b52c3fb9f6e9a79622` |
| Generated `BundledIngredientCatalog.kt` | 1,225 references | 536,587 | `d4f678974c5ac8939108afbd2f54f72642bdacd049f417f94afca5215c89eabc` |

## Reconciliation checks

- The current exact-normalized-key audit found no owner for `crayfish`, `crawfish`, `écrevisse`,
  `crawdad`, or `freshwater crayfish` in active references, forms, or legacy candidates. The
  unresolved candidate remains in the research ledger.
- Scanned all 114 manifest-listed recipe files, including all 1,123 ingredient rows; candidate
  phrase hits were zero.
- The source proposal remains proposal-local research. Its source IDs were not added to the shared
  ledger because this reconciliation adds no catalog or evidence data.
- The proposal, plan, roadmap, and README passed UTF-8/no-BOM and scoped trailing-whitespace checks;
  `git diff --check` passed for these documentation changes.
- No tests or emulator checks were run because this batch only reconciles a documentation hold; no
  database JSON changed.
