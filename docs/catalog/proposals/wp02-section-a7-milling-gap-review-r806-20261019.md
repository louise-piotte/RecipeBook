# WP02 Section A7 R806 — malted rye flour alias and substitution evidence review

**Review date:** 2026-10-19
**Status:** Proposal for a narrow catalog and ledger update; no shared data has been changed.
**A7 anchor:** The active checklist remains open at [Section A7](../../RecipeBook-global-ingredient-catalog-plan.txt#L2276). R662 already recorded one Briess formula portion for malted rye flour; this review does not repeat that measurement work.

## Recommendation

Keep the existing identity `malted rye flour / farine de seigle malté`. Add the source-attested English phrase `rye malt flour` as one search alias. Record a bounded no-supported-substitute finding and change the ledger research state from `not_yet_researched` to `researched_no_supported_substitute`.

Do not change the existing 3/4 cup (98 g) Briess L100 formula observation, add another measure, or set active density, mappings, forms, recipe links, or substitution rules. The available substitution evidence is for plain medium rye flour or for using malt as a flavor/functional ingredient; neither establishes a reusable replacement ratio for malted rye flour.

## Identity and Québec French wording

The active row is `ingredient-ref-malted-rye-flour`, category `FLOUR_AND_STARCH`, displayed as `malted rye flour / farine de seigle malté`. Briess currently lists a cereal-specific malted rye flour product, MRF L100. A Canadian bilingual product specification for sesame brioche burger buns made at Baie-d’Urfé lists the exact ingredient terms `Malted rye flour` and `farine de seigle malté`. This supports the existing English and Québec-facing French display pair, while the Sysco document is an ingredient declaration for a composite bun, not a standalone flour label.

The current OQLF `malté` entry is scoped to tea flavour terminology, not cereal flour. Do not represent the display as an OQLF term ruling. The Québec product label is direct local usage evidence.

Keep neighboring identities separate: plain `rye flour / farine de seigle`, `rye meal / gruau de seigle`, generic `malt flour / farine maltée`, malted barley and wheat flours, roasted wheat malt flour, and the unresolved malted-rye-meal candidate. Do not add aliases for generic `malt flour`, `rye malt`, malt extract, toasted rye flour, or malted rye meal.

## Alias review

Briess's currently accessible 2013 Pumpernickel Dinner Rolls article uses the ingredient wording `Briess Rye Malt Flour`. The surrounding text says the recipe uses Briess Rye Malt and explains that the malt is ground into flour for those rolls. This supports `rye malt flour` as a narrow English search phrase for the same culinary material. It does not establish a new product class or a general milling specification.

Add only `rye malt flour` to `aliasesEn`. Keep `aliasesFr` empty; the verified Canadian label already matches the French display. Do not add the broader phrase `malt flour`, which belongs to the separate generic malt-flour row.

## Measurement and density review

The existing R662 observation remains the only measurement evidence: Briess publishes 3/4 cup and 98 g on the same row for `BriesSpecialty Malted Rye Flour L100` in its *Malted Rye Rolls* formula. That one formula does not state cup convention, fill method, serving count, or weighing procedure. It is a product- and formula-specific portion, not a generic cup weight, density, unit mapping, or replacement ratio.

Briess's current malted-flour listing also gives a 50 lb package option for its industrial products, which is packaging information rather than a kitchen measure. No new measurement observation is proposed; retain `measurementState: researched_supported`, `defaultDensity: null`, and `unitMappings: []`.

## Substitution review

Briess currently places MRF L100 under its diastatic malt flours and lists 100° Lintner. Its technical overview says rye malt can be produced as either diastatic or nondiastatic and explains that diastatic malt flours have enzyme activity; the product page describes these ingredients as dough conditioners. This is product-specific functional evidence, not a flour replacement instruction. The R662 *Malted Rye Rolls* formula lists the named L100 product alongside all-purpose flour but gives no alternative formula or comparison.

King Arthur's replacement guide tests its named Organic Medium Rye Flour in place of all-purpose flour, starting at 25% by weight and discussing results by baked-good type. The guide does not identify that flour as malted or diastatic. Its tested ratio cannot be transferred to malted rye flour. No reviewed current source supplies an alternate ingredient, matched comparison, or quantified replacement range for malted rye flour.

Record `researched_no_supported_substitute` for the bounded question of a reusable malted-rye-flour replacement across recipes. Preserve the plain-medium-rye guide as a rejected transfer lead. Add no global or contextual rule and no recipe-line substitution.

## Catalog, ledger, search, and demand audit

| Surface | Current state and proposed boundary |
| --- | --- |
| Active catalog | The bilingual reference has no aliases, null density, and empty unit mappings. Add only the English alias `rye malt flour`; keep the names, category, French aliases, density, and mappings unchanged. |
| Ledger | Identity is `verified`; measurement is `researched_supported` with one R662 observation; substitution is `not_yet_researched`. Keep the observation; add one no-supported-substitute finding and update only the substitution research state. |
| Forms and rules | No ingredient form is attached to this reference. The current package has zero global and zero contextual substitution rules. Add no form or rule. |
| Neighboring rows | Rye flour, rye meal, generic malt flour, malted rye meal, and cereal-specific malt flours remain distinct. No quantity or source identity transfers to those rows. |
| Legacy identities | No legacy candidate owns the reviewed English or French phrases. |
| Search | Current exact English `malted rye flour`, French `farine de seigle malté`, and accent-folded French queries select only this row. `rye flour` returns the wider six-row rye-flour family, including this explicitly malted identity. `rye malt flour` currently has no match; after the proposed alias it selects only this row. Because phrase-first search accepts a complete query phrase within a longer alias, `malt flour` also gains this qualified rye-malt row; the broad query remains multi-result and no bare `malt flour` alias is added. |
| Recipe demand | The 114 manifest-listed recipes contain 1,123 ingredient rows. A scan for the active ID, product name, English/French names, the proposed alias, and the L100 product wording found no matching recipe text or direct reference link. The Briess formulas are external evidence, not bundled recipe demand; add no recipe link. |

The current package snapshot contains 1,884 references, 199 forms, and no global or contextual substitution rules. New source IDs and URLs proposed below have no existing ledger owners. The existing Briess product-page source and R662 formula source are reused; no duplicate URL entry is proposed for either.

## Exact proposed delta

### Active ingredient reference

For `ingredient-ref-malted-rye-flour`:

```json
{
  "aliasesEn": ["rye malt flour"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": []
}
```

Retain `nameEn: "malted rye flour"`, `nameFr: "farine de seigle malté"`, category `FLOUR_AND_STARCH`, and the existing source-supported English/Québec French names.

### Research ledger

On the existing `ingredient-ref-malted-rye-flour` record:

- Keep `identityState: verified` and `measurementState: researched_supported`.
- Change `substitutionResearchState` to `researched_no_supported_substitute`.
- Keep the R662 measurement observation unchanged; add no measurement observation or unit conversion.
- Add one `substitutionFindings` record with no replacements:

```json
{
  "findingId": "malted-rye-flour-no-transferable-replacement-r806-20261019",
  "researchState": "researched_no_supported_substitute",
  "context": "Whether malted rye flour can replace another flour, or be replaced by one, at a reusable amount across recipe roles and methods.",
  "basis": "Briess's Malted Rye Rolls formula lists BriesSpecialty Malted Rye Flour L100 alongside all-purpose flour but supplies no alternate formula or comparison. Briess identifies that L100 product as a diastatic malt flour at 100 degrees Lintner and describes enzyme-active malt flour as a dough conditioner. King Arthur's 25% replacement guidance is for its named plain Organic Medium Rye Flour, without evidence that the tested product is malted or diastatic. No transferable malted-rye-flour ratio is supported.",
  "replacements": [],
  "rejectedCandidates": [
    {
      "candidate": "plain medium rye flour / ingredient-ref-medium-rye-flour",
      "reason": "King Arthur's tested guidance is scoped to its named medium rye product and does not establish an equivalent for enzyme-active malted rye flour.",
      "sourceIds": ["WP02-A7-MALTED-RYE-FLOUR-SUB-R806-20261019-S02"]
    },
    {
      "candidate": "all-purpose flour / ingredient-ref-all-purpose-flour",
      "reason": "Briess lists all-purpose flour in the same formula as L100 but gives no comparison or replacement direction.",
      "sourceIds": ["WP02-A7-MALTED-RYE-FLOUR-PORTION-R662-20261018-S01"]
    }
  ],
  "limitations": [
    "Briess's activity data are specific to MRF L100; the active reference has no diastatic or nondiastatic form distinction.",
    "No bundled recipe uses this ingredient, and no active replacement rule is justified."
  ],
  "sourceIds": [
    "WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S08",
    "WP02-A7-MALTED-RYE-FLOUR-PORTION-R662-20261018-S01",
    "WP02-A7-MALTED-RYE-FLOUR-SUB-R806-20261019-S02",
    "WP02-A7-MALTED-RYE-FLOUR-SUB-R806-20261019-S03"
  ]
}
```

Add the following source entries to the target record:

| Source ID | URL and evidence | Limit |
| --- | --- | --- |
| `WP02-A7-MALTED-RYE-FLOUR-ALIAS-R806-20261019-S01` | [Brewing With Briess, Pumpernickel Dinner Rolls](https://www.brewingwithbriess.com/blog/dress-up-your-thanksgiving-feast-with-a-double-dose-of-malt/), published 2013; the recipe names Briess Rye Malt Flour and describes milling the malt into flour. | Supports the exact English phrase as a recipe-attested search alias only. Do not reuse its 1-cup formula amount as a generic measurement or substitution. |
| `WP02-A7-MALTED-RYE-FLOUR-SUB-R806-20261019-S02` | [King Arthur Baking, How to substitute rye for all-purpose flour](https://www.kingarthurbaking.com/blog/2020/10/05/how-to-substitute-rye-for-all-purpose-flour), current page reviewed 2026-10-19. | Describes tests on named Organic Medium Rye Flour. Retain only as a rejected transfer lead; it is not evidence for malted rye flour. |
| `WP02-A7-MALTED-RYE-FLOUR-SUB-R806-20261019-S03` | [Briess Malt & Ingredients, Malting & Roasting](https://food.briess.com/capabilities/malting/), reviewed 2026-10-19. | Describes rye malt as diastatic or nondiastatic and the enzyme activity of diastatic malt. It supports the product-function boundary, not a replacement ratio. |

Reuse `WP02-A7-GRAIN-MEALS-MALT-TOASTED-BOUNDARIES-20261010-S08` from the existing target row, refreshing its locator/support to capture the current product page's MRF L100 / 100° Lintner entry. Add S03 for Briess's rye-malt diastatic/nondiastatic overview. Reuse `WP02-A7-MALTED-RYE-FLOUR-PORTION-R662-20261018-S01` for the no-alternative formula finding without changing the existing observation. Keep the existing Sysco bilingual-label source unchanged.

Do not add an alias to the French list, measurement observation, density, mapping, form, package yield, recipe link, global rule, contextual rule, or line-level substitution.

## Sources checked on 2026-10-19

1. [Briess Malt & Ingredients, Malted Flours](https://food.briess.com/products/briess-specialty-malt-flours/) — current product listing identifies MRF L100 under Diastatic Malt Flours at 100° Lintner and distinguishes malt-flour product grades. The listing is industrial product information, not a home-recipe replacement guide.
2. [Briess Malt & Ingredients, Malting & Roasting](https://food.briess.com/capabilities/malting/) — explains diastatic versus nondiastatic activity, allows rye malt in either class, and describes rye malt applications in rye-flavored breads and crackers. It does not give a rye-flour replacement ratio.
3. [Sysco Canada, Sesame Brioche Burger Bun product specification](https://syscoitems.ca/specifications/burger_5574047x1.pdf) — the English and French ingredient declarations give the exact label pair; the specification is for a composite bun and is dated 2021.
4. [Briess, Malted Rye Rolls](https://food.briess.com/wp-content/uploads/2019/05/Briess_Recipes_MaltedRyeRolls.pdf) — existing R662 source, directly pairs 3/4 cup with 98 g for L100; no cup convention, serving count, comparison formula, or substitute is supplied.
5. [Brewing With Briess, Pumpernickel Dinner Rolls](https://www.brewingwithbriess.com/blog/dress-up-your-thanksgiving-feast-with-a-double-dose-of-malt/) — published in 2013 and currently accessible; supports the exact word-order alias only.
6. [King Arthur Baking, How to substitute rye for all-purpose flour](https://www.kingarthurbaking.com/blog/2020/10/05/how-to-substitute-rye-for-all-purpose-flour) — plain medium-rye substitution evidence, reviewed only to test whether its ratio transfers; it does not establish malted-rye equivalence.
7. [OQLF, malté](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3285972/malte) — the current entry is tea-flavour scoped; it is not used as authority for the French flour display.

## Static checks and test scope

- Read `AGENTS.md`, the requirements for ingredient references and substitution scope, the active roadmap entries, the current A7 checklist, the R662 proposal, and the active reference/ledger before selecting this follow-up.
- Reopened the manufacturer product, recipe, Québec label, and comparison sources online and checked identity, Québec naming, aliases, quantity evidence, and substitutions separately.
- Audited the active row, forms, global/contextual rule files, legacy-import candidates, current picker projection, and all 114 manifest-listed recipes / 1,123 ingredient rows.
- Confirmed the three new source IDs and URLs have no current ledger owners; reused the existing Briess product-page and R662 measurement source IDs rather than adding duplicate URL records.
- This file is a proposal only; shared JSON and the active package are unchanged. No software tests, build, emulator run, or deployment were run. If accepted, the planned app change is limited to bundled catalog/database JSON; `AGENTS.md` states that JSON-only data additions do not require tests.
