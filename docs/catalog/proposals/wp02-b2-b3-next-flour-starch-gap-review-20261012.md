# WP02 B2/B3 next flour and starch gap review — `manioc starch`

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No bundled JSON, ledger, plan, roadmap, recipe, generated file, or test was changed.
- **Scope:** Whether to add the exact English lookup phrase `manioc starch` to the existing
  `ingredient-ref-tapioca-starch` row. This is one alias review, not a new ingredient identity or a
  review of canna starch.
- **Source-ID prefix:** `WP02-B2B3-MANIOC-STARCH-ALIAS-20261012`; checked against current ledger
  sources and the pre-existing proposal directory. No collision was found.

## Recommendation

**Integrate only the English alias `manioc starch` on `ingredient-ref-tapioca-starch`.** Keep the
current display `tapioca starch / fécule de manioc`, its ID and category, and all existing numeric
and substitution states unchanged. The OQLF-hosted GDT entry for `fécule de manioc` defines a
wet-extracted manioc-root starch and lists `manioc starch` alongside `cassava starch` and `tapioca
starch` as English terms. The current row already represents that extracted-starch identity and has
no English aliases. [S01]

The exact alias is narrow enough for the current search catalog: no active reference, form, legacy
candidate, or ledger record name owns the complete normalized phrase `manioc starch`. By contrast,
the app's complete-word-phrase search returns both Brazilian product rows for `cassava starch`, so
do **not** add that broader phrase to the generic tapioca-starch row. Keep the source-named `polvilho
doce` and `polvilho azedo` identities distinct. [S03]

`Tapioca flour` is explicitly marked obsolete in the GDT entry and remains inactive. Do not add
`manioc flour`, `cassava flour`, `tapioca`, bare `manioc`, `amidon de manioc`, or French
`fécule de tapioca` as aliases. Keep `farine de manioc` on the whole-root `ingredient-ref-cassava-flour`
row. Do not add a form, measurement, density, unit mapping, conversion, yield, recipe link, or
substitution rule. [S01, S02]

## Exact proposed catalog delta

| Surface | Proposed change | Boundary |
|---|---|---|
| `ingredient-ref-tapioca-starch` | Add English alias **`manioc starch`** only. | OQLF-hosted GDT lists it as an English term for the existing French extracted-starch identity. |
| Canonical English display | Keep `tapioca starch`. | No display rename. |
| Canonical French display | Keep `fécule de manioc`. | No additional French alias; this is already the Québec French display. |
| `ingredient-ref-brazil-polvilho-doce` | No change. | Keep the named sweet cassava-starch product separate; do not add `sweet manioc starch` or `manioc starch` to it. |
| `ingredient-ref-brazil-polvilho-azedo` | No change. | Keep the named sour cassava-starch product separate; do not add `sour manioc starch` or `manioc starch` to it. |
| `ingredient-ref-cassava-flour` | No change. | Keep `farine de manioc` on edible whole-root cassava flour. Do not add any starch term. |
| All numeric/runtime data | No change. | Measurement and substitution research remain `not_yet_researched`; density remains null and unit mappings remain empty. |

Do not activate `cassava starch` on the generic row. It is an exact word phrase within both active
English displays `sweet cassava starch (polvilho doce)` and `sour cassava starch (polvilho azedo)`;
the current app search therefore returns both product-specific rows for that query. The GDT synonym
does not erase this catalog's source-named subtype boundary. [S01, S03]

The Canadian UniMarket listing titled `Amafil Polvilho Doce Manioc Starch - Sweet Manioc Starch`
shows that `manioc starch` also appears in a qualified product title. It supports the visibility of
the wording, but does not support aliases for the qualified phrase `sweet manioc starch`, for sour
polvilho, or for any product-specific formula. The proposed alias is only the generic term on the
existing extracted-starch reference; retain the polvilho rows and their current source-named
displays. [S03]

## Live package, ledger, and ownership audit

Read-only snapshot of the shared worktree on 2026-10-12:

| Surface | Current state |
|---|---|
| Ingredient references | 1,243 rows; SHA-256 `9be692678b8bd18ea4e64ef478e27a2c6824a0738a21097192c378a4fa2ad0e9` |
| Ingredient forms | 91 rows; SHA-256 `a8f7634add93654cf144d4d8ed5ef9346b0acc73ddbba1b3f455bac8adc6aad7` |
| Research ledger | 1,546 records / 5,359 source entries / 4,399 distinct source IDs; SHA-256 `883c30b801c58ab7abd3cedde317ffc25c7bc191d39e12ed2dab5bb5d513e5ae` |
| Legacy import candidates | 66 rows |
| Manifest-listed recipes | 114 files / 1,123 ingredient rows; corpus fingerprint `cf9185da118727a2f0584352af4cfa4625090be2ae5792fd1be253d48b70d23a` |

The target row is currently `ingredient-ref-tapioca-starch`, displayed as `tapioca starch / fécule
de manioc`, with empty English and French alias arrays, null density, empty unit mappings, and
category `FLOUR_AND_STARCH`. Its live ledger record is identity-verified; measurement and
substitution research remain `not_yet_researched`. The ledger already cites the same GDT page as
`WP02-S24`. It also mentions the English phrase in the existing cassava-flour alias evidence
(`WP02-SECTION-B-MANIOC-FLOUR-ALIAS-20261012-S04`) and the taro-starch boundary evidence
(`WP02-TARO-STARCH-QC-NAME-20261011-S03`); neither creates an active alias or a separate manioc-starch
candidate. This proposal rechecked the GDT page for the specific unrepresented alias and uses a new,
proposal-local source prefix. No ledger entry is proposed here.

Exact name/alias ownership was checked with the app's NFKD, accent-folding, punctuation-normalizing
search key against references, forms, and legacy candidates:

| Phrase | Exact current owner | Decision |
|---|---|---|
| `manioc starch` | None. | Proposed English alias for `ingredient-ref-tapioca-starch`. |
| `tapioca starch` | `ingredient-ref-tapioca-starch` (`nameEn`). | Keep canonical display. |
| `fécule de manioc` | `ingredient-ref-tapioca-starch` (`nameFr`). | Keep canonical display. |
| `cassava starch` | No exact stored term; the full phrase occurs inside both Brazilian polvilho English displays. | Keep unassigned to the generic row because it returns two distinct source-named products. |
| `tapioca flour` | None. | Keep inactive; GDT marks it obsolete for this starch entry. |
| `manioc flour` | None. | Keep distinct from starch; the whole-root cassava-flour row owns its flour identity. |
| `amidon de manioc` / `fécule de tapioca` | None. | Do not add; this review found no source establishing these as Québec aliases. |

Before this proposal was drafted, the new source-ID prefix was absent from all current ledger
sources and pre-existing proposal Markdown files. The target row's existing source ID `WP02-S24`
remains unchanged; it is not reused as one of this proposal's new source IDs.

## Bundled recipe demand

All 114 manifest-listed recipe JSON files and 1,123 ingredient rows were scanned for
`manioc starch`, `cassava starch`, `tapioca starch`, `fécule de manioc`, `tapioca flour`, `manioc
flour`, and `fécule de tapioca`. There were **zero text hits** in recipe files or ingredient rows.
There are also **zero recipe lines linked** to `ingredient-ref-tapioca-starch`. The bundled recipes
therefore provide no direct demand or basis for a recipe relink, measurement, form, or substitution.
This is a corpus result, not a claim that the starch lacks broader culinary use.

## Numeric and substitution boundaries

- Preserve `measurementState: not_yet_researched` and `substitutionResearchState: not_yet_researched`
  on the active ledger record.
- Keep `defaultDensity: null` and `unitMappings: []` on the active reference.
- Add no portion, household measure, package value, form, conversion, yield, recipe association,
  substitution, or ingredient-to-ingredient rule.
- The government trade report's import categories and the retailer's package net weight are not
  culinary measurement evidence. [S02, S03]

## Source register

All sources were accessed on 2026-10-12. IDs are proposal-local; no evidence record was written to
the live ledger.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2B3-MANIOC-STARCH-ALIAS-20261012-S01** | Office québécois de la langue française, [*fécule de manioc* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287219/fecule-de-manioc). The entry defines a product obtained by wet extraction from tuberous manioc roots and lists English `manioc starch`, `cassava starch`, and `tapioca starch`; it marks `tapioca flour` as obsolete. Its underlying terminology record is credited to AFNOR (1979). | Direct term-equivalence and process evidence; not a current product label or a claim that all retail cassava-starch preparations are interchangeable. |
| **WP02-B2B3-MANIOC-STARCH-ALIAS-20261012-S02** | Manitoba Agriculture, [*Starch World Market*](https://www.gov.mb.ca/agriculture/markets-and-statistics/trade-statistics/pubs/starch-world-market.pdf), pp. 5–6, reporting 2018–2022 native-starch trade categories. It treats “manioc starch” as a named native-starch import category separate from maize, potato, and wheat starch. | Government trade classification and market context; not a kitchen-use, recipe-demand, or substitution source. |
| **WP02-B2B3-MANIOC-STARCH-ALIAS-20261012-S03** | UniMarket Canada, [*Amafil Polvilho Doce Manioc Starch — Sweet Manioc Starch*](https://unimarket.ca/products/polvilho-doce-manioc-starch), current product listing. The title names Polvilho Doce as sweet manioc starch and describes it as Brazilian cassava sweet starch. | One seller's product-specific wording; supports keeping qualifiers and the active `polvilho doce` identity separate. It does not establish that every use of `manioc starch` means Polvilho Doce. |

## Prior-work reconciliation

- The active plan still leaves the broader WP02 B2/B3 flour-and-starch review open. This proposal covers
  one exact lookup term only and does not close that checklist.
- The 2026-10-12 cassava-flour alias review adds `farine de manioc` to `ingredient-ref-cassava-flour`
  and preserves the wet-extracted tapioca-starch boundary; it does not propose the English alias
  `manioc starch` on the starch row.
- The 2026-10-11 fufu/granule review correctly keeps `cassava starch` unassigned because it matches
  both active Polvilho rows. This proposal preserves that result and asks only about the distinct
  exact English phrase `manioc starch`.
- Canna starch is already integrated as its own identity and is outside this proposal's scope.

## Proposal-only result

Recommend adding only `manioc starch` to `ingredient-ref-tapioca-starch.aliasesEn` in a later
coordinated integration. No active JSON or ledger edit is made by this review. No app tests or
emulator checks were run because the authorized deliverable is a source-backed proposal only.
