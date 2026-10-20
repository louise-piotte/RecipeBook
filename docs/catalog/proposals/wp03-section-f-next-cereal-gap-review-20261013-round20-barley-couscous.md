# WP03 Section F — barley couscous identity review (2026-10-13, round 20)

## Review record

- **Status:** Integrated on 2026-10-13; root integration complete.
- **Scope:** Whether a distinct barley-couscous product should own `barley couscous / couscous d'orge` and the product name `Belboula` in the active ingredient picker.
- **Exact open plan location:** [Section F checklist, “Regionally significant cereal mixes and preprocessed grains encountered in the cuisine sweeps”](../../RecipeBook-global-ingredient-catalog-plan.txt#L2400).
- **Recommendation:** Accept an identity-only reference `ingredient-ref-barley-couscous` with English display `barley couscous`, Québec French display `couscous d'orge`, and `belboula` as its sole English alias. Keep `malthouth` unassigned. The product identity and bilingual wording are supported, but one DARI page has a contradictory ingredient field; do not make broader composition claims from this packet.

## Why this is a distinct open gap

The Section F regional/preprocessed-grain checklist remains open. This review chooses a barley couscous product, distinct from the nearby grain and semolina inputs, the generic durum-wheat couscous reference, millet thiéré, and pearl couscous. The active catalog has no `ingredient-ref-barley-couscous`, exact `barley couscous` or `couscous d'orge` owner, or attached form for this candidate. Existing barley flakes, flours, cereals, grains, and the couscous references do not represent this named product.

This continues a different portion of the open item from the round-nine sorghum-couscous boundary hold and the round-twelve finger-millet-rava ledger-only candidate. It also follows, without repeating, the round-nineteen panivaragu alias review. Archive searches found no prior focused barley-couscous identity decision or matching active alias.

## Identity evidence and limits

| Proposed source ID | Source and evidence | Limit |
|---|---|---|
| `WP03-BARLEY-COUSCOUS-R20-20261013-S01` | DARI, [Barley Couscous (English product page)](https://couscousdari.com/en/barley-couscous). The title is “Barley Couscous”; the description calls it “Belboula”; the listed ingredient is 100% barley semolina; the page says it may be used in all recipes instead of regular durum-wheat couscous; it shows a 350 g format. | Manufacturer evidence for this product only. Its broad replacement statement has no ratio or recipe/method scope and does not establish a general substitution rule. The package size is not a serving measure. |
| `WP03-BARLEY-COUSCOUS-R20-20261013-S02` | DARI, [Barley Couscous (French product page)](https://www.couscousdari.com/fr/barley-couscous). Its description uses `couscous d'orge` and `Belboula`. | The French ingredient field says `100% semoule de blé dur`, contradicting the English page's `100% Barley Semolina`. Preserve that contradiction; do not assert a universal composition or silently resolve the French page as a typo. |
| `WP03-BARLEY-COUSCOUS-R20-20261013-S03` | DARI, [La marque Dari](https://www.couscousdari.com/fr/la-marque-dari). Brand history says DARI launched `un couscous d'orge (Belboula)` in 2001 and reports international distribution. | Corroborates the named product and alias, not exact ingredients, process, or Québec terminology preference. |
| `WP03-BARLEY-COUSCOUS-R20-20261013-S04` | Souk Place, [Couscous d'Orge (Malthouth)](https://www.soukplace.ca/products/copy-of-semoule-pain-dorge-dchiche). Québec-market-facing product page uses `Couscous d'Orge`, adds `(Malthouth)`, lists a 1 kg package, and states Saturday delivery in urban Outaouais/Ottawa-Gatineau. | Product wording/package listing only; the page does not give ingredients or establish that `malthouth` is a stable synonym across products. Retail page availability may change. |
| `WP03-BARLEY-COUSCOUS-R20-20261013-S05` | Souk Place, [Couscous, Semoule & Pâtes collection](https://www.soukplace.ca/collections/couscous-pates). Collection repeats the product heading `Couscous d'Orge (Malthouth)` and lists a 1 kg package. | Same seller as S04, not independent verification of ingredients or terminology. |
| `WP03-BARLEY-COUSCOUS-R20-20261013-S06` | Health Canada, [Canadian Nutrient File serving size: Grains, couscous, dry, Food Code 4420](https://aliments-nutrition.canada.ca/cnf-fce/serving-portion?id=4420&lang=eng&wbdisable=true). It reports generic dry couscous values including 100 ml = 73.1 g, 250 ml = 182.8 g, and 34.5 g to make 125 ml. | Generic couscous record, not barley couscous. Do not transfer its measures, serving observations, or density. |
| `WP03-BARLEY-COUSCOUS-R20-20261013-S07` | Tunisian National Tourism Office, [El Kef](https://www.discovertunisia.com/en/discover/el-kef). Its regional-food text describes `malthouth` as ground barley prepared in the same way as couscous. | Supports a regional food use of the word, but does not identify it as the same packaged product sold by Souk Place. It is a reason to leave bare `malthouth` out of the alias list. |

The current generic ingredient `couscous` remains the OQLF-defined product made from agglomerated durum-wheat semolina grains, steamed and dried. Reuse existing ledger sources `WP03-S164` ([OQLF couscous, cereal](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502225/couscous)) and `WP03-S166` ([Codex Standard for Couscous CXS 202-1995](https://www.fao.org/input/download/standards/65/CXS_202e.pdf)) for the generic product boundary; reuse `WP03-S165` ([OQLF couscous, prepared dish](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26502206/couscous)) if recording the separate dish sense. Do not mint another source record for these exact URLs. The qualified barley name is not an alias on the unqualified wheat product.

The exact source-ID and URL audit found no pre-existing ledger entry for S01–S07 and no occurrence of the proposed IDs in the ledger or proposal archive. Existing generic-couscous source IDs and URLs are reused only as listed above. The candidate reference ID and candidate-specific terms are not present in the active seed catalog or current reference ledger.

## Exact proposed reference fields

If accepted, add only this row to the ingredient-reference catalog:

```json
{
  "id": "ingredient-ref-barley-couscous",
  "nameEn": "barley couscous",
  "nameFr": "couscous d'orge",
  "aliasesEn": ["belboula"],
  "aliasesFr": [],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-13T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

Use `Belboula` as the English alias because DARI's English product page explicitly introduces it as the Moroccan name of this product. The current picker search checks both localized display names and both alias arrays together, so the alias remains searchable in either UI language without duplicating it in `aliasesFr` ([IngredientSearch.kt](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L187)). Store the alias lower-case in line with catalog normalization.

Do not add aliases `malthouth`, `barley semolina`, `semoule d'orge`, bare `barley`/`orge`, or unqualified `couscous`. The first is used for another regional barley food as well as on one retailer heading; the semolina phrases describe possible inputs and are not established as names for this exact finished product; the bare grain terms are too broad; and unqualified `couscous` belongs to existing wheat, millet-thiéré, and pearl-couscous results.

## Picker projection

Projection uses the current complete normalized word-phrase matching behavior over all active bilingual displays and aliases. Before this proposal, exact `couscous` returns the generic couscous, millet couscous (thiéré), and pearl couscous rows. Candidate-specific exact phrases have no active owner.

| Search query | Current results | With proposed row | Effect |
|---|---|---|---|
| `barley couscous` | None | `ingredient-ref-barley-couscous` | Qualified English query resolves to the new product. |
| `couscous d'orge` | None | `ingredient-ref-barley-couscous` | Qualified Québec French query resolves to the new product. |
| `belboula` | None | `ingredient-ref-barley-couscous` | One product-specific alias owner. |
| `couscous` | Generic couscous; millet couscous (thiéré); pearl couscous | Those three plus barley couscous | Adds one explicit choice; does not redirect generic couscous. |
| `barley` / `orge` | 12 active rows each | 13 active rows each | Adds one more qualified barley choice; broad searches stay multi-result. |
| `malthouth` | None | None | Remains unassigned to avoid merging regional ground/prepared barley food with the retailer's named product. |
| `semolina` | 4 active rows | 4 active rows | Unchanged; no input-semolina alias is proposed. |

## Recipe demand and link audit

All **114 manifest-listed recipe files** and **1,123 ingredient rows** were scanned across serialized strings and ingredient-reference IDs using normalized exact phrases for `barley couscous`, `couscous d'orge` (straight and curly apostrophes), `couscous orge`, `Belboula`, `Malthouth`, and the proposed reference ID. The scan found **zero matching recipe files**, **zero matching ingredient rows**, and **zero direct links** to `ingredient-ref-barley-couscous`. No recipe link or recipe edit is proposed. The catalog addition would serve future explicit picker demand, not an existing bundled recipe line.

## Measures, forms, and substitution boundaries

- **Forms:** Add none. The manufacturer page supports a named couscous product, but the review does not establish a separate form/state model for recipe use. Do not attach generic dry-couscous forms to this reference.
- **Measurements:** Use `measurementState: researched_no_supported_value`; add no measurement observation, density, mapping, conversion, yield, or serving amount. CNF code 4420 applies to generic dry couscous, not this barley-named product. DARI's 350 g format and the retailer's 1 kg package are package quantities; DARI's nutrition panel is per 100 g. None supports a cup measure, household serving, or density for this row.
- **Substitution:** Use `substitutionResearchState: blocked_pending_evidence`; add no global rule, contextual rule, conversion, or recipe-line substitution link. DARI's statement that its product can be used in all recipes instead of regular durum-wheat couscous is a broad manufacturer claim without a ratio, recipe/method boundaries, or reported comparative result. Record it as a source-specific claim if needed, but do not make it executable substitution behavior.
- **Yields:** None. No source supports a barley-couscous cooking yield or prepared quantity.

## Proposed ledger disposition and source reuse

Create one `ingredient_reference` record for `ingredient-ref-barley-couscous`, with `identityState: verified`, the exact display/alias fields above, and the measurement/substitution states given above. Add sources S01–S07 and one accepted identity decision stating that this is a distinct named barley-couscous product; explicitly preserve DARI's English/French ingredient-field conflict. Reuse `WP03-S164` and `WP03-S166` for the generic couscous boundary, and `WP03-S165` only if the prepared-dish distinction is captured. Do not register duplicate OQLF or Codex URLs.

No form record, measurement observation, unit conversion, package yield, recipe link, alias on another ingredient, or substitution finding/rule is proposed. In particular, keep `malthouth` unassigned and do not reinterpret the existing couscous, millet-thiéré, pearl-couscous, barley-grain, or barley-flour references.

## Review coverage

- Re-read `AGENTS.md`, the active Section F checklist and latest integration checkpoint, `roadmap.md`, current ingredient references, forms, and research ledger.
- Reviewed the current couscous and barley neighbors and focused Section F proposal archive, including the latest regional/preprocessed-grain reviews. No exact candidate or source-ID/URL reuse was found beyond the explicitly reused OQLF/Codex sources.
- Rechecked first-party DARI English/French product pages and DARI's French brand history, the Québec-facing Souk Place product/collection pages, Health Canada's generic couscous conversion, the OQLF generic product entry, and the Tunisian National Tourism Office's `malthouth` description on 2026-10-13.
- No tests were run; this packet is proposal documentation only and does not change catalog JSON, ledger, generated files, checklist, roadmap, recipes, or tests.
