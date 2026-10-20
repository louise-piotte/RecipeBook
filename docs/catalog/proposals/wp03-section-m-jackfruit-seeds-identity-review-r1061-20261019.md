# WP03 Section M R1061 — jackfruit seeds identity review

- **Reviewed:** 2026-10-19.
- **Disposition:** Recommend one identity-only generic culinary ingredient for seeds of *Artocarpus heterophyllus* Lam.
- **Scope:** Generic ingredient diversity. No brand, product-line, flavour-family, SKU, retailer-variant, or commercial-roster research was conducted. Commercial-product counts do not add ingredient diversity; any roster-only queue item is out of scope and should not be pursued.
- **Plan anchor:** The completed jackfruit identity item explicitly left seeds outside the fruit owner ([catalog plan, lines 7050–58](../../RecipeBook-global-ingredient-catalog-plan.txt#L7050)); the earlier WP03 review says seeds are a separate edible-part scope. The regional-fruit work remains open at [line 7059](../../RecipeBook-global-ingredient-catalog-plan.txt#L7059).
- **Mutation scope:** Proposal only. This is the only file changed; no shared catalog, ledger, recipe, plan, roadmap, or generated file was edited.

## Recommendation and boundary

Add **jackfruit seeds / graines de jacque** as a separate generic ingredient identity for the seeds of *Artocarpus heterophyllus* Lam. This is an **identity-level edible-part proposal**, not a proposed boiled, roasted, or grilled form. The reviewed culinary sources describe eating seeds after cooking, especially boiling or roasting/grilling; this review does not claim raw culinary use. Do not infer a preparation form from those descriptions without recipe demand.

Keep this identity separate from the existing whole-fruit/pulp identity `ingredient-ref-jackfruit` (`jackfruit / jaque`), the existing source-named `young jackfruit in brine` form, jackfruit seed flour/powder, and starch isolated from jackfruit seeds. The earlier jackfruit review already classifies the seeds as a distinct edible part, while R138 and R181 separately hold isolated seed starch and seed flour/powder. Preserve those decisions and all current evidence. [S01–S02; existing evidence E01–E03]

### Bilingual naming and excluded terms

The OQLF lists **jaque** and **jacque** as preferred Québec French terms for the fruit and identifies *A. heterophyllus*. A French-language Réunion public-health recipe uses the exact ingredient wording **graines de jacque**. The compound is therefore source-attested and built from OQLF-listed fruit terminology, but the compound itself is not an OQLF entry or Québec-specific usage finding; keep the French display provisional pending independent Québec review. [E02, S02]

Do not add bare `jackfruit`, `jaque`, `jacque`, generic `seeds` / `graines`, `jackfruit seed flour`, or `jackfruit seed starch` as aliases. Do not add `graines de jacquier` or `graines de Jacquier`: the OQLF defines `jaquier` / `jacquier` as the tree, and the ARS title uses that tree term while its recipe ingredient line says `graines de jacque`. Keep the binomial in evidence, not as a picker alias. Do not extend the identity to breadfruit (*A. altilis*), breadnut (*A. camansi*), or their seeds.

## Proposed minimal data

| Field | Proposed value |
|---|---|
| `id` | `ingredient-ref-jackfruit-seeds` |
| `nameEn` | `jackfruit seeds` |
| `nameFr` | `graines de jacque` *(provisional Québec display)* |
| `aliasesEn` / `aliasesFr` | `[]` / `[]` |
| `category` | `NUT_SEED_AND_DRIED_FRUIT` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| `updatedAt` | `2026-10-19T00:00:00Z` |

Do not add a form, recipe link, conversion, yield, measurement observation, package yield, or substitution rule. If accepted, a new ledger reference record can use `identityState: verified` and `measurementState: researched_no_supported_value`. Keep `substitutionResearchState: not_yet_researched`; the reviewed sources give no tested replacement or ratio, and flavour resemblance is not substitution evidence. The ledger state is a proposal recommendation only.

## Live ownership and recipe-demand audit

The refreshed read-only snapshot contains **2,066 active references**, **205 forms**, **2,471 research-ledger records / 11,521 source entries / 9,680 distinct source IDs**, **55 legacy candidates**, and **114 manifest-listed recipes / 1,123 ingredient rows**.

| Surface | Current finding | Proposed effect |
|---|---|---|
| Active references | No reference owns `jackfruit seeds`, `graines de jaque`, or the target seed part. The only active direct owner is `ingredient-ref-jackfruit`: `jackfruit / jaque`, aliases `jakfruit / jacque`, category `FRUIT`. | Add one separate seed identity; preserve the whole-fruit row, names, category, and aliases unchanged. |
| Active forms | The only jackfruit form is `ingredient-form-jackfruit-young-in-brine`, owned by `ingredient-ref-jackfruit`. No seed form exists. | Do not move the brined-fruit form or add boiled/roasted forms. |
| Research ledger | The fruit reference is verified and has 18 sources; it owns existing Kew, OQLF, NParks, and other maturity/product-boundary evidence, including sources that mention edible seeds. The brined-fruit form has its own eight-source record. There is no seed-identity ledger record. | Keep every existing source, decision, and product-specific claim with its current owner. If accepted, create a distinct identity record and attach only the proposed seed-part evidence after coordinator review; do not duplicate or reassign existing source entries. |
| Legacy candidates | None of the 55 candidates matches the seed identity, its bilingual phrase, or the species-part scope. | Do not promote or alter a legacy candidate. |
| Recipe bundle | Accent-insensitive phrase scans across all 114 recipe files and their 1,123 structured ingredient rows found **0 file hits and 0 row hits** for `jackfruit seed(s)`, `seeds of jackfruit`, `graines de jaque/jacque/jacquier`, and *Artocarpus heterophyllus*. | No recipe link or recipe-derived form/quantity is supported. |
| Related decisions | R138 holds extracted jackfruit seed starch pending a Canadian/Québec human-food product and product-matched French name. R181 holds seed flour/powder pending its product and terminology boundary. The existing `young jackfruit in brine` form remains source/product-scoped under the fruit owner. | Preserve all three boundaries and their evidence; this proposal covers only whole culinary seeds. |

The name `jackfruit seeds` contains the parent query `jackfruit`, and the French name contains the parent fruit term `jacque`. A future row can therefore broaden broad fruit-term picker searches to return both whole fruit and seeds. This is an expected part-boundary effect; it does not justify adding broad aliases. Static ownership findings above are not a runtime picker test.

## Culinary use, numbers, and substitutions

- The National Parks Board page already allocated to the existing jackfruit reference says seeds may be eaten after roasting or boiling. The IAC food-plant profile independently describes seeds as edible after grilling or boiling, used like nuts or in dishes; the ARS recipe source describes grilled seeds as a snack or dish ingredient and gives a boiled, peeled, crushed preparation for one rougail. These are source-specific culinary-use descriptions, not a general processing protocol or active seed form. [S01–S02; E03]
- The IAC profile reports **50–500 seeds per fruit**. This is crop/fruit description, not a kitchen count measure. The ARS recipe lists **30 g of jackfruit seeds for six tartines** in that specific rougail recipe. Retain it only as source-specific recipe context; do not derive a per-serving amount, household measure, density, conversion, or reusable yield. [S01–S02]
- The IAC and ARS sources warn that raw seeds are toxic. This packet does not provide food-safety instructions, processing parameters, or raw-use guidance; it preserves the warning as a source-bounded limit and makes no claim beyond the reviewed sources. [S01–S02]
- No reviewed source tests a substitute or gives a ratio. The IAC comparison to chestnut is a taste description only. Do not infer that chestnuts, other seeds, or jackfruit flesh replace jackfruit seeds. Leave substitution research unperformed and add no global or contextual rule.

## Sources

### New seed-part sources

These proposal-local source IDs are not in the shared ledger. The IAC and ARS URLs were not found in current ledger ownership.

| ID | Source | What it supports and limits |
|---|---|---|
| `WP03-M-JACKFRUIT-SEEDS-R1061-20261019-S01` | Institut agronomique néo-calédonien (IAC), Agripedia, [Jacque (*Artocarpus heterophyllus*)](https://www.agripedia.nc/ressources-vegetales/plantes-alimentaires/fruits/jacque), updated 2026-08-14; food-use section, “Graines.” | Directly identifies the species, says seeds are edible after grilling or boiling, describes use like nuts or in dishes, and gives the crop-level 50–500 seeds per fruit range. The page also warns against raw seeds; this is not expanded into general food-safety advice. Its measurements are not kitchen measures. `sourceKind: culinary_reference`. |
| `WP03-M-JACKFRUIT-SEEDS-R1061-20261019-S02` | Agence régionale de santé de La Réunion, [*Le Jacquier* recipe sheet (PDF)](https://www.lareunion.ars.sante.fr/system/files/2021-11/recette-jacquier.pdf), “Les graines de Jacquier,” usage/preparation and ingredient list. | Public-health source names the part in the title, uses `graines de jacque` in the recipe ingredient line, describes grilled use, and gives one recipe using boiled, peeled, crushed seeds. Its 30 g is for six tartines in that recipe only. The title's `jacquier` does not override the OQLF's tree/fruit distinction. `sourceKind: regional_authority`. |

### Existing source allocations retained

| Pointer | Existing ledger source and owner | Use in this review |
|---|---|---|
| E01 | `WP03-JACKFRUIT-MATURITY-QC-20261011-S01`, [Kew POWO, *Artocarpus heterophyllus*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:850389-1/general-information); owned by `ingredient-ref-jackfruit` | Accepted species and general food-use context. Keep the source allocation with the fruit record. |
| E02 | `WP03-JACKFRUIT-MATURITY-QC-20261011-S02`, [OQLF GDT, *jaque*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2297111/jaque); owned by the fruit reference and its existing form record | OQLF preferred terms `jaque` / `jacque` for the fruit and Latin name. It does not define the compound seed name. Preserve ownership. |
| E03 | `WP03-JACKFRUIT-MATURITY-QC-20261011-S05`, [Singapore National Parks Board, *Artocarpus heterophyllus*](https://www.nparks.gov.sg/florafaunaweb/flora/2/7/2733); owned by `ingredient-ref-jackfruit` | Existing source also says seeds are eaten after roasting or boiling. Do not transfer or duplicate its current source entry. |

The earlier [WP03 jackfruit maturity/product review](wp03-jackfruit-maturity-product-quebec-review-20261011.md) defines seeds as a separate edible-part scope and already cites seed-use evidence. The [R138 seed-starch hold](wp02-section-04-b3-jackfruit-seed-starch-boundary-review-r138-20261015.md) and [R181 seed-flour/powder hold](wp02-b2-jackfruit-seed-flour-canadian-quebec-product-boundary-hold-r181-20261016.md) remain unchanged. No roster-only queue item was encountered in this generic seed review and no commercial roster was pursued. Any roster-only item is out of scope because commercial-product counts do not add ingredient diversity.

## Disposition summary

Recommend the generic, identity-level seed ingredient **jackfruit seeds / graines de jacque** for the culinary seed part of *Artocarpus heterophyllus*. Treat the French compound as provisional for Québec pending independent local usage review. Reviewed sources support culinary use after boiling or roasting/grilling, but this proposal creates no cooked-state form and makes no raw-use claim. Preserve the fruit reference, the source-named brined-fruit form, all source allocations, and the R138/R181 holds. Add no forms, measures, recipe links, conversions, yields, or substitutions. No software tests were run because this is proposal-only.
