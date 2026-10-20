# WP03 Section K Tokyo Bekana identity-gap review

- **Reviewed:** 2026-10-14
- **Status:** Integrated by root on 2026-10-14; see the [batch README](../batches/wp03-section-k-tokyo-bekana-identity-integration-20261014/README.md). Snapshot counts below predate integration.
- **Scope:** One regional leafy-cabbage market identity, Tokyo Bekana.
- **Source-ID prefix:** `WP03-K-TOKYOBEKANA-20261014-S`; absent from the current research ledger at this snapshot.

## Exact open plan item

This review addresses the still-open item in Section K of `docs/RecipeBook-global-ingredient-catalog-plan.txt`:

> [ ] Continue the broader lettuce, leafy-green, and brassica sweep beyond these named identities; resolve additional market and regional types with source evidence and reviewer input.

The plan now records mizuna and tatsoi as integrated identities, but the broader sweep remains open. Tokyo Bekana is a distinct named, loose-leaf market type with current Québec product evidence. This proposal does not close the sweep or the separate bilingual-review item.

## Repository ownership and snapshot

I searched the Section K plan text; WP03 proposals and batches; active ingredient references and forms; `docs/catalog/legacy-import-identities.v1.json`; the research ledger; and every manifest-listed bundled recipe. There is no Tokyo Bekana reference, form, legacy candidate, prior candidate review, or bundled recipe line. The only existing evidence is the R116 mizuna finding about a single Lufa stir-fry recipe that offers Tokyo Bekana as an alternative; its ledger decision keeps that option contextual, not a Tokyo Bekana identity or substitution rule. The bundled corpus has no Tokyo Bekana ingredient-row or full-recipe hit.

Snapshot taken 2026-10-14 while other shared-worktree integration was in progress:

| Current file or corpus | Count | SHA-256 |
|---|---:|---|
| `app/src/main/assets/seed/bundled-library/ingredient-references.v1.json` | 1,462 references | `d614067358aec2a95cdbe2f77a38f9ce04dd8f14450a783c8cf465eece93d529` |
| `app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json` | 105 forms | `32dc182e715bf48a500039141c5385b0aef02650173a7327c6025ff7882760f0` |
| `app/src/main/assets/seed/bundled-library/manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| `docs/catalog/legacy-import-identities.v1.json` | 63 candidates | `a704cf17c1e8ed75682190a4d2e060f7ee312aceb95cb74316ec7b58bf622deb` |
| `docs/catalog/research-ledger.v1.json` | 1,803 records / 7,407 source entries / 6,285 distinct source IDs | `e396d4bb1c0f32e728c58f20d870389ff6b5daf76f204f74b99577c077e322a3` |
| Manifest-ordered bundled recipe corpus | 114 files / 1,123 ingredient rows | `75c7b6d7cd99fd7eee849be3a49970dc2aac5a92f2c3192a8bf80f75e785973f` |

The recipe corpus digest is SHA-256 over each manifest-listed relative path, a NUL byte, that file's SHA-256 hex digest, and a newline, concatenated in manifest order. This task changed only this proposal file.

## Identity and bilingual name recommendation

| Candidate ID | Category | EN display | fr-CA display | EN aliases | FR aliases | Scope |
|---|---|---|---|---|---|---|
| `ingredient-ref-tokyo-bekana` | `VEGETABLE_AND_AROMATIC` | `Tokyo Bekana cabbage` | `chou Tokyo Bekana` | none | none | The fresh culinary loose-leaf Tokyo Bekana type; do not extend to an undifferentiated Chinese/Napa cabbage family, baby-leaf mix, or microgreens. |

The candidate is supported as a specific market type: a NASA/Purdue paper identifies Chinese cabbage *Brassica rapa* cv. Tokyo Bekana; Cornell Cooperative Extension describes it as a Japanese loose-leaf Chinese cabbage; and Québec grower Catena describes it as a non-heading Japanese Chinese cabbage with crisp, tender leaves used raw or cooked. The catalog label should preserve the market name instead of treating the crop as a synonym for Napa cabbage or generic Chinese cabbage.

Québec and Canadian product-name evidence supports a borrowed market label. Lufa uses `Tokyo Bekana Cabbage` in its English marketplace and `Chou Tokyo Bekana` in French; Catena's French produce page uses the fuller `Chou chinois Tokyo Bekana`; and the Marché de proximité de Québec lists `Chou Tokyo Bekana BIO`. These pages support the market wording, not an OQLF terminology ruling. A site-scoped search did not locate a Tokyo Bekana entry in the OQLF Vitrine linguistique. Keep the bilingual display open to the independent reviewer; if that reviewer cannot accept the borrowed name, hold the fr-CA display rather than inventing a generic translation.

No aliases are needed for `Tokyo Bekana`: it is a complete phrase within both display names, so the current picker phrase search resolves that query to the proposed row. Do not add `Chinese cabbage`, `chou chinois`, `Napa`, `Nappa`, `Japanese cabbage`, or bare `Bekana` as aliases. `Chinese cabbage` / `chou chinois` is a family-level label used for more than this one crop; `Napa cabbage` and its `chou nappa` wording are already owned by `ingredient-ref-napa-cabbage`; and the reviewed sources do not establish bare `Bekana` as an exact synonym. Keep the exact Tokyo Bekana identity searchable through its name.

### Picker projection

The audit follows `app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt`: NFKD normalization, diacritic/punctuation folding, full-phrase matching before substring fallback, and attached form terms. Counts below are current references before and after projecting the proposed reference with no aliases or forms.

| Query | Current | With proposal | Decision |
|---|---|---|---|
| `tokyo bekana`, `Tokyo Bekana cabbage`, `chou Tokyo Bekana`, `bekana` | 0 | 1: `ingredient-ref-tokyo-bekana` | Exact market-name searches become available. |
| `Chinese cabbage`, `chou chinois` | 0 | 0 | Keep generic family searches unresolved; do not claim the family phrase as a synonym. |
| `cabbage` | 5 | 6 | Expected broad fallback increase from the EN display; no `cabbage` alias is added. |
| `chou` | 10 | 11 | Expected broad fallback increase from the FR display; no `chou` alias is added. |
| `napa cabbage`, `chou nappa` | 1: `ingredient-ref-napa-cabbage` | 1: same owner | Preserve exact Napa ownership. |
| `bok choy`, `pak choy`, `choy` | 1, 1, 4 | unchanged | No choy-family alias or collision is introduced. |

## Recipe demand, measurements, and handling boundaries

The bundled library has zero direct demand across its 114 recipes and 1,123 ingredient rows, so no bundled recipe reference should be linked. External Québec market and recipe sources show a real culinary product: Catena has a Tokyo Bekana chickpea-curry recipe; Lufa's General Tao tofu recipe offers Tokyo Bekana as a marketplace product option beside ordinary and Bilko Chinese cabbage. The Lufa ingredient line still says `3 cups Chinese cabbage`, so that recipe does not establish a Tokyo Bekana cup measure or an explicit equivalence with generic Chinese cabbage.

Keep observations source-specific:

- Lufa's currently indexed Québec listings show a 100 g `Chou Tokyo Bekana` / `Tokyo Bekana Cabbage` package. Marché de proximité de Québec lists a 250 g `Chou Tokyo Bekana BIO` product. These are distinct package listings, not standard single-head or serving weights.
- Catena's French page describes whole non-heading plants, edible leaves and stems, raw and cooked uses, and recommends using the fresh crop within about two weeks. Its page links a Tokyo Bekana chickpea curry but the direct recipe page was not retrievable during this review. A secondary CSA transcription explicitly attributes a four-portion version to Catena and lists one Tokyo Bekana cabbage or regular cabbage, with preparation instructions for the leaves and stems. Retain that only as a recipe-specific quantity and alternative; do not turn it into a head-weight conversion or global substitution.
- No Tokyo Bekana-specific Canadian Nutrient File portion, cup weight, ingredient density, reusable mass-volume conversion, unit mapping, or preparation/cooking yield was found in the reviewed official search results. Catena's blanching and storage notes are handling advice, not a measurable yield.
- No separate catalog form is justified for whole, chopped, raw, or cooked states by the evidence reviewed. Add no forms, mappings, density, conversions, yield, or substitution rules.

The one-occasion `or regular cabbage` recipe choice is scoped to Catena's chickpea curry. Lufa's marketplace choice is also scoped to its recipe shopping interface, whose ingredient line remains generic. Neither supports a broad Tokyo Bekana-to-Napa/cabbage substitution. Add no recipe link, form conversion, or ingredient-to-ingredient rule.

## Sources reviewed on 2026-10-14

| Source ID | Source | Observation and limit |
|---|---|---|
| `WP03-K-TOKYOBEKANA-20261014-S01` | Burgner et al., [Growth and photosynthetic responses of Chinese cabbage (*Brassica rapa* L. cv. Tokyo Bekana)](https://doi.org/10.1016/j.lssr.2020.07.007), *Life Sciences in Space Research*. | Primary research names the crop/cultivar combination. Its growth experiment is not culinary measurement or household-portion evidence. |
| `WP03-K-TOKYOBEKANA-20261014-S02` | Cornell Cooperative Extension, [Vegetable Varieties for Gardeners: Tokyo Bekana](https://vegvariety.cce.cornell.edu/main/detail.php?filterBy=0&variety_id=3613). | Describes a Japanese loose-leaf Chinese cabbage with bright ruffled leaves and narrow white petioles. The site is a variety database with one submitted garden review, not a commercial food standard. |
| `WP03-K-TOKYOBEKANA-20261014-S03` | University of Florida IFAS Extension, [Leafy Greens in Hydroponics and Protected Culture for Florida](https://ask.ifas.ufl.edu/publication/HS1279). | Table 1 lists Tokyo Bekana under leafy-green cultivars as mild Chinese cabbage with ruffled leaves and lettuce-like texture. The table adapts cultivar descriptions from grower and industry sources; use as horticultural/culinary corroboration, not taxonomy or conversion evidence. |
| `WP03-K-TOKYOBEKANA-20261014-S04` | Catena Farm, Québec, [Chou + Feuilles de Chou (fr)](https://www.catenafarm.ca/fr/pages/cabbage-leaves) and [farm location](https://www.catenafarm.ca/pages/contact-us). | French produce page uses `Chou chinois Tokyo Bekana`, calls it a Japanese non-heading cabbage, and describes raw/cooked use. Catena identifies itself as located in Gracefield, Québec. Its page is grower/product copy, not terminology authority or numeric measure. |
| `WP03-K-TOKYOBEKANA-20261014-S05` | Marché des Fermes Lufa, [French vegetable listing](https://montreal.lufa.com/fr/marche/categorie/legumes/brocoli-et-chou-fleur) and [English cabbage listing](https://montreal.lufa.com/en/marketplace/category/lufa-farms-products/cabbages). | Search-indexed current marketplace listings use `Chou Tokyo Bekana` / `Tokyo Bekana Cabbage`, identify Lufa Farms Anjou, and show a 100 g package. Product cards are dynamically rendered, so treat exact display and package size as marketplace observations, not a standard measure. |
| `WP03-K-TOKYOBEKANA-20261014-S06` | Marché de proximité de Québec, [Légumes et légumineuses](https://www.marchequebec.org/index.php?categorieid=5&souscategorieid=22). | Current listing names `Chou Tokyo Bekana BIO 250 gr` from Les Serres Naturo. Direct fetch returned a cache miss, so the listing is a search-indexed product observation, not proof of a universal package or measure. |
| `WP03-K-TOKYOBEKANA-20261014-S07` | Catena Farm, [recipes tagged Tokyo Bekana](https://www.catenafarm.ca/blogs/recipes/tagged/tokyo-bekana). | The producer lists `Tokyo Bekana Chickpea Curry` and four portions. The linked recipe page timed out when opened; exact ingredients below are corroborated only by the secondary transcription. |
| `WP03-K-TOKYOBEKANA-20261014-S08` | Stearns Farm CSA, [Tokyo Bekana Chickpea Curry](https://stearnsfarmcsa.org/recipetags/garlic-scapes/). | Secondary page explicitly says the recipe is sourced from Catena and transcribes one Tokyo Bekana cabbage or regular cabbage for four portions. Keep as low-confidence, recipe-specific count and substitution evidence only. |
| `WP03-K-TOKYOBEKANA-20261014-S09` | Marché des Fermes Lufa, [General Tao Tofu recipe](https://montreal.lufa.com/en/marketplace/recipe/general-tao-tofu-512). | Product choices include Tokyo Bekana cabbage and other cabbage products while the recipe ingredient list says three cups of generic Chinese cabbage. Marketplace selection is not a confirmed conversion or catalog substitution. |
| `WP03-K-TOKYOBEKANA-20261014-S10` | OQLF, [Vitrine linguistique](https://vitrinelinguistique.oqlf.gouv.qc.ca/). | Site-scoped searches for `Tokyo Bekana` and `chou Tokyo Bekana` did not surface a dedicated terminology entry. This is a negative search result only; do not describe the proposed fr-CA market display as OQLF-approved. |
| `WP03-K-TOKYOBEKANA-20261014-S11` | Health Canada, [Canadian Nutrient File](https://food-nutrition.canada.ca/cnf-fce/index-eng.jsp). | Site-scoped searches for Tokyo Bekana/Bekana did not surface a food-specific portion record. No reusable CNF measure is proposed. |

## Coordinator review and integration steps

1. Ask the independent bilingual reviewer whether the Québec market display `chou Tokyo Bekana` is acceptable as a borrowed product name despite no OQLF entry; revise or hold the French name if needed.
2. If accepted, add only `ingredient-ref-tokyo-bekana` in `VEGETABLE_AND_AROMATIC`, with EN `Tokyo Bekana cabbage`, fr-CA `chou Tokyo Bekana`, no aliases, `defaultDensity: null`, `unitMappings: []`, and no ingredient forms.
3. Add the source records and the Lufa/Catena observations to the research ledger with the source-specific limitations above. Keep the Catena curry alternative contextual and blocked from global substitution; do not link a bundled recipe.
4. Record this bounded identity under the still-open Section K broader sweep. Leave independent bilingual review and other regional greens/brassicas open.

Root integrated the identity and research-ledger record. Static package and ledger validation,
reference normalization, generated-index freshness, ownership and corpus checks, UTF-8/no-BOM,
local-link, and whitespace checks passed. No app or emulator tests were run because the integration
adds database JSON data under the updated `AGENTS.md` rule.
