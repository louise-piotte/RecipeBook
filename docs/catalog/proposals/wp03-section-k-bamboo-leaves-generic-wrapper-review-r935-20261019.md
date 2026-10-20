# WP03 Section K R935: bamboo leaves for culinary wrapping

## Review and decision

- **Reviewed:** 2026-10-19.
- **Scope:** Generic bamboo leaves used as food-contact wrappers. This is a plant-part identity review, not a brand or retail-product roster.
- **Decision:** Add identity-only `bamboo leaves / feuilles de bambou` in `VEGETABLE_AND_AROMATIC`, with singular aliases `bamboo leaf` and `feuille de bambou`.
- **Limits:** Keep the French display as descriptive local wording, not an OQLF-standardized compound. Do not claim the leaves are eaten, assign a bamboo species, or infer that bamboo, banana, lotus, grape, and corn-husk wrappers are interchangeable. Add no forms, measures, recipe links, conversions, yields, or substitutions.

## Identity boundary

The Singapore Food Agency identifies bamboo leaves as one of the traditional wrapper choices for rice dumplings, alongside banana and lotus leaves. The Hunan provincial government describes a “Bamboo Leaf Zong” wrapped in bamboo leaves and boiled. A Shanghai government page in French directly uses `feuilles de bambou` for zongzi wrapping. These sources establish a generic culinary wrapping role for bamboo leaves while keeping the distinct leaf materials separate. None says the wrapper itself is eaten. [S01–S03]

Use only the part-qualified names `bamboo leaves` and `feuilles de bambou`, with singular grammatical aliases. OQLF records the Québec term `bambou` and English `bamboo`, but its entry concerns the plant and young shoots; it does not standardize the compound leaf name. The French display is directly attested in French-language culinary writing and remains descriptive. [S03–S04]

Keep the leaf identity separate from `ingredient-ref-bamboo-shoots` and `ingredient-ref-fermented-bamboo-shoots`, as well as existing banana leaves, corn husks, lotus leaves, and grape leaves. Do not add `bamboo`, `bambou`, `zongzi leaf`, or generic `wrapper` aliases. The broad `bamboo` query may return both shoots and leaves; the exact part-qualified phrases resolve the intended plant part.

The current bundled recipe corpus has 114 manifest-listed files and 1,123 ingredient rows, with no ingredient-line match for bamboo leaves or `feuilles de bambou`. No recipe link or quantity is proposed. The reviewed wrapper instructions provide no transferable amount, preparation-state form, edible yield, conversion, or substitution.

## Proposed identity-only row

```json
{
  "id": "ingredient-ref-bamboo-leaves",
  "nameFr": "feuilles de bambou",
  "nameEn": "bamboo leaves",
  "aliasesFr": ["feuille de bambou"],
  "aliasesEn": ["bamboo leaf"],
  "defaultDensity": null,
  "unitMappings": [],
  "updatedAt": "2026-10-19T00:00:00Z",
  "category": "VEGETABLE_AND_AROMATIC"
}
```

If integrated, record identity as verified, measurement state as researched with no supported value, and substitution research as not yet researched. Preserve each existing leaf and shoot identity and its evidence.

## Sources

| ID | Source | Supports and limits |
|---|---|---|
| S01 | Singapore Food Agency, [Rice Dumplings](https://www.sfa.gov.sg/food-safety-tips/food-risk-concerns/risk-at-a-glance/rice-dumplings). | Lists banana, bamboo, or lotus leaves as wrappers for rice dumplings. This establishes wrapper use and keeps the three plant-part materials distinct; it does not say bamboo leaves are eaten or interchangeable. |
| S02 | Hunan Government Website, [Miluo Zongzi](https://www.enghunan.gov.cn/hneng/Tourism/TourHunan/Yueyang_1/Dining_6/201606/t20160628_3076994.html). | Describes a “Bamboo Leaf Zong” of glutinous rice wrapped in bamboo leaves and boiled. No amount, taxon, or transferable wrapper measure is given. |
| S03 | Shanghai Municipal Government, [L’art du zongzi fait main à Shanghai](https://french.shanghai.gov.cn/fr-Videos/20260611/c9fc9d10801c4749a56774a69ebd58b0.html). | Uses `feuilles de bambou` for zongzi wrappers. This is French-language culinary wording, not a Québec terminology ruling. |
| S04 | Office québécois de la langue française, [bambou (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8407157/bambou). | Supports the Québec base term `bambou`, English `bamboo`, and botanical context; it does not name culinary bamboo leaves. |

## Cross-category scope

No brand, product line, flavour family, SKU, or retailer variant was researched. Commercial-product counts do not add ingredient diversity. Existing branded entries and product-scoped evidence remain intact. Do not transfer product measurements or claims to the generic identity without a separate transferability review.
