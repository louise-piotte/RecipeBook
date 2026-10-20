# WP02 Section A7 — Toasted White Sorghum Flour Boundary Review (R26)

- **Reviewed:** 2026-10-13.
- **Status:** Integrated as ledger-only unresolved candidate `candidate-toasted-white-sorghum-flour`; no active reference was added. See the [R26 integration record](../batches/wp02-wp03-wp04-round26-gap-review-integration-20261013/README.md).
- **Scope:** The manufacturer-named product *toasted white sorghum flour*, considered under the open A7 review of other malted/toasted flour identities. The A7 checklist still calls for review of other malted/toasted flour identities ([plan, A7 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L1435)). This review does not reopen the existing generic sorghum-flour identity, its regional aliases, or R25’s distinct micronised toasted millet product.
- **Source IDs:** `WP02-A7-TOASTED-WHITE-SORGHUM-FLOUR-20261013-R26-S01` through `S03`; these are recorded under the candidate in the shared research ledger.

## Recommendation

| Candidate | Disposition | Boundary |
|---|---|---|
| CerealVeneta *toasted white sorghum flour* | **Hold from the active catalog; record only as an unresolved candidate if integrated.** Proposed candidate ID: `candidate-toasted-white-sorghum-flour`. | The manufacturer names a toasted, white-sorghum flour and places it among semi-finished ingredients for bakery, pasta, and beverage applications. It does not give the processing sequence, define a household product, or provide a Québec French name. Keep this source-named product distinct from generic sorghum flour while those gaps remain. |
| Generic `toasted sorghum flour` | **Do not add as an alias or active identity.** | The source qualifies its product as both `white` and `toasted`; one manufacturer's title does not establish a market-wide toasted-sorghum-flour class or synonym for ordinary sorghum flour. |
| Québec French display and aliases | **Unresolved; add none.** | Codex establishes `farine de sorgho` as the French name for the base standardized flour, and OQLF establishes `sorgho` as the Québec French plant name. Neither source names this toasted white product. Do not activate the literal translation `farine de sorgho blanc torréfiée` without Québec product or terminology evidence. |

Reopen for active identity review if a product specification establishes what is toasted and when, and a Québec-facing bilingual label or terminology source supports the product display. If later accepted, assess it as a source-named `FLOUR_AND_STARCH` identity, not as a generic toasted-sorghum alias. Do not infer equivalence to the Codex-standardized sorghum flour, to toasted quinoa flour, or to another cereal's toasted flour.

## Why this is a new A7 review

The checklist leaves other malted/toasted flour identities open. R25 reviewed CerealVeneta’s *micronised toasted millet flour*, which is a different product with a different cereal qualifier and its own unresolved species/French-name boundaries ([R25 proposal](wp02-a7-micronised-toasted-millet-flour-boundary-review-20261013-round25.md)). The current CerealVeneta page lists *toasted white sorghum flour* separately from *native white sorghum flour*, as well as from toasted white quinoa flour and micronised toasted millet flour [S01]. This review is limited to the sorghum product and does not generalize its name or process to the other products in that list.

The active catalog has an ordinary sorghum-flour row, but exact searches of active names, aliases, forms, ledger records, and candidates found no current owner or prior unresolved candidate for `toasted white sorghum flour`, `toasted sorghum flour`, `farine de sorgho blanc torréfiée`, or `farine de sorgho torréfiée`. The existing product-family neighbor `roasted quinoa flour / farine de quinoa torréfiée` does not establish a sorghum name or process.

## Product and Québec French evidence

CerealVeneta’s product page is titled *Toasted white sorghum flour*. It describes the item as a semi-finished ingredient, lists bakery, pasta, and vegetable-drink applications, and shows *native white sorghum flour* as a similar semi-finished product [S01]. This supports that one manufacturer offers a named toasted product, distinct in its own range from its native flour. The page does not disclose the toast stage, mill sequence, particle grade, scientific sorghum variety, or a Québec/Canadian label. The product data sheet is behind a request form and was not available for this review. The manufacturer is in Italy; its page is not evidence of Canadian consumer availability.

The Codex standard for sorghum flour gives the French product name `farine de sorgho` and defines the standard product as industrially milled *Sorghum bicolor*. It expressly excludes sorghum meal and semolina [S02]. This supports the existing generic flour identity and keeps flour separate from the active sorghum-grits and sorghum-semolina references. Codex does not define toasted white sorghum flour, state that the manufacturer's product meets the standard, or establish a French process-qualified name.

OQLF lists `sorgho` as the preferred Québec French plant name for *Sorghum bicolor* [S03]. It does not provide a term for toasted sorghum flour. Although `farine de sorgho blanc torréfiée` is grammatically possible, that literal construction is not sourced as a Québec product name. Do not treat it as validated display text or an alias.

## Current catalog and picker boundary

Read-only snapshot: **1,353 ingredient references**, **98 forms**, and **1,674 research-ledger records**. The active sorghum-flour reference is `ingredient-ref-sorghum-flour`, displayed as `sorghum flour / farine de sorgho`; its English aliases include `jowar flour`, `jowar atta`, and `guinea corn flour`. It has no toasted/roasted alias. Sorghum grain, grits, and semolina have separate active references. The proposed candidate ID is unused.

Current picker projections, using the app's phrase-first matching and substring fallback ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)):

| Query | Current result | Boundary |
|---|---|---|
| `toasted white sorghum flour`; `toasted sorghum flour` | No result | No current active owner or alias. |
| `sorghum flour`; `farine de sorgho` | `ingredient-ref-sorghum-flour` only | The generic flour names currently select the ordinary sorghum-flour identity. |
| `white sorghum flour`; `farine de sorgho blanc torréfiée` | No result | Neither the product-qualified English phrase nor the proposed literal French translation is active. |
| `sorghum` | Five references: grain sorghum, puffed sorghum, sorghum flour, sorghum grits, and sorghum semolina | The generic query already presents distinct grain and milled products. |

If an active product row were added with the manufacturer's English name, the shorter phrase `sorghum flour` would also match that display and return both the ordinary and toasted-white products. A validated French display containing `farine de sorgho` would similarly expand that shorter French query to both choices. These are expected qualified-product collisions; they are a reason to keep a separate identity if later accepted, not to put the toasted product on the generic row. No picker behavior change is proposed.

## Bundled recipe demand

The manifest-listed corpus contains **114 recipes** and **1,123 ingredient rows**. I searched ingredient-row content and complete recipe JSON for `toasted white sorghum flour`, `toasted sorghum flour`, `farine de sorgho blanc torréfiée`, `farine de sorgho torréfiée`, and accent-folded French spellings. The search found **zero matching ingredient rows and zero recipe files**. No recipe link, relink, or amount is proposed.

## Numeric, form, and substitution boundaries

- Add no ingredient form, density, unit mapping, measurement observation, mass-volume conversion, cooking yield, or package yield. The accessible product page gives no transferable household quantity, and the withheld data sheet was not reviewed.
- Add no substitution rule or recipe-line link. The manufacturer's application list is product-use context, not tested recipe evidence or a transferable replacement ratio.
- Do not transfer any numeric or substitution data from generic sorghum flour, toasted quinoa flour, or toasted millet flour. No product equivalence is established.

## Exact disposition

1. If the coordinator integrates this review into the ledger, add only the unresolved candidate `candidate-toasted-white-sorghum-flour`, scoped to the exact CerealVeneta product title. Keep it out of active references and forms.
2. Do not add `toasted sorghum flour`, `roasted sorghum flour`, `toasted white sorghum`, or other shortened terms to `ingredient-ref-sorghum-flour`.
3. Do not activate `farine de sorgho blanc torréfiée`, `farine de sorgho torréfié`, or `farine de sorgho torréfiée` without Québec-facing naming evidence. The Codex base term and OQLF plant term do not resolve the modifier.
4. Keep the ordinary sorghum flour, grain, grits, and semolina references unchanged. Do not claim that the manufacturer product conforms to the Codex standard.
5. Add no forms, recipe links, measures, conversions, yields, or substitutions.

## Proposal-local source register

Sources were checked on **2026-10-13**. IDs are local to this review.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP02-A7-TOASTED-WHITE-SORGHUM-FLOUR-20261013-R26-S01` | CerealVeneta, [Toasted white sorghum flour](https://cerealveneta.it/en/semi-finished/toasted-white-sorghum-flour/). | Manufacturer product title; classifies it among semi-finished products, lists food-industry applications, and separately lists native white sorghum flour as a similar product. No French name, Canadian market evidence, species-level identification, toast/milling sequence, consumer grind specification, household measure, or equivalence to standardized sorghum flour is given. |
| `WP02-A7-TOASTED-WHITE-SORGHUM-FLOUR-20261013-R26-S02` | FAO/WHO Codex Alimentarius, [Norme Codex pour la farine de sorgho (CXS 173-1989)](https://www.fao.org/input/download/standards/58/CXS_173f.pdf). | Gives the base French name `farine de sorgho`; defines a standardized industrially milled *Sorghum bicolor* flour and excludes sorghum meal and semolina. It does not describe toasted white flour or establish that CerealVeneta's product meets this standard. |
| `WP02-A7-TOASTED-WHITE-SORGHUM-FLOUR-20261013-R26-S03` | Office québécois de la langue française, [sorgho (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho). | Gives `sorgho` as the preferred Québec French plant term and *Sorghum bicolor* as the Latin equivalent. It does not name a flour product or a toasted modifier. |

The candidate and its source evidence are recorded in `docs/catalog/research-ledger.v1.json`; the active sorghum-flour reference and all recipe data remain unchanged. No app, unit, instrumentation, or emulator tests were run because this update only adds database JSON data and derived catalog content under `AGENTS.md`.
