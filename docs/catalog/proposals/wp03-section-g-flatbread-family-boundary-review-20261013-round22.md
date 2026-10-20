# WP03 Section G — Generic Flatbread Family and Prepared-Bread Boundary Review

**Reviewed:** 2026-10-13 (round 22)  
**Status:** Accepted and integrated on 2026-10-13 as identity-only `flatbread / pain plat`, with grammatical plural aliases. No forms, recipe links, measures, conversions, yields, or substitutions were added. See the [R22 integration batch](../batches/wp02-wp03-wp04-round22-gap-review-integration-20261013/README.md).  
**Scope:** The still-open generic-flatbread and regional prepared-bread part of [Section G](../../RecipeBook-global-ingredient-catalog-plan.txt), including exact search ownership beside the existing named breads.

## Recommendation

Add one identity-only **family-level** reference for unqualified flatbread wording:

| Field | Proposed value |
|---|---|
| ID | `ingredient-ref-flatbread` |
| Category | `BAKING_MIXIN_AND_PANTRY` |
| English display | `flatbread` |
| English aliases | `flatbreads` |
| fr-CA display | `pain plat` |
| French aliases | `pains plats` |
| Density / unit mappings | None |
| Forms / recipe links | None |

This gives an unqualified `flatbread` / `pain plat` search a faithful family-level choice without adding the family name to any specific bread. The OQLF defines *pain plat* as a food made from rolled-out flour-and-water dough cooked at varying thicknesses; its examples span tortillas, chapatis, focaccia, and some pitas, including both unleavened and leavened products [S01]. A distinct family row therefore represents a documented generic ingredient phrase; it does not claim those products are interchangeable.

Keep the named prepared breads as independent identities. Do not add `flatbread`, `flatbreads`, `pain plat`, or `pains plats` as aliases on naan, roti, paratha, chapati, pita, lavash, injera, bread roll, sourdough bread, or bagel. The phrase-first picker returns only the family row for `flatbread` and `pain plat`; searches for the named products keep their current owners. The proposed family row does not appear as a result for any of those named searches.

Do **not** add English `flat bread` or `flat pita` as aliases of this family. OQLF lists these two-word terms under pita and says they refer to a pita that cannot be stuffed, while French does not make that pocketability distinction [S02]. Keep that narrower phrase out of the family row; a separate pita alias decision would require its own review. Also keep `galette` out: OQLF gives it only as a term used in some contexts, generally for unleavened flatbread, and the current picker already returns rice-paper sheets for `galette` through `galettes de riz`.

No additional named regional bread is proposed in this pass. The audited corpus has no ingredient line for any such bread. Focaccia is a member named in OQLF's family examples, not evidence to add a focaccia row or alias in this review; retain it as a possible future named identity if an exact ingredient use warrants it. Do not link the family row to any existing bread or to a recipe line.

Add no measures, forms, conversions, package yields, substitutions, or recipe links. Existing ledgers contain no supported generic flatbread measure or substitution. If the identity is integrated, leave its measurement and substitution research states `not_yet_researched`; this review does not establish negative findings from recipe and terminology sources alone.

## Current snapshot and recipe demand

The 114-file / 1,123-row scan checked all ingredient rows and full recipe text for `flatbread`, `flat bread`, `pain plat`, the listed regional bread terms, and common spelling/plural variants. No prepared flatbread or named-bread ingredient line was found. Accent-folded `roti` has one lexical hit in Recipe 085#9: the French preparation `rôti et haché` describes peanuts and is not a prepared-bread mention. The only current finished-bread ingredient row is Recipe 075#4, `5 to 8 slices brioche bread`, linked to `ingredient-ref-brioche-bread`. Bread flour and bread crumbs are separate inputs; they do not establish prepared-bread demand. The manifest-ordered recipe corpus remains 114 files / 1,123 rows / 753,792 bytes, SHA-256 `7f2daa3e0d065b28a2463ddd402f988cfb2442cf8a8243f59843a68663fb528c`.

No current reference, form, legacy-import identity, or ledger record owns the normalized generic names `flatbread`, `flatbreads`, `flat bread`, `pain plat`, or `pains plats`. The ledger contains source descriptions and study findings that use flatbread wording, including the injera review and a wheat/millet substitution study, but has no generic flatbread identity or candidate record. Prior reviews intentionally kept the family separate while integrating specific breads; this review recommends adding one standalone family row now, not reopening those accepted identities.

Relevant active identities inspected in `ingredient-references.v1.json` and the generated picker catalog:

| Active ID | English / fr-CA display and aliases | Boundary retained |
|---|---|---|
| `ingredient-ref-naan-bread` | `naan bread` / `pain naan`; alias `nan` in both languages | Keep `nan` as the specific naan spelling. [R1] |
| `ingredient-ref-roti` | `roti` / `roti`; no aliases | Keep distinct from chapati, paratha, and filled roti meals. [R1] |
| `ingredient-ref-paratha` | `paratha` / `paratha`; no aliases | Keep varieties and layered names out of global aliases/forms. [R1] |
| `ingredient-ref-chapati-bread` | `chapati` / `chapati`; English aliases `chapatti`, `chappati`, `chapathi`; French alias `chapatis` | Keep flour terms on atta; the current phrase search also finds atta for `chapati` and `chappati`. [R2] |
| `ingredient-ref-pita-bread` | `pita bread` / `pain pita`; no aliases | Keep chips, wraps, and the unqualified family term outside its alias set. [R3] |
| `ingredient-ref-lavash-bread` | `lavash bread` / `pain lavash`; no aliases | Keep lavash crackers separate. [R3] |
| `ingredient-ref-injera` | `injera` / `injera`; English alias `injera bread` | Keep `pain plat éthiopien` explanatory and keep injera separate from teff and starter. [R4] |
| `ingredient-ref-bread-roll` | `bread roll` / `petit pain`; aliases `bread rolls` / `petits pains` | Keep named roll types and other breads separate. [R5] |
| `ingredient-ref-sandwich-bread` | `sandwich bread` / `pain de mie`; aliases `sandwich loaf` / `pain à sandwich` | Keep sliced presentation wording separate. [R5] |
| `ingredient-ref-sourdough-bread` | `sourdough bread` / `pain au levain`; no aliases | Keep finished bread separate from `sourdough starter / levain naturel`. [R5] |
| `ingredient-ref-bagel` | `bagel` / `bagel`; English aliases `bagels`, `beigel`; French alias `baguel` | Keep bagel crisps, pretzels, mini bagels, and product varieties separate. [R6] |
| `ingredient-ref-corn-tortillas`, `ingredient-ref-flour-tortillas` | `corn tortillas` / `tortillas de maïs`; `flour tortillas` / `tortillas de farine` | OQLF's family example does not make corn/flour products, wraps, or chips aliases of a single generic record. [R7] |

The relevant package snapshot has 98 forms and no form attached to these finished-bread identities. The only package-yield row is for canned black beans. Both active substitution-rule files are empty; the ledger has no bread unit conversion. The bagel ledger's six-piece / 410 g St-Viateur sesame listing remains a product-specific observation and is not a per-bagel measure. Existing studies about flour replacement in a particular unleavened flatbread formula remain study-specific findings, not a bread substitution rule.

## Exact picker projection

The recipe editor builds `IngredientReferenceSearchIndex` from the active references and forms ([picker](../../../app/src/main/java/app/recipebook/ui/recipes/RecipeEditorScreen.kt#L1063)). Search folds case, accents, ligatures, punctuation, and spaces, then prefers complete word phrases before falling back to substring matches ([search implementation](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt#L23)). The table below projects the current JSON/generated reference and form terms through that logic; the hypothetical column adds only the proposed generic row and its plural aliases.

| Query | Current picker result | With proposed row | Note |
|---|---|---|---|
| `flatbread` | No result | `ingredient-ref-flatbread` | Exact family term. |
| `flatbreads` | No result | `ingredient-ref-flatbread` | Proposed plural alias. |
| `pain plat` / `pains plats` | No result | `ingredient-ref-flatbread` | OQLF French display and plural. |
| `flat bread` / `flat pita` | No result | No result | Do not map the two-word pita-specific wording to the generic family. [S02] |
| `galette` | `ingredient-ref-rice-paper-wrapper` | Same | Existing `galettes de riz` phrase; not a generic bread alias. |
| `naan` / `pain naan` / `nan` | `ingredient-ref-naan-bread` | Same | Named product stays specific. |
| `roti` | `ingredient-ref-roti`; `ingredient-ref-toasted-rice-powder` | Same | Pre-existing accent-folding co-result from `poudre de riz rôti`. |
| `paratha` | `ingredient-ref-paratha` | Same | Named product stays specific. |
| `chapati` / `chappati` | `ingredient-ref-atta`; `ingredient-ref-chapati-bread` | Same | Pre-existing flour/bread overlap through `farine à chapati` and `chappati flour`. |
| `chapatti` / `chapathi` | `ingredient-ref-chapati-bread` | Same | The exact OQLF-listed bread spellings. |
| `pita` / `pita bread` / `pain pita` | `ingredient-ref-pita-bread` | Same | Generic family does not appear for the named product query. |
| `lavash` / `pain lavash` | `ingredient-ref-lavash-bread` | Same | Named product stays specific. |
| `injera` / `injera bread` | `ingredient-ref-injera` | Same | Named product stays specific. |
| `bread roll` / `petit pain` | `ingredient-ref-bread-roll` | Same | Generic roll identity stays separate. |
| `sandwich bread` / `pain de mie` | `ingredient-ref-sandwich-bread` | Same | Molded loaf identity stays separate. |
| `sourdough bread` / `pain au levain` | `ingredient-ref-sourdough-bread` | Same | Finished bread stays separate from starter. |
| `bagel` / `baguel` / `beigel` / `bagels` | `ingredient-ref-bagel` | Same | Bagel identity remains separate from roll and other breads. |

Thus, adding only the family display and its grammatical plurals does not redirect a query for any listed named bread. Broadly adding `flatbread` as an alias to the named references would instead turn an unqualified family query into a multi-product result and is not recommended. The current `roti` and `chapati` co-results are present before this proposal and remain unchanged by it.

## Identity, measurement, and substitution limits

The proposed row represents only the unqualified prepared-bread family described by the OQLF. It is not a dough recipe, a `flatbread` form of each named reference, or a claim that a recipe's bread can be replaced by any family member. Leave these outside the row:

- `flat bread` / `flat pita` and pocketability variants; do not fold the OQLF's pita-specific wording into the family.
- `galette`, because it is context-limited French wording and already matches rice-paper sheets in the live picker.
- `naan`, `roti`, `paratha`, `chapati`, `pita`, `lavash`, `injera`, tortillas, focaccia, bread rolls, sandwich bread, sourdough bread, bagels, crackers, chips, and crumbs as aliases or forms.
- Ingredient measures, dimensions, count-to-mass data, package yields, densities, and conversions. No general value follows from the family definition, a recipe-specific yield, or a retailer's package.
- Global or contextual substitutions. Similar shape, thickness, service role, or family membership does not establish an interchangeable recipe ingredient.

## Evidence register

| ID | Source and supported claim | Limits |
|---|---|---|
| **WP03-G-FLATBREAD-20261013-R22-S01** | Office québécois de la langue française, [*pain plat* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/17488041/pain-plat), updated 2026. Gives *pain plat* as the privileged French term, English *flatbread*, the flour-and-water dough definition, variable thickness, and French plural *pains plats*. It lists tortillas and chapatis as usually unleavened examples and focaccia and some pitas as leavened examples; *galette* is used in some contexts, generally for an unleavened flatbread. | Defines a family, not a single formula, regional subtype, conversion, or substitution. |
| **WP03-G-FLATBREAD-20261013-R22-S02** | OQLF, [*pita* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/8872157/pita), updated 2012. Defines the named pita product and its preferred French names. Its English associated terms include *flat bread* and *flat pita*, with a note that these refer to bread that cannot be stuffed; French does not make that distinction. | Associated-term nuance is narrower than the one-word family term *flatbread*. It is not proposed as an alias in this packet. |
| **WP03-G-FLATBREAD-20261013-R22-S03** | OQLF, [*chapati* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/25399182/chapati), updated 2024. Defines chapati as a prepared flatbread and lists the English spellings `chapati`, `chapatti`, `chappati`, `chapathi`; its French plural is `chapatis`. | Supports the named chapati boundary only. Its evidence is already registered in the prepared-chapati review. |
| **WP03-G-FLATBREAD-20261013-R22-S04** | OQLF, [*atta* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26574258/atta), updated 2024. Defines atta as a flour input used for chapati, nan, and paratha, and distinguishes flour names including rare `farine à chapati` from prepared breads. | Flour and bread remain separate identities; this does not establish substitutions among breads. |
| **WP03-G-FLATBREAD-20261013-R22-S05** | OQLF, [*nan* (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/26530011/nan), updated 2017. Defines nan/naan as a distinct leavened Indian flatbread and lists both spellings in French and English. | Supports the named naan boundary only, not a synonym or substitution relationship with the generic family. |
| **R1** | Previously reviewed local and Québec terminology evidence: [naan, roti, and paratha](wp03-section-g-naan-roti-paratha-quebec-identity-review-20261011.md). | The current catalog already contains these separate identities; no new sources or aliases are proposed for them. |
| **R2** | Previously reviewed Québec and OQLF evidence: [prepared chapati](wp03-section-g-chapati-bread-identity-review-20261011.md). | The current catalog already contains chapati separately from atta and roti. |
| **R3** | Previously reviewed OQLF and Canadian product evidence: [pita and lavash](wp02-section-g-pita-lavash-boundary-review-20261010.md). | The current catalog already contains separate pita and lavash identities. |
| **R4** | Previously reviewed Canadian French, Québec French, and research evidence: [injera prepared-bread identity](wp03-injera-prepared-bread-identity-review-20261011.md). | The current identity is `injera`; `pain plat éthiopien` remains explanatory, not a global alias. |
| **R5** | Previously reviewed TERMIUM/OQLF and Québec product evidence: [bread-roll, sandwich-bread, and sourdough boundaries](wp03-section-g-rolls-sandwich-sourdough-boundary-review-20261011.md) and [integration batch](../batches/wp03-section-g-bread-products-integration-20261011/README.md). | The current identities are distinct from the flatbread family and from sourdough starter. |
| **R6** | Previously reviewed OQLF, Montréal maker, and Québec product evidence: [bagel identity](wp03-section-g-bagel-identity-review-20261013-round21.md) and [R21 integration batch](../batches/wp02-wp03-wp04-round21-gap-review-integration-20261013/README.md). | The package-level six / 410 g observation is specific to St-Viateur sesame bagels; it is not generalized here. |
| **R7** | Previously reviewed OQLF and Canadian manufacturer/product evidence: [corn and flour tortilla identities](wp03-section-g-rolls-sandwich-sourdough-boundary-review-20261011.md) and [pita and lavash boundary review](wp02-section-g-pita-lavash-boundary-review-20261010.md). | OQLF's family classification does not merge the active corn- and flour-tortilla references. |

## Audit checks

- Read the current plan entry, active reference and form JSON, generated picker catalog, related ledger records, and the previous Section G reviews/batches cited above.
- Audited all 114 manifest-listed recipe files, all 1,123 ingredient rows, and full recipe text for the reviewed family and named bread wording; no target ingredient row or text occurrence was found.
- Projected exact and plural queries through the current complete-phrase-first picker logic. No live app or emulator was run.
- Verified the proposed generic keys do not appear in the live references, forms, legacy import identities, or ledger record IDs.
- No Android, unit, instrumentation, or emulator tests were run; this is a proposal-only Markdown review and no database JSON changed.
- Proposal content is UTF-8 without BOM, has a final newline, and contains no mojibake markers.
