# WP02 A4 roasted barley flour measurement and substitution review — R552 — 2026-10-17

## Review record

- **Reviewed and sources accessed:** 2026-10-17.
- **Status:** Integrated in the [R552–R554 integration README](../batches/wp02-wp03-wp04-r552-r554-gap-review-integration-20261017/README.md). Root accepted the evidence-state completion; shared catalog/reference data and active substitution behavior remain unchanged.
- **Scope:** Research reusable measurement and home-recipe replacement evidence for the existing `ingredient-ref-roasted-barley-flour`. Keep its accepted identity, bilingual names, alias, and distinction from other barley and malt products unchanged.
- **Exact plan anchor:** The still-open WP02 Section A4 parent at [line 1658](../../RecipeBook-global-ingredient-catalog-plan.txt#L1658) includes remaining barley flour grades and malted/toasted distinctions. R549 at [line 1667](../../RecipeBook-global-ingredient-catalog-plan.txt#L1667) addresses malted barley flour; R552 addresses the separate roasted-barley-flour evidence gap. The target's identity-only integration is recorded at [line 11307](../../RecipeBook-global-ingredient-catalog-plan.txt#L11335). This review does not close the A4 parent or duplicate the whole-barley measurement review [R281](wp02-a4-whole-barley-flour-measurement-substitution-review-r281-20261016.md).
- **New source ID:** `WP02-A4-RBF-MEAS-SUB-R552-20261017-S01` is proposal-local for the original roasting study below. Its DOI, article URL, and ID were not found in the current ledger, proposals, or batches. Reuse existing source IDs for product, terminology, and dosage evidence; do not mint a second source record for an already-owned URL.

## Bounded decision

**Add only evidence-state completion to the existing ledger row; hold all reusable measurement and substitution behavior.** If accepted, set `measurementState` to `researched_no_supported_value` and `substitutionResearchState` to `researched_no_supported_substitute` for a reusable home-recipe replacement amount. Add no `measurementObservations`. Add one evidence-only finding preserving the limits of a commercial roasted-flour dose and one laboratory roasting study. Keep `identityState: verified`.

The active identity remains `roasted barley flour / farine d'orge torréfiée`, category `FLOUR_AND_STARCH`, English alias `toasted barley flour`, no French aliases, `defaultDensity: null`, and empty `unitMappings`. Do not add a form, density, serving, mass-volume mapping, conversion, cooking yield, package yield, recipe link, global form rule, contextual substitution rule, or recipe-line substitution. The evidence does not establish a general cup measure, wheat-flour replacement ratio, hydration adjustment, or household dose.

## Current catalog and evidence ownership

The current ledger row is identity-verified; both research states remain `not_yet_researched`. It has no measurement observations or substitution findings. No form points to this reference, both global and contextual substitution-rule arrays are empty, and the package-yield file has no entry for this ID.

| Existing source ID | Current ledger owner and scope | R552 handling |
|---|---|---|
| `WP02-S110`, `WP02-S112`, `WP02-S113` | Shared by `ingredient-ref-roasted-barley-flour` and `ingredient-ref-malted-barley-flour`; OQLF and Arva terminology/product evidence for the malted identity boundary. | Keep as adjacent identity evidence only. Do not use it for roasted-flour measurement or performance. |
| `WP02-S123`, `WP02-S124` | Current English and French Moulins de Soulanges product pages on the roasted-barley-flour row. | Reuse for the Québec product's process description and suggested uses; refresh their access dates if integrated. The English URL also appears under separate source IDs on the Hattai-ko candidate and roasted-barley-malt row; the French URL appears under separate source IDs on roasted red-rice and roasted urid rows. Reuse the existing target IDs rather than adding URL duplicates. |
| `WP02-S125` | OQLF's base `farine d'orge / barley flour` term, owned by the roasted-barley-flour row. | Terminology and distinction only; no measurement or substitution claim. |
| `WP02-S144`, `WP02-S145` | ProBlend/Eurogerm product catalog and Parfen brochure, owned by the roasted-barley-flour row. | Reuse. S145 already defines the Parfen product family and lists barley products; its existing support text should be refreshed in place to capture the brochure's indicative addition range and commercial package information. S144 supports the `toasted barley flour` product-class label, not a quantity. |
| `WP02-A4-RBF-MEAS-SUB-R552-20261017-S01` | No current owner; proposal-local ID for Kohyama et al.'s 2022 original research. | If accepted, add once to the existing roasted-barley-flour record. It supports experiment-specific effects of roasting on laboratory water absorption and flour properties, not a kitchen measure or recipe substitution. |

The source audit found no prior proposal that completes measurement or general home-recipe substitution research for this active roasted-barley-flour row. Prior identity and boundary work already handles the name and processing scope, including the [roasted-flour product-boundary review](wp02-roasted-flour-product-boundaries-review-20261011.md), [Québec French display review](wp02-roasted-flour-quebec-french-display-review-20261011.md), and the roasted-barley-malt boundary. The distinct whole-grain row is covered by R281; the distinct malted row is covered by R549. Do not transfer the other rows' studies or findings here.

## Bilingual naming and picker projection

Keep the existing English display `roasted barley flour`, French display `farine d'orge torréfiée`, and English alias `toasted barley flour`. Keep French aliases empty. The French display remains the catalog's grammatically reviewed form; the mill page's product heading has inconsistent feminine agreement. No new name or alias is proposed.

The static projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalize case, accents, punctuation, and spacing; return complete word-phrase matches before partial matches. Querying the current reference and form data gives:

| Query | Current result | R552 effect |
|---|---|---|
| `roasted barley flour`; `toasted barley flour`; `farine d'orge torréfiée` | Only `ingredient-ref-roasted-barley-flour`. | No change; retain the existing bilingual exact terms. |
| `barley flour`; `farine d'orge` | Four rows: generic, malted, roasted, and whole barley flour. | No change; keep the broad family search multi-result. |
| `roasted barley` | Two rows: roasted barley flour and roasted barley malt flour. | No change; preserve the malt-flour distinction. |
| `malt flour` | Six separate generic/cereal-specific malt-flour rows; not the target. | Do not broaden the roasted barley flour with malt terms. |
| `farine maltée` | Generic `malt flour` only. | No change; keep generic malt and barley roasted flour separate. |

This is a static query projection, not a live Android picker test. R552 proposes no changes to names, aliases, forms, or picker terms.

## Bundled recipe demand and commercial package context

Scanned all **114 manifest-listed recipe files** and **1,123 structured ingredient rows**. Case-insensitive searches of each structured row for `roasted barley flour`, `toasted barley flour`, `farine d'orge torréfiée`, `roasted barley`, `orge torréfiée`, and `ingredient-ref-roasted-barley-flour` found **zero matching files and zero matching rows**. There is no bundled recipe link, application role, or recipe-specific amount supporting an active conversion or substitution.

The Eurogerm Parfen brochure lists 25 kg bags and a 100 kg minimum order. Those are commercial supply details, not a household package yield or a basis for a kitchen measure. Moulins de Soulanges' bilingual pages list suggested bakery uses but no package quantity. No reviewed Québec-facing product page supplies a consumer package measure or paired mass and volume.

## Measurement, density, and conversion evidence

- The current Moulins de Soulanges English and French pages describe a developed heat-treatment/roasting process, selected barley varieties, and suggested uses. The English page lists pizza, sourdough bread, gourmet pies, and brioche; the French page lists pizza, miche, tarts, and brioches. Neither provides a household volume, measured flour mass, serving, or conversion [reused `WP02-S123`, `WP02-S124`].
- Eurogerm's Parfen brochure defines its own range as roasted cereal flours, lists barley products, and states **“Indicative addition: 0.5 to 5%”**. It does not identify a household serving, specify the percentage denominator, assign a dose to each barley SKU, or define the range as replacement of another flour. This is commercial formulation guidance for that range, not a user-facing mapping or generic dosage [reused `WP02-S145`].
- Kohyama et al. prepared flour from one named cultivar, “Beau Fiber,” roasted whole grains in a fluidized-bed process with hot air at 220°C and several discharge conditions, then milled samples with an airflow mill. Their laboratory water-absorption test reports 1.78–2.27 mL/g dry weight after 90 minutes in 25°C water as roasting increased; after 30 minutes at 90°C it reports 4.98–2.46 mL/g. The two test conditions move in opposite directions [S01]. These values describe laboratory water uptake by the study samples, not bulk density, cup mass, household hydration, or a mass-volume conversion. The cultivar, roasting profile, mill, and test temperatures are not established as the Québec manufacturer's process or product.
- The paper concludes that roasting changed water absorption and flour properties and says further work is needed to determine optimal conditions and sensory acceptance in food products. It does not test a consumer recipe formula or establish a kitchen conversion [S01].

No reviewed source supports a reusable density, volume-to-mass mapping, consumer portion, or recipe quantity for the active Québec identity. Keep `defaultDensity: null`, `unitMappings: []`, and `measurementObservations: []`. Do not reinterpret laboratory water absorption as ingredient density or hydration instructions, and do not transfer generic or whole-barley flour measurements.

## Substitution evidence and limits

The Québec mill describes its product as a flour that performs in breadmaking despite low gluten content and lists several suggested uses, but it gives no formula, percentage, or replacement instruction [WP02-S123–S124]. Eurogerm's 0.5–5% **indicative addition** is for the Parfen commercial range; the source does not identify its basis or state that the amount replaces wheat flour. Neither source supports a household wheat-flour exchange rate.

The roasting study is a physicochemical investigation, not a food-recipe substitution trial. Its changes in particle size, damaged starch, and temperature-dependent water uptake show why a generic flour quantity or hydration adjustment cannot be inferred from barley identity alone. Its specific cultivar and roasting/milling process also differ from the incompletely disclosed commercial process on the Québec product page [S01, WP02-S123–S124]. The article's broad introduction to barley-flour use does not turn its experiment into a tested recipe recommendation.

Do not transfer the malted-barley study's conditional 5% recommendation from R549: malting/germination and roasting are distinct processes, and the R549 recommendation is limited to its tested malted flour, bread formula, and process. Do not transfer R281's whole-barley flour studies either. For a future specific recipe, any wheat-to-roasted-barley change would be an ingredient-to-ingredient contextual substitution and would need supported dish type, role, method, amount, and risk scope under [Requirements FR-5](../../../Requirements.md#L322) and [§6.5](../../../Requirements.md#L641). No current bundled recipe supplies such a context. Add no form, global substitution, contextual rule, preferred alternative, or recipe-line link.

## Proposed ledger delta and integration recommendation

If accepted, update only the existing `ingredient-ref-roasted-barley-flour` research record in `docs/catalog/research-ledger.v1.json`:

| Field | Proposed value |
|---|---|
| `identityState` | Keep `verified`. |
| `measurementState` | `researched_no_supported_value`. |
| `measurementObservations` | None. Do not store the study's laboratory water-absorption data as a kitchen measure, density, or conversion. |
| `substitutionResearchState` | `researched_no_supported_substitute` for a reusable home-recipe replacement amount. |
| Finding ID | `roasted-barley-flour-no-general-home-replacement-r552-20261017`. |
| Finding `researchState` | `researched_no_supported_substitute`. |
| Finding `context` | Whether the existing roasted barley flour has a reusable household measure or replacement amount, especially as a wheat-flour replacement across home-recipe types and roles. |
| Finding `basis` | The Québec manufacturer gives qualitative uses but no quantities. Eurogerm gives an indicative 0.5–5% commercial-range addition with a 25 kg bag and 100 kg minimum order, without stating a denominator or replacement basis. One original study measures laboratory water absorption of flour made from a single cultivar and roasting/milling process; its authors call for further work on food-product conditions and sensory levels. |
| Finding `limitations` | Do not encode Eurogerm's range as a household dose, replacement percentage, or denominator. Do not infer density, cup mass, hydration adjustment, baking performance, or a substitute amount from laboratory water-absorption values. Do not transfer the results to the Québec product, other roasting profiles, malted barley flour, whole barley flour, or a home recipe without matching product/formula evidence. |
| Finding `sourceIds` | Reused `WP02-S123`, `WP02-S124`, `WP02-S145`; new proposal-local `WP02-A4-RBF-MEAS-SUB-R552-20261017-S01`. |

Refresh existing S123/S124 access dates and update S145's support text in place if integrating; add S01 once to this row. Keep the reference JSON, all aliases, forms, package yields, global and contextual substitution files, and recipe files unchanged. Close only this evidence subtask in the still-open A4 parent; leave other barley grades, rye, oats, and rice work open.

## Source register

Sources were accessed on **2026-10-17** unless an earlier ledger record is explicitly noted. Reused IDs remain owned by their existing ledger record(s). The new S01 ID is proposal-local until integration.

| Source ID | Source and locator | Evidence and limits |
|---|---|---|
| `WP02-A4-RBF-MEAS-SUB-R552-20261017-S01` | Kohyama N., Ichinose Y., Kaneko S., and Matsuki J., [“Changes in starch, β-glucan, physicochemical properties, and flavor compounds in barley flour by roasting”](https://www.jstage.jst.go.jp/article/fstr/28/5/28_FSTR-D-22-00054/_html/-char/en), *Food Science and Technology Research* 28(5) (2022), 363–371, DOI [10.3136/fstr.FSTR-D-22-00054](https://doi.org/10.3136/fstr.FSTR-D-22-00054). | Original research, §§ Materials and Methods, Results and Discussion, and Conclusion. Uses one cultivar and controlled roast/mill conditions; reports laboratory water-absorption results under 25°C and 90°C test conditions and says more work is needed on food-product conditions and sensory acceptance. Not a consumer recipe, mass-volume measure, density, or generic substitution trial. |
| Reused `WP02-S123` | Les Moulins de Soulanges, Québec, [Roasted Barley Flour](https://moulinsdesoulanges.com/language/en/roasted-barley-flour/). | Names its product, describes its developed heat-treatment process, and lists pizza, sourdough bread, gourmet pies, and brioche. No amount, household measure, formula, or replacement percentage. Manufacturer page; it does not fully disclose process parameters. |
| Reused `WP02-S124` | Les Moulins de Soulanges, Québec, [Farine d'Orge Torréfié](https://moulinsdesoulanges.com/language/fr/farine-dorge-torrefie/). | French product page with process description and suggested uses of pizza, miche, tarts, and brioches. No amount, household measure, formula, or replacement percentage. The catalog retains the reviewed feminine display `farine d'orge torréfiée`. |
| Reused `WP02-S125` | OQLF, [farine d'orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9489060/farine-dorge). | Supports the Québec base terminology `farine d'orge / barley flour`; does not give roasted-product naming, measurement, or substitution data. |
| Reused `WP02-S144` | ProBlend / Eurogerm, [Bakery Ingredients catalogue](https://www.problend-eurogerm.com/images/fiche-bakery-ingredient.pdf), p. 2. | Lists Parfen Orge Fruite under `TOASTED BARLEY FLOUR`. Product-class naming only; no measure or dosage. |
| Reused `WP02-S145` | Eurogerm, [Parfen Taste Colour Ingredients brochure](https://www.problend-eurogerm.com/images/Fiches%20pdf%20ANG/Parfen_ANG08.pdf), pp. 1–2. | Defines Parfen as roasted cereal flour made by milling roasted cereal, lists multiple barley products, gives an indicative 0.5–5% addition, 25 kg bag, and 100 kg minimum order. The brochure does not state the percentage denominator or define the addition as flour replacement. Commercial product-family information, not home-recipe guidance. |
| **R01 — repository audit** | Current reference, form, package-yield, and substitution-rule JSON; research ledger; Section A4 plan and prior proposals; `IngredientSearch.kt`; manifest-listed recipe files. | Workspace snapshot on 2026-10-17. Confirms current ownership, zero attached forms/rules/yields, static picker results, and zero bundled recipe matches. |

## Review-only verification

Re-read the current `AGENTS.md`, relevant unit-conversion and contextual-substitution requirements, the open Section A4 parent, the target reference and ledger rows, its adjacent barley references, existing roasted-flour identity proposals, and the bundle manifest. Rechecked the new article URL/DOI and source-ID ownership, static picker projection, and every manifest-listed recipe ingredient row. This is proposal-only documentation; no software tests were run.
