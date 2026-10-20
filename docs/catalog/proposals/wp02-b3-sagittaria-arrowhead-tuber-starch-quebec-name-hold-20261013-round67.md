# WP02 B3 — Arrowhead tuber starch (*Sagittaria sagittifolia*) Québec naming hold (Round 67)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. This file is the only proposed change; no catalog JSON, ledger, roadmap, plan, checklist, batch archive, recipe, or generated file was edited.
- **Scope:** The extracted starch studied from *Sagittaria sagittifolia* tubers. This is one additional candidate under the open WP02 B3 item for water-chestnut flour and other documented regional starches. It does not reopen the whole-tuber arrowhead/food-name hold in the WP03 archive, or any existing arrowroot, lotus-root, potato, water-chestnut, taro, yam, bracken, acorn, or plantain-starch decision.
- **Source-ID prefix:** `WP02-B3-SAGITTARIA-STARCH-HOLD-20261013-R67`. It was checked against the current ledger and proposal/batch archive before drafting; it is unused. These IDs are proposal-local, not ledger records.

## Recommendation

**Hold an active ingredient reference and all search aliases.** Primary food-science studies isolate and characterize arrowhead tuber starch, including a study titled for *Sagittaria sagittifolia*. That establishes a real research material distinct from whole tubers. It does not establish a current Canadian/Québec standalone starch product. OQLF supports `sagittaire` as a botanical name for the *Sagittaria* genus and `amidon` as the general Québec French term for starch, but neither source names a food product `amidon de sagittaire`. The government species-name record for *S. latifolia* uses `sagittaire à larges feuilles` / `sagittaire latifoliée`; that is not the research species *S. sagittifolia* and cannot be borrowed to complete its French product name. [S01–S04]

Keep `arrowhead starch`, `amidon de sagittaire`, and literal translations such as `amidon de flèche d’eau` as research/search phrases only. Do not assign `ingredient-ref-arrowhead-starch`, add a reference or alias, or treat `arrowhead flour` as a synonym. Reopen only if a current Canadian/Québec food product or producer source identifies the botanical source and product state, and a Québec French product display is independently supported.

| Phrase or product | Disposition | Evidence and limit |
|---|---|---|
| `arrowhead tuber starch` / `arrowhead starch` | Research candidate; no active row. | Primary studies use the English material name for starch isolated from *S. sagittifolia* tubers. They describe research samples, not a current Canadian retail product or generic label standard. [S03–S05] |
| `amidon de sagittaire` / `amidon de flèche d’eau` | Do not activate as display or alias. | These are transparent descriptions assembled from Québec plant/starch terms; no reviewed Québec authority or food label attests either as the product name. [S01–S02] |
| `arrowhead`, `broadleaf arrowhead`, `wapato`, `duck potato`, `Indian potato` | Keep out of a starch row. | Common names cover or overlap more than one *Sagittaria* species. Canadian terminology distinguishes *S. latifolia* names and notes `wapato` also occurs for *S. cuneata*. Use a species-qualified source before assigning a food-product name. [S04, S07] |
| `arrowhead flour` | Do not alias to isolated starch. | Flour or meal would retain non-starch tuber material; the studies here isolate starch. No source establishes an arrowhead-flour row or a starch/flour equivalence. |
| `arrowroot flour`, `arrowroot starch`, `arrowroot powder`, `farine d’arrow-root`, `fécule d’arrow-root` | Keep on `ingredient-ref-arrowroot`. | The active arrowroot identity has its own source-backed aliases. `Arrowhead` and `arrowroot` are different names and products; do not use spelling similarity to merge them. |
| Forms, measurements, and substitutions | Add none. | The reported lab extraction yield and processing experiments do not provide a household measure, transferable density, conversion, cooking yield, or recipe substitution. [S03, S05–S06] |

## Open-plan and archive check

The current WP02 plan still leaves **“Water-chestnut flour and other documented regional starches”** open. Its checked child decisions cover mung-bean and lotus-root starch, water-chestnut boundaries, palm-sago pearls, bracken starch, and Korean acorn starch; none is this *Sagittaria* starch candidate.

The proposal/batch archive was searched for `arrowhead starch`, `arrowhead tuber starch`, `Sagittaria sagittifolia starch`, `wapato starch`, `amidon de sagittaire`, and `fécule de sagittaire`. No WP02 product or starch review was found. The closest prior reviews are [WP03 Section J regional tuber gap review](wp03-section-j-regional-tuber-gap-review-20261012.md) and [WP03 Section J onion and root identity follow-up](wp03-section-j-onion-root-followup-20261009.md). They address whole-tuber/plant identity and the species ambiguity of `arrowhead`/`wapato`; neither reviews extracted starch, its French product name, its catalog ownership, or numeric behavior. This proposal narrows that separately documented product boundary and leaves the whole-tuber hold unchanged.

## Product boundary and evidence limits

The candidate is **starch isolated from tubers identified in research as *Sagittaria sagittifolia***. This is separate from whole *Sagittaria* tubers eaten as a vegetable or starch source. The 2015 study examines native and gamma-irradiated starch; a 2021 study compares starches from several aquatic vegetables, including *S. sagittifolia*; later work studies additional physical treatments. These are research preparations and treatments. They do not define one current retail grade, demonstrate that every product called `arrowhead` has this species, or support a source-neutral native/modified form. [S03–S06]

The published English phrase is source-backed at the research-material level. Québec French product naming remains open:

- OQLF’s `sagittaire` entry is a botanical-flora term for genus *Sagittaria*. Its note mentions *S. sagittifolia*, but it does not name a food or starch product. The entry dates to 1988. [S01]
- OQLF’s 2026 `amidon` entry supports the general French starch term and says `fécule` is used more specifically for starch in tubers or other underground organs. It does not attest `amidon de sagittaire` or `fécule de sagittaire`. [S02]
- TERMIUM’s French names `sagittaire à larges feuilles` and `sagittaire latifoliée` are for *S. latifolia*, not the *S. sagittifolia* material in the studies. TERMIUM also notes that `wapato` is used for *S. cuneata*. Do not turn that plant terminology into a French product alias for this candidate. [S07]
- Searches for the English and French product phrases plus Canadian/Québec modifiers returned research papers and plant terminology, but no standalone Canadian/Québec food-starch package. This is a bounded search result, not proof that no such product is sold. A 2025 article’s broad statement that arrowhead is consumed in Canada is not a retail label or evidence that isolated starch is marketed here. [S06]

## Exact ownership, picker effects, and recipe demand

Read-only audit refreshed against the shared worktree on 2026-10-13. Exact-key normalization follows the current `IngredientSearch.kt` behavior: lowercase, NFKD decomposition, accent/ligature folding, and punctuation/spacing normalization. Phrase matching checks complete normalized word phrases before substring fallback.

| Surface | Current count / result |
|---|---:|
| Active ingredient references | 1,389 |
| Ingredient forms | 100 |
| Legacy import candidates | 63 |
| Research-ledger records | 1,722 |
| Manifest-listed recipes / ingredient rows | 114 / 1,123 |

No exact owner or ledger record ID was found for `arrowhead starch`, `arrowhead tuber starch`, `Sagittaria sagittifolia starch`, `wapato starch`, `duck potato starch`, `Indian potato starch`, `amidon de sagittaire`, `amidon de tubercule de sagittaire`, or `sagittaire à feuilles en flèche`. No active reference, form, legacy candidate, or ledger ID uses `arrowhead`, `wapato`, `Sagittaria`, or `sagittaire` as an exact name. There is no `candidate-arrowhead-starch` record.

The neighboring live owners are:

| Current owner | Exact wording and effect |
|---|---|
| `ingredient-ref-arrowroot` | English display `arrowroot`, with `arrowroot flour`, `arrowroot powder`, and `arrowroot starch`; French display `arrow-root`, with `farine d’arrow-root` and `fécule d’arrow-root`. `arrowhead` does not normalize to or match `arrowroot`. Keep these identities separate. |
| `ingredient-ref-lotus-root-starch` | `lotus root starch / amidon de racine de lotus`; no aliases or forms. Keep the distinct aquatic-plant starch source separate. |
| `ingredient-ref-potato-starch` | `potato starch / fécule de pomme de terre`; French aliases include `amidon de pomme de terre`, `fécule de pommes de terre`, and `amidon de pommes de terre`. |
| `ingredient-ref-water-chestnut` | Whole vegetable `water chestnut / châtaigne d’eau`; this is not an arrowhead identity or extracted starch row. Its unresolved flour/starch candidate remains separate. |
| Held starch candidates | The ledger has separate `candidate-bracken-starch`, `candidate-taro-corm-starch`, and `candidate-yam-starch` records. None is a *Sagittaria* starch owner. |

Under current phrase-first picker behavior, `arrowhead starch`, `arrowhead`, `Sagittaria sagittifolia starch`, and `amidon de sagittaire` currently return no reference. A future canonical `arrowhead starch` term would make the exact product query match that row; the shorter `arrowhead` query would also match it as a complete phrase. `arrowroot` would continue to match only `ingredient-ref-arrowroot`. The broad query `starch` already matches many products (21 current reference terms in this audit), so it is not a product-specific lookup. Do not add `duck potato` or `Indian potato` as aliases: they are shared/common plant names, and including “potato” would add this narrow starch candidate to broad potato searches without establishing product intent.

All 114 manifest-listed recipe files and all 1,123 ingredient rows were scanned for the candidate names and French constructions. There were **zero full-recipe text hits and zero ingredient-row hits**. The bundled corpus therefore provides no present recipe demand, recipe link, household measure, or contextual substitution need. This is not a market-demand survey.

## Numeric and substitution scope

Wani et al. report an extraction yield of **40.33% (±2.2%) on a dry-weight basis** for their wild arrowhead tuber sample. The paper also studies irradiation-dependent changes in material properties, including bulk-density trends. These are study/process-specific observations, not a kitchen extraction yield, a g/mL default, or a mass-per-cup conversion. The publisher page exposed the abstract and indexed study text; direct page retrieval returned 403 during this review, so no unshown full-text table or method detail is relied upon. [S03]

The reviewed studies characterize starch extraction, structure, and processing. They provide no tested recipe substitution for arrowroot, potato, corn, tapioca, lotus-root, taro, or another starch, and no reusable ratio. Keep measurement and substitution data inactive. If a candidate ledger record is later accepted, use `researched_no_supported_value` only for the bounded absence of a supported kitchen measure and `researched_no_supported_substitute` only for the sources actually reviewed; do not imply a comprehensive literature search.

## Integration sketch

1. Keep the B3 checklist open. Do not add an active reference, alias, form, measure, default density, unit mapping, package yield, recipe link, conversion, or substitution.
2. If the coordinator wants to retain this research candidate, add one unresolved ledger candidate for starch isolated from source-identified *S. sagittifolia* tubers. Do not allocate an active ID or promote the literal French translation.
3. Require a current Canadian/Québec food-product or producer source identifying the species and isolated-starch product, plus independent Québec review of its exact French product display, before considering catalog integration.
4. If later accepted, create a separate `FLOUR_AND_STARCH` identity for the source-qualified starch product. Keep it distinct from whole *Sagittaria* tubers, any future tuber flour, arrowroot, and other aquatic-tuber starches. Add only package/source-attested aliases; keep forms and numeric/substitution fields empty absent separate evidence.

## Sources

Sources were accessed on 2026-10-13. The source IDs below are proposal-local and are not ledger entries.

| ID | Source | Supports and limits |
|---|---|---|
| **WP02-B3-SAGITTARIA-STARCH-HOLD-20261013-R67-S01** | Office québécois de la langue française, [*sagittaire* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17034754/sagittaire), updated 1988. | Gives Québec French `sagittaire` and English `arrowhead` for genus *Sagittaria*; its note mentions *S. sagittifolia*. Botanical term only, not a starch name, food-product label, or current-market check. |
| **WP02-B3-SAGITTARIA-STARCH-HOLD-20261013-R67-S02** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. | Supports generic French `amidon` for English `starch` and explains the narrower contextual use of `fécule` for underground organs. It does not attest a *Sagittaria* starch compound or product. |
| **WP02-B3-SAGITTARIA-STARCH-HOLD-20261013-R67-S03** | Wani et al., [“Physicochemical properties of native and γ-irradiated wild arrowhead (*Sagittaria sagittifolia* L.) tuber starch”](https://doi.org/10.1016/j.ijbiomac.2015.03.012), *International Journal of Biological Macromolecules* 77 (2015), 360–368. | Primary study names isolated native and irradiated tuber starch and reports study-specific extraction yield. Publisher abstract/index text was accessible; direct article fetch returned 403. Its yield and physical-property results do not supply a household measure, generic density, package specification, or substitution rule. |
| **WP02-B3-SAGITTARIA-STARCH-HOLD-20261013-R67-S04** | Wang et al., [“Structural characterization and physicochemical properties of starch from four aquatic vegetable varieties in China”](https://doi.org/10.1016/j.ijbiomac.2021.01.078), *International Journal of Biological Macromolecules* 172 (2021), 542–549. | Primary comparison includes extracted starch from *S. sagittifolia* alongside lotus, water chestnut, and water caltrop. Publisher abstract was accessible; full page retrieval returned 403. Experimental comparisons and edible-film application do not establish a Canadian product name or kitchen equivalence. |
| **WP02-B3-SAGITTARIA-STARCH-HOLD-20261013-R67-S05** | Raza et al., [“Structural and physicochemical characterization of modified starch from arrowhead tuber (*Sagittaria sagittifolia* L.) using tri-frequency power ultrasound”](https://pmc.ncbi.nlm.nih.gov/articles/PMC8605420/), 2021. | Primary study identifies arrowhead starch from *S. sagittifolia* tubers and examines ultrasound-modified samples. The indexed article text was available; direct PMC retrieval showed a browser verification page. Laboratory treatment does not define a consumer product state, transferable property value, or recipe substitution. |
| **WP02-B3-SAGITTARIA-STARCH-HOLD-20261013-R67-S06** | Guo et al., [“Effects of electric field-assisted freeze-thaw cycle on arrowhead (*Sagittaria sagittifolia* L.) quality and the structural and physicochemical properties of starch”](https://doi.org/10.1016/j.ifset.2025.104047), *Innovative Food Science & Emerging Technologies* 103 (2025), 104047. | Current primary research on tuber quality and isolated starch; the search-indexed abstract reports physical treatment and starch-property outcomes. The article’s broad consumption statement is not a Canadian package, local label, or evidence for a reusable recipe measure. |
| **WP02-B3-SAGITTARIA-STARCH-HOLD-20261013-R67-S07** | Translation Bureau, Government of Canada, [TERMIUM Plus: *Sagittaria latifolia*](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-fra.html?i=&index=frw&lang=fra&srchtxt=SAGITTAIRE+LATIFOLIEE). | Gives *S. latifolia* French names `sagittaire à larges feuilles` / `sagittaire latifoliée`, English common names including `broadleaf arrowhead` and `wapato`, and notes that `wapato` is also used for *S. cuneata*. This is plant terminology for another species, not a starch-product name for *S. sagittifolia*. |

## Static checks performed

Re-read current `AGENTS.md`, the WP02 B2/B3 checklist, and proposal/batch archive before selecting the candidate. Refreshed active-reference, form, legacy, and ledger counts; checked exact normalized ownership for the candidate terms and current neighboring identities; reviewed `IngredientSearch.kt` for phrase-first picker effects; scanned all 114 manifest-listed recipe files and 1,123 ingredient rows; and searched the proposal/batch archive for candidate overlap. This review created only this proposal file. No app tests or emulator checks were run because this is proposal-only work.

## Root integration outcome

Accepted the hold on 2026-10-13. The reviewed studies establish isolated *Sagittaria sagittifolia*
starch research, while the Québec sources support only a plant name and the generic starch term; no
Canadian/Québec food product or product-specific French name was established. No catalog or
research-ledger data changed. See the [integration record](../batches/wp02-b3-sagittaria-arrowhead-tuber-starch-quebec-name-hold-integration-20261013/README.md).
No tests were needed for this documentation-only decision.
