# WP02 A4 Graham flour identity and boundary review

**Reviewed:** 2026-10-11
**Status:** Proposal only. No catalog, ledger, recipe, plan, roadmap, test, or code files were changed.

## Recommendation

**Accept one identity-only Canadian flour reference:** `Graham flour / farine Graham`, category `FLOUR_AND_STARCH`. The Canadian Food Inspection Agency (CFIA) defines Graham flour as a distinct wheat-flour product, and the Office québécois de la langue française (OQLF) gives this exact English/French term pair and distinguishes it from whole-wheat flour. This fills a remaining Section A regional/functional wheat-flour distinction without creating a generic whole-grain alias.

This is a distinct A4 batch from the earlier rye and mung-flour reviews. The prior wheat-flour proposals mention Graham flour only as a boundary comparator; none proposes this identity.

Proposed ID for a later coordinator integration: `ingredient-ref-graham-flour` (unused in the live package and ledger at this review). Use no aliases. Keep `defaultDensity` null and `unitMappings` empty. Add no forms, conversions, package yields, recipe links, or substitutions. This packet does not integrate the proposal.

The identity is scoped to the Canadian standardized product meaning. The evidence does not establish that every product called “Graham flour” in other jurisdictions has the same formulation or milling process.

## Evidence and identity boundary

CFIA’s current Canadian Food Compositional Standards, Volume 12, section 12.1.4, defines Graham flour as flour to which part of the bran and other wheat-berry constituents have been added; it specifies an ash range on a moisture-free basis. This standard is a Canadian product definition, not a recipe measurement or a complete milling specification. [S01]

OQLF’s GDT entry prefers `farine Graham` and gives `Graham flour` as its English term. It defines the product as white flour with ground bran flakes and other wheat-berry parts added. OQLF’s whole-wheat-flour entry explicitly says not to confuse that product with whole-wheat flour, which is milled and bolted wheat meeting the separate Canadian whole-wheat compositional standard. [S02–S03]

These sources support the following decision boundaries:

| Neighbor | Disposition |
|---|---|
| `whole-wheat flour / farine de blé entier` | Keep distinct. OQLF and CFIA describe separate products and standards. Do not add either name as an alias. |
| `whole-wheat pastry flour / farine de blé entier à pâtisserie` | Keep distinct. The active identity is supported by Québec product evidence and remains whole-kernel flour. Do not map it to Graham flour. |
| `white whole-wheat flour / farine intégrale de blé blanc` | Keep distinct. White wheat and whole-grain retention do not make it equivalent to flour with bran and other wheat constituents added to white flour. |
| `graham cracker crumbs / chapelure de biscuits graham` | Keep as a separate prepared cracker-crumb product. Three bundled recipe lines use this identity; none requests Graham flour. |
| `whole wheat pastry graham flour` | Do not use as an alias. King Arthur uses this composite name for a specific whole-kernel pastry product; its own description says it is made from the complete wheat kernel. That product label does not override or generalize the Canadian Graham-flour definition. [S04] |

The proposed displays are the exact OQLF terms. Do not add `Graham` alone, `whole grain flour`, `whole-wheat flour`, `bran flour`, `Graham cracker flour`, `farine complète`, or other grade/product phrases as aliases. No source reviewed establishes them as interchangeable synonyms, and the short query `Graham` already describes the neighboring crumb family. A later picker check should verify that exact `Graham flour` and `farine Graham` searches identify the new row while the broad `Graham` query remains a set of separate choices.

## Numeric, form, conversion, and recipe disposition

- **Numeric values:** Do not copy CFIA’s ash limits into catalog density, unit, nutrition, or conversion fields. They are regulatory composition criteria measured on a moisture-free basis, not recipe behavior. The review found no general cup weight or volume-to-mass evidence for this flour.
- **Forms and conversions:** Add no form, form-specific density, unit mapping, or conversion. The reviewed sources do not support a household measure or preparation-state conversion.
- **Yield and substitution:** Add no package yield or global/contextual substitution. The King Arthur page’s pastry-use and interchangeability claims apply to its named product and are not evidence for Canadian Graham flour generally. [S04]
- **Recipes:** The manifest-listed corpus contains 114 files and 1,123 ingredient rows. A scan of every ingredient line’s `originalText`, `ingredientName`, and `ingredientRefId` found no Graham-flour or `farine Graham` demand. The only Graham-family lines are these three existing cracker-crumb lines; leave them linked as they are:

| Recipe line | Existing text and amount | Existing identity |
|---|---|---|
| [`006#5`](../../../app/src/main/assets/seed/bundled-library/recipes/006-barres-nanaimo-nanaimo-bars-9a714acf-d991-4932-bb4c-63af19051022.v1.json) | `175 g graham cracker crumbs` | `ingredient-ref-graham-cracker-crumbs` |
| [`026#1`](../../../app/src/main/assets/seed/bundled-library/recipes/026-carres-magiques-magic-cookie-bars-ff66e4f7-c719-4203-970b-06993cdb25de.v1.json) | `2 cups graham cracker crumbs` | `ingredient-ref-graham-cracker-crumbs` |
| [`081#1`](../../../app/src/main/assets/seed/bundled-library/recipes/081-pistachio-coconut-amaretto-cheesecake-c838fd50-8230-4df7-bc03-a90f3928c39a.v1.json) | `1 1/2 cups graham cracker crumbs` | `ingredient-ref-graham-cracker-crumbs` |

These are crumb recipe amounts, not evidence for Graham-flour density, conversions, or links. No recipe line should be relinked by this proposal.

## Live-package and collision audit

Snapshot read on 2026-10-11. Hashes cover exact file bytes. Recipe corpus hash is SHA-256 over manifest-ordered relative recipe paths, NUL bytes, exact recipe bytes, and NUL bytes.

| Artifact | Current state | SHA-256 |
|---|---:|---|
| `ingredient-references.v1.json` | 899 references | `4b57543bc9ae9129663a3fde516439aba5fbb14e1a45515dc96cda79acba49a8` |
| `ingredient-forms.v1.json` | 48 forms | `0b10d6e02d596a3d928eab208652cebab1ef1c9c933724c8b9c52c4d9e00b84e` |
| `docs/catalog/research-ledger.v1.json` | 1,145 records | `1add103daec0a0467dd4c5dcd74cd190a7d473c7289018af5b7c637c1c0293b4` |
| `docs/catalog/legacy-import-identities.v1.json` | 77 candidates | `7bbf64f1db0944c5cf56c7399c8ed70b9f1ab7a24fb49f7137c744698c48ec57` |
| `manifest.v1.json` | 114 recipe paths | `b49f39ff983ebab9caf853afc505ea1f0bb08cf11d0386edac1380baaeccb984` |
| Manifest-listed recipe corpus | 114 files / 1,123 ingredient rows | `6b0df96f2f4c672f88ec6670857c493f7f1cbb1c441432d1c9365e14a6145c14` |

| Surface | Collision/result |
|---|---|
| Active references | No exact normalized `Graham flour`, `farine Graham`, or proposed ID exists. The only active Graham-name row is `ingredient-ref-graham-cracker-crumbs`. Related active comparators include whole-wheat flour and whole-wheat pastry flour; keep each separate. |
| Forms | No form ID, label, or match term names Graham flour or `farine Graham`. |
| Research ledger | No `ingredient-ref-graham-flour` record or reviewed Graham-flour decision exists. The whole-wheat-meal record cites CFIA only for its list of distinct bread ingredients; that citation does not define Graham flour. The whole-wheat-pastry record cites King Arthur’s composite product page, scoped there as whole-kernel flour. The active Graham-crumb record has no identity sources and its measurement state is `blocked_pending_evidence`. |
| Legacy candidates | No Graham-flour candidate or matching alias exists among the 77 rows. |
| Prior proposals | Existing mentions are incidental boundary references: the white/whole-wheat terminology review and the A7 wheat-meal review distinguish Graham from whole-wheat flour; Section G crumb reviews treat Graham crumbs as a prepared product. No standalone A4 Graham-flour identity proposal was found. |
| Proposed keys | `ingredient-ref-graham-flour`, `WP02-A4-GRAHAM-FLOUR-20261011-S01` through `S04`, and this proposal filename were checked and unused before drafting. Recheck all keys against the then-current package before integration. |

## Evidence limits

CFIA and OQLF support a Canadian identity and the bilingual display, but the OQLF term page dates to 2002 and does not establish present retail availability or recipe performance. The CFIA standard gives a composition boundary and ash limits but not a consumer-facing specification for bran particle size, a universal mill process, or a household measurement. King Arthur’s current product page demonstrates that “Graham” also appears in a compound product label for a complete-kernel pastry flour; its product-specific description is a reason to avoid broad aliasing, not a crosswalk. The Compliments product ingredient list also names Graham flour inside a prepared cracker product, but does not characterize the standalone flour. [S04–S05]

Accordingly, the evidence supports only the identity-only Canadian entry proposed above. It does not support measurements, forms, grade equivalencies, recipe links, or substitution behavior.

## Source register

All online sources were checked on 2026-10-11. IDs are proposal-local and are not ledger entries.

| ID | Source | Direct support and limits |
|---|---|---|
| **WP02-A4-GRAHAM-FLOUR-20261011-S01** | CFIA, [Canadian Food Compositional Standards](https://inspection.canada.ca/en/about-cfia/acts-and-regulations/list-acts-and-regulations/documents-incorporated-reference/canadian-food-compositional-standards-0), Volume 12, sections 12.1.3–12.1.4. | Current incorporated Canadian standard. Section 12.1.4 defines Graham flour as flour with part of the bran and other wheat-berry constituents added and gives the moisture-free ash range. Section 12.1.3 separately defines whole-wheat flour. Regulatory criteria are not imported as cooking measurements or conversions. |
| **WP02-A4-GRAHAM-FLOUR-20261011-S02** | OQLF, [farine Graham (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8356359/farine-graham), last updated 2002. | Gives preferred Québec French `farine Graham`, English `Graham flour`, and a definition consistent with adding ground bran flakes and other wheat parts to white flour. Terminology evidence; not a current market or performance survey. |
| **WP02-A4-GRAHAM-FLOUR-20261011-S03** | OQLF, [farine de blé entier (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8361931/farine-de-ble-entier), last updated 2002. | Defines whole-wheat flour, gives the preferred terms, and explicitly warns against confusing it with Graham flour. Supports a boundary, not an equivalence. |
| **WP02-A4-GRAHAM-FLOUR-20261011-S04** | King Arthur Baking, [Whole Wheat Pastry Graham Flour](https://shop.kingarthurbaking.com/items/whole-wheat-pastry-graham-flour), current manufacturer product page. | Names one composite product and says it is made from the complete wheat kernel; pastry and interchangeability claims are product-specific. It is already cited by the active whole-wheat-pastry ledger record; it does not establish a generic Canadian Graham-flour alias or substitution. |
| **WP02-A4-GRAHAM-FLOUR-20261011-S05** | Compliments, [Graham Crumbs 400 g](https://www.compliments.ca/en/products/graham-crumbs-400-g/), current brand product page. | Lists `Graham flour` as an ingredient in prepared crumbs alongside enriched wheat flour, sugars, water, fats, and other ingredients. Corroborates ingredient-label usage, not the standalone flour’s full composition or a recipe conversion. |
