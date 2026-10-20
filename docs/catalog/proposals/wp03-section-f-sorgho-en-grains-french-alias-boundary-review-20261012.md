# WP03 Section F: grain-sorghum French alias boundary review

## Review record

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only; no shared catalog, ledger, manifest, generated-index, plan, or roadmap file changed.
- **Scope:** Review the French food-standard term `sorgho en grains` and the FAO term `sorgho en grain` as aliases for the existing grain-sorghum identity. This follows the completed Khorasan-wheat grain and Khorasan-flakes batches but is a separate identity and terminology boundary.
- **Recommendation:** Keep the Québec display `grain sorghum / sorgho à graine`; add only `sorgho en grains` and `sorgho en grain` to the French alias list on `ingredient-ref-grain-sorghum`. Record Health Canada's CNF portion values only as source-specific ledger observations. Do not add an active density or unit mapping.

## Proposed data decision

Retain the existing identity and its OQLF-backed display. The French Codex label `sorgho en grains` names the food product for whole or decorticated *Sorghum bicolor* grain; FAO AGROVOC's preferred term `sorgho en grain` describes that same grain concept. These are suitable search aliases, not reasons to replace the Québec display `sorgho à graine`.

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-grain-sorghum` (existing) |
| English display | `grain sorghum` (unchanged) |
| Québec French display | `sorgho à graine` (unchanged) |
| English aliases | None |
| French aliases | `sorgho en grains`; `sorgho en grain` |
| Category | `GRAIN_AND_CEREAL` (unchanged) |
| Default density / unit mappings | `null` / `[]` |
| Forms, recipe links, yields, active conversions, substitutions | None |

If accepted, keep the existing source IDs and decision history on the grain-sorghum ledger record, add the source entries below, and record the three CNF values as source-specific `portion_weight` observations. Set `measurementState` to `researched_supported` for those observations only. The record's substitution state remains `not_yet_researched`.

| CNF source quantity | Published mass | Scope to retain |
| --- | ---: | --- |
| 100 ml | 81.2 g | Health Canada CNF 2015 food code 4432, `Grains, sorghum / Grains céréaliers, sorgho` |
| 250 ml | 202.9 g | Same CNF item; the page does not identify grain preparation or fill method |
| 1 serving | 20.0 g | Same CNF item; do not treat a database serving as a universal recipe portion |

These values are internally consistent for the listed CNF entry, but the page does not say whether the grains are whole or decorticated, raw or cooked, or packed by a specified method. Record their exact source description and limitations in the ledger only. Do not derive a reusable bulk density from the two volume rows or activate `defaultDensity`, `unitMappings`, or a recipe conversion. Health Canada identifies the cited CNF material as its 2015 publication and says it will not be updated while work proceeds on the CNF 2026 dataset.

Codex distinguishes whole and decorticated grains, but its standard does not establish a RecipeBook form conversion, household measure by form, cooking yield, or substitution. No form is proposed without recipe demand or state-specific measurement evidence. Add no substitution between sorghum grain, sorghum flour, puffed sorghum, millet, or other cereal ingredients.

## Current package and recipe snapshot

Read-only snapshot from the shared worktree on 2026-10-12. File hashes cover exact bytes. The recipe fingerprint hashes each manifest-ordered relative recipe path, a NUL byte, its exact file bytes, and a trailing NUL byte.

| Artifact | Count / bytes | SHA-256 or corpus fingerprint |
| --- | ---: | --- |
| Ingredient references | 1,298 (126 `GRAIN_AND_CEREAL`) / 415,474 bytes | `a5857e552c35b15e206d16cd47fa14ddb257a96708bf9cb03632cccce6440195` |
| Ingredient forms | 98 / 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Package manifest | 114 recipe paths / 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Legacy import identities | 64 / 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,606 records; 5,804 source entries; 4,827 distinct source IDs / 5,694,406 bytes | `7ffa8fb3d2a53706143ec645edcd9fdda386c5242af16bc90cb96eb25285d720` |
| Generated ingredient catalog | 568,748 bytes | `b3bb09baa564bbb7028258a63e351c535b080534185b3d4ef5eaadff1ee68e2a` |
| Manifest recipe corpus | 114 files; 1,123 ingredient rows; 753,792 recipe bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The existing active row is `ingredient-ref-grain-sorghum`, `grain sorghum / sorgho à graine`, category `GRAIN_AND_CEREAL`, empty aliases, null `defaultDensity`, and empty `unitMappings`. No ingredient form currently points to that reference. Its ledger identity is `verified`; measurement and substitution research are both `not_yet_researched` at this snapshot.

## Exact-key ownership and overlap audit

The audit used the repository's `normalize_search_key` helper across active reference displays and aliases, form labels and match terms, legacy candidates, and ledger `recordId` values. It also checked source IDs. The proposed source IDs `WP03-SORGHUM-GRAINS-20261012-S01` through `S05` had no collisions in the live ledger or proposal/batch inventory.

| Phrase / boundary | Exact owner or current disposition |
| --- | --- |
| `grain sorghum` / `sorgho à graine` | Active exact owner: `ingredient-ref-grain-sorghum`; its ledger record already reuses OQLF source `WP03-S22` for this bilingual pair. |
| `sorgho en grains` / `sorgho en grain` | No exact owner in references, forms, legacy identities, or ledger record IDs. Proposed as French aliases on the existing grain row. |
| `grains de sorgho` / `grain de sorgho` | No exact owner. Do not add: Codex uses related words descriptively, while the Québec-facing Kabeya listing calls a **slightly milled** porridge product `Grain de Sorgho`; it does not establish an unqualified whole-kernel product alias. |
| `sorghum grain(s)` / bare `sorghum` | No exact owner. Do not add; the qualified English display is already present, and bare wording would widen search across grain, flour, and puffed products. |
| `sorghum flour` / `farine de sorgho` | Separate exact owner: `ingredient-ref-sorghum-flour`. Keep the flour row and its `jowar flour` alias separate from the grain row. |
| `puffed sorghum` / `sorgho soufflé` | Separate exact owner: `ingredient-ref-puffed-sorghum`; this is a processed ready-to-eat product, not a grain form proposed here. |
| `milo`, `sorghum milo grain`, `grain de sorgho milo`, `jowar` | No exact owner on the grain row. The accepted [milo boundary review](./wp03-section-f-milo-grain-alias-boundary-review-20261012.md) holds the first three terms; the [jowar review](./wp02-a6-jowar-sorghum-flour-terminology-review-20261012.md) is limited to sorghum flour. This proposal does not reopen either decision. |

The exact proposed French phrases were not found in prior proposals or batch records. Existing Khorasan-wheat and Khorasan-flakes reviews cover different ingredients; they do not overlap this sorghum terminology decision. The broader Section F checklist remains open in the [catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2012) and [roadmap](../../../roadmap.md).

## Recipe demand

The scan covered all 114 manifest-listed recipe files, every ingredient row, and complete serialized recipe text. It searched `grain sorghum`, `sorgho à graine`, `sorgho en grains`, `sorgho en grain`, `grains de sorgho`, `grain de sorgho`, `sorghum grain`, `sorghum grains`, `sorghum`, `milo`, and `jowar`. It found zero recipe-file hits and zero ingredient-row hits. No recipe link or recipe-line conversion is supported.

## Exact scope limitations

- Keep the OQLF display pair. Codex and AGROVOC supply alternate food terminology; neither replaces the Québec-preferred display.
- Add only the two French aliases supported by those exact sources. Add no English alias, new reference, or legacy identity.
- Keep `grain de sorgho` and `grains de sorgho` out of active aliases because the reviewed Québec product title also denotes a slightly milled sorghum-grain product used for porridge.
- Record CNF 2015 portions only as source-specific ledger observations. The source does not establish a form, raw/cooked state, packing convention, or universal serving.
- Add no forms, density, unit mappings, conversions, cooking/package yields, recipe links, or substitution rules.
- Keep the existing milo hold, the flour-only `jowar flour` alias, and the puffed-sorghum identity unchanged.

## Source register

Sources were checked on 2026-10-12, except the existing OQLF source, whose live ledger entry records its access date as 2026-10-05. The five new source IDs were absent from the ledger and existing proposal/batch files.

| Source ID | Source | Supports and limits |
| --- | --- | --- |
| Existing `WP03-S22` | Office québécois de la langue française, [GDT: sorgho à graine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19001698/sorgho-a-graine). | Existing ledger source directly pairs `grain sorghum` with the Québec French display `sorgho à graine`. Reuse it; do not add a duplicate source record. |
| `WP03-SORGHUM-GRAINS-20261012-S01` | FAO/WHO Codex Alimentarius, [Codex Standard CXS 172-1989: Norme Codex pour le sorgho en grains](https://www.fao.org/input/download/standards/57/CXS_172f.pdf), scope, sections 2.1–2.1.3, and 7.1. | Exact French food-standard label is `sorgho en grains`; applies to human-food grain and defines whole and decorticated *Sorghum bicolor*. Supports the alias, not a Québec-preferred display, household measure, or recipe form conversion. |
| `WP03-SORGHUM-GRAINS-20261012-S02` | FAO AGROVOC, [sorgho en grain](https://agrovoc.fao.org/browse/agrovoc/fr/page/c_7249), preferred term and definition. | Preferred French term is the singular `sorgho en grain`; its definition covers whole or decorticated *Sorghum bicolor* grain and its English concept is `sorghum grain`. Supports the second French alias; it is an agricultural thesaurus term, not Québec retail wording. |
| `WP03-SORGHUM-GRAINS-20261012-S03` | Health Canada, [Canadian Nutrient File — serving portions, food code 4432](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4432&lang=fre). | French food name `Grains céréaliers, sorgho`; lists `100 ml = 81.2 g`, `250 ml = 202.9 g`, and `1 portion = 20.0 g`. Supports only exact CNF source-specific observations; it does not specify grain state, filling method, or a universal household measure. |
| `WP03-SORGHUM-GRAINS-20261012-S04` | Health Canada, [Canadian Nutrient File help](https://food-nutrition.canada.ca/cnf-fce/help-aide), CNF publication note. | Identifies the cited file as the 2015 Canadian Nutrient File publication, says it will not be updated, and notes work toward CNF 2026. This limits the CNF values to historical source-specific observations. |
| `WP03-SORGHUM-GRAINS-20261012-S05` | Les Aliments Kabeya International, [Nos produits — Québec](https://www.lesalimentskabeya.com/nos-produits.php), `Grain de Sorgho` listing. | Québec-facing listing describes dry sorghum grains that are slightly milled for porridge and gives a 500 g package. Supports keeping that product-qualified `grain de sorgho` wording out of the plain whole/decorticated grain aliases; the package mass is not a measure. |

## Static review steps if accepted

1. Recheck normalized exact-key ownership for both proposed aliases across references, forms, legacy identities, and ledger record IDs; verify the source IDs resolve exactly once.
2. Confirm the existing reference ID, displays, category, null density, empty unit mappings, and absence of forms remain as scoped; add only the two French aliases.
3. Confirm each CNF observation retains the source food description, source quantity, published mass, and state/packing limitations; do not convert them into active unit mappings or density.
4. Rescan the manifest recipe corpus for the listed terms and confirm recipe files and ingredient links remain unchanged.
5. Validate the edited seed package and research ledger, check generated-catalog freshness, UTF-8/no-BOM, and scoped whitespace. Under `AGENTS.md`, no unit, instrumentation, or emulator tests are required for a JSON-only database-data change.
