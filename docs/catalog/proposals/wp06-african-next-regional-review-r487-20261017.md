# WP06 African regional gap review R487 — Ugu leaves

- **Date:** 2026-10-17
- **Status:** Proposal only. This review writes only this proposal file; no shared catalog, form, ledger, recipe, plan, roadmap, manifest, or generated-file changes were made.
- **Scope:** One Nigerian source-named leafy-vegetable identity under the still-open Section 05 African cuisine-coverage item. The candidate is the edible leaf product of *Telfairia occidentalis*.
- **Recommendation:** Add one identity-only `VEGETABLE_AND_AROMATIC` reference for **`ugu leaves` / `feuilles de courge cannelée (ugu)`**, with no aliases, forms, numeric values, substitutions, or recipe links. Keep the plant’s seeds and other regional names separate.

## Open-plan fit and prior-work boundary

The North, West, Central, Horn, East, and Southern African coverage line in [Section 05 of the global catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L9567) remains open after the bounded six-region sweep, its 2026-10-13 continuation, and the recent R478, R481, and R484 proposals. This review adds one narrowly scoped West African leaf vegetable; it does not claim coverage of Nigeria or Africa as a whole. Section Z remains separately open for African sauces, pastes, fermented seasonings, palm preparations, and related condiments; this proposal does not address or close that work.

The recent [R478 kuka review](wp06-african-next-regional-review-r478-20261017.md) concerns dried baobab leaves; [R481](wp06-african-next-regional-review-r481-20261017.md) concerns dried *Gnetum* leaves; and [R484](wp06-african-next-regional-review-r484-20261017.md) concerns the fruit spice grains of Selim. None represents *Telfairia* leaves. The earlier African sweep and continuation also contain no Ugu leaf identity. One mention of *Telfairia occidentalis* in the proposal archive is within the broad, multi-species egusi-seed discussion: the active `ingredient-ref-egusi-seeds` is a seed-category identity, not a leaf reference. Keep the plant’s leafy product distinct from its seeds, seed oil, seed flour, and any seed-based egusi use.

The sources identify Ugu as an Igbo name, while other sources give other language- and locality-specific names. The catalog’s alias arrays cannot scope names by language community or region. Use only the narrow Ugu wording in the proposed displays; do not globalize `ugwu`, `Okongobong`, `Ikong-ubong`, `Eweroko`, or other local terms. The bare botanical name and general plant name `fluted pumpkin` also stay in evidence rather than becoming aliases for this leaf product.

## Live package snapshot and ownership audit

Counts and hashes below were refreshed from the shared worktree on 2026-10-17. Hashes cover exact file bytes. The recipe-corpus fingerprint follows `manifest.recipeFiles` order and hashes each UTF-8 relative path, a NUL byte, the exact recipe bytes, and a NUL byte.

| Artifact | Count | Bytes | SHA-256 |
|---|---:|---:|---|
| `ingredient-references.v1.json` | 1,760 references | 573,225 | `ee25fe067016dd1b1978ab00e1afffe68d0b839c58961d886dfaa2f67cf0c858` |
| `ingredient-forms.v1.json` | 143 forms | 113,370 | `ddeb35a3aa35c48aca350a5d29022a66098b2b5252632e2816aafe79806b53a6` |
| `legacy-import-identities.v1.json` | 56 candidates | 13,351 | `8758d95011ea6a17a08611d619208664fb648bae56499880ac801786bd6ed720` |
| `research-ledger.v1.json` | 2,119 records; 9,674 source entries; 8,208 distinct source IDs; 6,921 distinct URLs | 9,889,384 | `e3a970400ea0ba5416896136d4404495923aa90827088da6c45f42c507fbccb7` |
| `manifest.v1.json` | 114 recipe paths | 12,011 | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows | 753,988 aggregate bytes | `847782f3c75f56972fff037c21fecd0c280f362059b8129d24bcb29b4fbb142e` |

The proposed reference ID `ingredient-ref-ugu-leaves`, the target proposal path, and the source-ID prefix `WP06-AFRICA-UGU-LEAVES-R487-20261017-S` had no owner in active references, forms, legacy candidates, the research ledger, or the proposal/batch archive when checked. Exact normalized-key checks found no active reference, form, or legacy owner for `ugu`, `ugu leaves`, `feuilles d’ugu`, `feuilles de courge cannelée`, `courge cannelée`, `fluted pumpkin leaves`, `pumpkin leaves`, `Telfairia occidentalis`, `ugwu leaves`, `Ikong-ubong`, or `Okongobong`.

The six source URLs in this proposal were absent from the live ledger at audit time. No existing source ID or exact URL is duplicated by this proposal. Recheck reference, key, source-ID, and URL ownership against the live worktree before any integration because other catalog work continues in parallel.

The nearest relevant active identity is `ingredient-ref-egusi-seeds`; the candidate terms and binomial above are not active names or aliases on that row. Its broad seed scope may include seed sources identified by literature as *Telfairia*, but it does not make leaves an egusi form or alias. No active leaf form or legacy candidate for Ugu or *Telfairia* was found.

## Candidate identity and name boundaries

| Proposed reference ID | English display | fr-CA display | Category | Aliases |
|---|---|---|---|---|
| `ingredient-ref-ugu-leaves` | `ugu leaves` | `feuilles de courge cannelée (ugu)` | `VEGETABLE_AND_AROMATIC` | None |

The English display uses the specific West African market name `Ugu` supported by Nigerian and Canadian product sources. The French display is a descriptive translation supported by the Cameroon food atlas, which labels the leafy product `feuilles de courge cannelée` and identifies *Telfairia occidentalis*. Neither label is an OQLF-approved term; the fr-CA display remains provisional pending independent Québec terminology review. No OQLF entry surfaced in targeted searches for `Ugu`, *Telfairia occidentalis*, `courge cannelée`, or `citrouille cannelée`.

| Name or product boundary | Evidence and current ownership | Disposition |
|---|---|---|
| Ugu leaves of *Telfairia occidentalis* | FAO and PROTA identify the edible leaf and young-shoot use; Canadian product sources use Ugu for this leaf vegetable. | Add one leaf-product identity using only the narrow names in the display fields. |
| `fluted pumpkin leaves`, `fluted gourd leaves`, `fluted pumpkin`, and *Telfairia occidentalis* | These describe the plant or appear in product copy, but not all are leaf-specific names. The bare query `pumpkin leaves` can also refer to leaves from other pumpkin/squash plants. | Keep out of the active names and aliases to avoid making a broad or botanical query select this regional leaf identity. |
| `ugwu`, `Okongobong`, `Ikong-ubong`, `Eweroko`, and other local names | Sources use these in different languages, spellings, and geographic contexts. | Preserve as source-local evidence; do not globalize them in unscoped alias arrays. |
| *Telfairia occidentalis* seeds, seed oil, seed flour, and egusi seed use | Literature distinguishes the plant’s leaves from its seeds and their separate food uses. The current `ingredient-ref-egusi-seeds` row is for seeds, not leaves. | Keep the leaf identity separate. Add no seed aliases, forms, or relinks. |
| Leaves of ordinary pumpkin/squash (*Cucurbita* spp.) | The common phrase `pumpkin leaves` can also denote leaves of other plants. | Do not merge ordinary pumpkin/squash leaves into Ugu or add an unqualified `pumpkin leaves` alias. |

## Live picker projection

The projection uses the current reference/form display names and aliases with the app’s phrase-first, accent-folding ingredient search behavior. The proposal adds no aliases, only the two proposed display names.

| Query | Current result | With the proposed row |
|---|---|---|
| `ugu` | `ingredient-ref-arugula` by partial substring match | `ingredient-ref-ugu-leaves` only; the exact whole-word match takes priority over the arugula substring result |
| `ugu leaves`, `feuilles de courge cannelée`, `courge cannelée` | No result | `ingredient-ref-ugu-leaves` |
| `pumpkin` | Six pumpkin-related results | Unchanged; no `pumpkin` term is added |
| `pumpkin leaves`, `fluted pumpkin leaves`, `Telfairia occidentalis`, `ugwu` | No result | Unchanged; no broad, botanical, or unreviewed spelling alias is added |

The exact `ugu` query currently falls through to `arugula` because `ugu` is a substring of that English term. Adding the Ugu display creates an exact phrase result and suppresses that partial false positive. Keeping `pumpkin leaves` out of the displays and aliases prevents an ordinary, unqualified pumpkin-leaf query from selecting this distinct West African product.

## Bundled recipe demand

All 114 manifest-listed recipe JSON files were parsed in full, including all 1,123 `ingredients[]` rows, nested ingredient text fields, and reference/link values. Case-folded phrase probes covered `ugu`, `ugwu`, `ugu leaves`, `fluted pumpkin`, `fluted pumpkin leaves`, `fluted gourd`, `Telfairia occidentalis`, `pumpkin leaves`, `feuilles de courge cannelée`, `feuilles de citrouille flûtée`, `Ikong-ubong`, and `Okongobong`. The scan found **zero full-recipe hits and zero ingredient-row hits** for the candidate or its reviewed boundaries. No bundled row, amount, recipe link, or relink is proposed.

## Form, numeric, yield, and substitution limits

The identity is for the leaf ingredient only. Canadian product pages describe dried or frozen Ugu items, while FAO and PROTA discuss edible leaves and tender shoots. Those reports do not establish a reusable state model or a fresh-to-dried conversion, and the bundled recipes do not request either state. Add no ingredient forms for fresh, dried, frozen, chopped, or cooked leaves.

The reviewed sources provide no general kitchen measure, density, unit mapping, preparation yield, or package-yield relationship for the ingredient. PROTA and the Cameroon atlas include nutrition tables per 100 g; these are composition observations and do not establish a kitchen conversion or cooked yield. Folak African Foods lists dried/frozen product options but gives no weight, while the Québec seller’s 5- or 10-bunch product options are seller packaging and its listing was marked sold out. Do not turn a price, bunch count, nutrient basis, or item package into a recipe amount.

PROTA says fluted pumpkin as a leafy vegetable may be replaced by other dark green leafy vegetables, but it does not give a recipe role, method, proportion, or adjustment. This broad statement does not support a reusable or contextual runtime substitution. Add no substitution rule, conversion, or recipe-line substitution link. Source-specific preparation or safety statements are not promoted to a general instruction.

If accepted, add only this identity row:

```json
{
  "id": "ingredient-ref-ugu-leaves",
  "nameFr": "feuilles de courge cannelée (ugu)",
  "nameEn": "ugu leaves",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-17T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

Keep measurement research open for supported household measures and usable fresh/dried/frozen distinctions; keep substitution research open for source-specific recipe evidence. Do not add a form, density, measure, conversion, yield, safety claim, substitution, or recipe link in this proposal.

## Sources and limits

The six new source URLs and proposal-local source IDs below were checked on 2026-10-17. They are not ledger entries yet; the URL and ID ownership audit found no existing owner.

| ID | Source | Claim used and limit |
|---|---|---|
| **WP06-AFRICA-UGU-LEAVES-R487-20261017-S01** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Telfairia occidentalis*](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:294054-1/general-information). | Accepts *T. occidentalis* and gives its native range as western tropical Africa to southwestern Uganda. Taxonomic and range evidence only; it does not define a culinary product or amount. |
| **WP06-AFRICA-UGU-LEAVES-R487-20261017-S02** | FAO, [EcoCrop datasheet: *Telfairia occidentalis*](https://ecocrop.apps.fao.org/ecocrop/srv/en/cropView?id=10307). | Identifies the species’ edible young shoots and leaves and says leaves/shoots are eaten as vegetables. Its common-name list supports `fluted pumpkin` for the plant but lists `Igu`, not `Ugu`; the Ugu name comes from the sources below. Crop data do not establish a household measure or recipe rule. |
| **WP06-AFRICA-UGU-LEAVES-R487-20261017-S03** | Plant Resources of Tropical Africa (PROTA), [*Telfairia occidentalis* profile](https://plantuse.plantnet.org/en/Telfairia_occidentalis_%28PROTA%29). | Describes the leaves as a vegetable, reports regional market use in Benin, Nigeria, and Cameroon, and distinguishes leaves from seeds and fruit products. Its broad substitution note and source-specific preparation statements are not treated as active substitutions or universal safety instructions. Its reported composition and historical commodity figures do not establish current measures or package values. |
| **WP06-AFRICA-UGU-LEAVES-R487-20261017-S04** | RSD Institute, Yaoundé, [*Atlas des aliments de consommation courante au Cameroun*](https://rsd-institute.org/wp-content/uploads/2023/08/Atlas-Design-FR-17-avril-2021_compressed.pdf), 1st ed. (2021), section IV.1.9, p. 75. | Labels the leafy vegetable `feuilles de courge cannelée`, identifies *Telfairia occidentalis*, and describes leaves and young shoots as edible. Supports a descriptive French display and Central/West African food context; it is not a Québec terminology authority. Its nutrition table is not used for measurement or yield. |
| **WP06-AFRICA-UGU-LEAVES-R487-20261017-S05** | Folak African Foods, Kitchener, [Ugwu Leaves](https://folakafricanfoods.com/product/ugwu-leaves/), current product listing. | The title says `Ugwu Leaves`; its copy calls them `Ugu leaves (fluted pumpkin leaves)` and names *T. occidentalis*. The page offers dried/frozen options but shows no weight and a “Notify Me” status. Use it for Canadian market wording and product identity only, not current availability, alias equivalence, or measurements. |
| **WP06-AFRICA-UGU-LEAVES-R487-20261017-S06** | Green Focus Farms / Les Fermes Fondi, Gatineau, [French-language Ugu leaf product page](https://www.greenfocusfarms.ca/fr/products/ugu-leaf-frais-okongbong-flutted-pumpkin), checked 2026-10-17. | The French page uses `feuilles de citrouille flûtée` for Ugu and describes its use as a leafy vegetable. The product listing was marked sold out; this is source-specific French wording, not a Québec naming standard or evidence of current stock. |

## Root-review recommendation

Accept the single identity-only row `ingredient-ref-ugu-leaves` with the provisional French display shown above and no aliases. Keep the plant’s seed products, broad pumpkin wording, botanical name, other language-specific names, and unsourced numeric or substitution behavior outside the active row. Recheck live key and URL ownership before any shared integration. Leave Section 05 African coverage and Section Z open.

This deliverable changes only this proposal file. No tests, builds, emulator checks, or deployment were run.
