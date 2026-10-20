# WP03 Section U — lemon verbena leaf identity review (R332, 2026-10-16)

- **Status:** Proposal only. This review creates this file only; it does not change shared catalog data, the research ledger, plan, checklist, roadmap, recipes, generated files, tests, or application code.
- **Plan anchor:** Section U, “Fresh herbs botanical aromatics and regional flavorings,” line 7627 of the current plan. The open herb line includes lemon verbena.
- **Candidate:** the culinary leaf of lemon verbena, *Aloysia citrodora* Paláu, a South American shrub.
- **Coordination:** R324 accepted lemon balm and cited lemon verbena only as a distinct neighboring species/name. That was not an identity review for lemon verbena. R327 and R330 integrated Chios mastic and mahlab. This proposal avoids those candidates and the previously reviewed regional items summarized below.
- **Disposition:** Advance one identity-only HERB reference for lemon-verbena leaves. Use the OQLF-supported English name “lemon verbena” and Québec French display “verveine citronnelle.” Add the OQLF contextual French term “verveine odorante” as an alias. Keep lemongrass, lemon balm, lemon myrtle, flowers, extracts, and preparations separate.

## Recommendation

Add one picker identity for culinary leaves of *Aloysia citrodora*. Kew accepts this botanical name and lists the spelling *Lippia citrodora* as a synonym; the older Québec OQLF entry uses *Lippia citriodora*. The OQLF links “verveine citronnelle” with English “lemon verbena,” while a university extension source describes the leaves as usable in cooking. [S01–S03]

| Field | Proposed value |
|---|---|
| Proposed ID | **ingredient-ref-lemon-verbena** (unreserved) |
| Category | HERB |
| English display | lemon verbena |
| Québec French display | verveine citronnelle |
| English aliases | None |
| French aliases | verveine odorante |
| Scope | Culinary leaves of *Aloysia citrodora* |
| Forms | None |
| Recipe links | None |
| Density, mappings, conversions, yields, active substitutions | None |

Do not add botanical names, “lemon beebrush,” bare “verveine,” or bare “citronnelle” as aliases. The OQLF-supported name “verveine citronnelle” itself contains “citronnelle,” so the current picker will still return this row for a one-word “citronnelle” query; that projection and its limitation are recorded below.

## Identity and product boundary

Kew accepts *Aloysia citrodora* and records *Lippia citrodora* as a synonym. The OQLF’s older entry names the shrub *Lippia citriodora* and gives “verveine citronnelle” as the preferred French term, “verveine odorante” as a term used in some contexts, and “lemon verbena” in English. The sources differ slightly in botanical spelling; use Kew’s accepted name for the evidence record, not as a picker alias. [S01–S02]

North Carolina State Extension describes lemon verbena as a South American shrub whose leaves are used in tea and cooking, and lists desserts, fruit salads, and jams among the edible uses. This supports a culinary leaf identity; it does not establish a universal preparation, dosage, or kitchen conversion. The Québec terminology record’s infusion and essence notes are botanical terminology context, not support for medicinal claims or for adding an extract. [S01, S03]

Keep this identity separate from:

| Neighbor or product | Boundary |
|---|---|
| Lemon balm, *Melissa officinalis* | Existing identity, ingredient-ref-lemon-balm. R324 correctly keeps it separate from lemon verbena. |
| Lemongrass, *Cymbopogon citratus* | Existing identity, ingredient-ref-lemongrass, displayed in French as “verveine des Indes.” “Verveine” alone is therefore not a distinct query. |
| Lemon myrtle, *Backhousia citriodora* | Existing regional-aromatic identity; the shared epithet does not make it a synonym. |
| Lemon-verbena flowers | NCSU lists flowers as edible, but this review limits the identity to the leafy culinary herb. Do not add a flower form or flower-specific alias. |
| Prepared tisanes, tea blends, liqueurs, essential oil, fragrance, extracts, or supplements | Keep as preparations or separate processed products. This review does not establish their formulas, species purity, composition, or safe dosage. |

No source reviewed here supports a substitution for lemon balm, lemongrass, lemon myrtle, lemon peel, or another herb. Do not add an active substitution or imply interchangeability from their shared lemon scent.

## Coordination and prior decisions

The open Section U list already contains several reviewed regional items. Lemon myrtle is integrated. The WP06 Oceania review left pepperberry and wattleseed unresolved over species/product-part or Québec-name limits. The WP06 Mexico/Central America sweep held achiote/annatto pending a seed-versus-powder-versus-paste boundary; WP05 separately held annatto-infused oil. Chios mastic and mahlab were integrated in R327 and R330. This proposal does not reopen those decisions.

R324’s lemon-balm review queried the OQLF lemon-verbena entry to distinguish lemon balm, lemongrass, and lemon verbena. Its recommendation concerns *Melissa officinalis*, excludes “citronnelle” and “mélisse-citronnelle” from the lemon-balm row, and does not decide a lemon-verbena identity or forms. The current Section U lemon-verbena checklist entry therefore remains open. [S01, S04]

## Ownership and demand audit

I checked live references, forms, legacy candidates, the ledger, proposal and batch archives, and all manifest-listed recipe files. Phrase comparisons used accent-, punctuation-, and case-normalized whole-word sequences; archive review also checked the source name and proposed ID.

| Surface | Current snapshot and result |
|---|---|
| Active ingredient references | 1,680. No exact owner for “lemon verbena,” “verveine citronnelle,” “verveine odorante,” the searched botanical names, or the proposed ID. Adjacent lemon balm, lemongrass, and lemon myrtle identities remain distinct. |
| Active ingredient forms | 129. No lemon-verbena form or exact form term. |
| Legacy import candidates | 58. No exact candidate or alias owner. |
| Research ledger | 2,028 records. No lemon-verbena identity or decision record. One R324 lemon-balm record cites the OQLF entry as a species boundary; it is not an identity decision for this candidate. |
| Proposal and batch archives | No focused lemon-verbena identity review or hold. R324 provides only neighboring-identity and naming-boundary evidence. R296 lists lemon verbena among Section U candidates but does not review it. |
| Bundled recipe corpus | All 114 files in the current manifest and all 1,123 ingredient rows scanned for “lemon verbena,” “verveine citronnelle,” “verveine odorante,” “Aloysia citrodora,” “Lippia citriodora,” “lemon beebrush,” and “cedrón.” Zero full-file and zero ingredient-row hits. No recipe link or recipe-line measure is warranted. |

The no-hit result describes only the bundled corpus snapshot. It does not contradict the external culinary-use evidence. Because there is no recipe demand, this proposal does not attach a recipe-specific quantity or derive a default measure, density, conversion, or substitution.

## Exact picker projection

The existing search folds accents and punctuation, prefers complete normalized word phrases within display names and aliases, then falls back to substring matching. Forms also contribute terms and can provide a hint only when a unique form phrase is explicit. There is no lemon-verbena form in this proposal.

The current catalog returns no result for the full candidate phrases. If this recommendation is accepted, the projected results are:

| Query | Projected result |
|---|---|
| “lemon verbena” | ingredient-ref-lemon-verbena only; no form hint |
| “verveine citronnelle” | ingredient-ref-lemon-verbena only; no form hint |
| “verveine odorante” | ingredient-ref-lemon-verbena only; no form hint |
| “verveine” | ingredient-ref-lemongrass and ingredient-ref-lemon-verbena, because both French displays contain that word |
| “citronnelle” | ingredient-ref-lemon-verbena, because the preferred French display contains that word; this is a known lexical/picker ambiguity even though “citronnelle” is not added as a separate alias |
| “Aloysia citrodora” or “Lippia citriodora” | No result; botanical names remain evidence, not picker aliases |

The complete bilingual names retrieve the proposed identity alone. Short-word behavior follows the current phrase matcher and should not be mistaken for a reviewed alias or evidence that “verveine” and “citronnelle” are unambiguous ingredient names.

## Measures and substitutions

The reviewed sources establish culinary uses but do not provide a recipe-line measure for the bundled corpus, a transferable mass-per-volume value, or a conversion between fresh and dried leaves. No measure, density, unit mapping, form conversion, yield, or active substitution is proposed. OQLF’s infusion note is not adopted as a dosage recommendation. [S01, S03]

## Source register

Sources were accessed 2026-10-16. Source IDs are local to this proposal and have not been added to the shared ledger.

| ID | Source | Support and limits |
|---|---|---|
| **WP03-SECTIONU-LEMON-VERBENA-R332-20261016-S01** | Office québécois de la langue française, [GDT: verveine citronnelle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8883204/verveine-citronnelle), updated 1984. | Gives preferred French “verveine citronnelle,” contextual “verveine odorante,” English “lemon verbena,” and Latin “Lippia citriodora.” Its domain is botanical; the entry is old and its note discusses leaf infusion and essence rather than establishing a contemporary retail spice label or medicinal effect. |
| **WP03-SECTIONU-LEMON-VERBENA-R332-20261016-S02** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Aloysia citrodora*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:1015994-1) and [*Lippia citrodora*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:863572-1). | Accepts *Aloysia citrodora* and identifies *Lippia citrodora* as a synonym; records a South American native range and food use. Taxonomy and broad use data do not by themselves establish a Québec culinary product name or kitchen measures. |
| **WP03-SECTIONU-LEMON-VERBENA-R332-20261016-S03** | North Carolina State Extension, [Lemon Verbena — *Aloysia citriodora*](https://plants.ces.ncsu.edu/plants/aloysia-citriodora/common-name/lemon-verbena/). | Describes the South American shrub, notes *Lippia citriodora* among previous names, and says the leaves can be used in cooking and tea; its edible-use list includes desserts, fruit salads, and jams. The page uses an alternate spelling of the accepted Kew epithet; it is extension guidance, not a food specification, and supplies no general conversion or recipe measure. |
| **WP03-SECTIONU-LEMON-VERBENA-R332-20261016-S04** | WP03 Section U, [R324 lemon-balm identity review](wp03-section-u-lemon-balm-identity-review-r324-20261016.md) and [integration record](../batches/wp03-section-u-lemon-balm-identity-integration-r324-20261016/README.md). | Records why lemon balm, lemongrass, and lemon verbena stay separate and why ambiguous French terms were omitted from the lemon-balm row. It does not decide or integrate a lemon-verbena identity. |

## Remaining limits

This proposal resolves only a source-supported identity and bilingual display for culinary lemon-verbena leaves. It does not add forms, use a Québec retailer listing as proof of species identity, adjudicate flower or prepared-tea products, assign numeric behavior, or close the broader Section U checklist. The picker’s one-word French query projection remains as shown above for the owning reviewer to consider.
