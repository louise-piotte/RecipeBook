# WP03 Section H — urad, cowpea, lupin, and regional-pulse review

- **Reviewed:** 2026-10-11
- **Status:** Proposal only; no shared catalog, ledger, plan, roadmap, recipe, code, or test files changed.
- **Scope:** Existing Section H regional-pulse rows and candidates; *Vigna mungo* (urd/black gram), the cowpea/black-eyed-pea boundary, the unresolved white-lupin/lupini boundary, other species-coded regional pulses, exact aliases, package demand, and measurement/substitution evidence.
- **Proposal-local sources:** `WP03-H-REGIONAL-PULSES-20261011-S01` through `S27`; these are not ledger entries.

## Decision summary

The live working tree has 992 ingredient references, 63 forms, and 114 recipes with 1,123 ingredient rows. This audit found one recipe asking for azuki beans (recipe 004, line 1); it is already linked to `ingredient-ref-azuki-beans`. No line asks for urad, cowpeas/black-eyed peas, pigeon peas, moth beans, Bambara beans, lupini/lupin seeds, rice beans, tepary beans, runner beans, horse gram, winged beans, hyacinth beans, or Kersting’s groundnut. The active references for mung beans, pigeon peas, moth beans, and Bambara beans already hold the reviewed identities described in their source proposals and batch notes.

Recommended integration:

1. Review and normalize the existing azuki row in place. Retain its ID and recipe link; remove the unsupported dry-state wording from the French display.
2. Add a separate identity-only *Vigna mungo* row for urad/black gram, with the Canadian federal French term `haricot urd`. Keep the ambiguous `haricot mungo` term on the existing mung row only; do not alias `black lentils` or unqualified `urad dal`.
3. Add source-attested cowpea names to the existing black-eyed-pea identity. Keep `dolique` alone, `crowder pea`, `southern pea`, and `pois du Brésil` out of active aliases because their scope is broader or less clear in this catalog.
4. Close the specific independent Québec French display review for Bambara beans. Retain `Bambara beans / pois bambara`, with no claim that this is an OQLF ruling and no alias change.
5. Add identity-only regional pulse rows for rice bean, tepary bean, scarlet runner bean, horse gram, winged bean, hyacinth bean/lablab, and Kersting’s groundnut. Add a species-scoped white-lupin seed identity; leave generic retail `lupini beans` unresolved because the reviewed Canadian jar listings do not identify species.

For each new reference, set `defaultDensity` to `null` and `unitMappings` to `[]`. Add no forms, package yields, recipe links, unit conversions, or substitutions. For newly researched reference records, keep measurement and substitution states `not_yet_researched`; this pass did not establish supported numeric or interchange values. Existing recipe 004’s 200 g azuki quantity and its recipe-specific 1:1 bean-to-sugar weight note do not establish a cup measure, density, cooking yield, or global substitution.

## Existing records and exact proposed edits

### Azuki beans

The active row `ingredient-ref-azuki-beans` is currently `azuki beans / haricot azuki sec`, has empty aliases, and is marked `unreviewed` in the evidence ledger. OQLF’s food/botany entry gives `haricot adzuki` and English `adzuki bean`; TERMIUM Plus and CFIA separately attest both `adzuki` and `azuki` spellings. The current French suffix `sec` encodes a preparation state in the base identity and is absent from the OQLF display. [S01–S03]

Update the existing row in place:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-azuki-beans` (unchanged) |
| `nameEn` | `adzuki beans` |
| `nameFr` | `haricots adzuki` |
| `aliasesEn` | `azuki bean`; `azuki beans` |
| `aliasesFr` | `haricot adzuki` |
| Identity scope | Food seed of *Vigna angularis*; do not encode dried, split, dehulled, cooked, or sweet-paste states in this row. |

Do not add `small red beans`, `red beans`, or `red bean` as aliases. The federal commodity table uses “small red (adzuki) beans” as a qualified class, while unqualified red-bean wording can select other bean identities. Do not create a dry form without a recipe requirement. Preserve recipe 004’s existing reference link and English ingredient wording; no recipe row change is proposed.

### Urad / black gram

Add one identity-only `LEGUME_AND_PULSE` reference for the food seed of *Vigna mungo*:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-urad-beans` |
| `nameEn` | `urad beans` |
| `nameFr` | `haricots urd` |
| `aliasesEn` | `urad bean`; `urd`; `urd bean`; `black gram` |
| `aliasesFr` | `haricot urd` |
| Scope | *Vigna mungo* seed identity; no maturation or split/dehulled state is implied. |

OQLF’s *Vigna mungo* entry maps the species to `urd`, `urd bean`, and `black gram`, while explicitly warning that French `haricot mungo` is used for both *V. mungo* and *V. radiata*. CFIA’s French table gives the packaged *V. mungo* grain label `haricot urd`, and its English table gives `black gram, urad`. Current Canadian listings also sell whole urad/black gram. [S04–S06]

Keep the existing `ingredient-ref-mung-beans` row for *V. radiata* unchanged. Do not put `haricot mungo` on the urad row: it would create an exact normalized collision with the active mung French alias and preserve the OQLF ambiguity without helping users distinguish the species. Do not add `black lentils`; a Canadian retailer listing uses this misleading wording for urad, but it risks conflating *Vigna* with actual lentil products, including the active black Beluga identity. Do not add `urad dal` or `black gram dal` until the whole/split product boundary has a dedicated review; Canadian products use `dal` across whole and processed presentations. The existing `ingredient-ref-roasted-urid-flour` remains a separate processed flour identity.

### Cowpea / black-eyed pea

Keep the current `ingredient-ref-black-eyed-peas` identity and its OQLF display `black-eyed peas / doliques à œil noir`. Add only the clearly source-attested aliases below:

| Language | Proposed aliases |
|---|---|
| English | `cowpea`; `cow pea`; `cowpeas`; `cow peas`; `blackeye pea`; `black-eyed bean`; `blackeye bean` |
| French | `haricot à œil noir` |

OQLF’s *Vigna unguiculata* entry lists `cowpea`, `cow pea`, and the black-eye bean/pea spellings under the same food concept and gives `haricot à œil noir` as a preferred French term. CFIA’s packaged grain code independently groups *V. unguiculata* as cowpea/black-eyed pea. These sources resolve the catalog’s former pending overlap review sufficiently for these exact terms. [S07–S08]

Keep bare `dolique` out: OQLF uses it for a wider group that includes *Vigna* and *Lablab*. Do not add `crowder pea` or `southern pea` in this row: although OQLF lists them in the same entry, they can name broader cowpea classes. Keep `pois du Brésil` as federal classification evidence only until a Québec or other consumer-food source independently settles its scope. This proposal does not create a second generic cowpea row.

### Pigeon, moth, mung, and Bambara beans

No identity, alias, form, density, mapping, recipe, conversion, yield, or substitution changes are recommended for the existing rows:

- `ingredient-ref-mung-beans` remains restricted to *Vigna radiata* and retains the existing note on the French overlap with *V. mungo*. Its mung sprouts, starch, flour candidate, and finished bean-thread noodle products remain distinct.
- `ingredient-ref-pigeon-peas` keeps `pigeon peas / pois cajan` plus the reviewed `gungo peas` and `pois d’Angole` aliases. Keep the Spanish source terms in evidence only because the catalog has no Spanish alias field. Fresh, dry, green, and canned states remain unresolved.
- `ingredient-ref-moth-beans` keeps `moth beans / haricots papillon` and its species-linked aliases for *Vigna aconitifolia*. Pods, sprouts, split/dehulled dhal, and flour stay outside this seed identity.
- `ingredient-ref-bambara-beans` keeps `Bambara beans / pois bambara` and its existing aliases. Add the terminology evidence in the ledger and close the specific open Québec French display review as described below.

The current exact-key audit found no duplicate exact bilingual name or alias for the new proposals in active references, forms, or legacy candidates. Partial phrase searches can return related products—especially white-lupin seed plus lupin flour, or runner-bean seed plus a future edible-pod identity—but those are expected distinctions, not exact alias collisions. The one known exact overlap is the existing mung French term itself; keep the new urd display on `haricots urd`.

## Independent Québec French review: Bambara beans

Retain the live display `Bambara beans / pois bambara` and close the nested plan item asking for an independent Québec French display review. The decision is that the display is **supported Canadian French usage**, not that OQLF ruled on it or that a current Québec grocery label was found.

The earlier Bambara proposal already checked OQLF and found only an unrelated entry for the Bambara language. This independent recheck found a matching Translation Bureau/TERMIUM Plus record for *Voandzeia subterranea* listing `pois bambara` among its French food-plant terms, and the bilingual CFIA organic grain table pairs `Bambara beans` with `pois bambara` for *Vigna subterranea*. Agriculture and Agri-Food Canada’s GRIN-Global record also lists `pois bambara` and `voandzou`. Together, these independently corroborate the existing French display; none is an OQLF preferred-term ruling or a Québec retail label. [S09–S11]

Do not change the displayed name or activate additional `pistache de terre`, `pois arachide`, `bambara`, or other broad/peanut-like terms from TERMIUM. Leave current aliases `pois de terre` and `voandzou` unchanged. Add the Translation Bureau source and this bounded decision to the existing Bambara ledger record; leave its existing measurement/substitution states as `researched_no_supported_value` and `researched_no_supported_substitute`.

## Other regional pulse rows proposed

The CFIA’s bilingual organic-grain extension table explicitly classifies the following as packaged grain prepared for sale and associates each with a scientific species. The table is a Canadian commodity classification, not a claim of common Quebec retail availability; for names below, I have retained only terms corroborated by a Canadian terminology authority, Québec/Canadian product listing, or both. The current catalog has no exact active owner for these proposed full names. [S05, S12]

| New ID | Proposed EN / fr-CA display | Proposed aliases EN / fr-CA | Species and boundary |
|---|---|---|---|
| `ingredient-ref-rice-beans` | `rice beans` / `haricots riz` | EN: `rice bean`, `ricebean`; FR: `haricot riz`, `haricot grain de riz` | *Vigna umbellata* food seed. TERMIUM Plus standardizes this English/French pair and identifies it as a pulse; CFIA separately codes packaged rice bean. Do not add generic `red bean`, `oriental bean`, `pois jaune`, or Antilles-only `pois zombi`; these are broad or can collide with other bean/pea identities. [S12–S13] |
| `ingredient-ref-tepary-beans` | `tepary beans` / `haricots tépari` | EN: `tepary bean`; FR: `haricot tépari` | *Phaseolus acutifolius* food seed, a distinct pulse class. CFIA and TERMIUM support the species/name pair; Canadian seed sellers independently use `tepary bean`. Keep `Texan bean`/`Texas bean` inactive as less current alternates. [S12, S14–S15] |
| `ingredient-ref-scarlet-runner-beans` | `scarlet runner beans` / `haricots d’Espagne` | EN: `scarlet runner bean`, `runner bean`, `runner beans`; FR: `haricot d’Espagne` | Mature edible seeds of *Phaseolus coccineus*. CFIA links `scarlet runner bean` to this species and gives the French commodity term. A Quebec seed listing pairs “Scarlet runner bean” with “Haricot d’Espagne”; Canadian growers describe edible mature dry beans. Keep young pods as a separate vegetable-stage question; no dry/cooked form is proposed. [S12, S16–S17] |
| `ingredient-ref-horse-gram` | `horse gram` / `grain de cheval` | EN: `horsegram`, `kulthi`; FR: none beyond display | *Macrotyloma uniflorum* food seed. CFIA’s packaged grain row uses `grain de cheval`; Canadian grocery listings pair horse gram with `kulthi`/`kulthi dal`. Do not alias `horse bean` or `fève de cheval`, which can denote *Vicia faba* types; do not alias `dal` without a form review. [S12, S18–S19] |
| `ingredient-ref-winged-beans` | `winged beans` / `haricots ailés` | EN: `winged bean`, `wing bean`, `four-angle bean`; FR: `haricot ailé`, `haricot dragon`, `pois carré` | Mature food seed of *Psophocarpus tetragonolobus*. TERMIUM Plus supplies the bilingual names and a Canadian seed listing confirms the species. Keep young pods and tubers out of this pulse row; the sources describe those as distinct edible parts. [S12, S20] |
| `ingredient-ref-hyacinth-beans` | `hyacinth beans` / `pois d’Égypte` | EN: `hyacinth bean`, `lablab bean`; FR: `dolique lablab`, `pois antique`, `lablab` | Mature food seed of *Lablab purpureus*. CFIA lists packaged grain as `Lablab, pois antique`; the Translation Bureau’s Vocabulary of Agriculture pairs `pois d’Égypte`/`dolique lablab` with hyacinth/lablab bean. Canadian frozen `val papdi` listings are evidence of local Lablab-market presence but refer to an edible-pod product, not a seed form or alias. [S12, S21–S22] |
| `ingredient-ref-kerstings-groundnut` | `Kersting’s groundnut` / `lentille de terre` | EN: `Kersting groundnut`, `ground bean`; FR: none beyond display | *Macrotyloma geocarpum* food seed. CFIA names the packaged product `Ground bean` and `lentille de terre`; Kew and FAO describe the West African species as a human-food pulse. Keep French `pois de terre` out because it is already an alias on Bambara beans; do not use bare `groundnut` because it can resolve to peanuts. [S12, S23–S24] |
| `ingredient-ref-white-lupin-seeds` | `white lupin seeds` / `graines de lupin blanc` | EN: `white lupin`, `white lupine`, `lupini`; FR: `lupin blanc`, `graine de lupin`; no `lupini beans` alias | Food seed of *Lupinus albus*. OQLF’s `lupin` entry covers *L. albus* and explicitly mentions culinary seed use under the Italian term `lupini`; a Québec-grown Croque Lupin source identifies its roasted seed product as white lupin. Keep it separate from both existing species-scoped lupin-flour rows. CFIA lists several lupin species, and Québec/Canadian brined-lupin product pages omit species, so do not resolve generic `lupini beans` or `lupin beans` to this row yet. [S25–S27] |

The IDs above are proposed names only and are not reserved. If integration chooses different IDs, preserve the identity and exact bilingual scope. No Latin binomial should be stored as a consumer alias.

## Exact alias, demand, forms, and numeric audit

- **Active references and candidates:** The existing adzuki row is an active identity; its evidence record is still `unreviewed`. There is no current urad, rice-bean, tepary, scarlet-runner, horse-gram, winged-bean, hyacinth-bean, Kersting’s-groundnut, or white-lupin-seed row. No named legacy import candidate owns the proposed whole-pulse identities.
- **Forms:** None of the current mung, adzuki, black-eyed, pigeon, moth, Bambara, or existing lupin-flour references has a relevant pulse-state form that needs repair. Existing products such as urad split dal, brined lupins, roasted lupins, young runner-bean pods, Lablab pods, and winged-bean tubers are not aliases of the proposed mature seed rows. Add a form only when a recipe or stable product-label requirement makes that state operationally necessary.
- **Recipe demand:** A manifest-order scan of all 114 recipes and their 1,123 ingredient rows found one relevant line: recipe 004, ingredient 1, “200 g dried azuki beans,” already linked to `ingredient-ref-azuki-beans`. No other reviewed pulse phrase or existing reference ID appeared in recipe ingredient fields. Do not add speculative recipe links.
- **Measures and conversions:** All current target pulse identities have `defaultDensity: null` and empty `unitMappings`; the target search returned no unit-conversion records. The package-yield list and global/contextual substitution rules contain no target rows. This review found no source-backed product-specific cup weight, density, unit mapping, package yield, or dry-to-cooked conversion suitable for activation. Retail jar capacities include brine/container volume; agricultural 1,000-seed masses and field yields are not household measures.
- **Substitutions:** No global or contextual replacement rule is justified for the reviewed seeds. Similar appearance or shared species/genus does not establish recipe interchangeability. The Bambara/peanut snack comparison and runner-bean/chickpea product copy are usage anecdotes, not scoped substitutions with a quantity or method rule. Do not add any substitution record.

## Ledger and plan integration instructions

If accepted, root should:

- Update the existing `ingredient-ref-azuki-beans` ledger record from `unreviewed` to `verified`, add sources S01–S03, and record that the row was normalized in place while recipe 004 remains linked. Leave measurement and substitution states `not_yet_researched`.
- Add a verified identity-only ledger record and sources for `ingredient-ref-urad-beans`, the seven other regional pulse identities, and `ingredient-ref-white-lupin-seeds`. Keep measurement and substitution states `not_yet_researched`; no numerical, form, recipe, or substitution entry is proposed.
- Amend the existing `ingredient-ref-black-eyed-peas` decision with sources S07–S08 and the accepted cowpea aliases; leave its measurement and substitution states unchanged.
- Add source S10 to the existing Bambara record and amend the display decision to say that the bilingual pair is supported by federal/Translation Bureau terminology while no OQLF crop ruling or Québec retail label was located. Keep the row, aliases, and numeric state unchanged.
- Add nested Section H checklist entries for the accepted species-specific identities. Mark the exact Bambara display-review subitem complete; do not mark the broader Section H regional-pulse parent complete until the remaining global pulse candidate sweep is resolved.

## Source register

Sources were reviewed on 2026-10-11. Proposal-local IDs are not ledger IDs.

| ID | Source and locator | Use and limit |
|---|---|---|
| **S01** | OQLF, [haricot adzuki](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423445/haricot-adzuki) | French `haricot adzuki`, English `adzuki bean`, *Vigna angularis*, food/botany domain. The English–French entry is attributed to Québec Amérique. |
| **S02** | CFIA, [French organic seed and grain product codes](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme) and [English version](https://inspection.canada.ca/en/food-labels/organic-products/import-requirements/organic-ogd-codes-seeds-amp-grains/new-ogd-extension-codes-organic-seeds-and-grai) | Chapter 7.13 codes distinguish *V. angularis* adzuki, *V. mungo* black gram/urd, *V. radiata* mung, *V. unguiculata* cowpeas, *V. aconitifolia* moth bean, *V. umbellata* rice bean, *Phaseolus acutifolius* tepary, *P. coccineus* scarlet runner, *Psophocarpus tetragonolobus* winged bean, *Macrotyloma* pulses, *Lablab purpureus*, and several *Lupinus* species. These are organic commodity codes, not mandatory retail names or culinary conversion rules. |
| **S03** | Government of Canada, TERMIUM Plus, [Vigna angularis](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=VIGNA+ANGULARIS) | Records English `adzuki bean`/`azuki` and French `haricot adzuki`/`pois adzuki`; `haricot anguleux` is marked regional to Algeria and is excluded. |
| **S04** | OQLF, [haricot mungo — *Vigna mungo*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo) | Defines *V. mungo*, lists English `urd`, `urd bean`, `black gram`, and says French `haricot mungo` is used for both *V. mungo* and *V. radiata*. |
| **S05** | CFIA, bilingual organic seed/grain codes, same pages as S02 | French packaged row says `haricot urd` for *V. mungo* and `haricot mungo` for packaged *V. radiata*; English row says black gram/urd for *V. mungo*. Supports keeping distinct FR displays. |
| **S06** | Walmart Canada, [Heer Urad Dal (Entier)](https://www.walmart.ca/fr/ip/Heer-Urad-Dal-Entier-8-Lb/301N6WN8SP0H); TastyGrains Canada, [Black Urad Dal](https://www.tastygrain.ca/products/black-urid-dal) | Current Canadian listings identify whole urad/black gram; marketplace and seller wording is corroborative product evidence, not terminology authority. Exclude the listings’ “black lentils” label from aliases. |
| **S07** | OQLF, [dolique à œil noir](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082985/dolique-a-oeil-noir) | Gives *Vigna unguiculata*, French preferred terms `dolique à œil noir` and `haricot à œil noir`, and English `cowpea`/`cow pea` with black-eyed terms. Its broad genus note for `dolique` is covered by OQLF’s separate [dolique](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296922/dolique) entry. |
| **S08** | CFIA, bilingual organic seed/grain codes, same pages as S02 | Packaged *V. unguiculata* grain is coded as cow pea/cowpea/black-eyed pea; French entry lists `dolique à œil noir` and alternate `pois du Brésil`. Supports exact catalog boundary but not a Québec retail preference for the alternate. |
| **S09** | Government of Canada, [TERMIUM Plus search for Voandzeia subterranea](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frr&lang=fra&srchtxt=PRODUIT+ALIMENTAIRE) | Translation Bureau record lists `pois bambara`, `voandzou`, `pois de terre`, and other Africa-qualified names for the food seed. It supports terminology, not Québec prevalence. |
| **S10** | OQLF, [bambara](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17015065/bambara); CFIA French codes; AAFC, [GRIN-Global *Vigna subterranea*](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=105107) | OQLF page concerns the language, not the crop; CFIA pairs `Bambara beans / pois bambara`; AAFC lists `pois bambara`/`voandzou`. No crop-specific OQLF ruling or Québec retail listing was located. This closes the bounded display recheck without overstating evidence. |
| **S11** | Existing `docs/catalog/proposals/wp03-bambara-groundnut-identity-quebec-display-review-20261011.md` and ledger record `ingredient-ref-bambara-beans` | Prior working-tree review already records the exact-key, recipe, aliases, maturity boundary, and absence of numeric/substitution support. This proposal adds only the Translation Bureau terminology corroboration and completion of the still-open review note. |
| **S12** | CFIA, bilingual organic seed/grain codes, same pages as S02 | Species-qualified packaged-grain nomenclature for the regional pulse rows in the table. It is a commodity-code source; it does not prove that every species is commonly stocked in Québec. |
| **S13** | Government of Canada, TERMIUM Plus, [*Vigna umbellata*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=VIGNA+UMBELLATA); AAFC, [GRIN-Global *Vigna umbellata*](https://pgrc-rpc.agr.gc.ca/gringlobal/taxon/taxonomydetail?id=41643) | Standardizes rice bean/ricebean with French `haricot riz` and `haricot grain de riz`; identifies a seed consumed as a dry pulse. AAFC provides an independent bilingual species record. Excludes broad English `red bean` and region-limited French variants from active aliases. |
| **S14** | Government of Canada, TERMIUM Plus, [tepary terminology search](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enb&lang=eng&srchtxt=DROUGHT+RESISTANCE) | Associates *Phaseolus acutifolius* with `tepary bean` and edible seeds; the federal French CFIA commodity name is `haricot tépari`. TERMIUM also gives less-current Texan/Texas alternates, which are excluded. |
| **S15** | T&T Seeds, [Tepary Brown Bean](https://ttseeds.com/products/teparybrownbean); Pure Asia Seeds, [White Tepary Bean](https://pureasiaseeds.com/en-ca/products/white-tepary-bean-seeds-phaseolus-acutifolius-heirloom-variety) | Canadian sellers identify *P. acutifolius* tepary beans; these are seed-market listings, not Québec grocery availability or volume measures. |
| **S16** | Pépinière.ca, [Scarlet runner bean](https://www.pepiniere.ca/en/products/scarlet-runner-bean) | Québec-facing listing pairs Scarlet Runner with the French product/cultivar wording `Haricot d'Espagne 'Scarlet Runner'`; it is a garden-seed listing, not a pantry retail product. |
| **S17** | CFIA packaged runner-bean code, S02; Circle Farms Canada, [Scarlet Runner Bean Seeds](https://www.circlefarms.ca/products/scarlet-runner-bean-seeds-sunset); Metchosin Farm, [Scarlet Runner Pole Bean](https://metchosinfarm.ca/products/scarlet-runner-pole-bean) | CFIA identifies *Phaseolus coccineus* as scarlet runner bean / haricot d'Espagne. Canadian growers describe both edible young pods and mature dried beans; only the mature seed identity is proposed here. |
| **S18** | CFIA, English and French organic grain-code pages, S02; FreshOnTheGo Grocery, [Dals & Pulses](https://www.freshonthegogrocery.ca/categories/dals-pulses/10705000000251577) | CFIA gives *Macrotyloma uniflorum* / `grain de cheval`; a current Canadian grocery category lists Horse Gram. These sources support identity and display, not unit measures. |
| **S19** | South Asian Central Canada, [Horse Gram (Kulith Dal)](https://www.southasiancentral.ca/product/horse-gram-kulith-dal-4lb/); Family Mart Canada, [Deep Horse Gram](https://thefamilymart.ca/products/deep-horse-gram-2lb/019efb99-71d1-7ffe-bcd4-cc55b55d88e9) | Canadian product listings pair horse gram with kulith/kulthi. Do not generalize `dal` or horse-bean wording to a whole-seed match term. |
| **S20** | Government of Canada, TERMIUM Plus, [*Psophocarpus tetragonolobus*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?consrv_suppr=1590647&fchrcrdnm=&i=1&index=enb&lang=eng&srchtxt=CAS+SYNONYM); Gaia Organic Seeds Canada, [Winged Bean](https://gaiaorganics.ca/product/winged-bean/) | TERMIUM supports `winged bean`, French `haricot ailé`, `haricot dragon`, and `pois carré`, and distinguishes edible mature seed from young pods and tubers. Gaia independently names the species and French variants in a Canadian seed listing. |
| **S21** | Government of Canada, Translation Bureau, [Vocabulary of Agriculture, Terminology Bulletin 197](https://publications.gc.ca/collections/collection_2014/tpsgc-pwgsc/S52-2-197.pdf) | Gives `pois d’Égypte; dolique lablab` for hyacinth/lablab bean. It is a terminology source; CFIA’s current French packaged-grain row supplies `Lablab, pois antique`. |
| **S22** | CFIA packaged *Lablab purpureus* code, S02; Save-On-Foods, [Vadilal Val Papdi](https://www.saveonfoods.com/sm/pickup/rsid/4410/product/vadilal-quick-treat-val-papdi-id-08901777041666) | CFIA supports the dry pulse name and species; current Canadian grocery listing supports regional Lablab product presence but is a frozen edible-pod product, not the mature-seed identity. |
| **S23** | Kew Science, [Plants of the World Online: *Macrotyloma geocarpum*](https://powo.science.kew.org/taxon/urn%3Alsid%3Aipni.org%3Anames%3A505864-1/general-information); CFIA packaged-grain code, S02 | Kew accepts the West African species and records Kersting’s groundnut; CFIA provides the packaged `Ground bean / lentille de terre` terminology. |
| **S24** | FAO EcoCrop, [Kerstingiella geocarpa / *Macrotyloma geocarpum*](https://ecocrop.apps.fao.org/ecocrop/srv/en/cropView?id=7056) | Lists immature and mature seeds as food and the French name `lentille de terre`. Its field-yield data are agricultural, not recipe conversion evidence. Keep `pois de terre` on the Bambara row and `groundnut` unqualified out of aliases. |
| **S25** | OQLF, [lupin](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296940/lupin) | Québec French food/botany entry is species-scoped to *Lupinus albus*, gives `lupin`, `graine de lupin`, `lupin blanc`, English white lupine/lupin, and notes culinary use under `lupini`. It does not license a genus-wide seed alias. |
| **S26** | La Terre de chez nous, [L’épopée d’une croqueuse de lupins](https://www.laterre.ca/productions/cultures-emergentes/lepopee-dune-croqueuse-de-lupins/); Croque Lupin, [Lupins rôtis](https://croquelupin.com/) | Québec product and business sources identify local white-lupin seed and roasted-seed products. They support a species-scoped food-seed identity, not a universal lupin preparation rule. |
| **S27** | CFIA lists multiple *Lupinus* species in S02; Metro, [Fèves de lupin](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/feves-sechees/feves-de-lupin/p/793573468819); Mayrand, [Lupini in brine](https://mayrand.ca/en/our-products/grocery/marinade/marinated-vegetable/lupini-1l-aurora-10939); Super C, [Lupini Beans](https://www.superc.ca/en/aisles/pantry/canned-jarred/beans-legumes/lupini-beans/p/062356502553) | Local Canadian/French retail labels demonstrate generic lupini and brined seed products but omit the species. Metro’s `grains de lupin` ingredient list and Mayrand/Super C brine products do not establish a genus-wide Québec French preferred name or map to *L. albus*. |

## Verification limits

This is a research proposal, not a data integration. No tests were run. Before any later catalog integration, the integrator should re-run exact normalized name/alias checks against the then-current references, forms, legacy candidates, and recipe rows. Current package totals are a working-tree snapshot and may change while parallel batches are integrated. The existing source packet and prior evidence for mung, pigeon, moth, and Bambara remain the authority for those decisions.
