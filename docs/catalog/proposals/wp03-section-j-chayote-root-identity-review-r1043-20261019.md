# WP03 Section J R1043 — chayote root identity review

- **Review date:** 2026-10-19
- **Status:** proposal only; no shared catalog JSON, ledger, recipe, plan, roadmap, or generated files changed
- **Recommendation:** accept one generic, identity-only reference for the edible tuberous storage root of chayote.
- **Open-plan anchor:** Section J’s broader regional root/tuber discovery remains open at [plan line 6557](../../RecipeBook-global-ingredient-catalog-plan.txt#L6557). The completed R882 chayote-shoot boundary explicitly keeps the tuberous root separate from fruit and shoots at [plan lines 6722–6727](../../RecipeBook-global-ingredient-catalog-plan.txt#L6722).
- **Scope:** tuberous portions of the adventitious roots of *Sechium edule* (accepted by Kew as *Sicyos edulis* Jacq.). Do not extend root-use evidence to other species or parts.

## Candidate and identity boundary

| Field | Recommendation |
| --- | --- |
| Suggested ID | ingredient-ref-chayote-root |
| English display | chayote root |
| fr-CA display | racine de chayotte — descriptive, provisional compound |
| Source-defined species | *Sechium edule* (Jacq.) Sw.; accepted name *Sicyos edulis* Jacq. in Kew POWO |
| Plant part | Edible tuberous storage portions of adventitious roots only |
| Category | VEGETABLE_AND_AROMATIC |
| Aliases | none |
| Forms, measures, conversions, yields, substitutions | none proposed |

OQLF defines chayotte as the whole climbing plant, gives `chayote` as its English equivalent and *Sechium edule* as its Latin equivalent, and states that its tuberized roots are used in food. The same OQLF entry separately identifies the plant’s edible fruit and young edible shoots. Québec’s field-crop regulation further lists “Chayotte (fruit, racines)” under *Sechium edule*. These sources support a root-qualified identity and the descriptive fr-CA compound `racine de chayotte`; the compound itself is not an OQLF preferred term. [S01–S02]

The National Parks Board of Singapore describes an edible tuberous root that is less commonly eaten and notes that the starchy tubers are eaten like potatoes. Rafael Lira Saade’s IPGRI crop monograph identifies the eaten part anatomically as the tuberous portions of the adventitious roots and reports boiled, stew, and dessert uses in regional contexts. This supports culinary identity without establishing broad Québec market availability or an exact preparation rule. [S03–S04]

Keep the new row separate from the active chayote fruit owner and the identity-only chayote-shoots row. Do not merge these parts or transfer a fruit or shoot alias, measure, or use claim to the root. Do not add `chinchayote`, `chayotextle`, `cueza`, `ichintal`, or other regional terms as unqualified aliases; the IPGRI monograph scopes these names geographically. Keep leaves, stems, fruit, shoots, extracted starch, and other products separate. Kew currently accepts *Sicyos edulis* and treats the widely used crop name *Sechium edule* as a synonym; retain both names in the evidence boundary, but add neither as a catalog alias. [S01, S04–S05]

## Live ownership and recipe-demand audit

Current live files checked on 2026-10-19: **2,051 ingredient references, 205 ingredient forms, 55 legacy-import candidates, and 2,456 research-ledger records containing 11,476 source entries**. Exact candidate-name searches found no root-specific reference, alias, form, legacy candidate, or ledger identity allocation for `chayote root`, `chayote roots`, `racine de chayotte`, `Sicyos edulis`, or the regional names listed above. The only ledger match for `chinta` is a historical court-case title in the unrelated `ingredient-ref-flattened-rice-poha` record; it is not a root owner or alias. The existing *Sechium edule* source mention under the chayote-shoots record is described below and does not allocate a root identity.

The active `ingredient-ref-chayote` row is `chayote / chayotte`; its only French alias is `chaïote`. Its current OQLF ledger evidence scopes the catalog decision to the immature fruit. The separate `ingredient-ref-chayote-shoots` row is `chayote shoots / pousses de chayotte`, with no aliases or forms. Its existing R882 ledger decision explicitly keeps fruit, mature leaves, the tuberous root, and the whole vine separate. Neither active row has an ingredient form. Preserve both references and their source records unchanged.

The R882 ledger record for shoots already cites the OQLF whole-plant entry, whose note mentions edible roots as well as young shoots. That existing source allocation supports the distinction but does not constitute a root identity decision. The current root candidate has no separate ledger identity record; this proposal does not reassign or alter the OQLF source record.

The current recipe package has 114 files and 1,123 ingredient rows. A scan found no root-specific names, species names, regional root names, or `ingredient-ref-chayote-root` use in recipe ingredients; no recipe link is proposed.

The Section J work is generic root diversity, not commercial roster coverage. No root-specific queue item was found whose only deliverable was a brand, product-line, flavour, SKU, or retailer-variant list. The existing Section F commercial cereal roster and named Anson Mills product-only work are already out of scope because commercial-product counts do not add ingredient diversity; neither was pursued. Preserve existing branded entries and product-scoped evidence. [S06]

## Numeric and substitution limits

The reviewed root sources provide no household portion, count-to-mass conversion, root mass, volume measure, density, unit mapping, kitchen yield, or recipe-specific amount. The IPGRI composition table reports source-specific food-composition values; do not use those as measures, conversion factors, or defaults. NParks’ numerical fruit description applies to the fruit, not the roots. Keep measurement research `not_yet_researched` and add no numeric data.

“Eaten like potatoes” describes a regional culinary comparison, not a tested replacement rule. No reviewed source establishes a dish-specific or general replacement amount for potato, cassava, sweet potato, or another root. Keep substitution research `not_yet_researched`; add no active substitution.

## Minimal proposed data

If accepted, add one reference row only:

- ID: `ingredient-ref-chayote-root`
- English name: `chayote root`
- French name: `racine de chayotte`
- English aliases: `[]`
- French aliases: `[]`
- Default density: `null`
- Unit mappings: `[]`
- Category: `VEGETABLE_AND_AROMATIC`

Keep the French compound marked descriptive pending independent Québec terminology review. Add no form, measurement, conversion, yield, recipe link, or substitution. Preserve the active chayote-fruit and chayote-shoots references, aliases, evidence, and all existing branded entries.

## Evidence register

- **[S01]** Office québécois de la langue française, Grand dictionnaire terminologique, [*chayotte*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26558714/chayotte), updated 2021; accessed 2026-10-19. Preferred French terms include `chayotte`, `chayote`, and rare `chaïote`; gives English `chayote` and Latin *Sechium edule*. Defines the plant as having a tuberized root and states that leaves, roots, or young shoots are used in food. Supports plant, species, terminology, edible-part distinction; it does not standardize `racine de chayotte` as a compound ingredient name. This URL is already cited by the current chayote-shoots ledger record; preserve that record. Proposed sourceKind: `regional_authority`.
- **[S02]** Éditeur officiel du Québec, Légis Québec, [*Règlement sur la contribution au Syndicat des producteurs maraîchers du Québec*, chapter M-35.1, r. 215.1](https://www.legisquebec.gouv.qc.ca/fr/document/rc/M-35.1%2C%20r.%20215.1), Annex I; accessed 2026-10-19. Lists “Chayotte (fruit, racines)” with *Sechium edule*. Supports a Québec French crop/part wording and species pairing; it is not an OQLF terminology ruling, recipe, or claim about retail availability. Proposed sourceKind: `regional_authority`.
- **[S03]** National Parks Board, Singapore, Flora & Fauna Web, [*Sechium edule*](https://www.nparks.gov.sg/florafaunaweb/flora/5/9/5957), accessed 2026-10-19. Says the plant forms an edible, less commonly eaten tuberous root and describes starchy tubers eaten like potatoes. Regional use context only; the analogy does not establish a substitution. Proposed sourceKind: `other`.
- **[S04]** Rafael Lira Saade, International Plant Genetic Resources Institute, [*Chayote: Sechium edule (Jacq.) Sw.*](https://cgspace.cgiar.org/server/api/core/bitstreams/e99e0dd4-d799-489d-8ef3-39ca37b70864/content), *Promoting the Conservation and Use of Underutilized and Neglected Crops*, no. 8 (1996), especially pp. 7 and 28–29; accessed 2026-10-19. Describes edible tuberous parts of adventitious roots and regional boiled, stew, and dessert uses. Its Spanish-language regional names and food-composition table stay scoped; no alias, Québec name, or kitchen measure is inferred. Proposed sourceKind: `other`.
- **[S05]** Royal Botanic Gardens, Kew, Plants of the World Online, [*Sicyos edulis* Jacq.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:293946-1/general-information) and [*Sechium edule* (Jacq.) Sw.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:293884-1); accessed 2026-10-19. Kew accepts *Sicyos edulis* and lists *Sechium edule* as a synonym. Taxonomy only; the food-source common name remains `chayote`. Proposed sourceKind: `other`.
- **[S06]** Existing open-checklist dispositions at [plan lines 5107–5110](../../RecipeBook-global-ingredient-catalog-plan.txt#L5107). They mark commercial product-family and retailer-variant rosters out of scope because commercial-product counts do not add ingredient diversity, and direct catalog work toward generic ingredient diversity. Queue-scope evidence only; no ingredient claim is drawn from it.

The evidence supports a distinct generic identity for chayote’s edible tuberous storage roots, separate from its fruit and young shoots. The French part-qualified display is descriptive, numerical behavior and substitutions remain unresearched, and Section J remains open.
