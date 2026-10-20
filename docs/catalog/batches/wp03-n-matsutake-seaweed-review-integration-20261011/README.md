# WP03 Section N white matsutake and seaweed-form review

Integrated 2026-10-11 from reviewed proposals. This batch adds one ingredient-reference row and one research-ledger record, updates the catalog plan and roadmap, and records a seaweed-form no-add decision. It makes no application-code or recipe changes.

## Catalog changes

- Added `ingredient-ref-white-matsutake-mushroom`, displayed as `white matsutake mushroom / tricholome à grand voile`, with only the English alias `white matsutake`. The row is scoped to the eastern Québec product *Tricholoma magnivelare*.
- Kept the unqualified `matsutake` / `matsutaké` terms out of stored aliases. The 2017 taxonomic review distinguishes eastern *T. magnivelare*, western *T. murrillianum*, and Japanese *T. matsutake*. The current Québec recipe uses unqualified `matsutake`, so it was not linked to the eastern identity.
- Added nine sources to the ledger. The 20 g White Matsutake listing is package size only; no count weight, density, package yield, fresh/dried conversion, form, or substitution was activated.
- Reviewed the seaweed hydration-form question and made no catalog or ledger JSON change. The bundle contains no seaweed ingredient demand, and named-product wakame hydration claims conflict. Keep kombu lab water uptake distinct from a drained recipe yield or density.
- Huitlacoche was already integrated in the earlier [Section M/N and finfish identity tranche](../wp03-section-mnh-wp04-finfish-integration-20261010/README.md); this batch did not edit its active reference or ledger record.

## Sources and review packets

Matsutake identity and species scope use [MycoQuébec’s *Tricholoma magnivelare* record](https://mycoquebec.org/scripts/fiche_pdf.php?dest=D&tag=Tricholoma+magnivelare) and the [2017 North American matsutake taxonomic study](https://pubmed.ncbi.nlm.nih.gov/28609221/). The seaweed no-add decision is documented in the [hydration and yield review](../../proposals/wp03-section-n-seaweed-forms-hydration-yield-review-20261011.md).

- [Québec white matsutake identity proposal](../../proposals/wp03-n-white-matsutake-identity-review-20261011.md)
- [Seaweed forms and hydration-yield proposal](../../proposals/wp03-section-n-seaweed-forms-hydration-yield-review-20261011.md)

## Validation

- 1,010 ingredient references, 66 forms, 114 recipes, and 1,123 ingredient rows.
- 1,291 research-ledger records, 4,148 source entries, and 3,396 distinct source IDs.
- Ingredient-reference normalization check passed.
- `python3 tools/seed_package/normalize_bundled_seed_package.py --validate-only` passed.
- `git diff --check` passed for the changed data, plan, and proposal files.
- No tests were run: the catalog change adds database JSON only, as specified in `AGENTS.md`.
