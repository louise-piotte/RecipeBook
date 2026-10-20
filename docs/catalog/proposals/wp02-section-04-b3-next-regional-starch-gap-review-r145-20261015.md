# WP02 Section 04 B3 R145 — teff-starch product-boundary hold

- **Date:** 2026-10-15
- **Status:** Proposal-only; no catalog or ledger data changed.
- **Checklist:** The open parent is “Water-chestnut flour and other documented regional starches” in the active [WP02 plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L2209). This review considers starch isolated from teff grain (*Eragrostis tef*), not whole grain, teff flour, injera, or modified starch.
- **Source-ID prefix:** `WP02-B3-TEFF-STARCH-HOLD-R145-20261015`; checked against the live ledger and the proposal/batch archive before drafting.

## Recommendation

**Hold teff starch outside the active catalog and research ledger.** Primary studies demonstrate teff starch as an experimentally isolated fraction, but the current Canadian and Québec sources reviewed here identify teff grain and flour, not a standalone food-starch product. OQLF’s French term `tef` names the cereal; it does not name a starch product. The descriptive construction `amidon de teff` therefore remains unverified product wording. Do not add a reference, alias, ledger candidate, form, measure, recipe link, or substitution.

This is a bounded product and Québec-naming hold, not a claim that no teff-starch product exists anywhere. Reopen if a current Canadian or Québec human-food product source identifies a standalone teff starch (or a clearly scoped food-grade fraction) and local product wording can be supported or independently reviewed.

## Identity and French-language boundary

The candidate would be starch separated from *Eragrostis tef* grain. Chinnasamy et al. isolate starch from the Quncho tef variety in a laboratory extraction and characterize its composition and physical, thermal, morphological, and pasting properties [S01]. Sidhu et al. begin with brown teff grain and apply specified chemical or enzymatic modifications to experimental starch samples [S02]. These studies distinguish starch from whole grain and flour as research materials. They do not identify a Canadian consumer or food-service SKU, a shared commercial grade, or a Québec product label.

The Canadian and Québec-facing product evidence found in this review concerns neighboring forms:

- A current French-language Walmart Canada listing uses the product wording `Farine de Teff à Grains Entiers` for a 600 g flour [S05].
- Centre Nature et Santé in Longueuil identifies `farine de teff` as flour made from ground teff grains and describes where that flour is sold [S06].
- Celiac Canada’s product finder lists a Good Eats `TEFF BROWN FLOUR` product [S07].

These sources support local grain/flour context only. They do not establish isolated starch as a marketed product or justify assigning the flour’s wording to starch.

OQLF’s GDT entry gives `tef` as a recommended but non-current French spelling for the cereal and pairs it with English `teff` [S03]. Its `amidon` entry prefers the general French term for starch and places `fécule` more specifically in tuber or other underground-organ contexts [S04]. Neither source gives a teff-starch compound or names a consumer ingredient product. `Amidon de teff` is a transparent descriptive construction for future review, not an accepted display or alias here. Do not select `fécule de teff` by analogy: teff is a cereal, and that compound is unattested in the reviewed product sources. Preserve the existing grain display and aliases, and the separate flour display, without extension to starch.

Targeted searches on 2026-10-15 for `teff starch`, `tef starch`, `teff starch Canada`, `amidon de teff`, and `fécule de teff` surfaced research papers and grain/flour material, but no standalone Canadian or Québec teff-starch product. This is a bounded search result, not proof of market-wide absence.

## Existing ownership and archive check

The active package snapshot contains 1,501 ingredient references, 118 forms, 1,846 research-ledger records, and 61 legacy-import candidates. The manifest lists 114 recipes. Exact searches of the plan, active references, forms, research ledger, legacy identities, and proposal/batch archive found no prior teff-starch identity decision, exact owner, `ingredient-ref-teff-starch`, `candidate-teff-starch`, or R145 source prefix.

| Existing record | Current ownership | Boundary to preserve |
| --- | --- | --- |
| [`ingredient-ref-teff-grain`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L17341) | `teff` / `teff d'Abyssinie`; French aliases `tef` and `graines de teff`; `GRAIN_AND_CEREAL`; null density and no unit mappings. Its ledger record is [`ingredient-ref-teff-grain`](../research-ledger.v1.json#L116996). | Whole cereal grain, not flour or isolated starch. |
| [`ingredient-ref-teff-flour`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L17330) | `teff flour` / `farine de teff`; no aliases; `FLOUR_AND_STARCH`; null density and no unit mappings. Its ledger record is [`ingredient-ref-teff-flour`](../research-ledger.v1.json#L116949). | Ground whole grain flour, not isolated starch. |
| Ingredient forms | No teff-grain or teff-flour form is attached; no teff-starch form exists. See the [active forms file](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json). | No preparation or processing state is supported as a form of either neighbor. |
| Legacy identities | No teff-starch candidate is listed in the [legacy import file](../legacy-import-identities.v1.json). | Do not use legacy allocation to imply a product identity. |

The archive search found the prior teff-grain spelling and grain/flour identity reviews, but no focused teff-starch review or integration. Those neighboring decisions remain unchanged; this proposal does not reopen the existing teff-grain alias or teff-flour decisions.

## Picker projection

The current search normalizes accents and punctuation, returns complete normalized word-phrase matches before falling back to partial matching, and searches reference display names and aliases [the implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9). No teff form terms affect these results.

| Query | Current results | Hypothetical result if a row had EN `teff starch` and FR `amidon de teff` | Disposition |
| --- | --- | --- | --- |
| `teff starch` | None | New teff-starch row only | Candidate-specific phrase, but no Canadian/Québec product evidence supports activation. |
| `amidon de teff` | None | New teff-starch row only | Descriptive hypothetical phrase, not an attested product name. |
| `teff` | Teff grain; teff flour | Teff grain; teff flour; hypothetical starch | Broad query already returns two distinct products; adding an identity would make it three. Preserve this multi-result behavior. |
| `tef` | Teff grain only | Teff grain only | Existing OQLF-backed grain alias remains grain-specific. Do not add it to starch. |
| `graines de teff` | Teff grain only | Teff grain only | Existing product wording remains on grain. |
| `farine de teff` | Teff flour only | Teff flour only | Keep the Québec flour wording on flour. |
| `starch` / `amidon` | 35 / 29 references | 36 / 30 references | Expected broad category searches; do not add either generic term as an alias. |

The hypothetical row uses only the descriptive pair to expose picker behavior; it is not a proposed JSON delta or an ID reservation. Keep `teff`, `tef`, `farine de teff`, `amidon`, and generic `starch` from being assigned to a new candidate as aliases.

## Recipe demand and numeric limits

The full manifest lists 114 recipe JSON files and 1,123 ingredient rows. A scan of all listed recipe JSON content found no `teff`, `tef`, teff-starch, or teff-flour demand. No recipe link or relinking action is supported.

The studies report laboratory extraction and material characterization, not a package serving, household cup/spoon measure, or transferable volume-to-mass conversion [S01–S02]. Do not turn extraction inputs, sample composition, pasting/thermal properties, digestibility, or experimental modification conditions into a default density, unit mapping, measure, or household yield. The comparison of isolated teff starch with maize starch in research does not test recipe replacement. No general substitution for corn, potato, tapioca, rice, or another starch is supported.

## Proposed delta

**No JSON delta.** Do not add `ingredient-ref-teff-starch`, a ledger record, aliases, forms, measurement observations, recipe links, conversions, yields, or substitution findings from this review. Keep the French construction `amidon de teff` unassigned until product-level evidence and Québec wording review support it.

Reconsider only when a source identifies a current Canadian/Québec human-food teff-starch product or a well-scoped food-grade supply product and supports its actual product name. If later accepted, keep it separate from whole teff grain and teff flour; evaluate any package measures or substitutions against that exact product rather than these laboratory studies.

## Source register

All sources reviewed 2026-10-15. Proposal-local IDs are not added to the shared ledger because the disposition is a hold.

| Source ID | Source and contribution | Limit |
| --- | --- | --- |
| `WP02-B3-TEFF-STARCH-HOLD-R145-20261015-S01` | Gomadurai Chinnasamy, Kenenisa Dekeba, Venkatesa Prabhu Sundramurthy, and Belay Dereje, [“Physicochemical properties of tef starch: morphological, thermal, thermogravimetric, and pasting properties”](https://doi.org/10.1080/10942912.2022.2098973), *International Journal of Food Properties* 25(1), 1668–1682 (2022). Primary study isolates starch from Quncho tef and reports laboratory characterization. | One Ethiopian variety and extraction protocol; not a Canadian product, consumer specification, kitchen measure, or substitution test. |
| `WP02-B3-TEFF-STARCH-HOLD-R145-20261015-S02` | Sidhu, Riar, and Singh, [“In vitro starch digestibility and physicochemical properties of chemical and enzymatic modified Indian Teff (*Eragrostis tef*) starch for industrial applications”](https://doi.org/10.1016/j.ijbiomac.2025.141910), *International Journal of Biological Macromolecules* 307 (2025), article 141910. Primary study describes modified experimental teff-starch samples. | Laboratory chemical/enzymatic treatments and industrial research aims; not evidence of a local SKU, general commercial grade, household use, or substitution. |
| `WP02-B3-TEFF-STARCH-HOLD-R145-20261015-S03` | OQLF, [*tef* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef). Identifies `tef` as the cereal term, notes the spelling is recommended but non-current, and gives English `teff`. | Crop terminology only; no starch ingredient or product name. |
| `WP02-B3-TEFF-STARCH-HOLD-R145-20261015-S04` | OQLF, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Prefers `amidon` as the general French term for starch and reserves more specific `fécule` usage for tubers or other underground organs. | Does not attest `amidon de teff` or a teff-starch product. |
| `WP02-B3-TEFF-STARCH-HOLD-R145-20261015-S05` | Walmart Canada, [Goodeats Farine de Teff à Grains Entiers, 600 g](https://www.walmart.ca/fr/ip/Goodeats-Farine-de-Teff-Grains-Entiers-600-g/1PUVSCBZ0VLO?classType=REGULAR), current Canadian listing. | Whole-grain flour listing only; not isolated starch or evidence of teff-starch availability. |
| `WP02-B3-TEFF-STARCH-HOLD-R145-20261015-S06` | Centre Nature et Santé, [*Farine de teff*](https://www.centrenaturesante.com/doss_fiche.php?pd=FARINE&ps=TEF1), Longueuil, Québec. Defines the product as flour from ground teff grains and describes Québec availability. | Flour context and retail guidance, not a standalone starch label or specific package specification. |
| `WP02-B3-TEFF-STARCH-HOLD-R145-20261015-S07` | Celiac Canada, [Gluten-Free Product Finder](https://www.celiac.ca/gf-product-finder/), current product listing for Good Eats `TEFF BROWN FLOUR`. | Confirms a Canadian teff-flour product entry; it does not identify starch. |

## Static audit record

- Active reference, form, legacy, ledger, archive, and plan searches found no exact teff-starch owner or prior focused decision; the R145 proposal path and source-ID prefix were unused before drafting.
- Picker counts were projected from the current names/aliases using the complete-phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L9); hypothetical results are labeled above.
- Recipe scan covered every file listed by the [bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json). No tests were run or needed for this documentation-only proposal.
