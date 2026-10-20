# WP02 B2/B3 follow-up — yam starch and Québec French naming

- **Reviewed:** 2026-10-10
- **Status:** Root reviewed the packet and recorded `candidate-yam-starch` as held in the research ledger. No canonical ingredient reference, form, recipe, or generated catalog row was added.
- **Scope:** The unresolved identity and Québec French name for starch isolated from edible yam tubers in the genus *Dioscorea*. This is a starch-side boundary review; it does not reopen the accepted single-source yam-flour row, the sweet-potato-flour decision, or the Xanthosoma/Colocasia corm-flour and starch reviews.
- **Source IDs:** `WP02-YAM-STARCH-BOUNDARY-20261010-S01` through `S06`; recorded on `candidate-yam-starch` in the research ledger.

## Recommendation

**Hold a new `yam starch` catalog identity pending independent Québec French review and a clearer product boundary.** Primary food research distinguishes flour milled from dried *Dioscorea* tubers from starch isolated from the tuber mash. A current non-Canadian supplier page also lists a product named `Yam Starch`, but does not identify its yam species. The English product phrase is therefore attested, while this review found no exact Québec product label for the isolated starch. [S03–S05]

The working name for review is **EN `yam starch` / proposed fr-CA `fécule d’igname`**. OQLF identifies `igname` with *Dioscorea* and distinguishes it from sweet potato; OQLF also says `fécule` is the more specific term for starch in tubers or other underground organs. Those entries support a transparent French construction, but neither approves the compound as a Québec ingredient name. A New Caledonian technical/culinary guide uses `fécule d’igname`; that regional wording is not Québec product evidence. Keep the candidate out of the canonical catalog until the exact French display and the scope of the unqualified English product are reviewed. [S01–S02, S06]

| Candidate | Working wording for reviewer only | Disposition |
|---|---|---|
| Starch isolated from edible *Dioscorea* tubers | EN `yam starch`; proposed fr-CA `fécule d’igname` | **Hold.** Do not reserve an ID or add a row. If later accepted, consider `ingredient-ref-yam-starch` in `FLOUR_AND_STARCH`, subject to fresh catalog and recipe audits. |
| `amidon d’igname` | French source wording / literal alternative | Keep as a search phrase only during review. OQLF’s `amidon` entry notes that `fécule` more specifically denotes starch from tubers and underground organs; no exact Québec product label was found for either compound. |
| `arrow-root de Guyane` | Regional wording mentioned in a New Caledonian guide | Do not add as an alias to this candidate or to the existing broad arrow-root identity. The guide does not establish a Québec name or a safe equivalence across all products called yam starch and arrow-root. |

## Identity boundary and exclusions

The candidate is the separated starch fraction, not the whole dried-and-milled tuber. In a primary study of *Dioscorea alata*, flour was made by drying and milling peeled tubers, while starch was extracted from mashed yam before drying; the study treats them as separate products and reports different laboratory properties. This supports keeping any future yam-starch identity separate from the existing `yam flour / farine d’igname` row. It does not justify a starch alias on the flour row or a flour alias on a starch row. [S03]

Keep the following outside this candidate’s global aliases or forms:

- `yam`, `igname`, `yam flour`, `farine d’igname`, `elubo`, `amala`, `poundo yam`, and composite or instant pounded-yam products. These refer to the root, a whole-tuber flour, a prepared food, or a product family; prior yam-flour decisions remain unchanged.
- `water yam starch`, `purple yam starch`, and `Chinese yam starch`. These source-qualified phrases should remain attached to their exact source/species when a product is reviewed; the studies show that different yam varieties can have different starch structures and processing properties. Do not treat these names as proven synonyms for a single uniform product.
- `arrowroot`, `arrow-root`, `arrowroot starch`, `kudzu/kuzu starch`, `tapioca/cassava starch`, `potato starch`, sweet-potato starch, taro starch, or Xanthosoma starch. These are separate source/product classes in the current catalog or separate held candidates. The regional phrase `arrow-root de Guyane` does not authorize cross-aliasing.
- `yam powder` or `yam flour` when the product source does not say whether it retains the whole tuber or is purified starch. Do not interpret unqualified “powder” as an extraction process.
- `native`, modified, pregelatinized, instant, or precooked starch labels. A future source must identify both the yam source and product state before any such form is considered.

The *Dioscorea* genus includes many edible species and market/product wording is not always species-qualified. This packet uses a broad *Dioscorea* working boundary only to assess the English product phrase; it does not assert that starch from every species, cultivar, or processing route has interchangeable culinary behavior. If a Québec package names a species, preserve that scope in a focused follow-up rather than silently broadening this held candidate.

## Current catalog, collision, and recipe audit

The read-only snapshot inspected **887 ingredient references, 48 forms, 1,132 research-ledger records, 77 legacy candidates, and 114 manifest-listed recipes / 1,123 ingredient rows**. The recipe-corpus fingerprint is `6b0df96f2f4c672f88ec6670857c493f7f1cbb1c441432d1c9365e14a6145c14`, calculated in manifest order over each recipe-relative path, a NUL byte, exact file bytes, and a trailing NUL byte. These counts and search findings describe the workspace snapshot on 2026-10-10; shared catalog files may change as other reviewed work is integrated.

| Surface | Finding | Consequence |
|---|---|---|
| Related active references | `ingredient-ref-yam` is `true yam / igname`; `ingredient-ref-yam-flour` is `yam flour / farine d’igname`; `ingredient-ref-ube-halaya` is `ube halaya (purple yam jam) / confiture d’ube (ube halaya)`. The catalog separately has `sweet potato starch / fécule de patate douce` and `arrowroot / arrow-root`, whose product aliases already include `arrowroot starch`, `arrowroot flour`, `arrowroot powder`, `farine d’arrow-root`, and `fécule d’arrow-root`. | Preserve root, whole-tuber flour, jam, and extracted-starch boundaries. Keep “arrowroot” search results separate. |
| Exact phrase search | No active reference, form, legacy candidate, or ledger decision owns `yam starch`, `Dioscorea starch`, `Dioscorea alata starch`, `water yam starch`, `purple yam starch`, `Chinese yam starch`, `fécule d’igname`, or `amidon d’igname`; no proposed starch ID exists. | No current alias should be migrated or reassigned. |
| Existing picker collisions | `yam` returns the true-yam root, yam flour, and ube-halaya jam; `igname` returns the true-yam root and yam flour. `yam starch`, `fécule d’igname`, `amidon d’igname`, and `arrow-root de Guyane` have no current result. `arrow-root` resolves to the existing arrow-root reference. | Do not add bare `yam` or `igname` aliases. If the candidate is accepted later, test the more specific phrases while preserving these broader results. |
| Recipe corpus | Exact normalized-phrase checks over all recipe JSON text and ingredient rows found **zero** matches for `yam starch`, `starch from yam`, `Dioscorea starch`, `Dioscorea alata starch`, `water yam starch`, `purple yam starch`, `Chinese yam starch`, `amidon d’igname`, `amidon d'igname`, `fécule d’igname`, `fécule d'igname`, and `arrow-root de Guyane`. | No current recipe link, relink, quantity, form, or recipe-specific substitution is supported. |

The existing `wp02-regional-root-flour-boundaries-20261010.md` accepts a single-source yam-flour identity and excludes isolated starch; it does not decide a starch row or its French name. Existing regional-starch proposals cover arrow-root, kudzu, water chestnut, mung bean, lotus root, sweet-potato, taro, Xanthosoma, and named cassava products; this packet does not reopen those decisions. The exact-name and source-ID review found no prior focused yam-starch proposal or collision for the new source-ID prefix.

## Measures, forms, yields, and substitutions

- **Density and unit mappings:** Leave `defaultDensity` null and `unitMappings` empty. The supplier page reports a bulk density of `0.58 g/cm³` but gives no test method, packing condition, named species, or evidence that this is a kitchen volume-to-mass basis. It also describes a 1 kg package; package mass does not supply a household measure. Do not use either statement as a transferable density or unit mapping. [S05]
- **Forms and conversions:** Add no `IngredientForm` and no conversion. The supplier’s “white powder” description does not establish a recipe-level form. Primary studies report laboratory composition and functionality for specific samples; these results do not identify a generally available native/modified form or a kitchen conversion. [S03–S05]
- **Extraction yield:** The New Caledonian guide describes extraction and reports 8–15% starch yield by fresh yam mass for its cited methods and species, with purity figures for those extraction trials. These are process-specific research/technical observations, not a culinary preparation yield or a conversion between a recipe quantity of fresh yam and packaged starch. Keep them inactive. [S06]
- **Substitutions:** Add no global or contextual substitution. The supplier page describes thickening use and blending with wheat flour without giving a validated recipe amount; laboratory food applications or a product-use claim do not establish a general starch-for-starch or starch-for-flour ratio. Substitution research for the candidate remains `not_yet_researched`. [S03–S05]
- **Recipe links:** None. The exact bundled recipe scan found no candidate ingredient line.

## Proposed catalog delta and no-op boundaries

**Canonical catalog delta: none.** Root recorded the held identity and its sources as `candidate-yam-starch` in the research ledger. No reference, form, recipe, or generated catalog row was added.

If independent Québec review later validates the product name and unqualified scope, a coordinator may consider a new identity-only row with EN `yam starch`, the reviewer-approved fr-CA display, `category: FLOUR_AND_STARCH`, `defaultDensity: null`, and `unitMappings: []`. Do not pre-allocate `ingredient-ref-yam-starch`. Add no aliases unless each has product-level evidence and clears the active collisions above. Keep forms, recipe links, conversions, yield mappings, and substitution rules empty unless separate evidence supports them.

## Acceptance checks for any later integration

1. Have an independent Québec terminology reviewer confirm the exact fr-CA display for isolated yam starch. If the reviewer prefers a term other than `fécule d’igname`, use that reviewed term; do not treat the OQLF’s compositional guidance as a product-name ruling.
2. Confirm that a product source describes isolated starch rather than whole-tuber flour, a composite, a prepared yam paste, or an unspecified powder. Record species or cultivar only when the source names it.
3. Add a new `FLOUR_AND_STARCH` reference only if the candidate’s name and scope are accepted. Keep bare `yam`, `igname`, `yam flour`, and all other source names out of aliases.
4. Verify exact English/French picker results for the accepted phrase and confirm `yam`, `igname`, `yam flour`, `arrow-root`, and `arrow-root de Guyane` retain their documented boundaries.
5. Keep density null, unit mappings empty, forms absent, and conversion/yield/substitution data inactive unless separately researched for the accepted product and method. Do not infer household values from the supplier’s bulk-density claim or 1 kg package size.
6. Re-scan the then-current manifest recipe corpus before adding any line link or recipe-specific evidence; the present snapshot has zero candidate-line hits.

## Source register

All online sources below were accessed 2026-10-10. Source IDs are local to this proposal and are not ledger entries.

| ID | Source and evidence limit |
|---|---|
| **S01** | Office québécois de la langue française, [igname (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2082772/igname), last updated 1991. Gives preferred Québec French `igname`, English `yam`, and Latin `Dioscorea`; distinguishes yams from sweet potatoes. It names the plant/root, not a starch product. |
| **S02** | Office québécois de la langue française, [amidon (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), last updated 2026. Prefers generic `amidon` and says `fécule` is more specific for starch in tubers or other underground organs. It does not list `fécule d’igname` or `amidon d’igname` as an approved product term. |
| **S03** | R. M. L. Alves, M. V. E. Grossmann, and R. S. S. F. Silva, [“Chemical and Functional Characterization of Products Obtained from Yam Tubers”](https://doi.org/10.1002/1521-379X%28200210%2954%3A10%3C476%3A%3AAID-STAR476%3E3.0.CO%3B2-6), *Starch/Stärke* 54(10), 2002. Primary study of *Dioscorea alata* flour, starch, and mucilage; distinguishes dried/milled whole-tuber flour from starch extracted from mashed yam. Laboratory processing and properties do not establish household conversions or substitution rules. |
| **S04** | Kui Lu et al., [“Structure and Functional Properties of Purple Yam (*Dioscorea alata* L.) Starch from China”](https://doi.org/10.1002/star.202100310), *Starch/Stärke* 74(5–6), 2022. Primary comparison of purple-yam starch with starches from other yam varieties; reports different structural and functional properties. Sample characterization is not a retail grade or kitchen measure. |
| **S05** | Sinochem Nanjing, [Yam Starch product page](https://www.sinochem-nanjing.com/products/plant-extracts/yam-starch.html), current page, no publication date shown. The page title and product table use `Yam Starch` and state “Source: Yam tubers”; it does not name a species or provide a Québec/Canadian product label. Its package and bulk-density claims are recorded only as vendor statements; no measurement method is given, so no catalog numeric value is imported. |
| **S06** | Association pour la Promotion Et la Transformation des Tubercules InterTropicaux (A.P.E.T.T.I.T.), [*L’igname sous toutes ses formes, volume 1* (third edition)](https://www.apettit.nc/wp-content/uploads/recettes-igname-guide-culinaire.pdf), especially pp. 67–69. Regional New Caledonian guide uses `fécule d’igname`, distinguishes it from whole-tuber flour, and describes extraction and species/method-specific yields. It is not Québec terminology authority; its `arrow-root de Guyane` wording is not accepted as a global alias or a botanical crosswalk. |

## Explicit exclusions

This proposal does not complete the open WP02 B2/B3 checklist. It makes no decision on other starch sources, Québec French names for existing held candidates, and the identity of `yam flour` beyond preserving the already accepted row. It adds no canonical reference, density/unit mapping, forms, conversions, yield mapping, recipe links, or substitutions. The held candidate and its source register are recorded in the research ledger.
