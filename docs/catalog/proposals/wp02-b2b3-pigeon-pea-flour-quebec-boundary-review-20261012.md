# WP02 B2/B3 pigeon-pea flour identity boundary — Québec naming hold

- **Reviewed:** 2026-10-12.
- **Status:** Hold recorded in the plan and batch notes. No active catalog row, alias, form, numeric data, recipe link, or ledger candidate was added.
- **Scope:** Whether to allocate a separate identity for flour made from pigeon pea (*Cajanus cajan*) seeds. This review is distinct from the accepted whole-pulse identity and does not cover any composite flour as a catalog product.
- **Source-ID prefix:** `WP02-B2B3-PIGEON-PEA-FLOUR-20261012`; checked against the live ledger and proposal corpus before drafting, with no collision found.

## Recommendation

**Hold a new pigeon-pea-flour reference.** Primary food-science studies establish that flour can be made from *Cajanus cajan* seeds and used in foods, but they use materially different starting treatments and fractions: cleaned whole seeds milled into flour; soaked, dehulled, dried, and milled seeds; and germinated-fermented whole, dehulled, rootless, or bran fractions. A separate study tests blends of cowpea with sprouted pigeon-pea flour. These are research products and formulations, not evidence of one stable retail product name or flour process. [S02–S04]

OQLF’s GDT establishes the Québec French pulse name `pois cajan`, gives English `pigeon pea`, and identifies *Cajanus cajan*. It does not list a flour term. A current Canadian retail listing names `Toor` as split pigeon peas; it does not name a flour product. I found no current Québec/Canadian standalone pigeon-pea-flour label or authoritative French flour term in this bounded review. Keep working English `pigeon pea flour` and literal French `farine de pois cajan` as research phrases only. The French wording is not accepted catalog copy. [S01, S05]

Do not add a flour alias to the existing whole-pulse row. Reopen only with a source-defined food product and a supported Québec French display, such as a Canadian/Québec package or a regional food standard that defines the flour and its source material. Until then, add no row, alias, form, density, measurement, recipe link, conversion, yield, or substitution.

| Phrase or product | Disposition | Boundary |
|---|---|---|
| `pigeon pea flour` | **Hold as a separate candidate; do not allocate a reference.** | The English phrase occurs in research literature, but the reviewed sources do not establish one current Canadian product label or market-wide processing scope. [S02–S04] |
| `farine de pois cajan` | Keep as an unvalidated working translation only. | OQLF supports `pois cajan` for the pulse, not this flour compound. Do not add it as a display or alias without a Québec product or terminology source. [S01] |
| `pigeon peas / pois cajan` | Retain on `ingredient-ref-pigeon-peas`. | Existing identity denotes the pulse. Do not equate the whole/split pulse with a ground flour product. |
| `toor dal flour`, `arhar flour`, `red gram flour` | Keep unassigned. | Current Canadian `Toor` product evidence identifies split pigeon peas; OQLF’s English `red gram` is a pulse term. Neither source establishes these qualified flour names. [S01, S05] |
| Sprouted, fermented, dehulled, rootless, bran, or composite pigeon-pea flours | Keep source-specific and out of a generic identity. | Laboratory flour fractions and pigeon-pea/cowpea or pigeon-pea/cereal blends are not interchangeable names for plain seed flour. [S02–S04] |

## Existing plan work and overlap audit

The open WP02 Section B checklist continues alternative pulse flours and other regional flour/starch products. The active pulse identity began as a WP03 pulse candidate and was integrated in the [WP06 Caribbean identity batch](../batches/wp06-caribbean-identities-integration-20261011/README.md) as `pigeon peas / pois cajan`; that work accepts the pulse name and its scoped aliases but does not resolve flour products. The current plan and proposal corpus have no focused pigeon-pea-flour identity or naming decision. Exact searches for `pigeon pea flour`, `toor dal flour`, `arhar flour`, and `farine de pois cajan` found no earlier WP02 proposal, batch decision, or ledger candidate. The broader pulse inventory is also covered in the [WP03 Section H/I review](wp03-h-regional-pulses-urd-cowpea-lupini-review-20261011.md), which does not propose pigeon-pea flour. This proposal addresses only the flour boundary and does not reopen the whole-pulse identity or the unrelated active coarse-sugar integration.

## Live catalog, forms, legacy, and ledger ownership

Read-only review snapshot taken before the separate coarse-sugar and sweet-potato-starch integrations on 2026-10-12. The current snapshot is recorded in `docs/catalog/batches/wp02-b2b3-pigeon-pea-flour-quebec-hold-20261012/README.md`.

| Surface | Current count / state | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,255 rows | `d05f2d2ef59a9862ab5cbe69501e857f5ee7dfe0747e88284447b64d1e1fdcf8` |
| Ingredient forms | 94 rows | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy import candidates | 66 rows | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| Research ledger | 1,564 records / 5,472 source entries / 4,510 distinct source IDs | `fefdb8d64fd00372f35fbcb29b79211221b7f439d280233ac5af05be94b1b157` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The existing active row is `ingredient-ref-pigeon-peas`, displayed `pigeon peas / pois cajan`, category `LEGUME_AND_PULSE`, with English alias `gungo peas` and French alias `pois d’Angole`. It has `defaultDensity: null` and `unitMappings: []`. No ingredient forms are attached to it. Its ledger record has `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; it records the accepted pulse identity and its current aliases. There is no flour reference, exact flour alias, form, legacy candidate, or ledger candidate for the proposed product phrases.

Exact normalized phrase ownership was checked across active reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs/decision text:

| Exact phrase | Active owner | Forms / legacy / ledger owner | Decision |
|---|---|---|---|
| `pigeon pea flour` | None | None | Hold as a separate candidate; do not alias to the whole-pulse reference. |
| `toor dal flour` | None | None | Keep unassigned; Canadian product evidence is for split pulses. |
| `arhar flour` | None | None | Keep unassigned; no product source or Québec term reviewed. |
| `red gram flour` | None | None | Keep unassigned; OQLF’s `red gram` is an English name for the pulse, not a flour compound. |
| `farine de pois cajan` | None | None | Keep as a research descriptor only; Québec flour naming is unresolved. |
| `farine de pois d’Angole` | None | None | Keep unassigned; no product-specific French flour name reviewed. |
| `pigeon peas` / `pois cajan` | `ingredient-ref-pigeon-peas` display fields | No exact form or legacy owner; active ledger record `ingredient-ref-pigeon-peas` | Retain as whole-pulse names. |
| `gungo peas` / `pois d’Angole` | `ingredient-ref-pigeon-peas` alias fields | No exact form or legacy owner; active ledger record `ingredient-ref-pigeon-peas` | Preserve current scoped aliases. |

The app’s ingredient search prefers complete normalized word phrases, then falls back to partial matching. A bare `pigeon pea` query may surface the active `pigeon peas` row through the partial-match fallback; the full phrase `pigeon pea flour` does not match that row and is not present in any active alias or form term. A future flour row would need its own identity; assigning the phrase to `ingredient-ref-pigeon-peas` would collapse a processed flour product into a pulse identity and its `LEGUME_AND_PULSE` category. The current Canadian product wording `Toor` is not an alias on the active row; do not synthesize `toor dal flour` from that pulse name.

## Bundled recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for `pigeon pea flour`, `toor dal flour`, `arhar flour`, `red gram flour`, `farine de pois cajan`, `farine de pois d’Angole`, `pigeon peas`, `pois cajan`, `gungo peas`, and `Cajanus cajan`. The scan found **zero full-recipe text matches**, **zero ingredient-line phrase matches**, and **zero recipe lines linked** to `ingredient-ref-pigeon-peas`.

At the proposal's review snapshot, the manifest-ordered recipe corpus contained 114 files / 1,123 ingredient rows / 753,736 bytes with fingerprint `3a2a0736febcca77bc8cdc058e1c1eec2c21032f4b1e573c0129bb569cd62aa3`. After the separate same-day coarse-sugar recipe link, a fresh scan retained zero exact phrase hits; the current corpus fingerprint and size are in the batch README. The bundled result does not imply no broader culinary use.

## Product, form, and numeric limits

- The 2022 akara study prepares a test flour by soaking pigeon-pea seeds, dehulling, oven-drying, grinding, and testing sieved particle sizes. The 2025 study separately discusses plain whole-seed flour and germinated-fermented whole, dehulled, rootless, and bran fractions. Those methods establish research variants; they do not define catalog forms for a source-neutral retail ingredient. [S02–S03]
- The cowpea/pigeon-pea blend ratios in the moi-moi study are experimental composite formulations, not generic pigeon-pea-flour measures or recipe substitution ratios. Do not add cowpea, fonio, or other cereal/legume blend wording as an alias. [S04]
- Keep `defaultDensity` null and `unitMappings` empty on the active pulse row. Research bulk-density, absorption, particle-size, or composition values are study- and method-specific and do not establish a household cup measure or reusable conversion. No source reviewed provides a Québec/Canadian package-to-volume mapping for pigeon-pea flour.
- Add no flour form, form conversion, pulse-to-flour conversion, household measure, recipe link, yield, direct replacement rule, or contextual substitution. `not_yet_researched` remains the state of the existing pulse ledger record’s measurement and substitution fields.

## Source register

All pages were accessed on 2026-10-12. The source IDs below are proposal-local and were checked against the live ledger before drafting; no sources were appended to the ledger.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2B3-PIGEON-PEA-FLOUR-20261012-S01** | Office québécois de la langue française, [*pois cajan* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296902/pois-cajan). The entry lists the preferred French pulse terms `pois cajan`, `pois du Congo`, `pois d’Angola`, `ambrevade`, and `pois d’ambrevade`; English terms include `pigeon pea` and `red gram`; Latin name *Cajanus cajan*. | Authoritative Québec base-pulse terminology; last updated in 1991 and does not name a flour product or approve `farine de pois cajan`. |
| **WP02-B2B3-PIGEON-PEA-FLOUR-20261012-S02** | Adindu Linus-Chibuezeh et al., [“Effect of Different Particle Sizes on The Akara Making Potentials of Pigeon Pea Flour”](https://online-journal.unja.ac.id/ifstj/article/view/14698), *Indonesian Food Science and Technology Journal* 5(1), published 2022-02-28, DOI [10.22437/ifstj.v5i1.14698](https://doi.org/10.22437/ifstj.v5i1.14698). Reports a flour produced from soaked, dehulled, oven-dried, and ground *Cajanus cajan* seeds; compares particle-size treatments and use in akara. | Primary laboratory study; supports flour existence and a source-specific preparation, not a retail standard, Québec name, generic measure, or universal use. |
| **WP02-B2B3-PIGEON-PEA-FLOUR-20261012-S03** | Sunday Samuel Sobowale and Bukola Funmilola Olatunji, [“Effect of Germination and Subsequent Fermentation Period on the Functional, Color, and Antinutrients of Pigeon Pea (*Cajanus cajan*) Flour and Its Structural Parts”](https://onlinelibrary.wiley.com/doi/10.1002/fsn3.70750), *Food Science & Nutrition* 13(8), published 2025-07-31, DOI [10.1002/fsn3.70750](https://doi.org/10.1002/fsn3.70750). Primary study distinguishes whole flour and germinated-fermented whole, dehulled, rootless, and bran fractions. | Experimental food-science terminology and methods; not evidence that those fractions share a consumer name or form. |
| **WP02-B2B3-PIGEON-PEA-FLOUR-20261012-S04** | Arukwe, Okoli, and Chimezie, [“Functional, chemical and organoleptic properties of moi-moi prepared from blends of cowpea and sprouted pigeon pea flours”](https://www.ajol.info/index.php/swj/article/view/256811), *Science World Journal* 18(3), 2023, DOI [10.4314/swj.v18i3.17](https://doi.org/10.4314/swj.v18i3.17). Tests cowpea with sprouted pigeon-pea flour in different blend ratios for a steamed bean paste. | Primary composite-food study; its recipes and ratios do not define a pure flour product, household conversion, or substitution. Direct page access returned 403; indexed article text and DOI metadata were available. |
| **WP02-B2B3-PIGEON-PEA-FLOUR-20261012-S05** | Walmart Canada, [Sitara Split Pigeon Peas (Toor), 4 lb](https://www.walmart.ca/en/ip/Sitara-Split-Pigeon-Peas-Toor-4LB-1-8-kg/4A9N84CVD7O3). Current product listing calls the product split pigeon peas, identifies the food form as halves, and says it is packaged in Canada. | Retailer product copy for a split pulse, not a flour label or a Québec French naming source. It does not support aliases such as `toor dal flour` or `farine de pois cajan`. |

## Disposition and reopening evidence

Keep a documented **hold** for pigeon-pea flour. The evidence supports a distinct flour material in research but does not settle a source-independent plain-flour scope, a current Canadian consumer product phrase, or the Québec French flour name. Do not create a candidate alias or reference ID from the literal translation. Reopen if a Canadian/Québec package or authoritative regional food standard names pigeon-pea flour and specifies whether it is plain seed flour, dehulled/sprouted/fermented flour, or a composite product. The existing whole-pulse identity and its accepted aliases remain unchanged.
