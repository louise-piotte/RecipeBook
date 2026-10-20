# WP02 B2/B3 review — Abacha cassava-strip product boundary

- **Reviewed:** 2026-10-11
- **Status:** root-integrated candidate hold; no active ingredient reference, recipe link, or numeric behavior.
- **Scope:** source-named Nigerian/Igbo `Abacha`, a cassava strip/slice product and its boundary with the prepared dish `Abacha Ncha`. This is one candidate within the still-open Section B line for fermented cassava products and other regional starch products (the unchecked line at `docs/RecipeBook-global-ingredient-catalog-plan.txt:1332`); it does not reopen another product review listed below.
- **Inputs reviewed:** `Requirements.md`; the WP02 B2/B3 checklist; active ingredient references and forms; the legacy-import candidate file; research ledger; every existing proposal; and every manifest-listed recipe.
- **Source-ID prefix:** `WP02-ABACHA-STRIPS-20261011-S01`–`S07`. Root added the Canadian French-storefront source as S07; all seven IDs are in the research ledger.
- **Access date:** 2026-10-11.

## Recommendation

**Hold a new canonical identity and do not assign a Québec French display.** Nigerian academic sources support `Abacha` as a distinct cassava strip food: one study calls it fermented strips and distinguishes it from fufu and garri, while another studies dried cassava strips sold in a local market and their rehydration into `Abacha Ncha`. A Canadian retailer also lists a product as `Abacha`. [S01–S03, S05]

The source name is credible for a bounded regional product, but the evidence does not establish one catalog-ready state spanning wet slices, dried strips, rehydrated strips, and the prepared salad. The app requirements call for both `nameFr` and `nameEn`. Root recheck found OsiAfrik’s French-facing Canadian storefront listing `Abacha 227 g`; that supports the unchanged name in Canada-facing French retail, but does not establish Quebec-specific usage or describe the product state. No dedicated OQLF entry or Quebec-specific product label was found. The FAO chapter also uses `tapioca` parenthetically for Abacha and later applies `Abacha` to cocoyam chips; those broad usages are not safe global aliases. **Keep the candidate held until the exact product state and Quebec French display are supported.** [Requirements.md; S02, S04, S06, S07]

| Candidate field | Finding | Disposition |
|---|---|---|
| Source name | `Abacha` names Nigerian cassava strips/slices in technical sources; the product is regionally associated with eastern Nigeria. | Supported as a research candidate, not allocated. |
| English display | `abacha` | Supported as the source name; no active row proposed while bilingual display remains unresolved. |
| Québec French display | OsiAfrik’s French-facing Canadian storefront lists `Abacha` unchanged, but gives no Quebec-local label or product-state description. | Treat `abacha` as a Canadian French-facing candidate, not a final fr-CA display; keep the row held until exact state and Quebec usage are resolved. |
| Product scope | Cassava strips/slices sold dry or used wet/rehydrated; `Abacha Ncha` is a prepared dish made with the strips and other ingredients. | Keep product and prepared dish distinct. The reviewed sources do not settle one selectable form taxonomy. |
| Category / ID | No category or ID assigned. The sources describe strips, not flour or extracted starch. | Reassess category only with a Québec product/recipe source and an exact intended product state. `ingredient-ref-abacha` is unallocated. |
| Aliases | None proposed. | Do not assign `African salad`, `Abacha Ncha`, `tapioca`, generic cassava wording, or broad strip/flakes descriptors as global aliases. |

## Product identity and boundaries

Illoh et al. identify Abacha as dried cassava strips and describe rehydrating the strips before mixing them with `ncha` to prepare `Abacha Ncha`. Dike et al. describe Abacha as fermented strips and distinguish it from fufu, a submerged-fermented porridge, and garri, fermented granules. This supports a named product boundary; it does not establish that every cassava slice or flake is Abacha. [S01–S02]

The FAO chapter reports both wet and dry Abacha slices and describes dried slices used for African salad. It also calls Abacha “tapioca” and, later in the same chapter, uses Abacha for dried cocoyam chips. These contextual usages show that the word can travel across product stages or local meanings; they do not establish a global equivalence. Prefer the narrower cassava-strip identity found in the product-specific studies. [S02, S04]

Keep these product boundaries:

- **Cassava root and edible cassava flour:** the active root reference represents raw root; the active edible-flour reference represents a powder. The OQLF definition of `farine de manioc` is powder obtained by dry grinding cassava roots, not strips or slices. [S06]
- **Tapioca starch and tapioca pearls:** these are separate active identities. The FAO parenthetical `tapioca` does not authorize that collision-prone term as an Abacha alias.
- **Gari/garri:** retain the active gari identity and its English spelling alias. Dike et al. distinguish its fermented granules from Abacha strips. [S01]
- **Lafun, Pupuru, attiéké, and Placali:** retain their existing distinct identities. Their flour, smoked-ball/flour, fermented-granule, and fermented-paste boundaries are recorded in their focused proposals; cassava origin alone does not establish synonymy.
- **Agbelima and Kokonte:** retain their separate held decisions. Their existing proposals do not establish either as Abacha or support a shared alias.
- **Generic fufu/amala/elubo and yam products:** keep the generic families and root-specific flour boundaries unresolved or separate as already recorded. Neither `Abacha` nor `Abacha Ncha` is a synonym for a generic swallow, amala, or yam flour.

The retailer page titled `Abacha - 150g` gives Nigerian origin and says the item is made from cassava, but its copy also uses “African Salad” as a product description. That listing is English-only and based in Cambridge, Ontario; it does not settle a Québec French name or distinguish the dry ingredient from the prepared dish. Treat its 150 g as package size only. [S05]

## Identity, form, measurement, conversion, yield, and substitution states

| Area | State and evidence | Catalog action |
|---|---|---|
| Identity | `needs_clarification` for catalog intake. The Nigerian product identity is supported, but the bilingual display, category, and exact market state are not resolved for a Québec catalog row. | Hold; no reference or aliases. |
| Forms | No forms proposed. Sources describe wet slices, dried strips, rehydrated strips, and the prepared `Abacha Ncha` dish; they do not establish a shared form model for recipe lines. | Add no `wet`, `dried`, `rehydrated`, or cooked form. Identify the exact retail state if a recipe later names Abacha. |
| Measurement | `researched_no_supported_value` for household measures, default density, and unit mappings. The research papers include laboratory tests on samples and particle sizes, not a reusable kitchen volume-to-mass mapping. | Keep density null and unit mappings empty if a future row is approved. |
| Conversion | `not_yet_researched`. The fresh-root/dried-chip study compares processing routes and product quality; it does not establish a generic dry-strip-to-wet-slice ratio or a conversion to flour/starch. | Add no conversion. |
| Yield | `researched_no_supported_value` for a transferable recipe yield. Product-specific study outputs and package weights are not a general preparation yield or serving basis. | Add no yield or package mapping. |
| Substitution | `not_yet_researched`. No reviewed source tests Abacha as an interchangeable ingredient with cassava flour, tapioca, gari, lafun, Pupuru, attiéké, Placali, fufu, or another starch. | Add no global or contextual substitution rule. |
| Recipe links | No exact Abacha demand in the bundled corpus. | Add no recipe link. |

## Current catalog, collision, and recipe audit

Read-only snapshot taken from the shared worktree on 2026-10-11. These counts and hashes are point-in-time observations; concurrent catalog work may change them.

| Surface | Current snapshot |
|---|---:|
| Active ingredient references | 942; SHA-256 `99dd50dfaeca7ff39689aa5578db70cdfedefcb4aad73d4668ec2a9513205e46` |
| Active ingredient forms | 53; SHA-256 `540eba0619c98e5b8fed5a3e1e3c808dd7f9e511940b1271707c55d14daf987a` |
| Legacy import candidates | 75; SHA-256 `e4d72caab8c2dd6cced0015a07bd99dde535463e30f44ca48653c7bd38366de0` |
| Research-ledger records | 1,207; SHA-256 `cb176b4d3b838cee50d3e666a76c6dd0324ed78c4ffba8c5a853ddf1bae64a22` |
| Existing proposal files | 364 Markdown files |
| Manifest-listed recipes / ingredient rows | 114 / 1,123; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; ordered recipe fingerprint `dee5000fb394b175451cee5f57d194cb2db46d7df15dd94337920470a39c623c` |

Search-key behavior was checked against `IngredientSearch.kt`: normalize case, accents, punctuation, and whitespace; prefer complete word-phrase matches; then use partial matching. No active reference or form result was found for `abacha`, `abacha ncha`, `abacha flour`, `dried abacha`, `cassava strips`, `dried cassava strips`, `cassava flakes`, `African salad`, or `salade africaine`. No exact `ingredient-ref-abacha` ID exists. Normalized exact-name scans found no Abacha entry in the legacy candidates or ledger and no Abacha mention in any of the 364 existing proposals.

The full proposal-directory scan covered all 364 existing Markdown files. The closest coverage is the broad `wp02-west-african-cassava-flour-products-review-20261010.md` and regional-starch residual reviews; none names or scopes Abacha. Focused adjacent proposals review lafun, Pupuru, Kokonte, attiéké, Placali, and Agbelima separately and do not allocate Abacha.

| Query | Current active result / boundary |
|---|---|
| `abacha`, `abacha ncha`, `abacha flour`, `dried abacha`, `cassava strips`, `dried cassava strips`, `cassava flakes`, `African salad`, `salade africaine` | No active reference or form; no exact legacy candidate or ledger record. |
| `cassava` | Six active references: attiéké, cassava leaves, cassava root, edible cassava flour, and the two Brazilian polvilho identities. Keep broad cassava wording off an Abacha row. |
| `manioc` | Four active references: cassava leaves, cassava root, edible cassava flour, and tapioca starch. |
| `tapioca` | Two active references: tapioca starch and tapioca pearls. Do not add this ambiguous search key to Abacha. |
| `cassava flour` | The active edible cassava flour identity only. The OQLF term `farine de manioc` describes powder, not Abacha strips. |
| `gari` / `garri`; `lafun`; `pupuru`; `attiéké`; `placali` | Resolve to their respective active, separate identities. |
| `fufu`; `amala`; `elubo`; `agbelima`; `kokonte` | No active reference or form. Existing generic holds and product-specific proposals remain unchanged. |

**Recipe demand:** exact normalized phrase scans found zero ingredient-line hits and zero recipe-text hits across all 114 manifest-listed recipes / 1,123 ingredient rows for `abacha`, `abacha ncha`, `abacha flour`, `dried abacha`, `cassava strips`, `dried cassava strips`, `cassava flakes`, `African salad`, and `salade africaine`. No source, quantity, recipe link, or relink is inferred.

## Reopen criteria and no-op boundary

Keep this candidate held. Reopen it only when evidence provides:

1. A Québec French product label or authoritative Québec terminology source for the exact Abacha product and state. The Canada-wide French storefront supports the unchanged name in French-facing retail, but does not establish Quebec-local usage or the product stage.
2. A product source that establishes whether the intended item is dried strips, wet slices, or another state and whether `Abacha Ncha` names a prepared dish rather than the ingredient.
3. Separate evidence for any future household measure, density, conversion, yield, or contextual substitution.

## Root integration outcome

Root added `candidate-abacha` to the research ledger with seven source entries. The candidate remains `needs_clarification`: the Canadian French storefront supports the unchanged name in a French-facing retail listing, while the exact product state and Québec-specific display remain unresolved. No active reference, aliases, forms, measures, conversions, yields, recipe link, or substitution were added. The scoped Abacha checkpoint is complete; the broader B2/B3 parent remains open.

## Source register

All sources accessed 2026-10-11. Source IDs use the WP02-ABACHA-STRIPS-20261011 namespace and are mirrored in the research ledger; in-text citations use the short S01–S07 labels.

- **WP02-ABACHA-STRIPS-20261011-S01** — K. S. Dike et al., [“Analysis of bacterial communities of three cassava-based traditionally fermented Nigerian foods (abacha, fufu and garri)”](https://doi.org/10.1111/lam.13621), *Letters in Applied Microbiology* 74(3), 452–461 (2022). Primary study describes Abacha as fermented strips and distinguishes it from fufu porridge and garri granules. Its microbiology results do not define a retail standard or recipe behavior.
- **WP02-ABACHA-STRIPS-20261011-S02** — Chioma Illoh, Helen Obioma Agu, Chioke Amaefuna Okolo, and Victoria Adaora Jideani, [“Physicochemical and consumer acceptability of different particle-sized cassava strips”](https://academicjournals.org/journal/AJFS/article-full-text/1A988EE68808), *African Journal of Food Science* 16(3), 71–80 (2022), DOI [10.5897/AJFS2021.2108](https://doi.org/10.5897/AJFS2021.2108). Primary study names dried cassava strips `Abacha`, uses commercial Abacha bought in Awka, and prepares `Abacha Ncha` from rehydrated strips. Sample particle sizes and laboratory functional measurements do not establish a household measure, density, general rehydration ratio, or recipe yield.
- **WP02-ABACHA-STRIPS-20261011-S03** — F. C. Ekwu, P. O. Uvere, and O. M. Chinwero, [“Quality of ‘Abacha’ from Fresh Cassava Roots and Dried Chips”](https://www.sciencedirect.com/science/article/pii/S0189724115300217), *Nigerian Food Journal* 30(1), 124–130 (2012), DOI [10.1016/S0189-7241(15)30021-7](https://doi.org/10.1016/S0189-7241(15)30021-7). Primary study compares Abacha slices produced from fresh roots and from dried cassava chips; the route and sample quality differ. It does not supply a generic ingredient conversion or kitchen yield.
- **WP02-ABACHA-STRIPS-20261011-S04** — Elizabeth C. Okeke et al., [“The Igbo traditional food system documented in four states in southern Nigeria”](https://www.fao.org/4/i0370e/i0370e.pdf), in Harriet V. Kuhnlein, Bill Erasmus, and Dina Spigelski (eds.), *Indigenous Peoples’ Food Systems: The Many Dimensions of Culture, Diversity and Environment for Nutrition and Health*, FAO/Centre for Indigenous Peoples’ Nutrition and Environment (2009), chapter 12, pp. 251–281; Abacha discussion at printed p. 272. The chapter reports wet/dry slices and dried slices for African salad. It also parenthetically calls Abacha “tapioca” and later uses Abacha for cocoyam chips; these contextual usages are not treated as global synonym or stable product scope.
- **WP02-ABACHA-STRIPS-20261011-S05** — MyChopChop, [“Abacha - 150g”](https://www.mychopchop.ca/products/abacha-150g), Canadian retailer product page, accessed 2026-10-11. The page lists Abacha as a 150 g Nigerian-origin product and says it is made from cassava; the store address is Cambridge, Ontario. It is English-facing retail evidence, not a Québec French label, ingredient panel, household measure, or serving yield. The listing’s “African Salad” wording is not used as an ingredient alias.
- **WP02-ABACHA-STRIPS-20261011-S06** — Office québécois de la langue française, [“farine de manioc”](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287122/farine-de-manioc), Grand dictionnaire terminologique; term attributed to AFNOR (1979). Defines manioc flour as powder obtained by dry grinding cassava roots. It does not name Abacha. A targeted OQLF search for `Abacha`/`Abacha Ncha` found no dedicated terminology entry.
- **WP02-ABACHA-STRIPS-20261011-S07** — OsiAfrik, [French-facing Canadian Nigerian grocery storefront](https://www.osiafrik.ca/fr), accessed 2026-10-11. The home-page product list includes `Abacha 227 g` and the site states that it delivers in Canada and the United States. This supports unchanged retail naming in a Canada-facing French interface, but the page does not locate the seller in Québec, describe the product stage, or provide a household measure. The displayed package weight is not a serving or yield.

## File integrity check

The proposal is saved as UTF-8 without a BOM. Root integration added the held candidate and source evidence to the research ledger and completed the scoped plan checkpoint. Tests and package normalization are pending.
