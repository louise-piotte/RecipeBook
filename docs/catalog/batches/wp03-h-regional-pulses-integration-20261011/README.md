# WP03 Section H regional pulse identities — 2026-10-11

## Scope

This reviewed batch normalizes the existing adzuki identity, adds a distinct *Vigna mungo* urad
identity, adds source-attested cowpea aliases to the existing black-eyed-pea identity, closes the
bounded Bambara French-display review, and adds eight species-scoped regional pulse identities. The
broader Section H parent remains open because chickpea, common-bean, lentil, form, and candidate-sweep
work remains. No new recipe line demanded these products; the existing 200 g dried azuki line in
recipe 004 remains linked to its current reference.

## Integrated identities and boundaries

| ID | English / fr-CA display | Main boundary |
|---|---|---|
| `ingredient-ref-azuki-beans` | `adzuki beans / haricots adzuki` | Existing Vigna angularis identity corrected in place; recipe 004 stays linked. Dried, split, dehulled, cooked, and sweet-paste states are not encoded. |
| `ingredient-ref-urad-beans` | `urad beans / haricots urd` | Vigna mungo seed. Keep separate from Vigna radiata mung; exclude ambiguous `haricot mungo`, black lentils, and unqualified urad dal. |
| `ingredient-ref-rice-beans` | `rice beans / haricots riz` | Vigna umbellata seed; broad red/oriental bean wording and Antilles-only French terms are excluded. |
| `ingredient-ref-tepary-beans` | `tepary beans / haricots tépari` | Phaseolus acutifolius seed; Texan/Texas bean aliases are excluded. |
| `ingredient-ref-scarlet-runner-beans` | `scarlet runner beans / haricots d’Espagne` | Mature Phaseolus coccineus seed; young pods remain separate. |
| `ingredient-ref-horse-gram` | `horse gram / grain de cheval` | Macrotyloma uniflorum seed; kulthi is a narrow alias; horse bean, fève de cheval, and unqualified dal are excluded. |
| `ingredient-ref-winged-beans` | `winged beans / haricots ailés` | Mature Psophocarpus tetragonolobus seeds; young pods/tubers and cross-species asparagus-bean terms remain separate. |
| `ingredient-ref-hyacinth-beans` | `hyacinth beans / pois d’Égypte` | Lablab purpureus seed; frozen val papdi is an edible-pod product, not this seed identity. |
| `ingredient-ref-kerstings-groundnut` | `Kersting’s groundnut / lentille de terre` | Macrotyloma geocarpum seed; exclude `pois de terre` because it belongs to Bambara beans and avoid bare `groundnut` because it can resolve to peanuts. |
| `ingredient-ref-white-lupin-seeds` | `white lupin seeds / graines de lupin blanc` | Lupinus albus culinary seed only. OQLF says lupin seeds require proper soaking/treatment to be edible; this entry does not imply safe raw use or provide a home-processing procedure. Generic species-unspecified retail lupini remains unallocated. Keep white-lupin flour and blue-lupin flour distinct. |

All new rows are identity-only `LEGUME_AND_PULSE` references with null density and empty unit mappings.
No form, recipe link, measurement observation, conversion, package yield, or substitution rule was
added. The English/Québec French alias lists are limited to the proposal's evidence-backed terms;
Latin binomials and broad overlapping names are not consumer aliases.

## Existing alias and terminology decisions

- The azuki English display changed from `azuki beans` to `adzuki beans`; French changed from
  `haricot azuki sec` to `haricots adzuki`. The accepted aliases preserve recipe 004 wording.
- `ingredient-ref-black-eyed-peas` gained `cowpea`, `cow pea`, their plural forms, blackeye/black-eyed
  pea/bean spellings, and French `haricot à œil noir`. Bare `dolique`, `crowder pea`, `southern pea`,
  and `pois du Brésil` remain out.
- Bambara remains `Bambara beans / pois bambara`, with current aliases unchanged. Translation Bureau
  and CFIA terminology corroborate this bilingual pair; no crop-specific OQLF ruling or Québec retail
  preferred-name claim is made.

## Evidence

- [OQLF, *haricot adzuki*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/10423445/haricot-adzuki),
  [TERMIUM Plus, Vigna angularis](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=VIGNA+ANGULARIS),
  and [CFIA's French organic seed/grain classifications](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme)
  support the identity correction and species boundary.
- [OQLF, *haricot mungo*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo)
  distinguishes Vigna mungo from Vigna radiata and lists urd/black gram; CFIA separately labels packaged
  V. mungo grain `haricot urd`.
- [OQLF, *dolique à œil noir*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082985/dolique-a-oeil-noir)
  supports the accepted cowpea and black-eye aliases while the broader `dolique` entry remains excluded.
- [CFIA's bilingual species table](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme)
  classifies the regional pulse products by species; it is a commodity classification, not proof of
  Québec retail prevalence.
- [TERMIUM Plus, Vigna umbellata](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=ent&lang=eng&srchtxt=VIGNA+UMBELLATA)
  directly supports rice bean/ricebean and the French pair `haricot riz` / `haricot grain de riz`.
- [TERMIUM Plus, tepary terminology](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=enb&lang=eng&srchtxt=DROUGHT+RESISTANCE)
  identifies edible Phaseolus acutifolius seeds and the term `haricot tépari`.
- [TERMIUM Plus, Psophocarpus tetragonolobus](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?consrv_suppr=1590647&fchrcrdnm=&i=1&index=enb&lang=eng&srchtxt=CAS+SYNONYM)
  distinguishes mature winged-bean seeds from young pods and tubers and supports the bilingual aliases.
- [Translation Bureau, *Vocabulary of Agriculture*, Bulletin 197](https://publications.gc.ca/collections/collection_2014/tpsgc-pwgsc/S52-2-197.pdf)
  supports hyacinth/lablab bean and `pois d’Égypte` / `dolique lablab` terminology.
- [Kew, Plants of the World Online, Macrotyloma geocarpum](https://powo.science.kew.org/taxon/urn%3Alsid%3Aipni.org%3Anames%3A505864-1/general-information)
  and [FAO EcoCrop](https://ecocrop.apps.fao.org/ecocrop/srv/en/cropView?id=7056) support the Kersting's groundnut seed identity and `lentille de terre` name.
- [OQLF, *lupin*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296940/lupin)
  maps the food/botany entry to Lupinus albus, gives the French names and culinary `lupini` usage, and
  cautions that lupin seeds must be soaked/treated before eating. [Croque Lupin](https://croquelupin.com/)
  corroborates a local roasted white-lupin product. CFIA classifies several Lupinus species separately;
  [Metro Québec](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/pates-riz-et-feves/feves-sechees/feves-de-lupin/p/793573468819)
  and [Super C](https://www.superc.ca/en/aisles/pantry/canned-jarred/beans-legumes/lupini-beans/p/062356502553)
  retail wording does not identify species, so generic lupini products remain unallocated.
- [TERMIUM Plus, Voandzeia subterranea](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=44&i=&index=frr&lang=fra&sg_kp_wet=10146040&srchtxt=PRODUIT+ALIMENTAIRE)
  corroborates `pois bambara` as terminology; it does not establish Québec prevalence or OQLF approval.

## Remaining work

The broader Section H regional-pulse parent remains open for brown/yellow lentils, other candidate
sweeps, and pulse forms or processed products justified by a specific recipe. Chickpea and common-bean
work also remains open. Do not infer a global density, dry-to-cooked yield, or substitution from these
identity sources.

## Package and verification

The package contains 1002 ingredient references, 63 forms, and 114 recipes with 1,123 ingredient rows. The research ledger contains 1,281 records, 4,071 source entries, and 3,334 distinct source IDs. Ingredient-reference normalization and bundled seed-package validation passed. No tests or emulator deployment were run because this batch only changes catalog database JSON data, as allowed by `AGENTS.md`.
