# WP02 A7 R46: toasted buckwheat flour boundary review

**Disposition: hold, unallocated.** Manufacturer material confirms a toasted buckwheat-flour product class [S01–S04], but the reviewed evidence does not establish a current Québec product or Québec French display [S03, S05], nor whether every named commercial product is a single-ingredient flour [S01, S04]. Keep this candidate outside active references and the research ledger until those boundaries are resolved. No shared catalog, ledger, plan, roadmap, or integration README was changed.

## Candidate and archive check

The proposed candidate is the exact English product phrase **toasted buckwheat flour** [S01, S02, S04]. The related French phrase found in manufacturer material is **farine de sarrasin nature et toastée** [S03]; this is French product-language evidence from a French supplier, not a Québec label or OQLF ruling. The OQLF supports `sarrasin` as the base term only [S05]. Keep `toasted` bounded to the manufacturer's product wording. The sources do not support adding `roasted buckwheat flour`, `farine de sarrasin torréfiée`, `farine de sarrasin grillée`, or `kasha flour` as general aliases.

Before selecting this gap, the exact English phrases `toasted buckwheat flour`, `roasted buckwheat flour`, `toasted kasha flour`, and manufacturer name/code `Parfen Sarrasin` / `11205`, plus French variants `farine de sarrasin toastée`, `farine de sarrasin grillée`, and `farine de sarrasin torréfiée`, were checked against active references, forms, legacy-import identities, the research ledger, the A7 plan dispositions, and the proposal archive. No prior catalog disposition, candidate, or proposal for this flour product was found. The separately reviewed R32–R45 candidates and earlier meal holds remain out of scope.

## Ownership and picker implications

The current package has 1,369 active references and 100 forms. No active reference, alias, form, or legacy-import identity owns any exact toasted-buckwheat-flour phrase above, and there is no matching ledger candidate. The nearby active identities are:

| Current owner | Exact scope | Boundary |
| --- | --- | --- |
| `ingredient-ref-buckwheat-flour` | `buckwheat flour` / `farine de sarrasin`; English aliases `kuttu atta`, `kuttu ka atta`, `kuttu flour`, and `soba-ko` | Plain flour; no toasted form, density, or unit mapping. |
| `ingredient-ref-sprouted-buckwheat-flour` | `sprouted buckwheat flour` / `farine de sarrasin germé`; alias `germinated buckwheat flour` | Sprouting does not imply toasting. |
| `ingredient-ref-roasted-buckwheat-groats-dry` | `buckwheat groats, roasted, dry` / `grains de sarrasin rôtis et secs` | Roasted whole groats, not flour. |

The live search implementation in `IngredientSearch.kt` first looks for a complete normalized phrase within reference/form terms, then falls back to substring matching. As a result, `toasted buckwheat flour` and `farine de sarrasin toastée` currently have no owner and return no result. The broader queries `buckwheat flour` and `farine de sarrasin` already match the plain and sprouted flour rows because each phrase occurs within those displayed names. If a separate identity is later justified, its qualified queries should select that row, while the broader flour queries will gain another result. Do not attach this process to the plain flour or roasted-groats row as a form: the sources describe a flour product, not a recipe preparation state applied to either existing identity.

The OQLF defines `kacha` / `kasha` as a gruel made from roasted buckwheat. Do not promote the manufacturer-specific phrase `Toasted Kasha flour` to a general `kasha` alias or treat it as the Québec name for flour [S06].

## Recipe demand

The bundled package contains 114 recipe files and 1,123 ingredient rows. The full ingredient-row scan covered source text and normalized ingredient-name fields for the candidate English and French phrases, buckwheat flour, roasted groats, and kasha. **No row matched.** There is no recipe link or recipe demand supporting an active identity in this bundle.

## Measurement and substitution limits

No exact-form household measure, bulk density, or unit mapping was found. Flanquart reports professional flour particle-size and packaging information, but these are product/industrial specifications and do not supply a toasted-flour kitchen measure or density. Do not copy values from its plain-flour specification, from buckwheat flour generally, or from roasted whole groats.

No exact-form recipe or controlled source supports a one-for-one substitution between toasted and natural buckwheat flour, between flour and roasted groats, or between the named functional bakery products and ordinary flour. Manufacturer application language and custom-blend advice are not a household substitution rule. Add no measurement, density, mapping, form, conversion, yield, recipe link, or substitution.

## Source register

| Source ID | Source and locator | What it supports | Limits |
| --- | --- | --- | --- |
| **WP02-A7-TOASTED-BUCKWHEAT-FLOUR-20261013-R46-S01** | Eurogerm, [product catalogue](https://eurogerm-kb.com/images/Eurogerm-product-catalog.pdf), PDF p. 8, “Baguette & Ciabatta,” item 11205, Parfen Sarrasin 75. | Manufacturer catalogue identifies the product description `Toasted buckwheat flour`. | B2B product entry; no ingredient statement, French display, process sequence, household measure, or substitution is given. It does not prove the commercial product is pure buckwheat flour. |
| **WP02-A7-TOASTED-BUCKWHEAT-FLOUR-20261013-R46-S02** | Flanquart, [Buckwheat flour](https://www.flanquart.fr/en/range/flour-range/buckwheat-flour/), “Versions,” “Applications,” and “Buckwheat flour range and packaging.” | Current manufacturer page names “natural and toasted buckwheat flour” and describes thermal-treatment intensity, toast notes, and adjustable particle size. | French supplier, not Québec market evidence. Its “Versions” list names only Natural, despite the later broader mention of toasted flour; no distinct toasted SKU or ingredient statement is shown. It does not specify treatment order, consumer package, or equivalence. Plain-flour technical values are not transferred. |
| **WP02-A7-TOASTED-BUCKWHEAT-FLOUR-20261013-R46-S03** | Flanquart, [Farine de sarrasin](https://www.flanquart.fr/notre-gamme/gamme-farines/farine-de-sarrasin/), “Déclinaisons,” “Applications,” and “Gamme farine de sarrasin et conditionnements.” | French manufacturer wording includes `farine de sarrasin nature et toastée`; the source also separates toasted flavour from a generic plain-flour description. | French source, not a Québec label or terminology ruling. Its “Déclinaisons” list names only Nature, despite the later broader mention of toasted flour. It does not establish a Québec product or that `toastée`, `grillée`, and `torréfiée` are interchangeable display terms. |
| **WP02-A7-TOASTED-BUCKWHEAT-FLOUR-20261013-R46-S04** | Castle Ingredients, [product range brochure](https://www.castle-group.eu/web/content/209206?unique=7087bc05a4657ee9c96d76ed4d1fe65acb7b7768), PDF p. 4, “Premixes and Flours.” | Lists `Toasted Kasha flour (Toasted buckwheat flour)`, confirming that a manufacturer uses both terms for a flour offering. | Belgian food-industry brochure; it gives no French label, ingredient statement, consumer-market availability, or Québec usage. The equivalence is bounded to this listing. |
| **WP02-A7-TOASTED-BUCKWHEAT-FLOUR-20261013-R46-S05** | OQLF, [sarrasin (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8889520/sarrasin), “Terme privilégié” and English translation. | Supports Québec French `sarrasin` and English `buckwheat` for the base ingredient. | Last updated 1982; does not name or define a toasted flour product. |
| **WP02-A7-TOASTED-BUCKWHEAT-FLOUR-20261013-R46-S06** | OQLF, [kacha (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506505/kacha), definition and “Termes privilégiés.” | Defines `kacha` / `kasha` as a gruel made from roasted buckwheat, supporting separation from flour. | Defines the prepared dish, not a toasted flour product. |

## Next action

Seek a current Québec product page or package with an explicit bilingual product name and ingredient statement, then confirm whether the product is plain toasted buckwheat flour or a functional bakery blend and whether grain or flour receives the heat treatment. Revisit an identity-only `FLOUR_AND_STARCH` row only after the standalone product and Québec French display are supported. Reassess measurements and substitutions separately from those identity sources.
