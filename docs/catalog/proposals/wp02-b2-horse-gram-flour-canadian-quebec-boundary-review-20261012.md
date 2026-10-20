# WP02 B2 horse-gram flour — Canadian and Québec product boundary hold

- **Reviewed:** 2026-10-12.
- **Status:** Proposal only. No shared catalog, form, legacy, ledger, plan, roadmap, recipe, generated file, or test was changed.
- **Scope:** Whether flour and powder products made from horse gram (*Macrotyloma uniflorum*) warrant an identity separate from the existing whole-pulse reference `ingredient-ref-horse-gram`. This is a B2 alternative-pulse-flour review, separate from pigeon-pea flour, sweet-potato-starch aliases, and the active coarse-sugar work.
- **Source-ID prefix:** `WP02-B2-HORSE-GRAM-FLOUR-20261012`; checked against the ledger and proposal corpus before drafting, with no collision found. IDs below are proposal-local; no sources were appended to the ledger.

## Recommendation

**Hold a new horse-gram-flour reference and all flour/powder aliases.** Research and manufacturer sources show horse-gram flour exists, including plain, soaked, roasted, cooked, germinated, and fermented research products. A Canadian seller also lists `Horse Gram Powder / Kollu Powder`, but that listing does not say how its powder was made or establish that it is baking flour. The indexed Canadian marketplace result for a named horse-gram flour is weak product evidence and could not be opened directly. These sources establish plausible English phrases, not one source-neutral product scope. [S03–S07]

For fr-CA, CFIA uses `grain de cheval` for *M. uniflorum* seed in its bilingual organic-grain code table. That supports the existing whole-pulse display only. A targeted search found no OQLF entry or current Québec/Canadian French label for horse-gram flour. Do not turn the official seed name into the unverified compound `farine de grain de cheval`. [S02, S08]

Do not attach flour or powder names to the whole-pulse row. Reopen if a Québec/Canadian bilingual package or authoritative food-product standard identifies the flour, names it in French, and clarifies whether its scope is plain milled seed or a processed product. Until then, add no reference, alias, form, density, mapping, measurement, conversion, recipe link, yield, or substitution.

| Phrase or product | Disposition | Boundary |
|---|---|---|
| `horse gram flour` | **Hold as a separate candidate; do not allocate a reference.** | Research and a manufacturer page use this English phrase, but no reviewed source establishes a Québec/Canadian French flour name or a stable consumer-product scope. [S03–S05] |
| `horsegram flour`, `kulthi flour`, `kulthi atta` | Keep unassigned. | `Kulthi` is an existing alias for the whole pulse. One manufacturer pairs `Kulathi` with its own flour, but that is not enough to move `kulthi` or its transliteration variants onto a new flour identity. [S05] |
| `horse gram powder`, `kollu powder`, `kollu maavu` | Keep separate from both the whole pulse and the held flour candidate. | The Canadian `Horse Gram Powder / Kollu Powder` product page does not document milling, roasting, sprouting, or a recipe-flour use. Powder wording alone does not establish equivalence to flour. [S06] |
| `horse gram / grain de cheval`, `horsegram`, `kulthi` | Retain on `ingredient-ref-horse-gram`. | Existing identity denotes the food seed, not a milled or otherwise processed product. [S01–S02] |
| `horse bean flour`, `farine de fèves de cheval` | Reject as horse-gram aliases. | CFIA separately classifies horse bean as a *Vicia faba* type and horse gram as *Macrotyloma uniflorum*. [S02] |
| `farine de grain de cheval` | Keep as an unvalidated literal translation only. | CFIA supports `grain de cheval` for the seed, not this flour phrase. No Québec flour label or terminology entry was found. [S02, S08] |

## Open-plan and overlap audit

WP02 Section B leaves alternative pulse flours and regional flour/starch products open. The whole-pulse identity `ingredient-ref-horse-gram` was accepted in the WP03 Section H regional-pulse review and integrated later; that review explicitly treats the reference as *Macrotyloma uniflorum* food seed and does not review flour or powder products. Existing WP02 B2/B3 files and batches cover green-pea and lentil flour holds, mung-bean flour, roasted-grain products, and several regional starches, but a repository search found no prior horse-gram-flour decision. This review addresses only the flour/powder boundary; it does not reopen the whole-pulse identity or the adjacent pigeon-pea-flour decision.

Related files reviewed: the WP02 Section B checklist in `docs/RecipeBook-global-ingredient-catalog-plan.txt`; `docs/catalog/proposals/wp02-b2-b3-flour-starch-residual-review-20261010.md`; `docs/catalog/proposals/wp02-b2-b3-next-flour-starch-gap-review-20261012.md`; `docs/catalog/proposals/wp02-roasted-flour-product-boundaries-review-20261011.md`; `docs/catalog/proposals/wp02-b2b3-pigeon-pea-flour-quebec-boundary-review-20261012.md`; `docs/catalog/proposals/wp03-h-regional-pulses-urd-cowpea-lupini-review-20261011.md`; and `docs/catalog/batches/wp03-h-regional-pulses-integration-20261011/README.md`.

## Live ownership audit

Read-only snapshot of the shared worktree on 2026-10-12. Counts and hashes describe the files inspected for this review.

| Surface | Current count / state | SHA-256 |
|---|---:|---|
| Active ingredient references | 1,256 rows | `8315070a479a50d0c06009d804c802bfc9506066e4da3af028eed7da7e1c7063` |
| Ingredient forms | 94 rows | `55cf0c6432774840d9e452a81240802fa54b74196d8a8d90931bc5620fb3183b` |
| Legacy import candidates | 66 candidates | `bedef9b12dca5306eb035e411703fcbf58ea61c24046df4dc5b526b8df6a39f` |
| Research ledger | 1,565 records / 5,481 source entries / 4,519 distinct source IDs | `221b22c17eff1a7d135caa81225477b601b92dd1d6f0fa5f8b7cd41b5b4f8ec6` |
| Seed manifest | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |

The active row is `ingredient-ref-horse-gram`, displayed `horse gram / grain de cheval`, category `LEGUME_AND_PULSE`, with English aliases `horsegram` and `kulthi`; it has `defaultDensity: null` and `unitMappings: []`. No ingredient form is attached. Its ledger record is `identityState: verified`; its measurement and substitution research states remain `not_yet_researched`. The ledger documents the accepted seed identity and the narrow `kulthi` alias. No flour or powder reference, exact flour/powder alias, form, legacy candidate, or ledger candidate exists.

Accent-, punctuation-, and case-normalized phrase ownership was checked across active reference display names and aliases; form labels and match terms; legacy candidate names and aliases; and ledger text. The proposed source-ID prefix was checked separately against all existing ledger source IDs.

| Exact phrase | Active reference owner | Form / legacy / ledger candidate owner | Decision |
|---|---|---|---|
| `horse gram flour` | None | None | Hold as a separate candidate; do not alias to the pulse. |
| `horsegram flour` | None | None | Keep unassigned; no exact product-name owner. |
| `kulthi flour`, `kulthi atta` | None | None | Keep unassigned; preserve bare `kulthi` on the whole-pulse identity. |
| `horse gram powder`, `kollu powder`, `kollu maavu` | None | None | Keep unassigned; the Canadian powder listing does not define a flour product. |
| `farine de grain de cheval`, `farine de kulthi`, `farine de kollu` | None | None | Keep as unvalidated research phrases; no Québec flour naming evidence was found. |
| `horse gram`, `grain de cheval` | `ingredient-ref-horse-gram` display fields | Active ledger record `ingredient-ref-horse-gram`; no exact form or legacy owner | Retain for the whole pulse. |
| `horsegram`, `kulthi` | `ingredient-ref-horse-gram` English alias fields | Active ledger record `ingredient-ref-horse-gram`; no exact form or legacy owner | Retain current aliases on the whole pulse. |

The CFIA source distinguishes the neighboring English phrase `horse bean` from horse gram by botanical scope; do not add it to a horse-gram row. The source also uses `fèves de cheval` for a *Vicia faba* type, which is not a French synonym for *M. uniflorum*. [S02]

## Picker phrase boundary

The ingredient picker prefers complete normalized word phrases and falls back to substring matching. Today, `horse gram` and `kulthi` return the existing whole-pulse row. Full queries `horse gram flour`, `horse gram powder`, `kulthi atta`, `kollu powder`, and `farine de grain de cheval` return no current result; no full flour/powder phrase is stored in a display, alias, or form term. A future row displayed as `horse gram flour` would also appear for the shorter `horse gram` query, alongside the pulse row, because that two-word phrase occurs inside the longer display. That is an expected related-product result, not a reason to merge flour into the pulse identity. Do not add a flour phrase as an alias to `ingredient-ref-horse-gram`.

## Bundled recipe demand

All 114 manifest-listed recipe files and 1,123 ingredient rows were scanned for `horse gram flour`, `horsegram flour`, `kulthi flour`, `kulthi atta`, `horse gram powder`, `horsegram powder`, `kollu powder`, `kollu maavu`, `farine de grain de cheval`, `farine de kulthi`, `farine de kollu`, `horse gram`, `grain de cheval`, `kulthi`, and *Macrotyloma uniflorum*. The scan found **zero full-recipe text matches**, **zero ingredient-line phrase matches**, and **zero recipe lines linked** to `ingredient-ref-horse-gram`.

The current manifest-ordered corpus contains 114 recipe files, 1,123 ingredient rows, and 753,792 bytes. Its fingerprint is `42e3a13c9b9a1630c85296b4dd65b57b7b849bb07171a02d238d3524944ae70a`. This bounded result records no bundled demand; it does not imply that the flour lacks regional culinary use.

## Product, form, numeric, and substitution limits

- The Indian food-science studies prepare and test different products: dehulled and defatted cotyledon flour; raw, soaked, roasted, cooked, germinated, and fermented flour; and stone-ground horse-gram flour described by one manufacturer. Functional properties change with preparation. These studies are evidence that flour products exist, not a common retail specification or basis for merging processed flour with the whole pulse. [S03–S05]
- The Nutty Yogi page gives a brand-specific one-cup-for-one-cup wheat-flour replacement suggestion and says to combine the flour with another flour for its baking use. Do not convert that advice into a generic density, unit mapping, or cross-ingredient substitution. The page is for a named Indian product, is currently marked out of stock, and does not establish Québec use. [S05]
- The Canadian `Horse Gram Powder / Kollu Powder` page shows a 100 g package and is currently marked sold out. The package size is not a household conversion; the listing does not say whether the powder is plain milled seed, roasted flour, sprouted powder, or a supplement-style product. [S06]
- Keep `defaultDensity` null and `unitMappings` empty on the active whole-pulse row. Do not add flour/powder forms, bulk density, cup weight, household measures, or a pulse-to-flour conversion. Study values for absorption, bulk density, particle behavior, or composition are tied to their specific dehulling, defatting, processing, and test methods. [S03–S04]
- Do not add dry-to-cooked yield, flour yield, recipe links, or a substitution rule for chickpea, lentil, or wheat flour. Research comparisons and partial-blend experiments do not establish a reusable recipe-context ratio. The existing pulse ledger measurement and substitution states remain `not_yet_researched`.

## Source register

Sources were accessed or rechecked on 2026-10-12. IDs below are proposal-local and were checked against the ledger before drafting.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-B2-HORSE-GRAM-FLOUR-20261012-S01** | Indian Council of Agricultural Research, Indian Institute of Pulses Research, [Horsegram](https://www.icar-iipr.org.in/horsegram/). Identifies horsegram as *Macrotyloma uniflorum*, describes it as a food legume crop, and notes Canadian imports of horse gram. | Authoritative crop and seed context; it does not define a flour product, Canadian flour label, Québec French name, or culinary measure. |
| **WP02-B2-HORSE-GRAM-FLOUR-20261012-S02** | Canadian Food Inspection Agency, [English organic seed and grain extension codes](https://inspection.canada.ca/en/food-labels/organic-products/import-requirements/organic-ogd-codes-seeds-amp-grains/new-ogd-extension-codes-organic-seeds-and-grai) and [French version](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme). The table pairs horse gram (*M. uniflorum*) with French `grain de cheval` for seed, bulk grain, and packaged organic grain; it separately lists horse bean under *Vicia faba* var. *equina*. | Canadian organic import commodity wording for grain, not an OQLF term or a flour label. It supports the existing seed display and botanical separation only. |
| **WP02-B2-HORSE-GRAM-FLOUR-20261012-S03** | Y. N. Sreerama et al., [“Nutrients and antinutrients in cowpea and horse gram flours in comparison to chickpea flour: Evaluation of their flour functionality”](https://ir.cftri.res.in/10575/1/Food%20Chemistry%2C%20Volume%20131%2C%20Issue%202%2C%2015%20March%202012%2C%20Pages%20462-468.pdf), *Food Chemistry* 131 (2012), 462–468, DOI [10.1016/j.foodchem.2011.09.008](https://doi.org/10.1016/j.foodchem.2011.09.008). Primary study mills dehulled horse-gram cotyledons, defats flour samples for the experiment, and compares laboratory properties with cowpea and chickpea flour. | Research material and lab methods, not a standard retail product or Québec name. Its lab values and composite-food discussion do not establish kitchen density, substitution, or a consumer flour process. |
| **WP02-B2-HORSE-GRAM-FLOUR-20261012-S04** | B. H. Sarvani et al., [“Effect of Processing and Fermentation on Functional Properties and on Anti-nutritional Factors in Horse Gram (*Macrotyloma uniflorum*)”](https://journalcjast.com/index.php/CJAST/article/view/3032), *Current Journal of Applied Science and Technology* 39(37) (2020), 38–45, DOI [10.9734/cjast/2020/v39i3731086](https://doi.org/10.9734/cjast/2020/v39i3731086). Primary study compares raw flour with soaked, roasted, cooked, germinated, and fermented samples. | Experimental methods and functional/nutrient findings; not consumer-label evidence, a French name, a flour-grade taxonomy, or transferable numeric behavior. |
| **WP02-B2-HORSE-GRAM-FLOUR-20261012-S05** | Nutty Yogi, [High Protein Horse Gram Flour / Kulathi](https://nuttyyogi.com/products/horse-gram-flour-kulathi). Manufacturer labels its product as horse-gram flour / Kulathi, describes it as stone-ground, suggests roti and baking use, and gives brand-specific cup advice. The page showed the 400 g product out of stock at access. | One Indian manufacturer's own product, not Canadian or Québec market naming. Its use and replacement advice is not a generic measure or substitution rule. |
| **WP02-B2-HORSE-GRAM-FLOUR-20261012-S06** | Poombukar Naturals, [100% Natural Horse Gram Powder / Kollu Powder](https://www.poombukar.ca/products/natural-horse-gram-powder-kollu-powder-100-grams). Canadian storefront product title uses `Horse Gram Powder` and `Kollu Powder`; its description gives *Macrotyloma uniflorum*. The 100 g listing showed sold out at access. | Canadian English powder listing, not a Québec French flour label. It does not disclose the milling/roasting/sprouting process or establish use as recipe flour; its health claims are not relied upon. |
| **WP02-B2-HORSE-GRAM-FLOUR-20261012-S07** | Silkrute Canada, [Nutty Yogi Horse Gram Flour / Kulthi / Kulith Aata, 400 g pack](https://www.silkrute.ca/grocery/cooking/flour/nutty-yogi-horse-gram-flour-kulthi-kulith-aata-high-protein-400-gm-pack-of-2/). Current indexed Canadian marketplace title lists the flour name and pack size. | Direct page retrieval returned a cache miss; treat the indexed title as weak evidence of a Canada-facing English search phrase only. No package panel, French wording, Québec availability, or product specification was verified. |
| **WP02-B2-HORSE-GRAM-FLOUR-20261012-S08** | Bounded terminology search of the OQLF GDT and Québec/Canadian French product listings for horse-gram flour wording. The official CFIA French code source found in S02 uses `grain de cheval` for the seed; no matching OQLF flour entry or Québec/Canadian French flour label was located. | A bounded no-result finding, not proof that a French term or product does not exist elsewhere. No literal translation is promoted to catalog copy. |

## Disposition and reopening evidence

Record a proposal-level **hold** for horse-gram flour and powder. Keep the verified `ingredient-ref-horse-gram` whole-pulse identity and its aliases unchanged. Do not create an alias or derive a French display from `grain de cheval`. Reopen with a current Canadian or Québec food-product source that identifies horse-gram flour as an ingredient, supplies a supportable French name, and resolves whether plain, roasted, sprouted, fermented, or supplement-style powder products share the intended scope. Until that evidence is available, no shared catalog or ledger change is recommended.
