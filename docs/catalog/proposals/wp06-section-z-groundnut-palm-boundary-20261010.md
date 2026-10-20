# WP06 Section Z — African groundnut paste and red palm oil boundary review

- **Date:** 2026-10-10
- **Status:** Proposal-only no-change disposition. This review recommends no new catalog row and no global alias. The plan and roadmap now link this review; no catalog, ledger, recipe, code, or test file changed.
- **Scope:** West African groundnut/peanut pastes and African red-palm-oil names, bounded to evidence from Ghana and Nigeria plus FAO and OQLF product definitions. It does not claim a continent-wide product standard.
- **Decision owner:** Coordinator. Recheck the live package before any later alias or identity integration.

## Recommendation

Do not add a distinct global `groundnut paste` identity or add `groundnut paste` / `peanut paste` as global aliases of active `ingredient-ref-peanut-butter`. Ghanaian product labels and maker pages show that some locally sold groundnut pastes are explicitly marketed as peanut butter and made only from roasted groundnuts; one maker specifies dry-roasted groundnuts. Nigerian institutional processing material also uses “paste” for a groundnut-processing intermediate before oil extraction, while separately describing edible groundnut butter. The phrase alone therefore does not identify one product state across sources. Keep it as source-local recipe or product wording. If a future recipe names a particular Ghanaian product that its own label calls “peanut butter” or identifies as a spread made from roasted groundnuts, review that line against the active peanut-butter identity; do not generalize the result to every groundnut paste.

Do not attach generic `red palm oil`, `red oil`, `huile de palme rouge`, or Ghanaian `zomi` / `dzomi` / `amidze` as global aliases to active `ingredient-ref-crude-palm-oil`. African sources agree that edible palm oil comes from the fruit pulp and that crude/unrefined palm oil may be red, but the names do not consistently encode processing state. Ghanaian sources variously use `zomi` as a local palm-oil name or distinguish a salted and spiced `zomi` product from virgin/crude palm oil. Keep these terms source-local. A recipe with an explicitly sourced crude red palm oil may be reviewed against the existing crude-oil row; the evidence here does not support a universal alias or a separate new identity.

No density, unit mapping, form, yield, conversion, or substitution is proposed.

## Section Z and prior-work boundary

Section Z still lists West/Central African red-palm preparations and groundnut pastes as open. The existing African gap sweep recorded red palm oil as a boundary near active crude palm oil and treated the African peanut-stew recipe’s peanut-butter line as recipe context. It did not resolve either product question. This proposal addresses those two boundaries only; the broader African condiment checklist stays open.

Relevant prior decisions remain in force:

- **Peanut and peanut butter:** The WP03 tree-nut review keeps `ingredient-ref-peanuts` / `peanuts` / `arachides` separate from `ingredient-ref-peanut-butter` / `peanut butter` / `beurre d'arachide`. It also records that legacy `ingredient-ref-natural-peanut-butter` duplicates the active `natural peanut butter` alias, while peanut-butter chips and peanut oil remain separate legacy candidates. See `docs/catalog/proposals/wp03-tree-nuts-coordinator-review-20261009.md`.
- **Crude palm oil:** WP06 integrated `ingredient-ref-crude-palm-oil` as `crude palm oil (azeite de dendê)` / `huile de palme brute (azeite de dendê)`, category `FAT_AND_OIL`, with no aliases. Anvisa’s Brazilian denomination supports `azeite de dendê` as crude palm oil or fat; the integration keeps refined palm oil, palm-kernel oil, and palm fractions separate. See `docs/catalog/batches/wp06-crude-palm-oil-identity-20261009/README.md`.
- **Other African review:** `docs/catalog/proposals/wp06-african-cuisine-gap-sweep-20261010.md` marks `red palm oil` as a semantic neighbor of the active crude-oil row and does not create a new row. Its peanut-stew note does not equate regional groundnut pastes with peanut butter.

The sources in this proposal are new proposal-local evidence. The prefix `WP06-GROUNDPALM-20261010-S` was absent from the live ledger, proposal files, and batch files before drafting. No source IDs are registered in the ledger.

## Live package snapshot

Counts and hashes below were refreshed from the live worktree on 2026-10-10. SHA-256 covers exact file bytes. The recipe aggregate follows `manifest.recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, the exact recipe bytes, and another NUL byte.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 703 references | 222,185 | `424578020c8f6d75f2bd2025f5a6abc17d379d681eaeffcdf8a5ea94e103cc39` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 34 forms | 23,272 | `904bd11af25889fd9e03baa3a4fa5afe9a772f2349f3044eea763ff1f5826938` |
| `docs/catalog/legacy-import-identities.v1.json` | 84 candidates | 20,087 | `454d11ebf0a39dbc0584242eb9736c9009c00bc1bbd57f85b42e4ad1f7ecd36d` |
| `docs/catalog/research-ledger.v1.json` | 892 records; 1,682 source entries; 1,388 distinct source IDs | 1,814,626 | `cfc06a40c19721554aef2ab8a6ab39dbdd4302cf502907acb5debd28710a70fe` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient lines | — | `921fe260478d90251440fbb082d7b30be5828bfaddeaee67fe42541963aaa629` |

### Active and draft records

| Current record | Live name / aliases | State relevant to this review |
|---|---|---|
| `ingredient-ref-peanut-butter` | `peanut butter` / `beurre d'arachide`; EN aliases `natural peanut butter`, `smooth peanut butter`; FR aliases `beurre d'arachide naturel`, `beurre d'arachide crémeux` | Active `FAT_AND_OIL` reference; no density or unit mappings. The ledger identity is still `unreviewed`, with measurement `blocked_pending_evidence` and no source entries. |
| `ingredient-ref-peanuts` | `peanuts` / `arachides`; FR aliases `cacahuète`, `cacahouète` | Separate active `NUT_SEED_AND_DRIED_FRUIT` kernel identity; its ledger identity is verified with OQLF, CFIA, and Health Canada sources. |
| `ingredient-ref-crude-palm-oil` | `crude palm oil (azeite de dendê)` / `huile de palme brute (azeite de dendê)`; no aliases | Active `FAT_AND_OIL` identity; no density or unit mappings. Its ledger identity is verified from the Brazilian/OQLF/Codex sources in the cited integration batch; measurement and substitution research remain not yet researched. |

No live form label or form match term exactly names groundnut paste, peanut paste, red palm oil, or zomi. The legacy file contains `ingredient-ref-natural-peanut-butter` (the alias duplicate noted above), `ingredient-ref-peanut-butter-chips`, and `ingredient-ref-peanut-oil`; it contains no groundnut-paste or red-palm-oil candidate. The live ledger has no record for a groundnut-paste, red-palm-oil, or zomi identity.

## Recipe demand audit

All 114 manifest-listed recipe files and all 1,123 `ingredients[]` records were scanned. Candidate phrases were compared as normalized whole phrases across ingredient names/text and serialized recipe content. The scan covered `groundnut paste`, `groundnut butter`, `peanut paste`, `pâte d'arachide`, `peanut butter`, `red palm oil`, `red oil`, `huile de palme rouge`, `huile rouge de palme`, `zomi`, `dzomi`, `amidze`, `crude palm oil`, and the active Brazilian name `azeite de dendê`.

- There are **seven linked peanut-butter lines**: `001#9`, `020#10`, `022#1`, `031#5`, `067#3`, `090#2`, and `095#11`.
- There are **two linked whole-peanut lines**: `031#6` and `085#9`.
- Recipe `090`, *Ragoût aux arachides africain / African Peanut Stew*, also has the unlinked garnish `peanuts and fresh cilantro, for garnish` at `090#17`. Its ingredient `1/2 cup natural creamy peanut butter` at `090#2` is linked to `ingredient-ref-peanut-butter`.
- There are **zero** ingredient-line or full-recipe matches for groundnut paste, peanut paste, groundnut butter, red palm oil, red oil, zomi/dzomi/amidze, crude palm oil, or azeite de dendê. No recipe calls for an African paste product or a palm-oil product in this scan.

Recipe 090 is an authored recipe from Cotter Crunch and already calls its ingredient natural creamy peanut butter. It establishes only that recipe line and its linked ID. It does not identify a Ghanaian, Nigerian, or other source-market groundnut paste; the peanut garnish is a separate whole-kernel ingredient. Neither line supports a global paste alias or a palm-oil decision.

## Normalized-key and product-boundary review

The exact-key audit follows `normalizeIngredientSearchKey` in `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: lowercase, NFKD, fold `œ` / `æ` / `ß`, expand `&`, remove combining marks, replace non-ASCII alphanumeric runs with spaces, then trim and collapse whitespace. Exact names and aliases were checked against active references, form search terms, and legacy candidates. Phrase-level neighbors are listed separately because picker search can return complete-phrase or partial matches.

| Query / boundary | Exact live result | Disposition |
|---|---|---|
| `groundnut paste`, `groundnuts paste`, `groundnut butter`, `peanut paste`, `pâte d'arachide` | No exact active reference, form, or legacy match. | Do not add one global alias or a separate reference from these terms alone. Product pages and labels vary in what they call the paste; the RMRDC page also uses paste for an intermediate before oil extraction. |
| `peanut butter`, `natural peanut butter`, `smooth peanut butter` | Exact active owner is `ingredient-ref-peanut-butter`. The legacy natural-peanut-butter candidate duplicates its active alias. | Keep current identity and alias set. Do not create a separate natural/groundnut paste row. Keep peanut-butter chips and peanut oil outside this identity. |
| `peanuts`, `arachides` | Exact active owner is `ingredient-ref-peanuts`. | Keep whole kernels separate from peanut butter or any oil-extracted material. |
| `red palm oil`, `red oil`, `huile de palme rouge`, `huile rouge de palme`, `zomi`, `dzomi`, `amidze` | No exact active reference, form, or legacy-key match. | Do not attach these as global aliases to crude palm oil. `zomi` is not stable across the Ghanaian sources reviewed, and the catalog has no locale or product-state scope on an alias. |
| `crude palm oil`, `huile de palme brute`, `azeite de dendê` | Exact owner is `ingredient-ref-crude-palm-oil` through its bilingual display. | Keep the existing crude-oil identity. No African alias is added. |
| `palm oil`, `huile de palme` | Phrase-level result includes the existing crude-palm-oil row because its bilingual display contains these phrases. No separate generic/refined or palm-kernel identity matched in the audited terms. | Preserve the explicit `crude` qualifier in the display; a general oil phrase does not prove a crude/refined state. |

The matching result is limited to the current package snapshot. Repeat the audit before integration if catalog names, forms, aliases, or recipe files change.

## Evidence and dispositions

“Accepted” here means an evidence-bounded coordinator disposition, not a catalog edit.

| Term or product | Disposition | Evidence-based boundary |
|---|---|---|
| Ghanaian `groundnut paste` explicitly sold on a maker page as `peanut butter` and made from 100% roasted groundnut | **Accept only as product-specific use of the existing peanut-butter identity when the exact product source states that equivalence.** | Two Ghanaian maker pages explicitly pair the names for their products and list only roasted groundnut/peanut. This supports those specific product pages, not a global synonym for every market use of `groundnut paste` [S03–S04]. |
| Generic `groundnut paste`, `groundnut butter`, `peanut paste`, `pâte d'arachide` | **Hold as a global alias; do not create a second identity.** | Ghana’s Ministry of Food and Agriculture agro-processing list, which cites the Food and Drugs Authority as its source, lists groundnut paste, creamy groundnut butter, natural peanut butter, and other spreads without formulas. A separate Ghanaian procurement notice lists groundnut paste as an item. Nigeria’s RMRDC account uses grinding/pasting as an oil-processing step before extraction and describes groundnut butter separately [S01–S02, S11]. The exact term does not encode enough product state for a global mapping. |
| `red palm oil` / `huile de palme rouge` / `red oil` | **Hold as global aliases; no new identity.** | OQLF describes palm oil as oil from fruit pulp and notes natural red/orange colour, but does not define crude processing. NAFDAC’s palm-oil regulation also names carotenoids for “red palm oil” within a broad palm-oil schedule, without equating the term to crude or to one food-market product [S06–S07]. FAO describes crude palm oil as the product after fruit mashing and pressing, followed by possible refining [S05]. These sources clarify neighboring states but do not set one universal alias crosswalk. |
| Ghanaian `zomi`, `dzomi`, `amidze` | **Hold source-local; no global alias and no new identity from this packet.** | The Ghana News Agency uses these as Ewe names for palm oil. Ghana’s official product directory and procurement records list Zomi as a named palm-oil product. A KNUST thesis describes zomi as salted and spiced, in contrast to virgin/crude orange-red palm oil; a University of Ghana dissertation separately discusses salted zomi and unsalted red palm oil, while calling its zomi sample crude/unrefined. The sources therefore do not support an unqualified, stable alias relationship [S02, S08–S11]. |
| A future source explicitly identifying a product as crude red palm oil from oil-palm fruit pulp, without a separate salted/spiced preparation | **Review against the existing crude-palm-oil row only for that source and recipe.** | FAO’s processing definition and the NAFDAC/OQLF oil-source boundaries support a possible product-state match when the exact source says crude/unrefined. They do not justify adding a global `red palm oil` alias or mapping all zomi products [S05–S07]. |
| Refined palm oil, palm-kernel oil, palm olein/stearin, salted/spiced zomi | **Keep separate from the active crude-palm-oil identity unless exact source evidence says otherwise.** | The crude-oil integration already preserves the palm-fruit/palm-kernel and refined/fraction boundaries. Ghana product sources show that named `zomi` can include salt/spices or be used as a local name for palm oil; do not erase that product-state information [S02, S05, S08–S09]. |

## Sources

Sources were checked or indexed on 2026-10-10. They support only the specific market, institution, product, or definition described; they do not set a pan-African standard.

| ID | Source | Claim used and limit |
|---|---|---|
| **WP06-GROUNDPALM-20261010-S01** | Nigeria Raw Materials Research and Development Council (RMRDC), [Groundnut — Raw Material Details](https://library.rmrdc.gov.ng/raw_details.php?id=81) | Describes roasted, polished groundnut being ground/pasted before an oil-extraction step, then separately discusses groundnut butter made from roasted nuts. Institutional processing context; the page does not define all retail uses of `groundnut paste`. |
| **WP06-GROUNDPALM-20261010-S02** | Ghana Ministry of Food and Agriculture, [Agriculture in Ghana — Facts & Figures 2020](https://mofa.gov.gh/site/images/pdf/2020%20Agriculture%20In%20Ghana%20Facts%20%26%20Figures_%20MASTER.pdf), PDF pp. 87–88 and 95–97, agro-processing firm/product listing sourced to the Food and Drugs Authority | Lists Ghanaian palm-oil products under regular/Zomi names and groundnut products under distinct labels including groundnut paste, creamy groundnut butter, natural peanut butter, and crunchy peanut butter. This establishes multiple market labels, not ingredient formulas or synonymy. |
| **WP06-GROUNDPALM-20261010-S03** | Mom’s Delight, [Peanut Butter](https://www.momsdelightgh.com/) | Maker page describes its own product as natural groundnut paste made from roasted groundnuts and lists it as 100% groundnut. Product-specific evidence only; not a category-wide standard. |
| **WP06-GROUNDPALM-20261010-S04** | Nudula, [Butters](https://nudula.com/butters/) | Ghanaian producer labels one item `Groundnut Paste (Peanut Butter)`, describes it as made from ground dry-roasted groundnut, and lists groundnut/peanut as its ingredient. Product-specific equivalence, not a universal alias rule. |
| **WP06-GROUNDPALM-20261010-S05** | Kwasi Poku, FAO, [Small-Scale Palm Oil Processing in Africa](https://www.fao.org/4/y4355e/y4355e00.htm), Agricultural Services Bulletin 148 (2002), ch. 3 | Explains that mashing and pressing oil-palm fruit yields crude palm oil, which can then be treated/refined; notes that village-scale African processing supplies crude oil to domestic markets. Technical process evidence; it does not define every local label. |
| **WP06-GROUNDPALM-20261010-S06** | Office québécois de la langue française, [huile de palme (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8408996/huile-de-palme) (updated 2026) | Defines palm oil as oil from oil-palm fruit pulp, gives English `palm oil`, and notes natural palm oil is reddish or orange. It does not specify crude/refined status or validate a regional alias. |
| **WP06-GROUNDPALM-20261010-S07** | Nigerian National Agency for Food and Drug Administration and Control (NAFDAC), [Fats and Oils Regulations 2019](https://www.nafdac.gov.ng/wp-content/uploads/Files/Resources/Regulations/FOOD_REGULATIONS/Fats-and-Oils-Regulations-2019.pdf), section 12 and Twelfth Schedule | Defines palm oil as liquid derived from oil-palm fruit pulp; the palm-oil quality schedule includes a carotenoid factor for red palm oil. The text does not explicitly say `red palm oil` is synonymous with crude palm oil. Regulatory text cited for the product boundary, not as current legal advice. |
| **WP06-GROUNDPALM-20261010-S08** | Jacob Amoako-Mensah, KNUST, [Assessment of the prevalence of palm oil adulteration with Sudan IV dye in the Greater Accra Region](https://ir.knust.edu.gh/server/api/core/bitstreams/3011504e-d8ae-462a-9a39-dd7e09f6644d/content), MSc thesis (2016), §2.12 | Describes Ghana export products as virgin/crude oil and salted/spiced `zomi`; says zomi’s darker colour reflects added spices, salt, and cooking while virgin oil is orange-red. Thesis and Ghana product context; not a universal definition of all zomi. No results on adulteration are used here. |
| **WP06-GROUNDPALM-20261010-S09** | Genevieve Owusua Okyere, University of Ghana, [Determination of the Mutagenicity of Four Vegetable Oils after Heat Treatment](https://ugspace.ug.edu.gh/bitstreams/c04175ea-dfbe-4d6a-8ee7-12f62e08500e/download), MSc dissertation (2013), pp. 60–61 | Distinguishes salted zomi and unsalted red-palm-oil samples; describes the study’s zomi sample as crude/unrefined. One local market/study product description only; no health or safety conclusion from the assay is adopted. |
| **WP06-GROUNDPALM-20261010-S10** | Ghana News Agency, [“Dzomi: The cross-border complement of meals for human survival”](https://gna.org.gh/2025/09/dzomi-the-cross-border-complement-of-meals-for-human-survival/) (2025) | Uses `dzomi`, `zomi`, and `amidze` as Ewe local names for palm oil and describes a Ghanaian oil producer whose product is crude palm oil. Regional feature context; not a terminology standard or a single product formula. |
| **WP06-GROUNDPALM-20261010-S11** | Ghana Electronic Procurement System, [Food items tender, BA/YCH/GD/0060/24](https://www.ghaneps.gov.gh/epps/cft/downloadNoticeForAdvSearch.do?resourceId=1046961) | Institutional purchase list names `palm oil, 25 litres zomi` and separately `groundnut paste`. It corroborates product wording in one Ghanaian procurement; it gives no label ingredients or cross-product equivalence. |

## Next actions

1. At any integration review, refresh the live counts and hashes and repeat the exact normalized-key, legacy, form, ledger, and manifest recipe scans.
2. Keep `ingredient-ref-peanut-butter`, `ingredient-ref-peanuts`, and `ingredient-ref-crude-palm-oil` distinct. Do not promote source-local product names into global aliases from this packet.
3. If a future bundled recipe calls for `groundnut paste`, preserve its authored name and consult its source/product label. Map only a specifically identified peanut-butter product to the active row; hold oil-extracted, composite, or otherwise unspecified paste states for review.
4. If a future bundled recipe calls for `red palm oil` or `zomi`, check the exact source’s fruit part and processing state. A source-explicit crude red oil may be reviewed against the current crude-oil identity. Salted/spiced zomi and unspecified red palm oil remain unmerged until the demanded product is defined.
5. Leave densities, units, forms, yields, conversions, substitutions, and recipe links unchanged unless a separate evidence packet supports the exact product and context.

This proposal closes neither Section Z nor the wider African pantry review.
