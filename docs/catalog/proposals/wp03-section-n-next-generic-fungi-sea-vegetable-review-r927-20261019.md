# WP03 Section N — Irish moss identity review (R927)

- **Reviewed:** 2026-10-19
- **Status:** proposal only. This review creates this file alone. No catalog JSON, ledger, recipe, checklist, roadmap, workflow, or batch file was changed. No software tests were run.
- **Scope:** one generic culinary seaweed identity, Irish moss / mousse d’Irlande, bounded to *Chondrus crispus*. This is not a brand, product line, flavour, SKU, or retailer variant review.
- **Recommendation:** add one identity-only reference for whole *Chondrus crispus*: English display **Irish moss**, French display **mousse d’Irlande**, with the binomial as a search alias in both languages. Keep it distinct from extracted carrageenan, sea grapes, and other seaweeds. Add no form, recipe link, measurement, density, conversion, or substitution.

## Open Section N anchor

The relevant unchecked plan item is:

> [ ] Nori, kombu, wakame, dulse, kelp, arame, sea lettuce, aonori, sea grapes, and regional sea vegetables.

The checklist records that sea lettuce and the named core sea vegetables have been integrated, while generic kelp, aonori, and sea grapes remain held. The separate seaweed-form review found no bundled recipe demand for seaweed forms. This review addresses one distinct regional sea vegetable under the open “regional sea vegetables” umbrella. It does not resolve any of those holds, add a form, or mark the parent checklist item complete.

## Recommendation and identity boundary

The Québec French name and species boundary are unusually clear. OQLF normalizes **mousse d’Irlande**, gives English **Irish moss**, and identifies the organism as *Chondrus crispus*. Its note calls it a fishery species with commercial potential in Québec. It also says a single term corresponding to a particular species is standardized for Québec consumer labeling; it does not retain **carragheen** or **mousse perlée d’Irlande** for that purpose. [S01]

Québec culinary guidance from Exploramer’s *De l’eau à la bouche* independently pairs **mousse d’Irlande** with *Chondrus crispus*. It describes the alga as a thickener for soups, jams, and stews, and gives a milk dessert preparation in which the alga is boiled and strained out. This supports an ingredient identity even though a common preparation extracts its gelling effect into the dish. [S02]

Scope the identity to the whole food alga *Chondrus crispus*, including material used to thicken a preparation. Do not use this row for carrageenan powder or other extracted hydrocolloid. The active catalog already has generic carrageenan and separate iota, kappa, and lambda carrageenan references. The seed classifies those additives as pantry ingredients; the proposed whole alga belongs with the existing sea vegetables in **VEGETABLE_AND_AROMATIC**. Preserve every current carrageenan row and its evidence.

Do not make the wider phrase **sea moss** an alias. FAO uses that name for *Gracilaria* species in a separate food section, while it treats Irish moss as *Chondrus crispus*. Nor should this reference absorb **carrageen**, **carrageen moss**, or **carrageenan moss** as global aliases: those terms sit close to the extracted carrageenan identity and do not improve Québec consumer-facing precision. OQLF explicitly declines to standardize **carragheen** and **mousse perlée d’Irlande** in the Québec fish-product context. Names such as **persil de mer**, **goémon frisé**, **pioca**, and **mousse perle** appear in local material but are not needed to identify this reference and could carry regional or cross-species ambiguity. Keep all of them out of the proposed aliases. [S01, S02, S03]

## Current catalog and exact-key audit

I inspected the active references and forms, legacy candidates, research ledger, prior Section N proposals, and all manifest-listed recipe files. The current package has 1,945 references, 204 forms, 55 legacy candidates, 2,349 ledger records, and 114 recipe files.

| Area | Current finding | Proposal effect |
|---|---|---|
| Active references | No *Chondrus crispus*, Irish moss, mousse d’Irlande, sea moss, or proposed reference ID is active. The neighboring seaweed identities remain separate. The active carrageenan references describe the extracted substance and its named subtypes. | Propose a new whole-alga identity; preserve carrageenan and all seaweed identities. |
| Active forms | No target term, target reference, or form attached to an active seaweed identity was found in the 204 forms. | Add no form. |
| Legacy candidates | None of the 55 candidates contains the target names, taxon, or proposed ID. | Do not revive or merge another candidate. |
| Research ledger | None of the 2,349 record IDs or records contains the target names, taxon, or proposed ID. Carrageenan records exist and remain separate. | If integrated, create a new identity record; do not rewrite carrageenan evidence. |
| Prior proposals | The sea-vegetable boundary review covers nori, kombu, arame, sea lettuce, dulse, Japanese wakame, and *Alaria esculenta*, with separate holds for kelp, aonori, and sea grapes. The sea-grape review is a different unresolved *Caulerpa* boundary. No prior proposal identifies *Chondrus crispus* as a catalog candidate. | This is a separate generic species identity, not a repeat of the sea-grapes review. |
| Recipe corpus | The current manifest lists 114 files and 1,123 ingredient lines. No ingredient line or other recipe text matched Irish moss, mousse d’Irlande, *Chondrus crispus*, or the scoped related names. | No recipe link, relink, quantity, or recipe-based form is supported. |

The picker currently returns no reference for the exact queries **Irish moss**, **mousse d’Irlande**, or **Chondrus crispus**. A full English **carrageenan** query currently returns the generic additive and its three subtype references; **carraghénine** returns the generic additive. Keep those results independent from the proposed exact Irish moss terms.

The French display has one short-query consequence: under the current exact-phrase-first search, querying just **mousse** would match the proposed name as a complete word and would stop the substring fallback that currently returns the three pamplemousse references. A full **pamplemousse** query remains unaffected. Record this short-query overlap for coordinator review; do not alter the required OQLF display or add an alias for the fruit to work around it.

If integrated, use:

| Field | Proposed value |
|---|---|
| id | **ingredient-ref-irish-moss** |
| nameEn | **Irish moss** |
| nameFr | **mousse d’Irlande** |
| aliasesEn | **Chondrus crispus** |
| aliasesFr | **Chondrus crispus** |
| defaultDensity | **null** |
| unitMappings | **empty** |
| category | **VEGETABLE_AND_AROMATIC** |

The Latin binomial alias is an exact species lookup, not a broader common-name alias. No other alias is proposed.

## Recipe demand

The bundled corpus contains no line for Irish moss, *Chondrus crispus*, or mousse d’Irlande. External Québec and FAO sources establish culinary use, but that evidence does not justify relinking a generic mushroom, carrageenan, or seaweed recipe line. Keep this as a catalog identity only, with no recipe edit.

## Forms, measurements, and density

Québec culinary guidance says the resource is generally consumed after processing and usually dried; it also describes boiling and straining the alga for a milk dessert. FAO likewise describes dried Irish moss boiled for its thickening effect. These sources show a culinary preparation, but the bundle has no matching line that needs a dried, soaked, reconstituted, powdered, or strained form. Leave forms absent until a recipe or another specific catalog need justifies one. [S02, S03]

One old blancmange recipe reproduced by FAO uses **1/2 cup dried moss with 1 quart milk**, soaks the moss for five minutes, cooks it with the milk for thirty minutes, then strains it. FAO identifies “moss” in that recipe as Irish moss, a common name for *Chondrus crispus*. These are values and steps from that cited historical recipe only; they are not a generic serving, a mass/volume conversion, or a density measurement. Do not generalize them to all Irish moss preparations or store them as active mappings. [S04]

No transferable mass-per-volume value, bulk density, measured cup weight, unit mapping, or preparation yield was found. If a ledger record is later added, set **measurementState** to **researched_no_supported_value**. Keep any source-specific historical recipe observation separate and scoped to its cited preparation.

## Substitution evidence

The sources explain that *Chondrus crispus* contains carrageenan and can thicken or gel a food. That shared function does not establish that whole Irish moss is interchangeable with extracted carrageenan, agar, gelatin, or another seaweed. The ingredient and extraction states differ, and none of the sources provides a recipe-tested replacement ratio. Do not add a global or contextual substitution rule. If a ledger record is later added, set **substitutionResearchState** to **researched_no_supported_substitute** for the evidence reviewed here.

## Sources

| Source | Evidence and limit |
|---|---|
| **S01 — OQLF, [mousse d’Irlande (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198903/mousse-dirlande)** | Québec standardized term **mousse d’Irlande**, English **Irish moss**, and Latin *Chondrus crispus*. The note identifies a fishery species with Québec commercial potential and explains why some alternative names were not retained for Québec consumer labeling. It establishes terminology and identity, not culinary quantities. |
| **S02 — Exploramer / *De l’eau à la bouche*, [Mousse d’Irlande](https://deleaualabouche.ca/especes/mousse-dirlande/)** | Pairs the Québec name with *Chondrus crispus*, names cooking uses as a soup, jam, and stew thickener, and describes boiling it in milk then filtering for dessert. The page also reports dried availability; it does not give a general ingredient measure or density. |
| **S03 — FAO, [A guide to the seaweed industry, “Seaweeds used as human food,” §§8.10 and 8.12](https://www.fao.org/4/y4765e/y4765e0b.htm)** | Identifies Irish moss as *Chondrus crispus* and describes its food use as a thickener. In §8.12 it applies **sea moss** to *Gracilaria* species, showing why that broad name should not be an alias here. Its historical market descriptions are not current measures. |
| **S04 — FAO, [“Production, properties and uses of carrageenan,” chapter 3](https://www.fao.org/4/x5822e/x5822e05.htm)** | Describes whole *Chondrus crispus* and *Gigartina stellata* in historical jellies and milk puddings, quotes the old 1/2 cup-to-1 quart blancmange recipe, and distinguishes carrageenan as material extracted from *Chondrus crispus*. The recipe amounts remain source-specific. |

## Disposition summary

Recommend a new identity-only reference for **Irish moss / mousse d’Irlande**, scoped to whole *Chondrus crispus*. Preserve the active carrageenan additive references and all existing seaweed rows. Do not alias **sea moss**, **carrageen**, **carrageen moss**, **carrageenan moss**, or the regional names listed above. The bundled recipes supply no demand, and the reviewed sources support no transferable measurement, density, form conversion, or substitution.
