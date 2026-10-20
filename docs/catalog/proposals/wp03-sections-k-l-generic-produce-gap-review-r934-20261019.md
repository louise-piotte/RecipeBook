# WP03 Section K R934 generic plant-part gap review: carrot tops

- **Reviewed:** 2026-10-19
- **Packet type:** Proposal-only identity and boundary review. No active catalog, recipe, ledger, checklist, plan, roadmap, workflow, batch, code, or test file was edited.
- **Scope:** One generic edible leafy plant part, the tops of culinary carrots. No brands, commercial product lines, flavour variants, SKUs, or retailer rosters were researched.
- **Recommendation:** Accept one identity-only generic reference displayed as `carrot tops / fanes de carottes`, with only singular grammatical aliases. Add no forms, density, unit mappings, recipe links, measures, conversions, yields, or substitutions.

## Current-state and open-work audit

Section K remains open for additional leafy-green and brassica identities and for other regional greens and shoots ([global catalog plan, Section K](../../RecipeBook-global-ingredient-catalog-plan.txt#L6550)). The recent R928 review addressed dandelion flowers, and the plan separately records R908's generic `radish leaves / fanes de radis` plant-part identity. Those reviews establish relevant boundaries but do not cover carrot foliage. The generic carrot root remains a separate active reference. This is one further edible plant-part candidate within the open generic coverage sweep.

The current live seed contains 1,951 ingredient references and 204 forms; `legacy-import-identities.v1.json` contains 55 candidates; the research ledger has 2,355 records. Searches for `carrot top(s)`, `carrot green(s)`, `carrot leaf/leaves`, `fane(s) de carotte(s)`, `feuille(s) de carotte(s)`, and `Daucus carota` found no active/form/legacy/ledger owner for a carrot-tops identity. The botanical name appears in existing carrot-root evidence, which does not identify a leafy-part row. Existing active identities include `ingredient-ref-carrot` (`carrot / carotte`), `ingredient-ref-radish-leaves` (`radish leaves / fanes de radis`), and `ingredient-ref-turnip-greens` (`turnip greens / feuilles de navet`). No row was changed or treated as transferable.

The same term audit across prior WP03 proposals and batches found no prior carrot-tops identity review or proposal. The manifest lists 114 recipe files and 1,123 ingredient rows. Ordinary carrot-root lines occur, but a scan of every manifest-listed recipe and ingredient row found no carrot-tops wording or French equivalent. No recipe link or recipe-driven measure is proposed.

The open Section K wording is generic leafy and regional-plant diversity, not a request for commercial-product enumeration. No assigned K/L item whose only deliverable is a brand or retailer roster was identified in this review. Any such roster-only work is out of scope because commercial-product counts do not add ingredient diversity; it should be marked out of scope and stopped. Preserve all existing branded rows and their scoped evidence. No branded or product-specific source was used here, so there is no product claim or measurement to transfer.

## Identity and boundaries

University extension sources explicitly describe carrot tops as edible and usable in soup, salad, and pesto. Colorado State University Extension gives carrot-top pesto as a culinary example; UConn Extension says carrot tops are edible and can be added to soups and salads. This supports a generic culinary identity for the leafy tops of culinary carrots, distinct from the active carrot-root identity. [S01–S02]

Recommend `carrot tops` as the English display and `fanes de carottes` as the provisional fr-CA display. The French compound is directly attested in Québec culinary writing. Do not use bare `greens`, `tops`, `fanes`, `carrot`, or `carotte` as aliases: they are broad search terms and do not identify this plant part by themselves. Avoid `carrot greens` and `carrot leaves` as stored aliases in this proposal because the reviewed English sources attest `carrot tops`; additional synonym coverage is not needed to establish the identity.

Keep the proposed row distinct from:

- **Carrot root (`ingredient-ref-carrot`):** the ordinary root reference and its root measurements stay unchanged. The edible foliage is a distinct part, not a form or alias of the root.
- **Radish leaves (`ingredient-ref-radish-leaves`):** an analogous plant-part row, but a separate ingredient. The Québec pesto recipe's `et/ou` wording describes an optional combination in that one dish; it does not make carrot tops and radish leaves universal substitutes.
- **Celery leaves and other greens:** distinct plant parts. The same mixed-greens recipe includes celery leaves as another optional choice, not as evidence to merge these identities.
- **Arracacha:** the active arracacha reference carries the English alias `Peruvian carrot`; this name is unrelated to carrot foliage. Do not attach it, or a broad `carrot` alias, to the proposed row.
- **Carrot seeds and derived preparations:** not covered. The proposed identity names leafy tops only and does not create forms for dried, powdered, or otherwise processed foliage.

No botanical rank is proposed. The evidence establishes culinary carrot tops in common food usage but does not require a narrower taxonomic identity for catalog display.

## Québec French and picker boundary

`Fanes de carottes` is used directly by Québec's Télé-Québec Cuisinez recipe and by a Recettes du Québec culinary article. The OQLF GDT entry `légumes feuilles` defines leafy vegetables generally but does not name carrot tops. A targeted OQLF search surfaced no dedicated entry for `fane(s) de carotte(s)`. Use `fanes de carottes` as locally attested descriptive fr-CA wording, not as an OQLF-standardized term. [S03–S05]

Proposed names and singular aliases:

| Language | Display | Alias | Boundary |
|---|---|---|---|
| English | `carrot tops` | `carrot top` | Plural display and singular grammatical variant; both remain part-qualified. |
| fr-CA | `fanes de carottes` | `fane de carotte` | Local culinary wording and its singular grammatical variant; not a standardized-term claim. |

The current picker normalizer folds accents and punctuation and considers complete word phrases before partial matching ([`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt)). Exact proposed phrases are unowned. A full query such as `carrot tops` or `fanes de carottes` would identify the proposed row. Broad `carrot` and `carotte` searches may also return the root, and `carrot` already overlaps the arracacha row's `Peruvian carrot` alias; adding this part-qualified identity would make those broad searches less specific but would not create an exact-key collision. Do not add broad aliases to force such queries to select one plant part. This is a static ownership review, not runtime picker QA.

## Measurement and substitution limits

Télé-Québec Cuisinez lists `2 tasses de fanes de carottes et/ou radis et/ou feuilles de céleri` in one pesto. This is a combined/optional greens line, not a carrot-tops-only amount. Keep the 2-cup quantity attached only to that recipe; it does not support a carrot-tops density, mass-per-volume conversion, serving size, or transferable measure. The recipe's `et/ou` permits those greens in that pesto context only; it does not establish a global substitution rule. [S03]

The extension sources establish culinary use but supply no transferable density, count weight, volume conversion, edible yield, or preparation-state conversion for carrot tops. Add no numeric catalog behavior, form, or substitution rule. No product-specific measurement was encountered or generalized.

## Proposed identity-only row

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-carrot-tops` |
| `nameEn` | `carrot tops` |
| `nameFr` | `fanes de carottes` (provisional local fr-CA wording) |
| Category | `VEGETABLE_AND_AROMATIC` |
| English aliases | `carrot top` |
| French aliases | `fane de carotte` |
| Density / unit mappings / forms | None |
| Recipe links / measures / conversions / yields / substitutions | None |

## Sources

Sources were directly reviewed online on 2026-10-19. Claims are paraphrased. Recipe measures remain scoped to their named recipe.

| ID | Source | Supports and limits |
|---|---|---|
| `WP03-K-CARROT-TOPS-R934-20261019-S01` | Colorado State University Extension, [How to Use Carrots](https://extension.colostate.edu/resource/how-to-use-carrots/). | Reviewed October 2025. Says carrot tops can be used in dishes such as carrot-top pesto. Supports generic culinary use; its separate storage advice is not proposed as catalog behavior or a preparation rule. |
| `WP03-K-CARROT-TOPS-R934-20261019-S02` | University of Connecticut Extension, [Carrots](https://farmtoschool.extension.uconn.edu/local-products/carrots/). | States carrot tops are edible and can be added to soups and salads. Supports the edible part and culinary role; it does not supply a Québec French term, amount, density, or conversion. |
| `WP03-K-CARROT-TOPS-R934-20261019-S03` | Télé-Québec Cuisinez, [Pesto de fanes](https://cuisinez.telequebec.tv/recettes/5950/pesto-de-fanes). | Attests the Québec wording `fanes de carottes` and a mixed optional line of 2 cups of carrot tops and/or radish tops and/or celery leaves. The amount and ingredient alternatives belong to that pesto only; they do not support an individual carrot-top measure or a global substitution. |
| `WP03-K-CARROT-TOPS-R934-20261019-S04` | Recettes du Québec, [Manger les fanes des légumes](https://www.recettes.qc.ca/chroniques/quoi-manger/article/manger-les-fanes-des-legumes). | Uses `fanes de carottes` and describes adding the leaves to salad, sauté, soup, broth, and pesto. This is Québec culinary writing, not a terminology authority or measurement source. Its broader food-use discussion is not converted into safety guidance. |
| `WP03-K-CARROT-TOPS-R934-20261019-S05` | Office québécois de la langue française, [légumes feuilles (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26544178/legumes-feuilles). | Defines the general leafy-vegetable category and lists spinach and Swiss chard as examples; it does not name carrot tops. Targeted searches for `fane(s) de carotte(s)` did not surface a dedicated OQLF entry. This supports treating the proposed French display as locally attested descriptive wording, not as standardized terminology. |

**Disposition:** Accept one generic identity-only carrot-tops reference with part-qualified bilingual terms. Preserve the carrot-root identity and other leafy-plant identities. Keep the mixed-pesto amount within that recipe and infer no reusable measure, density, form, conversion, or substitution. The broader Section K sweep remains open.
