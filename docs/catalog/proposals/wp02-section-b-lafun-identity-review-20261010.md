# WP02 Section B3 regional cassava flour candidate — lafun

- **Reviewed:** 2026-10-10
- **Status:** proposal only; this is the only file created for this review.
- **Recommendation:** integrate one identity-only, source-named `lafun` reference. Keep process qualifiers, aliases, forms, measurements, and substitutions unset.
- **Scope:** the named cassava flour product `lafun`; this does not reopen the existing generic fufu/amala holds, the taro-starch hold, or the integrated attiéké row.
- **Inputs reviewed:** active B2/B3 plan sections; catalog workflow; live references, forms, research ledger, and legacy candidates; related regional-cassava proposals; and all manifest-listed recipes.
- **Source-ID prefix:** `WP02-LAFUN-IDENTITY-20261010-S01`–`S07`. Search of `docs/` and `app/` found no prior use. These IDs are proposal-local, not ledger edits.

## Proposed identity

| Field | Proposal | Evidence boundary |
|---|---|---|
| Candidate ID | `ingredient-ref-lafun` (not active or allocated) | No exact ID collision in current references, forms, legacy candidates, or prior proposals. |
| Category | `FLOUR_AND_STARCH` | Sources and the Québec product record identify it as a cassava flour product. |
| English display | `lafun` | Retain the source product name without putting the broader phrase `cassava flour` in the display. A Saint-Hubert, Québec product record uses `Cassava Flour (Lafun)`; a Canadian retailer uses `Fermented Cassava Flour (Lafun)`. [S04–S05] |
| Québec French display | `lafun` (provisional; independent Québec review remains open) | A Benin government French-language product register pairs `LAFUN` with `farine de manioc fermentée`, but this does not establish a Québec-preferred display. A targeted OQLF search found no dedicated `lafun` entry. Do not add the descriptive French phrase as an alias: the same register uses it for `AGBELIMA` as well. [S03] |
| Aliases | None | Do not add `cassava flour`, `fermented cassava flour`, `farine de manioc fermentée`, `lafun flour`, `elubo`, or broad `fufu` terms. The first collides with the active edible-cassava-flour search; the French descriptor is not unique to lafun in the cited register; the other terms remain source- or product-specific. |
| Product scope | One identity under the named product `lafun`; do not create a generic fermented-cassava-flour family. | The Codex code of practice calls lafun unfermented cassava flour, while Nigerian food-science sources and retail labels call it fermented. This proposal preserves the name-only identity but does not resolve whether those sources describe the same process variant. [S01–S02, S05] |

The narrow display avoids a false generalization from the Quebec product's English heading. Its 2 kg package amount is package information only. The brand-owner-provided registry record lists cassava as the ingredient and gives a boiling-water preparation direction, but does not state whether the flour was fermented. [S04]

## Separate measurement, form, and substitution decisions

- **Density and unit mappings:** keep `defaultDensity` null and `unitMappings` empty. No source reviewed here provides a kitchen volume-to-mass measure for the locally sold product. The Québec record's 2 kg is a package net amount, not a recipe conversion. The 2024 processing study reports lab properties for flour made by three specific methods; those observations do not establish a transferable kitchen density or mapping. [S04, S06]
- **Forms:** add no `RecipeIngredientForm`. The source material is flour. A paste made by cooking it with water is a prepared food, not a supported same-ingredient form in this review. The cited sources do not define a consistent dry, instant, cooked, or other form taxonomy for retail lafun. [S02, S04–S05]
- **Substitution:** add no global or contextual rule. A primary comparison of fufu, lafun, and pupuru flours and cooked doughs found they were not suitable substitutes in the tested products. This supports keeping product-specific substitutions unavailable; it does not establish any replacement ratio. [S07]
- **Recipe links and yields:** add none. No recipe-line or recipe-text use was found in the current bundled corpus, and product-processing or laboratory data are not recipe yields.

## Current catalog, collision, and demand audit

Snapshot taken from the shared worktree on 2026-10-10:

| Surface | Current count and fingerprint |
|---|---|
| Ingredient references | 880 rows; SHA-256 `80aa53c6a286dc6af0818ca6c3e0c25361ace29a5f709cc215e24d32ca31c06a` |
| Ingredient forms | 48 rows; SHA-256 `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| Research ledger | 1,125 records / 2,762 source entries; SHA-256 `828bcdaa6cee402e5a6372fcdef3d0a8924cc84e86562cedc92cc346fbaf23a4` |
| Legacy candidates | 77 rows; SHA-256 `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57` |
| Bundled recipes | 114 files / 1,123 ingredient rows; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; recipe fingerprint `6b0df96f2f4c672f88ec6670857c493f7f1cbb1c441432d1c9365e14a6145c14` |

The recipe fingerprint hashes manifest-ordered relative recipe paths, a NUL byte, exact file bytes, and a trailing NUL byte. It is a point-in-time worktree fingerprint.

**Exact recipe hits:** none. The audit found no ingredient line or recipe text containing `lafun`, `lafun flour`, `fermented cassava flour`, `cassava flour`, `farine de lafun`, `farine de manioc fermentée`, or the adjacent product names reviewed here. No recipe link or quantity is inferred.

**Current search/collision results:** the audit followed the app's current lookup normalization: lowercase, fold accents/ligatures, normalize punctuation and whitespace, prefer complete word phrases, then fall back to partial matching.

| Query or key | Current result / decision |
|---|---|
| `lafun`, `lafun flour`, `fermented cassava flour`, `farine de lafun`, `farine de manioc fermentée` | No active reference or form result. |
| `cassava flour` | Matches only `ingredient-ref-cassava-flour` (`edible cassava flour / farine comestible de manioc`). Do not attach this broad key to lafun. |
| `manioc` | Matches the cassava-flour, cassava-leaf, cassava-root, and tapioca-starch references. Keep it out of lafun aliases. |
| `gari` / `garri` | Both resolve to `ingredient-ref-gari`; preserve that product boundary. |
| `attieke` | Resolves to the separate `ingredient-ref-attieke`. |
| `fufu`, `foufou`, `akpu`, `amala`, `elubo`, `agbelima`, `pupuru`, `kokonte` | No active reference or form result. Existing proposal holds and product boundaries remain in force; none is proposed as a lafun alias. |

No exact `lafun` term was found in the 77 legacy candidates, and the ledger has no lafun-specific record. The prior `wp02-west-african-cassava-flour-products-review-20261010.md` explicitly left lafun as a separate future product candidate; this proposal resolves only that name-level candidate and does not revise its generic fufu/amala or other cassava-product holds. The accepted attiéké packet names lafun among products kept separate from attiéké.

## Acceptance checks for coordinator integration

1. Add only `ingredient-ref-lafun`, category `FLOUR_AND_STARCH`, with `lafun` as both EN and provisional fr-CA display and no aliases. Require independent Québec French review before treating the French display as final.
2. Keep `cassava flour` and `farine comestible de manioc` on the existing edible-cassava-flour identity. Keep `fermented cassava flour` and `farine de manioc fermentée` unassigned as aliases until their name/process scope is resolved.
3. Add no density, unit mapping, measurement observation, package conversion, form, form rule, substitution, yield, or recipe link in this batch.
4. Verify that `lafun` returns only the new reference, while `cassava flour` still returns only edible cassava flour; verify that `fermented cassava flour` and `farine de manioc fermentée` do not silently inherit lafun or cassava-flour aliases.
5. Preserve the separate identities for gari/garri, cassava flour, tapioca starch, polvilho products, attiéké, and other named cassava products.

## Bounded unresolved gaps

- Codex CAC/RCP 73-2013 calls lafun an **unfermented** cassava flour; Nigerian research and the Canadian retailer listing call it **fermented**. This packet does not establish whether the Codex wording is a different regional referent, an error, or a translation/classification mismatch. Keep fermentation out of the catalog display and aliases until a product-specific standard or label resolves it. [S01–S02, S05]
- The current Québec product record uses an English label, while the French regional register is from Benin and also applies `farine de manioc fermentée` to agbelima. A Québec French reviewer should confirm whether `lafun` alone is the appropriate French display. Do not promote the non-unique descriptive phrase to an alias. [S03–S04]
- No bundled recipe demand was found. If a recipe later names lafun, review its exact label and source before linking; do not infer a recipe conversion or substitute from its use as a cooked paste.

## Source register

All sources were accessed 2026-10-10. Packet source IDs are not ledger entries.

- **S01** — Codex Alimentarius Commission, [CAC/RCP 73-2013, Code of Practice for the Reduction of Hydrocyanic Acid (HCN) in Cassava and Cassava Products](https://www.fao.org/input/download/standards/13605/CXP_073e.pdf), adopted 2013, §18. The code describes lafun as unfermented cassava flour; it is a processing-safety code, not a product-specific lafun standard.
- **S02** — A. O. Adebayo-Oyetoro, O. B. Oyewole, A. O. Obadina, and M. A. Omemu, [“Microbiological Safety Assessment of Fermented Cassava Flour ‘Lafun’ Available in Ogun and Oyo States of Nigeria”](https://pmc.ncbi.nlm.nih.gov/articles/PMC4745530/), *International Journal of Food Science*, 2013, article 845324, DOI [10.1155/2013/845324](https://doi.org/10.1155/2013/845324). Primary study describes lafun as fine flour obtained by traditional cassava fermentation and summarizes peeling, cutting, submerged fermentation, dewatering, sun-drying, and milling. It reports variable market/process quality; this is not a universal commercial specification.
- **S03** — Agence Béninoise de Sécurité Sanitaire des Aliments, [Répertoire des produits ayant reçu l’autorisation de mise sur le marché](https://agriculture.gouv.bj/abssa/images/documents/REPERTOIRE_DES_AMM_03_12_24.pdf), register dated 2024-12-03, pp. 1–2. Entries for Alitech Industries pair `LAFUN` and `AGBELIMA` separately with `farine de manioc fermentée`; the listed authorizations expired 2025-02-19. Retained as dated French terminology evidence, not current authorization or Québec naming authority.
- **S04** — GS1 Nigeria, [Product Registry: Cassava Flour (Lafun)](https://productregistry.gs1ng.org/products/product-detail/01/6154000420185), undated record (site copyright 2025), accessed 2026-10-10. Brand-owner-provided information identifies Mary Queen Trade Inc. at a Saint-Hubert, Québec address, the product label `Cassava Flour (Lafun)`, cassava as its ingredient, a 2 kg package, and a boiling-water preparation direction. It does not state the process used to make the flour.
- **S05** — MyChopChop, [Fermented Cassava Flour (Lafun) – 4 lb](https://www.mychopchop.ca/products/cassava-flour-2-2-lb), undated product page, accessed 2026-10-10. Canadian retailer title and origin field identify a Nigerian product sold as fermented cassava flour (lafun); its preparation/use copy also uses broad cassava-fufu wording, so the heading is label evidence, not a universal fufu/lafun equivalence.
- **S06** — Omoniyi Samuel Oyewole et al., [“Effect of processing techniques on the quality and cyanogenic glycoside content of fermented cassava flours”](https://journals.unizik.edu.ng/afnrj/en/article/view/4970), *Agriculture, Food, and Natural Resources Journal* 3(2), 2024, published 2024-09-30, DOI [10.5281/zenodo.14252964](https://doi.org/10.5281/zenodo.14252964). Primary study calls fermented cassava flour lafun in Southwestern Nigeria and compares grated solid-state, sliced-soaked, and parboiled-soaked methods. Its lab properties are sample/process observations, not kitchen conversions.
- **S07** — T. A. Shittu and I. I. Adedokun, [“Comparative Evaluation of the Functional and Sensory Characteristics of Three Traditional Fermented Cassava Products”](https://journal.funaab.edu.ng/index.php/JNSET/article/view/1113), *Journal of Natural Sciences Engineering and Technology* 8(2), 2009, DOI [10.51406/jnset.v8i2.1113](https://doi.org/10.51406/jnset.v8i2.1113). Primary comparison reports significant differences in most tested flour properties and concludes the studied flours and cooked doughs were not suitable substitutes for one another; no ratio is inferred.

## Coordinator integration result — 2026-10-10

Integrated `ingredient-ref-lafun` as an identity-only `FLOUR_AND_STARCH` reference with `lafun` in
both display fields. The French display remains provisional pending independent Québec review. The
Codex unfermented description conflicts with Nigerian research and retail fermented labels, so the
catalog does not assert a process qualifier. No aliases, forms, numeric data, recipe links, or
substitutions were added; measurement and substitution research remain `not_yet_researched`.
