# WP02 B2/B3 regional cassava product review — placali

- **Reviewed:** 2026-10-11
- **Status:** proposal only; this review creates no catalog, ledger, recipe, test, checklist, or roadmap changes.
- **Scope:** the source-named cassava product `placali`, its identity boundary, and current Québec French product naming. This is one bounded candidate under the open B2/B3 checklist line for fermented cassava products and regional starch products.
- **Inputs reviewed:** `AGENTS.md`; relevant `Requirements.md` ingredient-reference, form, conversion, and substitution rules; WP02 B2/B3 checklist lines in `docs/RecipeBook-global-ingredient-catalog-plan.txt`; current references/forms, research ledger, legacy candidates, roadmap, relevant WP02 proposals, and every manifest-listed bundled recipe.
- **Source-ID prefix:** `WP02-PLACALI-QUEBEC-20261011-S01` through `S06`. A repository search of `docs/` and `app/` found no prior use. These IDs are proposal-local, not ledger edits.
- **Access date:** 2026-10-11.

## Recommendation

**Promote a distinct identity-only `placali / placali` reference in `FLOUR_AND_STARCH`.** Primary cassava-processing and food-science sources use Placali for a named fermented cassava paste/product, and current Québec sellers use the exact name `Placali` in French-facing listings. This supports the source name as both displays without translating it to a broad descriptor. It does not support an alias for generic fermented cassava paste, cassava flour, or cassava semolina. [S01–S06]

| Proposed field | Value | Evidence limit |
|---|---|---|
| Suggested ID | `ingredient-ref-placali` | Suggested only; not allocated. |
| Category | `FLOUR_AND_STARCH` | Treat this as a regional cassava-staple product within B2/B3, consistent with the local seller's `FÉCULENTS SURGELÉS` category and the checklist's regional starch scope. This is not a claim that the product is dry flour or isolated starch. [S04] |
| English display | `placali` | Retain the source product name rather than a generic cassava-paste translation. The Montréal marketplace uses `Placali` in its French item listing; technical sources use the same product name. [S01, S03, S06] |
| Québec French display | `placali` | Exact spelling appears in French-facing product listings from Québec and Montréal-area sellers. This is local product-label evidence, not an OQLF-preferred-term ruling. A targeted OQLF search found no dedicated food entry; the unrelated `placique` result is not evidence about Placali. [S04–S06] |
| French aliases | None | Do not add `pâte de manioc fermentée`, `semoule de manioc`, or `farine de manioc`; these are descriptive or broader phrases, not established unique Placali labels. [S03, S06] |
| English aliases | None | Do not add `fermented cassava paste`, `cassava paste`, `cassava dough`, or `placali flour`. Keep alternate spellings inactive absent source evidence. [S01–S03] |

The proposed identity is limited to cassava products explicitly named `placali` by their source. It does not claim one standardized processing stage: an IITA field report distinguishes the historically cooked household dough from the raw fermented/pressed pulp called placali in its current processing-chain context, while food-science studies also evaluate cooked placali paste. The Québec retail pages do not supply enough preparation instructions to identify the sold frozen product as raw pulp or ready-to-eat cooked dough. Keep those states unmodeled. [S01–S05]

## Product boundaries

- Keep Placali separate from the active cassava-root, edible cassava-flour, tapioca-starch, gari, lafun, Pupuru, and attiéké identities. These have different raw materials, extraction or fermentation steps, drying, granulation, or cooking states. Shared cassava origin does not establish synonymy. [S01–S03]
- The IITA report describes placali as an input from which garba and attiéké are further processed. That processing relationship is not an alias or evidence that Placali substitutes for either finished product. The current attiéké proposal mentions placali only among products it excludes; it is not a focused Placali review. [S02]
- Do not merge Placali with generic `fufu`/`foufou`, `amala`/`elubo`, `akpu`, `banku`, or another cassava swallow. The current generic fufu/amala holds remain unchanged.
- Do not interpret `semoule de manioc` as a Placali alias. A Montréal marketplace page uses that phrase loosely beside Placali, but it does not establish product equivalence; it can also blur the separate attiéké/cassava-granule boundary. [S06]
- Do not create a Placali flour or extracted-starch identity from the 2012 study title. That paper describes fermented cassava flour as an experimental input processed into Placali; it does not identify the flour itself as Placali. [S03]

## Measurements, forms, conversions, yields, and substitutions

- **Density and unit mappings:** keep `defaultDensity` null and `unitMappings` empty. No reviewed source gives a Placali household volume-to-mass value. The Québec listings' prices, per-ball wording, and frozen-food classification provide no net mass or volume conversion. [S04–S06]
- **Forms:** add none. Technical sources discuss fermented/pressed pulp and cooked paste, and one Québec listing describes a frozen product, but they do not establish one shared, standardized form taxonomy or confirm the stage of the local frozen item. Do not encode `raw`, `cooked`, `frozen`, or `ready-to-eat` as a form on this evidence. [S01–S05]
- **Conversions and yields:** add none. Koko et al. report an experimental fermented-flour-to-water reconstitution proportion of 1:3 to 1:3.5 for their tested Placali samples, with sensory response varying by proportion. The abstract does not establish a general kitchen ratio, reusable unit mapping, volume basis, yield, or conversion for the Québec retail product. Keep the study result source-specific; do not activate it as catalog behavior. [S03]
- **Substitution:** add no global or contextual rule. Placali's use as a processing input to garba or attiéké is a production chain, not a tested interchangeable-ingredient relationship. No source reviewed here tests Placali as a substitute for fufu, amala, lafun, Pupuru, gari, attiéké, or generic starch. [S01–S03]
- **Recipe links:** add none. The current bundled recipe corpus has no Placali ingredient line or recipe-text hit.

## Current catalog, collision, and recipe audit

Read-only snapshot taken from the shared worktree on 2026-10-11. Counts and hashes are point-in-time observations; concurrent work may change them.

| Surface | Current snapshot |
|---|---:|
| Ingredient references | 888; SHA-256 `f12d67a73c62f0fd03440a6da512d6211fc2179c56c4889cd0f277f57688051a` |
| Ingredient forms | 48; SHA-256 `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| Research-ledger records | 1,138 |
| Legacy import candidates | 77 |
| Manifest-listed recipes and ingredient rows | 114 / 1,123; recipe fingerprint `6b0df96f2f4c672f88ec6670857c493f7f1cbb1c441432d1c9365e14a6145c14` |

The recipe fingerprint hashes manifest-ordered relative recipe paths, a NUL byte, exact file bytes, and a trailing NUL byte. Search behavior was checked against `IngredientSearch.kt`: lowercase, compatibility/accent folding, punctuation and spacing normalization, complete word-phrase matches first, then substring fallback.

**Recipe demand:** zero exact ingredient-row hits and zero recipe-text hits across all 114 manifest-listed recipes / 1,123 ingredient rows for `placali`, `plakali`, `placali flour`, `fermented cassava paste`, `cassava paste`, `pâte de manioc fermentée`, `pâte de manioc`, and `semoule de manioc`. No recipe source, line, quantity, link, or relink is inferred.

| Query | Current search result / boundary |
|---|---|
| `placali`, `plakali`, `placali flour`, `fermented cassava paste`, `cassava paste`, `pâte de manioc fermentée`, `pâte de manioc`, `semoule de manioc` | No active reference or form result. No exact legacy candidate or Placali ledger record. |
| `cassava` | Six active references, including attiéké, cassava root, edible cassava flour, cassava leaves, and both Brazilian polvilho references. Do not add it as an alias. |
| `manioc` | Four active references: cassava root, edible cassava flour, cassava leaves, and tapioca starch. Keep the broad source term out of this row. |
| `attiéké`, `gari`, `lafun`, `pupuru` | Resolve to their respective active, separate identities. |
| `fufu`, `foufou`, `amala`, `elubo` | No active reference or form result. Existing unresolved generic holds remain in force; none is a Placali alias. |

The only Placali occurrence in prior WP02 proposals is the attiéké proposal's explicit exclusion/non-alias boundary. A full proposal-directory search found no focused Placali identity or Québec French review. The current research ledger has no Placali-specific record, and the 77 legacy candidates have no exact Placali name or alias.

## Acceptance checks for a later integration

1. Add only `ingredient-ref-placali` in `FLOUR_AND_STARCH`, with `placali` for both display fields and no aliases. Treat the French display as a source-attested Québec product name, not an OQLF ruling.
2. Preserve active cassava root, edible cassava flour, tapioca starch, gari, lafun, Pupuru, and attiéké boundaries. Keep generic fufu/amala/elubo, `semoule de manioc`, and generic fermented-cassava wording unassigned.
3. Leave density null, unit mappings empty, forms absent, conversions and yields absent, substitutions absent, and recipe links absent. Record measurement and substitution research as not yet supported by reusable evidence.
4. If a later recipe uses Placali, inspect the exact product/package and whether it expects unprepared fermented pulp or cooked paste before adding any form or preparation mapping. Re-scan the then-current manifest recipes before creating a link.
5. Verify `placali` resolves only to the new row; verify that `cassava`, `manioc`, `semoule de manioc`, `fufu`, `attiéké`, `gari`, `lafun`, and `pupuru` retain the separate search boundaries recorded above.

## Explicit no-op boundaries

This proposal does not authorize or make changes to canonical references, forms, unit mappings, density, research ledger, recipe files, generated/package files, the WP02 checklist, roadmap, tests, or emulator state. It does not add recipe links, forms, aliases, measured values, conversions, yields, or substitutions. The existing generic fufu/amala/elubo holds and all other B2/B3 decisions remain unchanged.

## Source register

All sources were accessed 2026-10-11. Source IDs are proposal-local and are not ledger entries.

| ID | Source and support | Limits |
|---|---|---|
| **S01** | Cho Evelyne J. R. Adiko et al., [“Assessing the effects of two fermentation methods on the physico-chemical, microbiological and sensory properties of ‘placali’ prepared from three improved cassava varieties”](https://academicjournals.org/journal/AJMR/article-abstract/59953F673174), *African Journal of Microbiology Research* 19(4), 48–57, published 2025-04-30, DOI [10.5897/AJMR2024.9767](https://doi.org/10.5897/AJMR2024.9767). Primary study defines Placali as fermented cassava paste and compares fermentation methods and varieties. | Supports named identity and product/process variability; sample-specific lab and sensory results do not establish kitchen measures or a universal production specification. |
| **S02** | E. O. Alamu et al., [*Report on the Status of Attieke Production in Côte d’Ivoire*](https://cgspace.cgiar.org/server/api/core/bitstreams/e022cd83-d904-4cc6-a663-b5be9007e6de/content), IITA, 2019, pp. 18–20, section “Placali.” The field report says the name historically also referred to cooked household dough but in the described processing-chain context referred to fermented/pressed cassava pulp; it describes this pulp as an input for garba and attiéké. | This is an attiéké-sector field report and explicitly documents contextual stage variation; it is not a product standard, Québec naming source, or evidence of a universal Placali form. |
| **S03** | Casimir Anauma Koko et al., [“Quality of fermented cassava flour processed into placali”](https://www.ajol.info/index.php/ijbcs/article/view/80512), *International Journal of Biological and Chemical Sciences* 6(1), 415–420, February 2012, DOI [10.4314/ijbcs.v6i1.36](https://doi.org/10.4314/ijbcs.v6i1.36). Primary study makes a fermented flour input from Yace cassava and evaluates reconstituted Placali; its abstract reports the experiment-specific 1:3–1:3.5 flour-to-water proportion. | One variety and experimental process; the reported proportion is not specified here as a transferable kitchen measure, mass/volume mapping, yield, or conversion for packaged Placali. |
| **S04** | Distribution Armel Inc., [“PLACALI ARMEL”](https://distributionarmel.com/boutique/placali-armel/), product page, accessed 2026-10-11. Québec seller based in Repentigny lists the product under `FÉCULENTS SURGELÉS`, calls it Placali, describes fermented cassava dough, and limits delivery to the greater Montréal area. | Retail product copy, not a technical definition or OQLF entry; page variants and prices do not establish net amount, preparation, or whether the frozen product is raw or cooked. |
| **S05** | Le Marché des Continents, [“Placali”](https://marchedescontinents.ca/products/placali), Québec City product page, accessed 2026-10-11. French-facing listing title is `Placali`; the page identifies the seller's Québec City address. | Listing supplies no composition, preparation, package mass, or state details; supports local product-name spelling only. |
| **S06** | WiniMall, [“Placali (5$ par boule)”](https://www.winimall.com/product/detail/placali-5-par-boule-pid1347), Montréal marketplace listing, accessed 2026-10-11. French listing names Placali and describes a fermented cassava paste of Ivorian origin. | Seller page also calls it `Cassava ou semoule de manioc`; that broad wording is not treated as a reliable alias. Per-ball price is not a mass or serving conversion. |
