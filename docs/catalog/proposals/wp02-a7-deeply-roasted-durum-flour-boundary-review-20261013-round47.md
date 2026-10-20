# WP02 A7 R47: deeply roasted durum wheat flour boundary review

**Disposition: hold, unallocated.** CerealVeneta documents a distinct whole-durum flour semi-finished product with English title `Deeply roasted durum wheat flour` and French title `Farine de blé dur brûlé` [S01–S03]. The manufacturer describes controlled, unusually heavy toasting followed by cryomilling, but the product sheet is gated behind a company contact form and no Canadian or Québec product display was found. The French wording also overlaps a separately described Apulian traditional `blé brûlé` process. Keep this product outside active references and the research ledger pending a Québec product boundary and display. This proposal changes no shared catalog, ledger, plan, roadmap, or integration README.

## Candidate and archive check

The candidate is limited to CerealVeneta's source-named **Deeply roasted durum wheat flour / Farine de blé dur brûlé**. Its page describes flour from whole durum wheat, heavily but controllably toasted before cryomilling [S01, S02]. This is separate from generic roasted wheat flour, malted or roasted wheat-malt flour, durum flour, durum semolina, remilled durum semolina, durum berries, wheat meal, and toasted durum-semolina pasta. Do not use `burnt durum wheat flour`, `roasted durum flour`, `farine de blé dur torréfiée`, `farine de blé dur grillée`, or `grano arso` as aliases: those are not established as interchangeable names for this manufacturer's product.

Before selecting the candidate, the source title and likely variants `deeply roasted durum wheat flour`, `roasted durum flour`, `durum wheat flour, roasted`, `burnt durum wheat flour`, `farine de blé dur brûlé`, `farine de blé dur torréfiée`, and `farine de blé dur grillée` were checked against current references, forms, legacy-import identities, ledger keys, the open A7 plan, and prior proposals. No exact owner, ledger candidate, or earlier focused A7 disposition was found. This review does not reopen the previously reviewed meal candidates, toasted buckwheat flour, toasted white sorghum flour, micronised toasted millet flour, or other R32–R46 decisions.

## English and Québec French boundary

CerealVeneta's English product page uses `Deeply roasted durum wheat flour`; its French page uses `Farine de blé dur brûlé`. The pages identify the product as a semi-finished ingredient made from whole durum wheat. They do not establish a consumer product or Canadian/Québec availability [S01, S02]. The OQLF GDT entry supports `farine de blé dur` (also `farine de blé durum`) for `durum flour` / `durum wheat flour`, but it does not supply a Québec French name for this roasted product [S04]. The GDT entry is dated 2004; its indexed entry was available during this review, while a direct page open returned a cache error.

Do not treat `farine de blé dur brûlé` as a neutral Québec translation of `roasted durum flour`. In its French process article, CerealVeneta describes traditional Apulian `blé brûlé` as durum grains left in fields after harvest and straw burning, then milled; the manufacturer says this tradition inspired a separate controlled, lower-temperature process it calls `torréfaction douce` [S03]. This is useful evidence that the source-named product and traditional material are related but not identical.

Les Moulins de Soulanges, a current Québec mill, names a separate bilingual **Roasted Wheat Flour / Farine de Blé Torréfié** product [S05, S06]. Its pages do not specify durum wheat, whole grain, or CerealVeneta's roast-and-cryo-milling sequence. Preserve its existing generic wheat identity; do not reuse `farine de blé torréfiée` as an alias for the durum product.

## Current ownership and picker implications

The current package snapshot has 1,369 active references and 100 forms; the legacy-import file has 64 candidates and the research ledger has 1,699 records. No active name, alias, form label/match term, legacy candidate, or ledger key owns an exact candidate phrase. Nearby active rows are:

| Current owner | Exact current names | Boundary and data |
| --- | --- | --- |
| `ingredient-ref-durum-flour` | `durum flour` / `farine de blé dur`; alias `durum wheat flour`; French alias `farine de blé durum` | Unqualified durum flour. No density or unit mapping; no attached form. |
| `ingredient-ref-durum-semolina` | `durum semolina` / `semoule de blé dur` | Semolina, not the source-named toasted flour. No attached form. |
| `ingredient-ref-durum-wheat-berries` | `durum wheat berries` / `blé dur` | Whole grain, not flour. No attached form. |
| `ingredient-ref-roasted-wheat-flour` | `roasted wheat flour` / `farine de blé torréfiée` | Québec-mill generic wheat product; it has no durum qualifier or attached form. |
| `ingredient-ref-roasted-wheat-malt-flour` | `roasted wheat malt flour` / `farine de malt de blé torréfié` | A declared wheat-malt product, not the durum product. No attached form. |
| `ingredient-ref-malted-wheat-flour` | `malted wheat flour` / `farine de blé maltée` | Malted flour, not a roast-qualified identity. No attached form. |

The picker in `IngredientSearch.kt` first matches complete normalized phrases inside reference/form terms and then falls back to substring matching. The exact proposed English and French queries currently return no result. If a separate row were added, `deeply roasted durum wheat flour` and `farine de blé dur brûlé` would select it. Broader `durum wheat flour` and `farine de blé dur` would then match both the existing unqualified durum-flour row and the proposed row, while `roasted wheat flour` would remain owned by the generic Québec-mill row because `durum` interrupts that phrase in the candidate's English title. Holding the product leaves picker results unchanged.

## Bundled recipe demand

I scanned all 114 manifest-listed recipe files and their 1,123 ingredient rows, including original text, names, and reference IDs. The candidate phrases and the broader adjacent phrases `durum flour`, `durum wheat flour`, `farine de blé dur`, `durum semolina`, `semoule de blé dur`, `roasted wheat flour`, `toasted wheat flour`, and `farine de blé torréfiée` had no text hits. No row links to the adjacent durum-flour, durum-semolina, durum-berries, roasted-wheat-flour, or roasted-wheat-malt-flour IDs. The bundle provides no recipe demand for this identity.

## Measurement and substitution limits

The product page says the flour may be used in “small quantities,” but gives no amount, household measure, density, or conversion [S01, S02]. The technical product sheet requires a company name and email to request; the public pages do not provide exact-form measurement data. Do not infer values from ordinary durum flour, semolina, roasted generic wheat flour, or another roasted grain.

No exact-form source establishes a substitution ratio, baking replacement, yield, or equivalence with durum flour, semolina, roasted wheat flour, or traditional `blé brûlé`. No form, unit mapping, measure, density, conversion, yield, recipe link, or substitution is proposed.

## Source register

| Source ID | Source and locator | What it supports | Limits |
| --- | --- | --- | --- |
| `WP02-A7-DEEPLY-ROASTED-DURUM-FLOUR-20261013-R47-S01` | CerealVeneta, [Deeply roasted durum wheat flour](https://cerealveneta.it/en/semi-finished/deeply-roasted-durum-wheat-flour/), product title and description; product-sheet request form. | Product title, whole-durum input, semi-finished status, abundant but controlled toasting, cryomilling, and bakery/pasta application areas. | Italian B2B manufacturer page; no ingredient specification, Canadian or Québec availability, household measure, density, or substitution. Its public sheet download requires company details. “Small quantities” is not a numeric recipe amount. |
| `WP02-A7-DEEPLY-ROASTED-DURUM-FLOUR-20261013-R47-S02` | CerealVeneta, [Farine de blé dur brûlé](https://cerealveneta.it/fr/semi-finis/farine-de-ble-dur-brule/), title and description, lines 7–10; product-sheet request form at lines 44–56. | Source's French title; whole durum wheat, controlled “torréfaction douce,” cryomilling, and sensory distinction. | French-language manufacturer wording, not a Québec label or OQLF ruling. It does not establish local availability, a consumer package, or exact-form culinary data. |
| `WP02-A7-DEEPLY-ROASTED-DURUM-FLOUR-20261013-R47-S03` | CerealVeneta, [La “torréfaction douce”](https://cerealveneta.it/fr/mild-roasting-how-to-enhance-the-aromatic-component-of-cereals-seeds-and-pulses/), “Une idée qui vient de loin” and “Un nouveau processus,” lines 10–19. | Separates traditional Apulian `blé brûlé` from the manufacturer's inspired, controlled process; traditional grain is described as left after harvest/straw burning and milled. | Manufacturer's historical/process explanation; not a Québec terminology source or proof of a current traditional retail product. |
| `WP02-A7-DEEPLY-ROASTED-DURUM-FLOUR-20261013-R47-S04` | OQLF, [farine de blé dur (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8357377/farine-de-ble-dur), indexed entry, term and English equivalents; last updated 2004. | Supports base Québec French `farine de blé dur` / `farine de blé durum` and English `durum flour` / `durum wheat flour`. | Names the unqualified flour only; does not name or define roasted durum flour. Direct page open returned a cache error during this review. |
| `WP02-A7-DEEPLY-ROASTED-DURUM-FLOUR-20261013-R47-S05` | Les Moulins de Soulanges, [Farine de Blé Torréfié](https://moulinsdesoulanges.com/language/fr/farine-de-ble-torrefie/), title and description, lines 82–112; Québec address at lines 126–132. | Current Québec-mill French display and separate generic roasted-wheat product. | Does not specify durum wheat, whole grain, or CerealVeneta's roast/cold-milling process; not evidence for a synonym or alias. |
| `WP02-A7-DEEPLY-ROASTED-DURUM-FLOUR-20261013-R47-S06` | Les Moulins de Soulanges, [Roasted Wheat Flour](https://moulinsdesoulanges.com/language/en/roasted-wheat-flour/), title/description, lines 83–133; Québec address at lines 146–151. | Current Québec-mill English display corresponding to its generic roasted-wheat product. | Does not specify durum wheat, whole grain, or CerealVeneta's process; not evidence for a synonym or alias. |

## Next action

Reopen only when a current Canadian or Québec food supplier documents this specific whole-durum roasted flour, provides its bilingual product display and ingredient/process specification, or when a bundled recipe creates direct demand. Until then, leave the candidate unallocated and do not add an active identity, alias, ledger candidate, form, numeric value, recipe link, conversion, yield, or substitution.
