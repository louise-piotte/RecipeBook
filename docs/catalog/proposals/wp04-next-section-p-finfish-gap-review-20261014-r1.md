# WP04 Section P — skipjack tuna species and picker boundary (R1)

- **Review date:** 2026-10-14.
- **Status:** Root-reviewed and integrated on 2026-10-14 as the R116 picker-boundary hold. R117 superseded the singleton hold by adding the two taxa together; see the [R117 paired integration](../batches/wp04-section-p-skipjack-pair-identity-integration-20261014/README.md).
- **Bounded candidate:** Skipjack tuna, *Katsuwonus pelamis*.
- **R116 recommendation:** Hold a singleton active identity, aliases, forms, measures, and substitution allocation. CFIA assigns the short picker terms `skipjack` and `listao` to both *K. pelamis* and *Euthynnus lineatus*. R117 superseded this hold by integrating the pair together with qualified displays.
- **Parent checklist item:** `docs/RecipeBook-global-ingredient-catalog-plan.txt`, Section P, exact open item: “Salmon, cod, pollock, halibut, sole, flounder, turbot, sea bass, sea bream, snapper, grouper, tilapia, catfish, carp, mackerel, sardine, anchovy, tuna, bonito, eel, and regional fish.” This review covers only *K. pelamis* and its picker boundary; it does not close the parent item or decide *E. lineatus*.
- **Proposal-local source IDs:** `WP04-SECTIONP-SKIPJACK-TUNA-20261014-R1-S01` through `S07`. The prefix was checked against the existing proposal, batch, and ledger archives.

## Decision

Keep the live generic `tuna / thon` reference unchanged. Do not create a *Katsuwonus pelamis* reference, alias, form, unit mapping, density, yield, or substitution in this packet. The Canadian Fish List and current NOAA fisheries page identify the species; Health Canada’s Canadian Nutrient File (CNF) and current Québec grocery/manufacturer pages establish that it is relevant to Canadian food names and products. Those sources do not make `skipjack` or `listao` unique picker terms, and they do not support a general fresh-fish form or conversion.

At R116, before the paired *E. lineatus* review, a standalone `Skipjack tuna` / `thon listao` row remained conditional because CFIA assigns the short terms `skipjack` and `listao` across taxa. R117 resolved the singleton boundary by adding both species with qualified displays together. Keep bare `skipjack`, `listao`, `tuna`, `thon`, `bonito` / `bonite`, and species binomials out of aliases.

## Prior work and why this case remains open

The 2026-10-11 tuna-steak review tested “skipjack tuna” and *K. pelamis* among species search terms while deciding that recipe `111#1` remained generic tuna. It found no active owner but did not review a *K. pelamis* identity or allocate names. The 2026-10-13 katsuobushi powder review recorded a seller’s “skipjack tuna” description without a Latin species name and explicitly did not assign a species. A Section P next-gap review also warned against using `skipjack` as an alias for the separate *Sarda sarda* Atlantic bonito identity. These are relevant boundaries, not decisions that resolve this candidate.

I found no focused *K. pelamis* identity or picker decision in the current proposal/batch archive, live references, forms, legacy identities, or research ledger. That leaves a discrete naming and search question suitable for this packet; the generic tuna recipe and unspecified katsuobushi source are not evidence for a species-level recipe link.

## Current snapshot and ownership

R116 inventory before the R117 paired integration:

| File | Current count | SHA-256 |
|---|---:|---|
| [`ingredient-references.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json) | 1,457 references | `cb3f5edbd22b83558efc6c3c6011527d170df9c46bd5523f29273bdcb6fe50bd` |
| [`ingredient-forms.v1.json`](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json) | 105 forms | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| [`legacy-import-identities.v1.json`](../legacy-import-identities.v1.json) | 63 candidates | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| [`research-ledger.v1.json`](../research-ledger.v1.json) | 1,797 records | `68982051c6048c950440e436bb2716d3e09d25e1d64354c7d091038c6d268d68` |
| [`manifest.v1.json`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json) | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The manifest-listed recipes contain **1,123 ingredient rows**. A normalized scan found no row containing `skipjack`, `skipjack tuna`, `listao`, `thon listao`, `bonite à ventre rayé`, *K. pelamis*, *E. lineatus*, `black skipjack`, or `thonine noire`. The ordered recipe corpus fingerprint (path, NUL, exact file bytes, NUL per manifest entry) is `0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143`.

The one related recipe row is not species-specific: [`recipe 111`](../../../app/src/main/assets/seed/bundled-library/recipes/111-thon-sous-vide-sous-vide-tuna-b699f193-4545-4e7a-98ad-ce092a1e38e4.v1.json), row `111#1`, says `1 tuna steak` and is linked to `ingredient-ref-tuna`. Preserve that link and its count measure; do not relink it to *K. pelamis*.

| Query or key | At the R116 snapshot | If a sole *K. pelamis* row had been added |
|---|---|---|
| `skipjack`, `skipjack tuna`, `listao`, `thon listao`, *K. pelamis*, *E. lineatus*, `black skipjack tuna`, `thonine noire`, `bonite à ventre rayé` | At the R116 snapshot, no active reference, form, or legacy candidate owned these exact terms and no exact ledger record ID existed for either binomial. | A sole qualified *K. pelamis* row would then have been the only catalog entry returned for its words, making `skipjack` and `listao` appear uniquely owned even though CFIA assigns them to both taxa. R117 added both rows together. |
| `tuna`, `thon` | Six active tuna references match each query: albacore, Atlantic bluefin, Pacific bluefin, Southern bluefin, generic tuna, and yellowfin. | Adding “Skipjack tuna” / “thon listao” would expand each broad query to seven. That is consistent with a species entry but does not resolve the short-name collision. |
| Tuna forms | No tuna- or thon-named form is present among the 105 live forms. | No form should be inferred from a species reference. |

The projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): the search first returns entries whose normalized name or alias contains the complete query word phrase, then falls back to substring matching. Thus a qualified display containing `skipjack` or `listao` is enough to make the short query return the candidate as a singleton while *E. lineatus* has no active row. That is the picker boundary behind this hold.

## Name, species, and Canadian/Québec product evidence

The CFIA Fish List is the primary Canadian common-name crosswalk used here. Its current query results associate *K. pelamis* with names including `Skipjack`, `Skipjack Tuna`, `Listao`, `Bonite à Ventre Rayé`, and `Thon`. The same list also returns `Skipjack` and `Listao` for *Euthynnus lineatus*, as well as qualified black-skipjack / thonine-noire wording. The short names are therefore cross-taxon names in this source, not safe unique aliases. This is naming evidence, not a recipe substitution or rule about every retail label [S01].

The often-cited tuna table is from the **2017 Canada Gazette, Part I proposed regulations**. It is proposal-era text, not a current SFCR species-name table. The current consolidated [SFCR §262](https://laws-lois.justice.gc.ca/eng/regulations/SOR-2018-108/section-262.html?wbdisable=true) concerns flesh-colour expressions for tuna in hermetically sealed packages and does not contain a species-specific `Skipjack` table [S09]. The current CFIA Fish List independently assigns `Skipjack` and `Listao` across *K. pelamis* and *E. lineatus*, which remains the picker-boundary evidence. Do not generalize canned-product wording to a state-independent recipe-picker rule [S08].

NOAA Fisheries identifies Atlantic skipjack tuna as *K. pelamis*, supporting the species correspondence, but it is a U.S. fisheries source and does not establish Canadian label ownership [S02]. OQLF’s GDT entry for `listao` gives English `skipjack` and the older scientific combination *Euthynnus pelamis*; note its AFNOR 1968 attribution and older nomenclature. It supports the French term’s history, while the current CFIA list and product pages are needed to relate contemporary names and product usage [S03].

Current Québec-facing commercial evidence uses **thon listao** for *K. pelamis*: Metro lists a 142 g canned Raincoast Global product with ingredients `THON LISTAO (MALDIVES), EAU, SEL DE MER`, and Ocean’s identifies its canned skipjack (*K. pelamis*) product as thon listao. Metro’s seafood policy also names “Thon listao (*Katsuwonus pelamis*)”. Clover Leaf currently uses “thon pâle listao” for its canned product. These establish locally visible French product terminology and species-linked supplier naming, not a standard general name for every fresh, frozen, cooked, or canned state [S04–S06]. The Metro can’s package weight belongs to that SKU; Clover Leaf and Ocean’s product states must not be used to infer a generic fish measure or yield.

Health Canada’s CNF lists food code 3082 as “Fish, tuna, skipjack (aku), fresh, raw” / “Poisson, bonite à ventre rayé, frais, cru.” This is the strongest Canadian evidence found for a raw *K. pelamis*-named food record, but CNF’s French naming differs from current Québec canned product labels. It is a source-code food description, not proof of current Québec retail demand or a default catalog display [S07].

## Demand and product boundary

Direct recipe demand is **zero** in the current manifest corpus for this species and its named terms. Recipe 111’s one generic tuna-steak row is the only tuna/thon ingredient row found, and neither its publisher wording nor stored link names a species. Do not use generic tuna demand to justify this species.

The evidence spans one raw-food CNF record and current canned Québec products, including a prepared tuna salad ingredient. It does not establish a single form covering those states. No fresh or frozen Québec SKU with an explicit species crosswalk was needed to resolve identity, so this packet proposes no fresh, frozen, cooked, canned, drained, or prepared form. The available prepared products are product-specific examples, not a general species preparation rule.

## Measures, conversions, yield, and substitutions

| Evidence | What it supports | What it does not support |
|---|---|---|
| CNF code 3082: 100 g edible portion = 100 g; “half fillet” = 98 g; food-guide serving = 90 g; total refuse = 65%. | Source-specific portion and refuse observations for that CNF raw-fish record. The R117 ledger retains the half-fillet and Food Guide portions on the *K. pelamis* record only. | A default serving, fillet weight, as-purchased yield, edible yield for another product, preparation form, or measurement to transfer to *E. lineatus* or canned fish. The 100 g edible-portion basis and 65% refuse are not activated as catalog behavior. |
| Metro Raincoast Global can: 142 g package. | The named SKU’s package size and label wording. | Drained mass, edible yield, one-can recipe measure, or any mass-volume conversion. |
| No source found for volume, density, unit mapping, portion-to-mass conversion, or recipe ratio for generic *K. pelamis*. | None. | Do not add a density, count conversion, or unit mapping. |
| No source found establishing a safe or culinary substitution between *K. pelamis* and another tuna species, another fish, or canned versus raw products. | None. | Do not add a global or contextual substitution, or infer cooking, curing, storage, or raw-consumption equivalence. |

## Source register

Sources were checked on 2026-10-14. The CFIA and retailer pages can change; the snapshot and limits above describe what was reviewed.

| ID | Source and URL | Use and limit |
|---|---|---|
| **S01** | Canadian Food Inspection Agency, [Fish List search: “Skipjack”](https://active.inspection.canada.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cmbIn=e&q=Skipjack) | Common-name records tied to scientific taxa, including both *K. pelamis* and *E. lineatus*. Page shows modified 2023-09-18. Naming index only; it does not create a catalog picker policy. |
| **S02** | NOAA Fisheries, [Atlantic Skipjack Tuna](https://www.fisheries.noaa.gov/species/atlantic-skipjack-tuna) | Connects Atlantic skipjack tuna to *K. pelamis*. U.S. fisheries context, not a Canadian or Québec retail naming authority. |
| **S03** | OQLF, [GDT: listao](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3499947/listao) | Québec terminology record linking `listao` and `skipjack`; credits AFNOR (1968) and uses *Euthynnus pelamis*, an older taxonomic combination. Not current taxonomic authority. |
| **S04** | Metro, [Raincoast Global thon listao en morceaux dans l’eau](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/thon-listao-en-morceaux-dans-l-eau-a-saveur-de-sel-de-mer/p/810757003892) | Current French SKU page; 142 g can and ingredient declaration include `THON LISTAO`. Page displayed unavailable at the selected store during review. SKU evidence only. |
| **S05** | Ocean’s, [Thon pâle entier dans l’huile d’olive](https://oceans.ca/fr/products/thon-pale-entier-dans-lhuile-dolive-2/) | Manufacturer identifies product as thon listao, Latin *K. pelamis*, with oil/water/salt. Preserved product evidence, not a generic form or measure. |
| **S06** | Metro, [Our sustainable fishing policy](https://api.metro.ca/fr/produits-a-decouvrir/poissonnerie/notre-politique-de-peche-durable); Clover Leaf, [Thon pâle émietté listao dans l’eau](https://www.cloverleaf.ca/fr/produits/thon-pale-emiette-clover-leaf-listao-dans-leau/) | Current supplier/retail wording, including Metro’s species parenthetical and Clover Leaf’s canned “thon pâle listao.” Policy and SKU pages do not define general catalog states or yields. |
| **S07** | Health Canada, Canadian Nutrient File, [Serving size and portions, food code 3082](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3082) and [French view](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=3082&lang=fre) | Raw skipjack food description, French “bonite à ventre rayé,” serving/portion and refuse observations. Page modified 2019-03-01; retain values only as code-specific evidence, not catalog defaults. |
| **S08** | Canada Gazette, [Part I proposed regulations, 2017-01-21](https://gazette.gc.ca/rp-pr/2017/2017-01-21/html/reg1-eng.html#s253) | Proposal-era hermetically sealed tuna table only; it is not enacted current SFCR text. Current SFCR §262 concerns flesh-colour expressions and contains no species-name table. Do not use the 2017 table as current law or as the basis for the picker decision. |
| **S09** | Government of Canada, [Safe Food for Canadians Regulations, current section 262](https://laws-lois.justice.gc.ca/eng/regulations/SOR-2018-108/section-262.html?wbdisable=true) | Current consolidated text concerns the required colour expression for tuna in hermetically sealed packages; it does not contain a species-specific skipjack table. Current to 2026-09-21 in this review. |

## Root integration steps

1. The R116 singleton hold was superseded by the R117 paired picker review and integration. Both taxa are now represented in the same data change with qualified displays and empty aliases.
2. Keep generic `ingredient-ref-tuna` and recipe `111#1` unchanged. No forms, recipe links, conversions, yields, or substitutions were added.
3. Keep CNF code 3082 half-fillet and Food Guide portions as evidence on the *K. pelamis* ledger record only. Do not transfer them to *E. lineatus*, canned products, or a default measure.
4. The Section P parent remains open. See the [R117 integration README](../batches/wp04-section-p-skipjack-pair-identity-integration-20261014/README.md) for current picker results and validation.

The R116 packet was documentation-only. R117 added the paired species and source-bound CNF observations to the JSON catalog/ledger; no app or emulator tests were run under the updated `AGENTS.md` rule.
