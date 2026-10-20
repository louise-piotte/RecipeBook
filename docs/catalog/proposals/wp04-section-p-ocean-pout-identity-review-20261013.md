# WP04 Section P — Ocean pout / loquette d’Amérique identity review

- **Review and source-access date:** 2026-10-13.
- **Packet type:** Proposal-only species identity, Québec naming, picker, recipe-demand, and product-scope review.
- **Recommendation:** Add identity-only `ingredient-ref-ocean-pout` in `PROTEIN`, displayed as **ocean pout / loquette d’Amérique**, with empty alias arrays. Add no forms, measures, density, unit mappings, recipe links, conversions, yields, or substitutions.
- **Status:** Accepted and integrated on 2026-10-13; the proposal records the reviewed decision and evidence.

## Why this is an open Section P identity

The active [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt) still includes regional fish. I checked that open scope, recent finfish and shellfish proposals and batches, recent roe and sea-urchin reviews, active references and forms, the legacy candidate list, the research ledger, and the bundled recipes. No focused Ocean Pout proposal, batch, active identity, form, legacy candidate, or identity ledger record appeared. The Pacific-saury picker boundary and the recent regional-fish holds are separate decisions; this review does not reopen or duplicate them.

The nearby burbot review mentions `eelpout` among reported burbot names and excludes it from burbot aliases. That mention does not allocate Ocean Pout or make the two fish interchangeable. Do not transfer `eelpout`, `eel pout`, or other burbot-associated wording to this candidate. [S01; prior boundary: the linked [burbot identity review](wp04-section-p-burbot-lotte-identity-review-20261012.md).]

## Species identity and Canadian / Québec names

The Atlantic Fishery Regulations list **Ocean pout / Loquette d’Amérique** together with *Macrozoarces americanus*. The CFIA explains that its Fish List provides the English and French common names acceptable in Canada for fish labelling, with scientific names and taxonomic serial numbers. These establish a Canadian bilingual species name; the regulations and CFIA list do not establish a recipe form or household measure. [S02–S03]

OQLF’s edible-fish entry gives **loquette d’Amérique** as the preferred Québec French term and *ocean pout* as its English equivalent. It labels bare `loquette` as discouraged, noting it was tolerated as a commercial name only from 1971 to 1976. Use the qualified French display; do not add `loquette` as a French alias. OQLF also records `sea pout`, `muttonfish`, and `eel pout`, but those names are not needed for a Québec-facing identity and are excluded from aliases. [S01]

There is a scientific-name variation across sources. OQLF and the Canadian regulation use *Macrozoarces americanus*. Exploramer’s current French species page uses *Zoarces americanus*; NCBI Taxonomy currently lists *Zoarces americanus* as the name and *Macrozoarces americanus* as a homotypic synonym. NCBI itself cautions that its taxonomy is not an authoritative nomenclature source. Treat these spellings as referring to this same fish, preserve both in source notes if the identity is later integrated, and do not add either binomial as a picker alias. [S01–S02, S04, S07]

Québec food-use evidence exists but describes a low-availability regional fish. Exploramer’s species page says there is no directed commercial fishery, describes incidental capture and low commercial interest, and discusses its use in traditional Newfoundland and Labrador dishes. Its 2022 supplier directory lists one supplier with availability “à l’occasion (prises accessoires)” in the Bas-Saint-Laurent. This supports an edible fish identity and occasional product availability; it is not evidence of routine Québec retail stock or a defined package. Exploramer’s current Fourchette bleue page includes the species and places loquette among its status-four examples—species little known, rejected or not consumed in Québec, and taken as bycatch—which reinforces that limitation. [S04–S06]

## Proposed identity boundary

| Field | Recommendation |
|---|---|
| Proposed reference ID | `ingredient-ref-ocean-pout` |
| Category | `PROTEIN` |
| English display | `ocean pout` |
| Québec French display | `loquette d’Amérique` |
| English aliases | `[]` |
| French aliases | `[]` |
| Scope | The fish species *Macrozoarces americanus* / *Zoarces americanus*, as a food ingredient identity |

Do not add `sea pout`, `muttonfish`, `eel pout`, `eelpout`, `anguille de roche`, or a scientific name as aliases. The first three are unnecessary alternate names in the reviewed terminology; `eelpout` risks confusion with burbot wording; and `anguille de roche` is only an “other appellation” on the Exploramer page, not the preferred OQLF name. No product type such as fillet, whole fish, fresh, frozen, cooked, or smoked is implied by this identity.

## Exact ownership and picker projection

The exact-key review follows [`normalizeIngredientSearchKey`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It normalizes names and aliases, checks complete word phrases first, and only uses substring fallback when no phrase result exists. Active references, attached form names and match terms, legacy candidates, and ledger record IDs and source text were checked for `ocean pout`, `loquette d’Amérique`, *Macrozoarces americanus*, *Zoarces americanus*, `pout`, `loquette`, the listed alternate names, and the proposed IDs. No exact active reference, form, legacy candidate, or identity ledger record owns this candidate. `ingredient-ref-ocean-pout`, `candidate-ocean-pout`, and the source-ID prefix below were unused at review time.

| Query | Current picker result | With the proposed display | Effect |
|---|---|---|---|
| `ocean pout` | None | Ocean pout / loquette d’Amérique | Exact species phrase becomes selectable. |
| `loquette d’Amérique` | None | Ocean pout / loquette d’Amérique | Exact Québec phrase becomes selectable. |
| `pout` | `mamey sapote (Pouteria sapota)` through substring fallback | Ocean pout / loquette d’Amérique through complete-word phrase match | Replaces an unrelated scientific-name substring false positive; it does not hide another fish identity. |
| `loquette` | None | Ocean pout / loquette d’Amérique | The discouraged historical bare term becomes searchable as a component of the qualified display; no existing result is displaced. Keep the visible display qualified and add no alias. |
| `amérique` | Three results | The same three plus Ocean Pout | Remains a multi-result query. |
| `sea pout`, `muttonfish`, `eel pout`, `eelpout`, `anguille de roche` | None | None | These are not proposed aliases. |

Thus, the picker projection shows no broad-query suppression that would make the species row misleading. The one changed `pout` result is a correction of the existing fallback. The bare French component remains a terminology caveat because the picker searches display-name words, but it does not remove or collapse another current result.

At the time of review, the worktree snapshot contained 1,385 active references, 100 forms, 63 legacy candidates, and 1,718 research-ledger records with 6,750 source entries. The manifest listed 114 recipes and their ingredient rows totaled 1,123. The snapshot is recorded here so integration can recheck ownership and search behavior against its live inputs.

| Snapshot file | SHA-256 |
|---|---|
| `ingredient-references.v1.json` | `958ace3a9625b653a39c7666233c07bea2d476de26ccd66ed88ceed0f83ad5c0` |
| `ingredient-forms.v1.json` | `10d6ff7e9dce21aecb8bda299f16a04882fa6f17235d0d5a976de4ce9cf3da63` |
| `legacy-import-identities.v1.json` | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `research-ledger.v1.json` | `25ec1a32f278de43cf6c84e8ad20359b485e569ab0132c343de2805b304de421` |
| `manifest.v1.json` | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The source-ID namespace `WP04-SECTIONP-OCEAN-POUT-20261013-S01` through `S07` was checked against current catalog records and proposal/batch files before drafting. These IDs are local to this proposal and have not been added to the shared ledger.

## Recipe demand and numeric / form / substitution limits

I scanned all 114 manifest-listed recipe files and all 1,123 ingredient rows, including complete recipe JSON text, for the species names and taxa, the qualified English and French names, `pout`, `loquette`, and the reviewed alternate names. The scan found zero candidate-term hits. No bundled recipe gives this fish a product state, amount, recipe link, or contextual substitution. The manifest-ordered corpus digest—each relative path, a NUL byte, exact file bytes, and another NUL byte—is `81f1dd0b010f9c90316ebb20b76800442dd29ceaeaf7559d8cd16d38efa7c552`.

The supplier-directory note is only an occasional-bycatch availability observation; it provides no SKU size, portion, drained weight, or standardized preparation. Exploramer’s culinary suggestions describe possible preparations, not measured recipe formulas. No numeric measure, density, unit mapping, conversion, edible yield, or form can be adopted from the reviewed sources. No source supports substituting this fish for burbot, eel, cod, another whitefish, or any other seafood; shared habitat, texture, or cooking method would not establish equivalence.

## Recommendation

Add one **identity-only** reference as `ingredient-ref-ocean-pout`, **ocean pout / loquette d’Amérique**, category `PROTEIN`, with no aliases. The species and bilingual display are independently supported by OQLF and Canadian government naming sources; Québec food sources confirm occasional, though limited, food use. The picker projection does not suppress another fish identity. Keep the row strictly at species identity: the recipe corpus supplies no demand, and the available Québec market evidence does not justify inventing a regular retail form, measure, yield, or substitution.

## Sources

Sources were checked on 2026-10-13. Source IDs are proposal-local.

| Source ID | Source and direct link | Evidence and limits |
|---|---|---|
| `WP04-SECTIONP-OCEAN-POUT-20261013-S01` | Office québécois de la langue française, [loquette d’Amérique (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9897986/loquette-damerique) | Preferred Québec term, English `ocean pout`, *Macrozoarces americanus*, and discouraged bare `loquette` with its historical commercial-use note. Also records `sea pout`, `muttonfish`, and associated `eel pout`; those are not accepted as aliases here. |
| `WP04-SECTIONP-OCEAN-POUT-20261013-S02` | Government of Canada, [Atlantic Fishery Regulations, 1985, Schedule](https://laws-lois.justice.gc.ca/PDF/SOR-86-21.pdf) | Current to 2026-06-17; lists Ocean pout / Loquette d’Amérique with *Macrozoarces americanus*. Regulatory naming evidence, not a recipe or retail form. |
| `WP04-SECTIONP-OCEAN-POUT-20261013-S03` | Canadian Food Inspection Agency, [CFIA Fish List](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/list) | Explains that the Fish List provides the common names acceptable in Canada for fish labelling and links them to scientific names and TSNs. It does not establish recipe measures. |
| `WP04-SECTIONP-OCEAN-POUT-20261013-S04` | Exploramer, [Loquette d’Amérique — De l’eau à la bouche](https://deleaualabouche.ca/especes/loquette-damerique/) | Québec food and species page; uses *Zoarces americanus*, notes incidental capture and low commercial interest, and describes traditional Newfoundland and Labrador food use and preparation. It is not a standardized recipe or a current retail specification. |
| `WP04-SECTIONP-OCEAN-POUT-20261013-S05` | Exploramer, [Fourchette bleue](https://deleaualabouche.ca/une-fierte-alimentaire/fourchette-bleue/) | Current programme page includes loquette among marine species and describes the status-four bycatch / low-consumption category. Supports limited regional market context, not routine stock. |
| `WP04-SECTIONP-OCEAN-POUT-20261013-S06` | Exploramer, [Répertoire des fournisseurs 2022](https://exploramer.qc.ca/wp-content/uploads/2022/05/22.05.04-Repertoire-des-fournisseurs-2022.pdf) | Lists Les Crevettes de Sept-Îles Inc. with availability “à l’occasion (prises accessoires)” in Bas-Saint-Laurent. Dated, occasional supply evidence only; no package size or portion. |
| `WP04-SECTIONP-OCEAN-POUT-20261013-S07` | National Center for Biotechnology Information, [Taxonomy ID 8199](https://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=8199) | Currently displays *Zoarces americanus* and lists *Macrozoarces americanus* as a homotypic synonym. Taxonomic cross-reference only; NCBI cautions that its taxonomy is not authoritative nomenclature. |


## Root review and integration outcome

**Accepted as identity-only `ocean pout / loquette d’Amérique`.** The active row uses the OQLF-preferred qualified French display, has no aliases, and has no forms or reusable numeric data. Its evidence record reuses the existing CFIA Fish List source ID `WP04-SECTIONP-BLUE-CRAB-IDENTITY-20261013-R5-S04`; the species-specific government, OQLF, and Québec food-use sources remain attached to this record. Picker review confirms that `pout` now selects Ocean Pout instead of the unrelated Pouteria substring result and that no competing fish result is suppressed. See the [integration record](../batches/wp04-section-p-ocean-pout-identity-integration-20261013/README.md).

No tests were run because this change only adds database JSON data, per `AGENTS.md`.
