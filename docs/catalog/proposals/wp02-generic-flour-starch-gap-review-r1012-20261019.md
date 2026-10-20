# WP02 Section A6 R1012: parboiled rice flour identity review

## Review record

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. This review changes no shared catalog JSON, forms, ledger, manifest, generated file, plan, roadmap, batch README, recipe, or code. No tests or builds were run.
- **Open-plan anchor:** The unfinished A6 parent calls for continued review of buckwheat, sorghum, millet, quinoa, amaranth, fonio flour, and “other regional grain flours” ([catalog plan, lines 1873–1874](../../RecipeBook-global-ingredient-catalog-plan.txt#L1873)). Parboiled rice flour is proposed as one process-defined regional grain flour under that open item.
- **Selected gap:** A fine flour made from parboiled rice, proposed as `parboiled rice flour / farine de riz étuvé`.
- **Recommendation:** If accepted, add one identity-only `FLOUR_AND_STARCH` reference for this generic culinary flour. Keep the French compound provisional. Add no aliases, forms, measures, density, unit mappings, conversions, yields, recipe links, or active substitutions.
- **Scope:** This is one generic milling identity based on a named rice-processing state. No brand, commercial product, product line, flavour family, SKU, or retailer-variant roster was researched. No product-only values are proposed for transfer.

## Identity boundary and recommendation

The candidate is flour milled from rice that has been parboiled before milling. Codex defines parboiling as a treatment of rice that involves soaking and heat treatment before drying; the existing catalog already represents the resulting whole-grain state as `parboiled rice / riz étuvé`. A primary flour study compares parboiled-rice flour with raw-rice flour and reports different swelling and solubility behavior under its test conditions. A separate field study documents parboiled rice pounded into fine powder and used as the main rice ingredient in Bakhar, a traditional starter preparation in Santal communities in West Bengal. Together, these sources support a distinct flour identity and a bounded human-food use, rather than a commercial variant roster. [S01–S02; reused WP03-S49–S51]

Keep the proposed flour separate from:

- generic, white, and brown rice flour, whose current records remain unchanged;
- whole-grain `parboiled rice / riz étuvé`;
- glutinous, Joshinko, Mochiko, Shiratamako, black, red, roasted-red, and wild-rice flours;
- rice starch, which remains a separate extracted ingredient; and
- `idli rava / rice rava`, the held coarse rice-granule candidate. The existing Section F review leaves that item unresolved because the available sources do not establish a common grain-processing boundary or Québec French display. It is not evidence for a fine-flour identity and must not be merged with this candidate.

The process difference is meaningful for catalog identity, but the evidence does not define one universal parboiling protocol, rice grade, milling method, particle size, or product specification. In particular, retain the lab study’s flour samples and temperature-dependent results as study-specific. Do not infer that all parboiled rice flours have the same behavior or that they can replace raw rice flour at a common ratio.

Use `farine de riz étuvé` only as a descriptive, provisional French display if accepted. OQLF directly supports `farine de riz` for rice flour and `riz étuvé` for parboiled rice, but no reviewed Québec source attests the full compound. Do not present the compound as an OQLF-preferred term. Do not add the source wording `parboiled rice powder` as a global alias: it is documented in one traditional starter context, and the review does not establish that wording as a general label for the flour class. [WP02-S27; WP03-S49]

The primary food-use source concerns a traditional starter, not a general home-baking ingredient. Its local preparation description supports culinary use only in that scope; it supplies no transferable household measure, conversion, or substitution. The study does not establish a Québec product, current Canadian retail availability, or a standard for commercial flour. [S01]

## Source register and limits

The first two source IDs below are proposal-local and have not been allocated in the shared ledger. Existing terminology and standard sources are reused by their current ledger IDs; no ledger ownership is changed.

| Source ID | Source, locator, and support | Limit retained |
|---|---|---|
| **S01 — `WP02-A6-PARBOILED-RICE-FLOUR-R1012-20261019-S01`** | Ghosh, Sen, and Mondal, [“Ethnobotanical perspectives of Bakhar: an indigenous starter culture used to prepare traditionally fermented rice beverage in rural West Bengal, India”](https://doi.org/10.1186/s42779-022-00143-6), *Journal of Ethnic Foods* 9, article 26 (2022). Sections “Ingredients of Bakhar” and “Preparation of Bakhar.” The field study describes unpolished and parboiled rice being soaked and pounded to fine powder; it identifies parboiled rice powder as the main rice ingredient in Bakhar. | Primary evidence for a fine parboiled-rice powder in a human-food preparation. The evidence is tied to the surveyed Santal communities and starter preparation; it does not establish a universal label, a standalone packaged flour standard, a Québec French term, a household measure, or general recipe behavior. The cited source’s use of “powder” is not promoted to a global alias. |
| **S02 — `WP02-A6-PARBOILED-RICE-FLOUR-R1012-20261019-S02`** | Unnikrishnan and Bhattacharya, [“Swelling and solubility behaviour of parboiled rice flour”](https://doi.org/10.1111/j.1365-2621.1981.tb01831.x), *International Journal of Food Science & Technology* 16(4), 403–408 (1981), abstract. The primary study compares parboiled-rice flour with raw-rice flour. | Supports the flour identity and a process-related distinction under the study’s test conditions. Results depend on the tested rice and parboiling/sample-preparation conditions; they are not a household preparation method, a generic performance claim, or a substitution ratio. The paper reports that a hot-sand-treated sample behaved differently from its conventionally parboiled samples, further cautioning against one universal process claim. |
| **Reused `WP03-S49`** | Office québécois de la langue française, [GDT: riz étuvé](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488742/riz-etuve), preferred term and definition. | Supports the Québec French base term `riz étuvé` and English `parboiled rice`. The entry dates to 1988 and does not attest a rice-flour identity or the proposed compound. Reuse only for the base term. |
| **Reused `WP03-S50` and `WP03-S51`** | Codex Alimentarius, [Standard for Rice CXS 198-1995 (English)](https://www.fao.org/input/download/standards/61/CXS_198e.pdf) and [French text](https://www.fao.org/input/download/standards/61/CXS_198f.pdf), §2.1.1.4. | Defines the parboiled-rice processing class and its bilingual naming. It addresses rice, not a flour grade or consumer flour specification. Reuse the existing sources; do not copy grain measurement data to flour. |
| **Reused `WP02-S27`** | Office québécois de la langue française, [GDT: farine de riz](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432782/farine-de-riz), definition and note (updated 2025). | Supports `farine de riz` and the generic rice-flour base meaning. Its note mentions white and brown rice; it does not attest `farine de riz étuvé` or establish processing-specific terminology. Reuse only for the base term. |

## Current ownership and recipe-demand audit

Read-only snapshot of the current bundled package, research ledger, legacy-import candidates, proposals, and manifest-listed recipes on 2026-10-19:

| Surface | Current state | R1012 finding |
|---|---:|---|
| Active ingredient references | 2,025 | No `ingredient-ref-parboiled-rice-flour` ID, exact `parboiled rice flour` name/alias, or exact `farine de riz étuvé` name/alias exists. Relevant owners are `ingredient-ref-parboiled-rice` (`GRAIN_AND_CEREAL`), `ingredient-ref-rice-flour`, `ingredient-ref-white-rice-flour`, `ingredient-ref-brown-rice-flour`, and the other distinct rice-flour identities listed above. Keep every current row and its evidence unchanged. The proposed full names are not exact owners; the broad `rice flour / farine de riz` and `parboiled rice / riz étuvé` results remain separate neighboring identities. |
| Ingredient forms | 205 | No parboiled-rice-flour form, label, or match term exists. Do not add a `parboiled` form to the generic flour row: the proposed identity represents a flour made from a distinct processed grain, rather than a recipe-line preparation of generic rice flour. |
| Legacy import identities | 55 candidates | No exact proposed ID or normalized English/French phrase is present. No legacy candidate is promoted, removed, or merged. |
| Research ledger | 2,431 records | No exact flour identity, candidate, source URL, or proposed source ID is already owned. The existing `ingredient-ref-parboiled-rice` record owns WP03-S49–S51 and CNF evidence for whole parboiled rice. Keep its edition-specific dry portions and “amount to make” observation attached to the grain record; none transfers to flour. The separate `candidate-idli-rava` remains unresolved and coarse-grained; preserve its existing evidence and decision. |
| Proposal and batch archive | Current archive scanned | No prior parboiled-rice-flour identity review or exact proposed source URL was found. The prior idli-rava boundary review is distinct and remains unchanged. |
| Bundled recipe package | 114 manifest-listed files / 1,123 ingredient rows | A full scan found zero occurrences of `parboiled rice flour`, `parboiled rice powder`, `farine de riz étuvé`, `farine de riz etuve`, or `riz étuvé moulu`; no ingredient row links to the proposed ID. No recipe demand or recipe link is proposed. |
| Active substitutions | 0 global and 0 contextual rules | No candidate-linked conversion or substitution exists. Add none. |

Exact-name search is distinct from broad family search. A future `rice flour` or `farine de riz` query may show both the family row and this process-qualified candidate; a `parboiled rice` or `riz étuvé` query may show the existing whole-grain identity alongside the flour. Do not add a broad alias that would imply the flour and grain are interchangeable.

## Queued-work disposition

The named Anson Mills wheat-meal lead encountered in the neighboring WP02 plan is a commercial-product-only follow-up. Keep that line out of scope because **commercial-product counts do not add ingredient diversity**; stop that product-only research. Preserve any existing branded entries and their product-scoped evidence unchanged. The R1012 identity review itself uses no brand, retailer, or SKU evidence.

## Proposed minimal delta for later integration

If accepted, add one identity-only reference:

```json
{
  "id": "ingredient-ref-parboiled-rice-flour",
  "nameEn": "parboiled rice flour",
  "nameFr": "farine de riz étuvé",
  "aliasesEn": [],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "FLOUR_AND_STARCH"
}
```

Proposed ledger state if accepted: `recordType: ingredient_reference`, `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`. Add S01 and S02 as new source entries only at integration. Reuse WP02-S27 and WP03-S49–S51 for the narrow terminology and process claims; do not duplicate or reassign those source records. Keep the proposed flour's density null, mappings and aliases empty, and no forms, measurements, recipe links, conversions, yields, or active substitution rules. Preserve the parboiled-rice grain row, all generic/source-grade rice-flour rows, the idli-rava hold, all existing branded rows, and all product-scoped evidence.

This proposal is the only file changed by R1012. No tests, build, emulator run, or deployment were performed.
