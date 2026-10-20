# WP03 Section F Sikiya / Crab Finger Grain Review

## Packet record

- **Proposal cycle:** 2026-10-12.
- **Research pages accessed:** 2026-10-11.
- **Status:** proposal only; no catalog, ledger, recipe, plan, checklist, roadmap, package, or test change is proposed.
- **Scope:** one uncovered millet/cereal candidate, Sikiya / crab finger (*Digitaria sanguinalis*), with a focused food-identity and Québec French naming review.
- **Disposition:** hold without allocating a reference. Indian food-standard and agricultural sources support a narrow human-food grain identity, but the English wording is source-specific and the Québec French evidence names the plant as a weed, not a food product.
- **Package snapshot audited:** 888 active references, 48 forms, 114 manifest-listed recipes with 1,123 ingredient rows, 1,138 research-ledger records, and 77 legacy candidates.

## Why this is a distinct candidate

The Section F plan leaves species-level millet, sorghum, fonio, quinoa, and amaranth review open. The existing grain work already covers the broad millet row, common, finger, foxtail, kodo, pearl, puffed, and little millets; brown-top and barnyard millet have separate held proposals. White and black fonio, Job's tears, sorghum, quinoa, and amaranth are already represented or reviewed. This proposal does not reopen those candidates, or the separate reviews for sushi rice, farro, barley, hominy/pozole corn, grits, dried sweet corn, flakes, puffed grains, cereal mixes, or other Section F products.

I searched all existing proposal files, the plan/checklist, active reference and form names, the research ledger, legacy candidates, and manifest recipes for `Sikiya`, `crab finger`, *Digitaria sanguinalis*, `Polish millet`, and the Québec terms below. No prior Sikiya/crab-finger identity decision, reference, form, legacy candidate, ledger identity, or recipe mention was found. The recent barnyard-millet hold is a different candidate and is excluded.

FSSAI's millet standard applies to whole or dehulled grain and lists `Crab finger (Sikiya) — Digitaria sanguinalis` as a distinct item. ICAR–Indian Institute of Millets Research describes Sikiya as a local Baiga food grain in Madhya Pradesh. These sources make the candidate relevant to the open species-level Section F review, but do not establish a current Canadian product label or a Québec French food name.

## Identity and naming decisions

| Candidate field | Proposal decision | Evidence boundary |
| --- | --- | --- |
| Research identity | Retain *Digitaria sanguinalis* as an unallocated candidate only. | FSSAI names the species within its whole/dehulled millet standard. ICAR–IIMR documents Sikiya grain in a specific Baiga food/agriculture context. Neither source establishes a Québec-market product class. |
| English wording | Keep `Crab finger (Sikiya)` as source wording, not a finalized picker display. | `Crab finger (Sikiya)` is FSSAI's standard entry. ICAR uses Sikiya for a localized food grain and also gives `Polish millet` for *D. sanguinalis*. These terms do not establish one broadly used current English product label. |
| fr-CA display | **Unresolved; add none.** | OQLF lists `digitaire sanguine`, `digitaire pourpre`, `panic pourpre`, `panic sanguin`, `manne terrestre`, and `manne sanguinale` under botany/Poaceae. Québec phytoprotection sources use `digitaire sanguine` for the weed *D. sanguinalis*. No reviewed Québec source names an edible grain product in French. |
| `Sikiya` | Do not activate as an alias yet. | It is the strongest local food name in the agriculture source, but is tied to a specific Baiga community and has no bundled recipe demand or Québec-market usage evidence. |
| `Polish millet` | Keep as research/source wording only. | ICAR uses it for the species, but it is not established as a current Canadian/Québec food label and does not resolve the food-product display. |
| `crabgrass`, `crab-grass`, `large crabgrass`, `hairy crabgrass`, `finger grass`, and related forms | Do not add as aliases. | OQLF and Québec weed-identification sources associate these names with the plant/weed. They are not food-qualified product labels and create avoidable weed/seed search collisions. |
| `digitaire sanguine` and its OQLF-listed synonyms | Do not use as food display or alias. | These are exact Québec botanical terms for the species. Their botanical authority does not establish an edible-grain product name. |
| `millet`, `mil`, `petit mil`, `fonio`, `raishan`, and `finger millet` | Keep separate from this candidate; add none as aliases. | OQLF says generic `millet` groups multiple species. FSSAI lists fonio, finger millet, and crab finger separately; ICAR also identifies *D. compacta* raishan apart from *D. sanguinalis*. `Finger millet` is a different species-level product. |
| Future candidate ID | Do not allocate `ingredient-ref-crab-finger-millet` or another ID from this packet. | The ID is only a working placeholder and is not present in the active package. Reconsider only after the food product name and fr-CA display are supported for a specific scope. |

### Source naming needs a narrow reading

FSSAI's standard is the strongest food-class evidence: it places crab finger/Sikiya under its whole-or-dehulled millet standard and distinguishes it from fonio, finger millet, and other listed grains. It is an Indian regulatory standard, not a Canadian product label or naming recommendation.

The ICAR–IIMR manual supports human-food use of Sikiya in the Baiga context and identifies *D. sanguinalis* as Polish millet. The chapter heading is “Fonio” and its prose also uses `crabgrass`, `finger grass`, `Sikiya`, and `raishan` around several *Digitaria* species. Keep those loose phrases from becoming global aliases: FSSAI and the manual itself distinguish *D. sanguinalis* from white and black fonio (*D. exilis*, *D. iburua*) and raishan (*D. compacta*). The manual's report that Sikiya is little known beyond the Baiga community and has meagre production reinforces the need for a bounded, locally supported name.

The OQLF record for `digitaire sanguine` is explicitly in botany/Poaceae, while Québec weed guides classify the plant in weed-identification contexts. Translating the food candidate as `grain de digitaire sanguine` or `millet sanguin` would be an unsupported product-name construction. Keep the Québec botanical name as evidence about the taxon and collision risk only.

## Recipe demand and normalized collision audit

The audit used the repository's `normalize_search_key` behavior across current canonical names/aliases, form labels/match terms, legacy candidate names/aliases, and ledger strings. It scanned all manifest-listed recipe JSON text and all ingredient rows for:

`crab finger`, `crab finger millet`, `Sikiya`, `Sikiya millet`, *Digitaria sanguinalis*, `Polish millet`, `crabgrass`, `crab grass`, `crab-grass`, `finger grass`, `finger-grass`, `large crabgrass`, `large crab-grass`, `hairy crabgrass`, `hairy crab-grass`, `hairy finger-grass`, `digitaire sanguine`, `digitaire pourpre`, `panic pourpre`, `panic sanguin`, `manne terrestre`, `manne sanguinale`, `millet sanguin`, *Panicum sanguinale*, `ghas ki roti`, and `bewar millet`.

| Search scope | Hits | Result |
| --- | ---: | --- |
| Recipe files | 0 of 114 | No recipe-prose demand. |
| Ingredient rows | 0 of 1,123 | No ingredient amount, form, or state to normalize. |
| Exact normalized-key collisions in active references, forms, legacy candidates, or ledger strings | 0 | No exact identity or picker-key collision for the candidate term set. |
| Candidate ID already allocated | No | `ingredient-ref-crab-finger-millet` is absent from active references, forms, and legacy candidates. |

The generic word `millet` overlaps the existing broad millet and species-qualified millet choices by design; it is not an exact collision with `crab finger`, `Sikiya`, or *D. sanguinalis*. The audit does not claim to test live picker ranking or exhaust every retail/search source. A bounded web search for Sikiya/crab-finger products in Canada and Québec did not surface a Canadian or Québec food listing; results were standards, Indian agriculture/food context, and Québec weed/botanical pages. This is a search-scope observation, not proof that no such product is sold.

Nearby identities remain separate: generic millet; common, finger, foxtail, kodo, pearl, little, brown-top, and barnyard millet; white and black fonio; and raishan where discussed. Weed-seed and forage/plant-part references are outside any possible food-grain row.

## Measures, forms, conversions, yields, and substitutions

- **Measures and density:** add no density, volume mapping, serving mass, unit mapping, or household measure. FSSAI's standard limits are product-quality specifications. ICAR's agricultural yield and prepared-food observations do not establish a dry-grain volume/mass conversion or a general recipe portion.
- **Forms:** add no ingredient form. FSSAI's whole/dehulled standard scope and ICAR's manual dehusking note support product processing context, not a complete dry/dehulled/cooked form model or measurable transformation.
- **Cooking yields and conversions:** add no cooking yield, dry-to-cooked ratio, grain-to-flour ratio, package yield, or mass/volume conversion. The manual's porridge and rice-like use context does not provide a transferable recipe ratio.
- **Substitutions:** add no global or contextual substitution. A source's comparison to rice or another millet is not evidence of interchangeability or a ratio.
- **Recipe links:** add none; the manifest corpus has no candidate hit.
- **Data not researched:** do not infer chemistry, household measures, density, or substitution rules from the regulatory or agricultural data cited here.

## Acceptance checks for any later decision

1. Confirm the food-product scope and taxon with direct primary food/agriculture evidence, keeping Sikiya, Polish millet, white/black fonio, raishan, common weed names, and feed/seed products distinct.
2. Obtain a Québec human-food label or authoritative Québec terminology evidence that names this specific edible grain in French. Do not promote `digitaire sanguine`, `millet sanguin`, or an invented compound without such evidence.
3. If accepted, define the row only for a sourced human-food grain scope and use only exact, low-collision names supported for that scope. Keep generic millet and botanical weed names out of its aliases.
4. Repeat normalized-key collision and full manifest recipe audits against the package at integration time; no recipe link is justified by this zero-hit review.
5. Keep forms, measures, density, conversions, yields, and substitutions absent unless separately researched with evidence appropriate to each field.

## Proposal-local source register

These source IDs are local to this proposal and were not written to the shared research ledger. Pages were accessed 2026-10-11.

| Source ID | Source and locator | Scope and limits |
| --- | --- | --- |
| `WP03-SIKIYA-20261012-S01` | Food Safety and Standards Authority of India, [Chapter 2.4: Cereals and Cereal Products](https://www.fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals%20and%20Cereal%20products%281%29.pdf), Version 3 (2024-11-04), §23(1)–(2)(v), PDF p. 18. | Primary food-standard source: standard scope is whole or dehulled millets and its list names `Crab finger (Sikiya) — Digitaria sanguinalis`. It supports a regulated Indian human-food grain class, not Canadian retail availability, Québec French wording, recipe measures, or conversions. The standard lists other *Digitaria* grains separately. |
| `WP03-SIKIYA-20261012-S02` | ICAR–Indian Institute of Millets Research, [Good Agricultural Practices (GAP) Manual for Sustainable Millets Production](https://www.millets.res.in/pub/2026/GAP-English.pdf), ch. 11, “Fonio,” *D. sanguinalis* heading and Sikiya discussion, PDF pp. 115–118. | Primary agricultural institute source: associates *D. sanguinalis* with Polish millet and Sikiya; describes Sikiya as a Baiga food grain in Madhya Pradesh, with local cultivation and dehusking context. The chapter's mixed `Fonio`/`crabgrass`/`finger grass`/`raishan` wording is not used to expand aliases. Reported agricultural or prepared-food quantities are not adopted as recipe measures or conversions. |
| `WP03-SIKIYA-20261012-S03` | Office québécois de la langue française, [digitaire sanguine](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18082121/digitaire-sanguine), GDT, botany/Poaceae, updated 1980. | Direct Québec terminology source: maps *D. sanguinalis* to `digitaire sanguine` and lists `digitaire pourpre`, `panic pourpre`, `panic sanguin`, `manne terrestre`, and `manne sanguinale`; English common terms include `crab-grass` and `finger-grass`. It names the plant, not an edible-grain product. |
| `WP03-SIKIYA-20261012-S04` | Office québécois de la langue française, [millet](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506455/millet), GDT, updated 2010. | Québec terminology source says `millet`, `mil`, and `petit mil` can be generic across several species and may also abbreviate a species name. It does not identify Sikiya or establish a species-specific food display. |
| `WP03-SIKIYA-20261012-S05` | Iriis Phytoprotection, [Digitaire sanguine](https://beta.iriisphytoprotection.qc.ca/fr/mauvaises-herbes/mauvaises-herbes-des-cultures/digitaire-sanguine), species record and weed-management section. | Québec phytoprotection source identifies *D. sanguinalis* as `digitaire sanguine` and classifies it under weeds of crops. It supports the local botanical/weed collision boundary, not a food name. |
| `WP03-SIKIYA-20261012-S06` | Canadian Food Inspection Agency, [Weed seed: Digitaria spp.](https://inspection.canada.ca/fr/protection-vegetaux/semences/analyse-semences-designation-categorie/identification-semences/digitaria-spp), French seed-identification page. | Federal plant/seed source lists *D. sanguinalis* among Canadian *Digitaria* species and describes genus-level weed-seed regulation and habitat. It is not a food-grain source or consumer label. |

## Review disposition

**Hold Sikiya / crab finger as an unallocated Section F candidate.** The species and a narrow traditional food-grain use are supported, but the English terms are not established as current Québec food labels, and the directly reviewed Québec French names are botanical/weed terms. No bundled recipe requests the product. Leave the catalog, ledger, recipes, forms, measures, conversions, yields, and substitutions unchanged from this proposal.
