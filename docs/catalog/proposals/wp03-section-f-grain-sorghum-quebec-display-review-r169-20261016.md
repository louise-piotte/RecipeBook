# WP03 Section F — grain-sorghum Québec display review (R169, 2026-10-16)

## Review record

- **Status:** Proposal only. No shared catalog JSON, research ledger, generated code, plan, roadmap, recipe, or batch README was changed.
- **Question:** Does current Québec French evidence support changing the existing `grain sorghum / sorgho à graine` display or adding a shorter French grain alias?
- **Recommendation:** **Retain the current display and aliases; make no catalog or ledger change.** Keep the packet's independent human Québec-language review open. This evidence review is not that sign-off.
- **Active checklist:** The Section F packet still requires independent bilingual review of `sorgho à graine` ([packet acceptance checks](../batches/plant-grains-cereals.md#L524), [unresolved review list](../batches/plant-grains-cereals.md#L532)). This is a separate product-naming question from R165 blue corn, R166 sushi rice, R167 teff, and R168 amaranth.

## Decision

Keep `ingredient-ref-grain-sorghum` as `grain sorghum / sorgho à graine`, with French aliases `sorgho en grains` and `sorgho en grain`. The exact Québec OQLF bilingual entry already supports the display; the Codex human-food standard and FAO AGROVOC support the two French search aliases already on the row. Current Québec retail wording `Sorgho` corroborates the shorter species/product term, but does not establish that it is a better grain-specific display. No evidence warrants replacing a direct Québec terminology source with a broader retail label.

This recommendation does not claim the independent human Québec review is complete. The OQLF exact-entry URL is already registered as `WP03-S22`; the live browser fetch returned a cache-miss error on this review date. The currently retrievable OQLF `sorgho` entry supports the species term and its English equivalent, but is scoped as a botanical entry. The direct registered bilingual pair, current French food-standard label, and local retail evidence are consistent with retaining the display while the human sign-off remains pending.

## Québec French and identity boundary

OQLF's existing GDT record pairs `grain sorghum` with `sorgho à graine` [existing `WP03-S22`]. Its separately retrieved `sorgho` record lists French `sorgho`, English `sorghum`, and Latin *Sorghum bicolor*; the entry is categorized as botany and describes the plant, so it establishes the base name and species, not by itself a grain-product display. FAO/WHO Codex names the human-food product `sorgho en grains`, defines it as whole or decorticated *Sorghum bicolor*, and gives that label as the product name [existing `WP03-SORGHUM-GRAINS-20261012-S01`]. FAO AGROVOC prefers the singular `sorgho en grain` for the same whole-or-decorticated grain concept [existing `WP03-SORGHUM-GRAINS-20261012-S02`]. Those authorities support the two existing aliases; neither calls for changing the OQLF-backed Québec display.

The current Mako Foods Exotik product page, from a Longueuil retailer, titles its cereal product `Sorgho (400 g)` and suggests it for salads, breads, stews, and “couscous revisité.” It does not specify species, whole versus decorticated kernels, or processing. Its title supports local use of `sorgho`, but not a replacement grain display or a grain-state alias. The 400 g figure is package quantity, not a measure or density [existing source ID `WP03-SORGHUM-COUSCOUS-R9-20261013-S06`; its ownership boundary is documented below].

Keep the whole/decorticated human-food grain identity separate from the active sorghum flour, grits, semolina, starch, and puffed-grain references. Keep sorghum couscous, flakes, meal, mabele/mabela products, and feed-scoped names outside this row unless their separate product boundaries are resolved. Do not add `grain de sorgho` or `grains de sorgho` as aliases: the current Québec-facing Kabeya listing uses `Grain de Sorgho` for dry grains that are slightly ground for porridge, a product-qualified state rather than an unmodified whole/decorticated grain label [existing `WP03-SORGHUM-GRAINS-20261012-S05`]. Keep `jowar whole`, `guinea corn`, and `red sorghum` as the existing English aliases; this review does not reopen the regional-name or color decisions [R5, R10, R162].

## Exact live row and proposed delta

The live reference row is:

```json
{
  "id": "ingredient-ref-grain-sorghum",
  "nameFr": "sorgho à graine",
  "nameEn": "grain sorghum",
  "aliasesFr": ["sorgho en grains", "sorgho en grain"],
  "aliasesEn": ["jowar whole", "guinea corn", "red sorghum"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-16T00:00:00Z",
  "category": "GRAIN_AND_CEREAL"
}
```

**Exact proposed database delta: none.** Retain the ID, bilingual display, five existing aliases, category, timestamp, null density, and empty unit mappings. Add no alias, reference, form, observation, conversion, yield, recipe link, or substitution. Do not add a new source record: the evidence relevant to this decision is already registered in the ledger.

## Exact ownership and picker projection

The live audit covered **1,544 references**, **119 forms**, **61 legacy-import candidates**, and **1,888 ledger records**. Normalized exact-key ownership was checked across reference IDs/displays/aliases, form IDs/labels/match terms, legacy candidate IDs/names/aliases, and ledger record IDs.

| Normalized key | Exact owner or disposition |
|---|---|
| `grain sorghum`, `sorgho à graine`, `sorgho en grains`, `sorgho en grain`, `jowar whole`, `guinea corn`, `red sorghum` | `ingredient-ref-grain-sorghum` only. |
| `sorghum`, `sorgho` | No exact key owner. Broad picker queries still return distinct sorghum products through substring matching. |
| `grain de sorgho`, `grains de sorgho` | No exact owner in references, forms, legacy candidates, or ledger IDs. Keep unassigned; the Kabeya wording is product-qualified as described above. |
| `ingredient-ref-grain-sorghum` | Existing active reference ID; no form or legacy ID collision. |

The static picker projection follows normalization and phrase-first matching with partial-match fallback in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It includes active aliases and form search terms. Current live results:

| Query | Current picker result | R169 effect |
|---|---|---|
| `sorgho à graine`, `sorgho en grains`, `sorgho en grain`, `grain sorghum` | Grain sorghum only | No change. |
| `sorgho`, `sorghum` | Six choices: grain, puffed grain, flour, grits, semolina, and starch | No change; keep the broad family query visibly multi-choice. |
| `jowar` | Grain sorghum, sorghum flour, sorghum semolina | No change; preserve the existing qualified three-choice menu. |
| `jowar whole` | Grain sorghum only | No change. |
| `guinea corn` | Grain sorghum and sorghum flour | No change. |
| `red sorghum` | Grain sorghum and sorghum flour | No change. |
| `grain de sorgho`, `grains de sorgho` | No results | No alias is proposed. |

The `sorgho` retail label does not need to become a new alias for this effect: the current fallback already finds the grain, and adding it would not disambiguate the grain from five sibling sorghum products. Retaining the exact grain qualifier leaves the current picker projection unchanged.

## Recipe demand

The bundle manifest lists **114 recipe files and 1,123 ingredient rows**. A scan of every manifest-listed JSON file, all structured ingredient rows, and full serialized recipe text searched `sorgho`, `sorghum`, `grain sorghum`, `sorgho à graine`, `sorgho en grains`, `sorgho en grain`, `jowar whole`, `guinea corn`, `red sorghum`, `grain de sorgho`, `grains de sorgho`, and the target ID. It found **0 matching recipe files and 0 matching ingredient rows**. No recipe link or recipe-derived display change is supported.

## Forms, numeric behavior, and substitutions

The grain-sorghum reference has **no attached forms**, `defaultDensity: null`, and `unitMappings: []`. Its ledger remains `identityState: verified`, `measurementState: researched_supported`, and `substitutionResearchState: not_yet_researched`, with no substitution findings.

The existing Health Canada CNF 2015 record for food code 4432 has source-scoped portions of 100 mL = 81.2 g, 250 mL = 202.9 g, and 1 serving = 20.0 g [existing `WP03-SORGHUM-GRAINS-20261012-S03`]. CNF does not identify whole versus decorticated grain, raw versus cooked state, or a filling method. Keep these as historical source-specific observations; do not activate density, household mappings, a serving default, or a conversion. Mako's 400 g package label and Kabeya's 500 g package label are package quantities only. Add no dry/cooked forms or cooking-yield values. No substitution relationship was researched or established for this display review; preserve the existing `not_yet_researched` state and do not add an active substitution rule.

## Source ID and URL ownership audit

The live ledger contains **8,078 source entries, 6,910 distinct source IDs, and 5,706 distinct URLs**. No new ID or URL is proposed. The following source registrations were checked against the exact URLs and live ledger owners:

| Existing source ID | Exact URL and live owner(s) | Use and limit in this decision |
|---|---|---|
| `WP03-S22` | [OQLF, GDT `sorgho à graine`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/19001698/sorgho-a-graine); `ingredient-ref-grain-sorghum` | Direct bilingual `grain sorghum / sorgho à graine` pair. Already registered on the target row. The exact URL returned a browser cache miss on 2026-10-16; the entry is not represented here as newly fetched. |
| `WP03-MILO-GRAIN-20261012-S01` | [OQLF, GDT `sorgho`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho); grain sorghum plus six related sorghum references/candidates | Retrieved in this review; gives French `sorgho`, English `sorghum`, and *Sorghum bicolor* in a botanical entry last updated 2010. The same authority URL is intentionally reused across related records; no duplicate registration is proposed. |
| `WP03-SORGHUM-GRAINS-20261012-S01` | [Codex, Sorghum Grains CXS 172-1989](https://www.fao.org/input/download/standards/57/CXS_172f.pdf); `ingredient-ref-grain-sorghum` | Human-food scope, whole/decorticated *Sorghum bicolor*, and required French product label `sorgho en grains`. Existing source ID and target owner. |
| `WP03-SORGHUM-GRAINS-20261012-S02` | [FAO AGROVOC, `sorgho en grain`](https://agrovoc.fao.org/browse/agrovoc/fr/page/c_7249); `ingredient-ref-grain-sorghum` | Preferred singular French term and matching whole/decorticated grain definition; current page records an update on 2024-04-12. Existing source ID and target owner. |
| `WP03-SORGHUM-GRAINS-20261012-S03` | [Health Canada CNF, code 4432](https://food-nutrition.canada.ca/cnf-fce/serving-portion?id=4432); `ingredient-ref-grain-sorghum` | Source-scoped observations only; no active numeric behavior. |
| `WP03-SORGHUM-GRAINS-20261012-S05` | [Les Aliments Kabeya, Nos produits – Québec](https://www.lesalimentskabeya.com/nos-produits.php); grain sorghum and `candidate-sorghum-meal` | Current page labels `Grain de Sorgho` and describes dry sorghum grains, slightly ground for porridge. Its shared URL and separate product locators do not justify duplicating a source record or adding this phrase as an alias. |
| `WP03-SORGHUM-COUSCOUS-R9-20261013-S06` | [Mako Foods Exotik, Sorgho (400 g)](https://www.makofoods.ca/products/sorgho); `candidate-sorghum-couscous` only | Current Québec retailer page checked 2026-10-16. Reuse only as local wording/context evidence; its URL is already owned by the sorghum-couscous candidate and must not be duplicated or reassigned to the grain row. The target row separately has `WP03-MILO-GRAIN-20261012-S02` for the Mako homepage URL. |

No source-ID or exact-URL collision blocks this no-delta recommendation. In particular, do not allocate an R169 source ID or append the Mako product URL to another record. The exact OQLF grain entry, Codex, AGROVOC, CNF, and Kabeya evidence already have matching registrations; shared authority/product-page URLs remain scoped to their existing record owners.

## Disposition and review limits

Retain `grain sorghum / sorgho à graine`, the two existing French aliases, and all existing English aliases. Make no reference, form, ledger, recipe, or numeric change. Keep the independent human Québec-language review open, as the Section F packet requires.

Static review only: active plan and packet, prior sorghum alias/product-boundary proposals, live references/forms/legacy identities/ledger, all source ID and URL ownership, `IngredientSearch.kt`, and all manifest recipe files/ingredient rows were audited. No app, unit, instrumentation, emulator, build, or deployment tests were run; this is a proposal-only review and makes no software or database change.
