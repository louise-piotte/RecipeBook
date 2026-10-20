# WP03 Section H — Great Northern bean identity and Québec display review

- **Reviewed:** 2026-10-11
- **Packet type:** proposal-only pulse identity review
- **Scope:** Great Northern bean product identity, maturity boundary, Canadian/Québec French naming, aliases, exact-key ownership, current seed/legacy/ledger state, and all manifest-listed recipe ingredient rows.
- **Write scope when prepared:** proposal only; the reviewer changed no shared data, plan, roadmap, code, test, or recipe file. Root integration is recorded in the linked batch README.
- **Plan state:** root integrated the Great Northern identity-only subitem; broader Section H coverage remains open.
- **Proposal-local source IDs:** `WP03-H-GN-20261011-S01` through `S08`; they are not ledger records.

## Recommendation

**Accept an identity-only `LEGUME_AND_PULSE` row for Great Northern beans**, scoped to the mature dry edible seed market class of *Phaseolus vulgaris*. Use **`Great Northern beans`** as the English display and **`haricots Great Northern`** as the Québec French display. The Office québécois de la langue française (OQLF) gives the exact singular French term `haricot Great Northern`, its English equivalent `Great Northern bean`, and the species *Phaseolus vulgaris*. A current Québec Loblaws listing uses the plural product title `Haricots Great Northern`. [S01, S06]

Add only the corresponding singular aliases `Great Northern bean` and `haricot Great Northern`. Do not map generic `white beans` / `haricots blancs`, navy beans / `petits haricots blancs`, cannellini / white kidney beans, or the descriptor `gros haricots blancs` to this row. OQLF and USDA sources distinguish several white-seeded common-bean classes; an older Agriculture and Agri-Food Canada (AAFC) table uses `gros haricots blancs` parenthetically for Great Northern, but that does not make the broader white-bean wording a safe alias. [S02–S05]

This recommendation fills an explicit open Section H pulse-class item despite zero bundled-recipe demand. It does **not** propose recipe links, forms, densities, unit mappings, yields, conversions, or substitution rules. Source-specific observations are listed separately below and should not be promoted to app behavior without a later reviewed need.

## Proposed row

| Field | Recommendation | Evidence and limit |
|---|---|---|
| Proposed ID | `ingredient-ref-great-northern-beans` | New ID; not reserved in shared data. |
| English display | `Great Northern beans` | OQLF gives singular `Great Northern bean`; current Québec retailer uses plural product wording. [S01, S06] |
| Québec French display | `haricots Great Northern` | Direct current Québec retailer wording, consistent with OQLF's exact singular `haricot Great Northern`. Do not translate the variety name. [S01, S06] |
| Proposed English alias | `Great Northern bean` | OQLF's English term for its singular French preferred term. [S01] |
| Proposed French alias | `haricot Great Northern` | OQLF preferred singular French term. [S01] |
| Botanical identity | *Phaseolus vulgaris* | OQLF supplies the Latin name. The product is a named dry-bean market class within the species, not a different species. [S01, S03] |
| Category | `LEGUME_AND_PULSE` | USDA standards define the relevant product among dry-threshed edible beans; AAFC lists it under dry beans cultivated in Canada. [S03, S05] |
| Initial numeric/form data | None | Keep density null, unit mappings empty, forms and yields absent, and conversion/substitution rules absent. Source observations below are not app mappings. |

## Identity and product boundary

### Source facts

- OQLF classifies its `haricot Great Northern` entry under botanical anatomy and plant morphology, lists *Phaseolus vulgaris*, and notes that the bean is white and less kidney-shaped than white kidney bean. It says it is somewhat smaller and rounder. [S01]
- USDA Agricultural Marketing Service defines beans in its standards as dry-threshed field and garden beans commonly used for edible purposes. It lists Great Northern, pea/Navy, small white, flat small white, and white kidney as separate classes. [S03]
- USDA's Bean Inspection Handbook describes Great Northern seeds as intermediate to large, elongated and white, and similar to but smaller and flatter than white kidney beans. [S04]
- AAFC's 2002 Canadian dry-bean bulletin lists `HARICOTS GREAT NORTHERN (gros haricots blancs)` separately from small round white beans. It describes the seeds as flat and white and lists dry bagging, soups, stews, casseroles, and baked dishes as uses. [S05]

### Review interpretation and boundary

The sources support treating Great Northern as a market class of mature dry common-bean seed within *Phaseolus vulgaris*, not as its own botanical species. This row should represent the dry edible seed product. Fresh green pods or immature shell beans are outside the row's unqualified product scope; the dry-bean standards and AAFC dry-bean table do not establish a Great Northern fresh-pod form. Broken/split dry beans may still be classified within USDA's dry-bean standard, but there is no recipe or source basis here for a separate Great Northern split form.

## Québec naming and alias boundary

| Candidate wording | Decision | Reason |
|---|---|---|
| `Great Northern beans` / `haricots Great Northern` | Use as bilingual display | OQLF supports the exact French singular and English equivalent; current Québec retail supports the plural French product label. [S01, S06] |
| `Great Northern bean` / `haricot Great Northern` | Allow as narrow singular aliases | Direct singular terms from OQLF. [S01] |
| `white beans` / `haricots blancs` | Exclude | OQLF says the white-bean category includes multiple varieties, naming Great Northern and navy among them; current Loblaws listings also distinguish `Haricots Great Northern`, `Haricots blancs`, and `Petits haricots blancs`. The generic legacy candidate remains unresolved. [S02, S06] |
| `navy beans` / `petits haricots blancs` | Exclude | OQLF identifies `petit haricot blanc` as navy bean and separately names Great Northern among white-bean varieties; USDA also lists Navy and Great Northern as separate classes. [S02, S03] |
| `cannellini beans` / white kidney beans | Exclude | OQLF distinguishes Great Northern from white kidney morphologically; USDA keeps White Kidney a separate class. Illinois Extension describes cannellini as white kidney and Great Northern as smaller, with texture differences. [S01, S03, S08] |
| `gros haricots blancs` | Do not activate as alias | AAFC used this old parenthetical descriptor in a 2002 dry-bean table. It is not the OQLF preferred term, and `haricots blancs` is broader than Great Northern. Keep it as historical descriptor evidence only. [S05, S02] |
| `grands haricots blancs` | Do not use | No source reviewed here uses this exact phrase as a Québec product name. Do not create it by translating AAFC's `gros haricots blancs`. |
| `white pea bean` / `white pea beans` | Exclude | OQLF links this term to navy bean, not Great Northern. [S02] |

## Current catalog, legacy, ledger, and recipe preflight

Snapshot checked in the current working tree on 2026-10-11. Root and other reviewers are updating unrelated catalog rows concurrently, so counts and ownership must be rechecked at integration.

| Artifact | Current state relevant to this review |
|---|---|
| Active ingredient references | 935 references. No Great Northern ID, display, alias, or exact normalized key. Nearby distinct pulse identities include black, kidney, pinto, and Lima beans. |
| Active forms | 52 forms. No Great Northern form. The reviewed labels `Great Northern bean(s)` and `haricot(s) Great Northern` have no exact normalized form-label or match-term owner. |
| Units, mappings, yields, and substitutions | 30 unit definitions, 8 ledger unit-conversion records, and one package-yield row; none names Great Northern. Substitution and contextual-substitution files are empty. No Great Northern density or unit mapping exists. |
| Legacy import candidates | 75 candidates. No Great Northern candidate. The related unreviewed candidates are `ingredient-ref-cannellini-beans` (`cannellini beans` / `haricots cannellini`), `ingredient-ref-navy-beans` (`navy beans` / `haricots navy`), and `ingredient-ref-white-beans` (`white beans` / `haricots blancs`). |
| Research ledger | 1,200 records and 8 unit-conversion entries. No Great Northern ledger record or exact key. The three legacy candidates above remain `unreviewed`, have no supporting source records, and have measurement/substitution research marked `not_yet_researched`. |
| Recipe manifest | 114 listed recipe files; all exist and contain 1,123 ingredient rows. A full row scan found no Great Northern wording or Great Northern reference. The only nearby bean-class rows are a pinto-beans-with-liquid line in recipe 007 and a rinsed/drained kidney-beans line in recipe 034; neither indicates Great Northern demand. |
| Prior review context | `docs/catalog/batches/plant-legumes-pulses.md` left Great Northern for its own bilingual review and states that broad white-bean wording covers multiple classes. No earlier Great Northern-specific proposal was found. The live Section H checklist still lists Great Northern as open. |

Exact normalized-key checks covered proposed display terms, singular aliases, and the `gros` / `grands haricots blancs` variants across every active reference display/alias, form label/match term, legacy candidate, and ledger record. No exact owner was found. This does not make the proposed row an owner for a broad partial query such as `white beans`.

The zero-hit recipe scan means no recipe relink, new form, package yield, or contextual substitution is supported by current bundle demand. It does not negate the distinct identity established by terminology and dry-bean market-class sources.

## Measurements, forms, yields, and substitutions

- **Source-specific measures:** USDA National Nutrient Database Standard Reference Release 28 (2015) gives 183 g per 1 cup for raw mature Great Northern seeds (NDB 16024) and 177 g per 1 cup for cooked boiled unsalted Great Northern beans (NDB 16025). These are food-specific common measures using a U.S. cup, not densities or general ingredient mappings. [S07]
- **No dry-to-cooked yield:** the two USDA measures describe separate food records and do not establish a conversion ratio or a yield for a particular batch. Do not calculate a dry-to-cooked factor from them.
- **Other source quantity:** AAFC reports 280–330 seeds per 100 g, but this is an agricultural seed-size range, not a recipe count measure or count-to-mass mapping. [S05]
- **Forms:** the sources document a dry retail product and cooked/boiled records; Illinois Extension also gives a recipe using separate 15 oz cans of Great Northern and cannellini beans, both drained and rinsed. Those source contexts establish food-state examples, not a need for app form rows when the bundled recipe corpus has no Great Northern lines. [S05–S08]
- **Substitution:** Illinois Extension says Great Northern and cannellini beans are often substituted for one another and notes that Great Northern has more tender skins and slightly less creamy flesh. This supports a qualitative cooking-context observation, not a universal same-ingredient form conversion or a quantified substitution rule. No Great Northern substitution rule should be added now. [S08]
- **Unavailable app behavior:** no reviewed source establishes a Great Northern density, package yield, canned-drained yield, soak conversion, dry/cooked yield, or exact substitution ratio for this catalog. Keep these values unavailable.

## Source-to-claim register

All online sources below were accessed **2026-10-11**. Locators and limits separate source facts from review interpretation.

| Source ID | Direct source and locator | Claim used | Limit |
|---|---|---|---|
| `WP03-H-GN-20261011-S01` | OQLF, [*haricot Great Northern*, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2296953/haricot-great-northern), entry updated 1991; preferred term, English equivalent, Latin name, note. | Preferred French singular `haricot Great Northern`; English `Great Northern bean`; *Phaseolus vulgaris*; white seed, less kidney-shaped and somewhat smaller/rounder than white kidney. | Historical terminology entry in a botanical/morphology domain; it is not a current package specification or measure. |
| `WP03-H-GN-20261011-S02` | OQLF, [*petit haricot blanc*, GDT](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2083589/petit-haricot-blanc), entry updated 1991; preferred term and white-bean note. | Identifies navy / white pea bean as `petit haricot blanc`; explains that `haricot blanc` covers multiple varieties and names Great Northern separately. | Terminology and botanical entry; not a grocery-package or culinary-substitution standard. |
| `WP03-H-GN-20261011-S03` | USDA Agricultural Marketing Service, [Beans, Grades and Standards](https://www.ams.usda.gov/grades-standards/beans), sections 101–102. | Dry-threshed edible beans include separately named Great Northern, Navy/pea, small white, flat small white, and white kidney classes. | U.S. grading/market classes; separate classes do not imply separate botanical species. |
| `WP03-H-GN-20261011-S04` | USDA Agricultural Marketing Service, [Bean Inspection Handbook](https://www.ams.usda.gov/sites/default/files/media/BeanHB.pdf), class descriptions. | Describes Great Northern morphology and distinguishes it from white kidney beans. | U.S. inspection description; not Québec terminology or retail naming authority. |
| `WP03-H-GN-20261011-S05` | Agriculture and Agri-Food Canada, [*Les haricots de grande culture au Canada*](https://publications.gc.ca/collections/collection_2015/aac-aafc/A27-18-15-22-fra.pdf), 2002, PDF p. 4, “Types de haricots secs cultivés au Canada.” | Uses `HARICOTS GREAT NORTHERN (gros haricots blancs)`, describes flat white seeds, 280–330 seeds per 100 g, and dry-market/cooking uses. | Older Canadian crop bulletin; parenthetical wording is descriptive, not a current preferred term or safe broad alias. Seed count is not a recipe measure. |
| `WP03-H-GN-20261011-S06` | Loblaws Québec French, [haricots secs, légumes et grains category](https://www.loblaws.ca/fr/alimentation/garde-manger/haricots-secs-l-gumes-et-grains/c/28185), current listing `PC Menu Bleu Haricots Great Northern 900 g`; category also lists `Haricots blancs` separately. | Current market support for plural French product label `Haricots Great Northern`; supports distinction from generic white beans at retail. | Retail listing is dynamic and store-dependent; it supports market wording, not taxonomy or OQLF preference. The 900 g pack size is not a yield. |
| `WP03-H-GN-20261011-S07` | USDA Agricultural Research Service, [Standard Reference Release 28, Food Group 16](https://www.ars.usda.gov/ARSUserFiles/80400535/Data/SR/SR28/reports/sr28fg16.pdf), NDB 16024 (PDF p. 97) and NDB 16025 (PDF p. 94). | Source-specific measures: raw mature seed, 183 g per cup; cooked boiled without salt, 177 g per cup. | 2015 U.S. food-composition records and U.S. cup; not local-product measurements, densities, or a paired yield experiment. |
| `WP03-H-GN-20261011-S08` | University of Illinois Extension, [*Explore the richness and health benefits of white beans*](https://extension.illinois.edu/blogs/simply-nutritious-quick-and-delicious/2023-03-02-explore-richness-and-health-benefits-white), March 2, 2023, text and White Bean and Chicken Chili recipe. | Says Great Northern and cannellini are often substituted for each other, describes texture differences, and gives a chili example with both canned beans drained and rinsed. | Extension culinary guidance, not controlled testing or a universal rule; no ratio is provided. |

## Integration guardrails

1. Re-run exact-key and recipe preflight against the merge-time working tree.
2. If accepted, add one `LEGUME_AND_PULSE` identity row with the proposed English/French displays and only the two singular aliases.
3. Do not redirect generic white-bean, navy, cannellini, white-kidney, `gros haricots blancs`, or `grands haricots blancs` keys to this identity.
4. Keep forms, measures, yields, mappings, conversions, substitutions, and recipe links empty; retain source-specific numeric/context evidence only in a reviewed research record if desired.
