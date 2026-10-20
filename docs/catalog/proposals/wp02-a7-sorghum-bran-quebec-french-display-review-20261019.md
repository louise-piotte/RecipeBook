# WP02 Section A7 — sorghum-bran Québec French display review

## Review record

- **Status:** Proposal only. No catalog, ledger, plan, or checklist file is changed by this review.
- **Open item:** Independently review the Québec French display `son de sorgho`; the A7 checklist says current evidence supports the source-product term and the French base noun, but not an OQLF-preferred or local retail compound ([plan, line 2310](../../RecipeBook-global-ingredient-catalog-plan.txt#L2310)).
- **Recommendation:** Keep the existing generic identity `ingredient-ref-sorghum-bran` and keep `son de sorgho` as its provisional, transparent French display. Do not mark the compound as OQLF-preferred or as an established Québec consumer label. The reviewed sources do not support a better replacement.
- **No data change:** Leave names, aliases, category, density, mappings, forms, recipe links, conversions, yields, substitutions, and evidence records unchanged. Do not add a `son` alias: it is broad and OQLF's entry also covers milling by-products directed to animal feed.
- **Preservation:** Keep sorghum grain, flour, grits, semolina, starch, puffed sorghum, and the other bran identities separate. Preserve existing branded cereal rows and their product-scoped evidence. This review makes no deletion, merge, rename, or evidence transfer.

## Queue and scope review

The open Section A7 milling parent and this exact French-display child are generic ingredient work. The cross-category queue review found no open item whose sole deliverable is another brand, product-line, flavour-family, SKU, or retailer-variant roster. The previously reviewed Anson Mills wheat-meal lead remains out of scope because another commercial-product count does not add ingredient diversity; its historical record remains intact ([R875 proposal](wp02-a7-generic-wheat-meal-milling-gap-review-r875-20261019.md), [scope review](../batches/generic-ingredient-scope-review-20261019/README.md)). No brand or product roster research was undertaken here.

## Québec French evidence

The wording is linguistically transparent: OQLF recognizes `sorgho` as the Québec French term for the cereal, and `son` as the cereal fraction separated from flour during milling. However, the OQLF `son` entry's note says its generic sense also groups milling by-products intended for animal feed. A separate OQLF record approves `son de blé` specifically, and its oat-bran entry documents human-food use for that named cereal; none of those records approves `son de sorgho` as the consumer name for human-food sorghum bran.

FAO's French AGROVOC entry for sorghum grain lists `son de sorgho` as a source product. FAO's processing account describes removing outer grain coverings called `son` in sorghum/millet flour production. These sources support the source-product relationship and bran identity, but they are international technical references rather than Québec terminology rulings or local labels. The Canadian Food Inspection Agency's ingredient table also contains sorghum bran wording in its **animal-feed** classification; that does not establish a human-food display. A Québec MSSS/ITHQ guide mentions sorghum in food use and separately mentions oat bran, but does not name sorghum bran.

The evidence therefore supports retaining `son de sorgho` as a useful working description, while leaving Québec preference and consumer-food usage unresolved. This is a bounded finding from the sources reviewed, not a claim that no Québec label exists.

## Sources and limits

The following source IDs are local to this proposal and are not added to the shared research ledger.

| ID | Source and finding | Evidence limit |
| --- | --- | --- |
| S01 | Office québécois de la langue française, [GDT: `sorgho`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26506486/sorgho). Lists `sorgho` as the preferred Québec term and `sorgo`, `gros mil`, and `grand mil` as other preferred terms for the plant. | Names the cereal, not its bran fraction. The alternatives do not establish bran aliases. |
| S02 | Office québécois de la langue française, [GDT: `son`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8432756/son). Defines the term as the peripheral cereal part separated from flour during milling. | Its note says the generic `son` sense groups diverse milling by-products intended for animal feed. It does not qualify sorghum bran for human food or approve the compound. Reuses source already recorded as `WP03-BARLEY-BRAN-QC-R89-20261013-S01`; do not change that ledger entry. |
| S03 | Office québécois de la langue française, [GDT: `son de blé`](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2497467/son-de-ble). Lists `son de blé` as a preferred term in treated cereals. | Specific to wheat; it cannot be silently generalized to sorghum. |
| S04 | FAO AGROVOC, [sorghum grain](https://agrovoc.fao.org/browse/agrovoc/fr/page/c_7249). Lists `son de sorgho` as a source product of sorghum grain. | International agricultural vocabulary; not a Québec food label or a ruling on preferred local usage. The source URL is already present on the sorghum-grain ledger record; this proposal does not edit that record. |
| S05 | FAO, [*Le sorgho et les mils dans la nutrition humaine*, processing chapter](https://www.fao.org/4/t0818f/T0818F07.htm). Describes sorghum/millet processing and bran fractions. | Technical processing account; fractions depend on process, and the source does not settle Québec naming or a universal consumer grade. Reuses source registered on the existing R867 bran record. |
| S06 | Canadian Food Inspection Agency, [grain and bakery product labelling guidance, “Son”](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/cereales-produits-boulangerie). For covered grain/bakery products, it says unqualified `son` refers to wheat bran and the cereal source must be named for bran from another grain (for example, `son d'avoine`). | Canadian common-name guidance supports the source qualifier within its stated scope but does not specifically approve `son de sorgho` or establish Québec consumer use. |
| S07 | Québec MSSS/ITHQ, [*Guide d'accompagnement pour restaurants familiaux*](https://m3.ithq.qc.ca/collection/00000053.pdf), whole-grain guide. Lists sorghum in food examples and separately refers to oat bran in hot cereal. | Local food context only; it does not use `son de sorgho` or document sorghum bran as a Québec consumer ingredient. |

The earlier R867 sources for the human-food study and generic processing identity remain scoped as recorded there. The study's sample, formula, inclusion range, and findings are not naming evidence and are not generalized in this review. No manufacturer page or commercial product was used.

## Read-only ownership and demand audit

Snapshot from the current bundled package and ledger:

| Store | Snapshot | Result |
| --- | ---: | --- |
| Ingredient references | 1,907 rows | Exactly one owner for `sorghum bran / son de sorgho`: `ingredient-ref-sorghum-bran`. Its aliases are empty, density is null, mappings are empty, and category remains `GRAIN_AND_CEREAL`. |
| Ingredient forms | 201 rows | No form owns the proposed name or reference. |
| Research ledger | 2,313 records | One existing record for this reference; its identity is verified and measurement/substitution research remains `not_yet_researched`. No ledger update is proposed. |
| Legacy import identities | 56 candidates | No exact sorghum-bran candidate. |
| Recipe bundle | 114 files / 1,123 ingredient rows | No full-text or ingredient-row occurrence of `sorghum bran`, `son de sorgho`, or the reference ID. No recipe link is proposed. |

Nearby sorghum identities remain separate: grain sorghum, puffed sorghum, sorghum flour, sorghum grits, sorghum semolina, and sorghum starch. The existing wheat-, barley-, corn-, oat-, rice-, rye-, and triticale-bran rows remain untouched. Existing branded cereal identities and all product-scoped quantities remain untouched as well.

## Decision for integration

1. Keep the current English identity and current French display; label `son de sorgho` as provisional in project documentation until independent Québec food-terminology or local-label evidence supports stronger wording.
2. Do not add `son`, `sorgo`, `gros mil`, `grand mil`, `sorghum mill-feed`, or other broad terms as aliases on this row.
3. Do not infer a human-food classification from the CFIA feed table or transfer study-specific composition, amount, formula, or performance claims.
4. Keep the existing reference, ledger sources, branded rows, and neighboring sorghum identities unchanged. No forms, measures, recipe links, conversions, yields, or substitutions follow from this terminology review.
5. Revisit only if an OQLF/Québec food-terminology source or a suitable Québec bilingual human-food label resolves the compound's local display.

No software tests, build, emulator run, deployment, or shared-data validation was performed: this is a documentation-only proposal and makes no application or shared-catalog change.
