# WP02 Section 04 A6 R156 — Red teff flour boundary review

## Review record

- **Reviewed:** 2026-10-15.
- **Status:** Proposal only. This review changes no reference, form, legacy candidate, ledger record, recipe, generated file, checklist, roadmap, or integration README.
- **Open checklist:** Continue the A6 review of regional grain flours under [Section 04 A6](../../RecipeBook-global-ingredient-catalog-plan.txt#L1434); the parent remains open after R155.
- **Candidate:** A current Canadian own-label product named **Red Teff Flour**, with an unresolved relationship to the existing **brown teff flour / farine de teff brun** identity.
- **Unallocated ID checked:** `ingredient-ref-red-teff-flour`. It is not proposed for creation in this review.

## Recommendation

**Hold `red teff flour` outside active references and the research ledger. Do not create a second red-teff row, and do not add `red teff flour` as an alias to `ingredient-ref-brown-teff-flour`.** VANA Africa's current Calgary catalogue names a 20 lb own-label product Red Teff Flour and says its teff is milled and bagged in Calgary [A1]. This is strong evidence of a Canadian product name. It does not say whether the named product is the same color class as the Brown Teff Flour row already added for a separate Ontario product.

The red/brown boundary is not stable across the reviewed sources. A Toronto seller's Brown Teff Flour page describes its product as “Red/Brown Teff Flour,” while also describing red and brown flour as different shades [S01]. A separate seller's product page has “Brown Teff Flour” in its title but “Red Teff Flour” in its indexed description; direct page retrieval was blocked, so this is only a limited wording observation [S02]. A primary Ethiopian study treats Red teff and Brown (mixed) teff as separate sample groups, with Brown (mixed) described as a mixture of white and red grains [S05]. These materials show that product names can be distinct in some contexts and overlapping in others; none connects VANA's product to the Ontario Brown Teff Flour specification. Keeping the candidate unallocated avoids both an unsupported duplicate identity and an unsupported alias merge.

Keep the Canadian display evidence separate from the French wording evidence. VANA's page gives **Red Teff Flour** in English and an Amharic pack name; it does not provide a French name. A French-language product page from France names **Farine complète de teff rouge** and a sibling **Farine complète de teff blanc**, but the source-specific `complète` grade and its French market wording do not establish a Canadian or Québec label for VANA's product [S03]. The OQLF entry covers the base cereal term `tef` and gives English `teff`; it does not define a flour product or a red-teff compound [S04]. Do not store `farine complète de teff rouge`, constructed `farine de teff rouge`, `farine de tef rouge`, or a transliterated Amharic phrase as an active display or alias from this evidence.

Reopen this candidate if a Canadian packer documents whether its red product is distinct from, equivalent to, or a red/brown variant of the existing brown-teff product, and an independent Québec wording review supports a French display. Until then, add no ingredient ID, alias, form, measure, density, unit mapping, conversion, yield, recipe link, or substitution.

## Product and naming boundary

| Candidate or nearby identity | Disposition | Evidence boundary |
|---|---|---|
| Red Teff Flour / possible `farine de teff rouge` | Hold unallocated. | VANA directly names a Canadian own-label flour product, but its grain-color class and French label are unspecified. The French phrase has not been verified as a Québec product name or OQLF term. [A1, S03–S04] |
| Brown teff flour / farine de teff brun | Keep the existing `ingredient-ref-brown-teff-flour` unchanged. | R151 accepted this source-named Ontario product as identity-only; its record does not define red as a synonym or establish a general teff color taxonomy. [A2] |
| Generic teff flour / farine de teff | Keep the existing `ingredient-ref-teff-flour` unchanged. | The unqualified milling-product identity remains separate from the unresolved color-qualified candidate. |
| Ivory teff flour / farine de teff ivoire | Keep the existing `ingredient-ref-ivory-teff-flour` unchanged. | BHA's French page also names a white product, but this review does not decide whether `white` should be attached to the ivory identity. [S03] |
| Teff / teff d'Abyssinie | Keep the existing `ingredient-ref-teff-grain` unchanged. | Grain and flour remain separate. Do not add `red teff` or Amharic grain-name spellings to the grain row from this flour review. |
| Whole-grain or complete red teff flour | Keep the qualifier source-specific. | BHA's French product is explicitly `complète`; VANA does not specify that grade. Do not transfer a whole-grain claim. [S03] |
| `qey`, `quey`, transliterated Amharic, or red/brown teff | Leave inactive. | The reviewed sources do not establish a stable Canadian flour alias, a transliteration for the VANA pack, or one red-to-brown mapping. The VANA page notes that some Amharic names read from labels are still being checked by a native reader. [A1, S01–S02, S05] |

This review does not reopen the R151 brown-teff decision, the R150 ivory-teff decision, the generic teff-flour row, or the separate malted-teff hold.

## Exact ownership, ID, and archive audit

The live read-only snapshot contains **1,528 ingredient references, 119 ingredient forms, 61 legacy-import candidates, and 1,873 research-ledger records**. The ledger contains **7,937 source entries and 6,785 distinct source IDs**.

Exact phrase ownership was checked with the lowercase, NFKD, accent/ligature-folding, punctuation-to-space, whitespace-collapse normalization in [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The audit includes reference names and aliases, form labels and match terms, legacy IDs/names/aliases, and ledger record IDs.

| Exact normalized phrase or ID | Current owner or result |
|---|---|
| `red teff flour`; `farine de teff rouge`; `teff rouge`; `red teff` | No exact owner in references, forms, legacy candidates, or ledger record IDs. |
| `ingredient-ref-red-teff-flour` | Absent from references, forms, the 61 legacy candidate IDs, and ledger record IDs. It remains an unallocated audit placeholder. |
| `brown teff flour`; `farine de teff brun` | Exact owner: `ingredient-ref-brown-teff-flour`. |
| `teff flour`; `farine de teff` | Exact owner: `ingredient-ref-teff-flour`; phrase search also returns the existing ivory and brown teff flour references. |
| `teff` | Exact display owner: `ingredient-ref-teff-grain`; phrase search also returns the existing generic, ivory, and brown teff flour rows. |
| Teff-related ingredient forms | None of the 119 forms has a teff label or teff match term. |
| New R156 proposal-local source prefix `WP02-A6-RED-TEFF-FLOUR-R156-20261015-S` | Before this proposal was drafted, no match was found in live ledger source IDs or the prior proposal/batch archive. These citations remain proposal-local because no ledger delta is recommended. |

The only earlier archive hit for the exact phrase **Red Teff Flour** is WP02 A7's [R52 teff-meal boundary review](wp02-a7-teff-meal-semoule-boundary-review-20261013-round52.md), which cites VANA's sack only to distinguish a flour product from a possible meal/semolina product. It did not decide red-versus-brown equivalence or French naming. Its proposal-local VANA citation, `WP02-A7-TEFF-SEMOLINA-20261013-R52-S05`, is reused by reference as [A1], not reallocated. The [R151 brown-teff proposal](wp02-a6-next-regional-flour-gap-review-r151-20261015.md) and integrated brown row establish the current Brown Teff Flour owner, but do not evaluate a red product. No focused red-teff-flour review or hold was found.

The R156 source IDs below are unallocated and unique to this proposal. Existing R151 brown-teff ledger sources are cited by reference only; no source object is duplicated. No candidate ID, form ID, observation ID, substitution-finding ID, recipe-link ID, or active ledger record is proposed.

## Static picker projection

The current projection uses phrase-first matching and substring fallback over references and attached forms, following [IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It is a static projection, not runtime picker testing.

| Query | Current result | Result with this hold |
|---|---|---|
| `red teff flour`; `farine de teff rouge`; `red teff`; `teff rouge` | No result | No result; catalog stays unchanged. |
| `brown teff flour`; `farine de teff brun` | `ingredient-ref-brown-teff-flour` | Unchanged; red terms are not routed to Brown Teff Flour. |
| `teff flour`; `farine de teff` | `ingredient-ref-teff-flour`, `ingredient-ref-ivory-teff-flour`, `ingredient-ref-brown-teff-flour` | Unchanged. |
| `teff` | `ingredient-ref-teff-grain`, `ingredient-ref-teff-flour`, `ingredient-ref-ivory-teff-flour`, `ingredient-ref-brown-teff-flour` | Unchanged. |

If a separate red identity is later confirmed, `red teff flour` and a supported French display would add one result to their exact queries and one to broad `teff flour` / `farine de teff` queries. If a supplier instead confirms equivalence with brown teff, an alias could be reconsidered then. Neither mapping is safe now.

## Manifest-wide recipe and ingredient-row scan

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned for `red teff flour`, `farine de teff rouge`, `teff rouge`, `red teff`, `teff red flour`, red/brown or `qey`/`quey` variants, the existing Brown Teff Flour wording, and the candidate/existing teff IDs. The scan found:

- zero recipe-file text hits for the candidate or red/brown teff flour terms;
- zero ingredient-row text hits;
- zero links to `ingredient-ref-red-teff-flour`, `ingredient-ref-teff-flour`, `ingredient-ref-brown-teff-flour`, `ingredient-ref-ivory-teff-flour`, or `ingredient-ref-teff-grain`.

No bundled recipe establishes demand, a recipe amount, or a link. The manifest-ordered corpus snapshot is **753,928 bytes**, SHA-256 **0df2f62ecfcbe187141ea54b7c12d70ddb7a70040a132b84985f17cb9e9bc143**. The fingerprint hashes each manifest-relative recipe path, a NUL byte, exact recipe bytes, and a trailing NUL byte in manifest order.

## Measures, conversions, and substitutions

- **Forms:** Add none. Milling is the product identity under review, not a grain-preparation form.
- **Measures and density:** VANA's 20 lb / 9.08 kg sack and BHA's 500 g package are package quantities, not household measures or mass-volume pairs. No density or kitchen measure is supported. [A1, S03]
- **Conversions and yields:** Do not derive grain-to-flour yield, cooking yield, or a color conversion from product labels or teff studies.
- **Substitutions:** Add no active rule. BHA describes pancakes and crêpes, and VANA references injera generally; neither source supplies a tested replacement ratio for the specific Canadian red-flour product. [A1, S03]

## Source register

Sources were checked on **2026-10-15**. Direct source URLs are included for review.

| ID | Source and locator | Supports and limits |
|---|---|---|
| **A1 — reused proposal-local citation** | VANA Africa, [current Calgary catalogue](https://vanaafrica.ca/); see the Red Teff Flour product section and own-label statement. Existing citation: `WP02-A7-TEFF-SEMOLINA-20261013-R52-S05`. | Names a 20 lb Red Teff Flour product, describes its English and Amharic pack wording, and says VANA mills and bags teff under its own label in Calgary. Supports Canadian product naming and seller context. It gives no French name, source-grain color standard, brown-teff equivalence, household measure, or recipe ratio. The existing source ID remains a proposal-local citation and is not a ledger record. |
| **A2 — existing brown identity** | [WP02 A6 R151 Brown Teff Flour review](wp02-a6-next-regional-flour-gap-review-r151-20261015.md) and its linked integration record. | The existing Ontario product is accepted as `brown teff flour / farine de teff brun`. Its sources establish that seller's name, not equivalence with VANA's red product. Reuse the existing R151 ledger sources; do not duplicate them. |
| **S01** | Zula Market, [Mama Brown Teff Flour](https://zulamarket.ca/products/mama-brown-teff-flour), product title, sale status, and description. | Toronto seller page titled `Mama Brown Teff Flour`; the page showed sold out. Its description calls the offering `Red/Brown Teff Flour`, then distinguishes red and brown by shade. This documents Canadian seller wording variability; it does not supply a current separate red SKU, a stable classification, or a mapping to VANA/Berhan. |
| **S02** | R&R Teff, [Ethiopian Brown Teff Flour](https://www.rrteff.co.uk/store/product/b-%E1%89%80%E1%8B%AD-%E1%8C%A4%E1%8D%8D-ethiopian-brown-teff-flour-gluten-free-1kg), product title and indexed description. | The indexed page title says Ethiopian Brown Teff Flour and its description says Red Teff Flour. Direct retrieval returned HTTP 403, so this is a limited, source-specific indexed wording observation, not proof of equivalence. |
| **S03** | BHA, [Farine complète de teff rouge](https://bekele-ha.fr/produit/farine-complete-de-teff-rouge/), page heading, product description, and sibling listing. | Names a French-market `Farine complète de teff rouge` and a sibling `Farine complète de teff blanc`; the red product is described as teff cultivated in Spain and packed in France. This does not establish a Canadian/Québec label, omit the whole-grain qualifier, or identify VANA's grain class. |
| **S04** | OQLF, [tef (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8480763/tef), definition, orthography note, and English translations. | Defines the base cereal term `tef`, marks that spelling non-current, and lists English `teff`. It does not define teff flour or a red/brown French product name. |
| **S05** | Reta et al., [Polyphenol and flavonoid content in major Teff varieties in Amhara Region, Ethiopia](https://journals.plos.org/plosone/article?id=10.1371%2Fjournal.pone.0272010), *PLOS ONE* 17(8), e0272010 (2022), variety description and sample groups. | This primary study treats `Red teff` and `Brown (mixed) teff` as separate sample groups, and describes Brown (mixed) / sergegna as a mixture of white and red grains. It supports a distinction in this study's Ethiopian sample taxonomy only; it does not classify VANA's retail flour or establish an international market standard. |

## Review-only static checks

The live package, ownership, source-ID, archive, picker, and manifest scans above are read-only. This proposal does not require app, Gradle, unit, instrumentation, emulator, or deployment tests because no database JSON or application code is changed.
