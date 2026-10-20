# WP03 Section J R1058 — *Apios americana* tuber identity review

- **Review date:** 2026-10-19
- **Status:** proposal only; no shared catalog, forms, ledger, recipes, plan, roadmap, or generated files changed
- **Recommendation:** accept one generic, identity-only edible tuberous-rhizome ingredient for *Apios americana* Medik.
- **Open-plan anchor:** the broader Section J regional root/tuber discovery and independent Québec terminology review remain open at plan line 6557. This review covers one distinct plant part only.
- **Scope:** the underground tuberous swellings borne on *A. americana* rhizomes. No brands, product lines, flavours, SKUs, retailer variants, or commercial rosters were researched.

## Candidate and identity boundary

| Field | Recommendation |
| --- | --- |
| Suggested ID | `ingredient-ref-apios-americana-tubers` |
| English display | American groundnut tubers (*Apios americana*) |
| fr-CA display | tubercules d’apios d’Amérique (*Apios americana*) |
| Category | `VEGETABLE_AND_AROMATIC` |
| Aliases | none |
| Forms, measures, conversions, yields, substitutions | none proposed |

OQLF’s Grand dictionnaire terminologique identifies *Apios americana*, describes its rhizomes as bearing tuberous swellings in a chain, and says those rhizomes are eaten. It gives the Québec French plant name *apios d’Amérique* and the Canadian terms *pénacs* and *patates en chapelet*. The proposed French ingredient display adds a part qualifier to that attested plant name; it is a descriptive food-part label, not a claim that OQLF lists that exact compound as an ingredient name. [S01]

The USDA NRCS plant guide pairs “groundnut” with *A. americana*, describes the tuberous thickenings on its rhizomes, and summarizes historical food use of the tubers. TERMIUM pairs *A. americana* with “American groundnut” and the OQLF-supported French terms. Together these support a species-qualified edible-tuber identity; they do not establish current Canadian retail prevalence or a standard commercial product. [S02, S03]

Keep the identity restricted to the tuberous swellings of *A. americana* rhizomes. Do not include its leaves, flowers, pods, seeds, other *Apios* species, or processed flour. Do not equate the item with potato, true yam, arrowroot, arrowhead tubers, peanuts, Bambara beans, or Kersting’s groundnut. OQLF/TERMIUM caution that English “groundnut” can also denote peanut (*Arachis hypogaea*); the active catalog also uses “groundnut” in Bambara-groundnut, Kersting’s-groundnut, and peanut-oil names. The fully qualified display names and empty alias arrays avoid claiming bare `groundnut`, `potato bean`, `Indian potato`, or `wild potato` as unique search terms. [S01, S03]

## Live ownership and recipe-demand audit

Live files checked on 2026-10-19: 2,060 ingredient references, 205 ingredient forms, 2,465 research-ledger records with 11,504 source entries, 55 legacy-import candidates, and 114 recipes with 1,123 ingredient rows.

Exact normalized searches across active reference names/aliases, forms, ledger records, and legacy candidates found no owner for *Apios americana*, *American groundnut tubers*, *apios d’Amérique*, *patates en chapelet*, or *pénacs*. No dedicated *Apios* record exists in the live research ledger or legacy candidates. Existing nearby owners remain separate: `ingredient-ref-peanuts` (peanuts / arachides), `ingredient-ref-peanut-oil` (which owns `groundnut oil`), `ingredient-ref-bambara-beans` (which owns `Bambara groundnut`), `ingredient-ref-kerstings-groundnut`, and `ingredient-ref-potato`. No form belongs to the proposed identity.

The Section J checklist remains open for broader root/tuber discovery. A scan of all manifest-listed recipe files found no match for the species, proposed displays, or source-attested French names, so there is no bundled recipe demand or recipe link to add. Existing potato- or peanut-related recipe rows do not imply an *Apios* use. No commercial-only queued item was encountered or pursued; any brand-, product-line-, flavour-, SKU-, or retailer-variant-only task remains out of scope because commercial-product counts do not add ingredient diversity.

## Numeric, form, and substitution limits

The reviewed identity sources do not establish a household portion, tuber count weight, reusable volume measure, density, unit mapping, cooking yield, or recipe quantity. USDA’s guide reports rhizome-tuber dimensions, crop observations, and a dry-weight protein range; these describe plant morphology, cultivation, or composition and must not become kitchen measures, density, conversion, or yield data. OQLF’s quoted historical preparation examples are not standardized instructions. Keep `measurementState` as `not_yet_researched` for reusable culinary measures; no numeric observation is proposed.

No tested substitution is established between *A. americana* tubers and potato, yam, peanut, another pulse, or another root. Keep `substitutionResearchState` as `not_yet_researched`; add no global or contextual substitution. The USDA guide also discusses edible seeds, but that is a separate plant part and does not support a seed form or an ingredient-to-tuber substitution.

## Minimal proposed data

If accepted, add one reference row only:

- ID: `ingredient-ref-apios-americana-tubers`
- English name: `American groundnut tubers (Apios americana)`
- French name: `tubercules d’apios d’Amérique (Apios americana)`
- English aliases: `[]`
- French aliases: `[]`
- Default density: `null`
- Unit mappings: `[]`
- Category: `VEGETABLE_AND_AROMATIC`

Suggested identity ledger record: `recordId: ingredient-ref-apios-americana-tubers`, `recordType: ingredient_reference`, `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, with the identity evidence below. Add no form, recipe link, conversion, yield, measurement, or substitution. Preserve all current rows and source allocations, especially the peanut-oil, Bambara-bean, Kersting’s-groundnut, and potato owners.

## Evidence register

- **[S01]** Office québécois de la langue française, Grand dictionnaire terminologique, [*apios d’Amérique*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17033710/apios-damerique), accessed 2026-10-19. Identifies *Apios americana*, describes the chain of tuberous swellings on its rhizomes, and notes that the rhizomes are eaten. Attests *apios d’Amérique*, *pénacs*, and *patates en chapelet*; it does not establish the exact proposed part-qualified compound as a conventional food label. Its cited English material includes historical preparation examples, not standardized current guidance.
- **[S02]** USDA Natural Resources Conservation Service, [Plant Guide: Groundnut (*Apios americana* Medik.)](https://plants.usda.gov/DocumentLibrary/plantguide/pdf/cs_apam.pdf), edited 2006, accessed 2026-10-19. Identifies the species and rhizome tuberous thickenings and summarizes historical tuber food use. Its dimensions, crop observations, dry-weight composition, and historical preparations remain source-scoped; this is not evidence of current Canadian retail availability or a reusable recipe measure.
- **[S03]** Government of Canada, Translation Bureau, TERMIUM Plus, [entry returned for “patates en chapelet”](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?fchrcrdnm=1&i=&index=frr&lang=eng&sg_kp_wet=1081471&srchtxt=PATATES+CHAPELET), accessed 2026-10-19. Pairs *A. americana* with “American groundnut” and the French terms *apios d’Amérique*, *pénacs*, and *patates en chapelet*; explicitly warns that “groundnut” is also used for peanut. Terminology evidence only, not a food-product or measure source.

The evidence supports a narrowly species- and part-qualified generic ingredient with Québec-attested French terminology. No commercial-only work was pursued, no claims were transferred from a branded product, and the Section J parent checklist remains open.
