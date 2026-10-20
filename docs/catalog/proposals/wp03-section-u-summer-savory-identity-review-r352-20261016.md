# WP03 Section U — summer savory / sarriette d’été identity proposal (R352, 2026-10-16)

- **Status:** Integrated; see the [R352 integration README](../batches/wp03-section-u-summer-savory-identity-integration-r352-20261016/README.md).
- **Plan anchor:** Section U, “Fresh herbs botanical aromatics and regional flavorings,” line 7695 of `docs/RecipeBook-global-ingredient-catalog-plan.txt`. The open common-herb checklist names `savory`.
- **Candidate:** culinary summer savory, *Satureja hortensis* L., the annual garden/common savory.
- **Coordination:** epazote, hoja santa, and huacatay already have active references. Pápalo is covered by the open [WP06 Mexican herb identity-boundaries proposal](wp06-mexican-herb-identity-boundaries-20261009.md). This review selects the separate, still-open WP03 `savory` checklist item. No R352 summer-savory proposal or source allocation was present before drafting.
- **Disposition:** add one identity-only `HERB` reference with a subtype-specific bilingual display. Do not merge summer savory with winter savory or thyme.

## Recommendation

Recognize the culinary leafy herb *Satureja hortensis* L. as **summer savory / sarriette d’été**. Kew accepts *S. hortensis* as the current species name; OQLF’s GDT gives `sarriette` as its preferred French term and maps it to English `savory`, while noting the garden and mountain varieties. Montréal’s Espace pour la vie identifies *S. hortensis* as `sarriette commune / summer savory` and says its leaves and flowers are used in cooking. Québec horticultural use and Ontario’s official crop profile also attest `sarriette d’été`, making that subtype-clear label suitable for the French display. [S01–S06]

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-summer-savory` |
| Category | `HERB` |
| English display | `summer savory` |
| Québec French display | `sarriette d’été` |
| English aliases | `summer savory leaves` |
| French aliases | `sarriette des jardins`, `sarriette commune` |
| Scope | Culinary leaves of *Satureja hortensis* L.; flowers are also documented as a culinary part |
| Forms and recipe links | None |
| Density, unit mappings, measures, yields, conversions, active substitutions | None |

The English product phrase `summer savory leaves` is listed for a Canadian McCormick product. The French phrase `feuilles de sarriette` appears on Québec grocery packaging, but that listing does not specify the seasonal species, so I leave it out of the alias list. OQLF’s generic `sarriette` entry notes both garden and mountain varieties; its word remains searchable through the proposed `sarriette d’été` display. [S01, S03, S07–S08]

## Identity and product boundary

| Term or product | Disposition | Evidence boundary |
|---|---|---|
| Summer savory, *Satureja hortensis* L. | Proposed identity | Kew accepts the species. Montréal’s botanical garden names it `summer savory / sarriette commune`, identifies the leaves and flowers as culinary parts, and gives several uses. The Québec producer page lists *S. hortensis*, `sarriette d’été`, `sarriette commune`, and `Summer Savory`. [S03–S05, S07] |
| `sarriette des jardins` | French alias | Used for *S. hortensis* by OQLF’s definition and listed as a Canadian vernacular name by VASCAN. It is narrower than the generic `sarriette`. [S01, S05] |
| `sarriette commune` | French alias | Used for *S. hortensis* by Espace pour la vie and OMAFRA. [S03, S06] |
| Leaves; flowers also documented as culinary | Keep within the culinary herb identity; add no forms | Montréal’s botanical garden says the leaves and flowers are used in cooking. A Québec grower says leaves can be dried; Canadian and Québec retailers list dried savory leaves. These sources support the plant part and market presentations, but the bundled recipes provide no need for form records or a conversion. [S03, S07–S08] |
| Winter savory, *Satureja montana*; `sarriette vivace` / `sarriette des montagnes` | Keep separate; do not add as aliases | Montréal’s Espace pour la vie assigns `sarriette vivace / winter savory` to *S. montana* and contrasts it with *S. hortensis*. OQLF separately notes garden and mountain savory varieties. [S01, S09] |
| `summer thyme` | Do not add as an alias | VASCAN lists it as a common name for *S. hortensis*, but the active picker query `thyme` already returns three thyme references, including generic thyme and dried-thyme entries. Because the picker matches a one-word query inside longer name phrases, adding `summer thyme` would add summer savory to those results. [S05] |
| Generic English `savory` and French `sarriette` | Do not store duplicate aliases | Each word is already contained in the proposed display. The picker will match those one-word queries to this row; if a separate winter-savory identity is later added, the same generic queries can return both rows. OQLF recognizes `sarriette` but also notes the two aromatic varieties. [S01] |
| `savoury`, `winter savoury`, essential oil/extract, seeds, and compound products | Keep outside the proposed aliases and identity scope | The evidence reviewed supports the named herb and leaf products. It does not establish these spelling or product variants as aliases for this species-bounded ingredient. The Québec grower separately describes essential-oil production, which is not the culinary leafy product. [S06–S08] |

OQLF’s botany record uses the older Latin spelling *Satureia hortensis* and dates to 1994; it is cited for Québec French terminology and its variety note, not as the current taxonomy source. Kew and VASCAN use accepted *Satureja hortensis*. The OQLF-hosted culinary term record that pairs `sarriette` with *Satureja hortensis* is attributed to AFNOR (1975), not to OQLF authorship. [S01–S02, S04–S05]

## Pre-integration ownership, picker, and recipe audit

I checked the active plan, reference and form packages, legacy identities, research ledger, proposals, batches, picker search implementation, and all manifest-listed bundled recipes on 2026-10-16.

| Surface | Findings |
|---|---|
| Plan and proposal ownership | The common-herb line at plan line 7695 remains open and includes `savory`. No prior standalone summer-savory proposal or R352 file existed. Epazote, hoja santa, and huacatay are already active; the existing WP06 Mexican-herb proposal covers pápalo, so none is duplicated here. |
| Active references | At the review snapshot, the package had 1,690 references. No exact owner was found for `summer savory`, `summer savoury`, `savory`, `sarriette`, `sarriette d’été`, `sarriette des jardins`, `sarriette commune`, `summer thyme`, or either *Satureja* species name. R352 adds the bounded summer-savory owner described in the integration notes. |
| Forms | At the review snapshot, the package had 132 forms. No exact match term or label owned the candidate names. R352 adds no form. |
| Legacy identities and ledger | No matching legacy identity or species-specific summer-savory decision was found. Incidental prose uses of English `savory` were not treated as ingredient ownership. |
| Picker behavior | `IngredientReferenceSearchIndex` normalizes case, accents, and punctuation; it first matches a complete word phrase within names and aliases, then falls back to substring matching. Before R352, candidate queries had no active reference/form result. After integration, `savory` and `sarriette` match through the displays; `summer thyme` is excluded because it would add the new row to the three existing `thyme` query results. |
| Bundled recipes | The corpus has 114 recipe files and 1,123 ingredient rows. Whole-phrase scans of ingredient rows for the English/French names, product phrases, winter-savory boundary terms, and *Satureja* names found **zero hits**. Four general-adjective uses of `savory` occur in recipe prose outside ingredient rows; none is a summer-savory ingredient request. No recipe link or measure should be added. |

### Projected picker results

| Query | Projection after adding the proposed row |
|---|---|
| `summer savory`, `summer savory leaves` | Proposed summer-savory row only |
| `sarriette d’été`, `sarriette des jardins`, `sarriette commune` | Proposed summer-savory row only |
| `savory`, `sarriette` | Proposed row today via the display terms; these generic queries may return more than one row if winter savory is added later |
| `feuilles de sarriette` | No result from this row; the Québec product listing does not specify summer versus winter savory |
| `thyme` | Existing three thyme rows only; `summer thyme` is intentionally omitted so the proposal adds no savory result |
| `summer thyme` | No result from this row; alias is intentionally omitted |
| `winter savory`, `sarriette vivace`, `sarriette des montagnes` | No result from this row; retain for a separately evidenced *S. montana* identity |
| `savoury`, `Satureja hortensis` | No result from this row; neither is proposed as an alias |

## Measures and data behavior

The active recipe corpus has no summer-savory ingredient line. Horticultural harvest timing, retail package size, and dried-leaf product labels are not recipe quantities. Do not add a fresh/dried form, density, unit mapping, fresh-to-dried conversion, yield, substitution, or recipe link from this evidence set. The source material establishes culinary identity and presentation only.

## Source register

Sources were accessed on 2026-10-16. Claims are paraphrased. The proposed `WP03-SECTIONU-SUMMER-SAVORY-R352-20261016-S01–S09` IDs are local to this review; no shared ledger records were created.

| ID | Source | Support and limits |
|---|---|---|
| **WP03-SECTIONU-SUMMER-SAVORY-R352-20261016-S01** | Office québécois de la langue française, [GDT: sarriette (botany)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/2077733/sarriette). | OQLF-authored record (1994) gives preferred French `sarriette`, English `savory`, and the older Latin spelling *Satureia hortensis*. Its definition identifies the garden variety as grown for aromatic condiment leaves and its note distinguishes garden from mountain savory. It is not a current taxonomic authority. |
| **WP03-SECTIONU-SUMMER-SAVORY-R352-20261016-S02** | Office québécois de la langue française, [GDT: sarriette (spices and seasonings)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/3499862/sarriette). | The culinary record pairs `sarriette` with English `savory` and *Satureja hortensis* L.; the record attributes its terminology to AFNOR (1975), not to OQLF authorship. |
| **WP03-SECTIONU-SUMMER-SAVORY-R352-20261016-S03** | Espace pour la vie, Montréal Botanical Garden, [Sarriette commune](https://m.espacepourlavie.ca/carnet-horticole/sarriette-commune) and [Summer savory](https://m.espacepourlavie.ca/en/green-pages/summer-savory). | Identifies *Satureja hortensis* as French `sarriette commune` and English `summer savory`; states that leaves and flowers season salads, soups, meats, and vinegar. Supports local bilingual identity and culinary parts, not retail stock or measures. |
| **WP03-SECTIONU-SUMMER-SAVORY-R352-20261016-S04** | Royal Botanic Gardens, Kew, [Plants of the World Online: *Satureja hortensis* L.](https://powo.science.kew.org/taxon/urn:lsid:ipni.org:names:457680-1). | Accepts *S. hortensis* as a species and classifies it as an annual. Supports current taxonomy, not Québec naming or a recipe form. |
| **WP03-SECTIONU-SUMMER-SAVORY-R352-20261016-S05** | Canadensys, [Database of Vascular Plants of Canada (VASCAN): *Satureja hortensis*](https://data.canadensys.net/vascan/taxon/6452). | Treats *S. hortensis* as accepted; lists `sarriette des jardins`, `summer savory`, and also `summer thyme`. The latter is recorded as a source-backed but picker-conflicting synonym, not a proposed alias. |
| **WP03-SECTIONU-SUMMER-SAVORY-R352-20261016-S06** | Ontario Ministry of Agriculture, Food and Rural Affairs, [Sarriette d’été](https://www.omafra.gov.on.ca/CropOp/fr/herbs/culinary/ssav.html). | Names *S. hortensis*, `sarriette d’été`, `sarriette des jardins`, and `sarriette commune`; describes its culinary use and warns against confusing summer and winter varieties. Crop details are not kitchen measurements. |
| **WP03-SECTIONU-SUMMER-SAVORY-R352-20261016-S07** | La Brouette Maraîchère, Québec producer, [Sarriette d’été](https://www.labrouettemaraichere.com/products/sarriette-dete). | Living-plant listing names *S. hortensis*, `sarriette d’été`, `sarriette commune`, and `Summer Savory`; describes culinary use and drying leaves. The page showed the plant as sold out when reviewed, so it supports local terminology and product scope, not current inventory of harvested leaves. |
| **WP03-SECTIONU-SUMMER-SAVORY-R352-20261016-S08** | Save-On-Foods, [McCormick Summer Savory Leaves, 14 g](https://www.saveonfoods.com/sm/pickup/rsid/5530/product/mccormick-summer-savory-leaves-id-00066200002046); and Super C, [Sarriette séchée Irrésistible, 23 g](https://www.superc.ca/allees/garde-manger/fines-herbes-epices-et-sauces/epices/sarriette-sechee/p/059749961356). | The Canadian retailer lists McCormick `Summer Savory Leaves`, identifies the item as made in Canada, and distinguishes summer from winter savory. The Québec retailer lists dried `sarriette` and `feuilles de sarriette` but does not specify the species; that wording supports Québec market usage, not a species claim for every SKU. Listings and package sizes are not guarantees of availability or recipe measurements. |
| **WP03-SECTIONU-SUMMER-SAVORY-R352-20261016-S09** | Espace pour la vie, Montréal Botanical Garden, [Sarriette vivace](https://m.espacepourlavie.ca/carnet-horticole/sarriette-vivace). | Identifies `sarriette vivace / winter savory` as *Satureja montana*, describes it as distinct from *S. hortensis*, and documents culinary leaves. Supports keeping winter savory separate; it does not establish aliases for the summer-savory row. |

## Limitations and checks

- Québec sources support both `sarriette d’été` and `sarriette commune`; this proposal prefers the former display because it clearly distinguishes the garden/annual culinary herb from winter savory. It does not claim that OQLF’s preferred generic `sarriette` is wrong.
- Retail pages were accessible on the review date, but an online listing does not guarantee stock. The local producer’s plant was marked sold out; Super C’s dried product and Save-On-Foods’ Canadian packaged product do not establish the botanical identity of every generic savory SKU.
- The proposal review used static ownership, picker-code, and corpus inspection. Integration checks are listed in the batch README; no software tests, builds, emulator checks, or deployment were run.

## Integration notes

- Added `ingredient-ref-summer-savory` as one identity-only `HERB` row for culinary *Satureja hortensis* L., displayed as `summer savory / sarriette d’été`, with `summer savory leaves`, `sarriette des jardins`, and `sarriette commune` as scoped aliases.
- Kept *Satureja montana* / winter savory separate. Omitted `summer thyme`, broad product wording `feuilles de sarriette`, botanical names, and spellings not established by the reviewed evidence.
- Added one verified ingredient-reference ledger record. Measurement and substitution research remain `not_yet_researched`. No form, measure, unit mapping, density, conversion, yield, recipe link, or active substitution was added.
- The current catalog contains 1,691 references and 133 forms; the 114-recipe / 1,123-row bundle still has no matching summer-savory ingredient line. Static package, ledger, generated-index, picker-projection, corpus, UTF-8, link, and whitespace checks are recorded in the integration README. No software tests were run because this change only adds database JSON data under `AGENTS.md`.
