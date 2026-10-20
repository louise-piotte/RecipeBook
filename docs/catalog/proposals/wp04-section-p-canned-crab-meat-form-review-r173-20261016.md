# WP04 Section P — canned crab-meat form review (R173)

- **Review and source-access date:** 2026-10-16.
- **Recommendation:** Integrate one canned-product form under the existing `ingredient-ref-crab` (`crab meat / chair de crabe`). Do not create a second crab reference.
- **Scope:** Commercial canned crab meat as an explicit presentation of the existing edible crab-meat identity. Preserve species, cut, grade, packing medium, package, and drained state as product-specific details.
- **Proposal status:** Review only. The proposed form ID and new source IDs remain unallocated pending root review. No catalog JSON, shared ledger, plan, roadmap, batch README, or generated code was edited.

## Decision and boundary

The Section P checklist still leaves canned seafood product states open. R168 through R172 separately resolved canned tuna, smoked salmon, canned sardines, and canned salmon. None covers canned crab meat. The generic [preserved-fish boundary review](wp04-section-p-preserved-fish-product-state-boundary-review-20261012.md) correctly held universal canned forms; this proposal is for the one source-backed crab product state described below, not a new generic seafood rule. [Section P preservation checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5925)

Use `canned crab meat / chair de crabe en conserve` as a form under the existing generic crab-meat reference. The current OQLF entry already pairs `chair de crabe` with `crab meat` and says that the international-trade term designates canned white crab meat from several crab species. Current Québec retail and manufacturer evidence also show crab meat sold in the canned-food category. This is therefore an explicit state selection on the existing broad edible-product identity, not a second species-neutral identity. The French form label is a transparent descriptive qualifier built from OQLF’s preferred `chair de crabe` plus the retailer’s `aliments en conserve et en pot` category; it is not presented as an OQLF-approved term. [reused OQLF source `WP04-CRAB-MEAT-20261011-S01`; S01–S04]

Codex CXS 90-1981 defines canned crab meat as edible leg, claw, body, and shoulder meat from Brachyura and Lithodidae species, packed in hermetically sealed containers and processed to commercial sterility. It permits different presentations when the label describes them. This supports a canned-product state while leaving species and presentation unspecified in the catalog. Codex is an international standard, not Canadian law or evidence that every crab product sold as canned uses the same process, cut, packing medium, or drained state. [S01]

Keep the form separate from fresh or frozen whole crab, fresh-cooked crab meat, chilled pasteurized crab products, crab-flavoured pollock/surimi, fish balls, and composite crab dishes. Keep the current Jumbo Lump grade form independent and unchanged. Do not assign the Clover Leaf product’s *Portunus* sourcing to the generic row. The source-backed product example does not justify a universal crab species or a species-specific alias. [S01–S05; reused `WP04-CRAB-MEAT-20261011-S01`]

## Proposed delta

Add this form only under the active `ingredient-ref-crab`. Do not add an ingredient reference, alias to the base identity, legacy mapping, recipe link, measurement observation, conversion, yield, or substitution rule.

```json
{
  "id": "ingredient-form-crab-canned",
  "ingredientRefId": "ingredient-ref-crab",
  "formCode": "canned",
  "labelFr": "chair de crabe en conserve",
  "labelEn": "canned crab meat",
  "prepState": "canned",
  "matchTermsFr": [],
  "matchTermsEn": [],
  "densityGPerMl": null,
  "notesFr": "Forme commerciale de chair de crabe en conserve. Les sources couvrent plusieurs espèces et présentations; elles ne précisent pas une espèce, une coupe, un milieu de conditionnement ni un état égoutté communs. Aucune mesure, densité, conversion ou substitution n'est établie.",
  "notesEn": "Commercial canned crab-meat form. Sources cover multiple species and presentations; they do not establish a shared species, cut, packing medium, or drained state. No measure, density, conversion, or substitution is established.",
  "updatedAt": "2026-10-16T00:00:00Z"
}
```

The form record would carry `identityState: verified`, `measurementState: researched_no_supported_value`, and `substitutionResearchState: researched_no_supported_substitute`. The parent reference remains `ingredient-ref-crab`; no change is proposed to its name, aliases, null default density, or empty unit mappings.

## Live ownership and source-ID/URL audit

The review snapshot read from the live worktree has **1,548 references, 119 forms, 61 legacy candidates, 1,892 ledger records, 8,107 source entries, 6,932 distinct source IDs, and 5,728 distinct source URLs**. Exact-key review followed the lowercase/NFKD/accent-folding, ligature-folding, punctuation-normalizing, phrase-first behavior in [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt). It compared reference names and aliases, form labels and match terms, legacy candidate names and aliases, and ledger record IDs.

| Key or ID | Live owner | Proposed disposition |
|---|---|---|
| `ingredient-ref-crab` | Active `crab meat / chair de crabe`, category `PROTEIN`; no aliases, default density, or unit mappings. | Keep as the sole crab-meat identity. |
| `ingredient-form-crab-jumbo-lump` | Active `jumbo lump crab meat / chair de crabe en gros morceaux (jumbo lump)` under `ingredient-ref-crab`. | Keep as a grade form; it does not imply canned state. |
| Exact `canned crab meat`; `chair de crabe en conserve` | No exact active reference, form, or legacy key; no ledger candidate or record ID owns either phrase. | Allocate only as the proposed form label pair. |
| Exact `crab meat`; `chair de crabe` | Both owned by `ingredient-ref-crab`. | Do not move, duplicate, or make these phrases aliases of a new row. |
| `ingredient-form-crab-canned` | No active form, reference, legacy ID, or ledger record owns this ID. | Proposal-local form ID, unallocated. |
| Blue, Dungeness, Jonah, Northern stone, and stone crab; crab-flavoured pollock flakes | Separate active crab or crab-flavoured product references. | Preserve each species/product owner; add no crab species or surimi aliases. |
| Canned tuna, canned sardines, canned salmon | Separate product references integrated in R168, R170, and R172. | Keep as separate product groups. |

No separate `candidate-canned-crab-meat` exists in the live ledger or legacy file. New source IDs `WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S01` through `S05` were absent from the live ledger and proposal/batch archive. Their five exact URLs below were also absent from the ledger and proposal/batch archive. The existing OQLF URL is already owned by `WP04-CRAB-MEAT-20261011-S01` on `ingredient-ref-crab`; reuse that record rather than reissuing its source ID. These source IDs are proposal-local and remain unallocated until integration.

## Picker projection

The picker combines each reference’s names and aliases with attached form labels and match terms. Exact form phrases return the parent reference and can select a form hint; ordinary phrase matching continues to return references. Projection below uses the live 1,548-reference / 119-form catalog and the proposed form above.

| Query | Current projection | With proposed form | Effect |
|---|---|---|---|
| `canned crab meat` | No result | `ingredient-ref-crab` | Adds exact English search and the canned form hint. |
| `chair de crabe en conserve` | No result | `ingredient-ref-crab` | Adds exact descriptive French search and the canned form hint. |
| `crab meat` / `chair de crabe` | `ingredient-ref-crab` | Same single reference | Broad crab-meat queries remain one result and select no form hint. |
| `jumbo lump crab meat` / `chair de crabe en gros morceaux (jumbo lump)` | `ingredient-ref-crab` with the Jumbo Lump form hint | Same reference and same Jumbo Lump hint | Existing grade behavior stays intact. |
| `crab` / `crabe` | Seven current crab/crab-meat-related references | Same seven references | No extra reference or species result is created. |
| `en conserve` | Eleven current canned or preserved-product results | Twelve results, including `ingredient-ref-crab` | The broad French preservation search gains the crab-meat reference through its new form. |
| `canned` | Exact form query currently returns `ingredient-ref-chickpeas` | Same result | Existing exact-form priority is unchanged; no generic one-word `canned` match term is added. |

The proposal does not add `crabe`, `crab`, or the generic base terms as aliases. The form’s full qualified labels are the only new search terms.

## Manifest recipe demand

All **114** paths in [`manifest.v1.json`](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), every structured `ingredients[]` row (**1,123 total**), and decoded strings throughout those recipe files were scanned for canned-crab phrases and their French equivalents. The scan found **zero** canned-crab mentions and **zero** matching ingredient rows.

The only crab-meat ingredient line is recipe [019, `Boulettes de crabe / Crab Balls`](../../../app/src/main/assets/seed/bundled-library/recipes/019-boulettes-de-crabe-crab-balls-135813a6-75e2-4596-8c71-ffd450fab0ca.v1.json), row 8: `1 lb jumbo lump crab meat`, linked to `ingredient-ref-crab` and `ingredient-form-crab-jumbo-lump`. It does not state canned. The recipe title describes the finished dish, not another crab ingredient. Keep its row, amount, and links unchanged; no recipe link to the canned form is proposed.

## Forms, numeric evidence, and substitutions

- **Form boundary:** Add only the canned form described above. Do not encode drained, rinsed, water-packed, brine-packed, oil-packed, lump, claw, body, or pasteurized states. Codex allows distinct product presentations and the current maker product names differ; those qualifiers remain product-specific. Do not combine canned state with the Jumbo Lump grade based on the single bundled recipe.
- **Numbers:** Clover Leaf currently lists `1/4 cup (55 g)` as a nutrition serving for its named crab products. That is a product-specific nutrition basis, not a general density or recipe conversion. Metro’s Québec listing gives a 120 g package; the manufacturer recipe uses three 120 g cans drained in that one recipe. Net package mass, a nutrition serving, and a recipe’s drained cans do not establish drained edible yield, a general `can`-to-mass conversion, or cup density. Record no default density, unit mapping, portion measure, package yield, or measurement observation. [S02–S05]
- **Substitutions:** Clover Leaf’s mini-croquette recipe permits either of two Clover Leaf canned crab products in its own formula. This is product- and recipe-specific guidance, not a general substitution rule. Add no substitution between canned crab, fresh-cooked/frozen crab meat, Jumbo Lump, whole crab, crab species, imitation crab, or crab-flavoured pollock. The 114-recipe corpus supplies no dish-specific substitution context. [S05]

## Source register

New sources were checked on 2026-10-16. S01–S05 are proposed source IDs only; they are not registered in the shared ledger. Exact URL ownership was checked as described above.

| Source ID | Source | Evidence and limits |
|---|---|---|
| **WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S01** | FAO/WHO Codex Alimentarius, [Standard for Canned Crab Meat, CXS 90-1981](https://www.fao.org/fao-who-codexalimentarius/sh-proxy/es/?lnk=1&url=https%253A%252F%252Fworkspace.fao.org%252Fsites%252Fcodex%252FStandards%252FCXS%2B90-1981%252FCXS_090e.pdf), current copy amended 2026, §§1–2 and 7. | Defines the canned product’s crab-meat parts, broad eligible taxa, commercial-sterility process, presentation flexibility, and name `crab` or `crabmeat` with additional descriptive terms when needed. International standard only; not Canadian law, a Québec common-name ruling, or support for a measure. |
| **WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S02** | Clover Leaf, [Chair de crabe 15% de chair de pattes](https://www.cloverleaf.ca/fr/produits/chair-de-crabe-15-de-chair-de-pattes-clover-leaf/), current French product page. | Supports current Québec-facing product wording, ingredients, and this SKU’s stated sourcing (*Portunus* spp. / *P. pelagicus*). Its `1/4 cup (55 g)` nutrition basis and species are product-specific; the page does not define the generic crab species or all canned presentations. |
| **WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S03** | Clover Leaf, [Chunk Crabmeat](https://www.cloverleaf.ca/en/products/chunk-crabmeat/), current English product page. | Supports a current chunk white-crabmeat product and its own source-reported ingredients, species, and `1/4 cup (55 g)` nutrition basis. Product details do not generalize to every canned crab product or a kitchen conversion. |
| **WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S04** | Metro Québec, [Chair de crabe Clover Leaf, 120 g, product 061362444901](https://www.metro.ca/epicerie-en-ligne/allees/garde-manger/aliments-en-conserve-et-en-pot/poissons-et-fruits-de-mer/chair-de-crabe/p/061362444901), product path under `aliments en conserve et en pot`. | Supports the bilingual Québec retail product name, package listing, and canned-food aisle. The live page can show store-specific stock; no general availability claim is made. Package weight and product listing do not establish drained weight or a measure. |
| **WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-S05** | Clover Leaf, [Mini-croquettes de crabe](https://www.cloverleaf.ca/fr/recette/mini-croquettes-de-crabe/), current maker recipe. | Uses three 120 g cans, drained, of either chunk crabmeat or the maker’s 15% leg-meat crab product. This maker formula supports only its stated products and dish; it is neither a bundled recipe nor a transferable conversion/substitution rule. |
| **Reused `WP04-CRAB-MEAT-20261011-S01`** | OQLF, [chair de crabe (GDT)](https://vitrinelinguistique.oqlf.gouv.qc.ca/fiche-gdt/fiche/9488141/chair-de-crabe), updated 1983. | Existing source ID and URL owner on `ingredient-ref-crab`. Defines the preferred French product term and English `crab meat`, and says the international-trade term designates canned white meat across several crab species. Old terminology entry; it supports the broad term and canned-product relationship, not modern Canadian package requirements, species, or measures. |
| **WP04-SECTIONP-CRAB-CANNED-FORM-R173-20261016-A01** | Read-only audit of the [Section P checklist](../../RecipeBook-global-ingredient-catalog-plan.txt#L5925), [references](../../../app/src/main/assets/seed/bundled-library/ingredient-references.v1.json), [forms](../../../app/src/main/assets/seed/bundled-library/ingredient-forms.v1.json), [legacy identities](../legacy-import-identities.v1.json), [research ledger](../research-ledger.v1.json), [manifest](../../../app/src/main/assets/seed/bundled-library/manifest.v1.json), all manifest-listed recipes, [`IngredientSearch.kt`](../../../app/src/main/java/app/recipebook/domain/localization/IngredientSearch.kt), and the proposal/batch archive. | Proposal-local audit label only. Supports the ownership, picker, recipe-demand, form/numeric, and substitution checks described above; it is not a ledger source record. |

## Final disposition

**Integrate** `ingredient-form-crab-canned` under `ingredient-ref-crab`. This gives explicit canned-crab phrase search and a canned form hint while preserving one generic crab-meat reference, the current Jumbo Lump recipe link, and all species-specific crab identities. Add no ingredient reference, alias, recipe link, measure, density, unit mapping, conversion, yield, or substitution. Section P’s broader preservation checklist remains open for other exact product states. This is a proposal document only; no app, unit, instrumentation, build, or emulator tests were run.
