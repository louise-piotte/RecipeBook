# WP03 Section N proposal — black trumpet mushroom identity review

- **Reviewed:** 2026-10-19
- **Status:** proposal only. This review creates this file alone; no seed data, ledger, recipe, plan, roadmap, code, or other file was changed. No tests were run.
- **Scope:** one generic culinary mushroom identity, scoped in its evidence to Québec/eastern North American *Craterellus fallax*. This is not a commercial product, brand, product-line, flavour-family, SKU, or retailer-variant review.
- **Recommendation:** add one identity-only reference, **ingredient-ref-black-trumpet-mushroom**, with English display **black trumpet mushroom**, French display **fausse corne d’abondance**, English alias **black trumpets**, and French aliases **trompette de la mort** and **trompette des morts**. Keep those common names bounded to the reviewed *C. fallax* identity in ledger notes. The English–French pairing is a cross-source inference through the shared species, not a directly published bilingual equivalence. Do not add forms, recipe links, density, unit mappings, package yields, conversions, or substitutions in this proposal.
- **Plan state:** Section N remains open. This proposal addresses the identity boundary only and does not mark the selected checklist item complete.

## Precise unchecked plan anchor

The anchor is the final unchecked line under Section N in *docs/RecipeBook-global-ingredient-catalog-plan.txt*:

> [ ] Verify species-sensitive names and avoid unverified mushroom substitutions or an
> all-mushrooms-are-interchangeable rule.

The proposal provides a bounded common-name recommendation and records why it must not be merged into chanterelle or generic mushroom. It does not verify a substitute, and the plan anchor stays unchecked.

## Why this is a useful generic gap

Black trumpet is a named, edible culinary fungus with documented Québec occurrence and culinary-market potential. MycoQuébec identifies *Craterellus fallax* as a choice edible and gives the French name **fausse corne d’abondance** with **trompette des morts** in parentheses. A Québec forest-mushroom commercialization study lists *C. fallax* as a species with commercial potential and records **trompette de la mort** and **fausse corne d’abondance**. A primary taxonomic paper is titled “*Craterellus fallax*, a Black Trumpet mushroom from eastern North America with a broad host range.” These sources support a generic culinary identity with a Québec/eastern North American boundary. [S01–S03]

This is not a claim that every food called a black trumpet is *C. fallax*. Older English references sometimes treated *C. fallax* as a synonym of *C. cornucopioides*, and common names overlap. The reference should be scoped by its Québec name pair and the cited *C. fallax* identity; names that collapse taxa stay out of the aliases. [S01, S02, S06]

## Current package and collision audit

I checked the current bundled-library manifest and all manifest-listed recipe files, active ingredient references and forms, the ledger, legacy candidates, both substitution-rule files, and package-yield data.

| Area | Current finding | Proposal effect |
|---|---|---|
| Active references | The catalog has 1,937 references. No exact target name, proposed alias, *Craterellus fallax*, *C. cornucopioides*, or proposed ID is active. Related entries are the generic **ingredient-ref-mushroom** (champignons / mushroom, alias mushrooms), **ingredient-ref-chanterelle-mushroom**, and the separate **ingredient-ref-ground-dried-candy-cap-mushrooms**. | Add one species-bounded generic culinary identity; preserve all three existing identities. Do not merge this candidate into generic mushroom or chanterelle. |
| Active forms | The catalog has 202 forms and no black-trumpet or *Craterellus* form. | No form rows are proposed. |
| Legacy candidates | The legacy file contains 56 candidates and no black-trumpet or *C. fallax* candidate. It does contain the inactive duplicate generic-mushroom candidate. | Do not reactivate or merge the legacy generic-mushroom row. |
| Recipe corpus | The manifest covers 114 recipe files and 1,123 ingredient rows. There is no black-trumpet, *C. fallax*, or proposed French-name occurrence. Existing mushroom rows remain generic; the ground dried candy-cap row is separately identified. | No bundled recipe link or relinking is supported. |
| Ledger | The research ledger contains 2,340 records and no black-trumpet or *C. fallax* identity record. Existing generic mushroom, chanterelle, and candy-cap records remain separate. | If accepted, add one new identity record without replacing or modifying existing records. |
| Substitution rules | Both global and contextual substitution-rule files are empty. | Add no substitution rule. |
| Package yields and measures | No candidate-specific yield or measurement record was found. Related active references have no density or unit mapping for this identity. | Leave numeric data absent. |

The catalog search code folds accents and punctuation and supports partial matching. Because the proposed English display contains “black trumpet,” that phrase will remain discoverable through the display. This review does not use a broader alias to make the row stand for *C. cornucopioides* or other black-trumpet-labelled taxa.

## Review inputs and prior coverage

The candidate was selected after reviewing the project scope and the current Section N work:

- **AGENTS.md** and **Requirements.md** require generic culinary diversity, bilingual Québec French names, source-scoped claims, preservation of existing references, and no brand/product roster expansion.
- **docs/RecipeBook-global-ingredient-catalog-plan.txt**, **roadmap.md**, and **docs/catalog/ingredient-catalog-workflow.md** show WP03 and Section N remain active, with species-sensitive mushroom naming and unsupported substitutions still open.
- I reviewed prior Section N work: the fungi/seaweed coordinator, culinary mushroom identity review, remaining mushroom identity review, other-fungi follow-up, Québec mushroom-term review, white-matsutake identity review, sea-vegetable/algae product-boundary review, and seaweed-form/hydration review. Those proposals cover other identities and the seaweed hydration hold; none proposes black trumpet or *C. fallax*.
- The live active references, forms, substitution rules, package yields, research ledger, and **docs/catalog/legacy-import-identities.v1.json** were checked, along with the full bundled recipe manifest and corpus.
- The current **docs/catalog/batches/generic-ingredient-scope-review-20261019/README.md** was checked for cross-category queue scope.

The roadmap and workflow support selecting another generic Section N identity. They do not establish recipe demand, measures, or substitutions for this fungus; those are assessed separately below.

## Proposed reference row

If accepted, use the following identity-only values:

| Field | Proposed value |
|---|---|
| id | **ingredient-ref-black-trumpet-mushroom** |
| nameEn | **black trumpet mushroom** |
| nameFr | **fausse corne d’abondance** |
| aliasesEn | **black trumpets** |
| aliasesFr | **trompette de la mort**; **trompette des morts** |
| defaultDensity | null |
| unitMappings | empty |
| category | **VEGETABLE_AND_AROMATIC**, following the catalog’s existing culinary-fungus classification |
| updatedAt | 2026-10-19T00:00:00Z if integrated with this review |

No scientific-name field exists in the active reference schema. Keep *C. fallax* in source-backed notes and the research ledger only.

## Recipe demand

| Evidence | What it supports | What it does not support |
|---|---|---|
| Bundled corpus, all 114 manifest-listed recipe files | No direct bundled-recipe demand for black trumpet or *C. fallax* was found. Generic mushroom rows and candy-cap remain distinct. | No link from a generic mushroom recipe line to black trumpet; no inferred substitution or recipe edit. |
| Missouri Department of Conservation field guide, Black Trumpet [S04] | A public conservation field guide describes black trumpet as edible and notes culinary use with eggs and as a garnish for squash soup; it also describes dried and ground use as seasoning. | No Québec recipe demand, recipe quantity, package yield, or transferable measure. Its taxonomic label groups *C. cornucopioides* and *C. fallax*, so it is culinary-use evidence only. |
| Québec Agrireseau commercialization study [S03] | Local commercial-potential context for *C. fallax*, including its Québec common names. | It is an older market study, not a current demand or availability estimate and not a recipe source. |

The external sources establish that this is a real generic culinary ingredient; lack of bundled-corpus demand means the proposal remains identity-only.

## Name, identity, and alias boundaries

The active schema has no scientific-name field. Keep *Craterellus fallax* and its Québec/eastern North American evidence boundary in the proposal and, if integrated, the research-ledger notes. Do not invent a schema field or add binomials as picker aliases.

| Term | Decision | Evidence and limit |
|---|---|---|
| **black trumpet mushroom** | English display | The English common name appears in the title of the primary *C. fallax* paper; the Missouri field guide also uses it but groups *C. fallax* with *C. cornucopioides*. The proposed display is therefore scoped by the identity notes to *C. fallax* for this Québec-oriented row. [S02, S04] |
| **fausse corne d’abondance** | French display | MycoQuébec gives this Québec French name directly for *C. fallax*. The Agrireseau study independently uses it for the same taxon. [S01, S03] |
| **black trumpets** | English alias | Ordinary plural of the English display, supported by the field-guide page’s use of “black trumpets.” It does not broaden the row beyond its stated species scope. [S04] |
| **trompette des morts** | French alias | MycoQuébec lists this name parenthetically for *C. fallax*. [S01] |
| **trompette de la mort** | French alias | The Québec Agrireseau study uses this name for *C. fallax*. [S03] |
| **black chanterelle** | Exclude | Missouri lists it as a common name, but the USDA Forest Service monograph applies “black chanterelle” to *C. cornucopioides* and separately lists that name for *Polyozellus multiplex*. It is not a safe alias for this species-bounded row. [S04, S06] |
| **chanterelle**, **chanterelle mushroom** | Exclude | These are already owned by the active chanterelle identity. The OQLF describes chanterelles as *Cantharellus* spp. and distinguishes “craterelles,” including trompette-de-la-mort. Keep the active chanterelle identity separate. [S05] |
| **horn of plenty**, **trumpet of the dead**, **trumpet of death**, **deceptive horn of plenty** | Exclude | Older references use these names across *C. cornucopioides* and *C. fallax*, and taxonomy treatments differ. The names do not safely resolve the proposed Québec *C. fallax* identity. [S04, S06] |
| *Craterellus fallax*, *C. cornucopioides*, and spelling variants | Do not add as aliases | The binomial belongs in evidence notes rather than the current picker vocabulary. *C. cornucopioides* must not be presented as a synonym here: the Québec taxonomic database describes the older synonym treatment and cites the 2010 study that rejected it. [S01, S02] |

The proposed French and English displays are linked by their shared *C. fallax* scope across independent sources. None of the reviewed sources gives a direct bilingual terminology record for this exact pair, so this equivalence remains an explicit inference for catalog review, not a claim that the terms are always interchangeable.

## Forms, measurements, and substitutions

The Missouri guide documents fresh culinary use and dried, ground seasoning use. That establishes preparation contexts, not reusable catalog forms or conversions. With no bundled recipe demand and no form-specific recipe line, this proposal adds no fresh, dried, powdered, canned, reconstituted, or soaking-liquid form. [S04]

No reviewed source provides a cooking measure, density, package yield, count-to-mass mapping, fresh-to-dried yield, or other reusable conversion for *C. fallax*. MycoQuébec's biological cap dimensions and the Missouri guide's fruiting-body dimensions are identification descriptions, not culinary measures. The older Agrireseau report's commercial-potential discussion is not a transferable modern portion value. Leave density null and unit mappings and package yields empty. [S01, S03, S04]

No source reviewed supports replacing black trumpet with generic mushroom, chanterelle, or another fungus. Shared fungal category, appearance, or culinary role is not enough to establish interchangeability. Add no global or contextual substitution.

If integrated, create a new identity record with these proposed states:

- **identityState:** verified, for the bounded *C. fallax* identity and reviewed common-name evidence.
- **measurementState:** researched_no_supported_value, limited to the sources reviewed here; no generic measure, density, mapping, yield, or conversion is supported.
- **substitutionResearchState:** not_yet_researched. This proposal does not conduct a full substitute review, so absence of a proposed substitute is not recorded as a completed global substitution study.

No numeric or substitution value is proposed.

## Cross-category queue disposition

The 2026-10-19 cross-category scope review identifies the two explicit Section F cereal-roster clauses as out of scope for commercial-roster expansion because commercial-product counts do not add ingredient diversity; their generic cereal-coverage work remains open. No Section N brand-, product-line-, flavour-family-, SKU-, or retailer-variant-only assignment was found. This proposal concerns one generic culinary identity, not a product roster. Existing branded rows and product-only evidence remain untouched; no commercial measurement is transferred. [S07]

## Proposal-only decision delta

If accepted, this proposal would add only:

- one generic identity row, **ingredient-ref-black-trumpet-mushroom**, with the proposed English/French displays and bounded aliases listed above;
- one new identity record in the research ledger, with *C. fallax* taxonomy and naming limitations noted.

It would add no recipe links or edits, forms, density, unit mappings, package yields, conversions, or substitutions. It would preserve the generic mushroom, chanterelle, candy-cap, and all other existing entries unchanged. The unchecked plan anchor remains open.

## Source register

Sources were accessed on 2026-10-19. Amounts and claims remain limited to the sources and contexts shown.

| ID | Source | Supports and limits |
|---|---|---|
| **WP03-BLACK-TRUMPET-20261019-S01** | MycoQuébec, [*Craterellus fallax*](https://www.mycoquebec.org/scripts/fiche_pdf.php?dest=D&tag=Craterellus+fallax). | Gives the Québec French name **fausse corne d’abondance (trompette des morts)**, identifies *C. fallax*, calls it a choice edible, and explains that the historical synonym treatment with *C. cornucopioides* was challenged by Matheny et al. in 2010. Biological dimensions are not culinary measures. |
| **WP03-BLACK-TRUMPET-20261019-S02** | Matheny et al., [“*Craterellus fallax*, a Black Trumpet mushroom from eastern North America with a broad host range,” *Mycorrhiza* (2010)](https://doi.org/10.1007/s00572-010-0326-2); [PubMed record](https://pubmed.ncbi.nlm.nih.gov/20602121/); [author-hosted paper](https://mathenylab.utk.edu/Site/Publications_files/Matheny_etal_Craterellus_fallax_M.2010.pdf). | Primary taxonomy paper; its title supports English **black trumpet** for eastern North American *C. fallax*. This proposal does not infer a measurement or recipe amount from the paper. |
| **WP03-BLACK-TRUMPET-20261019-S03** | Québec Agrireseau, [*Analyse de commercialisation des champignons forestiers sauvages à potentiel commercial du Québec*](https://www.agrireseau.net/documents/Document_118788.pdf). | Lists *C. fallax* among Québec forest fungi with commercial potential and records **trompette de la mort** and **fausse corne d’abondance**. The study is dated and does not establish current market demand, availability, or a reusable measure. |
| **WP03-BLACK-TRUMPET-20261019-S04** | Missouri Department of Conservation, [Black Trumpet field guide](https://mdc.mo.gov/discover-nature/field-guide/black-trumpet). | Supports English common use and culinary contexts: eggs, squash soup garnish, and dried/ground seasoning. It groups *C. cornucopioides* and *C. fallax*, so its taxonomic label is not used to define the proposed identity; its biological size data are not cooking measures. |
| **WP03-BLACK-TRUMPET-20261019-S05** | Office québécois de la langue française, [GDT — chanterelle](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9482852/chanterelle). | The 1991 entry treats chanterelle as *Cantharellus* spp. and separates craterelles, including trompette-de-la-mort. Used only as a boundary with the active chanterelle identity; its taxonomy wording is dated. |
| **WP03-BLACK-TRUMPET-20261019-S06** | USDA Forest Service, [*Ecology and Management of Commercially Harvested Chanterelle Mushrooms*](https://research.fs.usda.gov/download/treesearch/5298.pdf). | Documents historical synonym and common-name overlap: “black chanterelle” and horn-of-plenty names do not cleanly isolate *C. fallax*. Its older taxonomy is evidence of naming ambiguity, not the current species decision. |
| **WP03-BLACK-TRUMPET-20261019-S07** | [2026-10-19 cross-category generic-ingredient scope review](../batches/generic-ingredient-scope-review-20261019/README.md). | Records that commercial roster work is out of scope because commercial-product counts do not add ingredient diversity; identifies the Section F cereal clauses and confirms no Section N roster-only assignment. |

## Review disposition

Recommend the identity-only row as a generic culinary ingredient, with the English/French name pairing explicitly treated as an inference through *C. fallax* and with ambiguous common names excluded. Keep Section N open. No recipe link, form, measure, density, mapping, package yield, conversion, or substitution is warranted by this review.

## Root integration outcome (2026-10-19)

Accepted as the identity-only generic reference `black trumpet mushroom / fausse corne d’abondance`, with the reviewed aliases and species limits recorded in the ledger. The pairing remains an explicit cross-source inference through Québec/eastern North American *Craterellus fallax*. Ambiguous common names and other existing fungus identities remain separate. No form, measurement, recipe link, conversion, yield, or substitution was added. Section N remains open. See the [R910–R912 integration README](../batches/wp03-r910-r912-generic-integration-20261019/README.md).
