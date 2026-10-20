# WP05 Section W R959 generic preserved-food gap review: inziangsang

- **Reviewed:** 2026-10-19.
- **Packet type:** Proposal-only identity and boundary review. No shared catalog JSON, ledger, plan, roadmap, checklist, recipe, code, or test file was changed.
- **Plan anchor:** Section W leaves “further documented regional preserves” open after the integrated sinki, gundruk, and khalpi identities in the [global ingredient catalog plan](../../RecipeBook-global-ingredient-catalog-plan.txt#L10351).
- **Recommendation:** Add one identity-only `inziangsang` reference in `SAUCE_AND_CONDIMENT`. Use `inziangsang` for both English and fr-CA, with the French borrowed display explicitly provisional. Keep the source-attested hyphenated spelling `inziang-sang` as a narrow English alias. Do not add aliases for generic fermented mustard leaves, gundruk, or the distinct liquid `inziang-dui`.
- **Scope:** One named, generic fermented mustard-leaf food associated with Naga communities in Nagaland and Manipur. Brand, product-line, flavour-family, SKU, and retailer-variant rosters do not add ingredient diversity and were not researched. No existing identity or evidence is deleted, merged, or transferred.

## Current ownership and queue audit

At the audit snapshot, the bundled seed contains **1,975 ingredient references and 205 forms**, the legacy-import file contains **55 candidates**, and the research ledger contains **2,380 records**. Exact and normalized searches for `inziangsang`, `inziang-sang`, `inziang sang`, `inziang-dui`, `ziangdui`, and `ingredient-ref-inziangsang` found no owner in active reference names or aliases, form labels or match terms, legacy candidate names or aliases, or ledger identity record IDs. The ledger also has no R959 source-ID prefix for this identity. Search results in the source literature are not catalog ownership.

Section W’s remaining checklist explicitly leaves further documented regional preserves open. The reviewed W queue contains generic identity and evidence work, not a task whose sole deliverable is a commercial-product roster. No such roster-only item was found to disposition. If a queued brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only item is encountered, mark it out of scope because commercial-product counts do not add ingredient diversity and stop that line. Preserve existing branded rows and their evidence; any future evidence reuse requires a separate transferability review.

Nearby active references establish boundaries rather than ownership:

| Nearby active identity | Current scope | Boundary retained for `inziangsang` |
|---|---|---|
| `ingredient-ref-gundruk` — `gundruk / gundruk` | Named Himalayan fermented leafy-vegetable food, with its own sources and regional variation. | The 2005 study calls inziangsang similar to gundruk but separately names and samples it; the 2012 table assigns the foods to different named regional communities. Similarity does not make the names aliases or establish interchangeability. Preserve both references and all gundruk evidence. |
| `ingredient-ref-pickled-mustard-greens` — `pickled mustard greens / feuilles de moutarde marinées` | Generic preserved mustard-greens identity. | Do not make this generic phrase an alias for a source-named fermented Naga food. The source-backed name identifies a regional food identity; it does not define all pickled or fermented mustard leaves. Preserve the existing reference and its evidence. |
| `ingredient-ref-kimchi` — `kimchi / kimchi` | Generic Korean fermented-vegetable preparation. | Keep the Korean preparation separate; do not add `inziangsang` or fermented mustard leaves as aliases. |
| `ingredient-ref-sinki` — `sinki / sinki`; `ingredient-ref-khalpi` — `khalpi / khalpi` | Named Himalayan fermented-radish and fermented-cucumber foods. | Different named products and substrates. No common-preserve alias, form, or substitution is proposed. |
| `ingredient-ref-fermented-bamboo-shoots` — `fermented bamboo shoots / pousses de bambou fermentées` | Generic fermented bamboo-shoot product class. | Different substrate and product identity; no alias or form relation. |
| `Inziang-dui` / `ziang-dui` | Named in the reviewed literature as a liquid fermented extract used as a condiment. No active catalog owner was found. | This is a separately named liquid product in the source, not a spelling variant or generic form of the proposed leafy food. Do not add it as an alias or form; leave it for separate review. |

R953’s comparative source and the R956 review provide nearby leads, not ownership. The R959 scan found no active inziangsang row or dedicated ledger identity. No current branded identity or product-specific evidence is needed to support this generic food; nothing is transferred from a branded entry.

## Recipe-demand check

All **114** manifest-listed bundled recipe JSON files and **1,123** ingredient rows were scanned, including serialized recipe text. The bounded case-insensitive query set (`inziangsang`, `inziang-sang`, `inziang sang`, `inziang-dui`, `ziangdui`, `fermented mustard leaves`, and `fermented mustard greens`) returned no recipe hits. This lexical check does not establish that no recipe could use the food; it supplies no direct bundled demand. No recipe link, recipe-derived measure, or substitution is proposed. A gundruk, kimchi, or pickled-mustard-greens mention would not be evidence of inziangsang demand.

## Identity and evidence limits

Tamang et al.’s primary comparative study identifies inziangsang as a traditional fermented leafy-vegetable product of Nagaland and Manipur, mostly consumed by Naga communities, prepared from mustard leaves, and similar to gundruk. It separately names gundruk, sinki, khalpi, and inziangsang and reports three inziangsang samples. This supports a named generic identity and a boundary from gundruk; the small study sample does not establish a universal recipe, geography, fermentation method, process duration, composition, or numeric catalog default. [S01]

A CSIR-hosted review by Tamang and Tamang lists inziangsang as one of the region’s ethnic fermented-vegetable foods, independently supporting it as a named food rather than a commercial brand. It is a regional overview, not a standard specification. [S02]

A later review table spells the item `Inziang-sang`, lists mustard leaves as its substrate, describes it as dried and sour and used in soup or curry, and separately lists `Inziang-dui` as a liquid sour condiment. The same table distinguishes named foods such as gundruk and antramthu. Use the hyphenated form only as an English spelling alias; do not turn the table’s particular product descriptions into required forms or a universal process. Keep `inziang-dui` out of this identity. [S03]

Targeted OQLF searches for `inziangsang`, `inziang-sang`, and a descriptive mustard-leaf phrase did not identify a Québec-specific French name for this regional food. Retain the borrowed display `inziangsang` provisionally rather than invent a French translation or imply that `feuilles de moutarde fermentées` uniquely names it. No French alias is proposed.

The sources do not establish a general density, household measure, drained or dry yield, unit mapping, or conversion. Their fermentation durations, storage descriptions, nutritional values, samples, and community-specific preparation details remain source-scoped and are not catalog defaults. No form, recipe link, conversion, yield, or substitution rule is proposed. In particular, similarity to gundruk and shared mustard-leaf substrate do not establish a replacement ratio or safe global substitution.

## Proposed minimal data and ledger states

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-inziangsang` |
| `nameEn` | `inziangsang` |
| `nameFr` | `inziangsang` (provisional borrowed fr-CA display) |
| Category | `SAUCE_AND_CONDIMENT` |
| English aliases | `inziang-sang` (source-attested hyphenated spelling only) |
| French aliases | None |
| `defaultDensity` / `unitMappings` | `null` / `[]` |
| Forms, recipe links, measures, conversions, yields, substitutions | None |

Proposed ledger state: `recordType: ingredient_reference`, `identityState: verified`, `measurementState: not_yet_researched`, and `substitutionResearchState: not_yet_researched`, keyed by `ingredient-ref-inziangsang`. Record the source-specific descriptions and their limits in evidence notes. Keep the distinct `inziang-dui` name outside this identity. No branded row or existing evidence is transferred, merged, or deleted.

## Source register

Sources were reviewed online on 2026-10-19. Claims are paraphrased; experimental and regional details are not proposed as universal catalog behavior.

| Source ID | Source | Supports and limits |
|---|---|---|
| `WP05-SECTIONW-INZIANGSANG-R959-20261019-S01` | Jyoti P. Tamang et al., [“Identification of predominant lactic acid bacteria isolated from traditionally fermented vegetable products of the Eastern Himalayas”](https://pubmed.ncbi.nlm.nih.gov/16055218/), *International Journal of Food Microbiology* 105(3), 2005, pp. 347–356, doi: [10.1016/j.ijfoodmicro.2005.04.024](https://doi.org/10.1016/j.ijfoodmicro.2005.04.024). | Primary comparative study identifies inziangsang as a named fermented leafy-vegetable food from Nagaland and Manipur, describes mustard leaves and its similarity to gundruk, and reports three samples. Sample size and experimental microbiology do not define a universal preparation, composition, quantity, or process. |
| `WP05-SECTIONW-INZIANGSANG-R959-20261019-S02` | Buddhiman Tamang and Jyoti Prakash Tamang, [“Traditional knowledge of biopreservation of perishable vegetable and bamboo shoots in Northeast India as food resources”](https://nopr.niscpr.res.in/handle/123456789/2978), *Indian Journal of Traditional Knowledge* 8(1), 2009, pp. 89–95, CSIR/NIScPR repository. | Regional overview lists inziangsang among ethnic fermented vegetables. It supports the named-food classification, not a universal method or product specification. |
| `WP05-SECTIONW-INZIANGSANG-R959-20261019-S03` | Jyoti Prakash Tamang et al., [“Microorganisms and Nutritional value of Ethnic fermented foods and alcoholic beverages of North East India”](https://nopr.niscpr.res.in/bitstream/123456789/13415/1/IJTK%2011%281%29%207-25.pdf), *Indian Journal of Traditional Knowledge* 11(1), 2012, pp. 7–25, table 2, p. 9. | Review table distinguishes `Inziang-sang` (mustard leaves; dried, sour; soup/curry) from `Inziang-dui` (mustard leaves; liquid, sour; condiment), and lists gundruk and antramthu separately. These are the review’s regional classifications, not universal forms, formulas, or measures. |

**Disposition:** Propose one identity-only generic `inziangsang` reference with the narrow source-attested English spelling alias `inziang-sang` and a provisional borrowed fr-CA display. Keep the broader Section W regional-preserve checklist open, and leave `inziang-dui` outside this decision. No commercial-product roster was researched because product counts do not add ingredient diversity. No software tests were run for this proposal-only document.
