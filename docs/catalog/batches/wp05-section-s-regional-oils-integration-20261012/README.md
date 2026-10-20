# WP05 Section S regional oil integration

- Date: 2026-10-12
- Status: seven source-bounded identities are integrated; broader Section S remains open.
- Review packet: [regional oils and product-boundary review](../../proposals/wp05-section-s-regional-oils-and-product-boundaries-gap-review-20261012.md).
- Related batch: [fats and oils integration](wp05-section-s-fats-oils-integration-20261012/README.md).

## Integrated decisions

Added identity-only references under `FAT_AND_OIL`:

- walnut oil / huile de noix
- hazelnut oil / huile de noisette
- pumpkin seed oil / huile de graines de citrouille, with `huile de pépins de courge` and `huile de graines de courge` aliases
- safflower oil / huile de carthame, with OQLF-supported English aliases `safflower seed oil`, `safflowerseed oil`, `carthamus oil`, and `kurdee oil`
- rice bran oil / huile de riz, with the English alias `rice oil`
- virgin coconut oil / huile de noix de coco vierge
- palm kernel oil / huile de palmiste

The generic coconut-oil reference remains the match for unqualified wording. Palm-kernel oil stays separate from crude palm oil, generic palm oil, and palm fractions. No recipe ingredient line matched the seven new identities, so no recipe link changed. No forms, numeric data, yields, conversions, or substitutions were added.

## Held boundaries

- Refined/deodorized coconut oil and the mapping between those product terms remain unresolved. [The French product page](https://maisonorphee.com/products/huile-de-noix-de-coco-desodorisee-bio-2-0) conflicts with [the English product page](https://maisonorphee.com/en/collections/coconut-oil/products/cold-pressed-organic-deodorized-coconut-oil-2-0) on product/ingredient wording, and the [Codex committee report](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FMeetings%252FCX-709-29%252FFinal%252520report%252FREP26_FOe.pdf) records that further product differentiation is needed before starting standard work.
- Toasted pumpkin-seed oil, high-oleic safflower oil, red-palm aliases, and palm fractions remain separate or held. The proposal's prior decisions for mustard oil, groundnut oil, and crude palm oil remain in force.
- `nut oil`, bare `pumpkin oil`, `huile de safre`, `PKO`, and product-specific roast/origin/process descriptions were not added as aliases.

## Evidence

- OQLF's [huile de carthame](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8878264/huile-de-carthame) entry supplies the Québec term and four accepted English names. OQLF's [huile de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8410164/huile-de-riz) supplies `huile de riz`, `rice oil`, and `rice bran oil`; [Codex CXS 210](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/en/?lnk=1&url=https%3A%2F%2Fworkspace.fao.org%2Fsites%2Fcodex%2FStandards%2FCXS+210-1999%2FCXS_210e.pdf) supplies the rice-bran source boundary.
- OQLF's 2026 [huile de palmiste](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2084454/huile-de-palmiste) entry defines palmiste as the kernel within oil-palm fruit and gives `palm kernel oil`. Codex CXS 210 distinguishes palm-kernel oil and its fractions from fruit-mesocarp palm oil.
- Québec product pages from [La Maison Orphée](https://maisonorphee.com/products/huile-de-noix-de-grenoble), [La Moisson](https://lamoisson.com/products/huile-de-graines-de-citrouille-pumpkin-seed-oil), [Purepress Oils](https://purepressoils.com/fr/products/pumpkin-seed-oil), and [La Maison Orphée's virgin coconut oil line](https://maisonorphee.com/products/huile-de-noix-de-coco-vierge-bio-2-0) corroborate product names. Product-specific roast, origin, pressing, and formula details were not promoted into global aliases.

## Data checks

The package contains 1,132 references / 79 forms / 114 recipes / 1,123 ingredient rows. The legacy-candidate file has 71 entries. The ledger contains 1,429 records / 4,762 source entries / 3,899 distinct source IDs / 8 unit conversions.

Seed-package validation and normalization checks passed; the generated Kotlin index is current; the research ledger validates with no errors. Exact phrase checks found one owner per accepted name and alias across references, forms, and legacy candidates. The 114-recipe audit found no matching ingredient rows. UTF-8/no-BOM and scoped `git diff --check` passed. No tests or emulator checks were run because this change only adds database JSON data, consistent with `AGENTS.md`.
