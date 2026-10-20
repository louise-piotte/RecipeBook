# WP06 African regional gap review R490 — shiro powder

- **Date:** 2026-10-17
- **Status:** Proposal only. This review writes only this proposal file; no shared catalog, form, ledger, recipe, plan, roadmap, manifest, workflow, or generated-file changes were made.
- **Scope:** One Ethiopian dry pulse-product identity with a separate prepared-stew boundary. This review revisits the ledger-only `candidate-ethiopian-shiro-powder` decision.
- **Recommendation:** Add identity-only `shiro powder / poudre de shiro` as `ingredient-ref-shiro-powder` in `FLOUR_AND_STARCH`. Add only the English alias `shiro flour`; keep bare `shiro`, prepared `shiro wot/wat`, and plain chickpea flour separate. Add no forms, measures, density, conversions, package yield, recipe links, or substitutions.

## Open-plan fit and recent-work boundary

[Section 05 of the global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9583) still leaves North, West, Central, Horn, East, and Southern African coverage open after its bounded six-region sweep and the recent R478, R481, R484, and R487 work. This is one Ethiopian pantry identity, not a claim of coverage for Ethiopia or Africa as a whole. Section Z remains separately open for African sauces, pastes, fermented seasonings, palm preparations, groundnut products, and related condiments.

The recent [R478 review](wp06-african-next-regional-review-r478-20261017.md) concerns dried baobab-leaf powder; [R481](wp06-african-next-regional-review-r481-20261017.md) concerns dried *Gnetum* leaves; [R484](wp06-african-next-regional-review-r484-20261017.md) concerns the *Xylopia aethiopica* fruit spice grains of Selim; and [R487](wp06-african-next-regional-review-r487-20261017.md) concerns Ugu leaves. None represents the dry Ethiopian pulse product reviewed here.

The research ledger already has `candidate-ethiopian-shiro-powder`, with identity `needs_clarification` and measurement and substitution `not_yet_researched`. Its unresolved decision held the identity outside the active catalog because the category was unsettled and explicitly withheld aliases for bare `shiro`, `shiro flour`, and `shiro wot`. R490 resolves the category from the product’s dry, milled pulse composition and reconsiders the narrow `shiro flour` alias: the 2023 official catalogue lists ES 6837:2021 as “Shiro Powder — Specification,” and the research article describes shiro flour as a roasted-pulse blend that is ground/milled, separately from prepared shiro wot. Treat the link between the standard title and the article’s product wording as an evidence-based identity inference, not a claim that the standard text declares the words synonyms. Keep the stew name outside the powder identity. [SS08, SS09]

## Live package snapshot and ownership audit

Counts and hashes were refreshed from the shared worktree on 2026-10-17. Hashes cover exact file bytes. The recipe-corpus fingerprint follows `manifest.recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, the exact recipe bytes, and a NUL byte.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,762 references | — | `3821584df16033c29ef1a2fc7822f656425a040ddc074ac7273abca01af82b12` |
| `ingredient-forms.v1.json` | 143 forms | — | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| `legacy-import-identities.v1.json` | 56 candidates | — | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,121 records; 9,688 source entries; 8,220 distinct source IDs; 6,933 distinct URLs | — | `1b406fea98da4bc1fa3d755894ac0d5df4e67dac2d6919e0fe9a5437f32349ec` |
| `manifest.v1.json` | 114 recipe paths | — | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | 753,988 aggregate bytes | `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

The proposed ID `ingredient-ref-shiro-powder`, proposal path, and local source-ID prefix `WP06-AFRICA-SHIRO-R490-20261017-S` were absent from active references, forms, legacy candidates, ledger source IDs, and the proposal/batch archive at review time. Exact normalized-name checks found no active reference, form, or legacy owner for `shiro powder`, `shiro flour`, `poudre de shiro`, `farine de shiro`, `shiro wot`, `shiro wat`, `nech shiro`, `mitin shiro`, or `yeshimbra duket`. The candidate is currently ledger-only.

The nearest active shiro-named rows are `ingredient-ref-shiro-dashi` (`shiro dashi`) and `ingredient-ref-white-soy-sauce` (`white soy sauce`, with `shiro shoyu` in its French display and as its English alias). Neither is this pulse product. The nearest plain-flour rows are `ingredient-ref-chickpea-flour`, `ingredient-ref-desi-chickpea-flour`, `ingredient-ref-chana-sattu`, `ingredient-ref-fava-bean-flour`, and `ingredient-ref-yellow-pea-flour`; none owns the proposed shiro names. There is no shiro form. The closest product categories use `FLOUR_AND_STARCH` for single-pulse flours and roasted pulse flour products.

The prior ledger source IDs SS08 and SS09 are reused as-is; no duplicate source entries are proposed for them. The exact URLs for S01–S04 were absent from the live ledger, and the R490 local source-ID prefix was unused. Recheck live key, ID, and URL ownership before any shared integration because catalog work continues in parallel.

## Candidate identity and name boundaries

| Proposed reference ID | English display | fr-CA display | Category | Aliases |
|---|---|---|---|---|
| `ingredient-ref-shiro-powder` | `shiro powder` | `poudre de shiro` | `FLOUR_AND_STARCH` | EN: `shiro flour`; FR: none |

The 2023 catalogue lists a dedicated ES 6837:2021 “Shiro Powder — Specification”; it does not include the standard text. The 2023 research article describes shiro flour as a blend of roasted pulses that is ground/milled, distinguishes the dry flour from prepared shiro wot, and reports variation by household and region. Together, these sources support one dry product class and the powder/stew boundary while preserving variable recipes and formulations. They do not make every Ethiopian pulse flour or spice blend a shiro product. [SS08, SS09]

The proposed category is the closest current code-defined class for a dry, milled pulse product. It classifies the product state rather than treating shiro as a single pulse, a pure chickpea flour, or a spice blend. Herbs and spices may be included, but the sources describe them as optional or variable components of the pulse-based powder. The French display `poudre de shiro` is a transparent, descriptive rendering of the product name; a French-language recipe source uses that phrase. No exact OQLF culinary entry surfaced in targeted Vitrine/GDT searches for `shiro`, `poudre de shiro`, or `farine de shiro`. This search does not establish that no entry exists, so the proposed fr-CA display remains provisional pending Québec terminology review. [S03]

| Term or product | Disposition | Boundary |
|---|---|---|
| Shiro powder | Add one dry, pulse-based product identity. | Use the standardized product wording in the display. Formulation varies; no one pulse or recipe is required by this identity. |
| `shiro flour` | Add as one narrow English alias. | The study uses this name for the roasted, milled pulse blend; linking it to `shiro powder` is an inference supported by the overlapping product description. It is not a separate pure-pulse flour. |
| Bare `shiro` | Keep out of aliases. | The active picker already has Japanese `shiro dashi` and `shiro shoyu`; a bare query will intentionally return multiple specific identities. |
| `shiro wot` / `shiro wat` | Keep separate from the powder. | These name a prepared Ethiopian stew, not the dry ingredient. Do not model the stew as a form or alias of the powder. |
| `nech shiro`, `key shiro`, `mitin shiro`, and spelling variants | Keep as source-level formulation or style wording. | The sources describe recipe/formulation variation, but do not establish a single consistent product mapping for these qualifiers. |
| Plain chickpea flour / `farine de pois chiche` | Keep on the existing pure-flour identity. | Shiro blends can use different pulses and may include seasonings. One retailer’s parenthetical “Chickpea Flour” does not establish equivalence to the unseasoned, single-pulse ingredient. |
| Berbere / berbere powder | Keep on its own active spice identity. | It may be included in some shiro variants, but it is not the dry pulse blend itself. |
| `farine de shiro` | Do not add as a French alias in this proposal. | No reviewed Québec source or OQLF entry supports that exact phrase. The French editorial source uses `poudre de shiro`; independent Québec review remains open. |

## Live picker projection

The projection follows the current `IngredientReferenceSearchIndex` behavior: normalize case, accents, ligatures, punctuation, and spacing; prefer whole normalized-word phrases across a result set; then fall back to substring matching. The proposed search terms are the English and French displays plus the single English alias.

| Query | Current result | With the proposed row |
|---|---|---|
| `shiro` | `ingredient-ref-shiro-dashi`; `ingredient-ref-white-soy-sauce` | Those two plus `ingredient-ref-shiro-powder` |
| `shiro powder`, `shiro flour`, `poudre de shiro` | No result | `ingredient-ref-shiro-powder` |
| `shiro wot`, `shiro wat`, `farine de shiro` | No result | No result |
| `shiro dashi` | `ingredient-ref-shiro-dashi` | Unchanged |
| `shiro shoyu` | `ingredient-ref-white-soy-sauce` | Unchanged |
| `chickpea flour` | `ingredient-ref-chana-sattu`, `ingredient-ref-chickpea-flour`, `ingredient-ref-desi-chickpea-flour` | Unchanged; no chickpea-flour alias is added |
| `farine de pois chiche` | `ingredient-ref-chickpea-flour` | Unchanged |
| Broad `flour` and `powder` queries | Existing broad result lists | Each gains one item through `shiro flour` and `shiro powder` |

This makes exact product-specific phrases searchable and adds a third result to the generic `shiro` query without taking over either Japanese identity. It leaves plain chickpea-flour queries and the prepared-stew wording unchanged.

## Bundled recipe demand

All 114 manifest-listed recipe JSON files were parsed in full, including all 1,123 `ingredients[]` rows, nested ingredient fields, and reference/link values. Case-folded, accent- and punctuation-normalized phrase probes covered `shiro`, `shiro powder`, `shiro flour`, `poudre de shiro`, `farine de shiro`, `shiro wot`, `shiro wat`, `nech shiro`, `mitin shiro`, `yeshimbra duket`, `shiro dashi`, and `shiro shoyu`, plus plain chickpea-flour boundaries. The scan found **zero candidate-related full-recipe hits and zero candidate-related ingredient-row hits**. No bundled row, quantity, recipe link, or relink is proposed.

## Form, numeric, yield, and substitution limits

The identity denotes the dry shiro powder/flour product. It does not denote cooked shiro wot, a reconstituted sauce, any component pulse flour, or a specific commercial formula. Add no ingredient forms for roasted, ground, spiced, or cooked states; the sources describe product preparation and formulation but do not establish a reusable form-conversion model.

The available sources and recipe corpus do not establish a general household measure, density, unit mapping, preparation yield, package-yield relationship, or safe quantity-equivalent substitute. T&M’s “1 Kg” is only its package title; it is not a recipe measure or general conversion value. The article’s laboratory measurements and its varied formulations do not establish kitchen conversions. No substitution rule or recipe-line link is proposed.

If accepted, add only this identity row:

```json
{
  "id": "ingredient-ref-shiro-powder",
  "nameFr": "poudre de shiro",
  "nameEn": "shiro powder",
  "aliasesFr": [],
  "aliasesEn": ["shiro flour"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

The existing ledger candidate’s identity state can be reviewed for resolution at integration; measurement remains unknown pending a dedicated source search, and substitution remains not yet researched. This proposal does not add or edit that ledger record.

## Sources and limits

Source ownership was checked against the live ledger on 2026-10-17. SS08 and SS09 are existing IDs and must be reused, not duplicated. S01–S04 are proposal-local IDs and are not ledger entries yet.

| ID | Source | Claim used and limit |
|---|---|---|
| **WP06-AFRICA-REGIONAL-CONTINUATION-20261013-SS08** (existing; reuse) | Ethiopian Standards Agency, [2023 Compulsory Ethiopian Standards Catalogue](https://www.ethiostandards.org/sites/default/files/2023-04/IES%20ES%202023%20CATALOGUE.pdf), ES 6837:2021 listing. | Lists a dedicated “Shiro Powder — Specification.” The standard text was not retrieved through this catalogue, and this 2023 listing does not establish its current status in 2026 or provide technical requirements. |
| **WP06-AFRICA-REGIONAL-CONTINUATION-20261013-SS09** (existing; reuse) | Zeru et al., [“Spicy Shiro flour and Berbere powder”](https://link.springer.com/article/10.1186/s42779-023-00175-6), *Journal of Ethnic Foods* 10, 28 (2023). | Describes shiro flour as a blend of roasted pulses and spices, documents regional/household formulation variation, and separates dry flour from prepared shiro wot. Supports the narrow alias and product boundary. Its statement that there are no national norms conflicts with the Ethiopian Standards Agency’s 2023 listing; rely on the authority for the listing and do not repeat the paper’s no-standard claim. |
| **WP06-AFRICA-SHIRO-R490-20261017-S01** | Ethiopian Standards Institute, [official-domain PDF search-result lead for ES 7130](https://w.ethiostandards.org/sites/default/files/2024-06/ES%207130.pdf). | An indexed search result identifies a draft document at this URL and shows shiro-wot context. Direct PDF retrieval/open failed in this review. No definition, requirement, or powder/stew claim is relied on from it; retain only as an unverified lead for later source retrieval. |
| **WP06-AFRICA-SHIRO-R490-20261017-S02** | T&M Store, [Ethiopian Organic Shiro Powder (Chickpea Flour), 1 kg](https://www.tandmwholesale.ca/products/ethiopian-organic-shiro-powder-1-kg). | Canadian retail-title evidence that shiro powder is sold under that name. The title’s parenthetical `Chickpea Flour` is retailer wording and no formula panel was available; it does not establish equivalence to pure chickpea flour. The 1 kg amount is package-specific only. |
| **WP06-AFRICA-SHIRO-R490-20261017-S03** | 196 Flavors, [Shiro Wot – recette traditionnelle éthiopienne](https://www.196flavors.com/fr/shiro-wot/). | Uses `poudre de shiro` in French and separates it from the prepared shiro wot recipe. This is editorial French usage, not a Québec terminology authority; its chickpea-specific description is not treated as a universal formulation. |
| **WP06-AFRICA-SHIRO-R490-20261017-S04** | Ethiopian Standards Institute, [2026 Ethiopian Standards catalogue page](https://ww.ethiostandards.org/index.php/2026-ethiopian-standard-ces-es-catalogue). | Confirms the Institute publishes separate 2026 compulsory and general Ethiopian standards catalogues. The linked general ES catalogue PDF timed out in retrieval; the accessible compulsory-catalogue PDF is a different subset. Therefore this review makes no claim that ES 6837 remains current, has been withdrawn, or is absent from the 2026 general catalogue. |

## Root-review recommendation

Accept the identity-only row `ingredient-ref-shiro-powder`, with provisional fr-CA `poudre de shiro`, `shiro flour` as the only English alias, and category `FLOUR_AND_STARCH`. Keep bare `shiro`, prepared shiro wot/wat, plain chickpea flour, and ingredient variants with unresolved local qualifiers outside the alias set. Add no forms, measurements, conversions, yields, recipe links, or substitutions. Keep Section 05 African coverage and Section Z open.

This proposal changes only this Markdown file. If integrated as an identity/ledger JSON-only addition, `AGENTS.md` says no software tests are needed; no tests, builds, emulator checks, or deployment were run for this proposal-only documentation change.
