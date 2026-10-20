# WP04 Section O — generic lamb / agneau identity review (R1010)

- **Review and source-access date:** 2026-10-19.
- **Status:** Integrated into the bundled ingredient reference catalog and research ledger, with the review recorded in the R1008–R1010 integration README. Recipe 078#3 remains unchanged.
- **Exact plan anchor:** The open WP04 species checklist at [global catalog plan, line 7207](../../RecipeBook-global-ingredient-catalog-plan.txt#L7207), which lists lamb and mutton separately.
- **Candidate:** Generic culinary lamb meat from ovine carcasses that meet the Canadian lamb maturity standard.
- **Recommendation:** Add one identity-only `PROTEIN` reference for **lamb / agneau**, with no aliases or forms. If a source-scoped measurement is retained, record only the Health Canada cooked Food Guide portion of 75 g for one serving; do not treat its paired 125 mL as a conversion. Add no recipe link or substitution.
- **Scope:** Generic lamb meat only. Keep mutton as a separate, unintegrated identity question. No brands, products, product lines, flavours, SKUs, or retailer variants were researched.

## Identity and Québec terminology

The OQLF food-domain GDT entry pairs **agneau** with English **lamb**. The CFIA meat-cuts manual defines lamb as meat from an ovine carcass meeting the maturity characteristics in the Canadian Grade Compendium. It separately says that meat from an ovine carcass which does not meet the lamb criteria is to be called **mutton**. Together these sources support a generic lamb-meat identity and a clear boundary from mutton. [R1010-S01–S03]

Use the source-attested pair, with no aliases:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-lamb-meat` |
| Category | `PROTEIN` |
| English display | `lamb` |
| Québec French display | `agneau` |
| English aliases | None |
| French aliases | None |
| Default density / unit mappings | `null` / `[]` |

Do not add `mutton`, `sheep meat`, or `ovine meat` as lamb aliases. In the OQLF food-domain entry, **mouton** maps to **mutton**, and the CFIA distinction is based on lamb maturity criteria. Do not collapse all ovine meat into lamb or treat mutton as an equivalent. This packet does not propose a mutton reference; Section O remains open for it as a separate review. [R1010-S02–S03]

The OQLF entry for **agneau haché / ground lamb** supports that qualified term, but not an alias for the unqualified lamb identity. Keep ground lamb distinct from generic lamb in search naming, just as `ground beef` remains distinct from `beef`. Do not add a ground-lamb reference, form, or recipe-line alternative in this packet. [R1010-S05]

## Current ownership and evidence-transfer review

Read-only snapshot checked against the active references, forms, legacy-import candidates, research ledger, and manifest-listed recipes: **2,021 active references, 205 forms, 55 legacy candidates, 2,427 ledger records, and 114 recipes / 1,123 ingredient rows**. Exact-key checks follow the app's `normalizeIngredientSearchKey` rules across active display names and aliases, form IDs/labels/match terms, legacy IDs/names/aliases, and ledger record IDs. No exact current owner or candidate was found for `lamb`, `lamb meat`, `ground lamb`, `agneau`, `agneau haché`, `mutton`, `mouton`, `sheep meat`, `ovine meat`, `ingredient-ref-lamb-meat`, or `ingredient-ref-mutton-meat`. [R1010-R01]

The exact-key gap does not erase nearby terms or source claims. Keep each with its present owner:

| Current owner | Existing evidence and boundary |
|---|---|
| `ingredient-ref-common-lambs-quarters` and `ingredient-ref-lambs-lettuce` | These plant names contain the lexical token `lamb`, but neither is an animal-protein identity. A short `lamb` picker query currently finds these two plants; it is not an exact identity collision. |
| `ingredient-ref-ground-beef` | Recipe `078#3` remains linked to `ground beef / bœuf haché`. Its ledger source records the publisher's optional ground-lamb choice for this one Shepherd's Pie. It does not support a general ground-beef-to-lamb substitution, a ground-lamb identity, or transferring the `90% lean` qualifier to lamb. |
| `candidate-beef-jerky` | A CFIA export-category source lists lamb among several species covered by dried-meat classifications. That export classification is not a generic lamb definition, culinary alias, or recipe equivalence. |
| `ingredient-ref-charqui` | Its regional source discusses ovine chalona alongside alpaca charqui. This is evidence for a separate named dried-meat product, not an alias or measurement for generic lamb. |
| `ingredient-ref-sheep-milk` | Its MAPAQ source is used for the Québec dairy-sheep sector and sheep milk. It does not establish a meat identity or a meat measurement. |
| `ingredient-ref-pork` and `ingredient-ref-veal` | Their ledger entries already use the Health Canada Food Guide PDF for separate Pork and Veal rows. If lamb is integrated, register the Lamb row under its own source ID and locator; leave those records unchanged. |

The earlier [ground-lamb alternative review](wp04-section-o-recipe-078-ground-lamb-alternative-review-20261010.md) and [regional-protein benchmark review](wp04-section-o-regionally-specific-protein-benchmark-gap-review-20261012.md) addressed the recipe-local alternative and the regional-protein checklist. They did not establish a generic lamb reference or resolve the separate Section O species checklist. This proposal preserves their no-substitution and no-origin-inference decisions.

## Bundled recipe demand

The scan covered all **114 manifest-listed recipe files and 1,123 structured ingredient rows**. It found one lamb-related ingredient row: Shepherd's Pie `078#3`, with source wording `1 lb. 90% lean ground beef -or ground lamb`. The normalized `ingredientName` is `ground beef`, the current reference is `ingredient-ref-ground-beef`, and the English and French notes preserve the ground-lamb option. No recipe row names generic lamb meat or mutton, and no other manifest-listed recipe contains a lamb/mutton meat request. [R1010-R01]

Keep `078#3` and its note unchanged. Its one-pound quantity belongs to the publisher's choice for that recipe; it is not a separate measured lamb row. The phrase `90% lean` qualifies the beef option only. Do not add a recipe link to the proposed generic lamb identity, create a ground-lamb target, or convert the local choice into a global or contextual substitution. The current substitution model cannot encode that single recipe-line target without broader scope than the source supports.

## Measurements, forms, and substitutions

- **Source-scoped portion:** Health Canada's legacy Food Guide sheet says its meat servings are represented as cooked and lists **Lamb — 75 g / 125 mL (½ cup)** for one serving. If this observation is accepted, store only 75 g as a cooked dietary `portion_weight` with quantity basis `one legacy Food Guide serving`. It is not a recipe quantity or raw-to-cooked yield. The paired 125 mL is source wording, not a density, mapping, or conversion. The same PDF is already used for the pork and veal rows; the new locator is the Lamb row. [R1010-S04]
- **No forms or reusable amounts:** Add no ground, raw, cooked, fresh, frozen, cut, or package form. The 75 g dietary portion must not be presented as a general recipe measure. Leave density null and unit mappings empty.
- **No mutton measurement transfer:** The cited Food Guide row is labeled Lamb. It supplies no mutton amount. Do not apply it to mutton or to generic “sheep meat.”
- **Substitutions:** The recipe `078#3` statement is local to its named dish. Add no ground-beef/lamb, lamb/mutton, or other species substitution. Leave generic substitution research `not_yet_researched` for a later context-specific review.
- **Recipe links:** None. The only bundle mention is a ground-lamb option on a line linked to ground beef, not a standalone generic lamb request.

## Commercial-product scope

No commercial roster or product-level source was pursued. If a queued lamb item is limited to brand, product line, flavour family, SKU, or retailer variant, mark it out of scope because **commercial-product counts do not add ingredient diversity**, then stop pursuing that item. A manufacturer page may support a generic claim only when the evidence transfers beyond the named product; any product-only measurement or claim remains scoped to that product.

The current Section O plan and roadmap mentions are limited to the open generic lamb/mutton species checklist and the previously reviewed `078#3` ground-lamb alternative. No commercial-product roster is queued for this identity.

## Proposal source register

These source IDs are proposal-local. None was added to the shared research ledger.

| Source | Evidence and limits |
|---|---|
| **R1010-S01** | Office québécois de la langue française, [agneau (GDT), food domain](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428319/agneau), updated 1983. Selects `agneau`, identifies the `alimentation — viande d'agneau` domain, and translates it as `lamb`. Its definition describes a young, unweaned sheep; this is Québec terminology evidence, not the Canadian meat-label maturity standard. It supports the display pair only. |
| **R1010-S02** | Canadian Food Inspection Agency, [Lamb — Meat cuts manual](https://inspection.canada.ca/en/food-labels/labelling/industry/meat-and-poultry-products/meat-cuts/lamb) and [Agneau — Manuel de coupes de viande](https://inspection.canada.ca/fr/etiquetage-aliment/etiquetage/industrie/produits-viande-volaille/coupes-viande/agneau), lamb definition and maturity reference. Defines lamb as meat from an ovine carcass meeting the Canadian maturity criteria, and says ovine meat that does not meet those specifications is mutton / mouton. Cut names and modifiers are listed separately. Supports the generic meat boundary and separation, not household measures, recipe use, or substitutions. Page last modified 2019-06-10. |
| **R1010-S03** | Office québécois de la langue française, [mouton (GDT), food domain](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8428311/mouton), updated 1983. Gives `mouton` as the preferred French term, English `mutton`, and a food-domain definition including meat. Its translation note distinguishes lamb from mutton using carcass characteristics. Used to keep the two names separate; no mutton row or alias is proposed. |
| **R1010-S04** | Health Canada, [Eating Well with Canada's Food Guide — What is a Food Guide Serving of Meat and Alternatives](https://www.canada.ca/content/dam/hc-sc/migration/hc-sc/fn-an/alt_formats/hpfb-dgpsa/pdf/food-guide-aliment/serving_meat-viande_portion-eng.pdf), PDF p. 1, cooked-serving note and `Lamb` row. Explicitly states that listed meat servings are cooked and gives 75 g / 125 mL for one Lamb serving. Supports only a source-specific cooked dietary portion; the volume is not a conversion. The source URL is already used for separate pork and veal rows with distinct locators. |
| **R1010-S05** | Office québécois de la langue française, [agneau haché (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9897993/agneau-hache), updated 1983. Gives `agneau haché / ground lamb` and notes that a meat label should include the animal species. Supports the qualified name only; it does not make ground lamb an alias for unqualified lamb or a general substitution. |
| **R1010-R01** | Local read-only audit on 2026-10-19 of the current Section O checklist, active references, forms, legacy candidates, ledger records and source ownership, focused WP04 reviews, manifest, and every manifest-listed recipe JSON. Exact-key normalization follows `normalizeIngredientSearchKey`; the corpus contains 114 recipes / 1,123 rows and one `078#3` ground-lamb option. This audit is not external identity or measurement evidence. |

## Recommendation

Add `ingredient-ref-lamb-meat` as identity-only **lamb / agneau** in `PROTEIN`, with no aliases, forms, recipe links, density, or unit mappings. If retaining the Health Canada observation, record only the 75 g cooked amount as one source-scoped legacy Food Guide serving. Keep mutton separate and unintegrated; do not use the recipe-local ground-lamb choice as a generic substitution or as ground-lamb catalog demand. Section O remains open for mutton, cuts, offal, and other protein gaps.

No tests, builds, or emulator checks were run because this is a documentation-only proposal.
