# WP02 A6 round five: Mandua finger-millet flour aliases

## Review record

- **Reviewed:** 2026-10-13.
- **Status:** Integrated on 2026-10-13; see the integration record at the end of this proposal.
- **Owner:** WP02 A6 regional-grain-flour review. Root coordinator owns any shared-data integration.
- **Scope:** Decide whether the regional English name `mandua` and two flour-qualified phrases belong on the existing finger-millet grain and flour references. This is an alias review, not a new grain/flour identity or a density/substitution review.
- **A6 checklist:** The parent item to continue reviewing buckwheat, sorghum, millet, quinoa, amaranth, fonio, and other regional grain flours remains open in [the active plan section](../../RecipeBook-global-ingredient-catalog-plan.txt#L1278). The just-integrated `milo flour` hold is recorded in [the round-four batch](../batches/wp02-a6-milo-flour-picker-hold-integration-20261013/README.md); it is not repeated here.
- **Archive audit:** The A6 proposal/batch archive has no earlier decision for `mandua flour` or `mandua ka atta`. The [ragi-atta review](wp02-a6-ragi-atta-finger-millet-flour-alias-review-20261012.md) cites Mandua in the FSSAI grain-name crosswalk but decided only the exact alias `ragi atta`; it did not allocate Mandua to either live row. The Kurakkan review likewise did not assess this term against the current Canadian Mandua product wording. This proposal reuses that existing FSSAI source ID and adds no duplicate FSSAI source entry.
- **Recommendation:** **Integrate** `mandua` on the finger-millet grain row, plus `mandua flour` and `mandua ka atta` on the existing finger-millet-flour row. Add no other Mandua spellings, French aliases, forms, recipe links, numeric data, or substitution rules.

## Recommendation and evidence boundary

FSSAI's current consolidated cereal standard names finger millet as `Ragi or Mandua` and identifies *Eleusine coracana*; it separately defines ragi flour as the product of milling dried mature grains of that species. Himachal Pradesh Agriculture lists Mandua among local names for finger millet, and the Government of India's Department of Science and Technology independently describes Mandua as the Uttarakhand name for finger millet and describes grinding dehusked millet into flour. APEDA's Himachal value-added-products catalogue lists `Mandua Flour`. Together these primary and regional sources establish the grain relationship and flour class without asserting one uniform grind or process. [WP02-A6-RAGI-ATTA-20261012-S01; WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S01–S03]

A current Canadian-facing Silkrute listing titles a product as ragi/finger-millet flour and includes the exact phrase `Mandua ka Atta`; a second Canadian storefront listing names `Mandua` among the names for ragi flour. These are retailer descriptions rather than Canadian manufacturing or terminology standards. Their indexed snapshots are several months old and direct page retrieval returned HTTP 403 during this review, so they support Canadian-facing wording only; this proposal makes no current-stock claim. [S04–S05]

| Phrase or field | Disposition | Evidence limit |
|---|---|---|
| `mandua` | Add to `aliasesEn` on `ingredient-ref-finger-millet`. | The regional and primary sources identify it as a grain name for *E. coracana*. Do not add it to the flour alias array. [WP02-A6-RAGI-ATTA-20261012-S01; WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S01–S02] |
| `mandua flour` | Add to `aliasesEn` on `ingredient-ref-finger-millet-flour`. | APEDA uses this exact product name; Canadian-facing product copy independently places Mandua in a finger-millet-flour context. [WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S03–S05] |
| `mandua ka atta` | Add to `aliasesEn` on `ingredient-ref-finger-millet-flour`. | The exact phrase appears in the Canadian-facing product title, alongside Ragi Flour and Finger Millet Flour. [WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S04] |
| French display and aliases | Retain `éleusine cultivée` for grain and `farine de ragi` for flour; add no `mandua` French alias. | Existing Canadian French and Québec evidence supports the current displays; the sources in this review do not establish `farine de mandua`. [WP03-S191, WP03-S194, WP06-SA-20261010-S05] |
| `mandua atta`, `mandua aata`, `mandua ka aata`, `mandwa`, `madua`, `kodra flour`, `farine de mandua` | Leave unassigned in this proposal. | These are outside the exact English phrases reviewed here; do not derive spelling variants or French terms from the base name. |
| New identity, form, or legacy candidate | Do not create. | Both aliases resolve to already verified grain/flour references. |

The word “Mandua” is used for the intact grain and in names for flour made from that grain. The product phrasing therefore resolves to the existing flour row, while the unqualified name belongs as an alias on the grain row. This distinction keeps the two catalog identities separate and lets the picker show both choices for the bare term.

## Current exact ownership and normalized picker projection

The read-only audit used the same search-key rules as `IngredientSearch.kt`: lowercase with Unicode NFKD, fold accents and listed ligatures, replace punctuation with spaces, and collapse whitespace. The picker prefers complete normalized word-phrase matches across reference names/aliases and attached form terms; it uses partial matching only when no complete phrase matches. Exact ownership was checked across active reference names/aliases/IDs, form labels/match terms/IDs, legacy-candidate names/aliases/IDs, and ledger record IDs.

There are currently **no forms attached** to either `ingredient-ref-finger-millet` or `ingredient-ref-finger-millet-flour`. No legacy candidate or ledger record ID owns a Mandua term. The word appears in the existing FSSAI source record cited by the earlier ragi-atta review, but source prose is not an active picker owner.

| Normalized key | Current exact owner | Proposed exact owner |
|---|---|---|
| `mandua` | None | `ingredient-ref-finger-millet` alias |
| `mandua flour` | None | `ingredient-ref-finger-millet-flour` alias |
| `mandua ka atta` | None | `ingredient-ref-finger-millet-flour` alias |
| `mandua atta`; `mandua aata`; `mandua ka aata`; `mandwa`; `madua`; `farine de mandua` | None | None |
| `ingredient-ref-mandua-flour` | No such ID in references, forms, legacy candidates, or ledger record IDs | No new ID proposed |
| `finger millet`; `ragi`; `kurakkan` | `ingredient-ref-finger-millet` | Retain; append `mandua` only |
| `finger millet flour`; `ragi flour`; `nachni flour`; `ragi atta`; `kurakkan flour`; `farine de ragi` | `ingredient-ref-finger-millet-flour` | Retain; append `mandua flour` and `mandua ka atta` only |

The following is a static projection from current search terms plus the exact proposed aliases, not an app/runtime picker test:

| Query | Current result | Projected result |
|---|---|---|
| `mandua` / `Mandua` | No result | `ingredient-ref-finger-millet` and `ingredient-ref-finger-millet-flour` |
| `mandua flour` | No result | `ingredient-ref-finger-millet-flour` only |
| `mandua ka atta` | No result | `ingredient-ref-finger-millet-flour` only |
| `mandua atta` | No result | No result; `ka` is not discarded by normalization |
| `mandwa`; `madua`; `farine de mandua` | No result | No result |
| `atta` | Eight broad flour/atta rows, including finger-millet flour | Same eight rows; this proposal does not change the broad result |
| `ragi`; `finger millet` | Finger-millet grain and flour | Same two rows |
| `finger millet flour`; `farine de ragi` | Finger-millet flour only | Same flour row |

The static query projection confirms that qualified searches select only flour and that the bare source-grain term presents grain and flour together. Do not add an alias `mandua` on the flour row: the complete phrase matches already return the flour row when the user enters the bare name, and the grain alias supplies the distinct intact-grain choice.

## Exact proposed catalog fields

If accepted, apply only these alias additions:

| Reference | Current English aliases | Proposed English aliases | Fields retained |
|---|---|---|---|
| `ingredient-ref-finger-millet` | `ragi`, `kurakkan` | append `mandua` | `finger millet / éleusine cultivée`, `GRAIN_AND_CEREAL`, French aliases `[]`, `defaultDensity: null`, `unitMappings: []` |
| `ingredient-ref-finger-millet-flour` | `ragi flour`, `nachni flour`, `ragi atta`, `kurakkan flour` | append `mandua flour`, `mandua ka atta` | `finger millet flour / farine de ragi`, `FLOUR_AND_STARCH`, French aliases `[]`, `defaultDensity: null`, `unitMappings: []` |

Create no `ingredient-ref-mandua-flour`; do not add a form or legacy candidate, and do not change reference categories, French displays, recipe links, or the current measurement/substitution research records. If integrated, attach the new source entries to the existing grain/flour ledger records and add one accepted alias decision to each record, citing only the sources relevant to that owner. No measurement observation or substitution finding ID is proposed.

## Forms, measurements, density, and substitution limits

- Neither live reference currently has an attached form. The proposed words describe the existing grain and its milling product, not a preparation state, grade, roast, sprout, or other distinct form. Add no form.
- The live grain row has `defaultDensity: null`, `unitMappings: []`, and ledger states `measurementState: not_yet_researched` / `substitutionResearchState: not_yet_researched`. Keep them unchanged.
- The flour row also has `defaultDensity: null`, `unitMappings: []`, and no attached form. Its ledger states are `measurementState: researched_supported` and `substitutionResearchState: blocked_pending_evidence`; the existing record has four bulk-density observations and one blocked wheat-replacement finding. No new Mandua-specific measure or substitution source was found.
- Existing ledger observations for laboratory-prepared light-brown flour are 0.55 ± 0.07 g/mL loose and 0.79 ± 0.04 g/mL packed; dark-brown flour is 0.47 ± 0.04 g/mL loose and 0.77 ± 0.00 g/mL packed. The study used a 10 g sample in a 25 mL cylinder and sifted flour to 500 μm. Table 2 prints `g/g`, while the article prose and method report g/mL or g/cm³. These are sample-, color-, preparation-, and method-specific observations, not a default for a Mandua-branded Canadian product. Keep `defaultDensity` null and unit mappings empty. [WP02-A6-KURAKKAN-FLOUR-20261012-S08]
- The Himachal Pradesh Agriculture page gives recipe-specific ragi-flour amounts (including 1/2 cup in its biscuit formula and 1 cup in its laddu formula). Those are formula quantities, not a mass-per-cup result or a general household mapping for Mandua flour. Silkrute's listed 1 kg and 1.5 kg package sizes are package masses, not recipe measures. Do not turn either source into an active conversion. [WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S01, WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S04–S05]
- The existing ledger finding blocks general wheat-flour replacement: one controlled finger-millet bread study tested 10–40% replacement in a 100 g flour formula with 15 mL water held constant and reported poor prototypes above 50%. That result is formula-specific; it does not justify a general ratio for rotis, cakes, cookies, sauces, or other doughs. Keep the existing finding and no active substitution rule unchanged. [WP02-A6-KURAKKAN-FLOUR-20261012-S09]

## Bundled recipe demand

The scan covered every manifest-listed recipe JSON file and every string field in every ingredient row. It used normalized whole-phrase matching for `mandua`, `mandua flour`, `mandua ka atta`, `mandua atta`, `mandua aata`, `mandua ka aata`, `mandwa`, `madua`, `finger millet`, `finger millet flour`, `ragi flour`, `ragi atta`, `nachni flour`, `kurakkan flour`, `farine de ragi`, `farine de mandua`, and both target reference IDs.

| Corpus measure | Result |
|---|---:|
| Manifest-listed recipe files | 114 |
| Ingredient rows | 1,123 |
| Files with any candidate phrase | 0 |
| Ingredient rows with any candidate phrase | 0 |
| Direct recipe links to `ingredient-ref-finger-millet` | 0 |
| Direct recipe links to `ingredient-ref-finger-millet-flour` | 0 |

No recipe link, amount, ingredient row, or recipe text change is proposed.

## Baseline snapshot and collision audit

The snapshot below was read before drafting on 2026-10-13. File hashes cover exact bytes. The ordered recipe-corpus fingerprint hashes each manifest-ordered relative path, a NUL byte, the exact recipe bytes, and a final NUL byte.

| Surface | Snapshot | SHA-256 / fingerprint |
|---|---:|---|
| Active ingredient references | 1,338 rows; 428,802 bytes | `4c5ebe5497543acde7d6d6aca9e50bea928cee477c538ce795910589e90239e3` |
| Ingredient forms | 98 rows; 73,589 bytes | `b7b179c0a408455045b8f55713fbd95941125e5c4903e6105a8cb5e004f5e61c` |
| Legacy import candidates | 64 rows; 15,264 bytes | `69ae37cedb0c5c03743f65da099c1f6e0ab6fbc3ae41e50dca192bcb370a3005` |
| Research ledger | 1,646 records; 6,248 source entries; 5,251 distinct source IDs; 338 measurement observations; 190 substitution findings; 8 unit conversions; 6,217,304 bytes | `ae3605b31fb48d69b6e41242fa7a8ee08b2f7c56e22f86a129fa3f6fd564026d` |
| Seed manifest | 114 recipe paths; 12,011 bytes | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-ordered recipe corpus | 114 files; 1,123 ingredient rows; 753,792 bytes | `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c` |
| Generated `BundledIngredientCatalog.kt` | 1,338 references; 586,698 bytes | `f7fab835ba4b02f301c4ad966b52c78553bab66ba7801528a290f4988131fbd9` |

**Source-ID collision audit:** `WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S01` through `S05` were absent from the current ledger and all archived catalog proposal/batch Markdown and JSON files before this draft. The new IDs are proposal-local here. Existing IDs cited below are reused, not duplicated.

**Finding-ID collision audit:** No new measurement-observation ID or substitution-finding ID is proposed. The existing finger-millet-flour observation IDs are `finger-millet-flour-light-brown-loose-bulk-density-mudau-2022`, `finger-millet-flour-light-brown-packed-bulk-density-mudau-2022`, `finger-millet-flour-dark-brown-loose-bulk-density-mudau-2022`, and `finger-millet-flour-dark-brown-packed-bulk-density-mudau-2022`; its existing substitution finding is `finger-millet-flour-general-wheat-replacement-blocked-20261012`. All are retained unchanged.

**Owner and candidate-ID audit:** `mandua`, `mandua flour`, `mandua ka atta`, and `ingredient-ref-mandua-flour` had no exact normalized owner in references, forms, legacy candidates, or ledger record IDs. The existing finger-millet grain and flour IDs remain the only recommended owners. The full reference/form/legacy/ledger-source snapshot and picker results above are the baseline for any later integration.

## Sources

The five new source IDs below were checked for uniqueness before drafting. They support identity/name assignment only unless the limits column says otherwise.

| ID | Source and evidence | Limits |
|---|---|---|
| **WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S01** | Himachal Pradesh Department of Agriculture, [Finger Millet](https://agriculture.hp.gov.in/en/finger-millet/), accessed 2026-10-13. The official page lists local names including Mandua, identifies finger millet as *Eleusine coracana*, and includes recipes using ragi flour. | Regional grain-name and species evidence. The page's recipe cups are formula-specific; they do not define a household conversion or Mandua-product density. |
| **WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S02** | Government of India, Department of Science and Technology, [A millet de-huller brings fortunes through value-added products in rural Uttarakhand](https://dst.gov.in/millet-de-huller-brings-fortunes-through-value-added-products-rural-uttarakhand), accessed 2026-10-13, last updated 2021-04-09. Calls Mandua the Uttarakhand name for finger millet and describes dehulling then grinding millet into flour. | Primary regional/process context; does not establish a retail grade, Québec term, or recipe conversion. Its processing yield text is not a recipe yield. |
| **WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S03** | Agricultural and Processed Food Products Export Development Authority (APEDA), [Himachal Pradesh Millet Value Added Products Catalogue](https://apeda.gov.in/milletportal/files/HP_Millet_Value_Added_Products_Catalogue.pdf), section 3.2, PDF p. 8. The indexed catalogue lists `Mandua Flour` among ready-to-cook products. | Government export-promotion catalogue supports the exact product phrase. The PDF timed out in direct retrieval; no product availability, flour specification, or measurements are inferred. |
| **WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S04** | Silkrute Canada, [Pure & Sure Organic Ragi Flour](https://www.silkrute.ca/grocery/cooking/flour/pure-and-sure-organic-ragi-flour-1kg-100-natural-nachni-atta-pure-finger-millet-flour-chakki-ground-and-gluten-free-mandua-ka-atta-rich-in-protein-iron-and-other-nutrients/), search-indexed product title and copy. The Canadian storefront title pairs Ragi Flour/Finger Millet Flour with the exact phrase `Mandua ka Atta` and displayed CAD pricing in the indexed snapshot. | Canadian-facing retailer wording, not Canadian manufacture or an official terminology ruling. Search index was about four months old; direct page retrieval returned HTTP 403, so the snapshot does not establish current availability. |
| **WP02-A6-MANDUA-FLOUR-ALIAS-20261013-R5-S05** | Silkrute Canada, [NutriOrganics Unpolished Ragi Flour](https://www.silkrute.ca/grocery/cooking/millets/nutriorganics-unpolished-ragi-flour-1.5kg-100-natural-finger-millet-flour-nachni-atta-kelvaragu-flour-rich-in-calcium-and-protein-en/), search-indexed product copy. The listing identifies the product as ragi/finger-millet flour and includes Mandua among its alternate names; the snapshot showed a CAD price. | Same Canadian-facing marketplace as S04, so not independent retailer corroboration. Search index was about three months old and direct page retrieval returned HTTP 403; do not infer current stock. The package weight is not a recipe measure. |

**Reused existing evidence (do not add duplicate source records):**

- `WP02-A6-RAGI-ATTA-20261012-S01`: FSSAI, [Food Safety and Standards Regulations, Chapter 2.4: Cereals and Cereal Products, Version 4 (2025-05-07)](https://fssai.gov.in/upload/uploadfiles/files/Chapter%202_4_Cereals_and_Cereal_products.pdf), §§23(6) and 2.4.34. Lists finger millet (Ragi or Mandua) as *E. coracana* and defines ragi flour as milled dried mature grains of that species. This source ID already exists on the finger-millet-flour ledger record.
- `WP06-SA-20261010-S05`: Walmart Canada, [Farine de ragi Verka](https://www.walmart.ca/fr/ip/Farine-de-ragi-Verka-2-lb/6000203211214), existing Canadian French product-wording record. Reuse only to retain `farine de ragi`; it does not support `farine de mandua`.
- `WP02-A6-KURAKKAN-FLOUR-20261012-S08` and `S09`: existing Mudau et al. density and formula-specific bread study records on the finger-millet-flour ledger entry, retained with the stated method/unit caveat and blocked substitution result.
- `WP03-S191` and `WP03-S194`: existing Canadian French crop-name and Québec usage records for `éleusine cultivée`; no new French alias is proposed.

## Static review evidence

- Re-read `AGENTS.md`, the active WP02 A6 checklist, the current ingredient-catalog workflow, and the relevant proposal/batch archive before selecting this gap.
- Checked the current normalized exact-key ownership and picker projection across references, forms, legacy candidates, and ledger record IDs; no Mandua owner collision was found.
- Searched all 114 manifest-listed recipes and 1,123 ingredient rows; no candidate phrase or direct link to the two target references was found.
- Checked all five new source IDs against the current ledger and archived proposal/batch records; no prior collision was found. No new finding IDs are proposed.
- No app, unit, instrumentation, or emulator tests were run during the proposal review. The later JSON-only integration is recorded below.

## Integration record

Integrated on 2026-10-13. Added mandua to the existing finger-millet grain aliases and mandua flour / mandua ka atta to the existing finger-millet-flour aliases. Added the five new source records to the applicable existing ledger records and accepted alias decisions; reused the existing FSSAI source entry. Preserved the French displays, null densities, empty unit mappings, four flour bulk-density observations, blocked wheat-replacement finding, and all recipe links. No measurement observation, form, recipe edit, or substitution was added.
