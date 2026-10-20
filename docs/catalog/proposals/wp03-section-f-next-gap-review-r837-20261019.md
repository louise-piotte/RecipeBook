# WP03 Section F R837 — `nachni` finger-millet grain alias review

- **Reviewed:** 2026-10-19.
- **Status:** Proposal only. No shared catalog, ledger, plan, roadmap, recipe, generated-index, or workflow file was changed.
- **Plan anchor:** The open Section F item at [line 4600](../../RecipeBook-global-ingredient-catalog-plan.txt#L4609): “Continue species-level millet, sorghum, fonio, quinoa, and amaranth review; quinoa is integrated with dry/cooked forms, and the following foxtail millet identity is complete; kaniwa and einkorn berries are also integrated as species-scoped grains.”
- **Recommendation:** Add only `nachni` to `aliasesEn` on the existing `ingredient-ref-finger-millet` grain row. Preserve the display pair, all existing aliases, category, null density, empty unit mappings, ledger research states, forms, recipes, and substitution rules.
- **Scope:** Resolve the bare Marathi grain name to the existing finger-millet grain identity. This does not reopen the completed `nachni flour` decision, add a French name, or create a new identity or preparation form.

## Evidence and prior decision boundary

The Food Safety and Standards Authority of India (FSSAI) [Guidance Note Version 2: Millets](https://fssai.gov.in/upload/uploadfiles/files/Guidance_Notes_Version_2_Millets_29_01_2020.pdf) lists `Nachni` among the Marathi names under “Finger Millet (Ragi).” Its existing ledger source, `WP02-A6-NACHNI-FLOUR-20261012-S03`, already records this as vernacular-name evidence for the source grain, not as evidence for a flour process or a Canadian French term. The FSSAI PDF search result exposed the relevant text during this review; opening the full PDF directly failed because the reader rejected its 41 MB response. The source claim is therefore tied to the official indexed text and the existing ledger record, not a newly downloaded copy.

Mithila Foods’ first-party [Unpolished Whole Ragi product page](https://mithilafoods.com/products/unpolished-whole-ragi-millet) titles the product `Unpolished Whole Ragi (Finger Millet/Nachni/Mandua/Kezhvaragu/Ragulu)`. Its description calls the item a whole grain in natural form “also known as Nachni,” and the ingredient statement identifies `100% Unpolished Whole Finger Millet (Ragi)`. This independently confirms the unqualified name on a whole-grain product page. It is India-market product-owner wording, not evidence of Québec frequency, a Canadian retail name, or a French term.

The prior [WP02 A6 `nachni flour` review](wp02-a6-nachni-finger-millet-flour-alias-review-20261012.md) added the qualified alias to the flour row and explicitly kept bare `nachni` off that flour identity. That review did not assign the bare grain name to the existing grain row. R837 addresses only that remaining ownership question using the FSSAI source-grain naming and the first-party whole-grain product wording. It is separate from R831’s white-rice amount-to-make review, R828’s common-millet evidence, R827’s precooked corn-flour review, and the R829–R830 items.

## Active ownership and picker projection

The live catalog contains **1,886 references**. `ingredient-ref-finger-millet` is displayed as `finger millet / éleusine cultivée`, category `GRAIN_AND_CEREAL`, with English-search aliases `ragi`, `kurakkan`, `mandua`, and `ragulu`; `defaultDensity` is null and `unitMappings` is empty. Its English-search alias field already contains Latin-script regional grain names, so storing `nachni` there does not label Marathi as an English spoken-language term. The related `ingredient-ref-finger-millet-flour` remains `finger millet flour / farine de ragi`, with `nachni flour` and its other qualified flour aliases.

Exact normalized ownership checks across reference names/aliases, form IDs/labels/match terms, legacy candidates, and ledger record IDs found no exact owner for bare `nachni`. The existing exact phrase `nachni flour` belongs to `ingredient-ref-finger-millet-flour`. The previously recorded flour decision likewise excludes bare `nachni` from the flour alias list; it does not prohibit assigning that crop name to the grain.

The search projection follows [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): it folds accents and punctuation and checks full word phrases inside indexed terms. A static projection from the active references and forms gives:

| Query | Current results | With the proposed alias |
|---|---|---|
| `nachni` | `ingredient-ref-finger-millet-flour` only, through the longer alias `nachni flour` | `ingredient-ref-finger-millet` and `ingredient-ref-finger-millet-flour` |
| `nachni flour` | `ingredient-ref-finger-millet-flour` only | Unchanged; the grain’s one-word alias does not match this full phrase |
| `ragi` | Grain and flour | Unchanged |
| `finger millet` | Grain and flour | Unchanged |
| `farine de ragi` | Flour only | Unchanged |

This gives a bare crop-name query the grain as well as the existing flour result, while preserving the exact flour-qualified query. No exact form-label match has priority for these terms.

## Forms, ledger, rules, and bundled recipe demand

The catalog has **199 forms** and no form attached to `ingredient-ref-finger-millet`; there is no active reference or form with an exact `nachni` term. Both global form-conversion and contextual-substitution rule files contain zero rules and no finger-millet or `nachni` entries.

The target ledger record is `ingredient-ref-finger-millet`: `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`; it has 10 source entries, four accepted decisions, no measurement observations, and no substitution findings. The matching flour ledger record is separately verified and owns the existing `nachni flour` decision. Keep both records’ current research states and the flour decision unchanged.

The manifest lists **114 recipe files and 1,123 ingredient rows**. A scan across every manifest-listed recipe file found no `nachni` text and no recipe rows linked to either the finger-millet grain or flour reference. No recipe edit or link is warranted.

## Exact proposed delta

If accepted, make these data-only changes:

1. In `ingredient-references.v1.json`, append `nachni` to `aliasesEn` on `ingredient-ref-finger-millet`, after `ragulu`. Set `updatedAt` to `2026-10-19T00:00:00Z` when integrating. Leave every other reference field and row unchanged.

   ```json
   "aliasesEn": ["ragi", "kurakkan", "mandua", "ragulu", "nachni"],
   "updatedAt": "2026-10-19T00:00:00Z"
   ```

2. On the existing `ingredient-ref-finger-millet` ledger record, add the existing FSSAI source entry `WP02-A6-NACHNI-FLOUR-20261012-S03` with its same URL, title, access date, locator, and support text; its source ID already exists on the flour record and must continue to resolve to the same URL. Add one new first-party product-page source entry:

   | Field | Proposed value |
   |---|---|
   | `sourceId` | `WP03-FINGER-MILLET-NACHNI-R837-20261019-S01` |
   | `url` | `https://mithilafoods.com/products/unpolished-whole-ragi-millet` |
   | `title` | `Mithila Foods, Unpolished Whole Ragi (Finger Millet/Nachni/Mandua/Kezhvaragu/Ragulu)` |
   | `accessedOn` | `2026-10-19` |
   | `sourceKind` | `manufacturer` |
   | `locator` | `Product heading; “What is Whole Ragi?” description; Ingredients statement.` |
   | `supports` | `The first-party product page calls the item whole finger millet, says whole Ragi is also known as Nachni, and lists 100% unpolished whole finger millet (Ragi) as its ingredient. This is product-owner naming evidence, not a Québec or Canadian terminology source.` |

3. Append this accepted alias decision to the grain ledger record. Keep `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`.

   ```json
   {
     "outcome": "accepted",
     "reason": "Add only nachni as a search alias on the existing finger-millet grain identity. FSSAI's official millet guidance lists Nachni as a Marathi name under Finger Millet (Ragi), and Mithila Foods' first-party whole-grain product page calls whole finger millet also known as Nachni. Keep the existing bilingual display and aliases; leave the qualified nachni flour alias on the separate flour reference. Add no French alias, form, measurement, recipe link, density, unit mapping, conversion, yield, or substitution.",
     "sourceIds": [
       "WP02-A6-NACHNI-FLOUR-20261012-S03",
       "WP03-FINGER-MILLET-NACHNI-R837-20261019-S01"
     ]
   }
   ```

   Add no measurement observation, substitution finding, form, density, unit mapping, conversion, yield, recipe link, or substitution rule.

Do not add `nachni` to the flour reference, `aliasesFr`, another millet identity, or a new reference. Do not infer `farine de nachni`, `nachni atta`, a cooked form, or any numeric behavior.

## Static checks and retrieval limits

- Read current `AGENTS.md`, the active Section F plan and roadmap, the [catalog workflow](../ingredient-catalog-workflow.md), the R833–R835 [latest integrated batch](../batches/wp02-wp03-wp04-r833-r835-gap-review-integration-20261019/README.md), the active catalog and ledger rows, form and rule files, search implementation, and manifest-listed recipes.
- Confirmed exact alias ownership, source-ID availability, current form/rule scope, phrase-first picker results, and all 114 manifest recipe files / 1,123 ingredient rows. No source or observation IDs are proposed outside the one new Mithila source ID.
- The FSSAI official PDF’s indexed text supplied the relevant vernacular-name line, but direct PDF retrieval failed because of its response size. The Mithila Foods first-party page opened and directly supplied the title, description, and ingredient text cited above. No Québec authority or Canadian grain product page was found for bare `nachni`; therefore the recommendation is an English-search-field alias only and makes no Québec display claim.
- This file is proposal documentation only. If the accepted implementation adds only database JSON data, the current `AGENTS.md` rule requires no software tests, build, emulator run, or deployment; use static package, ledger, search, corpus, encoding, and whitespace checks during integration.
