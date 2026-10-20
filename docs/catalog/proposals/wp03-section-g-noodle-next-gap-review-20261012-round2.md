# WP03 Section G lasagne pasta-shape identity review

- **Reviewed:** 2026-10-12
- **Status:** Integrated on 2026-10-12. See [integration README](../batches/wp03-section-g-lasagne-identity-integration-20261012/README.md).
- **Decision:** Add identity-only `lasagna sheets / lasagne` as a shape-specific finished-pasta identity. Keep it separate from the broad pasta row, composition-qualified pasta rows, other shapes, and the prepared lasagna dish. Add no forms, measurements, recipe links, conversions, yields, or substitutions.
- **Scope:** Checked the Section G plan, active references, forms, ledger, legacy import candidates, prior proposals and batch records, the complete bundled recipe corpus, and Québec/Canadian terminology and product sources. Integration changed one reference and one ledger record only; no recipe or form data changed.
- **Source IDs:** proposal-local prefix `WP03-G-LASAGNE-QC-20261012`, checked against `docs/` and `app/` before use.

## Repository snapshot and open-gap check

The initial Section G review found no lasagne row or prior hold. The pasta checklist covers common shapes, with existing rows for spaghetti, macaroni, penne, farfalle, fusilli, and orzo. The generic pasta identity and separately reviewed whole-wheat, gluten-free, and egg-pasta classes remain neighboring identities. The existing shape batches (`pasta-couscous-shapes.md`, `pasta-shapes-farfalle.md`, and `pasta-shape-fusilli.md`) did not include lasagne.

Initial snapshot checked 2026-10-12:

| Artifact | Count / result |
| --- | ---: |
| Active ingredient references | 1,301 |
| Ingredient forms | 98 |
| Research-ledger records / source entries / distinct source IDs | 1,609 / 5,832 / 4,855 |
| Legacy import candidates | 64 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |
| Proposed ID `ingredient-ref-lasagne` | Unallocated |

Immediately before integration, the shared package had 1,304 references, 98 forms, 64 legacy candidates, and 1,612 ledger records. Fresh exact-key checks confirmed no prior owner in active reference names/aliases, forms, or legacy candidates for the proposed identity and terms. One existing gluten-free-pasta ledger source mentions lasagne as a Catelli shape in that product line; it is source context and does not establish a lasagne identity or alias owner. The proposed ID, candidate ID, and source-ID prefix remained unused.

## Exact-key, proposal, and recipe audit

I reproduced the app's search normalization: lowercase, Unicode NFKD, accent and ligature folding (`œ` → `oe`, `æ` → `ae`, `ß` → `ss`), ampersand expansion, and punctuation-to-space normalization. No exact normalized owner was found in active reference names or aliases, form labels or match terms, or the legacy-import candidates for `lasagna`, `lasagne`, `lasagnas`, `lasagnes`, `lasagna sheets`, `lasagne sheets`, `lasagna noodles`, `lasagne noodles`, `feuille(s) de lasagne`, or `pâte(s) à lasagne`. No exact `ingredient-ref-lasagne` or `candidate-lasagne` identity exists.

There is no prior lasagne-specific identity proposal or held decision. The existing `ingredient-ref-gluten-free-pasta` ledger record remains scoped to the explicitly marketed gluten-free product class; its mention of Catelli lasagne is not an identity decision.

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for the proposed spellings and phrase variants. There are **zero** candidate phrase matches in recipe text and **zero** matching ingredient lines. No recipe link is supported. This is a product-coverage identity without bundled recipe demand.

The app picker prioritizes complete normalized word phrases, then falls back to substring matches (`IngredientSearch.kt`). With the proposed terms, `lasagna sheets`, `lasagna noodles`, `lasagne`, and `feuilles de lasagne` point to the shape identity; `pasta / pâtes alimentaires` remains on its broad identity, and `gluten-free pasta / pâtes sans gluten` remains on its composition identity. Do not add a generic `pasta sheets` or `noodles` alias, or an alias such as `gluten-free lasagne`: those broaden the target or imply that the current picker combines shape and composition qualifiers. A combined query such as “gluten-free lasagna sheets” is not represented as a multi-qualifier product by the current picker and remains outside this proposal.

## Product and naming boundary

OQLF's GDT places `lasagne` in the food-pasta domain and defines it as a long, flat pasta with straight or wavy edges, generally about 5–7 cm wide. OQLF gives `lasagne` as the preferred French term, `lasagnes` as its plural, and `lasagna` and `lasagne` as English terms. This directly distinguishes the ingredient shape from the assembled baked dish. [S01]

Canadian manufacturer pages confirm current sheet-product usage. Barilla Canada describes oven-ready lasagne as thin flat pasta sheets rolled flat for layering and baking without pre-boiling; its English and French pages pair the product with `Lasagne prête à cuire` and French wording `feuilles de pâtes lasagne`. Catelli Canada's French product page uses `Classiques Lasagne` and `feuilles de lasagne` for a product intended for baked dishes. These are manufacturer-specific products, not proof that every lasagne product is durum wheat, dry, or oven-ready. [S02–S04]

### Proposed identity-only reference

| Field | Proposal |
| --- | --- |
| ID | `ingredient-ref-lasagne` |
| English display | **lasagna sheets** |
| Québec French display | **lasagne** |
| English aliases | `lasagna noodles` |
| Québec French aliases | `lasagnes`; `feuilles de lasagne` |
| Category | `GRAIN_AND_CEREAL`, consistent with existing pasta-shape references; this does not assert grain or egg composition. |
| Identity scope | Finished pasta in the source-defined broad, flat lasagne shape, including straight or ruffled edges. The term identifies the pasta product, not an assembled lasagna dish. |

Keep plain `lasagna / lasagne` as the shape search rather than adding the dish phrase or a broad synonym. Do not alias generic `pasta`, `pâtes alimentaires`, `noodles`, or `nouilles`; these terms are broader and have separate picker boundaries. Do not attach the shape to egg pasta, whole-wheat pasta, gluten-free pasta, or any source-grain identity. A product can carry more than one such qualifier, but this proposal does not create a combined row or imply that the current picker can represent the intersection.

`Oven-ready`, `no-boil`, fresh, and dried are product or preparation-state descriptions, not aliases for the shape. Barilla's source-specific no-boil instructions do not establish a general state conversion or cooking rule, so no form is proposed. Its package serving text and Catelli's label amounts remain product-specific; do not infer a reusable sheet count, household measure, density, cooking yield, or recipe portion. No measurement, unit mapping, conversion, package yield, substitution, or recipe link is supported.

## Sources

Sources accessed 2026-10-12. Manufacturer statements support only the named product and page, not a universal composition or preparation method.

| ID | Source | Claim supported | Limits |
| --- | --- | --- | --- |
| **WP03-G-LASAGNE-QC-20261012-S01** | Office québécois de la langue française, [lasagne (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8363756/lasagne) | Food-pasta domain; flat, wide pasta-shape definition; preferred French singular, French plural `lasagnes`, and English terms `lasagna` / `lasagne`. | Last updated 2017. Terminology and shape definition, not a current product specification or an oven-ready process standard. |
| **WP03-G-LASAGNE-QC-20261012-S02** | Barilla Canada, [Oven-Ready Lasagne](https://www.barilla.com/en-ca/products/pasta/classic-blue-box/oven-ready-lasagne) | Manufacturer describes thin flat pasta sheets rolled flat, intended to be layered and baked without pre-boiling; lists semolina and durum-wheat flour for this product. | One product. Its no-boil direction, ingredients, package, and nutrition amounts are not class-wide measures or cooking rules. |
| **WP03-G-LASAGNE-QC-20261012-S03** | Barilla Canada, [Lasagne prête à cuire](https://www.barilla.com/fr-ca/produits/pates/bo%C3%AEte-bleue-classique/lasagne-pr%C3%AAte-%C3%A0-cuire) | Québec French product page uses `Lasagne prête à cuire` and `feuilles de pâtes lasagne`, and describes the same flat sheet, layer-and-bake product approach. | Barilla product wording and directions only; not OQLF terminology or a universal state/form rule. |
| **WP03-G-LASAGNE-QC-20261012-S04** | Catelli Canada, [Classiques Lasagne](https://www.catelli.ca/fr/pastas/catelli-classique-lasagne/) | Québec-facing manufacturer page calls the product `Classiques Lasagne`, describes `feuilles de lasagne`, and lists durum semolina for its baked-dish product. | One Catelli product. It does not establish that all lasagne is durum wheat or has the same ingredient list. |

## Disposition

The OQLF definition supplies a stable bilingual shape boundary, while Canadian manufacturer pages corroborate current flat-sheet product use and Québec French wording. Keep all existing composition, dish, shape, and state boundaries intact. The integrated package has 1,305 active references and 1,613 ledger records. Package normalization, reference normalization, generated-index freshness, ledger validation, exact-key ownership, recipe-corpus scan, UTF-8/no-BOM, and scoped whitespace checks passed. No app tests or emulator checks were run because this change only adds database JSON data under `AGENTS.md`.

## File and encoding verification

The saved proposal was checked for strict UTF-8 decoding, no UTF-8 BOM, a final newline, and absence of common mojibake markers.
