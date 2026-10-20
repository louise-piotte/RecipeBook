# WP02 Section B3 pupuru identity and Québec French boundary review

- **Reviewed:** 2026-10-10
- **Status:** coordinator integration completed 2026-10-10; see the integration note below.
- **Recommendation:** integrate one identity-only `pupuru` reference in `FLOUR_AND_STARCH`; retain `pupuru` as the provisional Québec French display, with independent Québec review still open. Add no forms, numeric rules, recipe links, or substitution rules.
- **Scope:** the source-named smoked, fermented cassava product `pupuru`, including its documented flour presentation. This does not reopen the generic fufu/amala family or the held taro-starch candidate, and does not revisit attiéké or lafun.
- **Inputs reviewed:** live B2/B3 plan, catalog workflow, canonical references and forms, research ledger, legacy candidates, all 261 existing proposal files, and all 114 manifest-listed recipes.
- **Source-ID prefix:** `WP02-PUPURU-IDENTITY-20261010-S01`–`S07`. No prior use was found in `docs/` or `app/`; these IDs are proposal-local and are not ledger records.

## Proposed identity

| Field | Proposal | Evidence boundary |
|---|---|---|
| Candidate ID | `ingredient-ref-pupuru` (suggested only; not active or allocated) | No current reference, form, legacy-candidate, or prior dedicated proposal ID collision. |
| Category | `FLOUR_AND_STARCH` | The source-defined product is fermented and smoked cassava, commonly dried as molded balls and also milled to flour. It is not extracted tapioca starch. [S01] |
| English display | `pupuru` | The Nigerian processing survey calls the smoked, fermented cassava product pupuru; a current Canadian product page labels it `Pupuru (Cassava Flour)`. [S01, S04] |
| Québec French display | `pupuru` (provisional) | A 2022 French-language thesis retains `Pupuru` while describing the flour used to prepare the dish. This supports retaining the source name in French, but is not Québec usage. The Ontario product listing is English-only, and a targeted OQLF search found no dedicated Pupuru entry. [S03–S05] |
| English alias | `pupuru flour` | The exact phrase is used as a product name in food-science literature; the Canadian listing names `Pupuru (Cassava Flour)`. Do not add generic `cassava flour`. [S04, S07] |
| French aliases | None | Do not add `farine de pupuru`, `farine de manioc`, or a process-description phrase as an alias. No Québec product label supports those names, and `farine de manioc` is broader than this fermented/smoked product. [S04–S05] |

The identity should cover the named dried product, including flour milled from its smoked balls. Keep the prepared stiff dough out of this ingredient identity; the French thesis describes that as a food prepared by mixing flour with boiling water. The reviewed sources do not establish a general set of catalog forms that should be selectable on recipe lines. [S01, S03]

## Separate measurement, form, and substitution decisions

- **Density and unit mappings:** `defaultDensity: null`; `unitMappings: []`. No source reviewed establishes a transferable household volume-to-mass measure or unit mapping. Published functional-property results depend on drying method or formulation and are not adopted as kitchen conversions. Measurement state for a generic recipe measure: `researched_no_supported_value`.
- **Forms:** add none. Sources describe molded dried balls, milled flour, and a cooked dough; without an exact recipe line, this review does not create selectable forms or assert equivalence among those presentations.
- **Substitution:** add no global or contextual rule. For the fufu/lafun comparisons tested, substitution research is `researched_no_supported_substitute`: a 2009 study found the flours and cooked doughs unsuitable as substitutes for one another. No broader replacement relationship was evaluated, and no ratio is inferred. [S02]
- **Recipe links and yields:** add none. No exact candidate line appears in the bundled recipe package; processing and laboratory results do not establish a recipe yield.

## Identity and naming boundaries

The strongest identity evidence is the 2003 survey based on processor interviews in southwest Nigeria: fermented cassava mash is pressed, molded into balls, and smoke-dried as pupuru; flour samples are made from dried balls. A university thesis written in French also retains the name `Pupuru` and describes flour as the input used to prepare the cooked dough. These sources support a distinct named food product and the same spelling in both display fields, while leaving the French display provisional for Québec. [S01, S03]

Do not use the following as aliases:

- `cassava flour` or `farine de manioc`: the active catalog already has `edible cassava flour / farine comestible de manioc`; OQLF defines `farine de manioc` broadly as powder from dry-ground cassava roots, not as a Pupuru-specific product name. [S05]
- `fermented cassava flour`, `smoked cassava flour`, or `farine de manioc fermentée`: these are process descriptions, not evidence of a single source-neutral identity. Keep the named product `pupuru` qualified.
- `fufu`, `foufou`, `akpu`, `pukuru`, `lafun`, `amala`, `elubo`, `kokonte`, `gari/garri`, `attiéké`, `tapioca`, or `sago`: direct process sources distinguish relevant cassava products, and the live catalog already has separate identities for cassava flour, gari, attiéké, lafun, tapioca starch/pearls, and edible sago flour. A broad French-language overview table groups Pupuru and Pukuru under Fufu, but that conflicts with the primary comparison of fufu, lafun, and pupuru as distinct tested products; it is not used to collapse them. [S02, S06]
- `pukuru`: spelling and product-class evidence is not consistent enough to treat it as a global alias. Keep it unassigned pending product-specific evidence. [S02, S06]

## Current catalog, collision, and recipe audit

Snapshot taken from the shared worktree on 2026-10-10. Search behavior was checked against `IngredientSearch.kt`: lowercase and fold accents/ligatures, normalize punctuation and whitespace, prefer full word-phrase matches, then use partial matching.

| Surface | Current count / fingerprint |
|---|---|
| Ingredient references | 881 rows; SHA-256 `1f81797c4aa8e713929ea96a0486f2e98a386adba6680da0ace665199a138ac0` |
| Ingredient forms | 48 rows; SHA-256 `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| Research ledger | 1,126 records / 2,771 source entries |
| Legacy candidates | 77 rows |
| Bundled recipes | 114 manifest-listed files / 1,123 ingredient lines; manifest SHA-256 `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984`; recipe fingerprint `6b0df96f2f4c672f88ec6670857c493f7f1cbb1c441432d1c9365e14a6145c14` |
| Existing proposals | 261 Markdown files; `pupuru` occurs only in the attiéké boundary proposal and the lafun substitution/boundary proposal. Neither is a dedicated Pupuru review. |

**Exact recipe-line hits:** none for `pupuru`, `pupuru flour`, `pukuru`, `farine de pupuru`, `farine de manioc`, `cassava flour`, `fermented cassava flour`, or `smoked cassava flour` in the manifest-listed recipe ingredient lines. No recipe link or quantity is inferred.

| Query | Current result / disposition |
|---|---|
| `pupuru`, `pupuru flour`, `pukuru` | No active reference or form result. No exact ledger or legacy-candidate match. |
| `cassava flour` | Exact phrase resolves to `ingredient-ref-cassava-flour` (`edible cassava flour / farine comestible de manioc`, `FLOUR_AND_STARCH`). Keep this broad phrase out of Pupuru aliases. |
| `fufu` | No active reference or form result. Preserve the broader fufu/amala hold and do not alias Pupuru into it. |
| `lafun`, `attiéké`, `gari`, `tapioca pearls`, `tapioca starch`, `edible sago flour`, `sago pearls` | Resolve to their existing, distinct identities. Keep these product boundaries intact. |
| Existing proposals | Only the attiéké proposal names Pupuru among products it excludes; the lafun proposal mentions Pupuru as a tested comparator and as a non-alias. No prior focused identity or Québec French review was found. |

## Acceptance checks for coordinator integration

1. Add only `ingredient-ref-pupuru` in `FLOUR_AND_STARCH`, with `pupuru` as both display names, an explicitly provisional fr-CA display, English alias `pupuru flour`, and no French aliases.
2. Keep `cassava flour` and `farine comestible de manioc` on the existing edible cassava flour identity. Do not assign `farine de manioc`, `farine de pupuru`, `pukuru`, or generic fufu/amala wording to Pupuru.
3. Keep `defaultDensity` null and `unitMappings` empty; add no forms, form rules, conversions, recipe links, yields, or substitution rules.
4. Verify that `pupuru` and `pupuru flour` resolve only to the new identity; generic `cassava flour` still resolves only to edible cassava flour; and lafun, attiéké, gari, tapioca, and sago queries still resolve to their own identities.
5. Leave `pukuru` unassigned until regional and Québec terminology evidence establishes a safe exact-key relationship.

## Bounded unresolved gaps

- No direct Québec French retail label or OQLF entry for Pupuru was found. Retaining `pupuru` in the French display is supported by French-language usage outside Québec but remains provisional pending independent Québec review.
- The exact relationship between `pupuru` and the spelling `pukuru` is not settled. Broad synonym tables are not enough to activate aliases.
- Product sources do not consistently distinguish the dried smoked ball from flour milled from it and the cooked dough prepared from the flour. The proposed identity names the dried Pupuru product and its documented flour presentation; no forms are proposed.
- The current recipe package has no direct Pupuru demand. Revisit recipe links only when a source-backed line names the product.

## Source register

All web sources were accessed 2026-10-10. Proposal source IDs are local to this file.

- **S01** — T. A. Shittu, O. B. Oyewole, O. Olawuyi, and O. Daramola, [“Processing Technology of Pupuru: A Survey of Practices and Production Quality in the South West of Nigeria”](https://publications.funaab.edu.ng/index.php/Series_B/article/view/535), *ASSET Series B* 2(2), 2003, pp. 17–27. Primary processor survey; describes fermented cassava mash pressed, molded into balls, and smoke-dried, with flour samples made from dried balls. This supports product identity and process, not household density or a universal recipe.
- **S02** — T. A. Shittu and I. I. Adedokun, [“Comparative Evaluation of the Functional and Sensory Characteristics of Three Traditional Fermented Cassava Products”](https://journal.funaab.edu.ng/index.php/JNSET/article/view/1113), *Journal of Natural Sciences Engineering and Technology* 8(2), 2009, DOI [10.51406/jnset.v8i2.1113](https://doi.org/10.51406/jnset.v8i2.1113). Primary comparison of fufu, lafun, and pupuru flours and cooked doughs; reports significant differences and concludes they were not suitable substitutes in the tested market/consumer setting. No replacement ratio is inferred.
- **S03** — Emie Groppi, [*Les mycotoxines et leurs impacts sur la santé en Afrique de l’Ouest*](https://utheme.univ-tlse3.fr/files/original/a906f7b677a64550aced14fdd8094d40587e4110.pdf), doctoral thesis, Université Toulouse III Paul Sabatier, defended 2022-04-20, section “Le manioc dans l’alimentation en Afrique de l’Ouest.” French-language secondary source retains the name `Pupuru` and describes fermented cassava flour mixed with boiling water to prepare a served dough. This supports French-language use of the source name, not Québec-preferred terminology.
- **S04** — Feliza African Store, [Flour product listing: “Pupuru (Cassava Flour)”](https://www.feliza.ca/flour), undated listing, site copyright 2025; accessed 2026-10-10. Current Canadian retailer listing supplies exact product wording but no package composition or French name. The retailer’s [contact page](https://www.feliza.ca/contact-us) identifies its store as London, Ontario, so this is Canadian-market evidence, not Québec evidence.
- **S05** — OQLF, [*farine de manioc*](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3287122/farine-de-manioc), GDT, term attributed to AFNOR (1979); accessed 2026-10-10. Defines generic manioc flour as powder obtained by dry grinding tuberized cassava roots. It does not identify fermented/smoked Pupuru or establish `farine de pupuru` as a Québec term. A targeted OQLF search for `pupuru` and `pupuru flour` returned no dedicated entry.
- **S06** — IRD, [*Voies alimentaires d’amélioration des situations nutritionnelles en Afrique de l’Ouest: le rôle des technologies alimentaires et des nutritionnistes*](https://horizon.documentation.ird.fr/exl-doc/pleins_textes/divers11-08/010036321.pdf), proceedings of the 2nd international workshop, 2011. Its broad product-name table places `pupuru` and `pukuru` under Fufu as alternate names. This conflicts with the primary comparative study’s treatment of fufu and pupuru as distinct products; it is retained only as evidence that the cross-name boundary is unresolved, not as an alias authority.
- **S07** — O. O. Lasekan, J. M. Babajide, and O. J. Adebayo, [“Effect Of Soy On The Physico-Chemical Properties Of Pupuru Flour”](https://www.ajol.info/index.php/nifoj/article/view/33572), *Nigerian Food Journal* 22(1), 2004 (published 2005-05-09), pp. 87–96, DOI [10.4314/nifoj.v22i1.33572](https://doi.org/10.4314/nifoj.v22i1.33572). Primary study uses the exact product phrase `Pupuru flour`; it also evaluates soy-fortified formulations, so the phrase does not support any one generic blend composition.

## Coordinator integration — 2026-10-10

Accepted as `ingredient-ref-pupuru` in `FLOUR_AND_STARCH`, with `pupuru` in both display fields, the English alias `pupuru flour`, no French aliases, null density, and no unit mappings. The French display remains provisional pending independent Québec review. Ledger evidence records the tested fufu/lafun non-substitution finding with its study-specific limits; no forms, numeric observations, recipe links, or runtime substitution rules were added. `pukuru` and generic cassava-flour wording remain unassigned.
