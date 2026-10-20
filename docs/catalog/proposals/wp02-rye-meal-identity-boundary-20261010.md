# WP02 rye-meal identity boundary review

## Scope and coordinator decision

- **Review date:** 2026-10-10
- **Scope:** rye meal / pumpernickel meal versus the existing general rye-flour and rye-grain identities.
- **Disposition:** accept one distinct identity-only rye-meal product. Keep general rye-flour extraction grades open.
- **Coordinator integration:** add `ingredient-ref-rye-meal` as `rye meal / gruau de seigle` in `FLOUR_AND_STARCH`. Add only the TERMIUM-supported coarse/pumpernickel product aliases. No recipe links, forms, measurements, densities, unit mappings, conversions, yields, or substitutions are added.

## Catalog and recipe audit

The audit covered 677 active references, 34 forms, 84 legacy candidates, and all 114 manifest-listed recipes (1,123 ingredient rows). Existing `rye / seigle` and `rye flour / farine de seigle` remain separate. Exact normalized checks found no active reference, form, or legacy owner for `rye meal`, `gruau de seigle`, `semoule de seigle`, `pumpernickel flour`, `pumpernickel meal`, `coarse rye meal`, or `farine à pumpernickel`.

The recipe scan found no rye-meal, coarse-rye-meal, pumpernickel-flour, or pumpernickel-bread rows. No recipe relink is proposed.

## Evidence

| Source | Support and limits |
| --- | --- |
| [TERMIUM Plus, rye meal](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=GRUAU+SEIGLE) | The federal terminology record defines rye meal / pumpernickel flour as whole-kernel rye ground coarse and dark for pumpernickel breads and rolls. It gives `gruau de seigle` as the French term, `semoule de seigle` as another French term, and `farine à pumpernickel` in the context. This supports a product boundary and bilingual names, not a particle-size threshold. |
| [Ardent Mills, rye products](https://www.ardentmills.com/products/alternative-grains/additional-gluten-free-flours-grains-seeds/rye/) | The mill distinguishes white rye flour, medium/dark rye flour, rye meal pumpernickel flour, rye chops, and rye flakes in one product family. It describes its pumpernickel meal as whole rye. This is one supplier's class and does not establish that all whole-rye flours are meal. |
| [Montreal Kosher Bakery, pumpernickel bread](https://www.montrealkosher.ca/products/bread-bagels/breads/pumpernickel-bread.html) | A Montréal pumpernickel-bread ingredient declaration lists rye meal separately from wheat flour and other ingredients. This confirms Québec-market culinary use, not a universal bread formula. |

The OQLF entry for [pumpernickel](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17020971/pumpernickel) names the bread product, so `pumpernickel` by itself is not added as an ingredient alias.

## Coordinator identity proposal

| Field | Accepted value |
| --- | --- |
| Stable ID | `ingredient-ref-rye-meal` |
| English display | `rye meal` |
| Québec French display | `gruau de seigle` |
| English aliases | `coarse rye meal`; `pumpernickel meal`; `pumpernickel flour` |
| French aliases | `semoule de seigle`; `farine à pumpernickel` |
| Category | `FLOUR_AND_STARCH` |

Keep rye flour's white/light, medium, dark, and whole-grain grades unresolved pending separate source review. Do not alias generic `whole rye flour`, cracked rye, rye chops, rye grain, or pumpernickel bread to this identity. No measurement or substitution inference is made.

## Source register

- `WP02-RYEMEAL-20261010-S01` — TERMIUM Plus, rye meal / gruau de seigle; accessed 2026-10-10.
- `WP02-RYEMEAL-20261010-S02` — Ardent Mills, rye product family; accessed 2026-10-10.
- `WP02-RYEMEAL-20261010-S03` — Montreal Kosher Bakery, pumpernickel-bread ingredients; accessed 2026-10-10.
