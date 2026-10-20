# WP03 Section F R86 — mochigome alias review

## Review record

- **Reviewed:** 2026-10-13.
- **Open checklist:** The Section F parent item, “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps,” remains unchecked ([live plan, line 2809](../../RecipeBook-global-ingredient-catalog-plan.txt#L2809)).
- **Recommendation:** Add the source-attested romanized Japanese term “mochigome” as one English-search alias on the existing ingredient-ref-glutinous-rice row. Keep the display pair glutinous rice / riz gluant unchanged.
- **Scope:** Search recognition of the Japanese name for glutinous rice. This is an alias review, not a new rice identity, preparation form, or Japanese variety row.
- **Work boundary:** Proposal only. No shared catalog, ledger, checklist, roadmap, recipe, generated file, code, or batch README was edited.

## Source-backed name and Québec French scope

Japan National Tourism Organization describes the rice grown in the Ichinoseki-Hiraizumi region as “mochigome,” a glutinous rice type, and distinguishes it from the region’s usual short-grain rice. It discusses mochigome as a grain before steaming and pounding it into mochi, so the alias names the grain rather than the prepared cake. The same page says it can be substituted for regular rice, but gives no recipe-specific scope, ratio, or method adjustment; that sentence is not enough to define an app substitution rule. [S01]

A Government of Japan public-information article uses the direct bilingual parenthetical “mochigome (glutinous rice)” when distinguishing it from uruchi, or common Japanese rice, in botamochi. This independently supports the romanized term as a name for the glutinous-rice type, not as a dish or flour. [S02]

The French display remains riz gluant. The existing OQLF source WP03-S11 lists riz gluant, riz glutineux, and riz doux as Québec preferred terms and gives “glutinous rice” among the English terms. No Québec source reviewed here establishes a French translation or local retail label for the Japanese word itself. Therefore add only the romanized term as an English-search alias; do not create riz mochigome, a Japanese-language display, or a French alias by translation.

## Live ownership and overlap audit

At review, the active package contains **1,417 references, 104 forms, 63 legacy candidates, 1,756 ledger records, 114 manifest-listed recipes, and 1,123 ingredient rows**.

| Current owner or decision | Current state | R86 boundary |
|---|---|---|
| [ingredient-ref-glutinous-rice](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L6845) | glutinous rice / riz gluant; English aliases sweet rice and waxy rice; French aliases riz doux and riz glutineux; null density and no unit mappings. Its [ledger entry](../research-ledger.v1.json#L53415) has verified identity, measurementState not_yet_researched, and substitutionResearchState not_yet_researched. | Add one English-search alias only. Preserve displays, current aliases, category, density, mappings, and identity. |
| [ingredient-ref-black-glutinous-rice](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json#L1868) | The separate R85 row black glutinous rice / riz gluant noir, with its product-attested word-order aliases. See the [R85 proposal](wp03-section-f-next-grain-review-r85-20261013.md). | Keep the color-qualified identity separate; mochigome is not added to it. |
| Glutinous-rice flours | Generic glutinous rice flour, Mochiko, and Shiratamako are separate active flour identities. | Do not add mochigome to a flour row or treat the grain term as a flour alias. |
| Exact candidate ownership | No active reference, form, legacy candidate, or ledger record owns mochigome or mochi-gome. No proposal or batch has a focused mochigome decision. | Reuse the existing glutinous-rice ID; allocate no new ID or candidate record. |
| Adjacent decisions | The previous generic glutinous-rice review accepted sweet rice and waxy rice but rejected sticky rice because Canadian product pages also use it for non-glutinous short-grain and ready-to-heat products. Japanese Mochiko and Shiratamako decisions concern flour products. | mochigome is independently supported as a Japanese name for the grain type. Do not reopen sticky rice or any flour decision. |

The overlap audit searched the current plan, roadmap, reference and form files, legacy-import identities, research ledger, proposal archive, batch archive, and bundled recipe package for mochigome, mochi-gome, もち米, もちごめ, and the proposed R86 source-ID prefix. The exact terms and source IDs are unallocated. The existing Mochiko flour row is a neighboring name, not an owner of mochigome.

## Recipe demand

All **114 manifest-listed recipe files and 1,123 ingredient rows** were searched across serialized recipe text and ingredient fields. Exact searches for mochigome, mochi-gome, もち米, もちごめ, glutinous rice, riz gluant, mochi rice, and mochiko found **zero matching recipe files and zero matching ingredient rows**. No recipe link, ingredient-row relink, or recipe quantity is proposed.

## Picker projection

The current picker normalizes lowercase ASCII search terms, folds accents, prefers complete word-phrase matches, and falls back to substring matches ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L11)). Reference aliases participate in the same search-term set as both display names.

| Query | Current results | With the proposed alias |
|---|---|---|
| mochigome | No result. | Exact phrase selects ingredient-ref-glutinous-rice only. |
| mochi | ingredient-ref-mochiko-glutinous-rice-flour through substring fallback. | The same flour result plus ingredient-ref-glutinous-rice through substring fallback. This broader partial query is the only material picker expansion. |
| mochi-gome | No result. | Still no result: it normalizes to two words, unlike the source spelling mochigome. Do not add a hyphenated spelling without evidence. |
| glutinous rice / riz gluant | Five rows: generic glutinous rice, black glutinous rice, generic glutinous rice flour, Mochiko flour, and Shiratamako flour. | Unchanged; the new alias does not contain either phrase. |
| mochi rice | No result. | Still no result; do not invent this English phrase. |
| Japanese-script もち米 | The search normalizer removes non-ASCII characters, leaving an empty query that returns the entire reference list. | Do not add Japanese-script aliases; the current picker cannot safely search them. |
| rice | 56 rice-related rows. | Unchanged; mochigome adds no rice token. |

This supports a dedicated exact lookup for the attested romanized word without changing broad rice or glutinous rice result sets. The mochi partial query becomes broader by one row; the proposal records that consequence for integration review.

## Identity, forms, quantities, conversion, yield, and substitution

| Dimension | Evidence and decision |
|---|---|
| **Identity** | Mochigome names the Japanese glutinous-rice type. Add it as a search alias to the verified generic glutinous-rice identity; do not create a distinct Japanese-variety identity or merge the separate black-glutinous row. |
| **French naming** | Retain the existing Québec-supported display riz gluant. Do not add an unverified French rendering of mochigome. |
| **Forms** | Add no form. Mochigome is a rice identity/type; the source’s steamed-and-pounded mochi is a prepared food, not an ingredient form for this alias change. |
| **Measurements and density** | Neither new source establishes a household measure or transferable volume-to-mass value. Keep defaultDensity null, unitMappings empty, and the ledger’s current measurementState not_yet_researched. Do not reinterpret any product or recipe quantity. |
| **Conversion and yield** | No quantitative raw-to-cooked or grain-to-mochi input/output data is provided. Add no conversion or yield. |
| **Substitution** | JNTO says mochigome can replace regular rice in a culinary context but gives no dish, role, ratio, or method limits. Record this as a source-scoped, non-executable candidate; add no global or contextual rule. If the alias is integrated, set substitutionResearchState to researched_no_supported_substitute and record why the broad statement does not support a recipe rule. |
| **Recipe use** | The bundled corpus has no matching term or row. Add no recipe link. |

## Exact prospective JSON delta

If accepted for later integration, make only the following reference-field change to the existing ingredient-ref-glutinous-rice object. Preserve every other reference field.

~~~json
{
  "id": "ingredient-ref-glutinous-rice",
  "aliasesEn": ["sweet rice", "waxy rice", "mochigome"],
  "updatedAt": "2026-10-13T00:00:00Z"
}
~~~

Append the two R86 source records below to the existing ledger entry’s sources. Reuse WP03-S11; do not duplicate its OQLF source record. Append one accepted alias decision with the source IDs WP03-MOCHIGOME-ALIAS-R86-20261013-S01, WP03-MOCHIGOME-ALIAS-R86-20261013-S02, and WP03-S11. Set only substitutionResearchState to researched_no_supported_substitute; leave measurementState unchanged. Append the source-scoped finding shown here:

~~~json
{
  "outcome": "accepted",
  "reason": "Add mochigome as an English-search alias to the existing glutinous rice / riz gluant identity. Keep all display names and current aliases, the black-glutinous-rice identity, forms, measurements, and other data unchanged. Do not encode the unbounded regular-rice replacement statement as a substitution rule.",
  "sourceIds": [
    "WP03-MOCHIGOME-ALIAS-R86-20261013-S01",
    "WP03-MOCHIGOME-ALIAS-R86-20261013-S02",
    "WP03-S11"
  ]
}
~~~

~~~json
{
  "findingId": "glutinous-rice-mochigome-substitution-r86",
  "researchState": "researched_no_supported_substitute",
  "context": "A Japan National Tourism Organization page says mochigome can replace regular rice, but supplies no dish, role, quantity, or method boundary.",
  "basis": "This is a broad use statement, not enough evidence for a reusable directed or contextual recipe substitution rule.",
  "limitations": [
    "Do not add an active global or contextual substitution rule.",
    "Do not transfer a ratio or cooking method from the statement."
  ],
  "sourceIds": ["WP03-MOCHIGOME-ALIAS-R86-20261013-S01"]
}
~~~

Source records for the existing glutinous-rice ledger entry:

~~~json
[
  {
    "sourceId": "WP03-MOCHIGOME-ALIAS-R86-20261013-S01",
    "url": "https://www.japan.travel/en/gastronomy/article-auspicious-nutritious-and-delicious/",
    "title": "Japan National Tourism Organization, Auspicious, Nutritious, and Delicious",
    "accessedOn": "2026-10-13",
    "locator": "The Rice at the Heart of the Region, especially the paragraph identifying mochigome and describing its use",
    "supports": "Names mochigome as the more-glutinous rice type grown in the described Japanese region, distinguishes it from ordinary short-grain rice, and describes it as grain used for mochi. Its statement that mochigome can replace regular rice has no recipe scope, ratio, or method adjustment.",
    "sourceKind": "other"
  },
  {
    "sourceId": "WP03-MOCHIGOME-ALIAS-R86-20261013-S02",
    "url": "https://www.gov-online.go.jp/video/cao/dl/public_html/gov/pdf/hlj/20140301/20140301all.pdf",
    "title": "Government of Japan, Government Online, Botamochi feature",
    "accessedOn": "2026-10-13",
    "locator": "Botamochi ingredient description distinguishing uruchi rice from mochigome. The search index exposed the article text; direct PDF open returned an internal error in the web reader.",
    "supports": "Search-indexed Government of Japan public-information text uses the direct English gloss mochigome (glutinous rice) for the rice ingredient, distinguishing it from ordinary Japanese rice. Direct PDF retrieval failed in the web reader, so this source is supplemental to the directly opened JNTO source.",
    "sourceKind": "other"
  }
]
~~~

No new reference ID, ingredient form, measurement observation, conversion, package yield, recipe link, or substitution rule is part of the proposal.

## Source register

| ID | Source | Use and limit |
|---|---|---|
| WP03-MOCHIGOME-ALIAS-R86-20261013-S01 | Japan National Tourism Organization, [Auspicious, Nutritious, and Delicious](https://www.japan.travel/en/gastronomy/article-auspicious-nutritious-and-delicious/), “The Rice at the Heart of the Region.” | Current official tourism source directly names mochigome as glutinous rice in a Japanese regional grain context. Its regular-rice replacement sentence lacks recipe-level boundaries and quantities. |
| WP03-MOCHIGOME-ALIAS-R86-20261013-S02 | Government of Japan, Government Online, [Botamochi feature](https://www.gov-online.go.jp/video/cao/dl/public_html/gov/pdf/hlj/20140301/20140301all.pdf). | Search-indexed public-information text explicitly glosses mochigome as glutinous rice and distinguishes it from ordinary Japanese rice. The direct PDF open returned an internal error in the web reader, so this is supplemental to S01, not its sole identity support. It is not a Canadian consumer package label. |
| WP03-S11 | OQLF, [riz glutineux](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8393595/riz-glutineux), existing ledger source. | Supports the retained Québec French riz gluant and English glutinous rice display pair. It does not name mochigome. |

## Static review record

Static checks passed: UTF-8 without BOM, no mojibake markers, no trailing whitespace, and a final newline; all four JSON snippets parsed; the proposed sources, decision, substitution finding, and state update were applied in memory to the live ledger record and passed `research-ledger.schema.json` validation. Both new source IDs are unique in the current ledger and absent from the rest of `docs/` and `app/`. The ownership scan found no exact active reference, form, legacy-candidate, or ledger owner for `mochigome` or `mochi-gome`; the recipe scan found 0 matches in 114 files and 0 matches in 1,123 ingredient rows. All 9 Markdown links were checked, including 6 local targets and 5 line anchors. No tests, Gradle tasks, emulator, or deployment were run.

