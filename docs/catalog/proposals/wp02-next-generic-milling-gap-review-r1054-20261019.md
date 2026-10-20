# WP02 Section A7 R1054: foxtail millet bran powder identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, recipe, or generated file was changed.
- **Open-plan anchor:** WP02 Section A7 remains open for reviews of other grain meals and milling products, including the unresolved generic wheat-meal candidate ([active plan, A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2290)).
- **Selected gap:** Generic culinary **foxtail millet bran powder**, a finely ground form of the bran fraction from *Setaria italica*.
- **Recommendation:** Add one identity-only `FLOUR_AND_STARCH` reference, `foxtail millet bran powder / poudre de son de millet d'Italie`. Keep the French display descriptive and provisional for Québec. Add no aliases, forms, reusable measurements, recipe links, conversions, yields, or active substitutions.
- **Scope:** Generic culinary ingredient diversity only. No brands, product lines, flavours, SKUs, retailer variants, or commercial rosters were researched. Commercial-product counts do not add ingredient diversity.

## Identity boundary and bilingual naming

Two primary food studies support a distinct finely ground foxtail-millet-bran ingredient: one identifies and tests bran powder made by mechanical grinding, while another separates bran from *Setaria italica* grain, grinds it to finer particles, and uses it in muffins [S01–S02]. The studies support the generic crop fraction and a study-specific culinary use; they do not establish a universal particle-size threshold or a Québec food label.

If accepted, limit this row to **powdered bran from foxtail millet (*Setaria italica*)**. Keep it separate from:

- **`ingredient-ref-foxtail-millet-bran` — foxtail millet bran / son de millet d'Italie.** The active row identifies the separated bran fraction. Its source `R890-S02` describes a study-specific bran-rich fraction that also contains broken grain and husk; it does not define the proposed pure bran powder. Preserve that source and its limits.
- **`ingredient-ref-foxtail-millet-flour` — foxtail millet flour / farine de millet d'Italie.** This is flour from the grain, not flour or powder made from its bran.
- **`ingredient-ref-foxtail-millet` — foxtail millet / millet d'Italie.** This is the grain identity, not a milled fraction.
- Hull, husk, dehulled or whole-kernel grain, mixed bran-rich fractions, defatted or extracted bran ingredients, feed-grade materials, and compound foods containing foxtail millet.

The proposed English name follows the primary study's term **foxtail millet bran powder**. The French display **poudre de son de millet d'Italie** is a descriptive compound: the existing Québec OQLF entry identifies *Setaria italica* and lists `millet d'Italie`, and the live bran row already uses `son de millet d'Italie` [reused S03]. OQLF's entry is botanical and notes bird-feeding use; it does not attest a Québec culinary name for bran powder. Keep both alias arrays empty and the French display provisional. Do not add `millet des oiseaux` as a food alias, and do not borrow French names from brown-top or other millet candidates.

## Ownership and recipe-demand audit

Read-only audit of the live split seed package and ledger on 2026-10-19:

| Surface | Current state | Proposal consequence |
|---|---|---|
| Ingredient references | **2,060** active rows. No exact owner was found for `foxtail millet bran powder`, `foxtail millet bran flour`, `foxtail bran powder`, `poudre de son de millet d'Italie`, or ID `ingredient-ref-foxtail-millet-bran-powder`. The nearest owners are the separate foxtail-millet grain, bran, and whole-grain flour rows. | One separate milling identity is unowned. Preserve all three adjacent rows and their source evidence; do not add aliases to them. |
| Ingredient forms | **205** forms. No form is attached to the live foxtail bran, grain, or flour rows, and no form owns the candidate ID or powder wording. | Add no form; the proposal treats the generic finely ground bran ingredient as a distinct milling identity, not a grain cooking state. |
| Research ledger | **2,465** records, with **11,504** source entries and **9,664** distinct source IDs. No candidate or identity record owns the proposed powder ID, exact display, or the 2020 muffin-study DOI. `ingredient-ref-foxtail-millet-bran` is `verified`, with measurement and substitution states still `not_yet_researched`; its existing sources include R890-S03, the 2022 bran-powder grinding paper, and WP03-S175, the OQLF crop-name entry. The existing R890 sources remain owned by the bran row. | If accepted, give the proposed row its own identity record and R1054 source IDs for its distinct powder and food-use claims. Do not move, rewrite, or generalize R890-S01–S03 or WP03-S175. |
| Legacy import identities | **55** candidates. No exact or near-exact owner for the proposed English/French names or ID was found. | No legacy promotion, merge, or alias transfer is proposed. |
| Bundled recipes | All **114** manifest-listed recipes and **1,123** ingredient rows were scanned for the proposed names, nearby bran-powder/flour wording, and the proposed ID. There were **0** matching files and **0** matching rows. | No bundled recipe demand, portion, or link supports a recipe-specific field. |
| Forms, substitutions, and yields | The package has **0** global substitution rules, **0** contextual substitution rules, and **1** package-yield entry unrelated to this candidate. The candidate has no attached form or yield. | Add no conversion, yield, form-to-form or ingredient substitution, or recipe-line link. |
| Recent WP02/A7 proposals and source ownership | R1051 held common-buckwheat bran flour; R1054 concerns *Setaria italica* bran powder, a separate crop and milling fraction. The existing `foxtail millet bran` record owns a 2022 study of bran powder, but not a separate picker identity. | The proposed identity does not reopen R1051 and does not transfer its evidence. Preserve the existing foxtail-bran source record; any R1054 entry must make its separate claim explicit. |

The new source IDs below were checked for collisions. The 2020 DOI and the official journal PDF URL are not currently owned in the ledger. The proposed R1054-S02 is a separate source entry for a distinct powder-identity claim from the same URL as existing R890-S03; keep R890-S03 on the original bran row unchanged.

## Numeric and substitution limits

- **Identity-specific evidence:** The 2022 study evaluates one commercial raw-bran sample after laboratory grinding and sieving into several particle-size groups. Its particle sizes, densities, compositions, and functional-property results depend on that sample and those study methods [S02]. The paper reports different bulk and tap densities across its particle groups; none is a household cup measure or a transferable default. Preserve the existing R890-S03 observations and claims unchanged and add no density, unit mapping, or mass-volume conversion to the proposed row.
- **Recipe amounts:** The 2020 muffin paper tests study-specific bran addition at 0%, 10%, 15%, 20%, 25%, and 30% within its refined-wheat-flour muffin formulation [S01]. Its grinding, microwave stabilization, formulation, panel, and sensory/physical outcomes belong to those muffins. The tested percentages do not establish a general replacement ratio for bread, cookies, porridge, thickening, or other recipes. Add no reusable amount or recipe link.
- **Research states if accepted:** `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence`. The evidence supports identity and food use, but not a household measure or a recipe-independent/contextual substitution rule. Add no global or contextual substitution, form conversion, or cooking yield.

## Source register

These sources are proposal-local. No shared ledger source or observation was added.

| Source ID | Source and locator | Supports / does not support |
|---|---|---|
| **S01 / `WP02-A7-FOXTAIL-MILLET-BRAN-POWDER-R1054-20261019-S01`** | Barbhai, M. D., and T. V. Hymavathi, [“Physico-Sensory Quality of Foxtail Millet (*Setaria italica*) Bran Enriched Muffins”](https://doi.org/10.18782/2582-2845.8438), *Indian Journal of Pure & Applied Biosciences* 8(6) (2020), 28–33; [publisher issue archive](https://www.ijpab.com/Articles.php?issue=6&vol=8), article entry 4, DOI and pp. 28–33. Methods: “Raw material and bran collection” and “Muffin preparation”; abstract and results. | Primary food study. It reports foxtail millet bran from grain dehulling, separated by winnowing, ground to finer particles, stabilized, and used in muffins. Supports a generic food-use powder boundary. It does not establish a standard grind, consumer grade, transferable composition, household measure, or general substitution ratio. The protocol and tested percentages remain source-specific. |
| **S02 / `WP02-A7-FOXTAIL-MILLET-BRAN-POWDER-R1054-20261019-S02`** | Kehong Liang, Hong Zhu, and Yue Zhang, [“Effect of Mechanical Grinding on the Physicochemical, Structural, and Functional Properties of Foxtail Millet (*Setaria italica*) Bran Powder”](https://pmc.ncbi.nlm.nih.gov/articles/PMC9455772/), *Foods* 11(17) (2022), 2688, DOI [10.3390/foods11172688](https://doi.org/10.3390/foods11172688), abstract, §§2.1–2.2, and results. | Primary milling study explicitly names foxtail millet bran powder and evaluates grinding. Supports the generic powder identity. Its supplier, one raw sample, particle-size classes, sieving, laboratory density and composition results, and functional findings are study-specific; the article does not supply a household measure or a recipe substitution. The same URL remains on the existing bran record as R890-S03; this proposed source entry is for the new powder claim only. |
| **Reused S03 / `WP03-S175`** | Office québécois de la langue française, [“millet des oiseaux” (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506452/millet-des-oiseaux), updated 2010; botanical definition, preferred terms, and English/Latin translations. | Identifies *Setaria italica*, maps it to English `foxtail millet`, and lists French `millet d'Italie`. Supports only the source-crop wording used in the provisional descriptive compound. The entry does not define bran or attest `poudre de son de millet d'Italie` as a Québec culinary term. Reuse the existing source; do not add a duplicate OQLF record. |

## Cross-category queue scope

The open A7 plan still mentions the named Anson Mills Colonial-Style Toasted Stone Cut Wheat Meal lead. Mark that product-only line **out of scope** because commercial-product counts do not add ingredient diversity, and stop pursuing it. Preserve the historical R605 review, all existing product-scoped evidence, and the unresolved generic wheat-meal decision; this packet adds no claim about that product. No commercial product or retailer roster was researched for the foxtail-millet candidate.

## Proposed minimal state and decision

If accepted, add only this reference:

```json
{
  "id": "ingredient-ref-foxtail-millet-bran-powder",
  "nameEn": "foxtail millet bran powder",
  "nameFr": "poudre de son de millet d'Italie",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Proposed ledger state: a separate verified ingredient-reference record with S01–S02; `measurementState: researched_no_supported_value`; `substitutionResearchState: blocked_pending_evidence`. Keep `forms` absent, add no aliases or reusable measurements, and add no recipe links, conversions, yields, or active substitutions.

This is a generic, species-qualified milling identity supported by a study naming bran powder and a separate human-food study using ground bran. Keep the English name source-grounded and the French compound provisional. Preserve the live foxtail millet, bran, and flour rows and all of their evidence. This file is proposal-only; no tests or builds were run.
