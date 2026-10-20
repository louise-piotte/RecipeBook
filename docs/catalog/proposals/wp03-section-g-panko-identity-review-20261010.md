# WP03 Section G panko identity review — 2026-10-10

- **Packet type:** exact-demand identity review. Recommendation: split panko from generic breadcrumbs and link only the three exact panko recipe rows. Keep the wider breadcrumb and bread-component checklist open.
- **Scope:** Québec French and English naming, product boundary, current bundled recipe demand, and active aliases for panko. No form, measurement, conversion, yield, or substitution review is proposed.
- **Pre-integration snapshot:** 867 references / 48 forms; 1,113 research-ledger records. Reference JSON SHA-256 `6fb175c66019050aaef8e8f34a405200eda893bfb3fd67c5acaf77ad3a1cdf95`; ledger SHA-256 `92192fb3de6c0707ab7ea3ad0e6b0f66ecf40aa348e4a9b40eaf6b60c0b1b040`.

## Recipe demand and current collision

The active `ingredient-ref-breadcrumbs` reference currently owns `chapelure panko` and `panko` as French aliases, and `panko`, `panko breadcrumbs`, and `panko bread crumbs` as English aliases. This merges a named product into generic breadcrumbs.

The manifest-listed recipe scan found three exact panko ingredient rows:

| Recipe line | Original text | Current reference | Preserved structured detail |
| --- | --- | --- | --- |
| `019#9` — Crab Balls | `1 cup panko bread crumbs` | `ingredient-ref-breadcrumbs` | 1 cup; `panko` preparation; group `Crab balls` |
| `023#2` — Air Fried Calamari | `1/2 cup panko` | `ingredient-ref-breadcrumbs` | 1/2 cup; `panko` preparation |
| `087#4` — Chicken Parmesan | `1 cup panko bread crumbs` | `ingredient-ref-breadcrumbs` | 1 cup; `panko` note |

Other current breadcrumb lines name generic bread crumbs or dried bread crumbs; they are outside this focused relink. Graham cracker crumbs already have their own identity. Recipe instructions and descriptions mentioning panko do not create additional ingredient rows.

## Proposed identity and limits

Add one `BAKING_MIXIN_AND_PANTRY` identity:

- ID: `ingredient-ref-panko`
- English name: `panko bread crumbs`
- French name: `chapelure panko`
- French aliases: `panko`, `chapelure japonaise`
- English aliases: `panko`, `panko breadcrumbs`, `Japanese breadcrumbs`, `Japanese bread crumbs`
- Default density, unit mappings, and ingredient forms: none

Remove panko-specific aliases from `ingredient-ref-breadcrumbs`, leaving its generic breadcrumb aliases in place. Relink only recipe lines `019#9`, `023#2`, and `087#4` to `ingredient-ref-panko`; preserve original text, quantity, unit, preparation/note, and group. Update only the normalized ingredient name to `panko bread crumbs` where applicable.

OQLF describes panko as coarse bread crumbs resembling flakes and lists `chapelure panko`, `chapelure japonaise`, and the English panko/Japanese breadcrumb terms. Kikkoman describes panko as large crumbs made from Japanese white bread and distinguishes fresh and dry panko from fine, hard ordinary crumbs. A Québec product listing also calls it Japanese, crisp breadcrumb. These sources support a distinct identity. They do not establish a universal density, cup weight, freshness state for the three recipe rows, or recipe-general replacement behavior. Do not infer a `fresh` or `dry` form from the unqualified recipe text.

## Sources

All sources were accessed on **2026-10-10**. IDs are local to this proposal until coordinator integration.

| Source ID | Source and evidence limits |
| --- | --- |
| **S01** | OQLF, [panko (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26542670/panko), definition, note, preferred French terms, and English terms. Supports coarse/flaky Japanese bread crumbs and the bilingual term set; no quantity or substitution data. |
| **S02** | Kikkoman, [Panko / Japanese Breadcrumbs](https://www.kikkoman.com/en/cookbook/glossary/panko.html), “What is panko?” and fresh/dry discussion. Supports a product distinction from fine Western crumbs and the existence of fresh and dry panko; it does not identify the state used in the bundled recipes or provide a universal volume conversion. |
| **S03** | MITO Sushi, [Chapelure Panko](https://mito.ca/produit/chapelure-panko/), product description and Québec distribution context. Calls panko a crisp Japanese breadcrumb used for fried foods; product-specific evidence only. |
| **S04** | Loblaws Québec, [Chapelure et panure](https://www.loblaws.ca/fr/fr/alimentation/garde-manger/pices-et-assaisonnements/chapelure-et-panure/c/29905), product category and listings. Shows panko among breadcrumb products in the Québec retail category; catalog evidence only, not a terminology authority. |

## Coordinator disposition — 2026-10-10

Accepted the distinct identity and exact-row relinks. The broader Section G breadcrumb line remains open because fresh/dry generic breadcrumbs, cracker crumbs, matzo meal, bread cubes, and croutons were not reviewed here. Panko fresh/dry states remain outside active forms until an exact product-state request and source-specific treatment are needed. No numeric behavior or substitution rule was added.
