# WP02 Section B Black-Bean Flour Identity Review

- **Date / source access:** 2026-10-12
- **Checklist scope:** WP02 Section B2, alternative flour identities. The B2 flour-and-starch review remains open; this is a focused candidate review, not completion of the parent checklist.
- **Status:** Integrated by root on 2026-10-12 as `ingredient-ref-black-bean-flour`; see `docs/catalog/batches/wp02-section-b-black-bean-flour-identity-integration-20261012/README.md` for accepted fields and validation.
- **Evidence source IDs:** `WP02-B2-BLACK-BEAN-FLOUR-20261012-S01` through `S10`. This prefix was unused before the review; all ten sources were added to the `ingredient-ref-black-bean-flour` ledger record during integration.
- **Candidate overlap check:** The live plan and proposal/batch archive contained no prior focused review of black-bean flour, sprouted black-bean flour, or the French flour phrase. The already integrated whole black beans, black-bean sauce, roasted urid flour, and the existing black-gram/urd review are distinct identities. Sesame, sunflower, pumpkin-seed, polvilho/manioc/tapioca, and pregelatinized green-banana reviews are excluded from this packet.

## Recommendation

**Accepted and integrated:** one identity-only `FLOUR_AND_STARCH` reference for the unqualified market product name `black bean flour` / `farine de haricots noirs`.

Canadian pulse sources list black-bean flour as a flour product and distinguish it from whole black beans. A Canadian French Cuisinart manual uses the exact plural compound `farine de haricots noirs`; OQLF's Québec entry identifies the base `haricot noir` as *Phaseolus vulgaris*. Keep the displayed flour name narrow and preserve the separate *Vigna mungo* / black-gram boundary [S01–S08].

The link from the flour product name to *P. vulgaris* is a **name-level inference**: OQLF and the Saskatchewan processor identify ordinary black beans as *P. vulgaris*, while the current Canadian flour listings use `black bean flour` without a Latin name for that flour SKU. The inference supports the ordinary commodity name only; it does not certify the botanical identity, cultivar, or processing of a specific supplier lot.

This is an **unqualified product-name identity**, not a claim that a flour sold without further qualification is raw, whole-milled, unheated, a fixed particle size, or from a specified cultivar. Integration added no aliases, forms, active density, unit mappings, recipe link, or substitution rule. No bundled recipe currently demands it.

| Field | Proposed value |
| --- | --- |
| ID | `ingredient-ref-black-bean-flour` |
| `nameEn` | `black bean flour` |
| `nameFr` | `farine de haricots noirs` |
| `aliasesEn` | `[]` |
| `aliasesFr` | `[]` |
| Category | `FLOUR_AND_STARCH` |
| `defaultDensity` | `null` |
| `unitMappings` | `[]` |
| Forms / recipe links | None |

The French display follows OQLF's species-qualified base bean term and a Canadian French manufacturer's own flour wording. It is not an OQLF entry for the full compound, and no current Québec black-bean-flour package label was found. Retain that distinction in any eventual ledger decision.

## Identity and process boundaries

- **Common black bean versus black gram:** OQLF maps `haricot noir` / `black bean` to *Phaseolus vulgaris* [S01]. OQLF separately explains that *Vigna mungo* is called `urd`, `urd bean`, or `black gram`, and notes that French `haricot mungo` can refer to either *V. mungo* or *V. radiata*; it is sometimes called `haricot noir` [S02]. Therefore, do not alias `black gram flour`, `urd flour`, `urad flour`, `roasted urid flour`, or `farine de haricot urd` to this candidate. Keep the existing roasted-urid-flour identity independent.
- **Whole pulse versus flour:** Keep `black beans / haricots noirs` as the whole pulse. The Saskatchewan processor lists black beans as *P. vulgaris* and separately presents bean flour, with black-bean flour pictured [S03]. Ontario-based Everspring separately lists `Black Bean Flour`, `Black Beans`, and `Sprouted Black Bean Flour` [S04]. The current accessible product listings do not disclose a cultivar, dehulling state, roast, heat treatment, or milling specification for the unqualified flour.
- **Plain listing versus sprouted product:** Everspring explicitly names its sprouted product `Organic Sprouted Black Bean Flour`, identifies it as Canadian, and describes sprouting as a product attribute [S05]. Keep this sprouted SKU as a separate future process/form question; do not put `sprouted black bean flour` on the proposed unqualified row. Its 50 lb / 20 kg bag options and 250 lb minimum are wholesale ordering data, not kitchen measures.
- **No broad flour-class alias:** Do not add `bean flour`, `whole bean flour`, `black turtle bean flour`, or black-gram/urd wording. The reviewed sources either identify a particular product or a broad flour family and do not establish these as safe, universal aliases for this reference.
- **No process or function claims:** General producer and industry statements that bean flours may thicken foods or replace a portion of cereal flour are not product-specific conversion directions. Do not transfer performance, nutrition, gluten-free, health, or recipe-use claims into catalog metadata [S03, S06].

## Current owners, picker behavior, and possible picker effect

The current data snapshot and picker source were inspected on 2026-10-12. Search normalization lowercases, applies Unicode NFKD, folds `œ`/`æ`/`ß` and `&`, removes combining marks, converts other non-ASCII alphanumeric runs to spaces, and collapses whitespace. The picker checks exact form keys first, then contiguous whole-phrase matches across reference names/aliases and attached form names/match terms, then partial substring matches. It does not stem singular/plural forms.

| Query / surface | Current owner and state | Candidate boundary |
| --- | --- | --- |
| `black beans`; `haricots noirs` | `ingredient-ref-black-beans`, `black beans / haricots noirs`, category `LEGUME_AND_PULSE`, no aliases. Its only active form is `ingredient-form-black-beans-canned-drained`: `canned black beans, drained / haricots noirs en conserve, égouttés`. | Keep the whole-bean row and canned/drained form unchanged. Do not move flour wording onto either. |
| `black bean` | Picker returns `ingredient-ref-black-bean-sauce` only: `black bean sauce / sauce de soja noir`, French alias `sauce de soya noir`, category `SAUCE_AND_CONDIMENT`. | Do not alias sauce to flour. If the candidate is added, the broad `black bean` query will return sauce plus flour, while the plural `black beans` query remains the whole-bean result. |
| `black gram` | `ingredient-ref-urad-beans`: `urad beans / haricots urd`, with English aliases `urad bean`, `urd`, `urd bean`, and `black gram`; category `LEGUME_AND_PULSE`. Its ledger sources include OQLF and CFIA evidence distinguishing the species [existing records `WP03-H-REGIONAL-PULSES-20261011-S04–S05`]. | Keep black gram / urd separate from the common black bean. |
| `roasted urid flour`; `farine de haricot urd torréfiée` | `ingredient-ref-roasted-urid-flour`, with no aliases; category `FLOUR_AND_STARCH`. Its existing ledger decision treats it as product-specific roasted *Vigna mungo* flour. | Do not alias or merge it with black-bean flour. |
| `black bean flour`; `sprouted black bean flour`; `farine de haricots noirs`; `farine de haricot noir`; `black gram flour` | No exact active reference or form owner. | The full English and plural French proposed names would resolve to the new row. The singular French wording remains unaliased. |
| Legacy import candidates | No exact candidate name or alias for the proposed English or French flour phrases; no candidate ID for `ingredient-ref-black-bean-flour`. | No legacy row is proposed for promotion. |
| Research ledger | Existing verified records exist for the sauce, whole beans, urad beans, and roasted urid flour; there is no black-bean-flour candidate or record ID. Adjacent records leave measurement and substitution research not yet researched. | Root would add the candidate's evidence and decision only if it accepts a canonical integration. This packet does not edit the ledger. |

Picker results at review time: `black bean flour` → no result; `farine de haricots noirs` → no result; `sprouted black bean flour` → no result; `black gram flour` → no result; `black beans` and `haricots noirs` → whole-bean row; `black bean` → sauce row; `black gram` → urad-bean row; `roasted urid flour` → roasted-urid-flour row.

With the proposed bilingual name and **no aliases**, the exact complete flour phrases would resolve to the new row. The broad `black bean` picker query would have two results (sauce and flour). The plural French query `haricots noirs` would have two results (whole bean and flour) because that phrase occurs in the French flour display. The plural English query `black beans` would remain on the whole-bean row; singular/plural spellings are not stemmed. These are explicit browse choices rather than a reason to merge the flour into either current owner.

## Full bundled-recipe demand scan

The scan used every recipe path listed by the live bundled-library manifest, parsed each JSON file, and searched normalized full recipe JSON and ingredient rows for black-bean-flour and nearby identity phrases. It also checked for a black-bean ingredient line that might otherwise be misread as flour demand.

- **114** manifest-listed recipe files; **1,123** ingredient rows; **753,792** recipe-file bytes.
- **Zero** rows or recipe texts matched `black bean flour`, `sprouted black bean flour`, `farine de haricots noirs`, `farine de haricot noir`, `black gram flour`, or `roasted urid flour`.
- **Zero** bundled ordinary black-bean ingredient lines or ingredient-reference links to `ingredient-ref-black-beans` were found in the same scan. Thus there is no recipe link to move, and no recipe-specific picker collision to resolve.
- External Canadian/Ontario sources do demonstrate use: Ontario Bean Growers presents banana-bread mini-loaves made with black-bean flour, and a Pulse Canada booklet hosted by Ontario Bean Growers gives a cookie recipe [S06–S07]. These examples support market identity and use, not demand in this app's bundled recipe package.

## Numeric and substitution limits

- A Pulse Canada cookie recipe lists **1 cup (250 mL)** of `black bean flour or whole bean flour`, for **48 cookies**. It provides no gram mass for this flour line; its flour-measuring footnote points to a general flour-measuring section. Treat the amount and the `or whole bean flour` option as one recipe-specific direction, not a flour density, general equivalence, or substitution ratio [S07].
- A Canadian French Cuisinart manual uses the phrase `farine de haricots noirs` and lists a **1 tbsp (15 mL)** line among several bean-flour entries, separately from `farine de haricots mungo`. This is recipe/manual wording and a volume amount only; it supplies no mass or general unit mapping [S08].
- Siddiq et al. report **0.515 g/mL bulk density** for their laboratory black-bean-flour sample, in a study comparing selected *Phaseolus vulgaris* flours. This is a sample- and method-specific physical result, not a validated home spoon/cup conversion or a transferable default density [S09].
- Everspring's FAQ says sprouted whole grains, seeds, and beans can be substituted 1:1 for unsprouted counterparts, but separately says sprouted flours generally require more liquid. It gives no flour ratio and is not evidence for converting this unqualified flour to the sprouted product [S10].
- The current active global and contextual substitution-rule arrays are empty. The only package-yield record is for a specific canned S&W whole-black-bean product and its drained form; it does not apply to flour.

Therefore keep `defaultDensity` null, `unitMappings` empty, add no form-level density or household measure, package yield, conversion, recipe-line substitution, or global/contextual substitution rule. A future ledger entry may preserve the cited article value as a source-specific observation while recording that it does not support an active default.

## Pre-integration snapshot

Snapshot taken at **2026-10-12 20:24:19 UTC** before any possible catalog integration; hashes are SHA-256 of the exact file bytes. The files were read from the shared live worktree, including the root-owned dill-seed identity/form integration that landed during this review. No shared file was edited for this review.

| Canonical surface | Count | SHA-256 / result |
| --- | ---: | --- |
| Active ingredient references (`ingredient-references.v1.json`) | 1,281 | `b60a60d4b9f1e2118ec4ad649bdd4f2a0ae5b507bee53d204990dd16b2912b0a` |
| Active ingredient forms (`ingredient-forms.v1.json`) | 96 | `05cad356b5dfd2a21e025f3e012f708c387c71dd8c016f3bada75c5b29ac4a06` |
| Legacy import candidates (`legacy-import-identities.v1.json`) | 64 | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger (`research-ledger.v1.json`) | 1,588 records / 5,653 source entries / 4,684 distinct source IDs | `ea0ce88070d55b3170211f4d3397e366c42f1360defe123d3fcbaef0721a6c6d` |
| Bundled-library manifest (`manifest.v1.json`) | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered bundled recipe corpus | 114 files / 1,123 ingredient rows / 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |

The recipe-corpus digest is computed in manifest order from each recipe's relative path bytes, a NUL byte, exact file bytes, and another NUL byte. At the snapshot, the proposed reference ID was absent from active references, forms, legacy candidates, and ledger record IDs; no prior proposal/batch used the candidate phrases or this proposal-local source-ID prefix.

## Possible integration delta

If root accepts this recommendation:

1. Add one reference row, `ingredient-ref-black-bean-flour`, with the exact English/French names above, empty aliases, category `FLOUR_AND_STARCH`, `defaultDensity: null`, and `unitMappings: []`.
2. Add no form, supplier-specific sprouted alias, recipe link, measurement mapping, package yield, or substitution rule. Do not change the existing whole-bean, bean-sauce, urad/black-gram, or roasted-urid rows.
3. Add the reviewed sources and one accepted identity-only decision to the research ledger. Keep flour-measurement and substitution outcomes non-active: the paper's bulk-density value, recipe volume lines, one recipe's “or” wording, and the sprouted-flour FAQ are source-specific observations, not generic catalog rules.
4. Leave the plan/roadmap's broader B2 parent open. If a checklist note is useful, link this proposal as a focused black-bean-flour identity review rather than calling the whole alternative-flour review complete.

## Source register

All sources below were accessed on **2026-10-12**. The IDs are local to this proposal.

| ID | Source and direct URL | Scope and limit |
| --- | --- | --- |
| S01 | Office québécois de la langue française, GDT, [`haricot noir`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8350002/haricot-noir). | Gives the preferred French headword, English `black bean`, and Latin *Phaseolus vulgaris*. This is the whole bean's terminology entry, not a standard for a flour product. |
| S02 | Office québécois de la langue française, GDT, [`haricot mungo`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082823/haricot-mungo). | Distinguishes *Vigna radiata* from *V. mungo* and maps *V. mungo* to English urd/black gram. Notes that it is sometimes called `haricot noir`; this ambiguity is why no black-gram/urd alias is proposed. |
| S03 | Diefenbaker Spice & Pulse, Saskatchewan, [`Special Crop Products`](https://www.dspdirect.ca/special-crop-products.php). | Lists black beans as *Phaseolus vulgaris*; its bean-flour section gives `Farina Phaseolus L. Spec` and says black-bean flour is pictured. It presents bean flour use generally and does not identify a cultivar or flour process. |
| S04 | Everspring Farms, Ontario, [`Beans & Lentils` products](https://www.everspringfarms.ca/product-category/beans/). | Current category listing presents `Black Bean Flour`, `Black Beans`, and `Sprouted Black Bean Flour` as separate products; the company says milling and production occur on site. The category page does not publish a botanical or process specification for the unqualified flour. |
| S05 | Everspring Farms, [`Organic Sprouted Black Bean Flour`](https://www.everspringfarms.ca/product/sprouted-black-bean-flour/). | Names a sprouted Canadian product and gives wholesale packaging/ordering information. It supports keeping the sprouted product label distinct; those package amounts are not kitchen measures. |
| S06 | Ontario Bean Growers, [`Bean Flours`](https://ontariobeans.on.ca/bean-flours/). | Current Canadian industry page describes bean-flour uses and explicitly identifies a banana-bread mini-loaf recipe using black-bean flour. General use statements are not replacement ratios. |
| S07 | Pulse Canada recipe booklet hosted by Ontario Bean Growers, [`Gluten-Free Recipes` PDF](https://ontariobeans.on.ca/wp-content/uploads/2020/06/Pulse-Canada-Gluten-Free-recipe-Pamphlet.pdf), printed p. 29 / PDF p. 29. | `Speckled Chocolate Chip Cookies` lists 1 cup (250 mL) black-bean flour or whole-bean flour and makes 48 cookies; it supplies no flour-line mass and cites an adapted 1993 recipe. Use only as recipe-specific use/quantity evidence. |
| S08 | Cuisinart Canada, [`CYM-100C French instruction and recipe booklet` PDF](https://www.cuisinart.ca/on/demandware.static/-/Sites-master-ca/fr_CA/v1770545043648/Instruction%20Booklet/CYM-100C_fr.pdf). | Older Canadian French manual uses `farine de haricots noirs` and separately names `farine de haricots mungo`; it lists 1 tbsp (15 mL) in a recipe/manual ingredient line. This supports Canadian French wording, not a current product label, an OQLF compound ruling, botanical product spec, or mass conversion. |
| S09 | Siddiq, M., Ravi, R., Harte, J.B., and Dolan, K.D. (2010), [`Physical and functional characteristics of selected dry bean (*Phaseolus vulgaris* L.) flours`](https://doi.org/10.1016/j.lwt.2009.07.009), *LWT—Food Science and Technology* 43(2), 232–237. | Primary study of selected dry-bean flour samples reports bulk density from 0.515 g/mL for its black-bean sample to 0.556 g/mL for its red-kidney sample. Retain as study-specific data only; not a household mapping. |
| S10 | Everspring Farms, [`Shop / FAQ`](https://www.everspringfarms.ca/shop/). | Separates its 1:1 statement for sprouted whole grains/seeds/beans from its qualitative statement that sprouted flours generally need more liquid. Gives no flour ratio and does not establish an adjustment for this candidate. |
