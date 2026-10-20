# WP02 B2/B3 next gap review — whole Great Northern bean flour

- **Reviewed:** 2026-10-12.
- **Status:** Integrated as an identity-only reference. Root added `ingredient-ref-great-northern-bean-flour` and its eight-source ledger record; the [integration record](../batches/wp02-b2b3-great-northern-bean-flour-integration-20261012/README.md) documents the decision.
- **Plan fit:** The broad WP02 B2 flour and starch review remains open. This is one source-named flour from a distinct active pulse identity; it does not reopen or duplicate the integrated pinto- or navy-bean-flour reviews.
- **Scope:** AGT's listed `Whole Great Northern Bean Flour 50`. Keep it separate from whole Great Northern beans, generic white-bean flour, navy-bean flour, and pinto-bean flour. Do not infer a flour heat-treatment or milling specification from the source title.
- **Candidate ID:** `ingredient-ref-great-northern-bean-flour`; integrated in the active catalog and ledger.
- **Source-ID prefix:** `WP02-B2B3-GREAT-NORTHERN-BEAN-FLOUR-20261012-ROUND10`; allocated to this review's eight source entries in the candidate ledger record.

## Integrated decision

**Integrated as an identity-only `FLOUR_AND_STARCH` reference** for `whole Great Northern bean flour / farine de haricots Great Northern entiers`, with empty alias arrays, `defaultDensity: null`, and `unitMappings: []`. The current Celiac Canada product finder lists AGT's exact product title `Whole Great Northern Bean Flour 50`; the exact suffix `50` is retained only as source wording and is not interpreted as a mass, percentage, particle size, or grade. AGT identifies Great Northern as one of the white dry-bean varieties, while OQLF and Statistics Canada distinguish Great Northern from white pea/Navy beans. [S01–S05]

The proposed English name follows the current listed product title. The French display is a transparent construction from OQLF's `haricot Great Northern` and the current Québec retail plural `Haricots Great Northern`; **the flour compound is provisional**, because no current Canadian package or Québec terminology entry for Great Northern flour was found. Do not add aliases for generic `white bean flour`, `white beans`, or `haricots blancs`; the product finder separately lists a whole white-bean flour, and the maker's own bean page treats Great Northern and Navy as varieties within the broader white-bean group. [S01–S04]

The whole Great Northern bean identity remains separate as `ingredient-ref-great-northern-beans`. Keep its existing raw- and cooked-bean USDA cup portions and its blocked, qualitative Great Northern–Cannellini note on that whole-bean ledger record. None is flour evidence. The integrated flour reference has no forms, measures, density, mappings, conversion, yield, recipe link, or active substitution rule. [current catalog and ledger]

## Identity, naming, and picker boundary

| Phrase or product | Current owner or recommendation | Evidence and limit |
|---|---|---|
| `Great Northern beans` / `haricots Great Northern` | Keep on `ingredient-ref-great-northern-beans`, category `LEGUME_AND_PULSE`, with its current singular aliases. | OQLF names the whole bean `haricot Great Northern` / `Great Northern bean` and identifies *Phaseolus vulgaris*. Current Loblaws Québec French listings show `Haricots Great Northern` and list generic `Haricots blancs` separately. The existing whole-bean row is not a flour identity. [S03–S04, current catalog] |
| `Whole Great Northern Bean Flour 50` | Current Celiac Canada listing names this AGT product; proposed scoped English display is `whole Great Northern bean flour`. | The product finder lists this separately from AGT's whole white-, Navy-, pinto-, and red-kidney-bean flours. It is a current product directory, not an AGT product specification; it supplies no product code, flour-processing details, or measure. Do not interpret `50`. [S01] |
| `farine de haricots Great Northern entiers` | Proposed French display, **provisional**. | Built from the OQLF whole-bean term and current Québec retail wording. No reviewed source gives this exact French flour label. Do not describe it as an OQLF term, a manufacturer label, or an established package translation. [S03–S04] |
| `white bean flour` / `farine de haricots blancs` | Leave unassigned; do not alias to this candidate or to whole Great Northern beans. | AGT calls Great Northern a white-bean variety, while its product finder lists `Whole White Bean Flour` and `Whole Great Northern Bean Flour` separately. The generic terms do not resolve to the named Great Northern product. [S01–S02] |
| `navy bean flour` / `whole navy bean flour` | Keep on the distinct integrated `ingredient-ref-navy-bean-flour`. | Great Northern and Navy are separate dry-bean classes; the current product finder also lists their flours separately. [S01, S05, current catalog] |
| `whole pinto bean flour` | Keep on the distinct integrated `ingredient-ref-pinto-bean-flour`. | The product finder lists pinto flour separately, and the existing pinto identity remains active. [S01, current catalog] |
| `Great Northern flour` | Do not add an alias. | The listed product says `Great Northern Bean Flour`; the shorter phrase is not attested as the product name and is not needed to find the proposed display. [S01] |

The current search normalizes case, accents, and punctuation, prefers complete word-phrase matches, and does not inflect singulars and plurals. A static projection of the proposed displays, with no aliases, is:

| Query | Projected result |
|---|---|
| `whole Great Northern bean flour`; `Great Northern bean flour` | Proposed flour only. |
| `farine de haricots Great Northern entiers`; `farine de haricots Great Northern` | Proposed flour only. |
| `Great Northern beans`; `haricot Great Northern` | Existing whole Great Northern beans only. |
| `Great Northern bean`; `haricots Great Northern`; `Great Northern` | Whole Great Northern beans and proposed flour. |
| `white beans`; `haricots blancs` | Existing generic white-bean reference only. |
| `white bean flour` | No current result; it remains unassigned. |
| `navy bean flour`; `whole navy bean flour` | Integrated navy-bean flour only. |
| `whole pinto bean flour`; `pinto bean flour` | Integrated pinto-bean flour only. |

Do not copy the whole-bean aliases `Great Northern bean` or `haricot Great Northern` onto the flour. The shared short search terms returning both whole bean and flour are an expected partial-category overlap; plural whole-bean searches continue to return the whole-bean row alone.

## Process, measures, and substitutions

- AGT's public bean page identifies Great Northern as a variety within its broader white-bean family and lists Navy separately. The product finder provides the exact flour title but no technical specification. Pulse Canada's foodservice guide distinguishes raw whole from pregelatinized whole bean flour and says heat processing changes flavor and functionality. The source title's `whole` qualifier supports a whole-pulse product identity, but does not establish whether this AGT product is raw, pregelatinized, roasted, or otherwise heat-treated. Do not add those terms as forms or aliases. [S01–S02, S06]
- No reviewed source provides a Great Northern flour cup weight, household measure, or bulk density for this product. The suffix `50` is not a unit. Keep `defaultDensity: null` and `unitMappings: []`. The existing whole-bean ledger observations of 183 g per U.S. cup raw and 177 g per U.S. cup cooked are for two different bean food records and must not be copied to flour; they are not a dry-to-cooked yield pair. [S01, WP03-H-GN-20261011-S07]
- The ledger records the historical wheat-flour findings as `wp02-great-northern-flour-wheat-replacement-formulation-boundary-20261012`, state `blocked_pending_evidence`: one dissertation reports up to 30% wheat-flour replacement by weight in its cookie formulations and 10% in its bread formulation; a separate bread study reports detrimental dough and bread quality above 10% in its tested formulation. These results are formulation-specific and do not specify the current AGT product. No global or contextual substitution rule is active. [S06–S08, current ledger]
- The current bundled recipe corpus has no Great Northern flour or whole Great Northern bean demand. The live ledger's existing whole-bean findings remain unchanged; no flour recipe link or measure is supported. [current corpus and ledger]

## Current catalog, ledger, ownership, and recipe audit

Read-only snapshot from the shared worktree on 2026-10-12. Digests cover exact file bytes unless described as the manifest-order recipe fingerprint.

| Surface | Live count / SHA-256 or fingerprint |
|---|---|
| Active ingredient references | 1,323; `86076e7b58fe1d06889f15792a0d2928f69951582bc0d39aaa13a3f7f54f3835` |
| Ingredient forms | 98; `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64; `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,631 records / 6,000 source entries / 5,017 distinct source IDs; `95da8ee4b608a3a8bc3cac26205762222765e7dfb5c72b6620aaff01a51fea84` |
| Recipe manifest | 114 recipe paths; `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows / 753,792 file bytes; fingerprint `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The pre-integration exact-owner audit covered every active reference display and alias, form label and match term, legacy candidate name and alias, and ledger record ID. It found no exact owner for the proposed flour phrases or ID. In the current integrated state, `ingredient-ref-great-northern-bean-flour` is the single active reference and ledger owner of the scoped flour identity; its English and provisional French display each occur as that reference's exact display name, with no duplicate exact owner in forms or legacy candidates. The source prefix is allocated to its eight ledger sources, each once in the source register. The exact whole-pulse names `Great Northern beans` / `haricots Great Northern` and singular aliases remain owned by `ingredient-ref-great-northern-beans`; a matching legacy row repeats that whole-bean ID and does not create another active identity.

The existing whole-bean flour neighbors remain distinct: `ingredient-ref-navy-bean-flour` is `whole navy bean flour / farine de haricots Navy entiers`, and `ingredient-ref-pinto-bean-flour` is `whole pinto bean flour / farine de haricots pinto`. The separate generic whole-bean reference is `ingredient-ref-white-beans / white beans / haricots blancs`. None owns the Great Northern flour identity.

All **114 manifest-listed recipe files and 1,123 ingredient rows** were scanned for Great Northern flour wording, likely English/French flour compounds, related whole-bean wording, and exact links to `ingredient-ref-great-northern-beans` or the proposed candidate ID. The scan found **zero matching recipe strings, zero matching ingredient rows, and zero rows linked to either identity**. There is no bundled recipe demand to support a recipe link, flour measure, or substitution.

## Integration result

The scoped identity-only reference is integrated with no aliases, forms, or numeric behavior. Keep its French flour display provisional until a current Canadian/Québec flour package or authoritative terminology source attests the compound. Keep Great Northern separate from Navy, pinto, generic white beans, and white-kidney/Cannellini; keep the whole-bean portion observations and blocked qualitative Great Northern–Cannellini finding on the existing whole-bean ledger record. The wheat-flour formulation finding remains blocked with no active substitution rule. This proposal does not close the broad WP02 B2/B3 checklist.

## Source register

Sources were checked on 2026-10-12. The source IDs below are allocated in the integrated candidate ledger record; they identify source entries, not ledger records.

| ID | Source | Supports | Limits |
|---|---|---|---|
| **WP02-B2B3-GREAT-NORTHERN-BEAN-FLOUR-20261012-ROUND10-S01** | Celiac Canada, [Gluten-Free Product Finder](https://www.celiac.ca/gf-product-finder/), current listing. | Lists AGT `Whole Great Northern Bean Flour 50`, separately from AGT whole white-bean, navy-bean, pinto-bean, and red-kidney-bean flours. This is current product-directory evidence for the source-named candidate. | Directory entry, not a first-party AGT product specification. It gives no process, detailed ingredients, packaging, volume measure, or interpretation of the `50` suffix. |
| **WP02-B2B3-GREAT-NORTHERN-BEAN-FLOUR-20261012-ROUND10-S02** | AGT Foods, [Beans](https://www.agtfoods.com/about/productcategories/pulses/beans), current manufacturer page. | Identifies Great Northern as one of the white dry-bean varieties; supports keeping Great Northern and Navy as named varieties within the wider white-bean family. | Whole-bean product-family context only; it does not list or specify the Great Northern flour product. |
| **WP02-B2B3-GREAT-NORTHERN-BEAN-FLOUR-20261012-ROUND10-S03** | Office québécois de la langue française, [*haricot Great Northern* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296953/haricot-great-northern), updated 1991. | Gives the preferred French singular `haricot Great Northern`, English `Great Northern bean`, and Latin name *Phaseolus vulgaris*; distinguishes the bean's morphology from white kidney bean. | Whole-bean terminology and identity, not a flour compound or process standard. |
| **WP02-B2B3-GREAT-NORTHERN-BEAN-FLOUR-20261012-ROUND10-S04** | Loblaws Québec, [*Haricots secs, légumes et grains*](https://www.loblaws.ca/fr/alimentation/garde-manger/haricots-secs-l-gumes-et-grains/c/28185), current listings. | Uses plural `Haricots Great Northern` for a Canadian-prepared whole-bean product and lists `Haricots blancs` separately. | Dynamic regional retail listing for whole beans only; its 900 g package size is not a recipe measure or flour yield. |
| **WP02-B2B3-GREAT-NORTHERN-BEAN-FLOUR-20261012-ROUND10-S05** | Statistics Canada, [2026 Field Crop Survey — November](https://www.statcan.gc.ca/en/statistical-programs/instrument/3401_Q2_V10), dry-bean crop classes. | Lists `dry beans, great northern` separately from `dry beans, white pea (Navy)`, pinto, and kidney classes. | Agricultural crop-class naming, not a flour specification, consumer label, or culinary substitution source. |
| **WP02-B2B3-GREAT-NORTHERN-BEAN-FLOUR-20261012-ROUND10-S06** | Pulse Canada, [*Foodservice Guide to Pulses* (2019), “Baking”](https://newsletter.smartbrief.com/whitepapers/53B06A2C-82E2-4D28-9108-DA1B9066F74F/Pulses_Food_Service_Guide_2019_0611b_lowerRes_1_-compressed.pdf). | Discusses Great Northern flour in one bread-fortification study; distinguishes raw whole and pregelatinized whole bean flours and says heat processing changes flavor and functionality. | Industry guide summarizing application studies; not an AGT SKU process specification, density, household measure, or general replacement rule. |
| **WP02-B2B3-GREAT-NORTHERN-BEAN-FLOUR-20261012-ROUND10-S07** | Shridhar K. Sathe, [*Investigations on the Great Northern Beans (Phaseolus vulgaris L.)*](https://digitalcommons.usu.edu/etd/5352/), Utah State University dissertation, 1981. | Primary research includes Great Northern bean flour and reports wheat-flour replacement up to 30% by weight in cookies and 10% in bread in its studied formulations. | Historical research formulation; it does not specify the current AGT flour, provide a household measure or density, or prove a transferable ratio. |
| **WP02-B2B3-GREAT-NORTHERN-BEAN-FLOUR-20261012-ROUND10-S08** | S. K. Sathe, J. G. Ponte Jr., P. D. Rangnekar, and D. K. Salunkhe, [“Effects of Addition of Great Northern Bean Flour and Protein Concentrates on Rheological Properties of Dough and Baking Quality of Bread,” *Cereal Chemistry* 58(2), 97–100 (1981)](https://www.cerealsgrains.org/publications/cc/backissues/1981/documents/chem58_97.pdf). | Reports that Great Northern bean flour levels above 10% were detrimental to dough and bread quality in the tested wheat-flour formulation; documents formulation-specific interaction. | One bread study; it does not establish a general substitution rule for other dishes, flour products, or recipes. |

## Static checks performed

After integration, refreshed live counts and exact-byte hashes; verified that the candidate identity has one active reference and ledger owner, all eight source IDs are allocated once in the candidate's ledger source register, and there is no duplicate exact flour-name owner in forms or legacy candidates; rechecked the current picker projection and active substitution-rule files; and scanned all 114 manifest recipes / 1,123 ingredient rows for candidate phrases and links. The candidate has one blocked wheat-flour formulation finding and no active substitution rule. The saved proposal was checked for UTF-8 without BOM, a final newline, and trailing whitespace. Only this proposal was edited for this update. No app, unit, instrumentation, or emulator tests were run under the AGENTS.md exemption for database-JSON-only changes.
