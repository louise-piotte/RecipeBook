# WP02 Section 04 B3 R146 — Bambara-groundnut starch product-boundary hold

- **Reviewed:** 2026-10-15.
- **Disposition:** Proposal-only hold; no shared data changed.
- **Checklist:** [WP02 Section 04 B3](../../RecipeBook-global-ingredient-catalog-plan.txt#L2209), `[ ] Water-chestnut flour and other documented regional starches.` The parent remains open after the R145 teff-starch hold.
- **Candidate:** Starch isolated from Bambara groundnut (*Vigna subterranea*) seed.
- **Source-ID prefix:** `WP02-B3-BAMBARA-STARCH-HOLD-R146-20261015` (checked against the current ledger and proposal/batch archive before drafting).
- **Scope boundary:** This is separate from the active whole-seed `ingredient-ref-bambara-beans`, the active whole-seed flour `ingredient-ref-bambara-groundnut-flour`, and the Okpa dish. It does not reopen the prior flour decision.

## Recommendation

**Hold isolated Bambara-groundnut starch outside active references and the research ledger.** Primary studies establish a starch fraction separated from Bambara flour, but the current Canadian product evidence reviewed is for milled whole-seed flour. Targeted English and French searches did not establish a current standalone Canadian or Québec human-food starch product or product-specific Québec French wording. Keep this candidate distinct from the seed and flour rows, and revisit it if product evidence becomes available.

This is a bounded market and naming hold, not a claim that the ingredient is unavailable everywhere. The earlier [R74 flour review](wp02-next-a-b-flour-review-r74-20261013.md) explicitly left starch isolates undecided and required their own product and scope evidence. The immediately prior [R145 teff-starch hold](wp02-section-04-b3-next-regional-starch-gap-review-r145-20261015.md) is a different botanical candidate.

## Product scope and Canadian/Québec evidence

Kaptso et al. analyze Bambara flour separately from starch and protein isolates. Their study isolates starch from flour prepared from two seed varieties and reports differences between the resulting isolates; it documents a research fraction, not a commercial grade or packaged ingredient. A later study also studies experimentally isolated and annealed starch for potential food-industry use. The literature establishes technical identity and research interest, not current Canadian product availability. [S01–S03]

The current Canadian-facing listing reviewed is **“Bambara/Okpa Flour”** at MyChopChop. The retailer describes stone-milling Bambara beans into fine flour and gives an Okpa preparation; the listing shows Canadian-dollar prices and 1 lb / 2 lb variants. The retailer is in Cambridge, Ontario. Its shipping page describes Canadian carrier service with variable rates outside Ontario, but does not confirm a Québec delivery or provide a Québec French label. These are whole-seed flour and dish-use observations, not evidence of extracted starch. [S04–S05]

Targeted searches on 2026-10-15 for `Bambara groundnut starch Canada`, `Bambara starch Canada`, `Bambara starch Québec`, `amidon de pois bambara`, and `fécule de pois bambara` surfaced research and flour/seed material, but no standalone Canadian or Québec starch product. This search is bounded to public web and retailer results; it cannot rule out an unindexed food-service or industrial supplier.

## Québec French and product naming

The active seed row already owns `pois bambara` for *Vigna subterranea*. The CFIA seed-and-grain table pairs that French term with the species, but it does not attest a starch label. [WP03-H-BAMBARA-20261011-S03]

OQLF’s current GDT entry prefers **`amidon`** as the general French term for starch. It describes **`fécule`** as more specific to starch from tubers or, more generally, underground organs. A Bambara starch would be isolated from a legume seed, so `amidon` is the better descriptive construction; that morphology and the generic OQLF entry do not establish the product phrase **`amidon de pois bambara`** as Québec retail terminology. No product-specific Québec French starch name was found. [S06]

The existing flour display `farine de pois bambara` is supported by a separate EU flour-label designation and the seed term; it is not a Québec starch label or a naming precedent that activates a new identity. [WP02-B2-BAMBARA-FLOUR-R74-20261013-S01, WP03-H-BAMBARA-20261011-S03]

## Ownership, picker projection, and corpus demand

The live snapshot contains **1,501 references, 118 forms, 1,846 research-ledger records, and 61 legacy identities**. Exact searches of the [active references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [research ledger](../research-ledger.v1.json), [legacy identities](../legacy-import-identities.v1.json), checklist, and WP02 archive found no starch owner, focused Bambara-starch decision, `ingredient-ref-bambara-groundnut-starch`, or `candidate-bambara-groundnut-starch`.

| Live identity | Current owned terms and boundary |
|---|---|
| `ingredient-ref-bambara-beans` | `Bambara beans / pois bambara`; English aliases include `Bambara groundnut`; French aliases include `pois de terre` and `voandzou`. Whole food seed; category `LEGUME_AND_PULSE`. |
| `ingredient-ref-bambara-groundnut-flour` | `Bambara groundnut flour / farine de pois bambara`; English alias `Bambara beans flour`. Flour milled from the whole seed; category `FLOUR_AND_STARCH`. |
| Candidate under review | Isolated starch fraction. No active reference, alias, form, ledger record, or legacy identity. Keep separate from whole-seed flour even though the extraction starts from flour. |

The [shared picker](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt) normalizes bilingual display names and aliases and prefers complete word phrases across results. A projection using the current terms plus a hypothetical row with **only** `Bambara groundnut starch / amidon de pois bambara` gives:

| Exact query | Current rows | Hypothetical rows | Effect |
|---|---:|---:|---|
| `Bambara groundnut starch` | 0 | 1 | Product-qualified phrase would identify only the hypothetical starch row. |
| `amidon de pois bambara` | 0 | 1 | Product-qualified French phrase would identify only that row, if later supported. |
| `Bambara groundnut` | 2 | 3 | The existing seed and flour rows remain; the candidate display would add the starch row. |
| `pois bambara` | 2 | 3 | The existing seed and flour rows remain; the hypothetical French display would add the starch row. |
| `Bambara beans` | 2 | 2 | The hypothetical display adds no `Bambara beans` phrase; current seed and flour matches stay unchanged. |

Counts above reflect reference-name/alias complete-phrase results; they are a static projection, not a runtime picker test. The broader queries `starch` and `amidon` already return 35 and 29 rows respectively; a hypothetical canonical display would increase each to 36 and 30. The proposed hold adds no picker row or alias.

The manifest lists **114 recipes**. A full scan of all manifest-listed recipe JSON, including recipe metadata and all **1,123 ingredient rows**, found zero mentions of Bambara, *Vigna subterranea*, Voandzou, `pois bambara`, or Okpa. No bundled recipe asks for this starch or the flour/dish. [Bundled manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)

## Numeric, form, and substitution limits

- **Forms:** The studies’ washed, soaked, milled, extracted, centrifuged, dried, or annealed samples describe laboratory processing, not stable package forms. Add no catalog form.
- **Measures and density:** The primary papers report starch composition, granule morphology, thermal behavior, hydration, and other lab properties. These measurements do not give a consumer package measure, mass per cup, or reusable `g/ml` density. Do not derive a household conversion from extraction protocols or experimental property tests; add no density or unit mapping.
- **Yield:** Any fraction recovery is tied to a specific starting flour, cultivar, and extraction protocol. It is not a home-cooking yield for the current flour product; add no yield.
- **Substitution:** Research use of Bambara starch as a possible food thickener/stabilizer, or in experimental starch/flour blends, does not establish a tested recipe replacement ratio for corn, potato, tapioca, rice, or other starch. Add no global or contextual substitution rule and no recipe-line link.

## Exact proposed data delta

**None.** Do not add a reference, aliases, ledger candidate, forms, measures, unit mappings, recipe links, conversions, yields, or substitution observations. This proposal adds no database JSON data and needs no app, Gradle, unit, instrumentation, emulator, or deployment tests under the current [`AGENTS.md`](../../../AGENTS.md) rule.

Reconsider only when a current Canadian or Québec source identifies a standalone human-food Bambara starch (or a clearly scoped food-grade starch product) and product-specific French wording can be supported. If a product is found, keep it separate from the whole seed and flour, and evaluate measurements and substitutions against that product or a relevant recipe rather than laboratory fractions.

## Sources

Online sources were reviewed on **2026-10-15**. R146 source IDs below are proposal-local evidence references; no new ledger sources or records are proposed.

| ID | Source and support | Limit |
|---|---|---|
| **WP02-B3-BAMBARA-STARCH-HOLD-R146-20261015-S01** | Kaptso et al., [“Physicochemical and micro-structural properties of flours, starch and proteins from two varieties of legumes: bambara groundnut”](https://pmc.ncbi.nlm.nih.gov/articles/PMC4519478/), *Journal of Food Science and Technology* 52 (2015), 4915–4924. Separately analyzes flour and starch/protein isolates and reports variety-linked properties. | Cameroon research samples and methods; no current Canadian commercial product or Québec label. |
| **WP02-B3-BAMBARA-STARCH-HOLD-R146-20261015-S02** | Nwaogazie, Akinwande, and Oyeyinka, [“Physicochemical properties of Bambara groundnut (*Vigna subterranea*) starch annealed at different temperatures”](https://doi.org/10.1111/jfpp.17183), *Journal of Food Processing and Preservation* 46 (2022), e17183. Studies experimentally isolated starch and annealing at 45–60 °C; discusses potential food-industry functions. | Research modification and physicochemical results do not identify a consumer product, household measure, or recipe substitution. |
| **WP02-B3-BAMBARA-STARCH-HOLD-R146-20261015-S03** | Oyeyinka and Oyeyinka, [“A review on isolation, composition, physicochemical properties and modification of Bambara groundnut starch”](https://doi.org/10.1016/j.foodhyd.2017.09.012), *Food Hydrocolloids* 75 (2018), 62–71. Reviews starch as a possible industrial source and calls for further work to promote use. | Review of research potential; not evidence of current Canadian/Québec availability. |
| **WP02-B3-BAMBARA-STARCH-HOLD-R146-20261015-S04** | MyChopChop, [Bambara/Okpa Flour](https://www.mychopchop.ca/products/bambara-okpa-flour). Current Canadian-facing listing describes stone-milled Bambara-bean flour and Okpa preparation; variants are 1 lb and 2 lb. | Whole-bean flour product. Ontario seller; not isolated starch and not a Québec package label. |
| **WP02-B3-BAMBARA-STARCH-HOLD-R146-20261015-S05** | MyChopChop, [Shipping & Returns](https://www.mychopchop.ca/pages/shipping-returns). Describes shipping to locations outside Ontario through Canadian carriers at location-dependent rates. | Does not name Québec or guarantee a delivery for this individual product. |
| **WP02-B3-BAMBARA-STARCH-HOLD-R146-20261015-S06** | OQLF, [*amidon* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8869736/amidon), updated 2026. Prefers `amidon` generally and describes `fécule` as more specifically associated with tubers/underground organs. | General terminology only; no Bambara-starch compound or product wording. |
| **WP03-H-BAMBARA-20261011-S03** | CFIA, [French organic seed and grain extension-code table](https://inspection.canada.ca/fr/etiquetage-aliments/produits-biologiques/exigences-dimportation/nouveaux-codes-prolongation-damg-seme/nouveaux-codes-prolongation-damg-seme). Pairs *Vigna subterranea* with `Pois bambara`. | Seed/grain classification; not a starch label. Reused from the existing seed research record. |
| **WP02-B2-BAMBARA-FLOUR-R74-20261013-S01** | European Commission, [Implementing Regulation (EU) 2024/2047, French text](https://eur-lex.europa.eu/legal-content/FR/TXT/?uri=CELEX%3A32024R2047). Gives `Farine de pois bambara (Vigna subterranea)` for the flour form. | Flour labeling in an EU regulation, not Canadian or Québec starch nomenclature. Reused from the existing R74 flour review. |

## Local records checked

- [Current Section 04 B3 checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L2209)
- [R74 Bambara flour review](wp02-next-a-b-flour-review-r74-20261013.md)
- [R145 teff-starch hold](wp02-section-04-b3-next-regional-starch-gap-review-r145-20261015.md)
- [Active reference JSON](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json)
- [Active forms JSON](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json)
- [Research ledger](../research-ledger.v1.json)
- [Legacy identity candidates](../legacy-import-identities.v1.json)
- [Bundled recipe manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json)
