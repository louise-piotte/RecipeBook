# WP02 B2/B3 — Chestnut starch identity review (R85)

- **Reviewed:** 2026-10-13.
- **Status:** Proposal only. This file is the only proposed change; no shared catalog, ledger, plan, roadmap, batch, recipe, generated, or application file was edited.
- **Open checklist line:** `[ ] Water-chestnut flour and other documented regional starches.` The candidate here is starch extracted from edible tree chestnuts (*Castanea*), not water chestnut (*Eleocharis* or *Trapa*).
- **Scope:** Decide whether research-defined sweet-chestnut starch merits an identity separate from the existing chestnut flour. The review does not reopen the water-chestnut ambiguity or any prior regional-starch hold.
- **Source-ID prefix:** `WP02-B2B3-CHESTNUT-STARCH-R85-20261013`. The prefix and proposed IDs were checked against the current ledger, active references, and proposal/archive text before drafting.

## Recommendation

**Add identity-only `chestnut starch / amidon de châtaigne` as a `FLOUR_AND_STARCH` reference.** Primary studies repeatedly isolate starch from *Castanea* chestnut material and distinguish it from flour milled from the whole dried fruit. They identify an ingredient product class even though they do not establish a Canadian retail grade. Keep the French display explicitly provisional: OQLF supports `amidon` as the preferred general French term and records `châtaigne` as a context term for the edible sweet chestnut, but no reviewed Québec source attests the exact compound `amidon de châtaigne` as a starch-product label. The row should improve specific ingredient discovery while carrying no functional or numeric assumptions. [S01–S06]

The scope is starch isolated from edible chestnut fruit in the genus *Castanea*. The reviewed studies include *C. sativa* and *C. mollissima* materials. Do not infer that all chestnut species, cultivars, extraction methods, or modified starches have equivalent properties. Keep the identity distinct from whole-ground chestnut flour, whole sweet chestnuts, chestnut purée/spread, and all water-chestnut products. Do not add aliases, forms, measurements, density, mappings, recipe links, conversions, yields, or substitutions.

| Term or product | Recommendation | Boundary |
|---|---|---|
| `chestnut starch` | Add as the English display name for an extracted-starch identity with source scope recorded as *Castanea* chestnut fruit. | The research literature uses this product term for isolated chestnut starch. Do not extend it to water chestnuts or whole-ground chestnut flour. [S03–S06] |
| `amidon de châtaigne` | Use as a **provisional** French display name. | This is a transparent compound from OQLF's preferred general term `amidon`, OQLF's context term `châtaigne` for edible chestnut, and the existing catalogued chestnut-flour display `farine de châtaigne`. No reviewed source calls this an established Québec starch-product name. [S01–S02; current catalog] |
| `chestnut flour` / `farine de châtaigne` | Retain on `ingredient-ref-chestnut-flour`. | The current row represents chestnut fruit milled as flour. Starch isolated from that flour is a separate processed product in the primary studies. [WP02-CHESTNUT-FLOUR-20261010-S01–S03; S04] |
| `water chestnut starch`, water chestnut flour, and `châtaigne d’eau` | Keep outside this row. | The existing vegetable row and the held flour/starch candidate concern *Eleocharis* or *Trapa*, not *Castanea*. The prior water-chestnut review remains unchanged. [S03–S04; prior water-chestnut reviews] |
| `fécule de châtaigne`, `amidon de marron`, and species or process variants | Do not add as aliases. | No reviewed Québec source attests these exact compounds as product names; the sources do not establish an invariant commercial grade or modified-starch equivalence. [S01–S06] |

## Product identity and Québec French

The 2012 primary studies demonstrate a distinction at the product level: they begin with chestnut fruit or chestnut flour, isolate starch through wet/alkaline or enzymatic procedures, and assess the resulting starch as a separate material. The results are from Portuguese *Castanea sativa* cultivars and laboratory methods, not a current Canadian package specification. A later primary study examines extracted starch from *Castanea mollissima*; its source and thermal-treatment scope remain specific to that experiment. A 2026 study also isolates starch from *C. sativa* kernels and flour/byproducts using distinct extraction treatments. Together these sources support an identity for extracted chestnut starch, but not one universal species, process, native/modified grade, or performance definition. [S03–S06]

For French, OQLF's `marron` entry calls the edible fruit of the cultivated chestnut tree `marron`, pairs it with English `sweet chestnut` / `chestnut`, and identifies *Castanea sativa*. It lists `châtaigne` as a term used in some contexts. OQLF's 2026 `amidon` entry makes `amidon` the preferred general French term for plant starch and notes that `fécule` is more specific for starch in tubers or underground organs. Chestnut is a fruit, so `amidon` is the better-supported headword. The exact product compound is not attested by OQLF or a Québec package; retain `amidon de châtaigne` as a clearly marked descriptive display pending independent Québec product-name review, not as an OQLF quotation. [S01–S02]

## Current ownership and picker projection

At the final static recheck on 2026-10-13, the live snapshot contains **1,416 ingredient references, 104 forms, 1,755 ledger records, and 63 legacy candidates**. It has **114 bundled recipes and 1,123 ingredient rows**. Exact phrase ownership was checked across reference displays/aliases, form labels/match terms, legacy candidate names/aliases, and ledger IDs. The existing `ingredient-ref-chestnut-flour` record is `chestnut flour / farine de châtaigne`, category `FLOUR_AND_STARCH`, with empty alias arrays, null density, empty mappings, and a verified identity. Other relevant active owners are `ingredient-ref-sweet-chestnuts` (`sweet chestnuts / marrons`), `ingredient-ref-chestnut-puree`, `ingredient-ref-sweetened-chestnut-spread`, and `ingredient-ref-water-chestnut` (`water chestnut / châtaigne d’eau`). None owns the exact proposed starch names. No related chestnut form or legacy candidate exists, and `ingredient-ref-chestnut-starch` is unused. [live reference, form, ledger, and legacy files]

The current search code prefers complete normalized word phrases before substring fallback. Current phrase projection and the result after adding only the proposed reference are:

| Query | Current result | Projected result |
|---|---|---|
| `chestnut starch` | No result | `chestnut starch` only |
| `amidon de châtaigne` | No result | `chestnut starch` only |
| `chestnut flour` | `ingredient-ref-chestnut-flour` only | Unchanged; the flour row only |
| `farine de châtaigne` | `ingredient-ref-chestnut-flour` only | Unchanged; the flour row only |
| `water chestnut` | `ingredient-ref-water-chestnut` only | Unchanged; the water-chestnut row only |
| `chestnut` | Chestnut flour, chestnut purée, sweetened chestnut spread, and water chestnut | Those four results plus chestnut starch |
| `châtaigne` | Chestnut flour and water chestnut | Those two results plus chestnut starch |
| `sweet chestnut` | Whole sweet chestnuts only, by substring fallback | Unchanged; the proposed name `chestnut starch` does not contain the full phrase `sweet chestnut` |

The broad `chestnut` and `châtaigne` searches are discovery queries and may show related products from more than one botanical source. Full product phrases retain their boundaries. Do not copy whole-fruit or water-chestnut terms into the new row; do not add `chestnut` as a whole-fruit alias to it.

The archive audit found no prior focused decision about *Castanea* starch. Prior uses of the words `chestnut starch` occur within water-chestnut phrase scans and refer to *Eleocharis*; the regional-starch residual review explicitly reserves `chestnut flour` for tree chestnut and treats water chestnut as a different source. This proposal addresses the separate tree-chestnut extraction product and preserves those prior boundaries. [WP02-WCFS-20261009; wp02-water-chestnut-independent-review-20261009; wp02-b2-b3-regional-starches-residual-gap-review-20261010]

## Recipe demand, measurements, and substitutions

All 114 manifest-listed recipe files and their 1,123 ingredient rows were scanned for `chestnut starch`, `sweet chestnut starch`, `amidon de châtaigne`, `amidon de marron`, `Castanea sativa starch`, `chestnut flour`, and the existing chestnut reference IDs. There were **zero candidate-starch phrase hits and zero recipe lines linked** to the current chestnut flour, whole sweet-chestnut, chestnut purée/spread, or water-chestnut references. This establishes no bundled demand; it is not a broader market-demand survey.

The 2012 extraction paper reports experimental chestnut-starch recovery yields of **83.9%** and **79.9%** for its optimized alkaline and enzymatic procedures, with reported purities of **98.3%** and **96.3%**. Those results describe specific laboratory extraction methods and chestnut samples. They are not a dry-to-cooked yield, package yield, kitchen measure, or flour-to-starch substitution ratio. The companion functional study reports properties that change with isolation method and cultivar. The 2025 and 2026 studies also test prepared or treated research samples. None supplies a reusable g/mL density, cup weight, household conversion, or recipe replacement ratio. Keep `defaultDensity` null, `unitMappings` empty, and all measure, conversion, yield, and substitution data absent. [S03–S06]

## Exact prospective data delta

If accepted, add exactly one reference and one corresponding research-ledger record. Keep all existing chestnut and water-chestnut rows unchanged; do not add forms, aliases, recipe links, or generated-code changes.

`app/src/main/assets/seed/bundled-library/ingredient-references.v1.json`:

```json
{
  "id": "ingredient-ref-chestnut-starch",
  "nameFr": "amidon de ch\u00e2taigne",
  "nameEn": "chestnut starch",
  "aliasesFr": [],
  "aliasesEn": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

`docs/catalog/research-ledger.v1.json` record to append:

```json
{
  "recordId": "ingredient-ref-chestnut-starch",
  "recordType": "ingredient_reference",
  "identityState": "verified",
  "measurementState": "researched_no_supported_value",
  "substitutionResearchState": "researched_no_supported_substitute",
  "sources": [
    {
      "sourceId": "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S01",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2295692/marron",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, marron (GDT)",
      "accessedOn": "2026-10-13",
      "locator": "Preferred term, edible-fruit definition, English equivalents, and botanical name.",
      "supports": "Supports the French food-source term marron for edible cultivated-chestnut fruit, the English terms sweet chestnut/chestnut, and Castanea sativa. It does not name extracted chestnut starch or an exact French starch-product compound.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S02",
      "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon",
      "title": "Office qu\u00e9b\u00e9cois de la langue fran\u00e7aise, amidon (GDT)",
      "accessedOn": "2026-10-13",
      "locator": "Preferred French term and note distinguishing amidon from f\u00e9cule.",
      "supports": "Supports amidon as the preferred general French term for starch and says f\u00e9cule is more specific for starch in tubers or underground organs. It does not attest amidon de ch\u00e2taigne as a product name.",
      "sourceKind": "regional_authority"
    },
    {
      "sourceId": "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S03",
      "url": "https://doi.org/10.1016/j.foodhyd.2011.05.010",
      "title": "Correia et al., The effect of starch isolation method on physical and functional properties of Portuguese nuts starches. I. Chestnuts (Castanea sativa Mill. var. Martainha and Longal) fruits",
      "versionOrDate": "2012",
      "accessedOn": "2026-10-13",
      "locator": "Abstract and results comparing chestnut starch isolated by alkaline and enzymatic methods from Portuguese chestnut varieties.",
      "supports": "Primary study isolates starch from Castanea sativa fruit and evaluates it as a food ingredient. It reports method- and variety-specific functional properties, not a retail grade, household measure, density, or general substitution.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S04",
      "url": "https://doi.org/10.1016/j.fbp.2011.06.005",
      "title": "Correia and Beir\u00e3o-da-Costa, Starch isolation from chestnut and acorn flours through alkaline and enzymatic methods",
      "versionOrDate": "2012",
      "accessedOn": "2026-10-13",
      "locator": "Abstract, isolation-method comparison, optimized recovery and purity results for Castanea sativa chestnut starch.",
      "supports": "Primary study distinguishes starch isolated from chestnut flour from the starting flour and from acorn starch. The reported recovery and purity figures are specific to optimized laboratory extraction methods and do not establish kitchen yield or a flour-to-starch conversion.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S05",
      "url": "https://pmc.ncbi.nlm.nih.gov/articles/PMC11988753/",
      "title": "Fang et al., Analysis of the Physicochemical and Structural Properties of Chestnut Starch After Thermal Processing",
      "versionOrDate": "2025",
      "accessedOn": "2026-10-13",
      "locator": "Abstract and sections 2.1\u20132.2 on Castanea mollissima source material, starch extraction, and dry-heat treatment.",
      "supports": "Primary study isolates starch from a specified Castanea mollissima chestnut sample and analyzes raw and dry-heat-treated material. Treatment results do not define a general commercial grade, reusable measure, or substitution.",
      "sourceKind": "other"
    },
    {
      "sourceId": "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S06",
      "url": "https://www.mdpi.com/2073-4360/18/3/356",
      "title": "The Oxidative Extraction of Starch from Chestnut (Castanea sativa Mill.) Byproducts: A Valorization Strategy for a Sustainable Food Industry",
      "versionOrDate": "2026",
      "accessedOn": "2026-10-13",
      "locator": "Abstract and materials/methods describing Castanea sativa cultivars, flour/byproduct starting material, and isolated starch treatments.",
      "supports": "Primary study distinguishes chestnut flour and kernel material from starch isolated through specific oxidative/alkaline routes and discusses potential food use. The byproduct, treatment, yield, and product-performance findings are experimental and do not establish a general market specification or reusable recipe measure.",
      "sourceKind": "other"
    }
  ],
  "decisions": [
    {
      "outcome": "accepted",
      "reason": "Add identity-only chestnut starch / amidon de ch\u00e2taigne as a distinct FLOUR_AND_STARCH product for starch isolated from Castanea chestnut fruit. Keep the French display provisional because no reviewed Qu\u00e9bec product source attests the exact compound. Keep whole-ground chestnut flour, whole sweet chestnuts, chestnut pur\u00e9e/spread, and Eleocharis/Trapa water-chestnut products separate. Do not add aliases, forms, density, unit mappings, recipe links, conversions, yields, or substitutions.",
      "sourceIds": [
        "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S01",
        "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S02",
        "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S03",
        "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S04",
        "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S05",
        "WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S06"
      ]
    }
  ]
}
```

## Source register

Sources were accessed on 2026-10-13. The source IDs below are proposal-local until a coordinator integrates the ledger record.

| ID | Source and evidence | Evidence limit |
|---|---|---|
| **WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S01** | Office québécois de la langue française, [*marron* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2295692/marron), updated 1994. | Preferred Québec French term for the edible cultivated-chestnut fruit; lists English `sweet chestnut` and `chestnut` and *Castanea sativa*. It does not name extracted starch. |
| **WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S02** | Office québécois de la langue française, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. | Supports general French `amidon` and explains the narrower `fécule` usage for underground organs; it does not attest the product compound. |
| **WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S03** | Correia et al., [“The effect of starch isolation method on physical and functional properties of Portuguese nuts starches. I. Chestnuts (*Castanea sativa* Mill. var. Martainha and Longal) fruits”](https://doi.org/10.1016/j.foodhyd.2011.05.010), *Food Hydrocolloids* 27(1), 256–263 (2012). | Primary study supports isolated chestnut starch and method/variety-dependent food properties. It is not a Canadian package specification or general measure. |
| **WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S04** | Correia and Beirão-da-Costa, [“Starch isolation from chestnut and acorn flours through alkaline and enzymatic methods”](https://doi.org/10.1016/j.fbp.2011.06.005), *Food and Bioproducts Processing* 90(2), 309–316 (2012). | Primary study distinguishes *Castanea sativa* starch from starting chestnut flour; reported extraction yields and purity are lab-method-specific. No household or recipe conversion is supported. |
| **WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S05** | Fang et al., [“Analysis of the Physicochemical and Structural Properties of Chestnut Starch After Thermal Processing”](https://pmc.ncbi.nlm.nih.gov/articles/PMC11988753/), received 2025, *Polymers* 17(7), 878 (2025). | Primary study uses a named *Castanea mollissima* sample and raw/dry-heat-treated starch. Does not establish equivalence with *C. sativa* or a market grade. |
| **WP02-B2B3-CHESTNUT-STARCH-R85-20261013-S06** | [“The Oxidative Extraction of Starch from Chestnut (*Castanea sativa* Mill.) Byproducts: A Valorization Strategy for a Sustainable Food Industry”](https://www.mdpi.com/2073-4360/18/3/356), *Polymers* 18(3), 356 (2026). | Primary study uses specific chestnut cultivars, flour/byproduct materials, and oxidative/alkaline extraction. Experimental uses and yields do not define consumer products or reusable kitchen values. |

## Static review record

Re-read `AGENTS.md`, the current plan, live references/forms/ledger/legacy data, and the B2/B3 proposal/batch archive before selecting the candidate. Recomputed counts from the live JSON and recipe corpus at the final static recheck; confirmed 1,416 references, 104 forms, 1,755 ledger records, 63 legacy candidates, 114 recipes, and 1,123 ingredient rows. Checked exact phrase/ID ownership, source-prefix uniqueness, archive overlap, candidate picker projection against `IngredientSearch.kt`, and recipe-text/reference-link demand. Static checks of this proposal include UTF-8 without BOM, final newline, no trailing whitespace, schema validation for both JSON snippets, source-ID/table consistency, HTTPS URL parsing, and local Markdown-link resolution. No app tests or emulator checks were run for this proposal-only review.
