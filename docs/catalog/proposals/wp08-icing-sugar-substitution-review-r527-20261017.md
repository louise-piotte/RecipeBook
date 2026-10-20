# WP08 / WP09 R527 — icing sugar alias and substitution review

## Review record

- **Date:** 2026-10-17
- **Scope:** Existing `ingredient-ref-icing-sugar`; identity and bilingual aliases, one source-bounded substitution, and separate measurement/substitution coverage states.
- **Recommendation:** Verify the existing identity and aliases without changing the active reference JSON. Add one volume-based, evidence-only substitution finding and one blocked mass-based context to the research ledger. Keep measurement research blocked; add no conversion, active substitution rule, form, recipe-line link, or recipe edit.
- **Status:** Integrated on 2026-10-17. See the [R527 integration README](../batches/wp08-wp09-icing-sugar-alias-substitution-integration-r527-20261017/README.md).

## Existing identity and live ownership

The active reference already has the following bilingual identity and aliases:

| Language | Display | Existing aliases |
|---|---|---|
| English | `icing sugar` | `confectioners' sugar`, `confectionery sugar`, `powdered sugar` |
| French | `sucre à glacer` | `sucre en poudre`, `sucre glace` |

Official Québec, Canadian, and bilingual retailer sources support these terms. The OQLF GDT identifies `sucre glace` as its preferred French term and gives `icing sugar` and `confectioner's sugar` in English. TERMIUM Plus explicitly says that `sucre glace` is called `sucre en poudre` in Québec. The Canadian Sugar Institute lists `sucre en poudre` as another name for `sucre glace`; Metro’s French Redpath product listing uses `Sucre à glacer` and lists refined cane sugar and cornstarch. Collins records `confectionery sugar` as a British English term for icing sugar. King Arthur also identifies confectioners’ sugar as powdered sugar or icing sugar.

Do not add `sucre fondant` as an alias. The Canadian Sugar Institute lists it as another name for `sucre glace`, but the active catalog deliberately retains a separate `fondant sugar / sucre à glacer fondant` reference. Keep the two identities separate and retain the current alias set pending stronger product-level evidence for any broader name change.

The record’s present ledger states are `identityState: unreviewed`, `measurementState: blocked_pending_evidence`, and `substitutionResearchState: not_yet_researched`. The seed reference contains no default density or unit mappings. Its nine published portion observations remain source-specific; this review does not change them or their blocked general measurement status.

## Picker projection

The read-only query projection follows the normalization and phrase-first search implemented in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). The exact aliases are already in the active reference, so root integration adds no picker terms.

| Query | Current result | Disposition |
|---|---|---|
| `sucre glace` | Icing sugar only | Supported Québec French search alias. |
| `sucre en poudre` | Icing sugar only | Supported Québec alias in TERMIUM Plus. |
| `sucre à glacer` | Icing sugar and `fondant sugar / sucre à glacer fondant` | Existing phrase-prefix result includes two distinct sugar identities. Keep both results visible; do not silently choose one or merge the references. |
| `icing sugar`, `powdered sugar`, `confectioners' sugar`, `confectionery sugar` | Icing sugar only | Existing English display/aliases resolve to this identity. |

The query `sucre à glacer` is therefore not a singleton in the current picker. Leave the plan’s generic requirement that it “resolve correctly” open until the product boundary and intended two-result behavior receive a dedicated picker-level sign-off. This review does not hide the fondant-sugar result by changing either identity.

## Recipe demand and context

The 114 manifest-listed recipe files contain **30** ingredient rows already linked to icing sugar across **26** recipes. The uses include frosting, fillings, glaze, pastry, confectionery, and optional dusting. This is established catalog demand for the existing identity, not evidence to attach one generic substitute to every linked line. No recipe line or instruction was changed, and no line-level substitution link is recommended.

## WP08 substitution finding

The University of Nebraska–Lincoln’s general ingredient-substitution table gives an explicit volume substitution: **1 cup confectioners’ or powdered sugar** can be replaced with **1 cup granulated sugar plus 1 tablespoon cornstarch**, processed in a food processor with a metal blade until blended and powdery. The same page cautions that a substituted final product may differ slightly in flavor, texture, and appearance.

King Arthur’s sugar guide corroborates the DIY powdered-sugar preparation and gives a useful context boundary: it recommends using the substitute by volume for dusting and by weight for a batter or dough. It also explains that confectioners’ sugar lacks defined crystals and is not suitable for creaming butter. The cited instructions do not report a measured mass for the finished homemade powder or a mass-to-mass replacement ratio.

Recommended evidence-only ledger representation:

1. Add a `researched_supported` finding for the **volume-based** one-cup substitution, represented as the compound recipe `1 cup granulated sugar + 1 tablespoon cornstarch`. Record the food-processor method, volume basis, source caveat about possible product differences, and that the finding is not a universal icing/frosting/creaming equivalence.
2. Add a `blocked_pending_evidence` finding for **mass-based batter/dough replacement**. Preserve King Arthur’s direction to use weight in those contexts, but do not infer a finished-powder mass or mass ratio from the preparation formula. Keep that use blocked until a source reports the needed mass basis.
3. Set the record-level substitution state to `researched_supported` because one documented context is supported. Leave `measurementState` at `blocked_pending_evidence` and `identityState` at `verified`.

Do not add `ruleId`, a global or contextual runtime rule, a recipe-line link, or a unit conversion. The evidence is recipe guidance, not a runtime-validated exchange for every frosting, glaze, cream, or baked formula.

## Ownership audit

The live ledger already cites the King Arthur sugar guide for demerara, muscovado, and turbinado sugar, and the Canadian Sugar Institute page for fine-grain granulated sugar and other sugar identities. Reuse of these source URLs is appropriate; the R527 source IDs remain unique to the icing-sugar record. The OQLF, TERMIUM Plus, Metro, Collins, and University of Nebraska–Lincoln URLs have no current ledger owners. No proposed R527 source ID collides with an existing ID.

No current reference or form owns the exact aliases beyond the expected icing-sugar reference. `fondant sugar` remains a distinct active identity and is the only second result for the broader French display phrase. The manifest corpus was scanned in full; the existing 30 linked icing-sugar rows were retained as demand evidence.

## Proposed source register

All sources were checked online on 2026-10-17. Proposed IDs are unique and should be added only to the `ingredient-ref-icing-sugar` ledger record.

| Source ID | Source and locator | Supports and limits |
|---|---|---|
| `WP08-ICING-SUGAR-R527-20261017-S01` | University of Nebraska–Lincoln, [Basic Ingredient Substitutions](https://food.unl.edu/article/ingredient-substitutions/), “Sugar, Confectioners’ or Powdered” row, 1 cup amount. | Gives 1 cup source sugar and the replacement of 1 cup granulated sugar plus 1 tablespoon cornstarch, processed with a metal blade until powdery. This supports a volume basis only; it gives no finished replacement mass. |
| `WP08-ICING-SUGAR-R527-20261017-S02` | King Arthur Baking, [A guide to different types of sugars, how to use them, and when to substitute](https://www.kingarthurbaking.com/blog/2023/03/21/a-guide-to-different-types-of-sugars-how-to-use-them-and-when-to-substitute), “Confectioners’ sugar” section. | Confirms common English names, a DIY sugar/cornstarch formula, by-weight use in batter or dough, by-volume use for dusting, and that confectioners’ sugar does not cream butter well. It does not state the finished homemade powder’s mass. |
| `WP09-ICING-SUGAR-R527-20261017-S01` | Office québécois de la langue française, [sucre glace | GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8433502/sucre-glace), preferred French term, definition, and English terms. | Supports `sucre glace`, `icing sugar`, and `confectioner's sugar`; defines the finely powdered sugar and notes starch is often added. The entry’s last update is 1982. |
| `WP09-ICING-SUGAR-R527-20261017-S02` | Government of Canada TERMIUM Plus, [SUCRE POUDRE search record](https://www.btb.termiumplus.gc.ca/tpv2alpha/alpha-eng.html?i=&index=frr&lang=eng&srchtxt=SUCRE+POUDRE), Record 1 textual support. | Explicitly identifies `sucre en poudre` as the Québec name for `sucre glace` and describes the powdered sugar/cornstarch product. |
| `WP09-ICING-SUGAR-R527-20261017-S03` | Canadian Sugar Institute, [Les types de sucre](https://sugar.ca/sugar-basics/types-of-sugar?lang=fr), “Sucre glace” table row. | Lists `sucre en poudre` among alternate names, describes finely ground sugar with about 3% corn starch, and notes icing uses. Also lists `sucre fondant`; that phrase is not added as an alias because the catalog has a separate fondant-sugar identity. |
| `WP09-ICING-SUGAR-R527-20261017-S04` | Metro, [Sucre à glacer Redpath](https://api.metro.ca/epicerie-en-ligne/allees/garde-manger/ingredients-pour-cuisson-et-preparation/sucres-et-edulcorants/sucre-a-glacer/p/062847510708), product title and ingredient panel. | Supports Québec retail product wording `Sucre à glacer` and a cane-sugar/cornstarch formulation. The page includes a past promotion date; no price or current stock claim is used. |
| `WP09-ICING-SUGAR-R527-20261017-S05` | Collins English Dictionary, [confectioners’ sugar](https://www.collinsdictionary.com/us/dictionary/english/confectioners-sugar), British English variant. | Supports `confectionery sugar` as a British English term for icing sugar; terminology evidence only. |

## Integration checklist

- [ ] Add the seven source entries, two decisions, and two context-specific substitution findings to the existing icing-sugar ledger record.
- [ ] Update `identityState` to `verified` and `substitutionResearchState` to `researched_supported`; preserve `measurementState: blocked_pending_evidence` and all nine portion observations.
- [ ] Leave the active ingredient reference, forms, mappings, recipe rows, substitutions package files, generated index, and manifest unchanged.
- [ ] Add a completed WP09 alias-review item and a WP08 bounded-substitution item to the plan; leave the generic French picker resolution item open because `sucre à glacer` returns two distinct identities.
- [ ] Run ledger schema/source-ownership checks, then verify UTF-8/no-BOM, local links, and scoped whitespace. No software tests are needed for this evidence-only JSON update under `AGENTS.md`.
