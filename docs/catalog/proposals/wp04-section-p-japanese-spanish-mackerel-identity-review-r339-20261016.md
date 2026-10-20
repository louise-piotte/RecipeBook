# WP04 Section P — Japanese Spanish mackerel identity review (R339)

- **Review and source-access date:** 2026-10-16.
- **Status:** Accepted and integrated by root on 2026-10-16; see the [R339 integration README](../batches/wp04-section-p-japanese-spanish-mackerel-identity-integration-r339-20261016/README.md). The proposal records the source review and scope limits.
- **Recommendation:** Add one identity-only `PROTEIN` reference for **Japanese Spanish mackerel / thazard oriental**, *Scomberomorus niphonius*. Use **sawara** as the sole English search alias because a Canadian seafood supplier pairs that product name directly with Japanese Spanish mackerel. Keep `Japanese seerfish`, bare `Spanish mackerel`, `maquereau espagnol`, bare `thazard`, and other mackerel names out of the alias set. Add no forms, measures, recipe links, conversions, yields, or substitutions.

## Scope and distinct gap

Section P's finfish checklist remains open in the [global ingredient-catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L5759); its regional-fish and vernacular-name work also remains open. This review selects only *Scomberomorus niphonius*. Searches across the plan, active references and forms, legacy candidates, research ledger, proposal archive, and integration batches found no prior focused review, owner, or allocation for this species, `Japanese Spanish mackerel`, `thazard oriental`, `sawara`, or `ingredient-ref-japanese-spanish-mackerel`. The focused source-ID prefix below is also unused. The already integrated *S. maculatus* / spotted Spanish mackerel and other mackerel rows remain unchanged. This does not reopen R328, R331, R334, R336, or any other prior Section P decision. [R01]

## Canadian and Québec naming and product evidence

The CFIA Fish List assigns TSN **172446**, *Scomberomorus niphonius*, the Canadian English/French name pair **Japanese Spanish Mackerel / Thazard oriental**. It also lists **Japanese Seerfish** without a French name. The CFIA describes the list as a Canadian fish-labelling resource linking common names to scientific names and TSNs. Use the complete bilingual species-qualified pair for the display. Keep `Japanese Seerfish` out of the alias set: the Fish List also applies `Australian Seerfish` to *S. munroi*, so adding only the Japanese name would make a generic `seerfish` query look like a singleton. [S01–S02]

ITIS reports *S. niphonius* as a valid species and records the common names **Japanese Spanish mackerel**, **Japanese seerfish**, and French **thazard oriental**. Japan's Ministry of Education, Culture, Sports, Science and Technology food-composition database independently identifies its raw `Japanese Spanish mackerel` entry as *S. niphonius*. These sources establish the taxon/name correspondence; the food-composition entry is not a recipe portion or conversion source. [S03–S04]

Seafood City Granville Island in Vancouver currently lists **Sawara / Japanese spanish mackerel** as a seafood product and gives general seasonal and cooking information. This is Canadian seller evidence for the paired product wording, but the page supplies no binomial, package amount, grade, or Québec market availability. The scientific identity for the proposed row comes from CFIA, ITIS, and MEXT, not from the seller page alone. [S05]

The bounded OQLF search did **not** find a GDT entry for *S. niphonius* or `thazard oriental`. Nearby OQLF entries confirm why the species qualifier matters: `thazard` is assigned to *S. cavalla*; `thazard tacheté` is assigned to *S. maculatus*; and `maquereau espagnol` is an OQLF term for *S. japonicus* (*chub mackerel*). OQLF also says `maquereau espagnol` was not retained for *S. maculatus*. These are different taxa, so none of those terms should be imported as an alias for the proposed row. CFIA is the direct Canadian bilingual label source for `thazard oriental`; no claim is made that OQLF separately normalized that wording for *S. niphonius*. [S06–S08]

## Current ownership and recipe-demand audit

The live read-only snapshot before R339 contains **1,685 ingredient references**, **129 forms**, **57 legacy-import candidates**, and **2,032 research-ledger records**. R338 was integrated after the original proposal snapshot; its marjoram row does not affect these candidate names or projections. Exact checks found no owner in those collections for the proposed ID, binomial, `Japanese Spanish mackerel`, `thazard oriental`, or `sawara`. The active neighboring rows include *S. maculatus* as `spotted Spanish mackerel / thazard tacheté` and *S. commerson* as `narrow-barred Spanish mackerel / thazard rayé indo-pacifique`; they are not owners of the proposed name or taxon. Archive checks found no focused *S. niphonius* proposal or integration. [R01]

The manifest-ordered corpus scan covered **114 recipe files and 1,123 ingredient rows** (753,928 bytes; SHA-256 `5f031747c54c5bba111e8eade3023e40c9d0f50ec873af45f7664efd0c21d535`). Whole-file and ingredient-row searches found no hit for Japanese Spanish mackerel, *S. niphonius*, thazard oriental, sawara, Japanese seerfish, Spanish mackerel, mackerel, or maquereau. No bundled recipe demand, ingredient role, preparation state, amount, or substitution context is established. [R02]

No source supports a reusable household measure, density, unit mapping, package yield, edible-yield factor, cooking-yield factor, or substitution. The retailer's cooking tips and MEXT's raw/baked food-composition entries do not establish equivalence with another mackerel or a recipe quantity. Keep all such values unknown; add no form, conversion, yield, recipe-line link, global substitution, or contextual substitution rule. Do not infer raw-consumption, curing, storage, or cooking-safety equivalence from the retailer's product page.

## Exact phrase-first picker projection

The simulation follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): normalized complete-word phrases across reference displays, aliases, and attached form terms win first; partial matching runs only when there is no complete-phrase result. No current form has a matching mackerel/thazard term. The hypothetical row below uses the CFIA bilingual display and only the `sawara` alias. Results shown are exact current and counterfactual row sets from the active catalog snapshot. [R01]

| Query | Current picker results | With proposed row | Result |
|---|---|---|---|
| `Japanese Spanish mackerel` | None | Japanese Spanish mackerel / thazard oriental | Species-qualified English lookup. |
| `thazard oriental` | None | Japanese Spanish mackerel / thazard oriental | CFIA-qualified French lookup. |
| `sawara` | None | Japanese Spanish mackerel / thazard oriental | Canadian retailer's paired product wording. |
| `Spanish mackerel` | Narrow-barred Spanish mackerel; spotted Spanish mackerel | Narrow-barred Spanish mackerel; spotted Spanish mackerel; Japanese Spanish mackerel | Three qualified identities remain visible for the broad English phrase. |
| `mackerel` | Atlantic mackerel; canned mackerel; Indian mackerel; narrow-barred Spanish mackerel; Pacific mackerel; short mackerel; smoked mackerel; spotted Spanish mackerel | Same eight, plus Japanese Spanish mackerel | Broad English search expands by one qualified identity. |
| `thazard` | Narrow-barred Spanish mackerel; spotted Spanish mackerel | Narrow-barred Spanish mackerel; spotted Spanish mackerel; Japanese Spanish mackerel | Broad French-family term remains plural. |
| `maquereau` | Atlantic mackerel; canned mackerel; gooseberry; Indian mackerel; Pacific mackerel; short mackerel; smoked mackerel | Same seven | The proposed CFIA French name is `thazard oriental`; no unsupported `maquereau` alias is added. |
| `maquereau espagnol` | None | None | Deliberately unallocated because Québec sources attach this name to other taxa. |
| `seerfish`; `Japanese seerfish` | None | None | Deliberately unchanged; adding only the alternate species label would make the broad family-word query a singleton. |
| `narrow-barred Spanish mackerel`; `spotted Spanish mackerel` | Their respective existing rows | Unchanged | Adjacent identities retain exact-name behavior. |

The proposed row's specific English and French queries resolve to one row, while both `Spanish mackerel` and `thazard` continue to show multiple species-qualified options. Do not add bare `Spanish mackerel`, `Japanese Seerfish`, `seerfish`, `maquereau espagnol`, `thazard`, `thazard tacheté`, `maquereau du Pacifique`, or `mackerel` as aliases. In particular, OQLF's use of `maquereau espagnol` for *S. japonicus* and rejection of the term for *S. maculatus* make it an unsafe synonym here. [S06–S08]

## Bounded proposed delta

If integrated, add exactly one identity-only row:

```json
{
  "id": "ingredient-ref-japanese-spanish-mackerel",
  "nameEn": "Japanese Spanish mackerel",
  "nameFr": "thazard oriental",
  "category": "PROTEIN",
  "aliasesEn": ["sawara"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z"
}
```

Record *S. niphonius* as its scientific identity in the reference's supported taxonomy field or associated ledger evidence according to the integration convention. Keep `Japanese Seerfish` out of aliases because the Canadian supplier directly confirms the `Sawara / Japanese Spanish mackerel` wording, while no Québec or recipe need requires a broader alternate-name set. Add no forms, measures, mappings, recipe links, conversions, yields, or substitutions. Do not alter the existing generic, canned, smoked, Atlantic, Indian, Pacific, short, spotted, or narrow-barred mackerel identities.

## Sources and limits

Source IDs are proposal-local and have not been registered in the shared ledger.

| ID | Source | Evidence and limit |
|---|---|---|
| **WP04-SECTIONP-JAPANESE-SPANISH-MACKEREL-R339-20261016-S01** | CFIA, [Fish List result set for mackerel](https://active.inspection.gc.ca/scripts/fssa/fispoi/fplist/fpresults.asp?cbShowAll=on&cmbIn=e&lang=f&q=MACKEREL), accessed 2026-10-16. | Lists TSN 172446, *S. niphonius*, as `Japanese Spanish Mackerel / Thazard oriental`, and also lists `Japanese Seerfish` without a French pair. Canadian fish-labelling vocabulary and taxon assignment; not evidence of culinary equivalence or Québec retail stock. |
| **WP04-SECTIONP-JAPANESE-SPANISH-MACKEREL-R339-20261016-S02** | CFIA, [Guidance on determining the common names for fish sold or processed in Canada](https://inspection.canada.ca/en/food-labels/labelling/industry/fish/common-names), accessed 2026-10-16. | Explains the Fish List's English/French labeling names, scientific names, and TSNs and the naming scope for Canadian sale/processing. Does not prescribe ingredient-picker aliases. |
| **WP04-SECTIONP-JAPANESE-SPANISH-MACKEREL-R339-20261016-S03** | Integrated Taxonomic Information System, [*Scomberomorus niphonius*, TSN 172446](https://www.itis.gov/servlet/SingleRpt/SingleRpt?search_topic=TSN&search_value=172446), accessed 2026-10-16. | Gives valid species standing and common names Japanese Spanish mackerel, Japanese seerfish, and thazard oriental. Taxonomic/name reference, not a Canadian product or Québec usage source. |
| **WP04-SECTIONP-JAPANESE-SPANISH-MACKEREL-R339-20261016-S04** | Japan MEXT, [Food Composition Database: raw Japanese Spanish mackerel](https://fooddb.mext.go.jp/details/details.pl?ITEM_NO=10_10171_7), Standard Tables of Food Composition in Japan, 2023 supplement. | Identifies the raw food entry as *S. niphonius* and gives the English food name. Nutrient composition is source-specific and is not used as a portion, measure, or conversion. |
| **WP04-SECTIONP-JAPANESE-SPANISH-MACKEREL-R339-20261016-S05** | Seafood City Granville Island, Vancouver, [Sawara / Japanese Spanish mackerel](https://www.seafoodcitygi.com/product/sawara-japanese-spanish-mackerel/), accessed 2026-10-16. | Canadian seafood seller pairs `Sawara` with `Japanese spanish mackerel` and describes seasonal/cooking context. No binomial, package amount, grade, or Québec availability is listed. |
| **WP04-SECTIONP-JAPANESE-SPANISH-MACKEREL-R339-20261016-S06** | OQLF, GDT, [thazard](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198963/thazard), accessed 2026-10-16. | Assigns Québec's preferred unqualified `thazard` to *S. cavalla* / king mackerel, not *S. niphonius*. Do not use bare `thazard` as an alias. |
| **WP04-SECTIONP-JAPANESE-SPANISH-MACKEREL-R339-20261016-S07** | OQLF, GDT, [thazard tacheté](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198985/thazard-tachete), accessed 2026-10-16. | Assigns the preferred term to *S. maculatus* / spotted Spanish mackerel and says `maquereau espagnol` was not retained for this species. This is a neighboring taxon, not the proposed fish. |
| **WP04-SECTIONP-JAPANESE-SPANISH-MACKEREL-R339-20261016-S08** | OQLF, GDT, [maquereau espagnol](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/1198997/maquereau-espagnol), accessed 2026-10-16. | Pairs the Québec term with *S. japonicus* / chub mackerel. This prevents assigning the unqualified French term to *S. niphonius*. |
| **WP04-SECTIONP-JAPANESE-SPANISH-MACKEREL-R339-20261016-R01** | Read-only repository audit of the open Section P plan, current references/forms, legacy candidates, research ledger, proposal/batch archive, and `IngredientSearch.kt`. | Establishes current ownership counts, prior-review scope, source-ID availability, and exact phrase-first picker projections. Repository evidence, not an external taxonomic authority. |
| **WP04-SECTIONP-JAPANESE-SPANISH-MACKEREL-R339-20261016-R02** | Read-only manifest-ordered scan of `app/src/main/assets/seed/bundled-library/recipes`. | Confirms 114 bundled recipes / 1,123 ingredient rows and no candidate or broad mackerel search hits. Does not establish demand outside the bundled corpus. |

**Recommendation summary:** Add only `Japanese Spanish mackerel / thazard oriental` for *S. niphonius*, with `sawara` as a single English search alias. Keep taxon-qualified neighbors and unqualified/conflicting market terms separate. No numeric, form, recipe, or substitution behavior is proposed. The broader Section P checklist remains open.
