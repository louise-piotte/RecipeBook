# WP06 Andean yacon root identity review — 2026-10-11

- **Reviewed:** 2026-10-11
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, recipe, code, or test files changed.
- **Recommendation:** Integrate one identity-only ingredient for the edible yacon storage root, with a provisional French display. This addresses one candidate under the open Andean regional-root/tuber review; it does not close the wider WP06 gap.
- **Scope:** Botanical identity, edible organ, French and English naming, product boundaries, current-corpus collision audit. No recipe link, form, quantity, conversion, density, yield, or substitution is proposed.

## Decision

| Field | Proposed value | Evidence limit |
|---|---|---|
| ID | `ingredient-ref-yacon` | Candidate ID only; absent from active references and legacy identities. |
| Category | `VEGETABLE_AND_AROMATIC` | Source-supported food crop; no recipe demand was found. |
| English display | `yacon` | TERMIUM lists English `yacon`; CIP uses Yacon for the crop and its food root. |
| fr-CA display | `yacón` | Espace pour la vie, the Montréal botanical-garden institution, uses `Yacón`; provisional pending independent Québec terminology review. |
| Aliases | None | Do not add `poire de terre`, `jicama`, regional botanical names, or the Latin name as aliases; see collision review below. Accent-folded search makes `yacon` and `yacón` the same key. |
| Forms and numeric behavior | None | Keep default density null and unit mappings empty. Add no forms, package yields, amounts, conversions, or substitutions. |

The identity covers the edible storage root of *Smallanthus sonchifolius*. Use the crop name `yacon` / `yacón` for display and document the storage-root scope in the evidence record. Do not model planting rhizomes or assign the word `tuber` as an anatomical product label.

## Existing WP06 coverage and the remaining gap

The [plan](../../RecipeBook-global-ingredient-catalog-plan.txt) still asks for review of other documented Andean tubers after the arracacha, oca, ulluco, and mashua work. The earlier [Andean tuber review](wp06-andean-tubers-review-20261009.md) accepts oca, ulluco, and mashua as separate edible-tuber identities; the [integration README](../batches/wp06-andean-tubers-identities-integration-20261010/README.md) records those rows. Arracacha is already a distinct root identity in its [batch README](../batches/wp06-arracacha-identity-20261009/README.md). Papa seca, black chuño, and tunta are separate potato products, not yacon aliases or forms. The plan's broader checklist remains open.

Yacon is separately listed by CIP among Andean root-and-tuber crops and is taxonomically distinct from those existing identities. Its edible storage root therefore fills a real ingredient-identity gap even though the current 114-recipe corpus contains no matching recipe line. This review does not assess the remaining Andean crops, including achira, ahipa, maca, and mauka, or mark the overall plan item complete.

## Botanical and food-product scope

Kew accepts *Smallanthus sonchifolius* as a species native to western South America, describes it as a tuberous geophyte, and records food use. CIP's dedicated Genebank entry names Yacón (*Smallanthus sonchifolius*), locates the crop in the Andean highlands, and identifies harvested storage roots. CIP's crop page says the roots are eaten raw and describes culinary use after cooking. These sources support a distinct food crop/root identity, not equivalence to potato, oca, ulluco, mashua, arracacha, jicama, or Jerusalem artichoke.

**Organ terminology needs a narrow note.** CIP's current Andean-crop summary table labels Yacon's edible part as `Rhizome`, but CIP's dedicated Genebank entry and a peer-reviewed postharvest study refer to edible/harvested storage roots. The product evidence used here is the more specific root account. Because the authoritative summary table conflicts, this review does not claim a universal anatomical classification, does not call the food product a rhizome or tuber, and does not propose a planting organ. A future botanical follow-up can resolve the source-table inconsistency before adding any organ-specific forms.

Processing boundaries are also source-specific. CIP separately lists syrup, flour, and chips as yacon uses/products; its crop page lists other processed products, including flakes, powder, and dry concentrate. A Québec retailer lists a processed `Sirop de Yacon` product and identifies its ingredient as yacon-root syrup. These are evidence that processed products exist, not aliases or forms of the fresh storage-root identity. Keep yacon syrup, flour, chips, concentrates, juice/sugar products, leaf infusions, and supplements out of this row unless each product receives a separate review. No processing ratio, root-to-syrup yield, food-safety instruction, nutrition claim, or sugar substitution is derived here.

## French naming and collision review

| Phrase | Current and source evidence | Proposed handling |
|---|---|---|
| `yacon` / `yacón` | TERMIUM lists English `yacon`; Espace pour la vie uses French `Yacón ou poire de terre` with the Latin name. The Québec retailer uses `Sirop de Yacon` for a processed product. | Use `yacon` EN and `yacón` fr-CA as the names; keep the French display provisional. Accent folding already links the spellings for search. |
| `poire de terre` | TERMIUM lists it as French for yacon, and Espace pour la vie uses it alongside yacón. TERMIUM also lists `poire de terre` as a less-frequent French name for *Helianthus tuberosus* (Jerusalem artichoke). | Do not add as a yacon alias. The term has a documented second botanical referent. The current seed does not use this phrase as a name or alias, but assigning it to yacon alone would conceal the source-attested ambiguity. |
| `jicama` | TERMIUM notes that yacon is frequently called `jicama` in Ecuador and immediately distinguishes that usage from commercial jicama. Espace pour la vie separately identifies jicama / pois patate as *Pachyrhizus erosus*. The seed already has `ingredient-ref-jicama` for jicama. | Do not add as a yacon alias. The local naming note is region-bound and explicitly distinguishes the crop from commercial jicama, which is already an active identity. |
| Other vernacular or scientific names | Kew records Colombian vernaculars such as `jíquima` and `jiquimilla`; TERMIUM records historical botanical synonyms *Polymnia sonchifolia* and *Polymnia edulis*. | Keep these in source evidence only. No reviewed source establishes them as English or Québec French food-product aliases for this catalog. |

Targeted OQLF GDT searches for `yacon`, `yacón`, and `poire de terre` did not surface a yacon entry in this review. This is a bounded search result, not evidence that no preferred Québec term exists. The institutional Montréal wording and the French-language retail listing support local usage, but neither is an OQLF ruling or proof that fresh roots are currently sold in Québec.

## Current seed, ledger, and recipe audit

The audit was run against the current working-tree snapshot on 2026-10-11: 962 ingredient references, 53 ingredient forms, 75 legacy import candidates, 114 manifest-listed recipes / 1,123 ingredient rows, and 1,233 ledger records.

The exact normalized phrase scan checked the yacon spellings and proposed names across active reference names/aliases, form labels/match terms, legacy names/aliases, every manifest-listed recipe file, and ledger records. It found no yacon, yacón, *Smallanthus sonchifolius*, or `aricoma` owner or recipe/ledger hit. No one of the 1,123 recipe ingredient rows contains a yacon line, and no recipe text requires relinking. The exact product-candidate keys for syrup, flour, and chips also have no active ingredient or form rows.

Comparator results are not additional yacon coverage: `jicama` already belongs to `ingredient-ref-jicama`; the active Jerusalem-artichoke row is `ingredient-ref-jerusalem-artichoke` with `topinambour` / `Jerusalem artichoke` naming. Neither row is yacon. `poire de terre` is absent from the current seed, while its external TERMIUM mapping to both yacon and Jerusalem artichoke makes it unsuitable as an unqualified alias.

The source-ID prefix `WP06-ANDEAN-YACON-20261011-S` was searched in the current catalog documentation before use and had no prior match. IDs S01–S10 below are proposal-local only; this review adds no ledger record.

## Proposed integration matrix

| Surface | Proposal |
|---|---|
| Ingredient reference | Add only `ingredient-ref-yacon`, category `VEGETABLE_AND_AROMATIC`, EN `yacon`, fr-CA `yacón`. Keep the French display provisional. |
| Aliases | Empty arrays. Specifically exclude `poire de terre`, `jicama`, `jíquima`, `jiquimilla`, *Polymnia* synonyms, and unsupported English glosses. |
| Forms and measurements | None. Keep density null and unit mappings empty. Do not convert root mass, volumes, counts, syrup amounts, or processed-product yields. |
| Recipes | None to link or revise; the corpus contains no matching line. |
| Product boundaries | Keep syrup, flour, chips, concentrates, juice/sugar products, and leaf products outside the root identity. |
| Substitutions | None. Evidence of shared texture or membership in a broad root-crop group does not establish recipe interchangeability. |

## Source register

All pages were consulted 2026-10-11. The source IDs below are local to this proposal, not ledger IDs.

| ID | Source and locator | Claim used and evidence limit |
|---|---|---|
| **WP06-ANDEAN-YACON-20261011-S01** | Royal Botanic Gardens, Kew, Plants of the World Online, [*Smallanthus sonchifolius*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:237510-2/general-information). | Accepted species; western South American range; tuberous-geophyte classification and food use. This does not define the edible organ or a Québec food label. |
| **WP06-ANDEAN-YACON-20261011-S02** | International Potato Center (CIP) Genebank, [Yacón](https://cipotato.org/genebankcip/process/yacon/). | Names *Smallanthus sonchifolius*, gives Andean range, and says storage roots are harvested. The page is an institutional crop account, not a household portion or universal product standard. |
| **WP06-ANDEAN-YACON-20261011-S03** | CIP, [Yacon](https://cipotato.org/roots-and-tubers/yacon/). | Says roots are eaten raw, describes cooked culinary use, and lists processed yacon products. It does not establish a Québec fresh-root market or a transferable preparation ratio. |
| **WP06-ANDEAN-YACON-20261011-S04** | Graefe et al., “Effects of post-harvest treatments on the carbohydrate composition of yacon roots in the Peruvian Andes,” *Field Crops Research* 86 (2004), [DOI](https://doi.org/10.1016/j.fcr.2003.08.003). | Peer-reviewed study identifies yacon as an Andean root crop and reports storage-root processing context. Its experimental treatment results are not adopted as recipe instructions, composition defaults, yields, or amounts. |
| **WP06-ANDEAN-YACON-20261011-S05** | CIP Genebank, [Andean Root and Tuber Crops](https://cipotato.org/genebankcip/process/andean-root-and-tuber-crops-artcs/), current-use table. | Lists yacon separately among Andean crops and lists syrup, flour, chips, sugar, and juice. Its edible-part cell says `Rhizome`, which conflicts with the dedicated storage-root account in S02 and the root-crop study in S04; this review preserves that discrepancy rather than treating it as a resolved organ standard. |
| **WP06-ANDEAN-YACON-20261011-S06** | Translation Bureau, Government of Canada, TERMIUM Plus, [YACON](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?fchrcrdnm=1&i=&index=esr&lang=fra&sg_kp_wet=1557073&srchtxt=YACON). | Lists English `yacon` and French `poire de terre`, describes an edible Peruvian plant with fleshy roots, and records an Ecuadorian `jicama` observation while distinguishing commercial jicama. Terminology evidence is not Québec retail prevalence; the Ecuadorian name is not generalized. |
| **WP06-ANDEAN-YACON-20261011-S07** | TERMIUM Plus, Government of Canada, [TUBEREUX / *Helianthus tuberosus*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=1&index=frw&lang=fra&srchtxt=TUBEREUX). | Lists `poire de terre` as a less-frequent French name for *Helianthus tuberosus* / Jerusalem artichoke. Supports excluding that phrase as a unique yacon alias. |
| **WP06-ANDEAN-YACON-20261011-S08** | TERMIUM Plus, Government of Canada, [JICAMA](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=esr&lang=fra&srchtxt=JICAMA). | Identifies commercial jicama with *Pachyrhizus erosus*. Used with S06 to preserve the explicit distinction between an Ecuadorian yacon name and common jicama of commerce. |
| **WP06-ANDEAN-YACON-20261011-S09** | Espace pour la vie / Jardin botanique de Montréal, [Potager d’Amérique latine](https://espacepourlavie.ca/potager-damerique-latine). | Uses `Yacón ou poire de terre` with *Smallanthus sonchifolius* and separately identifies jicama / pois patate as *Pachyrhizus erosus*. Direct Québec institutional French usage; not an OQLF term ruling or retail-availability record. |
| **WP06-ANDEAN-YACON-20261011-S10** | La Boîte à Grains, [Sirop de Yacon Biologique](https://laboiteagrains.com/products/sirop-de-yacon-biologique-organic-traditions). | Québec French-language retailer uses `Sirop de Yacon` and lists yacon-root syrup as the ingredient. Supports local wording for a processed product only; its SKU, package size, serving directions, and product copy are not transferred to the root identity. |

This review recommends one identity-only yacon storage-root row and leaves the broader Andean review open. It does not alter shared seed data, recipes, ledger, plan, roadmap, code, or tests.
