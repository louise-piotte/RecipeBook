# WP03 Section F R89 — barley bran Québec-display review (2026-10-13)

## Review record

- **Reviewed:** 2026-10-13.
- **Scope:** The still-open Québec French display review for the existing identity-only `ingredient-ref-barley-bran`. This is a terminology review of the R56 barley-bran row, not a new grain identity and not a reopening of R87 `uruchi rice` or R88 hulless-barley aliases.
- **Plan location:** The Section F packet marks `barley bran / son d'orge` as integrated with its French wording pending independent Québec review ([active grain packet, row 119](../batches/plant-grains-cereals.md#L119); [live plan, R56 checklist entry](../../RecipeBook-global-ingredient-catalog-plan.txt#L530)). Section F and its regional/preprocessed-grain checklist remain open.
- **Recommendation:** **Retain `son d'orge` as the current source-supported French display, with no new aliases or canonical reference change.** Santé Canada uses and defines this exact French name. OQLF's term family supports `son` as the French milling-fraction name and its 2017 entry for `son d'avoine` documents a closely parallel edible cereal-bran use. Do not describe `son d'orge` as an OQLF-preferred term: no exact OQLF barley-bran entry or standalone Québec barley-bran retail label was found in the targeted search. If the packet requires a separate human Québec terminology sign-off, leave that sign-off open until obtained.
- **Work boundary:** Proposal only. No shared reference, form, ledger, recipe, plan, roadmap, code, generated file, or batch README was edited. No app tests, Gradle tasks, emulator runs, or deployment were performed.

## Terminology evidence and limits

Santé Canada’s current French *Liste des fibres alimentaires évaluées et acceptées* (updated June 2021) names **`Son d'orge`** and defines it as coming from dehulled or hull-less barley grain through standard dry-milling techniques that may include steaming or tempering [R56-S02, R89-S01]. The English page names **`Barley bran`** for the matching description [R56-S01]. This directly attests the bilingual name and supports the existing barley-source milling-fraction identity. The page is a dietary-fibre reference; its acceptance classification and health-effect language are not a product health claim, nutrition value, culinary measure, or terminology ruling.

OQLF's 2017 GDT entry **`son d'avoine`** is a preferred French term in the food/cereal-products domain. It defines the oat-bran material and notes its use as a cereal or as a powder added to foods or recipes [R89-S02]. This is strong Québec evidence that a source-qualified `son de/d'…` term can identify an edible cereal-bran ingredient, but it is not a direct OQLF decision about barley bran. OQLF's broader **`son`** entry defines the peripheral cereal part separated from flour during milling [R89-S03]. That older entry also discusses several milling by-products and animal-feed use, so it supports the base word only; it does not make every barley milling by-product a recipe ingredient. The OQLF **`orge / barley`** pair is already recorded on the R52 generic-barley record and is reused here without a duplicate source record.

Targeted OQLF searches for `son d'orge`, `son d’orge`, and barley-bran wording did not surface an exact GDT entry. The Québec-focused search also did not find a current standalone consumer package specifically titled `son d'orge`. Those are evidence limits, not evidence that the phrase is incorrect. With the exact current Santé Canada French form and OQLF support for the term construction and edible oat-bran pattern, the reviewed record has a defensible Québec-facing display while remaining clearly distinguished from an OQLF-preferred compound.

## Current ownership, forms, and picker boundaries

The read-only live snapshot contains **1,420 ingredient references, 104 ingredient forms, 63 legacy-import candidates, and 1,759 research-ledger records**. The manifest lists **114 recipe files and 1,123 ingredient rows**.

The active `ingredient-ref-barley-bran` row is `barley bran / son d'orge`, category `GRAIN_AND_CEREAL`, with empty English and French alias arrays, null `defaultDensity`, and empty `unitMappings`. It has no attached form. Its single ledger record is identity-verified, with `measurementState: researched_no_supported_value` and `substitutionResearchState: researched_no_supported_substitute`; it has no measurement observations or substitution findings. Exact normalized reference/form/legacy ownership checks found no other owner for the qualified phrases `barley bran` or `son d'orge`. The ledger's only barley-bran identity record is this existing row; R89 introduces no new ingredient or candidate ID.

A read-only picker projection reproduced the matching rules in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt): complete normalized word phrases are preferred, and substring matching is used only when there is no phrase match. Accent and punctuation normalization maps `son d’orge` and `son d'orge` to the same query key.

| Query | Current projected results | Boundary |
| --- | ---: | --- |
| `barley bran` | 1 — `ingredient-ref-barley-bran` | Qualified English query selects the existing row. |
| `son d'orge` | 1 — `ingredient-ref-barley-bran` | Qualified French query selects the existing row. |
| `bran` | 8 bran-related rows | Broad term remains a multi-choice query, including bran-flakes cereal and source-specific bran identities. |
| `son` | 7 source-specific bran rows | Broad French query remains a multi-choice query. |
| `barley` / `orge` | 17 rows each | Broad barley searches retain grain, bran, flour, flakes, couscous, starch, cereal, and other qualified choices. |
| `bran flakes` | 1 — `ingredient-ref-bran-flakes-cereal` | The ready-to-eat cereal stays distinct from plain barley bran. |
| `oat bran` / `son d'avoine` | 1 — `ingredient-ref-oat-bran` | The OQLF comparator remains on oat bran. |
| `rice bran` | 2 — rice bran and rice-bran oil | The existing oil relation remains visible; the French `son de riz` selects the rice-bran row. |
| `corn bran` / `son de maïs` | 1 — `ingredient-ref-corn-bran` | Source-grain-qualified term retains its existing owner. |
| `rye bran` / `son de seigle` | 1 — `ingredient-ref-rye-bran` | Source-grain-qualified term retains its existing owner. |

No new alias is proposed, so these result sets do not change. Keep bare `bran` / `son`, `barley fibre` / `barley fiber`, `barley shorts`, `barley middlings`, `remoulage d'orge`, and `issue d'orge` out of the barley-bran aliases. Bare bran words would hide the source-grain qualifier; the remaining terms can denote other milling fractions, fibre concentrates, or feed/by-products and are not established as synonyms for the current human-food barley-bran scope.

The nearby R88 change adds hulless-type names to the existing hulled whole-kernel barley row. R89 adds none of those terms to barley bran: hulless barley is a type of edible whole kernel, while barley bran is a separate milling fraction.

## Recipe demand and numeric or substitution evidence

A read-only scan of every manifest-listed recipe and structured ingredient row searched case-, accent-, and punctuation-normalized qualified phrases including `barley bran`, `son d'orge`, `barley fibre`, `barley fiber`, `barley shorts`, `barley middlings`, `issue d'orge`, and `remoulage d'orge`. It found **0 of 114 recipe files, 0 of 1,123 ingredient rows, and 0 direct links** to `ingredient-ref-barley-bran`. No recipe link, relink, or recipe edit is proposed.

The current reference has no density or unit mapping; there is no barley-bran form, measurement observation, or supported cooking yield in its ledger record. The Health Canada dry-milling description and accepted-fibre classification provide no household measure, volume-to-mass mapping, density, dry-to-cooked conversion, or recipe yield. Do not transfer values from barley grain, pearl barley, oat bran, generic grain bran, or a package size.

No reviewed source gives a tested, quantity-qualified recipe substitution between barley bran and any other bran, grain, flour, meal, cereal, or fibre concentrate. The ledger contains no substitution finding and the bundled global and contextual substitution-rule files contain no rules for this reference. Keep global conversions and contextual substitutions absent; do not infer that the different grain brans are interchangeable.

## Exact proposed JSON and ledger delta

**Ingredient references:** no change. Keep `ingredient-ref-barley-bran` exactly as it is: `barley bran / son d'orge`, empty alias arrays, `defaultDensity: null`, `unitMappings: []`, and category `GRAIN_AND_CEREAL`.

**Forms, recipe links, measurements, conversions, yields, and substitutions:** no change.

**Research ledger:** append the two proposal-local OQLF source entries and one terminology decision below to the existing `ingredient-ref-barley-bran` record. Reuse the existing R56 Santé Canada English/French sources and R52 OQLF `orge` source. Do not change its identity, measurement, or substitution states, and add no measurement observation or substitution finding.

```json
[
  {
    "sourceId": "WP03-BARLEY-BRAN-QC-R89-20261013-S01",
    "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son",
    "title": "Office québécois de la langue française, GDT: son",
    "accessedOn": "2026-10-13",
    "locator": "Alimentation > céréale traitée; definition and note.",
    "supports": "Defines son as the peripheral cereal part separated from flour during milling. Its broader note includes other by-products and animal-feed usage, so this supports the French base term only and does not define barley bran as a human-food product.",
    "sourceKind": "regional_authority",
    "versionOrDate": "Last updated 1982."
  },
  {
    "sourceId": "WP03-BARLEY-BRAN-QC-R89-20261013-S02",
    "url": "https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18955166/son-davoine",
    "title": "Office québécois de la langue française, GDT: son d'avoine",
    "accessedOn": "2026-10-13",
    "locator": "Alimentation > céréale traitée; definition, note, and preferred term.",
    "supports": "Lists son d'avoine as a preferred Québec French term, defines the edible oat-bran fraction, and notes its use as cereal or as powder added to foods and recipes. Supports the source-qualified bran naming pattern and culinary use of son; it does not establish an OQLF-preferred barley-bran compound.",
    "sourceKind": "regional_authority",
    "versionOrDate": "Last updated 2017."
  }
]
```

```json
{
  "outcome": "accepted",
  "reason": "Retain the existing French display son d'orge as the current source-supported Québec-facing term. Santé Canada’s 2021 bilingual list uses Son d'orge and defines the matching barley-bran milling fraction; OQLF defines son as the French cereal-milling term and lists son d'avoine as a preferred edible cereal-bran term used in foods. No exact OQLF barley-bran entry or standalone Québec barley-bran label was found, so do not call son d'orge an OQLF-preferred term. Keep the reference unchanged and add no aliases, forms, numeric values, recipe links, conversions, yields, health claims, or substitutions. Leave any separate human Québec sign-off open if one is required by the integration process.",
  "sourceIds": [
    "WP03-BARLEY-BRAN-20261013-R56-S01",
    "WP03-BARLEY-BRAN-20261013-R56-S02",
    "WP03-GENERIC-BARLEY-R52-20261013-S01",
    "WP03-BARLEY-BRAN-QC-R89-20261013-S01",
    "WP03-BARLEY-BRAN-QC-R89-20261013-S02"
  ]
}
```

The Health Canada sources directly attest the bilingual term and matching fraction. OQLF contributes local French wording evidence, not a barley-specific equivalence or Québec retail claim. The R56 source says the milling process may include steaming or tempering; the review does not create forms from those optional industrial steps.

## Source register

Sources were accessed on 2026-10-13. Existing ledger source IDs are shown as reused; only the two new OQLF source IDs above are proposed for the ledger.

| Source ID | Source and locator | Supports / limits |
| --- | --- | --- |
| `WP03-BARLEY-BRAN-20261013-R56-S01` | Health Canada, [List of Dietary Fibres Reviewed and Accepted by Health Canada's Food Directorate](https://www.canada.ca/en/health-canada/services/publications/food-nutrition/list-reviewed-accepted-dietary-fibres.html), Table 1, Brans, “Barley bran”; updated June 2021. | Defines barley bran from dehulled or hull-less barley grain using standard dry-milling techniques, optionally including steaming or tempering. English name and scope; fibre classification is not an app health claim or conversion. |
| `WP03-BARLEY-BRAN-20261013-R56-S02` | Santé Canada, [Liste des fibres alimentaires évaluées et acceptées par la Direction des aliments](https://www.canada.ca/fr/sante-canada/services/publications/aliments-et-nutrition/liste-fibres-alimentaires-evaluees-acceptees.html), tableau 1, Sons, “Son d'orge”; mise à jour juin 2021. | Direct French name and the same barley-source description. This is an official Canadian French source, not an OQLF ruling or standalone Québec retail label. |
| `WP03-BARLEY-BRAN-20261013-R56-S03` | Canadian Food Inspection Agency, [Labelling and composition requirements for grain and bakery products](https://inspection.canada.ca/en/food-labels/labelling/industry/grain-and-bakery-products), “Common name — Bran.” | Supports naming the cereal source for bran other than wheat. It does not establish French naming or barley-bran measures. |
| `WP03-GENERIC-BARLEY-R52-20261013-S01` (reused) | OQLF, [orge (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8880282/orge), updated 2019. | Pairs orge with barley and treats the term in a food/cereal context. Supports the existing barley component, not the bran compound. |
| `WP03-BARLEY-BRAN-QC-R89-20261013-S01` | OQLF, [son (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son), updated 1982. | Québec French base term and milling definition. Its note's broader animal-feed/by-product scope limits its use here. |
| `WP03-BARLEY-BRAN-QC-R89-20261013-S02` | OQLF, [son d'avoine (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/18955166/son-davoine), updated 2017. | Preferred Québec French source-specific bran term with documented food use; a close naming pattern, not direct barley-bran terminology. |

## Static review record

Actually performed for this proposal:

- Read the current `AGENTS.md` and `Requirements.md`, the Section F plant-grains packet and open checklist, the current Section F plan entries, the latest roadmap entries, and the relevant R56, R87, and R88 proposal/integration records.
- Recounted references, forms, legacy candidates, ledger records, manifest recipes, and ingredient rows directly from current JSON files; counts matched **1,420 / 104 / 63 / 1,759 / 114 / 1,123**.
- Checked the active bilingual reference fields, attached forms, exact phrase ownership across references/forms/legacy candidates, the corresponding ledger record and states, and both bundled substitution-rule files. Reproduced current picker results with a read-only projection of the `IngredientSearch.kt` matching logic.
- Scanned all manifest-listed recipes and ingredient rows for the qualified barley-bran/French terms and adjacent milling-fraction phrases; found zero candidate mentions and zero direct links.
- Opened the current OQLF `son`, OQLF `son d'avoine`, Santé Canada English/French, CFIA, and existing OQLF `orge` sources online. The source limits and lack of a barley-specific OQLF entry or standalone Québec product label are recorded above. Checked the proposed R89 source-ID prefix and two OQLF source URLs against the current ledger before use; no prior ownership was found.
- No tests, Gradle tasks, Android emulator, or deployment were run. Section F remains open.
